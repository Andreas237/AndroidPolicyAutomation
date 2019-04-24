.class public Lcom/huawei/sim/esim/view/WirelessManagerAcitivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"


# instance fields
.field private a:Landroid/widget/TextView;

.field private b:Landroid/widget/ListView;

.field private c:Lo/edu;

.field private d:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lo/edd;>;"
        }
    .end annotation
.end field

.field private e:Landroid/content/Context;

.field private f:Landroid/view/View$OnClickListener;

.field private g:Ljava/lang/String;

.field private h:Ljava/lang/String;

.field private i:Landroid/view/View;

.field private k:Lo/ecx;

.field private o:Landroid/view/View$OnClickListener;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 46
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    .line 52
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/sim/esim/view/WirelessManagerAcitivity;->d:Ljava/util/ArrayList;

    .line 57
    const-string v0, "https://health.vmall.com/help/huawei-watch2/app8.0/en-US/content/en-us_topic_0044851531.html?pos=8"

    iput-object v0, p0, Lcom/huawei/sim/esim/view/WirelessManagerAcitivity;->g:Ljava/lang/String;

    .line 58
    const-string v0, "https://health.vmall.com/help/huawei-watch2/app8.0/zh-CN/zh-cn_bookmap_0047655720.html?pos=3"

    iput-object v0, p0, Lcom/huawei/sim/esim/view/WirelessManagerAcitivity;->h:Ljava/lang/String;

    .line 184
    new-instance v0, Lcom/huawei/sim/esim/view/WirelessManagerAcitivity$1;

    invoke-direct {v0, p0}, Lcom/huawei/sim/esim/view/WirelessManagerAcitivity$1;-><init>(Lcom/huawei/sim/esim/view/WirelessManagerAcitivity;)V

    iput-object v0, p0, Lcom/huawei/sim/esim/view/WirelessManagerAcitivity;->f:Landroid/view/View$OnClickListener;

    .line 209
    new-instance v0, Lcom/huawei/sim/esim/view/WirelessManagerAcitivity$5;

    invoke-direct {v0, p0}, Lcom/huawei/sim/esim/view/WirelessManagerAcitivity$5;-><init>(Lcom/huawei/sim/esim/view/WirelessManagerAcitivity;)V

    iput-object v0, p0, Lcom/huawei/sim/esim/view/WirelessManagerAcitivity;->o:Landroid/view/View$OnClickListener;

    return-void
.end method

.method static synthetic b(Lcom/huawei/sim/esim/view/WirelessManagerAcitivity;)Landroid/content/Context;
    .locals 1

    .line 46
    iget-object v0, p0, Lcom/huawei/sim/esim/view/WirelessManagerAcitivity;->e:Landroid/content/Context;

    return-object v0
.end method

