.class public Lcom/huawei/health/sns/server/im/message/base/SNSAssistantMessage;
.super Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;
.source "SourceFile"


# instance fields
.field private assistantContent:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 15
    invoke-direct {p0}, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;-><init>()V

    .line 16
    sget-object v0, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase$a;->h:Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase$a;

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/server/im/message/base/SNSAssistantMessage;->setMsgType(Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase$a;)V

    .line 17
    return-void
.end method


# virtual methods
.method public getAssistantContent()Ljava/lang/String;
    .locals 1

    .line 21
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/message/base/SNSAssistantMessage;->assistantContent:Ljava/lang/String;

    .line 22
    return-object v0
.end method

.method public setAssistantContent(Ljava/lang/String;)V
    .locals 0

    .line 27
    iput-object p1, p0, Lcom/huawei/health/sns/server/im/message/base/SNSAssistantMessage;->assistantContent:Ljava/lang/String;

    .line 28
    return-void
.end method
