.class Lcom/huawei/health/MainActivity$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hms/api/HuaweiApiClient$ConnectionCallbacks;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/MainActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "f"
.end annotation


# instance fields
.field private d:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/health/MainActivity;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/huawei/health/MainActivity;)V
    .locals 1

    .line 3415
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3416
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/health/MainActivity$f;->d:Ljava/lang/ref/WeakReference;

    .line 3417
    return-void
.end method


# virtual methods
.method public onConnected()V
    .locals 7

    .line 3421
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "obtainToken.hmsConnect onConnected.."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3423
    iget-object v0, p0, Lcom/huawei/health/MainActivity$f;->d:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/health/MainActivity;

    .line 3424
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 3425
    return-void

    .line 3428
    :cond_0
    iget-object v5, v4, Lcom/huawei/health/MainActivity;->f:Lcom/huawei/hwcloudmodel/agreement/AccessTokenManager;

    .line 3429
    invoke-static {v4}, Lcom/huawei/health/MainActivity;->b(Lcom/huawei/health/MainActivity;)Landroid/content/Context;

    move-result-object v6

    .line 3430
    const/4 v0, 0x0

    if-eq v0, v5, :cond_1

    const/4 v0, 0x0

    if-ne v0, v6, :cond_2

    .line 3431
    :cond_1
    return-void

    .line 3434
    :cond_2
    invoke-virtual {v5, v6}, Lcom/huawei/hwcloudmodel/agreement/AccessTokenManager;->signInToGetAt(Landroid/content/Context;)Ljava/lang/String;

    .line 3435
    return-void
.end method

.method public onConnectionSuspended(I)V
    .locals 4

    .line 3439
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getAccessTokenByHms onConnectionSuspended"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3440
    return-void
.end method
