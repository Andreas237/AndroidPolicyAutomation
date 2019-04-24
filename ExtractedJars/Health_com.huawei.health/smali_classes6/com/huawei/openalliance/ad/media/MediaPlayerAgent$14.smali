.class Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$14;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->b(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic b:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;


# direct methods
.method constructor <init>(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;I)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$14;->b:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

    iput p2, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$14;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$14;->b:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->q(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;)Ljava/util/concurrent/CopyOnWriteArraySet;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/openalliance/ad/media/listener/MediaBufferListener;

    if-eqz v2, :cond_0

    iget v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$14;->a:I

    invoke-interface {v2, v0}, Lcom/huawei/openalliance/ad/media/listener/MediaBufferListener;->onBufferUpdate(I)V

    :cond_0
    goto :goto_0

    :cond_1
    return-void
.end method
