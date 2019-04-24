.class public Lcom/huawei/ui/main/stories/me/activity/FlowStatisticsDisplayActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/ui/main/stories/me/activity/FlowStatisticsDisplayActivity$d;,
        Lcom/huawei/ui/main/stories/me/activity/FlowStatisticsDisplayActivity$c;
    }
.end annotation


# static fields
.field private static t:Lcom/huawei/ui/main/stories/me/activity/FlowStatisticsDisplayActivity$d;


# instance fields
.field private a:Landroid/widget/ImageView;

.field private b:Landroid/widget/LinearLayout;

.field private c:Landroid/widget/LinearLayout;

.field private d:Landroid/widget/LinearLayout;

.field private e:Landroid/widget/LinearLayout;

.field private f:Landroid/widget/TextView;

.field private g:Landroid/widget/TextView;

.field private h:Landroid/widget/TextView;

.field private i:Landroid/widget/TextView;

.field private k:Landroid/widget/TextView;

.field private l:Landroid/widget/TextView;

.field private m:Landroid/widget/TextView;

.field private n:Landroid/widget/TextView;

.field private o:Landroid/widget/TextView;

.field private p:Landroid/widget/TextView;

.field private r:Landroid/widget/TextView;

.field private u:Ljava/util/concurrent/ScheduledExecutorService;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 35
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    .line 52
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/FlowStatisticsDisplayActivity;->a:Landroid/widget/ImageView;

    .line 54
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/FlowStatisticsDisplayActivity;->k:Landroid/widget/TextView;

    .line 56
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/FlowStatisticsDisplayActivity;->f:Landroid/widget/TextView;

    .line 58
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/FlowStatisticsDisplayActivity;->i:Landroid/widget/TextView;

    .line 60
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/FlowStatisticsDisplayActivity;->h:Landroid/widget/TextView;

    .line 62
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/FlowStatisticsDisplayActivity;->g:Landroid/widget/TextView;

    .line 64
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/FlowStatisticsDisplayActivity;->l:Landroid/widget/TextView;

    .line 66
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/FlowStatisticsDisplayActivity;->n:Landroid/widget/TextView;

    .line 68
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/FlowStatisticsDisplayActivity;->o:Landroid/widget/TextView;

    .line 70
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/FlowStatisticsDisplayActivity;->m:Landroid/widget/TextView;

    .line 72
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/FlowStatisticsDisplayActivity;->p:Landroid/widget/TextView;

    .line 74
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/FlowStatisticsDisplayActivity;->r:Landroid/widget/TextView;

    .line 78
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/FlowStatisticsDisplayActivity;->u:Ljava/util/concurrent/ScheduledExecutorService;

    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/main/stories/me/activity/FlowStatisticsDisplayActivity;)V
    .locals 0

    .line 35
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/me/activity/FlowStatisticsDisplayActivity;->e()V

    return-void
.end method

.method static synthetic b()Lcom/huawei/ui/main/stories/me/activity/FlowStatisticsDisplayActivity$d;
    .locals 1

    .line 35
    sget-object v0, Lcom/huawei/ui/main/stories/me/activity/FlowStatisticsDisplayActivity;->t:Lcom/huawei/ui/main/stories/me/activity/FlowStatisticsDisplayActivity$d;

    return-object v0
.end method

