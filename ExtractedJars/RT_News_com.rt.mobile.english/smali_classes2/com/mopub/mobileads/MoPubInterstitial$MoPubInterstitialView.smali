.class public Lcom/mopub/mobileads/MoPubInterstitial$MoPubInterstitialView;
.super Lcom/mopub/mobileads/MoPubView;
.source "MoPubInterstitial.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/mopub/mobileads/MoPubInterstitial;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "MoPubInterstitialView"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/mopub/mobileads/MoPubInterstitial;


# direct methods
.method public constructor <init>(Lcom/mopub/mobileads/MoPubInterstitial;Landroid/content/Context;)V
    .locals 0

    .line 221
    iput-object p1, p0, Lcom/mopub/mobileads/MoPubInterstitial$MoPubInterstitialView;->this$0:Lcom/mopub/mobileads/MoPubInterstitial;

    .line 222
    invoke-direct {p0, p2}, Lcom/mopub/mobileads/MoPubView;-><init>(Landroid/content/Context;)V

    const/4 p1, 0x0

    .line 223
    invoke-virtual {p0, p1}, Lcom/mopub/mobileads/MoPubInterstitial$MoPubInterstitialView;->setAutorefreshEnabled(Z)V

    return-void
.end method


# virtual methods
.method protected adFailed(Lcom/mopub/mobileads/MoPubErrorCode;)V
    .locals 2

    .line 266
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubInterstitial$MoPubInterstitialView;->this$0:Lcom/mopub/mobileads/MoPubInterstitial;

    invoke-static {v0}, Lcom/mopub/mobileads/MoPubInterstitial;->access$100(Lcom/mopub/mobileads/MoPubInterstitial;)Lcom/mopub/mobileads/MoPubInterstitial$InterstitialAdListener;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 267
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubInterstitial$MoPubInterstitialView;->this$0:Lcom/mopub/mobileads/MoPubInterstitial;

    invoke-static {v0}, Lcom/mopub/mobileads/MoPubInterstitial;->access$100(Lcom/mopub/mobileads/MoPubInterstitial;)Lcom/mopub/mobileads/MoPubInterstitial$InterstitialAdListener;

    move-result-object v0

    iget-object v1, p0, Lcom/mopub/mobileads/MoPubInterstitial$MoPubInterstitialView;->this$0:Lcom/mopub/mobileads/MoPubInterstitial;

    invoke-interface {v0, v1, p1}, Lcom/mopub/mobileads/MoPubInterstitial$InterstitialAdListener;->onInterstitialFailed(Lcom/mopub/mobileads/MoPubInterstitial;Lcom/mopub/mobileads/MoPubErrorCode;)V

    :cond_0
    return-void
.end method

.method public getAdFormat()Lcom/mopub/common/AdFormat;
    .locals 1

    .line 228
    sget-object v0, Lcom/mopub/common/AdFormat;->INTERSTITIAL:Lcom/mopub/common/AdFormat;

    return-object v0
.end method

