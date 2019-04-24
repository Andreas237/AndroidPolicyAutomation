.class Lcom/huawei/openalliance/ad/download/app/b$6$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/openalliance/ad/download/app/b$6;->onReceive(Landroid/content/Context;Landroid/content/Intent;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/content/Context;

.field final synthetic b:Lcom/huawei/openalliance/ad/download/app/b$6;


# direct methods
.method constructor <init>(Lcom/huawei/openalliance/ad/download/app/b$6;Landroid/content/Context;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/download/app/b$6$1;->b:Lcom/huawei/openalliance/ad/download/app/b$6;

    iput-object p2, p0, Lcom/huawei/openalliance/ad/download/app/b$6$1;->a:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/download/app/b$6$1;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/w;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/download/app/b$6$1;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/w;->b(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/download/app/b$6$1;->b:Lcom/huawei/openalliance/ad/download/app/b$6;

    iget-object v0, v0, Lcom/huawei/openalliance/ad/download/app/b$6;->a:Lcom/huawei/openalliance/ad/download/app/b;

    sget-object v1, Lcom/huawei/openalliance/ad/download/e$b;->c:Lcom/huawei/openalliance/ad/download/e$b;

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/download/app/b;->a(Lcom/huawei/openalliance/ad/download/e$b;)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/huawei/openalliance/ad/download/app/b$6$1;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/w;->b(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/download/app/b$6$1;->b:Lcom/huawei/openalliance/ad/download/app/b$6;

    iget-object v0, v0, Lcom/huawei/openalliance/ad/download/app/b$6;->a:Lcom/huawei/openalliance/ad/download/app/b;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/download/app/b;->d(Lcom/huawei/openalliance/ad/download/app/b;)V

    :cond_2
    :goto_0
    return-void
.end method
