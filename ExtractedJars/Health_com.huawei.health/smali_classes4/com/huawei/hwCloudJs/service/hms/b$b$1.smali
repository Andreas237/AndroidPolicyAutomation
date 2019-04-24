.class Lcom/huawei/hwCloudJs/service/hms/b$b$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/hwCloudJs/service/hms/b$b;->onConnectionFailed(Lcom/huawei/hms/api/ConnectionResult;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/hms/api/HuaweiApiAvailability;

.field final synthetic b:I

.field final synthetic c:Lcom/huawei/hwCloudJs/service/hms/b$b;


# direct methods
.method constructor <init>(Lcom/huawei/hwCloudJs/service/hms/b$b;Lcom/huawei/hms/api/HuaweiApiAvailability;I)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/hwCloudJs/service/hms/b$b$1;->c:Lcom/huawei/hwCloudJs/service/hms/b$b;

    iput-object p2, p0, Lcom/huawei/hwCloudJs/service/hms/b$b$1;->a:Lcom/huawei/hms/api/HuaweiApiAvailability;

    iput p3, p0, Lcom/huawei/hwCloudJs/service/hms/b$b$1;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    iget-object v0, p0, Lcom/huawei/hwCloudJs/service/hms/b$b$1;->c:Lcom/huawei/hwCloudJs/service/hms/b$b;

    invoke-static {v0}, Lcom/huawei/hwCloudJs/service/hms/b$b;->a(Lcom/huawei/hwCloudJs/service/hms/b$b;)Ljava/lang/ref/WeakReference;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroid/app/Activity;

    if-eqz v3, :cond_0

    iget-object v0, p0, Lcom/huawei/hwCloudJs/service/hms/b$b$1;->a:Lcom/huawei/hms/api/HuaweiApiAvailability;

    iget v1, p0, Lcom/huawei/hwCloudJs/service/hms/b$b$1;->b:I

    const/16 v2, 0x232c

    invoke-virtual {v0, v3, v1, v2}, Lcom/huawei/hms/api/HuaweiApiAvailability;->resolveError(Landroid/app/Activity;II)V

    :cond_0
    return-void
.end method
