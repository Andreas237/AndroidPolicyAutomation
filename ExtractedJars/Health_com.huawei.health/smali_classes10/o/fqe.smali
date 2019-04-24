.class public final Lo/fqe;
.super Lo/fqy;
.source "SourceFile"


# static fields
.field private static final a:Lo/fty;


# instance fields
.field private c:[B

.field private final d:Lo/fse;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 50
    const-class v0, Lo/fqe;

    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/fud;->c(Ljava/lang/String;)Lo/fty;

    move-result-object v0

    sput-object v0, Lo/fqe;->a:Lo/fty;

    return-void
.end method

.method private constructor <init>(Lo/fse;Ljava/net/InetSocketAddress;)V
    .locals 0

    .line 105
    invoke-direct {p0, p2}, Lo/fqy;-><init>(Ljava/net/InetSocketAddress;)V

    .line 106
    iput-object p1, p0, Lo/fqe;->d:Lo/fse;

    .line 107
    return-void
.end method

.method public constructor <init>(Lo/fse;Ljava/security/PrivateKey;[BLjava/net/InetSocketAddress;)V
    .locals 1

    .line 84
    invoke-direct {p0, p1, p4}, Lo/fqe;-><init>(Lo/fse;Ljava/net/InetSocketAddress;)V

    .line 85
    invoke-direct {p0, p2, p3}, Lo/fqe;->b(Ljava/security/PrivateKey;[B)[B

    move-result-object v0

    iput-object v0, p0, Lo/fqe;->c:[B

    .line 86
    return-void
.end method

.method private constructor <init>(Lo/fse;[BLjava/net/InetSocketAddress;)V
    .locals 1

    .line 100
    invoke-direct {p0, p1, p3}, Lo/fqe;-><init>(Lo/fse;Ljava/net/InetSocketAddress;)V

    .line 101
    array-length v0, p2

    invoke-static {p2, v0}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v0

    iput-object v0, p0, Lo/fqe;->c:[B

    .line 102
    return-void
.end method

.method private b(Ljava/security/PrivateKey;[B)[B
    .locals 3

    .line 169
    const/4 v0, 0x0

    new-array v0, v0, [B

    iput-object v0, p0, Lo/fqe;->c:[B

    .line 172
    :try_start_0
    iget-object v0, p0, Lo/fqe;->d:Lo/fse;

    invoke-virtual {v0}, Lo/fse;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/security/Signature;->getInstance(Ljava/lang/String;)Ljava/security/Signature;

    move-result-object v2

    .line 173
    invoke-virtual {v2, p1}, Ljava/security/Signature;->initSign(Ljava/security/PrivateKey;)V

    .line 175
    invoke-virtual {v2, p2}, Ljava/security/Signature;->update([B)V

    .line 177
    invoke-virtual {v2}, Ljava/security/Signature;->sign()[B

    move-result-object v0

    iput-object v0, p0, Lo/fqe;->c:[B
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 180
    goto :goto_0

    .line 178
    :catch_0
    move-exception v2

    .line 179
    sget-object v0, Lo/fqe;->a:Lo/fty;

    const-string v1, "Could not create signature."

    invoke-interface {v0, v1, v2}, Lo/fty;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 182
    :goto_0
    iget-object v0, p0, Lo/fqe;->c:[B

    return-object v0
.end method

.method public static e([BLjava/net/InetSocketAddress;)Lo/fqy;
    .locals 7

    .line 143
    new-instance v1, Lo/fpq;

    invoke-direct {v1, p0}, Lo/fpq;-><init>([B)V

    .line 147
    const/16 v0, 0x8

    invoke-virtual {v1, v0}, Lo/fpq;->c(I)I

    move-result v2

    .line 148
    const/16 v0, 0x8

    invoke-virtual {v1, v0}, Lo/fpq;->c(I)I

    move-result v3

    .line 149
    new-instance v4, Lo/fse;

    invoke-direct {v4, v2, v3}, Lo/fse;-><init>(II)V

    .line 151
    const/16 v0, 0x10

    invoke-virtual {v1, v0}, Lo/fpq;->c(I)I

    move-result v5

    .line 152
    invoke-virtual {v1, v5}, Lo/fpq;->d(I)[B

    move-result-object v6

    .line 154
    new-instance v0, Lo/fqe;

    invoke-direct {v0, v4, v6, p1}, Lo/fqe;-><init>(Lo/fse;[BLjava/net/InetSocketAddress;)V

    return-object v0
.end method


# virtual methods
.method public b(Ljava/security/PublicKey;[B)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/fqx;
        }
    .end annotation

    .line 196
    const/4 v3, 0x0

    .line 198
    :try_start_0
    iget-object v0, p0, Lo/fqe;->d:Lo/fse;

    invoke-virtual {v0}, Lo/fse;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/security/Signature;->getInstance(Ljava/lang/String;)Ljava/security/Signature;

    move-result-object v4

    .line 199
    invoke-virtual {v4, p1}, Ljava/security/Signature;->initVerify(Ljava/security/PublicKey;)V

    .line 201
    invoke-virtual {v4, p2}, Ljava/security/Signature;->update([B)V

    .line 203
    iget-object v0, p0, Lo/fqe;->c:[B

    invoke-virtual {v4, v0}, Ljava/security/Signature;->verify([B)Z
    :try_end_0
    .catch Ljava/security/SignatureException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/security/InvalidKeyException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    move v3, v0

    .line 207
    goto :goto_0

    .line 205
    :catch_0
    move-exception v4

    .line 206
    sget-object v0, Lo/fqe;->a:Lo/fty;

    const-string v1, "Could not verify the client\'s signature."

    invoke-interface {v0, v1, v4}, Lo/fty;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 209
    :goto_0
    if-nez v3, :cond_0

    .line 210
    const-string v4, "The client\'s CertificateVerify message could not be verified."

    .line 211
    new-instance v5, Lo/fqb;

    sget-object v0, Lo/fqb$c;->c:Lo/fqb$c;

    sget-object v1, Lo/fqb$b;->g:Lo/fqb$b;

    invoke-virtual {p0}, Lo/fqe;->e()Ljava/net/InetSocketAddress;

    move-result-object v2

    invoke-direct {v5, v0, v1, v2}, Lo/fqb;-><init>(Lo/fqb$c;Lo/fqb$b;Ljava/net/InetSocketAddress;)V

    .line 212
    new-instance v0, Lo/fqx;

    invoke-direct {v0, v4, v5}, Lo/fqx;-><init>(Ljava/lang/String;Lo/fqb;)V

    throw v0

    .line 214
    :cond_0
    return-void
.end method

.method public c()Lo/fra;
    .locals 1

    .line 113
    sget-object v0, Lo/fra;->f:Lo/fra;

    return-object v0
.end method

.method public d()I
    .locals 2

    .line 122
    iget-object v0, p0, Lo/fqe;->c:[B

    array-length v0, v0

    add-int/lit8 v0, v0, 0x4

    return v0
.end method

.method public g()[B
    .locals 3

    .line 129
    new-instance v2, Lo/fpp;

    invoke-direct {v2}, Lo/fpp;-><init>()V

    .line 133
    iget-object v0, p0, Lo/fqe;->d:Lo/fse;

    invoke-virtual {v0}, Lo/fse;->a()Lo/fse$b;

    move-result-object v0

    invoke-virtual {v0}, Lo/fse$b;->c()I

    move-result v0

    const/16 v1, 0x8

    invoke-virtual {v2, v0, v1}, Lo/fpp;->c(II)V

    .line 134
    iget-object v0, p0, Lo/fqe;->d:Lo/fse;

    invoke-virtual {v0}, Lo/fse;->c()Lo/fse$a;

    move-result-object v0

    invoke-virtual {v0}, Lo/fse$a;->a()I

    move-result v0

    const/16 v1, 0x8

    invoke-virtual {v2, v0, v1}, Lo/fpp;->c(II)V

    .line 136
    iget-object v0, p0, Lo/fqe;->c:[B

    array-length v0, v0

    const/16 v1, 0x10

    invoke-virtual {v2, v0, v1}, Lo/fpp;->c(II)V

    .line 137
    iget-object v0, p0, Lo/fqe;->c:[B

    invoke-virtual {v2, v0}, Lo/fpp;->e([B)V

    .line 139
    invoke-virtual {v2}, Lo/fpp;->e()[B

    move-result-object v0

    return-object v0
.end method
