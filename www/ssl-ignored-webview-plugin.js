//var exec = require('cordova/exec');

window.SSLIgnoredWebView = function(arg0, success, error) {
    exec(success, error, "SSLIgnoredWebView", "SSLIgnoredWebView", [arg0]);
};
