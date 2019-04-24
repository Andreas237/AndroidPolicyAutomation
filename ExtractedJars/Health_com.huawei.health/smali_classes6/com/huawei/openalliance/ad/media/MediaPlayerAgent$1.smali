.class Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$1;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/media/MediaPlayer$OnCompletionListener;


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

    iput-object p1, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$1;->a:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCompletion(Landroid/media/MediaPlayer;)V
    .locals 5

    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$1;->a:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->a(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;)Lcom/huawei/openalliance/ad/media/MediaState;

    move-result-object v0

    sget-object v1, Lcom/huawei/openalliance/ad/media/MediaState$State;->ERROR:Lcom/huawei/openalliance/ad/media/MediaState$State;

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/media/MediaState;->isState(Lcom/huawei/openalliance/ad/media/MediaState$State;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$1;->a:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->a(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;)Lcom/huawei/openalliance/ad/media/MediaState;

    move-result-object v0

    sget-object v1, Lcom/huawei/openalliance/ad/media/MediaState$State;->PLAYBACK_COMPLETED:Lcom/huawei/openalliance/ad/media/MediaState$State;

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/media/MediaState;->isState(Lcom/huawei/openalliance/ad/media/MediaState$State;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$1;->a:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->a(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;)Lcom/huawei/openalliance/ad/media/MediaState;

    move-result-object v0

    sget-object v1, Lcom/huawei/openalliance/ad/media/MediaState$State;->PLAYBACK_COMPLETED:Lcom/huawei/openalliance/ad/media/MediaState$State;

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/media/MediaState;->a(Lcom/huawei/openalliance/ad/media/MediaState$State;)V

    invoke-virtual {p1}, Landroid/media/MediaPlayer;->getCurrentPosition()I

    move-result v3

    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$1;->a:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->b(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;)I

    move-result v4

    const-string v0, "MediaPlayerAgent"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onCompletion "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " duration: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v3, v4}, Ljava/lang/Math;->max(II)I

    move-result v3

    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$1;->a:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

    const/16 v1, 0x64

    invoke-static {v0, v1, v3}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->a(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;II)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$1;->a:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

    invoke-static {v0, v3}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->a(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;I)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$1;->a:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->c(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$1;->a:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$1;->a:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

    invoke-static {v1}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->d(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->a(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$1;->a:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->b(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;I)I

    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$1;->a:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->c(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;I)I

    return-void
.end method
