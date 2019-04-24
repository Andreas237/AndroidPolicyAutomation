.class public abstract Lcom/huawei/wallet/ui/idencard/camera/base/DecodeHandler;
.super Landroid/os/Handler;
.source "SourceFile"


# instance fields
.field protected a:I

.field protected b:J

.field protected c:Lexocr/base/ExBaseCardInfo;

.field protected d:Z

.field public e:[B

.field private final g:Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivity;


# direct methods
.method protected constructor <init>(Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivity;)V
    .locals 1

    .line 42
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 37
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/DecodeHandler;->a:I

    .line 43
    iput-object p1, p0, Lcom/huawei/wallet/ui/idencard/camera/base/DecodeHandler;->g:Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivity;

    .line 44
    const/16 v0, 0x1000

    new-array v0, v0, [B

    iput-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/DecodeHandler;->e:[B

    .line 45
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/DecodeHandler;->d:Z

    .line 46
    return-void
.end method


# virtual methods
.method protected b()V
    .locals 3

    .line 94
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/DecodeHandler;->g:Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivity;

    invoke-virtual {v0}, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivity;->d()Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Landroid/os/Message;->obtain(Landroid/os/Handler;I)Landroid/os/Message;

    move-result-object v2

    .line 95
    invoke-virtual {v2}, Landroid/os/Message;->sendToTarget()V

    .line 96
    return-void
.end method

.method protected abstract d([B)Z
.end method

.method public handleMessage(Landroid/os/Message;)V
    .locals 7

    .line 51
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 52
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    .line 55
    :sswitch_0
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    instance-of v0, v0, Ljava/lang/Boolean;

    if-eqz v0, :cond_1

    .line 57
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/DecodeHandler;->d:Z

    .line 58
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "focus result :"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-boolean v1, p0, Lcom/huawei/wallet/ui/idencard/camera/base/DecodeHandler;->d:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->a(Ljava/lang/String;Z)V

    goto :goto_0

    .line 63
    :sswitch_1
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, [B

    check-cast v0, [B

    invoke-virtual {p0, v0}, Lcom/huawei/wallet/ui/idencard/camera/base/DecodeHandler;->d([B)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 65
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/DecodeHandler;->g:Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivity;

    invoke-virtual {v0}, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivity;->d()Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/wallet/ui/idencard/camera/base/DecodeHandler;->c:Lexocr/base/ExBaseCardInfo;

    const/4 v2, 0x4

    invoke-static {v0, v2, v1}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v5

    .line 67
    new-instance v6, Landroid/os/Bundle;

    invoke-direct {v6}, Landroid/os/Bundle;-><init>()V

    .line 68
    const-string v0, "beginTime"

    iget-wide v1, p0, Lcom/huawei/wallet/ui/idencard/camera/base/DecodeHandler;->b:J

    invoke-virtual {v6, v0, v1, v2}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    .line 69
    invoke-virtual {v5, v6}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V

    .line 70
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onPreviewFrame decode time: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    iget-wide v3, p0, Lcom/huawei/wallet/ui/idencard/camera/base/DecodeHandler;->b:J

    sub-long/2addr v1, v3

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->a(Ljava/lang/String;Z)V

    .line 71
    invoke-virtual {v5}, Landroid/os/Message;->sendToTarget()V

    .line 72
    goto :goto_0

    .line 75
    :cond_0
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/DecodeHandler;->g:Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivity;

    invoke-virtual {v0}, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivity;->d()Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x5

    invoke-static {v0, v1}, Landroid/os/Message;->obtain(Landroid/os/Handler;I)Landroid/os/Message;

    move-result-object v5

    .line 76
    invoke-virtual {v5}, Landroid/os/Message;->sendToTarget()V

    .line 78
    goto :goto_0

    .line 80
    :sswitch_2
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Looper;->quit()V

    .line 81
    .line 85
    :cond_1
    :goto_0
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x2 -> :sswitch_1
        0x6 -> :sswitch_2
        0x7 -> :sswitch_0
    .end sparse-switch
.end method
