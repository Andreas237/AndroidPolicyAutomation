.class public Lcom/huawei/nfc/carrera/lifecycle/swipeservice/TransactionChannelService;
.super Landroid/app/Service;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelCloseCallback;
.implements Lcom/huawei/nfc/carrera/logic/swipe/channel/GetDefaultCardCallback;


# static fields
.field private static final WAKE_LOCK_TIMEOUT:I = 0x2710

.field private static channelSwitchWakeLock:Landroid/os/PowerManager$WakeLock; = null


# instance fields
.field private defaultCardType:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 26
    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    .line 36
    const/4 v0, 0x1

    iput v0, p0, Lcom/huawei/nfc/carrera/lifecycle/swipeservice/TransactionChannelService;->defaultCardType:I

    return-void
.end method

.method private acquireWakelock()V
    .locals 4

    .line 92
    sget-object v0, Lcom/huawei/nfc/carrera/lifecycle/swipeservice/TransactionChannelService;->channelSwitchWakeLock:Landroid/os/PowerManager$WakeLock;

    if-nez v0, :cond_0

    .line 94
    const-string v0, "power"

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/lifecycle/swipeservice/TransactionChannelService;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroid/os/PowerManager;

    .line 95
    const-string v0, "channelWakeLock"

    const/4 v1, 0x1

    invoke-virtual {v3, v1, v0}, Landroid/os/PowerManager;->newWakeLock(ILjava/lang/String;)Landroid/os/PowerManager$WakeLock;

    move-result-object v0

    sput-object v0, Lcom/huawei/nfc/carrera/lifecycle/swipeservice/TransactionChannelService;->channelSwitchWakeLock:Landroid/os/PowerManager$WakeLock;

    .line 98
    sget-object v0, Lcom/huawei/nfc/carrera/lifecycle/swipeservice/TransactionChannelService;->channelSwitchWakeLock:Landroid/os/PowerManager$WakeLock;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/PowerManager$WakeLock;->setReferenceCounted(Z)V

    .line 102
    :cond_0
    sget-object v0, Lcom/huawei/nfc/carrera/lifecycle/swipeservice/TransactionChannelService;->channelSwitchWakeLock:Landroid/os/PowerManager$WakeLock;

    const-wide/16 v1, 0x2710

    invoke-virtual {v0, v1, v2}, Landroid/os/PowerManager$WakeLock;->acquire(J)V

    .line 103
    return-void
.end method

.method private close()V
    .locals 0

    .line 178
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/lifecycle/swipeservice/TransactionChannelService;->releaseWakelock()V

    .line 179
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/lifecycle/swipeservice/TransactionChannelService;->stopSelf()V

    .line 180
    return-void
.end method

.method private operateTransactionChannel()V
    .locals 2

    .line 128
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "operateTransactionChannel default card type "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/nfc/carrera/lifecycle/swipeservice/TransactionChannelService;->defaultCardType:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 130
    iget v0, p0, Lcom/huawei/nfc/carrera/lifecycle/swipeservice/TransactionChannelService;->defaultCardType:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 133
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/lifecycle/swipeservice/TransactionChannelService;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelManager;

    move-result-object v0

    iget v1, p0, Lcom/huawei/nfc/carrera/lifecycle/swipeservice/TransactionChannelService;->defaultCardType:I

    invoke-virtual {v0, v1, p0}, Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelManager;->disableTransactionChannel(ILcom/huawei/nfc/carrera/logic/swipe/channel/ChannelCloseCallback;)V

    goto :goto_0

    .line 138
    :cond_0
    invoke-static {}, Lcom/huawei/nfc/util/NFCFragmentUtil;->isPhoneSupportShutdownSwipe()Z

    move-result v0

    if-nez v0, :cond_1

    .line 140
    const-string v0, "operateTransactionChannel not support shutdown swipe."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 141
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/lifecycle/swipeservice/TransactionChannelService;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelManager;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelManager;->disableCardEmulation(Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelCloseCallback;)V

    goto :goto_0

    .line 146
    :cond_1
    const-string v0, "operateTransactionChannel support shutdown swipe."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 149
    :goto_0
    return-void
.end method

.method private releaseWakelock()V
    .locals 1

    .line 112
    sget-object v0, Lcom/huawei/nfc/carrera/lifecycle/swipeservice/TransactionChannelService;->channelSwitchWakeLock:Landroid/os/PowerManager$WakeLock;

    if-eqz v0, :cond_0

    .line 114
    const-string v0, "release the wake lock now."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 115
    sget-object v0, Lcom/huawei/nfc/carrera/lifecycle/swipeservice/TransactionChannelService;->channelSwitchWakeLock:Landroid/os/PowerManager$WakeLock;

    invoke-virtual {v0}, Landroid/os/PowerManager$WakeLock;->isHeld()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 117
    sget-object v0, Lcom/huawei/nfc/carrera/lifecycle/swipeservice/TransactionChannelService;->channelSwitchWakeLock:Landroid/os/PowerManager$WakeLock;

    invoke-virtual {v0}, Landroid/os/PowerManager$WakeLock;->release()V

    .line 120
    :cond_0
    return-void
.end method


# virtual methods
.method public closeChannelResult(Z)V
    .locals 2

    .line 154
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "close channel background result: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 155
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/lifecycle/swipeservice/TransactionChannelService;->close()V

    .line 156
    return-void
.end method

.method public getDefaultCardCallback(Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;)V
    .locals 1

    .line 161
    if-nez p1, :cond_0

    .line 163
    const-string v0, "TransactionChannelService getDefaultCardCallback defaultCard == null"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 164
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/lifecycle/swipeservice/TransactionChannelService;->close()V

    .line 165
    return-void

    .line 167
    :cond_0
    iget v0, p1, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->cardGroupType:I

    iput v0, p0, Lcom/huawei/nfc/carrera/lifecycle/swipeservice/TransactionChannelService;->defaultCardType:I

    .line 168
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/lifecycle/swipeservice/TransactionChannelService;->operateTransactionChannel()V

    .line 169
    return-void
.end method

.method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 1

    .line 46
    const/4 v0, 0x0

    return-object v0
.end method

.method public onCreate()V
    .locals 1

    .line 56
    invoke-super {p0}, Landroid/app/Service;->onCreate()V

    .line 57
    const-string v0, "TransactionChannelService onCreate."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 58
    return-void
.end method

.method public onDestroy()V
    .locals 1

    .line 80
    invoke-super {p0}, Landroid/app/Service;->onDestroy()V

    .line 81
    const-string v0, "TransactionChannelService onDestroy."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 82
    return-void
.end method

.method public onStartCommand(Landroid/content/Intent;II)I
    .locals 1

    .line 63
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 65
    const-string v0, "TransactionChannelService, but intent is illegal."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 66
    const/4 v0, 0x2

    return v0

    .line 68
    :cond_0
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/lifecycle/swipeservice/TransactionChannelService;->acquireWakelock()V

    .line 69
    invoke-super {p0, p1, p2, p3}, Landroid/app/Service;->onStartCommand(Landroid/content/Intent;II)I

    .line 70
    const-string v0, "TransactionChannelService onStartCommand"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 73
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/lifecycle/swipeservice/TransactionChannelService;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelManager;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelManager;->getDefaultCard(Lcom/huawei/nfc/carrera/logic/swipe/channel/GetDefaultCardCallback;)V

    .line 74
    const/4 v0, 0x2

    return v0
.end method
