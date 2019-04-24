.class public Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityActivity;
.super Lcom/ibotta/android/mvp/base/loading/PtrLoadingMvpActivity;
.source "ChangeQuantityActivity.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityView;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/loading/PtrLoadingMvpActivity<",
        "Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityPresenter;",
        "Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityComponent;",
        ">;",
        "Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityView;"
    }
.end annotation


# static fields
.field public static final RESP_CODE_QUANTITY_DECREASED:I = -0x1

.field public static final RESP_CODE_QUANTITY_INCREASED:I = 0x1

.field public static final RESP_CODE_QUANTITY_NO_CHANGE:I


# instance fields
.field protected bDone:Landroid/widget/Button;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090086
    .end annotation
.end field

.field protected ibDecrement:Landroid/widget/ImageButton;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090232
    .end annotation
.end field

.field protected ibIncrement:Landroid/widget/ImageButton;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090234
    .end annotation
.end field

.field protected imageCache:Lcom/ibotta/android/images/ImageCache;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected ivImage:Landroid/widget/ImageView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0902ad
    .end annotation
.end field

.field private offerId:I

.field private retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field protected srlSwipeRefresh:Lcom/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090426
    .end annotation
.end field

.field protected tvName:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f09054d
    .end annotation
.end field

.field protected tvQuantity:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090561
    .end annotation
.end field

.field protected tvRules:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f09056d
    .end annotation
.end field

.field protected vQuantityBottomLine:Landroid/view/View;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0905b8
    .end annotation
.end field

.field protected vQuantityTopLine:Landroid/view/View;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0905b9
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 36
    invoke-direct {p0}, Lcom/ibotta/android/mvp/base/loading/PtrLoadingMvpActivity;-><init>()V

    return-void
.end method

