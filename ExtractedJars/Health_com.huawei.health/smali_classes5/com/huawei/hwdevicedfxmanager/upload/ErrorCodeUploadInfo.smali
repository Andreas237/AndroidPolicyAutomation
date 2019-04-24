.class public Lcom/huawei/hwdevicedfxmanager/upload/ErrorCodeUploadInfo;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private headers:Ljava/lang/Object;

.field private method:Ljava/lang/String;

.field private objectId:Ljava/lang/String;

.field private uploadUrl:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getHeaders()Ljava/lang/Object;
    .locals 1

    .line 38
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/upload/ErrorCodeUploadInfo;->headers:Ljava/lang/Object;

    return-object v0
.end method

.method public getMethod()Ljava/lang/String;
    .locals 1

    .line 30
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/upload/ErrorCodeUploadInfo;->method:Ljava/lang/String;

    return-object v0
.end method

.method public getObjectId()Ljava/lang/String;
    .locals 1

    .line 14
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/upload/ErrorCodeUploadInfo;->objectId:Ljava/lang/String;

    return-object v0
.end method

.method public getUploadUrl()Ljava/lang/String;
    .locals 1

    .line 22
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/upload/ErrorCodeUploadInfo;->uploadUrl:Ljava/lang/String;

    return-object v0
.end method

.method public setHeaders(Ljava/lang/Object;)V
    .locals 0

    .line 42
    iput-object p1, p0, Lcom/huawei/hwdevicedfxmanager/upload/ErrorCodeUploadInfo;->headers:Ljava/lang/Object;

    .line 43
    return-void
.end method

.method public setMethod(Ljava/lang/String;)V
    .locals 0

    .line 34
    iput-object p1, p0, Lcom/huawei/hwdevicedfxmanager/upload/ErrorCodeUploadInfo;->method:Ljava/lang/String;

    .line 35
    return-void
.end method

.method public setObjectId(Ljava/lang/String;)V
    .locals 0

    .line 18
    iput-object p1, p0, Lcom/huawei/hwdevicedfxmanager/upload/ErrorCodeUploadInfo;->objectId:Ljava/lang/String;

    .line 19
    return-void
.end method

.method public setUploadUrl(Ljava/lang/String;)V
    .locals 0

    .line 26
    iput-object p1, p0, Lcom/huawei/hwdevicedfxmanager/upload/ErrorCodeUploadInfo;->uploadUrl:Ljava/lang/String;

    .line 27
    return-void
.end method
