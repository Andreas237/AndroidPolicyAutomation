.class Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/ems$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;)V
    .locals 0

    .line 512
    iput-object p1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity$3;->d:Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onSingleTap(I)V
    .locals 5

    .line 515
    sparse-switch p1, :sswitch_data_0

    goto/16 :goto_0

    .line 518
    :sswitch_0
    invoke-static {}, Lo/brg;->c()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 519
    const/4 v0, 0x4

    new-array v3, v0, [Ljava/lang/String;

    const-string v0, "android.permission.CAMERA"

    const/4 v1, 0x0

    aput-object v0, v3, v1

    const-string v0, "android.permission.READ_EXTERNAL_STORAGE"

    const/4 v1, 0x1

    aput-object v0, v3, v1

    const-string v0, "android.permission.WRITE_EXTERNAL_STORAGE"

    const/4 v1, 0x2

    aput-object v0, v3, v1

    const-string v0, "android.permission.FLASHLIGHT"

    const/4 v1, 0x3

    aput-object v0, v3, v1

    .line 520
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity$3;->d:Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity$3;->d:Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;

    invoke-virtual {v1}, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_healthshop_permission_str:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v3, v1}, Lo/bhq;->d(Landroid/app/Activity;[Ljava/lang/String;Ljava/lang/String;)Z

    move-result v4

    .line 521
    if-eqz v4, :cond_0

    .line 522
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity$3;->d:Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->a(Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;)V

    .line 524
    :cond_0
    goto :goto_0

    .line 525
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity$3;->d:Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->a(Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;)V

    .line 528
    goto :goto_0

    .line 531
    :sswitch_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity$3;->d:Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->c(Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 532
    new-instance v3, Landroid/content/Intent;

    invoke-direct {v3}, Landroid/content/Intent;-><init>()V

    .line 533
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity$3;->d:Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;

    const-class v1, Lcom/huawei/health/sns/ui/chat/photo/send/HealthAlbumPicBrowserActivity;

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 534
    const-string v0, "isSingle"

    const/4 v1, 0x1

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 535
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity$3;->d:Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;

    const/4 v1, 0x3

    invoke-virtual {v0, v3, v1}, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 536
    .line 542
    :cond_2
    :goto_0
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x1 -> :sswitch_1
    .end sparse-switch
.end method
