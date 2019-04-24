.class public abstract Lo/aft;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:Ljava/lang/Object;>Landroid/os/Handler;"
    }
.end annotation


# instance fields
.field private a:Ljava/lang/ref/WeakReference;
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

    .line 18
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 19
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lo/aft;->a:Ljava/lang/ref/WeakReference;

    .line 20
    return-void
.end method


# virtual methods
.method protected abstract e(Ljava/lang/Object;Landroid/os/Message;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;Landroid/os/Message;)V"
        }
    .end annotation
.end method

.method public handleMessage(Landroid/os/Message;)V
    .locals 3

    .line 24
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 25
    iget-object v0, p0, Lo/aft;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v2

    .line 26
    const/4 v0, 0x0

    if-ne v0, v2, :cond_0

    .line 27
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/aft;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 28
    return-void

    .line 31
    :cond_0
    instance-of v0, v2, Landroid/app/Activity;

    if-eqz v0, :cond_1

    .line 32
    move-object v0, v2

    check-cast v0, Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 33
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/aft;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 34
    return-void

    .line 38
    :cond_1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x11

    if-lt v0, v1, :cond_2

    .line 39
    instance-of v0, v2, Landroid/app/Activity;

    if-eqz v0, :cond_2

    .line 40
    move-object v0, v2

    check-cast v0, Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->isDestroyed()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 41
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/aft;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 42
    return-void

    .line 47
    :cond_2
    instance-of v0, v2, Landroid/support/v4/app/Fragment;

    if-eqz v0, :cond_3

    .line 48
    move-object v0, v2

    check-cast v0, Landroid/support/v4/app/Fragment;

    invoke-virtual {v0}, Landroid/support/v4/app/Fragment;->isAdded()Z

    move-result v0

    if-nez v0, :cond_3

    .line 49
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/aft;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 50
    return-void

    .line 53
    :cond_3
    invoke-virtual {p0, v2, p1}, Lo/aft;->e(Ljava/lang/Object;Landroid/os/Message;)V

    .line 54
    return-void
.end method
