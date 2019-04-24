.class public Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesActivity;
.super Lcom/ibotta/android/mvp/base/loading/PtrLoadingMvpActivity;
.source "VerifyRebatesActivity.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesRecyclerAdapterListener;
.implements Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesView;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/loading/PtrLoadingMvpActivity<",
        "Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesPresenter;",
        "Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesComponent;",
        ">;",
        "Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesRecyclerAdapterListener;",
        "Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesView;"
    }
.end annotation


# instance fields
.field private adapter:Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesRecyclerAdapter;

.field protected bAdd:Landroid/widget/Button;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f09007a
    .end annotation
.end field

.field private excludedOfferIds:[I
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field protected rvRecycler:Landroid/support/v7/widget/RecyclerView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0903db
    .end annotation
.end field

.field private showVerifiedOnFinish:Z

.field protected srlSwipeRefresh:Lcom/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090426
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 42
    invoke-direct {p0}, Lcom/ibotta/android/mvp/base/loading/PtrLoadingMvpActivity;-><init>()V

    return-void
.end method

.method private initDividers()V
    .locals 3

    .line 155
    new-instance v0, Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder;

    invoke-direct {v0, p0}, Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder;-><init>(Landroid/content/Context;)V

    const v1, 0x7f0600fa

    .line 156
    invoke-virtual {v0, v1}, Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder;->colorResId(I)Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$Builder;

    move-result-object v0

    check-cast v0, Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder;

    const v1, 0x7f07015d

    .line 157
    invoke-virtual {v0, v1}, Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder;->sizeResId(I)Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$Builder;

    move-result-object v0

    check-cast v0, Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder;

    const v1, 0x7f070165

    const v2, 0x7f07015c

    .line 158
    invoke-virtual {v0, v1, v2}, Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder;->marginResId(II)Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder;

    move-result-object v0

    .line 159
    invoke-virtual {v0}, Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder;->showLastDivider()Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$Builder;

    move-result-object v0

    check-cast v0, Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder;

    .line 160
    invoke-virtual {v0}, Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder;->build()Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration;

    move-result-object v0

    .line 162
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesActivity;->rvRecycler:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v1, v0}, Landroid/support/v7/widget/RecyclerView;->addItemDecoration(Landroid/support/v7/widget/RecyclerView$ItemDecoration;)V

    return-void
.end method

