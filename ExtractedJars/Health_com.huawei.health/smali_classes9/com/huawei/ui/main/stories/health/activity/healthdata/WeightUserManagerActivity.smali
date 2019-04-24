.class public Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity;
.super Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataBaseActivity;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity$d;,
        Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity$b;
    }
.end annotation


# instance fields
.field private a:Landroid/widget/ListView;

.field private b:Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity$d;

.field private c:Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity;

.field private d:Landroid/support/v4/content/LocalBroadcastManager;

.field e:Lcom/huawei/up/callback/CommonCallback;

.field private f:Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity$b;

.field private g:Landroid/view/View;

.field private h:Lo/fip;

.field private i:Lo/ems;

.field private k:Lo/emr;

.field private l:Landroid/widget/LinearLayout;

.field private m:Landroid/widget/LinearLayout;

.field private final o:Landroid/content/BroadcastReceiver;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 54
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataBaseActivity;-><init>()V

    .line 269
    new-instance v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity$3;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity$3;-><init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity;->o:Landroid/content/BroadcastReceiver;

    .line 304
    new-instance v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity$2;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity$2;-><init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity;->e:Lcom/huawei/up/callback/CommonCallback;

    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity;Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity$b;)Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity$b;
    .locals 0

    .line 54
    iput-object p1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity;->f:Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity$b;

    return-object p1
.end method

.method private a()V
    .locals 3

    .line 139
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity;->c:Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity;

    sget v1, Lcom/huawei/ui/main/R$id;->fitness_detail_titlebar:I

    invoke-static {v0, v1}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emr;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity;->k:Lo/emr;

    .line 140
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity;->k:Lo/emr;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_base_health_user_list_manager_user:I

    invoke-virtual {p0, v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setTitleText(Ljava/lang/String;)V

    .line 141
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity;->c:Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity;

    sget v1, Lcom/huawei/ui/main/R$id;->weight_user_manager_list_view:I

    invoke-static {v0, v1}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ListView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity;->a:Landroid/widget/ListView;

    .line 143
    sget v0, Lcom/huawei/ui/main/R$id;->buttomview:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/ems;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity;->i:Lo/ems;

    .line 144
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity;->c:Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity;

    sget v1, Lcom/huawei/ui/main/R$layout;->health_data_user_manager_bottomview:I

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity;->g:Landroid/view/View;

    .line 145
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity;->i:Lo/ems;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity;->g:Landroid/view/View;

    invoke-virtual {v0, v1}, Lo/ems;->e(Landroid/view/View;)V

    .line 146
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity;->i:Lo/ems;

    invoke-virtual {v0, p0}, Lo/ems;->a(Landroid/app/Activity;)V

    .line 147
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity;->g:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->hw_show_health_weight_add_user:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity;->l:Landroid/widget/LinearLayout;

    .line 148
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity;->g:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->hw_show_health_weight_setting:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity;->m:Landroid/widget/LinearLayout;

    .line 149
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity;->l:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 150
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity;->m:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 152
    new-instance v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity$d;

    sget-object v1, Lo/act;->a:Lo/act;

    invoke-virtual {v1}, Lo/act;->e()Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity$d;-><init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity;Ljava/util/List;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity$d;

    .line 153
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity;->a:Landroid/widget/ListView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity$d;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 154
    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity;)V
    .locals 0

    .line 54
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity;->h()V

    return-void
.end method

.method private a(Lcom/huawei/up/model/UserInfomation;)V
    .locals 7

    .line 114
    const/4 v0, 0x0

    if-eq v0, p1, :cond_2

    .line 115
    const-string v0, "PluginDevice_WeightUserManagerActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "userinfo = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Lcom/huawei/up/model/UserInfomation;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 116
    invoke-static {p1}, Lo/fiq;->c(Lcom/huawei/up/model/UserInfomation;)Ljava/lang/String;

    move-result-object v4

    .line 117
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 118
    new-instance v5, Lcom/huawei/up/api/UpApi;

    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity;->c:Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity;

    invoke-direct {v5, v0}, Lcom/huawei/up/api/UpApi;-><init>(Landroid/content/Context;)V

    .line 119
    invoke-virtual {v5}, Lcom/huawei/up/api/UpApi;->getAccountName()Ljava/lang/String;

    move-result-object v6

    .line 120
    const-string v0, "PluginDevice_WeightUserManagerActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "userinfo = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 121
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 122
    sget-object v0, Lo/act;->a:Lo/act;

    invoke-virtual {v0}, Lo/act;->d()Lo/acu;

    move-result-object v0

    invoke-virtual {v0, v6}, Lo/acu;->c(Ljava/lang/String;)V

    .line 123
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity;->c:Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity;

    invoke-static {v0}, Lo/dnm;->a(Landroid/content/Context;)Lo/dnm;

    move-result-object v0

    invoke-virtual {v0, v6}, Lo/dnm;->a(Ljava/lang/String;)V

    .line 125
    :cond_0
    goto :goto_0

    .line 126
    :cond_1
    sget-object v0, Lo/act;->a:Lo/act;

    invoke-virtual {v0}, Lo/act;->d()Lo/acu;

    move-result-object v0

    invoke-virtual {v0, v4}, Lo/acu;->c(Ljava/lang/String;)V

    .line 129
    :goto_0
    invoke-static {p1}, Lo/fiq;->a(Lcom/huawei/up/model/UserInfomation;)Ljava/lang/String;

    move-result-object v5

    .line 130
    sget-object v0, Lo/act;->a:Lo/act;

    invoke-virtual {v0}, Lo/act;->d()Lo/acu;

    move-result-object v0

    invoke-virtual {v0, v5}, Lo/acu;->a(Ljava/lang/String;)V

    .line 131
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity;->g()V

    .line 133
    :cond_2
    return-void
