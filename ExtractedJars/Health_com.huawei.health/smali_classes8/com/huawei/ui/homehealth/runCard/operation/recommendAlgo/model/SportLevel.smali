.class public Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private mLevel:I

.field private mReason:I

.field private mValue:D


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;->mLevel:I

    .line 18
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;->mReason:I

    .line 19
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;->mValue:D

    .line 22
    return-void
.end method

.method public constructor <init>(II)V
    .locals 2

    .line 25
    const-wide/16 v0, 0x0

    invoke-direct {p0, p1, p2, v0, v1}, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;-><init>(IID)V

    .line 26
    return-void
.end method

.method public constructor <init>(IID)V
    .locals 2

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;->mLevel:I

    .line 18
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;->mReason:I

    .line 19
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;->mValue:D

    .line 29
    iput p1, p0, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;->mLevel:I

    .line 30
    iput p2, p0, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;->mReason:I

    .line 31
    iput-wide p3, p0, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;->mValue:D

    .line 32
    return-void
.end method


# virtual methods
.method public acquireLevel()I
    .locals 1

    .line 35
    iget v0, p0, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;->mLevel:I

    return v0
.end method

.method public acquireReason()I
    .locals 1

    .line 43
    iget v0, p0, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;->mReason:I

    return v0
.end method

.method public acquireValue()D
    .locals 2

    .line 51
    iget-wide v0, p0, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;->mValue:D

    return-wide v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 5

    .line 60
    if-eqz p1, :cond_0

    instance-of v0, p1, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;

    if-nez v0, :cond_1

    .line 61
    :cond_0
    const/4 v0, 0x0

    return v0

    .line 63
    :cond_1
    move-object v4, p1

    check-cast v4, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;

    .line 64
    iget v0, p0, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;->mLevel:I

    invoke-virtual {v4}, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;->acquireLevel()I

    move-result v1

    if-ne v0, v1, :cond_2

    iget-wide v0, p0, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;->mValue:D

    .line 65
    invoke-virtual {v4}, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;->acquireValue()D

    move-result-wide v2

    cmpl-double v0, v0, v2

    if-nez v0, :cond_2

    iget v0, p0, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;->mReason:I

    .line 66
    invoke-virtual {v4}, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;->acquireReason()I

    move-result v1

    if-ne v0, v1, :cond_2

    .line 67
    const/4 v0, 0x1

    return v0

    .line 69
    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method public hashCode()I
    .locals 6

    .line 78
    iget v3, p0, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;->mLevel:I

    .line 79
    mul-int/lit8 v0, v3, 0x1f

    iget v1, p0, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;->mReason:I

    add-int v3, v0, v1

    .line 80
    iget-wide v0, p0, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;->mValue:D

    invoke-static {v0, v1}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v4

    .line 81
    mul-int/lit8 v0, v3, 0x1f

    const/16 v1, 0x20

    ushr-long v1, v4, v1

    xor-long/2addr v1, v4

    long-to-int v1, v1

    add-int v3, v0, v1

    .line 82
    return v3
.end method

.method public saveLevel(I)V
    .locals 0

    .line 39
    iput p1, p0, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;->mLevel:I

    .line 40
    return-void
.end method

.method public saveReason(I)V
    .locals 0

    .line 47
    iput p1, p0, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;->mReason:I

    .line 48
    return-void
.end method

.method public saveValue(D)V
    .locals 0

    .line 55
    iput-wide p1, p0, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;->mValue:D

    .line 56
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .line 87
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 88
    const-string v0, "level:"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;->mLevel:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " reason:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;->mReason:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " value:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;->mValue:D

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 89
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
