.class public abstract Lcom/leisen/wallet/sdk/apdu/ApduResponseHandler;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/leisen/wallet/sdk/apdu/ApduResponseHandler$ResponseHandler;
    }
.end annotation


# static fields
.field private static final MESSAGE_FAILURE:I = 0x2

.field private static final MESSAGE_SENDNEXT:I = 0x1

.field private static final MESSAGE_SENDNEXT_ERROR:I = 0x3

.field private static final MESSAGE_SUCCESS:I = 0x0

.field private static final TAG:Ljava/lang/String; = "ApduResponseHandler"


# instance fields
.field private mHandler:Lcom/leisen/wallet/sdk/apdu/ApduResponseHandler$ResponseHandler;

.field private useSynchronousMode:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/leisen/wallet/sdk/apdu/ApduResponseHandler;->setUseSynchronousMode(Z)V

    .line 21
    return-void
.end method

.method private obtainMessage(ILjava/lang/Object;)Landroid/os/Message;
    .locals 2

    .line 127
    iget-object v0, p0, Lcom/leisen/wallet/sdk/apdu/ApduResponseHandler;->mHandler:Lcom/leisen/wallet/sdk/apdu/ApduResponseHandler$ResponseHandler;

    if-nez v0, :cond_0

    .line 128
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v1

    .line 129
    if-eqz v1, :cond_1

    .line 130
    iput p1, v1, Landroid/os/Message;->what:I

    .line 131
    iput-object p2, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    goto :goto_0

    .line 134
    :cond_0
    iget-object v0, p0, Lcom/leisen/wallet/sdk/apdu/ApduResponseHandler;->mHandler:Lcom/leisen/wallet/sdk/apdu/ApduResponseHandler$ResponseHandler;

    invoke-static {v0, p1, p2}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v1

    .line 136
    :cond_1
    :goto_0
    return-object v1
.end method

.method private sendMessage(Landroid/os/Message;)V
    .locals 1

    .line 45
    invoke-virtual {p0}, Lcom/leisen/wallet/sdk/apdu/ApduResponseHandler;->getUseSynchronousMode()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/leisen/wallet/sdk/apdu/ApduResponseHandler;->mHandler:Lcom/leisen/wallet/sdk/apdu/ApduResponseHandler$ResponseHandler;

    if-nez v0, :cond_1

    .line 46
    :cond_0
    invoke-virtual {p0, p1}, Lcom/leisen/wallet/sdk/apdu/ApduResponseHandler;->handleMessage(Landroid/os/Message;)V

    goto :goto_0

    .line 47
    :cond_1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->isInterrupted()Z

    move-result v0

    if-nez v0, :cond_2

    .line 48
    iget-object v0, p0, Lcom/leisen/wallet/sdk/apdu/ApduResponseHandler;->mHandler:Lcom/leisen/wallet/sdk/apdu/ApduResponseHandler$ResponseHandler;

    invoke-virtual {v0, p1}, Lcom/leisen/wallet/sdk/apdu/ApduResponseHandler$ResponseHandler;->sendMessage(Landroid/os/Message;)Z

    .line 50
    :cond_2
    :goto_0
    return-void
.end method


# virtual methods
.method public abstract OnSendNextError(IILjava/lang/String;Ljava/lang/String;Ljava/lang/Error;)V
.end method

.method public getUseSynchronousMode()Z
    .locals 1

    .line 36
    iget-boolean v0, p0, Lcom/leisen/wallet/sdk/apdu/ApduResponseHandler;->useSynchronousMode:Z

    return v0
.end method

