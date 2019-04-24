.class final Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload$Builder;
.super Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;
.source "AutoValue_ContentTrackingPayload.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "Builder"
.end annotation


# instance fields
.field private amount:Ljava/lang/Float;

.field private appNames:Ljava/lang/String;

.field private attemptAt:Ljava/lang/Long;

.field private attempts:Ljava/lang/Short;

.field private bonusId:Ljava/lang/Integer;

.field private categoryId:Ljava/lang/Integer;

.field private categoryType:Ljava/lang/String;

.field private clickId:Ljava/lang/Integer;

.field private clickType:Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;

.field private clicked:Ljava/lang/Boolean;

.field private contentType:Lcom/ibotta/android/tracking/content/ContentTrackingPayload$TrackingContent;

.field private contextDetail:Ljava/lang/String;

.field private counter:Ljava/lang/Integer;

.field private dealId:Ljava/lang/String;

.field private duration:Ljava/lang/Float;

.field private engaged:Ljava/lang/Integer;

.field private engagementId:Ljava/lang/Long;

.field private entryScreen:Ljava/lang/String;

.field private eventContext:Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;

.field private exitScreen:Ljava/lang/String;

.field private listIndex:Ljava/lang/Integer;

.field private messageData:Ljava/lang/String;

.field private moduleId:Ljava/lang/Integer;

.field private moduleIndex:Ljava/lang/Integer;

.field private moduleName:Ljava/lang/String;

.field private noTracking:Ljava/lang/Boolean;

.field private notificationId:Ljava/lang/Integer;

.field private notificationText:Ljava/lang/String;

.field private notificationType:Ljava/lang/String;

.field private offerCategoryId:Ljava/lang/Integer;

.field private offerId:Ljava/lang/Integer;

.field private offerRewardId:Ljava/lang/Integer;

.field private offerSegmentId:Ljava/lang/Integer;

.field private productId:Ljava/lang/String;

.field private promoId:Ljava/lang/Integer;

.field private questName:Ljava/lang/String;

.field private questState:Ljava/lang/String;

.field private questStep:Ljava/lang/Integer;

.field private referralCode:Ljava/lang/String;

.field private referrer:Ljava/lang/String;

.field private retailerCategoryId:Ljava/lang/Integer;

.field private retailerId:Ljava/lang/Integer;

.field private searchType:Ljava/lang/String;

.field private status:Ljava/lang/String;

.field private term:Ljava/lang/String;

.field private test:Ljava/lang/String;

.field private thirdPartyId:Ljava/lang/String;

.field private tileId:Ljava/lang/Integer;

.field private upc:Ljava/lang/String;

.field private variant:Ljava/lang/String;


# direct methods
.method constructor <init>()V
    .locals 0

    .line 743
    invoke-direct {p0}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;-><init>()V

    return-void
.end method

