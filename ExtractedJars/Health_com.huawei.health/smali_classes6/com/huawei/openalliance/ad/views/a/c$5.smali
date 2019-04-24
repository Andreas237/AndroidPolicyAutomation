.class Lcom/huawei/openalliance/ad/views/a/c$5;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/openalliance/ad/views/a/c;->i()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/openalliance/ad/views/a/c;


# direct methods
.method constructor <init>(Lcom/huawei/openalliance/ad/views/a/c;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/views/a/c$5;->a:Lcom/huawei/openalliance/ad/views/a/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/a/c$5;->a:Lcom/huawei/openalliance/ad/views/a/c;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/views/a/c;->g(Lcom/huawei/openalliance/ad/views/a/c;)I

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/a/c$5;->a:Lcom/huawei/openalliance/ad/views/a/c;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/views/a/c;->h(Lcom/huawei/openalliance/ad/views/a/c;)I

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/a/c$5;->a:Lcom/huawei/openalliance/ad/views/a/c;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/views/a/c;->i(Lcom/huawei/openalliance/ad/views/a/c;)I

    move-result v0

    iget-object v1, p0, Lcom/huawei/openalliance/ad/views/a/c$5;->a:Lcom/huawei/openalliance/ad/views/a/c;

    invoke-static {v1}, Lcom/huawei/openalliance/ad/views/a/c;->h(Lcom/huawei/openalliance/ad/views/a/c;)I

    move-result v1

    if-ge v0, v1, :cond_1

    :cond_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/a/c$5;->a:Lcom/huawei/openalliance/ad/views/a/c;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/views/a/c;->j(Lcom/huawei/openalliance/ad/views/a/c;)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/a/c$5;->a:Lcom/huawei/openalliance/ad/views/a/c;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/views/a/c;->b()V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/a/c$5;->a:Lcom/huawei/openalliance/ad/views/a/c;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/views/a/c;->k(Lcom/huawei/openalliance/ad/views/a/c;)V

    :goto_0
    return-void
.end method
