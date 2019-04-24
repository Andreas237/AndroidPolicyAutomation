.class public final Lcom/ibotta/api/HttpHeaders;
.super Ljava/lang/Object;
.source "HttpHeaders.java"


# static fields
.field private static final APP_VERSION_FORMAT:Ljava/lang/String; = "%1$s:%2$s:%3$s_%4$s"

.field private static final FORMAT_BEARER:Ljava/lang/String; = "Bearer %1$s"

.field private static final FORMAT_DEVICE_IDS:Ljava/lang/String; = "%1$s,%2$s"

.field private static final HASH_FORMAT:Ljava/lang/String; = "%1$s:%2$s"

.field public static final HEADER_AUTH_TOKEN:Ljava/lang/String; = "Authorization"

.field public static final HEADER_CONTENT_DISPOSITION:Ljava/lang/String; = "Content-Disposition"

.field public static final HEADER_CONTENT_ORDER_SEED:Ljava/lang/String; = "Content-Order-Seed"

.field public static final HEADER_IF_MODIFIED_SINCE:Ljava/lang/String; = "If-Modified-Since"

.field public static final HEADER_LAST_MODIFIED:Ljava/lang/String; = "Last-Modified"

.field public static final HEADER_LOCATION:Ljava/lang/String; = "Location"

.field public static final HEADER_USER_AGENT:Ljava/lang/String; = "User-Agent"

.field public static final HEADER_X_APPS_FLYER_ID:Ljava/lang/String; = "X-AppsFlyer-Id"

.field public static final HEADER_X_APP_TOKEN:Ljava/lang/String; = "X-App-Token"

.field public static final HEADER_X_APP_VERSION:Ljava/lang/String; = "X-App-Version"

.field public static final HEADER_X_DEVICE_ID:Ljava/lang/String; = "X-Device-Id"

.field public static final HEADER_X_LOCATION:Ljava/lang/String; = "X-Location"

.field private static final SIGNATURE_FORMAT:Ljava/lang/String; = "%1$s:%2$s:%3$s"


# instance fields
.field private final apiContext:Lcom/ibotta/api/ApiContext;


# direct methods
.method public constructor <init>(Lcom/ibotta/api/ApiContext;)V
    .locals 0

    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    iput-object p1, p0, Lcom/ibotta/api/HttpHeaders;->apiContext:Lcom/ibotta/api/ApiContext;

    return-void
.end method

