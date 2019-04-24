.class public Lcom/huawei/updatesdk/service/appmgr/bean/UpgradeRequest;
.super Lcom/huawei/updatesdk/framework/bean/StoreRequestBean;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/updatesdk/service/appmgr/bean/UpgradeRequest$Param;,
        Lcom/huawei/updatesdk/service/appmgr/bean/UpgradeRequest$Json;
    }
.end annotation


# static fields
.field public static final APIMETHOD:Ljava/lang/String; = "client.diffUpgrade2"

.field public static final DEFAULT_UPGRADE_RESULT:I = 0x0

.field public static final FULL_UPGRADE_RESULT:I = 0x1

.field public static final INSTALL_CHECK_BROADCAST:I = 0x1

.field public static final INSTALL_CHECK_DEFAULT:I = 0x0

.field public static final PRE_DOWNLOAD_CLOSE:I = 0x0

.field private static final TAG:Ljava/lang/String; = "UpgradeRequest"

.field public static final TYPE_NOT_PREINSTALL:I = 0x0

.field public static final TYPE_PREINSTALL:I = 0x2

.field public static final TYPE_PREINSTALL_REMOVABLE:I = 0x1

.field private static final cmp_:Ljava/lang/String; = "1"


# instance fields
.field private installCheck_:I

.field private isFullUpgrade_:I

.field private isUpdateSdk_:I

.field private isWlanIdle_:I

.field private json_:Lcom/huawei/updatesdk/service/appmgr/bean/UpgradeRequest$Json;

.field private maxMem_:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/huawei/updatesdk/framework/bean/StoreRequestBean;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/updatesdk/service/appmgr/bean/UpgradeRequest;->installCheck_:I

    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/updatesdk/service/appmgr/bean/UpgradeRequest;->isWlanIdle_:I

    const/4 v0, 0x1

    iput v0, p0, Lcom/huawei/updatesdk/service/appmgr/bean/UpgradeRequest;->isUpdateSdk_:I

    const/4 v0, 0x1

    iput v0, p0, Lcom/huawei/updatesdk/service/appmgr/bean/UpgradeRequest;->isFullUpgrade_:I

    return-void
.end method

.method static synthetic access$000(Landroid/content/pm/PackageInfo;)I
    .locals 1

    invoke-static {p0}, Lcom/huawei/updatesdk/service/appmgr/bean/UpgradeRequest;->getPreInstallType(Landroid/content/pm/PackageInfo;)I

    move-result v0

    return v0
.end method

.method private static getPreInstallType(Landroid/content/pm/PackageInfo;)I
    .locals 2

    iget-object v0, p0, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    iget v0, v0, Landroid/content/pm/ApplicationInfo;->flags:I

    and-int/lit8 v0, v0, 0x1

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    iget-object v0, p0, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    invoke-static {v0}, Lcom/huawei/updatesdk/service/appmgr/bean/UpgradeRequest;->isDelApp(Landroid/content/pm/ApplicationInfo;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    return v0

    :cond_1
    const/4 v0, 0x2

    return v0
.end method

.method private static isDelApp(Landroid/content/pm/ApplicationInfo;)Z
    .locals 8

    iget v3, p0, Landroid/content/pm/ApplicationInfo;->flags:I

    invoke-static {}, Lcom/huawei/updatesdk/support/c/a;->a()Ljava/lang/Integer;

    move-result-object v4

    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v0

    and-int/2addr v0, v3

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    invoke-static {}, Lcom/huawei/updatesdk/support/c/a;->b()Ljava/lang/reflect/Field;

    move-result-object v5

    const/4 v0, 0x0

    if-eq v0, v5, :cond_2

    const/4 v6, 0x0

    :try_start_0
    invoke-virtual {v5, p0}, Ljava/lang/reflect/Field;->getInt(Ljava/lang/Object;)I
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1

    move-result v6

    const/high16 v7, 0x2000000

    and-int v0, v6, v7

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    return v0

    :cond_1
    goto :goto_0

    :catch_0
    move-exception v6

    const-string v0, "UpgradeRequest"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "can not get hwflags"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v6}, Ljava/lang/IllegalAccessException;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/updatesdk/sdk/a/b/a/a/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :catch_1
    move-exception v6

    const-string v0, "UpgradeRequest"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "can not get hwflags"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v6}, Ljava/lang/IllegalArgumentException;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/updatesdk/sdk/a/b/a/a/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    :goto_0
    const/4 v0, 0x0

    return v0
.end method

.method public static newInstance(Ljava/lang/String;)Lcom/huawei/updatesdk/service/appmgr/bean/UpgradeRequest;
    .locals 5

    new-instance v1, Landroid/content/pm/PackageInfo;

    invoke-direct {v1}, Landroid/content/pm/PackageInfo;-><init>()V

    iput-object p0, v1, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    const-string v0, "1.0"

    iput-object v0, v1, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    const/4 v0, 0x1

    iput v0, v1, Landroid/content/pm/PackageInfo;->versionCode:I

    new-instance v2, Landroid/content/pm/ApplicationInfo;

    invoke-direct {v2}, Landroid/content/pm/ApplicationInfo;-><init>()V

    const/16 v0, 0x13

    iput v0, v2, Landroid/content/pm/ApplicationInfo;->targetSdkVersion:I

    iput-object v2, v1, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v0, 0x0

    invoke-static {v3, v0}, Lcom/huawei/updatesdk/service/appmgr/bean/UpgradeRequest;->newInstance(Ljava/util/List;Z)Lcom/huawei/updatesdk/service/appmgr/bean/UpgradeRequest;

    move-result-object v4

    return-object v4
.end method

