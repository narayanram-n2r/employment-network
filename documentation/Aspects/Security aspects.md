
## Authentication

- The authentication of the application is made secure by enforcing complex passwords and storing password hash instead of original password.
- Changing password and Registration process is done in a secure manner by sending a confirmation link to the user email.
- Only 5 failed attempts are allowed for a user before a successful login. In this way, Brute force authentication is prevented.

## Authorization

- Authorization check is established in every request to ensure that every user is authorized to the displayed data.
- Some of the authorization checks are
     - A job seeker cannot see other user’s document
     - Job seeker cannot access company URL and company admin cannot access job seeker URL.
     - Company admin cannot see other company’s jobs.
     - Job seekers cannot see other user’s job applications.

## HTTPS

- All requests are served in HTTPS requests.

## Security headers

- Security headers like content secure policy, xssProtection are added.

## Prevention of CSRF
- In order to block CSRF attacks, the Synchronizer token algorithm is used in this application.

## Prevention of XSS attack 
- All the inputs are escaped and sanitized before storing it in server.