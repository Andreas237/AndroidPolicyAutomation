.class public final Lo/apv;
.super Lo/apn;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/apv$e;
    }
.end annotation


# static fields
.field private static c:Lo/apv;


# instance fields
.field private final d:Ljava/util/concurrent/Executor;

.field private e:Lo/apk;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 91
    new-instance v0, Lo/apv;

    invoke-direct {v0}, Lo/apv;-><init>()V

    sput-object v0, Lo/apv;->c:Lo/apv;

    return-void
.end method

.method private constructor <init>()V
    .locals 8

    .line 104
    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lo/apn;-><init>(I)V

    .line 93
    new-instance v0, Ljava/util/concurrent/ThreadPoolExecutor;

    sget-object v5, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    new-instance v6, Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-direct {v6}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    new-instance v7, Lo/bre;

    const-string v1, "GroupChatImpl"

    const/16 v2, 0xa

    invoke-direct {v7, v1, v2}, Lo/bre;-><init>(Ljava/lang/String;I)V

    const/4 v1, 0x1

    const/4 v2, 0x1

    const-wide/16 v3, 0x12c

    invoke-direct/range {v0 .. v7}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    iput-object v0, p0, Lo/apv;->d:Ljava/util/concurrent/Executor;

    .line 105
    return-void
.end method

