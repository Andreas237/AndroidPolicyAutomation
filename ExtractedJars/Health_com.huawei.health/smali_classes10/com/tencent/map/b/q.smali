.class public final Lcom/tencent/map/b/q;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:I

.field private static b:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 41
    const/4 v0, 0x0

    sput v0, Lcom/tencent/map/b/q;->a:I

    .line 18
    return-void
.end method

.method private static a(Ljava/net/HttpURLConnection;Z)Lcom/tencent/map/b/n;
    .locals 12
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 241
    const/4 v4, 0x0

    .line 243
    :try_start_0
    new-instance v5, Lcom/tencent/map/b/n;

    invoke-direct {v5}, Lcom/tencent/map/b/n;-><init>()V

    .line 244
    invoke-virtual {p0}, Ljava/net/HttpURLConnection;->getContentType()Ljava/lang/String;

    move-result-object v6

    .line 245
    move-object v7, v6

    const-string v8, "GBK"

    if-eqz v7, :cond_2

    const-string v0, ";"

    invoke-virtual {v7, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v11

    move-object v7, v11

    array-length v10, v11

    const/4 v9, 0x0

    goto :goto_0

    :cond_0
    aget-object v7, v11, v9

    const-string v0, "charset"

    invoke-virtual {v7, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "="

    invoke-virtual {v7, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v7

    array-length v0, v7

    const/4 v1, 0x1

    if-le v0, v1, :cond_2

    const/4 v0, 0x1

    aget-object v0, v7, v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v8

    goto :goto_1

    :cond_1
    add-int/lit8 v9, v9, 0x1

    :goto_0
    if-lt v9, v10, :cond_0

    :cond_2
    :goto_1
    iput-object v8, v5, Lcom/tencent/map/b/n;->b:Ljava/lang/String;

    .line 246
    if-eqz p1, :cond_4

    .line 247
    move-object v7, v6

    if-eqz v6, :cond_3

    const-string v0, "vnd.wap.wml"

    invoke-virtual {v7, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    const/4 v0, 0x1

    goto :goto_2

    :cond_3
    const/4 v0, 0x0

    :goto_2
    if-eqz v0, :cond_4

    .line 248
    invoke-virtual {p0}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 249
    invoke-virtual {p0}, Ljava/net/HttpURLConnection;->connect()V

    .line 253
    :cond_4
    invoke-virtual {p0}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v0

    .line 254
    move-object v4, v0

    if-eqz v0, :cond_7

    .line 256
    const/4 v0, 0x0

    new-array v0, v0, [B

    iput-object v0, v5, Lcom/tencent/map/b/n;->a:[B

    .line 257
    const/4 p0, 0x0

    .line 258
    const/16 v0, 0x400

    new-array p1, v0, [B

    .line 261
    :cond_5
    invoke-virtual {v4, p1}, Ljava/io/InputStream;->read([B)I

    move-result v0

    .line 262
    move v6, v0

    if-lez v0, :cond_6

    .line 263
    add-int v0, p0, v6

    .line 264
    move p0, v0

    new-array v7, v0, [B

    .line 265
    iget-object v0, v5, Lcom/tencent/map/b/n;->a:[B

    iget-object v1, v5, Lcom/tencent/map/b/n;->a:[B

    array-length v1, v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v2, v7, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 266
    iget-object v0, v5, Lcom/tencent/map/b/n;->a:[B

    array-length v0, v0

    const/4 v1, 0x0

    invoke-static {p1, v1, v7, v0, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 267
    iput-object v7, v5, Lcom/tencent/map/b/n;->a:[B
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 269
    :cond_6
    if-gtz v6, :cond_5

    .line 271
    :cond_7
    move-object p0, v5

    .line 273
    if-eqz v4, :cond_8

    .line 275
    :try_start_1
    invoke-virtual {v4}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    nop

    .line 271
    .line 276
    :catch_0
    :cond_8
    return-object p0

    .line 272
    :catchall_0
    move-exception p0

    .line 273
    if-eqz v4, :cond_9

    .line 275
    :try_start_2
    invoke-virtual {v4}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    nop

    .line 276
    .line 279
    :catch_1
    :cond_9
    throw p0
.end method

.method public static a(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;[BZZ)Lcom/tencent/map/b/n;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 150
    invoke-static {}, Lcom/tencent/map/b/l;->d()Z

    move-result v0

    if-nez v0, :cond_0

    .line 153
    new-instance v0, Lcom/tencent/map/b/r;

    invoke-direct {v0}, Lcom/tencent/map/b/r;-><init>()V

    throw v0

    .line 156
    :cond_0
    const/4 v3, 0x0

    .line 157
    const/4 v4, 0x0

    .line 159
    :try_start_0
    invoke-static {p1, p6}, Lcom/tencent/map/b/q;->a(Ljava/lang/String;Z)Ljava/net/HttpURLConnection;

    move-result-object v0

    move-object v3, v0

    .line 161
    const/4 v0, 0x0

    invoke-static {v0}, Lcom/tencent/map/b/b;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 162
    invoke-virtual {v3}, Ljava/net/HttpURLConnection;->getURL()Ljava/net/URL;

    move-result-object v0

    invoke-virtual {v0}, Ljava/net/URL;->getHost()Ljava/lang/String;

    move-result-object p3

    .line 163
    invoke-static {p3}, Lcom/tencent/map/b/b;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 164
    goto :goto_0

    .line 167
    :cond_1
    const-string v0, "Host"

    const/4 v1, 0x0

    invoke-virtual {v3, v0, v1}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 170
    :cond_2
    :goto_0
    if-eqz p0, :cond_3

    .line 171
    const-string v0, "GET"

    invoke-virtual {v3, v0}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    goto :goto_1

    .line 173
    :cond_3
    const-string v0, "POST"

    invoke-virtual {v3, v0}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    .line 175
    :goto_1
    invoke-static {}, Lcom/tencent/map/b/k;->a()I

    move-result v0

    invoke-virtual {v3, v0}, Ljava/net/HttpURLConnection;->setConnectTimeout(I)V

    .line 176
    invoke-static {}, Lcom/tencent/map/b/k;->b()I

    move-result v0

    invoke-virtual {v3, v0}, Ljava/net/HttpURLConnection;->setReadTimeout(I)V

    .line 177
    const-string v0, "User-Agent"

    invoke-virtual {v3, v0, p2}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 178
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Ljava/net/HttpURLConnection;->setDoInput(Z)V

    .line 179
    if-eqz p0, :cond_4

    const/4 v0, 0x0

    goto :goto_2

    :cond_4
    const/4 v0, 0x1

    :goto_2
    invoke-virtual {v3, v0}, Ljava/net/HttpURLConnection;->setDoOutput(Z)V

    .line 180
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Ljava/net/HttpURLConnection;->setUseCaches(Z)V

    .line 181
    if-eqz p5, :cond_5

    .line 182
    const-string v0, "Connection"

    const-string v1, "Keep-Alive"

    invoke-virtual {v3, v0, v1}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 185
    :cond_5
    invoke-static {v3}, Lcom/tencent/map/b/k;->a(Ljava/net/HttpURLConnection;)V

    .line 186
    invoke-virtual {v3}, Ljava/net/HttpURLConnection;->connect()V

    .line 187
    invoke-static {}, Lcom/tencent/map/b/k;->c()V

    .line 189
    if-nez p0, :cond_6

    if-eqz p4, :cond_6

    array-length v0, p4

    if-eqz v0, :cond_6

    .line 190
    new-instance v0, Ljava/io/DataOutputStream;

    invoke-virtual {v3}, Ljava/net/HttpURLConnection;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V

    .line 191
    move-object v4, v0

    invoke-virtual {v0, p4}, Ljava/io/DataOutputStream;->write([B)V

    .line 192
    invoke-virtual {v4}, Ljava/io/DataOutputStream;->flush()V

    .line 193
    invoke-virtual {v4}, Ljava/io/DataOutputStream;->close()V

    .line 194
    const/4 v4, 0x0

    .line 196
    :cond_6
    invoke-virtual {v3}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v0

    .line 198
    move p1, v0

    const/16 v1, 0xc8

    if-eq v0, v1, :cond_7

    .line 199
    const/16 v0, 0xce

    if-ne p1, v0, :cond_a

    .line 200
    :cond_7
    invoke-static {}, Lcom/tencent/map/b/k;->d()V

    .line 201
    invoke-static {v3, p0}, Lcom/tencent/map/b/q;->a(Ljava/net/HttpURLConnection;Z)Lcom/tencent/map/b/n;

    move-result-object p0

    .line 202
    if-eqz p0, :cond_8

    iget-object v0, p0, Lcom/tencent/map/b/n;->a:[B

    if-eqz v0, :cond_8

    iget-object v0, p0, Lcom/tencent/map/b/n;->a:[B

    array-length v0, v0

    goto :goto_3

    .line 203
    :cond_8
    const/4 v0, 0x0

    .line 202
    :goto_3
    invoke-static {v0}, Lcom/tencent/map/b/k;->a(I)V
    :try_end_0
    .catch Lcom/tencent/map/b/p; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 205
    .line 227
    if-eqz v3, :cond_9

    .line 231
    invoke-virtual {v3}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 205
    :cond_9
    return-object p0

    .line 206
    :cond_a
    const/16 v0, 0xca

    if-eq p1, v0, :cond_b

    .line 207
    const/16 v0, 0xc9

    if-eq p1, v0, :cond_b

    .line 208
    const/16 v0, 0xcc

    if-eq p1, v0, :cond_b

    .line 209
    const/16 v0, 0xcd

    if-eq p1, v0, :cond_b

    .line 210
    const/16 v0, 0x130

    if-eq p1, v0, :cond_b

    .line 211
    const/16 v0, 0x131

    if-eq p1, v0, :cond_b

    .line 212
    const/16 v0, 0x198

    if-eq p1, v0, :cond_b

    .line 213
    const/16 v0, 0x1f6

    if-eq p1, v0, :cond_b

    .line 214
    const/16 v0, 0x1f8

    if-eq p1, v0, :cond_b

    .line 215
    const/16 v0, 0x1f7

    if-ne p1, v0, :cond_c

    .line 216
    :cond_b
    :try_start_1
    new-instance v0, Ljava/io/IOException;

    const-string v1, "doGetOrPost retry"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 218
    :cond_c
    new-instance v0, Lcom/tencent/map/b/p;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "response code is "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/tencent/map/b/p;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_1
    .catch Lcom/tencent/map/b/p; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 220
    :catch_0
    move-exception p0

    .line 221
    const/4 v0, 0x1

    :try_start_2
    invoke-static {v0}, Lcom/tencent/map/b/k;->a(Z)V

    .line 222
    throw p0

    .line 223
    :catch_1
    move-exception p0

    .line 224
    const/4 v0, 0x0

    invoke-static {v0}, Lcom/tencent/map/b/k;->a(Z)V

    .line 225
    throw p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 226
    :catchall_0
    move-exception p0

    .line 227
    if-eqz v4, :cond_d

    .line 228
    invoke-virtual {v4}, Ljava/io/DataOutputStream;->close()V

    .line 230
    :cond_d
    if-eqz v3, :cond_e

    .line 231
    invoke-virtual {v3}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 233
    :cond_e
    throw p0
.end method

.method private static a(Ljava/lang/String;Z)Ljava/net/HttpURLConnection;
    .locals 5

    .line 52
    :try_start_0
    new-instance v2, Ljava/net/URL;

    invoke-direct {v2, p0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 53
    :catch_0
    move-exception p0

    .line 54
    invoke-virtual {p0}, Ljava/net/MalformedURLException;->printStackTrace()V

    .line 55
    const/4 v0, 0x0

    return-object v0

    .line 59
    :goto_0
    invoke-static {}, Lcom/tencent/map/b/l;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    goto :goto_1

    :cond_0
    invoke-static {}, Lcom/tencent/map/b/m;->a()Lcom/tencent/map/b/m;

    nop

    nop

    invoke-static {}, Landroid/net/Proxy;->getDefaultHost()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/tencent/map/b/b;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    const/4 v0, 0x1

    :goto_1
    if-nez v0, :cond_2

    .line 61
    :try_start_1
    invoke-virtual {v2}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v0

    check-cast v0, Ljava/net/HttpURLConnection;
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    return-object v0

    .line 62
    :catch_1
    move-exception p0

    .line 63
    invoke-virtual {p0}, Ljava/io/IOException;->printStackTrace()V

    .line 64
    const/4 v0, 0x0

    return-object v0

    .line 69
    :cond_2
    sget v0, Lcom/tencent/map/b/q;->a:I

    if-nez v0, :cond_6

    .line 71
    sget-boolean v0, Lcom/tencent/map/b/q;->b:Z

    if-nez v0, :cond_6

    const/4 v0, 0x1

    sput-boolean v0, Lcom/tencent/map/b/q;->b:Z

    :try_start_2
    new-instance p1, Ljava/net/URL;

    const-string v0, "http://ls.map.soso.com/monitor/monitor.html"

    invoke-direct {p1, v0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/net/MalformedURLException; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_2

    :catch_2
    const/4 v0, 0x0

    sput-boolean v0, Lcom/tencent/map/b/q;->b:Z

    goto/16 :goto_4

    :goto_2
    invoke-static {}, Landroid/net/Proxy;->getDefaultHost()Ljava/lang/String;

    move-result-object v3

    invoke-static {}, Landroid/net/Proxy;->getDefaultPort()I

    move-result v0

    move v4, v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_3

    const/16 v4, 0x50

    :cond_3
    new-instance v0, Ljava/net/InetSocketAddress;

    invoke-direct {v0, v3, v4}, Ljava/net/InetSocketAddress;-><init>(Ljava/lang/String;I)V

    move-object v3, v0

    new-instance v0, Ljava/net/Proxy;

    sget-object v1, Ljava/net/Proxy$Type;->HTTP:Ljava/net/Proxy$Type;

    invoke-direct {v0, v1, v3}, Ljava/net/Proxy;-><init>(Ljava/net/Proxy$Type;Ljava/net/SocketAddress;)V

    move-object v3, v0

    const/4 v4, 0x0

    :try_start_3
    invoke-virtual {p1, v3}, Ljava/net/URL;->openConnection(Ljava/net/Proxy;)Ljava/net/URLConnection;

    move-result-object v0

    check-cast v0, Ljava/net/HttpURLConnection;

    move-object v4, v0

    const-string v1, "GET"

    invoke-virtual {v0, v1}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    const/16 v0, 0x3a98

    invoke-virtual {v4, v0}, Ljava/net/HttpURLConnection;->setConnectTimeout(I)V

    const v0, 0xafc8

    invoke-virtual {v4, v0}, Ljava/net/HttpURLConnection;->setReadTimeout(I)V

    const-string v0, "User-Agent"

    const-string v1, "QQ Map Mobile"

    invoke-virtual {v4, v0, v1}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Ljava/net/HttpURLConnection;->setDoInput(Z)V

    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Ljava/net/HttpURLConnection;->setDoOutput(Z)V

    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Ljava/net/HttpURLConnection;->setUseCaches(Z)V

    invoke-static {v4}, Lcom/tencent/map/b/q;->a(Ljava/net/HttpURLConnection;)Z

    move-result p1

    invoke-virtual {v4}, Ljava/net/HttpURLConnection;->connect()V

    if-eqz p1, :cond_4

    const/4 v0, 0x1

    invoke-static {v0}, Lcom/tencent/map/b/q;->a(I)V

    goto :goto_3

    :cond_4
    const/4 v0, 0x2

    invoke-static {v0}, Lcom/tencent/map/b/q;->a(I)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_3

    :catch_3
    move-exception p1

    :try_start_4
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    const/4 v0, 0x2

    invoke-static {v0}, Lcom/tencent/map/b/q;->a(I)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    if-eqz v4, :cond_6

    invoke-virtual {v4}, Ljava/net/HttpURLConnection;->disconnect()V

    goto :goto_4

    :catchall_0
    move-exception p0

    if-eqz v4, :cond_5

    invoke-virtual {v4}, Ljava/net/HttpURLConnection;->disconnect()V

    :cond_5
    throw p0

    :goto_3
    if-eqz v4, :cond_6

    invoke-virtual {v4}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 76
    :cond_6
    :goto_4
    :try_start_5
    sget v0, Lcom/tencent/map/b/q;->a:I

    packed-switch v0, :pswitch_data_0

    goto :goto_5

    .line 78
    :pswitch_0
    invoke-static {v2, p0}, Lcom/tencent/map/b/q;->a(Ljava/net/URL;Ljava/lang/String;)Ljava/net/HttpURLConnection;
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_4

    move-result-object v0

    return-object v0

    .line 81
    :goto_5
    move-object p1, v2

    :try_start_6
    invoke-static {}, Landroid/net/Proxy;->getDefaultHost()Ljava/lang/String;

    move-result-object v3

    invoke-static {}, Landroid/net/Proxy;->getDefaultPort()I

    move-result v0

    move v4, v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_7

    const/16 v4, 0x50

    :cond_7
    new-instance v0, Ljava/net/InetSocketAddress;

    invoke-direct {v0, v3, v4}, Ljava/net/InetSocketAddress;-><init>(Ljava/lang/String;I)V

    move-object v3, v0

    new-instance v0, Ljava/net/Proxy;

    sget-object v1, Ljava/net/Proxy$Type;->HTTP:Ljava/net/Proxy$Type;

    invoke-direct {v0, v1, v3}, Ljava/net/Proxy;-><init>(Ljava/net/Proxy$Type;Ljava/net/SocketAddress;)V

    move-object v3, v0

    invoke-virtual {p1, v3}, Ljava/net/URL;->openConnection(Ljava/net/Proxy;)Ljava/net/URLConnection;

    move-result-object v0

    check-cast v0, Ljava/net/HttpURLConnection;
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_4

    return-object v0

    .line 83
    :catch_4
    move-exception p0

    .line 84
    invoke-virtual {p0}, Ljava/io/IOException;->printStackTrace()V

    .line 85
    const/4 v0, 0x0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch
.end method

.method private static a(Ljava/net/URL;Ljava/lang/String;)Ljava/net/HttpURLConnection;
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 422
    invoke-static {}, Landroid/net/Proxy;->getDefaultHost()Ljava/lang/String;

    move-result-object v3

    .line 423
    invoke-static {}, Landroid/net/Proxy;->getDefaultPort()I

    move-result v0

    .line 424
    move v4, v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    .line 425
    const/16 v4, 0x50

    .line 428
    :cond_0
    invoke-virtual {p0}, Ljava/net/URL;->getHost()Ljava/lang/String;

    move-result-object v5

    .line 429
    invoke-virtual {p0}, Ljava/net/URL;->getPort()I

    move-result v0

    .line 430
    move p0, v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_1

    .line 431
    const/16 p0, 0x50

    .line 435
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_2

    .line 436
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v2, ":"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    .line 438
    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v5, v0}, Ljava/lang/String;->replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 443
    :goto_0
    :try_start_0
    new-instance v0, Ljava/net/URL;

    invoke-direct {v0, p1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_0

    move-object p1, v0

    goto :goto_1

    .line 444
    .line 445
    :catch_0
    const/4 v0, 0x0

    return-object v0

    .line 448
    :goto_1
    invoke-virtual {p1}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v0

    move-object p1, v0

    check-cast p1, Ljava/net/HttpURLConnection;

    .line 450
    const-string v0, "X-Online-Host"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v2, ":"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 452
    return-object p1
.end method

.method private static a(I)V
    .locals 1

    .line 310
    sget v0, Lcom/tencent/map/b/q;->a:I

    if-ne v0, p0, :cond_0

    .line 311
    return-void

    .line 313
    :cond_0
    sput p0, Lcom/tencent/map/b/q;->a:I

    .line 314
    return-void
.end method

.method private static a(Ljava/net/HttpURLConnection;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 387
    const/4 v2, 0x0

    .line 389
    :try_start_0
    invoke-virtual {p0}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v0

    move-object v2, v0

    .line 390
    invoke-virtual {p0}, Ljava/net/HttpURLConnection;->getContentType()Ljava/lang/String;

    move-result-object p0

    .line 393
    const-string v0, "text/html"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-nez v0, :cond_1

    .line 406
    if-eqz v2, :cond_0

    .line 407
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V

    .line 394
    :cond_0
    const/4 v0, 0x0

    return v0

    .line 397
    :cond_1
    :try_start_1
    new-instance p0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {p0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 398
    goto :goto_0

    .line 399
    :cond_2
    invoke-virtual {v2}, Ljava/io/InputStream;->read()I

    move-result v0

    invoke-virtual {p0, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 398
    :goto_0
    invoke-virtual {v2}, Ljava/io/InputStream;->available()I

    move-result v0

    if-gtz v0, :cond_2

    .line 402
    new-instance v0, Ljava/lang/String;

    invoke-virtual {p0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>([B)V

    .line 403
    move-object p0, v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    const-string v1, "1"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result p0

    .line 404
    if-eqz v2, :cond_3

    .line 407
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V

    .line 404
    :cond_3
    return p0

    .line 405
    :catchall_0
    move-exception p0

    .line 406
    if-eqz v2, :cond_4

    .line 407
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V

    .line 409
    :cond_4
    throw p0
.end method
