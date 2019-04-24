.class Lcom/huawei/openalliance/ad/m/a/a$2;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/openalliance/ad/m/a/a;->b()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/openalliance/ad/m/a/a;


# direct methods
.method constructor <init>(Lcom/huawei/openalliance/ad/m/a/a;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/m/a/a$2;->a:Lcom/huawei/openalliance/ad/m/a/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    const-string v0, "yyyy-MM-dd"

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/m;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    iget-object v0, p0, Lcom/huawei/openalliance/ad/m/a/a$2;->a:Lcom/huawei/openalliance/ad/m/a/a;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/m/a/a;->c(Lcom/huawei/openalliance/ad/m/a/a;)Lcom/huawei/openalliance/ad/e/a/e;

    move-result-object v0

    invoke-interface {v0}, Lcom/huawei/openalliance/ad/e/a/e;->l()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/m/a/a$2;->a:Lcom/huawei/openalliance/ad/m/a/a;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/m/a/a;->c(Lcom/huawei/openalliance/ad/m/a/a;)Lcom/huawei/openalliance/ad/e/a/e;

    move-result-object v0

    invoke-interface {v0, v3}, Lcom/huawei/openalliance/ad/e/a/e;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/m/a/a$2;->a:Lcom/huawei/openalliance/ad/m/a/a;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/m/a/a;->c(Lcom/huawei/openalliance/ad/m/a/a;)Lcom/huawei/openalliance/ad/e/a/e;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/huawei/openalliance/ad/e/a/e;->b(I)V

    :cond_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/m/a/a$2;->a:Lcom/huawei/openalliance/ad/m/a/a;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/m/a/a;->c(Lcom/huawei/openalliance/ad/m/a/a;)Lcom/huawei/openalliance/ad/e/a/e;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/openalliance/ad/m/a/a$2;->a:Lcom/huawei/openalliance/ad/m/a/a;

    invoke-static {v1}, Lcom/huawei/openalliance/ad/m/a/a;->c(Lcom/huawei/openalliance/ad/m/a/a;)Lcom/huawei/openalliance/ad/e/a/e;

    move-result-object v1

    invoke-interface {v1}, Lcom/huawei/openalliance/ad/e/a/e;->k()I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    invoke-interface {v0, v1}, Lcom/huawei/openalliance/ad/e/a/e;->b(I)V

    return-void
.end method
