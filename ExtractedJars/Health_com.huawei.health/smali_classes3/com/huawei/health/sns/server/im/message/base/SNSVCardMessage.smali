.class public Lcom/huawei/health/sns/server/im/message/base/SNSVCardMessage;
.super Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;
.source "SourceFile"


# instance fields
.field private vCardJid:Ljava/lang/String;

.field private vCardName:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 23
    invoke-direct {p0}, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;-><init>()V

    .line 24
    sget-object v0, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase$a;->b:Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase$a;

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/server/im/message/base/SNSVCardMessage;->setMsgType(Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase$a;)V

    .line 25
    return-void
.end method


# virtual methods
.method public getvCardJid()Ljava/lang/String;
    .locals 1

    .line 29
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/message/base/SNSVCardMessage;->vCardJid:Ljava/lang/String;

    .line 30
    return-object v0
.end method

.method public getvCardName()Ljava/lang/String;
    .locals 1

    .line 40
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/message/base/SNSVCardMessage;->vCardName:Ljava/lang/String;

    .line 41
    return-object v0
.end method

.method public setvCardJid(Ljava/lang/String;)V
    .locals 0

    .line 35
    iput-object p1, p0, Lcom/huawei/health/sns/server/im/message/base/SNSVCardMessage;->vCardJid:Ljava/lang/String;

    .line 36
    return-void
.end method

.method public setvCardName(Ljava/lang/String;)V
    .locals 0

    .line 46
    iput-object p1, p0, Lcom/huawei/health/sns/server/im/message/base/SNSVCardMessage;->vCardName:Ljava/lang/String;

    .line 47
    return-void
.end method
