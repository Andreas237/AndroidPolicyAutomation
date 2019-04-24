.class public Lcom/huawei/updatesdk/support/pm/PackageInstallerActivity;
.super Landroid/app/Activity;


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/lang/String;

.field private c:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/updatesdk/support/pm/PackageInstallerActivity;->a:Ljava/lang/String;

    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/updatesdk/support/pm/PackageInstallerActivity;->b:Ljava/lang/String;

    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/updatesdk/support/pm/PackageInstallerActivity;->c:I

    return-void
.end method

.method private a(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;
    .locals 4

    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    const-string v0, "android.intent.action.INSTALL_PACKAGE"

    invoke-virtual {v2, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x18

    if-lt v0, v1, :cond_0

    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ".updateSdk.fileProvider"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/io/File;

    invoke-direct {v1, p2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-static {p1, v0, v1}, Lcom/huawei/updatesdk/fileprovider/UpdateSdkFileProvider;->getUriForFile(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;)Landroid/net/Uri;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    instance-of v0, p1, Landroid/app/Activity;

    if-nez v0, :cond_1

    const/high16 v0, 0x10000000

    invoke-virtual {v2, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    :cond_1
    :goto_0
    return-object v2
.end method


# virtual methods
.method protected onActivityResult(IILandroid/content/Intent;)V
    .locals 5

    invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->onActivityResult(IILandroid/content/Intent;)V

    const/16 v0, 0x3e8

    if-ne v0, p1, :cond_3

    const/4 v0, 0x0

    if-ne v0, p2, :cond_0

    const/4 v0, 0x7

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/updatesdk/support/pm/g;->a(II)V

    goto :goto_0

    :cond_0
    const/16 v3, -0x2714

    const/4 v0, 0x0

    if-eq v0, p3, :cond_1

    const-string v0, "android.intent.extra.INSTALL_RESULT"

    const/16 v1, -0x2714

    invoke-virtual {p3, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v3

    :cond_1
    invoke-static {}, Lcom/huawei/updatesdk/support/b/c;->b()[Ljava/lang/String;

    move-result-object v4

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x18

    if-ge v0, v1, :cond_2

    const/4 v0, -0x3

    if-ne v0, v3, :cond_2

    iget v0, p0, Lcom/huawei/updatesdk/support/pm/PackageInstallerActivity;->c:I

    array-length v1, v4

    add-int/lit8 v1, v1, -0x1

    if-ge v0, v1, :cond_2

    iget-object v0, p0, Lcom/huawei/updatesdk/support/pm/PackageInstallerActivity;->b:Ljava/lang/String;

    const/4 v1, -0x3

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Lcom/huawei/updatesdk/support/pm/g$a;->a(Ljava/lang/String;IZ)V

    goto :goto_0

    :cond_2
    if-eqz v3, :cond_3

    const/4 v0, 0x1

    if-eq v3, v0, :cond_3

    const/4 v0, 0x4

    invoke-static {v0, v3}, Lcom/huawei/updatesdk/support/pm/g;->a(II)V

    :cond_3
    :goto_0
    invoke-virtual {p0}, Lcom/huawei/updatesdk/support/pm/PackageInstallerActivity;->finish()V

    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 7

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/updatesdk/support/pm/PackageInstallerActivity;->requestWindowFeature(I)Z

    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    invoke-virtual {p0}, Lcom/huawei/updatesdk/support/pm/PackageInstallerActivity;->getIntent()Landroid/content/Intent;

    move-result-object v3

    const/4 v0, 0x0

    if-ne v0, v3, :cond_0

    invoke-virtual {p0}, Lcom/huawei/updatesdk/support/pm/PackageInstallerActivity;->finish()V

    const-string v0, "PackageInstallerActivity"

    const-string v1, "PackageInstallerActivity error intent"

    invoke-static {v0, v1}, Lcom/huawei/updatesdk/sdk/a/b/a/a/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    invoke-static {v3}, Lcom/huawei/updatesdk/sdk/service/secure/a;->a(Landroid/content/Intent;)Lcom/huawei/updatesdk/sdk/service/secure/a;

    move-result-object v4

    const-string v0, "install_path"

    invoke-virtual {v4, v0}, Lcom/huawei/updatesdk/sdk/service/secure/a;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/updatesdk/support/pm/PackageInstallerActivity;->a:Ljava/lang/String;

    const-string v0, "install_packagename"

    invoke-virtual {v4, v0}, Lcom/huawei/updatesdk/sdk/service/secure/a;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/updatesdk/support/pm/PackageInstallerActivity;->b:Ljava/lang/String;

    iget-object v0, p0, Lcom/huawei/updatesdk/support/pm/PackageInstallerActivity;->a:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x4

    const/4 v1, -0x3

    invoke-static {v0, v1}, Lcom/huawei/updatesdk/support/pm/g;->a(II)V

    invoke-virtual {p0}, Lcom/huawei/updatesdk/support/pm/PackageInstallerActivity;->finish()V

    const-string v0, "PackageInstallerActivity"

    const-string v1, "PackageInstallerActivity can not find filePath."

    invoke-static {v0, v1}, Lcom/huawei/updatesdk/sdk/a/b/a/a/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_1
    const-string v0, "install_change_path_times"

    const/4 v1, -0x1

    invoke-virtual {v4, v0, v1}, Lcom/huawei/updatesdk/sdk/service/secure/a;->a(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/huawei/updatesdk/support/pm/PackageInstallerActivity;->c:I

    iget-object v0, p0, Lcom/huawei/updatesdk/support/pm/PackageInstallerActivity;->a:Ljava/lang/String;

    invoke-direct {p0, p0, v0}, Lcom/huawei/updatesdk/support/pm/PackageInstallerActivity;->a(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v5

    const-string v0, "android.intent.extra.NOT_UNKNOWN_SOURCE"

    const/4 v1, 0x1

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    const-string v0, "android.intent.extra.RETURN_RESULT"

    const/4 v1, 0x1

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    const-string v0, "PackageInstallerActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, " onCreate filePath:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/updatesdk/support/pm/PackageInstallerActivity;->a:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ",packageName:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/updatesdk/support/pm/PackageInstallerActivity;->b:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ",taskId:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Lcom/huawei/updatesdk/support/pm/PackageInstallerActivity;->getTaskId()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/updatesdk/sdk/a/b/a/a/a;->c(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v0, 0x3e8

    :try_start_0
    invoke-virtual {p0, v5, v0}, Lcom/huawei/updatesdk/support/pm/PackageInstallerActivity;->startActivityForResult(Landroid/content/Intent;I)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v6

    const-string v0, "PackageInstallerActivity"

    const-string v1, "can not start install action"

    invoke-static {v0, v1}, Lcom/huawei/updatesdk/sdk/a/b/a/a/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x4

    const/4 v1, -0x2

    invoke-static {v0, v1}, Lcom/huawei/updatesdk/support/pm/g;->a(II)V

    invoke-virtual {p0}, Lcom/huawei/updatesdk/support/pm/PackageInstallerActivity;->finish()V

    return-void

    :goto_0
    return-void
.end method

.method protected onDestroy()V
    .locals 3

    const/16 v0, 0x3e8

    invoke-virtual {p0, v0}, Lcom/huawei/updatesdk/support/pm/PackageInstallerActivity;->finishActivity(I)V

    invoke-super {p0}, Landroid/app/Activity;->onDestroy()V

    const-string v0, "PackageInstallerActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, " onDestroy removeTaskId:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/updatesdk/support/pm/PackageInstallerActivity;->a:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/updatesdk/sdk/a/b/a/a/a;->c(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
