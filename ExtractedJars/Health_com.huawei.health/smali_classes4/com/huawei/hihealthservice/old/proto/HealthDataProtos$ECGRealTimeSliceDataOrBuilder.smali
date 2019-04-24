.class public interface abstract Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeSliceDataOrBuilder;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/protobuf/MessageOrBuilder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hihealthservice/old/proto/HealthDataProtos;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "ECGRealTimeSliceDataOrBuilder"
.end annotation


# virtual methods
.method public abstract getRealTimeDataList(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;
.end method

.method public abstract getRealTimeDataListCount()I
.end method

.method public abstract getRealTimeDataListList()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeData;>;"
        }
    .end annotation
.end method

.method public abstract getRealTimeDataListOrBuilder(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeDataOrBuilder;
.end method

.method public abstract getRealTimeDataListOrBuilderList()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<+Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeDataOrBuilder;>;"
        }
    .end annotation
.end method

.method public abstract getStamp()J
.end method

.method public abstract hasStamp()Z
.end method
