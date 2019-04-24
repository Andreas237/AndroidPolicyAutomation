.class Lcom/tencent/open/weiyun/FileManager$UploadFileImp$1;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tencent/open/weiyun/FileManager$UploadFileImp;-><init>(Lcom/tencent/open/weiyun/FileManager;Landroid/content/Context;Lcom/tencent/open/weiyun/FileManager$WeiyunFileType;Ljava/lang/String;Lcom/tencent/open/weiyun/IUploadFileCallBack;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/tencent/open/weiyun/FileManager$UploadFileImp;

.field final synthetic val$this$0:Lcom/tencent/open/weiyun/FileManager;


# direct methods
.method constructor <init>(Lcom/tencent/open/weiyun/FileManager$UploadFileImp;Landroid/os/Looper;Lcom/tencent/open/weiyun/FileManager;)V
    .locals 0

    .line 186
    iput-object p1, p0, Lcom/tencent/open/weiyun/FileManager$UploadFileImp$1;->this$1:Lcom/tencent/open/weiyun/FileManager$UploadFileImp;

    iput-object p3, p0, Lcom/tencent/open/weiyun/FileManager$UploadFileImp$1;->val$this$0:Lcom/tencent/open/weiyun/FileManager;

    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 9

    .line 189
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_1

    .line 191
    :pswitch_0
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Lorg/json/JSONObject;

    .line 193
    const-string v0, "ret"

    :try_start_0
    invoke-virtual {v5, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v6

    .line 194
    if-eqz v6, :cond_0

    .line 195
    iget-object v0, p0, Lcom/tencent/open/weiyun/FileManager$UploadFileImp$1;->this$1:Lcom/tencent/open/weiyun/FileManager$UploadFileImp;

    invoke-static {v0}, Lcom/tencent/open/weiyun/FileManager$UploadFileImp;->access$000(Lcom/tencent/open/weiyun/FileManager$UploadFileImp;)Lcom/tencent/open/weiyun/IUploadFileCallBack;

    move-result-object v0

    new-instance v1, Lcom/tencent/tauth/UiError;

    invoke-virtual {v5}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-direct {v1, v6, v2, v3}, Lcom/tencent/tauth/UiError;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Lcom/tencent/open/weiyun/IUploadFileCallBack;->onError(Lcom/tencent/tauth/UiError;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 196
    goto/16 :goto_2

    .line 198
    :cond_0
    const-string v0, "data"

    :try_start_1
    invoke-virtual {v5, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v7

    .line 199
    const-string v0, "csum"

    invoke-virtual {v7, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 200
    iget-object v0, p0, Lcom/tencent/open/weiyun/FileManager$UploadFileImp$1;->this$1:Lcom/tencent/open/weiyun/FileManager$UploadFileImp;

    invoke-static {v8}, Lcom/tencent/open/utils/DataConvert;->string2bytes(Ljava/lang/String;)[B

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tencent/open/weiyun/FileManager$UploadFileImp;->access$102(Lcom/tencent/open/weiyun/FileManager$UploadFileImp;[B)[B

    .line 201
    iget-object v0, p0, Lcom/tencent/open/weiyun/FileManager$UploadFileImp$1;->this$1:Lcom/tencent/open/weiyun/FileManager$UploadFileImp;

    const-string v1, "host"

    invoke-virtual {v7, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tencent/open/weiyun/FileManager$UploadFileImp;->access$202(Lcom/tencent/open/weiyun/FileManager$UploadFileImp;Ljava/lang/String;)Ljava/lang/String;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 205
    goto :goto_0

    .line 202
    :catch_0
    move-exception v6

    .line 203
    iget-object v0, p0, Lcom/tencent/open/weiyun/FileManager$UploadFileImp$1;->this$1:Lcom/tencent/open/weiyun/FileManager$UploadFileImp;

    invoke-static {v0}, Lcom/tencent/open/weiyun/FileManager$UploadFileImp;->access$000(Lcom/tencent/open/weiyun/FileManager$UploadFileImp;)Lcom/tencent/open/weiyun/IUploadFileCallBack;

    move-result-object v0

    new-instance v1, Lcom/tencent/tauth/UiError;

    invoke-virtual {v6}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, -0x4

    const/4 v4, 0x0

    invoke-direct {v1, v3, v2, v4}, Lcom/tencent/tauth/UiError;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Lcom/tencent/open/weiyun/IUploadFileCallBack;->onError(Lcom/tencent/tauth/UiError;)V

    .line 204
    return-void

    .line 206
    :goto_0
    iget-object v0, p0, Lcom/tencent/open/weiyun/FileManager$UploadFileImp$1;->this$1:Lcom/tencent/open/weiyun/FileManager$UploadFileImp;

    invoke-static {v0}, Lcom/tencent/open/weiyun/FileManager$UploadFileImp;->access$000(Lcom/tencent/open/weiyun/FileManager$UploadFileImp;)Lcom/tencent/open/weiyun/IUploadFileCallBack;

    move-result-object v0

    invoke-interface {v0}, Lcom/tencent/open/weiyun/IUploadFileCallBack;->onUploadStart()V

    .line 207
    iget-object v0, p0, Lcom/tencent/open/weiyun/FileManager$UploadFileImp$1;->this$1:Lcom/tencent/open/weiyun/FileManager$UploadFileImp;

    invoke-static {v0}, Lcom/tencent/open/weiyun/FileManager$UploadFileImp;->access$300(Lcom/tencent/open/weiyun/FileManager$UploadFileImp;)V

    .line 208
    goto :goto_2

    .line 210
    :pswitch_1
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Ljava/lang/String;

    .line 211
    invoke-static {v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v7

    .line 212
    iget-object v0, p0, Lcom/tencent/open/weiyun/FileManager$UploadFileImp$1;->this$1:Lcom/tencent/open/weiyun/FileManager$UploadFileImp;

    invoke-static {v0}, Lcom/tencent/open/weiyun/FileManager$UploadFileImp;->access$000(Lcom/tencent/open/weiyun/FileManager$UploadFileImp;)Lcom/tencent/open/weiyun/IUploadFileCallBack;

    move-result-object v0

    invoke-interface {v0, v7}, Lcom/tencent/open/weiyun/IUploadFileCallBack;->onUploadProgress(I)V

    .line 213
    goto :goto_2

    .line 215
    :pswitch_2
    iget-object v0, p0, Lcom/tencent/open/weiyun/FileManager$UploadFileImp$1;->this$1:Lcom/tencent/open/weiyun/FileManager$UploadFileImp;

    invoke-static {v0}, Lcom/tencent/open/weiyun/FileManager$UploadFileImp;->access$000(Lcom/tencent/open/weiyun/FileManager$UploadFileImp;)Lcom/tencent/open/weiyun/IUploadFileCallBack;

    move-result-object v0

    invoke-interface {v0}, Lcom/tencent/open/weiyun/IUploadFileCallBack;->onUploadSuccess()V

    .line 216
    goto :goto_2

    .line 218
    :goto_1
    iget-object v0, p0, Lcom/tencent/open/weiyun/FileManager$UploadFileImp$1;->this$1:Lcom/tencent/open/weiyun/FileManager$UploadFileImp;

    invoke-static {v0}, Lcom/tencent/open/weiyun/FileManager$UploadFileImp;->access$000(Lcom/tencent/open/weiyun/FileManager$UploadFileImp;)Lcom/tencent/open/weiyun/IUploadFileCallBack;

    move-result-object v0

    new-instance v1, Lcom/tencent/tauth/UiError;

    iget v2, p1, Landroid/os/Message;->what:I

    iget-object v3, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    const/4 v4, 0x0

    invoke-direct {v1, v2, v3, v4}, Lcom/tencent/tauth/UiError;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Lcom/tencent/open/weiyun/IUploadFileCallBack;->onError(Lcom/tencent/tauth/UiError;)V

    .line 220
    :goto_2
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method
