.class public Lcom/huawei/updatesdk/sdk/service/storekit/b;
.super Landroid/os/AsyncTask;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/updatesdk/sdk/service/storekit/b$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask<Lcom/huawei/updatesdk/sdk/service/storekit/bean/RequestBean;Ljava/lang/Void;Lcom/huawei/updatesdk/sdk/service/storekit/bean/ResponseBean;>;"
    }
.end annotation


# instance fields
.field protected a:Lcom/huawei/updatesdk/sdk/service/storekit/bean/RequestBean;

.field protected b:Lcom/huawei/updatesdk/sdk/service/storekit/bean/ResponseBean;

.field protected c:Lcom/huawei/updatesdk/sdk/service/storekit/bean/a;

.field protected d:Lcom/huawei/updatesdk/sdk/service/storekit/b$a;

.field protected e:Lcom/huawei/updatesdk/sdk/a/a/a/b;

.field protected f:Z

.field protected g:Ljava/lang/String;

.field protected h:I


# direct methods
.method public constructor <init>(Lcom/huawei/updatesdk/sdk/service/storekit/bean/RequestBean;Lcom/huawei/updatesdk/sdk/service/storekit/bean/a;)V
    .locals 2

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/updatesdk/sdk/service/storekit/b;->a:Lcom/huawei/updatesdk/sdk/service/storekit/bean/RequestBean;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/updatesdk/sdk/service/storekit/b;->b:Lcom/huawei/updatesdk/sdk/service/storekit/bean/ResponseBean;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/updatesdk/sdk/service/storekit/b;->c:Lcom/huawei/updatesdk/sdk/service/storekit/bean/a;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/updatesdk/sdk/service/storekit/b;->e:Lcom/huawei/updatesdk/sdk/a/a/a/b;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/updatesdk/sdk/service/storekit/b;->f:Z

    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/updatesdk/sdk/service/storekit/b;->h:I

    iput-object p1, p0, Lcom/huawei/updatesdk/sdk/service/storekit/b;->a:Lcom/huawei/updatesdk/sdk/service/storekit/bean/RequestBean;

    iput-object p2, p0, Lcom/huawei/updatesdk/sdk/service/storekit/b;->c:Lcom/huawei/updatesdk/sdk/service/storekit/bean/a;

    invoke-virtual {p1}, Lcom/huawei/updatesdk/sdk/service/storekit/bean/RequestBean;->getSessionID()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/updatesdk/sdk/service/storekit/b;->g:Ljava/lang/String;

    if-eqz p2, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/huawei/updatesdk/sdk/service/storekit/b;->g:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p2}, Ljava/lang/Object;->hashCode()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/updatesdk/sdk/service/storekit/b;->g:Ljava/lang/String;

    :cond_0
    return-void
.end method

