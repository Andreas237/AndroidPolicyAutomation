.class Lcom/huawei/openalliance/ad/download/b$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/openalliance/ad/download/b;->b(Lcom/huawei/openalliance/ad/download/e;Z)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/openalliance/ad/download/e;

.field final synthetic b:Lcom/huawei/openalliance/ad/download/b;


# direct methods
.method constructor <init>(Lcom/huawei/openalliance/ad/download/b;Lcom/huawei/openalliance/ad/download/e;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/download/b$1;->b:Lcom/huawei/openalliance/ad/download/b;

    iput-object p2, p0, Lcom/huawei/openalliance/ad/download/b$1;->a:Lcom/huawei/openalliance/ad/download/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/download/b$1;->a:Lcom/huawei/openalliance/ad/download/e;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/download/e;->e()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/download/b$1;->a:Lcom/huawei/openalliance/ad/download/e;

    invoke-virtual {v1}, Lcom/huawei/openalliance/ad/download/e;->e()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/i;->e(Ljava/io/File;)V

    :cond_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/download/b$1;->a:Lcom/huawei/openalliance/ad/download/e;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/download/e;->d()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/download/b$1;->a:Lcom/huawei/openalliance/ad/download/e;

    invoke-virtual {v1}, Lcom/huawei/openalliance/ad/download/e;->d()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/i;->e(Ljava/io/File;)V

    :cond_1
    return-void
.end method
