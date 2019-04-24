.class public Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameGuideActivity;
.super Landroid/support/v7/app/AppCompatActivity;
.source "SourceFile"


# instance fields
.field private a:Lo/exh;

.field private b:Landroid/content/Intent;

.field private c:Lo/egd;

.field private d:Landroid/widget/TextView;

.field private e:Ljava/lang/String;

.field private g:Ljava/lang/Long;

.field private k:Landroid/content/Context;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 37
    invoke-direct {p0}, Landroid/support/v7/app/AppCompatActivity;-><init>()V

    .line 40
    const-string v0, "StressGameGuideActivity"

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameGuideActivity;->e:Ljava/lang/String;

    .line 45
    const-wide/16 v0, 0x0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameGuideActivity;->g:Ljava/lang/Long;

    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameGuideActivity;)Landroid/content/Intent;
    .locals 1

    .line 37
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameGuideActivity;->b:Landroid/content/Intent;

    return-object v0
.end method

.method private a()V
    .locals 7

    .line 85
    sget v0, Lcom/huawei/ui/main/R$id;->btn_guide_start:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameGuideActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameGuideActivity;->c:Lo/egd;

    .line 86
    sget v0, Lcom/huawei/ui/main/R$id;->tv_guide_info_keep_break:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameGuideActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameGuideActivity;->d:Landroid/widget/TextView;

    .line 87
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameGuideActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$plurals;->IDS_hw_map_time_unit_value_minutes:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x2

    invoke-virtual {v0, v1, v3, v2}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    .line 88
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameGuideActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->Stress_game_guide_info_game:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v5, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    .line 89
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameGuideActivity;->d:Landroid/widget/TextView;

    invoke-virtual {v0, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 90
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameGuideActivity;->b:Landroid/content/Intent;

    .line 91
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameGuideActivity;->b:Landroid/content/Intent;

    const-string v1, "STRESSGAME_STARTTIME"

    iget-object v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameGuideActivity;->g:Ljava/lang/Long;

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    .line 92
    return-void
.end method

.method static synthetic b(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameGuideActivity;)Lo/exh;
    .locals 1

    .line 37
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameGuideActivity;->a:Lo/exh;

    return-object v0
.end method

.method static synthetic c(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameGuideActivity;)Landroid/content/Context;
    .locals 1

    .line 37
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameGuideActivity;->k:Landroid/content/Context;

    return-object v0
.end method

.method private c()V
    .locals 4

    .line 132
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xb

    if-le v0, v1, :cond_0

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x13

    if-ge v0, v1, :cond_0

    .line 133
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameGuideActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v2

    .line 134
    const/16 v0, 0x8

    invoke-virtual {v2, v0}, Landroid/view/View;->setSystemUiVisibility(I)V

    .line 135
    goto :goto_0

    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x13

    if-lt v0, v1, :cond_1

    .line 137
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameGuideActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v2

    .line 138
    const/16 v3, 0x1006

    .line 140
    invoke-virtual {v2, v3}, Landroid/view/View;->setSystemUiVisibility(I)V

    .line 142
    :cond_1
    :goto_0
    return-void
.end method

.method static synthetic d(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameGuideActivity;)Ljava/lang/String;
    .locals 1

    .line 37
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameGuideActivity;->e:Ljava/lang/String;

    return-object v0
.end method

.method private d()V
    .locals 2

    .line 95
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameGuideActivity;->c:Lo/egd;

    new-instance v1, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameGuideActivity$2;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameGuideActivity$2;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameGuideActivity;)V

    invoke-virtual {v0, v1}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 126
    return-void
.end method

.method static synthetic e(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameGuideActivity;Lo/exh;)Lo/exh;
    .locals 0

    .line 37
    iput-object p1, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameGuideActivity;->a:Lo/exh;

    return-object p1
.end method

.method private e()V
    .locals 3

    .line 148
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 149
    const-string v0, "click"

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 150
    sget-object v0, Lo/dae;->fq:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v2}, Lo/bzm;->c(Ljava/lang/String;Ljava/util/Map;)V

    .line 151
    return-void
.end method

.method static synthetic e(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameGuideActivity;)V
    .locals 0

    .line 37
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameGuideActivity;->e()V

    return-void
.end method


# virtual methods
.method public onBackPressed()V
    .locals 4

    .line 75
    invoke-super {p0}, Landroid/support/v7/app/AppCompatActivity;->onBackPressed()V

    .line 76
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameGuideActivity;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onBackPressed"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 77
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameGuideActivity;->finish()V

    .line 78
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 4

    .line 49
    invoke-super {p0, p1}, Landroid/support/v7/app/AppCompatActivity;->onCreate(Landroid/os/Bundle;)V

    .line 50
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameGuideActivity;->getWindow()Landroid/view/Window;

    move-result-object v2

    .line 52
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameGuideActivity;->requestWindowFeature(I)Z

    .line 55
    const/16 v3, 0x400

    .line 57
    invoke-virtual {v2, v3, v3}, Landroid/view/Window;->setFlags(II)V

    .line 58
    sget v0, Lcom/huawei/ui/main/R$layout;->activity_stress_game_guide:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameGuideActivity;->setContentView(I)V

    .line 59
    iput-object p0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameGuideActivity;->k:Landroid/content/Context;

    .line 60
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameGuideActivity;->g:Ljava/lang/Long;

    .line 61
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameGuideActivity;->a()V

    .line 62
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameGuideActivity;->d()V

    .line 63
    return-void
.end method

.method public onDestroy()V
    .locals 0

    .line 71
    invoke-super {p0}, Landroid/support/v7/app/AppCompatActivity;->onDestroy()V

    .line 72
    return-void
.end method

.method public onResume()V
    .locals 0

    .line 66
    invoke-super {p0}, Landroid/support/v7/app/AppCompatActivity;->onResume()V

    .line 67
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameGuideActivity;->c()V

    .line 68
    return-void
.end method
