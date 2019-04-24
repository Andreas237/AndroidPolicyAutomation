.class public final Lcom/huawei/hwCloudJs/service/hms/b$b;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/huawei/hms/api/HuaweiApiClient$OnConnectionFailedListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hwCloudJs/service/hms/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/hwCloudJs/service/hms/b$b$a;
    }
.end annotation


# instance fields
.field private a:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/hms/api/HuaweiApiClient;>;"
        }
    .end annotation
.end field

.field private b:Lcom/huawei/hwCloudJs/core/JsCallback;

.field private c:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Landroid/app/Activity;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/ref/WeakReference;Lcom/huawei/hwCloudJs/core/JsCallback;Ljava/lang/ref/WeakReference;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/ref/WeakReference<Lcom/huawei/hms/api/HuaweiApiClient;>;Lcom/huawei/hwCloudJs/core/JsCallback;Ljava/lang/ref/WeakReference<Landroid/app/Activity;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/huawei/hwCloudJs/service/hms/b$b;->a:Ljava/lang/ref/WeakReference;

    iput-object p2, p0, Lcom/huawei/hwCloudJs/service/hms/b$b;->b:Lcom/huawei/hwCloudJs/core/JsCallback;

    iput-object p3, p0, Lcom/huawei/hwCloudJs/service/hms/b$b;->c:Ljava/lang/ref/WeakReference;

    return-void
.end method

.method static synthetic a(Lcom/huawei/hwCloudJs/service/hms/b$b;)Ljava/lang/ref/WeakReference;
    .locals 1

    iget-object v0, p0, Lcom/huawei/hwCloudJs/service/hms/b$b;->c:Ljava/lang/ref/WeakReference;

    return-object v0
.end method


# virtual methods
.method public onConnectionFailed(Lcom/huawei/hms/api/ConnectionResult;)V
    .locals 8

    invoke-virtual {p1}, Lcom/huawei/hms/api/ConnectionResult;->getErrorCode()I

    move-result v5

    invoke-static {}, Lcom/huawei/hms/api/HuaweiApiAvailability;->getInstance()Lcom/huawei/hms/api/HuaweiApiAvailability;

    move-result-object v6

    invoke-virtual {v6, v5}, Lcom/huawei/hms/api/HuaweiApiAvailability;->isUserResolvableError(I)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "HmsCoreApiHelper"

    const-string v1, "JS InvokeResultCallback onConnectionFailed REQUEST_CODE_CONN_ERROR"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Lcom/huawei/hwCloudJs/service/hms/a;->a()Lcom/huawei/hwCloudJs/service/hms/a;

    move-result-object v0

    new-instance v1, Lcom/huawei/hwCloudJs/service/hms/b$b$a;

    iget-object v2, p0, Lcom/huawei/hwCloudJs/service/hms/b$b;->a:Ljava/lang/ref/WeakReference;

    iget-object v3, p0, Lcom/huawei/hwCloudJs/service/hms/b$b;->c:Ljava/lang/ref/WeakReference;

    iget-object v4, p0, Lcom/huawei/hwCloudJs/service/hms/b$b;->b:Lcom/huawei/hwCloudJs/core/JsCallback;

    invoke-direct {v1, v2, v3, v4}, Lcom/huawei/hwCloudJs/service/hms/b$b$a;-><init>(Ljava/lang/ref/WeakReference;Ljava/lang/ref/WeakReference;Lcom/huawei/hwCloudJs/core/JsCallback;)V

    const/16 v2, 0x232c

    invoke-virtual {v0, v2, v1}, Lcom/huawei/hwCloudJs/service/hms/a;->a(ILcom/huawei/hwCloudJs/service/hms/a$c;)V

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v1, Lcom/huawei/hwCloudJs/service/hms/b$b$1;

    invoke-direct {v1, p0, v6, v5}, Lcom/huawei/hwCloudJs/service/hms/b$b$1;-><init>(Lcom/huawei/hwCloudJs/service/hms/b$b;Lcom/huawei/hms/api/HuaweiApiAvailability;I)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    const-string v0, "HmsCoreApiHelper"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "JS InvokeResultCallback onConnectionFailed errorCode "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/huawei/hwCloudJs/service/hms/b$b;->b:Lcom/huawei/hwCloudJs/core/JsCallback;

    invoke-virtual {v0, v7}, Lcom/huawei/hwCloudJs/core/JsCallback;->failure(Ljava/lang/String;)V

    :goto_0
    return-void
.end method
