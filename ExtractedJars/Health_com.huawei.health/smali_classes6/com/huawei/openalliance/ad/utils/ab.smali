.class public abstract Lcom/huawei/openalliance/ad/utils/ab;
.super Ljava/lang/Object;


# direct methods
.method public static a(Landroid/content/Context;)Ljava/lang/String;
    .locals 4

    const/4 v2, 0x0

    invoke-static {}, Lcom/huawei/openalliance/ad/utils/ab;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1b

    if-gt v0, v1, :cond_0

    invoke-static {p0}, Lcom/huawei/openalliance/ad/utils/ab;->d(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v3

    const/4 v0, 0x0

    if-eq v0, v3, :cond_0

    return-object v3

    :cond_0
    invoke-static {p0}, Lcom/huawei/openalliance/ad/utils/ab;->c(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    return-object v2
.end method

.method public static a()Z
    .locals 3

    const/4 v2, 0x0

    const-string v0, "mounted"

    invoke-static {}, Landroid/os/Environment;->getExternalStorageState()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, Lcom/huawei/openalliance/ad/utils/ab;->b()Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    const/4 v2, 0x1

    :cond_1
    return v2
.end method

.method public static b(Landroid/content/Context;)Ljava/lang/String;
    .locals 4

    const/4 v2, 0x0

    invoke-static {}, Lcom/huawei/openalliance/ad/utils/ab;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1b

    if-gt v0, v1, :cond_0

    invoke-static {p0}, Lcom/huawei/openalliance/ad/utils/ab;->f(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v3

    const/4 v0, 0x0

    if-eq v0, v3, :cond_0

    return-object v3

    :cond_0
    invoke-static {p0}, Lcom/huawei/openalliance/ad/utils/ab;->e(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    return-object v2
.end method

.method protected static b()Z
    .locals 1
    .annotation build Landroid/annotation/TargetApi;
        value = 0x9
    .end annotation

    invoke-static {}, Lcom/huawei/openalliance/ad/utils/ag;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Landroid/os/Environment;->isExternalStorageRemovable()Z

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x1

    return v0
.end method

.method public static c(Landroid/content/Context;)Ljava/lang/String;
    .locals 2

    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    const-string v0, ""

    return-object v0

    :cond_0
    invoke-virtual {p0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v1

    const/4 v0, 0x0

    if-ne v0, v1, :cond_1

    const-string v0, ""

    return-object v0

    :cond_1
    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static d(Landroid/content/Context;)Ljava/lang/String;
    .locals 3

    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    const-string v0, ""

    return-object v0

    :cond_0
    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {p0, v0}, Landroid/content/Context;->getExternalFilesDir(Ljava/lang/String;)Ljava/io/File;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    :cond_1
    goto :goto_0

    :catch_0
    move-exception v2

    const-string v0, "StorageUtils"

    const-string v1, "getExternalFilesDir exception, use memory card folder."

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public static e(Landroid/content/Context;)Ljava/lang/String;
    .locals 2

    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    const-string v0, ""

    return-object v0

    :cond_0
    invoke-virtual {p0}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    move-result-object v1

    const/4 v0, 0x0

    if-ne v0, v1, :cond_1

    const-string v0, ""

    return-object v0

    :cond_1
    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static f(Landroid/content/Context;)Ljava/lang/String;
    .locals 3

    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    const-string v0, ""

    return-object v0

    :cond_0
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getExternalCacheDir()Ljava/io/File;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    :cond_1
    goto :goto_0

    :catch_0
    move-exception v2

    const-string v0, "StorageUtils"

    const-string v1, "getExternalFilesDir exception, use memory card folder."

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    const/4 v0, 0x0

    return-object v0
.end method
