.class public Lcom/huawei/health/device/ui/WeightOfflineDataSelectActivity;
.super Landroid/app/Activity;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private a:Landroid/widget/TextView;

.field private b:Landroid/widget/TextView;

.field private c:Landroid/widget/ListView;

.field private d:Landroid/widget/TextView;

.field private e:Landroid/widget/TextView;

.field private f:Landroid/content/Context;

.field private g:Lo/agr;

.field private h:Ljava/lang/String;

.field private i:Lo/acl;

.field private k:Lo/agk;

.field private l:Lo/afp;

.field private n:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lo/agg;>;"
        }
    .end annotation
.end field

.field private o:Landroid/os/Handler;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 47
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    .line 61
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/device/ui/WeightOfflineDataSelectActivity;->n:Ljava/util/ArrayList;

    .line 146
    new-instance v0, Lcom/huawei/health/device/ui/WeightOfflineDataSelectActivity$5;

    invoke-direct {v0, p0}, Lcom/huawei/health/device/ui/WeightOfflineDataSelectActivity$5;-><init>(Lcom/huawei/health/device/ui/WeightOfflineDataSelectActivity;)V

    iput-object v0, p0, Lcom/huawei/health/device/ui/WeightOfflineDataSelectActivity;->o:Landroid/os/Handler;

    return-void
.end method

