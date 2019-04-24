.class Lo/ale$56;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/ale;->i(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/ale;

.field final synthetic d:I


# direct methods
.method constructor <init>(Lo/ale;I)V
    .locals 0

    .line 3895
    iput-object p1, p0, Lo/ale$56;->b:Lo/ale;

    iput p2, p0, Lo/ale$56;->d:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 5

    .line 3899
    iget-object v0, p0, Lo/ale$56;->b:Lo/ale;

    invoke-static {v0}, Lo/ale;->M(Lo/ale;)Lo/egv;

    move-result-object v0

    invoke-virtual {v0}, Lo/egv;->dismiss()V

    .line 3900
    iget-object v0, p0, Lo/ale$56;->b:Lo/ale;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/ale;->b(Lo/ale;Lo/egv;)Lo/egv;

    .line 3902
    new-instance v4, Lo/dcy;

    const/4 v0, 0x0

    invoke-direct {v4, v0}, Lo/dcy;-><init>(I)V

    .line 3904
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0x2718

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "oversea_user_agreed"

    const-string v3, "true"

    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 3907
    iget-object v0, p0, Lo/ale$56;->b:Lo/ale;

    invoke-static {v0}, Lo/ale;->g(Lo/ale;)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 3908
    iget-object v0, p0, Lo/ale$56;->b:Lo/ale;

    invoke-static {v0}, Lo/ale;->g(Lo/ale;)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->isShutdown()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3909
    iget-object v0, p0, Lo/ale$56;->b:Lo/ale;

    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v1

    invoke-static {v0, v1}, Lo/ale;->d(Lo/ale;Ljava/util/concurrent/ExecutorService;)Ljava/util/concurrent/ExecutorService;

    .line 3911
    :cond_0
    iget-object v0, p0, Lo/ale$56;->b:Lo/ale;

    invoke-static {v0}, Lo/ale;->g(Lo/ale;)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    new-instance v1, Lo/ale$56$3;

    invoke-direct {v1, p0}, Lo/ale$56$3;-><init>(Lo/ale$56;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 3918
    :cond_1
    return-void
.end method
