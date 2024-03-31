// 삭제 기능
const deleteButton = document.getElementById('delete-btn');

if (deleteButton) {
    deleteButton.addEventListener('click', event => {
        let id = document.getElementById('project-id').value;
        fetch(`/api/projects/${id}`, {
            method: 'DELETE'
        })
            .then(() => {
                alert('삭제 완료');
                location.replace('/projects');
            });
    });
}

// 수정 기능
const modifyButton = document.getElementById('modify-btn');

if (modifyButton) {
    modifyButton.addEventListener('click', event => {
        let params = new URLSearchParams(location.search);
        let id = params.get('id');

        fetch(`/api/projects/${id}`, {
            method: 'PUT',
            headers: {
                "Content-Type": "application/json",
            },
            body: JSON.stringify({
                title: document.getElementById('title').value,
                image: document.getElementById('image').value,
                result: document.getElementById('result').value,
                github: document.getElementById('github').value,
                content: document.getElementById('content').value
            })
        })
            .then(() => {
                alert('수정 완료');
                location.replace(`/projects`);
            });
    });
}

// 생성 기능
const createButton = document.getElementById('create-btn');

if (createButton) {
    createButton.addEventListener('click', event => {
        fetch('/api/projects', {
            method: 'POST',
            headers: {
                "Content-Type": "application/json",
            },
            body: JSON.stringify({
                title: document.getElementById('title').value,
                image: document.getElementById('image').value,
                result: document.getElementById('result').value,
                github: document.getElementById('github').value,
                content: document.getElementById('content').value
            })
        })
            .then(() => {
                alert('등록 완료');
                location.replace('/projects');
            });
    });
}
