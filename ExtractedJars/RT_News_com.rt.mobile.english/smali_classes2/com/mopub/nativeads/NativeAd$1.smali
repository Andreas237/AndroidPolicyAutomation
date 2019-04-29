.class Lcom/mopub/nativeads/NativeAd$1;
.super Ljava/lang/Object;
.source "NativeAd.java"

# interfaces
.implements Lcom/mopub/nativeads/BaseNativeAd$NativeEventListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/mopub/nativeads/NativeAd;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/mopub/nativeads/BaseNativeAd;Lcom/mopub/nativeads/MoPubAdRenderer;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/mopub/nativeads/NativeAd;


# direct methods
.method constructor <init>(Lcom/mopub/nativeads/NativeAd;)V
    .locals 0

    .line 84
    iput-object p1, p0, Lcom/mopub/nativeads/NativeAd$1;->this$0:Lcom/mopub/nativeads/NativeAd;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAdClicked()V
    .locals 2

    .line 92
    iget-object v0, p0, Lcom/mopub/nativeads/NativeAd$1;->this$0:Lcom/mopub/nativeads/NativeAd;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/mopub/nativeads/NativeAd;->handleClick(Landroid/view/View;)V

    return-void
.end method

.method public onAdImpressed()V
    .locals 2

    .line 87
    iget-object v0, p0, Lcom/mopub/nativeads/NativeAd$1;->this$0:Lcom/mopub/nativeads/NativeAd;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/mopub/nativeads/NativeAd;->recordImpression(Landroid/view/View;)V

    return-void
.end method
