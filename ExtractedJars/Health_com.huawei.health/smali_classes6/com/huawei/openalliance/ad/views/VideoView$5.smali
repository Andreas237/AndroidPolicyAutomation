.class Lcom/huawei/openalliance/ad/views/VideoView$5;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/huawei/openalliance/ad/media/listener/MuteListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/openalliance/ad/views/VideoView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/openalliance/ad/views/VideoView;


# direct methods
.method constructor <init>(Lcom/huawei/openalliance/ad/views/VideoView;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/views/VideoView$5;->a:Lcom/huawei/openalliance/ad/views/VideoView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onMute()V
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/VideoView$5;->a:Lcom/huawei/openalliance/ad/views/VideoView;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/views/VideoView;->h(Lcom/huawei/openalliance/ad/views/VideoView;)V

    return-void
.end method

.method public onUnmute()V
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/VideoView$5;->a:Lcom/huawei/openalliance/ad/views/VideoView;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/views/VideoView;->i(Lcom/huawei/openalliance/ad/views/VideoView;)V

    return-void
.end method
