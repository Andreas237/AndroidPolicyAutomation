.class public Lcom/huawei/sim/esim/view/ScanFailActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private d:Lo/egd;

.field private e:Lo/emr;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 18
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 66
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/huawei/sim/R$id;->rescan_qrcode_button:I

    if-ne v0, v1, :cond_0

    .line 67
    new-instance v2, Landroid/content/Intent;

    const-class v0, Lcom/huawei/sim/esim/qrcode/QrCodeActivity;

    invoke-direct {v2, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 68
    invoke-virtual {p0, v2}, Lcom/huawei/sim/esim/view/ScanFailActivity;->startActivity(Landroid/content/Intent;)V

    .line 69
    invoke-virtual {p0}, Lcom/huawei/sim/esim/view/ScanFailActivity;->finish()V

    .line 71
    :cond_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 2

    .line 23
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 24
    sget v0, Lcom/huawei/sim/R$layout;->activity_scan_failed:I

    invoke-virtual {p0, v0}, Lcom/huawei/sim/esim/view/ScanFailActivity;->setContentView(I)V

    .line 25
    sget v0, Lcom/huawei/sim/R$id;->rescan_qrcode_button:I

    invoke-virtual {p0, v0}, Lcom/huawei/sim/esim/view/ScanFailActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/sim/esim/view/ScanFailActivity;->d:Lo/egd;

    .line 26
    iget-object v0, p0, Lcom/huawei/sim/esim/view/ScanFailActivity;->d:Lo/egd;

    invoke-virtual {v0, p0}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 27
    sget v0, Lcom/huawei/sim/R$id;->scan_fail_title_bar:I

    invoke-virtual {p0, v0}, Lcom/huawei/sim/esim/view/ScanFailActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emr;

    iput-object v0, p0, Lcom/huawei/sim/esim/view/ScanFailActivity;->e:Lo/emr;

    .line 28
    iget-object v0, p0, Lcom/huawei/sim/esim/view/ScanFailActivity;->e:Lo/emr;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/emr;->setLeftButtonClickable(Z)V

    .line 29
    iget-object v0, p0, Lcom/huawei/sim/esim/view/ScanFailActivity;->e:Lo/emr;

    new-instance v1, Lcom/huawei/sim/esim/view/ScanFailActivity$4;

    invoke-direct {v1, p0}, Lcom/huawei/sim/esim/view/ScanFailActivity$4;-><init>(Lcom/huawei/sim/esim/view/ScanFailActivity;)V

    invoke-virtual {v0, v1}, Lo/emr;->setLeftButtonOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 37
    return-void
.end method

.method public onDestroy()V
    .locals 0

    .line 51
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onDestroy()V

    .line 52
    return-void
.end method

.method public onPause()V
    .locals 0

    .line 46
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onPause()V

    .line 47
    return-void
.end method

.method public onResume()V
    .locals 0

    .line 41
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onResume()V

    .line 42
    return-void
.end method

.method public onStart()V
    .locals 0

    .line 56
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onStart()V

    .line 57
    return-void
.end method

.method public onStop()V
    .locals 0

    .line 61
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onStop()V

    .line 62
    return-void
.end method
