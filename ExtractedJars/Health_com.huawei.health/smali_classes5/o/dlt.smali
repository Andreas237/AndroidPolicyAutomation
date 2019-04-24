.class public Lo/dlt;
.super Lo/dlv;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/dlt$c;,
        Lo/dlt$a;
    }
.end annotation


# instance fields
.field private d:Ljava/util/concurrent/ExecutorService;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 54
    invoke-direct {p0, p1}, Lo/dlv;-><init>(Landroid/content/Context;)V

    .line 55
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lo/dlt;->b:Landroid/content/Context;

    .line 56
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lo/dlt;->d:Ljava/util/concurrent/ExecutorService;

    .line 57
    return-void
.end method

.method private b(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 6

    .line 693
    iget-object v0, p0, Lo/dlt;->b:Landroid/content/Context;

    const/16 v1, 0x2725

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, p1}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 695
    const/16 v0, 0x7533

    invoke-static {v0, p2}, Lo/dmn;->a(ILjava/lang/String;)Z

    move-result v5

    .line 696
    const-string v0, "UIDV_InfoSmarter"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "userType = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    const-string v2, ", isNoLongerRecommend = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aput-object v4, v1, v2

    const-string v2, ", enable = "

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 698
    const-string v0, "1"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    if-nez v5, :cond_1

    .line 699
    :cond_0
    const/4 v0, 0x0

    return v0

    .line 701
    :cond_1
    const/4 v0, 0x1

    return v0
.end method

