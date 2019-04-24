.class Lcom/huawei/ui/device/activity/heartrate/HeartRateSettingsActivity$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/device/activity/heartrate/HeartRateSettingsActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/ui/device/activity/heartrate/HeartRateSettingsActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/device/activity/heartrate/HeartRateSettingsActivity;)V
    .locals 0

    .line 135
    iput-object p1, p0, Lcom/huawei/ui/device/activity/heartrate/HeartRateSettingsActivity$3;->e:Lcom/huawei/ui/device/activity/heartrate/HeartRateSettingsActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 7

    .line 138
    const-string v0, "03"

    const-string v1, "HeartRateSettingsActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Heart Rate Switch is onCheckedChanged isChecked = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 139
    iget-object v0, p0, Lcom/huawei/ui/device/activity/heartrate/HeartRateSettingsActivity$3;->e:Lcom/huawei/ui/device/activity/heartrate/HeartRateSettingsActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/heartrate/HeartRateSettingsActivity;->c(Lcom/huawei/ui/device/activity/heartrate/HeartRateSettingsActivity;)Lo/enz;

    move-result-object v0

    invoke-virtual {v0, p2}, Lo/enz;->a(Z)V

    .line 141
    new-instance v5, Landroid/content/Intent;

    invoke-direct {v5}, Landroid/content/Intent;-><init>()V

    .line 142
    if-eqz p2, :cond_0

    .line 143
    const-string v0, "status"

    iget-object v1, p0, Lcom/huawei/ui/device/activity/heartrate/HeartRateSettingsActivity$3;->e:Lcom/huawei/ui/device/activity/heartrate/HeartRateSettingsActivity;

    invoke-static {v1}, Lcom/huawei/ui/device/activity/heartrate/HeartRateSettingsActivity;->c(Lcom/huawei/ui/device/activity/heartrate/HeartRateSettingsActivity;)Lo/enz;

    const-string v1, "1"

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    goto :goto_0

    .line 146
    :cond_0
    const-string v0, "status"

    iget-object v1, p0, Lcom/huawei/ui/device/activity/heartrate/HeartRateSettingsActivity$3;->e:Lcom/huawei/ui/device/activity/heartrate/HeartRateSettingsActivity;

    invoke-static {v1}, Lcom/huawei/ui/device/activity/heartrate/HeartRateSettingsActivity;->c(Lcom/huawei/ui/device/activity/heartrate/HeartRateSettingsActivity;)Lo/enz;

    const-string v1, "0"

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 149
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/heartrate/HeartRateSettingsActivity$3;->e:Lcom/huawei/ui/device/activity/heartrate/HeartRateSettingsActivity;

    const/4 v1, -0x1

    invoke-virtual {v0, v1, v5}, Lcom/huawei/ui/device/activity/heartrate/HeartRateSettingsActivity;->setResult(ILandroid/content/Intent;)V

    .line 153
    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    .line 154
    const-string v0, "click"

    const-string v1, "1"

    invoke-interface {v6, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 155
    if-eqz p2, :cond_1

    .line 156
    const-string v0, "status"

    const-string v1, "1"

    invoke-interface {v6, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 158
    :cond_1
    const-string v0, "status"

    const-string v1, "0"

    invoke-interface {v6, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 160
    :goto_1
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    sget-object v2, Lo/dae;->iu:Lo/dae;

    invoke-virtual {v2}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v6, v3}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 161
    return-void
.end method
