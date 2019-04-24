.class public Lcom/huawei/updatesdk/service/otaupdate/c;
.super Landroid/os/AsyncTask;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask<Ljava/lang/Void;Ljava/lang/Void;Lcom/huawei/updatesdk/service/appmgr/bean/ApkUpgradeInfo;>;"
    }
.end annotation


# instance fields
.field private a:Landroid/content/Context;

.field private b:Lcom/huawei/updatesdk/service/otaupdate/CheckUpdateCallBack;

.field private c:Z

.field private d:Z

.field private e:Ljava/lang/String;

.field private f:Landroid/widget/Toast;

.field private g:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/huawei/updatesdk/service/otaupdate/CheckUpdateCallBack;Z)V
    .locals 1

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/updatesdk/service/otaupdate/c;->c:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/updatesdk/service/otaupdate/c;->d:Z

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/updatesdk/service/otaupdate/c;->e:Ljava/lang/String;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/updatesdk/service/otaupdate/c;->g:Z

    iput-object p2, p0, Lcom/huawei/updatesdk/service/otaupdate/c;->b:Lcom/huawei/updatesdk/service/otaupdate/CheckUpdateCallBack;

    iput-object p1, p0, Lcom/huawei/updatesdk/service/otaupdate/c;->a:Landroid/content/Context;

    iput-boolean p3, p0, Lcom/huawei/updatesdk/service/otaupdate/c;->d:Z

    return-void
.end method

