.class public Lcom/huawei/openalliance/ad/views/NativePureVideoView;
.super Lcom/huawei/openalliance/ad/views/NativeMediaView;

# interfaces
.implements Lcom/huawei/openalliance/ad/views/interfaces/INativeVideoView;
.implements Lcom/huawei/openalliance/ad/views/interfaces/IViewLifeCycle;


# annotations
.annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
.end annotation


# static fields
.field private static final e:Ljava/lang/String;


# instance fields
.field private f:Lcom/huawei/openalliance/ad/j/a/c;

.field private g:Lcom/huawei/openalliance/ad/views/VideoView;

.field private h:Landroid/widget/ImageView;

.field private i:Z

.field private j:Lcom/huawei/openalliance/ad/inter/data/VideoInfo;

.field private k:Lcom/huawei/openalliance/ad/inter/data/ImageInfo;

.field private l:Z

.field private m:J

.field private n:J

.field private o:Z

.field private p:Lcom/huawei/openalliance/ad/media/listener/MediaStateListener;

.field private q:Lcom/huawei/openalliance/ad/media/listener/MediaErrorListener;

.field private r:Lcom/huawei/openalliance/ad/media/listener/MuteListener;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lcom/huawei/openalliance/ad/views/NativePureVideoView;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/openalliance/ad/views/NativePureVideoView;->e:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    invoke-direct {p0, p1}, Lcom/huawei/openalliance/ad/views/NativeMediaView;-><init>(Landroid/content/Context;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/views/NativePureVideoView;->o:Z

    new-instance v0, Lcom/huawei/openalliance/ad/views/NativePureVideoView$1;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/views/NativePureVideoView$1;-><init>(Lcom/huawei/openalliance/ad/views/NativePureVideoView;)V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/NativePureVideoView;->p:Lcom/huawei/openalliance/ad/media/listener/MediaStateListener;

    new-instance v0, Lcom/huawei/openalliance/ad/views/NativePureVideoView$2;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/views/NativePureVideoView$2;-><init>(Lcom/huawei/openalliance/ad/views/NativePureVideoView;)V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/NativePureVideoView;->q:Lcom/huawei/openalliance/ad/media/listener/MediaErrorListener;

    new-instance v0, Lcom/huawei/openalliance/ad/views/NativePureVideoView$3;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/views/NativePureVideoView$3;-><init>(Lcom/huawei/openalliance/ad/views/NativePureVideoView;)V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/NativePureVideoView;->r:Lcom/huawei/openalliance/ad/media/listener/MuteListener;

    invoke-direct {p0, p1}, Lcom/huawei/openalliance/ad/views/NativePureVideoView;->a(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    invoke-direct {p0, p1, p2}, Lcom/huawei/openalliance/ad/views/NativeMediaView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/views/NativePureVideoView;->o:Z

    new-instance v0, Lcom/huawei/openalliance/ad/views/NativePureVideoView$1;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/views/NativePureVideoView$1;-><init>(Lcom/huawei/openalliance/ad/views/NativePureVideoView;)V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/NativePureVideoView;->p:Lcom/huawei/openalliance/ad/media/listener/MediaStateListener;

    new-instance v0, Lcom/huawei/openalliance/ad/views/NativePureVideoView$2;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/views/NativePureVideoView$2;-><init>(Lcom/huawei/openalliance/ad/views/NativePureVideoView;)V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/NativePureVideoView;->q:Lcom/huawei/openalliance/ad/media/listener/MediaErrorListener;

    new-instance v0, Lcom/huawei/openalliance/ad/views/NativePureVideoView$3;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/views/NativePureVideoView$3;-><init>(Lcom/huawei/openalliance/ad/views/NativePureVideoView;)V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/NativePureVideoView;->r:Lcom/huawei/openalliance/ad/media/listener/MuteListener;

    invoke-direct {p0, p1}, Lcom/huawei/openalliance/ad/views/NativePureVideoView;->a(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/openalliance/ad/views/NativeMediaView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/views/NativePureVideoView;->o:Z

    new-instance v0, Lcom/huawei/openalliance/ad/views/NativePureVideoView$1;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/views/NativePureVideoView$1;-><init>(Lcom/huawei/openalliance/ad/views/NativePureVideoView;)V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/NativePureVideoView;->p:Lcom/huawei/openalliance/ad/media/listener/MediaStateListener;

    new-instance v0, Lcom/huawei/openalliance/ad/views/NativePureVideoView$2;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/views/NativePureVideoView$2;-><init>(Lcom/huawei/openalliance/ad/views/NativePureVideoView;)V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/NativePureVideoView;->q:Lcom/huawei/openalliance/ad/media/listener/MediaErrorListener;

    new-instance v0, Lcom/huawei/openalliance/ad/views/NativePureVideoView$3;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/views/NativePureVideoView$3;-><init>(Lcom/huawei/openalliance/ad/views/NativePureVideoView;)V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/NativePureVideoView;->r:Lcom/huawei/openalliance/ad/media/listener/MuteListener;

    invoke-direct {p0, p1}, Lcom/huawei/openalliance/ad/views/NativePureVideoView;->a(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 1
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/huawei/openalliance/ad/views/NativeMediaView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/views/NativePureVideoView;->o:Z

    new-instance v0, Lcom/huawei/openalliance/ad/views/NativePureVideoView$1;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/views/NativePureVideoView$1;-><init>(Lcom/huawei/openalliance/ad/views/NativePureVideoView;)V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/NativePureVideoView;->p:Lcom/huawei/openalliance/ad/media/listener/MediaStateListener;

    new-instance v0, Lcom/huawei/openalliance/ad/views/NativePureVideoView$2;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/views/NativePureVideoView$2;-><init>(Lcom/huawei/openalliance/ad/views/NativePureVideoView;)V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/NativePureVideoView;->q:Lcom/huawei/openalliance/ad/media/listener/MediaErrorListener;

    new-instance v0, Lcom/huawei/openalliance/ad/views/NativePureVideoView$3;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/views/NativePureVideoView$3;-><init>(Lcom/huawei/openalliance/ad/views/NativePureVideoView;)V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/NativePureVideoView;->r:Lcom/huawei/openalliance/ad/media/listener/MuteListener;

    invoke-direct {p0, p1}, Lcom/huawei/openalliance/ad/views/NativePureVideoView;->a(Landroid/content/Context;)V

    return-void
.end method

.method static synthetic a(Lcom/huawei/openalliance/ad/views/NativePureVideoView;J)J
    .locals 0

    iput-wide p1, p0, Lcom/huawei/openalliance/ad/views/NativePureVideoView;->n:J

    return-wide p1
.end method

.method private a(IZ)V
    .locals 9

    iget-boolean v0, p0, Lcom/huawei/openalliance/ad/views/NativePureVideoView;->o:Z

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/views/NativePureVideoView;->o:Z

    if-eqz p2, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativePureVideoView;->f:Lcom/huawei/openalliance/ad/j/a/c;

    iget-wide v1, p0, Lcom/huawei/openalliance/ad/views/NativePureVideoView;->m:J

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    iget-wide v5, p0, Lcom/huawei/openalliance/ad/views/NativePureVideoView;->n:J

    int-to-long v7, p1

    invoke-interface/range {v0 .. v8}, Lcom/huawei/openalliance/ad/j/a/c;->a(JJJJ)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativePureVideoView;->f:Lcom/huawei/openalliance/ad/j/a/c;

    iget-wide v1, p0, Lcom/huawei/openalliance/ad/views/NativePureVideoView;->m:J

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    iget-wide v5, p0, Lcom/huawei/openalliance/ad/views/NativePureVideoView;->n:J

    int-to-long v7, p1

    invoke-interface/range {v0 .. v8}, Lcom/huawei/openalliance/ad/j/a/c;->b(JJJJ)V

    :cond_1
    :goto_0
    return-void
.end method

.method private a(Landroid/content/Context;)V
    .locals 2

    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/openalliance/ad/R$layout;->hiad_native_pure_video_view:I

    invoke-virtual {v0, v1, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    new-instance v0, Lcom/huawei/openalliance/ad/j/f;

    invoke-direct {v0, p1, p0}, Lcom/huawei/openalliance/ad/j/f;-><init>(Landroid/content/Context;Lcom/huawei/openalliance/ad/views/interfaces/INativeVideoView;)V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/NativePureVideoView;->f:Lcom/huawei/openalliance/ad/j/a/c;

    sget v0, Lcom/huawei/openalliance/ad/R$id;->hiad_id_video_view:I

    invoke-virtual {p0, v0}, Lcom/huawei/openalliance/ad/views/NativePureVideoView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/huawei/openalliance/ad/views/VideoView;

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/NativePureVideoView;->g:Lcom/huawei/openalliance/ad/views/VideoView;

    sget v0, Lcom/huawei/openalliance/ad/R$id;->hiad_iv_preview_video:I

    invoke-virtual {p0, v0}, Lcom/huawei/openalliance/ad/views/NativePureVideoView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/NativePureVideoView;->h:Landroid/widget/ImageView;

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativePureVideoView;->g:Lcom/huawei/openalliance/ad/views/VideoView;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/views/VideoView;->setScreenOnWhilePlaying(Z)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativePureVideoView;->g:Lcom/huawei/openalliance/ad/views/VideoView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/views/VideoView;->setAutoScaleResizeLayoutOnVideoSizeChange(Z)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativePureVideoView;->g:Lcom/huawei/openalliance/ad/views/VideoView;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/views/NativePureVideoView;->p:Lcom/huawei/openalliance/ad/media/listener/MediaStateListener;

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/views/VideoView;->addMediaStateListener(Lcom/huawei/openalliance/ad/media/listener/MediaStateListener;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativePureVideoView;->g:Lcom/huawei/openalliance/ad/views/VideoView;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/views/NativePureVideoView;->q:Lcom/huawei/openalliance/ad/media/listener/MediaErrorListener;

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/views/VideoView;->addMediaErrorListener(Lcom/huawei/openalliance/ad/media/listener/MediaErrorListener;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativePureVideoView;->g:Lcom/huawei/openalliance/ad/views/VideoView;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/views/NativePureVideoView;->r:Lcom/huawei/openalliance/ad/media/listener/MuteListener;

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/views/VideoView;->addMuteListener(Lcom/huawei/openalliance/ad/media/listener/MuteListener;)V

    return-void
.end method

.method static synthetic a(Lcom/huawei/openalliance/ad/views/NativePureVideoView;)V
    .locals 0

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/NativePureVideoView;->j()V

    return-void
.end method

.method static synthetic a(Lcom/huawei/openalliance/ad/views/NativePureVideoView;IZ)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/huawei/openalliance/ad/views/NativePureVideoView;->a(IZ)V

    return-void
.end method

.method static synthetic a(Lcom/huawei/openalliance/ad/views/NativePureVideoView;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/huawei/openalliance/ad/views/NativePureVideoView;->o:Z

    return p1
.end method

.method static synthetic b(Lcom/huawei/openalliance/ad/views/NativePureVideoView;J)J
    .locals 0

    iput-wide p1, p0, Lcom/huawei/openalliance/ad/views/NativePureVideoView;->m:J

    return-wide p1
.end method

.method static synthetic b(Lcom/huawei/openalliance/ad/views/NativePureVideoView;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/huawei/openalliance/ad/views/NativePureVideoView;->o:Z

    return v0
.end method

.method static synthetic c(Lcom/huawei/openalliance/ad/views/NativePureVideoView;)Lcom/huawei/openalliance/ad/j/a/c;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativePureVideoView;->f:Lcom/huawei/openalliance/ad/j/a/c;

    return-object v0
.end method

.method static synthetic d(Lcom/huawei/openalliance/ad/views/NativePureVideoView;)V
    .locals 0

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/NativePureVideoView;->i()V

    return-void
.end method

.method static synthetic e(Lcom/huawei/openalliance/ad/views/NativePureVideoView;)Lcom/huawei/openalliance/ad/inter/data/VideoInfo;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativePureVideoView;->j:Lcom/huawei/openalliance/ad/inter/data/VideoInfo;

    return-object v0
.end method

.method private f()V
    .locals 4

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativePureVideoView;->c:Lcom/huawei/openalliance/ad/inter/data/NativeAd;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativePureVideoView;->c:Lcom/huawei/openalliance/ad/inter/data/NativeAd;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/inter/data/NativeAd;->getImageInfos()Ljava/util/List;

    move-result-object v2

    const/4 v0, 0x0

    if-eq v0, v2, :cond_2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_2

    const/4 v0, 0x0

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/openalliance/ad/inter/data/ImageInfo;

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/NativePureVideoView;->k:Lcom/huawei/openalliance/ad/inter/data/ImageInfo;

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativePureVideoView;->k:Lcom/huawei/openalliance/ad/inter/data/ImageInfo;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativePureVideoView;->k:Lcom/huawei/openalliance/ad/inter/data/ImageInfo;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/inter/data/ImageInfo;->getHeight()I

    move-result v0

    if-lez v0, :cond_1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativePureVideoView;->k:Lcom/huawei/openalliance/ad/inter/data/ImageInfo;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/inter/data/ImageInfo;->getWidth()I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x3f800000    # 1.0f

    mul-float/2addr v0, v1

    iget-object v1, p0, Lcom/huawei/openalliance/ad/views/NativePureVideoView;->k:Lcom/huawei/openalliance/ad/inter/data/ImageInfo;

    invoke-virtual {v1}, Lcom/huawei/openalliance/ad/inter/data/ImageInfo;->getHeight()I

    move-result v1

    int-to-float v1, v1

    div-float v3, v0, v1

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/openalliance/ad/views/NativePureVideoView;->setRatio(Ljava/lang/Float;)V

    :cond_1
    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativePureVideoView;->f:Lcom/huawei/openalliance/ad/j/a/c;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/views/NativePureVideoView;->k:Lcom/huawei/openalliance/ad/inter/data/ImageInfo;

    invoke-interface {v0, v1}, Lcom/huawei/openalliance/ad/j/a/c;->a(Lcom/huawei/openalliance/ad/inter/data/ImageInfo;)V

    :cond_2
    return-void
.end method

.method private g()V
    .locals 3

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativePureVideoView;->c:Lcom/huawei/openalliance/ad/inter/data/NativeAd;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativePureVideoView;->c:Lcom/huawei/openalliance/ad/inter/data/NativeAd;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/inter/data/NativeAd;->getVideoInfo()Lcom/huawei/openalliance/ad/inter/data/VideoInfo;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/NativePureVideoView;->j:Lcom/huawei/openalliance/ad/inter/data/VideoInfo;

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativePureVideoView;->j:Lcom/huawei/openalliance/ad/inter/data/VideoInfo;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativePureVideoView;->j:Lcom/huawei/openalliance/ad/inter/data/VideoInfo;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/inter/data/VideoInfo;->getVideoRatio()Ljava/lang/Float;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual {p0, v2}, Lcom/huawei/openalliance/ad/views/NativePureVideoView;->setRatio(Ljava/lang/Float;)V

    :cond_1
    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativePureVideoView;->g:Lcom/huawei/openalliance/ad/views/VideoView;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/views/NativePureVideoView;->j:Lcom/huawei/openalliance/ad/inter/data/VideoInfo;

    invoke-virtual {v1}, Lcom/huawei/openalliance/ad/inter/data/VideoInfo;->getVideoDuration()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/views/VideoView;->setDefaultDuration(I)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativePureVideoView;->f:Lcom/huawei/openalliance/ad/j/a/c;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/views/NativePureVideoView;->j:Lcom/huawei/openalliance/ad/inter/data/VideoInfo;

    invoke-interface {v0, v1}, Lcom/huawei/openalliance/ad/j/a/c;->a(Lcom/huawei/openalliance/ad/inter/data/VideoInfo;)V

    :cond_2
    return-void
.end method

.method private h()V
    .locals 1

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/NativePureVideoView;->i()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/views/NativePureVideoView;->i:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/views/NativePureVideoView;->l:Z

    return-void
.end method

.method private i()V
    .locals 3

    invoke-static {}, Lcom/huawei/openalliance/ad/g/c;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/huawei/openalliance/ad/views/NativePureVideoView;->e:Ljava/lang/String;

    const-string v1, "showPreviewView"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativePureVideoView;->h:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getAnimation()Landroid/view/animation/Animation;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Landroid/view/animation/Animation;->cancel()V

    :cond_1
    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativePureVideoView;->h:Landroid/widget/ImageView;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/utils/ag;->a(Landroid/view/View;Z)Z

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativePureVideoView;->g:Lcom/huawei/openalliance/ad/views/VideoView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/views/VideoView;->setAlpha(F)V

    return-void
.end method

.method private j()V
    .locals 4

    invoke-static {}, Lcom/huawei/openalliance/ad/g/c;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/huawei/openalliance/ad/views/NativePureVideoView;->e:Ljava/lang/String;

    const-string v1, "hidePreviewView"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativePureVideoView;->h:Landroid/widget/ImageView;

    const/16 v1, 0x8

    const/16 v2, 0x12c

    const/16 v3, 0x12c

    invoke-static {v0, v1, v2, v3}, Lcom/huawei/openalliance/ad/utils/ag;->a(Landroid/view/View;III)Z

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativePureVideoView;->g:Lcom/huawei/openalliance/ad/views/VideoView;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/views/VideoView;->setAlpha(F)V

    return-void
.end method


# virtual methods
.method public addMediaBufferListener(Lcom/huawei/openalliance/ad/media/listener/MediaBufferListener;)V
    .locals 1
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativePureVideoView;->g:Lcom/huawei/openalliance/ad/views/VideoView;

    invoke-virtual {v0, p1}, Lcom/huawei/openalliance/ad/views/VideoView;->addMediaBufferListener(Lcom/huawei/openalliance/ad/media/listener/MediaBufferListener;)V

    return-void
.end method

.method public addMediaErrorListener(Lcom/huawei/openalliance/ad/media/listener/MediaErrorListener;)V
    .locals 1
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativePureVideoView;->g:Lcom/huawei/openalliance/ad/views/VideoView;

    invoke-virtual {v0, p1}, Lcom/huawei/openalliance/ad/views/VideoView;->addMediaErrorListener(Lcom/huawei/openalliance/ad/media/listener/MediaErrorListener;)V

    return-void
.end method

.method public addMediaStateListener(Lcom/huawei/openalliance/ad/media/listener/MediaStateListener;)V
    .locals 1
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativePureVideoView;->g:Lcom/huawei/openalliance/ad/views/VideoView;

    invoke-virtual {v0, p1}, Lcom/huawei/openalliance/ad/views/VideoView;->addMediaStateListener(Lcom/huawei/openalliance/ad/media/listener/MediaStateListener;)V

    return-void
.end method

.method public addMuteListener(Lcom/huawei/openalliance/ad/media/listener/MuteListener;)V
    .locals 1
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativePureVideoView;->g:Lcom/huawei/openalliance/ad/views/VideoView;

    invoke-virtual {v0, p1}, Lcom/huawei/openalliance/ad/views/VideoView;->addMuteListener(Lcom/huawei/openalliance/ad/media/listener/MuteListener;)V

    return-void
.end method

.method public addNetworkChangeListener(Lcom/huawei/openalliance/ad/views/VideoView$NetworkChangeListener;)V
    .locals 1
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativePureVideoView;->g:Lcom/huawei/openalliance/ad/views/VideoView;

    invoke-virtual {v0, p1}, Lcom/huawei/openalliance/ad/views/VideoView;->addNetworkChangeListener(Lcom/huawei/openalliance/ad/views/VideoView$NetworkChangeListener;)V

    return-void
.end method

.method public destroyView()V
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativePureVideoView;->g:Lcom/huawei/openalliance/ad/views/VideoView;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/views/VideoView;->destroyView()V

    return-void
.end method

.method public getCurrentState()Lcom/huawei/openalliance/ad/media/MediaState;
    .locals 1
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativePureVideoView;->g:Lcom/huawei/openalliance/ad/views/VideoView;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/views/VideoView;->getCurrentState()Lcom/huawei/openalliance/ad/media/MediaState;

    move-result-object v0

    return-object v0
.end method

.method public isPlaying()Z
    .locals 1
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativePureVideoView;->g:Lcom/huawei/openalliance/ad/views/VideoView;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/views/VideoView;->isPlaying()Z

    move-result v0

    return v0
.end method

.method public muteSound()V
    .locals 1
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativePureVideoView;->g:Lcom/huawei/openalliance/ad/views/VideoView;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/views/VideoView;->mute()V

    return-void
.end method

.method public onCheckVideoHashResult(Lcom/huawei/openalliance/ad/inter/data/VideoInfo;Z)V
    .locals 5

    sget-object v0, Lcom/huawei/openalliance/ad/views/NativePureVideoView;->e:Ljava/lang/String;

    const-string v1, "onCheckVideoHashResult sucess: %s"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v0, v1, v2}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    if-eqz p2, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativePureVideoView;->j:Lcom/huawei/openalliance/ad/inter/data/VideoInfo;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativePureVideoView;->j:Lcom/huawei/openalliance/ad/inter/data/VideoInfo;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/inter/data/VideoInfo;->getVideoDownloadUrl()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/inter/data/VideoInfo;->getVideoDownloadUrl()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/views/NativePureVideoView;->i:Z

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativePureVideoView;->g:Lcom/huawei/openalliance/ad/views/VideoView;

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/inter/data/VideoInfo;->getVideoDownloadUrl()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/views/VideoView;->setVideoFileUrl(Ljava/lang/String;)V

    iget-boolean v0, p0, Lcom/huawei/openalliance/ad/views/NativePureVideoView;->l:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativePureVideoView;->g:Lcom/huawei/openalliance/ad/views/VideoView;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/views/VideoView;->play()V

    :cond_0
    return-void
.end method

.method public onPreviewImageLoaded(Lcom/huawei/openalliance/ad/inter/data/ImageInfo;Landroid/graphics/Bitmap;)V
    .locals 2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativePureVideoView;->k:Lcom/huawei/openalliance/ad/inter/data/ImageInfo;

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativePureVideoView;->k:Lcom/huawei/openalliance/ad/inter/data/ImageInfo;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/inter/data/ImageInfo;->getUrl()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/inter/data/ImageInfo;->getUrl()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativePureVideoView;->h:Landroid/widget/ImageView;

    invoke-virtual {v0, p2}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    :cond_0
    return-void
.end method

.method public pause()V
    .locals 1
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativePureVideoView;->g:Lcom/huawei/openalliance/ad/views/VideoView;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/views/VideoView;->pause()V

    return-void
.end method

.method public pauseView()V
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativePureVideoView;->g:Lcom/huawei/openalliance/ad/views/VideoView;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/views/VideoView;->pauseView()V

    return-void
.end method

.method public play(Z)V
    .locals 1
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    iget-boolean v0, p0, Lcom/huawei/openalliance/ad/views/NativePureVideoView;->i:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativePureVideoView;->g:Lcom/huawei/openalliance/ad/views/VideoView;

    invoke-virtual {v0, p1}, Lcom/huawei/openalliance/ad/views/VideoView;->play(Z)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/views/NativePureVideoView;->l:Z

    :goto_0
    return-void
.end method

.method public removeMediaBufferListener(Lcom/huawei/openalliance/ad/media/listener/MediaBufferListener;)V
    .locals 1
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativePureVideoView;->g:Lcom/huawei/openalliance/ad/views/VideoView;

    invoke-virtual {v0, p1}, Lcom/huawei/openalliance/ad/views/VideoView;->removeMediaBufferListener(Lcom/huawei/openalliance/ad/media/listener/MediaBufferListener;)V

    return-void
.end method

.method public removeMediaErrorListener(Lcom/huawei/openalliance/ad/media/listener/MediaErrorListener;)V
    .locals 1
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativePureVideoView;->g:Lcom/huawei/openalliance/ad/views/VideoView;

    invoke-virtual {v0, p1}, Lcom/huawei/openalliance/ad/views/VideoView;->removeMediaErrorListener(Lcom/huawei/openalliance/ad/media/listener/MediaErrorListener;)V

    return-void
.end method

.method public removeMediaStateListener(Lcom/huawei/openalliance/ad/media/listener/MediaStateListener;)V
    .locals 1
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativePureVideoView;->g:Lcom/huawei/openalliance/ad/views/VideoView;

    invoke-virtual {v0, p1}, Lcom/huawei/openalliance/ad/views/VideoView;->removeMediaStateListener(Lcom/huawei/openalliance/ad/media/listener/MediaStateListener;)V

    return-void
.end method

.method public removeMuteListener(Lcom/huawei/openalliance/ad/media/listener/MuteListener;)V
    .locals 1
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativePureVideoView;->g:Lcom/huawei/openalliance/ad/views/VideoView;

    invoke-virtual {v0, p1}, Lcom/huawei/openalliance/ad/views/VideoView;->removeMuteListener(Lcom/huawei/openalliance/ad/media/listener/MuteListener;)V

    return-void
.end method

.method public removeNetworkChangeListener(Lcom/huawei/openalliance/ad/views/VideoView$NetworkChangeListener;)V
    .locals 1
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativePureVideoView;->g:Lcom/huawei/openalliance/ad/views/VideoView;

    invoke-virtual {v0, p1}, Lcom/huawei/openalliance/ad/views/VideoView;->removeNetworkChangeListener(Lcom/huawei/openalliance/ad/views/VideoView$NetworkChangeListener;)V

    return-void
.end method

.method public resumeView()V
    .locals 2

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/views/NativePureVideoView;->a:Z

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativePureVideoView;->g:Lcom/huawei/openalliance/ad/views/VideoView;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/views/VideoView;->resumeView()V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativePureVideoView;->g:Lcom/huawei/openalliance/ad/views/VideoView;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/views/VideoView;->setNeedPauseOnSurfaceDestory(Z)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativePureVideoView;->d:Lcom/huawei/openalliance/ad/monitor/b;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/monitor/b;->onGlobalLayout()V

    return-void
.end method

.method public seekTo(I)V
    .locals 1
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativePureVideoView;->g:Lcom/huawei/openalliance/ad/views/VideoView;

    invoke-virtual {v0, p1}, Lcom/huawei/openalliance/ad/views/VideoView;->seekTo(I)V

    return-void
.end method

.method public setNativeAd(Lcom/huawei/openalliance/ad/inter/data/INativeAd;)V
    .locals 3

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativePureVideoView;->g:Lcom/huawei/openalliance/ad/views/VideoView;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/views/VideoView;->getCurrentState()Lcom/huawei/openalliance/ad/media/MediaState;

    move-result-object v2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativePureVideoView;->c:Lcom/huawei/openalliance/ad/inter/data/NativeAd;

    if-ne v0, p1, :cond_0

    sget-object v0, Lcom/huawei/openalliance/ad/media/MediaState$State;->IDLE:Lcom/huawei/openalliance/ad/media/MediaState$State;

    invoke-virtual {v2, v0}, Lcom/huawei/openalliance/ad/media/MediaState;->isNotState(Lcom/huawei/openalliance/ad/media/MediaState$State;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/huawei/openalliance/ad/media/MediaState$State;->ERROR:Lcom/huawei/openalliance/ad/media/MediaState$State;

    invoke-virtual {v2, v0}, Lcom/huawei/openalliance/ad/media/MediaState;->isNotState(Lcom/huawei/openalliance/ad/media/MediaState$State;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/huawei/openalliance/ad/views/NativePureVideoView;->e:Ljava/lang/String;

    const-string v1, "setNativeAd - has the same ad"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    invoke-super {p0, p1}, Lcom/huawei/openalliance/ad/views/NativeMediaView;->setNativeAd(Lcom/huawei/openalliance/ad/inter/data/INativeAd;)V

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/NativePureVideoView;->h()V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativePureVideoView;->f:Lcom/huawei/openalliance/ad/j/a/c;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/views/NativePureVideoView;->c:Lcom/huawei/openalliance/ad/inter/data/NativeAd;

    invoke-interface {v0, v1}, Lcom/huawei/openalliance/ad/j/a/c;->a(Lcom/huawei/openalliance/ad/inter/data/NativeAd;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativePureVideoView;->c:Lcom/huawei/openalliance/ad/inter/data/NativeAd;

    if-eqz v0, :cond_1

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/NativePureVideoView;->f()V

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/NativePureVideoView;->g()V

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/NativePureVideoView;->j:Lcom/huawei/openalliance/ad/inter/data/VideoInfo;

    :goto_0
    return-void
.end method

.method public setPreferStartPlayTime(I)V
    .locals 1
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativePureVideoView;->g:Lcom/huawei/openalliance/ad/views/VideoView;

    invoke-virtual {v0, p1}, Lcom/huawei/openalliance/ad/views/VideoView;->setPreferStartPlayTime(I)V

    return-void
.end method

.method public setStandalone(Z)V
    .locals 1
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativePureVideoView;->g:Lcom/huawei/openalliance/ad/views/VideoView;

    invoke-virtual {v0, p1}, Lcom/huawei/openalliance/ad/views/VideoView;->setStandalone(Z)V

    return-void
.end method

.method public showFullScreenSwitchButton(Z)V
    .locals 0

    return-void
.end method

.method public stop()V
    .locals 1
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativePureVideoView;->g:Lcom/huawei/openalliance/ad/views/VideoView;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/views/VideoView;->stop()V

    return-void
.end method

.method public switchToFullScreen()Z
    .locals 3
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativePureVideoView;->j:Lcom/huawei/openalliance/ad/inter/data/VideoInfo;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativePureVideoView;->j:Lcom/huawei/openalliance/ad/inter/data/VideoInfo;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/inter/data/VideoInfo;->setNeedContinueAutoPlay(Z)V

    :cond_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativePureVideoView;->g:Lcom/huawei/openalliance/ad/views/VideoView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/views/VideoView;->setNeedPauseOnSurfaceDestory(Z)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativePureVideoView;->f:Lcom/huawei/openalliance/ad/j/a/c;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/views/NativePureVideoView;->g:Lcom/huawei/openalliance/ad/views/VideoView;

    invoke-virtual {v1}, Lcom/huawei/openalliance/ad/views/VideoView;->getMediaPlayerAgent()Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/openalliance/ad/views/NativePureVideoView;->c:Lcom/huawei/openalliance/ad/inter/data/NativeAd;

    invoke-interface {v0, v1, v2}, Lcom/huawei/openalliance/ad/j/a/c;->a(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;Lcom/huawei/openalliance/ad/inter/data/NativeAd;)Z

    move-result v0

    return v0
.end method

.method public unmuteSound()V
    .locals 1
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativePureVideoView;->g:Lcom/huawei/openalliance/ad/views/VideoView;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/views/VideoView;->unmute()V

    return-void
.end method

.method public updateContent(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativePureVideoView;->f:Lcom/huawei/openalliance/ad/j/a/c;

    invoke-interface {v0, p1}, Lcom/huawei/openalliance/ad/j/a/c;->a(Ljava/lang/String;)V

    return-void
.end method
