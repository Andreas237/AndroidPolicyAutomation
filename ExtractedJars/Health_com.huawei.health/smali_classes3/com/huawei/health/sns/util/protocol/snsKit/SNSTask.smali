.class public Lcom/huawei/health/sns/util/protocol/snsKit/SNSTask;
.super Landroid/os/AsyncTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask<Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;Ljava/lang/Void;Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;>;"
    }
.end annotation


# instance fields
.field protected a:Lcom/huawei/health/sns/util/protocol/snsKit/bean/ISNSCallBack;

.field protected b:Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;

.field protected d:Z


# direct methods
.method public constructor <init>(Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;Lcom/huawei/health/sns/util/protocol/snsKit/bean/ISNSCallBack;)V
    .locals 3

    .line 63
    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    .line 43
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/util/protocol/snsKit/SNSTask;->b:Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;

    .line 48
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/util/protocol/snsKit/SNSTask;->a:Lcom/huawei/health/sns/util/protocol/snsKit/bean/ISNSCallBack;

    .line 53
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/util/protocol/snsKit/SNSTask;->d:Z

    .line 64
    const-string v0, "SNSTask"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "SNSTask RequestBean toString:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 65
    const-string v0, "SNSTask"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "SNSTask RequestBean getRequestUrl:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;->getRequestUrl()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 66
    const-string v0, "SNSTask"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "SNSTask RequestBean getUrl:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;->getUrl()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 67
    iput-object p1, p0, Lcom/huawei/health/sns/util/protocol/snsKit/SNSTask;->b:Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;

    .line 68
    iput-object p2, p0, Lcom/huawei/health/sns/util/protocol/snsKit/SNSTask;->a:Lcom/huawei/health/sns/util/protocol/snsKit/bean/ISNSCallBack;

    .line 69
    return-void
.end method

.method private b(Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;)Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;
    .locals 3

    .line 284
    invoke-virtual {p0, p1}, Lcom/huawei/health/sns/util/protocol/snsKit/SNSTask;->e(Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;)Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;

    move-result-object p1

    .line 287
    invoke-virtual {p0, p1}, Lcom/huawei/health/sns/util/protocol/snsKit/SNSTask;->c(Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;)V

    .line 289
    if-eqz p1, :cond_1

    iget v0, p1, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->responseCode:I

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 290
    invoke-virtual {p1}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->getServerErrorCode()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 292
    :cond_0
    const-string v0, "SNSTask"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "code1:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p1, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->responseCode:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ",code2:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->getServerErrorCode()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 295
    :cond_1
    return-object p1
.end method

.method private d([B)Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;
    .locals 6

    .line 364
    iget-object v0, p0, Lcom/huawei/health/sns/util/protocol/snsKit/SNSTask;->b:Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;

    invoke-virtual {v0}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;->createResponse()Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;

    move-result-object v3

    .line 367
    if-eqz p1, :cond_0

    array-length v0, p1

    if-nez v0, :cond_1

    .line 369
    :cond_0
    return-object v3

    .line 373
    :cond_1
    new-instance v4, Ljava/lang/String;

    const-string v0, "UTF-8"

    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0

    invoke-direct {v4, p1, v0}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 374
    const-string v0, "SNSTask"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "parseResponse"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 378
    :try_start_0
    new-instance v5, Lorg/json/JSONObject;

    invoke-direct {v5, v4}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 379
    const-string v0, "SNSTask"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "parseResponse"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v5}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 381
    invoke-virtual {v3, v5}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->caseFromJson(Lorg/json/JSONObject;)V

    .line 384
    const/4 v0, 0x0

    iput v0, v3, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->responseCode:I
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_4

    .line 409
    goto :goto_0

    .line 386
    :catch_0
    move-exception v5

    .line 389
    const v0, 0x14ff5

    iput v0, v3, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->responseCode:I

    .line 390
    invoke-virtual {v3, v4}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->setResponseErrorMsg(Ljava/lang/String;)V

    .line 392
    const-string v0, "SNSTask"

    const-string v1, "parse json error:"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 409
    goto :goto_0

    .line 394
    :catch_1
    move-exception v5

    .line 396
    const-string v0, "SNSTask"

    const-string v1, "IllegalArgumentException, parse json error:"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 409
    goto :goto_0

    .line 398
    :catch_2
    move-exception v5

    .line 400
    const-string v0, "SNSTask"

    const-string v1, "IllegalAccessException, parse json error:"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 409
    goto :goto_0

    .line 402
    :catch_3
    move-exception v5

    .line 404
    const-string v0, "SNSTask"

    const-string v1, "InstantiationException, parse json error:"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 409
    goto :goto_0

    .line 406
    :catch_4
    move-exception v5

    .line 408
    const-string v0, "SNSTask"

    const-string v1, "ClassNotFoundException, parse json error:"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 411
    :goto_0
    return-object v3