.method private b()V
    .locals 6

    .line 141
    new-instance v4, Lo/edd;

    invoke-direct {v4}, Lo/edd;-><init>()V

    .line 142
    iget-object v0, p0, Lcom/huawei/sim/esim/view/WirelessManagerAcitivity;->k:Lo/ecx;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 143
    return-void

    .line 145
    :cond_0
    iget-object v0, p0, Lcom/huawei/sim/esim/view/WirelessManagerAcitivity;->k:Lo/ecx;

    invoke-interface {v0}, Lo/ecx;->d()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 146
    const-string v0, "WirelessManagerAcitivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "create esim menu"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 148
    iget-object v0, p0, Lcom/huawei/sim/esim/view/WirelessManagerAcitivity;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/ene;->c(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-nez v0, :cond_1

    .line 150
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x18

    if-lt v0, v1, :cond_1

    invoke-static {}, Lo/dbf;->d()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 151
    const-string v0, "WirelessManagerAcitivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "create multisim menu"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 152
    new-instance v5, Lo/edd;

    invoke-direct {v5}, Lo/edd;-><init>()V

    .line 153
    sget v0, Lcom/huawei/sim/R$string;->IDS_plugin_multi_sim_config_title:I

    invoke-virtual {p0, v0}, Lcom/huawei/sim/esim/view/WirelessManagerAcitivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lo/edd;->b(Ljava/lang/String;)V

    .line 155
    iget-object v0, p0, Lcom/huawei/sim/esim/view/WirelessManagerAcitivity;->o:Landroid/view/View$OnClickListener;

    invoke-virtual {v5, v0}, Lo/edd;->c(Landroid/view/View$OnClickListener;)V

    .line 156
    iget-object v0, p0, Lcom/huawei/sim/esim/view/WirelessManagerAcitivity;->d:Ljava/util/ArrayList;

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 160
    :cond_1
    sget v0, Lcom/huawei/sim/R$string;->IDS_plugin_sim_esim_open:I

    invoke-virtual {p0, v0}, Lcom/huawei/sim/esim/view/WirelessManagerAcitivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lo/edd;->b(Ljava/lang/String;)V

    .line 161
    sget v0, Lcom/huawei/sim/R$string;->IDS_plugin_sim_esim_open_tips:I

    invoke-virtual {p0, v0}, Lcom/huawei/sim/esim/view/WirelessManagerAcitivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lo/edd;->d(Ljava/lang/String;)V

    .line 162
    iget-object v0, p0, Lcom/huawei/sim/esim/view/WirelessManagerAcitivity;->f:Landroid/view/View$OnClickListener;

    invoke-virtual {v4, v0}, Lo/edd;->c(Landroid/view/View$OnClickListener;)V

    .line 163
    iget-object v0, p0, Lcom/huawei/sim/esim/view/WirelessManagerAcitivity;->d:Ljava/util/ArrayList;

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 164
    new-instance v0, Lo/edu;

    iget-object v1, p0, Lcom/huawei/sim/esim/view/WirelessManagerAcitivity;->d:Ljava/util/ArrayList;

    invoke-direct {v0, v1, p0}, Lo/edu;-><init>(Ljava/util/ArrayList;Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/sim/esim/view/WirelessManagerAcitivity;->c:Lo/edu;

    .line 166
    :cond_2
    return-void
.end method

.method private c()V
    .locals 2

    .line 205
    new-instance v1, Landroid/content/Intent;

    const-class v0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;

    invoke-direct {v1, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 206
    iget-object v0, p0, Lcom/huawei/sim/esim/view/WirelessManagerAcitivity;->e:Landroid/content/Context;

    invoke-virtual {v0, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 207
    return-void
.end method

.method static synthetic c(Lcom/huawei/sim/esim/view/WirelessManagerAcitivity;)V
    .locals 0

    .line 46
    invoke-direct {p0}, Lcom/huawei/sim/esim/view/WirelessManagerAcitivity;->c()V

    return-void
.end method

.method static synthetic d(Lcom/huawei/sim/esim/view/WirelessManagerAcitivity;)Ljava/lang/String;
    .locals 1

    .line 46
    iget-object v0, p0, Lcom/huawei/sim/esim/view/WirelessManagerAcitivity;->h:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic e(Lcom/huawei/sim/esim/view/WirelessManagerAcitivity;)Ljava/lang/String;
    .locals 1

    .line 46
    iget-object v0, p0, Lcom/huawei/sim/esim/view/WirelessManagerAcitivity;->g:Ljava/lang/String;

    return-object v0
.end method

.method private e()V
    .locals 12

    .line 80
    sget v0, Lcom/huawei/sim/R$id;->listView:I

    invoke-virtual {p0, v0}, Lcom/huawei/sim/esim/view/WirelessManagerAcitivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ListView;

    iput-object v0, p0, Lcom/huawei/sim/esim/view/WirelessManagerAcitivity;->b:Landroid/widget/ListView;

    .line 81
    iget-object v0, p0, Lcom/huawei/sim/esim/view/WirelessManagerAcitivity;->b:Landroid/widget/ListView;

    iget-object v1, p0, Lcom/huawei/sim/esim/view/WirelessManagerAcitivity;->c:Lo/edu;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 83
    sget v0, Lcom/huawei/sim/R$id;->wirless_manager_txt:I

    invoke-virtual {p0, v0}, Lcom/huawei/sim/esim/view/WirelessManagerAcitivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/sim/esim/view/WirelessManagerAcitivity;->a:Landroid/widget/TextView;

    .line 84
    sget v0, Lcom/huawei/sim/R$id;->wirless_manager_lint:I

    invoke-virtual {p0, v0}, Lcom/huawei/sim/esim/view/WirelessManagerAcitivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/sim/esim/view/WirelessManagerAcitivity;->i:Landroid/view/View;

    .line 86
    iget-object v0, p0, Lcom/huawei/sim/esim/view/WirelessManagerAcitivity;->k:Lo/ecx;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/sim/esim/view/WirelessManagerAcitivity;->k:Lo/ecx;

    invoke-interface {v0}, Lo/ecx;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 87
    iget-object v0, p0, Lcom/huawei/sim/esim/view/WirelessManagerAcitivity;->a:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 88
    iget-object v0, p0, Lcom/huawei/sim/esim/view/WirelessManagerAcitivity;->i:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 90
    sget v0, Lcom/huawei/sim/R$string;->IDS_plugin_multi_sim_manager_txt:I

    invoke-virtual {p0, v0}, Lcom/huawei/sim/esim/view/WirelessManagerAcitivity;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 91
    sget v0, Lcom/huawei/sim/R$string;->IDS_plugin_multi_sim_manager_title:I

    invoke-virtual {p0, v0}, Lcom/huawei/sim/esim/view/WirelessManagerAcitivity;->getString(I)Ljava/lang/String;

    move-result-object v5

    .line 93
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object v5, v0, v1

    invoke-static {v4, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    .line 95
    invoke-virtual {v6, v5}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v7

    .line 97
    new-instance v8, Landroid/text/SpannableStringBuilder;

    invoke-direct {v8}, Landroid/text/SpannableStringBuilder;-><init>()V

    .line 98
    new-instance v9, Landroid/text/SpannableString;

    const/4 v0, 0x0

    aget-object v0, v7, v0

    invoke-direct {v9, v0}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 99
    new-instance v0, Landroid/text/style/ForegroundColorSpan;

    sget v1, Lcom/huawei/sim/R$color;->color_device_setting_sub_text_color:I

    invoke-static {p0, v1}, Landroid/support/v4/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v1

    invoke-direct {v0, v1}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    .line 100
    invoke-virtual {v9}, Landroid/text/SpannableString;->length()I

    move-result v1

    .line 99
    const/4 v2, 0x0

    const/16 v3, 0x21

    invoke-virtual {v9, v0, v2, v1, v3}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 101
    invoke-virtual {v8, v9}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 103
    new-instance v10, Landroid/text/SpannableString;

    invoke-direct {v10, v5}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 104
    new-instance v0, Lcom/huawei/sim/esim/view/WirelessManagerAcitivity$2;

    invoke-direct {v0, p0}, Lcom/huawei/sim/esim/view/WirelessManagerAcitivity$2;-><init>(Lcom/huawei/sim/esim/view/WirelessManagerAcitivity;)V

    .line 123
    invoke-virtual {v10}, Landroid/text/SpannableString;->length()I

    move-result v1

    .line 104
    const/4 v2, 0x0

    const/16 v3, 0x21

    invoke-virtual {v10, v0, v2, v1, v3}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 124
    invoke-virtual {v8, v10}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 126
    new-instance v11, Landroid/text/SpannableString;

    const/4 v0, 0x1

    aget-object v0, v7, v0

    invoke-direct {v11, v0}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 127
    new-instance v0, Landroid/text/style/ForegroundColorSpan;

    sget v1, Lcom/huawei/sim/R$color;->color_device_setting_sub_text_color:I

    invoke-static {p0, v1}, Landroid/support/v4/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v1

    invoke-direct {v0, v1}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    .line 128
    invoke-virtual {v11}, Landroid/text/SpannableString;->length()I

    move-result v1

    .line 127
    const/4 v2, 0x0

    const/16 v3, 0x21

    invoke-virtual {v11, v0, v2, v1, v3}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 129
    invoke-virtual {v8, v11}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 131
    iget-object v0, p0, Lcom/huawei/sim/esim/view/WirelessManagerAcitivity;->a:Landroid/widget/TextView;

    invoke-virtual {v0, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 132
    iget-object v0, p0, Lcom/huawei/sim/esim/view/WirelessManagerAcitivity;->a:Landroid/widget/TextView;

    invoke-static {}, Landroid/text/method/LinkMovementMethod;->getInstance()Landroid/text/method/MovementMethod;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setMovementMethod(Landroid/text/method/MovementMethod;)V

    .line 133
    iget-object v0, p0, Lcom/huawei/sim/esim/view/WirelessManagerAcitivity;->a:Landroid/widget/TextView;

    sget v1, Lcom/huawei/sim/R$color;->IDS_plugin_sim_transparent:I

    invoke-static {p0, v1}, Landroid/support/v4/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setHighlightColor(I)V

    .line 134
    goto :goto_0

    .line 135
    :cond_0
    iget-object v0, p0, Lcom/huawei/sim/esim/view/WirelessManagerAcitivity;->a:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 136
    iget-object v0, p0, Lcom/huawei/sim/esim/view/WirelessManagerAcitivity;->i:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 138
    :goto_0
    return-void
.end method


# virtual methods
.method public d()Z
    .locals 6

    .line 194
    iget-object v0, p0, Lcom/huawei/sim/esim/view/WirelessManagerAcitivity;->e:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v4

    .line 196
    const-string v0, "com.huawei.hwmultisim"

    const/16 v1, 0x80

    :try_start_0
    invoke-virtual {v4, v0, v1}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 200
    goto :goto_0

    .line 197
    :catch_0
    move-exception v5

    .line 198
    const-string v0, "WirelessManagerAcitivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "no multisim apk"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 199
    const/4 v0, 0x0

    return v0

    .line 201
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 4

    .line 66
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 67
    sget v0, Lcom/huawei/sim/R$layout;->wireless_activity:I

    invoke-virtual {p0, v0}, Lcom/huawei/sim/esim/view/WirelessManagerAcitivity;->setContentView(I)V

    .line 68
    iput-object p0, p0, Lcom/huawei/sim/esim/view/WirelessManagerAcitivity;->e:Landroid/content/Context;

    .line 69
    invoke-static {p0}, Lo/ecy;->c(Landroid/content/Context;)Lo/ecy;

    move-result-object v0

    invoke-virtual {v0}, Lo/ecy;->getAdapter()Lo/eab;

    move-result-object v0

    check-cast v0, Lo/ecx;

    iput-object v0, p0, Lcom/huawei/sim/esim/view/WirelessManagerAcitivity;->k:Lo/ecx;

    .line 70
    iget-object v0, p0, Lcom/huawei/sim/esim/view/WirelessManagerAcitivity;->k:Lo/ecx;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 71
    const-string v0, "WirelessManagerAcitivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "pluginSimAdapter is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 73
    :cond_0
    invoke-direct {p0}, Lcom/huawei/sim/esim/view/WirelessManagerAcitivity;->b()V

    .line 74
    invoke-direct {p0}, Lcom/huawei/sim/esim/view/WirelessManagerAcitivity;->e()V

    .line 75
    invoke-static {p0}, Lo/ecy;->c(Landroid/content/Context;)Lo/ecy;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/ecy;->e(Z)V

    .line 77
    return-void
.end method

.method public onDestroy()V
    .locals 2

    .line 174
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onDestroy()V

    .line 175
    invoke-static {p0}, Lo/ecy;->c(Landroid/content/Context;)Lo/ecy;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/ecy;->e(Z)V

    .line 176
    return-void
.end method

.method public onPause()V
    .locals 0

    .line 180
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onPause()V

    .line 181
    return-void
.end method

.method public onResume()V
    .locals 0

    .line 169
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onResume()V

    .line 170
    return-void
.end method
