.class public Lcom/ibotta/android/collection/FeatureComparator;
.super Ljava/lang/Object;
.source "FeatureComparator.java"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator<",
        "Lcom/ibotta/api/model/feature/Feature;",
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

    .line 15
    new-instance v0, Ljava/util/Random;

    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/collection/FeatureComparator;->r:Ljava/util/Random;

    return-void
.end method


# virtual methods
.method public compare(Lcom/ibotta/api/model/feature/Feature;Lcom/ibotta/api/model/feature/Feature;)I
    .locals 2

    const/4 v0, 0x0

    .line 18
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    .line 19
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    .line 21
    :try_start_0
    invoke-virtual {p1}, Lcom/ibotta/api/model/feature/Feature;->getSortOrder()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/Float;->valueOf(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v1

    .line 22
    invoke-virtual {p2}, Lcom/ibotta/api/model/feature/Feature;->getSortOrder()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/Float;->valueOf(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 25
    invoke-virtual {p1}, Ljava/lang/NumberFormatException;->printStackTrace()V

    .line 28
    :goto_0
    invoke-virtual {v1, v0}, Ljava/lang/Float;->compareTo(Ljava/lang/Float;)I

    move-result p1

    const/4 p2, -0x1

    mul-int/lit8 p1, p1, -0x1

    if-nez p1, :cond_1

    .line 32
    iget-object p1, p0, Lcom/ibotta/android/collection/FeatureComparator;->r:Ljava/util/Random;

    invoke-virtual {p1}, Ljava/util/Random;->nextBoolean()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, -0x1

    goto :goto_1

    :cond_0
    const/4 p2, 0x1

    const/4 p1, 0x1

    :cond_1
    :goto_1
    return p1
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    .line 14
    check-cast p1, Lcom/ibotta/api/model/feature/Feature;

    check-cast p2, Lcom/ibotta/api/model/feature/Feature;

    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/collection/FeatureComparator;->compare(Lcom/ibotta/api/model/feature/Feature;Lcom/ibotta/api/model/feature/Feature;)I

    move-result p1

    return p1
.end method
