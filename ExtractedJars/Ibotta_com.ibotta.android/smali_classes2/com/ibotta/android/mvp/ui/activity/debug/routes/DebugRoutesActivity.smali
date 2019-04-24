.class public Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesActivity;
.super Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;
.source "DebugRoutesActivity.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesView;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity<",
        "Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesPresenter;",
        "Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesComponent;",
        ">;",
        "Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesView;"
    }
.end annotation


# instance fields
.field protected etRoute:Landroid/widget/EditText;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0901d4
    .end annotation
.end field

.field protected pushMessaging:Lcom/ibotta/android/service/push/PushMessaging;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected sBonuses:Landroid/widget/Spinner;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0903e0
    .end annotation
.end field

.field protected sOfferCategories:Landroid/widget/Spinner;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0903e5
    .end annotation
.end field

.field protected sOffers:Landroid/widget/Spinner;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0903e6
    .end annotation
.end field

.field protected sRetailerCategories:Landroid/widget/Spinner;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0903e7
    .end annotation
.end field

.field protected sRetailers:Landroid/widget/Spinner;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0903e8
    .end annotation
.end field

.field protected sRoutes:Landroid/widget/Spinner;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0903e9
    .end annotation
.end field

.field protected trBonuses:Landroid/widget/TableRow;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090495
    .end annotation
.end field

.field protected trOfferCategories:Landroid/widget/TableRow;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090496
    .end annotation
.end field

.field protected trOffers:Landroid/widget/TableRow;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090497
    .end annotation
.end field

.field protected trRetailerCategories:Landroid/widget/TableRow;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090498
    .end annotation
.end field

.field protected trRetailers:Landroid/widget/TableRow;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090499
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 30
    invoke-direct {p0}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;-><init>()V

    return-void
.end method

