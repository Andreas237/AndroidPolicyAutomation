.class Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->d()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;)V
    .locals 0

    .line 569
    iput-object p1, p0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity$4;->a:Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 572
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity$4;->a:Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->f(Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;)Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity$a;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity$4;->a:Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;

    invoke-static {v1}, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->m(Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity$a;->e(Ljava/util/List;)V

    .line 573
    return-void
.end method
