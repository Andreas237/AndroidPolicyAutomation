.class Lcom/mopub/mraid/MraidBanner$1;
.super Ljava/lang/Object;
.source "MraidBanner.java"

# interfaces
.implements Lcom/mopub/mraid/MraidController$MraidListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/mopub/mraid/MraidBanner;->loadBanner(Landroid/content/Context;Lcom/mopub/mobileads/CustomEventBanner$CustomEventBannerListener;Ljava/util/Map;Ljava/util/Map;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/mopub/mraid/MraidBanner;


# direct methods
.method constructor <init>(Lcom/mopub/mraid/MraidBanner;)V
    .locals 0

    .line 54
    iput-object p1, p0, Lcom/mopub/mraid/MraidBanner$1;->this$0:Lcom/mopub/mraid/MraidBanner;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClose()V
    .locals 1

    .line 80
    iget-object v0, p0, Lcom/mopub/mraid/MraidBanner$1;->this$0:Lcom/mopub/mraid/MraidBanner;

    invoke-static {v0}, Lcom/mopub/mraid/MraidBanner;->access$000(Lcom/mopub/mraid/MraidBanner;)Lcom/mopub/mobileads/CustomEventBanner$CustomEventBannerListener;

    move-result-object v0

    invoke-interface {v0}, Lcom/mopub/mobileads/CustomEventBanner$CustomEventBannerListener;->onBannerCollapsed()V

    return-void
.end method

.method public onExpand()V
    .locals 1

    .line 69
    iget-object v0, p0, Lcom/mopub/mraid/MraidBanner$1;->this$0:Lcom/mopub/mraid/MraidBanner;

    invoke-static {v0}, Lcom/mopub/mraid/MraidBanner;->access$000(Lcom/mopub/mraid/MraidBanner;)Lcom/mopub/mobileads/CustomEventBanner$CustomEventBannerListener;

    move-result-object v0

    invoke-interface {v0}, Lcom/mopub/mobileads/CustomEventBanner$CustomEventBannerListener;->onBannerExpanded()V

    .line 70
    iget-object v0, p0, Lcom/mopub/mraid/MraidBanner$1;->this$0:Lcom/mopub/mraid/MraidBanner;

    invoke-static {v0}, Lcom/mopub/mraid/MraidBanner;->access$000(Lcom/mopub/mraid/MraidBanner;)Lcom/mopub/mobileads/CustomEventBanner$CustomEventBannerListener;

    move-result-object v0

    invoke-interface {v0}, Lcom/mopub/mobileads/CustomEventBanner$CustomEventBannerListener;->onBannerClicked()V

    return-void
.end method

.method public onFailedToLoad()V
    .locals 2

    .line 64
    iget-object v0, p0, Lcom/mopub/mraid/MraidBanner$1;->this$0:Lcom/mopub/mraid/MraidBanner;

    invoke-static {v0}, Lcom/mopub/mraid/MraidBanner;->access$000(Lcom/mopub/mraid/MraidBanner;)Lcom/mopub/mobileads/CustomEventBanner$CustomEventBannerListener;

    move-result-object v0

    sget-object v1, Lcom/mopub/mobileads/MoPubErrorCode;->MRAID_LOAD_ERROR:Lcom/mopub/mobileads/MoPubErrorCode;

    invoke-interface {v0, v1}, Lcom/mopub/mobileads/CustomEventBanner$CustomEventBannerListener;->onBannerFailed(Lcom/mopub/mobileads/MoPubErrorCode;)V

    return-void
.end method

.method public onLoaded(Landroid/view/View;)V
    .locals 1

    .line 58
    invoke-static {p1}, Lcom/mopub/mobileads/AdViewController;->setShouldHonorServerDimensions(Landroid/view/View;)V

    .line 59
    iget-object v0, p0, Lcom/mopub/mraid/MraidBanner$1;->this$0:Lcom/mopub/mraid/MraidBanner;

    invoke-static {v0}, Lcom/mopub/mraid/MraidBanner;->access$000(Lcom/mopub/mraid/MraidBanner;)Lcom/mopub/mobileads/CustomEventBanner$CustomEventBannerListener;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/mopub/mobileads/CustomEventBanner$CustomEventBannerListener;->onBannerLoaded(Landroid/view/View;)V

    return-void
.end method

.method public onOpen()V
    .locals 1

    .line 75
    iget-object v0, p0, Lcom/mopub/mraid/MraidBanner$1;->this$0:Lcom/mopub/mraid/MraidBanner;

    invoke-static {v0}, Lcom/mopub/mraid/MraidBanner;->access$000(Lcom/mopub/mraid/MraidBanner;)Lcom/mopub/mobileads/CustomEventBanner$CustomEventBannerListener;

    move-result-object v0

    invoke-interface {v0}, Lcom/mopub/mobileads/CustomEventBanner$CustomEventBannerListener;->onBannerClicked()V

    return-void
.end method
