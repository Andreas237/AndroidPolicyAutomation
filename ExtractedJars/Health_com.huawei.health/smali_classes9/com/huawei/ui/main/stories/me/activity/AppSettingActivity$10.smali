.class Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$10;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnDismissListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->onCheckedChanged(Landroid/widget/CompoundButton;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/dcy;

.field final synthetic d:Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;Lo/dcy;)V
    .locals 0

    .line 1424
    iput-object p1, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$10;->d:Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;

    iput-object p2, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$10;->b:Lo/dcy;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onDismiss(Landroid/content/DialogInterface;)V
    .locals 5

    .line 1427
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$10;->d:Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$10;->d:Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->r(Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;)Lo/emu;

    move-result-object v1

    invoke-virtual {v1}, Lo/emu;->isChecked()Z

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->h(Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;Z)Z

    .line 1428
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$10;->d:Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->s(Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1429
    const-string v0, "UIME_AppSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mGPSLowConsumptionSwitchStatus if"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1430
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$10;->d:Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->m(Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;)Landroid/content/Context;

    move-result-object v0

    const-string v1, "flp_track_switch"

    const-string v2, "flp_track_flag"

    const-string v3, "1"

    iget-object v4, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$10;->b:Lo/dcy;

    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 1431
    const-string v0, "UIME_AppSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "set flp value = 1"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 1434
    :cond_0
    const-string v0, "UIME_AppSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mGPSLowConsumptionSwitchStatus else"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1435
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$10;->d:Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->m(Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;)Landroid/content/Context;

    move-result-object v0

    const-string v1, "flp_track_switch"

    const-string v2, "flp_track_flag"

    const-string v3, "0"

    iget-object v4, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$10;->b:Lo/dcy;

    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 1436
    const-string v0, "UIME_AppSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "set flp value = 0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1439
    :goto_0
    return-void
.end method
