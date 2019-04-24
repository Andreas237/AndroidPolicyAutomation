.class public Lcom/ibotta/android/mvp/ui/activity/featured/row/GridRow;
.super Lcom/ibotta/android/mvp/ui/activity/featured/row/AbstractFeaturedRow;
.source "GridRow.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/featured/row/ModuleRow;


# instance fields
.field private final categories:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/retailer/Category;",
            ">;"
        }
    .end annotation
.end field

.field private final module:Lcom/ibotta/api/model/base/Module;

.field private final titleBarViewState:Lcom/ibotta/android/views/base/title/TitleBarViewState;


# direct methods
.method public constructor <init>(Lcom/ibotta/api/model/module/GridModule;Lcom/ibotta/android/views/base/title/TitleBarViewState;)V
    .locals 1

    .line 17
    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRowType;->GRID:Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRowType;

    invoke-direct {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/featured/row/AbstractFeaturedRow;-><init>(Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedRowType;)V

    .line 18
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/row/GridRow;->module:Lcom/ibotta/api/model/base/Module;

    .line 19
    invoke-virtual {p1}, Lcom/ibotta/api/model/module/GridModule;->getCategories()Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/row/GridRow;->categories:Ljava/util/List;

    .line 20
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/featured/row/GridRow;->titleBarViewState:Lcom/ibotta/android/views/base/title/TitleBarViewState;

    return-void
.end method


# virtual methods
.method public getCategories()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/retailer/Category;",
            ">;"
        }
    .end annotation

    .line 29
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/row/GridRow;->categories:Ljava/util/List;

    return-object v0
.end method

.method public getModule()Lcom/ibotta/api/model/base/Module;
    .locals 1

    .line 25
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/row/GridRow;->module:Lcom/ibotta/api/model/base/Module;

    return-object v0
.end method

.method public getTitleBarViewState()Lcom/ibotta/android/views/base/title/TitleBarViewState;
    .locals 1

    .line 33
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/featured/row/GridRow;->titleBarViewState:Lcom/ibotta/android/views/base/title/TitleBarViewState;

    return-object v0
.end method
