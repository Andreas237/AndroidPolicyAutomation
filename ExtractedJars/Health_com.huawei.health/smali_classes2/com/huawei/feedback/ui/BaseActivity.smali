.class public Lcom/huawei/feedback/ui/BaseActivity;
.super Landroid/app/Activity;
.source "SourceFile"


# instance fields
.field protected a:Lcom/huawei/feedback/ui/ap;

.field private b:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 14
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    .line 19
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/feedback/ui/BaseActivity;->b:Z

    return-void
.end method


# virtual methods
.method protected a(ILcom/huawei/feedback/ui/CustomActionBar;)V
    .locals 1

    .line 69
    invoke-virtual {p0, p1}, Lcom/huawei/feedback/ui/BaseActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {p0, v0, p2}, Lcom/huawei/feedback/ui/BaseActivity;->a(Landroid/view/View;Lcom/huawei/feedback/ui/CustomActionBar;)V

    .line 70
    return-void
.end method

.method protected a(Landroid/view/View;Lcom/huawei/feedback/ui/CustomActionBar;)V
    .locals 2

    .line 73
    invoke-static {p0}, Lcom/huawei/feedback/ui/ar;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 74
    new-instance v0, Lcom/huawei/feedback/ui/ap;

    invoke-virtual {p0}, Lcom/huawei/feedback/ui/BaseActivity;->getActionBar()Landroid/app/ActionBar;

    move-result-object v1

    invoke-direct {v0, p0, p1, p2, v1}, Lcom/huawei/feedback/ui/ap;-><init>(Landroid/app/Activity;Landroid/view/View;Lcom/huawei/feedback/ui/CustomActionBar;Landroid/app/ActionBar;)V

    iput-object v0, p0, Lcom/huawei/feedback/ui/BaseActivity;->a:Lcom/huawei/feedback/ui/ap;

    .line 75
    iget-object v0, p0, Lcom/huawei/feedback/ui/BaseActivity;->a:Lcom/huawei/feedback/ui/ap;

    invoke-virtual {v0}, Lcom/huawei/feedback/ui/ap;->a()V

    .line 78
    :cond_0
    return-void
.end method

.method public a(Z)V
    .locals 0

    .line 57
    iput-boolean p1, p0, Lcom/huawei/feedback/ui/BaseActivity;->b:Z

    .line 58
    return-void
.end method

.method public a()Z
    .locals 1

    .line 48
    iget-boolean v0, p0, Lcom/huawei/feedback/ui/BaseActivity;->b:Z

    return v0
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 2

    .line 38
    invoke-super {p0, p1}, Landroid/app/Activity;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 40
    iget-object v0, p0, Lcom/huawei/feedback/ui/BaseActivity;->a:Lcom/huawei/feedback/ui/ap;

    if-eqz v0, :cond_0

    .line 41
    iget-object v0, p0, Lcom/huawei/feedback/ui/BaseActivity;->a:Lcom/huawei/feedback/ui/ap;

    iget v1, p1, Landroid/content/res/Configuration;->orientation:I

    invoke-virtual {v0, v1}, Lcom/huawei/feedback/ui/ap;->a(I)V

    .line 43
    :cond_0
    const v0, 0x1020002

    invoke-virtual {p0, v0}, Lcom/huawei/feedback/ui/BaseActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 44
    invoke-virtual {p0}, Lcom/huawei/feedback/ui/BaseActivity;->a()Z

    move-result v1

    .line 43
    invoke-static {p0, v0, v1}, Lcom/huawei/phoneserviceuni/common/e/f;->a(Landroid/content/Context;Landroid/view/View;Z)V

    .line 45
    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 2

    .line 24
    invoke-static {p0}, Lcom/huawei/phoneserviceuni/common/e/f;->h(Landroid/content/Context;)I

    move-result v0

    invoke-super {p0, v0}, Landroid/app/Activity;->setTheme(I)V

    .line 25
    invoke-static {}, Lcom/huawei/phoneserviceuni/common/e/a;->o()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 26
    const/4 v0, -0x1

    invoke-virtual {p0, v0}, Lcom/huawei/feedback/ui/BaseActivity;->setRequestedOrientation(I)V

    goto :goto_0

    .line 28
    :cond_0
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/feedback/ui/BaseActivity;->setRequestedOrientation(I)V

    .line 31
    :goto_0
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 32
    const v0, 0x1020002

    invoke-virtual {p0, v0}, Lcom/huawei/feedback/ui/BaseActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 33
    invoke-virtual {p0}, Lcom/huawei/feedback/ui/BaseActivity;->a()Z

    move-result v1

    .line 32
    invoke-static {p0, v0, v1}, Lcom/huawei/phoneserviceuni/common/e/f;->a(Landroid/content/Context;Landroid/view/View;Z)V

    .line 34
    return-void
.end method

.method protected onDestroy()V
    .locals 0

    .line 62
    invoke-super {p0}, Landroid/app/Activity;->onDestroy()V

    .line 63
    return-void
.end method

.method public onMultiWindowModeChanged(Z)V
    .locals 1

    .line 82
    invoke-super {p0, p1}, Landroid/app/Activity;->onMultiWindowModeChanged(Z)V

    .line 83
    iget-object v0, p0, Lcom/huawei/feedback/ui/BaseActivity;->a:Lcom/huawei/feedback/ui/ap;

    if-eqz v0, :cond_0

    .line 84
    iget-object v0, p0, Lcom/huawei/feedback/ui/BaseActivity;->a:Lcom/huawei/feedback/ui/ap;

    invoke-virtual {v0, p1}, Lcom/huawei/feedback/ui/ap;->a(Z)V

    .line 86
    :cond_0
    return-void
.end method
