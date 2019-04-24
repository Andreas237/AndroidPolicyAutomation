.class public Lcom/ibotta/android/verification/Verification;
.super Ljava/lang/Object;
.source "Verification.java"


# instance fields
.field id:I
    .annotation runtime Lcom/j256/ormlite/field/DatabaseField;
        generatedId = true
    .end annotation
.end field

.field offerId:I
    .annotation runtime Lcom/j256/ormlite/field/DatabaseField;
        canBeNull = false
        index = true
    .end annotation
.end field

.field preverified:Z
    .annotation runtime Lcom/j256/ormlite/field/DatabaseField;
    .end annotation
.end field

.field productGroupId:Ljava/lang/Integer;
    .annotation runtime Lcom/j256/ormlite/field/DatabaseField;
        canBeNull = true
        index = true
    .end annotation
.end field

.field saveTime:J
    .annotation runtime Lcom/j256/ormlite/field/DatabaseField;
    .end annotation
.end field

.field scannedData:Ljava/lang/String;
    .annotation runtime Lcom/j256/ormlite/field/DatabaseField;
        canBeNull = true
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static findByProductGroupId(Ljava/util/List;I)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/verification/Verification;",
            ">;I)",
            "Ljava/util/List<",
            "Lcom/ibotta/android/verification/Verification;",
            ">;"
        }
    .end annotation

    .line 81
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    if-nez p0, :cond_0

    return-object v0

    .line 86
    :cond_0
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_1
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/android/verification/Verification;

    .line 87
    invoke-virtual {v1}, Lcom/ibotta/android/verification/Verification;->getProductGroupId()Ljava/lang/Integer;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual {v1}, Lcom/ibotta/android/verification/Verification;->getProductGroupId()Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    if-ne v2, p1, :cond_1

    .line 88
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    return-object v0
.end method


# virtual methods
.method public getId()I
    .locals 1

    .line 28
    iget v0, p0, Lcom/ibotta/android/verification/Verification;->id:I

    return v0
.end method

.method public getOfferId()I
    .locals 1

    .line 36
    iget v0, p0, Lcom/ibotta/android/verification/Verification;->offerId:I

    return v0
.end method

.method public getProductGroupId()Ljava/lang/Integer;
    .locals 1

    .line 44
    iget-object v0, p0, Lcom/ibotta/android/verification/Verification;->productGroupId:Ljava/lang/Integer;

    return-object v0
.end method

.method public getSaveTime()J
    .locals 2

    .line 65
    iget-wide v0, p0, Lcom/ibotta/android/verification/Verification;->saveTime:J

    return-wide v0
.end method

.method public getScannedData()Ljava/lang/String;
    .locals 1

    .line 57
    iget-object v0, p0, Lcom/ibotta/android/verification/Verification;->scannedData:Ljava/lang/String;

    return-object v0
.end method

.method public isPreverified()Z
    .locals 1

    .line 73
    iget-boolean v0, p0, Lcom/ibotta/android/verification/Verification;->preverified:Z

    return v0
.end method

.method public setId(I)V
    .locals 0

    .line 32
    iput p1, p0, Lcom/ibotta/android/verification/Verification;->id:I

    return-void
.end method

.method public setOfferId(I)V
    .locals 0

    .line 40
    iput p1, p0, Lcom/ibotta/android/verification/Verification;->offerId:I

    return-void
.end method

.method public setPreverified(Z)V
    .locals 0

    .line 77
    iput-boolean p1, p0, Lcom/ibotta/android/verification/Verification;->preverified:Z

    return-void
.end method

.method public setProductGroupId(Ljava/lang/Integer;)V
    .locals 1

    if-eqz p1, :cond_0

    .line 48
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    .line 50
    iput-object p1, p0, Lcom/ibotta/android/verification/Verification;->productGroupId:Ljava/lang/Integer;

    goto :goto_0

    .line 52
    :cond_0
    iput-object p1, p0, Lcom/ibotta/android/verification/Verification;->productGroupId:Ljava/lang/Integer;

    :goto_0
    return-void
.end method

.method public setSaveTime(J)V
    .locals 0

    .line 69
    iput-wide p1, p0, Lcom/ibotta/android/verification/Verification;->saveTime:J

    return-void
.end method

.method public setScannedData(Ljava/lang/String;)V
    .locals 0

    .line 61
    iput-object p1, p0, Lcom/ibotta/android/verification/Verification;->scannedData:Ljava/lang/String;

    return-void
.end method
