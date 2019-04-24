.class public Lcom/huawei/openalliance/ad/views/i;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/widget/SeekBar$OnSeekBarChangeListener;
.implements Lcom/huawei/openalliance/ad/media/listener/MediaBufferListener;
.implements Lcom/huawei/openalliance/ad/media/listener/MediaErrorListener;
.implements Lcom/huawei/openalliance/ad/media/listener/MediaStateListener;
.implements Lcom/huawei/openalliance/ad/views/VideoView$NetworkChangeListener;
.implements Lcom/huawei/openalliance/ad/views/VideoView$SurfaceListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/openalliance/ad/views/i$a;
    }
.end annotation


# static fields
.field private static final a:Ljava/lang/String;


# instance fields
.field private b:Lcom/huawei/openalliance/ad/views/VideoView;

.field private c:Lcom/huawei/openalliance/ad/views/interfaces/g;

.field private d:Landroid/widget/ImageView;

.field private e:Landroid/widget/SeekBar;

.field private f:Landroid/widget/CompoundButton;

.field private g:Landroid/view/View;

.field private h:Landroid/widget/TextView;

.field private i:Landroid/widget/TextView;

.field private j:Landroid/widget/ImageView;

.field private k:Landroid/view/View;

.field private l:Landroid/view/View;

.field private m:Landroid/view/View;

.field private final n:Ljava/lang/String;

.field private final o:Ljava/lang/String;

.field private p:Z

.field private q:Z

.field private r:Z

.field private s:I

.field private t:Z

.field private u:Landroid/view/View$OnClickListener;

.field private v:Lcom/huawei/openalliance/ad/views/i$a;

.field private w:I

.field private x:Ljava/lang/Runnable;

.field private y:Ljava/lang/Runnable;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lcom/huawei/openalliance/ad/views/i;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/openalliance/ad/views/i;->a:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lcom/huawei/openalliance/ad/views/VideoView;Lcom/huawei/openalliance/ad/views/interfaces/g;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "hidePanelTask"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->n:Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "autoPlayTask"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->o:Ljava/lang/String;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/views/i;->r:Z

    new-instance v0, Lcom/huawei/openalliance/ad/views/i$1;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/views/i$1;-><init>(Lcom/huawei/openalliance/ad/views/i;)V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->x:Ljava/lang/Runnable;

    new-instance v0, Lcom/huawei/openalliance/ad/views/i$7;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/views/i$7;-><init>(Lcom/huawei/openalliance/ad/views/i;)V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->y:Ljava/lang/Runnable;

    invoke-direct {p0, p1}, Lcom/huawei/openalliance/ad/views/i;->a(Lcom/huawei/openalliance/ad/views/VideoView;)V

    invoke-virtual {p0, p2}, Lcom/huawei/openalliance/ad/views/i;->a(Lcom/huawei/openalliance/ad/views/interfaces/g;)V

    return-void
.end method

.method static synthetic a(Lcom/huawei/openalliance/ad/views/i;)Lcom/huawei/openalliance/ad/views/VideoView;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->b:Lcom/huawei/openalliance/ad/views/VideoView;

    return-object v0
.end method

.method private a(IZZ)V
    .locals 2

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/views/i;->a()V

    if-eqz p3, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    move v0, p1

    :goto_0
    iput v0, p0, Lcom/huawei/openalliance/ad/views/i;->s:I

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->n:Ljava/lang/String;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/aj;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->d:Landroid/widget/ImageView;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->c:Lcom/huawei/openalliance/ad/views/interfaces/g;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->c:Lcom/huawei/openalliance/ad/views/interfaces/g;

    invoke-interface {v0}, Lcom/huawei/openalliance/ad/views/interfaces/g;->getPlayIconResourceId()I

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->d:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/views/i;->c:Lcom/huawei/openalliance/ad/views/interfaces/g;

    invoke-interface {v1}, Lcom/huawei/openalliance/ad/views/interfaces/g;->getPlayIconResourceId()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    :cond_1
    if-nez p2, :cond_2

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/i;->j()V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/huawei/openalliance/ad/views/i;->g(Z)V

    :cond_2
    if-eqz p3, :cond_3

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->e:Landroid/widget/SeekBar;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->e:Landroid/widget/SeekBar;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/SeekBar;->setProgress(I)V

    :cond_3
    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->l:Landroid/view/View;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->l:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-eqz v0, :cond_5

    :cond_4
    const/4 v0, 0x1

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1}, Lcom/huawei/openalliance/ad/views/i;->a(ZZ)V

    :cond_5
    return-void
.end method

