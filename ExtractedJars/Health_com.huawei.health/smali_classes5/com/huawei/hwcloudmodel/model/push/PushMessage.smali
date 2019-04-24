.class public Lcom/huawei/hwcloudmodel/model/push/PushMessage;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field private static final TAG:Ljava/lang/String; = "PushMessage"


# instance fields
.field private mDetailID:Ljava/lang/String;

.field private mExpireTime:Ljava/lang/String;

.field private mFrom:Ljava/lang/String;

.field private mIcon:Ljava/lang/String;

.field private mMsgContext:Ljava/lang/String;

.field private mMsgTitle:Ljava/lang/String;

.field private mSessionId:Ljava/lang/String;

.field private mWebUrl:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 54
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hwcloudmodel/model/push/PushMessage;->mSessionId:Ljava/lang/String;

    .line 22
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hwcloudmodel/model/push/PushMessage;->mExpireTime:Ljava/lang/String;

    .line 27
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hwcloudmodel/model/push/PushMessage;->mMsgTitle:Ljava/lang/String;

    .line 32
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hwcloudmodel/model/push/PushMessage;->mMsgContext:Ljava/lang/String;

    .line 37
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hwcloudmodel/model/push/PushMessage;->mWebUrl:Ljava/lang/String;

    .line 42
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hwcloudmodel/model/push/PushMessage;->mDetailID:Ljava/lang/String;

    .line 47
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hwcloudmodel/model/push/PushMessage;->mIcon:Ljava/lang/String;

    .line 52
    const-string v0, "UOS"

    iput-object v0, p0, Lcom/huawei/hwcloudmodel/model/push/PushMessage;->mFrom:Ljava/lang/String;

    .line 56
    return-void
.end method


# virtual methods
.method public fillMessage(Lorg/json/JSONObject;)Z
    .locals 6

    .line 60
    const/4 v4, 0x0

    .line 62
    const-string v0, "sessionId"

    :try_start_0
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hwcloudmodel/model/push/PushMessage;->mSessionId:Ljava/lang/String;

    .line 63
    const-string v0, "expireTime"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hwcloudmodel/model/push/PushMessage;->mExpireTime:Ljava/lang/String;

    .line 64
    const-string v0, "msgTitle"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hwcloudmodel/model/push/PushMessage;->mMsgTitle:Ljava/lang/String;

    .line 65
    const-string v0, "msgContext"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hwcloudmodel/model/push/PushMessage;->mMsgContext:Ljava/lang/String;

    .line 66
    const-string v0, "webUrl"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hwcloudmodel/model/push/PushMessage;->mWebUrl:Ljava/lang/String;

    .line 67
    const-string v0, "detailID"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hwcloudmodel/model/push/PushMessage;->mDetailID:Ljava/lang/String;

    .line 68
    const-string v0, "icon"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hwcloudmodel/model/push/PushMessage;->mIcon:Ljava/lang/String;

    .line 69
    const-string v0, "from"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hwcloudmodel/model/push/PushMessage;->mFrom:Ljava/lang/String;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 73
    goto :goto_0

    .line 71
    :catch_0
    move-exception v5

    .line 72
    const-string v0, "PushMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v5}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 75
    :goto_0
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/push/PushMessage;->mSessionId:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/push/PushMessage;->mExpireTime:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/push/PushMessage;->mMsgTitle:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/push/PushMessage;->mMsgContext:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/push/PushMessage;->mIcon:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/push/PushMessage;->mFrom:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/push/PushMessage;->mWebUrl:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/push/PushMessage;->mDetailID:Ljava/lang/String;

    if-nez v0, :cond_1

    .line 78
    :cond_0
    const-string v0, "PushMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mWebUrl = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/hwcloudmodel/model/push/PushMessage;->mWebUrl:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 79
    const-string v0, "PushMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mDetailID = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/hwcloudmodel/model/push/PushMessage;->mDetailID:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 80
    const/4 v0, 0x0

    return v0

    .line 83
    :cond_1
    const/4 v0, 0x1

    return v0
.end method

.method public getmDetailID()Ljava/lang/String;
    .locals 1

    .line 108
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/push/PushMessage;->mDetailID:Ljava/lang/String;

    return-object v0
.end method

.method public getmExpireTime()Ljava/lang/String;
    .locals 1

    .line 92
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/push/PushMessage;->mExpireTime:Ljava/lang/String;

    return-object v0
.end method

.method public getmFrom()Ljava/lang/String;
    .locals 1

    .line 116
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/push/PushMessage;->mFrom:Ljava/lang/String;

    return-object v0
.end method

.method public getmIcon()Ljava/lang/String;
    .locals 1

    .line 112
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/push/PushMessage;->mIcon:Ljava/lang/String;

    return-object v0
.end method

.method public getmMsgContext()Ljava/lang/String;
    .locals 1

    .line 100
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/push/PushMessage;->mMsgContext:Ljava/lang/String;

    return-object v0
.end method

.method public getmMsgTitle()Ljava/lang/String;
    .locals 1

    .line 96
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/push/PushMessage;->mMsgTitle:Ljava/lang/String;

    return-object v0
.end method

.method public getmSessionId()Ljava/lang/String;
    .locals 1

    .line 88
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/push/PushMessage;->mSessionId:Ljava/lang/String;

    return-object v0
.end method

.method public getmWebUrl()Ljava/lang/String;
    .locals 1

    .line 104
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/push/PushMessage;->mWebUrl:Ljava/lang/String;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 121
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "PushMessage{mSessionId=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/push/PushMessage;->mSessionId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ",mExpireTime=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/push/PushMessage;->mExpireTime:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ",mMsgTitle=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/push/PushMessage;->mMsgTitle:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ",mMsgContext=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/push/PushMessage;->mMsgContext:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ",mWebUrl=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/push/PushMessage;->mWebUrl:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ",mDetailID=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/push/PushMessage;->mDetailID:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ",mIcon=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/push/PushMessage;->mIcon:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ",mFrom=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/push/PushMessage;->mFrom:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " }"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public uadpPushMessage1()V
    .locals 0

    .line 130
    return-void
.end method

.method public uadpPushMessage2()V
    .locals 0

    .line 135
    return-void
.end method

.method public uadpPushMessage3()V
    .locals 0

    .line 140
    return-void
.end method
