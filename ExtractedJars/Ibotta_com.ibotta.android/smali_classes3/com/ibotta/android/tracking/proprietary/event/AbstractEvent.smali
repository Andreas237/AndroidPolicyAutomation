.class public abstract Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;
.super Ljava/lang/Object;
.source "AbstractEvent.java"


# instance fields
.field amount:F
    .annotation runtime Lcom/j256/ormlite/field/DatabaseField;
    .end annotation
.end field

.field appNames:Ljava/lang/String;
    .annotation runtime Lcom/j256/ormlite/field/DatabaseField;
    .end annotation
.end field

.field attemptAt:Ljava/lang/Long;
    .annotation runtime Lcom/j256/ormlite/field/DatabaseField;
    .end annotation
.end field

.field attempts:S
    .annotation runtime Lcom/j256/ormlite/field/DatabaseField;
    .end annotation
.end field

.field bonusId:Ljava/lang/Integer;
    .annotation runtime Lcom/j256/ormlite/field/DatabaseField;
    .end annotation
.end field

.field categoryId:I
    .annotation runtime Lcom/j256/ormlite/field/DatabaseField;
    .end annotation
.end field

.field categoryType:Ljava/lang/String;
    .annotation runtime Lcom/j256/ormlite/field/DatabaseField;
    .end annotation
.end field

.field clickId:Ljava/lang/Integer;
    .annotation runtime Lcom/j256/ormlite/field/DatabaseField;
    .end annotation
.end field

.field clickType:Ljava/lang/String;
    .annotation runtime Lcom/j256/ormlite/field/DatabaseField;
    .end annotation
.end field

.field clicked:Z
    .annotation runtime Lcom/j256/ormlite/field/DatabaseField;
        canBeNull = false
    .end annotation
.end field

.field contextDetail:Ljava/lang/String;
    .annotation runtime Lcom/j256/ormlite/field/DatabaseField;
    .end annotation
.end field

.field counter:I
    .annotation runtime Lcom/j256/ormlite/field/DatabaseField;
    .end annotation
.end field

.field dealId:Ljava/lang/String;
    .annotation runtime Lcom/j256/ormlite/field/DatabaseField;
    .end annotation
.end field

.field duration:Ljava/lang/Float;
    .annotation runtime Lcom/j256/ormlite/field/DatabaseField;
    .end annotation
.end field

.field engaged:I
    .annotation runtime Lcom/j256/ormlite/field/DatabaseField;
    .end annotation
.end field

.field engagementId:Ljava/lang/Long;
    .annotation runtime Lcom/j256/ormlite/field/DatabaseField;
    .end annotation
.end field

.field entryScreen:Ljava/lang/String;
    .annotation runtime Lcom/j256/ormlite/field/DatabaseField;
    .end annotation
.end field

.field eventAt:J
    .annotation runtime Lcom/j256/ormlite/field/DatabaseField;
        canBeNull = false
    .end annotation
.end field

.field eventContext:Ljava/lang/String;
    .annotation runtime Lcom/j256/ormlite/field/DatabaseField;
        canBeNull = false
    .end annotation
.end field

.field eventStatus:Ljava/lang/String;
    .annotation runtime Lcom/j256/ormlite/field/DatabaseField;
        canBeNull = false
    .end annotation
.end field

.field exitScreen:Ljava/lang/String;
    .annotation runtime Lcom/j256/ormlite/field/DatabaseField;
    .end annotation
.end field

.field hashCode:I
    .annotation runtime Lcom/j256/ormlite/field/DatabaseField;
        index = true
        unique = true
    .end annotation
.end field

.field id:I
    .annotation runtime Lcom/j256/ormlite/field/DatabaseField;
        generatedId = true
    .end annotation
.end field

.field listIndex:Ljava/lang/Integer;
    .annotation runtime Lcom/j256/ormlite/field/DatabaseField;
    .end annotation
.end field

.field locationPermissionStatus:Ljava/lang/String;
    .annotation runtime Lcom/j256/ormlite/field/DatabaseField;
    .end annotation
.end field

.field messageData:Ljava/lang/String;
    .annotation runtime Lcom/j256/ormlite/field/DatabaseField;
    .end annotation
.end field

.field moduleId:Ljava/lang/Integer;
    .annotation runtime Lcom/j256/ormlite/field/DatabaseField;
    .end annotation
.end field

.field moduleIndex:Ljava/lang/Integer;
    .annotation runtime Lcom/j256/ormlite/field/DatabaseField;
    .end annotation
.end field

.field moduleName:Ljava/lang/String;
    .annotation runtime Lcom/j256/ormlite/field/DatabaseField;
    .end annotation
.end field

.field notificationId:Ljava/lang/Integer;
    .annotation runtime Lcom/j256/ormlite/field/DatabaseField;
    .end annotation
.end field

.field notificationText:Ljava/lang/String;
    .annotation runtime Lcom/j256/ormlite/field/DatabaseField;
    .end annotation
.end field

.field notificationType:Ljava/lang/String;
    .annotation runtime Lcom/j256/ormlite/field/DatabaseField;
    .end annotation
.end field

.field offerCategoryId:Ljava/lang/Integer;
    .annotation runtime Lcom/j256/ormlite/field/DatabaseField;
    .end annotation
.end field

.field offerId:Ljava/lang/Integer;
    .annotation runtime Lcom/j256/ormlite/field/DatabaseField;
    .end annotation
.end field

.field offerRewardId:Ljava/lang/Integer;
    .annotation runtime Lcom/j256/ormlite/field/DatabaseField;
    .end annotation
.end field

.field offerSegmentId:Ljava/lang/Integer;
    .annotation runtime Lcom/j256/ormlite/field/DatabaseField;
    .end annotation
.end field

.field productId:Ljava/lang/String;
    .annotation runtime Lcom/j256/ormlite/field/DatabaseField;
    .end annotation
.end field

.field promoId:Ljava/lang/Integer;
    .annotation runtime Lcom/j256/ormlite/field/DatabaseField;
    .end annotation
.end field

.field pushPermissionStatus:Ljava/lang/String;
    .annotation runtime Lcom/j256/ormlite/field/DatabaseField;
    .end annotation
.end field

.field questName:Ljava/lang/String;
    .annotation runtime Lcom/j256/ormlite/field/DatabaseField;
    .end annotation
.end field

.field questState:Ljava/lang/String;
    .annotation runtime Lcom/j256/ormlite/field/DatabaseField;
    .end annotation
.end field

.field questStep:I
    .annotation runtime Lcom/j256/ormlite/field/DatabaseField;
    .end annotation
.end field

.field referralCode:Ljava/lang/String;
    .annotation runtime Lcom/j256/ormlite/field/DatabaseField;
    .end annotation
.end field

.field referrer:Ljava/lang/String;
    .annotation runtime Lcom/j256/ormlite/field/DatabaseField;
    .end annotation
.end field

.field retailerCategoryId:Ljava/lang/Integer;
    .annotation runtime Lcom/j256/ormlite/field/DatabaseField;
    .end annotation
.end field

.field retailerId:Ljava/lang/Integer;
    .annotation runtime Lcom/j256/ormlite/field/DatabaseField;
    .end annotation
.end field

.field searchType:Ljava/lang/String;
    .annotation runtime Lcom/j256/ormlite/field/DatabaseField;
    .end annotation
.end field

.field status:Ljava/lang/String;
    .annotation runtime Lcom/j256/ormlite/field/DatabaseField;
    .end annotation
.end field

.field term:Ljava/lang/String;
    .annotation runtime Lcom/j256/ormlite/field/DatabaseField;
    .end annotation
.end field

.field test:Ljava/lang/String;
    .annotation runtime Lcom/j256/ormlite/field/DatabaseField;
    .end annotation
.end field

.field thirdpartyId:Ljava/lang/String;
    .annotation runtime Lcom/j256/ormlite/field/DatabaseField;
    .end annotation
.end field

.field tileId:Ljava/lang/Integer;
    .annotation runtime Lcom/j256/ormlite/field/DatabaseField;
    .end annotation
.end field

.field upc:Ljava/lang/String;
    .annotation runtime Lcom/j256/ormlite/field/DatabaseField;
    .end annotation
.end field

.field variant:Ljava/lang/String;
    .annotation runtime Lcom/j256/ormlite/field/DatabaseField;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 48
    iput-boolean v0, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->clicked:Z

    .line 60
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->eventAt:J

    .line 64
    sget-object v0, Lcom/ibotta/android/tracking/proprietary/event/enums/EventStatus;->NEW:Lcom/ibotta/android/tracking/proprietary/event/enums/EventStatus;

    invoke-virtual {v0}, Lcom/ibotta/android/tracking/proprietary/event/enums/EventStatus;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->eventStatus:Ljava/lang/String;

    return-void
.end method

