.class public Lcom/huawei/health/sns/server/im/login/impl/packet/SNSConfig;
.super Lorg/jivesoftware/smack/packet/IQ;
.source "SourceFile"


# static fields
.field private static final NAME:Ljava/lang/String; = "query"


# instance fields
.field private hearBeatFailedTry:I

.field private heartBeatInterval:I

.field private loginInterval:I

.field private messageLength:I

.field private offlineTime:I

.field private whiteList:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 56
    const-string v0, "query"

    invoke-direct {p0, v0}, Lorg/jivesoftware/smack/packet/IQ;-><init>(Ljava/lang/String;)V

    .line 47
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/health/sns/server/im/login/impl/packet/SNSConfig;->loginInterval:I

    .line 57
    sget-object v0, Lorg/jivesoftware/smack/packet/IQ$Type;->get:Lorg/jivesoftware/smack/packet/IQ$Type;

    invoke-super {p0, v0}, Lorg/jivesoftware/smack/packet/IQ;->setType(Lorg/jivesoftware/smack/packet/IQ$Type;)V

    .line 58
    return-void
.end method

.method public static newInstance(Ljava/lang/String;)Lcom/huawei/health/sns/server/im/login/impl/packet/SNSConfig;
    .locals 2

    .line 68
    new-instance v1, Lcom/huawei/health/sns/server/im/login/impl/packet/SNSConfig;

    invoke-direct {v1}, Lcom/huawei/health/sns/server/im/login/impl/packet/SNSConfig;-><init>()V

    .line 69
    invoke-virtual {v1, p0}, Lcom/huawei/health/sns/server/im/login/impl/packet/SNSConfig;->setFrom(Ljava/lang/String;)V

    .line 70
    invoke-virtual {v1}, Lcom/huawei/health/sns/server/im/login/impl/packet/SNSConfig;->getStanzaId()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 72
    invoke-static {}, Lorg/jivesoftware/smack/packet/id/StanzaIdUtil;->newStanzaId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/huawei/health/sns/server/im/login/impl/packet/SNSConfig;->setStanzaId(Ljava/lang/String;)V

    .line 74
    :cond_0
    return-object v1
.end method


# virtual methods
.method public getHearBeatFailedTry()I
    .locals 1

    .line 105
    iget v0, p0, Lcom/huawei/health/sns/server/im/login/impl/packet/SNSConfig;->hearBeatFailedTry:I

    .line 106
    return v0
.end method

.method public getHeartBeatInterval()I
    .locals 1

    .line 84
    iget v0, p0, Lcom/huawei/health/sns/server/im/login/impl/packet/SNSConfig;->heartBeatInterval:I

    .line 85
    return v0
.end method

.method public getIQChildElementBuilder(Lorg/jivesoftware/smack/packet/IQ$IQChildElementXmlStringBuilder;)Lorg/jivesoftware/smack/packet/IQ$IQChildElementXmlStringBuilder;
    .locals 2

    .line 195
    const-string v0, "xmlns"

    const-string v1, "socialim:iq:config"

    invoke-virtual {p1, v0, v1}, Lorg/jivesoftware/smack/packet/IQ$IQChildElementXmlStringBuilder;->attribute(Ljava/lang/String;Ljava/lang/String;)Lorg/jivesoftware/smack/util/XmlStringBuilder;

    .line 196
    invoke-virtual {p1}, Lorg/jivesoftware/smack/packet/IQ$IQChildElementXmlStringBuilder;->setEmptyElement()V

    .line 197
    return-object p1
.end method

.method public getLoginInterval()I
    .locals 1

    .line 166
    iget v0, p0, Lcom/huawei/health/sns/server/im/login/impl/packet/SNSConfig;->loginInterval:I

    .line 167
    return v0
.end method

.method public getMessageLength()I
    .locals 1

    .line 126
    iget v0, p0, Lcom/huawei/health/sns/server/im/login/impl/packet/SNSConfig;->messageLength:I

    .line 127
    return v0
.end method

.method public getOfflineTime()I
    .locals 1

    .line 147
    iget v0, p0, Lcom/huawei/health/sns/server/im/login/impl/packet/SNSConfig;->offlineTime:I

    .line 148
    return v0
.end method

.method public getWhiteList()Ljava/lang/String;
    .locals 1

    .line 183
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/login/impl/packet/SNSConfig;->whiteList:Ljava/lang/String;

    .line 184
    return-object v0
.end method

.method public setHearBeatFailedTry(I)V
    .locals 0

    .line 116
    iput p1, p0, Lcom/huawei/health/sns/server/im/login/impl/packet/SNSConfig;->hearBeatFailedTry:I

    .line 117
    return-void
.end method

.method public setHeartBeatInterval(I)V
    .locals 0

    .line 95
    iput p1, p0, Lcom/huawei/health/sns/server/im/login/impl/packet/SNSConfig;->heartBeatInterval:I

    .line 96
    return-void
.end method

.method public setLoginInterval(I)V
    .locals 0

    .line 175
    iput p1, p0, Lcom/huawei/health/sns/server/im/login/impl/packet/SNSConfig;->loginInterval:I

    .line 176
    return-void
.end method

.method public setMessageLength(I)V
    .locals 0

    .line 137
    iput p1, p0, Lcom/huawei/health/sns/server/im/login/impl/packet/SNSConfig;->messageLength:I

    .line 138
    return-void
.end method

.method public setOfflineTime(I)V
    .locals 0

    .line 158
    iput p1, p0, Lcom/huawei/health/sns/server/im/login/impl/packet/SNSConfig;->offlineTime:I

    .line 159
    return-void
.end method

.method public setWhiteList(Ljava/lang/String;)V
    .locals 0

    .line 189
    iput-object p1, p0, Lcom/huawei/health/sns/server/im/login/impl/packet/SNSConfig;->whiteList:Ljava/lang/String;

    .line 190
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 203
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 204
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "{heartBeatInterval:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/health/sns/server/im/login/impl/packet/SNSConfig;->heartBeatInterval:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 205
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, ",hearBeatFailedTry:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/health/sns/server/im/login/impl/packet/SNSConfig;->hearBeatFailedTry:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 206
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, ",messageLength:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/health/sns/server/im/login/impl/packet/SNSConfig;->messageLength:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 207
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, ",interval:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/health/sns/server/im/login/impl/packet/SNSConfig;->loginInterval:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 208
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, ",offlineTime:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/health/sns/server/im/login/impl/packet/SNSConfig;->offlineTime:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 209
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
