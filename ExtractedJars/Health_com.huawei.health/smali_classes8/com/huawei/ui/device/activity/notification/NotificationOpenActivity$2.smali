.class Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;)V
    .locals 0

    .line 256
    iput-object p1, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity$2;->d:Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 7

    .line 260
    const-string v0, "NotificationOpenActivity"

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

    .line 262
    const-string v4, ""

    .line 263
    if-eqz p2, :cond_2

    .line 264
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity$2;->d:Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->c(Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;)Lo/eoa;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/eoa;->e(I)V

    .line 265
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity$2;->d:Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->c(Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;)Lo/eoa;

    move-result-object v0

    invoke-virtual {v0}, Lo/eoa;->e()Z

    move-result v0

    if-nez v0, :cond_0

    .line 266
    const-string v0, "NotificationOpenActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mNotificationSwitch isAuthorizeEnabled = false"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 267
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity$2;->d:Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->c(Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;)Lo/eoa;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity$2;->d:Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;

    invoke-static {v1}, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->e(Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/eoa;->e(Landroid/content/Context;)V

    .line 269
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity$2;->d:Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->a(Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;)Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity$d;

    move-result-object v0

    const/4 v1, 0x1

    const-wide/16 v2, 0x64

    invoke-virtual {v0, v1, v2, v3}, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity$d;->sendEmptyMessageDelayed(IJ)Z

    goto :goto_0

    .line 271
    :cond_0
    const-string v0, "NotificationOpenActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "on switch status changed,isAuthorizeEnabled = true"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 272
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity$2;->d:Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->k(Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 273
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity$2;->d:Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->f(Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;)Landroid/widget/ListView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setVisibility(I)V

    .line 274
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity$2;->d:Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->h(Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;)Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity$e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity$e;->e()V

    .line 275
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity$2;->d:Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->a(Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;)Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity$d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity$d;->sendEmptyMessage(I)Z

    .line 278
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity$2;->d:Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->b(Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;)V

    .line 280
    :goto_0
    const-string v4, "1"

    .line 281
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity$2;->d:Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->i(Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;)Lo/egd;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/egd;->setEnabled(Z)V

    .line 282
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity$2;->d:Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->g(Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;)Lo/egd;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egd;->setEnabled(Z)V

    .line 283
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity$2;->d:Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->g(Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;)Lo/egd;

    move-result-object v0

    const v1, 0x3e99999a    # 0.3f

    invoke-virtual {v0, v1}, Lo/egd;->setAlpha(F)V

    .line 284
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity$2;->d:Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->m(Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;)Landroid/widget/TextView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_1

    .line 287
    :cond_2
    const-string v4, "0"

    .line 288
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity$2;->d:Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->i(Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;)Lo/egd;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egd;->setEnabled(Z)V

    .line 289
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity$2;->d:Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->g(Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;)Lo/egd;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/egd;->setEnabled(Z)V

    .line 290
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity$2;->d:Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->g(Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;)Lo/egd;

    move-result-object v0

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1}, Lo/egd;->setAlpha(F)V

    .line 291
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity$2;->d:Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->m(Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;)Landroid/widget/TextView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 292
    const-string v0, "NotificationOpenActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "on switch status changed,isAuthorizeEnabled = false"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 293
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity$2;->d:Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->h(Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;)Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity$e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity$e;->d()V

    .line 294
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity$2;->d:Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->c(Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;)Lo/eoa;

    move-result-object v0

    invoke-virtual {v0}, Lo/eoa;->c()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 295
    const-string v0, "NotificationOpenActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mNotificationSwitch isAuthorizeEnabled = true"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 296
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity$2;->d:Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->p(Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;)V

    .line 301
    :cond_3
    :goto_1
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 302
    const-string v0, "click"

    const-string v1, "1"

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 303
    const-string v0, "status"

    invoke-interface {v5, v0, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 304
    sget-object v0, Lo/dae;->iF:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v6

    .line 305
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity$2;->d:Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;

    invoke-static {v1}, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->e(Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;)Landroid/content/Context;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v6, v5, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 306
    const-string v0, "NotificationOpenActivity"

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

    .line 307
    return-void
.end method
