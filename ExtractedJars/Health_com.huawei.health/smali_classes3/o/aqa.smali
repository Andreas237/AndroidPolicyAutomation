.class public final Lo/aqa;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Lo/apo;


# direct methods
.method public constructor <init>(Lo/apo;)V
    .locals 1

    .line 56
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 53
    const/4 v0, 0x0

    iput-object v0, p0, Lo/aqa;->a:Lo/apo;

    .line 57
    iput-object p1, p0, Lo/aqa;->a:Lo/apo;

    .line 58
    return-void
.end method

.method private a(Lcom/huawei/health/sns/model/chat/MessageItem;)V
    .locals 9

    .line 418
    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgContentType(I)V

    .line 421
    invoke-static {}, Lo/ape;->d()Lo/ape;

    move-result-object v0

    invoke-virtual {v0}, Lo/ape;->e()Lo/axq;

    move-result-object v3

    .line 422
    invoke-static {}, Lo/ape;->d()Lo/ape;

    move-result-object v0

    invoke-virtual {v0}, Lo/ape;->b()J

    move-result-wide v4

    .line 423
    invoke-static {}, Lo/apg;->b()Lo/apg;

    move-result-object v0

    invoke-virtual {v0, v4, v5}, Lo/apg;->c(J)Lcom/huawei/health/sns/model/chat/Assistant;

    move-result-object v6

    .line 425
    if-eqz v3, :cond_2

    .line 427
    new-instance v7, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;

    invoke-virtual {v3}, Lo/axq;->c()Ljava/lang/String;

    move-result-object v0

    .line 428
    invoke-virtual {v3}, Lo/axq;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3}, Lo/axq;->d()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v7, v0, v1, v2}, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 429
    invoke-virtual {v3}, Lo/axq;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgContent(Ljava/lang/String;)V

    .line 430
    if-eqz v6, :cond_0

    .line 432
    invoke-virtual {v6}, Lcom/huawei/health/sns/model/chat/Assistant;->getAppId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6}, Lcom/huawei/health/sns/model/chat/Assistant;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v6}, Lcom/huawei/health/sns/model/chat/Assistant;->getRequireVersion()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v7, v0, v1, v2}, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;->setLinkData(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 435
    :cond_0
    invoke-virtual {v3}, Lo/axq;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0xc8

    invoke-direct {p0, v0, v1, v4, v5}, Lo/aqa;->d(Ljava/lang/String;IJ)Landroid/graphics/Bitmap;

    move-result-object v8

    .line 436
    if-eqz v8, :cond_1

    .line 438
    invoke-static {v8}, Lo/bae;->e(Landroid/graphics/Bitmap;)Lcom/huawei/health/sns/server/im/message/impl/packet/LinkMsgBlobItem;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;->addBlobItem(Lcom/huawei/health/sns/server/im/message/impl/packet/LinkMsgBlobItem;)V

    goto :goto_0

    .line 442
    :cond_1
    const-string v0, "MessageTranferImpl"

    const-string v1, "convertToLinkMsg bitmap is null"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 445
    :goto_0
    invoke-virtual {p1, v7}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgTypeData(Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;)V

    .line 446
    invoke-static {p1}, Lo/apw;->d(Lcom/huawei/health/sns/model/chat/MessageItem;)Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;

    .line 447
    goto :goto_1

    .line 450
    :cond_2
    const-string v0, "MessageTranferImpl"

    const-string v1, "convertToLinkMsg cacheMsg is null"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 452
    :goto_1
    return-void
.end method

.method private b(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 498
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;

    move-result-object v0

    if-nez v0, :cond_0

    .line 500
    const/4 v0, 0x0

    return-object v0

    .line 502
    :cond_0
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable$ConstantState;->newDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    return-object v0
.end method

.method private d(Ljava/lang/String;IJ)Landroid/graphics/Bitmap;
    .locals 7

    .line 463
    const/4 v3, 0x0

    .line 464
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 467
    invoke-static {p1}, Lo/bay;->b(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v4

    .line 468
    if-eqz v4, :cond_0

    .line 470
    invoke-direct {p0, v4}, Lo/aqa;->b(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-static {v0}, Lo/boe;->b(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Bitmap;

    move-result-object v3

    goto :goto_0

    .line 474
    :cond_0
    invoke-static {}, Lo/bbh;->d()Lo/bbh;

    move-result-object v0

    .line 475
    invoke-static {p3, p4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    const-string v2, "image"

    .line 474
    invoke-virtual {v0, v1, v2}, Lo/bbh;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 476
    new-instance v6, Lo/baw;

    invoke-direct {v6, p1, v5}, Lo/baw;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 477
    invoke-virtual {v6, p2}, Lo/bbi;->b(I)V

    .line 478
    invoke-virtual {v6, p2}, Lo/bbi;->c(I)V

    .line 480
    invoke-static {v6}, Lo/bay;->b(Lo/bbi;)Landroid/graphics/Bitmap;

    move-result-object v3

    .line 482
    :goto_0
    goto :goto_1

    .line 485
    :cond_1
    const-string v0, "MessageTranferImpl"

    const-string v1, "getAssistMsgImage url is empty"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 487
    :goto_1
    return-object v3
.end method

.method static synthetic d(Lo/aqa;)Lo/apo;
    .locals 1

    .line 49
    iget-object v0, p0, Lo/aqa;->a:Lo/apo;

    return-object v0
.end method

.method private d(Ljava/lang/String;Ljava/lang/String;JI)Lo/brd;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/lang/String;JI)Lo/brd<Ljava/lang/Void;>;"
        }
    .end annotation

    .line 190
    new-instance v0, Lo/aqa$4;

    move-object v1, p0

    move-object v2, p2

    move-wide v3, p3

    move v5, p5

    move-object v6, p1

    invoke-direct/range {v0 .. v6}, Lo/aqa$4;-><init>(Lo/aqa;Ljava/lang/String;JILjava/lang/String;)V

    return-object v0
.end method

.method static synthetic d(Lo/aqa;Lcom/huawei/health/sns/model/chat/MessageItem;Ljava/util/List;)V
    .locals 0

    .line 49
    invoke-direct {p0, p1, p2}, Lo/aqa;->e(Lcom/huawei/health/sns/model/chat/MessageItem;Ljava/util/List;)V

    return-void
.end method

.method private e(Lo/axq;Lcom/huawei/health/sns/model/chat/MessageItem;)Lcom/huawei/health/sns/model/chat/MessageItem;
    .locals 7

    .line 297
    if-nez p1, :cond_0

    .line 299
    const/4 v0, 0x0

    return-object v0

    .line 301
    :cond_0
    new-instance v4, Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-virtual {p2}, Lcom/huawei/health/sns/model/chat/MessageItem;->getId()I

    move-result v0

    invoke-virtual {p1}, Lo/axq;->c()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x8

    invoke-direct {v4, v0, v2, v1}, Lcom/huawei/health/sns/model/chat/MessageItem;-><init>(IILjava/lang/String;)V

    .line 302
    new-instance v5, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;

    invoke-virtual {p1}, Lo/axq;->c()Ljava/lang/String;

    move-result-object v0

    .line 303
    invoke-virtual {p1}, Lo/axq;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lo/axq;->d()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v5, v0, v1, v2}, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 305
    invoke-virtual {p1}, Lo/axq;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2}, Lcom/huawei/health/sns/model/chat/MessageItem;->getUserId()J

    move-result-wide v1

    const/16 v3, 0xc8

    invoke-direct {p0, v0, v3, v1, v2}, Lo/aqa;->d(Ljava/lang/String;IJ)Landroid/graphics/Bitmap;

    move-result-object v6

    .line 306
    if-eqz v6, :cond_1

    .line 308
    invoke-static {v6}, Lo/bae;->e(Landroid/graphics/Bitmap;)Lcom/huawei/health/sns/server/im/message/impl/packet/LinkMsgBlobItem;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;->addBlobItem(Lcom/huawei/health/sns/server/im/message/impl/packet/LinkMsgBlobItem;)V

    goto :goto_0

    .line 312
    :cond_1
    const-string v0, "MessageTranferImpl"

    const-string v1, "convertLinkMsg bitmap is null"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 315
    :goto_0
    invoke-virtual {v4, v5}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgTypeData(Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;)V

    .line 316
    invoke-static {v4}, Lo/apw;->d(Lcom/huawei/health/sns/model/chat/MessageItem;)Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;

    .line 317
    return-object v4
.end method

.method private e(Ljava/lang/String;[Ljava/lang/String;JI)Lo/brd;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;[Ljava/lang/String;JI)Lo/brd<Ljava/lang/Void;>;"
        }
    .end annotation

    .line 128
    new-instance v0, Lo/aqa$3;

    move-object v1, p0

    move-object v2, p2

    move-wide v3, p3

    move v5, p5

    move-object v6, p1

    invoke-direct/range {v0 .. v6}, Lo/aqa$3;-><init>(Lo/aqa;[Ljava/lang/String;JILjava/lang/String;)V

    return-object v0
.end method

.method private e(Lcom/huawei/health/sns/model/chat/MessageItem;Ljava/util/List;)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/health/sns/model/chat/MessageItem;Ljava/util/List<Lcom/huawei/health/sns/model/chat/MessageItem;>;)V"
        }
    .end annotation

    .line 243
    invoke-static {}, Lo/ape;->d()Lo/ape;

    move-result-object v0

    invoke-virtual {v0}, Lo/ape;->e()Lo/axq;

    move-result-object v2

    .line 245
    if-nez v2, :cond_5

    .line 247
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgAssistJson()Ljava/lang/String;

    move-result-object v3

    .line 248
    new-instance v4, Lo/axs;

    invoke-direct {v4, v3}, Lo/axs;-><init>(Ljava/lang/String;)V

    .line 249
    invoke-virtual {v4}, Lo/axs;->e()Ljava/util/ArrayList;

    move-result-object v5

    .line 250
    if-eqz v5, :cond_4

    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_4

    .line 252
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 253
    const/4 v7, 0x0

    .line 254
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lo/axq;

    .line 256
    const-string v0, "headline"

    invoke-virtual {v9}, Lo/axq;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 258
    move-object v7, v9

    goto :goto_1

    .line 260
    :cond_0
    const-string v0, "subheading"

    invoke-virtual {v9}, Lo/axq;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 262
    invoke-virtual {v6, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 264
    :cond_1
    :goto_1
    goto :goto_0

    .line 266
    :cond_2
    if-eqz v7, :cond_3

    .line 268
    invoke-direct {p0, v7, p1}, Lo/aqa;->e(Lo/axq;Lcom/huawei/health/sns/model/chat/MessageItem;)Lcom/huawei/health/sns/model/chat/MessageItem;

    move-result-object v8

    .line 269
    invoke-interface {p2, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 272
    :cond_3
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_4

    .line 275
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_2
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lo/axq;

    .line 277
    invoke-direct {p0, v10, p1}, Lo/aqa;->e(Lo/axq;Lcom/huawei/health/sns/model/chat/MessageItem;)Lcom/huawei/health/sns/model/chat/MessageItem;

    move-result-object v8

    .line 278
    invoke-interface {p2, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 279
    goto :goto_2

    .line 282
    :cond_4
    goto :goto_3

    .line 286
    :cond_5
    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 288
    :goto_3
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;[Ljava/lang/String;JI)V
    .locals 2

    .line 70
    if-eqz p2, :cond_0

    array-length v0, p2

    if-gtz v0, :cond_1

    .line 72
    :cond_0
    return-void

    .line 76
    :cond_1
    invoke-static {}, Lo/aop;->e()Lo/aop;

    move-result-object v0

    invoke-virtual {v0}, Lo/aop;->b()Z

    move-result v0

    if-nez v0, :cond_2

    .line 78
    const-string v0, "MessageTranferImpl"

    const-string v1, "bind info not exist, show bind dialog."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 80
    invoke-static {}, Lo/aop;->h()V

    .line 83
    :cond_2
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    invoke-direct/range {p0 .. p5}, Lo/aqa;->e(Ljava/lang/String;[Ljava/lang/String;JI)Lo/brd;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/brb;->c(Lo/brd;)Lo/bqy;

    .line 85
    return-void
.end method

.method public c(Ljava/lang/String;Ljava/lang/String;JI)V
    .locals 2

    .line 98
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 100
    const-string v0, "MessageTranferImpl"

    const-string v1, "transferMessage photoPath is null, ignore."

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 101
    return-void

    .line 105
    :cond_0
    invoke-static {}, Lo/aop;->e()Lo/aop;

    move-result-object v0

    invoke-virtual {v0}, Lo/aop;->b()Z

    move-result v0

    if-nez v0, :cond_1

    .line 107
    const-string v0, "MessageTranferImpl"

    const-string v1, "bind info not exist, show bind dialog."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 109
    invoke-static {}, Lo/aop;->h()V

    .line 112
    :cond_1
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    invoke-direct/range {p0 .. p5}, Lo/aqa;->d(Ljava/lang/String;Ljava/lang/String;JI)Lo/brd;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/brb;->c(Lo/brd;)Lo/bqy;

    .line 114
    return-void
.end method

.method public d(Lcom/huawei/health/sns/model/chat/MessageItem;)V
    .locals 4

    .line 328
    if-nez p1, :cond_0

    .line 330
    return-void

    .line 333
    :cond_0
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setSendMsgStatus(I)V

    .line 335
    invoke-static {}, Lo/bak;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgId(Ljava/lang/String;)V

    .line 337
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgStatus(I)V

    .line 338
    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v0

    invoke-virtual {v0}, Lo/aoq;->a()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Lcom/huawei/health/sns/model/chat/MessageItem;->setSenderId(J)V

    .line 339
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgDate(J)V

    .line 342
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgContentType()I

    move-result v0

    const/4 v1, 0x6

    if-ne v0, v1, :cond_1

    .line 344
    invoke-direct {p0, p1}, Lo/aqa;->a(Lcom/huawei/health/sns/model/chat/MessageItem;)V

    goto :goto_0

    .line 346
    :cond_1
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgContentType()I

    move-result v0

    const/16 v1, 0x8

    if-ne v0, v1, :cond_2

    .line 349
    invoke-static {p1}, Lo/apw;->e(Lcom/huawei/health/sns/model/chat/MessageItem;)V

    .line 353
    :cond_2
    :goto_0
    invoke-static {}, Lo/apm;->a()Lo/apm;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/apm;->a(Lcom/huawei/health/sns/model/chat/MessageItem;)I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setId(I)V

    .line 356
    invoke-static {}, Lo/aop;->e()Lo/aop;

    move-result-object v0

    invoke-virtual {v0}, Lo/aop;->d()V

    .line 359
    invoke-static {}, Lo/aop;->e()Lo/aop;

    move-result-object v0

    invoke-virtual {v0}, Lo/aop;->b()Z

    move-result v0

    if-nez v0, :cond_3

    .line 361
    const-string v0, "MessageTranferImpl"

    const-string v1, "no bind info, can\'t transfer msg."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 363
    invoke-static {}, Lo/apm;->a()Lo/apm;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgId()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x3

    invoke-virtual {v0, v1, v2}, Lo/apm;->d(Ljava/lang/String;I)V

    .line 364
    return-void

    .line 368
    :cond_3
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getChatType()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_4

    .line 370
    invoke-static {}, Lo/axa;->a()Lo/axa;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getUserId()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lo/axa;->a(J)Lcom/huawei/health/sns/model/user/User;

    move-result-object v3

    .line 371
    if-eqz v3, :cond_4

    invoke-static {}, Lo/axa;->a()Lo/axa;

    move-result-object v0

    invoke-virtual {v0, v3}, Lo/axa;->i(Lcom/huawei/health/sns/model/user/User;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 373
    const-string v0, "MessageTranferImpl"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "user is not two way, relation="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v3}, Lcom/huawei/health/sns/model/user/User;->getRelation()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 374
    invoke-static {}, Lo/apm;->a()Lo/apm;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgId()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x3

    invoke-virtual {v0, v1, v2}, Lo/apm;->d(Ljava/lang/String;I)V

    .line 375
    new-instance v0, Lo/aqj;

    invoke-direct {v0}, Lo/aqj;-><init>()V

    invoke-virtual {v3}, Lcom/huawei/health/sns/model/user/User;->getUserId()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lo/aqj;->c(J)V

    .line 376
    return-void

    .line 380
    :cond_4
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getChatType()I

    move-result v3

    .line 383
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgContentType()I

    move-result v0

    const/4 v1, 0x2

    if-ne v1, v0, :cond_5

    .line 385
    invoke-static {}, Lo/aus;->b()Lo/aus;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/aus;->b(Lcom/huawei/health/sns/model/chat/MessageItem;)V

    goto :goto_1

    .line 390
    :cond_5
    const/4 v0, 0x1

    if-ne v3, v0, :cond_6

    .line 392
    invoke-static {}, Lo/app;->d()Lo/app;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, p1, v1}, Lo/app;->b(Lcom/huawei/health/sns/model/chat/MessageItem;Z)V

    goto :goto_1

    .line 394
    :cond_6
    const/4 v0, 0x2

    if-ne v3, v0, :cond_7

    .line 396
    invoke-static {}, Lo/app;->d()Lo/app;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lo/app;->b(Lcom/huawei/health/sns/model/chat/MessageItem;Z)V

    .line 400
    :cond_7
    :goto_1
    const/4 v0, 0x1

    if-ne v3, v0, :cond_8

    .line 402
    const/4 v0, 0x1

    const v1, 0x310dc

    invoke-static {v0, v1, p1}, Lo/apf;->d(IILjava/lang/Object;)V

    goto :goto_2

    .line 404
    :cond_8
    const/4 v0, 0x2

    if-ne v3, v0, :cond_9

    .line 406
    const/4 v0, 0x2

    const v1, 0x310dc

    invoke-static {v0, v1, p1}, Lo/apf;->d(IILjava/lang/Object;)V

    .line 408
    :cond_9
    :goto_2
    return-void
.end method
