.class public Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;
.super Ljava/lang/Object;


# annotations
.annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
.end annotation


# static fields
.field private static final a:Lcom/huawei/openalliance/ad/utils/k;


# instance fields
.field private final A:Ljava/util/concurrent/CopyOnWriteArraySet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/CopyOnWriteArraySet<Lcom/huawei/openalliance/ad/media/listener/a;>;"
        }
    .end annotation
.end field

.field private B:Landroid/media/MediaPlayer$OnVideoSizeChangedListener;

.field private C:Landroid/media/MediaPlayer$OnCompletionListener;

.field private D:Landroid/media/MediaPlayer$OnInfoListener;

.field private E:Landroid/media/MediaPlayer$OnPreparedListener;

.field private F:Landroid/media/MediaPlayer$OnErrorListener;

.field private G:Landroid/media/MediaPlayer$OnBufferingUpdateListener;

.field private H:Ljava/util/concurrent/Callable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/Callable<Ljava/lang/Boolean;>;"
        }
    .end annotation
.end field

.field private I:Ljava/lang/Runnable;

.field private J:Landroid/media/AudioManager$OnAudioFocusChangeListener;

.field private b:Landroid/media/MediaPlayer;

.field private c:I

.field private d:Ljava/lang/String;

.field private e:Ljava/lang/String;

.field private f:Z

.field private g:Z

.field private h:Z

.field private i:I

.field private j:I

.field private k:I

.field private final l:Lcom/huawei/openalliance/ad/media/MediaState;

.field private final m:[B

.field private final n:[B

.field private final o:[B

.field private p:I

.field private q:Landroid/media/AudioManager;

.field private r:Z

.field private s:Z

.field private t:I

.field private u:Z

.field private v:Ljava/lang/Object;

.field private final w:Ljava/util/concurrent/CopyOnWriteArraySet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/CopyOnWriteArraySet<Lcom/huawei/openalliance/ad/media/listener/MediaStateListener;>;"
        }
    .end annotation
.end field

.field private final x:Ljava/util/concurrent/CopyOnWriteArraySet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/CopyOnWriteArraySet<Lcom/huawei/openalliance/ad/media/listener/MediaBufferListener;>;"
        }
    .end annotation
.end field

.field private final y:Ljava/util/concurrent/CopyOnWriteArraySet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/CopyOnWriteArraySet<Lcom/huawei/openalliance/ad/media/listener/MediaErrorListener;>;"
        }
    .end annotation
.end field

