.class Lcom/tencent/open/TaskGuide$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tencent/open/TaskGuide;->showWindow()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/tencent/open/TaskGuide;


# direct methods
.method constructor <init>(Lcom/tencent/open/TaskGuide;)V
    .locals 0

    .line 331
    iput-object p1, p0, Lcom/tencent/open/TaskGuide$2;->a:Lcom/tencent/open/TaskGuide;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 336
    iget-object v0, p0, Lcom/tencent/open/TaskGuide$2;->a:Lcom/tencent/open/TaskGuide;

    iget-object v1, p0, Lcom/tencent/open/TaskGuide$2;->a:Lcom/tencent/open/TaskGuide;

    iget-object v2, p0, Lcom/tencent/open/TaskGuide$2;->a:Lcom/tencent/open/TaskGuide;

    invoke-static {v2}, Lcom/tencent/open/TaskGuide;->f(Lcom/tencent/open/TaskGuide;)Landroid/content/Context;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/tencent/open/TaskGuide;->a(Lcom/tencent/open/TaskGuide;Landroid/content/Context;)Landroid/view/ViewGroup;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tencent/open/TaskGuide;->a(Lcom/tencent/open/TaskGuide;Landroid/view/ViewGroup;)Landroid/view/ViewGroup;

    .line 339
    iget-object v0, p0, Lcom/tencent/open/TaskGuide$2;->a:Lcom/tencent/open/TaskGuide;

    iget-object v1, p0, Lcom/tencent/open/TaskGuide$2;->a:Lcom/tencent/open/TaskGuide;

    iget-object v2, p0, Lcom/tencent/open/TaskGuide$2;->a:Lcom/tencent/open/TaskGuide;

    invoke-static {v2}, Lcom/tencent/open/TaskGuide;->f(Lcom/tencent/open/TaskGuide;)Landroid/content/Context;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/tencent/open/TaskGuide;->b(Lcom/tencent/open/TaskGuide;Landroid/content/Context;)Landroid/view/WindowManager$LayoutParams;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tencent/open/TaskGuide;->a(Lcom/tencent/open/TaskGuide;Landroid/view/WindowManager$LayoutParams;)Landroid/view/WindowManager$LayoutParams;

    .line 342
    iget-object v0, p0, Lcom/tencent/open/TaskGuide$2;->a:Lcom/tencent/open/TaskGuide;

    invoke-static {v0}, Lcom/tencent/open/TaskGuide;->g(Lcom/tencent/open/TaskGuide;)V

    .line 343
    iget-object v0, p0, Lcom/tencent/open/TaskGuide$2;->a:Lcom/tencent/open/TaskGuide;

    invoke-static {v0}, Lcom/tencent/open/TaskGuide;->f(Lcom/tencent/open/TaskGuide;)Landroid/content/Context;

    move-result-object v0

    const-string v1, "window"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroid/view/WindowManager;

    .line 345
    iget-object v0, p0, Lcom/tencent/open/TaskGuide$2;->a:Lcom/tencent/open/TaskGuide;

    invoke-static {v0}, Lcom/tencent/open/TaskGuide;->f(Lcom/tencent/open/TaskGuide;)Landroid/content/Context;

    move-result-object v0

    check-cast v0, Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 346
    return-void

    .line 349
    :cond_0
    iget-object v0, p0, Lcom/tencent/open/TaskGuide$2;->a:Lcom/tencent/open/TaskGuide;

    invoke-static {v0}, Lcom/tencent/open/TaskGuide;->a(Lcom/tencent/open/TaskGuide;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 350
    iget-object v0, p0, Lcom/tencent/open/TaskGuide$2;->a:Lcom/tencent/open/TaskGuide;

    invoke-static {v0}, Lcom/tencent/open/TaskGuide;->b(Lcom/tencent/open/TaskGuide;)Landroid/view/ViewGroup;

    move-result-object v0

    iget-object v1, p0, Lcom/tencent/open/TaskGuide$2;->a:Lcom/tencent/open/TaskGuide;

    invoke-static {v1}, Lcom/tencent/open/TaskGuide;->h(Lcom/tencent/open/TaskGuide;)Landroid/view/WindowManager$LayoutParams;

    move-result-object v1

    invoke-interface {v3, v0, v1}, Landroid/view/WindowManager;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 353
    :cond_1
    iget-object v0, p0, Lcom/tencent/open/TaskGuide$2;->a:Lcom/tencent/open/TaskGuide;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/tencent/open/TaskGuide;->a(Lcom/tencent/open/TaskGuide;Z)Z

    .line 354
    iget-object v0, p0, Lcom/tencent/open/TaskGuide$2;->a:Lcom/tencent/open/TaskGuide;

    const/4 v1, 0x2

    invoke-static {v0, v1}, Lcom/tencent/open/TaskGuide;->c(Lcom/tencent/open/TaskGuide;I)V

    .line 355
    iget-object v0, p0, Lcom/tencent/open/TaskGuide$2;->a:Lcom/tencent/open/TaskGuide;

    invoke-static {v0}, Lcom/tencent/open/TaskGuide;->i(Lcom/tencent/open/TaskGuide;)V

    .line 356
    return-void
.end method
