.class Lcom/huawei/sim/esim/view/WirelessManagerAcitivity$2;
.super Landroid/text/style/ClickableSpan;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/sim/esim/view/WirelessManagerAcitivity;->e()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/sim/esim/view/WirelessManagerAcitivity;


# direct methods
.method constructor <init>(Lcom/huawei/sim/esim/view/WirelessManagerAcitivity;)V
    .locals 0

    .line 104
    iput-object p1, p0, Lcom/huawei/sim/esim/view/WirelessManagerAcitivity$2;->e:Lcom/huawei/sim/esim/view/WirelessManagerAcitivity;

    invoke-direct {p0}, Landroid/text/style/ClickableSpan;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 114
    new-instance v3, Landroid/content/Intent;

    iget-object v0, p0, Lcom/huawei/sim/esim/view/WirelessManagerAcitivity$2;->e:Lcom/huawei/sim/esim/view/WirelessManagerAcitivity;

    invoke-static {v0}, Lcom/huawei/sim/esim/view/WirelessManagerAcitivity;->b(Lcom/huawei/sim/esim/view/WirelessManagerAcitivity;)Landroid/content/Context;

    move-result-object v0

    const-class v1, Lcom/huawei/ui/commonui/webview/WebViewActivity;

    invoke-direct {v3, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 115
    iget-object v0, p0, Lcom/huawei/sim/esim/view/WirelessManagerAcitivity$2;->e:Lcom/huawei/sim/esim/view/WirelessManagerAcitivity;

    invoke-static {v0}, Lcom/huawei/sim/esim/view/WirelessManagerAcitivity;->b(Lcom/huawei/sim/esim/view/WirelessManagerAcitivity;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/ene;->c(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 116
    const-string v0, "WebViewActivity.REQUEST_URL_KEY"

    iget-object v1, p0, Lcom/huawei/sim/esim/view/WirelessManagerAcitivity$2;->e:Lcom/huawei/sim/esim/view/WirelessManagerAcitivity;

    invoke-static {v1}, Lcom/huawei/sim/esim/view/WirelessManagerAcitivity;->d(Lcom/huawei/sim/esim/view/WirelessManagerAcitivity;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    goto :goto_0

    .line 118
    :cond_0
    const-string v0, "WebViewActivity.REQUEST_URL_KEY"

    iget-object v1, p0, Lcom/huawei/sim/esim/view/WirelessManagerAcitivity$2;->e:Lcom/huawei/sim/esim/view/WirelessManagerAcitivity;

    invoke-static {v1}, Lcom/huawei/sim/esim/view/WirelessManagerAcitivity;->e(Lcom/huawei/sim/esim/view/WirelessManagerAcitivity;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 120
    :goto_0
    const-string v0, "WebViewActivity.TITLE"

    iget-object v1, p0, Lcom/huawei/sim/esim/view/WirelessManagerAcitivity$2;->e:Lcom/huawei/sim/esim/view/WirelessManagerAcitivity;

    sget v2, Lcom/huawei/sim/R$string;->IDS_plugin_multi_sim_manager_title:I

    invoke-virtual {v1, v2}, Lcom/huawei/sim/esim/view/WirelessManagerAcitivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 121
    iget-object v0, p0, Lcom/huawei/sim/esim/view/WirelessManagerAcitivity$2;->e:Lcom/huawei/sim/esim/view/WirelessManagerAcitivity;

    invoke-static {v0}, Lcom/huawei/sim/esim/view/WirelessManagerAcitivity;->b(Lcom/huawei/sim/esim/view/WirelessManagerAcitivity;)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 122
    return-void
.end method

.method public updateDrawState(Landroid/text/TextPaint;)V
    .locals 2

    .line 107
    invoke-super {p0, p1}, Landroid/text/style/ClickableSpan;->updateDrawState(Landroid/text/TextPaint;)V

    .line 108
    iget-object v0, p0, Lcom/huawei/sim/esim/view/WirelessManagerAcitivity$2;->e:Lcom/huawei/sim/esim/view/WirelessManagerAcitivity;

    invoke-virtual {v0}, Lcom/huawei/sim/esim/view/WirelessManagerAcitivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/sim/R$color;->IDS_plugin_sim_next_back_color:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/text/TextPaint;->setColor(I)V

    .line 109
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/text/TextPaint;->setUnderlineText(Z)V

    .line 110
    return-void
.end method
