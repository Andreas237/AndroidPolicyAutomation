.class Lcom/huawei/sim/multisim/MultiSimConfigActivity$12;
.super Landroid/text/style/ClickableSpan;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/sim/multisim/MultiSimConfigActivity;->v()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/sim/multisim/MultiSimConfigActivity;


# direct methods
.method constructor <init>(Lcom/huawei/sim/multisim/MultiSimConfigActivity;)V
    .locals 0

    .line 1285
    iput-object p1, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity$12;->e:Lcom/huawei/sim/multisim/MultiSimConfigActivity;

    invoke-direct {p0}, Landroid/text/style/ClickableSpan;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 1289
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity$12;->e:Lcom/huawei/sim/multisim/MultiSimConfigActivity;

    invoke-static {v0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->o(Lcom/huawei/sim/multisim/MultiSimConfigActivity;)V

    .line 1290
    return-void
.end method

.method public updateDrawState(Landroid/text/TextPaint;)V
    .locals 2

    .line 1293
    invoke-super {p0, p1}, Landroid/text/style/ClickableSpan;->updateDrawState(Landroid/text/TextPaint;)V

    .line 1294
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/text/TextPaint;->setUnderlineText(Z)V

    .line 1295
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity$12;->e:Lcom/huawei/sim/multisim/MultiSimConfigActivity;

    invoke-virtual {v0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/sim/R$color;->IDS_plugin_sim_main_btn_color:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/text/TextPaint;->setColor(I)V

    .line 1296
    return-void
.end method