.method private constructor <init>(Lcom/ibotta/android/tracking/content/ContentTrackingPayload;)V
    .locals 1

    .line 745
    invoke-direct {p0}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;-><init>()V

    .line 746
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->isNoTracking()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload$Builder;->noTracking:Ljava/lang/Boolean;

    .line 747
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getContentType()Lcom/ibotta/android/tracking/content/ContentTrackingPayload$TrackingContent;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload$Builder;->contentType:Lcom/ibotta/android/tracking/content/ContentTrackingPayload$TrackingContent;

    .line 748
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getEventContext()Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload$Builder;->eventContext:Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;

    .line 749
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getRetailerId()Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload$Builder;->retailerId:Ljava/lang/Integer;

    .line 750
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getOfferId()Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload$Builder;->offerId:Ljava/lang/Integer;

    .line 751
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getOfferCategoryId()Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload$Builder;->offerCategoryId:Ljava/lang/Integer;

    .line 752
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getOfferRewardId()Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload$Builder;->offerRewardId:Ljava/lang/Integer;

    .line 753
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getBonusId()Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload$Builder;->bonusId:Ljava/lang/Integer;

    .line 754
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getRetailerCategoryId()Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload$Builder;->retailerCategoryId:Ljava/lang/Integer;

    .line 755
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getPromoId()Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload$Builder;->promoId:Ljava/lang/Integer;

    .line 756
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getTileId()Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload$Builder;->tileId:Ljava/lang/Integer;

    .line 757
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getProductId()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload$Builder;->productId:Ljava/lang/String;

    .line 758
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getDealId()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload$Builder;->dealId:Ljava/lang/String;

    .line 759
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getModuleId()Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload$Builder;->moduleId:Ljava/lang/Integer;

    .line 760
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getModuleName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload$Builder;->moduleName:Ljava/lang/String;

    .line 761
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getModuleIndex()Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload$Builder;->moduleIndex:Ljava/lang/Integer;

    .line 762
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getListIndex()Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload$Builder;->listIndex:Ljava/lang/Integer;

    .line 763
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getClicked()Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload$Builder;->clicked:Ljava/lang/Boolean;

    .line 764
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getClickId()Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload$Builder;->clickId:Ljava/lang/Integer;

    .line 765
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getClickType()Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload$Builder;->clickType:Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;

    .line 766
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getReferrer()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload$Builder;->referrer:Ljava/lang/String;

    .line 767
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getTerm()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload$Builder;->term:Ljava/lang/String;

    .line 768
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getUpc()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload$Builder;->upc:Ljava/lang/String;

    .line 769
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getTest()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload$Builder;->test:Ljava/lang/String;

    .line 770
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getVariant()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload$Builder;->variant:Ljava/lang/String;

    .line 771
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getThirdPartyId()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload$Builder;->thirdPartyId:Ljava/lang/String;

    .line 772
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getReferralCode()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload$Builder;->referralCode:Ljava/lang/String;

    .line 773
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getAppNames()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload$Builder;->appNames:Ljava/lang/String;

    .line 774
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getOfferSegmentId()Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload$Builder;->offerSegmentId:Ljava/lang/Integer;

    .line 775
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getCounter()Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload$Builder;->counter:Ljava/lang/Integer;

    .line 776
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getEngaged()Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload$Builder;->engaged:Ljava/lang/Integer;

    .line 777
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getDuration()Ljava/lang/Float;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload$Builder;->duration:Ljava/lang/Float;

    .line 778
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getAttempts()Ljava/lang/Short;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload$Builder;->attempts:Ljava/lang/Short;

    .line 779
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getAttemptAt()Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload$Builder;->attemptAt:Ljava/lang/Long;

    .line 780
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getQuestName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload$Builder;->questName:Ljava/lang/String;

    .line 781
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getQuestState()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload$Builder;->questState:Ljava/lang/String;

    .line 782
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getQuestStep()Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload$Builder;->questStep:Ljava/lang/Integer;

    .line 783
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getCategoryId()Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload$Builder;->categoryId:Ljava/lang/Integer;

    .line 784
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getCategoryType()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload$Builder;->categoryType:Ljava/lang/String;

    .line 785
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getSearchType()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload$Builder;->searchType:Ljava/lang/String;

    .line 786
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getEngagementId()Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload$Builder;->engagementId:Ljava/lang/Long;

    .line 787
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getNotificationText()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload$Builder;->notificationText:Ljava/lang/String;

    .line 788
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getNotificationType()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload$Builder;->notificationType:Ljava/lang/String;

    .line 789
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getEntryScreen()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload$Builder;->entryScreen:Ljava/lang/String;

    .line 790
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getExitScreen()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload$Builder;->exitScreen:Ljava/lang/String;

    .line 791
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getNotificationId()Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload$Builder;->notificationId:Ljava/lang/Integer;

    .line 792
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getAmount()Ljava/lang/Float;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload$Builder;->amount:Ljava/lang/Float;

    .line 793
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getStatus()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload$Builder;->status:Ljava/lang/String;

    .line 794
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getMessageData()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload$Builder;->messageData:Ljava/lang/String;

    .line 795
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getContextDetail()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload$Builder;->contextDetail:Ljava/lang/String;

    return-void
.end method

.method synthetic constructor <init>(Lcom/ibotta/android/tracking/content/ContentTrackingPayload;Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload$1;)V
    .locals 0

    .line 692
    invoke-direct {p0, p1}, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload$Builder;-><init>(Lcom/ibotta/android/tracking/content/ContentTrackingPayload;)V

    return-void
.end method


# virtual methods
.method public amount(Ljava/lang/Float;)Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;
    .locals 0
    .param p1    # Ljava/lang/Float;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 1032
    iput-object p1, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload$Builder;->amount:Ljava/lang/Float;

    return-object p0