.method private a(Lcom/huawei/updatesdk/sdk/service/storekit/bean/ResponseBean;ILcom/huawei/updatesdk/sdk/service/storekit/bean/ResponseBean$a;)V
    .locals 0

    if-eqz p1, :cond_0

    invoke-virtual {p1, p2}, Lcom/huawei/updatesdk/sdk/service/storekit/bean/ResponseBean;->setResponseCode(I)V

    invoke-virtual {p1, p3}, Lcom/huawei/updatesdk/sdk/service/storekit/bean/ResponseBean;->setErrCause(Lcom/huawei/updatesdk/sdk/service/storekit/bean/ResponseBean$a;)V

    :cond_0
    return-void
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "StoreTask"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Store response error, method:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/updatesdk/sdk/service/storekit/b;->a:Lcom/huawei/updatesdk/sdk/service/storekit/bean/RequestBean;

    invoke-virtual {v2}, Lcom/huawei/updatesdk/sdk/service/storekit/bean/RequestBean;->getMethod_()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", url:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", body:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", resData == null"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/updatesdk/sdk/a/b/a/a/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    const-string v0, "StoreTask"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Store response error, method:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/updatesdk/sdk/service/storekit/b;->a:Lcom/huawei/updatesdk/sdk/service/storekit/bean/RequestBean;

    invoke-virtual {v2}, Lcom/huawei/updatesdk/sdk/service/storekit/bean/RequestBean;->getMethod_()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", url:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", body:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", resData is not json string"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/updatesdk/sdk/a/b/a/a/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method private a(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 4

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "invoke store error"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", exceptionType:"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", url:"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", method:"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/updatesdk/sdk/service/storekit/b;->a:Lcom/huawei/updatesdk/sdk/service/storekit/bean/RequestBean;

    invoke-virtual {v1}, Lcom/huawei/updatesdk/sdk/service/storekit/bean/RequestBean;->getMethod_()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", cacheID:"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/updatesdk/sdk/service/storekit/b;->g:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, ", retryTimes:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/updatesdk/sdk/service/storekit/b;->h:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const-string v0, "StoreTask"

    invoke-static {v0, v3, p2}, Lcom/huawei/updatesdk/sdk/a/b/a/a/a;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    const-string v0, "StoreTask"

    invoke-static {v0, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method private b(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/updatesdk/sdk/service/storekit/bean/ResponseBean;)Lcom/huawei/updatesdk/sdk/service/storekit/bean/ResponseBean;
    .locals 3

    :try_start_0
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2, p2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3, v2}, Lcom/huawei/updatesdk/sdk/service/storekit/bean/ResponseBean;->fromJson(Lorg/json/JSONObject;)V

    const/4 v0, 0x0

    invoke-virtual {p3, v0}, Lcom/huawei/updatesdk/sdk/service/storekit/bean/ResponseBean;->setResponseCode(I)V

    invoke-virtual {p0, p1, p2, p3}, Lcom/huawei/updatesdk/sdk/service/storekit/b;->a(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/updatesdk/sdk/service/storekit/bean/ResponseBean;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_3

    goto :goto_0

    :catch_0
    move-exception v2

    const-string v0, "StoreTask"

    const-string v1, "parse json error"

    invoke-static {v0, v1, v2}, Lcom/huawei/updatesdk/sdk/a/b/a/a/a;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    :catch_1
    move-exception v2

    const-string v0, "StoreTask"

    const-string v1, "parse json error"

    invoke-static {v0, v1, v2}, Lcom/huawei/updatesdk/sdk/a/b/a/a/a;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    :catch_2
    move-exception v2

    const-string v0, "StoreTask"

    const-string v1, "parse json error"

    invoke-static {v0, v1, v2}, Lcom/huawei/updatesdk/sdk/a/b/a/a/a;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    :catch_3
    move-exception v2

    const-string v0, "StoreTask"

    const-string v1, "parse json error"

    invoke-static {v0, v1, v2}, Lcom/huawei/updatesdk/sdk/a/b/a/a/a;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    return-object p3
.end method

.method private e(Lcom/huawei/updatesdk/sdk/service/storekit/bean/ResponseBean;)Z
    .locals 3

    invoke-virtual {p0}, Lcom/huawei/updatesdk/sdk/service/storekit/b;->isCancelled()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    invoke-virtual {p1}, Lcom/huawei/updatesdk/sdk/service/storekit/bean/ResponseBean;->getResponseCode()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    invoke-virtual {p1}, Lcom/huawei/updatesdk/sdk/service/storekit/bean/ResponseBean;->getResponseCode()I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    const/4 v0, 0x0

    return v0

    :cond_1
    iget v0, p0, Lcom/huawei/updatesdk/sdk/service/storekit/b;->h:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lcom/huawei/updatesdk/sdk/service/storekit/b;->h:I

    const/4 v1, 0x3

    if-lt v0, v1, :cond_2

    const-string v0, "StoreTask"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "retry completed total times = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lcom/huawei/updatesdk/sdk/service/storekit/b;->h:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ",response.responseCode = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Lcom/huawei/updatesdk/sdk/service/storekit/bean/ResponseBean;->getResponseCode()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/updatesdk/sdk/a/b/a/a/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/huawei/updatesdk/sdk/service/storekit/b;->a(Lcom/huawei/updatesdk/sdk/service/storekit/bean/ResponseBean;)Z

    move-result v0

    return v0

    :cond_2
    const-string v0, "StoreTask"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "retry times = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lcom/huawei/updatesdk/sdk/service/storekit/b;->h:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ",response.responseCode = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Lcom/huawei/updatesdk/sdk/service/storekit/bean/ResponseBean;->getResponseCode()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/updatesdk/sdk/a/b/a/a/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x1

    return v0
.end method


# virtual methods
.method public final a()Lcom/huawei/updatesdk/sdk/service/storekit/bean/ResponseBean;
    .locals 4

    const/4 v3, 0x0

    :cond_0
    iget v0, p0, Lcom/huawei/updatesdk/sdk/service/storekit/b;->h:I

    if-lez v0, :cond_1

    if-eqz v3, :cond_1

    const-string v0, "StoreTask"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "call store error! responseCode:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v3}, Lcom/huawei/updatesdk/sdk/service/storekit/bean/ResponseBean;->getResponseCode()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", retryTimes:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lcom/huawei/updatesdk/sdk/service/storekit/b;->h:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/updatesdk/sdk/a/b/a/a/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    invoke-virtual {p0}, Lcom/huawei/updatesdk/sdk/service/storekit/b;->b()Lcom/huawei/updatesdk/sdk/service/storekit/bean/ResponseBean;

    move-result-object v3

    invoke-virtual {p0, v3}, Lcom/huawei/updatesdk/sdk/service/storekit/b;->b(Lcom/huawei/updatesdk/sdk/service/storekit/bean/ResponseBean;)V

    invoke-direct {p0, v3}, Lcom/huawei/updatesdk/sdk/service/storekit/b;->e(Lcom/huawei/updatesdk/sdk/service/storekit/bean/ResponseBean;)Z

    move-result v0

    if-nez v0, :cond_0

    iput-object v3, p0, Lcom/huawei/updatesdk/sdk/service/storekit/b;->b:Lcom/huawei/updatesdk/sdk/service/storekit/bean/ResponseBean;

    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/storekit/b;->b:Lcom/huawei/updatesdk/sdk/service/storekit/bean/ResponseBean;

    return-object v0
.end method

.method protected varargs a([Lcom/huawei/updatesdk/sdk/service/storekit/bean/RequestBean;)Lcom/huawei/updatesdk/sdk/service/storekit/bean/ResponseBean;
    .locals 5

    const-string v0, "StoreTask"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "doInBackground, method:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/updatesdk/sdk/service/storekit/b;->a:Lcom/huawei/updatesdk/sdk/service/storekit/bean/RequestBean;

    invoke-virtual {v2}, Lcom/huawei/updatesdk/sdk/service/storekit/bean/RequestBean;->getMethod_()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", requestType:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/updatesdk/sdk/service/storekit/b;->a:Lcom/huawei/updatesdk/sdk/service/storekit/bean/RequestBean;

    invoke-virtual {v2}, Lcom/huawei/updatesdk/sdk/service/storekit/bean/RequestBean;->getRequestType()Lcom/huawei/updatesdk/sdk/service/storekit/bean/RequestBean$b;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", cacheID:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/updatesdk/sdk/service/storekit/b;->g:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/updatesdk/sdk/a/b/a/a/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v3, 0x0

    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/storekit/b;->a:Lcom/huawei/updatesdk/sdk/service/storekit/bean/RequestBean;

    invoke-virtual {v0}, Lcom/huawei/updatesdk/sdk/service/storekit/bean/RequestBean;->getRequestType()Lcom/huawei/updatesdk/sdk/service/storekit/bean/RequestBean$b;

    move-result-object v0

    sget-object v1, Lcom/huawei/updatesdk/sdk/service/storekit/bean/RequestBean$b;->b:Lcom/huawei/updatesdk/sdk/service/storekit/bean/RequestBean$b;

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/storekit/b;->a:Lcom/huawei/updatesdk/sdk/service/storekit/bean/RequestBean;

    invoke-virtual {v0}, Lcom/huawei/updatesdk/sdk/service/storekit/bean/RequestBean;->getRequestType()Lcom/huawei/updatesdk/sdk/service/storekit/bean/RequestBean$b;

    move-result-object v0

    sget-object v1, Lcom/huawei/updatesdk/sdk/service/storekit/bean/RequestBean$b;->a:Lcom/huawei/updatesdk/sdk/service/storekit/bean/RequestBean$b;

    if-ne v0, v1, :cond_2

    :cond_0
    iget-boolean v0, p0, Lcom/huawei/updatesdk/sdk/service/storekit/b;->f:Z

    if-nez v0, :cond_2

    invoke-static {}, Lcom/huawei/updatesdk/sdk/a/c/b/a;->f()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/storekit/b;->a:Lcom/huawei/updatesdk/sdk/service/storekit/bean/RequestBean;

    invoke-virtual {v0}, Lcom/huawei/updatesdk/sdk/service/storekit/bean/RequestBean;->getRequestType()Lcom/huawei/updatesdk/sdk/service/storekit/bean/RequestBean$b;

    move-result-object v0

    sget-object v1, Lcom/huawei/updatesdk/sdk/service/storekit/bean/RequestBean$b;->b:Lcom/huawei/updatesdk/sdk/service/storekit/bean/RequestBean$b;

    if-ne v0, v1, :cond_2

    :try_start_0
    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/storekit/b;->a:Lcom/huawei/updatesdk/sdk/service/storekit/bean/RequestBean;

    invoke-virtual {v0}, Lcom/huawei/updatesdk/sdk/service/storekit/bean/RequestBean;->getMethod_()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/updatesdk/sdk/service/storekit/a;->a(Ljava/lang/String;)Lcom/huawei/updatesdk/sdk/service/storekit/bean/ResponseBean;
    :try_end_0
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v0

    move-object v3, v0

    goto :goto_0

    :catch_0
    move-exception v4

    const-string v0, "StoreTask"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "createResponseBean error, method:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/updatesdk/sdk/service/storekit/b;->a:Lcom/huawei/updatesdk/sdk/service/storekit/bean/RequestBean;

    invoke-virtual {v2}, Lcom/huawei/updatesdk/sdk/service/storekit/bean/RequestBean;->getMethod_()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", cacheID:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/updatesdk/sdk/service/storekit/b;->g:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", retryTimes:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lcom/huawei/updatesdk/sdk/service/storekit/b;->h:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, v4}, Lcom/huawei/updatesdk/sdk/a/b/a/a/a;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    :catch_1
    move-exception v4

    const-string v0, "StoreTask"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "createResponseBean error, method:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/updatesdk/sdk/service/storekit/b;->a:Lcom/huawei/updatesdk/sdk/service/storekit/bean/RequestBean;

    invoke-virtual {v2}, Lcom/huawei/updatesdk/sdk/service/storekit/bean/RequestBean;->getMethod_()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", cacheID:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/updatesdk/sdk/service/storekit/b;->g:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", retryTimes:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lcom/huawei/updatesdk/sdk/service/storekit/b;->h:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, v4}, Lcom/huawei/updatesdk/sdk/a/b/a/a/a;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    if-nez v3, :cond_1

    new-instance v3, Lcom/huawei/updatesdk/sdk/service/storekit/bean/ResponseBean;

    invoke-direct {v3}, Lcom/huawei/updatesdk/sdk/service/storekit/bean/ResponseBean;-><init>()V

    :cond_1
    const/4 v0, 0x3

    invoke-virtual {v3, v0}, Lcom/huawei/updatesdk/sdk/service/storekit/bean/ResponseBean;->setResponseCode(I)V

    sget-object v0, Lcom/huawei/updatesdk/sdk/service/storekit/bean/ResponseBean$a;->b:Lcom/huawei/updatesdk/sdk/service/storekit/bean/ResponseBean$a;

    invoke-virtual {v3, v0}, Lcom/huawei/updatesdk/sdk/service/storekit/bean/ResponseBean;->setErrCause(Lcom/huawei/updatesdk/sdk/service/storekit/bean/ResponseBean$a;)V

    iput-object v3, p0, Lcom/huawei/updatesdk/sdk/service/storekit/b;->b:Lcom/huawei/updatesdk/sdk/service/storekit/bean/ResponseBean;

    return-object v3

    :cond_2
    invoke-virtual {p0}, Lcom/huawei/updatesdk/sdk/service/storekit/b;->a()Lcom/huawei/updatesdk/sdk/service/storekit/bean/ResponseBean;

    move-result-object v3

    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/storekit/b;->c:Lcom/huawei/updatesdk/sdk/service/storekit/bean/a;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/storekit/b;->c:Lcom/huawei/updatesdk/sdk/service/storekit/bean/a;

    iget-object v1, p0, Lcom/huawei/updatesdk/sdk/service/storekit/b;->a:Lcom/huawei/updatesdk/sdk/service/storekit/bean/RequestBean;

    invoke-interface {v0, v1, v3}, Lcom/huawei/updatesdk/sdk/service/storekit/bean/a;->a(Lcom/huawei/updatesdk/sdk/service/storekit/bean/RequestBean;Lcom/huawei/updatesdk/sdk/service/storekit/bean/ResponseBean;)V

    :cond_3
    return-object v3
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/updatesdk/sdk/service/storekit/bean/ResponseBean;)V
    .locals 0

    return-void
