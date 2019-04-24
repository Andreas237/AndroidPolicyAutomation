.class public abstract Lcom/huawei/health/suggestion/ui/BaseStateActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"


# instance fields
.field protected a:Ljava/util/concurrent/ExecutorService;

.field public b:Landroid/view/View;

.field public c:Landroid/view/View;

.field public e:Lo/emr;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 26
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    return-void
.end method

.method static synthetic b(Lcom/huawei/health/suggestion/ui/BaseStateActivity;)V
    .locals 0

    .line 26
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/BaseStateActivity;->n()V

    return-void
.end method

.method private n()V
    .locals 4

    .line 130
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/BaseStateActivity;->c:Landroid/view/View;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 131
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/BaseStateActivity;->c:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/BaseStateActivity;->f()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 132
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/BaseStateActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/BaseStateActivity;->f()I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/BaseStateActivity;->b:Landroid/view/View;

    .line 133
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/BaseStateActivity;->c:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/BaseStateActivity;->b:Landroid/view/View;

    const/4 v2, -0x1

    const/4 v3, -0x1

    invoke-virtual {v0, v1, v2, v3}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;II)V

    goto :goto_0

    .line 135
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/BaseStateActivity;->b:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 137
    :goto_0
    return-void
.end method


# virtual methods
.method protected a()V
    .locals 5

    .line 72
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/BaseStateActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const-string v1, "HealthTheme"

    const-string v2, "style"

    const-string v3, "com.huawei.health"

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v4

    .line 73
    if-nez v4, :cond_0

    .line 74
    const-string v0, "BaseStateActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCreate if (themeId == 0)"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 76
    :cond_0
    const-string v0, "BaseStateActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onCreate if (themeId == 0) ELSE themeId="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 78
    invoke-virtual {p0, v4}, Lcom/huawei/health/suggestion/ui/BaseStateActivity;->setTheme(I)V

    .line 80
    :goto_0
    return-void
.end method

.method public b()V
    .locals 1

    .line 105
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/BaseStateActivity;->c:Landroid/view/View;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/BaseStateActivity;->c:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    .line 106
    new-instance v0, Lcom/huawei/health/suggestion/ui/BaseStateActivity$2;

    invoke-direct {v0, p0}, Lcom/huawei/health/suggestion/ui/BaseStateActivity$2;-><init>(Lcom/huawei/health/suggestion/ui/BaseStateActivity;)V

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/BaseStateActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 113
    :cond_0
    return-void
.end method

.method public c()V
    .locals 2

    .line 96
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/BaseStateActivity;->c:Landroid/view/View;

    if-eqz v0, :cond_0

    .line 97
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/BaseStateActivity;->c:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 99
    :cond_0
    return-void
.end method

.method protected d()I
    .locals 1

    .line 89
    const/4 v0, -0x1

    return v0
.end method

.method public e()V
    .locals 1

    .line 119
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/BaseStateActivity;->c:Landroid/view/View;

    if-eqz v0, :cond_0

    .line 120
    new-instance v0, Lcom/huawei/health/suggestion/ui/BaseStateActivity$3;

    invoke-direct {v0, p0}, Lcom/huawei/health/suggestion/ui/BaseStateActivity$3;-><init>(Lcom/huawei/health/suggestion/ui/BaseStateActivity;)V

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/BaseStateActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 127
    :cond_0
    return-void
.end method

.method protected f()I
    .locals 1

    .line 155
    sget v0, Lcom/huawei/health/suggestion/R$layout;->sug_error_layout:I

    return v0
.end method

.method public abstract g()V
.end method

.method protected h()I
    .locals 1

    .line 160
    const/4 v0, 0x0

    return v0
.end method

.method public abstract i()V
.end method

.method public abstract k()V
.end method

.method public o()V
    .locals 0

    .line 183
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 4

    .line 37
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 38
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-static {v0}, Lo/bxd;->a(Ljava/lang/ref/WeakReference;)V

    .line 39
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/BaseStateActivity;->a()V

    .line 40
    invoke-static {}, Ljava/util/concurrent/Executors;->newCachedThreadPool()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/BaseStateActivity;->a:Ljava/util/concurrent/ExecutorService;

    .line 41
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/BaseStateActivity;->g()V

    .line 43
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/BaseStateActivity;->h()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 45
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/BaseStateActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/BaseStateActivity;->h()I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/BaseStateActivity;->c:Landroid/view/View;

    .line 46
    const v0, 0x1020002

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/BaseStateActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/BaseStateActivity;->c:Landroid/view/View;

    const/4 v2, -0x1

    const/4 v3, -0x1

    invoke-virtual {v0, v1, v2, v3}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;II)V

    .line 47
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/BaseStateActivity;->d()I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 48
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/BaseStateActivity;->c:Landroid/view/View;

    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/BaseStateActivity;->d()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 50
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/BaseStateActivity;->c:Landroid/view/View;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 53
    :cond_1
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_fitness_title:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/BaseStateActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emr;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/BaseStateActivity;->e:Lo/emr;

    .line 54
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/BaseStateActivity;->e:Lo/emr;

    if-eqz v0, :cond_2

    .line 55
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/BaseStateActivity;->e:Lo/emr;

    new-instance v1, Lcom/huawei/health/suggestion/ui/BaseStateActivity$1;

    invoke-direct {v1, p0}, Lcom/huawei/health/suggestion/ui/BaseStateActivity$1;-><init>(Lcom/huawei/health/suggestion/ui/BaseStateActivity;)V

    invoke-virtual {v0, v1}, Lo/emr;->setLeftButtonOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 62
    :cond_2
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/BaseStateActivity;->k()V

    .line 63
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/BaseStateActivity;->a:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/huawei/health/suggestion/ui/BaseStateActivity$4;

    invoke-direct {v1, p0}, Lcom/huawei/health/suggestion/ui/BaseStateActivity$4;-><init>(Lcom/huawei/health/suggestion/ui/BaseStateActivity;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 69
    return-void
.end method

.method public onDestroy()V
    .locals 4

    .line 204
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onDestroy()V

    .line 205
    const-string v0, "BaseStateActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "BaseStateActivity onDestroy():"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 206
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/BaseStateActivity;->a:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 207
    return-void
.end method

.method public onResume()V
    .locals 0

    .line 84
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onResume()V

    .line 86
    return-void
.end method

.method public retry(Landroid/view/View;)V
    .locals 4

    .line 199
    const-string v0, "BaseStateActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u91cd\u65b0\u52a0\u8f7d\u7f51\u7edc\u6570\u636e\u3002"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 200
    return-void
.end method
