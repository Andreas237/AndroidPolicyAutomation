.class public Lcom/huawei/openalliance/ad/views/NativeVideoView;
.super Lcom/huawei/openalliance/ad/views/NativeMediaView;

# interfaces
.implements Lcom/huawei/openalliance/ad/views/interfaces/INativeVideoView;
.implements Lcom/huawei/openalliance/ad/views/interfaces/IViewLifeCycle;


# annotations
.annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/openalliance/ad/views/NativeVideoView$VideoEventListener;
    }
.end annotation


# static fields
.field private static final e:Ljava/lang/String;


# instance fields
.field private f:Lcom/huawei/openalliance/ad/views/NativeVideoView$VideoEventListener;

.field private g:Z

.field private h:Lcom/huawei/openalliance/ad/views/i;

.field private i:Lcom/huawei/openalliance/ad/j/a/c;

.field private j:Lcom/huawei/openalliance/ad/inter/data/VideoInfo;

.field private k:Lcom/huawei/openalliance/ad/inter/data/ImageInfo;

.field private l:Z

.field private m:J

.field private n:Lcom/huawei/openalliance/ad/views/NativeVideoControlPanel;

.field private o:Lcom/huawei/openalliance/ad/views/VideoView;

.field private p:J

.field private q:J

.field private r:Z

.field private s:Lcom/huawei/openalliance/ad/media/listener/MediaStateListener;

.field private t:Lcom/huawei/openalliance/ad/media/listener/MediaErrorListener;

.field private u:Lcom/huawei/openalliance/ad/media/listener/a;

.field private v:Lcom/huawei/openalliance/ad/media/listener/MuteListener;

