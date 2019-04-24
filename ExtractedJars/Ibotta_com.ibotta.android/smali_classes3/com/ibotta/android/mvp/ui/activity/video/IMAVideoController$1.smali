.class Lcom/ibotta/android/mvp/ui/activity/video/IMAVideoController$1;
.super Ljava/lang/Object;
.source "IMAVideoController.java"

# interfaces
.implements Lcom/google/ads/interactivemedia/v3/api/AdsLoader$AdsLoadedListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/mvp/ui/activity/video/IMAVideoController;->init()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/mvp/ui/activity/video/IMAVideoController;


# direct methods
.method constructor <init>(Lcom/ibotta/android/mvp/ui/activity/video/IMAVideoController;)V
    .locals 0

    .line 51
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/video/IMAVideoController$1;->this$0:Lcom/ibotta/android/mvp/ui/activity/video/IMAVideoController;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAdsManagerLoaded(Lcom/google/ads/interactivemedia/v3/api/AdsManagerLoadedEvent;)V
    .locals 1

    .line 56
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/video/IMAVideoController$1;->this$0:Lcom/ibotta/android/mvp/ui/activity/video/IMAVideoController;

    invoke-interface {p1}, Lcom/google/ads/interactivemedia/v3/api/AdsManagerLoadedEvent;->getAdsManager()Lcom/google/ads/interactivemedia/v3/api/AdsManager;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/video/IMAVideoController;->access$002(Lcom/ibotta/android/mvp/ui/activity/video/IMAVideoController;Lcom/google/ads/interactivemedia/v3/api/AdsManager;)Lcom/google/ads/interactivemedia/v3/api/AdsManager;

    .line 59
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/video/IMAVideoController$1;->this$0:Lcom/ibotta/android/mvp/ui/activity/video/IMAVideoController;

    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/video/IMAVideoController;->access$000(Lcom/ibotta/android/mvp/ui/activity/video/IMAVideoController;)Lcom/google/ads/interactivemedia/v3/api/AdsManager;

    move-result-object p1

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/video/IMAVideoController$1;->this$0:Lcom/ibotta/android/mvp/ui/activity/video/IMAVideoController;

    invoke-interface {p1, v0}, Lcom/google/ads/interactivemedia/v3/api/AdsManager;->addAdErrorListener(Lcom/google/ads/interactivemedia/v3/api/AdErrorEvent$AdErrorListener;)V

    .line 60
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/video/IMAVideoController$1;->this$0:Lcom/ibotta/android/mvp/ui/activity/video/IMAVideoController;

    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/video/IMAVideoController;->access$000(Lcom/ibotta/android/mvp/ui/activity/video/IMAVideoController;)Lcom/google/ads/interactivemedia/v3/api/AdsManager;

    move-result-object p1

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/video/IMAVideoController$1;->this$0:Lcom/ibotta/android/mvp/ui/activity/video/IMAVideoController;

    invoke-interface {p1, v0}, Lcom/google/ads/interactivemedia/v3/api/AdsManager;->addAdEventListener(Lcom/google/ads/interactivemedia/v3/api/AdEvent$AdEventListener;)V

    .line 61
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/video/IMAVideoController$1;->this$0:Lcom/ibotta/android/mvp/ui/activity/video/IMAVideoController;

    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/video/IMAVideoController;->access$000(Lcom/ibotta/android/mvp/ui/activity/video/IMAVideoController;)Lcom/google/ads/interactivemedia/v3/api/AdsManager;

    move-result-object p1

    invoke-interface {p1}, Lcom/google/ads/interactivemedia/v3/api/AdsManager;->init()V

    return-void
.end method
