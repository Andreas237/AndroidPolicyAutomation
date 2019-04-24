.class public Lcom/huawei/ui/main/stories/recommendcloud/util/HttpUtil;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final TAG:Ljava/lang/String; = "UIDV_RecommendHttpUtil"

.field private static executorService:Ljava/util/concurrent/ExecutorService; = null


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic access$000(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/ui/main/stories/recommendcloud/service/RecommendCloudHttpCallBack;)V
    .locals 0

    .line 25
    invoke-static {p0, p1, p2}, Lcom/huawei/ui/main/stories/recommendcloud/util/HttpUtil;->doPostReq(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/ui/main/stories/recommendcloud/service/RecommendCloudHttpCallBack;)V

    return-void
.end method

.method private static closeBufferedReader(Ljava/io/BufferedReader;)V
    .locals 5

    .line 179
    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    .line 181
    :try_start_0
    invoke-virtual {p0}, Ljava/io/BufferedReader;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 184
    goto :goto_0

    .line 182
    :catch_0
    move-exception v4

    .line 183
    const-string v0, "UIDV_RecommendHttpUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "IOException :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 187
    :cond_0
    :goto_0
    return-void
.end method

.method private static closeHttpURLConnection(Ljava/net/HttpURLConnection;)V
    .locals 1

    .line 173
    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    .line 174
    invoke-virtual {p0}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 176
    :cond_0
    return-void
.end method

.method private static closeInputStream(Ljava/io/InputStream;)V
    .locals 5

    .line 151
    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    .line 153
    :try_start_0
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 156
    goto :goto_0

    .line 154
    :catch_0
    move-exception v4

    .line 155
    const-string v0, "UIDV_RecommendHttpUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "IOException:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 159
    :cond_0
    :goto_0
    return-void
.end method

.method private static closeInputStreamReader(Ljava/io/InputStreamReader;)V
    .locals 5

    .line 206
    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    .line 208
    :try_start_0
    invoke-virtual {p0}, Ljava/io/InputStreamReader;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 211
    goto :goto_0

    .line 209
    :catch_0
    move-exception v4

    .line 210
    const-string v0, "UIDV_RecommendHttpUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "IOException :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 213
    :cond_0
    :goto_0
    return-void
.end method

.method private static closeOutputStream(Ljava/io/OutputStream;)V
    .locals 5

    .line 162
    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    .line 164
    :try_start_0
    invoke-virtual {p0}, Ljava/io/OutputStream;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 167
    goto :goto_0

    .line 165
    :catch_0
    move-exception v4

    .line 166
    const-string v0, "UIDV_RecommendHttpUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "IOException:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 170
    :cond_0
    :goto_0
    return-void
.end method

.method private static closeOutputStreamWriter(Ljava/io/OutputStreamWriter;)V
    .locals 5

    .line 190
    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    .line 192
    :try_start_0
    invoke-virtual {p0}, Ljava/io/OutputStreamWriter;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 195
    goto :goto_0

    .line 193
    :catch_0
    move-exception v4

    .line 194
    const-string v0, "UIDV_RecommendHttpUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "IOException :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 197
    :cond_0
    :goto_0
    return-void
.end method

.method private static closePrintWriter(Ljava/io/PrintWriter;)V
    .locals 1

    .line 200
    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    .line 201
    invoke-virtual {p0}, Ljava/io/PrintWriter;->close()V

    .line 203
    :cond_0
    return-void
.end method

