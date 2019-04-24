.class public Lcom/shopkick/app/fetchers/api/AuthenticatedRequest;
.super Lcom/shopkick/app/fetchers/network/NetworkRequest;
.source "AuthenticatedRequest.java"


# static fields
.field private static final HMAC_SHA1_ALGORITHM:Ljava/lang/String; = "HmacSHA1"


# instance fields
.field private secretKey:[B


# direct methods
.method public constructor <init>([BZLjava/lang/String;)V
    .locals 0

    .line 31
    invoke-direct {p0, p2, p3}, Lcom/shopkick/app/fetchers/network/NetworkRequest;-><init>(ZLjava/lang/String;)V

    .line 32
    iput-object p1, p0, Lcom/shopkick/app/fetchers/api/AuthenticatedRequest;->secretKey:[B

    return-void
.end method

.method private getString([B[B)Ljava/lang/String;
    .locals 3

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    if-nez p2, :cond_0

    goto :goto_4

    .line 89
    :cond_0
    new-instance v1, Ljavax/crypto/spec/SecretKeySpec;

    const-string v2, "HmacSHA1"

    invoke-direct {v1, p2, v2}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    :try_start_0
    const-string p2, "HmacSHA1"

    .line 92
    invoke-static {p2}, Ljavax/crypto/Mac;->getInstance(Ljava/lang/String;)Ljavax/crypto/Mac;

    move-result-object p2

    .line 93
    invoke-virtual {p2, v1}, Ljavax/crypto/Mac;->init(Ljava/security/Key;)V

    .line 94
    invoke-virtual {p2, p1}, Ljavax/crypto/Mac;->doFinal([B)[B

    move-result-object p1

    .line 95
    new-instance p2, Ljava/lang/String;

    const/16 v1, 0xa

    invoke-static {p1, v1}, Landroid/util/Base64;->encode([BI)[B

    move-result-object p1

    const-string v1, "ASCII"

    invoke-direct {p2, p1, v1}, Ljava/lang/String;-><init>([BLjava/lang/String;)V
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_5
    .catch Ljava/security/InvalidKeyException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_3

    const/16 p1, 0x2e

    const/16 v0, 0x3d

    .line 98
    :try_start_1
    invoke-virtual {p2, p1, v0}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object p1
    :try_end_1
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/security/InvalidKeyException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_1 .. :try_end_1} :catch_0

    move-object v0, p1

    goto :goto_3

    :catch_0
    move-exception p1

    move-object v0, p2

    goto :goto_0

    :catch_1
    move-exception p1

    move-object v0, p2

    goto :goto_1

    :catch_2
    move-exception p1

    move-object v0, p2

    goto :goto_2

    :catch_3
    move-exception p1

    .line 104
    :goto_0
    const-class p2, Lcom/shopkick/app/fetchers/api/AuthenticatedRequest;

    invoke-virtual {p2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1}, Ljava/io/UnsupportedEncodingException;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_3

    :catch_4
    move-exception p1

    .line 102
    :goto_1
    const-class p2, Lcom/shopkick/app/fetchers/api/AuthenticatedRequest;

    invoke-virtual {p2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1}, Ljava/security/InvalidKeyException;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_3

    :catch_5
    move-exception p1

    .line 100
    :goto_2
    const-class p2, Lcom/shopkick/app/fetchers/api/AuthenticatedRequest;

    invoke-virtual {p2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1}, Ljava/security/NoSuchAlgorithmException;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :goto_3
    return-object v0

    :cond_1
    :goto_4
    return-object v0
.end method


# virtual methods
.method public getBodyAsASCIIString()Ljava/lang/String;
    .locals 2

    .line 112
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/AuthenticatedRequest;->body:Lorg/apache/http/HttpEntity;

    if-eqz v0, :cond_0

    .line 114
    :try_start_0
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/AuthenticatedRequest;->body:Lorg/apache/http/HttpEntity;

    const-string v1, "US-ASCII"

    invoke-static {v0, v1}, Lorg/apache/http/util/EntityUtils;->toString(Lorg/apache/http/HttpEntity;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Lorg/apache/http/ParseException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    .line 118
    const-class v1, Lcom/shopkick/app/fetchers/api/AuthenticatedRequest;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Ljava/io/IOException;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :catch_1
    move-exception v0

    .line 116
    const-class v1, Lcom/shopkick/app/fetchers/api/AuthenticatedRequest;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Lorg/apache/http/ParseException;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    :goto_0
    const/4 v0, 0x0

    :goto_1
    return-object v0
.end method

.method public populateURL(Landroid/net/Uri$Builder;Ljava/util/ArrayList;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/net/Uri$Builder;",
            "Ljava/util/ArrayList<",
            "Lcom/shopkick/app/fetchers/network/QueryParameter;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalArgumentException;,
            Ljava/io/UnsupportedEncodingException;
        }
    .end annotation

    .line 42
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/AuthenticatedRequest;->secretKey:[B

    if-eqz v0, :cond_3

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 49
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/AuthenticatedRequest;->secretKey:[B

    .line 52
    invoke-super {p0, p1, p2}, Lcom/shopkick/app/fetchers/network/NetworkRequest;->populateURL(Landroid/net/Uri$Builder;Ljava/util/ArrayList;)V

    .line 54
    new-instance p1, Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/shopkick/app/fetchers/api/AuthenticatedRequest;->urlString:Ljava/lang/String;

    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 55
    invoke-virtual {p0}, Lcom/shopkick/app/fetchers/api/AuthenticatedRequest;->getBodyAsASCIIString()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 57
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    :cond_0
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->getBytes()[B

    move-result-object v1

    invoke-direct {p0, v1, v0}, Lcom/shopkick/app/fetchers/api/AuthenticatedRequest;->getString([B[B)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    const-string p1, "="

    const-string v1, "%3D"

    .line 68
    invoke-virtual {v0, p1, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p1

    .line 71
    iget-boolean v0, p0, Lcom/shopkick/app/fetchers/api/AuthenticatedRequest;->isPost:Z

    if-nez v0, :cond_1

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result p2

    if-lez p2, :cond_1

    .line 72
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/AuthenticatedRequest;->urlString:Ljava/lang/String;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "&mac="

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/fetchers/api/AuthenticatedRequest;->urlString:Ljava/lang/String;

    goto :goto_0

    .line 74
    :cond_1
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/AuthenticatedRequest;->urlString:Ljava/lang/String;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "?mac="

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/fetchers/api/AuthenticatedRequest;->urlString:Ljava/lang/String;

    :goto_0
    return-void

    .line 65
    :cond_2
    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Could not construct a mac for this url: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    .line 45
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "secretKey missing"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
