.class public Lcom/huawei/datatype/FitnessUserInfo;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private height:I

.field private time:J

.field private weight:I


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    const/16 v0, 0xaa

    iput v0, p0, Lcom/huawei/datatype/FitnessUserInfo;->height:I

    .line 13
    const/16 v0, 0x3c

    iput v0, p0, Lcom/huawei/datatype/FitnessUserInfo;->weight:I

    .line 14
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/datatype/FitnessUserInfo;->time:J

    return-void
.end method


# virtual methods
.method public getHeight()I
    .locals 1

    .line 17
    iget v0, p0, Lcom/huawei/datatype/FitnessUserInfo;->height:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getTime()J
    .locals 2

    .line 33
    iget-wide v0, p0, Lcom/huawei/datatype/FitnessUserInfo;->time:J

    return-wide v0
.end method

.method public getWeight()I
    .locals 1

    .line 25
    iget v0, p0, Lcom/huawei/datatype/FitnessUserInfo;->weight:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public setHeight(I)V
    .locals 0

    .line 21
    iput p1, p0, Lcom/huawei/datatype/FitnessUserInfo;->height:I

    .line 22
    return-void
.end method

.method public setTime(J)V
    .locals 0

    .line 37
    iput-wide p1, p0, Lcom/huawei/datatype/FitnessUserInfo;->time:J

    .line 38
    return-void
.end method

.method public setWeight(I)V
    .locals 0

    .line 29
    iput p1, p0, Lcom/huawei/datatype/FitnessUserInfo;->weight:I

    .line 30
    return-void
.end method
