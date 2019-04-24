.class public Lcom/huawei/pluginachievement/ui/report/WeekAndMonthActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private a:Landroid/widget/TextView;

.field private b:Landroid/widget/RelativeLayout;

.field private c:Landroid/widget/RelativeLayout;

.field private d:Landroid/content/Context;

.field private e:Landroid/widget/TextView;

.field private f:Ljava/util/concurrent/ExecutorService;

.field private g:Landroid/widget/LinearLayout;

.field private h:I

.field private i:Landroid/widget/RelativeLayout;

.field private k:Z

.field private o:Z

.field private p:Lo/emr;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 50
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    .line 57
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/pluginachievement/ui/report/WeekAndMonthActivity;->k:Z

    .line 58
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/pluginachievement/ui/report/WeekAndMonthActivity;->h:I

    .line 60
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/pluginachievement/ui/report/WeekAndMonthActivity;->o:Z

    return-void
.end method

.method private a()V
    .locals 4

    .line 145
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/WeekAndMonthActivity;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    new-instance v1, Lcom/huawei/pluginachievement/ui/report/WeekAndMonthActivity$5;

    invoke-direct {v1, p0}, Lcom/huawei/pluginachievement/ui/report/WeekAndMonthActivity$5;-><init>(Lcom/huawei/pluginachievement/ui/report/WeekAndMonthActivity;)V

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-interface {v0, v2, v3, v1}, Lo/clt;->d(IILo/clz;)V

    .line 163
    return-void
.end method

.method static synthetic b(Lcom/huawei/pluginachievement/ui/report/WeekAndMonthActivity;I)I
    .locals 0

    .line 50
    iput p1, p0, Lcom/huawei/pluginachievement/ui/report/WeekAndMonthActivity;->h:I

    return p1
.end method

