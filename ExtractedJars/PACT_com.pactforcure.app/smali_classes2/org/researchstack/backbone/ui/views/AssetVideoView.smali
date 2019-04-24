.class public Lorg/researchstack/backbone/ui/views/AssetVideoView;
.super Landroid/view/SurfaceView;
.source "AssetVideoView.java"

# interfaces
.implements Landroid/widget/MediaController$MediaPlayerControl;


# static fields
.field private static final STATE_ERROR:I = -0x1

.field private static final STATE_IDLE:I = 0x0

.field private static final STATE_PAUSED:I = 0x4

.field private static final STATE_PLAYBACK_COMPLETED:I = 0x5

.field private static final STATE_PLAYING:I = 0x3

.field private static final STATE_PREPARED:I = 0x2

.field private static final STATE_PREPARING:I = 0x1


# instance fields
.field private TAG:Ljava/lang/String;

.field private mAudioSession:I

.field private mBufferingUpdateListener:Landroid/media/MediaPlayer$OnBufferingUpdateListener;

.field private mCanPause:Z

.field private mCanSeekBack:Z

.field private mCanSeekForward:Z

.field private mCompletionListener:Landroid/media/MediaPlayer$OnCompletionListener;

.field private mCurrentBufferPercentage:I

.field private mCurrentState:I

.field private mErrorListener:Landroid/media/MediaPlayer$OnErrorListener;

.field private mFileDescriptor:Ljava/io/FileDescriptor;

.field private mInfoListener:Landroid/media/MediaPlayer$OnInfoListener;

.field private mLength:J

.field private mMediaController:Landroid/widget/MediaController;

.field private mMediaPlayer:Landroid/media/MediaPlayer;

.field private mOnCompletionListener:Landroid/media/MediaPlayer$OnCompletionListener;

.field private mOnErrorListener:Landroid/media/MediaPlayer$OnErrorListener;

.field private mOnInfoListener:Landroid/media/MediaPlayer$OnInfoListener;

.field private mOnPreparedListener:Landroid/media/MediaPlayer$OnPreparedListener;

.field mPreparedListener:Landroid/media/MediaPlayer$OnPreparedListener;

.field mSHCallback:Landroid/view/SurfaceHolder$Callback;

.field private mSeekWhenPrepared:I

.field mSizeChangedListener:Landroid/media/MediaPlayer$OnVideoSizeChangedListener;

.field private mStartOffset:J

.field private mSurfaceHeight:I

.field private mSurfaceHolder:Landroid/view/SurfaceHolder;

.field private mSurfaceWidth:I

.field private mTargetState:I

.field private mVideoHeight:I