.end method

.method public appNames(Ljava/lang/String;)Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 937
    iput-object p1, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload$Builder;->appNames:Ljava/lang/String;

    return-object p0
.end method

.method public attemptAt(Ljava/lang/Long;)Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;
    .locals 0
    .param p1    # Ljava/lang/Long;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 967
    iput-object p1, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload$Builder;->attemptAt:Ljava/lang/Long;

    return-object p0
.end method

.method public attempts(Ljava/lang/Short;)Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;
    .locals 0
    .param p1    # Ljava/lang/Short;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 962
    iput-object p1, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload$Builder;->attempts:Ljava/lang/Short;

    return-object p0
.end method

.method public bonusId(Ljava/lang/Integer;)Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;
    .locals 0
    .param p1    # Ljava/lang/Integer;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 837
    iput-object p1, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload$Builder;->bonusId:Ljava/lang/Integer;

    return-object p0
.end method

.method public build()Lcom/ibotta/android/tracking/content/ContentTrackingPayload;
    .locals 55

    move-object/from16 v0, p0

    const-string v1, ""

    .line 1053
    iget-object v2, v0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload$Builder;->noTracking:Ljava/lang/Boolean;

    if-nez v2, :cond_0

    .line 1054
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " noTracking"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 1056
    :cond_0
    iget-object v2, v0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload$Builder;->eventContext:Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;

    if-nez v2, :cond_1

    .line 1057
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " eventContext"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 1059
    :cond_1
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_2

    .line 1062
    new-instance v1, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;

    move-object v3, v1

    iget-object v2, v0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload$Builder;->noTracking:Ljava/lang/Boolean;

    .line 1063
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    iget-object v5, v0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload$Builder;->contentType:Lcom/ibotta/android/tracking/content/ContentTrackingPayload$TrackingContent;

    iget-object v6, v0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload$Builder;->eventContext:Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;

    iget-object v7, v0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload$Builder;->retailerId:Ljava/lang/Integer;

    iget-object v8, v0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload$Builder;->offerId:Ljava/lang/Integer;

    iget-object v9, v0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload$Builder;->offerCategoryId:Ljava/lang/Integer;

    iget-object v10, v0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload$Builder;->offerRewardId:Ljava/lang/Integer;

    iget-object v11, v0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload$Builder;->bonusId:Ljava/lang/Integer;

    iget-object v12, v0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload$Builder;->retailerCategoryId:Ljava/lang/Integer;

    iget-object v13, v0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload$Builder;->promoId:Ljava/lang/Integer;

    iget-object v14, v0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload$Builder;->tileId:Ljava/lang/Integer;

    iget-object v15, v0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload$Builder;->productId:Ljava/lang/String;

    iget-object v2, v0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload$Builder;->dealId:Ljava/lang/String;

    move-object/from16 v16, v2

    iget-object v2, v0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload$Builder;->moduleId:Ljava/lang/Integer;

    move-object/from16 v17, v2

    iget-object v2, v0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload$Builder;->moduleName:Ljava/lang/String;

    move-object/from16 v18, v2

    iget-object v2, v0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload$Builder;->moduleIndex:Ljava/lang/Integer;

    move-object/from16 v19, v2

    iget-object v2, v0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload$Builder;->listIndex:Ljava/lang/Integer;

    move-object/from16 v20, v2

    iget-object v2, v0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload$Builder;->clicked:Ljava/lang/Boolean;

    move-object/from16 v21, v2

    iget-object v2, v0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload$Builder;->clickId:Ljava/lang/Integer;

    move-object/from16 v22, v2

    iget-object v2, v0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload$Builder;->clickType:Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;

    move-object/from16 v23, v2

    iget-object v2, v0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload$Builder;->referrer:Ljava/lang/String;

    move-object/from16 v24, v2

    iget-object v2, v0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload$Builder;->term:Ljava/lang/String;

    move-object/from16 v25, v2

    iget-object v2, v0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload$Builder;->upc:Ljava/lang/String;

    move-object/from16 v26, v2

    iget-object v2, v0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload$Builder;->test:Ljava/lang/String;

    move-object/from16 v27, v2

    iget-object v2, v0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload$Builder;->variant:Ljava/lang/String;

    move-object/from16 v28, v2

    iget-object v2, v0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload$Builder;->thirdPartyId:Ljava/lang/String;

    move-object/from16 v29, v2

    iget-object v2, v0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload$Builder;->referralCode:Ljava/lang/String;

    move-object/from16 v30, v2

    iget-object v2, v0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload$Builder;->appNames:Ljava/lang/String;

    move-object/from16 v31, v2

    iget-object v2, v0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload$Builder;->offerSegmentId:Ljava/lang/Integer;

    move-object/from16 v32, v2

    iget-object v2, v0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload$Builder;->counter:Ljava/lang/Integer;

    move-object/from16 v33, v2

    iget-object v2, v0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload$Builder;->engaged:Ljava/lang/Integer;

    move-object/from16 v34, v2

    iget-object v2, v0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload$Builder;->duration:Ljava/lang/Float;

    move-object/from16 v35, v2

    iget-object v2, v0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload$Builder;->attempts:Ljava/lang/Short;

    move-object/from16 v36, v2

    iget-object v2, v0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload$Builder;->attemptAt:Ljava/lang/Long;

    move-object/from16 v37, v2

    iget-object v2, v0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload$Builder;->questName:Ljava/lang/String;

    move-object/from16 v38, v2

    iget-object v2, v0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload$Builder;->questState:Ljava/lang/String;

    move-object/from16 v39, v2

    iget-object v2, v0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload$Builder;->questStep:Ljava/lang/Integer;

    move-object/from16 v40, v2

    iget-object v2, v0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload$Builder;->categoryId:Ljava/lang/Integer;

    move-object/from16 v41, v2

    iget-object v2, v0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload$Builder;->categoryType:Ljava/lang/String;

    move-object/from16 v42, v2

    iget-object v2, v0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload$Builder;->searchType:Ljava/lang/String;

    move-object/from16 v43, v2

    iget-object v2, v0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload$Builder;->engagementId:Ljava/lang/Long;

    move-object/from16 v44, v2

    iget-object v2, v0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload$Builder;->notificationText:Ljava/lang/String;

    move-object/from16 v45, v2

    iget-object v2, v0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload$Builder;->notificationType:Ljava/lang/String;

    move-object/from16 v46, v2

    iget-object v2, v0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload$Builder;->entryScreen:Ljava/lang/String;

    move-object/from16 v47, v2

    iget-object v2, v0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload$Builder;->exitScreen:Ljava/lang/String;

    move-object/from16 v48, v2

    iget-object v2, v0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload$Builder;->notificationId:Ljava/lang/Integer;

    move-object/from16 v49, v2

    iget-object v2, v0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload$Builder;->amount:Ljava/lang/Float;

    move-object/from16 v50, v2

    iget-object v2, v0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload$Builder;->status:Ljava/lang/String;

    move-object/from16 v51, v2

    iget-object v2, v0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload$Builder;->messageData:Ljava/lang/String;

    move-object/from16 v52, v2

    iget-object v2, v0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload$Builder;->contextDetail:Ljava/lang/String;

    move-object/from16 v53, v2

    const/16 v54, 0x0

    invoke-direct/range {v3 .. v54}, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload;-><init>(ZLcom/ibotta/android/tracking/content/ContentTrackingPayload$TrackingContent;Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Short;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload$1;)V

    return-object v1

    .line 1060
    :cond_2
    new-instance v2, Ljava/lang/IllegalStateException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Missing required properties:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2
