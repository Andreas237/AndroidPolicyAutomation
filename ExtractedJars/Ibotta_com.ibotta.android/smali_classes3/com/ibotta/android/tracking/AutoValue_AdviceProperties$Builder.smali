.class final Lcom/ibotta/android/tracking/AutoValue_AdviceProperties$Builder;
.super Lcom/ibotta/android/tracking/AdviceProperties$Builder;
.source "AutoValue_AdviceProperties.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "Builder"
.end annotation


# instance fields
.field private actionType:Ljava/lang/String;

.field private activatedRetailerId:Ljava/lang/Integer;

.field private buttonText:Ljava/lang/String;

.field private cameFromCreateFlow:Ljava/lang/Boolean;

.field private cardType:Ljava/lang/String;

.field private clickId:Ljava/lang/Integer;

.field private clickName:Ljava/lang/String;

.field private clickType:Ljava/lang/String;

.field private context:Ljava/lang/String;

.field private correctExpectedQuantity:Ljava/lang/Boolean;

.field private customerId:Ljava/lang/Integer;

.field private dealId:Ljava/lang/String;

.field private duration:Ljava/lang/Long;

.field private engagementId:Ljava/lang/Long;

.field private errorCode:Ljava/lang/String;

.field private event:Ljava/lang/String;

.field private eventAt:Ljava/lang/Long;

.field private eventEnd:Ljava/lang/Long;

.field private eventStart:Ljava/lang/Long;

.field private failureMessage:Ljava/lang/String;

.field private firstView:Ljava/lang/Boolean;

.field private isFirstTimePaymentCard:Ljava/lang/Boolean;

.field private isSpent:Ljava/lang/Boolean;

.field private isSuccessfulAuth:Ljava/lang/Boolean;

.field private listIndex:Ljava/lang/Integer;

.field private matched:Ljava/lang/Boolean;

.field private nativeScreenName:Ljava/lang/String;

.field private networkCode:Ljava/lang/Integer;

.field private newValue:Ljava/lang/Boolean;

.field private noTracking:Ljava/lang/Boolean;

.field private offerAmountType:Ljava/lang/String;

.field private offerId:Ljava/lang/Integer;

.field private oldValue:Ljava/lang/Boolean;

.field private paymentAmount:Ljava/lang/Float;

.field private paymentId:Ljava/lang/Integer;

.field private paymentOptionType:Ljava/lang/String;

.field private preferenceName:Ljava/lang/String;

.field private productId:Ljava/lang/String;

.field private receiptExpectedQuantity:Ljava/lang/Integer;

.field private receiptSubmittedQuantity:Ljava/lang/Integer;

.field private redeemType:Ljava/lang/String;

.field private retailerId:Ljava/lang/Integer;

.field private retailerName:Ljava/lang/String;

.field private rewardAmount:Ljava/lang/Float;

.field private screenName:Ljava/lang/String;

.field private sharedHistory:Ljava/lang/Boolean;

.field private type:Ljava/lang/String;

.field private upc:Ljava/lang/String;

.field private value:Ljava/lang/Long;

.field private walletType:Ljava/lang/String;


# direct methods
.method constructor <init>()V
    .locals 0

    .line 741
    invoke-direct {p0}, Lcom/ibotta/android/tracking/AdviceProperties$Builder;-><init>()V

    return-void
.end method

