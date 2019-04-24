.class public Lo/fga;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static e:Ljava/util/concurrent/ExecutorService;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;Lo/fft;)V
    .locals 4

    .line 42
    const-string v0, "UIDV_HttpUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "pullRefresh"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 44
    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    const-string v0, ""

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 45
    :cond_0
    const-string v0, "UIDV_HttpUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "url is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 46
    return-void

    .line 49
    :cond_1
    const/4 v0, 0x0

    if-eq v0, p1, :cond_2

    const-string v0, ""

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 50
    :cond_2
    const-string v0, "UIDV_HttpUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "param is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 51
    return-void

    .line 54
    :cond_3
    sget-object v0, Lo/fga;->e:Ljava/util/concurrent/ExecutorService;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    sget-object v0, Lo/fga;->e:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->isShutdown()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 55
    :cond_4
    const-string v0, "UIDV_HttpUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "new executorService"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 56
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    sput-object v0, Lo/fga;->e:Ljava/util/concurrent/ExecutorService;

    .line 58
    :cond_5
    sget-object v0, Lo/fga;->e:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lo/fga$1;

    invoke-direct {v1, p0, p1, p2}, Lo/fga$1;-><init>(Ljava/lang/String;Ljava/lang/String;Lo/fft;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 64
    return-void
.end method

.method static synthetic b(Ljava/lang/String;Ljava/lang/String;Lo/fft;)V
    .locals 0

    .line 27
    invoke-static {p0, p1, p2}, Lo/fga;->e(Ljava/lang/String;Ljava/lang/String;Lo/fft;)V

    return-void
.end method

.method private static c(Ljava/io/InputStreamReader;)Ljava/lang/String;
    .locals 8

    .line 147
    const/16 v0, 0x400

    new-array v5, v0, [C

    .line 148
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 150
    :goto_0
    const/4 v0, 0x0

    const/16 v1, 0x400

    :try_start_0
    invoke-virtual {p0, v5, v0, v1}, Ljava/io/InputStreamReader;->read([CII)I

    move-result v0

    move v4, v0

    const/4 v1, -0x1

    if-eq v1, v0, :cond_0

    .line 151
    const/4 v0, 0x0

    invoke-virtual {v6, v5, v0, v4}, Ljava/lang/StringBuilder;->append([CII)Ljava/lang/StringBuilder;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 155
    :cond_0
    goto :goto_1

    .line 153
    :catch_0
    move-exception v7

    .line 154
    const-string v0, "UIDV_HttpUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "ResourceManagerHelper postRequest result e:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v7}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 156
    :goto_1
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static e(Ljava/lang/String;Ljava/lang/String;Lo/fft;)V
    .locals 14

    .line 74
    const-string v0, "UIDV_HttpUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "doPostReq"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 76
    const/4 v4, -0x1

    .line 77
    const-string v5, ""

    .line 79
    const/4 v6, 0x0

    .line 80
    const/4 v7, 0x0

    .line 81
    const/4 v8, 0x0

    .line 82
    const/4 v9, 0x0

    .line 83
    const/4 v10, 0x0

    .line 84
    const/4 v11, 0x0

    .line 88
    :try_start_0
    new-instance v12, Ljava/net/URL;

    invoke-direct {v12, p0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 89
    const-string v0, "UIDV_HttpUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "url = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 91
    const-string v0, "https"

    invoke-virtual {v12}, Ljava/net/URL;->getProtocol()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {v1, v2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 92
    const-string v0, "UIDV_HttpUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "https"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 93
    invoke-virtual {v12}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v0

    check-cast v0, Ljavax/net/ssl/HttpsURLConnection;

    move-object v6, v0

    .line 94
    move-object v0, v6

    check-cast v0, Ljavax/net/ssl/HttpsURLConnection;

    invoke-static {}, Ljavax/net/ssl/HttpsURLConnection;->getDefaultSSLSocketFactory()Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljavax/net/ssl/HttpsURLConnection;->setSSLSocketFactory(Ljavax/net/ssl/SSLSocketFactory;)V

    .line 95
    move-object v0, v6

    check-cast v0, Ljavax/net/ssl/HttpsURLConnection;

    invoke-static {}, Ljavax/net/ssl/HttpsURLConnection;->getDefaultHostnameVerifier()Ljavax/net/ssl/HostnameVerifier;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljavax/net/ssl/HttpsURLConnection;->setHostnameVerifier(Ljavax/net/ssl/HostnameVerifier;)V

    goto :goto_0

    .line 97
    :cond_0
    invoke-virtual {v12}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v0

    check-cast v0, Ljava/net/HttpURLConnection;

    move-object v6, v0

    .line 100
    :goto_0
    const-string v0, "POST"

    invoke-virtual {v6, v0}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    .line 101
    const-string v0, "Content-Type"

    const-string v1, "application/json"

    invoke-virtual {v6, v0, v1}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 102
    const/4 v0, 0x0

    invoke-virtual {v6, v0}, Ljava/net/HttpURLConnection;->setUseCaches(Z)V

    .line 103
    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Ljava/net/HttpURLConnection;->setDoInput(Z)V

    .line 104
    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Ljava/net/HttpURLConnection;->setDoOutput(Z)V

    .line 105
    const/16 v0, 0x2710

    invoke-virtual {v6, v0}, Ljava/net/HttpURLConnection;->setReadTimeout(I)V

    .line 106
    const/16 v0, 0x2710

    invoke-virtual {v6, v0}, Ljava/net/HttpURLConnection;->setConnectTimeout(I)V

    .line 108
    const-string v0, "UIDV_HttpUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "param = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 110
    const/4 v0, 0x0

    if-eq v0, p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 111
    invoke-virtual {v6}, Ljava/net/HttpURLConnection;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v0

    move-object v11, v0

    .line 112
    new-instance v0, Ljava/io/OutputStreamWriter;

    const-string v1, "UTF-8"

    invoke-direct {v0, v11, v1}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;Ljava/lang/String;)V

    move-object v9, v0

    .line 113
    new-instance v0, Ljava/io/PrintWriter;

    invoke-direct {v0, v9}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;)V

    move-object v7, v0

    .line 115
    invoke-virtual {v7, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 116
    invoke-virtual {v7}, Ljava/io/PrintWriter;->flush()V

    goto :goto_1

    .line 118
    :cond_1
    const-string v0, "UIDV_HttpUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "parm is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 120
    :goto_1
    invoke-virtual {v6}, Ljava/net/HttpURLConnection;->connect()V

    .line 121
    invoke-virtual {v6}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v0

    move v4, v0

    .line 123
    invoke-virtual {v6}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v0

    move-object v10, v0

    .line 124
    new-instance v0, Ljava/io/InputStreamReader;

    const-string v1, "UTF-8"

    invoke-direct {v0, v10, v1}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/lang/String;)V

    move-object v8, v0

    .line 125
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v8}, Lo/fga;->c(Ljava/io/InputStreamReader;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    move-object v5, v0

    .line 126
    const-string v0, "UIDV_HttpUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "result = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 135
    const-string v0, "UIDV_HttpUtil"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "connect resCode = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 136
    invoke-static {v6}, Lo/ffw;->d(Ljava/net/HttpURLConnection;)V

    .line 137
    invoke-static {v9}, Lo/ffw;->a(Ljava/io/OutputStreamWriter;)V

    .line 138
    invoke-static {v7}, Lo/ffw;->e(Ljava/io/PrintWriter;)V

    .line 139
    invoke-static {v8}, Lo/ffw;->b(Ljava/io/InputStreamReader;)V

    .line 140
    invoke-static {v10}, Lo/ffw;->d(Ljava/io/InputStream;)V

    .line 141
    invoke-static {v11}, Lo/ffw;->a(Ljava/io/OutputStream;)V

    .line 142
    move-object/from16 v0, p2

    invoke-interface {v0, v4, v5}, Lo/fft;->e(ILjava/lang/String;)V

    .line 143
    goto/16 :goto_2

    .line 128
    :catch_0
    move-exception v12

    .line 129
    const-string v0, "UIDV_HttpUtil"

    const/4 v1, 0x1

    :try_start_1
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "MalformedURLException :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v12}, Ljava/net/MalformedURLException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 130
    const/4 v4, -0x1

    .line 135
    const-string v0, "UIDV_HttpUtil"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "connect resCode = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 136
    invoke-static {v6}, Lo/ffw;->d(Ljava/net/HttpURLConnection;)V

    .line 137
    invoke-static {v9}, Lo/ffw;->a(Ljava/io/OutputStreamWriter;)V

    .line 138
    invoke-static {v7}, Lo/ffw;->e(Ljava/io/PrintWriter;)V

    .line 139
    invoke-static {v8}, Lo/ffw;->b(Ljava/io/InputStreamReader;)V

    .line 140
    invoke-static {v10}, Lo/ffw;->d(Ljava/io/InputStream;)V

    .line 141
    invoke-static {v11}, Lo/ffw;->a(Ljava/io/OutputStream;)V

    .line 142
    move-object/from16 v0, p2

    invoke-interface {v0, v4, v5}, Lo/fft;->e(ILjava/lang/String;)V

    .line 143
    goto/16 :goto_2

    .line 131
    :catch_1
    move-exception v12

    .line 132
    const-string v0, "UIDV_HttpUtil"

    const/4 v1, 0x1

    :try_start_2
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "IOException :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v12}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 133
    const/4 v4, -0x1

    .line 135
    const-string v0, "UIDV_HttpUtil"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "connect resCode = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 136
    invoke-static {v6}, Lo/ffw;->d(Ljava/net/HttpURLConnection;)V

    .line 137
    invoke-static {v9}, Lo/ffw;->a(Ljava/io/OutputStreamWriter;)V

    .line 138
    invoke-static {v7}, Lo/ffw;->e(Ljava/io/PrintWriter;)V

    .line 139
    invoke-static {v8}, Lo/ffw;->b(Ljava/io/InputStreamReader;)V

    .line 140
    invoke-static {v10}, Lo/ffw;->d(Ljava/io/InputStream;)V

    .line 141
    invoke-static {v11}, Lo/ffw;->a(Ljava/io/OutputStream;)V

    .line 142
    move-object/from16 v0, p2

    invoke-interface {v0, v4, v5}, Lo/fft;->e(ILjava/lang/String;)V

    .line 143
    goto :goto_2

    .line 135
    :catchall_0
    move-exception v13

    const-string v0, "UIDV_HttpUtil"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "connect resCode = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 136
    invoke-static {v6}, Lo/ffw;->d(Ljava/net/HttpURLConnection;)V

    .line 137
    invoke-static {v9}, Lo/ffw;->a(Ljava/io/OutputStreamWriter;)V

    .line 138
    invoke-static {v7}, Lo/ffw;->e(Ljava/io/PrintWriter;)V

    .line 139
    invoke-static {v8}, Lo/ffw;->b(Ljava/io/InputStreamReader;)V

    .line 140
    invoke-static {v10}, Lo/ffw;->d(Ljava/io/InputStream;)V

    .line 141
    invoke-static {v11}, Lo/ffw;->a(Ljava/io/OutputStream;)V

    .line 142
    move-object/from16 v0, p2

    invoke-interface {v0, v4, v5}, Lo/fft;->e(ILjava/lang/String;)V

    .line 143
    throw v13

    .line 144
    :goto_2
    return-void
.end method
