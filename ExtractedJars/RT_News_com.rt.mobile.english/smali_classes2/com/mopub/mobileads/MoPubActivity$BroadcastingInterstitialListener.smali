.class Lcom/mopub/mobileads/MoPubActivity$BroadcastingInterstitialListener;
.super Ljava/lang/Object;
.source "MoPubActivity.java"

# interfaces
.implements Lcom/mopub/mobileads/CustomEventInterstitial$CustomEventInterstitialListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/mopub/mobileads/MoPubActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "BroadcastingInterstitialListener"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/mopub/mobileads/MoPubActivity;


# direct methods
.method constructor <init>(Lcom/mopub/mobileads/MoPubActivity;)V
    .locals 0

    .line 126
    iput-object p1, p0, Lcom/mopub/mobileads/MoPubActivity$BroadcastingInterstitialListener;->this$0:Lcom/mopub/mobileads/MoPubActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onInterstitialClicked()V
    .locals 4

    .line 144
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubActivity$BroadcastingInterstitialListener;->this$0:Lcom/mopub/mobileads/MoPubActivity;

    iget-object v1, p0, Lcom/mopub/mobileads/MoPubActivity$BroadcastingInterstitialListener;->this$0:Lcom/mopub/mobileads/MoPubActivity;

    invoke-virtual {v1}, Lcom/mopub/mobileads/MoPubActivity;->getBroadcastIdentifier()Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    const-string v3, "com.mopub.action.interstitial.click"

    invoke-static {v0, v1, v2, v3}, Lcom/mopub/mobileads/EventForwardingBroadcastReceiver;->broadcastAction(Landroid/content/Context;JLjava/lang/String;)V

    return-void
.end method

.method public onInterstitialDismissed()V
    .locals 0

    return-void
.end method

.method public onInterstitialFailed(Lcom/mopub/mobileads/MoPubErrorCode;)V
    .locals 3

    .line 134
    iget-object p1, p0, Lcom/mopub/mobileads/MoPubActivity$BroadcastingInterstitialListener;->this$0:Lcom/mopub/mobileads/MoPubActivity;

    iget-object v0, p0, Lcom/mopub/mobileads/MoPubActivity$BroadcastingInterstitialListener;->this$0:Lcom/mopub/mobileads/MoPubActivity;

    invoke-virtual {v0}, Lcom/mopub/mobileads/MoPubActivity;->getBroadcastIdentifier()Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    const-string v2, "com.mopub.action.interstitial.fail"

    invoke-static {p1, v0, v1, v2}, Lcom/mopub/mobileads/EventForwardingBroadcastReceiver;->broadcastAction(Landroid/content/Context;JLjava/lang/String;)V

    .line 135
    iget-object p1, p0, Lcom/mopub/mobileads/MoPubActivity$BroadcastingInterstitialListener;->this$0:Lcom/mopub/mobileads/MoPubActivity;

    invoke-virtual {p1}, Lcom/mopub/mobileads/MoPubActivity;->finish()V

    return-void
.end method

.method public onInterstitialLoaded()V
    .locals 2

    .line 129
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubActivity$BroadcastingInterstitialListener;->this$0:Lcom/mopub/mobileads/MoPubActivity;

    invoke-static {v0}, Lcom/mopub/mobileads/MoPubActivity;->access$000(Lcom/mopub/mobileads/MoPubActivity;)Lcom/mopub/mobileads/HtmlInterstitialWebView;

    move-result-object v0

    sget-object v1, Lcom/mopub/mobileads/BaseInterstitialActivity$JavaScriptWebViewCallbacks;->WEB_VIEW_DID_APPEAR:Lcom/mopub/mobileads/BaseInterstitialActivity$JavaScriptWebViewCallbacks;

    invoke-virtual {v1}, Lcom/mopub/mobileads/BaseInterstitialActivity$JavaScriptWebViewCallbacks;->getUrl()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/mopub/mobileads/HtmlInterstitialWebView;->loadUrl(Ljava/lang/String;)V

    return-void
.end method

.method public onInterstitialShown()V
    .locals 0

    return-void
.end method

.method public onLeaveApplication()V
    .locals 0

    return-void
.end method