.method private initRecycler()V
    .locals 4

    .line 147
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesRecyclerAdapter;

    invoke-direct {v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesRecyclerAdapter;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesActivity;->adapter:Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesRecyclerAdapter;

    .line 148
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesActivity;->adapter:Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesRecyclerAdapter;

    invoke-virtual {v0, p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesRecyclerAdapter;->setListener(Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesRecyclerAdapterListener;)V

    .line 150
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesActivity;->rvRecycler:Landroid/support/v7/widget/RecyclerView;

    new-instance v1, Landroid/support/v7/widget/LinearLayoutManager;

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-direct {v1, p0, v2, v3}, Landroid/support/v7/widget/LinearLayoutManager;-><init>(Landroid/content/Context;IZ)V

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    .line 151
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesActivity;->rvRecycler:Landroid/support/v7/widget/RecyclerView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesActivity;->adapter:Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesRecyclerAdapter;

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setAdapter(Landroid/support/v7/widget/RecyclerView$Adapter;)V

    return-void
.end method

.method private initTitle()V
    .locals 1

    const v0, 0x7f110663

    .line 143
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesActivity;->setTitle(I)V

    return-void
.end method

.method private loadState(Landroid/os/Bundle;)V
    .locals 2
    .param p1    # Landroid/os/Bundle;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    if-eqz p1, :cond_0

    const-string v0, "retailer"

    .line 132
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesActivity;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    const-string v0, "excluded_offer_ids"

    .line 133
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getIntArray(Ljava/lang/String;)[I

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesActivity;->excludedOfferIds:[I

    const-string v0, "show_verified_on_finish"

    .line 134
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result p1

    iput-boolean p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesActivity;->showVerifiedOnFinish:Z

    goto :goto_0

    .line 135
    :cond_0
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 136
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "retailer"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesActivity;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    .line 137
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "excluded_offer_ids"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getIntArrayExtra(Ljava/lang/String;)[I

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesActivity;->excludedOfferIds:[I

    .line 138
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "show_verified_on_finish"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result p1

    iput-boolean p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesActivity;->showVerifiedOnFinish:Z

    :cond_1
    :goto_0
    return-void
.end method

.method private static newIntent(Landroid/content/Context;Lcom/ibotta/android/fragment/retailer/RetailerParcel;Ljava/util/Set;Z)Landroid/content/Intent;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/ibotta/android/fragment/retailer/RetailerParcel;",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;Z)",
            "Landroid/content/Intent;"
        }
    .end annotation

    .line 71
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string p0, "retailer"

    .line 72
    invoke-virtual {v0, p0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 74
    invoke-interface {p2}, Ljava/util/Set;->size()I

    move-result p0

    new-array p0, p0, [I

    .line 76
    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 p2, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    add-int/lit8 v2, p2, 0x1

    .line 77
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    aput v1, p0, p2

    move p2, v2

    goto :goto_0

    :cond_0
    const-string p1, "excluded_offer_ids"

    .line 80
    invoke-virtual {v0, p1, p0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[I)Landroid/content/Intent;

    const-string p0, "show_verified_on_finish"

    .line 81
    invoke-virtual {v0, p0, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    return-object v0
.end method

.method public static start(Landroid/content/Context;Lcom/ibotta/android/fragment/retailer/RetailerParcel;Ljava/util/Set;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/ibotta/android/fragment/retailer/RetailerParcel;",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;Z)V"
        }
    .end annotation

    if-nez p0, :cond_0

    return-void

    .line 63
    :cond_0
    invoke-static {p0, p1, p2, p3}, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesActivity;->newIntent(Landroid/content/Context;Lcom/ibotta/android/fragment/retailer/RetailerParcel;Ljava/util/Set;Z)Landroid/content/Intent;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    return-void
.end method


# virtual methods
.method protected bridge synthetic createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/base/MvpComponent;
    .locals 0

    .line 42
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesActivity;->createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesComponent;

    move-result-object p1

    return-object p1
.end method

.method protected createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesComponent;
    .locals 1

    .line 93
    invoke-static {}, Lcom/ibotta/android/mvp/ui/activity/redeem/add/DaggerVerifyRebatesComponent;->builder()Lcom/ibotta/android/mvp/ui/activity/redeem/add/DaggerVerifyRebatesComponent$Builder;

    move-result-object v0

    .line 94
    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/add/DaggerVerifyRebatesComponent$Builder;->mainComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/redeem/add/DaggerVerifyRebatesComponent$Builder;

    move-result-object p1

    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesModule;

    invoke-direct {v0, p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesModule;-><init>(Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesView;)V

    .line 95
    invoke-virtual {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/add/DaggerVerifyRebatesComponent$Builder;->verifyRebatesModule(Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesModule;)Lcom/ibotta/android/mvp/ui/activity/redeem/add/DaggerVerifyRebatesComponent$Builder;

    move-result-object p1

    .line 96
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/add/DaggerVerifyRebatesComponent$Builder;->build()Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesComponent;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic getPtrView()Landroid/support/v4/widget/SwipeRefreshLayout;
    .locals 1

    .line 42
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesActivity;->getPtrView()Lcom/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout;

    move-result-object v0

    return-object v0
.end method

.method public getPtrView()Lcom/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout;
    .locals 1

    .line 88
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesActivity;->srlSwipeRefresh:Lcom/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout;

    return-object v0
.end method

.method protected bridge synthetic inject(Lcom/ibotta/android/mvp/base/MvpComponent;)V
    .locals 0

    .line 42
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesComponent;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesActivity;->inject(Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesComponent;)V

    return-void
.end method

.method protected inject(Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesComponent;)V
    .locals 0

    .line 101
    invoke-interface {p1, p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesComponent;->inject(Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesActivity;)V

    return-void
.end method

.method protected onActivityResult(IILandroid/content/Intent;)V
    .locals 1

    .line 167
    invoke-super {p0, p1, p2, p3}, Lcom/ibotta/android/mvp/base/loading/PtrLoadingMvpActivity;->onActivityResult(IILandroid/content/Intent;)V

    const/16 v0, 0xb

    if-ne p1, v0, :cond_1

    const/4 p1, 0x1

    if-ne p2, p1, :cond_0

    .line 171
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesPresenter;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesPresenter;->onProductVerificationSuccess()V

    goto :goto_0

    .line 173
    :cond_0
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesPresenter;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesPresenter;->onProductVerificationFailed()V

    goto :goto_0

    :cond_1
    const/16 v0, 0x13

    if-ne p1, v0, :cond_2

    if-eqz p3, :cond_2

    const-string p1, "offer_id"

    const/4 v0, 0x0

    .line 176
    invoke-virtual {p3, p1, v0}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result p1

    const-string v0, "retailer"

    .line 177
    invoke-virtual {p3, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p3

    check-cast p3, Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    packed-switch p2, :pswitch_data_0

    goto :goto_0

    .line 187
    :pswitch_0
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p2, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesPresenter;

    invoke-interface {p2, p1, p3}, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesPresenter;->onQuantityIncreased(ILcom/ibotta/android/fragment/retailer/RetailerParcel;)V

    goto :goto_0

    .line 181
    :pswitch_1
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p2, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesPresenter;

    invoke-interface {p2, p1, p3}, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesPresenter;->onQuantityNoChange(ILcom/ibotta/android/fragment/retailer/RetailerParcel;)V

    goto :goto_0

    .line 184
    :pswitch_2
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p2, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesPresenter;

    invoke-interface {p2, p1, p3}, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesPresenter;->onQuantityDecreased(ILcom/ibotta/android/fragment/retailer/RetailerParcel;)V

    :cond_2
    :goto_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method protected onAddClicked()V
    .locals 1
    .annotation runtime Lbutterknife/OnClick;
        value = {
            0x7f09007a
        }
    .end annotation

    .line 256
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesPresenter;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesPresenter;->onAddClicked()V

    return-void
.end method

.method public onChangeQuantityClicked(Lcom/ibotta/api/model/OfferModel;)V
    .locals 1

    .line 241
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesPresenter;

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesPresenter;->onChangeQuantityClicked(Lcom/ibotta/api/model/OfferModel;)V

    return-void
.end method

.method public onCheckClicked(Lcom/ibotta/api/model/OfferModel;)V
    .locals 1

    .line 251
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesPresenter;

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesPresenter;->onCheckClicked(Lcom/ibotta/api/model/OfferModel;)V

    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 1
    .param p1    # Landroid/os/Bundle;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 106
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/PtrLoadingMvpActivity;->onCreate(Landroid/os/Bundle;)V

    .line 108
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesActivity;->loadState(Landroid/os/Bundle;)V

    const p1, 0x7f0c007a

    .line 110
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesActivity;->setContentView(I)V

    .line 111
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/app/Activity;)Lbutterknife/Unbinder;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesActivity;->setUnbinder(Lbutterknife/Unbinder;)V

    .line 113
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesActivity;->initTitle()V

    .line 114
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesActivity;->initRecycler()V

    .line 115
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesActivity;->initDividers()V

    .line 117
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesPresenter;

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesActivity;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-interface {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesPresenter;->setRetailerParcel(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)V

    .line 118
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesPresenter;

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesActivity;->excludedOfferIds:[I

    invoke-interface {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesPresenter;->setExcludedOfferIds([I)V

    .line 119
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesPresenter;

    iget-boolean v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesActivity;->showVerifiedOnFinish:Z

    invoke-interface {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesPresenter;->setShowVerifiedOnFinish(Z)V

    return-void
.end method

.method public onRowClicked(Lcom/ibotta/api/model/OfferModel;)V
    .locals 1

    .line 246
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesPresenter;

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesPresenter;->onRowClicked(Lcom/ibotta/api/model/OfferModel;)V

    return-void
.end method

.method protected onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2

    .line 124
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/PtrLoadingMvpActivity;->onSaveInstanceState(Landroid/os/Bundle;)V

    const-string v0, "retailer"

    .line 125
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesActivity;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    const-string v0, "excluded_offer_ids"

    .line 126
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesActivity;->excludedOfferIds:[I

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putIntArray(Ljava/lang/String;[I)V

    const-string v0, "show_verified_on_finish"

    .line 127
    iget-boolean v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesActivity;->showVerifiedOnFinish:Z

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    return-void
.end method

.method public setAddButtonEnabled(Z)V
    .locals 1

    .line 221
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesActivity;->bAdd:Landroid/widget/Button;

    invoke-virtual {v0, p1}, Landroid/widget/Button;->setEnabled(Z)V

    return-void
.end method

.method public setRows(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/activity/redeem/add/row/AbstractVerifyRebatesRow;",
            ">;)V"
        }
    .end annotation

    .line 195
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesActivity;->adapter:Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesRecyclerAdapter;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesRecyclerAdapter;->setRows(Ljava/util/List;)V

    return-void
.end method

.method public setVerificationSummary(ZILjava/lang/String;)V
    .locals 5

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    .line 209
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesActivity;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const p3, 0x7f0f0002

    new-array v0, v0, [Ljava/lang/Object;

    .line 210
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v0, v1

    .line 209
    invoke-virtual {p1, p3, p2, v0}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    .line 212
    :cond_0
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesActivity;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const v2, 0x7f0f0001

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    .line 213
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v3, v1

    aput-object p3, v3, v0

    .line 212
    invoke-virtual {p1, v2, p2, v3}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    .line 216
    :goto_0
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesActivity;->bAdd:Landroid/widget/Button;

    invoke-virtual {p2, p1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public showBarcodeScannerForResult(ILcom/ibotta/android/fragment/retailer/RetailerParcel;)V
    .locals 1

    .line 200
    new-instance v0, Lcom/ibotta/android/routing/intent/VerifyWizardIntentCreator;

    invoke-direct {v0, p0, p2, p1}, Lcom/ibotta/android/routing/intent/VerifyWizardIntentCreator;-><init>(Landroid/content/Context;Lcom/ibotta/android/fragment/retailer/RetailerParcel;I)V

    invoke-virtual {v0}, Lcom/ibotta/android/routing/intent/VerifyWizardIntentCreator;->create()Landroid/content/Intent;

    move-result-object p1

    const/16 p2, 0xb

    .line 201
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesActivity;->startActivityForResult(Landroid/content/Intent;I)V

    return-void
.end method

.method public showChangeQuantityForResult(Lcom/ibotta/api/model/OfferModel;)V
    .locals 1

    .line 236
    invoke-interface {p1}, Lcom/ibotta/api/model/OfferModel;->getId()I

    move-result p1

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesActivity;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-static {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityActivity;->startForResult(Landroid/app/Activity;ILcom/ibotta/android/fragment/retailer/RetailerParcel;)V

    return-void
.end method

.method public showProductVerifiedSuccess()V
    .locals 1

    const v0, 0x7f110664

    .line 226
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesActivity;->showQuickMessage(I)V

    return-void
.end method

.method public showVerifiedRebates(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)V
    .locals 0

    .line 231
    invoke-static {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesActivity;->start(Landroid/content/Context;Lcom/ibotta/android/fragment/retailer/RetailerParcel;)V

    return-void
.end method
