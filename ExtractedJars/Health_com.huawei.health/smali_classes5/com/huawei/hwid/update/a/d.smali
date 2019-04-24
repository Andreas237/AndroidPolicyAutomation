.class public Lcom/huawei/hwid/update/a/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwid/update/a/a/a;


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Lcom/huawei/hwid/update/b/c;

.field private c:Lcom/huawei/hwid/update/a/a/b;

.field private d:Ljava/io/File;

.field private final e:Lcom/huawei/hwid/update/a/a;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 53
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 46
    new-instance v0, Lcom/huawei/hwid/update/b/b;

    invoke-direct {v0}, Lcom/huawei/hwid/update/b/b;-><init>()V

    iput-object v0, p0, Lcom/huawei/hwid/update/a/d;->b:Lcom/huawei/hwid/update/b/c;

    .line 192
    new-instance v0, Lcom/huawei/hwid/update/a/a;

    invoke-direct {v0}, Lcom/huawei/hwid/update/a/a;-><init>()V

    iput-object v0, p0, Lcom/huawei/hwid/update/a/d;->e:Lcom/huawei/hwid/update/a/a;

    .line 54
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hwid/update/a/d;->a:Landroid/content/Context;

    .line 55
    return-void
.end method

.method static synthetic a(Lcom/huawei/hwid/update/a/d;)Lcom/huawei/hwid/update/a/a;
    .locals 1

    .line 31
    iget-object v0, p0, Lcom/huawei/hwid/update/a/d;->e:Lcom/huawei/hwid/update/a/a;

    return-object v0
.end method

.method private a(Ljava/io/File;ILjava/lang/String;)Lcom/huawei/hwid/update/a/b;
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 269
    new-instance v0, Lcom/huawei/hwid/update/a/d$1;

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move v4, p2

    move-object v5, p3

    invoke-direct/range {v0 .. v5}, Lcom/huawei/hwid/update/a/d$1;-><init>(Lcom/huawei/hwid/update/a/d;Ljava/io/File;IILjava/lang/String;)V

    return-object v0
.end method

