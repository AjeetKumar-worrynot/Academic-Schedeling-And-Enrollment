function showCourses() {
    fetch("http://localhost:8080/courses") // this is the API endpoint
    .then((response) => response.json())
    .then((Data) => {
        const connect = document.getElementById("coursetables");
        Data.forEach(course => {
            var row = `<tr>
                <td>${course.courseId}</td>
                <td>${course.courseName}</td>
                <td>${course.trainer}</td>
                <td>${course.durationInWeeks}</td>
            </tr>`;
            connect.innerHTML += row; // Append the row to 'connect'
        });
    })
    .catch((error) => {
        console.error("Error fetching courses:", error);
    });
}

function  showStudent() {
    fetch("http://localhost:8080/courses/enrolled") // this is the API endpoint
    .then((response) => response.json())
    .then((Data) => {
        const connect = document.getElementById("Students");
        Data.forEach(course => {
            var row = `<tr>
                <td>${course.name}</td>
                <td>${course.emailId}</td>
                <td>${course.courseName}</td>
                
            </tr>`;
            connect.innerHTML += row; // Append the row to 'connect'
        });
    })
    .catch((error) => {
        console.error("Error fetching courses:", error);
    });
}
