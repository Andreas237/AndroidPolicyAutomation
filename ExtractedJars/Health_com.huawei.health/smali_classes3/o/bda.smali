.class public Lo/bda;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(Lcom/huawei/health/sns/model/chat/MessageItem;J)V
    .locals 2

    .line 40
    invoke-virtual {p1, p2, p3}, Lcom/huawei/health/sns/model/chat/MessageItem;->setUserId(J)V

    .line 41
    invoke-virtual {p1, p2, p3}, Lcom/huawei/health/sns/model/chat/MessageItem;->setReceiverId(J)V

    .line 43
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setCanSend(Z)V

    .line 44
    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v0

    invoke-virtual {v0}, Lo/aoq;->a()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Lcom/huawei/health/sns/model/chat/MessageItem;->setSenderId(J)V

    .line 45
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setChatType(I)V

    .line 46
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgDate(J)V

    .line 47
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setSysChat(Z)V

    .line 48
    invoke-static {}, Lo/apz;->d()Lo/apz;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/apz;->b(Lcom/huawei/health/sns/model/chat/MessageItem;)V

    .line 49
    return-void
.end method

.method public e(Ljava/lang/String;)Lcom/huawei/health/sns/model/chat/MessageItem;
    .locals 2

    .line 25
    new-instance v1, Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-direct {v1}, Lcom/huawei/health/sns/model/chat/MessageItem;-><init>()V

    .line 26
    const/4 v0, 0x1

    invoke-virtual {v1, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgStatus(I)V

    .line 27
    const/4 v0, 0x1

    invoke-virtual {v1, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgContentType(I)V

    .line 28
    invoke-virtual {v1, p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgContent(Ljava/lang/String;)V

    .line 29
    return-object v1
.end method
