.class Lcom/huawei/hwCloudJs/service/hms/HmsCoreApi$1;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/huawei/hms/api/HuaweiApiClient$ConnectionCallbacks;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/hwCloudJs/service/hms/HmsCoreApi;->signIn(Lcom/huawei/hwCloudJs/service/hms/HmsCoreApi$LoginReq;Lcom/huawei/hwCloudJs/core/JsCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/ref/WeakReference;

.field final synthetic b:Lcom/huawei/hwCloudJs/core/JsCallback;

.field final synthetic c:Ljava/lang/ref/WeakReference;

.field final synthetic d:Z

.field final synthetic e:Z

.field final synthetic f:Lcom/huawei/hwCloudJs/service/hms/HmsCoreApi;


# direct methods
.method constructor <init>(Lcom/huawei/hwCloudJs/service/hms/HmsCoreApi;Ljava/lang/ref/WeakReference;Lcom/huawei/hwCloudJs/core/JsCallback;Ljava/lang/ref/WeakReference;ZZ)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/hwCloudJs/service/hms/HmsCoreApi$1;->f:Lcom/huawei/hwCloudJs/service/hms/HmsCoreApi;

    iput-object p2, p0, Lcom/huawei/hwCloudJs/service/hms/HmsCoreApi$1;->a:Ljava/lang/ref/WeakReference;

    iput-object p3, p0, Lcom/huawei/hwCloudJs/service/hms/HmsCoreApi$1;->b:Lcom/huawei/hwCloudJs/core/JsCallback;

    iput-object p4, p0, Lcom/huawei/hwCloudJs/service/hms/HmsCoreApi$1;->c:Ljava/lang/ref/WeakReference;

    iput-boolean p5, p0, Lcom/huawei/hwCloudJs/service/hms/HmsCoreApi$1;->d:Z

    iput-boolean p6, p0, Lcom/huawei/hwCloudJs/service/hms/HmsCoreApi$1;->e:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onConnected()V
    .locals 6

    iget-object v0, p0, Lcom/huawei/hwCloudJs/service/hms/HmsCoreApi$1;->f:Lcom/huawei/hwCloudJs/service/hms/HmsCoreApi;

    iget-object v1, p0, Lcom/huawei/hwCloudJs/service/hms/HmsCoreApi$1;->a:Ljava/lang/ref/WeakReference;

    iget-object v2, p0, Lcom/huawei/hwCloudJs/service/hms/HmsCoreApi$1;->b:Lcom/huawei/hwCloudJs/core/JsCallback;

    iget-object v3, p0, Lcom/huawei/hwCloudJs/service/hms/HmsCoreApi$1;->c:Ljava/lang/ref/WeakReference;

    iget-boolean v4, p0, Lcom/huawei/hwCloudJs/service/hms/HmsCoreApi$1;->d:Z

    iget-boolean v5, p0, Lcom/huawei/hwCloudJs/service/hms/HmsCoreApi$1;->e:Z

    invoke-static/range {v0 .. v5}, Lcom/huawei/hwCloudJs/service/hms/HmsCoreApi;->a(Lcom/huawei/hwCloudJs/service/hms/HmsCoreApi;Ljava/lang/ref/WeakReference;Lcom/huawei/hwCloudJs/core/JsCallback;Ljava/lang/ref/WeakReference;ZZ)V

    return-void
.end method

.method public onConnectionSuspended(I)V
    .locals 0

    return-void
.end method
