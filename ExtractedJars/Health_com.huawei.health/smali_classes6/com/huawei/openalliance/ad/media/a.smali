.class public Lcom/huawei/openalliance/ad/media/a;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/huawei/openalliance/ad/media/IMultiMediaPlayingManager;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/openalliance/ad/media/a$a;
    }
.end annotation


# static fields
.field private static final a:Ljava/lang/String;

.field private static b:Lcom/huawei/openalliance/ad/media/a;

.field private static final c:[B


# instance fields
.field private final d:[B

.field private e:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

.field private f:Ljava/util/Queue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Queue<Lcom/huawei/openalliance/ad/media/a$a;>;"
        }
    .end annotation
.end field

.field private g:Landroid/content/Context;

.field private h:Lcom/huawei/openalliance/ad/media/listener/MediaStateListener;

.field private i:Lcom/huawei/openalliance/ad/media/listener/MediaErrorListener;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lcom/huawei/openalliance/ad/media/a;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/openalliance/ad/media/a;->a:Ljava/lang/String;

    const/4 v0, 0x0

    new-array v0, v0, [B

    sput-object v0, Lcom/huawei/openalliance/ad/media/a;->c:[B

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    new-array v0, v0, [B

    iput-object v0, p0, Lcom/huawei/openalliance/ad/media/a;->d:[B

    new-instance v0, Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;-><init>()V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/media/a;->f:Ljava/util/Queue;

    new-instance v0, Lcom/huawei/openalliance/ad/media/a$1;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/media/a$1;-><init>(Lcom/huawei/openalliance/ad/media/a;)V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/media/a;->h:Lcom/huawei/openalliance/ad/media/listener/MediaStateListener;

    new-instance v0, Lcom/huawei/openalliance/ad/media/a$2;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/media/a$2;-><init>(Lcom/huawei/openalliance/ad/media/a;)V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/media/a;->i:Lcom/huawei/openalliance/ad/media/listener/MediaErrorListener;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/media/a;->g:Landroid/content/Context;

    return-void
.end method

.method public static a(Landroid/content/Context;)Lcom/huawei/openalliance/ad/media/a;
    .locals 3

    sget-object v1, Lcom/huawei/openalliance/ad/media/a;->c:[B

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/huawei/openalliance/ad/media/a;->b:Lcom/huawei/openalliance/ad/media/a;

    if-nez v0, :cond_0

    new-instance v0, Lcom/huawei/openalliance/ad/media/a;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/media/a;-><init>(Landroid/content/Context;)V

    sput-object v0, Lcom/huawei/openalliance/ad/media/a;->b:Lcom/huawei/openalliance/ad/media/a;

    :cond_0
    sget-object v0, Lcom/huawei/openalliance/ad/media/a;->b:Lcom/huawei/openalliance/ad/media/a;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method

.method static synthetic a()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/huawei/openalliance/ad/media/a;->a:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic a(Lcom/huawei/openalliance/ad/media/a;)[B
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/a;->d:[B

    return-object v0
.end method

.method static synthetic b(Lcom/huawei/openalliance/ad/media/a;)Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/a;->e:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

    return-object v0
.end method

.method private b()V
    .locals 8

    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/a;->g:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/w;->b(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v5, p0, Lcom/huawei/openalliance/ad/media/a;->d:[B

    monitor-enter v5

    :try_start_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/a;->f:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Queue;->poll()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/openalliance/ad/media/a$a;

    invoke-static {}, Lcom/huawei/openalliance/ad/g/c;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, Lcom/huawei/openalliance/ad/media/a;->a:Ljava/lang/String;

    const-string v1, "playNextTask - task: %s currentPlayer: %s"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v6, v2, v3

    iget-object v3, p0, Lcom/huawei/openalliance/ad/media/a;->e:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-static {v0, v1, v2}, Lcom/huawei/openalliance/ad/g/c;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_1
    if-eqz v6, :cond_3

    invoke-static {}, Lcom/huawei/openalliance/ad/g/c;->a()Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object v0, Lcom/huawei/openalliance/ad/media/a;->a:Ljava/lang/String;

    const-string v1, "playNextTask - play: %s"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v3, v6, Lcom/huawei/openalliance/ad/media/a$a;->b:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v0, v1, v2}, Lcom/huawei/openalliance/ad/g/c;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_2
    iget-object v0, v6, Lcom/huawei/openalliance/ad/media/a$a;->b:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/media/a;->h:Lcom/huawei/openalliance/ad/media/listener/MediaStateListener;

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->addMediaStateListener(Lcom/huawei/openalliance/ad/media/listener/MediaStateListener;)V

    iget-object v0, v6, Lcom/huawei/openalliance/ad/media/a$a;->b:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/media/a;->i:Lcom/huawei/openalliance/ad/media/listener/MediaErrorListener;

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->addMediaErrorListener(Lcom/huawei/openalliance/ad/media/listener/MediaErrorListener;)V

    iget-object v0, v6, Lcom/huawei/openalliance/ad/media/a$a;->b:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

    iget-object v1, v6, Lcom/huawei/openalliance/ad/media/a$a;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->playWhenUrlMatchs(Ljava/lang/String;)V

    iget-object v0, v6, Lcom/huawei/openalliance/ad/media/a$a;->b:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

    iput-object v0, p0, Lcom/huawei/openalliance/ad/media/a;->e:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

    goto :goto_0

    :cond_3
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/media/a;->e:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    monitor-exit v5

    goto :goto_1

    :catchall_0
    move-exception v7

    monitor-exit v5

    throw v7

    :goto_1
    return-void
.end method

.method static synthetic c(Lcom/huawei/openalliance/ad/media/a;)V
    .locals 0

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/media/a;->b()V

    return-void
.end method


# virtual methods
.method public autoPlay(Ljava/lang/String;Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;)V
    .locals 8

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    if-nez p2, :cond_1

    :cond_0
    return-void

    :cond_1
    iget-object v5, p0, Lcom/huawei/openalliance/ad/media/a;->d:[B

    monitor-enter v5

    :try_start_0
    invoke-static {}, Lcom/huawei/openalliance/ad/g/c;->a()Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object v0, Lcom/huawei/openalliance/ad/media/a;->a:Ljava/lang/String;

    const-string v1, "autoPlay - url: %s player: %s"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {p1}, Lcom/huawei/openalliance/ad/utils/ak;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    aput-object p2, v2, v3

    invoke-static {v0, v1, v2}, Lcom/huawei/openalliance/ad/g/c;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_2
    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/a;->e:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

    if-eq p2, v0, :cond_3

    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/a;->e:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

    if-nez v0, :cond_4

    :cond_3
    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/a;->h:Lcom/huawei/openalliance/ad/media/listener/MediaStateListener;

    invoke-virtual {p2, v0}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->addMediaStateListener(Lcom/huawei/openalliance/ad/media/listener/MediaStateListener;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/a;->i:Lcom/huawei/openalliance/ad/media/listener/MediaErrorListener;

    invoke-virtual {p2, v0}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->addMediaErrorListener(Lcom/huawei/openalliance/ad/media/listener/MediaErrorListener;)V

    invoke-virtual {p2, p1}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->playWhenUrlMatchs(Ljava/lang/String;)V

    iput-object p2, p0, Lcom/huawei/openalliance/ad/media/a;->e:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

    sget-object v0, Lcom/huawei/openalliance/ad/media/a;->a:Ljava/lang/String;

    const-string v1, "autoPlay - play directly"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_4
    new-instance v6, Lcom/huawei/openalliance/ad/media/a$a;

    invoke-direct {v6, p1, p2}, Lcom/huawei/openalliance/ad/media/a$a;-><init>(Ljava/lang/String;Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/a;->f:Ljava/util/Queue;

    invoke-interface {v0, v6}, Ljava/util/Queue;->remove(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/a;->f:Ljava/util/Queue;

    invoke-interface {v0, v6}, Ljava/util/Queue;->add(Ljava/lang/Object;)Z

    sget-object v0, Lcom/huawei/openalliance/ad/media/a;->a:Ljava/lang/String;

    const-string v1, "autoPlay - add to queue"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    monitor-exit v5

    goto :goto_1

    :catchall_0
    move-exception v7

    monitor-exit v5

    throw v7

    :goto_1
    return-void
.end method

.method public manualPlay(Ljava/lang/String;Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;)V
    .locals 7

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    if-nez p2, :cond_1

    :cond_0
    return-void

    :cond_1
    iget-object v5, p0, Lcom/huawei/openalliance/ad/media/a;->d:[B

    monitor-enter v5

    :try_start_0
    invoke-static {}, Lcom/huawei/openalliance/ad/g/c;->a()Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object v0, Lcom/huawei/openalliance/ad/media/a;->a:Ljava/lang/String;

    const-string v1, "manualPlay - url: %s player: %s"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {p1}, Lcom/huawei/openalliance/ad/utils/ak;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    aput-object p2, v2, v3

    invoke-static {v0, v1, v2}, Lcom/huawei/openalliance/ad/g/c;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_2
    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/a;->e:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/a;->e:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

    if-eq p2, v0, :cond_3

    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/a;->e:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->stop()V

    sget-object v0, Lcom/huawei/openalliance/ad/media/a;->a:Ljava/lang/String;

    const-string v1, "manualPlay - stop other"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    :cond_3
    sget-object v0, Lcom/huawei/openalliance/ad/media/a;->a:Ljava/lang/String;

    const-string v1, "manualPlay - play new"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/a;->h:Lcom/huawei/openalliance/ad/media/listener/MediaStateListener;

    invoke-virtual {p2, v0}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->addMediaStateListener(Lcom/huawei/openalliance/ad/media/listener/MediaStateListener;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/a;->i:Lcom/huawei/openalliance/ad/media/listener/MediaErrorListener;

    invoke-virtual {p2, v0}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->addMediaErrorListener(Lcom/huawei/openalliance/ad/media/listener/MediaErrorListener;)V

    invoke-virtual {p2, p1}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->playWhenUrlMatchs(Ljava/lang/String;)V

    iput-object p2, p0, Lcom/huawei/openalliance/ad/media/a;->e:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/a;->f:Ljava/util/Queue;

    new-instance v1, Lcom/huawei/openalliance/ad/media/a$a;

    invoke-direct {v1, p1, p2}, Lcom/huawei/openalliance/ad/media/a$a;-><init>(Ljava/lang/String;Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;)V

    invoke-interface {v0, v1}, Ljava/util/Queue;->remove(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v5

    goto :goto_0

    :catchall_0
    move-exception v6

    monitor-exit v5

    throw v6

    :goto_0
    return-void
.end method

.method public pause(Ljava/lang/String;Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;)V
    .locals 7

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    if-nez p2, :cond_1

    :cond_0
    return-void

    :cond_1
    iget-object v5, p0, Lcom/huawei/openalliance/ad/media/a;->d:[B

    monitor-enter v5

    :try_start_0
    invoke-static {}, Lcom/huawei/openalliance/ad/g/c;->a()Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object v0, Lcom/huawei/openalliance/ad/media/a;->a:Ljava/lang/String;

    const-string v1, "pause - url: %s player: %s"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {p1}, Lcom/huawei/openalliance/ad/utils/ak;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    aput-object p2, v2, v3

    invoke-static {v0, v1, v2}, Lcom/huawei/openalliance/ad/g/c;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_2
    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/a;->e:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

    if-ne p2, v0, :cond_3

    sget-object v0, Lcom/huawei/openalliance/ad/media/a;->a:Ljava/lang/String;

    const-string v1, "pause current"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->pauseWhenUrlMatchs(Ljava/lang/String;)V

    goto :goto_0

    :cond_3
    sget-object v0, Lcom/huawei/openalliance/ad/media/a;->a:Ljava/lang/String;

    const-string v1, "pause - remove from queue"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/a;->f:Ljava/util/Queue;

    new-instance v1, Lcom/huawei/openalliance/ad/media/a$a;

    invoke-direct {v1, p1, p2}, Lcom/huawei/openalliance/ad/media/a$a;-><init>(Ljava/lang/String;Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;)V

    invoke-interface {v0, v1}, Ljava/util/Queue;->remove(Ljava/lang/Object;)Z

    invoke-virtual {p0, p2}, Lcom/huawei/openalliance/ad/media/a;->removeListenersForMediaPlayerAgent(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    monitor-exit v5

    goto :goto_1

    :catchall_0
    move-exception v6

    monitor-exit v5

    throw v6

    :goto_1
    return-void
.end method

.method public removeListenersForMediaPlayerAgent(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;)V
    .locals 3

    iget-object v1, p0, Lcom/huawei/openalliance/ad/media/a;->d:[B

    monitor-enter v1

    if-eqz p1, :cond_0

    :try_start_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/a;->h:Lcom/huawei/openalliance/ad/media/listener/MediaStateListener;

    invoke-virtual {p1, v0}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->removeMediaStateListener(Lcom/huawei/openalliance/ad/media/listener/MediaStateListener;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/a;->i:Lcom/huawei/openalliance/ad/media/listener/MediaErrorListener;

    invoke-virtual {p1, v0}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->removeMediaErrorListener(Lcom/huawei/openalliance/ad/media/listener/MediaErrorListener;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2

    :goto_0
    return-void
.end method

.method public removeMediaPlayerAgent(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;)V
    .locals 5

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget-object v1, p0, Lcom/huawei/openalliance/ad/media/a;->d:[B

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/a;->e:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

    if-ne p1, v0, :cond_1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/a;->e:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

    invoke-virtual {p0, v0}, Lcom/huawei/openalliance/ad/media/a;->removeListenersForMediaPlayerAgent(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/media/a;->e:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

    :cond_1
    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/a;->f:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Queue;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/openalliance/ad/media/a$a;

    iget-object v0, v3, Lcom/huawei/openalliance/ad/media/a$a;->b:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

    if-ne v0, p1, :cond_2

    iget-object v0, v3, Lcom/huawei/openalliance/ad/media/a$a;->b:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

    invoke-virtual {p0, v0}, Lcom/huawei/openalliance/ad/media/a;->removeListenersForMediaPlayerAgent(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;)V

    invoke-interface {v2}, Ljava/util/Iterator;->remove()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_2
    goto :goto_0

    :cond_3
    monitor-exit v1

    goto :goto_1

    :catchall_0
    move-exception v4

    monitor-exit v1

    throw v4

    :goto_1
    return-void
.end method

.method public stop(Ljava/lang/String;Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;)V
    .locals 7

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    if-nez p2, :cond_1

    :cond_0
    return-void

    :cond_1
    iget-object v5, p0, Lcom/huawei/openalliance/ad/media/a;->d:[B

    monitor-enter v5

    :try_start_0
    invoke-static {}, Lcom/huawei/openalliance/ad/g/c;->a()Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object v0, Lcom/huawei/openalliance/ad/media/a;->a:Ljava/lang/String;

    const-string v1, "stop - url: %s player: %s"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {p1}, Lcom/huawei/openalliance/ad/utils/ak;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    aput-object p2, v2, v3

    invoke-static {v0, v1, v2}, Lcom/huawei/openalliance/ad/g/c;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_2
    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/a;->e:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

    if-ne p2, v0, :cond_3

    sget-object v0, Lcom/huawei/openalliance/ad/media/a;->a:Ljava/lang/String;

    const-string v1, "stop current"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/media/a;->e:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

    invoke-virtual {p2, p1}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->stopWhenUrlMatchs(Ljava/lang/String;)V

    goto :goto_0

    :cond_3
    sget-object v0, Lcom/huawei/openalliance/ad/media/a;->a:Ljava/lang/String;

    const-string v1, "stop - remove from queue"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/a;->f:Ljava/util/Queue;

    new-instance v1, Lcom/huawei/openalliance/ad/media/a$a;

    invoke-direct {v1, p1, p2}, Lcom/huawei/openalliance/ad/media/a$a;-><init>(Ljava/lang/String;Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;)V

    invoke-interface {v0, v1}, Ljava/util/Queue;->remove(Ljava/lang/Object;)Z

    invoke-virtual {p0, p2}, Lcom/huawei/openalliance/ad/media/a;->removeListenersForMediaPlayerAgent(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    monitor-exit v5

    goto :goto_1

    :catchall_0
    move-exception v6

    monitor-exit v5

    throw v6

    :goto_1
    return-void
.end method
