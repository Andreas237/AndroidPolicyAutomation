.class public Lcom/huawei/hwcommonmodel/fitnessdatatype/ActivityReminder;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private cycle:I

.field private enable:Z

.field private endTime:I

.field private interval:I

.field private startTime:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 62
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 63
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/ActivityReminder;->enable:Z

    .line 64
    const/16 v0, 0x800

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/ActivityReminder;->startTime:I

    .line 65
    const/16 v0, 0x1400

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/ActivityReminder;->endTime:I

    .line 66
    const/16 v0, 0x3c

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/ActivityReminder;->interval:I

    .line 67
    const/16 v0, 0x7f

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/ActivityReminder;->cycle:I

    .line 68
    return-void
.end method


# virtual methods
.method public getCycle()I
    .locals 1

    .line 131
    iget v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/ActivityReminder;->cycle:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getEndTime()I
    .locals 1

    .line 116
    iget v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/ActivityReminder;->endTime:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getInterval()I
    .locals 1

    .line 88
    iget v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/ActivityReminder;->interval:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getStartTime()I
    .locals 1

    .line 102
    iget v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/ActivityReminder;->startTime:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public initActivityReminder1()V
    .locals 0

    .line 153
    return-void
.end method

.method public initActivityReminder2()V
    .locals 0

    .line 154
    return-void
.end method

.method public initActivityReminder3()V
    .locals 0

    .line 155
    return-void
.end method

.method public initActivityReminder4()V
    .locals 0

    .line 156
    return-void
.end method

.method public initActivityReminder5()V
    .locals 0

    .line 157
    return-void
.end method

.method public initActivityReminder6()V
    .locals 0

    .line 158
    return-void
.end method

.method public initActivityReminder7()V
    .locals 0

    .line 159
    return-void
.end method

.method public isEnabled()Z
    .locals 1

    .line 74
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/ActivityReminder;->enable:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public setCycle(I)V
    .locals 1

    .line 138
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/ActivityReminder;->cycle:I

    .line 139
    return-void
.end method

.method public setEnabled(Z)V
    .locals 1

    .line 81
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/ActivityReminder;->enable:Z

    .line 82
    return-void
.end method

.method public setEndTime(I)V
    .locals 1

    .line 123
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/ActivityReminder;->endTime:I

    .line 124
    return-void
.end method

.method public setInterval(I)V
    .locals 1

    .line 95
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/ActivityReminder;->interval:I

    .line 96
    return-void
.end method

.method public setStartTime(I)V
    .locals 1

    .line 109
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/ActivityReminder;->startTime:I

    .line 110
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 143
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ActivityReminder{enable="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-boolean v1, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/ActivityReminder;->enable:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", interval="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/ActivityReminder;->interval:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", startTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/ActivityReminder;->startTime:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", endTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/ActivityReminder;->endTime:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", cycle="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/ActivityReminder;->cycle:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
