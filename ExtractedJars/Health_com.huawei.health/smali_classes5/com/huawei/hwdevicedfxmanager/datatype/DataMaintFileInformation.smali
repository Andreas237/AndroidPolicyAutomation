.class public Lcom/huawei/hwdevicedfxmanager/datatype/DataMaintFileInformation;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private fileCrc:J

.field private fileName:Ljava/lang/String;

.field private fileSize:J


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getFileCrc()J
    .locals 2

    .line 43
    iget-wide v0, p0, Lcom/huawei/hwdevicedfxmanager/datatype/DataMaintFileInformation;->fileCrc:J

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    return-wide v0
.end method

.method public getFileName()Ljava/lang/String;
    .locals 1

    .line 27
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/datatype/DataMaintFileInformation;->fileName:Ljava/lang/String;

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getFileSize()J
    .locals 2

    .line 35
    iget-wide v0, p0, Lcom/huawei/hwdevicedfxmanager/datatype/DataMaintFileInformation;->fileSize:J

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    return-wide v0
.end method

.method public setFileCrc(J)V
    .locals 2

    .line 47
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/hwdevicedfxmanager/datatype/DataMaintFileInformation;->fileCrc:J

    .line 48
    return-void
.end method

.method public setFileName(Ljava/lang/String;)V
    .locals 1

    .line 31
    invoke-static {p1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/hwdevicedfxmanager/datatype/DataMaintFileInformation;->fileName:Ljava/lang/String;

    .line 32
    return-void
.end method

.method public setFileSize(J)V
    .locals 2

    .line 39
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/hwdevicedfxmanager/datatype/DataMaintFileInformation;->fileSize:J

    .line 40
    return-void
.end method
