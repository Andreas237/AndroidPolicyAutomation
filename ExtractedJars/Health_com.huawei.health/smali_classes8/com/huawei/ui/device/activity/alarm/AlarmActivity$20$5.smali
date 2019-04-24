.class Lcom/huawei/ui/device/activity/alarm/AlarmActivity$20$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/device/activity/alarm/AlarmActivity$20;->onResponse(ILjava/lang/Object;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/ui/device/activity/alarm/AlarmActivity$20;

.field final synthetic e:Z


# direct methods
.method constructor <init>(Lcom/huawei/ui/device/activity/alarm/AlarmActivity$20;Z)V
    .locals 0

    .line 591
    iput-object p1, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$20$5;->a:Lcom/huawei/ui/device/activity/alarm/AlarmActivity$20;

    iput-boolean p2, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$20$5;->e:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 594
    iget-boolean v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$20$5;->e:Z

    if-eqz v0, :cond_0

    .line 595
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$20$5;->a:Lcom/huawei/ui/device/activity/alarm/AlarmActivity$20;

    iget-object v0, v0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$20;->c:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    invoke-virtual {v0}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->c()V

    goto :goto_0

    .line 597
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$20$5;->a:Lcom/huawei/ui/device/activity/alarm/AlarmActivity$20;

    iget-object v0, v0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$20;->c:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->D(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)Landroid/widget/Switch;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/Switch;->setChecked(Z)V

    .line 600
    :goto_0
    return-void
.end method
