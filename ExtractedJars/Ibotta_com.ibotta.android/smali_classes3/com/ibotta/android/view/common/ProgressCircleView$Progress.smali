.class public Lcom/ibotta/android/view/common/ProgressCircleView$Progress;
.super Ljava/lang/Object;
.source "ProgressCircleView.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/view/common/ProgressCircleView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Progress"
.end annotation


# instance fields
.field private completed:Z

.field private id:I

.field private percentComplete:F

.field private progressColor:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 226
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getId()I
    .locals 1

    .line 233
    iget v0, p0, Lcom/ibotta/android/view/common/ProgressCircleView$Progress;->id:I

    return v0
.end method

.method public getPercentComplete()F
    .locals 1

    .line 241
    iget v0, p0, Lcom/ibotta/android/view/common/ProgressCircleView$Progress;->percentComplete:F

    return v0
.end method

.method public getProgressColor()Ljava/lang/String;
    .locals 1

    .line 257
    iget-object v0, p0, Lcom/ibotta/android/view/common/ProgressCircleView$Progress;->progressColor:Ljava/lang/String;

    return-object v0
.end method

.method public isCompleted()Z
    .locals 1

    .line 249
    iget-boolean v0, p0, Lcom/ibotta/android/view/common/ProgressCircleView$Progress;->completed:Z

    return v0
.end method

.method public setCompleted(Z)V
    .locals 0

    .line 253
    iput-boolean p1, p0, Lcom/ibotta/android/view/common/ProgressCircleView$Progress;->completed:Z

    return-void
.end method

.method public setId(I)V
    .locals 0

    .line 237
    iput p1, p0, Lcom/ibotta/android/view/common/ProgressCircleView$Progress;->id:I

    return-void
.end method

.method public setPercentComplete(F)V
    .locals 0

    .line 245
    iput p1, p0, Lcom/ibotta/android/view/common/ProgressCircleView$Progress;->percentComplete:F

    return-void
.end method

.method public setProgressColor(Ljava/lang/String;)V
    .locals 0

    .line 261
    iput-object p1, p0, Lcom/ibotta/android/view/common/ProgressCircleView$Progress;->progressColor:Ljava/lang/String;

    return-void
.end method
