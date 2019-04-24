.class Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity$6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->c()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;)V
    .locals 0

    .line 438
    iput-object p1, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity$6;->e:Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 9

    .line 441
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity$6;->e:Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;

    invoke-static {v0, p2}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->b(Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;Z)Z

    .line 442
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity$6;->e:Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->d(Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 443
    invoke-static {}, Lo/dgu;->c()Lo/dgu;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity$6;->e:Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->e(Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;)Z

    move-result v1

    iget-object v2, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity$6;->e:Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;

    invoke-static {v2}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->a(Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;)I

    move-result v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity$6;->e:Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;

    invoke-static {v3}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->b(Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;)I

    move-result v3

    iget-object v4, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity$6;->e:Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;

    invoke-static {v4}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->c(Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;)I

    move-result v4

    iget-object v5, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity$6;->e:Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;

    .line 444
    invoke-static {v5}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->h(Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;)I

    move-result v5

    iget-object v6, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity$6;->e:Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;

    invoke-static {v6}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->i(Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;)I

    move-result v6

    iget-object v7, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity$6;->e:Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;

    invoke-static {v7}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->g(Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;)I

    move-result v7

    iget-object v8, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity$6;->e:Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;

    invoke-static {v8}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->k(Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;)I

    move-result v8

    .line 443
    invoke-virtual/range {v0 .. v8}, Lo/dgu;->c(ZIIIIIII)V

    goto :goto_0

    .line 446
    :cond_0
    invoke-static {}, Lo/dgu;->c()Lo/dgu;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity$6;->e:Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->e(Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;)Z

    move-result v1

    iget-object v2, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity$6;->e:Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;

    invoke-static {v2}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->a(Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;)I

    move-result v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity$6;->e:Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;

    invoke-static {v3}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->b(Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;)I

    move-result v3

    iget-object v4, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity$6;->e:Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;

    invoke-static {v4}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->c(Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;)I

    move-result v4

    iget-object v5, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity$6;->e:Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;

    .line 447
    invoke-static {v5}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->h(Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;)I

    move-result v5

    iget-object v6, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity$6;->e:Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;

    invoke-static {v6}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->i(Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;)I

    move-result v6

    iget-object v7, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity$6;->e:Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;

    invoke-static {v7}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->g(Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;)I

    move-result v7

    iget-object v8, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity$6;->e:Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;

    invoke-static {v8}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->k(Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;)I

    move-result v8

    .line 446
    invoke-virtual/range {v0 .. v8}, Lo/dgu;->d(ZIIIIIII)V

    .line 449
    :goto_0
    if-eqz p2, :cond_1

    .line 450
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity$6;->e:Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;

    sget-object v1, Lo/dae;->gu:Lo/dae;

    invoke-virtual {v1}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v1

    const-string v2, "1"

    invoke-static {v0, v1, v2}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->e(Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    .line 452
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity$6;->e:Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;

    sget-object v1, Lo/dae;->gu:Lo/dae;

    invoke-virtual {v1}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v1

    const-string v2, "2"

    invoke-static {v0, v1, v2}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->e(Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;Ljava/lang/String;Ljava/lang/String;)V

    .line 454
    :goto_1
    return-void
.end method