.field private mVideoWidth:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    const/4 v2, 0x0

    const/4 v1, 0x0

    .line 101
    invoke-direct {p0, p1}, Landroid/view/SurfaceView;-><init>(Landroid/content/Context;)V

    .line 57
    const-string v0, "AssetVideoView"

    iput-object v0, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->TAG:Ljava/lang/String;

    .line 77
    iput v1, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->mCurrentState:I

    .line 78
    iput v1, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->mTargetState:I

    .line 81
    iput-object v2, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->mSurfaceHolder:Landroid/view/SurfaceHolder;

    .line 82
    iput-object v2, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->mMediaPlayer:Landroid/media/MediaPlayer;

    .line 332
    new-instance v0, Lorg/researchstack/backbone/ui/views/AssetVideoView$1;

    invoke-direct {v0, p0}, Lorg/researchstack/backbone/ui/views/AssetVideoView$1;-><init>(Lorg/researchstack/backbone/ui/views/AssetVideoView;)V

    iput-object v0, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->mSizeChangedListener:Landroid/media/MediaPlayer$OnVideoSizeChangedListener;

    .line 346
    new-instance v0, Lorg/researchstack/backbone/ui/views/AssetVideoView$2;

    invoke-direct {v0, p0}, Lorg/researchstack/backbone/ui/views/AssetVideoView$2;-><init>(Lorg/researchstack/backbone/ui/views/AssetVideoView;)V

    iput-object v0, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->mPreparedListener:Landroid/media/MediaPlayer$OnPreparedListener;

    .line 407
    new-instance v0, Lorg/researchstack/backbone/ui/views/AssetVideoView$3;

    invoke-direct {v0, p0}, Lorg/researchstack/backbone/ui/views/AssetVideoView$3;-><init>(Lorg/researchstack/backbone/ui/views/AssetVideoView;)V

    iput-object v0, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->mCompletionListener:Landroid/media/MediaPlayer$OnCompletionListener;

    .line 424
    new-instance v0, Lorg/researchstack/backbone/ui/views/AssetVideoView$4;

    invoke-direct {v0, p0}, Lorg/researchstack/backbone/ui/views/AssetVideoView$4;-><init>(Lorg/researchstack/backbone/ui/views/AssetVideoView;)V

    iput-object v0, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->mInfoListener:Landroid/media/MediaPlayer$OnInfoListener;

    .line 436
    new-instance v0, Lorg/researchstack/backbone/ui/views/AssetVideoView$5;

    invoke-direct {v0, p0}, Lorg/researchstack/backbone/ui/views/AssetVideoView$5;-><init>(Lorg/researchstack/backbone/ui/views/AssetVideoView;)V

    iput-object v0, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->mErrorListener:Landroid/media/MediaPlayer$OnErrorListener;

    .line 495
    new-instance v0, Lorg/researchstack/backbone/ui/views/AssetVideoView$6;

    invoke-direct {v0, p0}, Lorg/researchstack/backbone/ui/views/AssetVideoView$6;-><init>(Lorg/researchstack/backbone/ui/views/AssetVideoView;)V

    iput-object v0, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->mBufferingUpdateListener:Landroid/media/MediaPlayer$OnBufferingUpdateListener;

    .line 547
    new-instance v0, Lorg/researchstack/backbone/ui/views/AssetVideoView$7;

    invoke-direct {v0, p0}, Lorg/researchstack/backbone/ui/views/AssetVideoView$7;-><init>(Lorg/researchstack/backbone/ui/views/AssetVideoView;)V

    iput-object v0, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->mSHCallback:Landroid/view/SurfaceHolder$Callback;

    .line 102
    invoke-direct {p0}, Lorg/researchstack/backbone/ui/views/AssetVideoView;->initVideoView()V

    .line 103
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "attrs"    # Landroid/util/AttributeSet;

    .prologue
    .line 107
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lorg/researchstack/backbone/ui/views/AssetVideoView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 108
    invoke-direct {p0}, Lorg/researchstack/backbone/ui/views/AssetVideoView;->initVideoView()V

    .line 109
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "attrs"    # Landroid/util/AttributeSet;
    .param p3, "defStyleAttr"    # I

    .prologue
    .line 113
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, p3, v0}, Lorg/researchstack/backbone/ui/views/AssetVideoView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 114
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 3
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "attrs"    # Landroid/util/AttributeSet;
    .param p3, "defStyleAttr"    # I
    .param p4, "defStyleRes"    # I
    .annotation build Landroid/annotation/TargetApi;
        value = 0x15
    .end annotation

    .prologue
    const/4 v2, 0x0

    const/4 v1, 0x0

    .line 119
    invoke-direct {p0, p1, p2, p3, p4}, Landroid/view/SurfaceView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 57
    const-string v0, "AssetVideoView"

    iput-object v0, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->TAG:Ljava/lang/String;

    .line 77
    iput v1, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->mCurrentState:I

    .line 78
    iput v1, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->mTargetState:I

    .line 81
    iput-object v2, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->mSurfaceHolder:Landroid/view/SurfaceHolder;

    .line 82
    iput-object v2, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->mMediaPlayer:Landroid/media/MediaPlayer;

    .line 332
    new-instance v0, Lorg/researchstack/backbone/ui/views/AssetVideoView$1;

    invoke-direct {v0, p0}, Lorg/researchstack/backbone/ui/views/AssetVideoView$1;-><init>(Lorg/researchstack/backbone/ui/views/AssetVideoView;)V

    iput-object v0, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->mSizeChangedListener:Landroid/media/MediaPlayer$OnVideoSizeChangedListener;

    .line 346
    new-instance v0, Lorg/researchstack/backbone/ui/views/AssetVideoView$2;

    invoke-direct {v0, p0}, Lorg/researchstack/backbone/ui/views/AssetVideoView$2;-><init>(Lorg/researchstack/backbone/ui/views/AssetVideoView;)V

    iput-object v0, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->mPreparedListener:Landroid/media/MediaPlayer$OnPreparedListener;

    .line 407
    new-instance v0, Lorg/researchstack/backbone/ui/views/AssetVideoView$3;

    invoke-direct {v0, p0}, Lorg/researchstack/backbone/ui/views/AssetVideoView$3;-><init>(Lorg/researchstack/backbone/ui/views/AssetVideoView;)V

    iput-object v0, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->mCompletionListener:Landroid/media/MediaPlayer$OnCompletionListener;

    .line 424
    new-instance v0, Lorg/researchstack/backbone/ui/views/AssetVideoView$4;

    invoke-direct {v0, p0}, Lorg/researchstack/backbone/ui/views/AssetVideoView$4;-><init>(Lorg/researchstack/backbone/ui/views/AssetVideoView;)V

    iput-object v0, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->mInfoListener:Landroid/media/MediaPlayer$OnInfoListener;

    .line 436
    new-instance v0, Lorg/researchstack/backbone/ui/views/AssetVideoView$5;

    invoke-direct {v0, p0}, Lorg/researchstack/backbone/ui/views/AssetVideoView$5;-><init>(Lorg/researchstack/backbone/ui/views/AssetVideoView;)V

    iput-object v0, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->mErrorListener:Landroid/media/MediaPlayer$OnErrorListener;

    .line 495
    new-instance v0, Lorg/researchstack/backbone/ui/views/AssetVideoView$6;

    invoke-direct {v0, p0}, Lorg/researchstack/backbone/ui/views/AssetVideoView$6;-><init>(Lorg/researchstack/backbone/ui/views/AssetVideoView;)V

    iput-object v0, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->mBufferingUpdateListener:Landroid/media/MediaPlayer$OnBufferingUpdateListener;

    .line 547
    new-instance v0, Lorg/researchstack/backbone/ui/views/AssetVideoView$7;

    invoke-direct {v0, p0}, Lorg/researchstack/backbone/ui/views/AssetVideoView$7;-><init>(Lorg/researchstack/backbone/ui/views/AssetVideoView;)V

    iput-object v0, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->mSHCallback:Landroid/view/SurfaceHolder$Callback;

    .line 120
    invoke-direct {p0}, Lorg/researchstack/backbone/ui/views/AssetVideoView;->initVideoView()V

    .line 121
    return-void
.end method

.method static synthetic access$000(Lorg/researchstack/backbone/ui/views/AssetVideoView;)I
    .locals 1
    .param p0, "x0"    # Lorg/researchstack/backbone/ui/views/AssetVideoView;

    .prologue
    .line 55
    iget v0, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->mVideoWidth:I

    return v0
.end method

.method static synthetic access$002(Lorg/researchstack/backbone/ui/views/AssetVideoView;I)I
    .locals 0
    .param p0, "x0"    # Lorg/researchstack/backbone/ui/views/AssetVideoView;
    .param p1, "x1"    # I

    .prologue
    .line 55
    iput p1, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->mVideoWidth:I

    return p1
.end method

.method static synthetic access$100(Lorg/researchstack/backbone/ui/views/AssetVideoView;)I
    .locals 1
    .param p0, "x0"    # Lorg/researchstack/backbone/ui/views/AssetVideoView;

    .prologue
    .line 55
    iget v0, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->mVideoHeight:I

    return v0
.end method

.method static synthetic access$1000(Lorg/researchstack/backbone/ui/views/AssetVideoView;)I
    .locals 1
    .param p0, "x0"    # Lorg/researchstack/backbone/ui/views/AssetVideoView;

    .prologue
    .line 55
    iget v0, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->mSurfaceWidth:I

    return v0
.end method

.method static synthetic access$1002(Lorg/researchstack/backbone/ui/views/AssetVideoView;I)I
    .locals 0
    .param p0, "x0"    # Lorg/researchstack/backbone/ui/views/AssetVideoView;
    .param p1, "x1"    # I

    .prologue
    .line 55
    iput p1, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->mSurfaceWidth:I

    return p1
.end method

.method static synthetic access$102(Lorg/researchstack/backbone/ui/views/AssetVideoView;I)I
    .locals 0
    .param p0, "x0"    # Lorg/researchstack/backbone/ui/views/AssetVideoView;
    .param p1, "x1"    # I

    .prologue
    .line 55
    iput p1, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->mVideoHeight:I

    return p1
.end method

.method static synthetic access$1100(Lorg/researchstack/backbone/ui/views/AssetVideoView;)I
    .locals 1
    .param p0, "x0"    # Lorg/researchstack/backbone/ui/views/AssetVideoView;

    .prologue
    .line 55
    iget v0, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->mSurfaceHeight:I

    return v0
