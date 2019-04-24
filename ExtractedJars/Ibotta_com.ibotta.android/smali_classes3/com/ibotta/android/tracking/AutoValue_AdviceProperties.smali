.class final Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;
.super Lcom/ibotta/android/tracking/AdviceProperties;
.source "AutoValue_AdviceProperties.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/tracking/AutoValue_AdviceProperties$Builder;
    }
.end annotation


# instance fields
.field private final actionType:Ljava/lang/String;

.field private final activatedRetailerId:Ljava/lang/Integer;

.field private final buttonText:Ljava/lang/String;

.field private final cameFromCreateFlow:Ljava/lang/Boolean;

.field private final cardType:Ljava/lang/String;

.field private final clickId:Ljava/lang/Integer;

.field private final clickName:Ljava/lang/String;

.field private final clickType:Ljava/lang/String;

.field private final context:Ljava/lang/String;

.field private final correctExpectedQuantity:Ljava/lang/Boolean;

.field private final customerId:Ljava/lang/Integer;

.field private final dealId:Ljava/lang/String;

.field private final duration:Ljava/lang/Long;

.field private final engagementId:Ljava/lang/Long;

.field private final errorCode:Ljava/lang/String;

.field private final event:Ljava/lang/String;

.field private final eventAt:Ljava/lang/Long;

.field private final eventEnd:Ljava/lang/Long;

.field private final eventStart:Ljava/lang/Long;

.field private final failureMessage:Ljava/lang/String;

.field private final firstView:Ljava/lang/Boolean;

.field private final isFirstTimePaymentCard:Ljava/lang/Boolean;

.field private final isSpent:Ljava/lang/Boolean;

.field private final isSuccessfulAuth:Ljava/lang/Boolean;

.field private final listIndex:Ljava/lang/Integer;

.field private final matched:Ljava/lang/Boolean;

.field private final nativeScreenName:Ljava/lang/String;

.field private final networkCode:Ljava/lang/Integer;

.field private final newValue:Ljava/lang/Boolean;

.field private final noTracking:Z

.field private final offerAmountType:Ljava/lang/String;

.field private final offerId:Ljava/lang/Integer;

.field private final oldValue:Ljava/lang/Boolean;

.field private final paymentAmount:Ljava/lang/Float;

.field private final paymentId:Ljava/lang/Integer;

.field private final paymentOptionType:Ljava/lang/String;

.field private final preferenceName:Ljava/lang/String;

.field private final productId:Ljava/lang/String;

.field private final receiptExpectedQuantity:Ljava/lang/Integer;

.field private final receiptSubmittedQuantity:Ljava/lang/Integer;

.field private final redeemType:Ljava/lang/String;

.field private final retailerId:Ljava/lang/Integer;

.field private final retailerName:Ljava/lang/String;

.field private final rewardAmount:Ljava/lang/Float;

.field private final screenName:Ljava/lang/String;

.field private final sharedHistory:Ljava/lang/Boolean;

.field private final type:Ljava/lang/String;

.field private final upc:Ljava/lang/String;

.field private final value:Ljava/lang/Long;

.field private final walletType:Ljava/lang/String;


