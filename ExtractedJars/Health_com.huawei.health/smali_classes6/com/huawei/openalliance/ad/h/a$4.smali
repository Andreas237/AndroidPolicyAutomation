.class Lcom/huawei/openalliance/ad/h/a$4;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/huawei/openalliance/ad/k/b/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/openalliance/ad/h/a;->a(Lcom/huawei/openalliance/ad/beans/server/AdContentRsp;J)V
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

    iput-object p1, p0, Lcom/huawei/openalliance/ad/h/a$4;->a:Lcom/huawei/openalliance/ad/h/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/huawei/openalliance/ad/db/bean/ContentRecord;)V
    .locals 5

    const-string v0, "AdMediator"

    const-string v1, "onDownloaded"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v3, p0, Lcom/huawei/openalliance/ad/h/a$4;->a:Lcom/huawei/openalliance/ad/h/a;

    monitor-enter v3

    const-string v0, "AdMediator"

    :try_start_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onDownloaded, loadingTimeout:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/openalliance/ad/h/a$4;->a:Lcom/huawei/openalliance/ad/h/a;

    invoke-static {v2}, Lcom/huawei/openalliance/ad/h/a;->b(Lcom/huawei/openalliance/ad/h/a;)Z

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/h/a$4;->a:Lcom/huawei/openalliance/ad/h/a;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/h/a;->b(Lcom/huawei/openalliance/ad/h/a;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/h/a$4;->a:Lcom/huawei/openalliance/ad/h/a;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/h/a;->a(Lcom/huawei/openalliance/ad/h/a;Z)Z

    iget-object v0, p0, Lcom/huawei/openalliance/ad/h/a$4;->a:Lcom/huawei/openalliance/ad/h/a;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/h/a;->c(Lcom/huawei/openalliance/ad/h/a;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/aj;->a(Ljava/lang/String;)V

    new-instance v0, Lcom/huawei/openalliance/ad/h/a$4$1;

    invoke-direct {v0, p0, p1}, Lcom/huawei/openalliance/ad/h/a$4$1;-><init>(Lcom/huawei/openalliance/ad/h/a$4;Lcom/huawei/openalliance/ad/db/bean/ContentRecord;)V

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/aj;->a(Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit v3

    goto :goto_0

    :catchall_0
    move-exception v4

    monitor-exit v3

    throw v4

    :goto_0
    return-void
.end method
