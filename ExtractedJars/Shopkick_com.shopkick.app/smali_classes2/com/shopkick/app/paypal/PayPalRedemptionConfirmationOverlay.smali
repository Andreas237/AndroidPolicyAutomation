.class public Lcom/shopkick/app/paypal/PayPalRedemptionConfirmationOverlay;
.super Lcom/shopkick/app/overlays/base/SKOverlay;
.source "PayPalRedemptionConfirmationOverlay.java"

# interfaces
.implements Lcom/shopkick/fetchers/api/IAPICallback;


# static fields
.field private static final MARGIN_MIDDLE_SIZE:I = 0x4

.field private static final MARGIN_SIZE:I = 0x10

.field private static final MARGIN_TOP_SIZE:I = 0x20


# instance fields
.field private apiManager:Lcom/shopkick/fetchers/api/APIManager;

.field private denomination:Ljava/lang/String;

.field private email:Ljava/lang/String;

.field private notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

.field private rewardID:Ljava/lang/String;

.field private rewardRedeemRequest:Lcom/shopkick/app/fetchers/api/skapi/RewardRedeemRequestV2;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 46
    invoke-direct {p0}, Lcom/shopkick/app/overlays/base/SKOverlay;-><init>()V

    const-string v0, ""

    .line 58
    iput-object v0, p0, Lcom/shopkick/app/paypal/PayPalRedemptionConfirmationOverlay;->rewardID:Ljava/lang/String;

    const-string v0, ""

    .line 59
    iput-object v0, p0, Lcom/shopkick/app/paypal/PayPalRedemptionConfirmationOverlay;->email:Ljava/lang/String;

    const-string v0, ""

    .line 60
    iput-object v0, p0, Lcom/shopkick/app/paypal/PayPalRedemptionConfirmationOverlay;->denomination:Ljava/lang/String;

    return-void
.end method

.method public static synthetic lambda$createView$180(Lcom/shopkick/app/paypal/PayPalRedemptionConfirmationOverlay;Landroid/view/View;)V
    .locals 0

    .line 133
    invoke-virtual {p0}, Lcom/shopkick/app/paypal/PayPalRedemptionConfirmationOverlay;->dismiss()V

    return-void
.end method

.method public static synthetic lambda$createView$181(Lcom/shopkick/app/paypal/PayPalRedemptionConfirmationOverlay;Landroid/view/View;)V
    .locals 1

    .line 140
    iget-object p1, p0, Lcom/shopkick/app/paypal/PayPalRedemptionConfirmationOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    const-string v0, "cancel"

    iput-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->awardDeptName:Ljava/lang/String;

    .line 141
    invoke-virtual {p0}, Lcom/shopkick/app/paypal/PayPalRedemptionConfirmationOverlay;->dismiss()V

    return-void
.end method

.method public static synthetic lambda$createView$182(Lcom/shopkick/app/paypal/PayPalRedemptionConfirmationOverlay;Lcom/shopkick/app/widget/SKButton;Landroid/view/View;)V
    .locals 0

    const/4 p2, 0x0

    .line 146
    invoke-virtual {p1, p2}, Lcom/shopkick/app/widget/SKButton;->setEnabled(Z)V

    .line 147
    new-instance p1, Lcom/shopkick/app/fetchers/api/skapi/RewardRedeemRequestV2;

    invoke-direct {p1}, Lcom/shopkick/app/fetchers/api/skapi/RewardRedeemRequestV2;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/paypal/PayPalRedemptionConfirmationOverlay;->rewardRedeemRequest:Lcom/shopkick/app/fetchers/api/skapi/RewardRedeemRequestV2;

    .line 148
    iget-object p1, p0, Lcom/shopkick/app/paypal/PayPalRedemptionConfirmationOverlay;->rewardRedeemRequest:Lcom/shopkick/app/fetchers/api/skapi/RewardRedeemRequestV2;

    iget-object p2, p0, Lcom/shopkick/app/paypal/PayPalRedemptionConfirmationOverlay;->rewardID:Ljava/lang/String;

    iput-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/RewardRedeemRequestV2;->rewardId:Ljava/lang/String;

    .line 149
    iget-object p2, p0, Lcom/shopkick/app/paypal/PayPalRedemptionConfirmationOverlay;->email:Ljava/lang/String;

    iput-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/RewardRedeemRequestV2;->userEmail:Ljava/lang/String;

    .line 150
    iget-object p2, p0, Lcom/shopkick/app/paypal/PayPalRedemptionConfirmationOverlay;->denomination:Ljava/lang/String;

    iput-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/RewardRedeemRequestV2;->denominationId:Ljava/lang/String;

    const/4 p2, 0x1

    .line 151
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    iput-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/RewardRedeemRequestV2;->quantity:Ljava/lang/Integer;

    .line 152
    iget-object p1, p0, Lcom/shopkick/app/paypal/PayPalRedemptionConfirmationOverlay;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    iget-object p2, p0, Lcom/shopkick/app/paypal/PayPalRedemptionConfirmationOverlay;->rewardRedeemRequest:Lcom/shopkick/app/fetchers/api/skapi/RewardRedeemRequestV2;

    invoke-virtual {p1, p2, p0}, Lcom/shopkick/fetchers/api/APIManager;->appFetch(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;)Lcom/shopkick/fetchers/RequestDetails;

    return-void
