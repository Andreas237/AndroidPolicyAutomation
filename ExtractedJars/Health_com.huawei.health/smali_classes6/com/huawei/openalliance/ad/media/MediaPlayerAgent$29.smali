.class Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$29;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/media/MediaPlayer$OnErrorListener;


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

    iput-object p1, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$29;->a:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onError(Landroid/media/MediaPlayer;II)Z
    .locals 5

    const-string v0, "MediaPlayerAgent"

    const-string v1, "onError - what: %d extra: %d currentState: %s - agent: %s"

    const/4 v2, 0x4

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    iget-object v3, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$29;->a:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

    invoke-static {v3}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->a(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;)Lcom/huawei/openalliance/ad/media/MediaState;

    move-result-object v3

    const/4 v4, 0x2

    aput-object v3, v2, v4

    iget-object v3, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$29;->a:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

    const/4 v4, 0x3

    aput-object v3, v2, v4

    invoke-static {v0, v1, v2}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$29;->a:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->c(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$29;->a:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->a(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;)Lcom/huawei/openalliance/ad/media/MediaState;

    move-result-object v0

    sget-object v1, Lcom/huawei/openalliance/ad/media/MediaState$State;->PREPARING:Lcom/huawei/openalliance/ad/media/MediaState$State;

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/media/MediaState;->isNotState(Lcom/huawei/openalliance/ad/media/MediaState$State;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$29;->a:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->a(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;)Lcom/huawei/openalliance/ad/media/MediaState;

    move-result-object v0

    sget-object v1, Lcom/huawei/openalliance/ad/media/MediaState$State;->ERROR:Lcom/huawei/openalliance/ad/media/MediaState$State;

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/media/MediaState;->a(Lcom/huawei/openalliance/ad/media/MediaState$State;)V

    const/4 v0, 0x1

    return v0

    :cond_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$29;->a:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->a(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;)Lcom/huawei/openalliance/ad/media/MediaState;

    move-result-object v0

    sget-object v1, Lcom/huawei/openalliance/ad/media/MediaState$State;->ERROR:Lcom/huawei/openalliance/ad/media/MediaState$State;

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/media/MediaState;->a(Lcom/huawei/openalliance/ad/media/MediaState$State;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$29;->a:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

    invoke-virtual {p1}, Landroid/media/MediaPlayer;->getCurrentPosition()I

    move-result v1

    invoke-static {v0, v1, p2, p3}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->a(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;III)V

    const/4 v0, 0x1

    return v0
.end method