.method private static doPostReq(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/ui/main/stories/recommendcloud/service/RecommendCloudHttpCallBack;)V
    .locals 19

    .line 71
    const-string v0, "UIDV_RecommendHttpUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "doPostReq"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 73
    const/4 v5, -0x1

    .line 74
    const-string v6, ""

    .line 76
    const/4 v7, 0x0

    .line 77
    const/4 v8, 0x0

    .line 78
    const/4 v9, 0x0

    .line 79
    const/4 v10, 0x0

    .line 80
    const/4 v11, 0x0

    .line 81
    const/4 v12, 0x0

    .line 82
    const/4 v13, 0x0

    .line 86
    :try_start_0
    new-instance v0, Ljava/net/URL;

    move-object/from16 v1, p0

    invoke-direct {v0, v1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    move-object v14, v0

    .line 88
    const-string v0, "UIDV_RecommendHttpUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "url = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 90
    invoke-virtual {v14}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v0

    check-cast v0, Ljavax/net/ssl/HttpsURLConnection;

    move-object v7, v0

    .line 91
    invoke-static {}, Ljavax/net/ssl/HttpsURLConnection;->getDefaultSSLSocketFactory()Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v0

    invoke-virtual {v7, v0}, Ljavax/net/ssl/HttpsURLConnection;->setSSLSocketFactory(Ljavax/net/ssl/SSLSocketFactory;)V

    .line 92
    invoke-static {}, Ljavax/net/ssl/HttpsURLConnection;->getDefaultHostnameVerifier()Ljavax/net/ssl/HostnameVerifier;

    move-result-object v0

    invoke-virtual {v7, v0}, Ljavax/net/ssl/HttpsURLConnection;->setHostnameVerifier(Ljavax/net/ssl/HostnameVerifier;)V

    .line 93
    const-string v0, "POST"

    invoke-virtual {v7, v0}, Ljavax/net/ssl/HttpsURLConnection;->setRequestMethod(Ljava/lang/String;)V

    .line 94
    const-string v0, "UIDV_RecommendHttpUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setRequestMethod"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 95
    const-string v0, "Content-Type"

    const-string v1, "application/json"

    invoke-virtual {v7, v0, v1}, Ljavax/net/ssl/HttpsURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 96
    const/4 v0, 0x0

    invoke-virtual {v7, v0}, Ljavax/net/ssl/HttpsURLConnection;->setUseCaches(Z)V

    .line 97
    const/4 v0, 0x1

    invoke-virtual {v7, v0}, Ljavax/net/ssl/HttpsURLConnection;->setDoInput(Z)V

    .line 98
    const/4 v0, 0x1

    invoke-virtual {v7, v0}, Ljavax/net/ssl/HttpsURLConnection;->setDoOutput(Z)V

    .line 99
    const/16 v0, 0x2710

    invoke-virtual {v7, v0}, Ljavax/net/ssl/HttpsURLConnection;->setReadTimeout(I)V

    .line 100
    const/16 v0, 0x2710

    invoke-virtual {v7, v0}, Ljavax/net/ssl/HttpsURLConnection;->setConnectTimeout(I)V

    .line 102
    const-string v0, "UIDV_RecommendHttpUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "param = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, p1

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 104
    const/4 v0, 0x0

    move-object/from16 v1, p1

    if-eq v0, v1, :cond_0

    invoke-virtual/range {p1 .. p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 105
    invoke-virtual {v7}, Ljavax/net/ssl/HttpsURLConnection;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v0

    move-object v13, v0

    .line 106
    new-instance v0, Ljava/io/OutputStreamWriter;

    const-string v1, "UTF-8"

    invoke-direct {v0, v13, v1}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;Ljava/lang/String;)V

    move-object v11, v0

    .line 107
    const-string v0, "UIDV_RecommendHttpUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "outputStreamWrite = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 108
    new-instance v0, Ljava/io/PrintWriter;

    invoke-direct {v0, v11}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;)V

    move-object v8, v0

    .line 110
    move-object/from16 v0, p1

    invoke-virtual {v8, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 111
    invoke-virtual {v8}, Ljava/io/PrintWriter;->flush()V

    goto :goto_0

    .line 113
    :cond_0
    const-string v0, "UIDV_RecommendHttpUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "parm is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 115
    :goto_0
    invoke-virtual {v7}, Ljavax/net/ssl/HttpsURLConnection;->connect()V

    .line 116
    invoke-virtual {v7}, Ljavax/net/ssl/HttpsURLConnection;->getResponseCode()I

    move-result v0

    move v5, v0

    .line 117
    const-string v0, "UIDV_RecommendHttpUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getResponseCode end"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 118
    const-string v0, "UIDV_RecommendHttpUtil"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "connect code = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 120
    invoke-virtual {v7}, Ljavax/net/ssl/HttpsURLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v0

    move-object v12, v0

    .line 121
    new-instance v0, Ljava/io/InputStreamReader;

    const-string v1, "UTF-8"

    invoke-direct {v0, v12, v1}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/lang/String;)V

    move-object v10, v0

    .line 122
    new-instance v0, Ljava/io/BufferedReader;

    invoke-direct {v0, v10}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    move-object v9, v0

    .line 123
    new-instance v15, Ljava/lang/StringBuffer;

    invoke-direct {v15}, Ljava/lang/StringBuffer;-><init>()V

    .line 125
    const/16 v0, 0x400

    new-array v0, v0, [B

    move-object/from16 v17, v0

    .line 126
    :goto_1
    move-object/from16 v0, v17

    invoke-virtual {v12, v0}, Ljava/io/InputStream;->read([B)I

    move-result v0

    move/from16 v16, v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_1

    .line 127
    new-instance v0, Ljava/lang/String;

    const-string v1, "UTF-8"

    move-object/from16 v2, v17

    const/4 v3, 0x0

    move/from16 v4, v16

    invoke-direct {v0, v2, v3, v4, v1}, Ljava/lang/String;-><init>([BIILjava/lang/String;)V

    invoke-virtual {v15, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    goto :goto_1

    .line 129
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v15}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    move-object v6, v0

    .line 130
    const-string v0, "UIDV_RecommendHttpUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "result = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

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

    .line 139
    invoke-static {v7}, Lcom/huawei/ui/main/stories/recommendcloud/util/HttpUtil;->closeHttpURLConnection(Ljava/net/HttpURLConnection;)V

    .line 140
    invoke-static {v9}, Lcom/huawei/ui/main/stories/recommendcloud/util/HttpUtil;->closeBufferedReader(Ljava/io/BufferedReader;)V

    .line 141
    invoke-static {v11}, Lcom/huawei/ui/main/stories/recommendcloud/util/HttpUtil;->closeOutputStreamWriter(Ljava/io/OutputStreamWriter;)V

    .line 142
    invoke-static {v8}, Lcom/huawei/ui/main/stories/recommendcloud/util/HttpUtil;->closePrintWriter(Ljava/io/PrintWriter;)V

    .line 143
    invoke-static {v10}, Lcom/huawei/ui/main/stories/recommendcloud/util/HttpUtil;->closeInputStreamReader(Ljava/io/InputStreamReader;)V

    .line 144
    invoke-static {v12}, Lcom/huawei/ui/main/stories/recommendcloud/util/HttpUtil;->closeInputStream(Ljava/io/InputStream;)V

    .line 145
    invoke-static {v13}, Lcom/huawei/ui/main/stories/recommendcloud/util/HttpUtil;->closeOutputStream(Ljava/io/OutputStream;)V

    .line 146
    move-object/from16 v0, p2

    invoke-interface {v0, v5, v6}, Lcom/huawei/ui/main/stories/recommendcloud/service/RecommendCloudHttpCallBack;->onResponce(ILjava/lang/String;)V

    .line 147
    goto/16 :goto_2

    .line 132
    :catch_0
    move-exception v14

    .line 133
    const-string v0, "UIDV_RecommendHttpUtil"

    const/4 v1, 0x1

    :try_start_1
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "MalformedURLException :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v14}, Ljava/net/MalformedURLException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 134
    const/4 v5, -0x1

    .line 139
    invoke-static {v7}, Lcom/huawei/ui/main/stories/recommendcloud/util/HttpUtil;->closeHttpURLConnection(Ljava/net/HttpURLConnection;)V

    .line 140
    invoke-static {v9}, Lcom/huawei/ui/main/stories/recommendcloud/util/HttpUtil;->closeBufferedReader(Ljava/io/BufferedReader;)V

    .line 141
    invoke-static {v11}, Lcom/huawei/ui/main/stories/recommendcloud/util/HttpUtil;->closeOutputStreamWriter(Ljava/io/OutputStreamWriter;)V

    .line 142
    invoke-static {v8}, Lcom/huawei/ui/main/stories/recommendcloud/util/HttpUtil;->closePrintWriter(Ljava/io/PrintWriter;)V

    .line 143
    invoke-static {v10}, Lcom/huawei/ui/main/stories/recommendcloud/util/HttpUtil;->closeInputStreamReader(Ljava/io/InputStreamReader;)V

    .line 144
    invoke-static {v12}, Lcom/huawei/ui/main/stories/recommendcloud/util/HttpUtil;->closeInputStream(Ljava/io/InputStream;)V

    .line 145
    invoke-static {v13}, Lcom/huawei/ui/main/stories/recommendcloud/util/HttpUtil;->closeOutputStream(Ljava/io/OutputStream;)V

    .line 146
    move-object/from16 v0, p2

    invoke-interface {v0, v5, v6}, Lcom/huawei/ui/main/stories/recommendcloud/service/RecommendCloudHttpCallBack;->onResponce(ILjava/lang/String;)V

    .line 147
    goto/16 :goto_2

    .line 135
    :catch_1
    move-exception v14

    .line 136
    const-string v0, "UIDV_RecommendHttpUtil"

    const/4 v1, 0x1

    :try_start_2
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "IOException :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v14}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 137
    const/4 v5, -0x1

    .line 139
    invoke-static {v7}, Lcom/huawei/ui/main/stories/recommendcloud/util/HttpUtil;->closeHttpURLConnection(Ljava/net/HttpURLConnection;)V

    .line 140
    invoke-static {v9}, Lcom/huawei/ui/main/stories/recommendcloud/util/HttpUtil;->closeBufferedReader(Ljava/io/BufferedReader;)V

    .line 141
    invoke-static {v11}, Lcom/huawei/ui/main/stories/recommendcloud/util/HttpUtil;->closeOutputStreamWriter(Ljava/io/OutputStreamWriter;)V

    .line 142
    invoke-static {v8}, Lcom/huawei/ui/main/stories/recommendcloud/util/HttpUtil;->closePrintWriter(Ljava/io/PrintWriter;)V

    .line 143
    invoke-static {v10}, Lcom/huawei/ui/main/stories/recommendcloud/util/HttpUtil;->closeInputStreamReader(Ljava/io/InputStreamReader;)V

    .line 144
    invoke-static {v12}, Lcom/huawei/ui/main/stories/recommendcloud/util/HttpUtil;->closeInputStream(Ljava/io/InputStream;)V

    .line 145
    invoke-static {v13}, Lcom/huawei/ui/main/stories/recommendcloud/util/HttpUtil;->closeOutputStream(Ljava/io/OutputStream;)V

    .line 146
    move-object/from16 v0, p2

    invoke-interface {v0, v5, v6}, Lcom/huawei/ui/main/stories/recommendcloud/service/RecommendCloudHttpCallBack;->onResponce(ILjava/lang/String;)V

    .line 147
    goto :goto_2

    .line 139
    :catchall_0
    move-exception v18

    invoke-static {v7}, Lcom/huawei/ui/main/stories/recommendcloud/util/HttpUtil;->closeHttpURLConnection(Ljava/net/HttpURLConnection;)V

    .line 140
    invoke-static {v9}, Lcom/huawei/ui/main/stories/recommendcloud/util/HttpUtil;->closeBufferedReader(Ljava/io/BufferedReader;)V

    .line 141
    invoke-static {v11}, Lcom/huawei/ui/main/stories/recommendcloud/util/HttpUtil;->closeOutputStreamWriter(Ljava/io/OutputStreamWriter;)V

    .line 142
    invoke-static {v8}, Lcom/huawei/ui/main/stories/recommendcloud/util/HttpUtil;->closePrintWriter(Ljava/io/PrintWriter;)V

    .line 143
    invoke-static {v10}, Lcom/huawei/ui/main/stories/recommendcloud/util/HttpUtil;->closeInputStreamReader(Ljava/io/InputStreamReader;)V

    .line 144
    invoke-static {v12}, Lcom/huawei/ui/main/stories/recommendcloud/util/HttpUtil;->closeInputStream(Ljava/io/InputStream;)V

    .line 145
    invoke-static {v13}, Lcom/huawei/ui/main/stories/recommendcloud/util/HttpUtil;->closeOutputStream(Ljava/io/OutputStream;)V

    .line 146
    move-object/from16 v0, p2

    invoke-interface {v0, v5, v6}, Lcom/huawei/ui/main/stories/recommendcloud/service/RecommendCloudHttpCallBack;->onResponce(ILjava/lang/String;)V

    .line 147
    throw v18

    .line 148
    :goto_2
    return-void
.end method

.method public static doRefresh(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/ui/main/stories/recommendcloud/service/RecommendCloudHttpCallBack;)V
    .locals 4

    .line 39
    const-string v0, "UIDV_RecommendHttpUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "pullRefresh"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 41
    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    const-string v0, ""

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 42
    :cond_0
    const-string v0, "UIDV_RecommendHttpUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "url is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 43
    return-void

    .line 46
    :cond_1
    const/4 v0, 0x0

    if-eq v0, p1, :cond_2

    const-string v0, ""

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 47
    :cond_2
    const-string v0, "UIDV_RecommendHttpUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "param is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 48
    return-void

    .line 51
    :cond_3
    sget-object v0, Lcom/huawei/ui/main/stories/recommendcloud/util/HttpUtil;->executorService:Ljava/util/concurrent/ExecutorService;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    sget-object v0, Lcom/huawei/ui/main/stories/recommendcloud/util/HttpUtil;->executorService:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->isShutdown()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 52
    :cond_4
    const-string v0, "UIDV_RecommendHttpUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "new executorService"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 53
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    sput-object v0, Lcom/huawei/ui/main/stories/recommendcloud/util/HttpUtil;->executorService:Ljava/util/concurrent/ExecutorService;

    .line 55
    :cond_5
    sget-object v0, Lcom/huawei/ui/main/stories/recommendcloud/util/HttpUtil;->executorService:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/huawei/ui/main/stories/recommendcloud/util/HttpUtil$5;

    invoke-direct {v1, p0, p1, p2}, Lcom/huawei/ui/main/stories/recommendcloud/util/HttpUtil$5;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/ui/main/stories/recommendcloud/service/RecommendCloudHttpCallBack;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 61
    return-void
.end method
