.class public Lcom/huawei/health/sns/server/im/message/base/SNSTextMessage;
.super Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;
.source "SourceFile"


# instance fields
.field private textContent:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 18
    invoke-direct {p0}, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;-><init>()V

    .line 19
    sget-object v0, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase$a;->c:Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase$a;

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/server/im/message/base/SNSTextMessage;->setMsgType(Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase$a;)V

    .line 20
    return-void
.end method


# virtual methods
.method public getTextContent()Ljava/lang/String;
    .locals 1

    .line 24
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/message/base/SNSTextMessage;->textContent:Ljava/lang/String;

    .line 25
    return-object v0
.end method

.method public setTextContent(Ljava/lang/String;)V
    .locals 0

    .line 30
    iput-object p1, p0, Lcom/huawei/health/sns/server/im/message/base/SNSTextMessage;->textContent:Ljava/lang/String;

    .line 31
    return-void
.end method
