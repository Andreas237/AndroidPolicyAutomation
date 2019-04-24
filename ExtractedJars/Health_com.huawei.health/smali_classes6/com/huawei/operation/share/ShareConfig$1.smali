.class Lcom/huawei/operation/share/ShareConfig$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/operation/https/HttpResCallBack;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/operation/share/ShareConfig;->doObtionShareConfig(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/operation/share/ShareConfigCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/operation/share/ShareConfig;


# direct methods
.method constructor <init>(Lcom/huawei/operation/share/ShareConfig;)V
    .locals 0

    .line 189
    iput-object p1, p0, Lcom/huawei/operation/share/ShareConfig$1;->this$0:Lcom/huawei/operation/share/ShareConfig;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFinished(ILjava/lang/String;)V
    .locals 5

    .line 192
    const-string v0, "Opera_[Operation Version 1.2]ShareConfig"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "doObtionShareConfig resCode = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 193
    const/16 v0, 0xc8

    if-ne p1, v0, :cond_0

    .line 194
    const-string v0, "Opera_[Operation Version 1.2]ShareConfig"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "doObtionShareConfig success result = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 196
    :try_start_0
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4, p2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 197
    iget-object v0, p0, Lcom/huawei/operation/share/ShareConfig$1;->this$0:Lcom/huawei/operation/share/ShareConfig;

    const-string v1, "shareImg"

    invoke-virtual {v4, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/operation/share/ShareConfig;->access$002(Lcom/huawei/operation/share/ShareConfig;Ljava/lang/String;)Ljava/lang/String;

    .line 198
    iget-object v0, p0, Lcom/huawei/operation/share/ShareConfig$1;->this$0:Lcom/huawei/operation/share/ShareConfig;

    const-string v1, "shareTitle"

    invoke-virtual {v4, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/operation/share/ShareConfig;->access$102(Lcom/huawei/operation/share/ShareConfig;Ljava/lang/String;)Ljava/lang/String;

    .line 199
    iget-object v0, p0, Lcom/huawei/operation/share/ShareConfig$1;->this$0:Lcom/huawei/operation/share/ShareConfig;

    const-string v1, "shareContent"

    invoke-virtual {v4, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/operation/share/ShareConfig;->access$202(Lcom/huawei/operation/share/ShareConfig;Ljava/lang/String;)Ljava/lang/String;

    .line 200
    iget-object v0, p0, Lcom/huawei/operation/share/ShareConfig$1;->this$0:Lcom/huawei/operation/share/ShareConfig;

    const-string v1, "url"

    invoke-virtual {v4, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/operation/share/ShareConfig;->access$302(Lcom/huawei/operation/share/ShareConfig;Ljava/lang/String;)Ljava/lang/String;

    .line 203
    new-instance v0, Lcom/huawei/operation/share/ShareConfig$DownImgAsyncTask;

    iget-object v1, p0, Lcom/huawei/operation/share/ShareConfig$1;->this$0:Lcom/huawei/operation/share/ShareConfig;

    invoke-direct {v0, v1}, Lcom/huawei/operation/share/ShareConfig$DownImgAsyncTask;-><init>(Lcom/huawei/operation/share/ShareConfig;)V

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/huawei/operation/share/ShareConfig$DownImgAsyncTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 207
    goto :goto_0

    .line 205
    :catch_0
    move-exception v4

    .line 206
    const-string v0, "Opera_[Operation Version 1.2]ShareConfig"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 207
    goto :goto_0

    .line 209
    :cond_0
    const/4 v0, -0x1

    if-ne v0, p1, :cond_1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {}, Lcom/huawei/operation/share/ShareConfig;->getToastTime()J

    move-result-wide v2

    sub-long/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(J)J

    move-result-wide v0

    const-wide/16 v2, 0xbb8

    cmp-long v0, v0, v2

    if-lez v0, :cond_1

    .line 211
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/huawei/operation/share/ShareConfig;->setToastTime(J)V

    .line 212
    const-string v0, "Opera_[Operation Version 1.2]ShareConfig"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onFinished MSG_SHARE_FAIL_TOAST"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 213
    iget-object v0, p0, Lcom/huawei/operation/share/ShareConfig$1;->this$0:Lcom/huawei/operation/share/ShareConfig;

    invoke-static {v0}, Lcom/huawei/operation/share/ShareConfig;->access$400(Lcom/huawei/operation/share/ShareConfig;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x833

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 215
    :cond_1
    iget-object v0, p0, Lcom/huawei/operation/share/ShareConfig$1;->this$0:Lcom/huawei/operation/share/ShareConfig;

    invoke-static {v0}, Lcom/huawei/operation/share/ShareConfig;->access$500(Lcom/huawei/operation/share/ShareConfig;)V

    .line 217
    :goto_0
    return-void
.end method
