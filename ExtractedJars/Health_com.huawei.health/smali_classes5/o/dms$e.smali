.class Lo/dms$e;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/dms;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "e"
.end annotation


# instance fields
.field a:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lo/dms;>;"
        }
    .end annotation
.end field

.field final synthetic d:Lo/dms;


# direct methods
.method constructor <init>(Lo/dms;Lo/dms;)V
    .locals 1

    .line 152
    iput-object p1, p0, Lo/dms$e;->d:Lo/dms;

    .line 153
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {p0, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 154
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lo/dms$e;->a:Ljava/lang/ref/WeakReference;

    .line 155
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 5

    .line 159
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 160
    iget-object v0, p0, Lo/dms$e;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/dms;

    .line 161
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 162
    return-void

    .line 164
    :cond_0
    const-string v0, "HWStressMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "msg.what = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p1, Landroid/os/Message;->what:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 165
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 167
    :sswitch_0
    iget-object v0, p0, Lo/dms$e;->d:Lo/dms;

    invoke-static {v0}, Lo/dms;->c(Lo/dms;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 168
    iget-object v0, p0, Lo/dms$e;->d:Lo/dms;

    invoke-static {v0}, Lo/dms;->c(Lo/dms;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    move-result-object v0

    const-string v1, "time out."

    const v2, 0x61a85

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 169
    iget-object v0, p0, Lo/dms$e;->d:Lo/dms;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/dms;->c(Lo/dms;Z)Z

    goto :goto_0

    .line 171
    :cond_1
    const-string v0, "HWStressMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mStressCallback is null."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 173
    goto :goto_0

    .line 175
    :sswitch_1
    iget-object v0, p0, Lo/dms$e;->d:Lo/dms;

    invoke-static {v0}, Lo/dms;->e(Lo/dms;)V

    .line 176
    .line 180
    :goto_0
    return-void

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x1 -> :sswitch_1
    .end sparse-switch
.end method