.method private b()V
    .locals 3

    .line 78
    sget v0, Lcom/huawei/pluginachievement/R$id;->hw_health_weekly_report_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/pluginachievement/ui/report/WeekAndMonthActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/report/WeekAndMonthActivity;->b:Landroid/widget/RelativeLayout;

    .line 79
    sget v0, Lcom/huawei/pluginachievement/R$id;->hw_health_monthly_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/pluginachievement/ui/report/WeekAndMonthActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/report/WeekAndMonthActivity;->c:Landroid/widget/RelativeLayout;

    .line 80
    sget v0, Lcom/huawei/pluginachievement/R$id;->year_report_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/pluginachievement/ui/report/WeekAndMonthActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/report/WeekAndMonthActivity;->i:Landroid/widget/RelativeLayout;

    .line 81
    sget v0, Lcom/huawei/pluginachievement/R$id;->hw_health_weekly_date_text:I

    invoke-virtual {p0, v0}, Lcom/huawei/pluginachievement/ui/report/WeekAndMonthActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/report/WeekAndMonthActivity;->a:Landroid/widget/TextView;

    .line 82
    sget v0, Lcom/huawei/pluginachievement/R$id;->hw_health_monthly_date_text:I

    invoke-virtual {p0, v0}, Lcom/huawei/pluginachievement/ui/report/WeekAndMonthActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/report/WeekAndMonthActivity;->e:Landroid/widget/TextView;

    .line 84
    sget v0, Lcom/huawei/pluginachievement/R$id;->week_and_month_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/pluginachievement/ui/report/WeekAndMonthActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/report/WeekAndMonthActivity;->g:Landroid/widget/LinearLayout;

    .line 86
    sget v0, Lcom/huawei/pluginachievement/R$id;->title_layout:I

    invoke-static {p0, v0}, Lo/dxi;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emr;

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/report/WeekAndMonthActivity;->p:Lo/emr;

    .line 88
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/WeekAndMonthActivity;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/ene;->t(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 89
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/WeekAndMonthActivity;->g:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOrientation(I)V

    goto :goto_0

    .line 91
    :cond_0
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/WeekAndMonthActivity;->g:Landroid/widget/LinearLayout;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 93
    :goto_0
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {}, Lo/dbf;->b()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 94
    :cond_1
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/WeekAndMonthActivity;->i:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 95
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/WeekAndMonthActivity;->p:Lo/emr;

    invoke-virtual {p0}, Lcom/huawei/pluginachievement/ui/report/WeekAndMonthActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_weekly_monthly_report:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setTitleText(Ljava/lang/String;)V

    goto :goto_1

    .line 97
    :cond_2
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/WeekAndMonthActivity;->i:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 98
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/WeekAndMonthActivity;->p:Lo/emr;

    invoke-virtual {p0}, Lcom/huawei/pluginachievement/ui/report/WeekAndMonthActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_weekly_monthly_year_report:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setTitleText(Ljava/lang/String;)V

    .line 100
    :goto_1
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/WeekAndMonthActivity;->b:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 101
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/WeekAndMonthActivity;->c:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 102
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/WeekAndMonthActivity;->i:Landroid/widget/RelativeLayout;

    new-instance v1, Lcom/huawei/pluginachievement/ui/report/WeekAndMonthActivity$1;

    invoke-direct {v1, p0}, Lcom/huawei/pluginachievement/ui/report/WeekAndMonthActivity$1;-><init>(Lcom/huawei/pluginachievement/ui/report/WeekAndMonthActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 113
    return-void
.end method

.method private b(Ljava/lang/String;)V
    .locals 5

    .line 170
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 171
    const-string v0, "report"

    invoke-interface {v4, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 172
    const-string v0, "from"

    const-string v1, "0"

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 173
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    sget-object v2, Lo/dae;->T:Lo/dae;

    invoke-virtual {v2}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v4, v3}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 174
    return-void
.end method

.method private d()V
    .locals 8

    .line 117
    invoke-direct {p0}, Lcom/huawei/pluginachievement/ui/report/WeekAndMonthActivity;->a()V

    .line 118
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/WeekAndMonthActivity;->a:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-boolean v2, p0, Lcom/huawei/pluginachievement/ui/report/WeekAndMonthActivity;->o:Z

    const/4 v3, 0x1

    const/4 v4, 0x1

    invoke-static {v3, v4, v2}, Lo/dzk;->c(IIZ)J

    move-result-wide v2

    const/4 v4, 0x1

    invoke-static {v2, v3, v4}, Lo/dzr;->a(JI)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "-"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-boolean v2, p0, Lcom/huawei/pluginachievement/ui/report/WeekAndMonthActivity;->o:Z

    .line 119
    const/4 v3, 0x2

    const/4 v4, 0x1

    invoke-static {v3, v4, v2}, Lo/dzk;->c(IIZ)J

    move-result-wide v2

    const/4 v4, 0x1

    invoke-static {v2, v3, v4}, Lo/dzr;->a(JI)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 118
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 120
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/WeekAndMonthActivity;->e:Landroid/widget/TextView;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    const/4 v3, -0x1

    const/4 v4, 0x1

    invoke-static {v3, v1, v2, v4}, Lo/dzk;->c(IJI)J

    move-result-wide v1

    const/4 v3, 0x0

    invoke-static {v1, v2, v3}, Lo/dzr;->a(JI)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 121
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/WeekAndMonthActivity;->d:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dwr;->b(Landroid/content/Context;)Lo/dwr;

    move-result-object v0

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    const/4 v2, 0x1

    invoke-virtual {v0, v2, v1}, Lo/dwr;->a(ILjava/util/Map;)Lo/dvf;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lo/dwj;

    .line 122
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/WeekAndMonthActivity;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/dxb;->a(Landroid/content/Context;)Lo/dxb;

    move-result-object v0

    .line 123
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    const/4 v3, -0x4

    const/4 v4, 0x1

    invoke-static {v3, v1, v2, v4}, Lo/dzk;->c(IJI)J

    move-result-wide v1

    .line 124
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    .line 122
    const/16 v5, 0xb

    const/4 v6, 0x0

    invoke-virtual/range {v0 .. v6}, Lo/dxb;->b(JJILo/duh;)V

    .line 125
    if-eqz v7, :cond_0

    invoke-virtual {v7}, Lo/dwj;->c()I

    move-result v0

    const/4 v1, 0x1

    if-ge v0, v1, :cond_1

    .line 126
    :cond_0
    const-string v0, "WeekAndMonthActivity"

    const-string v1, "Report have no data"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 127
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/WeekAndMonthActivity;->a:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/report/WeekAndMonthActivity;->d:Landroid/content/Context;

    sget v2, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_no_weekly_report:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 128
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/WeekAndMonthActivity;->e:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/report/WeekAndMonthActivity;->d:Landroid/content/Context;

    sget v2, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_no_monthly_report:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 129
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/pluginachievement/ui/report/WeekAndMonthActivity;->k:Z

    .line 131
    :cond_1
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/WeekAndMonthActivity;->f:Ljava/util/concurrent/ExecutorService;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_2

    .line 132
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/report/WeekAndMonthActivity;->f:Ljava/util/concurrent/ExecutorService;

    .line 134
    :cond_2
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/WeekAndMonthActivity;->f:Ljava/util/concurrent/ExecutorService;

    if-eqz v0, :cond_3

    .line 135
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/WeekAndMonthActivity;->f:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/huawei/pluginachievement/ui/report/WeekAndMonthActivity$3;

    invoke-direct {v1, p0}, Lcom/huawei/pluginachievement/ui/report/WeekAndMonthActivity$3;-><init>(Lcom/huawei/pluginachievement/ui/report/WeekAndMonthActivity;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 142
    :cond_3
    return-void
.end method

.method static synthetic d(Lcom/huawei/pluginachievement/ui/report/WeekAndMonthActivity;Ljava/lang/String;)V
    .locals 0

    .line 50
    invoke-direct {p0, p1}, Lcom/huawei/pluginachievement/ui/report/WeekAndMonthActivity;->b(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic e(Lcom/huawei/pluginachievement/ui/report/WeekAndMonthActivity;)Landroid/content/Context;
    .locals 1

    .line 50
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/WeekAndMonthActivity;->d:Landroid/content/Context;

    return-object v0
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 178
    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    .line 179
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/WeekAndMonthActivity;->d:Landroid/content/Context;

    const-string v1, "com.huawei.pluginachievement.ui.report.ReportActivity"

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->setClassName(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    .line 180
    const/high16 v0, 0x10800000

    invoke-virtual {v2, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 181
    iget v0, p0, Lcom/huawei/pluginachievement/ui/report/WeekAndMonthActivity;->h:I

    if-eqz v0, :cond_0

    .line 182
    const-string v0, "step_target"

    iget v1, p0, Lcom/huawei/pluginachievement/ui/report/WeekAndMonthActivity;->h:I

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 184
    :cond_0
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/WeekAndMonthActivity;->b:Landroid/widget/RelativeLayout;

    if-ne p1, v0, :cond_1

    .line 185
    const-string v0, "report_stype"

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 186
    const-string v0, "0"

    invoke-direct {p0, v0}, Lcom/huawei/pluginachievement/ui/report/WeekAndMonthActivity;->b(Ljava/lang/String;)V

    .line 188
    :cond_1
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/WeekAndMonthActivity;->c:Landroid/widget/RelativeLayout;

    if-ne p1, v0, :cond_2

    .line 189
    const-string v0, "report_stype"

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 190
    const-string v0, "1"

    invoke-direct {p0, v0}, Lcom/huawei/pluginachievement/ui/report/WeekAndMonthActivity;->b(Ljava/lang/String;)V

    .line 192
    :cond_2
    iget-boolean v0, p0, Lcom/huawei/pluginachievement/ui/report/WeekAndMonthActivity;->k:Z

    if-eqz v0, :cond_3

    .line 193
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/WeekAndMonthActivity;->d:Landroid/content/Context;

    invoke-virtual {v0, v2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 195
    :cond_3
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 65
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 66
    sget v0, Lcom/huawei/pluginachievement/R$layout;->hw_health_week_and_month_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/pluginachievement/ui/report/WeekAndMonthActivity;->setContentView(I)V

    .line 67
    iput-object p0, p0, Lcom/huawei/pluginachievement/ui/report/WeekAndMonthActivity;->d:Landroid/content/Context;

    .line 68
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 69
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/pluginachievement/ui/report/WeekAndMonthActivity;->o:Z

    goto :goto_0

    .line 71
    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/pluginachievement/ui/report/WeekAndMonthActivity;->o:Z

    .line 73
    :goto_0
    invoke-direct {p0}, Lcom/huawei/pluginachievement/ui/report/WeekAndMonthActivity;->b()V

    .line 74
    invoke-direct {p0}, Lcom/huawei/pluginachievement/ui/report/WeekAndMonthActivity;->d()V

    .line 75
    return-void
.end method
