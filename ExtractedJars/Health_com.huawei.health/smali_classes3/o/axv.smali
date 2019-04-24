.class public Lo/axv;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Cloneable;


# instance fields
.field private a:J

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:I

.field private e:I

.field private f:Ljava/lang/String;

.field private g:Ljava/lang/CharSequence;

.field private h:Ljava/lang/String;

.field private i:Ljava/lang/String;

.field private k:Ljava/lang/String;

.field private l:I

.field private m:I

.field private n:I

.field private o:I

.field private p:I

.field private q:I

.field private r:Ljava/lang/String;

.field private s:Ljava/lang/String;

.field private t:I

.field private u:I

.field private v:I

.field private y:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 177
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 68
    const/4 v0, -0x1

    iput v0, p0, Lo/axv;->e:I

    .line 116
    const/4 v0, 0x1

    iput v0, p0, Lo/axv;->m:I

    .line 121
    const/4 v0, 0x0

    iput v0, p0, Lo/axv;->n:I

    .line 126
    const/4 v0, 0x1

    iput v0, p0, Lo/axv;->l:I

    .line 144
    const/4 v0, 0x0

    iput v0, p0, Lo/axv;->q:I

    .line 149
    const/4 v0, 0x0

    iput v0, p0, Lo/axv;->t:I

    .line 154
    const-string v0, "0"

    iput-object v0, p0, Lo/axv;->s:Ljava/lang/String;

    .line 179
    return-void
.end method

.method public constructor <init>(JILjava/lang/String;)V
    .locals 1

    .line 182
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 68
    const/4 v0, -0x1

    iput v0, p0, Lo/axv;->e:I

    .line 116
    const/4 v0, 0x1

    iput v0, p0, Lo/axv;->m:I

    .line 121
    const/4 v0, 0x0

    iput v0, p0, Lo/axv;->n:I

    .line 126
    const/4 v0, 0x1

    iput v0, p0, Lo/axv;->l:I

    .line 144
    const/4 v0, 0x0

    iput v0, p0, Lo/axv;->q:I

    .line 149
    const/4 v0, 0x0

    iput v0, p0, Lo/axv;->t:I

    .line 154
    const-string v0, "0"

    iput-object v0, p0, Lo/axv;->s:Ljava/lang/String;

    .line 183
    iput-wide p1, p0, Lo/axv;->a:J

    .line 184
    iput p3, p0, Lo/axv;->m:I

    .line 185
    iput-object p4, p0, Lo/axv;->b:Ljava/lang/String;

    .line 186
    return-void
.end method

.method public constructor <init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 189
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 68
    const/4 v0, -0x1

    iput v0, p0, Lo/axv;->e:I

    .line 116
    const/4 v0, 0x1

    iput v0, p0, Lo/axv;->m:I

    .line 121
    const/4 v0, 0x0

    iput v0, p0, Lo/axv;->n:I

    .line 126
    const/4 v0, 0x1

    iput v0, p0, Lo/axv;->l:I

    .line 144
    const/4 v0, 0x0

    iput v0, p0, Lo/axv;->q:I

    .line 149
    const/4 v0, 0x0

    iput v0, p0, Lo/axv;->t:I

    .line 154
    const-string v0, "0"

    iput-object v0, p0, Lo/axv;->s:Ljava/lang/String;

    .line 190
    iput-wide p1, p0, Lo/axv;->a:J

    .line 191
    iput-object p3, p0, Lo/axv;->b:Ljava/lang/String;

    .line 192
    iput-object p4, p0, Lo/axv;->h:Ljava/lang/String;

    .line 193
    iput-object p5, p0, Lo/axv;->i:Ljava/lang/String;

    .line 194
    iput-object p6, p0, Lo/axv;->k:Ljava/lang/String;

    .line 195
    return-void
.end method