.method private constructor <init>(Lcom/ibotta/android/tracking/AdviceProperties;)V
    .locals 1

    .line 743
    invoke-direct {p0}, Lcom/ibotta/android/tracking/AdviceProperties$Builder;-><init>()V

    .line 744
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties;->isNoTracking()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties$Builder;->noTracking:Ljava/lang/Boolean;

    .line 745
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties;->getEvent()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties$Builder;->event:Ljava/lang/String;

    .line 746
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties;->getActionType()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties$Builder;->actionType:Ljava/lang/String;

    .line 747
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties;->getActivatedRetailerId()Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties$Builder;->activatedRetailerId:Ljava/lang/Integer;

    .line 748
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties;->getButtonText()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties$Builder;->buttonText:Ljava/lang/String;

    .line 749
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties;->getCameFromCreateFlow()Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties$Builder;->cameFromCreateFlow:Ljava/lang/Boolean;

    .line 750
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties;->getCardType()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties$Builder;->cardType:Ljava/lang/String;

    .line 751
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties;->getClickId()Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties$Builder;->clickId:Ljava/lang/Integer;

    .line 752
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties;->getClickName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties$Builder;->clickName:Ljava/lang/String;

    .line 753
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties;->getClickType()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties$Builder;->clickType:Ljava/lang/String;

    .line 754
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties;->getContext()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties$Builder;->context:Ljava/lang/String;

    .line 755
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties;->getCorrectExpectedQuantity()Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties$Builder;->correctExpectedQuantity:Ljava/lang/Boolean;

    .line 756
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties;->getCustomerId()Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties$Builder;->customerId:Ljava/lang/Integer;

    .line 757
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties;->getDealId()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties$Builder;->dealId:Ljava/lang/String;

    .line 758
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties;->getDuration()Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties$Builder;->duration:Ljava/lang/Long;

    .line 759
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties;->getEngagementId()Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties$Builder;->engagementId:Ljava/lang/Long;

    .line 760
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties;->getErrorCode()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties$Builder;->errorCode:Ljava/lang/String;

    .line 761
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties;->getEventAt()Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties$Builder;->eventAt:Ljava/lang/Long;

    .line 762
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties;->getEventStart()Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties$Builder;->eventStart:Ljava/lang/Long;

    .line 763
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties;->getEventEnd()Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties$Builder;->eventEnd:Ljava/lang/Long;

    .line 764
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties;->getFailureMessage()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties$Builder;->failureMessage:Ljava/lang/String;

    .line 765
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties;->getFirstView()Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties$Builder;->firstView:Ljava/lang/Boolean;

    .line 766
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties;->getIsFirstTimePaymentCard()Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties$Builder;->isFirstTimePaymentCard:Ljava/lang/Boolean;

    .line 767
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties;->getIsSpent()Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties$Builder;->isSpent:Ljava/lang/Boolean;

    .line 768
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties;->getIsSuccessfulAuth()Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties$Builder;->isSuccessfulAuth:Ljava/lang/Boolean;

    .line 769
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties;->getListIndex()Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties$Builder;->listIndex:Ljava/lang/Integer;

    .line 770
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties;->getMatched()Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties$Builder;->matched:Ljava/lang/Boolean;

    .line 771
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties;->getNativeScreenName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties$Builder;->nativeScreenName:Ljava/lang/String;

    .line 772
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties;->getNetworkCode()Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties$Builder;->networkCode:Ljava/lang/Integer;

    .line 773
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties;->getNewValue()Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties$Builder;->newValue:Ljava/lang/Boolean;

    .line 774
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties;->getOfferAmountType()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties$Builder;->offerAmountType:Ljava/lang/String;

    .line 775
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties;->getOfferId()Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties$Builder;->offerId:Ljava/lang/Integer;

    .line 776
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties;->getOldValue()Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties$Builder;->oldValue:Ljava/lang/Boolean;

    .line 777
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties;->getPaymentAmount()Ljava/lang/Float;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties$Builder;->paymentAmount:Ljava/lang/Float;

    .line 778
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties;->getPaymentId()Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties$Builder;->paymentId:Ljava/lang/Integer;

    .line 779
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties;->getPaymentOptionType()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties$Builder;->paymentOptionType:Ljava/lang/String;

    .line 780
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties;->getPreferenceName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties$Builder;->preferenceName:Ljava/lang/String;

    .line 781
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties;->getProductId()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties$Builder;->productId:Ljava/lang/String;

    .line 782
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties;->getReceiptExpectedQuantity()Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties$Builder;->receiptExpectedQuantity:Ljava/lang/Integer;

    .line 783
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties;->getReceiptSubmittedQuantity()Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties$Builder;->receiptSubmittedQuantity:Ljava/lang/Integer;

    .line 784
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties;->getRedeemType()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties$Builder;->redeemType:Ljava/lang/String;

    .line 785
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties;->getRetailerId()Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties$Builder;->retailerId:Ljava/lang/Integer;

    .line 786
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties;->getRetailerName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties$Builder;->retailerName:Ljava/lang/String;

    .line 787
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties;->getRewardAmount()Ljava/lang/Float;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties$Builder;->rewardAmount:Ljava/lang/Float;

    .line 788
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties;->getScreenName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties$Builder;->screenName:Ljava/lang/String;

    .line 789
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties;->getSharedHistory()Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties$Builder;->sharedHistory:Ljava/lang/Boolean;

    .line 790
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties;->getType()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties$Builder;->type:Ljava/lang/String;

    .line 791
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties;->getUpc()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties$Builder;->upc:Ljava/lang/String;

    .line 792
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties;->getValue()Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties$Builder;->value:Ljava/lang/Long;

    .line 793
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties;->getWalletType()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties$Builder;->walletType:Ljava/lang/String;

    return-void
