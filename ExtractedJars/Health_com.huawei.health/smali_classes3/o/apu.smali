.class public final Lo/apu;
.super Lo/apn;
.source "SourceFile"


# static fields
.field private static c:Lo/apu;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 72
    new-instance v0, Lo/apu;

    invoke-direct {v0}, Lo/apu;-><init>()V

    sput-object v0, Lo/apu;->c:Lo/apu;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .line 79
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lo/apn;-><init>(I)V

    .line 80
    return-void
.end method

.method private static a(Lo/apu;Lcom/huawei/health/sns/model/chat/MessageItem;Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;)Lo/aud;
    .locals 1

    .line 236
    new-instance v0, Lo/apu$1;

    invoke-direct {v0, p0, p1, p2}, Lo/apu$1;-><init>(Lo/apu;Lcom/huawei/health/sns/model/chat/MessageItem;Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;)V

    return-object v0
.end method

.method private static a(Lo/apu;Lcom/huawei/health/sns/model/chat/MessageItem;)Lo/brc;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/apu;Lcom/huawei/health/sns/model/chat/MessageItem;)Lo/brc<Ljava/lang/Integer;>;"
        }
    .end annotation

    .line 482
    new-instance v0, Lo/apu$5;

    invoke-direct {v0, p1, p0}, Lo/apu$5;-><init>(Lcom/huawei/health/sns/model/chat/MessageItem;Lo/apu;)V

    return-object v0
.end method