.method static synthetic access$000(Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesActivity;Landroid/widget/AdapterView;I)V
    .locals 0

    .line 30
    invoke-direct {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesActivity;->onRouteSelected(Landroid/widget/AdapterView;I)V

    return-void
.end method

.method static synthetic access$100(Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesActivity;)V
    .locals 0

    .line 30
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesActivity;->onRetailerSelected()V

    return-void
.end method

.method static synthetic access$200(Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesActivity;)V
    .locals 0

    .line 30
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesActivity;->onOfferSelected()V

    return-void
.end method

.method static synthetic access$300(Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesActivity;)V
    .locals 0

    .line 30
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesActivity;->onOfferCategorySelected()V

    return-void
.end method

.method static synthetic access$400(Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesActivity;)V
    .locals 0

    .line 30
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesActivity;->onRetailerCategorySelected()V

    return-void
.end method

.method static synthetic access$500(Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesActivity;)V
    .locals 0

    .line 30
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesActivity;->onBonusSelected()V

    return-void
.end method

.method private getSelectedRetailerId()I
    .locals 1

    .line 339
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesActivity;->sRetailers:Landroid/widget/Spinner;

    invoke-virtual {v0}, Landroid/widget/Spinner;->getSelectedItem()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/RouteItem;

    if-eqz v0, :cond_0

    .line 340
    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/RouteItem;->getId()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private hideAllSpinners()V
    .locals 2

    .line 265
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesActivity;->trRetailers:Landroid/widget/TableRow;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TableRow;->setVisibility(I)V

    .line 266
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesActivity;->trOffers:Landroid/widget/TableRow;

    invoke-virtual {v0, v1}, Landroid/widget/TableRow;->setVisibility(I)V

    .line 267
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesActivity;->trOfferCategories:Landroid/widget/TableRow;

    invoke-virtual {v0, v1}, Landroid/widget/TableRow;->setVisibility(I)V

    .line 268
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesActivity;->trRetailerCategories:Landroid/widget/TableRow;

    invoke-virtual {v0, v1}, Landroid/widget/TableRow;->setVisibility(I)V

    .line 269
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesActivity;->trBonuses:Landroid/widget/TableRow;

    invoke-virtual {v0, v1}, Landroid/widget/TableRow;->setVisibility(I)V

    return-void
.end method

.method private initBonusesSpinner()V
    .locals 2

    .line 147
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesActivity;->sBonuses:Landroid/widget/Spinner;

    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesActivity$6;

    invoke-direct {v1, p0}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesActivity$6;-><init>(Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/Spinner;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V

    return-void
.end method

.method private initOfferCategoriesSpinner()V
    .locals 2

    .line 121
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesActivity;->sOfferCategories:Landroid/widget/Spinner;

    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesActivity$4;

    invoke-direct {v1, p0}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesActivity$4;-><init>(Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/Spinner;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V

    return-void
.end method

.method private initOffersSpinner()V
    .locals 2

    .line 108
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesActivity;->sOffers:Landroid/widget/Spinner;

    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesActivity$3;

    invoke-direct {v1, p0}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesActivity$3;-><init>(Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/Spinner;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V

    return-void
.end method

.method private initRetailerCategoriesSpinner()V
    .locals 2

    .line 134
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesActivity;->sRetailerCategories:Landroid/widget/Spinner;

    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesActivity$5;

    invoke-direct {v1, p0}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesActivity$5;-><init>(Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/Spinner;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V

    return-void
.end method

.method private initRetailersSpinner()V
    .locals 2

    .line 95
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesActivity;->sRetailers:Landroid/widget/Spinner;

    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesActivity$2;

    invoke-direct {v1, p0}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesActivity$2;-><init>(Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/Spinner;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V

    return-void
.end method

.method private initRoutesSpinner()V
    .locals 2

    .line 82
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesActivity;->sRoutes:Landroid/widget/Spinner;

    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesActivity$1;

    invoke-direct {v1, p0}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesActivity$1;-><init>(Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/Spinner;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V

    return-void
.end method

.method private initTitle()V
    .locals 1

    const v0, 0x7f11004f

    .line 78
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesActivity;->setTitle(I)V

    return-void
.end method

.method private onBonusSelected()V
    .locals 1

    .line 325
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesPresenter;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesPresenter;->onBonusSelected()V

    return-void
.end method

.method private onOfferCategorySelected()V
    .locals 1

    .line 317
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesPresenter;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesPresenter;->onOfferCategorySelected()V

    return-void
.end method

.method private onOfferSelected()V
    .locals 1

    .line 313
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesPresenter;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesPresenter;->onOfferSelected()V

    return-void
.end method

.method private onRetailerCategorySelected()V
    .locals 1

    .line 321
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesPresenter;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesPresenter;->onRetailerCategorySelected()V

    return-void
.end method

.method private onRetailerSelected()V
    .locals 2

    .line 309
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesPresenter;

    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesActivity;->getSelectedRetailerId()I

    move-result v1

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesPresenter;->onRetailerSelected(I)V

    return-void
.end method

.method private onRouteSelected(Landroid/widget/AdapterView;I)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView<",
            "*>;I)V"
        }
    .end annotation

    .line 304
    invoke-virtual {p1}, Landroid/widget/AdapterView;->getAdapter()Landroid/widget/Adapter;

    move-result-object p1

    invoke-interface {p1, p2}, Landroid/widget/Adapter;->getItem(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/debug/routes/RouteItem;

    .line 305
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast p2, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesPresenter;

    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesActivity;->getSelectedRetailerId()I

    move-result v0

    invoke-interface {p2, p1, v0}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesPresenter;->onRouteSelected(Lcom/ibotta/android/mvp/ui/activity/debug/routes/RouteItem;I)V

    return-void
.end method

.method private replaceTokenWithId(ZLandroid/widget/Spinner;Ljava/lang/String;Ljava/lang/StringBuilder;)V
    .locals 2

    if-nez p1, :cond_0

    return-void

    .line 295
    :cond_0
    invoke-virtual {p2}, Landroid/widget/Spinner;->getSelectedItem()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/debug/routes/RouteItem;

    if-eqz p1, :cond_1

    .line 297
    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/RouteItem;->getId()I

    move-result p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p3, p1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p1

    const/4 p2, 0x0

    .line 298
    invoke-virtual {p4}, Ljava/lang/StringBuilder;->length()I

    move-result p3

    invoke-virtual {p4, p2, p3}, Ljava/lang/StringBuilder;->delete(II)Ljava/lang/StringBuilder;

    .line 299
    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1
    return-void
.end method

.method private showOfferCategorySpinnerIfNeeded(Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute;)V
    .locals 1

    .line 259
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute;->isCategory()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 260
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesActivity;->trOfferCategories:Landroid/widget/TableRow;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/widget/TableRow;->setVisibility(I)V

    :cond_0
    return-void
.end method

.method private showOfferSpinnerIfNeeded(Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute;)V
    .locals 1

    .line 253
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute;->isOffer()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 254
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesActivity;->trOffers:Landroid/widget/TableRow;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/widget/TableRow;->setVisibility(I)V

    :cond_0
    return-void
.end method

.method private showSecondLevelSpinnerIfNeeded(Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute;)Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute;
    .locals 2

    .line 241
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute;->isRetailerCategory()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 242
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesActivity;->trRetailerCategories:Landroid/widget/TableRow;

    invoke-virtual {v0, v1}, Landroid/widget/TableRow;->setVisibility(I)V

    goto :goto_0

    .line 243
    :cond_0
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute;->isBonuses()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 244
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesActivity;->trBonuses:Landroid/widget/TableRow;

    invoke-virtual {v0, v1}, Landroid/widget/TableRow;->setVisibility(I)V

    goto :goto_0

    .line 245
    :cond_1
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute;->isRetailer()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 246
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesActivity;->trRetailers:Landroid/widget/TableRow;

    invoke-virtual {v0, v1}, Landroid/widget/TableRow;->setVisibility(I)V

    :cond_2
    :goto_0
    return-object p1
.end method

.method private updateRouteTextForCurrentState(Lcom/ibotta/android/mvp/ui/activity/debug/routes/RouteItem;)V
    .locals 4
    .param p1    # Lcom/ibotta/android/mvp/ui/activity/debug/routes/RouteItem;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    if-eqz p1, :cond_1

    .line 273
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/RouteItem;->getRoute()Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 278
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/RouteItem;->getRoute()Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute;->getFormat()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 279
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/RouteItem;->getRoute()Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute;

    move-result-object p1

    .line 281
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute;->isRetailerCategory()Z

    move-result v1

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesActivity;->sRetailerCategories:Landroid/widget/Spinner;

    const-string v3, ":category"

    invoke-direct {p0, v1, v2, v3, v0}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesActivity;->replaceTokenWithId(ZLandroid/widget/Spinner;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 282
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute;->isRetailer()Z

    move-result v1

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesActivity;->sRetailers:Landroid/widget/Spinner;

    const-string v3, ":retailer"

    invoke-direct {p0, v1, v2, v3, v0}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesActivity;->replaceTokenWithId(ZLandroid/widget/Spinner;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 283
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute;->isBonuses()Z

    move-result v1

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesActivity;->sBonuses:Landroid/widget/Spinner;

    const-string v3, ":bonus"

    invoke-direct {p0, v1, v2, v3, v0}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesActivity;->replaceTokenWithId(ZLandroid/widget/Spinner;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 284
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute;->isCategory()Z

    move-result v1

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesActivity;->sOfferCategories:Landroid/widget/Spinner;

    const-string v3, ":offer_category"

    invoke-direct {p0, v1, v2, v3, v0}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesActivity;->replaceTokenWithId(ZLandroid/widget/Spinner;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 285
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute;->isOffer()Z

    move-result p1

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesActivity;->sOffers:Landroid/widget/Spinner;

    const-string v2, ":offer"

    invoke-direct {p0, p1, v1, v2, v0}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesActivity;->replaceTokenWithId(ZLandroid/widget/Spinner;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 287
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesActivity;->etRoute:Landroid/widget/EditText;

    invoke-virtual {p1, v0}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    return-void

    .line 274
    :cond_1
    :goto_0
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesActivity;->etRoute:Landroid/widget/EditText;

    const-string v0, ""

    invoke-virtual {p1, v0}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private updateSpinnerVisibilitiesForCurrentState(Lcom/ibotta/android/mvp/ui/activity/debug/routes/RouteItem;)V
    .locals 1
    .param p1    # Lcom/ibotta/android/mvp/ui/activity/debug/routes/RouteItem;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 230
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesActivity;->hideAllSpinners()V

    if-eqz p1, :cond_0

    .line 232
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/RouteItem;->getRoute()Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 233
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/RouteItem;->getRoute()Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute;

    move-result-object p1

    .line 234
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesActivity;->showSecondLevelSpinnerIfNeeded(Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute;)Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute;

    .line 235
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesActivity;->showOfferSpinnerIfNeeded(Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute;)V

    .line 236
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesActivity;->showOfferCategorySpinnerIfNeeded(Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoute;)V

    :cond_0
    return-void
.end method


# virtual methods
.method protected bridge synthetic createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/base/MvpComponent;
    .locals 0

    .line 30
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesActivity;->createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesComponent;

    move-result-object p1

    return-object p1
.end method

.method protected createComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesComponent;
    .locals 1

    .line 50
    invoke-static {}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DaggerDebugRoutesComponent;->builder()Lcom/ibotta/android/mvp/ui/activity/debug/routes/DaggerDebugRoutesComponent$Builder;

    move-result-object v0

    .line 51
    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DaggerDebugRoutesComponent$Builder;->mainComponent(Lcom/ibotta/android/di/MainComponent;)Lcom/ibotta/android/mvp/ui/activity/debug/routes/DaggerDebugRoutesComponent$Builder;

    move-result-object p1

    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesModule;

    invoke-direct {v0, p0}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesModule;-><init>(Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesView;)V

    .line 52
    invoke-virtual {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DaggerDebugRoutesComponent$Builder;->debugRoutesModule(Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesModule;)Lcom/ibotta/android/mvp/ui/activity/debug/routes/DaggerDebugRoutesComponent$Builder;

    move-result-object p1

    .line 53
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DaggerDebugRoutesComponent$Builder;->build()Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesComponent;

    move-result-object p1

    return-object p1
.end method

.method protected bridge synthetic inject(Lcom/ibotta/android/mvp/base/MvpComponent;)V
    .locals 0

    .line 30
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesComponent;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesActivity;->inject(Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesComponent;)V

    return-void
.end method

.method protected inject(Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesComponent;)V
    .locals 0

    .line 58
    invoke-interface {p1, p0}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesComponent;->inject(Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesActivity;)V

    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 0
    .param p1    # Landroid/os/Bundle;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 63
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/LoadingMvpActivity;->onCreate(Landroid/os/Bundle;)V

    const p1, 0x7f0c002f

    .line 65
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesActivity;->setContentView(I)V

    .line 66
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/app/Activity;)Lbutterknife/Unbinder;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesActivity;->setUnbinder(Lbutterknife/Unbinder;)V

    .line 68
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesActivity;->initTitle()V

    .line 69
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesActivity;->initRoutesSpinner()V

    .line 70
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesActivity;->initRetailersSpinner()V

    .line 71
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesActivity;->initOffersSpinner()V

    .line 72
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesActivity;->initOfferCategoriesSpinner()V

    .line 73
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesActivity;->initRetailerCategoriesSpinner()V

    .line 74
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesActivity;->initBonusesSpinner()V

    return-void
.end method

.method protected onGoClicked()V
    .locals 1
    .annotation runtime Lbutterknife/OnClick;
        value = {
            0x7f090088
        }
    .end annotation

    .line 335
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesPresenter;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesPresenter;->onGoClicked()V

    return-void
.end method

.method protected onNotifyClicked()V
    .locals 1
    .annotation runtime Lbutterknife/OnClick;
        value = {
            0x7f090097
        }
    .end annotation

    .line 330
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesActivity;->mvpPresenter:Lcom/ibotta/android/mvp/base/MvpPresenter;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesPresenter;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesPresenter;->onNotifyClicked()V

    return-void
.end method

.method public setBonusRouteItems(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/activity/debug/routes/RouteItem;",
            ">;)V"
        }
    .end annotation

    .line 191
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesActivity;->sBonuses:Landroid/widget/Spinner;

    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/debug/routes/SpinnerRouteItemAdapter;

    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesActivity;->getActivity()Landroid/app/Activity;

    move-result-object v2

    invoke-direct {v1, v2, p1}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/SpinnerRouteItemAdapter;-><init>(Landroid/content/Context;Ljava/util/List;)V

    invoke-virtual {v0, v1}, Landroid/widget/Spinner;->setAdapter(Landroid/widget/SpinnerAdapter;)V

    .line 193
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_0

    .line 194
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesActivity;->onBonusSelected()V

    :cond_0
    return-void
.end method

.method public setOfferCategoryRouteItems(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/activity/debug/routes/RouteItem;",
            ">;)V"
        }
    .end annotation

    .line 209
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesActivity;->sOfferCategories:Landroid/widget/Spinner;

    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/debug/routes/SpinnerRouteItemAdapter;

    invoke-direct {v1, p0, p1}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/SpinnerRouteItemAdapter;-><init>(Landroid/content/Context;Ljava/util/List;)V

    invoke-virtual {v0, v1}, Landroid/widget/Spinner;->setAdapter(Landroid/widget/SpinnerAdapter;)V

    .line 211
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_0

    .line 212
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesActivity;->onOfferCategorySelected()V

    :cond_0
    return-void
.end method

.method public setOfferRouteItems(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/activity/debug/routes/RouteItem;",
            ">;)V"
        }
    .end annotation

    .line 200
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesActivity;->sOffers:Landroid/widget/Spinner;

    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/debug/routes/SpinnerRouteItemAdapter;

    invoke-direct {v1, p0, p1}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/SpinnerRouteItemAdapter;-><init>(Landroid/content/Context;Ljava/util/List;)V

    invoke-virtual {v0, v1}, Landroid/widget/Spinner;->setAdapter(Landroid/widget/SpinnerAdapter;)V

    .line 202
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_0

    .line 203
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesActivity;->onOfferSelected()V

    :cond_0
    return-void
.end method

.method public setRetailerCategoryRouteItems(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/activity/debug/routes/RouteItem;",
            ">;)V"
        }
    .end annotation

    .line 173
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesActivity;->sRetailerCategories:Landroid/widget/Spinner;

    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/debug/routes/SpinnerRouteItemAdapter;

    invoke-direct {v1, p0, p1}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/SpinnerRouteItemAdapter;-><init>(Landroid/content/Context;Ljava/util/List;)V

    invoke-virtual {v0, v1}, Landroid/widget/Spinner;->setAdapter(Landroid/widget/SpinnerAdapter;)V

    .line 175
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_0

    .line 176
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesActivity;->onRetailerCategorySelected()V

    :cond_0
    return-void
.end method

.method public setRetailerRouteItems(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/activity/debug/routes/RouteItem;",
            ">;)V"
        }
    .end annotation

    .line 182
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesActivity;->sRetailers:Landroid/widget/Spinner;

    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/debug/routes/SpinnerRouteItemAdapter;

    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesActivity;->getActivity()Landroid/app/Activity;

    move-result-object v2

    invoke-direct {v1, v2, p1}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/SpinnerRouteItemAdapter;-><init>(Landroid/content/Context;Ljava/util/List;)V

    invoke-virtual {v0, v1}, Landroid/widget/Spinner;->setAdapter(Landroid/widget/SpinnerAdapter;)V

    .line 184
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_0

    .line 185
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesActivity;->onRetailerSelected()V

    :cond_0
    return-void
.end method

.method public setRouteItems(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/activity/debug/routes/RouteItem;",
            ">;)V"
        }
    .end annotation

    .line 167
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesActivity;->sRoutes:Landroid/widget/Spinner;

    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/debug/routes/SpinnerRouteItemAdapter;

    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesActivity;->getActivity()Landroid/app/Activity;

    move-result-object v2

    invoke-direct {v1, v2, p1}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/SpinnerRouteItemAdapter;-><init>(Landroid/content/Context;Ljava/util/List;)V

    invoke-virtual {v0, v1}, Landroid/widget/Spinner;->setAdapter(Landroid/widget/SpinnerAdapter;)V

    .line 168
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesActivity;->sRoutes:Landroid/widget/Spinner;

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesActivity;->onRouteSelected(Landroid/widget/AdapterView;I)V

    return-void
.end method

.method public showStatusBarRouteNotification(Lcom/ibotta/android/mvp/ui/activity/debug/routes/RouteItem;)V
    .locals 3

    .line 218
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesActivity;->pushMessaging:Lcom/ibotta/android/service/push/PushMessaging;

    .line 219
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/RouteItem;->getLabel()Ljava/lang/String;

    move-result-object p1

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesActivity;->etRoute:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    .line 218
    invoke-virtual {v0, p1, v1, v2, v2}, Lcom/ibotta/android/service/push/PushMessaging;->buildTestIntent(Ljava/lang/String;Ljava/lang/String;ZZ)Landroid/content/Intent;

    move-result-object p1

    .line 220
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesActivity;->pushMessaging:Lcom/ibotta/android/service/push/PushMessaging;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/service/push/PushMessaging;->onMessage(Landroid/content/Intent;)V

    return-void
.end method

.method public startRouteScreen()V
    .locals 4

    .line 225
    new-instance v0, Lcom/ibotta/android/routing/intent/RoutingIntentCreator;

    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesActivity;->getActivity()Landroid/app/Activity;

    move-result-object v1

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesActivity;->etRoute:Landroid/widget/EditText;

    invoke-virtual {v2}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lcom/ibotta/android/routing/intent/RoutingIntentCreator;-><init>(Landroid/content/Context;Ljava/lang/String;Z)V

    invoke-virtual {v0}, Lcom/ibotta/android/routing/intent/RoutingIntentCreator;->create()Landroid/content/Intent;

    move-result-object v0

    .line 226
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesActivity;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method public updateUiForCurrentState(Lcom/ibotta/android/mvp/ui/activity/debug/routes/RouteItem;)V
    .locals 0
    .param p1    # Lcom/ibotta/android/mvp/ui/activity/debug/routes/RouteItem;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 161
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesActivity;->updateSpinnerVisibilitiesForCurrentState(Lcom/ibotta/android/mvp/ui/activity/debug/routes/RouteItem;)V

    .line 162
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/debug/routes/DebugRoutesActivity;->updateRouteTextForCurrentState(Lcom/ibotta/android/mvp/ui/activity/debug/routes/RouteItem;)V

    return-void
.end method
