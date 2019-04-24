.class Lo/bbg;
.super Lo/bbl;
.source "SourceFile"


# instance fields
.field private final d:Ljava/util/LinkedHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedHashMap<Ljava/lang/String;Ljava/lang/String;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 4

    .line 23
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-direct {p0, p1, v0, v1}, Lo/bbl;-><init>(Landroid/content/Context;II)V

    .line 19
    new-instance v0, Ljava/util/LinkedHashMap;

    const/4 v1, 0x0

    const/high16 v2, 0x3f400000    # 0.75f

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Ljava/util/LinkedHashMap;-><init>(IFZ)V

    iput-object v0, p0, Lo/bbg;->d:Ljava/util/LinkedHashMap;

    .line 24
    return-void
.end method


# virtual methods
.method protected a(Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 0

    .line 111
    return-void
.end method

.method declared-synchronized b(Ljava/lang/String;)V
    .locals 1

    monitor-enter p0

    .line 185
    :try_start_0
    iget-object v0, p0, Lo/bbg;->d:Ljava/util/LinkedHashMap;

    invoke-virtual {v0, p1, p1}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 186
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method protected c(Ljava/lang/Object;Ljava/lang/String;)Landroid/graphics/Bitmap;
    .locals 5

    .line 156
    if-eqz p1, :cond_0

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 158
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 161
    :cond_1
    move-object v2, p1

    check-cast v2, Lo/bbi;

    .line 163
    invoke-virtual {v2}, Lo/bbi;->g()Ljava/lang/String;

    move-result-object v3

    .line 165
    instance-of v0, p1, Lo/bbf;

    if-eqz v0, :cond_2

    move-object v0, p1

    check-cast v0, Lo/bbf;

    invoke-virtual {v0}, Lo/bbf;->a()Z

    move-result v0

    if-nez v0, :cond_2

    .line 167
    const-string v3, "_sd.jpg"

    .line 170
    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2}, Lo/bbi;->p()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 171
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 173
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 175
    :cond_3
    iget v0, v2, Lo/bbi;->d:I

    iget v1, v2, Lo/bbi;->a:I

    invoke-static {v4, v0, v1}, Lo/bbg;->c(Ljava/lang/String;II)Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0
.end method

.method public d(Ljava/lang/Object;)Landroid/graphics/Bitmap;
    .locals 11

    .line 29
    if-nez p1, :cond_0

    .line 31
    const/4 v0, 0x0

    return-object v0

    .line 33
    :cond_0
    move-object v3, p1

    check-cast v3, Lo/bbi;

    .line 34
    const-string v4, ""

    .line 35
    invoke-virtual {v3}, Lo/bbi;->k()Ljava/lang/String;

    move-result-object v5

    .line 36
    if-nez v5, :cond_1

    .line 38
    const/4 v0, 0x0

    return-object v0

    .line 40
    :cond_1
    move-object v6, v5

    .line 41
    const-string v7, ""

    .line 42
    instance-of v0, p1, Lo/bbf;

    if-eqz v0, :cond_3

    .line 44
    move-object v8, p1

    check-cast v8, Lo/bbf;

    .line 45
    invoke-virtual {v8}, Lo/bbf;->e()Ljava/lang/String;

    move-result-object v6

    .line 46
    invoke-virtual {v8}, Lo/bbf;->h()Z

    move-result v9

    .line 47
    if-eqz v9, :cond_2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "?"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "size=1080"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_2
    move-object v0, v5

    :goto_0
    move-object v5, v0

    .line 48
    invoke-virtual {v3}, Lo/bbi;->g()Ljava/lang/String;

    move-result-object v4

    .line 49
    invoke-virtual {v8}, Lo/bbf;->c()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v7

    .line 51
    :cond_3
    instance-of v0, p1, Lo/baw;

    if-eqz v0, :cond_4

    .line 53
    invoke-static {v6}, Lo/bbj;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    goto :goto_1

    .line 57
    :cond_4
    invoke-static {v6}, Lo/bbj;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 59
    :goto_1
    const/4 v8, 0x0

    .line 62
    :try_start_0
    new-instance v9, Ljava/io/File;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3}, Lo/bbi;->p()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v9, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 63
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v9}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    .line 64
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, v10}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    move-object v8, v0

    .line 65
    invoke-static {p0, v5, v8}, Lo/bbm;->c(Lo/bbg;Ljava/lang/String;Ljava/io/File;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 67
    iget v0, v3, Lo/bbi;->d:I

    iget v1, v3, Lo/bbi;->a:I

    invoke-static {v10, v0, v1}, Lo/bbg;->c(Ljava/lang/String;II)Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 71
    :cond_5
    const-string v0, "ImageFetcher"

    :try_start_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "download image failed, id = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 72
    invoke-static {v8}, Lo/bot;->b(Ljava/io/File;)Z
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0

    .line 79
    goto :goto_2

    .line 75
    :catch_0
    move-exception v9

    .line 77
    invoke-static {v8}, Lo/bot;->b(Ljava/io/File;)Z

    .line 78
    const-string v0, "ImageFetcher"

    const-string v1, "processBitmap failed"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 80
    :goto_2
    const/4 v0, 0x0

    return-object v0
.end method

.method declared-synchronized d(Ljava/lang/String;)V
    .locals 1

    monitor-enter p0

    .line 190
    :try_start_0
    iget-object v0, p0, Lo/bbg;->d:Ljava/util/LinkedHashMap;

    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 191
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method protected e(Ljava/lang/Object;)Landroid/graphics/Bitmap;
    .locals 6

    .line 116
    if-nez p1, :cond_0

    .line 118
    const/4 v0, 0x0

    return-object v0

    .line 120
    :cond_0
    move-object v2, p1

    check-cast v2, Lo/bbi;

    .line 122
    invoke-virtual {v2}, Lo/bbi;->k()Ljava/lang/String;

    move-result-object v3

    .line 124
    const/4 v4, 0x0

    .line 126
    instance-of v0, p1, Lo/bbf;

    if-eqz v0, :cond_1

    .line 128
    move-object v5, p1

    check-cast v5, Lo/bbf;

    .line 129
    invoke-virtual {v5}, Lo/bbf;->e()Ljava/lang/String;

    move-result-object v3

    .line 132
    :cond_1
    instance-of v0, p1, Lo/baw;

    if-eqz v0, :cond_2

    .line 134
    invoke-static {v3}, Lo/bbj;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    goto :goto_0

    .line 138
    :cond_2
    invoke-static {v3}, Lo/bbj;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 141
    :goto_0
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 143
    invoke-virtual {p0, v2, v3}, Lo/bbg;->c(Ljava/lang/Object;Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v4

    goto :goto_1

    .line 147
    :cond_3
    const-string v0, "ImageFetcher"

    const-string v1, " getBitmapFromDiskCache key is empty"

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 150
    :goto_1
    return-object v4
.end method

.method protected e(Ljava/lang/String;Ljava/lang/String;)V
    .locals 7

    .line 86
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 88
    return-void

    .line 91
    :cond_0
    invoke-static {}, Lo/bpk;->b()Lo/bpk;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/bpk;->d(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 93
    return-void

    .line 95
    :cond_1
    invoke-static {p2}, Lo/bbj;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 97
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 99
    new-instance v5, Ljava/io/File;

    invoke-direct {v5, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 100
    invoke-virtual {v5}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 102
    invoke-virtual {v5}, Ljava/io/File;->delete()Z

    move-result v6

    .line 103
    const-string v0, "ImageFetcher"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "cleanBitmapFromDiskCache: Delete file result is "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 105
    :cond_2
    return-void
.end method
