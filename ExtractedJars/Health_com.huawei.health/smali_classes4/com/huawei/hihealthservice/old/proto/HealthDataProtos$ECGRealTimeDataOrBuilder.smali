.class public interface abstract Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGRealTimeDataOrBuilder;
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
    name = "ECGRealTimeDataOrBuilder"
.end annotation


# virtual methods
.method public abstract getArrhythmia()I
.end method

.method public abstract getEcgValue(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGValue;
.end method

.method public abstract getEcgValueCount()I
.end method

.method public abstract getEcgValueList()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGValue;>;"
        }
    .end annotation
.end method

.method public abstract getEcgValueOrBuilder(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGValueOrBuilder;
.end method

.method public abstract getEcgValueOrBuilderList()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<+Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGValueOrBuilder;>;"
        }
    .end annotation
.end method

.method public abstract getHeartRate()I
.end method

.method public abstract getTimeStamp()J
.end method

.method public abstract hasArrhythmia()Z
.end method

.method public abstract hasHeartRate()Z
.end method

.method public abstract hasTimeStamp()Z
.end method
