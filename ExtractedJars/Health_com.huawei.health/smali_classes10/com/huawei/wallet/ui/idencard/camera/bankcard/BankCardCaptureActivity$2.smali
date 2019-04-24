.class Lcom/huawei/wallet/ui/idencard/camera/bankcard/BankCardCaptureActivity$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/wallet/ui/idencard/camera/bankcard/BankCardCaptureActivity;->d(J)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/wallet/ui/idencard/camera/bankcard/BankCardCaptureActivity;


# direct methods
.method constructor <init>(Lcom/huawei/wallet/ui/idencard/camera/bankcard/BankCardCaptureActivity;)V
    .locals 0

    .line 172
    iput-object p1, p0, Lcom/huawei/wallet/ui/idencard/camera/bankcard/BankCardCaptureActivity$2;->a:Lcom/huawei/wallet/ui/idencard/camera/bankcard/BankCardCaptureActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    .line 176
    const-string v0, "CardIOActivity.nextActivity().post(Runnable)"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->a(Ljava/lang/String;Z)V

    .line 191
    new-instance v4, Landroid/content/Intent;

    invoke-direct {v4}, Landroid/content/Intent;-><init>()V

    .line 192
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/bankcard/BankCardCaptureActivity$2;->a:Lcom/huawei/wallet/ui/idencard/camera/bankcard/BankCardCaptureActivity;

    invoke-virtual {v0}, Lcom/huawei/wallet/ui/idencard/camera/bankcard/BankCardCaptureActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {v4, v0}, Landroid/content/Intent;->putExtras(Landroid/content/Intent;)Landroid/content/Intent;

    .line 193
    const-string v0, "from"

    const-string v1, "intent_card_num"

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 195
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/bankcard/BankCardCaptureActivity$2;->a:Lcom/huawei/wallet/ui/idencard/camera/bankcard/BankCardCaptureActivity;

    invoke-static {v0}, Lcom/huawei/wallet/ui/idencard/camera/bankcard/BankCardCaptureActivity;->e(Lcom/huawei/wallet/ui/idencard/camera/bankcard/BankCardCaptureActivity;)Lexocr/base/ExBaseCardInfo;

    move-result-object v0

    invoke-virtual {v0}, Lexocr/base/ExBaseCardInfo;->getCharCount()I

    move-result v0

    new-array v5, v0, [C

    .line 196
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/bankcard/BankCardCaptureActivity$2;->a:Lcom/huawei/wallet/ui/idencard/camera/bankcard/BankCardCaptureActivity;

    invoke-static {v0}, Lcom/huawei/wallet/ui/idencard/camera/bankcard/BankCardCaptureActivity;->d(Lcom/huawei/wallet/ui/idencard/camera/bankcard/BankCardCaptureActivity;)Lexocr/base/ExBaseCardInfo;

    move-result-object v0

    invoke-virtual {v0}, Lexocr/base/ExBaseCardInfo;->getNumbers()[C

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/wallet/ui/idencard/camera/bankcard/BankCardCaptureActivity$2;->a:Lcom/huawei/wallet/ui/idencard/camera/bankcard/BankCardCaptureActivity;

    invoke-static {v1}, Lcom/huawei/wallet/ui/idencard/camera/bankcard/BankCardCaptureActivity;->c(Lcom/huawei/wallet/ui/idencard/camera/bankcard/BankCardCaptureActivity;)Lexocr/base/ExBaseCardInfo;

    move-result-object v1

    invoke-virtual {v1}, Lexocr/base/ExBaseCardInfo;->getCharCount()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v2, v5, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 198
    const-string v0, "exocr.bankcard.scanResult"

    iget-object v1, p0, Lcom/huawei/wallet/ui/idencard/camera/bankcard/BankCardCaptureActivity$2;->a:Lcom/huawei/wallet/ui/idencard/camera/bankcard/BankCardCaptureActivity;

    invoke-static {v1}, Lcom/huawei/wallet/ui/idencard/camera/bankcard/BankCardCaptureActivity;->b(Lcom/huawei/wallet/ui/idencard/camera/bankcard/BankCardCaptureActivity;)Lexocr/base/ExBaseCardInfo;

    move-result-object v1

    invoke-virtual {v1}, Lexocr/base/ExBaseCardInfo;->getStrNumbers()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 200
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/bankcard/BankCardCaptureActivity$2;->a:Lcom/huawei/wallet/ui/idencard/camera/bankcard/BankCardCaptureActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/ui/idencard/camera/bankcard/BankCardCaptureActivity;->d(Lcom/huawei/wallet/ui/idencard/camera/bankcard/BankCardCaptureActivity;Lexocr/base/ExBaseCardInfo;)Lexocr/base/ExBaseCardInfo;

    .line 202
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/bankcard/BankCardCaptureActivity$2;->a:Lcom/huawei/wallet/ui/idencard/camera/bankcard/BankCardCaptureActivity;

    const v1, 0xca8d11

    invoke-virtual {v0, v1, v4}, Lcom/huawei/wallet/ui/idencard/camera/bankcard/BankCardCaptureActivity;->setResult(ILandroid/content/Intent;)V

    .line 203
    invoke-static {}, Lcom/huawei/wallet/ui/idencard/camera/base/CardResultInfoManager;->b()Lcom/huawei/wallet/ui/idencard/camera/base/CardResultInfoManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/wallet/ui/idencard/camera/base/CardResultInfoManager;->c()V

    .line 205
    invoke-static {}, Lcom/huawei/wallet/logic/event/EventDispatchManager;->c()Lcom/huawei/wallet/logic/event/EventDispatchManager;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/wallet/ui/idencard/camera/bankcard/BankCardCaptureActivity$2;->a:Lcom/huawei/wallet/ui/idencard/camera/bankcard/BankCardCaptureActivity;

    invoke-static {v1}, Lcom/huawei/wallet/ui/idencard/camera/bankcard/BankCardCaptureActivity;->f(Lcom/huawei/wallet/ui/idencard/camera/bankcard/BankCardCaptureActivity;)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lcom/huawei/wallet/logic/event/IEventType;->b:Lcom/huawei/wallet/logic/event/IEventType;

    invoke-virtual {v0, v1, v2, v4}, Lcom/huawei/wallet/logic/event/EventDispatchManager;->e(Ljava/lang/String;Lcom/huawei/wallet/logic/event/IEventType;Ljava/lang/Object;)V

    .line 207
    invoke-static {}, Lcom/huawei/wallet/logic/event/EventDispatchManager;->c()Lcom/huawei/wallet/logic/event/EventDispatchManager;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/wallet/ui/idencard/camera/bankcard/BankCardCaptureActivity$2;->a:Lcom/huawei/wallet/ui/idencard/camera/bankcard/BankCardCaptureActivity;

    invoke-static {v1}, Lcom/huawei/wallet/ui/idencard/camera/bankcard/BankCardCaptureActivity;->g(Lcom/huawei/wallet/ui/idencard/camera/bankcard/BankCardCaptureActivity;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/wallet/logic/event/EventDispatchManager;->b(Ljava/lang/String;)V

    .line 208
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/bankcard/BankCardCaptureActivity$2;->a:Lcom/huawei/wallet/ui/idencard/camera/bankcard/BankCardCaptureActivity;

    invoke-virtual {v0}, Lcom/huawei/wallet/ui/idencard/camera/bankcard/BankCardCaptureActivity;->finish()V

    .line 209
    return-void
.end method