.field private w:Lcom/huawei/openalliance/ad/views/i$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lcom/huawei/openalliance/ad/views/NativeVideoView;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->e:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    invoke-direct {p0, p1}, Lcom/huawei/openalliance/ad/views/NativeMediaView;-><init>(Landroid/content/Context;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->g:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->l:Z

    new-instance v0, Lcom/huawei/openalliance/ad/views/NativeVideoView$1;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/views/NativeVideoView$1;-><init>(Lcom/huawei/openalliance/ad/views/NativeVideoView;)V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->s:Lcom/huawei/openalliance/ad/media/listener/MediaStateListener;

    new-instance v0, Lcom/huawei/openalliance/ad/views/NativeVideoView$2;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/views/NativeVideoView$2;-><init>(Lcom/huawei/openalliance/ad/views/NativeVideoView;)V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->t:Lcom/huawei/openalliance/ad/media/listener/MediaErrorListener;

    new-instance v0, Lcom/huawei/openalliance/ad/views/NativeVideoView$3;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/views/NativeVideoView$3;-><init>(Lcom/huawei/openalliance/ad/views/NativeVideoView;)V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->u:Lcom/huawei/openalliance/ad/media/listener/a;

    new-instance v0, Lcom/huawei/openalliance/ad/views/NativeVideoView$4;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/views/NativeVideoView$4;-><init>(Lcom/huawei/openalliance/ad/views/NativeVideoView;)V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->v:Lcom/huawei/openalliance/ad/media/listener/MuteListener;

    new-instance v0, Lcom/huawei/openalliance/ad/views/NativeVideoView$5;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/views/NativeVideoView$5;-><init>(Lcom/huawei/openalliance/ad/views/NativeVideoView;)V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->w:Lcom/huawei/openalliance/ad/views/i$a;

    invoke-direct {p0, p1}, Lcom/huawei/openalliance/ad/views/NativeVideoView;->a(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    invoke-direct {p0, p1, p2}, Lcom/huawei/openalliance/ad/views/NativeMediaView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->g:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->l:Z

    new-instance v0, Lcom/huawei/openalliance/ad/views/NativeVideoView$1;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/views/NativeVideoView$1;-><init>(Lcom/huawei/openalliance/ad/views/NativeVideoView;)V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->s:Lcom/huawei/openalliance/ad/media/listener/MediaStateListener;

    new-instance v0, Lcom/huawei/openalliance/ad/views/NativeVideoView$2;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/views/NativeVideoView$2;-><init>(Lcom/huawei/openalliance/ad/views/NativeVideoView;)V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->t:Lcom/huawei/openalliance/ad/media/listener/MediaErrorListener;

    new-instance v0, Lcom/huawei/openalliance/ad/views/NativeVideoView$3;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/views/NativeVideoView$3;-><init>(Lcom/huawei/openalliance/ad/views/NativeVideoView;)V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->u:Lcom/huawei/openalliance/ad/media/listener/a;

    new-instance v0, Lcom/huawei/openalliance/ad/views/NativeVideoView$4;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/views/NativeVideoView$4;-><init>(Lcom/huawei/openalliance/ad/views/NativeVideoView;)V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->v:Lcom/huawei/openalliance/ad/media/listener/MuteListener;

    new-instance v0, Lcom/huawei/openalliance/ad/views/NativeVideoView$5;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/views/NativeVideoView$5;-><init>(Lcom/huawei/openalliance/ad/views/NativeVideoView;)V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->w:Lcom/huawei/openalliance/ad/views/i$a;

    invoke-direct {p0, p1}, Lcom/huawei/openalliance/ad/views/NativeVideoView;->a(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/openalliance/ad/views/NativeMediaView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->g:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->l:Z

    new-instance v0, Lcom/huawei/openalliance/ad/views/NativeVideoView$1;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/views/NativeVideoView$1;-><init>(Lcom/huawei/openalliance/ad/views/NativeVideoView;)V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->s:Lcom/huawei/openalliance/ad/media/listener/MediaStateListener;

    new-instance v0, Lcom/huawei/openalliance/ad/views/NativeVideoView$2;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/views/NativeVideoView$2;-><init>(Lcom/huawei/openalliance/ad/views/NativeVideoView;)V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->t:Lcom/huawei/openalliance/ad/media/listener/MediaErrorListener;

    new-instance v0, Lcom/huawei/openalliance/ad/views/NativeVideoView$3;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/views/NativeVideoView$3;-><init>(Lcom/huawei/openalliance/ad/views/NativeVideoView;)V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->u:Lcom/huawei/openalliance/ad/media/listener/a;

    new-instance v0, Lcom/huawei/openalliance/ad/views/NativeVideoView$4;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/views/NativeVideoView$4;-><init>(Lcom/huawei/openalliance/ad/views/NativeVideoView;)V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->v:Lcom/huawei/openalliance/ad/media/listener/MuteListener;

    new-instance v0, Lcom/huawei/openalliance/ad/views/NativeVideoView$5;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/views/NativeVideoView$5;-><init>(Lcom/huawei/openalliance/ad/views/NativeVideoView;)V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->w:Lcom/huawei/openalliance/ad/views/i$a;

    invoke-direct {p0, p1}, Lcom/huawei/openalliance/ad/views/NativeVideoView;->a(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 1
    .annotation build Landroid/annotation/TargetApi;
        value = 0x15
    .end annotation

    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/huawei/openalliance/ad/views/NativeMediaView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->g:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->l:Z

    new-instance v0, Lcom/huawei/openalliance/ad/views/NativeVideoView$1;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/views/NativeVideoView$1;-><init>(Lcom/huawei/openalliance/ad/views/NativeVideoView;)V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->s:Lcom/huawei/openalliance/ad/media/listener/MediaStateListener;

    new-instance v0, Lcom/huawei/openalliance/ad/views/NativeVideoView$2;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/views/NativeVideoView$2;-><init>(Lcom/huawei/openalliance/ad/views/NativeVideoView;)V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->t:Lcom/huawei/openalliance/ad/media/listener/MediaErrorListener;

    new-instance v0, Lcom/huawei/openalliance/ad/views/NativeVideoView$3;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/views/NativeVideoView$3;-><init>(Lcom/huawei/openalliance/ad/views/NativeVideoView;)V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->u:Lcom/huawei/openalliance/ad/media/listener/a;

    new-instance v0, Lcom/huawei/openalliance/ad/views/NativeVideoView$4;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/views/NativeVideoView$4;-><init>(Lcom/huawei/openalliance/ad/views/NativeVideoView;)V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->v:Lcom/huawei/openalliance/ad/media/listener/MuteListener;

    new-instance v0, Lcom/huawei/openalliance/ad/views/NativeVideoView$5;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/views/NativeVideoView$5;-><init>(Lcom/huawei/openalliance/ad/views/NativeVideoView;)V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->w:Lcom/huawei/openalliance/ad/views/i$a;

    invoke-direct {p0, p1}, Lcom/huawei/openalliance/ad/views/NativeVideoView;->a(Landroid/content/Context;)V

    return-void
.end method

.method static synthetic a(Lcom/huawei/openalliance/ad/views/NativeVideoView;J)J
    .locals 0

    iput-wide p1, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->q:J

    return-wide p1
.end method

.method private a(IZ)V
    .locals 9

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->j:Lcom/huawei/openalliance/ad/inter/data/VideoInfo;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->j:Lcom/huawei/openalliance/ad/inter/data/VideoInfo;

    if-eqz p2, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    move v1, p1

    :goto_0
    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/inter/data/VideoInfo;->setPlayProgress(I)V

    :cond_1
    iget-boolean v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->g:Z

    if-eqz v0, :cond_3

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->g:Z

    if-eqz p2, :cond_2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->i:Lcom/huawei/openalliance/ad/j/a/c;

    iget-wide v1, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->p:J

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    iget-wide v5, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->q:J

    int-to-long v7, p1

    invoke-interface/range {v0 .. v8}, Lcom/huawei/openalliance/ad/j/a/c;->a(JJJJ)V

    goto :goto_1

    :cond_2
    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->i:Lcom/huawei/openalliance/ad/j/a/c;

    iget-wide v1, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->p:J

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    iget-wide v5, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->q:J

    int-to-long v7, p1

    invoke-interface/range {v0 .. v8}, Lcom/huawei/openalliance/ad/j/a/c;->b(JJJJ)V

    :cond_3
    :goto_1
    return-void
.end method

.method private a(Landroid/content/Context;)V
    .locals 3

    new-instance v0, Lcom/huawei/openalliance/ad/j/f;

    invoke-direct {v0, p1, p0}, Lcom/huawei/openalliance/ad/j/f;-><init>(Landroid/content/Context;Lcom/huawei/openalliance/ad/views/interfaces/INativeVideoView;)V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->i:Lcom/huawei/openalliance/ad/j/a/c;

    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/openalliance/ad/R$layout;->hiad_native_video_view:I

    invoke-virtual {v0, v1, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    sget v0, Lcom/huawei/openalliance/ad/R$id;->hiad_id_video_view:I

    invoke-virtual {p0, v0}, Lcom/huawei/openalliance/ad/views/NativeVideoView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/huawei/openalliance/ad/views/VideoView;

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->o:Lcom/huawei/openalliance/ad/views/VideoView;

    sget v0, Lcom/huawei/openalliance/ad/R$id;->hiad_native_video_ctrl_panel:I

    invoke-virtual {p0, v0}, Lcom/huawei/openalliance/ad/views/NativeVideoView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/huawei/openalliance/ad/views/NativeVideoControlPanel;

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->n:Lcom/huawei/openalliance/ad/views/NativeVideoControlPanel;

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->o:Lcom/huawei/openalliance/ad/views/VideoView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/views/VideoView;->setStandalone(Z)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->o:Lcom/huawei/openalliance/ad/views/VideoView;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/views/VideoView;->setScreenOnWhilePlaying(Z)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->o:Lcom/huawei/openalliance/ad/views/VideoView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/views/VideoView;->setAutoScaleResizeLayoutOnVideoSizeChange(Z)V

    new-instance v0, Lcom/huawei/openalliance/ad/views/i;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->o:Lcom/huawei/openalliance/ad/views/VideoView;

    iget-object v2, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->n:Lcom/huawei/openalliance/ad/views/NativeVideoControlPanel;

    invoke-direct {v0, v1, v2}, Lcom/huawei/openalliance/ad/views/i;-><init>(Lcom/huawei/openalliance/ad/views/VideoView;Lcom/huawei/openalliance/ad/views/interfaces/g;)V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->h:Lcom/huawei/openalliance/ad/views/i;

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->h:Lcom/huawei/openalliance/ad/views/i;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->w:Lcom/huawei/openalliance/ad/views/i$a;

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/views/i;->a(Lcom/huawei/openalliance/ad/views/i$a;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->h:Lcom/huawei/openalliance/ad/views/i;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/views/i;->c(Z)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->o:Lcom/huawei/openalliance/ad/views/VideoView;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->s:Lcom/huawei/openalliance/ad/media/listener/MediaStateListener;

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/views/VideoView;->addMediaStateListener(Lcom/huawei/openalliance/ad/media/listener/MediaStateListener;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->o:Lcom/huawei/openalliance/ad/views/VideoView;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->t:Lcom/huawei/openalliance/ad/media/listener/MediaErrorListener;

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/views/VideoView;->addMediaErrorListener(Lcom/huawei/openalliance/ad/media/listener/MediaErrorListener;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->o:Lcom/huawei/openalliance/ad/views/VideoView;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->v:Lcom/huawei/openalliance/ad/media/listener/MuteListener;

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/views/VideoView;->addMuteListener(Lcom/huawei/openalliance/ad/media/listener/MuteListener;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->o:Lcom/huawei/openalliance/ad/views/VideoView;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->u:Lcom/huawei/openalliance/ad/media/listener/a;

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/views/VideoView;->addMediaInfoListener(Lcom/huawei/openalliance/ad/media/listener/a;)V

    return-void
.end method

.method static synthetic a(Lcom/huawei/openalliance/ad/views/NativeVideoView;IZ)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/huawei/openalliance/ad/views/NativeVideoView;->a(IZ)V

    return-void
.end method

.method static synthetic a(Lcom/huawei/openalliance/ad/views/NativeVideoView;ZI)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/huawei/openalliance/ad/views/NativeVideoView;->a(ZI)V

    return-void
.end method

.method private a(ZI)V
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->f:Lcom/huawei/openalliance/ad/views/NativeVideoView$VideoEventListener;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->f:Lcom/huawei/openalliance/ad/views/NativeVideoView$VideoEventListener;

    invoke-interface {v0, p1, p2}, Lcom/huawei/openalliance/ad/views/NativeVideoView$VideoEventListener;->onControlPanelShow(ZI)V

    :cond_0
    return-void
.end method

.method static synthetic a(Lcom/huawei/openalliance/ad/views/NativeVideoView;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->g:Z

    return v0
.end method

.method static synthetic a(Lcom/huawei/openalliance/ad/views/NativeVideoView;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->g:Z

    return p1
.end method

.method static synthetic b(Lcom/huawei/openalliance/ad/views/NativeVideoView;J)J
    .locals 0

    iput-wide p1, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->p:J

    return-wide p1
.end method

.method static synthetic b(Lcom/huawei/openalliance/ad/views/NativeVideoView;)V
    .locals 0

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/NativeVideoView;->k()V

    return-void
.end method

.method static synthetic b(Lcom/huawei/openalliance/ad/views/NativeVideoView;ZI)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/huawei/openalliance/ad/views/NativeVideoView;->b(ZI)V

    return-void
.end method

.method private b(ZI)V
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->f:Lcom/huawei/openalliance/ad/views/NativeVideoView$VideoEventListener;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->f:Lcom/huawei/openalliance/ad/views/NativeVideoView$VideoEventListener;

    invoke-interface {v0, p1, p2}, Lcom/huawei/openalliance/ad/views/NativeVideoView$VideoEventListener;->onControlPanelHide(ZI)V

    :cond_0
    return-void
.end method

.method static synthetic b(Lcom/huawei/openalliance/ad/views/NativeVideoView;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->r:Z

    return p1
.end method

.method static synthetic c(Lcom/huawei/openalliance/ad/views/NativeVideoView;)Lcom/huawei/openalliance/ad/j/a/c;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->i:Lcom/huawei/openalliance/ad/j/a/c;

    return-object v0
.end method

.method static synthetic d(Lcom/huawei/openalliance/ad/views/NativeVideoView;)V
    .locals 0

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/NativeVideoView;->m()V

    return-void
.end method

.method static synthetic e(Lcom/huawei/openalliance/ad/views/NativeVideoView;)V
    .locals 0

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/NativeVideoView;->l()V

    return-void
.end method

.method static synthetic f(Lcom/huawei/openalliance/ad/views/NativeVideoView;)Lcom/huawei/openalliance/ad/inter/data/VideoInfo;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->j:Lcom/huawei/openalliance/ad/inter/data/VideoInfo;

    return-object v0
.end method

.method private f()V
    .locals 9

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->c:Lcom/huawei/openalliance/ad/inter/data/NativeAd;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->c:Lcom/huawei/openalliance/ad/inter/data/NativeAd;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/inter/data/NativeAd;->getVideoInfo()Lcom/huawei/openalliance/ad/inter/data/VideoInfo;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->j:Lcom/huawei/openalliance/ad/inter/data/VideoInfo;

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->j:Lcom/huawei/openalliance/ad/inter/data/VideoInfo;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->j:Lcom/huawei/openalliance/ad/inter/data/VideoInfo;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/inter/data/VideoInfo;->getVideoRatio()Ljava/lang/Float;

    move-result-object v6

    if-eqz v6, :cond_1

    invoke-virtual {p0, v6}, Lcom/huawei/openalliance/ad/views/NativeVideoView;->setRatio(Ljava/lang/Float;)V

    :cond_1
    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->h:Lcom/huawei/openalliance/ad/views/i;

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/NativeVideoView;->i()Z

    move-result v1

    if-nez v1, :cond_2

    const/4 v1, 0x1

    goto :goto_0

    :cond_2
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/views/i;->c(Z)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->h:Lcom/huawei/openalliance/ad/views/i;

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/NativeVideoView;->getContinuePlayTime()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/views/i;->a(I)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->h:Lcom/huawei/openalliance/ad/views/i;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->j:Lcom/huawei/openalliance/ad/inter/data/VideoInfo;

    invoke-virtual {v1}, Lcom/huawei/openalliance/ad/inter/data/VideoInfo;->getVideoDuration()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/views/i;->b(I)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->h:Lcom/huawei/openalliance/ad/views/i;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->j:Lcom/huawei/openalliance/ad/inter/data/VideoInfo;

    invoke-virtual {v1}, Lcom/huawei/openalliance/ad/inter/data/VideoInfo;->getAutoPlayNetwork()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/views/i;->c(I)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->i:Lcom/huawei/openalliance/ad/j/a/c;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->j:Lcom/huawei/openalliance/ad/inter/data/VideoInfo;

    invoke-interface {v0, v1}, Lcom/huawei/openalliance/ad/j/a/c;->a(Lcom/huawei/openalliance/ad/inter/data/VideoInfo;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->j:Lcom/huawei/openalliance/ad/inter/data/VideoInfo;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/inter/data/VideoInfo;->getVideoFileSize()I

    move-result v7

    if-lez v7, :cond_3

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/views/NativeVideoView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/openalliance/ad/R$string;->hiad_consume_data_to_play_video:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/views/NativeVideoView;->getContext()Landroid/content/Context;

    move-result-object v3

    iget-object v4, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->j:Lcom/huawei/openalliance/ad/inter/data/VideoInfo;

    invoke-virtual {v4}, Lcom/huawei/openalliance/ad/inter/data/VideoInfo;->getVideoFileSize()I

    move-result v4

    int-to-long v4, v4

    invoke-static {v3, v4, v5}, Lcom/huawei/openalliance/ad/utils/i;->a(Landroid/content/Context;J)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    goto :goto_1

    :cond_3
    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/views/NativeVideoView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/openalliance/ad/R$string;->hiad_consume_data_to_play_video_no_data_size:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v8

    :goto_1
    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->n:Lcom/huawei/openalliance/ad/views/NativeVideoControlPanel;

    invoke-virtual {v0, v8}, Lcom/huawei/openalliance/ad/views/NativeVideoControlPanel;->setNonWifiAlertMsg(Ljava/lang/String;)V

    :cond_4
    return-void
.end method

.method private g()V
    .locals 4

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->c:Lcom/huawei/openalliance/ad/inter/data/NativeAd;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->c:Lcom/huawei/openalliance/ad/inter/data/NativeAd;

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

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->k:Lcom/huawei/openalliance/ad/inter/data/ImageInfo;

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->k:Lcom/huawei/openalliance/ad/inter/data/ImageInfo;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->k:Lcom/huawei/openalliance/ad/inter/data/ImageInfo;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/inter/data/ImageInfo;->getHeight()I

    move-result v0

    if-lez v0, :cond_1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->k:Lcom/huawei/openalliance/ad/inter/data/ImageInfo;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/inter/data/ImageInfo;->getWidth()I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x3f800000    # 1.0f

    mul-float/2addr v0, v1

    iget-object v1, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->k:Lcom/huawei/openalliance/ad/inter/data/ImageInfo;

    invoke-virtual {v1}, Lcom/huawei/openalliance/ad/inter/data/ImageInfo;->getHeight()I

    move-result v1

    int-to-float v1, v1

    div-float v3, v0, v1

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/openalliance/ad/views/NativeVideoView;->setRatio(Ljava/lang/Float;)V

    :cond_1
    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->i:Lcom/huawei/openalliance/ad/j/a/c;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->k:Lcom/huawei/openalliance/ad/inter/data/ImageInfo;

    invoke-interface {v0, v1}, Lcom/huawei/openalliance/ad/j/a/c;->a(Lcom/huawei/openalliance/ad/inter/data/ImageInfo;)V

    :cond_2
    return-void
.end method

.method static synthetic g(Lcom/huawei/openalliance/ad/views/NativeVideoView;)V
    .locals 0

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/NativeVideoView;->n()V

    return-void
.end method

.method private getContinuePlayTime()I
    .locals 2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->j:Lcom/huawei/openalliance/ad/inter/data/VideoInfo;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->j:Lcom/huawei/openalliance/ad/inter/data/VideoInfo;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/inter/data/VideoInfo;->getPlayProgress()I

    move-result v1

    const/16 v0, 0x1388

    if-lt v1, v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method static synthetic h(Lcom/huawei/openalliance/ad/views/NativeVideoView;)Lcom/huawei/openalliance/ad/views/i;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->h:Lcom/huawei/openalliance/ad/views/i;

    return-object v0
.end method

.method private h()V
    .locals 2

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->l:Z

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->h:Lcom/huawei/openalliance/ad/views/i;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/views/i;->e(Z)V

    return-void
.end method

.method static synthetic i(Lcom/huawei/openalliance/ad/views/NativeVideoView;)Lcom/huawei/openalliance/ad/views/VideoView;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->o:Lcom/huawei/openalliance/ad/views/VideoView;

    return-object v0
.end method

.method private i()Z
    .locals 2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->j:Lcom/huawei/openalliance/ad/inter/data/VideoInfo;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->j:Lcom/huawei/openalliance/ad/inter/data/VideoInfo;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/inter/data/VideoInfo;->getSoundSwitch()Ljava/lang/String;

    move-result-object v0

    const-string v1, "y"

    invoke-static {v0, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private j()Z
    .locals 2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->j:Lcom/huawei/openalliance/ad/inter/data/VideoInfo;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->j:Lcom/huawei/openalliance/ad/inter/data/VideoInfo;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/inter/data/VideoInfo;->getVideoAutoPlay()Ljava/lang/String;

    move-result-object v0

    const-string v1, "y"

    invoke-static {v0, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private k()V
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->f:Lcom/huawei/openalliance/ad/views/NativeVideoView$VideoEventListener;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->f:Lcom/huawei/openalliance/ad/views/NativeVideoView$VideoEventListener;

    invoke-interface {v0}, Lcom/huawei/openalliance/ad/views/NativeVideoView$VideoEventListener;->onVideoStart()V

    :cond_0
    return-void
.end method

.method private l()V
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->f:Lcom/huawei/openalliance/ad/views/NativeVideoView$VideoEventListener;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->f:Lcom/huawei/openalliance/ad/views/NativeVideoView$VideoEventListener;

    invoke-interface {v0}, Lcom/huawei/openalliance/ad/views/NativeVideoView$VideoEventListener;->onVideoStop()V

    :cond_0
    return-void
.end method

.method private m()V
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->f:Lcom/huawei/openalliance/ad/views/NativeVideoView$VideoEventListener;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->f:Lcom/huawei/openalliance/ad/views/NativeVideoView$VideoEventListener;

    invoke-interface {v0}, Lcom/huawei/openalliance/ad/views/NativeVideoView$VideoEventListener;->onVideoPause()V

    :cond_0
    return-void
.end method

.method private n()V
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->f:Lcom/huawei/openalliance/ad/views/NativeVideoView$VideoEventListener;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->f:Lcom/huawei/openalliance/ad/views/NativeVideoView$VideoEventListener;

    invoke-interface {v0}, Lcom/huawei/openalliance/ad/views/NativeVideoView$VideoEventListener;->onVideoComplete()V

    :cond_0
    return-void
.end method

.method private o()V
    .locals 2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->j:Lcom/huawei/openalliance/ad/inter/data/VideoInfo;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/inter/data/VideoInfo;->setBackFromFullScreen(Z)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->j:Lcom/huawei/openalliance/ad/inter/data/VideoInfo;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/inter/data/VideoInfo;->isNeedContinueAutoPlay()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->h:Lcom/huawei/openalliance/ad/views/i;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/views/i;->c()V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->h:Lcom/huawei/openalliance/ad/views/i;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/views/i;->b()V

    :goto_0
    return-void
.end method

.method private p()Z
    .locals 2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->j:Lcom/huawei/openalliance/ad/inter/data/VideoInfo;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/views/NativeVideoView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/w;->d(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x0

    return v0

    :cond_1
    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/NativeVideoView;->j()Z

    move-result v0

    if-nez v0, :cond_2

    const/4 v0, 0x0

    return v0

    :cond_2
    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->j:Lcom/huawei/openalliance/ad/inter/data/VideoInfo;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/inter/data/VideoInfo;->getAutoPlayNetwork()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_3

    const/4 v0, 0x1

    return v0

    :cond_3
    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->j:Lcom/huawei/openalliance/ad/inter/data/VideoInfo;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/inter/data/VideoInfo;->getAutoPlayNetwork()I

    move-result v0

    if-nez v0, :cond_4

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/views/NativeVideoView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/w;->b(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_4

    const/4 v0, 0x1

    return v0

    :cond_4
    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method protected b()V
    .locals 2

    invoke-super {p0}, Lcom/huawei/openalliance/ad/views/NativeMediaView;->b()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->r:Z

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->o:Lcom/huawei/openalliance/ad/views/VideoView;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/views/VideoView;->setNeedPauseOnSurfaceDestory(Z)V

    return-void
.end method

.method protected c()V
    .locals 6

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->m:J

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->h:Lcom/huawei/openalliance/ad/views/i;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/views/i;->d(Z)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->h:Lcom/huawei/openalliance/ad/views/i;

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/NativeVideoView;->i()Z

    move-result v1

    if-nez v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/views/i;->c(Z)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->o:Lcom/huawei/openalliance/ad/views/VideoView;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->t:Lcom/huawei/openalliance/ad/media/listener/MediaErrorListener;

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/views/VideoView;->addMediaErrorListener(Lcom/huawei/openalliance/ad/media/listener/MediaErrorListener;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->o:Lcom/huawei/openalliance/ad/views/VideoView;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->v:Lcom/huawei/openalliance/ad/media/listener/MuteListener;

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/views/VideoView;->addMuteListener(Lcom/huawei/openalliance/ad/media/listener/MuteListener;)V

    sget-object v0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->e:Ljava/lang/String;

    const-string v1, "onViewFullShown hashCheckSuccess: %s"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    iget-boolean v3, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->l:Z

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v0, v1, v2}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-boolean v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->l:Z

    if-eqz v0, :cond_2

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/NativeVideoView;->j()Z

    move-result v5

    sget-object v0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->e:Ljava/lang/String;

    const-string v1, "onViewFullShown autoplay: %s"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v0, v1, v2}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->h:Lcom/huawei/openalliance/ad/views/i;

    invoke-virtual {v0, v5}, Lcom/huawei/openalliance/ad/views/i;->b(Z)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->h:Lcom/huawei/openalliance/ad/views/i;

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/NativeVideoView;->getContinuePlayTime()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/views/i;->a(I)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->j:Lcom/huawei/openalliance/ad/inter/data/VideoInfo;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->j:Lcom/huawei/openalliance/ad/inter/data/VideoInfo;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/inter/data/VideoInfo;->isBackFromFullScreen()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/NativeVideoView;->o()V

    goto :goto_1

    :cond_1
    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/NativeVideoView;->p()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->h:Lcom/huawei/openalliance/ad/views/i;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->j:Lcom/huawei/openalliance/ad/inter/data/VideoInfo;

    invoke-virtual {v1}, Lcom/huawei/openalliance/ad/inter/data/VideoInfo;->getTimeBeforeVideoAutoPlay()I

    move-result v1

    int-to-long v1, v1

    invoke-virtual {v0, v1, v2}, Lcom/huawei/openalliance/ad/views/i;->a(J)V

    :cond_2
    :goto_1
    return-void
.end method

.method protected d()V
    .locals 2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->o:Lcom/huawei/openalliance/ad/views/VideoView;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->t:Lcom/huawei/openalliance/ad/media/listener/MediaErrorListener;

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/views/VideoView;->removeMediaErrorListener(Lcom/huawei/openalliance/ad/media/listener/MediaErrorListener;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->o:Lcom/huawei/openalliance/ad/views/VideoView;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->v:Lcom/huawei/openalliance/ad/media/listener/MuteListener;

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/views/VideoView;->removeMuteListener(Lcom/huawei/openalliance/ad/media/listener/MuteListener;)V

    iget-boolean v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->r:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    sget-object v0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->e:Ljava/lang/String;

    const-string v1, "onViewPartialHidden"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->h:Lcom/huawei/openalliance/ad/views/i;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/views/i;->d(Z)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->h:Lcom/huawei/openalliance/ad/views/i;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/views/i;->b(Z)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->h:Lcom/huawei/openalliance/ad/views/i;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/views/i;->a()V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->h:Lcom/huawei/openalliance/ad/views/i;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/views/i;->b()V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->j:Lcom/huawei/openalliance/ad/inter/data/VideoInfo;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->j:Lcom/huawei/openalliance/ad/inter/data/VideoInfo;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/inter/data/VideoInfo;->setNeedContinueAutoPlay(Z)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->j:Lcom/huawei/openalliance/ad/inter/data/VideoInfo;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/inter/data/VideoInfo;->setBackFromFullScreen(Z)V

    :cond_1
    return-void
.end method

.method public destroyView()V
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->o:Lcom/huawei/openalliance/ad/views/VideoView;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/views/VideoView;->destroyView()V

    return-void
.end method

.method protected e()V
    .locals 2

    sget-object v0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->e:Ljava/lang/String;

    const-string v1, "onViewShownBetweenFullAndPartial"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->h:Lcom/huawei/openalliance/ad/views/i;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/views/i;->d(Z)V

    return-void
.end method

.method protected getAutoPlayAreaPercentageThresshold()I
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->j:Lcom/huawei/openalliance/ad/inter/data/VideoInfo;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->j:Lcom/huawei/openalliance/ad/inter/data/VideoInfo;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/inter/data/VideoInfo;->getAutoPlayAreaRatio()I

    move-result v0

    return v0

    :cond_0
    invoke-super {p0}, Lcom/huawei/openalliance/ad/views/NativeMediaView;->getAutoPlayAreaPercentageThresshold()I

    move-result v0

    return v0
.end method

.method protected getHiddenAreaPercentageThreshhold()I
    .locals 2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->j:Lcom/huawei/openalliance/ad/inter/data/VideoInfo;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->j:Lcom/huawei/openalliance/ad/inter/data/VideoInfo;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/inter/data/VideoInfo;->getAutoStopPlayAreaRatio()I

    move-result v0

    rsub-int/lit8 v0, v0, 0x64

    const/4 v1, 0x0

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    return v0

    :cond_0
    invoke-super {p0}, Lcom/huawei/openalliance/ad/views/NativeMediaView;->getHiddenAreaPercentageThreshhold()I

    move-result v0

    return v0
.end method

.method public onCheckVideoHashResult(Lcom/huawei/openalliance/ad/inter/data/VideoInfo;Z)V
    .locals 10

    sget-object v0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->e:Ljava/lang/String;

    const-string v1, "onCheckVideoHashResult sucess: %s"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v0, v1, v2}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    if-eqz p2, :cond_2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->j:Lcom/huawei/openalliance/ad/inter/data/VideoInfo;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    const/4 v0, 0x0

    if-eq v0, p1, :cond_2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->j:Lcom/huawei/openalliance/ad/inter/data/VideoInfo;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/inter/data/VideoInfo;->getVideoDownloadUrl()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/inter/data/VideoInfo;->getVideoDownloadUrl()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->l:Z

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->h:Lcom/huawei/openalliance/ad/views/i;

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/inter/data/VideoInfo;->getVideoDownloadUrl()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/views/i;->a(Ljava/lang/String;)V

    iget-boolean v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->a:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->h:Lcom/huawei/openalliance/ad/views/i;

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/NativeVideoView;->getContinuePlayTime()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/views/i;->a(I)V

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/NativeVideoView;->j()Z

    move-result v5

    sget-object v0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->e:Ljava/lang/String;

    const-string v1, "onCheckVideoHashResult - has full shown, autoPlay: %s"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v0, v1, v2}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->h:Lcom/huawei/openalliance/ad/views/i;

    invoke-virtual {v0, v5}, Lcom/huawei/openalliance/ad/views/i;->b(Z)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->j:Lcom/huawei/openalliance/ad/inter/data/VideoInfo;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/inter/data/VideoInfo;->isBackFromFullScreen()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/NativeVideoView;->o()V

    goto :goto_1

    :cond_0
    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/NativeVideoView;->p()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->m:J

    sub-long v6, v0, v2

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/inter/data/VideoInfo;->getTimeBeforeVideoAutoPlay()I

    move-result v0

    int-to-long v0, v0

    sub-long v8, v0, v6

    const-wide/16 v0, 0x0

    cmp-long v0, v8, v0

    if-gez v0, :cond_1

    const-wide/16 v0, 0x0

    goto :goto_0

    :cond_1
    move-wide v0, v8

    :goto_0
    move-wide v8, v0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->h:Lcom/huawei/openalliance/ad/views/i;

    invoke-virtual {v0, v8, v9}, Lcom/huawei/openalliance/ad/views/i;->a(J)V

    :cond_2
    :goto_1
    return-void
.end method

.method public onPreviewImageLoaded(Lcom/huawei/openalliance/ad/inter/data/ImageInfo;Landroid/graphics/Bitmap;)V
    .locals 2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->k:Lcom/huawei/openalliance/ad/inter/data/ImageInfo;

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->k:Lcom/huawei/openalliance/ad/inter/data/ImageInfo;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/inter/data/ImageInfo;->getUrl()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/inter/data/ImageInfo;->getUrl()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->h:Lcom/huawei/openalliance/ad/views/i;

    invoke-virtual {v0, p2}, Lcom/huawei/openalliance/ad/views/i;->a(Landroid/graphics/Bitmap;)V

    :cond_0
    return-void
.end method

.method public pause()V
    .locals 1
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    iget-boolean v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->r:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->h:Lcom/huawei/openalliance/ad/views/i;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/views/i;->e()V

    :cond_0
    return-void
.end method

.method public pauseView()V
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->h:Lcom/huawei/openalliance/ad/views/i;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/views/i;->f()V

    return-void
.end method

.method public play()V
    .locals 2
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->h:Lcom/huawei/openalliance/ad/views/i;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/views/i;->a(Z)V

    return-void
.end method

.method public resumeView()V
    .locals 2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->h:Lcom/huawei/openalliance/ad/views/i;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/views/i;->g()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->a:Z

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->d:Lcom/huawei/openalliance/ad/monitor/b;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/monitor/b;->onGlobalLayout()V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->o:Lcom/huawei/openalliance/ad/views/VideoView;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/views/VideoView;->setNeedPauseOnSurfaceDestory(Z)V

    return-void
.end method

.method public setCoverClickListener(Landroid/view/View$OnClickListener;)V
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->h:Lcom/huawei/openalliance/ad/views/i;

    invoke-virtual {v0, p1}, Lcom/huawei/openalliance/ad/views/i;->a(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public setNativeAd(Lcom/huawei/openalliance/ad/inter/data/INativeAd;)V
    .locals 3

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->o:Lcom/huawei/openalliance/ad/views/VideoView;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/views/VideoView;->getCurrentState()Lcom/huawei/openalliance/ad/media/MediaState;

    move-result-object v2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->c:Lcom/huawei/openalliance/ad/inter/data/NativeAd;

    if-ne v0, p1, :cond_0

    sget-object v0, Lcom/huawei/openalliance/ad/media/MediaState$State;->IDLE:Lcom/huawei/openalliance/ad/media/MediaState$State;

    invoke-virtual {v2, v0}, Lcom/huawei/openalliance/ad/media/MediaState;->isNotState(Lcom/huawei/openalliance/ad/media/MediaState$State;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/huawei/openalliance/ad/media/MediaState$State;->ERROR:Lcom/huawei/openalliance/ad/media/MediaState$State;

    invoke-virtual {v2, v0}, Lcom/huawei/openalliance/ad/media/MediaState;->isNotState(Lcom/huawei/openalliance/ad/media/MediaState$State;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->e:Ljava/lang/String;

    const-string v1, "setNativeAd - has the same ad"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    invoke-super {p0, p1}, Lcom/huawei/openalliance/ad/views/NativeMediaView;->setNativeAd(Lcom/huawei/openalliance/ad/inter/data/INativeAd;)V

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/NativeVideoView;->h()V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->i:Lcom/huawei/openalliance/ad/j/a/c;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->c:Lcom/huawei/openalliance/ad/inter/data/NativeAd;

    invoke-interface {v0, v1}, Lcom/huawei/openalliance/ad/j/a/c;->a(Lcom/huawei/openalliance/ad/inter/data/NativeAd;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->c:Lcom/huawei/openalliance/ad/inter/data/NativeAd;

    if-eqz v0, :cond_1

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/NativeVideoView;->g()V

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/NativeVideoView;->f()V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->h:Lcom/huawei/openalliance/ad/views/i;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/views/i;->c(Z)V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->j:Lcom/huawei/openalliance/ad/inter/data/VideoInfo;

    :goto_0
    return-void
.end method

.method public setVideoEventListener(Lcom/huawei/openalliance/ad/views/NativeVideoView$VideoEventListener;)V
    .locals 0
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    iput-object p1, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->f:Lcom/huawei/openalliance/ad/views/NativeVideoView$VideoEventListener;

    return-void
.end method

.method public showFullScreenSwitchButton(Z)V
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->n:Lcom/huawei/openalliance/ad/views/NativeVideoControlPanel;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->n:Lcom/huawei/openalliance/ad/views/NativeVideoControlPanel;

    invoke-virtual {v0, p1}, Lcom/huawei/openalliance/ad/views/NativeVideoControlPanel;->b(Z)V

    :cond_0
    return-void
.end method

.method public stop()V
    .locals 1
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    iget-boolean v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->r:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->h:Lcom/huawei/openalliance/ad/views/i;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/views/i;->b()V

    :cond_0
    return-void
.end method

.method public updateContent(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/NativeVideoView;->i:Lcom/huawei/openalliance/ad/j/a/c;

    invoke-interface {v0, p1}, Lcom/huawei/openalliance/ad/j/a/c;->a(Ljava/lang/String;)V

    return-void
.end method
