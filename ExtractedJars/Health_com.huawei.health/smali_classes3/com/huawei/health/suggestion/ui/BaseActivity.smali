.class public abstract Lcom/huawei/health/suggestion/ui/BaseActivity;
.super Lcom/huawei/health/suggestion/ui/BaseActivityTemp;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 15
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/BaseActivityTemp;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract a()V
.end method

.method public abstract b()V
.end method

.method public b_()V
    .locals 5

    .line 30
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/BaseActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const-string v1, "HealthTheme"

    const-string v2, "style"

    const-string v3, "com.huawei.health"

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v4

    .line 31
    if-nez v4, :cond_0

    .line 32
    const-string v0, "BaseActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCreate if (themeId == 0)"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 34
    :cond_0
    const-string v0, "BaseActivity"

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

    .line 36
    invoke-virtual {p0, v4}, Lcom/huawei/health/suggestion/ui/BaseActivity;->setTheme(I)V

    .line 38
    :goto_0
    return-void
.end method

.method protected d(I)Ljava/lang/String;
    .locals 1

    .line 56
    const/16 v0, -0x194

    if-eq v0, p1, :cond_0

    .line 57
    sget v0, Lcom/huawei/health/suggestion/R$string;->sug_data_fetch_error:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/BaseActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 59
    :cond_0
    sget v0, Lcom/huawei/health/suggestion/R$string;->sug_haveno_network:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/BaseActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public abstract e()V
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 21
    invoke-super {p0, p1}, Lcom/huawei/health/suggestion/ui/BaseActivityTemp;->onCreate(Landroid/os/Bundle;)V

    .line 22
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-static {v0}, Lo/bxd;->a(Ljava/lang/ref/WeakReference;)V

    .line 23
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/BaseActivity;->b_()V

    .line 24
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/BaseActivity;->b()V

    .line 25
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/BaseActivity;->a()V

    .line 26
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/BaseActivity;->e()V

    .line 27
    return-void
.end method
