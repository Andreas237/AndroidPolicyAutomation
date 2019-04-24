.class public Lcom/ibotta/android/fragment/personalization/PersonalRetailerFinderImpl$SortDataComparator;
.super Ljava/lang/Object;
.source "PersonalRetailerFinderImpl.java"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/fragment/personalization/PersonalRetailerFinderImpl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xc
    name = "SortDataComparator"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator<",
        "Lcom/ibotta/api/model/RetailerModel;",
        ">;"
    }
.end annotation


# direct methods
.method protected constructor <init>()V
    .locals 0

    .line 263
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public compare(Lcom/ibotta/api/model/RetailerModel;Lcom/ibotta/api/model/RetailerModel;)I
    .locals 0

    .line 266
    invoke-interface {p1}, Lcom/ibotta/api/model/RetailerModel;->getSortData()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2}, Lcom/ibotta/api/model/RetailerModel;->getSortData()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result p1

    return p1
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    .line 263
    check-cast p1, Lcom/ibotta/api/model/RetailerModel;

    check-cast p2, Lcom/ibotta/api/model/RetailerModel;

    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/fragment/personalization/PersonalRetailerFinderImpl$SortDataComparator;->compare(Lcom/ibotta/api/model/RetailerModel;Lcom/ibotta/api/model/RetailerModel;)I

    move-result p1

    return p1
.end method
