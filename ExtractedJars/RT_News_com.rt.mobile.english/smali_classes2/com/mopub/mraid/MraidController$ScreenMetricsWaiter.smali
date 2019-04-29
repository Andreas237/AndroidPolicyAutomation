.class Lcom/mopub/mraid/MraidController$ScreenMetricsWaiter;
.super Ljava/lang/Object;
.source "MraidController.java"


# annotations
.annotation build Lcom/mopub/common/VisibleForTesting;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/mopub/mraid/MraidController;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "ScreenMetricsWaiter"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/mopub/mraid/MraidController$ScreenMetricsWaiter$WaitRequest;
    }
.end annotation


# instance fields
.field private final mHandler:Landroid/os/Handler;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private mLastWaitRequest:Lcom/mopub/mraid/MraidController$ScreenMetricsWaiter$WaitRequest;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method constructor <init>()V
    .locals 1

    .line 370
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 427
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/mopub/mraid/MraidController$ScreenMetricsWaiter;->mHandler:Landroid/os/Handler;

    return-void
.end method


# virtual methods
.method cancelLastRequest()V
    .locals 1

    .line 436
    iget-object v0, p0, Lcom/mopub/mraid/MraidController$ScreenMetricsWaiter;->mLastWaitRequest:Lcom/mopub/mraid/MraidController$ScreenMetricsWaiter$WaitRequest;

    if-eqz v0, :cond_0

    .line 437
    iget-object v0, p0, Lcom/mopub/mraid/MraidController$ScreenMetricsWaiter;->mLastWaitRequest:Lcom/mopub/mraid/MraidController$ScreenMetricsWaiter$WaitRequest;

    invoke-virtual {v0}, Lcom/mopub/mraid/MraidController$ScreenMetricsWaiter$WaitRequest;->cancel()V

    const/4 v0, 0x0

    .line 438
    iput-object v0, p0, Lcom/mopub/mraid/MraidController$ScreenMetricsWaiter;->mLastWaitRequest:Lcom/mopub/mraid/MraidController$ScreenMetricsWaiter$WaitRequest;

    :cond_0
    return-void
.end method

.method varargs waitFor([Landroid/view/View;)Lcom/mopub/mraid/MraidController$ScreenMetricsWaiter$WaitRequest;
    .locals 3
    .param p1    # [Landroid/view/View;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 431
    new-instance v0, Lcom/mopub/mraid/MraidController$ScreenMetricsWaiter$WaitRequest;

    iget-object v1, p0, Lcom/mopub/mraid/MraidController$ScreenMetricsWaiter;->mHandler:Landroid/os/Handler;

    const/4 v2, 0x0

    invoke-direct {v0, v1, p1, v2}, Lcom/mopub/mraid/MraidController$ScreenMetricsWaiter$WaitRequest;-><init>(Landroid/os/Handler;[Landroid/view/View;Lcom/mopub/mraid/MraidController$1;)V

    iput-object v0, p0, Lcom/mopub/mraid/MraidController$ScreenMetricsWaiter;->mLastWaitRequest:Lcom/mopub/mraid/MraidController$ScreenMetricsWaiter$WaitRequest;

    .line 432
    iget-object p1, p0, Lcom/mopub/mraid/MraidController$ScreenMetricsWaiter;->mLastWaitRequest:Lcom/mopub/mraid/MraidController$ScreenMetricsWaiter$WaitRequest;

    return-object p1
.end method
