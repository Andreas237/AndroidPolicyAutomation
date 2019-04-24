.class Lcom/twitter/sdk/android/core/internal/oauth/OAuth1aParameters;
.super Ljava/lang/Object;
.source "OAuth1aParameters.java"


# static fields
.field private static final RAND:Ljava/security/SecureRandom;


# instance fields
.field private final authConfig:Lcom/twitter/sdk/android/core/TwitterAuthConfig;

.field private final authToken:Lcom/twitter/sdk/android/core/TwitterAuthToken;

.field private final callback:Ljava/lang/String;

.field private final method:Ljava/lang/String;

.field private final postParams:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final url:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 47
    new-instance v0, Ljava/security/SecureRandom;

    invoke-direct {v0}, Ljava/security/SecureRandom;-><init>()V

    sput-object v0, Lcom/twitter/sdk/android/core/internal/oauth/OAuth1aParameters;->RAND:Ljava/security/SecureRandom;

    return-void
.end method

.method public constructor <init>(Lcom/twitter/sdk/android/core/TwitterAuthConfig;Lcom/twitter/sdk/android/core/TwitterAuthToken;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/twitter/sdk/android/core/TwitterAuthConfig;",
            "Lcom/twitter/sdk/android/core/TwitterAuthToken;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 57
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 58
    iput-object p1, p0, Lcom/twitter/sdk/android/core/internal/oauth/OAuth1aParameters;->authConfig:Lcom/twitter/sdk/android/core/TwitterAuthConfig;

    .line 59
    iput-object p2, p0, Lcom/twitter/sdk/android/core/internal/oauth/OAuth1aParameters;->authToken:Lcom/twitter/sdk/android/core/TwitterAuthToken;

    .line 60
    iput-object p3, p0, Lcom/twitter/sdk/android/core/internal/oauth/OAuth1aParameters;->callback:Ljava/lang/String;

    .line 61
    iput-object p4, p0, Lcom/twitter/sdk/android/core/internal/oauth/OAuth1aParameters;->method:Ljava/lang/String;

    .line 62
    iput-object p5, p0, Lcom/twitter/sdk/android/core/internal/oauth/OAuth1aParameters;->url:Ljava/lang/String;

    .line 63
    iput-object p6, p0, Lcom/twitter/sdk/android/core/internal/oauth/OAuth1aParameters;->postParams:Ljava/util/Map;

    return-void
.end method

.method private appendParameter(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    if-eqz p3, :cond_0

    const/16 v0, 0x20

    .line 186
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-static {p2}, Lio/fabric/sdk/android/services/network/UrlUtils;->percentEncode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "=\""

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p3}, Lio/fabric/sdk/android/services/network/UrlUtils;->percentEncode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "\","

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    return-void
.end method

.method private getEncodedQueryParams(Ljava/util/TreeMap;)Ljava/lang/String;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/TreeMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .line 119
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 120
    invoke-virtual {p1}, Ljava/util/TreeMap;->size()I

    move-result v1

    .line 122
    invoke-virtual {p1}, Ljava/util/TreeMap;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v2, 0x0

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    .line 123
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-static {v4}, Lio/fabric/sdk/android/services/network/UrlUtils;->percentEncode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lio/fabric/sdk/android/services/network/UrlUtils;->percentEncode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "%3D"

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-static {v3}, Lio/fabric/sdk/android/services/network/UrlUtils;->percentEncode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lio/fabric/sdk/android/services/network/UrlUtils;->percentEncode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v2, v2, 0x1

    if-ge v2, v1, :cond_0

    const-string v3, "%26"

    .line 128
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 131
    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private getNonce()Ljava/lang/String;
    .locals 3

    .line 78
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v1, Lcom/twitter/sdk/android/core/internal/oauth/OAuth1aParameters;->RAND:Ljava/security/SecureRandom;

    invoke-virtual {v1}, Ljava/security/SecureRandom;->nextLong()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Math;->abs(J)J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private getSigningKey()Ljava/lang/String;
    .locals 3

    .line 161
    iget-object v0, p0, Lcom/twitter/sdk/android/core/internal/oauth/OAuth1aParameters;->authToken:Lcom/twitter/sdk/android/core/TwitterAuthToken;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lcom/twitter/sdk/android/core/TwitterAuthToken;->secret:Ljava/lang/String;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 162
    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/twitter/sdk/android/core/internal/oauth/OAuth1aParameters;->authConfig:Lcom/twitter/sdk/android/core/TwitterAuthConfig;

    invoke-virtual {v2}, Lcom/twitter/sdk/android/core/TwitterAuthConfig;->getConsumerSecret()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lio/fabric/sdk/android/services/network/UrlUtils;->urlEncode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0x26

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-static {v0}, Lio/fabric/sdk/android/services/network/UrlUtils;->urlEncode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private getTimestamp()Ljava/lang/String;
    .locals 4

    .line 82
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    div-long/2addr v0, v2

    .line 83
    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method calculateSignature(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 136
    :try_start_0
    invoke-direct {p0}, Lcom/twitter/sdk/android/core/internal/oauth/OAuth1aParameters;->getSigningKey()Ljava/lang/String;

    move-result-object v0

    const-string v1, "UTF8"

    .line 139
    invoke-virtual {p1, v1}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object p1

    const-string v1, "UTF8"

    .line 140
    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v0

    .line 141
    new-instance v1, Ljavax/crypto/spec/SecretKeySpec;

    const-string v2, "HmacSHA1"

    invoke-direct {v1, v0, v2}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    const-string v0, "HmacSHA1"

    .line 142
    invoke-static {v0}, Ljavax/crypto/Mac;->getInstance(Ljava/lang/String;)Ljavax/crypto/Mac;

    move-result-object v0

    .line 143
    invoke-virtual {v0, v1}, Ljavax/crypto/Mac;->init(Ljava/security/Key;)V

    .line 144
    invoke-virtual {v0, p1}, Ljavax/crypto/Mac;->doFinal([B)[B

    move-result-object p1

    .line 145
    new-instance v0, Ljava/lang/String;

    const/4 v1, 0x0

    array-length v2, p1

    invoke-static {p1, v1, v2}, Lio/fabric/sdk/android/services/network/HttpRequest$Base64;->encodeBytesToBytes([BII)[B

    move-result-object p1

    const-string v1, "UTF8"

    invoke-direct {v0, p1, v1}, Ljava/lang/String;-><init>([BLjava/lang/String;)V
    :try_end_0
    .catch Ljava/security/InvalidKeyException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception p1

    .line 155
    invoke-static {}, Lio/fabric/sdk/android/Fabric;->getLogger()Lio/fabric/sdk/android/Logger;

    move-result-object v0

    const-string v1, "Twitter"

    const-string v2, "Failed to calculate signature"

    invoke-interface {v0, v1, v2, p1}, Lio/fabric/sdk/android/Logger;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    const-string p1, ""

    return-object p1

    :catch_1
    move-exception p1

    .line 152
    invoke-static {}, Lio/fabric/sdk/android/Fabric;->getLogger()Lio/fabric/sdk/android/Logger;

    move-result-object v0

    const-string v1, "Twitter"

    const-string v2, "Failed to calculate signature"

    invoke-interface {v0, v1, v2, p1}, Lio/fabric/sdk/android/Logger;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    const-string p1, ""

    return-object p1

    :catch_2
    move-exception p1

    .line 149
    invoke-static {}, Lio/fabric/sdk/android/Fabric;->getLogger()Lio/fabric/sdk/android/Logger;

    move-result-object v0

    const-string v1, "Twitter"

    const-string v2, "Failed to calculate signature"

    invoke-interface {v0, v1, v2, p1}, Lio/fabric/sdk/android/Logger;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    const-string p1, ""

    return-object p1
.end method

.method constructAuthorizationHeader(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 170
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "OAuth"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v1, "oauth_callback"

    .line 171
    iget-object v2, p0, Lcom/twitter/sdk/android/core/internal/oauth/OAuth1aParameters;->callback:Ljava/lang/String;

    invoke-direct {p0, v0, v1, v2}, Lcom/twitter/sdk/android/core/internal/oauth/OAuth1aParameters;->appendParameter(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "oauth_consumer_key"

    .line 172
    iget-object v2, p0, Lcom/twitter/sdk/android/core/internal/oauth/OAuth1aParameters;->authConfig:Lcom/twitter/sdk/android/core/TwitterAuthConfig;

    invoke-virtual {v2}, Lcom/twitter/sdk/android/core/TwitterAuthConfig;->getConsumerKey()Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, v0, v1, v2}, Lcom/twitter/sdk/android/core/internal/oauth/OAuth1aParameters;->appendParameter(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "oauth_nonce"

    .line 173
    invoke-direct {p0, v0, v1, p1}, Lcom/twitter/sdk/android/core/internal/oauth/OAuth1aParameters;->appendParameter(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, "oauth_signature"

    .line 174
    invoke-direct {p0, v0, p1, p3}, Lcom/twitter/sdk/android/core/internal/oauth/OAuth1aParameters;->appendParameter(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, "oauth_signature_method"

    const-string p3, "HMAC-SHA1"

    .line 175
    invoke-direct {p0, v0, p1, p3}, Lcom/twitter/sdk/android/core/internal/oauth/OAuth1aParameters;->appendParameter(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, "oauth_timestamp"

    .line 176
    invoke-direct {p0, v0, p1, p2}, Lcom/twitter/sdk/android/core/internal/oauth/OAuth1aParameters;->appendParameter(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V

    .line 177
    iget-object p1, p0, Lcom/twitter/sdk/android/core/internal/oauth/OAuth1aParameters;->authToken:Lcom/twitter/sdk/android/core/TwitterAuthToken;

    if-eqz p1, :cond_0

    iget-object p1, p1, Lcom/twitter/sdk/android/core/TwitterAuthToken;->token:Ljava/lang/String;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    const-string p2, "oauth_token"

    .line 178
    invoke-direct {p0, v0, p2, p1}, Lcom/twitter/sdk/android/core/internal/oauth/OAuth1aParameters;->appendParameter(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, "oauth_version"

    const-string p2, "1.0"

    .line 179
    invoke-direct {p0, v0, p1, p2}, Lcom/twitter/sdk/android/core/internal/oauth/OAuth1aParameters;->appendParameter(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V

    const/4 p1, 0x0

    .line 181
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result p2

    add-int/lit8 p2, p2, -0x1

    invoke-virtual {v0, p1, p2}, Ljava/lang/StringBuilder;->substring(II)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method constructSignatureBase(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 88
    iget-object v0, p0, Lcom/twitter/sdk/android/core/internal/oauth/OAuth1aParameters;->url:Ljava/lang/String;

    invoke-static {v0}, Ljava/net/URI;->create(Ljava/lang/String;)Ljava/net/URI;

    move-result-object v0

    const/4 v1, 0x1

    .line 89
    invoke-static {v0, v1}, Lio/fabric/sdk/android/services/network/UrlUtils;->getQueryParams(Ljava/net/URI;Z)Ljava/util/TreeMap;

    move-result-object v1

    .line 90
    iget-object v2, p0, Lcom/twitter/sdk/android/core/internal/oauth/OAuth1aParameters;->postParams:Ljava/util/Map;

    if-eqz v2, :cond_0

    .line 91
    invoke-virtual {v1, v2}, Ljava/util/TreeMap;->putAll(Ljava/util/Map;)V

    .line 95
    :cond_0
    iget-object v2, p0, Lcom/twitter/sdk/android/core/internal/oauth/OAuth1aParameters;->callback:Ljava/lang/String;

    if-eqz v2, :cond_1

    const-string v3, "oauth_callback"

    .line 96
    invoke-virtual {v1, v3, v2}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    const-string v2, "oauth_consumer_key"

    .line 98
    iget-object v3, p0, Lcom/twitter/sdk/android/core/internal/oauth/OAuth1aParameters;->authConfig:Lcom/twitter/sdk/android/core/TwitterAuthConfig;

    invoke-virtual {v3}, Lcom/twitter/sdk/android/core/TwitterAuthConfig;->getConsumerKey()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "oauth_nonce"

    .line 99
    invoke-virtual {v1, v2, p1}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p1, "oauth_signature_method"

    const-string v2, "HMAC-SHA1"

    .line 100
    invoke-virtual {v1, p1, v2}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p1, "oauth_timestamp"

    .line 101
    invoke-virtual {v1, p1, p2}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 102
    iget-object p1, p0, Lcom/twitter/sdk/android/core/internal/oauth/OAuth1aParameters;->authToken:Lcom/twitter/sdk/android/core/TwitterAuthToken;

    if-eqz p1, :cond_2

    iget-object p1, p1, Lcom/twitter/sdk/android/core/TwitterAuthToken;->token:Ljava/lang/String;

    if-eqz p1, :cond_2

    const-string p1, "oauth_token"

    .line 103
    iget-object p2, p0, Lcom/twitter/sdk/android/core/internal/oauth/OAuth1aParameters;->authToken:Lcom/twitter/sdk/android/core/TwitterAuthToken;

    iget-object p2, p2, Lcom/twitter/sdk/android/core/TwitterAuthToken;->token:Ljava/lang/String;

    invoke-virtual {v1, p1, p2}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    const-string p1, "oauth_version"

    const-string p2, "1.0"

    .line 105
    invoke-virtual {v1, p1, p2}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 108
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0}, Ljava/net/URI;->getScheme()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "://"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/net/URI;->getHost()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/net/URI;->getPath()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 109
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v0, p0, Lcom/twitter/sdk/android/core/internal/oauth/OAuth1aParameters;->method:Ljava/lang/String;

    sget-object v2, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-virtual {v0, v2}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v0, 0x26

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-static {p1}, Lio/fabric/sdk/android/services/network/UrlUtils;->percentEncode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-direct {p0, v1}, Lcom/twitter/sdk/android/core/internal/oauth/OAuth1aParameters;->getEncodedQueryParams(Ljava/util/TreeMap;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 115
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public getAuthorizationHeader()Ljava/lang/String;
    .locals 3

    .line 70
    invoke-direct {p0}, Lcom/twitter/sdk/android/core/internal/oauth/OAuth1aParameters;->getNonce()Ljava/lang/String;

    move-result-object v0

    .line 71
    invoke-direct {p0}, Lcom/twitter/sdk/android/core/internal/oauth/OAuth1aParameters;->getTimestamp()Ljava/lang/String;

    move-result-object v1

    .line 72
    invoke-virtual {p0, v0, v1}, Lcom/twitter/sdk/android/core/internal/oauth/OAuth1aParameters;->constructSignatureBase(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 73
    invoke-virtual {p0, v2}, Lcom/twitter/sdk/android/core/internal/oauth/OAuth1aParameters;->calculateSignature(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 74
    invoke-virtual {p0, v0, v1, v2}, Lcom/twitter/sdk/android/core/internal/oauth/OAuth1aParameters;->constructAuthorizationHeader(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
