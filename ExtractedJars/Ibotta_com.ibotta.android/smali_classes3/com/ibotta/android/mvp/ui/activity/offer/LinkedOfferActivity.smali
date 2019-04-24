.class public Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferActivity;
.super Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;
.source "LinkedOfferActivity.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferView;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity<",
        "Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferPresenter;",
        "Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferComponent;",
        ">;",
        "Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferView;"
    }
.end annotation


# static fields
.field public static final RESULT_CANCELED:I = 0x3

.field public static final RESULT_ERROR:I = 0x2

.field public static final RESULT_SUCCESS:I = 0x1


# instance fields
.field protected appHelper:Lcom/ibotta/android/util/AppHelper;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected ibClose:Landroid/widget/ImageButton;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090231
    .end annotation
.end field

.field protected imageCache:Lcom/ibotta/android/images/ImageCache;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field private offerId:I

.field private originRetailerId:Ljava/lang/Integer;

.field protected pfivProduct:Lcom/ibotta/android/commons/view/PerfectFitImageView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f09039c
    .end annotation
.end field

.field private rewardId:J

.field protected tracker:Lcom/ibotta/android/tracking/Tracker;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected tvDetails:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090518
    .end annotation
.end field

.field protected tvEarn:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f09051b
    .end annotation
.end field

.field protected tvName:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f09054d
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 37
    invoke-direct {p0}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;-><init>()V

    const/4 v0, -0x1

    .line 54
    iput v0, p0, Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferActivity;->offerId:I

    const-wide/16 v0, -0x1

    .line 55
    iput-wide v0, p0, Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferActivity;->rewardId:J

    return-void
.end method

.method private finishWithResult(I)V
    .locals 0

    .line 172
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferActivity;->setResult(I)V

    .line 173
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferActivity;->finish()V

    return-void
.end method

