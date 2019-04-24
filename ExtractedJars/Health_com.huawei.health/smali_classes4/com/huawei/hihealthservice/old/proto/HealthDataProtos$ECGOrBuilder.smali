.class public interface abstract Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGOrBuilder;
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
    name = "ECGOrBuilder"
.end annotation


# virtual methods
.method public abstract getAnalysisResultSummary()Ljava/lang/String;
.end method

.method public abstract getAnalysisResultSummaryBytes()Lcom/google/protobuf/ByteString;
.end method

.method public abstract getBaseHealthData()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthData;
.end method

.method public abstract getBaseHealthDataOrBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$HealthDataOrBuilder;
.end method

.method public abstract getCloudOrderId()Ljava/lang/String;
.end method

.method public abstract getCloudOrderIdBytes()Lcom/google/protobuf/ByteString;
.end method

.method public abstract getDoctorDiagnosis()Ljava/lang/String;
.end method

.method public abstract getDoctorDiagnosisBytes()Lcom/google/protobuf/ByteString;
.end method

.method public abstract getEventDataMap(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;
.end method

.method public abstract getEventDataMapCount()I
.end method

.method public abstract getEventDataMapList()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMap;>;"
        }
    .end annotation
.end method

.method public abstract getEventDataMapOrBuilder(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMapOrBuilder;
.end method

.method public abstract getEventDataMapOrBuilderList()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<+Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGEventDataMapOrBuilder;>;"
        }
    .end annotation
.end method

.method public abstract getOriginalUrl()Ljava/lang/String;
.end method

.method public abstract getOriginalUrlBytes()Lcom/google/protobuf/ByteString;
.end method

.method public abstract getParsedFileData()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDate;
.end method

.method public abstract getParsedFileDataOrBuilder()Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGParsedFileDateOrBuilder;
.end method

.method public abstract getStatisticsDataMap(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;
.end method

.method public abstract getStatisticsDataMapCount()I
.end method

.method public abstract getStatisticsDataMapList()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMap;>;"
        }
    .end annotation
.end method

.method public abstract getStatisticsDataMapOrBuilder(I)Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMapOrBuilder;
.end method

.method public abstract getStatisticsDataMapOrBuilderList()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<+Lcom/huawei/hihealthservice/old/proto/HealthDataProtos$ECGStatisticsDataMapOrBuilder;>;"
        }
    .end annotation
.end method

.method public abstract getSummary()Ljava/lang/String;
.end method

.method public abstract getSummaryBytes()Lcom/google/protobuf/ByteString;
.end method

.method public abstract hasAnalysisResultSummary()Z
.end method

.method public abstract hasBaseHealthData()Z
.end method

.method public abstract hasCloudOrderId()Z
.end method

.method public abstract hasDoctorDiagnosis()Z
.end method

.method public abstract hasOriginalUrl()Z
.end method

.method public abstract hasParsedFileData()Z
.end method

.method public abstract hasSummary()Z
.end method