.method private a(Landroid/content/Context;Ljava/lang/String;)Lcom/huawei/updatesdk/service/appmgr/bean/ApkUpgradeInfo;
    .locals 11

    invoke-static {}, Lcom/huawei/updatesdk/service/a/b;->a()Lcom/huawei/updatesdk/service/a/b;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/huawei/updatesdk/service/a/b;->d(Ljava/lang/String;)V

    const/4 v3, 0x0

    invoke-static {p2, p1}, Lcom/huawei/updatesdk/support/c/a;->a(Ljava/lang/String;Landroid/content/Context;)Landroid/content/pm/PackageInfo;

    move-result-object v4

    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    iget-object v0, p0, Lcom/huawei/updatesdk/service/otaupdate/c;->e:Ljava/lang/String;

    if-nez v0, :cond_0

    const-string v0, "CheckOtaAndUpdataTask"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "get app packageInfo failed,packageName:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/updatesdk/sdk/a/b/a/a/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0

    :cond_0
    if-nez v4, :cond_1

    new-instance v4, Landroid/content/pm/PackageInfo;

    invoke-direct {v4}, Landroid/content/pm/PackageInfo;-><init>()V

    iput-object p2, v4, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    const-string v0, "1.0"

    iput-object v0, v4, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    const/4 v0, 0x1

    iput v0, v4, Landroid/content/pm/PackageInfo;->versionCode:I

    new-instance v5, Landroid/content/pm/ApplicationInfo;

    invoke-direct {v5}, Landroid/content/pm/ApplicationInfo;-><init>()V

    const/16 v0, 0x13

    iput v0, v5, Landroid/content/pm/ApplicationInfo;->targetSdkVersion:I

    iput-object v5, v4, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    :cond_1
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v0, 0x1

    invoke-static {v5, v0}, Lcom/huawei/updatesdk/service/appmgr/bean/UpgradeRequest;->newInstance(Ljava/util/List;Z)Lcom/huawei/updatesdk/service/appmgr/bean/UpgradeRequest;

    move-result-object v6

    const/4 v0, 0x0

    invoke-virtual {v6, v0}, Lcom/huawei/updatesdk/service/appmgr/bean/UpgradeRequest;->setInstallCheck_(I)V

    invoke-static {v6}, Lcom/huawei/updatesdk/service/b/a/b;->a(Lcom/huawei/updatesdk/sdk/service/storekit/bean/RequestBean;)Lcom/huawei/updatesdk/sdk/service/storekit/bean/ResponseBean;

    move-result-object v7

    invoke-virtual {v7}, Lcom/huawei/updatesdk/sdk/service/storekit/bean/ResponseBean;->getResponseCode()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_3

    invoke-virtual {v7}, Lcom/huawei/updatesdk/sdk/service/storekit/bean/ResponseBean;->getRtnCode_()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_3

    move-object v8, v7

    check-cast v8, Lcom/huawei/updatesdk/service/appmgr/bean/UpgradeResponse;

    iget-object v9, v8, Lcom/huawei/updatesdk/service/appmgr/bean/UpgradeResponse;->list_:Ljava/util/List;

    invoke-direct {p0, p2, v4, v9}, Lcom/huawei/updatesdk/service/otaupdate/c;->a(Ljava/lang/String;Landroid/content/pm/PackageInfo;Ljava/util/List;)Lcom/huawei/updatesdk/service/appmgr/bean/ApkUpgradeInfo;

    move-result-object v3

    if-nez v3, :cond_2

    iget-object v0, p0, Lcom/huawei/updatesdk/service/otaupdate/c;->b:Lcom/huawei/updatesdk/service/otaupdate/CheckUpdateCallBack;

    if-eqz v0, :cond_2

    new-instance v10, Landroid/content/Intent;

    invoke-direct {v10}, Landroid/content/Intent;-><init>()V

    const-string v0, "status"

    const/4 v1, 0x3

    invoke-virtual {v10, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    iget-object v0, p0, Lcom/huawei/updatesdk/service/otaupdate/c;->b:Lcom/huawei/updatesdk/service/otaupdate/CheckUpdateCallBack;

    invoke-interface {v0, v10}, Lcom/huawei/updatesdk/service/otaupdate/CheckUpdateCallBack;->onUpdateInfo(Landroid/content/Intent;)V

    :cond_2
    goto :goto_0

    :cond_3
    iget-object v0, p0, Lcom/huawei/updatesdk/service/otaupdate/c;->b:Lcom/huawei/updatesdk/service/otaupdate/CheckUpdateCallBack;

    if-eqz v0, :cond_5

    new-instance v8, Landroid/content/Intent;

    invoke-direct {v8}, Landroid/content/Intent;-><init>()V

    const-string v0, "status"

    const/4 v1, 0x6

    invoke-virtual {v8, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    invoke-virtual {v7}, Lcom/huawei/updatesdk/sdk/service/storekit/bean/ResponseBean;->getErrCause()Lcom/huawei/updatesdk/sdk/service/storekit/bean/ResponseBean$a;

    move-result-object v0

    if-eqz v0, :cond_4

    const-string v0, "failcause"

    invoke-virtual {v7}, Lcom/huawei/updatesdk/sdk/service/storekit/bean/ResponseBean;->getErrCause()Lcom/huawei/updatesdk/sdk/service/storekit/bean/ResponseBean$a;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/updatesdk/sdk/service/storekit/bean/ResponseBean$a;->ordinal()I

    move-result v1

    invoke-virtual {v8, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    :cond_4
    iget-object v0, p0, Lcom/huawei/updatesdk/service/otaupdate/c;->b:Lcom/huawei/updatesdk/service/otaupdate/CheckUpdateCallBack;

    invoke-interface {v0, v8}, Lcom/huawei/updatesdk/service/otaupdate/CheckUpdateCallBack;->onUpdateInfo(Landroid/content/Intent;)V

    iget-object v0, p0, Lcom/huawei/updatesdk/service/otaupdate/c;->b:Lcom/huawei/updatesdk/service/otaupdate/CheckUpdateCallBack;

    invoke-virtual {v7}, Lcom/huawei/updatesdk/sdk/service/storekit/bean/ResponseBean;->getResponseCode()I

    move-result v1

    invoke-interface {v0, v1}, Lcom/huawei/updatesdk/service/otaupdate/CheckUpdateCallBack;->onUpdateStoreError(I)V

    :cond_5
    const-string v0, "CheckOtaAndUpdataTask"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "get app update msg failed,responseCode is "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v7}, Lcom/huawei/updatesdk/sdk/service/storekit/bean/ResponseBean;->getResponseCode()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/updatesdk/sdk/a/b/a/a/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    return-object v3
.end method

.method private a(Ljava/lang/String;Landroid/content/pm/PackageInfo;Ljava/util/List;)Lcom/huawei/updatesdk/service/appmgr/bean/ApkUpgradeInfo;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Landroid/content/pm/PackageInfo;Ljava/util/List<Lcom/huawei/updatesdk/service/appmgr/bean/ApkUpgradeInfo;>;)Lcom/huawei/updatesdk/service/appmgr/bean/ApkUpgradeInfo;"
        }
    .end annotation

    const/4 v2, 0x0

    const/4 v0, 0x0

    if-ne v0, p3, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/updatesdk/service/appmgr/bean/ApkUpgradeInfo;

    invoke-virtual {v4}, Lcom/huawei/updatesdk/service/appmgr/bean/ApkUpgradeInfo;->getPackage_()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {v4}, Lcom/huawei/updatesdk/service/appmgr/bean/ApkUpgradeInfo;->getOldVersionCode_()I

    move-result v0

    invoke-virtual {v4}, Lcom/huawei/updatesdk/service/appmgr/bean/ApkUpgradeInfo;->getVersionCode_()I

    move-result v1

    if-ge v0, v1, :cond_1

    move-object v2, v4

    goto :goto_1

    :cond_1
    goto :goto_0

    :cond_2
    :goto_1
    return-object v2
