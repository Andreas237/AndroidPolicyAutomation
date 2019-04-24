.class public Lcom/ibotta/android/mvp/ui/activity/find/row/RetailerCategoriesRow;
.super Lcom/ibotta/android/mvp/ui/activity/find/row/AbstractFindRebatesRow;
.source "RetailerCategoriesRow.java"


# instance fields
.field private final retailerCategoriesViewState:Lcom/ibotta/android/views/categories/RetailerCategoriesViewState;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/views/categories/RetailerCategoriesViewState;)V
    .locals 1

    .line 14
    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesRowType;->RETAILER_CATEGORIES:Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesRowType;

    invoke-direct {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/find/row/AbstractFindRebatesRow;-><init>(Lcom/ibotta/android/mvp/ui/activity/find/FindRebatesRowType;)V

    .line 15
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/find/row/RetailerCategoriesRow;->retailerCategoriesViewState:Lcom/ibotta/android/views/categories/RetailerCategoriesViewState;

    return-void
.end method


# virtual methods
.method public getCategories()Lcom/ibotta/android/views/categories/RetailerCategoriesViewState;
    .locals 1

    .line 19
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/find/row/RetailerCategoriesRow;->retailerCategoriesViewState:Lcom/ibotta/android/views/categories/RetailerCategoriesViewState;

    return-object v0
.end method
