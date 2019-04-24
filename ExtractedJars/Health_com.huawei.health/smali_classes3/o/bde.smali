.class public Lo/bde;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 52
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 53
    return-void
.end method

.method static synthetic a()Lcom/huawei/health/sns/model/chat/MessageItem;
    .locals 1

    .line 44
    invoke-static {}, Lo/bde;->b()Lcom/huawei/health/sns/model/chat/MessageItem;

    move-result-object v0

    return-object v0
.end method

.method private static a(J)Lo/brd;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)Lo/brd<Ljava/lang/Boolean;>;"
        }
    .end annotation

    .line 289
    new-instance v0, Lo/bde$4;

    invoke-direct {v0, p0, p1}, Lo/bde$4;-><init>(J)V

    .line 299
    return-object v0
.end method

.method private static b()Lcom/huawei/health/sns/model/chat/MessageItem;
    .locals 3

    .line 264
    new-instance v2, Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-direct {v2}, Lcom/huawei/health/sns/model/chat/MessageItem;-><init>()V

    .line 266
    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setSendMsgStatus(I)V

    .line 268
    invoke-static {}, Lo/bak;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgId(Ljava/lang/String;)V

    .line 269
    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgStatus(I)V

    .line 270
    const/16 v0, 0xf

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgContentType(I)V

    .line 271
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgDate(J)V

    .line 272
    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v0

    invoke-virtual {v0}, Lo/aoq;->a()J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/health/sns/model/chat/MessageItem;->setSenderId(J)V

    .line 273
    const-string v0, "12"

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMediaTime(Ljava/lang/String;)V

    .line 274
    return-object v2
.end method

.method private static b(Ljava/util/ArrayList;Landroid/os/Handler;JZZ)Lo/brd;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Ljava/lang/Integer;>;Landroid/os/Handler;JZZ)Lo/brd<Ljava/lang/Boolean;>;"
        }
    .end annotation

    .line 145
    new-instance v0, Lo/bde$1;

    move-object v1, p0

    move-object v2, p1

    move-wide v3, p2

    move v5, p4

    move v6, p5

    invoke-direct/range {v0 .. v6}, Lo/bde$1;-><init>(Ljava/util/ArrayList;Landroid/os/Handler;JZZ)V

    return-object v0
.end method

.method static synthetic c()Lcom/huawei/health/sns/model/chat/MessageItem;
    .locals 1

    .line 44
    invoke-static {}, Lo/bde;->e()Lcom/huawei/health/sns/model/chat/MessageItem;

    move-result-object v0

    return-object v0
.end method

.method private static d(J)Lo/brd;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)Lo/brd<Ljava/lang/Void;>;"
        }
    .end annotation

    .line 439
    new-instance v0, Lo/bde$2;

    invoke-direct {v0, p0, p1}, Lo/bde$2;-><init>(J)V

    return-object v0
.end method

.method private static d(Landroid/content/Context;J)Lo/brd;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;J)Lo/brd<Ljava/lang/Boolean;>;"
        }
    .end annotation

    .line 315
    new-instance v0, Lo/bde$3;

    invoke-direct {v0, p1, p2, p0}, Lo/bde$3;-><init>(JLandroid/content/Context;)V

    return-object v0
.end method

.method private static d(Ljava/lang/String;ILandroid/os/Handler;JZZ)Lo/brd;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;ILandroid/os/Handler;JZZ)Lo/brd<Ljava/lang/Boolean;>;"
        }
    .end annotation

    .line 98
    new-instance v0, Lo/bde$5;

    move-object v1, p0

    move v2, p5

    move v3, p1

    move-wide v4, p3

    move v6, p6

    move-object v7, p2

    invoke-direct/range {v0 .. v7}, Lo/bde$5;-><init>(Ljava/lang/String;ZIJZLandroid/os/Handler;)V

    return-object v0
.end method

.method private d(Landroid/app/Activity;J)V
    .locals 2

    .line 310
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    invoke-static {p1, p2, p3}, Lo/bde;->d(Landroid/content/Context;J)Lo/brd;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/brb;->c(Lo/brd;)Lo/bqy;

    .line 311
    return-void
.end method

.method private static e()Lcom/huawei/health/sns/model/chat/MessageItem;
    .locals 3

    .line 243
    new-instance v2, Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-direct {v2}, Lcom/huawei/health/sns/model/chat/MessageItem;-><init>()V

    .line 245
    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setSendMsgStatus(I)V

    .line 247
    invoke-static {}, Lo/bak;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgId(Ljava/lang/String;)V

    .line 248
    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgStatus(I)V

    .line 249
    const/4 v0, 0x2

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgContentType(I)V

    .line 250
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgDate(J)V

    .line 251
    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v0

    invoke-virtual {v0}, Lo/aoq;->a()J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/health/sns/model/chat/MessageItem;->setSenderId(J)V

    .line 253
    const-string v0, "m"

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMediaThumbFlag(Ljava/lang/String;)V

    .line 254
    return-object v2
