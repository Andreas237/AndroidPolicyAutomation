.class Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->b()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;

.field final synthetic d:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;Ljava/lang/String;)V
    .locals 0

    .line 264
    iput-object p1, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity$1;->c:Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;

    iput-object p2, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity$1;->d:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 267
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity$1;->d:Ljava/lang/String;

    const-string v1, "huaweihealth"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity$1;->d:Ljava/lang/String;

    const-string v1, "huaweischeme"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity$1;->d:Ljava/lang/String;

    const-string v1, "geo:"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity$1;->d:Ljava/lang/String;

    const-string v1, "mailto:"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity$1;->d:Ljava/lang/String;

    const-string v1, "tel:"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 269
    :cond_0
    :try_start_0
    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    .line 270
    const-string v0, "android.intent.action.VIEW"

    invoke-virtual {v2, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 271
    const/high16 v0, 0x10000000

    invoke-virtual {v2, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 272
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity$1;->d:Ljava/lang/String;

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 273
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity$1;->c:Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;

    invoke-virtual {v0, v2}, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->startActivity(Landroid/content/Intent;)V

    .line 274
    const-string v0, "PLGACHIEVE_AchieveMedalDetailActivity"

    const-string v1, "jump to scheme view"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 277
    goto :goto_0

    .line 275
    :catch_0
    move-exception v2

    .line 276
    const-string v0, "PLGACHIEVE_AchieveMedalDetailActivity"

    invoke-virtual {v2}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 277
    goto :goto_0

    .line 279
    :cond_1
    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    .line 280
    const-string v0, "com.huawei.health"

    const-string v1, "com.huawei.operation.activity.WebViewActivity"

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 281
    const-string v0, "url"

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity$1;->d:Ljava/lang/String;

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 282
    const-string v0, "EXTRA_BI_ID"

    const-string v1, ""

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 283
    const-string v0, "EXTRA_BI_NAME"

    const-string v1, ""

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 284
    const-string v0, "EXTRA_BI_SOURCE"

    const-string v1, "Medal_Promotion"

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 285
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity$1;->c:Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;

    invoke-virtual {v0, v2}, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->startActivity(Landroid/content/Intent;)V

    .line 287
    :goto_0
    return-void
.end method