.method private getHash(Ljava/lang/String;Ljava/lang/String;J)Ljava/lang/String;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation

    .line 126
    invoke-virtual {p2}, Ljava/lang/String;->getBytes()[B

    move-result-object p2

    .line 127
    new-instance v0, Ljavax/crypto/spec/SecretKeySpec;

    const-string v1, "HmacSHA1"

    invoke-direct {v0, p2, v1}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    .line 131
    :try_start_0
    iget-object p2, p0, Lcom/ibotta/api/HttpHeaders;->apiContext:Lcom/ibotta/api/ApiContext;

    invoke-virtual {p2}, Lcom/ibotta/api/ApiContext;->getApiFormatting()Lcom/ibotta/api/ApiFormatting;

    move-result-object p2

    const-string v1, "%1$s:%2$s"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    const/4 p1, 0x1

    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p3

    aput-object p3, v2, p1

    invoke-interface {p2, v1, v2}, Lcom/ibotta/api/ApiFormatting;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "HmacSHA1"

    .line 132
    invoke-static {p2}, Ljavax/crypto/Mac;->getInstance(Ljava/lang/String;)Ljavax/crypto/Mac;

    move-result-object p2

    .line 133
    invoke-virtual {p2, v0}, Ljavax/crypto/Mac;->init(Ljava/security/Key;)V

    .line 134
    invoke-virtual {p1}, Ljava/lang/String;->getBytes()[B

    move-result-object p1

    .line 135
    new-instance p3, Ljava/lang/String;

    invoke-virtual {p2, p1}, Ljavax/crypto/Mac;->doFinal([B)[B

    move-result-object p1

    invoke-static {p1}, Lorg/apache/commons/codec/binary/Hex;->encodeHex([B)[C

    move-result-object p1

    invoke-direct {p3, p1}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {p3}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/security/InvalidKeyException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    .line 139
    new-instance p2, Lcom/ibotta/api/ApiException;

    const-string p3, "Invalid key."

    invoke-direct {p2, p3, p1}, Lcom/ibotta/api/ApiException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2

    :catch_1
    move-exception p1

    .line 137
    new-instance p2, Lcom/ibotta/api/ApiException;

    const-string p3, "Failed to hash key."

    invoke-direct {p2, p3, p1}, Lcom/ibotta/api/ApiException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2
.end method

.method private getSignature(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation

    .line 119
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    div-long/2addr v0, v2

    .line 120
    iget-object v2, p0, Lcom/ibotta/api/HttpHeaders;->apiContext:Lcom/ibotta/api/ApiContext;

    invoke-virtual {v2}, Lcom/ibotta/api/ApiContext;->getApiFormatting()Lcom/ibotta/api/ApiFormatting;

    move-result-object v2

    const-string v3, "%1$s:%2$s:%3$s"

    const/4 v4, 0x3

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    aput-object p1, v4, v5

    .line 121
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    const/4 v6, 0x1

    aput-object v5, v4, v6

    invoke-direct {p0, p1, p2, v0, v1}, Lcom/ibotta/api/HttpHeaders;->getHash(Ljava/lang/String;Ljava/lang/String;J)Ljava/lang/String;

    move-result-object p1

    const/4 p2, 0x2

    aput-object p1, v4, p2

    .line 120
    invoke-interface {v2, v3, v4}, Lcom/ibotta/api/ApiFormatting;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public getAppToken()Ljava/lang/String;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation

    .line 45
    iget-object v0, p0, Lcom/ibotta/api/HttpHeaders;->apiContext:Lcom/ibotta/api/ApiContext;

    invoke-virtual {v0}, Lcom/ibotta/api/ApiContext;->getKey()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/api/HttpHeaders;->apiContext:Lcom/ibotta/api/ApiContext;

    invoke-virtual {v1}, Lcom/ibotta/api/ApiContext;->getSecret()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/ibotta/api/HttpHeaders;->getSignature(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getAppVersion()Ljava/lang/String;
    .locals 9

    .line 73
    iget-object v0, p0, Lcom/ibotta/api/HttpHeaders;->apiContext:Lcom/ibotta/api/ApiContext;

    invoke-virtual {v0}, Lcom/ibotta/api/ApiContext;->getAppVersion()Ljava/lang/String;

    move-result-object v0

    .line 74
    iget-object v1, p0, Lcom/ibotta/api/HttpHeaders;->apiContext:Lcom/ibotta/api/ApiContext;

    invoke-virtual {v1}, Lcom/ibotta/api/ApiContext;->getPlatform()Ljava/lang/String;

    move-result-object v1

    .line 75
    iget-object v2, p0, Lcom/ibotta/api/HttpHeaders;->apiContext:Lcom/ibotta/api/ApiContext;

    invoke-virtual {v2}, Lcom/ibotta/api/ApiContext;->getModelNumber()Ljava/lang/String;

    move-result-object v2

    .line 76
    iget-object v3, p0, Lcom/ibotta/api/HttpHeaders;->apiContext:Lcom/ibotta/api/ApiContext;

    invoke-virtual {v3}, Lcom/ibotta/api/ApiContext;->getOsVersion()Ljava/lang/String;

    move-result-object v3

    .line 77
    iget-object v4, p0, Lcom/ibotta/api/HttpHeaders;->apiContext:Lcom/ibotta/api/ApiContext;

    invoke-virtual {v4}, Lcom/ibotta/api/ApiContext;->isRooted()Z

    move-result v4

    .line 78
    iget-object v5, p0, Lcom/ibotta/api/HttpHeaders;->apiContext:Lcom/ibotta/api/ApiContext;

    invoke-virtual {v5}, Lcom/ibotta/api/ApiContext;->isEmulator()Z

    move-result v5

    const/16 v6, 0x3a

    const/16 v7, 0x5f

    const/16 v8, 0x20

    if-eqz v0, :cond_0

    .line 81
    invoke-virtual {v0, v7, v8}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v6, v8}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v0

    :cond_0
    if-eqz v1, :cond_1

    .line 84
    invoke-virtual {v1, v7, v8}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, v6, v8}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v1

    :cond_1
    if-eqz v2, :cond_2

    .line 87
    invoke-virtual {v2, v7, v8}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2, v6, v8}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v2

    :cond_2
    if-eqz v3, :cond_3

    .line 90
    invoke-virtual {v3, v7, v8}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3, v6, v8}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v3

    :cond_3
    if-eqz v4, :cond_4

    .line 93
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "_rooted"

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    :cond_4
    if-eqz v5, :cond_5

    .line 96
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "_emulator"

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 100
    :cond_5
    iget-object v4, p0, Lcom/ibotta/api/HttpHeaders;->apiContext:Lcom/ibotta/api/ApiContext;

    invoke-virtual {v4}, Lcom/ibotta/api/ApiContext;->getApiFormatting()Lcom/ibotta/api/ApiFormatting;

    move-result-object v4

    const-string v5, "%1$s:%2$s:%3$s_%4$s"

    const/4 v6, 0x4

    new-array v6, v6, [Ljava/lang/Object;

    const/4 v7, 0x0

    aput-object v0, v6, v7

    const/4 v0, 0x1

    aput-object v1, v6, v0

    const/4 v1, 0x2

    aput-object v2, v6, v1

    const/4 v1, 0x3

    aput-object v3, v6, v1

    invoke-interface {v4, v5, v6}, Lcom/ibotta/api/ApiFormatting;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 101
    sget-object v2, Lcom/ibotta/android/logging/IbottaLogger;->Log:Lcom/ibotta/android/logging/Logger;

    const-string v3, "App Version: %1$s"

    new-array v0, v0, [Ljava/lang/Object;

    aput-object v1, v0, v7

    invoke-interface {v2, v3, v0}, Lcom/ibotta/android/logging/Logger;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    return-object v1
.end method

.method public getAppsFlyerId()Ljava/lang/String;
    .locals 1

    .line 107
    iget-object v0, p0, Lcom/ibotta/api/HttpHeaders;->apiContext:Lcom/ibotta/api/ApiContext;

    invoke-virtual {v0}, Lcom/ibotta/api/ApiContext;->getAppsFlyerUID()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getBearer()Ljava/lang/String;
    .locals 5

    .line 111
    iget-object v0, p0, Lcom/ibotta/api/HttpHeaders;->apiContext:Lcom/ibotta/api/ApiContext;

    invoke-virtual {v0}, Lcom/ibotta/api/ApiContext;->getApiFormatting()Lcom/ibotta/api/ApiFormatting;

    move-result-object v0

    const-string v1, "Bearer %1$s"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/ibotta/api/HttpHeaders;->apiContext:Lcom/ibotta/api/ApiContext;

    invoke-virtual {v3}, Lcom/ibotta/api/ApiContext;->getApiAuthManager()Lcom/ibotta/api/auth/ApiAuthManager;

    move-result-object v3

    invoke-interface {v3}, Lcom/ibotta/api/auth/ApiAuthManager;->getAuthToken()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-interface {v0, v1, v2}, Lcom/ibotta/api/ApiFormatting;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getDeviceId()Ljava/lang/String;
    .locals 8

    .line 49
    iget-object v0, p0, Lcom/ibotta/api/HttpHeaders;->apiContext:Lcom/ibotta/api/ApiContext;

    invoke-virtual {v0}, Lcom/ibotta/api/ApiContext;->getDevicePrivateId()Ljava/lang/String;

    move-result-object v0

    .line 50
    iget-object v1, p0, Lcom/ibotta/api/HttpHeaders;->apiContext:Lcom/ibotta/api/ApiContext;

    invoke-virtual {v1}, Lcom/ibotta/api/ApiContext;->getDevicePublicId()Ljava/lang/String;

    move-result-object v1

    if-nez v0, :cond_1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    if-nez v0, :cond_2

    const-string v0, ""

    :cond_2
    if-nez v1, :cond_3

    const-string v1, ""

    .line 60
    :cond_3
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    .line 61
    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    .line 63
    iget-object v2, p0, Lcom/ibotta/api/HttpHeaders;->apiContext:Lcom/ibotta/api/ApiContext;

    invoke-virtual {v2}, Lcom/ibotta/api/ApiContext;->getApiFormatting()Lcom/ibotta/api/ApiFormatting;

    move-result-object v2

    const-string v3, "%1$s,%2$s"

    const/4 v4, 0x2

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    aput-object v0, v4, v5

    const/4 v6, 0x1

    aput-object v1, v4, v6

    invoke-interface {v2, v3, v4}, Lcom/ibotta/api/ApiFormatting;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    .line 65
    sget-object v3, Lcom/ibotta/android/logging/IbottaLogger;->Log:Lcom/ibotta/android/logging/Logger;

    const-string v4, "Device private ID: %1$s"

    new-array v7, v6, [Ljava/lang/Object;

    aput-object v0, v7, v5

    invoke-interface {v3, v4, v7}, Lcom/ibotta/android/logging/Logger;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 66
    sget-object v0, Lcom/ibotta/android/logging/IbottaLogger;->Log:Lcom/ibotta/android/logging/Logger;

    const-string v3, "Device public ID: %1$s"

    new-array v4, v6, [Ljava/lang/Object;

    aput-object v1, v4, v5

    invoke-interface {v0, v3, v4}, Lcom/ibotta/android/logging/Logger;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    move-object v0, v2

    :goto_1
    return-object v0
.end method

.method public getUserLocation()Ljava/lang/String;
    .locals 1

    .line 115
    iget-object v0, p0, Lcom/ibotta/api/HttpHeaders;->apiContext:Lcom/ibotta/api/ApiContext;

    invoke-virtual {v0}, Lcom/ibotta/api/ApiContext;->getUserLocation()Lcom/ibotta/api/UserLocation;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/api/UserLocation;->getHeaderValue()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
