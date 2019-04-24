.class public Lcom/huawei/updatesdk/support/pm/a;
.super Ljava/lang/Object;


# direct methods
.method private static a()V
    .locals 2

    const/4 v0, 0x4

    const/16 v1, -0x2712

    invoke-static {v0, v1}, Lcom/huawei/updatesdk/support/pm/g;->a(II)V

    return-void
.end method

.method protected static a(Landroid/content/Context;Lcom/huawei/updatesdk/support/pm/b;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/huawei/updatesdk/support/pm/a;->b(Landroid/content/Context;Lcom/huawei/updatesdk/support/pm/b;)V

    return-void
.end method

.method private static b(Landroid/content/Context;Lcom/huawei/updatesdk/support/pm/b;)V
    .locals 7

    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    const-string v0, "InstallProcess"

    const-string v1, "system install failed,task is null"

    invoke-static {v0, v1}, Lcom/huawei/updatesdk/sdk/a/b/a/a/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    const-string v0, "InstallProcess"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "systemInstall begin!!!task:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Lcom/huawei/updatesdk/support/pm/b;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/updatesdk/sdk/a/b/a/a/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, Lcom/huawei/updatesdk/support/pm/c$a;->a:Lcom/huawei/updatesdk/support/pm/c$a;

    invoke-virtual {p1, v0}, Lcom/huawei/updatesdk/support/pm/b;->a(Lcom/huawei/updatesdk/support/pm/c$a;)V

    const/4 v0, 0x3

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/updatesdk/support/pm/g;->a(II)V

    new-instance v4, Ljava/io/File;

    invoke-virtual {p1}, Lcom/huawei/updatesdk/support/pm/b;->f()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v4, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {v4}, Ljava/io/File;->isFile()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {v4}, Ljava/io/File;->length()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-gtz v0, :cond_2

    :cond_1
    const-string v0, "InstallProcess"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "system install failed,file not existed filePath:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Lcom/huawei/updatesdk/support/pm/b;->f()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/updatesdk/sdk/a/b/a/a/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x4

    const/16 v1, -0x2713

    invoke-static {v0, v1}, Lcom/huawei/updatesdk/support/pm/g;->a(II)V

    return-void

    :cond_2
    new-instance v5, Landroid/content/Intent;

    const-class v0, Lcom/huawei/updatesdk/support/pm/PackageInstallerActivity;

    invoke-direct {v5, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v0, "install_path"

    invoke-virtual {p1}, Lcom/huawei/updatesdk/support/pm/b;->f()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string v0, "install_packagename"

    invoke-virtual {p1}, Lcom/huawei/updatesdk/support/pm/b;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string v0, "install_change_path_times"

    invoke-virtual {p1}, Lcom/huawei/updatesdk/support/pm/b;->h()I

    move-result v1

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    instance-of v0, p0, Landroid/app/Activity;

    if-nez v0, :cond_3

    const/high16 v0, 0x18000000

    invoke-virtual {v5, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    :cond_3
    :try_start_0
    invoke-virtual {p0, v5}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v6

    invoke-static {}, Lcom/huawei/updatesdk/support/pm/a;->a()V

    const-string v0, "InstallProcess"

    const-string v1, " can not start install !"

    invoke-static {v0, v1, v6}, Lcom/huawei/updatesdk/sdk/a/b/a/a/a;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method
