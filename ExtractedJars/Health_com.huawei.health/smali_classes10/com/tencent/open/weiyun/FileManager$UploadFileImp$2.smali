.class Lcom/tencent/open/weiyun/FileManager$UploadFileImp$2;
.super Ljava/lang/Thread;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tencent/open/weiyun/FileManager$UploadFileImp;->getUploadPermission()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/tencent/open/weiyun/FileManager$UploadFileImp;


# direct methods
.method constructor <init>(Lcom/tencent/open/weiyun/FileManager$UploadFileImp;)V
    .locals 0

    .line 331
    iput-object p1, p0, Lcom/tencent/open/weiyun/FileManager$UploadFileImp$2;->this$1:Lcom/tencent/open/weiyun/FileManager$UploadFileImp;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 11

    .line 334
    iget-object v0, p0, Lcom/tencent/open/weiyun/FileManager$UploadFileImp$2;->this$1:Lcom/tencent/open/weiyun/FileManager$UploadFileImp;

    invoke-static {v0}, Lcom/tencent/open/weiyun/FileManager$UploadFileImp;->access$400(Lcom/tencent/open/weiyun/FileManager$UploadFileImp;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v4

    .line 335
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "__"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v4}, Landroid/net/Uri;->getLastPathSegment()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 338
    const-string v6, "control"

    .line 340
    iget-object v0, p0, Lcom/tencent/open/weiyun/FileManager$UploadFileImp$2;->this$1:Lcom/tencent/open/weiyun/FileManager$UploadFileImp;

    iget-object v0, v0, Lcom/tencent/open/weiyun/FileManager$UploadFileImp;->this$0:Lcom/tencent/open/weiyun/FileManager;

    invoke-static {v0}, Lcom/tencent/open/weiyun/FileManager;->a(Lcom/tencent/open/weiyun/FileManager;)Landroid/os/Bundle;

    move-result-object v7

    .line 341
    const-string v0, "sha"

    iget-object v1, p0, Lcom/tencent/open/weiyun/FileManager$UploadFileImp$2;->this$1:Lcom/tencent/open/weiyun/FileManager$UploadFileImp;

    invoke-static {v1}, Lcom/tencent/open/weiyun/FileManager$UploadFileImp;->access$600(Lcom/tencent/open/weiyun/FileManager$UploadFileImp;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v7, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 342
    const-string v0, "md5"

    iget-object v1, p0, Lcom/tencent/open/weiyun/FileManager$UploadFileImp$2;->this$1:Lcom/tencent/open/weiyun/FileManager$UploadFileImp;

    invoke-static {v1}, Lcom/tencent/open/weiyun/FileManager$UploadFileImp;->access$700(Lcom/tencent/open/weiyun/FileManager$UploadFileImp;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v7, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 343
    const-string v0, "size"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/tencent/open/weiyun/FileManager$UploadFileImp$2;->this$1:Lcom/tencent/open/weiyun/FileManager$UploadFileImp;

    invoke-static {v2}, Lcom/tencent/open/weiyun/FileManager$UploadFileImp;->access$800(Lcom/tencent/open/weiyun/FileManager$UploadFileImp;)J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v7, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 344
    const-string v0, "name"

    invoke-virtual {v7, v0, v5}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 345
    const-string v0, "upload_type"

    invoke-virtual {v7, v0, v6}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 347
    const/4 v8, 0x0

    .line 349
    :try_start_0
    iget-object v0, p0, Lcom/tencent/open/weiyun/FileManager$UploadFileImp$2;->this$1:Lcom/tencent/open/weiyun/FileManager$UploadFileImp;

    iget-object v0, v0, Lcom/tencent/open/weiyun/FileManager$UploadFileImp;->this$0:Lcom/tencent/open/weiyun/FileManager;

    invoke-static {v0}, Lcom/tencent/open/weiyun/FileManager;->b(Lcom/tencent/open/weiyun/FileManager;)Lcom/tencent/connect/auth/QQToken;

    move-result-object v0

    iget-object v1, p0, Lcom/tencent/open/weiyun/FileManager$UploadFileImp$2;->this$1:Lcom/tencent/open/weiyun/FileManager$UploadFileImp;

    invoke-static {v1}, Lcom/tencent/open/weiyun/FileManager$UploadFileImp;->access$1000(Lcom/tencent/open/weiyun/FileManager$UploadFileImp;)Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/tencent/open/weiyun/FileManager$UploadFileImp$2;->this$1:Lcom/tencent/open/weiyun/FileManager$UploadFileImp;

    iget-object v3, p0, Lcom/tencent/open/weiyun/FileManager$UploadFileImp$2;->this$1:Lcom/tencent/open/weiyun/FileManager$UploadFileImp;

    invoke-static {v3}, Lcom/tencent/open/weiyun/FileManager$UploadFileImp;->access$1100(Lcom/tencent/open/weiyun/FileManager$UploadFileImp;)Lcom/tencent/open/weiyun/FileManager$WeiyunFileType;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/tencent/open/weiyun/FileManager$UploadFileImp;->access$1200(Lcom/tencent/open/weiyun/FileManager$UploadFileImp;Lcom/tencent/open/weiyun/FileManager$WeiyunFileType;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "GET"

    invoke-static {v0, v1, v2, v7, v3}, Lcom/tencent/open/utils/HttpUtils;->request(Lcom/tencent/connect/auth/QQToken;Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v8

    .line 350
    iget-object v0, p0, Lcom/tencent/open/weiyun/FileManager$UploadFileImp$2;->this$1:Lcom/tencent/open/weiyun/FileManager$UploadFileImp;

    invoke-static {v0}, Lcom/tencent/open/weiyun/FileManager$UploadFileImp;->access$1300(Lcom/tencent/open/weiyun/FileManager$UploadFileImp;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v9

    .line 351
    const/4 v0, 0x0

    iput v0, v9, Landroid/os/Message;->what:I

    .line 352
    iput-object v8, v9, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 353
    iget-object v0, p0, Lcom/tencent/open/weiyun/FileManager$UploadFileImp$2;->this$1:Lcom/tencent/open/weiyun/FileManager$UploadFileImp;

    invoke-static {v0}, Lcom/tencent/open/weiyun/FileManager$UploadFileImp;->access$1300(Lcom/tencent/open/weiyun/FileManager$UploadFileImp;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v9}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
    :try_end_0
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Lcom/tencent/open/utils/HttpUtils$NetworkUnavailableException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Lcom/tencent/open/utils/HttpUtils$HttpStatusException; {:try_start_0 .. :try_end_0} :catch_4

    .line 379
    goto/16 :goto_0

    .line 354
    :catch_0
    move-exception v9

    .line 355
    iget-object v0, p0, Lcom/tencent/open/weiyun/FileManager$UploadFileImp$2;->this$1:Lcom/tencent/open/weiyun/FileManager$UploadFileImp;

    invoke-static {v0}, Lcom/tencent/open/weiyun/FileManager$UploadFileImp;->access$1300(Lcom/tencent/open/weiyun/FileManager$UploadFileImp;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v10

    .line 356
    const/4 v0, -0x3

    iput v0, v10, Landroid/os/Message;->what:I

    .line 357
    invoke-virtual {v9}, Ljava/net/MalformedURLException;->getMessage()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v10, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 358
    iget-object v0, p0, Lcom/tencent/open/weiyun/FileManager$UploadFileImp$2;->this$1:Lcom/tencent/open/weiyun/FileManager$UploadFileImp;

    invoke-static {v0}, Lcom/tencent/open/weiyun/FileManager$UploadFileImp;->access$1300(Lcom/tencent/open/weiyun/FileManager$UploadFileImp;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v10}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 379
    goto/16 :goto_0

    .line 359
    :catch_1
    move-exception v9

    .line 360
    iget-object v0, p0, Lcom/tencent/open/weiyun/FileManager$UploadFileImp$2;->this$1:Lcom/tencent/open/weiyun/FileManager$UploadFileImp;

    invoke-static {v0}, Lcom/tencent/open/weiyun/FileManager$UploadFileImp;->access$1300(Lcom/tencent/open/weiyun/FileManager$UploadFileImp;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v10

    .line 361
    invoke-virtual {v9}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v10, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 362
    const/4 v0, -0x2

    iput v0, v10, Landroid/os/Message;->what:I

    .line 363
    iget-object v0, p0, Lcom/tencent/open/weiyun/FileManager$UploadFileImp$2;->this$1:Lcom/tencent/open/weiyun/FileManager$UploadFileImp;

    invoke-static {v0}, Lcom/tencent/open/weiyun/FileManager$UploadFileImp;->access$1300(Lcom/tencent/open/weiyun/FileManager$UploadFileImp;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v10}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 379
    goto/16 :goto_0

    .line 364
    :catch_2
    move-exception v9

    .line 365
    iget-object v0, p0, Lcom/tencent/open/weiyun/FileManager$UploadFileImp$2;->this$1:Lcom/tencent/open/weiyun/FileManager$UploadFileImp;

    invoke-static {v0}, Lcom/tencent/open/weiyun/FileManager$UploadFileImp;->access$1300(Lcom/tencent/open/weiyun/FileManager$UploadFileImp;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v10

    .line 366
    invoke-virtual {v9}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v10, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 367
    const/4 v0, -0x4

    iput v0, v10, Landroid/os/Message;->what:I

    .line 368
    iget-object v0, p0, Lcom/tencent/open/weiyun/FileManager$UploadFileImp$2;->this$1:Lcom/tencent/open/weiyun/FileManager$UploadFileImp;

    invoke-static {v0}, Lcom/tencent/open/weiyun/FileManager$UploadFileImp;->access$1300(Lcom/tencent/open/weiyun/FileManager$UploadFileImp;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v10}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 379
    goto :goto_0

    .line 369
    :catch_3
    move-exception v9

    .line 370
    iget-object v0, p0, Lcom/tencent/open/weiyun/FileManager$UploadFileImp$2;->this$1:Lcom/tencent/open/weiyun/FileManager$UploadFileImp;

    invoke-static {v0}, Lcom/tencent/open/weiyun/FileManager$UploadFileImp;->access$1300(Lcom/tencent/open/weiyun/FileManager$UploadFileImp;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v10

    .line 371
    invoke-virtual {v9}, Lcom/tencent/open/utils/HttpUtils$NetworkUnavailableException;->getMessage()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v10, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 372
    const/16 v0, -0xa

    iput v0, v10, Landroid/os/Message;->what:I

    .line 373
    iget-object v0, p0, Lcom/tencent/open/weiyun/FileManager$UploadFileImp$2;->this$1:Lcom/tencent/open/weiyun/FileManager$UploadFileImp;

    invoke-static {v0}, Lcom/tencent/open/weiyun/FileManager$UploadFileImp;->access$1300(Lcom/tencent/open/weiyun/FileManager$UploadFileImp;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v10}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 379
    goto :goto_0

    .line 374
    :catch_4
    move-exception v9

    .line 375
    iget-object v0, p0, Lcom/tencent/open/weiyun/FileManager$UploadFileImp$2;->this$1:Lcom/tencent/open/weiyun/FileManager$UploadFileImp;

    invoke-static {v0}, Lcom/tencent/open/weiyun/FileManager$UploadFileImp;->access$1300(Lcom/tencent/open/weiyun/FileManager$UploadFileImp;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v10

    .line 376
    invoke-virtual {v9}, Lcom/tencent/open/utils/HttpUtils$HttpStatusException;->getMessage()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v10, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 377
    const/16 v0, -0x9

    iput v0, v10, Landroid/os/Message;->what:I

    .line 378
    iget-object v0, p0, Lcom/tencent/open/weiyun/FileManager$UploadFileImp$2;->this$1:Lcom/tencent/open/weiyun/FileManager$UploadFileImp;

    invoke-static {v0}, Lcom/tencent/open/weiyun/FileManager$UploadFileImp;->access$1300(Lcom/tencent/open/weiyun/FileManager$UploadFileImp;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v10}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 380
    :goto_0
    return-void
.end method
