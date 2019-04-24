.class public Lcom/huawei/wallet/ui/idencard/camera/hcoincard/HCoinCardCaptureResultActivity;
.super Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureResultActivity;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 20
    invoke-direct {p0}, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureResultActivity;-><init>()V

    return-void
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 2

    .line 25
    invoke-static {}, Lcom/huawei/wallet/ui/idencard/camera/base/CardResultInfoManager;->b()Lcom/huawei/wallet/ui/idencard/camera/base/CardResultInfoManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/wallet/ui/idencard/camera/base/CardResultInfoManager;->d()Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/hcoincard/HCoinCardCaptureResultActivity;->k:Landroid/graphics/Bitmap;

    .line 26
    invoke-super {p0, p1}, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureResultActivity;->onCreate(Landroid/os/Bundle;)V

    .line 27
    sget v0, Lcom/huawei/base/R$string;->wallet_camera_confirm_hcoincard_info:I

    invoke-virtual {p0, v0}, Lcom/huawei/wallet/ui/idencard/camera/hcoincard/HCoinCardCaptureResultActivity;->e(I)V

    .line 28
    sget v0, Lcom/huawei/base/R$id;->card_tips:I

    invoke-virtual {p0, v0}, Lcom/huawei/wallet/ui/idencard/camera/hcoincard/HCoinCardCaptureResultActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Landroid/widget/TextView;

    .line 29
    sget v0, Lcom/huawei/base/R$string;->wallet_camera_confirm_hcoincard_tips:I

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(I)V

    .line 30
    return-void
.end method