.end method

.method static synthetic b(Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity;)Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity$d;
    .locals 1

    .line 54
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity$d;

    return-object v0
.end method

.method private b()V
    .locals 3

    .line 179
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity;->c:Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 180
    new-instance v2, Landroid/content/Intent;

    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity;->c:Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity;

    const-class v1, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;

    invoke-direct {v2, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 181
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity;->c:Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity;

    invoke-virtual {v0, v2}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity;->startActivity(Landroid/content/Intent;)V

    .line 183
    :cond_0
    return-void
.end method

.method static synthetic b(Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity;Lcom/huawei/up/model/UserInfomation;)V
    .locals 0

    .line 54
    invoke-direct {p0, p1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity;->a(Lcom/huawei/up/model/UserInfomation;)V

    return-void
.end method

.method static synthetic b(Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity;Ljava/lang/String;)V
    .locals 0

    .line 54
    invoke-direct {p0, p1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity;->c(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic c(Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity;)Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity$b;
    .locals 1

    .line 54
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity;->f:Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity$b;

    return-object v0
.end method

.method private c(Ljava/lang/String;)V
    .locals 3

    .line 318
    new-instance v2, Landroid/content/Intent;

    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity;->c:Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity;

    const-class v1, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;

    invoke-direct {v2, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 319
    const-string v0, "weight_user_id_key"

    invoke-virtual {v2, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 320
    invoke-virtual {p0, v2}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity;->startActivity(Landroid/content/Intent;)V

    .line 321
    return-void
.end method

.method private d()V
    .locals 2

    .line 157
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity;->a:Landroid/widget/ListView;

    new-instance v1, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity$5;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity$5;-><init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 173
    return-void
.end method

.method static synthetic d(Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity;)V
    .locals 0

    .line 54
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity;->b()V

    return-void
.end method

.method static synthetic e(Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity;)Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity;
    .locals 1

    .line 54
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity;->c:Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity;

    return-object v0
.end method

.method private f()Z
    .locals 3

    .line 409
    const/4 v1, 0x0

    .line 410
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    invoke-virtual {v0}, Lo/afd;->d()Ljava/util/ArrayList;

    move-result-object v2

    .line 411
    const/4 v0, 0x0

    if-eq v0, v2, :cond_0

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-eqz v0, :cond_0

    .line 412
    const/4 v1, 0x1

    .line 414
    :cond_0
    invoke-static {}, Lo/ahd;->n()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 415
    const/4 v1, 0x1

    .line 417
    :cond_1
    return v1
.end method

.method private g()V
    .locals 3

    .line 219
    sget-object v0, Lo/act;->a:Lo/act;

    invoke-virtual {v0}, Lo/act;->e()Ljava/util/List;

    move-result-object v2

    .line 220
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity$d;

    invoke-static {v0, v2}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity$d;->d(Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity$d;Ljava/util/List;)V

    .line 222
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v0

    const/16 v1, 0xa

    if-lt v0, v1, :cond_0

    .line 223
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity;->l:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto :goto_0

    .line 225
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity;->l:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 228
    :goto_0
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity;->f()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, Lo/fdr;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 229
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity;->m:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto :goto_1

    .line 231
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity;->m:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 234
    :goto_1
    return-void
.end method

.method private h()V
    .locals 2

    .line 193
    new-instance v1, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity$1;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity$1;-><init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity;)V

    .line 213
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity;->h:Lo/fip;

    if-eqz v0, :cond_0

    .line 214
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity;->h:Lo/fip;

    invoke-virtual {v0, v1}, Lo/fip;->d(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 216
    :cond_0
    return-void
.end method

.method private i()V
    .locals 3

    .line 424
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity;->c:Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 425
    new-instance v2, Landroid/content/Intent;

    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity;->c:Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity;

    const-class v1, Lcom/huawei/ui/main/stories/health/activity/healthdata/SettingWeightAndBMIActivity;

    invoke-direct {v2, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 426
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity;->c:Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity;

    invoke-virtual {v0, v2}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity;->startActivity(Landroid/content/Intent;)V

    .line 428
    :cond_0
    return-void
.end method

.method private k()V
    .locals 3

    .line 242
    new-instance v2, Landroid/content/IntentFilter;

    const-string v0, "com.huawei.bone.action.FITNESS_USERINFO_UPDATED"

    invoke-direct {v2, v0}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 243
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity;->c:Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity;

    invoke-static {v0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity;->d:Landroid/support/v4/content/LocalBroadcastManager;

    .line 244
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity;->d:Landroid/support/v4/content/LocalBroadcastManager;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity;->o:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1, v2}, Landroid/support/v4/content/LocalBroadcastManager;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V

    .line 245
    return-void
.end method


# virtual methods
.method public c()V
    .locals 5

    .line 260
    :try_start_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity;->d:Landroid/support/v4/content/LocalBroadcastManager;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity;->o:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/support/v4/content/LocalBroadcastManager;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1

    .line 265
    goto :goto_0

    .line 261
    :catch_0
    move-exception v4

    .line 262
    const-string v0, "PluginDevice_WeightUserManagerActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/lang/IllegalArgumentException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 265
    goto :goto_0

    .line 263
    :catch_1
    move-exception v4

    .line 264
    const-string v0, "PluginDevice_WeightUserManagerActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/lang/RuntimeException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 266
    :goto_0
    return-void
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 4

    .line 289
    invoke-super {p0, p1, p2, p3}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataBaseActivity;->onActivityResult(IILandroid/content/Intent;)V

    .line 290
    const-string v0, "PluginDevice_WeightUserManagerActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onActivityResult HuaweiAccountApk.requestCode = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",resultCode = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 291
    sparse-switch p1, :sswitch_data_0

    goto :goto_0

    .line 294
    :sswitch_0
    const-string v0, "PluginDevice_WeightUserManagerActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onActivityResult refresh headImage and name."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 295
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity;->c:Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity;

    invoke-static {v0}, Lo/dnm;->a(Landroid/content/Context;)Lo/dnm;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity;->e:Lcom/huawei/up/callback/CommonCallback;

    invoke-virtual {v0, v1}, Lo/dnm;->d(Lcom/huawei/up/callback/CommonCallback;)V

    .line 296
    goto :goto_1

    .line 298
    :goto_0
    const-string v0, "PluginDevice_WeightUserManagerActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onActivityResult requestCode"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 302
    :goto_1
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
    .end sparse-switch
.end method

.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 279
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity;->l:Landroid/widget/LinearLayout;

    if-ne p1, v0, :cond_0

    .line 280
    const-string v0, ""

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity;->c(Ljava/lang/String;)V

    .line 282
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity;->m:Landroid/widget/LinearLayout;

    if-ne p1, v0, :cond_1

    .line 283
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity;->i()V

    .line 285
    :cond_1
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 78
    invoke-super {p0, p1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataBaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 79
    sget v0, Lcom/huawei/ui/main/R$layout;->activity_weight_user_manager:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity;->setContentView(I)V

    .line 80
    iput-object p0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity;->c:Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity;

    .line 81
    new-instance v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity$b;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity$b;-><init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity;->f:Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity$b;

    .line 82
    new-instance v0, Lo/fip;

    invoke-direct {v0}, Lo/fip;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity;->h:Lo/fip;

    .line 83
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity;->a()V

    .line 84
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity;->d()V

    .line 85
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity;->k()V

    .line 87
    return-void
.end method

.method public onDestroy()V
    .locals 1

    .line 249
    invoke-super {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataBaseActivity;->onDestroy()V

    .line 250
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity;->c()V

    .line 251
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity$d;

    .line 252
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity;->f:Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity$b;

    .line 253
    return-void
.end method

.method public onResume()V
    .locals 0

    .line 187
    invoke-super {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataBaseActivity;->onResume()V

    .line 188
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity;->g()V

    .line 189
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightUserManagerActivity;->h()V

    .line 190
    return-void
.end method
