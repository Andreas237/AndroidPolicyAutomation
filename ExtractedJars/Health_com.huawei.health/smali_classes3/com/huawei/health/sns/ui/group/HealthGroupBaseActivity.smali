.class public Lcom/huawei/health/sns/ui/group/HealthGroupBaseActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 12
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    return-void
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 0

    .line 26
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 28
    invoke-static {p0}, Lo/bhq;->e(Landroid/app/Activity;)V

    .line 29
    return-void
.end method

.method protected onRestoreInstanceState(Landroid/os/Bundle;)V
    .locals 0

    .line 20
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onRestoreInstanceState(Landroid/os/Bundle;)V

    .line 21
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupBaseActivity;->finish()V

    .line 22
    return-void
.end method