.method static synthetic b(Lo/dlt;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 1

    .line 47
    invoke-direct {p0, p1, p2}, Lo/dlt;->b(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method private c(I)V
    .locals 5

    .line 187
    iget-object v0, p0, Lo/dlt;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/dln;->e(Landroid/content/Context;)Lo/dln;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/dln;->b(I)Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;

    move-result-object v4

    .line 188
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    invoke-virtual {v4}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->getStatus()I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_0

    .line 189
    const-string v0, "UIDV_InfoSmarter"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "deleteAfterCheckStatus msgType = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 190
    iget-object v0, p0, Lo/dlt;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/dln;->e(Landroid/content/Context;)Lo/dln;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/dln;->d(I)I

    goto :goto_0

    .line 192
    :cond_0
    const-string v0, "UIDV_InfoSmarter"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "deleteAfterCheckStatus msgType = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, "no delete"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 194
    :goto_0
    return-void
.end method

.method static synthetic d(Lo/dlt;Ljava/lang/String;ILjava/lang/String;I)V
    .locals 0

    .line 47
    invoke-direct {p0, p1, p2, p3, p4}, Lo/dlt;->e(Ljava/lang/String;ILjava/lang/String;I)V

    return-void
.end method

.method private e(Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;ILjava/lang/String;I)V
    .locals 12

    .line 114
    iget-object v0, p0, Lo/dlt;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/dln;->e(Landroid/content/Context;)Lo/dln;

    move-result-object v0

    invoke-virtual {v0, p2}, Lo/dln;->b(I)Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;

    move-result-object v4

    .line 115
    const-string v5, ""

    .line 116
    const/4 v6, 0x0

    .line 117
    const-wide/16 v7, 0x0

    .line 119
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    .line 120
    invoke-virtual {v4}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->getId()I

    move-result v6

    .line 122
    :try_start_0
    new-instance v9, Lorg/json/JSONObject;

    invoke-virtual {v4}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->getMsgContent()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v9, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 123
    const-string v0, "msgId"

    invoke-virtual {v9, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    move-object v5, v0

    .line 124
    const-string v0, "createTime"

    invoke-virtual {v9, v0}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-wide v0

    move-wide v7, v0

    .line 127
    goto :goto_0

    .line 125
    :catch_0
    move-exception v9

    .line 126
    const-string v0, "UIDV_InfoSmarter"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "JSONException e = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v9}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 127
    goto :goto_0

    .line 129
    :cond_0
    const-string v0, "UIDV_InfoSmarter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "no oldMsgDBObject"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 133
    :goto_0
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p1}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getMsgId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getCreateTime()J

    move-result-wide v0

    cmp-long v0, v7, v0

    if-nez v0, :cond_1

    .line 134
    const-string v0, "UIDV_InfoSmarter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "no message change"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_3

    .line 135
    :cond_1
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p1}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getMsgId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getCreateTime()J

    move-result-wide v0

    cmp-long v0, v7, v0

    if-eqz v0, :cond_2

    .line 136
    const-string v0, "UIDV_InfoSmarter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "update message"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 137
    new-instance v9, Landroid/content/ContentValues;

    invoke-direct {v9}, Landroid/content/ContentValues;-><init>()V

    .line 138
    new-instance v10, Lorg/json/JSONObject;

    invoke-direct {v10}, Lorg/json/JSONObject;-><init>()V

    .line 140
    const-string v0, "content"

    :try_start_1
    invoke-virtual {p1}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getMsgTitle()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v10, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 141
    const-string v0, "msgId"

    invoke-virtual {p1}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getMsgId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v10, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 142
    const-string v0, "msgDetailUrl"

    invoke-virtual {p1}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getDetailUri()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v10, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 143
    const-string v0, "createTime"

    invoke-virtual {p1}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getCreateTime()J

    move-result-wide v1

    invoke-virtual {v10, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    .line 146
    goto :goto_1

    .line 144
    :catch_1
    move-exception v11

    .line 145
    const-string v0, "UIDV_InfoSmarter"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "JSONException e = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v11}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 147
    :goto_1
    const-string v0, "msgContent"

    invoke-virtual {v10}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v9, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 148
    const-string v0, "expireTime"

    invoke-virtual {p1}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getExpireTime()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v9, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 149
    const-string v0, "showTime"

    invoke-virtual {v9, v0, p3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 150
    const-string v0, "priority"

    invoke-static/range {p4 .. p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v9, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 152
    iget-object v0, p0, Lo/dlt;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/dln;->e(Landroid/content/Context;)Lo/dln;

    move-result-object v0

    invoke-virtual {v0, v6, v9}, Lo/dln;->d(ILandroid/content/ContentValues;)Z

    .line 153
    goto/16 :goto_3

    .line 154
    :cond_2
    const-string v0, "UIDV_InfoSmarter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "insert message"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 155
    new-instance v9, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;

    invoke-direct {v9}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;-><init>()V

    .line 156
    invoke-virtual {v9, p2}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->setMsgType(I)V

    .line 157
    const/4 v0, 0x4

    invoke-virtual {v9, v0}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->setMsgSrc(I)V

    .line 158
    const/4 v0, 0x2

    invoke-virtual {v9, v0}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->setMsgContentType(I)V

    .line 159
    new-instance v10, Lorg/json/JSONObject;

    invoke-direct {v10}, Lorg/json/JSONObject;-><init>()V

    .line 161
    const-string v0, "content"

    :try_start_2
    invoke-virtual {p1}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getMsgTitle()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v10, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 162
    const-string v0, "msgId"

    invoke-virtual {p1}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getMsgId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v10, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 163
    const-string v0, "msgDetailUrl"

    invoke-virtual {p1}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getDetailUri()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v10, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 164
    const-string v0, "createTime"

    invoke-virtual {p1}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getCreateTime()J

    move-result-wide v1

    invoke-virtual {v10, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_2

    .line 167
    goto :goto_2

    .line 165
    :catch_2
    move-exception v11

    .line 166
    const-string v0, "UIDV_InfoSmarter"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "JSONException e = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v11}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 168
    :goto_2
    invoke-virtual {v10}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->setMsgContent(Ljava/lang/String;)V

    .line 169
    const-string v0, "110000"

    invoke-virtual {v9, v0}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->setShowMethod(Ljava/lang/String;)V

    .line 170
    invoke-virtual {p1}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getExpireTime()J

    move-result-wide v0

    invoke-virtual {v9, v0, v1}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->setExpireTime(J)V

    .line 171
    invoke-virtual {v9, p3}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->setShowTime(Ljava/lang/String;)V

    .line 172
    const/4 v0, 0x1

    invoke-virtual {v9, v0}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->setStatus(I)V

    .line 173
    move/from16 v0, p4

    invoke-virtual {v9, v0}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->setPriority(I)V

    .line 175
    iget-object v0, p0, Lo/dlt;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/dln;->e(Landroid/content/Context;)Lo/dln;

    move-result-object v0

    invoke-virtual {v0, p2}, Lo/dln;->d(I)I

    .line 177
    iget-object v0, p0, Lo/dlt;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/dln;->e(Landroid/content/Context;)Lo/dln;

    move-result-object v0

    invoke-virtual {v0, v9}, Lo/dln;->a(Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;)Z

    .line 179
    :goto_3
    return-void
.end method

.method private e(Ljava/lang/String;ILjava/lang/String;I)V
    .locals 8

    .line 65
    const-string v0, "UIDV_InfoSmarter"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "insertOneInfoMessageToDB msgType = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 67
    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 68
    const-string v0, "UIDV_InfoSmarter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DEFAULT_RECOMMEND_TIME"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 69
    const-string p3, "00002400"

    .line 72
    :cond_0
    iget-object v0, p0, Lo/dlt;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/eaa;->c(Landroid/content/Context;)Lo/eaa;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/eaa;->a(Ljava/lang/String;)Ljava/util/List;

    move-result-object v4

    .line 73
    const-string v0, "IC7"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 75
    iget-object v0, p0, Lo/dlt;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/eaa;->c(Landroid/content/Context;)Lo/eaa;

    move-result-object v0

    const-string v1, "IC8"

    invoke-virtual {v0, v1}, Lo/eaa;->a(Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 78
    :cond_1
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 79
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;

    .line 80
    const/4 v0, 0x0

    if-ne v0, v7, :cond_2

    .line 81
    goto :goto_0

    .line 83
    :cond_2
    invoke-virtual {v7}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getImgUri()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    invoke-virtual {v7}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getDetailUri()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 84
    invoke-interface {v5, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 86
    :cond_3
    goto :goto_0

    .line 88
    :cond_4
    const-string v0, "UIDV_InfoSmarter"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "insertOneInfoMessageToDB infoMessageList size = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 90
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_5

    .line 91
    const-string v0, "UIDV_InfoSmarter"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "no message msgType = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 92
    return-void

    .line 96
    :cond_5
    new-instance v6, Lo/dlt$c;

    invoke-direct {v6}, Lo/dlt$c;-><init>()V

    .line 97
    invoke-static {v5, v6}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 99
    new-instance v7, Lo/dlt$a;

    invoke-direct {v7}, Lo/dlt$a;-><init>()V

    .line 100
    invoke-static {v5, v7}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 103
    const/4 v0, 0x0

    invoke-interface {v5, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;

    invoke-direct {p0, v0, p2, p3, p4}, Lo/dlt;->e(Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;ILjava/lang/String;I)V

    .line 104
    return-void
.end method

.method static synthetic e(Lo/dlt;I)V
    .locals 0

    .line 47
    invoke-direct {p0, p1}, Lo/dlt;->c(I)V

    return-void
.end method

.method private f()V
    .locals 4

    .line 380
    const-string v0, "UIDV_InfoSmarter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "healthRecommend"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 382
    iget-object v0, p0, Lo/dlt;->d:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lo/dlt$3;

    invoke-direct {v1, p0}, Lo/dlt$3;-><init>(Lo/dlt;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 415
    return-void
.end method

.method private i()V
    .locals 4

    .line 270
    const-string v0, "UIDV_InfoSmarter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "walkRecommend"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 272
    iget-object v0, p0, Lo/dlt;->d:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lo/dlt$1;

    invoke-direct {v1, p0}, Lo/dlt$1;-><init>(Lo/dlt;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 305
    return-void
.end method

.method private n()V
    .locals 4

    .line 421
    const-string v0, "UIDV_InfoSmarter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "runRecommend"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 423
    iget-object v0, p0, Lo/dlt;->d:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lo/dlt$4;

    invoke-direct {v1, p0}, Lo/dlt$4;-><init>(Lo/dlt;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 456
    return-void
.end method

.method private p()V
    .locals 4

    .line 462
    const-string v0, "UIDV_InfoSmarter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "rideRecommend"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 464
    iget-object v0, p0, Lo/dlt;->d:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lo/dlt$6;

    invoke-direct {v1, p0}, Lo/dlt$6;-><init>(Lo/dlt;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 497
    return-void
.end method


# virtual methods
.method public a()V
    .locals 4

    .line 576
    const-string v0, "UIDV_InfoSmarter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "sleepRecommend"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 578
    iget-object v0, p0, Lo/dlt;->d:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lo/dlt$10;

    invoke-direct {v1, p0}, Lo/dlt$10;-><init>(Lo/dlt;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 657
    return-void
.end method

.method public b()V
    .locals 4

    .line 503
    const-string v0, "UIDV_InfoSmarter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "bloodSugarRecommend"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 505
    iget-object v0, p0, Lo/dlt;->d:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lo/dlt$9;

    invoke-direct {v1, p0}, Lo/dlt$9;-><init>(Lo/dlt;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 570
    return-void
.end method

.method public c()V
    .locals 4

    .line 200
    const-string v0, "UIDV_InfoSmarter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "weightRecommend"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 202
    iget-object v0, p0, Lo/dlt;->d:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lo/dlt$2;

    invoke-direct {v1, p0}, Lo/dlt$2;-><init>(Lo/dlt;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 264
    return-void
.end method

.method public d()V
    .locals 4

    .line 311
    const-string v0, "UIDV_InfoSmarter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "bloodPressureRecommend"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 313
    iget-object v0, p0, Lo/dlt;->d:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lo/dlt$5;

    invoke-direct {v1, p0}, Lo/dlt$5;-><init>(Lo/dlt;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 374
    return-void
.end method

.method public e()V
    .locals 4

    .line 748
    const-string v0, "UIDV_InfoSmarter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "info startTimerCheck"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 750
    invoke-virtual {p0}, Lo/dlt;->g()V

    .line 751
    return-void
.end method

.method public g()V
    .locals 4

    .line 709
    const-string v0, "UIDV_InfoSmarter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "allUserRecommend"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 710
    invoke-virtual {p0}, Lo/dlt;->c()V

    .line 711
    invoke-virtual {p0}, Lo/dlt;->d()V

    .line 712
    invoke-virtual {p0}, Lo/dlt;->b()V

    .line 713
    invoke-direct {p0}, Lo/dlt;->p()V

    .line 714
    invoke-direct {p0}, Lo/dlt;->n()V

    .line 715
    invoke-virtual {p0}, Lo/dlt;->a()V

    .line 716
    invoke-direct {p0}, Lo/dlt;->f()V

    .line 717
    invoke-direct {p0}, Lo/dlt;->i()V

    .line 718
    return-void
.end method

.method public h()V
    .locals 4

    .line 724
    const-string v0, "UIDV_InfoSmarter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "labelRelatedRecommend"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 725
    invoke-virtual {p0}, Lo/dlt;->c()V

    .line 726
    invoke-direct {p0}, Lo/dlt;->i()V

    .line 727
    invoke-direct {p0}, Lo/dlt;->f()V

    .line 728
    invoke-direct {p0}, Lo/dlt;->n()V

    .line 729
    invoke-direct {p0}, Lo/dlt;->p()V

    .line 730
    return-void
.end method

.method public k()V
    .locals 4

    .line 736
    const-string v0, "UIDV_InfoSmarter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "userPreferenceRelatedRecommend"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 737
    invoke-virtual {p0}, Lo/dlt;->c()V

    .line 738
    invoke-virtual {p0}, Lo/dlt;->d()V

    .line 739
    invoke-virtual {p0}, Lo/dlt;->b()V

    .line 740
    invoke-direct {p0}, Lo/dlt;->p()V

    .line 741
    invoke-direct {p0}, Lo/dlt;->n()V

    .line 742
    invoke-virtual {p0}, Lo/dlt;->a()V

    .line 743
    invoke-direct {p0}, Lo/dlt;->f()V

    .line 744
    return-void
.end method
