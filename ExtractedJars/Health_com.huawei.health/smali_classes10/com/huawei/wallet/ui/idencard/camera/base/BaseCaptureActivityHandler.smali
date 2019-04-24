.class public abstract Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivityHandler;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivityHandler$State;
    }
.end annotation


# instance fields
.field private b:Lcom/huawei/wallet/ui/idencard/camera/base/DecodeThread;

.field private c:Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivityHandler$State;

.field private d:Z

.field private e:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivity;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivity;)V
    .locals 1

    .line 61
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 62
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivityHandler;->e:Ljava/lang/ref/WeakReference;

    .line 63
    invoke-virtual {p0, p1}, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivityHandler;->c(Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivity;)Lcom/huawei/wallet/ui/idencard/camera/base/DecodeThread;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivityHandler;->b:Lcom/huawei/wallet/ui/idencard/camera/base/DecodeThread;

    .line 64
    invoke-virtual {p0}, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivityHandler;->e()V

    .line 65
    return-void
.end method

.method private c()V
    .locals 3

    .line 176
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivityHandler;->b:Lcom/huawei/wallet/ui/idencard/camera/base/DecodeThread;

    invoke-virtual {v0}, Lcom/huawei/wallet/ui/idencard/camera/base/DecodeThread;->isAlive()Z

    move-result v0

    if-nez v0, :cond_0

    .line 178
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivityHandler;->b:Lcom/huawei/wallet/ui/idencard/camera/base/DecodeThread;

    invoke-virtual {v0}, Lcom/huawei/wallet/ui/idencard/camera/base/DecodeThread;->start()V

    .line 180
    :cond_0
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivityHandler;->c:Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivityHandler$State;

    sget-object v1, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivityHandler$State;->c:Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivityHandler$State;

    if-ne v0, v1, :cond_1

    .line 182
    sget-object v0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivityHandler$State;->a:Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivityHandler$State;

    iput-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivityHandler;->c:Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivityHandler$State;

    .line 183
    invoke-static {}, Lcom/huawei/wallet/ui/idencard/camera/base/CameraManager;->e()Lcom/huawei/wallet/ui/idencard/camera/base/CameraManager;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivityHandler;->b:Lcom/huawei/wallet/ui/idencard/camera/base/DecodeThread;

    invoke-virtual {v1}, Lcom/huawei/wallet/ui/idencard/camera/base/DecodeThread;->c()Landroid/os/Handler;

    move-result-object v1

    const/4 v2, 0x2

    invoke-virtual {v0, v1, v2}, Lcom/huawei/wallet/ui/idencard/camera/base/CameraManager;->a(Landroid/os/Handler;I)V

    .line 184
    invoke-static {}, Lcom/huawei/wallet/ui/idencard/camera/base/CameraManager;->e()Lcom/huawei/wallet/ui/idencard/camera/base/CameraManager;

    move-result-object v0

    const/4 v1, 0x7

    invoke-virtual {v0, p0, v1}, Lcom/huawei/wallet/ui/idencard/camera/base/CameraManager;->d(Landroid/os/Handler;I)V

    .line 186
    :cond_1
    return-void
.end method


# virtual methods
.method public b()V
    .locals 4

    .line 150
    sget-object v0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivityHandler$State;->e:Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivityHandler$State;

    iput-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivityHandler;->c:Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivityHandler$State;

    .line 151
    invoke-static {}, Lcom/huawei/wallet/ui/idencard/camera/base/CameraManager;->e()Lcom/huawei/wallet/ui/idencard/camera/base/CameraManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/wallet/ui/idencard/camera/base/CameraManager;->h()V

    .line 152
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivityHandler;->b:Lcom/huawei/wallet/ui/idencard/camera/base/DecodeThread;

    invoke-virtual {v0}, Lcom/huawei/wallet/ui/idencard/camera/base/DecodeThread;->c()Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x6

    invoke-static {v0, v1}, Landroid/os/Message;->obtain(Landroid/os/Handler;I)Landroid/os/Message;

    move-result-object v2

    .line 153
    invoke-virtual {v2}, Landroid/os/Message;->sendToTarget()V

    .line 156
    :try_start_0
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivityHandler;->b:Lcom/huawei/wallet/ui/idencard/camera/base/DecodeThread;

    invoke-virtual {v0}, Lcom/huawei/wallet/ui/idencard/camera/base/DecodeThread;->join()V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 161
    goto :goto_0

    .line 158
    :catch_0
    move-exception v3

    .line 160
    const-string v0, "stop decodeThread ,exit Camera"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->a(Ljava/lang/String;Z)V

    .line 164
    :goto_0
    const/4 v0, 0x4

    invoke-virtual {p0, v0}, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivityHandler;->removeMessages(I)V

    .line 165
    const/4 v0, 0x5

    invoke-virtual {p0, v0}, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivityHandler;->removeMessages(I)V

    .line 166
    const/4 v0, 0x7

    invoke-virtual {p0, v0}, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivityHandler;->removeMessages(I)V

    .line 167
    invoke-static {}, Lcom/huawei/wallet/ui/idencard/camera/base/CameraManager;->e()Lcom/huawei/wallet/ui/idencard/camera/base/CameraManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/wallet/ui/idencard/camera/base/CameraManager;->a()V

    .line 168
    return-void
.end method

.method protected abstract c(Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivity;)Lcom/huawei/wallet/ui/idencard/camera/base/DecodeThread;
.end method

.method public e()V
    .locals 1

    .line 74
    sget-object v0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivityHandler$State;->c:Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivityHandler$State;

    iput-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivityHandler;->c:Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivityHandler$State;

    .line 75
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivityHandler;->d:Z

    .line 77
    invoke-static {}, Lcom/huawei/wallet/ui/idencard/camera/base/CameraManager;->e()Lcom/huawei/wallet/ui/idencard/camera/base/CameraManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/wallet/ui/idencard/camera/base/CameraManager;->b()V

    .line 78
    invoke-direct {p0}, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivityHandler;->c()V

    .line 79
    return-void