.end method

.method static synthetic access$1102(Lorg/researchstack/backbone/ui/views/AssetVideoView;I)I
    .locals 0
    .param p0, "x0"    # Lorg/researchstack/backbone/ui/views/AssetVideoView;
    .param p1, "x1"    # I

    .prologue
    .line 55
    iput p1, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->mSurfaceHeight:I

    return p1
.end method

.method static synthetic access$1200(Lorg/researchstack/backbone/ui/views/AssetVideoView;)I
    .locals 1
    .param p0, "x0"    # Lorg/researchstack/backbone/ui/views/AssetVideoView;

    .prologue
    .line 55
    iget v0, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->mTargetState:I

    return v0
.end method

.method static synthetic access$1202(Lorg/researchstack/backbone/ui/views/AssetVideoView;I)I
    .locals 0
    .param p0, "x0"    # Lorg/researchstack/backbone/ui/views/AssetVideoView;
    .param p1, "x1"    # I

    .prologue
    .line 55
    iput p1, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->mTargetState:I

    return p1
.end method

.method static synthetic access$1300(Lorg/researchstack/backbone/ui/views/AssetVideoView;)Landroid/media/MediaPlayer$OnCompletionListener;
    .locals 1
    .param p0, "x0"    # Lorg/researchstack/backbone/ui/views/AssetVideoView;

    .prologue
    .line 55
    iget-object v0, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->mOnCompletionListener:Landroid/media/MediaPlayer$OnCompletionListener;

    return-object v0
.end method

.method static synthetic access$1400(Lorg/researchstack/backbone/ui/views/AssetVideoView;)Landroid/media/MediaPlayer$OnInfoListener;
    .locals 1
    .param p0, "x0"    # Lorg/researchstack/backbone/ui/views/AssetVideoView;

    .prologue
    .line 55
    iget-object v0, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->mOnInfoListener:Landroid/media/MediaPlayer$OnInfoListener;

    return-object v0
.end method

.method static synthetic access$1500(Lorg/researchstack/backbone/ui/views/AssetVideoView;)Ljava/lang/String;
    .locals 1
    .param p0, "x0"    # Lorg/researchstack/backbone/ui/views/AssetVideoView;

    .prologue
    .line 55
    iget-object v0, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->TAG:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$1600(Lorg/researchstack/backbone/ui/views/AssetVideoView;)Landroid/media/MediaPlayer$OnErrorListener;
    .locals 1
    .param p0, "x0"    # Lorg/researchstack/backbone/ui/views/AssetVideoView;

    .prologue
    .line 55
    iget-object v0, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->mOnErrorListener:Landroid/media/MediaPlayer$OnErrorListener;

    return-object v0
.end method

.method static synthetic access$1702(Lorg/researchstack/backbone/ui/views/AssetVideoView;I)I
    .locals 0
    .param p0, "x0"    # Lorg/researchstack/backbone/ui/views/AssetVideoView;
    .param p1, "x1"    # I

    .prologue
    .line 55
    iput p1, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->mCurrentBufferPercentage:I

    return p1
.end method

.method static synthetic access$1802(Lorg/researchstack/backbone/ui/views/AssetVideoView;Landroid/view/SurfaceHolder;)Landroid/view/SurfaceHolder;
    .locals 0
    .param p0, "x0"    # Lorg/researchstack/backbone/ui/views/AssetVideoView;
    .param p1, "x1"    # Landroid/view/SurfaceHolder;

    .prologue
    .line 55
    iput-object p1, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->mSurfaceHolder:Landroid/view/SurfaceHolder;

    return-object p1
.end method

.method static synthetic access$1900(Lorg/researchstack/backbone/ui/views/AssetVideoView;)V
    .locals 0
    .param p0, "x0"    # Lorg/researchstack/backbone/ui/views/AssetVideoView;

    .prologue
    .line 55
    invoke-direct {p0}, Lorg/researchstack/backbone/ui/views/AssetVideoView;->openVideo()V

    return-void
.end method

.method static synthetic access$2000(Lorg/researchstack/backbone/ui/views/AssetVideoView;Z)V
    .locals 0
    .param p0, "x0"    # Lorg/researchstack/backbone/ui/views/AssetVideoView;
    .param p1, "x1"    # Z

    .prologue
    .line 55
    invoke-direct {p0, p1}, Lorg/researchstack/backbone/ui/views/AssetVideoView;->release(Z)V

    return-void
.end method

.method static synthetic access$202(Lorg/researchstack/backbone/ui/views/AssetVideoView;I)I
    .locals 0
    .param p0, "x0"    # Lorg/researchstack/backbone/ui/views/AssetVideoView;
    .param p1, "x1"    # I

    .prologue
    .line 55
    iput p1, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->mCurrentState:I

    return p1
.end method

.method static synthetic access$302(Lorg/researchstack/backbone/ui/views/AssetVideoView;Z)Z
    .locals 0
    .param p0, "x0"    # Lorg/researchstack/backbone/ui/views/AssetVideoView;
    .param p1, "x1"    # Z

    .prologue
    .line 55
    iput-boolean p1, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->mCanPause:Z

    return p1
.end method

.method static synthetic access$402(Lorg/researchstack/backbone/ui/views/AssetVideoView;Z)Z
    .locals 0
    .param p0, "x0"    # Lorg/researchstack/backbone/ui/views/AssetVideoView;
    .param p1, "x1"    # Z

    .prologue
    .line 55
    iput-boolean p1, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->mCanSeekBack:Z

    return p1
.end method

.method static synthetic access$502(Lorg/researchstack/backbone/ui/views/AssetVideoView;Z)Z
    .locals 0
    .param p0, "x0"    # Lorg/researchstack/backbone/ui/views/AssetVideoView;
    .param p1, "x1"    # Z

    .prologue
    .line 55
    iput-boolean p1, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->mCanSeekForward:Z

    return p1
.end method

.method static synthetic access$600(Lorg/researchstack/backbone/ui/views/AssetVideoView;)Landroid/media/MediaPlayer$OnPreparedListener;
    .locals 1
    .param p0, "x0"    # Lorg/researchstack/backbone/ui/views/AssetVideoView;

    .prologue
    .line 55
    iget-object v0, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->mOnPreparedListener:Landroid/media/MediaPlayer$OnPreparedListener;

    return-object v0
.end method

