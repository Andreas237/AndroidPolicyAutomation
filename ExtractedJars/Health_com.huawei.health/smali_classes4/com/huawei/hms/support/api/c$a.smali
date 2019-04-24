.class public Lcom/huawei/hms/support/api/c$a;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hms/support/api/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xc
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<R:Lcom/huawei/hms/support/api/client/Result;>Landroid/os/Handler;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 376
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/hms/support/api/c$a;-><init>(Landroid/os/Looper;)V

    .line 377
    return-void
.end method

.method public constructor <init>(Landroid/os/Looper;)V
    .locals 0

    .line 380
    invoke-direct {p0, p1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 381
    return-void
.end method


# virtual methods
.method public a(Lcom/huawei/hms/support/api/client/ResultCallback;Lcom/huawei/hms/support/api/client/Result;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/hms/support/api/client/ResultCallback<-TR;>;TR;)V"
        }
    .end annotation

    .line 385
    new-instance v0, Landroid/util/Pair;

    invoke-direct {v0, p1, p2}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v1, 0x1

    invoke-virtual {p0, v1, v0}, Lcom/huawei/hms/support/api/c$a;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/hms/support/api/c$a;->sendMessage(Landroid/os/Message;)Z

    .line 386
    return-void
.end method

.method protected b(Lcom/huawei/hms/support/api/client/ResultCallback;Lcom/huawei/hms/support/api/client/Result;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/hms/support/api/client/ResultCallback<-TR;>;TR;)V"
        }
    .end annotation

    .line 402
    invoke-interface {p1, p2}, Lcom/huawei/hms/support/api/client/ResultCallback;->onResult(Ljava/lang/Object;)V

    .line 403
    return-void
.end method

.method public handleMessage(Landroid/os/Message;)V
    .locals 3

    .line 391
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 393
    :sswitch_0
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Landroid/util/Pair;

    .line 394
    iget-object v0, v2, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v0, Lcom/huawei/hms/support/api/client/ResultCallback;

    iget-object v1, v2, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v1, Lcom/huawei/hms/support/api/client/Result;

    invoke-virtual {p0, v0, v1}, Lcom/huawei/hms/support/api/c$a;->b(Lcom/huawei/hms/support/api/client/ResultCallback;Lcom/huawei/hms/support/api/client/Result;)V

    .line 395
    .line 399
    :goto_0
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
    .end sparse-switch
.end method
