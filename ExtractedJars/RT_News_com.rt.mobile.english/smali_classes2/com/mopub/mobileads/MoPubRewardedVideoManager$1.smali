.class Lcom/mopub/mobileads/MoPubRewardedVideoManager$1;
.super Ljava/lang/Object;
.source "MoPubRewardedVideoManager.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/mopub/mobileads/MoPubRewardedVideoManager;->onAdSuccess(Lcom/mopub/network/AdResponse;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/mopub/mobileads/MoPubRewardedVideoManager;

.field final synthetic val$customEvent:Lcom/mopub/mobileads/CustomEventRewardedVideo;


# direct methods
.method constructor <init>(Lcom/mopub/mobileads/MoPubRewardedVideoManager;Lcom/mopub/mobileads/CustomEventRewardedVideo;)V
    .locals 0

    .line 325
    iput-object p1, p0, Lcom/mopub/mobileads/MoPubRewardedVideoManager$1;->this$0:Lcom/mopub/mobileads/MoPubRewardedVideoManager;

    iput-object p2, p0, Lcom/mopub/mobileads/MoPubRewardedVideoManager$1;->val$customEvent:Lcom/mopub/mobileads/CustomEventRewardedVideo;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    const-string v0, "Custom Event failed to load rewarded video in a timely fashion."

    .line 328
    invoke-static {v0}, Lcom/mopub/common/logging/MoPubLog;->d(Ljava/lang/String;)V

    .line 329
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubRewardedVideoManager$1;->val$customEvent:Lcom/mopub/mobileads/CustomEventRewardedVideo;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    iget-object v1, p0, Lcom/mopub/mobileads/MoPubRewardedVideoManager$1;->val$customEvent:Lcom/mopub/mobileads/CustomEventRewardedVideo;

    invoke-virtual {v1}, Lcom/mopub/mobileads/CustomEventRewardedVideo;->getAdNetworkId()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lcom/mopub/mobileads/MoPubErrorCode;->NETWORK_TIMEOUT:Lcom/mopub/mobileads/MoPubErrorCode;

    invoke-static {v0, v1, v2}, Lcom/mopub/mobileads/MoPubRewardedVideoManager;->onRewardedVideoLoadFailure(Ljava/lang/Class;Ljava/lang/String;Lcom/mopub/mobileads/MoPubErrorCode;)V

    .line 331
    iget-object v0, p0, Lcom/mopub/mobileads/MoPubRewardedVideoManager$1;->val$customEvent:Lcom/mopub/mobileads/CustomEventRewardedVideo;

    invoke-virtual {v0}, Lcom/mopub/mobileads/CustomEventRewardedVideo;->onInvalidate()V

    return-void
.end method