.end method

.method public categoryId(Ljava/lang/Integer;)Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;
    .locals 0
    .param p1    # Ljava/lang/Integer;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 987
    iput-object p1, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload$Builder;->categoryId:Ljava/lang/Integer;

    return-object p0
.end method

.method public categoryType(Ljava/lang/String;)Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 992
    iput-object p1, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload$Builder;->categoryType:Ljava/lang/String;

    return-object p0
.end method

.method public clickId(Ljava/lang/Integer;)Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;
    .locals 0
    .param p1    # Ljava/lang/Integer;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 892
    iput-object p1, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload$Builder;->clickId:Ljava/lang/Integer;

    return-object p0
.end method

.method public clickType(Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;)Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;
    .locals 0
    .param p1    # Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 897
    iput-object p1, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload$Builder;->clickType:Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;

    return-object p0
.end method

.method public clicked(Ljava/lang/Boolean;)Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;
    .locals 0
    .param p1    # Ljava/lang/Boolean;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 887
    iput-object p1, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload$Builder;->clicked:Ljava/lang/Boolean;

    return-object p0
.end method

.method public contentType(Lcom/ibotta/android/tracking/content/ContentTrackingPayload$TrackingContent;)Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;
    .locals 0
    .param p1    # Lcom/ibotta/android/tracking/content/ContentTrackingPayload$TrackingContent;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 804
    iput-object p1, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload$Builder;->contentType:Lcom/ibotta/android/tracking/content/ContentTrackingPayload$TrackingContent;

    return-object p0
