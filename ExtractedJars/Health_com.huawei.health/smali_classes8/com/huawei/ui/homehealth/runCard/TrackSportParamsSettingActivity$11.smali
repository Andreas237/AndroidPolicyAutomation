.class Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity$11;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/animation/Animation$AnimationListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->onClick(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;)V
    .locals 0

    .line 698
    iput-object p1, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity$11;->c:Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 3

    .line 706
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity$11;->c:Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->d(Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;)Landroid/content/Context;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 707
    invoke-static {}, Lo/cbl;->b()Lo/cbl;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity$11;->c:Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;

    invoke-static {v1}, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->d(Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/cbl;->e(Landroid/content/Context;)V

    .line 709
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity$11;->c:Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->c(Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;Z)Z

    .line 710
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity$11;->c:Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;

    invoke-virtual {v0}, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->finish()V

    .line 711
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity$11;->c:Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->overridePendingTransition(II)V

    .line 712
    return-void
.end method

.method public onAnimationRepeat(Landroid/view/animation/Animation;)V
    .locals 0

    .line 717
    return-void
.end method

.method public onAnimationStart(Landroid/view/animation/Animation;)V
    .locals 0

    .line 702
    return-void
.end method