.method private getAppNamesMaps()Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation

    .line 859
    iget-object v0, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->appNames:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 860
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    return-object v0

    .line 863
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 865
    sget-object v1, Lcom/ibotta/android/json/IbottaJsonFactory;->INSTANCE:Lcom/ibotta/android/json/IbottaJsonFactory;

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Lcom/ibotta/android/json/IbottaJsonFactory;->getInstance(ZZ)Lcom/ibotta/android/json/IbottaJson;

    move-result-object v1

    .line 868
    :try_start_0
    iget-object v2, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->appNames:Ljava/lang/String;

    const-class v4, Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppTrackingData;

    invoke-interface {v1, v2, v4}, Lcom/ibotta/android/json/IbottaJson;->fromJsonToArrayList(Ljava/lang/String;Ljava/lang/Class;)Ljava/util/ArrayList;

    move-result-object v1

    .line 870
    invoke-static {v1}, Ljava9/util/stream/StreamSupport;->stream(Ljava/util/Collection;)Ljava9/util/stream/Stream;

    move-result-object v1

    new-instance v2, Lcom/ibotta/android/tracking/proprietary/event/-$$Lambda$AbstractEvent$IMQrzF263KjLT7rzQdhiqU-20Pw;

    invoke-direct {v2, v0}, Lcom/ibotta/android/tracking/proprietary/event/-$$Lambda$AbstractEvent$IMQrzF263KjLT7rzQdhiqU-20Pw;-><init>(Ljava/util/List;)V

    invoke-interface {v1, v2}, Ljava9/util/stream/Stream;->forEach(Ljava9/util/function/Consumer;)V
    :try_end_0
    .catch Lcom/ibotta/android/json/IbottaJsonException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    const-string v2, "Failed to parse appNames JSON into PartnerApp list."

    .line 880
    new-array v3, v3, [Ljava/lang/Object;

    invoke-static {v1, v2, v3}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_0
    return-object v0
.end method

.method static synthetic lambda$getAppNamesMaps$0(Ljava/util/List;Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppTrackingData;)V
    .locals 6

    const-string v0, "app_id"

    .line 873
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppTrackingData;->getAppId()Ljava/lang/String;

    move-result-object v1

    const-string v2, "name"

    .line 874
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppTrackingData;->getName()Ljava/lang/String;

    move-result-object v3

    const-string v4, "installed"

    .line 875
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppTrackingData;->isInstalled()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    .line 872
    invoke-static/range {v0 .. v5}, Ljava9/util/Maps;->of(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    move-result-object p1

    .line 871
    invoke-interface {p0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method


# virtual methods
.method public addAttempts(I)V
    .locals 1

    .line 407
    iget-short v0, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->attempts:S

    add-int/2addr v0, p1

    int-to-short p1, v0

    iput-short p1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->attempts:S

    return-void
.end method

.method public addCounter(I)V
    .locals 1

    .line 352
    iget v0, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->counter:I

    add-int/2addr v0, p1

    iput v0, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->counter:I

    return-void
.end method

.method public addDuration(Ljava/lang/Float;)V
    .locals 1

    if-nez p1, :cond_0

    return-void

    .line 379
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->duration:Ljava/lang/Float;

    if-eqz v0, :cond_1

    .line 380
    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    add-float/2addr v0, p1

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->duration:Ljava/lang/Float;

    goto :goto_0

    .line 382
    :cond_1
    iput-object p1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->duration:Ljava/lang/Float;

    :goto_0
    return-void
.end method

.method public addEngaged(I)V
    .locals 1

    .line 364
    iget v0, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->engaged:I

    add-int/2addr v0, p1

    iput v0, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->engaged:I

    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    if-ne p1, p0, :cond_1

    const/4 p1, 0x1

    return p1

    .line 635
    :cond_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    if-eq v1, v2, :cond_2

    return v0

    .line 639
    :cond_2
    check-cast p1, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;

    .line 640
    new-instance v0, Lorg/apache/commons/lang3/builder/EqualsBuilder;

    invoke-direct {v0}, Lorg/apache/commons/lang3/builder/EqualsBuilder;-><init>()V

    iget-object v1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->eventContext:Ljava/lang/String;

    iget-object v2, p1, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->eventContext:Ljava/lang/String;

    .line 641
    invoke-virtual {v0, v1, v2}, Lorg/apache/commons/lang3/builder/EqualsBuilder;->append(Ljava/lang/Object;Ljava/lang/Object;)Lorg/apache/commons/lang3/builder/EqualsBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->retailerId:Ljava/lang/Integer;

    iget-object v2, p1, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->retailerId:Ljava/lang/Integer;

    .line 642
    invoke-virtual {v0, v1, v2}, Lorg/apache/commons/lang3/builder/EqualsBuilder;->append(Ljava/lang/Object;Ljava/lang/Object;)Lorg/apache/commons/lang3/builder/EqualsBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->offerId:Ljava/lang/Integer;

    iget-object v2, p1, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->offerId:Ljava/lang/Integer;

    .line 643
    invoke-virtual {v0, v1, v2}, Lorg/apache/commons/lang3/builder/EqualsBuilder;->append(Ljava/lang/Object;Ljava/lang/Object;)Lorg/apache/commons/lang3/builder/EqualsBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->productId:Ljava/lang/String;

    iget-object v2, p1, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->productId:Ljava/lang/String;

    .line 644
    invoke-virtual {v0, v1, v2}, Lorg/apache/commons/lang3/builder/EqualsBuilder;->append(Ljava/lang/Object;Ljava/lang/Object;)Lorg/apache/commons/lang3/builder/EqualsBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->dealId:Ljava/lang/String;

    iget-object v2, p1, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->dealId:Ljava/lang/String;

    .line 645
    invoke-virtual {v0, v1, v2}, Lorg/apache/commons/lang3/builder/EqualsBuilder;->append(Ljava/lang/Object;Ljava/lang/Object;)Lorg/apache/commons/lang3/builder/EqualsBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->offerCategoryId:Ljava/lang/Integer;

    iget-object v2, p1, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->offerCategoryId:Ljava/lang/Integer;

    .line 646
    invoke-virtual {v0, v1, v2}, Lorg/apache/commons/lang3/builder/EqualsBuilder;->append(Ljava/lang/Object;Ljava/lang/Object;)Lorg/apache/commons/lang3/builder/EqualsBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->offerRewardId:Ljava/lang/Integer;

    iget-object v2, p1, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->offerRewardId:Ljava/lang/Integer;

    .line 647
    invoke-virtual {v0, v1, v2}, Lorg/apache/commons/lang3/builder/EqualsBuilder;->append(Ljava/lang/Object;Ljava/lang/Object;)Lorg/apache/commons/lang3/builder/EqualsBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->bonusId:Ljava/lang/Integer;

    iget-object v2, p1, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->bonusId:Ljava/lang/Integer;

    .line 648
    invoke-virtual {v0, v1, v2}, Lorg/apache/commons/lang3/builder/EqualsBuilder;->append(Ljava/lang/Object;Ljava/lang/Object;)Lorg/apache/commons/lang3/builder/EqualsBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->retailerCategoryId:Ljava/lang/Integer;

    iget-object v2, p1, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->retailerCategoryId:Ljava/lang/Integer;

    .line 649
    invoke-virtual {v0, v1, v2}, Lorg/apache/commons/lang3/builder/EqualsBuilder;->append(Ljava/lang/Object;Ljava/lang/Object;)Lorg/apache/commons/lang3/builder/EqualsBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->promoId:Ljava/lang/Integer;

    iget-object v2, p1, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->promoId:Ljava/lang/Integer;

    .line 650
    invoke-virtual {v0, v1, v2}, Lorg/apache/commons/lang3/builder/EqualsBuilder;->append(Ljava/lang/Object;Ljava/lang/Object;)Lorg/apache/commons/lang3/builder/EqualsBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->tileId:Ljava/lang/Integer;

    iget-object v2, p1, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->tileId:Ljava/lang/Integer;

    .line 651
    invoke-virtual {v0, v1, v2}, Lorg/apache/commons/lang3/builder/EqualsBuilder;->append(Ljava/lang/Object;Ljava/lang/Object;)Lorg/apache/commons/lang3/builder/EqualsBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->moduleName:Ljava/lang/String;

    iget-object v2, p1, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->moduleName:Ljava/lang/String;

    .line 652
    invoke-virtual {v0, v1, v2}, Lorg/apache/commons/lang3/builder/EqualsBuilder;->append(Ljava/lang/Object;Ljava/lang/Object;)Lorg/apache/commons/lang3/builder/EqualsBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->moduleIndex:Ljava/lang/Integer;

    iget-object v2, p1, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->moduleIndex:Ljava/lang/Integer;

    .line 653
    invoke-virtual {v0, v1, v2}, Lorg/apache/commons/lang3/builder/EqualsBuilder;->append(Ljava/lang/Object;Ljava/lang/Object;)Lorg/apache/commons/lang3/builder/EqualsBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->listIndex:Ljava/lang/Integer;

    iget-object v2, p1, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->listIndex:Ljava/lang/Integer;

    .line 654
    invoke-virtual {v0, v1, v2}, Lorg/apache/commons/lang3/builder/EqualsBuilder;->append(Ljava/lang/Object;Ljava/lang/Object;)Lorg/apache/commons/lang3/builder/EqualsBuilder;

    move-result-object v0

    iget-boolean v1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->clicked:Z

    iget-boolean v2, p1, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->clicked:Z

    .line 655
    invoke-virtual {v0, v1, v2}, Lorg/apache/commons/lang3/builder/EqualsBuilder;->append(ZZ)Lorg/apache/commons/lang3/builder/EqualsBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->clickId:Ljava/lang/Integer;

    iget-object v2, p1, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->clickId:Ljava/lang/Integer;

    .line 656
    invoke-virtual {v0, v1, v2}, Lorg/apache/commons/lang3/builder/EqualsBuilder;->append(Ljava/lang/Object;Ljava/lang/Object;)Lorg/apache/commons/lang3/builder/EqualsBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->clickType:Ljava/lang/String;

    iget-object v2, p1, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->clickType:Ljava/lang/String;

    .line 657
    invoke-virtual {v0, v1, v2}, Lorg/apache/commons/lang3/builder/EqualsBuilder;->append(Ljava/lang/Object;Ljava/lang/Object;)Lorg/apache/commons/lang3/builder/EqualsBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->referrer:Ljava/lang/String;

    iget-object v2, p1, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->referrer:Ljava/lang/String;

    .line 658
    invoke-virtual {v0, v1, v2}, Lorg/apache/commons/lang3/builder/EqualsBuilder;->append(Ljava/lang/Object;Ljava/lang/Object;)Lorg/apache/commons/lang3/builder/EqualsBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->term:Ljava/lang/String;

    iget-object v2, p1, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->term:Ljava/lang/String;

    .line 659
    invoke-virtual {v0, v1, v2}, Lorg/apache/commons/lang3/builder/EqualsBuilder;->append(Ljava/lang/Object;Ljava/lang/Object;)Lorg/apache/commons/lang3/builder/EqualsBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->upc:Ljava/lang/String;

    iget-object v2, p1, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->upc:Ljava/lang/String;

    .line 660
    invoke-virtual {v0, v1, v2}, Lorg/apache/commons/lang3/builder/EqualsBuilder;->append(Ljava/lang/Object;Ljava/lang/Object;)Lorg/apache/commons/lang3/builder/EqualsBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->test:Ljava/lang/String;

    iget-object v2, p1, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->test:Ljava/lang/String;

    .line 661
    invoke-virtual {v0, v1, v2}, Lorg/apache/commons/lang3/builder/EqualsBuilder;->append(Ljava/lang/Object;Ljava/lang/Object;)Lorg/apache/commons/lang3/builder/EqualsBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->variant:Ljava/lang/String;

    iget-object v2, p1, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->variant:Ljava/lang/String;

    .line 662
    invoke-virtual {v0, v1, v2}, Lorg/apache/commons/lang3/builder/EqualsBuilder;->append(Ljava/lang/Object;Ljava/lang/Object;)Lorg/apache/commons/lang3/builder/EqualsBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->thirdpartyId:Ljava/lang/String;

    iget-object v2, p1, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->thirdpartyId:Ljava/lang/String;

    .line 663
    invoke-virtual {v0, v1, v2}, Lorg/apache/commons/lang3/builder/EqualsBuilder;->append(Ljava/lang/Object;Ljava/lang/Object;)Lorg/apache/commons/lang3/builder/EqualsBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->referralCode:Ljava/lang/String;

    iget-object v2, p1, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->referralCode:Ljava/lang/String;

    .line 664
    invoke-virtual {v0, v1, v2}, Lorg/apache/commons/lang3/builder/EqualsBuilder;->append(Ljava/lang/Object;Ljava/lang/Object;)Lorg/apache/commons/lang3/builder/EqualsBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->appNames:Ljava/lang/String;

    iget-object v2, p1, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->appNames:Ljava/lang/String;

    .line 665
    invoke-virtual {v0, v1, v2}, Lorg/apache/commons/lang3/builder/EqualsBuilder;->append(Ljava/lang/Object;Ljava/lang/Object;)Lorg/apache/commons/lang3/builder/EqualsBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->offerSegmentId:Ljava/lang/Integer;

    iget-object v2, p1, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->offerSegmentId:Ljava/lang/Integer;

    .line 666
    invoke-virtual {v0, v1, v2}, Lorg/apache/commons/lang3/builder/EqualsBuilder;->append(Ljava/lang/Object;Ljava/lang/Object;)Lorg/apache/commons/lang3/builder/EqualsBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->eventStatus:Ljava/lang/String;

    iget-object v2, p1, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->eventStatus:Ljava/lang/String;

    .line 667
    invoke-virtual {v0, v1, v2}, Lorg/apache/commons/lang3/builder/EqualsBuilder;->append(Ljava/lang/Object;Ljava/lang/Object;)Lorg/apache/commons/lang3/builder/EqualsBuilder;

    move-result-object v0

    iget-short v1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->attempts:S

    iget-short v2, p1, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->attempts:S

    .line 668
    invoke-virtual {v0, v1, v2}, Lorg/apache/commons/lang3/builder/EqualsBuilder;->append(SS)Lorg/apache/commons/lang3/builder/EqualsBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->attemptAt:Ljava/lang/Long;

    iget-object v2, p1, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->attemptAt:Ljava/lang/Long;

    .line 669
    invoke-virtual {v0, v1, v2}, Lorg/apache/commons/lang3/builder/EqualsBuilder;->append(Ljava/lang/Object;Ljava/lang/Object;)Lorg/apache/commons/lang3/builder/EqualsBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->questName:Ljava/lang/String;

    iget-object v2, p1, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->questName:Ljava/lang/String;

    .line 670
    invoke-virtual {v0, v1, v2}, Lorg/apache/commons/lang3/builder/EqualsBuilder;->append(Ljava/lang/Object;Ljava/lang/Object;)Lorg/apache/commons/lang3/builder/EqualsBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->questState:Ljava/lang/String;

    iget-object v2, p1, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->questState:Ljava/lang/String;

    .line 671
    invoke-virtual {v0, v1, v2}, Lorg/apache/commons/lang3/builder/EqualsBuilder;->append(Ljava/lang/Object;Ljava/lang/Object;)Lorg/apache/commons/lang3/builder/EqualsBuilder;

    move-result-object v0

    iget v1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->questStep:I

    iget v2, p1, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->questStep:I

    .line 672
    invoke-virtual {v0, v1, v2}, Lorg/apache/commons/lang3/builder/EqualsBuilder;->append(II)Lorg/apache/commons/lang3/builder/EqualsBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->searchType:Ljava/lang/String;

    iget-object v2, p1, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->searchType:Ljava/lang/String;

    .line 673
    invoke-virtual {v0, v1, v2}, Lorg/apache/commons/lang3/builder/EqualsBuilder;->append(Ljava/lang/Object;Ljava/lang/Object;)Lorg/apache/commons/lang3/builder/EqualsBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->engagementId:Ljava/lang/Long;

    iget-object v2, p1, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->engagementId:Ljava/lang/Long;

    .line 674
    invoke-virtual {v0, v1, v2}, Lorg/apache/commons/lang3/builder/EqualsBuilder;->append(Ljava/lang/Object;Ljava/lang/Object;)Lorg/apache/commons/lang3/builder/EqualsBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->notificationText:Ljava/lang/String;

    iget-object v2, p1, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->notificationText:Ljava/lang/String;

    .line 675
    invoke-virtual {v0, v1, v2}, Lorg/apache/commons/lang3/builder/EqualsBuilder;->append(Ljava/lang/Object;Ljava/lang/Object;)Lorg/apache/commons/lang3/builder/EqualsBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->notificationType:Ljava/lang/String;

    iget-object v2, p1, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->notificationType:Ljava/lang/String;

    .line 676
    invoke-virtual {v0, v1, v2}, Lorg/apache/commons/lang3/builder/EqualsBuilder;->append(Ljava/lang/Object;Ljava/lang/Object;)Lorg/apache/commons/lang3/builder/EqualsBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->entryScreen:Ljava/lang/String;

    iget-object v2, p1, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->entryScreen:Ljava/lang/String;

    .line 677
    invoke-virtual {v0, v1, v2}, Lorg/apache/commons/lang3/builder/EqualsBuilder;->append(Ljava/lang/Object;Ljava/lang/Object;)Lorg/apache/commons/lang3/builder/EqualsBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->exitScreen:Ljava/lang/String;

    iget-object v2, p1, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->exitScreen:Ljava/lang/String;

    .line 678
    invoke-virtual {v0, v1, v2}, Lorg/apache/commons/lang3/builder/EqualsBuilder;->append(Ljava/lang/Object;Ljava/lang/Object;)Lorg/apache/commons/lang3/builder/EqualsBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->notificationId:Ljava/lang/Integer;

    iget-object v2, p1, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->notificationId:Ljava/lang/Integer;

    .line 679
    invoke-virtual {v0, v1, v2}, Lorg/apache/commons/lang3/builder/EqualsBuilder;->append(Ljava/lang/Object;Ljava/lang/Object;)Lorg/apache/commons/lang3/builder/EqualsBuilder;

    move-result-object v0

    iget v1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->amount:F

    iget v2, p1, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->amount:F

    .line 680
    invoke-virtual {v0, v1, v2}, Lorg/apache/commons/lang3/builder/EqualsBuilder;->append(FF)Lorg/apache/commons/lang3/builder/EqualsBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->status:Ljava/lang/String;

    iget-object v2, p1, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->status:Ljava/lang/String;

    .line 681
    invoke-virtual {v0, v1, v2}, Lorg/apache/commons/lang3/builder/EqualsBuilder;->append(Ljava/lang/Object;Ljava/lang/Object;)Lorg/apache/commons/lang3/builder/EqualsBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->messageData:Ljava/lang/String;

    iget-object v2, p1, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->messageData:Ljava/lang/String;

    .line 682
    invoke-virtual {v0, v1, v2}, Lorg/apache/commons/lang3/builder/EqualsBuilder;->append(Ljava/lang/Object;Ljava/lang/Object;)Lorg/apache/commons/lang3/builder/EqualsBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->contextDetail:Ljava/lang/String;

    iget-object v2, p1, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->contextDetail:Ljava/lang/String;

    .line 683
    invoke-virtual {v0, v1, v2}, Lorg/apache/commons/lang3/builder/EqualsBuilder;->append(Ljava/lang/Object;Ljava/lang/Object;)Lorg/apache/commons/lang3/builder/EqualsBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->locationPermissionStatus:Ljava/lang/String;

    iget-object v2, p1, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->locationPermissionStatus:Ljava/lang/String;

    .line 684
    invoke-virtual {v0, v1, v2}, Lorg/apache/commons/lang3/builder/EqualsBuilder;->append(Ljava/lang/Object;Ljava/lang/Object;)Lorg/apache/commons/lang3/builder/EqualsBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->pushPermissionStatus:Ljava/lang/String;

    iget-object p1, p1, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->pushPermissionStatus:Ljava/lang/String;

    .line 685
    invoke-virtual {v0, v1, p1}, Lorg/apache/commons/lang3/builder/EqualsBuilder;->append(Ljava/lang/Object;Ljava/lang/Object;)Lorg/apache/commons/lang3/builder/EqualsBuilder;

    move-result-object p1

    .line 686
    invoke-virtual {p1}, Lorg/apache/commons/lang3/builder/EqualsBuilder;->isEquals()Z

    move-result p1

    return p1
.end method

.method public getAmount()F
    .locals 1

    .line 545
    iget v0, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->amount:F

    return v0
.end method

.method public getAppNames()Ljava/lang/String;
    .locals 1

    .line 320
    iget-object v0, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->appNames:Ljava/lang/String;

    return-object v0
.end method

.method public getAttemptAt()Ljava/lang/Long;
    .locals 1

    .line 411
    iget-object v0, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->attemptAt:Ljava/lang/Long;

    return-object v0
.end method

.method public getAttempts()S
    .locals 1

    .line 399
    iget-short v0, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->attempts:S

    return v0
.end method

.method public getBonusId()Ljava/lang/Integer;
    .locals 1

    .line 200
    iget-object v0, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->bonusId:Ljava/lang/Integer;

    return-object v0
.end method

.method public getCategoryId()I
    .locals 1

    .line 443
    iget v0, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->categoryId:I

    return v0
.end method

.method public getCategoryType()Ljava/lang/String;
    .locals 1

    .line 451
    iget-object v0, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->categoryType:Ljava/lang/String;

    return-object v0
.end method

.method public getClickId()Ljava/lang/Integer;
    .locals 1

    .line 256
    iget-object v0, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->clickId:Ljava/lang/Integer;

    return-object v0
.end method

.method public getClickType()Ljava/lang/String;
    .locals 1

    .line 156
    iget-object v0, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->clickType:Ljava/lang/String;

    return-object v0
.end method

.method public getClickTypeEnum()Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;
    .locals 1

    .line 152
    iget-object v0, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->clickType:Ljava/lang/String;

    invoke-static {v0}, Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;->fromString(Ljava/lang/String;)Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;

    move-result-object v0

    return-object v0
.end method

.method public getContextDetail()Ljava/lang/String;
    .locals 1

    .line 569
    iget-object v0, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->contextDetail:Ljava/lang/String;

    return-object v0
.end method

.method public getCounter()I
    .locals 1

    .line 344
    iget v0, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->counter:I

    return v0
.end method

.method public getDealId()Ljava/lang/String;
    .locals 1

    .line 240
    iget-object v0, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->dealId:Ljava/lang/String;

    return-object v0
.end method

.method public getDuration()Ljava/lang/Float;
    .locals 1

    .line 368
    iget-object v0, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->duration:Ljava/lang/Float;

    return-object v0
.end method

.method public getEngaged()I
    .locals 1

    .line 356
    iget v0, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->engaged:I

    return v0
.end method

.method public getEngagementId()Ljava/lang/Long;
    .locals 1

    .line 492
    iget-object v0, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->engagementId:Ljava/lang/Long;

    return-object v0
.end method

.method public getEntryScreen()Ljava/lang/String;
    .locals 1

    .line 521
    iget-object v0, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->entryScreen:Ljava/lang/String;

    return-object v0
.end method

.method public getEventAt()J
    .locals 2

    .line 336
    iget-wide v0, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->eventAt:J

    return-wide v0
.end method

.method public getEventContext()Ljava/lang/String;
    .locals 1

    .line 108
    iget-object v0, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->eventContext:Ljava/lang/String;

    return-object v0
.end method

.method public getEventContextEnum()Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;
    .locals 1

    .line 104
    iget-object v0, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->eventContext:Ljava/lang/String;

    invoke-static {v0}, Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;->fromString(Ljava/lang/String;)Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;

    move-result-object v0

    return-object v0
.end method

.method public getEventStatus()Ljava/lang/String;
    .locals 1

    .line 391
    iget-object v0, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->eventStatus:Ljava/lang/String;

    return-object v0
.end method

.method public getEventStatusEnum()Lcom/ibotta/android/tracking/proprietary/event/enums/EventStatus;
    .locals 1

    .line 387
    iget-object v0, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->eventStatus:Ljava/lang/String;

    invoke-static {v0}, Lcom/ibotta/android/tracking/proprietary/event/enums/EventStatus;->fromString(Ljava/lang/String;)Lcom/ibotta/android/tracking/proprietary/event/enums/EventStatus;

    move-result-object v0

    return-object v0
.end method

.method public getEventType()Ljava/lang/String;
    .locals 1

    .line 459
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getExitScreen()Ljava/lang/String;
    .locals 1

    .line 529
    iget-object v0, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->exitScreen:Ljava/lang/String;

    return-object v0
.end method

.method public getId()I
    .locals 1

    .line 92
    iget v0, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->id:I

    return v0
.end method

.method public getListIndex()Ljava/lang/Integer;
    .locals 1

    .line 144
    iget-object v0, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->listIndex:Ljava/lang/Integer;

    return-object v0
.end method

.method public getLocationPermissionStatus()Ljava/lang/String;
    .locals 1

    .line 471
    iget-object v0, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->locationPermissionStatus:Ljava/lang/String;

    return-object v0
.end method

.method public getMessageData()Ljava/lang/String;
    .locals 1

    .line 561
    iget-object v0, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->messageData:Ljava/lang/String;

    return-object v0
.end method

.method public getModuleId()Ljava/lang/Integer;
    .locals 1

    .line 120
    iget-object v0, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->moduleId:Ljava/lang/Integer;

    return-object v0
.end method

.method public getModuleIndex()Ljava/lang/Integer;
    .locals 1

    .line 136
    iget-object v0, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->moduleIndex:Ljava/lang/Integer;

    return-object v0
.end method

.method public getModuleName()Ljava/lang/String;
    .locals 1

    .line 128
    iget-object v0, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->moduleName:Ljava/lang/String;

    return-object v0
.end method

.method public getNotificationId()Ljava/lang/Integer;
    .locals 1

    .line 537
    iget-object v0, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->notificationId:Ljava/lang/Integer;

    return-object v0
.end method

.method public getNotificationText()Ljava/lang/String;
    .locals 1

    .line 505
    iget-object v0, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->notificationText:Ljava/lang/String;

    return-object v0
.end method

.method public getNotificationType()Ljava/lang/String;
    .locals 1

    .line 513
    iget-object v0, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->notificationType:Ljava/lang/String;

    return-object v0
.end method

.method public getOfferCategoryId()Ljava/lang/Integer;
    .locals 1

    .line 184
    iget-object v0, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->offerCategoryId:Ljava/lang/Integer;

    return-object v0
.end method

.method public getOfferId()Ljava/lang/Integer;
    .locals 1

    .line 176
    iget-object v0, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->offerId:Ljava/lang/Integer;

    return-object v0
.end method

.method public getOfferRewardId()Ljava/lang/Integer;
    .locals 1

    .line 192
    iget-object v0, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->offerRewardId:Ljava/lang/Integer;

    return-object v0
.end method

.method public getOfferSegmentId()Ljava/lang/Integer;
    .locals 1

    .line 328
    iget-object v0, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->offerSegmentId:Ljava/lang/Integer;

    return-object v0
.end method

.method public abstract getPrime1()I
.end method

.method public abstract getPrime2()I
.end method

.method public getProductId()Ljava/lang/String;
    .locals 1

    .line 232
    iget-object v0, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->productId:Ljava/lang/String;

    return-object v0
.end method

.method public getPromoId()Ljava/lang/Integer;
    .locals 1

    .line 216
    iget-object v0, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->promoId:Ljava/lang/Integer;

    return-object v0
.end method

.method public getPushPermissionStatus()Ljava/lang/String;
    .locals 1

    .line 479
    iget-object v0, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->pushPermissionStatus:Ljava/lang/String;

    return-object v0
.end method

.method public getQuestName()Ljava/lang/String;
    .locals 1

    .line 419
    iget-object v0, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->questName:Ljava/lang/String;

    return-object v0
.end method

.method public getQuestState()Ljava/lang/String;
    .locals 1

    .line 435
    iget-object v0, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->questState:Ljava/lang/String;

    return-object v0
.end method

.method public getQuestStep()I
    .locals 1

    .line 427
    iget v0, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->questStep:I

    return v0
.end method

.method public getReferralCode()Ljava/lang/String;
    .locals 1

    .line 312
    iget-object v0, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->referralCode:Ljava/lang/String;

    return-object v0
.end method

.method public getReferrer()Ljava/lang/String;
    .locals 1

    .line 264
    iget-object v0, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->referrer:Ljava/lang/String;

    return-object v0
.end method

.method public getRetailerCategoryId()Ljava/lang/Integer;
    .locals 1

    .line 208
    iget-object v0, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->retailerCategoryId:Ljava/lang/Integer;

    return-object v0
.end method

.method public getRetailerId()Ljava/lang/Integer;
    .locals 1

    .line 168
    iget-object v0, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->retailerId:Ljava/lang/Integer;

    return-object v0
.end method

.method public getSearchType()Ljava/lang/String;
    .locals 1

    .line 463
    iget-object v0, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->searchType:Ljava/lang/String;

    return-object v0
.end method

.method public getStatus()Ljava/lang/String;
    .locals 1

    .line 553
    iget-object v0, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->status:Ljava/lang/String;

    return-object v0
.end method

.method public getTerm()Ljava/lang/String;
    .locals 1

    .line 272
    iget-object v0, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->term:Ljava/lang/String;

    return-object v0
.end method

.method public getTest()Ljava/lang/String;
    .locals 1

    .line 288
    iget-object v0, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->test:Ljava/lang/String;

    return-object v0
.end method

.method public getThirdpartyId()Ljava/lang/String;
    .locals 1

    .line 304
    iget-object v0, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->thirdpartyId:Ljava/lang/String;

    return-object v0
.end method

.method public getTileId()Ljava/lang/Integer;
    .locals 1

    .line 224
    iget-object v0, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->tileId:Ljava/lang/Integer;

    return-object v0
.end method

.method public getUpc()Ljava/lang/String;
    .locals 1

    .line 280
    iget-object v0, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->upc:Ljava/lang/String;

    return-object v0
.end method

.method public getVariant()Ljava/lang/String;
    .locals 1

    .line 296
    iget-object v0, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->variant:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    .line 578
    new-instance v0, Lorg/apache/commons/lang3/builder/HashCodeBuilder;

    invoke-virtual {p0}, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->getPrime1()I

    move-result v1

    invoke-virtual {p0}, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->getPrime2()I

    move-result v2

    invoke-direct {v0, v1, v2}, Lorg/apache/commons/lang3/builder/HashCodeBuilder;-><init>(II)V

    iget-object v1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->eventContext:Ljava/lang/String;

    .line 579
    invoke-virtual {v0, v1}, Lorg/apache/commons/lang3/builder/HashCodeBuilder;->append(Ljava/lang/Object;)Lorg/apache/commons/lang3/builder/HashCodeBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->retailerId:Ljava/lang/Integer;

    .line 580
    invoke-virtual {v0, v1}, Lorg/apache/commons/lang3/builder/HashCodeBuilder;->append(Ljava/lang/Object;)Lorg/apache/commons/lang3/builder/HashCodeBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->offerId:Ljava/lang/Integer;

    .line 581
    invoke-virtual {v0, v1}, Lorg/apache/commons/lang3/builder/HashCodeBuilder;->append(Ljava/lang/Object;)Lorg/apache/commons/lang3/builder/HashCodeBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->offerCategoryId:Ljava/lang/Integer;

    .line 582
    invoke-virtual {v0, v1}, Lorg/apache/commons/lang3/builder/HashCodeBuilder;->append(Ljava/lang/Object;)Lorg/apache/commons/lang3/builder/HashCodeBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->offerRewardId:Ljava/lang/Integer;

    .line 583
    invoke-virtual {v0, v1}, Lorg/apache/commons/lang3/builder/HashCodeBuilder;->append(Ljava/lang/Object;)Lorg/apache/commons/lang3/builder/HashCodeBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->bonusId:Ljava/lang/Integer;

    .line 584
    invoke-virtual {v0, v1}, Lorg/apache/commons/lang3/builder/HashCodeBuilder;->append(Ljava/lang/Object;)Lorg/apache/commons/lang3/builder/HashCodeBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->retailerCategoryId:Ljava/lang/Integer;

    .line 585
    invoke-virtual {v0, v1}, Lorg/apache/commons/lang3/builder/HashCodeBuilder;->append(Ljava/lang/Object;)Lorg/apache/commons/lang3/builder/HashCodeBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->promoId:Ljava/lang/Integer;

    .line 586
    invoke-virtual {v0, v1}, Lorg/apache/commons/lang3/builder/HashCodeBuilder;->append(Ljava/lang/Object;)Lorg/apache/commons/lang3/builder/HashCodeBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->dealId:Ljava/lang/String;

    .line 587
    invoke-virtual {v0, v1}, Lorg/apache/commons/lang3/builder/HashCodeBuilder;->append(Ljava/lang/Object;)Lorg/apache/commons/lang3/builder/HashCodeBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->productId:Ljava/lang/String;

    .line 588
    invoke-virtual {v0, v1}, Lorg/apache/commons/lang3/builder/HashCodeBuilder;->append(Ljava/lang/Object;)Lorg/apache/commons/lang3/builder/HashCodeBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->tileId:Ljava/lang/Integer;

    .line 589
    invoke-virtual {v0, v1}, Lorg/apache/commons/lang3/builder/HashCodeBuilder;->append(Ljava/lang/Object;)Lorg/apache/commons/lang3/builder/HashCodeBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->moduleName:Ljava/lang/String;

    .line 590
    invoke-virtual {v0, v1}, Lorg/apache/commons/lang3/builder/HashCodeBuilder;->append(Ljava/lang/Object;)Lorg/apache/commons/lang3/builder/HashCodeBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->moduleIndex:Ljava/lang/Integer;

    .line 591
    invoke-virtual {v0, v1}, Lorg/apache/commons/lang3/builder/HashCodeBuilder;->append(Ljava/lang/Object;)Lorg/apache/commons/lang3/builder/HashCodeBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->listIndex:Ljava/lang/Integer;

    .line 592
    invoke-virtual {v0, v1}, Lorg/apache/commons/lang3/builder/HashCodeBuilder;->append(Ljava/lang/Object;)Lorg/apache/commons/lang3/builder/HashCodeBuilder;

    move-result-object v0

    iget-boolean v1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->clicked:Z

    .line 593
    invoke-virtual {v0, v1}, Lorg/apache/commons/lang3/builder/HashCodeBuilder;->append(Z)Lorg/apache/commons/lang3/builder/HashCodeBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->clickId:Ljava/lang/Integer;

    .line 594
    invoke-virtual {v0, v1}, Lorg/apache/commons/lang3/builder/HashCodeBuilder;->append(Ljava/lang/Object;)Lorg/apache/commons/lang3/builder/HashCodeBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->clickType:Ljava/lang/String;

    .line 595
    invoke-virtual {v0, v1}, Lorg/apache/commons/lang3/builder/HashCodeBuilder;->append(Ljava/lang/Object;)Lorg/apache/commons/lang3/builder/HashCodeBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->referrer:Ljava/lang/String;

    .line 596
    invoke-virtual {v0, v1}, Lorg/apache/commons/lang3/builder/HashCodeBuilder;->append(Ljava/lang/Object;)Lorg/apache/commons/lang3/builder/HashCodeBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->term:Ljava/lang/String;

    .line 597
    invoke-virtual {v0, v1}, Lorg/apache/commons/lang3/builder/HashCodeBuilder;->append(Ljava/lang/Object;)Lorg/apache/commons/lang3/builder/HashCodeBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->upc:Ljava/lang/String;

    .line 598
    invoke-virtual {v0, v1}, Lorg/apache/commons/lang3/builder/HashCodeBuilder;->append(Ljava/lang/Object;)Lorg/apache/commons/lang3/builder/HashCodeBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->test:Ljava/lang/String;

    .line 599
    invoke-virtual {v0, v1}, Lorg/apache/commons/lang3/builder/HashCodeBuilder;->append(Ljava/lang/Object;)Lorg/apache/commons/lang3/builder/HashCodeBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->variant:Ljava/lang/String;

    .line 600
    invoke-virtual {v0, v1}, Lorg/apache/commons/lang3/builder/HashCodeBuilder;->append(Ljava/lang/Object;)Lorg/apache/commons/lang3/builder/HashCodeBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->thirdpartyId:Ljava/lang/String;

    .line 601
    invoke-virtual {v0, v1}, Lorg/apache/commons/lang3/builder/HashCodeBuilder;->append(Ljava/lang/Object;)Lorg/apache/commons/lang3/builder/HashCodeBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->referralCode:Ljava/lang/String;

    .line 602
    invoke-virtual {v0, v1}, Lorg/apache/commons/lang3/builder/HashCodeBuilder;->append(Ljava/lang/Object;)Lorg/apache/commons/lang3/builder/HashCodeBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->appNames:Ljava/lang/String;

    .line 603
    invoke-virtual {v0, v1}, Lorg/apache/commons/lang3/builder/HashCodeBuilder;->append(Ljava/lang/Object;)Lorg/apache/commons/lang3/builder/HashCodeBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->offerSegmentId:Ljava/lang/Integer;

    .line 604
    invoke-virtual {v0, v1}, Lorg/apache/commons/lang3/builder/HashCodeBuilder;->append(Ljava/lang/Object;)Lorg/apache/commons/lang3/builder/HashCodeBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->eventStatus:Ljava/lang/String;

    .line 605
    invoke-virtual {v0, v1}, Lorg/apache/commons/lang3/builder/HashCodeBuilder;->append(Ljava/lang/Object;)Lorg/apache/commons/lang3/builder/HashCodeBuilder;

    move-result-object v0

    iget-short v1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->attempts:S

    .line 606
    invoke-virtual {v0, v1}, Lorg/apache/commons/lang3/builder/HashCodeBuilder;->append(S)Lorg/apache/commons/lang3/builder/HashCodeBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->attemptAt:Ljava/lang/Long;

    .line 607
    invoke-virtual {v0, v1}, Lorg/apache/commons/lang3/builder/HashCodeBuilder;->append(Ljava/lang/Object;)Lorg/apache/commons/lang3/builder/HashCodeBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->questName:Ljava/lang/String;

    .line 608
    invoke-virtual {v0, v1}, Lorg/apache/commons/lang3/builder/HashCodeBuilder;->append(Ljava/lang/Object;)Lorg/apache/commons/lang3/builder/HashCodeBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->questState:Ljava/lang/String;

    .line 609
    invoke-virtual {v0, v1}, Lorg/apache/commons/lang3/builder/HashCodeBuilder;->append(Ljava/lang/Object;)Lorg/apache/commons/lang3/builder/HashCodeBuilder;

    move-result-object v0

    iget v1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->questStep:I

    .line 610
    invoke-virtual {v0, v1}, Lorg/apache/commons/lang3/builder/HashCodeBuilder;->append(I)Lorg/apache/commons/lang3/builder/HashCodeBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->searchType:Ljava/lang/String;

    .line 611
    invoke-virtual {v0, v1}, Lorg/apache/commons/lang3/builder/HashCodeBuilder;->append(Ljava/lang/Object;)Lorg/apache/commons/lang3/builder/HashCodeBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->engagementId:Ljava/lang/Long;

    .line 612
    invoke-virtual {v0, v1}, Lorg/apache/commons/lang3/builder/HashCodeBuilder;->append(Ljava/lang/Object;)Lorg/apache/commons/lang3/builder/HashCodeBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->notificationText:Ljava/lang/String;

    .line 613
    invoke-virtual {v0, v1}, Lorg/apache/commons/lang3/builder/HashCodeBuilder;->append(Ljava/lang/Object;)Lorg/apache/commons/lang3/builder/HashCodeBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->notificationType:Ljava/lang/String;

    .line 614
    invoke-virtual {v0, v1}, Lorg/apache/commons/lang3/builder/HashCodeBuilder;->append(Ljava/lang/Object;)Lorg/apache/commons/lang3/builder/HashCodeBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->entryScreen:Ljava/lang/String;

    .line 615
    invoke-virtual {v0, v1}, Lorg/apache/commons/lang3/builder/HashCodeBuilder;->append(Ljava/lang/Object;)Lorg/apache/commons/lang3/builder/HashCodeBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->exitScreen:Ljava/lang/String;

    .line 616
    invoke-virtual {v0, v1}, Lorg/apache/commons/lang3/builder/HashCodeBuilder;->append(Ljava/lang/Object;)Lorg/apache/commons/lang3/builder/HashCodeBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->notificationId:Ljava/lang/Integer;

    .line 617
    invoke-virtual {v0, v1}, Lorg/apache/commons/lang3/builder/HashCodeBuilder;->append(Ljava/lang/Object;)Lorg/apache/commons/lang3/builder/HashCodeBuilder;

    move-result-object v0

    iget v1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->amount:F

    .line 618
    invoke-virtual {v0, v1}, Lorg/apache/commons/lang3/builder/HashCodeBuilder;->append(F)Lorg/apache/commons/lang3/builder/HashCodeBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->status:Ljava/lang/String;

    .line 619
    invoke-virtual {v0, v1}, Lorg/apache/commons/lang3/builder/HashCodeBuilder;->append(Ljava/lang/Object;)Lorg/apache/commons/lang3/builder/HashCodeBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->messageData:Ljava/lang/String;

    .line 620
    invoke-virtual {v0, v1}, Lorg/apache/commons/lang3/builder/HashCodeBuilder;->append(Ljava/lang/Object;)Lorg/apache/commons/lang3/builder/HashCodeBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->contextDetail:Ljava/lang/String;

    .line 621
    invoke-virtual {v0, v1}, Lorg/apache/commons/lang3/builder/HashCodeBuilder;->append(Ljava/lang/Object;)Lorg/apache/commons/lang3/builder/HashCodeBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->locationPermissionStatus:Ljava/lang/String;

    .line 622
    invoke-virtual {v0, v1}, Lorg/apache/commons/lang3/builder/HashCodeBuilder;->append(Ljava/lang/Object;)Lorg/apache/commons/lang3/builder/HashCodeBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->pushPermissionStatus:Ljava/lang/String;

    .line 623
    invoke-virtual {v0, v1}, Lorg/apache/commons/lang3/builder/HashCodeBuilder;->append(Ljava/lang/Object;)Lorg/apache/commons/lang3/builder/HashCodeBuilder;

    move-result-object v0

    .line 624
    invoke-virtual {v0}, Lorg/apache/commons/lang3/builder/HashCodeBuilder;->toHashCode()I

    move-result v0

    return v0
.end method

.method public isClicked()Z
    .locals 1

    .line 248
    iget-boolean v0, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->clicked:Z

    return v0
.end method

.method public setAmount(F)V
    .locals 0

    .line 549
    iput p1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->amount:F

    return-void
.end method

.method public setAppNames(Ljava/lang/String;)V
    .locals 0

    .line 324
    iput-object p1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->appNames:Ljava/lang/String;

    return-void
.end method

.method public setAttemptAt(Ljava/lang/Long;)V
    .locals 0

    .line 415
    iput-object p1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->attemptAt:Ljava/lang/Long;

    return-void
.end method

.method public setAttempts(S)V
    .locals 0

    .line 403
    iput-short p1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->attempts:S

    return-void
.end method

.method public setBonusId(Ljava/lang/Integer;)V
    .locals 0

    .line 204
    iput-object p1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->bonusId:Ljava/lang/Integer;

    return-void
.end method

.method public setCategoryId(I)V
    .locals 0

    .line 447
    iput p1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->categoryId:I

    return-void
.end method

.method public setCategoryType(Ljava/lang/String;)V
    .locals 0

    .line 455
    iput-object p1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->categoryType:Ljava/lang/String;

    return-void
.end method

.method public setClickId(Ljava/lang/Integer;)V
    .locals 0

    .line 260
    iput-object p1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->clickId:Ljava/lang/Integer;

    return-void
.end method

.method public setClickType(Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;)V
    .locals 0

    if-nez p1, :cond_0

    const/4 p1, 0x0

    .line 161
    iput-object p1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->clickType:Ljava/lang/String;

    goto :goto_0

    .line 163
    :cond_0
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->clickType:Ljava/lang/String;

    :goto_0
    return-void
.end method

.method public setClicked(Ljava/lang/Boolean;)V
    .locals 0

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    .line 252
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    :goto_0
    iput-boolean p1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->clicked:Z

    return-void
.end method

.method public setContextDetail(Ljava/lang/String;)V
    .locals 0

    .line 573
    iput-object p1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->contextDetail:Ljava/lang/String;

    return-void
.end method

.method public setCounter(I)V
    .locals 0

    .line 348
    iput p1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->counter:I

    return-void
.end method

.method public setDealId(Ljava/lang/String;)V
    .locals 0

    .line 244
    iput-object p1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->dealId:Ljava/lang/String;

    return-void
.end method

.method public setDuration(Ljava/lang/Float;)V
    .locals 0

    .line 372
    iput-object p1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->duration:Ljava/lang/Float;

    return-void
.end method

.method public setEngaged(I)V
    .locals 0

    .line 360
    iput p1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->engaged:I

    return-void
.end method

.method public setEngagementId(Ljava/lang/Long;)V
    .locals 0

    .line 501
    iput-object p1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->engagementId:Ljava/lang/Long;

    return-void
.end method

.method public setEntryScreen(Ljava/lang/String;)V
    .locals 0

    .line 525
    iput-object p1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->entryScreen:Ljava/lang/String;

    return-void
.end method

.method public setEventAt(J)V
    .locals 0

    .line 340
    iput-wide p1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->eventAt:J

    return-void
.end method

.method public setEventContext(Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;)V
    .locals 0

    if-nez p1, :cond_0

    const/4 p1, 0x0

    .line 113
    iput-object p1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->eventContext:Ljava/lang/String;

    goto :goto_0

    .line 115
    :cond_0
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->eventContext:Ljava/lang/String;

    :goto_0
    return-void
.end method

.method public setEventStatus(Lcom/ibotta/android/tracking/proprietary/event/enums/EventStatus;)V
    .locals 0

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    .line 395
    :cond_0
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/proprietary/event/enums/EventStatus;->toString()Ljava/lang/String;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->eventStatus:Ljava/lang/String;

    return-void
.end method

.method public setExitScreen(Ljava/lang/String;)V
    .locals 0

    .line 533
    iput-object p1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->exitScreen:Ljava/lang/String;

    return-void
.end method

.method public setHashCode(I)V
    .locals 0

    .line 100
    iput p1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->hashCode:I

    return-void
.end method

.method public setId(I)V
    .locals 0

    .line 96
    iput p1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->id:I

    return-void
.end method

.method public setListIndex(Ljava/lang/Integer;)V
    .locals 0

    .line 148
    iput-object p1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->listIndex:Ljava/lang/Integer;

    return-void
.end method

.method public setLocationPermissionStatus(Ljava/lang/String;)V
    .locals 0

    .line 475
    iput-object p1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->locationPermissionStatus:Ljava/lang/String;

    return-void
.end method

.method public setMessageData(Ljava/lang/String;)V
    .locals 0

    .line 565
    iput-object p1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->messageData:Ljava/lang/String;

    return-void
.end method

.method public setModuleId(Ljava/lang/Integer;)V
    .locals 0

    .line 124
    iput-object p1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->moduleId:Ljava/lang/Integer;

    return-void
.end method

.method public setModuleIndex(Ljava/lang/Integer;)V
    .locals 0

    .line 140
    iput-object p1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->moduleIndex:Ljava/lang/Integer;

    return-void
.end method

.method public setModuleName(Ljava/lang/String;)V
    .locals 0

    .line 132
    iput-object p1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->moduleName:Ljava/lang/String;

    return-void
.end method

.method public setNotificationId(Ljava/lang/Integer;)V
    .locals 0

    .line 541
    iput-object p1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->notificationId:Ljava/lang/Integer;

    return-void
.end method

.method public setNotificationText(Ljava/lang/String;)V
    .locals 0

    .line 509
    iput-object p1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->notificationText:Ljava/lang/String;

    return-void
.end method

.method public setNotificationType(Ljava/lang/String;)V
    .locals 0

    .line 517
    iput-object p1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->notificationType:Ljava/lang/String;

    return-void
.end method

.method public setOfferCategoryId(Ljava/lang/Integer;)V
    .locals 0

    .line 188
    iput-object p1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->offerCategoryId:Ljava/lang/Integer;

    return-void
.end method

.method public setOfferId(Ljava/lang/Integer;)V
    .locals 0

    .line 180
    iput-object p1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->offerId:Ljava/lang/Integer;

    return-void
.end method

.method public setOfferRewardId(Ljava/lang/Integer;)V
    .locals 0

    .line 196
    iput-object p1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->offerRewardId:Ljava/lang/Integer;

    return-void
.end method

.method public setOfferSegmentId(Ljava/lang/Integer;)V
    .locals 0

    .line 332
    iput-object p1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->offerSegmentId:Ljava/lang/Integer;

    return-void
.end method

.method public setProductId(Ljava/lang/String;)V
    .locals 0

    .line 236
    iput-object p1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->productId:Ljava/lang/String;

    return-void
.end method

.method public setPromoId(Ljava/lang/Integer;)V
    .locals 0

    .line 220
    iput-object p1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->promoId:Ljava/lang/Integer;

    return-void
.end method

.method public setPushPermissionStatus(Ljava/lang/String;)V
    .locals 0

    .line 483
    iput-object p1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->pushPermissionStatus:Ljava/lang/String;

    return-void
.end method

.method public setQuestName(Ljava/lang/String;)V
    .locals 0

    .line 423
    iput-object p1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->questName:Ljava/lang/String;

    return-void
.end method

.method public setQuestState(Ljava/lang/String;)V
    .locals 0

    .line 439
    iput-object p1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->questState:Ljava/lang/String;

    return-void
.end method

.method public setQuestStep(I)V
    .locals 0

    .line 431
    iput p1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->questStep:I

    return-void
.end method

.method public setReferralCode(Ljava/lang/String;)V
    .locals 0

    .line 316
    iput-object p1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->referralCode:Ljava/lang/String;

    return-void
.end method

.method public setReferrer(Ljava/lang/String;)V
    .locals 0

    .line 268
    iput-object p1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->referrer:Ljava/lang/String;

    return-void
.end method

.method public setRetailerCategoryId(Ljava/lang/Integer;)V
    .locals 0

    .line 212
    iput-object p1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->retailerCategoryId:Ljava/lang/Integer;

    return-void
.end method

.method public setRetailerId(Ljava/lang/Integer;)V
    .locals 0

    .line 172
    iput-object p1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->retailerId:Ljava/lang/Integer;

    return-void
.end method

.method public setSearchType(Ljava/lang/String;)V
    .locals 0

    .line 467
    iput-object p1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->searchType:Ljava/lang/String;

    return-void
.end method

.method public setStatus(Ljava/lang/String;)V
    .locals 0

    .line 557
    iput-object p1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->status:Ljava/lang/String;

    return-void
.end method

.method public setTerm(Ljava/lang/String;)V
    .locals 0

    .line 276
    iput-object p1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->term:Ljava/lang/String;

    return-void
.end method

.method public setTest(Ljava/lang/String;)V
    .locals 0

    .line 292
    iput-object p1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->test:Ljava/lang/String;

    return-void
.end method

.method public setThirdpartyId(Ljava/lang/String;)V
    .locals 0

    .line 308
    iput-object p1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->thirdpartyId:Ljava/lang/String;

    return-void
.end method

.method public setTileId(Ljava/lang/Integer;)V
    .locals 0

    .line 228
    iput-object p1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->tileId:Ljava/lang/Integer;

    return-void
.end method

.method public setUpc(Ljava/lang/String;)V
    .locals 0

    .line 284
    iput-object p1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->upc:Ljava/lang/String;

    return-void
.end method

.method public setVariant(Ljava/lang/String;)V
    .locals 0

    .line 300
    iput-object p1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->variant:Ljava/lang/String;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 749
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 751
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "["

    .line 752
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "eventContext="

    .line 753
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 754
    iget-object v1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->eventContext:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", retailerId="

    .line 755
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 756
    iget-object v1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->retailerId:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", offerId="

    .line 757
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 758
    iget-object v1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->offerId:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", offerCategoryId="

    .line 759
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 760
    iget-object v1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->offerCategoryId:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", offerRewardId="

    .line 761
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 762
    iget-object v1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->offerRewardId:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", bonusId="

    .line 763
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 764
    iget-object v1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->bonusId:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", retailerCategoryId="

    .line 765
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 766
    iget-object v1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->retailerCategoryId:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", promoId="

    .line 767
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 768
    iget-object v1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->promoId:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", tileId="

    .line 769
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 770
    iget-object v1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->tileId:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", productId="

    .line 771
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 772
    iget-object v1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->productId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", dealId="

    .line 773
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 774
    iget-object v1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->dealId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", moduleId="

    .line 775
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 776
    iget-object v1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->moduleId:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", moduleName="

    .line 777
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 778
    iget-object v1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->moduleName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", moduleIndex="

    .line 779
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 780
    iget-object v1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->moduleIndex:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", listIndex="

    .line 781
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 782
    iget-object v1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->listIndex:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", clicked="

    .line 783
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 784
    iget-boolean v1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->clicked:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", clickId="

    .line 785
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 786
    iget-object v1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->clickId:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", clickType="

    .line 787
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 788
    iget-object v1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->clickType:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", referrer="

    .line 789
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 790
    iget-object v1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->referrer:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", term="

    .line 791
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 792
    iget-object v1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->term:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", upc="

    .line 793
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 794
    iget-object v1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->upc:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", test="

    .line 795
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 796
    iget-object v1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->test:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", variant="

    .line 797
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 798
    iget-object v1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->variant:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", thirdPartyId="

    .line 799
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 800
    iget-object v1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->thirdpartyId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", referralCode="

    .line 801
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 802
    iget-object v1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->referralCode:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", appNames="

    .line 803
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 804
    iget-object v1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->appNames:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", offerSegmentId="

    .line 805
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 806
    iget-object v1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->offerSegmentId:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", eventAt="

    .line 807
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 808
    iget-wide v1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->eventAt:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", counter="

    .line 809
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 810
    iget v1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->counter:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", engaged="

    .line 811
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 812
    iget v1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->engaged:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", duration="

    .line 813
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 814
    iget-object v1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->duration:Ljava/lang/Float;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", eventStatus="

    .line 815
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 816
    iget-object v1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->eventStatus:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", questName="

    .line 817
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 818
    iget-object v1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->questName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", questState="

    .line 819
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 820
    iget-object v1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->questState:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", questStep="

    .line 821
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 822
    iget v1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->questStep:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", categoryId="

    .line 823
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 824
    iget v1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->categoryId:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", categoryType="

    .line 825
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 826
    iget-object v1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->categoryType:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", searchType="

    .line 827
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 828
    iget-object v1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->searchType:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", engagementId="

    .line 829
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 830
    iget-object v1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->engagementId:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", notificationText="

    .line 831
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 832
    iget-object v1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->notificationText:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", notificationType="

    .line 833
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 834
    iget-object v1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->notificationType:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", entryScreen="

    .line 835
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 836
    iget-object v1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->entryScreen:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", exitScreen="

    .line 837
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 838
    iget-object v1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->exitScreen:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", notificationId="

    .line 839
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 840
    iget-object v1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->notificationId:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", amount="

    .line 841
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 842
    iget v1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->amount:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", status="

    .line 843
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 844
    iget-object v1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->status:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", messageData="

    .line 845
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 846
    iget-object v1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->messageData:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", contextDetail="

    .line 847
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 848
    iget-object v1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->contextDetail:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", location_permission_status="

    .line 849
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 850
    iget-object v1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->locationPermissionStatus:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", push_permission_status="

    .line 851
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 852
    iget-object v1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->pushPermissionStatus:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "]"

    .line 853
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 855
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public abstract toTrackEvent()Lcom/ibotta/android/tracking/proprietary/event/TrackEvent;
.end method

.method public toTrackEvent(Lcom/ibotta/android/tracking/proprietary/event/TrackType;)Lcom/ibotta/android/tracking/proprietary/event/TrackEvent;
    .locals 4

    .line 690
    invoke-virtual {p0}, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->getClickTypeEnum()Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 691
    invoke-virtual {v0}, Lcom/ibotta/android/tracking/proprietary/event/enums/ClickType;->getTrackClickType()Lcom/ibotta/android/tracking/proprietary/event/TrackClickType;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 693
    :goto_0
    new-instance v1, Lcom/ibotta/android/tracking/proprietary/event/TrackEvent;

    invoke-direct {v1, p1}, Lcom/ibotta/android/tracking/proprietary/event/TrackEvent;-><init>(Lcom/ibotta/android/tracking/proprietary/event/TrackType;)V

    .line 694
    invoke-virtual {p0}, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->getEventContextEnum()Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;->getTrackContext()Lcom/ibotta/android/tracking/proprietary/event/enums/TrackContext;

    move-result-object p1

    invoke-virtual {v1, p1}, Lcom/ibotta/android/tracking/proprietary/event/TrackEvent;->setContext(Lcom/ibotta/android/tracking/proprietary/event/enums/TrackContext;)V

    .line 695
    iget-object p1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->retailerId:Ljava/lang/Integer;

    invoke-virtual {v1, p1}, Lcom/ibotta/android/tracking/proprietary/event/TrackEvent;->setRetailerId(Ljava/lang/Integer;)V

    .line 696
    iget-object p1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->offerId:Ljava/lang/Integer;

    invoke-virtual {v1, p1}, Lcom/ibotta/android/tracking/proprietary/event/TrackEvent;->setOfferId(Ljava/lang/Integer;)V

    .line 697
    iget-object p1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->offerCategoryId:Ljava/lang/Integer;

    invoke-virtual {v1, p1}, Lcom/ibotta/android/tracking/proprietary/event/TrackEvent;->setOfferCategoryId(Ljava/lang/Integer;)V

    .line 698
    iget-object p1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->offerRewardId:Ljava/lang/Integer;

    invoke-virtual {v1, p1}, Lcom/ibotta/android/tracking/proprietary/event/TrackEvent;->setOfferRewardId(Ljava/lang/Integer;)V

    .line 699
    iget-object p1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->bonusId:Ljava/lang/Integer;

    invoke-virtual {v1, p1}, Lcom/ibotta/android/tracking/proprietary/event/TrackEvent;->setBonusId(Ljava/lang/Integer;)V

    .line 700
    iget-object p1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->retailerCategoryId:Ljava/lang/Integer;

    invoke-virtual {v1, p1}, Lcom/ibotta/android/tracking/proprietary/event/TrackEvent;->setRetailerCategoryId(Ljava/lang/Integer;)V

    .line 701
    iget-object p1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->promoId:Ljava/lang/Integer;

    invoke-virtual {v1, p1}, Lcom/ibotta/android/tracking/proprietary/event/TrackEvent;->setPromoId(Ljava/lang/Integer;)V

    .line 702
    iget-object p1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->tileId:Ljava/lang/Integer;

    invoke-virtual {v1, p1}, Lcom/ibotta/android/tracking/proprietary/event/TrackEvent;->setTileId(Ljava/lang/Integer;)V

    .line 703
    iget-object p1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->productId:Ljava/lang/String;

    invoke-virtual {v1, p1}, Lcom/ibotta/android/tracking/proprietary/event/TrackEvent;->setProductId(Ljava/lang/String;)V

    .line 704
    iget-object p1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->dealId:Ljava/lang/String;

    invoke-virtual {v1, p1}, Lcom/ibotta/android/tracking/proprietary/event/TrackEvent;->setDealId(Ljava/lang/String;)V

    .line 705
    iget-object p1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->moduleId:Ljava/lang/Integer;

    invoke-virtual {v1, p1}, Lcom/ibotta/android/tracking/proprietary/event/TrackEvent;->setModuleId(Ljava/lang/Integer;)V

    .line 706
    iget-object p1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->moduleName:Ljava/lang/String;

    invoke-virtual {v1, p1}, Lcom/ibotta/android/tracking/proprietary/event/TrackEvent;->setModuleName(Ljava/lang/String;)V

    .line 707
    iget-object p1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->moduleIndex:Ljava/lang/Integer;

    invoke-virtual {v1, p1}, Lcom/ibotta/android/tracking/proprietary/event/TrackEvent;->setModuleIndex(Ljava/lang/Integer;)V

    .line 708
    iget-object p1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->listIndex:Ljava/lang/Integer;

    invoke-virtual {v1, p1}, Lcom/ibotta/android/tracking/proprietary/event/TrackEvent;->setListIndex(Ljava/lang/Integer;)V

    .line 709
    iget-boolean p1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->clicked:Z

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {v1, p1}, Lcom/ibotta/android/tracking/proprietary/event/TrackEvent;->setClicked(Ljava/lang/Boolean;)V

    .line 710
    iget-object p1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->clickId:Ljava/lang/Integer;

    invoke-virtual {v1, p1}, Lcom/ibotta/android/tracking/proprietary/event/TrackEvent;->setClickId(Ljava/lang/Integer;)V

    .line 711
    invoke-virtual {v1, v0}, Lcom/ibotta/android/tracking/proprietary/event/TrackEvent;->setClickType(Lcom/ibotta/android/tracking/proprietary/event/TrackClickType;)V

    .line 712
    iget-object p1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->referrer:Ljava/lang/String;

    invoke-virtual {v1, p1}, Lcom/ibotta/android/tracking/proprietary/event/TrackEvent;->setReferrer(Ljava/lang/String;)V

    .line 713
    iget-object p1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->term:Ljava/lang/String;

    invoke-virtual {v1, p1}, Lcom/ibotta/android/tracking/proprietary/event/TrackEvent;->setTerm(Ljava/lang/String;)V

    .line 714
    iget-object p1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->upc:Ljava/lang/String;

    invoke-virtual {v1, p1}, Lcom/ibotta/android/tracking/proprietary/event/TrackEvent;->setUpc(Ljava/lang/String;)V

    .line 715
    iget-object p1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->test:Ljava/lang/String;

    invoke-virtual {v1, p1}, Lcom/ibotta/android/tracking/proprietary/event/TrackEvent;->setTest(Ljava/lang/String;)V

    .line 716
    iget-object p1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->variant:Ljava/lang/String;

    invoke-virtual {v1, p1}, Lcom/ibotta/android/tracking/proprietary/event/TrackEvent;->setVariant(Ljava/lang/String;)V

    .line 717
    iget-object p1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->thirdpartyId:Ljava/lang/String;

    invoke-virtual {v1, p1}, Lcom/ibotta/android/tracking/proprietary/event/TrackEvent;->setThirdpartyId(Ljava/lang/String;)V

    .line 718
    iget-object p1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->referralCode:Ljava/lang/String;

    invoke-virtual {v1, p1}, Lcom/ibotta/android/tracking/proprietary/event/TrackEvent;->setReferralCode(Ljava/lang/String;)V

    .line 719
    invoke-direct {p0}, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->getAppNamesMaps()Ljava/util/List;

    move-result-object p1

    invoke-virtual {v1, p1}, Lcom/ibotta/android/tracking/proprietary/event/TrackEvent;->setAppNames(Ljava/util/List;)V

    .line 720
    iget-object p1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->offerSegmentId:Ljava/lang/Integer;

    invoke-virtual {v1, p1}, Lcom/ibotta/android/tracking/proprietary/event/TrackEvent;->setOfferSegmentId(Ljava/lang/Integer;)V

    .line 721
    new-instance p1, Ljava/util/Date;

    iget-wide v2, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->eventAt:J

    invoke-direct {p1, v2, v3}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v1, p1}, Lcom/ibotta/android/tracking/proprietary/event/TrackEvent;->setEventAt(Ljava/util/Date;)V

    .line 722
    iget p1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->counter:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v1, p1}, Lcom/ibotta/android/tracking/proprietary/event/TrackEvent;->setCounter(Ljava/lang/Integer;)V

    .line 723
    iget p1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->engaged:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v1, p1}, Lcom/ibotta/android/tracking/proprietary/event/TrackEvent;->setEngaged(Ljava/lang/Integer;)V

    .line 724
    iget-object p1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->duration:Ljava/lang/Float;

    invoke-virtual {v1, p1}, Lcom/ibotta/android/tracking/proprietary/event/TrackEvent;->setDuration(Ljava/lang/Float;)V

    .line 725
    iget-object p1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->questName:Ljava/lang/String;

    invoke-virtual {v1, p1}, Lcom/ibotta/android/tracking/proprietary/event/TrackEvent;->setQuestName(Ljava/lang/String;)V

    .line 726
    iget-object p1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->questState:Ljava/lang/String;

    invoke-virtual {v1, p1}, Lcom/ibotta/android/tracking/proprietary/event/TrackEvent;->setQuestState(Ljava/lang/String;)V

    .line 727
    iget p1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->questStep:I

    invoke-virtual {v1, p1}, Lcom/ibotta/android/tracking/proprietary/event/TrackEvent;->setQuestStep(I)V

    .line 728
    iget p1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->categoryId:I

    invoke-virtual {v1, p1}, Lcom/ibotta/android/tracking/proprietary/event/TrackEvent;->setCategoryId(I)V

    .line 729
    iget-object p1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->categoryType:Ljava/lang/String;

    invoke-virtual {v1, p1}, Lcom/ibotta/android/tracking/proprietary/event/TrackEvent;->setCategoryType(Ljava/lang/String;)V

    .line 730
    iget-object p1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->searchType:Ljava/lang/String;

    invoke-virtual {v1, p1}, Lcom/ibotta/android/tracking/proprietary/event/TrackEvent;->setSearchType(Ljava/lang/String;)V

    .line 731
    iget-object p1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->engagementId:Ljava/lang/Long;

    invoke-virtual {v1, p1}, Lcom/ibotta/android/tracking/proprietary/event/TrackEvent;->setEngagementId(Ljava/lang/Long;)V

    .line 732
    iget-object p1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->notificationText:Ljava/lang/String;

    invoke-virtual {v1, p1}, Lcom/ibotta/android/tracking/proprietary/event/TrackEvent;->setNotificationText(Ljava/lang/String;)V

    .line 733
    iget-object p1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->notificationType:Ljava/lang/String;

    invoke-virtual {v1, p1}, Lcom/ibotta/android/tracking/proprietary/event/TrackEvent;->setNotificationType(Ljava/lang/String;)V

    .line 734
    iget-object p1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->entryScreen:Ljava/lang/String;

    invoke-virtual {v1, p1}, Lcom/ibotta/android/tracking/proprietary/event/TrackEvent;->setEntryScreen(Ljava/lang/String;)V

    .line 735
    iget-object p1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->exitScreen:Ljava/lang/String;

    invoke-virtual {v1, p1}, Lcom/ibotta/android/tracking/proprietary/event/TrackEvent;->setExitScreen(Ljava/lang/String;)V

    .line 736
    iget-object p1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->notificationId:Ljava/lang/Integer;

    invoke-virtual {v1, p1}, Lcom/ibotta/android/tracking/proprietary/event/TrackEvent;->setNotificationId(Ljava/lang/Integer;)V

    .line 737
    iget p1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->amount:F

    invoke-virtual {v1, p1}, Lcom/ibotta/android/tracking/proprietary/event/TrackEvent;->setAmount(F)V

    .line 738
    iget-object p1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->status:Ljava/lang/String;

    invoke-virtual {v1, p1}, Lcom/ibotta/android/tracking/proprietary/event/TrackEvent;->setStatus(Ljava/lang/String;)V

    .line 739
    iget-object p1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->messageData:Ljava/lang/String;

    invoke-virtual {v1, p1}, Lcom/ibotta/android/tracking/proprietary/event/TrackEvent;->setMessageData(Ljava/lang/String;)V

    .line 740
    iget-object p1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->contextDetail:Ljava/lang/String;

    invoke-virtual {v1, p1}, Lcom/ibotta/android/tracking/proprietary/event/TrackEvent;->setContextDetail(Ljava/lang/String;)V

    .line 741
    iget-object p1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->locationPermissionStatus:Ljava/lang/String;

    invoke-virtual {v1, p1}, Lcom/ibotta/android/tracking/proprietary/event/TrackEvent;->setLocationPermissionStatus(Ljava/lang/String;)V

    .line 742
    iget-object p1, p0, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->pushPermissionStatus:Ljava/lang/String;

    invoke-virtual {v1, p1}, Lcom/ibotta/android/tracking/proprietary/event/TrackEvent;->setPushPermissionStatus(Ljava/lang/String;)V

    return-object v1
.end method