.end method

.method public final a(Ljava/util/concurrent/Executor;)V
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Lcom/huawei/updatesdk/sdk/service/storekit/bean/RequestBean;

    iget-object v1, p0, Lcom/huawei/updatesdk/sdk/service/storekit/b;->a:Lcom/huawei/updatesdk/sdk/service/storekit/bean/RequestBean;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-virtual {p0, p1, v0}, Lcom/huawei/updatesdk/sdk/service/storekit/b;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    return-void
.end method

.method protected a(Lcom/huawei/updatesdk/sdk/service/storekit/bean/ResponseBean;)Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public b()Lcom/huawei/updatesdk/sdk/service/storekit/bean/ResponseBean;
    .locals 10

    const/4 v3, 0x0

    const/4 v4, 0x0

    :try_start_0
    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/storekit/b;->a:Lcom/huawei/updatesdk/sdk/service/storekit/bean/RequestBean;

    invoke-virtual {v0}, Lcom/huawei/updatesdk/sdk/service/storekit/bean/RequestBean;->getMethod_()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/updatesdk/sdk/service/storekit/a;->a(Ljava/lang/String;)Lcom/huawei/updatesdk/sdk/service/storekit/bean/ResponseBean;

    move-result-object v0

    move-object v3, v0

    invoke-static {}, Lcom/huawei/updatesdk/sdk/a/c/b/a;->f()Z

    move-result v5

    if-nez v5, :cond_0

    const/4 v0, 0x3

    invoke-virtual {v3, v0}, Lcom/huawei/updatesdk/sdk/service/storekit/bean/ResponseBean;->setResponseCode(I)V

    sget-object v0, Lcom/huawei/updatesdk/sdk/service/storekit/bean/ResponseBean$a;->b:Lcom/huawei/updatesdk/sdk/service/storekit/bean/ResponseBean$a;

    invoke-virtual {v3, v0}, Lcom/huawei/updatesdk/sdk/service/storekit/bean/ResponseBean;->setErrCause(Lcom/huawei/updatesdk/sdk/service/storekit/bean/ResponseBean$a;)V

    goto/16 :goto_1

    :cond_0
    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/storekit/b;->a:Lcom/huawei/updatesdk/sdk/service/storekit/bean/RequestBean;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/updatesdk/sdk/service/storekit/bean/RequestBean;->genBody(Z)Ljava/lang/String;

    move-result-object v6

    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/storekit/b;->a:Lcom/huawei/updatesdk/sdk/service/storekit/bean/RequestBean;

    invoke-virtual {v0}, Lcom/huawei/updatesdk/sdk/service/storekit/bean/RequestBean;->getReqUrl()Ljava/lang/String;

    move-result-object v0

    move-object v4, v0

    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/storekit/b;->a:Lcom/huawei/updatesdk/sdk/service/storekit/bean/RequestBean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/huawei/updatesdk/sdk/service/storekit/bean/RequestBean;->genBody(Z)Ljava/lang/String;

    move-result-object v7

    const-string v0, "StoreTask"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "callStore, method:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/updatesdk/sdk/service/storekit/b;->a:Lcom/huawei/updatesdk/sdk/service/storekit/bean/RequestBean;

    invoke-virtual {v2}, Lcom/huawei/updatesdk/sdk/service/storekit/bean/RequestBean;->getMethod_()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", url:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", body:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/updatesdk/sdk/a/b/a/a/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v8, 0x0

    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/storekit/b;->a:Lcom/huawei/updatesdk/sdk/service/storekit/bean/RequestBean;

    invoke-virtual {v0}, Lcom/huawei/updatesdk/sdk/service/storekit/bean/RequestBean;->getReqContentType()Lcom/huawei/updatesdk/sdk/service/storekit/bean/RequestBean$a;

    move-result-object v0

    sget-object v1, Lcom/huawei/updatesdk/sdk/service/storekit/bean/RequestBean$a;->a:Lcom/huawei/updatesdk/sdk/service/storekit/bean/RequestBean$a;

    if-ne v0, v1, :cond_2

    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/storekit/b;->a:Lcom/huawei/updatesdk/sdk/service/storekit/bean/RequestBean;

    invoke-virtual {v0}, Lcom/huawei/updatesdk/sdk/service/storekit/bean/RequestBean;->getFileParamName()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/storekit/b;->a:Lcom/huawei/updatesdk/sdk/service/storekit/bean/RequestBean;

    invoke-virtual {v0}, Lcom/huawei/updatesdk/sdk/service/storekit/bean/RequestBean;->getFile()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/storekit/b;->a:Lcom/huawei/updatesdk/sdk/service/storekit/bean/RequestBean;

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    invoke-virtual {v0, v1}, Lcom/huawei/updatesdk/sdk/service/storekit/bean/RequestBean;->setFileMap(Ljava/util/Map;)V

    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/storekit/b;->a:Lcom/huawei/updatesdk/sdk/service/storekit/bean/RequestBean;

    invoke-virtual {v0}, Lcom/huawei/updatesdk/sdk/service/storekit/bean/RequestBean;->getFileMap()Ljava/util/Map;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/updatesdk/sdk/service/storekit/b;->a:Lcom/huawei/updatesdk/sdk/service/storekit/bean/RequestBean;

    invoke-virtual {v1}, Lcom/huawei/updatesdk/sdk/service/storekit/bean/RequestBean;->getFileParamName()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/updatesdk/sdk/service/storekit/b;->a:Lcom/huawei/updatesdk/sdk/service/storekit/bean/RequestBean;

    invoke-virtual {v2}, Lcom/huawei/updatesdk/sdk/service/storekit/bean/RequestBean;->getFile()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    new-instance v0, Lcom/huawei/updatesdk/sdk/a/a/a/b;

    invoke-direct {v0}, Lcom/huawei/updatesdk/sdk/a/a/a/b;-><init>()V

    iput-object v0, p0, Lcom/huawei/updatesdk/sdk/service/storekit/b;->e:Lcom/huawei/updatesdk/sdk/a/a/a/b;

    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/storekit/b;->e:Lcom/huawei/updatesdk/sdk/a/a/a/b;

    iget-object v1, p0, Lcom/huawei/updatesdk/sdk/service/storekit/b;->a:Lcom/huawei/updatesdk/sdk/service/storekit/bean/RequestBean;

    invoke-virtual {v1}, Lcom/huawei/updatesdk/sdk/service/storekit/bean/RequestBean;->getFileMap()Ljava/util/Map;

    move-result-object v1

    invoke-virtual {p0}, Lcom/huawei/updatesdk/sdk/service/storekit/b;->d()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v4, v6, v1, v2}, Lcom/huawei/updatesdk/sdk/a/a/a/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)Lcom/huawei/updatesdk/sdk/a/a/a/b$a;

    move-result-object v8

    goto :goto_0

    :cond_2
    new-instance v0, Lcom/huawei/updatesdk/sdk/a/a/a/b;

    invoke-direct {v0}, Lcom/huawei/updatesdk/sdk/a/a/a/b;-><init>()V

    iput-object v0, p0, Lcom/huawei/updatesdk/sdk/service/storekit/b;->e:Lcom/huawei/updatesdk/sdk/a/a/a/b;

    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/storekit/b;->e:Lcom/huawei/updatesdk/sdk/a/a/a/b;

    const-string v1, "UTF-8"

    invoke-virtual {p0}, Lcom/huawei/updatesdk/sdk/service/storekit/b;->d()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v4, v6, v1, v2}, Lcom/huawei/updatesdk/sdk/a/a/a/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/huawei/updatesdk/sdk/a/a/a/b$a;

    move-result-object v8

    :goto_0
    invoke-virtual {v8}, Lcom/huawei/updatesdk/sdk/a/a/a/b$a;->a()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    invoke-static {v9}, Lcom/huawei/updatesdk/sdk/a/c/f;->e(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_4

    :cond_3
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Lcom/huawei/updatesdk/sdk/service/storekit/bean/ResponseBean;->setResponseCode(I)V

    sget-object v0, Lcom/huawei/updatesdk/sdk/service/storekit/bean/ResponseBean$a;->c:Lcom/huawei/updatesdk/sdk/service/storekit/bean/ResponseBean$a;

    invoke-virtual {v3, v0}, Lcom/huawei/updatesdk/sdk/service/storekit/bean/ResponseBean;->setErrCause(Lcom/huawei/updatesdk/sdk/service/storekit/bean/ResponseBean$a;)V

    invoke-direct {p0, v9, v7, v4}, Lcom/huawei/updatesdk/sdk/service/storekit/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0, v6, v9}, Lcom/huawei/updatesdk/sdk/service/storekit/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :cond_4
    invoke-direct {p0, v6, v9, v3}, Lcom/huawei/updatesdk/sdk/service/storekit/b;->b(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/updatesdk/sdk/service/storekit/bean/ResponseBean;)Lcom/huawei/updatesdk/sdk/service/storekit/bean/ResponseBean;

    move-result-object v0

    move-object v3, v0

    const-string v0, "StoreTask"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "callStore response, method:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/updatesdk/sdk/service/storekit/b;->a:Lcom/huawei/updatesdk/sdk/service/storekit/bean/RequestBean;

    invoke-virtual {v2}, Lcom/huawei/updatesdk/sdk/service/storekit/bean/RequestBean;->getMethod_()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", url:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", body:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", Receive Json msg:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v3}, Lcom/huawei/updatesdk/sdk/service/storekit/bean/ResponseBean;->getSafeData()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/updatesdk/sdk/a/b/a/a/a;->a(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/net/ConnectException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/net/SocketTimeoutException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lorg/apache/http/conn/ConnectTimeoutException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_5
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_6
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_7

    :goto_1
    goto/16 :goto_2

    :catch_0
    move-exception v5

    sget-object v0, Lcom/huawei/updatesdk/sdk/service/storekit/bean/ResponseBean$a;->f:Lcom/huawei/updatesdk/sdk/service/storekit/bean/ResponseBean$a;

    const/4 v1, 0x1

    invoke-direct {p0, v3, v1, v0}, Lcom/huawei/updatesdk/sdk/service/storekit/b;->a(Lcom/huawei/updatesdk/sdk/service/storekit/bean/ResponseBean;ILcom/huawei/updatesdk/sdk/service/storekit/bean/ResponseBean$a;)V

    invoke-direct {p0, v4, v5}, Lcom/huawei/updatesdk/sdk/service/storekit/b;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_2

    :catch_1
    move-exception v5

    sget-object v0, Lcom/huawei/updatesdk/sdk/service/storekit/bean/ResponseBean$a;->f:Lcom/huawei/updatesdk/sdk/service/storekit/bean/ResponseBean$a;

    const/4 v1, 0x2

    invoke-direct {p0, v3, v1, v0}, Lcom/huawei/updatesdk/sdk/service/storekit/b;->a(Lcom/huawei/updatesdk/sdk/service/storekit/bean/ResponseBean;ILcom/huawei/updatesdk/sdk/service/storekit/bean/ResponseBean$a;)V

    invoke-direct {p0, v4, v5}, Lcom/huawei/updatesdk/sdk/service/storekit/b;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_2

    :catch_2
    move-exception v5

    sget-object v0, Lcom/huawei/updatesdk/sdk/service/storekit/bean/ResponseBean$a;->f:Lcom/huawei/updatesdk/sdk/service/storekit/bean/ResponseBean$a;

    const/4 v1, 0x2

    invoke-direct {p0, v3, v1, v0}, Lcom/huawei/updatesdk/sdk/service/storekit/b;->a(Lcom/huawei/updatesdk/sdk/service/storekit/bean/ResponseBean;ILcom/huawei/updatesdk/sdk/service/storekit/bean/ResponseBean$a;)V

    invoke-direct {p0, v4, v5}, Lcom/huawei/updatesdk/sdk/service/storekit/b;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_2

    :catch_3
    move-exception v5

    sget-object v0, Lcom/huawei/updatesdk/sdk/service/storekit/bean/ResponseBean$a;->e:Lcom/huawei/updatesdk/sdk/service/storekit/bean/ResponseBean$a;

    const/4 v1, 0x1

    invoke-direct {p0, v3, v1, v0}, Lcom/huawei/updatesdk/sdk/service/storekit/b;->a(Lcom/huawei/updatesdk/sdk/service/storekit/bean/ResponseBean;ILcom/huawei/updatesdk/sdk/service/storekit/bean/ResponseBean$a;)V

    invoke-direct {p0, v4, v5}, Lcom/huawei/updatesdk/sdk/service/storekit/b;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_2

    :catch_4
    move-exception v5

    sget-object v0, Lcom/huawei/updatesdk/sdk/service/storekit/bean/ResponseBean$a;->d:Lcom/huawei/updatesdk/sdk/service/storekit/bean/ResponseBean$a;

    const/4 v1, 0x5

    invoke-direct {p0, v3, v1, v0}, Lcom/huawei/updatesdk/sdk/service/storekit/b;->a(Lcom/huawei/updatesdk/sdk/service/storekit/bean/ResponseBean;ILcom/huawei/updatesdk/sdk/service/storekit/bean/ResponseBean$a;)V

    invoke-direct {p0, v4, v5}, Lcom/huawei/updatesdk/sdk/service/storekit/b;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_2

    :catch_5
    move-exception v5

    sget-object v0, Lcom/huawei/updatesdk/sdk/service/storekit/bean/ResponseBean$a;->g:Lcom/huawei/updatesdk/sdk/service/storekit/bean/ResponseBean$a;

    const/4 v1, 0x1

    invoke-direct {p0, v3, v1, v0}, Lcom/huawei/updatesdk/sdk/service/storekit/b;->a(Lcom/huawei/updatesdk/sdk/service/storekit/bean/ResponseBean;ILcom/huawei/updatesdk/sdk/service/storekit/bean/ResponseBean$a;)V

    invoke-direct {p0, v4, v5}, Lcom/huawei/updatesdk/sdk/service/storekit/b;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_2

    :catch_6
    move-exception v5

    sget-object v0, Lcom/huawei/updatesdk/sdk/service/storekit/bean/ResponseBean$a;->h:Lcom/huawei/updatesdk/sdk/service/storekit/bean/ResponseBean$a;

    const/4 v1, 0x6

    invoke-direct {p0, v3, v1, v0}, Lcom/huawei/updatesdk/sdk/service/storekit/b;->a(Lcom/huawei/updatesdk/sdk/service/storekit/bean/ResponseBean;ILcom/huawei/updatesdk/sdk/service/storekit/bean/ResponseBean$a;)V

    goto :goto_2

    :catch_7
    move-exception v5

    invoke-direct {p0, v4, v5}, Lcom/huawei/updatesdk/sdk/service/storekit/b;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_2
    if-nez v3, :cond_5

    new-instance v3, Lcom/huawei/updatesdk/sdk/service/storekit/bean/ResponseBean;

    invoke-direct {v3}, Lcom/huawei/updatesdk/sdk/service/storekit/bean/ResponseBean;-><init>()V

    const/4 v0, 0x5

    invoke-virtual {v3, v0}, Lcom/huawei/updatesdk/sdk/service/storekit/bean/ResponseBean;->setResponseCode(I)V

    sget-object v0, Lcom/huawei/updatesdk/sdk/service/storekit/bean/ResponseBean$a;->d:Lcom/huawei/updatesdk/sdk/service/storekit/bean/ResponseBean$a;

    invoke-virtual {v3, v0}, Lcom/huawei/updatesdk/sdk/service/storekit/bean/ResponseBean;->setErrCause(Lcom/huawei/updatesdk/sdk/service/storekit/bean/ResponseBean$a;)V

    :cond_5
    return-object v3
