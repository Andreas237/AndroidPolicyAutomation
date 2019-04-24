.class public Lcom/shopkick/app/rewards/RedeemedRewardConfirmationScreen;
.super Lcom/shopkick/app/screens/AppScreen;
.source "RedeemedRewardConfirmationScreen.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/rewards/RedeemedRewardConfirmationScreen$UserActionButtonClick;
    }
.end annotation


# instance fields
.field private giftCardImage:Landroid/widget/ImageView;

.field private rewardDetailsUrl:Ljava/lang/String;

.field private rewardId:Ljava/lang/String;

.field private rewardImageUrl:Ljava/lang/String;

.field private shareUrl:Ljava/lang/String;

.field private urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 22
    invoke-direct {p0}, Lcom/shopkick/app/screens/AppScreen;-><init>()V

    return-void
.end method

.method static synthetic access$000(Lcom/shopkick/app/rewards/RedeemedRewardConfirmationScreen;Ljava/lang/String;)V
    .locals 0

    .line 22
    invoke-direct {p0, p1}, Lcom/shopkick/app/rewards/RedeemedRewardConfirmationScreen;->handleButtonClick(Ljava/lang/String;)V

    return-void
.end method

.method private handleButtonClick(Ljava/lang/String;)V
    .locals 1

    .line 69
    iget-object v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardConfirmationScreen;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/url/URLDispatcher;->dispatchURL(Ljava/lang/String;)Z

    return-void
.end method


# virtual methods
.method public createScreen(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    const p3, 0x7f11055b

    .line 44
    invoke-virtual {p0, p3}, Lcom/shopkick/app/rewards/RedeemedRewardConfirmationScreen;->setAppScreenTitle(I)V

    const p3, 0x7f0c0185

    const/4 v0, 0x0

    .line 45
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/RelativeLayout;

    const p2, 0x7f0902a8

    .line 48
    invoke-virtual {p1, p2}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/ImageView;

    iput-object p2, p0, Lcom/shopkick/app/rewards/RedeemedRewardConfirmationScreen;->giftCardImage:Landroid/widget/ImageView;

    .line 49
    iget-object p2, p0, Lcom/shopkick/app/rewards/RedeemedRewardConfirmationScreen;->giftCardImage:Landroid/widget/ImageView;

    invoke-static {p2}, Lcom/shopkick/app/util/GlideApp;->with(Landroid/view/View;)Lcom/shopkick/app/util/GlideRequests;

    move-result-object p2

    iget-object p3, p0, Lcom/shopkick/app/rewards/RedeemedRewardConfirmationScreen;->rewardImageUrl:Ljava/lang/String;

    invoke-virtual {p2, p3}, Lcom/shopkick/app/util/GlideRequests;->load(Ljava/lang/String;)Lcom/shopkick/app/util/GlideRequest;

    move-result-object p2

    invoke-virtual {p2}, Lcom/shopkick/app/util/GlideRequest;->centerCrop()Lcom/shopkick/app/util/GlideRequest;

    move-result-object p2

    iget-object p3, p0, Lcom/shopkick/app/rewards/RedeemedRewardConfirmationScreen;->giftCardImage:Landroid/widget/ImageView;

    invoke-virtual {p2, p3}, Lcom/shopkick/app/util/GlideRequest;->into(Landroid/widget/ImageView;)Lcom/bumptech/glide/request/target/ViewTarget;

    const p2, 0x7f090676

    .line 50
    invoke-virtual {p1, p2}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object p2

    new-instance p3, Lcom/shopkick/app/rewards/RedeemedRewardConfirmationScreen$UserActionButtonClick;

    iget-object v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardConfirmationScreen;->shareUrl:Ljava/lang/String;

    invoke-direct {p3, p0, v0}, Lcom/shopkick/app/rewards/RedeemedRewardConfirmationScreen$UserActionButtonClick;-><init>(Lcom/shopkick/app/rewards/RedeemedRewardConfirmationScreen;Ljava/lang/String;)V

    invoke-virtual {p2, p3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const p2, 0x7f09065e

    .line 51
    invoke-virtual {p1, p2}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object p2

    new-instance p3, Lcom/shopkick/app/rewards/RedeemedRewardConfirmationScreen$UserActionButtonClick;

    iget-object v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardConfirmationScreen;->rewardDetailsUrl:Ljava/lang/String;

    invoke-direct {p3, p0, v0}, Lcom/shopkick/app/rewards/RedeemedRewardConfirmationScreen$UserActionButtonClick;-><init>(Lcom/shopkick/app/rewards/RedeemedRewardConfirmationScreen;Ljava/lang/String;)V

    .line 52
    invoke-virtual {p2, p3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-object p1
.end method

.method public init(Lcom/shopkick/app/application/ScreenGlobals;Ljava/util/Map;)V
    .locals 0
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

    .line 35
    iget-object p1, p1, Lcom/shopkick/app/application/ScreenGlobals;->urlDispatcherFactory:Lcom/shopkick/app/url/URLDispatcherFactory;

    invoke-virtual {p1}, Lcom/shopkick/app/url/URLDispatcherFactory;->dispatcher()Lcom/shopkick/app/url/URLDispatcher;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/rewards/RedeemedRewardConfirmationScreen;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    const-string p1, "reward_id"

    .line 36
    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, Lcom/shopkick/app/rewards/RedeemedRewardConfirmationScreen;->rewardId:Ljava/lang/String;

    const-string p1, "reward_image_url"

    .line 37
    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, Lcom/shopkick/app/rewards/RedeemedRewardConfirmationScreen;->rewardImageUrl:Ljava/lang/String;

    const-string/jumbo p1, "share_url"

    .line 38
    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, Lcom/shopkick/app/rewards/RedeemedRewardConfirmationScreen;->shareUrl:Ljava/lang/String;

    const-string p1, "reward_details_url"

    .line 39
    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, Lcom/shopkick/app/rewards/RedeemedRewardConfirmationScreen;->rewardDetailsUrl:Ljava/lang/String;

    return-void
.end method

.method public onBackPressed()Lcom/shopkick/app/screens/AppScreen$BackPressedState;
    .locals 3

    .line 58
    invoke-super {p0}, Lcom/shopkick/app/screens/AppScreen;->onBackPressed()Lcom/shopkick/app/screens/AppScreen$BackPressedState;

    move-result-object v0

    .line 59
    sget-object v1, Lcom/shopkick/app/screens/AppScreen$BackPressedState;->PERFORM_SCREEN_BACK:Lcom/shopkick/app/screens/AppScreen$BackPressedState;

    if-ne v0, v1, :cond_0

    .line 60
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "reward_id"

    .line 61
    iget-object v2, p0, Lcom/shopkick/app/rewards/RedeemedRewardConfirmationScreen;->rewardId:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    const-class v1, Lcom/shopkick/app/rewards/RewardDetailsV2Screen;

    invoke-virtual {p0, v1, v0}, Lcom/shopkick/app/rewards/RedeemedRewardConfirmationScreen;->goToScreenInCurrentActivity(Ljava/lang/Class;Ljava/util/Map;)V

    .line 63
    sget-object v0, Lcom/shopkick/app/screens/AppScreen$BackPressedState;->DONT_GO_BACK:Lcom/shopkick/app/screens/AppScreen$BackPressedState;

    return-object v0

    :cond_0
    return-object v0
.end method