# direct methods
.method private constructor <init>(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)V
    .locals 2
    .param p3    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p4    # Ljava/lang/Integer;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p6    # Ljava/lang/Boolean;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p7    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p8    # Ljava/lang/Integer;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p9    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p10    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p11    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p12    # Ljava/lang/Boolean;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p13    # Ljava/lang/Integer;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p14    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p15    # Ljava/lang/Long;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p16    # Ljava/lang/Long;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p17    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p18    # Ljava/lang/Long;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p19    # Ljava/lang/Long;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p20    # Ljava/lang/Long;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p21    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p22    # Ljava/lang/Boolean;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p23    # Ljava/lang/Boolean;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p24    # Ljava/lang/Boolean;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p25    # Ljava/lang/Boolean;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p26    # Ljava/lang/Integer;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p27    # Ljava/lang/Boolean;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p28    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p29    # Ljava/lang/Integer;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p30    # Ljava/lang/Boolean;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p31    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p32    # Ljava/lang/Integer;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p33    # Ljava/lang/Boolean;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p34    # Ljava/lang/Float;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p35    # Ljava/lang/Integer;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p36    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p37    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p38    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p39    # Ljava/lang/Integer;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p40    # Ljava/lang/Integer;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p41    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p42    # Ljava/lang/Integer;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p43    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p44    # Ljava/lang/Float;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p45    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p46    # Ljava/lang/Boolean;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p47    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p48    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p49    # Ljava/lang/Long;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p50    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    move-object v0, p0

    .line 111
    invoke-direct {p0}, Lcom/ibotta/android/tracking/AdviceProperties;-><init>()V

    move v1, p1

    .line 112
    iput-boolean v1, v0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->noTracking:Z

    move-object v1, p2

    .line 113
    iput-object v1, v0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->event:Ljava/lang/String;

    move-object v1, p3

    .line 114
    iput-object v1, v0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->actionType:Ljava/lang/String;

    move-object v1, p4

    .line 115
    iput-object v1, v0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->activatedRetailerId:Ljava/lang/Integer;

    move-object v1, p5

    .line 116
    iput-object v1, v0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->buttonText:Ljava/lang/String;

    move-object v1, p6

    .line 117
    iput-object v1, v0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->cameFromCreateFlow:Ljava/lang/Boolean;

    move-object v1, p7

    .line 118
    iput-object v1, v0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->cardType:Ljava/lang/String;

    move-object v1, p8

    .line 119
    iput-object v1, v0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->clickId:Ljava/lang/Integer;

    move-object v1, p9

    .line 120
    iput-object v1, v0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->clickName:Ljava/lang/String;

    move-object v1, p10

    .line 121
    iput-object v1, v0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->clickType:Ljava/lang/String;

    move-object v1, p11

    .line 122
    iput-object v1, v0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->context:Ljava/lang/String;

    move-object v1, p12

    .line 123
    iput-object v1, v0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->correctExpectedQuantity:Ljava/lang/Boolean;

    move-object v1, p13

    .line 124
    iput-object v1, v0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->customerId:Ljava/lang/Integer;

    move-object/from16 v1, p14

    .line 125
    iput-object v1, v0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->dealId:Ljava/lang/String;

    move-object/from16 v1, p15

    .line 126
    iput-object v1, v0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->duration:Ljava/lang/Long;

    move-object/from16 v1, p16

    .line 127
    iput-object v1, v0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->engagementId:Ljava/lang/Long;

    move-object/from16 v1, p17

    .line 128
    iput-object v1, v0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->errorCode:Ljava/lang/String;

    move-object/from16 v1, p18

    .line 129
    iput-object v1, v0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->eventAt:Ljava/lang/Long;

    move-object/from16 v1, p19

    .line 130
    iput-object v1, v0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->eventStart:Ljava/lang/Long;

    move-object/from16 v1, p20

    .line 131
    iput-object v1, v0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->eventEnd:Ljava/lang/Long;

    move-object/from16 v1, p21

    .line 132
    iput-object v1, v0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->failureMessage:Ljava/lang/String;

    move-object/from16 v1, p22

    .line 133
    iput-object v1, v0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->firstView:Ljava/lang/Boolean;

    move-object/from16 v1, p23

    .line 134
    iput-object v1, v0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->isFirstTimePaymentCard:Ljava/lang/Boolean;

    move-object/from16 v1, p24

    .line 135
    iput-object v1, v0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->isSpent:Ljava/lang/Boolean;

    move-object/from16 v1, p25

    .line 136
    iput-object v1, v0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->isSuccessfulAuth:Ljava/lang/Boolean;

    move-object/from16 v1, p26

    .line 137
    iput-object v1, v0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->listIndex:Ljava/lang/Integer;

    move-object/from16 v1, p27

    .line 138
    iput-object v1, v0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->matched:Ljava/lang/Boolean;

    move-object/from16 v1, p28

    .line 139
    iput-object v1, v0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->nativeScreenName:Ljava/lang/String;

    move-object/from16 v1, p29

    .line 140
    iput-object v1, v0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->networkCode:Ljava/lang/Integer;

    move-object/from16 v1, p30

    .line 141
    iput-object v1, v0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->newValue:Ljava/lang/Boolean;

    move-object/from16 v1, p31

    .line 142
    iput-object v1, v0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->offerAmountType:Ljava/lang/String;

    move-object/from16 v1, p32

    .line 143
    iput-object v1, v0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->offerId:Ljava/lang/Integer;

    move-object/from16 v1, p33

    .line 144
    iput-object v1, v0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->oldValue:Ljava/lang/Boolean;

    move-object/from16 v1, p34

    .line 145
    iput-object v1, v0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->paymentAmount:Ljava/lang/Float;

    move-object/from16 v1, p35

    .line 146
    iput-object v1, v0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->paymentId:Ljava/lang/Integer;

    move-object/from16 v1, p36

    .line 147
    iput-object v1, v0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->paymentOptionType:Ljava/lang/String;

    move-object/from16 v1, p37

    .line 148
    iput-object v1, v0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->preferenceName:Ljava/lang/String;

    move-object/from16 v1, p38

    .line 149
    iput-object v1, v0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->productId:Ljava/lang/String;

    move-object/from16 v1, p39

    .line 150
    iput-object v1, v0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->receiptExpectedQuantity:Ljava/lang/Integer;

    move-object/from16 v1, p40

    .line 151
    iput-object v1, v0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->receiptSubmittedQuantity:Ljava/lang/Integer;

    move-object/from16 v1, p41

    .line 152
    iput-object v1, v0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->redeemType:Ljava/lang/String;

    move-object/from16 v1, p42

    .line 153
    iput-object v1, v0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->retailerId:Ljava/lang/Integer;

    move-object/from16 v1, p43

    .line 154
    iput-object v1, v0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->retailerName:Ljava/lang/String;

    move-object/from16 v1, p44

    .line 155
    iput-object v1, v0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->rewardAmount:Ljava/lang/Float;

    move-object/from16 v1, p45

    .line 156
    iput-object v1, v0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->screenName:Ljava/lang/String;

    move-object/from16 v1, p46

    .line 157
    iput-object v1, v0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->sharedHistory:Ljava/lang/Boolean;

    move-object/from16 v1, p47

    .line 158
    iput-object v1, v0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->type:Ljava/lang/String;

    move-object/from16 v1, p48

    .line 159
    iput-object v1, v0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->upc:Ljava/lang/String;

    move-object/from16 v1, p49

    .line 160
    iput-object v1, v0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->value:Ljava/lang/Long;

    move-object/from16 v1, p50

    .line 161
    iput-object v1, v0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->walletType:Ljava/lang/String;

    return-void
.end method

