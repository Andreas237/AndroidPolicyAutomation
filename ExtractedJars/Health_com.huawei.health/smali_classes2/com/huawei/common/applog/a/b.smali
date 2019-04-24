.class public Lcom/huawei/common/applog/a/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field static final a:[C

.field private static final b:Ljava/lang/String; = "ReportApi/ReportRequestManage"


# instance fields
.field private c:Ljava/util/concurrent/BlockingQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/BlockingQueue<Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/String;>;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 44
    const/16 v0, 0x10

    new-array v0, v0, [C

    fill-array-data v0, :array_0

    sput-object v0, Lcom/huawei/common/applog/a/b;->a:[C

    return-void

    :array_0
    .array-data 2
        0x30s
        0x31s
        0x32s
        0x33s
        0x34s
        0x35s
        0x36s
        0x37s
        0x38s
        0x39s
        0x61s
        0x62s
        0x63s
        0x64s
        0x65s
        0x66s
    .end array-data
.end method

.method public constructor <init>()V
    .locals 1

    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 47
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/common/applog/a/b;->c:Ljava/util/concurrent/BlockingQueue;

    return-void
.end method

.method public static a([B)Ljava/lang/String;
    .locals 8

    .line 305
    if-nez p0, :cond_0

    .line 306
    const/4 v0, 0x0

    return-object v0

    .line 308
    :cond_0
    new-instance v3, Ljava/lang/StringBuilder;

    array-length v0, p0

    mul-int/lit8 v0, v0, 0x2

    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 309
    move-object v4, p0

    array-length v5, v4

    const/4 v6, 0x0

    :goto_0
    if-ge v6, v5, :cond_1

    aget-byte v7, v4, v6

    .line 310
    sget-object v0, Lcom/huawei/common/applog/a/b;->a:[C

    and-int/lit16 v1, v7, 0xf0

    shr-int/lit8 v1, v1, 0x4

    aget-char v0, v0, v1

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Lcom/huawei/common/applog/a/b;->a:[C

    and-int/lit8 v2, v7, 0xf

    aget-char v1, v1, v2

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 309
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 313
    :cond_1
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private a()Ljava/util/HashMap;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/HashMap<Ljava/lang/String;Ljava/util/ArrayList<Ljava/lang/String;>;>;"
        }
    .end annotation

    .line 88
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 89
    iget-object v0, p0, Lcom/huawei/common/applog/a/b;->c:Ljava/util/concurrent/BlockingQueue;

    invoke-interface {v0}, Ljava/util/concurrent/BlockingQueue;->size()I

    move-result v2

    .line 90
    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_2

    .line 91
    iget-object v0, p0, Lcom/huawei/common/applog/a/b;->c:Ljava/util/concurrent/BlockingQueue;

    invoke-interface {v0}, Ljava/util/concurrent/BlockingQueue;->poll()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/util/HashMap;

    .line 92
    const-string v5, ""

    .line 93
    const-string v6, ""

    .line 94
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    .line 95
    const-string v0, "package_name"

    invoke-virtual {v4, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Ljava/lang/String;

    .line 96
    const-string v0, "msg_value"

    invoke-virtual {v4, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/lang/String;

    .line 98
    :cond_0
    const/4 v7, 0x0

    .line 99
    invoke-virtual {v1, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ljava/util/ArrayList;

    .line 100
    if-nez v7, :cond_1

    .line 101
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 103
    :cond_1
    invoke-virtual {v7, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 104
    invoke-virtual {v1, v5, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 106
    :cond_2
    return-object v1
.end method

.method private a(Landroid/content/Context;ZLjava/lang/String;Ljava/util/ArrayList;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;ZLjava/lang/String;Ljava/util/ArrayList<Ljava/lang/String;>;)V"
        }
    .end annotation

    .line 149
    const/4 v3, 0x0

    .line 150
    const/4 v4, 0x0

    .line 151
    const/4 v5, 0x0

    .line 152
    const/4 v6, 0x0

    .line 153
    const/4 v7, 0x0

    .line 155
    if-eqz p2, :cond_0

    .line 156
    const-string v0, "ReportApi/ReportRequestManage"

    const-string v1, "start http"

    :try_start_0
    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 157
    new-instance v6, Ljava/net/URL;

    const-string v0, "http://opsdata.hicloud.com:8089/sdkv2"

    invoke-direct {v6, v0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 158
    invoke-virtual {v6}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ljava/net/HttpURLConnection;

    goto :goto_0

    .line 160
    :cond_0
    const-string v0, "ReportApi/ReportRequestManage"

    const-string v1, "start https"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 161
    new-instance v6, Ljava/net/URL;

    const-string v0, "https://opsdata.hicloud.com/sdkv2"

    invoke-direct {v6, v0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 162
    invoke-static {}, Lcom/huawei/logupload/c/i;->c()V

    .line 163
    invoke-virtual {v6}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ljavax/net/ssl/HttpsURLConnection;

    .line 165
    :goto_0
    const/4 v0, 0x0

    if-ne v0, v7, :cond_1

    .line 166
    const-string v0, "ReportApi/ReportRequestManage"

    const-string v1, "httpConnection fail empty"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/net/ProtocolException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 203
    const-string v0, "ReportApi/ReportRequestManage"

    invoke-static {v4, v0}, Lcom/huawei/phoneserviceuni/common/e/b;->a(Ljava/io/InputStream;Ljava/lang/String;)V

    .line 204
    const-string v0, "ReportApi/ReportRequestManage"

    invoke-static {v3, v0}, Lcom/huawei/phoneserviceuni/common/e/b;->a(Ljava/io/DataOutputStream;Ljava/lang/String;)V

    .line 205
    invoke-static {}, Lcom/huawei/common/applog/bean/b;->a()Lcom/huawei/common/applog/bean/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/common/applog/bean/b;->e()V

    .line 167
    return-void

    .line 170
    :cond_1
    const-string v0, "POST"

    :try_start_1
    invoke-virtual {v7, v0}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    .line 171
    const/4 v0, 0x1

    invoke-virtual {v7, v0}, Ljava/net/HttpURLConnection;->setDoOutput(Z)V

    .line 172
    const/4 v0, 0x1

    invoke-virtual {v7, v0}, Ljava/net/HttpURLConnection;->setDoInput(Z)V

    .line 174
    const-string v0, "Charset"

    const-string v1, "UTF-8"

    invoke-virtual {v7, v0, v1}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 175
    const-string v0, "Content-Type"

    const-string v1, "application/json"

    invoke-virtual {v7, v0, v1}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 179
    const/16 v0, 0x1388

    invoke-virtual {v7, v0}, Ljava/net/HttpURLConnection;->setConnectTimeout(I)V

    .line 180
    const/16 v0, 0x1388

    invoke-virtual {v7, v0}, Ljava/net/HttpURLConnection;->setReadTimeout(I)V

    .line 181
    invoke-virtual {v7}, Ljava/net/HttpURLConnection;->connect()V

    .line 183
    new-instance v0, Ljava/io/DataOutputStream;

    invoke-virtual {v7}, Ljava/net/HttpURLConnection;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V

    move-object v3, v0

    .line 184
    invoke-direct {p0, p1, p3, p4}, Lcom/huawei/common/applog/a/b;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/ArrayList;)[B

    move-result-object v8

    .line 185
    array-length v0, v8

    if-lez v0, :cond_2

    .line 186
    invoke-virtual {v3, v8}, Ljava/io/DataOutputStream;->write([B)V

    goto :goto_1

    .line 188
    :cond_2
    const-string v0, "ReportApi/ReportRequestManage"

    const-string v1, "requestData is null"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 191
    :goto_1
    invoke-virtual {v3}, Ljava/io/DataOutputStream;->flush()V

    .line 192
    const-string v0, "ReportApi/ReportRequestManage"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "ResponseCode()=="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v7}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 193
    invoke-virtual {v7}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v0

    move-object v4, v0

    .line 194
    invoke-static {v4}, Lcom/huawei/phoneserviceuni/common/e/b;->a(Ljava/io/InputStream;)Ljava/lang/String;

    move-result-object v5

    .line 195
    const-string v0, "ReportApi/ReportRequestManage"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "response =="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->b(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/net/MalformedURLException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/net/ProtocolException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 203
    const-string v0, "ReportApi/ReportRequestManage"

    invoke-static {v4, v0}, Lcom/huawei/phoneserviceuni/common/e/b;->a(Ljava/io/InputStream;Ljava/lang/String;)V

    .line 204
    const-string v0, "ReportApi/ReportRequestManage"

    invoke-static {v3, v0}, Lcom/huawei/phoneserviceuni/common/e/b;->a(Ljava/io/DataOutputStream;Ljava/lang/String;)V

    .line 205
    invoke-static {}, Lcom/huawei/common/applog/bean/b;->a()Lcom/huawei/common/applog/bean/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/common/applog/bean/b;->e()V

    .line 206
    goto :goto_2

    .line 196
    :catch_0
    move-exception v8

    .line 197
    const-string v0, "ReportApi/ReportRequestManage"

    const-string v1, "MalformedURLException"

    :try_start_2
    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 203
    const-string v0, "ReportApi/ReportRequestManage"

    invoke-static {v4, v0}, Lcom/huawei/phoneserviceuni/common/e/b;->a(Ljava/io/InputStream;Ljava/lang/String;)V

    .line 204
    const-string v0, "ReportApi/ReportRequestManage"

    invoke-static {v3, v0}, Lcom/huawei/phoneserviceuni/common/e/b;->a(Ljava/io/DataOutputStream;Ljava/lang/String;)V

    .line 205
    invoke-static {}, Lcom/huawei/common/applog/bean/b;->a()Lcom/huawei/common/applog/bean/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/common/applog/bean/b;->e()V

    .line 206
    goto :goto_2

    .line 198
    :catch_1
    move-exception v8

    .line 199
    const-string v0, "ReportApi/ReportRequestManage"

    const-string v1, "ProtocolException"

    :try_start_3
    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 203
    const-string v0, "ReportApi/ReportRequestManage"

    invoke-static {v4, v0}, Lcom/huawei/phoneserviceuni/common/e/b;->a(Ljava/io/InputStream;Ljava/lang/String;)V

    .line 204
    const-string v0, "ReportApi/ReportRequestManage"

    invoke-static {v3, v0}, Lcom/huawei/phoneserviceuni/common/e/b;->a(Ljava/io/DataOutputStream;Ljava/lang/String;)V

    .line 205
    invoke-static {}, Lcom/huawei/common/applog/bean/b;->a()Lcom/huawei/common/applog/bean/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/common/applog/bean/b;->e()V

    .line 206
    goto :goto_2

    .line 200
    :catch_2
    move-exception v8

    .line 201
    const-string v0, "ReportApi/ReportRequestManage"

    const-string v1, "urlConnection IOException"

    :try_start_4
    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 203
    const-string v0, "ReportApi/ReportRequestManage"

    invoke-static {v4, v0}, Lcom/huawei/phoneserviceuni/common/e/b;->a(Ljava/io/InputStream;Ljava/lang/String;)V

    .line 204
    const-string v0, "ReportApi/ReportRequestManage"

    invoke-static {v3, v0}, Lcom/huawei/phoneserviceuni/common/e/b;->a(Ljava/io/DataOutputStream;Ljava/lang/String;)V

    .line 205
    invoke-static {}, Lcom/huawei/common/applog/bean/b;->a()Lcom/huawei/common/applog/bean/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/common/applog/bean/b;->e()V

    .line 206
    goto :goto_2

    .line 203
    :catchall_0
    move-exception v9

    const-string v0, "ReportApi/ReportRequestManage"

    invoke-static {v4, v0}, Lcom/huawei/phoneserviceuni/common/e/b;->a(Ljava/io/InputStream;Ljava/lang/String;)V

    .line 204
    const-string v0, "ReportApi/ReportRequestManage"

    invoke-static {v3, v0}, Lcom/huawei/phoneserviceuni/common/e/b;->a(Ljava/io/DataOutputStream;Ljava/lang/String;)V

    .line 205
    invoke-static {}, Lcom/huawei/common/applog/bean/b;->a()Lcom/huawei/common/applog/bean/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/common/applog/bean/b;->e()V

    throw v9

    .line 207
    :goto_2
    return-void
.end method

.method private a(Landroid/content/Context;Ljava/lang/String;Ljava/util/ArrayList;)[B
    .locals 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Ljava/lang/String;Ljava/util/ArrayList<Ljava/lang/String;>;)[B"
        }
    .end annotation

    .line 215
    const-string v3, ""

    .line 217
    const-string v4, ""

    .line 219
    new-instance v5, Lorg/json/JSONObject;

    invoke-direct {v5}, Lorg/json/JSONObject;-><init>()V

    .line 221
    new-instance v6, Lorg/json/JSONObject;

    invoke-direct {v6}, Lorg/json/JSONObject;-><init>()V

    .line 223
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 225
    invoke-static {}, Lcom/huawei/phoneserviceuni/common/e/a;->z()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 227
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, ","

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {}, Lcom/huawei/phoneserviceuni/common/e/a;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 229
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, ","

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {}, Lcom/huawei/phoneserviceuni/common/e/a;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 232
    :try_start_0
    new-instance v8, Lorg/json/JSONArray;

    invoke-direct {v8}, Lorg/json/JSONArray;-><init>()V

    .line 234
    const/4 v9, 0x0

    :goto_0
    invoke-virtual/range {p3 .. p3}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v9, v0, :cond_4

    .line 235
    new-instance v10, Lorg/json/JSONObject;

    invoke-direct {v10}, Lorg/json/JSONObject;-><init>()V

    .line 236
    move-object/from16 v0, p3

    invoke-virtual {v0, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Ljava/lang/String;

    .line 237
    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    .line 238
    invoke-static {v11}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 239
    const-string v0, "\\|"

    invoke-virtual {v11, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v13

    .line 249
    array-length v0, v13

    const/4 v1, 0x2

    if-le v0, v1, :cond_2

    .line 250
    const/4 v14, 0x0

    :goto_1
    array-length v0, v13

    if-ge v14, v0, :cond_2

    .line 251
    if-nez v14, :cond_0

    .line 252
    const/4 v0, 0x0

    aget-object v4, v13, v0

    goto :goto_2

    .line 253
    :cond_0
    const/4 v0, 0x1

    if-ne v14, v0, :cond_1

    .line 254
    const/4 v0, 0x1

    aget-object v3, v13, v0

    goto :goto_2

    .line 256
    :cond_1
    aget-object v0, v13, v14

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "|"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 250
    :goto_2
    add-int/lit8 v14, v14, 0x1

    goto :goto_1

    .line 261
    :cond_2
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->deleteCharAt(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    .line 263
    const-string v0, "e"

    invoke-virtual {v10, v0, v11}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 265
    const-string v0, "h"

    invoke-virtual {v10, v0, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 267
    :cond_3
    invoke-virtual {v8, v10}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 234
    add-int/lit8 v9, v9, 0x1

    goto/16 :goto_0

    .line 270
    :cond_4
    const-string v0, "s"

    invoke-virtual {v6, v0, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 272
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, ","

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 274
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, ","

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {}, Lcom/huawei/phoneserviceuni/common/e/a;->l()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 275
    const-string v0, "g"

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v6, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 277
    const-string v0, "tm"

    invoke-static {}, Lcom/huawei/common/applog/a/a;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v6, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 279
    const-string v0, "vs"

    const-string v1, "11"

    invoke-virtual {v5, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 281
    const-string v0, "sn"

    const-string v1, "1"

    invoke-virtual {v5, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 283
    const-string v0, "pn"

    move-object/from16 v1, p2

    invoke-virtual {v5, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 285
    const-string v0, "ed"

    invoke-virtual {v6}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "utf-8"

    invoke-virtual {v1, v2}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v1

    invoke-static {v1}, Lcom/huawei/common/applog/a/b;->b([B)[B

    move-result-object v1

    invoke-static {v1}, Lcom/huawei/common/applog/a/b;->a([B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 287
    const-string v0, "ek"

    const-string v1, ""

    invoke-virtual {v5, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 288
    const-string v0, "ReportApi/ReportRequestManage"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "packData==:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v5}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 291
    invoke-virtual {v5}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "utf-8"

    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v0

    return-object v0

    .line 292
    :catch_0
    move-exception v8

    .line 293
    const-string v0, "ReportApi/ReportRequestManage"

    const-string v1, "packData JSONException:"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 296
    goto :goto_3

    .line 294
    :catch_1
    move-exception v8

    .line 295
    const-string v0, "ReportApi/ReportRequestManage"

    const-string v1, "packData UnsupportedEncodingException:"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 297
    :goto_3
    const/4 v0, 0x0

    new-array v0, v0, [B

    return-object v0
.end method

.method private static b([B)[B
    .locals 10

    .line 117
    const/4 v3, 0x0

    .line 118
    const/4 v4, 0x0

    .line 120
    :try_start_0
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    move-object v3, v0

    .line 121
    new-instance v0, Ljava/util/zip/DeflaterOutputStream;

    invoke-direct {v0, v3}, Ljava/util/zip/DeflaterOutputStream;-><init>(Ljava/io/OutputStream;)V

    move-object v4, v0

    .line 122
    invoke-virtual {v4, p0}, Ljava/util/zip/DeflaterOutputStream;->write([B)V

    .line 123
    invoke-virtual {v4}, Ljava/util/zip/DeflaterOutputStream;->close()V

    .line 124
    invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v5

    .line 129
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    .line 131
    :try_start_1
    invoke-virtual {v4}, Ljava/util/zip/DeflaterOutputStream;->close()V

    .line 132
    invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 135
    goto :goto_0

    .line 133
    :catch_0
    move-exception v6

    .line 134
    const-string v0, "ReportApi/ReportRequestManage"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "packData getZipBts IOException:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 135
    :cond_0
    :goto_0
    return-object v5

    .line 125
    :catch_1
    move-exception v5

    .line 126
    const-string v0, "ReportApi/ReportRequestManage"

    const-string v1, "packData getZipBts IOException"

    :try_start_2
    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 127
    const/4 v0, 0x1

    new-array v6, v0, [B
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 129
    const/4 v0, 0x0

    if-eq v0, v4, :cond_1

    .line 131
    :try_start_3
    invoke-virtual {v4}, Ljava/util/zip/DeflaterOutputStream;->close()V

    .line 132
    invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    .line 135
    goto :goto_1

    .line 133
    :catch_2
    move-exception v7

    .line 134
    const-string v0, "ReportApi/ReportRequestManage"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "packData getZipBts IOException:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 135
    :cond_1
    :goto_1
    return-object v6

    .line 129
    :catchall_0
    move-exception v8

    const/4 v0, 0x0

    if-eq v0, v4, :cond_2

    .line 131
    :try_start_4
    invoke-virtual {v4}, Ljava/util/zip/DeflaterOutputStream;->close()V

    .line 132
    invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3

    .line 135
    goto :goto_2

    .line 133
    :catch_3
    move-exception v9

    .line 134
    const-string v0, "ReportApi/ReportRequestManage"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "packData getZipBts IOException:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 135
    :cond_2
    :goto_2
    throw v8
.end method


# virtual methods
.method public a(Landroid/content/Context;ZZ)V
    .locals 8

    .line 51
    invoke-static {}, Lcom/huawei/common/applog/bean/b;->a()Lcom/huawei/common/applog/bean/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/common/applog/bean/b;->g()Ljava/util/concurrent/BlockingQueue;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/common/applog/a/b;->c:Ljava/util/concurrent/BlockingQueue;

    .line 53
    iget-object v0, p0, Lcom/huawei/common/applog/a/b;->c:Ljava/util/concurrent/BlockingQueue;

    invoke-interface {v0}, Ljava/util/concurrent/BlockingQueue;->size()I

    move-result v0

    if-nez v0, :cond_0

    .line 54
    const-string v0, "ReportApi/ReportRequestManage"

    const-string v1, "reportRequest MessageQueue is empty , timer cancel"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 55
    invoke-static {}, Lcom/huawei/common/applog/bean/b;->a()Lcom/huawei/common/applog/bean/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/common/applog/bean/b;->e()V

    .line 56
    invoke-static {}, Lcom/huawei/common/applog/bean/e;->a()Lcom/huawei/common/applog/bean/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/common/applog/bean/e;->d()V

    .line 57
    return-void

    .line 60
    :cond_0
    invoke-static {p1}, Lcom/huawei/feedback/e;->q(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 61
    invoke-direct {p0}, Lcom/huawei/common/applog/a/b;->a()Ljava/util/HashMap;

    move-result-object v3

    .line 62
    invoke-virtual {v3}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    .line 63
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    .line 64
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 65
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Ljava/util/Map$Entry;

    .line 66
    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/lang/String;

    .line 67
    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ljava/util/ArrayList;

    .line 68
    const/4 v0, 0x0

    if-eq v0, v7, :cond_1

    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 69
    invoke-direct {p0, p1, p2, v6, v7}, Lcom/huawei/common/applog/a/b;->a(Landroid/content/Context;ZLjava/lang/String;Ljava/util/ArrayList;)V

    goto :goto_1

    .line 71
    :cond_1
    const-string v0, "ReportApi/ReportRequestManage"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "reportRequest list is Empty"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 73
    :goto_1
    goto :goto_0

    .line 74
    :cond_2
    goto :goto_2

    .line 76
    :cond_3
    if-eqz p3, :cond_4

    .line 77
    invoke-static {}, Lcom/huawei/common/applog/bean/b;->a()Lcom/huawei/common/applog/bean/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/common/applog/bean/b;->e()V

    .line 79
    :cond_4
    const-string v0, "ReportApi/ReportRequestManage"

    const-string v1, "reportRequest network is not connected"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 81
    :goto_2
    return-void
.end method
