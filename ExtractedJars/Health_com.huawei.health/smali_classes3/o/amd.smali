.class public Lo/amd;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field private a:I

.field private b:I

.field private c:I

.field private d:I

.field private e:J


# direct methods
.method public constructor <init>(IJIII)V
    .locals 0

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    iput p1, p0, Lo/amd;->b:I

    .line 31
    iput-wide p2, p0, Lo/amd;->e:J

    .line 32
    iput p4, p0, Lo/amd;->d:I

    .line 33
    iput p5, p0, Lo/amd;->a:I

    .line 34
    iput p6, p0, Lo/amd;->c:I

    .line 35
    return-void
.end method

.method private d(Ljava/lang/String;IDLjava/util/List;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;IDLjava/util/List<Lcom/huawei/hihealth/HiHealthData;>;)V"
        }
    .end annotation

    .line 206
    iget-wide v0, p0, Lo/amd;->e:J

    const-wide/32 v2, 0xea60

    mul-long v4, v0, v2

    .line 207
    invoke-static {p2, p3, p4}, Lo/cno;->e(ID)Z

    move-result v0

    if-nez v0, :cond_0

    .line 208
    const-string v0, "Step_OneMinuteStepData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkLocalDataValue false"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 209
    return-void

    .line 212
    :cond_0
    new-instance v6, Lcom/huawei/hihealth/HiHealthData;

    invoke-direct {v6, p2}, Lcom/huawei/hihealth/HiHealthData;-><init>(I)V

    .line 213
    const-wide/32 v0, 0xea60

    add-long/2addr v0, v4

    invoke-virtual {v6, v4, v5, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setTimeInterval(JJ)V

    .line 214
    invoke-virtual {v6, p3, p4}, Lcom/huawei/hihealth/HiHealthData;->setValue(D)V

    .line 215
    invoke-virtual {v6, p1}, Lcom/huawei/hihealth/HiHealthData;->setDeviceUUID(Ljava/lang/String;)V

    .line 216
    invoke-interface {p5, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 217
    return-void
.end method

.method private d(J)Z
    .locals 5

    .line 47
    invoke-static {p1, p2}, Lo/amz;->c(J)J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/amz;->b(J)J

    move-result-wide v0

    long-to-int v4, v0

    .line 48
    iget-wide v0, p0, Lo/amd;->e:J

    int-to-long v2, v4

    cmp-long v0, v0, v2

    if-ltz v0, :cond_0

    iget-wide v0, p0, Lo/amd;->e:J

    add-int/lit16 v2, v4, 0x5a0

    int-to-long v2, v2

    cmp-long v0, v0, v2

    if-gez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method


# virtual methods
.method public a()I
    .locals 1

    .line 85
    iget v0, p0, Lo/amd;->d:I

    return v0
.end method

.method public b(Lo/ana;)D
    .locals 4

    .line 158
    invoke-virtual {p0, p1}, Lo/amd;->c(Lo/ana;)I

    move-result v0

    int-to-double v0, v0

    const-wide v2, 0x408f400000000000L    # 1000.0

    div-double/2addr v0, v2

    return-wide v0
.end method

.method public b()J
    .locals 2

    .line 56
    iget-wide v0, p0, Lo/amd;->e:J

    return-wide v0
.end method

.method public b(I)V
    .locals 0

    .line 81
    iput p1, p0, Lo/amd;->c:I

    .line 82
    return-void
.end method

.method public b(II)V
    .locals 1

    .line 76
    iget v0, p0, Lo/amd;->d:I

    add-int/2addr v0, p1

    iput v0, p0, Lo/amd;->d:I

    .line 77
    iget v0, p0, Lo/amd;->a:I

    add-int/2addr v0, p2

    iput v0, p0, Lo/amd;->a:I

    .line 78
    return-void
.end method

.method public b(Ljava/lang/String;Ljava/util/List;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;)V"
        }
    .end annotation

    .line 113
    const/4 v6, 0x2

    .line 114
    move-object v0, p0

    move-object v1, p1

    move v2, v6

    iget v3, p0, Lo/amd;->d:I

    int-to-double v3, v3

    move-object v5, p2

    const/4 v2, 0x2

    invoke-direct/range {v0 .. v5}, Lo/amd;->d(Ljava/lang/String;IDLjava/util/List;)V

    .line 115
    return-void
.end method

.method public b(Ljava/lang/String;Lo/ana;Ljava/util/List;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Lo/ana;Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;)V"
        }
    .end annotation

    .line 118
    const/4 v6, 0x4

    .line 119
    invoke-virtual {p0, p2}, Lo/amd;->d(Lo/ana;)D

    move-result-wide v7

    .line 120
    move-object v0, p0

    move-object v1, p1

    move v2, v6

    move-wide v3, v7

    move-object v5, p3

    const/4 v2, 0x4

    invoke-direct/range {v0 .. v5}, Lo/amd;->d(Ljava/lang/String;IDLjava/util/List;)V

    .line 121
    return-void