.end method

.method public handleMessage(Landroid/os/Message;)V
    .locals 7

    .line 84
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 85
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivityHandler;->e:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivity;

    .line 86
    const/4 v0, 0x0

    if-ne v0, v3, :cond_0

    .line 88
    const-string v0, "BaseCaptureActivityHandler baseCaptureActivity is null. "

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->b(Ljava/lang/String;Z)V

    .line 89
    return-void

    .line 91
    :cond_0
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_1

    .line 95
    :pswitch_0
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivityHandler;->c:Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivityHandler$State;

    sget-object v1, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivityHandler$State;->a:Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivityHandler$State;

    if-ne v0, v1, :cond_5

    iget-boolean v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivityHandler;->d:Z

    if-nez v0, :cond_5

    .line 97
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivityHandler;->d:Z

    .line 98
    const-string v0, "request auto focus message"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->a(Ljava/lang/String;Z)V

    .line 99
    invoke-static {}, Lcom/huawei/wallet/ui/idencard/camera/base/CameraManager;->e()Lcom/huawei/wallet/ui/idencard/camera/base/CameraManager;

    move-result-object v0

    const/4 v1, 0x7

    invoke-virtual {v0, p0, v1}, Lcom/huawei/wallet/ui/idencard/camera/base/CameraManager;->d(Landroid/os/Handler;I)V

    goto/16 :goto_1

    .line 103
    :pswitch_1
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivityHandler;->d:Z

    .line 104
    const-string v0, "response auto focus message"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->a(Ljava/lang/String;Z)V

    .line 105
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivityHandler;->b:Lcom/huawei/wallet/ui/idencard/camera/base/DecodeThread;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivityHandler;->b:Lcom/huawei/wallet/ui/idencard/camera/base/DecodeThread;

    invoke-virtual {v0}, Lcom/huawei/wallet/ui/idencard/camera/base/DecodeThread;->getState()Ljava/lang/Thread$State;

    move-result-object v0

    sget-object v1, Ljava/lang/Thread$State;->TERMINATED:Ljava/lang/Thread$State;

    if-ne v0, v1, :cond_2

    .line 107
    :cond_1
    const-string v0, "Got focus but decodeThread had died"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->b(Ljava/lang/String;Z)V

    .line 108
    return-void

    .line 110
    :cond_2
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    instance-of v0, v0, Ljava/lang/Boolean;

    if-eqz v0, :cond_5

    .line 113
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    .line 114
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivityHandler;->b:Lcom/huawei/wallet/ui/idencard/camera/base/DecodeThread;

    invoke-virtual {v0}, Lcom/huawei/wallet/ui/idencard/camera/base/DecodeThread;->getState()Ljava/lang/Thread$State;

    move-result-object v0

    sget-object v1, Ljava/lang/Thread$State;->TERMINATED:Ljava/lang/Thread$State;

    if-eq v0, v1, :cond_3

    .line 116
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivityHandler;->b:Lcom/huawei/wallet/ui/idencard/camera/base/DecodeThread;

    invoke-virtual {v0}, Lcom/huawei/wallet/ui/idencard/camera/base/DecodeThread;->c()Landroid/os/Handler;

    move-result-object v0

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const/4 v2, 0x7

    invoke-virtual {v0, v2, v1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v5

    .line 117
    invoke-virtual {v5}, Landroid/os/Message;->sendToTarget()V

    .line 119
    :cond_3
    goto :goto_1

    .line 122
    :pswitch_2
    const-string v0, "Got restart preview message"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->a(Ljava/lang/String;Z)V

    .line 123
    invoke-direct {p0}, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivityHandler;->c()V

    .line 124
    goto :goto_1

    .line 126
    :pswitch_3
    const-string v0, "Got decode succeeded message"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->a(Ljava/lang/String;Z)V

    .line 127
    sget-object v0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivityHandler$State;->c:Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivityHandler$State;

    iput-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivityHandler;->c:Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivityHandler$State;

    .line 128
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v4

    .line 129
    if-nez v4, :cond_4

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    goto :goto_0

    :cond_4
    const-string v0, "beginTime"

    invoke-virtual {v4, v0}, Landroid/os/Bundle;->getLong(Ljava/lang/String;)J

    move-result-wide v5

    .line 131
    :goto_0
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    invoke-virtual {v3, v0, v5, v6}, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivity;->a(Ljava/lang/Object;J)V

    .line 132
    goto :goto_1

    .line 135
    :pswitch_4
    const-string v0, "Got decode failed message"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->a(Ljava/lang/String;Z)V

    .line 136
    sget-object v0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivityHandler$State;->a:Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivityHandler$State;

    iput-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivityHandler;->c:Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivityHandler$State;

    .line 137
    invoke-static {}, Lcom/huawei/wallet/ui/idencard/camera/base/CameraManager;->e()Lcom/huawei/wallet/ui/idencard/camera/base/CameraManager;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivityHandler;->b:Lcom/huawei/wallet/ui/idencard/camera/base/DecodeThread;

    invoke-virtual {v1}, Lcom/huawei/wallet/ui/idencard/camera/base/DecodeThread;->c()Landroid/os/Handler;

    move-result-object v1

    const/4 v2, 0x2

    invoke-virtual {v0, v1, v2}, Lcom/huawei/wallet/ui/idencard/camera/base/CameraManager;->a(Landroid/os/Handler;I)V

    .line 138
    .line 142
    :cond_5
    :goto_1
    :pswitch_5
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_5
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_1
    .end packed-switch
.end method
