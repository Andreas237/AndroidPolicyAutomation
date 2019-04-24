.class Lcom/huawei/health/MainActivity$c;
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
    name = "c"
.end annotation


# instance fields
.field private e:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/health/MainActivity;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/huawei/health/MainActivity;)V
    .locals 1

    .line 790
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 791
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/health/MainActivity$c;->e:Ljava/lang/ref/WeakReference;

    .line 792
    return-void
.end method

.method private a(Lcom/huawei/hms/api/HuaweiApiClient;)V
    .locals 5

    .line 830
    invoke-virtual {p1}, Lcom/huawei/hms/api/HuaweiApiClient;->isConnected()Z

    move-result v0

    if-nez v0, :cond_0

    .line 831
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u83b7\u53d6token\u5931\u8d25\uff0c\u539f\u56e0\uff1aHuaweiApiClient\u672a\u8fde\u63a5"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 832
    return-void

    .line 835
    :cond_0
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u5f02\u6b65\u63a5\u53e3\u83b7\u53d6push token"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 836
    sget-object v0, Lcom/huawei/hms/support/api/push/HuaweiPush;->HuaweiPushApi:Lcom/huawei/hms/support/api/push/HuaweiPushApi;

    invoke-interface {v0, p1}, Lcom/huawei/hms/support/api/push/HuaweiPushApi;->getToken(Lcom/huawei/hms/support/api/client/ApiClient;)Lcom/huawei/hms/support/api/client/PendingResult;

    move-result-object v4

    .line 837
    new-instance v0, Lcom/huawei/health/MainActivity$c$3;

    invoke-direct {v0, p0}, Lcom/huawei/health/MainActivity$c$3;-><init>(Lcom/huawei/health/MainActivity$c;)V

    invoke-virtual {v4, v0}, Lcom/huawei/hms/support/api/client/PendingResult;->setResultCallback(Lcom/huawei/hms/support/api/client/ResultCallback;)V

    .line 843
    return-void
.end method


# virtual methods
.method public onConnected()V
    .locals 6

    .line 796
    iget-object v0, p0, Lcom/huawei/health/MainActivity$c;->e:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/health/MainActivity;

    .line 797
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 798
    return-void

    .line 801
    :cond_0
    invoke-static {v4}, Lcom/huawei/health/MainActivity;->g(Lcom/huawei/health/MainActivity;)Lcom/huawei/hms/api/HuaweiApiClient;

    move-result-object v5

    .line 802
    const/4 v0, 0x0

    if-ne v0, v5, :cond_1

    .line 803
    return-void

    .line 806
    :cond_1
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onConnected, IsConnected: "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v5}, Lcom/huawei/hms/api/HuaweiApiClient;->isConnected()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 808
    invoke-direct {p0, v5}, Lcom/huawei/health/MainActivity$c;->a(Lcom/huawei/hms/api/HuaweiApiClient;)V

    .line 809
    return-void
.end method

.method public onConnectionSuspended(I)V
    .locals 6

    .line 813
    iget-object v0, p0, Lcom/huawei/health/MainActivity$c;->e:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/health/MainActivity;

    .line 814
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 815
    return-void

    .line 818
    :cond_0
    invoke-static {v4}, Lcom/huawei/health/MainActivity;->g(Lcom/huawei/health/MainActivity;)Lcom/huawei/hms/api/HuaweiApiClient;

    move-result-object v5

    .line 819
    const/4 v0, 0x0

    if-eq v0, v5, :cond_1

    .line 820
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onConnectionSuspended, cause: "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ", IsConnected: "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-virtual {v5}, Lcom/huawei/hms/api/HuaweiApiClient;->isConnected()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 822
    :cond_1
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onConnectionSuspended, cause: "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 824
    :goto_0
    return-void
.end method
