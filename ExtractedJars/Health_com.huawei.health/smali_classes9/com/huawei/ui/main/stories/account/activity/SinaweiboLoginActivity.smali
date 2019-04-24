.class public Lcom/huawei/ui/main/stories/account/activity/SinaweiboLoginActivity;
.super Landroid/app/Activity;
.source "SourceFile"


# instance fields
.field private d:Lo/eub;

.field private e:Lo/euh;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 11
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    .line 21
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/account/activity/SinaweiboLoginActivity;->d:Lo/eub;

    .line 79
    new-instance v0, Lcom/huawei/ui/main/stories/account/activity/SinaweiboLoginActivity$2;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/account/activity/SinaweiboLoginActivity$2;-><init>(Lcom/huawei/ui/main/stories/account/activity/SinaweiboLoginActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/account/activity/SinaweiboLoginActivity;->e:Lo/euh;

    return-void
.end method


# virtual methods
.method protected onActivityResult(IILandroid/content/Intent;)V
    .locals 2

    .line 70
    invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->onActivityResult(IILandroid/content/Intent;)V

    .line 73
    iget-object v0, p0, Lcom/huawei/ui/main/stories/account/activity/SinaweiboLoginActivity;->d:Lo/eub;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 74
    iget-object v0, p0, Lcom/huawei/ui/main/stories/account/activity/SinaweiboLoginActivity;->d:Lo/eub;

    invoke-virtual {v0, p1, p2, p3}, Lo/eub;->b(IILandroid/content/Intent;)V

    .line 77
    :cond_0
    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 2

    .line 25
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 28
    new-instance v0, Lo/eub;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/account/activity/SinaweiboLoginActivity;->e:Lo/euh;

    invoke-direct {v0, p0, v1}, Lo/eub;-><init>(Landroid/app/Activity;Lo/euh;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/account/activity/SinaweiboLoginActivity;->d:Lo/eub;

    .line 30
    iget-object v0, p0, Lcom/huawei/ui/main/stories/account/activity/SinaweiboLoginActivity;->d:Lo/eub;

    invoke-virtual {v0}, Lo/eub;->c()V

    .line 31
    return-void
.end method

.method protected onDestroy()V
    .locals 0

    .line 63
    invoke-super {p0}, Landroid/app/Activity;->onDestroy()V

    .line 66
    return-void
.end method

.method protected onPause()V
    .locals 0

    .line 49
    invoke-super {p0}, Landroid/app/Activity;->onPause()V

    .line 52
    return-void
.end method

.method protected onResume()V
    .locals 0

    .line 42
    invoke-super {p0}, Landroid/app/Activity;->onResume()V

    .line 45
    return-void
.end method

.method protected onStart()V
    .locals 0

    .line 35
    invoke-super {p0}, Landroid/app/Activity;->onStart()V

    .line 38
    return-void
.end method

.method protected onStop()V
    .locals 0

    .line 56
    invoke-super {p0}, Landroid/app/Activity;->onStop()V

    .line 59
    return-void
.end method
