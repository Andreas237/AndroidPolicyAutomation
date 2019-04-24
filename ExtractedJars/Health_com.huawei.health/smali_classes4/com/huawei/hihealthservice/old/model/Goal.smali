.class public Lcom/huawei/hihealthservice/old/model/Goal;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/hihealthservice/old/model/Goal$GoalTYPE;
    }
.end annotation


# instance fields
.field private sport_day_steps_sum:I

.field private weight_month_weight_recommend:F


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getSport_day_steps_sum()I
    .locals 1

    .line 11
    iget v0, p0, Lcom/huawei/hihealthservice/old/model/Goal;->sport_day_steps_sum:I

    return v0
.end method

.method public getWeight_month_weight_recommend()F
    .locals 1

    .line 18
    iget v0, p0, Lcom/huawei/hihealthservice/old/model/Goal;->weight_month_weight_recommend:F

    return v0
.end method

.method public setSport_day_steps_sum(I)V
    .locals 0

    .line 15
    iput p1, p0, Lcom/huawei/hihealthservice/old/model/Goal;->sport_day_steps_sum:I

    .line 16
    return-void
.end method

.method public setWeight_month_weight_recommend(F)V
    .locals 0

    .line 21
    iput p1, p0, Lcom/huawei/hihealthservice/old/model/Goal;->weight_month_weight_recommend:F

    .line 22
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 25
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Goal{sport_day_steps_sum="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hihealthservice/old/model/Goal;->sport_day_steps_sum:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", weight_month_weight_recommend="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hihealthservice/old/model/Goal;->weight_month_weight_recommend:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
