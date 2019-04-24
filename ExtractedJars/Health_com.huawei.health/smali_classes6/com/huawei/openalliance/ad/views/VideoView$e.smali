.class Lcom/huawei/openalliance/ad/views/VideoView$e;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/huawei/openalliance/ad/media/listener/MuteListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/openalliance/ad/views/VideoView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "e"
.end annotation


# instance fields
.field private a:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/openalliance/ad/media/listener/MuteListener;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcom/huawei/openalliance/ad/media/listener/MuteListener;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/views/VideoView$e;->a:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method public onMute()V
    .locals 2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/VideoView$e;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/huawei/openalliance/ad/media/listener/MuteListener;

    if-eqz v1, :cond_0

    invoke-interface {v1}, Lcom/huawei/openalliance/ad/media/listener/MuteListener;->onMute()V

    :cond_0
    return-void
.end method

.method public onUnmute()V
    .locals 2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/VideoView$e;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/huawei/openalliance/ad/media/listener/MuteListener;

    if-eqz v1, :cond_0

    invoke-interface {v1}, Lcom/huawei/openalliance/ad/media/listener/MuteListener;->onUnmute()V

    :cond_0
    return-void
.end method
