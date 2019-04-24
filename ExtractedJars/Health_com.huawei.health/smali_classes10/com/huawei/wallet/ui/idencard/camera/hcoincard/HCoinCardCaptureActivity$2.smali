.class Lcom/huawei/wallet/ui/idencard/camera/hcoincard/HCoinCardCaptureActivity$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/wallet/ui/idencard/camera/hcoincard/HCoinCardCaptureActivity;->b(J)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/wallet/ui/idencard/camera/hcoincard/HCoinCardCaptureActivity;


# direct methods
.method constructor <init>(Lcom/huawei/wallet/ui/idencard/camera/hcoincard/HCoinCardCaptureActivity;)V
    .locals 0

    .line 155
    iput-object p1, p0, Lcom/huawei/wallet/ui/idencard/camera/hcoincard/HCoinCardCaptureActivity$2;->c:Lcom/huawei/wallet/ui/idencard/camera/hcoincard/HCoinCardCaptureActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    .line 159
    const-string v0, "CardIOActivity.nextActivity().post(Runnable)"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->a(Ljava/lang/String;Z)V

    .line 160
    new-instance v4, Landroid/content/Intent;

    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/hcoincard/HCoinCardCaptureActivity$2;->c:Lcom/huawei/wallet/ui/idencard/camera/hcoincard/HCoinCardCaptureActivity;

    const-class v1, Lcom/huawei/wallet/ui/idencard/camera/hcoincard/HCoinCardCaptureResultActivity;

    invoke-direct {v4, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 162
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/hcoincard/HCoinCardCaptureActivity$2;->c:Lcom/huawei/wallet/ui/idencard/camera/hcoincard/HCoinCardCaptureActivity;

    invoke-virtual {v0}, Lcom/huawei/wallet/ui/idencard/camera/hcoincard/HCoinCardCaptureActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {v4, v0}, Landroid/content/Intent;->putExtras(Landroid/content/Intent;)Landroid/content/Intent;

    .line 163
    const-string v0, "from"

    const-string v1, "intent_card_num"

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 164
    const-string v0, "dataclass"

    const-string v1, "data class getNumbers()2"

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/huawei/wallet/utils/log/LogC;->b(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 165
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/hcoincard/HCoinCardCaptureActivity$2;->c:Lcom/huawei/wallet/ui/idencard/camera/hcoincard/HCoinCardCaptureActivity;

    invoke-static {v0}, Lcom/huawei/wallet/ui/idencard/camera/hcoincard/HCoinCardCaptureActivity;->e(Lcom/huawei/wallet/ui/idencard/camera/hcoincard/HCoinCardCaptureActivity;)Lexocr/base/ExBaseCardInfo;

    move-result-object v0

    invoke-virtual {v0}, Lexocr/base/ExBaseCardInfo;->getCharCount()I

    move-result v0

    new-array v5, v0, [C

    .line 166
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/hcoincard/HCoinCardCaptureActivity$2;->c:Lcom/huawei/wallet/ui/idencard/camera/hcoincard/HCoinCardCaptureActivity;

    invoke-static {v0}, Lcom/huawei/wallet/ui/idencard/camera/hcoincard/HCoinCardCaptureActivity;->b(Lcom/huawei/wallet/ui/idencard/camera/hcoincard/HCoinCardCaptureActivity;)Lexocr/base/ExBaseCardInfo;

    move-result-object v0

    invoke-virtual {v0}, Lexocr/base/ExBaseCardInfo;->getNumbers()[C

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/wallet/ui/idencard/camera/hcoincard/HCoinCardCaptureActivity$2;->c:Lcom/huawei/wallet/ui/idencard/camera/hcoincard/HCoinCardCaptureActivity;

    invoke-static {v1}, Lcom/huawei/wallet/ui/idencard/camera/hcoincard/HCoinCardCaptureActivity;->d(Lcom/huawei/wallet/ui/idencard/camera/hcoincard/HCoinCardCaptureActivity;)Lexocr/base/ExBaseCardInfo;

    move-result-object v1

    invoke-virtual {v1}, Lexocr/base/ExBaseCardInfo;->getCharCount()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v2, v5, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 168
    const-string v0, "number"

    iget-object v1, p0, Lcom/huawei/wallet/ui/idencard/camera/hcoincard/HCoinCardCaptureActivity$2;->c:Lcom/huawei/wallet/ui/idencard/camera/hcoincard/HCoinCardCaptureActivity;

    invoke-static {v1}, Lcom/huawei/wallet/ui/idencard/camera/hcoincard/HCoinCardCaptureActivity;->c(Lcom/huawei/wallet/ui/idencard/camera/hcoincard/HCoinCardCaptureActivity;)Lexocr/base/ExBaseCardInfo;

    move-result-object v1

    invoke-virtual {v1}, Lexocr/base/ExBaseCardInfo;->getStrNumbers()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 169
    const-string v0, "exocr.bankcard.scanResult"

    iget-object v1, p0, Lcom/huawei/wallet/ui/idencard/camera/hcoincard/HCoinCardCaptureActivity$2;->c:Lcom/huawei/wallet/ui/idencard/camera/hcoincard/HCoinCardCaptureActivity;

    invoke-static {v1}, Lcom/huawei/wallet/ui/idencard/camera/hcoincard/HCoinCardCaptureActivity;->k(Lcom/huawei/wallet/ui/idencard/camera/hcoincard/HCoinCardCaptureActivity;)Lexocr/base/ExBaseCardInfo;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 170
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/hcoincard/HCoinCardCaptureActivity$2;->c:Lcom/huawei/wallet/ui/idencard/camera/hcoincard/HCoinCardCaptureActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/ui/idencard/camera/hcoincard/HCoinCardCaptureActivity;->e(Lcom/huawei/wallet/ui/idencard/camera/hcoincard/HCoinCardCaptureActivity;Lexocr/base/ExBaseCardInfo;)Lexocr/base/ExBaseCardInfo;

    .line 172
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/hcoincard/HCoinCardCaptureActivity$2;->c:Lcom/huawei/wallet/ui/idencard/camera/hcoincard/HCoinCardCaptureActivity;

    const/16 v1, 0xb

    invoke-virtual {v0, v4, v1}, Lcom/huawei/wallet/ui/idencard/camera/hcoincard/HCoinCardCaptureActivity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 173
    return-void
.end method
