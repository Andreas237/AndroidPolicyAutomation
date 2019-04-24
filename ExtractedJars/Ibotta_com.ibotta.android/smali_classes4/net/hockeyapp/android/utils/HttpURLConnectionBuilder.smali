.class public Lnet/hockeyapp/android/utils/HttpURLConnectionBuilder;
.super Ljava/lang/Object;
.source "HttpURLConnectionBuilder.java"


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation


# instance fields
.field private final mHeaders:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private mMultipartEntity:Lnet/hockeyapp/android/utils/SimpleMultipartEntity;

.field private mRequestBody:Ljava/lang/String;

.field private mRequestMethod:Ljava/lang/String;

.field private mTimeout:I

.field private final mUrlString:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const v0, 0x1d4c0

    .line 39
    iput v0, p0, Lnet/hockeyapp/android/utils/HttpURLConnectionBuilder;->mTimeout:I

    .line 44
    iput-object p1, p0, Lnet/hockeyapp/android/utils/HttpURLConnectionBuilder;->mUrlString:Ljava/lang/String;

    .line 45
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lnet/hockeyapp/android/utils/HttpURLConnectionBuilder;->mHeaders:Ljava/util/Map;

    return-void
.end method

.method private static getFormString(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Ljava/lang/String;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/UnsupportedEncodingException;
        }
    .end annotation

    .line 161
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 162
    invoke-interface {p0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 163
    invoke-interface {p0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 164
    invoke-static {v2, p1}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 165
    invoke-static {v3, p1}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 166
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "="

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    const-string p0, "&"

    .line 168
    invoke-static {p0, v0}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public build()Ljava/net/HttpURLConnection;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 120
    new-instance v0, Ljava/net/URL;

    iget-object v1, p0, Lnet/hockeyapp/android/utils/HttpURLConnectionBuilder;->mUrlString:Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 121
    invoke-virtual {v0}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v0

    invoke-static {v0}, Lcom/newrelic/agent/android/instrumentation/URLConnectionInstrumentation;->openConnection(Ljava/net/URLConnection;)Ljava/net/URLConnection;

    move-result-object v0

    check-cast v0, Ljava/net/HttpURLConnection;

    .line 123
    iget v1, p0, Lnet/hockeyapp/android/utils/HttpURLConnectionBuilder;->mTimeout:I

    invoke-virtual {v0, v1}, Ljava/net/HttpURLConnection;->setConnectTimeout(I)V

    .line 124
    iget v1, p0, Lnet/hockeyapp/android/utils/HttpURLConnectionBuilder;->mTimeout:I

    invoke-virtual {v0, v1}, Ljava/net/HttpURLConnection;->setReadTimeout(I)V

    .line 126
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x9

    if-gt v1, v2, :cond_0

    const-string v1, "Connection"

    const-string v2, "close"

    .line 127
    invoke-virtual {v0, v1, v2}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 130
    :cond_0
    iget-object v1, p0, Lnet/hockeyapp/android/utils/HttpURLConnectionBuilder;->mRequestMethod:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_2

    .line 131
    iget-object v1, p0, Lnet/hockeyapp/android/utils/HttpURLConnectionBuilder;->mRequestMethod:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    .line 132
    iget-object v1, p0, Lnet/hockeyapp/android/utils/HttpURLConnectionBuilder;->mRequestBody:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lnet/hockeyapp/android/utils/HttpURLConnectionBuilder;->mRequestMethod:Ljava/lang/String;

    const-string v2, "POST"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v1, p0, Lnet/hockeyapp/android/utils/HttpURLConnectionBuilder;->mRequestMethod:Ljava/lang/String;

    const-string v2, "PUT"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    :cond_1
    const/4 v1, 0x1

    .line 133
    invoke-virtual {v0, v1}, Ljava/net/HttpURLConnection;->setDoOutput(Z)V

    .line 137
    :cond_2
    iget-object v1, p0, Lnet/hockeyapp/android/utils/HttpURLConnectionBuilder;->mHeaders:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 138
    iget-object v3, p0, Lnet/hockeyapp/android/utils/HttpURLConnectionBuilder;->mHeaders:Ljava/util/Map;

    invoke-interface {v3, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v0, v2, v3}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 141
    :cond_3
    iget-object v1, p0, Lnet/hockeyapp/android/utils/HttpURLConnectionBuilder;->mRequestBody:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_4

    .line 142
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v1

    .line 143
    new-instance v2, Ljava/io/BufferedWriter;

    new-instance v3, Ljava/io/OutputStreamWriter;

    const-string v4, "UTF-8"

    invoke-direct {v3, v1, v4}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;Ljava/lang/String;)V

    invoke-direct {v2, v3}, Ljava/io/BufferedWriter;-><init>(Ljava/io/Writer;)V

    .line 144
    iget-object v1, p0, Lnet/hockeyapp/android/utils/HttpURLConnectionBuilder;->mRequestBody:Ljava/lang/String;

    invoke-virtual {v2, v1}, Ljava/io/BufferedWriter;->write(Ljava/lang/String;)V

    .line 145
    invoke-virtual {v2}, Ljava/io/BufferedWriter;->flush()V

    .line 146
    invoke-virtual {v2}, Ljava/io/BufferedWriter;->close()V

    .line 149
    :cond_4
    iget-object v1, p0, Lnet/hockeyapp/android/utils/HttpURLConnectionBuilder;->mMultipartEntity:Lnet/hockeyapp/android/utils/SimpleMultipartEntity;

    if-eqz v1, :cond_5

    const-string v2, "Content-Length"

    .line 150
    invoke-virtual {v1}, Lnet/hockeyapp/android/utils/SimpleMultipartEntity;->getContentLength()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 151
    new-instance v1, Ljava/io/BufferedOutputStream;

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;)V

    .line 152
    iget-object v2, p0, Lnet/hockeyapp/android/utils/HttpURLConnectionBuilder;->mMultipartEntity:Lnet/hockeyapp/android/utils/SimpleMultipartEntity;

    invoke-virtual {v2}, Lnet/hockeyapp/android/utils/SimpleMultipartEntity;->getOutputStream()Ljava/io/ByteArrayOutputStream;

    move-result-object v2

    invoke-virtual {v2}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/io/BufferedOutputStream;->write([B)V

    .line 153
    invoke-virtual {v1}, Ljava/io/BufferedOutputStream;->flush()V

    .line 154
    invoke-virtual {v1}, Ljava/io/BufferedOutputStream;->close()V

    :cond_5
    return-object v0
.end method

.method public setBasicAuthorization(Ljava/lang/String;Ljava/lang/String;)Lnet/hockeyapp/android/utils/HttpURLConnectionBuilder;
    .locals 2

    .line 111
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Basic "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ":"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 112
    invoke-virtual {p1}, Ljava/lang/String;->getBytes()[B

    move-result-object p1

    const/4 p2, 0x2

    .line 111
    invoke-static {p1, p2}, Lnet/hockeyapp/android/utils/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "Authorization"

    .line 114
    invoke-virtual {p0, p2, p1}, Lnet/hockeyapp/android/utils/HttpURLConnectionBuilder;->setHeader(Ljava/lang/String;Ljava/lang/String;)Lnet/hockeyapp/android/utils/HttpURLConnectionBuilder;

    return-object p0
.end method

.method public setHeader(Ljava/lang/String;Ljava/lang/String;)Lnet/hockeyapp/android/utils/HttpURLConnectionBuilder;
    .locals 1

    .line 106
    iget-object v0, p0, Lnet/hockeyapp/android/utils/HttpURLConnectionBuilder;->mHeaders:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0
.end method

.method public setRequestBody(Ljava/lang/String;)Lnet/hockeyapp/android/utils/HttpURLConnectionBuilder;
    .locals 0

    .line 54
    iput-object p1, p0, Lnet/hockeyapp/android/utils/HttpURLConnectionBuilder;->mRequestBody:Ljava/lang/String;

    return-object p0
.end method

.method public setRequestMethod(Ljava/lang/String;)Lnet/hockeyapp/android/utils/HttpURLConnectionBuilder;
    .locals 0

    .line 49
    iput-object p1, p0, Lnet/hockeyapp/android/utils/HttpURLConnectionBuilder;->mRequestMethod:Ljava/lang/String;

    return-object p0
.end method

.method public writeFormFields(Ljava/util/Map;)Lnet/hockeyapp/android/utils/HttpURLConnectionBuilder;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Lnet/hockeyapp/android/utils/HttpURLConnectionBuilder;"
        }
    .end annotation

    :try_start_0
    const-string v0, "UTF-8"

    .line 60
    invoke-static {p1, v0}, Lnet/hockeyapp/android/utils/HttpURLConnectionBuilder;->getFormString(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "Content-Type"

    const-string v1, "application/x-www-form-urlencoded"

    .line 61
    invoke-virtual {p0, v0, v1}, Lnet/hockeyapp/android/utils/HttpURLConnectionBuilder;->setHeader(Ljava/lang/String;Ljava/lang/String;)Lnet/hockeyapp/android/utils/HttpURLConnectionBuilder;

    .line 62
    invoke-virtual {p0, p1}, Lnet/hockeyapp/android/utils/HttpURLConnectionBuilder;->setRequestBody(Ljava/lang/String;)Lnet/hockeyapp/android/utils/HttpURLConnectionBuilder;
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p1

    .line 64
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method public writeMultipartData(Ljava/util/Map;Landroid/content/Context;Ljava/util/List;)Lnet/hockeyapp/android/utils/HttpURLConnectionBuilder;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Landroid/content/Context;",
            "Ljava/util/List<",
            "Landroid/net/Uri;",
            ">;)",
            "Lnet/hockeyapp/android/utils/HttpURLConnectionBuilder;"
        }
    .end annotation

    .line 71
    :try_start_0
    new-instance v0, Lnet/hockeyapp/android/utils/SimpleMultipartEntity;

    invoke-direct {v0}, Lnet/hockeyapp/android/utils/SimpleMultipartEntity;-><init>()V

    iput-object v0, p0, Lnet/hockeyapp/android/utils/HttpURLConnectionBuilder;->mMultipartEntity:Lnet/hockeyapp/android/utils/SimpleMultipartEntity;

    .line 72
    iget-object v0, p0, Lnet/hockeyapp/android/utils/HttpURLConnectionBuilder;->mMultipartEntity:Lnet/hockeyapp/android/utils/SimpleMultipartEntity;

    invoke-virtual {v0}, Lnet/hockeyapp/android/utils/SimpleMultipartEntity;->writeFirstBoundaryIfNeeds()V

    .line 74
    invoke-interface {p1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 75
    iget-object v2, p0, Lnet/hockeyapp/android/utils/HttpURLConnectionBuilder;->mMultipartEntity:Lnet/hockeyapp/android/utils/SimpleMultipartEntity;

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v2, v1, v3}, Lnet/hockeyapp/android/utils/SimpleMultipartEntity;->addPart(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    const/4 v0, 0x0

    .line 78
    :goto_1
    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_2

    .line 79
    invoke-interface {p3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/net/Uri;

    .line 80
    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x1

    sub-int/2addr v2, v3

    if-ne v0, v2, :cond_1

    goto :goto_2

    :cond_1
    const/4 v3, 0x0

    .line 82
    :goto_2
    invoke-virtual {p2}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v2

    invoke-virtual {v2, v1}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    move-result-object v2

    .line 83
    invoke-virtual {v1}, Landroid/net/Uri;->getLastPathSegment()Ljava/lang/String;

    move-result-object v1

    .line 84
    iget-object v4, p0, Lnet/hockeyapp/android/utils/HttpURLConnectionBuilder;->mMultipartEntity:Lnet/hockeyapp/android/utils/SimpleMultipartEntity;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "attachment"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5, v1, v2, v3}, Lnet/hockeyapp/android/utils/SimpleMultipartEntity;->addPart(Ljava/lang/String;Ljava/lang/String;Ljava/io/InputStream;Z)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 86
    :cond_2
    iget-object p1, p0, Lnet/hockeyapp/android/utils/HttpURLConnectionBuilder;->mMultipartEntity:Lnet/hockeyapp/android/utils/SimpleMultipartEntity;

    invoke-virtual {p1}, Lnet/hockeyapp/android/utils/SimpleMultipartEntity;->writeLastBoundaryIfNeeds()V

    const-string p1, "Content-Type"

    .line 88
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "multipart/form-data; boundary="

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p3, p0, Lnet/hockeyapp/android/utils/HttpURLConnectionBuilder;->mMultipartEntity:Lnet/hockeyapp/android/utils/SimpleMultipartEntity;

    invoke-virtual {p3}, Lnet/hockeyapp/android/utils/SimpleMultipartEntity;->getBoundary()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lnet/hockeyapp/android/utils/HttpURLConnectionBuilder;->setHeader(Ljava/lang/String;Ljava/lang/String;)Lnet/hockeyapp/android/utils/HttpURLConnectionBuilder;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p1

    .line 91
    new-instance p2, Ljava/lang/RuntimeException;

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p2
.end method
