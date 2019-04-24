.class Lcom/huawei/ui/device/activity/alarm/AlarmActivity$12;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->h()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)V
    .locals 0

    .line 507
    iput-object p1, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$12;->c:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 509
    const-string v0, "AlarmActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "InteligenteClick"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 510
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$12;->c:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->D(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)Landroid/widget/Switch;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Switch;->isChecked()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 511
    const-string v0, "AlarmActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "InteligenteClick1"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 512
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$12;->c:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    invoke-virtual {v0}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->d()V

    goto :goto_0

    .line 514
    :cond_0
    const-string v0, "AlarmActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "InteligenteClick2"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 515
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$12;->c:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->D(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)Landroid/widget/Switch;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/Switch;->setChecked(Z)V

    .line 517
    :goto_0
    return-void
.end method
