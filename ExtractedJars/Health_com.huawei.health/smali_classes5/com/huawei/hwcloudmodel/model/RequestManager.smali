.class public Lcom/huawei/hwcloudmodel/model/RequestManager;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/hwcloudmodel/model/RequestManager$FakeX509TrustManager;
    }
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String; = "RequestManager"

.field private static mRequestQueue:Lcom/android/volley/RequestQueue; = null


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    return-void
.end method

.method public static addRequest(Lcom/android/volley/Request;Ljava/lang/Object;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/android/volley/Request<*>;Ljava/lang/Object;)V"
        }
    .end annotation

    .line 48
    if-eqz p1, :cond_0

    .line 49
    invoke-virtual {p0, p1}, Lcom/android/volley/Request;->setTag(Ljava/lang/Object;)Lcom/android/volley/Request;

    .line 51
    :cond_0
    sget-object v0, Lcom/huawei/hwcloudmodel/model/RequestManager;->mRequestQueue:Lcom/android/volley/RequestQueue;

    if-nez v0, :cond_1

    .line 52
    const-string v0, "testnpsRequestManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "RequestManager mRequestQueue Error is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 54
    :cond_1
    const/4 v4, 0x0

    .line 55
    const-string v0, "RequestManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "RequestManager isTest : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 56
    nop

    .line 57
    .line 59
    sget-object v0, Lcom/huawei/hwcloudmodel/model/RequestManager;->mRequestQueue:Lcom/android/volley/RequestQueue;

    invoke-virtual {v0, p0}, Lcom/android/volley/RequestQueue;->add(Lcom/android/volley/Request;)Lcom/android/volley/Request;

    .line 60
    const-string v0, "testnpsRequestManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "RequestManager =========uuurrrlll :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p0}, Lcom/android/volley/Request;->getUrl()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 63
    :goto_0
    return-void
.end method

.method public static cancelAll(Ljava/lang/Object;)V
    .locals 4

    .line 66
    const-string v0, "testnpsRequestManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "RequestManager cancelAll"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 67
    sget-object v0, Lcom/huawei/hwcloudmodel/model/RequestManager;->mRequestQueue:Lcom/android/volley/RequestQueue;

    invoke-virtual {v0, p0}, Lcom/android/volley/RequestQueue;->cancelAll(Ljava/lang/Object;)V

    .line 68
    return-void
.end method

.method public static getRequestQueue()Lcom/android/volley/RequestQueue;
    .locals 4

    .line 37
    const-string v0, "testnpsRequestManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "RequestManager getRequestQueue"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 38
    sget-object v0, Lcom/huawei/hwcloudmodel/model/RequestManager;->mRequestQueue:Lcom/android/volley/RequestQueue;

    if-eqz v0, :cond_0

    .line 39
    sget-object v0, Lcom/huawei/hwcloudmodel/model/RequestManager;->mRequestQueue:Lcom/android/volley/RequestQueue;

    return-object v0

    .line 41
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "RequestQueue not initialized"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static init(Landroid/content/Context;)V
    .locals 4

    .line 32
    const-string v0, "testnpsRequestManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "RequestManager init"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 33
    invoke-static {p0}, Lcom/android/volley/toolbox/Volley;->newRequestQueue(Landroid/content/Context;)Lcom/android/volley/RequestQueue;

    move-result-object v0

    sput-object v0, Lcom/huawei/hwcloudmodel/model/RequestManager;->mRequestQueue:Lcom/android/volley/RequestQueue;

    .line 34
    return-void
.end method
