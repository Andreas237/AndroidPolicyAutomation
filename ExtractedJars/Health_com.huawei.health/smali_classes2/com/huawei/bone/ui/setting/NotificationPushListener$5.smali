.class Lcom/huawei/bone/ui/setting/NotificationPushListener$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/bone/ui/setting/NotificationPushListener;->onNotificationRemoved(Landroid/service/notification/StatusBarNotification;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/bone/ui/setting/NotificationPushListener;

.field final synthetic d:Landroid/service/notification/StatusBarNotification;


# direct methods
.method constructor <init>(Lcom/huawei/bone/ui/setting/NotificationPushListener;Landroid/service/notification/StatusBarNotification;)V
    .locals 0

    .line 195
    iput-object p1, p0, Lcom/huawei/bone/ui/setting/NotificationPushListener$5;->b:Lcom/huawei/bone/ui/setting/NotificationPushListener;

    iput-object p2, p0, Lcom/huawei/bone/ui/setting/NotificationPushListener$5;->d:Landroid/service/notification/StatusBarNotification;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 10

    .line 198
    invoke-static {}, Lo/ddq;->d()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 199
    iget-object v0, p0, Lcom/huawei/bone/ui/setting/NotificationPushListener$5;->b:Lcom/huawei/bone/ui/setting/NotificationPushListener;

    invoke-virtual {v0}, Lcom/huawei/bone/ui/setting/NotificationPushListener;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const-string v1, "sms_default_application"

    invoke-static {v0, v1}, Landroid/provider/Settings$Secure;->getString(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 200
    iget-object v0, p0, Lcom/huawei/bone/ui/setting/NotificationPushListener$5;->d:Landroid/service/notification/StatusBarNotification;

    invoke-virtual {v0}, Landroid/service/notification/StatusBarNotification;->getPackageName()Ljava/lang/String;

    move-result-object v5

    .line 201
    iget-object v0, p0, Lcom/huawei/bone/ui/setting/NotificationPushListener$5;->d:Landroid/service/notification/StatusBarNotification;

    invoke-virtual {v0}, Landroid/service/notification/StatusBarNotification;->getId()I

    move-result v6

    .line 203
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 204
    invoke-static {}, Lo/dbf;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    const/16 v0, 0x56e

    if-ne v6, v0, :cond_0

    .line 206
    const-string v0, "NotificationPushListener"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "EMUI 1390 sms, filter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 207
    return-void

    .line 210
    :cond_0
    iget-object v0, p0, Lcom/huawei/bone/ui/setting/NotificationPushListener$5;->d:Landroid/service/notification/StatusBarNotification;

    invoke-virtual {v0}, Landroid/service/notification/StatusBarNotification;->getNotification()Landroid/app/Notification;

    move-result-object v7

    .line 211
    const/4 v8, -0x1

    .line 212
    if-eqz v7, :cond_1

    .line 213
    iget v8, v7, Landroid/app/Notification;->flags:I

    .line 216
    :cond_1
    and-int/lit8 v0, v8, 0x20

    const/16 v1, 0x20

    if-ne v0, v1, :cond_2

    .line 217
    const-string v0, "NotificationPushListener"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onNotificationRemoved, no_clear message filter,return"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 218
    return-void

    .line 221
    :cond_2
    const/4 v0, 0x2

    if-ne v8, v0, :cond_3

    .line 222
    const-string v0, "NotificationPushListener"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onNotificationRemoved, ongoing message filter,return"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 223
    return-void

    .line 225
    :cond_3
    new-instance v9, Landroid/content/Intent;

    iget-object v0, p0, Lcom/huawei/bone/ui/setting/NotificationPushListener$5;->b:Lcom/huawei/bone/ui/setting/NotificationPushListener;

    const-class v1, Lcom/huawei/bone/ui/setting/NotificationService;

    invoke-direct {v9, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 226
    const-string v0, "com.huawei.bone.ACTION_NOTIFICATION_DELETE"

    invoke-virtual {v9, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 227
    const-string v0, "data"

    iget-object v1, p0, Lcom/huawei/bone/ui/setting/NotificationPushListener$5;->d:Landroid/service/notification/StatusBarNotification;

    invoke-virtual {v1}, Landroid/service/notification/StatusBarNotification;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v9, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 228
    iget-object v0, p0, Lcom/huawei/bone/ui/setting/NotificationPushListener$5;->b:Lcom/huawei/bone/ui/setting/NotificationPushListener;

    invoke-virtual {v0, v9}, Lcom/huawei/bone/ui/setting/NotificationPushListener;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 230
    :cond_4
    return-void
.end method
