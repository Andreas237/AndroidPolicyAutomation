.class Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;)V
    .locals 0

    .line 252
    iput-object p1, p0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity$5;->e:Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 7

    .line 256
    const-string v0, "NotificationSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mNotificationSwitch clicked : isChecked = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 258
    const-string v4, ""

    .line 259
    if-eqz p2, :cond_2

    .line 260
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity$5;->e:Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->a(Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;)Lo/eoa;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/eoa;->e(I)V

    .line 261
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity$5;->e:Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->a(Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;)Lo/eoa;

    move-result-object v0

    invoke-virtual {v0}, Lo/eoa;->e()Z

    move-result v0

    if-nez v0, :cond_0

    .line 262
    const-string v0, "NotificationSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "on switch status changed, isAuthorizeEnabled = false"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 263
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity$5;->e:Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->a(Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;)Lo/eoa;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity$5;->e:Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;

    invoke-static {v1}, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->d(Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/eoa;->e(Landroid/content/Context;)V

    .line 265
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity$5;->e:Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->c(Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;)Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity$c;

    move-result-object v0

    const/4 v1, 0x1

    const-wide/16 v2, 0x64

    invoke-virtual {v0, v1, v2, v3}, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity$c;->sendEmptyMessageDelayed(IJ)Z

    goto :goto_0

    .line 267
    :cond_0
    const-string v0, "NotificationSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "on switch status changed,isAuthorizeEnabled = true"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 268
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity$5;->e:Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->g(Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;)Landroid/widget/LinearLayout;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 269
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity$5;->e:Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->h(Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;)Landroid/widget/TextView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 270
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity$5;->e:Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->k(Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 271
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity$5;->e:Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->i(Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;)Landroid/widget/ListView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setVisibility(I)V

    .line 272
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity$5;->e:Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->f(Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;)Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity$a;->e()V

    .line 273
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity$5;->e:Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->c(Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;)Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity$c;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity$c;->sendEmptyMessage(I)Z

    .line 276
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity$5;->e:Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->b(Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;)V

    .line 278
    :goto_0
    const-string v4, "1"

    goto :goto_1

    .line 280
    :cond_2
    const-string v4, "0"

    .line 281
    const-string v0, "NotificationSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "on switch status changed,isAuthorizeEnabled = false"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 282
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity$5;->e:Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->g(Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;)Landroid/widget/LinearLayout;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 283
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity$5;->e:Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->h(Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;)Landroid/widget/TextView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 284
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity$5;->e:Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->f(Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;)Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity$a;->c()V

    .line 285
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity$5;->e:Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->a(Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;)Lo/eoa;

    move-result-object v0

    invoke-virtual {v0}, Lo/eoa;->c()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 286
    const-string v0, "NotificationSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mNotificationSwitch isAuthorizeEnabled = true"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 287
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity$5;->e:Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->l(Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;)V

    .line 292
    :cond_3
    :goto_1
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 293
    const-string v0, "click"

    const-string v1, "1"

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 294
    const-string v0, "status"

    invoke-interface {v5, v0, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 295
    sget-object v0, Lo/dae;->iF:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v6

    .line 296
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity$5;->e:Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;

    invoke-static {v1}, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->d(Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;)Landroid/content/Context;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v6, v5, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 297
    const-string v0, "NotificationSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "BI save notification click event finish, value = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 298
    return-void
.end method
