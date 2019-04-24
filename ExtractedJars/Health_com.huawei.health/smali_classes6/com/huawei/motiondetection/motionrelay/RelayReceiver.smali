.class Lcom/huawei/motiondetection/motionrelay/RelayReceiver;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# static fields
.field private static final TAG:Ljava/lang/String; = "RelayReceiver"


# instance fields
.field private mHandler:Landroid/os/Handler;

.field private mMsg:Landroid/os/Message;


# direct methods
.method protected constructor <init>(Landroid/os/Handler;)V
    .locals 1

    .line 55
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    .line 46
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/motiondetection/motionrelay/RelayReceiver;->mHandler:Landroid/os/Handler;

    .line 48
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/motiondetection/motionrelay/RelayReceiver;->mMsg:Landroid/os/Message;

    .line 56
    iput-object p1, p0, Lcom/huawei/motiondetection/motionrelay/RelayReceiver;->mHandler:Landroid/os/Handler;

    .line 57
    return-void
.end method


# virtual methods
.method protected destroy()V
    .locals 1

    .line 63
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/motiondetection/motionrelay/RelayReceiver;->mHandler:Landroid/os/Handler;

    .line 64
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/motiondetection/motionrelay/RelayReceiver;->mMsg:Landroid/os/Message;

    .line 65
    return-void
.end method

.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 4

    .line 77
    const-string v0, "RelayReceiver"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "onReceive intent.getAction: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/motiondetection/MRLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 80
    :try_start_0
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/motiondetection/motionrelay/RelayReceiver;->mMsg:Landroid/os/Message;

    .line 81
    iget-object v0, p0, Lcom/huawei/motiondetection/motionrelay/RelayReceiver;->mMsg:Landroid/os/Message;

    const/4 v1, 0x1

    iput v1, v0, Landroid/os/Message;->what:I

    .line 82
    iget-object v0, p0, Lcom/huawei/motiondetection/motionrelay/RelayReceiver;->mMsg:Landroid/os/Message;

    iput-object p2, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 84
    iget-object v0, p0, Lcom/huawei/motiondetection/motionrelay/RelayReceiver;->mHandler:Landroid/os/Handler;

    iget-object v1, p0, Lcom/huawei/motiondetection/motionrelay/RelayReceiver;->mMsg:Landroid/os/Message;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 85
    :catch_0
    move-exception v3

    .line 86
    const-string v0, "RelayReceiver"

    invoke-virtual {v3}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/motiondetection/MRLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 89
    :goto_0
    return-void
.end method
