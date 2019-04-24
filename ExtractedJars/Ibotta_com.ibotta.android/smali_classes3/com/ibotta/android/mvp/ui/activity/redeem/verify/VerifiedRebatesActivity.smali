.class public Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesActivity;
.super Lcom/ibotta/android/mvp/base/loading/PtrLoadingMvpActivity;
.source "VerifiedRebatesActivity.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesRecyclerAdapterListener;
.implements Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesView;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/loading/PtrLoadingMvpActivity<",
        "Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesPresenter;",
        "Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesComponent;",
        ">;",
        "Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesRecyclerAdapterListener;",
        "Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesView;"
    }
.end annotation


# instance fields
.field private adapter:Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesRecyclerAdapter;

.field protected bCollect:Landroid/widget/Button;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090082
    .end annotation
.end field

.field private retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

.field protected rvRecycler:Landroid/support/v7/widget/RecyclerView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0903db
    .end annotation
.end field

.field protected srlSwipeRefresh:Lcom/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090426
    .end annotation
.end field

.field private voqStates:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedOfferQuantityState;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 49
    invoke-direct {p0}, Lcom/ibotta/android/mvp/base/loading/PtrLoadingMvpActivity;-><init>()V

    .line 57
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesActivity;->voqStates:Ljava/util/List;

    return-void
.end method

.method static synthetic access$000(Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesActivity;)Lcom/ibotta/android/mvp/base/MvpPresenter;
    .locals 0

    .line 49
    iget-object p0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    return-object p0
.end method

.method static synthetic access$100(Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesActivity;)Lcom/ibotta/android/mvp/base/MvpPresenter;
    .locals 0

    .line 49
    iget-object p0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    return-object p0
.end method

.method static synthetic access$200(Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesActivity;)Lcom/ibotta/android/mvp/base/MvpPresenter;
    .locals 0

    .line 49
    iget-object p0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    return-object p0
.end method

.method static synthetic access$300(Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesActivity;)Lcom/ibotta/android/mvp/base/MvpPresenter;
    .locals 0

    .line 49
    iget-object p0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    return-object p0
.end method

.method private initDividers()V
    .locals 3

    .line 149
    new-instance v0, Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder;

    invoke-direct {v0, p0}, Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder;-><init>(Landroid/content/Context;)V

    const v1, 0x7f0600fa

    .line 150
    invoke-virtual {v0, v1}, Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder;->colorResId(I)Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$Builder;

    move-result-object v0

    check-cast v0, Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder;

    const v1, 0x7f07015d

    .line 151
    invoke-virtual {v0, v1}, Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder;->sizeResId(I)Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$Builder;

    move-result-object v0

    check-cast v0, Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder;

    const v1, 0x7f070165

    const v2, 0x7f07015c

    .line 152
    invoke-virtual {v0, v1, v2}, Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder;->marginResId(II)Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder;

    move-result-object v0

    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/-$$Lambda$VerifiedRebatesActivity$HtOxnDFaEiIAk5rmeDK9_r0AH0w;

    invoke-direct {v1, p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/-$$Lambda$VerifiedRebatesActivity$HtOxnDFaEiIAk5rmeDK9_r0AH0w;-><init>(Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesActivity;)V

    .line 153
    invoke-virtual {v0, v1}, Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder;->visibilityProvider(Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$VisibilityProvider;)Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$Builder;

    move-result-object v0

    check-cast v0, Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder;

    .line 157
    invoke-virtual {v0}, Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder;->showLastDivider()Lcom/yqritc/recyclerviewflexibledivider/FlexibleDividerDecoration$Builder;

    move-result-object v0

    check-cast v0, Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder;

    .line 158
    invoke-virtual {v0}, Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration$Builder;->build()Lcom/yqritc/recyclerviewflexibledivider/HorizontalDividerItemDecoration;

    move-result-object v0

    .line 160
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesActivity;->rvRecycler:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v1, v0}, Landroid/support/v7/widget/RecyclerView;->addItemDecoration(Landroid/support/v7/widget/RecyclerView$ItemDecoration;)V

    return-void
.end method

