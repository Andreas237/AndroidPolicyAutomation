.class public Lo/dma;
.super Lo/dlv;
.source "SourceFile"


# instance fields
.field private a:Lcom/huawei/pluginmessagecenter/service/MessageObserver;

.field private c:Lo/eaa;

.field private d:Lo/dln;

.field private e:Ljava/util/concurrent/ExecutorService;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 4

    .line 37
    invoke-direct {p0, p1}, Lo/dlv;-><init>(Landroid/content/Context;)V

    .line 45
    new-instance v0, Lo/dma$2;

    invoke-direct {v0, p0}, Lo/dma$2;-><init>(Lo/dma;)V

    iput-object v0, p0, Lo/dma;->a:Lcom/huawei/pluginmessagecenter/service/MessageObserver;

    .line 38
    const-string v0, "SMART_MsgCenterSmarter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MsgCenterSmarter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 39
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lo/dma;->b:Landroid/content/Context;

    .line 40
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lo/dma;->e:Ljava/util/concurrent/ExecutorService;

    .line 41
    iget-object v0, p0, Lo/dma;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/eaa;->c(Landroid/content/Context;)Lo/eaa;

    move-result-object v0

    iput-object v0, p0, Lo/dma;->c:Lo/eaa;

    .line 42
    iget-object v0, p0, Lo/dma;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/dln;->e(Landroid/content/Context;)Lo/dln;

    move-result-object v0

    iput-object v0, p0, Lo/dma;->d:Lo/dln;

    .line 43
    return-void
.end method

