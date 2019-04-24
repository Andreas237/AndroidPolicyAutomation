.class Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/dhl;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;
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

    .line 230
    iput-object p1, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity$1;->a:Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 2

    .line 233
    invoke-static {p1}, Lo/dhr;->c(I)I

    move-result v1

    .line 234
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity$1;->a:Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->c(Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;)I

    move-result v0

    if-eq v0, p1, :cond_0

    .line 235
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity$1;->a:Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;

    invoke-virtual {v0, v1}, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->b(I)V

    .line 236
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity$1;->a:Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;

    invoke-static {v0, p1}, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->b(Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;I)I

    .line 238
    :cond_0
    return-void
.end method
