.class public Lcom/ibotta/android/mvp/ui/activity/find/row/FavoriteRetailersRow;
.super Lcom/ibotta/android/mvp/ui/activity/find/row/AbstractFindRebatesRow;
.source "FavoriteRetailersRow.java"


# instance fields
.field private final listViewState:Lcom/ibotta/android/horiz/RetailerSSCardListViewState;

.field private final titleBarViewState:Lcom/ibotta/android/views/base/title/TitleBarViewState;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/views/base/title/TitleBarViewState;Lcom/ibotta/android/horiz/RetailerSSCardListViewState;)V
    .locals 1

    .line 16
    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesRowType;->FAVORITE_RETAILERS:Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesRowType;

    invoke-direct {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/find/row/AbstractFindRebatesRow;-><init>(Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesRowType;)V

    .line 17
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/find/row/FavoriteRetailersRow;->titleBarViewState:Lcom/ibotta/android/views/base/title/TitleBarViewState;

    .line 18
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/find/row/FavoriteRetailersRow;->listViewState:Lcom/ibotta/android/horiz/RetailerSSCardListViewState;

    return-void
.end method


# virtual methods
.method public getListViewState()Lcom/ibotta/android/horiz/RetailerSSCardListViewState;
    .locals 1

    .line 26
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/find/row/FavoriteRetailersRow;->listViewState:Lcom/ibotta/android/horiz/RetailerSSCardListViewState;

    return-object v0
.end method

.method public getTitleBarViewState()Lcom/ibotta/android/views/base/title/TitleBarViewState;
    .locals 1

    .line 22
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/find/row/FavoriteRetailersRow;->titleBarViewState:Lcom/ibotta/android/views/base/title/TitleBarViewState;

    return-object v0
.end method
