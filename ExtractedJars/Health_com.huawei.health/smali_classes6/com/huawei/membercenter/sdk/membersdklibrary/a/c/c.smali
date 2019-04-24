.class public Lcom/huawei/membercenter/sdk/membersdklibrary/a/c/c;
.super Lcom/huawei/membercenter/sdk/membersdklibrary/a/c/d;
.source "SourceFile"


# instance fields
.field private a:Ljava/lang/String;

.field private b:Landroid/content/Context;

.field private c:Ljava/lang/Object;

.field private d:Z

.field private e:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Object;ZZ)V
    .locals 1

    .line 63
    invoke-direct {p0}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/c/d;-><init>()V

    .line 45
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/membercenter/sdk/membersdklibrary/a/c/c;->a:Ljava/lang/String;

    .line 46
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/membercenter/sdk/membersdklibrary/a/c/c;->b:Landroid/content/Context;

    .line 47
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/membercenter/sdk/membersdklibrary/a/c/c;->c:Ljava/lang/Object;

    .line 48
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/membercenter/sdk/membersdklibrary/a/c/c;->d:Z

    .line 64
    iput-object p1, p0, Lcom/huawei/membercenter/sdk/membersdklibrary/a/c/c;->b:Landroid/content/Context;

    .line 65
    iput-object p2, p0, Lcom/huawei/membercenter/sdk/membersdklibrary/a/c/c;->a:Ljava/lang/String;

    .line 66
    iput-object p3, p0, Lcom/huawei/membercenter/sdk/membersdklibrary/a/c/c;->c:Ljava/lang/Object;

    .line 67
    iput-boolean p4, p0, Lcom/huawei/membercenter/sdk/membersdklibrary/a/c/c;->d:Z

    .line 68
    iput-boolean p5, p0, Lcom/huawei/membercenter/sdk/membersdklibrary/a/c/c;->e:Z

    .line 69
    return-void
.end method