.method private a(Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;I)Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;
    .locals 4

    .line 118
    new-instance v2, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;

    invoke-direct {v2}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;-><init>()V

    .line 119
    invoke-virtual {v2, p2}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->setMsgType(I)V

    .line 120
    const-string v0, "100000"

    invoke-virtual {v2, v0}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->setShowMethod(Ljava/lang/String;)V

    .line 121
    invoke-virtual {p1}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getCreateTime()J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->setUpdateTime(J)V

    .line 122
    const-string v0, "00002400"

    invoke-virtual {v2, v0}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->setShowTime(Ljava/lang/String;)V

    .line 123
    const/4 v0, 0x4

    invoke-virtual {v2, v0}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->setMsgContentType(I)V

    .line 124
    invoke-virtual {p1}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getExpireTime()J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->setExpireTime(J)V

    .line 127
    new-instance v3, Lcom/huawei/hwsmartinteractmgr/data/msgcontent/NotificationMsgContent;

    invoke-direct {v3}, Lcom/huawei/hwsmartinteractmgr/data/msgcontent/NotificationMsgContent;-><init>()V

    .line 128
    invoke-virtual {p1}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getMsgTitle()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/hwsmartinteractmgr/data/msgcontent/NotificationMsgContent;->setContent(Ljava/lang/String;)V

    .line 129
    invoke-virtual {p1}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getMsgId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/hwsmartinteractmgr/data/msgcontent/NotificationMsgContent;->setNotificationId(Ljava/lang/String;)V

    .line 130
    invoke-virtual {p1}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getType()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/hwsmartinteractmgr/data/msgcontent/NotificationMsgContent;->setType(Ljava/lang/String;)V

    .line 131
    invoke-virtual {p1}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getDetailUri()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/hwsmartinteractmgr/data/msgcontent/NotificationMsgContent;->setUrl(Ljava/lang/String;)V

    .line 133
    invoke-static {}, Lo/dmo;->d()Lo/dmo;

    move-result-object v0

    const-class v1, Lcom/huawei/hwsmartinteractmgr/data/msgcontent/NotificationMsgContent;

    invoke-virtual {v0, v3, v1}, Lo/dmo;->b(Ljava/lang/Object;Ljava/lang/reflect/Type;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->setMsgContent(Ljava/lang/String;)V

    .line 134
    const/4 v0, 0x5

    invoke-virtual {v2, v0}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->setMsgSrc(I)V

    .line 135
    const/16 v0, 0x3e8

    invoke-virtual {v2, v0}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->setPriority(I)V

    .line 136
    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->setStatus(I)V

    .line 138
    return-object v2
.end method

.method private a(Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;)Z
    .locals 2

    .line 180
    const/4 v0, 0x0

    if-eq v0, p1, :cond_1

    invoke-virtual {p1}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getMsgId()Ljava/lang/String;

    move-result-object v0

    const-string v1, "G"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getMsgId()Ljava/lang/String;

    move-result-object v0

    const-string v1, "S"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 181
    :cond_0
    const/4 v0, 0x1

    return v0

    .line 183
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method private b(I)Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;
    .locals 5

    .line 147
    iget-object v0, p0, Lo/dma;->c:Lo/eaa;

    invoke-virtual {v0}, Lo/eaa;->d()Ljava/util/List;

    move-result-object v1

    .line 148
    const/4 v2, 0x0

    .line 149
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;

    .line 150
    const v0, 0xc351

    if-ne v0, p1, :cond_0

    invoke-direct {p0, v4}, Lo/dma;->a(Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 151
    move-object v2, v4

    .line 152
    goto :goto_1

    .line 154
    :cond_0
    const v0, 0xc350

    if-ne v0, p1, :cond_1

    invoke-direct {p0, v4}, Lo/dma;->a(Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-direct {p0, v4}, Lo/dma;->e(Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 155
    move-object v2, v4

    .line 156
    goto :goto_1

    .line 158
    :cond_1
    goto :goto_0

    .line 159
    :cond_2
    :goto_1
    return-object v2
.end method

.method static synthetic b(Lo/dma;)Ljava/util/concurrent/ExecutorService;
    .locals 1

    .line 26
    iget-object v0, p0, Lo/dma;->e:Ljava/util/concurrent/ExecutorService;

    return-object v0
.end method

.method private e(ILcom/huawei/pluginmessagecenter/provider/data/MessageObject;)Z
    .locals 5

    .line 103
    new-instance v3, Lcom/huawei/hwsmartinteractmgr/data/msgcontent/NotificationMsgContent;

    invoke-direct {v3}, Lcom/huawei/hwsmartinteractmgr/data/msgcontent/NotificationMsgContent;-><init>()V

    .line 104
    invoke-virtual {p2}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getMsgTitle()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/hwsmartinteractmgr/data/msgcontent/NotificationMsgContent;->setContent(Ljava/lang/String;)V

    .line 105
    invoke-virtual {p2}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getMsgId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/hwsmartinteractmgr/data/msgcontent/NotificationMsgContent;->setNotificationId(Ljava/lang/String;)V

    .line 106
    invoke-virtual {p2}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getType()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/hwsmartinteractmgr/data/msgcontent/NotificationMsgContent;->setType(Ljava/lang/String;)V

    .line 107
    invoke-virtual {p2}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getDetailUri()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/hwsmartinteractmgr/data/msgcontent/NotificationMsgContent;->setUrl(Ljava/lang/String;)V

    .line 109
    new-instance v4, Landroid/content/ContentValues;

    invoke-direct {v4}, Landroid/content/ContentValues;-><init>()V

    .line 110
    const-string v0, "msgContent"

    invoke-static {}, Lo/dmo;->d()Lo/dmo;

    move-result-object v1

    const-class v2, Lcom/huawei/hwsmartinteractmgr/data/msgcontent/NotificationMsgContent;

    invoke-virtual {v1, v3, v2}, Lo/dmo;->b(Ljava/lang/Object;Ljava/lang/reflect/Type;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 111
    const-string v0, "expireTime"

    invoke-virtual {p2}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getExpireTime()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 114
    iget-object v0, p0, Lo/dma;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/dln;->e(Landroid/content/Context;)Lo/dln;

    move-result-object v0

    invoke-virtual {v0, p1, v4}, Lo/dln;->d(ILandroid/content/ContentValues;)Z

    move-result v0

    return v0
.end method

.method private e(Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;)Z
    .locals 2

    .line 168
    const/4 v0, 0x0

    if-eq v0, p1, :cond_1

    const-string v0, "weekReportMessage"

    invoke-virtual {p1}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getType()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "monthReportMessage"

    invoke-virtual {p1}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getType()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 169
    :cond_0
    const/4 v0, 0x1

    return v0

    .line 171
    :cond_1
    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 190
    iget-object v0, p0, Lo/dma;->c:Lo/eaa;

    iget-object v1, p0, Lo/dma;->a:Lcom/huawei/pluginmessagecenter/service/MessageObserver;

    invoke-virtual {v0, v1}, Lo/eaa;->e(Lcom/huawei/pluginmessagecenter/service/MessageObserver;)V

    .line 191
    return-void
.end method

.method public c()V
    .locals 2

    .line 197
    iget-object v0, p0, Lo/dma;->c:Lo/eaa;

    iget-object v1, p0, Lo/dma;->a:Lcom/huawei/pluginmessagecenter/service/MessageObserver;

    invoke-virtual {v0, v1}, Lo/eaa;->d(Lcom/huawei/pluginmessagecenter/service/MessageObserver;)V

    .line 198
    return-void
.end method

.method public d()V
    .locals 4

    .line 63
    const-string v0, "SMART_MsgCenterSmarter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startRuleByUser"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 64
    const v0, 0xc351

    invoke-virtual {p0, v0}, Lo/dma;->e(I)V

    .line 65
    const v0, 0xc350

    invoke-virtual {p0, v0}, Lo/dma;->e(I)V

    .line 66
    return-void
.end method

.method public e(I)V
    .locals 11

    .line 69
    invoke-direct {p0, p1}, Lo/dma;->b(I)Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;

    move-result-object v4

    .line 70
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 71
    iget-object v0, p0, Lo/dma;->d:Lo/dln;

    invoke-virtual {v0, p1}, Lo/dln;->d(I)I

    move-result v5

    .line 72
    const-string v0, "SMART_MsgCenterSmarter"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "no message msgType = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " delResult="

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 73
    return-void

    .line 75
    :cond_0
    const-string v0, "SMART_MsgCenterSmarter"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "msgType = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " msgId = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-virtual {v4}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getMsgId()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 76
    iget-object v0, p0, Lo/dma;->d:Lo/dln;

    invoke-virtual {v0, p1}, Lo/dln;->b(I)Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;

    move-result-object v5

    .line 77
    const/4 v0, 0x0

    if-ne v0, v5, :cond_1

    .line 78
    iget-object v0, p0, Lo/dma;->d:Lo/dln;

    invoke-direct {p0, v4, p1}, Lo/dma;->a(Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;I)Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/dln;->a(Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;)Z

    move-result v6

    .line 79
    const-string v0, "SMART_MsgCenterSmarter"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "msgType = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " insertResult="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 80
    return-void

    .line 82
    :cond_1
    invoke-virtual {v5}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->getMsgContent()Ljava/lang/String;

    move-result-object v6

    .line 84
    invoke-static {}, Lo/dmo;->d()Lo/dmo;

    move-result-object v0

    const-class v1, Lcom/huawei/hwsmartinteractmgr/data/msgcontent/NotificationMsgContent;

    invoke-virtual {v0, v6, v1}, Lo/dmo;->b(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/hwsmartinteractmgr/data/msgcontent/NotificationMsgContent;

    .line 85
    invoke-virtual {v7}, Lcom/huawei/hwsmartinteractmgr/data/msgcontent/NotificationMsgContent;->getNotificationId()Ljava/lang/String;

    move-result-object v8

    .line 87
    invoke-virtual {v4}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getMsgId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 89
    invoke-virtual {v5}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->getStatus()I

    move-result v0

    const/4 v1, 0x2

    if-eq v1, v0, :cond_2

    invoke-virtual {v5}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->getUpdateTime()J

    move-result-wide v0

    invoke-virtual {v4}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getCreateTime()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-eqz v0, :cond_3

    .line 91
    :cond_2
    invoke-virtual {v5}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->getId()I

    move-result v0

    invoke-direct {p0, v0, v4}, Lo/dma;->e(ILcom/huawei/pluginmessagecenter/provider/data/MessageObject;)Z

    move-result v9

    .line 92
    const-string v0, "SMART_MsgCenterSmarter"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "msgType = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " updResult= "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 94
    :cond_3
    const-string v0, "SMART_MsgCenterSmarter"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "msgType = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " oldId equals newId finish"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 96
    :cond_4
    iget-object v0, p0, Lo/dma;->d:Lo/dln;

    invoke-virtual {v0, p1}, Lo/dln;->d(I)I

    move-result v9

    .line 97
    iget-object v0, p0, Lo/dma;->d:Lo/dln;

    invoke-direct {p0, v4, p1}, Lo/dma;->a(Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;I)Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/dln;->a(Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;)Z

    move-result v10

    .line 98
    const-string v0, "SMART_MsgCenterSmarter"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "msgType = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " new msg delResult="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", insertResult="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 100
    :goto_0
    return-void
.end method