.method private loadState(Landroid/os/Bundle;)V
    .locals 4

    const-wide/16 v0, -0x1

    const/4 v2, -0x1

    if-eqz p1, :cond_1

    const-string v3, "origin_retailer_id"

    .line 91
    invoke-virtual {p1, v3}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    const-string v3, "origin_retailer_id"

    .line 92
    invoke-virtual {p1, v3, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    iput-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferActivity;->originRetailerId:Ljava/lang/Integer;

    :cond_0
    const-string v3, "offer_id"

    .line 94
    invoke-virtual {p1, v3, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v3

    iput v3, p0, Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferActivity;->offerId:I

    const-string v3, "reward_id"

    .line 95
    invoke-virtual {p1, v3, v0, v1}, Landroid/os/Bundle;->getLong(Ljava/lang/String;J)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferActivity;->rewardId:J

    goto :goto_0

    .line 96
    :cond_1
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    if-eqz p1, :cond_3

    .line 97
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v3, "origin_retailer_id"

    invoke-virtual {p1, v3}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 98
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v3, "origin_retailer_id"

    invoke-virtual {p1, v3, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferActivity;->originRetailerId:Ljava/lang/Integer;

    .line 100
    :cond_2
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v3, "offer_id"

    invoke-virtual {p1, v3, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result p1

    iput p1, p0, Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferActivity;->offerId:I

    .line 101
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v3, "reward_id"

    invoke-virtual {p1, v3, v0, v1}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferActivity;->rewardId:J

    .line 104
    :cond_3
    :goto_0
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferActivity;->originRetailerId:Ljava/lang/Integer;

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    if-ne p1, v2, :cond_4

    const/4 p1, 0x0

    .line 105
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferActivity;->originRetailerId:Ljava/lang/Integer;

    .line 108
    :cond_4
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferPresenter;

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferActivity;->originRetailerId:Ljava/lang/Integer;

    iget v1, p0, Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferActivity;->offerId:I

    iget-wide v2, p0, Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferActivity;->rewardId:J

    invoke-interface {p1, v0, v1, v2, v3}, Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferPresenter;->setOfferInfo(Ljava/lang/Integer;IJ)V

    return-void
.end method


# virtual methods
.method protected bridge synthetic createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/base/MvpComponent;
    .locals 0

    .line 37
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferActivity;->createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferComponent;

    move-result-object p1

    return-object p1
.end method

.method protected createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferComponent;
    .locals 1

    .line 59
    invoke-static {}, Lcom/ibotta/android/mvp/ui/activity/offer/DaggerLinkedOfferComponent;->builder()Lcom/ibotta/android/mvp/ui/activity/offer/DaggerLinkedOfferComponent$Builder;

    move-result-object v0

    .line 60
    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/offer/DaggerLinkedOfferComponent$Builder;->mainComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/offer/DaggerLinkedOfferComponent$Builder;

    move-result-object p1

    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferModule;

    invoke-direct {v0, p0}, Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferModule;-><init>(Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferView;)V

    .line 61
    invoke-virtual {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/offer/DaggerLinkedOfferComponent$Builder;->linkedOfferModule(Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferModule;)Lcom/ibotta/android/mvp/ui/activity/offer/DaggerLinkedOfferComponent$Builder;

    move-result-object p1

    .line 62
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/offer/DaggerLinkedOfferComponent$Builder;->build()Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferComponent;

    move-result-object p1

    return-object p1
.end method

.method public finishWithCancel()V
    .locals 1

    const/4 v0, 0x3

    .line 148
    invoke-direct {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferActivity;->finishWithResult(I)V

    return-void
.end method

.method public finishWithError()V
    .locals 1

    const/4 v0, 0x2

    .line 153
    invoke-direct {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferActivity;->finishWithResult(I)V

    return-void
.end method

.method public finishWithSuccess()V
    .locals 1

    const/4 v0, 0x1

    .line 143
    invoke-direct {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferActivity;->finishWithResult(I)V

    return-void
.end method

.method public initForOffer(Lcom/ibotta/api/model/OfferModel;)V
    .locals 4

    .line 123
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferActivity;->appHelper:Lcom/ibotta/android/util/AppHelper;

    invoke-interface {v0, p1}, Lcom/ibotta/android/util/AppHelper;->getBestOfferImgUrl(Lcom/ibotta/api/model/OfferModel;)Ljava/lang/String;

    move-result-object v0

    .line 124
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferActivity;->imageCache:Lcom/ibotta/android/images/ImageCache;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferActivity;->pfivProduct:Lcom/ibotta/android/commons/view/PerfectFitImageView;

    sget-object v3, Lcom/ibotta/android/views/images/Sizes;->SPOTLIGHT:Lcom/ibotta/android/views/images/Sizes;

    invoke-interface {v1, p0, v0, v2, v3}, Lcom/ibotta/android/images/ImageCache;->load(Landroid/content/Context;Ljava/lang/String;Landroid/widget/ImageView;Lcom/ibotta/android/images/ImageCache$Size;)Lcom/ibotta/android/images/ImageLoadJob;

    .line 126
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferActivity;->tvEarn:Landroid/widget/TextView;

    invoke-interface {p1}, Lcom/ibotta/api/model/OfferModel;->getCurrentValue()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 128
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferActivity;->tvName:Landroid/widget/TextView;

    invoke-interface {p1}, Lcom/ibotta/api/model/OfferModel;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 129
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferActivity;->tvDetails:Landroid/widget/TextView;

    invoke-interface {p1}, Lcom/ibotta/api/model/OfferModel;->getDescription()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method protected bridge synthetic inject(Lcom/ibotta/android/mvp/base/MvpComponent;)V
    .locals 0

    .line 37
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferComponent;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferActivity;->inject(Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferComponent;)V

    return-void
.end method

.method protected inject(Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferComponent;)V
    .locals 0

    .line 67
    invoke-interface {p1, p0}, Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferComponent;->inject(Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferActivity;)V

    return-void
.end method

.method public launchNewOffer(Lcom/ibotta/android/fragment/retailer/RetailerParcel;I)V
    .locals 3

    .line 134
    new-instance v0, Lcom/ibotta/android/routing/intent/SpotlightIntentCreator;

    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferActivity;->getActivity()Landroid/app/Activity;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/routing/intent/SpotlightIntentCreator;-><init>(Landroid/content/Context;)V

    const/4 v1, 0x1

    new-array v1, v1, [I

    const/4 v2, 0x0

    aput p2, v1, v2

    .line 135
    invoke-virtual {v0, v1}, Lcom/ibotta/android/routing/intent/SpotlightIntentCreator;->offerIds([I)Lcom/ibotta/android/routing/intent/SpotlightIntentCreator;

    move-result-object p2

    if-eqz p1, :cond_0

    .line 136
    invoke-virtual {p1}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->getId()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {p2, p1}, Lcom/ibotta/android/routing/intent/SpotlightIntentCreator;->retailerId(Ljava/lang/Integer;)Lcom/ibotta/android/routing/intent/SpotlightIntentCreator;

    move-result-object p1

    .line 137
    invoke-virtual {p1}, Lcom/ibotta/android/routing/intent/SpotlightIntentCreator;->create()Landroid/content/Intent;

    move-result-object p1

    .line 134
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferActivity;->startActivity(Landroid/content/Intent;)V

    .line 138
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferActivity;->finishWithSuccess()V

    return-void
.end method

.method protected onCloseClicked()V
    .locals 1
    .annotation runtime Lbutterknife/OnClick;
        value = {
            0x7f090231
        }
    .end annotation

    .line 158
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferPresenter;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferPresenter;->onCloseClicked()V

    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 5
    .param p1    # Landroid/os/Bundle;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 72
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;->onCreate(Landroid/os/Bundle;)V

    const-string v0, "onCreate: %1$s"

    const/4 v1, 0x1

    .line 74
    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 76
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    new-instance v1, Landroid/graphics/drawable/ColorDrawable;

    invoke-direct {v1, v2}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {v0, v1}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    const v0, 0x7f0c0047

    .line 77
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferActivity;->setContentView(I)V

    .line 78
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/app/Activity;)Lbutterknife/Unbinder;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferActivity;->setUnbinder(Lbutterknife/Unbinder;)V

    .line 80
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferActivity;->loadState(Landroid/os/Bundle;)V

    .line 83
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferActivity;->tracker:Lcom/ibotta/android/tracking/Tracker;

    const-string v0, "linked_offer_view"

    iget-wide v3, p0, Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferActivity;->rewardId:J

    invoke-interface {p1, v0, v3, v4}, Lcom/ibotta/android/tracking/Tracker;->event(Ljava/lang/String;J)V

    const p1, 0x7f110054

    .line 85
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferActivity;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferActivity;->setTitle(Ljava/lang/CharSequence;)V

    const p1, 0x7f01003a

    .line 86
    invoke-virtual {p0, p1, v2}, Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferActivity;->overridePendingTransition(II)V

    return-void
.end method

.method protected onNoThanksClicked()V
    .locals 1
    .annotation runtime Lbutterknife/OnClick;
        value = {
            0x7f090096
        }
    .end annotation

    .line 168
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferPresenter;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferPresenter;->onNoThanksClicked()V

    return-void
.end method

.method public onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 3

    .line 113
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;->onSaveInstanceState(Landroid/os/Bundle;)V

    const-string v0, "offer_id"

    .line 114
    iget v1, p0, Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferActivity;->offerId:I

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v0, "reward_id"

    .line 115
    iget-wide v1, p0, Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferActivity;->rewardId:J

    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    .line 116
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferActivity;->originRetailerId:Ljava/lang/Integer;

    if-eqz v0, :cond_0

    const-string v1, "origin_retailer_id"

    .line 117
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    :cond_0
    return-void
.end method

.method protected onViewRebateClicked()V
    .locals 1
    .annotation runtime Lbutterknife/OnClick;
        value = {
            0x7f0900b2
        }
    .end annotation

    .line 163
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferPresenter;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/offer/LinkedOfferPresenter;->onViewRebateClicked()V

    return-void
.end method
