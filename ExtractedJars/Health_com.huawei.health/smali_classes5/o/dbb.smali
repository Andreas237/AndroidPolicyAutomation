.class public abstract Lo/dbb;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:Ljava/lang/Object;>Landroid/os/Handler;"
    }
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String;


# instance fields
.field private mWeakReference:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<TT;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 13
    const-class v0, Lo/dbb;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lo/dbb;->TAG:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/os/Looper;Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/os/Looper;TT;)V"
        }
    .end annotation

    .line 18
    invoke-direct {p0, p1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 19
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lo/dbb;->mWeakReference:Ljava/lang/ref/WeakReference;

    .line 20
    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .line 23
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 24
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lo/dbb;->mWeakReference:Ljava/lang/ref/WeakReference;

    .line 25
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 3

    .line 29
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 30
    iget-object v0, p0, Lo/dbb;->mWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v2

    .line 31
    const/4 v0, 0x0

    if-ne v0, v2, :cond_0

    .line 32
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/dbb;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 33
    return-void

    .line 36
    :cond_0
    instance-of v0, v2, Landroid/app/Activity;

    if-eqz v0, :cond_1

    .line 37
    move-object v0, v2

    check-cast v0, Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 38
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/dbb;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 39
    return-void

    .line 43
    :cond_1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x11

    if-lt v0, v1, :cond_2

    .line 44
    instance-of v0, v2, Landroid/app/Activity;

    if-eqz v0, :cond_2

    .line 45
    move-object v0, v2

    check-cast v0, Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->isDestroyed()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 46
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/dbb;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 47
    return-void

    .line 52
    :cond_2
    instance-of v0, v2, Landroid/support/v4/app/Fragment;

    if-eqz v0, :cond_3

    .line 53
    move-object v0, v2

    check-cast v0, Landroid/support/v4/app/Fragment;

    invoke-virtual {v0}, Landroid/support/v4/app/Fragment;->isAdded()Z

    move-result v0

    if-nez v0, :cond_3

    .line 54
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/dbb;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 55
    return-void

    .line 58
    :cond_3
    invoke-virtual {p0, v2, p1}, Lo/dbb;->handleMessageWhenReferenceNotNull(Ljava/lang/Object;Landroid/os/Message;)V

    .line 59
    return-void
.end method

.method protected abstract handleMessageWhenReferenceNotNull(Ljava/lang/Object;Landroid/os/Message;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;Landroid/os/Message;)V"
        }
    .end annotation
.end method
