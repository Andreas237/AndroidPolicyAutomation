.class public Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;
.super Landroid/widget/FrameLayout;
.source "JCVideoPlayer.java"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Landroid/widget/SeekBar$OnSeekBarChangeListener;
.implements Landroid/view/SurfaceHolder$Callback;
.implements Landroid/view/View$OnTouchListener;


# static fields
.field public static final CURRENT_STATE_NORMAL:I = 0x4

.field public static final CURRENT_STATE_OVER:I = 0x3

.field public static final CURRENT_STATE_PAUSE:I = 0x1

.field public static final CURRENT_STATE_PLAYING:I = 0x2

.field public static final CURRENT_STATE_PREPAREING:I = 0x0

.field private static final FULL_SCREEN_NORMAL_DELAY:I = 0x1388

.field private static clickfullscreentime:J = 0x0L

.field public static globleSkin:Lfm/jiecao/jcvideoplayer_lib/Skin; = null

.field static isClickFullscreen:Z = false

.field private static isFromFullScreenBackHere:Z = false

.field private static mDismissControlViewTimer:Ljava/util/Timer;

.field private static mUpdateProgressTimer:Ljava/util/Timer;

.field private static speScalType:Landroid/widget/ImageView$ScaleType;


# instance fields
.field public CURRENT_STATE:I

.field private enlargRecId:I

.field private ifFullScreen:Z

.field private ifMp3:Z

.field public ifShowTitle:Z

.field ivBack:Landroid/widget/ImageView;

.field ivCover:Landroid/widget/ImageView;

.field ivFullScreen:Landroid/widget/ImageView;

.field public ivStart:Landroid/widget/ImageView;

.field public ivThumb:Landroid/widget/ImageView;

.field llBottomControl:Landroid/widget/LinearLayout;

.field llTitleContainer:Landroid/widget/LinearLayout;

.field private mSeekbarOnTouchListener:Landroid/view/View$OnTouchListener;

.field pbBottom:Landroid/widget/ProgressBar;

.field pbLoading:Landroid/widget/ProgressBar;

.field rlParent:Landroid/widget/RelativeLayout;

.field private shrinkRecId:I

.field skProgress:Landroid/widget/SeekBar;

.field private skin:Lfm/jiecao/jcvideoplayer_lib/Skin;

.field surfaceHolder:Landroid/view/SurfaceHolder;

.field surfaceView:Lfm/jiecao/jcvideoplayer_lib/ResizeSurfaceView;

.field private title:Ljava/lang/String;

.field private touchingProgressBar:Z

.field tvTimeCurrent:Landroid/widget/TextView;

.field tvTimeTotal:Landroid/widget/TextView;

.field tvTitle:Landroid/widget/TextView;

.field private url:Ljava/lang/String;

