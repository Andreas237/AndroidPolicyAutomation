.class public Lcom/huawei/openalliance/ad/inter/data/AppInfo;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field private static final TAG:Ljava/lang/String; = "AppInfo"

.field private static final serialVersionUID:J = 0x1d015dcL


# instance fields
.field private appName:Ljava/lang/String;

.field private downloadUrl:Ljava/lang/String;

.field private fileSize:J

.field private iconUrl:Ljava/lang/String;

.field private intentUri:Ljava/lang/String;

.field private packageName:Ljava/lang/String;

.field private permPromptForCard:Z

.field private permPromptForLanding:Z

.field private permissions:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/openalliance/ad/inter/data/PermissionEntity;>;"
        }
    .end annotation
.end field

.field private popUpAfterInstall:I

.field private priorInstallWay:Ljava/lang/String;

.field private safeDownloadUrl:Ljava/lang/String;

.field private sha256:Ljava/lang/String;

.field private versionCode:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "3"

    iput-object v0, p0, Lcom/huawei/openalliance/ad/inter/data/AppInfo;->priorInstallWay:Ljava/lang/String;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/inter/data/AppInfo;->permPromptForCard:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/inter/data/AppInfo;->permPromptForLanding:Z

    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/openalliance/ad/inter/data/AppInfo;->popUpAfterInstall:I

    return-void
.end method

.method public constructor <init>(Lcom/huawei/openalliance/ad/beans/metadata/ApkInfo;)V
    .locals 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "3"

    iput-object v0, p0, Lcom/huawei/openalliance/ad/inter/data/AppInfo;->priorInstallWay:Ljava/lang/String;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/inter/data/AppInfo;->permPromptForCard:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/inter/data/AppInfo;->permPromptForLanding:Z

    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/openalliance/ad/inter/data/AppInfo;->popUpAfterInstall:I

    const/4 v0, 0x0

    if-eq v0, p1, :cond_3

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/beans/metadata/ApkInfo;->getAppName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/ad;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/inter/data/AppInfo;->appName:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/beans/metadata/ApkInfo;->getPackageName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/inter/data/AppInfo;->packageName:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/beans/metadata/ApkInfo;->getVersionCode()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/inter/data/AppInfo;->versionCode:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/beans/metadata/ApkInfo;->getUrl()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/inter/data/AppInfo;->downloadUrl:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/beans/metadata/ApkInfo;->getFileSize()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/openalliance/ad/inter/data/AppInfo;->fileSize:J

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/beans/metadata/ApkInfo;->getSha256()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/inter/data/AppInfo;->sha256:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/beans/metadata/ApkInfo;->getSecondUrl()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/inter/data/AppInfo;->safeDownloadUrl:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/beans/metadata/ApkInfo;->getPriorInstallWay()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    iput-object v3, p0, Lcom/huawei/openalliance/ad/inter/data/AppInfo;->priorInstallWay:Ljava/lang/String;

    :cond_0
    const-string v0, "1"

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/beans/metadata/ApkInfo;->getPermPromptForCard()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/inter/data/AppInfo;->permPromptForCard:Z

    const-string v0, "1"

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/beans/metadata/ApkInfo;->getPermPromptForLanding()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, 0x1

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    :goto_1
    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/inter/data/AppInfo;->permPromptForLanding:Z

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/beans/metadata/ApkInfo;->getPopUpAfterInstall()I

    move-result v0

    iput v0, p0, Lcom/huawei/openalliance/ad/inter/data/AppInfo;->popUpAfterInstall:I

    :try_start_0
    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/beans/metadata/ApkInfo;->getPermissions()Ljava/util/List;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/openalliance/ad/inter/data/AppInfo;->parsePermission(Ljava/util/List;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    goto :goto_2

    :catch_0
    move-exception v4

    const-string v0, "AppInfo"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "parsePermission RuntimeException:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    :catch_1
    move-exception v4

    const-string v0, "AppInfo"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "parsePermission Exception:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    :cond_3
    :goto_2
    return-void
.end method

.method private parsePermission(Ljava/util/List;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/openalliance/ad/beans/metadata/Permission;>;)V"
        }
    .end annotation

    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-gtz v0, :cond_1

    :cond_0
    return-void

    :cond_1
    new-instance v4, Landroid/util/ArrayMap;

    invoke-direct {v4}, Landroid/util/ArrayMap;-><init>()V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/openalliance/ad/beans/metadata/Permission;

    invoke-virtual {v6}, Lcom/huawei/openalliance/ad/beans/metadata/Permission;->getGroupDesc()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ljava/util/List;

    if-nez v7, :cond_2

    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v6}, Lcom/huawei/openalliance/ad/beans/metadata/Permission;->getGroupDesc()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v4, v0, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    new-instance v0, Lcom/huawei/openalliance/ad/inter/data/PermissionEntity;

    invoke-virtual {v6}, Lcom/huawei/openalliance/ad/beans/metadata/Permission;->getPermissionLabel()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/huawei/openalliance/ad/utils/ad;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/huawei/openalliance/ad/inter/data/PermissionEntity;-><init>(Ljava/lang/String;I)V

    invoke-interface {v7, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/inter/data/AppInfo;->permissions:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/util/Map$Entry;

    iget-object v0, p0, Lcom/huawei/openalliance/ad/inter/data/AppInfo;->permissions:Ljava/util/List;

    new-instance v1, Lcom/huawei/openalliance/ad/inter/data/PermissionEntity;

    invoke-interface {v6}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-static {v2}, Lcom/huawei/openalliance/ad/utils/ad;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3}, Lcom/huawei/openalliance/ad/inter/data/PermissionEntity;-><init>(Ljava/lang/String;I)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/huawei/openalliance/ad/inter/data/AppInfo;->permissions:Ljava/util/List;

    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    goto :goto_1

    :cond_4
    return-void
