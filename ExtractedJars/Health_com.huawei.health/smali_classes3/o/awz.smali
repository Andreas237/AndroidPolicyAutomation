.class public Lo/awz;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    return-void
.end method


# virtual methods
.method public a(J)V
    .locals 9

    .line 68
    invoke-static {}, Lo/axi;->d()Lo/axi;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lo/axi;->a(J)Ljava/util/ArrayList;

    move-result-object v2

    .line 69
    if-eqz v2, :cond_4

    .line 71
    const/4 v3, 0x2

    .line 72
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x3

    if-gt v0, v1, :cond_0

    .line 74
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v3, v0, -0x1

    .line 76
    :cond_0
    move v4, v3

    :goto_0
    if-ltz v4, :cond_4

    .line 78
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/health/sns/model/user/UserNotifyNote;

    .line 79
    new-instance v6, Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-direct {v6}, Lcom/huawei/health/sns/model/chat/MessageItem;-><init>()V

    .line 80
    invoke-virtual {v5}, Lcom/huawei/health/sns/model/user/UserNotifyNote;->getNote()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgContent(Ljava/lang/String;)V

    .line 83
    :try_start_0
    invoke-virtual {v5}, Lcom/huawei/health/sns/model/user/UserNotifyNote;->getSendTime()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v7

    .line 84
    invoke-virtual {v6, v7, v8}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgDate(J)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 89
    goto :goto_1

    .line 86
    :catch_0
    move-exception v7

    .line 88
    const-string v0, ""

    const-string v1, "addNotifyMsg NumberFormatException"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 90
    :goto_1
    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgContentType(I)V

    .line 91
    invoke-static {}, Lo/bak;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgId(Ljava/lang/String;)V

    .line 93
    invoke-virtual {v5}, Lcom/huawei/health/sns/model/user/UserNotifyNote;->getSender()I

    move-result v0

    if-nez v0, :cond_1

    .line 95
    invoke-virtual {v5}, Lcom/huawei/health/sns/model/user/UserNotifyNote;->getUserId()J

    move-result-wide v0

    invoke-virtual {v6, v0, v1}, Lcom/huawei/health/sns/model/chat/MessageItem;->setUserId(J)V

    .line 96
    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v0

    invoke-virtual {v0}, Lo/aoq;->a()J

    move-result-wide v0

    invoke-virtual {v6, v0, v1}, Lcom/huawei/health/sns/model/chat/MessageItem;->setSenderId(J)V

    .line 97
    invoke-virtual {v5}, Lcom/huawei/health/sns/model/user/UserNotifyNote;->getUserId()J

    move-result-wide v0

    invoke-virtual {v6, v0, v1}, Lcom/huawei/health/sns/model/chat/MessageItem;->setReceiverId(J)V

    .line 98
    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgStatus(I)V

    .line 99
    const/4 v0, 0x2

    invoke-virtual {v6, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setSendMsgStatus(I)V

    goto :goto_2

    .line 102
    :cond_1
    invoke-virtual {v5}, Lcom/huawei/health/sns/model/user/UserNotifyNote;->getSender()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    .line 104
    invoke-virtual {v5}, Lcom/huawei/health/sns/model/user/UserNotifyNote;->getUserId()J

    move-result-wide v0

    invoke-virtual {v6, v0, v1}, Lcom/huawei/health/sns/model/chat/MessageItem;->setUserId(J)V

    .line 105
    invoke-virtual {v5}, Lcom/huawei/health/sns/model/user/UserNotifyNote;->getUserId()J

    move-result-wide v0

    invoke-virtual {v6, v0, v1}, Lcom/huawei/health/sns/model/chat/MessageItem;->setSenderId(J)V

    .line 106
    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v0

    invoke-virtual {v0}, Lo/aoq;->a()J

    move-result-wide v0

    invoke-virtual {v6, v0, v1}, Lcom/huawei/health/sns/model/chat/MessageItem;->setReceiverId(J)V

    .line 107
    const/4 v0, 0x2

    invoke-virtual {v6, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgStatus(I)V

    .line 108
    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setSendMsgStatus(I)V

    .line 110
    :cond_2
    :goto_2
    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setChatType(I)V

    .line 111
    invoke-static {}, Lo/apm;->a()Lo/apm;

    move-result-object v0

    invoke-virtual {v0, v6}, Lo/apm;->a(Lcom/huawei/health/sns/model/chat/MessageItem;)I

    .line 112
    invoke-virtual {v5}, Lcom/huawei/health/sns/model/user/UserNotifyNote;->getSender()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_3

    .line 114
    invoke-static {}, Lo/bap;->b()Lo/bap;

    move-result-object v0

    invoke-virtual {v0, v6}, Lo/bap;->a(Lcom/huawei/health/sns/model/chat/MessageItem;)V

    .line 76
    :cond_3
    add-int/lit8 v4, v4, -0x1

    goto/16 :goto_0

    .line 118
    :cond_4
    return-void
.end method

.method public e(J)V
    .locals 2

    .line 40
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    new-instance v1, Lo/awz$1;

    invoke-direct {v1, p0, p1, p2}, Lo/awz$1;-><init>(Lo/awz;J)V

    invoke-virtual {v0, v1}, Lo/brb;->c(Lo/brd;)Lo/bqy;

    .line 61
    return-void
.end method
