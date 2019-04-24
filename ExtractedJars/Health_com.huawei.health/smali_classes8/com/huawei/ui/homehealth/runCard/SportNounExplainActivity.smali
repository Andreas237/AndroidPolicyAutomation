.class public Lcom/huawei/ui/homehealth/runCard/SportNounExplainActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field a:Landroid/os/Handler;
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "HandlerLeak"
        }
    .end annotation
.end field

.field private b:Lo/emr;

.field private c:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportNounExplainFragment;

.field private d:Z

.field private e:I

.field private i:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportNounExplainItemFragment;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 36
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    .line 40
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/homehealth/runCard/SportNounExplainActivity;->e:I

    .line 44
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/homehealth/runCard/SportNounExplainActivity;->d:Z

    .line 140
    new-instance v0, Lcom/huawei/ui/homehealth/runCard/SportNounExplainActivity$3;

    invoke-direct {v0, p0}, Lcom/huawei/ui/homehealth/runCard/SportNounExplainActivity$3;-><init>(Lcom/huawei/ui/homehealth/runCard/SportNounExplainActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportNounExplainActivity;->a:Landroid/os/Handler;

    return-void
.end method

.method private a()V
    .locals 3

    .line 112
    invoke-virtual {p0}, Lcom/huawei/ui/homehealth/runCard/SportNounExplainActivity;->getIntent()Landroid/content/Intent;

    move-result-object v2

    .line 113
    if-eqz v2, :cond_0

    .line 114
    const-string v0, "sportType"

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/homehealth/runCard/SportNounExplainActivity;->e:I

    .line 119
    :cond_0
    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/homehealth/runCard/SportNounExplainActivity;Z)Z
    .locals 0

    .line 36
    iput-boolean p1, p0, Lcom/huawei/ui/homehealth/runCard/SportNounExplainActivity;->d:Z

    return p1
.end method

.method private d(I)V
    .locals 3

    .line 81
    packed-switch p1, :pswitch_data_0

    goto/16 :goto_0

    .line 83
    :pswitch_0
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportNounExplainActivity;->b:Lo/emr;

    invoke-virtual {p0}, Lcom/huawei/ui/homehealth/runCard/SportNounExplainActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homehealth/R$string;->IDS_sport_noun_explain:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setTitleText(Ljava/lang/String;)V

    .line 85
    goto :goto_0

    .line 87
    :pswitch_1
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportNounExplainActivity;->b:Lo/emr;

    invoke-virtual {p0}, Lcom/huawei/ui/homehealth/runCard/SportNounExplainActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homehealth/R$string;->IDS_main_watch_heart_rate_string:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setTitleText(Ljava/lang/String;)V

    .line 89
    goto :goto_0

    .line 91
    :pswitch_2
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportNounExplainActivity;->b:Lo/emr;

    invoke-virtual {p0}, Lcom/huawei/ui/homehealth/runCard/SportNounExplainActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homehealth/R$string;->IDS_pluginmotiontrack_detail_title_step:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setTitleText(Ljava/lang/String;)V

    .line 93
    goto :goto_0

    .line 95
    :pswitch_3
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportNounExplainActivity;->b:Lo/emr;

    invoke-virtual {p0}, Lcom/huawei/ui/homehealth/runCard/SportNounExplainActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homehealth/R$string;->IDS_pluginmotiontrack_detail_running_posture:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setTitleText(Ljava/lang/String;)V

    .line 97
    goto :goto_0

    .line 99
    :pswitch_4
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportNounExplainActivity;->b:Lo/emr;

    invoke-virtual {p0}, Lcom/huawei/ui/homehealth/runCard/SportNounExplainActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homehealth/R$string;->IDS_pluginmotiontrack_detail_title_train:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setTitleText(Ljava/lang/String;)V

    .line 101
    goto :goto_0

    .line 103
    :pswitch_5
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportNounExplainActivity;->b:Lo/emr;

    invoke-virtual {p0}, Lcom/huawei/ui/homehealth/runCard/SportNounExplainActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homehealth/R$string;->IDS_pluginmotiontrack_detail_title_swim:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setTitleText(Ljava/lang/String;)V

    .line 104
    .line 108
    :goto_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
    .end packed-switch
