.class public final Lo/fqc;
.super Lo/fqy;
.source "SourceFile"


# static fields
.field private static final e:Lo/fty;


# instance fields
.field private a:I

.field private b:[B

.field private c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<[B>;"
        }
    .end annotation
.end field

.field private d:Ljava/security/cert/CertPath;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 64
    const-class v0, Lo/fqc;

    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/fud;->c(Ljava/lang/String;)Lo/fty;

    move-result-object v0

    sput-object v0, Lo/fqc;->e:Lo/fty;

    return-void
.end method

.method private constructor <init>(Ljava/security/cert/CertPath;Ljava/net/InetSocketAddress;)V
    .locals 1

    .line 128
    invoke-direct {p0, p2}, Lo/fqy;-><init>(Ljava/net/InetSocketAddress;)V

    .line 98
    const/4 v0, 0x3

    iput v0, p0, Lo/fqc;->a:I

    .line 129
    iput-object p1, p0, Lo/fqc;->d:Ljava/security/cert/CertPath;

    .line 130
    invoke-direct {p0}, Lo/fqc;->k()V

    .line 131
    return-void
.end method

.method public constructor <init>([BLjava/net/InetSocketAddress;)V
    .locals 2

    .line 144
    invoke-direct {p0, p2}, Lo/fqy;-><init>(Ljava/net/InetSocketAddress;)V

    .line 98
    const/4 v0, 0x3

    iput v0, p0, Lo/fqc;->a:I

    .line 145
    if-nez p1, :cond_0

    .line 146
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Raw public key byte array must not be null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 148
    :cond_0
    array-length v0, p1

    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v0

    iput-object v0, p0, Lo/fqc;->b:[B

    .line 149
    iget v0, p0, Lo/fqc;->a:I

    iget-object v1, p0, Lo/fqc;->b:[B

    array-length v1, v1

    add-int/2addr v0, v1

    iput v0, p0, Lo/fqc;->a:I

    .line 151
    return-void
.end method

.method public constructor <init>([Ljava/security/cert/X509Certificate;Ljava/net/InetSocketAddress;)V
    .locals 2

    .line 118
    invoke-direct {p0, p2}, Lo/fqy;-><init>(Ljava/net/InetSocketAddress;)V

    .line 98
    const/4 v0, 0x3

    iput v0, p0, Lo/fqc;->a:I

    .line 119
    if-nez p1, :cond_0

    .line 120
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Certificate chain must not be null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 122
    :cond_0
    invoke-direct {p0, p1}, Lo/fqc;->d([Ljava/security/cert/X509Certificate;)V

    .line 123
    invoke-direct {p0}, Lo/fqc;->k()V

    .line 125
    return-void
.end method

.method public static c([BZLjava/net/InetSocketAddress;)Lo/fqc;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/fqx;
        }
    .end annotation

    .line 299
    new-instance v2, Lo/fpq;

    invoke-direct {v2, p0}, Lo/fpq;-><init>([B)V

    .line 301
    if-eqz p1, :cond_0

    .line 302
    sget-object v0, Lo/fqc;->e:Lo/fty;

    const-string v1, "Parsing RawPublicKey CERTIFICATE message"

    invoke-interface {v0, v1}, Lo/fty;->a(Ljava/lang/String;)V

    .line 303
    const/16 v0, 0x18

    invoke-virtual {v2, v0}, Lo/fpq;->c(I)I

    move-result v3

    .line 304
    invoke-virtual {v2, v3}, Lo/fpq;->d(I)[B

    move-result-object v4

    .line 305
    new-instance v0, Lo/fqc;

    invoke-direct {v0, v4, p2}, Lo/fqc;-><init>([BLjava/net/InetSocketAddress;)V

    return-object v0

    .line 307
    :cond_0
    invoke-static {v2, p2}, Lo/fqc;->e(Lo/fpq;Ljava/net/InetSocketAddress;)Lo/fqc;

    move-result-object v0

    return-object v0
.end method

.method private d([Ljava/security/cert/X509Certificate;)V
    .locals 10

    .line 169
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 170
    const/4 v4, 0x0

    .line 172
    const-string v0, "X.509"

    :try_start_0
    invoke-static {v0}, Ljava/security/cert/CertificateFactory;->getInstance(Ljava/lang/String;)Ljava/security/cert/CertificateFactory;

    move-result-object v5

    .line 173
    move-object v6, p1

    array-length v7, v6

    const/4 v8, 0x0

    :goto_0
    if-ge v8, v7, :cond_2

    aget-object v9, v6, v8

    .line 174
    sget-object v0, Lo/fqc;->e:Lo/fty;

    const-string v1, "Current Subject DN: {}"

    invoke-virtual {v9}, Ljava/security/cert/X509Certificate;->getSubjectX500Principal()Ljavax/security/auth/x500/X500Principal;

    move-result-object v2

    invoke-virtual {v2}, Ljavax/security/auth/x500/X500Principal;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lo/fty;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 175
    if-eqz v4, :cond_0

    invoke-virtual {v9}, Ljava/security/cert/X509Certificate;->getSubjectX500Principal()Ljavax/security/auth/x500/X500Principal;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljavax/security/auth/x500/X500Principal;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 176
    sget-object v0, Lo/fqc;->e:Lo/fty;

    const-string v1, "Actual Issuer DN: {}"

    invoke-virtual {v9}, Ljava/security/cert/X509Certificate;->getSubjectX500Principal()Ljavax/security/auth/x500/X500Principal;

    move-result-object v2

    invoke-virtual {v2}, Ljavax/security/auth/x500/X500Principal;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lo/fty;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 177
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Given certificates do not form a chain"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 179
    :cond_0
    invoke-virtual {v9}, Ljava/security/cert/X509Certificate;->getIssuerX500Principal()Ljavax/security/auth/x500/X500Principal;

    move-result-object v0

    invoke-virtual {v9}, Ljava/security/cert/X509Certificate;->getSubjectX500Principal()Ljavax/security/auth/x500/X500Principal;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljavax/security/auth/x500/X500Principal;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 181
    invoke-interface {v3, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 182
    invoke-virtual {v9}, Ljava/security/cert/X509Certificate;->getIssuerX500Principal()Ljavax/security/auth/x500/X500Principal;

    move-result-object v4

    .line 183
    sget-object v0, Lo/fqc;->e:Lo/fty;

    const-string v1, "Expected Issuer DN: {}"

    invoke-virtual {v4}, Ljavax/security/auth/x500/X500Principal;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lo/fty;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 173
    :cond_1
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    .line 186
    :cond_2
    invoke-virtual {v5, v3}, Ljava/security/cert/CertificateFactory;->generateCertPath(Ljava/util/List;)Ljava/security/cert/CertPath;

    move-result-object v0

    iput-object v0, p0, Lo/fqc;->d:Ljava/security/cert/CertPath;
    :try_end_0
    .catch Ljava/security/cert/CertificateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 190
    goto :goto_1

    .line 187
    :catch_0
    move-exception v5

    .line 189
    sget-object v0, Lo/fqc;->e:Lo/fty;

    const-string v1, "could not create X.509 certificate factory"

    invoke-interface {v0, v1, v5}, Lo/fty;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 191
    :goto_1
    return-void
.end method

.method private static e(Lo/fpq;Ljava/net/InetSocketAddress;)Lo/fqc;
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/fqx;
        }
    .end annotation

    .line 313
    sget-object v0, Lo/fqc;->e:Lo/fty;

    const-string v1, "Parsing X.509 CERTIFICATE message"

    invoke-interface {v0, v1}, Lo/fty;->a(Ljava/lang/String;)V

    .line 314
    const/16 v0, 0x18

    invoke-virtual {p0, v0}, Lo/fpq;->c(I)I

    move-result v5

    .line 315
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 318
    const-string v0, "X.509"

    :try_start_0
    invoke-static {v0}, Ljava/security/cert/CertificateFactory;->getInstance(Ljava/lang/String;)Ljava/security/cert/CertificateFactory;

    move-result-object v7

    .line 320
    :goto_0
    if-lez v5, :cond_0

    .line 321
    const/16 v0, 0x18

    invoke-virtual {p0, v0}, Lo/fpq;->c(I)I

    move-result v8

    .line 322
    invoke-virtual {p0, v8}, Lo/fpq;->d(I)[B

    move-result-object v9

    .line 325
    add-int/lit8 v0, v8, 0x3

    sub-int/2addr v5, v0

    .line 327
    new-instance v0, Ljava/io/ByteArrayInputStream;

    invoke-direct {v0, v9}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    invoke-virtual {v7, v0}, Ljava/security/cert/CertificateFactory;->generateCertificate(Ljava/io/InputStream;)Ljava/security/cert/Certificate;

    move-result-object v0

    invoke-interface {v6, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 328
    goto :goto_0

    .line 330
    :cond_0
    new-instance v0, Lo/fqc;

    invoke-virtual {v7, v6}, Ljava/security/cert/CertificateFactory;->generateCertPath(Ljava/util/List;)Ljava/security/cert/CertPath;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Lo/fqc;-><init>(Ljava/security/cert/CertPath;Ljava/net/InetSocketAddress;)V
    :try_end_0
    .catch Ljava/security/cert/CertificateException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    .line 332
    :catch_0
    move-exception v7

    .line 333
    new-instance v0, Lo/fqx;

    const-string v1, "Cannot parse X.509 certificate chain provided by peer"

    new-instance v2, Lo/fqb;

    sget-object v3, Lo/fqb$c;->c:Lo/fqb$c;

    sget-object v4, Lo/fqb$b;->i:Lo/fqb$b;

    invoke-direct {v2, v3, v4, p1}, Lo/fqb;-><init>(Lo/fqb$c;Lo/fqb$b;Ljava/net/InetSocketAddress;)V

    invoke-direct {v0, v1, v2, v7}, Lo/fqx;-><init>(Ljava/lang/String;Lo/fqb;Ljava/lang/Throwable;)V

    throw v0
.end method

.method private k()V
    .locals 6

    .line 201
    iget-object v0, p0, Lo/fqc;->d:Ljava/security/cert/CertPath;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lo/fqc;->c:Ljava/util/List;

    if-nez v0, :cond_1

    .line 204
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lo/fqc;->d:Ljava/security/cert/CertPath;

    invoke-virtual {v1}, Ljava/security/cert/CertPath;->getCertificates()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Lo/fqc;->c:Ljava/util/List;

    .line 206
    :try_start_0
    iget-object v0, p0, Lo/fqc;->d:Ljava/security/cert/CertPath;

    invoke-virtual {v0}, Ljava/security/cert/CertPath;->getCertificates()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/security/cert/Certificate;

    .line 207
    invoke-virtual {v4}, Ljava/security/cert/Certificate;->getEncoded()[B

    move-result-object v5

    .line 208
    iget-object v0, p0, Lo/fqc;->c:Ljava/util/List;

    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 212
    iget v0, p0, Lo/fqc;->a:I

    array-length v1, v5

    add-int/lit8 v1, v1, 0x3

    add-int/2addr v0, v1

    iput v0, p0, Lo/fqc;->a:I
    :try_end_0
    .catch Ljava/security/cert/CertificateEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    .line 213
    goto :goto_0

    .line 217
    :cond_0
    goto :goto_1

    .line 214
    :catch_0
    move-exception v3

    .line 215
    const/4 v0, 0x0

    iput-object v0, p0, Lo/fqc;->c:Ljava/util/List;

    .line 216
    sget-object v0, Lo/fqc;->e:Lo/fty;

    const-string v1, "Could not encode certificate chain"

    invoke-interface {v0, v1, v3}, Lo/fty;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 219
    :cond_1
    :goto_1
    return-void
.end method


# virtual methods
.method public c()Lo/fra;
    .locals 1

    .line 197
    sget-object v0, Lo/fra;->e:Lo/fra;

    return-object v0
.end method

.method public d()I
    .locals 1

    .line 223
    iget v0, p0, Lo/fqc;->a:I

    return v0
.end method

.method public f()Ljava/security/cert/CertPath;
    .locals 1

    .line 258
    iget-object v0, p0, Lo/fqc;->d:Ljava/security/cert/CertPath;

    return-object v0
.end method

.method public g()[B
    .locals 5

    .line 265
    new-instance v2, Lo/fpp;

    invoke-direct {v2}, Lo/fpp;-><init>()V

    .line 267
    iget-object v0, p0, Lo/fqc;->b:[B

    if-nez v0, :cond_1

    .line 268
    invoke-virtual {p0}, Lo/fqc;->d()I

    move-result v0

    add-int/lit8 v0, v0, -0x3

    const/16 v1, 0x18

    invoke-virtual {v2, v0, v1}, Lo/fpp;->c(II)V

    .line 270
    iget-object v0, p0, Lo/fqc;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, [B

    .line 272
    array-length v0, v4

    const/16 v1, 0x18

    invoke-virtual {v2, v0, v1}, Lo/fpp;->c(II)V

    .line 274
    invoke-virtual {v2, v4}, Lo/fpp;->e([B)V

    .line 275
    goto :goto_0

    :cond_0
    goto :goto_1

    .line 277
    :cond_1
    iget-object v0, p0, Lo/fqc;->b:[B

    array-length v0, v0

    const/16 v1, 0x18

    invoke-virtual {v2, v0, v1}, Lo/fpp;->c(II)V

    .line 278
    iget-object v0, p0, Lo/fqc;->b:[B

    invoke-virtual {v2, v0}, Lo/fpp;->e([B)V

    .line 281
    :goto_1
    invoke-virtual {v2}, Lo/fpp;->e()[B

    move-result-object v0

    return-object v0
.end method

.method public h()Ljava/security/PublicKey;
    .locals 5

    .line 350
    const/4 v2, 0x0

    .line 352
    iget-object v0, p0, Lo/fqc;->b:[B

    if-nez v0, :cond_0

    .line 353
    iget-object v0, p0, Lo/fqc;->d:Ljava/security/cert/CertPath;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lo/fqc;->d:Ljava/security/cert/CertPath;

    invoke-virtual {v0}, Ljava/security/cert/CertPath;->getCertificates()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 354
    iget-object v0, p0, Lo/fqc;->d:Ljava/security/cert/CertPath;

    invoke-virtual {v0}, Ljava/security/cert/CertPath;->getCertificates()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/security/cert/Certificate;

    invoke-virtual {v0}, Ljava/security/cert/Certificate;->getPublicKey()Ljava/security/PublicKey;

    move-result-object v2

    goto :goto_0

    .line 358
    :cond_0
    new-instance v3, Ljava/security/spec/X509EncodedKeySpec;

    iget-object v0, p0, Lo/fqc;->b:[B

    invoke-direct {v3, v0}, Ljava/security/spec/X509EncodedKeySpec;-><init>([B)V

    .line 362
    const-string v0, "EC"

    :try_start_0
    invoke-static {v0}, Ljava/security/KeyFactory;->getInstance(Ljava/lang/String;)Ljava/security/KeyFactory;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/security/KeyFactory;->generatePublic(Ljava/security/spec/KeySpec;)Ljava/security/PublicKey;
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v2, v0

    .line 365
    goto :goto_0

    .line 363
    :catch_0
    move-exception v4

    .line 364
    sget-object v0, Lo/fqc;->e:Lo/fty;

    const-string v1, "Could not reconstruct the peer\'s public key"

    invoke-interface {v0, v1, v4}, Lo/fty;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 367
    :cond_1
    :goto_0
    return-object v2
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    .line 228
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 229
    invoke-super {p0}, Lo/fqy;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 230
    iget-object v0, p0, Lo/fqc;->b:[B

    if-nez v0, :cond_1

    iget-object v0, p0, Lo/fqc;->d:Ljava/security/cert/CertPath;

    if-eqz v0, :cond_1

    .line 231
    const-string v0, "\t\tCertificate chain length: "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lo/fqc;->d()I

    move-result v1

    add-int/lit8 v1, v1, -0x3

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {}, Ljava/lang/System;->lineSeparator()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 232
    const/4 v4, 0x0

    .line 233
    iget-object v0, p0, Lo/fqc;->d:Ljava/security/cert/CertPath;

    invoke-virtual {v0}, Ljava/security/cert/CertPath;->getCertificates()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/security/cert/Certificate;

    .line 234
    const-string v0, "\t\t\tCertificate Length: "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/fqc;->c:Ljava/util/List;

    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [B

    array-length v1, v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {}, Ljava/lang/System;->lineSeparator()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 235
    const-string v0, "\t\t\tCertificate: "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {}, Ljava/lang/System;->lineSeparator()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 236
    add-int/lit8 v4, v4, 0x1

    .line 237
    goto :goto_0

    .line 238
    :cond_0
    goto :goto_1

    :cond_1
    iget-object v0, p0, Lo/fqc;->b:[B

    if-eqz v0, :cond_2

    iget-object v0, p0, Lo/fqc;->d:Ljava/security/cert/CertPath;

    if-nez v0, :cond_2

    .line 239
    const-string v0, "\t\tRaw Public Key: "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 240
    invoke-virtual {p0}, Lo/fqc;->h()Ljava/security/PublicKey;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 241
    invoke-static {}, Ljava/lang/System;->lineSeparator()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 244
    :cond_2
    :goto_1
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
