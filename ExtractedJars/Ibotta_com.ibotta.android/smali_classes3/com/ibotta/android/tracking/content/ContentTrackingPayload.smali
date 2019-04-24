.class public abstract Lcom/ibotta/android/tracking/content/ContentTrackingPayload;
.super Ljava/lang/Object;
.source "ContentTrackingPayload.java"

# interfaces
.implements Lcom/ibotta/android/tracking/content/TrackingPayload;


# annotations
.annotation build Lcom/google/auto/value/AutoValue;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;,
        Lcom/ibotta/android/tracking/content/ContentTrackingPayload$TrackingContent;
    }
.end annotation


# static fields
.field public static NO_TRACKING:Lcom/ibotta/android/tracking/content/ContentTrackingPayload;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 24
    sget-object v0, Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;->NONE:Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;

    invoke-static {v0}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->builder(Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;)Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;->noTracking(Z)Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;->build()Lcom/ibotta/android/tracking/content/ContentTrackingPayload;

    move-result-object v0

    sput-object v0, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->NO_TRACKING:Lcom/ibotta/android/tracking/content/ContentTrackingPayload;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static builder(Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;)Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;
    .locals 1

    .line 82
    new-instance v0, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload$Builder;

    invoke-direct {v0}, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload$Builder;-><init>()V

    invoke-virtual {v0, p0}, Lcom/ibotta/android/tracking/content/AutoValue_ContentTrackingPayload$Builder;->eventContext(Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;)Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;

    move-result-object p0

    const/4 v0, 0x0

    .line 83
    invoke-virtual {p0, v0}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;->noTracking(Z)Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;

    move-result-object p0

    return-object p0
.end method

