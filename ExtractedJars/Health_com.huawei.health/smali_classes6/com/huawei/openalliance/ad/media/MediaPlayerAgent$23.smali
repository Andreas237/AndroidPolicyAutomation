.class Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$23;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/media/MediaPlayer$OnPreparedListener;


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

    iput-object p1, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$23;->a:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onPrepared(Landroid/media/MediaPlayer;)V
    .locals 6

    const-string v0, "MediaPlayerAgent"

    const-string v1, "onPrepared"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$23;->a:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->a(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;Z)Z

    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$23;->a:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->a(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;)Lcom/huawei/openalliance/ad/media/MediaState;

    move-result-object v0

    sget-object v1, Lcom/huawei/openalliance/ad/media/MediaState$State;->PREPARING:Lcom/huawei/openalliance/ad/media/MediaState$State;

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/media/MediaState;->isNotState(Lcom/huawei/openalliance/ad/media/MediaState$State;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$23;->a:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->a(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;)Lcom/huawei/openalliance/ad/media/MediaState;

    move-result-object v0

    sget-object v1, Lcom/huawei/openalliance/ad/media/MediaState$State;->PREPARED:Lcom/huawei/openalliance/ad/media/MediaState$State;

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/media/MediaState;->a(Lcom/huawei/openalliance/ad/media/MediaState$State;)V

    return-void

    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$23;->a:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->f(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;)Landroid/media/MediaPlayer$OnInfoListener;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/media/MediaPlayer;->setOnInfoListener(Landroid/media/MediaPlayer$OnInfoListener;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$23;->a:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->a(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;)Lcom/huawei/openalliance/ad/media/MediaState;

    move-result-object v0

    sget-object v1, Lcom/huawei/openalliance/ad/media/MediaState$State;->PREPARED:Lcom/huawei/openalliance/ad/media/MediaState$State;

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/media/MediaState;->a(Lcom/huawei/openalliance/ad/media/MediaState$State;)V

    invoke-virtual {p1}, Landroid/media/MediaPlayer;->start()V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$23;->a:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->g(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/media/MediaPlayer;->seekTo(I)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$23;->a:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->a(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;)Lcom/huawei/openalliance/ad/media/MediaState;

    move-result-object v0

    sget-object v1, Lcom/huawei/openalliance/ad/media/MediaState$State;->PLAYING:Lcom/huawei/openalliance/ad/media/MediaState$State;

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/media/MediaState;->a(Lcom/huawei/openalliance/ad/media/MediaState$State;)V

    invoke-static {}, Lcom/huawei/openalliance/ad/g/c;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "MediaPlayerAgent"

    const-string v1, "seek to prefer pos: %d"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$23;->a:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

    invoke-static {v3}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->g(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;)I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v0, v1, v2}, Lcom/huawei/openalliance/ad/g/c;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_1
    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$23;->a:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

    invoke-virtual {p1}, Landroid/media/MediaPlayer;->getCurrentPosition()I

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->d(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;I)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$23;->a:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$23;->a:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

    invoke-static {v1}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->b(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;)I

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->e(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;I)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$23;->a:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->h(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v5

    const-string v0, "MediaPlayerAgent"

    const-string v1, "onPrepared - IllegalStateException"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$23;->a:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->a(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;)Lcom/huawei/openalliance/ad/media/MediaState;

    move-result-object v0

    sget-object v1, Lcom/huawei/openalliance/ad/media/MediaState$State;->ERROR:Lcom/huawei/openalliance/ad/media/MediaState$State;

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/media/MediaState;->a(Lcom/huawei/openalliance/ad/media/MediaState$State;)V

    :goto_0
    return-void
.end method
