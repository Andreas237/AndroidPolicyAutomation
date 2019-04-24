.class Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$30;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/media/MediaPlayer$OnBufferingUpdateListener;


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

    iput-object p1, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$30;->a:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onBufferingUpdate(Landroid/media/MediaPlayer;I)V
    .locals 2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$30;->a:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->a(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;)Lcom/huawei/openalliance/ad/media/MediaState;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/media/MediaState;->a()Z

    move-result v0

    if-eqz v0, :cond_2

    move v1, p2

    if-gez v1, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    move v1, v0

    const/16 v0, 0x64

    if-le v1, v0, :cond_1

    const/16 v0, 0x64

    goto :goto_1

    :cond_1
    move v0, v1

    :goto_1
    move v1, v0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$30;->a:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->f(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;I)V

    :cond_2
    return-void
.end method
