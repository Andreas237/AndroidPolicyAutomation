.class Lcom/huawei/openalliance/ad/media/a$1;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/huawei/openalliance/ad/media/listener/MediaStateListener;


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

    iput-object p1, p0, Lcom/huawei/openalliance/ad/media/a$1;->a:Lcom/huawei/openalliance/ad/media/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private a()V
    .locals 7

    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/a$1;->a:Lcom/huawei/openalliance/ad/media/a;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/media/a;->a(Lcom/huawei/openalliance/ad/media/a;)[B

    move-result-object v5

    monitor-enter v5

    :try_start_0
    invoke-static {}, Lcom/huawei/openalliance/ad/g/c;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/huawei/openalliance/ad/media/a;->a()Ljava/lang/String;

    move-result-object v0

    const-string v1, "checkAndPlayNext current player: %s"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/huawei/openalliance/ad/media/a$1;->a:Lcom/huawei/openalliance/ad/media/a;

    invoke-static {v3}, Lcom/huawei/openalliance/ad/media/a;->b(Lcom/huawei/openalliance/ad/media/a;)Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v0, v1, v2}, Lcom/huawei/openalliance/ad/g/c;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/a$1;->a:Lcom/huawei/openalliance/ad/media/a;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/media/a;->b(Lcom/huawei/openalliance/ad/media/a;)Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

    move-result-object v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/a$1;->a:Lcom/huawei/openalliance/ad/media/a;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/media/a;->c(Lcom/huawei/openalliance/ad/media/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    monitor-exit v5

    goto :goto_0

    :catchall_0
    move-exception v6

    monitor-exit v5

    throw v6

    :goto_0
    return-void
.end method


# virtual methods
.method public onMediaCompletion(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;I)V
    .locals 4

    invoke-static {}, Lcom/huawei/openalliance/ad/g/c;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/huawei/openalliance/ad/media/a;->a()Ljava/lang/String;

    move-result-object v0

    const-string v1, "onMediaCompletion: %s"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    invoke-static {v0, v1, v2}, Lcom/huawei/openalliance/ad/g/c;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/a$1;->a:Lcom/huawei/openalliance/ad/media/a;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/media/a;->c(Lcom/huawei/openalliance/ad/media/a;)V

    return-void
.end method

.method public onMediaPause(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;I)V
    .locals 4

    invoke-static {}, Lcom/huawei/openalliance/ad/g/c;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/huawei/openalliance/ad/media/a;->a()Ljava/lang/String;

    move-result-object v0

    const-string v1, "onMediaPause: %s"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    invoke-static {v0, v1, v2}, Lcom/huawei/openalliance/ad/g/c;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    invoke-direct {p0}, Lcom/huawei/openalliance/ad/media/a$1;->a()V

    return-void
.end method

.method public onMediaStart(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;I)V
    .locals 0

    return-void
.end method

.method public onMediaStop(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;I)V
    .locals 4

    invoke-static {}, Lcom/huawei/openalliance/ad/g/c;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/huawei/openalliance/ad/media/a;->a()Ljava/lang/String;

    move-result-object v0

    const-string v1, "onMediaStop: %s"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    invoke-static {v0, v1, v2}, Lcom/huawei/openalliance/ad/g/c;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    invoke-direct {p0}, Lcom/huawei/openalliance/ad/media/a$1;->a()V

    return-void
.end method

.method public onProgress(II)V
    .locals 0

    return-void
.end method
