.class Lcom/huawei/openalliance/ad/views/a/c$7;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/openalliance/ad/views/a/c;->b(Lcom/huawei/openalliance/ad/views/a/b;)V
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

    iput-object p1, p0, Lcom/huawei/openalliance/ad/views/a/c$7;->a:Lcom/huawei/openalliance/ad/views/a/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/a/c$7;->a:Lcom/huawei/openalliance/ad/views/a/c;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/views/a/c;->m(Lcom/huawei/openalliance/ad/views/a/c;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/a/c$7;->a:Lcom/huawei/openalliance/ad/views/a/c;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/views/a/c;->invalidate()V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/views/a/c$7;->a:Lcom/huawei/openalliance/ad/views/a/c;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/views/a/c;->c(Lcom/huawei/openalliance/ad/views/a/c;)V

    return-void
.end method
