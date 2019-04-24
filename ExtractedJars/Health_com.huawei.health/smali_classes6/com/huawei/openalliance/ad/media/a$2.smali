.class Lcom/huawei/openalliance/ad/media/a$2;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/huawei/openalliance/ad/media/listener/MediaErrorListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/openalliance/ad/media/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/openalliance/ad/media/a;


# direct methods
.method constructor <init>(Lcom/huawei/openalliance/ad/media/a;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/media/a$2;->a:Lcom/huawei/openalliance/ad/media/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onError(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;III)V
    .locals 6

    invoke-static {}, Lcom/huawei/openalliance/ad/g/c;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/huawei/openalliance/ad/media/a;->a()Ljava/lang/String;

    move-result-object v0

    const-string v1, "onError: %s"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    invoke-static {v0, v1, v2}, Lcom/huawei/openalliance/ad/g/c;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/a$2;->a:Lcom/huawei/openalliance/ad/media/a;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/media/a;->a(Lcom/huawei/openalliance/ad/media/a;)[B

    move-result-object v4

    monitor-enter v4

    :try_start_0
    invoke-virtual {p1, p0}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->removeMediaErrorListener(Lcom/huawei/openalliance/ad/media/listener/MediaErrorListener;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v4

    goto :goto_0

    :catchall_0
    move-exception v5

    monitor-exit v4

    throw v5

    :goto_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/a$2;->a:Lcom/huawei/openalliance/ad/media/a;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/media/a;->c(Lcom/huawei/openalliance/ad/media/a;)V

    return-void
.end method
