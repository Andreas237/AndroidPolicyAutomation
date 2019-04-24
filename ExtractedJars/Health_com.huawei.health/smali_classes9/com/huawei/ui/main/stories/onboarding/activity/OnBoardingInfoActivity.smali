.class public Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingInfoActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private a:Lo/fhk;

.field private b:Lo/egd;

.field private c:Landroid/widget/TextView;

.field private d:Landroid/content/Context;

.field private e:Landroid/widget/TextView;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 36
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    return-void
.end method

.method private a()V
    .locals 4

    .line 111
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingInfoActivity;->a:Lo/fhk;

    if-eqz v0, :cond_0

    .line 112
    const-string v0, "SMART_OnBoardingInfoActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "VideoView stop play"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 113
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingInfoActivity;->a:Lo/fhk;

    invoke-virtual {v0}, Lo/fhk;->stopPlayback()V

    .line 115
    :cond_0
    return-void
.end method

.method private b()V
    .locals 9

    .line 57
    sget v0, Lcom/huawei/ui/main/R$id;->hw_health_onboarding_info_layout_skip:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingInfoActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingInfoActivity;->c:Landroid/widget/TextView;

    .line 58
    sget v0, Lcom/huawei/ui/main/R$id;->hw_health_onboarding_info_why:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingInfoActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingInfoActivity;->e:Landroid/widget/TextView;

    .line 59
    sget v0, Lcom/huawei/ui/main/R$id;->hw_health_onboarding_info_layout_start:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingInfoActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingInfoActivity;->b:Lo/egd;

    .line 60
    sget v0, Lcom/huawei/ui/main/R$id;->hw_health_onboarding_ad_view:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingInfoActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/fhk;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingInfoActivity;->a:Lo/fhk;

    .line 61
    invoke-static {p0}, Lo/ene;->t(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 62
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingInfoActivity;->d:Landroid/content/Context;

    const-string v1, "window"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/view/WindowManager;

    .line 63
    invoke-interface {v5}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v6

    .line 64
    new-instance v7, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v0, -0x1

    const/4 v1, -0x1

    invoke-direct {v7, v0, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 67
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingInfoActivity;->d:Landroid/content/Context;

    const/high16 v1, 0x433f0000    # 191.0f

    invoke-static {v0, v1}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v8

    .line 68
    invoke-virtual {v6}, Landroid/view/Display;->getWidth()I

    move-result v0

    mul-int/lit8 v1, v8, 0x2

    sub-int/2addr v0, v1

    iput v0, v7, Landroid/widget/LinearLayout$LayoutParams;->width:I

    .line 69
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingInfoActivity;->a:Lo/fhk;

    invoke-virtual {v0, v7}, Lo/fhk;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 71
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingInfoActivity;->c:Landroid/widget/TextView;

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 72
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingInfoActivity;->e:Landroid/widget/TextView;

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 73
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingInfoActivity;->b:Lo/egd;

    invoke-virtual {v0, p0}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 75
    new-instance v5, Lo/dcy;

    invoke-direct {v5}, Lo/dcy;-><init>()V

    .line 76
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingInfoActivity;->d:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "onboarding_skip_current_time"

    .line 77
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v3

    .line 76
    invoke-static {v0, v1, v2, v3, v5}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 78
    return-void
.end method

.method private c()V
    .locals 4

    .line 121
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingInfoActivity;->a:Lo/fhk;

    if-eqz v0, :cond_0

    .line 122
    const-string v0, "SMART_OnBoardingInfoActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "VideoView recycle cache"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 123
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingInfoActivity;->a:Lo/fhk;

    invoke-virtual {v0}, Lo/fhk;->destroyDrawingCache()V

    .line 125
    :cond_0
    return-void
.end method

.method private d()V
    .locals 4

    .line 101
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingInfoActivity;->a:Lo/fhk;

    if-eqz v0, :cond_0

    .line 102
    const-string v0, "SMART_OnBoardingInfoActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "VideoView pause play"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 103
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingInfoActivity;->a:Lo/fhk;

    invoke-virtual {v0}, Lo/fhk;->pause()V

    .line 105
    :cond_0
    return-void
.end method

.method private e()V
    .locals 3

    .line 81
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "android.resource://"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingInfoActivity;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$raw;->onboarding_ad:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 83
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingInfoActivity;->a:Lo/fhk;

    invoke-static {v2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/fhk;->setVideoURI(Landroid/net/Uri;)V

    .line 84
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingInfoActivity;->a:Lo/fhk;

    invoke-virtual {v0}, Lo/fhk;->start()V

    .line 85
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingInfoActivity;->a:Lo/fhk;

    invoke-virtual {v0}, Lo/fhk;->requestFocus()Z

    .line 86
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingInfoActivity;->a:Lo/fhk;

    new-instance v1, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingInfoActivity$2;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingInfoActivity$2;-><init>(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingInfoActivity;)V

    invoke-virtual {v0, v1}, Lo/fhk;->setOnCompletionListener(Landroid/media/MediaPlayer$OnCompletionListener;)V

    .line 95
    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 7

    .line 147
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingInfoActivity;->c:Landroid/widget/TextView;

    if-ne p1, v0, :cond_0

    .line 148
    const-string v0, "SMART_OnBoardingInfoActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onClick_Skip"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 149
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 150
    const-string v0, "click"

    const-string v1, "1"

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 151
    sget-object v0, Lo/dae;->bG:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v5

    .line 152
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingInfoActivity;->d:Landroid/content/Context;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v5, v4, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 153
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingInfoActivity;->finish()V

    .line 154
    goto/16 :goto_0

    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingInfoActivity;->b:Lo/egd;

    if-ne p1, v0, :cond_1

    .line 155
    const-string v0, "SMART_OnBoardingInfoActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onClick_Start"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 156
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 157
    const-string v0, "click"

    const-string v1, "1"

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 158
    sget-object v0, Lo/dae;->bF:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v5

    .line 159
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingInfoActivity;->d:Landroid/content/Context;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v5, v4, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 160
    new-instance v6, Landroid/content/Intent;

    invoke-direct {v6}, Landroid/content/Intent;-><init>()V

    .line 161
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingInfoActivity;->d:Landroid/content/Context;

    const-class v1, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;

    invoke-virtual {v6, v0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 162
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingInfoActivity;->d:Landroid/content/Context;

    invoke-virtual {v0, v6}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 163
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingInfoActivity;->finish()V

    .line 164
    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingInfoActivity;->e:Landroid/widget/TextView;

    if-ne p1, v0, :cond_2

    .line 166
    new-instance v5, Lo/egv$b;

    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingInfoActivity;->d:Landroid/content/Context;

    invoke-direct {v5, v0}, Lo/egv$b;-><init>(Landroid/content/Context;)V

    .line 167
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingInfoActivity;->d:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hwh_home_other_onboarding_info_Q_A_text4:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lo/egv$b;->e(Ljava/lang/String;)Lo/egv$b;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingInfoActivity;->d:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hwh_home_other_onboarding_info_dialog_content:I

    .line 168
    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egv$b;->b(Ljava/lang/String;)Lo/egv$b;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingInfoActivity;->d:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_settings_close:I

    .line 169
    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingInfoActivity$1;

    invoke-direct {v2, p0}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingInfoActivity$1;-><init>(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingInfoActivity;)V

    invoke-virtual {v0, v1, v2}, Lo/egv$b;->b(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egv$b;

    .line 176
    invoke-virtual {v5}, Lo/egv$b;->b()Lo/egv;

    move-result-object v4

    .line 177
    invoke-virtual {v4}, Lo/egv;->show()V

    .line 179
    :cond_2
    :goto_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 3

    .line 45
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 46
    iput-object p0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingInfoActivity;->d:Landroid/content/Context;

    .line 47
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingInfoActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/16 v1, 0x400

    const/16 v2, 0x400

    invoke-virtual {v0, v1, v2}, Landroid/view/Window;->setFlags(II)V

    .line 48
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x13

    if-lt v0, v1, :cond_0

    .line 49
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingInfoActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/high16 v1, 0x4000000

    invoke-virtual {v0, v1}, Landroid/view/Window;->addFlags(I)V

    .line 50
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingInfoActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/high16 v1, 0x8000000

    invoke-virtual {v0, v1}, Landroid/view/Window;->addFlags(I)V

    .line 52
    :cond_0
    sget v0, Lcom/huawei/ui/main/R$layout;->hw_health_onboarding_info_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingInfoActivity;->setContentView(I)V

    .line 53
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingInfoActivity;->b()V

    .line 54
    return-void
.end method

.method public onDestroy()V
    .locals 0

    .line 141
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onDestroy()V

    .line 142
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingInfoActivity;->a()V

    .line 143
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingInfoActivity;->c()V

    .line 144
    return-void
.end method

.method public onPause()V
    .locals 0

    .line 135
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onPause()V

    .line 136
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingInfoActivity;->d()V

    .line 137
    return-void
.end method

.method public onResume()V
    .locals 0

    .line 129
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onResume()V

    .line 130
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingInfoActivity;->e()V

    .line 131
    return-void
.end method
