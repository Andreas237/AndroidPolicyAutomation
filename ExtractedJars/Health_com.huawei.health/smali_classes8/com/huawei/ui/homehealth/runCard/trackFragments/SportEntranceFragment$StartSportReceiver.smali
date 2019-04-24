.class public Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$StartSportReceiver;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "StartSportReceiver"
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;


# direct methods
.method public constructor <init>(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;)V
    .locals 0

    .line 1248
    iput-object p1, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$StartSportReceiver;->a:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 4

    .line 1252
    const-string v0, "Track_SportEntranceFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "StartSportReceiver"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1254
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$StartSportReceiver;->a:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->i(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;)I

    move-result v0

    const/16 v1, 0x108

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$StartSportReceiver;->a:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->u(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1255
    invoke-static {}, Lo/dhg;->d()Lo/dhg;

    move-result-object v0

    new-instance v1, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$StartSportReceiver$3;

    invoke-direct {v1, p0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$StartSportReceiver$3;-><init>(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$StartSportReceiver;)V

    const-string v2, "sportTrackTempLocation"

    invoke-virtual {v0, v1, v2}, Lo/dhg;->c(Lo/dhl;Ljava/lang/String;)V

    .line 1305
    :cond_0
    return-void
.end method
