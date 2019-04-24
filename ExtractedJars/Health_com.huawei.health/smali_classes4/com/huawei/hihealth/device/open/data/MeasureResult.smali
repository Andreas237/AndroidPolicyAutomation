.class public interface abstract Lcom/huawei/hihealth/device/open/data/MeasureResult;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract createAndJoinRecord()Lcom/huawei/hihealth/device/open/data/MeasureRecord;
.end method

.method public abstract createRecord()Lcom/huawei/hihealth/device/open/data/MeasureRecord;
.end method

.method public abstract getRecords()Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/ArrayList<Lcom/huawei/hihealth/device/open/data/MeasureRecord;>;"
        }
    .end annotation
.end method

.method public abstract joinRecord(Lcom/huawei/hihealth/device/open/data/MeasureRecord;)V
.end method
