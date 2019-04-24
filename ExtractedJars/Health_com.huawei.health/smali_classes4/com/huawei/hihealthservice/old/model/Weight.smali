.class public Lcom/huawei/hihealthservice/old/model/Weight;
.super Lcom/huawei/hihealthservice/old/model/HealthData;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/hihealthservice/old/model/Weight$Level;
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = -0x2b9a4d2f304639a3L


# instance fields
.field private commandWeight:F

.field private fat:F

.field private state:S

.field private weight:F


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 21
    invoke-direct {p0}, Lcom/huawei/hihealthservice/old/model/HealthData;-><init>()V

    return-void
.end method

.method public static getBMI(FF)F
    .locals 4

    .line 150
    const/4 v0, 0x1

    sub-float v0, p0, v0

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    float-to-double v0, v0

    const-wide v2, 0x3eb0c6f7a0b5ed8dL    # 1.0E-6

    cmpg-double v0, v0, v2

    if-ltz v0, :cond_0

    const/4 v0, 0x1

    sub-float v0, p1, v0

    .line 151
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    float-to-double v0, v0

    const-wide v2, 0x3eb0c6f7a0b5ed8dL    # 1.0E-6

    cmpg-double v0, v0, v2

    if-gez v0, :cond_1

    .line 152
    :cond_0
    const/4 v0, 0x1

    return v0

    .line 154
    :cond_1
    div-float v0, p1, p0

    div-float/2addr v0, p0

    return v0
.end method

.method public static getWeight(FF)F
    .locals 4

    .line 164
    const/4 v0, 0x1

    sub-float v0, p1, v0

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    float-to-double v0, v0

    const-wide v2, 0x3eb0c6f7a0b5ed8dL    # 1.0E-6

    cmpg-double v0, v0, v2

    if-ltz v0, :cond_0

    const/4 v0, 0x1

    sub-float v0, p0, v0

    .line 165
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    float-to-double v0, v0

    const-wide v2, 0x3eb0c6f7a0b5ed8dL    # 1.0E-6

    cmpg-double v0, v0, v2

    if-gez v0, :cond_1

    .line 166
    :cond_0
    const/4 v0, 0x1

    return v0

    .line 168
    :cond_1
    mul-float v0, p0, p1

    mul-float/2addr v0, p1

    return v0
.end method


# virtual methods
.method public getCommandWeight()F
    .locals 1

    .line 112
    iget v0, p0, Lcom/huawei/hihealthservice/old/model/Weight;->commandWeight:F

    return v0
.end method

.method public getFat()F
    .locals 1

    .line 101
    iget v0, p0, Lcom/huawei/hihealthservice/old/model/Weight;->fat:F

    return v0
.end method

.method public getState()S
    .locals 1

    .line 93
    iget-short v0, p0, Lcom/huawei/hihealthservice/old/model/Weight;->state:S

    return v0
.end method

.method public getWeight()F
    .locals 1

    .line 82
    iget v0, p0, Lcom/huawei/hihealthservice/old/model/Weight;->weight:F

    return v0
.end method

.method public initFunctionA()V
    .locals 0

    .line 176
    return-void
.end method

.method public initFunctionB()V
    .locals 0

    .line 180
    return-void
.end method

.method public initFunctionC()V
    .locals 0

    .line 184
    return-void
.end method

.method public setCommandWeight(F)V
    .locals 0

    .line 119
    iput p1, p0, Lcom/huawei/hihealthservice/old/model/Weight;->commandWeight:F

    .line 120
    return-void
.end method

.method public setFat(F)V
    .locals 0

    .line 105
    iput p1, p0, Lcom/huawei/hihealthservice/old/model/Weight;->fat:F

    .line 106
    return-void
.end method

.method public setState(S)V
    .locals 0

    .line 97
    iput-short p1, p0, Lcom/huawei/hihealthservice/old/model/Weight;->state:S

    .line 98
    return-void
.end method

.method public setWeight(F)V
    .locals 0

    .line 89
    iput p1, p0, Lcom/huawei/hihealthservice/old/model/Weight;->weight:F

    .line 90
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 124
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 125
    const-string v0, "Weight [state="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 126
    iget-short v0, p0, Lcom/huawei/hihealthservice/old/model/Weight;->state:S

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 127
    const-string v0, ", weight="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 128
    iget v0, p0, Lcom/huawei/hihealthservice/old/model/Weight;->weight:F

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 129
    const-string v0, ", fat="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 130
    iget v0, p0, Lcom/huawei/hihealthservice/old/model/Weight;->fat:F

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 131
    const-string v0, ", commandWeight="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 132
    iget v0, p0, Lcom/huawei/hihealthservice/old/model/Weight;->commandWeight:F

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 133
    const-string v0, ", toString()="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 134
    invoke-super {p0}, Lcom/huawei/hihealthservice/old/model/HealthData;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 135
    const-string v0, "]"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 136
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
