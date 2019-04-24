.class Lcom/huawei/sim/multisim/MultiSimConfigActivity$1;
.super Landroid/text/style/ClickableSpan;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/sim/multisim/MultiSimConfigActivity;->A()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/sim/multisim/MultiSimConfigActivity;


# direct methods
.method constructor <init>(Lcom/huawei/sim/multisim/MultiSimConfigActivity;)V
    .locals 0

    .line 1598
    iput-object p1, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity$1;->b:Lcom/huawei/sim/multisim/MultiSimConfigActivity;

    invoke-direct {p0}, Landroid/text/style/ClickableSpan;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 5

    .line 1601
    const-string v0, "clickzhinan"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u8df3\u8f6c\u5230\u4f7f\u7528\u6307\u5357"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1602
    new-instance v4, Landroid/content/Intent;

    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity$1;->b:Lcom/huawei/sim/multisim/MultiSimConfigActivity;

    iget-object v0, v0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->e:Landroid/content/Context;

    const-class v1, Lcom/huawei/ui/commonui/webview/WebViewActivity;

    invoke-direct {v4, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 1604
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity$1;->b:Lcom/huawei/sim/multisim/MultiSimConfigActivity;

    iget-object v0, v0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/ene;->c(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1606
    const-string v0, "WebViewActivity.REQUEST_URL_KEY"

    iget-object v1, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity$1;->b:Lcom/huawei/sim/multisim/MultiSimConfigActivity;

    invoke-static {v1}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->p(Lcom/huawei/sim/multisim/MultiSimConfigActivity;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 1608
    :cond_0
    const-string v0, "WebViewActivity.TITLE"

    iget-object v1, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity$1;->b:Lcom/huawei/sim/multisim/MultiSimConfigActivity;

    sget v2, Lcom/huawei/sim/R$string;->IDS_plugin_multi_sim_manager_title:I

    invoke-virtual {v1, v2}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 1609
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity$1;->b:Lcom/huawei/sim/multisim/MultiSimConfigActivity;

    iget-object v0, v0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->e:Landroid/content/Context;

    invoke-virtual {v0, v4}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 1610
    return-void
.end method

.method public updateDrawState(Landroid/text/TextPaint;)V
    .locals 2

    .line 1613
    invoke-super {p0, p1}, Landroid/text/style/ClickableSpan;->updateDrawState(Landroid/text/TextPaint;)V

    .line 1614
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/text/TextPaint;->setUnderlineText(Z)V

    .line 1615
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity$1;->b:Lcom/huawei/sim/multisim/MultiSimConfigActivity;

    invoke-virtual {v0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/sim/R$color;->IDS_plugin_sim_main_btn_color:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/text/TextPaint;->setColor(I)V

    .line 1616
    return-void
.end method