.end method

.method private d()Ljava/lang/String;
    .locals 1

    .line 237
    iget-object v0, p0, Lcom/huawei/health/sns/util/protocol/snsKit/SNSTask;->b:Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;

    invoke-virtual {v0}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;->getMethod()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private d(Z)Lo/bqg;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 249
    const-string v0, "SNSTask"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "do request, upload="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 252
    if-eqz p1, :cond_0

    .line 255
    iget-object v0, p0, Lcom/huawei/health/sns/util/protocol/snsKit/SNSTask;->b:Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/bpy;->a(Lo/bqb;Lo/bqe;)Lo/bqg;

    move-result-object v0

    return-object v0

    .line 259
    :cond_0
    const-string v3, ""

    .line 263
    :try_start_0
    iget-object v0, p0, Lcom/huawei/health/sns/util/protocol/snsKit/SNSTask;->b:Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;

    invoke-virtual {v0}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;->genBody()Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v3, v0

    .line 268
    goto :goto_0

    .line 265
    :catch_0
    move-exception v4

    .line 267
    const-string v0, "SNSTask"

    const-string v1, "gen request body failed."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 269
    :goto_0
    const-string v0, "SNSTask"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "request body:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/health/sns/util/protocol/snsKit/SNSTask;->b:Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;

    invoke-virtual {v2}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 270
    const-string v0, "SNSTask"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "request url:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/health/sns/util/protocol/snsKit/SNSTask;->b:Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;

    invoke-virtual {v2}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;->getRequestUrl()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 271
    iget-object v0, p0, Lcom/huawei/health/sns/util/protocol/snsKit/SNSTask;->b:Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;

    invoke-static {v0, v3}, Lo/bpy;->a(Lo/bqb;Ljava/lang/String;)Lo/bqg;

    move-result-object v0

    return-object v0
.end method

