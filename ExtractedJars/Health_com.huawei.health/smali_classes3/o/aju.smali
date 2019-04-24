.class public abstract Lo/aju;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:Ljava/lang/Object;>Landroid/os/Handler;"
    }
.end annotation


# instance fields
.field private referent:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .line 50
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 51
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lo/aju;->referent:Ljava/lang/ref/WeakReference;

    .line 52
    invoke-direct {p0}, Lo/aju;->checkStatic()V

    .line 53
    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;Landroid/os/Handler$Callback;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;Landroid/os/Handler$Callback;)V"
        }
    .end annotation

    .line 56
    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Handler$Callback;)V

    .line 57
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lo/aju;->referent:Ljava/lang/ref/WeakReference;

    .line 58
    invoke-direct {p0}, Lo/aju;->checkStatic()V

    .line 59
    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;Landroid/os/Looper;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;Landroid/os/Looper;)V"
        }
    .end annotation

    .line 62
    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 63
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lo/aju;->referent:Ljava/lang/ref/WeakReference;

    .line 64
    invoke-static {p2}, Lo/aju;->flushStackLocalLeaks(Landroid/os/Looper;)V

    .line 65
    invoke-direct {p0}, Lo/aju;->checkStatic()V

    .line 66
    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;Landroid/os/Looper;Landroid/os/Handler$Callback;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;Landroid/os/Looper;Landroid/os/Handler$Callback;)V"
        }
    .end annotation

    .line 69
    invoke-direct {p0, p2, p3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    .line 70
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lo/aju;->referent:Ljava/lang/ref/WeakReference;

    .line 71
    invoke-static {p2}, Lo/aju;->flushStackLocalLeaks(Landroid/os/Looper;)V

    .line 72
    invoke-direct {p0}, Lo/aju;->checkStatic()V

    .line 73
    return-void
.end method

.method private checkStatic()V
    .locals 3

    .line 76
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    .line 77
    invoke-virtual {v2}, Ljava/lang/Class;->getModifiers()I

    move-result v0

    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x24

    invoke-virtual {v0, v1}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    if-lez v0, :cond_0

    .line 79
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "handler not static"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 81
    :cond_0
    return-void
.end method

.method private static flushStackLocalLeaks(Landroid/os/Looper;)V
    .locals 2

    .line 107
    new-instance v1, Landroid/os/Handler;

    invoke-direct {v1, p0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 108
    new-instance v0, Lo/aju$4;

    invoke-direct {v0, v1}, Lo/aju$4;-><init>(Landroid/os/Handler;)V

    invoke-virtual {v1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 120
    return-void
.end method


# virtual methods
.method public dispatchMessage(Landroid/os/Message;)V
    .locals 0

    .line 92
    invoke-super {p0, p1}, Landroid/os/Handler;->dispatchMessage(Landroid/os/Message;)V

    .line 93
    return-void
.end method

.method public final handleMessage(Landroid/os/Message;)V
    .locals 2

    .line 85
    iget-object v0, p0, Lo/aju;->referent:Ljava/lang/ref/WeakReference;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lo/aju;->referent:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 86
    iget-object v0, p0, Lo/aju;->referent:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v0, p1}, Lo/aju;->handleMessage(Ljava/lang/Object;Landroid/os/Message;)V

    .line 88
    :cond_0
    return-void
.end method

.method public abstract handleMessage(Ljava/lang/Object;Landroid/os/Message;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;Landroid/os/Message;)V"
        }
    .end annotation
.end method
