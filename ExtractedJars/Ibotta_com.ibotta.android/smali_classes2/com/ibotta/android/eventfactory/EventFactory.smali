.class public Lcom/ibotta/android/eventfactory/EventFactory;
.super Ljava/lang/Object;
.source "EventFactory.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public createAccountEvent()Lcom/ibotta/android/tracking/proprietary/event/AccountEvent;
    .locals 1

    .line 30
    new-instance v0, Lcom/ibotta/android/tracking/proprietary/event/AccountEvent;

    invoke-direct {v0}, Lcom/ibotta/android/tracking/proprietary/event/AccountEvent;-><init>()V

    return-object v0
.end method

.method public createBonusEvent()Lcom/ibotta/android/tracking/proprietary/event/BonusEvent;
    .locals 1

    .line 34
    new-instance v0, Lcom/ibotta/android/tracking/proprietary/event/BonusEvent;

    invoke-direct {v0}, Lcom/ibotta/android/tracking/proprietary/event/BonusEvent;-><init>()V

    return-object v0
.end method

.method public createCategoryEvent()Lcom/ibotta/android/tracking/proprietary/event/CategoryEvent;
    .locals 1

    .line 38
    new-instance v0, Lcom/ibotta/android/tracking/proprietary/event/CategoryEvent;

    invoke-direct {v0}, Lcom/ibotta/android/tracking/proprietary/event/CategoryEvent;-><init>()V

    return-object v0
.end method

.method public createDealEvent()Lcom/ibotta/android/tracking/proprietary/event/DealEvent;
    .locals 1

    .line 42
    new-instance v0, Lcom/ibotta/android/tracking/proprietary/event/DealEvent;

    invoke-direct {v0}, Lcom/ibotta/android/tracking/proprietary/event/DealEvent;-><init>()V

    return-object v0
.end method

.method public createDeeplinkEvent()Lcom/ibotta/android/tracking/proprietary/event/DeeplinkEvent;
    .locals 1

    .line 46
    new-instance v0, Lcom/ibotta/android/tracking/proprietary/event/DeeplinkEvent;

    invoke-direct {v0}, Lcom/ibotta/android/tracking/proprietary/event/DeeplinkEvent;-><init>()V

    return-object v0
.end method

.method public createLaunchAppEvent()Lcom/ibotta/android/tracking/proprietary/event/LaunchAppEvent;
    .locals 1

    .line 50
    new-instance v0, Lcom/ibotta/android/tracking/proprietary/event/LaunchAppEvent;

    invoke-direct {v0}, Lcom/ibotta/android/tracking/proprietary/event/LaunchAppEvent;-><init>()V

    return-object v0
.end method

.method public createModuleEvent()Lcom/ibotta/android/tracking/proprietary/event/ModuleEvent;
    .locals 1

    .line 54
    new-instance v0, Lcom/ibotta/android/tracking/proprietary/event/ModuleEvent;

    invoke-direct {v0}, Lcom/ibotta/android/tracking/proprietary/event/ModuleEvent;-><init>()V

    return-object v0
.end method

.method public createMyEarningsEvent()Lcom/ibotta/android/tracking/proprietary/event/MyEarningsEvent;
    .locals 1

    .line 58
    new-instance v0, Lcom/ibotta/android/tracking/proprietary/event/MyEarningsEvent;

    invoke-direct {v0}, Lcom/ibotta/android/tracking/proprietary/event/MyEarningsEvent;-><init>()V

    return-object v0
.end method

.method public createNotificationEvent()Lcom/ibotta/android/tracking/proprietary/event/NotificationEvent;
    .locals 1

    .line 62
    new-instance v0, Lcom/ibotta/android/tracking/proprietary/event/NotificationEvent;

    invoke-direct {v0}, Lcom/ibotta/android/tracking/proprietary/event/NotificationEvent;-><init>()V

    return-object v0
.end method

.method public createOfferEvent()Lcom/ibotta/android/tracking/proprietary/event/OfferEvent;
    .locals 1

    .line 66
    new-instance v0, Lcom/ibotta/android/tracking/proprietary/event/OfferEvent;

    invoke-direct {v0}, Lcom/ibotta/android/tracking/proprietary/event/OfferEvent;-><init>()V

    return-object v0
.end method

