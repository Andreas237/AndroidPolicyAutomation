.class Lcom/huawei/hms/api/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Handler$Callback;


# annotations
.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/hms/api/HuaweiApiClientImpl;


# direct methods
.method constructor <init>(Lcom/huawei/hms/api/HuaweiApiClientImpl;)V
    .locals 0

    .line 483
    iput-object p1, p0, Lcom/huawei/hms/api/e;->a:Lcom/huawei/hms/api/HuaweiApiClientImpl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)Z
    .locals 3

    .line 487
    if-eqz p1, :cond_0

    iget v0, p1, Landroid/os/Message;->what:I

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    .line 488
    :cond_0
    const/4 v0, 0x0

    return v0

    .line 491
    :cond_1
    const-string v0, "HuaweiApiClientImpl"

    const-string v1, "In connect, bind core service time out"

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 493
    iget-object v0, p0, Lcom/huawei/hms/api/e;->a:Lcom/huawei/hms/api/HuaweiApiClientImpl;

    invoke-static {v0}, Lcom/huawei/hms/api/HuaweiApiClientImpl;->a(Lcom/huawei/hms/api/HuaweiApiClientImpl;)Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    const/4 v1, 0x5

    if-ne v0, v1, :cond_2

    .line 494
    iget-object v0, p0, Lcom/huawei/hms/api/e;->a:Lcom/huawei/hms/api/HuaweiApiClientImpl;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/hms/api/HuaweiApiClientImpl;->a(Lcom/huawei/hms/api/HuaweiApiClientImpl;I)V

    .line 496
    iget-object v0, p0, Lcom/huawei/hms/api/e;->a:Lcom/huawei/hms/api/HuaweiApiClientImpl;

    invoke-static {v0}, Lcom/huawei/hms/api/HuaweiApiClientImpl;->b(Lcom/huawei/hms/api/HuaweiApiClientImpl;)Lcom/huawei/hms/api/HuaweiApiClient$OnConnectionFailedListener;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 497
    iget-object v0, p0, Lcom/huawei/hms/api/e;->a:Lcom/huawei/hms/api/HuaweiApiClientImpl;

    invoke-static {v0}, Lcom/huawei/hms/api/HuaweiApiClientImpl;->b(Lcom/huawei/hms/api/HuaweiApiClientImpl;)Lcom/huawei/hms/api/HuaweiApiClient$OnConnectionFailedListener;

    move-result-object v0

    new-instance v1, Lcom/huawei/hms/api/ConnectionResult;

    const/4 v2, 0x6

    invoke-direct {v1, v2}, Lcom/huawei/hms/api/ConnectionResult;-><init>(I)V

    invoke-interface {v0, v1}, Lcom/huawei/hms/api/HuaweiApiClient$OnConnectionFailedListener;->onConnectionFailed(Lcom/huawei/hms/api/ConnectionResult;)V

    .line 501
    :cond_2
    const/4 v0, 0x1

    return v0
.end method
