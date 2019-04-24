.class Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "b"
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;


# direct methods
.method private constructor <init>(Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;)V
    .locals 0

    .line 424
    iput-object p1, p0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity$b;->e:Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity$2;)V
    .locals 0

    .line 424
    invoke-direct {p0, p1}, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity$b;-><init>(Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;)V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 427
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity$b;->e:Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->e(Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;Z)Z

    .line 428
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity$b;->e:Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;

    invoke-virtual {v0}, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->d()V

    .line 429
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity$b;->e:Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->c(Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;)Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity$c;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity$c;->sendEmptyMessage(I)Z

    .line 430
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity$b;->e:Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->e(Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;Z)Z

    .line 431
    return-void
.end method