.field public uuid:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 90
    invoke-direct {p0, p1, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 p2, 0x0

    .line 58
    iput-boolean p2, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->ifFullScreen:Z

    .line 60
    iput-boolean p2, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->ifShowTitle:Z

    .line 61
    iput-boolean p2, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->ifMp3:Z

    .line 63
    iput p2, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->enlargRecId:I

    .line 64
    iput p2, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->shrinkRecId:I

    const/4 v0, -0x1

    .line 70
    iput v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->CURRENT_STATE:I

    .line 83
    iput-boolean p2, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->touchingProgressBar:Z

    .line 91
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object p2

    invoke-virtual {p2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->uuid:Ljava/lang/String;

    .line 92
    invoke-direct {p0, p1}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->init(Landroid/content/Context;)V

    return-void
.end method

.method static synthetic access$000(Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;)V
    .locals 0

    .line 38
    invoke-direct {p0}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->dismissControlView()V

    return-void
.end method

.method private cancelDismissControlViewTimer()V
    .locals 1

    .line 445
    sget-object v0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->mDismissControlViewTimer:Ljava/util/Timer;

    if-eqz v0, :cond_0

    .line 446
    sget-object v0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->mDismissControlViewTimer:Ljava/util/Timer;

    invoke-virtual {v0}, Ljava/util/Timer;->cancel()V

    :cond_0
    return-void
.end method

.method private cancelProgressTimer()V
    .locals 2

    .line 514
    iget-object v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->uuid:Ljava/lang/String;

    invoke-static {}, Lfm/jiecao/jcvideoplayer_lib/JCMediaManager;->intance()Lfm/jiecao/jcvideoplayer_lib/JCMediaManager;

    move-result-object v1

    iget-object v1, v1, Lfm/jiecao/jcvideoplayer_lib/JCMediaManager;->uuid:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 515
    sget-object v0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->mUpdateProgressTimer:Ljava/util/Timer;

    if-eqz v0, :cond_0

    .line 516
    sget-object v0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->mUpdateProgressTimer:Ljava/util/Timer;

    invoke-virtual {v0}, Ljava/util/Timer;->cancel()V

    :cond_0
    return-void
.end method

.method private dismissControlView()V
    .locals 3

    .line 438
    iget-object v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->llBottomControl:Landroid/widget/LinearLayout;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 439
    iget-object v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->pbBottom:Landroid/widget/ProgressBar;

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 440
    invoke-direct {p0, v1}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->setTitleVisibility(I)V

    .line 441
    iget-object v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->ivStart:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    return-void
.end method

.method private init(Landroid/content/Context;)V
    .locals 1

    .line 96
    sget v0, Lfm/jiecao/jcvideoplayer_lib/R$layout;->video_control_view:I

    invoke-static {p1, v0, p0}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 97
    sget p1, Lfm/jiecao/jcvideoplayer_lib/R$id;->start:I

    invoke-virtual {p0, p1}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->ivStart:Landroid/widget/ImageView;

    .line 98
    sget p1, Lfm/jiecao/jcvideoplayer_lib/R$id;->loading:I

    invoke-virtual {p0, p1}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ProgressBar;

    iput-object p1, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->pbLoading:Landroid/widget/ProgressBar;

    .line 99
    sget p1, Lfm/jiecao/jcvideoplayer_lib/R$id;->bottom_progressbar:I

    invoke-virtual {p0, p1}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ProgressBar;

    iput-object p1, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->pbBottom:Landroid/widget/ProgressBar;

    .line 100
    sget p1, Lfm/jiecao/jcvideoplayer_lib/R$id;->fullscreen:I

    invoke-virtual {p0, p1}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->ivFullScreen:Landroid/widget/ImageView;

    .line 101
    sget p1, Lfm/jiecao/jcvideoplayer_lib/R$id;->progress:I

    invoke-virtual {p0, p1}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/SeekBar;

    iput-object p1, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->skProgress:Landroid/widget/SeekBar;

    .line 102
    sget p1, Lfm/jiecao/jcvideoplayer_lib/R$id;->current:I

    invoke-virtual {p0, p1}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->tvTimeCurrent:Landroid/widget/TextView;

    .line 103
    sget p1, Lfm/jiecao/jcvideoplayer_lib/R$id;->total:I

    invoke-virtual {p0, p1}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->tvTimeTotal:Landroid/widget/TextView;

    .line 104
    sget p1, Lfm/jiecao/jcvideoplayer_lib/R$id;->surfaceView:I

    invoke-virtual {p0, p1}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lfm/jiecao/jcvideoplayer_lib/ResizeSurfaceView;

    iput-object p1, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->surfaceView:Lfm/jiecao/jcvideoplayer_lib/ResizeSurfaceView;

    .line 105
    sget p1, Lfm/jiecao/jcvideoplayer_lib/R$id;->bottom_control:I

    invoke-virtual {p0, p1}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/LinearLayout;

    iput-object p1, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->llBottomControl:Landroid/widget/LinearLayout;

    .line 106
    sget p1, Lfm/jiecao/jcvideoplayer_lib/R$id;->title:I

    invoke-virtual {p0, p1}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->tvTitle:Landroid/widget/TextView;

    .line 107
    sget p1, Lfm/jiecao/jcvideoplayer_lib/R$id;->back:I

    invoke-virtual {p0, p1}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->ivBack:Landroid/widget/ImageView;

    .line 108
    sget p1, Lfm/jiecao/jcvideoplayer_lib/R$id;->thumb:I

    invoke-virtual {p0, p1}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->ivThumb:Landroid/widget/ImageView;

    .line 109
    sget p1, Lfm/jiecao/jcvideoplayer_lib/R$id;->parentview:I

    invoke-virtual {p0, p1}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/RelativeLayout;

    iput-object p1, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->rlParent:Landroid/widget/RelativeLayout;

    .line 110
    sget p1, Lfm/jiecao/jcvideoplayer_lib/R$id;->title_container:I

    invoke-virtual {p0, p1}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/LinearLayout;

    iput-object p1, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->llTitleContainer:Landroid/widget/LinearLayout;

    .line 111
    sget p1, Lfm/jiecao/jcvideoplayer_lib/R$id;->cover:I

    invoke-virtual {p0, p1}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->ivCover:Landroid/widget/ImageView;

    .line 115
    iget-object p1, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->surfaceView:Lfm/jiecao/jcvideoplayer_lib/ResizeSurfaceView;

    invoke-virtual {p1}, Lfm/jiecao/jcvideoplayer_lib/ResizeSurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    move-result-object p1

    iput-object p1, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->surfaceHolder:Landroid/view/SurfaceHolder;

    .line 116
    iget-object p1, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->ivStart:Landroid/widget/ImageView;

    invoke-virtual {p1, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 117
    iget-object p1, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->ivThumb:Landroid/widget/ImageView;

    invoke-virtual {p1, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 118
    iget-object p1, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->ivFullScreen:Landroid/widget/ImageView;

    invoke-virtual {p1, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 119
    iget-object p1, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->skProgress:Landroid/widget/SeekBar;

    invoke-virtual {p1, p0}, Landroid/widget/SeekBar;->setOnSeekBarChangeListener(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V

    .line 120
    iget-object p1, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->surfaceHolder:Landroid/view/SurfaceHolder;

    invoke-interface {p1, p0}, Landroid/view/SurfaceHolder;->addCallback(Landroid/view/SurfaceHolder$Callback;)V

    .line 121
    iget-object p1, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->surfaceView:Lfm/jiecao/jcvideoplayer_lib/ResizeSurfaceView;

    invoke-virtual {p1, p0}, Lfm/jiecao/jcvideoplayer_lib/ResizeSurfaceView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 122
    iget-object p1, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->llBottomControl:Landroid/widget/LinearLayout;

    invoke-virtual {p1, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 123
    iget-object p1, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->rlParent:Landroid/widget/RelativeLayout;

    invoke-virtual {p1, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 124
    iget-object p1, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->ivBack:Landroid/widget/ImageView;

    invoke-virtual {p1, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 125
    iget-object p1, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->skProgress:Landroid/widget/SeekBar;

    invoke-virtual {p1, p0}, Landroid/widget/SeekBar;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 126
    sget-object p1, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->speScalType:Landroid/widget/ImageView$ScaleType;

    if-eqz p1, :cond_0

    .line 127
    iget-object p1, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->ivThumb:Landroid/widget/ImageView;

    sget-object v0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->speScalType:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    :cond_0
    return-void
.end method

.method private onClickToggleClear()V
    .locals 4

    .line 451
    iget v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->CURRENT_STATE:I

    const/4 v1, 0x0

    const/4 v2, 0x4

    if-nez v0, :cond_1

    .line 452
    iget-object v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->llBottomControl:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    .line 453
    iget-object v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->llBottomControl:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 454
    iget-object v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->pbBottom:Landroid/widget/ProgressBar;

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 455
    invoke-direct {p0, v2}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->setTitleVisibility(I)V

    goto :goto_0

    .line 457
    :cond_0
    iget-object v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->llBottomControl:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 458
    iget-object v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->pbBottom:Landroid/widget/ProgressBar;

    invoke-virtual {v0, v2}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 459
    invoke-direct {p0, v1}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->setTitleVisibility(I)V

    .line 461
    :goto_0
    iget-object v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->ivStart:Landroid/widget/ImageView;

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 462
    iget-object v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->pbLoading:Landroid/widget/ProgressBar;

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    goto/16 :goto_3

    .line 463
    :cond_1
    iget v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->CURRENT_STATE:I

    const/4 v3, 0x2

    if-ne v0, v3, :cond_3

    .line 464
    iget-object v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->llBottomControl:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getVisibility()I

    move-result v0

    if-nez v0, :cond_2

    .line 465
    iget-object v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->llBottomControl:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 466
    iget-object v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->pbBottom:Landroid/widget/ProgressBar;

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 467
    invoke-direct {p0, v2}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->setTitleVisibility(I)V

    .line 468
    iget-object v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->ivStart:Landroid/widget/ImageView;

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_1

    .line 470
    :cond_2
    invoke-direct {p0}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->updateStartImage()V

    .line 471
    iget-object v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->ivStart:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 472
    iget-object v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->llBottomControl:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 473
    iget-object v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->pbBottom:Landroid/widget/ProgressBar;

    invoke-virtual {v0, v2}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 474
    invoke-direct {p0, v1}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->setTitleVisibility(I)V

    .line 476
    :goto_1
    iget-object v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->pbLoading:Landroid/widget/ProgressBar;

    invoke-virtual {v0, v2}, Landroid/widget/ProgressBar;->setVisibility(I)V

    goto :goto_3

    .line 477
    :cond_3
    iget v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->CURRENT_STATE:I

    const/4 v3, 0x1

    if-ne v0, v3, :cond_5

    .line 478
    iget-object v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->llBottomControl:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getVisibility()I

    move-result v0

    if-nez v0, :cond_4

    .line 479
    iget-object v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->llBottomControl:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 480
    iget-object v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->pbBottom:Landroid/widget/ProgressBar;

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 481
    invoke-direct {p0, v2}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->setTitleVisibility(I)V

    .line 482
    iget-object v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->ivStart:Landroid/widget/ImageView;

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_2

    .line 484
    :cond_4
    invoke-direct {p0}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->updateStartImage()V

    .line 485
    iget-object v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->ivStart:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 486
    iget-object v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->llBottomControl:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 487
    iget-object v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->pbBottom:Landroid/widget/ProgressBar;

    invoke-virtual {v0, v2}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 488
    invoke-direct {p0, v1}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->setTitleVisibility(I)V

    .line 490
    :goto_2
    iget-object v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->pbLoading:Landroid/widget/ProgressBar;

    invoke-virtual {v0, v2}, Landroid/widget/ProgressBar;->setVisibility(I)V

    :cond_5
    :goto_3
    return-void
.end method

.method public static releaseAllVideos()V
    .locals 3

    .line 676
    sget-boolean v0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->isClickFullscreen:Z

    if-nez v0, :cond_0

    .line 677
    invoke-static {}, Lfm/jiecao/jcvideoplayer_lib/JCMediaManager;->intance()Lfm/jiecao/jcvideoplayer_lib/JCMediaManager;

    move-result-object v0

    iget-object v0, v0, Lfm/jiecao/jcvideoplayer_lib/JCMediaManager;->mediaPlayer:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->stop()V

    .line 678
    invoke-static {}, Lfm/jiecao/jcvideoplayer_lib/JCMediaManager;->intance()Lfm/jiecao/jcvideoplayer_lib/JCMediaManager;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Lfm/jiecao/jcvideoplayer_lib/JCMediaManager;->setUuid(Ljava/lang/String;)V

    .line 679
    invoke-static {}, Lfm/jiecao/jcvideoplayer_lib/JCMediaManager;->intance()Lfm/jiecao/jcvideoplayer_lib/JCMediaManager;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Lfm/jiecao/jcvideoplayer_lib/JCMediaManager;->setUuid(Ljava/lang/String;)V

    .line 680
    invoke-static {}, Lde/greenrobot/event/EventBus;->getDefault()Lde/greenrobot/event/EventBus;

    move-result-object v0

    new-instance v1, Lfm/jiecao/jcvideoplayer_lib/VideoEvents;

    invoke-direct {v1}, Lfm/jiecao/jcvideoplayer_lib/VideoEvents;-><init>()V

    const v2, 0x595b7

    invoke-virtual {v1, v2}, Lfm/jiecao/jcvideoplayer_lib/VideoEvents;->setType(I)Lfm/jiecao/jcvideoplayer_lib/VideoEvents;

    move-result-object v1

    invoke-virtual {v0, v1}, Lde/greenrobot/event/EventBus;->post(Ljava/lang/Object;)V

    .line 681
    sget-object v0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->mUpdateProgressTimer:Ljava/util/Timer;

    if-eqz v0, :cond_0

    .line 682
    sget-object v0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->mUpdateProgressTimer:Ljava/util/Timer;

    invoke-virtual {v0}, Ljava/util/Timer;->cancel()V

    :cond_0
    return-void
.end method

.method private sendPointEvent(I)V
    .locals 1

    .line 705
    new-instance v0, Lfm/jiecao/jcvideoplayer_lib/VideoEvents;

    invoke-direct {v0}, Lfm/jiecao/jcvideoplayer_lib/VideoEvents;-><init>()V

    .line 706
    invoke-virtual {v0, p1}, Lfm/jiecao/jcvideoplayer_lib/VideoEvents;->setType(I)Lfm/jiecao/jcvideoplayer_lib/VideoEvents;

    .line 707
    iget-object p1, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->title:Ljava/lang/String;

    iput-object p1, v0, Lfm/jiecao/jcvideoplayer_lib/VideoEvents;->obj:Ljava/lang/Object;

    .line 708
    iget-object p1, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->url:Ljava/lang/String;

    iput-object p1, v0, Lfm/jiecao/jcvideoplayer_lib/VideoEvents;->obj1:Ljava/lang/Object;

    .line 709
    invoke-static {}, Lde/greenrobot/event/EventBus;->getDefault()Lde/greenrobot/event/EventBus;

    move-result-object p1

    invoke-virtual {p1, v0}, Lde/greenrobot/event/EventBus;->post(Ljava/lang/Object;)V

    return-void
.end method

.method public static setGlobleSkin(IIIIII)V
    .locals 8

    .line 775
    new-instance v7, Lfm/jiecao/jcvideoplayer_lib/Skin;

    move-object v0, v7

    move v1, p0

    move v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    move v6, p5

    invoke-direct/range {v0 .. v6}, Lfm/jiecao/jcvideoplayer_lib/Skin;-><init>(IIIIII)V

    sput-object v7, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->globleSkin:Lfm/jiecao/jcvideoplayer_lib/Skin;

    return-void
.end method

.method private setProgressAndTime(III)V
    .locals 1

    .line 561
    iget-boolean v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->touchingProgressBar:Z

    if-nez v0, :cond_0

    .line 562
    iget-object v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->skProgress:Landroid/widget/SeekBar;

    invoke-virtual {v0, p1}, Landroid/widget/SeekBar;->setProgress(I)V

    .line 563
    iget-object v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->pbBottom:Landroid/widget/ProgressBar;

    invoke-virtual {v0, p1}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 565
    :cond_0
    iget-object p1, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->tvTimeCurrent:Landroid/widget/TextView;

    invoke-static {p2}, Lfm/jiecao/jcvideoplayer_lib/Utils;->stringForTime(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 566
    iget-object p1, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->tvTimeTotal:Landroid/widget/TextView;

    invoke-static {p3}, Lfm/jiecao/jcvideoplayer_lib/Utils;->stringForTime(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private setProgressAndTimeFromTimer()V
    .locals 4

    .line 553
    invoke-static {}, Lfm/jiecao/jcvideoplayer_lib/JCMediaManager;->intance()Lfm/jiecao/jcvideoplayer_lib/JCMediaManager;

    move-result-object v0

    iget-object v0, v0, Lfm/jiecao/jcvideoplayer_lib/JCMediaManager;->mediaPlayer:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->getCurrentPosition()I

    move-result v0

    .line 554
    invoke-static {}, Lfm/jiecao/jcvideoplayer_lib/JCMediaManager;->intance()Lfm/jiecao/jcvideoplayer_lib/JCMediaManager;

    move-result-object v1

    iget-object v1, v1, Lfm/jiecao/jcvideoplayer_lib/JCMediaManager;->mediaPlayer:Landroid/media/MediaPlayer;

    invoke-virtual {v1}, Landroid/media/MediaPlayer;->getDuration()I

    move-result v1

    mul-int/lit8 v2, v0, 0x64

    if-nez v1, :cond_0

    const/4 v3, 0x1

    goto :goto_0

    :cond_0
    move v3, v1

    .line 556
    :goto_0
    div-int/2addr v2, v3

    .line 557
    invoke-direct {p0, v2, v0, v1}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->setProgressAndTime(III)V

    return-void
.end method

.method private setProgressBuffered(I)V
    .locals 1

    if-ltz p1, :cond_0

    .line 547
    iget-object v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->skProgress:Landroid/widget/SeekBar;

    invoke-virtual {v0, p1}, Landroid/widget/SeekBar;->setSecondaryProgress(I)V

    .line 548
    iget-object v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->pbBottom:Landroid/widget/ProgressBar;

    invoke-virtual {v0, p1}, Landroid/widget/ProgressBar;->setSecondaryProgress(I)V

    :cond_0
    return-void
.end method

.method private setSkin()V
    .locals 1

    .line 788
    iget-object v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->skin:Lfm/jiecao/jcvideoplayer_lib/Skin;

    if-eqz v0, :cond_0

    .line 789
    iget-object v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->skin:Lfm/jiecao/jcvideoplayer_lib/Skin;

    invoke-direct {p0, v0}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->setSkin(Lfm/jiecao/jcvideoplayer_lib/Skin;)V

    goto :goto_0

    .line 791
    :cond_0
    sget-object v0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->globleSkin:Lfm/jiecao/jcvideoplayer_lib/Skin;

    if-eqz v0, :cond_1

    .line 792
    sget-object v0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->globleSkin:Lfm/jiecao/jcvideoplayer_lib/Skin;

    invoke-direct {p0, v0}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->setSkin(Lfm/jiecao/jcvideoplayer_lib/Skin;)V

    :cond_1
    :goto_0
    return-void
.end method

.method private setSkin(Lfm/jiecao/jcvideoplayer_lib/Skin;)V
    .locals 4

    .line 798
    invoke-virtual {p0}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    .line 799
    iget v1, p1, Lfm/jiecao/jcvideoplayer_lib/Skin;->titleColor:I

    if-eqz v1, :cond_0

    .line 800
    iget v1, p1, Lfm/jiecao/jcvideoplayer_lib/Skin;->titleColor:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColorStateList(I)Landroid/content/res/ColorStateList;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 802
    iget-object v2, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->tvTitle:Landroid/widget/TextView;

    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 805
    :cond_0
    iget v1, p1, Lfm/jiecao/jcvideoplayer_lib/Skin;->timeColor:I

    if-eqz v1, :cond_1

    .line 806
    iget v1, p1, Lfm/jiecao/jcvideoplayer_lib/Skin;->timeColor:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColorStateList(I)Landroid/content/res/ColorStateList;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 808
    iget-object v2, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->tvTimeCurrent:Landroid/widget/TextView;

    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 809
    iget-object v2, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->tvTimeTotal:Landroid/widget/TextView;

    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 812
    :cond_1
    iget v1, p1, Lfm/jiecao/jcvideoplayer_lib/Skin;->seekDrawable:I

    if-eqz v1, :cond_2

    .line 813
    iget v1, p1, Lfm/jiecao/jcvideoplayer_lib/Skin;->seekDrawable:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    .line 814
    iget-object v2, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->skProgress:Landroid/widget/SeekBar;

    invoke-virtual {v2}, Landroid/widget/SeekBar;->getProgressDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v2

    invoke-virtual {v2}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v2

    .line 815
    iget-object v3, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->skProgress:Landroid/widget/SeekBar;

    invoke-virtual {v3, v1}, Landroid/widget/SeekBar;->setProgressDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 816
    iget-object v1, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->skProgress:Landroid/widget/SeekBar;

    invoke-virtual {v1}, Landroid/widget/SeekBar;->getProgressDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v1, v2}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V

    .line 817
    iget-object v1, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->pbBottom:Landroid/widget/ProgressBar;

    iget v2, p1, Lfm/jiecao/jcvideoplayer_lib/Skin;->seekDrawable:I

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/ProgressBar;->setProgressDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 819
    :cond_2
    iget v1, p1, Lfm/jiecao/jcvideoplayer_lib/Skin;->bottomControlBackground:I

    if-eqz v1, :cond_3

    .line 820
    iget-object v1, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->llBottomControl:Landroid/widget/LinearLayout;

    iget v2, p1, Lfm/jiecao/jcvideoplayer_lib/Skin;->bottomControlBackground:I

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {v1, v0}, Landroid/widget/LinearLayout;->setBackgroundColor(I)V

    .line 822
    :cond_3
    iget v0, p1, Lfm/jiecao/jcvideoplayer_lib/Skin;->enlargRecId:I

    iput v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->enlargRecId:I

    .line 823
    iget p1, p1, Lfm/jiecao/jcvideoplayer_lib/Skin;->shrinkRecId:I

    iput p1, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->shrinkRecId:I

    return-void
.end method

.method public static setThumbImageViewScalType(Landroid/widget/ImageView$ScaleType;)V
    .locals 0

    .line 745
    sput-object p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->speScalType:Landroid/widget/ImageView$ScaleType;

    return-void
.end method

.method private setTitleVisibility(I)V
    .locals 1

    .line 526
    iget-boolean v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->ifShowTitle:Z

    if-eqz v0, :cond_0

    .line 527
    iget-object v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->llTitleContainer:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto :goto_0

    .line 529
    :cond_0
    iget-boolean v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->ifFullScreen:Z

    if-eqz v0, :cond_1

    .line 530
    iget-object v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->llTitleContainer:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto :goto_0

    .line 532
    :cond_1
    iget-object p1, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->llTitleContainer:Landroid/widget/LinearLayout;

    const/4 v0, 0x4

    invoke-virtual {p1, v0}, Landroid/widget/LinearLayout;->setVisibility(I)V

    :goto_0
    return-void
.end method

.method private startDismissControlViewTimer()V
    .locals 4

    .line 417
    invoke-direct {p0}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->cancelDismissControlViewTimer()V

    .line 418
    new-instance v0, Ljava/util/Timer;

    invoke-direct {v0}, Ljava/util/Timer;-><init>()V

    sput-object v0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->mDismissControlViewTimer:Ljava/util/Timer;

    .line 419
    sget-object v0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->mDismissControlViewTimer:Ljava/util/Timer;

    new-instance v1, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer$1;

    invoke-direct {v1, p0}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer$1;-><init>(Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;)V

    const-wide/16 v2, 0x9c4

    invoke-virtual {v0, v1, v2, v3}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V

    return-void
.end method

.method private startProgressTimer()V
    .locals 7

    .line 495
    invoke-direct {p0}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->cancelProgressTimer()V

    .line 496
    new-instance v0, Ljava/util/Timer;

    invoke-direct {v0}, Ljava/util/Timer;-><init>()V

    sput-object v0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->mUpdateProgressTimer:Ljava/util/Timer;

    .line 497
    sget-object v1, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->mUpdateProgressTimer:Ljava/util/Timer;

    new-instance v2, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer$2;

    invoke-direct {v2, p0}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer$2;-><init>(Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;)V

    const-wide/16 v3, 0x0

    const-wide/16 v5, 0x12c

    invoke-virtual/range {v1 .. v6}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;JJ)V

    return-void
.end method

.method private stopToFullscreenOrQuitFullscreenShowDisplay()V
    .locals 3

    .line 626
    iget v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->CURRENT_STATE:I

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-ne v0, v2, :cond_0

    .line 627
    invoke-static {}, Lfm/jiecao/jcvideoplayer_lib/JCMediaManager;->intance()Lfm/jiecao/jcvideoplayer_lib/JCMediaManager;

    move-result-object v0

    iget-object v0, v0, Lfm/jiecao/jcvideoplayer_lib/JCMediaManager;->mediaPlayer:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->start()V

    .line 628
    iput v1, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->CURRENT_STATE:I

    .line 629
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer$3;

    invoke-direct {v1, p0}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer$3;-><init>(Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 640
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 641
    iget-object v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->surfaceView:Lfm/jiecao/jcvideoplayer_lib/ResizeSurfaceView;

    invoke-virtual {v0}, Lfm/jiecao/jcvideoplayer_lib/ResizeSurfaceView;->requestLayout()V

    goto :goto_0

    .line 642
    :cond_0
    iget v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->CURRENT_STATE:I

    if-ne v0, v1, :cond_1

    .line 643
    invoke-static {}, Lfm/jiecao/jcvideoplayer_lib/JCMediaManager;->intance()Lfm/jiecao/jcvideoplayer_lib/JCMediaManager;

    move-result-object v0

    iget-object v0, v0, Lfm/jiecao/jcvideoplayer_lib/JCMediaManager;->mediaPlayer:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->start()V

    :cond_1
    :goto_0
    return-void
.end method

.method public static toFullscreenActivity(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 784
    invoke-static {p0, p1, p2}, Lfm/jiecao/jcvideoplayer_lib/JCFullScreenActivity;->toActivity(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private updateStartImage()V
    .locals 2

    .line 538
    iget v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->CURRENT_STATE:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    .line 539
    iget-object v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->ivStart:Landroid/widget/ImageView;

    sget v1, Lfm/jiecao/jcvideoplayer_lib/R$drawable;->click_video_pause_selector:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_0

    .line 541
    :cond_0
    iget-object v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->ivStart:Landroid/widget/ImageView;

    sget v1, Lfm/jiecao/jcvideoplayer_lib/R$drawable;->click_video_play_selector:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    :goto_0
    return-void
.end method


# virtual methods
.method protected onAttachedToWindow()V
    .locals 1

    .line 607
    invoke-super {p0}, Landroid/widget/FrameLayout;->onAttachedToWindow()V

    .line 608
    invoke-static {}, Lde/greenrobot/event/EventBus;->getDefault()Lde/greenrobot/event/EventBus;

    move-result-object v0

    invoke-virtual {v0, p0}, Lde/greenrobot/event/EventBus;->isRegistered(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 609
    invoke-static {}, Lde/greenrobot/event/EventBus;->getDefault()Lde/greenrobot/event/EventBus;

    move-result-object v0

    invoke-virtual {v0, p0}, Lde/greenrobot/event/EventBus;->register(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 338
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    .line 339
    sget v0, Lfm/jiecao/jcvideoplayer_lib/R$id;->start:I

    const/4 v1, 0x1

    if-eq p1, v0, :cond_7

    sget v0, Lfm/jiecao/jcvideoplayer_lib/R$id;->thumb:I

    if-ne p1, v0, :cond_0

    goto/16 :goto_3

    .line 392
    :cond_0
    sget v0, Lfm/jiecao/jcvideoplayer_lib/R$id;->fullscreen:I

    if-ne p1, v0, :cond_2

    .line 393
    iget-boolean p1, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->ifFullScreen:Z

    if-eqz p1, :cond_1

    .line 394
    invoke-virtual {p0}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->quitFullScreen()V

    goto :goto_0

    .line 396
    :cond_1
    iget-object p1, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->skin:Lfm/jiecao/jcvideoplayer_lib/Skin;

    sput-object p1, Lfm/jiecao/jcvideoplayer_lib/JCFullScreenActivity;->skin:Lfm/jiecao/jcvideoplayer_lib/Skin;

    .line 397
    invoke-static {}, Lfm/jiecao/jcvideoplayer_lib/JCMediaManager;->intance()Lfm/jiecao/jcvideoplayer_lib/JCMediaManager;

    move-result-object p1

    iget-object p1, p1, Lfm/jiecao/jcvideoplayer_lib/JCMediaManager;->mediaPlayer:Landroid/media/MediaPlayer;

    invoke-virtual {p1}, Landroid/media/MediaPlayer;->pause()V

    .line 398
    invoke-static {}, Lfm/jiecao/jcvideoplayer_lib/JCMediaManager;->intance()Lfm/jiecao/jcvideoplayer_lib/JCMediaManager;

    move-result-object p1

    iget-object p1, p1, Lfm/jiecao/jcvideoplayer_lib/JCMediaManager;->mediaPlayer:Landroid/media/MediaPlayer;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/media/MediaPlayer;->setDisplay(Landroid/view/SurfaceHolder;)V

    .line 399
    invoke-static {}, Lfm/jiecao/jcvideoplayer_lib/JCMediaManager;->intance()Lfm/jiecao/jcvideoplayer_lib/JCMediaManager;

    move-result-object p1

    invoke-virtual {p1}, Lfm/jiecao/jcvideoplayer_lib/JCMediaManager;->backUpUuid()V

    .line 400
    sput-boolean v1, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->isClickFullscreen:Z

    .line 401
    invoke-virtual {p0}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->getContext()Landroid/content/Context;

    move-result-object p1

    iget v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->CURRENT_STATE:I

    iget-object v1, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->url:Ljava/lang/String;

    iget-object v2, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->title:Ljava/lang/String;

    invoke-static {p1, v0, v1, v2}, Lfm/jiecao/jcvideoplayer_lib/JCFullScreenActivity;->toActivityFromNormal(Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;)V

    const p1, 0x599a4

    .line 402
    invoke-direct {p0, p1}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->sendPointEvent(I)V

    .line 404
    :goto_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sput-wide v0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->clickfullscreentime:J

    goto/16 :goto_7

    .line 405
    :cond_2
    sget v0, Lfm/jiecao/jcvideoplayer_lib/R$id;->surfaceView:I

    if-eq p1, v0, :cond_5

    sget v0, Lfm/jiecao/jcvideoplayer_lib/R$id;->parentview:I

    if-ne p1, v0, :cond_3

    goto :goto_1

    .line 409
    :cond_3
    sget v0, Lfm/jiecao/jcvideoplayer_lib/R$id;->bottom_control:I

    if-ne p1, v0, :cond_4

    goto/16 :goto_7

    .line 411
    :cond_4
    sget v0, Lfm/jiecao/jcvideoplayer_lib/R$id;->back:I

    if-ne p1, v0, :cond_10

    .line 412
    invoke-virtual {p0}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->quitFullScreen()V

    goto/16 :goto_7

    .line 406
    :cond_5
    :goto_1
    invoke-direct {p0}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->onClickToggleClear()V

    .line 407
    invoke-direct {p0}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->startDismissControlViewTimer()V

    .line 408
    iget-boolean p1, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->ifFullScreen:Z

    if-eqz p1, :cond_6

    const p1, 0x5999f

    goto :goto_2

    :cond_6
    const p1, 0x5999e

    :goto_2
    invoke-direct {p0, p1}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->sendPointEvent(I)V

    goto/16 :goto_7

    .line 340
    :cond_7
    :goto_3
    iget-object v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->url:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v2, 0x0

    if-eqz v0, :cond_8

    .line 341
    invoke-virtual {p0}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->getContext()Landroid/content/Context;

    move-result-object p1

    const-string v0, "\u89c6\u9891\u5730\u5740\u4e3a\u7a7a"

    invoke-static {p1, v0, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    return-void

    .line 344
    :cond_8
    iget v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->CURRENT_STATE:I

    const/4 v3, 0x4

    if-ne v0, v3, :cond_a

    .line 345
    invoke-static {}, Lfm/jiecao/jcvideoplayer_lib/JCMediaManager;->intance()Lfm/jiecao/jcvideoplayer_lib/JCMediaManager;

    move-result-object v0

    invoke-virtual {v0}, Lfm/jiecao/jcvideoplayer_lib/JCMediaManager;->clearWidthAndHeight()V

    .line 346
    iput v2, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->CURRENT_STATE:I

    .line 347
    iget-object v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->ivStart:Landroid/widget/ImageView;

    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 348
    iget-object v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->ivThumb:Landroid/widget/ImageView;

    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 349
    iget-object v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->pbLoading:Landroid/widget/ProgressBar;

    invoke-virtual {v0, v2}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 350
    iget-object v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->ivCover:Landroid/widget/ImageView;

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 351
    invoke-direct {p0, v2, v2, v2}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->setProgressAndTime(III)V

    .line 352
    invoke-direct {p0, v2}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->setProgressBuffered(I)V

    .line 353
    invoke-static {}, Lfm/jiecao/jcvideoplayer_lib/JCMediaManager;->intance()Lfm/jiecao/jcvideoplayer_lib/JCMediaManager;

    move-result-object v0

    invoke-virtual {p0}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->getContext()Landroid/content/Context;

    move-result-object v2

    iget-object v3, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->url:Ljava/lang/String;

    invoke-virtual {v0, v2, v3}, Lfm/jiecao/jcvideoplayer_lib/JCMediaManager;->prepareToPlay(Landroid/content/Context;Ljava/lang/String;)V

    .line 354
    invoke-static {}, Lfm/jiecao/jcvideoplayer_lib/JCMediaManager;->intance()Lfm/jiecao/jcvideoplayer_lib/JCMediaManager;

    move-result-object v0

    iget-object v2, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->uuid:Ljava/lang/String;

    invoke-virtual {v0, v2}, Lfm/jiecao/jcvideoplayer_lib/JCMediaManager;->setUuid(Ljava/lang/String;)V

    const-string v0, "JCVideoPlayer"

    const-string v2, "play video"

    .line 355
    invoke-static {v0, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 357
    new-instance v0, Lfm/jiecao/jcvideoplayer_lib/VideoEvents;

    invoke-direct {v0}, Lfm/jiecao/jcvideoplayer_lib/VideoEvents;-><init>()V

    const v2, 0x595b1

    invoke-virtual {v0, v2}, Lfm/jiecao/jcvideoplayer_lib/VideoEvents;->setType(I)Lfm/jiecao/jcvideoplayer_lib/VideoEvents;

    move-result-object v0

    .line 358
    iget-object v2, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->uuid:Ljava/lang/String;

    iput-object v2, v0, Lfm/jiecao/jcvideoplayer_lib/VideoEvents;->obj:Ljava/lang/Object;

    .line 359
    invoke-static {}, Lde/greenrobot/event/EventBus;->getDefault()Lde/greenrobot/event/EventBus;

    move-result-object v2

    invoke-virtual {v2, v0}, Lde/greenrobot/event/EventBus;->post(Ljava/lang/Object;)V

    .line 360
    iget-object v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->surfaceView:Lfm/jiecao/jcvideoplayer_lib/ResizeSurfaceView;

    invoke-virtual {v0}, Lfm/jiecao/jcvideoplayer_lib/ResizeSurfaceView;->requestLayout()V

    .line 361
    invoke-virtual {p0, v1}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->setKeepScreenOn(Z)V

    .line 363
    sget v0, Lfm/jiecao/jcvideoplayer_lib/R$id;->start:I

    if-ne p1, v0, :cond_9

    const p1, 0x59999

    goto :goto_4

    :cond_9
    const p1, 0x5999a

    :goto_4
    invoke-direct {p0, p1}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->sendPointEvent(I)V

    goto/16 :goto_7

    .line 364
    :cond_a
    iget p1, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->CURRENT_STATE:I

    const/4 v0, 0x2

    if-ne p1, v0, :cond_d

    .line 365
    iput v1, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->CURRENT_STATE:I

    .line 366
    iget-object p1, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->ivThumb:Landroid/widget/ImageView;

    invoke-virtual {p1, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 367
    iget-boolean p1, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->ifMp3:Z

    if-nez p1, :cond_b

    .line 368
    iget-object p1, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->ivCover:Landroid/widget/ImageView;

    invoke-virtual {p1, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 370
    :cond_b
    invoke-static {}, Lfm/jiecao/jcvideoplayer_lib/JCMediaManager;->intance()Lfm/jiecao/jcvideoplayer_lib/JCMediaManager;

    move-result-object p1

    iget-object p1, p1, Lfm/jiecao/jcvideoplayer_lib/JCMediaManager;->mediaPlayer:Landroid/media/MediaPlayer;

    invoke-virtual {p1}, Landroid/media/MediaPlayer;->pause()V

    const-string p1, "JCVideoPlayer"

    const-string v0, "pause video"

    .line 371
    invoke-static {p1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 373
    invoke-direct {p0}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->updateStartImage()V

    .line 374
    invoke-virtual {p0, v2}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->setKeepScreenOn(Z)V

    .line 375
    invoke-direct {p0}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->cancelDismissControlViewTimer()V

    .line 376
    iget-boolean p1, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->ifFullScreen:Z

    if-eqz p1, :cond_c

    const p1, 0x5999c

    goto :goto_5

    :cond_c
    const p1, 0x5999b

    :goto_5
    invoke-direct {p0, p1}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->sendPointEvent(I)V

    goto :goto_7

    .line 377
    :cond_d
    iget p1, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->CURRENT_STATE:I

    if-ne p1, v1, :cond_10

    .line 378
    iput v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->CURRENT_STATE:I

    .line 379
    iget-object p1, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->ivThumb:Landroid/widget/ImageView;

    invoke-virtual {p1, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 380
    iget-boolean p1, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->ifMp3:Z

    if-nez p1, :cond_e

    .line 381
    iget-object p1, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->ivCover:Landroid/widget/ImageView;

    invoke-virtual {p1, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 383
    :cond_e
    invoke-static {}, Lfm/jiecao/jcvideoplayer_lib/JCMediaManager;->intance()Lfm/jiecao/jcvideoplayer_lib/JCMediaManager;

    move-result-object p1

    iget-object p1, p1, Lfm/jiecao/jcvideoplayer_lib/JCMediaManager;->mediaPlayer:Landroid/media/MediaPlayer;

    invoke-virtual {p1}, Landroid/media/MediaPlayer;->start()V

    const-string p1, "JCVideoPlayer"

    const-string v0, "go on video"

    .line 384
    invoke-static {p1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 386
    invoke-direct {p0}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->updateStartImage()V

    .line 387
    invoke-virtual {p0, v1}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->setKeepScreenOn(Z)V

    .line 388
    invoke-direct {p0}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->startDismissControlViewTimer()V

    .line 389
    iget-boolean p1, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->ifFullScreen:Z

    if-eqz p1, :cond_f

    const p1, 0x5999d

    goto :goto_6

    :cond_f
    const p1, 0x599a6

    :goto_6
    invoke-direct {p0, p1}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->sendPointEvent(I)V

    :cond_10
    :goto_7
    return-void
.end method

.method protected onDetachedFromWindow()V
    .locals 2

    .line 597
    invoke-super {p0}, Landroid/widget/FrameLayout;->onDetachedFromWindow()V

    .line 598
    invoke-static {}, Lde/greenrobot/event/EventBus;->getDefault()Lde/greenrobot/event/EventBus;

    move-result-object v0

    invoke-virtual {v0, p0}, Lde/greenrobot/event/EventBus;->unregister(Ljava/lang/Object;)V

    .line 600
    iget-object v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->uuid:Ljava/lang/String;

    invoke-static {}, Lfm/jiecao/jcvideoplayer_lib/JCMediaManager;->intance()Lfm/jiecao/jcvideoplayer_lib/JCMediaManager;

    move-result-object v1

    iget-object v1, v1, Lfm/jiecao/jcvideoplayer_lib/JCMediaManager;->uuid:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 601
    invoke-static {}, Lfm/jiecao/jcvideoplayer_lib/JCMediaManager;->intance()Lfm/jiecao/jcvideoplayer_lib/JCMediaManager;

    move-result-object v0

    iget-object v0, v0, Lfm/jiecao/jcvideoplayer_lib/JCMediaManager;->mediaPlayer:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->stop()V

    :cond_0
    return-void
.end method

.method public onEventMainThread(Lfm/jiecao/jcvideoplayer_lib/VideoEvents;)V
    .locals 4

    .line 262
    iget v0, p1, Lfm/jiecao/jcvideoplayer_lib/VideoEvents;->type:I

    const/4 v1, 0x0

    const/4 v2, 0x4

    const v3, 0x595b7

    if-ne v0, v3, :cond_1

    .line 264
    invoke-direct {p0}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->cancelProgressTimer()V

    .line 265
    iget-object v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->ivStart:Landroid/widget/ImageView;

    sget v3, Lfm/jiecao/jcvideoplayer_lib/R$drawable;->click_video_play_selector:I

    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 266
    iget-object v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->ivThumb:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 267
    iget-object v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->ivStart:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 271
    iput v2, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->CURRENT_STATE:I

    .line 272
    invoke-virtual {p0, v1}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->setKeepScreenOn(Z)V

    .line 273
    invoke-static {}, Lfm/jiecao/jcvideoplayer_lib/JCMediaManager;->intance()Lfm/jiecao/jcvideoplayer_lib/JCMediaManager;

    move-result-object v0

    iget-object v0, v0, Lfm/jiecao/jcvideoplayer_lib/JCMediaManager;->uuid:Ljava/lang/String;

    iget-object v3, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->uuid:Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 274
    iget-boolean v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->ifFullScreen:Z

    if-eqz v0, :cond_0

    const v0, 0x599a3

    goto :goto_0

    :cond_0
    const v0, 0x599a2

    :goto_0
    invoke-direct {p0, v0}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->sendPointEvent(I)V

    .line 277
    :cond_1
    invoke-static {}, Lfm/jiecao/jcvideoplayer_lib/JCMediaManager;->intance()Lfm/jiecao/jcvideoplayer_lib/JCMediaManager;

    move-result-object v0

    iget-object v0, v0, Lfm/jiecao/jcvideoplayer_lib/JCMediaManager;->uuid:Ljava/lang/String;

    iget-object v3, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->uuid:Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 278
    iget p1, p1, Lfm/jiecao/jcvideoplayer_lib/VideoEvents;->type:I

    const v0, 0x595b1

    if-ne p1, v0, :cond_2

    .line 279
    iget p1, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->CURRENT_STATE:I

    if-eq p1, v2, :cond_2

    .line 280
    invoke-virtual {p0, v2}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->setState(I)V

    :cond_2
    return-void

    .line 285
    :cond_3
    iget v0, p1, Lfm/jiecao/jcvideoplayer_lib/VideoEvents;->type:I

    const v3, 0x595b4

    if-ne v0, v3, :cond_6

    .line 286
    iget p1, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->CURRENT_STATE:I

    if-eqz p1, :cond_4

    return-void

    .line 287
    :cond_4
    invoke-static {}, Lfm/jiecao/jcvideoplayer_lib/JCMediaManager;->intance()Lfm/jiecao/jcvideoplayer_lib/JCMediaManager;

    move-result-object p1

    iget-object p1, p1, Lfm/jiecao/jcvideoplayer_lib/JCMediaManager;->mediaPlayer:Landroid/media/MediaPlayer;

    iget-object v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->surfaceHolder:Landroid/view/SurfaceHolder;

    invoke-virtual {p1, v0}, Landroid/media/MediaPlayer;->setDisplay(Landroid/view/SurfaceHolder;)V

    .line 288
    invoke-static {}, Lfm/jiecao/jcvideoplayer_lib/JCMediaManager;->intance()Lfm/jiecao/jcvideoplayer_lib/JCMediaManager;

    move-result-object p1

    iget-object p1, p1, Lfm/jiecao/jcvideoplayer_lib/JCMediaManager;->mediaPlayer:Landroid/media/MediaPlayer;

    invoke-virtual {p1}, Landroid/media/MediaPlayer;->start()V

    .line 289
    iget-object p1, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->pbLoading:Landroid/widget/ProgressBar;

    invoke-virtual {p1, v2}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 290
    iget-boolean p1, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->ifMp3:Z

    if-nez p1, :cond_5

    .line 291
    iget-object p1, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->ivCover:Landroid/widget/ImageView;

    invoke-virtual {p1, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 293
    :cond_5
    iget-object p1, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->llBottomControl:Landroid/widget/LinearLayout;

    invoke-virtual {p1, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 294
    iget-object p1, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->pbBottom:Landroid/widget/ProgressBar;

    invoke-virtual {p1, v2}, Landroid/widget/ProgressBar;->setVisibility(I)V

    const/4 p1, 0x2

    .line 295
    iput p1, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->CURRENT_STATE:I

    .line 296
    invoke-direct {p0}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->startDismissControlViewTimer()V

    .line 297
    invoke-direct {p0}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->startProgressTimer()V

    goto/16 :goto_1

    .line 298
    :cond_6
    iget v0, p1, Lfm/jiecao/jcvideoplayer_lib/VideoEvents;->type:I

    const v3, 0x595b8

    if-ne v0, v3, :cond_8

    .line 299
    iget v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->CURRENT_STATE:I

    if-ne v0, v2, :cond_7

    iget v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->CURRENT_STATE:I

    if-eqz v0, :cond_e

    .line 300
    :cond_7
    iget-object p1, p1, Lfm/jiecao/jcvideoplayer_lib/VideoEvents;->obj:Ljava/lang/Object;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    .line 301
    invoke-direct {p0, p1}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->setProgressBuffered(I)V

    goto/16 :goto_1

    .line 303
    :cond_8
    iget v0, p1, Lfm/jiecao/jcvideoplayer_lib/VideoEvents;->type:I

    const v3, 0x595bb

    if-ne v0, v3, :cond_a

    .line 304
    iget p1, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->CURRENT_STATE:I

    if-ne p1, v2, :cond_9

    iget p1, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->CURRENT_STATE:I

    if-eqz p1, :cond_e

    .line 305
    :cond_9
    invoke-direct {p0}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->setProgressAndTimeFromTimer()V

    goto/16 :goto_1

    .line 307
    :cond_a
    iget v0, p1, Lfm/jiecao/jcvideoplayer_lib/VideoEvents;->type:I

    const v3, 0x595b6

    if-ne v0, v3, :cond_b

    .line 308
    sget-boolean v0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->isClickFullscreen:Z

    if-eqz v0, :cond_e

    const/4 v0, 0x1

    .line 309
    sput-boolean v0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->isFromFullScreenBackHere:Z

    .line 310
    sput-boolean v1, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->isClickFullscreen:Z

    .line 311
    iget-object p1, p1, Lfm/jiecao/jcvideoplayer_lib/VideoEvents;->obj:Ljava/lang/Object;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    .line 312
    invoke-virtual {p0, p1}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->setState(I)V

    goto :goto_1

    .line 314
    :cond_b
    iget v0, p1, Lfm/jiecao/jcvideoplayer_lib/VideoEvents;->type:I

    const v3, 0x595b5

    if-ne v0, v3, :cond_c

    .line 315
    sget-boolean p1, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->isFromFullScreenBackHere:Z

    if-eqz p1, :cond_e

    .line 316
    invoke-static {}, Lfm/jiecao/jcvideoplayer_lib/JCMediaManager;->intance()Lfm/jiecao/jcvideoplayer_lib/JCMediaManager;

    move-result-object p1

    iget-object p1, p1, Lfm/jiecao/jcvideoplayer_lib/JCMediaManager;->mediaPlayer:Landroid/media/MediaPlayer;

    iget-object v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->surfaceHolder:Landroid/view/SurfaceHolder;

    invoke-virtual {p1, v0}, Landroid/media/MediaPlayer;->setDisplay(Landroid/view/SurfaceHolder;)V

    .line 317
    invoke-direct {p0}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->stopToFullscreenOrQuitFullscreenShowDisplay()V

    .line 318
    sput-boolean v1, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->isFromFullScreenBackHere:Z

    .line 319
    invoke-direct {p0}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->startDismissControlViewTimer()V

    goto :goto_1

    .line 321
    :cond_c
    iget v0, p1, Lfm/jiecao/jcvideoplayer_lib/VideoEvents;->type:I

    const v1, 0x595ba

    if-ne v0, v1, :cond_d

    .line 322
    invoke-static {}, Lfm/jiecao/jcvideoplayer_lib/JCMediaManager;->intance()Lfm/jiecao/jcvideoplayer_lib/JCMediaManager;

    move-result-object p1

    iget p1, p1, Lfm/jiecao/jcvideoplayer_lib/JCMediaManager;->currentVideoWidth:I

    .line 323
    invoke-static {}, Lfm/jiecao/jcvideoplayer_lib/JCMediaManager;->intance()Lfm/jiecao/jcvideoplayer_lib/JCMediaManager;

    move-result-object v0

    iget v0, v0, Lfm/jiecao/jcvideoplayer_lib/JCMediaManager;->currentVideoHeight:I

    if-eqz p1, :cond_e

    if-eqz v0, :cond_e

    .line 325
    iget-object v1, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->surfaceHolder:Landroid/view/SurfaceHolder;

    invoke-interface {v1, p1, v0}, Landroid/view/SurfaceHolder;->setFixedSize(II)V

    .line 326
    iget-object p1, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->surfaceView:Lfm/jiecao/jcvideoplayer_lib/ResizeSurfaceView;

    invoke-virtual {p1}, Lfm/jiecao/jcvideoplayer_lib/ResizeSurfaceView;->requestLayout()V

    goto :goto_1

    .line 328
    :cond_d
    iget p1, p1, Lfm/jiecao/jcvideoplayer_lib/VideoEvents;->type:I

    const v0, 0x595b9

    if-ne p1, v0, :cond_e

    .line 329
    iget-object p1, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->pbLoading:Landroid/widget/ProgressBar;

    invoke-virtual {p1, v2}, Landroid/widget/ProgressBar;->setVisibility(I)V

    :cond_e
    :goto_1
    return-void
.end method

.method public onProgressChanged(Landroid/widget/SeekBar;IZ)V
    .locals 0

    if-eqz p3, :cond_0

    .line 578
    invoke-static {}, Lfm/jiecao/jcvideoplayer_lib/JCMediaManager;->intance()Lfm/jiecao/jcvideoplayer_lib/JCMediaManager;

    move-result-object p1

    iget-object p1, p1, Lfm/jiecao/jcvideoplayer_lib/JCMediaManager;->mediaPlayer:Landroid/media/MediaPlayer;

    invoke-virtual {p1}, Landroid/media/MediaPlayer;->getDuration()I

    move-result p1

    mul-int/2addr p2, p1

    div-int/lit8 p2, p2, 0x64

    .line 579
    invoke-static {}, Lfm/jiecao/jcvideoplayer_lib/JCMediaManager;->intance()Lfm/jiecao/jcvideoplayer_lib/JCMediaManager;

    move-result-object p1

    iget-object p1, p1, Lfm/jiecao/jcvideoplayer_lib/JCMediaManager;->mediaPlayer:Landroid/media/MediaPlayer;

    invoke-virtual {p1, p2}, Landroid/media/MediaPlayer;->seekTo(I)V

    .line 580
    iget-object p1, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->pbLoading:Landroid/widget/ProgressBar;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 581
    iget-object p1, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->ivStart:Landroid/widget/ImageView;

    const/4 p2, 0x4

    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setVisibility(I)V

    :cond_0
    return-void
.end method

.method public onStartTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 0

    return-void
.end method

.method public onStopTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 0

    return-void
.end method

.method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 2

    .line 718
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    const/4 v1, 0x0

    packed-switch v0, :pswitch_data_0

    goto :goto_1

    .line 725
    :pswitch_0
    iput-boolean v1, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->touchingProgressBar:Z

    .line 726
    invoke-direct {p0}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->startDismissControlViewTimer()V

    .line 727
    invoke-direct {p0}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->startProgressTimer()V

    .line 728
    iget-boolean v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->ifFullScreen:Z

    if-eqz v0, :cond_0

    const v0, 0x599a1

    goto :goto_0

    :cond_0
    const v0, 0x599a0

    :goto_0
    invoke-direct {p0, v0}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->sendPointEvent(I)V

    goto :goto_1

    :pswitch_1
    const/4 v0, 0x1

    .line 720
    iput-boolean v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->touchingProgressBar:Z

    .line 721
    invoke-direct {p0}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->cancelDismissControlViewTimer()V

    .line 722
    invoke-direct {p0}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->cancelProgressTimer()V

    .line 732
    :goto_1
    iget-object v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->mSeekbarOnTouchListener:Landroid/view/View$OnTouchListener;

    if-eqz v0, :cond_1

    .line 733
    iget-object v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->mSeekbarOnTouchListener:Landroid/view/View$OnTouchListener;

    invoke-interface {v0, p1, p2}, Landroid/view/View$OnTouchListener;->onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z

    :cond_1
    return v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public quitFullScreen()V
    .locals 2

    const/4 v0, 0x1

    .line 614
    sput-boolean v0, Lfm/jiecao/jcvideoplayer_lib/JCFullScreenActivity;->manualQuit:Z

    .line 615
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sput-wide v0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->clickfullscreentime:J

    .line 616
    invoke-static {}, Lfm/jiecao/jcvideoplayer_lib/JCMediaManager;->intance()Lfm/jiecao/jcvideoplayer_lib/JCMediaManager;

    move-result-object v0

    iget-object v0, v0, Lfm/jiecao/jcvideoplayer_lib/JCMediaManager;->mediaPlayer:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->pause()V

    .line 617
    invoke-static {}, Lfm/jiecao/jcvideoplayer_lib/JCMediaManager;->intance()Lfm/jiecao/jcvideoplayer_lib/JCMediaManager;

    move-result-object v0

    iget-object v0, v0, Lfm/jiecao/jcvideoplayer_lib/JCMediaManager;->mediaPlayer:Landroid/media/MediaPlayer;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->setDisplay(Landroid/view/SurfaceHolder;)V

    .line 618
    invoke-static {}, Lfm/jiecao/jcvideoplayer_lib/JCMediaManager;->intance()Lfm/jiecao/jcvideoplayer_lib/JCMediaManager;

    move-result-object v0

    invoke-virtual {v0}, Lfm/jiecao/jcvideoplayer_lib/JCMediaManager;->revertUuid()V

    .line 619
    new-instance v0, Lfm/jiecao/jcvideoplayer_lib/VideoEvents;

    invoke-direct {v0}, Lfm/jiecao/jcvideoplayer_lib/VideoEvents;-><init>()V

    const v1, 0x595b6

    invoke-virtual {v0, v1}, Lfm/jiecao/jcvideoplayer_lib/VideoEvents;->setType(I)Lfm/jiecao/jcvideoplayer_lib/VideoEvents;

    move-result-object v0

    .line 620
    iget v1, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->CURRENT_STATE:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lfm/jiecao/jcvideoplayer_lib/VideoEvents;->obj:Ljava/lang/Object;

    .line 621
    invoke-static {}, Lde/greenrobot/event/EventBus;->getDefault()Lde/greenrobot/event/EventBus;

    move-result-object v1

    invoke-virtual {v1, v0}, Lde/greenrobot/event/EventBus;->post(Ljava/lang/Object;)V

    const v0, 0x599a5

    .line 622
    invoke-direct {p0, v0}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->sendPointEvent(I)V

    return-void
.end method

.method public release()V
    .locals 6

    .line 570
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sget-wide v2, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->clickfullscreentime:J

    sub-long v4, v0, v2

    const-wide/16 v0, 0x1388

    cmp-long v2, v4, v0

    if-gez v2, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x4

    .line 571
    invoke-virtual {p0, v0}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->setState(I)V

    return-void
.end method

.method public setIfShowTitle(Z)V
    .locals 0

    .line 522
    iput-boolean p1, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->ifShowTitle:Z

    return-void
.end method

.method public setSeekbarOnTouchListener(Landroid/view/View$OnTouchListener;)V
    .locals 0

    .line 713
    iput-object p1, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->mSeekbarOnTouchListener:Landroid/view/View$OnTouchListener;

    return-void
.end method

.method public setSkin(IIIIII)V
    .locals 8

    .line 765
    new-instance v7, Lfm/jiecao/jcvideoplayer_lib/Skin;

    move-object v0, v7

    move v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    move v6, p6

    invoke-direct/range {v0 .. v6}, Lfm/jiecao/jcvideoplayer_lib/Skin;-><init>(IIIIII)V

    iput-object v7, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->skin:Lfm/jiecao/jcvideoplayer_lib/Skin;

    return-void
.end method

.method public setStartListener(Landroid/view/View$OnClickListener;)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    if-eqz p1, :cond_0

    .line 696
    iget-object v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->ivStart:Landroid/widget/ImageView;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 697
    iget-object v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->ivThumb:Landroid/widget/ImageView;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    .line 699
    :cond_0
    iget-object p1, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->ivStart:Landroid/widget/ImageView;

    invoke-virtual {p1, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 700
    iget-object p1, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->ivThumb:Landroid/widget/ImageView;

    invoke-virtual {p1, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :goto_0
    return-void
.end method

.method public setState(I)V
    .locals 3

    .line 215
    iput p1, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->CURRENT_STATE:I

    .line 217
    iget p1, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->CURRENT_STATE:I

    const/4 v0, 0x4

    const/4 v1, 0x0

    if-nez p1, :cond_0

    .line 218
    iget-object p1, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->ivStart:Landroid/widget/ImageView;

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 219
    iget-object p1, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->ivThumb:Landroid/widget/ImageView;

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 220
    iget-object p1, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->pbLoading:Landroid/widget/ProgressBar;

    invoke-virtual {p1, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 221
    iget-object p1, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->ivCover:Landroid/widget/ImageView;

    invoke-virtual {p1, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 222
    invoke-direct {p0, v1, v1, v1}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->setProgressAndTime(III)V

    .line 223
    invoke-direct {p0, v1}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->setProgressBuffered(I)V

    goto/16 :goto_0

    .line 224
    :cond_0
    iget p1, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->CURRENT_STATE:I

    const/4 v2, 0x2

    if-ne p1, v2, :cond_2

    .line 225
    invoke-direct {p0}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->updateStartImage()V

    .line 226
    iget-object p1, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->ivStart:Landroid/widget/ImageView;

    invoke-virtual {p1, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 227
    iget-object p1, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->llBottomControl:Landroid/widget/LinearLayout;

    invoke-virtual {p1, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 228
    iget-object p1, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->pbBottom:Landroid/widget/ProgressBar;

    invoke-virtual {p1, v0}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 229
    invoke-direct {p0, v1}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->setTitleVisibility(I)V

    .line 230
    iget-object p1, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->ivThumb:Landroid/widget/ImageView;

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 231
    iget-boolean p1, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->ifMp3:Z

    if-nez p1, :cond_1

    .line 232
    iget-object p1, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->ivCover:Landroid/widget/ImageView;

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 234
    :cond_1
    iget-object p1, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->pbLoading:Landroid/widget/ProgressBar;

    invoke-virtual {p1, v0}, Landroid/widget/ProgressBar;->setVisibility(I)V

    goto :goto_0

    .line 235
    :cond_2
    iget p1, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->CURRENT_STATE:I

    const/4 v2, 0x1

    if-ne p1, v2, :cond_3

    .line 236
    invoke-direct {p0}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->updateStartImage()V

    .line 237
    iget-object p1, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->ivStart:Landroid/widget/ImageView;

    invoke-virtual {p1, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 238
    iget-object p1, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->llBottomControl:Landroid/widget/LinearLayout;

    invoke-virtual {p1, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 239
    iget-object p1, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->pbBottom:Landroid/widget/ProgressBar;

    invoke-virtual {p1, v0}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 240
    invoke-direct {p0, v1}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->setTitleVisibility(I)V

    .line 241
    iget-object p1, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->ivThumb:Landroid/widget/ImageView;

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 242
    iget-boolean p1, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->ifMp3:Z

    if-nez p1, :cond_5

    .line 243
    iget-object p1, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->ivCover:Landroid/widget/ImageView;

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_0

    .line 245
    :cond_3
    iget p1, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->CURRENT_STATE:I

    if-ne p1, v0, :cond_5

    .line 246
    iget-object p1, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->uuid:Ljava/lang/String;

    invoke-static {}, Lfm/jiecao/jcvideoplayer_lib/JCMediaManager;->intance()Lfm/jiecao/jcvideoplayer_lib/JCMediaManager;

    move-result-object v2

    iget-object v2, v2, Lfm/jiecao/jcvideoplayer_lib/JCMediaManager;->uuid:Ljava/lang/String;

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    .line 247
    invoke-static {}, Lfm/jiecao/jcvideoplayer_lib/JCMediaManager;->intance()Lfm/jiecao/jcvideoplayer_lib/JCMediaManager;

    move-result-object p1

    iget-object p1, p1, Lfm/jiecao/jcvideoplayer_lib/JCMediaManager;->mediaPlayer:Landroid/media/MediaPlayer;

    invoke-virtual {p1}, Landroid/media/MediaPlayer;->stop()V

    .line 249
    :cond_4
    iget-object p1, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->ivStart:Landroid/widget/ImageView;

    invoke-virtual {p1, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 250
    iget-object p1, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->ivThumb:Landroid/widget/ImageView;

    invoke-virtual {p1, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 251
    iget-object p1, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->llBottomControl:Landroid/widget/LinearLayout;

    invoke-virtual {p1, v0}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 252
    iget-object p1, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->pbBottom:Landroid/widget/ProgressBar;

    invoke-virtual {p1, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 253
    iget-object p1, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->ivCover:Landroid/widget/ImageView;

    invoke-virtual {p1, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 254
    invoke-direct {p0, v1}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->setTitleVisibility(I)V

    .line 255
    invoke-direct {p0}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->updateStartImage()V

    .line 256
    invoke-direct {p0}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->cancelDismissControlViewTimer()V

    .line 257
    invoke-direct {p0}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->cancelProgressTimer()V

    :cond_5
    :goto_0
    return-void
.end method

.method public setUp(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x1

    .line 139
    invoke-virtual {p0, p1, p2, v0}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->setUp(Ljava/lang/String;Ljava/lang/String;Z)V

    return-void
.end method

.method public setUp(Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 6

    .line 151
    invoke-direct {p0}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->setSkin()V

    .line 152
    invoke-virtual {p0, p3}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->setIfShowTitle(Z)V

    .line 153
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sget-wide v2, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->clickfullscreentime:J

    sub-long v4, v0, v2

    const-wide/16 v0, 0x1388

    cmp-long p3, v4, v0

    if-gez p3, :cond_0

    return-void

    .line 154
    :cond_0
    iput-object p1, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->url:Ljava/lang/String;

    .line 155
    iput-object p2, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->title:Ljava/lang/String;

    const/4 p3, 0x0

    .line 156
    iput-boolean p3, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->ifFullScreen:Z

    .line 157
    iget-boolean v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->ifFullScreen:Z

    if-eqz v0, :cond_2

    .line 158
    iget-object v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->ivFullScreen:Landroid/widget/ImageView;

    iget v1, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->enlargRecId:I

    if-nez v1, :cond_1

    sget v1, Lfm/jiecao/jcvideoplayer_lib/R$drawable;->shrink_video:I

    goto :goto_0

    :cond_1
    iget v1, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->enlargRecId:I

    :goto_0
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_2

    .line 160
    :cond_2
    iget-object v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->ivFullScreen:Landroid/widget/ImageView;

    iget v1, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->shrinkRecId:I

    if-nez v1, :cond_3

    sget v1, Lfm/jiecao/jcvideoplayer_lib/R$drawable;->enlarge_video:I

    goto :goto_1

    :cond_3
    iget v1, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->shrinkRecId:I

    :goto_1
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 161
    iget-object v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->ivBack:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 163
    :goto_2
    iget-object v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->tvTitle:Landroid/widget/TextView;

    invoke-virtual {v0, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 164
    iget-object p2, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->ivThumb:Landroid/widget/ImageView;

    invoke-virtual {p2, p3}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 165
    iget-object p2, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->ivStart:Landroid/widget/ImageView;

    invoke-virtual {p2, p3}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 166
    iget-object p2, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->llBottomControl:Landroid/widget/LinearLayout;

    const/4 v0, 0x4

    invoke-virtual {p2, v0}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 167
    iget-object p2, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->pbBottom:Landroid/widget/ProgressBar;

    invoke-virtual {p2, p3}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 168
    iput v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->CURRENT_STATE:I

    .line 169
    invoke-direct {p0, p3}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->setTitleVisibility(I)V

    .line 170
    iget-object p2, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->uuid:Ljava/lang/String;

    invoke-static {}, Lfm/jiecao/jcvideoplayer_lib/JCMediaManager;->intance()Lfm/jiecao/jcvideoplayer_lib/JCMediaManager;

    move-result-object p3

    iget-object p3, p3, Lfm/jiecao/jcvideoplayer_lib/JCMediaManager;->uuid:Ljava/lang/String;

    invoke-virtual {p2, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_4

    .line 171
    invoke-static {}, Lfm/jiecao/jcvideoplayer_lib/JCMediaManager;->intance()Lfm/jiecao/jcvideoplayer_lib/JCMediaManager;

    move-result-object p2

    iget-object p2, p2, Lfm/jiecao/jcvideoplayer_lib/JCMediaManager;->mediaPlayer:Landroid/media/MediaPlayer;

    invoke-virtual {p2}, Landroid/media/MediaPlayer;->stop()V

    .line 173
    :cond_4
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-nez p2, :cond_5

    const-string p2, ".mp3"

    invoke-virtual {p1, p2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_5

    const/4 p1, 0x1

    .line 174
    iput-boolean p1, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->ifMp3:Z

    :cond_5
    return-void
.end method

.method public setUpForFullscreen(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 186
    invoke-direct {p0}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->setSkin()V

    .line 187
    iput-object p1, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->url:Ljava/lang/String;

    .line 188
    iput-object p2, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->title:Ljava/lang/String;

    const/4 v0, 0x1

    .line 189
    iput-boolean v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->ifFullScreen:Z

    .line 190
    iget-boolean v1, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->ifFullScreen:Z

    if-eqz v1, :cond_1

    .line 191
    iget-object v1, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->ivFullScreen:Landroid/widget/ImageView;

    iget v2, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->shrinkRecId:I

    if-nez v2, :cond_0

    sget v2, Lfm/jiecao/jcvideoplayer_lib/R$drawable;->shrink_video:I

    goto :goto_0

    :cond_0
    iget v2, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->shrinkRecId:I

    :goto_0
    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_2

    .line 193
    :cond_1
    iget-object v1, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->ivFullScreen:Landroid/widget/ImageView;

    iget v2, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->enlargRecId:I

    if-nez v2, :cond_2

    sget v2, Lfm/jiecao/jcvideoplayer_lib/R$drawable;->enlarge_video:I

    goto :goto_1

    :cond_2
    iget v2, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->enlargRecId:I

    :goto_1
    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 195
    :goto_2
    iget-object v1, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->tvTitle:Landroid/widget/TextView;

    invoke-virtual {v1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 196
    iget-object p2, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->ivThumb:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {p2, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 197
    iget-object p2, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->ivStart:Landroid/widget/ImageView;

    invoke-virtual {p2, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 198
    iget-object p2, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->llBottomControl:Landroid/widget/LinearLayout;

    const/4 v2, 0x4

    invoke-virtual {p2, v2}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 199
    iget-object p2, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->pbBottom:Landroid/widget/ProgressBar;

    invoke-virtual {p2, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 200
    iput v2, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->CURRENT_STATE:I

    .line 201
    invoke-direct {p0, v1}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->setTitleVisibility(I)V

    .line 203
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-nez p2, :cond_3

    const-string p2, ".mp3"

    invoke-virtual {p1, p2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_3

    .line 204
    iput-boolean v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->ifMp3:Z

    :cond_3
    return-void
.end method

.method public surfaceChanged(Landroid/view/SurfaceHolder;III)V
    .locals 0

    return-void
.end method

.method public surfaceCreated(Landroid/view/SurfaceHolder;)V
    .locals 2

    .line 650
    invoke-static {}, Lde/greenrobot/event/EventBus;->getDefault()Lde/greenrobot/event/EventBus;

    move-result-object p1

    new-instance v0, Lfm/jiecao/jcvideoplayer_lib/VideoEvents;

    invoke-direct {v0}, Lfm/jiecao/jcvideoplayer_lib/VideoEvents;-><init>()V

    const v1, 0x595b5

    invoke-virtual {v0, v1}, Lfm/jiecao/jcvideoplayer_lib/VideoEvents;->setType(I)Lfm/jiecao/jcvideoplayer_lib/VideoEvents;

    move-result-object v0

    invoke-virtual {p1, v0}, Lde/greenrobot/event/EventBus;->post(Ljava/lang/Object;)V

    .line 651
    iget-boolean p1, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->ifFullScreen:Z

    if-eqz p1, :cond_0

    .line 652
    invoke-static {}, Lfm/jiecao/jcvideoplayer_lib/JCMediaManager;->intance()Lfm/jiecao/jcvideoplayer_lib/JCMediaManager;

    move-result-object p1

    iget-object p1, p1, Lfm/jiecao/jcvideoplayer_lib/JCMediaManager;->mediaPlayer:Landroid/media/MediaPlayer;

    iget-object v0, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->surfaceHolder:Landroid/view/SurfaceHolder;

    invoke-virtual {p1, v0}, Landroid/media/MediaPlayer;->setDisplay(Landroid/view/SurfaceHolder;)V

    .line 653
    invoke-direct {p0}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->stopToFullscreenOrQuitFullscreenShowDisplay()V

    .line 655
    :cond_0
    iget p1, p0, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->CURRENT_STATE:I

    const/4 v0, 0x4

    if-eq p1, v0, :cond_1

    .line 656
    invoke-direct {p0}, Lfm/jiecao/jcvideoplayer_lib/JCVideoPlayer;->startDismissControlViewTimer()V

    :cond_1
    return-void
.end method

.method public surfaceDestroyed(Landroid/view/SurfaceHolder;)V
    .locals 0

    return-void
.end method
