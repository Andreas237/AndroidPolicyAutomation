.class public Lcom/huawei/hwcloudmodel/model/userprofile/UserGoalsInfo;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field private static final serialVersionUID:J = -0x2c34d976afdbc44cL


# instance fields
.field private goalPeriod:Ljava/lang/Integer;

.field private goalType:Ljava/lang/Integer;

.field private goalValue:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getGoalPeriod()Ljava/lang/Integer;
    .locals 1

    .line 26
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/userprofile/UserGoalsInfo;->goalPeriod:Ljava/lang/Integer;

    return-object v0
.end method

.method public getGoalType()Ljava/lang/Integer;
    .locals 1

    .line 18
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/userprofile/UserGoalsInfo;->goalType:Ljava/lang/Integer;

    return-object v0
.end method

.method public getGoalValue()Ljava/lang/String;
    .locals 1

    .line 34
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/userprofile/UserGoalsInfo;->goalValue:Ljava/lang/String;

    return-object v0
.end method

.method public setGoalPeriod(Ljava/lang/Integer;)V
    .locals 0

    .line 30
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/userprofile/UserGoalsInfo;->goalPeriod:Ljava/lang/Integer;

    .line 31
    return-void
.end method

.method public setGoalType(Ljava/lang/Integer;)V
    .locals 0

    .line 22
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/userprofile/UserGoalsInfo;->goalType:Ljava/lang/Integer;

    .line 23
    return-void
.end method

.method public setGoalValue(Ljava/lang/String;)V
    .locals 0

    .line 38
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/userprofile/UserGoalsInfo;->goalValue:Ljava/lang/String;

    .line 39
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 43
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "UserGoalsInfo{goalType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/userprofile/UserGoalsInfo;->goalType:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", goalPeriod="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/userprofile/UserGoalsInfo;->goalPeriod:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
