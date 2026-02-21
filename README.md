
# 🍔 KhauGalli - Full Stack Online Food App

A powerful and responsive food ordering platform. This project features a **Spring Boot** backend for business logic and a **React.js** frontend for a modern user experience.

---

## 📂 Project Structure

- **`BackendOnlineFood/`**: Spring Boot application (REST API).
- **`frontend-react/`**: React.js application (UI with Tailwind CSS).
- **`images/`**: Project screenshots and assets.

---

## 🏗️ Tech Stack


| Component | Technologies Used |
| :--- | :--- |
| **Frontend** | React.js, JavaScript, Tailwind CSS |
| **Backend** | Java, Spring Boot, Maven |
| **API** | RESTful Services |
| **Database** | MySQL / PostgreSQL |

---

## 🚀 Key Features

- ✅ **Dynamic Menu**: Real-time browsing of food categories and items.
- ✅ **Responsive UI**: Optimized for mobile, tablet, and desktop views.
- ✅ **Secure API**: Robust backend communication using Spring Boot.
- ✅ **Fast Styling**: Modern UI components built with Tailwind CSS.

---

## 🛠️ Setup & Installation

### 1. Backend Setup (Spring Boot)
1. Navigate to the backend folder:
   ```bash
   cd BackendOnlineFood

2. Configure your database in src/main/resources/application.properties.
   Run the application:
   ```bash
   mvn spring-boot:run

Open http://localhost/your-project-folder/ in a browser.


## 🛫 Deployment
When you are done with the setup, you should host your website online.
We highly recommend to read through the [Deploying on GitHub Pages](https://create-react-app.dev/docs/deployment/#github-pages) docs for React.

#### Configuring GitHub Actions (Recommended)
First you should enable, GitHub Actions for the repository you use.

The Profile and the Repository information from GitHub is only created at the time of deploy and the site needs to be redeployed if those information needs to be updated. So, a configurable [CRON Job](https://docs.github.com/en/actions/reference/events-that-trigger-workflows#scheduled-events) is setup which deploys your site every week, so that once you update your profile on GitHub it is shown on your portfolio. You can also trigger it manually using `workflow_dispatch` event, see [this guide](https://github.blog/changelog/2020-07-06-github-actions-manual-triggers-with-workflow_dispatch) on how to do that.

- When you are done with the configuration, we highly recommend to read through the [GitHub Actions Configuring a workflow](https://docs.github.com/en/actions/configuring-and-managing-workflows/configuring-a-workflow) docs.

#### Deploying to GitHub Pages

This section guides you to deploy your portfolio on GitHub pages.

- Navigate to `package.json` and enter your domain name instead of `https://developerfolio.js.org/` in `homepage` variable. For example, if you want your site to be `https://<your-username>.github.io/developerFolio`, add the same to the homepage section of `package.json`.

- In short you can also add `/devloperFolio` to `package.json` as both are exactly same. Upon doing so, you tell `create-react-app` to add the path assets accordingly.

- Optionally, configure the domain. You can configure a custom domain with GitHub Pages by adding a `CNAME` file to the `public/` folder.

- Follow through the guide to setup GitHub pages from the official CRA docs [here](https://create-react-app.dev/docs/deployment/#github-pages).

## 🎯 Future Enhancements
🏆 Blog Section for content sharing.

🎨 Theme Customization for better UI/UX.

🌍 Multilingual Support for global users.

## 👨‍💻 Author
Atharva Malvade
🔗 Portfolio
📧 Email
📌 GitHub