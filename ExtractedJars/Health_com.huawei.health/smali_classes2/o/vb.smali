.class public Lo/vb;
.super Lo/uz;
.source "SourceFile"


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/lang/String;

.field private c:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field private d:Landroid/content/Context;

.field private e:Ljava/lang/String;

.field private g:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;)V"
        }
    .end annotation

    .line 68
    invoke-direct {p0}, Lo/uz;-><init>()V

    .line 42
    const/4 v0, 0x0

    iput-object v0, p0, Lo/vb;->a:Ljava/lang/String;

    .line 43
    const/4 v0, 0x0

    iput-object v0, p0, Lo/vb;->b:Ljava/lang/String;

    .line 44
    const/4 v0, 0x0

    iput-object v0, p0, Lo/vb;->e:Ljava/lang/String;

    .line 45
    const/4 v0, 0x0

    iput-object v0, p0, Lo/vb;->d:Landroid/content/Context;

    .line 46
    const/4 v0, 0x0

    iput-object v0, p0, Lo/vb;->c:Ljava/util/Map;

    .line 53
    const/4 v0, 0x0

    iput v0, p0, Lo/vb;->g:I

    .line 69
    iput-object p1, p0, Lo/vb;->d:Landroid/content/Context;

    .line 70
    iput-object p2, p0, Lo/vb;->b:Ljava/lang/String;

    .line 71
    iput-object p4, p0, Lo/vb;->a:Ljava/lang/String;

    .line 72
    iput-object p5, p0, Lo/vb;->c:Ljava/util/Map;

    .line 73
    iput-object p3, p0, Lo/vb;->e:Ljava/lang/String;

    .line 74
    return-void
.end method

.method private c(Ljava/net/HttpURLConnection;)V
    .locals 3

    .line 163
    const-string v0, "POST"

    invoke-virtual {p1, v0}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    .line 164
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Ljava/net/HttpURLConnection;->setDoOutput(Z)V

    .line 165
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Ljava/net/HttpURLConnection;->setDoInput(Z)V

    .line 166
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ljava/net/HttpURLConnection;->setUseCaches(Z)V

    .line 168
    const-string v0, "Connection"

    const-string v1, "keep-alive"

    invoke-virtual {p1, v0, v1}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 169
    const-string v0, "Charset"

    const-string v1, "UTF-8"

    invoke-virtual {p1, v0, v1}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 170
    const-string v0, "Content-Type"

    const-string v1, "application/x-www-form-urlencoded"

    invoke-virtual {p1, v0, v1}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 172
    iget v0, p0, Lo/vb;->g:I

    if-lez v0, :cond_0

    .line 173
    const-string v0, "NspRequest"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "timeOut=="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lo/vb;->g:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 174
    iget v0, p0, Lo/vb;->g:I

    invoke-virtual {p1, v0}, Ljava/net/HttpURLConnection;->setConnectTimeout(I)V

    .line 175
    iget v0, p0, Lo/vb;->g:I

    invoke-virtual {p1, v0}, Ljava/net/HttpURLConnection;->setReadTimeout(I)V

    goto :goto_0

    .line 178
    :cond_0
    const/16 v0, 0x7530

    invoke-virtual {p1, v0}, Ljava/net/HttpURLConnection;->setConnectTimeout(I)V

    .line 179
    const/16 v0, 0x7530

    invoke-virtual {p1, v0}, Ljava/net/HttpURLConnection;->setReadTimeout(I)V

    .line 182
    :goto_0
    return-void
.end method


