.class Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$3;
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
.field final synthetic a:I

.field final synthetic b:Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;

.field final synthetic e:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;ILjava/lang/String;)V
    .locals 0

    .line 287
    iput-object p1, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$3;->b:Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;

    iput p2, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$3;->a:I

    iput-object p3, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$3;->e:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 7

    .line 289
    const-string v3, ""

    .line 290
    const-string v4, ""

    .line 291
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$3;->b:Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->d(Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 292
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$3;->b:Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->d(Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "/n"

    const-string v2, "\n"

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v3

    .line 294
    :cond_0
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$3;->b:Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->a(Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 295
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$3;->b:Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->a(Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;)Ljava/lang/String;

    move-result-object v4

    .line 297
    :cond_1
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$3;->b:Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$3;->b:Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;

    invoke-static {v1}, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->h(Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->e(Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 298
    if-nez v5, :cond_2

    .line 299
    const-string v5, ""

    .line 301
    :cond_2
    new-instance v6, Landroid/content/Intent;

    invoke-direct {v6}, Landroid/content/Intent;-><init>()V

    .line 302
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$3;->b:Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->f(Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;)Landroid/content/Context;

    move-result-object v0

    const-string v1, "com.huawei.pluginachievement.ui.AchieveSignalMedalActivity"

    invoke-virtual {v6, v0, v1}, Landroid/content/Intent;->setClassName(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    .line 303
    const-string v0, "medal_type_level"

    iget v1, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$3;->a:I

    invoke-virtual {v6, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 304
    const-string v0, "medal_name"

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$3;->e:Ljava/lang/String;

    invoke-virtual {v6, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 305
    const-string v0, "medal_des_id"

    invoke-virtual {v6, v0, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 306
    const-string v0, "medal_gain_time"

    invoke-virtual {v6, v0, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 308
    const-string v0, "medal_content_id"

    invoke-virtual {v6, v0, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 309
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$3;->b:Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->f(Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, v6}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 310
    return-void
.end method