.method private constructor <init>(Landroid/database/Cursor;Z)V
    .locals 1

    .line 296
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 68
    const/4 v0, -0x1

    iput v0, p0, Lo/axv;->e:I

    .line 116
    const/4 v0, 0x1

    iput v0, p0, Lo/axv;->m:I

    .line 121
    const/4 v0, 0x0

    iput v0, p0, Lo/axv;->n:I

    .line 126
    const/4 v0, 0x1

    iput v0, p0, Lo/axv;->l:I

    .line 144
    const/4 v0, 0x0

    iput v0, p0, Lo/axv;->q:I

    .line 149
    const/4 v0, 0x0

    iput v0, p0, Lo/axv;->t:I

    .line 154
    const-string v0, "0"

    iput-object v0, p0, Lo/axv;->s:Ljava/lang/String;

    .line 297
    if-eqz p1, :cond_0

    .line 298
    invoke-static {p0, p1, p2}, Lo/axv;->b(Lo/axv;Landroid/database/Cursor;Z)V

    .line 300
    :cond_0
    return-void
.end method

.method public static b(Landroid/database/Cursor;)Lo/axv;
    .locals 2

    .line 304
    new-instance v1, Lo/axv;

    const/4 v0, 0x0

    invoke-direct {v1, p0, v0}, Lo/axv;-><init>(Landroid/database/Cursor;Z)V

    .line 305
    return-object v1
.end method

.method private static b(JLjava/lang/String;)V
    .locals 2

    .line 403
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    new-instance v1, Lo/axv$3;

    invoke-direct {v1, p0, p1, p2}, Lo/axv$3;-><init>(JLjava/lang/String;)V

    invoke-virtual {v0, v1}, Lo/brb;->c(Lo/brd;)Lo/bqy;

    .line 414
    return-void
.end method

