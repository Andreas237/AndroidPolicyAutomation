.class Lcom/mopub/mraid/MraidController$ScreenMetricsWaiter$WaitRequest;
.super Ljava/lang/Object;
.source "MraidController.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/mopub/mraid/MraidController$ScreenMetricsWaiter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "WaitRequest"
.end annotation


# instance fields
.field private final mHandler:Landroid/os/Handler;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private mSuccessRunnable:Ljava/lang/Runnable;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private final mViews:[Landroid/view/View;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field mWaitCount:I

.field private final mWaitingRunnable:Ljava/lang/Runnable;


# direct methods
.method private constructor <init>(Landroid/os/Handler;[Landroid/view/View;)V
    .locals 1
    .param p1    # Landroid/os/Handler;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # [Landroid/view/View;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 377
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 390
    new-instance v0, Lcom/mopub/mraid/MraidController$ScreenMetricsWaiter$WaitRequest$1;

    invoke-direct {v0, p0}, Lcom/mopub/mraid/MraidController$ScreenMetricsWaiter$WaitRequest$1;-><init>(Lcom/mopub/mraid/MraidController$ScreenMetricsWaiter$WaitRequest;)V

    iput-object v0, p0, Lcom/mopub/mraid/MraidController$ScreenMetricsWaiter$WaitRequest;->mWaitingRunnable:Ljava/lang/Runnable;

    .line 378
    iput-object p1, p0, Lcom/mopub/mraid/MraidController$ScreenMetricsWaiter$WaitRequest;->mHandler:Landroid/os/Handler;

    .line 379
    iput-object p2, p0, Lcom/mopub/mraid/MraidController$ScreenMetricsWaiter$WaitRequest;->mViews:[Landroid/view/View;

    return-void
.end method

.method synthetic constructor <init>(Landroid/os/Handler;[Landroid/view/View;Lcom/mopub/mraid/MraidController$1;)V
    .locals 0

    .line 371
    invoke-direct {p0, p1, p2}, Lcom/mopub/mraid/MraidController$ScreenMetricsWaiter$WaitRequest;-><init>(Landroid/os/Handler;[Landroid/view/View;)V

    return-void
.end method

.method static synthetic access$300(Lcom/mopub/mraid/MraidController$ScreenMetricsWaiter$WaitRequest;)[Landroid/view/View;
    .locals 0

    .line 371
    iget-object p0, p0, Lcom/mopub/mraid/MraidController$ScreenMetricsWaiter$WaitRequest;->mViews:[Landroid/view/View;

    return-object p0
.end method

.method static synthetic access$400(Lcom/mopub/mraid/MraidController$ScreenMetricsWaiter$WaitRequest;)V
    .locals 0

    .line 371
    invoke-direct {p0}, Lcom/mopub/mraid/MraidController$ScreenMetricsWaiter$WaitRequest;->countDown()V

    return-void
.end method

.method private countDown()V
    .locals 1

    .line 383
    iget v0, p0, Lcom/mopub/mraid/MraidController$ScreenMetricsWaiter$WaitRequest;->mWaitCount:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/mopub/mraid/MraidController$ScreenMetricsWaiter$WaitRequest;->mWaitCount:I

    .line 384
    iget v0, p0, Lcom/mopub/mraid/MraidController$ScreenMetricsWaiter$WaitRequest;->mWaitCount:I

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/mopub/mraid/MraidController$ScreenMetricsWaiter$WaitRequest;->mSuccessRunnable:Ljava/lang/Runnable;

    if-eqz v0, :cond_0

    .line 385
    iget-object v0, p0, Lcom/mopub/mraid/MraidController$ScreenMetricsWaiter$WaitRequest;->mSuccessRunnable:Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    const/4 v0, 0x0

    .line 386
    iput-object v0, p0, Lcom/mopub/mraid/MraidController$ScreenMetricsWaiter$WaitRequest;->mSuccessRunnable:Ljava/lang/Runnable;

    :cond_0
    return-void
.end method


# virtual methods
.method cancel()V
    .locals 2

    .line 422
    iget-object v0, p0, Lcom/mopub/mraid/MraidController$ScreenMetricsWaiter$WaitRequest;->mHandler:Landroid/os/Handler;

    iget-object v1, p0, Lcom/mopub/mraid/MraidController$ScreenMetricsWaiter$WaitRequest;->mWaitingRunnable:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    const/4 v0, 0x0

    .line 423
    iput-object v0, p0, Lcom/mopub/mraid/MraidController$ScreenMetricsWaiter$WaitRequest;->mSuccessRunnable:Ljava/lang/Runnable;

    return-void
.end method

.method start(Ljava/lang/Runnable;)V
    .locals 1
    .param p1    # Ljava/lang/Runnable;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 416
    iput-object p1, p0, Lcom/mopub/mraid/MraidController$ScreenMetricsWaiter$WaitRequest;->mSuccessRunnable:Ljava/lang/Runnable;

    .line 417
    iget-object p1, p0, Lcom/mopub/mraid/MraidController$ScreenMetricsWaiter$WaitRequest;->mViews:[Landroid/view/View;

    array-length p1, p1

    iput p1, p0, Lcom/mopub/mraid/MraidController$ScreenMetricsWaiter$WaitRequest;->mWaitCount:I

    .line 418
    iget-object p1, p0, Lcom/mopub/mraid/MraidController$ScreenMetricsWaiter$WaitRequest;->mHandler:Landroid/os/Handler;

    iget-object v0, p0, Lcom/mopub/mraid/MraidController$ScreenMetricsWaiter$WaitRequest;->mWaitingRunnable:Ljava/lang/Runnable;

    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