.method private a(Lcom/huawei/openalliance/ad/views/VideoView;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/views/i;->b:Lcom/huawei/openalliance/ad/views/VideoView;

    return-void
.end method

.method static synthetic a(Lcom/huawei/openalliance/ad/views/i;Z)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/huawei/openalliance/ad/views/i;->f(Z)V

    return-void
.end method

.method static synthetic a(Lcom/huawei/openalliance/ad/views/i;ZZ)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/huawei/openalliance/ad/views/i;->a(ZZ)V

    return-void
.end method

.method private a(ZZ)V
    .locals 3

    if-eqz p2, :cond_1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->k:Landroid/view/View;

    if-eqz p1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    const/16 v1, 0x8

    :goto_0
    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/utils/ag;->a(Landroid/view/View;I)Z

    move-result v2

    goto :goto_1

    :cond_1
    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->k:Landroid/view/View;

    invoke-static {v0, p1}, Lcom/huawei/openalliance/ad/utils/ag;->a(Landroid/view/View;Z)Z

    move-result v2

    :goto_1
    if-eqz v2, :cond_3

    if-eqz p1, :cond_2

    invoke-direct {p0, p2}, Lcom/huawei/openalliance/ad/views/i;->i(Z)V

    goto :goto_2

    :cond_2
    invoke-direct {p0, p2}, Lcom/huawei/openalliance/ad/views/i;->j(Z)V

    :cond_3
    :goto_2
    return-void
.end method

.method private b(Lcom/huawei/openalliance/ad/views/interfaces/g;)V
    .locals 2

    invoke-interface {p1}, Lcom/huawei/openalliance/ad/views/interfaces/g;->getFullScreenSwitchButton()Landroid/view/View;

    move-result-object v1

    if-eqz v1, :cond_0

    new-instance v0, Lcom/huawei/openalliance/ad/views/i$2;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/views/i$2;-><init>(Lcom/huawei/openalliance/ad/views/i;)V

    invoke-virtual {v1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_0
    return-void
.end method

.method static synthetic b(Lcom/huawei/openalliance/ad/views/i;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/huawei/openalliance/ad/views/i;->q:Z

    return v0
.end method

.method static synthetic c(Lcom/huawei/openalliance/ad/views/i;)V
    .locals 0

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/i;->v()V

    return-void
.end method

.method private c(Lcom/huawei/openalliance/ad/views/interfaces/g;)V
    .locals 2

    invoke-interface {p1}, Lcom/huawei/openalliance/ad/views/interfaces/g;->getPlayButtonInNonWifiAlertView()Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->m:Landroid/view/View;

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->m:Landroid/view/View;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->m:Landroid/view/View;

    new-instance v1, Lcom/huawei/openalliance/ad/views/i$3;

    invoke-direct {v1, p0}, Lcom/huawei/openalliance/ad/views/i$3;-><init>(Lcom/huawei/openalliance/ad/views/i;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_0
    return-void
.end method

.method static synthetic d(Lcom/huawei/openalliance/ad/views/i;)V
    .locals 0

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/i;->i()V

    return-void
.end method

.method private d(Lcom/huawei/openalliance/ad/views/interfaces/g;)V
    .locals 2

    invoke-interface {p1}, Lcom/huawei/openalliance/ad/views/interfaces/g;->getSoundToggleView()Landroid/widget/CompoundButton;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->f:Landroid/widget/CompoundButton;

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->f:Landroid/widget/CompoundButton;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->f:Landroid/widget/CompoundButton;

    new-instance v1, Lcom/huawei/openalliance/ad/views/i$5;

    invoke-direct {v1, p0}, Lcom/huawei/openalliance/ad/views/i$5;-><init>(Lcom/huawei/openalliance/ad/views/i;)V

    invoke-virtual {v0, v1}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    :cond_0
    return-void
.end method

.method static synthetic e(Lcom/huawei/openalliance/ad/views/i;)V
    .locals 0

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/i;->p()V

    return-void
.end method

.method private e(Lcom/huawei/openalliance/ad/views/interfaces/g;)V
    .locals 2

    invoke-interface {p1}, Lcom/huawei/openalliance/ad/views/interfaces/g;->getSeekBar()Landroid/widget/SeekBar;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->e:Landroid/widget/SeekBar;

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->e:Landroid/widget/SeekBar;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->e:Landroid/widget/SeekBar;

    invoke-virtual {v0, p0}, Landroid/widget/SeekBar;->setOnSeekBarChangeListener(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V

    :cond_0
    return-void
.end method

.method static synthetic f(Lcom/huawei/openalliance/ad/views/i;)V
    .locals 0

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/i;->o()V

    return-void
.end method

.method private f(Lcom/huawei/openalliance/ad/views/interfaces/g;)V
    .locals 2

    invoke-interface {p1}, Lcom/huawei/openalliance/ad/views/interfaces/g;->getPlayOrPauseView()Landroid/widget/ImageView;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->d:Landroid/widget/ImageView;

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->d:Landroid/widget/ImageView;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->d:Landroid/widget/ImageView;

    new-instance v1, Lcom/huawei/openalliance/ad/views/i$6;

    invoke-direct {v1, p0}, Lcom/huawei/openalliance/ad/views/i$6;-><init>(Lcom/huawei/openalliance/ad/views/i;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-interface {p1}, Lcom/huawei/openalliance/ad/views/interfaces/g;->getPlayIconResourceId()I

    move-result v0

    if-lez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->d:Landroid/widget/ImageView;

    invoke-interface {p1}, Lcom/huawei/openalliance/ad/views/interfaces/g;->getPlayIconResourceId()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    :cond_0
    return-void
.end method

.method private f(Z)V
    .locals 2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->b:Lcom/huawei/openalliance/ad/views/VideoView;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->n:Ljava/lang/String;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/aj;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->b:Lcom/huawei/openalliance/ad/views/VideoView;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/views/VideoView;->isPlaying()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/i;->r()V

    :cond_1
    if-eqz p1, :cond_2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->b:Lcom/huawei/openalliance/ad/views/VideoView;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/views/VideoView;->unmute()V

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->b:Lcom/huawei/openalliance/ad/views/VideoView;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/views/VideoView;->mute()V

    :goto_0
    return-void
.end method

.method private g(Z)V
    .locals 2

    if-nez p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/views/i;->r:Z

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->c:Lcom/huawei/openalliance/ad/views/interfaces/g;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->c:Lcom/huawei/openalliance/ad/views/interfaces/g;

    invoke-interface {v0, p1}, Lcom/huawei/openalliance/ad/views/interfaces/g;->a(Z)V

    :cond_1
    return-void
.end method

.method private h()V
    .locals 2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->c:Lcom/huawei/openalliance/ad/views/interfaces/g;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->c:Lcom/huawei/openalliance/ad/views/interfaces/g;

    invoke-interface {v0}, Lcom/huawei/openalliance/ad/views/interfaces/g;->getPlayTimeView()Landroid/widget/TextView;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->i:Landroid/widget/TextView;

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->c:Lcom/huawei/openalliance/ad/views/interfaces/g;

    invoke-interface {v0}, Lcom/huawei/openalliance/ad/views/interfaces/g;->getTotalTimeView()Landroid/widget/TextView;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->h:Landroid/widget/TextView;

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->c:Lcom/huawei/openalliance/ad/views/interfaces/g;

    invoke-interface {v0}, Lcom/huawei/openalliance/ad/views/interfaces/g;->getBufferingView()Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->g:Landroid/view/View;

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->c:Lcom/huawei/openalliance/ad/views/interfaces/g;

    invoke-interface {v0}, Lcom/huawei/openalliance/ad/views/interfaces/g;->getControlPanelView()Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->k:Landroid/view/View;

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->c:Lcom/huawei/openalliance/ad/views/interfaces/g;

    invoke-interface {v0}, Lcom/huawei/openalliance/ad/views/interfaces/g;->getNonWifiAlertView()Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->l:Landroid/view/View;

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->l:Landroid/view/View;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->l:Landroid/view/View;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/view/View;->setClickable(Z)V

    :cond_1
    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->c:Lcom/huawei/openalliance/ad/views/interfaces/g;

    invoke-interface {v0}, Lcom/huawei/openalliance/ad/views/interfaces/g;->getPreviewView()Landroid/widget/ImageView;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->j:Landroid/widget/ImageView;

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->c:Lcom/huawei/openalliance/ad/views/interfaces/g;

    invoke-direct {p0, v0}, Lcom/huawei/openalliance/ad/views/i;->f(Lcom/huawei/openalliance/ad/views/interfaces/g;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->c:Lcom/huawei/openalliance/ad/views/interfaces/g;

    invoke-direct {p0, v0}, Lcom/huawei/openalliance/ad/views/i;->e(Lcom/huawei/openalliance/ad/views/interfaces/g;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->c:Lcom/huawei/openalliance/ad/views/interfaces/g;

    invoke-direct {p0, v0}, Lcom/huawei/openalliance/ad/views/i;->d(Lcom/huawei/openalliance/ad/views/interfaces/g;)V

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/i;->n()V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->c:Lcom/huawei/openalliance/ad/views/interfaces/g;

    invoke-direct {p0, v0}, Lcom/huawei/openalliance/ad/views/i;->c(Lcom/huawei/openalliance/ad/views/interfaces/g;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->c:Lcom/huawei/openalliance/ad/views/interfaces/g;

    invoke-direct {p0, v0}, Lcom/huawei/openalliance/ad/views/i;->b(Lcom/huawei/openalliance/ad/views/interfaces/g;)V

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/i;->l()V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/huawei/openalliance/ad/views/i;->g(Z)V

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/views/i;->d()V

    return-void
.end method

.method private h(Z)V
    .locals 2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->b:Lcom/huawei/openalliance/ad/views/VideoView;

    if-nez v0, :cond_0

    return-void

    :cond_0
    if-nez p1, :cond_1

    iget v0, p0, Lcom/huawei/openalliance/ad/views/i;->w:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    :cond_1
    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/i;->s()V

    goto :goto_0

    :cond_2
    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/i;->t()V

    :goto_0
    return-void
.end method

.method private i()V
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->o:Ljava/lang/String;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/aj;->a(Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/i;->l()V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->b:Lcom/huawei/openalliance/ad/views/VideoView;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->b:Lcom/huawei/openalliance/ad/views/VideoView;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/views/VideoView;->getCurrentState()Lcom/huawei/openalliance/ad/media/MediaState;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/media/MediaState;->a()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/i;->j()V

    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/openalliance/ad/views/i;->a(Z)V

    return-void
.end method

.method private i(Z)V
    .locals 2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->v:Lcom/huawei/openalliance/ad/views/i$a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->b:Lcom/huawei/openalliance/ad/views/VideoView;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->v:Lcom/huawei/openalliance/ad/views/i$a;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/views/i;->b:Lcom/huawei/openalliance/ad/views/VideoView;

    invoke-virtual {v1}, Lcom/huawei/openalliance/ad/views/VideoView;->getCurrentState()Lcom/huawei/openalliance/ad/media/MediaState;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/openalliance/ad/media/MediaState;->getStateCode()I

    move-result v1

    invoke-interface {v0, p1, v1}, Lcom/huawei/openalliance/ad/views/i$a;->a(ZI)V

    :cond_0
    return-void
.end method

.method private j()V
    .locals 3

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->j:Landroid/widget/ImageView;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    return-void

    :cond_0
    invoke-static {}, Lcom/huawei/openalliance/ad/g/c;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, Lcom/huawei/openalliance/ad/views/i;->a:Ljava/lang/String;

    const-string v1, "showPreviewView"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->j:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getAnimation()Landroid/view/animation/Animation;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Landroid/view/animation/Animation;->cancel()V

    :cond_2
    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->j:Landroid/widget/ImageView;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/utils/ag;->a(Landroid/view/View;Z)Z

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->b:Lcom/huawei/openalliance/ad/views/VideoView;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->b:Lcom/huawei/openalliance/ad/views/VideoView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/views/VideoView;->setAlpha(F)V

    :cond_3
    return-void
.end method

.method private j(Z)V
    .locals 2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->v:Lcom/huawei/openalliance/ad/views/i$a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->b:Lcom/huawei/openalliance/ad/views/VideoView;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->v:Lcom/huawei/openalliance/ad/views/i$a;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/views/i;->b:Lcom/huawei/openalliance/ad/views/VideoView;

    invoke-virtual {v1}, Lcom/huawei/openalliance/ad/views/VideoView;->getCurrentState()Lcom/huawei/openalliance/ad/media/MediaState;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/openalliance/ad/media/MediaState;->getStateCode()I

    move-result v1

    invoke-interface {v0, p1, v1}, Lcom/huawei/openalliance/ad/views/i$a;->b(ZI)V

    :cond_0
    return-void
.end method

.method private k()V
    .locals 4

    invoke-static {}, Lcom/huawei/openalliance/ad/g/c;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/huawei/openalliance/ad/views/i;->a:Ljava/lang/String;

    const-string v1, "hidePreviewView"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->j:Landroid/widget/ImageView;

    const/16 v1, 0x8

    const/16 v2, 0x12c

    const/16 v3, 0x12c

    invoke-static {v0, v1, v2, v3}, Lcom/huawei/openalliance/ad/utils/ag;->a(Landroid/view/View;III)Z

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->j:Landroid/widget/ImageView;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->b:Lcom/huawei/openalliance/ad/views/VideoView;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->b:Lcom/huawei/openalliance/ad/views/VideoView;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/views/VideoView;->setAlpha(F)V

    :cond_1
    return-void
.end method

.method private k(Z)V
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->v:Lcom/huawei/openalliance/ad/views/i$a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->v:Lcom/huawei/openalliance/ad/views/i$a;

    invoke-interface {v0, p1}, Lcom/huawei/openalliance/ad/views/i$a;->a(Z)V

    :cond_0
    return-void
.end method

.method private l()V
    .locals 2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->l:Landroid/view/View;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->l:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    :cond_0
    return-void
.end method

.method private m()V
    .locals 2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->l:Landroid/view/View;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->l:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    :cond_0
    return-void
.end method

.method private n()V
    .locals 2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->b:Lcom/huawei/openalliance/ad/views/VideoView;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->b:Lcom/huawei/openalliance/ad/views/VideoView;

    invoke-virtual {v0, p0}, Lcom/huawei/openalliance/ad/views/VideoView;->addMediaStateListener(Lcom/huawei/openalliance/ad/media/listener/MediaStateListener;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->b:Lcom/huawei/openalliance/ad/views/VideoView;

    invoke-virtual {v0, p0}, Lcom/huawei/openalliance/ad/views/VideoView;->addMediaBufferListener(Lcom/huawei/openalliance/ad/media/listener/MediaBufferListener;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->b:Lcom/huawei/openalliance/ad/views/VideoView;

    invoke-virtual {v0, p0}, Lcom/huawei/openalliance/ad/views/VideoView;->addMediaErrorListener(Lcom/huawei/openalliance/ad/media/listener/MediaErrorListener;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->b:Lcom/huawei/openalliance/ad/views/VideoView;

    invoke-virtual {v0, p0}, Lcom/huawei/openalliance/ad/views/VideoView;->addNetworkChangeListener(Lcom/huawei/openalliance/ad/views/VideoView$NetworkChangeListener;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->b:Lcom/huawei/openalliance/ad/views/VideoView;

    invoke-virtual {v0, p0}, Lcom/huawei/openalliance/ad/views/VideoView;->setSurfaceListener(Lcom/huawei/openalliance/ad/views/VideoView$SurfaceListener;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->b:Lcom/huawei/openalliance/ad/views/VideoView;

    new-instance v1, Lcom/huawei/openalliance/ad/views/i$4;

    invoke-direct {v1, p0}, Lcom/huawei/openalliance/ad/views/i$4;-><init>(Lcom/huawei/openalliance/ad/views/i;)V

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/views/VideoView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_0
    return-void
.end method

.method private o()V
    .locals 3

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->b:Lcom/huawei/openalliance/ad/views/VideoView;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->o:Ljava/lang/String;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/aj;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->b:Lcom/huawei/openalliance/ad/views/VideoView;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/views/VideoView;->isPlaying()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->n:Ljava/lang/String;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/aj;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->b:Lcom/huawei/openalliance/ad/views/VideoView;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/views/VideoView;->pause()V

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/huawei/openalliance/ad/views/i;->k(Z)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->b:Lcom/huawei/openalliance/ad/views/VideoView;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/views/VideoView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/w;->d(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->b:Lcom/huawei/openalliance/ad/views/VideoView;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/views/VideoView;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/openalliance/ad/R$string;->hiad_network_no_available:I

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    return-void

    :cond_2
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/huawei/openalliance/ad/views/i;->k(Z)V

    iget v0, p0, Lcom/huawei/openalliance/ad/views/i;->w:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_3

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->b:Lcom/huawei/openalliance/ad/views/VideoView;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/views/VideoView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/w;->b(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_3

    sget-object v0, Lcom/huawei/openalliance/ad/views/i;->a:Ljava/lang/String;

    const-string v1, "in non wifi, show alert view"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->b:Lcom/huawei/openalliance/ad/views/VideoView;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/views/VideoView;->pause()V

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/i;->m()V

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/i;->q()V

    goto :goto_0

    :cond_3
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/openalliance/ad/views/i;->a(Z)V

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/i;->r()V

    :goto_0
    return-void
.end method

.method private p()V
    .locals 2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->b:Lcom/huawei/openalliance/ad/views/VideoView;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->k:Landroid/view/View;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->k:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->b:Lcom/huawei/openalliance/ad/views/VideoView;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/views/VideoView;->isPlaying()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1}, Lcom/huawei/openalliance/ad/views/i;->a(ZZ)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->b:Lcom/huawei/openalliance/ad/views/VideoView;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/views/VideoView;->getCurrentState()Lcom/huawei/openalliance/ad/media/MediaState;

    move-result-object v0

    sget-object v1, Lcom/huawei/openalliance/ad/media/MediaState$State;->PAUSED:Lcom/huawei/openalliance/ad/media/MediaState$State;

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/media/MediaState;->isNotState(Lcom/huawei/openalliance/ad/media/MediaState$State;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->u:Landroid/view/View$OnClickListener;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->u:Landroid/view/View$OnClickListener;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/views/i;->b:Lcom/huawei/openalliance/ad/views/VideoView;

    invoke-interface {v0, v1}, Landroid/view/View$OnClickListener;->onClick(Landroid/view/View;)V

    goto :goto_0

    :cond_1
    const/4 v0, 0x1

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1}, Lcom/huawei/openalliance/ad/views/i;->a(ZZ)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->b:Lcom/huawei/openalliance/ad/views/VideoView;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/views/VideoView;->isPlaying()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/i;->r()V

    :cond_2
    :goto_0
    return-void
.end method

.method private q()V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lcom/huawei/openalliance/ad/views/i;->a(ZZ)V

    return-void
.end method

.method private r()V
    .locals 4

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->n:Ljava/lang/String;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/aj;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->y:Ljava/lang/Runnable;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/views/i;->n:Ljava/lang/String;

    const-wide/16 v2, 0xbb8

    invoke-static {v0, v1, v2, v3}, Lcom/huawei/openalliance/ad/utils/aj;->a(Ljava/lang/Runnable;Ljava/lang/String;J)V

    return-void
.end method

.method private s()V
    .locals 2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->b:Lcom/huawei/openalliance/ad/views/VideoView;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/i;->l()V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->b:Lcom/huawei/openalliance/ad/views/VideoView;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/views/VideoView;->getCurrentState()Lcom/huawei/openalliance/ad/media/MediaState;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/openalliance/ad/media/MediaState;->a()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/i;->j()V

    :cond_1
    iget-boolean v0, p0, Lcom/huawei/openalliance/ad/views/i;->q:Z

    if-eqz v0, :cond_2

    iget-boolean v0, p0, Lcom/huawei/openalliance/ad/views/i;->t:Z

    if-nez v0, :cond_2

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/openalliance/ad/views/i;->a(Z)V

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->b:Lcom/huawei/openalliance/ad/views/VideoView;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/views/VideoView;->isPlaying()Z

    move-result v0

    if-nez v0, :cond_3

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/views/i;->d()V

    :cond_3
    :goto_0
    return-void
.end method

.method private t()V
    .locals 2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->b:Lcom/huawei/openalliance/ad/views/VideoView;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->b:Lcom/huawei/openalliance/ad/views/VideoView;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/views/VideoView;->getCurrentState()Lcom/huawei/openalliance/ad/media/MediaState;

    move-result-object v0

    sget-object v1, Lcom/huawei/openalliance/ad/media/MediaState$State;->PREPARING:Lcom/huawei/openalliance/ad/media/MediaState$State;

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/media/MediaState;->isState(Lcom/huawei/openalliance/ad/media/MediaState$State;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->b:Lcom/huawei/openalliance/ad/views/VideoView;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/views/VideoView;->isPlaying()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    iget v0, p0, Lcom/huawei/openalliance/ad/views/i;->w:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->b:Lcom/huawei/openalliance/ad/views/VideoView;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/views/VideoView;->stop()V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->l:Landroid/view/View;

    if-eqz v0, :cond_1

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/i;->m()V

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/i;->q()V

    :cond_1
    return-void
.end method

.method private u()V
    .locals 2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->b:Lcom/huawei/openalliance/ad/views/VideoView;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->b:Lcom/huawei/openalliance/ad/views/VideoView;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/views/VideoView;->getCurrentState()Lcom/huawei/openalliance/ad/media/MediaState;

    move-result-object v0

    sget-object v1, Lcom/huawei/openalliance/ad/media/MediaState$State;->PREPARING:Lcom/huawei/openalliance/ad/media/MediaState$State;

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/media/MediaState;->isState(Lcom/huawei/openalliance/ad/media/MediaState$State;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->b:Lcom/huawei/openalliance/ad/views/VideoView;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/views/VideoView;->isPlaying()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->b:Lcom/huawei/openalliance/ad/views/VideoView;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/views/VideoView;->pause()V

    :cond_1
    return-void
.end method

.method private v()V
    .locals 2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->v:Lcom/huawei/openalliance/ad/views/i$a;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->b:Lcom/huawei/openalliance/ad/views/VideoView;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->b:Lcom/huawei/openalliance/ad/views/VideoView;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/views/VideoView;->getMediaPlayerAgent()Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->v:Lcom/huawei/openalliance/ad/views/i$a;

    invoke-interface {v0, v1}, Lcom/huawei/openalliance/ad/views/i$a;->a(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;)V

    :cond_1
    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->o:Ljava/lang/String;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/aj;->a(Ljava/lang/String;)V

    return-void
.end method

.method public a(I)V
    .locals 2

    iput p1, p0, Lcom/huawei/openalliance/ad/views/i;->s:I

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->b:Lcom/huawei/openalliance/ad/views/VideoView;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->b:Lcom/huawei/openalliance/ad/views/VideoView;

    invoke-virtual {v0, p1}, Lcom/huawei/openalliance/ad/views/VideoView;->setPreferStartPlayTime(I)V

    :cond_0
    return-void
.end method

.method public a(J)V
    .locals 5

    sget-object v0, Lcom/huawei/openalliance/ad/views/i;->a:Ljava/lang/String;

    const-string v1, "autoPlay - delayMs: %d"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v0, v1, v2}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->o:Ljava/lang/String;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/aj;->a(Ljava/lang/String;)V

    iget-boolean v0, p0, Lcom/huawei/openalliance/ad/views/i;->q:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->b:Lcom/huawei/openalliance/ad/views/VideoView;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/views/VideoView;->isPlaying()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/huawei/openalliance/ad/views/i;->a:Ljava/lang/String;

    const-string v1, "autoPlay - video is playing"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/openalliance/ad/views/i;->a(Z)V

    goto :goto_0

    :cond_0
    sget-object v0, Lcom/huawei/openalliance/ad/views/i;->a:Ljava/lang/String;

    const-string v1, "autoPlay - start delay runnable"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->x:Ljava/lang/Runnable;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/views/i;->o:Ljava/lang/String;

    invoke-static {v0, v1, p1, p2}, Lcom/huawei/openalliance/ad/utils/aj;->a(Ljava/lang/Runnable;Ljava/lang/String;J)V

    :cond_1
    :goto_0
    return-void
.end method

.method public a(Landroid/graphics/Bitmap;)V
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->j:Landroid/widget/ImageView;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->j:Landroid/widget/ImageView;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    :cond_0
    return-void
.end method

.method public a(Landroid/view/View$OnClickListener;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/views/i;->u:Landroid/view/View$OnClickListener;

    return-void
.end method

.method public a(Lcom/huawei/openalliance/ad/views/i$a;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/views/i;->v:Lcom/huawei/openalliance/ad/views/i$a;

    return-void
.end method

.method public a(Lcom/huawei/openalliance/ad/views/interfaces/g;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/views/i;->c:Lcom/huawei/openalliance/ad/views/interfaces/g;

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/i;->h()V

    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 3

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->c:Lcom/huawei/openalliance/ad/views/interfaces/g;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->b:Lcom/huawei/openalliance/ad/views/VideoView;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    :cond_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->b:Lcom/huawei/openalliance/ad/views/VideoView;

    invoke-virtual {v0, p1}, Lcom/huawei/openalliance/ad/views/VideoView;->setVideoFileUrl(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->c:Lcom/huawei/openalliance/ad/views/interfaces/g;

    invoke-interface {v0}, Lcom/huawei/openalliance/ad/views/interfaces/g;->getSeekBar()Landroid/widget/SeekBar;

    move-result-object v2

    if-eqz v2, :cond_2

    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Landroid/widget/SeekBar;->setProgress(I)V

    :cond_2
    return-void
.end method

.method public a(Z)V
    .locals 2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->b:Lcom/huawei/openalliance/ad/views/VideoView;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->b:Lcom/huawei/openalliance/ad/views/VideoView;

    iget v1, p0, Lcom/huawei/openalliance/ad/views/i;->s:I

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/views/VideoView;->setPreferStartPlayTime(I)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->b:Lcom/huawei/openalliance/ad/views/VideoView;

    invoke-virtual {v0, p1}, Lcom/huawei/openalliance/ad/views/VideoView;->play(Z)V

    :cond_0
    return-void
.end method

.method public b()V
    .locals 2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->b:Lcom/huawei/openalliance/ad/views/VideoView;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->b:Lcom/huawei/openalliance/ad/views/VideoView;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/views/VideoView;->stop()V

    :cond_0
    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/i;->l()V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/huawei/openalliance/ad/views/i;->g(Z)V

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/views/i;->d()V

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/i;->j()V

    return-void
.end method

.method public b(I)V
    .locals 3

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->b:Lcom/huawei/openalliance/ad/views/VideoView;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->b:Lcom/huawei/openalliance/ad/views/VideoView;

    invoke-virtual {v0, p1}, Lcom/huawei/openalliance/ad/views/VideoView;->setDefaultDuration(I)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->h:Landroid/widget/TextView;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->h:Landroid/widget/TextView;

    int-to-long v1, p1

    invoke-static {v1, v2}, Lcom/huawei/openalliance/ad/utils/ai;->a(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    return-void
.end method

.method public b(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/huawei/openalliance/ad/views/i;->q:Z

    return-void
.end method

.method public c()V
    .locals 3

    sget-object v0, Lcom/huawei/openalliance/ad/views/i;->a:Ljava/lang/String;

    const-string v1, "autoPlayByNetworkState"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->b:Lcom/huawei/openalliance/ad/views/VideoView;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->b:Lcom/huawei/openalliance/ad/views/VideoView;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/views/VideoView;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Lcom/huawei/openalliance/ad/utils/w;->d(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->b:Lcom/huawei/openalliance/ad/views/VideoView;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/views/VideoView;->pause()V

    return-void

    :cond_1
    iget v0, p0, Lcom/huawei/openalliance/ad/views/i;->w:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    invoke-static {v2}, Lcom/huawei/openalliance/ad/utils/w;->b(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_3

    :cond_2
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/openalliance/ad/views/i;->a(Z)V

    goto :goto_0

    :cond_3
    sget-object v0, Lcom/huawei/openalliance/ad/views/i;->a:Ljava/lang/String;

    const-string v1, "autoPlayByNetworkState - in non wifi, show alert view"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->b:Lcom/huawei/openalliance/ad/views/VideoView;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/views/VideoView;->pause()V

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/i;->m()V

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/i;->q()V

    :goto_0
    return-void
.end method

.method public c(I)V
    .locals 0

    iput p1, p0, Lcom/huawei/openalliance/ad/views/i;->w:I

    return-void
.end method

.method public c(Z)V
    .locals 3

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->b:Lcom/huawei/openalliance/ad/views/VideoView;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->c:Lcom/huawei/openalliance/ad/views/interfaces/g;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    :cond_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->c:Lcom/huawei/openalliance/ad/views/interfaces/g;

    invoke-interface {v0}, Lcom/huawei/openalliance/ad/views/interfaces/g;->getSoundToggleView()Landroid/widget/CompoundButton;

    move-result-object v2

    const/4 v0, 0x0

    if-eq v0, v2, :cond_3

    if-nez p1, :cond_2

    const/4 v0, 0x1

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {v2, v0}, Landroid/widget/CompoundButton;->setChecked(Z)V

    :cond_3
    if-eqz p1, :cond_4

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->b:Lcom/huawei/openalliance/ad/views/VideoView;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/views/VideoView;->mute()V

    goto :goto_1

    :cond_4
    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->b:Lcom/huawei/openalliance/ad/views/VideoView;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/views/VideoView;->unmute()V

    :goto_1
    return-void
.end method

.method public d()V
    .locals 2

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lcom/huawei/openalliance/ad/views/i;->a(ZZ)V

    return-void
.end method

.method public d(Z)V
    .locals 5

    invoke-static {}, Lcom/huawei/openalliance/ad/g/c;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/huawei/openalliance/ad/views/i;->a:Ljava/lang/String;

    const-string v1, "setPlayButtonEnabled: %s"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v0, v1, v2}, Lcom/huawei/openalliance/ad/g/c;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->d:Landroid/widget/ImageView;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->d:Landroid/widget/ImageView;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setEnabled(Z)V

    :cond_1
    return-void
.end method

.method public e()V
    .locals 2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->b:Lcom/huawei/openalliance/ad/views/VideoView;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->b:Lcom/huawei/openalliance/ad/views/VideoView;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/views/VideoView;->pause()V

    :cond_0
    return-void
.end method

.method public e(Z)V
    .locals 1

    if-eqz p1, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/openalliance/ad/views/i;->a(Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/openalliance/ad/views/i;->a(I)V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/openalliance/ad/views/i;->b(I)V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/openalliance/ad/views/i;->a(Landroid/graphics/Bitmap;)V

    :cond_0
    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/i;->j()V

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/views/i;->d()V

    return-void
.end method

.method public f()V
    .locals 2

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/views/i;->t:Z

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->b:Lcom/huawei/openalliance/ad/views/VideoView;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->b:Lcom/huawei/openalliance/ad/views/VideoView;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/views/VideoView;->pauseView()V

    :cond_0
    return-void
.end method

.method public g()V
    .locals 2

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/views/i;->t:Z

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->b:Lcom/huawei/openalliance/ad/views/VideoView;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->b:Lcom/huawei/openalliance/ad/views/VideoView;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/views/VideoView;->resumeView()V

    :cond_0
    return-void
.end method

.method public onBufferUpdate(I)V
    .locals 2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->e:Landroid/widget/SeekBar;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->e:Landroid/widget/SeekBar;

    invoke-virtual {v0, p1}, Landroid/widget/SeekBar;->setSecondaryProgress(I)V

    :cond_0
    return-void
.end method

.method public onBufferingEnd()V
    .locals 2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->g:Landroid/view/View;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->g:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->g:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    :cond_0
    return-void
.end method

.method public onBufferingStart()V
    .locals 2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->g:Landroid/view/View;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->g:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->g:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    :cond_0
    return-void
.end method

.method public onError(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;III)V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-direct {p0, p2, v0, v1}, Lcom/huawei/openalliance/ad/views/i;->a(IZZ)V

    return-void
.end method

.method public onMediaCompletion(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;I)V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p0, p2, v0, v1}, Lcom/huawei/openalliance/ad/views/i;->a(IZZ)V

    return-void
.end method

.method public onMediaPause(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;I)V
    .locals 2

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-direct {p0, p2, v0, v1}, Lcom/huawei/openalliance/ad/views/i;->a(IZZ)V

    return-void
.end method

.method public onMediaStart(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;I)V
    .locals 2

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/huawei/openalliance/ad/views/i;->k(Z)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->d:Landroid/widget/ImageView;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->c:Lcom/huawei/openalliance/ad/views/interfaces/g;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->c:Lcom/huawei/openalliance/ad/views/interfaces/g;

    invoke-interface {v0}, Lcom/huawei/openalliance/ad/views/interfaces/g;->getPauseIconResouceId()I

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->d:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/views/i;->c:Lcom/huawei/openalliance/ad/views/interfaces/g;

    invoke-interface {v1}, Lcom/huawei/openalliance/ad/views/interfaces/g;->getPauseIconResouceId()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    :cond_0
    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/i;->k()V

    iget-boolean v0, p0, Lcom/huawei/openalliance/ad/views/i;->r:Z

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lcom/huawei/openalliance/ad/views/i;->a(ZZ)V

    goto :goto_0

    :cond_1
    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/i;->r()V

    :goto_0
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/huawei/openalliance/ad/views/i;->g(Z)V

    return-void
.end method

.method public onMediaStop(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;I)V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-direct {p0, p2, v0, v1}, Lcom/huawei/openalliance/ad/views/i;->a(IZZ)V

    return-void
.end method

.method public onNetworkConnectedOrChanged(Z)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/huawei/openalliance/ad/views/i;->h(Z)V

    return-void
.end method

.method public onNetworkDisconnected()V
    .locals 0

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/i;->u()V

    return-void
.end method

.method public onProgress(II)V
    .locals 3

    iget-boolean v0, p0, Lcom/huawei/openalliance/ad/views/i;->p:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->e:Landroid/widget/SeekBar;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->e:Landroid/widget/SeekBar;

    invoke-virtual {v0, p1}, Landroid/widget/SeekBar;->setProgress(I)V

    :cond_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->i:Landroid/widget/TextView;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->i:Landroid/widget/TextView;

    int-to-long v1, p2

    invoke-static {v1, v2}, Lcom/huawei/openalliance/ad/utils/ai;->a(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_1
    return-void
.end method

.method public onProgressChanged(Landroid/widget/SeekBar;IZ)V
    .locals 2

    if-eqz p3, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->b:Lcom/huawei/openalliance/ad/views/VideoView;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->b:Lcom/huawei/openalliance/ad/views/VideoView;

    invoke-virtual {v0, p2}, Lcom/huawei/openalliance/ad/views/VideoView;->seekTo(I)V

    :cond_0
    return-void
.end method

.method public onStartTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/views/i;->p:Z

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/i;->n:Ljava/lang/String;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/aj;->a(Ljava/lang/String;)V

    return-void
.end method

.method public onStopTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/views/i;->p:Z

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/i;->r()V

    return-void
.end method

.method public onSurfaceDestroyed()V
    .locals 1

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/views/i;->j()V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/huawei/openalliance/ad/views/i;->g(Z)V

    return-void
.end method