.method private static d(Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;ILjava/lang/String;)V
    .locals 3

    .line 337
    invoke-virtual {p0}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;->getTarget()Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean$Target;

    move-result-object v2

    .line 338
    sget-object v0, Lcom/huawei/health/sns/util/protocol/snsKit/SNSTask$4;->d:[I

    invoke-virtual {v2}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean$Target;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 341
    :pswitch_0
    invoke-static {p1, p2}, Lo/bpj;->h(ILjava/lang/String;)V

    .line 342
    goto :goto_0

    .line 344
    :pswitch_1
    invoke-static {p1, p2}, Lo/bpj;->b(ILjava/lang/String;)V

    .line 345
    goto :goto_0

    .line 347
    :pswitch_2
    invoke-static {p1, p2}, Lo/bpj;->a(ILjava/lang/String;)V

    .line 348
    goto :goto_0

    .line 350
    :pswitch_3
    invoke-static {p1, p2}, Lo/bpj;->d(ILjava/lang/String;)V

    .line 351
    .line 355
    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method private static d(Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;)V
    .locals 3

    .line 306
    iget v0, p1, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->responseCode:I

    if-eqz v0, :cond_0

    .line 309
    iget v0, p1, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->responseCode:I

    const v1, 0x14ff5

    if-ne v0, v1, :cond_1

    .line 311
    invoke-virtual {p1}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->getResponseErrorMsg()Ljava/lang/String;

    move-result-object v0

    const v1, 0x14ff5

    invoke-static {p0, v1, v0}, Lcom/huawei/health/sns/util/protocol/snsKit/SNSTask;->d(Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;ILjava/lang/String;)V

    goto :goto_0

    .line 317
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->getServerErrorCode()I

    move-result v2

    .line 320
    if-eqz v2, :cond_1

    .line 322
    const-string v0, "request failed."

    invoke-static {p0, v2, v0}, Lcom/huawei/health/sns/util/protocol/snsKit/SNSTask;->d(Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;ILjava/lang/String;)V

    .line 325
    :cond_1
    :goto_0
    return-void
.end method

.method private h(Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;)V
    .locals 3

    .line 436
    invoke-virtual {p0}, Lcom/huawei/health/sns/util/protocol/snsKit/SNSTask;->isCancelled()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/huawei/health/sns/util/protocol/snsKit/SNSTask;->a:Lcom/huawei/health/sns/util/protocol/snsKit/bean/ISNSCallBack;

    if-eqz v0, :cond_1

    .line 438
    if-nez p1, :cond_0

    .line 440
    const-string v0, "SNSTask"

    const-string v1, "notifyResult, response is null"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 441
    iget-object v0, p0, Lcom/huawei/health/sns/util/protocol/snsKit/SNSTask;->b:Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;

    invoke-virtual {v0}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;->createResponse()Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;

    move-result-object p1

    .line 442
    const v0, 0x14ff1

    iput v0, p1, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->responseCode:I

    .line 444
    :cond_0
    const-string v0, "SNSTask"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "ResponseBean, response is:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 445
    iget-object v0, p0, Lcom/huawei/health/sns/util/protocol/snsKit/SNSTask;->a:Lcom/huawei/health/sns/util/protocol/snsKit/bean/ISNSCallBack;

    iget-object v1, p0, Lcom/huawei/health/sns/util/protocol/snsKit/SNSTask;->b:Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;

    invoke-interface {v0, v1, p1}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ISNSCallBack;->notifyResult(Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;)V

    .line 447
    :cond_1
    return-void
.end method


# virtual methods
.method protected varargs a([Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;)Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;
    .locals 4

    .line 123
    const-string v0, "SNSTask"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "doInBackground, method:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-direct {p0}, Lcom/huawei/health/sns/util/protocol/snsKit/SNSTask;->d()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 124
    const/4 v3, 0x0

    .line 126
    iget-object v0, p0, Lcom/huawei/health/sns/util/protocol/snsKit/SNSTask;->b:Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/util/protocol/snsKit/SNSTask;->e(Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 128
    iget-object v0, p0, Lcom/huawei/health/sns/util/protocol/snsKit/SNSTask;->b:Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;

    invoke-virtual {v0}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;->createResponse()Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;

    move-result-object v3

    .line 129
    const/4 v0, 0x0

    iput v0, v3, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->responseCode:I

    .line 130
    const/4 v0, 0x0

    iput v0, v3, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->resultCode_:I

    goto :goto_0

    .line 135
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/health/sns/util/protocol/snsKit/SNSTask;->b()Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;

    move-result-object v3

    .line 137
    :goto_0
    return-object v3
.end method

.method protected a(Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;)V
    .locals 0

    .line 169
    return-void
.end method

.method public final b()Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;
    .locals 4

    .line 90
    invoke-virtual {p0}, Lcom/huawei/health/sns/util/protocol/snsKit/SNSTask;->e()Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;

    move-result-object v3

    .line 92
    iget v0, v3, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->responseCode:I

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    iget v0, v3, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->resultCode_:I

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 94
    const-string v0, "SNSTask"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "call sns server error response.resultCode_:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, v3, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->resultCode_:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 97
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/util/protocol/snsKit/SNSTask;->b:Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/util/protocol/snsKit/SNSTask;->d(Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 99
    invoke-virtual {p0, v3}, Lcom/huawei/health/sns/util/protocol/snsKit/SNSTask;->a(Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;)V

    .line 101
    :cond_1
    return-object v3
.end method

.method public final c()Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;
    .locals 2

    .line 112
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/health/sns/util/protocol/snsKit/SNSTask;->d:Z

    .line 113
    invoke-virtual {p0}, Lcom/huawei/health/sns/util/protocol/snsKit/SNSTask;->e()Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;

    move-result-object v1

    .line 114
    return-object v1
.end method

.method public c(Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;)V
    .locals 0

    .line 431
    return-void
.end method

.method public final c(Ljava/util/concurrent/Executor;)V
    .locals 3

    .line 79
    const/4 v0, 0x1

    new-array v0, v0, [Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;

    iget-object v1, p0, Lcom/huawei/health/sns/util/protocol/snsKit/SNSTask;->b:Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-virtual {p0, p1, v0}, Lcom/huawei/health/sns/util/protocol/snsKit/SNSTask;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 80
    return-void
.end method

.method protected d(Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;)V
    .locals 0

    .line 462
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/util/protocol/snsKit/SNSTask;->h(Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;)V

    .line 463
    return-void
.end method

.method protected d(Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;)Z
    .locals 1

    .line 159
    const/4 v0, 0x0

    return v0
.end method

.method protected synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 32
    move-object v0, p1

    check-cast v0, [Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/util/protocol/snsKit/SNSTask;->a([Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;)Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;

    move-result-object v0

    return-object v0
.end method

.method protected e()Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;
    .locals 9

    .line 173
    const-string v0, "SNSTask"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "[request] "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/health/sns/util/protocol/snsKit/SNSTask;->b:Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;

    invoke-virtual {v2}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;->getLog()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 176
    iget-object v0, p0, Lcom/huawei/health/sns/util/protocol/snsKit/SNSTask;->b:Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;

    invoke-virtual {v0}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;->createResponse()Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;

    move-result-object v4

    .line 179
    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v0

    invoke-virtual {v0}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/bpl;->d(Landroid/content/Context;)Z

    move-result v5

    .line 180
    if-nez v5, :cond_0

    .line 182
    const-string v0, "SNSTask"

    const-string v1, "no network, request failed."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 184
    const v0, 0x14ff4

    iput v0, v4, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->responseCode:I

    .line 185
    return-object v4

    .line 188
    :cond_0
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 189
    const-string v0, "SNSTask"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "OverSea cant not connect,return SNSHttpCode.ERROR"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 190
    const v0, 0x14ff1

    iput v0, v4, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->responseCode:I

    .line 191
    return-object v4

    .line 193
    :cond_1
    const/4 v6, 0x0

    .line 197
    :try_start_0
    iget-boolean v0, p0, Lcom/huawei/health/sns/util/protocol/snsKit/SNSTask;->d:Z

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/util/protocol/snsKit/SNSTask;->d(Z)Lo/bqg;

    move-result-object v0

    move-object v6, v0

    .line 198
    invoke-virtual {v6}, Lo/bqg;->d()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 200
    invoke-virtual {v6}, Lo/bqg;->a()Lo/bqi;

    move-result-object v0

    invoke-virtual {v0}, Lo/bqi;->d()[B

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/util/protocol/snsKit/SNSTask;->d([B)Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;

    move-result-object v0

    move-object v4, v0

    .line 202
    iget-object v0, p0, Lcom/huawei/health/sns/util/protocol/snsKit/SNSTask;->b:Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;

    invoke-static {v0, v4}, Lcom/huawei/health/sns/util/protocol/snsKit/SNSTask;->d(Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;)V

    goto :goto_0

    .line 207
    :cond_2
    iget-object v0, p0, Lcom/huawei/health/sns/util/protocol/snsKit/SNSTask;->b:Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;

    invoke-virtual {v6}, Lo/bqg;->b()Ljava/lang/String;

    move-result-object v1

    const v2, 0x14ffe

    invoke-static {v0, v2, v1}, Lcom/huawei/health/sns/util/protocol/snsKit/SNSTask;->d(Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;ILjava/lang/String;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 216
    :goto_0
    invoke-static {v6}, Lo/bpe;->d(Ljava/io/Closeable;)V

    .line 217
    goto :goto_1

    .line 210
    :catch_0
    move-exception v7

    .line 212
    const v0, 0x14ff8

    :try_start_1
    iput v0, v4, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->responseCode:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 216
    invoke-static {v6}, Lo/bpe;->d(Ljava/io/Closeable;)V

    .line 217
    goto :goto_1

    .line 216
    :catchall_0
    move-exception v8

    invoke-static {v6}, Lo/bpe;->d(Ljava/io/Closeable;)V

    .line 217
    throw v8

    .line 219
    :goto_1
    invoke-direct {p0, v4}, Lcom/huawei/health/sns/util/protocol/snsKit/SNSTask;->b(Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;)Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;

    move-result-object v4

    .line 221
    if-eqz v4, :cond_3

    invoke-virtual {v4}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->ok()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 224
    const-string v0, "SNSTask"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "[response] "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v4}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->getRespLog()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 227
    :cond_3
    return-object v4
.end method

.method public e(Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;)Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;
    .locals 0

    .line 421
    return-object p1
.end method

.method protected e(Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;)Z
    .locals 1

    .line 148
    const/4 v0, 0x0

    return v0
.end method

.method protected onCancelled()V
    .locals 0

    .line 453
    invoke-super {p0}, Landroid/os/AsyncTask;->onCancelled()V

    .line 454
    return-void
.end method

.method protected synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 1

    .line 32
    move-object v0, p1

    check-cast v0, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/util/protocol/snsKit/SNSTask;->d(Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;)V

    return-void
.end method
