.class public Lo/aae;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/aaj;


# instance fields
.field private a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field private c:I

.field private e:Ljava/net/HttpURLConnection;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 62
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 57
    const/4 v0, 0x0

    iput-object v0, p0, Lo/aae;->a:Ljava/util/Map;

    .line 64
    const/4 v0, -0x1

    iput v0, p0, Lo/aae;->c:I

    .line 65
    return-void
.end method

.method public constructor <init>(Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;)V"
        }
    .end annotation

    .line 67
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 57
    const/4 v0, 0x0

    iput-object v0, p0, Lo/aae;->a:Ljava/util/Map;

    .line 69
    const/4 v0, -0x1

    iput v0, p0, Lo/aae;->c:I

    .line 70
    iput-object p1, p0, Lo/aae;->a:Ljava/util/Map;

    .line 71
    return-void
.end method

.method private a(Ljava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 227
    iget v0, p0, Lo/aae;->c:I

    if-nez v0, :cond_0

    .line 229
    const-string v0, "mStatus == STATUS_OPENED"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/aap;->b(Ljava/lang/String;Z)V

    .line 230
    return-void

    .line 232
    :cond_0
    new-instance v0, Ljava/net/URL;

    invoke-direct {v0, p1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v0

    check-cast v0, Ljava/net/HttpURLConnection;

    iput-object v0, p0, Lo/aae;->e:Ljava/net/HttpURLConnection;

    .line 233
    iget-object v0, p0, Lo/aae;->e:Ljava/net/HttpURLConnection;

    instance-of v0, v0, Ljavax/net/ssl/HttpsURLConnection;

    if-eqz v0, :cond_1

    .line 240
    iget-object v0, p0, Lo/aae;->e:Ljava/net/HttpURLConnection;

    check-cast v0, Ljavax/net/ssl/HttpsURLConnection;

    invoke-static {}, Lo/zm;->d()Lo/zm;

    move-result-object v1

    .line 241
    invoke-virtual {v1}, Lo/zm;->e()Landroid/content/Context;

    move-result-object v1

    .line 240
    invoke-static {v0, v1}, Lo/zy;->b(Ljavax/net/ssl/HttpsURLConnection;Landroid/content/Context;)V

    .line 243
    :cond_1
    iget-object v0, p0, Lo/aae;->e:Ljava/net/HttpURLConnection;

    const/16 v1, 0x4e20

    invoke-virtual {v0, v1}, Ljava/net/HttpURLConnection;->setConnectTimeout(I)V

    .line 244
    iget-object v0, p0, Lo/aae;->e:Ljava/net/HttpURLConnection;

    const/16 v1, 0x4e20

    invoke-virtual {v0, v1}, Ljava/net/HttpURLConnection;->setReadTimeout(I)V

    .line 245
    iget-object v0, p0, Lo/aae;->e:Ljava/net/HttpURLConnection;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/net/HttpURLConnection;->setDoInput(Z)V

    .line 246
    iget-object v0, p0, Lo/aae;->e:Ljava/net/HttpURLConnection;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/net/HttpURLConnection;->setUseCaches(Z)V

    .line 247
    iget-object v0, p0, Lo/aae;->a:Ljava/util/Map;

    invoke-direct {p0, v0}, Lo/aae;->e(Ljava/util/Map;)V

    .line 250
    const/4 v0, 0x0

    iput v0, p0, Lo/aae;->c:I

    .line 251
    return-void
.end method

.method private b(Ljava/util/Map;Ljava/util/Map;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<Ljava/lang/String;Ljava/util/List<Ljava/lang/String;>;>;Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;)V"
        }
    .end annotation

    .line 200
    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/Map;->size()I

    move-result v0

    if-gtz v0, :cond_1

    .line 202
    :cond_0
    return-void

    .line 204
    :cond_1
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .line 208
    goto :goto_0

    .line 210
    :cond_2
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/util/Map$Entry;

    .line 211
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/lang/String;

    .line 212
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/util/List;

    .line 213
    const/4 v0, 0x0

    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-interface {p2, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 208
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_2

    .line 215
    return-void
.end method

.method private d(Ljava/io/InputStream;Ljava/io/OutputStream;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 269
    const/16 v0, 0x1000

    new-array v2, v0, [B

    .line 270
    const/4 v3, 0x0

    .line 271
    goto :goto_0

    .line 273
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p2, v2, v0, v3}, Ljava/io/OutputStream;->write([BII)V

    .line 271
    :goto_0
    invoke-virtual {p1, v2}, Ljava/io/InputStream;->read([B)I

    move-result v0

    move v3, v0

    const/4 v1, -0x1

    if-ne v1, v0, :cond_0

    .line 275
    return-void
.end method

.method private e(Ljava/util/Map;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;)V"
        }
    .end annotation

    .line 136
    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/Map;->size()I

    move-result v0

    if-gtz v0, :cond_1

    .line 138
    :cond_0
    return-void

    .line 140
    :cond_1
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .line 144
    goto :goto_0

    .line 146
    :cond_2
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/util/Map$Entry;

    .line 147
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/lang/String;

    .line 148
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/lang/String;

    .line 149
    iget-object v0, p0, Lo/aae;->e:Ljava/net/HttpURLConnection;

    invoke-virtual {v0, v2, v3}, Ljava/net/HttpURLConnection;->addRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 144
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_2

    .line 151
    return-void
.end method


# virtual methods
.method public c()V
    .locals 1

    .line 78
    const/4 v0, -0x1

    iput v0, p0, Lo/aae;->c:I

    .line 80
    iget-object v0, p0, Lo/aae;->e:Ljava/net/HttpURLConnection;

    if-eqz v0, :cond_0

    .line 82
    iget-object v0, p0, Lo/aae;->e:Ljava/net/HttpURLConnection;

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 84
    :cond_0
    return-void
.end method

.method public d(Ljava/lang/String;Ljava/io/OutputStream;Ljava/util/Map;)I
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/io/OutputStream;Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;)I"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 165
    const/4 v2, -0x1

    .line 167
    const/4 v3, 0x0

    .line 172
    :try_start_0
    invoke-direct {p0, p1}, Lo/aae;->a(Ljava/lang/String;)V

    .line 173
    iget-object v0, p0, Lo/aae;->e:Ljava/net/HttpURLConnection;

    const-string v1, "GET"

    invoke-virtual {v0, v1}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    .line 176
    iget-object v0, p0, Lo/aae;->e:Ljava/net/HttpURLConnection;

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v2

    .line 177
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "statusCode---- "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/aap;->b(Ljava/lang/String;Z)V

    .line 178
    const/16 v0, 0xc8

    if-ne v2, v0, :cond_0

    .line 180
    iget-object v0, p0, Lo/aae;->e:Ljava/net/HttpURLConnection;

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v0

    move-object v3, v0

    .line 181
    iget-object v0, p0, Lo/aae;->e:Ljava/net/HttpURLConnection;

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getHeaderFields()Ljava/util/Map;

    move-result-object v0

    invoke-direct {p0, v0, p3}, Lo/aae;->b(Ljava/util/Map;Ljava/util/Map;)V

    .line 182
    new-instance v0, Ljava/io/BufferedInputStream;

    const/16 v1, 0x1000

    invoke-direct {v0, v3, v1}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;I)V

    invoke-direct {p0, v0, p2}, Lo/aae;->d(Ljava/io/InputStream;Ljava/io/OutputStream;)V

    .line 183
    invoke-virtual {p2}, Ljava/io/OutputStream;->flush()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 185
    goto :goto_0

    .line 187
    :catchall_0
    move-exception v4

    .line 188
    invoke-static {v3}, Lo/aaw;->e(Ljava/io/InputStream;)V

    .line 189
    throw v4

    .line 188
    :cond_0
    :goto_0
    invoke-static {v3}, Lo/aaw;->e(Ljava/io/InputStream;)V

    .line 190
    return v2
.end method
