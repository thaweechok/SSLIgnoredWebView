var exec = require('cordova/exec');

function SSLIgnoredWebView(){}

SSLIgnoredWebView.prototype.init = function(arg0, success, error) {
    exec(success, error, "SSLIgnoredWebView", "init", [arg0]);
};

var sslWebView = new SSLIgnoredWebView();
module.exports = sslWebView;