.method public static newInstance(Ljava/util/List;Z)Lcom/huawei/updatesdk/service/appmgr/bean/UpgradeRequest;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Landroid/content/pm/PackageInfo;>;Z)Lcom/huawei/updatesdk/service/appmgr/bean/UpgradeRequest;"
        }
    .end annotation

    new-instance v4, Lcom/huawei/updatesdk/service/appmgr/bean/UpgradeRequest;

    invoke-direct {v4}, Lcom/huawei/updatesdk/service/appmgr/bean/UpgradeRequest;-><init>()V

    const-string v0, "storeApi2"

    invoke-virtual {v4, v0}, Lcom/huawei/updatesdk/service/appmgr/bean/UpgradeRequest;->setStoreApi(Ljava/lang/String;)V

    const-string v0, "client.diffUpgrade2"

    invoke-virtual {v4, v0}, Lcom/huawei/updatesdk/service/appmgr/bean/UpgradeRequest;->setMethod_(Ljava/lang/String;)V

    invoke-static {}, Lcom/huawei/updatesdk/sdk/service/a/a;->a()Lcom/huawei/updatesdk/sdk/service/a/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/updatesdk/sdk/service/a/a;->b()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/updatesdk/sdk/a/c/b/a;->b(Landroid/content/Context;)J

    move-result-wide v0

    const-wide/16 v2, 0x400

    div-long/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/updatesdk/service/appmgr/bean/UpgradeRequest;->setMaxMem_(Ljava/lang/String;)V

    const-string v0, "1.2"

    invoke-virtual {v4, v0}, Lcom/huawei/updatesdk/service/appmgr/bean/UpgradeRequest;->setVer_(Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Lcom/huawei/updatesdk/service/appmgr/bean/UpgradeRequest;->setIsWlanIdle_(I)V

    new-instance v5, Lcom/huawei/updatesdk/service/appmgr/bean/UpgradeRequest$Json;

    invoke-direct {v5}, Lcom/huawei/updatesdk/service/appmgr/bean/UpgradeRequest$Json;-><init>()V

    invoke-virtual {v4, v5}, Lcom/huawei/updatesdk/service/appmgr/bean/UpgradeRequest;->setJson_(Lcom/huawei/updatesdk/service/appmgr/bean/UpgradeRequest$Json;)V

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v5, v6}, Lcom/huawei/updatesdk/service/appmgr/bean/UpgradeRequest$Json;->setParams_(Ljava/util/List;)V

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Landroid/content/pm/PackageInfo;

    new-instance v9, Lcom/huawei/updatesdk/service/appmgr/bean/UpgradeRequest$Param;

    invoke-direct {v9, v8, p1}, Lcom/huawei/updatesdk/service/appmgr/bean/UpgradeRequest$Param;-><init>(Landroid/content/pm/PackageInfo;Z)V

    invoke-interface {v6, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v4
.end method


# virtual methods
.method public getInstallCheck_()I
    .locals 1

    iget v0, p0, Lcom/huawei/updatesdk/service/appmgr/bean/UpgradeRequest;->installCheck_:I

    return v0
.end method

.method public getIsFullUpgrade_()I
    .locals 1

    iget v0, p0, Lcom/huawei/updatesdk/service/appmgr/bean/UpgradeRequest;->isFullUpgrade_:I

    return v0
.end method

.method public getIsUpdateSdk_()I
    .locals 1

    iget v0, p0, Lcom/huawei/updatesdk/service/appmgr/bean/UpgradeRequest;->isUpdateSdk_:I

    return v0
.end method

.method public getIsWlanIdle_()I
    .locals 1

    iget v0, p0, Lcom/huawei/updatesdk/service/appmgr/bean/UpgradeRequest;->isWlanIdle_:I

    return v0
.end method

.method public getJson_()Lcom/huawei/updatesdk/service/appmgr/bean/UpgradeRequest$Json;
    .locals 1

    iget-object v0, p0, Lcom/huawei/updatesdk/service/appmgr/bean/UpgradeRequest;->json_:Lcom/huawei/updatesdk/service/appmgr/bean/UpgradeRequest$Json;

    return-object v0
.end method

.method public getMaxMem_()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/updatesdk/service/appmgr/bean/UpgradeRequest;->maxMem_:Ljava/lang/String;

    return-object v0
.end method

.method public setInstallCheck_(I)V
    .locals 0

    iput p1, p0, Lcom/huawei/updatesdk/service/appmgr/bean/UpgradeRequest;->installCheck_:I

    return-void
.end method

.method public setIsFullUpgrade_(I)V
    .locals 0

    iput p1, p0, Lcom/huawei/updatesdk/service/appmgr/bean/UpgradeRequest;->isFullUpgrade_:I

    return-void
.end method

.method public setIsUpdateSdk_(I)V
    .locals 0

    iput p1, p0, Lcom/huawei/updatesdk/service/appmgr/bean/UpgradeRequest;->isUpdateSdk_:I

    return-void
.end method

.method public setIsWlanIdle_(I)V
    .locals 0

    iput p1, p0, Lcom/huawei/updatesdk/service/appmgr/bean/UpgradeRequest;->isWlanIdle_:I

    return-void
.end method

.method public setJson_(Lcom/huawei/updatesdk/service/appmgr/bean/UpgradeRequest$Json;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/updatesdk/service/appmgr/bean/UpgradeRequest;->json_:Lcom/huawei/updatesdk/service/appmgr/bean/UpgradeRequest$Json;

    return-void
.end method

.method public setMaxMem_(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/updatesdk/service/appmgr/bean/UpgradeRequest;->maxMem_:Ljava/lang/String;

    return-void
.end method
