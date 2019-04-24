.class public Lcom/ibotta/android/mvp/ui/activity/featured/row/FeaturedRetailersRow;
.super Lcom/ibotta/android/mvp/ui/activity/featured/row/AbstractFeaturedRow;
.source "FeaturedRetailersRow.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/featured/row/ModuleRow;


# instance fields
.field private final listViewState:Lcom/ibotta/android/horiz/RetailerSSCardListViewState;

.field private module:Lcom/ibotta/api/model/base/Module;

.field private final titleBarViewState:Lcom/ibotta/android/views/base/title/TitleBarViewState;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/horiz/RetailerSSCardListViewState;Lcom/ibotta/android/views/base/title/TitleBarViewState;)V
    .locals 1

    .line 19
    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRowType;->FEATURED_RETAILERS:Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRowType;

    invoke-direct {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/featured/row/AbstractFeaturedRow;-><init>(Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRowType;)V

    .line 20
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/featured/row/FeaturedRetailersRow;->titleBarViewState:Lcom/ibotta/android/views/base/title/TitleBarViewState;

    .line 21
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/row/FeaturedRetailersRow;->listViewState:Lcom/ibotta/android/horiz/RetailerSSCardListViewState;

    return-void
.end method


# virtual methods
.method public getListViewState()Lcom/ibotta/android/horiz/RetailerSSCardListViewState;
    .locals 1

    .line 38
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/row/FeaturedRetailersRow;->listViewState:Lcom/ibotta/android/horiz/RetailerSSCardListViewState;

    return-object v0
.end method

.method public getModule()Lcom/ibotta/api/model/base/Module;
    .locals 1

    .line 26
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/row/FeaturedRetailersRow;->module:Lcom/ibotta/api/model/base/Module;

    return-object v0
.end method

.method public getTitleBarViewState()Lcom/ibotta/android/views/base/title/TitleBarViewState;
    .locals 1

    .line 34
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/row/FeaturedRetailersRow;->titleBarViewState:Lcom/ibotta/android/views/base/title/TitleBarViewState;

    return-object v0
.end method

.method public setModule(Lcom/ibotta/api/model/base/Module;)V
    .locals 0

    .line 30
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/row/FeaturedRetailersRow;->module:Lcom/ibotta/api/model/base/Module;

    return-void
.end method
