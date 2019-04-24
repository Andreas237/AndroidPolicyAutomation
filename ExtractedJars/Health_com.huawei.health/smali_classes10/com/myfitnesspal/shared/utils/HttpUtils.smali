.class public final Lcom/myfitnesspal/shared/utils/HttpUtils;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final makeGetRequest(Ljava/lang/String;)Z
    .locals 1

    .line 25
    const-string v0, "GET"

    invoke-static {v0, p0}, Lcom/myfitnesspal/shared/utils/HttpUtils;->makeRequest(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method private static final makeRequest(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 6

    .line 30
    invoke-static {p0}, Lcom/myfitnesspal/shared/utils/Strings;->isEmpty(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 32
    const-string v0, "No method provided, bail"

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lcom/myfitnesspal/shared/utils/Ln;->d(Ljava/lang/Object;[Ljava/lang/Object;)I

    .line 33
    const/4 v0, 0x0

    return v0

    .line 36
    :cond_0
    invoke-static {p1}, Lcom/myfitnesspal/shared/utils/Strings;->isEmpty(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 38
    const-string v0, "Empty URL string, bail"

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lcom/myfitnesspal/shared/utils/Ln;->d(Ljava/lang/Object;[Ljava/lang/Object;)I

    .line 39
    const/4 v0, 0x0

    return v0

    .line 42
    :cond_1
    const-string v0, "makeRequest: %s %s"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p0, v1, v2

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lcom/myfitnesspal/shared/utils/Ln;->d(Ljava/lang/Object;[Ljava/lang/Object;)I

    .line 47
    :try_start_0
    new-instance v3, Ljava/net/URL;

    invoke-direct {v3, p1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_0

    .line 53
    goto :goto_0

    .line 49
    :catch_0
    move-exception v4

    .line 51
    invoke-static {v4}, Lcom/myfitnesspal/shared/utils/Ln;->e(Ljava/lang/Throwable;)I

    .line 52
    const/4 v0, 0x0

    return v0

    .line 58
    :goto_0
    :try_start_1
    invoke-virtual {v3}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/net/HttpURLConnection;

    .line 59
    invoke-virtual {v4, p0}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    .line 65
    goto :goto_1

    .line 61
    :catch_1
    move-exception v5

    .line 63
    invoke-static {v5}, Lcom/myfitnesspal/shared/utils/Ln;->e(Ljava/lang/Throwable;)I

    .line 64
    const/4 v0, 0x0

    return v0

    .line 67
    :goto_1
    new-instance v5, Lcom/myfitnesspal/shared/utils/HttpUtils$1;

    invoke-direct {v5, v4}, Lcom/myfitnesspal/shared/utils/HttpUtils$1;-><init>(Ljava/net/HttpURLConnection;)V

    .line 120
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Ljava/net/HttpURLConnection;->setDoOutput(Z)V

    .line 121
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Ljava/net/HttpURLConnection;->setDoInput(Z)V

    .line 122
    const/16 v0, 0x3a98

    invoke-virtual {v4, v0}, Ljava/net/HttpURLConnection;->setConnectTimeout(I)V

    .line 123
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/net/HttpURLConnection;

    const/4 v1, 0x0

    aput-object v4, v0, v1

    invoke-virtual {v5, v0}, Landroid/os/AsyncTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 124
    const/4 v0, 0x1

    return v0
.end method
