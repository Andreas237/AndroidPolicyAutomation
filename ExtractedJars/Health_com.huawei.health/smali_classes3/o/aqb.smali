.class public Lo/aqb;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private b:Lo/apo;


# direct methods
.method public constructor <init>(Lo/apo;)V
    .locals 1

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    const/4 v0, 0x0

    iput-object v0, p0, Lo/aqb;->b:Lo/apo;

    .line 20
    iput-object p1, p0, Lo/aqb;->b:Lo/apo;

    .line 21
    return-void
.end method

.method private e(JI)Lcom/huawei/health/sns/model/chat/MessageItem;
    .locals 3

    .line 60
    new-instance v2, Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-direct {v2}, Lcom/huawei/health/sns/model/chat/MessageItem;-><init>()V

    .line 61
    invoke-virtual {v2, p1, p2}, Lcom/huawei/health/sns/model/chat/MessageItem;->setUserId(J)V

    .line 62
    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgStatus(I)V

    .line 64
    invoke-virtual {v2, p3}, Lcom/huawei/health/sns/model/chat/MessageItem;->setChatType(I)V

    .line 65
    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v0

    invoke-virtual {v0}, Lo/aoq;->a()J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/health/sns/model/chat/MessageItem;->setSenderId(J)V

    .line 66
    invoke-virtual {v2, p1, p2}, Lcom/huawei/health/sns/model/chat/MessageItem;->setReceiverId(J)V

    .line 69
    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setSendMsgStatus(I)V

    .line 71
    invoke-static {}, Lo/bak;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgId(Ljava/lang/String;)V

    .line 72
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgDate(J)V

    .line 73
    return-object v2
.end method


# virtual methods
.method public e(JLcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;IZ)V
    .locals 4

    .line 33
    invoke-direct {p0, p1, p2, p4}, Lo/aqb;->e(JI)Lcom/huawei/health/sns/model/chat/MessageItem;

    move-result-object v3

    .line 34
    const/16 v0, 0x8

    invoke-virtual {v3, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgContentType(I)V

    .line 35
    invoke-virtual {v3, p3}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgTypeData(Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;)V

    .line 38
    invoke-static {v3}, Lo/apw;->d(Lcom/huawei/health/sns/model/chat/MessageItem;)Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;

    .line 40
    const/4 v0, 0x1

    if-ne p4, v0, :cond_0

    .line 42
    invoke-virtual {v3, p5}, Lcom/huawei/health/sns/model/chat/MessageItem;->setCanSend(Z)V

    .line 43
    iget-object v0, p0, Lo/aqb;->b:Lo/apo;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-interface {v0, v3, v1, v2}, Lo/apo;->d(Lcom/huawei/health/sns/model/chat/MessageItem;IZ)V

    goto :goto_0

    .line 45
    :cond_0
    const/4 v0, 0x2

    if-ne p4, v0, :cond_1

    .line 47
    iget-object v0, p0, Lo/aqb;->b:Lo/apo;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-interface {v0, v3, v1, v2}, Lo/apo;->d(Lcom/huawei/health/sns/model/chat/MessageItem;IZ)V

    .line 49
    :cond_1
    :goto_0
    return-void
.end method