.end method

.method public contextDetail(Ljava/lang/String;)Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 1047
    iput-object p1, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload$Builder;->contextDetail:Ljava/lang/String;

    return-object p0
.end method

.method public counter(Ljava/lang/Integer;)Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;
    .locals 0
    .param p1    # Ljava/lang/Integer;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 947
    iput-object p1, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload$Builder;->counter:Ljava/lang/Integer;

    return-object p0
.end method

.method public dealId(Ljava/lang/String;)Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 862
    iput-object p1, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload$Builder;->dealId:Ljava/lang/String;

    return-object p0
.end method

.method public duration(Ljava/lang/Float;)Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;
    .locals 0
    .param p1    # Ljava/lang/Float;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 957
    iput-object p1, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload$Builder;->duration:Ljava/lang/Float;

    return-object p0
.end method

.method public engaged(Ljava/lang/Integer;)Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;
    .locals 0
    .param p1    # Ljava/lang/Integer;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 952
    iput-object p1, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload$Builder;->engaged:Ljava/lang/Integer;

    return-object p0
.end method

.method public engagementId(Ljava/lang/Long;)Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;
    .locals 0
    .param p1    # Ljava/lang/Long;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 1002
    iput-object p1, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload$Builder;->engagementId:Ljava/lang/Long;

    return-object p0
.end method

.method public entryScreen(Ljava/lang/String;)Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 1017
    iput-object p1, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload$Builder;->entryScreen:Ljava/lang/String;

    return-object p0
.end method

.method public eventContext(Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;)Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;
    .locals 1

    if-eqz p1, :cond_0

    .line 812
    iput-object p1, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload$Builder;->eventContext:Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;

    return-object p0

    .line 810
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null eventContext"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public exitScreen(Ljava/lang/String;)Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 1022
    iput-object p1, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload$Builder;->exitScreen:Ljava/lang/String;

    return-object p0
.end method

.method public listIndex(Ljava/lang/Integer;)Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;
    .locals 0
    .param p1    # Ljava/lang/Integer;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 882
    iput-object p1, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload$Builder;->listIndex:Ljava/lang/Integer;

    return-object p0
.end method

.method public messageData(Ljava/lang/String;)Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 1042
    iput-object p1, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload$Builder;->messageData:Ljava/lang/String;

    return-object p0
.end method

.method public moduleId(Ljava/lang/Integer;)Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;
    .locals 0
    .param p1    # Ljava/lang/Integer;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 867
    iput-object p1, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload$Builder;->moduleId:Ljava/lang/Integer;

    return-object p0
.end method

.method public moduleIndex(Ljava/lang/Integer;)Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;
    .locals 0
    .param p1    # Ljava/lang/Integer;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 877
    iput-object p1, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload$Builder;->moduleIndex:Ljava/lang/Integer;

    return-object p0
.end method

.method public moduleName(Ljava/lang/String;)Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 872
    iput-object p1, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload$Builder;->moduleName:Ljava/lang/String;

    return-object p0
.end method

.method protected noTracking(Z)Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;
    .locals 0

    .line 799
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload$Builder;->noTracking:Ljava/lang/Boolean;

    return-object p0
.end method

.method public notificationId(Ljava/lang/Integer;)Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;
    .locals 0
    .param p1    # Ljava/lang/Integer;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 1027
    iput-object p1, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload$Builder;->notificationId:Ljava/lang/Integer;

    return-object p0
.end method

.method public notificationText(Ljava/lang/String;)Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 1007
    iput-object p1, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload$Builder;->notificationText:Ljava/lang/String;

    return-object p0
.end method

.method public notificationType(Ljava/lang/String;)Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 1012
    iput-object p1, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload$Builder;->notificationType:Ljava/lang/String;

    return-object p0
