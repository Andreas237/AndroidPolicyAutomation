.class Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity$8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->b()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;


# direct methods
.method constructor <init>(Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;)V
    .locals 0

    .line 252
    iput-object p1, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity$8;->c:Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 7

    .line 255
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 256
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity$8;->c:Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;

    sget v1, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_kk_get_consume:I

    invoke-virtual {v0, v1}, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "com.huawei.pluginachievement.ui.kakatask.AchieveKaKaDetailActivity"

    invoke-virtual {v3, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 257
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity$8;->c:Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;

    sget v1, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_kk_kaka_rule:I

    invoke-virtual {v0, v1}, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "com.huawei.pluginachievement.ui.kakatask.AchieveKaKaDetailActivity"

    invoke-virtual {v3, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 258
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 259
    new-instance v5, Landroid/os/Bundle;

    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    .line 260
    const-string v0, "tag"

    const-string v1, "deail"

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 261
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity$8;->c:Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;

    sget v1, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_kk_get_consume:I

    invoke-virtual {v0, v1}, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 262
    new-instance v6, Landroid/os/Bundle;

    invoke-direct {v6}, Landroid/os/Bundle;-><init>()V

    .line 263
    const-string v0, "tag"

    const-string v1, "rule"

    invoke-virtual {v6, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 264
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity$8;->c:Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;

    sget v1, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_kk_kaka_rule:I

    invoke-virtual {v0, v1}, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 266
    new-instance v0, Lo/dyl;

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity$8;->c:Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;

    invoke-static {v1}, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->k(Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;)Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity$8;->c:Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;

    invoke-static {v2}, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->i(Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;)Lo/emr;

    move-result-object v2

    invoke-direct {v0, v1, v3, v2, v4}, Lo/dyl;-><init>(Landroid/content/Context;Ljava/util/HashMap;Landroid/view/View;Ljava/util/HashMap;)V

    .line 267
    return-void
.end method
