.class public Lcom/huawei/hwsmartinteractmgr/data/ContentVideo;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field fitWorkout:Lcom/huawei/pluginFitnessAdvice/FitWorkout;


# direct methods
.method public constructor <init>(Lcom/huawei/pluginFitnessAdvice/FitWorkout;)V
    .locals 0

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    iput-object p1, p0, Lcom/huawei/hwsmartinteractmgr/data/ContentVideo;->fitWorkout:Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    .line 15
    return-void
.end method


# virtual methods
.method public getFitWorkout()Lcom/huawei/pluginFitnessAdvice/FitWorkout;
    .locals 1

    .line 19
    iget-object v0, p0, Lcom/huawei/hwsmartinteractmgr/data/ContentVideo;->fitWorkout:Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    return-object v0
.end method

.method public setFitWorkout(Lcom/huawei/pluginFitnessAdvice/FitWorkout;)V
    .locals 0

    .line 23
    iput-object p1, p0, Lcom/huawei/hwsmartinteractmgr/data/ContentVideo;->fitWorkout:Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    .line 24
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 30
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ContentVideo{fitWorkout=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwsmartinteractmgr/data/ContentVideo;->fitWorkout:Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
