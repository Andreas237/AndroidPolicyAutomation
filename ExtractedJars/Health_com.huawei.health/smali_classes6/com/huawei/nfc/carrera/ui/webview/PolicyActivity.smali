.class public Lcom/huawei/nfc/carrera/ui/webview/PolicyActivity;
.super Lcom/huawei/nfc/carrera/ui/webview/NormalWebViewActivity;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 12
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/webview/NormalWebViewActivity;-><init>()V

    return-void
.end method


# virtual methods
.method protected initButton()V
    .locals 2

    .line 18
    invoke-super {p0}, Lcom/huawei/nfc/carrera/ui/webview/NormalWebViewActivity;->initButton()V

    .line 19
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/webview/PolicyActivity;->acceptButton:Lo/egd;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/egd;->setVisibility(I)V

    .line 20
    return-void
.end method