.end method

.method public c()I
    .locals 1

    .line 72
    iget v0, p0, Lo/amd;->b:I

    return v0
.end method

.method public c(Lo/ana;)I
    .locals 4

    .line 191
    iget v0, p0, Lo/amd;->d:I

    invoke-virtual {p1}, Lo/ana;->e()F

    move-result v1

    invoke-static {v0, v1}, Lo/cbf;->d(IF)D

    move-result-wide v0

    const-wide v2, 0x408f400000000000L    # 1000.0

    mul-double/2addr v0, v2

    double-to-int v0, v0

    return v0
.end method

.method public c(Ljava/lang/String;Lo/ana;Ljava/util/List;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Lo/ana;Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;)V"
        }
    .end annotation

    .line 152
    const/4 v6, 0x3

    .line 153
    move-object v0, p0

    move-object v1, p1

    move v2, v6

    .line 154
    invoke-virtual {p0, p2}, Lo/amd;->c(Lo/ana;)I

    move-result v3

    int-to-double v3, v3

    move-object v5, p3

    .line 153
    const/4 v2, 0x3

    invoke-direct/range {v0 .. v5}, Lo/amd;->d(Ljava/lang/String;IDLjava/util/List;)V

    .line 155
    return-void
.end method

.method public d(Lo/ana;)D
    .locals 7

    .line 124
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 125
    invoke-static {}, Lo/ana;->c()Lo/ana;

    move-result-object p1

    .line 127
    :cond_0
    const-wide/16 v4, 0x0

    .line 130
    :try_start_0
    iget v0, p0, Lo/amd;->c:I

    const/16 v1, 0x4e25

    if-ne v0, v1, :cond_1

    .line 132
    invoke-virtual {p1}, Lo/ana;->b()F

    move-result v0

    const v1, 0x3c888889

    invoke-static {v1, v0}, Lo/dgp;->a(FF)D

    move-result-wide v0

    const-wide v2, 0x408f400000000000L    # 1000.0

    mul-double/2addr v0, v2

    move-wide v4, v0

    goto :goto_0

    .line 134
    :cond_1
    iget v0, p0, Lo/amd;->c:I

    const/16 v1, 0x4e24

    if-ne v0, v1, :cond_2

    .line 135
    iget v0, p0, Lo/amd;->a:I

    div-int/lit8 v0, v0, 0xa

    invoke-virtual {p1}, Lo/ana;->b()F

    move-result v1

    invoke-static {v0, v1}, Lo/dgp;->c(IF)D

    move-result-wide v0

    const-wide v2, 0x408f400000000000L    # 1000.0

    mul-double/2addr v0, v2

    move-wide v4, v0

    goto :goto_0

    .line 137
    :cond_2
    iget v0, p0, Lo/amd;->c:I

    const/16 v1, 0x4e23

    if-ne v0, v1, :cond_3

    .line 139
    invoke-virtual {p0, p1}, Lo/amd;->b(Lo/ana;)D

    move-result-wide v0

    invoke-virtual {p1}, Lo/ana;->b()F

    move-result v2

    invoke-static {v0, v1, v2}, Lo/dgp;->e(DF)D

    move-result-wide v0

    const-wide v2, 0x408f400000000000L    # 1000.0

    mul-double/2addr v0, v2

    move-wide v4, v0

    goto :goto_0

    .line 143
    :cond_3
    invoke-virtual {p0, p1}, Lo/amd;->b(Lo/ana;)D

    move-result-wide v0

    invoke-virtual {p1}, Lo/ana;->b()F

    move-result v2

    invoke-static {v0, v1, v2}, Lo/dgp;->b(DF)D
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-wide v0

    const-wide v2, 0x408f400000000000L    # 1000.0

    mul-double/2addr v0, v2

    move-wide v4, v0

    .line 147
    :goto_0
    goto :goto_1

    .line 145
    :catch_0
    move-exception v6

    .line 146
    const-string v0, "Step_OneMinuteStepData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v6}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 148
    :goto_1
    return-wide v4
