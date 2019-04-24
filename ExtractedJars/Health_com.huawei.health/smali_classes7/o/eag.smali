.class public Lo/eag;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static b:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 24
    const-string v0, "UIDV_MessageDBInteractor"

    sput-object v0, Lo/eag;->b:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static a(Landroid/database/Cursor;Ljava/lang/String;)J
    .locals 5

    .line 195
    invoke-interface {p0, p1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v4

    .line 196
    const/4 v0, -0x1

    if-eq v0, v4, :cond_0

    .line 197
    invoke-interface {p0, v4}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    return-wide v0

    .line 199
    :cond_0
    sget-object v0, Lo/eag;->b:Ljava/lang/String;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getLongColumn wrong columnName = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 200
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public static a(Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;)Landroid/content/ContentValues;
    .locals 6

    .line 285
    new-instance v3, Landroid/content/ContentValues;

    invoke-direct {v3}, Landroid/content/ContentValues;-><init>()V

    .line 286
    const-string v0, "metadata"

    invoke-virtual {p0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getMetadata()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 287
    const-string v0, "msgType"

    invoke-virtual {p0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getMsgType()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 288
    const-string v0, "flag"

    invoke-virtual {p0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getFlag()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 289
    const-string v0, "weight"

    invoke-virtual {p0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getWeight()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 290
    const-string v0, "readFlag"

    invoke-virtual {p0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getReadFlag()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 291
    const-string v0, "msgTitle"

    invoke-virtual {p0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getMsgTitle()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 292
    const-string v0, "msgContext"

    invoke-virtual {p0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getMsgContent()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 293
    const-string v0, "createTime"

    invoke-virtual {p0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getCreateTime()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 294
    const-string v0, "receiveTime"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 295
    const-string v0, "expireTime"

    invoke-virtual {p0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getExpireTime()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 296
    const-string v0, "imgURI"

    invoke-virtual {p0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getImgUri()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 297
    const-string v0, "imgBigUri"

    invoke-virtual {p0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getImgBigUri()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 298
    const-string v0, "detailUri"

    invoke-virtual {p0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getDetailUri()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 299
    const-string v0, "detailUriExt"

    invoke-virtual {p0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getDetailUriExt()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 300
    const-string v0, "msgFrom"

    invoke-virtual {p0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getMsgFrom()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 301
    const-string v0, "position"

    invoke-virtual {p0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getPosition()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 302
    const-string v0, "msgPosition"

    invoke-virtual {p0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getMsgPosition()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 303
    const-string v0, "huid"

    invoke-virtual {p0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getHuid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 304
    const-string v0, "imei"

    invoke-virtual {p0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getImei()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 305
    const-string v0, "notified"

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 306
    const-string v0, "infoClassify"

    invoke-virtual {p0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getInfoClassify()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 307
    const-string v0, "heatMapCity"

    invoke-virtual {p0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getHeatMapCity()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 308
    const-string v0, "infoRecommend"

    invoke-virtual {p0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getInfoRecommend()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 309
    const-string v0, "msgUserLable"

    invoke-virtual {p0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getMsgUserLable()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 310
    const-string v0, "layout"

    invoke-virtual {p0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getLayout()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 311
    const-string v0, "pageType"

    invoke-virtual {p0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getPageType()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 312
    invoke-virtual {p0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getMessageExtList()Ljava/util/List;

    move-result-object v4

    .line 313
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    .line 314
    new-instance v5, Lcom/google/gson/Gson;

    invoke-direct {v5}, Lcom/google/gson/Gson;-><init>()V

    .line 315
    const-string v0, "messageExtList"

    invoke-virtual {v5, v4}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 318
    :cond_0
    return-object v3
.end method

.method public static a(Landroid/database/Cursor;)Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;
    .locals 3

    .line 53
    new-instance v2, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;

    invoke-direct {v2}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;-><init>()V

    .line 54
    const-string v0, "msgId"

    invoke-static {p0, v0}, Lo/eag;->d(Landroid/database/Cursor;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setMsgId(Ljava/lang/String;)V

    .line 55
    const-string v0, "msgType"

    invoke-static {p0, v0}, Lo/eag;->b(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setMsgType(I)V

    .line 56
    const-string v0, "module"

    invoke-static {p0, v0}, Lo/eag;->d(Landroid/database/Cursor;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setModule(Ljava/lang/String;)V

    .line 57
    const-string v0, "type"

    invoke-static {p0, v0}, Lo/eag;->d(Landroid/database/Cursor;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setType(Ljava/lang/String;)V

    .line 58
    const-string v0, "metadata"

    invoke-static {p0, v0}, Lo/eag;->d(Landroid/database/Cursor;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setMetadata(Ljava/lang/String;)V

    .line 59
    const-string v0, "flag"

    invoke-static {p0, v0}, Lo/eag;->b(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setFlag(I)V

    .line 60
    const-string v0, "weight"

    invoke-static {p0, v0}, Lo/eag;->b(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setWeight(I)V

    .line 61
    const-string v0, "readFlag"

    invoke-static {p0, v0}, Lo/eag;->b(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setReadFlag(I)V

    .line 62
    const-string v0, "msgTitle"

    invoke-static {p0, v0}, Lo/eag;->d(Landroid/database/Cursor;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setMsgTitle(Ljava/lang/String;)V

    .line 63
    const-string v0, "msgContext"

    invoke-static {p0, v0}, Lo/eag;->d(Landroid/database/Cursor;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setMsgContent(Ljava/lang/String;)V

    .line 64
    const-string v0, "createTime"

    invoke-static {p0, v0}, Lo/eag;->a(Landroid/database/Cursor;Ljava/lang/String;)J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setCreateTime(J)V

    .line 65
    const-string v0, "expireTime"

    invoke-static {p0, v0}, Lo/eag;->a(Landroid/database/Cursor;Ljava/lang/String;)J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setExpireTime(J)V

    .line 66
    const-string v0, "receiveTime"

    invoke-static {p0, v0}, Lo/eag;->a(Landroid/database/Cursor;Ljava/lang/String;)J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setReceiveTime(J)V

    .line 67
    const-string v0, "imgURI"

    invoke-static {p0, v0}, Lo/eag;->d(Landroid/database/Cursor;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setImgUri(Ljava/lang/String;)V

    .line 68
    const-string v0, "imgBigUri"

    invoke-static {p0, v0}, Lo/eag;->d(Landroid/database/Cursor;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setImgBigUri(Ljava/lang/String;)V

    .line 69
    const-string v0, "detailUri"

    invoke-static {p0, v0}, Lo/eag;->d(Landroid/database/Cursor;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setDetailUri(Ljava/lang/String;)V

    .line 70
    const-string v0, "detailUriExt"

    invoke-static {p0, v0}, Lo/eag;->d(Landroid/database/Cursor;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setDetailUriExt(Ljava/lang/String;)V

    .line 71
    const-string v0, "msgFrom"

    invoke-static {p0, v0}, Lo/eag;->d(Landroid/database/Cursor;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setMsgFrom(Ljava/lang/String;)V

    .line 72
    const-string v0, "position"

    invoke-static {p0, v0}, Lo/eag;->b(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setPosition(I)V

    .line 73
    const-string v0, "msgPosition"

    invoke-static {p0, v0}, Lo/eag;->b(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setMsgPosition(I)V

    .line 74
    const-string v0, "huid"

    invoke-static {p0, v0}, Lo/eag;->d(Landroid/database/Cursor;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setHuid(Ljava/lang/String;)V

    .line 75
    const-string v0, "imei"

    invoke-static {p0, v0}, Lo/eag;->d(Landroid/database/Cursor;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setImei(Ljava/lang/String;)V

    .line 76
    const-string v0, "notified"

    invoke-static {p0, v0}, Lo/eag;->b(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setNotified(I)V

    .line 77
    const-string v0, "infoClassify"

    invoke-static {p0, v0}, Lo/eag;->d(Landroid/database/Cursor;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setInfoClassify(Ljava/lang/String;)V

    .line 78
    const-string v0, "heatMapCity"

    invoke-static {p0, v0}, Lo/eag;->d(Landroid/database/Cursor;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setHeatMapCity(Ljava/lang/String;)V

    .line 79
    const-string v0, "infoRecommend"

    invoke-static {p0, v0}, Lo/eag;->b(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setInfoRecommend(I)V

    .line 80
    const-string v0, "msgUserLable"

    invoke-static {p0, v0}, Lo/eag;->d(Landroid/database/Cursor;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setMsgUserLable(Ljava/lang/String;)V

    .line 81
    return-object v2
.end method

.method private static b(Landroid/database/Cursor;Ljava/lang/String;)I
    .locals 5

    .line 179
    invoke-interface {p0, p1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v4

    .line 180
    const/4 v0, -0x1

    if-eq v0, v4, :cond_0

    .line 181
    invoke-interface {p0, v4}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    return v0

    .line 183
    :cond_0
    sget-object v0, Lo/eag;->b:Ljava/lang/String;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getIntColumn wrong columnName = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 184
    const/4 v0, 0x0

    return v0
.end method

.method public static b(Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;)I
    .locals 4

    .line 211
    if-nez p0, :cond_0

    .line 212
    const/4 v0, -0x1

    return v0

    .line 215
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getMsgId()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 216
    sget-object v0, Lo/eag;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Message ID can\'t be null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 217
    const/4 v0, -0x1

    return v0

    .line 220
    :cond_1
    invoke-virtual {p0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getMsgTitle()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 221
    sget-object v0, Lo/eag;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Message title can\'t be null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 222
    const/4 v0, -0x1

    return v0

    .line 225
    :cond_2
    invoke-virtual {p0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getCreateTime()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-gez v0, :cond_3

    .line 226
    sget-object v0, Lo/eag;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Message create time less than 0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 227
    const/4 v0, -0x1

    return v0

    .line 230
    :cond_3
    invoke-virtual {p0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getExpireTime()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-gez v0, :cond_4

    .line 231
    sget-object v0, Lo/eag;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Message expire time less than 0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 236
    :cond_4
    invoke-virtual {p0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getPosition()I

    move-result v0

    if-nez v0, :cond_5

    .line 237
    sget-object v0, Lo/eag;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Message position is invalid"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 238
    const/4 v0, -0x1

    return v0

    .line 240
    :cond_5
    const/4 v0, 0x0

    return v0
.end method

.method public static b(Landroid/database/Cursor;)Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;
    .locals 3

    .line 104
    new-instance v2, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;

    invoke-direct {v2}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;-><init>()V

    .line 105
    const-string v0, "msgId"

    invoke-static {p0, v0}, Lo/eag;->d(Landroid/database/Cursor;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setMsgId(Ljava/lang/String;)V

    .line 106
    const-string v0, "msgType"

    invoke-static {p0, v0}, Lo/eag;->b(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setMsgType(I)V

    .line 107
    const-string v0, "module"

    invoke-static {p0, v0}, Lo/eag;->d(Landroid/database/Cursor;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setModule(Ljava/lang/String;)V

    .line 108
    const-string v0, "type"

    invoke-static {p0, v0}, Lo/eag;->d(Landroid/database/Cursor;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setType(Ljava/lang/String;)V

    .line 109
    const-string v0, "metadata"

    invoke-static {p0, v0}, Lo/eag;->d(Landroid/database/Cursor;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setMetadata(Ljava/lang/String;)V

    .line 110
    const-string v0, "flag"

    invoke-static {p0, v0}, Lo/eag;->b(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setFlag(I)V

    .line 111
    const-string v0, "weight"

    invoke-static {p0, v0}, Lo/eag;->b(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setWeight(I)V

    .line 112
    const-string v0, "readFlag"

    invoke-static {p0, v0}, Lo/eag;->b(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setReadFlag(I)V

    .line 113
    const-string v0, "msgTitle"

    invoke-static {p0, v0}, Lo/eag;->d(Landroid/database/Cursor;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setMsgTitle(Ljava/lang/String;)V

    .line 114
    const-string v0, "msgContext"

    invoke-static {p0, v0}, Lo/eag;->d(Landroid/database/Cursor;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setMsgContent(Ljava/lang/String;)V

    .line 115
    const-string v0, "createTime"

    invoke-static {p0, v0}, Lo/eag;->a(Landroid/database/Cursor;Ljava/lang/String;)J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setCreateTime(J)V

    .line 116
    const-string v0, "expireTime"

    invoke-static {p0, v0}, Lo/eag;->a(Landroid/database/Cursor;Ljava/lang/String;)J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setExpireTime(J)V

    .line 117
    const-string v0, "receiveTime"

    invoke-static {p0, v0}, Lo/eag;->a(Landroid/database/Cursor;Ljava/lang/String;)J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setReceiveTime(J)V

    .line 118
    const-string v0, "imgURI"

    invoke-static {p0, v0}, Lo/eag;->d(Landroid/database/Cursor;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setImgUri(Ljava/lang/String;)V

    .line 119
    const-string v0, "imgBigUri"

    invoke-static {p0, v0}, Lo/eag;->d(Landroid/database/Cursor;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setImgBigUri(Ljava/lang/String;)V

    .line 120
    const-string v0, "detailUri"

    invoke-static {p0, v0}, Lo/eag;->d(Landroid/database/Cursor;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setDetailUri(Ljava/lang/String;)V

    .line 121
    const-string v0, "detailUriExt"

    invoke-static {p0, v0}, Lo/eag;->d(Landroid/database/Cursor;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setDetailUriExt(Ljava/lang/String;)V

    .line 122
    const-string v0, "msgFrom"

    invoke-static {p0, v0}, Lo/eag;->d(Landroid/database/Cursor;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setMsgFrom(Ljava/lang/String;)V

    .line 123
    const-string v0, "position"

    invoke-static {p0, v0}, Lo/eag;->b(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setPosition(I)V

    .line 124
    const-string v0, "msgPosition"

    invoke-static {p0, v0}, Lo/eag;->b(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setMsgPosition(I)V

    .line 125
    const-string v0, "huid"

    invoke-static {p0, v0}, Lo/eag;->d(Landroid/database/Cursor;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setHuid(Ljava/lang/String;)V

    .line 126
    const-string v0, "imei"

    invoke-static {p0, v0}, Lo/eag;->d(Landroid/database/Cursor;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setImei(Ljava/lang/String;)V

    .line 127
    const-string v0, "notified"

    invoke-static {p0, v0}, Lo/eag;->b(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setNotified(I)V

    .line 128
    const-string v0, "infoClassify"

    invoke-static {p0, v0}, Lo/eag;->d(Landroid/database/Cursor;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setInfoClassify(Ljava/lang/String;)V

    .line 129
    const-string v0, "heatMapCity"

    invoke-static {p0, v0}, Lo/eag;->d(Landroid/database/Cursor;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setHeatMapCity(Ljava/lang/String;)V

    .line 130
    const-string v0, "infoRecommend"

    invoke-static {p0, v0}, Lo/eag;->b(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setInfoRecommend(I)V

    .line 131
    const-string v0, "msgUserLable"

    invoke-static {p0, v0}, Lo/eag;->d(Landroid/database/Cursor;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setMsgUserLable(Ljava/lang/String;)V

    .line 132
    const-string v0, "layout"

    invoke-static {p0, v0}, Lo/eag;->b(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setLayout(I)V

    .line 133
    const-string v0, "messageExtList"

    invoke-static {p0, v0}, Lo/eag;->d(Landroid/database/Cursor;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/eag;->b(Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setMessageExtList(Ljava/util/List;)V

    .line 134
    const-string v0, "pageType"

    invoke-static {p0, v0}, Lo/eag;->b(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setPageType(I)V

    .line 135
    return-object v2
.end method

.method public static b(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    .line 326
    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "null"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 327
    :cond_0
    const-string v0, ""

    return-object v0

    .line 329
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static b(Ljava/lang/String;)Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;)Ljava/util/List<Lcom/huawei/pluginmessagecenter/provider/data/MessageExt;>;"
        }
    .end annotation

    .line 144
    new-instance v4, Lcom/google/gson/Gson;

    invoke-direct {v4}, Lcom/google/gson/Gson;-><init>()V

    .line 145
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 147
    :try_start_0
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 148
    new-instance v0, Lo/eag$3;

    invoke-direct {v0}, Lo/eag$3;-><init>()V

    invoke-virtual {v0}, Lo/eag$3;->getType()Ljava/lang/reflect/Type;

    move-result-object v0

    invoke-virtual {v4, p0, v0}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;
    :try_end_0
    .catch Lcom/google/gson/JsonSyntaxException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v5, v0

    .line 152
    :cond_0
    goto :goto_0

    .line 150
    :catch_0
    move-exception v6

    .line 151
    sget-object v0, Lo/eag;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "JsonSyntaxException: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Lcom/google/gson/JsonSyntaxException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 153
    :goto_0
    return-object v5
.end method

.method public static c(Landroid/content/Context;)Lo/dzz;
    .locals 1

    .line 322
    invoke-static {p0}, Lo/eaa;->c(Landroid/content/Context;)Lo/eaa;

    move-result-object v0

    invoke-virtual {v0}, Lo/eaa;->getAdapter()Lo/eab;

    move-result-object v0

    check-cast v0, Lo/dzz;

    return-object v0
.end method

.method public static c(Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;)Z
    .locals 2

    .line 249
    const/4 v0, 0x0

    if-eq v0, p0, :cond_1

    invoke-virtual {p0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getMsgPosition()I

    move-result v0

    const/16 v1, 0xc

    if-eq v1, v0, :cond_0

    .line 250
    invoke-virtual {p0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getMsgPosition()I

    move-result v0

    const/16 v1, 0x18

    if-eq v1, v0, :cond_0

    .line 251
    invoke-virtual {p0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getMsgPosition()I

    move-result v0

    const/16 v1, 0x19

    if-eq v1, v0, :cond_0

    .line 252
    invoke-virtual {p0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getMsgPosition()I

    move-result v0

    const/16 v1, 0x1b

    if-eq v1, v0, :cond_0

    .line 253
    invoke-virtual {p0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getMsgPosition()I

    move-result v0

    const/16 v1, 0x1c

    if-eq v1, v0, :cond_0

    .line 254
    invoke-virtual {p0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getMsgPosition()I

    move-result v0

    const/16 v1, 0x29

    if-ne v1, v0, :cond_1

    .line 255
    :cond_0
    const/4 v0, 0x1

    return v0

    .line 257
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method private static d(Landroid/database/Cursor;Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 163
    invoke-interface {p0, p1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v4

    .line 164
    const/4 v0, -0x1

    if-eq v0, v4, :cond_0

    .line 165
    invoke-interface {p0, v4}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 167
    :cond_0
    sget-object v0, Lo/eag;->b:Ljava/lang/String;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getStringColumn wrong columnName = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 168
    const-string v0, ""

    return-object v0
.end method

.method public static d(Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;)Z
    .locals 6

    .line 89
    if-nez p0, :cond_0

    .line 90
    const/4 v0, 0x1

    return v0

    .line 92
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/eae;->c(J)J

    move-result-wide v2

    .line 93
    invoke-virtual {p0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getExpireTime()J

    move-result-wide v4

    .line 94
    cmp-long v0, v4, v2

    if-gez v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/content/ContentValues;
    .locals 5

    .line 261
    new-instance v3, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;

    invoke-direct {v3}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;-><init>()V

    .line 262
    new-instance v4, Landroid/content/ContentValues;

    invoke-direct {v4}, Landroid/content/ContentValues;-><init>()V

    .line 263
    const-string v0, "huid"

    invoke-virtual {v4, v0, p0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 264
    const-string v0, "module"

    invoke-virtual {v4, v0, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 265
    const-string v0, "type"

    invoke-virtual {v4, v0, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 267
    const-string v0, "msgId"

    invoke-virtual {v3}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getMsgId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 268
    const-string v0, "msgType"

    invoke-virtual {v3}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getMsgType()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 269
    const-string v0, "flag"

    invoke-virtual {v3}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getFlag()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 270
    const-string v0, "weight"

    invoke-virtual {v3}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getWeight()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 271
    const-string v0, "readFlag"

    invoke-virtual {v3}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getReadFlag()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 272
    const-string v0, "msgTitle"

    invoke-virtual {v3}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getMsgTitle()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 273
    const-string v0, "createTime"

    invoke-virtual {v3}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getCreateTime()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 274
    const-string v0, "receiveTime"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 275
    const-string v0, "expireTime"

    invoke-virtual {v3}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getExpireTime()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 276
    const-string v0, "detailUri"

    invoke-virtual {v3}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getDetailUri()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 277
    const-string v0, "position"

    invoke-virtual {v3}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getPosition()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 278
    const-string v0, "msgPosition"

    invoke-virtual {v3}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getMsgPosition()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 279
    const-string v0, "notified"

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 281
    return-object v4
.end method
