.class public Lcom/huawei/hwid/update/b/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwid/update/b/c;


# instance fields
.field private a:Ljava/net/HttpURLConnection;

.field private volatile b:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 52
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 53
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/hwid/update/b/b;->b:I

    .line 54
    return-void
.end method

.method private a(Ljava/io/InputStream;Ljava/io/OutputStream;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lcom/huawei/hwid/update/b/a;
        }
    .end annotation

    .line 214
    const/16 v0, 0x1000

    new-array v2, v0, [B

    .line 216
    const/4 v3, 0x0

    .line 217
    :cond_0
    invoke-virtual {p1, v2}, Ljava/io/InputStream;->read([B)I

    move-result v0

    move v3, v0

    const/4 v1, -0x1

    if-eq v1, v0, :cond_1

    .line 218
    const/4 v0, 0x0

    invoke-virtual {p2, v2, v0, v3}, Ljava/io/OutputStream;->write([BII)V

    .line 220
    iget v0, p0, Lcom/huawei/hwid/update/b/b;->b:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 221
    new-instance v0, Lcom/huawei/hwid/update/b/a;

    const-string v1, "HTTP(s) request was canceled."

    invoke-direct {v0, v1}, Lcom/huawei/hwid/update/b/a;-><init>(Ljava/lang/String;)V

    throw v0

    .line 224
    :cond_1
    return-void
.end method

.method private a(Ljava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 180
    iget v0, p0, Lcom/huawei/hwid/update/b/b;->b:I

    if-nez v0, :cond_0

    .line 181
    const-string v0, "HttpRequestHelper"

    const-string v1, "Not allowed to repeat open http(s) connection."

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 184
    :cond_0
    new-instance v0, Ljava/net/URL;

    invoke-direct {v0, p1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v0

    check-cast v0, Ljava/net/HttpURLConnection;

    iput-object v0, p0, Lcom/huawei/hwid/update/b/b;->a:Ljava/net/HttpURLConnection;

    .line 186
    iget-object v0, p0, Lcom/huawei/hwid/update/b/b;->a:Ljava/net/HttpURLConnection;

    instance-of v0, v0, Ljavax/net/ssl/HttpsURLConnection;

    if-eqz v0, :cond_1

    .line 187
    invoke-static {}, Lcom/huawei/hwid/vermanager/VersionManager;->e()Lcom/huawei/hwid/vermanager/VersionManager;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwid/update/b/b;->a:Ljava/net/HttpURLConnection;

    check-cast v1, Ljavax/net/ssl/HttpsURLConnection;

    invoke-virtual {v0, v1}, Lcom/huawei/hwid/vermanager/VersionManager;->a(Ljavax/net/ssl/HttpsURLConnection;)V

    .line 190
    :cond_1
    iget-object v0, p0, Lcom/huawei/hwid/update/b/b;->a:Ljava/net/HttpURLConnection;

    const/16 v1, 0x7530

    invoke-virtual {v0, v1}, Ljava/net/HttpURLConnection;->setConnectTimeout(I)V

    .line 191
    iget-object v0, p0, Lcom/huawei/hwid/update/b/b;->a:Ljava/net/HttpURLConnection;

    const/16 v1, 0x7530

    invoke-virtual {v0, v1}, Ljava/net/HttpURLConnection;->setReadTimeout(I)V

    .line 193
    iget-object v0, p0, Lcom/huawei/hwid/update/b/b;->a:Ljava/net/HttpURLConnection;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/net/HttpURLConnection;->setDoInput(Z)V

    .line 194
    iget-object v0, p0, Lcom/huawei/hwid/update/b/b;->a:Ljava/net/HttpURLConnection;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/net/HttpURLConnection;->setDoOutput(Z)V

    .line 196
    iget-object v0, p0, Lcom/huawei/hwid/update/b/b;->a:Ljava/net/HttpURLConnection;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/net/HttpURLConnection;->setUseCaches(Z)V

    .line 199
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hwid/update/b/b;->b:I

    .line 200
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/io/OutputStream;II)I
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lcom/huawei/hwid/update/b/a;
        }
    .end annotation

    .line 142
    const/4 v4, -0x1

    .line 144
    const/4 v5, 0x0

    .line 148
    :try_start_0
    invoke-direct {p0, p1}, Lcom/huawei/hwid/update/b/b;->a(Ljava/lang/String;)V

    .line 150
    iget-object v0, p0, Lcom/huawei/hwid/update/b/b;->a:Ljava/net/HttpURLConnection;

    const-string v1, "GET"

    invoke-virtual {v0, v1}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    .line 151
    if-lez p3, :cond_0

    .line 152
    iget-object v0, p0, Lcom/huawei/hwid/update/b/b;->a:Ljava/net/HttpURLConnection;

    const-string v1, "Range"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "bytes="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "-"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/net/HttpURLConnection;->addRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 156
    :cond_0
    iget-object v0, p0, Lcom/huawei/hwid/update/b/b;->a:Ljava/net/HttpURLConnection;

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v4

    .line 158
    if-lez p3, :cond_1

    const/16 v0, 0xce

    if-eq v4, v0, :cond_2

    :cond_1
    if-gtz p3, :cond_3

    const/16 v0, 0xc8

    if-ne v4, v0, :cond_3

    .line 160
    :cond_2
    iget-object v0, p0, Lcom/huawei/hwid/update/b/b;->a:Ljava/net/HttpURLConnection;

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v0

    move-object v5, v0

    .line 161
    new-instance v0, Ljava/io/BufferedInputStream;

    const/16 v1, 0x1000

    invoke-direct {v0, v5, v1}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;I)V

    invoke-direct {p0, v0, p2}, Lcom/huawei/hwid/update/b/b;->a(Ljava/io/InputStream;Ljava/io/OutputStream;)V

    .line 162
    invoke-virtual {p2}, Ljava/io/OutputStream;->flush()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 166
    :cond_3
    invoke-static {v5}, Lcom/huawei/hwid/d/c;->a(Ljava/io/InputStream;)V

    .line 167
    goto :goto_0

    .line 166
    :catchall_0
    move-exception v6

    invoke-static {v5}, Lcom/huawei/hwid/d/c;->a(Ljava/io/InputStream;)V

    throw v6

    .line 169
    :goto_0
    return v4
.end method

.method public a()V
    .locals 1

    .line 60
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/hwid/update/b/b;->b:I

    .line 62
    iget-object v0, p0, Lcom/huawei/hwid/update/b/b;->a:Ljava/net/HttpURLConnection;

    if-eqz v0, :cond_0

    .line 63
    iget-object v0, p0, Lcom/huawei/hwid/update/b/b;->a:Ljava/net/HttpURLConnection;

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 65
    :cond_0
    return-void
.end method

.method public b()V
    .locals 1

    .line 71
    const/4 v0, 0x1

    iput v0, p0, Lcom/huawei/hwid/update/b/b;->b:I

    .line 72
    return-void
.end method
