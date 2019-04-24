.class public abstract Lcom/ibotta/android/tracking/AdviceProperties$Builder;
.super Ljava/lang/Object;
.source "AdviceProperties.java"


# annotations
.annotation build Lcom/google/auto/value/AutoValue$Builder;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/tracking/AdviceProperties;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "Builder"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 137
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract actionType(Ljava/lang/String;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
.end method

.method public abstract activatedRetailerId(Ljava/lang/Integer;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;
    .param p1    # Ljava/lang/Integer;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
.end method

.method public abstract build()Lcom/ibotta/android/tracking/AdviceProperties;
.end method

.method public abstract buttonText(Ljava/lang/String;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
.end method

.method public abstract cameFromCreateFlow(Ljava/lang/Boolean;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;
    .param p1    # Ljava/lang/Boolean;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
.end method

.method public abstract cardType(Ljava/lang/String;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
.end method

.method public abstract clickId(Ljava/lang/Integer;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;
    .param p1    # Ljava/lang/Integer;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
.end method

.method public abstract clickName(Ljava/lang/String;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
.end method

.method public abstract clickType(Ljava/lang/String;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
.end method

.method public abstract context(Ljava/lang/String;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
.end method

.method public abstract correctExpectedQuantity(Ljava/lang/Boolean;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;
    .param p1    # Ljava/lang/Boolean;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
.end method

.method public abstract customerId(Ljava/lang/Integer;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;
    .param p1    # Ljava/lang/Integer;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
.end method

.method public abstract dealId(Ljava/lang/String;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
.end method

.method public abstract duration(Ljava/lang/Long;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;
    .param p1    # Ljava/lang/Long;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
.end method

.method public abstract engagementId(Ljava/lang/Long;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;
    .param p1    # Ljava/lang/Long;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
.end method

.method public abstract errorCode(Ljava/lang/String;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
.end method

.method public abstract event(Ljava/lang/String;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;
.end method

.method public abstract eventAt(Ljava/lang/Long;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;
    .param p1    # Ljava/lang/Long;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
.end method

.method public abstract eventEnd(Ljava/lang/Long;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;
    .param p1    # Ljava/lang/Long;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
.end method

.method public abstract eventStart(Ljava/lang/Long;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;
    .param p1    # Ljava/lang/Long;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
.end method

.method public abstract failureMessage(Ljava/lang/String;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
.end method

.method public abstract firstView(Ljava/lang/Boolean;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;
    .param p1    # Ljava/lang/Boolean;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
.end method

.method public abstract isFirstTimePaymentCard(Ljava/lang/Boolean;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;
    .param p1    # Ljava/lang/Boolean;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
.end method

.method public abstract isSpent(Ljava/lang/Boolean;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;
    .param p1    # Ljava/lang/Boolean;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
.end method

.method public abstract isSuccessfulAuth(Ljava/lang/Boolean;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;
    .param p1    # Ljava/lang/Boolean;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
.end method

.method public abstract listIndex(Ljava/lang/Integer;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;
    .param p1    # Ljava/lang/Integer;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
.end method

.method public abstract matched(Ljava/lang/Boolean;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;
    .param p1    # Ljava/lang/Boolean;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
.end method

.method public abstract nativeScreenName(Ljava/lang/String;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
.end method

.method public abstract networkCode(Ljava/lang/Integer;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;
    .param p1    # Ljava/lang/Integer;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
.end method

.method public abstract newValue(Ljava/lang/Boolean;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;
    .param p1    # Ljava/lang/Boolean;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
.end method

.method protected abstract noTracking(Z)Lcom/ibotta/android/tracking/AdviceProperties$Builder;
.end method

.method public abstract offerAmountType(Ljava/lang/String;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
.end method

.method public abstract offerId(Ljava/lang/Integer;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;
    .param p1    # Ljava/lang/Integer;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
.end method

.method public abstract oldValue(Ljava/lang/Boolean;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;
    .param p1    # Ljava/lang/Boolean;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
.end method

.method public abstract paymentAmount(Ljava/lang/Float;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;
    .param p1    # Ljava/lang/Float;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
.end method

.method public abstract paymentId(Ljava/lang/Integer;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;
    .param p1    # Ljava/lang/Integer;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
.end method

.method public abstract paymentOptionType(Ljava/lang/String;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
.end method

.method public abstract preferenceName(Ljava/lang/String;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
.end method

.method public abstract productId(Ljava/lang/String;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
.end method

.method public abstract receiptExpectedQuantity(Ljava/lang/Integer;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;
    .param p1    # Ljava/lang/Integer;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
.end method

.method public abstract receiptSubmittedQuantity(Ljava/lang/Integer;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;
    .param p1    # Ljava/lang/Integer;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
.end method

.method public abstract redeemType(Ljava/lang/String;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
.end method

.method public abstract retailerId(Ljava/lang/Integer;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;
    .param p1    # Ljava/lang/Integer;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
.end method

.method public abstract retailerName(Ljava/lang/String;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
.end method

.method public abstract rewardAmount(Ljava/lang/Float;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;
    .param p1    # Ljava/lang/Float;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
.end method

.method public abstract screenName(Ljava/lang/String;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
.end method

.method public abstract sharedHistory(Ljava/lang/Boolean;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;
    .param p1    # Ljava/lang/Boolean;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
.end method

.method public abstract type(Ljava/lang/String;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
.end method

.method public abstract upc(Ljava/lang/String;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
.end method

.method public abstract value(Ljava/lang/Long;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;
    .param p1    # Ljava/lang/Long;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
.end method

.method public abstract walletType(Ljava/lang/String;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
.end method
