.class public Lcom/huawei/wallet/ui/idencard/camera/bankcard/BankCardDecodeThread;
.super Lcom/huawei/wallet/ui/idencard/camera/base/DecodeThread;
.source "SourceFile"


# direct methods
.method public constructor <init>(Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivity;)V
    .locals 0

    .line 22
    invoke-direct {p0, p1}, Lcom/huawei/wallet/ui/idencard/camera/base/DecodeThread;-><init>(Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivity;)V

    .line 23
    return-void
.end method


# virtual methods
.method public d(Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivity;)Lcom/huawei/wallet/ui/idencard/camera/base/DecodeHandler;
    .locals 1

    .line 28
    new-instance v0, Lcom/huawei/wallet/ui/idencard/camera/bankcard/BankCardDecodeHandler;

    invoke-direct {v0, p1}, Lcom/huawei/wallet/ui/idencard/camera/bankcard/BankCardDecodeHandler;-><init>(Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivity;)V

    return-object v0
.end method