.method static synthetic access$700(Lorg/researchstack/backbone/ui/views/AssetVideoView;)Landroid/media/MediaPlayer;
    .locals 1
    .param p0, "x0"    # Lorg/researchstack/backbone/ui/views/AssetVideoView;

    .prologue
    .line 55
    iget-object v0, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->mMediaPlayer:Landroid/media/MediaPlayer;

    return-object v0
.end method

.method static synthetic access$800(Lorg/researchstack/backbone/ui/views/AssetVideoView;)Landroid/widget/MediaController;
    .locals 1
    .param p0, "x0"    # Lorg/researchstack/backbone/ui/views/AssetVideoView;

    .prologue
    .line 55
    iget-object v0, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->mMediaController:Landroid/widget/MediaController;

    return-object v0
.end method

.method static synthetic access$900(Lorg/researchstack/backbone/ui/views/AssetVideoView;)I
    .locals 1
    .param p0, "x0"    # Lorg/researchstack/backbone/ui/views/AssetVideoView;

    .prologue
    .line 55
    iget v0, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->mSeekWhenPrepared:I

    return v0
.end method

.method private attachMediaController()V
    .locals 3

    .prologue
    .line 323
    iget-object v1, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->mMediaPlayer:Landroid/media/MediaPlayer;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->mMediaController:Landroid/widget/MediaController;

    if-eqz v1, :cond_0

    .line 325
    iget-object v1, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->mMediaController:Landroid/widget/MediaController;

    invoke-virtual {v1, p0}, Landroid/widget/MediaController;->setMediaPlayer(Landroid/widget/MediaController$MediaPlayerControl;)V

    .line 326
    invoke-virtual {p0}, Lorg/researchstack/backbone/ui/views/AssetVideoView;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    instance-of v1, v1, Landroid/view/View;

    if-eqz v1, :cond_1

    invoke-virtual {p0}, Lorg/researchstack/backbone/ui/views/AssetVideoView;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    move-object v0, v1

    .line 327
    .local v0, "anchorView":Landroid/view/View;
    :goto_0
    iget-object v1, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->mMediaController:Landroid/widget/MediaController;

    invoke-virtual {v1, v0}, Landroid/widget/MediaController;->setAnchorView(Landroid/view/View;)V

    .line 328
    iget-object v1, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->mMediaController:Landroid/widget/MediaController;

    invoke-direct {p0}, Lorg/researchstack/backbone/ui/views/AssetVideoView;->isInPlaybackState()Z

    move-result v2

    invoke-virtual {v1, v2}, Landroid/widget/MediaController;->setEnabled(Z)V

    .line 330
    .end local v0    # "anchorView":Landroid/view/View;
    :cond_0
    return-void

    :cond_1
    move-object v0, p0

    .line 326
    goto :goto_0
.end method

.method private initVideoView()V
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 218
    iput v2, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->mVideoWidth:I

    .line 219
    iput v2, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->mVideoHeight:I

    .line 220
    invoke-virtual {p0}, Lorg/researchstack/backbone/ui/views/AssetVideoView;->getHolder()Landroid/view/SurfaceHolder;

    move-result-object v0

    iget-object v1, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->mSHCallback:Landroid/view/SurfaceHolder$Callback;

    invoke-interface {v0, v1}, Landroid/view/SurfaceHolder;->addCallback(Landroid/view/SurfaceHolder$Callback;)V

    .line 221
    invoke-virtual {p0}, Lorg/researchstack/backbone/ui/views/AssetVideoView;->getHolder()Landroid/view/SurfaceHolder;

    move-result-object v0

    const/4 v1, 0x3

    invoke-interface {v0, v1}, Landroid/view/SurfaceHolder;->setType(I)V

    .line 222
    invoke-virtual {p0, v3}, Lorg/researchstack/backbone/ui/views/AssetVideoView;->setFocusable(Z)V

    .line 223
    invoke-virtual {p0, v3}, Lorg/researchstack/backbone/ui/views/AssetVideoView;->setFocusableInTouchMode(Z)V

    .line 224
    invoke-virtual {p0}, Lorg/researchstack/backbone/ui/views/AssetVideoView;->requestFocus()Z

    .line 225
    iput v2, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->mCurrentState:I

    .line 226
    iput v2, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->mTargetState:I

    .line 227
    return-void
.end method

