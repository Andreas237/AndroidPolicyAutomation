.class public Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity_ViewBinding;
.super Ljava/lang/Object;
.source "SpotlightActivity_ViewBinding.java"

# interfaces
.implements Lbutterknife/Unbinder;


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation


# instance fields
.field private target:Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;

.field private view7f0905bd:Landroid/view/View;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;)V
    .locals 1
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 31
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity_ViewBinding;-><init>(Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;Landroid/view/View;)V

    return-void
.end method

.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;Landroid/view/View;)V
    .locals 3
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;

    const-string v0, "field \'rsdvDetails\'"

    .line 39
    const-class v1, Lcom/ibotta/android/mvp/ui/view/spotlight/details/RebateSpotlightDetailsView;

    const v2, 0x7f0903d3

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/view/spotlight/details/RebateSpotlightDetailsView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->rsdvDetails:Lcom/ibotta/android/mvp/ui/view/spotlight/details/RebateSpotlightDetailsView;

    const-string v0, "field \'srovAlsoBoughtViewedOffers\'"

    .line 40
    const-class v1, Lcom/ibotta/android/mvp/ui/view/spotlight/RelatedOffersList;

    const v2, 0x7f090427

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/view/spotlight/RelatedOffersList;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->srovAlsoBoughtViewedOffers:Lcom/ibotta/android/mvp/ui/view/spotlight/RelatedOffersList;

    const-string v0, "field \'hsmvRelatedBonuses\'"

    .line 41
    const-class v1, Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;

    const v2, 0x7f090227

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->hsmvRelatedBonuses:Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;

    const-string v0, "field \'ssavSpotlightAvailableAt\'"

    .line 42
    const-class v1, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightAvailableAtView;

    const v2, 0x7f0903ec

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightAvailableAtView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->ssavSpotlightAvailableAt:Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightAvailableAtView;

    const-string v0, "field \'sbvFinePrint\'"

    .line 43
    const-class v1, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightBlurbView;

    const v2, 0x7f0903f3

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightBlurbView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->sbvFinePrint:Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightBlurbView;

    const-string v0, "field \'sbvAbout\'"

    .line 44
    const-class v1, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightBlurbView;

    const v2, 0x7f0903f2

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightBlurbView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->sbvAbout:Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightBlurbView;

    const-string v0, "field \'slsvLocateStore\'"

    .line 45
    const-class v1, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightLocateStoreView;

    const v2, 0x7f090414

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightLocateStoreView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->slsvLocateStore:Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightLocateStoreView;

    const-string v0, "field \'llContentContainer\'"

    .line 46
    const-class v1, Landroid/widget/LinearLayout;

    const v2, 0x7f090304

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->llContentContainer:Landroid/widget/LinearLayout;

    const-string v0, "field \'stcvTopContent\'"

    .line 47
    const-class v1, Lcom/ibotta/android/mvp/ui/view/gallery/SpotlightTopContentView;

    const v2, 0x7f09042e

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/view/gallery/SpotlightTopContentView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->stcvTopContent:Lcom/ibotta/android/mvp/ui/view/gallery/SpotlightTopContentView;

    const-string v0, "field \'ilvRecentlyViewed\'"

    .line 48
    const-class v1, Lcom/ibotta/android/views/list/IbottaListView;

    const v2, 0x7f090249

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/views/list/IbottaListView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->ilvRecentlyViewed:Lcom/ibotta/android/views/list/IbottaListView;

    const-string v0, "field \'tbvRecentlyViewed\'"

    .line 49
    const-class v1, Lcom/ibotta/android/views/base/title/TitleBarView;

    const v2, 0x7f09044b

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/views/base/title/TitleBarView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->tbvRecentlyViewed:Lcom/ibotta/android/views/base/title/TitleBarView;

    const-string v0, "method \'onTopSpacingClicked\'"

    const v1, 0x7f0905bd

    .line 50
    invoke-static {p2, v1, v0}, Lbutterknife/internal/Utils;->findRequiredView(Landroid/view/View;ILjava/lang/String;)Landroid/view/View;

    move-result-object p2

    .line 51
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity_ViewBinding;->view7f0905bd:Landroid/view/View;

    .line 52
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity_ViewBinding$1;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity_ViewBinding$1;-><init>(Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity_ViewBinding;Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;)V

    instance-of p1, p2, Landroid/view/View;

    if-nez p1, :cond_0

    invoke-virtual {p2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    check-cast p2, Landroid/view/View;

    invoke-static {p2, v0}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    :goto_0
    return-void
.end method


# virtual methods
.method public unbind()V
    .locals 3
    .annotation build Landroid/support/annotation/CallSuper;
    .end annotation

    .line 63
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;

    if-eqz v0, :cond_1

    const/4 v1, 0x0

    .line 65
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;

    .line 67
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->rsdvDetails:Lcom/ibotta/android/mvp/ui/view/spotlight/details/RebateSpotlightDetailsView;

    .line 68
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->srovAlsoBoughtViewedOffers:Lcom/ibotta/android/mvp/ui/view/spotlight/RelatedOffersList;

    .line 69
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->hsmvRelatedBonuses:Lcom/ibotta/android/mvp/ui/view/list/horiz/HorizScrollingModuleView;

    .line 70
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->ssavSpotlightAvailableAt:Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightAvailableAtView;

    .line 71
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->sbvFinePrint:Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightBlurbView;

    .line 72
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->sbvAbout:Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightBlurbView;

    .line 73
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->slsvLocateStore:Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightLocateStoreView;

    .line 74
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->llContentContainer:Landroid/widget/LinearLayout;

    .line 75
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->stcvTopContent:Lcom/ibotta/android/mvp/ui/view/gallery/SpotlightTopContentView;

    .line 76
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->ilvRecentlyViewed:Lcom/ibotta/android/views/list/IbottaListView;

    .line 77
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity;->tbvRecentlyViewed:Lcom/ibotta/android/views/base/title/TitleBarView;

    .line 79
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity_ViewBinding;->view7f0905bd:Landroid/view/View;

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_0

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 80
    :goto_0
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightActivity_ViewBinding;->view7f0905bd:Landroid/view/View;

    return-void

    .line 64
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Bindings already cleared."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
