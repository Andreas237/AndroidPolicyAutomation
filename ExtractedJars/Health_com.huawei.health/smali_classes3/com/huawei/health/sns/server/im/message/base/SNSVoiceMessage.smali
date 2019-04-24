.class public Lcom/huawei/health/sns/server/im/message/base/SNSVoiceMessage;
.super Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;
.source "SourceFile"


# instance fields
.field private age:Ljava/lang/String;

.field private fileType:Ljava/lang/String;

.field private jid:Ljava/lang/String;

.field private size:J

.field private time:Ljava/lang/String;

.field private url:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 40
    invoke-direct {p0}, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;-><init>()V

    .line 33
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/health/sns/server/im/message/base/SNSVoiceMessage;->age:Ljava/lang/String;

    .line 41
    sget-object v0, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase$a;->e:Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase$a;

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/server/im/message/base/SNSVoiceMessage;->setMsgType(Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase$a;)V

    .line 42
    return-void
.end method


# virtual methods
.method public getAge()Ljava/lang/String;
    .locals 1

    .line 67
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/message/base/SNSVoiceMessage;->age:Ljava/lang/String;

    return-object v0
.end method

.method public getFileType()Ljava/lang/String;
    .locals 1

    .line 47
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/message/base/SNSVoiceMessage;->fileType:Ljava/lang/String;

    return-object v0
.end method

.method public getJid()Ljava/lang/String;
    .locals 1

    .line 57
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/message/base/SNSVoiceMessage;->jid:Ljava/lang/String;

    return-object v0
.end method

.method public getSize()J
    .locals 2

    .line 52
    iget-wide v0, p0, Lcom/huawei/health/sns/server/im/message/base/SNSVoiceMessage;->size:J

    return-wide v0
.end method

.method public getTime()Ljava/lang/String;
    .locals 1

    .line 72
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/message/base/SNSVoiceMessage;->time:Ljava/lang/String;

    return-object v0
.end method

.method public getUrl()Ljava/lang/String;
    .locals 1

    .line 62
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/message/base/SNSVoiceMessage;->url:Ljava/lang/String;

    return-object v0
.end method

.method public setAge(Ljava/lang/String;)V
    .locals 0

    .line 98
    iput-object p1, p0, Lcom/huawei/health/sns/server/im/message/base/SNSVoiceMessage;->age:Ljava/lang/String;

    .line 99
    return-void
.end method

.method public setFileType(Ljava/lang/String;)V
    .locals 0

    .line 78
    iput-object p1, p0, Lcom/huawei/health/sns/server/im/message/base/SNSVoiceMessage;->fileType:Ljava/lang/String;

    .line 79
    return-void
.end method

.method public setJid(Ljava/lang/String;)V
    .locals 0

    .line 88
    iput-object p1, p0, Lcom/huawei/health/sns/server/im/message/base/SNSVoiceMessage;->jid:Ljava/lang/String;

    .line 89
    return-void
.end method

.method public setSize(J)V
    .locals 0

    .line 83
    iput-wide p1, p0, Lcom/huawei/health/sns/server/im/message/base/SNSVoiceMessage;->size:J

    .line 84
    return-void
.end method

.method public setTime(Ljava/lang/String;)V
    .locals 0

    .line 103
    iput-object p1, p0, Lcom/huawei/health/sns/server/im/message/base/SNSVoiceMessage;->time:Ljava/lang/String;

    .line 104
    return-void
.end method

.method public setUrl(Ljava/lang/String;)V
    .locals 0

    .line 93
    iput-object p1, p0, Lcom/huawei/health/sns/server/im/message/base/SNSVoiceMessage;->url:Ljava/lang/String;

    .line 94
    return-void
.end method