.method private isInPlaybackState()Z
    .locals 3

    .prologue
    const/4 v0, 0x1

    .line 775
    iget-object v1, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->mMediaPlayer:Landroid/media/MediaPlayer;

    if-eqz v1, :cond_0

    iget v1, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->mCurrentState:I

    const/4 v2, -0x1

    if-eq v1, v2, :cond_0

    iget v1, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->mCurrentState:I

    if-eqz v1, :cond_0

    iget v1, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->mCurrentState:I

    if-eq v1, v0, :cond_0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private openVideo()V
    .locals 11

    .prologue
    const/4 v2, 0x3

    const/4 v10, -0x1

    const/4 v9, 0x0

    const/4 v8, 0x1

    .line 258
    iget-object v0, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->mFileDescriptor:Ljava/io/FileDescriptor;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->mSurfaceHolder:Landroid/view/SurfaceHolder;

    if-nez v0, :cond_1

    .line 309
    :cond_0
    :goto_0
    return-void

    .line 265
    :cond_1
    invoke-direct {p0, v9}, Lorg/researchstack/backbone/ui/views/AssetVideoView;->release(Z)V

    .line 267
    invoke-virtual {p0}, Lorg/researchstack/backbone/ui/views/AssetVideoView;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "audio"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroid/media/AudioManager;

    .line 268
    .local v6, "am":Landroid/media/AudioManager;
    const/4 v0, 0x0

    invoke-virtual {v6, v0, v2, v8}, Landroid/media/AudioManager;->requestAudioFocus(Landroid/media/AudioManager$OnAudioFocusChangeListener;II)I

    .line 272
    :try_start_0
    new-instance v0, Landroid/media/MediaPlayer;

    invoke-direct {v0}, Landroid/media/MediaPlayer;-><init>()V

    iput-object v0, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->mMediaPlayer:Landroid/media/MediaPlayer;

    .line 274
    iget v0, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->mAudioSession:I

    if-eqz v0, :cond_2

    .line 276
    iget-object v0, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->mMediaPlayer:Landroid/media/MediaPlayer;

    iget v1, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->mAudioSession:I

    invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->setAudioSessionId(I)V

    .line 282
    :goto_1
    iget-object v0, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->mMediaPlayer:Landroid/media/MediaPlayer;

    iget-object v1, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->mPreparedListener:Landroid/media/MediaPlayer$OnPreparedListener;

    invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->setOnPreparedListener(Landroid/media/MediaPlayer$OnPreparedListener;)V

    .line 283
    iget-object v0, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->mMediaPlayer:Landroid/media/MediaPlayer;

    iget-object v1, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->mSizeChangedListener:Landroid/media/MediaPlayer$OnVideoSizeChangedListener;

    invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->setOnVideoSizeChangedListener(Landroid/media/MediaPlayer$OnVideoSizeChangedListener;)V

    .line 284
    iget-object v0, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->mMediaPlayer:Landroid/media/MediaPlayer;

    iget-object v1, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->mCompletionListener:Landroid/media/MediaPlayer$OnCompletionListener;

    invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->setOnCompletionListener(Landroid/media/MediaPlayer$OnCompletionListener;)V

    .line 285
    iget-object v0, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->mMediaPlayer:Landroid/media/MediaPlayer;

    iget-object v1, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->mErrorListener:Landroid/media/MediaPlayer$OnErrorListener;

    invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->setOnErrorListener(Landroid/media/MediaPlayer$OnErrorListener;)V

    .line 286
    iget-object v0, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->mMediaPlayer:Landroid/media/MediaPlayer;

    iget-object v1, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->mInfoListener:Landroid/media/MediaPlayer$OnInfoListener;

    invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->setOnInfoListener(Landroid/media/MediaPlayer$OnInfoListener;)V

    .line 287
    iget-object v0, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->mMediaPlayer:Landroid/media/MediaPlayer;

    iget-object v1, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->mBufferingUpdateListener:Landroid/media/MediaPlayer$OnBufferingUpdateListener;

    invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->setOnBufferingUpdateListener(Landroid/media/MediaPlayer$OnBufferingUpdateListener;)V

    .line 288
    const/4 v0, 0x0

    iput v0, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->mCurrentBufferPercentage:I

    .line 289
    iget-object v0, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->mMediaPlayer:Landroid/media/MediaPlayer;

    iget-object v1, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->mFileDescriptor:Ljava/io/FileDescriptor;

    iget-wide v2, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->mStartOffset:J

    iget-wide v4, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->mLength:J

    invoke-virtual/range {v0 .. v5}, Landroid/media/MediaPlayer;->setDataSource(Ljava/io/FileDescriptor;JJ)V

    .line 290
    iget-object v0, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->mMediaPlayer:Landroid/media/MediaPlayer;

    iget-object v1, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->mSurfaceHolder:Landroid/view/SurfaceHolder;

    invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->setDisplay(Landroid/view/SurfaceHolder;)V

    .line 291
    iget-object v0, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->mMediaPlayer:Landroid/media/MediaPlayer;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->setAudioStreamType(I)V

    .line 292
    iget-object v0, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->mMediaPlayer:Landroid/media/MediaPlayer;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->setScreenOnWhilePlaying(Z)V

    .line 293
    iget-object v0, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->mMediaPlayer:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->prepareAsync()V

    .line 298
    const/4 v0, 0x1

    iput v0, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->mCurrentState:I

    .line 299
    invoke-direct {p0}, Lorg/researchstack/backbone/ui/views/AssetVideoView;->attachMediaController()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1

    goto :goto_0

    .line 301
    :catch_0
    move-exception v7

    .line 303
    .local v7, "ex":Ljava/lang/Exception;
    :goto_2
    iget-object v0, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unable to open content: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->mFileDescriptor:Ljava/io/FileDescriptor;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, v7}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 304
    iput v10, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->mCurrentState:I

    .line 305
    iput v10, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->mTargetState:I

    .line 306
    iget-object v0, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->mErrorListener:Landroid/media/MediaPlayer$OnErrorListener;

    iget-object v1, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->mMediaPlayer:Landroid/media/MediaPlayer;

    invoke-interface {v0, v1, v8, v9}, Landroid/media/MediaPlayer$OnErrorListener;->onError(Landroid/media/MediaPlayer;II)Z

    goto/16 :goto_0

    .line 280
    .end local v7    # "ex":Ljava/lang/Exception;
    :cond_2
    :try_start_1
    iget-object v0, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->mMediaPlayer:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->getAudioSessionId()I

    move-result v0

    iput v0, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->mAudioSession:I
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_1

    goto/16 :goto_1

    .line 301
    :catch_1
    move-exception v7

    goto :goto_2
.end method

.method private release(Z)V
    .locals 4
    .param p1, "cleartargetstate"    # Z

    .prologue
    const/4 v3, 0x0

    const/4 v2, 0x0

    .line 588
    iget-object v1, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->mMediaPlayer:Landroid/media/MediaPlayer;

    if-eqz v1, :cond_1

    .line 590
    iget-object v1, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->mMediaPlayer:Landroid/media/MediaPlayer;

    invoke-virtual {v1}, Landroid/media/MediaPlayer;->reset()V

    .line 591
    iget-object v1, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->mMediaPlayer:Landroid/media/MediaPlayer;

    invoke-virtual {v1}, Landroid/media/MediaPlayer;->release()V

    .line 592
    iput-object v3, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->mMediaPlayer:Landroid/media/MediaPlayer;

    .line 593
    iput v2, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->mCurrentState:I

    .line 594
    if-eqz p1, :cond_0

    .line 596
    iput v2, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->mTargetState:I

    .line 598
    :cond_0
    invoke-virtual {p0}, Lorg/researchstack/backbone/ui/views/AssetVideoView;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "audio"

    invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/media/AudioManager;

    .line 599
    .local v0, "am":Landroid/media/AudioManager;
    invoke-virtual {v0, v3}, Landroid/media/AudioManager;->abandonAudioFocus(Landroid/media/AudioManager$OnAudioFocusChangeListener;)I

    .line 601
    .end local v0    # "am":Landroid/media/AudioManager;
    :cond_1
    return-void
.end method

.method private toggleMediaControlsVisiblity()V
    .locals 1

    .prologue
    .line 680
    iget-object v0, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->mMediaController:Landroid/widget/MediaController;

    invoke-virtual {v0}, Landroid/widget/MediaController;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 682
    iget-object v0, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->mMediaController:Landroid/widget/MediaController;

    invoke-virtual {v0}, Landroid/widget/MediaController;->hide()V

    .line 688
    :goto_0
    return-void

    .line 686
    :cond_0
    iget-object v0, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->mMediaController:Landroid/widget/MediaController;

    invoke-virtual {v0}, Landroid/widget/MediaController;->show()V

    goto :goto_0
.end method


