.class public Lcom/twitter/sdk/android/core/TwitterApiException;
.super Lcom/twitter/sdk/android/core/TwitterException;
.source "TwitterApiException.java"


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation


# instance fields
.field private final apiError:Lcom/twitter/sdk/android/core/models/ApiError;

.field private final retrofitError:Lretrofit/RetrofitError;

.field private final twitterRateLimit:Lcom/twitter/sdk/android/core/TwitterRateLimit;


# direct methods
.method constructor <init>(Lretrofit/RetrofitError;)V
    .locals 1

    .line 53
    invoke-static {p1}, Lcom/twitter/sdk/android/core/TwitterApiException;->createExceptionMessage(Lretrofit/RetrofitError;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/twitter/sdk/android/core/TwitterException;-><init>(Ljava/lang/String;)V

    .line 54
    invoke-virtual {p1}, Lretrofit/RetrofitError;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/twitter/sdk/android/core/TwitterApiException;->setStackTrace([Ljava/lang/StackTraceElement;)V

    .line 56
    iput-object p1, p0, Lcom/twitter/sdk/android/core/TwitterApiException;->retrofitError:Lretrofit/RetrofitError;

    .line 57
    invoke-static {p1}, Lcom/twitter/sdk/android/core/TwitterApiException;->createRateLimit(Lretrofit/RetrofitError;)Lcom/twitter/sdk/android/core/TwitterRateLimit;

    move-result-object v0

    iput-object v0, p0, Lcom/twitter/sdk/android/core/TwitterApiException;->twitterRateLimit:Lcom/twitter/sdk/android/core/TwitterRateLimit;

    .line 58
    invoke-static {p1}, Lcom/twitter/sdk/android/core/TwitterApiException;->readApiError(Lretrofit/RetrofitError;)Lcom/twitter/sdk/android/core/models/ApiError;

    move-result-object p1

    iput-object p1, p0, Lcom/twitter/sdk/android/core/TwitterApiException;->apiError:Lcom/twitter/sdk/android/core/models/ApiError;

    return-void
.end method

.method public static final convert(Lretrofit/RetrofitError;)Lcom/twitter/sdk/android/core/TwitterApiException;
    .locals 1

    .line 110
    new-instance v0, Lcom/twitter/sdk/android/core/TwitterApiException;

    invoke-direct {v0, p0}, Lcom/twitter/sdk/android/core/TwitterApiException;-><init>(Lretrofit/RetrofitError;)V

    return-object v0
.end method

.method private static createExceptionMessage(Lretrofit/RetrofitError;)Ljava/lang/String;
    .locals 2

    .line 62
    invoke-virtual {p0}, Lretrofit/RetrofitError;->getMessage()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 63
    invoke-virtual {p0}, Lretrofit/RetrofitError;->getMessage()Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 65
    :cond_0
    invoke-virtual {p0}, Lretrofit/RetrofitError;->getResponse()Lretrofit/client/Response;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 66
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Status: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lretrofit/RetrofitError;->getResponse()Lretrofit/client/Response;

    move-result-object p0

    invoke-virtual {p0}, Lretrofit/client/Response;->getStatus()I

    move-result p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_1
    const-string p0, "unknown error"

    return-object p0
.end method

.method private static createRateLimit(Lretrofit/RetrofitError;)Lcom/twitter/sdk/android/core/TwitterRateLimit;
    .locals 1

    .line 72
    invoke-virtual {p0}, Lretrofit/RetrofitError;->getResponse()Lretrofit/client/Response;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 73
    new-instance v0, Lcom/twitter/sdk/android/core/TwitterRateLimit;

    invoke-virtual {p0}, Lretrofit/RetrofitError;->getResponse()Lretrofit/client/Response;

    move-result-object p0

    invoke-virtual {p0}, Lretrofit/client/Response;->getHeaders()Ljava/util/List;

    move-result-object p0

    invoke-direct {v0, p0}, Lcom/twitter/sdk/android/core/TwitterRateLimit;-><init>(Ljava/util/List;)V

    return-object v0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method static parseApiError(Ljava/lang/String;)Lcom/twitter/sdk/android/core/models/ApiError;
    .locals 6

    .line 133
    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    const/4 v1, 0x0

    .line 136
    :try_start_0
    new-instance v2, Lcom/google/gson/JsonParser;

    invoke-direct {v2}, Lcom/google/gson/JsonParser;-><init>()V

    invoke-virtual {v2, p0}, Lcom/google/gson/JsonParser;->parse(Ljava/lang/String;)Lcom/google/gson/JsonElement;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/gson/JsonElement;->getAsJsonObject()Lcom/google/gson/JsonObject;

    move-result-object v2

    const-string v3, "errors"

    .line 137
    invoke-virtual {v2, v3}, Lcom/google/gson/JsonObject;->get(Ljava/lang/String;)Lcom/google/gson/JsonElement;

    move-result-object v2

    const-class v3, [Lcom/twitter/sdk/android/core/models/ApiError;

    instance-of v4, v0, Lcom/google/gson/Gson;

    if-nez v4, :cond_0

    invoke-virtual {v0, v2, v3}, Lcom/google/gson/Gson;->fromJson(Lcom/google/gson/JsonElement;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_0

    :cond_0
    check-cast v0, Lcom/google/gson/Gson;

    invoke-static {v0, v2, v3}, Lcom/newrelic/agent/android/instrumentation/GsonInstrumentation;->fromJson(Lcom/google/gson/Gson;Lcom/google/gson/JsonElement;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    :goto_0
    check-cast v0, [Lcom/twitter/sdk/android/core/models/ApiError;

    .line 139
    array-length v2, v0

    if-nez v2, :cond_1

    return-object v1

    :cond_1
    const/4 v2, 0x0

    .line 143
    aget-object p0, v0, v2
    :try_end_0
    .catch Lcom/google/gson/JsonSyntaxException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception v0

    .line 148
    invoke-static {}, Lio/fabric/sdk/android/Fabric;->getLogger()Lio/fabric/sdk/android/Logger;

    move-result-object v2

    const-string v3, "Twitter"

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Unexpected response: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-interface {v2, v3, p0, v0}, Lio/fabric/sdk/android/Logger;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1

    :catch_1
    move-exception v0

    .line 146
    invoke-static {}, Lio/fabric/sdk/android/Fabric;->getLogger()Lio/fabric/sdk/android/Logger;

    move-result-object v2

    const-string v3, "Twitter"

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Invalid json: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-interface {v2, v3, p0, v0}, Lio/fabric/sdk/android/Logger;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_1
    return-object v1
.end method

.method public static readApiError(Lretrofit/RetrofitError;)Lcom/twitter/sdk/android/core/models/ApiError;
    .locals 4

    const/4 v0, 0x0

    if-eqz p0, :cond_2

    .line 114
    invoke-virtual {p0}, Lretrofit/RetrofitError;->getResponse()Lretrofit/client/Response;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {p0}, Lretrofit/RetrofitError;->getResponse()Lretrofit/client/Response;

    move-result-object v1

    invoke-virtual {v1}, Lretrofit/client/Response;->getBody()Lretrofit/mime/TypedInput;

    move-result-object v1

    if-nez v1, :cond_0

    goto :goto_0

    .line 118
    :cond_0
    invoke-virtual {p0}, Lretrofit/RetrofitError;->getResponse()Lretrofit/client/Response;

    move-result-object p0

    invoke-virtual {p0}, Lretrofit/client/Response;->getBody()Lretrofit/mime/TypedInput;

    move-result-object p0

    check-cast p0, Lretrofit/mime/TypedByteArray;

    invoke-virtual {p0}, Lretrofit/mime/TypedByteArray;->getBytes()[B

    move-result-object p0

    if-nez p0, :cond_1

    return-object v0

    .line 124
    :cond_1
    :try_start_0
    new-instance v1, Ljava/lang/String;

    const-string v2, "UTF-8"

    invoke-direct {v1, p0, v2}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    .line 125
    invoke-static {v1}, Lcom/twitter/sdk/android/core/TwitterApiException;->parseApiError(Ljava/lang/String;)Lcom/twitter/sdk/android/core/models/ApiError;

    move-result-object p0
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    .line 127
    invoke-static {}, Lio/fabric/sdk/android/Fabric;->getLogger()Lio/fabric/sdk/android/Logger;

    move-result-object v1

    const-string v2, "Twitter"

    const-string v3, "Failed to convert to string"

    invoke-interface {v1, v2, v3, p0}, Lio/fabric/sdk/android/Logger;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object v0

    :cond_2
    :goto_0
    return-object v0
.end method


# virtual methods
.method public getErrorCode()I
    .locals 1

    .line 84
    iget-object v0, p0, Lcom/twitter/sdk/android/core/TwitterApiException;->apiError:Lcom/twitter/sdk/android/core/models/ApiError;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/twitter/sdk/android/core/models/ApiError;->getCode()I

    move-result v0

    :goto_0
    return v0
.end method

.method public getRetrofitError()Lretrofit/RetrofitError;
    .locals 1

    .line 102
    iget-object v0, p0, Lcom/twitter/sdk/android/core/TwitterApiException;->retrofitError:Lretrofit/RetrofitError;

    return-object v0
.end method
