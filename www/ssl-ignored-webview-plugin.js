var exec = require('cordova/exec');

exports.SSLIgnoredWebView = function(arg0, success, error) {
    exec(success, error, "ssl-ignored-webview-plugin", "SSLIgnoredWebView", [arg0]);
};
