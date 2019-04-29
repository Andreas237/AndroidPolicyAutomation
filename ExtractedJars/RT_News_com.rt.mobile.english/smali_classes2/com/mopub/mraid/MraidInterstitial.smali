.class Lcom/mopub/mraid/MraidInterstitial;
.super Lcom/mopub/mobileads/ResponseBodyInterstitial;
.source "MraidInterstitial.java"


# instance fields
.field private mHtmlData:Ljava/lang/String;


# direct methods
.method constructor <init>()V
    .locals 0

    .line 13
    invoke-direct {p0}, Lcom/mopub/mobileads/ResponseBodyInterstitial;-><init>()V

    return-void
.end method


# virtual methods
.method protected extractExtras(Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string v0, "Html-Response-Body"

    .line 18
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, Lcom/mopub/mraid/MraidInterstitial;->mHtmlData:Ljava/lang/String;

    return-void
.end method

.method protected preRenderHtml(Lcom/mopub/mobileads/CustomEventInterstitial$CustomEventInterstitialListener;)V
    .locals 2
    .param p1    # Lcom/mopub/mobileads/CustomEventInterstitial$CustomEventInterstitialListener;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 24
    iget-object v0, p0, Lcom/mopub/mraid/MraidInterstitial;->mContext:Landroid/content/Context;

    iget-object v1, p0, Lcom/mopub/mraid/MraidInterstitial;->mHtmlData:Ljava/lang/String;

    invoke-static {v0, p1, v1}, Lcom/mopub/mobileads/MraidActivity;->preRenderHtml(Landroid/content/Context;Lcom/mopub/mobileads/CustomEventInterstitial$CustomEventInterstitialListener;Ljava/lang/String;)V

    return-void
.end method

.method public showInterstitial()V
    .locals 5

    .line 29
    iget-object v0, p0, Lcom/mopub/mraid/MraidInterstitial;->mContext:Landroid/content/Context;

    iget-object v1, p0, Lcom/mopub/mraid/MraidInterstitial;->mAdReport:Lcom/mopub/common/AdReport;

    iget-object v2, p0, Lcom/mopub/mraid/MraidInterstitial;->mHtmlData:Ljava/lang/String;

    iget-wide v3, p0, Lcom/mopub/mraid/MraidInterstitial;->mBroadcastIdentifier:J

    invoke-static {v0, v1, v2, v3, v4}, Lcom/mopub/mobileads/MraidActivity;->start(Landroid/content/Context;Lcom/mopub/common/AdReport;Ljava/lang/String;J)V

    return-void
.end method
