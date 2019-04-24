.class Lcom/ibotta/android/mvp/ui/activity/video/IMAVideoController$2;
.super Ljava/lang/Object;
.source "IMAVideoController.java"

# interfaces
.implements Lcom/google/ads/interactivemedia/v3/api/player/ContentProgressProvider;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/mvp/ui/activity/video/IMAVideoController;->requestAds(Ljava/lang/String;)V
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

    .line 239
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/video/IMAVideoController$2;->this$0:Lcom/ibotta/android/mvp/ui/activity/video/IMAVideoController;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getContentProgress()Lcom/google/ads/interactivemedia/v3/api/player/VideoProgressUpdate;
    .locals 1

    .line 242
    sget-object v0, Lcom/google/ads/interactivemedia/v3/api/player/VideoProgressUpdate;->VIDEO_TIME_NOT_READY:Lcom/google/ads/interactivemedia/v3/api/player/VideoProgressUpdate;

    return-object v0
.end method
