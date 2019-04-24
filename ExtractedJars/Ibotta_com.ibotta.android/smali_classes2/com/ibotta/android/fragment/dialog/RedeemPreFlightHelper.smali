.class public Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;
.super Ljava/lang/Object;
.source "RedeemPreFlightHelper.java"

# interfaces
.implements Lcom/ibotta/android/fragment/dialog/PromptDialogFragment$PromptDialogListener;
.implements Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment$FlyUpDialogListener;
.implements Lcom/ibotta/android/service/api/job/ApiJobListener;


# static fields
.field private static final TAG_FLY_UP_NO_ACTIVE_REBATES:Ljava/lang/String; = "no_active_rebates"

.field private static final TAG_RETAILERS_PENDING_PROMPT:Ljava/lang/String; = "retailers_pending_prompt"


# instance fields
.field private final apiWorkSubmitter:Lcom/ibotta/android/service/api/ApiWorkSubmitter;

.field private compatSupplier:Lcom/ibotta/android/activity/CompatSupplier;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private context:Landroid/content/Context;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private doPendingCheck:Z

.field private eventContext:Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;

.field private flippedFlowVariant:Lcom/ibotta/android/features/variant/flippedflow/FlippedFlowVariant;

.field private final formatting:Lcom/ibotta/android/util/Formatting;

.field private final hardware:Lcom/ibotta/android/hardware/Hardware;

.field private offerHelper:Lcom/ibotta/api/helper/offer/OfferHelper;

.field private retailer:Lcom/ibotta/android/fragment/retailer/RetailerParcel;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private retailersPending:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/Integer;",
            "Lcom/ibotta/api/model/retailer/RetailerPending;",
            ">;"
        }
    .end annotation
.end field

.field private retailersPendingJob:Lcom/ibotta/android/service/api/job/SingleApiJob;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/ibotta/android/hardware/Hardware;Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/service/api/ApiWorkSubmitter;Lcom/ibotta/android/activity/CompatSupplier;Lcom/ibotta/api/helper/offer/OfferHelper;Lcom/ibotta/android/features/factory/VariantFactory;)V
    .locals 0

    .line 77
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 78
    iput-object p1, p0, Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;->context:Landroid/content/Context;

    .line 79
    iput-object p2, p0, Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;->hardware:Lcom/ibotta/android/hardware/Hardware;

    .line 80
    iput-object p3, p0, Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;->formatting:Lcom/ibotta/android/util/Formatting;

    .line 81
    iput-object p4, p0, Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;->apiWorkSubmitter:Lcom/ibotta/android/service/api/ApiWorkSubmitter;

    .line 82
    iput-object p5, p0, Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;->compatSupplier:Lcom/ibotta/android/activity/CompatSupplier;

    .line 83
    iput-object p6, p0, Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;->offerHelper:Lcom/ibotta/api/helper/offer/OfferHelper;

    const-string p1, "flipped_flow"

    .line 84
    const-class p2, Lcom/ibotta/android/features/variant/flippedflow/FlippedFlowVariant;

    invoke-interface {p7, p1, p2}, Lcom/ibotta/android/features/factory/VariantFactory;->getVariant(Ljava/lang/String;Ljava/lang/Class;)Lcom/ibotta/android/features/Variant;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/features/variant/flippedflow/FlippedFlowVariant;

    iput-object p1, p0, Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;->flippedFlowVariant:Lcom/ibotta/android/features/variant/flippedflow/FlippedFlowVariant;

    return-void
.end method

.method private checkPendingOrProceed()V
    .locals 1

    .line 190
    iget-object v0, p0, Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;->retailer:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-virtual {v0}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->getVerificationType()Lcom/ibotta/api/model/common/VerificationType;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/api/model/common/VerificationType;->isCheckPendingReceipt()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;->hasPendingReceipt()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 193
    invoke-direct {p0}, Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;->promptPendingReceipt()V

    goto :goto_0

    .line 196
    :cond_0
    invoke-direct {p0}, Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;->proceedWithRetailer()V

    :goto_0
    return-void
.end method

.method private hasPendingReceipt()Z
    .locals 3

    .line 231
    iget-object v0, p0, Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;->retailer:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 237
    :cond_0
    iget-object v2, p0, Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;->retailersPending:Ljava/util/HashMap;

    if-eqz v2, :cond_1

    .line 238
    invoke-virtual {v0}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->getId()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    :cond_1
    return v1
.end method

