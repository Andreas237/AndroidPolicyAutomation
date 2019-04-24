.class public Lcom/huawei/openalliance/ad/inter/data/NativeAd;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/huawei/openalliance/ad/inter/data/INativeAd;


# static fields
.field private static final VALID_TIMEOUT_MILLIS:I = 0x64

.field private static final serialVersionUID:J = 0x1d015dcL


# instance fields
.field private adCloseKeyWords:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field private adSign:Ljava/lang/String;

.field private appInfo:Lcom/huawei/openalliance/ad/inter/data/AppInfo;

.field private appPromotionChannel:Ljava/lang/String;

.field private clickActionList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation
.end field

.field private clicked:Z

.field private contentId:Ljava/lang/String;

.field private creativeType:I

.field private cta:Ljava/lang/String;

.field private ctrlSwitchs:Ljava/lang/String;

.field private description:Ljava/lang/String;

.field private encodedParamFromServer:Ljava/lang/String;

.field private encodedeMonitors:Ljava/lang/String;

.field private endTime:J

.field private hasReportShowEventDuringShowTime:Z

.field private icon:Lcom/huawei/openalliance/ad/inter/data/ImageInfo;

.field private imageInfos:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/openalliance/ad/inter/data/ImageInfo;>;"
        }
    .end annotation
.end field

.field private intent:Ljava/lang/String;

.field private interactiontype:I

.field private label:Ljava/lang/String;

.field private landWebUrl:Ljava/lang/String;

.field private marketAppId:Ljava/lang/String;

.field private metaData:Ljava/lang/String;

.field private minEffectiveShowRatio:I

.field private minEffectiveShowTime:J

.field private noReportEventList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field private showLandingPageTitleFlag:I

.field private shown:Z

.field private slotId:Ljava/lang/String;

.field private startTime:J

.field private title:Ljava/lang/String;

.field private videoInfo:Lcom/huawei/openalliance/ad/inter/data/VideoInfo;

.field private webConfig:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/inter/data/NativeAd;->clicked:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/inter/data/NativeAd;->shown:Z

    const-string v0, "2"

    iput-object v0, p0, Lcom/huawei/openalliance/ad/inter/data/NativeAd;->adSign:Ljava/lang/String;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/inter/data/NativeAd;->hasReportShowEventDuringShowTime:Z

    return-void
.end method

.method static synthetic access$000(Lcom/huawei/openalliance/ad/inter/data/NativeAd;)Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/inter/data/NativeAd;->imageInfos:Ljava/util/List;

    return-object v0
.end method

