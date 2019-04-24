.class Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->c()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;


# direct methods
.method constructor <init>(Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;)V
    .locals 0

    .line 313
    iput-object p1, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$4;->d:Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 7

    .line 316
    const-string v3, ""

    .line 317
    const-string v4, ""

    .line 318
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$4;->d:Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->d(Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 319
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$4;->d:Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->d(Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "/n"

    const-string v2, "\n"

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v3

    .line 321
    :cond_0
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$4;->d:Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->a(Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 322
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$4;->d:Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->a(Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;)Ljava/lang/String;

    move-result-object v4

    .line 324
    :cond_1
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$4;->d:Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->h(Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;)Ljava/lang/String;

    move-result-object v5

    .line 325
    new-instance v6, Landroid/content/Intent;

    invoke-direct {v6}, Landroid/content/Intent;-><init>()V

    .line 326
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$4;->d:Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->f(Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;)Landroid/content/Context;

    move-result-object v0

    const-string v1, "com.huawei.pluginachievement.ui.AchieveMedalDetailActivity"

    invoke-virtual {v6, v0, v1}, Landroid/content/Intent;->setClassName(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    .line 327
    const-string v0, "medal_res_id"

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$4;->d:Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;

    invoke-static {v1}, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->g(Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v6, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 328
    const-string v0, "medal_des_id"

    invoke-virtual {v6, v0, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 329
    const-string v0, "medal_content_id"

    invoke-virtual {v6, v0, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 330
    const-string v0, "medal_type_level"

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$4;->d:Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;

    invoke-static {v1}, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->i(Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v6, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 331
    const-string v0, "medal_gain_time"

    invoke-virtual {v6, v0, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 332
    const-string v0, "click_x"

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$4;->d:Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;

    invoke-static {v1}, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->k(Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;)F

    move-result v1

    invoke-virtual {v6, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;F)Landroid/content/Intent;

    .line 333
    const-string v0, "click_y"

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$4;->d:Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;

    invoke-static {v1}, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->m(Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;)F

    move-result v1

    invoke-virtual {v6, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;F)Landroid/content/Intent;

    .line 334
    const-string v0, "medal_obtain_id"

    const-string v1, "true"

    invoke-virtual {v6, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 335
    const-string v0, "promotion_name"

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$4;->d:Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;

    invoke-static {v1}, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->l(Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v6, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 336
    const-string v0, "promotion_url"

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$4;->d:Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;

    invoke-static {v1}, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->o(Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v6, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 337
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$4;->d:Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->f(Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, v6}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 338
    return-void
.end method
