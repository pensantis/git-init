var emails = [
  "sergio.gouvei@academiadecodigo.org",
  "jorge.antunes@academiadecodigo.org",
  "pedro.antoninho@academiadecodigo.org",
  "123sdgj1g@com",
  "balbalbal..asdsad@academiadecodigo.org",
  "@ntunes@gmail.com",
  "sadasdasd.com"
];

var validEmails = [];
var emailValidator = new RegExp("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\.[A-Z]{2,}$", "i");

for(var i = 0; i< emails.length; i++){
  if(emails[i].match(emailValidator)){
    validEmails.push(emails[i]);

  }
}


console.log(validEmails);
