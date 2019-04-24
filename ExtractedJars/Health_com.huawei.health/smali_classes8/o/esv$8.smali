.class Lo/esv$8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cmo;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/esv;->v()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/esv;


# direct methods
.method constructor <init>(Lo/esv;)V
    .locals 0

    .line 554
    iput-object p1, p0, Lo/esv$8;->a:Lo/esv;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)V
    .locals 0

    .line 597
    return-void
.end method

.method public b(Ljava/lang/Object;)V
    .locals 7

    .line 558
    if-nez p1, :cond_0

    .line 559
    const-string v0, "SCUI_StepsCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getStepsNotifiState obj is null  "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 560
    return-void

    .line 562
    :cond_0
    move-object v0, p1

    check-cast v0, Landroid/os/Bundle;

    const-string v1, "stepsNotifiState"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v4

    .line 563
    const-string v0, "SCUI_StepsCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "MessageSwitch :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 564
    if-nez v4, :cond_1

    .line 565
    iget-object v0, p0, Lo/esv$8;->a:Lo/esv;

    iget-object v0, v0, Lo/esv;->a:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/homehealth/R$layout;->step_message_switch_dialog:I

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v5

    .line 566
    new-instance v6, Lo/egw$c;

    iget-object v0, p0, Lo/esv$8;->a:Lo/esv;

    iget-object v0, v0, Lo/esv;->a:Landroid/content/Context;

    invoke-direct {v6, v0}, Lo/egw$c;-><init>(Landroid/content/Context;)V

    .line 567
    iget-object v0, p0, Lo/esv$8;->a:Lo/esv;

    iget-object v0, v0, Lo/esv;->a:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/homehealth/R$string;->IDS_steps_third_message_switch:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lo/egw$c;->a(Ljava/lang/String;)Lo/egw$c;

    move-result-object v0

    .line 568
    invoke-virtual {v0, v5}, Lo/egw$c;->e(Landroid/view/View;)Lo/egw$c;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homehealth/R$string;->IDS_device_bt_right_btn_info:I

    new-instance v2, Lo/esv$8$2;

    invoke-direct {v2, p0}, Lo/esv$8$2;-><init>(Lo/esv$8;)V

    .line 569
    invoke-virtual {v0, v1, v2}, Lo/egw$c;->b(ILandroid/view/View$OnClickListener;)Lo/egw$c;

    .line 575
    sget v0, Lcom/huawei/ui/homehealth/R$string;->IDS_settings_button_cancal:I

    new-instance v1, Lo/esv$8$1;

    invoke-direct {v1, p0}, Lo/esv$8$1;-><init>(Lo/esv$8;)V

    invoke-virtual {v6, v0, v1}, Lo/egw$c;->c(ILandroid/view/View$OnClickListener;)Lo/egw$c;

    .line 581
    iget-object v0, p0, Lo/esv$8;->a:Lo/esv;

    invoke-virtual {v6}, Lo/egw$c;->e()Lo/egw;

    move-result-object v1

    invoke-static {v0, v1}, Lo/esv;->b(Lo/esv;Lo/egw;)Lo/egw;

    .line 582
    iget-object v0, p0, Lo/esv$8;->a:Lo/esv;

    invoke-static {v0}, Lo/esv;->d(Lo/esv;)Lo/egw;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egw;->setCancelable(Z)V

    .line 583
    iget-object v0, p0, Lo/esv$8;->a:Lo/esv;

    invoke-static {v0}, Lo/esv;->b(Lo/esv;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 584
    iget-object v0, p0, Lo/esv$8;->a:Lo/esv;

    invoke-static {v0}, Lo/esv;->d(Lo/esv;)Lo/egw;

    move-result-object v0

    invoke-virtual {v0}, Lo/egw;->show()V

    .line 585
    iget-object v0, p0, Lo/esv$8;->a:Lo/esv;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/esv;->d(Lo/esv;Z)Z

    .line 590
    :cond_1
    return-void
.end method

.method public e(Ljava/lang/Object;)V
    .locals 0

    .line 593
    return-void
.end method
