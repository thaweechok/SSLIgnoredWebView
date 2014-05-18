//var exec = require('cordova/exec');

window.SSLIgnoredWebView = function(arg0, success, error) {
    cordova.exec(success, error, "SSLIgnoredWebView", "init", [arg0]);
};
