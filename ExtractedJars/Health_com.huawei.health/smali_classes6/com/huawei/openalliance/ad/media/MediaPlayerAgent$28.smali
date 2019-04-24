.class Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$28;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/media/AudioManager$OnAudioFocusChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;


# direct methods
.method constructor <init>(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$28;->a:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private a()V
    .locals 6

    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$28;->a:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->isPlaying()Z

    move-result v5

    const-string v0, "MediaPlayerAgent"

    const-string v1, "handleAudioFocusLoss isPlaying: %s"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v0, v1, v2}, Lcom/huawei/openalliance/ad/g/c;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    if-eqz v5, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$28;->a:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->pause()V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$28;->a:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->b(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;Z)Z

    :cond_0
    return-void
.end method

.method static synthetic a(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$28;)V
    .locals 0

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$28;->c()V

    return-void
.end method

.method private b()V
    .locals 2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$28;->a:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->E(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$28;->a:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->n(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$28;->a:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->c(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;Z)Z

    :cond_0
    return-void
.end method

.method static synthetic b(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$28;)V
    .locals 0

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$28;->a()V

    return-void
.end method

.method private c()V
    .locals 2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$28;->a:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->D(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;)I

    move-result v0

    const/4 v1, -0x2

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$28;->a:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->D(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;)I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_1

    :cond_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$28;->a:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->F(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$28;->a:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->i(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$28;->a:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->b(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;Z)Z

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$28;->a:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->D(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;)I

    move-result v0

    const/4 v1, -0x3

    if-ne v0, v1, :cond_2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$28;->a:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->G(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$28;->a:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->o(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;)V

    :cond_2
    :goto_0
    return-void
.end method

.method static synthetic c(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$28;)V
    .locals 0

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$28;->b()V

    return-void
.end method


# virtual methods
.method public onAudioFocusChange(I)V
    .locals 2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$28;->a:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

    new-instance v1, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$28$1;

    invoke-direct {v1, p0, p1}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$28$1;-><init>(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$28;I)V

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->a(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;Ljava/lang/Runnable;)V

    return-void
.end method