.method static synthetic access$100(Lcom/huawei/openalliance/ad/inter/data/NativeAd;)Lcom/huawei/openalliance/ad/inter/data/VideoInfo;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/inter/data/NativeAd;->videoInfo:Lcom/huawei/openalliance/ad/inter/data/VideoInfo;

    return-object v0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 2

    if-nez p1, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    if-ne p0, p1, :cond_1

    const/4 v0, 0x1

    return v0

    :cond_1
    instance-of v0, p1, Lcom/huawei/openalliance/ad/inter/data/NativeAd;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/inter/data/NativeAd;->contentId:Ljava/lang/String;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/inter/data/NativeAd;->contentId:Ljava/lang/String;

    move-object v1, p1

    check-cast v1, Lcom/huawei/openalliance/ad/inter/data/NativeAd;

    iget-object v1, v1, Lcom/huawei/openalliance/ad/inter/data/NativeAd;->contentId:Ljava/lang/String;

    invoke-static {v0, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    return v0

    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method public getAdCloseKeyWords()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/huawei/openalliance/ad/inter/data/NativeAd;->adCloseKeyWords:Ljava/util/List;

    return-object v0
.end method

.method public getAdSign()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/inter/data/NativeAd;->adSign:Ljava/lang/String;

    return-object v0
.end method

.method public getAppInfo()Lcom/huawei/openalliance/ad/inter/data/AppInfo;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/inter/data/NativeAd;->appInfo:Lcom/huawei/openalliance/ad/inter/data/AppInfo;

    return-object v0
.end method

.method public getAppPromotionChannel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/inter/data/NativeAd;->appPromotionChannel:Ljava/lang/String;

    return-object v0
.end method

.method public getClickActionList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/huawei/openalliance/ad/inter/data/NativeAd;->clickActionList:Ljava/util/List;

    return-object v0
.end method

.method public getContentId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/inter/data/NativeAd;->contentId:Ljava/lang/String;

    return-object v0
.end method

.method public getCreativeType()I
    .locals 1

    iget v0, p0, Lcom/huawei/openalliance/ad/inter/data/NativeAd;->creativeType:I

    return v0
.end method

.method public getCta()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/inter/data/NativeAd;->cta:Ljava/lang/String;

    return-object v0
.end method

.method public getCtrlSwitchs()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/inter/data/NativeAd;->ctrlSwitchs:Ljava/lang/String;

    return-object v0
.end method

.method public getDescription()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/inter/data/NativeAd;->description:Ljava/lang/String;

    return-object v0
.end method

.method public getEncodedParamFromServer()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/inter/data/NativeAd;->encodedParamFromServer:Ljava/lang/String;

    return-object v0
.end method

.method public getEncodedeMonitors()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/inter/data/NativeAd;->encodedeMonitors:Ljava/lang/String;

    return-object v0
.end method

.method public getEndTime()J
    .locals 2

    iget-wide v0, p0, Lcom/huawei/openalliance/ad/inter/data/NativeAd;->endTime:J

    return-wide v0
.end method

.method public getIcon()Lcom/huawei/openalliance/ad/inter/data/ImageInfo;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/inter/data/NativeAd;->icon:Lcom/huawei/openalliance/ad/inter/data/ImageInfo;

    return-object v0
.end method

.method public getImageInfos()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/openalliance/ad/inter/data/ImageInfo;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/huawei/openalliance/ad/inter/data/NativeAd;->imageInfos:Ljava/util/List;

    return-object v0
.end method

.method public getIntent()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/inter/data/NativeAd;->intent:Ljava/lang/String;

    return-object v0
.end method

.method public getInterActionType()I
    .locals 1

    iget v0, p0, Lcom/huawei/openalliance/ad/inter/data/NativeAd;->interactiontype:I

    return v0
.end method

.method public getLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/inter/data/NativeAd;->label:Ljava/lang/String;

    return-object v0
.end method

.method public getLandWebUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/inter/data/NativeAd;->landWebUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getMarketAppId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/inter/data/NativeAd;->marketAppId:Ljava/lang/String;

    return-object v0
.end method

.method public getMetaData()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/inter/data/NativeAd;->metaData:Ljava/lang/String;

    return-object v0
.end method

.method public getMinEffectiveShowRatio()I
    .locals 1

    iget v0, p0, Lcom/huawei/openalliance/ad/inter/data/NativeAd;->minEffectiveShowRatio:I

    return v0
.end method

.method public getMinEffectiveShowTime()J
    .locals 2

    iget-wide v0, p0, Lcom/huawei/openalliance/ad/inter/data/NativeAd;->minEffectiveShowTime:J

    return-wide v0
.end method

.method public getNoReportEventList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/huawei/openalliance/ad/inter/data/NativeAd;->noReportEventList:Ljava/util/List;

    return-object v0
.end method

.method public getShowLandingPageTitleFlag()I
    .locals 1

    iget v0, p0, Lcom/huawei/openalliance/ad/inter/data/NativeAd;->showLandingPageTitleFlag:I

    return v0
.end method

.method public getSlotId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/inter/data/NativeAd;->slotId:Ljava/lang/String;

    return-object v0
.end method

.method public getStartTime()J
    .locals 2

    iget-wide v0, p0, Lcom/huawei/openalliance/ad/inter/data/NativeAd;->startTime:J

    return-wide v0
.end method

.method public getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/inter/data/NativeAd;->title:Ljava/lang/String;

    return-object v0
.end method

.method public getVideoInfo()Lcom/huawei/openalliance/ad/inter/data/VideoInfo;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/inter/data/NativeAd;->videoInfo:Lcom/huawei/openalliance/ad/inter/data/VideoInfo;

    return-object v0
.end method

.method public getWebConfig()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/inter/data/NativeAd;->webConfig:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/inter/data/NativeAd;->contentId:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/inter/data/NativeAd;->contentId:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, -0x1

    :goto_0
    invoke-super {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    and-int/2addr v0, v1

    return v0
.end method

.method public isClicked()Z
    .locals 1

    iget-boolean v0, p0, Lcom/huawei/openalliance/ad/inter/data/NativeAd;->clicked:Z

    return v0
.end method

.method public isExpired()Z
    .locals 4

    iget-wide v0, p0, Lcom/huawei/openalliance/ad/inter/data/NativeAd;->endTime:J

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-gez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public isHasReportShowEventDuringShowTime()Z
    .locals 1

    iget-boolean v0, p0, Lcom/huawei/openalliance/ad/inter/data/NativeAd;->hasReportShowEventDuringShowTime:Z

    return v0
.end method

.method public isShown()Z
    .locals 1

    iget-boolean v0, p0, Lcom/huawei/openalliance/ad/inter/data/NativeAd;->shown:Z

    return v0
.end method

.method public isValid()Z
    .locals 5

    iget-object v0, p0, Lcom/huawei/openalliance/ad/inter/data/NativeAd;->videoInfo:Lcom/huawei/openalliance/ad/inter/data/VideoInfo;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    new-instance v0, Lcom/huawei/openalliance/ad/inter/data/NativeAd$1;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/inter/data/NativeAd$1;-><init>(Lcom/huawei/openalliance/ad/inter/data/NativeAd;)V

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const-wide/16 v2, 0x64

    invoke-static {v0, v2, v3, v1}, Lcom/huawei/openalliance/ad/utils/af;->a(Ljava/util/concurrent/Callable;JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    return v4

    :cond_0
    const/4 v0, 0x1

    return v0
.end method

.method public isVideoAd()Z
    .locals 2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/inter/data/NativeAd;->videoInfo:Lcom/huawei/openalliance/ad/inter/data/VideoInfo;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public setAdCloseKeyWords(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/String;>;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/huawei/openalliance/ad/inter/data/NativeAd;->adCloseKeyWords:Ljava/util/List;

    return-void
.end method

.method public setAdSign(Ljava/lang/String;)V
    .locals 1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iput-object p1, p0, Lcom/huawei/openalliance/ad/inter/data/NativeAd;->adSign:Ljava/lang/String;

    return-void
.end method

.method public setAppInfo(Lcom/huawei/openalliance/ad/inter/data/AppInfo;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/inter/data/NativeAd;->appInfo:Lcom/huawei/openalliance/ad/inter/data/AppInfo;

    return-void
.end method

.method public setAppPromotionChannel(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/inter/data/NativeAd;->appPromotionChannel:Ljava/lang/String;

    return-void
.end method

.method public setClickActionList(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/Integer;>;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/huawei/openalliance/ad/inter/data/NativeAd;->clickActionList:Ljava/util/List;

    return-void
.end method

.method public setClicked(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/huawei/openalliance/ad/inter/data/NativeAd;->clicked:Z

    return-void
.end method

.method public setContentId(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/inter/data/NativeAd;->contentId:Ljava/lang/String;

    return-void
.end method

.method public setCreativeType(I)V
    .locals 0

    iput p1, p0, Lcom/huawei/openalliance/ad/inter/data/NativeAd;->creativeType:I

    return-void
.end method

.method public setCta(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/inter/data/NativeAd;->cta:Ljava/lang/String;

    return-void
.end method

.method public setCtrlSwitchs(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/inter/data/NativeAd;->ctrlSwitchs:Ljava/lang/String;

    return-void
.end method

.method public setDescription(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/inter/data/NativeAd;->description:Ljava/lang/String;

    return-void
.end method

.method public setEncodedParamFromServer(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/inter/data/NativeAd;->encodedParamFromServer:Ljava/lang/String;

    return-void
.end method

.method public setEncodedeMonitors(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/inter/data/NativeAd;->encodedeMonitors:Ljava/lang/String;

    return-void
.end method

.method public setEndTime(J)V
    .locals 0

    iput-wide p1, p0, Lcom/huawei/openalliance/ad/inter/data/NativeAd;->endTime:J

    return-void
.end method

.method public setHasReportShowEventDuringShowTime(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/huawei/openalliance/ad/inter/data/NativeAd;->hasReportShowEventDuringShowTime:Z

    return-void
.end method

.method public setIcon(Lcom/huawei/openalliance/ad/inter/data/ImageInfo;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/inter/data/NativeAd;->icon:Lcom/huawei/openalliance/ad/inter/data/ImageInfo;

    return-void
.end method

.method public setImageInfos(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/openalliance/ad/inter/data/ImageInfo;>;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/huawei/openalliance/ad/inter/data/NativeAd;->imageInfos:Ljava/util/List;

    return-void
.end method

.method public setIntent(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/inter/data/NativeAd;->intent:Ljava/lang/String;

    return-void
.end method

.method public setInteractiontype(I)V
    .locals 0

    iput p1, p0, Lcom/huawei/openalliance/ad/inter/data/NativeAd;->interactiontype:I

    return-void
.end method

.method public setLabel(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/inter/data/NativeAd;->label:Ljava/lang/String;

    return-void
.end method

.method public setLandWebUrl(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/inter/data/NativeAd;->landWebUrl:Ljava/lang/String;

    return-void
.end method

.method public setMarketAppId(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/inter/data/NativeAd;->marketAppId:Ljava/lang/String;

    return-void
.end method

.method public setMetaData(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/inter/data/NativeAd;->metaData:Ljava/lang/String;

    return-void
.end method

.method public setMinEffectiveShowRatio(I)V
    .locals 0

    iput p1, p0, Lcom/huawei/openalliance/ad/inter/data/NativeAd;->minEffectiveShowRatio:I

    return-void
.end method

.method public setMinEffectiveShowTime(J)V
    .locals 0

    iput-wide p1, p0, Lcom/huawei/openalliance/ad/inter/data/NativeAd;->minEffectiveShowTime:J

    return-void
.end method

.method public setNoReportEventList(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/String;>;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/huawei/openalliance/ad/inter/data/NativeAd;->noReportEventList:Ljava/util/List;

    return-void
.end method

.method public setShowLandingPageTitleFlag(I)V
    .locals 0

    iput p1, p0, Lcom/huawei/openalliance/ad/inter/data/NativeAd;->showLandingPageTitleFlag:I

    return-void
.end method

.method public setShown(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/huawei/openalliance/ad/inter/data/NativeAd;->shown:Z

    return-void
.end method

.method public setSlotId(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/inter/data/NativeAd;->slotId:Ljava/lang/String;

    return-void
.end method

.method public setStartTime(J)V
    .locals 0

    iput-wide p1, p0, Lcom/huawei/openalliance/ad/inter/data/NativeAd;->startTime:J

    return-void
.end method

.method public setTitle(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/inter/data/NativeAd;->title:Ljava/lang/String;

    return-void
.end method

.method public setVideoInfo(Lcom/huawei/openalliance/ad/inter/data/VideoInfo;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/inter/data/NativeAd;->videoInfo:Lcom/huawei/openalliance/ad/inter/data/VideoInfo;

    return-void
.end method

.method public setWebConfig(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/inter/data/NativeAd;->webConfig:Ljava/lang/String;

    return-void
.end method