.method private initRecycler()V
    .locals 4

    .line 141
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesRecyclerAdapter;

    invoke-direct {v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesRecyclerAdapter;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesActivity;->adapter:Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesRecyclerAdapter;

    .line 142
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesActivity;->adapter:Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesRecyclerAdapter;

    invoke-virtual {v0, p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesRecyclerAdapter;->setListener(Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesRecyclerAdapterListener;)V

    .line 144
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesActivity;->rvRecycler:Landroid/support/v7/widget/RecyclerView;

    new-instance v1, Landroid/support/v7/widget/LinearLayoutManager;

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-direct {v1, p0, v2, v3}, Landroid/support/v7/widget/LinearLayoutManager;-><init>(Landroid/content/Context;IZ)V

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    .line 145
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesActivity;->rvRecycler:Landroid/support/v7/widget/RecyclerView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesActivity;->adapter:Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesRecyclerAdapter;

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setAdapter(Landroid/support/v7/widget/RecyclerView$Adapter;)V

    return-void
.end method

.method private initTitle()V
    .locals 1

    const v0, 0x7f110660

    .line 137
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesActivity;->setTitle(I)V

    return-void
.end method

.method public static synthetic lambda$initDividers$2(Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesActivity;ILandroid/support/v7/widget/RecyclerView;)Z
    .locals 0

    .line 154
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesActivity;->adapter:Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesRecyclerAdapter;

    invoke-virtual {p2, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesRecyclerAdapter;->getItem(I)Lcom/ibotta/android/mvp/ui/activity/redeem/verify/row/AbstractVerifiedRebatesRow;

    move-result-object p1

    .line 155
    instance-of p1, p1, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/row/AddRebatesRow;

    return p1
.end method

.method static synthetic lambda$loadState$0(Landroid/os/Parcelable;)Z
    .locals 0

    .line 122
    instance-of p0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedOfferQuantityState;

    return p0
.end method

.method static synthetic lambda$loadState$1(Landroid/os/Parcelable;)Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedOfferQuantityState;
    .locals 0

    .line 123
    check-cast p0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedOfferQuantityState;

    return-object p0
.end method

.method private loadState(Landroid/os/Bundle;)V
    .locals 1

    if-eqz p1, :cond_0

    const-string v0, "retailer"

    .line 118
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesActivity;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    const-string v0, "verified_offer_quantity_states"

    .line 119
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelableArray(Ljava/lang/String;)[Landroid/os/Parcelable;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 121
    invoke-static {p1}, Ljava9/util/J8Arrays;->stream([Ljava/lang/Object;)Ljava9/util/stream/Stream;

    move-result-object p1

    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/-$$Lambda$VerifiedRebatesActivity$o0-a2UcjA3DmsaibO_c0ZG7PmeI;->INSTANCE:Lcom/ibotta/android/mvp/ui/activity/redeem/verify/-$$Lambda$VerifiedRebatesActivity$o0-a2UcjA3DmsaibO_c0ZG7PmeI;

    .line 122
    invoke-interface {p1, v0}, Ljava9/util/stream/Stream;->filter(Ljava9/util/function/Predicate;)Ljava9/util/stream/Stream;

    move-result-object p1

    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/-$$Lambda$VerifiedRebatesActivity$l1_4N3-GuUimLk72vKCMh0AbxEw;->INSTANCE:Lcom/ibotta/android/mvp/ui/activity/redeem/verify/-$$Lambda$VerifiedRebatesActivity$l1_4N3-GuUimLk72vKCMh0AbxEw;

    .line 123
    invoke-interface {p1, v0}, Ljava9/util/stream/Stream;->map(Ljava9/util/function/Function;)Ljava9/util/stream/Stream;

    move-result-object p1

    .line 124
    invoke-static {}, Ljava9/util/stream/Collectors;->toList()Ljava9/util/stream/Collector;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava9/util/stream/Stream;->collect(Ljava9/util/stream/Collector;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesActivity;->voqStates:Ljava/util/List;

    goto :goto_0

    .line 126
    :cond_0
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 127
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "retailer"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesActivity;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    :cond_1
    :goto_0
    return-void
.end method

.method private static newIntent(Landroid/content/Context;Lcom/ibotta/android/fragment/retailer/RetailerParcel;)Landroid/content/Intent;
    .locals 2

    .line 69
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string p0, "retailer"

    .line 70
    invoke-virtual {v0, p0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    return-object v0
.end method

.method public static start(Landroid/content/Context;Lcom/ibotta/android/fragment/retailer/RetailerParcel;)V
    .locals 0

    if-nez p0, :cond_0

    return-void

    .line 65
    :cond_0
    invoke-static {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesActivity;->newIntent(Landroid/content/Context;Lcom/ibotta/android/fragment/retailer/RetailerParcel;)Landroid/content/Intent;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    return-void
.end method


# virtual methods
.method protected bridge synthetic createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/base/MvpComponent;
    .locals 0

    .line 49
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesActivity;->createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesComponent;

    move-result-object p1

    return-object p1
.end method

.method protected createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesComponent;
    .locals 1

    .line 82
    invoke-static {}, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/DaggerVerifiedRebatesComponent;->builder()Lcom/ibotta/android/mvp/ui/activity/redeem/verify/DaggerVerifiedRebatesComponent$Builder;

    move-result-object v0

    .line 83
    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/DaggerVerifiedRebatesComponent$Builder;->mainComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/redeem/verify/DaggerVerifiedRebatesComponent$Builder;

    move-result-object p1

    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesModule;

    invoke-direct {v0, p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesModule;-><init>(Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesView;)V

    .line 84
    invoke-virtual {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/DaggerVerifiedRebatesComponent$Builder;->verifiedRebatesModule(Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesModule;)Lcom/ibotta/android/mvp/ui/activity/redeem/verify/DaggerVerifiedRebatesComponent$Builder;

    move-result-object p1

    .line 85
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/DaggerVerifiedRebatesComponent$Builder;->build()Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesComponent;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic getPtrView()Landroid/support/v4/widget/SwipeRefreshLayout;
    .locals 1

    .line 49
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesActivity;->getPtrView()Lcom/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout;

    move-result-object v0

    return-object v0
.end method

.method public getPtrView()Lcom/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout;
    .locals 1

    .line 77
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesActivity;->srlSwipeRefresh:Lcom/ibotta/android/mvp/ui/view/IBSwipeRefreshLayout;

    return-object v0
.end method

.method protected bridge synthetic inject(Lcom/ibotta/android/mvp/base/MvpComponent;)V
    .locals 0

    .line 49
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesComponent;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesActivity;->inject(Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesComponent;)V

    return-void
.end method

.method protected inject(Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesComponent;)V
    .locals 0

    .line 90
    invoke-interface {p1, p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesComponent;->inject(Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesActivity;)V

    return-void
.end method

.method protected onActivityResult(IILandroid/content/Intent;)V
    .locals 1

    .line 165
    invoke-super {p0, p1, p2, p3}, Lcom/ibotta/android/mvp/base/loading/PtrLoadingMvpActivity;->onActivityResult(IILandroid/content/Intent;)V

    const/16 v0, 0x13

    if-ne p1, v0, :cond_0

    if-eqz p3, :cond_0

    const-string p1, "offer_id"

    const/4 v0, 0x0

    .line 168
    invoke-virtual {p3, p1, v0}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result p1

    const-string v0, "retailer"

    .line 169
    invoke-virtual {p3, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p3

    check-cast p3, Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    packed-switch p2, :pswitch_data_0

    goto :goto_0

    .line 179
    :pswitch_0
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p2, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesPresenter;

    invoke-interface {p2, p1, p3}, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesPresenter;->onQuantityIncreased(ILcom/ibotta/android/fragment/retailer/RetailerParcel;)V

    goto :goto_0

    .line 173
    :pswitch_1
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p2, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesPresenter;

    invoke-interface {p2, p1, p3}, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesPresenter;->onQuantityNoChange(ILcom/ibotta/android/fragment/retailer/RetailerParcel;)V

    goto :goto_0

    .line 176
    :pswitch_2
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p2, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesPresenter;

    invoke-interface {p2, p1, p3}, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesPresenter;->onQuantityDecreased(ILcom/ibotta/android/fragment/retailer/RetailerParcel;)V

    goto :goto_0

    :cond_0
    const/16 p3, 0xb

    if-ne p1, p3, :cond_2

    const/4 p1, 0x1

    if-ne p2, p1, :cond_1

    .line 184
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesPresenter;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesPresenter;->onProductVerificationSuccess()V

    goto :goto_0

    .line 186
    :cond_1
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesPresenter;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesPresenter;->onProductVerificationFailed()V

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

.method public onAddRebatesClicked()V
    .locals 1

    .line 193
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesPresenter;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesPresenter;->onAddRebatesClicked()V

    return-void
.end method

.method public onBackPressed()V
    .locals 1

    .line 133
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesPresenter;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesPresenter;->onBackPressed()V

    return-void
.end method

.method public onChangeQuantityClicked(Lcom/ibotta/api/model/OfferModel;)V
    .locals 1

    .line 198
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesPresenter;

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesPresenter;->onChangeQuantityClicked(Lcom/ibotta/api/model/OfferModel;)V

    return-void
.end method

.method public onCheckClicked(Lcom/ibotta/api/model/OfferModel;)V
    .locals 1

    .line 208
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesPresenter;

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesPresenter;->onCheckClicked(Lcom/ibotta/api/model/OfferModel;)V

    return-void
.end method

.method protected onCollectClicked()V
    .locals 1
    .annotation runtime Lbutterknife/OnClick;
        value = {
            0x7f090082
        }
    .end annotation

    .line 264
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesPresenter;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesPresenter;->onCollectClicked()V

    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 2
    .param p1    # Landroid/os/Bundle;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 95
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/PtrLoadingMvpActivity;->onCreate(Landroid/os/Bundle;)V

    .line 97
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesActivity;->loadState(Landroid/os/Bundle;)V

    const p1, 0x7f0c0075

    .line 99
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesActivity;->setContentView(I)V

    .line 100
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/app/Activity;)Lbutterknife/Unbinder;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesActivity;->setUnbinder(Lbutterknife/Unbinder;)V

    .line 102
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesActivity;->initTitle()V

    .line 103
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesActivity;->initRecycler()V

    .line 104
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesActivity;->initDividers()V

    .line 105
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesPresenter;

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesActivity;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesActivity;->voqStates:Ljava/util/List;

    invoke-interface {p1, v0, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesPresenter;->setInfo(Lcom/ibotta/android/fragment/retailer/RetailerParcel;Ljava/util/List;)V

    return-void
.end method

.method public onRowClicked(Lcom/ibotta/api/model/OfferModel;)V
    .locals 1

    .line 203
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesPresenter;

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesPresenter;->onRowClicked(Lcom/ibotta/api/model/OfferModel;)V

    return-void
.end method

.method protected onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 3

    .line 110
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/PtrLoadingMvpActivity;->onSaveInstanceState(Landroid/os/Bundle;)V

    const-string v0, "retailer"

    .line 111
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesActivity;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    const-string v0, "verified_offer_quantity_states"

    .line 112
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesActivity;->voqStates:Ljava/util/List;

    const/4 v2, 0x0

    new-array v2, v2, [Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedOfferQuantityState;

    .line 113
    invoke-interface {v1, v2}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Landroid/os/Parcelable;

    .line 112
    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putParcelableArray(Ljava/lang/String;[Landroid/os/Parcelable;)V

    return-void
.end method

.method public setCollectButtonEnabled(Z)V
    .locals 1

    .line 248
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesActivity;->bCollect:Landroid/widget/Button;

    invoke-virtual {v0, p1}, Landroid/widget/Button;->setEnabled(Z)V

    return-void
.end method

.method public setRows(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/activity/redeem/verify/row/AbstractVerifiedRebatesRow;",
            ">;)V"
        }
    .end annotation

    .line 218
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesActivity;->adapter:Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesRecyclerAdapter;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesRecyclerAdapter;->setRows(Ljava/util/List;)V

    return-void
.end method

.method public setVerificationOfferQuantityStates(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedOfferQuantityState;",
            ">;)V"
        }
    .end annotation

    .line 228
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesActivity;->voqStates:Ljava/util/List;

    return-void
.end method

.method public setVerificationSummary(ZILjava/lang/String;)V
    .locals 5

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    .line 236
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesActivity;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const p3, 0x7f0f0008

    new-array v0, v0, [Ljava/lang/Object;

    .line 237
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v0, v1

    .line 236
    invoke-virtual {p1, p3, p2, v0}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    .line 239
    :cond_0
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesActivity;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const v2, 0x7f0f0007

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    .line 240
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v3, v1

    aput-object p3, v3, v0

    .line 239
    invoke-virtual {p1, v2, p2, v3}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    .line 243
    :goto_0
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesActivity;->bCollect:Landroid/widget/Button;

    invoke-virtual {p2, p1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public showAddRebates(Lcom/ibotta/android/fragment/retailer/RetailerParcel;Ljava/util/Set;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/fragment/retailer/RetailerParcel;",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x0

    .line 213
    invoke-static {p0, p1, p2, v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesActivity;->start(Landroid/content/Context;Lcom/ibotta/android/fragment/retailer/RetailerParcel;Ljava/util/Set;Z)V

    return-void
.end method

.method public showBarcodeScannerForResult(ILcom/ibotta/android/fragment/retailer/RetailerParcel;)V
    .locals 1

    .line 253
    new-instance v0, Lcom/ibotta/android/routing/intent/VerifyWizardIntentCreator;

    invoke-direct {v0, p0, p2, p1}, Lcom/ibotta/android/routing/intent/VerifyWizardIntentCreator;-><init>(Landroid/content/Context;Lcom/ibotta/android/fragment/retailer/RetailerParcel;I)V

    invoke-virtual {v0}, Lcom/ibotta/android/routing/intent/VerifyWizardIntentCreator;->create()Landroid/content/Intent;

    move-result-object p1

    const/16 p2, 0xb

    .line 254
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesActivity;->startActivityForResult(Landroid/content/Intent;I)V

    return-void
.end method

.method public showChangeQuantityForResult(Lcom/ibotta/api/model/OfferModel;)V
    .locals 1

    .line 223
    invoke-interface {p1}, Lcom/ibotta/api/model/OfferModel;->getId()I

    move-result p1

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesActivity;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-static {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/ChangeQuantityActivity;->startForResult(Landroid/app/Activity;ILcom/ibotta/android/fragment/retailer/RetailerParcel;)V

    return-void
.end method

.method public showExitConfirmation()V
    .locals 3

    const v0, 0x7f11065e

    .line 268
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 270
    new-instance v1, Landroid/support/v7/app/AlertDialog$Builder;

    invoke-direct {v1, p0}, Landroid/support/v7/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 271
    invoke-virtual {v1, v0}, Landroid/support/v7/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/support/v7/app/AlertDialog$Builder;

    .line 273
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesActivity$1;

    invoke-direct {v0, p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesActivity$1;-><init>(Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesActivity;)V

    const v2, 0x7f110142

    invoke-virtual {v1, v2, v0}, Landroid/support/v7/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/support/v7/app/AlertDialog$Builder;

    .line 280
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesActivity$2;

    invoke-direct {v0, p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesActivity$2;-><init>(Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesActivity;)V

    const v2, 0x7f11020e

    invoke-virtual {v1, v2, v0}, Landroid/support/v7/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/support/v7/app/AlertDialog$Builder;

    .line 287
    invoke-virtual {v1}, Landroid/support/v7/app/AlertDialog$Builder;->create()Landroid/support/v7/app/AlertDialog;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v7/app/AlertDialog;->show()V

    return-void
.end method

.method public showProductVerifiedSuccess()V
    .locals 1

    const v0, 0x7f110664

    .line 259
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesActivity;->showQuickMessage(I)V

    return-void
.end method

.method public showRemoveConfirmation(Lcom/ibotta/api/model/OfferModel;)V
    .locals 3

    const v0, 0x7f11065d

    .line 297
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 299
    new-instance v1, Landroid/support/v7/app/AlertDialog$Builder;

    invoke-direct {v1, p0}, Landroid/support/v7/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 300
    invoke-virtual {v1, v0}, Landroid/support/v7/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/support/v7/app/AlertDialog$Builder;

    .line 302
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesActivity$3;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesActivity$3;-><init>(Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesActivity;Lcom/ibotta/api/model/OfferModel;)V

    const v2, 0x7f110142

    invoke-virtual {v1, v2, v0}, Landroid/support/v7/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/support/v7/app/AlertDialog$Builder;

    .line 309
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesActivity$4;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesActivity$4;-><init>(Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesActivity;Lcom/ibotta/api/model/OfferModel;)V

    const p1, 0x7f11020e

    invoke-virtual {v1, p1, v0}, Landroid/support/v7/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/support/v7/app/AlertDialog$Builder;

    .line 316
    invoke-virtual {v1}, Landroid/support/v7/app/AlertDialog$Builder;->create()Landroid/support/v7/app/AlertDialog;

    move-result-object p1

    invoke-virtual {p1}, Landroid/support/v7/app/AlertDialog;->show()V

    return-void
.end method

.method public showSubmitReceipt(Lcom/ibotta/android/fragment/retailer/RetailerParcel;F)V
    .locals 0

    .line 292
    invoke-static {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptActivity;->start(Landroid/content/Context;Lcom/ibotta/android/fragment/retailer/RetailerParcel;F)V

    return-void
.end method
