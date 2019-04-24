.class public Lcom/huawei/wallet/ui/idencard/camera/hcoincard/HCoinCardCaptureActivityHandler;
.super Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivityHandler;
.source "SourceFile"


# direct methods
.method public constructor <init>(Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivity;)V
    .locals 0

    .line 22
    invoke-direct {p0, p1}, Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivityHandler;-><init>(Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivity;)V

    .line 23
    return-void
.end method


# virtual methods
.method public c(Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivity;)Lcom/huawei/wallet/ui/idencard/camera/base/DecodeThread;
    .locals 1

    .line 28
    new-instance v0, Lcom/huawei/wallet/ui/idencard/camera/hcoincard/HCoinCardDecodeThread;

    invoke-direct {v0, p1}, Lcom/huawei/wallet/ui/idencard/camera/hcoincard/HCoinCardDecodeThread;-><init>(Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivity;)V

    return-object v0
.end method