.end method

.method synthetic constructor <init>(Lcom/ibotta/android/tracking/AdviceProperties;Lcom/ibotta/android/tracking/AutoValue_AdviceProperties$1;)V
    .locals 0

    .line 690
    invoke-direct {p0, p1}, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties$Builder;-><init>(Lcom/ibotta/android/tracking/AdviceProperties;)V

    return-void
.end method


# virtual methods
.method public actionType(Ljava/lang/String;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 810
    iput-object p1, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties$Builder;->actionType:Ljava/lang/String;

    return-object p0
.end method

.method public activatedRetailerId(Ljava/lang/Integer;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;
    .locals 0
    .param p1    # Ljava/lang/Integer;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 815
    iput-object p1, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties$Builder;->activatedRetailerId:Ljava/lang/Integer;

    return-object p0
.end method

.method public build()Lcom/ibotta/android/tracking/AdviceProperties;
    .locals 55

    move-object/from16 v0, p0

    const-string v1, ""

    .line 1051
    iget-object v2, v0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties$Builder;->noTracking:Ljava/lang/Boolean;

    if-nez v2, :cond_0

    .line 1052
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " noTracking"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 1054
    :cond_0
    iget-object v2, v0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties$Builder;->event:Ljava/lang/String;

    if-nez v2, :cond_1

    .line 1055
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " event"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 1057
    :cond_1
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_2

    .line 1060
    new-instance v1, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;

    move-object v3, v1

    iget-object v2, v0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties$Builder;->noTracking:Ljava/lang/Boolean;

    .line 1061
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    iget-object v5, v0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties$Builder;->event:Ljava/lang/String;

    iget-object v6, v0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties$Builder;->actionType:Ljava/lang/String;

    iget-object v7, v0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties$Builder;->activatedRetailerId:Ljava/lang/Integer;

    iget-object v8, v0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties$Builder;->buttonText:Ljava/lang/String;

    iget-object v9, v0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties$Builder;->cameFromCreateFlow:Ljava/lang/Boolean;

    iget-object v10, v0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties$Builder;->cardType:Ljava/lang/String;

    iget-object v11, v0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties$Builder;->clickId:Ljava/lang/Integer;

    iget-object v12, v0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties$Builder;->clickName:Ljava/lang/String;

    iget-object v13, v0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties$Builder;->clickType:Ljava/lang/String;

    iget-object v14, v0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties$Builder;->context:Ljava/lang/String;

    iget-object v15, v0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties$Builder;->correctExpectedQuantity:Ljava/lang/Boolean;

    iget-object v2, v0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties$Builder;->customerId:Ljava/lang/Integer;

    move-object/from16 v16, v2

    iget-object v2, v0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties$Builder;->dealId:Ljava/lang/String;

    move-object/from16 v17, v2

    iget-object v2, v0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties$Builder;->duration:Ljava/lang/Long;

    move-object/from16 v18, v2

    iget-object v2, v0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties$Builder;->engagementId:Ljava/lang/Long;

    move-object/from16 v19, v2

    iget-object v2, v0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties$Builder;->errorCode:Ljava/lang/String;

    move-object/from16 v20, v2

    iget-object v2, v0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties$Builder;->eventAt:Ljava/lang/Long;

    move-object/from16 v21, v2

    iget-object v2, v0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties$Builder;->eventStart:Ljava/lang/Long;

    move-object/from16 v22, v2

    iget-object v2, v0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties$Builder;->eventEnd:Ljava/lang/Long;

    move-object/from16 v23, v2

    iget-object v2, v0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties$Builder;->failureMessage:Ljava/lang/String;

    move-object/from16 v24, v2

    iget-object v2, v0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties$Builder;->firstView:Ljava/lang/Boolean;

    move-object/from16 v25, v2

    iget-object v2, v0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties$Builder;->isFirstTimePaymentCard:Ljava/lang/Boolean;

    move-object/from16 v26, v2

    iget-object v2, v0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties$Builder;->isSpent:Ljava/lang/Boolean;

    move-object/from16 v27, v2

    iget-object v2, v0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties$Builder;->isSuccessfulAuth:Ljava/lang/Boolean;

    move-object/from16 v28, v2

    iget-object v2, v0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties$Builder;->listIndex:Ljava/lang/Integer;

    move-object/from16 v29, v2

    iget-object v2, v0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties$Builder;->matched:Ljava/lang/Boolean;

    move-object/from16 v30, v2

    iget-object v2, v0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties$Builder;->nativeScreenName:Ljava/lang/String;

    move-object/from16 v31, v2

    iget-object v2, v0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties$Builder;->networkCode:Ljava/lang/Integer;

    move-object/from16 v32, v2

    iget-object v2, v0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties$Builder;->newValue:Ljava/lang/Boolean;

    move-object/from16 v33, v2

    iget-object v2, v0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties$Builder;->offerAmountType:Ljava/lang/String;

    move-object/from16 v34, v2

    iget-object v2, v0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties$Builder;->offerId:Ljava/lang/Integer;

    move-object/from16 v35, v2

    iget-object v2, v0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties$Builder;->oldValue:Ljava/lang/Boolean;

    move-object/from16 v36, v2

    iget-object v2, v0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties$Builder;->paymentAmount:Ljava/lang/Float;

    move-object/from16 v37, v2

    iget-object v2, v0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties$Builder;->paymentId:Ljava/lang/Integer;

    move-object/from16 v38, v2

    iget-object v2, v0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties$Builder;->paymentOptionType:Ljava/lang/String;

    move-object/from16 v39, v2

    iget-object v2, v0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties$Builder;->preferenceName:Ljava/lang/String;

    move-object/from16 v40, v2

    iget-object v2, v0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties$Builder;->productId:Ljava/lang/String;

    move-object/from16 v41, v2

    iget-object v2, v0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties$Builder;->receiptExpectedQuantity:Ljava/lang/Integer;

    move-object/from16 v42, v2

    iget-object v2, v0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties$Builder;->receiptSubmittedQuantity:Ljava/lang/Integer;

    move-object/from16 v43, v2

    iget-object v2, v0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties$Builder;->redeemType:Ljava/lang/String;

    move-object/from16 v44, v2

    iget-object v2, v0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties$Builder;->retailerId:Ljava/lang/Integer;

    move-object/from16 v45, v2

    iget-object v2, v0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties$Builder;->retailerName:Ljava/lang/String;

    move-object/from16 v46, v2

    iget-object v2, v0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties$Builder;->rewardAmount:Ljava/lang/Float;

    move-object/from16 v47, v2

    iget-object v2, v0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties$Builder;->screenName:Ljava/lang/String;

    move-object/from16 v48, v2

    iget-object v2, v0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties$Builder;->sharedHistory:Ljava/lang/Boolean;

    move-object/from16 v49, v2

    iget-object v2, v0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties$Builder;->type:Ljava/lang/String;

    move-object/from16 v50, v2

    iget-object v2, v0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties$Builder;->upc:Ljava/lang/String;

    move-object/from16 v51, v2

    iget-object v2, v0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties$Builder;->value:Ljava/lang/Long;

    move-object/from16 v52, v2

    iget-object v2, v0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties$Builder;->walletType:Ljava/lang/String;

    move-object/from16 v53, v2

    const/16 v54, 0x0

    invoke-direct/range {v3 .. v54}, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;-><init>(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Lcom/ibotta/android/tracking/AutoValue_AdviceProperties$1;)V

    return-object v1

    .line 1058
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

.method public buttonText(Ljava/lang/String;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 820
    iput-object p1, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties$Builder;->buttonText:Ljava/lang/String;

    return-object p0
.end method

.method public cameFromCreateFlow(Ljava/lang/Boolean;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;
    .locals 0
    .param p1    # Ljava/lang/Boolean;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 825
    iput-object p1, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties$Builder;->cameFromCreateFlow:Ljava/lang/Boolean;

    return-object p0
.end method

.method public cardType(Ljava/lang/String;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 830
    iput-object p1, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties$Builder;->cardType:Ljava/lang/String;

    return-object p0
.end method

.method public clickId(Ljava/lang/Integer;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;
    .locals 0
    .param p1    # Ljava/lang/Integer;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 835
    iput-object p1, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties$Builder;->clickId:Ljava/lang/Integer;

    return-object p0
.end method

.method public clickName(Ljava/lang/String;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 840
    iput-object p1, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties$Builder;->clickName:Ljava/lang/String;

    return-object p0
.end method

.method public clickType(Ljava/lang/String;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 845
    iput-object p1, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties$Builder;->clickType:Ljava/lang/String;

    return-object p0
.end method

.method public context(Ljava/lang/String;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 850
    iput-object p1, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties$Builder;->context:Ljava/lang/String;

    return-object p0
.end method

.method public correctExpectedQuantity(Ljava/lang/Boolean;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;
    .locals 0
    .param p1    # Ljava/lang/Boolean;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 855
    iput-object p1, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties$Builder;->correctExpectedQuantity:Ljava/lang/Boolean;

    return-object p0
.end method

.method public customerId(Ljava/lang/Integer;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;
    .locals 0
    .param p1    # Ljava/lang/Integer;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 860
    iput-object p1, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties$Builder;->customerId:Ljava/lang/Integer;

    return-object p0
.end method

.method public dealId(Ljava/lang/String;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 865
    iput-object p1, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties$Builder;->dealId:Ljava/lang/String;

    return-object p0
.end method

.method public duration(Ljava/lang/Long;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;
    .locals 0
    .param p1    # Ljava/lang/Long;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 870
    iput-object p1, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties$Builder;->duration:Ljava/lang/Long;

    return-object p0
.end method

.method public engagementId(Ljava/lang/Long;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;
    .locals 0
    .param p1    # Ljava/lang/Long;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 875
    iput-object p1, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties$Builder;->engagementId:Ljava/lang/Long;

    return-object p0
.end method

.method public errorCode(Ljava/lang/String;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 880
    iput-object p1, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties$Builder;->errorCode:Ljava/lang/String;

    return-object p0
.end method

.method public event(Ljava/lang/String;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;
    .locals 1

    if-eqz p1, :cond_0

    .line 805
    iput-object p1, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties$Builder;->event:Ljava/lang/String;

    return-object p0

    .line 803
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null event"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public eventAt(Ljava/lang/Long;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;
    .locals 0
    .param p1    # Ljava/lang/Long;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 885
    iput-object p1, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties$Builder;->eventAt:Ljava/lang/Long;

    return-object p0
.end method

.method public eventEnd(Ljava/lang/Long;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;
    .locals 0
    .param p1    # Ljava/lang/Long;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 895
    iput-object p1, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties$Builder;->eventEnd:Ljava/lang/Long;

    return-object p0
.end method

.method public eventStart(Ljava/lang/Long;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;
    .locals 0
    .param p1    # Ljava/lang/Long;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 890
    iput-object p1, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties$Builder;->eventStart:Ljava/lang/Long;

    return-object p0
.end method

.method public failureMessage(Ljava/lang/String;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 900
    iput-object p1, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties$Builder;->failureMessage:Ljava/lang/String;

    return-object p0
.end method

.method public firstView(Ljava/lang/Boolean;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;
    .locals 0
    .param p1    # Ljava/lang/Boolean;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 905
    iput-object p1, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties$Builder;->firstView:Ljava/lang/Boolean;

    return-object p0
.end method

.method public isFirstTimePaymentCard(Ljava/lang/Boolean;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;
    .locals 0
    .param p1    # Ljava/lang/Boolean;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 910
    iput-object p1, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties$Builder;->isFirstTimePaymentCard:Ljava/lang/Boolean;

    return-object p0
.end method

.method public isSpent(Ljava/lang/Boolean;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;
    .locals 0
    .param p1    # Ljava/lang/Boolean;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 915
    iput-object p1, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties$Builder;->isSpent:Ljava/lang/Boolean;

    return-object p0
.end method

.method public isSuccessfulAuth(Ljava/lang/Boolean;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;
    .locals 0
    .param p1    # Ljava/lang/Boolean;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 920
    iput-object p1, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties$Builder;->isSuccessfulAuth:Ljava/lang/Boolean;

    return-object p0
.end method

.method public listIndex(Ljava/lang/Integer;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;
    .locals 0
    .param p1    # Ljava/lang/Integer;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 925
    iput-object p1, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties$Builder;->listIndex:Ljava/lang/Integer;

    return-object p0
.end method

.method public matched(Ljava/lang/Boolean;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;
    .locals 0
    .param p1    # Ljava/lang/Boolean;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 930
    iput-object p1, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties$Builder;->matched:Ljava/lang/Boolean;

    return-object p0
.end method

.method public nativeScreenName(Ljava/lang/String;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 935
    iput-object p1, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties$Builder;->nativeScreenName:Ljava/lang/String;

    return-object p0
.end method

.method public networkCode(Ljava/lang/Integer;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;
    .locals 0
    .param p1    # Ljava/lang/Integer;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 940
    iput-object p1, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties$Builder;->networkCode:Ljava/lang/Integer;

    return-object p0
.end method

.method public newValue(Ljava/lang/Boolean;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;
    .locals 0
    .param p1    # Ljava/lang/Boolean;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 945
    iput-object p1, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties$Builder;->newValue:Ljava/lang/Boolean;

    return-object p0
.end method

.method protected noTracking(Z)Lcom/ibotta/android/tracking/AdviceProperties$Builder;
    .locals 0

    .line 797
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties$Builder;->noTracking:Ljava/lang/Boolean;

    return-object p0
.end method

.method public offerAmountType(Ljava/lang/String;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 950
    iput-object p1, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties$Builder;->offerAmountType:Ljava/lang/String;

    return-object p0
.end method

.method public offerId(Ljava/lang/Integer;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;
    .locals 0
    .param p1    # Ljava/lang/Integer;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 955
    iput-object p1, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties$Builder;->offerId:Ljava/lang/Integer;

    return-object p0
.end method

.method public oldValue(Ljava/lang/Boolean;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;
    .locals 0
    .param p1    # Ljava/lang/Boolean;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 960
    iput-object p1, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties$Builder;->oldValue:Ljava/lang/Boolean;

    return-object p0
.end method

.method public paymentAmount(Ljava/lang/Float;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;
    .locals 0
    .param p1    # Ljava/lang/Float;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 965
    iput-object p1, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties$Builder;->paymentAmount:Ljava/lang/Float;

    return-object p0
.end method

.method public paymentId(Ljava/lang/Integer;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;
    .locals 0
    .param p1    # Ljava/lang/Integer;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 970
    iput-object p1, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties$Builder;->paymentId:Ljava/lang/Integer;

    return-object p0
.end method

.method public paymentOptionType(Ljava/lang/String;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 975
    iput-object p1, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties$Builder;->paymentOptionType:Ljava/lang/String;

    return-object p0
.end method

.method public preferenceName(Ljava/lang/String;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 980
    iput-object p1, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties$Builder;->preferenceName:Ljava/lang/String;

    return-object p0
.end method

.method public productId(Ljava/lang/String;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 985
    iput-object p1, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties$Builder;->productId:Ljava/lang/String;

    return-object p0
.end method

.method public receiptExpectedQuantity(Ljava/lang/Integer;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;
    .locals 0
    .param p1    # Ljava/lang/Integer;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 990
    iput-object p1, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties$Builder;->receiptExpectedQuantity:Ljava/lang/Integer;

    return-object p0
.end method

.method public receiptSubmittedQuantity(Ljava/lang/Integer;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;
    .locals 0
    .param p1    # Ljava/lang/Integer;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 995
    iput-object p1, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties$Builder;->receiptSubmittedQuantity:Ljava/lang/Integer;

    return-object p0
.end method

.method public redeemType(Ljava/lang/String;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 1000
    iput-object p1, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties$Builder;->redeemType:Ljava/lang/String;

    return-object p0
.end method

.method public retailerId(Ljava/lang/Integer;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;
    .locals 0
    .param p1    # Ljava/lang/Integer;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 1005
    iput-object p1, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties$Builder;->retailerId:Ljava/lang/Integer;

    return-object p0
.end method

.method public retailerName(Ljava/lang/String;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 1010
    iput-object p1, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties$Builder;->retailerName:Ljava/lang/String;

    return-object p0
.end method

.method public rewardAmount(Ljava/lang/Float;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;
    .locals 0
    .param p1    # Ljava/lang/Float;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 1015
    iput-object p1, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties$Builder;->rewardAmount:Ljava/lang/Float;

    return-object p0
.end method

.method public screenName(Ljava/lang/String;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 1020
    iput-object p1, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties$Builder;->screenName:Ljava/lang/String;

    return-object p0
.end method

.method public sharedHistory(Ljava/lang/Boolean;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;
    .locals 0
    .param p1    # Ljava/lang/Boolean;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 1025
    iput-object p1, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties$Builder;->sharedHistory:Ljava/lang/Boolean;

    return-object p0
.end method

.method public type(Ljava/lang/String;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 1030
    iput-object p1, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties$Builder;->type:Ljava/lang/String;

    return-object p0
.end method

.method public upc(Ljava/lang/String;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 1035
    iput-object p1, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties$Builder;->upc:Ljava/lang/String;

    return-object p0
.end method

.method public value(Ljava/lang/Long;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;
    .locals 0
    .param p1    # Ljava/lang/Long;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 1040
    iput-object p1, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties$Builder;->value:Ljava/lang/Long;

    return-object p0
.end method

.method public walletType(Ljava/lang/String;)Lcom/ibotta/android/tracking/AdviceProperties$Builder;
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 1045
    iput-object p1, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties$Builder;->walletType:Ljava/lang/String;

    return-object p0
.end method
