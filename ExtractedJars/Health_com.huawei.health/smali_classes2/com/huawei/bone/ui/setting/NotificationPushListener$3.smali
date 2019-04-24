.class Lcom/huawei/bone/ui/setting/NotificationPushListener$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/bone/ui/setting/NotificationPushListener;->c(Landroid/service/notification/StatusBarNotification;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/bone/ui/setting/NotificationPushListener;

.field final synthetic e:Landroid/service/notification/StatusBarNotification;


# direct methods
.method constructor <init>(Lcom/huawei/bone/ui/setting/NotificationPushListener;Landroid/service/notification/StatusBarNotification;)V
    .locals 0

    .line 136
    iput-object p1, p0, Lcom/huawei/bone/ui/setting/NotificationPushListener$3;->b:Lcom/huawei/bone/ui/setting/NotificationPushListener;

    iput-object p2, p0, Lcom/huawei/bone/ui/setting/NotificationPushListener$3;->e:Landroid/service/notification/StatusBarNotification;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 16

    .line 140
    :try_start_0
    invoke-static {}, Lo/ddq;->d()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 141
    new-instance v4, Landroid/content/Intent;

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/bone/ui/setting/NotificationPushListener$3;->b:Lcom/huawei/bone/ui/setting/NotificationPushListener;

    const-class v1, Lcom/huawei/bone/ui/setting/NotificationService;

    invoke-direct {v4, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 142
    const-string v0, "com.huawei.bone.ACTION_NOTIFICATION_POST"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 143
    new-instance v5, Landroid/os/Bundle;

    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    .line 144
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/bone/ui/setting/NotificationPushListener$3;->e:Landroid/service/notification/StatusBarNotification;

    invoke-virtual {v0}, Landroid/service/notification/StatusBarNotification;->getPackageName()Ljava/lang/String;

    move-result-object v6

    .line 145
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/bone/ui/setting/NotificationPushListener$3;->e:Landroid/service/notification/StatusBarNotification;

    invoke-virtual {v0}, Landroid/service/notification/StatusBarNotification;->getId()I

    move-result v7

    .line 146
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/bone/ui/setting/NotificationPushListener$3;->e:Landroid/service/notification/StatusBarNotification;

    invoke-virtual {v0}, Landroid/service/notification/StatusBarNotification;->getNotification()Landroid/app/Notification;

    move-result-object v8

    .line 147
    const/4 v9, 0x0

    .line 148
    const/4 v10, -0x1

    .line 149
    const/4 v11, 0x0

    .line 150
    const/4 v12, 0x0

    .line 151
    const/4 v13, 0x0

    .line 152
    if-eqz v8, :cond_2

    .line 153
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_0

    .line 154
    iget-object v9, v8, Landroid/app/Notification;->category:Ljava/lang/String;

    .line 156
    :cond_0
    iget v10, v8, Landroid/app/Notification;->flags:I

    .line 157
    iget-object v14, v8, Landroid/app/Notification;->extras:Landroid/os/Bundle;

    .line 160
    if-eqz v14, :cond_2

    .line 161
    const-string v0, "android.title"

    invoke-virtual {v14, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    .line 162
    const-string v0, "android.text"

    invoke-virtual {v14, v0}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object v15

    .line 163
    const/4 v0, 0x0

    if-eq v0, v15, :cond_1

    invoke-interface {v15}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v12

    goto :goto_0

    :cond_1
    const/4 v12, 0x0

    .line 164
    :goto_0
    const-string v0, "hw_notification_type"

    invoke-virtual {v14, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    .line 168
    :cond_2
    const-string v14, ""

    .line 169
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x14

    if-lt v0, v1, :cond_3

    .line 170
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/bone/ui/setting/NotificationPushListener$3;->e:Landroid/service/notification/StatusBarNotification;

    invoke-virtual {v0}, Landroid/service/notification/StatusBarNotification;->getTag()Ljava/lang/String;

    move-result-object v14

    .line 172
    :cond_3
    const-string v0, "data_tag"

    invoke-virtual {v5, v0, v14}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 173
    const-string v0, "data_package_name"

    invoke-virtual {v5, v0, v6}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 174
    const-string v0, "data_noty_id"

    invoke-virtual {v5, v0, v7}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 175
    const-string v0, "data_category"

    invoke-virtual {v5, v0, v9}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 176
    const-string v0, "data_flags"

    invoke-virtual {v5, v0, v10}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 177
    const-string v0, "data_extra_title"

    invoke-virtual {v5, v0, v11}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 178
    const-string v0, "data_extra_text"

    invoke-virtual {v5, v0, v12}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 179
    const-string v0, "data_extra_noty_type"

    invoke-virtual {v5, v0, v13}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 180
    invoke-virtual {v4, v5}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 181
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/bone/ui/setting/NotificationPushListener$3;->b:Lcom/huawei/bone/ui/setting/NotificationPushListener;

    invoke-virtual {v0, v4}, Lcom/huawei/bone/ui/setting/NotificationPushListener;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 185
    :cond_4
    goto :goto_1

    .line 183
    :catch_0
    move-exception v4

    .line 184
    const-string v0, "NotificationPushListener"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handlePostedNotification, Exception = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 186
    :goto_1
    return-void
.end method
