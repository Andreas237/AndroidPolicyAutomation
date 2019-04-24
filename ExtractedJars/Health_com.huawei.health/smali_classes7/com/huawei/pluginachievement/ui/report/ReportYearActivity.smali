.class public Lcom/huawei/pluginachievement/ui/report/ReportYearActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"


# static fields
.field private static f:Ljava/util/concurrent/ExecutorService;


# instance fields
.field private a:Landroid/content/Context;

.field private b:Landroid/widget/TextView;

.field private c:Landroid/widget/TextView;

.field private d:Landroid/widget/LinearLayout;

.field private e:Landroid/widget/LinearLayout;

.field private g:Landroid/os/Handler;

.field private i:Lo/dwr;

.field private k:Ljava/lang/Runnable;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 29
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    .line 107
    new-instance v0, Lcom/huawei/pluginachievement/ui/report/ReportYearActivity$4;

    invoke-direct {v0, p0}, Lcom/huawei/pluginachievement/ui/report/ReportYearActivity$4;-><init>(Lcom/huawei/pluginachievement/ui/report/ReportYearActivity;)V

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/report/ReportYearActivity;->g:Landroid/os/Handler;

    .line 130
    new-instance v0, Lcom/huawei/pluginachievement/ui/report/ReportYearActivity$3;

    invoke-direct {v0, p0}, Lcom/huawei/pluginachievement/ui/report/ReportYearActivity$3;-><init>(Lcom/huawei/pluginachievement/ui/report/ReportYearActivity;)V

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/report/ReportYearActivity;->k:Ljava/lang/Runnable;

    return-void
.end method

.method static synthetic a(Lcom/huawei/pluginachievement/ui/report/ReportYearActivity;)Lo/dwr;
    .locals 1

    .line 29
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/ReportYearActivity;->i:Lo/dwr;

    return-object v0
.end method

