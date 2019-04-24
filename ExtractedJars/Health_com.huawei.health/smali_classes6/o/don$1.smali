.class final Lo/don$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/don;->d(Landroid/content/Context;Ljava/lang/String;Lo/don$e;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic d:Landroid/content/Context;

.field final synthetic e:Lo/don$e;


# direct methods
.method constructor <init>(Ljava/lang/String;Landroid/content/Context;Lo/don$e;)V
    .locals 0

    .line 24
    iput-object p1, p0, Lo/don$1;->a:Ljava/lang/String;

    iput-object p2, p0, Lo/don$1;->d:Landroid/content/Context;

    iput-object p3, p0, Lo/don$1;->e:Lo/don$e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 7

    .line 29
    iget-object v0, p0, Lo/don$1;->a:Ljava/lang/String;

    iget-object v1, p0, Lo/don$1;->d:Landroid/content/Context;

    invoke-static {v0, v1}, Lo/cyw;->d(Ljava/lang/String;Landroid/content/Context;)Landroid/graphics/Bitmap;

    move-result-object v4

    .line 30
    iget-object v0, p0, Lo/don$1;->d:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/LoginInit;->getUsetId()Ljava/lang/String;

    move-result-object v5

    .line 32
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 33
    const-string v0, "ImageDownloadUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "userid is empty"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 34
    iget-object v0, p0, Lo/don$1;->e:Lo/don$e;

    if-eqz v0, :cond_0

    .line 35
    iget-object v0, p0, Lo/don$1;->e:Lo/don$e;

    invoke-interface {v0}, Lo/don$e;->d()V

    .line 37
    :cond_0
    return-void

    .line 40
    :cond_1
    iget-object v0, p0, Lo/don$1;->d:Landroid/content/Context;

    invoke-static {v0, v5, v4}, Lo/cyt;->c(Landroid/content/Context;Ljava/lang/String;Landroid/graphics/Bitmap;)Ljava/lang/String;

    move-result-object v6

    .line 41
    iget-object v0, p0, Lo/don$1;->e:Lo/don$e;

    if-eqz v0, :cond_2

    .line 42
    iget-object v0, p0, Lo/don$1;->e:Lo/don$e;

    invoke-interface {v0, v6}, Lo/don$e;->c(Ljava/lang/String;)V

    .line 45
    :cond_2
    return-void
.end method