.end method


# virtual methods
.method public getAppName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/inter/data/AppInfo;->appName:Ljava/lang/String;

    if-nez v0, :cond_0

    const-string v0, ""

    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/inter/data/AppInfo;->appName:Ljava/lang/String;

    return-object v0
.end method

.method public getDownloadUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/inter/data/AppInfo;->downloadUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getFileSize()J
    .locals 2

    iget-wide v0, p0, Lcom/huawei/openalliance/ad/inter/data/AppInfo;->fileSize:J

    return-wide v0
.end method

.method public getIconUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/inter/data/AppInfo;->iconUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getIntentUri()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/inter/data/AppInfo;->intentUri:Ljava/lang/String;

    return-object v0
.end method

.method public getPackageName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/inter/data/AppInfo;->packageName:Ljava/lang/String;

    return-object v0
.end method

.method public getPermissions()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/openalliance/ad/inter/data/PermissionEntity;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/huawei/openalliance/ad/inter/data/AppInfo;->permissions:Ljava/util/List;

    return-object v0
.end method

.method public getPopUpAfterInstall()I
    .locals 1

    iget v0, p0, Lcom/huawei/openalliance/ad/inter/data/AppInfo;->popUpAfterInstall:I

    return v0
.end method

.method public getPriorInstallWay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/inter/data/AppInfo;->priorInstallWay:Ljava/lang/String;

    return-object v0
.end method

.method public getSafeDownloadUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/inter/data/AppInfo;->safeDownloadUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getSha256()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/inter/data/AppInfo;->sha256:Ljava/lang/String;

    return-object v0
.end method

.method public getVersionCode()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/inter/data/AppInfo;->versionCode:Ljava/lang/String;

    return-object v0
.end method

.method public isPermPromptForCard()Z
    .locals 1

    iget-boolean v0, p0, Lcom/huawei/openalliance/ad/inter/data/AppInfo;->permPromptForCard:Z

    return v0
.end method

.method public isPermPromptForLanding()Z
    .locals 1

    iget-boolean v0, p0, Lcom/huawei/openalliance/ad/inter/data/AppInfo;->permPromptForLanding:Z

    return v0
.end method

.method public setAppName(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/inter/data/AppInfo;->appName:Ljava/lang/String;

    return-void
.end method

.method public setDownloadUrl(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/inter/data/AppInfo;->downloadUrl:Ljava/lang/String;

    return-void
.end method

.method public setFileSize(J)V
    .locals 0

    iput-wide p1, p0, Lcom/huawei/openalliance/ad/inter/data/AppInfo;->fileSize:J

    return-void
.end method

.method public setIconUrl(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/inter/data/AppInfo;->iconUrl:Ljava/lang/String;

    return-void
.end method

.method public setIntentUri(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/inter/data/AppInfo;->intentUri:Ljava/lang/String;

    return-void
.end method

.method public setPackageName(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/inter/data/AppInfo;->packageName:Ljava/lang/String;

    return-void
.end method

.method public setPermPromptForCard(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/huawei/openalliance/ad/inter/data/AppInfo;->permPromptForCard:Z

    return-void
.end method

.method public setPermPromptForLanding(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/huawei/openalliance/ad/inter/data/AppInfo;->permPromptForLanding:Z

    return-void
.end method

.method public setPermissions(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/openalliance/ad/inter/data/PermissionEntity;>;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/huawei/openalliance/ad/inter/data/AppInfo;->permissions:Ljava/util/List;

    return-void
.end method

.method public setPopUpAfterInstall(I)V
    .locals 0

    iput p1, p0, Lcom/huawei/openalliance/ad/inter/data/AppInfo;->popUpAfterInstall:I

    return-void
.end method

.method public setPriorInstallWay(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/inter/data/AppInfo;->priorInstallWay:Ljava/lang/String;

    return-void
.end method

.method public setSafeDownloadUrl(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/inter/data/AppInfo;->safeDownloadUrl:Ljava/lang/String;

    return-void
.end method

.method public setSha256(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/inter/data/AppInfo;->sha256:Ljava/lang/String;

    return-void
.end method

.method public setVersionCode(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/inter/data/AppInfo;->versionCode:Ljava/lang/String;

    return-void
.end method