.method private finishWithResult(IILcom/ibotta/android/fragment/retailer/RetailerParcel;)V
    .locals 2
    .param p3    # Lcom/ibotta/android/fragment/retailer/RetailerParcel;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 205
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    const-string v1, "offer_id"

    .line 206
    invoke-virtual {v0, v1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    const-string p2, "retailer"

    .line 207
    invoke-virtual {v0, p2, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 209
    invoke-virtual {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityActivity;->setResult(ILandroid/content/Intent;)V

    .line 210
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityActivity;->finish()V

    return-void
.end method

.method private initTitle()V
    .locals 1

    const v0, 0x7f1100f9

    .line 128
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityActivity;->setTitle(I)V

    return-void
.end method

.method private loadState(Landroid/os/Bundle;)V
    .locals 2
    .param p1    # Landroid/os/Bundle;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    if-eqz p1, :cond_0

    const-string v0, "offer_id"

    .line 119
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityActivity;->offerId:I

    const-string v0, "retailer"

    .line 120
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityActivity;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    goto :goto_0

    .line 121
    :cond_0
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 122
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "offer_id"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result p1

    iput p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityActivity;->offerId:I

    .line 123
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "retailer"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityActivity;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    :cond_1
    :goto_0
    return-void
.end method

.method private static newIntent(Landroid/content/Context;ILcom/ibotta/android/fragment/retailer/RetailerParcel;)Landroid/content/Intent;
    .locals 2
    .param p2    # Lcom/ibotta/android/fragment/retailer/RetailerParcel;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 70
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string p0, "offer_id"

    .line 71
    invoke-virtual {v0, p0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    const-string p0, "retailer"

    .line 72
    invoke-virtual {v0, p0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    return-object v0
.end method

.method public static startForResult(Landroid/app/Activity;ILcom/ibotta/android/fragment/retailer/RetailerParcel;)V
    .locals 0
    .param p2    # Lcom/ibotta/android/fragment/retailer/RetailerParcel;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    if-nez p0, :cond_0

    return-void

    .line 66
    :cond_0
    invoke-static {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityActivity;->newIntent(Landroid/content/Context;ILcom/ibotta/android/fragment/retailer/RetailerParcel;)Landroid/content/Intent;

    move-result-object p1

    const/16 p2, 0x13

    .line 65
    invoke-virtual {p0, p1, p2}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    return-void
.end method


# virtual methods
.method protected bridge synthetic createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/base/MvpComponent;
    .locals 0

    .line 36
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityActivity;->createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityComponent;

    move-result-object p1

    return-object p1
.end method

.method protected createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityComponent;
    .locals 1

    .line 84
    invoke-static {}, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/DaggerChangeQuantityComponent;->builder()Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/DaggerChangeQuantityComponent$Builder;

    move-result-object v0

    .line 85
    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/DaggerChangeQuantityComponent$Builder;->mainComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/DaggerChangeQuantityComponent$Builder;

    move-result-object p1

    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityModule;

    invoke-direct {v0, p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityModule;-><init>(Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityView;)V

    .line 86
    invoke-virtual {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/DaggerChangeQuantityComponent$Builder;->changeQuantityModule(Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityModule;)Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/DaggerChangeQuantityComponent$Builder;

    move-result-object p1

    .line 87
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/DaggerChangeQuantityComponent$Builder;->build()Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityComponent;

    move-result-object p1

    return-object p1
.end method

.method public finishWithDecreasedResult(ILcom/ibotta/android/fragment/retailer/RetailerParcel;)V
    .locals 1
    .param p2    # Lcom/ibotta/android/fragment/retailer/RetailerParcel;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    const/4 v0, -0x1

    .line 181
    invoke-direct {p0, v0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityActivity;->finishWithResult(IILcom/ibotta/android/fragment/retailer/RetailerParcel;)V

    return-void
.end method

.method public finishWithIncreasedResult(ILcom/ibotta/android/fragment/retailer/RetailerParcel;)V
    .locals 1
    .param p2    # Lcom/ibotta/android/fragment/retailer/RetailerParcel;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x1

    .line 186
    invoke-direct {p0, v0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityActivity;->finishWithResult(IILcom/ibotta/android/fragment/retailer/RetailerParcel;)V

    return-void
.end method

.method public finishWithNoChangeResult(ILcom/ibotta/android/fragment/retailer/RetailerParcel;)V
    .locals 1
    .param p2    # Lcom/ibotta/android/fragment/retailer/RetailerParcel;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 176
    invoke-direct {p0, v0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityActivity;->finishWithResult(IILcom/ibotta/android/fragment/retailer/RetailerParcel;)V

    return-void
.end method

.method public bridge synthetic getPtrView()Landroid/support/v4/widget/SwipeRefreshLayout;
    .locals 1

    .line 36
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityActivity;->getPtrView()Lcom/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout;

    move-result-object v0

    return-object v0
.end method

.method public getPtrView()Lcom/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout;
    .locals 1

    .line 79
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityActivity;->srlSwipeRefresh:Lcom/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout;

    return-object v0
.end method

.method public initControls()V
    .locals 2

    .line 133
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityActivity;->vQuantityTopLine:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 134
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityActivity;->vQuantityBottomLine:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 135
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityActivity;->ibIncrement:Landroid/widget/ImageButton;

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setVisibility(I)V

    .line 136
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityActivity;->ibDecrement:Landroid/widget/ImageButton;

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setVisibility(I)V

    return-void
.end method

.method protected bridge synthetic inject(Lcom/ibotta/android/mvp/base/MvpComponent;)V
    .locals 0

    .line 36
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityComponent;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityActivity;->inject(Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityComponent;)V

    return-void
.end method

.method protected inject(Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityComponent;)V
    .locals 0

    .line 92
    invoke-interface {p1, p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityComponent;->inject(Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityActivity;)V

    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 1
    .param p1    # Landroid/os/Bundle;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 97
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/PtrLoadingMvpActivity;->onCreate(Landroid/os/Bundle;)V

    .line 99
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityActivity;->loadState(Landroid/os/Bundle;)V

    const p1, 0x7f0c0026

    .line 101
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityActivity;->setContentView(I)V

    .line 102
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/app/Activity;)Lbutterknife/Unbinder;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityActivity;->setUnbinder(Lbutterknife/Unbinder;)V

    .line 104
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityActivity;->initTitle()V

    .line 106
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityPresenter;

    iget v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityActivity;->offerId:I

    invoke-interface {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityPresenter;->setOfferId(I)V

    .line 107
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityPresenter;

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityActivity;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-interface {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityPresenter;->setRetailerParcel(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)V

    return-void
.end method

.method protected onDecrementClicked()V
    .locals 1
    .annotation runtime Lbutterknife/OnClick;
        value = {
            0x7f090232
        }
    .end annotation

    .line 191
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityPresenter;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityPresenter;->onDecrementClicked()V

    return-void
.end method

.method protected onDoneClicked()V
    .locals 1
    .annotation runtime Lbutterknife/OnClick;
        value = {
            0x7f090086
        }
    .end annotation

    .line 201
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityPresenter;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityPresenter;->onDoneClicked()V

    return-void
.end method

.method protected onIncrementClicked()V
    .locals 1
    .annotation runtime Lbutterknife/OnClick;
        value = {
            0x7f090234
        }
    .end annotation

    .line 196
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityPresenter;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityPresenter;->onIncrementClicked()V

    return-void
.end method

.method protected onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2

    .line 112
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/PtrLoadingMvpActivity;->onSaveInstanceState(Landroid/os/Bundle;)V

    const-string v0, "offer_id"

    .line 113
    iget v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityActivity;->offerId:I

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v0, "retailer"

    .line 114
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityActivity;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    return-void
.end method

.method public setDecrementButtonEnabled(Z)V
    .locals 1

    .line 156
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityActivity;->ibDecrement:Landroid/widget/ImageButton;

    invoke-virtual {v0, p1}, Landroid/widget/ImageButton;->setEnabled(Z)V

    return-void
.end method

.method public setDoneButtonEnabled(Z)V
    .locals 1

    .line 171
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityActivity;->bDone:Landroid/widget/Button;

    invoke-virtual {v0, p1}, Landroid/widget/Button;->setEnabled(Z)V

    return-void
.end method

.method public setIncrementButtonEnabled(Z)V
    .locals 1

    .line 166
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityActivity;->ibIncrement:Landroid/widget/ImageButton;

    invoke-virtual {v0, p1}, Landroid/widget/ImageButton;->setEnabled(Z)V

    return-void
.end method

.method public setQuantity(I)V
    .locals 3

    .line 161
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityActivity;->tvQuantity:Landroid/widget/TextView;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const p1, 0x7f1100f7

    invoke-virtual {p0, p1, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityActivity;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public setRebateImage(Ljava/lang/String;)V
    .locals 3

    .line 141
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityActivity;->imageCache:Lcom/ibotta/android/images/ImageCache;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityActivity;->ivImage:Landroid/widget/ImageView;

    sget-object v2, Lcom/ibotta/android/views/images/Sizes;->OFFER_HALF_WIDTH:Lcom/ibotta/android/views/images/Sizes;

    invoke-interface {v0, p0, p1, v1, v2}, Lcom/ibotta/android/images/ImageCache;->load(Landroid/content/Context;Ljava/lang/String;Landroid/widget/ImageView;Lcom/ibotta/android/images/ImageCache$Size;)Lcom/ibotta/android/images/ImageLoadJob;

    return-void
.end method

.method public setRebateName(Ljava/lang/String;)V
    .locals 1

    .line 146
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityActivity;->tvName:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public setRedemptionLimit(S)V
    .locals 3

    .line 151
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityActivity;->tvRules:Landroid/widget/TextView;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object p1

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const p1, 0x7f1100f8

    invoke-virtual {p0, p1, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityActivity;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method
