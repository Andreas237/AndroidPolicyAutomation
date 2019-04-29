.class Lcom/mopub/nativeads/MoPubNative$3;
.super Ljava/lang/Object;
.source "MoPubNative.java"

# interfaces
.implements Lcom/mopub/nativeads/CustomEventNative$CustomEventNativeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/mopub/nativeads/MoPubNative;->onAdLoad(Lcom/mopub/network/AdResponse;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/mopub/nativeads/MoPubNative;

.field final synthetic val$response:Lcom/mopub/network/AdResponse;


# direct methods
.method constructor <init>(Lcom/mopub/nativeads/MoPubNative;Lcom/mopub/network/AdResponse;)V
    .locals 0

    .line 202
    iput-object p1, p0, Lcom/mopub/nativeads/MoPubNative$3;->this$0:Lcom/mopub/nativeads/MoPubNative;

    iput-object p2, p0, Lcom/mopub/nativeads/MoPubNative$3;->val$response:Lcom/mopub/network/AdResponse;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onNativeAdFailed(Lcom/mopub/nativeads/NativeErrorCode;)V
    .locals 3

    const-string v0, "Native Ad failed to load with error: %s."

    const/4 v1, 0x1

    .line 227
    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/mopub/common/logging/MoPubLog;->v(Ljava/lang/String;)V

    .line 228
    iget-object p1, p0, Lcom/mopub/nativeads/MoPubNative$3;->this$0:Lcom/mopub/nativeads/MoPubNative;

    iget-object v0, p0, Lcom/mopub/nativeads/MoPubNative$3;->val$response:Lcom/mopub/network/AdResponse;

    invoke-virtual {v0}, Lcom/mopub/network/AdResponse;->getFailoverUrl()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/mopub/nativeads/MoPubNative;->requestNativeAd(Ljava/lang/String;)V

    return-void
.end method

.method public onNativeAdLoaded(Lcom/mopub/nativeads/BaseNativeAd;)V
    .locals 9
    .param p1    # Lcom/mopub/nativeads/BaseNativeAd;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 205
    iget-object v0, p0, Lcom/mopub/nativeads/MoPubNative$3;->this$0:Lcom/mopub/nativeads/MoPubNative;

    invoke-virtual {v0}, Lcom/mopub/nativeads/MoPubNative;->getActivityOrDestroy()Landroid/app/Activity;

    move-result-object v2

    if-nez v2, :cond_0

    return-void

    .line 210
    :cond_0
    iget-object v0, p0, Lcom/mopub/nativeads/MoPubNative$3;->this$0:Lcom/mopub/nativeads/MoPubNative;

    iget-object v0, v0, Lcom/mopub/nativeads/MoPubNative;->mAdRendererRegistry:Lcom/mopub/nativeads/AdRendererRegistry;

    invoke-virtual {v0, p1}, Lcom/mopub/nativeads/AdRendererRegistry;->getRendererForAd(Lcom/mopub/nativeads/BaseNativeAd;)Lcom/mopub/nativeads/MoPubAdRenderer;

    move-result-object v7

    if-nez v7, :cond_1

    .line 212
    sget-object p1, Lcom/mopub/nativeads/NativeErrorCode;->NATIVE_RENDERER_CONFIGURATION_ERROR:Lcom/mopub/nativeads/NativeErrorCode;

    invoke-virtual {p0, p1}, Lcom/mopub/nativeads/MoPubNative$3;->onNativeAdFailed(Lcom/mopub/nativeads/NativeErrorCode;)V

    return-void

    .line 216
    :cond_1
    iget-object v0, p0, Lcom/mopub/nativeads/MoPubNative$3;->this$0:Lcom/mopub/nativeads/MoPubNative;

    invoke-static {v0}, Lcom/mopub/nativeads/MoPubNative;->access$200(Lcom/mopub/nativeads/MoPubNative;)Lcom/mopub/nativeads/MoPubNative$MoPubNativeNetworkListener;

    move-result-object v0

    new-instance v8, Lcom/mopub/nativeads/NativeAd;

    iget-object v1, p0, Lcom/mopub/nativeads/MoPubNative$3;->val$response:Lcom/mopub/network/AdResponse;

    invoke-virtual {v1}, Lcom/mopub/network/AdResponse;->getImpressionTrackingUrl()Ljava/lang/String;

    move-result-object v3

    iget-object v1, p0, Lcom/mopub/nativeads/MoPubNative$3;->val$response:Lcom/mopub/network/AdResponse;

    invoke-virtual {v1}, Lcom/mopub/network/AdResponse;->getClickTrackingUrl()Ljava/lang/String;

    move-result-object v4

    iget-object v1, p0, Lcom/mopub/nativeads/MoPubNative$3;->this$0:Lcom/mopub/nativeads/MoPubNative;

    invoke-static {v1}, Lcom/mopub/nativeads/MoPubNative;->access$100(Lcom/mopub/nativeads/MoPubNative;)Ljava/lang/String;

    move-result-object v5

    move-object v1, v8

    move-object v6, p1

    invoke-direct/range {v1 .. v7}, Lcom/mopub/nativeads/NativeAd;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/mopub/nativeads/BaseNativeAd;Lcom/mopub/nativeads/MoPubAdRenderer;)V

    invoke-interface {v0, v8}, Lcom/mopub/nativeads/MoPubNative$MoPubNativeNetworkListener;->onNativeLoad(Lcom/mopub/nativeads/NativeAd;)V

    return-void
.end method
