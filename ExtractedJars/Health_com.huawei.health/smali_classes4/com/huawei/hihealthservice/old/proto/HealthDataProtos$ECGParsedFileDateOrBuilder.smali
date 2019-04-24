.class public interface abstract Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDateOrBuilder;
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
    name = "ECGParsedFileDateOrBuilder"
.end annotation


# virtual methods
.method public abstract getDir()Ljava/lang/String;
.end method

.method public abstract getDirBytes()Lcom/google/protobuf/ByteString;
.end method

.method public abstract getDurationPerPoint()I
.end method

.method public abstract getTimeSliceList(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;
.end method

.method public abstract getTimeSliceListCount()I
.end method

.method public abstract getTimeSliceListList()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceList;>;"
        }
    .end annotation
.end method

.method public abstract getTimeSliceListOrBuilder(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceListOrBuilder;
.end method

.method public abstract getTimeSliceListOrBuilderList()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<+Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGTimeSliceListOrBuilder;>;"
        }
    .end annotation
.end method

.method public abstract getWebUrl()Ljava/lang/String;
.end method

.method public abstract getWebUrlBytes()Lcom/google/protobuf/ByteString;
.end method

.method public abstract hasDir()Z
.end method

.method public abstract hasDurationPerPoint()Z
.end method

.method public abstract hasWebUrl()Z
.end method
