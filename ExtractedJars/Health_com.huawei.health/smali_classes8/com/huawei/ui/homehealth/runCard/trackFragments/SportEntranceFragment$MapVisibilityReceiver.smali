.class public Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$MapVisibilityReceiver;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "MapVisibilityReceiver"
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;


# direct methods
.method public constructor <init>(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;)V
    .locals 0

    .line 1197
    iput-object p1, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$MapVisibilityReceiver;->b:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 4

    .line 1201
    const-string v0, "Track_SportEntranceFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MapVisibilityReceiver"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1202
    if-eqz p2, :cond_0

    .line 1203
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$MapVisibilityReceiver;->b:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;

    const-string v1, "MapVisibility"

    const/4 v2, 0x1

    invoke-virtual {p2, v1, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->d(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;Z)Z

    .line 1204
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$MapVisibilityReceiver;->b:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->p(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;)Landroid/app/Activity;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$MapVisibilityReceiver;->b:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;

    invoke-virtual {v0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->isAdded()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1205
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$MapVisibilityReceiver;->b:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->p(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;)Landroid/app/Activity;

    move-result-object v0

    new-instance v1, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$MapVisibilityReceiver$2;

    invoke-direct {v1, p0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$MapVisibilityReceiver$2;-><init>(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$MapVisibilityReceiver;)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 1244
    :cond_0
    return-void
.end method
