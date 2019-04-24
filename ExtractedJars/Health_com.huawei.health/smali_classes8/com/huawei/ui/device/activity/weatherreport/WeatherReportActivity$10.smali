.class Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity$10;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;)V
    .locals 0

    .line 350
    iput-object p1, p0, Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity$10;->b:Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 6

    .line 354
    iget-object v0, p0, Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity$10;->b:Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;->k(Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dbf;->f(Landroid/content/Context;)Z

    move-result v4

    .line 355
    const-string v0, "WeatherReportActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "zhanglintao isChecked = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 356
    if-nez v4, :cond_1

    .line 357
    iget-object v0, p0, Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity$10;->b:Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;->k(Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;)Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_confirm_network_whether_connected:I

    invoke-static {v0, v1}, Lo/emv;->c(Landroid/content/Context;I)V

    .line 358
    iget-object v0, p0, Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity$10;->b:Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;->f(Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;)Landroid/widget/Switch;

    move-result-object v0

    if-nez p2, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v0, v1}, Landroid/widget/Switch;->setChecked(Z)V

    .line 359
    return-void

    .line 362
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity$10;->b:Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;

    invoke-static {v0, p2}, Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;->b(Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;Z)Z

    .line 363
    if-eqz p2, :cond_2

    .line 364
    iget-object v0, p0, Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity$10;->b:Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;->h(Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;)V

    .line 366
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity$10;->b:Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;->f(Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;)Landroid/widget/Switch;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/Switch;->setEnabled(Z)V

    .line 367
    const-string v0, "WeatherReportActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isChecked = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 370
    iget-object v0, p0, Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity$10;->b:Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;->i(Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;)V

    .line 371
    if-eqz p2, :cond_3

    .line 372
    iget-object v0, p0, Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity$10;->b:Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;->g(Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;)Landroid/widget/RelativeLayout;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setEnabled(Z)V

    .line 373
    iget-object v0, p0, Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity$10;->b:Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;->g(Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;)Landroid/widget/RelativeLayout;

    move-result-object v0

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setAlpha(F)V

    .line 374
    iget-object v0, p0, Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity$10;->b:Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;->a(Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;)Landroid/widget/RadioButton;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setClickable(Z)V

    .line 375
    iget-object v0, p0, Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity$10;->b:Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;->e(Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;)Landroid/widget/RadioButton;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setClickable(Z)V

    goto :goto_1

    .line 377
    :cond_3
    iget-object v0, p0, Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity$10;->b:Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;->g(Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;)Landroid/widget/RelativeLayout;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setEnabled(Z)V

    .line 378
    iget-object v0, p0, Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity$10;->b:Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;->g(Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;)Landroid/widget/RelativeLayout;

    move-result-object v0

    const v1, 0x3e99999a    # 0.3f

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setAlpha(F)V

    .line 379
    iget-object v0, p0, Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity$10;->b:Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;->a(Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;)Landroid/widget/RadioButton;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setClickable(Z)V

    .line 380
    iget-object v0, p0, Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity$10;->b:Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;->e(Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;)Landroid/widget/RadioButton;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setClickable(Z)V

    .line 383
    :goto_1
    iget-object v0, p0, Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity$10;->b:Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;->b(Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;)Lo/enz;

    move-result-object v0

    invoke-virtual {v0, p2}, Lo/enz;->e(Z)V

    .line 384
    iget-object v0, p0, Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity$10;->b:Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;->n(Lcom/huawei/ui/device/activity/weatherreport/WeatherReportActivity;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x0

    const-wide/16 v2, 0x12c

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 386
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 387
    const-string v0, "click"

    const-string v1, "1"

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 388
    if-eqz p2, :cond_4

    .line 389
    const-string v0, "status"

    const-string v1, "1"

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    .line 392
    :cond_4
    const-string v0, "status"

    const-string v1, "0"

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 394
    :goto_2
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    sget-object v2, Lo/dae;->ip:Lo/dae;

    invoke-virtual {v2}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v5, v3}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 395
    return-void
.end method