.end method

.method private setMargins(Landroid/view/View;IIII)V
    .locals 1

    .line 202
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    instance-of v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;

    if-eqz v0, :cond_0

    .line 203
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 204
    invoke-virtual {v0, p2, p3, p4, p5}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 205
    invoke-virtual {p1}, Landroid/view/View;->requestLayout()V

    :cond_0
    return-void
.end method

.method private setSizeInDp(I)I
    .locals 2

    int-to-float p1, p1

    .line 211
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    const/4 v1, 0x1

    .line 210
    invoke-static {v1, p1, v0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result p1

    float-to-int p1, p1

    return p1
.end method


# virtual methods
.method public completedResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V
    .locals 6

    .line 171
    iget-boolean p1, p2, Lcom/shopkick/fetchers/DataResponse;->success:Z

    if-eqz p1, :cond_1

    iget-object p1, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    if-eqz p1, :cond_1

    .line 172
    iget-object p1, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/RewardRedeemResponseV2;

    .line 173
    iget-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/RewardRedeemResponseV2;->errorMessage:Ljava/lang/String;

    if-eqz p2, :cond_0

    .line 174
    new-instance p2, Ljava/util/HashMap;

    invoke-direct {p2}, Ljava/util/HashMap;-><init>()V

    const-string v0, "REWARD_ERROR_MESSAGE"

    .line 175
    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/RewardRedeemResponseV2;->errorMessage:Ljava/lang/String;

    invoke-virtual {p2, v0, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 176
    iget-object p1, p0, Lcom/shopkick/app/paypal/PayPalRedemptionConfirmationOverlay;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v0, "EMAILED_REWARD_REDEMPTION_FAILURE_EVENT"

    invoke-virtual {p1, v0, p2}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;Ljava/util/HashMap;)Ljava/util/List;

    return-void

    .line 179
    :cond_0
    iget-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/RewardRedeemResponseV2;->redeemedRewardInfos:Ljava/util/List;

    if-eqz p2, :cond_2

    .line 180
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_2

    iget-object p2, p0, Lcom/shopkick/app/paypal/PayPalRedemptionConfirmationOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    if-eqz p2, :cond_2

    .line 181
    iget-object p2, p0, Lcom/shopkick/app/paypal/PayPalRedemptionConfirmationOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    const-string v0, "ok"

    iput-object v0, p2, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->awardDeptName:Ljava/lang/String;

    .line 182
    invoke-virtual {p0}, Lcom/shopkick/app/paypal/PayPalRedemptionConfirmationOverlay;->dismiss()V

    .line 183
    new-instance p2, Ljava/util/HashMap;

    invoke-direct {p2}, Ljava/util/HashMap;-><init>()V

    const-string v0, "reward_image_url"

    .line 184
    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/RewardRedeemResponseV2;->rewardImageUrl:Ljava/lang/String;

    invoke-virtual {p2, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string/jumbo v0, "share_url"

    .line 186
    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/RewardRedeemResponseV2;->shareUrl:Ljava/lang/String;

    invoke-virtual {p2, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "reward_details_url"

    .line 187
    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/RewardRedeemResponseV2;->rewardDetailsUrl:Ljava/lang/String;

    invoke-virtual {p2, v0, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 189
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object p1

    .line 190
    invoke-virtual {p1}, Lcom/shopkick/logging/LoggerManager;->getEventLogger()Lcom/shopkick/logging/EventLogger;

    move-result-object v0

    sget-object p1, Lcom/shopkick/logging/Area;->REDEEM:Lcom/shopkick/logging/Area;

    .line 191
    invoke-virtual {p1}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v1

    const/4 v3, 0x0

    const p1, 0x927c5

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Lcom/shopkick/logging/EventLogger;->log(JLjava/lang/String;Ljava/lang/Integer;Ljava/util/Map;)V

    .line 192
    iget-object p1, p0, Lcom/shopkick/app/paypal/PayPalRedemptionConfirmationOverlay;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v0, "EMAILED_REWARD_REDEMPTION_SUCCESS_EVENT"

    invoke-virtual {p1, v0, p2}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;Ljava/util/HashMap;)Ljava/util/List;

    goto :goto_0

    .line 195
    :cond_1
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    const-string p2, "REWARD_ERROR_MESSAGE"

    .line 196
    invoke-virtual {p0}, Lcom/shopkick/app/paypal/PayPalRedemptionConfirmationOverlay;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v0

    const v1, 0x7f110142

    invoke-virtual {v0, v1}, Lcom/shopkick/app/activities/BaseActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, p2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 197
    iget-object p2, p0, Lcom/shopkick/app/paypal/PayPalRedemptionConfirmationOverlay;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v0, "EMAILED_REWARD_REDEMPTION_FAILURE_EVENT"

    invoke-virtual {p2, v0, p1}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;Ljava/util/HashMap;)Ljava/util/List;

    :cond_2
    :goto_0
    return-void
.end method

.method public createView(Landroid/content/Context;)Landroid/view/View;
    .locals 10

    .line 104
    invoke-super {p0, p1}, Lcom/shopkick/app/overlays/base/SKOverlay;->createView(Landroid/content/Context;)Landroid/view/View;

    move-result-object v0

    .line 108
    invoke-virtual {p0}, Lcom/shopkick/app/paypal/PayPalRedemptionConfirmationOverlay;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v1

    invoke-virtual {v1}, Lcom/shopkick/app/activities/BaseActivity;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v1

    const-string v2, "fonts/AvenirLTStd-Medium.otf"

    invoke-static {v1, v2}, Landroid/graphics/Typeface;->createFromAsset(Landroid/content/res/AssetManager;Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object v1

    const v2, 0x7f09076a

    .line 110
    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Lcom/shopkick/app/widget/SKTextView;

    .line 111
    invoke-virtual {v2, v1}, Lcom/shopkick/app/widget/SKTextView;->setTypeface(Landroid/graphics/Typeface;)V

    const v3, 0x7f09076c

    .line 112
    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Lcom/shopkick/app/widget/SKTextView;

    .line 113
    invoke-virtual {v3, v1}, Lcom/shopkick/app/widget/SKTextView;->setTypeface(Landroid/graphics/Typeface;)V

    const v4, 0x7f09008c

    .line 114
    invoke-virtual {v0, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Lcom/shopkick/app/widget/SKTextView;

    .line 115
    invoke-virtual {v4, v1}, Lcom/shopkick/app/widget/SKTextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 116
    iget-object v1, p0, Lcom/shopkick/app/paypal/PayPalRedemptionConfirmationOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    if-eqz v1, :cond_0

    .line 118
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v5, 0x7f110487

    invoke-virtual {v1, v5}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 120
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    const v6, 0x7f110488

    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v5

    .line 122
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const v6, 0x7f110484

    invoke-virtual {p1, v6}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    .line 123
    iget-object v6, p0, Lcom/shopkick/app/paypal/PayPalRedemptionConfirmationOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v6, v6, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->rewardId:Ljava/lang/String;

    iput-object v6, p0, Lcom/shopkick/app/paypal/PayPalRedemptionConfirmationOverlay;->rewardID:Ljava/lang/String;

    .line 124
    iget-object v6, p0, Lcom/shopkick/app/paypal/PayPalRedemptionConfirmationOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v6, v6, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->userEmail:Ljava/lang/String;

    iput-object v6, p0, Lcom/shopkick/app/paypal/PayPalRedemptionConfirmationOverlay;->email:Ljava/lang/String;

    .line 125
    iget-object v6, p0, Lcom/shopkick/app/paypal/PayPalRedemptionConfirmationOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v6, v6, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->denominationId:Ljava/lang/String;

    iput-object v6, p0, Lcom/shopkick/app/paypal/PayPalRedemptionConfirmationOverlay;->denomination:Ljava/lang/String;

    .line 126
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "$"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v7, p0, Lcom/shopkick/app/paypal/PayPalRedemptionConfirmationOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v7, v7, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->denominationId:Ljava/lang/String;

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x1

    .line 127
    new-array v8, v7, [Ljava/lang/Object;

    const/4 v9, 0x0

    aput-object v6, v8, v9

    invoke-static {v1, v8}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Lcom/shopkick/app/widget/SKTextView;->setText(Ljava/lang/String;)V

    .line 128
    new-array v1, v7, [Ljava/lang/Object;

    iget-object v2, p0, Lcom/shopkick/app/paypal/PayPalRedemptionConfirmationOverlay;->email:Ljava/lang/String;

    aput-object v2, v1, v9

    invoke-static {v5, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Lcom/shopkick/app/widget/SKTextView;->setText(Ljava/lang/String;)V

    .line 129
    invoke-virtual {v4, p1}, Lcom/shopkick/app/widget/SKTextView;->setText(Ljava/lang/String;)V

    :cond_0
    const p1, 0x7f090112

    .line 132
    invoke-virtual {v0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/logging/UserEventImageView;

    .line 133
    new-instance v1, Lcom/shopkick/app/paypal/-$$Lambda$PayPalRedemptionConfirmationOverlay$VLRsMgpXbtXMX2A-bow1UZ0JRzk;

    invoke-direct {v1, p0}, Lcom/shopkick/app/paypal/-$$Lambda$PayPalRedemptionConfirmationOverlay$VLRsMgpXbtXMX2A-bow1UZ0JRzk;-><init>(Lcom/shopkick/app/paypal/PayPalRedemptionConfirmationOverlay;)V

    invoke-virtual {p1, v1}, Lcom/shopkick/app/logging/UserEventImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const/16 p1, 0x20

    .line 134
    invoke-direct {p0, p1}, Lcom/shopkick/app/paypal/PayPalRedemptionConfirmationOverlay;->setSizeInDp(I)I

    move-result p1

    const/16 v1, 0x10

    .line 135
    invoke-direct {p0, v1}, Lcom/shopkick/app/paypal/PayPalRedemptionConfirmationOverlay;->setSizeInDp(I)I

    move-result v7

    const/4 v1, 0x4

    .line 136
    invoke-direct {p0, v1}, Lcom/shopkick/app/paypal/PayPalRedemptionConfirmationOverlay;->setSizeInDp(I)I

    move-result v8

    const v1, 0x7f0900c6

    .line 137
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    move-object v9, v1

    check-cast v9, Lcom/shopkick/app/widget/SKButton;

    move-object v1, p0

    move-object v2, v9

    move v3, v7

    move v4, p1

    move v5, v8

    move v6, v7

    .line 138
    invoke-direct/range {v1 .. v6}, Lcom/shopkick/app/paypal/PayPalRedemptionConfirmationOverlay;->setMargins(Landroid/view/View;IIII)V

    .line 139
    new-instance v1, Lcom/shopkick/app/paypal/-$$Lambda$PayPalRedemptionConfirmationOverlay$VGxmHBVec4ThrkPEgEhTH6XiHS0;

    invoke-direct {v1, p0}, Lcom/shopkick/app/paypal/-$$Lambda$PayPalRedemptionConfirmationOverlay$VGxmHBVec4ThrkPEgEhTH6XiHS0;-><init>(Lcom/shopkick/app/paypal/PayPalRedemptionConfirmationOverlay;)V

    invoke-virtual {v9, v1}, Lcom/shopkick/app/widget/SKButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v1, 0x7f0904d3

    .line 143
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    move-object v9, v1

    check-cast v9, Lcom/shopkick/app/widget/SKButton;

    move-object v1, p0

    move-object v2, v9

    move v3, v8

    move v5, v7

    .line 144
    invoke-direct/range {v1 .. v6}, Lcom/shopkick/app/paypal/PayPalRedemptionConfirmationOverlay;->setMargins(Landroid/view/View;IIII)V

    .line 145
    new-instance p1, Lcom/shopkick/app/paypal/-$$Lambda$PayPalRedemptionConfirmationOverlay$IqRtKUnqR5yg746b7ihWqWsckSQ;

    invoke-direct {p1, p0, v9}, Lcom/shopkick/app/paypal/-$$Lambda$PayPalRedemptionConfirmationOverlay$IqRtKUnqR5yg746b7ihWqWsckSQ;-><init>(Lcom/shopkick/app/paypal/PayPalRedemptionConfirmationOverlay;Lcom/shopkick/app/widget/SKButton;)V

    invoke-virtual {v9, p1}, Lcom/shopkick/app/widget/SKButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-object v0
.end method

.method protected getOverlayTheme()I
    .locals 1

    const v0, 0x7f12022d

    return v0
.end method

.method protected getResId()I
    .locals 1

    const v0, 0x7f0c0150

    return v0
.end method

.method public getView()Landroid/view/View;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public init(Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;)V
    .locals 0

    .line 67
    invoke-super {p0, p1, p2}, Lcom/shopkick/app/overlays/base/SKOverlay;->init(Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;)V

    if-eqz p1, :cond_0

    .line 69
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    iput-object p2, p0, Lcom/shopkick/app/paypal/PayPalRedemptionConfirmationOverlay;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    .line 71
    iget-object p1, p1, Lcom/shopkick/app/application/ScreenGlobals;->apiManagerV2:Lcom/shopkick/fetchers/api/APIManager;

    iput-object p1, p0, Lcom/shopkick/app/paypal/PayPalRedemptionConfirmationOverlay;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    :cond_0
    return-void
.end method

.method public receivedResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V
    .locals 0

    return-void
.end method