# virtual methods
.method public canPause()Z
    .locals 1

    .prologue
    .line 784
    iget-boolean v0, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->mCanPause:Z

    return v0
.end method

.method public canSeekBackward()Z
    .locals 1

    .prologue
    .line 790
    iget-boolean v0, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->mCanSeekBack:Z

    return v0
.end method

.method public canSeekForward()Z
    .locals 1

    .prologue
    .line 796
    iget-boolean v0, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->mCanSeekForward:Z

    return v0
.end method

.method public getAccessibilityClassName()Ljava/lang/CharSequence;
    .locals 1

    .prologue
    .line 208
    const-class v0, Landroid/widget/VideoView;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getAudioSessionId()I
    .locals 2

    .prologue
    .line 802
    iget v1, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->mAudioSession:I

    if-nez v1, :cond_0

    .line 804
    new-instance v0, Landroid/media/MediaPlayer;

    invoke-direct {v0}, Landroid/media/MediaPlayer;-><init>()V

    .line 805
    .local v0, "foo":Landroid/media/MediaPlayer;
    invoke-virtual {v0}, Landroid/media/MediaPlayer;->getAudioSessionId()I

    move-result v1

    iput v1, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->mAudioSession:I

    .line 806
    invoke-virtual {v0}, Landroid/media/MediaPlayer;->release()V

    .line 808
    .end local v0    # "foo":Landroid/media/MediaPlayer;
    :cond_0
    iget v1, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->mAudioSession:I

    return v1
.end method

.method public getBufferPercentage()I
    .locals 1

    .prologue
    .line 766
    iget-object v0, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->mMediaPlayer:Landroid/media/MediaPlayer;

    if-eqz v0, :cond_0

    .line 768
    iget v0, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->mCurrentBufferPercentage:I

    .line 770
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public getCurrentPosition()I
    .locals 1

    .prologue
    .line 736
    invoke-direct {p0}, Lorg/researchstack/backbone/ui/views/AssetVideoView;->isInPlaybackState()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 738
    iget-object v0, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->mMediaPlayer:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->getCurrentPosition()I

    move-result v0

    .line 740
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public getDuration()I
    .locals 1

    .prologue
    .line 725
    invoke-direct {p0}, Lorg/researchstack/backbone/ui/views/AssetVideoView;->isInPlaybackState()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 727
    iget-object v0, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->mMediaPlayer:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->getDuration()I

    move-result v0

    .line 730
    :goto_0
    return v0

    :cond_0
    const/4 v0, -0x1

    goto :goto_0
.end method

.method public isPlaying()Z
    .locals 1

    .prologue
    .line 760
    invoke-direct {p0}, Lorg/researchstack/backbone/ui/views/AssetVideoView;->isInPlaybackState()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->mMediaPlayer:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->isPlaying()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 3
    .param p1, "keyCode"    # I
    .param p2, "event"    # Landroid/view/KeyEvent;

    .prologue
    const/4 v1, 0x1

    .line 626
    const/4 v2, 0x4

    if-eq p1, v2, :cond_2

    const/16 v2, 0x18

    if-eq p1, v2, :cond_2

    const/16 v2, 0x19

    if-eq p1, v2, :cond_2

    const/16 v2, 0xa4

    if-eq p1, v2, :cond_2

    const/16 v2, 0x52

    if-eq p1, v2, :cond_2

    const/4 v2, 0x5

    if-eq p1, v2, :cond_2

    const/4 v2, 0x6

    if-eq p1, v2, :cond_2

    move v0, v1

    .line 633
    .local v0, "isKeyCodeSupported":Z
    :goto_0
    invoke-direct {p0}, Lorg/researchstack/backbone/ui/views/AssetVideoView;->isInPlaybackState()Z

    move-result v2

    if-eqz v2, :cond_8

    if-eqz v0, :cond_8

    iget-object v2, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->mMediaController:Landroid/widget/MediaController;

    if-eqz v2, :cond_8

    .line 635
    const/16 v2, 0x4f

    if-eq p1, v2, :cond_0

    const/16 v2, 0x55

    if-ne p1, v2, :cond_4

    .line 638
    :cond_0
    iget-object v2, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->mMediaPlayer:Landroid/media/MediaPlayer;

    invoke-virtual {v2}, Landroid/media/MediaPlayer;->isPlaying()Z

    move-result v2

    if-eqz v2, :cond_3

    .line 640
    invoke-virtual {p0}, Lorg/researchstack/backbone/ui/views/AssetVideoView;->pause()V

    .line 641
    iget-object v2, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->mMediaController:Landroid/widget/MediaController;

    invoke-virtual {v2}, Landroid/widget/MediaController;->show()V

    .line 675
    :cond_1
    :goto_1
    return v1

    .line 626
    .end local v0    # "isKeyCodeSupported":Z
    :cond_2
    const/4 v0, 0x0

    goto :goto_0

    .line 645
    .restart local v0    # "isKeyCodeSupported":Z
    :cond_3
    invoke-virtual {p0}, Lorg/researchstack/backbone/ui/views/AssetVideoView;->start()V

    .line 646
    iget-object v2, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->mMediaController:Landroid/widget/MediaController;

    invoke-virtual {v2}, Landroid/widget/MediaController;->hide()V

    goto :goto_1

    .line 650
    :cond_4
    const/16 v2, 0x7e

    if-ne p1, v2, :cond_5

    .line 652
    iget-object v2, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->mMediaPlayer:Landroid/media/MediaPlayer;

    invoke-virtual {v2}, Landroid/media/MediaPlayer;->isPlaying()Z

    move-result v2

    if-nez v2, :cond_1

    .line 654
    invoke-virtual {p0}, Lorg/researchstack/backbone/ui/views/AssetVideoView;->start()V

    .line 655
    iget-object v2, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->mMediaController:Landroid/widget/MediaController;

    invoke-virtual {v2}, Landroid/widget/MediaController;->hide()V

    goto :goto_1

    .line 659
    :cond_5
    const/16 v2, 0x56

    if-eq p1, v2, :cond_6

    const/16 v2, 0x7f

    if-ne p1, v2, :cond_7

    .line 662
    :cond_6
    iget-object v2, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->mMediaPlayer:Landroid/media/MediaPlayer;

    invoke-virtual {v2}, Landroid/media/MediaPlayer;->isPlaying()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 664
    invoke-virtual {p0}, Lorg/researchstack/backbone/ui/views/AssetVideoView;->pause()V

    .line 665
    iget-object v2, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->mMediaController:Landroid/widget/MediaController;

    invoke-virtual {v2}, Landroid/widget/MediaController;->show()V

    goto :goto_1

    .line 671
    :cond_7
    invoke-direct {p0}, Lorg/researchstack/backbone/ui/views/AssetVideoView;->toggleMediaControlsVisiblity()V

    .line 675
    :cond_8
    invoke-super {p0, p1, p2}, Landroid/view/SurfaceView;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result v1

    goto :goto_1
