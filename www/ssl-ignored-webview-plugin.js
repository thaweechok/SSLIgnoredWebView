var exec = require('cordova/exec');

exports.SSLIgnoredWebView = function(arg0, success, error) {
    exec(success, error, "SSLIgnoredWebView", "SSLIgnoredWebView", [arg0]);
};
