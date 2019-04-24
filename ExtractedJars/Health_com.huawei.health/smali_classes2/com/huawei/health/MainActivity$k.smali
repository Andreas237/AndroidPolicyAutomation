.class Lcom/huawei/health/MainActivity$k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hms/api/HuaweiApiClient$OnConnectionFailedListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/MainActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "k"
.end annotation


# instance fields
.field private c:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/health/MainActivity;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/huawei/health/MainActivity;)V
    .locals 1

    .line 851
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 852
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/health/MainActivity$k;->c:Ljava/lang/ref/WeakReference;

    .line 853
    return-void
.end method


# virtual methods
.method public onConnectionFailed(Lcom/huawei/hms/api/ConnectionResult;)V
    .locals 7

    .line 857
    iget-object v0, p0, Lcom/huawei/health/MainActivity$k;->c:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/health/MainActivity;

    .line 858
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HuaweiApiClient onConnectionFailed, ErrorCode: "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p1}, Lcom/huawei/hms/api/ConnectionResult;->getErrorCode()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 859
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    invoke-static {v4}, Lcom/huawei/health/MainActivity;->i(Lcom/huawei/health/MainActivity;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 860
    :cond_0
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mResolvingError is true, return! "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 861
    return-void

    .line 863
    :cond_1
    invoke-virtual {p1}, Lcom/huawei/hms/api/ConnectionResult;->getErrorCode()I

    move-result v5

    .line 865
    invoke-static {}, Lcom/huawei/hms/api/HuaweiApiAvailability;->getInstance()Lcom/huawei/hms/api/HuaweiApiAvailability;

    move-result-object v6

    .line 866
    invoke-virtual {v6, v5}, Lcom/huawei/hms/api/HuaweiApiAvailability;->isUserResolvableError(I)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 867
    const/4 v0, 0x1

    invoke-static {v4, v0}, Lcom/huawei/health/MainActivity;->e(Lcom/huawei/health/MainActivity;Z)Z

    .line 868
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "availability.isUserResolvableError(errorCode):true "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 869
    const/16 v0, 0x7d0

    invoke-virtual {v6, v4, v5, v0}, Lcom/huawei/hms/api/HuaweiApiAvailability;->resolveError(Landroid/app/Activity;II)V

    .line 871
    :cond_2
    return-void
.end method