.method private a()V
    .locals 5

    .line 60
    sget v0, Lcom/huawei/pluginachievement/R$id;->hw_health_year_date_text_seventeen_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/pluginachievement/ui/report/ReportYearActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/report/ReportYearActivity;->e:Landroid/widget/LinearLayout;

    .line 61
    sget v0, Lcom/huawei/pluginachievement/R$id;->hw_health_year_date_text_eighteen_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/pluginachievement/ui/report/ReportYearActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/report/ReportYearActivity;->d:Landroid/widget/LinearLayout;

    .line 62
    sget v0, Lcom/huawei/pluginachievement/R$id;->hw_health_year_date_text_eighteen:I

    invoke-virtual {p0, v0}, Lcom/huawei/pluginachievement/ui/report/ReportYearActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/report/ReportYearActivity;->c:Landroid/widget/TextView;

    .line 63
    sget v0, Lcom/huawei/pluginachievement/R$id;->hw_health_year_date_text_seventeen:I

    invoke-virtual {p0, v0}, Lcom/huawei/pluginachievement/ui/report/ReportYearActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/report/ReportYearActivity;->b:Landroid/widget/TextView;

    .line 65
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/ReportYearActivity;->a:Landroid/content/Context;

    sget v1, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_report_annual_year:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 66
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/ReportYearActivity;->c:Landroid/widget/TextView;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/16 v2, 0x7e2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 67
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/ReportYearActivity;->b:Landroid/widget/TextView;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/16 v2, 0x7e1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 69
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/ReportYearActivity;->e:Landroid/widget/LinearLayout;

    new-instance v1, Lcom/huawei/pluginachievement/ui/report/ReportYearActivity$1;

    invoke-direct {v1, p0}, Lcom/huawei/pluginachievement/ui/report/ReportYearActivity$1;-><init>(Lcom/huawei/pluginachievement/ui/report/ReportYearActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 77
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/ReportYearActivity;->d:Landroid/widget/LinearLayout;

    new-instance v1, Lcom/huawei/pluginachievement/ui/report/ReportYearActivity$2;

    invoke-direct {v1, p0}, Lcom/huawei/pluginachievement/ui/report/ReportYearActivity$2;-><init>(Lcom/huawei/pluginachievement/ui/report/ReportYearActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 84
    return-void
.end method

.method private b()V
    .locals 2

    .line 100
    invoke-virtual {p0}, Lcom/huawei/pluginachievement/ui/report/ReportYearActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dwr;->b(Landroid/content/Context;)Lo/dwr;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/report/ReportYearActivity;->i:Lo/dwr;

    .line 101
    const-string v0, "PLGACHIEVE_ReportYearActivity"

    const-string v1, "getData()"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 102
    sget-object v0, Lcom/huawei/pluginachievement/ui/report/ReportYearActivity;->f:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->isShutdown()Z

    move-result v0

    if-nez v0, :cond_0

    .line 103
    sget-object v0, Lcom/huawei/pluginachievement/ui/report/ReportYearActivity;->f:Ljava/util/concurrent/ExecutorService;

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/report/ReportYearActivity;->k:Ljava/lang/Runnable;

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 105
    :cond_0
    return-void
.end method

.method private b(Ljava/lang/String;)V
    .locals 3

    .line 87
    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    .line 88
    const-string v0, "com.huawei.health"

    const-string v1, "com.huawei.operation.activity.WebViewActivity"

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 89
    const-string v0, "url"

    invoke-virtual {v2, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 90
    const-string v0, "EXTRA_BI_ID"

    const-string v1, ""

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 91
    const-string v0, "EXTRA_BI_NAME"

    const-string v1, ""

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 92
    const-string v0, "EXTRA_BI_SOURCE"

    const-string v1, "Annual"

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 93
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/ReportYearActivity;->a:Landroid/content/Context;

    invoke-virtual {v0, v2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 94
    return-void
.end method

.method static synthetic c(Lcom/huawei/pluginachievement/ui/report/ReportYearActivity;)Landroid/widget/LinearLayout;
    .locals 1

    .line 29
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/ReportYearActivity;->e:Landroid/widget/LinearLayout;

    return-object v0
.end method

.method static synthetic c(Lcom/huawei/pluginachievement/ui/report/ReportYearActivity;Ljava/lang/String;)V
    .locals 0

    .line 29
    invoke-direct {p0, p1}, Lcom/huawei/pluginachievement/ui/report/ReportYearActivity;->b(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic d(Lcom/huawei/pluginachievement/ui/report/ReportYearActivity;)Landroid/os/Handler;
    .locals 1

    .line 29
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/ReportYearActivity;->g:Landroid/os/Handler;

    return-object v0
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 2

    .line 50
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 51
    const-string v0, "PLGACHIEVE_ReportYearActivity"

    const-string v1, "onCreate"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 52
    sget v0, Lcom/huawei/pluginachievement/R$layout;->layout_report_main_year:I

    invoke-virtual {p0, v0}, Lcom/huawei/pluginachievement/ui/report/ReportYearActivity;->setContentView(I)V

    .line 53
    iput-object p0, p0, Lcom/huawei/pluginachievement/ui/report/ReportYearActivity;->a:Landroid/content/Context;

    .line 54
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    sput-object v0, Lcom/huawei/pluginachievement/ui/report/ReportYearActivity;->f:Ljava/util/concurrent/ExecutorService;

    .line 55
    invoke-direct {p0}, Lcom/huawei/pluginachievement/ui/report/ReportYearActivity;->a()V

    .line 56
    invoke-direct {p0}, Lcom/huawei/pluginachievement/ui/report/ReportYearActivity;->b()V

    .line 57
    return-void
.end method

.method public onDestroy()V
    .locals 2

    .line 147
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onDestroy()V

    .line 148
    sget-object v0, Lcom/huawei/pluginachievement/ui/report/ReportYearActivity;->f:Ljava/util/concurrent/ExecutorService;

    invoke-static {v0}, Lo/dzw;->c(Ljava/util/concurrent/ExecutorService;)V

    .line 149
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/ReportYearActivity;->g:Landroid/os/Handler;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 150
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/ReportYearActivity;->g:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 152
    :cond_0
    return-void
.end method