.end method

.method public static e(Landroid/content/Context;Lcom/huawei/health/sns/model/user/User;JLjava/lang/String;)Lcom/huawei/health/sns/model/chat/MessageItem;
    .locals 6

    .line 344
    new-instance v5, Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-direct {v5}, Lcom/huawei/health/sns/model/chat/MessageItem;-><init>()V

    .line 345
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$string;->sns_add_friend_msg:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {p4}, Lo/bny;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgContent(Ljava/lang/String;)V

    .line 346
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {v5, v0, v1}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgDate(J)V

    .line 347
    const/16 v0, 0xd

    invoke-virtual {v5, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgContentType(I)V

    .line 348
    invoke-static {}, Lo/bak;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgId(Ljava/lang/String;)V

    .line 349
    invoke-virtual {v5, p2, p3}, Lcom/huawei/health/sns/model/chat/MessageItem;->setUserId(J)V

    .line 350
    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v0

    invoke-virtual {v0}, Lo/aoq;->a()J

    move-result-wide v0

    invoke-virtual {v5, v0, v1}, Lcom/huawei/health/sns/model/chat/MessageItem;->setSenderId(J)V

    .line 351
    invoke-virtual {v5, p2, p3}, Lcom/huawei/health/sns/model/chat/MessageItem;->setReceiverId(J)V

    .line 352
    const/4 v0, 0x1

    invoke-virtual {v5, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setChatType(I)V

    .line 353
    const/16 v0, 0xa

    invoke-virtual {v5, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgStatus(I)V

    .line 354
    return-object v5
.end method


# virtual methods
.method public a(Ljava/util/ArrayList;Landroid/os/Handler;JZZ)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Ljava/lang/Integer;>;Landroid/os/Handler;JZZ)V"
        }
    .end annotation

    .line 66
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    invoke-static/range {p1 .. p6}, Lo/bde;->b(Ljava/util/ArrayList;Landroid/os/Handler;JZZ)Lo/brd;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lo/brb;->e(Lo/brd;Lo/brc;)Lo/bqy;

    .line 67
    return-void
.end method

.method public b(Ljava/lang/String;ILandroid/os/Handler;JZZ)V
    .locals 3

    .line 81
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    invoke-static/range {p1 .. p7}, Lo/bde;->d(Ljava/lang/String;ILandroid/os/Handler;JZZ)Lo/brd;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lo/brb;->e(Lo/brd;Lo/brc;)Lo/bqy;

    .line 82
    return-void
.end method

.method public c(Lo/bfh;Ljava/lang/String;)Lcom/huawei/health/sns/server/user/AddFriendRequest;
    .locals 6

    .line 399
    if-eqz p1, :cond_0

    instance-of v0, p1, Lcom/huawei/health/sns/model/user/User;

    if-nez v0, :cond_1

    .line 401
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 404
    :cond_1
    move-object v3, p1

    check-cast v3, Lcom/huawei/health/sns/model/user/User;

    .line 405
    const-string v0, "ChatCommonLogic"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "ChatCommonLogic bean:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Lo/bfh;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 406
    const-string v0, "ChatCommonLogic"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "ChatCommonLogic user:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v3}, Lcom/huawei/health/sns/model/user/User;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 407
    new-instance v4, Lcom/huawei/health/sns/server/user/AddFriendRequest;

    invoke-direct {v4}, Lcom/huawei/health/sns/server/user/AddFriendRequest;-><init>()V

    .line 408
    invoke-virtual {v3}, Lcom/huawei/health/sns/model/user/User;->getUserId()J

    move-result-wide v0

    invoke-virtual {v4, v0, v1}, Lcom/huawei/health/sns/server/user/AddFriendRequest;->setFrdUID_(J)V

    .line 409
    invoke-virtual {v3}, Lcom/huawei/health/sns/model/user/User;->getRemarkName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/health/sns/server/user/AddFriendRequest;->setRemarkName_(Ljava/lang/String;)V

    .line 411
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 413
    invoke-virtual {v4, p2}, Lcom/huawei/health/sns/server/user/AddFriendRequest;->setVerifyNote_(Ljava/lang/String;)V

    .line 416
    :cond_2
    invoke-virtual {v3}, Lcom/huawei/health/sns/model/user/User;->getOriginType()I

    move-result v0

    const/4 v1, -0x1

    if-le v0, v1, :cond_3

    .line 418
    new-instance v0, Lcom/huawei/health/sns/server/user/Origin;

    invoke-virtual {v3}, Lcom/huawei/health/sns/model/user/User;->getOriginType()I

    move-result v1

    invoke-virtual {v3}, Lcom/huawei/health/sns/model/user/User;->getOriginDesc()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/huawei/health/sns/server/user/Origin;-><init>(ILjava/lang/String;)V

    invoke-static {v0}, Lcom/huawei/health/sns/server/user/Origin;->obtainOriginByLocalType(Lcom/huawei/health/sns/server/user/Origin;)[Lcom/huawei/health/sns/server/user/Origin;

    move-result-object v5

    .line 420
    const/4 v0, 0x0

    aget-object v0, v5, v0

    invoke-virtual {v4, v0}, Lcom/huawei/health/sns/server/user/AddFriendRequest;->setFrdOrigin_(Lcom/huawei/health/sns/server/user/Origin;)V

    .line 421
    const/4 v0, 0x1

    aget-object v0, v5, v0

    invoke-virtual {v4, v0}, Lcom/huawei/health/sns/server/user/AddFriendRequest;->setMyOrigin_(Lcom/huawei/health/sns/server/user/Origin;)V

    .line 423
    :cond_3
    return-object v4
.end method

.method protected c(J)V
    .locals 2

    .line 434
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    invoke-static {p1, p2}, Lo/bde;->d(J)Lo/brd;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/brb;->c(Lo/brd;)Lo/bqy;

    .line 435
    return-void
.end method

.method public d(Landroid/content/Intent;)Lcom/huawei/health/sns/model/chat/MessageItem;
    .locals 4

    .line 214
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 216
    const-string v0, "ChatCommonLogic"

    const-string v1, "createVcardMessageItem  but data is null."

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 217
    const/4 v0, 0x0

    return-object v0

    .line 220
    :cond_0
    const-string v0, "user"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/health/sns/model/user/User;

    .line 221
    const/4 v0, 0x0

    if-ne v0, v2, :cond_1

    .line 223
    const-string v0, "ChatCommonLogic"

    const-string v1, "createVcardMessageItem  but user is null."

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 224
    const/4 v0, 0x0

    return-object v0

    .line 227
    :cond_1
    new-instance v3, Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-direct {v3}, Lcom/huawei/health/sns/model/chat/MessageItem;-><init>()V

    .line 228
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgStatus(I)V

    .line 229
    const/4 v0, 0x3

    invoke-virtual {v3, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgContentType(I)V

    .line 230
    invoke-virtual {v2}, Lcom/huawei/health/sns/model/user/User;->getUserId()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMediaUrl(Ljava/lang/String;)V

    .line 231
    invoke-virtual {v2}, Lcom/huawei/health/sns/model/user/User;->getNickName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMediaRemark(Ljava/lang/String;)V

    .line 232
    const-string v0, "ChatCommonLogic"

    const-string v1, "createVcardMessageItem.  create work is success."

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 233
    return-object v3
.end method

.method public e(J)V
    .locals 2

    .line 284
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    invoke-static {p1, p2}, Lo/bde;->a(J)Lo/brd;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/brb;->c(Lo/brd;)Lo/bqy;

    .line 285
    return-void
.end method

.method public e(Landroid/app/Activity;JI)V
    .locals 1

    .line 366
    packed-switch p4, :pswitch_data_0

    goto :goto_0

    .line 369
    :pswitch_0
    invoke-direct {p0, p1, p2, p3}, Lo/bde;->d(Landroid/app/Activity;J)V

    .line 370
    goto :goto_0

    .line 372
    :pswitch_1
    sget v0, Lcom/huawei/android/sns/R$string;->sns_add_friend_more_req:I

    invoke-static {p1, v0}, Lo/brh;->c(Landroid/app/Activity;I)V

    .line 373
    goto :goto_0

    .line 375
    :pswitch_2
    sget v0, Lcom/huawei/android/sns/R$string;->sns_self_friend_over:I

    invoke-static {p1, v0}, Lo/brh;->c(Landroid/app/Activity;I)V

    .line 376
    goto :goto_0

    .line 378
    :pswitch_3
    sget v0, Lcom/huawei/android/sns/R$string;->sns_other_friend_over:I

    invoke-static {p1, v0}, Lo/brh;->c(Landroid/app/Activity;I)V

    .line 379
    .line 384
    :goto_0
    :pswitch_4
    if-eqz p4, :cond_0

    const/4 v0, 0x5

    if-ne p4, v0, :cond_1

    .line 386
    :cond_0
    invoke-virtual {p0, p2, p3}, Lo/bde;->c(J)V

    .line 388
    :cond_1
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_4
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method