.method private declared-synchronized a(III)V
    .locals 2

    monitor-enter p0

    .line 74
    :try_start_0
    iget-object v0, p0, Lcom/huawei/hwid/update/a/d;->c:Lcom/huawei/hwid/update/a/a/b;

    if-eqz v0, :cond_0

    .line 75
    iget-object v0, p0, Lcom/huawei/hwid/update/a/d;->c:Lcom/huawei/hwid/update/a/a/b;

    iget-object v1, p0, Lcom/huawei/hwid/update/a/d;->d:Ljava/io/File;

    invoke-interface {v0, p1, p2, p3, v1}, Lcom/huawei/hwid/update/a/a/b;->a(IIILjava/io/File;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 77
    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method private declared-synchronized a(Lcom/huawei/hwid/update/a/a/b;)V
    .locals 0

    monitor-enter p0

    .line 63
    :try_start_0
    iput-object p1, p0, Lcom/huawei/hwid/update/a/d;->c:Lcom/huawei/hwid/update/a/a/b;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 64
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method static synthetic a(Lcom/huawei/hwid/update/a/d;III)V
    .locals 0

    .line 31
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/hwid/update/a/d;->a(III)V

    return-void
.end method

.method private static a(Ljava/lang/String;Ljava/io/File;)Z
    .locals 2

    .line 173
    invoke-static {p1}, Lcom/huawei/hwid/d/f;->a(Ljava/io/File;)[B

    move-result-object v1

    .line 175
    if-eqz v1, :cond_0

    const/4 v0, 0x1

    invoke-static {v1, v0}, Lcom/huawei/hwid/d/b;->b([BZ)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 92
    const-string v0, "UpdateDownload"

    const-string v1, "OtaUpdateDownload Enter cancel."

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 94
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/huawei/hwid/update/a/d;->a(Lcom/huawei/hwid/update/a/a/b;)V

    .line 95
    iget-object v0, p0, Lcom/huawei/hwid/update/a/d;->b:Lcom/huawei/hwid/update/b/c;

    invoke-interface {v0}, Lcom/huawei/hwid/update/b/c;->b()V

    .line 96
    return-void
.end method

.method public a(Lcom/huawei/hwid/update/a/a/b;Lcom/huawei/hwid/update/a/a/c;)V
    .locals 8

    .line 105
    const-string v0, "callback must not be null."

    invoke-static {p1, v0}, Lcom/huawei/hwid/d/a;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 107
    const-string v0, "UpdateDownload"

    const-string v1, "Enter downloadPackage."

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 109
    invoke-direct {p0, p1}, Lcom/huawei/hwid/update/a/d;->a(Lcom/huawei/hwid/update/a/a/b;)V

    .line 112
    if-eqz p2, :cond_0

    invoke-virtual {p2}, Lcom/huawei/hwid/update/a/a/c;->a()Z

    move-result v0

    if-nez v0, :cond_1

    .line 113
    :cond_0
    const-string v0, "UpdateDownload"

    const-string v1, "In downloadPackage, Invalid update info."

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 114
    const/16 v0, 0x899

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {p0, v0, v1, v2}, Lcom/huawei/hwid/update/a/d;->a(III)V

    .line 115
    return-void

    .line 119
    :cond_1
    invoke-static {}, Landroid/os/Environment;->getExternalStorageState()Ljava/lang/String;

    move-result-object v4

    .line 120
    const-string v0, "mounted"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 121
    const-string v0, "UpdateDownload"

    const-string v1, "In downloadPackage, Invalid external storage for downloading file."

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 122
    const/16 v0, 0x89c

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {p0, v0, v1, v2}, Lcom/huawei/hwid/update/a/d;->a(III)V

    .line 123
    return-void

    .line 126
    :cond_2
    iget-object v5, p2, Lcom/huawei/hwid/update/a/a/c;->b:Ljava/lang/String;

    .line 127
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 128
    const-string v0, "UpdateDownload"

    const-string v1, "In DownloadHelper.downloadPackage, Download the package,  packageName is null: "

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 129
    const/16 v0, 0x899

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {p0, v0, v1, v2}, Lcom/huawei/hwid/update/a/d;->a(III)V

    .line 130
    return-void

    .line 133
    :cond_3
    iget-object v0, p0, Lcom/huawei/hwid/update/a/d;->a:Landroid/content/Context;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ".apk"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/hwid/update/provider/UpdateProvider;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hwid/update/a/d;->d:Ljava/io/File;

    .line 134
    iget-object v0, p0, Lcom/huawei/hwid/update/a/d;->d:Ljava/io/File;

    if-nez v0, :cond_4

    .line 135
    const-string v0, "UpdateDownload"

    const-string v1, "In downloadPackage, Failed to get local file for downloading."

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 136
    const/16 v0, 0x89c

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {p0, v0, v1, v2}, Lcom/huawei/hwid/update/a/d;->a(III)V

    .line 137
    return-void

    .line 141
    :cond_4
    iget-object v0, p0, Lcom/huawei/hwid/update/a/d;->d:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v6

    .line 142
    if-eqz v6, :cond_5

    invoke-virtual {v6}, Ljava/io/File;->mkdirs()Z

    move-result v0

    if-nez v0, :cond_6

    invoke-virtual {v6}, Ljava/io/File;->isDirectory()Z

    move-result v0

    if-nez v0, :cond_6

    .line 143
    :cond_5
    const-string v0, "UpdateDownload"

    const-string v1, "In downloadPackage, Failed to create directory for downloading file."

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 144
    const/16 v0, 0x899

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {p0, v0, v1, v2}, Lcom/huawei/hwid/update/a/d;->a(III)V

    .line 145
    return-void

    .line 149
    :cond_6
    invoke-virtual {v6}, Ljava/io/File;->getUsableSpace()J

    move-result-wide v0

    iget v2, p2, Lcom/huawei/hwid/update/a/a/c;->d:I

    mul-int/lit8 v2, v2, 0x3

    int-to-long v2, v2

    cmp-long v0, v0, v2

    if-gez v0, :cond_7

    .line 150
    const-string v0, "UpdateDownload"

    const-string v1, "In downloadPackage, No space for downloading file."

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 151
    const/16 v0, 0x89b

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {p0, v0, v1, v2}, Lcom/huawei/hwid/update/a/d;->a(III)V

    .line 152
    return-void

    .line 157
    :cond_7
    :try_start_0
    invoke-virtual {p0, p2}, Lcom/huawei/hwid/update/a/d;->a(Lcom/huawei/hwid/update/a/a/c;)V
    :try_end_0
    .catch Lcom/huawei/hwid/update/b/a; {:try_start_0 .. :try_end_0} :catch_0

    .line 162
    goto :goto_0

    .line 159
    :catch_0
    move-exception v7

    .line 160
    const-string v0, "UpdateDownload"

    const-string v1, "In downloadPackage, Canceled to download the update file."

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 161
    const/16 v0, 0x835

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {p0, v0, v1, v2}, Lcom/huawei/hwid/update/a/d;->a(III)V

    .line 163
    :goto_0
    return-void
.end method

.method a(Lcom/huawei/hwid/update/a/a/c;)V
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/huawei/hwid/update/b/a;
        }
    .end annotation

    .line 201
    const-string v0, "UpdateDownload"

    const-string v1, "Enter downloadPackage."

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 203
    const/4 v4, 0x0

    .line 205
    :try_start_0
    iget-object v5, p1, Lcom/huawei/hwid/update/a/a/c;->b:Ljava/lang/String;

    .line 206
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 207
    const-string v0, "UpdateDownload"

    const-string v1, "In DownloadHelper.downloadPackage, Download the package,  packageName is null: "

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 208
    const/16 v0, 0x899

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {p0, v0, v1, v2}, Lcom/huawei/hwid/update/a/d;->a(III)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 256
    iget-object v0, p0, Lcom/huawei/hwid/update/a/d;->b:Lcom/huawei/hwid/update/b/c;

    invoke-interface {v0}, Lcom/huawei/hwid/update/b/c;->a()V

    .line 257
    invoke-static {v4}, Lcom/huawei/hwid/d/c;->a(Ljava/io/OutputStream;)V

    .line 209
    return-void

    .line 212
    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/huawei/hwid/update/a/d;->e:Lcom/huawei/hwid/update/a/a;

    invoke-virtual {p0}, Lcom/huawei/hwid/update/a/d;->b()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1, v5}, Lcom/huawei/hwid/update/a/a;->a(Landroid/content/Context;Ljava/lang/String;)V

    .line 214
    iget-object v0, p0, Lcom/huawei/hwid/update/a/d;->e:Lcom/huawei/hwid/update/a/a;

    iget-object v1, p1, Lcom/huawei/hwid/update/a/a/c;->c:Ljava/lang/String;

    iget v2, p1, Lcom/huawei/hwid/update/a/a/c;->d:I

    iget-object v3, p1, Lcom/huawei/hwid/update/a/a/c;->e:Ljava/lang/String;

    invoke-virtual {v0, v1, v2, v3}, Lcom/huawei/hwid/update/a/a;->b(Ljava/lang/String;ILjava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 216
    iget-object v0, p0, Lcom/huawei/hwid/update/a/d;->e:Lcom/huawei/hwid/update/a/a;

    invoke-virtual {v0}, Lcom/huawei/hwid/update/a/a;->b()I

    move-result v0

    iget-object v1, p0, Lcom/huawei/hwid/update/a/d;->e:Lcom/huawei/hwid/update/a/a;

    invoke-virtual {v1}, Lcom/huawei/hwid/update/a/a;->a()I

    move-result v1

    if-ne v0, v1, :cond_2

    .line 218
    iget-object v0, p1, Lcom/huawei/hwid/update/a/a/c;->e:Ljava/lang/String;

    iget-object v1, p0, Lcom/huawei/hwid/update/a/d;->d:Ljava/io/File;

    invoke-static {v0, v1}, Lcom/huawei/hwid/update/a/d;->a(Ljava/lang/String;Ljava/io/File;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 219
    const/16 v0, 0x7d0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {p0, v0, v1, v2}, Lcom/huawei/hwid/update/a/d;->a(III)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 256
    iget-object v0, p0, Lcom/huawei/hwid/update/a/d;->b:Lcom/huawei/hwid/update/b/c;

    invoke-interface {v0}, Lcom/huawei/hwid/update/b/c;->a()V

    .line 257
    invoke-static {v4}, Lcom/huawei/hwid/d/c;->a(Ljava/io/OutputStream;)V

    .line 220
    return-void

    .line 222
    :cond_1
    :try_start_2
    iget-object v0, p0, Lcom/huawei/hwid/update/a/d;->e:Lcom/huawei/hwid/update/a/a;

    iget-object v1, p1, Lcom/huawei/hwid/update/a/a/c;->c:Ljava/lang/String;

    iget v2, p1, Lcom/huawei/hwid/update/a/a/c;->d:I

    iget-object v3, p1, Lcom/huawei/hwid/update/a/a/c;->e:Ljava/lang/String;

    invoke-virtual {v0, v1, v2, v3}, Lcom/huawei/hwid/update/a/a;->a(Ljava/lang/String;ILjava/lang/String;)V

    .line 223
    iget-object v0, p0, Lcom/huawei/hwid/update/a/d;->d:Ljava/io/File;

    iget v1, p1, Lcom/huawei/hwid/update/a/a/c;->d:I

    invoke-direct {p0, v0, v1, v5}, Lcom/huawei/hwid/update/a/d;->a(Ljava/io/File;ILjava/lang/String;)Lcom/huawei/hwid/update/a/b;

    move-result-object v0

    move-object v4, v0

    goto :goto_0

    .line 227
    :cond_2
    iget-object v0, p0, Lcom/huawei/hwid/update/a/d;->d:Ljava/io/File;

    iget v1, p1, Lcom/huawei/hwid/update/a/a/c;->d:I

    invoke-direct {p0, v0, v1, v5}, Lcom/huawei/hwid/update/a/d;->a(Ljava/io/File;ILjava/lang/String;)Lcom/huawei/hwid/update/a/b;

    move-result-object v0

    move-object v4, v0

    .line 228
    iget-object v0, p0, Lcom/huawei/hwid/update/a/d;->e:Lcom/huawei/hwid/update/a/a;

    invoke-virtual {v0}, Lcom/huawei/hwid/update/a/a;->b()I

    move-result v0

    int-to-long v0, v0

    invoke-virtual {v4, v0, v1}, Lcom/huawei/hwid/update/a/b;->a(J)V

    goto :goto_0

    .line 231
    :cond_3
    iget-object v0, p0, Lcom/huawei/hwid/update/a/d;->e:Lcom/huawei/hwid/update/a/a;

    iget-object v1, p1, Lcom/huawei/hwid/update/a/a/c;->c:Ljava/lang/String;

    iget v2, p1, Lcom/huawei/hwid/update/a/a/c;->d:I

    iget-object v3, p1, Lcom/huawei/hwid/update/a/a/c;->e:Ljava/lang/String;

    invoke-virtual {v0, v1, v2, v3}, Lcom/huawei/hwid/update/a/a;->a(Ljava/lang/String;ILjava/lang/String;)V

    .line 232
    iget-object v0, p0, Lcom/huawei/hwid/update/a/d;->d:Ljava/io/File;

    iget v1, p1, Lcom/huawei/hwid/update/a/a/c;->d:I

    invoke-direct {p0, v0, v1, v5}, Lcom/huawei/hwid/update/a/d;->a(Ljava/io/File;ILjava/lang/String;)Lcom/huawei/hwid/update/a/b;

    move-result-object v0

    move-object v4, v0

    .line 236
    :goto_0
    iget-object v0, p0, Lcom/huawei/hwid/update/a/d;->b:Lcom/huawei/hwid/update/b/c;

    iget-object v1, p1, Lcom/huawei/hwid/update/a/a/c;->c:Ljava/lang/String;

    iget-object v2, p0, Lcom/huawei/hwid/update/a/d;->e:Lcom/huawei/hwid/update/a/a;

    invoke-virtual {v2}, Lcom/huawei/hwid/update/a/a;->b()I

    move-result v2

    iget-object v3, p0, Lcom/huawei/hwid/update/a/d;->e:Lcom/huawei/hwid/update/a/a;

    invoke-virtual {v3}, Lcom/huawei/hwid/update/a/a;->a()I

    move-result v3

    invoke-interface {v0, v1, v4, v2, v3}, Lcom/huawei/hwid/update/b/c;->a(Ljava/lang/String;Ljava/io/OutputStream;II)I

    move-result v6

    .line 237
    const/16 v0, 0xc8

    if-eq v6, v0, :cond_4

    const/16 v0, 0xce

    if-eq v6, v0, :cond_4

    .line 238
    const-string v0, "UpdateDownload"

    const-string v1, "In DownloadHelper.downloadPackage, Download the package"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 239
    const/16 v0, 0x899

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {p0, v0, v1, v2}, Lcom/huawei/hwid/update/a/d;->a(III)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 256
    iget-object v0, p0, Lcom/huawei/hwid/update/a/d;->b:Lcom/huawei/hwid/update/b/c;

    invoke-interface {v0}, Lcom/huawei/hwid/update/b/c;->a()V

    .line 257
    invoke-static {v4}, Lcom/huawei/hwid/d/c;->a(Ljava/io/OutputStream;)V

    .line 240
    return-void

    .line 244
    :cond_4
    :try_start_3
    iget-object v0, p1, Lcom/huawei/hwid/update/a/a/c;->e:Ljava/lang/String;

    iget-object v1, p0, Lcom/huawei/hwid/update/a/d;->d:Ljava/io/File;

    invoke-static {v0, v1}, Lcom/huawei/hwid/update/a/d;->a(Ljava/lang/String;Ljava/io/File;)Z

    move-result v0

    if-nez v0, :cond_5

    .line 245
    const-string v0, "UpdateDownload"

    const-string v1, "verifyHash error"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 246
    const/16 v0, 0x89a

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {p0, v0, v1, v2}, Lcom/huawei/hwid/update/a/d;->a(III)V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 256
    iget-object v0, p0, Lcom/huawei/hwid/update/a/d;->b:Lcom/huawei/hwid/update/b/c;

    invoke-interface {v0}, Lcom/huawei/hwid/update/b/c;->a()V

    .line 257
    invoke-static {v4}, Lcom/huawei/hwid/d/c;->a(Ljava/io/OutputStream;)V

    .line 247
    return-void

    .line 250
    :cond_5
    const/16 v0, 0x7d0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :try_start_4
    invoke-direct {p0, v0, v1, v2}, Lcom/huawei/hwid/update/a/d;->a(III)V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 256
    iget-object v0, p0, Lcom/huawei/hwid/update/a/d;->b:Lcom/huawei/hwid/update/b/c;

    invoke-interface {v0}, Lcom/huawei/hwid/update/b/c;->a()V

    .line 257
    invoke-static {v4}, Lcom/huawei/hwid/d/c;->a(Ljava/io/OutputStream;)V

    .line 258
    goto :goto_1

    .line 252
    :catch_0
    move-exception v5

    .line 253
    const-string v0, "UpdateDownload"

    const-string v1, "In DownloadHelper.downloadPackage, Failed to download."

    :try_start_5
    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 254
    const/16 v0, 0x899

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {p0, v0, v1, v2}, Lcom/huawei/hwid/update/a/d;->a(III)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 256
    iget-object v0, p0, Lcom/huawei/hwid/update/a/d;->b:Lcom/huawei/hwid/update/b/c;

    invoke-interface {v0}, Lcom/huawei/hwid/update/b/c;->a()V

    .line 257
    invoke-static {v4}, Lcom/huawei/hwid/d/c;->a(Ljava/io/OutputStream;)V

    .line 258
    goto :goto_1

    .line 256
    :catchall_0
    move-exception v7

    iget-object v0, p0, Lcom/huawei/hwid/update/a/d;->b:Lcom/huawei/hwid/update/b/c;

    invoke-interface {v0}, Lcom/huawei/hwid/update/b/c;->a()V

    .line 257
    invoke-static {v4}, Lcom/huawei/hwid/d/c;->a(Ljava/io/OutputStream;)V

    throw v7

    .line 259
    :goto_1
    return-void
.end method

.method public b()Landroid/content/Context;
    .locals 1

    .line 84
    iget-object v0, p0, Lcom/huawei/hwid/update/a/d;->a:Landroid/content/Context;

    return-object v0
.end method
