.class public Lcom/huawei/openalliance/ad/inter/data/AdLandingPageData;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/openalliance/ad/inter/data/AdLandingPageData$WorkKeyCallable;
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = 0x1d019c4L


# instance fields
.field private adType:I

.field private appInfo:Lcom/huawei/openalliance/ad/inter/data/AppInfo;

.field private contentId:Ljava/lang/String;

.field private ctrlSwitchs:Ljava/lang/String;

.field private landingUrl:Ljava/lang/String;

.field private monitors:Lcom/huawei/openalliance/ad/db/bean/EncryptionField;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/huawei/openalliance/ad/db/bean/EncryptionField<Ljava/util/List<Lcom/huawei/openalliance/ad/beans/metadata/Monitor;>;>;"
        }
    .end annotation
.end field

.field private noReportEventList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field private paramFromServer:Lcom/huawei/openalliance/ad/db/bean/EncryptionField;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/huawei/openalliance/ad/db/bean/EncryptionField<Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field private shareInfo:Lcom/huawei/openalliance/ad/inter/data/ShareInfo;

.field private showId:Ljava/lang/String;

.field private showPageTitle:Z

.field private textStateList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/openalliance/ad/beans/metadata/TextState;>;"
        }
    .end annotation
.end field

.field private webConfig:Ljava/lang/String;

