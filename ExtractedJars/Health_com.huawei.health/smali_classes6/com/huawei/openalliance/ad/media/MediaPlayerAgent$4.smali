.class Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$4;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Ljava/util/concurrent/Callable<Ljava/lang/Boolean;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;


# direct methods
.method constructor <init>(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$4;->a:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$4;->a:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->m(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public synthetic call()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$4;->a()Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