# virtual methods
.method protected b(Landroid/content/Context;Ljava/net/HttpURLConnection;)Lo/uz$a;
    .locals 7

    .line 117
    const/4 v2, 0x0

    .line 118
    const/4 v3, 0x0

    .line 119
    new-instance v4, Lo/uz$a;

    invoke-direct {v4}, Lo/uz$a;-><init>()V

    .line 123
    :try_start_0
    invoke-direct {p0, p2}, Lo/vb;->c(Ljava/net/HttpURLConnection;)V

    .line 124
    invoke-virtual {p2}, Ljava/net/HttpURLConnection;->connect()V

    .line 126
    new-instance v0, Ljava/io/DataOutputStream;

    invoke-virtual {p2}, Ljava/net/HttpURLConnection;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V

    move-object v3, v0

    .line 129
    iget-object v0, p0, Lo/vb;->c:Ljava/util/Map;

    invoke-virtual {p0, p1, v0}, Lo/vb;->e(Landroid/content/Context;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "utf-8"

    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/io/DataOutputStream;->write([B)V

    .line 130
    invoke-virtual {v3}, Ljava/io/DataOutputStream;->flush()V

    .line 132
    invoke-virtual {p2}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v5

    .line 134
    invoke-virtual {v4, v5}, Lo/uz$a;->b(I)V

    .line 136
    invoke-virtual {p2}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v0

    move-object v2, v0

    .line 137
    invoke-static {v2}, Lcom/huawei/phoneserviceuni/common/e/b;->a(Ljava/io/InputStream;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lo/uz$a;->a(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/net/ProtocolException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 148
    const-string v0, "NspRequest"

    invoke-static {v2, v0}, Lcom/huawei/phoneserviceuni/common/e/b;->a(Ljava/io/InputStream;Ljava/lang/String;)V

    .line 149
    const-string v0, "NspRequest"

    invoke-static {v3, v0}, Lcom/huawei/phoneserviceuni/common/e/b;->a(Ljava/io/DataOutputStream;Ljava/lang/String;)V

    .line 150
    goto :goto_0

    .line 139
    :catch_0
    move-exception v5

    .line 140
    const-string v0, "NspRequest"

    :try_start_1
    invoke-static {v5, v0}, Lcom/huawei/phoneserviceuni/common/e/c;->a(Ljava/lang/Exception;Ljava/lang/String;)V

    .line 141
    throw v5

    .line 142
    :catch_1
    move-exception v5

    .line 143
    const-string v0, "NspRequest"

    invoke-static {v5, v0}, Lcom/huawei/phoneserviceuni/common/e/c;->a(Ljava/lang/Exception;Ljava/lang/String;)V

    .line 144
    throw v5

    .line 145
    :catch_2
    move-exception v5

    .line 146
    const-string v0, "NspRequest"

    invoke-static {v5, v0}, Lcom/huawei/phoneserviceuni/common/e/c;->a(Ljava/lang/Exception;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 148
    const-string v0, "NspRequest"

    invoke-static {v2, v0}, Lcom/huawei/phoneserviceuni/common/e/b;->a(Ljava/io/InputStream;Ljava/lang/String;)V

    .line 149
    const-string v0, "NspRequest"

    invoke-static {v3, v0}, Lcom/huawei/phoneserviceuni/common/e/b;->a(Ljava/io/DataOutputStream;Ljava/lang/String;)V

    .line 150
    goto :goto_0

    .line 148
    :catchall_0
    move-exception v6

    const-string v0, "NspRequest"

    invoke-static {v2, v0}, Lcom/huawei/phoneserviceuni/common/e/b;->a(Ljava/io/InputStream;Ljava/lang/String;)V

    .line 149
    const-string v0, "NspRequest"

    invoke-static {v3, v0}, Lcom/huawei/phoneserviceuni/common/e/b;->a(Ljava/io/DataOutputStream;Ljava/lang/String;)V

    throw v6

    .line 151
    :goto_0
    return-object v4
.end method

.method public c(I)V
    .locals 0

    .line 78
    iput p1, p0, Lo/vb;->g:I

    .line 79
    return-void
.end method

.method public e()Lo/uz$a;
    .locals 8

    .line 92
    const/4 v4, 0x0

    .line 95
    iget-object v0, p0, Lo/vb;->d:Landroid/content/Context;

    iget-object v1, p0, Lo/vb;->b:Ljava/lang/String;

    iget-object v2, p0, Lo/vb;->e:Ljava/lang/String;

    iget-object v3, p0, Lo/vb;->a:Ljava/lang/String;

    invoke-virtual {p0, v0, v1, v2, v3}, Lo/vb;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 96
    new-instance v6, Ljava/net/URL;

    invoke-direct {v6, v5}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 98
    const-string v0, "http://"

    invoke-virtual {v5, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 100
    const/4 v7, 0x0

    .line 101
    invoke-virtual {v6}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ljava/net/HttpURLConnection;

    .line 102
    iget-object v0, p0, Lo/vb;->d:Landroid/content/Context;

    invoke-virtual {p0, v0, v7}, Lo/vb;->b(Landroid/content/Context;Ljava/net/HttpURLConnection;)Lo/uz$a;

    move-result-object v4

    .line 103
    goto :goto_0

    :cond_0
    const-string v0, "https://"

    invoke-virtual {v5, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 105
    const/4 v7, 0x0

    .line 106
    invoke-static {}, Lcom/huawei/phoneserviceuni/common/b/a;->a()V

    .line 107
    invoke-virtual {v6}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ljavax/net/ssl/HttpsURLConnection;

    .line 108
    iget-object v0, p0, Lo/vb;->d:Landroid/content/Context;

    invoke-virtual {p0, v0, v7}, Lo/vb;->b(Landroid/content/Context;Ljava/net/HttpURLConnection;)Lo/uz$a;

    move-result-object v4

    .line 111
    :cond_1
    :goto_0
    return-object v4
.end method
