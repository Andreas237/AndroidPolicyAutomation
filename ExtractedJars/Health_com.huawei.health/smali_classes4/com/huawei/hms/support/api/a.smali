.class public abstract Lcom/huawei/hms/support/api/a;
.super Lcom/huawei/hms/support/api/client/PendingResult;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<R:Lcom/huawei/hms/support/api/client/Result;>Lcom/huawei/hms/support/api/client/PendingResult<TR;>;"
    }
.end annotation


# instance fields
.field private a:Lcom/huawei/hms/support/api/client/Result;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TR;"
        }
    .end annotation
.end field

.field private b:I


# direct methods
.method public constructor <init>(I)V
    .locals 1

    .line 25
    invoke-direct {p0}, Lcom/huawei/hms/support/api/client/PendingResult;-><init>()V

    .line 22
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hms/support/api/a;->a:Lcom/huawei/hms/support/api/client/Result;

    .line 26
    iput p1, p0, Lcom/huawei/hms/support/api/a;->b:I

    .line 27
    return-void
.end method

.method static synthetic a(Lcom/huawei/hms/support/api/a;)I
    .locals 1

    .line 17
    iget v0, p0, Lcom/huawei/hms/support/api/a;->b:I

    return v0
.end method

.method private a(I)Lcom/huawei/hms/support/api/client/Result;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TR;"
        }
    .end annotation

    .line 63
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getGenericSuperclass()Ljava/lang/reflect/Type;

    move-result-object v2

    .line 64
    if-eqz v2, :cond_0

    .line 66
    move-object v0, v2

    check-cast v0, Ljava/lang/reflect/ParameterizedType;

    invoke-interface {v0}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    move-result-object v0

    const/4 v1, 0x0

    aget-object v3, v0, v1

    .line 68
    invoke-static {v3}, Lcom/huawei/hms/support/a/a;->a(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object v4

    .line 71
    :try_start_0
    invoke-virtual {v4}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hms/support/api/client/Result;

    iput-object v0, p0, Lcom/huawei/hms/support/api/a;->a:Lcom/huawei/hms/support/api/client/Result;

    .line 72
    iget-object v0, p0, Lcom/huawei/hms/support/api/a;->a:Lcom/huawei/hms/support/api/client/Result;

    new-instance v1, Lcom/huawei/hms/support/api/client/Status;

    invoke-direct {v1, p1}, Lcom/huawei/hms/support/api/client/Status;-><init>(I)V

    invoke-virtual {v0, v1}, Lcom/huawei/hms/support/api/client/Result;->setStatus(Lcom/huawei/hms/support/api/client/Status;)V
    :try_end_0
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1

    .line 77
    goto :goto_0

    .line 73
    :catch_0
    move-exception v5

    .line 74
    const-string v0, "ErrorResultImpl"

    const-string v1, "InstantiationException"

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 77
    goto :goto_0

    .line 75
    :catch_1
    move-exception v5

    .line 76
    const-string v0, "ErrorResultImpl"

    const-string v1, "IllegalAccessException"

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 83
    :goto_0
    iget-object v0, p0, Lcom/huawei/hms/support/api/a;->a:Lcom/huawei/hms/support/api/client/Result;

    return-object v0

    .line 87
    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method static synthetic a(Lcom/huawei/hms/support/api/a;I)Lcom/huawei/hms/support/api/client/Result;
    .locals 1

    .line 17
    invoke-direct {p0, p1}, Lcom/huawei/hms/support/api/a;->a(I)Lcom/huawei/hms/support/api/client/Result;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final await()Lcom/huawei/hms/support/api/client/Result;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TR;"
        }
    .end annotation

    .line 31
    const-wide/16 v0, 0x0

    const/4 v2, 0x0

    invoke-virtual {p0, v0, v1, v2}, Lcom/huawei/hms/support/api/a;->await(JLjava/util/concurrent/TimeUnit;)Lcom/huawei/hms/support/api/client/Result;

    move-result-object v0

    return-object v0
.end method

.method public await(JLjava/util/concurrent/TimeUnit;)Lcom/huawei/hms/support/api/client/Result;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JLjava/util/concurrent/TimeUnit;)TR;"
        }
    .end annotation

    .line 36
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    if-ne v0, v1, :cond_0

    .line 37
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "await must not be called on the UI thread"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 39
    :cond_0
    iget v0, p0, Lcom/huawei/hms/support/api/a;->b:I

    invoke-direct {p0, v0}, Lcom/huawei/hms/support/api/a;->a(I)Lcom/huawei/hms/support/api/client/Result;

    move-result-object v0

    return-object v0
.end method

.method public final setResultCallback(Landroid/os/Looper;Lcom/huawei/hms/support/api/client/ResultCallback;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/os/Looper;Lcom/huawei/hms/support/api/client/ResultCallback<TR;>;)V"
        }
    .end annotation

    .line 49
    new-instance v1, Landroid/os/Handler;

    if-nez p1, :cond_0

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, p1

    :goto_0
    invoke-direct {v1, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 51
    new-instance v0, Lcom/huawei/hms/support/api/b;

    invoke-direct {v0, p0, p2}, Lcom/huawei/hms/support/api/b;-><init>(Lcom/huawei/hms/support/api/a;Lcom/huawei/hms/support/api/client/ResultCallback;)V

    invoke-virtual {v1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 59
    return-void
.end method

.method public final setResultCallback(Lcom/huawei/hms/support/api/client/ResultCallback;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/hms/support/api/client/ResultCallback<TR;>;)V"
        }
    .end annotation

    .line 44
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-virtual {p0, v0, p1}, Lcom/huawei/hms/support/api/a;->setResultCallback(Landroid/os/Looper;Lcom/huawei/hms/support/api/client/ResultCallback;)V

    .line 45
    return-void
.end method
