.class public Lcom/huawei/updatesdk/service/appmgr/bean/ApkUpgradeInfo;
.super Lcom/huawei/updatesdk/sdk/service/storekit/bean/JsonBean;

# interfaces
.implements Ljava/io/Serializable;
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/huawei/updatesdk/sdk/service/storekit/bean/JsonBean;Ljava/io/Serializable;Ljava/util/Comparator<Lcom/huawei/updatesdk/service/appmgr/bean/ApkUpgradeInfo;>;"
    }
.end annotation


# static fields
.field public static final APP_MUST_UPDATE:I = 0x1

.field public static final HUAWEI_OFFICIAL_APP:I = 0x1

.field public static final NOT_AUTOUPDATE:I = 0x0

.field private static final TAG:Ljava/lang/String; = "ApkUpgradeInfo"

.field public static final UPGRADE_SAME_SIGNATURE:I = 0x0

.field private static format:Ljava/text/SimpleDateFormat; = null

.field private static final serialVersionUID:J = 0x1e425bbd1a6afe9L


# instance fields
.field private detailId_:Ljava/lang/String;

.field private devType_:I

.field private diffHash_:Ljava/lang/String;

.field private diffSize_:I

.field private downurl_:Ljava/lang/String;

.field private formatDate:Ljava/util/Date;

.field private fullDownUrl_:Ljava/lang/String;

.field private hash_:Ljava/lang/String;

.field private icon_:Ljava/lang/String;

.field private id_:Ljava/lang/String;

.field private isAutoUpdate_:I

.field private isCompulsoryUpdate_:I

.field private name_:Ljava/lang/String;

.field private newFeatures_:Ljava/lang/String;

.field private notRcmReason_:Ljava/lang/String;

.field private oldHashCode:Ljava/lang/String;

.field private oldVersionCode_:I

.field private oldVersionName_:Ljava/lang/String;

.field private package_:Ljava/lang/String;

.field private releaseDateDesc_:Ljava/lang/String;

.field private releaseDate_:Ljava/lang/String;

.field private sameS_:I

.field private sha256_:Ljava/lang/String;

.field private size_:I

.field private state_:I

.field private versionCode_:I

