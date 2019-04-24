.class public Lcom/ibotta/android/collection/BonusBucketedComparator;
.super Lcom/ibotta/android/collection/BonusWeightComparator;
.source "BonusBucketedComparator.java"


# static fields
.field private static final PROGRESS_BUCKET_COMPLETED:I = 0x3

.field private static final PROGRESS_BUCKET_IN_PROGRESS:I = 0x1

.field private static final PROGRESS_BUCKET_UNLOCKED:I = 0x2


# instance fields
.field private final bonusHelper:Lcom/ibotta/api/helper/bonus/BonusHelper;


# direct methods
.method public constructor <init>(Lcom/ibotta/api/helper/bonus/BonusHelper;)V
    .locals 0

    .line 18
    invoke-direct {p0}, Lcom/ibotta/android/collection/BonusWeightComparator;-><init>()V

    .line 19
    iput-object p1, p0, Lcom/ibotta/android/collection/BonusBucketedComparator;->bonusHelper:Lcom/ibotta/api/helper/bonus/BonusHelper;

    return-void
.end method

.method private getProgressBucket(Lcom/ibotta/api/model/BonusModel;)I
    .locals 1

    if-eqz p1, :cond_2

    .line 72
    invoke-interface {p1}, Lcom/ibotta/api/model/BonusModel;->getStarted()Ljava/util/Date;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 p1, 0x2

    goto :goto_0

    .line 74
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/collection/BonusBucketedComparator;->bonusHelper:Lcom/ibotta/api/helper/bonus/BonusHelper;

    invoke-interface {v0, p1}, Lcom/ibotta/api/helper/bonus/BonusHelper;->isCompleted(Lcom/ibotta/api/model/BonusModel;)Z

    move-result p1

    if-nez p1, :cond_1

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x3

    goto :goto_0

    :cond_2
    const p1, 0x7fffffff

    :goto_0
    return p1
.end method


# virtual methods
.method public compare(Lcom/ibotta/api/model/BonusModel;Lcom/ibotta/api/model/BonusModel;)I
    .locals 7

    .line 24
    invoke-interface {p1}, Lcom/ibotta/api/model/BonusModel;->getStarted()Ljava/util/Date;

    move-result-object v0

    .line 25
    invoke-interface {p2}, Lcom/ibotta/api/model/BonusModel;->getStarted()Ljava/util/Date;

    move-result-object v1

    .line 27
    invoke-direct {p0, p1}, Lcom/ibotta/android/collection/BonusBucketedComparator;->getProgressBucket(Lcom/ibotta/api/model/BonusModel;)I

    move-result v2

    .line 28
    invoke-direct {p0, p2}, Lcom/ibotta/android/collection/BonusBucketedComparator;->getProgressBucket(Lcom/ibotta/api/model/BonusModel;)I

    move-result v3

    .line 30
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/Integer;->compareTo(Ljava/lang/Integer;)I

    move-result v4

    const/4 v5, -0x1

    const/4 v6, 0x1

    if-nez v4, :cond_0

    if-ne v2, v6, :cond_0

    if-ne v3, v6, :cond_0

    .line 34
    invoke-interface {p1}, Lcom/ibotta/api/model/BonusModel;->getPercentComplete()F

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    invoke-interface {p2}, Lcom/ibotta/api/model/BonusModel;->getPercentComplete()F

    move-result v3

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/Float;->compareTo(Ljava/lang/Float;)I

    move-result v2

    mul-int/lit8 v4, v2, -0x1

    :cond_0
    if-nez v4, :cond_3

    const-wide/16 v2, 0x0

    if-nez v0, :cond_1

    .line 39
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0, v2, v3}, Ljava/util/Date;-><init>(J)V

    :cond_1
    if-nez v1, :cond_2

    .line 42
    new-instance v1, Ljava/util/Date;

    invoke-direct {v1, v2, v3}, Ljava/util/Date;-><init>(J)V

    .line 45
    :cond_2
    invoke-virtual {v0, v1}, Ljava/util/Date;->compareTo(Ljava/util/Date;)I

    move-result v0

    mul-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_3
    move v0, v4

    :goto_0
    if-nez v0, :cond_7

    .line 49
    invoke-interface {p1}, Lcom/ibotta/api/model/BonusModel;->getExpiration()Ljava/util/Date;

    move-result-object v0

    .line 50
    invoke-interface {p2}, Lcom/ibotta/api/model/BonusModel;->getExpiration()Ljava/util/Date;

    move-result-object v1

    if-nez v0, :cond_4

    if-nez v1, :cond_4

    const/4 v5, 0x0

    goto :goto_1

    :cond_4
    if-nez v0, :cond_5

    const/4 v5, 0x1

    goto :goto_1

    :cond_5
    if-nez v1, :cond_6

    goto :goto_1

    .line 58
    :cond_6
    invoke-virtual {v0, v1}, Ljava/util/Date;->compareTo(Ljava/util/Date;)I

    move-result v5

    goto :goto_1

    :cond_7
    move v5, v0

    :goto_1
    if-nez v5, :cond_8

    .line 63
    invoke-super {p0, p1, p2}, Lcom/ibotta/android/collection/BonusWeightComparator;->compare(Lcom/ibotta/api/model/BonusModel;Lcom/ibotta/api/model/BonusModel;)I

    move-result v5

    :cond_8
    return v5
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    .line 11
    check-cast p1, Lcom/ibotta/api/model/BonusModel;

    check-cast p2, Lcom/ibotta/api/model/BonusModel;

    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/collection/BonusBucketedComparator;->compare(Lcom/ibotta/api/model/BonusModel;Lcom/ibotta/api/model/BonusModel;)I

    move-result p1

    return p1
.end method
