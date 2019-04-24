.class public Lo/ait;
.super Lo/ail;
.source "SourceFile"


# static fields
.field private static b:Ljava/lang/String;


# instance fields
.field private a:[B

.field private e:Lo/aiy;

.field private f:[B

.field private g:[B

.field private h:[B

.field private i:[B

.field private k:[B

.field private l:[B

.field private m:[B

.field private n:Ljava/lang/String;

.field private o:I

.field private p:Ljava/lang/Long;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 34
    const-string v0, "CoapIdentifyCodeBuilder"

    sput-object v0, Lo/ait;->b:Ljava/lang/String;

    .line 76
    invoke-static {}, Lo/ajx;->c()V

    .line 77
    return-void
.end method

.method public constructor <init>(Lo/aiy;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;I)V
    .locals 4

    .line 84
    invoke-direct {p0}, Lo/ail;-><init>()V

    .line 36
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ait;->e:Lo/aiy;

    .line 52
    const/16 v0, 0x10

    new-array v0, v0, [B

    iput-object v0, p0, Lo/ait;->a:[B

    .line 54
    const/16 v0, 0x10

    new-array v0, v0, [B

    iput-object v0, p0, Lo/ait;->i:[B

    .line 57
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ait;->g:[B

    .line 59
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ait;->k:[B

    .line 60
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ait;->h:[B

    .line 63
    const/4 v0, 0x2

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    iput-object v0, p0, Lo/ait;->f:[B

    .line 64
    const/16 v0, 0xb

    new-array v0, v0, [B

    fill-array-data v0, :array_1

    iput-object v0, p0, Lo/ait;->m:[B

    .line 65
    const/4 v0, 0x2

    new-array v0, v0, [B

    fill-array-data v0, :array_2

    iput-object v0, p0, Lo/ait;->l:[B

    .line 68
    const-string v0, ""

    iput-object v0, p0, Lo/ait;->n:Ljava/lang/String;

    .line 80
    const-string v0, "/cloudSetup"

    iput-object v0, p0, Lo/ail;->d:Ljava/lang/String;

    .line 81
    const-wide/16 v0, 0x2710

    iput-wide v0, p0, Lo/ail;->c:J

    .line 86
    iput-object p1, p0, Lo/ait;->e:Lo/aiy;

    .line 87
    iput-object p4, p0, Lo/ait;->n:Ljava/lang/String;

    .line 88
    iput-object p5, p0, Lo/ait;->p:Ljava/lang/Long;

    .line 89
    iput p6, p0, Lo/ait;->o:I

    .line 90
    sget-object v0, Lo/ait;->b:Ljava/lang/String;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mOptSeq: "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget v2, p0, Lo/ait;->o:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x1

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 92
    invoke-direct {p0, p2, p3}, Lo/ait;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 93
    return-void

    nop

    :array_0
    .array-data 1
        0x43t
        0x2t
    .end array-data

    nop

    :array_1
    .array-data 1
        -0x46t
        0x63t
        0x6ct
        0x6ft
        0x75t
        0x64t
        0x53t
        0x65t
        0x74t
        0x75t
        0x70t
    .end array-data

    :array_2
    .array-data 1
        0x11t
        0x32t
    .end array-data
.end method

.method private c([B)[B
    .locals 14

    .line 321
    if-eqz p1, :cond_0

    iget-object v0, p0, Lo/ait;->n:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/ait;->p:Ljava/lang/Long;

    if-nez v0, :cond_1

    .line 322
    :cond_0
    sget-object v0, Lo/ait;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getCoapFrame para is wroing!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 323
    const/4 v0, 0x0

    return-object v0

    .line 330
    :cond_1
    iget-object v0, p0, Lo/ait;->n:Ljava/lang/String;

    const-string v1, "UTF-8"

    invoke-static {v1}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    array-length v5, v0

    .line 333
    const/16 v0, 0x10

    if-le v5, v0, :cond_2

    .line 334
    sget-object v0, Lo/ait;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mSessId.len is wrong!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 335
    const/4 v0, 0x0

    return-object v0

    .line 341
    :cond_2
    const/16 v0, 0xd

    if-lt v5, v0, :cond_3

    .line 342
    const/4 v0, 0x4

    new-array v6, v0, [B

    .line 343
    add-int/lit8 v0, v5, 0x4

    new-array v4, v0, [B

    .line 345
    const/16 v0, -0x13

    const/4 v1, 0x0

    aput-byte v0, v6, v1

    .line 346
    const/4 v0, 0x6

    const/4 v1, 0x1

    aput-byte v0, v6, v1

    .line 347
    const/16 v0, -0x19

    const/4 v1, 0x2

    aput-byte v0, v6, v1

    .line 348
    add-int/lit8 v0, v5, -0xd

    int-to-byte v0, v0

    const/4 v1, 0x3

    aput-byte v0, v6, v1

    goto :goto_0

    .line 350
    :cond_3
    const/4 v0, 0x3

    new-array v6, v0, [B

    .line 351
    add-int/lit8 v0, v5, 0x3

    new-array v4, v0, [B

    .line 352
    or-int/lit16 v0, v5, 0xe0

    int-to-byte v0, v0

    const/4 v1, 0x0

    aput-byte v0, v6, v1

    .line 353
    const/4 v0, 0x6

    const/4 v1, 0x1

    aput-byte v0, v6, v1

    .line 354
    const/16 v0, -0x19

    const/4 v1, 0x2

    aput-byte v0, v6, v1

    .line 357
    :goto_0
    array-length v0, v6

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {v6, v1, v4, v2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 358
    iget-object v0, p0, Lo/ait;->n:Ljava/lang/String;

    const-string v1, "UTF-8"

    invoke-static {v1}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    array-length v1, v6

    const/4 v2, 0x0

    invoke-static {v0, v2, v4, v1, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 361
    iget-object v0, p0, Lo/ait;->p:Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Long;->toHexString(J)Ljava/lang/String;

    move-result-object v7

    .line 364
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v0

    rem-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_4

    .line 365
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "0"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    .line 367
    :cond_4
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v0

    div-int/lit8 v8, v0, 0x2

    .line 370
    add-int/lit8 v0, v8, 0x2

    new-array v9, v0, [B

    .line 373
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "5"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v8}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    .line 375
    invoke-static {v10}, Lo/ajw;->a(Ljava/lang/String;)[B

    move-result-object v11

    .line 376
    invoke-static {v7}, Lo/ajw;->a(Ljava/lang/String;)[B

    move-result-object v12

    .line 378
    array-length v0, v11

    if-eqz v0, :cond_5

    array-length v0, v12

    if-eqz v0, :cond_5

    .line 379
    array-length v0, v11

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {v11, v1, v9, v2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 380
    array-length v0, v11

    const/4 v1, 0x0

    invoke-static {v12, v1, v9, v0, v8}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 384
    :cond_5
    array-length v0, v9

    add-int/lit8 v0, v0, -0x1

    const/4 v1, -0x1

    aput-byte v1, v9, v0

    .line 387
    const/4 v0, 0x2

    invoke-static {v0}, Lo/ajw;->d(I)[B

    move-result-object v0

    iput-object v0, p0, Lo/ait;->k:[B

    .line 388
    const/4 v0, 0x3

    invoke-static {v0}, Lo/ajw;->d(I)[B

    move-result-object v0

    iput-object v0, p0, Lo/ait;->h:[B

    .line 390
    iget-object v0, p0, Lo/ait;->f:[B

    array-length v0, v0

    iget-object v1, p0, Lo/ait;->k:[B

    array-length v1, v1

    add-int/2addr v0, v1

    iget-object v1, p0, Lo/ait;->h:[B

    array-length v1, v1

    add-int/2addr v0, v1

    iget-object v1, p0, Lo/ait;->m:[B

    array-length v1, v1

    add-int/2addr v0, v1

    iget-object v1, p0, Lo/ait;->l:[B

    array-length v1, v1

    add-int/2addr v0, v1

    array-length v1, v4

    add-int/2addr v0, v1

    array-length v1, v9

    add-int/2addr v0, v1

    array-length v1, p1

    add-int/2addr v0, v1

    new-array v13, v0, [B

    .line 392
    iget-object v0, p0, Lo/ait;->f:[B

    iget-object v1, p0, Lo/ait;->f:[B

    array-length v1, v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v2, v13, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 393
    iget-object v0, p0, Lo/ait;->k:[B

    iget-object v1, p0, Lo/ait;->f:[B

    array-length v1, v1

    iget-object v2, p0, Lo/ait;->k:[B

    array-length v2, v2

    const/4 v3, 0x0

    invoke-static {v0, v3, v13, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 394
    iget-object v0, p0, Lo/ait;->h:[B

    iget-object v1, p0, Lo/ait;->f:[B

    array-length v1, v1

    iget-object v2, p0, Lo/ait;->k:[B

    array-length v2, v2

    add-int/2addr v1, v2

    iget-object v2, p0, Lo/ait;->h:[B

    array-length v2, v2

    const/4 v3, 0x0

    invoke-static {v0, v3, v13, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 395
    iget-object v0, p0, Lo/ait;->m:[B

    iget-object v1, p0, Lo/ait;->f:[B

    array-length v1, v1

    iget-object v2, p0, Lo/ait;->k:[B

    array-length v2, v2

    add-int/2addr v1, v2

    iget-object v2, p0, Lo/ait;->h:[B

    array-length v2, v2

    add-int/2addr v1, v2

    iget-object v2, p0, Lo/ait;->m:[B

    array-length v2, v2

    const/4 v3, 0x0

    invoke-static {v0, v3, v13, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 396
    iget-object v0, p0, Lo/ait;->l:[B

    iget-object v1, p0, Lo/ait;->f:[B

    array-length v1, v1

    iget-object v2, p0, Lo/ait;->k:[B

    array-length v2, v2

    add-int/2addr v1, v2

    iget-object v2, p0, Lo/ait;->h:[B

    array-length v2, v2

    add-int/2addr v1, v2

    iget-object v2, p0, Lo/ait;->m:[B

    array-length v2, v2

    add-int/2addr v1, v2

    iget-object v2, p0, Lo/ait;->l:[B

    array-length v2, v2

    const/4 v3, 0x0

    invoke-static {v0, v3, v13, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 397
    iget-object v0, p0, Lo/ait;->f:[B

    array-length v0, v0

    iget-object v1, p0, Lo/ait;->k:[B

    array-length v1, v1

    add-int/2addr v0, v1

    iget-object v1, p0, Lo/ait;->h:[B

    array-length v1, v1

    add-int/2addr v0, v1

    iget-object v1, p0, Lo/ait;->m:[B

    array-length v1, v1

    add-int/2addr v0, v1

    iget-object v1, p0, Lo/ait;->l:[B

    array-length v1, v1

    add-int/2addr v0, v1

    array-length v1, v4

    const/4 v2, 0x0

    invoke-static {v4, v2, v13, v0, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 398
    iget-object v0, p0, Lo/ait;->f:[B

    array-length v0, v0

    iget-object v1, p0, Lo/ait;->k:[B

    array-length v1, v1

    add-int/2addr v0, v1

    iget-object v1, p0, Lo/ait;->h:[B

    array-length v1, v1

    add-int/2addr v0, v1

    iget-object v1, p0, Lo/ait;->m:[B

    array-length v1, v1

    add-int/2addr v0, v1

    iget-object v1, p0, Lo/ait;->l:[B

    array-length v1, v1

    add-int/2addr v0, v1

    array-length v1, v4

    add-int/2addr v0, v1

    array-length v1, v9

    const/4 v2, 0x0

    invoke-static {v9, v2, v13, v0, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 399
    iget-object v0, p0, Lo/ait;->f:[B

    array-length v0, v0

    iget-object v1, p0, Lo/ait;->k:[B

    array-length v1, v1

    add-int/2addr v0, v1

    iget-object v1, p0, Lo/ait;->h:[B

    array-length v1, v1

    add-int/2addr v0, v1

    iget-object v1, p0, Lo/ait;->m:[B

    array-length v1, v1

    add-int/2addr v0, v1

    iget-object v1, p0, Lo/ait;->l:[B

    array-length v1, v1

    add-int/2addr v0, v1

    array-length v1, v4

    add-int/2addr v0, v1

    array-length v1, v9

    add-int/2addr v0, v1

    array-length v1, p1

    const/4 v2, 0x0

    invoke-static {p1, v2, v13, v0, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 400
    sget-object v0, Lo/ait;->b:Ljava/lang/String;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "macCant = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v13}, Lo/ajw;->d([B)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x1

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 402
    return-object v13
.end method

.method private e(Ljava/lang/String;Ljava/lang/String;)V
    .locals 8

    .line 182
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x10

    if-ne v0, v1, :cond_0

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x10

    if-eq v0, v1, :cond_1

    .line 183
    :cond_0
    sget-object v0, Lo/ait;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "sn1 or sn2 is not right!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 184
    return-void

    .line 188
    :cond_1
    invoke-static {p1}, Lo/ajw;->a(Ljava/lang/String;)[B

    move-result-object v4

    .line 189
    invoke-static {p2}, Lo/ajw;->a(Ljava/lang/String;)[B

    move-result-object v5

    .line 192
    array-length v0, v4

    if-eqz v0, :cond_2

    array-length v0, v5

    if-nez v0, :cond_3

    .line 193
    :cond_2
    sget-object v0, Lo/ait;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "bSn1 or bSn2 is null! "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 194
    return-void

    .line 198
    :cond_3
    array-length v0, v4

    array-length v1, v5

    add-int/2addr v0, v1

    new-array v0, v0, [B

    iput-object v0, p0, Lo/ait;->g:[B

    .line 199
    iget-object v0, p0, Lo/ait;->g:[B

    array-length v1, v4

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v4, v2, v0, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 200
    iget-object v0, p0, Lo/ait;->g:[B

    array-length v1, v4

    array-length v2, v5

    const/4 v3, 0x0

    invoke-static {v5, v3, v0, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 204
    const/4 v0, 0x0

    new-array v6, v0, [B

    .line 206
    :try_start_0
    iget-object v0, p0, Lo/ait;->g:[B

    const/4 v1, 0x1

    const/16 v2, 0x20

    invoke-static {v0, v1, v2}, Lo/ajw;->e([BII)[B
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/security/InvalidKeyException; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v0

    move-object v6, v0

    .line 211
    goto :goto_0

    .line 207
    :catch_0
    move-exception v7

    .line 208
    sget-object v0, Lo/ait;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v7}, Ljava/security/NoSuchAlgorithmException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 211
    goto :goto_0

    .line 209
    :catch_1
    move-exception v7

    .line 210
    sget-object v0, Lo/ait;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v7}, Ljava/security/InvalidKeyException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 214
    :goto_0
    if-eqz v6, :cond_4

    array-length v0, v6

    const/16 v1, 0x20

    if-eq v0, v1, :cond_5

    .line 215
    :cond_4
    sget-object v0, Lo/ait;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "get digest error! "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 216
    return-void

    .line 221
    :cond_5
    iget-object v0, p0, Lo/ait;->a:[B

    iget-object v1, p0, Lo/ait;->a:[B

    array-length v1, v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v6, v2, v0, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 225
    iget-object v0, p0, Lo/ait;->a:[B

    array-length v0, v0

    iget-object v1, p0, Lo/ait;->i:[B

    iget-object v2, p0, Lo/ait;->i:[B

    array-length v2, v2

    const/4 v3, 0x0

    invoke-static {v6, v0, v1, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 227
    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .line 406
    iget-object v0, p0, Lo/ait;->n:Ljava/lang/String;

    return-object v0
.end method

.method public a([B)Lo/air;
    .locals 9

    .line 115
    new-instance v4, Lo/aiy;

    invoke-direct {v4}, Lo/aiy;-><init>()V

    .line 118
    if-eqz p1, :cond_0

    array-length v0, p1

    const/16 v1, 0x20

    if-lt v0, v1, :cond_0

    iget-object v0, p0, Lo/ait;->a:[B

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/ait;->i:[B

    if-nez v0, :cond_1

    .line 119
    :cond_0
    sget-object v0, Lo/ait;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "makeResponseEntity para is not right!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 120
    return-object v4

    .line 123
    :cond_1
    sget-object v0, Lo/ait;->b:Ljava/lang/String;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "makeResponseEntity: "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Lo/ajw;->d([B)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x1

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 128
    :try_start_0
    array-length v0, p1

    add-int/lit8 v6, v0, -0x20

    .line 129
    new-array v7, v6, [B

    .line 132
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {p1, v0, v7, v1, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 133
    iget-object v0, p0, Lo/ait;->a:[B

    iget-object v1, p0, Lo/ait;->i:[B

    invoke-static {v7, v0, v1}, Lo/ajt;->d([B[B[B)Ljava/lang/String;

    move-result-object v5

    .line 135
    sget-object v0, Lo/ait;->b:Ljava/lang/String;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u89e3\u5bc6String: "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v5, v1, v2

    const/4 v2, 0x1

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 138
    invoke-static {v5}, Lo/aiz;->c(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v8

    .line 139
    invoke-interface {v8}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 140
    sget-object v0, Lo/ait;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "jsonMap is isEmpty!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljavax/crypto/NoSuchPaddingException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/security/InvalidAlgorithmParameterException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/security/InvalidKeyException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljavax/crypto/BadPaddingException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljavax/crypto/IllegalBlockSizeException; {:try_start_0 .. :try_end_0} :catch_5
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_6
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_7

    .line 141
    return-object v4

    .line 143
    :cond_2
    :try_start_1
    sget-object v0, Lo/ait;->b:Ljava/lang/String;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "jsonMap "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v8}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x1

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 145
    const-string v0, "errcode"

    invoke-interface {v8, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 146
    const-string v0, "errcode"

    invoke-interface {v8, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    iput v0, v4, Lo/aiy;->d:I

    goto :goto_0

    .line 148
    :cond_3
    sget-object v0, Lo/ait;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ERROR_CODE is null!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljavax/crypto/NoSuchPaddingException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/security/InvalidAlgorithmParameterException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/security/InvalidKeyException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljavax/crypto/BadPaddingException; {:try_start_1 .. :try_end_1} :catch_4
    .catch Ljavax/crypto/IllegalBlockSizeException; {:try_start_1 .. :try_end_1} :catch_5
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_1 .. :try_end_1} :catch_6
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_7

    .line 150
    :goto_0
    return-object v4

    .line 151
    :catch_0
    move-exception v6

    .line 152
    sget-object v0, Lo/ait;->b:Ljava/lang/String;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "makeResponseEntity: "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Ljava/security/NoSuchAlgorithmException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x1

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 153
    return-object v4

    .line 154
    :catch_1
    move-exception v6

    .line 155
    sget-object v0, Lo/ait;->b:Ljava/lang/String;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "makeResponseEntity: "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Ljavax/crypto/NoSuchPaddingException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x1

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 156
    return-object v4

    .line 157
    :catch_2
    move-exception v6

    .line 158
    sget-object v0, Lo/ait;->b:Ljava/lang/String;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "makeResponseEntity: "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Ljava/security/InvalidAlgorithmParameterException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x1

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 159
    return-object v4

    .line 160
    :catch_3
    move-exception v6

    .line 161
    sget-object v0, Lo/ait;->b:Ljava/lang/String;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "makeResponseEntity: "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Ljava/security/InvalidKeyException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x1

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 162
    return-object v4

    .line 163
    :catch_4
    move-exception v6

    .line 164
    sget-object v0, Lo/ait;->b:Ljava/lang/String;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "makeResponseEntity: "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Ljavax/crypto/BadPaddingException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x1

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 165
    return-object v4

    .line 166
    :catch_5
    move-exception v6

    .line 167
    sget-object v0, Lo/ait;->b:Ljava/lang/String;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "makeResponseEntity: "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Ljavax/crypto/IllegalBlockSizeException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x1

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 168
    return-object v4

    .line 169
    :catch_6
    move-exception v6

    .line 170
    sget-object v0, Lo/ait;->b:Ljava/lang/String;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "makeResponseEntity: "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Ljava/io/UnsupportedEncodingException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x1

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 171
    return-object v4

    .line 172
    :catch_7
    move-exception v6

    .line 173
    sget-object v0, Lo/ait;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v6}, Ljava/lang/NumberFormatException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 174
    return-object v4
.end method

.method public b()[B
    .locals 1

    .line 104
    invoke-virtual {p0}, Lo/ait;->e()[B

    move-result-object v0

    return-object v0
.end method

.method public c()Ljava/lang/Long;
    .locals 1

    .line 410
    iget-object v0, p0, Lo/ait;->p:Ljava/lang/Long;

    return-object v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    .line 97
    const-string v0, ""

    return-object v0
.end method

.method public e(Ljava/lang/String;)Lo/air;
    .locals 1

    .line 109
    const/4 v0, 0x0

    return-object v0
.end method

.method public e()[B
    .locals 12

    .line 232
    iget-object v0, p0, Lo/ait;->e:Lo/aiy;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lo/ait;->a:[B

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/ait;->i:[B

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/ait;->g:[B

    if-nez v0, :cond_1

    .line 233
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 237
    :cond_1
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 239
    iget-object v0, p0, Lo/ait;->e:Lo/aiy;

    iget-object v0, v0, Lo/aiy;->b:Ljava/lang/String;

    if-eqz v0, :cond_2

    .line 240
    const-string v0, "code"

    iget-object v1, p0, Lo/ait;->e:Lo/aiy;

    iget-object v1, v1, Lo/aiy;->b:Ljava/lang/String;

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 242
    :cond_2
    iget-object v0, p0, Lo/ait;->e:Lo/aiy;

    iget-object v0, v0, Lo/aiy;->e:Ljava/lang/String;

    if-eqz v0, :cond_3

    .line 243
    const-string v0, "devId"

    iget-object v1, p0, Lo/ait;->e:Lo/aiy;

    iget-object v1, v1, Lo/aiy;->e:Ljava/lang/String;

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 245
    :cond_3
    iget-object v0, p0, Lo/ait;->e:Lo/aiy;

    iget-object v0, v0, Lo/aiy;->c:Ljava/lang/String;

    if-eqz v0, :cond_4

    .line 246
    const-string v0, "psk"

    iget-object v1, p0, Lo/ait;->e:Lo/aiy;

    iget-object v1, v1, Lo/aiy;->c:Ljava/lang/String;

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 248
    :cond_4
    iget-object v0, p0, Lo/ait;->e:Lo/aiy;

    iget-object v0, v0, Lo/aiy;->a:Ljava/lang/String;

    if-eqz v0, :cond_5

    .line 249
    const-string v0, "cloudUrl"

    iget-object v1, p0, Lo/ait;->e:Lo/aiy;

    iget-object v1, v1, Lo/aiy;->a:Ljava/lang/String;

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 251
    :cond_5
    invoke-static {v4}, Lo/aiz;->b(Ljava/util/Map;)Lorg/json/JSONObject;

    move-result-object v5

    .line 252
    invoke-virtual {v5}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v6

    .line 253
    sget-object v0, Lo/ait;->b:Ljava/lang/String;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "data = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v6, v1, v2

    const/4 v2, 0x1

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 257
    :try_start_0
    iget-object v0, p0, Lo/ait;->a:[B

    iget-object v1, p0, Lo/ait;->i:[B

    invoke-static {v6, v0, v1}, Lo/ajt;->c(Ljava/lang/String;[B[B)[B

    move-result-object v7

    .line 258
    if-nez v7, :cond_6

    .line 259
    sget-object v0, Lo/ait;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "encryptResult is null!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljavax/crypto/NoSuchPaddingException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/security/InvalidAlgorithmParameterException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/security/InvalidKeyException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljavax/crypto/BadPaddingException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljavax/crypto/IllegalBlockSizeException; {:try_start_0 .. :try_end_0} :catch_5
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_6

    .line 260
    const/4 v0, 0x0

    return-object v0

    .line 264
    :cond_6
    :try_start_1
    iget-object v0, p0, Lo/ait;->a:[B

    iget-object v1, p0, Lo/ait;->g:[B

    const/4 v2, 0x1

    const/16 v3, 0x20

    invoke-static {v0, v1, v2, v3}, Lo/akb;->a([B[BII)[B

    move-result-object v8

    .line 265
    array-length v0, v8

    if-nez v0, :cond_7

    .line 266
    sget-object v0, Lo/ait;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "digest1 is null!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljavax/crypto/NoSuchPaddingException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/security/InvalidAlgorithmParameterException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/security/InvalidKeyException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljavax/crypto/BadPaddingException; {:try_start_1 .. :try_end_1} :catch_4
    .catch Ljavax/crypto/IllegalBlockSizeException; {:try_start_1 .. :try_end_1} :catch_5
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_1 .. :try_end_1} :catch_6

    .line 267
    const/4 v0, 0x0

    return-object v0

    .line 270
    :cond_7
    :try_start_2
    sget-object v0, Lo/ait;->b:Ljava/lang/String;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "digest1 = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v8}, Lo/ajw;->d([B)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x1

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 273
    invoke-direct {p0, v7}, Lo/ait;->c([B)[B

    move-result-object v9

    .line 274
    if-nez v9, :cond_8

    .line 275
    sget-object v0, Lo/ait;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "macCant is null!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljavax/crypto/NoSuchPaddingException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/security/InvalidAlgorithmParameterException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/security/InvalidKeyException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ljavax/crypto/BadPaddingException; {:try_start_2 .. :try_end_2} :catch_4
    .catch Ljavax/crypto/IllegalBlockSizeException; {:try_start_2 .. :try_end_2} :catch_5
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_2 .. :try_end_2} :catch_6

    .line 276
    const/4 v0, 0x0

    return-object v0

    .line 280
    :cond_8
    :try_start_3
    invoke-static {v8, v9}, Lo/akb;->e([B[B)[B

    move-result-object v10

    .line 281
    if-nez v10, :cond_9

    .line 282
    sget-object v0, Lo/ait;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mac is null!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V
    :try_end_3
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_3 .. :try_end_3} :catch_0
    .catch Ljavax/crypto/NoSuchPaddingException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/security/InvalidAlgorithmParameterException; {:try_start_3 .. :try_end_3} :catch_2
    .catch Ljava/security/InvalidKeyException; {:try_start_3 .. :try_end_3} :catch_3
    .catch Ljavax/crypto/BadPaddingException; {:try_start_3 .. :try_end_3} :catch_4
    .catch Ljavax/crypto/IllegalBlockSizeException; {:try_start_3 .. :try_end_3} :catch_5
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_3 .. :try_end_3} :catch_6

    .line 283
    const/4 v0, 0x0

    return-object v0

    .line 285
    :cond_9
    :try_start_4
    sget-object v0, Lo/ait;->b:Ljava/lang/String;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mac = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v10}, Lo/ajw;->d([B)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x1

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 288
    array-length v0, v7

    array-length v1, v10

    add-int/2addr v0, v1

    new-array v11, v0, [B

    .line 289
    array-length v0, v7

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {v7, v1, v11, v2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 290
    array-length v0, v7

    array-length v1, v10

    const/4 v2, 0x0

    invoke-static {v10, v2, v11, v0, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 292
    sget-object v0, Lo/ait;->b:Ljava/lang/String;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "makeRequestStream: "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v7}, Lo/ajw;->d([B)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {v10}, Lo/ajw;->d([B)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x1

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V
    :try_end_4
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_4 .. :try_end_4} :catch_0
    .catch Ljavax/crypto/NoSuchPaddingException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/security/InvalidAlgorithmParameterException; {:try_start_4 .. :try_end_4} :catch_2
    .catch Ljava/security/InvalidKeyException; {:try_start_4 .. :try_end_4} :catch_3
    .catch Ljavax/crypto/BadPaddingException; {:try_start_4 .. :try_end_4} :catch_4
    .catch Ljavax/crypto/IllegalBlockSizeException; {:try_start_4 .. :try_end_4} :catch_5
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_4 .. :try_end_4} :catch_6

    .line 293
    return-object v11

    .line 294
    :catch_0
    move-exception v7

    .line 295
    sget-object v0, Lo/ait;->b:Ljava/lang/String;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "makeRequestStream: "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v7}, Ljava/security/NoSuchAlgorithmException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x1

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 296
    const/4 v0, 0x0

    return-object v0

    .line 297
    :catch_1
    move-exception v7

    .line 298
    sget-object v0, Lo/ait;->b:Ljava/lang/String;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "makeRequestStream: "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v7}, Ljavax/crypto/NoSuchPaddingException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x1

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 299
    const/4 v0, 0x0

    return-object v0

    .line 300
    :catch_2
    move-exception v7

    .line 301
    sget-object v0, Lo/ait;->b:Ljava/lang/String;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "makeRequestStream: "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v7}, Ljava/security/InvalidAlgorithmParameterException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x1

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 302
    const/4 v0, 0x0

    return-object v0

    .line 303
    :catch_3
    move-exception v7

    .line 304
    sget-object v0, Lo/ait;->b:Ljava/lang/String;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "makeRequestStream: "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v7}, Ljava/security/InvalidKeyException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x1

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 305
    const/4 v0, 0x0

    return-object v0

    .line 306
    :catch_4
    move-exception v7

    .line 307
    sget-object v0, Lo/ait;->b:Ljava/lang/String;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "makeRequestStream: "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v7}, Ljavax/crypto/BadPaddingException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x1

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 308
    const/4 v0, 0x0

    return-object v0

    .line 309
    :catch_5
    move-exception v7

    .line 310
    sget-object v0, Lo/ait;->b:Ljava/lang/String;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "makeRequestStream: "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v7}, Ljavax/crypto/IllegalBlockSizeException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x1

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 311
    const/4 v0, 0x0

    return-object v0

    .line 312
    :catch_6
    move-exception v7

    .line 313
    sget-object v0, Lo/ait;->b:Ljava/lang/String;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "makeRequestStream: "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v7}, Ljava/io/UnsupportedEncodingException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x1

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 314
    const/4 v0, 0x0

    return-object v0
.end method

.method public h()[B
    .locals 2

    .line 428
    iget-object v0, p0, Lo/ait;->k:[B

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lo/ait;->k:[B

    invoke-virtual {v0}, [B->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    :goto_0
    return-object v0
.end method

.method public k()[B
    .locals 2

    .line 419
    iget-object v0, p0, Lo/ait;->h:[B

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lo/ait;->h:[B

    invoke-virtual {v0}, [B->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    :goto_0
    return-object v0
.end method
