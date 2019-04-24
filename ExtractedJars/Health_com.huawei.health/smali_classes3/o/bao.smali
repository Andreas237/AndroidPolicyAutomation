.class public Lo/bao;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    return-void
.end method


# virtual methods
.method public e(Lcom/huawei/health/sns/model/chat/MessageItem;Ljava/lang/String;)Lcom/huawei/health/sns/model/chat/MessageItem;
    .locals 3

    .line 35
    new-instance v2, Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-direct {v2}, Lcom/huawei/health/sns/model/chat/MessageItem;-><init>()V

    .line 36
    invoke-static {}, Lo/bak;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgId(Ljava/lang/String;)V

    .line 37
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getUserId()J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/health/sns/model/chat/MessageItem;->setUserId(J)V

    .line 38
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getUserId()J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/health/sns/model/chat/MessageItem;->setReceiverId(J)V

    .line 39
    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v0

    invoke-virtual {v0}, Lo/aoq;->a()J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/health/sns/model/chat/MessageItem;->setSenderId(J)V

    .line 40
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getChatType()I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setChatType(I)V

    .line 41
    const/16 v0, 0xa

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgStatus(I)V

    .line 42
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgDate(J)V

    .line 43
    const/16 v0, 0x9

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgContentType(I)V

    .line 44
    invoke-virtual {v2, p2}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgContent(Ljava/lang/String;)V

    .line 45
    return-object v2
.end method

.method public e(Lcom/huawei/health/sns/model/chat/MessageItem;)V
    .locals 2

    .line 56
    invoke-static {}, Lo/apm;->a()Lo/apm;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/apm;->a(Lcom/huawei/health/sns/model/chat/MessageItem;)I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setId(I)V

    .line 58
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getChatType()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 61
    const/4 v0, 0x1

    const v1, 0x310dc

    invoke-static {v0, v1, p1}, Lo/apf;->d(IILjava/lang/Object;)V

    goto :goto_0

    .line 64
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getChatType()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 67
    const/4 v0, 0x2

    const v1, 0x310dc

    invoke-static {v0, v1, p1}, Lo/apf;->d(IILjava/lang/Object;)V

    .line 70
    :cond_1
    :goto_0
    return-void
.end method
