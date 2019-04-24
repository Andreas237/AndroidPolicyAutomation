.class public Lcom/huawei/health/sns/server/im/message/base/SNSUnknowMessage;
.super Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 11
    invoke-direct {p0}, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;-><init>()V

    .line 12
    sget-object v0, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase$a;->a:Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase$a;

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/server/im/message/base/SNSUnknowMessage;->setMsgType(Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase$a;)V

    .line 13
    return-void
.end method
