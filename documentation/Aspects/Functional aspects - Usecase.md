The use cases are discussed as described in the requirements document.

## Register account

- First go to the [registration page](https://localhost/register) and create a user account.
- There will be checks on every input field.
- Make sure that all the validations are passed.
- The validations that is being checked are
	- All field should be required.
	- Username should be between 6 and 32 characters.
	- Password must greater than 8 characters and should include one lowercase letter, one uppercase letter, one special character, one number.
	- Valid email address should be provided
	- Valid contact information should be provided.
	- Password and Confirm Password should match.
	
- The user cannot be created if the validations are not passed.
- After submitting the registration form, a verification link will be sent to the specified email.
- Kindly access that link to complete the registration process.
- If a user tries to login without accessing the confirmation link, then it is denied.
- The password is stored as a hash instead of the original password.
- For starters, create one user with role JOB_SEEKER and one user account with COMPANY_ADMIN role to start using the application.

## User Login

- After registration, the user can be logged in by navigating to [login page](https://localhost/login).
- If invalid credentials are passed, the login is denied.
- If a new account is to be created, the user can click the link ‘Create new Account’ to navigate to the registration page.
- If a user tries to access any page other than login, then the application will redirect the user to the login page.

## Logout user

- After login, if it’s a job_seeker, the user will be redirected to [job_seeker home page](https://localhost/seeker/index) and if the user is company admin, the user will be redirected to [company home page](https://localhost/company/index).
- There will be a logout option inside the menu for both home pages, the user can click on that option to logout.

## Edit Profile

- There will be a profile option inside the menu. 
- The user can click that option to view their profile.
- In the profile section, the user can change username and password. If the user is a job seeker, then the user can edit job seeker details. If the user is company admin, then the user can edit company details.
- All the validations used in registration form are used here as well.

## Job Seeker - search jobs

- The job seeker can search for jobs by clicking on the job menu in the job seeker [home page](https://localhost/seeker/index).
- The job seeker can view jobs posted by all companies.
- The job seeker can search for jobs by entering the search keyword in the search box.
- The search keyword is searched in company name, title, location and the result will be displayed.
- In order to view all job details, the view button of a particular job is clicked.
- Then the job detail of that particular job is displayed.

## Job Seeker - Apply jobs

- After viewing job details like in previous use cases, the job seeker can start the job application by clicking the apply button.
- Then the job seeker will be asked questions to be answered for that particular job.
- After clicking next, the job seeker will be asked to upload documents required by the job.
- The jobs used here are the documents uploaded in the document section.
- We’ll see this use case in upcoming section.
- After uploading a document, the user should click submit to complete the job application.
- The user can stop this process at any step by clicking the back button.
- The job seeker can apply for a job only once. If the job seeker tries to apply again, an error message is displayed.

## Job Seeker - View job application

- After submitting the job application, the job seeker can view the application by clicking on the job application menu in the side-menu.
- In this section, the job seeker can view all the applications that the job seeker created.
- The job seeker can view the status of each application. If the company admin changes the application status, then it is reflected here instantly.
- The job seeker can withdraw the application if required and it will be deleted from our system.

## Job Seeker - Manage Documents

-  After login, the job seeker should click on the document menu in the side-menu to navigate to the document section.
- The job seeker can upload document by clicking on “Add document” button and uploading a file.
- The following security checks are implemented in file upload
	- The path traversal file names are normalized so that path traversal attack cannot be executed.
	- File size should be less than 1MB.
	- Only pdf and docx files are supported.
	- Job seekers can upload up to a maximum of 5 files.
	- No two files with the same name can exist.

## Company Admin - Create/Update Jobs

- After login, the company admin should click on the jobs menu in the side-bar menu to create a job.
- The admin should enter all the necessary information and click save.
- There are validations for this form as well just like registration form.
- The admin can add questions for this particular job by clicking on the “Add question” button.
- Then the admin can click on “View jobs” to view and update the created job.
- The user can click on the delete button to delete the current job.
- The user can update the job by clicking on view details, changing the job details and clicking on the update button.

## Company Admin - Review job application

- In order to view a job application ,the user should click on the “View jobs” menu and click “View job application” for any job.
- After clicking view Job application, the admin can be able to view basic application details like job seeker name, application status. In order to view full application details, “view details” button on a particular application should be clicked.
- After viewing job application details, the admin can change the status of the application to either ACCEPTED, REJECTED or WAITLISTED.
- The status updated here will be displayed to the corresponding job seeker.