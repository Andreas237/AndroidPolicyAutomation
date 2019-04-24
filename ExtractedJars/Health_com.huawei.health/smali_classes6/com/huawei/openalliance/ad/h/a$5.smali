.class Lcom/huawei/openalliance/ad/h/a$5;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/openalliance/ad/h/a;->g()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/openalliance/ad/h/a;


# direct methods
.method constructor <init>(Lcom/huawei/openalliance/ad/h/a;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/h/a$5;->a:Lcom/huawei/openalliance/ad/h/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 7

    iget-object v5, p0, Lcom/huawei/openalliance/ad/h/a$5;->a:Lcom/huawei/openalliance/ad/h/a;

    monitor-enter v5

    const-string v0, "AdMediator"

    const-string v1, "on load task timeout, loadingTimeout: %s"

    const/4 v2, 0x1

    :try_start_0
    new-array v2, v2, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/huawei/openalliance/ad/h/a$5;->a:Lcom/huawei/openalliance/ad/h/a;

    invoke-static {v3}, Lcom/huawei/openalliance/ad/h/a;->b(Lcom/huawei/openalliance/ad/h/a;)Z

    move-result v3

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v0, v1, v2}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/h/a$5;->a:Lcom/huawei/openalliance/ad/h/a;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/h/a;->b(Lcom/huawei/openalliance/ad/h/a;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/h/a$5;->a:Lcom/huawei/openalliance/ad/h/a;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/h/a;->a(Lcom/huawei/openalliance/ad/h/a;Z)Z

    iget-object v0, p0, Lcom/huawei/openalliance/ad/h/a$5;->a:Lcom/huawei/openalliance/ad/h/a;

    const/4 v1, -0x2

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/h/a;->a(I)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/h/a$5;->a:Lcom/huawei/openalliance/ad/h/a;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/h/a;->h()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit v5

    goto :goto_0

    :catchall_0
    move-exception v6

    monitor-exit v5

    throw v6

    :goto_0
    return-void
.end method
