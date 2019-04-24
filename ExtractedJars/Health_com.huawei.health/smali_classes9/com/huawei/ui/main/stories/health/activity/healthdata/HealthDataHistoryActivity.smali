.class public Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;
.super Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataBaseActivity;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private a:Lo/fcs;

.field private b:Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;

.field private c:Landroid/widget/LinearLayout;

.field d:Landroid/os/Handler;

.field private e:Landroid/widget/ExpandableListView;

.field private f:Lo/fdh;

.field private g:Lo/acu;

.field private h:Landroid/widget/RelativeLayout;

.field private i:Lo/fdj;

.field private k:Lo/fdj;

.field private l:Landroid/view/View;

.field private m:Lo/ems;

.field private n:Landroid/widget/ImageView;

.field private o:Landroid/widget/LinearLayout;

.field private p:Landroid/widget/LinearLayout;

.field private q:Z

.field private r:Landroid/widget/TextView;

.field private s:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/acn;>;"
        }
    .end annotation
.end field

.field private t:Lo/emr;

.field private u:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 45
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataBaseActivity;-><init>()V

    .line 64
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->q:Z

    .line 68
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->u:Z

    .line 84
    new-instance v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity$5;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity$5;-><init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->d:Landroid/os/Handler;

    return-void
.end method

.method private a()V
    .locals 2

    .line 171
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->t:Lo/emr;

    new-instance v1, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity$1;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity$1;-><init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;)V

    invoke-virtual {v0, v1}, Lo/emr;->setLeftButtonOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 184
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->e:Landroid/widget/ExpandableListView;

    new-instance v1, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity$3;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity$3;-><init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/ExpandableListView;->setOnItemLongClickListener(Landroid/widget/AdapterView$OnItemLongClickListener;)V

    .line 198
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->e:Landroid/widget/ExpandableListView;

    new-instance v1, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity$4;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity$4;-><init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/ExpandableListView;->setOnChildClickListener(Landroid/widget/ExpandableListView$OnChildClickListener;)V

    .line 207
    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;)V
    .locals 0

    .line 45
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->h()V

    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;ZI)V
    .locals 0

    .line 45
    invoke-direct {p0, p1, p2}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->a(ZI)V

    return-void
.end method

.method private a(Z)V
    .locals 4

    .line 393
    const-string v0, "HealthDataHistoryActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "refreshTop isSelect "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 394
    if-nez p1, :cond_0

    .line 395
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->f(Z)V

    .line 397
    :cond_0
    return-void
.end method

