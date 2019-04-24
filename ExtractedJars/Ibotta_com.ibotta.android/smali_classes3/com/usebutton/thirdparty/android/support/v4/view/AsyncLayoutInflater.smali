.class public final Lcom/usebutton/thirdparty/android/support/v4/view/AsyncLayoutInflater;
.super Ljava/lang/Object;
.source "AsyncLayoutInflater.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/usebutton/thirdparty/android/support/v4/view/AsyncLayoutInflater$InflateThread;,
        Lcom/usebutton/thirdparty/android/support/v4/view/AsyncLayoutInflater$BasicInflater;,
        Lcom/usebutton/thirdparty/android/support/v4/view/AsyncLayoutInflater$InflateRequest;,
        Lcom/usebutton/thirdparty/android/support/v4/view/AsyncLayoutInflater$OnInflateFinishedListener;
    }
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String; = "AsyncLayoutInflater"


# instance fields
.field private mHandler:Landroid/os/Handler;

.field private mHandlerCallback:Landroid/os/Handler$Callback;

.field private mInflateThread:Lcom/usebutton/thirdparty/android/support/v4/view/AsyncLayoutInflater$InflateThread;

.field private mInflater:Landroid/view/LayoutInflater;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 73
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 93
    new-instance v0, Lcom/usebutton/thirdparty/android/support/v4/view/AsyncLayoutInflater$1;

    invoke-direct {v0, p0}, Lcom/usebutton/thirdparty/android/support/v4/view/AsyncLayoutInflater$1;-><init>(Lcom/usebutton/thirdparty/android/support/v4/view/AsyncLayoutInflater;)V

    iput-object v0, p0, Lcom/usebutton/thirdparty/android/support/v4/view/AsyncLayoutInflater;->mHandlerCallback:Landroid/os/Handler$Callback;

    .line 74
    new-instance v0, Lcom/usebutton/thirdparty/android/support/v4/view/AsyncLayoutInflater$BasicInflater;

    invoke-direct {v0, p1}, Lcom/usebutton/thirdparty/android/support/v4/view/AsyncLayoutInflater$BasicInflater;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/usebutton/thirdparty/android/support/v4/view/AsyncLayoutInflater;->mInflater:Landroid/view/LayoutInflater;

    .line 75
    new-instance p1, Landroid/os/Handler;

    iget-object v0, p0, Lcom/usebutton/thirdparty/android/support/v4/view/AsyncLayoutInflater;->mHandlerCallback:Landroid/os/Handler$Callback;

    invoke-direct {p1, v0}, Landroid/os/Handler;-><init>(Landroid/os/Handler$Callback;)V

    iput-object p1, p0, Lcom/usebutton/thirdparty/android/support/v4/view/AsyncLayoutInflater;->mHandler:Landroid/os/Handler;

    .line 76
    invoke-static {}, Lcom/usebutton/thirdparty/android/support/v4/view/AsyncLayoutInflater$InflateThread;->getInstance()Lcom/usebutton/thirdparty/android/support/v4/view/AsyncLayoutInflater$InflateThread;

    move-result-object p1

    iput-object p1, p0, Lcom/usebutton/thirdparty/android/support/v4/view/AsyncLayoutInflater;->mInflateThread:Lcom/usebutton/thirdparty/android/support/v4/view/AsyncLayoutInflater$InflateThread;

    return-void
.end method

.method static synthetic access$000(Lcom/usebutton/thirdparty/android/support/v4/view/AsyncLayoutInflater;)Landroid/view/LayoutInflater;
    .locals 0

    .line 66
    iget-object p0, p0, Lcom/usebutton/thirdparty/android/support/v4/view/AsyncLayoutInflater;->mInflater:Landroid/view/LayoutInflater;

    return-object p0
.end method

.method static synthetic access$100(Lcom/usebutton/thirdparty/android/support/v4/view/AsyncLayoutInflater;)Lcom/usebutton/thirdparty/android/support/v4/view/AsyncLayoutInflater$InflateThread;
    .locals 0

    .line 66
    iget-object p0, p0, Lcom/usebutton/thirdparty/android/support/v4/view/AsyncLayoutInflater;->mInflateThread:Lcom/usebutton/thirdparty/android/support/v4/view/AsyncLayoutInflater$InflateThread;

    return-object p0
.end method

.method static synthetic access$200(Lcom/usebutton/thirdparty/android/support/v4/view/AsyncLayoutInflater;)Landroid/os/Handler;
    .locals 0

    .line 66
    iget-object p0, p0, Lcom/usebutton/thirdparty/android/support/v4/view/AsyncLayoutInflater;->mHandler:Landroid/os/Handler;

    return-object p0
.end method


# virtual methods
.method public inflate(ILandroid/view/ViewGroup;Lcom/usebutton/thirdparty/android/support/v4/view/AsyncLayoutInflater$OnInflateFinishedListener;)V
    .locals 1
    .param p1    # I
        .annotation build Landroid/support/annotation/LayoutRes;
        .end annotation
    .end param
    .param p2    # Landroid/view/ViewGroup;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p3    # Lcom/usebutton/thirdparty/android/support/v4/view/AsyncLayoutInflater$OnInflateFinishedListener;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    if-eqz p3, :cond_0

    .line 85
    iget-object v0, p0, Lcom/usebutton/thirdparty/android/support/v4/view/AsyncLayoutInflater;->mInflateThread:Lcom/usebutton/thirdparty/android/support/v4/view/AsyncLayoutInflater$InflateThread;

    invoke-virtual {v0}, Lcom/usebutton/thirdparty/android/support/v4/view/AsyncLayoutInflater$InflateThread;->obtainRequest()Lcom/usebutton/thirdparty/android/support/v4/view/AsyncLayoutInflater$InflateRequest;

    move-result-object v0

    .line 86
    iput-object p0, v0, Lcom/usebutton/thirdparty/android/support/v4/view/AsyncLayoutInflater$InflateRequest;->inflater:Lcom/usebutton/thirdparty/android/support/v4/view/AsyncLayoutInflater;

    .line 87
    iput p1, v0, Lcom/usebutton/thirdparty/android/support/v4/view/AsyncLayoutInflater$InflateRequest;->resid:I

    .line 88
    iput-object p2, v0, Lcom/usebutton/thirdparty/android/support/v4/view/AsyncLayoutInflater$InflateRequest;->parent:Landroid/view/ViewGroup;

    .line 89
    iput-object p3, v0, Lcom/usebutton/thirdparty/android/support/v4/view/AsyncLayoutInflater$InflateRequest;->callback:Lcom/usebutton/thirdparty/android/support/v4/view/AsyncLayoutInflater$OnInflateFinishedListener;

    .line 90
    iget-object p1, p0, Lcom/usebutton/thirdparty/android/support/v4/view/AsyncLayoutInflater;->mInflateThread:Lcom/usebutton/thirdparty/android/support/v4/view/AsyncLayoutInflater$InflateThread;

    invoke-virtual {p1, v0}, Lcom/usebutton/thirdparty/android/support/v4/view/AsyncLayoutInflater$InflateThread;->enqueue(Lcom/usebutton/thirdparty/android/support/v4/view/AsyncLayoutInflater$InflateRequest;)V

    return-void

    .line 83
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "callback argument may not be null!"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