.end method

.method protected onMeasure(II)V
    .locals 9
    .param p1, "widthMeasureSpec"    # I
    .param p2, "heightMeasureSpec"    # I

    .prologue
    const/high16 v7, 0x40000000    # 2.0f

    const/high16 v8, -0x80000000

    .line 129
    iget v6, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->mVideoWidth:I

    invoke-static {v6, p1}, Lorg/researchstack/backbone/ui/views/AssetVideoView;->getDefaultSize(II)I

    move-result v3

    .line 130
    .local v3, "width":I
    iget v6, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->mVideoHeight:I

    invoke-static {v6, p2}, Lorg/researchstack/backbone/ui/views/AssetVideoView;->getDefaultSize(II)I

    move-result v0

    .line 131
    .local v0, "height":I
    iget v6, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->mVideoWidth:I

    if-lez v6, :cond_0

    iget v6, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->mVideoHeight:I

    if-lez v6, :cond_0

    .line 134
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v4

    .line 135
    .local v4, "widthSpecMode":I
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v5

    .line 136
    .local v5, "widthSpecSize":I
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v1

    .line 137
    .local v1, "heightSpecMode":I
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v2

    .line 139
    .local v2, "heightSpecSize":I
    if-ne v4, v7, :cond_2

    if-ne v1, v7, :cond_2

    .line 142
    move v3, v5

    .line 143
    move v0, v2

    .line 146
    iget v6, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->mVideoWidth:I

    mul-int/2addr v6, v0

    iget v7, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->mVideoHeight:I

    mul-int/2addr v7, v3

    if-ge v6, v7, :cond_1

    .line 149
    iget v6, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->mVideoWidth:I

    mul-int/2addr v6, v0

    iget v7, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->mVideoHeight:I

    div-int v3, v6, v7

    .line 202
    .end local v1    # "heightSpecMode":I
    .end local v2    # "heightSpecSize":I
    .end local v4    # "widthSpecMode":I
    .end local v5    # "widthSpecSize":I
    :cond_0
    :goto_0
    invoke-virtual {p0, v3, v0}, Lorg/researchstack/backbone/ui/views/AssetVideoView;->setMeasuredDimension(II)V

    .line 203
    return-void

    .line 151
    .restart local v1    # "heightSpecMode":I
    .restart local v2    # "heightSpecSize":I
    .restart local v4    # "widthSpecMode":I
    .restart local v5    # "widthSpecSize":I
    :cond_1
    iget v6, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->mVideoWidth:I

    mul-int/2addr v6, v0

    iget v7, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->mVideoHeight:I

    mul-int/2addr v7, v3

    if-le v6, v7, :cond_0

    .line 154
    iget v6, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->mVideoHeight:I

    mul-int/2addr v6, v3

    iget v7, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->mVideoWidth:I

    div-int v0, v6, v7

    goto :goto_0

    .line 157
    :cond_2
    if-ne v4, v7, :cond_3

    .line 160
    move v3, v5

    .line 161
    iget v6, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->mVideoHeight:I

    mul-int/2addr v6, v3

    iget v7, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->mVideoWidth:I

    div-int v0, v6, v7

    .line 162
    if-ne v1, v8, :cond_0

    if-le v0, v2, :cond_0

    .line 165
    move v0, v2

    goto :goto_0

    .line 168
    :cond_3
    if-ne v1, v7, :cond_4

    .line 171
    move v0, v2

    .line 172
    iget v6, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->mVideoWidth:I

    mul-int/2addr v6, v0

    iget v7, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->mVideoHeight:I

    div-int v3, v6, v7

    .line 173
    if-ne v4, v8, :cond_0

    if-le v3, v5, :cond_0

    .line 176
    move v3, v5

    goto :goto_0

    .line 182
    :cond_4
    iget v3, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->mVideoWidth:I

    .line 183
    iget v0, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->mVideoHeight:I

    .line 184
    if-ne v1, v8, :cond_5

    if-le v0, v2, :cond_5

    .line 187
    move v0, v2

    .line 188
    iget v6, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->mVideoWidth:I

    mul-int/2addr v6, v0

    iget v7, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->mVideoHeight:I

    div-int v3, v6, v7

    .line 190
    :cond_5
    if-ne v4, v8, :cond_0

    if-le v3, v5, :cond_0

    .line 193
    move v3, v5

    .line 194
    iget v6, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->mVideoHeight:I

    mul-int/2addr v6, v3

    iget v7, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->mVideoWidth:I

    div-int v0, v6, v7

    goto :goto_0
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1
    .param p1, "ev"    # Landroid/view/MotionEvent;

    .prologue
    .line 606
    invoke-direct {p0}, Lorg/researchstack/backbone/ui/views/AssetVideoView;->isInPlaybackState()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->mMediaController:Landroid/widget/MediaController;

    if-eqz v0, :cond_0

    .line 608
    invoke-direct {p0}, Lorg/researchstack/backbone/ui/views/AssetVideoView;->toggleMediaControlsVisiblity()V

    .line 610
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public onTrackballEvent(Landroid/view/MotionEvent;)Z
    .locals 1
    .param p1, "ev"    # Landroid/view/MotionEvent;

    .prologue
    .line 616
    invoke-direct {p0}, Lorg/researchstack/backbone/ui/views/AssetVideoView;->isInPlaybackState()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->mMediaController:Landroid/widget/MediaController;

    if-eqz v0, :cond_0

    .line 618
    invoke-direct {p0}, Lorg/researchstack/backbone/ui/views/AssetVideoView;->toggleMediaControlsVisiblity()V

    .line 620
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public pause()V
    .locals 2

    .prologue
    const/4 v1, 0x4

    .line 704
    invoke-direct {p0}, Lorg/researchstack/backbone/ui/views/AssetVideoView;->isInPlaybackState()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->mMediaPlayer:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->isPlaying()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 706
    iget-object v0, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->mMediaPlayer:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->pause()V

    .line 707
    iput v1, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->mCurrentState:I

    .line 709
    :cond_0
    iput v1, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->mTargetState:I

    .line 710
    return-void
.end method

