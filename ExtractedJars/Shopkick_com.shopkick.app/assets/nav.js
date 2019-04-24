/**
 * Adds Button SDK event listeners for JS-based navigation. Wraps methods to update back stack in
 * order to notify the Button SDK then invokes original method.
 *
 * @see com.usebutton.sdk.internal.web.ButtonJavascriptInterface.java
 */

(function(history) {

    function trackNavigateEvent() {
        ButtonSdk.onNavigation();
    };

    var originalPushState = history.pushState;
    history.pushState = function(obj, title, url) {
        originalPushState.apply(history, arguments);
        trackNavigateEvent();
    };

    window.addEventListener('popstate', function(e) {
        trackNavigateEvent();
    });

})(window.history);

if (!btnFinishEventEmitted) {
    ButtonSdk.onPageFinished(window.location.href);
    var btnFinishEventEmitted = true;
}