.end method

.method private e()V
    .locals 4

    .line 60
    sget v0, Lcom/huawei/ui/homehealth/R$id;->text_show_sport_type:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/homehealth/runCard/SportNounExplainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emr;

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportNounExplainActivity;->b:Lo/emr;

    .line 61
    iget v0, p0, Lcom/huawei/ui/homehealth/runCard/SportNounExplainActivity;->e:I

    invoke-direct {p0, v0}, Lcom/huawei/ui/homehealth/runCard/SportNounExplainActivity;->d(I)V

    .line 64
    invoke-virtual {p0}, Lcom/huawei/ui/homehealth/runCard/SportNounExplainActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v2

    .line 65
    invoke-virtual {v2}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v3

    .line 67
    iget v0, p0, Lcom/huawei/ui/homehealth/runCard/SportNounExplainActivity;->e:I

    if-nez v0, :cond_0

    .line 68
    new-instance v0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportNounExplainFragment;

    invoke-direct {v0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportNounExplainFragment;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportNounExplainActivity;->c:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportNounExplainFragment;

    .line 69
    sget v0, Lcom/huawei/ui/homehealth/R$id;->frag_sport_noun_explain_list:I

    iget-object v1, p0, Lcom/huawei/ui/homehealth/runCard/SportNounExplainActivity;->c:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportNounExplainFragment;

    invoke-virtual {v3, v0, v1}, Landroid/support/v4/app/FragmentTransaction;->add(ILandroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    goto :goto_0

    .line 71
    :cond_0
    new-instance v0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportNounExplainItemFragment;

    iget v1, p0, Lcom/huawei/ui/homehealth/runCard/SportNounExplainActivity;->e:I

    invoke-direct {v0, v1}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportNounExplainItemFragment;-><init>(I)V

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportNounExplainActivity;->i:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportNounExplainItemFragment;

    .line 72
    sget v0, Lcom/huawei/ui/homehealth/R$id;->frag_sport_noun_explain_list:I

    iget-object v1, p0, Lcom/huawei/ui/homehealth/runCard/SportNounExplainActivity;->i:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportNounExplainItemFragment;

    invoke-virtual {v3, v0, v1}, Landroid/support/v4/app/FragmentTransaction;->add(ILandroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    .line 75
    :goto_0
    invoke-virtual {v3}, Landroid/support/v4/app/FragmentTransaction;->commit()I

    .line 77
    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 125
    iget-boolean v0, p0, Lcom/huawei/ui/homehealth/runCard/SportNounExplainActivity;->d:Z

    if-eqz v0, :cond_0

    .line 126
    const-string v0, "SportNounExplainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "don\'t click to fast"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 127
    return-void

    .line 129
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/SportNounExplainActivity;->a:Landroid/os/Handler;

    new-instance v1, Lcom/huawei/ui/homehealth/runCard/SportNounExplainActivity$4;

    invoke-direct {v1, p0}, Lcom/huawei/ui/homehealth/runCard/SportNounExplainActivity$4;-><init>(Lcom/huawei/ui/homehealth/runCard/SportNounExplainActivity;)V

    const-wide/16 v2, 0x1f4

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 135
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/homehealth/runCard/SportNounExplainActivity;->d:Z

    .line 138
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 4

    .line 49
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 50
    const-string v0, "SportNounExplainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCreate"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 51
    sget v0, Lcom/huawei/ui/homehealth/R$layout;->activity_sport_noun_explain:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/homehealth/runCard/SportNounExplainActivity;->setContentView(I)V

    .line 53
    invoke-direct {p0}, Lcom/huawei/ui/homehealth/runCard/SportNounExplainActivity;->a()V

    .line 54
    invoke-direct {p0}, Lcom/huawei/ui/homehealth/runCard/SportNounExplainActivity;->e()V

    .line 56
    return-void
.end method
