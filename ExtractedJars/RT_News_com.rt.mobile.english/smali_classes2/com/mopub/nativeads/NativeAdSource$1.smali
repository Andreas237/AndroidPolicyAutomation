.class Lcom/mopub/nativeads/NativeAdSource$1;
.super Ljava/lang/Object;
.source "NativeAdSource.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/mopub/nativeads/NativeAdSource;-><init>(Ljava/util/List;Landroid/os/Handler;Lcom/mopub/nativeads/AdRendererRegistry;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/mopub/nativeads/NativeAdSource;


# direct methods
.method constructor <init>(Lcom/mopub/nativeads/NativeAdSource;)V
    .locals 0

    .line 82
    iput-object p1, p0, Lcom/mopub/nativeads/NativeAdSource$1;->this$0:Lcom/mopub/nativeads/NativeAdSource;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 85
    iget-object v0, p0, Lcom/mopub/nativeads/NativeAdSource$1;->this$0:Lcom/mopub/nativeads/NativeAdSource;

    const/4 v1, 0x0

    iput-boolean v1, v0, Lcom/mopub/nativeads/NativeAdSource;->mRetryInFlight:Z

    .line 86
    iget-object v0, p0, Lcom/mopub/nativeads/NativeAdSource$1;->this$0:Lcom/mopub/nativeads/NativeAdSource;

    invoke-virtual {v0}, Lcom/mopub/nativeads/NativeAdSource;->replenishCache()V

    return-void
.end method
