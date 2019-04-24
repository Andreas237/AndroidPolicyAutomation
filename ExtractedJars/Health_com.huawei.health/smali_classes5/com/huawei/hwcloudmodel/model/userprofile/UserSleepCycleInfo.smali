.class public Lcom/huawei/hwcloudmodel/model/userprofile/UserSleepCycleInfo;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field private static final serialVersionUID:J = -0x2c34d976afdbc44cL


# instance fields
.field private cycleEnd:Ljava/lang/Integer;

.field private cycleStart:Ljava/lang/Integer;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getCycleEnd()Ljava/lang/Integer;
    .locals 1

    .line 25
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/userprofile/UserSleepCycleInfo;->cycleEnd:Ljava/lang/Integer;

    return-object v0
.end method

.method public getCycleStart()Ljava/lang/Integer;
    .locals 1

    .line 17
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/userprofile/UserSleepCycleInfo;->cycleStart:Ljava/lang/Integer;

    return-object v0
.end method

.method public setCycleEnd(Ljava/lang/Integer;)V
    .locals 0

    .line 29
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/userprofile/UserSleepCycleInfo;->cycleEnd:Ljava/lang/Integer;

    .line 30
    return-void
.end method

.method public setCycleStart(Ljava/lang/Integer;)V
    .locals 0

    .line 21
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/userprofile/UserSleepCycleInfo;->cycleStart:Ljava/lang/Integer;

    .line 22
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 34
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "UserSleepCycleInfo{cycleStart="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/userprofile/UserSleepCycleInfo;->cycleStart:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", cycleEnd="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/userprofile/UserSleepCycleInfo;->cycleEnd:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