.method public createPartnerAppEvent()Lcom/ibotta/android/tracking/proprietary/event/PartnerAppEvent;
    .locals 1

    .line 70
    new-instance v0, Lcom/ibotta/android/tracking/proprietary/event/PartnerAppEvent;

    invoke-direct {v0}, Lcom/ibotta/android/tracking/proprietary/event/PartnerAppEvent;-><init>()V

    return-object v0
.end method

.method public createProductEvent()Lcom/ibotta/android/tracking/proprietary/event/ProductEvent;
    .locals 1

    .line 74
    new-instance v0, Lcom/ibotta/android/tracking/proprietary/event/ProductEvent;

    invoke-direct {v0}, Lcom/ibotta/android/tracking/proprietary/event/ProductEvent;-><init>()V

    return-object v0
.end method

.method public createPromoEvent()Lcom/ibotta/android/tracking/proprietary/event/PromoEvent;
    .locals 1

    .line 78
    new-instance v0, Lcom/ibotta/android/tracking/proprietary/event/PromoEvent;

    invoke-direct {v0}, Lcom/ibotta/android/tracking/proprietary/event/PromoEvent;-><init>()V

    return-object v0
.end method

.method public createQuestEvent()Lcom/ibotta/android/tracking/proprietary/event/QuestEvent;
    .locals 1

    .line 82
    new-instance v0, Lcom/ibotta/android/tracking/proprietary/event/QuestEvent;

    invoke-direct {v0}, Lcom/ibotta/android/tracking/proprietary/event/QuestEvent;-><init>()V

    return-object v0
.end method

.method public createRegistrationEvent()Lcom/ibotta/android/tracking/proprietary/event/RegistrationEvent;
    .locals 1

    .line 86
    new-instance v0, Lcom/ibotta/android/tracking/proprietary/event/RegistrationEvent;

    invoke-direct {v0}, Lcom/ibotta/android/tracking/proprietary/event/RegistrationEvent;-><init>()V

    return-object v0
.end method

.method public createRetailerEvent()Lcom/ibotta/android/tracking/proprietary/event/RetailerEvent;
    .locals 1

    .line 90
    new-instance v0, Lcom/ibotta/android/tracking/proprietary/event/RetailerEvent;

    invoke-direct {v0}, Lcom/ibotta/android/tracking/proprietary/event/RetailerEvent;-><init>()V

    return-object v0
.end method

.method public createRewardEvent()Lcom/ibotta/android/tracking/proprietary/event/RewardEvent;
    .locals 1

    .line 94
    new-instance v0, Lcom/ibotta/android/tracking/proprietary/event/RewardEvent;

    invoke-direct {v0}, Lcom/ibotta/android/tracking/proprietary/event/RewardEvent;-><init>()V

    return-object v0
.end method

.method public createSearchEvent()Lcom/ibotta/android/tracking/proprietary/event/SearchEvent;
    .locals 1

    .line 98
    new-instance v0, Lcom/ibotta/android/tracking/proprietary/event/SearchEvent;

    invoke-direct {v0}, Lcom/ibotta/android/tracking/proprietary/event/SearchEvent;-><init>()V

    return-object v0
.end method

.method public createSessionEvent()Lcom/ibotta/android/tracking/proprietary/event/SessionEvent;
    .locals 1

    .line 102
    new-instance v0, Lcom/ibotta/android/tracking/proprietary/event/SessionEvent;

    invoke-direct {v0}, Lcom/ibotta/android/tracking/proprietary/event/SessionEvent;-><init>()V

    return-object v0
.end method

.method public createSettingsEvent()Lcom/ibotta/android/tracking/proprietary/event/SettingsEvent;
    .locals 1

    .line 106
    new-instance v0, Lcom/ibotta/android/tracking/proprietary/event/SettingsEvent;

    invoke-direct {v0}, Lcom/ibotta/android/tracking/proprietary/event/SettingsEvent;-><init>()V

    return-object v0
.end method

.method public createTileEvent()Lcom/ibotta/android/tracking/proprietary/event/TileEvent;
    .locals 1

    .line 110
    new-instance v0, Lcom/ibotta/android/tracking/proprietary/event/TileEvent;

    invoke-direct {v0}, Lcom/ibotta/android/tracking/proprietary/event/TileEvent;-><init>()V

    return-object v0
.end method
