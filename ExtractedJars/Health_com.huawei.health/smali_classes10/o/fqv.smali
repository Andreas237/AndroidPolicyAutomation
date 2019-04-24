.class public final Lo/fqv;
.super Lo/frx;
.source "SourceFile"


# static fields
.field private static final b:Lo/fty;


# instance fields
.field private a:[B

.field private c:Ljava/security/interfaces/ECPublicKey;

.field private final d:I

.field private e:Ljava/security/spec/ECPoint;

.field private h:[B

.field private final i:Lo/fse;

.field private k:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 57
    const-class v0, Lo/fqv;

    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/fud;->c(Ljava/lang/String;)Lo/fty;

    move-result-object v0

    sput-object v0, Lo/fqv;->b:Lo/fty;

    return-void
.end method

.method private constructor <init>(Lo/fse;ILjava/net/InetSocketAddress;)V
    .locals 1

    .line 193
    invoke-direct {p0, p3}, Lo/frx;-><init>(Ljava/net/InetSocketAddress;)V

    .line 88
    const/4 v0, 0x0

    iput-object v0, p0, Lo/fqv;->c:Ljava/security/interfaces/ECPublicKey;

    .line 90
    const/4 v0, 0x0

    iput-object v0, p0, Lo/fqv;->e:Ljava/security/spec/ECPoint;

    .line 91
    const/4 v0, 0x0

    iput-object v0, p0, Lo/fqv;->a:[B

    .line 95
    const/4 v0, 0x0

    iput-object v0, p0, Lo/fqv;->h:[B

    .line 101
    const/4 v0, 0x3

    iput v0, p0, Lo/fqv;->k:I

    .line 194
    iput-object p1, p0, Lo/fqv;->i:Lo/fse;

    .line 195
    iput p2, p0, Lo/fqv;->d:I

    .line 196
    return-void
.end method

.method private constructor <init>(Lo/fse;I[B[BLjava/net/InetSocketAddress;)V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/fqx;
        }
    .end annotation

    .line 168
    invoke-direct {p0, p1, p2, p5}, Lo/fqv;-><init>(Lo/fse;ILjava/net/InetSocketAddress;)V

    .line 169
    array-length v0, p3

    invoke-static {p3, v0}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v0

    iput-object v0, p0, Lo/fqv;->a:[B

    .line 170
    array-length v0, p4

    invoke-static {p4, v0}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v0

    iput-object v0, p0, Lo/fqv;->h:[B

    .line 172
    invoke-static {p2}, Lo/fsi$d;->c(I)Lo/fsi$d;

    move-result-object v5

    .line 173
    if-eqz v5, :cond_0

    invoke-virtual {v5}, Lo/fsi$d;->b()Z

    move-result v0

    if-nez v0, :cond_1

    .line 174
    :cond_0
    new-instance v0, Lo/fqx;

    const-string v1, "Server used unsupported elliptic curve (%d) for ECDH"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lo/fqb;

    sget-object v3, Lo/fqb$c;->c:Lo/fqb$c;

    sget-object v4, Lo/fqb$b;->g:Lo/fqb$b;

    invoke-direct {v2, v3, v4, p5}, Lo/fqb;-><init>(Lo/fqb$c;Lo/fqb$b;Ljava/net/InetSocketAddress;)V

    invoke-direct {v0, v1, v2}, Lo/fqx;-><init>(Ljava/lang/String;Lo/fqb;)V

    throw v0

    .line 179
    :cond_1
    :try_start_0
    invoke-virtual {v5}, Lo/fsi$d;->c()Ljava/security/spec/ECParameterSpec;

    move-result-object v0

    invoke-virtual {v0}, Ljava/security/spec/ECParameterSpec;->getCurve()Ljava/security/spec/EllipticCurve;

    move-result-object v0

    invoke-static {p3, v0}, Lo/fsi;->e([BLjava/security/spec/EllipticCurve;)Ljava/security/spec/ECPoint;

    move-result-object v0

    iput-object v0, p0, Lo/fqv;->e:Ljava/security/spec/ECPoint;

    .line 181
    const-string v0, "EC"

    invoke-static {v0}, Ljava/security/KeyFactory;->getInstance(Ljava/lang/String;)Ljava/security/KeyFactory;

    move-result-object v6

    .line 182
    new-instance v0, Ljava/security/spec/ECPublicKeySpec;

    iget-object v1, p0, Lo/fqv;->e:Ljava/security/spec/ECPoint;

    invoke-virtual {v5}, Lo/fsi$d;->c()Ljava/security/spec/ECParameterSpec;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Ljava/security/spec/ECPublicKeySpec;-><init>(Ljava/security/spec/ECPoint;Ljava/security/spec/ECParameterSpec;)V

    invoke-virtual {v6, v0}, Ljava/security/KeyFactory;->generatePublic(Ljava/security/spec/KeySpec;)Ljava/security/PublicKey;

    move-result-object v0

    check-cast v0, Ljava/security/interfaces/ECPublicKey;

    iput-object v0, p0, Lo/fqv;->c:Ljava/security/interfaces/ECPublicKey;
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 188
    goto :goto_0

    .line 183
    :catch_0
    move-exception v6

    .line 184
    sget-object v0, Lo/fqv;->b:Lo/fty;

    const-string v1, "Cannot re-create server\'s public key from params"

    invoke-interface {v0, v1, v6}, Lo/fty;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 185
    new-instance v0, Lo/fqx;

    const-string v1, "Cannot re-create server\'s public key from params: %s"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v6}, Ljava/security/GeneralSecurityException;->getMessage()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lo/fqb;

    sget-object v3, Lo/fqb$c;->c:Lo/fqb$c;

    sget-object v4, Lo/fqb$b;->y:Lo/fqb$b;

    invoke-direct {v2, v3, v4, p5}, Lo/fqb;-><init>(Lo/fqb$c;Lo/fqb$b;Ljava/net/InetSocketAddress;)V

    invoke-direct {v0, v1, v2}, Lo/fqx;-><init>(Ljava/lang/String;Lo/fqb;)V

    throw v0

    .line 190
    :goto_0
    return-void
.end method

.method public constructor <init>(Lo/fse;Lo/fsi;Ljava/security/PrivateKey;Lo/fro;Lo/fro;ILjava/net/InetSocketAddress;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    .line 130
    invoke-direct {p0, p1, p6, p7}, Lo/fqv;-><init>(Lo/fse;ILjava/net/InetSocketAddress;)V

    .line 132
    invoke-virtual {p2}, Lo/fsi;->d()Ljava/security/interfaces/ECPublicKey;

    move-result-object v0

    iput-object v0, p0, Lo/fqv;->c:Ljava/security/interfaces/ECPublicKey;

    .line 133
    iget-object v0, p0, Lo/fqv;->c:Ljava/security/interfaces/ECPublicKey;

    invoke-interface {v0}, Ljava/security/interfaces/ECPublicKey;->getParams()Ljava/security/spec/ECParameterSpec;

    move-result-object v2

    .line 135
    iget-object v0, p0, Lo/fqv;->c:Ljava/security/interfaces/ECPublicKey;

    invoke-interface {v0}, Ljava/security/interfaces/ECPublicKey;->getW()Ljava/security/spec/ECPoint;

    move-result-object v0

    iput-object v0, p0, Lo/fqv;->e:Ljava/security/spec/ECPoint;

    .line 136
    iget-object v0, p0, Lo/fqv;->e:Ljava/security/spec/ECPoint;

    invoke-virtual {v2}, Ljava/security/spec/ECParameterSpec;->getCurve()Ljava/security/spec/EllipticCurve;

    move-result-object v1

    invoke-static {v0, v1}, Lo/fsi;->c(Ljava/security/spec/ECPoint;Ljava/security/spec/EllipticCurve;)[B

    move-result-object v0

    iput-object v0, p0, Lo/fqv;->a:[B

    .line 142
    iget-object v0, p0, Lo/fqv;->i:Lo/fse;

    invoke-virtual {v0}, Lo/fse;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/security/Signature;->getInstance(Ljava/lang/String;)Ljava/security/Signature;

    move-result-object v3

    .line 143
    invoke-virtual {v3, p3}, Ljava/security/Signature;->initSign(Ljava/security/PrivateKey;)V

    .line 145
    invoke-direct {p0, v3, p4, p5}, Lo/fqv;->a(Ljava/security/Signature;Lo/fro;Lo/fro;)V

    .line 147
    invoke-virtual {v3}, Ljava/security/Signature;->sign()[B

    move-result-object v0

    iput-object v0, p0, Lo/fqv;->h:[B

    .line 148
    return-void
.end method

.method private static a(Lo/fpq;Ljava/net/InetSocketAddress;)Lo/fqv;
    .locals 15
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/fqx;
        }
    .end annotation

    .line 259
    const/16 v0, 0x10

    invoke-virtual {p0, v0}, Lo/fpq;->c(I)I

    move-result v6

    .line 260
    const/16 v0, 0x8

    invoke-virtual {p0, v0}, Lo/fpq;->c(I)I

    move-result v7

    .line 261
    invoke-virtual {p0, v7}, Lo/fpq;->d(I)[B

    move-result-object v8

    .line 263
    invoke-virtual {p0}, Lo/fpq;->c()[B

    move-result-object v9

    .line 266
    new-instance v10, Lo/fse;

    sget-object v0, Lo/fse$b;->a:Lo/fse$b;

    sget-object v1, Lo/fse$a;->b:Lo/fse$a;

    invoke-direct {v10, v0, v1}, Lo/fse;-><init>(Lo/fse$b;Lo/fse$a;)V

    .line 268
    const/4 v11, 0x0

    .line 269
    array-length v0, v9

    if-lez v0, :cond_0

    .line 270
    new-instance v12, Lo/fpq;

    invoke-direct {v12, v9}, Lo/fpq;-><init>([B)V

    .line 271
    const/16 v0, 0x8

    invoke-virtual {v12, v0}, Lo/fpq;->c(I)I

    move-result v13

    .line 272
    const/16 v0, 0x8

    invoke-virtual {v12, v0}, Lo/fpq;->c(I)I

    move-result v14

    .line 273
    new-instance v10, Lo/fse;

    invoke-direct {v10, v13, v14}, Lo/fse;-><init>(II)V

    .line 274
    const/16 v0, 0x10

    invoke-virtual {v12, v0}, Lo/fpq;->c(I)I

    move-result v7

    .line 275
    invoke-virtual {v12, v7}, Lo/fpq;->d(I)[B

    move-result-object v11

    .line 278
    :cond_0
    new-instance v0, Lo/fqv;

    move-object v1, v10

    move v2, v6

    move-object v3, v8

    move-object v4, v11

    move-object/from16 v5, p1

    invoke-direct/range {v0 .. v5}, Lo/fqv;-><init>(Lo/fse;I[B[BLjava/net/InetSocketAddress;)V

    return-object v0
.end method

.method private a(Ljava/security/Signature;Lo/fro;Lo/fro;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/SignatureException;
        }
    .end annotation

    .line 359
    invoke-virtual {p2}, Lo/fro;->b()[B

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/security/Signature;->update([B)V

    .line 360
    invoke-virtual {p3}, Lo/fro;->b()[B

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/security/Signature;->update([B)V

    .line 362
    iget v0, p0, Lo/fqv;->k:I

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 366
    :pswitch_0
    goto :goto_1

    .line 369
    :pswitch_1
    invoke-direct {p0, p1}, Lo/fqv;->b(Ljava/security/Signature;)V

    .line 370
    goto :goto_1

    .line 373
    :goto_0
    sget-object v0, Lo/fqv;->b:Lo/fty;

    const-string v1, "Unknown curve type [{}]"

    iget v2, p0, Lo/fqv;->k:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lo/fty;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 376
    :goto_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method private b(Ljava/security/Signature;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/SignatureException;
        }
    .end annotation

    .line 379
    const/4 v0, 0x3

    invoke-virtual {p1, v0}, Ljava/security/Signature;->update(B)V

    .line 380
    iget v0, p0, Lo/fqv;->d:I

    shr-int/lit8 v0, v0, 0x8

    int-to-byte v0, v0

    invoke-virtual {p1, v0}, Ljava/security/Signature;->update(B)V

    .line 381
    iget v0, p0, Lo/fqv;->d:I

    int-to-byte v0, v0

    invoke-virtual {p1, v0}, Ljava/security/Signature;->update(B)V

    .line 382
    iget-object v0, p0, Lo/fqv;->a:[B

    array-length v0, v0

    int-to-byte v0, v0

    invoke-virtual {p1, v0}, Ljava/security/Signature;->update(B)V

    .line 383
    iget-object v0, p0, Lo/fqv;->a:[B

    invoke-virtual {p1, v0}, Ljava/security/Signature;->update([B)V

    .line 384
    return-void
.end method

.method public static e([BLjava/net/InetSocketAddress;)Lo/fqy;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/fqx;
        }
    .end annotation

    .line 243
    new-instance v5, Lo/fpq;

    invoke-direct {v5, p0}, Lo/fpq;-><init>([B)V

    .line 244
    const/16 v0, 0x8

    invoke-virtual {v5, v0}, Lo/fpq;->c(I)I

    move-result v6

    .line 245
    sparse-switch v6, :sswitch_data_0

    goto :goto_0

    .line 248
    :sswitch_0
    invoke-static {v5, p1}, Lo/fqv;->a(Lo/fpq;Ljava/net/InetSocketAddress;)Lo/fqv;

    move-result-object v0

    return-object v0

    .line 250
    :goto_0
    new-instance v0, Lo/fqx;

    const-string v1, "Curve type [%s] received in ServerKeyExchange message from peer [%s] is unsupported"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    aput-object p1, v2, v3

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lo/fqb;

    sget-object v3, Lo/fqb$c;->c:Lo/fqb$c;

    sget-object v4, Lo/fqb$b;->g:Lo/fqb$b;

    invoke-direct {v2, v3, v4, p1}, Lo/fqb;-><init>(Lo/fqb$c;Lo/fqb$b;Ljava/net/InetSocketAddress;)V

    invoke-direct {v0, v1, v2}, Lo/fqx;-><init>(Ljava/lang/String;Lo/fqb;)V

    throw v0

    :sswitch_data_0
    .sparse-switch
        0x3 -> :sswitch_0
    .end sparse-switch
.end method

.method private e(Lo/fpp;)V
    .locals 2

    .line 225
    const/4 v0, 0x3

    const/16 v1, 0x8

    invoke-virtual {p1, v0, v1}, Lo/fpp;->c(II)V

    .line 226
    iget v0, p0, Lo/fqv;->d:I

    const/16 v1, 0x10

    invoke-virtual {p1, v0, v1}, Lo/fpp;->c(II)V

    .line 227
    iget-object v0, p0, Lo/fqv;->a:[B

    array-length v0, v0

    const/16 v1, 0x8

    invoke-virtual {p1, v0, v1}, Lo/fpp;->c(II)V

    .line 228
    iget-object v0, p0, Lo/fqv;->a:[B

    invoke-virtual {p1, v0}, Lo/fpp;->e([B)V

    .line 231
    iget-object v0, p0, Lo/fqv;->h:[B

    if-eqz v0, :cond_0

    .line 234
    iget-object v0, p0, Lo/fqv;->i:Lo/fse;

    invoke-virtual {v0}, Lo/fse;->a()Lo/fse$b;

    move-result-object v0

    invoke-virtual {v0}, Lo/fse$b;->c()I

    move-result v0

    const/16 v1, 0x8

    invoke-virtual {p1, v0, v1}, Lo/fpp;->c(II)V

    .line 235
    iget-object v0, p0, Lo/fqv;->i:Lo/fse;

    invoke-virtual {v0}, Lo/fse;->c()Lo/fse$a;

    move-result-object v0

    invoke-virtual {v0}, Lo/fse$a;->a()I

    move-result v0

    const/16 v1, 0x8

    invoke-virtual {p1, v0, v1}, Lo/fpp;->c(II)V

    .line 237
    iget-object v0, p0, Lo/fqv;->h:[B

    array-length v0, v0

    const/16 v1, 0x10

    invoke-virtual {p1, v0, v1}, Lo/fpp;->c(II)V

    .line 238
    iget-object v0, p0, Lo/fqv;->h:[B

    invoke-virtual {p1, v0}, Lo/fpp;->e([B)V

    .line 240
    :cond_0
    return-void
.end method


# virtual methods
.method public c(Ljava/security/PublicKey;Lo/fro;Lo/fro;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/fqx;
        }
    .end annotation

    .line 319
    iget-object v0, p0, Lo/fqv;->h:[B

    if-nez v0, :cond_0

    .line 321
    return-void

    .line 323
    :cond_0
    const/4 v3, 0x0

    .line 325
    :try_start_0
    iget-object v0, p0, Lo/fqv;->i:Lo/fse;

    invoke-virtual {v0}, Lo/fse;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/security/Signature;->getInstance(Ljava/lang/String;)Ljava/security/Signature;

    move-result-object v4

    .line 326
    invoke-virtual {v4, p1}, Ljava/security/Signature;->initVerify(Ljava/security/PublicKey;)V

    .line 328
    invoke-direct {p0, v4, p2, p3}, Lo/fqv;->a(Ljava/security/Signature;Lo/fro;Lo/fro;)V

    .line 330
    iget-object v0, p0, Lo/fqv;->h:[B

    invoke-virtual {v4, v0}, Ljava/security/Signature;->verify([B)Z
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    move v3, v0

    .line 334
    goto :goto_0

    .line 332
    :catch_0
    move-exception v4

    .line 333
    sget-object v0, Lo/fqv;->b:Lo/fty;

    const-string v1, "Could not verify the server\'s signature."

    invoke-interface {v0, v1, v4}, Lo/fty;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 336
    :goto_0
    if-nez v3, :cond_1

    .line 337
    const-string v4, "The server\'s ECDHE key exchange message\'s signature could not be verified."

    .line 338
    new-instance v5, Lo/fqb;

    sget-object v0, Lo/fqb$c;->c:Lo/fqb$c;

    sget-object v1, Lo/fqb$b;->g:Lo/fqb$b;

    invoke-virtual {p0}, Lo/fqv;->e()Ljava/net/InetSocketAddress;

    move-result-object v2

    invoke-direct {v5, v0, v1, v2}, Lo/fqb;-><init>(Lo/fqb$c;Lo/fqb$b;Ljava/net/InetSocketAddress;)V

    .line 339
    new-instance v0, Lo/fqx;

    invoke-direct {v0, v4, v5}, Lo/fqx;-><init>(Ljava/lang/String;Lo/fqb;)V

    throw v0

    .line 341
    :cond_1
    return-void
.end method

.method public d()I
    .locals 5

    .line 285
    const/4 v3, 0x0

    .line 286
    iget v0, p0, Lo/fqv;->k:I

    packed-switch v0, :pswitch_data_0

    goto :goto_1

    .line 289
    :pswitch_0
    goto :goto_2

    .line 293
    :pswitch_1
    iget-object v0, p0, Lo/fqv;->h:[B

    if-nez v0, :cond_0

    const/4 v4, 0x0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lo/fqv;->h:[B

    array-length v0, v0

    add-int/lit8 v4, v0, 0x4

    .line 294
    :goto_0
    iget-object v0, p0, Lo/fqv;->a:[B

    array-length v0, v0

    add-int/lit8 v0, v0, 0x4

    add-int v3, v0, v4

    .line 295
    goto :goto_2

    .line 298
    :goto_1
    sget-object v0, Lo/fqv;->b:Lo/fty;

    const-string v1, "Unknown curve type [{}]"

    iget v2, p0, Lo/fqv;->k:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lo/fty;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 302
    :goto_2
    return v3

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public g()[B
    .locals 4

    .line 203
    new-instance v3, Lo/fpp;

    invoke-direct {v3}, Lo/fpp;-><init>()V

    .line 205
    iget v0, p0, Lo/fqv;->k:I

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 209
    :pswitch_0
    goto :goto_1

    .line 212
    :pswitch_1
    invoke-direct {p0, v3}, Lo/fqv;->e(Lo/fpp;)V

    .line 213
    goto :goto_1

    .line 216
    :goto_0
    sget-object v0, Lo/fqv;->b:Lo/fty;

    const-string v1, "Unknown curve type [{}]"

    iget v2, p0, Lo/fqv;->k:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lo/fty;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 220
    :goto_1
    invoke-virtual {v3}, Lo/fpp;->e()[B

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public k()Ljava/security/interfaces/ECPublicKey;
    .locals 1

    .line 387
    iget-object v0, p0, Lo/fqv;->c:Ljava/security/interfaces/ECPublicKey;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 396
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 397
    invoke-super {p0}, Lo/frx;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 398
    const-string v0, "\t\tDiffie-Hellman public key: "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 399
    invoke-virtual {p0}, Lo/fqv;->k()Ljava/security/interfaces/ECPublicKey;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 401
    invoke-static {}, Ljava/lang/System;->lineSeparator()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 403
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
