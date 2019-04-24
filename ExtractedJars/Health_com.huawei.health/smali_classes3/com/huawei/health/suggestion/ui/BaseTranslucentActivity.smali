.class public abstract Lcom/huawei/health/suggestion/ui/BaseTranslucentActivity;
.super Lcom/huawei/health/suggestion/ui/BaseActivity;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 13
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/BaseActivity;-><init>()V

    return-void
.end method

.method private d()V
    .locals 5

    .line 23
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x13

    if-lt v0, v1, :cond_0

    .line 26
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/BaseTranslucentActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x2400

    invoke-virtual {v0, v1}, Landroid/view/View;->setSystemUiVisibility(I)V

    .line 29
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/BaseTranslucentActivity;->h()Landroid/view/View;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/BaseTranslucentActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lo/byd;->b(Landroid/content/Context;)I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual {v0, v2, v1, v3, v4}, Landroid/view/View;->setPadding(IIII)V

    .line 31
    :cond_0
    return-void
.end method

.method private h()Landroid/view/View;
    .locals 1

    .line 34
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_head_view:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/BaseTranslucentActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 0

    .line 17
    invoke-super {p0, p1}, Lcom/huawei/health/suggestion/ui/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 18
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/BaseTranslucentActivity;->d()V

    .line 19
    return-void
.end method