.method private a(Ljava/net/HttpURLConnection;)Lcom/huawei/membercenter/sdk/membersdklibrary/a/c/d$a;
    .locals 8
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "UseSparseArrays"
        }
    .end annotation

    .line 106
    const/4 v2, 0x0

    .line 107
    const/4 v3, 0x0

    .line 108
    new-instance v4, Lcom/huawei/membercenter/sdk/membersdklibrary/a/c/d$a;

    invoke-direct {v4}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/c/d$a;-><init>()V

    .line 112
    :try_start_0
    invoke-direct {p0, p1}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/c/c;->b(Ljava/net/HttpURLConnection;)V

    .line 113
    invoke-direct {p0}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/c/c;->b()Ljava/lang/String;

    move-result-object v5

    .line 114
    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->connect()V

    .line 116
    new-instance v0, Ljava/io/DataOutputStream;

    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V

    move-object v3, v0

    .line 119
    const-string v0, "utf-8"

    invoke-virtual {v5, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/io/DataOutputStream;->write([B)V

    .line 120
    invoke-virtual {v3}, Ljava/io/DataOutputStream;->flush()V

    .line 122
    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v6

    .line 124
    invoke-virtual {v4, v6}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/c/d$a;->a(I)V

    .line 126
    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v0

    move-object v2, v0

    .line 127
    invoke-static {v2}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/h;->a(Ljava/io/InputStream;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/c/d$a;->a(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/net/ProtocolException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_3
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 138
    const-string v0, "NspRequest"

    invoke-static {v2, v0}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/h;->a(Ljava/io/InputStream;Ljava/lang/String;)V

    .line 139
    const-string v0, "NspRequest"

    invoke-static {v3, v0}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/h;->a(Ljava/io/OutputStream;Ljava/lang/String;)V

    .line 140
    goto :goto_0

    .line 128
    :catch_0
    move-exception v5

    .line 129
    const-string v0, "NspRequest"

    :try_start_1
    invoke-static {v5, v0}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/h;->a(Ljava/lang/Exception;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 138
    const-string v0, "NspRequest"

    invoke-static {v2, v0}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/h;->a(Ljava/io/InputStream;Ljava/lang/String;)V

    .line 139
    const-string v0, "NspRequest"

    invoke-static {v3, v0}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/h;->a(Ljava/io/OutputStream;Ljava/lang/String;)V

    .line 140
    goto :goto_0

    .line 130
    :catch_1
    move-exception v5

    .line 131
    const-string v0, "NspRequest"

    :try_start_2
    invoke-static {v5, v0}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/h;->a(Ljava/lang/Exception;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 138
    const-string v0, "NspRequest"

    invoke-static {v2, v0}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/h;->a(Ljava/io/InputStream;Ljava/lang/String;)V

    .line 139
    const-string v0, "NspRequest"

    invoke-static {v3, v0}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/h;->a(Ljava/io/OutputStream;Ljava/lang/String;)V

    .line 140
    goto :goto_0

    .line 132
    :catch_2
    move-exception v5

    .line 133
    const-string v0, "NspRequest"

    :try_start_3
    invoke-static {v5, v0}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/h;->a(Ljava/lang/Exception;Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 138
    const-string v0, "NspRequest"

    invoke-static {v2, v0}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/h;->a(Ljava/io/InputStream;Ljava/lang/String;)V

    .line 139
    const-string v0, "NspRequest"

    invoke-static {v3, v0}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/h;->a(Ljava/io/OutputStream;Ljava/lang/String;)V

    .line 140
    goto :goto_0

    .line 134
    :catch_3
    move-exception v5

    .line 135
    const-string v0, "NspRequest"

    :try_start_4
    invoke-virtual {v5}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/d;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 138
    const-string v0, "NspRequest"

    invoke-static {v2, v0}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/h;->a(Ljava/io/InputStream;Ljava/lang/String;)V

    .line 139
    const-string v0, "NspRequest"

    invoke-static {v3, v0}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/h;->a(Ljava/io/OutputStream;Ljava/lang/String;)V

    .line 140
    goto :goto_0

    .line 138
    :catchall_0
    move-exception v7

    const-string v0, "NspRequest"

    invoke-static {v2, v0}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/h;->a(Ljava/io/InputStream;Ljava/lang/String;)V

    .line 139
    const-string v0, "NspRequest"

    invoke-static {v3, v0}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/h;->a(Ljava/io/OutputStream;Ljava/lang/String;)V

    throw v7

    .line 141
    :goto_0
    return-object v4
.end method

.method private b()Ljava/lang/String;
    .locals 3

    .line 177
    new-instance v1, Lcom/google/gson/Gson;

    invoke-direct {v1}, Lcom/google/gson/Gson;-><init>()V

    .line 178
    iget-object v0, p0, Lcom/huawei/membercenter/sdk/membersdklibrary/a/c/c;->c:Ljava/lang/Object;

    invoke-virtual {v1, v0}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    .line 179
    return-object v2
.end method

.method private b(Ljava/net/HttpURLConnection;)V
    .locals 2

    .line 153
    const-string v0, "POST"

    invoke-virtual {p1, v0}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    .line 154
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Ljava/net/HttpURLConnection;->setDoOutput(Z)V

    .line 155
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Ljava/net/HttpURLConnection;->setDoInput(Z)V

    .line 156
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ljava/net/HttpURLConnection;->setUseCaches(Z)V

    .line 159
    const-string v0, "Connection"

    const-string v1, "keep-alive"

    invoke-virtual {p1, v0, v1}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 160
    const-string v0, "Content-Type"

    const-string v1, "application/json"

    invoke-virtual {p1, v0, v1}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 162
    const/16 v0, 0x7530

    invoke-virtual {p1, v0}, Ljava/net/HttpURLConnection;->setConnectTimeout(I)V

    .line 163
    const/16 v0, 0x7530

    invoke-virtual {p1, v0}, Ljava/net/HttpURLConnection;->setReadTimeout(I)V

    .line 164
    return-void
.end method


# virtual methods
.method public a()Lcom/huawei/membercenter/sdk/membersdklibrary/a/c/d$a;
    .locals 5

    .line 82
    const/4 v2, 0x0

    .line 84
    new-instance v3, Ljava/net/URL;

    iget-object v0, p0, Lcom/huawei/membercenter/sdk/membersdklibrary/a/c/c;->a:Ljava/lang/String;

    invoke-direct {v3, v0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 86
    const-string v0, "https://ccpce-cn.consumer.huawei.com/ccpcmd/services/dispatch"

    const-string v1, "http://"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 88
    const/4 v4, 0x0

    .line 89
    invoke-virtual {v3}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/net/HttpURLConnection;

    .line 90
    invoke-direct {p0, v4}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/c/c;->a(Ljava/net/HttpURLConnection;)Lcom/huawei/membercenter/sdk/membersdklibrary/a/c/d$a;

    move-result-object v2

    .line 91
    goto :goto_0

    :cond_0
    const-string v0, "https://ccpce-cn.consumer.huawei.com/ccpcmd/services/dispatch"

    const-string v1, "https://"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 93
    const/4 v4, 0x0

    .line 95
    invoke-static {}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/c;->a()V

    .line 97
    invoke-virtual {v3}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljavax/net/ssl/HttpsURLConnection;

    .line 98
    invoke-direct {p0, v4}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/c/c;->a(Ljava/net/HttpURLConnection;)Lcom/huawei/membercenter/sdk/membersdklibrary/a/c/d$a;

    move-result-object v2

    .line 101
    :cond_1
    :goto_0
    return-object v2
.end method
