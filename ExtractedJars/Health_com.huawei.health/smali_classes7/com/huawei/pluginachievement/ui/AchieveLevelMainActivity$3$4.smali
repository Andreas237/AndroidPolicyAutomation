.class Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity$3$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity$3;->onClick(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity$3;


# direct methods
.method constructor <init>(Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity$3;)V
    .locals 0

    .line 162
    iput-object p1, p0, Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity$3$4;->b:Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity$3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 165
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity$3$4;->b:Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity$3;

    iget-object v0, v0, Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity$3;->c:Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity;->e(Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity;)V

    .line 166
    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    .line 167
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity$3$4;->b:Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity$3;

    iget-object v0, v0, Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity$3;->c:Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity;->a(Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity;)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget-object v0, v0, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    invoke-virtual {v0}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object v0

    const-string v1, "CN"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 168
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity$3$4;->b:Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity$3;

    iget-object v0, v0, Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity$3;->c:Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity;->a(Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity;)Landroid/content/Context;

    move-result-object v0

    const-string v1, "com.huawei.pluginachievement.ui.AchieveLevelRuleCNActivity"

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->setClassName(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    goto :goto_0

    .line 170
    :cond_0
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity$3$4;->b:Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity$3;

    iget-object v0, v0, Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity$3;->c:Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity;->a(Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity;)Landroid/content/Context;

    move-result-object v0

    const-string v1, "com.huawei.pluginachievement.ui.level.AchieveLevelRuleActivity"

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->setClassName(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    .line 172
    :goto_0
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity$3$4;->b:Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity$3;

    iget-object v0, v0, Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity$3;->c:Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity;->a(Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity;)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 173
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity$3$4;->b:Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity$3;

    iget-object v0, v0, Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity$3;->c:Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity;->g(Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity;)Lo/elp;

    move-result-object v0

    invoke-virtual {v0}, Lo/elp;->a()V

    .line 174
    return-void
.end method
