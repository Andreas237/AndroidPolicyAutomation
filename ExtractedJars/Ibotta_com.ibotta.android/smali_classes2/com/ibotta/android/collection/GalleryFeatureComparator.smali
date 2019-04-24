.class public Lcom/ibotta/android/collection/GalleryFeatureComparator;
.super Lcom/ibotta/android/collection/FeatureComparator;
.source "GalleryFeatureComparator.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 13
    invoke-direct {p0}, Lcom/ibotta/android/collection/FeatureComparator;-><init>()V

    return-void
.end method


# virtual methods
.method public compare(Lcom/ibotta/api/model/feature/Feature;Lcom/ibotta/api/model/feature/Feature;)I
    .locals 2

    .line 16
    invoke-virtual {p1}, Lcom/ibotta/api/model/feature/Feature;->getRetailerCategoryIds()Ljava/util/Set;

    move-result-object v0

    .line 17
    invoke-virtual {p2}, Lcom/ibotta/api/model/feature/Feature;->getRetailerCategoryIds()Ljava/util/Set;

    move-result-object v1

    .line 19
    invoke-interface {v0}, Ljava/util/Set;->size()I

    move-result v0

    .line 20
    invoke-interface {v1}, Ljava/util/Set;->size()I

    move-result v1

    .line 22
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Integer;->compareTo(Ljava/lang/Integer;)I

    move-result v0

    mul-int/lit8 v0, v0, -0x1

    if-nez v0, :cond_0

    .line 25
    invoke-super {p0, p1, p2}, Lcom/ibotta/android/collection/FeatureComparator;->compare(Lcom/ibotta/api/model/feature/Feature;Lcom/ibotta/api/model/feature/Feature;)I

    move-result v0

    :cond_0
    return v0
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    .line 13
    check-cast p1, Lcom/ibotta/api/model/feature/Feature;

    check-cast p2, Lcom/ibotta/api/model/feature/Feature;

    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/collection/GalleryFeatureComparator;->compare(Lcom/ibotta/api/model/feature/Feature;Lcom/ibotta/api/model/feature/Feature;)I

    move-result p1

    return p1
.end method