.end method

.method public offerCategoryId(Ljava/lang/Integer;)Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;
    .locals 0
    .param p1    # Ljava/lang/Integer;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 827
    iput-object p1, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload$Builder;->offerCategoryId:Ljava/lang/Integer;

    return-object p0
.end method

.method public offerId(Ljava/lang/Integer;)Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;
    .locals 0
    .param p1    # Ljava/lang/Integer;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 822
    iput-object p1, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload$Builder;->offerId:Ljava/lang/Integer;

    return-object p0
.end method

.method public offerRewardId(Ljava/lang/Integer;)Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;
    .locals 0
    .param p1    # Ljava/lang/Integer;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 832
    iput-object p1, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload$Builder;->offerRewardId:Ljava/lang/Integer;

    return-object p0
.end method

.method public offerSegmentId(Ljava/lang/Integer;)Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;
    .locals 0
    .param p1    # Ljava/lang/Integer;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 942
    iput-object p1, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload$Builder;->offerSegmentId:Ljava/lang/Integer;

    return-object p0
.end method

.method public productId(Ljava/lang/String;)Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 857
    iput-object p1, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload$Builder;->productId:Ljava/lang/String;

    return-object p0
.end method

.method public promoId(Ljava/lang/Integer;)Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;
    .locals 0
    .param p1    # Ljava/lang/Integer;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 847
    iput-object p1, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload$Builder;->promoId:Ljava/lang/Integer;

    return-object p0
.end method

.method public questName(Ljava/lang/String;)Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 972
    iput-object p1, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload$Builder;->questName:Ljava/lang/String;

    return-object p0
.end method

.method public questState(Ljava/lang/String;)Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 977
    iput-object p1, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload$Builder;->questState:Ljava/lang/String;

    return-object p0
.end method

.method public questStep(Ljava/lang/Integer;)Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;
    .locals 0
    .param p1    # Ljava/lang/Integer;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 982
    iput-object p1, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload$Builder;->questStep:Ljava/lang/Integer;

    return-object p0
.end method

.method public referralCode(Ljava/lang/String;)Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 932
    iput-object p1, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload$Builder;->referralCode:Ljava/lang/String;

    return-object p0
.end method

.method public referrer(Ljava/lang/String;)Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 902
    iput-object p1, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload$Builder;->referrer:Ljava/lang/String;

    return-object p0
.end method

.method public retailerCategoryId(Ljava/lang/Integer;)Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;
    .locals 0
    .param p1    # Ljava/lang/Integer;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 842
    iput-object p1, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload$Builder;->retailerCategoryId:Ljava/lang/Integer;

    return-object p0
.end method

.method public retailerId(Ljava/lang/Integer;)Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;
    .locals 0
    .param p1    # Ljava/lang/Integer;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 817
    iput-object p1, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload$Builder;->retailerId:Ljava/lang/Integer;

    return-object p0
.end method

.method public searchType(Ljava/lang/String;)Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 997
    iput-object p1, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload$Builder;->searchType:Ljava/lang/String;

    return-object p0
.end method

.method public status(Ljava/lang/String;)Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 1037
    iput-object p1, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload$Builder;->status:Ljava/lang/String;

    return-object p0
.end method

.method public term(Ljava/lang/String;)Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 907
    iput-object p1, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload$Builder;->term:Ljava/lang/String;

    return-object p0
.end method

.method public test(Ljava/lang/String;)Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 917
    iput-object p1, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload$Builder;->test:Ljava/lang/String;

    return-object p0
.end method

.method public thirdPartyId(Ljava/lang/String;)Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 927
    iput-object p1, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload$Builder;->thirdPartyId:Ljava/lang/String;

    return-object p0
.end method

.method public tileId(Ljava/lang/Integer;)Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;
    .locals 0
    .param p1    # Ljava/lang/Integer;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 852
    iput-object p1, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload$Builder;->tileId:Ljava/lang/Integer;

    return-object p0
.end method

.method public upc(Ljava/lang/String;)Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 912
    iput-object p1, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload$Builder;->upc:Ljava/lang/String;

    return-object p0
.end method

.method public variant(Ljava/lang/String;)Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 922
    iput-object p1, p0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload$Builder;->variant:Ljava/lang/String;

    return-object p0
.end method