.end method

.method public d(Ljava/lang/String;Ljava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;)V"
        }
    .end annotation

    .line 202
    move-object v0, p0

    move-object v1, p1

    iget v2, p0, Lo/amd;->c:I

    iget v3, p0, Lo/amd;->c:I

    int-to-double v3, v3

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lo/amd;->d(Ljava/lang/String;IDLjava/util/List;)V

    .line 203
    return-void
.end method

.method public d()Z
    .locals 2

    .line 90
    iget v0, p0, Lo/amd;->a:I

    if-lez v0, :cond_0

    .line 91
    const/16 v0, 0x4e24

    iput v0, p0, Lo/amd;->c:I

    .line 92
    const/4 v0, 0x1

    return v0

    .line 94
    :cond_0
    iget v0, p0, Lo/amd;->d:I

    if-gtz v0, :cond_1

    iget v0, p0, Lo/amd;->c:I

    const/16 v1, 0x4e25

    if-ne v0, v1, :cond_2

    .line 95
    :cond_1
    const/4 v0, 0x1

    return v0

    .line 97
    :cond_2
    iget v0, p0, Lo/amd;->c:I

    const/16 v1, 0x4e23

    if-eq v0, v1, :cond_3

    iget v0, p0, Lo/amd;->c:I

    const/16 v1, 0x4e22

    if-ne v0, v1, :cond_4

    .line 99
    :cond_3
    const/4 v0, 0x0

    return v0

    .line 102
    :cond_4
    const/4 v0, 0x1

    return v0
.end method

.method public e(IJIII)V
    .locals 0

    .line 38
    iput p1, p0, Lo/amd;->b:I

    .line 39
    iput-wide p2, p0, Lo/amd;->e:J

    .line 40
    iput p4, p0, Lo/amd;->d:I

    .line 41
    iput p5, p0, Lo/amd;->a:I

    .line 42
    iput p6, p0, Lo/amd;->c:I

    .line 43
    return-void
.end method

.method public e(Ljava/lang/String;Ljava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;)V"
        }
    .end annotation

    .line 195
    iget v0, p0, Lo/amd;->a:I

    if-lez v0, :cond_0

    .line 196
    move-object v0, p0

    move-object v1, p1

    iget v2, p0, Lo/amd;->a:I

    int-to-double v3, v2

    move-object v5, p2

    const/4 v2, 0x5

    invoke-direct/range {v0 .. v5}, Lo/amd;->d(Ljava/lang/String;IDLjava/util/List;)V

    .line 199
    :cond_0
    return-void
.end method

.method public e()Z
    .locals 2

    .line 52
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-direct {p0, v0, v1}, Lo/amd;->d(J)Z

    move-result v0

    return v0
.end method

.method public e(Lo/amd;)Z
    .locals 2

    .line 106
    iget v0, p0, Lo/amd;->d:I

    iget v1, p1, Lo/amd;->d:I

    if-le v0, v1, :cond_0

    .line 107
    const/4 v0, 0x1

    return v0

    .line 109
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public h()I
    .locals 1

    .line 224
    iget v0, p0, Lo/amd;->c:I

    return v0
.end method

.method public i()I
    .locals 1

    .line 220
    iget v0, p0, Lo/amd;->a:I

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .line 61
    new-instance v3, Ljava/lang/StringBuffer;

    invoke-direct {v3}, Ljava/lang/StringBuffer;-><init>()V

    .line 62
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-wide v1, p0, Lo/amd;->e:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ","

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 63
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget v1, p0, Lo/amd;->b:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ","

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 64
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget v1, p0, Lo/amd;->d:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ","

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 65
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget v1, p0, Lo/amd;->a:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ","

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 66
    iget v0, p0, Lo/amd;->c:I

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    .line 68
    invoke-virtual {v3}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