.method public static b(Landroid/content/Context;)Ljava/lang/String;
    .locals 3
    .annotation build Landroid/annotation/TargetApi;
        value = 0x17
    .end annotation

    .line 178
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-le v1, v0, :cond_0

    .line 179
    const/4 v0, 0x0

    return-object v0

    .line 182
    :cond_0
    new-instance v2, Ljava/lang/StringBuffer;

    invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V

    .line 183
    const-string v0, "Wlan=0,mobile=0"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 184
    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private d()V
    .locals 1

    .line 122
    sget v0, Lcom/huawei/ui/main/R$id;->developer_flow_statistics_appicon:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/FlowStatisticsDisplayActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/FlowStatisticsDisplayActivity;->a:Landroid/widget/ImageView;

    .line 123
    sget v0, Lcom/huawei/ui/main/R$id;->developer_flow_statistics_appname:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/FlowStatisticsDisplayActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/FlowStatisticsDisplayActivity;->k:Landroid/widget/TextView;

    .line 124
    sget v0, Lcom/huawei/ui/main/R$id;->developer_flow_statistics_support_tips:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/FlowStatisticsDisplayActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/FlowStatisticsDisplayActivity;->o:Landroid/widget/TextView;

    .line 126
    sget v0, Lcom/huawei/ui/main/R$id;->developer_flow_statistics_appinfolayout:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/FlowStatisticsDisplayActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/FlowStatisticsDisplayActivity;->e:Landroid/widget/LinearLayout;

    .line 127
    sget v0, Lcom/huawei/ui/main/R$id;->developer_flow_statistics_mobilelayout:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/FlowStatisticsDisplayActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/FlowStatisticsDisplayActivity;->d:Landroid/widget/LinearLayout;

    .line 128
    sget v0, Lcom/huawei/ui/main/R$id;->developer_flow_statistics_wifilayout:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/FlowStatisticsDisplayActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/FlowStatisticsDisplayActivity;->c:Landroid/widget/LinearLayout;

    .line 129
    sget v0, Lcom/huawei/ui/main/R$id;->developer_flow_statistics_yestedaylayout:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/FlowStatisticsDisplayActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/FlowStatisticsDisplayActivity;->b:Landroid/widget/LinearLayout;

    .line 131
    sget v0, Lcom/huawei/ui/main/R$id;->developer_flow_statistics_wifirx:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/FlowStatisticsDisplayActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/FlowStatisticsDisplayActivity;->f:Landroid/widget/TextView;

    .line 132
    sget v0, Lcom/huawei/ui/main/R$id;->developer_flow_statistics_wifitx:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/FlowStatisticsDisplayActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/FlowStatisticsDisplayActivity;->i:Landroid/widget/TextView;

    .line 133
    sget v0, Lcom/huawei/ui/main/R$id;->developer_flow_statistics_wifitotal:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/FlowStatisticsDisplayActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/FlowStatisticsDisplayActivity;->h:Landroid/widget/TextView;

    .line 134
    sget v0, Lcom/huawei/ui/main/R$id;->developer_flow_statistics_mobilerx:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/FlowStatisticsDisplayActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/FlowStatisticsDisplayActivity;->g:Landroid/widget/TextView;

    .line 135
    sget v0, Lcom/huawei/ui/main/R$id;->developer_flow_statistics_mobiletx:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/FlowStatisticsDisplayActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/FlowStatisticsDisplayActivity;->l:Landroid/widget/TextView;

    .line 136
    sget v0, Lcom/huawei/ui/main/R$id;->developer_flow_statistics_mobiletotal:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/FlowStatisticsDisplayActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/FlowStatisticsDisplayActivity;->n:Landroid/widget/TextView;

    .line 137
    sget v0, Lcom/huawei/ui/main/R$id;->developer_flow_statistics_yesteday_wifiinfo:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/FlowStatisticsDisplayActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/FlowStatisticsDisplayActivity;->m:Landroid/widget/TextView;

    .line 138
    sget v0, Lcom/huawei/ui/main/R$id;->developer_flow_statistics_yesteday_mobileinfo:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/FlowStatisticsDisplayActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/FlowStatisticsDisplayActivity;->p:Landroid/widget/TextView;

    .line 139
    sget v0, Lcom/huawei/ui/main/R$id;->developer_flow_statistics_yesteday_total:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/FlowStatisticsDisplayActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/FlowStatisticsDisplayActivity;->r:Landroid/widget/TextView;

    .line 140
    return-void
.end method

