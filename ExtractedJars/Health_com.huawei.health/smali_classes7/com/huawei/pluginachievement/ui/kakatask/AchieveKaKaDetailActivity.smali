.class public Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Lo/dui;


# instance fields
.field private a:Landroid/view/View;

.field private b:Landroid/widget/ListView;

.field private c:Lo/emr;

.field private d:Landroid/widget/TextView;

.field private e:Landroid/widget/ScrollView;

.field private f:Lo/egd;

.field private g:Z

.field private h:Lo/dwr;

.field private i:Lo/dvr;

.field private k:Lo/dxu;

.field private l:Landroid/os/Handler;

.field private m:Ljava/util/concurrent/ExecutorService;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 47
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    .line 72
    new-instance v0, Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity$1;

    invoke-direct {v0, p0}, Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity$1;-><init>(Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity;)V

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity;->l:Landroid/os/Handler;

    return-void
.end method

.method private a()V
    .locals 6

    .line 117
    invoke-virtual {p0}, Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity;->getIntent()Landroid/content/Intent;

    move-result-object v3

    .line 118
    sget v0, Lcom/huawei/pluginachievement/R$id;->title:I

    invoke-static {p0, v0}, Lo/dxi;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emr;

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity;->c:Lo/emr;

    .line 119
    sget v0, Lcom/huawei/pluginachievement/R$id;->kk_rlayout:I

    invoke-static {p0, v0}, Lo/dxi;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ScrollView;

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity;->e:Landroid/widget/ScrollView;

    .line 120
    sget v0, Lcom/huawei/pluginachievement/R$id;->kk_text_no_tip:I

    invoke-static {p0, v0}, Lo/dxi;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity;->d:Landroid/widget/TextView;

    .line 121
    sget v0, Lcom/huawei/pluginachievement/R$id;->kk_listview:I

    invoke-static {p0, v0}, Lo/dxi;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ListView;

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity;->b:Landroid/widget/ListView;

    .line 122
    invoke-static {p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/pluginachievement/R$layout;->achieve_kaka_foot:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity;->a:Landroid/view/View;

    .line 123
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity;->a:Landroid/view/View;

    sget v1, Lcom/huawei/pluginachievement/R$id;->kk_btn_more:I

    invoke-static {v0, v1}, Lo/dxi;->c(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity;->f:Lo/egd;

    .line 124
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity;->f:Lo/egd;

    invoke-virtual {v0, p0}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 125
    sget v0, Lcom/huawei/pluginachievement/R$id;->kk_listview:I

    invoke-static {p0, v0}, Lo/dxi;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ListView;

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity;->b:Landroid/widget/ListView;

    .line 126
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity;->b:Landroid/widget/ListView;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setOverScrollMode(I)V

    .line 127
    new-instance v0, Lo/dxu;

    invoke-direct {v0, p0}, Lo/dxu;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity;->k:Lo/dxu;

    .line 128
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity;->b:Landroid/widget/ListView;

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity;->a:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->addFooterView(Landroid/view/View;)V

    .line 129
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity;->b:Landroid/widget/ListView;

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity;->k:Lo/dxu;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 130
    invoke-direct {p0}, Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity;->i()V

    .line 131
    const-string v4, ""

    .line 132
    const/4 v5, 0x0

    .line 133
    const/4 v0, 0x0

    if-eq v0, v3, :cond_0

    .line 134
    const-string v0, "tag"

    invoke-virtual {v3, v0}, Landroid/content/Intent;->getBundleExtra(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v5

    .line 136
    :cond_0
    if-eqz v5, :cond_1

    .line 137
    const-string v0, "PLGACHIEVE_AchieveKaKaDetailActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "initView tag ="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 138
    const-string v0, "tag"

    invoke-virtual {v5, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    goto :goto_0

    .line 140
    :cond_1
    return-void

    .line 144
    :goto_0
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "rule"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 145
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity;->c:Lo/emr;

    sget v1, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_kk_kaka_rule:I

    invoke-virtual {p0, v1}, Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setTitleText(Ljava/lang/String;)V

    .line 146
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity;->e:Landroid/widget/ScrollView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ScrollView;->setVisibility(I)V

    .line 147
    const-string v0, "2"

    invoke-direct {p0, v0}, Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity;->b(Ljava/lang/String;)V

    goto :goto_1

    .line 148
    :cond_2
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    const-string v0, "deail"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 149
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity;->c:Lo/emr;

    sget v1, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_kk_get_consume:I

    invoke-virtual {p0, v1}, Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setTitleText(Ljava/lang/String;)V

    .line 150
    invoke-direct {p0}, Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity;->e()V

    .line 151
    const-string v0, "4"

    invoke-direct {p0, v0}, Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity;->b(Ljava/lang/String;)V

    .line 153
    :cond_3
    :goto_1
    return-void
.end method

.method static synthetic a(Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity;)V
    .locals 0

    .line 47
    invoke-direct {p0}, Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity;->b()V

    return-void
.end method

.method private b()V
    .locals 4

    .line 202
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 203
    const-string v0, "page"

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 204
    const-string v0, "pageSize"

    const/16 v1, 0xa

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 205
    const/4 v3, 0x0

    .line 206
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity;->h:Lo/dwr;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 207
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity;->h:Lo/dwr;

    const/4 v1, 0x6

    invoke-virtual {v0, v1, v2}, Lo/dwr;->a(ILjava/util/Map;)Lo/dvf;

    move-result-object v3

    .line 209
    :cond_0
    const/4 v0, 0x0

    if-eq v0, v3, :cond_1

    .line 210
    move-object v0, v3

    check-cast v0, Lo/dvr;

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity;->i:Lo/dvr;

    .line 211
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity;->i:Lo/dvr;

    invoke-virtual {v0}, Lo/dvr;->b()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 213
    const/16 v0, 0x44e

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity;->e(ILjava/lang/Object;)V

    .line 216
    :cond_1
    return-void
.end method

.method static synthetic b(Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity;)V
    .locals 0

    .line 47
    invoke-direct {p0}, Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity;->d()V

    return-void
.end method

.method private b(Ljava/lang/String;)V
    .locals 5

    .line 160
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 161
    const-string v0, "click"

    const-string v1, "1"

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 162
    const-string v0, "type"

    invoke-interface {v4, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 163
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    sget-object v2, Lo/dae;->S:Lo/dae;

    invoke-virtual {v2}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v4, v3}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 164
    return-void
.end method

.method private c()V
    .locals 2

    .line 236
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity;->d:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 237
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity;->i:Lo/dvr;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 238
    return-void

    .line 240
    :cond_0
    invoke-direct {p0}, Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity;->i()V

    .line 241
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity;->i:Lo/dvr;

    invoke-virtual {v0}, Lo/dvr;->b()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity;->i:Lo/dvr;

    invoke-virtual {v0}, Lo/dvr;->b()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-eqz v0, :cond_1

    .line 242
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity;->d:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 243
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity;->i:Lo/dvr;

    invoke-virtual {v0}, Lo/dvr;->b()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    rem-int/lit8 v0, v0, 0xa

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity;->g:Z

    if-nez v0, :cond_1

    .line 245
    invoke-direct {p0}, Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity;->k()V

    .line 248
    :cond_1
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity;->i:Lo/dvr;

    invoke-virtual {v0}, Lo/dvr;->c()I

    move-result v0

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity;->i:Lo/dvr;

    invoke-virtual {v1}, Lo/dvr;->b()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ne v0, v1, :cond_2

    .line 249
    invoke-direct {p0}, Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity;->i()V

    .line 251
    :cond_2
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity;->g:Z

    .line 252
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity;->k:Lo/dxu;

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity;->i:Lo/dvr;

    invoke-virtual {v1}, Lo/dvr;->b()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/dxu;->c(Ljava/util/List;)V

    .line 253
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity;->k:Lo/dxu;

    invoke-virtual {v0}, Lo/dxu;->notifyDataSetChanged()V

    .line 254
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity;->i:Lo/dvr;

    invoke-virtual {v0}, Lo/dvr;->b()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity;->i:Lo/dvr;

    invoke-virtual {v0}, Lo/dvr;->b()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/16 v1, 0xa

    if-gt v0, v1, :cond_3

    .line 256
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity;->b:Landroid/widget/ListView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setSelection(I)V

    .line 258
    :cond_3
    return-void
.end method

.method static synthetic c(Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity;)V
    .locals 0

    .line 47
    invoke-direct {p0}, Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity;->c()V

    return-void
.end method

.method static synthetic c(Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity;ILjava/lang/Object;)V
    .locals 0

    .line 47
    invoke-direct {p0, p1, p2}, Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity;->e(ILjava/lang/Object;)V

    return-void
.end method

.method static synthetic d(Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity;Ljava/util/concurrent/ExecutorService;)Ljava/util/concurrent/ExecutorService;
    .locals 0

    .line 47
    iput-object p1, p0, Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity;->m:Ljava/util/concurrent/ExecutorService;

    return-object p1
.end method

.method private d()V
    .locals 7

    .line 220
    invoke-virtual {p0}, Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dwo;->c(Landroid/content/Context;)Lo/dwo;

    move-result-object v3

    .line 222
    const-wide/16 v4, 0x0

    .line 223
    const/4 v0, 0x0

    if-eq v0, v3, :cond_0

    .line 224
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity;->h:Lo/dwr;

    invoke-virtual {v3, v0}, Lo/dwo;->b(Lo/dwr;)J

    .line 226
    :cond_0
    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    .line 227
    const-string v0, "timestamp"

    invoke-static {v4, v5}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v6, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 228
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity;->h:Lo/dwr;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 229
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity;->h:Lo/dwr;

    const/4 v1, 0x1

    invoke-virtual {v0, v1, v6}, Lo/dwr;->d(ILjava/util/Map;)V

    .line 231
    :cond_1
    const-string v0, "PLGACHIEVE_AchieveKaKaDetailActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "doRfreshKakaline() timeKakaMax="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 232
    return-void
.end method

.method static synthetic d(Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity;)V
    .locals 0

    .line 47
    invoke-direct {p0}, Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity;->i()V

    return-void
.end method

.method static synthetic e(Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity;)Ljava/util/concurrent/ExecutorService;
    .locals 1

    .line 47
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity;->m:Ljava/util/concurrent/ExecutorService;

    return-object v0
.end method

.method private e()V
    .locals 2

    .line 188
    invoke-virtual {p0}, Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dwr;->b(Landroid/content/Context;)Lo/dwr;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity;->h:Lo/dwr;

    .line 189
    const-string v0, "PLGACHIEVE_AchieveKaKaDetailActivity"

    const-string v1, "getData()"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 190
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity;->h:Lo/dwr;

    invoke-virtual {v0, p0}, Lo/dwr;->b(Lo/dui;)V

    .line 191
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity;->m:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity$4;

    invoke-direct {v1, p0}, Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity$4;-><init>(Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 199
    return-void
.end method

.method private e(ILjava/lang/Object;)V
    .locals 2

    .line 261
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v1

    .line 262
    iput p1, v1, Landroid/os/Message;->what:I

    .line 263
    iput-object p2, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 264
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity;->l:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 265
    return-void
.end method

.method static synthetic e(Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity;Z)Z
    .locals 0

    .line 47
    iput-boolean p1, p0, Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity;->g:Z

    return p1
.end method

.method static synthetic g(Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity;)Lo/dvr;
    .locals 1

    .line 47
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity;->i:Lo/dvr;

    return-object v0
.end method

.method private h()V
    .locals 2

    .line 295
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity;->i:Lo/dvr;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity;->i:Lo/dvr;

    invoke-virtual {v0}, Lo/dvr;->b()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 296
    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity;->g:Z

    .line 297
    invoke-direct {p0}, Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity;->i()V

    .line 298
    return-void

    .line 301
    :cond_1
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity;->m:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity$5;

    invoke-direct {v1, p0}, Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity$5;-><init>(Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 332
    return-void
.end method

.method private i()V
    .locals 5

    .line 268
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity;->a:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    .line 269
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity;->a:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 271
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity;->a:Landroid/view/View;

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity;->a:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    move-result v1

    neg-int v1, v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual {v0, v2, v1, v3, v4}, Landroid/view/View;->setPadding(IIII)V

    .line 273
    :cond_0
    return-void
.end method

.method static synthetic k(Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity;)Lo/dwr;
    .locals 1

    .line 47
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity;->h:Lo/dwr;

    return-object v0
.end method

.method private k()V
    .locals 5

    .line 276
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity;->a:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-eqz v0, :cond_0

    .line 277
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity;->a:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 278
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity;->a:Landroid/view/View;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/view/View;->setPadding(IIII)V

    .line 280
    :cond_0
    return-void
.end method


# virtual methods
.method public e(ILo/dwk;)V
    .locals 3

    .line 336
    const-string v0, "PLGACHIEVE_AchieveKaKaDetailActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onDataChanged error="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 337
    const/4 v0, -0x1

    if-ne p1, v0, :cond_0

    .line 339
    const-string v0, "PLGACHIEVE_AchieveKaKaDetailActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "showNetworkErrorDialog error="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 340
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity;->l:Landroid/os/Handler;

    const/16 v1, 0x3e9

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 341
    return-void

    .line 343
    :cond_0
    const/4 v0, 0x0

    if-ne v0, p2, :cond_1

    .line 344
    return-void

    .line 346
    :cond_1
    const-string v0, "PLGACHIEVE_AchieveKaKaDetailActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onDataChanged resultCode="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p2}, Lo/dwk;->o()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 347
    invoke-virtual {p2}, Lo/dwk;->l()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    .line 348
    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity;->e(ILjava/lang/Object;)V

    .line 350
    :cond_2
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 5

    .line 284
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 285
    const-string v0, "click"

    const-string v1, "1"

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 286
    sget v0, Lcom/huawei/pluginachievement/R$id;->kk_btn_more:I

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v1

    if-ne v0, v1, :cond_0

    .line 288
    invoke-direct {p0}, Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity;->h()V

    .line 289
    const-string v0, "type"

    const-string v1, "3"

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 290
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    sget-object v2, Lo/dae;->S:Lo/dae;

    invoke-virtual {v2}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v4, v3}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 292
    :cond_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 110
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 111
    sget v0, Lcom/huawei/pluginachievement/R$layout;->achieve_kaka_detail:I

    invoke-virtual {p0, v0}, Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity;->setContentView(I)V

    .line 112
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity;->m:Ljava/util/concurrent/ExecutorService;

    .line 113
    invoke-direct {p0}, Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity;->a()V

    .line 114
    return-void
.end method

.method public onDestroy()V
    .locals 2

    .line 169
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onDestroy()V

    .line 170
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity;->m:Ljava/util/concurrent/ExecutorService;

    invoke-static {v0}, Lo/dzw;->c(Ljava/util/concurrent/ExecutorService;)V

    .line 171
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity;->i:Lo/dvr;

    if-eqz v0, :cond_0

    .line 172
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity;->i:Lo/dvr;

    invoke-virtual {v0}, Lo/dvr;->b()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 173
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity;->i:Lo/dvr;

    invoke-virtual {v0}, Lo/dvr;->b()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 176
    :cond_0
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity;->h:Lo/dwr;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 177
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity;->h:Lo/dwr;

    invoke-virtual {v0, p0}, Lo/dwr;->d(Lo/dui;)V

    .line 179
    :cond_1
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity;->h:Lo/dwr;

    .line 180
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity;->l:Landroid/os/Handler;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 181
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity;->l:Landroid/os/Handler;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 182
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity;->l:Landroid/os/Handler;

    const/16 v1, 0x44e

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 183
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity;->l:Landroid/os/Handler;

    const/16 v1, 0x44f

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 185
    :cond_2
    return-void
.end method
