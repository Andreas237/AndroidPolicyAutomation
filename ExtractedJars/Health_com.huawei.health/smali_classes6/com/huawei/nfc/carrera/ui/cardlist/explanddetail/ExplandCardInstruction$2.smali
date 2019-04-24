.class Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstruction$2;
.super Landroid/text/style/ClickableSpan;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstruction;->setDesInfo()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstruction;


# direct methods
.method constructor <init>(Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstruction;)V
    .locals 0

    .line 205
    iput-object p1, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstruction$2;->this$0:Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstruction;

    invoke-direct {p0}, Landroid/text/style/ClickableSpan;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 5

    .line 210
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstruction$2;->this$0:Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstruction;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstruction;->access$100(Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstruction;)Landroid/app/Activity;

    move-result-object v0

    sget v1, Lcom/huawei/wallet/R$string;->nfc_about_quick_pass:I

    invoke-virtual {v0, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 211
    new-instance v3, Landroid/content/Intent;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstruction$2;->this$0:Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstruction;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstruction;->access$100(Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstruction;)Landroid/app/Activity;

    move-result-object v0

    const-class v1, Lcom/huawei/nfc/carrera/ui/webview/PolicyActivity;

    invoke-direct {v3, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 212
    new-instance v4, Landroid/os/Bundle;

    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    .line 213
    const-string v0, "webview_url"

    const-string v1, "https://pcpay.vmall.com/agreement/yinlian-cloud-pay.html"

    invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 214
    const-string v0, "webview_title"

    invoke-virtual {v4, v0, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 215
    invoke-virtual {v3, v4}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 216
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstruction$2;->this$0:Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstruction;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstruction;->access$100(Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstruction;)Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 217
    return-void
.end method

.method public updateDrawState(Landroid/text/TextPaint;)V
    .locals 2

    .line 222
    invoke-super {p0, p1}, Landroid/text/style/ClickableSpan;->updateDrawState(Landroid/text/TextPaint;)V

    .line 224
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/text/TextPaint;->setUnderlineText(Z)V

    .line 225
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstruction$2;->this$0:Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstruction;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/ui/cardlist/explanddetail/ExplandCardInstruction;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/wallet/R$color;->brandcolor:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/text/TextPaint;->setColor(I)V

    .line 226
    return-void
.end method
