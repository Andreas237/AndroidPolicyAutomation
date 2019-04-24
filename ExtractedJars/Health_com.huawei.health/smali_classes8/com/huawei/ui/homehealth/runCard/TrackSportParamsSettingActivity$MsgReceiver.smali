.class public Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity$MsgReceiver;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "MsgReceiver"
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;


# direct methods
.method public constructor <init>(Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;)V
    .locals 0

    .line 1145
    iput-object p1, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity$MsgReceiver;->c:Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 4

    .line 1149
    const-string v0, "Track_TrackSportParamsSettingActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "on Receive : "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1150
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity$MsgReceiver;->c:Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;

    invoke-virtual {v0}, Lcom/huawei/ui/homehealth/runCard/TrackSportParamsSettingActivity;->finish()V

    .line 1151
    return-void
.end method
