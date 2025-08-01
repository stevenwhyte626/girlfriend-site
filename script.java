// Create floating hearts with random colors
function createHeart() {
    const heart = document.createElement("div");
    heart.classList.add("heart");
    heart.innerText = "❤️";

    const colors = ["#e91e63", "#9c27b0", "#2196f3"];
    heart.style.color = colors[Math.floor(Math.random() * colors.length)];
    heart.style.left = Math.random() * 100 + "vw";
    heart.style.fontSize = Math.random() * 20 + 15 + "px";
    document.body.appendChild(heart);

    setTimeout(() => {
        heart.remove();
    }, 4000);
}

// Confetti animation
function launchConfetti() {
    for (let i = 0; i < 50; i++) {
        const confetti = document.createElement("div");
        confetti.innerText = "🎉";
        confetti.style.position = "fixed";
        confetti.style.left = Math.random() * 100 + "vw";
        confetti.style.top = "-10px";
        confetti.style.fontSize = Math.random() * 20 + 15 + "px";
        confetti.style.animation = `fall ${Math.random() * 3 + 2}s linear`;
        document.body.appendChild(confetti);

        setTimeout(() => confetti.remove(), 4000);
    }
}

// Trigger hearts & confetti for 5 seconds
function triggerSurpriseEffects() {
    const heartInterval = setInterval(createHeart, 200);
    launchConfetti();

    setTimeout(() => {
        clearInterval(heartInterval);
    }, 5000);
}