.end method

.method public b(Lcom/huawei/updatesdk/sdk/service/storekit/bean/ResponseBean;)V
    .locals 0

    return-void
.end method

.method public c()V
    .locals 1

    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/storekit/b;->b:Lcom/huawei/updatesdk/sdk/service/storekit/bean/ResponseBean;

    invoke-virtual {p0, v0}, Lcom/huawei/updatesdk/sdk/service/storekit/b;->c(Lcom/huawei/updatesdk/sdk/service/storekit/bean/ResponseBean;)V

    return-void
.end method

.method protected c(Lcom/huawei/updatesdk/sdk/service/storekit/bean/ResponseBean;)V
    .locals 4

    invoke-virtual {p0}, Lcom/huawei/updatesdk/sdk/service/storekit/b;->isCancelled()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/storekit/b;->c:Lcom/huawei/updatesdk/sdk/service/storekit/bean/a;

    if-eqz v0, :cond_2

    if-nez p1, :cond_1

    const-string v0, "StoreTask"

    const-string v1, "notifyResult, response is null"

    invoke-static {v0, v1}, Lcom/huawei/updatesdk/sdk/a/b/a/a/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    :try_start_0
    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/storekit/b;->a:Lcom/huawei/updatesdk/sdk/service/storekit/bean/RequestBean;

    invoke-virtual {v0}, Lcom/huawei/updatesdk/sdk/service/storekit/bean/RequestBean;->getMethod_()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/updatesdk/sdk/service/storekit/a;->a(Ljava/lang/String;)Lcom/huawei/updatesdk/sdk/service/storekit/bean/ResponseBean;
    :try_end_0
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v0

    move-object p1, v0

    goto :goto_0

    :catch_0
    move-exception v3

    const-string v0, "StoreTask"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "notifyResult, create response error, method:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/updatesdk/sdk/service/storekit/b;->a:Lcom/huawei/updatesdk/sdk/service/storekit/bean/RequestBean;

    invoke-virtual {v2}, Lcom/huawei/updatesdk/sdk/service/storekit/bean/RequestBean;->getMethod_()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, v3}, Lcom/huawei/updatesdk/sdk/a/b/a/a/a;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    :catch_1
    move-exception v3

    const-string v0, "StoreTask"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "notifyResult, create response error, method:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/updatesdk/sdk/service/storekit/b;->a:Lcom/huawei/updatesdk/sdk/service/storekit/bean/RequestBean;

    invoke-virtual {v2}, Lcom/huawei/updatesdk/sdk/service/storekit/bean/RequestBean;->getMethod_()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, v3}, Lcom/huawei/updatesdk/sdk/a/b/a/a/a;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    if-nez p1, :cond_0

    new-instance p1, Lcom/huawei/updatesdk/sdk/service/storekit/bean/ResponseBean;

    invoke-direct {p1}, Lcom/huawei/updatesdk/sdk/service/storekit/bean/ResponseBean;-><init>()V

    sget-object v0, Lcom/huawei/updatesdk/sdk/service/storekit/bean/ResponseBean$a;->d:Lcom/huawei/updatesdk/sdk/service/storekit/bean/ResponseBean$a;

    invoke-virtual {p1, v0}, Lcom/huawei/updatesdk/sdk/service/storekit/bean/ResponseBean;->setErrCause(Lcom/huawei/updatesdk/sdk/service/storekit/bean/ResponseBean$a;)V

    goto :goto_1

    :cond_0
    sget-object v0, Lcom/huawei/updatesdk/sdk/service/storekit/bean/ResponseBean$a;->g:Lcom/huawei/updatesdk/sdk/service/storekit/bean/ResponseBean$a;

    invoke-virtual {p1, v0}, Lcom/huawei/updatesdk/sdk/service/storekit/bean/ResponseBean;->setErrCause(Lcom/huawei/updatesdk/sdk/service/storekit/bean/ResponseBean$a;)V

    :goto_1
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/huawei/updatesdk/sdk/service/storekit/bean/ResponseBean;->setResponseCode(I)V

    :cond_1
    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/storekit/b;->c:Lcom/huawei/updatesdk/sdk/service/storekit/bean/a;

    iget-object v1, p0, Lcom/huawei/updatesdk/sdk/service/storekit/b;->a:Lcom/huawei/updatesdk/sdk/service/storekit/bean/RequestBean;

    invoke-interface {v0, v1, p1}, Lcom/huawei/updatesdk/sdk/service/storekit/bean/a;->b(Lcom/huawei/updatesdk/sdk/service/storekit/bean/RequestBean;Lcom/huawei/updatesdk/sdk/service/storekit/bean/ResponseBean;)V

    :cond_2
    return-void
