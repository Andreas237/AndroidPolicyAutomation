.class public final Lcom/huawei/hwCloudJs/service/http/a;
.super Ljava/lang/Object;


# static fields
.field public static final a:Ljava/lang/String; = "POST"

.field public static final b:I = 0x1

.field public static final c:I = 0x2

.field public static final d:I = 0x3

.field public static final e:I = 0xa

.field private static final f:Ljava/lang/String; = "BaseRequest"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private a(Ljava/io/InputStream;)Ljava/lang/String;
    .locals 9

    if-nez p1, :cond_0

    const-string v0, ""

    return-object v0

    :cond_0
    const-string v2, ""

    new-instance v3, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v3}, Ljava/io/ByteArrayOutputStream;-><init>()V

    const/16 v0, 0x400

    new-array v4, v0, [B

    const/4 v5, -0x1

    :goto_0
    :try_start_0
    invoke-virtual {p1, v4}, Ljava/io/InputStream;->read([B)I

    move-result v0

    move v5, v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_1

    const/4 v0, 0x0

    invoke-virtual {v3, v4, v0, v5}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    goto :goto_0

    :cond_1
    const-string v0, "UTF-8"

    invoke-virtual {v3, v0}, Ljava/io/ByteArrayOutputStream;->toString(Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    move-object v2, v0

    :try_start_1
    invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_2

    :catch_0
    move-exception v6

    const-string v0, "BaseRequest"

    const-string v1, "outStream IOException:"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_2

    :catch_1
    move-exception v6

    const-string v0, "BaseRequest"

    const-string v1, "readStream IOException:"

    :try_start_2
    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    goto :goto_2

    :catch_2
    move-exception v6

    const-string v0, "BaseRequest"

    const-string v1, "outStream IOException:"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_2

    :catchall_0
    move-exception v7

    :try_start_4
    invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3

    goto :goto_1

    :catch_3
    move-exception v8

    const-string v0, "BaseRequest"

    const-string v1, "outStream IOException:"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :goto_1
    throw v7

    :goto_2
    return-object v2
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/net/HttpURLConnection;
    .locals 4

    const/4 v2, 0x0

    :try_start_0
    new-instance v3, Ljava/net/URL;

    invoke-direct {v3, p1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    const-string v0, "http://"

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {v3}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v0

    check-cast v0, Ljava/net/HttpURLConnection;

    move-object v2, v0

    goto :goto_0

    :cond_0
    invoke-static {}, Lcom/huawei/hwCloudJs/service/http/c;->a()V

    invoke-virtual {v3}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v0

    check-cast v0, Ljavax/net/ssl/HttpsURLConnection;

    move-object v2, v0

    :goto_0
    invoke-virtual {v2, p2}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Ljava/net/HttpURLConnection;->setDoInput(Z)V

    const-string v0, "POST"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Ljava/net/HttpURLConnection;->setDoOutput(Z)V

    :cond_1
    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Ljava/net/HttpURLConnection;->setUseCaches(Z)V

    const v0, 0xea60

    invoke-virtual {v2, v0}, Ljava/net/HttpURLConnection;->setConnectTimeout(I)V

    const v0, 0xea60

    invoke-virtual {v2, v0}, Ljava/net/HttpURLConnection;->setReadTimeout(I)V

    const-string v0, "Connection"

    const-string v1, "keep-alive"

    invoke-virtual {v2, v0, v1}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "Charset"

    const-string v1, "UTF-8"

    invoke-virtual {v2, v0, v1}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p3, :cond_2

    const-string v0, "Content-Type"

    invoke-virtual {v2, v0, p3}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    :cond_2
    goto :goto_1

    :catch_0
    move-exception v3

    const-string v0, "BaseRequest"

    const-string v1, "getURLConnection MalformedURLException"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_1

    :catch_1
    move-exception v3

    const-string v0, "BaseRequest"

    const-string v1, "getURLConnection IOException"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :goto_1
    return-object v2
.end method


# virtual methods
.method public a(Lcom/huawei/hwCloudJs/service/http/a/c;)Lcom/huawei/hwCloudJs/service/http/a/d;
    .locals 20
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:Lcom/huawei/hwCloudJs/service/http/a/d;>(Lcom/huawei/hwCloudJs/service/http/a/c<TT;>;)TT;"
        }
    .end annotation

    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hwCloudJs/service/http/a/c;->a()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hwCloudJs/service/http/a/c;->g()Lcom/huawei/hwCloudJs/service/http/a/d;

    move-result-object v6

    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hwCloudJs/service/http/a/c;->j()Ljava/lang/String;

    move-result-object v7

    :try_start_0
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hwCloudJs/service/http/a/c;->i()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, p0

    invoke-direct {v1, v3, v7, v0}, Lcom/huawei/hwCloudJs/service/http/a;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/net/HttpURLConnection;

    move-result-object v8

    if-nez v8, :cond_0

    const/16 v0, 0xa

    invoke-virtual {v6, v0}, Lcom/huawei/hwCloudJs/service/http/a/d;->c(I)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v9, v6

    invoke-static {v5}, Lcom/huawei/hwCloudJs/d/f;->a(Ljava/io/Closeable;)V

    invoke-static {v4}, Lcom/huawei/hwCloudJs/d/f;->a(Ljava/io/Closeable;)V

    return-object v9

    :cond_0
    :try_start_1
    invoke-virtual {v8}, Ljava/net/HttpURLConnection;->connect()V

    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hwCloudJs/service/http/a/c;->h()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    new-instance v0, Ljava/io/DataOutputStream;

    invoke-virtual {v8}, Ljava/net/HttpURLConnection;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V

    move-object v4, v0

    const-string v0, "UTF-8"

    invoke-virtual {v9, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/io/DataOutputStream;->write([B)V

    invoke-virtual {v4}, Ljava/io/DataOutputStream;->flush()V

    :cond_1
    invoke-virtual {v8}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v10

    const/16 v0, 0xc8

    if-ne v10, v0, :cond_3

    invoke-virtual {v8}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v0

    move-object v5, v0

    move-object/from16 v0, p0

    invoke-direct {v0, v5}, Lcom/huawei/hwCloudJs/service/http/a;->a(Ljava/io/InputStream;)Ljava/lang/String;

    move-result-object v11

    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Lcom/huawei/hwCloudJs/service/http/a/d;->c(I)V

    invoke-virtual {v6, v10}, Lcom/huawei/hwCloudJs/service/http/a/d;->b(I)V

    new-instance v12, Ljava/util/HashMap;

    invoke-direct {v12}, Ljava/util/HashMap;-><init>()V

    invoke-virtual {v6}, Lcom/huawei/hwCloudJs/service/http/a/d;->c()[Ljava/lang/String;

    move-result-object v13

    array-length v0, v13

    if-lez v0, :cond_2

    move-object v14, v13

    array-length v15, v14

    const/16 v16, 0x0

    :goto_0
    move/from16 v0, v16

    if-ge v0, v15, :cond_2

    aget-object v17, v14, v16

    move-object/from16 v0, v17

    invoke-virtual {v8, v0}, Ljava/net/HttpURLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v18

    move-object/from16 v0, v17

    move-object/from16 v1, v18

    invoke-interface {v12, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v16, v16, 0x1

    goto :goto_0

    :cond_2
    invoke-virtual {v6, v11, v12}, Lcom/huawei/hwCloudJs/service/http/a/d;->a(Ljava/lang/String;Ljava/util/Map;)V

    goto :goto_1

    :cond_3
    const-string v0, "BaseRequest"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "geturl failed"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, 0x2

    invoke-virtual {v6, v0}, Lcom/huawei/hwCloudJs/service/http/a/d;->c(I)V

    invoke-virtual {v6, v10}, Lcom/huawei/hwCloudJs/service/http/a/d;->b(I)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_1
    invoke-static {v5}, Lcom/huawei/hwCloudJs/d/f;->a(Ljava/io/Closeable;)V

    invoke-static {v4}, Lcom/huawei/hwCloudJs/d/f;->a(Ljava/io/Closeable;)V

    goto :goto_2

    :catch_0
    move-exception v8

    const/4 v0, 0x3

    :try_start_2
    invoke-virtual {v6, v0}, Lcom/huawei/hwCloudJs/service/http/a/d;->c(I)V

    const-string v0, "BaseRequest"

    const-string v1, "geturl failed IOException"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    invoke-static {v5}, Lcom/huawei/hwCloudJs/d/f;->a(Ljava/io/Closeable;)V

    invoke-static {v4}, Lcom/huawei/hwCloudJs/d/f;->a(Ljava/io/Closeable;)V

    goto :goto_2

    :catchall_0
    move-exception v19

    invoke-static {v5}, Lcom/huawei/hwCloudJs/d/f;->a(Ljava/io/Closeable;)V

    invoke-static {v4}, Lcom/huawei/hwCloudJs/d/f;->a(Ljava/io/Closeable;)V

    throw v19

    :goto_2
    return-object v6
.end method
