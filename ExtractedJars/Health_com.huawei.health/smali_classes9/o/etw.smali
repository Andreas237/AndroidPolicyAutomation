.class public Lo/etw;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Lo/etw;


# instance fields
.field private b:Lo/enz;

.field private c:Lo/eaa;

.field private d:Landroid/os/Handler;

.field private e:Landroid/content/Context;

.field private f:Lcom/huawei/pluginmessagecenter/service/MessageObserver;

.field private g:Z

.field private h:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

.field private i:Lo/etq;

.field private k:Z

.field private m:Ljava/lang/Runnable;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 32
    const/4 v0, 0x0

    sput-object v0, Lo/etw;->a:Lo/etw;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    const/4 v0, 0x0

    iput-object v0, p0, Lo/etw;->c:Lo/eaa;

    .line 35
    const/4 v0, 0x0

    iput-object v0, p0, Lo/etw;->d:Landroid/os/Handler;

    .line 37
    const/4 v0, 0x0

    iput-object v0, p0, Lo/etw;->h:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    .line 39
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/etw;->k:Z

    .line 40
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/etw;->g:Z

    .line 59
    new-instance v0, Lo/etw$5;

    invoke-direct {v0, p0}, Lo/etw$5;-><init>(Lo/etw;)V

    iput-object v0, p0, Lo/etw;->f:Lcom/huawei/pluginmessagecenter/service/MessageObserver;

    .line 114
    new-instance v0, Lo/etw$3;

    invoke-direct {v0, p0}, Lo/etw$3;-><init>(Lo/etw;)V

    iput-object v0, p0, Lo/etw;->m:Ljava/lang/Runnable;

    .line 43
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/etw;->k:Z

    .line 44
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/etw;->g:Z

    .line 45
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lo/etw;->e:Landroid/content/Context;

    .line 46
    iget-object v0, p0, Lo/etw;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/eaa;->c(Landroid/content/Context;)Lo/eaa;

    move-result-object v0

    iput-object v0, p0, Lo/etw;->c:Lo/eaa;

    .line 47
    iget-object v0, p0, Lo/etw;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/enz;->b(Landroid/content/Context;)Lo/enz;

    move-result-object v0

    iput-object v0, p0, Lo/etw;->b:Lo/enz;

    .line 48
    iget-object v0, p0, Lo/etw;->b:Lo/enz;

    invoke-virtual {v0}, Lo/enz;->b()Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    move-result-object v0

    iput-object v0, p0, Lo/etw;->h:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    .line 49
    invoke-static {}, Lo/etq;->d()Lo/etq;

    move-result-object v0

    iput-object v0, p0, Lo/etw;->i:Lo/etq;

    .line 50
    return-void
.end method

.method static synthetic c(Lo/etw;)Lo/eaa;
    .locals 1

    .line 30
    iget-object v0, p0, Lo/etw;->c:Lo/eaa;

    return-object v0
.end method

.method static synthetic c(Lo/etw;Z)Z
    .locals 0

    .line 30
    iput-boolean p1, p0, Lo/etw;->g:Z

    return p1
.end method

.method static synthetic d(Lo/etw;)Ljava/lang/Runnable;
    .locals 1

    .line 30
    iget-object v0, p0, Lo/etw;->m:Ljava/lang/Runnable;

    return-object v0
.end method

.method public static d()Lo/etw;
    .locals 2

    .line 53
    sget-object v0, Lo/etw;->a:Lo/etw;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 54
    new-instance v0, Lo/etw;

    invoke-direct {v0}, Lo/etw;-><init>()V

    sput-object v0, Lo/etw;->a:Lo/etw;

    .line 56
    :cond_0
    sget-object v0, Lo/etw;->a:Lo/etw;

    return-object v0
.end method

.method static synthetic d(Lo/etw;Z)Z
    .locals 0

    .line 30
    iput-boolean p1, p0, Lo/etw;->k:Z

    return p1
.end method

.method static synthetic e(Lo/etw;)Landroid/os/Handler;
    .locals 1

    .line 30
    iget-object v0, p0, Lo/etw;->d:Landroid/os/Handler;

    return-object v0
.end method


# virtual methods
.method public a(Landroid/os/Handler;)V
    .locals 4

    .line 68
    iput-object p1, p0, Lo/etw;->d:Landroid/os/Handler;

    .line 69
    iget-object v0, p0, Lo/etw;->c:Lo/eaa;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lo/etw;->f:Lcom/huawei/pluginmessagecenter/service/MessageObserver;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 70
    const-string v0, "NotificationCardInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "openMessageObserver registerMessageObserver"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 71
    iget-object v0, p0, Lo/etw;->c:Lo/eaa;

    iget-object v1, p0, Lo/etw;->f:Lcom/huawei/pluginmessagecenter/service/MessageObserver;

    invoke-virtual {v0, v1}, Lo/eaa;->e(Lcom/huawei/pluginmessagecenter/service/MessageObserver;)V

    .line 73
    :cond_0
    return-void
.end method

.method public b()V
    .locals 0

    .line 88
    return-void
.end method

