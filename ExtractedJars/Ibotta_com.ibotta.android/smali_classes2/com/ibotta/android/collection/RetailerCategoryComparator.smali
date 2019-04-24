.class public Lcom/ibotta/android/collection/RetailerCategoryComparator;
.super Ljava/lang/Object;
.source "RetailerCategoryComparator.java"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator<",
        "Lcom/ibotta/api/model/retailer/Category;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public compare(Lcom/ibotta/api/model/retailer/Category;Lcom/ibotta/api/model/retailer/Category;)I
    .locals 0

    .line 13
    invoke-virtual {p1}, Lcom/ibotta/api/model/retailer/Category;->getSortOrder()F

    move-result p1

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-virtual {p2}, Lcom/ibotta/api/model/retailer/Category;->getSortOrder()F

    move-result p2

    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/Float;->compareTo(Ljava/lang/Float;)I

    move-result p1

    mul-int/lit8 p1, p1, -0x1

    return p1
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    .line 10
    check-cast p1, Lcom/ibotta/api/model/retailer/Category;

    check-cast p2, Lcom/ibotta/api/model/retailer/Category;

    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/collection/RetailerCategoryComparator;->compare(Lcom/ibotta/api/model/retailer/Category;Lcom/ibotta/api/model/retailer/Category;)I

    move-result p1

    return p1
.end method
