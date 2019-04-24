.class public final Lo/fsi;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/fsi$3;,
        Lo/fsi$d;
    }
.end annotation


# static fields
.field protected static final d:Lo/fty;


# instance fields
.field private b:Ljava/security/interfaces/ECPublicKey;

.field private c:Ljava/security/interfaces/ECPrivateKey;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 61
    const-class v0, Lo/fsi;

    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/fud;->c(Ljava/lang/String;)Lo/fty;

    move-result-object v0

    sput-object v0, Lo/fsi;->d:Lo/fty;

    return-void
.end method

.method public constructor <init>(Ljava/security/spec/ECParameterSpec;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    .line 106
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 107
    invoke-direct {p0, p1}, Lo/fsi;->a(Ljava/security/spec/AlgorithmParameterSpec;)V

    .line 108
    return-void
.end method

.method private a(Ljava/security/spec/AlgorithmParameterSpec;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    .line 150
    const-string v0, "EC"

    invoke-static {v0}, Ljava/security/KeyPairGenerator;->getInstance(Ljava/lang/String;)Ljava/security/KeyPairGenerator;

    move-result-object v1

    .line 151
    new-instance v0, Ljava/security/SecureRandom;

    invoke-direct {v0}, Ljava/security/SecureRandom;-><init>()V

    invoke-virtual {v1, p1, v0}, Ljava/security/KeyPairGenerator;->initialize(Ljava/security/spec/AlgorithmParameterSpec;Ljava/security/SecureRandom;)V

    .line 153
    invoke-virtual {v1}, Ljava/security/KeyPairGenerator;->generateKeyPair()Ljava/security/KeyPair;

    move-result-object v2

    .line 154
    invoke-virtual {v2}, Ljava/security/KeyPair;->getPrivate()Ljava/security/PrivateKey;

    move-result-object v0

    check-cast v0, Ljava/security/interfaces/ECPrivateKey;

    iput-object v0, p0, Lo/fsi;->c:Ljava/security/interfaces/ECPrivateKey;

    .line 155
    invoke-virtual {v2}, Ljava/security/KeyPair;->getPublic()Ljava/security/PublicKey;

    move-result-object v0

    check-cast v0, Ljava/security/interfaces/ECPublicKey;

    iput-object v0, p0, Lo/fsi;->b:Ljava/security/interfaces/ECPublicKey;

    .line 156
    return-void
.end method

.method public static c(Ljava/security/spec/ECPoint;Ljava/security/spec/EllipticCurve;)[B
    .locals 7

    .line 258
    invoke-virtual {p1}, Ljava/security/spec/EllipticCurve;->getField()Ljava/security/spec/ECField;

    move-result-object v0

    invoke-interface {v0}, Ljava/security/spec/ECField;->getFieldSize()I

    move-result v0

    add-int/lit8 v0, v0, 0x7

    div-int/lit8 v3, v0, 0x8

    .line 260
    invoke-virtual {p0}, Ljava/security/spec/ECPoint;->getAffineX()Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {v0}, Ljava/math/BigInteger;->toByteArray()[B

    move-result-object v0

    invoke-static {v0}, Lo/fsp;->a([B)[B

    move-result-object v4

    .line 261
    invoke-virtual {p0}, Ljava/security/spec/ECPoint;->getAffineY()Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {v0}, Ljava/math/BigInteger;->toByteArray()[B

    move-result-object v0

    invoke-static {v0}, Lo/fsp;->a([B)[B

    move-result-object v5

    .line 263
    array-length v0, v4

    if-gt v0, v3, :cond_0

    array-length v0, v5

    if-le v0, v3, :cond_1

    .line 264
    :cond_0
    sget-object v0, Lo/fsi;->d:Lo/fty;

    const-string v1, "Point coordinates do not match field size."

    invoke-interface {v0, v1}, Lo/fty;->d(Ljava/lang/String;)V

    .line 265
    const/4 v0, 0x0

    return-object v0

    .line 269
    :cond_1
    mul-int/lit8 v0, v3, 0x2

    add-int/lit8 v0, v0, 0x1

    new-array v6, v0, [B

    .line 270
    const/4 v0, 0x4

    const/4 v1, 0x0

    aput-byte v0, v6, v1

    .line 271
    array-length v0, v4

    sub-int v0, v3, v0

    add-int/lit8 v0, v0, 0x1

    array-length v1, v4

    const/4 v2, 0x0

    invoke-static {v4, v2, v6, v0, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 272
    array-length v0, v6

    array-length v1, v5

    sub-int/2addr v0, v1

    array-length v1, v5

    const/4 v2, 0x0

    invoke-static {v5, v2, v6, v0, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 274
    return-object v6
.end method

.method public static e([BLjava/security/spec/EllipticCurve;)Ljava/security/spec/ECPoint;
    .locals 7

    .line 228
    array-length v0, p0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    aget-byte v0, p0, v0

    const/4 v1, 0x4

    if-eq v0, v1, :cond_1

    .line 229
    :cond_0
    sget-object v0, Lo/fsi;->d:Lo/fty;

    const-string v1, "Only uncompressed point format supported."

    invoke-interface {v0, v1}, Lo/fty;->d(Ljava/lang/String;)V

    .line 230
    const/4 v0, 0x0

    return-object v0

    .line 233
    :cond_1
    invoke-virtual {p1}, Ljava/security/spec/EllipticCurve;->getField()Ljava/security/spec/ECField;

    move-result-object v0

    invoke-interface {v0}, Ljava/security/spec/ECField;->getFieldSize()I

    move-result v0

    add-int/lit8 v0, v0, 0x7

    div-int/lit8 v4, v0, 0x8

    .line 234
    array-length v0, p0

    mul-int/lit8 v1, v4, 0x2

    add-int/lit8 v1, v1, 0x1

    if-eq v0, v1, :cond_2

    .line 235
    sget-object v0, Lo/fsi;->d:Lo/fty;

    const-string v1, "Point does not match field size."

    invoke-interface {v0, v1}, Lo/fty;->d(Ljava/lang/String;)V

    .line 236
    const/4 v0, 0x0

    return-object v0

    .line 238
    :cond_2
    new-array v5, v4, [B

    .line 239
    new-array v6, v4, [B

    .line 241
    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-static {p0, v0, v5, v1, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 242
    add-int/lit8 v0, v4, 0x1

    const/4 v1, 0x0

    invoke-static {p0, v0, v6, v1, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 244
    new-instance v0, Ljava/security/spec/ECPoint;

    new-instance v1, Ljava/math/BigInteger;

    const/4 v2, 0x1

    invoke-direct {v1, v2, v5}, Ljava/math/BigInteger;-><init>(I[B)V

    new-instance v2, Ljava/math/BigInteger;

    const/4 v3, 0x1

    invoke-direct {v2, v3, v6}, Ljava/math/BigInteger;-><init>(I[B)V

    invoke-direct {v0, v1, v2}, Ljava/security/spec/ECPoint;-><init>(Ljava/math/BigInteger;Ljava/math/BigInteger;)V

    return-object v0
.end method


# virtual methods
.method public d()Ljava/security/interfaces/ECPublicKey;
    .locals 1

    .line 163
    iget-object v0, p0, Lo/fsi;->b:Ljava/security/interfaces/ECPublicKey;

    return-object v0
.end method

.method public d([B)Ljavax/crypto/SecretKey;
    .locals 8

    .line 176
    const/4 v2, 0x0

    .line 179
    :try_start_0
    iget-object v0, p0, Lo/fsi;->b:Ljava/security/interfaces/ECPublicKey;

    invoke-interface {v0}, Ljava/security/interfaces/ECPublicKey;->getParams()Ljava/security/spec/ECParameterSpec;

    move-result-object v3

    .line 180
    invoke-virtual {v3}, Ljava/security/spec/ECParameterSpec;->getCurve()Ljava/security/spec/EllipticCurve;

    move-result-object v0

    invoke-static {p1, v0}, Lo/fsi;->e([BLjava/security/spec/EllipticCurve;)Ljava/security/spec/ECPoint;

    move-result-object v4

    .line 182
    const-string v0, "EC"

    invoke-static {v0}, Ljava/security/KeyFactory;->getInstance(Ljava/lang/String;)Ljava/security/KeyFactory;

    move-result-object v5

    .line 183
    new-instance v6, Ljava/security/spec/ECPublicKeySpec;

    invoke-direct {v6, v4, v3}, Ljava/security/spec/ECPublicKeySpec;-><init>(Ljava/security/spec/ECPoint;Ljava/security/spec/ECParameterSpec;)V

    .line 184
    invoke-virtual {v5, v6}, Ljava/security/KeyFactory;->generatePublic(Ljava/security/spec/KeySpec;)Ljava/security/PublicKey;

    move-result-object v7

    .line 186
    invoke-virtual {p0, v7}, Lo/fsi;->e(Ljava/security/PublicKey;)Ljavax/crypto/SecretKey;
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v2, v0

    .line 190
    goto :goto_0

    .line 188
    :catch_0
    move-exception v3

    .line 189
    sget-object v0, Lo/fsi;->d:Lo/fty;

    const-string v1, "Could not generate the premaster secret"

    invoke-interface {v0, v1, v3}, Lo/fty;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 191
    :goto_0
    return-object v2
.end method

.method public e(Ljava/security/PublicKey;)Ljavax/crypto/SecretKey;
    .locals 4

    .line 203
    const/4 v2, 0x0

    .line 205
    const-string v0, "ECDH"

    :try_start_0
    invoke-static {v0}, Ljavax/crypto/KeyAgreement;->getInstance(Ljava/lang/String;)Ljavax/crypto/KeyAgreement;

    move-result-object v3

    .line 206
    iget-object v0, p0, Lo/fsi;->c:Ljava/security/interfaces/ECPrivateKey;

    invoke-virtual {v3, v0}, Ljavax/crypto/KeyAgreement;->init(Ljava/security/Key;)V

    .line 207
    const/4 v0, 0x1

    invoke-virtual {v3, p1, v0}, Ljavax/crypto/KeyAgreement;->doPhase(Ljava/security/Key;Z)Ljava/security/Key;

    .line 209
    const-string v0, "TlsPremasterSecret"

    invoke-virtual {v3, v0}, Ljavax/crypto/KeyAgreement;->generateSecret(Ljava/lang/String;)Ljavax/crypto/SecretKey;
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v2, v0

    .line 212
    goto :goto_0

    .line 210
    :catch_0
    move-exception v3

    .line 211
    sget-object v0, Lo/fsi;->d:Lo/fty;

    const-string v1, "Could not generate the premaster secret"

    invoke-interface {v0, v1, v3}, Lo/fty;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 213
    :goto_0
    return-object v2
.end method
