.class Lcom/mopub/network/MoPubRequestQueue$DelayedRequestHelper;
.super Ljava/lang/Object;
.source "MoPubRequestQueue.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/mopub/network/MoPubRequestQueue;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "DelayedRequestHelper"
.end annotation


# instance fields
.field final mDelayMs:I

.field final mDelayedRunnable:Ljava/lang/Runnable;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field final mHandler:Landroid/os/Handler;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field final synthetic this$0:Lcom/mopub/network/MoPubRequestQueue;


# direct methods
.method constructor <init>(Lcom/mopub/network/MoPubRequestQueue;Lcom/mopub/volley/Request;I)V
    .locals 1
    .param p1    # Lcom/mopub/network/MoPubRequestQueue;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/mopub/volley/Request<",
            "*>;I)V"
        }
    .end annotation

    .line 135
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    invoke-direct {p0, p1, p2, p3, v0}, Lcom/mopub/network/MoPubRequestQueue$DelayedRequestHelper;-><init>(Lcom/mopub/network/MoPubRequestQueue;Lcom/mopub/volley/Request;ILandroid/os/Handler;)V

    return-void
.end method

.method constructor <init>(Lcom/mopub/network/MoPubRequestQueue;Lcom/mopub/volley/Request;ILandroid/os/Handler;)V
    .locals 0
    .param p1    # Lcom/mopub/network/MoPubRequestQueue;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # I
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Lcom/mopub/common/VisibleForTesting;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/mopub/volley/Request<",
            "*>;I",
            "Landroid/os/Handler;",
            ")V"
        }
    .end annotation

    .line 139
    iput-object p1, p0, Lcom/mopub/network/MoPubRequestQueue$DelayedRequestHelper;->this$0:Lcom/mopub/network/MoPubRequestQueue;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 140
    iput p3, p0, Lcom/mopub/network/MoPubRequestQueue$DelayedRequestHelper;->mDelayMs:I

    .line 141
    iput-object p4, p0, Lcom/mopub/network/MoPubRequestQueue$DelayedRequestHelper;->mHandler:Landroid/os/Handler;

    .line 142
    new-instance p3, Lcom/mopub/network/MoPubRequestQueue$DelayedRequestHelper$1;

    invoke-direct {p3, p0, p1, p2}, Lcom/mopub/network/MoPubRequestQueue$DelayedRequestHelper$1;-><init>(Lcom/mopub/network/MoPubRequestQueue$DelayedRequestHelper;Lcom/mopub/network/MoPubRequestQueue;Lcom/mopub/volley/Request;)V

    iput-object p3, p0, Lcom/mopub/network/MoPubRequestQueue$DelayedRequestHelper;->mDelayedRunnable:Ljava/lang/Runnable;

    return-void
.end method


# virtual methods
.method cancel()V
    .locals 2

    .line 156
    iget-object v0, p0, Lcom/mopub/network/MoPubRequestQueue$DelayedRequestHelper;->mHandler:Landroid/os/Handler;

    iget-object v1, p0, Lcom/mopub/network/MoPubRequestQueue$DelayedRequestHelper;->mDelayedRunnable:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    return-void
.end method

.method start()V
    .locals 4

    .line 152
    iget-object v0, p0, Lcom/mopub/network/MoPubRequestQueue$DelayedRequestHelper;->mHandler:Landroid/os/Handler;

    iget-object v1, p0, Lcom/mopub/network/MoPubRequestQueue$DelayedRequestHelper;->mDelayedRunnable:Ljava/lang/Runnable;

    iget v2, p0, Lcom/mopub/network/MoPubRequestQueue$DelayedRequestHelper;->mDelayMs:I

    int-to-long v2, v2

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method
