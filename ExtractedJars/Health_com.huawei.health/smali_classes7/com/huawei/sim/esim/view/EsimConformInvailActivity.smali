.class public Lcom/huawei/sim/esim/view/EsimConformInvailActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"


# instance fields
.field private a:Landroid/widget/TextView;

.field private b:Lo/egd;

.field private c:Landroid/widget/ImageView;

.field private d:I

.field private e:Lo/emr;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 21
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    .line 25
    const/16 v0, 0x270f

    iput v0, p0, Lcom/huawei/sim/esim/view/EsimConformInvailActivity;->d:I

    return-void
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 5

    .line 30
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 31
    sget v0, Lcom/huawei/sim/R$layout;->activity_conform_invail:I

    invoke-virtual {p0, v0}, Lcom/huawei/sim/esim/view/EsimConformInvailActivity;->setContentView(I)V

    .line 32
    invoke-virtual {p0}, Lcom/huawei/sim/esim/view/EsimConformInvailActivity;->getIntent()Landroid/content/Intent;

    move-result-object v4

    .line 33
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 34
    return-void

    .line 36
    :cond_0
    const-string v0, "conform_error"

    const/16 v1, 0x270f

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/huawei/sim/esim/view/EsimConformInvailActivity;->d:I

    .line 37
    const-string v0, "EsimConformInvailActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "the mErrorCode: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/sim/esim/view/EsimConformInvailActivity;->d:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 38
    sget v0, Lcom/huawei/sim/R$id;->conform_invalid_title_bar:I

    invoke-virtual {p0, v0}, Lcom/huawei/sim/esim/view/EsimConformInvailActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emr;

    iput-object v0, p0, Lcom/huawei/sim/esim/view/EsimConformInvailActivity;->e:Lo/emr;

    .line 39
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimConformInvailActivity;->e:Lo/emr;

    new-instance v1, Lcom/huawei/sim/esim/view/EsimConformInvailActivity$5;

    invoke-direct {v1, p0}, Lcom/huawei/sim/esim/view/EsimConformInvailActivity$5;-><init>(Lcom/huawei/sim/esim/view/EsimConformInvailActivity;)V

    invoke-virtual {v0, v1}, Lo/emr;->setLeftButtonOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 47
    sget v0, Lcom/huawei/sim/R$id;->conform_button:I

    invoke-virtual {p0, v0}, Lcom/huawei/sim/esim/view/EsimConformInvailActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/sim/esim/view/EsimConformInvailActivity;->b:Lo/egd;

    .line 48
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimConformInvailActivity;->b:Lo/egd;

    new-instance v1, Lcom/huawei/sim/esim/view/EsimConformInvailActivity$3;

    invoke-direct {v1, p0}, Lcom/huawei/sim/esim/view/EsimConformInvailActivity$3;-><init>(Lcom/huawei/sim/esim/view/EsimConformInvailActivity;)V

    invoke-virtual {v0, v1}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 56
    sget v0, Lcom/huawei/sim/R$id;->conform_invalid_image:I

    invoke-virtual {p0, v0}, Lcom/huawei/sim/esim/view/EsimConformInvailActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/sim/esim/view/EsimConformInvailActivity;->c:Landroid/widget/ImageView;

    .line 57
    sget v0, Lcom/huawei/sim/R$id;->conform_invide_info:I

    invoke-virtual {p0, v0}, Lcom/huawei/sim/esim/view/EsimConformInvailActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/sim/esim/view/EsimConformInvailActivity;->a:Landroid/widget/TextView;

    .line 58
    iget v0, p0, Lcom/huawei/sim/esim/view/EsimConformInvailActivity;->d:I

    const/16 v1, 0x3e8

    if-ne v1, v0, :cond_1

    .line 59
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimConformInvailActivity;->e:Lo/emr;

    invoke-virtual {p0}, Lcom/huawei/sim/esim/view/EsimConformInvailActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/sim/R$string;->IDS_plugin_sim_esim_conform_code_title:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setTitleText(Ljava/lang/String;)V

    .line 60
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimConformInvailActivity;->a:Landroid/widget/TextView;

    sget v1, Lcom/huawei/sim/R$string;->IDS_plugin_esim_conform_start_failed:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    goto :goto_0

    .line 62
    :cond_1
    iget v0, p0, Lcom/huawei/sim/esim/view/EsimConformInvailActivity;->d:I

    const/4 v1, 0x3

    if-ne v1, v0, :cond_2

    .line 63
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimConformInvailActivity;->e:Lo/emr;

    invoke-virtual {p0}, Lcom/huawei/sim/esim/view/EsimConformInvailActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/sim/R$string;->IDS_plugin_sim_conform_invaid_title:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setTitleText(Ljava/lang/String;)V

    .line 64
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimConformInvailActivity;->a:Landroid/widget/TextView;

    sget v1, Lcom/huawei/sim/R$string;->IDS_plugin_sim_conform_invaid_tip_new:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    goto :goto_0

    .line 67
    :cond_2
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimConformInvailActivity;->e:Lo/emr;

    invoke-virtual {p0}, Lcom/huawei/sim/esim/view/EsimConformInvailActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/sim/R$string;->IDS_plugin_sim_esim_conform_code_title:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setTitleText(Ljava/lang/String;)V

    .line 68
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimConformInvailActivity;->a:Landroid/widget/TextView;

    sget v1, Lcom/huawei/sim/R$string;->IDS_plugin_esim_conform_unkown_error:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 70
    :goto_0
    return-void
.end method

.method public onDestroy()V
    .locals 0

    .line 79
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onDestroy()V

    .line 80
    return-void
.end method

.method public onResume()V
    .locals 0

    .line 74
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onResume()V

    .line 75
    return-void
.end method
