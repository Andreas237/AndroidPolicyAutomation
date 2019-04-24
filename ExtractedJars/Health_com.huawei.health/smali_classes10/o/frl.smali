.class public Lo/frl;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/frl$2;
    }
.end annotation


# static fields
.field private static final e:Lo/fty;


# instance fields
.field private a:I

.field private b:J

.field private c:Lo/fqn;

.field private d:Lo/frn;

.field private f:Lo/fqr;

.field private g:Ljava/net/InetSocketAddress;

.field private h:I

.field private i:[B

.field private k:Lo/fqm;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 59
    const-class v0, Lo/frl;

    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/fud;->c(Ljava/lang/String;)Lo/fty;

    move-result-object v0

    sput-object v0, Lo/frl;->e:Lo/fty;

    return-void
.end method

.method private constructor <init>(Lo/fqn;IJ)V
    .locals 2

    .line 198
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 81
    const/4 v0, 0x0

    iput-object v0, p0, Lo/frl;->c:Lo/fqn;

    .line 87
    new-instance v0, Lo/frn;

    invoke-direct {v0}, Lo/frn;-><init>()V

    iput-object v0, p0, Lo/frl;->d:Lo/frn;

    .line 90
    const/4 v0, -0x1

    iput v0, p0, Lo/frl;->a:I

    .line 96
    const/4 v0, 0x0

    iput v0, p0, Lo/frl;->h:I

    .line 103
    const/4 v0, 0x0

    iput-object v0, p0, Lo/frl;->k:Lo/fqm;

    .line 106
    const/4 v0, 0x0

    iput-object v0, p0, Lo/frl;->i:[B

    .line 199
    const-wide v0, 0xffffffffffffL

    cmp-long v0, p3, v0

    if-lez v0, :cond_0

    .line 200
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Sequence number must be 48 bits only"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 202
    :cond_0
    iput-object p1, p0, Lo/frl;->c:Lo/fqn;

    .line 203
    iput p2, p0, Lo/frl;->a:I

    .line 204
    iput-wide p3, p0, Lo/frl;->b:J

    .line 205
    return-void
.end method

.method public constructor <init>(Lo/fqn;IJLo/fqm;Ljava/net/InetSocketAddress;)V
    .locals 3

    .line 188
    invoke-direct {p0, p1, p2, p3, p4}, Lo/frl;-><init>(Lo/fqn;IJ)V

    .line 189
    iput-object p6, p0, Lo/frl;->g:Ljava/net/InetSocketAddress;

    .line 191
    :try_start_0
    invoke-virtual {p0, p5}, Lo/frl;->c(Lo/fqm;)V
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 195
    goto :goto_0

    .line 192
    :catch_0
    move-exception v2

    .line 194
    sget-object v0, Lo/frl;->e:Lo/fty;

    const-string v1, "Unexpected attempt to encrypt outbound record payload"

    invoke-interface {v0, v1, v2}, Lo/fty;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 196
    :goto_0
    return-void
.end method

.method public constructor <init>(Lo/fqn;IJLo/fqm;Lo/fqr;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    .line 161
    invoke-direct {p0, p1, p2, p3, p4}, Lo/frl;-><init>(Lo/fqn;IJ)V

    .line 162
    if-nez p6, :cond_0

    .line 163
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Session must not be null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 165
    :cond_0
    iput-object p5, p0, Lo/frl;->k:Lo/fqm;

    .line 166
    iput-object p6, p0, Lo/frl;->f:Lo/fqr;

    .line 167
    invoke-virtual {p0, p5}, Lo/frl;->c(Lo/fqm;)V

    .line 168
    return-void
.end method

.method constructor <init>(Lo/fqn;Lo/frn;IJ[BLjava/net/InetSocketAddress;)V
    .locals 1

    .line 129
    invoke-direct {p0, p1, p3, p4, p5}, Lo/frl;-><init>(Lo/fqn;IJ)V

    .line 130
    iput-object p2, p0, Lo/frl;->d:Lo/frn;

    .line 131
    array-length v0, p6

    invoke-static {p6, v0}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v0

    iput-object v0, p0, Lo/frl;->i:[B

    .line 132
    array-length v0, p6

    iput v0, p0, Lo/frl;->h:I

    .line 133
    iput-object p7, p0, Lo/frl;->g:Ljava/net/InetSocketAddress;

    .line 134
    return-void
.end method

.method private a(Lo/fqo;)Lo/fqm;
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;,
            Lo/fqx;
        }
    .end annotation

    .line 898
    sget-object v0, Lo/frl;->e:Lo/fty;

    invoke-interface {v0}, Lo/fty;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 899
    sget-object v0, Lo/frl;->e:Lo/fty;

    const-string v1, "Decrypting HANDSHAKE message ciphertext{}{}"

    invoke-static {}, Ljava/lang/System;->lineSeparator()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lo/frl;->i:[B

    invoke-static {v3}, Lo/fsp;->b([B)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v1, v2, v3}, Lo/fty;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 902
    :cond_0
    iget-object v0, p0, Lo/frl;->i:[B

    invoke-direct {p0, v0, p1}, Lo/frl;->b([BLo/fqo;)[B

    move-result-object v4

    .line 904
    sget-object v5, Lo/fsf$a;->c:Lo/fsf$a;

    .line 905
    const/4 v6, 0x0

    .line 906
    iget-object v0, p0, Lo/frl;->f:Lo/fqr;

    if-eqz v0, :cond_1

    .line 907
    iget-object v0, p0, Lo/frl;->f:Lo/fqr;

    invoke-virtual {v0}, Lo/fqr;->m()Lo/fsf$a;

    move-result-object v5

    .line 908
    iget-object v0, p0, Lo/frl;->f:Lo/fqr;

    invoke-virtual {v0}, Lo/fqr;->s()Z

    move-result v6

    goto :goto_0

    .line 910
    :cond_1
    sget-object v0, Lo/frl;->e:Lo/fty;

    const-string v1, "Parsing message without a session"

    invoke-interface {v0, v1}, Lo/fty;->a(Ljava/lang/String;)V

    .line 912
    :goto_0
    sget-object v0, Lo/frl;->e:Lo/fty;

    invoke-interface {v0}, Lo/fty;->c()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 913
    new-instance v7, Ljava/lang/StringBuilder;

    const-string v0, "Parsing HANDSHAKE message plaintext using KeyExchange [{}] and receiveRawPublicKey [{}]"

    invoke-direct {v7, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 915
    const/4 v0, 0x3

    new-array v8, v0, [Ljava/lang/Object;

    const/4 v0, 0x0

    aput-object v5, v8, v0

    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v8, v1

    const/4 v0, 0x0

    const/4 v1, 0x2

    aput-object v0, v8, v1

    .line 916
    sget-object v0, Lo/frl;->e:Lo/fty;

    invoke-interface {v0}, Lo/fty;->b()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 917
    const-string v0, ":"

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {}, Ljava/lang/System;->lineSeparator()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v4}, Lo/fsp;->b([B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 919
    :cond_2
    sget-object v0, Lo/frl;->e:Lo/fty;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, v8}, Lo/fty;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 921
    :cond_3
    invoke-virtual {p0}, Lo/frl;->k()Ljava/net/InetSocketAddress;

    move-result-object v0

    invoke-static {v4, v5, v6, v0}, Lo/fqy;->b([BLo/fsf$a;ZLjava/net/InetSocketAddress;)Lo/fqy;

    move-result-object v0

    return-object v0
.end method

.method private a(Lo/fqo;[B)[B
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    .line 539
    invoke-virtual {p1}, Lo/fqo;->e()Lo/fsf;

    move-result-object v0

    invoke-virtual {v0}, Lo/fsf;->k()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljavax/crypto/Mac;->getInstance(Ljava/lang/String;)Ljavax/crypto/Mac;

    move-result-object v1

    .line 540
    invoke-virtual {p1}, Lo/fqo;->i()Ljavax/crypto/SecretKey;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljavax/crypto/Mac;->init(Ljava/security/Key;)V

    .line 542
    new-instance v2, Lo/fpp;

    invoke-direct {v2}, Lo/fpp;-><init>()V

    .line 543
    array-length v0, p2

    invoke-direct {p0, v0}, Lo/frl;->e(I)[B

    move-result-object v0

    invoke-virtual {v2, v0}, Lo/fpp;->e([B)V

    .line 544
    invoke-virtual {v2, p2}, Lo/fpp;->e([B)V

    .line 545
    invoke-virtual {v2}, Lo/fpp;->e()[B

    move-result-object v0

    invoke-virtual {v1, v0}, Ljavax/crypto/Mac;->doFinal([B)[B

    move-result-object v0

    return-object v0
.end method

.method public static b([BLjava/net/InetSocketAddress;)Ljava/util/List;
    .locals 20
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([BLjava/net/InetSocketAddress;)Ljava/util/List<Lo/frl;>;"
        }
    .end annotation

    .line 246
    if-nez p0, :cond_0

    .line 247
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Byte array must not be null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 248
    :cond_0
    if-nez p1, :cond_1

    .line 249
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Peer address must not be null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 252
    :cond_1
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 254
    new-instance v9, Lo/fpq;

    move-object/from16 v0, p0

    invoke-direct {v9, v0}, Lo/fpq;-><init>([B)V

    .line 256
    :goto_0
    invoke-virtual {v9}, Lo/fpq;->b()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 258
    invoke-virtual {v9}, Lo/fpq;->d()I

    move-result v0

    const/16 v1, 0x68

    if-ge v0, v1, :cond_2

    .line 259
    sget-object v0, Lo/frl;->e:Lo/fty;

    const-string v1, "Received truncated DTLS record(s). Discarding ..."

    invoke-interface {v0, v1}, Lo/fty;->a(Ljava/lang/String;)V

    .line 260
    return-object v8

    .line 263
    :cond_2
    const/16 v0, 0x8

    invoke-virtual {v9, v0}, Lo/fpq;->c(I)I

    move-result v10

    .line 264
    const/16 v0, 0x8

    invoke-virtual {v9, v0}, Lo/fpq;->c(I)I

    move-result v11

    .line 265
    const/16 v0, 0x8

    invoke-virtual {v9, v0}, Lo/fpq;->c(I)I

    move-result v12

    .line 266
    new-instance v13, Lo/frn;

    invoke-direct {v13, v11, v12}, Lo/frn;-><init>(II)V

    .line 268
    const/16 v0, 0x10

    invoke-virtual {v9, v0}, Lo/fpq;->c(I)I

    move-result v14

    .line 269
    const/16 v0, 0x30

    invoke-virtual {v9, v0}, Lo/fpq;->e(I)J

    move-result-wide v15

    .line 271
    const/16 v0, 0x10

    invoke-virtual {v9, v0}, Lo/fpq;->c(I)I

    move-result v17

    .line 273
    invoke-virtual {v9}, Lo/fpq;->d()I

    move-result v0

    move/from16 v1, v17

    if-ge v0, v1, :cond_3

    .line 274
    sget-object v0, Lo/frl;->e:Lo/fty;

    const-string v1, "Received truncated DTLS record(s). Discarding ..."

    invoke-interface {v0, v1}, Lo/fty;->a(Ljava/lang/String;)V

    .line 275
    return-object v8

    .line 279
    :cond_3
    move/from16 v0, v17

    invoke-virtual {v9, v0}, Lo/fpq;->d(I)[B

    move-result-object v18

    .line 281
    invoke-static {v10}, Lo/fqn;->b(I)Lo/fqn;

    move-result-object v19

    .line 282
    if-nez v19, :cond_4

    .line 283
    sget-object v0, Lo/frl;->e:Lo/fty;

    const-string v1, "Received DTLS record of unsupported type [{}]. Discarding ..."

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lo/fty;->b(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_1

    .line 285
    :cond_4
    new-instance v0, Lo/frl;

    move-object/from16 v1, v19

    move-object v2, v13

    move v3, v14

    move-wide v4, v15

    move-object/from16 v6, v18

    move-object/from16 v7, p1

    invoke-direct/range {v0 .. v7}, Lo/frl;-><init>(Lo/fqn;Lo/frn;IJ[BLjava/net/InetSocketAddress;)V

    invoke-interface {v8, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 287
    :goto_1
    goto/16 :goto_0

    .line 289
    :cond_5
    return-object v8
.end method

.method private b([B)[B
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    .line 305
    iget-object v0, p0, Lo/frl;->f:Lo/fqr;

    if-nez v0, :cond_0

    .line 306
    return-object p1

    .line 309
    :cond_0
    move-object v4, p1

    .line 311
    iget-object v0, p0, Lo/frl;->f:Lo/fqr;

    invoke-virtual {v0}, Lo/fqr;->k()Lo/fqo;

    move-result-object v0

    invoke-virtual {v0}, Lo/fqo;->e()Lo/fsf;

    move-result-object v5

    .line 312
    sget-object v0, Lo/frl;->e:Lo/fty;

    const-string v1, "Encrypting record fragment using current write state{}{}"

    invoke-static {}, Ljava/lang/System;->lineSeparator()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lo/frl;->f:Lo/fqr;

    invoke-virtual {v3}, Lo/fqr;->k()Lo/fqo;

    move-result-object v3

    invoke-interface {v0, v1, v2, v3}, Lo/fty;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 314
    sget-object v0, Lo/frl$2;->d:[I

    invoke-virtual {v5}, Lo/fsf;->m()Lo/fsf$b;

    move-result-object v1

    invoke-virtual {v1}, Lo/fsf$b;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 317
    :pswitch_0
    goto :goto_0

    .line 320
    :pswitch_1
    invoke-virtual {p0, p1}, Lo/frl;->e([B)[B

    move-result-object v4

    .line 321
    goto :goto_0

    .line 324
    :pswitch_2
    invoke-virtual {p0, p1}, Lo/frl;->d([B)[B

    move-result-object v4

    .line 325
    nop

    .line 331
    .line 337
    :goto_0
    :pswitch_3
    return-object v4

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method private b([BLo/fqo;)[B
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    .line 354
    if-nez p2, :cond_0

    .line 355
    return-object p1

    .line 358
    :cond_0
    move-object v3, p1

    .line 360
    invoke-virtual {p2}, Lo/fqo;->e()Lo/fsf;

    move-result-object v4

    .line 361
    sget-object v0, Lo/frl;->e:Lo/fty;

    const-string v1, "Decrypting record fragment using current read state{}{}"

    invoke-static {}, Ljava/lang/System;->lineSeparator()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2, p2}, Lo/fty;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 363
    sget-object v0, Lo/frl$2;->d:[I

    invoke-virtual {v4}, Lo/fsf;->m()Lo/fsf$b;

    move-result-object v1

    invoke-virtual {v1}, Lo/fsf$b;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 366
    :pswitch_0
    goto :goto_0

    .line 369
    :pswitch_1
    invoke-virtual {p0, p1, p2}, Lo/frl;->a([BLo/fqo;)[B

    move-result-object v3

    .line 370
    goto :goto_0

    .line 373
    :pswitch_2
    invoke-virtual {p0, p1, p2}, Lo/frl;->c([BLo/fqo;)[B

    move-result-object v3

    .line 374
    nop

    .line 380
    .line 386
    :goto_0
    :pswitch_3
    return-object v3

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method private b([B[B)[B
    .locals 2

    .line 646
    new-instance v1, Lo/fpp;

    invoke-direct {v1}, Lo/fpp;-><init>()V

    .line 648
    invoke-virtual {v1, p1}, Lo/fpp;->e([B)V

    .line 649
    invoke-virtual {v1, p2}, Lo/fpp;->e([B)V

    .line 651
    invoke-virtual {v1}, Lo/fpp;->e()[B

    move-result-object v0

    return-object v0
.end method

.method private c(Lo/fqo;)Lo/fqm;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;,
            Lo/fqx;
        }
    .end annotation

    .line 888
    iget-object v0, p0, Lo/frl;->i:[B

    invoke-direct {p0, v0, p1}, Lo/frl;->b([BLo/fqo;)[B

    move-result-object v1

    .line 889
    invoke-virtual {p0}, Lo/frl;->k()Ljava/net/InetSocketAddress;

    move-result-object v0

    invoke-static {v1, v0}, Lo/fqg;->e([BLjava/net/InetSocketAddress;)Lo/fqm;

    move-result-object v0

    return-object v0
.end method

.method private c([B)[B
    .locals 1

    .line 642
    invoke-direct {p0}, Lo/frl;->g()[B

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lo/frl;->b([B[B)[B

    move-result-object v0

    return-object v0
.end method

.method private d(Lo/fqo;)Lo/fqm;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    .line 880
    iget-object v0, p0, Lo/frl;->i:[B

    invoke-direct {p0, v0, p1}, Lo/frl;->b([BLo/fqo;)[B

    move-result-object v1

    .line 881
    invoke-virtual {p0}, Lo/frl;->k()Ljava/net/InetSocketAddress;

    move-result-object v0

    invoke-static {v1, v0}, Lo/fqa;->d([BLjava/net/InetSocketAddress;)Lo/fqm;

    move-result-object v0

    return-object v0
.end method

.method private e(Lo/fqo;)Lo/fqm;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;,
            Lo/fqx;
        }
    .end annotation

    .line 871
    iget-object v0, p0, Lo/frl;->i:[B

    invoke-direct {p0, v0, p1}, Lo/frl;->b([BLo/fqo;)[B

    move-result-object v1

    .line 872
    invoke-virtual {p0}, Lo/frl;->k()Ljava/net/InetSocketAddress;

    move-result-object v0

    invoke-static {v1, v0}, Lo/fqb;->b([BLjava/net/InetSocketAddress;)Lo/fqb;

    move-result-object v0

    return-object v0
.end method

.method private e(I)[B
    .locals 4

    .line 689
    new-instance v3, Lo/fpp;

    invoke-direct {v3}, Lo/fpp;-><init>()V

    .line 691
    iget v0, p0, Lo/frl;->a:I

    const/16 v1, 0x10

    invoke-virtual {v3, v0, v1}, Lo/fpp;->c(II)V

    .line 692
    iget-wide v0, p0, Lo/frl;->b:J

    const/16 v2, 0x30

    invoke-virtual {v3, v0, v1, v2}, Lo/fpp;->b(JI)V

    .line 694
    iget-object v0, p0, Lo/frl;->c:Lo/fqn;

    invoke-virtual {v0}, Lo/fqn;->c()I

    move-result v0

    const/16 v1, 0x8

    invoke-virtual {v3, v0, v1}, Lo/fpp;->c(II)V

    .line 696
    iget-object v0, p0, Lo/frl;->d:Lo/frn;

    invoke-virtual {v0}, Lo/frn;->a()I

    move-result v0

    const/16 v1, 0x8

    invoke-virtual {v3, v0, v1}, Lo/fpp;->c(II)V

    .line 697
    iget-object v0, p0, Lo/frl;->d:Lo/frn;

    invoke-virtual {v0}, Lo/frn;->b()I

    move-result v0

    const/16 v1, 0x8

    invoke-virtual {v3, v0, v1}, Lo/fpp;->c(II)V

    .line 699
    const/16 v0, 0x10

    invoke-virtual {v3, p1, v0}, Lo/fpp;->c(II)V

    .line 701
    invoke-virtual {v3}, Lo/fpp;->e()[B

    move-result-object v0

    return-object v0
.end method

.method private g()[B
    .locals 4

    .line 667
    new-instance v3, Lo/fpp;

    invoke-direct {v3}, Lo/fpp;-><init>()V

    .line 669
    iget v0, p0, Lo/frl;->a:I

    const/16 v1, 0x10

    invoke-virtual {v3, v0, v1}, Lo/fpp;->c(II)V

    .line 670
    iget-wide v0, p0, Lo/frl;->b:J

    const/16 v2, 0x30

    invoke-virtual {v3, v0, v1, v2}, Lo/fpp;->b(JI)V

    .line 672
    invoke-virtual {v3}, Lo/fpp;->e()[B

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public declared-synchronized a(Lo/fqr;)V
    .locals 1

    monitor-enter p0

    .line 776
    :try_start_0
    iput-object p1, p0, Lo/frl;->f:Lo/fqr;

    .line 777
    if-eqz p1, :cond_0

    .line 778
    const/4 v0, 0x0

    iput-object v0, p0, Lo/frl;->g:Ljava/net/InetSocketAddress;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 780
    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public a()Z
    .locals 3

    .line 716
    iget v0, p0, Lo/frl;->a:I

    const/4 v1, 0x0

    if-lt v1, v0, :cond_0

    iget-object v0, p0, Lo/frl;->c:Lo/fqn;

    sget-object v1, Lo/fqn;->a:Lo/fqn;

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lo/frl;->i:[B

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lo/frl;->i:[B

    array-length v0, v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 717
    :cond_0
    const/4 v0, 0x0

    return v0

    .line 719
    :cond_1
    iget-object v0, p0, Lo/frl;->i:[B

    const/4 v1, 0x0

    aget-byte v0, v0, v1

    invoke-static {v0}, Lo/fra;->d(I)Lo/fra;

    move-result-object v2

    .line 720
    sget-object v0, Lo/fra;->c:Lo/fra;

    if-ne v2, v0, :cond_2

    const/4 v0, 0x1

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method protected a([BLo/fqo;)[B
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    .line 586
    if-nez p2, :cond_0

    .line 587
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Current read state must not be null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 588
    :cond_0
    if-nez p1, :cond_1

    .line 589
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Ciphertext must not be null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 592
    :cond_1
    invoke-virtual {p2}, Lo/fqo;->d()Ljavax/crypto/spec/IvParameterSpec;

    move-result-object v0

    invoke-virtual {v0}, Ljavax/crypto/spec/IvParameterSpec;->getIV()[B

    move-result-object v2

    .line 594
    invoke-virtual {p2}, Lo/fqo;->c()Ljavax/crypto/SecretKey;

    move-result-object v0

    invoke-interface {v0}, Ljavax/crypto/SecretKey;->getEncoded()[B

    move-result-object v3

    .line 603
    array-length v0, p1

    add-int/lit8 v0, v0, -0x10

    invoke-direct {p0, v0}, Lo/frl;->e(I)[B

    move-result-object v4

    .line 605
    new-instance v5, Lo/fpq;

    invoke-direct {v5, p1}, Lo/fpq;-><init>([B)V

    .line 608
    invoke-direct {p0}, Lo/frl;->g()[B

    move-result-object v6

    .line 610
    const/16 v0, 0x8

    invoke-virtual {v5, v0}, Lo/fpq;->d(I)[B

    move-result-object v7

    .line 611
    sget-object v0, Lo/frl;->e:Lo/fty;

    invoke-interface {v0}, Lo/fty;->c()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {v6, v7}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v0

    if-nez v0, :cond_2

    .line 612
    new-instance v8, Ljava/lang/StringBuilder;

    const-string v0, "The explicit nonce used by the sender does not match the values provided in the DTLS record"

    invoke-direct {v8, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 613
    invoke-static {}, Ljava/lang/System;->lineSeparator()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "Used    : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v7}, Lo/fsp;->b([B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 614
    invoke-static {}, Ljava/lang/System;->lineSeparator()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "Expected: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v6}, Lo/fsp;->b([B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 615
    sget-object v0, Lo/frl;->e:Lo/fty;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lo/fty;->a(Ljava/lang/String;)V

    .line 618
    :cond_2
    invoke-direct {p0, v2, v7}, Lo/frl;->b([B[B)[B

    move-result-object v8

    .line 619
    invoke-virtual {v5}, Lo/fpq;->c()[B

    move-result-object v0

    const/16 v1, 0x8

    invoke-static {v3, v8, v4, v0, v1}, Lo/fsh;->d([B[B[B[BI)[B

    move-result-object v0

    return-object v0
.end method

.method public b()I
    .locals 1

    .line 732
    iget v0, p0, Lo/frl;->a:I

    return v0
.end method

.method public b(Lo/fqo;)Lo/fqm;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;,
            Lo/fqx;
        }
    .end annotation

    .line 840
    iget-object v0, p0, Lo/frl;->k:Lo/fqm;

    if-nez v0, :cond_0

    .line 842
    sget-object v0, Lo/frl$2;->c:[I

    iget-object v1, p0, Lo/frl;->c:Lo/fqn;

    invoke-virtual {v1}, Lo/fqn;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 844
    :pswitch_0
    invoke-direct {p0, p1}, Lo/frl;->e(Lo/fqo;)Lo/fqm;

    move-result-object v0

    iput-object v0, p0, Lo/frl;->k:Lo/fqm;

    .line 845
    goto :goto_1

    .line 848
    :pswitch_1
    invoke-direct {p0, p1}, Lo/frl;->d(Lo/fqo;)Lo/fqm;

    move-result-object v0

    iput-object v0, p0, Lo/frl;->k:Lo/fqm;

    .line 849
    goto :goto_1

    .line 852
    :pswitch_2
    invoke-direct {p0, p1}, Lo/frl;->c(Lo/fqo;)Lo/fqm;

    move-result-object v0

    iput-object v0, p0, Lo/frl;->k:Lo/fqm;

    .line 853
    goto :goto_1

    .line 856
    :pswitch_3
    invoke-direct {p0, p1}, Lo/frl;->a(Lo/fqo;)Lo/fqm;

    move-result-object v0

    iput-object v0, p0, Lo/frl;->k:Lo/fqm;

    .line 857
    goto :goto_1

    .line 860
    :goto_0
    sget-object v0, Lo/frl;->e:Lo/fty;

    const-string v1, "Cannot decrypt message of unsupported type [{}]"

    iget-object v2, p0, Lo/frl;->c:Lo/fqn;

    invoke-interface {v0, v1, v2}, Lo/fty;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 864
    :cond_0
    :goto_1
    iget-object v0, p0, Lo/frl;->k:Lo/fqm;

    return-object v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method public c()Lo/fqn;
    .locals 1

    .line 724
    iget-object v0, p0, Lo/frl;->c:Lo/fqn;

    return-object v0
.end method

.method public declared-synchronized c(Lo/fqm;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    monitor-enter p0

    .line 935
    :try_start_0
    iget-object v0, p0, Lo/frl;->i:[B

    if-nez v0, :cond_0

    .line 938
    invoke-interface {p1}, Lo/fqm;->a()[B

    move-result-object v3

    .line 941
    array-length v0, v3

    iput v0, p0, Lo/frl;->h:I

    .line 943
    sget-object v0, Lo/frl$2;->c:[I

    iget-object v1, p0, Lo/frl;->c:Lo/fqn;

    invoke-virtual {v1}, Lo/fqn;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 948
    :pswitch_0
    invoke-direct {p0, v3}, Lo/frl;->b([B)[B

    move-result-object v3

    .line 949
    goto :goto_1

    .line 952
    :goto_0
    sget-object v0, Lo/frl;->e:Lo/fty;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unknown content type: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lo/frl;->c:Lo/fqn;

    invoke-virtual {v2}, Lo/fqn;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lo/fty;->d(Ljava/lang/String;)V

    .line 955
    :goto_1
    iput-object v3, p0, Lo/frl;->i:[B

    .line 958
    :cond_0
    iput-object p1, p0, Lo/frl;->k:Lo/fqm;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 959
    monitor-exit p0

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method protected final c([BLo/fqo;)[B
    .locals 12
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    .line 490
    if-nez p2, :cond_0

    .line 491
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Current read state must not be null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 492
    :cond_0
    if-nez p1, :cond_1

    .line 493
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Ciphertext must not be null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 499
    :cond_1
    new-instance v3, Lo/fpq;

    invoke-direct {v3, p1}, Lo/fpq;-><init>([B)V

    .line 500
    invoke-virtual {p2}, Lo/fqo;->h()I

    move-result v0

    invoke-virtual {v3, v0}, Lo/fpq;->d(I)[B

    move-result-object v4

    .line 502
    invoke-virtual {p2}, Lo/fqo;->e()Lo/fsf;

    move-result-object v0

    invoke-virtual {v0}, Lo/fsf;->d()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    move-result-object v5

    .line 503
    invoke-virtual {p2}, Lo/fqo;->c()Ljavax/crypto/SecretKey;

    move-result-object v0

    new-instance v1, Ljavax/crypto/spec/IvParameterSpec;

    invoke-direct {v1, v4}, Ljavax/crypto/spec/IvParameterSpec;-><init>([B)V

    const/4 v2, 0x2

    invoke-virtual {v5, v2, v0, v1}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V

    .line 506
    invoke-virtual {v3}, Lo/fpq;->c()[B

    move-result-object v0

    invoke-virtual {v5, v0}, Ljavax/crypto/Cipher;->doFinal([B)[B

    move-result-object v6

    .line 508
    array-length v0, v6

    add-int/lit8 v0, v0, -0x1

    aget-byte v7, v6, v0

    .line 509
    array-length v0, v6

    add-int/lit8 v0, v0, -0x1

    sub-int/2addr v0, v7

    invoke-virtual {p2}, Lo/fqo;->e()Lo/fsf;

    move-result-object v1

    invoke-virtual {v1}, Lo/fsf;->i()I

    move-result v1

    sub-int v8, v0, v1

    .line 514
    new-instance v3, Lo/fpq;

    invoke-direct {v3, v6}, Lo/fpq;-><init>([B)V

    .line 515
    invoke-virtual {v3, v8}, Lo/fpq;->d(I)[B

    move-result-object v9

    .line 516
    invoke-virtual {p2}, Lo/fqo;->e()Lo/fsf;

    move-result-object v0

    invoke-virtual {v0}, Lo/fsf;->i()I

    move-result v0

    invoke-virtual {v3, v0}, Lo/fpq;->d(I)[B

    move-result-object v10

    .line 517
    invoke-direct {p0, p2, v9}, Lo/frl;->a(Lo/fqo;[B)[B

    move-result-object v11

    .line 518
    invoke-static {v10, v11}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 519
    return-object v9

    .line 521
    :cond_2
    new-instance v0, Lo/fsl;

    invoke-direct {v0, v11, v10}, Lo/fsl;-><init>([B[B)V

    throw v0
.end method

.method public declared-synchronized d()[B
    .locals 4

    monitor-enter p0

    .line 215
    :try_start_0
    new-instance v3, Lo/fpp;

    invoke-direct {v3}, Lo/fpp;-><init>()V

    .line 217
    iget-object v0, p0, Lo/frl;->c:Lo/fqn;

    invoke-virtual {v0}, Lo/fqn;->c()I

    move-result v0

    const/16 v1, 0x8

    invoke-virtual {v3, v0, v1}, Lo/fpp;->c(II)V

    .line 219
    iget-object v0, p0, Lo/frl;->d:Lo/frn;

    invoke-virtual {v0}, Lo/frn;->a()I

    move-result v0

    const/16 v1, 0x8

    invoke-virtual {v3, v0, v1}, Lo/fpp;->c(II)V

    .line 220
    iget-object v0, p0, Lo/frl;->d:Lo/frn;

    invoke-virtual {v0}, Lo/frn;->b()I

    move-result v0

    const/16 v1, 0x8

    invoke-virtual {v3, v0, v1}, Lo/fpp;->c(II)V

    .line 222
    iget v0, p0, Lo/frl;->a:I

    const/16 v1, 0x10

    invoke-virtual {v3, v0, v1}, Lo/fpp;->c(II)V

    .line 223
    iget-wide v0, p0, Lo/frl;->b:J

    const/16 v2, 0x30

    invoke-virtual {v3, v0, v1, v2}, Lo/fpp;->b(JI)V

    .line 225
    iget-object v0, p0, Lo/frl;->i:[B

    array-length v0, v0

    iput v0, p0, Lo/frl;->h:I

    .line 226
    iget v0, p0, Lo/frl;->h:I

    const/16 v1, 0x10

    invoke-virtual {v3, v0, v1}, Lo/fpp;->c(II)V

    .line 228
    iget-object v0, p0, Lo/frl;->i:[B

    invoke-virtual {v3, v0}, Lo/fpp;->e([B)V

    .line 230
    invoke-virtual {v3}, Lo/fpp;->e()[B
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v3

    monitor-exit p0

    throw v3
.end method

.method protected final d([B)[B
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    .line 419
    iget-object v0, p0, Lo/frl;->f:Lo/fqr;

    if-nez v0, :cond_0

    .line 420
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "DTLS session must be set on record"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 421
    :cond_0
    if-nez p1, :cond_1

    .line 422
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Compressed fragment must not be null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 429
    :cond_1
    new-instance v2, Lo/fpp;

    invoke-direct {v2}, Lo/fpp;-><init>()V

    .line 430
    invoke-virtual {v2, p1}, Lo/fpp;->e([B)V

    .line 433
    iget-object v0, p0, Lo/frl;->f:Lo/fqr;

    invoke-virtual {v0}, Lo/fqr;->k()Lo/fqo;

    move-result-object v0

    invoke-direct {p0, v0, p1}, Lo/frl;->a(Lo/fqo;[B)[B

    move-result-object v0

    invoke-virtual {v2, v0}, Lo/fpp;->e([B)V

    .line 436
    array-length v0, p1

    iget-object v1, p0, Lo/frl;->f:Lo/fqr;

    invoke-virtual {v1}, Lo/fqr;->k()Lo/fqo;

    move-result-object v1

    invoke-virtual {v1}, Lo/fqo;->e()Lo/fsf;

    move-result-object v1

    invoke-virtual {v1}, Lo/fsf;->i()I

    move-result v1

    add-int/2addr v0, v1

    add-int/lit8 v3, v0, 0x1

    .line 437
    iget-object v0, p0, Lo/frl;->f:Lo/fqr;

    invoke-virtual {v0}, Lo/fqr;->k()Lo/fqo;

    move-result-object v0

    invoke-virtual {v0}, Lo/fqo;->h()I

    move-result v4

    .line 438
    :goto_0
    if-gt v4, v3, :cond_2

    .line 439
    iget-object v0, p0, Lo/frl;->f:Lo/fqr;

    invoke-virtual {v0}, Lo/fqr;->k()Lo/fqo;

    move-result-object v0

    invoke-virtual {v0}, Lo/fqo;->h()I

    move-result v0

    add-int/2addr v4, v0

    goto :goto_0

    .line 441
    :cond_2
    rem-int v5, v4, v3

    .line 444
    add-int/lit8 v0, v5, 0x1

    new-array v6, v0, [B

    .line 445
    int-to-byte v0, v5

    invoke-static {v6, v0}, Ljava/util/Arrays;->fill([BB)V

    .line 446
    invoke-virtual {v2, v6}, Lo/fpp;->e([B)V

    .line 449
    iget-object v0, p0, Lo/frl;->f:Lo/fqr;

    invoke-virtual {v0}, Lo/fqr;->k()Lo/fqo;

    move-result-object v0

    invoke-virtual {v0}, Lo/fqo;->e()Lo/fsf;

    move-result-object v0

    invoke-virtual {v0}, Lo/fsf;->d()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    move-result-object v7

    .line 450
    iget-object v0, p0, Lo/frl;->f:Lo/fqr;

    invoke-virtual {v0}, Lo/fqr;->k()Lo/fqo;

    move-result-object v0

    invoke-virtual {v0}, Lo/fqo;->c()Ljavax/crypto/SecretKey;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v7, v1, v0}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;)V

    .line 454
    new-instance v8, Lo/fpp;

    invoke-direct {v8}, Lo/fpp;-><init>()V

    .line 455
    invoke-virtual {v7}, Ljavax/crypto/Cipher;->getIV()[B

    move-result-object v0

    invoke-virtual {v8, v0}, Lo/fpp;->e([B)V

    .line 456
    invoke-virtual {v2}, Lo/fpp;->e()[B

    move-result-object v0

    invoke-virtual {v7, v0}, Ljavax/crypto/Cipher;->doFinal([B)[B

    move-result-object v0

    invoke-virtual {v8, v0}, Lo/fpp;->e([B)V

    .line 457
    invoke-virtual {v8}, Lo/fpp;->e()[B

    move-result-object v0

    return-object v0
.end method

.method public e()J
    .locals 2

    .line 736
    iget-wide v0, p0, Lo/frl;->b:J

    return-wide v0
.end method

.method public declared-synchronized e(J)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    monitor-enter p0

    .line 753
    const-wide v0, 0xffffffffffffL

    cmp-long v0, p1, v0

    if-lez v0, :cond_0

    .line 754
    :try_start_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Sequence number must have max 48 bits"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 756
    :cond_0
    iput-wide p1, p0, Lo/frl;->b:J

    .line 757
    iget-object v0, p0, Lo/frl;->f:Lo/fqr;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lo/frl;->f:Lo/fqr;

    invoke-virtual {v0}, Lo/fqr;->k()Lo/fqo;

    move-result-object v0

    if-eqz v0, :cond_1

    iget v0, p0, Lo/frl;->a:I

    if-lez v0, :cond_1

    .line 758
    iget-object v0, p0, Lo/frl;->k:Lo/fqm;

    invoke-interface {v0}, Lo/fqm;->a()[B

    move-result-object v0

    invoke-direct {p0, v0}, Lo/frl;->b([B)[B

    move-result-object v0

    iput-object v0, p0, Lo/frl;->i:[B
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 760
    :cond_1
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method protected e([B)[B
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    .line 556
    iget-object v0, p0, Lo/frl;->f:Lo/fqr;

    invoke-virtual {v0}, Lo/fqr;->k()Lo/fqo;

    move-result-object v0

    invoke-virtual {v0}, Lo/fqo;->d()Ljavax/crypto/spec/IvParameterSpec;

    move-result-object v0

    invoke-virtual {v0}, Ljavax/crypto/spec/IvParameterSpec;->getIV()[B

    move-result-object v1

    .line 557
    invoke-direct {p0, v1}, Lo/frl;->c([B)[B

    move-result-object v2

    .line 558
    iget-object v0, p0, Lo/frl;->f:Lo/fqr;

    invoke-virtual {v0}, Lo/fqr;->k()Lo/fqo;

    move-result-object v0

    invoke-virtual {v0}, Lo/fqo;->c()Ljavax/crypto/SecretKey;

    move-result-object v0

    invoke-interface {v0}, Ljavax/crypto/SecretKey;->getEncoded()[B

    move-result-object v3

    .line 559
    array-length v0, p1

    invoke-direct {p0, v0}, Lo/frl;->e(I)[B

    move-result-object v4

    .line 561
    const/16 v0, 0x8

    invoke-static {v3, v2, v4, p1, v0}, Lo/fsh;->b([B[B[B[BI)[B

    move-result-object v5

    .line 568
    invoke-direct {p0}, Lo/frl;->g()[B

    move-result-object v6

    .line 569
    invoke-static {v6, v5}, Lo/fsp;->c([B[B)[B

    move-result-object v5

    .line 571
    return-object v5
.end method

.method public h()Lo/fqm;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;,
            Lo/fqx;
        }
    .end annotation

    .line 816
    iget-object v0, p0, Lo/frl;->f:Lo/fqr;

    if-eqz v0, :cond_0

    .line 817
    iget-object v0, p0, Lo/frl;->f:Lo/fqr;

    invoke-virtual {v0}, Lo/fqr;->f()Lo/fqo;

    move-result-object v0

    invoke-virtual {p0, v0}, Lo/frl;->b(Lo/fqo;)Lo/fqm;

    move-result-object v0

    return-object v0

    .line 819
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/frl;->b(Lo/fqo;)Lo/fqm;

    move-result-object v0

    return-object v0
.end method

.method public k()Ljava/net/InetSocketAddress;
    .locals 2

    .line 783
    iget-object v0, p0, Lo/frl;->f:Lo/fqr;

    if-eqz v0, :cond_0

    .line 784
    iget-object v0, p0, Lo/frl;->f:Lo/fqr;

    invoke-virtual {v0}, Lo/fqr;->t()Ljava/net/InetSocketAddress;

    move-result-object v0

    return-object v0

    .line 785
    :cond_0
    iget-object v0, p0, Lo/frl;->g:Ljava/net/InetSocketAddress;

    if-eqz v0, :cond_1

    .line 786
    iget-object v0, p0, Lo/frl;->g:Ljava/net/InetSocketAddress;

    return-object v0

    .line 788
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Record does not have a peer address"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .line 963
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 964
    const-string v0, "==[ DTLS Record ]=============================================="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 965
    invoke-static {}, Ljava/lang/System;->lineSeparator()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "Content Type: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/frl;->c:Lo/fqn;

    invoke-virtual {v1}, Lo/fqn;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 966
    invoke-static {}, Ljava/lang/System;->lineSeparator()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "Peer address: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lo/frl;->k()Ljava/net/InetSocketAddress;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 967
    invoke-static {}, Ljava/lang/System;->lineSeparator()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "Version: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/frl;->d:Lo/frn;

    invoke-virtual {v1}, Lo/frn;->a()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/frl;->d:Lo/frn;

    invoke-virtual {v1}, Lo/frn;->b()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 968
    invoke-static {}, Ljava/lang/System;->lineSeparator()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "Epoch: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/frl;->a:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 969
    invoke-static {}, Ljava/lang/System;->lineSeparator()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "Sequence Number: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lo/frl;->b:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 970
    invoke-static {}, Ljava/lang/System;->lineSeparator()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "Length: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/frl;->h:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 971
    invoke-static {}, Ljava/lang/System;->lineSeparator()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "Fragment:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 972
    iget-object v0, p0, Lo/frl;->k:Lo/fqm;

    if-eqz v0, :cond_0

    .line 973
    invoke-static {}, Ljava/lang/System;->lineSeparator()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/frl;->k:Lo/fqm;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 975
    :cond_0
    invoke-static {}, Ljava/lang/System;->lineSeparator()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "fragment is not decrypted yet"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 977
    :goto_0
    invoke-static {}, Ljava/lang/System;->lineSeparator()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "==============================================================="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 979
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
