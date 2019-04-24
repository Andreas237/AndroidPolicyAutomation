.class Lcom/huawei/openalliance/ad/utils/k$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/openalliance/ad/utils/k;->c()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/openalliance/ad/utils/k;


# direct methods
.method constructor <init>(Lcom/huawei/openalliance/ad/utils/k;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/utils/k$1;->a:Lcom/huawei/openalliance/ad/utils/k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    iget-object v0, p0, Lcom/huawei/openalliance/ad/utils/k$1;->a:Lcom/huawei/openalliance/ad/utils/k;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/k;->a(Lcom/huawei/openalliance/ad/utils/k;)[B

    move-result-object v2

    monitor-enter v2

    :try_start_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/utils/k$1;->a:Lcom/huawei/openalliance/ad/utils/k;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/k;->b(Lcom/huawei/openalliance/ad/utils/k;)Landroid/os/HandlerThread;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/utils/k$1;->a:Lcom/huawei/openalliance/ad/utils/k;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/k;->b(Lcom/huawei/openalliance/ad/utils/k;)Landroid/os/HandlerThread;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/HandlerThread;->quitSafely()Z

    iget-object v0, p0, Lcom/huawei/openalliance/ad/utils/k$1;->a:Lcom/huawei/openalliance/ad/utils/k;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/utils/k;->a(Lcom/huawei/openalliance/ad/utils/k;Landroid/os/HandlerThread;)Landroid/os/HandlerThread;

    :cond_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/utils/k$1;->a:Lcom/huawei/openalliance/ad/utils/k;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/utils/k;->a(Lcom/huawei/openalliance/ad/utils/k;Lcom/huawei/openalliance/ad/utils/j;)V

    const-string v0, "HandlerExecAgent"

    const-string v1, "quit thread and release"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3

    :goto_0
    return-void
.end method
