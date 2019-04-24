.class public Lcom/huawei/health/suggestion/model/RateInfo;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private fatBurning:I

.field private haveRaise:I

.field private limit:I

.field private maxRate:I

.field private minRate:I

.field private noRaise:I

.field private warmUp:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public acquireFatBurning()I
    .locals 1

    .line 79
    iget v0, p0, Lcom/huawei/health/suggestion/model/RateInfo;->fatBurning:I

    return v0
.end method

.method public acquireHaveRaise()I
    .locals 1

    .line 71
    iget v0, p0, Lcom/huawei/health/suggestion/model/RateInfo;->haveRaise:I

    return v0
.end method

.method public acquireLimit()I
    .locals 1

    .line 55
    iget v0, p0, Lcom/huawei/health/suggestion/model/RateInfo;->limit:I

    return v0
.end method

.method public acquireMaxRate()I
    .locals 1

    .line 47
    iget v0, p0, Lcom/huawei/health/suggestion/model/RateInfo;->maxRate:I

    return v0
.end method

.method public acquireMinRate()I
    .locals 1

    .line 39
    iget v0, p0, Lcom/huawei/health/suggestion/model/RateInfo;->minRate:I

    return v0
.end method

.method public acquireNoRaise()I
    .locals 1

    .line 63
    iget v0, p0, Lcom/huawei/health/suggestion/model/RateInfo;->noRaise:I

    return v0
.end method

.method public acquireWarmUp()I
    .locals 1

    .line 87
    iget v0, p0, Lcom/huawei/health/suggestion/model/RateInfo;->warmUp:I

    return v0
.end method

.method public saveFatBurning(I)V
    .locals 0

    .line 83
    iput p1, p0, Lcom/huawei/health/suggestion/model/RateInfo;->fatBurning:I

    .line 84
    return-void
.end method

.method public saveHaveRaise(I)V
    .locals 0

    .line 75
    iput p1, p0, Lcom/huawei/health/suggestion/model/RateInfo;->haveRaise:I

    .line 76
    return-void
.end method

.method public saveLimit(I)V
    .locals 0

    .line 59
    iput p1, p0, Lcom/huawei/health/suggestion/model/RateInfo;->limit:I

    .line 60
    return-void
.end method

.method public saveMaxRate(I)V
    .locals 0

    .line 51
    iput p1, p0, Lcom/huawei/health/suggestion/model/RateInfo;->maxRate:I

    .line 52
    return-void
.end method

.method public saveMinRate(I)V
    .locals 0

    .line 43
    iput p1, p0, Lcom/huawei/health/suggestion/model/RateInfo;->minRate:I

    .line 44
    return-void
.end method

.method public saveNoRaise(I)V
    .locals 0

    .line 67
    iput p1, p0, Lcom/huawei/health/suggestion/model/RateInfo;->noRaise:I

    .line 68
    return-void
.end method

.method public saveWarmUp(I)V
    .locals 0

    .line 91
    iput p1, p0, Lcom/huawei/health/suggestion/model/RateInfo;->warmUp:I

    .line 92
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 96
    new-instance v2, Ljava/lang/StringBuffer;

    const-string v0, "RateInfo{"

    invoke-direct {v2, v0}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V

    .line 97
    const-string v0, "minRate="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget v1, p0, Lcom/huawei/health/suggestion/model/RateInfo;->minRate:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    .line 98
    const-string v0, ", maxRate="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget v1, p0, Lcom/huawei/health/suggestion/model/RateInfo;->maxRate:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    .line 99
    const-string v0, ", limit="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget v1, p0, Lcom/huawei/health/suggestion/model/RateInfo;->limit:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    .line 100
    const-string v0, ", noRaise="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget v1, p0, Lcom/huawei/health/suggestion/model/RateInfo;->noRaise:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    .line 101
    const-string v0, ", haveRaise="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget v1, p0, Lcom/huawei/health/suggestion/model/RateInfo;->haveRaise:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    .line 102
    const-string v0, ", fatBurning="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget v1, p0, Lcom/huawei/health/suggestion/model/RateInfo;->fatBurning:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    .line 103
    const-string v0, ", warmUp="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget v1, p0, Lcom/huawei/health/suggestion/model/RateInfo;->warmUp:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    .line 104
    const/16 v0, 0x7d

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 105
    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
