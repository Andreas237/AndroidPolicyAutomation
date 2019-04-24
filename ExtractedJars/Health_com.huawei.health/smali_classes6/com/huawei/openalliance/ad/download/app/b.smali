.class public Lcom/huawei/openalliance/ad/download/app/b;
.super Lcom/huawei/openalliance/ad/download/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/huawei/openalliance/ad/download/b<Lcom/huawei/openalliance/ad/download/app/c;>;"
    }
.end annotation


# static fields
.field private static final f:[B

.field private static g:Lcom/huawei/openalliance/ad/download/app/b;


# instance fields
.field private h:Lcom/huawei/openalliance/ad/download/app/a;

.field private i:Landroid/content/BroadcastReceiver;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [B

    sput-object v0, Lcom/huawei/openalliance/ad/download/app/b;->f:[B

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 3

    invoke-direct {p0, p1}, Lcom/huawei/openalliance/ad/download/b;-><init>(Landroid/content/Context;)V

    new-instance v0, Lcom/huawei/openalliance/ad/download/app/b$6;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/download/app/b$6;-><init>(Lcom/huawei/openalliance/ad/download/app/b;)V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/download/app/b;->i:Landroid/content/BroadcastReceiver;

    :try_start_0
    invoke-super {p0}, Lcom/huawei/openalliance/ad/download/b;->a()V

    new-instance v0, Lcom/huawei/openalliance/ad/download/app/a;

    invoke-direct {v0, p1}, Lcom/huawei/openalliance/ad/download/app/a;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/download/app/b;->h:Lcom/huawei/openalliance/ad/download/app/a;

    iget-object v0, p0, Lcom/huawei/openalliance/ad/download/app/b;->h:Lcom/huawei/openalliance/ad/download/app/a;

    invoke-super {p0, v0}, Lcom/huawei/openalliance/ad/download/b;->a(Lcom/huawei/openalliance/ad/download/a;)V

    new-instance v0, Lcom/huawei/openalliance/ad/download/app/b$1;

    invoke-direct {v0, p0, p1}, Lcom/huawei/openalliance/ad/download/app/b$1;-><init>(Lcom/huawei/openalliance/ad/download/app/b;Landroid/content/Context;)V

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/d;->d(Ljava/lang/Runnable;)V

    new-instance v2, Landroid/content/IntentFilter;

    const-string v0, "android.net.conn.CONNECTIVITY_CHANGE"

    invoke-direct {v2, v0}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    const-string v0, "android.net.wifi.WIFI_STATE_CHANGED"

    invoke-virtual {v2, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    const-string v0, "android.net.wifi.STATE_CHANGE"

    invoke-virtual {v2, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/download/app/b;->i:Landroid/content/BroadcastReceiver;

    invoke-virtual {p1, v0, v2}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    goto :goto_0

    :catch_0
    move-exception v2

    const-string v0, "AppDownloadManager"

    const-string v1, "init IllegalStateException"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :catch_1
    move-exception v2

    const-string v0, "AppDownloadManager"

    const-string v1, "init exception"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method static synthetic a(Lcom/huawei/openalliance/ad/download/app/b;Lcom/huawei/openalliance/ad/inter/data/AppInfo;)Lcom/huawei/openalliance/ad/download/app/c;
    .locals 1

    invoke-direct {p0, p1}, Lcom/huawei/openalliance/ad/download/app/b;->g(Lcom/huawei/openalliance/ad/inter/data/AppInfo;)Lcom/huawei/openalliance/ad/download/app/c;

    move-result-object v0

    return-object v0
.end method

.method private a(Lcom/huawei/openalliance/ad/inter/data/AppInfo;Lcom/huawei/openalliance/ad/download/app/c;Ljava/io/File;)Lcom/huawei/openalliance/ad/download/app/c;
    .locals 6

    invoke-virtual {p3}, Ljava/io/File;->length()J

    move-result-wide v4

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/inter/data/AppInfo;->getFileSize()J

    move-result-wide v0

    cmp-long v0, v0, v4

    if-nez v0, :cond_2

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/inter/data/AppInfo;->getSha256()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p3}, Lcom/huawei/openalliance/ad/utils/i;->a(Ljava/lang/String;Ljava/io/File;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/16 v0, 0x64

    invoke-virtual {p2, v0}, Lcom/huawei/openalliance/ad/download/app/c;->b(I)V

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/inter/data/AppInfo;->getFileSize()J

    move-result-wide v0

    invoke-virtual {p2, v0, v1}, Lcom/huawei/openalliance/ad/download/app/c;->b(J)V

    invoke-virtual {p0, p2}, Lcom/huawei/openalliance/ad/download/app/b;->b(Lcom/huawei/openalliance/ad/download/e;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/huawei/openalliance/ad/download/d;->d:Lcom/huawei/openalliance/ad/download/d;

    invoke-virtual {p2, v0}, Lcom/huawei/openalliance/ad/download/app/c;->a(Lcom/huawei/openalliance/ad/download/d;)V

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    goto :goto_0

    :cond_1
    invoke-static {p3}, Lcom/huawei/openalliance/ad/utils/i;->a(Ljava/io/File;)Z

    const/4 p2, 0x0

    goto :goto_0

    :cond_2
    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/inter/data/AppInfo;->getFileSize()J

    move-result-wide v0

    cmp-long v0, v0, v4

    if-lez v0, :cond_4

    const-wide/16 v0, 0x64

    mul-long/2addr v0, v4

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/inter/data/AppInfo;->getFileSize()J

    move-result-wide v2

    div-long/2addr v0, v2

    long-to-int v0, v0

    invoke-virtual {p2, v0}, Lcom/huawei/openalliance/ad/download/app/c;->b(I)V

    invoke-virtual {p2, v4, v5}, Lcom/huawei/openalliance/ad/download/app/c;->b(J)V

    invoke-virtual {p0, p2}, Lcom/huawei/openalliance/ad/download/app/b;->b(Lcom/huawei/openalliance/ad/download/e;)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p0, p2}, Lcom/huawei/openalliance/ad/download/app/b;->b(Lcom/huawei/openalliance/ad/download/e;)Z

    sget-object v0, Lcom/huawei/openalliance/ad/download/d;->a:Lcom/huawei/openalliance/ad/download/d;

    invoke-virtual {p2, v0}, Lcom/huawei/openalliance/ad/download/app/c;->a(Lcom/huawei/openalliance/ad/download/d;)V

    goto :goto_0

    :cond_3
    const/4 p2, 0x0

    goto :goto_0

    :cond_4
    invoke-static {p3}, Lcom/huawei/openalliance/ad/utils/i;->a(Ljava/io/File;)Z

    const/4 p2, 0x0

    :goto_0
    return-object p2
.end method

.method static synthetic a(Lcom/huawei/openalliance/ad/download/app/b;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/download/app/b;->b:Ljava/lang/String;

    return-object p1
.end method

.method public static a(Landroid/content/Context;)V
    .locals 3

    sget-object v1, Lcom/huawei/openalliance/ad/download/app/b;->f:[B

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/huawei/openalliance/ad/download/app/b;->g:Lcom/huawei/openalliance/ad/download/app/b;

    if-nez v0, :cond_0

    new-instance v0, Lcom/huawei/openalliance/ad/download/app/b;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/download/app/b;-><init>(Landroid/content/Context;)V

    sput-object v0, Lcom/huawei/openalliance/ad/download/app/b;->g:Lcom/huawei/openalliance/ad/download/app/b;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2

    :goto_0
    return-void
.end method

.method static synthetic a(Lcom/huawei/openalliance/ad/download/app/b;)V
    .locals 0

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/download/app/b;->g()V

    return-void
.end method

.method private a(Ljava/lang/String;[Ljava/lang/String;)V
    .locals 11

    move-object v5, p2

    array-length v6, v5

    const/4 v7, 0x0

    :goto_0
    if-ge v7, v6, :cond_4

    aget-object v8, v5, v7

    const-string v0, ".apk"

    invoke-virtual {v8, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    new-instance v4, Ljava/io/File;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v4, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4}, Ljava/io/File;->isDirectory()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {v4}, Ljava/io/File;->lastModified()J

    move-result-wide v2

    sub-long/2addr v0, v2

    const-wide/32 v2, 0xa4cb800

    cmp-long v0, v0, v2

    if-lez v0, :cond_3

    const-string v0, "AppDownloadManager"

    const-string v1, "remove timeout file"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0, v8}, Lcom/huawei/openalliance/ad/download/app/b;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {p0, v9}, Lcom/huawei/openalliance/ad/download/app/b;->b(Ljava/lang/String;)Lcom/huawei/openalliance/ad/download/app/c;

    move-result-object v10

    if-eqz v10, :cond_2

    invoke-virtual {p0, v10}, Lcom/huawei/openalliance/ad/download/app/b;->c(Lcom/huawei/openalliance/ad/download/app/c;)Z

    goto :goto_1

    :cond_2
    invoke-static {v4}, Lcom/huawei/openalliance/ad/utils/i;->e(Ljava/io/File;)V

    :cond_3
    :goto_1
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    :cond_4
    return-void
.end method

.method private a(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/openalliance/ad/download/app/c;>;)V"
        }
    .end annotation

    invoke-static {p1}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/openalliance/ad/download/app/c;

    invoke-virtual {v3}, Lcom/huawei/openalliance/ad/download/app/c;->o()Lcom/huawei/openalliance/ad/download/e$b;

    move-result-object v0

    sget-object v1, Lcom/huawei/openalliance/ad/download/e$b;->c:Lcom/huawei/openalliance/ad/download/e$b;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p0, v3, v0}, Lcom/huawei/openalliance/ad/download/app/b;->a(Lcom/huawei/openalliance/ad/download/e;Z)V

    :cond_0
    goto :goto_0

    :cond_1
    return-void
.end method

.method private a(Lcom/huawei/openalliance/ad/inter/data/AppInfo;Z)Z
    .locals 1

    invoke-static {p1}, Lcom/huawei/openalliance/ad/download/app/b;->f(Lcom/huawei/openalliance/ad/inter/data/AppInfo;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/inter/data/AppInfo;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/openalliance/ad/download/app/b;->b(Ljava/lang/String;)Lcom/huawei/openalliance/ad/download/app/c;

    move-result-object v0

    invoke-virtual {p0, v0, p2}, Lcom/huawei/openalliance/ad/download/app/b;->b(Lcom/huawei/openalliance/ad/download/e;Z)Z

    move-result v0

    return v0
.end method

.method static synthetic b(Lcom/huawei/openalliance/ad/download/app/b;)Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/download/app/b;->a:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic b(Landroid/content/Context;)Ljava/lang/String;
    .locals 1

    invoke-static {p0}, Lcom/huawei/openalliance/ad/download/app/b;->c(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static synthetic c(Lcom/huawei/openalliance/ad/download/app/b;)Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/download/app/b;->a:Landroid/content/Context;

    return-object v0
.end method

.method private static c(Landroid/content/Context;)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p0}, Lcom/huawei/openalliance/ad/utils/ab;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "hiad"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "apk"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private c(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    const-string v0, ".apk"

    invoke-virtual {p1, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v1

    if-lez v1, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method static synthetic d(Lcom/huawei/openalliance/ad/download/app/b;)V
    .locals 0

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/download/app/b;->f()V

    return-void
.end method

.method public static e()Lcom/huawei/openalliance/ad/download/app/b;
    .locals 4

    sget-object v2, Lcom/huawei/openalliance/ad/download/app/b;->f:[B

    monitor-enter v2

    :try_start_0
    sget-object v0, Lcom/huawei/openalliance/ad/download/app/b;->g:Lcom/huawei/openalliance/ad/download/app/b;

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "AppDownloadManager instance is not init!"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    sget-object v0, Lcom/huawei/openalliance/ad/download/app/b;->g:Lcom/huawei/openalliance/ad/download/app/b;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    return-object v0

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3
.end method

.method private f()V
    .locals 4

    iget-object v0, p0, Lcom/huawei/openalliance/ad/download/app/b;->e:Lcom/huawei/openalliance/ad/download/c;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/download/c;->c()Ljava/util/List;

    move-result-object v3

    invoke-static {}, Lcom/huawei/openalliance/ad/g/c;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "AppDownloadManager"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "resumeAllTask, task.size:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v0

    if-gtz v0, :cond_1

    return-void

    :cond_1
    invoke-direct {p0, v3}, Lcom/huawei/openalliance/ad/download/app/b;->a(Ljava/util/List;)V

    return-void
.end method

.method private static f(Lcom/huawei/openalliance/ad/inter/data/AppInfo;)Z
    .locals 4

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/inter/data/AppInfo;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/inter/data/AppInfo;->getDownloadUrl()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/inter/data/AppInfo;->getSha256()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/inter/data/AppInfo;->getFileSize()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-gtz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private g(Lcom/huawei/openalliance/ad/inter/data/AppInfo;)Lcom/huawei/openalliance/ad/download/app/c;
    .locals 3

    if-nez p1, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    invoke-direct {p0, p1}, Lcom/huawei/openalliance/ad/download/app/b;->h(Lcom/huawei/openalliance/ad/inter/data/AppInfo;)Lcom/huawei/openalliance/ad/download/app/c;

    move-result-object v1

    if-nez v1, :cond_1

    const/4 v0, 0x0

    return-object v0

    :cond_1
    new-instance v2, Ljava/io/File;

    invoke-virtual {v1}, Lcom/huawei/openalliance/ad/download/app/c;->d()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_2

    new-instance v2, Ljava/io/File;

    invoke-virtual {v1}, Lcom/huawei/openalliance/ad/download/app/c;->e()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_2

    const/4 v0, 0x0

    return-object v0

    :cond_2
    invoke-direct {p0, p1, v1, v2}, Lcom/huawei/openalliance/ad/download/app/b;->a(Lcom/huawei/openalliance/ad/inter/data/AppInfo;Lcom/huawei/openalliance/ad/download/app/c;Ljava/io/File;)Lcom/huawei/openalliance/ad/download/app/c;

    move-result-object v1

    return-object v1
.end method

.method private g()V
    .locals 5

    :try_start_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/huawei/openalliance/ad/download/app/b;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "tmp"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/io/File;

    invoke-direct {v3, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3}, Ljava/io/File;->list()[Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_0

    array-length v0, v4
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    if-gtz v0, :cond_1

    :cond_0
    return-void

    :cond_1
    :try_start_1
    invoke-direct {p0, v2, v4}, Lcom/huawei/openalliance/ad/download/app/b;->a(Ljava/lang/String;[Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    :catch_0
    move-exception v2

    const-string v0, "AppDownloadManager"

    const-string v1, "deleteTimeoutFile RuntimeException"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :catch_1
    move-exception v2

    const-string v0, "AppDownloadManager"

    const-string v1, "deleteTimeoutFile exception"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method private h(Lcom/huawei/openalliance/ad/inter/data/AppInfo;)Lcom/huawei/openalliance/ad/download/app/c;
    .locals 3

    new-instance v0, Lcom/huawei/openalliance/ad/download/app/c$a;

    invoke-direct {v0}, Lcom/huawei/openalliance/ad/download/app/c$a;-><init>()V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/download/app/c$a;->a(Z)Lcom/huawei/openalliance/ad/download/app/c$a;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/huawei/openalliance/ad/download/app/c$a;->a(Lcom/huawei/openalliance/ad/inter/data/AppInfo;)Lcom/huawei/openalliance/ad/download/app/c$a;

    move-result-object v0

    invoke-virtual {p0, p1}, Lcom/huawei/openalliance/ad/download/app/b;->d(Lcom/huawei/openalliance/ad/inter/data/AppInfo;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/download/app/c$a;->a(Ljava/lang/String;)Lcom/huawei/openalliance/ad/download/app/c$a;

    move-result-object v0

    invoke-virtual {p0, p1}, Lcom/huawei/openalliance/ad/download/app/b;->e(Lcom/huawei/openalliance/ad/inter/data/AppInfo;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/download/app/c$a;->b(Ljava/lang/String;)Lcom/huawei/openalliance/ad/download/app/c$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/download/app/c$a;->a()Lcom/huawei/openalliance/ad/download/app/c;

    move-result-object v2

    return-object v2
.end method


# virtual methods
.method public synthetic a(Ljava/lang/String;)Lcom/huawei/openalliance/ad/download/e;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/huawei/openalliance/ad/download/app/b;->b(Ljava/lang/String;)Lcom/huawei/openalliance/ad/download/app/c;

    move-result-object v0

    return-object v0
.end method

.method protected a(Lcom/huawei/openalliance/ad/download/e$b;)V
    .locals 6

    iget-object v0, p0, Lcom/huawei/openalliance/ad/download/app/b;->e:Lcom/huawei/openalliance/ad/download/c;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/download/c;->d()Ljava/util/List;

    move-result-object v3

    invoke-static {}, Lcom/huawei/openalliance/ad/g/c;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "AppDownloadManager"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "pauseAllTask.begin, task.size:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/openalliance/ad/download/app/c;

    invoke-virtual {p0, v5, p1}, Lcom/huawei/openalliance/ad/download/app/b;->a(Lcom/huawei/openalliance/ad/download/e;Lcom/huawei/openalliance/ad/download/e$b;)V

    goto :goto_0

    :cond_1
    invoke-static {}, Lcom/huawei/openalliance/ad/g/c;->a()Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, "AppDownloadManager"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "pauseAllTask.end, task.size:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    return-void
.end method

.method public a(Lcom/huawei/openalliance/ad/inter/data/AppInfo;Lcom/huawei/openalliance/ad/download/h;)V
    .locals 2

    invoke-static {p1}, Lcom/huawei/openalliance/ad/download/app/b;->f(Lcom/huawei/openalliance/ad/inter/data/AppInfo;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/download/app/b;->h:Lcom/huawei/openalliance/ad/download/app/a;

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/inter/data/AppInfo;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p2}, Lcom/huawei/openalliance/ad/download/app/a;->a(Ljava/lang/String;Lcom/huawei/openalliance/ad/download/h;)V

    :cond_0
    return-void
.end method

.method public a(Lcom/huawei/openalliance/ad/download/app/c;)Z
    .locals 3

    if-nez p1, :cond_0

    const-string v0, "AppDownloadManager"

    const-string v1, "cannot add task, task is null"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    return v0

    :cond_0
    invoke-static {}, Lcom/huawei/openalliance/ad/g/c;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "AppDownloadManager"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "addTask, package:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/download/app/c;->m()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    new-instance v0, Lcom/huawei/openalliance/ad/download/app/b$2;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/download/app/b$2;-><init>(Lcom/huawei/openalliance/ad/download/app/b;)V

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/d;->d(Ljava/lang/Runnable;)V

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/download/app/c;->t()Lcom/huawei/openalliance/ad/inter/data/AppInfo;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/openalliance/ad/download/app/b;->f(Lcom/huawei/openalliance/ad/inter/data/AppInfo;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, 0x0

    return v0

    :cond_2
    invoke-super {p0, p1}, Lcom/huawei/openalliance/ad/download/b;->c(Lcom/huawei/openalliance/ad/download/e;)Z

    move-result v0

    return v0
.end method

.method public a(Lcom/huawei/openalliance/ad/inter/data/AppInfo;)Z
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/huawei/openalliance/ad/download/app/b;->a(Lcom/huawei/openalliance/ad/inter/data/AppInfo;Z)Z

    move-result v0

    return v0
.end method

.method public b(Ljava/lang/String;)Lcom/huawei/openalliance/ad/download/app/c;
    .locals 3

    const/4 v1, 0x0

    invoke-super {p0, p1}, Lcom/huawei/openalliance/ad/download/b;->a(Ljava/lang/String;)Lcom/huawei/openalliance/ad/download/e;

    move-result-object v2

    instance-of v0, v2, Lcom/huawei/openalliance/ad/download/app/c;

    if-eqz v0, :cond_0

    move-object v1, v2

    check-cast v1, Lcom/huawei/openalliance/ad/download/app/c;

    :cond_0
    return-object v1
.end method

.method public b(Lcom/huawei/openalliance/ad/download/app/c;)V
    .locals 1

    if-nez p1, :cond_0

    return-void

    :cond_0
    sget-object v0, Lcom/huawei/openalliance/ad/download/e$b;->b:Lcom/huawei/openalliance/ad/download/e$b;

    invoke-virtual {p0, p1, v0}, Lcom/huawei/openalliance/ad/download/app/b;->a(Lcom/huawei/openalliance/ad/download/e;Lcom/huawei/openalliance/ad/download/e$b;)V

    return-void
.end method

.method public b(Lcom/huawei/openalliance/ad/inter/data/AppInfo;Lcom/huawei/openalliance/ad/download/h;)V
    .locals 2

    invoke-static {p1}, Lcom/huawei/openalliance/ad/download/app/b;->f(Lcom/huawei/openalliance/ad/inter/data/AppInfo;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/download/app/b;->h:Lcom/huawei/openalliance/ad/download/app/a;

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/inter/data/AppInfo;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p2}, Lcom/huawei/openalliance/ad/download/app/a;->b(Ljava/lang/String;Lcom/huawei/openalliance/ad/download/h;)V

    :cond_0
    return-void
.end method

.method public b(Lcom/huawei/openalliance/ad/inter/data/AppInfo;)Z
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, p1, v0}, Lcom/huawei/openalliance/ad/download/app/b;->a(Lcom/huawei/openalliance/ad/inter/data/AppInfo;Z)Z

    move-result v0

    return v0
.end method

.method public c(Lcom/huawei/openalliance/ad/inter/data/AppInfo;)Lcom/huawei/openalliance/ad/download/app/c;
    .locals 2

    invoke-static {p1}, Lcom/huawei/openalliance/ad/download/app/b;->f(Lcom/huawei/openalliance/ad/inter/data/AppInfo;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/inter/data/AppInfo;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/openalliance/ad/download/app/b;->b(Ljava/lang/String;)Lcom/huawei/openalliance/ad/download/app/c;

    move-result-object v1

    if-nez v1, :cond_1

    new-instance v0, Lcom/huawei/openalliance/ad/download/app/b$3;

    invoke-direct {v0, p0, p1}, Lcom/huawei/openalliance/ad/download/app/b$3;-><init>(Lcom/huawei/openalliance/ad/download/app/b;Lcom/huawei/openalliance/ad/inter/data/AppInfo;)V

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/af;->a(Ljava/util/concurrent/Callable;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/huawei/openalliance/ad/download/app/c;

    :cond_1
    return-object v1
.end method

.method public c(Lcom/huawei/openalliance/ad/download/app/c;)Z
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/huawei/openalliance/ad/download/app/b;->b(Lcom/huawei/openalliance/ad/download/e;Z)Z

    move-result v0

    return v0
.end method

.method public synthetic c(Lcom/huawei/openalliance/ad/download/e;)Z
    .locals 1

    move-object v0, p1

    check-cast v0, Lcom/huawei/openalliance/ad/download/app/c;

    invoke-virtual {p0, v0}, Lcom/huawei/openalliance/ad/download/app/b;->a(Lcom/huawei/openalliance/ad/download/app/c;)Z

    move-result v0

    return v0
.end method

.method public d(Lcom/huawei/openalliance/ad/inter/data/AppInfo;)Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lcom/huawei/openalliance/ad/download/app/b;->b:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lcom/huawei/openalliance/ad/download/app/b$4;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/download/app/b$4;-><init>(Lcom/huawei/openalliance/ad/download/app/b;)V

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/af;->a(Ljava/util/concurrent/Callable;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/openalliance/ad/download/app/b;->b:Ljava/lang/String;

    :cond_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/download/app/b;->b:Ljava/lang/String;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/inter/data/AppInfo;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ".apk"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public e(Lcom/huawei/openalliance/ad/inter/data/AppInfo;)Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lcom/huawei/openalliance/ad/download/app/b;->b:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lcom/huawei/openalliance/ad/download/app/b$5;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/download/app/b$5;-><init>(Lcom/huawei/openalliance/ad/download/app/b;)V

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/af;->a(Ljava/util/concurrent/Callable;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/openalliance/ad/download/app/b;->b:Ljava/lang/String;

    :cond_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/download/app/b;->b:Ljava/lang/String;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "tmp"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/inter/data/AppInfo;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ".apk"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