.method protected loadCustomEvent(Ljava/lang/String;Ljava/util/Map;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 233
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubInterstitial$MoPubInterstitialView;->mAdViewController:Lcom/mopub/mobileads/AdViewController;

    if-nez v0, :cond_0

    return-void

    .line 237
    :cond_0
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string p1, "Couldn\'t invoke custom event because the server did not specify one."

    .line 238
    invoke-static {p1}, Lcom/mopub/common/logging/MoPubLog;->d(Ljava/lang/String;)V

    .line 239
    sget-object p1, Lcom/mopub/mobileads/MoPubErrorCode;->ADAPTER_NOT_FOUND:Lcom/mopub/mobileads/MoPubErrorCode;

    invoke-virtual {p0, p1}, Lcom/mopub/mobileads/MoPubInterstitial$MoPubInterstitialView;->loadFailUrl(Lcom/mopub/mobileads/MoPubErrorCode;)V

    return-void

    .line 243
    :cond_1
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubInterstitial$MoPubInterstitialView;->this$0:Lcom/mopub/mobileads/MoPubInterstitial;

    invoke-static {v0}, Lcom/mopub/mobileads/MoPubInterstitial;->access$000(Lcom/mopub/mobileads/MoPubInterstitial;)Lcom/mopub/mobileads/CustomEventInterstitialAdapter;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 244
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubInterstitial$MoPubInterstitialView;->this$0:Lcom/mopub/mobileads/MoPubInterstitial;

    invoke-static {v0}, Lcom/mopub/mobileads/MoPubInterstitial;->access$000(Lcom/mopub/mobileads/MoPubInterstitial;)Lcom/mopub/mobileads/CustomEventInterstitialAdapter;

    move-result-object v0

    invoke-virtual {v0}, Lcom/mopub/mobileads/CustomEventInterstitialAdapter;->invalidate()V

    :cond_2
    const-string v0, "Loading custom event interstitial adapter."

    .line 247
    invoke-static {v0}, Lcom/mopub/common/logging/MoPubLog;->d(Ljava/lang/String;)V

    .line 249
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubInterstitial$MoPubInterstitialView;->this$0:Lcom/mopub/mobileads/MoPubInterstitial;

    iget-object v1, p0, Lcom/mopub/mobileads/MoPubInterstitial$MoPubInterstitialView;->this$0:Lcom/mopub/mobileads/MoPubInterstitial;

    iget-object v2, p0, Lcom/mopub/mobileads/MoPubInterstitial$MoPubInterstitialView;->mAdViewController:Lcom/mopub/mobileads/AdViewController;

    invoke-virtual {v2}, Lcom/mopub/mobileads/AdViewController;->getBroadcastIdentifier()J

    move-result-wide v4

    iget-object v2, p0, Lcom/mopub/mobileads/MoPubInterstitial$MoPubInterstitialView;->mAdViewController:Lcom/mopub/mobileads/AdViewController;

    invoke-virtual {v2}, Lcom/mopub/mobileads/AdViewController;->getAdReport()Lcom/mopub/common/AdReport;

    move-result-object v6

    move-object v2, p1

    move-object v3, p2

    invoke-static/range {v1 .. v6}, Lcom/mopub/mobileads/factories/CustomEventInterstitialAdapterFactory;->create(Lcom/mopub/mobileads/MoPubInterstitial;Ljava/lang/String;Ljava/util/Map;JLcom/mopub/common/AdReport;)Lcom/mopub/mobileads/CustomEventInterstitialAdapter;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/mopub/mobileads/MoPubInterstitial;->access$002(Lcom/mopub/mobileads/MoPubInterstitial;Lcom/mopub/mobileads/CustomEventInterstitialAdapter;)Lcom/mopub/mobileads/CustomEventInterstitialAdapter;

    .line 255
    iget-object p1, p0, Lcom/mopub/mobileads/MoPubInterstitial$MoPubInterstitialView;->this$0:Lcom/mopub/mobileads/MoPubInterstitial;

    invoke-static {p1}, Lcom/mopub/mobileads/MoPubInterstitial;->access$000(Lcom/mopub/mobileads/MoPubInterstitial;)Lcom/mopub/mobileads/CustomEventInterstitialAdapter;

    move-result-object p1

    iget-object p2, p0, Lcom/mopub/mobileads/MoPubInterstitial$MoPubInterstitialView;->this$0:Lcom/mopub/mobileads/MoPubInterstitial;

    invoke-virtual {p1, p2}, Lcom/mopub/mobileads/CustomEventInterstitialAdapter;->setAdapterListener(Lcom/mopub/mobileads/CustomEventInterstitialAdapter$CustomEventInterstitialAdapterListener;)V

    .line 256
    iget-object p1, p0, Lcom/mopub/mobileads/MoPubInterstitial$MoPubInterstitialView;->this$0:Lcom/mopub/mobileads/MoPubInterstitial;

    invoke-static {p1}, Lcom/mopub/mobileads/MoPubInterstitial;->access$000(Lcom/mopub/mobileads/MoPubInterstitial;)Lcom/mopub/mobileads/CustomEventInterstitialAdapter;

    move-result-object p1

    invoke-virtual {p1}, Lcom/mopub/mobileads/CustomEventInterstitialAdapter;->loadInterstitial()V

    return-void
.end method

.method protected trackImpression()V
    .locals 1

    const-string v0, "Tracking impression for interstitial."

    .line 260
    invoke-static {v0}, Lcom/mopub/common/logging/MoPubLog;->d(Ljava/lang/String;)V

    .line 261
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubInterstitial$MoPubInterstitialView;->mAdViewController:Lcom/mopub/mobileads/AdViewController;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/mopub/mobileads/MoPubInterstitial$MoPubInterstitialView;->mAdViewController:Lcom/mopub/mobileads/AdViewController;

    invoke-virtual {v0}, Lcom/mopub/mobileads/AdViewController;->trackImpression()V

    :cond_0
    return-void
.end method
