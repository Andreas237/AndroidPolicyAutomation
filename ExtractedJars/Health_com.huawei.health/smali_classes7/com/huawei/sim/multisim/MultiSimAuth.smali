.class public Lcom/huawei/sim/multisim/MultiSimAuth;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private a:Lo/ecx;

.field private b:Landroid/widget/TextView;

.field private c:Landroid/widget/TextView;

.field private d:Lo/egd;

.field private e:Lo/egd;

.field private h:Landroid/content/Context;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 43
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    .line 56
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/sim/multisim/MultiSimAuth;->h:Landroid/content/Context;

    return-void
.end method

.method private a()V
    .locals 3

    .line 179
    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    .line 180
    const-string v0, "com.huawei.commonui.CLEAN_ACTIVITY"

    invoke-virtual {v2, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 181
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimAuth;->h:Landroid/content/Context;

    invoke-static {v0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 182
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimAuth;->h:Landroid/content/Context;

    invoke-static {v0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/support/v4/content/LocalBroadcastManager;->sendBroadcast(Landroid/content/Intent;)Z

    .line 184
    :cond_0
    return-void
.end method

.method public static b(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    .locals 7

    .line 89
    const-string v4, ""

    .line 91
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v5

    .line 92
    const/16 v0, 0x80

    invoke-virtual {v5, p1, v0}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object v6

    .line 94
    invoke-virtual {v5, v6}, Landroid/content/pm/PackageManager;->getApplicationLabel(Landroid/content/pm/ApplicationInfo;)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v4, v0

    .line 98
    goto :goto_0

    .line 95
    :catch_0
    move-exception v5

    .line 96
    const-string v0, "MultiSimAuth"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Exception="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 97
    return-object v4

    .line 99
    :goto_0
    return-object v4
.end method

.method private c()V
    .locals 6

    .line 103
    const-string v0, "MultiSimAuth"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initAuthRequestView()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 104
    const-string v4, ""

    .line 105
    const-string v5, ""

    .line 107
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimAuth;->a:Lo/ecx;

    if-eqz v0, :cond_0

    .line 108
    invoke-virtual {p0}, Lcom/huawei/sim/multisim/MultiSimAuth;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/sim/R$string;->IDS_plugin_multi_sim_get_device_info:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    iget-object v2, p0, Lcom/huawei/sim/multisim/MultiSimAuth;->h:Landroid/content/Context;

    iget-object v3, p0, Lcom/huawei/sim/multisim/MultiSimAuth;->a:Lo/ecx;

    .line 109
    invoke-interface {v3}, Lo/ecx;->e()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/huawei/sim/multisim/MultiSimAuth;->b(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/sim/multisim/MultiSimAuth;->a:Lo/ecx;

    .line 110
    invoke-interface {v2}, Lo/ecx;->c()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    .line 108
    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    .line 111
    invoke-virtual {p0}, Lcom/huawei/sim/multisim/MultiSimAuth;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/sim/R$string;->IDS_plugin_multi_sim_get_device_tip:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    .line 112
    invoke-virtual {p0}, Lcom/huawei/sim/multisim/MultiSimAuth;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/huawei/sim/R$string;->IDS_plugin_multi_sim_auth_agree:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/sim/multisim/MultiSimAuth;->h:Landroid/content/Context;

    iget-object v3, p0, Lcom/huawei/sim/multisim/MultiSimAuth;->a:Lo/ecx;

    .line 113
    invoke-interface {v3}, Lo/ecx;->e()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/huawei/sim/multisim/MultiSimAuth;->b(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    .line 111
    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    goto :goto_0

    .line 115
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/sim/multisim/MultiSimAuth;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/sim/R$string;->IDS_plugin_multi_sim_get_device_info:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, ""

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "Huawei Watch"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    .line 117
    invoke-virtual {p0}, Lcom/huawei/sim/multisim/MultiSimAuth;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/sim/R$string;->IDS_plugin_multi_sim_get_device_tip:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    .line 118
    invoke-virtual {p0}, Lcom/huawei/sim/multisim/MultiSimAuth;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/huawei/sim/R$string;->IDS_plugin_multi_sim_auth_agree:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, ""

    const/4 v3, 0x1

    aput-object v2, v1, v3

    .line 117
    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    .line 121
    :goto_0
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimAuth;->b:Landroid/widget/TextView;

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 122
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimAuth;->c:Landroid/widget/TextView;

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 123
    return-void
.end method

.method private d()V
    .locals 1

    .line 77
    sget v0, Lcom/huawei/sim/R$id;->multi_sim_auth_notice:I

    invoke-virtual {p0, v0}, Lcom/huawei/sim/multisim/MultiSimAuth;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/sim/multisim/MultiSimAuth;->b:Landroid/widget/TextView;

    .line 78
    sget v0, Lcom/huawei/sim/R$id;->multi_sim_auth_tip:I

    invoke-virtual {p0, v0}, Lcom/huawei/sim/multisim/MultiSimAuth;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/sim/multisim/MultiSimAuth;->c:Landroid/widget/TextView;

    .line 81
    sget v0, Lcom/huawei/sim/R$id;->multi_sim_auth_agree:I

    invoke-virtual {p0, v0}, Lcom/huawei/sim/multisim/MultiSimAuth;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/sim/multisim/MultiSimAuth;->d:Lo/egd;

    .line 82
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimAuth;->d:Lo/egd;

    invoke-virtual {v0, p0}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 83
    sget v0, Lcom/huawei/sim/R$id;->multi_sim_auth_cancel:I

    invoke-virtual {p0, v0}, Lcom/huawei/sim/multisim/MultiSimAuth;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/sim/multisim/MultiSimAuth;->e:Lo/egd;

    .line 84
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimAuth;->e:Lo/egd;

    invoke-virtual {v0, p0}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 85
    return-void
.end method

.method private e()V
    .locals 4

    .line 187
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimAuth;->a:Lo/ecx;

    if-eqz v0, :cond_0

    .line 188
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimAuth;->a:Lo/ecx;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lo/ecx;->d(Z)V

    goto :goto_0

    .line 190
    :cond_0
    const-string v0, "MultiSimAuth"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "pluginSimAdapter is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 192
    :goto_0
    invoke-virtual {p0}, Lcom/huawei/sim/multisim/MultiSimAuth;->finish()V

    .line 193
    return-void
.end method


# virtual methods
.method public onBackPressed()V
    .locals 5

    .line 162
    const-string v0, "MultiSimAuth"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onClick back button"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 163
    invoke-virtual {p0}, Lcom/huawei/sim/multisim/MultiSimAuth;->getIntent()Landroid/content/Intent;

    move-result-object v4

    .line 164
    const-string v0, "inEsim"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 166
    const-string v0, "com.huawei.sim.multisim.MultiSimAuth"

    invoke-virtual {v4}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 167
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimAuth;->a:Lo/ecx;

    if-eqz v0, :cond_0

    .line 168
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimAuth;->a:Lo/ecx;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lo/ecx;->d(Z)V

    goto :goto_0

    .line 170
    :cond_0
    const-string v0, "MultiSimAuth"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "pluginSimAdapter is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 172
    :goto_0
    invoke-direct {p0}, Lcom/huawei/sim/multisim/MultiSimAuth;->a()V

    goto :goto_1

    .line 174
    :cond_1
    invoke-direct {p0}, Lcom/huawei/sim/multisim/MultiSimAuth;->e()V

    .line 176
    :goto_1
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 5

    .line 127
    const-string v0, "MultiSimAuth"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onClick enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 128
    invoke-virtual {p0}, Lcom/huawei/sim/multisim/MultiSimAuth;->getIntent()Landroid/content/Intent;

    move-result-object v4

    .line 129
    const-string v0, "MultiSimAuth"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 130
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/huawei/sim/R$id;->multi_sim_auth_agree:I

    if-ne v0, v1, :cond_2

    .line 131
    const-string v0, "MultiSimAuth"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onClick agree"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 132
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimAuth;->a:Lo/ecx;

    if-eqz v0, :cond_0

    .line 133
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimAuth;->a:Lo/ecx;

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lo/ecx;->d(Z)V

    goto :goto_0

    .line 135
    :cond_0
    const-string v0, "MultiSimAuth"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "pluginSimAdapter is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 138
    :goto_0
    const-string v0, "com.huawei.sim.multisim.MultiSimAuth"

    invoke-virtual {v4}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 139
    invoke-direct {p0}, Lcom/huawei/sim/multisim/MultiSimAuth;->a()V

    goto :goto_2

    .line 141
    :cond_1
    invoke-virtual {p0}, Lcom/huawei/sim/multisim/MultiSimAuth;->finish()V

    goto :goto_2

    .line 143
    :cond_2
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/huawei/sim/R$id;->multi_sim_auth_cancel:I

    if-ne v0, v1, :cond_5

    .line 144
    const-string v0, "MultiSimAuth"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onClick cancel"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 145
    const-string v0, "com.huawei.sim.multisim.MultiSimAuth"

    invoke-virtual {v4}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 146
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimAuth;->a:Lo/ecx;

    if-eqz v0, :cond_3

    .line 147
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimAuth;->a:Lo/ecx;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lo/ecx;->d(Z)V

    goto :goto_1

    .line 149
    :cond_3
    const-string v0, "MultiSimAuth"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "pluginSimAdapter is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 151
    :goto_1
    invoke-direct {p0}, Lcom/huawei/sim/multisim/MultiSimAuth;->a()V

    goto :goto_2

    .line 153
    :cond_4
    invoke-direct {p0}, Lcom/huawei/sim/multisim/MultiSimAuth;->e()V

    .line 158
    :cond_5
    :goto_2
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 4

    .line 60
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 62
    const-string v0, "MultiSimAuth"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCreate"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 63
    iput-object p0, p0, Lcom/huawei/sim/multisim/MultiSimAuth;->h:Landroid/content/Context;

    .line 64
    sget v0, Lcom/huawei/sim/R$layout;->activity_multi_sim_auth:I

    invoke-virtual {p0, v0}, Lcom/huawei/sim/multisim/MultiSimAuth;->setContentView(I)V

    .line 66
    invoke-direct {p0}, Lcom/huawei/sim/multisim/MultiSimAuth;->d()V

    .line 68
    invoke-static {p0}, Lo/ecy;->c(Landroid/content/Context;)Lo/ecy;

    move-result-object v0

    invoke-virtual {v0}, Lo/ecy;->getAdapter()Lo/eab;

    move-result-object v0

    check-cast v0, Lo/ecx;

    iput-object v0, p0, Lcom/huawei/sim/multisim/MultiSimAuth;->a:Lo/ecx;

    .line 69
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimAuth;->a:Lo/ecx;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 70
    const-string v0, "MultiSimAuth"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "pluginSimAdapter is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 72
    :cond_0
    invoke-direct {p0}, Lcom/huawei/sim/multisim/MultiSimAuth;->c()V

    .line 73
    return-void
.end method
