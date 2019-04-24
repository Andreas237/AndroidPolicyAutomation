.class public final Lo/apx;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private b:Lo/apo;


# direct methods
.method public constructor <init>(Lo/apo;)V
    .locals 1

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    const/4 v0, 0x0

    iput-object v0, p0, Lo/apx;->b:Lo/apo;

    .line 33
    iput-object p1, p0, Lo/apx;->b:Lo/apo;

    .line 34
    return-void
.end method

.method private a(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 96
    move-object v2, p1

    .line 97
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 99
    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v0

    invoke-virtual {v0}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$string;->sns_no_nickname:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 101
    :cond_0
    return-object v2
.end method

.method static synthetic d(Lo/apx;)Lo/apo;
    .locals 1

    .line 24
    iget-object v0, p0, Lo/apx;->b:Lo/apo;

    return-object v0
.end method


# virtual methods
.method public c(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 6

    .line 47
    new-instance v5, Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-direct {v5}, Lcom/huawei/health/sns/model/chat/MessageItem;-><init>()V

    .line 48
    const/4 v0, 0x1

    invoke-virtual {v5, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgStatus(I)V

    .line 49
    const/4 v0, 0x3

    invoke-virtual {v5, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgContentType(I)V

    .line 50
    invoke-virtual {v5, p5}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMediaRemark(Ljava/lang/String;)V

    .line 52
    .line 53
    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v0

    .line 54
    invoke-virtual {v0}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$string;->sns_friend_recommend_to:I

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    .line 55
    invoke-direct {p0, p3}, Lo/apx;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lo/bny;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    .line 56
    invoke-direct {p0, p5}, Lo/apx;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lo/bny;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    .line 55
    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 52
    invoke-virtual {v5, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgContent(Ljava/lang/String;)V

    .line 58
    invoke-virtual {v5, p4}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMediaUrl(Ljava/lang/String;)V

    .line 59
    invoke-virtual {v5, p1, p2}, Lcom/huawei/health/sns/model/chat/MessageItem;->setUserId(J)V

    .line 60
    invoke-virtual {v5, p1, p2}, Lcom/huawei/health/sns/model/chat/MessageItem;->setReceiverId(J)V

    .line 61
    invoke-virtual {v5, p6}, Lcom/huawei/health/sns/model/chat/MessageItem;->setChatType(I)V

    .line 62
    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v0

    invoke-virtual {v0}, Lo/aoq;->a()J

    move-result-wide v0

    invoke-virtual {v5, v0, v1}, Lcom/huawei/health/sns/model/chat/MessageItem;->setSenderId(J)V

    .line 63
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {v5, v0, v1}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgDate(J)V

    .line 64
    const/4 v0, 0x1

    if-ne p6, v0, :cond_0

    .line 67
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    new-instance v1, Lo/apx$1;

    invoke-direct {v1, p0, p1, p2, v5}, Lo/apx$1;-><init>(Lo/apx;JLcom/huawei/health/sns/model/chat/MessageItem;)V

    invoke-virtual {v0, v1}, Lo/brb;->c(Lo/brd;)Lo/bqy;

    goto :goto_0

    .line 82
    :cond_0
    const/4 v0, 0x2

    if-ne p6, v0, :cond_1

    .line 84
    iget-object v0, p0, Lo/apx;->b:Lo/apo;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-interface {v0, v5, v1, v2}, Lo/apo;->d(Lcom/huawei/health/sns/model/chat/MessageItem;IZ)V

    .line 86
    :cond_1
    :goto_0
    return-void
.end method
