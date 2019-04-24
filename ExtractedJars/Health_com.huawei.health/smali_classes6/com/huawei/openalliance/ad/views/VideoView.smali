.class public Lcom/huawei/openalliance/ad/views/VideoView;
.super Lcom/huawei/openalliance/ad/views/AutoScaleSizeRelativeLayout;

# interfaces
.implements Landroid/view/TextureView$SurfaceTextureListener;
.implements Lcom/huawei/openalliance/ad/views/interfaces/IViewLifeCycle;


# annotations
.annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/openalliance/ad/views/VideoView$f;,
        Lcom/huawei/openalliance/ad/views/VideoView$c;,
        Lcom/huawei/openalliance/ad/views/VideoView$e;,
        Lcom/huawei/openalliance/ad/views/VideoView$b;,
        Lcom/huawei/openalliance/ad/views/VideoView$a;,
        Lcom/huawei/openalliance/ad/views/VideoView$d;,
        Lcom/huawei/openalliance/ad/views/VideoView$SurfaceListener;,
        Lcom/huawei/openalliance/ad/views/VideoView$NetworkChangeListener;
    }
.end annotation


# static fields
.field private static final a:Ljava/lang/String;


# instance fields
.field private A:Lcom/huawei/openalliance/ad/media/listener/MediaBufferListener;

.field private B:Lcom/huawei/openalliance/ad/media/listener/MediaErrorListener;

.field private C:Lcom/huawei/openalliance/ad/media/listener/MuteListener;

.field private D:Lcom/huawei/openalliance/ad/media/listener/a;

.field private E:Lcom/huawei/openalliance/ad/views/VideoView$d;

.field private F:Lcom/huawei/openalliance/ad/views/VideoView$a;

.field private G:Lcom/huawei/openalliance/ad/views/VideoView$b;

.field private H:Lcom/huawei/openalliance/ad/views/VideoView$e;

.field private I:Lcom/huawei/openalliance/ad/views/VideoView$c;

.field private J:Landroid/content/BroadcastReceiver;

.field private b:Landroid/view/TextureView;

.field private c:Z

.field private d:Z

.field private e:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

.field private f:Lcom/huawei/openalliance/ad/media/IMultiMediaPlayingManager;

.field private final g:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<Lcom/huawei/openalliance/ad/views/VideoView$NetworkChangeListener;>;"
        }
    .end annotation
.end field

.field private final h:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<Lcom/huawei/openalliance/ad/media/listener/MediaStateListener;>;"
        }
    .end annotation
.end field

.field private final i:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<Lcom/huawei/openalliance/ad/media/listener/MediaBufferListener;>;"
        }
    .end annotation
.end field

.field private final j:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<Lcom/huawei/openalliance/ad/media/listener/MuteListener;>;"
        }
    .end annotation
.end field

.field private final k:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<Lcom/huawei/openalliance/ad/media/listener/MediaErrorListener;>;"
        }
    .end annotation
.end field

.field private final l:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<Lcom/huawei/openalliance/ad/media/listener/a;>;"
        }
    .end annotation
.end field

.field private m:Z

.field private n:Z

.field private o:Z

.field private p:Ljava/lang/String;

.field private q:Lcom/huawei/openalliance/ad/views/VideoView$SurfaceListener;

.field private r:Landroid/view/Surface;

.field private s:Landroid/graphics/SurfaceTexture;

.field private t:Z

.field private u:I

.field private v:Z

.field private w:Z

.field private x:Landroid/media/MediaPlayer$OnVideoSizeChangedListener;

.field private y:Landroid/media/MediaPlayer$OnVideoSizeChangedListener;

