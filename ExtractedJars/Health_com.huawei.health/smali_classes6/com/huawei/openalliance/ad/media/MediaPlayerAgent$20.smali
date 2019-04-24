.class Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$20;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->a(III)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic b:I

.field final synthetic c:I

.field final synthetic d:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;


# direct methods
.method constructor <init>(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;III)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$20;->d:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

    iput p2, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$20;->a:I

    iput p3, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$20;->b:I

    iput p4, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$20;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$20;->d:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->r(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;)Ljava/util/concurrent/CopyOnWriteArraySet;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/openalliance/ad/media/listener/MediaErrorListener;

    if-eqz v5, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$20;->d:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

    iget v1, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$20;->a:I

    iget v2, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$20;->b:I

    iget v3, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$20;->c:I

    invoke-interface {v5, v0, v1, v2, v3}, Lcom/huawei/openalliance/ad/media/listener/MediaErrorListener;->onError(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;III)V

    :cond_0
    goto :goto_0

    :cond_1
    return-void
.end method
