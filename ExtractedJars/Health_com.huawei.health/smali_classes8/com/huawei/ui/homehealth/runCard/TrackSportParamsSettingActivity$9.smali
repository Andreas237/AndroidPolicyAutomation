.class Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity$9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->i()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;)V
    .locals 0

    .line 351
    iput-object p1, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity$9;->d:Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 354
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity$9;->d:Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;

    const-string v1, "action_stop_play_sport_music"

    invoke-static {v0, v1}, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->b(Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;Ljava/lang/String;)V

    .line 355
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity$9;->d:Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;

    invoke-virtual {v0}, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->finish()V

    .line 356
    return-void
.end method
