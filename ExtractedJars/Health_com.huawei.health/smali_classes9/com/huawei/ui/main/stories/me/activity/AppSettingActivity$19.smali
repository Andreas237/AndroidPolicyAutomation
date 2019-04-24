.class Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$19;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->p()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/content/Intent;

.field final synthetic c:Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;Landroid/content/Intent;)V
    .locals 0

    .line 1003
    iput-object p1, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$19;->c:Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;

    iput-object p2, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$19;->a:Landroid/content/Intent;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 1006
    const-string v0, "UIME_AppSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "positive"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1007
    const-string v0, "UIME_AppSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "settingUnit : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$19;->c:Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;

    invoke-static {v3}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->l(Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1008
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$19;->c:Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$19;->c:Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->l(Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;)I

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->a(Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;I)V

    .line 1009
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$19;->c:Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->m(Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;)Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$19;->a:Landroid/content/Intent;

    const-string v2, "com.huawei.ui.imperial.imperial_permission"

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;Ljava/lang/String;)V

    .line 1012
    return-void
.end method