.end method

.method private a()V
    .locals 4

    invoke-static {}, Lcom/huawei/updatesdk/service/a/b;->a()Lcom/huawei/updatesdk/service/a/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/updatesdk/service/a/b;->e()Ljava/lang/String;

    move-result-object v2

    invoke-static {}, Lcom/huawei/updatesdk/sdk/a/c/b/a;->d()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, Lcom/huawei/updatesdk/service/a/b;->a()Lcom/huawei/updatesdk/service/a/b;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Lcom/huawei/updatesdk/service/a/b;->a(Ljava/lang/String;)V

    invoke-static {}, Lcom/huawei/updatesdk/service/a/b;->a()Lcom/huawei/updatesdk/service/a/b;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Lcom/huawei/updatesdk/service/a/b;->b(Ljava/lang/String;)V

    invoke-static {}, Lcom/huawei/updatesdk/service/a/b;->a()Lcom/huawei/updatesdk/service/a/b;

    move-result-object v0

    invoke-virtual {v0, v3}, Lcom/huawei/updatesdk/service/a/b;->c(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method private a(Landroid/content/Context;Lcom/huawei/updatesdk/service/appmgr/bean/ApkUpgradeInfo;)V
    .locals 6

    if-nez p1, :cond_0

    return-void

    :cond_0
    new-instance v3, Landroid/content/Intent;

    const-class v0, Lcom/huawei/updatesdk/service/otaupdate/AppUpdateActivity;

    invoke-direct {v3, p1, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    new-instance v4, Landroid/os/Bundle;

    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    const-string v0, "app_update_parm"

    invoke-virtual {v4, v0, p2}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    const-string v0, "app_must_btn"

    iget-boolean v1, p0, Lcom/huawei/updatesdk/service/otaupdate/c;->d:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    invoke-virtual {v3, v4}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    instance-of v0, p1, Landroid/app/Activity;

    if-nez v0, :cond_1

    const/high16 v0, 0x10000000

    invoke-virtual {v3, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    :cond_1
    :try_start_0
    invoke-virtual {p1, v3}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v5

    const-string v0, "CheckOtaAndUpdataTask"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "go AppUpdateActivity error: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v5}, Landroid/content/ActivityNotFoundException;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/updatesdk/sdk/a/b/a/a/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    return-void
.end method


# virtual methods
.method protected varargs a([Ljava/lang/Void;)Lcom/huawei/updatesdk/service/appmgr/bean/ApkUpgradeInfo;
    .locals 2

    const-string v0, "CheckOtaAndUpdataTask"

    const-string v1, "CheckOtaAndUpdataTask doInBackground"

    invoke-static {v0, v1}, Lcom/huawei/updatesdk/sdk/a/b/a/a/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x18

    if-ge v0, v1, :cond_0

    invoke-static {}, Lcom/huawei/updatesdk/sdk/a/c/b/a;->h()I

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/huawei/updatesdk/sdk/service/a/a;->a()Lcom/huawei/updatesdk/sdk/service/a/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/updatesdk/sdk/service/a/a;->b()Landroid/content/Context;

    move-result-object v0

    const-string v1, "com.huawei.appmarket"

    invoke-static {v0, v1}, Lcom/huawei/updatesdk/support/c/a;->a(Landroid/content/Context;Ljava/lang/String;)Lcom/huawei/updatesdk/support/c/a$a;

    move-result-object v0

    sget-object v1, Lcom/huawei/updatesdk/support/c/a$a;->a:Lcom/huawei/updatesdk/support/c/a$a;

    if-ne v0, v1, :cond_0

    invoke-static {}, Lcom/huawei/updatesdk/support/c/a;->c()Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "CheckOtaAndUpdataTask"

    const-string v1, "api <24,HiApp not installed and no permission"

    invoke-static {v0, v1}, Lcom/huawei/updatesdk/sdk/a/b/a/a/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/huawei/updatesdk/service/otaupdate/c;->e:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/updatesdk/service/otaupdate/c;->a:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/updatesdk/service/otaupdate/c;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/huawei/updatesdk/service/otaupdate/c;->a(Landroid/content/Context;Ljava/lang/String;)Lcom/huawei/updatesdk/service/appmgr/bean/ApkUpgradeInfo;

    move-result-object v0

    return-object v0

    :cond_1
    iget-object v0, p0, Lcom/huawei/updatesdk/service/otaupdate/c;->a:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/updatesdk/service/otaupdate/c;->e:Ljava/lang/String;

    invoke-direct {p0, v0, v1}, Lcom/huawei/updatesdk/service/otaupdate/c;->a(Landroid/content/Context;Ljava/lang/String;)Lcom/huawei/updatesdk/service/appmgr/bean/ApkUpgradeInfo;

    move-result-object v0

    return-object v0
.end method

.method protected a(Lcom/huawei/updatesdk/service/appmgr/bean/ApkUpgradeInfo;)V
    .locals 4

    iget-object v0, p0, Lcom/huawei/updatesdk/service/otaupdate/c;->f:Landroid/widget/Toast;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/updatesdk/service/otaupdate/c;->f:Landroid/widget/Toast;

    invoke-virtual {v0}, Landroid/widget/Toast;->cancel()V

    :cond_0
    const/4 v0, 0x0

    if-eq v0, p1, :cond_2

    const-string v0, "CheckOtaAndUpdataTask"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "check store client update success!"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Lcom/huawei/updatesdk/service/appmgr/bean/ApkUpgradeInfo;->getVersionCode_()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ",version:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Lcom/huawei/updatesdk/service/appmgr/bean/ApkUpgradeInfo;->getVersion_()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/updatesdk/sdk/a/b/a/a/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/updatesdk/service/otaupdate/c;->b:Lcom/huawei/updatesdk/service/otaupdate/CheckUpdateCallBack;

    if-eqz v0, :cond_1

    new-instance v3, Landroid/content/Intent;

    invoke-direct {v3}, Landroid/content/Intent;-><init>()V

    const-string v0, "updatesdk_update_info"

    invoke-virtual {v3, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    const-string v0, "status"

    const/4 v1, 0x7

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    iget-object v0, p0, Lcom/huawei/updatesdk/service/otaupdate/c;->b:Lcom/huawei/updatesdk/service/otaupdate/CheckUpdateCallBack;

    invoke-interface {v0, v3}, Lcom/huawei/updatesdk/service/otaupdate/CheckUpdateCallBack;->onUpdateInfo(Landroid/content/Intent;)V

    :cond_1
    iget-boolean v0, p0, Lcom/huawei/updatesdk/service/otaupdate/c;->c:Z

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/huawei/updatesdk/service/otaupdate/c;->a:Landroid/content/Context;

    invoke-direct {p0, v0, p1}, Lcom/huawei/updatesdk/service/otaupdate/c;->a(Landroid/content/Context;Lcom/huawei/updatesdk/service/appmgr/bean/ApkUpgradeInfo;)V

    goto :goto_0

    :cond_2
    iget-boolean v0, p0, Lcom/huawei/updatesdk/service/otaupdate/c;->g:Z

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/huawei/updatesdk/service/otaupdate/c;->e:Ljava/lang/String;

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/huawei/updatesdk/service/otaupdate/c;->a:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/updatesdk/service/otaupdate/c;->a:Landroid/content/Context;

    const-string v2, "upsdk_update_check_no_new_version"

    invoke-static {v1, v2}, Lcom/huawei/updatesdk/support/f/d;->b(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    :cond_3
    :goto_0
    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/updatesdk/service/otaupdate/c;->e:Ljava/lang/String;

    return-void
.end method

.method public a(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/huawei/updatesdk/service/otaupdate/c;->c:Z

    return-void
.end method

.method public b(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/huawei/updatesdk/service/otaupdate/c;->g:Z

    return-void
.end method

.method protected synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    move-object v0, p1

    check-cast v0, [Ljava/lang/Void;

    invoke-virtual {p0, v0}, Lcom/huawei/updatesdk/service/otaupdate/c;->a([Ljava/lang/Void;)Lcom/huawei/updatesdk/service/appmgr/bean/ApkUpgradeInfo;

    move-result-object v0

    return-object v0
.end method

.method protected synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 1

    move-object v0, p1

    check-cast v0, Lcom/huawei/updatesdk/service/appmgr/bean/ApkUpgradeInfo;

    invoke-virtual {p0, v0}, Lcom/huawei/updatesdk/service/otaupdate/c;->a(Lcom/huawei/updatesdk/service/appmgr/bean/ApkUpgradeInfo;)V

    return-void
.end method

.method protected onPreExecute()V
    .locals 3

    invoke-super {p0}, Landroid/os/AsyncTask;->onPreExecute()V

    invoke-static {}, Lcom/huawei/updatesdk/service/otaupdate/b;->a()Lcom/huawei/updatesdk/service/otaupdate/b;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/updatesdk/service/otaupdate/c;->b:Lcom/huawei/updatesdk/service/otaupdate/CheckUpdateCallBack;

    invoke-virtual {v0, v1}, Lcom/huawei/updatesdk/service/otaupdate/b;->a(Lcom/huawei/updatesdk/service/otaupdate/CheckUpdateCallBack;)V

    invoke-direct {p0}, Lcom/huawei/updatesdk/service/otaupdate/c;->a()V

    iget-boolean v0, p0, Lcom/huawei/updatesdk/service/otaupdate/c;->g:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/updatesdk/service/otaupdate/c;->e:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/updatesdk/service/otaupdate/c;->a:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/updatesdk/service/otaupdate/c;->a:Landroid/content/Context;

    const-string v2, "upsdk_checking_update_prompt"

    invoke-static {v1, v2}, Lcom/huawei/updatesdk/support/f/d;->b(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/updatesdk/service/otaupdate/c;->f:Landroid/widget/Toast;

    iget-object v0, p0, Lcom/huawei/updatesdk/service/otaupdate/c;->f:Landroid/widget/Toast;

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    :cond_0
    return-void
.end method