.method private launchButtonApp()V
    .locals 3

    .line 215
    iget-object v0, p0, Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;->context:Landroid/content/Context;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;->retailer:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    if-nez v0, :cond_0

    goto :goto_1

    .line 219
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;->hardware:Lcom/ibotta/android/hardware/Hardware;

    invoke-interface {v0}, Lcom/ibotta/android/hardware/Hardware;->isNetworkConnected()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 220
    iget-object v0, p0, Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;->retailer:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    iget-object v1, p0, Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;->eventContext:Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;

    .line 221
    invoke-static {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/McommEscortParamsParcel;->builder(Lcom/ibotta/android/fragment/retailer/RetailerParcel;Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;)Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/McommEscortParamsParcel$Builder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/McommEscortParamsParcel$Builder;->build()Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/McommEscortParamsParcel;

    move-result-object v0

    .line 223
    iget-object v1, p0, Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;->context:Landroid/content/Context;

    new-instance v2, Lcom/ibotta/android/routing/intent/MCommEscortIntentCreator;

    invoke-direct {v2, v1, v0}, Lcom/ibotta/android/routing/intent/MCommEscortIntentCreator;-><init>(Landroid/content/Context;Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/McommEscortParamsParcel;)V

    invoke-virtual {v2}, Lcom/ibotta/android/routing/intent/MCommEscortIntentCreator;->create()Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    goto :goto_0

    .line 225
    :cond_1
    new-instance v0, Lcom/ibotta/android/mvp/ui/dialog/NetworkConnectionDialog;

    iget-object v1, p0, Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;->context:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/dialog/NetworkConnectionDialog;-><init>(Landroid/content/Context;)V

    .line 226
    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/dialog/NetworkConnectionDialog;->show()V

    :goto_0
    return-void

    :cond_2
    :goto_1
    return-void
.end method

.method private proceedWithRetailer()V
    .locals 3

    .line 201
    iget-object v0, p0, Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;->context:Landroid/content/Context;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;->retailer:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    if-nez v0, :cond_0

    goto :goto_1

    .line 205
    :cond_0
    invoke-virtual {v0}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->getVerificationType()Lcom/ibotta/api/model/common/VerificationType;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/api/model/common/VerificationType;->isLoyalty()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;->retailer:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-virtual {v0}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->isAuxiliaryLoyaltyEnabled()Z

    move-result v0

    if-nez v0, :cond_1

    .line 206
    iget-object v0, p0, Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;->context:Landroid/content/Context;

    new-instance v1, Lcom/ibotta/android/routing/intent/LoyaltyCardIntentCreator;

    iget-object v2, p0, Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;->retailer:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-direct {v1, v0, v2}, Lcom/ibotta/android/routing/intent/LoyaltyCardIntentCreator;-><init>(Landroid/content/Context;Lcom/ibotta/android/fragment/retailer/RetailerParcel;)V

    invoke-virtual {v1}, Lcom/ibotta/android/routing/intent/LoyaltyCardIntentCreator;->create()Landroid/content/Intent;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    goto :goto_0

    .line 207
    :cond_1
    iget-object v0, p0, Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;->retailer:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-virtual {v0}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->getVerificationType()Lcom/ibotta/api/model/common/VerificationType;

    move-result-object v0

    sget-object v1, Lcom/ibotta/api/model/common/VerificationType;->APP:Lcom/ibotta/api/model/common/VerificationType;

    if-ne v0, v1, :cond_2

    .line 208
    invoke-direct {p0}, Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;->launchButtonApp()V

    goto :goto_0

    .line 210
    :cond_2
    iget-object v0, p0, Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;->context:Landroid/content/Context;

    iget-object v1, p0, Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;->retailer:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-static {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsActivity;->start(Landroid/content/Context;Lcom/ibotta/android/fragment/retailer/RetailerParcel;)V

    :goto_0
    return-void

    :cond_3
    :goto_1
    return-void
.end method

.method private promptPendingReceipt()V
    .locals 9

    .line 245
    iget-object v0, p0, Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;->compatSupplier:Lcom/ibotta/android/activity/CompatSupplier;

    if-nez v0, :cond_0

    return-void

    .line 249
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;->context:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    if-nez v0, :cond_1

    return-void

    .line 254
    :cond_1
    iget-object v1, p0, Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;->context:Landroid/content/Context;

    iget-object v2, p0, Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;->retailer:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-virtual {v2}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->getName()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;->retailer:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-virtual {v3}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->getRedemptionMeta()Lcom/ibotta/api/model/retailer/RedemptionMeta;

    move-result-object v3

    invoke-static {v1, v2, v3}, Lcom/ibotta/android/util/RedemptionFormat;->build(Landroid/content/Context;Ljava/lang/String;Lcom/ibotta/api/model/retailer/RedemptionMeta;)Lcom/ibotta/android/util/RedemptionFormat;

    move-result-object v1

    const v2, 0x7f1104ae

    const/4 v3, 0x1

    .line 255
    new-array v4, v3, [Ljava/lang/Object;

    .line 256
    invoke-virtual {v1}, Lcom/ibotta/android/util/RedemptionFormat;->getReceiptNameCaps()Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    aput-object v5, v4, v6

    .line 255
    invoke-virtual {v0, v2, v4}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    .line 257
    iget-object v4, p0, Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;->formatting:Lcom/ibotta/android/util/Formatting;

    iget-object v5, p0, Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;->retailer:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-virtual {v5}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v4, v5, v6}, Lcom/ibotta/android/util/Formatting;->prefixAorAn(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v4

    const v5, 0x7f1104ad

    const/4 v7, 0x2

    .line 258
    new-array v8, v7, [Ljava/lang/Object;

    aput-object v4, v8, v6

    .line 259
    invoke-virtual {v1}, Lcom/ibotta/android/util/RedemptionFormat;->getReceiptNameLower()Ljava/lang/String;

    move-result-object v1

    aput-object v1, v8, v3

    .line 258
    invoke-virtual {v0, v5, v8}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 260
    new-array v1, v7, [I

    fill-array-data v1, :array_0

    invoke-static {v2, v0, v1}, Lcom/ibotta/android/fragment/dialog/PromptDialogFragment;->newInstance(Ljava/lang/String;Ljava/lang/String;[I)Lcom/ibotta/android/fragment/dialog/PromptDialogFragment;

    move-result-object v0

    .line 265
    invoke-virtual {v0, p0}, Lcom/ibotta/android/fragment/dialog/PromptDialogFragment;->setListener(Lcom/ibotta/android/fragment/dialog/IbottaDialogFragment$IbottaDialogFragmentListener;)V

    .line 266
    sget-object v1, Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;->INSTANCE:Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;

    iget-object v2, p0, Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;->compatSupplier:Lcom/ibotta/android/activity/CompatSupplier;

    const-string v3, "retailers_pending_prompt"

    invoke-virtual {v1, v2, v0, v3}, Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;->show(Lcom/ibotta/android/activity/CompatSupplier;Landroid/support/v4/app/DialogFragment;Ljava/lang/String;)V

    return-void

    nop

    :array_0
    .array-data 4
        0x7f110142
        0x7f1101f2
    .end array-data
.end method

.method private showNoActiveRebates()V
    .locals 4

    .line 270
    iget-object v0, p0, Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;->context:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    .line 271
    iget-object v1, p0, Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;->compatSupplier:Lcom/ibotta/android/activity/CompatSupplier;

    if-eqz v1, :cond_0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 272
    invoke-static {v0}, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment;->newInstance(I)Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment;

    move-result-object v0

    .line 273
    invoke-virtual {v0, p0}, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpDialogFragment;->setListener(Lcom/ibotta/android/fragment/dialog/IbottaDialogFragment$IbottaDialogFragmentListener;)V

    .line 274
    sget-object v1, Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;->INSTANCE:Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;

    iget-object v2, p0, Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;->compatSupplier:Lcom/ibotta/android/activity/CompatSupplier;

    const-string v3, "no_active_rebates"

    invoke-virtual {v1, v2, v0, v3}, Lcom/ibotta/android/fragment/dialog/DialogFragmentHelper;->show(Lcom/ibotta/android/activity/CompatSupplier;Landroid/support/v4/app/DialogFragment;Ljava/lang/String;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public destroy()V
    .locals 1

    .line 120
    invoke-virtual {p0}, Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;->stop()V

    const/4 v0, 0x0

    .line 121
    iput-object v0, p0, Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;->context:Landroid/content/Context;

    .line 122
    iput-object v0, p0, Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;->compatSupplier:Lcom/ibotta/android/activity/CompatSupplier;

    .line 123
    iput-object v0, p0, Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;->retailer:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    return-void
.end method

.method public getFlyUpPageCreator(Ljava/lang/String;Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPagerController;)Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageCreator;
    .locals 1

    const-string v0, "no_active_rebates"

    .line 296
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 297
    new-instance p1, Lcom/ibotta/android/util/NoActiveRebatesFlyUpCreator;

    iget-object v0, p0, Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;->retailer:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-direct {p1, p2, v0}, Lcom/ibotta/android/util/NoActiveRebatesFlyUpCreator;-><init>(Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPagerController;Lcom/ibotta/android/fragment/retailer/RetailerParcel;)V

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public hasActiveOfferForRetailer(Lcom/ibotta/android/fragment/retailer/RetailerParcel;Ljava/util/List;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/fragment/retailer/RetailerParcel;",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/OfferModel;",
            ">;)Z"
        }
    .end annotation

    if-eqz p1, :cond_0

    .line 183
    iget-object v0, p0, Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;->flippedFlowVariant:Lcom/ibotta/android/features/variant/flippedflow/FlippedFlowVariant;

    iget-object v1, p0, Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;->offerHelper:Lcom/ibotta/api/helper/offer/OfferHelper;

    .line 184
    invoke-virtual {p1}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->getId()I

    move-result v2

    invoke-virtual {p1}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->getVerificationType()Lcom/ibotta/api/model/common/VerificationType;

    move-result-object p1

    .line 183
    invoke-interface {v0, v1, v2, p1, p2}, Lcom/ibotta/android/features/variant/flippedflow/FlippedFlowVariant;->retailerMeetsRedemptionRequirements(Lcom/ibotta/api/helper/offer/OfferHelper;ILcom/ibotta/api/model/common/VerificationType;Ljava/util/List;)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public onApiJobFinished(Lcom/ibotta/android/service/api/job/ApiJob;)V
    .locals 2

    const/4 v0, 0x0

    .line 319
    :try_start_0
    iget-object v1, p0, Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;->retailersPendingJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    if-ne p1, v1, :cond_0

    iget-object p1, p0, Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;->retailersPendingJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-virtual {p1}, Lcom/ibotta/android/service/api/job/SingleApiJob;->isSuccess()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 320
    iget-object p1, p0, Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;->retailersPendingJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    .line 321
    invoke-virtual {p1}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object p1

    check-cast p1, Lcom/ibotta/api/call/retailer/RetailersPendingResponse;

    .line 322
    invoke-virtual {p1}, Lcom/ibotta/api/call/retailer/RetailersPendingResponse;->getRetailersPending()Ljava/util/HashMap;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 323
    invoke-virtual {p1}, Lcom/ibotta/api/call/retailer/RetailersPendingResponse;->getRetailersPending()Ljava/util/HashMap;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;->retailersPending:Ljava/util/HashMap;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 327
    :cond_0
    iget-object p1, p0, Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;->retailersPendingJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    if-eqz p1, :cond_1

    .line 328
    invoke-virtual {p1, p0}, Lcom/ibotta/android/service/api/job/SingleApiJob;->removeListener(Lcom/ibotta/android/service/api/job/ApiJobListener;)V

    .line 330
    :cond_1
    iput-object v0, p0, Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;->retailersPendingJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    return-void

    :catchall_0
    move-exception p1

    .line 327
    iget-object v1, p0, Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;->retailersPendingJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    if-eqz v1, :cond_2

    .line 328
    invoke-virtual {v1, p0}, Lcom/ibotta/android/service/api/job/SingleApiJob;->removeListener(Lcom/ibotta/android/service/api/job/ApiJobListener;)V

    .line 330
    :cond_2
    iput-object v0, p0, Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;->retailersPendingJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    throw p1
.end method

.method public onApiJobLongTask(Lcom/ibotta/android/service/api/job/ApiJob;)V
    .locals 0

    return-void
.end method

.method public onChoice(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    const-string p3, "retailers_pending_prompt"

    .line 280
    invoke-virtual {p3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const p1, 0x7f1101f2

    if-ne p2, p1, :cond_0

    .line 281
    invoke-direct {p0}, Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;->proceedWithRetailer()V

    :cond_0
    return-void
.end method

.method public onDialogFragmentCancelled(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public onDialogFragmentDismissed(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public onFlyUpCancel(Ljava/lang/String;I)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

.method public onFlyUpPageEvent(Ljava/lang/String;Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageEvent;)V
    .locals 0

    return-void
.end method

.method public redeem()V
    .locals 3

    .line 154
    iget-object v0, p0, Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;->context:Landroid/content/Context;

    new-instance v1, Lcom/ibotta/android/routing/intent/RedeemIntentCreator;

    invoke-direct {v1, v0}, Lcom/ibotta/android/routing/intent/RedeemIntentCreator;-><init>(Landroid/content/Context;)V

    iget-object v2, p0, Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;->eventContext:Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;

    invoke-virtual {v1, v2}, Lcom/ibotta/android/routing/intent/RedeemIntentCreator;->eventContext(Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;)Lcom/ibotta/android/routing/intent/RedeemIntentCreator;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ibotta/android/routing/intent/RedeemIntentCreator;->create()Landroid/content/Intent;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method public redeem(Lcom/ibotta/android/fragment/retailer/RetailerParcel;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/fragment/retailer/RetailerParcel;",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/OfferModel;",
            ">;)V"
        }
    .end annotation

    if-nez p1, :cond_0

    .line 134
    invoke-virtual {p0}, Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;->redeem()V

    return-void

    .line 138
    :cond_0
    iput-object p1, p0, Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;->retailer:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    .line 140
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;->hasActiveOfferForRetailer(Lcom/ibotta/android/fragment/retailer/RetailerParcel;Ljava/util/List;)Z

    move-result p1

    if-nez p1, :cond_1

    .line 142
    invoke-direct {p0}, Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;->showNoActiveRebates()V

    goto :goto_0

    .line 145
    :cond_1
    invoke-direct {p0}, Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;->checkPendingOrProceed()V

    :goto_0
    return-void
.end method

.method public redeemLoyaltyReceipt(Lcom/ibotta/android/fragment/retailer/RetailerParcel;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/fragment/retailer/RetailerParcel;",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/OfferModel;",
            ">;)V"
        }
    .end annotation

    .line 162
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;->hasActiveOfferForRetailer(Lcom/ibotta/android/fragment/retailer/RetailerParcel;Ljava/util/List;)Z

    move-result p2

    if-nez p2, :cond_0

    .line 164
    invoke-direct {p0}, Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;->showNoActiveRebates()V

    goto :goto_0

    .line 166
    :cond_0
    iget-object p2, p0, Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;->context:Landroid/content/Context;

    if-eqz p2, :cond_2

    if-nez p1, :cond_1

    goto :goto_1

    .line 170
    :cond_1
    invoke-static {p2, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsActivity;->start(Landroid/content/Context;Lcom/ibotta/android/fragment/retailer/RetailerParcel;)V

    :goto_0
    return-void

    :cond_2
    :goto_1
    return-void
.end method

.method public setDoPendingCheck(Z)V
    .locals 0

    .line 88
    iput-boolean p1, p0, Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;->doPendingCheck:Z

    return-void
.end method

.method public setEventContext(Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;)V
    .locals 0

    .line 92
    iput-object p1, p0, Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;->eventContext:Lcom/ibotta/android/tracking/proprietary/event/enums/EventContext;

    return-void
.end method

.method public start()V
    .locals 3

    .line 96
    iget-boolean v0, p0, Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;->doPendingCheck:Z

    if-nez v0, :cond_0

    return-void

    .line 100
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;->retailersPendingJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    if-nez v0, :cond_1

    .line 101
    new-instance v0, Lcom/ibotta/android/service/api/job/SingleApiJob;

    new-instance v1, Lcom/ibotta/api/call/retailer/RetailersPendingCall;

    invoke-direct {v1}, Lcom/ibotta/api/call/retailer/RetailersPendingCall;-><init>()V

    const v2, 0x7fffffff

    invoke-direct {v0, v1, v2}, Lcom/ibotta/android/service/api/job/SingleApiJob;-><init>(Lcom/ibotta/api/ApiCall;I)V

    iput-object v0, p0, Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;->retailersPendingJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    .line 102
    iget-object v0, p0, Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;->apiWorkSubmitter:Lcom/ibotta/android/service/api/ApiWorkSubmitter;

    iget-object v1, p0, Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;->retailersPendingJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-interface {v0, v1}, Lcom/ibotta/android/service/api/ApiWorkSubmitter;->submit(Lcom/ibotta/android/service/api/job/ApiJob;)V

    .line 105
    :cond_1
    iget-object v0, p0, Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;->retailersPendingJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-virtual {v0, p0}, Lcom/ibotta/android/service/api/job/SingleApiJob;->addListener(Lcom/ibotta/android/service/api/job/ApiJobListener;)V

    return-void
.end method

.method public stop()V
    .locals 1

    .line 109
    iget-boolean v0, p0, Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;->doPendingCheck:Z

    if-nez v0, :cond_0

    return-void

    .line 113
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;->retailersPendingJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    if-eqz v0, :cond_1

    .line 114
    invoke-virtual {v0, p0}, Lcom/ibotta/android/service/api/job/SingleApiJob;->removeListener(Lcom/ibotta/android/service/api/job/ApiJobListener;)V

    const/4 v0, 0x0

    .line 115
    iput-object v0, p0, Lcom/ibotta/android/fragment/dialog/RedeemPreFlightHelper;->retailersPendingJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    :cond_1
    return-void
.end method