.method public handleMessage(Landroid/os/Message;)V
    .locals 7

    .line 59
    const-string v0, "ApduResponseHandler"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "handleMessage : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p1, Landroid/os/Message;->what:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " ; objects : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Landroid/os/Message;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 60
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_1

    .line 62
    :pswitch_0
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, [Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, [Ljava/lang/Object;

    .line 63
    if-eqz v6, :cond_1

    array-length v0, v6

    const/4 v1, 0x1

    if-lt v0, v1, :cond_1

    .line 64
    const/4 v0, 0x0

    aget-object v0, v6, v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    aget-object v0, v6, v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_0
    invoke-virtual {p0, v0}, Lcom/leisen/wallet/sdk/apdu/ApduResponseHandler;->onSuccess(Ljava/lang/String;)V

    goto/16 :goto_1

    .line 68
    :pswitch_1
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, [Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, [Ljava/lang/Object;

    .line 69
    if-eqz v6, :cond_1

    array-length v0, v6

    const/4 v1, 0x4

    if-lt v0, v1, :cond_1

    .line 70
    const/4 v0, 0x0

    aget-object v0, v6, v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    const/4 v1, 0x1

    aget-object v1, v6, v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    const/4 v2, 0x2

    aget-object v2, v6, v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x3

    aget-object v3, v6, v3

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/leisen/wallet/sdk/apdu/ApduResponseHandler;->onSendNext(IILjava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    .line 74
    :pswitch_2
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, [Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, [Ljava/lang/Object;

    .line 75
    if-eqz v6, :cond_1

    array-length v0, v6

    const/4 v1, 0x5

    if-lt v0, v1, :cond_1

    .line 76
    move-object v0, p0

    const/4 v1, 0x0

    aget-object v1, v6, v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    const/4 v2, 0x1

    aget-object v2, v6, v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    const/4 v3, 0x2

    aget-object v3, v6, v3

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x3

    aget-object v4, v6, v4

    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x4

    aget-object v5, v6, v5

    check-cast v5, Ljava/lang/Error;

    invoke-virtual/range {v0 .. v5}, Lcom/leisen/wallet/sdk/apdu/ApduResponseHandler;->OnSendNextError(IILjava/lang/String;Ljava/lang/String;Ljava/lang/Error;)V

    goto :goto_1

    .line 80
    :pswitch_3
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, [Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, [Ljava/lang/Object;

    .line 81
    if-eqz v6, :cond_1

    array-length v0, v6

    const/4 v1, 0x2

    if-lt v0, v1, :cond_1

    .line 82
    const/4 v0, 0x0

    aget-object v0, v6, v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    const/4 v1, 0x1

    aget-object v1, v6, v1

    check-cast v1, Ljava/lang/Error;

    invoke-virtual {p0, v0, v1}, Lcom/leisen/wallet/sdk/apdu/ApduResponseHandler;->onFailure(ILjava/lang/Error;)V

    .line 86
    :cond_1
    :goto_1
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_3
        :pswitch_2
    .end packed-switch
.end method

.method public abstract onFailure(ILjava/lang/Error;)V
.end method

.method public abstract onSendNext(IILjava/lang/String;Ljava/lang/String;)V
.end method

.method public abstract onSuccess(Ljava/lang/String;)V
.end method

.method public sendFailureMessage(ILjava/lang/Error;)V
    .locals 3

    .line 101
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const/4 v1, 0x1

    aput-object p2, v0, v1

    const/4 v1, 0x2

    invoke-direct {p0, v1, v0}, Lcom/leisen/wallet/sdk/apdu/ApduResponseHandler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/leisen/wallet/sdk/apdu/ApduResponseHandler;->sendMessage(Landroid/os/Message;)V

    .line 102
    return-void
.end method

.method public sendSendNextErrorMessage(IILjava/lang/String;Ljava/lang/String;Ljava/lang/Error;)V
    .locals 3

    .line 97
    const/4 v0, 0x5

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const/4 v1, 0x2

    aput-object p3, v0, v1

    const/4 v1, 0x3

    aput-object p4, v0, v1

    const/4 v1, 0x4

    aput-object p5, v0, v1

    const/4 v1, 0x3

    invoke-direct {p0, v1, v0}, Lcom/leisen/wallet/sdk/apdu/ApduResponseHandler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/leisen/wallet/sdk/apdu/ApduResponseHandler;->sendMessage(Landroid/os/Message;)V

    .line 98
    return-void
.end method

.method public sendSendNextMessage(IILjava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 93
    const/4 v0, 0x4

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const/4 v1, 0x2

    aput-object p3, v0, v1

    const/4 v1, 0x3

    aput-object p4, v0, v1

    const/4 v1, 0x1

    invoke-direct {p0, v1, v0}, Lcom/leisen/wallet/sdk/apdu/ApduResponseHandler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/leisen/wallet/sdk/apdu/ApduResponseHandler;->sendMessage(Landroid/os/Message;)V

    .line 94
    return-void
.end method

.method public sendSuccessMessage(Ljava/lang/String;)V
    .locals 2

    .line 89
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    const/4 v1, 0x0

    invoke-direct {p0, v1, v0}, Lcom/leisen/wallet/sdk/apdu/ApduResponseHandler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/leisen/wallet/sdk/apdu/ApduResponseHandler;->sendMessage(Landroid/os/Message;)V

    .line 90
    return-void
.end method

.method public setUseSynchronousMode(Z)V
    .locals 1

    .line 24
    if-nez p1, :cond_0

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    if-nez v0, :cond_0

    .line 25
    const/4 p1, 0x1

    .line 27
    :cond_0
    if-nez p1, :cond_1

    iget-object v0, p0, Lcom/leisen/wallet/sdk/apdu/ApduResponseHandler;->mHandler:Lcom/leisen/wallet/sdk/apdu/ApduResponseHandler$ResponseHandler;

    if-nez v0, :cond_1

    .line 28
    new-instance v0, Lcom/leisen/wallet/sdk/apdu/ApduResponseHandler$ResponseHandler;

    invoke-direct {v0, p0}, Lcom/leisen/wallet/sdk/apdu/ApduResponseHandler$ResponseHandler;-><init>(Lcom/leisen/wallet/sdk/apdu/ApduResponseHandler;)V

    iput-object v0, p0, Lcom/leisen/wallet/sdk/apdu/ApduResponseHandler;->mHandler:Lcom/leisen/wallet/sdk/apdu/ApduResponseHandler$ResponseHandler;

    goto :goto_0

    .line 29
    :cond_1
    if-eqz p1, :cond_2

    iget-object v0, p0, Lcom/leisen/wallet/sdk/apdu/ApduResponseHandler;->mHandler:Lcom/leisen/wallet/sdk/apdu/ApduResponseHandler$ResponseHandler;

    if-eqz v0, :cond_2

    .line 30
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/leisen/wallet/sdk/apdu/ApduResponseHandler;->mHandler:Lcom/leisen/wallet/sdk/apdu/ApduResponseHandler$ResponseHandler;

    .line 32
    :cond_2
    :goto_0
    iput-boolean p1, p0, Lcom/leisen/wallet/sdk/apdu/ApduResponseHandler;->useSynchronousMode:Z

    .line 33
    return-void
.end method
