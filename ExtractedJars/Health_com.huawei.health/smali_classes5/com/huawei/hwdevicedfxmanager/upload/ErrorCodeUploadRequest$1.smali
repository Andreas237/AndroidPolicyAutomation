.class final Lcom/huawei/hwdevicedfxmanager/upload/ErrorCodeUploadRequest$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/hwdevicedfxmanager/upload/ErrorCodeUploadRequest;->errorcodeUpload([BLcom/huawei/hwdevicedfxmanager/upload/EvenLogUpload;Lorg/json/JSONObject;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic val$accessToken:Ljava/lang/String;

.field final synthetic val$logUpload:Lcom/huawei/hwdevicedfxmanager/upload/EvenLogUpload;

.field final synthetic val$rjson:Lorg/json/JSONObject;


# direct methods
.method constructor <init>(Lorg/json/JSONObject;Lcom/huawei/hwdevicedfxmanager/upload/EvenLogUpload;Ljava/lang/String;)V
    .locals 0

    .line 252
    iput-object p1, p0, Lcom/huawei/hwdevicedfxmanager/upload/ErrorCodeUploadRequest$1;->val$rjson:Lorg/json/JSONObject;

    iput-object p2, p0, Lcom/huawei/hwdevicedfxmanager/upload/ErrorCodeUploadRequest$1;->val$logUpload:Lcom/huawei/hwdevicedfxmanager/upload/EvenLogUpload;

    iput-object p3, p0, Lcom/huawei/hwdevicedfxmanager/upload/ErrorCodeUploadRequest$1;->val$accessToken:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 7

    .line 254
    const-string v0, "LogUpload Service  errorcode=="

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onResponseonResponse ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 255
    const/16 v0, 0xc8

    if-ne v0, p1, :cond_2

    .line 256
    const/4 v4, 0x0

    .line 257
    const/4 v5, 0x0

    .line 259
    :try_start_0
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/upload/ErrorCodeUploadRequest$1;->val$rjson:Lorg/json/JSONObject;

    const-string v1, "fileUniqueFlag"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 261
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/upload/ErrorCodeUploadRequest$1;->val$rjson:Lorg/json/JSONObject;

    const-string v1, "fileUniqueFlag"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    move-object v4, v0

    .line 263
    :cond_0
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/upload/ErrorCodeUploadRequest$1;->val$rjson:Lorg/json/JSONObject;

    const-string v1, "currentTime"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 264
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/upload/ErrorCodeUploadRequest$1;->val$rjson:Lorg/json/JSONObject;

    const-string v1, "currentTime"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v5, v0

    .line 268
    :cond_1
    goto :goto_0

    .line 266
    :catch_0
    move-exception v6

    .line 267
    const-string v0, "LogUpload Service  errorcode=="

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " JSONException "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 270
    :goto_0
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/upload/ErrorCodeUploadRequest$1;->val$logUpload:Lcom/huawei/hwdevicedfxmanager/upload/EvenLogUpload;

    iget-object v1, p0, Lcom/huawei/hwdevicedfxmanager/upload/ErrorCodeUploadRequest$1;->val$accessToken:Ljava/lang/String;

    invoke-static {v0, v4, v5, v1}, Lcom/huawei/hwdevicedfxmanager/upload/ErrorCodeUploadRequest;->uploadSuccess(Lcom/huawei/hwdevicedfxmanager/upload/EvenLogUpload;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 271
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/upload/ErrorCodeUploadRequest$1;->val$logUpload:Lcom/huawei/hwdevicedfxmanager/upload/EvenLogUpload;

    invoke-static {v0}, Lcom/huawei/hwdevicedfxmanager/upload/ErrorCodeUploadRequest;->deleteEncryFile(Lcom/huawei/hwdevicedfxmanager/upload/EvenLogUpload;)V

    .line 273
    :cond_2
    return-void
.end method
