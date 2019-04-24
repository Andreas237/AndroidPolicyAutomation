.class Lcom/huawei/openalliance/ad/utils/c$b$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/openalliance/ad/utils/c$b;->d()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/openalliance/ad/utils/c$b;


# direct methods
.method constructor <init>(Lcom/huawei/openalliance/ad/utils/c$b;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/utils/c$b$1;->a:Lcom/huawei/openalliance/ad/utils/c$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    invoke-static {}, Lcom/huawei/openalliance/ad/download/app/b;->e()Lcom/huawei/openalliance/ad/download/app/b;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/openalliance/ad/utils/c$b$1;->a:Lcom/huawei/openalliance/ad/utils/c$b;

    invoke-static {v1}, Lcom/huawei/openalliance/ad/utils/c$b;->a(Lcom/huawei/openalliance/ad/utils/c$b;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/download/app/b;->b(Ljava/lang/String;)Lcom/huawei/openalliance/ad/download/app/c;

    move-result-object v4

    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    invoke-virtual {v4}, Lcom/huawei/openalliance/ad/download/app/c;->u()Lcom/huawei/openalliance/ad/k/b/d;

    move-result-object v5

    const/4 v0, 0x0

    if-eq v0, v5, :cond_0

    const/4 v0, 0x3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v5, v0}, Lcom/huawei/openalliance/ad/k/b/d;->h(Ljava/lang/Integer;)V

    :cond_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/utils/c$b$1;->a:Lcom/huawei/openalliance/ad/utils/c$b;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/utils/c$b$1;->a:Lcom/huawei/openalliance/ad/utils/c$b;

    invoke-static {v1}, Lcom/huawei/openalliance/ad/utils/c$b;->a(Lcom/huawei/openalliance/ad/utils/c$b;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/openalliance/ad/utils/c$b$1;->a:Lcom/huawei/openalliance/ad/utils/c$b;

    invoke-static {v2}, Lcom/huawei/openalliance/ad/utils/c$b;->b(Lcom/huawei/openalliance/ad/utils/c$b;)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/openalliance/ad/utils/c$b$1;->a:Lcom/huawei/openalliance/ad/utils/c$b;

    invoke-static {v3}, Lcom/huawei/openalliance/ad/utils/c$b;->c(Lcom/huawei/openalliance/ad/utils/c$b;)Lcom/huawei/openalliance/ad/k/d$a;

    move-result-object v3

    invoke-static {v0, v1, v2, v4, v3}, Lcom/huawei/openalliance/ad/utils/c$b;->a(Lcom/huawei/openalliance/ad/utils/c$b;Ljava/lang/String;Ljava/lang/String;Lcom/huawei/openalliance/ad/download/app/c;Lcom/huawei/openalliance/ad/k/d$a;)V

    return-void
.end method
