.class public Lcom/huawei/sim/esim/view/EsimProflieAuthenticationFail;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private a:Landroid/widget/Button;

.field private b:Lo/egd;

.field private c:Lo/egd;

.field private d:I

.field private e:Landroid/widget/TextView;

.field private g:Landroid/view/View;

.field private i:Landroid/view/View;

.field private k:Lo/emr;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 20
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    return-void
.end method

.method private d()V
    .locals 2

    .line 40
    sget v0, Lcom/huawei/sim/R$id;->double_button:I

    invoke-virtual {p0, v0}, Lcom/huawei/sim/esim/view/EsimProflieAuthenticationFail;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/sim/esim/view/EsimProflieAuthenticationFail;->g:Landroid/view/View;

    .line 41
    sget v0, Lcom/huawei/sim/R$id;->single_button:I

    invoke-virtual {p0, v0}, Lcom/huawei/sim/esim/view/EsimProflieAuthenticationFail;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/sim/esim/view/EsimProflieAuthenticationFail;->i:Landroid/view/View;

    .line 42
    sget v0, Lcom/huawei/sim/R$id;->esim_profile_cancel:I

    invoke-virtual {p0, v0}, Lcom/huawei/sim/esim/view/EsimProflieAuthenticationFail;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/sim/esim/view/EsimProflieAuthenticationFail;->c:Lo/egd;

    .line 43
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProflieAuthenticationFail;->c:Lo/egd;

    invoke-virtual {v0, p0}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 44
    sget v0, Lcom/huawei/sim/R$id;->esim_profile_retry:I

    invoke-virtual {p0, v0}, Lcom/huawei/sim/esim/view/EsimProflieAuthenticationFail;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/sim/esim/view/EsimProflieAuthenticationFail;->b:Lo/egd;

    .line 45
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProflieAuthenticationFail;->b:Lo/egd;

    invoke-virtual {v0, p0}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 46
    sget v0, Lcom/huawei/sim/R$id;->esim_profile_ok:I

    invoke-virtual {p0, v0}, Lcom/huawei/sim/esim/view/EsimProflieAuthenticationFail;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/huawei/sim/esim/view/EsimProflieAuthenticationFail;->a:Landroid/widget/Button;

    .line 47
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProflieAuthenticationFail;->a:Landroid/widget/Button;

    invoke-virtual {v0, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 48
    sget v0, Lcom/huawei/sim/R$id;->profile_auth_fail_title_bar:I

    invoke-virtual {p0, v0}, Lcom/huawei/sim/esim/view/EsimProflieAuthenticationFail;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emr;

    iput-object v0, p0, Lcom/huawei/sim/esim/view/EsimProflieAuthenticationFail;->k:Lo/emr;

    .line 49
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProflieAuthenticationFail;->k:Lo/emr;

    new-instance v1, Lcom/huawei/sim/esim/view/EsimProflieAuthenticationFail$3;

    invoke-direct {v1, p0}, Lcom/huawei/sim/esim/view/EsimProflieAuthenticationFail$3;-><init>(Lcom/huawei/sim/esim/view/EsimProflieAuthenticationFail;)V

    invoke-virtual {v0, v1}, Lo/emr;->setLeftButtonOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 57
    sget v0, Lcom/huawei/sim/R$id;->profile_auth_tips:I

    invoke-virtual {p0, v0}, Lcom/huawei/sim/esim/view/EsimProflieAuthenticationFail;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/sim/esim/view/EsimProflieAuthenticationFail;->e:Landroid/widget/TextView;

    .line 58
    iget v0, p0, Lcom/huawei/sim/esim/view/EsimProflieAuthenticationFail;->d:I

    const/4 v1, 0x2

    if-ne v1, v0, :cond_0

    .line 59
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProflieAuthenticationFail;->g:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 60
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProflieAuthenticationFail;->i:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 61
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProflieAuthenticationFail;->e:Landroid/widget/TextView;

    sget v1, Lcom/huawei/sim/R$string;->IDS_plugin_sim_esim_error_2_new:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    goto/16 :goto_0

    .line 63
    :cond_0
    iget v0, p0, Lcom/huawei/sim/esim/view/EsimProflieAuthenticationFail;->d:I

    const/4 v1, 0x1

    if-ne v1, v0, :cond_1

    .line 64
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProflieAuthenticationFail;->i:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 65
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProflieAuthenticationFail;->g:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 66
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProflieAuthenticationFail;->e:Landroid/widget/TextView;

    sget v1, Lcom/huawei/sim/R$string;->IDS_plugin_esim_network_failed_new:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    goto/16 :goto_0

    .line 68
    :cond_1
    iget v0, p0, Lcom/huawei/sim/esim/view/EsimProflieAuthenticationFail;->d:I

    const/4 v1, 0x3

    if-ne v1, v0, :cond_2

    .line 69
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProflieAuthenticationFail;->g:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 70
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProflieAuthenticationFail;->i:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 71
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProflieAuthenticationFail;->e:Landroid/widget/TextView;

    sget v1, Lcom/huawei/sim/R$string;->IDS_plugin_esim_watch_failed_new:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    goto/16 :goto_0

    .line 73
    :cond_2
    iget v0, p0, Lcom/huawei/sim/esim/view/EsimProflieAuthenticationFail;->d:I

    const/4 v1, 0x4

    if-ne v1, v0, :cond_3

    .line 74
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProflieAuthenticationFail;->g:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 75
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProflieAuthenticationFail;->i:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 76
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProflieAuthenticationFail;->e:Landroid/widget/TextView;

    sget v1, Lcom/huawei/sim/R$string;->IDS_plugin_esim_service_failed_new:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    goto/16 :goto_0

    .line 78
    :cond_3
    iget v0, p0, Lcom/huawei/sim/esim/view/EsimProflieAuthenticationFail;->d:I

    const/4 v1, 0x5

    if-ne v1, v0, :cond_4

    .line 79
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProflieAuthenticationFail;->g:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 80
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProflieAuthenticationFail;->i:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 81
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProflieAuthenticationFail;->e:Landroid/widget/TextView;

    sget v1, Lcom/huawei/sim/R$string;->IDS_plugin_eid_is_refused_by_server_new:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    goto/16 :goto_0

    .line 83
    :cond_4
    iget v0, p0, Lcom/huawei/sim/esim/view/EsimProflieAuthenticationFail;->d:I

    const/4 v1, 0x6

    if-ne v1, v0, :cond_5

    .line 84
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProflieAuthenticationFail;->g:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 85
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProflieAuthenticationFail;->i:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 86
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProflieAuthenticationFail;->e:Landroid/widget/TextView;

    sget v1, Lcom/huawei/sim/R$string;->IDS_plugin_matching_id_is_resused_by_server_new:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    goto/16 :goto_0

    .line 88
    :cond_5
    iget v0, p0, Lcom/huawei/sim/esim/view/EsimProflieAuthenticationFail;->d:I

    const/4 v1, 0x7

    if-ne v1, v0, :cond_6

    .line 89
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProflieAuthenticationFail;->g:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 90
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProflieAuthenticationFail;->i:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 91
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProflieAuthenticationFail;->e:Landroid/widget/TextView;

    sget v1, Lcom/huawei/sim/R$string;->IDS_plugin_insufficent_storage_new:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    goto/16 :goto_0

    .line 93
    :cond_6
    iget v0, p0, Lcom/huawei/sim/esim/view/EsimProflieAuthenticationFail;->d:I

    const/16 v1, 0x8

    if-ne v1, v0, :cond_7

    .line 94
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProflieAuthenticationFail;->g:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 95
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProflieAuthenticationFail;->i:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 96
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProflieAuthenticationFail;->e:Landroid/widget/TextView;

    sget v1, Lcom/huawei/sim/R$string;->IDS_plugin_metadata_no_suitable_esim_account:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    goto/16 :goto_0

    .line 98
    :cond_7
    iget v0, p0, Lcom/huawei/sim/esim/view/EsimProflieAuthenticationFail;->d:I

    const/16 v1, 0x9

    if-ne v1, v0, :cond_8

    .line 99
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProflieAuthenticationFail;->g:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 100
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProflieAuthenticationFail;->i:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 101
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProflieAuthenticationFail;->e:Landroid/widget/TextView;

    sget v1, Lcom/huawei/sim/R$string;->IDS_plugin_metadata_server_not_support_device:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    goto/16 :goto_0

    .line 103
    :cond_8
    iget v0, p0, Lcom/huawei/sim/esim/view/EsimProflieAuthenticationFail;->d:I

    const/16 v1, 0xa

    if-ne v1, v0, :cond_9

    .line 104
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProflieAuthenticationFail;->g:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 105
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProflieAuthenticationFail;->i:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 106
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProflieAuthenticationFail;->e:Landroid/widget/TextView;

    sget v1, Lcom/huawei/sim/R$string;->IDS_plugin_metadata_verification_server_failure:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    goto/16 :goto_0

    .line 108
    :cond_9
    iget v0, p0, Lcom/huawei/sim/esim/view/EsimProflieAuthenticationFail;->d:I

    const/16 v1, 0xb

    if-ne v1, v0, :cond_a

    .line 109
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProflieAuthenticationFail;->g:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 110
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProflieAuthenticationFail;->i:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 111
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProflieAuthenticationFail;->e:Landroid/widget/TextView;

    sget v1, Lcom/huawei/sim/R$string;->IDS_plugin_metadata_download_timeout_or_invalid:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    goto/16 :goto_0

    .line 113
    :cond_a
    iget v0, p0, Lcom/huawei/sim/esim/view/EsimProflieAuthenticationFail;->d:I

    const/16 v1, 0xc

    if-ne v1, v0, :cond_b

    .line 114
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProflieAuthenticationFail;->g:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 115
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProflieAuthenticationFail;->i:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 116
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProflieAuthenticationFail;->e:Landroid/widget/TextView;

    sget v1, Lcom/huawei/sim/R$string;->IDS_plugin_metadata_ppr_rules_not_satisfied:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    goto :goto_0

    .line 118
    :cond_b
    iget v0, p0, Lcom/huawei/sim/esim/view/EsimProflieAuthenticationFail;->d:I

    const/16 v1, 0xd

    if-ne v1, v0, :cond_c

    .line 119
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProflieAuthenticationFail;->g:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 120
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProflieAuthenticationFail;->i:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 121
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProflieAuthenticationFail;->e:Landroid/widget/TextView;

    sget v1, Lcom/huawei/sim/R$string;->IDS_plugin_metadata_ppr_rules_install_empty_esim_only:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    goto :goto_0

    .line 123
    :cond_c
    iget v0, p0, Lcom/huawei/sim/esim/view/EsimProflieAuthenticationFail;->d:I

    const/16 v1, 0x3e8

    if-ne v1, v0, :cond_d

    .line 124
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProflieAuthenticationFail;->g:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 125
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProflieAuthenticationFail;->i:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 126
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProflieAuthenticationFail;->e:Landroid/widget/TextView;

    sget v1, Lcom/huawei/sim/R$string;->IDS_plugin_esim_start_failed_new:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    goto :goto_0

    .line 129
    :cond_d
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProflieAuthenticationFail;->g:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 130
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProflieAuthenticationFail;->i:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 131
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProflieAuthenticationFail;->e:Landroid/widget/TextView;

    sget v1, Lcom/huawei/sim/R$string;->IDS_plugin_esim_unknonw_failed_new:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 134
    :goto_0
    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 137
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/huawei/sim/R$id;->esim_profile_cancel:I

    if-ne v0, v1, :cond_0

    .line 138
    new-instance v2, Landroid/content/Intent;

    const-class v0, Lcom/huawei/sim/esim/view/EsimActivationActivity;

    invoke-direct {v2, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 139
    invoke-virtual {p0, v2}, Lcom/huawei/sim/esim/view/EsimProflieAuthenticationFail;->startActivity(Landroid/content/Intent;)V

    .line 140
    invoke-virtual {p0}, Lcom/huawei/sim/esim/view/EsimProflieAuthenticationFail;->finish()V

    .line 141
    goto :goto_0

    .line 142
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/huawei/sim/R$id;->esim_profile_retry:I

    if-ne v0, v1, :cond_1

    .line 143
    new-instance v2, Landroid/content/Intent;

    const-class v0, Lcom/huawei/sim/esim/qrcode/QrCodeActivity;

    invoke-direct {v2, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 144
    invoke-virtual {p0, v2}, Lcom/huawei/sim/esim/view/EsimProflieAuthenticationFail;->startActivity(Landroid/content/Intent;)V

    .line 145
    invoke-virtual {p0}, Lcom/huawei/sim/esim/view/EsimProflieAuthenticationFail;->finish()V

    .line 146
    goto :goto_0

    .line 147
    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/huawei/sim/R$id;->esim_profile_ok:I

    if-ne v0, v1, :cond_2

    .line 148
    new-instance v2, Landroid/content/Intent;

    const-class v0, Lcom/huawei/sim/esim/view/EsimActivationActivity;

    invoke-direct {v2, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 149
    invoke-virtual {p0, v2}, Lcom/huawei/sim/esim/view/EsimProflieAuthenticationFail;->startActivity(Landroid/content/Intent;)V

    .line 150
    invoke-virtual {p0}, Lcom/huawei/sim/esim/view/EsimProflieAuthenticationFail;->finish()V

    .line 152
    :cond_2
    :goto_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 3

    .line 30
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 31
    sget v0, Lcom/huawei/sim/R$layout;->activity_esim_profile_fail:I

    invoke-virtual {p0, v0}, Lcom/huawei/sim/esim/view/EsimProflieAuthenticationFail;->setContentView(I)V

    .line 32
    invoke-virtual {p0}, Lcom/huawei/sim/esim/view/EsimProflieAuthenticationFail;->getIntent()Landroid/content/Intent;

    move-result-object v2

    .line 33
    const/4 v0, 0x0

    if-eq v0, v2, :cond_0

    .line 34
    const-string v0, "mata_report"

    const/4 v1, 0x1

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/huawei/sim/esim/view/EsimProflieAuthenticationFail;->d:I

    .line 36
    :cond_0
    invoke-direct {p0}, Lcom/huawei/sim/esim/view/EsimProflieAuthenticationFail;->d()V

    .line 37
    return-void
.end method
