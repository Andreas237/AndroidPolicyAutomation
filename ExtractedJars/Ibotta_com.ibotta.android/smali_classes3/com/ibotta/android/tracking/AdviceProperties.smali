.class public abstract Lcom/ibotta/android/tracking/AdviceProperties;
.super Ljava/lang/Object;
.source "AdviceProperties.java"

# interfaces
.implements Lcom/ibotta/android/tracking/content/TrackingPayload;


# annotations
.annotation build Lcom/google/auto/value/AutoValue;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/tracking/AdviceProperties$Builder;
    }
.end annotation


# static fields
.field public static final EMPTY:Lcom/ibotta/android/tracking/AdviceProperties;

.field public static final NO_TRACKING:Lcom/ibotta/android/tracking/AdviceProperties;


# instance fields
.field private properties:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 14
    invoke-static {}, Lcom/ibotta/android/tracking/AdviceProperties;->builder()Lcom/ibotta/android/tracking/AdviceProperties$Builder;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/AdviceProperties$Builder;->event(Ljava/lang/String;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/AdviceProperties$Builder;->noTracking(Z)Lcom/ibotta/android/tracking/AdviceProperties$Builder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/tracking/AdviceProperties$Builder;->build()Lcom/ibotta/android/tracking/AdviceProperties;

    move-result-object v0

    sput-object v0, Lcom/ibotta/android/tracking/AdviceProperties;->NO_TRACKING:Lcom/ibotta/android/tracking/AdviceProperties;

    .line 15
    invoke-static {}, Lcom/ibotta/android/tracking/AdviceProperties;->builder()Lcom/ibotta/android/tracking/AdviceProperties$Builder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/tracking/AdviceProperties$Builder;->build()Lcom/ibotta/android/tracking/AdviceProperties;

    move-result-object v0

    sput-object v0, Lcom/ibotta/android/tracking/AdviceProperties;->EMPTY:Lcom/ibotta/android/tracking/AdviceProperties;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/tracking/AdviceProperties;->properties:Ljava/util/Map;

    return-void
.end method

.method private addNonNullValue(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1
    .param p2    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "TT;)V"
        }
    .end annotation

    if-eqz p2, :cond_0

    .line 124
    iget-object v0, p0, Lcom/ibotta/android/tracking/AdviceProperties;->properties:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public static builder()Lcom/ibotta/android/tracking/AdviceProperties$Builder;
    .locals 2

    .line 131
    new-instance v0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties$Builder;

    invoke-direct {v0}, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties$Builder;-><init>()V

    const-string v1, ""

    .line 132
    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties$Builder;->event(Ljava/lang/String;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;

    move-result-object v0

    const/4 v1, 0x0

    .line 133
    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/AdviceProperties$Builder;->noTracking(Z)Lcom/ibotta/android/tracking/AdviceProperties$Builder;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public abstract getActionType()Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract getActivatedRetailerId()Ljava/lang/Integer;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract getButtonText()Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract getCameFromCreateFlow()Ljava/lang/Boolean;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract getCardType()Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract getClickId()Ljava/lang/Integer;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract getClickName()Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract getClickType()Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract getContext()Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract getCorrectExpectedQuantity()Ljava/lang/Boolean;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract getCustomerId()Ljava/lang/Integer;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract getDealId()Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract getDuration()Ljava/lang/Long;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract getEngagementId()Ljava/lang/Long;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract getErrorCode()Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract getEvent()Ljava/lang/String;
.end method

.method public abstract getEventAt()Ljava/lang/Long;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract getEventEnd()Ljava/lang/Long;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract getEventStart()Ljava/lang/Long;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract getFailureMessage()Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract getFirstView()Ljava/lang/Boolean;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract getIsFirstTimePaymentCard()Ljava/lang/Boolean;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract getIsSpent()Ljava/lang/Boolean;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract getIsSuccessfulAuth()Ljava/lang/Boolean;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract getListIndex()Ljava/lang/Integer;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract getMatched()Ljava/lang/Boolean;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract getNativeScreenName()Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract getNetworkCode()Ljava/lang/Integer;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract getNewValue()Ljava/lang/Boolean;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract getOfferAmountType()Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract getOfferId()Ljava/lang/Integer;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract getOldValue()Ljava/lang/Boolean;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract getPaymentAmount()Ljava/lang/Float;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract getPaymentId()Ljava/lang/Integer;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract getPaymentOptionType()Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract getPreferenceName()Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract getProductId()Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public getProperties()Ljava/util/Map;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    const-string v0, "action_type"

    .line 20
    invoke-virtual {p0}, Lcom/ibotta/android/tracking/AdviceProperties;->getActionType()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/ibotta/android/tracking/AdviceProperties;->addNonNullValue(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "activated_retailer_id"

    .line 21
    invoke-virtual {p0}, Lcom/ibotta/android/tracking/AdviceProperties;->getActivatedRetailerId()Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/ibotta/android/tracking/AdviceProperties;->addNonNullValue(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "button_text"

    .line 22
    invoke-virtual {p0}, Lcom/ibotta/android/tracking/AdviceProperties;->getButtonText()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/ibotta/android/tracking/AdviceProperties;->addNonNullValue(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "came_from_create"

    .line 23
    invoke-virtual {p0}, Lcom/ibotta/android/tracking/AdviceProperties;->getCameFromCreateFlow()Ljava/lang/Boolean;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/ibotta/android/tracking/AdviceProperties;->addNonNullValue(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "card_type"

    .line 24
    invoke-virtual {p0}, Lcom/ibotta/android/tracking/AdviceProperties;->getCardType()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/ibotta/android/tracking/AdviceProperties;->addNonNullValue(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "click_id"

    .line 25
    invoke-virtual {p0}, Lcom/ibotta/android/tracking/AdviceProperties;->getClickId()Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/ibotta/android/tracking/AdviceProperties;->addNonNullValue(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "click_name"

    .line 26
    invoke-virtual {p0}, Lcom/ibotta/android/tracking/AdviceProperties;->getClickName()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/ibotta/android/tracking/AdviceProperties;->addNonNullValue(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "click_type"

    .line 27
    invoke-virtual {p0}, Lcom/ibotta/android/tracking/AdviceProperties;->getClickType()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/ibotta/android/tracking/AdviceProperties;->addNonNullValue(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "context"

    .line 28
    invoke-virtual {p0}, Lcom/ibotta/android/tracking/AdviceProperties;->getContext()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/ibotta/android/tracking/AdviceProperties;->addNonNullValue(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "correct_expected_quantity"

    .line 29
    invoke-virtual {p0}, Lcom/ibotta/android/tracking/AdviceProperties;->getCorrectExpectedQuantity()Ljava/lang/Boolean;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/ibotta/android/tracking/AdviceProperties;->addNonNullValue(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "customer_id"

    .line 30
    invoke-virtual {p0}, Lcom/ibotta/android/tracking/AdviceProperties;->getCustomerId()Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/ibotta/android/tracking/AdviceProperties;->addNonNullValue(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "deal_id"

    .line 31
    invoke-virtual {p0}, Lcom/ibotta/android/tracking/AdviceProperties;->getDealId()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/ibotta/android/tracking/AdviceProperties;->addNonNullValue(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "duration"

    .line 32
    invoke-virtual {p0}, Lcom/ibotta/android/tracking/AdviceProperties;->getDuration()Ljava/lang/Long;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/ibotta/android/tracking/AdviceProperties;->addNonNullValue(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "engagement_id"

    .line 33
    invoke-virtual {p0}, Lcom/ibotta/android/tracking/AdviceProperties;->getEngagementId()Ljava/lang/Long;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/ibotta/android/tracking/AdviceProperties;->addNonNullValue(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "error_code"

    .line 34
    invoke-virtual {p0}, Lcom/ibotta/android/tracking/AdviceProperties;->getErrorCode()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/ibotta/android/tracking/AdviceProperties;->addNonNullValue(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "event_at"

    .line 35
    invoke-virtual {p0}, Lcom/ibotta/android/tracking/AdviceProperties;->getEventAt()Ljava/lang/Long;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/ibotta/android/tracking/AdviceProperties;->addNonNullValue(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "event_start"

    .line 36
    invoke-virtual {p0}, Lcom/ibotta/android/tracking/AdviceProperties;->getEventStart()Ljava/lang/Long;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/ibotta/android/tracking/AdviceProperties;->addNonNullValue(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "event_end"

    .line 37
    invoke-virtual {p0}, Lcom/ibotta/android/tracking/AdviceProperties;->getEventEnd()Ljava/lang/Long;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/ibotta/android/tracking/AdviceProperties;->addNonNullValue(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "failure_code"

    .line 38
    invoke-virtual {p0}, Lcom/ibotta/android/tracking/AdviceProperties;->getFailureMessage()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/ibotta/android/tracking/AdviceProperties;->addNonNullValue(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "first_view"

    .line 39
    invoke-virtual {p0}, Lcom/ibotta/android/tracking/AdviceProperties;->getFirstView()Ljava/lang/Boolean;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/ibotta/android/tracking/AdviceProperties;->addNonNullValue(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "is_first_time_payment_card"

    .line 40
    invoke-virtual {p0}, Lcom/ibotta/android/tracking/AdviceProperties;->getIsFirstTimePaymentCard()Ljava/lang/Boolean;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/ibotta/android/tracking/AdviceProperties;->addNonNullValue(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "is_spent"

    .line 41
    invoke-virtual {p0}, Lcom/ibotta/android/tracking/AdviceProperties;->getIsSpent()Ljava/lang/Boolean;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/ibotta/android/tracking/AdviceProperties;->addNonNullValue(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "is_successful_auth"

    .line 42
    invoke-virtual {p0}, Lcom/ibotta/android/tracking/AdviceProperties;->getIsSuccessfulAuth()Ljava/lang/Boolean;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/ibotta/android/tracking/AdviceProperties;->addNonNullValue(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "list_index"

    .line 43
    invoke-virtual {p0}, Lcom/ibotta/android/tracking/AdviceProperties;->getListIndex()Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/ibotta/android/tracking/AdviceProperties;->addNonNullValue(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "matched"

    .line 44
    invoke-virtual {p0}, Lcom/ibotta/android/tracking/AdviceProperties;->getMatched()Ljava/lang/Boolean;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/ibotta/android/tracking/AdviceProperties;->addNonNullValue(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "native_screen_name"

    .line 45
    invoke-virtual {p0}, Lcom/ibotta/android/tracking/AdviceProperties;->getNativeScreenName()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/ibotta/android/tracking/AdviceProperties;->addNonNullValue(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "network_code"

    .line 46
    invoke-virtual {p0}, Lcom/ibotta/android/tracking/AdviceProperties;->getNetworkCode()Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/ibotta/android/tracking/AdviceProperties;->addNonNullValue(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "new_value"

    .line 47
    invoke-virtual {p0}, Lcom/ibotta/android/tracking/AdviceProperties;->getNewValue()Ljava/lang/Boolean;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/ibotta/android/tracking/AdviceProperties;->addNonNullValue(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "offer_amount_type"

    .line 48
    invoke-virtual {p0}, Lcom/ibotta/android/tracking/AdviceProperties;->getOfferAmountType()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/ibotta/android/tracking/AdviceProperties;->addNonNullValue(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "offer_id"

    .line 49
    invoke-virtual {p0}, Lcom/ibotta/android/tracking/AdviceProperties;->getOfferId()Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/ibotta/android/tracking/AdviceProperties;->addNonNullValue(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "old_value"

    .line 50
    invoke-virtual {p0}, Lcom/ibotta/android/tracking/AdviceProperties;->getOldValue()Ljava/lang/Boolean;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/ibotta/android/tracking/AdviceProperties;->addNonNullValue(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "payment_amount"

    .line 51
    invoke-virtual {p0}, Lcom/ibotta/android/tracking/AdviceProperties;->getPaymentAmount()Ljava/lang/Float;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/ibotta/android/tracking/AdviceProperties;->addNonNullValue(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "payment_id"

    .line 52
    invoke-virtual {p0}, Lcom/ibotta/android/tracking/AdviceProperties;->getPaymentId()Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/ibotta/android/tracking/AdviceProperties;->addNonNullValue(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "payment_option_type"

    .line 53
    invoke-virtual {p0}, Lcom/ibotta/android/tracking/AdviceProperties;->getPaymentOptionType()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/ibotta/android/tracking/AdviceProperties;->addNonNullValue(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "preference_name"

    .line 54
    invoke-virtual {p0}, Lcom/ibotta/android/tracking/AdviceProperties;->getPreferenceName()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/ibotta/android/tracking/AdviceProperties;->addNonNullValue(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "product_id"

    .line 55
    invoke-virtual {p0}, Lcom/ibotta/android/tracking/AdviceProperties;->getProductId()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/ibotta/android/tracking/AdviceProperties;->addNonNullValue(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "expected_quantity"

    .line 56
    invoke-virtual {p0}, Lcom/ibotta/android/tracking/AdviceProperties;->getReceiptExpectedQuantity()Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/ibotta/android/tracking/AdviceProperties;->addNonNullValue(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "submitted_quantity"

    .line 57
    invoke-virtual {p0}, Lcom/ibotta/android/tracking/AdviceProperties;->getReceiptSubmittedQuantity()Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/ibotta/android/tracking/AdviceProperties;->addNonNullValue(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "redeem_type"

    .line 58
    invoke-virtual {p0}, Lcom/ibotta/android/tracking/AdviceProperties;->getRedeemType()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/ibotta/android/tracking/AdviceProperties;->addNonNullValue(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "retailer_id"

    .line 59
    invoke-virtual {p0}, Lcom/ibotta/android/tracking/AdviceProperties;->getRetailerId()Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/ibotta/android/tracking/AdviceProperties;->addNonNullValue(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "retailer_name"

    .line 60
    invoke-virtual {p0}, Lcom/ibotta/android/tracking/AdviceProperties;->getRetailerName()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/ibotta/android/tracking/AdviceProperties;->addNonNullValue(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "reward_amount"

    .line 61
    invoke-virtual {p0}, Lcom/ibotta/android/tracking/AdviceProperties;->getRewardAmount()Ljava/lang/Float;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/ibotta/android/tracking/AdviceProperties;->addNonNullValue(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "screen_name"

    .line 62
    invoke-virtual {p0}, Lcom/ibotta/android/tracking/AdviceProperties;->getScreenName()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/ibotta/android/tracking/AdviceProperties;->addNonNullValue(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "shared_history"

    .line 63
    invoke-virtual {p0}, Lcom/ibotta/android/tracking/AdviceProperties;->getSharedHistory()Ljava/lang/Boolean;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/ibotta/android/tracking/AdviceProperties;->addNonNullValue(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "type"

    .line 64
    invoke-virtual {p0}, Lcom/ibotta/android/tracking/AdviceProperties;->getType()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/ibotta/android/tracking/AdviceProperties;->addNonNullValue(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "upc"

    .line 65
    invoke-virtual {p0}, Lcom/ibotta/android/tracking/AdviceProperties;->getUpc()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/ibotta/android/tracking/AdviceProperties;->addNonNullValue(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "value"

    .line 66
    invoke-virtual {p0}, Lcom/ibotta/android/tracking/AdviceProperties;->getValue()Ljava/lang/Long;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/ibotta/android/tracking/AdviceProperties;->addNonNullValue(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "wallet_type"

    .line 67
    invoke-virtual {p0}, Lcom/ibotta/android/tracking/AdviceProperties;->getWalletType()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/ibotta/android/tracking/AdviceProperties;->addNonNullValue(Ljava/lang/String;Ljava/lang/Object;)V

    .line 68
    iget-object v0, p0, Lcom/ibotta/android/tracking/AdviceProperties;->properties:Ljava/util/Map;

    return-object v0
.end method

.method public abstract getReceiptExpectedQuantity()Ljava/lang/Integer;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract getReceiptSubmittedQuantity()Ljava/lang/Integer;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract getRedeemType()Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract getRetailerId()Ljava/lang/Integer;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract getRetailerName()Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract getRewardAmount()Ljava/lang/Float;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract getScreenName()Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract getSharedHistory()Ljava/lang/Boolean;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract getType()Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract getUpc()Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract getValue()Ljava/lang/Long;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract getWalletType()Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract toBuilder()Lcom/ibotta/android/tracking/AdviceProperties$Builder;
.end method
