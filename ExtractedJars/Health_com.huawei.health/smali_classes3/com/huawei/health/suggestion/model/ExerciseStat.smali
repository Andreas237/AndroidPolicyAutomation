.class public Lcom/huawei/health/suggestion/model/ExerciseStat;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private calorie:F

.field private days:I

.field private planCount:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    return-void
.end method

.method public constructor <init>(IFI)V
    .locals 0

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    iput p1, p0, Lcom/huawei/health/suggestion/model/ExerciseStat;->planCount:I

    .line 22
    iput p2, p0, Lcom/huawei/health/suggestion/model/ExerciseStat;->calorie:F

    .line 23
    iput p3, p0, Lcom/huawei/health/suggestion/model/ExerciseStat;->days:I

    .line 24
    return-void
.end method


# virtual methods
.method public popCalorie()F
    .locals 1

    .line 27
    iget v0, p0, Lcom/huawei/health/suggestion/model/ExerciseStat;->calorie:F

    return v0
.end method

.method public popDays()I
    .locals 1

    .line 35
    iget v0, p0, Lcom/huawei/health/suggestion/model/ExerciseStat;->days:I

    return v0
.end method

.method public popPlanCount()I
    .locals 1

    .line 43
    iget v0, p0, Lcom/huawei/health/suggestion/model/ExerciseStat;->planCount:I

    return v0
.end method

.method public putCalorie(F)V
    .locals 0

    .line 31
    iput p1, p0, Lcom/huawei/health/suggestion/model/ExerciseStat;->calorie:F

    .line 32
    return-void
.end method

.method public putDays(I)V
    .locals 0

    .line 39
    iput p1, p0, Lcom/huawei/health/suggestion/model/ExerciseStat;->days:I

    .line 40
    return-void
.end method

.method public putPlanCount(I)V
    .locals 0

    .line 47
    iput p1, p0, Lcom/huawei/health/suggestion/model/ExerciseStat;->planCount:I

    .line 48
    return-void
.end method
