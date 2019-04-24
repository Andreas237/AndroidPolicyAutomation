.class public Lcom/huawei/hwdevicedfxmanager/datatype/FileTransferActiveReport;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private index:I

.field private value:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hwdevicedfxmanager/datatype/FileTransferActiveReport;->index:I

    .line 21
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hwdevicedfxmanager/datatype/FileTransferActiveReport;->value:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getIndex()I
    .locals 1

    .line 24
    iget v0, p0, Lcom/huawei/hwdevicedfxmanager/datatype/FileTransferActiveReport;->index:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getValue()Ljava/lang/String;
    .locals 1

    .line 33
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/datatype/FileTransferActiveReport;->value:Ljava/lang/String;

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public setIndex(I)V
    .locals 1

    .line 28
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/hwdevicedfxmanager/datatype/FileTransferActiveReport;->index:I

    .line 29
    return-void
.end method

.method public setValue(Ljava/lang/String;)V
    .locals 1

    .line 37
    invoke-static {p1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/hwdevicedfxmanager/datatype/FileTransferActiveReport;->value:Ljava/lang/String;

    .line 38
    return-void
.end method
