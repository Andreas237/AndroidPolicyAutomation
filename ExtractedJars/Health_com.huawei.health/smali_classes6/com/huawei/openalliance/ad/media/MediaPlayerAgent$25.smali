.class Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$25;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


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

    iput-object p1, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$25;->a:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 8

    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$25;->a:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$25;->a:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

    invoke-static {v1}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->d(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->a(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$25;->a:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->a(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;)Lcom/huawei/openalliance/ad/media/MediaState;

    move-result-object v0

    sget-object v1, Lcom/huawei/openalliance/ad/media/MediaState$State;->PREPARING:Lcom/huawei/openalliance/ad/media/MediaState$State;

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/media/MediaState;->isNotState(Lcom/huawei/openalliance/ad/media/MediaState$State;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$25;->a:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->a(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;)Lcom/huawei/openalliance/ad/media/MediaState;

    move-result-object v0

    sget-object v1, Lcom/huawei/openalliance/ad/media/MediaState$State;->PLAYING:Lcom/huawei/openalliance/ad/media/MediaState$State;

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/media/MediaState;->isNotState(Lcom/huawei/openalliance/ad/media/MediaState$State;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$25;->a:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->a(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;)Lcom/huawei/openalliance/ad/media/MediaState;

    move-result-object v0

    sget-object v1, Lcom/huawei/openalliance/ad/media/MediaState$State;->PREPARED:Lcom/huawei/openalliance/ad/media/MediaState$State;

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/media/MediaState;->isNotState(Lcom/huawei/openalliance/ad/media/MediaState$State;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$25;->a:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->getCurrentPlayPosition()I

    move-result v5

    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$25;->a:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->p(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;)Ljava/util/concurrent/CopyOnWriteArraySet;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->size()I

    move-result v0

    if-lez v0, :cond_2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$25;->a:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->b(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;)I

    move-result v6

    if-lez v6, :cond_2

    int-to-float v0, v5

    const/high16 v1, 0x42c80000    # 100.0f

    mul-float/2addr v0, v1

    int-to-float v1, v6

    div-float/2addr v0, v1

    float-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-int v7, v0

    const/16 v0, 0x64

    if-le v7, v0, :cond_1

    const/16 v0, 0x64

    goto :goto_0

    :cond_1
    move v0, v7

    :goto_0
    move v7, v0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$25;->a:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

    invoke-static {v0, v7, v5}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->a(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;II)V

    if-ne v5, v6, :cond_2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$25;->a:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->u(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;)I

    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$25;->a:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->v(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;)I

    move-result v0

    const/4 v1, 0x2

    if-le v0, v1, :cond_2

    const-string v0, "MediaPlayerAgent"

    const-string v1, "reach end count exceeds"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$25;->a:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->x(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;)Landroid/media/MediaPlayer$OnCompletionListener;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$25;->a:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

    invoke-static {v1}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->w(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;)Landroid/media/MediaPlayer;

    move-result-object v1

    invoke-interface {v0, v1}, Landroid/media/MediaPlayer$OnCompletionListener;->onCompletion(Landroid/media/MediaPlayer;)V

    return-void

    :cond_2
    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$25;->a:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->y(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;)Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$25;->a:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->q(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;)Ljava/util/concurrent/CopyOnWriteArraySet;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->size()I

    move-result v0

    if-lez v0, :cond_4

    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$25;->a:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->v(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;)I

    move-result v0

    if-nez v0, :cond_4

    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$25;->a:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->z(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;)I

    move-result v0

    sub-int v0, v5, v0

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v6

    const/16 v0, 0x64

    if-ge v6, v0, :cond_3

    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$25;->a:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->e(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;)V

    goto :goto_1

    :cond_3
    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$25;->a:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->c(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$25;->a:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

    invoke-static {v0, v5}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->b(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;I)I

    :cond_4
    :goto_1
    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$25;->a:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$25;->a:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

    invoke-static {v1}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->A(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;)Ljava/lang/Runnable;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$25;->a:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

    invoke-static {v2}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->d(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;)Ljava/lang/String;

    move-result-object v2

    const-wide/16 v3, 0x1f4

    invoke-static {v0, v1, v2, v3, v4}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->a(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;Ljava/lang/Runnable;Ljava/lang/String;J)V

    return-void
.end method
