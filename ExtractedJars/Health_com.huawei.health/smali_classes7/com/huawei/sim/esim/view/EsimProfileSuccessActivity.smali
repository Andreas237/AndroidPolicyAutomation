.class public Lcom/huawei/sim/esim/view/EsimProfileSuccessActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private b:Landroid/widget/TextView;

.field private c:Lo/egd;

.field private d:Z

.field private e:Landroid/widget/ImageView;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 18
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 56
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/huawei/sim/R$id;->conform_button:I

    if-ne v0, v1, :cond_0

    .line 57
    new-instance v2, Landroid/content/Intent;

    const-class v0, Lcom/huawei/sim/esim/view/WirelessManagerAcitivity;

    invoke-direct {v2, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 58
    invoke-virtual {p0, v2}, Lcom/huawei/sim/esim/view/EsimProfileSuccessActivity;->startActivity(Landroid/content/Intent;)V

    .line 60
    :cond_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 3

    .line 25
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 26
    sget v0, Lcom/huawei/sim/R$layout;->activity_conform_success:I

    invoke-virtual {p0, v0}, Lcom/huawei/sim/esim/view/EsimProfileSuccessActivity;->setContentView(I)V

    .line 27
    sget v0, Lcom/huawei/sim/R$id;->conform_button:I

    invoke-virtual {p0, v0}, Lcom/huawei/sim/esim/view/EsimProfileSuccessActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileSuccessActivity;->c:Lo/egd;

    .line 28
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileSuccessActivity;->c:Lo/egd;

    invoke-virtual {v0, p0}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 29
    invoke-virtual {p0}, Lcom/huawei/sim/esim/view/EsimProfileSuccessActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 30
    invoke-virtual {p0}, Lcom/huawei/sim/esim/view/EsimProfileSuccessActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "conform_status"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/sim/esim/view/EsimProfileSuccessActivity;->d:Z

    .line 32
    :cond_0
    sget v0, Lcom/huawei/sim/R$id;->conform_success_image:I

    invoke-virtual {p0, v0}, Lcom/huawei/sim/esim/view/EsimProfileSuccessActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileSuccessActivity;->e:Landroid/widget/ImageView;

    .line 33
    sget v0, Lcom/huawei/sim/R$id;->conform_sucess_tips:I

    invoke-virtual {p0, v0}, Lcom/huawei/sim/esim/view/EsimProfileSuccessActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileSuccessActivity;->b:Landroid/widget/TextView;

    .line 34
    return-void
.end method

.method public onDestroy()V
    .locals 0

    .line 51
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onDestroy()V

    .line 52
    return-void
.end method

.method public onResume()V
    .locals 2

    .line 38
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onResume()V

    .line 39
    iget-boolean v0, p0, Lcom/huawei/sim/esim/view/EsimProfileSuccessActivity;->d:Z

    if-eqz v0, :cond_0

    .line 40
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileSuccessActivity;->b:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 41
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileSuccessActivity;->e:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/sim/R$drawable;->sim_verify_success:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_0

    .line 44
    :cond_0
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileSuccessActivity;->b:Landroid/widget/TextView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 45
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileSuccessActivity;->e:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/sim/R$drawable;->sim_open_esim_success:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 47
    :goto_0
    return-void
.end method
