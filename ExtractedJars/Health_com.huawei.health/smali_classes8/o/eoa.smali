.class public Lo/eoa;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private d:Lo/dip;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    invoke-static {}, Lo/dip;->d()Lo/dip;

    move-result-object v0

    iput-object v0, p0, Lo/eoa;->d:Lo/dip;

    .line 32
    return-void
.end method


# virtual methods
.method public c(Ljava/lang/String;)I
    .locals 1

    .line 40
    iget-object v0, p0, Lo/eoa;->d:Lo/dip;

    invoke-virtual {v0, p1}, Lo/dip;->a(Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public c()Z
    .locals 1

    .line 57
    iget-object v0, p0, Lo/eoa;->d:Lo/dip;

    invoke-virtual {v0}, Lo/dip;->c()Z

    move-result v0

    return v0
.end method

.method public d()Z
    .locals 1

    .line 80
    iget-object v0, p0, Lo/eoa;->d:Lo/dip;

    invoke-virtual {v0}, Lo/dip;->g()Z

    move-result v0

    return v0
.end method

.method public e(I)V
    .locals 2

    .line 65
    iget-object v0, p0, Lo/eoa;->d:Lo/dip;

    const-string v1, "notificationStatus"

    invoke-virtual {v0, v1, p1}, Lo/dip;->e(Ljava/lang/String;I)V

    .line 66
    return-void
.end method

.method public e(Landroid/content/Context;)V
    .locals 2

    .line 99
    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.settings.ACTION_NOTIFICATION_LISTENER_SETTINGS"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 100
    return-void
.end method

.method public e(Ljava/lang/String;I)V
    .locals 1

    .line 49
    iget-object v0, p0, Lo/eoa;->d:Lo/dip;

    invoke-virtual {v0, p1, p2}, Lo/dip;->d(Ljava/lang/String;I)V

    .line 50
    return-void
.end method

.method public e(ZLcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 4

    .line 89
    const-string v0, "NotificationPushUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "setRotateSwitchScreenSwitchStatus() Status "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 90
    iget-object v0, p0, Lo/eoa;->d:Lo/dip;

    invoke-virtual {v0, p1, p2}, Lo/dip;->a(ZLcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 91
    return-void
.end method

.method public e()Z
    .locals 1

    .line 72
    iget-object v0, p0, Lo/eoa;->d:Lo/dip;

    invoke-virtual {v0}, Lo/dip;->a()Z

    move-result v0

    return v0
.end method