.method private static b(Lo/axv;Landroid/database/Cursor;Z)V
    .locals 14

    .line 310
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    iput v0, p0, Lo/axv;->d:I

    .line 311
    const/4 v0, 0x1

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    iput-wide v0, p0, Lo/axv;->a:J

    .line 312
    const/4 v0, 0x2

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/axv;->g:Ljava/lang/CharSequence;

    .line 313
    const/4 v0, 0x3

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/axv;->f:Ljava/lang/String;

    .line 314
    const/4 v0, 0x4

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    iput v0, p0, Lo/axv;->p:I

    .line 315
    const/4 v0, 0x5

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    iput v0, p0, Lo/axv;->u:I

    .line 316
    const/4 v0, 0x6

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    iput v0, p0, Lo/axv;->l:I

    .line 317
    const/4 v0, 0x7

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    iput v0, p0, Lo/axv;->o:I

    .line 318
    const/16 v0, 0x8

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v6

    .line 319
    iput v6, p0, Lo/axv;->m:I

    .line 320
    const/16 v0, 0xa

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/axv;->s:Ljava/lang/String;

    .line 321
    const/16 v0, 0x9

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    iput v0, p0, Lo/axv;->t:I

    .line 322
    const/16 v0, 0x1b

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/axv;->r:Ljava/lang/String;

    .line 324
    const/4 v0, 0x1

    if-ne v6, v0, :cond_5

    .line 326
    const/16 v0, 0x19

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    iput v0, p0, Lo/axv;->n:I

    .line 327
    const/16 v0, 0x18

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x19

    invoke-interface {p1, v1}, Landroid/database/Cursor;->getInt(I)I

    move-result v1

    invoke-static {v0, v1}, Lo/axv;->e(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lo/axv;->q:I

    .line 328
    const/16 v0, 0xb

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v7

    .line 329
    const/16 v0, 0xc

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v8

    .line 332
    move-object v9, v7

    .line 333
    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 335
    move-object v9, v8

    .line 337
    :cond_0
    invoke-static {v9}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 339
    const/16 v0, 0x1d

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v10

    .line 340
    invoke-static {v10}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 342
    move-object v9, v10

    goto :goto_0

    .line 346
    :cond_1
    const-string v0, "fillFromCursor"

    const-string v1, "userName is null"

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 348
    invoke-static {}, Lo/axa;->a()Lo/axa;

    move-result-object v0

    iget-wide v1, p0, Lo/axv;->a:J

    invoke-virtual {v0, v1, v2}, Lo/axa;->a(J)Lcom/huawei/health/sns/model/user/User;

    move-result-object v11

    .line 349
    const/4 v0, 0x0

    if-eq v0, v11, :cond_3

    .line 351
    new-instance v12, Lo/anq;

    invoke-direct {v12}, Lo/anq;-><init>()V

    .line 352
    invoke-virtual {v11}, Lcom/huawei/health/sns/model/user/User;->getAccount()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v12, v0}, Lo/anq;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 353
    invoke-static {v9}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 354
    new-instance v13, Lcom/huawei/health/sns/server/user/GetOtherUserInfoRequest;

    invoke-direct {v13}, Lcom/huawei/health/sns/server/user/GetOtherUserInfoRequest;-><init>()V

    .line 355
    move-object v0, v13

    iget-wide v1, p0, Lo/axv;->a:J

    const/4 v3, 0x0

    const-wide/16 v4, 0x0

    invoke-virtual/range {v0 .. v5}, Lcom/huawei/health/sns/server/user/GetOtherUserInfoRequest;->setData(JIJ)V

    .line 356
    new-instance v0, Lo/axf;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/axf;-><init>(Landroid/os/Handler;)V

    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v1

    .line 357
    invoke-virtual {v1}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v1

    .line 356
    const/16 v2, 0x25

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v1, v13, v3}, Lo/axf;->c(ILandroid/content/Context;Lcom/huawei/health/sns/server/user/GetOtherUserInfoRequest;Ljava/lang/String;)V

    .line 359
    :cond_2
    const-string v0, "ConversationItem"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "userName = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 364
    :cond_3
    :goto_0
    iput-object v9, p0, Lo/axv;->b:Ljava/lang/String;

    .line 365
    const/16 v0, 0xd

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/axv;->i:Ljava/lang/String;

    .line 366
    const/16 v0, 0xe

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/axv;->h:Ljava/lang/String;

    .line 367
    const/16 v0, 0xf

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/axv;->k:Ljava/lang/String;

    .line 368
    const/16 v0, 0x16

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/axv;->c:Ljava/lang/String;

    .line 370
    const/16 v0, 0x17

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v10

    .line 371
    invoke-static {v10}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_4

    iget-object v0, p0, Lo/axv;->s:Ljava/lang/String;

    invoke-virtual {v10, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 373
    iget-wide v0, p0, Lo/axv;->a:J

    invoke-static {v0, v1, v10}, Lo/axv;->b(JLjava/lang/String;)V

    .line 376
    :cond_4
    const/16 v0, 0x1e

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v11

    .line 377
    invoke-virtual {p0, v11}, Lo/axv;->a(I)V

    .line 378
    goto/16 :goto_1

    .line 379
    :cond_5
    const/4 v0, 0x2

    if-ne v6, v0, :cond_6

    .line 381
    const/16 v0, 0x15

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    iput v0, p0, Lo/axv;->q:I

    .line 382
    const/16 v0, 0x10

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/axv;->b:Ljava/lang/String;

    .line 383
    const/16 v0, 0x11

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/axv;->i:Ljava/lang/String;

    .line 384
    const/16 v0, 0x12

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/axv;->h:Ljava/lang/String;

    .line 385
    const/16 v0, 0x13

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/axv;->k:Ljava/lang/String;

    .line 386
    const/16 v0, 0x16

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/axv;->c:Ljava/lang/String;

    .line 388
    const/16 v0, 0x1a

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/axv;->y:Ljava/lang/String;

    .line 389
    const/16 v0, 0x1c

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    iput v0, p0, Lo/axv;->v:I

    .line 392
    const/16 v0, 0x14

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v7

    .line 393
    const/4 v0, 0x1

    invoke-static {v7, v0}, Lo/bqz;->a(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_6

    iget-object v0, p0, Lo/axv;->s:Ljava/lang/String;

    invoke-virtual {v7, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    .line 395
    iget-wide v0, p0, Lo/axv;->a:J

    invoke-static {v0, v1, v7}, Lo/axv;->b(JLjava/lang/String;)V

    .line 398
    :cond_6
    :goto_1
    return-void
.end method

.method private static e(Ljava/lang/String;I)I
    .locals 2

    .line 661
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 663
    if-nez p1, :cond_0

    .line 665
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_1

    .line 667
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    invoke-static {v0}, Lo/bqz;->d(C)I

    move-result v0

    return v0

    .line 670
    :cond_0
    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    .line 672
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_1

    .line 674
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    invoke-static {v0}, Lo/bqz;->d(C)I

    move-result v0

    return v0

    .line 678
    :cond_1
    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .line 484
    iget-object v0, p0, Lo/axv;->h:Ljava/lang/String;

    .line 485
    return-object v0
.end method

.method public a(I)V
    .locals 0

    .line 418
    iput p1, p0, Lo/axv;->e:I

    .line 419
    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 0

    .line 490
    iput-object p1, p0, Lo/axv;->h:Ljava/lang/String;

    .line 491
    return-void
.end method

.method public b()J
    .locals 2

    .line 440
    iget-wide v0, p0, Lo/axv;->a:J

    .line 441
    return-wide v0
.end method

.method public b(Ljava/lang/String;)V
    .locals 0

    .line 479
    iput-object p1, p0, Lo/axv;->i:Ljava/lang/String;

    .line 480
    return-void
.end method

.method public c()Ljava/lang/String;
    .locals 1

    .line 462
    iget-object v0, p0, Lo/axv;->b:Ljava/lang/String;

    .line 463
    return-object v0
.end method

.method public clone()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/CloneNotSupportedException;
        }
    .end annotation

    .line 173
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public d(J)V
    .locals 0

    .line 446
    iput-wide p1, p0, Lo/axv;->a:J

    .line 447
    return-void
.end method

.method public d(Ljava/lang/String;)V
    .locals 0

    .line 468
    iput-object p1, p0, Lo/axv;->b:Ljava/lang/String;

    .line 469
    return-void
.end method

.method public d()[Ljava/lang/String;
    .locals 3

    .line 199
    const/16 v0, 0x1f

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "t_conversation._id as _id"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "t_conversation.user_id"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, "t_conversation.last_message"

    const/4 v2, 0x2

    aput-object v1, v0, v2

    const-string v1, "t_conversation.last_message_date"

    const/4 v2, 0x3

    aput-object v1, v0, v2

    const-string v1, "t_conversation.message_status"

    const/4 v2, 0x4

    aput-object v1, v0, v2

    const-string v1, "t_conversation.send_message_status"

    const/4 v2, 0x5

    aput-object v1, v0, v2

    const-string v1, "t_conversation.message_type"

    const/4 v2, 0x6

    aput-object v1, v0, v2

    const-string v1, "t_conversation.message_unread_number"

    const/4 v2, 0x7

    aput-object v1, v0, v2

    const-string v1, "t_conversation.chat_type"

    const/16 v2, 0x8

    aput-object v1, v0, v2

    const-string v1, "t_conversation.is_removed"

    const/16 v2, 0x9

    aput-object v1, v0, v2

    const-string v1, "t_conversation.top_time"

    const/16 v2, 0xa

    aput-object v1, v0, v2

    const-string v1, "t_user.nick_name"

    const/16 v2, 0xb

    aput-object v1, v0, v2

    const-string v1, "t_user.remark_name"

    const/16 v2, 0xc

    aput-object v1, v0, v2

    const-string v1, "t_user.image_url"

    const/16 v2, 0xd

    aput-object v1, v0, v2

    const-string v1, "t_user.old_image_url"

    const/16 v2, 0xe

    aput-object v1, v0, v2

    const-string v1, "t_user.image_url_download"

    const/16 v2, 0xf

    aput-object v1, v0, v2

    const-string v1, "t_group.group_name"

    const/16 v2, 0x10

    aput-object v1, v0, v2

    const-string v1, "t_group.group_image_url"

    const/16 v2, 0x11

    aput-object v1, v0, v2

    const-string v1, "t_group.old_group_image_url"

    const/16 v2, 0x12

    aput-object v1, v0, v2

    const-string v1, "t_group.group_image_download_url"

    const/16 v2, 0x13

    aput-object v1, v0, v2

    const-string v1, "t_group.stick_time"

    const/16 v2, 0x14

    aput-object v1, v0, v2

    const-string v1, "t_group.disturb_mode"

    const/16 v2, 0x15

    aput-object v1, v0, v2

    const-string v1, "t_conversation.msg_id"

    const/16 v2, 0x16

    aput-object v1, v0, v2

    const-string v1, "t_user.stick_time"

    const/16 v2, 0x17

    aput-object v1, v0, v2

    const-string v1, "t_user.set_flags"

    const/16 v2, 0x18

    aput-object v1, v0, v2

    const-string v1, "t_user.user_type"

    const/16 v2, 0x19

    aput-object v1, v0, v2

    const-string v1, "t_conversation.last_message_sender_name"

    const/16 v2, 0x1a

    aput-object v1, v0, v2

    const-string v1, "t_conversation.conversation_draft_message_text"

    const/16 v2, 0x1b

    aput-object v1, v0, v2

    const-string v1, "t_conversation.unread_reffered_self_msg_number"

    const/16 v2, 0x1c

    aput-object v1, v0, v2

    const-string v1, "t_user.display_name"

    const/16 v2, 0x1d

    aput-object v1, v0, v2

    const-string v1, "t_user.relation"

    const/16 v2, 0x1e

    aput-object v1, v0, v2

    return-object v0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    .line 473
    iget-object v0, p0, Lo/axv;->i:Ljava/lang/String;

    .line 474
    return-object v0
.end method

.method public e(I)V
    .locals 0

    .line 544
    iput p1, p0, Lo/axv;->m:I

    .line 545
    return-void
.end method

.method public e(Ljava/lang/String;)V
    .locals 0

    .line 501
    iput-object p1, p0, Lo/axv;->k:Ljava/lang/String;

    .line 502
    return-void
.end method

.method public f()I
    .locals 1

    .line 538
    iget v0, p0, Lo/axv;->m:I

    .line 539
    return v0
.end method

.method public g()Ljava/lang/String;
    .locals 1

    .line 495
    iget-object v0, p0, Lo/axv;->k:Ljava/lang/String;

    .line 496
    return-object v0
.end method

.method public h()Ljava/lang/CharSequence;
    .locals 1

    .line 506
    iget-object v0, p0, Lo/axv;->g:Ljava/lang/CharSequence;

    return-object v0
.end method

.method public i()I
    .locals 1

    .line 527
    iget v0, p0, Lo/axv;->p:I

    .line 528
    return v0
.end method

.method public k()Ljava/lang/String;
    .locals 1

    .line 516
    iget-object v0, p0, Lo/axv;->f:Ljava/lang/String;

    .line 517
    return-object v0
.end method

.method public l()I
    .locals 1

    .line 560
    iget v0, p0, Lo/axv;->l:I

    .line 561
    return v0
.end method

.method public m()I
    .locals 1

    .line 571
    iget v0, p0, Lo/axv;->o:I

    .line 572
    return v0
.end method

.method public n()I
    .locals 1

    .line 549
    iget v0, p0, Lo/axv;->n:I

    .line 550
    return v0
.end method

.method public o()I
    .locals 1

    .line 577
    iget v0, p0, Lo/axv;->u:I

    .line 578
    return v0
.end method

.method public p()I
    .locals 1

    .line 588
    iget v0, p0, Lo/axv;->q:I

    .line 589
    return v0
.end method

.method public q()Ljava/lang/String;
    .locals 1

    .line 610
    iget-object v0, p0, Lo/axv;->s:Ljava/lang/String;

    .line 611
    return-object v0
.end method

.method public r()Ljava/lang/String;
    .locals 1

    .line 632
    iget-object v0, p0, Lo/axv;->y:Ljava/lang/String;

    .line 633
    return-object v0
.end method

.method public t()Ljava/lang/String;
    .locals 1

    .line 621
    iget-object v0, p0, Lo/axv;->r:Ljava/lang/String;

    .line 622
    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 683
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ConversationItem{id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/axv;->d:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", userId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lo/axv;->a:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", relation="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/axv;->e:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", msgId=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/axv;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", name=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/axv;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", imageUrl_=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/axv;->i:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", lastMessage="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/axv;->g:Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", lastMessageDate=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/axv;->f:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", msgStatus="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/axv;->p:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", chatType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/axv;->m:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", userType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/axv;->n:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", msgContentType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/axv;->l:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", messageUnreadNumber="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/axv;->o:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", sendMessageStatus="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/axv;->u:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", undisturb="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/axv;->q:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", isRemoved="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/axv;->t:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", top=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/axv;->s:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", conversationDraftMessageText=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/axv;->r:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", lastMessageSenderName=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/axv;->y:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", unreadRefferedSelfMsgNumber="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/axv;->v:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public u()I
    .locals 1

    .line 643
    iget v0, p0, Lo/axv;->v:I

    .line 644
    return v0
.end method
