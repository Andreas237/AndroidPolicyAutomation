.class Lcom/huawei/openalliance/ad/j/m$3;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/openalliance/ad/j/m;->a(Landroid/webkit/WebView;Lcom/huawei/openalliance/ad/utils/c$a;Landroid/content/Intent;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/content/Intent;

.field final synthetic b:Lcom/huawei/openalliance/ad/utils/c$a;

.field final synthetic c:Lcom/huawei/openalliance/ad/j/m;


# direct methods
.method constructor <init>(Lcom/huawei/openalliance/ad/j/m;Landroid/content/Intent;Lcom/huawei/openalliance/ad/utils/c$a;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/j/m$3;->c:Lcom/huawei/openalliance/ad/j/m;

    iput-object p2, p0, Lcom/huawei/openalliance/ad/j/m$3;->a:Landroid/content/Intent;

    iput-object p3, p0, Lcom/huawei/openalliance/ad/j/m$3;->b:Lcom/huawei/openalliance/ad/utils/c$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 3

    iget-object v0, p0, Lcom/huawei/openalliance/ad/j/m$3;->c:Lcom/huawei/openalliance/ad/j/m;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/j/m;->b(Lcom/huawei/openalliance/ad/j/m;)Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/openalliance/ad/j/m$3;->a:Landroid/content/Intent;

    invoke-virtual {v0, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/j/m$3;->c:Lcom/huawei/openalliance/ad/j/m;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/j/m;->c(Lcom/huawei/openalliance/ad/j/m;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/j/m$3;->c:Lcom/huawei/openalliance/ad/j/m;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/j/m;->b(Lcom/huawei/openalliance/ad/j/m;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/openalliance/ad/e/f;->a(Landroid/content/Context;)Lcom/huawei/openalliance/ad/e/a/e;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/openalliance/ad/j/m$3;->b:Lcom/huawei/openalliance/ad/utils/c$a;

    invoke-virtual {v1}, Lcom/huawei/openalliance/ad/utils/c$a;->a()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Lcom/huawei/openalliance/ad/e/a/e;->a(Ljava/lang/String;Z)V

    :cond_0
    return-void
.end method
