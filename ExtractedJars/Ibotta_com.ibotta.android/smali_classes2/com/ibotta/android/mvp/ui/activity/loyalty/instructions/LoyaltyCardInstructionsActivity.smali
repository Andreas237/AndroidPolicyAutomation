.class public Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/LoyaltyCardInstructionsActivity;
.super Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;
.source "LoyaltyCardInstructionsActivity.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/LoyaltyCardInstructionsView;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity<",
        "Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/LoyaltyCardInstructionsPresenter;",
        "Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/LoyaltyCardInstructionsComponent;",
        ">;",
        "Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/LoyaltyCardInstructionsView;"
    }
.end annotation


# instance fields
.field private retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

.field protected tbvTitleBar:Lcom/ibotta/android/views/base/title/TitleBarView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f09044e
    .end annotation
.end field

.field protected tvInstructions:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090534
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 26
    invoke-direct {p0}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;-><init>()V

    return-void
.end method

.method private initTitle()V
    .locals 1

    const v0, 0x7f110198

    .line 92
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/LoyaltyCardInstructionsActivity;->setTitle(I)V

    return-void
.end method

.method private loadState(Landroid/os/Bundle;)V
    .locals 1

    if-eqz p1, :cond_0

    const-string v0, "retailer"

    .line 77
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/LoyaltyCardInstructionsActivity;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    goto :goto_0

    .line 78
    :cond_0
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/LoyaltyCardInstructionsActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 79
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/LoyaltyCardInstructionsActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "retailer"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/LoyaltyCardInstructionsActivity;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    .line 82
    :cond_1
    :goto_0
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/LoyaltyCardInstructionsActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/LoyaltyCardInstructionsPresenter;

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/LoyaltyCardInstructionsActivity;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-interface {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/LoyaltyCardInstructionsPresenter;->setRetailerParcel(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)V

    return-void
.end method

.method private static newIntent(Landroid/content/Context;Lcom/ibotta/android/fragment/retailer/RetailerParcel;)Landroid/content/Intent;
    .locals 2

    .line 44
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/LoyaltyCardInstructionsActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string p0, "retailer"

    .line 45
    invoke-virtual {v0, p0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    return-object v0
.end method

.method public static start(Landroid/content/Context;Lcom/ibotta/android/fragment/retailer/RetailerParcel;)V
    .locals 0

    if-nez p0, :cond_0

    return-void

    .line 40
    :cond_0
    invoke-static {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/LoyaltyCardInstructionsActivity;->newIntent(Landroid/content/Context;Lcom/ibotta/android/fragment/retailer/RetailerParcel;)Landroid/content/Intent;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    return-void
.end method


# virtual methods
.method protected bridge synthetic createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/base/MvpComponent;
    .locals 0

    .line 26
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/LoyaltyCardInstructionsActivity;->createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/LoyaltyCardInstructionsComponent;

    move-result-object p1

    return-object p1
.end method

.method protected createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/LoyaltyCardInstructionsComponent;
    .locals 1

    .line 52
    invoke-static {}, Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/DaggerLoyaltyCardInstructionsComponent;->builder()Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/DaggerLoyaltyCardInstructionsComponent$Builder;

    move-result-object v0

    .line 53
    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/DaggerLoyaltyCardInstructionsComponent$Builder;->mainComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/DaggerLoyaltyCardInstructionsComponent$Builder;

    move-result-object p1

    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/LoyaltyCardInstructionsModule;

    invoke-direct {v0, p0}, Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/LoyaltyCardInstructionsModule;-><init>(Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/LoyaltyCardInstructionsView;)V

    .line 54
    invoke-virtual {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/DaggerLoyaltyCardInstructionsComponent$Builder;->loyaltyCardInstructionsModule(Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/LoyaltyCardInstructionsModule;)Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/DaggerLoyaltyCardInstructionsComponent$Builder;

    move-result-object p1

    .line 55
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/DaggerLoyaltyCardInstructionsComponent$Builder;->build()Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/LoyaltyCardInstructionsComponent;

    move-result-object p1

    return-object p1
.end method

.method protected bridge synthetic inject(Lcom/ibotta/android/mvp/base/MvpComponent;)V
    .locals 0

    .line 26
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/LoyaltyCardInstructionsComponent;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/LoyaltyCardInstructionsActivity;->inject(Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/LoyaltyCardInstructionsComponent;)V

    return-void
.end method

.method protected inject(Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/LoyaltyCardInstructionsComponent;)V
    .locals 0

    .line 60
    invoke-interface {p1, p0}, Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/LoyaltyCardInstructionsComponent;->inject(Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/LoyaltyCardInstructionsActivity;)V

    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 0
    .param p1    # Landroid/os/Bundle;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 65
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;->onCreate(Landroid/os/Bundle;)V

    .line 67
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/LoyaltyCardInstructionsActivity;->loadState(Landroid/os/Bundle;)V

    const p1, 0x7f0c004a

    .line 69
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/LoyaltyCardInstructionsActivity;->setContentView(I)V

    .line 70
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/app/Activity;)Lbutterknife/Unbinder;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/LoyaltyCardInstructionsActivity;->setUnbinder(Lbutterknife/Unbinder;)V

    .line 72
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/LoyaltyCardInstructionsActivity;->initTitle()V

    return-void
.end method

.method public onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2

    .line 87
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;->onSaveInstanceState(Landroid/os/Bundle;)V

    const-string v0, "retailer"

    .line 88
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/LoyaltyCardInstructionsActivity;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    return-void
.end method

.method protected onThanksClicked()V
    .locals 1
    .annotation runtime Lbutterknife/OnClick;
        value = {
            0x7f0900ad
        }
    .end annotation

    .line 103
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/LoyaltyCardInstructionsActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/LoyaltyCardInstructionsPresenter;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/LoyaltyCardInstructionsPresenter;->onThanksClicked()V

    return-void
.end method

.method public setup(Lcom/ibotta/android/views/base/title/TitleBarViewState;Ljava/lang/String;)V
    .locals 1

    .line 97
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/LoyaltyCardInstructionsActivity;->tbvTitleBar:Lcom/ibotta/android/views/base/title/TitleBarView;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/views/base/title/TitleBarView;->updateViewState(Lcom/ibotta/android/views/base/title/TitleBarViewState;)V

    .line 98
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/instructions/LoyaltyCardInstructionsActivity;->tvInstructions:Landroid/widget/TextView;

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method