.field private version_:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Ljava/text/SimpleDateFormat;

    const-string v1, "yyyy-MM-dd"

    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-direct {v0, v1, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    sput-object v0, Lcom/huawei/updatesdk/service/appmgr/bean/ApkUpgradeInfo;->format:Ljava/text/SimpleDateFormat;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/huawei/updatesdk/sdk/service/storekit/bean/JsonBean;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/updatesdk/service/appmgr/bean/ApkUpgradeInfo;->sameS_:I

    const/4 v0, 0x2

    iput v0, p0, Lcom/huawei/updatesdk/service/appmgr/bean/ApkUpgradeInfo;->state_:I

    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/updatesdk/service/appmgr/bean/ApkUpgradeInfo;->isAutoUpdate_:I

    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/updatesdk/service/appmgr/bean/ApkUpgradeInfo;->isCompulsoryUpdate_:I

    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/updatesdk/service/appmgr/bean/ApkUpgradeInfo;->devType_:I

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/updatesdk/service/appmgr/bean/ApkUpgradeInfo;->formatDate:Ljava/util/Date;

    return-void
.end method

.method private static createDate(Ljava/lang/String;)Ljava/util/Date;
    .locals 6

    const/4 v3, 0x0

    :try_start_0
    sget-object v4, Lcom/huawei/updatesdk/service/appmgr/bean/ApkUpgradeInfo;->format:Ljava/text/SimpleDateFormat;

    monitor-enter v4
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    sget-object v0, Lcom/huawei/updatesdk/service/appmgr/bean/ApkUpgradeInfo;->format:Ljava/text/SimpleDateFormat;

    invoke-virtual {v0, p0}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-object v0

    move-object v3, v0

    monitor-exit v4

    goto :goto_0

    :catchall_0
    move-exception v5

    monitor-exit v4

    :try_start_2
    throw v5
    :try_end_2
    .catch Ljava/text/ParseException; {:try_start_2 .. :try_end_2} :catch_0

    :goto_0
    goto :goto_1

    :catch_0
    move-exception v4

    const-string v0, "ApkUpgradeInfo"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "format Date failed:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, v4}, Lcom/huawei/updatesdk/sdk/a/b/a/a/a;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_1
    return-object v3
.end method


# virtual methods
.method public compare(Lcom/huawei/updatesdk/service/appmgr/bean/ApkUpgradeInfo;Lcom/huawei/updatesdk/service/appmgr/bean/ApkUpgradeInfo;)I
    .locals 4

    const/4 v0, 0x0

    if-eq v0, p1, :cond_8

    const/4 v0, 0x0

    if-eq v0, p2, :cond_8

    iget-object v0, p1, Lcom/huawei/updatesdk/service/appmgr/bean/ApkUpgradeInfo;->formatDate:Ljava/util/Date;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    invoke-virtual {p1}, Lcom/huawei/updatesdk/service/appmgr/bean/ApkUpgradeInfo;->getReleaseDate_()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/updatesdk/service/appmgr/bean/ApkUpgradeInfo;->createDate(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v0

    iput-object v0, p1, Lcom/huawei/updatesdk/service/appmgr/bean/ApkUpgradeInfo;->formatDate:Ljava/util/Date;

    :cond_0
    iget-object v0, p2, Lcom/huawei/updatesdk/service/appmgr/bean/ApkUpgradeInfo;->formatDate:Ljava/util/Date;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    invoke-virtual {p2}, Lcom/huawei/updatesdk/service/appmgr/bean/ApkUpgradeInfo;->getReleaseDate_()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/updatesdk/service/appmgr/bean/ApkUpgradeInfo;->createDate(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v0

    iput-object v0, p2, Lcom/huawei/updatesdk/service/appmgr/bean/ApkUpgradeInfo;->formatDate:Ljava/util/Date;

    :cond_1
    iget-object v0, p1, Lcom/huawei/updatesdk/service/appmgr/bean/ApkUpgradeInfo;->formatDate:Ljava/util/Date;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    iget-object v0, p2, Lcom/huawei/updatesdk/service/appmgr/bean/ApkUpgradeInfo;->formatDate:Ljava/util/Date;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_3

    :cond_2
    const-string v0, "ApkUpgradeInfo"

    const-string v1, "formatDate Result is Null"

    invoke-static {v0, v1}, Lcom/huawei/updatesdk/sdk/a/b/a/a/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    return v0

    :cond_3
    iget-object v0, p1, Lcom/huawei/updatesdk/service/appmgr/bean/ApkUpgradeInfo;->formatDate:Ljava/util/Date;

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    iget-object v2, p2, Lcom/huawei/updatesdk/service/appmgr/bean/ApkUpgradeInfo;->formatDate:Ljava/util/Date;

    invoke-virtual {v2}, Ljava/util/Date;->getTime()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-lez v0, :cond_4

    const/4 v0, -0x1

    return v0

    :cond_4
    iget-object v0, p1, Lcom/huawei/updatesdk/service/appmgr/bean/ApkUpgradeInfo;->formatDate:Ljava/util/Date;

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    iget-object v2, p2, Lcom/huawei/updatesdk/service/appmgr/bean/ApkUpgradeInfo;->formatDate:Ljava/util/Date;

    invoke-virtual {v2}, Ljava/util/Date;->getTime()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-nez v0, :cond_7

    invoke-virtual {p1}, Lcom/huawei/updatesdk/service/appmgr/bean/ApkUpgradeInfo;->getDiffSize_()I

    move-result v0

    invoke-virtual {p2}, Lcom/huawei/updatesdk/service/appmgr/bean/ApkUpgradeInfo;->getDiffSize_()I

    move-result v1

    if-le v0, v1, :cond_5

    const/4 v0, 0x1

    return v0

    :cond_5
    invoke-virtual {p1}, Lcom/huawei/updatesdk/service/appmgr/bean/ApkUpgradeInfo;->getDiffSize_()I

    move-result v0

    invoke-virtual {p2}, Lcom/huawei/updatesdk/service/appmgr/bean/ApkUpgradeInfo;->getDiffSize_()I

    move-result v1

    if-ne v0, v1, :cond_6

    const/4 v0, 0x0

    return v0

    :cond_6
    invoke-virtual {p1}, Lcom/huawei/updatesdk/service/appmgr/bean/ApkUpgradeInfo;->getDiffSize_()I

    move-result v0

    invoke-virtual {p2}, Lcom/huawei/updatesdk/service/appmgr/bean/ApkUpgradeInfo;->getDiffSize_()I

    move-result v1

    if-ge v0, v1, :cond_7

    const/4 v0, -0x1

    return v0

    :cond_7
    iget-object v0, p1, Lcom/huawei/updatesdk/service/appmgr/bean/ApkUpgradeInfo;->formatDate:Ljava/util/Date;

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    iget-object v2, p2, Lcom/huawei/updatesdk/service/appmgr/bean/ApkUpgradeInfo;->formatDate:Ljava/util/Date;

    invoke-virtual {v2}, Ljava/util/Date;->getTime()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-gez v0, :cond_8

    const/4 v0, 0x1

    return v0

    :cond_8
    const/4 v0, 0x0

    return v0
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 2

    move-object v0, p1

    check-cast v0, Lcom/huawei/updatesdk/service/appmgr/bean/ApkUpgradeInfo;

    move-object v1, p2

    check-cast v1, Lcom/huawei/updatesdk/service/appmgr/bean/ApkUpgradeInfo;

    invoke-virtual {p0, v0, v1}, Lcom/huawei/updatesdk/service/appmgr/bean/ApkUpgradeInfo;->compare(Lcom/huawei/updatesdk/service/appmgr/bean/ApkUpgradeInfo;Lcom/huawei/updatesdk/service/appmgr/bean/ApkUpgradeInfo;)I

    move-result v0

    return v0
.end method

.method public getDetailId_()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/updatesdk/service/appmgr/bean/ApkUpgradeInfo;->detailId_:Ljava/lang/String;

    return-object v0
.end method

.method public getDevType_()I
    .locals 1

    iget v0, p0, Lcom/huawei/updatesdk/service/appmgr/bean/ApkUpgradeInfo;->devType_:I

    return v0
.end method

.method public getDiffHash_()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/updatesdk/service/appmgr/bean/ApkUpgradeInfo;->diffHash_:Ljava/lang/String;

    return-object v0
.end method

.method public getDiffSize_()I
    .locals 1

    iget v0, p0, Lcom/huawei/updatesdk/service/appmgr/bean/ApkUpgradeInfo;->diffSize_:I

    return v0
.end method

.method public getDownurl_()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/updatesdk/service/appmgr/bean/ApkUpgradeInfo;->downurl_:Ljava/lang/String;

    return-object v0
.end method

.method public getFullDownUrl_()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/updatesdk/service/appmgr/bean/ApkUpgradeInfo;->fullDownUrl_:Ljava/lang/String;

    return-object v0
.end method

.method public getHash_()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/updatesdk/service/appmgr/bean/ApkUpgradeInfo;->hash_:Ljava/lang/String;

    return-object v0
.end method

.method public getIcon_()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/updatesdk/service/appmgr/bean/ApkUpgradeInfo;->icon_:Ljava/lang/String;

    return-object v0
.end method

.method public getId_()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/updatesdk/service/appmgr/bean/ApkUpgradeInfo;->id_:Ljava/lang/String;

    return-object v0
.end method

.method public getIsAutoUpdate_()I
    .locals 1

    iget v0, p0, Lcom/huawei/updatesdk/service/appmgr/bean/ApkUpgradeInfo;->isAutoUpdate_:I

    return v0
.end method

.method public getIsCompulsoryUpdate_()I
    .locals 1

    iget v0, p0, Lcom/huawei/updatesdk/service/appmgr/bean/ApkUpgradeInfo;->isCompulsoryUpdate_:I

    return v0
.end method

.method public getName_()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/updatesdk/service/appmgr/bean/ApkUpgradeInfo;->name_:Ljava/lang/String;

    return-object v0
.end method

.method public getNewFeatures_()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/updatesdk/service/appmgr/bean/ApkUpgradeInfo;->newFeatures_:Ljava/lang/String;

    return-object v0
.end method

.method public getNotRcmReason_()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/updatesdk/service/appmgr/bean/ApkUpgradeInfo;->notRcmReason_:Ljava/lang/String;

    return-object v0
.end method

.method public getOldHashCode()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/updatesdk/service/appmgr/bean/ApkUpgradeInfo;->oldHashCode:Ljava/lang/String;

    return-object v0
.end method

.method public getOldVersionCode_()I
    .locals 1

    iget v0, p0, Lcom/huawei/updatesdk/service/appmgr/bean/ApkUpgradeInfo;->oldVersionCode_:I

    return v0
.end method

.method public getOldVersionName_()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/updatesdk/service/appmgr/bean/ApkUpgradeInfo;->oldVersionName_:Ljava/lang/String;

    return-object v0
.end method

.method public getPackage_()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/updatesdk/service/appmgr/bean/ApkUpgradeInfo;->package_:Ljava/lang/String;

    return-object v0
.end method

.method public getReleaseDateDesc_()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/updatesdk/service/appmgr/bean/ApkUpgradeInfo;->releaseDateDesc_:Ljava/lang/String;

    return-object v0
.end method

.method public getReleaseDate_()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/updatesdk/service/appmgr/bean/ApkUpgradeInfo;->releaseDate_:Ljava/lang/String;

    return-object v0
.end method

.method public getSameS_()I
    .locals 1

    iget v0, p0, Lcom/huawei/updatesdk/service/appmgr/bean/ApkUpgradeInfo;->sameS_:I

    return v0
.end method

.method public getSha256_()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/updatesdk/service/appmgr/bean/ApkUpgradeInfo;->sha256_:Ljava/lang/String;

    return-object v0
.end method

.method public getSize_()I
    .locals 1

    iget v0, p0, Lcom/huawei/updatesdk/service/appmgr/bean/ApkUpgradeInfo;->size_:I

    return v0
.end method

.method public getState_()I
    .locals 1

    iget v0, p0, Lcom/huawei/updatesdk/service/appmgr/bean/ApkUpgradeInfo;->state_:I

    return v0
.end method

.method public getVersionCode_()I
    .locals 1

    iget v0, p0, Lcom/huawei/updatesdk/service/appmgr/bean/ApkUpgradeInfo;->versionCode_:I

    return v0
.end method

.method public getVersion_()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/updatesdk/service/appmgr/bean/ApkUpgradeInfo;->version_:Ljava/lang/String;

    return-object v0
.end method

.method public setDetailId_(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/updatesdk/service/appmgr/bean/ApkUpgradeInfo;->detailId_:Ljava/lang/String;

    return-void
.end method

.method public setDevType_(I)V
    .locals 0

    iput p1, p0, Lcom/huawei/updatesdk/service/appmgr/bean/ApkUpgradeInfo;->devType_:I

    return-void
.end method

.method public setDiffHash_(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/updatesdk/service/appmgr/bean/ApkUpgradeInfo;->diffHash_:Ljava/lang/String;

    return-void
.end method

.method public setDiffSize_(I)V
    .locals 0

    iput p1, p0, Lcom/huawei/updatesdk/service/appmgr/bean/ApkUpgradeInfo;->diffSize_:I

    return-void
.end method

.method public setDownurl_(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/updatesdk/service/appmgr/bean/ApkUpgradeInfo;->downurl_:Ljava/lang/String;

    return-void
.end method

.method public setFullDownUrl_(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/updatesdk/service/appmgr/bean/ApkUpgradeInfo;->fullDownUrl_:Ljava/lang/String;

    return-void
.end method

.method public setHash_(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/updatesdk/service/appmgr/bean/ApkUpgradeInfo;->hash_:Ljava/lang/String;

    return-void
.end method

.method public setIcon_(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/updatesdk/service/appmgr/bean/ApkUpgradeInfo;->icon_:Ljava/lang/String;

    return-void
.end method

.method public setId_(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/updatesdk/service/appmgr/bean/ApkUpgradeInfo;->id_:Ljava/lang/String;

    return-void
.end method

.method public setIsAutoUpdate_(I)V
    .locals 0

    iput p1, p0, Lcom/huawei/updatesdk/service/appmgr/bean/ApkUpgradeInfo;->isAutoUpdate_:I

    return-void
.end method

.method public setIsCompulsoryUpdate_(I)V
    .locals 0

    iput p1, p0, Lcom/huawei/updatesdk/service/appmgr/bean/ApkUpgradeInfo;->isCompulsoryUpdate_:I

    return-void
.end method

.method public setName_(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/updatesdk/service/appmgr/bean/ApkUpgradeInfo;->name_:Ljava/lang/String;

    return-void
.end method

.method public setNewFeatures_(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/updatesdk/service/appmgr/bean/ApkUpgradeInfo;->newFeatures_:Ljava/lang/String;

    return-void
.end method

.method public setNotRcmReason_(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/updatesdk/service/appmgr/bean/ApkUpgradeInfo;->notRcmReason_:Ljava/lang/String;

    return-void
.end method

.method public setOldHashCode(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/updatesdk/service/appmgr/bean/ApkUpgradeInfo;->oldHashCode:Ljava/lang/String;

    return-void
.end method

.method public setOldVersionCode_(I)V
    .locals 0

    iput p1, p0, Lcom/huawei/updatesdk/service/appmgr/bean/ApkUpgradeInfo;->oldVersionCode_:I

    return-void
.end method

.method public setOldVersionName_(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/updatesdk/service/appmgr/bean/ApkUpgradeInfo;->oldVersionName_:Ljava/lang/String;

    return-void
.end method

.method public setPackage_(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/updatesdk/service/appmgr/bean/ApkUpgradeInfo;->package_:Ljava/lang/String;

    return-void
.end method

.method public setReleaseDateDesc_(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/updatesdk/service/appmgr/bean/ApkUpgradeInfo;->releaseDateDesc_:Ljava/lang/String;

    return-void
.end method

.method public setReleaseDate_(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/updatesdk/service/appmgr/bean/ApkUpgradeInfo;->releaseDate_:Ljava/lang/String;

    return-void
.end method

.method public setSameS_(I)V
    .locals 0

    iput p1, p0, Lcom/huawei/updatesdk/service/appmgr/bean/ApkUpgradeInfo;->sameS_:I

    return-void
.end method

.method public setSha256_(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/updatesdk/service/appmgr/bean/ApkUpgradeInfo;->sha256_:Ljava/lang/String;

    return-void
.end method

.method public setSize_(I)V
    .locals 0

    iput p1, p0, Lcom/huawei/updatesdk/service/appmgr/bean/ApkUpgradeInfo;->size_:I

    return-void
.end method

.method public setState_(I)V
    .locals 0

    iput p1, p0, Lcom/huawei/updatesdk/service/appmgr/bean/ApkUpgradeInfo;->state_:I

    return-void
.end method

.method public setVersionCode_(I)V
    .locals 0

    iput p1, p0, Lcom/huawei/updatesdk/service/appmgr/bean/ApkUpgradeInfo;->versionCode_:I

    return-void
.end method

.method public setVersion_(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/updatesdk/service/appmgr/bean/ApkUpgradeInfo;->version_:Ljava/lang/String;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " {\n\tid_: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/updatesdk/service/appmgr/bean/ApkUpgradeInfo;->getId_()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\n\tname_: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/updatesdk/service/appmgr/bean/ApkUpgradeInfo;->getName_()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\n\tpackage_: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/updatesdk/service/appmgr/bean/ApkUpgradeInfo;->getPackage_()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\n\tversion_: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/updatesdk/service/appmgr/bean/ApkUpgradeInfo;->getVersion_()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\n\tdiffSize_: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/updatesdk/service/appmgr/bean/ApkUpgradeInfo;->getDiffSize_()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\n\tdiffHash_: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/updatesdk/service/appmgr/bean/ApkUpgradeInfo;->getDiffHash_()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\n\toldHashCode: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/updatesdk/service/appmgr/bean/ApkUpgradeInfo;->getOldHashCode()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\n\thash_: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/updatesdk/service/appmgr/bean/ApkUpgradeInfo;->getHash_()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\n\tsameS_: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/updatesdk/service/appmgr/bean/ApkUpgradeInfo;->getSameS_()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\n\tsize_: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/updatesdk/service/appmgr/bean/ApkUpgradeInfo;->getSize_()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\n\treleaseDate_: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/updatesdk/service/appmgr/bean/ApkUpgradeInfo;->getReleaseDate_()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\n\ticon_: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/updatesdk/service/appmgr/bean/ApkUpgradeInfo;->getIcon_()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\n\toldVersionCode_: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/updatesdk/service/appmgr/bean/ApkUpgradeInfo;->getOldVersionCode_()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\n\tversionCode_: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/updatesdk/service/appmgr/bean/ApkUpgradeInfo;->getVersionCode_()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\n\tdownurl_: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/updatesdk/service/appmgr/bean/ApkUpgradeInfo;->getDownurl_()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\n\tnewFeatures_: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/updatesdk/service/appmgr/bean/ApkUpgradeInfo;->getNewFeatures_()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\n\treleaseDateDesc_: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/updatesdk/service/appmgr/bean/ApkUpgradeInfo;->getReleaseDateDesc_()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\n\tstate_: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/updatesdk/service/appmgr/bean/ApkUpgradeInfo;->getState_()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\n\tdetailId_: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/updatesdk/service/appmgr/bean/ApkUpgradeInfo;->getDetailId_()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\n\tisCompulsoryUpdate_: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/updatesdk/service/appmgr/bean/ApkUpgradeInfo;->getIsCompulsoryUpdate_()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\n\tnotRcmReason_: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/updatesdk/service/appmgr/bean/ApkUpgradeInfo;->getNotRcmReason_()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\n\tfullDownUrl_: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/updatesdk/service/appmgr/bean/ApkUpgradeInfo;->getFullDownUrl_()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\n\tdevType_: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/updatesdk/service/appmgr/bean/ApkUpgradeInfo;->getDevType_()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\n}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
