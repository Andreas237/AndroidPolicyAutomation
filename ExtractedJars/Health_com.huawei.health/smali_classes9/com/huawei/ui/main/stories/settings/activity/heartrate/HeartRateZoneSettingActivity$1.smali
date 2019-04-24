.class Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->e()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;)V
    .locals 0

    .line 335
    iput-object p1, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity$1;->b:Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 339
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity$1;->b:Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->n(Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;)V

    .line 341
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity$1;->b:Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;

    invoke-static {}, Lo/dgu;->c()Lo/dgu;

    move-result-object v1

    invoke-virtual {v1}, Lo/dgu;->x()I

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->a(Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;I)V

    .line 342
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity$1;->b:Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;

    invoke-static {}, Lo/dgu;->c()Lo/dgu;

    move-result-object v1

    invoke-virtual {v1}, Lo/dgu;->x()I

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->k(Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;I)V

    .line 343
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity$1;->b:Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->d(Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 344
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity$1;->b:Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->f(Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;)V

    goto :goto_0

    .line 346
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity$1;->b:Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->l(Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;)V

    .line 348
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity$1;->b:Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->p(Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;)V

    .line 349
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity$1;->b:Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;->m(Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;)V

    .line 352
    return-void
.end method