.method private e()V
    .locals 3
    .annotation build Landroid/annotation/TargetApi;
        value = 0x17
    .end annotation

    .line 297
    const-string v0, "FlowStatisticsDisplay"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "sdk version: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    invoke-static {v2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 299
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-le v1, v0, :cond_0

    .line 300
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/FlowStatisticsDisplayActivity;->o:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 301
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/FlowStatisticsDisplayActivity;->d:Landroid/widget/LinearLayout;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 302
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/FlowStatisticsDisplayActivity;->c:Landroid/widget/LinearLayout;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 303
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/FlowStatisticsDisplayActivity;->b:Landroid/widget/LinearLayout;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 304
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/FlowStatisticsDisplayActivity;->e:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 305
    return-void

    .line 307
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/FlowStatisticsDisplayActivity;->o:Landroid/widget/TextView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 308
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/FlowStatisticsDisplayActivity;->d:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 309
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/FlowStatisticsDisplayActivity;->c:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 310
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/FlowStatisticsDisplayActivity;->b:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 311
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/FlowStatisticsDisplayActivity;->e:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 509
    return-void
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 8

    .line 90
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 91
    const-string v0, "FlowStatisticsDisplay"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCreate()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 92
    sget v0, Lcom/huawei/ui/main/R$layout;->hw_show_developer_flow_statistic_display:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/FlowStatisticsDisplayActivity;->setContentView(I)V

    .line 93
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/me/activity/FlowStatisticsDisplayActivity;->d()V

    .line 95
    invoke-static {p0}, Lcom/huawei/ui/main/stories/me/activity/FlowStatisticsDisplayActivity;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v7

    .line 96
    const/4 v0, 0x0

    if-ne v0, v7, :cond_0

    .line 97
    const-string v0, "\u8fd4\u56de\u65e5\u671f\uff1a"

    const-string v1, "\u624b\u673a\u4e0d\u652f\u6301\uff01"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 99
    :cond_0
    const-string v0, "\u8fd4\u56de\u65e5\u671f\uff1a"

    invoke-static {v0, v7}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 102
    :goto_0
    new-instance v0, Lcom/huawei/ui/main/stories/me/activity/FlowStatisticsDisplayActivity$d;

    invoke-direct {v0, p0, p0}, Lcom/huawei/ui/main/stories/me/activity/FlowStatisticsDisplayActivity$d;-><init>(Lcom/huawei/ui/main/stories/me/activity/FlowStatisticsDisplayActivity;Lcom/huawei/ui/main/stories/me/activity/FlowStatisticsDisplayActivity;)V

    sput-object v0, Lcom/huawei/ui/main/stories/me/activity/FlowStatisticsDisplayActivity;->t:Lcom/huawei/ui/main/stories/me/activity/FlowStatisticsDisplayActivity$d;

    .line 103
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/FlowStatisticsDisplayActivity;->u:Ljava/util/concurrent/ScheduledExecutorService;

    if-nez v0, :cond_1

    .line 104
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadScheduledExecutor()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/FlowStatisticsDisplayActivity;->u:Ljava/util/concurrent/ScheduledExecutorService;

    .line 105
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/FlowStatisticsDisplayActivity;->u:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v1, Lcom/huawei/ui/main/stories/me/activity/FlowStatisticsDisplayActivity$c;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lcom/huawei/ui/main/stories/me/activity/FlowStatisticsDisplayActivity$c;-><init>(Lcom/huawei/ui/main/stories/me/activity/FlowStatisticsDisplayActivity$5;)V

    sget-object v6, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v2, 0x0

    const-wide/16 v4, 0x1388

    invoke-interface/range {v0 .. v6}, Ljava/util/concurrent/ScheduledExecutorService;->scheduleAtFixedRate(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    goto :goto_1

    .line 107
    :cond_1
    const-string v0, "FlowStatisticsDisplay"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "timer init timer has initialized"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 109
    :goto_1
    return-void
.end method

.method public onDestroy()V
    .locals 4

    .line 113
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onDestroy()V

    .line 114
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/FlowStatisticsDisplayActivity;->u:Ljava/util/concurrent/ScheduledExecutorService;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 115
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/FlowStatisticsDisplayActivity;->u:Ljava/util/concurrent/ScheduledExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ScheduledExecutorService;->shutdownNow()Ljava/util/List;

    .line 116
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/FlowStatisticsDisplayActivity;->u:Ljava/util/concurrent/ScheduledExecutorService;

    .line 117
    const-string v0, "FlowStatisticsDisplay"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Timer threadpool shutdown"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 119
    :cond_0
    return-void
.end method
