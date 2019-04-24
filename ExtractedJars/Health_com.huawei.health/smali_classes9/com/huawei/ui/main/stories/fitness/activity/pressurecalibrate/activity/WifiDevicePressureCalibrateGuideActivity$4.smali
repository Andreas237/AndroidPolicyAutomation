.class Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/WifiDevicePressureCalibrateGuideActivity$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/WifiDevicePressureCalibrateGuideActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/WifiDevicePressureCalibrateGuideActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/WifiDevicePressureCalibrateGuideActivity;)V
    .locals 0

    .line 189
    iput-object p1, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/WifiDevicePressureCalibrateGuideActivity$4;->e:Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/WifiDevicePressureCalibrateGuideActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 8

    .line 192
    invoke-static {}, Lo/afq;->e()Lo/afq;

    move-result-object v0

    invoke-virtual {v0}, Lo/afq;->c()Lo/aey;

    move-result-object v0

    invoke-virtual {v0}, Lo/aey;->d()Ljava/util/ArrayList;

    move-result-object v4

    .line 193
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/WifiDevicePressureCalibrateGuideActivity$4;->e:Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/WifiDevicePressureCalibrateGuideActivity;

    sget-object v1, Lo/acl$a;->c:Lo/acl$a;

    invoke-virtual {v1}, Lo/acl$a;->name()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v4, v1}, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/WifiDevicePressureCalibrateGuideActivity;->c(Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/WifiDevicePressureCalibrateGuideActivity;Ljava/util/ArrayList;Ljava/lang/String;)Lo/afk;

    move-result-object v5

    .line 194
    const/4 v0, 0x0

    if-eq v0, v5, :cond_0

    .line 195
    new-instance v6, Landroid/content/Intent;

    invoke-direct {v6}, Landroid/content/Intent;-><init>()V

    .line 196
    const-string v0, "com.huawei.health"

    invoke-virtual {v6, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 197
    const-string v0, "com.huawei.health"

    const-string v1, "com.huawei.health.device.ui.DeviceMainActivity"

    invoke-virtual {v6, v0, v1}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 198
    const-string v0, "kind"

    const-string v1, "HDK_WEIGHT"

    invoke-virtual {v6, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 199
    new-instance v7, Ljava/util/HashMap;

    invoke-direct {v7}, Ljava/util/HashMap;-><init>()V

    .line 200
    const-string v0, "click"

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v7, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 201
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/WifiDevicePressureCalibrateGuideActivity$4;->e:Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/WifiDevicePressureCalibrateGuideActivity;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/WifiDevicePressureCalibrateGuideActivity;->a(Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/WifiDevicePressureCalibrateGuideActivity;)Landroid/content/Context;

    move-result-object v1

    sget-object v2, Lo/dae;->cO:Lo/dae;

    invoke-virtual {v2}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v7, v3}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 202
    const-string v0, "view"

    const-string v1, "BondDevice"

    invoke-virtual {v6, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 203
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/WifiDevicePressureCalibrateGuideActivity$4;->e:Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/WifiDevicePressureCalibrateGuideActivity;

    invoke-virtual {v0, v6}, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/WifiDevicePressureCalibrateGuideActivity;->startActivity(Landroid/content/Intent;)V

    .line 204
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/WifiDevicePressureCalibrateGuideActivity$4;->e:Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/WifiDevicePressureCalibrateGuideActivity;

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/WifiDevicePressureCalibrateGuideActivity;->finish()V

    .line 205
    goto :goto_0

    .line 206
    :cond_0
    const-string v0, "WifiDevicePressureCalibrateGuideActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "WEIGHT ProductGroup is error "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 208
    :goto_0
    return-void
.end method