.method public c()V
    .locals 2

    .line 76
    iget-object v0, p0, Lo/etw;->c:Lo/eaa;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lo/etw;->f:Lcom/huawei/pluginmessagecenter/service/MessageObserver;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 77
    iget-object v0, p0, Lo/etw;->c:Lo/eaa;

    iget-object v1, p0, Lo/etw;->f:Lcom/huawei/pluginmessagecenter/service/MessageObserver;

    invoke-virtual {v0, v1}, Lo/eaa;->d(Lcom/huawei/pluginmessagecenter/service/MessageObserver;)V

    .line 79
    :cond_0
    return-void
.end method

.method public c(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 0

    .line 84
    return-void
.end method

.method public d(Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;)V
    .locals 14

    .line 123
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    iget-object v0, p0, Lo/etw;->i:Lo/etq;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 124
    :cond_0
    const-string v0, "FAQ"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "return MessageObject is null !!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 125
    return-void

    .line 128
    :cond_1
    const-string v0, "FAQ"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Enter pushMessageToDevice !!!!! mDeviceStateInteractors.getCurrentDeviceType() = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/etw;->i:Lo/etq;

    invoke-virtual {v3}, Lo/etq;->f()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 130
    iget-object v0, p0, Lo/etw;->h:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    iget-object v0, p0, Lo/etw;->h:Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportMessageCenterPushDevice()Z

    move-result v0

    if-nez v0, :cond_3

    .line 131
    :cond_2
    const-string v0, "FAQ"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "return deviceCapability notSupport pushMessageToDevice !!!!! msgObj = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 133
    iget-object v0, p0, Lo/etw;->i:Lo/etq;

    invoke-virtual {v0}, Lo/etq;->f()I

    move-result v0

    const/16 v1, 0xa

    if-eq v0, v1, :cond_3

    .line 134
    const-string v0, "FAQ"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "return deviceCapability notSupport pushMessageToDevice && not Leo!!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 135
    return-void

    .line 138
    :cond_3
    const-string v0, "FAQ"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "pushMessageToDevice  MessageObject = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 139
    iget-boolean v0, p0, Lo/etw;->g:Z

    if-eqz v0, :cond_4

    .line 140
    return-void

    .line 143
    :cond_4
    invoke-virtual {p1}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getExpireTime()J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    div-long v10, v0, v2

    .line 144
    invoke-virtual {p1}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getMsgId()Ljava/lang/String;

    move-result-object v12

    .line 146
    const-string v0, "FAQ"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "pushMessageToDevice !!!!! exprTime = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v10, v11}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 148
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dde;->d(Landroid/content/Context;)Lo/dde;

    move-result-object v13

    .line 149
    const/4 v0, 0x0

    if-eq v0, v13, :cond_6

    iget-object v0, p0, Lo/etw;->i:Lo/etq;

    invoke-virtual {v0}, Lo/etq;->a()I

    move-result v0

    const/4 v1, 0x2

    if-ne v1, v0, :cond_6

    .line 158
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/etw;->g:Z

    .line 160
    iget-object v0, p0, Lo/etw;->d:Landroid/os/Handler;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_5

    .line 161
    iget-object v0, p0, Lo/etw;->d:Landroid/os/Handler;

    iget-object v1, p0, Lo/etw;->m:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 162
    iget-object v0, p0, Lo/etw;->d:Landroid/os/Handler;

    iget-object v1, p0, Lo/etw;->m:Ljava/lang/Runnable;

    const-wide/16 v2, 0x7530

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 165
    :cond_5
    move-object v0, v13

    invoke-virtual {p1}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getMsgId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getMsgType()I

    move-result v2

    move-wide v3, v10

    invoke-virtual {p1}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getMsgTitle()Ljava/lang/String;

    move-result-object v6

    .line 166
    invoke-virtual {p1}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getMsgContent()Ljava/lang/String;

    move-result-object v7

    new-instance v9, Lo/etw$1;

    invoke-direct {v9, p0, v12}, Lo/etw$1;-><init>(Lo/etw;Ljava/lang/String;)V

    .line 165
    const/4 v5, 0x1

    const/4 v8, 0x0

    invoke-virtual/range {v0 .. v9}, Lo/dde;->a(Ljava/lang/String;IJILjava/lang/String;Ljava/lang/String;[BLcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    goto :goto_0

    .line 183
    :cond_6
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/etw;->g:Z

    .line 185
    :goto_0
    return-void
.end method

.method public e()V
    .locals 4

    .line 92
    iget-boolean v0, p0, Lo/etw;->k:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lo/etw;->g:Z

    if-eqz v0, :cond_1

    .line 93
    :cond_0
    const-string v0, "NotificationCardInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getFAQMessageProcess mGetFaqMessgeState is true return!!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 94
    return-void

    .line 97
    :cond_1
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/etw;->k:Z

    .line 99
    iget-object v0, p0, Lo/etw;->c:Lo/eaa;

    new-instance v1, Lo/etw$4;

    invoke-direct {v1, p0}, Lo/etw$4;-><init>(Lo/etw;)V

    invoke-virtual {v0, v1}, Lo/eaa;->d(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 112
    return-void
.end method
