.class Lcom/huawei/hms/update/provider/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Landroid/content/Context;

.field private b:Ljava/lang/String;


# direct methods
.method constructor <init>()V
    .locals 0

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private a()Ljava/lang/String;
    .locals 5

    .line 65
    iget-object v0, p0, Lcom/huawei/hms/update/provider/a;->a:Landroid/content/Context;

    const-string v1, "mContext is null, call setContext first."

    invoke-static {v0, v1}, Lcom/huawei/hms/c/a;->b(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/content/Context;

    .line 67
    move-object v3, p0

    monitor-enter v3

    .line 68
    :try_start_0
    iget-object v0, p0, Lcom/huawei/hms/update/provider/a;->b:Ljava/lang/String;

    if-nez v0, :cond_1

    .line 69
    invoke-virtual {v2}, Landroid/content/Context;->getExternalCacheDir()Ljava/io/File;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 70
    invoke-virtual {v2}, Landroid/content/Context;->getExternalCacheDir()Ljava/io/File;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/hms/update/provider/a;->a(Ljava/io/File;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hms/update/provider/a;->b:Ljava/lang/String;

    goto :goto_0

    .line 72
    :cond_0
    invoke-virtual {v2}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/hms/update/provider/a;->a(Ljava/io/File;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hms/update/provider/a;->b:Ljava/lang/String;

    .line 76
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/huawei/hms/update/provider/a;->b:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v3

    return-object v0

    .line 77
    :catchall_0
    move-exception v4

    monitor-exit v3

    throw v4
.end method

.method private static a(Ljava/io/File;)Ljava/lang/String;
    .locals 2

    .line 187
    if-nez p0, :cond_0

    .line 188
    const/4 v0, 0x0

    return-object v0

    .line 191
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Ljava/io/File;->getCanonicalPath()Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 192
    :catch_0
    move-exception v1

    .line 193
    const/4 v0, 0x0

    return-object v0
.end method

.method private static b(Ljava/io/File;)Ljava/io/File;
    .locals 2

    .line 204
    if-nez p0, :cond_0

    .line 205
    const/4 v0, 0x0

    return-object v0

    .line 208
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Ljava/io/File;->getCanonicalFile()Ljava/io/File;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 209
    :catch_0
    move-exception v1

    .line 210
    const/4 v0, 0x0

    return-object v0
.end method

.method private b(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 107
    invoke-direct {p0}, Lcom/huawei/hms/update/provider/a;->a()Ljava/lang/String;

    move-result-object v2

    .line 108
    if-nez v2, :cond_0

    .line 109
    const/4 v0, 0x0

    return-object v0

    .line 112
    :cond_0
    invoke-virtual {p1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 113
    const/4 v0, 0x0

    return-object v0

    .line 117
    :cond_1
    const-string v0, "/"

    invoke-virtual {v2, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 118
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v3

    goto :goto_0

    .line 120
    :cond_2
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v3, v0, 0x1

    .line 123
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ContentUriHelper"

    invoke-static {v1}, Landroid/net/Uri;->encode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x2f

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p1, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private c(Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    .line 153
    invoke-direct {p0}, Lcom/huawei/hms/update/provider/a;->a()Ljava/lang/String;

    move-result-object v2

    .line 154
    if-nez v2, :cond_0

    .line 155
    const/4 v0, 0x0

    return-object v0

    .line 158
    :cond_0
    const/16 v0, 0x2f

    const/4 v1, 0x1

    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->indexOf(II)I

    move-result v3

    .line 159
    if-gez v3, :cond_1

    .line 160
    const/4 v0, 0x0

    return-object v0

    .line 163
    :cond_1
    const/4 v0, 0x1

    invoke-virtual {p1, v0, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/net/Uri;->decode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 164
    const-string v0, "ContentUriHelper"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 165
    const/4 v0, 0x0

    return-object v0

    .line 168
    :cond_2
    new-instance v0, Ljava/io/File;

    add-int/lit8 v1, v3, 0x1

    invoke-virtual {p1, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/net/Uri;->decode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v2, v1}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v0}, Lcom/huawei/hms/update/provider/a;->a(Ljava/io/File;)Ljava/lang/String;

    move-result-object v5

    .line 169
    if-nez v5, :cond_3

    .line 170
    const/4 v0, 0x0

    return-object v0

    .line 173
    :cond_3
    invoke-virtual {v5, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 174
    const/4 v0, 0x0

    return-object v0

    .line 177
    :cond_4
    return-object v5
.end method


# virtual methods
.method public a(Ljava/io/File;Ljava/lang/String;)Landroid/net/Uri;
    .locals 4

    .line 87
    invoke-static {p1}, Lcom/huawei/hms/update/provider/a;->a(Ljava/io/File;)Ljava/lang/String;

    move-result-object v2

    .line 88
    if-nez v2, :cond_0

    .line 89
    const/4 v0, 0x0

    return-object v0

    .line 92
    :cond_0
    invoke-direct {p0, v2}, Lcom/huawei/hms/update/provider/a;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 93
    if-nez v3, :cond_1

    .line 94
    const/4 v0, 0x0

    return-object v0

    .line 97
    :cond_1
    new-instance v0, Landroid/net/Uri$Builder;

    invoke-direct {v0}, Landroid/net/Uri$Builder;-><init>()V

    const-string v1, "content"

    invoke-virtual {v0, v1}, Landroid/net/Uri$Builder;->scheme(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v0

    invoke-virtual {v0, p2}, Landroid/net/Uri$Builder;->authority(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/net/Uri$Builder;->encodedPath(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    move-result-object v0

    return-object v0
.end method

.method a(Landroid/net/Uri;)Ljava/io/File;
    .locals 3

    .line 133
    invoke-virtual {p1}, Landroid/net/Uri;->getEncodedPath()Ljava/lang/String;

    move-result-object v1

    .line 134
    if-nez v1, :cond_0

    .line 135
    const/4 v0, 0x0

    return-object v0

    .line 138
    :cond_0
    invoke-direct {p0, v1}, Lcom/huawei/hms/update/provider/a;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 139
    if-nez v2, :cond_1

    .line 140
    const/4 v0, 0x0

    return-object v0

    .line 143
    :cond_1
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lcom/huawei/hms/update/provider/a;->b(Ljava/io/File;)Ljava/io/File;

    move-result-object v0

    return-object v0
.end method

.method public a(Ljava/lang/String;)Ljava/io/File;
    .locals 2

    .line 51
    invoke-direct {p0}, Lcom/huawei/hms/update/provider/a;->a()Ljava/lang/String;

    move-result-object v1

    .line 52
    if-nez v1, :cond_0

    .line 53
    const/4 v0, 0x0

    return-object v0

    .line 56
    :cond_0
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, v1, p1}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v0}, Lcom/huawei/hms/update/provider/a;->b(Ljava/io/File;)Ljava/io/File;

    move-result-object v0

    return-object v0
.end method

.method public a(Landroid/content/Context;)V
    .locals 1

    .line 40
    const-string v0, "context nust not be null."

    invoke-static {p1, v0}, Lcom/huawei/hms/c/a;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 41
    iput-object p1, p0, Lcom/huawei/hms/update/provider/a;->a:Landroid/content/Context;

    .line 42
    return-void
.end method