.method private a()V
    .locals 5

    .line 188
    new-instance v4, Lo/egv$b;

    iget-object v0, p0, Lcom/huawei/health/device/ui/WeightOfflineDataSelectActivity;->f:Landroid/content/Context;

    invoke-direct {v4, v0}, Lo/egv$b;-><init>(Landroid/content/Context;)V

    .line 189
    iget-object v0, p0, Lcom/huawei/health/device/ui/WeightOfflineDataSelectActivity;->f:Landroid/content/Context;

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_device_bluetooth_open:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lo/egv$b;->e(Ljava/lang/String;)Lo/egv$b;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/WeightOfflineDataSelectActivity;->f:Landroid/content/Context;

    sget v2, Lcom/huawei/plugindevice/R$string;->IDS_device_whether_abandon_above_data:I

    .line 190
    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egv$b;->b(Ljava/lang/String;)Lo/egv$b;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/WeightOfflineDataSelectActivity;->f:Landroid/content/Context;

    sget v2, Lcom/huawei/plugindevice/R$string;->IDS_contact_confirm:I

    .line 191
    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/huawei/health/device/ui/WeightOfflineDataSelectActivity$2;

    invoke-direct {v2, p0}, Lcom/huawei/health/device/ui/WeightOfflineDataSelectActivity$2;-><init>(Lcom/huawei/health/device/ui/WeightOfflineDataSelectActivity;)V

    invoke-virtual {v0, v1, v2}, Lo/egv$b;->b(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egv$b;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/WeightOfflineDataSelectActivity;->f:Landroid/content/Context;

    sget v2, Lcom/huawei/plugindevice/R$string;->IDS_settings_button_cancal:I

    .line 210
    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/huawei/health/device/ui/WeightOfflineDataSelectActivity$1;

    invoke-direct {v2, p0}, Lcom/huawei/health/device/ui/WeightOfflineDataSelectActivity$1;-><init>(Lcom/huawei/health/device/ui/WeightOfflineDataSelectActivity;)V

    invoke-virtual {v0, v1, v2}, Lo/egv$b;->e(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egv$b;

    .line 215
    invoke-virtual {v4}, Lo/egv$b;->b()Lo/egv;

    move-result-object v3

    .line 216
    invoke-virtual {v3}, Lo/egv;->show()V

    .line 217
    return-void
.end method

.method static synthetic b(Lcom/huawei/health/device/ui/WeightOfflineDataSelectActivity;)Landroid/widget/TextView;
    .locals 1

    .line 47
    iget-object v0, p0, Lcom/huawei/health/device/ui/WeightOfflineDataSelectActivity;->e:Landroid/widget/TextView;

    return-object v0
.end method

.method private b()V
    .locals 1

    .line 142
    iget-object v0, p0, Lcom/huawei/health/device/ui/WeightOfflineDataSelectActivity;->e:Landroid/widget/TextView;

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 143
    iget-object v0, p0, Lcom/huawei/health/device/ui/WeightOfflineDataSelectActivity;->d:Landroid/widget/TextView;

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 144
    return-void
.end method

.method private b(Landroid/widget/TextView;)V
    .locals 2

    .line 164
    iget-object v0, p0, Lcom/huawei/health/device/ui/WeightOfflineDataSelectActivity;->g:Lo/agr;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/health/device/ui/WeightOfflineDataSelectActivity;->g:Lo/agr;

    invoke-virtual {v0}, Lo/agr;->a()I

    move-result v0

    if-lez v0, :cond_0

    .line 165
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setEnabled(Z)V

    .line 166
    iget-object v0, p0, Lcom/huawei/health/device/ui/WeightOfflineDataSelectActivity;->f:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$color;->hw_show_color_text_100_percent_black:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    goto :goto_0

    .line 168
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setEnabled(Z)V

    .line 169
    iget-object v0, p0, Lcom/huawei/health/device/ui/WeightOfflineDataSelectActivity;->f:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$color;->hw_plugin_ui_60_in_black:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 171
    :goto_0
    return-void
.end method

.method static synthetic c(Lcom/huawei/health/device/ui/WeightOfflineDataSelectActivity;)Landroid/os/Handler;
    .locals 1

    .line 47
    iget-object v0, p0, Lcom/huawei/health/device/ui/WeightOfflineDataSelectActivity;->o:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic c(Lcom/huawei/health/device/ui/WeightOfflineDataSelectActivity;Ljava/lang/String;Ljava/util/ArrayList;)V
    .locals 0

    .line 47
    invoke-direct {p0, p1, p2}, Lcom/huawei/health/device/ui/WeightOfflineDataSelectActivity;->e(Ljava/lang/String;Ljava/util/ArrayList;)V

    return-void
.end method

.method static synthetic d(Lcom/huawei/health/device/ui/WeightOfflineDataSelectActivity;)Ljava/util/ArrayList;
    .locals 1

    .line 47
    iget-object v0, p0, Lcom/huawei/health/device/ui/WeightOfflineDataSelectActivity;->n:Ljava/util/ArrayList;

    return-object v0
.end method

.method private d()V
    .locals 8

    .line 109
    iget-object v0, p0, Lcom/huawei/health/device/ui/WeightOfflineDataSelectActivity;->n:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 110
    invoke-static {}, Lo/czu;->i()Z

    move-result v0

    if-nez v0, :cond_0

    .line 111
    iget-object v0, p0, Lcom/huawei/health/device/ui/WeightOfflineDataSelectActivity;->n:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/huawei/health/device/ui/WeightOfflineDataSelectActivity;->l:Lo/afp;

    invoke-static {}, Lo/adn;->a()Lo/adn;

    move-result-object v2

    invoke-virtual {v2}, Lo/adn;->i()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lo/afp;->e(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    goto :goto_0

    .line 113
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/device/ui/WeightOfflineDataSelectActivity;->n:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/huawei/health/device/ui/WeightOfflineDataSelectActivity;->l:Lo/afp;

    sget-object v2, Lo/act;->a:Lo/act;

    invoke-virtual {v2}, Lo/act;->b()Lo/acu;

    move-result-object v2

    invoke-virtual {v2}, Lo/acu;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lo/afp;->e(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 116
    :goto_0
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "weight offline data size is :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/health/device/ui/WeightOfflineDataSelectActivity;->n:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 118
    iget-object v0, p0, Lcom/huawei/health/device/ui/WeightOfflineDataSelectActivity;->e:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/health/device/ui/WeightOfflineDataSelectActivity;->f:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/plugindevice/R$color;->hw_plugin_ui_60_in_black:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 119
    iget-object v0, p0, Lcom/huawei/health/device/ui/WeightOfflineDataSelectActivity;->b:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/health/device/ui/WeightOfflineDataSelectActivity;->f:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/plugindevice/R$string;->IDS_device_current_user:I

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    sget-object v4, Lo/act;->a:Lo/act;

    invoke-virtual {v4}, Lo/act;->b()Lo/acu;

    move-result-object v4

    invoke-virtual {v4}, Lo/acu;->e()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    invoke-virtual {v1, v2, v3}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 120
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "user num is :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    sget-object v3, Lo/act;->a:Lo/act;

    invoke-virtual {v3}, Lo/act;->e()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 121
    sget-object v0, Lo/act;->a:Lo/act;

    invoke-virtual {v0}, Lo/act;->e()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 122
    iget-object v0, p0, Lcom/huawei/health/device/ui/WeightOfflineDataSelectActivity;->b:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 123
    iget-object v0, p0, Lcom/huawei/health/device/ui/WeightOfflineDataSelectActivity;->a:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/health/device/ui/WeightOfflineDataSelectActivity;->f:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/plugindevice/R$string;->IDS_device_select_data_keep:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 125
    :cond_1
    new-instance v0, Lo/agr;

    iget-object v1, p0, Lcom/huawei/health/device/ui/WeightOfflineDataSelectActivity;->f:Landroid/content/Context;

    iget-object v2, p0, Lcom/huawei/health/device/ui/WeightOfflineDataSelectActivity;->n:Ljava/util/ArrayList;

    iget-object v3, p0, Lcom/huawei/health/device/ui/WeightOfflineDataSelectActivity;->o:Landroid/os/Handler;

    invoke-direct {v0, v1, v2, v3}, Lo/agr;-><init>(Landroid/content/Context;Ljava/util/ArrayList;Landroid/os/Handler;)V

    iput-object v0, p0, Lcom/huawei/health/device/ui/WeightOfflineDataSelectActivity;->g:Lo/agr;

    .line 126
    iget-object v0, p0, Lcom/huawei/health/device/ui/WeightOfflineDataSelectActivity;->g:Lo/agr;

    iget-object v1, p0, Lcom/huawei/health/device/ui/WeightOfflineDataSelectActivity;->n:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Lo/agr;->c(Ljava/util/ArrayList;)V

    .line 127
    iget-object v0, p0, Lcom/huawei/health/device/ui/WeightOfflineDataSelectActivity;->c:Landroid/widget/ListView;

    iget-object v1, p0, Lcom/huawei/health/device/ui/WeightOfflineDataSelectActivity;->g:Lo/agr;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 128
    iget-object v0, p0, Lcom/huawei/health/device/ui/WeightOfflineDataSelectActivity;->e:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setEnabled(Z)V

    .line 129
    iget-object v0, p0, Lcom/huawei/health/device/ui/WeightOfflineDataSelectActivity;->c:Landroid/widget/ListView;

    invoke-static {v0}, Lo/ahf;->a(Landroid/widget/ListView;)I

    move-result v6

    .line 130
    iget-object v0, p0, Lcom/huawei/health/device/ui/WeightOfflineDataSelectActivity;->c:Landroid/widget/ListView;

    invoke-virtual {v0}, Landroid/widget/ListView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v7

    .line 131
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "listViewHeight ==="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 132
    const/16 v0, 0x28a

    if-ge v6, v0, :cond_2

    .line 133
    iput v6, v7, Landroid/view/ViewGroup$LayoutParams;->height:I

    goto :goto_1

    .line 135
    :cond_2
    const/16 v0, 0x28a

    iput v0, v7, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 137
    :goto_1
    iget-object v0, p0, Lcom/huawei/health/device/ui/WeightOfflineDataSelectActivity;->c:Landroid/widget/ListView;

    invoke-virtual {v0, v7}, Landroid/widget/ListView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 139
    return-void
.end method

.method private d(Ljava/util/ArrayList;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Ljava/lang/Boolean;>;)V"
        }
    .end annotation

    .line 223
    iget-object v0, p0, Lcom/huawei/health/device/ui/WeightOfflineDataSelectActivity;->i:Lo/acl;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    iget-object v0, p0, Lcom/huawei/health/device/ui/WeightOfflineDataSelectActivity;->k:Lo/agk;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 224
    const/4 v4, 0x0

    :goto_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v4, v0, :cond_1

    .line 225
    invoke-virtual {p1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 226
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "WeightOfflineDataSelectActivity saveData checked is ::"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 227
    iget-object v0, p0, Lcom/huawei/health/device/ui/WeightOfflineDataSelectActivity;->k:Lo/agk;

    iget-object v1, p0, Lcom/huawei/health/device/ui/WeightOfflineDataSelectActivity;->i:Lo/acl;

    iget-object v2, p0, Lcom/huawei/health/device/ui/WeightOfflineDataSelectActivity;->n:Ljava/util/ArrayList;

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo/afz;

    invoke-virtual {v0, v1, v2}, Lo/agk;->onDataChanged(Lo/acl;Lo/afz;)V

    .line 224
    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    goto/16 :goto_2

    .line 231
    :cond_2
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "WeightOfflineDataSelectActivity saveData device or dataHandler is null, and try again..."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 232
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/WeightOfflineDataSelectActivity;->h:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/afd;->b(Ljava/lang/String;)Lo/acl;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/WeightOfflineDataSelectActivity;->i:Lo/acl;

    .line 233
    new-instance v0, Lo/agk;

    iget-object v1, p0, Lcom/huawei/health/device/ui/WeightOfflineDataSelectActivity;->i:Lo/acl;

    invoke-virtual {v1}, Lo/acl;->e()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    const/16 v3, 0x2716

    invoke-direct {v0, v2, v1, v3}, Lo/agk;-><init>(ILjava/lang/String;I)V

    iput-object v0, p0, Lcom/huawei/health/device/ui/WeightOfflineDataSelectActivity;->k:Lo/agk;

    .line 234
    const/4 v4, 0x0

    :goto_1
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v4, v0, :cond_4

    .line 235
    invoke-virtual {p1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 236
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "WeightOfflineDataSelectActivity saveData checked is ::"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 237
    iget-object v0, p0, Lcom/huawei/health/device/ui/WeightOfflineDataSelectActivity;->k:Lo/agk;

    iget-object v1, p0, Lcom/huawei/health/device/ui/WeightOfflineDataSelectActivity;->i:Lo/acl;

    iget-object v2, p0, Lcom/huawei/health/device/ui/WeightOfflineDataSelectActivity;->n:Ljava/util/ArrayList;

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo/afz;

    invoke-virtual {v0, v1, v2}, Lo/agk;->onDataChanged(Lo/acl;Lo/afz;)V

    .line 234
    :cond_3
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    .line 241
    :cond_4
    :goto_2
    invoke-static {}, Lo/czu;->i()Z

    move-result v0

    if-nez v0, :cond_5

    .line 242
    invoke-static {}, Lo/adn;->a()Lo/adn;

    move-result-object v0

    invoke-virtual {v0}, Lo/adn;->i()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/WeightOfflineDataSelectActivity;->n:Ljava/util/ArrayList;

    invoke-direct {p0, v0, v1}, Lcom/huawei/health/device/ui/WeightOfflineDataSelectActivity;->e(Ljava/lang/String;Ljava/util/ArrayList;)V

    goto :goto_3

    .line 244
    :cond_5
    sget-object v0, Lo/act;->a:Lo/act;

    invoke-virtual {v0}, Lo/act;->b()Lo/acu;

    move-result-object v0

    invoke-virtual {v0}, Lo/acu;->a()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/WeightOfflineDataSelectActivity;->n:Ljava/util/ArrayList;

    invoke-direct {p0, v0, v1}, Lcom/huawei/health/device/ui/WeightOfflineDataSelectActivity;->e(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 247
    :goto_3
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    int-to-double v0, v0

    iget-object v2, p0, Lcom/huawei/health/device/ui/WeightOfflineDataSelectActivity;->n:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    int-to-double v2, v2

    div-double v4, v0, v2

    .line 248
    new-instance v0, Ljava/math/BigDecimal;

    invoke-direct {v0, v4, v5}, Ljava/math/BigDecimal;-><init>(D)V

    sget-object v1, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    const/4 v2, 0x2

    invoke-virtual {v0, v2, v1}, Ljava/math/BigDecimal;->setScale(ILjava/math/RoundingMode;)Ljava/math/BigDecimal;

    move-result-object v0

    invoke-virtual {v0}, Ljava/math/BigDecimal;->doubleValue()D

    move-result-wide v4

    .line 250
    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    .line 251
    const-string v0, "click"

    const-string v1, "1"

    invoke-interface {v6, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 252
    const-string v0, "saveData"

    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    invoke-interface {v6, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 253
    const-string v0, "cancleData"

    const-wide/high16 v1, 0x3ff0000000000000L    # 1.0

    sub-double/2addr v1, v4

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    invoke-interface {v6, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 254
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/WeightOfflineDataSelectActivity;->f:Landroid/content/Context;

    sget-object v2, Lo/dae;->gg:Lo/dae;

    invoke-virtual {v2}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v6, v3}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 255
    return-void
.end method

.method private e()V
    .locals 4

    .line 94
    sget v0, Lcom/huawei/plugindevice/R$id;->weight_offline_data_current_user_tv:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/device/ui/WeightOfflineDataSelectActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/device/ui/WeightOfflineDataSelectActivity;->b:Landroid/widget/TextView;

    .line 95
    sget v0, Lcom/huawei/plugindevice/R$id;->weight_offline_data_list:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/device/ui/WeightOfflineDataSelectActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ListView;

    iput-object v0, p0, Lcom/huawei/health/device/ui/WeightOfflineDataSelectActivity;->c:Landroid/widget/ListView;

    .line 96
    sget v0, Lcom/huawei/plugindevice/R$id;->weight_offline_sync_title_type:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/device/ui/WeightOfflineDataSelectActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/device/ui/WeightOfflineDataSelectActivity;->a:Landroid/widget/TextView;

    .line 97
    sget v0, Lcom/huawei/plugindevice/R$id;->weight_offline_data_cancle:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/device/ui/WeightOfflineDataSelectActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/device/ui/WeightOfflineDataSelectActivity;->d:Landroid/widget/TextView;

    .line 98
    sget v0, Lcom/huawei/plugindevice/R$id;->weight_offline_data_save:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/device/ui/WeightOfflineDataSelectActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/device/ui/WeightOfflineDataSelectActivity;->e:Landroid/widget/TextView;

    .line 100
    iget-object v0, p0, Lcom/huawei/health/device/ui/WeightOfflineDataSelectActivity;->h:Ljava/lang/String;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 101
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/WeightOfflineDataSelectActivity;->h:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/afd;->b(Ljava/lang/String;)Lo/acl;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/WeightOfflineDataSelectActivity;->i:Lo/acl;

    .line 103
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/device/ui/WeightOfflineDataSelectActivity;->i:Lo/acl;

    if-eqz v0, :cond_1

    .line 104
    new-instance v0, Lo/agk;

    iget-object v1, p0, Lcom/huawei/health/device/ui/WeightOfflineDataSelectActivity;->i:Lo/acl;

    invoke-virtual {v1}, Lo/acl;->e()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    const/16 v3, 0x2716

    invoke-direct {v0, v2, v1, v3}, Lo/agk;-><init>(ILjava/lang/String;I)V

    iput-object v0, p0, Lcom/huawei/health/device/ui/WeightOfflineDataSelectActivity;->k:Lo/agk;

    .line 106
    :cond_1
    return-void
.end method

.method static synthetic e(Lcom/huawei/health/device/ui/WeightOfflineDataSelectActivity;Landroid/widget/TextView;)V
    .locals 0

    .line 47
    invoke-direct {p0, p1}, Lcom/huawei/health/device/ui/WeightOfflineDataSelectActivity;->b(Landroid/widget/TextView;)V

    return-void
.end method

.method private e(Ljava/lang/String;Ljava/util/ArrayList;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/util/ArrayList<Lo/agg;>;)V"
        }
    .end annotation

    .line 261
    const/4 v0, 0x0

    if-eq v0, p2, :cond_0

    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    .line 262
    const/4 v3, 0x0

    :goto_0
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v3, v0, :cond_0

    .line 263
    iget-object v0, p0, Lcom/huawei/health/device/ui/WeightOfflineDataSelectActivity;->l:Lo/afp;

    invoke-virtual {p2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/agg;

    invoke-virtual {v1}, Lo/agg;->h()J

    move-result-wide v1

    invoke-virtual {v0, p1, v1, v2}, Lo/afp;->d(Ljava/lang/String;J)V

    .line 262
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 266
    :cond_0
    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 175
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/huawei/plugindevice/R$id;->weight_offline_data_cancle:I

    if-ne v0, v1, :cond_0

    .line 176
    invoke-direct {p0}, Lcom/huawei/health/device/ui/WeightOfflineDataSelectActivity;->a()V

    goto :goto_0

    .line 177
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/huawei/plugindevice/R$id;->weight_offline_data_save:I

    if-ne v0, v1, :cond_1

    .line 178
    iget-object v0, p0, Lcom/huawei/health/device/ui/WeightOfflineDataSelectActivity;->g:Lo/agr;

    invoke-virtual {v0}, Lo/agr;->d()Ljava/util/ArrayList;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/health/device/ui/WeightOfflineDataSelectActivity;->d(Ljava/util/ArrayList;)V

    .line 179
    iget-object v0, p0, Lcom/huawei/health/device/ui/WeightOfflineDataSelectActivity;->o:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 181
    :cond_1
    :goto_0
    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 5

    .line 68
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 69
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "WeightOfflineDataSelectActivity onCreate ..."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 70
    sget v0, Lcom/huawei/plugindevice/R$layout;->activity_layout_weight_offline_data_sync:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/device/ui/WeightOfflineDataSelectActivity;->setContentView(I)V

    .line 71
    iput-object p0, p0, Lcom/huawei/health/device/ui/WeightOfflineDataSelectActivity;->f:Landroid/content/Context;

    .line 72
    iget-object v0, p0, Lcom/huawei/health/device/ui/WeightOfflineDataSelectActivity;->f:Landroid/content/Context;

    invoke-static {v0}, Lo/afp;->d(Landroid/content/Context;)Lo/afp;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/WeightOfflineDataSelectActivity;->l:Lo/afp;

    .line 73
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/health/device/ui/WeightOfflineDataSelectActivity;->setFinishOnTouchOutside(Z)V

    .line 74
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/WeightOfflineDataSelectActivity;->getIntent()Landroid/content/Intent;

    move-result-object v4

    .line 75
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    .line 76
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/WeightOfflineDataSelectActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "productId"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/WeightOfflineDataSelectActivity;->h:Ljava/lang/String;

    .line 77
    iget-object v0, p0, Lcom/huawei/health/device/ui/WeightOfflineDataSelectActivity;->h:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 78
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "WeightOfflineDataSelectActivity  onCreate mProductId is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 79
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/WeightOfflineDataSelectActivity;->finish()V

    .line 80
    return-void

    .line 83
    :cond_0
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "WeightOfflineDataSelectActivity  onCreate intent is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 84
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/WeightOfflineDataSelectActivity;->finish()V

    .line 85
    return-void

    .line 87
    :cond_1
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "WeightOfflineDataSelectActivity  mProductId is::"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/health/device/ui/WeightOfflineDataSelectActivity;->h:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 88
    invoke-direct {p0}, Lcom/huawei/health/device/ui/WeightOfflineDataSelectActivity;->e()V

    .line 89
    invoke-direct {p0}, Lcom/huawei/health/device/ui/WeightOfflineDataSelectActivity;->d()V

    .line 90
    invoke-direct {p0}, Lcom/huawei/health/device/ui/WeightOfflineDataSelectActivity;->b()V

    .line 91
    return-void
.end method

.method protected onDestroy()V
    .locals 0

    .line 279
    invoke-super {p0}, Landroid/app/Activity;->onDestroy()V

    .line 280
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/WeightOfflineDataSelectActivity;->finish()V

    .line 281
    return-void
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 1

    .line 270
    const/4 v0, 0x4

    if-ne p1, v0, :cond_0

    .line 271
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/health/device/ui/WeightOfflineDataSelectActivity;->moveTaskToBack(Z)Z

    .line 272
    const/4 v0, 0x0

    return v0

    .line 274
    :cond_0
    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result v0

    return v0
.end method