.method private a(Lcom/huawei/health/sns/model/chat/MessageItem;Lcom/huawei/health/sns/model/group/Group;)V
    .locals 8

    .line 223
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgContentType()I

    move-result v0

    const/4 v1, 0x5

    if-ne v1, v0, :cond_1

    .line 225
    invoke-static {}, Lo/bis;->d()Lo/bis;

    move-result-object v0

    invoke-virtual {v0}, Lo/bis;->a()Landroid/app/Activity;

    move-result-object v5

    .line 226
    if-nez v5, :cond_0

    .line 228
    return-void

    .line 230
    :cond_0
    invoke-static {v5}, Lo/apv;->c(Landroid/app/Activity;)Ljava/lang/Runnable;

    move-result-object v0

    invoke-virtual {v5, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 231
    return-void

    .line 235
    :cond_1
    if-nez p2, :cond_2

    .line 237
    const-string v0, "IfGroupChatImpl"

    const-string v1, "showNotification in groupchat ,but group is null"

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 238
    return-void

    .line 241
    :cond_2
    invoke-static {}, Lo/ath;->a()Lo/ath;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getUserId()J

    move-result-wide v1

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getSenderId()J

    move-result-wide v3

    invoke-virtual {v0, v1, v2, v3, v4}, Lo/ath;->a(JJ)Lcom/huawei/health/sns/model/group/GroupMember;

    move-result-object v6

    .line 242
    if-nez v6, :cond_4

    .line 244
    invoke-static {}, Lo/axa;->a()Lo/axa;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getSenderId()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lo/axa;->a(J)Lcom/huawei/health/sns/model/user/User;

    move-result-object v7

    .line 246
    if-nez v7, :cond_3

    .line 248
    const-string v0, "IfGroupChatImpl"

    const-string v1, "showNotification in groupchat ,but groupMember and user is null"

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 249
    return-void

    .line 254
    :cond_3
    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v0

    invoke-virtual {v0}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/huawei/health/sns/model/user/User;->getUIDisplayName(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v5

    .line 256
    goto :goto_0

    .line 260
    :cond_4
    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v0

    invoke-virtual {v0}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/health/sns/model/group/GroupMember;->getUIDisplayName(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v5

    .line 263
    :goto_0
    invoke-direct {p0, p1, p2, v5}, Lo/apv;->c(Lcom/huawei/health/sns/model/chat/MessageItem;Lcom/huawei/health/sns/model/group/Group;Ljava/lang/String;)V

    .line 264
    return-void
.end method

.method private static a(Lcom/huawei/health/sns/model/group/Group;Lcom/huawei/health/sns/model/chat/MessageItem;)V
    .locals 1

    .line 496
    new-instance v0, Lo/apv$1;

    invoke-direct {v0, p0, p1}, Lo/apv$1;-><init>(Lcom/huawei/health/sns/model/group/Group;Lcom/huawei/health/sns/model/chat/MessageItem;)V

    invoke-static {v0}, Lo/aty;->c(Lo/aud;)V

    .line 509
    return-void
.end method

.method private a(Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;)V
    .locals 8

    .line 337
    new-instance v0, Lo/apt;

    invoke-direct {v0}, Lo/apt;-><init>()V

    invoke-virtual {v0, p1}, Lo/apt;->c(Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;)Lcom/huawei/health/sns/model/chat/MessageItem;

    move-result-object v3

    .line 338
    const/4 v0, 0x0

    if-ne v0, v3, :cond_0

    .line 340
    const-string v0, "IfGroupChatImpl"

    const-string v1, "onMessageForNewMsgNotification, getMessageItemFromNotification is null"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 341
    return-void

    .line 344
    :cond_0
    invoke-virtual {p0, v3}, Lo/apv;->a(Lcom/huawei/health/sns/model/chat/MessageItem;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 347
    const-string v0, "IfGroupChatImpl"

    const-string v1, "onMessageForNewMsgNotification,message is existed in db"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 353
    :cond_1
    invoke-virtual {v3}, Lcom/huawei/health/sns/model/chat/MessageItem;->getUserId()J

    move-result-wide v4

    .line 354
    invoke-virtual {p0, v4, v5}, Lo/apv;->a(J)Z

    move-result v6

    .line 358
    invoke-virtual {p0, v3, v6}, Lo/apv;->b(Lcom/huawei/health/sns/model/chat/MessageItem;Z)V

    .line 361
    invoke-static {}, Lo/bcb;->b()Lo/bcb;

    move-result-object v0

    const-string v1, "isShowPushNotification"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lo/bcb;->b(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 363
    invoke-static {}, Lo/atc;->d()Lo/atc;

    move-result-object v0

    invoke-virtual {v3}, Lcom/huawei/health/sns/model/chat/MessageItem;->getUserId()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lo/atc;->b(J)Lcom/huawei/health/sns/model/group/Group;

    move-result-object v7

    .line 364
    invoke-virtual {v3}, Lcom/huawei/health/sns/model/chat/MessageItem;->getIsRefferedSelf()I

    move-result v0

    if-nez v0, :cond_2

    .line 367
    if-eqz v7, :cond_3

    invoke-virtual {v7}, Lcom/huawei/health/sns/model/group/Group;->getDisturbMode()I

    move-result v0

    if-nez v0, :cond_3

    .line 369
    invoke-direct {p0, v3, v7}, Lo/apv;->a(Lcom/huawei/health/sns/model/chat/MessageItem;Lcom/huawei/health/sns/model/group/Group;)V

    goto :goto_0

    .line 372
    :cond_2
    invoke-virtual {v3}, Lcom/huawei/health/sns/model/chat/MessageItem;->getIsRefferedSelf()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_3

    .line 375
    invoke-direct {p0, v3, v7}, Lo/apv;->a(Lcom/huawei/health/sns/model/chat/MessageItem;Lcom/huawei/health/sns/model/group/Group;)V

    .line 379
    :cond_3
    :goto_0
    return-void
.end method

.method private b(Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;)V
    .locals 4

    .line 154
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    iget-object v1, p0, Lo/apv;->d:Ljava/util/concurrent/Executor;

    new-instance v2, Lo/apv$e;

    invoke-direct {v2, p0, p1}, Lo/apv$e;-><init>(Lo/apv;Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;)V

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Lo/brb;->c(Ljava/util/concurrent/Executor;Lo/brd;Lo/brc;)Lo/bqy;

    .line 155
    return-void
.end method

.method private c(Ljava/lang/String;JJ)Lcom/huawei/health/sns/model/chat/MessageItem;
    .locals 3

    .line 575
    new-instance v2, Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-direct {v2}, Lcom/huawei/health/sns/model/chat/MessageItem;-><init>()V

    .line 576
    invoke-virtual {v2, p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgId(Ljava/lang/String;)V

    .line 577
    invoke-virtual {v2, p2, p3}, Lcom/huawei/health/sns/model/chat/MessageItem;->setUserId(J)V

    .line 578
    const/4 v0, 0x2

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setChatType(I)V

    .line 579
    const/16 v0, 0xa

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgStatus(I)V

    .line 580
    const/16 v0, 0xd

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgContentType(I)V

    .line 581
    const-wide/16 v0, 0x0

    cmp-long v0, p4, v0

    if-lez v0, :cond_0

    move-wide v0, p4

    goto :goto_0

    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    :goto_0
    invoke-virtual {v2, v0, v1}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgDate(J)V

    .line 582
    return-object v2
.end method

.method private static c(Landroid/app/Activity;)Ljava/lang/Runnable;
    .locals 1

    .line 318
    new-instance v0, Lo/apv$5;

    invoke-direct {v0, p0}, Lo/apv$5;-><init>(Landroid/app/Activity;)V

    return-object v0
.end method

.method private c(Lcom/huawei/health/sns/model/chat/MessageItem;Lcom/huawei/health/sns/model/group/Group;Ljava/lang/String;)V
    .locals 10

    .line 275
    new-instance v6, Lo/aye;

    invoke-direct {v6}, Lo/aye;-><init>()V

    .line 277
    invoke-static {}, Lo/aut;->c()Lo/aut;

    move-result-object v0

    sget-object v1, Lo/auu$b;->a:Lo/auu$b;

    invoke-virtual {p2}, Lcom/huawei/health/sns/model/group/Group;->getGroupId()J

    move-result-wide v2

    invoke-virtual {v0, v1, v2, v3}, Lo/aut;->a(Lo/auu$b;J)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 280
    invoke-virtual {p2}, Lcom/huawei/health/sns/model/group/Group;->getGroupId()J

    move-result-wide v0

    invoke-virtual {p0, p1, v0, v1}, Lo/apv;->e(Lcom/huawei/health/sns/model/chat/MessageItem;J)V

    goto/16 :goto_1

    .line 284
    :cond_0
    new-instance v7, Lo/aqc;

    invoke-direct {v7}, Lo/aqc;-><init>()V

    .line 286
    invoke-static {}, Lo/bcb;->b()Lo/bcb;

    move-result-object v0

    const-string v1, "isShowMsgDetail"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lo/bcb;->b(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 288
    move-object v0, v7

    iget-object v1, p0, Lo/apv;->a:Landroid/content/Context;

    move-object v2, v6

    move-object v3, p3

    move-object v4, p2

    move-object v5, p1

    invoke-virtual/range {v0 .. v5}, Lo/aqc;->b(Landroid/content/Context;Lo/aye;Ljava/lang/String;Lcom/huawei/health/sns/model/group/Group;Lcom/huawei/health/sns/model/chat/MessageItem;)V

    .line 290
    invoke-static {}, Lo/auu;->b()Lo/auu;

    move-result-object v0

    sget-object v1, Lo/auu$b;->a:Lo/auu$b;

    invoke-virtual {p2}, Lcom/huawei/health/sns/model/group/Group;->getGroupId()J

    move-result-wide v2

    long-to-int v2, v2

    invoke-virtual {v0, v1, v2}, Lo/auu;->e(Lo/auu$b;I)V

    .line 292
    iget-object v0, p0, Lo/apv;->a:Landroid/content/Context;

    const-string v1, "notification"

    .line 293
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Landroid/app/NotificationManager;

    .line 294
    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v0

    invoke-virtual {v0}, Lo/aoq;->a()J

    move-result-wide v0

    long-to-int v0, v0

    invoke-virtual {v8, v0}, Landroid/app/NotificationManager;->cancel(I)V

    .line 295
    goto :goto_0

    .line 299
    :cond_1
    iget-object v0, p0, Lo/apv;->a:Landroid/content/Context;

    .line 300
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getIsRefferedSelf()I

    move-result v1

    .line 299
    invoke-virtual {v7, v0, v6, p2, v1}, Lo/aqc;->a(Landroid/content/Context;Lo/aye;Lcom/huawei/health/sns/model/group/Group;I)V

    .line 301
    invoke-static {}, Lo/auu;->b()Lo/auu;

    move-result-object v0

    sget-object v1, Lo/auu$b;->d:Lo/auu$b;

    invoke-virtual {v0, v1}, Lo/auu;->b(Lo/auu$b;)V

    .line 302
    invoke-static {}, Lo/auu;->b()Lo/auu;

    move-result-object v0

    sget-object v1, Lo/auu$b;->a:Lo/auu$b;

    invoke-virtual {v0, v1}, Lo/auu;->b(Lo/auu$b;)V

    .line 304
    :goto_0
    iget-object v0, p0, Lo/apv;->a:Landroid/content/Context;

    invoke-static {v0, v6}, Lo/auw;->d(Landroid/content/Context;Lo/aye;)Lo/auw;

    move-result-object v8

    .line 305
    invoke-static {}, Lo/awk;->c()Lo/awk;

    move-result-object v0

    iget-wide v1, p0, Lo/apv;->b:J

    .line 306
    invoke-virtual {v0, v1, v2}, Lo/awk;->c(J)Z

    move-result v9

    .line 307
    if-eqz v9, :cond_2

    .line 309
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lo/apv;->b:J

    .line 311
    :cond_2
    move-object v0, v8

    invoke-virtual {p2}, Lcom/huawei/health/sns/model/group/Group;->getGroupId()J

    move-result-wide v1

    move v3, v9

    .line 312
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getIsRefferedSelf()I

    move-result v5

    .line 311
    const/4 v4, 0x2

    invoke-virtual/range {v0 .. v5}, Lo/auw;->a(JZII)V

    .line 314
    :goto_1
    return-void
.end method

.method private c(Lcom/huawei/health/sns/server/im/message/base/SNSGpMemChangeMessage;I)V
    .locals 14

    .line 439
    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v0

    invoke-virtual {v0}, Lo/aoq;->a()J

    move-result-wide v6

    .line 440
    invoke-virtual {p1}, Lcom/huawei/health/sns/server/im/message/base/SNSGpMemChangeMessage;->getMemInfoList()Ljava/util/List;

    move-result-object v8

    .line 441
    new-instance v0, Lo/apj;

    invoke-direct {v0}, Lo/apj;-><init>()V

    invoke-virtual {v0, v8, v6, v7}, Lo/apj;->a(Ljava/util/List;J)Z

    move-result v9

    .line 443
    invoke-virtual {p1}, Lcom/huawei/health/sns/server/im/message/base/SNSGpMemChangeMessage;->getGroupId()J

    move-result-wide v0

    const/4 v2, 0x2

    move/from16 v3, p2

    if-ne v2, v3, :cond_0

    if-eqz v9, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/apr;->c(JZZ)Lcom/huawei/health/sns/model/group/Group;

    move-result-object v10

    .line 447
    if-nez v10, :cond_2

    .line 450
    new-instance v0, Lo/asx;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/asx;-><init>(Landroid/os/Handler;)V

    invoke-virtual {p1}, Lcom/huawei/health/sns/server/im/message/base/SNSGpMemChangeMessage;->getGroupId()J

    move-result-wide v2

    const/4 v1, 0x2

    move/from16 v4, p2

    if-ne v1, v4, :cond_1

    const/4 v5, 0x1

    goto :goto_1

    :cond_1
    const/4 v5, 0x0

    :goto_1
    const/4 v1, 0x0

    const/4 v4, 0x1

    invoke-virtual/range {v0 .. v5}, Lo/asx;->d(IJZZ)V

    .line 452
    return-void

    .line 456
    :cond_2
    const/4 v0, 0x0

    move/from16 v1, p2

    if-eq v0, v1, :cond_3

    const/4 v0, 0x3

    move/from16 v1, p2

    if-eq v0, v1, :cond_3

    const/4 v0, 0x4

    move/from16 v1, p2

    if-eq v0, v1, :cond_3

    const/4 v0, 0x5

    move/from16 v1, p2

    if-ne v0, v1, :cond_5

    .line 458
    :cond_3
    invoke-virtual {v10}, Lcom/huawei/health/sns/model/group/Group;->getShowNicknameMode()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_5

    .line 461
    invoke-virtual {p1}, Lcom/huawei/health/sns/server/im/message/base/SNSGpMemChangeMessage;->getOperatorId()J

    move-result-wide v0

    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v2

    invoke-virtual {v2}, Lo/aoq;->a()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-nez v0, :cond_4

    const/4 v0, 0x0

    move/from16 v1, p2

    if-ne v0, v1, :cond_4

    .line 464
    return-void

    .line 468
    :cond_4
    invoke-static {}, Lo/ath;->a()Lo/ath;

    move-result-object v0

    .line 469
    invoke-virtual {p1}, Lcom/huawei/health/sns/server/im/message/base/SNSGpMemChangeMessage;->getGroupId()J

    move-result-wide v1

    .line 468
    invoke-virtual {v0, v1, v2}, Lo/ath;->b(J)Ljava/util/ArrayList;

    move-result-object v11

    .line 470
    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/16 v1, 0x14

    if-le v0, v1, :cond_5

    .line 473
    move-object v0, p0

    invoke-static {}, Lo/bak;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v10}, Lcom/huawei/health/sns/model/group/Group;->getGroupId()J

    move-result-wide v2

    invoke-virtual {p1}, Lcom/huawei/health/sns/server/im/message/base/SNSGpMemChangeMessage;->getSendTime()J

    move-result-wide v4

    invoke-direct/range {v0 .. v5}, Lo/apv;->c(Ljava/lang/String;JJ)Lcom/huawei/health/sns/model/chat/MessageItem;

    move-result-object v12

    .line 474
    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v0

    invoke-virtual {v0}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$string;->sns_member_num_over:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v13

    .line 475
    invoke-virtual {v12, v13}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgContent(Ljava/lang/String;)V

    .line 478
    invoke-virtual {v10}, Lcom/huawei/health/sns/model/group/Group;->getShowNicknameMode()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_5

    .line 480
    const/4 v0, 0x1

    invoke-virtual {v10, v0}, Lcom/huawei/health/sns/model/group/Group;->setShowNicknameMode(I)V

    .line 482
    invoke-static {v10, v12}, Lo/apv;->a(Lcom/huawei/health/sns/model/group/Group;Lcom/huawei/health/sns/model/chat/MessageItem;)V

    .line 486
    :cond_5
    return-void
.end method

.method static synthetic c(Lo/apv;Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;)V
    .locals 0

    .line 58
    invoke-direct {p0, p1}, Lo/apv;->a(Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;)V

    return-void
.end method

.method private d(Lcom/huawei/health/sns/model/chat/MessageItem;)V
    .locals 2

    .line 564
    invoke-static {}, Lo/apm;->a()Lo/apm;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/apm;->a(Lcom/huawei/health/sns/model/chat/MessageItem;)I

    .line 565
    const/4 v0, 0x2

    const v1, 0x310dc

    invoke-static {v0, v1, p1}, Lo/apf;->d(IILjava/lang/Object;)V

    .line 566
    return-void
.end method

.method private d(Lcom/huawei/health/sns/server/im/message/base/SNSGpMemChangeMessage;)V
    .locals 12

    .line 519
    iget-object v0, p0, Lo/apv;->e:Lo/apk;

    if-nez v0, :cond_0

    .line 521
    new-instance v0, Lo/apk;

    invoke-direct {v0}, Lo/apk;-><init>()V

    iput-object v0, p0, Lo/apv;->e:Lo/apk;

    .line 524
    :cond_0
    iget-object v0, p0, Lo/apv;->e:Lo/apk;

    invoke-virtual {v0, p1}, Lo/apk;->a(Lcom/huawei/health/sns/server/im/message/base/SNSGpMemChangeMessage;)Ljava/lang/String;

    move-result-object v6

    .line 526
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 528
    move-object v0, p0

    invoke-virtual {p1}, Lcom/huawei/health/sns/server/im/message/base/SNSGpMemChangeMessage;->getPacketID()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/huawei/health/sns/server/im/message/base/SNSGpMemChangeMessage;->getGroupId()J

    move-result-wide v2

    invoke-virtual {p1}, Lcom/huawei/health/sns/server/im/message/base/SNSGpMemChangeMessage;->getSendTime()J

    move-result-wide v4

    invoke-direct/range {v0 .. v5}, Lo/apv;->c(Ljava/lang/String;JJ)Lcom/huawei/health/sns/model/chat/MessageItem;

    move-result-object v7

    .line 529
    invoke-virtual {v7, v6}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgContent(Ljava/lang/String;)V

    .line 530
    invoke-direct {p0, v7}, Lo/apv;->d(Lcom/huawei/health/sns/model/chat/MessageItem;)V

    .line 534
    :cond_1
    invoke-virtual {p1}, Lcom/huawei/health/sns/server/im/message/base/SNSGpMemChangeMessage;->getOp()I

    move-result v7

    .line 535
    const/4 v0, 0x7

    if-ne v7, v0, :cond_2

    .line 537
    return-void

    .line 540
    :cond_2
    iget-object v0, p0, Lo/apv;->e:Lo/apk;

    invoke-virtual {v0, p1}, Lo/apk;->e(Lcom/huawei/health/sns/server/im/message/base/SNSGpMemChangeMessage;)Ljava/util/List;

    move-result-object v8

    .line 541
    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_3

    .line 543
    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_0
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Ljava/lang/String;

    .line 545
    move-object v0, p0

    invoke-virtual {p1}, Lcom/huawei/health/sns/server/im/message/base/SNSGpMemChangeMessage;->getPacketID()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/huawei/health/sns/server/im/message/base/SNSGpMemChangeMessage;->getGroupId()J

    move-result-wide v2

    invoke-virtual {p1}, Lcom/huawei/health/sns/server/im/message/base/SNSGpMemChangeMessage;->getSendTime()J

    move-result-wide v4

    invoke-direct/range {v0 .. v5}, Lo/apv;->c(Ljava/lang/String;JJ)Lcom/huawei/health/sns/model/chat/MessageItem;

    move-result-object v11

    .line 546
    invoke-virtual {v11, v10}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgContent(Ljava/lang/String;)V

    .line 548
    invoke-static {}, Lo/bak;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v11, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgId(Ljava/lang/String;)V

    .line 549
    invoke-direct {p0, v11}, Lo/apv;->d(Lcom/huawei/health/sns/model/chat/MessageItem;)V

    .line 550
    goto :goto_0

    .line 554
    :cond_3
    invoke-direct {p0, p1, v7}, Lo/apv;->c(Lcom/huawei/health/sns/server/im/message/base/SNSGpMemChangeMessage;I)V

    .line 555
    return-void
.end method

.method private d(Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;)V
    .locals 3

    .line 414
    invoke-virtual {p1}, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;->getMsgType()Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase$a;

    move-result-object v0

    sget-object v1, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase$a;->i:Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase$a;

    if-ne v0, v1, :cond_0

    .line 416
    move-object v2, p1

    check-cast v2, Lcom/huawei/health/sns/server/im/message/base/SNSGpMemChangeMessage;

    .line 417
    invoke-direct {p0, v2}, Lo/apv;->d(Lcom/huawei/health/sns/server/im/message/base/SNSGpMemChangeMessage;)V

    .line 418
    goto :goto_0

    .line 420
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;->getMsgType()Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase$a;

    move-result-object v0

    sget-object v1, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase$a;->k:Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase$a;

    if-ne v0, v1, :cond_2

    .line 422
    move-object v2, p1

    check-cast v2, Lcom/huawei/health/sns/server/im/message/base/SNSGpInfoChangeMessage;

    .line 423
    iget-object v0, p0, Lo/apv;->e:Lo/apk;

    if-nez v0, :cond_1

    .line 425
    new-instance v0, Lo/apk;

    invoke-direct {v0}, Lo/apk;-><init>()V

    iput-object v0, p0, Lo/apv;->e:Lo/apk;

    .line 427
    :cond_1
    iget-object v0, p0, Lo/apv;->e:Lo/apk;

    invoke-virtual {v0, v2}, Lo/apk;->c(Lcom/huawei/health/sns/server/im/message/base/SNSGpInfoChangeMessage;)V

    .line 429
    :cond_2
    :goto_0
    return-void
.end method

.method public static e()Lo/apv;
    .locals 1

    .line 109
    sget-object v0, Lo/apv;->c:Lo/apv;

    return-object v0
.end method

.method static synthetic e(Lo/apv;Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;)V
    .locals 0

    .line 58
    invoke-direct {p0, p1}, Lo/apv;->d(Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;)V

    return-void
.end method


# virtual methods
.method protected a()Lo/auu$b;
    .locals 1

    .line 212
    sget-object v0, Lo/auu$b;->a:Lo/auu$b;

    return-object v0
.end method

.method protected b(Lcom/huawei/health/sns/model/chat/MessageItem;Z)V
    .locals 5

    .line 388
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 390
    return-void

    .line 392
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getUserId()J

    move-result-wide v2

    .line 394
    invoke-static {}, Lo/atc;->d()Lo/atc;

    move-result-object v0

    invoke-virtual {v0, v2, v3}, Lo/atc;->b(J)Lcom/huawei/health/sns/model/group/Group;

    move-result-object v4

    .line 395
    if-eqz v4, :cond_1

    invoke-virtual {v4}, Lcom/huawei/health/sns/model/group/Group;->getGroupName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 397
    :cond_1
    const-string v0, "IfGroupChatImpl"

    const-string v1, "dealNewMessageItem. group is null "

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 399
    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {v2, v3, v0, v1}, Lo/apr;->c(JZZ)Lcom/huawei/health/sns/model/group/Group;

    .line 402
    :cond_2
    invoke-super {p0, p1, p2}, Lo/apn;->b(Lcom/huawei/health/sns/model/chat/MessageItem;Z)V

    .line 403
    return-void
.end method

.method protected c(Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;)V
    .locals 1

    .line 201
    invoke-static {}, Lcom/huawei/health/sns/server/im/SNSIMCenter;->c()Lcom/huawei/health/sns/server/im/SNSIMCenter;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/huawei/health/sns/server/im/SNSIMCenter;->a(Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;)V

    .line 202
    return-void
.end method

.method public e(Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;)V
    .locals 3

    .line 118
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 120
    const-string v0, "IfGroupChatImpl"

    const-string v1, "onMessageReceive  receive a null message."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 121
    return-void

    .line 123
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;->getReceiver()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 125
    const-string v0, "IfGroupChatImpl"

    const-string v1, "onMessageReceive Null or Empty notification.receiver."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 126
    return-void

    .line 129
    :cond_1
    invoke-virtual {p1}, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;->getChatType()Lorg/jivesoftware/smack/packet/Message$Type;

    move-result-object v0

    sget-object v1, Lorg/jivesoftware/smack/packet/Message$Type;->groupchat:Lorg/jivesoftware/smack/packet/Message$Type;

    if-ne v0, v1, :cond_2

    .line 132
    const-string v0, "IfGroupChatImpl"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onMessageReceive Receive group message,msgID:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;->getPacketID()Ljava/lang/String;

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

    .line 133
    const-string v0, "IfGroupChatImpl"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onMessageReceive Receive group message,msgID:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 134
    invoke-direct {p0, p1}, Lo/apv;->b(Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;)V

    goto :goto_0

    .line 136
    :cond_2
    invoke-virtual {p1}, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;->getChatType()Lorg/jivesoftware/smack/packet/Message$Type;

    move-result-object v0

    sget-object v1, Lorg/jivesoftware/smack/packet/Message$Type;->normal:Lorg/jivesoftware/smack/packet/Message$Type;

    if-ne v0, v1, :cond_4

    .line 139
    invoke-virtual {p1}, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;->getMsgType()Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase$a;

    move-result-object v0

    sget-object v1, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase$a;->i:Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase$a;

    if-eq v0, v1, :cond_3

    invoke-virtual {p1}, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;->getMsgType()Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase$a;

    move-result-object v0

    sget-object v1, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase$a;->k:Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase$a;

    if-ne v0, v1, :cond_4

    .line 141
    :cond_3
    const-string v0, "IfGroupChatImpl"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onMessageReceive Receive group noti message,msgID:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;->getPacketID()Ljava/lang/String;

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

    .line 142
    invoke-direct {p0, p1}, Lo/apv;->b(Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;)V

    .line 145
    :cond_4
    :goto_0
    return-void
.end method