.field private final z:Ljava/util/concurrent/CopyOnWriteArraySet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/CopyOnWriteArraySet<Lcom/huawei/openalliance/ad/media/listener/MuteListener;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/huawei/openalliance/ad/utils/k;

    const-string v1, "thread_media_player_ctrl"

    invoke-direct {v0, v1}, Lcom/huawei/openalliance/ad/utils/k;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->a:Lcom/huawei/openalliance/ad/utils/k;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->c:I

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->g:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->h:Z

    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->i:I

    new-instance v0, Lcom/huawei/openalliance/ad/media/MediaState;

    invoke-direct {v0}, Lcom/huawei/openalliance/ad/media/MediaState;-><init>()V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->l:Lcom/huawei/openalliance/ad/media/MediaState;

    const/4 v0, 0x0

    new-array v0, v0, [B

    iput-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->m:[B

    const/4 v0, 0x0

    new-array v0, v0, [B

    iput-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->n:[B

    const/4 v0, 0x0

    new-array v0, v0, [B

    iput-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->o:[B

    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->p:I

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->r:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->s:Z

    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->t:I

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->u:Z

    new-instance v0, Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->w:Ljava/util/concurrent/CopyOnWriteArraySet;

    new-instance v0, Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->x:Ljava/util/concurrent/CopyOnWriteArraySet;

    new-instance v0, Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->y:Ljava/util/concurrent/CopyOnWriteArraySet;

    new-instance v0, Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->z:Ljava/util/concurrent/CopyOnWriteArraySet;

    new-instance v0, Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->A:Ljava/util/concurrent/CopyOnWriteArraySet;

    new-instance v0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$1;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$1;-><init>(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;)V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->C:Landroid/media/MediaPlayer$OnCompletionListener;

    new-instance v0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$12;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$12;-><init>(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;)V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->D:Landroid/media/MediaPlayer$OnInfoListener;

    new-instance v0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$23;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$23;-><init>(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;)V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->E:Landroid/media/MediaPlayer$OnPreparedListener;

    new-instance v0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$29;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$29;-><init>(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;)V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->F:Landroid/media/MediaPlayer$OnErrorListener;

    new-instance v0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$30;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$30;-><init>(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;)V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->G:Landroid/media/MediaPlayer$OnBufferingUpdateListener;

    new-instance v0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$4;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$4;-><init>(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;)V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->H:Ljava/util/concurrent/Callable;

    new-instance v0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$25;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$25;-><init>(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;)V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->I:Ljava/lang/Runnable;

    new-instance v0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$28;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$28;-><init>(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;)V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->J:Landroid/media/AudioManager$OnAudioFocusChangeListener;

    const-string v0, "audio"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/media/AudioManager;

    iput-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->q:Landroid/media/AudioManager;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "progress_task"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->d:Ljava/lang/String;

    sget-object v0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->a:Lcom/huawei/openalliance/ad/utils/k;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/utils/k;->a()V

    return-void
.end method

.method static synthetic A(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;)Ljava/lang/Runnable;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->I:Ljava/lang/Runnable;

    return-object v0
.end method

.method static synthetic B(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;)V
    .locals 0

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->p()V

    return-void
.end method

.method static synthetic C(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;)V
    .locals 0

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->q()V

    return-void
.end method

.method static synthetic D(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;)I
    .locals 1

    iget v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->t:I

    return v0
.end method

.method static synthetic E(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->u:Z

    return v0
.end method

.method static synthetic F(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->r:Z

    return v0
.end method

.method static synthetic G(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->s:Z

    return v0
.end method

.method private a()Landroid/media/MediaPlayer;
    .locals 5

    iget-object v2, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->m:[B

    monitor-enter v2

    :try_start_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->b:Landroid/media/MediaPlayer;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    new-instance v3, Landroid/media/MediaPlayer;

    invoke-direct {v3}, Landroid/media/MediaPlayer;-><init>()V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->C:Landroid/media/MediaPlayer$OnCompletionListener;

    invoke-virtual {v3, v0}, Landroid/media/MediaPlayer;->setOnCompletionListener(Landroid/media/MediaPlayer$OnCompletionListener;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->E:Landroid/media/MediaPlayer$OnPreparedListener;

    invoke-virtual {v3, v0}, Landroid/media/MediaPlayer;->setOnPreparedListener(Landroid/media/MediaPlayer$OnPreparedListener;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->F:Landroid/media/MediaPlayer$OnErrorListener;

    invoke-virtual {v3, v0}, Landroid/media/MediaPlayer;->setOnErrorListener(Landroid/media/MediaPlayer$OnErrorListener;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->G:Landroid/media/MediaPlayer$OnBufferingUpdateListener;

    invoke-virtual {v3, v0}, Landroid/media/MediaPlayer;->setOnBufferingUpdateListener(Landroid/media/MediaPlayer$OnBufferingUpdateListener;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->B:Landroid/media/MediaPlayer$OnVideoSizeChangedListener;

    invoke-virtual {v3, v0}, Landroid/media/MediaPlayer;->setOnVideoSizeChangedListener(Landroid/media/MediaPlayer$OnVideoSizeChangedListener;)V

    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Landroid/media/MediaPlayer;->setLooping(Z)V

    const/4 v0, 0x3

    invoke-virtual {v3, v0}, Landroid/media/MediaPlayer;->setAudioStreamType(I)V

    iput-object v3, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->b:Landroid/media/MediaPlayer;

    :cond_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->b:Landroid/media/MediaPlayer;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    return-object v0

    :catchall_0
    move-exception v4

    monitor-exit v2

    throw v4
.end method

.method static synthetic a(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;)Lcom/huawei/openalliance/ad/media/MediaState;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->l:Lcom/huawei/openalliance/ad/media/MediaState;

    return-object v0
.end method

.method private a(I)V
    .locals 5

    const-string v0, "MediaPlayerAgent"

    const-string v1, "notifyMediaCompletion playTime: %d"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v0, v1, v2}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->s()V

    new-instance v0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$13;

    invoke-direct {v0, p0, p1}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$13;-><init>(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;I)V

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/aj;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method private a(II)V
    .locals 1

    new-instance v0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$11;

    invoke-direct {v0, p0, p1, p2}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$11;-><init>(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;II)V

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/aj;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method private a(III)V
    .locals 5

    const-string v0, "MediaPlayerAgent"

    const-string v1, "notifyError playTime: %d"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v0, v1, v2}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->s()V

    new-instance v0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$20;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$20;-><init>(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;III)V

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/aj;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method private a(Landroid/media/MediaPlayer$OnVideoSizeChangedListener;)V
    .locals 5

    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->l:Lcom/huawei/openalliance/ad/media/MediaState;

    sget-object v1, Lcom/huawei/openalliance/ad/media/MediaState$State;->END:Lcom/huawei/openalliance/ad/media/MediaState$State;

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/media/MediaState;->isState(Lcom/huawei/openalliance/ad/media/MediaState$State;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v2, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->m:[B

    monitor-enter v2

    :try_start_0
    iput-object p1, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->B:Landroid/media/MediaPlayer$OnVideoSizeChangedListener;

    iget-object v3, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->b:Landroid/media/MediaPlayer;

    if-eqz v3, :cond_1

    invoke-virtual {v3, p1}, Landroid/media/MediaPlayer;->setOnVideoSizeChangedListener(Landroid/media/MediaPlayer$OnVideoSizeChangedListener;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v4

    monitor-exit v2

    throw v4

    :goto_0
    return-void
.end method

.method private a(Landroid/view/Surface;)V
    .locals 3

    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->l:Lcom/huawei/openalliance/ad/media/MediaState;

    sget-object v1, Lcom/huawei/openalliance/ad/media/MediaState$State;->END:Lcom/huawei/openalliance/ad/media/MediaState$State;

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/media/MediaState;->isState(Lcom/huawei/openalliance/ad/media/MediaState$State;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const-string v0, "MediaPlayerAgent"

    const-string v1, "setSurfaceInternal"

    :try_start_0
    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->a()Landroid/media/MediaPlayer;

    move-result-object v2

    invoke-virtual {v2, p1}, Landroid/media/MediaPlayer;->setSurface(Landroid/view/Surface;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v2

    const-string v0, "MediaPlayerAgent"

    const-string v1, "setSurface IllegalStateException"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method static synthetic a(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;I)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->a(I)V

    return-void
.end method

.method static synthetic a(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;II)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->a(II)V

    return-void
.end method

.method static synthetic a(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;III)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->a(III)V

    return-void
.end method

.method static synthetic a(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;Landroid/media/MediaPlayer$OnVideoSizeChangedListener;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->a(Landroid/media/MediaPlayer$OnVideoSizeChangedListener;)V

    return-void
.end method

.method static synthetic a(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;Landroid/view/Surface;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->a(Landroid/view/Surface;)V

    return-void
.end method

.method static synthetic a(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;Ljava/lang/Runnable;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method static synthetic a(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;Ljava/lang/Runnable;Ljava/lang/String;J)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->a(Ljava/lang/Runnable;Ljava/lang/String;J)V

    return-void
.end method

.method static synthetic a(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->c(Ljava/lang/String;)V

    return-void
.end method

.method private a(Ljava/lang/Runnable;)V
    .locals 1

    sget-object v0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->a:Lcom/huawei/openalliance/ad/utils/k;

    invoke-virtual {v0, p1}, Lcom/huawei/openalliance/ad/utils/k;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method private a(Ljava/lang/Runnable;Ljava/lang/String;J)V
    .locals 1

    sget-object v0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->a:Lcom/huawei/openalliance/ad/utils/k;

    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/huawei/openalliance/ad/utils/k;->a(Ljava/lang/Runnable;Ljava/lang/String;J)V

    return-void
.end method

.method private a(Ljava/lang/String;)V
    .locals 8

    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->l:Lcom/huawei/openalliance/ad/media/MediaState;

    sget-object v1, Lcom/huawei/openalliance/ad/media/MediaState$State;->END:Lcom/huawei/openalliance/ad/media/MediaState$State;

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/media/MediaState;->isState(Lcom/huawei/openalliance/ad/media/MediaState$State;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const-string v0, "MediaPlayerAgent"

    const-string v1, "setMediaFileUrl: %s"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {p1}, Lcom/huawei/openalliance/ad/utils/ak;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v0, v1, v2}, Lcom/huawei/openalliance/ad/g/c;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->a()Landroid/media/MediaPlayer;

    move-result-object v5

    :try_start_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->l:Lcom/huawei/openalliance/ad/media/MediaState;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/media/MediaState;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {v5}, Landroid/media/MediaPlayer;->stop()V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    invoke-virtual {v5}, Landroid/media/MediaPlayer;->reset()V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->l:Lcom/huawei/openalliance/ad/media/MediaState;

    sget-object v1, Lcom/huawei/openalliance/ad/media/MediaState$State;->IDLE:Lcom/huawei/openalliance/ad/media/MediaState$State;

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/media/MediaState;->a(Lcom/huawei/openalliance/ad/media/MediaState$State;)V

    goto :goto_0

    :catch_0
    move-exception v6

    const-string v0, "MediaPlayerAgent"

    const-string v1, "setMediaFileUrl stop IllegalStateException"

    :try_start_1
    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-virtual {v5}, Landroid/media/MediaPlayer;->reset()V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->l:Lcom/huawei/openalliance/ad/media/MediaState;

    sget-object v1, Lcom/huawei/openalliance/ad/media/MediaState$State;->IDLE:Lcom/huawei/openalliance/ad/media/MediaState$State;

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/media/MediaState;->a(Lcom/huawei/openalliance/ad/media/MediaState$State;)V

    goto :goto_0

    :catchall_0
    move-exception v7

    invoke-virtual {v5}, Landroid/media/MediaPlayer;->reset()V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->l:Lcom/huawei/openalliance/ad/media/MediaState;

    sget-object v1, Lcom/huawei/openalliance/ad/media/MediaState$State;->IDLE:Lcom/huawei/openalliance/ad/media/MediaState$State;

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/media/MediaState;->a(Lcom/huawei/openalliance/ad/media/MediaState$State;)V

    throw v7

    :goto_0
    iput-object p1, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->e:Ljava/lang/String;

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    :try_start_2
    invoke-direct {p0, p1}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->b(Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_1

    :catch_1
    move-exception v6

    const-string v0, "MediaPlayerAgent"

    const-string v1, "setMediaFileUrl Exception"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->l:Lcom/huawei/openalliance/ad/media/MediaState;

    sget-object v1, Lcom/huawei/openalliance/ad/media/MediaState$State;->ERROR:Lcom/huawei/openalliance/ad/media/MediaState$State;

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/media/MediaState;->a(Lcom/huawei/openalliance/ad/media/MediaState$State;)V

    :cond_2
    :goto_1
    return-void
.end method

.method private a(F)Z
    .locals 3

    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->l:Lcom/huawei/openalliance/ad/media/MediaState;

    sget-object v1, Lcom/huawei/openalliance/ad/media/MediaState$State;->END:Lcom/huawei/openalliance/ad/media/MediaState$State;

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/media/MediaState;->isState(Lcom/huawei/openalliance/ad/media/MediaState$State;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->l:Lcom/huawei/openalliance/ad/media/MediaState;

    sget-object v1, Lcom/huawei/openalliance/ad/media/MediaState$State;->ERROR:Lcom/huawei/openalliance/ad/media/MediaState$State;

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/media/MediaState;->isNotState(Lcom/huawei/openalliance/ad/media/MediaState$State;)Z

    move-result v0

    if-eqz v0, :cond_1

    :try_start_0
    invoke-direct {p0}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->a()Landroid/media/MediaPlayer;

    move-result-object v0

    invoke-virtual {v0, p1, p1}, Landroid/media/MediaPlayer;->setVolume(FF)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v0, 0x1

    return v0

    :catch_0
    move-exception v2

    const-string v0, "MediaPlayerAgent"

    const-string v1, "mute IllegalStateException"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method static synthetic a(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;F)Z
    .locals 1

    invoke-direct {p0, p1}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->a(F)Z

    move-result v0

    return v0
.end method

.method static synthetic a(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->h:Z

    return p1
.end method

.method static synthetic b(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;)I
    .locals 1

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->f()I

    move-result v0

    return v0
.end method

.method static synthetic b(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;I)I
    .locals 0

    iput p1, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->i:I

    return p1
.end method

.method private b()V
    .locals 7

    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->l:Lcom/huawei/openalliance/ad/media/MediaState;

    sget-object v1, Lcom/huawei/openalliance/ad/media/MediaState$State;->END:Lcom/huawei/openalliance/ad/media/MediaState$State;

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/media/MediaState;->isState(Lcom/huawei/openalliance/ad/media/MediaState$State;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "MediaPlayerAgent"

    const-string v1, "play - current state: %s - agent: %s"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->l:Lcom/huawei/openalliance/ad/media/MediaState;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    aput-object p0, v2, v3

    invoke-static {v0, v1, v2}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_0
    const-string v0, "MediaPlayerAgent"

    const-string v1, "play file: %s"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->e:Ljava/lang/String;

    invoke-static {v3}, Lcom/huawei/openalliance/ad/utils/ak;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v0, v1, v2}, Lcom/huawei/openalliance/ad/g/c;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->l:Lcom/huawei/openalliance/ad/media/MediaState;

    sget-object v1, Lcom/huawei/openalliance/ad/media/MediaState$State;->ERROR:Lcom/huawei/openalliance/ad/media/MediaState$State;

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/media/MediaState;->isState(Lcom/huawei/openalliance/ad/media/MediaState$State;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->l:Lcom/huawei/openalliance/ad/media/MediaState;

    sget-object v1, Lcom/huawei/openalliance/ad/media/MediaState$State;->IDLE:Lcom/huawei/openalliance/ad/media/MediaState$State;

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/media/MediaState;->isState(Lcom/huawei/openalliance/ad/media/MediaState$State;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->l:Lcom/huawei/openalliance/ad/media/MediaState;

    sget-object v1, Lcom/huawei/openalliance/ad/media/MediaState$State;->PLAYING:Lcom/huawei/openalliance/ad/media/MediaState$State;

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/media/MediaState;->isState(Lcom/huawei/openalliance/ad/media/MediaState$State;)Z

    move-result v0

    if-eqz v0, :cond_4

    :cond_1
    const-string v0, "MediaPlayerAgent"

    const-string v1, "play - current state: %s - agent: %s"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->l:Lcom/huawei/openalliance/ad/media/MediaState;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    aput-object p0, v2, v3

    invoke-static {v0, v1, v2}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->l:Lcom/huawei/openalliance/ad/media/MediaState;

    sget-object v1, Lcom/huawei/openalliance/ad/media/MediaState$State;->PLAYING:Lcom/huawei/openalliance/ad/media/MediaState$State;

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/media/MediaState;->isState(Lcom/huawei/openalliance/ad/media/MediaState$State;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->a()Landroid/media/MediaPlayer;

    move-result-object v0

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->getCurrentPosition()I

    move-result v0

    invoke-direct {p0, v0}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->c(I)V

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->o()V

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->e:Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->a(Ljava/lang/String;)V

    const-string v0, "MediaPlayerAgent"

    const-string v1, "play - current state after set file: %s"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->l:Lcom/huawei/openalliance/ad/media/MediaState;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v0, v1, v2}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->l:Lcom/huawei/openalliance/ad/media/MediaState;

    sget-object v1, Lcom/huawei/openalliance/ad/media/MediaState$State;->INITIALIZED:Lcom/huawei/openalliance/ad/media/MediaState$State;

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/media/MediaState;->isState(Lcom/huawei/openalliance/ad/media/MediaState$State;)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->c()V

    :cond_3
    :goto_0
    return-void

    :cond_4
    invoke-direct {p0}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->a()Landroid/media/MediaPlayer;

    move-result-object v5

    const-string v0, "MediaPlayerAgent"

    const-string v1, "play - state before play: %s - agent: %s"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->l:Lcom/huawei/openalliance/ad/media/MediaState;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    aput-object p0, v2, v3

    invoke-static {v0, v1, v2}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-boolean v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->h:Z

    if-nez v0, :cond_6

    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->l:Lcom/huawei/openalliance/ad/media/MediaState;

    sget-object v1, Lcom/huawei/openalliance/ad/media/MediaState$State;->PAUSED:Lcom/huawei/openalliance/ad/media/MediaState$State;

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/media/MediaState;->isState(Lcom/huawei/openalliance/ad/media/MediaState$State;)Z

    move-result v0

    if-nez v0, :cond_5

    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->l:Lcom/huawei/openalliance/ad/media/MediaState;

    sget-object v1, Lcom/huawei/openalliance/ad/media/MediaState$State;->PLAYBACK_COMPLETED:Lcom/huawei/openalliance/ad/media/MediaState$State;

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/media/MediaState;->isState(Lcom/huawei/openalliance/ad/media/MediaState$State;)Z

    move-result v0

    if-nez v0, :cond_5

    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->l:Lcom/huawei/openalliance/ad/media/MediaState;

    sget-object v1, Lcom/huawei/openalliance/ad/media/MediaState$State;->PREPARED:Lcom/huawei/openalliance/ad/media/MediaState$State;

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/media/MediaState;->isState(Lcom/huawei/openalliance/ad/media/MediaState$State;)Z

    move-result v0

    if-eqz v0, :cond_6

    :cond_5
    :try_start_0
    invoke-virtual {v5}, Landroid/media/MediaPlayer;->start()V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->l:Lcom/huawei/openalliance/ad/media/MediaState;

    sget-object v1, Lcom/huawei/openalliance/ad/media/MediaState$State;->PLAYING:Lcom/huawei/openalliance/ad/media/MediaState$State;

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/media/MediaState;->a(Lcom/huawei/openalliance/ad/media/MediaState$State;)V

    invoke-virtual {v5}, Landroid/media/MediaPlayer;->getCurrentPosition()I

    move-result v6

    invoke-direct {p0, v6}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->c(I)V

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->o()V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v6

    const-string v0, "MediaPlayerAgent"

    const-string v1, "play - start IllegalStateException"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->l:Lcom/huawei/openalliance/ad/media/MediaState;

    sget-object v1, Lcom/huawei/openalliance/ad/media/MediaState$State;->ERROR:Lcom/huawei/openalliance/ad/media/MediaState$State;

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/media/MediaState;->a(Lcom/huawei/openalliance/ad/media/MediaState$State;)V

    invoke-virtual {v5}, Landroid/media/MediaPlayer;->getCurrentPosition()I

    move-result v0

    const/16 v1, -0x64

    const/4 v2, 0x0

    invoke-direct {p0, v0, v1, v2}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->a(III)V

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->l()V

    goto :goto_1

    :cond_6
    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->e:Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->l:Lcom/huawei/openalliance/ad/media/MediaState;

    sget-object v1, Lcom/huawei/openalliance/ad/media/MediaState$State;->INITIALIZED:Lcom/huawei/openalliance/ad/media/MediaState$State;

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/media/MediaState;->isState(Lcom/huawei/openalliance/ad/media/MediaState$State;)Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->c()V

    :cond_7
    :goto_1
    const-string v0, "MediaPlayerAgent"

    const-string v1, "play - current state: %s"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->l:Lcom/huawei/openalliance/ad/media/MediaState;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v0, v1, v2}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method private b(I)V
    .locals 1

    iget-boolean v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->f:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$14;

    invoke-direct {v0, p0, p1}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$14;-><init>(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;I)V

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/aj;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method static synthetic b(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->a(Ljava/lang/String;)V

    return-void
.end method

.method private b(Ljava/lang/String;)V
    .locals 5

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-direct {p0}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->a()Landroid/media/MediaPlayer;

    move-result-object v2

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v3

    invoke-virtual {v3}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    invoke-virtual {v2, p1}, Landroid/media/MediaPlayer;->setDataSource(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    sget-object v0, Lcom/huawei/openalliance/ad/constant/Scheme;->FILE:Lcom/huawei/openalliance/ad/constant/Scheme;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/constant/Scheme;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object v0, Lcom/huawei/openalliance/ad/constant/Scheme;->FILE:Lcom/huawei/openalliance/ad/constant/Scheme;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/constant/Scheme;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Landroid/media/MediaPlayer;->setDataSource(Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    sget-object v0, Lcom/huawei/openalliance/ad/constant/Scheme;->HTTP:Lcom/huawei/openalliance/ad/constant/Scheme;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/constant/Scheme;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_3

    sget-object v0, Lcom/huawei/openalliance/ad/constant/Scheme;->HTTPS:Lcom/huawei/openalliance/ad/constant/Scheme;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/constant/Scheme;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    :cond_3
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->f:Z

    :cond_4
    invoke-virtual {v2, p1}, Landroid/media/MediaPlayer;->setDataSource(Ljava/lang/String;)V

    :goto_0
    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Landroid/media/MediaPlayer;->setVideoScalingMode(I)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->l:Lcom/huawei/openalliance/ad/media/MediaState;

    sget-object v1, Lcom/huawei/openalliance/ad/media/MediaState$State;->INITIALIZED:Lcom/huawei/openalliance/ad/media/MediaState$State;

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/media/MediaState;->a(Lcom/huawei/openalliance/ad/media/MediaState$State;)V

    return-void
.end method

.method static synthetic b(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->r:Z

    return p1
.end method

.method static synthetic c(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;I)I
    .locals 0

    iput p1, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->p:I

    return p1
.end method

.method private c()V
    .locals 3

    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->l:Lcom/huawei/openalliance/ad/media/MediaState;

    sget-object v1, Lcom/huawei/openalliance/ad/media/MediaState$State;->END:Lcom/huawei/openalliance/ad/media/MediaState$State;

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/media/MediaState;->isState(Lcom/huawei/openalliance/ad/media/MediaState$State;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const-string v0, "MediaPlayerAgent"

    const-string v1, "prepareMediaPlayer"

    :try_start_0
    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->l:Lcom/huawei/openalliance/ad/media/MediaState;

    sget-object v1, Lcom/huawei/openalliance/ad/media/MediaState$State;->PREPARING:Lcom/huawei/openalliance/ad/media/MediaState$State;

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/media/MediaState;->a(Lcom/huawei/openalliance/ad/media/MediaState$State;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->h:Z

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->a()Landroid/media/MediaPlayer;

    move-result-object v0

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->prepareAsync()V

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->k()V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v2

    const-string v0, "MediaPlayerAgent"

    const-string v1, "prepareMediaPlayer IllegalStateException"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->l:Lcom/huawei/openalliance/ad/media/MediaState;

    sget-object v1, Lcom/huawei/openalliance/ad/media/MediaState$State;->ERROR:Lcom/huawei/openalliance/ad/media/MediaState$State;

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/media/MediaState;->a(Lcom/huawei/openalliance/ad/media/MediaState$State;)V

    :goto_0
    return-void
.end method

.method private c(I)V
    .locals 5

    const-string v0, "MediaPlayerAgent"

    const-string v1, "notifyMediaStart playTime: %d"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v0, v1, v2}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->r()V

    new-instance v0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$17;

    invoke-direct {v0, p0, p1}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$17;-><init>(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;I)V

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/aj;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method static synthetic c(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;)V
    .locals 0

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->l()V

    return-void
.end method

.method private c(Ljava/lang/String;)V
    .locals 1

    sget-object v0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->a:Lcom/huawei/openalliance/ad/utils/k;

    invoke-virtual {v0, p1}, Lcom/huawei/openalliance/ad/utils/k;->a(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic c(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->s:Z

    return p1
.end method

.method static synthetic d(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->d:Ljava/lang/String;

    return-object v0
.end method

.method private d()V
    .locals 6

    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->l:Lcom/huawei/openalliance/ad/media/MediaState;

    sget-object v1, Lcom/huawei/openalliance/ad/media/MediaState$State;->END:Lcom/huawei/openalliance/ad/media/MediaState$State;

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/media/MediaState;->isState(Lcom/huawei/openalliance/ad/media/MediaState$State;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->l:Lcom/huawei/openalliance/ad/media/MediaState;

    sget-object v1, Lcom/huawei/openalliance/ad/media/MediaState$State;->ERROR:Lcom/huawei/openalliance/ad/media/MediaState$State;

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/media/MediaState;->isState(Lcom/huawei/openalliance/ad/media/MediaState$State;)Z

    move-result v0

    if-eqz v0, :cond_1

    return-void

    :cond_1
    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->l:Lcom/huawei/openalliance/ad/media/MediaState;

    sget-object v1, Lcom/huawei/openalliance/ad/media/MediaState$State;->IDLE:Lcom/huawei/openalliance/ad/media/MediaState$State;

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/media/MediaState;->isState(Lcom/huawei/openalliance/ad/media/MediaState$State;)Z

    move-result v0

    if-eqz v0, :cond_2

    return-void

    :cond_2
    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->l:Lcom/huawei/openalliance/ad/media/MediaState;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/media/MediaState;->a()Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->l:Lcom/huawei/openalliance/ad/media/MediaState;

    sget-object v1, Lcom/huawei/openalliance/ad/media/MediaState$State;->PREPARING:Lcom/huawei/openalliance/ad/media/MediaState$State;

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/media/MediaState;->isState(Lcom/huawei/openalliance/ad/media/MediaState$State;)Z

    move-result v0

    if-eqz v0, :cond_6

    :cond_3
    :try_start_0
    invoke-direct {p0}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->a()Landroid/media/MediaPlayer;

    move-result-object v4

    invoke-virtual {v4}, Landroid/media/MediaPlayer;->getCurrentPosition()I

    move-result v5

    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->l:Lcom/huawei/openalliance/ad/media/MediaState;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/media/MediaState;->a()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {v4}, Landroid/media/MediaPlayer;->stop()V

    :cond_4
    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->l:Lcom/huawei/openalliance/ad/media/MediaState;

    sget-object v1, Lcom/huawei/openalliance/ad/media/MediaState$State;->PLAYBACK_COMPLETED:Lcom/huawei/openalliance/ad/media/MediaState$State;

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/media/MediaState;->isState(Lcom/huawei/openalliance/ad/media/MediaState$State;)Z

    move-result v0

    if-eqz v0, :cond_5

    const/4 v0, 0x0

    goto :goto_0

    :cond_5
    move v0, v5

    :goto_0
    invoke-direct {p0, v0}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->d(I)V

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->a(II)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->l:Lcom/huawei/openalliance/ad/media/MediaState;

    sget-object v1, Lcom/huawei/openalliance/ad/media/MediaState$State;->INITIALIZED:Lcom/huawei/openalliance/ad/media/MediaState$State;

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/media/MediaState;->a(Lcom/huawei/openalliance/ad/media/MediaState$State;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v4

    const-string v0, "MediaPlayerAgent"

    const-string v1, "stop IllegalStateException"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->l:Lcom/huawei/openalliance/ad/media/MediaState;

    sget-object v1, Lcom/huawei/openalliance/ad/media/MediaState$State;->ERROR:Lcom/huawei/openalliance/ad/media/MediaState$State;

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/media/MediaState;->a(Lcom/huawei/openalliance/ad/media/MediaState$State;)V

    :cond_6
    :goto_1
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->i:I

    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->p:I

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->l()V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->d:Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->c(Ljava/lang/String;)V

    const-string v0, "MediaPlayerAgent"

    const-string v1, "stop - agent: %s"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p0, v2, v3

    invoke-static {v0, v1, v2}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method private d(I)V
    .locals 5

    const-string v0, "MediaPlayerAgent"

    const-string v1, "notifyMediaStop playTime: %d"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v0, v1, v2}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->s()V

    new-instance v0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$18;

    invoke-direct {v0, p0, p1}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$18;-><init>(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;I)V

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/aj;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method static synthetic d(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;I)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->c(I)V

    return-void
.end method

.method private e()V
    .locals 6

    const-string v0, "MediaPlayerAgent"

    const-string v1, "pauseInternal before State: %s - agent: %s"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->l:Lcom/huawei/openalliance/ad/media/MediaState;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    aput-object p0, v2, v3

    invoke-static {v0, v1, v2}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->r:Z

    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->l:Lcom/huawei/openalliance/ad/media/MediaState;

    sget-object v1, Lcom/huawei/openalliance/ad/media/MediaState$State;->END:Lcom/huawei/openalliance/ad/media/MediaState$State;

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/media/MediaState;->isState(Lcom/huawei/openalliance/ad/media/MediaState$State;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->l:Lcom/huawei/openalliance/ad/media/MediaState;

    sget-object v1, Lcom/huawei/openalliance/ad/media/MediaState$State;->ERROR:Lcom/huawei/openalliance/ad/media/MediaState$State;

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/media/MediaState;->isState(Lcom/huawei/openalliance/ad/media/MediaState$State;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->l:Lcom/huawei/openalliance/ad/media/MediaState;

    sget-object v1, Lcom/huawei/openalliance/ad/media/MediaState$State;->PAUSED:Lcom/huawei/openalliance/ad/media/MediaState$State;

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/media/MediaState;->isState(Lcom/huawei/openalliance/ad/media/MediaState$State;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->l:Lcom/huawei/openalliance/ad/media/MediaState;

    sget-object v1, Lcom/huawei/openalliance/ad/media/MediaState$State;->INITIALIZED:Lcom/huawei/openalliance/ad/media/MediaState$State;

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/media/MediaState;->isState(Lcom/huawei/openalliance/ad/media/MediaState$State;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->l:Lcom/huawei/openalliance/ad/media/MediaState;

    sget-object v1, Lcom/huawei/openalliance/ad/media/MediaState$State;->IDLE:Lcom/huawei/openalliance/ad/media/MediaState$State;

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/media/MediaState;->isState(Lcom/huawei/openalliance/ad/media/MediaState$State;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->l:Lcom/huawei/openalliance/ad/media/MediaState;

    sget-object v1, Lcom/huawei/openalliance/ad/media/MediaState$State;->PLAYBACK_COMPLETED:Lcom/huawei/openalliance/ad/media/MediaState$State;

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/media/MediaState;->isState(Lcom/huawei/openalliance/ad/media/MediaState$State;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    return-void

    :cond_1
    :try_start_0
    invoke-direct {p0}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->a()Landroid/media/MediaPlayer;

    move-result-object v5

    invoke-virtual {v5}, Landroid/media/MediaPlayer;->isPlaying()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {v5}, Landroid/media/MediaPlayer;->pause()V

    :cond_2
    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->l:Lcom/huawei/openalliance/ad/media/MediaState;

    sget-object v1, Lcom/huawei/openalliance/ad/media/MediaState$State;->PAUSED:Lcom/huawei/openalliance/ad/media/MediaState$State;

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/media/MediaState;->a(Lcom/huawei/openalliance/ad/media/MediaState$State;)V

    invoke-virtual {v5}, Landroid/media/MediaPlayer;->getCurrentPosition()I

    move-result v0

    invoke-direct {p0, v0}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->e(I)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v5

    const-string v0, "MediaPlayerAgent"

    const-string v1, "pause IllegalStateException"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->l:Lcom/huawei/openalliance/ad/media/MediaState;

    sget-object v1, Lcom/huawei/openalliance/ad/media/MediaState$State;->ERROR:Lcom/huawei/openalliance/ad/media/MediaState$State;

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/media/MediaState;->a(Lcom/huawei/openalliance/ad/media/MediaState$State;)V

    :goto_0
    invoke-direct {p0}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->l()V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->d:Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->c(Ljava/lang/String;)V

    const-string v0, "MediaPlayerAgent"

    const-string v1, "pause"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private e(I)V
    .locals 5

    const-string v0, "MediaPlayerAgent"

    const-string v1, "notifyMediaPause playTime: %d"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v0, v1, v2}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    new-instance v0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$19;

    invoke-direct {v0, p0, p1}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$19;-><init>(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;I)V

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/aj;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method static synthetic e(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;)V
    .locals 0

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->k()V

    return-void
.end method

.method static synthetic e(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;I)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->f(I)V

    return-void
.end method

.method private f()I
    .locals 6

    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->l:Lcom/huawei/openalliance/ad/media/MediaState;

    sget-object v1, Lcom/huawei/openalliance/ad/media/MediaState$State;->END:Lcom/huawei/openalliance/ad/media/MediaState$State;

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/media/MediaState;->isState(Lcom/huawei/openalliance/ad/media/MediaState$State;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    invoke-direct {p0}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->g()I

    move-result v2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->l:Lcom/huawei/openalliance/ad/media/MediaState;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/media/MediaState;->a()Z

    move-result v0

    if-eqz v0, :cond_2

    :try_start_0
    iget-object v4, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->m:[B

    monitor-enter v4
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    iget-object v3, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->b:Landroid/media/MediaPlayer;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v4

    goto :goto_0

    :catchall_0
    move-exception v5

    monitor-exit v4

    :try_start_2
    throw v5

    :goto_0
    if-eqz v3, :cond_1

    invoke-virtual {v3}, Landroid/media/MediaPlayer;->getDuration()I
    :try_end_2
    .catch Ljava/lang/IllegalStateException; {:try_start_2 .. :try_end_2} :catch_0

    move-result v4

    if-lez v4, :cond_1

    move v2, v4

    :cond_1
    goto :goto_1

    :catch_0
    move-exception v3

    const-string v0, "MediaPlayerAgent"

    const-string v1, "getDuration IllegalStateException"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    :goto_1
    return v2
.end method

.method static synthetic f(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;)Landroid/media/MediaPlayer$OnInfoListener;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->D:Landroid/media/MediaPlayer$OnInfoListener;

    return-object v0
.end method

.method private f(I)V
    .locals 5

    const-string v0, "MediaPlayerAgent"

    const-string v1, "notifyDurationReady: %d"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v0, v1, v2}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    new-instance v0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$24;

    invoke-direct {v0, p0, p1}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$24;-><init>(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;I)V

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/aj;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method static synthetic f(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;I)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->b(I)V

    return-void
.end method

.method private g()I
    .locals 3

    iget-object v1, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->n:[B

    monitor-enter v1

    :try_start_0
    iget v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->j:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return v0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method

.method static synthetic g(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;)I
    .locals 1

    iget v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->k:I

    return v0
.end method

.method static synthetic g(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;I)I
    .locals 0

    iput p1, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->t:I

    return p1
.end method

.method static synthetic h(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;)V
    .locals 0

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->o()V

    return-void
.end method

.method private h()Z
    .locals 5

    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->l:Lcom/huawei/openalliance/ad/media/MediaState;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/media/MediaState;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    :try_start_0
    iget-object v3, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->m:[B

    monitor-enter v3
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    iget-object v2, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->b:Landroid/media/MediaPlayer;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v3

    goto :goto_0

    :catchall_0
    move-exception v4

    monitor-exit v3

    :try_start_2
    throw v4

    :goto_0
    const/4 v0, 0x0

    if-eq v0, v2, :cond_0

    invoke-virtual {v2}, Landroid/media/MediaPlayer;->isPlaying()Z
    :try_end_2
    .catch Ljava/lang/IllegalStateException; {:try_start_2 .. :try_end_2} :catch_0

    move-result v0

    return v0

    :cond_0
    goto :goto_1

    :catch_0
    move-exception v2

    const-string v0, "MediaPlayerAgent"

    const-string v1, "isPlaying IllegalStateException"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    :goto_1
    const/4 v0, 0x0

    return v0
.end method

.method private i()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->s:Z

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->a(F)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->m()V

    :cond_0
    return-void
.end method

.method static synthetic i(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;)V
    .locals 0

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->b()V

    return-void
.end method

.method static synthetic j(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->e:Ljava/lang/String;

    return-object v0
.end method

.method private j()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->s:Z

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-direct {p0, v0}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->a(F)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->n()V

    :cond_0
    return-void
.end method

.method private k()V
    .locals 5

    iget-boolean v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->g:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-boolean v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->f:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->x:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->size()I

    move-result v0

    if-lez v0, :cond_2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->l:Lcom/huawei/openalliance/ad/media/MediaState;

    sget-object v1, Lcom/huawei/openalliance/ad/media/MediaState$State;->PLAYING:Lcom/huawei/openalliance/ad/media/MediaState$State;

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/media/MediaState;->isState(Lcom/huawei/openalliance/ad/media/MediaState$State;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->l:Lcom/huawei/openalliance/ad/media/MediaState;

    sget-object v1, Lcom/huawei/openalliance/ad/media/MediaState$State;->PREPARING:Lcom/huawei/openalliance/ad/media/MediaState$State;

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/media/MediaState;->isState(Lcom/huawei/openalliance/ad/media/MediaState$State;)Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_1
    const-string v0, "MediaPlayerAgent"

    const-string v1, "notifyBufferingStart currentState: %s"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->l:Lcom/huawei/openalliance/ad/media/MediaState;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v0, v1, v2}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->g:Z

    new-instance v0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$15;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$15;-><init>(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;)V

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/aj;->a(Ljava/lang/Runnable;)V

    :cond_2
    return-void
.end method

.method static synthetic k(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;)V
    .locals 0

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->d()V

    return-void
.end method

.method private l()V
    .locals 5

    iget-boolean v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->g:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->f:Z

    if-nez v0, :cond_1

    :cond_0
    return-void

    :cond_1
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->g:Z

    const-string v0, "MediaPlayerAgent"

    const-string v1, "notifyBufferingEnd currentState: %s"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->l:Lcom/huawei/openalliance/ad/media/MediaState;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v0, v1, v2}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    new-instance v0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$16;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$16;-><init>(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;)V

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/aj;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method static synthetic l(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;)V
    .locals 0

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->e()V

    return-void
.end method

.method private m()V
    .locals 2

    const-string v0, "MediaPlayerAgent"

    const-string v1, "notifyMute"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->u:Z

    new-instance v0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$21;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$21;-><init>(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;)V

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/aj;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method static synthetic m(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;)Z
    .locals 1

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->h()Z

    move-result v0

    return v0
.end method

.method private n()V
    .locals 2

    const-string v0, "MediaPlayerAgent"

    const-string v1, "notifyUnmute"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->u:Z

    new-instance v0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$22;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$22;-><init>(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;)V

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/aj;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method static synthetic n(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;)V
    .locals 0

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->i()V

    return-void
.end method

.method private o()V
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->d:Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->c(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->w:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->size()I

    move-result v0

    if-lez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->I:Ljava/lang/Runnable;

    invoke-direct {p0, v0}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->a(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method static synthetic o(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;)V
    .locals 0

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->j()V

    return-void
.end method

.method static synthetic p(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;)Ljava/util/concurrent/CopyOnWriteArraySet;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->w:Ljava/util/concurrent/CopyOnWriteArraySet;

    return-object v0
.end method

.method private p()V
    .locals 8

    iget-object v4, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->m:[B

    monitor-enter v4

    :try_start_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->l:Lcom/huawei/openalliance/ad/media/MediaState;

    sget-object v1, Lcom/huawei/openalliance/ad/media/MediaState$State;->END:Lcom/huawei/openalliance/ad/media/MediaState$State;

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/media/MediaState;->isState(Lcom/huawei/openalliance/ad/media/MediaState$State;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    move-result v0

    if-eqz v0, :cond_0

    monitor-exit v4

    return-void

    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->l:Lcom/huawei/openalliance/ad/media/MediaState;

    sget-object v1, Lcom/huawei/openalliance/ad/media/MediaState$State;->END:Lcom/huawei/openalliance/ad/media/MediaState$State;

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/media/MediaState;->a(Lcom/huawei/openalliance/ad/media/MediaState$State;)V

    const-string v0, "MediaPlayerAgent"

    const-string v1, "release - agent: %s"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p0, v2, v3

    invoke-static {v0, v1, v2}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    sget-object v0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->a:Lcom/huawei/openalliance/ad/utils/k;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/utils/k;->b()V

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->q()V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->b:Landroid/media/MediaPlayer;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    :try_start_2
    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->b:Landroid/media/MediaPlayer;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->setSurface(Landroid/view/Surface;)V
    :try_end_2
    .catch Ljava/lang/IllegalStateException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->b:Landroid/media/MediaPlayer;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->setOnVideoSizeChangedListener(Landroid/media/MediaPlayer$OnVideoSizeChangedListener;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->b:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->release()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->b:Landroid/media/MediaPlayer;

    const-string v0, "MediaPlayerAgent"

    const-string v1, "release media player"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_0

    :catch_0
    move-exception v5

    const-string v0, "MediaPlayerAgent"

    const-string v1, "media player reset surface IllegalStateException"

    :try_start_4
    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :try_start_5
    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->b:Landroid/media/MediaPlayer;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->setOnVideoSizeChangedListener(Landroid/media/MediaPlayer$OnVideoSizeChangedListener;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->b:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->release()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->b:Landroid/media/MediaPlayer;

    const-string v0, "MediaPlayerAgent"

    const-string v1, "release media player"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :catchall_0
    move-exception v6

    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->b:Landroid/media/MediaPlayer;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->setOnVideoSizeChangedListener(Landroid/media/MediaPlayer$OnVideoSizeChangedListener;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->b:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->release()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->b:Landroid/media/MediaPlayer;

    const-string v0, "MediaPlayerAgent"

    const-string v1, "release media player"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    throw v6

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->w:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->clear()V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->x:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->clear()V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->y:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->clear()V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->z:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->clear()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->B:Landroid/media/MediaPlayer$OnVideoSizeChangedListener;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    monitor-exit v4

    goto :goto_1

    :catchall_1
    move-exception v7

    monitor-exit v4

    throw v7

    :goto_1
    return-void
.end method

.method static synthetic q(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;)Ljava/util/concurrent/CopyOnWriteArraySet;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->x:Ljava/util/concurrent/CopyOnWriteArraySet;

    return-object v0
.end method

.method private q()V
    .locals 7

    iget-object v4, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->m:[B

    monitor-enter v4

    const-string v0, "MediaPlayerAgent"

    const-string v1, "resetInternal - agent: %s"

    const/4 v2, 0x1

    :try_start_0
    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p0, v2, v3

    invoke-static {v0, v1, v2}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->b:Landroid/media/MediaPlayer;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->l:Lcom/huawei/openalliance/ad/media/MediaState;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/media/MediaState;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->b:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->getCurrentPosition()I

    move-result v5

    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->b:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->stop()V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->l:Lcom/huawei/openalliance/ad/media/MediaState;

    sget-object v1, Lcom/huawei/openalliance/ad/media/MediaState$State;->PLAYBACK_COMPLETED:Lcom/huawei/openalliance/ad/media/MediaState$State;

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/media/MediaState;->isState(Lcom/huawei/openalliance/ad/media/MediaState$State;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    move v0, v5

    :goto_0
    invoke-direct {p0, v0}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->d(I)V

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->a(II)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->b(I)V

    :cond_1
    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->b:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->reset()V
    :try_end_1
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_2
    goto :goto_1

    :catch_0
    move-exception v5

    const-string v0, "MediaPlayerAgent"

    const-string v1, "media player reset IllegalStateException"

    :try_start_2
    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    :goto_1
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->i:I

    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->p:I

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->h:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->s:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->r:Z

    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->t:I

    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->l:Lcom/huawei/openalliance/ad/media/MediaState;

    sget-object v1, Lcom/huawei/openalliance/ad/media/MediaState$State;->IDLE:Lcom/huawei/openalliance/ad/media/MediaState$State;

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/media/MediaState;->a(Lcom/huawei/openalliance/ad/media/MediaState$State;)V

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->l()V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->d:Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->c(Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit v4

    goto :goto_2

    :catchall_0
    move-exception v6

    monitor-exit v4

    throw v6

    :goto_2
    return-void
.end method

.method static synthetic r(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;)Ljava/util/concurrent/CopyOnWriteArraySet;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->y:Ljava/util/concurrent/CopyOnWriteArraySet;

    return-object v0
.end method

.method private r()V
    .locals 5

    const-string v0, "MediaPlayerAgent"

    const-string v1, "requestAudioFocus"

    :try_start_0
    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-ge v0, v1, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->q:Landroid/media/AudioManager;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->J:Landroid/media/AudioManager$OnAudioFocusChangeListener;

    const/4 v2, 0x3

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v2, v3}, Landroid/media/AudioManager;->requestAudioFocus(Landroid/media/AudioManager$OnAudioFocusChangeListener;II)I

    goto :goto_0

    :cond_0
    new-instance v0, Landroid/media/AudioFocusRequest$Builder;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/media/AudioFocusRequest$Builder;-><init>(I)V

    iget-object v1, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->J:Landroid/media/AudioManager$OnAudioFocusChangeListener;

    invoke-virtual {v0, v1}, Landroid/media/AudioFocusRequest$Builder;->setOnAudioFocusChangeListener(Landroid/media/AudioManager$OnAudioFocusChangeListener;)Landroid/media/AudioFocusRequest$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/media/AudioFocusRequest$Builder;->build()Landroid/media/AudioFocusRequest;

    move-result-object v4

    iput-object v4, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->v:Ljava/lang/Object;

    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->q:Landroid/media/AudioManager;

    invoke-virtual {v0, v4}, Landroid/media/AudioManager;->requestAudioFocus(Landroid/media/AudioFocusRequest;)I
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    :goto_0
    goto :goto_1

    :catch_0
    move-exception v4

    const-string v0, "MediaPlayerAgent"

    const-string v1, "requestAudioFocus IllegalStateException"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :catch_1
    move-exception v4

    const-string v0, "MediaPlayerAgent"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "requestAudioFocus "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    :goto_1
    return-void
.end method

.method static synthetic s(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;)Ljava/util/concurrent/CopyOnWriteArraySet;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->z:Ljava/util/concurrent/CopyOnWriteArraySet;

    return-object v0
.end method

.method private s()V
    .locals 5

    const-string v0, "MediaPlayerAgent"

    const-string v1, "abandonAudioFocus"

    :try_start_0
    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-ge v0, v1, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->q:Landroid/media/AudioManager;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->J:Landroid/media/AudioManager$OnAudioFocusChangeListener;

    invoke-virtual {v0, v1}, Landroid/media/AudioManager;->abandonAudioFocus(Landroid/media/AudioManager$OnAudioFocusChangeListener;)I

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->v:Ljava/lang/Object;

    instance-of v0, v0, Landroid/media/AudioFocusRequest;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->q:Landroid/media/AudioManager;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->v:Ljava/lang/Object;

    check-cast v1, Landroid/media/AudioFocusRequest;

    invoke-virtual {v0, v1}, Landroid/media/AudioManager;->abandonAudioFocusRequest(Landroid/media/AudioFocusRequest;)I

    :cond_1
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->v:Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->s:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->r:Z

    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->t:I

    goto :goto_1

    :catch_0
    move-exception v3

    const-string v0, "MediaPlayerAgent"

    const-string v1, "abandonAudioFocus IllegalStateException"

    :try_start_1
    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->s:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->r:Z

    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->t:I

    goto :goto_1

    :catch_1
    move-exception v3

    const-string v0, "MediaPlayerAgent"

    :try_start_2
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "abandonAudioFocus "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->s:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->r:Z

    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->t:I

    goto :goto_1

    :catchall_0
    move-exception v4

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->s:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->r:Z

    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->t:I

    throw v4

    :goto_1
    return-void
.end method

.method static synthetic t(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;)Ljava/util/concurrent/CopyOnWriteArraySet;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->A:Ljava/util/concurrent/CopyOnWriteArraySet;

    return-object v0
.end method

.method static synthetic u(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;)I
    .locals 2

    iget v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->p:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->p:I

    return v0
.end method

.method static synthetic v(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;)I
    .locals 1

    iget v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->p:I

    return v0
.end method

.method static synthetic w(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;)Landroid/media/MediaPlayer;
    .locals 1

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->a()Landroid/media/MediaPlayer;

    move-result-object v0

    return-object v0
.end method

.method static synthetic x(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;)Landroid/media/MediaPlayer$OnCompletionListener;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->C:Landroid/media/MediaPlayer$OnCompletionListener;

    return-object v0
.end method

.method static synthetic y(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->f:Z

    return v0
.end method

.method static synthetic z(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;)I
    .locals 1

    iget v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->i:I

    return v0
.end method


# virtual methods
.method public acquire()V
    .locals 7
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    iget-object v5, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->o:[B

    monitor-enter v5

    :try_start_0
    iget v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->c:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->c:I

    invoke-static {}, Lcom/huawei/openalliance/ad/g/c;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "MediaPlayerAgent"

    const-string v1, "acquire - instanceRefCount: %d - agent: %s"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    iget v3, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->c:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    aput-object p0, v2, v3

    invoke-static {v0, v1, v2}, Lcom/huawei/openalliance/ad/g/c;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
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

.method public addMediaBufferListener(Lcom/huawei/openalliance/ad/media/listener/MediaBufferListener;)V
    .locals 1
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->x:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public addMediaErrorListener(Lcom/huawei/openalliance/ad/media/listener/MediaErrorListener;)V
    .locals 1
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->y:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public addMediaInfoListener(Lcom/huawei/openalliance/ad/media/listener/a;)V
    .locals 1
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->A:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public addMediaStateListener(Lcom/huawei/openalliance/ad/media/listener/MediaStateListener;)V
    .locals 1
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->w:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public addMuteListener(Lcom/huawei/openalliance/ad/media/listener/MuteListener;)V
    .locals 1
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->z:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method protected finalize()V
    .locals 0

    invoke-super {p0}, Ljava/lang/Object;->finalize()V

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->p()V

    return-void
.end method

.method public getCurrentPlayPosition()I
    .locals 5
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->l:Lcom/huawei/openalliance/ad/media/MediaState;

    sget-object v1, Lcom/huawei/openalliance/ad/media/MediaState$State;->END:Lcom/huawei/openalliance/ad/media/MediaState$State;

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/media/MediaState;->isState(Lcom/huawei/openalliance/ad/media/MediaState$State;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->l:Lcom/huawei/openalliance/ad/media/MediaState;

    sget-object v1, Lcom/huawei/openalliance/ad/media/MediaState$State;->ERROR:Lcom/huawei/openalliance/ad/media/MediaState$State;

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/media/MediaState;->isState(Lcom/huawei/openalliance/ad/media/MediaState$State;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->l:Lcom/huawei/openalliance/ad/media/MediaState;

    sget-object v1, Lcom/huawei/openalliance/ad/media/MediaState$State;->IDLE:Lcom/huawei/openalliance/ad/media/MediaState$State;

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/media/MediaState;->isState(Lcom/huawei/openalliance/ad/media/MediaState$State;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :try_start_0
    iget-object v3, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->m:[B

    monitor-enter v3
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    iget-object v2, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->b:Landroid/media/MediaPlayer;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v3

    goto :goto_0

    :catchall_0
    move-exception v4

    monitor-exit v3

    :try_start_2
    throw v4

    :goto_0
    const/4 v0, 0x0

    if-eq v0, v2, :cond_2

    invoke-virtual {v2}, Landroid/media/MediaPlayer;->getCurrentPosition()I
    :try_end_2
    .catch Ljava/lang/IllegalStateException; {:try_start_2 .. :try_end_2} :catch_0

    move-result v0

    return v0

    :cond_2
    goto :goto_1

    :catch_0
    move-exception v2

    const-string v0, "MediaPlayerAgent"

    const-string v1, "getCurrentPlayPosition IllegalStateException"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    :goto_1
    const/4 v0, 0x0

    return v0
.end method

.method public getCurrentState()Lcom/huawei/openalliance/ad/media/MediaState;
    .locals 1
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->l:Lcom/huawei/openalliance/ad/media/MediaState;

    return-object v0
.end method

.method public getInstanceRefCount()I
    .locals 3
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    iget-object v1, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->o:[B

    monitor-enter v1

    :try_start_0
    iget v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->c:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return v0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method

.method public isPlaying()Z
    .locals 4
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->l:Lcom/huawei/openalliance/ad/media/MediaState;

    sget-object v1, Lcom/huawei/openalliance/ad/media/MediaState$State;->END:Lcom/huawei/openalliance/ad/media/MediaState$State;

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/media/MediaState;->isState(Lcom/huawei/openalliance/ad/media/MediaState$State;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->H:Ljava/util/concurrent/Callable;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->l:Lcom/huawei/openalliance/ad/media/MediaState;

    sget-object v2, Lcom/huawei/openalliance/ad/media/MediaState$State;->PLAYING:Lcom/huawei/openalliance/ad/media/MediaState$State;

    invoke-virtual {v1, v2}, Lcom/huawei/openalliance/ad/media/MediaState;->isState(Lcom/huawei/openalliance/ad/media/MediaState$State;)Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const-wide/16 v2, 0x32

    invoke-static {v0, v2, v3, v1}, Lcom/huawei/openalliance/ad/utils/af;->a(Ljava/util/concurrent/Callable;JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public muteSound()V
    .locals 1
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    new-instance v0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$7;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$7;-><init>(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;)V

    invoke-direct {p0, v0}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method public pause()V
    .locals 1
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    new-instance v0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$2;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$2;-><init>(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;)V

    invoke-direct {p0, v0}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method public pauseWhenUrlMatchs(Ljava/lang/String;)V
    .locals 1
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    new-instance v0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$3;

    invoke-direct {v0, p0, p1}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$3;-><init>(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;Ljava/lang/String;)V

    invoke-direct {p0, v0}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method public play()V
    .locals 1
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    new-instance v0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$31;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$31;-><init>(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;)V

    invoke-direct {p0, v0}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method public playWhenUrlMatchs(Ljava/lang/String;)V
    .locals 1
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    new-instance v0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$32;

    invoke-direct {v0, p0, p1}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$32;-><init>(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;Ljava/lang/String;)V

    invoke-direct {p0, v0}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method public release()V
    .locals 7
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    iget-object v5, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->o:[B

    monitor-enter v5

    :try_start_0
    iget v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->c:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->c:I

    iget v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->c:I

    if-gez v0, :cond_0

    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->c:I

    :cond_0
    invoke-static {}, Lcom/huawei/openalliance/ad/g/c;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "MediaPlayerAgent"

    const-string v1, "release - instanceRefCount: %d - agent: %s"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    iget v3, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->c:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    aput-object p0, v2, v3

    invoke-static {v0, v1, v2}, Lcom/huawei/openalliance/ad/g/c;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_1
    iget v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->c:I

    if-nez v0, :cond_2

    new-instance v0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$26;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$26;-><init>(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;)V

    invoke-direct {p0, v0}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->a(Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_2
    monitor-exit v5

    goto :goto_0

    :catchall_0
    move-exception v6

    monitor-exit v5

    throw v6

    :goto_0
    return-void
.end method

.method public removeMediaBufferListener(Lcom/huawei/openalliance/ad/media/listener/MediaBufferListener;)V
    .locals 1
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->x:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArraySet;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public removeMediaErrorListener(Lcom/huawei/openalliance/ad/media/listener/MediaErrorListener;)V
    .locals 1
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->y:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArraySet;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public removeMediaInfoListener(Lcom/huawei/openalliance/ad/media/listener/a;)V
    .locals 1
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->A:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArraySet;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public removeMediaStateListener(Lcom/huawei/openalliance/ad/media/listener/MediaStateListener;)V
    .locals 1
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->w:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArraySet;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public removeMuteListener(Lcom/huawei/openalliance/ad/media/listener/MuteListener;)V
    .locals 1
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->z:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArraySet;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public reset()V
    .locals 1
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    new-instance v0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$27;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$27;-><init>(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;)V

    invoke-direct {p0, v0}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method public seekTo(I)V
    .locals 5
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    :try_start_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->l:Lcom/huawei/openalliance/ad/media/MediaState;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/media/MediaState;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v3, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->m:[B

    monitor-enter v3
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    iget-object v2, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->b:Landroid/media/MediaPlayer;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v3

    goto :goto_0

    :catchall_0
    move-exception v4

    monitor-exit v3

    :try_start_2
    throw v4

    :goto_0
    invoke-direct {p0}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->f()I

    move-result v0

    mul-int/2addr v0, p1

    div-int/lit8 v3, v0, 0x64

    if-eqz v2, :cond_0

    invoke-virtual {v2, v3}, Landroid/media/MediaPlayer;->seekTo(I)V

    :cond_0
    invoke-direct {p0, p1, v3}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->a(II)V
    :try_end_2
    .catch Ljava/lang/IllegalStateException; {:try_start_2 .. :try_end_2} :catch_0

    :cond_1
    goto :goto_1

    :catch_0
    move-exception v2

    const-string v0, "MediaPlayerAgent"

    const-string v1, "seekTo IllegalStateException"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    :goto_1
    return-void
.end method

.method public setDefaultDuration(I)V
    .locals 2
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->n:[B

    monitor-enter v0

    :try_start_0
    iput p1, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->j:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1

    :goto_0
    return-void
.end method

.method public setMediaFile(Ljava/lang/String;)V
    .locals 1
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    new-instance v0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$5;

    invoke-direct {v0, p0, p1}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$5;-><init>(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;Ljava/lang/String;)V

    invoke-direct {p0, v0}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method public setPreferStartPlayTime(I)V
    .locals 0
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    iput p1, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->k:I

    return-void
.end method

.method public setSoundVolume(F)V
    .locals 1
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    new-instance v0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$9;

    invoke-direct {v0, p0, p1}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$9;-><init>(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;F)V

    invoke-direct {p0, v0}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method public setSurface(Landroid/view/Surface;)V
    .locals 1
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    new-instance v0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$6;

    invoke-direct {v0, p0, p1}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$6;-><init>(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;Landroid/view/Surface;)V

    invoke-direct {p0, v0}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method public setVideoSizeChangeListener(Landroid/media/MediaPlayer$OnVideoSizeChangedListener;)V
    .locals 1
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    new-instance v0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$10;

    invoke-direct {v0, p0, p1}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$10;-><init>(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;Landroid/media/MediaPlayer$OnVideoSizeChangedListener;)V

    invoke-direct {p0, v0}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method public stop()V
    .locals 1
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    new-instance v0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$33;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$33;-><init>(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;)V

    invoke-direct {p0, v0}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method public stopWhenUrlMatchs(Ljava/lang/String;)V
    .locals 1
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    new-instance v0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$34;

    invoke-direct {v0, p0, p1}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$34;-><init>(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;Ljava/lang/String;)V

    invoke-direct {p0, v0}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "MediaPlayerAgent@"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " ["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->e:Ljava/lang/String;

    invoke-static {v1}, Lcom/huawei/openalliance/ad/utils/ak;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public unmuteSound()V
    .locals 1
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    new-instance v0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$8;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$8;-><init>(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;)V

    invoke-direct {p0, v0}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->a(Ljava/lang/Runnable;)V

    return-void
.end method
