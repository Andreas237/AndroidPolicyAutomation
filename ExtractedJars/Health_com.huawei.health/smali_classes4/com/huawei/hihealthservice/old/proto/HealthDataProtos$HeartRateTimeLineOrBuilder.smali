.class public interface abstract Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HeartRateTimeLineOrBuilder;
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
    name = "HeartRateTimeLineOrBuilder"
.end annotation


# virtual methods
.method public abstract getAvgHeartRate()I
.end method

.method public abstract getBaseTimeLine()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLine;
.end method

.method public abstract getBaseTimeLineOrBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$TimeLineOrBuilder;
.end method

.method public abstract getHeartRateValues(I)I
.end method

.method public abstract getHeartRateValuesCount()I
.end method

.method public abstract getHeartRateValuesList()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation
.end method

.method public abstract getMaxHeartRate()I
.end method

.method public abstract getMinHeartRate()I
.end method

.method public abstract hasAvgHeartRate()Z
.end method

.method public abstract hasBaseTimeLine()Z
.end method

.method public abstract hasMaxHeartRate()Z
.end method

.method public abstract hasMinHeartRate()Z
.end method
