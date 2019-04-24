.class public Lcom/ibotta/android/collection/FeaturedRetailerModelComparator;
.super Ljava/lang/Object;
.source "FeaturedRetailerModelComparator.java"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator<",
        "Lcom/ibotta/api/model/RetailerModel;",
        ">;"
    }
.end annotation


# instance fields
.field private r:Ljava/util/Random;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    new-instance v0, Ljava/util/Random;

    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/collection/FeaturedRetailerModelComparator;->r:Ljava/util/Random;

    return-void
.end method


# virtual methods
.method public compare(Lcom/ibotta/api/model/RetailerModel;Lcom/ibotta/api/model/RetailerModel;)I
    .locals 0

    .line 19
    invoke-interface {p1}, Lcom/ibotta/api/model/RetailerModel;->getHomeSortOrder()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {p2}, Lcom/ibotta/api/model/RetailerModel;->getHomeSortOrder()I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/Integer;->compareTo(Ljava/lang/Integer;)I

    move-result p1

    if-nez p1, :cond_1

    .line 23
    iget-object p1, p0, Lcom/ibotta/android/collection/FeaturedRetailerModelComparator;->r:Ljava/util/Random;

    invoke-virtual {p1}, Ljava/util/Random;->nextBoolean()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, -0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x1

    :cond_1
    :goto_0
    return p1
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    .line 11
    check-cast p1, Lcom/ibotta/api/model/RetailerModel;

    check-cast p2, Lcom/ibotta/api/model/RetailerModel;

    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/collection/FeaturedRetailerModelComparator;->compare(Lcom/ibotta/api/model/RetailerModel;Lcom/ibotta/api/model/RetailerModel;)I

    move-result p1

    return p1
.end method
