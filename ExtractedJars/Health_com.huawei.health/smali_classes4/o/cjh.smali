.class public final Lo/cjh;
.super Ljava/lang/Object;


# static fields
.field private static volatile e:Lo/cjh;


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:Landroid/content/Context;


# direct methods
.method private constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo/cjh;->d:Landroid/content/Context;

    invoke-virtual {p1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/cjh;->a:Ljava/lang/String;

    return-void
.end method

.method private a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lo/cjh;->b:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lo/cjh;->b()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/cjh;->b:Ljava/lang/String;

    :cond_0
    iget-object v0, p0, Lo/cjh;->b:Ljava/lang/String;

    return-object v0
.end method

.method private a(Landroid/content/Context;)Ljava/lang/String;
    .locals 6

    const-string v0, "analytics_key"

    invoke-static {p1, v0}, Lo/cjs;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    move-result-object v3

    const-string v0, "analytics_key"

    const-string v1, ""

    invoke-static {v3, v0, v1}, Lo/cjs;->d(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lo/cjq;->a()Ljava/lang/String;

    move-result-object v4

    invoke-direct {p0, v3, v4}, Lo/cjh;->c(Landroid/content/SharedPreferences;Ljava/lang/String;)V

    return-object v4

    :cond_0
    invoke-static {v4}, Lo/cjq;->e(Ljava/lang/String;)Landroid/util/Pair;

    move-result-object v5

    invoke-direct {p0}, Lo/cjh;->a()Ljava/lang/String;

    move-result-object v0

    iget-object v1, v5, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v1, [B

    iget-object v2, v5, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lo/cjq;->e(Ljava/lang/String;[BLjava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, Lo/cjq;->a()Ljava/lang/String;

    move-result-object v4

    invoke-direct {p0, v3, v4}, Lo/cjh;->c(Landroid/content/SharedPreferences;Ljava/lang/String;)V

    return-object v4

    :cond_1
    return-object v4
.end method

.method private a(Ljava/lang/String;)Ljava/lang/String;
    .locals 7

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lo/cjh;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/io/File;

    invoke-direct {v3, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {v3}, Ljava/io/File;->mkdirs()Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "HiAnalytics/aes128key"

    const-string v1, "aes file create fail!"

    invoke-static {v0, v1}, Lo/ciy;->d(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "hianalytics_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ljava/io/File;

    invoke-direct {v5, v2, v4}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0, v5}, Lo/cjh;->d(Ljava/io/File;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, Lo/cjq;->b()Ljava/lang/String;

    move-result-object v6

    invoke-direct {p0, v5, v6}, Lo/cjh;->a(Ljava/io/File;Ljava/lang/String;)V

    :cond_1
    return-object v6
.end method

.method private a(Ljava/io/File;Ljava/lang/String;)V
    .locals 6

    const/4 v2, 0x0

    :try_start_0
    new-instance v0, Ljava/io/FileOutputStream;

    invoke-direct {v0, p1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    move-object v2, v0

    const-string v0, "UTF-8"

    invoke-virtual {p2, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/io/FileOutputStream;->write([B)V

    invoke-virtual {v2}, Ljava/io/FileOutputStream;->flush()V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_3
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v2, :cond_1

    :try_start_1
    invoke-virtual {v2}, Ljava/io/FileOutputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    :catch_0
    move-exception v3

    const-string v0, "HiAnalytics/aes128key"

    const-string v1, "OutputStream is not close"

    invoke-static {v0, v1}, Lo/ciy;->b(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :catch_1
    move-exception v3

    const-string v0, "HiAnalytics/aes128key"

    const-string v1, "not find exc from save info to file !"

    :try_start_2
    invoke-static {v0, v1}, Lo/ciy;->b(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-eqz v2, :cond_1

    :try_start_3
    invoke-virtual {v2}, Ljava/io/FileOutputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    goto :goto_1

    :catch_2
    move-exception v3

    const-string v0, "HiAnalytics/aes128key"

    const-string v1, "OutputStream is not close"

    invoke-static {v0, v1}, Lo/ciy;->b(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :catch_3
    move-exception v3

    const-string v0, "HiAnalytics/aes128key"

    const-string v1, "io exc from write info to file"

    :try_start_4
    invoke-static {v0, v1}, Lo/ciy;->b(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    if-eqz v2, :cond_1

    :try_start_5
    invoke-virtual {v2}, Ljava/io/FileOutputStream;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_4

    goto :goto_1

    :catch_4
    move-exception v3

    const-string v0, "HiAnalytics/aes128key"

    const-string v1, "OutputStream is not close"

    invoke-static {v0, v1}, Lo/ciy;->b(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :catchall_0
    move-exception v4

    if-eqz v2, :cond_0

    :try_start_6
    invoke-virtual {v2}, Ljava/io/FileOutputStream;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_5

    goto :goto_0

    :catch_5
    move-exception v5

    const-string v0, "HiAnalytics/aes128key"

    const-string v1, "OutputStream is not close"

    invoke-static {v0, v1}, Lo/ciy;->b(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    :goto_0
    throw v4

    :cond_1
    :goto_1
    return-void
.end method

.method private b()Ljava/lang/String;
    .locals 6

    invoke-direct {p0}, Lo/cjh;->c()Ljava/lang/String;

    move-result-object v1

    const-string v0, "secondAssembly"

    invoke-direct {p0, v0}, Lo/cjh;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v0, "thirdAssembly"

    invoke-direct {p0, v0}, Lo/cjh;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v0, "fourthAssembly"

    invoke-direct {p0, v0}, Lo/cjh;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v0, "fiveAssembly"

    invoke-direct {p0, v0}, Lo/cjh;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v1, v2, v3, v4, v5}, Lo/cjw;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static b(Landroid/content/Context;)Lo/cjh;
    .locals 3

    const-class v1, Lo/cjh;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lo/cjh;->e:Lo/cjh;

    if-nez v0, :cond_0

    new-instance v0, Lo/cjh;

    invoke-direct {v0, p0}, Lo/cjh;-><init>(Landroid/content/Context;)V

    sput-object v0, Lo/cjh;->e:Lo/cjh;

    :cond_0
    sget-object v0, Lo/cjh;->e:Lo/cjh;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method

.method private c()Ljava/lang/String;
    .locals 5

    invoke-static {}, Lo/cjw;->c()Ljava/lang/String;

    move-result-object v2

    invoke-static {}, Lo/cis;->b()Ljava/lang/String;

    move-result-object v3

    invoke-static {}, Lo/cjr;->d()Ljava/lang/String;

    move-result-object v4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x4

    invoke-static {v0, v1}, Lo/cjw;->d(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private c(Landroid/content/SharedPreferences;Ljava/lang/String;)V
    .locals 6

    invoke-static {}, Lo/cjq;->c()[B

    move-result-object v1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-direct {p0}, Lo/cjh;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v1, p2}, Lo/cjq;->d(Ljava/lang/String;[BLjava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v1, v4}, Lo/cjq;->a([BLjava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v0, "analytics_key"

    invoke-static {p1, v0, v5}, Lo/cjs;->c(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "flashKeyTime"

    invoke-static {p1, v0, v2, v3}, Lo/cjs;->d(Landroid/content/SharedPreferences;Ljava/lang/String;J)V

    return-void
.end method

.method private d(Ljava/io/File;)Ljava/lang/String;
    .locals 10

    const/4 v2, 0x0

    :try_start_0
    new-instance v0, Ljava/io/FileInputStream;

    invoke-direct {v0, p1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    move-object v2, v0

    new-instance v3, Lo/cjk;

    const/16 v0, 0x400

    invoke-direct {v3, v0}, Lo/cjk;-><init>(I)V

    const/16 v0, 0x400

    new-array v4, v0, [B

    :goto_0
    invoke-virtual {v2, v4}, Ljava/io/FileInputStream;->read([B)I

    move-result v0

    move v5, v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    invoke-virtual {v3, v4, v5}, Lo/cjk;->a([BI)V

    goto :goto_0

    :cond_0
    invoke-virtual {v3}, Lo/cjk;->d()I
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_4
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-nez v0, :cond_2

    const-string v6, ""

    const/4 v0, 0x0

    if-eq v0, v2, :cond_1

    :try_start_1
    invoke-virtual {v2}, Ljava/io/FileInputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    :catch_0
    move-exception v7

    const-string v0, "HiAnalytics/aes128key"

    const-string v1, "get info from file :IOException"

    invoke-static {v0, v1}, Lo/ciy;->b(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    :goto_1
    return-object v6

    :cond_2
    :try_start_2
    new-instance v6, Ljava/lang/String;

    invoke-virtual {v3}, Lo/cjk;->e()[B

    move-result-object v0

    const-string v1, "UTF-8"

    invoke-direct {v6, v0, v1}, Ljava/lang/String;-><init>([BLjava/lang/String;)V
    :try_end_2
    .catch Ljava/io/FileNotFoundException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_4
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    const/4 v0, 0x0

    if-eq v0, v2, :cond_3

    :try_start_3
    invoke-virtual {v2}, Ljava/io/FileInputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1

    goto :goto_2

    :catch_1
    move-exception v7

    const-string v0, "HiAnalytics/aes128key"

    const-string v1, "get info from file :IOException"

    invoke-static {v0, v1}, Lo/ciy;->b(Ljava/lang/String;Ljava/lang/String;)V

    :cond_3
    :goto_2
    return-object v6

    :catch_2
    move-exception v3

    const-string v0, "HiAnalytics/aes128key"

    const-string v1, "not find exc from read info to file !"

    :try_start_4
    invoke-static {v0, v1}, Lo/ciy;->b(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    const-string v4, ""

    const/4 v0, 0x0

    if-eq v0, v2, :cond_4

    :try_start_5
    invoke-virtual {v2}, Ljava/io/FileInputStream;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_3

    goto :goto_3

    :catch_3
    move-exception v5

    const-string v0, "HiAnalytics/aes128key"

    const-string v1, "get info from file :IOException"

    invoke-static {v0, v1}, Lo/ciy;->b(Ljava/lang/String;Ljava/lang/String;)V

    :cond_4
    :goto_3
    return-object v4

    :catch_4
    move-exception v3

    const-string v0, "HiAnalytics/aes128key"

    const-string v1, "io exc from read info to file"

    :try_start_6
    invoke-static {v0, v1}, Lo/ciy;->b(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    const-string v4, ""

    const/4 v0, 0x0

    if-eq v0, v2, :cond_5

    :try_start_7
    invoke-virtual {v2}, Ljava/io/FileInputStream;->close()V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_5

    goto :goto_4

    :catch_5
    move-exception v5

    const-string v0, "HiAnalytics/aes128key"

    const-string v1, "get info from file :IOException"

    invoke-static {v0, v1}, Lo/ciy;->b(Ljava/lang/String;Ljava/lang/String;)V

    :cond_5
    :goto_4
    return-object v4

    :catchall_0
    move-exception v8

    const/4 v0, 0x0

    if-eq v0, v2, :cond_6

    :try_start_8
    invoke-virtual {v2}, Ljava/io/FileInputStream;->close()V
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_6

    goto :goto_5

    :catch_6
    move-exception v9

    const-string v0, "HiAnalytics/aes128key"

    const-string v1, "get info from file :IOException"

    invoke-static {v0, v1}, Lo/ciy;->b(Ljava/lang/String;Ljava/lang/String;)V

    :cond_6
    :goto_5
    throw v8
.end method

.method private d()V
    .locals 6

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lo/cjh;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "secondAssembly"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lo/cjh;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "thirdAssembly"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lo/cjh;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "fourthAssembly"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lo/cjh;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "fiveAssembly"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    new-instance v0, Ljava/io/File;

    const-string v1, "hianalytics_secondAssembly"

    invoke-direct {v0, v2, v1}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Lo/cjq;->b()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lo/cjh;->a(Ljava/io/File;Ljava/lang/String;)V

    new-instance v0, Ljava/io/File;

    const-string v1, "hianalytics_thirdAssembly"

    invoke-direct {v0, v3, v1}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Lo/cjq;->b()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lo/cjh;->a(Ljava/io/File;Ljava/lang/String;)V

    new-instance v0, Ljava/io/File;

    const-string v1, "hianalytics_fourthAssembly"

    invoke-direct {v0, v4, v1}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Lo/cjq;->b()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lo/cjh;->a(Ljava/io/File;Ljava/lang/String;)V

    new-instance v0, Ljava/io/File;

    const-string v1, "hianalytics_fiveAssembly"

    invoke-direct {v0, v5, v1}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Lo/cjq;->b()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lo/cjh;->a(Ljava/io/File;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public c(Ljava/lang/String;)V
    .locals 9

    iget-object v0, p0, Lo/cjh;->d:Landroid/content/Context;

    const-string v1, "analytics_key"

    invoke-static {v0, v1}, Lo/cjs;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    move-result-object v4

    const-string v0, "flashKeyTime"

    const-wide/16 v1, -0x1

    invoke-static {v4, v0, v1, v2}, Lo/cjs;->b(Landroid/content/SharedPreferences;Ljava/lang/String;J)J

    move-result-wide v5

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sub-long/2addr v0, v5

    const-wide/32 v2, 0x2932e00

    cmp-long v0, v0, v2

    if-lez v0, :cond_2

    iput-object p1, p0, Lo/cjh;->c:Ljava/lang/String;

    const-string v0, "assemblyFlash"

    const-wide/16 v1, -0x1

    invoke-static {v4, v0, v1, v2}, Lo/cjs;->b(Landroid/content/SharedPreferences;Ljava/lang/String;J)J

    move-result-wide v7

    const-wide/16 v0, -0x1

    cmp-long v0, v7, v0

    if-nez v0, :cond_0

    const-string v0, "assemblyFlash"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-static {v4, v0, v1, v2}, Lo/cjs;->d(Landroid/content/SharedPreferences;Ljava/lang/String;J)V

    goto :goto_0

    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sub-long/2addr v0, v7

    const-wide v2, 0x757b12c00L

    cmp-long v0, v0, v2

    if-lez v0, :cond_1

    invoke-direct {p0}, Lo/cjh;->d()V

    const-string v0, "assemblyFlash"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-static {v4, v0, v1, v2}, Lo/cjs;->d(Landroid/content/SharedPreferences;Ljava/lang/String;J)V

    invoke-direct {p0}, Lo/cjh;->b()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/cjh;->b:Ljava/lang/String;

    :cond_1
    :goto_0
    invoke-direct {p0, v4, p1}, Lo/cjh;->c(Landroid/content/SharedPreferences;Ljava/lang/String;)V

    :cond_2
    return-void
.end method

.method public e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lo/cjh;->c:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/cjh;->d:Landroid/content/Context;

    invoke-direct {p0, v0}, Lo/cjh;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/cjh;->c:Ljava/lang/String;

    :cond_0
    iget-object v0, p0, Lo/cjh;->c:Ljava/lang/String;

    return-object v0
.end method
