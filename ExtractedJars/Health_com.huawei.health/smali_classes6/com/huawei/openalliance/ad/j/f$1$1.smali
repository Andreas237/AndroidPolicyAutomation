.class Lcom/huawei/openalliance/ad/j/f$1$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/openalliance/ad/j/f$1;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Z

.field final synthetic b:Lcom/huawei/openalliance/ad/j/f$1;


# direct methods
.method constructor <init>(Lcom/huawei/openalliance/ad/j/f$1;Z)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/j/f$1$1;->b:Lcom/huawei/openalliance/ad/j/f$1;

    iput-boolean p2, p0, Lcom/huawei/openalliance/ad/j/f$1$1;->a:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lcom/huawei/openalliance/ad/j/f$1$1;->b:Lcom/huawei/openalliance/ad/j/f$1;

    iget-object v0, v0, Lcom/huawei/openalliance/ad/j/f$1;->b:Lcom/huawei/openalliance/ad/j/f;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/j/f;->a()Lcom/huawei/openalliance/ad/i/b;

    move-result-object v0

    check-cast v0, Lcom/huawei/openalliance/ad/views/interfaces/INativeVideoView;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/j/f$1$1;->b:Lcom/huawei/openalliance/ad/j/f$1;

    iget-object v1, v1, Lcom/huawei/openalliance/ad/j/f$1;->a:Lcom/huawei/openalliance/ad/inter/data/VideoInfo;

    iget-boolean v2, p0, Lcom/huawei/openalliance/ad/j/f$1$1;->a:Z

    invoke-interface {v0, v1, v2}, Lcom/huawei/openalliance/ad/views/interfaces/INativeVideoView;->onCheckVideoHashResult(Lcom/huawei/openalliance/ad/inter/data/VideoInfo;Z)V

    return-void
.end method