.field private workKey:[B


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lcom/huawei/openalliance/ad/db/bean/ContentRecord;Landroid/content/Context;Z)V
    .locals 7

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;->getContentId_()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/openalliance/ad/inter/data/AdLandingPageData;->setContentId(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;->getAdType_()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/openalliance/ad/inter/data/AdLandingPageData;->setAdType(I)V

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;->getParamFromServer_()Lcom/huawei/openalliance/ad/db/bean/EncryptionField;

    move-result-object v0

    invoke-direct {p0, v0, p2}, Lcom/huawei/openalliance/ad/inter/data/AdLandingPageData;->ensureFieldEncryption(Lcom/huawei/openalliance/ad/db/bean/EncryptionField;Landroid/content/Context;)Lcom/huawei/openalliance/ad/db/bean/EncryptionField;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/openalliance/ad/inter/data/AdLandingPageData;->setParamFromServer(Lcom/huawei/openalliance/ad/db/bean/EncryptionField;)V

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;->getDetailUrl_()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/openalliance/ad/inter/data/AdLandingPageData;->setLandingUrl(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;->getShowId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/openalliance/ad/inter/data/AdLandingPageData;->setShowId(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;->getNoReportEventList()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/openalliance/ad/inter/data/AdLandingPageData;->setNoReportEventList(Ljava/util/List;)V

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;->getMetaData_()Ljava/lang/String;

    move-result-object v0

    const-class v1, Lcom/huawei/openalliance/ad/beans/metadata/MetaData;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Class;

    invoke-static {v0, v1, v2}, Lcom/huawei/openalliance/ad/utils/p;->b(Ljava/lang/String;Ljava/lang/Class;[Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/openalliance/ad/beans/metadata/MetaData;

    if-eqz v3, :cond_2

    invoke-virtual {v3}, Lcom/huawei/openalliance/ad/beans/metadata/MetaData;->getShareInfo()Lcom/huawei/openalliance/ad/beans/metadata/ShareInfo;

    move-result-object v4

    if-eqz v4, :cond_0

    new-instance v0, Lcom/huawei/openalliance/ad/inter/data/ShareInfo;

    invoke-direct {v0, v4}, Lcom/huawei/openalliance/ad/inter/data/ShareInfo;-><init>(Lcom/huawei/openalliance/ad/beans/metadata/ShareInfo;)V

    invoke-virtual {p0, v0}, Lcom/huawei/openalliance/ad/inter/data/AdLandingPageData;->setShareInfo(Lcom/huawei/openalliance/ad/inter/data/ShareInfo;)V

    :cond_0
    if-eqz p3, :cond_1

    invoke-virtual {v3}, Lcom/huawei/openalliance/ad/beans/metadata/MetaData;->getApkInfo()Lcom/huawei/openalliance/ad/beans/metadata/ApkInfo;

    move-result-object v5

    if-eqz v5, :cond_1

    new-instance v6, Lcom/huawei/openalliance/ad/inter/data/AppInfo;

    invoke-direct {v6, v5}, Lcom/huawei/openalliance/ad/inter/data/AppInfo;-><init>(Lcom/huawei/openalliance/ad/beans/metadata/ApkInfo;)V

    invoke-virtual {v3}, Lcom/huawei/openalliance/ad/beans/metadata/MetaData;->getIntent__()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/openalliance/ad/inter/data/AppInfo;->setIntentUri(Ljava/lang/String;)V

    invoke-virtual {p0, v6}, Lcom/huawei/openalliance/ad/inter/data/AdLandingPageData;->setAppInfo(Lcom/huawei/openalliance/ad/inter/data/AppInfo;)V

    :cond_1
    invoke-virtual {v3}, Lcom/huawei/openalliance/ad/beans/metadata/MetaData;->getTextStateList()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/openalliance/ad/inter/data/AdLandingPageData;->setTextStateList(Ljava/util/List;)V

    :cond_2
    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;->getMonitors()Lcom/huawei/openalliance/ad/db/bean/EncryptionField;

    move-result-object v0

    invoke-direct {p0, v0, p2}, Lcom/huawei/openalliance/ad/inter/data/AdLandingPageData;->ensureFieldEncryption(Lcom/huawei/openalliance/ad/db/bean/EncryptionField;Landroid/content/Context;)Lcom/huawei/openalliance/ad/db/bean/EncryptionField;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/openalliance/ad/inter/data/AdLandingPageData;->setMonitors(Lcom/huawei/openalliance/ad/db/bean/EncryptionField;)V

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;->getLandingTitleFlag()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_3

    const/4 v0, 0x1

    goto :goto_0

    :cond_3
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p0, v0}, Lcom/huawei/openalliance/ad/inter/data/AdLandingPageData;->setShowPageTitle(Z)V

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;->getWebConfig()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/openalliance/ad/inter/data/AdLandingPageData;->setWebConfig(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;->getCtrlSwitchs()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/openalliance/ad/inter/data/AdLandingPageData;->setCtrlSwitchs(Ljava/lang/String;)V

    return-void
.end method

.method private ensureFieldEncryption(Lcom/huawei/openalliance/ad/db/bean/EncryptionField;Landroid/content/Context;)Lcom/huawei/openalliance/ad/db/bean/EncryptionField;
    .locals 1

    if-nez p1, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/db/bean/EncryptionField;->isCipherFieldAvailable()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/db/bean/EncryptionField;->isOriginalFieldAvailable()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/inter/data/AdLandingPageData;->workKey:[B

    if-nez v0, :cond_1

    new-instance v0, Lcom/huawei/openalliance/ad/inter/data/AdLandingPageData$WorkKeyCallable;

    invoke-direct {v0, p2}, Lcom/huawei/openalliance/ad/inter/data/AdLandingPageData$WorkKeyCallable;-><init>(Landroid/content/Context;)V

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/af;->a(Ljava/util/concurrent/Callable;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    iput-object v0, p0, Lcom/huawei/openalliance/ad/inter/data/AdLandingPageData;->workKey:[B

    :cond_1
    iget-object v0, p0, Lcom/huawei/openalliance/ad/inter/data/AdLandingPageData;->workKey:[B

    invoke-virtual {p1, v0}, Lcom/huawei/openalliance/ad/db/bean/EncryptionField;->getEncryptedFieldValue([B)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/openalliance/ad/db/bean/EncryptionField;->setCipherField(Ljava/lang/String;)V

    :cond_2
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/huawei/openalliance/ad/db/bean/EncryptionField;->setOriginalField(Ljava/lang/Object;)V

    return-object p1
.end method


# virtual methods
.method public getAdType()I
    .locals 1

    iget v0, p0, Lcom/huawei/openalliance/ad/inter/data/AdLandingPageData;->adType:I

    return v0
.end method

.method public getAppInfo()Lcom/huawei/openalliance/ad/inter/data/AppInfo;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/inter/data/AdLandingPageData;->appInfo:Lcom/huawei/openalliance/ad/inter/data/AppInfo;

    return-object v0
.end method

.method public getContentId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/inter/data/AdLandingPageData;->contentId:Ljava/lang/String;

    return-object v0
.end method

.method public getCtrlSwitchs()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/inter/data/AdLandingPageData;->ctrlSwitchs:Ljava/lang/String;

    return-object v0
.end method

.method public getLandingUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/inter/data/AdLandingPageData;->landingUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getMonitors()Lcom/huawei/openalliance/ad/db/bean/EncryptionField;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Lcom/huawei/openalliance/ad/db/bean/EncryptionField<Ljava/util/List<Lcom/huawei/openalliance/ad/beans/metadata/Monitor;>;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/huawei/openalliance/ad/inter/data/AdLandingPageData;->monitors:Lcom/huawei/openalliance/ad/db/bean/EncryptionField;

    return-object v0
.end method

.method public getNoReportEventList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/huawei/openalliance/ad/inter/data/AdLandingPageData;->noReportEventList:Ljava/util/List;

    return-object v0
.end method

.method public getParamFromServer()Lcom/huawei/openalliance/ad/db/bean/EncryptionField;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Lcom/huawei/openalliance/ad/db/bean/EncryptionField<Ljava/lang/String;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/huawei/openalliance/ad/inter/data/AdLandingPageData;->paramFromServer:Lcom/huawei/openalliance/ad/db/bean/EncryptionField;

    return-object v0
.end method

.method public getShareInfo()Lcom/huawei/openalliance/ad/inter/data/ShareInfo;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/inter/data/AdLandingPageData;->shareInfo:Lcom/huawei/openalliance/ad/inter/data/ShareInfo;

    return-object v0
.end method

.method public getShowId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/inter/data/AdLandingPageData;->showId:Ljava/lang/String;

    return-object v0
.end method

.method public getTextStateList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/openalliance/ad/beans/metadata/TextState;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/huawei/openalliance/ad/inter/data/AdLandingPageData;->textStateList:Ljava/util/List;

    return-object v0
.end method

.method public getWebConfig()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/inter/data/AdLandingPageData;->webConfig:Ljava/lang/String;

    return-object v0
.end method

.method public isShowPageTitle()Z
    .locals 1

    iget-boolean v0, p0, Lcom/huawei/openalliance/ad/inter/data/AdLandingPageData;->showPageTitle:Z

    return v0
.end method

.method public setAdType(I)V
    .locals 0

    iput p1, p0, Lcom/huawei/openalliance/ad/inter/data/AdLandingPageData;->adType:I

    return-void
.end method

.method public setAppInfo(Lcom/huawei/openalliance/ad/inter/data/AppInfo;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/inter/data/AdLandingPageData;->appInfo:Lcom/huawei/openalliance/ad/inter/data/AppInfo;

    return-void
.end method

.method public setContentId(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/inter/data/AdLandingPageData;->contentId:Ljava/lang/String;

    return-void
.end method

.method public setCtrlSwitchs(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/inter/data/AdLandingPageData;->ctrlSwitchs:Ljava/lang/String;

    return-void
.end method

.method public setLandingUrl(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/inter/data/AdLandingPageData;->landingUrl:Ljava/lang/String;

    return-void
.end method

.method public setMonitors(Lcom/huawei/openalliance/ad/db/bean/EncryptionField;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/openalliance/ad/db/bean/EncryptionField<Ljava/util/List<Lcom/huawei/openalliance/ad/beans/metadata/Monitor;>;>;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/huawei/openalliance/ad/inter/data/AdLandingPageData;->monitors:Lcom/huawei/openalliance/ad/db/bean/EncryptionField;

    return-void
.end method

.method public setNoReportEventList(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/String;>;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/huawei/openalliance/ad/inter/data/AdLandingPageData;->noReportEventList:Ljava/util/List;

    return-void
.end method

.method public setParamFromServer(Lcom/huawei/openalliance/ad/db/bean/EncryptionField;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/openalliance/ad/db/bean/EncryptionField<Ljava/lang/String;>;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/huawei/openalliance/ad/inter/data/AdLandingPageData;->paramFromServer:Lcom/huawei/openalliance/ad/db/bean/EncryptionField;

    return-void
.end method

.method public setShareInfo(Lcom/huawei/openalliance/ad/inter/data/ShareInfo;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/inter/data/AdLandingPageData;->shareInfo:Lcom/huawei/openalliance/ad/inter/data/ShareInfo;

    return-void
.end method

.method public setShowId(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/inter/data/AdLandingPageData;->showId:Ljava/lang/String;

    return-void
.end method

.method public setShowPageTitle(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/huawei/openalliance/ad/inter/data/AdLandingPageData;->showPageTitle:Z

    return-void
.end method

.method public setTextStateList(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/openalliance/ad/beans/metadata/TextState;>;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/huawei/openalliance/ad/inter/data/AdLandingPageData;->textStateList:Ljava/util/List;

    return-void
.end method

.method public setWebConfig(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/inter/data/AdLandingPageData;->webConfig:Ljava/lang/String;

    return-void
.end method
