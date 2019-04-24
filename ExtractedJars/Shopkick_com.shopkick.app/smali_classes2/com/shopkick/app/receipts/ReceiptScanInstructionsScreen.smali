.class public Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;
.super Lcom/shopkick/app/screens/AppScreen;
.source "ReceiptScanInstructionsScreen.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen$ReceiptInstructionScreenAdapter;
    }
.end annotation


# static fields
.field private static final FIRST_SCREEN_TAG:Ljava/lang/String; = "screen0"

.field public static final FORCE_WALKTHROUGH_TYPE:I = 0x2

.field public static final LIGHT_WALKTHROUGH_TYPE:I = 0x1

.field private static final NUM_ANIMATIONS:I = 0x3

.field public static final RECEIPT_INSTRUCTIONS_TYPE_KEY:Ljava/lang/String; = "INSTRUCTIONS_TYPE"

.field private static final SECOND_SCREEN_TAG:Ljava/lang/String; = "screen1"

.field private static final THIRD_SCREEN_TAG:Ljava/lang/String; = "screen2"


# instance fields
.field private animations:[Landroid/animation/AnimatorSet;

.field private chainId:Ljava/lang/String;

.field private clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

.field private ctaButton:Lcom/shopkick/app/widget/SKButton;

.field private final handler:Landroid/os/Handler;

.field private isAnimationThreeStarted:Z

.field private isAnimationTwoStarted:Z

.field private isAutoScrollingDisabled:Z

.field private isFirstScreenShown:Z

.field private isLightWalkThrough:Z

.field private locationId:Ljava/lang/String;

.field private mPager:Lcom/shopkick/app/widget/SKViewPager;

.field private mPagerAdapter:Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen$ReceiptInstructionScreenAdapter;

.field private mainView:Landroid/widget/RelativeLayout;

.field private pageIndicator:Lcom/shopkick/app/widget/PageIndicator;

.field private shouldResetScreen:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 39
    invoke-direct {p0}, Lcom/shopkick/app/screens/AppScreen;-><init>()V

    .line 57
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;->handler:Landroid/os/Handler;

    const/4 v0, 0x1

    .line 59
    iput-boolean v0, p0, Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;->isLightWalkThrough:Z

    const/4 v0, 0x0

    .line 60
    iput-boolean v0, p0, Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;->isFirstScreenShown:Z

    .line 61
    iput-boolean v0, p0, Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;->isAutoScrollingDisabled:Z

    .line 62
    iput-boolean v0, p0, Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;->isAnimationTwoStarted:Z

    .line 63
    iput-boolean v0, p0, Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;->isAnimationThreeStarted:Z

    .line 69
    iput-boolean v0, p0, Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;->shouldResetScreen:Z

    return-void
.end method

.method static synthetic access$100(Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;)Z
    .locals 0

    .line 39
    iget-boolean p0, p0, Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;->isAutoScrollingDisabled:Z

    return p0
.end method

.method static synthetic access$1000(Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;I)V
    .locals 0

    .line 39
    invoke-direct {p0, p1}, Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;->updateCTAButton(I)V

    return-void
.end method

.method static synthetic access$102(Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;Z)Z
    .locals 0

    .line 39
    iput-boolean p1, p0, Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;->isAutoScrollingDisabled:Z

    return p1
.end method

.method static synthetic access$200(Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;)Lcom/shopkick/app/widget/PageIndicator;
    .locals 0

    .line 39
    iget-object p0, p0, Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;->pageIndicator:Lcom/shopkick/app/widget/PageIndicator;

    return-object p0
.end method

.method static synthetic access$300(Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;)Landroid/os/Handler;
    .locals 0

    .line 39
    iget-object p0, p0, Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;->handler:Landroid/os/Handler;

    return-object p0
.end method

.method static synthetic access$400(Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;)Lcom/shopkick/app/widget/SKViewPager;
    .locals 0

    .line 39
    iget-object p0, p0, Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;->mPager:Lcom/shopkick/app/widget/SKViewPager;

    return-object p0
.end method

.method static synthetic access$500(Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;)Z
    .locals 0

    .line 39
    iget-boolean p0, p0, Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;->isLightWalkThrough:Z

    return p0
.end method

.method static synthetic access$600(Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;)[Landroid/animation/AnimatorSet;
    .locals 0

    .line 39
    iget-object p0, p0, Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;->animations:[Landroid/animation/AnimatorSet;

    return-object p0
.end method

.method static synthetic access$700(Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;Landroid/view/View;)V
    .locals 0

    .line 39
    invoke-direct {p0, p1}, Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;->setupAnimation(Landroid/view/View;)V

    return-void
.end method

.method static synthetic access$800(Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;)Z
    .locals 0

    .line 39
    iget-boolean p0, p0, Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;->isAnimationTwoStarted:Z

    return p0
.end method

.method static synthetic access$802(Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;Z)Z
    .locals 0

    .line 39
    iput-boolean p1, p0, Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;->isAnimationTwoStarted:Z

    return p1
.end method

.method static synthetic access$900(Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;)Z
    .locals 0

    .line 39
    iget-boolean p0, p0, Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;->isAnimationThreeStarted:Z

    return p0
.end method

.method static synthetic access$902(Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;Z)Z
    .locals 0

    .line 39
    iput-boolean p1, p0, Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;->isAnimationThreeStarted:Z

    return p1
.end method

.method public static synthetic lambda$setupAllButtons$208(Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;Landroid/view/View;)V
    .locals 2

    .line 193
    new-instance p1, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v0, 0x81

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x4

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {p1, v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 194
    invoke-direct {p0}, Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;->returnLogForCurrentScreen()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setReceiptScanInstructionsSubScreens(Ljava/lang/Integer;)V

    .line 195
    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    if-eqz v0, :cond_0

    .line 196
    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/logging/UserEventLogger;->detectedEvent(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    :cond_0
    const/4 p1, 0x1

    .line 198
    iput-boolean p1, p0, Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;->shouldResetScreen:Z

    .line 199
    invoke-direct {p0}, Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;->prepareAndGoToScanScreen()V

    return-void
.end method

.method public static synthetic lambda$setupAllButtons$209(Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;Landroid/view/View;)V
    .locals 2

    .line 203
    new-instance p1, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v0, 0x1d

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x4

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {p1, v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 204
    invoke-direct {p0}, Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;->returnLogForCurrentScreen()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setReceiptScanInstructionsSubScreens(Ljava/lang/Integer;)V

    .line 205
    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    if-eqz v0, :cond_0

    .line 206
    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/logging/UserEventLogger;->detectedEvent(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    .line 208
    :cond_0
    iget-boolean p1, p0, Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;->isLightWalkThrough:Z

    const/4 v0, 0x1

    if-eqz p1, :cond_1

    .line 209
    iput-boolean v0, p0, Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;->shouldResetScreen:Z

    .line 210
    invoke-direct {p0}, Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;->prepareAndGoToScanScreen()V

    goto :goto_0

    .line 211
    :cond_1
    iget-object p1, p0, Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;->mPager:Lcom/shopkick/app/widget/SKViewPager;

    invoke-virtual {p1}, Lcom/shopkick/app/widget/SKViewPager;->getCurrentItem()I

    move-result p1

    iget-object v1, p0, Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;->mPagerAdapter:Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen$ReceiptInstructionScreenAdapter;

    invoke-virtual {v1}, Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen$ReceiptInstructionScreenAdapter;->getCount()I

    move-result v1

    sub-int/2addr v1, v0

    if-ne p1, v1, :cond_2

    .line 212
    iput-boolean v0, p0, Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;->shouldResetScreen:Z

    .line 213
    invoke-direct {p0}, Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;->prepareAndGoToScanScreen()V

    goto :goto_0

    .line 215
    :cond_2
    iget-object p1, p0, Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;->mPager:Lcom/shopkick/app/widget/SKViewPager;

    invoke-virtual {p1}, Lcom/shopkick/app/widget/SKViewPager;->getCurrentItem()I

    move-result v1

    add-int/2addr v1, v0

    invoke-virtual {p1, v1}, Lcom/shopkick/app/widget/SKViewPager;->setCurrentItem(I)V

    :goto_0
    return-void
.end method

.method private prepareAndGoToScanScreen()V
    .locals 3

    .line 221
    invoke-direct {p0}, Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;->unsetStatusBarColor()V

    .line 222
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "chain_id"

    .line 223
    iget-object v2, p0, Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;->chainId:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "location_id"

    .line 224
    iget-object v2, p0, Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;->locationId:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 225
    iget-object v1, p0, Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v1, v1, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->disableOcrProcessing:Ljava/lang/Boolean;

    const/4 v2, 0x1

    invoke-static {v1, v2}, Lcom/shopkick/app/util/TypeUtils;->isTrue(Ljava/lang/Object;Z)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 226
    const-class v1, Lcom/shopkick/app/activities/ReceiptScanActivity;

    const-class v2, Lcom/shopkick/app/receipts/ReceiptScanScreen;

    invoke-virtual {p0, v1, v2, v0}, Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;->goToActivityWithScreen(Ljava/lang/Class;Ljava/lang/Class;Ljava/util/Map;)V

    goto :goto_0

    .line 228
    :cond_0
    const-class v1, Lcom/shopkick/app/activities/ReceiptScanActivity;

    const-class v2, Lcom/shopkick/app/receipts/ReceiptScanV2Screen;

    invoke-virtual {p0, v1, v2, v0}, Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;->goToActivityWithScreen(Ljava/lang/Class;Ljava/lang/Class;Ljava/util/Map;)V

    :goto_0
    return-void
.end method

.method private returnLogForCurrentScreen()I
    .locals 2

    .line 180
    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;->mPager:Lcom/shopkick/app/widget/SKViewPager;

    invoke-virtual {v0}, Lcom/shopkick/app/widget/SKViewPager;->getCurrentItem()I

    move-result v0

    const/4 v1, 0x1

    packed-switch v0, :pswitch_data_0

    .line 188
    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;->mPager:Lcom/shopkick/app/widget/SKViewPager;

    invoke-virtual {v0}, Lcom/shopkick/app/widget/SKViewPager;->getCurrentItem()I

    move-result v0

    add-int/2addr v0, v1

    return v0

    :pswitch_0
    const/4 v0, 0x3

    return v0

    :pswitch_1
    const/4 v0, 0x2

    return v0

    :pswitch_2
    return v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private setupAllButtons()V
    .locals 2

    .line 192
    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;->mainView:Landroid/widget/RelativeLayout;

    const v1, 0x7f090613

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    new-instance v1, Lcom/shopkick/app/receipts/-$$Lambda$ReceiptScanInstructionsScreen$LstR6dFqN79wMV17TmyFVC_pLwk;

    invoke-direct {v1, p0}, Lcom/shopkick/app/receipts/-$$Lambda$ReceiptScanInstructionsScreen$LstR6dFqN79wMV17TmyFVC_pLwk;-><init>(Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 202
    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;->ctaButton:Lcom/shopkick/app/widget/SKButton;

    new-instance v1, Lcom/shopkick/app/receipts/-$$Lambda$ReceiptScanInstructionsScreen$3isN7o7jwHMZoVIyZVbxsasPn8o;

    invoke-direct {v1, p0}, Lcom/shopkick/app/receipts/-$$Lambda$ReceiptScanInstructionsScreen$3isN7o7jwHMZoVIyZVbxsasPn8o;-><init>(Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;)V

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method private setupAnimation(Landroid/view/View;)V
    .locals 2

    .line 234
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    packed-switch v1, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    const-string v1, "screen2"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x2

    goto :goto_1

    :pswitch_1
    const-string v1, "screen1"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_1

    :pswitch_2
    const-string v1, "screen0"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    goto :goto_1

    :cond_0
    :goto_0
    const/4 v0, -0x1

    :goto_1
    packed-switch v0, :pswitch_data_1

    goto :goto_2

    .line 242
    :pswitch_3
    invoke-direct {p0, p1}, Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;->setupThirdAnimation(Landroid/view/View;)V

    goto :goto_2

    .line 239
    :pswitch_4
    invoke-direct {p0, p1}, Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;->setupSecondAnimation(Landroid/view/View;)V

    goto :goto_2

    .line 236
    :pswitch_5
    invoke-direct {p0, p1}, Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;->setupFirstAnimation(Landroid/view/View;)V

    :goto_2
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x72d24d44
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
    .end packed-switch
.end method

.method private setupFirstAnimation(Landroid/view/View;)V
    .locals 14

    .line 260
    iget-boolean v0, p0, Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;->isFirstScreenShown:Z

    if-nez v0, :cond_2

    invoke-virtual {p0}, Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    if-nez v0, :cond_0

    goto/16 :goto_0

    :cond_0
    const v0, 0x7f0906ee

    .line 264
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    const v1, 0x7f090353

    .line 265
    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    const v2, 0x7f0901cb

    .line 266
    invoke-virtual {p1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/ImageView;

    const v3, 0x7f09043f

    .line 267
    invoke-virtual {p1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/ImageView;

    const v4, 0x7f090539

    .line 268
    invoke-virtual {p1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/ImageView;

    const v5, 0x7f090765

    .line 269
    invoke-virtual {p1, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    .line 271
    invoke-virtual {p0}, Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v5

    invoke-virtual {v5}, Landroid/support/v4/app/FragmentActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v5

    const v6, 0x7f01001f

    .line 273
    invoke-static {v5, v6}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v7

    .line 274
    invoke-static {v5, v6}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v8

    .line 275
    invoke-static {v5, v6}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v9

    .line 276
    invoke-static {v5, v6}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v10

    .line 277
    invoke-static {v5, v6}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v11

    .line 278
    invoke-static {v5, v6}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v5

    const-wide/16 v12, 0x96

    .line 279
    invoke-virtual {v7, v12, v13}, Landroid/view/animation/Animation;->setStartOffset(J)V

    const-wide/16 v12, 0x12c

    .line 280
    invoke-virtual {v8, v12, v13}, Landroid/view/animation/Animation;->setStartOffset(J)V

    const-wide/16 v12, 0x1c2

    .line 281
    invoke-virtual {v9, v12, v13}, Landroid/view/animation/Animation;->setStartOffset(J)V

    const-wide/16 v12, 0x258

    .line 282
    invoke-virtual {v10, v12, v13}, Landroid/view/animation/Animation;->setStartOffset(J)V

    const-wide/16 v12, 0x2ee

    .line 283
    invoke-virtual {v11, v12, v13}, Landroid/view/animation/Animation;->setStartOffset(J)V

    const-wide/16 v12, 0x384

    .line 284
    invoke-virtual {v5, v12, v13}, Landroid/view/animation/Animation;->setStartOffset(J)V

    .line 285
    iget-boolean v6, p0, Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;->isLightWalkThrough:Z

    if-eqz v6, :cond_1

    .line 286
    new-instance v6, Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen$2;

    invoke-direct {v6, p0}, Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen$2;-><init>(Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;)V

    invoke-virtual {v5, v6}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 305
    :cond_1
    invoke-virtual {v0, v7}, Landroid/widget/ImageView;->startAnimation(Landroid/view/animation/Animation;)V

    .line 306
    invoke-virtual {v3, v8}, Landroid/widget/ImageView;->startAnimation(Landroid/view/animation/Animation;)V

    .line 307
    invoke-virtual {v1, v9}, Landroid/widget/ImageView;->startAnimation(Landroid/view/animation/Animation;)V

    .line 308
    invoke-virtual {v4, v10}, Landroid/widget/ImageView;->startAnimation(Landroid/view/animation/Animation;)V

    .line 309
    invoke-virtual {v2, v11}, Landroid/widget/ImageView;->startAnimation(Landroid/view/animation/Animation;)V

    .line 310
    invoke-virtual {p1, v5}, Landroid/widget/ImageView;->startAnimation(Landroid/view/animation/Animation;)V

    const/4 p1, 0x1

    .line 312
    iput-boolean p1, p0, Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;->isFirstScreenShown:Z

    return-void

    :cond_2
    :goto_0
    return-void
.end method

.method private setupSecondAnimation(Landroid/view/View;)V
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const v2, 0x7f090450

    .line 316
    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/ImageView;

    const v3, 0x7f090623

    .line 317
    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    .line 318
    new-instance v3, Landroid/animation/AnimatorSet;

    invoke-direct {v3}, Landroid/animation/AnimatorSet;-><init>()V

    const-string v4, "alpha"

    const/4 v5, 0x3

    .line 320
    new-array v6, v5, [F

    fill-array-data v6, :array_0

    invoke-static {v1, v4, v6}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v4

    const-wide/16 v6, 0x1f4

    .line 321
    invoke-virtual {v4, v6, v7}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 323
    invoke-virtual/range {p0 .. p0}, Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;->getContext()Landroid/content/Context;

    move-result-object v8

    invoke-virtual {v8}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v8

    invoke-virtual {v8}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v8

    iget v8, v8, Landroid/util/DisplayMetrics;->density:F

    const/high16 v9, -0x3d140000    # -118.0f

    mul-float/2addr v8, v9

    const-string/jumbo v9, "translationY"

    const/4 v10, 0x2

    .line 325
    new-array v11, v10, [F

    const/4 v12, 0x0

    const/4 v13, 0x0

    aput v12, v11, v13

    const/4 v14, 0x1

    aput v8, v11, v14

    invoke-static {v2, v9, v11}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v9

    const-wide/16 v14, 0x258

    .line 326
    invoke-virtual {v9, v14, v15}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 327
    invoke-virtual {v9, v13}, Landroid/animation/ObjectAnimator;->setRepeatCount(I)V

    const-string v11, "alpha"

    .line 329
    new-array v5, v5, [F

    fill-array-data v5, :array_1

    invoke-static {v1, v11, v5}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v1

    .line 330
    invoke-virtual {v1, v6, v7}, Landroid/animation/ObjectAnimator;->setStartDelay(J)V

    .line 331
    invoke-virtual {v1, v6, v7}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    const-string/jumbo v5, "translationY"

    .line 333
    new-array v6, v10, [F

    aput v8, v6, v13

    const/4 v7, 0x1

    aput v12, v6, v7

    invoke-static {v2, v5, v6}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v2

    .line 334
    invoke-virtual {v2, v14, v15}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 335
    invoke-virtual {v2, v14, v15}, Landroid/animation/ObjectAnimator;->setStartDelay(J)V

    .line 336
    invoke-virtual {v9, v13}, Landroid/animation/ObjectAnimator;->setRepeatCount(I)V

    .line 338
    invoke-virtual {v3, v4}, Landroid/animation/AnimatorSet;->play(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    move-result-object v4

    invoke-virtual {v4, v9}, Landroid/animation/AnimatorSet$Builder;->before(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    .line 339
    invoke-virtual {v3, v1}, Landroid/animation/AnimatorSet;->play(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    move-result-object v4

    invoke-virtual {v4, v9}, Landroid/animation/AnimatorSet$Builder;->after(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    .line 340
    invoke-virtual {v3, v2}, Landroid/animation/AnimatorSet;->play(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    move-result-object v2

    invoke-virtual {v2, v1}, Landroid/animation/AnimatorSet$Builder;->after(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    .line 341
    iget-object v1, v0, Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;->animations:[Landroid/animation/AnimatorSet;

    const/4 v2, 0x1

    aput-object v3, v1, v2

    .line 342
    new-instance v1, Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen$3;

    invoke-direct {v1, v0}, Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen$3;-><init>(Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;)V

    invoke-virtual {v3, v1}, Landroid/animation/AnimatorSet;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 363
    iput-boolean v13, v0, Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;->isAnimationTwoStarted:Z

    return-void

    nop

    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
        0x0
    .end array-data

    :array_1
    .array-data 4
        0x0
        0x3f800000    # 1.0f
        0x0
    .end array-data
.end method

.method private setupStatusBarColor()V
    .locals 3

    .line 140
    invoke-virtual {p0}, Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {p0}, Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-virtual {v1}, Landroid/support/v4/app/FragmentActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f060120

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/view/Window;->setStatusBarColor(I)V

    return-void
.end method

.method private setupThirdAnimation(Landroid/view/View;)V
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const v2, 0x7f090521

    .line 367
    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/ImageView;

    const v3, 0x7f090522

    .line 368
    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/ImageView;

    const v4, 0x7f090624

    .line 369
    invoke-virtual {v1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/ImageView;

    const v5, 0x7f090625

    .line 370
    invoke-virtual {v1, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/ImageView;

    const v6, 0x7f090411

    .line 371
    invoke-virtual {v1, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Landroid/widget/ImageView;

    const v7, 0x7f0905eb

    .line 372
    invoke-virtual {v1, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    .line 374
    new-instance v7, Landroid/animation/AnimatorSet;

    invoke-direct {v7}, Landroid/animation/AnimatorSet;-><init>()V

    const-string v8, "alpha"

    const/4 v9, 0x3

    .line 376
    new-array v10, v9, [F

    fill-array-data v10, :array_0

    invoke-static {v2, v8, v10}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v2

    const-wide/16 v10, 0x1f4

    .line 377
    invoke-virtual {v2, v10, v11}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    const-string v8, "alpha"

    const/4 v12, 0x2

    .line 380
    new-array v13, v12, [F

    fill-array-data v13, :array_1

    invoke-static {v4, v8, v13}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v8

    const-wide/16 v13, 0xfa

    .line 381
    invoke-virtual {v8, v13, v14}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    const-string v15, "alpha"

    .line 383
    new-array v13, v12, [F

    fill-array-data v13, :array_2

    invoke-static {v15, v13}, Landroid/animation/PropertyValuesHolder;->ofFloat(Ljava/lang/String;[F)Landroid/animation/PropertyValuesHolder;

    move-result-object v13

    const-string v14, "scaleX"

    .line 384
    new-array v15, v12, [F

    fill-array-data v15, :array_3

    invoke-static {v14, v15}, Landroid/animation/PropertyValuesHolder;->ofFloat(Ljava/lang/String;[F)Landroid/animation/PropertyValuesHolder;

    move-result-object v14

    const-string v15, "scaleY"

    .line 385
    new-array v10, v12, [F

    fill-array-data v10, :array_4

    invoke-static {v15, v10}, Landroid/animation/PropertyValuesHolder;->ofFloat(Ljava/lang/String;[F)Landroid/animation/PropertyValuesHolder;

    move-result-object v10

    .line 386
    new-array v11, v9, [Landroid/animation/PropertyValuesHolder;

    const/4 v15, 0x0

    aput-object v13, v11, v15

    const/16 v16, 0x1

    aput-object v14, v11, v16

    aput-object v10, v11, v12

    invoke-static {v6, v11}, Landroid/animation/ObjectAnimator;->ofPropertyValuesHolder(Ljava/lang/Object;[Landroid/animation/PropertyValuesHolder;)Landroid/animation/ObjectAnimator;

    move-result-object v11

    move-object/from16 v17, v13

    const-wide/16 v12, 0x96

    .line 387
    invoke-virtual {v11, v12, v13}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    const-string v12, "alpha"

    .line 389
    new-array v13, v9, [F

    fill-array-data v13, :array_5

    invoke-static {v3, v12, v13}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v3

    const-wide/16 v12, 0x2ee

    .line 390
    invoke-virtual {v3, v12, v13}, Landroid/animation/ObjectAnimator;->setStartDelay(J)V

    const-wide/16 v12, 0x1f4

    .line 391
    invoke-virtual {v3, v12, v13}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    const-string v12, "alpha"

    const/4 v13, 0x2

    .line 393
    new-array v15, v13, [F

    fill-array-data v15, :array_6

    invoke-static {v5, v12, v15}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v12

    move-object/from16 p1, v14

    const-wide/16 v13, 0xfa

    .line 394
    invoke-virtual {v12, v13, v14}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 396
    new-array v9, v9, [Landroid/animation/PropertyValuesHolder;

    const/4 v13, 0x0

    aput-object v17, v9, v13

    aput-object p1, v9, v16

    const/4 v13, 0x2

    aput-object v10, v9, v13

    invoke-static {v1, v9}, Landroid/animation/ObjectAnimator;->ofPropertyValuesHolder(Ljava/lang/Object;[Landroid/animation/PropertyValuesHolder;)Landroid/animation/ObjectAnimator;

    move-result-object v9

    const-wide/16 v14, 0x96

    .line 397
    invoke-virtual {v9, v14, v15}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    const-string v10, "alpha"

    .line 399
    new-array v14, v13, [F

    fill-array-data v14, :array_7

    invoke-static {v4, v10, v14}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v4

    const-wide/16 v14, 0x5dc

    .line 400
    invoke-virtual {v4, v14, v15}, Landroid/animation/ObjectAnimator;->setStartDelay(J)V

    const-wide/16 v14, 0x1f4

    .line 401
    invoke-virtual {v4, v14, v15}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    const-string v10, "alpha"

    .line 403
    new-array v14, v13, [F

    fill-array-data v14, :array_8

    invoke-static {v6, v10, v14}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v6

    const-wide/16 v14, 0x5dc

    .line 404
    invoke-virtual {v6, v14, v15}, Landroid/animation/ObjectAnimator;->setStartDelay(J)V

    const-wide/16 v14, 0x1f4

    .line 405
    invoke-virtual {v6, v14, v15}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    const-string v10, "alpha"

    .line 407
    new-array v14, v13, [F

    fill-array-data v14, :array_9

    invoke-static {v5, v10, v14}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v5

    const-wide/16 v14, 0x5dc

    .line 408
    invoke-virtual {v5, v14, v15}, Landroid/animation/ObjectAnimator;->setStartDelay(J)V

    const-wide/16 v14, 0x1f4

    .line 409
    invoke-virtual {v5, v14, v15}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    const-string v10, "alpha"

    .line 411
    new-array v14, v13, [F

    fill-array-data v14, :array_a

    invoke-static {v1, v10, v14}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v1

    const-wide/16 v13, 0x5dc

    .line 412
    invoke-virtual {v1, v13, v14}, Landroid/animation/ObjectAnimator;->setStartDelay(J)V

    const-wide/16 v13, 0x1f4

    .line 413
    invoke-virtual {v1, v13, v14}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 415
    invoke-virtual {v7, v2}, Landroid/animation/AnimatorSet;->play(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    move-result-object v2

    invoke-virtual {v2, v8}, Landroid/animation/AnimatorSet$Builder;->before(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    .line 416
    invoke-virtual {v7, v11}, Landroid/animation/AnimatorSet;->play(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    move-result-object v2

    invoke-virtual {v2, v8}, Landroid/animation/AnimatorSet$Builder;->after(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    .line 417
    invoke-virtual {v7, v3}, Landroid/animation/AnimatorSet;->play(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    move-result-object v2

    invoke-virtual {v2, v11}, Landroid/animation/AnimatorSet$Builder;->after(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    .line 418
    invoke-virtual {v7, v12}, Landroid/animation/AnimatorSet;->play(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    move-result-object v2

    invoke-virtual {v2, v3}, Landroid/animation/AnimatorSet$Builder;->after(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    .line 419
    invoke-virtual {v7, v9}, Landroid/animation/AnimatorSet;->play(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    move-result-object v2

    invoke-virtual {v2, v12}, Landroid/animation/AnimatorSet$Builder;->after(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    .line 420
    invoke-virtual {v7, v6}, Landroid/animation/AnimatorSet;->play(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    move-result-object v2

    invoke-virtual {v2, v9}, Landroid/animation/AnimatorSet$Builder;->after(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    .line 421
    invoke-virtual {v7, v4}, Landroid/animation/AnimatorSet;->play(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    move-result-object v2

    invoke-virtual {v2, v9}, Landroid/animation/AnimatorSet$Builder;->after(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    .line 422
    invoke-virtual {v7, v1}, Landroid/animation/AnimatorSet;->play(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    move-result-object v1

    invoke-virtual {v1, v9}, Landroid/animation/AnimatorSet$Builder;->after(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    .line 423
    invoke-virtual {v7, v5}, Landroid/animation/AnimatorSet;->play(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    move-result-object v1

    invoke-virtual {v1, v9}, Landroid/animation/AnimatorSet$Builder;->after(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    .line 424
    iget-object v1, v0, Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;->animations:[Landroid/animation/AnimatorSet;

    const/4 v2, 0x2

    aput-object v7, v1, v2

    .line 425
    new-instance v1, Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen$4;

    invoke-direct {v1, v0}, Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen$4;-><init>(Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;)V

    invoke-virtual {v7, v1}, Landroid/animation/AnimatorSet;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    const/4 v1, 0x0

    .line 443
    iput-boolean v1, v0, Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;->isAnimationThreeStarted:Z

    return-void

    nop

    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
        0x0
    .end array-data

    :array_1
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data

    :array_2
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data

    :array_3
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data

    :array_4
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data

    :array_5
    .array-data 4
        0x0
        0x3f800000    # 1.0f
        0x0
    .end array-data

    :array_6
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data

    :array_7
    .array-data 4
        0x3f800000    # 1.0f
        0x0
    .end array-data

    :array_8
    .array-data 4
        0x3f800000    # 1.0f
        0x0
    .end array-data

    :array_9
    .array-data 4
        0x3f800000    # 1.0f
        0x0
    .end array-data

    :array_a
    .array-data 4
        0x3f800000    # 1.0f
        0x0
    .end array-data
.end method

.method private unsetStatusBarColor()V
    .locals 3

    .line 144
    invoke-virtual {p0}, Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {p0}, Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-virtual {v1}, Landroid/support/v4/app/FragmentActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f060021

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/view/Window;->setStatusBarColor(I)V

    return-void
.end method

.method private updateCTAButton(I)V
    .locals 1

    .line 249
    iget-boolean v0, p0, Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;->isLightWalkThrough:Z

    if-eqz v0, :cond_0

    const p1, 0x7f110536

    .line 250
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    goto :goto_0

    .line 251
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;->mPagerAdapter:Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen$ReceiptInstructionScreenAdapter;

    invoke-virtual {v0}, Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen$ReceiptInstructionScreenAdapter;->getCount()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-ne p1, v0, :cond_1

    const p1, 0x7f110534

    .line 252
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    goto :goto_0

    :cond_1
    const p1, 0x7f110535

    .line 254
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    .line 256
    :goto_0
    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;->ctaButton:Lcom/shopkick/app/widget/SKButton;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/shopkick/app/widget/SKButton;->setButtonText(I)V

    return-void
.end method


# virtual methods
.method public createScreen(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    .line 85
    invoke-virtual {p0}, Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object p2

    invoke-virtual {p2}, Landroid/support/v4/app/FragmentActivity;->getWindow()Landroid/view/Window;

    move-result-object p2

    const/16 p3, 0x400

    const/high16 v0, 0x4000000

    invoke-virtual {p2, p3, v0}, Landroid/view/Window;->setFlags(II)V

    .line 86
    invoke-virtual {p0}, Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object p2

    invoke-virtual {p2}, Landroid/support/v4/app/FragmentActivity;->getWindow()Landroid/view/Window;

    move-result-object p2

    const/high16 p3, -0x80000000

    invoke-virtual {p2, p3}, Landroid/view/Window;->addFlags(I)V

    .line 87
    invoke-direct {p0}, Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;->setupStatusBarColor()V

    const/4 p2, 0x3

    .line 88
    new-array p2, p2, [Landroid/animation/AnimatorSet;

    iput-object p2, p0, Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;->animations:[Landroid/animation/AnimatorSet;

    const/4 p2, 0x0

    const/4 p3, 0x0

    const v0, 0x7f0c0172

    .line 89
    invoke-virtual {p1, v0, p2, p3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/RelativeLayout;

    iput-object p1, p0, Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;->mainView:Landroid/widget/RelativeLayout;

    .line 90
    iget-object p1, p0, Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;->mainView:Landroid/widget/RelativeLayout;

    const v0, 0x7f0901bd

    invoke-virtual {p1, v0}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/widget/SKButton;

    iput-object p1, p0, Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;->ctaButton:Lcom/shopkick/app/widget/SKButton;

    .line 91
    invoke-direct {p0}, Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;->setupAllButtons()V

    .line 92
    iget-object p1, p0, Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;->mainView:Landroid/widget/RelativeLayout;

    const v0, 0x7f09032c

    invoke-virtual {p1, v0}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/widget/SKViewPager;

    iput-object p1, p0, Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;->mPager:Lcom/shopkick/app/widget/SKViewPager;

    .line 93
    new-instance p1, Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen$ReceiptInstructionScreenAdapter;

    invoke-direct {p1, p0, p2}, Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen$ReceiptInstructionScreenAdapter;-><init>(Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen$1;)V

    iput-object p1, p0, Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;->mPagerAdapter:Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen$ReceiptInstructionScreenAdapter;

    .line 94
    iget-object p1, p0, Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;->mPager:Lcom/shopkick/app/widget/SKViewPager;

    iget-object p2, p0, Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;->mPagerAdapter:Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen$ReceiptInstructionScreenAdapter;

    invoke-virtual {p1, p2}, Lcom/shopkick/app/widget/SKViewPager;->setAdapter(Landroid/support/v4/view/PagerAdapter;)V

    .line 95
    iget-object p1, p0, Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;->mPager:Lcom/shopkick/app/widget/SKViewPager;

    invoke-virtual {p1, p3}, Lcom/shopkick/app/widget/SKViewPager;->setCurrentItem(I)V

    .line 96
    iget-object p1, p0, Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;->mPager:Lcom/shopkick/app/widget/SKViewPager;

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Lcom/shopkick/app/widget/SKViewPager;->setPagingEnabled(Z)V

    .line 97
    iget-object p1, p0, Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;->mPager:Lcom/shopkick/app/widget/SKViewPager;

    new-instance p2, Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen$1;

    invoke-direct {p2, p0}, Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen$1;-><init>(Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;)V

    invoke-virtual {p1, p2}, Lcom/shopkick/app/widget/SKViewPager;->addOnPageChangeListener(Landroid/support/v4/view/ViewPager$OnPageChangeListener;)V

    .line 128
    iget-object p1, p0, Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;->mainView:Landroid/widget/RelativeLayout;

    const p2, 0x7f09030b

    invoke-virtual {p1, p2}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/RelativeLayout;

    .line 129
    new-instance p2, Lcom/shopkick/app/widget/PageIndicator;

    invoke-virtual {p0}, Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getBaseContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p2, v0}, Lcom/shopkick/app/widget/PageIndicator;-><init>(Landroid/content/Context;)V

    iput-object p2, p0, Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;->pageIndicator:Lcom/shopkick/app/widget/PageIndicator;

    .line 130
    iget-object p2, p0, Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;->pageIndicator:Lcom/shopkick/app/widget/PageIndicator;

    const v0, 0x7f08013b

    invoke-virtual {p2, v0}, Lcom/shopkick/app/widget/PageIndicator;->setActiveIndicatorImageResourceId(I)Lcom/shopkick/app/widget/PageIndicator;

    .line 131
    iget-object p2, p0, Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;->pageIndicator:Lcom/shopkick/app/widget/PageIndicator;

    const v0, 0x7f08013c

    invoke-virtual {p2, v0}, Lcom/shopkick/app/widget/PageIndicator;->setInactiveIndicatorImageResourceId(I)Lcom/shopkick/app/widget/PageIndicator;

    .line 132
    iget-object p2, p0, Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;->pageIndicator:Lcom/shopkick/app/widget/PageIndicator;

    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;->mPagerAdapter:Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen$ReceiptInstructionScreenAdapter;

    invoke-virtual {v0}, Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen$ReceiptInstructionScreenAdapter;->getCount()I

    move-result v0

    invoke-virtual {p2, p1, v0, p3}, Lcom/shopkick/app/widget/PageIndicator;->configureIndicators(Landroid/widget/RelativeLayout;II)V

    .line 133
    iget-boolean p1, p0, Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;->isLightWalkThrough:Z

    if-eqz p1, :cond_0

    .line 134
    iget-object p1, p0, Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;->mPager:Lcom/shopkick/app/widget/SKViewPager;

    const/16 p2, 0x4b0

    invoke-virtual {p1, p2}, Lcom/shopkick/app/widget/SKViewPager;->setViewPagerScrollerDelay(I)V

    .line 136
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;->mainView:Landroid/widget/RelativeLayout;

    return-object p1
.end method

.method public init(Lcom/shopkick/app/application/ScreenGlobals;Ljava/util/Map;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/shopkick/app/application/ScreenGlobals;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string v0, "location_id"

    .line 73
    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;->locationId:Ljava/lang/String;

    const-string v0, "chain_id"

    .line 74
    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;->chainId:Ljava/lang/String;

    const-string v0, "INSTRUCTIONS_TYPE"

    .line 75
    invoke-interface {p2, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    const-string v0, "INSTRUCTIONS_TYPE"

    .line 76
    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    .line 78
    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    .line 76
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    iput-boolean v1, p0, Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;->isLightWalkThrough:Z

    .line 79
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->userAccount:Lcom/shopkick/app/account/UserAccount;

    invoke-virtual {p2}, Lcom/shopkick/app/account/UserAccount;->receiptScanInstructionsViewed()V

    .line 80
    iget-object p1, p1, Lcom/shopkick/app/application/ScreenGlobals;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iput-object p1, p0, Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    return-void
.end method

.method public onDestroy()V
    .locals 4

    .line 158
    invoke-direct {p0}, Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;->unsetStatusBarColor()V

    .line 159
    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;->handler:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 160
    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;->animations:[Landroid/animation/AnimatorSet;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    if-eqz v3, :cond_0

    .line 162
    invoke-virtual {v3}, Landroid/animation/AnimatorSet;->removeAllListeners()V

    .line 163
    invoke-virtual {v3}, Landroid/animation/AnimatorSet;->cancel()V

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 166
    :cond_1
    invoke-super {p0}, Lcom/shopkick/app/screens/AppScreen;->onDestroy()V

    return-void
.end method

.method public onScreenWillShow()V
    .locals 2

    .line 149
    iget-boolean v0, p0, Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;->shouldResetScreen:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 150
    iput-boolean v0, p0, Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;->isAutoScrollingDisabled:Z

    .line 151
    iget-object v1, p0, Lcom/shopkick/app/receipts/ReceiptScanInstructionsScreen;->mPager:Lcom/shopkick/app/widget/SKViewPager;

    invoke-virtual {v1, v0}, Lcom/shopkick/app/widget/SKViewPager;->setCurrentItem(I)V

    .line 153
    :cond_0
    invoke-super {p0}, Lcom/shopkick/app/screens/AppScreen;->onScreenWillShow()V

    return-void
.end method

.method public shouldDisplayAppScreenHeader()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public shouldHideBack()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
