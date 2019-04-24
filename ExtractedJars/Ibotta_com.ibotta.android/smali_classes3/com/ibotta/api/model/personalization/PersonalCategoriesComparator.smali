.class public Lcom/ibotta/api/model/personalization/PersonalCategoriesComparator;
.super Ljava/lang/Object;
.source "PersonalCategoriesComparator.java"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator<",
        "Lcom/ibotta/api/model/personalization/PersonalizationCategory;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public compare(Lcom/ibotta/api/model/personalization/PersonalizationCategory;Lcom/ibotta/api/model/personalization/PersonalizationCategory;)I
    .locals 0

    .line 14
    invoke-virtual {p1}, Lcom/ibotta/api/model/personalization/PersonalizationCategory;->getSortOrder()F

    move-result p1

    invoke-virtual {p2}, Lcom/ibotta/api/model/personalization/PersonalizationCategory;->getSortOrder()F

    move-result p2

    invoke-static {p1, p2}, Ljava/lang/Float;->compare(FF)I

    move-result p1

    return p1
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    .line 11
    check-cast p1, Lcom/ibotta/api/model/personalization/PersonalizationCategory;

    check-cast p2, Lcom/ibotta/api/model/personalization/PersonalizationCategory;

    invoke-virtual {p0, p1, p2}, Lcom/ibotta/api/model/personalization/PersonalCategoriesComparator;->compare(Lcom/ibotta/api/model/personalization/PersonalizationCategory;Lcom/ibotta/api/model/personalization/PersonalizationCategory;)I

    move-result p1

    return p1
.end method
