.class final Lcom/huawei/nfc/carrera/ui/dialog/PayManagerSettingSwitchDialog$1;
.super Landroid/text/style/ClickableSpan;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/nfc/carrera/ui/dialog/PayManagerSettingSwitchDialog;->setTextLinkOpenByWebView(Landroid/content/Context;Ljava/lang/String;Landroid/app/Dialog;)Landroid/text/SpannableStringBuilder;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic val$context:Landroid/content/Context;

.field final synthetic val$dialog:Landroid/app/Dialog;

.field final synthetic val$url:Ljava/lang/String;


# direct methods
.method constructor <init>(Landroid/app/Dialog;Landroid/content/Context;Ljava/lang/String;)V
    .locals 0

    .line 124
    iput-object p1, p0, Lcom/huawei/nfc/carrera/ui/dialog/PayManagerSettingSwitchDialog$1;->val$dialog:Landroid/app/Dialog;

    iput-object p2, p0, Lcom/huawei/nfc/carrera/ui/dialog/PayManagerSettingSwitchDialog$1;->val$context:Landroid/content/Context;

    iput-object p3, p0, Lcom/huawei/nfc/carrera/ui/dialog/PayManagerSettingSwitchDialog$1;->val$url:Ljava/lang/String;

    invoke-direct {p0}, Landroid/text/style/ClickableSpan;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 127
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/dialog/PayManagerSettingSwitchDialog$1;->val$dialog:Landroid/app/Dialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    .line 128
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/dialog/PayManagerSettingSwitchDialog$1;->val$context:Landroid/content/Context;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 129
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/dialog/PayManagerSettingSwitchDialog$1;->val$context:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/dialog/PayManagerSettingSwitchDialog$1;->val$url:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/huawei/nfc/carrera/ui/dialog/PayManagerSettingSwitchDialog;->access$000(Landroid/content/Context;Ljava/lang/String;I)V

    .line 131
    :cond_0
    return-void
.end method

.method public updateDrawState(Landroid/text/TextPaint;)V
    .locals 2

    .line 135
    invoke-super {p0, p1}, Landroid/text/style/ClickableSpan;->updateDrawState(Landroid/text/TextPaint;)V

    .line 136
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/dialog/PayManagerSettingSwitchDialog$1;->val$context:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/wallet/R$color;->add_bus_card_button_text_color:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/text/TextPaint;->setColor(I)V

    .line 137
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/text/TextPaint;->setUnderlineText(Z)V

    .line 138
    return-void
.end method
