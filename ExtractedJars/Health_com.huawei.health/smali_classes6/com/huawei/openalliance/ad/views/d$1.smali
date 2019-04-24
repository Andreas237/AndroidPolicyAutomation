.class Lcom/huawei/openalliance/ad/views/d$1;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/huawei/openalliance/ad/views/a/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/openalliance/ad/views/d;->a(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/openalliance/ad/views/d;


# direct methods
.method constructor <init>(Lcom/huawei/openalliance/ad/views/d;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/views/d$1;->a:Lcom/huawei/openalliance/ad/views/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    const-string v0, "PPSGifView"

    const-string v1, "gif image show"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/d$1;->a:Lcom/huawei/openalliance/ad/views/d;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/views/d;->d()V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/d$1;->a:Lcom/huawei/openalliance/ad/views/d;

    iget-object v0, v0, Lcom/huawei/openalliance/ad/views/d;->a:Lcom/huawei/openalliance/ad/j/a/f;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/views/d$1;->a:Lcom/huawei/openalliance/ad/views/d;

    iget v1, v1, Lcom/huawei/openalliance/ad/views/d;->c:I

    invoke-interface {v0, v1}, Lcom/huawei/openalliance/ad/j/a/f;->a(I)V

    return-void
.end method

.method public b()V
    .locals 2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/d$1;->a:Lcom/huawei/openalliance/ad/views/d;

    const/4 v1, -0x3

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/views/d;->a(I)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/d$1;->a:Lcom/huawei/openalliance/ad/views/d;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/views/d;->a()V

    return-void
.end method

.method public c()V
    .locals 2

    const-string v0, "PPSGifView"

    const-string v1, "gif image end"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/d$1;->a:Lcom/huawei/openalliance/ad/views/d;

    iget-object v0, v0, Lcom/huawei/openalliance/ad/views/d;->a:Lcom/huawei/openalliance/ad/j/a/f;

    invoke-interface {v0}, Lcom/huawei/openalliance/ad/j/a/f;->b()V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/d$1;->a:Lcom/huawei/openalliance/ad/views/d;

    iget-object v0, v0, Lcom/huawei/openalliance/ad/views/d;->a:Lcom/huawei/openalliance/ad/j/a/f;

    invoke-interface {v0}, Lcom/huawei/openalliance/ad/j/a/f;->c()V

    return-void
.end method