.method private getTrackingEventInstance()Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;
    .locals 3

    .line 143
    invoke-virtual {p0}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getContentType()Lcom/ibotta/android/tracking/content/ContentTrackingPayload$TrackingContent;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 149
    sget-object v1, Lcom/ibotta/android/tracking/content/ContentTrackingPayload$1;->$SwitchMap$com$ibotta$android$tracking$content$ContentTrackingPayload$TrackingContent:[I

    invoke-virtual {p0}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getContentType()Lcom/ibotta/android/tracking/content/ContentTrackingPayload$TrackingContent;

    move-result-object v2

    invoke-virtual {v2}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload$TrackingContent;->ordinal()I

    move-result v2

    aget v1, v1, v2

    packed-switch v1, :pswitch_data_0

    goto :goto_0

    .line 160
    :pswitch_0
    new-instance v0, Lcom/ibotta/android/tracking/proprietary/event/SearchEvent;

    invoke-direct {v0}, Lcom/ibotta/android/tracking/proprietary/event/SearchEvent;-><init>()V

    goto :goto_0

    .line 157
    :pswitch_1
    new-instance v0, Lcom/ibotta/android/tracking/proprietary/event/ProductEvent;

    invoke-direct {v0}, Lcom/ibotta/android/tracking/proprietary/event/ProductEvent;-><init>()V

    goto :goto_0

    .line 154
    :pswitch_2
    new-instance v0, Lcom/ibotta/android/tracking/proprietary/event/RetailerEvent;

    invoke-direct {v0}, Lcom/ibotta/android/tracking/proprietary/event/RetailerEvent;-><init>()V

    goto :goto_0

    .line 151
    :pswitch_3
    new-instance v0, Lcom/ibotta/android/tracking/proprietary/event/OfferEvent;

    invoke-direct {v0}, Lcom/ibotta/android/tracking/proprietary/event/OfferEvent;-><init>()V

    :goto_0
    return-object v0

    .line 144
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Tracking event payload has no content type: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public abstract getAmount()Ljava/lang/Float;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract getAppNames()Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract getAttemptAt()Ljava/lang/Long;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract getAttempts()Ljava/lang/Short;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract getBonusId()Ljava/lang/Integer;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract getCategoryId()Ljava/lang/Integer;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract getCategoryType()Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract getClickId()Ljava/lang/Integer;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract getClickType()Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract getClicked()Ljava/lang/Boolean;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract getContentType()Lcom/ibotta/android/tracking/content/ContentTrackingPayload$TrackingContent;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract getContextDetail()Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract getCounter()Ljava/lang/Integer;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract getDealId()Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract getDuration()Ljava/lang/Float;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract getEngaged()Ljava/lang/Integer;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract getEngagementId()Ljava/lang/Long;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract getEntryScreen()Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract getEventContext()Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;
.end method

.method public abstract getExitScreen()Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract getListIndex()Ljava/lang/Integer;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract getMessageData()Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract getModuleId()Ljava/lang/Integer;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract getModuleIndex()Ljava/lang/Integer;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract getModuleName()Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract getNotificationId()Ljava/lang/Integer;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract getNotificationText()Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract getNotificationType()Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract getOfferCategoryId()Ljava/lang/Integer;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract getOfferId()Ljava/lang/Integer;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract getOfferRewardId()Ljava/lang/Integer;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract getOfferSegmentId()Ljava/lang/Integer;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract getProductId()Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract getPromoId()Ljava/lang/Integer;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract getQuestName()Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract getQuestState()Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract getQuestStep()Ljava/lang/Integer;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract getReferralCode()Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract getReferrer()Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract getRetailerCategoryId()Ljava/lang/Integer;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract getRetailerId()Ljava/lang/Integer;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract getSearchType()Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract getStatus()Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract getTerm()Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract getTest()Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract getThirdPartyId()Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract getTileId()Ljava/lang/Integer;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract getUpc()Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract getVariant()Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract toBuilder()Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;
.end method

.method public toTrackingEvent()Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;
    .locals 3

    .line 87
    invoke-direct {p0}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getTrackingEventInstance()Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;

    move-result-object v0

    .line 89
    invoke-virtual {p0}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getEventContext()Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->setEventContext(Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;)V

    .line 90
    invoke-virtual {p0}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getRetailerId()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->setRetailerId(Ljava/lang/Integer;)V

    .line 91
    invoke-virtual {p0}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getOfferId()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->setOfferId(Ljava/lang/Integer;)V

    .line 92
    invoke-virtual {p0}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getOfferCategoryId()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->setOfferCategoryId(Ljava/lang/Integer;)V

    .line 93
    invoke-virtual {p0}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getOfferRewardId()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->setOfferRewardId(Ljava/lang/Integer;)V

    .line 94
    invoke-virtual {p0}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getBonusId()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->setBonusId(Ljava/lang/Integer;)V

    .line 95
    invoke-virtual {p0}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getRetailerCategoryId()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->setRetailerCategoryId(Ljava/lang/Integer;)V

    .line 96
    invoke-virtual {p0}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getPromoId()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->setPromoId(Ljava/lang/Integer;)V

    .line 97
    invoke-virtual {p0}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getTileId()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->setTileId(Ljava/lang/Integer;)V

    .line 98
    invoke-virtual {p0}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getProductId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->setProductId(Ljava/lang/String;)V

    .line 99
    invoke-virtual {p0}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getDealId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->setDealId(Ljava/lang/String;)V

    .line 100
    invoke-virtual {p0}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getModuleId()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->setModuleId(Ljava/lang/Integer;)V

    .line 101
    invoke-virtual {p0}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getModuleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->setModuleName(Ljava/lang/String;)V

    .line 102
    invoke-virtual {p0}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getModuleIndex()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->setModuleIndex(Ljava/lang/Integer;)V

    .line 103
    invoke-virtual {p0}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getListIndex()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->setListIndex(Ljava/lang/Integer;)V

    .line 104
    invoke-virtual {p0}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getClicked()Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->setClicked(Ljava/lang/Boolean;)V

    .line 105
    invoke-virtual {p0}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getClickId()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->setClickId(Ljava/lang/Integer;)V

    .line 106
    invoke-virtual {p0}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getClickType()Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->setClickType(Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;)V

    .line 107
    invoke-virtual {p0}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getReferrer()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->setReferrer(Ljava/lang/String;)V

    .line 108
    invoke-virtual {p0}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getTerm()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->setTerm(Ljava/lang/String;)V

    .line 109
    invoke-virtual {p0}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getUpc()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->setUpc(Ljava/lang/String;)V

    .line 110
    invoke-virtual {p0}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getTest()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->setTest(Ljava/lang/String;)V

    .line 111
    invoke-virtual {p0}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getVariant()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->setVariant(Ljava/lang/String;)V

    .line 112
    invoke-virtual {p0}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getThirdPartyId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->setThirdpartyId(Ljava/lang/String;)V

    .line 113
    invoke-virtual {p0}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getReferralCode()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->setReferralCode(Ljava/lang/String;)V

    .line 114
    invoke-virtual {p0}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getAppNames()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->setAppNames(Ljava/lang/String;)V

    .line 115
    invoke-virtual {p0}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getOfferSegmentId()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->setOfferSegmentId(Ljava/lang/Integer;)V

    .line 116
    invoke-virtual {p0}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getCounter()Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getCounter()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->setCounter(I)V

    .line 117
    invoke-virtual {p0}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getEngaged()Ljava/lang/Integer;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {p0}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getEngaged()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->setEngaged(I)V

    .line 118
    invoke-virtual {p0}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getDuration()Ljava/lang/Float;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->setDuration(Ljava/lang/Float;)V

    .line 119
    invoke-virtual {p0}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getAttempts()Ljava/lang/Short;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {p0}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getAttempts()Ljava/lang/Short;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Short;->shortValue()S

    move-result v1

    goto :goto_2

    :cond_2
    const/4 v1, 0x0

    :goto_2
    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->setAttempts(S)V

    .line 120
    invoke-virtual {p0}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getAttemptAt()Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->setAttemptAt(Ljava/lang/Long;)V

    .line 121
    invoke-virtual {p0}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getQuestName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->setQuestName(Ljava/lang/String;)V

    .line 122
    invoke-virtual {p0}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getQuestState()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->setQuestState(Ljava/lang/String;)V

    .line 123
    invoke-virtual {p0}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getQuestStep()Ljava/lang/Integer;

    move-result-object v1

    if-eqz v1, :cond_3

    invoke-virtual {p0}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getQuestStep()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    goto :goto_3

    :cond_3
    const/4 v1, 0x0

    :goto_3
    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->setQuestStep(I)V

    .line 124
    invoke-virtual {p0}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getCategoryId()Ljava/lang/Integer;

    move-result-object v1

    if-eqz v1, :cond_4

    invoke-virtual {p0}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getCategoryId()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v2

    :cond_4
    invoke-virtual {v0, v2}, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->setCategoryId(I)V

    .line 125
    invoke-virtual {p0}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getCategoryType()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->setCategoryType(Ljava/lang/String;)V

    .line 126
    invoke-virtual {p0}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getSearchType()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->setSearchType(Ljava/lang/String;)V

    .line 127
    invoke-virtual {p0}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getEngagementId()Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->setEngagementId(Ljava/lang/Long;)V

    .line 128
    invoke-virtual {p0}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getNotificationText()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->setNotificationText(Ljava/lang/String;)V

    .line 129
    invoke-virtual {p0}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getNotificationType()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->setNotificationType(Ljava/lang/String;)V

    .line 130
    invoke-virtual {p0}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getEntryScreen()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->setEntryScreen(Ljava/lang/String;)V

    .line 131
    invoke-virtual {p0}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getExitScreen()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->setExitScreen(Ljava/lang/String;)V

    .line 132
    invoke-virtual {p0}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getNotificationId()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->setNotificationId(Ljava/lang/Integer;)V

    .line 133
    invoke-virtual {p0}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getAmount()Ljava/lang/Float;

    move-result-object v1

    if-eqz v1, :cond_5

    invoke-virtual {p0}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getAmount()Ljava/lang/Float;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    goto :goto_4

    :cond_5
    const/4 v1, 0x0

    :goto_4
    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->setAmount(F)V

    .line 134
    invoke-virtual {p0}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getStatus()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->setStatus(Ljava/lang/String;)V

    .line 135
    invoke-virtual {p0}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getMessageData()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->setMessageData(Ljava/lang/String;)V

    .line 136
    invoke-virtual {p0}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->getContextDetail()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->setContextDetail(Ljava/lang/String;)V

    return-object v0
.end method