.method synthetic constructor <init>(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Lcom/ibotta/android/tracking/AutoValue_AdviceProperties$1;)V
    .locals 0

    .line 8
    invoke-direct/range {p0 .. p50}, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;-><init>(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    .line 523
    :cond_0
    instance-of v1, p1, Lcom/ibotta/android/tracking/AdviceProperties;

    const/4 v2, 0x0

    if-eqz v1, :cond_32

    .line 524
    check-cast p1, Lcom/ibotta/android/tracking/AdviceProperties;

    .line 525
    iget-boolean v1, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->noTracking:Z

    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties;->isNoTracking()Z

    move-result v3

    if-ne v1, v3, :cond_31

    iget-object v1, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->event:Ljava/lang/String;

    .line 526
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties;->getEvent()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_31

    iget-object v1, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->actionType:Ljava/lang/String;

    if-nez v1, :cond_1

    .line 527
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties;->getActionType()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_31

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties;->getActionType()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_31

    :goto_0
    iget-object v1, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->activatedRetailerId:Ljava/lang/Integer;

    if-nez v1, :cond_2

    .line 528
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties;->getActivatedRetailerId()Ljava/lang/Integer;

    move-result-object v1

    if-nez v1, :cond_31

    goto :goto_1

    :cond_2
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties;->getActivatedRetailerId()Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/Integer;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_31

    :goto_1
    iget-object v1, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->buttonText:Ljava/lang/String;

    if-nez v1, :cond_3

    .line 529
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties;->getButtonText()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_31

    goto :goto_2

    :cond_3
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties;->getButtonText()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_31

    :goto_2
    iget-object v1, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->cameFromCreateFlow:Ljava/lang/Boolean;

    if-nez v1, :cond_4

    .line 530
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties;->getCameFromCreateFlow()Ljava/lang/Boolean;

    move-result-object v1

    if-nez v1, :cond_31

    goto :goto_3

    :cond_4
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties;->getCameFromCreateFlow()Ljava/lang/Boolean;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_31

    :goto_3
    iget-object v1, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->cardType:Ljava/lang/String;

    if-nez v1, :cond_5

    .line 531
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties;->getCardType()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_31

    goto :goto_4

    :cond_5
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties;->getCardType()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_31

    :goto_4
    iget-object v1, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->clickId:Ljava/lang/Integer;

    if-nez v1, :cond_6

    .line 532
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties;->getClickId()Ljava/lang/Integer;

    move-result-object v1

    if-nez v1, :cond_31

    goto :goto_5

    :cond_6
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties;->getClickId()Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/Integer;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_31

    :goto_5
    iget-object v1, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->clickName:Ljava/lang/String;

    if-nez v1, :cond_7

    .line 533
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties;->getClickName()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_31

    goto :goto_6

    :cond_7
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties;->getClickName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_31

    :goto_6
    iget-object v1, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->clickType:Ljava/lang/String;

    if-nez v1, :cond_8

    .line 534
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties;->getClickType()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_31

    goto :goto_7

    :cond_8
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties;->getClickType()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_31

    :goto_7
    iget-object v1, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->context:Ljava/lang/String;

    if-nez v1, :cond_9

    .line 535
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties;->getContext()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_31

    goto :goto_8

    :cond_9
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties;->getContext()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_31

    :goto_8
    iget-object v1, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->correctExpectedQuantity:Ljava/lang/Boolean;

    if-nez v1, :cond_a

    .line 536
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties;->getCorrectExpectedQuantity()Ljava/lang/Boolean;

    move-result-object v1

    if-nez v1, :cond_31

    goto :goto_9

    :cond_a
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties;->getCorrectExpectedQuantity()Ljava/lang/Boolean;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_31

    :goto_9
    iget-object v1, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->customerId:Ljava/lang/Integer;

    if-nez v1, :cond_b

    .line 537
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties;->getCustomerId()Ljava/lang/Integer;

    move-result-object v1

    if-nez v1, :cond_31

    goto :goto_a

    :cond_b
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties;->getCustomerId()Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/Integer;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_31

    :goto_a
    iget-object v1, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->dealId:Ljava/lang/String;

    if-nez v1, :cond_c

    .line 538
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties;->getDealId()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_31

    goto :goto_b

    :cond_c
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties;->getDealId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_31

    :goto_b
    iget-object v1, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->duration:Ljava/lang/Long;

    if-nez v1, :cond_d

    .line 539
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties;->getDuration()Ljava/lang/Long;

    move-result-object v1

    if-nez v1, :cond_31

    goto :goto_c

    :cond_d
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties;->getDuration()Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/Long;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_31

    :goto_c
    iget-object v1, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->engagementId:Ljava/lang/Long;

    if-nez v1, :cond_e

    .line 540
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties;->getEngagementId()Ljava/lang/Long;

    move-result-object v1

    if-nez v1, :cond_31

    goto :goto_d

    :cond_e
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties;->getEngagementId()Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/Long;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_31

    :goto_d
    iget-object v1, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->errorCode:Ljava/lang/String;

    if-nez v1, :cond_f

    .line 541
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties;->getErrorCode()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_31

    goto :goto_e

    :cond_f
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties;->getErrorCode()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_31

    :goto_e
    iget-object v1, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->eventAt:Ljava/lang/Long;

    if-nez v1, :cond_10

    .line 542
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties;->getEventAt()Ljava/lang/Long;

    move-result-object v1

    if-nez v1, :cond_31

    goto :goto_f

    :cond_10
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties;->getEventAt()Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/Long;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_31

    :goto_f
    iget-object v1, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->eventStart:Ljava/lang/Long;

    if-nez v1, :cond_11

    .line 543
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties;->getEventStart()Ljava/lang/Long;

    move-result-object v1

    if-nez v1, :cond_31

    goto :goto_10

    :cond_11
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties;->getEventStart()Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/Long;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_31

    :goto_10
    iget-object v1, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->eventEnd:Ljava/lang/Long;

    if-nez v1, :cond_12

    .line 544
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties;->getEventEnd()Ljava/lang/Long;

    move-result-object v1

    if-nez v1, :cond_31

    goto :goto_11

    :cond_12
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties;->getEventEnd()Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/Long;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_31

    :goto_11
    iget-object v1, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->failureMessage:Ljava/lang/String;

    if-nez v1, :cond_13

    .line 545
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties;->getFailureMessage()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_31

    goto :goto_12

    :cond_13
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties;->getFailureMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_31

    :goto_12
    iget-object v1, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->firstView:Ljava/lang/Boolean;

    if-nez v1, :cond_14

    .line 546
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties;->getFirstView()Ljava/lang/Boolean;

    move-result-object v1

    if-nez v1, :cond_31

    goto :goto_13

    :cond_14
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties;->getFirstView()Ljava/lang/Boolean;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_31

    :goto_13
    iget-object v1, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->isFirstTimePaymentCard:Ljava/lang/Boolean;

    if-nez v1, :cond_15

    .line 547
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties;->getIsFirstTimePaymentCard()Ljava/lang/Boolean;

    move-result-object v1

    if-nez v1, :cond_31

    goto :goto_14

    :cond_15
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties;->getIsFirstTimePaymentCard()Ljava/lang/Boolean;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_31

    :goto_14
    iget-object v1, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->isSpent:Ljava/lang/Boolean;

    if-nez v1, :cond_16

    .line 548
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties;->getIsSpent()Ljava/lang/Boolean;

    move-result-object v1

    if-nez v1, :cond_31

    goto :goto_15

    :cond_16
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties;->getIsSpent()Ljava/lang/Boolean;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_31

    :goto_15
    iget-object v1, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->isSuccessfulAuth:Ljava/lang/Boolean;

    if-nez v1, :cond_17

    .line 549
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties;->getIsSuccessfulAuth()Ljava/lang/Boolean;

    move-result-object v1

    if-nez v1, :cond_31

    goto :goto_16

    :cond_17
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties;->getIsSuccessfulAuth()Ljava/lang/Boolean;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_31

    :goto_16
    iget-object v1, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->listIndex:Ljava/lang/Integer;

    if-nez v1, :cond_18

    .line 550
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties;->getListIndex()Ljava/lang/Integer;

    move-result-object v1

    if-nez v1, :cond_31

    goto :goto_17

    :cond_18
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties;->getListIndex()Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/Integer;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_31

    :goto_17
    iget-object v1, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->matched:Ljava/lang/Boolean;

    if-nez v1, :cond_19

    .line 551
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties;->getMatched()Ljava/lang/Boolean;

    move-result-object v1

    if-nez v1, :cond_31

    goto :goto_18

    :cond_19
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties;->getMatched()Ljava/lang/Boolean;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_31

    :goto_18
    iget-object v1, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->nativeScreenName:Ljava/lang/String;

    if-nez v1, :cond_1a

    .line 552
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties;->getNativeScreenName()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_31

    goto :goto_19

    :cond_1a
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties;->getNativeScreenName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_31

    :goto_19
    iget-object v1, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->networkCode:Ljava/lang/Integer;

    if-nez v1, :cond_1b

    .line 553
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties;->getNetworkCode()Ljava/lang/Integer;

    move-result-object v1

    if-nez v1, :cond_31

    goto :goto_1a

    :cond_1b
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties;->getNetworkCode()Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/Integer;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_31

    :goto_1a
    iget-object v1, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->newValue:Ljava/lang/Boolean;

    if-nez v1, :cond_1c

    .line 554
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties;->getNewValue()Ljava/lang/Boolean;

    move-result-object v1

    if-nez v1, :cond_31

    goto :goto_1b

    :cond_1c
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties;->getNewValue()Ljava/lang/Boolean;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_31

    :goto_1b
    iget-object v1, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->offerAmountType:Ljava/lang/String;

    if-nez v1, :cond_1d

    .line 555
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties;->getOfferAmountType()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_31

    goto :goto_1c

    :cond_1d
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties;->getOfferAmountType()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_31

    :goto_1c
    iget-object v1, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->offerId:Ljava/lang/Integer;

    if-nez v1, :cond_1e

    .line 556
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties;->getOfferId()Ljava/lang/Integer;

    move-result-object v1

    if-nez v1, :cond_31

    goto :goto_1d

    :cond_1e
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties;->getOfferId()Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/Integer;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_31

    :goto_1d
    iget-object v1, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->oldValue:Ljava/lang/Boolean;

    if-nez v1, :cond_1f

    .line 557
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties;->getOldValue()Ljava/lang/Boolean;

    move-result-object v1

    if-nez v1, :cond_31

    goto :goto_1e

    :cond_1f
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties;->getOldValue()Ljava/lang/Boolean;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_31

    :goto_1e
    iget-object v1, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->paymentAmount:Ljava/lang/Float;

    if-nez v1, :cond_20

    .line 558
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties;->getPaymentAmount()Ljava/lang/Float;

    move-result-object v1

    if-nez v1, :cond_31

    goto :goto_1f

    :cond_20
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties;->getPaymentAmount()Ljava/lang/Float;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/Float;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_31

    :goto_1f
    iget-object v1, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->paymentId:Ljava/lang/Integer;

    if-nez v1, :cond_21

    .line 559
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties;->getPaymentId()Ljava/lang/Integer;

    move-result-object v1

    if-nez v1, :cond_31

    goto :goto_20

    :cond_21
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties;->getPaymentId()Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/Integer;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_31

    :goto_20
    iget-object v1, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->paymentOptionType:Ljava/lang/String;

    if-nez v1, :cond_22

    .line 560
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties;->getPaymentOptionType()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_31

    goto :goto_21

    :cond_22
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties;->getPaymentOptionType()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_31

    :goto_21
    iget-object v1, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->preferenceName:Ljava/lang/String;

    if-nez v1, :cond_23

    .line 561
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties;->getPreferenceName()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_31

    goto :goto_22

    :cond_23
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties;->getPreferenceName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_31

    :goto_22
    iget-object v1, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->productId:Ljava/lang/String;

    if-nez v1, :cond_24

    .line 562
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties;->getProductId()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_31

    goto :goto_23

    :cond_24
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties;->getProductId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_31

    :goto_23
    iget-object v1, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->receiptExpectedQuantity:Ljava/lang/Integer;

    if-nez v1, :cond_25

    .line 563
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties;->getReceiptExpectedQuantity()Ljava/lang/Integer;

    move-result-object v1

    if-nez v1, :cond_31

    goto :goto_24

    :cond_25
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties;->getReceiptExpectedQuantity()Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/Integer;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_31

    :goto_24
    iget-object v1, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->receiptSubmittedQuantity:Ljava/lang/Integer;

    if-nez v1, :cond_26

    .line 564
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties;->getReceiptSubmittedQuantity()Ljava/lang/Integer;

    move-result-object v1

    if-nez v1, :cond_31

    goto :goto_25

    :cond_26
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties;->getReceiptSubmittedQuantity()Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/Integer;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_31

    :goto_25
    iget-object v1, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->redeemType:Ljava/lang/String;

    if-nez v1, :cond_27

    .line 565
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties;->getRedeemType()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_31

    goto :goto_26

    :cond_27
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties;->getRedeemType()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_31

    :goto_26
    iget-object v1, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->retailerId:Ljava/lang/Integer;

    if-nez v1, :cond_28

    .line 566
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties;->getRetailerId()Ljava/lang/Integer;

    move-result-object v1

    if-nez v1, :cond_31

    goto :goto_27

    :cond_28
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties;->getRetailerId()Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/Integer;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_31

    :goto_27
    iget-object v1, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->retailerName:Ljava/lang/String;

    if-nez v1, :cond_29

    .line 567
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties;->getRetailerName()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_31

    goto :goto_28

    :cond_29
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties;->getRetailerName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_31

    :goto_28
    iget-object v1, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->rewardAmount:Ljava/lang/Float;

    if-nez v1, :cond_2a

    .line 568
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties;->getRewardAmount()Ljava/lang/Float;

    move-result-object v1

    if-nez v1, :cond_31

    goto :goto_29

    :cond_2a
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties;->getRewardAmount()Ljava/lang/Float;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/Float;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_31

    :goto_29
    iget-object v1, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->screenName:Ljava/lang/String;

    if-nez v1, :cond_2b

    .line 569
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties;->getScreenName()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_31

    goto :goto_2a

    :cond_2b
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties;->getScreenName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_31

    :goto_2a
    iget-object v1, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->sharedHistory:Ljava/lang/Boolean;

    if-nez v1, :cond_2c

    .line 570
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties;->getSharedHistory()Ljava/lang/Boolean;

    move-result-object v1

    if-nez v1, :cond_31

    goto :goto_2b

    :cond_2c
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties;->getSharedHistory()Ljava/lang/Boolean;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_31

    :goto_2b
    iget-object v1, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->type:Ljava/lang/String;

    if-nez v1, :cond_2d

    .line 571
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties;->getType()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_31

    goto :goto_2c

    :cond_2d
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties;->getType()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_31

    :goto_2c
    iget-object v1, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->upc:Ljava/lang/String;

    if-nez v1, :cond_2e

    .line 572
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties;->getUpc()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_31

    goto :goto_2d

    :cond_2e
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties;->getUpc()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_31

    :goto_2d
    iget-object v1, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->value:Ljava/lang/Long;

    if-nez v1, :cond_2f

    .line 573
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties;->getValue()Ljava/lang/Long;

    move-result-object v1

    if-nez v1, :cond_31

    goto :goto_2e

    :cond_2f
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties;->getValue()Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/Long;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_31

    :goto_2e
    iget-object v1, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->walletType:Ljava/lang/String;

    if-nez v1, :cond_30

    .line 574
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties;->getWalletType()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_31

    goto :goto_2f

    :cond_30
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/AdviceProperties;->getWalletType()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_31

    goto :goto_2f

    :cond_31
    const/4 v0, 0x0

    :goto_2f
    return v0

    :cond_32
    return v2
.end method

.method public getActionType()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 177
    iget-object v0, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->actionType:Ljava/lang/String;

    return-object v0
.end method

.method public getActivatedRetailerId()Ljava/lang/Integer;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 183
    iget-object v0, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->activatedRetailerId:Ljava/lang/Integer;

    return-object v0
.end method

.method public getButtonText()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 189
    iget-object v0, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->buttonText:Ljava/lang/String;

    return-object v0
.end method

.method public getCameFromCreateFlow()Ljava/lang/Boolean;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 195
    iget-object v0, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->cameFromCreateFlow:Ljava/lang/Boolean;

    return-object v0
.end method

.method public getCardType()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 201
    iget-object v0, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->cardType:Ljava/lang/String;

    return-object v0
.end method

.method public getClickId()Ljava/lang/Integer;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 207
    iget-object v0, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->clickId:Ljava/lang/Integer;

    return-object v0
.end method

.method public getClickName()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 213
    iget-object v0, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->clickName:Ljava/lang/String;

    return-object v0
.end method

.method public getClickType()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 219
    iget-object v0, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->clickType:Ljava/lang/String;

    return-object v0
.end method

.method public getContext()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 225
    iget-object v0, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->context:Ljava/lang/String;

    return-object v0
.end method

.method public getCorrectExpectedQuantity()Ljava/lang/Boolean;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 231
    iget-object v0, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->correctExpectedQuantity:Ljava/lang/Boolean;

    return-object v0
.end method

.method public getCustomerId()Ljava/lang/Integer;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 237
    iget-object v0, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->customerId:Ljava/lang/Integer;

    return-object v0
.end method

.method public getDealId()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 243
    iget-object v0, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->dealId:Ljava/lang/String;

    return-object v0
.end method

.method public getDuration()Ljava/lang/Long;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 249
    iget-object v0, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->duration:Ljava/lang/Long;

    return-object v0
.end method

.method public getEngagementId()Ljava/lang/Long;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 255
    iget-object v0, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->engagementId:Ljava/lang/Long;

    return-object v0
.end method

.method public getErrorCode()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 261
    iget-object v0, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->errorCode:Ljava/lang/String;

    return-object v0
.end method

.method public getEvent()Ljava/lang/String;
    .locals 1

    .line 171
    iget-object v0, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->event:Ljava/lang/String;

    return-object v0
.end method

.method public getEventAt()Ljava/lang/Long;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 267
    iget-object v0, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->eventAt:Ljava/lang/Long;

    return-object v0
.end method

.method public getEventEnd()Ljava/lang/Long;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 279
    iget-object v0, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->eventEnd:Ljava/lang/Long;

    return-object v0
.end method

.method public getEventStart()Ljava/lang/Long;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 273
    iget-object v0, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->eventStart:Ljava/lang/Long;

    return-object v0
.end method

.method public getFailureMessage()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 285
    iget-object v0, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->failureMessage:Ljava/lang/String;

    return-object v0
.end method

.method public getFirstView()Ljava/lang/Boolean;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 291
    iget-object v0, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->firstView:Ljava/lang/Boolean;

    return-object v0
.end method

.method public getIsFirstTimePaymentCard()Ljava/lang/Boolean;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 297
    iget-object v0, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->isFirstTimePaymentCard:Ljava/lang/Boolean;

    return-object v0
.end method

.method public getIsSpent()Ljava/lang/Boolean;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 303
    iget-object v0, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->isSpent:Ljava/lang/Boolean;

    return-object v0
.end method

.method public getIsSuccessfulAuth()Ljava/lang/Boolean;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 309
    iget-object v0, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->isSuccessfulAuth:Ljava/lang/Boolean;

    return-object v0
.end method

.method public getListIndex()Ljava/lang/Integer;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 315
    iget-object v0, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->listIndex:Ljava/lang/Integer;

    return-object v0
.end method

.method public getMatched()Ljava/lang/Boolean;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 321
    iget-object v0, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->matched:Ljava/lang/Boolean;

    return-object v0
.end method

.method public getNativeScreenName()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 327
    iget-object v0, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->nativeScreenName:Ljava/lang/String;

    return-object v0
.end method

.method public getNetworkCode()Ljava/lang/Integer;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 333
    iget-object v0, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->networkCode:Ljava/lang/Integer;

    return-object v0
.end method

.method public getNewValue()Ljava/lang/Boolean;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 339
    iget-object v0, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->newValue:Ljava/lang/Boolean;

    return-object v0
.end method

.method public getOfferAmountType()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 345
    iget-object v0, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->offerAmountType:Ljava/lang/String;

    return-object v0
.end method

.method public getOfferId()Ljava/lang/Integer;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 351
    iget-object v0, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->offerId:Ljava/lang/Integer;

    return-object v0
.end method

.method public getOldValue()Ljava/lang/Boolean;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 357
    iget-object v0, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->oldValue:Ljava/lang/Boolean;

    return-object v0
.end method

.method public getPaymentAmount()Ljava/lang/Float;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 363
    iget-object v0, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->paymentAmount:Ljava/lang/Float;

    return-object v0
.end method

.method public getPaymentId()Ljava/lang/Integer;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 369
    iget-object v0, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->paymentId:Ljava/lang/Integer;

    return-object v0
.end method

.method public getPaymentOptionType()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 375
    iget-object v0, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->paymentOptionType:Ljava/lang/String;

    return-object v0
.end method

.method public getPreferenceName()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 381
    iget-object v0, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->preferenceName:Ljava/lang/String;

    return-object v0
.end method

.method public getProductId()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 387
    iget-object v0, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->productId:Ljava/lang/String;

    return-object v0
.end method

.method public getReceiptExpectedQuantity()Ljava/lang/Integer;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 393
    iget-object v0, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->receiptExpectedQuantity:Ljava/lang/Integer;

    return-object v0
.end method

.method public getReceiptSubmittedQuantity()Ljava/lang/Integer;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 399
    iget-object v0, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->receiptSubmittedQuantity:Ljava/lang/Integer;

    return-object v0
.end method

.method public getRedeemType()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 405
    iget-object v0, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->redeemType:Ljava/lang/String;

    return-object v0
.end method

.method public getRetailerId()Ljava/lang/Integer;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 411
    iget-object v0, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->retailerId:Ljava/lang/Integer;

    return-object v0
.end method

.method public getRetailerName()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 417
    iget-object v0, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->retailerName:Ljava/lang/String;

    return-object v0
.end method

.method public getRewardAmount()Ljava/lang/Float;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 423
    iget-object v0, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->rewardAmount:Ljava/lang/Float;

    return-object v0
.end method

.method public getScreenName()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 429
    iget-object v0, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->screenName:Ljava/lang/String;

    return-object v0
.end method

.method public getSharedHistory()Ljava/lang/Boolean;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 435
    iget-object v0, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->sharedHistory:Ljava/lang/Boolean;

    return-object v0
.end method

.method public getType()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 441
    iget-object v0, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->type:Ljava/lang/String;

    return-object v0
.end method

.method public getUpc()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 447
    iget-object v0, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->upc:Ljava/lang/String;

    return-object v0
.end method

.method public getValue()Ljava/lang/Long;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 453
    iget-object v0, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->value:Ljava/lang/Long;

    return-object v0
.end method

.method public getWalletType()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 459
    iget-object v0, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->walletType:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    .line 583
    iget-boolean v0, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->noTracking:Z

    if-eqz v0, :cond_0

    const/16 v0, 0x4cf

    goto :goto_0

    :cond_0
    const/16 v0, 0x4d5

    :goto_0
    const v1, 0xf4243

    xor-int/2addr v0, v1

    mul-int v0, v0, v1

    .line 585
    iget-object v2, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->event:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 587
    iget-object v2, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->actionType:Ljava/lang/String;

    const/4 v3, 0x0

    if-nez v2, :cond_1

    const/4 v2, 0x0

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 589
    iget-object v2, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->activatedRetailerId:Ljava/lang/Integer;

    if-nez v2, :cond_2

    const/4 v2, 0x0

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/Integer;->hashCode()I

    move-result v2

    :goto_2
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 591
    iget-object v2, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->buttonText:Ljava/lang/String;

    if-nez v2, :cond_3

    const/4 v2, 0x0

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_3
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 593
    iget-object v2, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->cameFromCreateFlow:Ljava/lang/Boolean;

    if-nez v2, :cond_4

    const/4 v2, 0x0

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Ljava/lang/Boolean;->hashCode()I

    move-result v2

    :goto_4
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 595
    iget-object v2, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->cardType:Ljava/lang/String;

    if-nez v2, :cond_5

    const/4 v2, 0x0

    goto :goto_5

    :cond_5
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_5
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 597
    iget-object v2, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->clickId:Ljava/lang/Integer;

    if-nez v2, :cond_6

    const/4 v2, 0x0

    goto :goto_6

    :cond_6
    invoke-virtual {v2}, Ljava/lang/Integer;->hashCode()I

    move-result v2

    :goto_6
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 599
    iget-object v2, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->clickName:Ljava/lang/String;

    if-nez v2, :cond_7

    const/4 v2, 0x0

    goto :goto_7

    :cond_7
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_7
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 601
    iget-object v2, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->clickType:Ljava/lang/String;

    if-nez v2, :cond_8

    const/4 v2, 0x0

    goto :goto_8

    :cond_8
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_8
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 603
    iget-object v2, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->context:Ljava/lang/String;

    if-nez v2, :cond_9

    const/4 v2, 0x0

    goto :goto_9

    :cond_9
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_9
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 605
    iget-object v2, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->correctExpectedQuantity:Ljava/lang/Boolean;

    if-nez v2, :cond_a

    const/4 v2, 0x0

    goto :goto_a

    :cond_a
    invoke-virtual {v2}, Ljava/lang/Boolean;->hashCode()I

    move-result v2

    :goto_a
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 607
    iget-object v2, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->customerId:Ljava/lang/Integer;

    if-nez v2, :cond_b

    const/4 v2, 0x0

    goto :goto_b

    :cond_b
    invoke-virtual {v2}, Ljava/lang/Integer;->hashCode()I

    move-result v2

    :goto_b
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 609
    iget-object v2, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->dealId:Ljava/lang/String;

    if-nez v2, :cond_c

    const/4 v2, 0x0

    goto :goto_c

    :cond_c
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_c
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 611
    iget-object v2, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->duration:Ljava/lang/Long;

    if-nez v2, :cond_d

    const/4 v2, 0x0

    goto :goto_d

    :cond_d
    invoke-virtual {v2}, Ljava/lang/Long;->hashCode()I

    move-result v2

    :goto_d
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 613
    iget-object v2, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->engagementId:Ljava/lang/Long;

    if-nez v2, :cond_e

    const/4 v2, 0x0

    goto :goto_e

    :cond_e
    invoke-virtual {v2}, Ljava/lang/Long;->hashCode()I

    move-result v2

    :goto_e
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 615
    iget-object v2, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->errorCode:Ljava/lang/String;

    if-nez v2, :cond_f

    const/4 v2, 0x0

    goto :goto_f

    :cond_f
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_f
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 617
    iget-object v2, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->eventAt:Ljava/lang/Long;

    if-nez v2, :cond_10

    const/4 v2, 0x0

    goto :goto_10

    :cond_10
    invoke-virtual {v2}, Ljava/lang/Long;->hashCode()I

    move-result v2

    :goto_10
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 619
    iget-object v2, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->eventStart:Ljava/lang/Long;

    if-nez v2, :cond_11

    const/4 v2, 0x0

    goto :goto_11

    :cond_11
    invoke-virtual {v2}, Ljava/lang/Long;->hashCode()I

    move-result v2

    :goto_11
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 621
    iget-object v2, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->eventEnd:Ljava/lang/Long;

    if-nez v2, :cond_12

    const/4 v2, 0x0

    goto :goto_12

    :cond_12
    invoke-virtual {v2}, Ljava/lang/Long;->hashCode()I

    move-result v2

    :goto_12
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 623
    iget-object v2, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->failureMessage:Ljava/lang/String;

    if-nez v2, :cond_13

    const/4 v2, 0x0

    goto :goto_13

    :cond_13
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_13
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 625
    iget-object v2, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->firstView:Ljava/lang/Boolean;

    if-nez v2, :cond_14

    const/4 v2, 0x0

    goto :goto_14

    :cond_14
    invoke-virtual {v2}, Ljava/lang/Boolean;->hashCode()I

    move-result v2

    :goto_14
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 627
    iget-object v2, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->isFirstTimePaymentCard:Ljava/lang/Boolean;

    if-nez v2, :cond_15

    const/4 v2, 0x0

    goto :goto_15

    :cond_15
    invoke-virtual {v2}, Ljava/lang/Boolean;->hashCode()I

    move-result v2

    :goto_15
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 629
    iget-object v2, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->isSpent:Ljava/lang/Boolean;

    if-nez v2, :cond_16

    const/4 v2, 0x0

    goto :goto_16

    :cond_16
    invoke-virtual {v2}, Ljava/lang/Boolean;->hashCode()I

    move-result v2

    :goto_16
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 631
    iget-object v2, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->isSuccessfulAuth:Ljava/lang/Boolean;

    if-nez v2, :cond_17

    const/4 v2, 0x0

    goto :goto_17

    :cond_17
    invoke-virtual {v2}, Ljava/lang/Boolean;->hashCode()I

    move-result v2

    :goto_17
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 633
    iget-object v2, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->listIndex:Ljava/lang/Integer;

    if-nez v2, :cond_18

    const/4 v2, 0x0

    goto :goto_18

    :cond_18
    invoke-virtual {v2}, Ljava/lang/Integer;->hashCode()I

    move-result v2

    :goto_18
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 635
    iget-object v2, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->matched:Ljava/lang/Boolean;

    if-nez v2, :cond_19

    const/4 v2, 0x0

    goto :goto_19

    :cond_19
    invoke-virtual {v2}, Ljava/lang/Boolean;->hashCode()I

    move-result v2

    :goto_19
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 637
    iget-object v2, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->nativeScreenName:Ljava/lang/String;

    if-nez v2, :cond_1a

    const/4 v2, 0x0

    goto :goto_1a

    :cond_1a
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1a
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 639
    iget-object v2, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->networkCode:Ljava/lang/Integer;

    if-nez v2, :cond_1b

    const/4 v2, 0x0

    goto :goto_1b

    :cond_1b
    invoke-virtual {v2}, Ljava/lang/Integer;->hashCode()I

    move-result v2

    :goto_1b
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 641
    iget-object v2, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->newValue:Ljava/lang/Boolean;

    if-nez v2, :cond_1c

    const/4 v2, 0x0

    goto :goto_1c

    :cond_1c
    invoke-virtual {v2}, Ljava/lang/Boolean;->hashCode()I

    move-result v2

    :goto_1c
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 643
    iget-object v2, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->offerAmountType:Ljava/lang/String;

    if-nez v2, :cond_1d

    const/4 v2, 0x0

    goto :goto_1d

    :cond_1d
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1d
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 645
    iget-object v2, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->offerId:Ljava/lang/Integer;

    if-nez v2, :cond_1e

    const/4 v2, 0x0

    goto :goto_1e

    :cond_1e
    invoke-virtual {v2}, Ljava/lang/Integer;->hashCode()I

    move-result v2

    :goto_1e
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 647
    iget-object v2, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->oldValue:Ljava/lang/Boolean;

    if-nez v2, :cond_1f

    const/4 v2, 0x0

    goto :goto_1f

    :cond_1f
    invoke-virtual {v2}, Ljava/lang/Boolean;->hashCode()I

    move-result v2

    :goto_1f
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 649
    iget-object v2, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->paymentAmount:Ljava/lang/Float;

    if-nez v2, :cond_20

    const/4 v2, 0x0

    goto :goto_20

    :cond_20
    invoke-virtual {v2}, Ljava/lang/Float;->hashCode()I

    move-result v2

    :goto_20
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 651
    iget-object v2, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->paymentId:Ljava/lang/Integer;

    if-nez v2, :cond_21

    const/4 v2, 0x0

    goto :goto_21

    :cond_21
    invoke-virtual {v2}, Ljava/lang/Integer;->hashCode()I

    move-result v2

    :goto_21
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 653
    iget-object v2, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->paymentOptionType:Ljava/lang/String;

    if-nez v2, :cond_22

    const/4 v2, 0x0

    goto :goto_22

    :cond_22
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_22
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 655
    iget-object v2, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->preferenceName:Ljava/lang/String;

    if-nez v2, :cond_23

    const/4 v2, 0x0

    goto :goto_23

    :cond_23
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_23
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 657
    iget-object v2, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->productId:Ljava/lang/String;

    if-nez v2, :cond_24

    const/4 v2, 0x0

    goto :goto_24

    :cond_24
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_24
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 659
    iget-object v2, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->receiptExpectedQuantity:Ljava/lang/Integer;

    if-nez v2, :cond_25

    const/4 v2, 0x0

    goto :goto_25

    :cond_25
    invoke-virtual {v2}, Ljava/lang/Integer;->hashCode()I

    move-result v2

    :goto_25
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 661
    iget-object v2, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->receiptSubmittedQuantity:Ljava/lang/Integer;

    if-nez v2, :cond_26

    const/4 v2, 0x0

    goto :goto_26

    :cond_26
    invoke-virtual {v2}, Ljava/lang/Integer;->hashCode()I

    move-result v2

    :goto_26
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 663
    iget-object v2, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->redeemType:Ljava/lang/String;

    if-nez v2, :cond_27

    const/4 v2, 0x0

    goto :goto_27

    :cond_27
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_27
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 665
    iget-object v2, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->retailerId:Ljava/lang/Integer;

    if-nez v2, :cond_28

    const/4 v2, 0x0

    goto :goto_28

    :cond_28
    invoke-virtual {v2}, Ljava/lang/Integer;->hashCode()I

    move-result v2

    :goto_28
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 667
    iget-object v2, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->retailerName:Ljava/lang/String;

    if-nez v2, :cond_29

    const/4 v2, 0x0

    goto :goto_29

    :cond_29
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_29
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 669
    iget-object v2, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->rewardAmount:Ljava/lang/Float;

    if-nez v2, :cond_2a

    const/4 v2, 0x0

    goto :goto_2a

    :cond_2a
    invoke-virtual {v2}, Ljava/lang/Float;->hashCode()I

    move-result v2

    :goto_2a
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 671
    iget-object v2, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->screenName:Ljava/lang/String;

    if-nez v2, :cond_2b

    const/4 v2, 0x0

    goto :goto_2b

    :cond_2b
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_2b
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 673
    iget-object v2, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->sharedHistory:Ljava/lang/Boolean;

    if-nez v2, :cond_2c

    const/4 v2, 0x0

    goto :goto_2c

    :cond_2c
    invoke-virtual {v2}, Ljava/lang/Boolean;->hashCode()I

    move-result v2

    :goto_2c
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 675
    iget-object v2, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->type:Ljava/lang/String;

    if-nez v2, :cond_2d

    const/4 v2, 0x0

    goto :goto_2d

    :cond_2d
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_2d
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 677
    iget-object v2, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->upc:Ljava/lang/String;

    if-nez v2, :cond_2e

    const/4 v2, 0x0

    goto :goto_2e

    :cond_2e
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_2e
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 679
    iget-object v2, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->value:Ljava/lang/Long;

    if-nez v2, :cond_2f

    const/4 v2, 0x0

    goto :goto_2f

    :cond_2f
    invoke-virtual {v2}, Ljava/lang/Long;->hashCode()I

    move-result v2

    :goto_2f
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 681
    iget-object v1, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->walletType:Ljava/lang/String;

    if-nez v1, :cond_30

    goto :goto_30

    :cond_30
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_30
    xor-int/2addr v0, v3

    return v0
.end method

.method public isNoTracking()Z
    .locals 1

    .line 166
    iget-boolean v0, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->noTracking:Z

    return v0
.end method

.method public toBuilder()Lcom/ibotta/android/tracking/AdviceProperties$Builder;
    .locals 2

    .line 687
    new-instance v0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties$Builder;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties$Builder;-><init>(Lcom/ibotta/android/tracking/AdviceProperties;Lcom/ibotta/android/tracking/AutoValue_AdviceProperties$1;)V

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 464
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "AdviceProperties{noTracking="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->noTracking:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", event="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->event:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", actionType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->actionType:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", activatedRetailerId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->activatedRetailerId:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", buttonText="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->buttonText:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", cameFromCreateFlow="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->cameFromCreateFlow:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", cardType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->cardType:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", clickId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->clickId:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", clickName="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->clickName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", clickType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->clickType:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", context="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->context:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", correctExpectedQuantity="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->correctExpectedQuantity:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", customerId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->customerId:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", dealId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->dealId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", duration="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->duration:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", engagementId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->engagementId:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", errorCode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->errorCode:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", eventAt="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->eventAt:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", eventStart="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->eventStart:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", eventEnd="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->eventEnd:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", failureMessage="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->failureMessage:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", firstView="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->firstView:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", isFirstTimePaymentCard="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->isFirstTimePaymentCard:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", isSpent="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->isSpent:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", isSuccessfulAuth="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->isSuccessfulAuth:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", listIndex="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->listIndex:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", matched="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->matched:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", nativeScreenName="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->nativeScreenName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", networkCode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->networkCode:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", newValue="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->newValue:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", offerAmountType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->offerAmountType:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", offerId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->offerId:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", oldValue="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->oldValue:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", paymentAmount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->paymentAmount:Ljava/lang/Float;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", paymentId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->paymentId:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", paymentOptionType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->paymentOptionType:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", preferenceName="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->preferenceName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", productId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->productId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", receiptExpectedQuantity="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->receiptExpectedQuantity:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", receiptSubmittedQuantity="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->receiptSubmittedQuantity:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", redeemType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->redeemType:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", retailerId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->retailerId:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", retailerName="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->retailerName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", rewardAmount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->rewardAmount:Ljava/lang/Float;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", screenName="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->screenName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", sharedHistory="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->sharedHistory:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", type="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->type:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", upc="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->upc:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", value="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->value:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", walletType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/tracking/AutoValue_AdviceProperties;->walletType:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
