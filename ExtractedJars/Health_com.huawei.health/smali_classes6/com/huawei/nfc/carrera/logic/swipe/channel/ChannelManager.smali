.class public Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelManager;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelManager$GetDefaultCardCallbackRunnable;,
        Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelManager$ChannelCloseResultRunnable;,
        Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelManager$ChannelOpenResultRunnable;
    }
.end annotation


# static fields
.field private static final CHANNEL_AVAILABLE_TIMEOUT:J = 0xfde8L

.field private static final SYNC_LOCK:[B

.field private static instance:Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelManager; = null


# instance fields
.field private channelHandler:Landroid/os/Handler;

.field private context:Landroid/content/Context;

.field private uiHandler:Landroid/os/Handler;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 52
    const/4 v0, 0x0

    new-array v0, v0, [B

    sput-object v0, Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelManager;->SYNC_LOCK:[B

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 4

    .line 60
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 61
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelManager;->context:Landroid/content/Context;

    .line 63
    new-instance v2, Landroid/os/HandlerThread;

    const-string v0, "channel_switch_handlers"

    invoke-direct {v2, v0}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    .line 64
    invoke-virtual {v2}, Landroid/os/HandlerThread;->start()V

    .line 65
    invoke-virtual {v2}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v3

    .line 66
    new-instance v0, Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelStateSwitchHandler;

    invoke-direct {v0, p1, v3}, Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelStateSwitchHandler;-><init>(Landroid/content/Context;Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelManager;->channelHandler:Landroid/os/Handler;

    .line 68
    new-instance v0, Landroid/os/Handler;

    invoke-virtual {p1}, Landroid/content/Context;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelManager;->uiHandler:Landroid/os/Handler;

    .line 69
    return-void
.end method

.method private cancelTimeoutAlarm()V
    .locals 6

    .line 390
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelManager;->context:Landroid/content/Context;

    const-string v1, "alarm"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/app/AlarmManager;

    .line 391
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelManager;->context:Landroid/content/Context;

    new-instance v1, Landroid/content/Intent;

    iget-object v2, p0, Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelManager;->context:Landroid/content/Context;

    const-class v3, Lcom/huawei/nfc/carrera/lifecycle/swipeservice/TransactionChannelService;

    invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const/4 v2, 0x0

    const/high16 v3, 0x8000000

    invoke-static {v0, v2, v1, v3}, Landroid/app/PendingIntent;->getService(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v5

    .line 393
    invoke-virtual {v4, v5}, Landroid/app/AlarmManager;->cancel(Landroid/app/PendingIntent;)V

    .line 394
    return-void
.end method

.method public static getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelManager;
    .locals 4

    .line 78
    sget-object v2, Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelManager;->SYNC_LOCK:[B

    monitor-enter v2

    .line 79
    :try_start_0
    sget-object v0, Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelManager;->instance:Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelManager;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 80
    new-instance v0, Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelManager;

    invoke-direct {v0, p0}, Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelManager;-><init>(Landroid/content/Context;)V

    sput-object v0, Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelManager;->instance:Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelManager;

    .line 83
    :cond_0
    sget-object v0, Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelManager;->instance:Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelManager;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    return-object v0

    .line 84
    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3
.end method

.method private sendTimeoutAlarm()V
    .locals 8

    .line 369
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelManager;->context:Landroid/content/Context;

    const-string v1, "alarm"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/app/AlarmManager;

    .line 372
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelManager;->context:Landroid/content/Context;

    new-instance v1, Landroid/content/Intent;

    iget-object v2, p0, Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelManager;->context:Landroid/content/Context;

    const-class v3, Lcom/huawei/nfc/carrera/lifecycle/swipeservice/TransactionChannelService;

    invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const/4 v2, 0x0

    const/high16 v3, 0x8000000

    invoke-static {v0, v2, v1, v3}, Landroid/app/PendingIntent;->getService(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v5

    .line 374
    invoke-virtual {v4, v5}, Landroid/app/AlarmManager;->cancel(Landroid/app/PendingIntent;)V

    .line 376
    const-wide/16 v6, 0x0

    .line 378
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    const-wide/32 v2, 0xfde8

    add-long v6, v0, v2

    .line 380
    const/4 v0, 0x2

    invoke-virtual {v4, v0, v6, v7, v5}, Landroid/app/AlarmManager;->set(IJLandroid/app/PendingIntent;)V

    .line 381
    return-void
.end method


# virtual methods
.method channelCloseCallback(Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelCloseCallback;ZI)V
    .locals 2

    .line 268
    if-eqz p2, :cond_0

    .line 270
    const-string v0, "close channel success, cancel timeout alarm."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 271
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelManager;->cancelTimeoutAlarm()V

    .line 274
    :cond_0
    const/4 v0, 0x0

    if-ne v0, p1, :cond_1

    .line 276
    const-string v0, "channelOpenCallback, no need to handle the result"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 277
    return-void

    .line 280
    :cond_1
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelManager;->uiHandler:Landroid/os/Handler;

    new-instance v1, Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelManager$ChannelCloseResultRunnable;

    invoke-direct {v1, p1, p2}, Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelManager$ChannelCloseResultRunnable;-><init>(Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelCloseCallback;Z)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 281
    return-void
.end method

.method channelOpenCallback(Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelOpenCallback;ZI)V
    .locals 2

    .line 221
    if-eqz p2, :cond_0

    .line 223
    const-string v0, "open channel success, set timeout alarm."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 224
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelManager;->sendTimeoutAlarm()V

    .line 227
    :cond_0
    const/4 v0, 0x0

    if-ne v0, p1, :cond_1

    .line 229
    const-string v0, "channelOpenCallback, no need to handle the result"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 230
    return-void

    .line 233
    :cond_1
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelManager;->uiHandler:Landroid/os/Handler;

    new-instance v1, Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelManager$ChannelOpenResultRunnable;

    invoke-direct {v1, p1, p2}, Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelManager$ChannelOpenResultRunnable;-><init>(Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelOpenCallback;Z)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 234
    return-void
.end method

.method public disableCardEmulation(Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelCloseCallback;)V
    .locals 2

    .line 187
    const-string v0, "disableCardEmulation"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 188
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v1

    .line 189
    const/4 v0, 0x7

    iput v0, v1, Landroid/os/Message;->what:I

    .line 190
    iput-object p1, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 191
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelManager;->channelHandler:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 192
    return-void
.end method

.method public disableTransactionChannel(ILcom/huawei/nfc/carrera/logic/swipe/channel/ChannelCloseCallback;)V
    .locals 2

    .line 124
    const-string v0, "disableTransactionChannel"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 125
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v1

    .line 126
    const/4 v0, 0x3

    iput v0, v1, Landroid/os/Message;->what:I

    .line 127
    iput p1, v1, Landroid/os/Message;->arg1:I

    .line 128
    iput-object p2, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 129
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelManager;->channelHandler:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 130
    return-void
.end method

.method public enableCardEmulation(Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelOpenCallback;)V
    .locals 2

    .line 173
    const-string v0, "enableCardEmulation"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 174
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v1

    .line 175
    const/4 v0, 0x6

    iput v0, v1, Landroid/os/Message;->what:I

    .line 176
    iput-object p1, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 177
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelManager;->channelHandler:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 178
    return-void
.end method

.method public enableTransactionChannelByFpPwd(ILcom/huawei/nfc/carrera/logic/swipe/channel/ChannelOpenCallback;)V
    .locals 2

    .line 94
    const-string v0, "enableTransactionChannelByFpPwd"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 95
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v1

    .line 96
    const/4 v0, 0x1

    iput v0, v1, Landroid/os/Message;->what:I

    .line 97
    iput p1, v1, Landroid/os/Message;->arg1:I

    .line 98
    iput-object p2, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 99
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelManager;->channelHandler:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 100
    return-void
.end method

.method public enableTransactionChannelByPayPwd(ILcom/huawei/nfc/carrera/logic/swipe/channel/ChannelOpenCallback;)V
    .locals 2

    .line 109
    const-string v0, "enableTransactionChannelByPayPwd"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 110
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v1

    .line 111
    const/4 v0, 0x2

    iput v0, v1, Landroid/os/Message;->what:I

    .line 112
    iput p1, v1, Landroid/os/Message;->arg1:I

    .line 113
    iput-object p2, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 114
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelManager;->channelHandler:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 115
    return-void
.end method

.method public getDefaultCard(Lcom/huawei/nfc/carrera/logic/swipe/channel/GetDefaultCardCallback;)V
    .locals 2

    .line 159
    const-string v0, "ChannelManager getDefaultCard"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 160
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v1

    .line 161
    const/4 v0, 0x5

    iput v0, v1, Landroid/os/Message;->what:I

    .line 162
    iput-object p1, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 163
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelManager;->channelHandler:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 164
    return-void
.end method

.method getDefaultCardCallback(Lcom/huawei/nfc/carrera/logic/swipe/channel/GetDefaultCardCallback;Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;)V
    .locals 2

    .line 330
    if-nez p1, :cond_0

    .line 332
    const-string v0, "ChannelManager getDefaultCardCallback, no need to handle the result"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 333
    return-void

    .line 336
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelManager;->uiHandler:Landroid/os/Handler;

    new-instance v1, Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelManager$GetDefaultCardCallbackRunnable;

    invoke-direct {v1, p1, p2}, Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelManager$GetDefaultCardCallbackRunnable;-><init>(Lcom/huawei/nfc/carrera/logic/swipe/channel/GetDefaultCardCallback;Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 337
    return-void
.end method

.method public setDefaultCard(Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/swipe/channel/SetDefaultCardCallback;)V
    .locals 3

    .line 141
    const-string v0, "ChannelManager setDefaultCard"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 142
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v1

    .line 143
    const/16 v0, 0x8

    iput v0, v1, Landroid/os/Message;->what:I

    .line 144
    const/16 v0, 0x51

    iput v0, v1, Landroid/os/Message;->arg1:I

    .line 145
    const/4 v0, 0x2

    new-array v2, v0, [Ljava/lang/Object;

    .line 146
    const/4 v0, 0x0

    aput-object p1, v2, v0

    .line 147
    const/4 v0, 0x1

    aput-object p2, v2, v0

    .line 148
    iput-object v2, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 149
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelManager;->channelHandler:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 150
    return-void
.end method

.method setDefaultCardCallback(Lcom/huawei/nfc/carrera/logic/swipe/channel/SetDefaultCardCallback;Z)V
    .locals 0

    .line 315
    if-eqz p1, :cond_0

    .line 317
    invoke-interface {p1, p2}, Lcom/huawei/nfc/carrera/logic/swipe/channel/SetDefaultCardCallback;->setDefaultCardCallback(Z)V

    .line 319
    :cond_0
    return-void
.end method

.method public setDefaultCardRFConf(IZ)V
    .locals 4

    .line 201
    const-string v0, "ChannelManager setDefaultCardRFConf"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 202
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v2

    .line 203
    const/16 v0, 0x8

    iput v0, v2, Landroid/os/Message;->what:I

    .line 204
    const/16 v0, 0x53

    iput v0, v2, Landroid/os/Message;->arg1:I

    .line 205
    const/4 v0, 0x2

    new-array v3, v0, [Ljava/lang/Object;

    .line 206
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v3, v1

    .line 207
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v3, v1

    .line 208
    iput-object v3, v2, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 209
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/swipe/channel/ChannelManager;->channelHandler:Landroid/os/Handler;

    invoke-virtual {v0, v2}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 210
    return-void
.end method
