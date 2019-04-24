.class public Lcom/shopkick/fetchers/api/AuthenticatedRequest;
.super Lcom/shopkick/fetchers/network/NetworkRequest;
.source "AuthenticatedRequest.java"


# static fields
.field private static final HMAC_SHA1_ALGORITHM:Ljava/lang/String; = "HmacSHA1"


# instance fields
.field private final secretKey:[B


# direct methods
.method public constructor <init>([BLcom/shopkick/fetchers/api/RequestDomainId;Lnet/toddm/comm/Request$RequestMethod;Ljava/lang/String;IZLnet/toddm/comm/Priority$StartingPriority;Lnet/toddm/cache/CachePriority;Lnet/toddm/comm/CacheBehavior;)V
    .locals 11

    move-object v10, p0

    const/4 v2, 0x0

    move-object v0, p0

    move-object v1, p2

    move-object v3, p3

    move-object v4, p4

    move/from16 v5, p5

    move/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    move-object/from16 v9, p9

    .line 47
    invoke-direct/range {v0 .. v9}, Lcom/shopkick/fetchers/network/NetworkRequest;-><init>(Lcom/shopkick/fetchers/api/RequestDomainId;Ljava/lang/String;Lnet/toddm/comm/Request$RequestMethod;Ljava/lang/String;IZLnet/toddm/comm/Priority$StartingPriority;Lnet/toddm/cache/CachePriority;Lnet/toddm/comm/CacheBehavior;)V

    move-object v0, p1

    .line 56
    iput-object v0, v10, Lcom/shopkick/fetchers/api/AuthenticatedRequest;->secretKey:[B

    const/4 v0, 0x0

    .line 57
    iput-boolean v0, v10, Lcom/shopkick/fetchers/api/AuthenticatedRequest;->isAuthenticated:Z

    return-void
.end method

.method private static getBodyAsASCIIString([B)Ljava/lang/String;
    .locals 2

    if-eqz p0, :cond_0

    .line 166
    :try_start_0
    new-instance v0, Ljava/lang/String;

    const-string v1, "US-ASCII"

    invoke-direct {v0, p0, v1}, Ljava/lang/String;-><init>([BLjava/lang/String;)V
    :try_end_0
    .catch Lorg/apache/http/ParseException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p0

    goto :goto_0

    :catch_1
    move-exception p0

    .line 168
    :goto_0
    const-class v0, Lcom/shopkick/fetchers/api/AuthenticatedRequest;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v0, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    const/4 v0, 0x0

    :goto_1
    return-object v0
.end method

.method public static getHmacString([BLjava/lang/String;Ljava/lang/String;[B)Ljava/lang/String;
    .locals 1

    .line 117
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 120
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    if-eqz p3, :cond_1

    .line 123
    array-length p1, p3

    if-lez p1, :cond_1

    .line 124
    invoke-static {p3}, Lcom/shopkick/fetchers/api/AuthenticatedRequest;->getBodyAsASCIIString([B)Ljava/lang/String;

    move-result-object p1

    .line 125
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-nez p2, :cond_1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 129
    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->getBytes()[B

    move-result-object p1

    invoke-static {p1, p0}, Lcom/shopkick/fetchers/api/AuthenticatedRequest;->getHmacString([B[B)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static getHmacString([B[B)Ljava/lang/String;
    .locals 3

    const/4 v0, 0x0

    if-eqz p0, :cond_1

    if-nez p1, :cond_0

    goto :goto_3

    .line 142
    :cond_0
    new-instance v1, Ljavax/crypto/spec/SecretKeySpec;

    const-string v2, "HmacSHA1"

    invoke-direct {v1, p1, v2}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    :try_start_0
    const-string p1, "HmacSHA1"

    .line 145
    invoke-static {p1}, Ljavax/crypto/Mac;->getInstance(Ljava/lang/String;)Ljavax/crypto/Mac;

    move-result-object p1

    .line 146
    invoke-virtual {p1, v1}, Ljavax/crypto/Mac;->init(Ljava/security/Key;)V

    .line 147
    invoke-virtual {p1, p0}, Ljavax/crypto/Mac;->doFinal([B)[B

    move-result-object p0

    .line 148
    new-instance p1, Ljava/lang/String;

    invoke-static {p0}, Lorg/bouncycastle/util/encoders/UrlBase64;->encode([B)[B

    move-result-object p0

    const-string v1, "ASCII"

    invoke-direct {p1, p0, v1}, Ljava/lang/String;-><init>([BLjava/lang/String;)V
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_5
    .catch Ljava/security/InvalidKeyException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_3

    const/16 p0, 0x2e

    const/16 v0, 0x3d

    .line 151
    :try_start_1
    invoke-virtual {p1, p0, v0}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object p0
    :try_end_1
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/security/InvalidKeyException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_2

    :catch_0
    move-exception p0

    goto :goto_0

    :catch_1
    move-exception p0

    goto :goto_0

    :catch_2
    move-exception p0

    :goto_0
    move-object v0, p1

    goto :goto_1

    :catch_3
    move-exception p0

    goto :goto_1

    :catch_4
    move-exception p0

    goto :goto_1

    :catch_5
    move-exception p0

    .line 153
    :goto_1
    const-class p1, Lcom/shopkick/fetchers/api/AuthenticatedRequest;

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p1, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    move-object p0, v0

    :goto_2
    return-object p0

    :cond_1
    :goto_3
    return-object v0
.end method

.method private populateAuthHeaders()V
    .locals 5

    .line 73
    :try_start_0
    iget-object v0, p0, Lcom/shopkick/fetchers/api/AuthenticatedRequest;->secretKey:[B

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/shopkick/fetchers/api/AuthenticatedRequest;->secretKey:[B

    array-length v0, v0

    if-lez v0, :cond_3

    .line 74
    iget-object v0, p0, Lcom/shopkick/fetchers/api/AuthenticatedRequest;->urlString:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    const/4 v0, 0x0

    .line 80
    invoke-virtual {p0}, Lcom/shopkick/fetchers/api/AuthenticatedRequest;->getHeaders()Ljava/util/HashMap;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Lcom/shopkick/fetchers/api/AuthenticatedRequest;->getHeaders()Ljava/util/HashMap;

    move-result-object v1

    const-string v2, "X-K"

    invoke-virtual {v1, v2}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 81
    invoke-virtual {p0}, Lcom/shopkick/fetchers/api/AuthenticatedRequest;->getHeaders()Ljava/util/HashMap;

    move-result-object v0

    const-string v1, "X-K"

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 85
    :cond_0
    iget-object v1, p0, Lcom/shopkick/fetchers/api/AuthenticatedRequest;->secretKey:[B

    iget-object v2, p0, Lcom/shopkick/fetchers/api/AuthenticatedRequest;->urlString:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/shopkick/fetchers/api/AuthenticatedRequest;->getPostBodyAsBytes()[B

    move-result-object v3

    invoke-static {v1, v2, v0, v3}, Lcom/shopkick/fetchers/api/AuthenticatedRequest;->getHmacString([BLjava/lang/String;Ljava/lang/String;[B)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    const-string v1, "X-Mac"

    .line 93
    invoke-virtual {p0, v1, v0}, Lcom/shopkick/fetchers/api/AuthenticatedRequest;->addHeader(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x1

    .line 97
    iput-boolean v0, p0, Lcom/shopkick/fetchers/api/AuthenticatedRequest;->isAuthenticated:Z

    goto :goto_0

    .line 89
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Could not construct a mac for this url: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/shopkick/fetchers/api/AuthenticatedRequest;->urlString:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 75
    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "\'urlString\' missing"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 95
    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "\'secretKey\' missing"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 101
    :catch_0
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v0

    sget-object v1, Lcom/shopkick/logging/Area;->COMM:Lcom/shopkick/logging/Area;

    invoke-virtual {v1}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v1

    const-string v3, "populateAuthHeaders() failed"

    const/4 v4, 0x0

    new-array v4, v4, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/shopkick/logging/DiagnosticLogger;->w(JLjava/lang/String;[Ljava/lang/Object;)V

    :goto_0
    return-void
.end method


# virtual methods
.method public populateURL(Landroid/net/Uri$Builder;Ljava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/net/Uri$Builder;",
            "Ljava/util/ArrayList<",
            "Lcom/shopkick/app/fetchers/network/QueryParameter;",
            ">;)V"
        }
    .end annotation

    .line 63
    invoke-super {p0, p1, p2}, Lcom/shopkick/fetchers/network/NetworkRequest;->populateURL(Landroid/net/Uri$Builder;Ljava/util/ArrayList;)V

    .line 64
    invoke-direct {p0}, Lcom/shopkick/fetchers/api/AuthenticatedRequest;->populateAuthHeaders()V

    return-void
.end method
