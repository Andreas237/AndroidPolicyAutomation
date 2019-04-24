.class Lcom/huawei/hwCloudJs/service/hms/HmsCoreApi$2;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/huawei/hms/support/api/client/ResultCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/hwCloudJs/service/hms/HmsCoreApi;->a(Ljava/lang/ref/WeakReference;Lcom/huawei/hwCloudJs/core/JsCallback;Ljava/lang/ref/WeakReference;ZZ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lcom/huawei/hms/support/api/client/ResultCallback<Lcom/huawei/hms/support/api/hwid/SignInResult;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Z

.field final synthetic b:Ljava/lang/ref/WeakReference;

.field final synthetic c:Ljava/lang/ref/WeakReference;

.field final synthetic d:Z

.field final synthetic e:Lcom/huawei/hwCloudJs/core/JsCallback;

.field final synthetic f:Lcom/huawei/hwCloudJs/service/hms/HmsCoreApi;


# direct methods
.method constructor <init>(Lcom/huawei/hwCloudJs/service/hms/HmsCoreApi;ZLjava/lang/ref/WeakReference;Ljava/lang/ref/WeakReference;ZLcom/huawei/hwCloudJs/core/JsCallback;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/hwCloudJs/service/hms/HmsCoreApi$2;->f:Lcom/huawei/hwCloudJs/service/hms/HmsCoreApi;

    iput-boolean p2, p0, Lcom/huawei/hwCloudJs/service/hms/HmsCoreApi$2;->a:Z

    iput-object p3, p0, Lcom/huawei/hwCloudJs/service/hms/HmsCoreApi$2;->b:Ljava/lang/ref/WeakReference;

    iput-object p4, p0, Lcom/huawei/hwCloudJs/service/hms/HmsCoreApi$2;->c:Ljava/lang/ref/WeakReference;

    iput-boolean p5, p0, Lcom/huawei/hwCloudJs/service/hms/HmsCoreApi$2;->d:Z

    iput-object p6, p0, Lcom/huawei/hwCloudJs/service/hms/HmsCoreApi$2;->e:Lcom/huawei/hwCloudJs/core/JsCallback;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/huawei/hms/support/api/hwid/SignInResult;)V
    .locals 7

    iget-object v0, p0, Lcom/huawei/hwCloudJs/service/hms/HmsCoreApi$2;->f:Lcom/huawei/hwCloudJs/service/hms/HmsCoreApi;

    move-object v1, p1

    iget-boolean v2, p0, Lcom/huawei/hwCloudJs/service/hms/HmsCoreApi$2;->a:Z

    iget-object v3, p0, Lcom/huawei/hwCloudJs/service/hms/HmsCoreApi$2;->b:Ljava/lang/ref/WeakReference;

    iget-object v4, p0, Lcom/huawei/hwCloudJs/service/hms/HmsCoreApi$2;->c:Ljava/lang/ref/WeakReference;

    iget-boolean v5, p0, Lcom/huawei/hwCloudJs/service/hms/HmsCoreApi$2;->d:Z

    iget-object v6, p0, Lcom/huawei/hwCloudJs/service/hms/HmsCoreApi$2;->e:Lcom/huawei/hwCloudJs/core/JsCallback;

    invoke-static/range {v0 .. v6}, Lcom/huawei/hwCloudJs/service/hms/HmsCoreApi;->a(Lcom/huawei/hwCloudJs/service/hms/HmsCoreApi;Lcom/huawei/hms/support/api/hwid/SignInResult;ZLjava/lang/ref/WeakReference;Ljava/lang/ref/WeakReference;ZLcom/huawei/hwCloudJs/core/JsCallback;)V

    return-void
.end method

.method public synthetic onResult(Ljava/lang/Object;)V
    .locals 1

    move-object v0, p1

    check-cast v0, Lcom/huawei/hms/support/api/hwid/SignInResult;

    invoke-virtual {p0, v0}, Lcom/huawei/hwCloudJs/service/hms/HmsCoreApi$2;->a(Lcom/huawei/hms/support/api/hwid/SignInResult;)V

    return-void
.end method
