.class public abstract Lcom/huawei/openalliance/ad/k/g;
.super Ljava/lang/Object;


# direct methods
.method private static a(Lcom/huawei/openalliance/ad/db/bean/EventRecord;Landroid/content/Context;)Lcom/huawei/openalliance/ad/beans/metadata/AdEvent;
    .locals 9

    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    new-instance v4, Lcom/huawei/openalliance/ad/beans/metadata/AdEvent;

    invoke-direct {v4}, Lcom/huawei/openalliance/ad/beans/metadata/AdEvent;-><init>()V

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/db/bean/EventRecord;->getType_()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/openalliance/ad/beans/metadata/AdEvent;->setType__(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/db/bean/EventRecord;->getTime_()J

    move-result-wide v0

    invoke-virtual {v4, v0, v1}, Lcom/huawei/openalliance/ad/beans/metadata/AdEvent;->setTime__(J)V

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/db/bean/EventRecord;->getRawX_()I

    move-result v0

    invoke-virtual {v4, v0}, Lcom/huawei/openalliance/ad/beans/metadata/AdEvent;->setRawX__(I)V

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/db/bean/EventRecord;->getRawY_()I

    move-result v0

    invoke-virtual {v4, v0}, Lcom/huawei/openalliance/ad/beans/metadata/AdEvent;->setRawY__(I)V

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/db/bean/EventRecord;->getOpTimesInLandingPage_()I

    move-result v0

    invoke-virtual {v4, v0}, Lcom/huawei/openalliance/ad/beans/metadata/AdEvent;->setOpTimesInLandingPage__(I)V

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/db/bean/EventRecord;->get_id()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/openalliance/ad/beans/metadata/AdEvent;->setSeq__(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/db/bean/EventRecord;->getShowid_()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/openalliance/ad/beans/metadata/AdEvent;->setShowid__(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/db/bean/EventRecord;->getExt()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/openalliance/ad/beans/metadata/AdEvent;->setExt(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/db/bean/EventRecord;->getKeyWords()Ljava/util/List;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/openalliance/ad/beans/metadata/AdEvent;->setCloseReason(Ljava/util/List;)V

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/db/bean/EventRecord;->getRepeatedCount()J

    move-result-wide v0

    invoke-virtual {v4, v0, v1}, Lcom/huawei/openalliance/ad/beans/metadata/AdEvent;->setRepeatedCount(J)V

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/db/bean/EventRecord;->getLastReportTime()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/openalliance/ad/beans/metadata/AdEvent;->setLastReportTime(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/db/bean/EventRecord;->getLastFailReason()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/openalliance/ad/beans/metadata/AdEvent;->setLastFailReason(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/db/bean/EventRecord;->getContentDownMethod()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/ad;->f(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/openalliance/ad/beans/metadata/AdEvent;->setContentDownMethod(Ljava/lang/Integer;)V

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/db/bean/EventRecord;->getPreContentSuccessList()Ljava/util/List;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/openalliance/ad/beans/metadata/AdEvent;->setPreContentSuccessList(Ljava/util/List;)V

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/db/bean/EventRecord;->getIntentDest()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/ad;->f(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/openalliance/ad/beans/metadata/AdEvent;->setIntentDestination(Ljava/lang/Integer;)V

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/db/bean/EventRecord;->getIntentFailReason()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/ad;->f(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/openalliance/ad/beans/metadata/AdEvent;->setIntentFailReason(Ljava/lang/Integer;)V

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/db/bean/EventRecord;->getAppDownloadRelatedActionSource()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/ad;->f(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/openalliance/ad/beans/metadata/AdEvent;->setAppDownloadRelatedActionSource(Ljava/lang/Integer;)V

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/db/bean/EventRecord;->getInstallRelatedActionSource()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/ad;->f(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/openalliance/ad/beans/metadata/AdEvent;->setInstallRelatedActionSource(Ljava/lang/Integer;)V

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/db/bean/EventRecord;->getPreCheckResult()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/ad;->f(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/openalliance/ad/beans/metadata/AdEvent;->setPreCheckResult(Ljava/lang/Integer;)V

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/db/bean/EventRecord;->getMaxShowRatio_()I

    move-result v0

    const v1, -0x1b207

    if-eq v1, v0, :cond_1

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/db/bean/EventRecord;->getMaxShowRatio_()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/openalliance/ad/beans/metadata/AdEvent;->setMaxShowRatio__(Ljava/lang/Integer;)V

    :cond_1
    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/db/bean/EventRecord;->getShowTimeDuration_()J

    move-result-wide v0

    const-wide/32 v2, -0x1b207

    cmp-long v0, v2, v0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/db/bean/EventRecord;->getShowTimeDuration_()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/openalliance/ad/beans/metadata/AdEvent;->setShowTimeDuration__(Ljava/lang/Long;)V

    :cond_2
    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/db/bean/EventRecord;->getClickSuccessDestination_()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/openalliance/ad/beans/metadata/AdEvent;->setClickSuccessDestination__(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/db/bean/EventRecord;->getVideoPlayStartTime_()J

    move-result-wide v0

    const-wide/32 v2, -0x1b207

    cmp-long v0, v2, v0

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/db/bean/EventRecord;->getVideoPlayStartTime_()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/openalliance/ad/beans/metadata/AdEvent;->setVideoPlayStartTime__(Ljava/lang/Long;)V

    :cond_3
    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/db/bean/EventRecord;->getVideoPlayEndTime_()J

    move-result-wide v0

    const-wide/32 v2, -0x1b207

    cmp-long v0, v2, v0

    if-eqz v0, :cond_4

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/db/bean/EventRecord;->getVideoPlayEndTime_()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/openalliance/ad/beans/metadata/AdEvent;->setVideoPlayEndTime__(Ljava/lang/Long;)V

    :cond_4
    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/db/bean/EventRecord;->getVideoPlayStartProgress_()I

    move-result v0

    const v1, -0x1b207

    if-eq v1, v0, :cond_5

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/db/bean/EventRecord;->getVideoPlayStartProgress_()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/openalliance/ad/beans/metadata/AdEvent;->setVideoPlayStartProgress__(Ljava/lang/Integer;)V

    :cond_5
    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/db/bean/EventRecord;->getVideoPlayEndProgress_()I

    move-result v0

    const v1, -0x1b207

    if-eq v1, v0, :cond_6

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/db/bean/EventRecord;->getVideoPlayEndProgress_()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/openalliance/ad/beans/metadata/AdEvent;->setVideoPlayEndProgress__(Ljava/lang/Integer;)V

    :cond_6
    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/db/bean/EventRecord;->getParamFromServer_()Lcom/huawei/openalliance/ad/db/bean/EncryptionField;

    move-result-object v5

    if-eqz v5, :cond_8

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/db/bean/EventRecord;->getKey()[B

    move-result-object v7

    if-eqz v7, :cond_7

    invoke-virtual {v5, v7}, Lcom/huawei/openalliance/ad/db/bean/EncryptionField;->getDecryptedFieldValue([B)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/lang/String;

    goto :goto_0

    :cond_7
    invoke-virtual {v5, p1}, Lcom/huawei/openalliance/ad/db/bean/EncryptionField;->getDecryptedFieldValue(Landroid/content/Context;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/lang/String;

    :goto_0
    invoke-static {v6}, Lcom/huawei/openalliance/ad/utils/ad;->a(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_8

    const-class v0, Lcom/huawei/openalliance/ad/beans/metadata/ParamFromServer;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Class;

    invoke-static {v6, v0, v1}, Lcom/huawei/openalliance/ad/utils/p;->b(Ljava/lang/String;Ljava/lang/Class;[Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/huawei/openalliance/ad/beans/metadata/ParamFromServer;

    invoke-virtual {v4, v8}, Lcom/huawei/openalliance/ad/beans/metadata/AdEvent;->setParamfromserver__(Lcom/huawei/openalliance/ad/beans/metadata/ParamFromServer;)V

    :cond_8
    return-object v4
.end method

.method public static a(Ljava/lang/String;Lcom/huawei/openalliance/ad/beans/metadata/Content;I)Lcom/huawei/openalliance/ad/db/bean/ContentRecord;
    .locals 2

    invoke-static {p0, p1, p2}, Lcom/huawei/openalliance/ad/k/g;->b(Ljava/lang/String;Lcom/huawei/openalliance/ad/beans/metadata/Content;I)Lcom/huawei/openalliance/ad/db/bean/ContentRecord;

    move-result-object v1

    if-eqz v1, :cond_0

    const/4 v0, 0x1

    invoke-virtual {v1, v0}, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;->setSplashPreContentFlag_(I)V

    :cond_0
    return-object v1
.end method

.method public static a(Ljava/lang/String;Lcom/huawei/openalliance/ad/beans/metadata/Precontent;I)Lcom/huawei/openalliance/ad/db/bean/ContentRecord;
    .locals 3

    new-instance v1, Lcom/huawei/openalliance/ad/beans/metadata/Content;

    invoke-direct {v1, p1}, Lcom/huawei/openalliance/ad/beans/metadata/Content;-><init>(Lcom/huawei/openalliance/ad/beans/metadata/Precontent;)V

    invoke-static {p0, v1, p2}, Lcom/huawei/openalliance/ad/k/g;->b(Ljava/lang/String;Lcom/huawei/openalliance/ad/beans/metadata/Content;I)Lcom/huawei/openalliance/ad/db/bean/ContentRecord;

    move-result-object v2

    if-eqz v2, :cond_0

    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;->setSplashPreContentFlag_(I)V

    :cond_0
    return-object v2
.end method

.method public static a(Lcom/huawei/openalliance/ad/beans/metadata/Slogan;)Lcom/huawei/openalliance/ad/db/bean/SloganRecord;
    .locals 4

    new-instance v2, Lcom/huawei/openalliance/ad/db/bean/SloganRecord;

    invoke-direct {v2}, Lcom/huawei/openalliance/ad/db/bean/SloganRecord;-><init>()V

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/beans/metadata/Slogan;->getContentid__()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/openalliance/ad/db/bean/SloganRecord;->setContentId_(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/beans/metadata/Slogan;->getStarttime__()J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/openalliance/ad/db/bean/SloganRecord;->setStartTime_(J)V

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/beans/metadata/Slogan;->getEndtime__()J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/openalliance/ad/db/bean/SloganRecord;->setEndTime_(J)V

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/beans/metadata/Slogan;->getCreativetype__()I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/openalliance/ad/db/bean/SloganRecord;->setCreativeType_(I)V

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/beans/metadata/Slogan;->getUrl__()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/openalliance/ad/db/bean/SloganRecord;->setUrl_(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/beans/metadata/Slogan;->getWidth__()I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/openalliance/ad/db/bean/SloganRecord;->setWidth_(I)V

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/beans/metadata/Slogan;->getHeight__()I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/openalliance/ad/db/bean/SloganRecord;->setHeight_(I)V

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/beans/metadata/Slogan;->getSha256__()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/openalliance/ad/db/bean/SloganRecord;->setSha256_(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/beans/metadata/Slogan;->getParamfromserver__()Lcom/huawei/openalliance/ad/beans/metadata/ParamFromServer;

    move-result-object v3

    const/4 v0, 0x0

    if-eq v0, v3, :cond_0

    invoke-static {v3}, Lcom/huawei/openalliance/ad/utils/p;->b(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/openalliance/ad/db/bean/SloganRecord;->setParamFromServer_(Ljava/lang/String;)V

    :cond_0
    return-object v2
.end method

.method public static a(Ljava/util/Collection;Landroid/content/Context;)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Collection<Lcom/huawei/openalliance/ad/db/bean/EventRecord;>;Landroid/content/Context;)Ljava/util/List<Lcom/huawei/openalliance/ad/beans/metadata/AdEvent;>;"
        }
    .end annotation

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-static {p0}, Lcom/huawei/openalliance/ad/utils/q;->a(Ljava/util/Collection;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object v1

    :cond_0
    invoke-static {p1}, Lcom/huawei/openalliance/ad/utils/y;->b(Landroid/content/Context;)[B

    move-result-object v2

    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/openalliance/ad/db/bean/EventRecord;

    invoke-virtual {v4, v2}, Lcom/huawei/openalliance/ad/db/bean/EventRecord;->setKey([B)V

    invoke-static {v4, p1}, Lcom/huawei/openalliance/ad/k/g;->a(Lcom/huawei/openalliance/ad/db/bean/EventRecord;Landroid/content/Context;)Lcom/huawei/openalliance/ad/beans/metadata/AdEvent;

    move-result-object v5

    const/4 v0, 0x0

    if-ne v0, v5, :cond_1

    goto :goto_0

    :cond_1
    invoke-interface {v1, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    return-object v1
.end method

.method private static b(Ljava/lang/String;Lcom/huawei/openalliance/ad/beans/metadata/Content;I)Lcom/huawei/openalliance/ad/db/bean/ContentRecord;
    .locals 7

    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    invoke-static {p0}, Lcom/huawei/openalliance/ad/utils/ad;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x0

    return-object v0

    :cond_1
    new-instance v2, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;

    invoke-direct {v2}, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;-><init>()V

    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;->setDisplayCount_(I)V

    const-string v0, "yyyy-MM-dd"

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/m;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;->setDisplayDate_(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/beans/metadata/Content;->getInteractiontype__()I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;->setInteractiontype_(I)V

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/beans/metadata/Content;->getCreativetype__()I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;->setCreativeType_(I)V

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/beans/metadata/Content;->getContentid__()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;->setContentId_(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/beans/metadata/Content;->getTaskid__()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;->setTaskId_(Ljava/lang/String;)V

    invoke-virtual {v2, p0}, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;->setSlotId_(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/beans/metadata/Content;->getEndtime__()J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;->setEndTime_(J)V

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/beans/metadata/Content;->getStarttime__()J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;->setStartTime_(J)V

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/beans/metadata/Content;->getShowAppLogoFlag__()I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;->setShowAppLogoFlag_(I)V

    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;->setPriority_(I)V

    invoke-static {}, Lcom/huawei/openalliance/ad/utils/m;->f()J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;->setUpdateTime_(J)V

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/beans/metadata/Content;->getKeyWords()Ljava/util/List;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;->setKeyWords(Ljava/util/List;)V

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/beans/metadata/Content;->getNoReportEventList()Ljava/util/List;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;->setNoReportEventList(Ljava/util/List;)V

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/beans/metadata/Content;->getParamfromserver__()Lcom/huawei/openalliance/ad/beans/metadata/ParamFromServer;

    move-result-object v3

    const/4 v0, 0x0

    if-eq v0, v3, :cond_2

    invoke-static {v3}, Lcom/huawei/openalliance/ad/utils/p;->b(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;->setParamFromServer_(Ljava/lang/String;)V

    :cond_2
    invoke-virtual {v2, p2}, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;->setAdType_(I)V

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/beans/metadata/Content;->getSkipText__()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;->setSkipText_(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/beans/metadata/Content;->getSkipTextPos()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;->setSkipTextPos(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/beans/metadata/Content;->getMetaData()Lcom/huawei/openalliance/ad/beans/metadata/MetaData;

    move-result-object v4

    const/4 v0, 0x0

    if-eq v0, v4, :cond_3

    invoke-static {v4}, Lcom/huawei/openalliance/ad/utils/p;->b(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;->setMetaData_(Ljava/lang/String;)V

    invoke-virtual {v4}, Lcom/huawei/openalliance/ad/beans/metadata/MetaData;->getIntent__()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;->setIntentUri_(Ljava/lang/String;)V

    invoke-virtual {v4}, Lcom/huawei/openalliance/ad/beans/metadata/MetaData;->getClickUrl__()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;->setDetailUrl_(Ljava/lang/String;)V

    invoke-virtual {v4}, Lcom/huawei/openalliance/ad/beans/metadata/MetaData;->getTextStateList()Ljava/util/List;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;->setTextStateList(Ljava/util/List;)V

    invoke-virtual {v4}, Lcom/huawei/openalliance/ad/beans/metadata/MetaData;->getImageInfo__()Ljava/util/List;

    move-result-object v5

    if-eqz v5, :cond_3

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_3

    const/4 v0, 0x0

    invoke-interface {v5, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/openalliance/ad/beans/metadata/ImageInfo;

    invoke-virtual {v6}, Lcom/huawei/openalliance/ad/beans/metadata/ImageInfo;->getUrl()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;->setSplashMediaPath(Ljava/lang/String;)V

    invoke-virtual {v6}, Lcom/huawei/openalliance/ad/beans/metadata/ImageInfo;->getWidth()I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;->setWidth_(I)V

    invoke-virtual {v6}, Lcom/huawei/openalliance/ad/beans/metadata/ImageInfo;->getHeight()I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;->setHeight_(I)V

    :cond_3
    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/beans/metadata/Content;->getMonitor()Ljava/util/List;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;->setMonitors(Ljava/util/List;)V

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/beans/metadata/Content;->getLogo2Text()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/ad;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;->setLogo2Text(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/beans/metadata/Content;->getLogo2Pos()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;->setLogo2Pos(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/beans/metadata/Content;->getLandingTitle()I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;->setLandingTitleFlag(I)V

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/beans/metadata/Content;->getClickActionList()Ljava/util/List;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;->setClickActionList(Ljava/util/List;)V

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/beans/metadata/Content;->getWebConfig()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;->setWebConfig(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/beans/metadata/Content;->getCtrlSwitchs()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;->setCtrlSwitchs(Ljava/lang/String;)V

    return-object v2
.end method
