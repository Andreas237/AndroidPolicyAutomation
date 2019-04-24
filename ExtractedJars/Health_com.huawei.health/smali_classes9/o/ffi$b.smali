.class Lo/ffi$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/ffi;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation


# instance fields
.field e:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lo/ffi;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lo/ffi;)V
    .locals 1

    .line 557
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 558
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lo/ffi$b;->e:Ljava/lang/ref/WeakReference;

    .line 559
    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 3

    .line 563
    iget-object v0, p0, Lo/ffi$b;->e:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lo/ffi;

    .line 564
    if-nez v1, :cond_0

    .line 565
    return-void

    .line 567
    :cond_0
    iget-object v0, v1, Lo/ffi;->M:Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v2

    .line 568
    const/16 v0, 0x66

    iput v0, v2, Landroid/os/Message;->what:I

    .line 569
    iput-object p2, v2, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 571
    iget-object v0, v1, Lo/ffi;->M:Landroid/os/Handler;

    invoke-virtual {v0, v2}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 572
    return-void
.end method
