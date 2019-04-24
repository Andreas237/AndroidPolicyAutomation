.class public Lcom/ibotta/android/graphql/mapper/RetailerRedemptionMetaMapper;
.super Lcom/ibotta/android/graphql/mapper/BaseMapper;
.source "RetailerRedemptionMetaMapper.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/graphql/mapper/BaseMapper<",
        "Lcom/ibotta/android/graphql/fragment/RetailerRedemptionMetaFragment;",
        "Lcom/ibotta/api/model/retailer/RedemptionMeta;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/ibotta/android/util/Formatting;)V
    .locals 0

    .line 15
    invoke-direct {p0, p1}, Lcom/ibotta/android/graphql/mapper/BaseMapper;-><init>(Lcom/ibotta/android/util/Formatting;)V

    return-void
.end method


# virtual methods
.method public map(Lcom/ibotta/android/graphql/fragment/RetailerRedemptionMetaFragment;)Lcom/ibotta/api/model/retailer/RedemptionMeta;
    .locals 3
    .param p1    # Lcom/ibotta/android/graphql/fragment/RetailerRedemptionMetaFragment;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 24
    :cond_0
    new-instance v0, Lcom/ibotta/api/model/retailer/RedemptionMeta;

    invoke-direct {v0}, Lcom/ibotta/api/model/retailer/RedemptionMeta;-><init>()V

    .line 27
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/RetailerRedemptionMetaFragment;->additional_redemption_instructions()Ljava/util/List;

    move-result-object v1

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-static {v1, v2}, Lcom/ibotta/android/util/AppHelper$-CC;->sanitizeNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    .line 26
    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/retailer/RedemptionMeta;->setAdditionalRedemptionInstructions(Ljava/util/List;)V

    .line 28
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/RetailerRedemptionMetaFragment;->button_pending_activity_message()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/retailer/RedemptionMeta;->setButtonPendingActivityMessage(Ljava/lang/String;)V

    .line 29
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/RetailerRedemptionMetaFragment;->button_returning_user_message()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/retailer/RedemptionMeta;->setButtonReturningUserMessage(Ljava/lang/String;)V

    .line 30
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/RetailerRedemptionMetaFragment;->button_departing_user_message()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/retailer/RedemptionMeta;->setButtonDepartingUserMessage(Ljava/lang/String;)V

    .line 31
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/RetailerRedemptionMetaFragment;->max_receipt_age_days()Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/ibotta/android/graphql/mapper/RetailerRedemptionMetaMapper;->asInt(Ljava/lang/Number;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/retailer/RedemptionMeta;->setMaxReceiptAgeDays(I)V

    .line 32
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/fragment/RetailerRedemptionMetaFragment;->receipt_name()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ibotta/api/model/retailer/RedemptionMeta;->setReceiptName(Ljava/lang/String;)V

    return-object v0
.end method

.method public bridge synthetic map(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 12
    check-cast p1, Lcom/ibotta/android/graphql/fragment/RetailerRedemptionMetaFragment;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/graphql/mapper/RetailerRedemptionMetaMapper;->map(Lcom/ibotta/android/graphql/fragment/RetailerRedemptionMetaFragment;)Lcom/ibotta/api/model/retailer/RedemptionMeta;

    move-result-object p1

    return-object p1
.end method
