.class public Lo/bdk;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;Lcom/huawei/health/sns/model/chat/MessageItem;JLjava/lang/String;)V
    .locals 5

    .line 67
    const/4 v0, 0x0

    if-ne v0, p2, :cond_0

    .line 69
    const-string v0, "MessageBuilder"

    const-string v1, "the param for sendMessage is null. there may be something wrong."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 70
    return-void

    .line 73
    :cond_0
    invoke-virtual {p2, p3, p4}, Lcom/huawei/health/sns/model/chat/MessageItem;->setUserId(J)V

    .line 74
    invoke-virtual {p2, p3, p4}, Lcom/huawei/health/sns/model/chat/MessageItem;->setReceiverId(J)V

    .line 75
    invoke-virtual {p2}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgContentType()I

    move-result v0

    const/4 v1, 0x3

    if-ne v1, v0, :cond_2

    .line 77
    invoke-virtual {p2}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMediaRemark()Ljava/lang/String;

    move-result-object v4

    .line 78
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 80
    sget v0, Lcom/huawei/android/sns/R$string;->sns_no_nickname:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 83
    :cond_1
    sget v0, Lcom/huawei/android/sns/R$string;->sns_friend_recommend_to:I

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p5}, Lo/bny;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Lo/bny;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgContent(Ljava/lang/String;)V

    .line 85
    :cond_2
    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v0

    invoke-virtual {v0}, Lo/aoq;->a()J

    move-result-wide v0

    invoke-virtual {p2, v0, v1}, Lcom/huawei/health/sns/model/chat/MessageItem;->setSenderId(J)V

    .line 86
    const/4 v0, 0x1

    invoke-virtual {p2, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setChatType(I)V

    .line 87
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {p2, v0, v1}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgDate(J)V

    .line 88
    return-void
.end method

.method public d(Landroid/content/Context;Lcom/huawei/health/sns/model/chat/MessageItem;JLjava/lang/String;)V
    .locals 7

    .line 34
    const/4 v0, 0x0

    if-ne v0, p2, :cond_0

    .line 36
    const-string v0, "MessageBuilder"

    const-string v1, "the param for sendMessage is null. there may be something wrong."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 37
    return-void

    .line 39
    :cond_0
    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v0

    invoke-virtual {v0}, Lo/aoq;->a()J

    move-result-wide v4

    .line 41
    invoke-virtual {p2, p3, p4}, Lcom/huawei/health/sns/model/chat/MessageItem;->setUserId(J)V

    .line 42
    invoke-virtual {p2, v4, v5}, Lcom/huawei/health/sns/model/chat/MessageItem;->setSenderId(J)V

    .line 43
    invoke-virtual {p2}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgContentType()I

    move-result v0

    const/4 v1, 0x3

    if-ne v1, v0, :cond_2

    .line 45
    invoke-virtual {p2}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMediaRemark()Ljava/lang/String;

    move-result-object v6

    .line 46
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 48
    sget v0, Lcom/huawei/android/sns/R$string;->sns_no_nickname:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v6

    .line 50
    :cond_1
    sget v0, Lcom/huawei/android/sns/R$string;->sns_friend_recommend_to:I

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p5}, Lo/bny;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v6}, Lo/bny;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgContent(Ljava/lang/String;)V

    .line 52
    :cond_2
    invoke-virtual {p2, p3, p4}, Lcom/huawei/health/sns/model/chat/MessageItem;->setReceiverId(J)V

    .line 53
    const/4 v0, 0x2

    invoke-virtual {p2, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setChatType(I)V

    .line 54
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {p2, v0, v1}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgDate(J)V

    .line 55
    return-void
.end method