.field private z:Lcom/huawei/openalliance/ad/media/listener/MediaStateListener;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lcom/huawei/openalliance/ad/views/VideoView;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/openalliance/ad/views/VideoView;->a:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    invoke-direct {p0, p1}, Lcom/huawei/openalliance/ad/views/AutoScaleSizeRelativeLayout;-><init>(Landroid/content/Context;)V

    new-instance v0, Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/VideoView;->g:Ljava/util/Set;

    new-instance v0, Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/VideoView;->h:Ljava/util/Set;

    new-instance v0, Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/VideoView;->i:Ljava/util/Set;

    new-instance v0, Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/VideoView;->j:Ljava/util/Set;

    new-instance v0, Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/VideoView;->k:Ljava/util/Set;

    new-instance v0, Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/VideoView;->l:Ljava/util/Set;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/views/VideoView;->m:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/views/VideoView;->n:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/views/VideoView;->o:Z

    const/4 v0, 0x1

    iput v0, p0, Lcom/huawei/openalliance/ad/views/VideoView;->u:I

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/views/VideoView;->v:Z

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/views/VideoView;->w:Z

    new-instance v0, Lcom/huawei/openalliance/ad/views/VideoView$1;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/views/VideoView$1;-><init>(Lcom/huawei/openalliance/ad/views/VideoView;)V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/VideoView;->y:Landroid/media/MediaPlayer$OnVideoSizeChangedListener;

    new-instance v0, Lcom/huawei/openalliance/ad/views/VideoView$2;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/views/VideoView$2;-><init>(Lcom/huawei/openalliance/ad/views/VideoView;)V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/VideoView;->z:Lcom/huawei/openalliance/ad/media/listener/MediaStateListener;

    new-instance v0, Lcom/huawei/openalliance/ad/views/VideoView$3;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/views/VideoView$3;-><init>(Lcom/huawei/openalliance/ad/views/VideoView;)V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/VideoView;->A:Lcom/huawei/openalliance/ad/media/listener/MediaBufferListener;

    new-instance v0, Lcom/huawei/openalliance/ad/views/VideoView$4;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/views/VideoView$4;-><init>(Lcom/huawei/openalliance/ad/views/VideoView;)V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/VideoView;->B:Lcom/huawei/openalliance/ad/media/listener/MediaErrorListener;

    new-instance v0, Lcom/huawei/openalliance/ad/views/VideoView$5;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/views/VideoView$5;-><init>(Lcom/huawei/openalliance/ad/views/VideoView;)V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/VideoView;->C:Lcom/huawei/openalliance/ad/media/listener/MuteListener;

    new-instance v0, Lcom/huawei/openalliance/ad/views/VideoView$6;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/views/VideoView$6;-><init>(Lcom/huawei/openalliance/ad/views/VideoView;)V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/VideoView;->D:Lcom/huawei/openalliance/ad/media/listener/a;

    new-instance v0, Lcom/huawei/openalliance/ad/views/VideoView$d;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/views/VideoView;->z:Lcom/huawei/openalliance/ad/media/listener/MediaStateListener;

    invoke-direct {v0, v1}, Lcom/huawei/openalliance/ad/views/VideoView$d;-><init>(Lcom/huawei/openalliance/ad/media/listener/MediaStateListener;)V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/VideoView;->E:Lcom/huawei/openalliance/ad/views/VideoView$d;

    new-instance v0, Lcom/huawei/openalliance/ad/views/VideoView$a;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/views/VideoView;->A:Lcom/huawei/openalliance/ad/media/listener/MediaBufferListener;

    invoke-direct {v0, v1}, Lcom/huawei/openalliance/ad/views/VideoView$a;-><init>(Lcom/huawei/openalliance/ad/media/listener/MediaBufferListener;)V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/VideoView;->F:Lcom/huawei/openalliance/ad/views/VideoView$a;

    new-instance v0, Lcom/huawei/openalliance/ad/views/VideoView$b;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/views/VideoView;->B:Lcom/huawei/openalliance/ad/media/listener/MediaErrorListener;

    invoke-direct {v0, v1}, Lcom/huawei/openalliance/ad/views/VideoView$b;-><init>(Lcom/huawei/openalliance/ad/media/listener/MediaErrorListener;)V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/VideoView;->G:Lcom/huawei/openalliance/ad/views/VideoView$b;

    new-instance v0, Lcom/huawei/openalliance/ad/views/VideoView$e;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/views/VideoView;->C:Lcom/huawei/openalliance/ad/media/listener/MuteListener;

    invoke-direct {v0, v1}, Lcom/huawei/openalliance/ad/views/VideoView$e;-><init>(Lcom/huawei/openalliance/ad/media/listener/MuteListener;)V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/VideoView;->H:Lcom/huawei/openalliance/ad/views/VideoView$e;

    new-instance v0, Lcom/huawei/openalliance/ad/views/VideoView$c;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/views/VideoView;->D:Lcom/huawei/openalliance/ad/media/listener/a;

    invoke-direct {v0, v1}, Lcom/huawei/openalliance/ad/views/VideoView$c;-><init>(Lcom/huawei/openalliance/ad/media/listener/a;)V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/VideoView;->I:Lcom/huawei/openalliance/ad/views/VideoView$c;

    new-instance v0, Lcom/huawei/openalliance/ad/views/VideoView$7;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/views/VideoView$7;-><init>(Lcom/huawei/openalliance/ad/views/VideoView;)V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/VideoView;->J:Landroid/content/BroadcastReceiver;

    invoke-direct {p0, p1}, Lcom/huawei/openalliance/ad/views/VideoView;->a(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    invoke-direct {p0, p1, p2}, Lcom/huawei/openalliance/ad/views/AutoScaleSizeRelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    new-instance v0, Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/VideoView;->g:Ljava/util/Set;

    new-instance v0, Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/VideoView;->h:Ljava/util/Set;

    new-instance v0, Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/VideoView;->i:Ljava/util/Set;

    new-instance v0, Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/VideoView;->j:Ljava/util/Set;

    new-instance v0, Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/VideoView;->k:Ljava/util/Set;

    new-instance v0, Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/VideoView;->l:Ljava/util/Set;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/views/VideoView;->m:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/views/VideoView;->n:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/views/VideoView;->o:Z

    const/4 v0, 0x1

    iput v0, p0, Lcom/huawei/openalliance/ad/views/VideoView;->u:I

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/views/VideoView;->v:Z

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/views/VideoView;->w:Z

    new-instance v0, Lcom/huawei/openalliance/ad/views/VideoView$1;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/views/VideoView$1;-><init>(Lcom/huawei/openalliance/ad/views/VideoView;)V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/VideoView;->y:Landroid/media/MediaPlayer$OnVideoSizeChangedListener;

    new-instance v0, Lcom/huawei/openalliance/ad/views/VideoView$2;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/views/VideoView$2;-><init>(Lcom/huawei/openalliance/ad/views/VideoView;)V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/VideoView;->z:Lcom/huawei/openalliance/ad/media/listener/MediaStateListener;

    new-instance v0, Lcom/huawei/openalliance/ad/views/VideoView$3;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/views/VideoView$3;-><init>(Lcom/huawei/openalliance/ad/views/VideoView;)V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/VideoView;->A:Lcom/huawei/openalliance/ad/media/listener/MediaBufferListener;

    new-instance v0, Lcom/huawei/openalliance/ad/views/VideoView$4;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/views/VideoView$4;-><init>(Lcom/huawei/openalliance/ad/views/VideoView;)V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/VideoView;->B:Lcom/huawei/openalliance/ad/media/listener/MediaErrorListener;

    new-instance v0, Lcom/huawei/openalliance/ad/views/VideoView$5;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/views/VideoView$5;-><init>(Lcom/huawei/openalliance/ad/views/VideoView;)V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/VideoView;->C:Lcom/huawei/openalliance/ad/media/listener/MuteListener;

    new-instance v0, Lcom/huawei/openalliance/ad/views/VideoView$6;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/views/VideoView$6;-><init>(Lcom/huawei/openalliance/ad/views/VideoView;)V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/VideoView;->D:Lcom/huawei/openalliance/ad/media/listener/a;

    new-instance v0, Lcom/huawei/openalliance/ad/views/VideoView$d;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/views/VideoView;->z:Lcom/huawei/openalliance/ad/media/listener/MediaStateListener;

    invoke-direct {v0, v1}, Lcom/huawei/openalliance/ad/views/VideoView$d;-><init>(Lcom/huawei/openalliance/ad/media/listener/MediaStateListener;)V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/VideoView;->E:Lcom/huawei/openalliance/ad/views/VideoView$d;

    new-instance v0, Lcom/huawei/openalliance/ad/views/VideoView$a;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/views/VideoView;->A:Lcom/huawei/openalliance/ad/media/listener/MediaBufferListener;

    invoke-direct {v0, v1}, Lcom/huawei/openalliance/ad/views/VideoView$a;-><init>(Lcom/huawei/openalliance/ad/media/listener/MediaBufferListener;)V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/VideoView;->F:Lcom/huawei/openalliance/ad/views/VideoView$a;

    new-instance v0, Lcom/huawei/openalliance/ad/views/VideoView$b;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/views/VideoView;->B:Lcom/huawei/openalliance/ad/media/listener/MediaErrorListener;

    invoke-direct {v0, v1}, Lcom/huawei/openalliance/ad/views/VideoView$b;-><init>(Lcom/huawei/openalliance/ad/media/listener/MediaErrorListener;)V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/VideoView;->G:Lcom/huawei/openalliance/ad/views/VideoView$b;

    new-instance v0, Lcom/huawei/openalliance/ad/views/VideoView$e;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/views/VideoView;->C:Lcom/huawei/openalliance/ad/media/listener/MuteListener;

    invoke-direct {v0, v1}, Lcom/huawei/openalliance/ad/views/VideoView$e;-><init>(Lcom/huawei/openalliance/ad/media/listener/MuteListener;)V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/VideoView;->H:Lcom/huawei/openalliance/ad/views/VideoView$e;

    new-instance v0, Lcom/huawei/openalliance/ad/views/VideoView$c;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/views/VideoView;->D:Lcom/huawei/openalliance/ad/media/listener/a;

    invoke-direct {v0, v1}, Lcom/huawei/openalliance/ad/views/VideoView$c;-><init>(Lcom/huawei/openalliance/ad/media/listener/a;)V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/VideoView;->I:Lcom/huawei/openalliance/ad/views/VideoView$c;

    new-instance v0, Lcom/huawei/openalliance/ad/views/VideoView$7;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/views/VideoView$7;-><init>(Lcom/huawei/openalliance/ad/views/VideoView;)V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/VideoView;->J:Landroid/content/BroadcastReceiver;

    invoke-direct {p0, p1}, Lcom/huawei/openalliance/ad/views/VideoView;->a(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/openalliance/ad/views/AutoScaleSizeRelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    new-instance v0, Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/VideoView;->g:Ljava/util/Set;

    new-instance v0, Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/VideoView;->h:Ljava/util/Set;

    new-instance v0, Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/VideoView;->i:Ljava/util/Set;

    new-instance v0, Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/VideoView;->j:Ljava/util/Set;

    new-instance v0, Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/VideoView;->k:Ljava/util/Set;

    new-instance v0, Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/VideoView;->l:Ljava/util/Set;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/views/VideoView;->m:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/views/VideoView;->n:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/views/VideoView;->o:Z

    const/4 v0, 0x1

    iput v0, p0, Lcom/huawei/openalliance/ad/views/VideoView;->u:I

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/views/VideoView;->v:Z

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/views/VideoView;->w:Z

    new-instance v0, Lcom/huawei/openalliance/ad/views/VideoView$1;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/views/VideoView$1;-><init>(Lcom/huawei/openalliance/ad/views/VideoView;)V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/VideoView;->y:Landroid/media/MediaPlayer$OnVideoSizeChangedListener;

    new-instance v0, Lcom/huawei/openalliance/ad/views/VideoView$2;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/views/VideoView$2;-><init>(Lcom/huawei/openalliance/ad/views/VideoView;)V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/VideoView;->z:Lcom/huawei/openalliance/ad/media/listener/MediaStateListener;

    new-instance v0, Lcom/huawei/openalliance/ad/views/VideoView$3;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/views/VideoView$3;-><init>(Lcom/huawei/openalliance/ad/views/VideoView;)V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/VideoView;->A:Lcom/huawei/openalliance/ad/media/listener/MediaBufferListener;

    new-instance v0, Lcom/huawei/openalliance/ad/views/VideoView$4;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/views/VideoView$4;-><init>(Lcom/huawei/openalliance/ad/views/VideoView;)V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/VideoView;->B:Lcom/huawei/openalliance/ad/media/listener/MediaErrorListener;

    new-instance v0, Lcom/huawei/openalliance/ad/views/VideoView$5;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/views/VideoView$5;-><init>(Lcom/huawei/openalliance/ad/views/VideoView;)V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/VideoView;->C:Lcom/huawei/openalliance/ad/media/listener/MuteListener;

    new-instance v0, Lcom/huawei/openalliance/ad/views/VideoView$6;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/views/VideoView$6;-><init>(Lcom/huawei/openalliance/ad/views/VideoView;)V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/VideoView;->D:Lcom/huawei/openalliance/ad/media/listener/a;

    new-instance v0, Lcom/huawei/openalliance/ad/views/VideoView$d;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/views/VideoView;->z:Lcom/huawei/openalliance/ad/media/listener/MediaStateListener;

    invoke-direct {v0, v1}, Lcom/huawei/openalliance/ad/views/VideoView$d;-><init>(Lcom/huawei/openalliance/ad/media/listener/MediaStateListener;)V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/VideoView;->E:Lcom/huawei/openalliance/ad/views/VideoView$d;

    new-instance v0, Lcom/huawei/openalliance/ad/views/VideoView$a;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/views/VideoView;->A:Lcom/huawei/openalliance/ad/media/listener/MediaBufferListener;

    invoke-direct {v0, v1}, Lcom/huawei/openalliance/ad/views/VideoView$a;-><init>(Lcom/huawei/openalliance/ad/media/listener/MediaBufferListener;)V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/VideoView;->F:Lcom/huawei/openalliance/ad/views/VideoView$a;

    new-instance v0, Lcom/huawei/openalliance/ad/views/VideoView$b;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/views/VideoView;->B:Lcom/huawei/openalliance/ad/media/listener/MediaErrorListener;

    invoke-direct {v0, v1}, Lcom/huawei/openalliance/ad/views/VideoView$b;-><init>(Lcom/huawei/openalliance/ad/media/listener/MediaErrorListener;)V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/VideoView;->G:Lcom/huawei/openalliance/ad/views/VideoView$b;

    new-instance v0, Lcom/huawei/openalliance/ad/views/VideoView$e;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/views/VideoView;->C:Lcom/huawei/openalliance/ad/media/listener/MuteListener;

    invoke-direct {v0, v1}, Lcom/huawei/openalliance/ad/views/VideoView$e;-><init>(Lcom/huawei/openalliance/ad/media/listener/MuteListener;)V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/VideoView;->H:Lcom/huawei/openalliance/ad/views/VideoView$e;

    new-instance v0, Lcom/huawei/openalliance/ad/views/VideoView$c;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/views/VideoView;->D:Lcom/huawei/openalliance/ad/media/listener/a;

    invoke-direct {v0, v1}, Lcom/huawei/openalliance/ad/views/VideoView$c;-><init>(Lcom/huawei/openalliance/ad/media/listener/a;)V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/VideoView;->I:Lcom/huawei/openalliance/ad/views/VideoView$c;

    new-instance v0, Lcom/huawei/openalliance/ad/views/VideoView$7;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/views/VideoView$7;-><init>(Lcom/huawei/openalliance/ad/views/VideoView;)V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/VideoView;->J:Landroid/content/BroadcastReceiver;

    invoke-direct {p0, p1}, Lcom/huawei/openalliance/ad/views/VideoView;->a(Landroid/content/Context;)V

    return-void
.end method

.method static synthetic a()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/huawei/openalliance/ad/views/VideoView;->a:Ljava/lang/String;

    return-object v0
.end method

.method private a(I)V
    .locals 3

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/VideoView;->i:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/openalliance/ad/media/listener/MediaBufferListener;

    invoke-interface {v2, p1}, Lcom/huawei/openalliance/ad/media/listener/MediaBufferListener;->onBufferUpdate(I)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method private a(II)V
    .locals 3

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/VideoView;->h:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/openalliance/ad/media/listener/MediaStateListener;

    invoke-interface {v2, p1, p2}, Lcom/huawei/openalliance/ad/media/listener/MediaStateListener;->onProgress(II)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method private a(Landroid/content/Context;)V
    .locals 2

    const/high16 v0, -0x1000000

    invoke-virtual {p0, v0}, Lcom/huawei/openalliance/ad/views/VideoView;->setBackgroundColor(I)V

    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/openalliance/ad/R$layout;->hiad_view_video:I

    invoke-virtual {v0, v1, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    sget v0, Lcom/huawei/openalliance/ad/R$id;->hiad_id_video_texture_view:I

    invoke-virtual {p0, v0}, Lcom/huawei/openalliance/ad/views/VideoView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/TextureView;

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/VideoView;->b:Landroid/view/TextureView;

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/VideoView;->b:Landroid/view/TextureView;

    invoke-virtual {v0, p0}, Landroid/view/TextureView;->setSurfaceTextureListener(Landroid/view/TextureView$SurfaceTextureListener;)V

    invoke-static {p1}, Lcom/huawei/openalliance/ad/inter/HiAd;->a(Landroid/content/Context;)Lcom/huawei/openalliance/ad/inter/a;

    move-result-object v0

    invoke-interface {v0}, Lcom/huawei/openalliance/ad/inter/a;->b()Lcom/huawei/openalliance/ad/media/IMultiMediaPlayingManager;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/VideoView;->f:Lcom/huawei/openalliance/ad/media/IMultiMediaPlayingManager;

    new-instance v0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

    invoke-direct {v0, p1}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;-><init>(Landroid/content/Context;)V

    invoke-virtual {p0, v0}, Lcom/huawei/openalliance/ad/views/VideoView;->setMediaPlayerAgent(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;)V

    return-void
.end method

.method private a(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;I)V
    .locals 3

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/VideoView;->h:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/openalliance/ad/media/listener/MediaStateListener;

    invoke-interface {v2, p1, p2}, Lcom/huawei/openalliance/ad/media/listener/MediaStateListener;->onMediaStart(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;I)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method private a(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;III)V
    .locals 3

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/VideoView;->k:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/openalliance/ad/media/listener/MediaErrorListener;

    invoke-interface {v2, p1, p2, p3, p4}, Lcom/huawei/openalliance/ad/media/listener/MediaErrorListener;->onError(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;III)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method static synthetic a(Lcom/huawei/openalliance/ad/views/VideoView;I)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/huawei/openalliance/ad/views/VideoView;->a(I)V

    return-void
.end method

.method static synthetic a(Lcom/huawei/openalliance/ad/views/VideoView;II)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/huawei/openalliance/ad/views/VideoView;->a(II)V

    return-void
.end method

.method static synthetic a(Lcom/huawei/openalliance/ad/views/VideoView;Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/huawei/openalliance/ad/views/VideoView;->a(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;I)V

    return-void
.end method

.method static synthetic a(Lcom/huawei/openalliance/ad/views/VideoView;Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;III)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/huawei/openalliance/ad/views/VideoView;->a(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;III)V

    return-void
.end method

.method static synthetic a(Lcom/huawei/openalliance/ad/views/VideoView;Z)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/huawei/openalliance/ad/views/VideoView;->a(Z)V

    return-void
.end method

.method private a(Z)V
    .locals 7

    invoke-static {}, Lcom/huawei/openalliance/ad/g/c;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/huawei/openalliance/ad/views/VideoView;->a:Ljava/lang/String;

    const-string v1, "notifyNetworkConnectedOrChanged wifi: %s"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v0, v1, v2}, Lcom/huawei/openalliance/ad/g/c;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/VideoView;->g:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/openalliance/ad/views/VideoView$NetworkChangeListener;

    invoke-interface {v6, p1}, Lcom/huawei/openalliance/ad/views/VideoView$NetworkChangeListener;->onNetworkConnectedOrChanged(Z)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method static synthetic a(Lcom/huawei/openalliance/ad/views/VideoView;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/huawei/openalliance/ad/views/VideoView;->v:Z

    return v0
.end method

.method static synthetic b(Lcom/huawei/openalliance/ad/views/VideoView;)I
    .locals 1

    iget v0, p0, Lcom/huawei/openalliance/ad/views/VideoView;->u:I

    return v0
.end method

.method private b()V
    .locals 2

    sget-object v0, Lcom/huawei/openalliance/ad/views/VideoView;->a:Ljava/lang/String;

    const-string v1, "resetVideoView"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/VideoView;->e:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->getInstanceRefCount()I

    move-result v0

    const/4 v1, 0x1

    if-gt v0, v1, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/VideoView;->e:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->setSurface(Landroid/view/Surface;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/VideoView;->e:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->reset()V

    :cond_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/VideoView;->r:Landroid/view/Surface;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/VideoView;->r:Landroid/view/Surface;

    invoke-virtual {v0}, Landroid/view/Surface;->release()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/VideoView;->r:Landroid/view/Surface;

    :cond_1
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/VideoView;->s:Landroid/graphics/SurfaceTexture;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/views/VideoView;->c:Z

    return-void
.end method

.method private b(I)V
    .locals 3

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/VideoView;->l:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/openalliance/ad/media/listener/a;

    invoke-interface {v2, p1}, Lcom/huawei/openalliance/ad/media/listener/a;->a(I)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method private b(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;I)V
    .locals 3

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/VideoView;->h:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/openalliance/ad/media/listener/MediaStateListener;

    invoke-interface {v2, p1, p2}, Lcom/huawei/openalliance/ad/media/listener/MediaStateListener;->onMediaPause(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;I)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method static synthetic b(Lcom/huawei/openalliance/ad/views/VideoView;I)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/huawei/openalliance/ad/views/VideoView;->b(I)V

    return-void
.end method

.method static synthetic b(Lcom/huawei/openalliance/ad/views/VideoView;Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/huawei/openalliance/ad/views/VideoView;->b(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;I)V

    return-void
.end method

.method static synthetic c(Lcom/huawei/openalliance/ad/views/VideoView;)Landroid/view/TextureView;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/VideoView;->b:Landroid/view/TextureView;

    return-object v0
.end method

.method private c()V
    .locals 3

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/VideoView;->i:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/openalliance/ad/media/listener/MediaBufferListener;

    invoke-interface {v2}, Lcom/huawei/openalliance/ad/media/listener/MediaBufferListener;->onBufferingStart()V

    goto :goto_0

    :cond_0
    return-void
.end method

.method private c(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;I)V
    .locals 3

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/VideoView;->h:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/openalliance/ad/media/listener/MediaStateListener;

    invoke-interface {v2, p1, p2}, Lcom/huawei/openalliance/ad/media/listener/MediaStateListener;->onMediaStop(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;I)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method static synthetic c(Lcom/huawei/openalliance/ad/views/VideoView;Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/huawei/openalliance/ad/views/VideoView;->c(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;I)V

    return-void
.end method

.method private d()V
    .locals 3

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/VideoView;->i:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/openalliance/ad/media/listener/MediaBufferListener;

    invoke-interface {v2}, Lcom/huawei/openalliance/ad/media/listener/MediaBufferListener;->onBufferingEnd()V

    goto :goto_0

    :cond_0
    return-void
.end method

.method private d(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;I)V
    .locals 3

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/VideoView;->h:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/openalliance/ad/media/listener/MediaStateListener;

    invoke-interface {v2, p1, p2}, Lcom/huawei/openalliance/ad/media/listener/MediaStateListener;->onMediaCompletion(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;I)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method static synthetic d(Lcom/huawei/openalliance/ad/views/VideoView;Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/huawei/openalliance/ad/views/VideoView;->d(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;I)V

    return-void
.end method

.method static synthetic d(Lcom/huawei/openalliance/ad/views/VideoView;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/huawei/openalliance/ad/views/VideoView;->o:Z

    return v0
.end method

.method private e()V
    .locals 4

    invoke-static {}, Lcom/huawei/openalliance/ad/g/c;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/huawei/openalliance/ad/views/VideoView;->a:Ljava/lang/String;

    const-string v1, "notifyNetworkDisconnected"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/VideoView;->g:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/openalliance/ad/views/VideoView$NetworkChangeListener;

    invoke-interface {v3}, Lcom/huawei/openalliance/ad/views/VideoView$NetworkChangeListener;->onNetworkDisconnected()V

    goto :goto_0

    :cond_1
    return-void
.end method

.method static synthetic e(Lcom/huawei/openalliance/ad/views/VideoView;)V
    .locals 0

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/VideoView;->i()V

    return-void
.end method

.method private f()V
    .locals 3

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/VideoView;->j:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/openalliance/ad/media/listener/MuteListener;

    invoke-interface {v2}, Lcom/huawei/openalliance/ad/media/listener/MuteListener;->onMute()V

    goto :goto_0

    :cond_0
    return-void
.end method

.method static synthetic f(Lcom/huawei/openalliance/ad/views/VideoView;)V
    .locals 0

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/VideoView;->c()V

    return-void
.end method

.method private g()V
    .locals 3

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/VideoView;->j:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/openalliance/ad/media/listener/MuteListener;

    invoke-interface {v2}, Lcom/huawei/openalliance/ad/media/listener/MuteListener;->onUnmute()V

    goto :goto_0

    :cond_0
    return-void
.end method

.method static synthetic g(Lcom/huawei/openalliance/ad/views/VideoView;)V
    .locals 0

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/VideoView;->d()V

    return-void
.end method

.method private h()V
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/VideoView;->q:Lcom/huawei/openalliance/ad/views/VideoView$SurfaceListener;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/huawei/openalliance/ad/views/VideoView$SurfaceListener;->onSurfaceDestroyed()V

    :cond_0
    return-void
.end method

.method static synthetic h(Lcom/huawei/openalliance/ad/views/VideoView;)V
    .locals 0

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/VideoView;->f()V

    return-void
.end method

.method private i()V
    .locals 1

    iget-boolean v0, p0, Lcom/huawei/openalliance/ad/views/VideoView;->o:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/openalliance/ad/views/VideoView;->setKeepScreenOn(Z)V

    :cond_0
    return-void
.end method

.method static synthetic i(Lcom/huawei/openalliance/ad/views/VideoView;)V
    .locals 0

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/VideoView;->g()V

    return-void
.end method

.method static synthetic j(Lcom/huawei/openalliance/ad/views/VideoView;)V
    .locals 0

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/VideoView;->e()V

    return-void
.end method


# virtual methods
.method public addMediaBufferListener(Lcom/huawei/openalliance/ad/media/listener/MediaBufferListener;)V
    .locals 1
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/VideoView;->i:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public addMediaErrorListener(Lcom/huawei/openalliance/ad/media/listener/MediaErrorListener;)V
    .locals 1
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/VideoView;->k:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public addMediaInfoListener(Lcom/huawei/openalliance/ad/media/listener/a;)V
    .locals 1
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/VideoView;->l:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public addMediaStateListener(Lcom/huawei/openalliance/ad/media/listener/MediaStateListener;)V
    .locals 1
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/VideoView;->h:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public addMuteListener(Lcom/huawei/openalliance/ad/media/listener/MuteListener;)V
    .locals 1
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/VideoView;->j:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public addNetworkChangeListener(Lcom/huawei/openalliance/ad/views/VideoView$NetworkChangeListener;)V
    .locals 1
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/VideoView;->g:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public destroyView()V
    .locals 2

    iget-boolean v0, p0, Lcom/huawei/openalliance/ad/views/VideoView;->m:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/VideoView;->f:Lcom/huawei/openalliance/ad/media/IMultiMediaPlayingManager;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/views/VideoView;->e:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

    invoke-interface {v0, v1}, Lcom/huawei/openalliance/ad/media/IMultiMediaPlayingManager;->removeMediaPlayerAgent(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;)V

    :cond_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/VideoView;->e:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->release()V

    return-void
.end method

.method public getCurrentPosition()I
    .locals 1
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/VideoView;->e:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->getCurrentPlayPosition()I

    move-result v0

    return v0
.end method

.method public getCurrentState()Lcom/huawei/openalliance/ad/media/MediaState;
    .locals 1
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/VideoView;->e:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->getCurrentState()Lcom/huawei/openalliance/ad/media/MediaState;

    move-result-object v0

    return-object v0
.end method

.method public getMediaPlayerAgent()Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/VideoView;->e:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

    return-object v0
.end method

.method public isPlaying()Z
    .locals 1
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/VideoView;->e:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->isPlaying()Z

    move-result v0

    return v0
.end method

.method public mute()V
    .locals 1
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/VideoView;->e:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->muteSound()V

    return-void
.end method

.method protected onAttachedToWindow()V
    .locals 3

    invoke-super {p0}, Lcom/huawei/openalliance/ad/views/AutoScaleSizeRelativeLayout;->onAttachedToWindow()V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xb

    if-lt v0, v1, :cond_0

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/views/VideoView;->isHardwareAccelerated()Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Lcom/huawei/openalliance/ad/views/VideoView;->a:Ljava/lang/String;

    const-string v1, "hardware acceleration is off"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    new-instance v2, Landroid/content/IntentFilter;

    invoke-direct {v2}, Landroid/content/IntentFilter;-><init>()V

    const-string v0, "android.net.conn.CONNECTIVITY_CHANGE"

    invoke-virtual {v2, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/views/VideoView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/openalliance/ad/inter/HiAd;->a(Landroid/content/Context;)Lcom/huawei/openalliance/ad/inter/a;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/openalliance/ad/views/VideoView;->J:Landroid/content/BroadcastReceiver;

    invoke-interface {v0, v1, v2}, Lcom/huawei/openalliance/ad/inter/a;->a(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V

    return-void
.end method

.method protected onDetachedFromWindow()V
    .locals 3

    invoke-super {p0}, Lcom/huawei/openalliance/ad/views/AutoScaleSizeRelativeLayout;->onDetachedFromWindow()V

    :try_start_0
    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/views/VideoView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/openalliance/ad/inter/HiAd;->a(Landroid/content/Context;)Lcom/huawei/openalliance/ad/inter/a;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/openalliance/ad/views/VideoView;->J:Landroid/content/BroadcastReceiver;

    invoke-interface {v0, v1}, Lcom/huawei/openalliance/ad/inter/a;->a(Landroid/content/BroadcastReceiver;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    goto :goto_0

    :catch_0
    move-exception v2

    sget-object v0, Lcom/huawei/openalliance/ad/views/VideoView;->a:Ljava/lang/String;

    const-string v1, "unregisterReceiver IllegalArgumentException"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :catch_1
    move-exception v2

    sget-object v0, Lcom/huawei/openalliance/ad/views/VideoView;->a:Ljava/lang/String;

    const-string v1, "unregisterReceiver Exception"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/VideoView;->b()V

    return-void
.end method

.method public onSurfaceTextureAvailable(Landroid/graphics/SurfaceTexture;II)V
    .locals 5

    invoke-static {}, Lcom/huawei/openalliance/ad/g/c;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/huawei/openalliance/ad/views/VideoView;->a:Ljava/lang/String;

    const-string v1, "onSurfaceTextureAvailable width: %d height: %d"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-static {v0, v1, v2}, Lcom/huawei/openalliance/ad/g/c;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/views/VideoView;->d:Z

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/VideoView;->r:Landroid/view/Surface;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/VideoView;->s:Landroid/graphics/SurfaceTexture;

    if-eq v0, p1, :cond_2

    :cond_1
    new-instance v0, Landroid/view/Surface;

    invoke-direct {v0, p1}, Landroid/view/Surface;-><init>(Landroid/graphics/SurfaceTexture;)V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/VideoView;->r:Landroid/view/Surface;

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/VideoView;->e:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/views/VideoView;->r:Landroid/view/Surface;

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->setSurface(Landroid/view/Surface;)V

    iput-object p1, p0, Lcom/huawei/openalliance/ad/views/VideoView;->s:Landroid/graphics/SurfaceTexture;

    :cond_2
    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/VideoView;->x:Landroid/media/MediaPlayer$OnVideoSizeChangedListener;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_3

    new-instance v0, Lcom/huawei/openalliance/ad/views/VideoView$f;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/views/VideoView;->y:Landroid/media/MediaPlayer$OnVideoSizeChangedListener;

    invoke-direct {v0, v1}, Lcom/huawei/openalliance/ad/views/VideoView$f;-><init>(Landroid/media/MediaPlayer$OnVideoSizeChangedListener;)V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/VideoView;->x:Landroid/media/MediaPlayer$OnVideoSizeChangedListener;

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/VideoView;->e:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/views/VideoView;->x:Landroid/media/MediaPlayer$OnVideoSizeChangedListener;

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->setVideoSizeChangeListener(Landroid/media/MediaPlayer$OnVideoSizeChangedListener;)V

    :cond_3
    iget-boolean v0, p0, Lcom/huawei/openalliance/ad/views/VideoView;->c:Z

    if-eqz v0, :cond_4

    iget-boolean v0, p0, Lcom/huawei/openalliance/ad/views/VideoView;->t:Z

    invoke-virtual {p0, v0}, Lcom/huawei/openalliance/ad/views/VideoView;->play(Z)V

    :cond_4
    return-void
.end method

.method public onSurfaceTextureDestroyed(Landroid/graphics/SurfaceTexture;)Z
    .locals 2

    invoke-static {}, Lcom/huawei/openalliance/ad/g/c;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/huawei/openalliance/ad/views/VideoView;->a:Ljava/lang/String;

    const-string v1, "onSurfaceTextureDestroyed"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/views/VideoView;->d:Z

    iget-boolean v0, p0, Lcom/huawei/openalliance/ad/views/VideoView;->w:Z

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/views/VideoView;->pause()V

    :cond_1
    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/VideoView;->h()V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/VideoView;->r:Landroid/view/Surface;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/VideoView;->r:Landroid/view/Surface;

    :cond_2
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/VideoView;->s:Landroid/graphics/SurfaceTexture;

    const/4 v0, 0x1

    return v0
.end method

.method public onSurfaceTextureSizeChanged(Landroid/graphics/SurfaceTexture;II)V
    .locals 5

    invoke-static {}, Lcom/huawei/openalliance/ad/g/c;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/huawei/openalliance/ad/views/VideoView;->a:Ljava/lang/String;

    const-string v1, "onSurfaceTextureSizeChanged width: %d height: %d"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-static {v0, v1, v2}, Lcom/huawei/openalliance/ad/g/c;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public onSurfaceTextureUpdated(Landroid/graphics/SurfaceTexture;)V
    .locals 0

    return-void
.end method

.method public pause()V
    .locals 3
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/views/VideoView;->c:Z

    iget-boolean v0, p0, Lcom/huawei/openalliance/ad/views/VideoView;->m:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/VideoView;->e:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->pause()V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/VideoView;->f:Lcom/huawei/openalliance/ad/media/IMultiMediaPlayingManager;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/views/VideoView;->p:Ljava/lang/String;

    iget-object v2, p0, Lcom/huawei/openalliance/ad/views/VideoView;->e:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

    invoke-interface {v0, v1, v2}, Lcom/huawei/openalliance/ad/media/IMultiMediaPlayingManager;->pause(Ljava/lang/String;Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;)V

    :goto_0
    return-void
.end method

.method public pauseView()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/views/VideoView;->n:Z

    return-void
.end method

.method public play()V
    .locals 1
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/openalliance/ad/views/VideoView;->play(Z)V

    return-void
.end method

.method public play(Z)V
    .locals 5
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    iget-boolean v0, p0, Lcom/huawei/openalliance/ad/views/VideoView;->n:Z

    if-eqz v0, :cond_0

    sget-object v0, Lcom/huawei/openalliance/ad/views/VideoView;->a:Ljava/lang/String;

    const-string v1, "play action is not performed - view paused"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    invoke-static {}, Lcom/huawei/openalliance/ad/g/c;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, Lcom/huawei/openalliance/ad/views/VideoView;->a:Ljava/lang/String;

    const-string v1, "play auto: %s surfaceAvailable: %s standalone: %s url: %s"

    const/4 v2, 0x4

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    iget-boolean v3, p0, Lcom/huawei/openalliance/ad/views/VideoView;->d:Z

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    iget-boolean v3, p0, Lcom/huawei/openalliance/ad/views/VideoView;->m:Z

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    const/4 v4, 0x2

    aput-object v3, v2, v4

    iget-object v3, p0, Lcom/huawei/openalliance/ad/views/VideoView;->p:Ljava/lang/String;

    invoke-static {v3}, Lcom/huawei/openalliance/ad/utils/ak;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x3

    aput-object v3, v2, v4

    invoke-static {v0, v1, v2}, Lcom/huawei/openalliance/ad/g/c;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_1
    iget-boolean v0, p0, Lcom/huawei/openalliance/ad/views/VideoView;->d:Z

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/VideoView;->r:Landroid/view/Surface;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/VideoView;->e:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/views/VideoView;->r:Landroid/view/Surface;

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->setSurface(Landroid/view/Surface;)V

    :cond_2
    iget-boolean v0, p0, Lcom/huawei/openalliance/ad/views/VideoView;->m:Z

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/VideoView;->e:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->play()V

    goto :goto_0

    :cond_3
    if-eqz p1, :cond_4

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/VideoView;->f:Lcom/huawei/openalliance/ad/media/IMultiMediaPlayingManager;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/views/VideoView;->p:Ljava/lang/String;

    iget-object v2, p0, Lcom/huawei/openalliance/ad/views/VideoView;->e:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

    invoke-interface {v0, v1, v2}, Lcom/huawei/openalliance/ad/media/IMultiMediaPlayingManager;->autoPlay(Ljava/lang/String;Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;)V

    goto :goto_0

    :cond_4
    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/VideoView;->f:Lcom/huawei/openalliance/ad/media/IMultiMediaPlayingManager;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/views/VideoView;->p:Ljava/lang/String;

    iget-object v2, p0, Lcom/huawei/openalliance/ad/views/VideoView;->e:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

    invoke-interface {v0, v1, v2}, Lcom/huawei/openalliance/ad/media/IMultiMediaPlayingManager;->manualPlay(Ljava/lang/String;Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;)V

    goto :goto_0

    :cond_5
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/views/VideoView;->c:Z

    iput-boolean p1, p0, Lcom/huawei/openalliance/ad/views/VideoView;->t:Z

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
    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/VideoView;->i:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public removeMediaErrorListener(Lcom/huawei/openalliance/ad/media/listener/MediaErrorListener;)V
    .locals 1
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/VideoView;->k:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public removeMediaInfoListener(Lcom/huawei/openalliance/ad/media/listener/a;)V
    .locals 1
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/VideoView;->l:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public removeMediaStateListener(Lcom/huawei/openalliance/ad/media/listener/MediaStateListener;)V
    .locals 1
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/VideoView;->h:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public removeMuteListener(Lcom/huawei/openalliance/ad/media/listener/MuteListener;)V
    .locals 1
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/VideoView;->j:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public removeNetworkChangeListener(Lcom/huawei/openalliance/ad/views/VideoView$NetworkChangeListener;)V
    .locals 1
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/VideoView;->g:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public resumeView()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/views/VideoView;->n:Z

    return-void
.end method

.method public seekTo(I)V
    .locals 1
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/VideoView;->e:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

    invoke-virtual {v0, p1}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->seekTo(I)V

    return-void
.end method

.method public setAutoScaleResizeLayoutOnVideoSizeChange(Z)V
    .locals 0
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    iput-boolean p1, p0, Lcom/huawei/openalliance/ad/views/VideoView;->v:Z

    return-void
.end method

.method public setDefaultDuration(I)V
    .locals 1
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/VideoView;->e:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

    invoke-virtual {v0, p1}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->setDefaultDuration(I)V

    return-void
.end method

.method public setMediaPlayerAgent(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;)V
    .locals 3

    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    iget-object v2, p0, Lcom/huawei/openalliance/ad/views/VideoView;->e:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

    iput-object p1, p0, Lcom/huawei/openalliance/ad/views/VideoView;->e:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/VideoView;->e:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->acquire()V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/VideoView;->e:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/views/VideoView;->E:Lcom/huawei/openalliance/ad/views/VideoView$d;

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->addMediaStateListener(Lcom/huawei/openalliance/ad/media/listener/MediaStateListener;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/VideoView;->e:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/views/VideoView;->F:Lcom/huawei/openalliance/ad/views/VideoView$a;

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->addMediaBufferListener(Lcom/huawei/openalliance/ad/media/listener/MediaBufferListener;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/VideoView;->e:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/views/VideoView;->G:Lcom/huawei/openalliance/ad/views/VideoView$b;

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->addMediaErrorListener(Lcom/huawei/openalliance/ad/media/listener/MediaErrorListener;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/VideoView;->e:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/views/VideoView;->H:Lcom/huawei/openalliance/ad/views/VideoView$e;

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->addMuteListener(Lcom/huawei/openalliance/ad/media/listener/MuteListener;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/VideoView;->e:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/views/VideoView;->I:Lcom/huawei/openalliance/ad/views/VideoView$c;

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->addMediaInfoListener(Lcom/huawei/openalliance/ad/media/listener/a;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/VideoView;->r:Landroid/view/Surface;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/VideoView;->e:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/views/VideoView;->r:Landroid/view/Surface;

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->setSurface(Landroid/view/Surface;)V

    :cond_1
    if-eqz v2, :cond_2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/VideoView;->E:Lcom/huawei/openalliance/ad/views/VideoView$d;

    invoke-virtual {v2, v0}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->removeMediaStateListener(Lcom/huawei/openalliance/ad/media/listener/MediaStateListener;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/VideoView;->F:Lcom/huawei/openalliance/ad/views/VideoView$a;

    invoke-virtual {v2, v0}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->removeMediaBufferListener(Lcom/huawei/openalliance/ad/media/listener/MediaBufferListener;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/VideoView;->G:Lcom/huawei/openalliance/ad/views/VideoView$b;

    invoke-virtual {v2, v0}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->removeMediaErrorListener(Lcom/huawei/openalliance/ad/media/listener/MediaErrorListener;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/VideoView;->H:Lcom/huawei/openalliance/ad/views/VideoView$e;

    invoke-virtual {v2, v0}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->removeMuteListener(Lcom/huawei/openalliance/ad/media/listener/MuteListener;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/VideoView;->I:Lcom/huawei/openalliance/ad/views/VideoView$c;

    invoke-virtual {v2, v0}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->removeMediaInfoListener(Lcom/huawei/openalliance/ad/media/listener/a;)V

    invoke-virtual {v2}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->release()V

    :cond_2
    return-void
.end method

.method public setNeedPauseOnSurfaceDestory(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/huawei/openalliance/ad/views/VideoView;->w:Z

    return-void
.end method

.method public setPreferStartPlayTime(I)V
    .locals 1
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/VideoView;->e:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

    invoke-virtual {v0, p1}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->setPreferStartPlayTime(I)V

    return-void
.end method

.method public setScreenOnWhilePlaying(Z)V
    .locals 2
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    iput-boolean p1, p0, Lcom/huawei/openalliance/ad/views/VideoView;->o:Z

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/views/VideoView;->getCurrentState()Lcom/huawei/openalliance/ad/media/MediaState;

    move-result-object v0

    sget-object v1, Lcom/huawei/openalliance/ad/media/MediaState$State;->PLAYING:Lcom/huawei/openalliance/ad/media/MediaState$State;

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/media/MediaState;->isState(Lcom/huawei/openalliance/ad/media/MediaState$State;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/openalliance/ad/views/VideoView;->setKeepScreenOn(Z)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/openalliance/ad/views/VideoView;->setKeepScreenOn(Z)V

    :goto_0
    return-void
.end method

.method public setStandalone(Z)V
    .locals 0
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    iput-boolean p1, p0, Lcom/huawei/openalliance/ad/views/VideoView;->m:Z

    return-void
.end method

.method public setSurfaceListener(Lcom/huawei/openalliance/ad/views/VideoView$SurfaceListener;)V
    .locals 0
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    iput-object p1, p0, Lcom/huawei/openalliance/ad/views/VideoView;->q:Lcom/huawei/openalliance/ad/views/VideoView$SurfaceListener;

    return-void
.end method

.method public setVideoFileUrl(Ljava/lang/String;)V
    .locals 1
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    iput-object p1, p0, Lcom/huawei/openalliance/ad/views/VideoView;->p:Ljava/lang/String;

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/VideoView;->e:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

    invoke-virtual {v0, p1}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->setMediaFile(Ljava/lang/String;)V

    return-void
.end method

.method public setVideoScaleMode(I)V
    .locals 3
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    const/4 v0, 0x1

    if-eq p1, v0, :cond_0

    const/4 v0, 0x2

    if-eq p1, v0, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Not supported video scale mode: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iput p1, p0, Lcom/huawei/openalliance/ad/views/VideoView;->u:I

    return-void
.end method

.method public stop()V
    .locals 3
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/views/VideoView;->c:Z

    iget-boolean v0, p0, Lcom/huawei/openalliance/ad/views/VideoView;->m:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/VideoView;->e:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->stop()V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/VideoView;->f:Lcom/huawei/openalliance/ad/media/IMultiMediaPlayingManager;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/views/VideoView;->p:Ljava/lang/String;

    iget-object v2, p0, Lcom/huawei/openalliance/ad/views/VideoView;->e:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

    invoke-interface {v0, v1, v2}, Lcom/huawei/openalliance/ad/media/IMultiMediaPlayingManager;->stop(Ljava/lang/String;Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;)V

    :goto_0
    return-void
.end method

.method public unmute()V
    .locals 1
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/VideoView;->e:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->unmuteSound()V

    return-void
.end method
