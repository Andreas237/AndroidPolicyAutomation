.class Lcom/huawei/openalliance/ad/views/i$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/openalliance/ad/views/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/openalliance/ad/views/i;


# direct methods
.method constructor <init>(Lcom/huawei/openalliance/ad/views/i;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/views/i$1;->a:Lcom/huawei/openalliance/ad/views/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/i$1;->a:Lcom/huawei/openalliance/ad/views/i;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/views/i;->a(Lcom/huawei/openalliance/ad/views/i;)Lcom/huawei/openalliance/ad/views/VideoView;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/i$1;->a:Lcom/huawei/openalliance/ad/views/i;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/views/i;->b(Lcom/huawei/openalliance/ad/views/i;)Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/i$1;->a:Lcom/huawei/openalliance/ad/views/i;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/views/i;->a(Z)V

    return-void
.end method
