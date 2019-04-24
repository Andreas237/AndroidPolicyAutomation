.class public Lcom/huawei/updatesdk/service/b/a/c;
.super Lcom/huawei/updatesdk/sdk/service/storekit/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/updatesdk/service/b/a/c$a;
    }
.end annotation


# instance fields
.field private i:I


# direct methods
.method public constructor <init>(Lcom/huawei/updatesdk/sdk/service/storekit/bean/RequestBean;Lcom/huawei/updatesdk/sdk/service/storekit/bean/a;)V
    .locals 1

    invoke-direct {p0, p1, p2}, Lcom/huawei/updatesdk/sdk/service/storekit/b;-><init>(Lcom/huawei/updatesdk/sdk/service/storekit/bean/RequestBean;Lcom/huawei/updatesdk/sdk/service/storekit/bean/a;)V

    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/updatesdk/service/b/a/c;->i:I

    return-void
.end method

.method static synthetic a(Lcom/huawei/updatesdk/service/b/a/c;)Lcom/huawei/updatesdk/sdk/service/storekit/bean/ResponseBean;
    .locals 1

    invoke-virtual {p0}, Lcom/huawei/updatesdk/service/b/a/c;->b()Lcom/huawei/updatesdk/sdk/service/storekit/bean/ResponseBean;

    move-result-object v0

    return-object v0
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/InvalidKeyException;,
            Ljava/security/NoSuchAlgorithmException;,
            Ljava/io/UnsupportedEncodingException;
        }
    .end annotation

    const/4 v2, 0x0

    invoke-static {p1, p2}, Lcom/huawei/updatesdk/service/b/a/c;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "utf-8"

    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v0

    const-string v1, "utf-8"

    invoke-virtual {p0, v1}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/updatesdk/sdk/a/c/a/a;->a([B[B)[B

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/updatesdk/sdk/a/c/a;->a([B)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v2, 0x1

    :cond_0
    return v2
.end method

.method private static b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, ",\"rspKey\":\""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, ""

    invoke-virtual {p0, v2, v0}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "\"rspKey\":\""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\","

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, ""

    invoke-virtual {p0, v2, v0}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_1
    return-object p0
.end method

.method private e()V
    .locals 3

    iget-object v0, p0, Lcom/huawei/updatesdk/service/b/a/c;->a:Lcom/huawei/updatesdk/sdk/service/storekit/bean/RequestBean;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/updatesdk/service/b/a/c;->a:Lcom/huawei/updatesdk/sdk/service/storekit/bean/RequestBean;

    instance-of v0, v0, Lcom/huawei/updatesdk/framework/bean/StoreRequestBean;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/updatesdk/service/b/a/c;->a:Lcom/huawei/updatesdk/sdk/service/storekit/bean/RequestBean;

    move-object v2, v0

    check-cast v2, Lcom/huawei/updatesdk/framework/bean/StoreRequestBean;

    invoke-virtual {v2}, Lcom/huawei/updatesdk/framework/bean/StoreRequestBean;->isNeedSign()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "StoreTaskEx"

    const-string v1, "checkSign failed! recall front and set sign and hcrid again"

    invoke-static {v0, v1}, Lcom/huawei/updatesdk/sdk/a/b/a/a/a;->c(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Lcom/huawei/updatesdk/service/a/b;->a()Lcom/huawei/updatesdk/service/a/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/updatesdk/service/a/b;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/updatesdk/framework/bean/StoreRequestBean;->setSign(Ljava/lang/String;)V

    invoke-static {}, Lcom/huawei/updatesdk/service/a/b;->a()Lcom/huawei/updatesdk/service/a/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/updatesdk/service/a/b;->d()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/updatesdk/framework/bean/StoreRequestBean;->setHcrId(Ljava/lang/String;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    const-string v0, "StoreTaskEx"

    const-string v1, "onResponseInvaild requestBody"

    invoke-static {v0, v1}, Lcom/huawei/updatesdk/sdk/a/b/a/a/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/updatesdk/sdk/service/storekit/bean/ResponseBean;)V
    .locals 8

    invoke-virtual {p3}, Lcom/huawei/updatesdk/sdk/service/storekit/bean/ResponseBean;->getResponseCode()I

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p3}, Lcom/huawei/updatesdk/sdk/service/storekit/bean/ResponseBean;->getRtnCode_()I

    move-result v0

    invoke-static {v0}, Lcom/huawei/updatesdk/service/b/a/c$a;->a(I)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v3, 0x0

    :goto_0
    if-eqz v3, :cond_2

    return-void

    :cond_2
    :try_start_0
    iget-object v0, p0, Lcom/huawei/updatesdk/service/b/a/c;->a:Lcom/huawei/updatesdk/sdk/service/storekit/bean/RequestBean;

    move-object v4, v0

    check-cast v4, Lcom/huawei/updatesdk/framework/bean/StoreRequestBean;

    move-object v5, p3

    check-cast v5, Lcom/huawei/updatesdk/framework/bean/StoreResponseBean;

    iget-object v0, v5, Lcom/huawei/updatesdk/framework/bean/StoreResponseBean;->rspKey_:Ljava/lang/String;

    if-nez v0, :cond_3

    const/4 v0, 0x1

    invoke-virtual {p3, v0}, Lcom/huawei/updatesdk/sdk/service/storekit/bean/ResponseBean;->setResponseCode(I)V

    const-string v0, "StoreTaskEx"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onJsonParsed, rspKey is null, method:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/updatesdk/service/b/a/c;->a:Lcom/huawei/updatesdk/sdk/service/storekit/bean/RequestBean;

    invoke-virtual {v2}, Lcom/huawei/updatesdk/sdk/service/storekit/bean/RequestBean;->getMethod_()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/updatesdk/sdk/a/b/a/a/a;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :cond_3
    :try_start_1
    invoke-static {}, Lcom/huawei/updatesdk/service/a/b;->a()Lcom/huawei/updatesdk/service/a/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/updatesdk/service/a/b;->g()Ljava/lang/String;

    move-result-object v6

    iget-object v0, p0, Lcom/huawei/updatesdk/service/b/a/c;->a:Lcom/huawei/updatesdk/sdk/service/storekit/bean/RequestBean;

    instance-of v0, v0, Lcom/huawei/updatesdk/framework/bean/startup/StartupRequest;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/huawei/updatesdk/service/b/a/c;->a:Lcom/huawei/updatesdk/sdk/service/storekit/bean/RequestBean;

    check-cast v0, Lcom/huawei/updatesdk/framework/bean/startup/StartupRequest;

    invoke-virtual {v0}, Lcom/huawei/updatesdk/framework/bean/startup/StartupRequest;->getSignSecretKey()Ljava/lang/String;

    move-result-object v6

    :cond_4
    iget-object v0, v5, Lcom/huawei/updatesdk/framework/bean/StoreResponseBean;->rspKey_:Ljava/lang/String;

    invoke-virtual {v4}, Lcom/huawei/updatesdk/framework/bean/StoreRequestBean;->getSalt_()Ljava/lang/String;

    move-result-object v1

    invoke-static {v6, p2, v0, v1}, Lcom/huawei/updatesdk/service/b/a/c;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v7

    if-nez v7, :cond_5

    const/4 v0, 0x1

    invoke-virtual {p3, v0}, Lcom/huawei/updatesdk/sdk/service/storekit/bean/ResponseBean;->setResponseCode(I)V

    const-string v0, "StoreTaskEx"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onJsonParsed, rspKey error, method:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/updatesdk/service/b/a/c;->a:Lcom/huawei/updatesdk/sdk/service/storekit/bean/RequestBean;

    invoke-virtual {v2}, Lcom/huawei/updatesdk/sdk/service/storekit/bean/RequestBean;->getMethod_()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/updatesdk/sdk/a/b/a/a/a;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    :cond_5
    goto :goto_1

    :catch_0
    move-exception v4

    const/4 v0, 0x1

    invoke-virtual {p3, v0}, Lcom/huawei/updatesdk/sdk/service/storekit/bean/ResponseBean;->setResponseCode(I)V

    const-string v0, "StoreTaskEx"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onJsonParsed error, method:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/updatesdk/service/b/a/c;->a:Lcom/huawei/updatesdk/sdk/service/storekit/bean/RequestBean;

    invoke-virtual {v2}, Lcom/huawei/updatesdk/sdk/service/storekit/bean/RequestBean;->getMethod_()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, v4}, Lcom/huawei/updatesdk/sdk/a/b/a/a/a;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_1
    return-void
.end method

.method public a(Lcom/huawei/updatesdk/sdk/service/storekit/bean/ResponseBean;)Z
    .locals 5

    iget-object v0, p0, Lcom/huawei/updatesdk/service/b/a/c;->a:Lcom/huawei/updatesdk/sdk/service/storekit/bean/RequestBean;

    instance-of v0, v0, Lcom/huawei/updatesdk/framework/bean/StoreRequestBean;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    iget-object v0, p0, Lcom/huawei/updatesdk/service/b/a/c;->a:Lcom/huawei/updatesdk/sdk/service/storekit/bean/RequestBean;

    move-object v2, v0

    check-cast v2, Lcom/huawei/updatesdk/framework/bean/StoreRequestBean;

    const/4 v3, 0x0

    invoke-static {}, Lcom/huawei/updatesdk/service/a/a$a;->c()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v4, 0x0

    invoke-static {}, Lcom/huawei/updatesdk/service/a/a$a;->b()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {v2}, Lcom/huawei/updatesdk/framework/bean/StoreRequestBean;->getUrl()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v3, 0x1

    :cond_1
    goto :goto_0

    :cond_2
    invoke-virtual {v2}, Lcom/huawei/updatesdk/framework/bean/StoreRequestBean;->getTarget()Lcom/huawei/updatesdk/framework/bean/StoreRequestBean$a;

    move-result-object v0

    sget-object v1, Lcom/huawei/updatesdk/framework/bean/StoreRequestBean$a;->a:Lcom/huawei/updatesdk/framework/bean/StoreRequestBean$a;

    if-ne v0, v1, :cond_4

    invoke-virtual {p1}, Lcom/huawei/updatesdk/sdk/service/storekit/bean/ResponseBean;->getErrCause()Lcom/huawei/updatesdk/sdk/service/storekit/bean/ResponseBean$a;

    move-result-object v0

    sget-object v1, Lcom/huawei/updatesdk/sdk/service/storekit/bean/ResponseBean$a;->e:Lcom/huawei/updatesdk/sdk/service/storekit/bean/ResponseBean$a;

    if-eq v0, v1, :cond_3

    invoke-virtual {p1}, Lcom/huawei/updatesdk/sdk/service/storekit/bean/ResponseBean;->getErrCause()Lcom/huawei/updatesdk/sdk/service/storekit/bean/ResponseBean$a;

    move-result-object v0

    sget-object v1, Lcom/huawei/updatesdk/sdk/service/storekit/bean/ResponseBean$a;->f:Lcom/huawei/updatesdk/sdk/service/storekit/bean/ResponseBean$a;

    if-eq v0, v1, :cond_3

    invoke-virtual {p1}, Lcom/huawei/updatesdk/sdk/service/storekit/bean/ResponseBean;->getErrCause()Lcom/huawei/updatesdk/sdk/service/storekit/bean/ResponseBean$a;

    move-result-object v0

    sget-object v1, Lcom/huawei/updatesdk/sdk/service/storekit/bean/ResponseBean$a;->g:Lcom/huawei/updatesdk/sdk/service/storekit/bean/ResponseBean$a;

    if-ne v0, v1, :cond_4

    :cond_3
    const/4 v0, 0x1

    invoke-static {v0}, Lcom/huawei/updatesdk/service/a/a$a;->a(Z)V

    const/4 v3, 0x1

    :cond_4
    :goto_0
    if-eqz v3, :cond_5

    const-string v0, "StoreTaskEx"

    const-string v1, "onRetryCompleted, trans to backupUrl"

    invoke-static {v0, v1}, Lcom/huawei/updatesdk/sdk/a/b/a/a/a;->c(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Lcom/huawei/updatesdk/service/a/a$a;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/updatesdk/framework/bean/StoreRequestBean;->setUrl(Ljava/lang/String;)V

    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/updatesdk/service/b/a/c;->h:I

    :cond_5
    return v3
.end method

.method public b(Lcom/huawei/updatesdk/sdk/service/storekit/bean/ResponseBean;)V
    .locals 4

    iget-object v0, p0, Lcom/huawei/updatesdk/service/b/a/c;->a:Lcom/huawei/updatesdk/sdk/service/storekit/bean/RequestBean;

    instance-of v0, v0, Lcom/huawei/updatesdk/framework/bean/startup/StartupRequest;

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lcom/huawei/updatesdk/sdk/service/storekit/bean/ResponseBean;->getRtnCode_()I

    move-result v0

    invoke-static {v0}, Lcom/huawei/updatesdk/service/b/a/c$a;->a(I)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/huawei/updatesdk/service/b/a/c;->a:Lcom/huawei/updatesdk/sdk/service/storekit/bean/RequestBean;

    invoke-static {v0, p1}, Lcom/huawei/updatesdk/service/b/a/c$a;->a(Lcom/huawei/updatesdk/sdk/service/storekit/bean/RequestBean;Lcom/huawei/updatesdk/sdk/service/storekit/bean/ResponseBean;)Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    return-void

    :cond_1
    iget v0, p0, Lcom/huawei/updatesdk/service/b/a/c;->i:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lcom/huawei/updatesdk/service/b/a/c;->i:I

    const/4 v1, 0x3

    if-lt v0, v1, :cond_2

    return-void

    :cond_2
    const-string v0, "StoreTaskEx"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "reCallFrontSync, hcrID or sign error! method:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/updatesdk/service/b/a/c;->a:Lcom/huawei/updatesdk/sdk/service/storekit/bean/RequestBean;

    invoke-virtual {v2}, Lcom/huawei/updatesdk/sdk/service/storekit/bean/RequestBean;->getMethod_()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", rtnCode:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Lcom/huawei/updatesdk/sdk/service/storekit/bean/ResponseBean;->getRtnCode_()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/updatesdk/sdk/a/b/a/a/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Lcom/huawei/updatesdk/service/b/a/c$a;->a()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-direct {p0}, Lcom/huawei/updatesdk/service/b/a/c;->e()V

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/huawei/updatesdk/sdk/service/storekit/bean/ResponseBean;->setResponseCode(I)V

    :cond_3
    return-void
.end method

.method public d()Ljava/lang/String;
    .locals 2

    invoke-static {}, Lcom/huawei/updatesdk/support/a/a;->b()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-super {p0}, Lcom/huawei/updatesdk/sdk/service/storekit/b;->d()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    return-object v1
.end method
