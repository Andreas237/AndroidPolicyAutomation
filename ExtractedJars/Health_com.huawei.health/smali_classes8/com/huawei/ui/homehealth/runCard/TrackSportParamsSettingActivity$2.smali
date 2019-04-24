.class Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity$2;
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
.field final synthetic b:Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;)V
    .locals 0

    .line 997
    iput-object p1, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity$2;->b:Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1000
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity$2;->b:Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->m(Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;)Landroid/widget/TextView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 1001
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity$2;->b:Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->l(Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;)Landroid/widget/ImageView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 1002
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity$2;->b:Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->p(Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;)Landroid/widget/TextView;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$string;->IDS_hwh_motiontrack_show_sport_gps_searching:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 1005
    return-void
.end method
