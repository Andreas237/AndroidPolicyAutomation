.class public Lcom/huawei/openalliance/ad/k/e;
.super Ljava/lang/Object;


# static fields
.field private static final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lcom/huawei/openalliance/ad/k/e;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/openalliance/ad/k/e;->a:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Lcom/huawei/openalliance/ad/inter/data/NativeAd;)Lcom/huawei/openalliance/ad/db/bean/ContentRecord;
    .locals 6

    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    new-instance v2, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;

    invoke-direct {v2}, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;-><init>()V

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/inter/data/NativeAd;->getSlotId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;->setSlotId_(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/inter/data/NativeAd;->getContentId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;->setContentId_(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/inter/data/NativeAd;->getStartTime()J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;->setStartTime_(J)V

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/inter/data/NativeAd;->getEndTime()J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;->setEndTime_(J)V

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/inter/data/NativeAd;->getNoReportEventList()Ljava/util/List;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;->setNoReportEventList(Ljava/util/List;)V

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/inter/data/NativeAd;->getEncodedParamFromServer()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/huawei/openalliance/ad/utils/ad;->a(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    new-instance v4, Lcom/huawei/openalliance/ad/db/bean/EncryptionField;

    const-class v0, Ljava/lang/String;

    invoke-direct {v4, v0}, Lcom/huawei/openalliance/ad/db/bean/EncryptionField;-><init>(Ljava/lang/Class;)V

    invoke-virtual {v4, v3}, Lcom/huawei/openalliance/ad/db/bean/EncryptionField;->setCipherField(Ljava/lang/String;)V

    invoke-virtual {v2, v4}, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;->setParamFromServer_(Lcom/huawei/openalliance/ad/db/bean/EncryptionField;)V

    :cond_1
    const/4 v0, 0x3

    invoke-virtual {v2, v0}, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;->setAdType_(I)V

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/inter/data/NativeAd;->getLandWebUrl()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;->setDetailUrl_(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/inter/data/NativeAd;->getInterActionType()I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;->setInteractiontype_(I)V

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/inter/data/NativeAd;->getIntent()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;->setIntentUri_(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/inter/data/NativeAd;->getMetaData()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;->setMetaData_(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/inter/data/NativeAd;->getEncodedeMonitors()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/huawei/openalliance/ad/utils/ad;->a(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    new-instance v5, Lcom/huawei/openalliance/ad/db/bean/EncryptionField;

    const-class v0, Ljava/util/List;

    const-class v1, Lcom/huawei/openalliance/ad/beans/metadata/Monitor;

    invoke-direct {v5, v0, v1}, Lcom/huawei/openalliance/ad/db/bean/EncryptionField;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    invoke-virtual {v5, v4}, Lcom/huawei/openalliance/ad/db/bean/EncryptionField;->setCipherField(Ljava/lang/String;)V

    invoke-virtual {v2, v5}, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;->setMonitors(Lcom/huawei/openalliance/ad/db/bean/EncryptionField;)V

    :cond_2
    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/inter/data/NativeAd;->getShowLandingPageTitleFlag()I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;->setLandingTitleFlag(I)V

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/inter/data/NativeAd;->getClickActionList()Ljava/util/List;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;->setClickActionList(Ljava/util/List;)V

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/inter/data/NativeAd;->getWebConfig()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;->setWebConfig(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/inter/data/NativeAd;->getCtrlSwitchs()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;->setCtrlSwitchs(Ljava/lang/String;)V

    return-object v2
.end method

.method public static a(Ljava/lang/String;Lcom/huawei/openalliance/ad/beans/metadata/Content;[B)Lcom/huawei/openalliance/ad/inter/data/NativeAd;
    .locals 11

    new-instance v2, Lcom/huawei/openalliance/ad/inter/data/NativeAd;

    invoke-direct {v2}, Lcom/huawei/openalliance/ad/inter/data/NativeAd;-><init>()V

    invoke-virtual {v2, p0}, Lcom/huawei/openalliance/ad/inter/data/NativeAd;->setSlotId(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/beans/metadata/Content;->getContentid__()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/openalliance/ad/inter/data/NativeAd;->setContentId(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/beans/metadata/Content;->getInteractiontype__()I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/openalliance/ad/inter/data/NativeAd;->setInteractiontype(I)V

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/beans/metadata/Content;->getStarttime__()J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/openalliance/ad/inter/data/NativeAd;->setStartTime(J)V

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/beans/metadata/Content;->getEndtime__()J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/openalliance/ad/inter/data/NativeAd;->setEndTime(J)V

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/beans/metadata/Content;->getCreativetype__()I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/openalliance/ad/inter/data/NativeAd;->setCreativeType(I)V

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/beans/metadata/Content;->getNoReportEventList()Ljava/util/List;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/openalliance/ad/inter/data/NativeAd;->setNoReportEventList(Ljava/util/List;)V

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/beans/metadata/Content;->getKeyWords()Ljava/util/List;

    move-result-object v3

    if-eqz v3, :cond_1

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_1

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/lang/String;

    invoke-static {v6}, Lcom/huawei/openalliance/ad/utils/ad;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-virtual {v2, v4}, Lcom/huawei/openalliance/ad/inter/data/NativeAd;->setAdCloseKeyWords(Ljava/util/List;)V

    :cond_1
    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/beans/metadata/Content;->getParamfromserver__()Lcom/huawei/openalliance/ad/beans/metadata/ParamFromServer;

    move-result-object v4

    const/4 v0, 0x0

    if-eq v0, v4, :cond_2

    invoke-static {v4}, Lcom/huawei/openalliance/ad/utils/p;->b(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p2}, Lcom/huawei/openalliance/ad/utils/b;->a(Ljava/lang/String;[B)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/openalliance/ad/inter/data/NativeAd;->setEncodedParamFromServer(Ljava/lang/String;)V

    :cond_2
    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/beans/metadata/Content;->getMonitor()Ljava/util/List;

    move-result-object v5

    const/4 v0, 0x0

    if-eq v0, v5, :cond_3

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_3

    new-instance v6, Lcom/huawei/openalliance/ad/db/bean/EncryptionField;

    const-class v0, Ljava/util/List;

    const-class v1, Lcom/huawei/openalliance/ad/beans/metadata/Monitor;

    invoke-direct {v6, v0, v1}, Lcom/huawei/openalliance/ad/db/bean/EncryptionField;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    invoke-virtual {v6, v5}, Lcom/huawei/openalliance/ad/db/bean/EncryptionField;->setOriginalField(Ljava/lang/Object;)V

    invoke-virtual {v6, p2}, Lcom/huawei/openalliance/ad/db/bean/EncryptionField;->getEncryptedFieldValue([B)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/openalliance/ad/inter/data/NativeAd;->setEncodedeMonitors(Ljava/lang/String;)V

    :cond_3
    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/beans/metadata/Content;->getLandingTitle()I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/openalliance/ad/inter/data/NativeAd;->setShowLandingPageTitleFlag(I)V

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/beans/metadata/Content;->getClickActionList()Ljava/util/List;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/openalliance/ad/inter/data/NativeAd;->setClickActionList(Ljava/util/List;)V

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/beans/metadata/Content;->getWebConfig()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/openalliance/ad/inter/data/NativeAd;->setWebConfig(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/beans/metadata/Content;->getCtrlSwitchs()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/openalliance/ad/inter/data/NativeAd;->setCtrlSwitchs(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/beans/metadata/Content;->getMetaData()Lcom/huawei/openalliance/ad/beans/metadata/MetaData;

    move-result-object v6

    const/4 v0, 0x0

    if-ne v0, v6, :cond_4

    return-object v2

    :cond_4
    invoke-virtual {v6}, Lcom/huawei/openalliance/ad/beans/metadata/MetaData;->getTitle__()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/ad;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/openalliance/ad/inter/data/NativeAd;->setTitle(Ljava/lang/String;)V

    invoke-virtual {v6}, Lcom/huawei/openalliance/ad/beans/metadata/MetaData;->getDescription__()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/ad;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/openalliance/ad/inter/data/NativeAd;->setDescription(Ljava/lang/String;)V

    invoke-virtual {v6}, Lcom/huawei/openalliance/ad/beans/metadata/MetaData;->getIcon__()Ljava/util/List;

    move-result-object v7

    const/4 v0, 0x0

    if-eq v0, v7, :cond_5

    invoke-interface {v7}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_5

    new-instance v0, Lcom/huawei/openalliance/ad/inter/data/ImageInfo;

    const/4 v1, 0x0

    invoke-interface {v7, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/openalliance/ad/beans/metadata/ImageInfo;

    invoke-direct {v0, v1}, Lcom/huawei/openalliance/ad/inter/data/ImageInfo;-><init>(Lcom/huawei/openalliance/ad/beans/metadata/ImageInfo;)V

    invoke-virtual {v2, v0}, Lcom/huawei/openalliance/ad/inter/data/NativeAd;->setIcon(Lcom/huawei/openalliance/ad/inter/data/ImageInfo;)V

    :cond_5
    invoke-virtual {v6}, Lcom/huawei/openalliance/ad/beans/metadata/MetaData;->getImageInfo__()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/openalliance/ad/k/e;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/openalliance/ad/inter/data/NativeAd;->setImageInfos(Ljava/util/List;)V

    invoke-virtual {v6}, Lcom/huawei/openalliance/ad/beans/metadata/MetaData;->getVideoInfo__()Lcom/huawei/openalliance/ad/beans/metadata/VideoInfo;

    move-result-object v8

    const/4 v0, 0x0

    if-eq v0, v8, :cond_6

    new-instance v0, Lcom/huawei/openalliance/ad/inter/data/VideoInfo;

    invoke-direct {v0, v8}, Lcom/huawei/openalliance/ad/inter/data/VideoInfo;-><init>(Lcom/huawei/openalliance/ad/beans/metadata/VideoInfo;)V

    invoke-virtual {v2, v0}, Lcom/huawei/openalliance/ad/inter/data/NativeAd;->setVideoInfo(Lcom/huawei/openalliance/ad/inter/data/VideoInfo;)V

    :cond_6
    invoke-virtual {v6}, Lcom/huawei/openalliance/ad/beans/metadata/MetaData;->getClickUrl__()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/openalliance/ad/inter/data/NativeAd;->setLandWebUrl(Ljava/lang/String;)V

    invoke-virtual {v6}, Lcom/huawei/openalliance/ad/beans/metadata/MetaData;->getMinEffectiveShowTime__()J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/openalliance/ad/inter/data/NativeAd;->setMinEffectiveShowTime(J)V

    invoke-virtual {v6}, Lcom/huawei/openalliance/ad/beans/metadata/MetaData;->getMinEffectiveShowRatio__()I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/openalliance/ad/inter/data/NativeAd;->setMinEffectiveShowRatio(I)V

    invoke-virtual {v6}, Lcom/huawei/openalliance/ad/beans/metadata/MetaData;->getLabel__()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/ad;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/openalliance/ad/inter/data/NativeAd;->setLabel(Ljava/lang/String;)V

    invoke-virtual {v6}, Lcom/huawei/openalliance/ad/beans/metadata/MetaData;->getAppPromotionChannel__()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/openalliance/ad/inter/data/NativeAd;->setAppPromotionChannel(Ljava/lang/String;)V

    invoke-virtual {v6}, Lcom/huawei/openalliance/ad/beans/metadata/MetaData;->getMarketAppId__()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/openalliance/ad/inter/data/NativeAd;->setMarketAppId(Ljava/lang/String;)V

    invoke-virtual {v6}, Lcom/huawei/openalliance/ad/beans/metadata/MetaData;->getIntent__()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/openalliance/ad/inter/data/NativeAd;->setIntent(Ljava/lang/String;)V

    invoke-virtual {v6}, Lcom/huawei/openalliance/ad/beans/metadata/MetaData;->getCta__()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/ad;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/openalliance/ad/inter/data/NativeAd;->setCta(Ljava/lang/String;)V

    invoke-virtual {v6}, Lcom/huawei/openalliance/ad/beans/metadata/MetaData;->getApkInfo()Lcom/huawei/openalliance/ad/beans/metadata/ApkInfo;

    move-result-object v9

    const/4 v0, 0x0

    if-eq v0, v9, :cond_7

    new-instance v10, Lcom/huawei/openalliance/ad/inter/data/AppInfo;

    invoke-direct {v10, v9}, Lcom/huawei/openalliance/ad/inter/data/AppInfo;-><init>(Lcom/huawei/openalliance/ad/beans/metadata/ApkInfo;)V

    invoke-virtual {v2}, Lcom/huawei/openalliance/ad/inter/data/NativeAd;->getIntent()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/huawei/openalliance/ad/inter/data/AppInfo;->setIntentUri(Ljava/lang/String;)V

    invoke-virtual {v2, v10}, Lcom/huawei/openalliance/ad/inter/data/NativeAd;->setAppInfo(Lcom/huawei/openalliance/ad/inter/data/AppInfo;)V

    :cond_7
    invoke-virtual {v6}, Lcom/huawei/openalliance/ad/beans/metadata/MetaData;->getAdSign()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/openalliance/ad/inter/data/NativeAd;->setAdSign(Ljava/lang/String;)V

    :try_start_0
    invoke-static {v6}, Lcom/huawei/openalliance/ad/utils/p;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/openalliance/ad/inter/data/NativeAd;->setMetaData(Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v10

    sget-object v0, Lcom/huawei/openalliance/ad/k/e;->a:Ljava/lang/String;

    const-string v1, "MetaData.toJson error"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    :goto_1
    return-object v2
.end method

.method private static a(Ljava/util/List;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/openalliance/ad/beans/metadata/ImageInfo;>;)Ljava/util/List<Lcom/huawei/openalliance/ad/inter/data/ImageInfo;>;"
        }
    .end annotation

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/openalliance/ad/beans/metadata/ImageInfo;

    new-instance v0, Lcom/huawei/openalliance/ad/inter/data/ImageInfo;

    invoke-direct {v0, v3}, Lcom/huawei/openalliance/ad/inter/data/ImageInfo;-><init>(Lcom/huawei/openalliance/ad/beans/metadata/ImageInfo;)V

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v1
.end method
