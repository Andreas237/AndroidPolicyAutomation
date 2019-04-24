.class public Lcom/ibotta/android/collection/DefaultRetailerModelComparator;
.super Lcom/ibotta/android/collection/FavoriteRetailerModelComparator;
.source "DefaultRetailerModelComparator.java"


# direct methods
.method public constructor <init>(Lcom/ibotta/api/model/favorites/FavoriteRetailersManager;)V
    .locals 0

    .line 11
    invoke-direct {p0, p1}, Lcom/ibotta/android/collection/FavoriteRetailerModelComparator;-><init>(Lcom/ibotta/api/model/favorites/FavoriteRetailersManager;)V

    return-void
.end method


# virtual methods
.method public compare(Lcom/ibotta/api/model/RetailerModel;Lcom/ibotta/api/model/RetailerModel;)I
    .locals 1

    .line 16
    invoke-super {p0, p1, p2}, Lcom/ibotta/android/collection/FavoriteRetailerModelComparator;->compare(Lcom/ibotta/api/model/RetailerModel;Lcom/ibotta/api/model/RetailerModel;)I

    move-result v0

    if-nez v0, :cond_0

    .line 19
    invoke-interface {p1}, Lcom/ibotta/api/model/RetailerModel;->getSortData()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2}, Lcom/ibotta/api/model/RetailerModel;->getSortData()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result v0

    :cond_0
    return v0
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    .line 9
    check-cast p1, Lcom/ibotta/api/model/RetailerModel;

    check-cast p2, Lcom/ibotta/api/model/RetailerModel;

    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/collection/DefaultRetailerModelComparator;->compare(Lcom/ibotta/api/model/RetailerModel;Lcom/ibotta/api/model/RetailerModel;)I

    move-result p1

    return p1
.end method
