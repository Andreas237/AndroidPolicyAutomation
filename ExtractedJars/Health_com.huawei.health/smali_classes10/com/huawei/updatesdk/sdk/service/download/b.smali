.class public Lcom/huawei/updatesdk/sdk/service/download/b;
.super Lcom/huawei/updatesdk/sdk/service/download/c;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/huawei/updatesdk/sdk/service/download/c;-><init>()V

    return-void
.end method

.method private b()J
    .locals 10

    const/4 v2, 0x0

    const-wide/32 v3, 0x2faf080

    invoke-static {}, Lcom/huawei/updatesdk/sdk/a/c/e;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_0
    invoke-static {}, Lcom/huawei/updatesdk/sdk/service/a/a;->a()Lcom/huawei/updatesdk/sdk/service/a/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/updatesdk/sdk/service/a/a;->d()Ljava/lang/String;

    move-result-object v2

    :goto_0
    :try_start_0
    new-instance v5, Landroid/os/StatFs;

    invoke-direct {v5, v2}, Landroid/os/StatFs;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5}, Landroid/os/StatFs;->getBlockSize()I

    move-result v0

    int-to-long v6, v0

    invoke-virtual {v5}, Landroid/os/StatFs;->getAvailableBlocks()I
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    int-to-long v8, v0

    mul-long v0, v8, v6

    move-wide v3, v0

    goto :goto_1

    :catch_0
    move-exception v5

    const-string v0, "DefaultDiskSpacePolicy"

    const-string v1, "getSDFreeSpace exception:"

    invoke-static {v0, v1, v5}, Lcom/huawei/updatesdk/sdk/a/b/a/a/a;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_1
    return-wide v3
.end method


# virtual methods
.method public a(Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;)Lcom/huawei/updatesdk/sdk/service/download/c$a;
    .locals 7

    new-instance v4, Lcom/huawei/updatesdk/sdk/service/download/c$a;

    invoke-direct {v4}, Lcom/huawei/updatesdk/sdk/service/download/c$a;-><init>()V

    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Lcom/huawei/updatesdk/sdk/service/download/c$a;->a(Z)V

    invoke-direct {p0}, Lcom/huawei/updatesdk/sdk/service/download/b;->b()J

    move-result-wide v5

    invoke-virtual {p1}, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->s()J

    move-result-wide v0

    const-wide/32 v2, 0x500000

    add-long/2addr v0, v2

    cmp-long v0, v0, v5

    if-lez v0, :cond_0

    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Lcom/huawei/updatesdk/sdk/service/download/c$a;->a(Z)V

    invoke-virtual {v4, v5, v6}, Lcom/huawei/updatesdk/sdk/service/download/c$a;->a(J)V

    :cond_0
    invoke-virtual {p0}, Lcom/huawei/updatesdk/sdk/service/download/b;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/updatesdk/sdk/service/download/c$a;->a(Ljava/lang/String;)V

    return-object v4
.end method

.method public a()Ljava/lang/String;
    .locals 4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lcom/huawei/updatesdk/sdk/service/a/a;->a()Lcom/huawei/updatesdk/sdk/service/a/a;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/updatesdk/sdk/service/a/a;->b()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/huawei/updatesdk/sdk/a/c/e;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/AppCache/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

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

    const-string v0, "DefaultDiskSpacePolicy"

    const-string v1, "getAppCache mkdirs failed!"

    invoke-static {v0, v1}, Lcom/huawei/updatesdk/sdk/a/b/a/a/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-object v2
.end method