.method public resolveAdjustedSize(II)I
    .locals 1
    .param p1, "desiredSize"    # I
    .param p2, "measureSpec"    # I

    .prologue
    .line 213
    invoke-static {p1, p2}, Lorg/researchstack/backbone/ui/views/AssetVideoView;->getDefaultSize(II)I

    move-result v0

    return v0
.end method

.method public resume()V
    .locals 0

    .prologue
    .line 719
    invoke-direct {p0}, Lorg/researchstack/backbone/ui/views/AssetVideoView;->openVideo()V

    .line 720
    return-void
.end method

.method public seekTo(I)V
    .locals 1
    .param p1, "msec"    # I

    .prologue
    .line 746
    invoke-direct {p0}, Lorg/researchstack/backbone/ui/views/AssetVideoView;->isInPlaybackState()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 748
    iget-object v0, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->mMediaPlayer:Landroid/media/MediaPlayer;

    invoke-virtual {v0, p1}, Landroid/media/MediaPlayer;->seekTo(I)V

    .line 749
    const/4 v0, 0x0

    iput v0, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->mSeekWhenPrepared:I

    .line 755
    :goto_0
    return-void

    .line 753
    :cond_0
    iput p1, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->mSeekWhenPrepared:I

    goto :goto_0
.end method

.method public setMediaController(Landroid/widget/MediaController;)V
    .locals 1
    .param p1, "controller"    # Landroid/widget/MediaController;

    .prologue
    .line 313
    iget-object v0, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->mMediaController:Landroid/widget/MediaController;

    if-eqz v0, :cond_0

    .line 315
    iget-object v0, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->mMediaController:Landroid/widget/MediaController;

    invoke-virtual {v0}, Landroid/widget/MediaController;->hide()V

    .line 317
    :cond_0
    iput-object p1, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->mMediaController:Landroid/widget/MediaController;

    .line 318
    invoke-direct {p0}, Lorg/researchstack/backbone/ui/views/AssetVideoView;->attachMediaController()V

    .line 319
    return-void
.end method

.method public setOnCompletionListener(Landroid/media/MediaPlayer$OnCompletionListener;)V
    .locals 0
    .param p1, "l"    # Landroid/media/MediaPlayer$OnCompletionListener;

    .prologue
    .line 521
    iput-object p1, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->mOnCompletionListener:Landroid/media/MediaPlayer$OnCompletionListener;

    .line 522
    return-void
.end method

.method public setOnErrorListener(Landroid/media/MediaPlayer$OnErrorListener;)V
    .locals 0
    .param p1, "l"    # Landroid/media/MediaPlayer$OnErrorListener;

    .prologue
    .line 533
    iput-object p1, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->mOnErrorListener:Landroid/media/MediaPlayer$OnErrorListener;

    .line 534
    return-void
.end method

.method public setOnInfoListener(Landroid/media/MediaPlayer$OnInfoListener;)V
    .locals 0
    .param p1, "l"    # Landroid/media/MediaPlayer$OnInfoListener;

    .prologue
    .line 544
    iput-object p1, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->mOnInfoListener:Landroid/media/MediaPlayer$OnInfoListener;

    .line 545
    return-void
.end method

.method public setOnPreparedListener(Landroid/media/MediaPlayer$OnPreparedListener;)V
    .locals 0
    .param p1, "l"    # Landroid/media/MediaPlayer$OnPreparedListener;

    .prologue
    .line 510
    iput-object p1, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->mOnPreparedListener:Landroid/media/MediaPlayer$OnPreparedListener;

    .line 511
    return-void
.end method

.method public setVideoDataSource(Ljava/io/FileDescriptor;JJ)V
    .locals 2
    .param p1, "fileDescriptor"    # Ljava/io/FileDescriptor;
    .param p2, "startOffset"    # J
    .param p4, "length"    # J

    .prologue
    .line 231
    iput-object p1, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->mFileDescriptor:Ljava/io/FileDescriptor;

    .line 232
    iput-wide p2, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->mStartOffset:J

    .line 233
    iput-wide p4, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->mLength:J

    .line 235
    const/4 v0, 0x0

    iput v0, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->mSeekWhenPrepared:I

    .line 236
    invoke-direct {p0}, Lorg/researchstack/backbone/ui/views/AssetVideoView;->openVideo()V

    .line 237
    invoke-virtual {p0}, Lorg/researchstack/backbone/ui/views/AssetVideoView;->requestLayout()V

    .line 238
    invoke-virtual {p0}, Lorg/researchstack/backbone/ui/views/AssetVideoView;->invalidate()V

    .line 239
    return-void
.end method

.method public start()V
    .locals 2

    .prologue
    const/4 v1, 0x3

    .line 693
    invoke-direct {p0}, Lorg/researchstack/backbone/ui/views/AssetVideoView;->isInPlaybackState()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 695
    iget-object v0, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->mMediaPlayer:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->start()V

    .line 696
    iput v1, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->mCurrentState:I

    .line 698
    :cond_0
    iput v1, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->mTargetState:I

    .line 699
    return-void
.end method

.method public stopPlayback()V
    .locals 4

    .prologue
    const/4 v3, 0x0

    const/4 v2, 0x0

    .line 244
    iget-object v1, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->mMediaPlayer:Landroid/media/MediaPlayer;

    if-eqz v1, :cond_0

    .line 246
    iget-object v1, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->mMediaPlayer:Landroid/media/MediaPlayer;

    invoke-virtual {v1}, Landroid/media/MediaPlayer;->stop()V

    .line 247
    iget-object v1, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->mMediaPlayer:Landroid/media/MediaPlayer;

    invoke-virtual {v1}, Landroid/media/MediaPlayer;->release()V

    .line 248
    iput-object v3, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->mMediaPlayer:Landroid/media/MediaPlayer;

    .line 249
    iput v2, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->mCurrentState:I

    .line 250
    iput v2, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView;->mTargetState:I

    .line 251
    invoke-virtual {p0}, Lorg/researchstack/backbone/ui/views/AssetVideoView;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "audio"

    invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/media/AudioManager;

    .line 252
    .local v0, "am":Landroid/media/AudioManager;
    invoke-virtual {v0, v3}, Landroid/media/AudioManager;->abandonAudioFocus(Landroid/media/AudioManager$OnAudioFocusChangeListener;)I

    .line 254
    .end local v0    # "am":Landroid/media/AudioManager;
    :cond_0
    return-void
.end method

.method public suspend()V
    .locals 1

    .prologue
    .line 714
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lorg/researchstack/backbone/ui/views/AssetVideoView;->release(Z)V

    .line 715
    return-void
.end method
