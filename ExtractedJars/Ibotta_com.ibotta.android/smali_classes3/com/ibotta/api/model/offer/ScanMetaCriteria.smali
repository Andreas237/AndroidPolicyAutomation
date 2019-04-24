.class public interface abstract Lcom/ibotta/api/model/offer/ScanMetaCriteria;
.super Ljava/lang/Object;
.source "ScanMetaCriteria.java"


# virtual methods
.method public abstract getMultiplesCount()S
.end method

.method public abstract getName()Ljava/lang/String;
.end method

.method public abstract getProducts()Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getRandomWeightTotal()F
.end method

.method public abstract getRedemptionMax()S
.end method

.method public abstract isCombo()Z
.end method

.method public abstract isIgnoreBarcode()Z
.end method

.method public abstract isMultipleRedemptions()Z
.end method

.method public abstract isMultiples()Z
.end method

.method public abstract isMultiplesUnique()Z
.end method

.method public abstract isRandomWeight()Z
.end method

.method public abstract isStandard()Z
.end method