.method private a(Lcom/huawei/health/sns/model/chat/MessageItem;Lcom/huawei/health/sns/model/user/User;)V
    .locals 6

    .line 537
    const-string v0, "IfSingleChatImpl"

    const-string v1, "handle new friend message."

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 539
    invoke-virtual {p0, p1}, Lo/apu;->a(Lcom/huawei/health/sns/model/chat/MessageItem;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 542
    const-string v0, "IfSingleChatImpl"

    const-string v1, "IfSingleChatImpl handleFriendMessage failed, the message is existed in db"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 548
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getUserId()J

    move-result-wide v3

    .line 549
    invoke-virtual {p0, v3, v4}, Lo/apu;->a(J)Z

    move-result v5

    .line 550
    invoke-virtual {p0, p1, v5}, Lo/apu;->b(Lcom/huawei/health/sns/model/chat/MessageItem;Z)V

    .line 552
    invoke-static {}, Lo/bcb;->b()Lo/bcb;

    move-result-object v0

    const-string v1, "isShowPushNotification"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lo/bcb;->b(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 555
    if-eqz p2, :cond_1

    invoke-virtual {p2}, Lcom/huawei/health/sns/model/user/User;->getUndisturbStatus()I

    move-result v0

    const/4 v1, 0x1

    if-eq v1, v0, :cond_1

    .line 557
    invoke-direct {p0, p1, p2, v5}, Lo/apu;->e(Lcom/huawei/health/sns/model/chat/MessageItem;Lcom/huawei/health/sns/model/user/User;Z)V

    .line 559
    invoke-direct {p0, p2}, Lo/apu;->d(Lcom/huawei/health/sns/model/user/User;)V

    .line 563
    :cond_1
    :goto_0
    return-void
.end method

.method private a(Lcom/huawei/health/sns/model/user/User;Lcom/huawei/health/sns/model/chat/MessageItem;Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;)V
    .locals 3

    .line 192
    invoke-virtual {p0, p2}, Lo/apu;->a(Lcom/huawei/health/sns/model/chat/MessageItem;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 195
    const-string v0, "IfSingleChatImpl"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "handAssistMessage failed, the message is existed in db,msgId:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p2}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 200
    :cond_0
    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getState()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->isAlreadyFriend()Z

    move-result v0

    if-nez v0, :cond_2

    .line 202
    :cond_1
    invoke-direct {p0, p2, p3}, Lo/apu;->d(Lcom/huawei/health/sns/model/chat/MessageItem;Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;)V

    goto :goto_0

    .line 206
    :cond_2
    invoke-direct {p0, p1, p2, p3}, Lo/apu;->c(Lcom/huawei/health/sns/model/user/User;Lcom/huawei/health/sns/model/chat/MessageItem;Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;)V

    .line 209
    :goto_0
    return-void
.end method

.method public static b()Lo/apu;
    .locals 1

    .line 84
    sget-object v0, Lo/apu;->c:Lo/apu;

    return-object v0
.end method

.method static synthetic b(Lo/apu;Lcom/huawei/health/sns/model/chat/MessageItem;)Lo/brc;
    .locals 1

    .line 64
    invoke-static {p0, p1}, Lo/apu;->a(Lo/apu;Lcom/huawei/health/sns/model/chat/MessageItem;)Lo/brc;

    move-result-object v0

    return-object v0
.end method

.method static synthetic b(Lo/apu;Lcom/huawei/health/sns/model/chat/MessageItem;Lcom/huawei/health/sns/model/user/User;)V
    .locals 0

    .line 64
    invoke-direct {p0, p1, p2}, Lo/apu;->a(Lcom/huawei/health/sns/model/chat/MessageItem;Lcom/huawei/health/sns/model/user/User;)V

    return-void
.end method

.method private b(Lcom/huawei/health/sns/model/user/User;)Z
    .locals 3

    .line 417
    const/4 v2, 0x0

    .line 419
    if-eqz p1, :cond_1

    .line 421
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getIsFriend()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .line 423
    :cond_1
    :goto_0
    return v2
.end method

.method private static c(Landroid/app/Activity;)Ljava/lang/Runnable;
    .locals 1

    .line 646
    new-instance v0, Lo/apu$4;

    invoke-direct {v0, p0}, Lo/apu$4;-><init>(Landroid/app/Activity;)V

    return-object v0
.end method

.method private static c(Lo/apu;Lcom/huawei/health/sns/model/chat/MessageItem;)Lo/aud;
    .locals 1

    .line 452
    new-instance v0, Lo/apu$2;

    invoke-direct {v0, p0, p1}, Lo/apu$2;-><init>(Lo/apu;Lcom/huawei/health/sns/model/chat/MessageItem;)V

    return-object v0
.end method

.method private static c(Lo/apu;Lcom/huawei/health/sns/model/chat/MessageItem;Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;)Lo/brc;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/apu;Lcom/huawei/health/sns/model/chat/MessageItem;Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;)Lo/brc<Ljava/lang/Integer;>;"
        }
    .end annotation

    .line 267
    new-instance v0, Lo/apu$3;

    invoke-direct {v0, p1, p0, p2}, Lo/apu$3;-><init>(Lcom/huawei/health/sns/model/chat/MessageItem;Lo/apu;Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;)V

    return-object v0
.end method

.method private c(Lcom/huawei/health/sns/model/chat/MessageItem;)V
    .locals 2

    .line 437
    const-string v0, "IfSingleChatImpl"

    const-string v1, "handle non friend message."

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 440
    invoke-static {p0, p1}, Lo/apu;->c(Lo/apu;Lcom/huawei/health/sns/model/chat/MessageItem;)Lo/aud;

    move-result-object v0

    invoke-static {v0}, Lo/aty;->a(Lo/aud;)V

    .line 441
    return-void
.end method

.method private c(Lcom/huawei/health/sns/model/user/User;Lcom/huawei/health/sns/model/chat/MessageItem;Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;)V
    .locals 11

    .line 335
    invoke-virtual {p2}, Lcom/huawei/health/sns/model/chat/MessageItem;->isAssistMarketingMsg()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lo/apg;->b()Lo/apg;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/apg;->e(Lcom/huawei/health/sns/model/user/User;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 337
    :cond_0
    invoke-virtual {p2}, Lcom/huawei/health/sns/model/chat/MessageItem;->getUserId()J

    move-result-wide v7

    .line 338
    invoke-virtual {p0, v7, v8}, Lo/apu;->a(J)Z

    move-result v9

    .line 339
    invoke-virtual {p0, p2, v9}, Lo/apu;->b(Lcom/huawei/health/sns/model/chat/MessageItem;Z)V

    .line 341
    invoke-direct {p0, v9, p2}, Lo/apu;->d(ZLcom/huawei/health/sns/model/chat/MessageItem;)V

    .line 343
    invoke-virtual {p2}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgContentType()I

    move-result v10

    .line 345
    const/4 v0, 0x5

    if-eq v10, v0, :cond_1

    .line 348
    const-string v0, "IfSingleChatImpl"

    const-string v1, "BI handle followed Assistant Message "

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 349
    invoke-static {}, Lo/aow;->e()Lo/aow;

    move-result-object v0

    iget-object v1, p0, Lo/apu;->a:Landroid/content/Context;

    invoke-virtual {p2}, Lcom/huawei/health/sns/model/chat/MessageItem;->getSenderId()J

    move-result-wide v2

    .line 350
    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v4

    invoke-virtual {v4}, Lo/aoq;->a()J

    move-result-wide v4

    invoke-virtual {p2}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgId()Ljava/lang/String;

    move-result-object v6

    .line 349
    invoke-virtual/range {v0 .. v6}, Lo/aow;->d(Landroid/content/Context;JJLjava/lang/String;)V

    goto :goto_0

    .line 354
    :cond_1
    const-string v0, "IfSingleChatImpl"

    const-string v1, "BI unknow msg type ,parse error or add friend msg"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 357
    :goto_0
    invoke-static {}, Lo/bcb;->b()Lo/bcb;

    move-result-object v0

    const-string v1, "isShowPushNotification"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lo/bcb;->b(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 359
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getUndisturbStatus()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    invoke-virtual {p3}, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;->getNotify()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    .line 362
    invoke-direct {p0, p2, p1, v9}, Lo/apu;->e(Lcom/huawei/health/sns/model/chat/MessageItem;Lcom/huawei/health/sns/model/user/User;Z)V

    .line 364
    invoke-direct {p0, p1}, Lo/apu;->d(Lcom/huawei/health/sns/model/user/User;)V

    .line 367
    :cond_2
    goto :goto_1

    .line 371
    :cond_3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "assistant receive article switch closed. discard msgID:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p2}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    .line 372
    const-string v0, "IfSingleChatImpl"

    invoke-static {v0, v7}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 373
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", uid:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 374
    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v1

    invoke-virtual {v1}, Lo/aoq;->a()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 373
    const/4 v1, 0x3

    invoke-static {v1, v0}, Lo/bpj;->e(ILjava/lang/String;)V

    .line 376
    :goto_1
    return-void
.end method

.method static synthetic c(Lo/apu;Lcom/huawei/health/sns/model/user/User;)Z
    .locals 1

    .line 64
    invoke-direct {p0, p1}, Lo/apu;->b(Lcom/huawei/health/sns/model/user/User;)Z

    move-result v0

    return v0
.end method

.method private d(Ljava/util/ArrayList;)I
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lo/axq;>;)I"
        }
    .end annotation

    .line 848
    const/4 v1, -0x1

    .line 849
    if-eqz p1, :cond_3

    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    .line 851
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lo/axq;

    .line 852
    if-eqz v2, :cond_3

    .line 854
    invoke-virtual {v2}, Lo/axq;->e()Ljava/lang/String;

    move-result-object v3

    .line 855
    const-string v0, "headline"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "subheading"

    .line 856
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 858
    :cond_0
    const/4 v1, 0x6

    goto :goto_0

    .line 860
    :cond_1
    const-string v0, "text"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 862
    const/4 v1, 0x7

    goto :goto_0

    .line 864
    :cond_2
    const-string v0, "console"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 866
    const/4 v1, 0x1

    .line 870
    :cond_3
    :goto_0
    return v1
.end method

.method static synthetic d(Lo/apu;Lcom/huawei/health/sns/model/chat/MessageItem;Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;)Lo/brc;
    .locals 1

    .line 64
    invoke-static {p0, p1, p2}, Lo/apu;->c(Lo/apu;Lcom/huawei/health/sns/model/chat/MessageItem;Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;)Lo/brc;

    move-result-object v0

    return-object v0
.end method

.method private d(Lcom/huawei/health/sns/model/chat/MessageItem;Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;)V
    .locals 3

    .line 220
    const-string v0, "IfSingleChatImpl"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "handleUnFollowedAssistantMessage msgId:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 222
    invoke-static {p0, p1, p2}, Lo/apu;->a(Lo/apu;Lcom/huawei/health/sns/model/chat/MessageItem;Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;)Lo/aud;

    move-result-object v0

    invoke-static {v0}, Lo/aty;->a(Lo/aud;)V

    .line 223
    return-void
.end method

.method private d(Lcom/huawei/health/sns/model/chat/MessageItem;ZLcom/huawei/health/sns/model/user/User;)V
    .locals 10

    .line 603
    new-instance v6, Lo/aye;

    invoke-direct {v6}, Lo/aye;-><init>()V

    .line 605
    if-eqz p2, :cond_0

    .line 608
    invoke-virtual {p3}, Lcom/huawei/health/sns/model/user/User;->getUserId()J

    move-result-wide v0

    invoke-virtual {p0, p1, v0, v1}, Lo/apu;->e(Lcom/huawei/health/sns/model/chat/MessageItem;J)V

    goto/16 :goto_1

    .line 612
    :cond_0
    new-instance v7, Lo/aqc;

    invoke-direct {v7}, Lo/aqc;-><init>()V

    .line 614
    invoke-static {}, Lo/bcb;->b()Lo/bcb;

    move-result-object v0

    const-string v1, "isShowMsgDetail"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lo/bcb;->b(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 616
    iget-object v0, p0, Lo/apu;->a:Landroid/content/Context;

    invoke-virtual {v7, v0, v6, p3, p1}, Lo/aqc;->a(Landroid/content/Context;Lo/aye;Lcom/huawei/health/sns/model/user/User;Lcom/huawei/health/sns/model/chat/MessageItem;)V

    .line 618
    invoke-static {}, Lo/auu;->b()Lo/auu;

    move-result-object v0

    sget-object v1, Lo/auu$b;->d:Lo/auu$b;

    .line 619
    invoke-virtual {p3}, Lcom/huawei/health/sns/model/user/User;->getUserId()J

    move-result-wide v2

    long-to-int v2, v2

    .line 618
    invoke-virtual {v0, v1, v2}, Lo/auu;->e(Lo/auu$b;I)V

    .line 621
    iget-object v0, p0, Lo/apu;->a:Landroid/content/Context;

    const-string v1, "notification"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Landroid/app/NotificationManager;

    .line 623
    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v0

    invoke-virtual {v0}, Lo/aoq;->a()J

    move-result-wide v0

    long-to-int v0, v0

    invoke-virtual {v8, v0}, Landroid/app/NotificationManager;->cancel(I)V

    .line 624
    goto :goto_0

    .line 628
    :cond_1
    iget-object v0, p0, Lo/apu;->a:Landroid/content/Context;

    invoke-virtual {v7, v0, v6, p3}, Lo/aqc;->a(Landroid/content/Context;Lo/aye;Lcom/huawei/health/sns/model/user/User;)V

    .line 629
    invoke-static {}, Lo/auu;->b()Lo/auu;

    move-result-object v0

    sget-object v1, Lo/auu$b;->d:Lo/auu$b;

    invoke-virtual {v0, v1}, Lo/auu;->b(Lo/auu$b;)V

    .line 630
    invoke-static {}, Lo/auu;->b()Lo/auu;

    move-result-object v0

    sget-object v1, Lo/auu$b;->a:Lo/auu$b;

    invoke-virtual {v0, v1}, Lo/auu;->b(Lo/auu$b;)V

    .line 632
    :goto_0
    iget-object v0, p0, Lo/apu;->a:Landroid/content/Context;

    invoke-static {v0, v6}, Lo/auw;->d(Landroid/content/Context;Lo/aye;)Lo/auw;

    move-result-object v8

    .line 633
    invoke-static {}, Lo/awk;->c()Lo/awk;

    move-result-object v0

    iget-wide v1, p0, Lo/apu;->b:J

    .line 634
    invoke-virtual {v0, v1, v2}, Lo/awk;->c(J)Z

    move-result v9

    .line 635
    if-eqz v9, :cond_2

    .line 637
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lo/apu;->b:J

    .line 639
    :cond_2
    move-object v0, v8

    invoke-virtual {p3}, Lcom/huawei/health/sns/model/user/User;->getUserId()J

    move-result-wide v1

    move v3, v9

    .line 640
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getIsRefferedSelf()I

    move-result v5

    .line 639
    const/4 v4, 0x1

    invoke-virtual/range {v0 .. v5}, Lo/auw;->a(JZII)V

    .line 642
    :goto_1
    return-void
.end method

.method private d(Lcom/huawei/health/sns/model/user/User;)V
    .locals 7

    .line 386
    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v0

    invoke-virtual {v0}, Lo/aoq;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 388
    new-instance v0, Lo/bbf;

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getUserId()J

    move-result-wide v1

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getImageURLDownload()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getOldImageUrl()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getImageUrl()Ljava/lang/String;

    move-result-object v5

    invoke-direct/range {v0 .. v5}, Lo/bbf;-><init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move-object v6, v0

    .line 389
    invoke-static {}, Lo/ase;->d()Lo/ase;

    move-result-object v0

    invoke-virtual {v0, v6}, Lo/ase;->a(Lo/bbf;)V

    .line 391
    :cond_0
    return-void
.end method

.method private d(ZLcom/huawei/health/sns/model/chat/MessageItem;)V
    .locals 2

    .line 401
    if-eqz p1, :cond_0

    .line 403
    new-instance v1, Landroid/content/Intent;

    const-string v0, "rec_assist_msg_action"

    invoke-direct {v1, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 404
    const-string v0, "msg_item"

    invoke-virtual {v1, v0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 405
    invoke-static {v1}, Lo/aob;->b(Landroid/content/Intent;)V

    .line 407
    :cond_0
    return-void
.end method

.method private e(Lcom/huawei/health/sns/model/user/User;Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;)Lcom/huawei/health/sns/model/chat/MessageItem;
    .locals 12

    .line 717
    new-instance v5, Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-direct {v5}, Lcom/huawei/health/sns/model/chat/MessageItem;-><init>()V

    .line 718
    invoke-virtual {p2}, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;->getPacketID()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgId(Ljava/lang/String;)V

    .line 719
    invoke-virtual {p2}, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;->getSender()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/bpd;->b(Ljava/lang/String;)J

    move-result-wide v0

    invoke-virtual {v5, v0, v1}, Lcom/huawei/health/sns/model/chat/MessageItem;->setUserId(J)V

    .line 720
    const/4 v0, 0x1

    invoke-virtual {v5, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setChatType(I)V

    .line 721
    const/4 v0, 0x2

    invoke-virtual {v5, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgStatus(I)V

    .line 722
    invoke-virtual {p2}, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;->getSender()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/bpd;->b(Ljava/lang/String;)J

    move-result-wide v0

    invoke-virtual {v5, v0, v1}, Lcom/huawei/health/sns/model/chat/MessageItem;->setSenderId(J)V

    .line 723
    invoke-virtual {p2}, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;->getReceiver()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/bpd;->b(Ljava/lang/String;)J

    move-result-wide v0

    invoke-virtual {v5, v0, v1}, Lcom/huawei/health/sns/model/chat/MessageItem;->setReceiverId(J)V

    .line 724
    invoke-virtual {p2}, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;->getSeq()J

    move-result-wide v0

    invoke-virtual {v5, v0, v1}, Lcom/huawei/health/sns/model/chat/MessageItem;->setSeq(J)V

    .line 725
    invoke-virtual {p2}, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;->getPreseq()J

    move-result-wide v0

    invoke-virtual {v5, v0, v1}, Lcom/huawei/health/sns/model/chat/MessageItem;->setPreviousSeq(J)V

    .line 727
    invoke-virtual {p2}, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;->getMsgType()Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase$a;

    move-result-object v0

    sget-object v1, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase$a;->c:Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase$a;

    if-ne v0, v1, :cond_0

    .line 730
    const/4 v0, 0x1

    invoke-virtual {v5, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgContentType(I)V

    .line 731
    move-object v0, p2

    check-cast v0, Lcom/huawei/health/sns/server/im/message/base/SNSTextMessage;

    invoke-virtual {v0}, Lcom/huawei/health/sns/server/im/message/base/SNSTextMessage;->getTextContent()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgContent(Ljava/lang/String;)V

    goto/16 :goto_2

    .line 733
    :cond_0
    invoke-virtual {p2}, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;->getMsgType()Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase$a;

    move-result-object v0

    sget-object v1, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase$a;->b:Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase$a;

    if-ne v0, v1, :cond_3

    .line 736
    const/4 v0, 0x3

    invoke-virtual {v5, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgContentType(I)V

    .line 737
    const-string v6, ""

    .line 738
    if-eqz p1, :cond_1

    .line 740
    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v0

    invoke-virtual {v0}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/health/sns/model/user/User;->getUIDisplayName(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v6

    .line 742
    :cond_1
    move-object v0, p2

    check-cast v0, Lcom/huawei/health/sns/server/im/message/base/SNSVCardMessage;

    invoke-virtual {v0}, Lcom/huawei/health/sns/server/im/message/base/SNSVCardMessage;->getvCardJid()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/bpd;->b(Ljava/lang/String;)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMediaUrl(Ljava/lang/String;)V

    .line 743
    move-object v0, p2

    check-cast v0, Lcom/huawei/health/sns/server/im/message/base/SNSVCardMessage;

    invoke-virtual {v0}, Lcom/huawei/health/sns/server/im/message/base/SNSVCardMessage;->getvCardName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMediaRemark(Ljava/lang/String;)V

    .line 744
    invoke-virtual {v5}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMediaRemark()Ljava/lang/String;

    move-result-object v7

    .line 745
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 747
    iget-object v0, p0, Lo/apu;->a:Landroid/content/Context;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_no_nickname:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v7

    .line 749
    :cond_2
    iget-object v0, p0, Lo/apu;->a:Landroid/content/Context;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_friend_recommend:I

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v6}, Lo/bny;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v7}, Lo/bny;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgContent(Ljava/lang/String;)V

    .line 750
    goto/16 :goto_2

    .line 751
    :cond_3
    invoke-virtual {p2}, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;->getMsgType()Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase$a;

    move-result-object v0

    sget-object v1, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase$a;->d:Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase$a;

    if-ne v0, v1, :cond_4

    .line 753
    move-object v6, p2

    check-cast v6, Lcom/huawei/health/sns/server/im/message/base/SNSImageMessage;

    .line 755
    const/4 v0, 0x2

    invoke-virtual {v5, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgContentType(I)V

    .line 757
    invoke-virtual {v6}, Lcom/huawei/health/sns/server/im/message/base/SNSImageMessage;->getUrl()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMediaUrl(Ljava/lang/String;)V

    .line 758
    invoke-virtual {v6}, Lcom/huawei/health/sns/server/im/message/base/SNSImageMessage;->getSize()J

    move-result-wide v0

    invoke-virtual {v5, v0, v1}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMediaSize(J)V

    .line 759
    invoke-virtual {v6}, Lcom/huawei/health/sns/server/im/message/base/SNSImageMessage;->getThumbFlag()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMediaThumbFlag(Ljava/lang/String;)V

    .line 760
    invoke-virtual {v6}, Lcom/huawei/health/sns/server/im/message/base/SNSImageMessage;->getUrl()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMediaMtsUrl(Ljava/lang/String;)V

    .line 762
    invoke-virtual {v6}, Lcom/huawei/health/sns/server/im/message/base/SNSImageMessage;->getLengthWidth()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMediaRemark(Ljava/lang/String;)V

    .line 763
    goto/16 :goto_2

    .line 764
    :cond_4
    invoke-virtual {p2}, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;->getMsgType()Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase$a;

    move-result-object v0

    sget-object v1, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase$a;->f:Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase$a;

    if-ne v0, v1, :cond_5

    .line 766
    move-object v6, p2

    check-cast v6, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;

    .line 768
    const/16 v0, 0x8

    invoke-virtual {v5, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgContentType(I)V

    .line 769
    invoke-virtual {v5, v6}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgTypeData(Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;)V

    .line 770
    invoke-virtual {v6}, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;->getLinkMessageTip()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgContent(Ljava/lang/String;)V

    .line 771
    goto/16 :goto_2

    .line 772
    :cond_5
    invoke-virtual {p2}, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;->getMsgType()Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase$a;

    move-result-object v0

    sget-object v1, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase$a;->e:Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase$a;

    if-ne v0, v1, :cond_6

    .line 774
    move-object v6, p2

    check-cast v6, Lcom/huawei/health/sns/server/im/message/base/SNSVoiceMessage;

    .line 775
    const/16 v0, 0xf

    invoke-virtual {v5, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgContentType(I)V

    .line 776
    invoke-virtual {v6}, Lcom/huawei/health/sns/server/im/message/base/SNSVoiceMessage;->getUrl()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMediaMtsUrl(Ljava/lang/String;)V

    .line 777
    invoke-virtual {v6}, Lcom/huawei/health/sns/server/im/message/base/SNSVoiceMessage;->getSize()J

    move-result-wide v0

    invoke-virtual {v5, v0, v1}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMediaSize(J)V

    .line 778
    invoke-virtual {v5, v6}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgTypeData(Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;)V

    .line 779
    goto/16 :goto_2

    :cond_6
    invoke-virtual {p2}, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;->getMsgType()Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase$a;

    move-result-object v0

    sget-object v1, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase$a;->a:Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase$a;

    if-ne v0, v1, :cond_7

    .line 782
    const/16 v0, 0xa

    invoke-virtual {v5, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgStatus(I)V

    .line 783
    const/4 v0, 0x5

    invoke-virtual {v5, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgContentType(I)V

    goto/16 :goto_2

    .line 786
    :cond_7
    invoke-virtual {p2}, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;->getMsgType()Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase$a;

    move-result-object v0

    sget-object v1, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase$a;->h:Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase$a;

    if-ne v0, v1, :cond_c

    .line 788
    move-object v0, p2

    check-cast v0, Lcom/huawei/health/sns/server/im/message/base/SNSAssistantMessage;

    invoke-virtual {v0}, Lcom/huawei/health/sns/server/im/message/base/SNSAssistantMessage;->getAssistantContent()Ljava/lang/String;

    move-result-object v6

    .line 789
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_b

    .line 791
    new-instance v7, Lo/axs;

    invoke-direct {v7, v6}, Lo/axs;-><init>(Ljava/lang/String;)V

    .line 792
    invoke-virtual {v7}, Lo/axs;->e()Ljava/util/ArrayList;

    move-result-object v8

    .line 794
    invoke-virtual {v7}, Lo/axs;->b()Ljava/lang/String;

    move-result-object v9

    .line 795
    if-eqz v9, :cond_8

    const-string v0, "0"

    invoke-virtual {v0, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 797
    const/4 v0, 0x1

    invoke-virtual {v5, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setAssistMarketingMsg(Z)V

    .line 800
    :cond_8
    invoke-direct {p0, v8}, Lo/apu;->d(Ljava/util/ArrayList;)I

    move-result v10

    .line 801
    if-gez v10, :cond_9

    .line 804
    invoke-virtual {v5, v6}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgAssistJson(Ljava/lang/String;)V

    .line 805
    const/16 v0, 0xa

    invoke-virtual {v5, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgStatus(I)V

    .line 806
    const/4 v0, 0x5

    invoke-virtual {v5, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgContentType(I)V

    .line 807
    const-string v0, "IfSingleChatImpl"

    const-string v1, "contentType < 0"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 811
    :cond_9
    invoke-virtual {v5, v6}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgAssistJson(Ljava/lang/String;)V

    .line 812
    invoke-virtual {v5, v10}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgContentType(I)V

    .line 813
    invoke-static {}, Lo/apg;->b()Lo/apg;

    move-result-object v0

    invoke-virtual {v0, v7, v10}, Lo/apg;->e(Lo/axs;I)Ljava/lang/CharSequence;

    move-result-object v11

    .line 815
    if-eqz v11, :cond_a

    .line 817
    invoke-interface {v11}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgContent(Ljava/lang/String;)V

    .line 820
    :cond_a
    :goto_0
    goto :goto_1

    .line 823
    :cond_b
    const/4 v5, 0x0

    .line 824
    const-string v0, "IfSingleChatImpl"

    const-string v1, "Assistant message contentJson is empty!"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 826
    :goto_1
    goto :goto_2

    .line 829
    :cond_c
    const/4 v5, 0x0

    .line 831
    :goto_2
    if-eqz v5, :cond_e

    .line 834
    invoke-virtual {p2}, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;->getSendTime()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_d

    invoke-virtual {p2}, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;->getSendTime()J

    move-result-wide v0

    goto :goto_3

    :cond_d
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    :goto_3
    invoke-virtual {v5, v0, v1}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgDate(J)V

    .line 836
    :cond_e
    return-object v5
.end method

.method private e(J)Ljava/lang/String;
    .locals 1

    .line 96
    invoke-static {}, Lcom/huawei/health/sns/server/im/SNSIMCenter;->c()Lcom/huawei/health/sns/server/im/SNSIMCenter;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/huawei/health/sns/server/im/SNSIMCenter;->a(J)V

    .line 97
    const/4 v0, 0x0

    return-object v0
.end method

.method static synthetic e(Lo/apu;J)Ljava/lang/String;
    .locals 1

    .line 64
    invoke-direct {p0, p1, p2}, Lo/apu;->e(J)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private e(Lcom/huawei/health/sns/model/chat/MessageItem;Lcom/huawei/health/sns/model/user/User;Z)V
    .locals 3

    .line 575
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgContentType()I

    move-result v0

    const/4 v1, 0x5

    if-ne v1, v0, :cond_1

    .line 577
    invoke-static {}, Lo/bis;->d()Lo/bis;

    move-result-object v0

    invoke-virtual {v0}, Lo/bis;->a()Landroid/app/Activity;

    move-result-object v2

    .line 578
    if-nez v2, :cond_0

    .line 580
    return-void

    .line 582
    :cond_0
    invoke-static {v2}, Lo/apu;->c(Landroid/app/Activity;)Ljava/lang/Runnable;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 583
    return-void

    .line 586
    :cond_1
    if-nez p2, :cond_2

    .line 588
    return-void

    .line 591
    :cond_2
    invoke-direct {p0, p1, p3, p2}, Lo/apu;->d(Lcom/huawei/health/sns/model/chat/MessageItem;ZLcom/huawei/health/sns/model/user/User;)V

    .line 592
    return-void
.end method

.method static synthetic e(Lo/apu;Lcom/huawei/health/sns/model/user/User;Lcom/huawei/health/sns/model/chat/MessageItem;Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;)V
    .locals 0

    .line 64
    invoke-direct {p0, p1, p2, p3}, Lo/apu;->c(Lcom/huawei/health/sns/model/user/User;Lcom/huawei/health/sns/model/chat/MessageItem;Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;)V

    return-void
.end method


# virtual methods
.method protected a()Lo/auu$b;
    .locals 1

    .line 705
    sget-object v0, Lo/auu$b;->d:Lo/auu$b;

    return-object v0
.end method

.method protected b(Lcom/huawei/health/sns/model/chat/MessageItem;Z)V
    .locals 8

    .line 663
    if-nez p1, :cond_0

    .line 665
    return-void

    .line 668
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgAssistJson()Ljava/lang/String;

    move-result-object v2

    .line 670
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgContentType()I

    move-result v0

    const/4 v1, 0x5

    if-eq v0, v1, :cond_1

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 672
    new-instance v3, Lo/axs;

    invoke-direct {v3, v2}, Lo/axs;-><init>(Ljava/lang/String;)V

    .line 673
    invoke-virtual {v3}, Lo/axs;->e()Ljava/util/ArrayList;

    move-result-object v4

    .line 674
    if-eqz v4, :cond_1

    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 676
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/axq;

    .line 677
    if-eqz v5, :cond_1

    .line 679
    invoke-virtual {v5}, Lo/axq;->c()Ljava/lang/String;

    move-result-object v6

    .line 681
    const-string v0, "text"

    invoke-virtual {v5}, Lo/axq;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 683
    new-instance v7, Lo/bfe;

    invoke-direct {v7, v6}, Lo/bfe;-><init>(Ljava/lang/String;)V

    .line 685
    invoke-virtual {v7}, Lo/bfe;->b()Z

    move-result v0

    if-nez v0, :cond_1

    .line 687
    const-string v0, "assistant rich message xml invalid."

    const v1, 0x927c01

    invoke-static {v1, v0}, Lo/bpj;->h(ILjava/lang/String;)V

    .line 688
    const-string v0, "IfSingleChatImpl"

    const-string v1, "SNSLogReporter.serverMPSError xml parseError"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 694
    :cond_1
    invoke-super {p0, p1, p2}, Lo/apn;->b(Lcom/huawei/health/sns/model/chat/MessageItem;Z)V

    .line 695
    return-void
.end method

.method public b(Lcom/huawei/health/sns/model/user/User;Lcom/huawei/health/sns/model/chat/MessageItem;)V
    .locals 1

    .line 162
    invoke-direct {p0, p1}, Lo/apu;->b(Lcom/huawei/health/sns/model/user/User;)Z

    move-result v0

    .line 163
    if-nez v0, :cond_0

    .line 165
    invoke-direct {p0, p2}, Lo/apu;->c(Lcom/huawei/health/sns/model/chat/MessageItem;)V

    goto :goto_0

    .line 169
    :cond_0
    invoke-direct {p0, p2, p1}, Lo/apu;->a(Lcom/huawei/health/sns/model/chat/MessageItem;Lcom/huawei/health/sns/model/user/User;)V

    .line 171
    :goto_0
    return-void
.end method

.method protected c(Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;)V
    .locals 1

    .line 179
    invoke-static {}, Lcom/huawei/health/sns/server/im/SNSIMCenter;->c()Lcom/huawei/health/sns/server/im/SNSIMCenter;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/huawei/health/sns/server/im/SNSIMCenter;->d(Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;)V

    .line 180
    return-void
.end method

.method public e(Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;)V
    .locals 5

    .line 108
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 110
    const-string v0, "IfSingleChatImpl"

    const-string v1, "onMessageReceive receive a null message."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 111
    return-void

    .line 113
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;->getReceiver()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 115
    const-string v0, "IfSingleChatImpl"

    const-string v1, "onMessageReceive receiver is null."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 116
    return-void

    .line 119
    :cond_1
    invoke-virtual {p1}, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;->getChatType()Lorg/jivesoftware/smack/packet/Message$Type;

    move-result-object v0

    sget-object v1, Lorg/jivesoftware/smack/packet/Message$Type;->chat:Lorg/jivesoftware/smack/packet/Message$Type;

    if-eq v0, v1, :cond_2

    invoke-virtual {p1}, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;->getChatType()Lorg/jivesoftware/smack/packet/Message$Type;

    move-result-object v0

    sget-object v1, Lorg/jivesoftware/smack/packet/Message$Type;->normal:Lorg/jivesoftware/smack/packet/Message$Type;

    if-eq v0, v1, :cond_2

    .line 121
    return-void

    .line 124
    :cond_2
    invoke-virtual {p1}, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;->getMsgType()Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase$a;

    move-result-object v0

    sget-object v1, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase$a;->k:Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase$a;

    if-eq v0, v1, :cond_3

    invoke-virtual {p1}, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;->getMsgType()Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase$a;

    move-result-object v0

    sget-object v1, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase$a;->i:Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase$a;

    if-ne v0, v1, :cond_4

    .line 126
    :cond_3
    return-void

    .line 129
    :cond_4
    invoke-static {}, Lo/axa;->a()Lo/axa;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;->getSender()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lo/bpd;->b(Ljava/lang/String;)J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lo/axa;->a(J)Lcom/huawei/health/sns/model/user/User;

    move-result-object v3

    .line 132
    invoke-direct {p0, v3, p1}, Lo/apu;->e(Lcom/huawei/health/sns/model/user/User;Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;)Lcom/huawei/health/sns/model/chat/MessageItem;

    move-result-object v4

    .line 134
    const/4 v0, 0x0

    if-ne v0, v4, :cond_5

    .line 136
    const-string v0, "IfSingleChatImpl"

    const-string v1, "onMessageReceive,getMessageItemFromNotification is null"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 137
    return-void

    .line 140
    :cond_5
    const-string v0, "IfSingleChatImpl"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onMessageReceive Receive single message,msgID:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v4}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ",type:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;->getMsgType()Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase$a;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 143
    invoke-virtual {v4}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgAssistJson()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_6

    invoke-virtual {p1}, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;->getChatType()Lorg/jivesoftware/smack/packet/Message$Type;

    move-result-object v0

    sget-object v1, Lorg/jivesoftware/smack/packet/Message$Type;->normal:Lorg/jivesoftware/smack/packet/Message$Type;

    if-ne v0, v1, :cond_6

    .line 145
    invoke-direct {p0, v3, v4, p1}, Lo/apu;->a(Lcom/huawei/health/sns/model/user/User;Lcom/huawei/health/sns/model/chat/MessageItem;Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;)V

    goto :goto_0

    .line 149
    :cond_6
    invoke-virtual {p0, v3, v4}, Lo/apu;->b(Lcom/huawei/health/sns/model/user/User;Lcom/huawei/health/sns/model/chat/MessageItem;)V

    .line 151
    :goto_0
    return-void
.end method