.method private a(ZI)V
    .locals 6

    .line 307
    const-string v0, "HealthDataHistoryActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showDeleteDialog "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "enter"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 309
    new-instance v5, Lo/egy$b;

    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;

    invoke-direct {v5, v0}, Lo/egy$b;-><init>(Landroid/content/Context;)V

    .line 310
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hw_health_show_healthdata_delete:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lo/egy$b;->a(Ljava/lang/String;)Lo/egy$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_common_ui_dialog_confirm:I

    .line 311
    invoke-virtual {p0, v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity$9;

    invoke-direct {v2, p0, p1, p2}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity$9;-><init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;ZI)V

    invoke-virtual {v0, v1, v2}, Lo/egy$b;->c(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egy$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_cancel:I

    .line 324
    invoke-virtual {p0, v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity$2;

    invoke-direct {v2, p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity$2;-><init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;)V

    invoke-virtual {v0, v1, v2}, Lo/egy$b;->a(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egy$b;

    .line 330
    invoke-virtual {v5}, Lo/egy$b;->a()Lo/egy;

    move-result-object v4

    .line 331
    invoke-virtual {v4}, Lo/egy;->show()V

    .line 333
    return-void
.end method

.method private b()V
    .locals 3

    .line 240
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;

    sget v1, Lcom/huawei/ui/main/R$id;->health_healthdata_history_title_layout:I

    invoke-static {v0, v1}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emr;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->t:Lo/emr;

    .line 241
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_health_data_history_listview:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ExpandableListView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->e:Landroid/widget/ExpandableListView;

    .line 243
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_health_data_history_empty_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->c:Landroid/widget/LinearLayout;

    .line 244
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_health_data_history_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->h:Landroid/widget/RelativeLayout;

    .line 246
    sget v0, Lcom/huawei/ui/main/R$id;->buttomview:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/ems;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->m:Lo/ems;

    .line 247
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;

    sget v1, Lcom/huawei/ui/main/R$layout;->health_data_weight_history_bottomview:I

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->l:Landroid/view/View;

    .line 248
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->m:Lo/ems;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->l:Landroid/view/View;

    invoke-virtual {v0, v1}, Lo/ems;->e(Landroid/view/View;)V

    .line 249
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->m:Lo/ems;

    invoke-virtual {v0, p0}, Lo/ems;->a(Landroid/app/Activity;)V

    .line 250
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->l:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->hw_show_health_data_weight_delete:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->p:Landroid/widget/LinearLayout;

    .line 251
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->l:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->hw_show_health_data_weight_select:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->o:Landroid/widget/LinearLayout;

    .line 252
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->l:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->hw_show_health_data_weight_select_text:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->r:Landroid/widget/TextView;

    .line 253
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->l:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->hw_show_health_data_weight_select_imageview:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->n:Landroid/widget/ImageView;

    .line 254
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->p:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 255
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->o:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 257
    new-instance v0, Lo/fcs;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->d:Landroid/os/Handler;

    invoke-direct {v0, v1, v2}, Lo/fcs;-><init>(Landroid/content/Context;Landroid/os/Handler;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->a:Lo/fcs;

    .line 258
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->e:Landroid/widget/ExpandableListView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->a:Lo/fcs;

    invoke-virtual {v0, v1}, Landroid/widget/ExpandableListView;->setAdapter(Landroid/widget/ExpandableListAdapter;)V

    .line 259
    return-void
.end method

.method static synthetic b(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;)V
    .locals 0

    .line 45
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->c()V

    return-void
.end method

.method static synthetic b(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;I)V
    .locals 0

    .line 45
    invoke-direct {p0, p1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->c(I)V

    return-void
.end method

.method static synthetic b(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;Z)V
    .locals 0

    .line 45
    invoke-direct {p0, p1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->d(Z)V

    return-void
.end method

.method private b(Z)V
    .locals 6

    .line 229
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->a:Lo/fcs;

    invoke-virtual {v0}, Lo/fcs;->getGroupCount()I

    move-result v2

    .line 230
    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    .line 231
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->a:Lo/fcs;

    invoke-virtual {v0, v3}, Lo/fcs;->getChildrenCount(I)I

    move-result v4

    .line 232
    const/4 v5, 0x0

    :goto_1
    if-ge v5, v4, :cond_0

    .line 233
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->a:Lo/fcs;

    invoke-virtual {v0}, Lo/fcs;->e()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-interface {v0, v5, v1}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 232
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    .line 230
    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 236
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->a:Lo/fcs;

    invoke-virtual {v0}, Lo/fcs;->notifyDataSetChanged()V

    .line 237
    return-void
.end method

.method private c()V
    .locals 13

    .line 111
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->s:Ljava/util/List;

    .line 112
    sget-object v0, Lo/acs;->c:Lo/acs;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->g:Lo/acu;

    invoke-virtual {v1}, Lo/acu;->a()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lo/acs;->e(Ljava/lang/String;Z)Ljava/util/List;

    move-result-object v4

    .line 113
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 114
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->h:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 115
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->c:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto :goto_0

    .line 117
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->h:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 118
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->c:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 119
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->finish()V

    .line 121
    :goto_0
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 122
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 123
    invoke-direct {p0, v4, v5, v6}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->e(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    .line 124
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 125
    const/4 v8, 0x0

    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v9

    :goto_1
    if-ge v8, v9, :cond_1

    .line 126
    const/4 v0, 0x2

    new-array v10, v0, [Ljava/lang/String;

    .line 127
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->i:Lo/fdj;

    invoke-virtual {v5, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/acn;

    invoke-virtual {v1}, Lo/acn;->p()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lo/fdj;->d(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v10, v1

    .line 128
    invoke-interface {v6, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Double;

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    invoke-virtual {v5, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    int-to-double v2, v2

    div-double v11, v0, v2

    .line 129
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v11, v12}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v10, v1

    .line 130
    invoke-virtual {v7, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 125
    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    .line 133
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->a:Lo/fcs;

    invoke-virtual {v0, v7, v5}, Lo/fcs;->b(Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    .line 135
    const/4 v8, 0x0

    :goto_2
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v8, v0, :cond_2

    .line 136
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->e:Landroid/widget/ExpandableListView;

    invoke-virtual {v0, v8}, Landroid/widget/ExpandableListView;->expandGroup(I)Z

    .line 135
    add-int/lit8 v8, v8, 0x1

    goto :goto_2

    .line 139
    :cond_2
    return-void
.end method

.method private c(I)V
    .locals 12

    .line 446
    const-string v0, "HealthDataHistoryActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "deleteData "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "enter"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 448
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->e:Landroid/widget/ExpandableListView;

    invoke-virtual {v0, p1}, Landroid/widget/ExpandableListView;->getExpandableListPosition(I)J

    move-result-wide v4

    .line 450
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->e:Landroid/widget/ExpandableListView;

    invoke-static {v4, v5}, Landroid/widget/ExpandableListView;->getPackedPositionGroup(J)I

    move-result v6

    .line 451
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->e:Landroid/widget/ExpandableListView;

    invoke-static {v4, v5}, Landroid/widget/ExpandableListView;->getPackedPositionChild(J)I

    move-result v7

    .line 452
    const/4 v0, -0x1

    if-eq v6, v0, :cond_0

    const/4 v0, -0x1

    if-ne v7, v0, :cond_1

    .line 453
    :cond_0
    const-string v0, "HealthDataHistoryActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "deleteData error, groupPosition="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", childPosition="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 454
    return-void

    .line 457
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->a:Lo/fcs;

    invoke-virtual {v0, v6, v7}, Lo/fcs;->d(II)Lo/acn;

    move-result-object v8

    .line 459
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 460
    new-instance v10, Lcom/huawei/hihealth/HiTimeInterval;

    invoke-direct {v10}, Lcom/huawei/hihealth/HiTimeInterval;-><init>()V

    .line 461
    invoke-virtual {v8}, Lo/acn;->p()J

    move-result-wide v0

    invoke-virtual {v10, v0, v1}, Lcom/huawei/hihealth/HiTimeInterval;->setStartTime(J)V

    .line 462
    invoke-virtual {v8}, Lo/acn;->o()J

    move-result-wide v0

    invoke-virtual {v10, v0, v1}, Lcom/huawei/hihealth/HiTimeInterval;->setEndTime(J)V

    .line 463
    invoke-interface {v9, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 465
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->f:Lo/fdh;

    invoke-virtual {v0, v9}, Lo/fdh;->c(Ljava/util/List;)V

    .line 467
    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 468
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->a:Lo/fcs;

    invoke-virtual {v0, v6, v7}, Lo/fcs;->d(II)Lo/acn;

    move-result-object v0

    invoke-interface {v11, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 469
    iput-object v11, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->s:Ljava/util/List;

    .line 471
    const-string v0, "HealthDataHistoryActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "deleteData "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "end"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 472
    return-void
.end method

.method static synthetic c(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;Z)V
    .locals 0

    .line 45
    invoke-direct {p0, p1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->e(Z)V

    return-void
.end method

.method private c(Z)V
    .locals 3

    .line 213
    iput-boolean p1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->q:Z

    .line 214
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->r:Landroid/widget/TextView;

    if-eqz p1, :cond_0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_main_health_page_healthdata_bloodpresure_cancel_select:I

    goto :goto_0

    :cond_0
    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_main_health_page_healthdata_bloodpresure_select:I

    :goto_0
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 217
    if-eqz p1, :cond_1

    .line 218
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->b(Z)V

    .line 219
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->f(Z)V

    .line 220
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->n:Landroid/widget/ImageView;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$drawable;->ic_public_deselect_all:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    goto :goto_1

    .line 222
    :cond_1
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->b(Z)V

    .line 223
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->f(Z)V

    .line 224
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->n:Landroid/widget/ImageView;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$drawable;->ic_public_select_all:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 226
    :goto_1
    return-void
.end method

.method static synthetic c(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;)Z
    .locals 1

    .line 45
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->u:Z

    return v0
.end method

.method static synthetic d(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;)Lo/acu;
    .locals 1

    .line 45
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->g:Lo/acu;

    return-object v0
.end method

.method private d()V
    .locals 8

    .line 341
    const-string v0, "HealthDataHistoryActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "cancelSelect mAdapter.isMultiCheck()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 342
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->a:Lo/fcs;

    invoke-virtual {v0}, Lo/fcs;->a()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 343
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->f(Z)V

    .line 344
    const-string v0, "HealthDataHistoryActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "cancelSelect isMultiCheck"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 345
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->a:Lo/fcs;

    invoke-virtual {v0}, Lo/fcs;->getGroupCount()I

    move-result v4

    .line 346
    const/4 v5, 0x0

    :goto_0
    if-ge v5, v4, :cond_1

    .line 347
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->a:Lo/fcs;

    invoke-virtual {v0, v5}, Lo/fcs;->getChildrenCount(I)I

    move-result v6

    .line 348
    const/4 v7, 0x0

    :goto_1
    if-ge v7, v6, :cond_0

    .line 349
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->a:Lo/fcs;

    invoke-virtual {v0}, Lo/fcs;->e()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-interface {v0, v7, v1}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 348
    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    .line 346
    :cond_0
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 352
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->a:Lo/fcs;

    invoke-virtual {v0}, Lo/fcs;->notifyDataSetChanged()V

    .line 353
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->a(Z)V

    .line 354
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->d(Z)V

    .line 355
    goto :goto_2

    .line 356
    :cond_2
    const-string v0, "HealthDataHistoryActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "cancelSelect finish"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 357
    invoke-super {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataBaseActivity;->onBackPressed()V

    .line 359
    :goto_2
    return-void
.end method

.method static synthetic d(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;Z)V
    .locals 0

    .line 45
    invoke-direct {p0, p1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->a(Z)V

    return-void
.end method

.method private d(Z)V
    .locals 4

    .line 405
    const-string v0, "HealthDataHistoryActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "refreshBottom isSelect "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 406
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->a:Lo/fcs;

    invoke-virtual {v0, p1}, Lo/fcs;->e(Z)V

    .line 407
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->q:Z

    .line 408
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->n:Landroid/widget/ImageView;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$drawable;->ic_public_select_all:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 409
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->r:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_main_health_page_healthdata_bloodpresure_select:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 410
    if-nez p1, :cond_0

    .line 412
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->t:Lo/emr;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_base_health_data_history_record:I

    invoke-virtual {p0, v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setTitleText(Ljava/lang/String;)V

    .line 413
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->t:Lo/emr;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$drawable;->health_navbar_back_selector:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setLeftButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 414
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->u:Z

    .line 415
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->o:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 416
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->a:Lo/fcs;

    invoke-virtual {v0}, Lo/fcs;->notifyDataSetChanged()V

    goto :goto_0

    .line 418
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->o:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 419
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->a:Lo/fcs;

    invoke-virtual {v0}, Lo/fcs;->notifyDataSetChanged()V

    .line 421
    :goto_0
    return-void
.end method

.method static synthetic e(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;)Ljava/util/List;
    .locals 1

    .line 45
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->s:Ljava/util/List;

    return-object v0
.end method

.method private e(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/acn;>;Ljava/util/List<Ljava/util/List<Lo/acn;>;>;Ljava/util/List<Ljava/lang/Double;>;)V"
        }
    .end annotation

    .line 148
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 150
    const/4 v5, 0x0

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v6

    :goto_0
    if-ge v5, v6, :cond_2

    .line 151
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lo/acn;

    .line 152
    const/4 v0, 0x0

    if-eq v0, v7, :cond_1

    .line 153
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->i:Lo/fdj;

    invoke-virtual {v7}, Lo/acn;->p()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lo/fdj;->d(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 154
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->i:Lo/fdj;

    invoke-virtual {v7}, Lo/acn;->p()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lo/fdj;->d(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    move-result v8

    .line 155
    invoke-interface {p2, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-interface {v0, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 156
    invoke-interface {p3, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Ljava/lang/Double;

    .line 157
    invoke-virtual {v9}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    invoke-virtual {v7}, Lo/acn;->d()D

    move-result-wide v2

    add-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-interface {p3, v8, v0}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 158
    goto :goto_1

    .line 159
    :cond_0
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 160
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v8, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 161
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->i:Lo/fdj;

    invoke-virtual {v7}, Lo/acn;->p()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lo/fdj;->d(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 162
    invoke-interface {p2, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 163
    invoke-virtual {v7}, Lo/acn;->d()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-interface {p3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 150
    :cond_1
    :goto_1
    add-int/lit8 v5, v5, 0x1

    goto/16 :goto_0

    .line 168
    :cond_2
    return-void
.end method

.method private e(Z)V
    .locals 3

    .line 278
    if-eqz p1, :cond_1

    .line 279
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->q:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->a:Lo/fcs;

    invoke-virtual {v0}, Lo/fcs;->c()I

    move-result v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->a:Lo/fcs;

    invoke-virtual {v1}, Lo/fcs;->d()I

    move-result v1

    if-ne v0, v1, :cond_0

    .line 280
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->q:Z

    .line 281
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->n:Landroid/widget/ImageView;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$drawable;->ic_public_deselect_all:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 282
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->r:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_main_health_page_healthdata_bloodpresure_cancel_select:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 284
    :cond_0
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->f(Z)V

    goto :goto_0

    .line 287
    :cond_1
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->q:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->a:Lo/fcs;

    invoke-virtual {v0}, Lo/fcs;->c()I

    move-result v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->a:Lo/fcs;

    invoke-virtual {v1}, Lo/fcs;->d()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    if-ne v0, v1, :cond_2

    .line 288
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->q:Z

    .line 289
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->n:Landroid/widget/ImageView;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$drawable;->ic_public_select_all:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 290
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->r:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_main_health_page_healthdata_bloodpresure_select:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 292
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->a:Lo/fcs;

    invoke-virtual {v0}, Lo/fcs;->c()I

    move-result v0

    if-nez v0, :cond_3

    .line 293
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->f(Z)V

    goto :goto_0

    .line 295
    :cond_3
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->f(Z)V

    .line 298
    :goto_0
    return-void
.end method

.method static synthetic f(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;)Lo/fcs;
    .locals 1

    .line 45
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->a:Lo/fcs;

    return-object v0
.end method

.method private f()V
    .locals 11

    .line 365
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 366
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 367
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->a:Lo/fcs;

    invoke-virtual {v0}, Lo/fcs;->getGroupCount()I

    move-result v6

    .line 368
    add-int/lit8 v7, v6, -0x1

    :goto_0
    if-ltz v7, :cond_2

    .line 369
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->a:Lo/fcs;

    invoke-virtual {v0, v7}, Lo/fcs;->getChildrenCount(I)I

    move-result v8

    .line 370
    add-int/lit8 v9, v8, -0x1

    :goto_1
    if-ltz v9, :cond_1

    .line 371
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->a:Lo/fcs;

    invoke-virtual {v0}, Lo/fcs;->e()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-interface {v0, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 372
    new-instance v10, Lcom/huawei/hihealth/HiTimeInterval;

    invoke-direct {v10}, Lcom/huawei/hihealth/HiTimeInterval;-><init>()V

    .line 373
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->a:Lo/fcs;

    invoke-virtual {v0, v7, v9}, Lo/fcs;->d(II)Lo/acn;

    move-result-object v0

    invoke-virtual {v0}, Lo/acn;->p()J

    move-result-wide v0

    invoke-virtual {v10, v0, v1}, Lcom/huawei/hihealth/HiTimeInterval;->setStartTime(J)V

    .line 374
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->a:Lo/fcs;

    invoke-virtual {v0, v7, v9}, Lo/fcs;->d(II)Lo/acn;

    move-result-object v0

    invoke-virtual {v0}, Lo/acn;->o()J

    move-result-wide v0

    invoke-virtual {v10, v0, v1}, Lcom/huawei/hihealth/HiTimeInterval;->setEndTime(J)V

    .line 375
    invoke-virtual {v4, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 376
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->a:Lo/fcs;

    invoke-virtual {v0, v7, v9}, Lo/fcs;->d(II)Lo/acn;

    move-result-object v0

    invoke-interface {v5, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 370
    :cond_0
    add-int/lit8 v9, v9, -0x1

    goto :goto_1

    .line 368
    :cond_1
    add-int/lit8 v7, v7, -0x1

    goto/16 :goto_0

    .line 380
    :cond_2
    iput-object v5, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->s:Ljava/util/List;

    .line 381
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->f:Lo/fdh;

    invoke-virtual {v0, v4}, Lo/fdh;->c(Ljava/util/List;)V

    .line 384
    const-string v0, "HealthDataHistoryActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "deleteDatas "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "end"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 385
    return-void
.end method

.method private f(Z)V
    .locals 6

    .line 429
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->u:Z

    .line 430
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->t:Lo/emr;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$drawable;->health_navbar_cancel_selector:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setLeftButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 431
    if-eqz p1, :cond_0

    .line 433
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->t:Lo/emr;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$plurals;->IDS_hw_weight_delete_check_measure_data:I

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    iget-object v4, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->a:Lo/fcs;

    invoke-virtual {v4}, Lo/fcs;->c()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    invoke-virtual {v1, v2, v4, v3}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setTitleText(Ljava/lang/String;)V

    goto :goto_0

    .line 437
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->t:Lo/emr;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_main_health_page_healthdata_selectNone:I

    invoke-virtual {p0, v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setTitleText(Ljava/lang/String;)V

    .line 439
    :goto_0
    return-void
.end method

.method static synthetic g(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;)Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;
    .locals 1

    .line 45
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;

    return-object v0
.end method

.method private h()V
    .locals 5

    .line 475
    const-string v0, "HealthDataHistoryActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "syncData  "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 476
    new-instance v4, Lcom/huawei/hihealth/HiSyncOption;

    invoke-direct {v4}, Lcom/huawei/hihealth/HiSyncOption;-><init>()V

    .line 477
    const/4 v0, 0x2

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiSyncOption;->setSyncModel(I)V

    .line 478
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiSyncOption;->setSyncAction(I)V

    .line 479
    const/4 v0, 0x6

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiSyncOption;->setSyncDataType(I)V

    .line 480
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiSyncOption;->setSyncScope(I)V

    .line 481
    const/4 v0, 0x2

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiSyncOption;->setSyncMethod(I)V

    .line 482
    invoke-static {p0}, Lo/clq;->e(Landroid/content/Context;)Lo/clq;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v4, v1}, Lo/clq;->c(Lcom/huawei/hihealth/HiSyncOption;Lo/clz;)V

    .line 483
    return-void
.end method

.method static synthetic h(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;)V
    .locals 0

    .line 45
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->f()V

    return-void
.end method

.method static synthetic i(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;)V
    .locals 0

    .line 45
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->d()V

    return-void
.end method

.method static synthetic k(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;)Landroid/widget/ExpandableListView;
    .locals 1

    .line 45
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->e:Landroid/widget/ExpandableListView;

    return-object v0
.end method


# virtual methods
.method public onBackPressed()V
    .locals 0

    .line 337
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->d()V

    .line 338
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 263
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->p:Landroid/widget/LinearLayout;

    if-ne p1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->o:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    .line 264
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->a:Lo/fcs;

    invoke-virtual {v0}, Lo/fcs;->c()I

    move-result v0

    if-eqz v0, :cond_3

    .line 265
    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->a(ZI)V

    goto :goto_1

    .line 267
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->p:Landroid/widget/LinearLayout;

    if-ne p1, v0, :cond_1

    .line 268
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->a:Lo/fcs;

    invoke-virtual {v0}, Lo/fcs;->d()I

    move-result v0

    if-eqz v0, :cond_3

    .line 269
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->d(Z)V

    .line 270
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->f(Z)V

    goto :goto_1

    .line 272
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->o:Landroid/widget/LinearLayout;

    if-ne p1, v0, :cond_3

    .line 273
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->q:Z

    if-nez v0, :cond_2

    const/4 v0, 0x1

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->c(Z)V

    .line 275
    :cond_3
    :goto_1
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 2

    .line 73
    invoke-super {p0, p1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataBaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 74
    sget v0, Lcom/huawei/ui/main/R$layout;->activity_health_data_history:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->setContentView(I)V

    .line 75
    iput-object p0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;

    .line 76
    invoke-static {}, Lo/fdj;->e()Lo/fdj;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->k:Lo/fdj;

    .line 77
    new-instance v0, Lo/fdh;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->d:Landroid/os/Handler;

    invoke-direct {v0, p0, v1}, Lo/fdh;-><init>(Landroid/app/Activity;Landroid/os/Handler;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->f:Lo/fdh;

    .line 78
    sget-object v0, Lo/act;->a:Lo/act;

    invoke-virtual {v0}, Lo/act;->b()Lo/acu;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->g:Lo/acu;

    .line 79
    invoke-static {}, Lo/fdj;->e()Lo/fdj;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->i:Lo/fdj;

    .line 80
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->b()V

    .line 81
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->a()V

    .line 82
    return-void
.end method

.method public onResume()V
    .locals 2

    .line 104
    invoke-super {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataBaseActivity;->onResume()V

    .line 105
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->o:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getVisibility()I

    move-result v0

    const/16 v1, 0x8

    if-ne v0, v1, :cond_0

    .line 106
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataHistoryActivity;->c()V

    .line 108
    :cond_0
    return-void
.end method
