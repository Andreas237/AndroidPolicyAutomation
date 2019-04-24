.class public Lcom/huawei/health/sns/server/im/message/base/SNSImageMessage;
.super Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;
.source "SourceFile"


# instance fields
.field private age:Ljava/lang/String;

.field private fileType:Ljava/lang/String;

.field private jid:Ljava/lang/String;

.field private lengthWidth:Ljava/lang/String;

.field private size:J

.field private thumbFlag:Ljava/lang/String;

.field private url:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 48
    invoke-direct {p0}, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;-><init>()V

    .line 37
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/health/sns/server/im/message/base/SNSImageMessage;->age:Ljava/lang/String;

    .line 49
    sget-object v0, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase$a;->d:Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase$a;

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/server/im/message/base/SNSImageMessage;->setMsgType(Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase$a;)V

    .line 50
    return-void
.end method


# virtual methods
.method public getAge()Ljava/lang/String;
    .locals 1

    .line 109
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/message/base/SNSImageMessage;->age:Ljava/lang/String;

    .line 110
    return-object v0
.end method

.method public getFileType()Ljava/lang/String;
    .locals 1

    .line 54
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/message/base/SNSImageMessage;->fileType:Ljava/lang/String;

    .line 55
    return-object v0
.end method

.method public getJid()Ljava/lang/String;
    .locals 1

    .line 87
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/message/base/SNSImageMessage;->jid:Ljava/lang/String;

    .line 88
    return-object v0
.end method

.method public getLengthWidth()Ljava/lang/String;
    .locals 1

    .line 65
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/message/base/SNSImageMessage;->lengthWidth:Ljava/lang/String;

    .line 66
    return-object v0
.end method

.method public getSize()J
    .locals 2

    .line 76
    iget-wide v0, p0, Lcom/huawei/health/sns/server/im/message/base/SNSImageMessage;->size:J

    .line 77
    return-wide v0
.end method

.method public getThumbFlag()Ljava/lang/String;
    .locals 1

    .line 120
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/message/base/SNSImageMessage;->thumbFlag:Ljava/lang/String;

    .line 121
    return-object v0
.end method

.method public getUrl()Ljava/lang/String;
    .locals 1

    .line 98
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/message/base/SNSImageMessage;->url:Ljava/lang/String;

    .line 99
    return-object v0
.end method

.method public setAge(Ljava/lang/String;)V
    .locals 0

    .line 115
    iput-object p1, p0, Lcom/huawei/health/sns/server/im/message/base/SNSImageMessage;->age:Ljava/lang/String;

    .line 116
    return-void
.end method

.method public setFileType(Ljava/lang/String;)V
    .locals 0

    .line 60
    iput-object p1, p0, Lcom/huawei/health/sns/server/im/message/base/SNSImageMessage;->fileType:Ljava/lang/String;

    .line 61
    return-void
.end method

.method public setJid(Ljava/lang/String;)V
    .locals 0

    .line 93
    iput-object p1, p0, Lcom/huawei/health/sns/server/im/message/base/SNSImageMessage;->jid:Ljava/lang/String;

    .line 94
    return-void
.end method

.method public setLengthWidth(Ljava/lang/String;)V
    .locals 0

    .line 71
    iput-object p1, p0, Lcom/huawei/health/sns/server/im/message/base/SNSImageMessage;->lengthWidth:Ljava/lang/String;

    .line 72
    return-void
.end method

.method public setSize(J)V
    .locals 0

    .line 82
    iput-wide p1, p0, Lcom/huawei/health/sns/server/im/message/base/SNSImageMessage;->size:J

    .line 83
    return-void
.end method

.method public setThumbFlag(Ljava/lang/String;)V
    .locals 0

    .line 126
    iput-object p1, p0, Lcom/huawei/health/sns/server/im/message/base/SNSImageMessage;->thumbFlag:Ljava/lang/String;

    .line 127
    return-void
.end method

.method public setUrl(Ljava/lang/String;)V
    .locals 0

    .line 104
    iput-object p1, p0, Lcom/huawei/health/sns/server/im/message/base/SNSImageMessage;->url:Ljava/lang/String;

    .line 105
    return-void
.end method
