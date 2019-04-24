.class Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->b(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;)V
    .locals 0

    .line 1009
    iput-object p1, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity$3;->a:Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1012
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity$3;->a:Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->m(Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;)Landroid/widget/TextView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 1013
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity$3;->a:Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->l(Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;)Landroid/widget/ImageView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 1014
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity$3;->a:Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->l(Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;)Landroid/widget/ImageView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity$3;->a:Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;

    invoke-static {v1}, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->d(Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homehealth/R$drawable;->track_ic_health_running_signal1:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 1015
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity$3;->a:Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->p(Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;)Landroid/widget/TextView;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$string;->IDS_motiontrack_page_gps:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 1016
    return-void
.end method