.end method

.method protected d()Ljava/lang/String;
    .locals 1

    const-string v0, "Android/1.0"

    return-object v0
.end method

.method protected d(Lcom/huawei/updatesdk/sdk/service/storekit/bean/ResponseBean;)V
    .locals 3

    const-string v0, "StoreTask"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onPostExecute, method:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/updatesdk/sdk/service/storekit/b;->a:Lcom/huawei/updatesdk/sdk/service/storekit/bean/RequestBean;

    invoke-virtual {v2}, Lcom/huawei/updatesdk/sdk/service/storekit/bean/RequestBean;->getMethod_()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", requestType:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/updatesdk/sdk/service/storekit/b;->a:Lcom/huawei/updatesdk/sdk/service/storekit/bean/RequestBean;

    invoke-virtual {v2}, Lcom/huawei/updatesdk/sdk/service/storekit/bean/RequestBean;->getRequestType()Lcom/huawei/updatesdk/sdk/service/storekit/bean/RequestBean$b;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", cacheID:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/updatesdk/sdk/service/storekit/b;->g:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/updatesdk/sdk/a/b/a/a/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/storekit/b;->d:Lcom/huawei/updatesdk/sdk/service/storekit/b$a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/storekit/b;->d:Lcom/huawei/updatesdk/sdk/service/storekit/b$a;

    invoke-interface {v0, p0}, Lcom/huawei/updatesdk/sdk/service/storekit/b$a;->b(Lcom/huawei/updatesdk/sdk/service/storekit/b;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/huawei/updatesdk/sdk/service/storekit/b;->c()V

    :goto_0
    return-void
.end method

.method protected synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    move-object v0, p1

    check-cast v0, [Lcom/huawei/updatesdk/sdk/service/storekit/bean/RequestBean;

    invoke-virtual {p0, v0}, Lcom/huawei/updatesdk/sdk/service/storekit/b;->a([Lcom/huawei/updatesdk/sdk/service/storekit/bean/RequestBean;)Lcom/huawei/updatesdk/sdk/service/storekit/bean/ResponseBean;

    move-result-object v0

    return-object v0
.end method

.method protected onCancelled()V
    .locals 1

    invoke-super {p0}, Landroid/os/AsyncTask;->onCancelled()V

    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/storekit/b;->d:Lcom/huawei/updatesdk/sdk/service/storekit/b$a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/updatesdk/sdk/service/storekit/b;->d:Lcom/huawei/updatesdk/sdk/service/storekit/b$a;

    invoke-interface {v0, p0}, Lcom/huawei/updatesdk/sdk/service/storekit/b$a;->a(Lcom/huawei/updatesdk/sdk/service/storekit/b;)V

    :cond_0
    return-void
.end method

.method protected synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 1

    move-object v0, p1

    check-cast v0, Lcom/huawei/updatesdk/sdk/service/storekit/bean/ResponseBean;

    invoke-virtual {p0, v0}, Lcom/huawei/updatesdk/sdk/service/storekit/b;->d(Lcom/huawei/updatesdk/sdk/service/storekit/bean/ResponseBean;)V

    return-void
.end method
