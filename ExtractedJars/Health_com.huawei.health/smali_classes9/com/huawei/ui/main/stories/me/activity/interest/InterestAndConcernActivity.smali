.class public Lcom/huawei/ui/main/stories/me/activity/interest/InterestAndConcernActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/ui/main/stories/me/activity/interest/InterestAndConcernActivity$b;
    }
.end annotation


# instance fields
.field private a:Landroid/widget/CheckBox;

.field private b:Landroid/widget/CheckBox;

.field private c:Landroid/widget/CheckBox;

.field private d:Landroid/widget/CheckBox;

.field private e:Landroid/widget/CheckBox;

.field private f:Landroid/content/Context;

.field private g:Landroid/widget/CheckBox;

.field private h:Lo/emr;

.field private i:Landroid/widget/CheckBox;

.field private k:Landroid/widget/CheckBox;

.field private l:Ljava/lang/String;

.field private m:Ljava/lang/String;

.field private n:Ljava/lang/String;

.field private o:Ljava/lang/String;

.field private p:Ljava/lang/String;

.field private q:Ljava/lang/String;

.field private r:Ljava/lang/String;

.field private s:Ljava/util/concurrent/ExecutorService;

.field private t:Ljava/lang/String;

.field private u:Landroid/os/Handler;

.field private v:Landroid/widget/TextView;

.field private w:Landroid/widget/TextView;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 39
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    .line 46
    const-string v0, "0"

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/interest/InterestAndConcernActivity;->p:Ljava/lang/String;

    const-string v0, "0"

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/interest/InterestAndConcernActivity;->l:Ljava/lang/String;

    const-string v0, "0"

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/interest/InterestAndConcernActivity;->o:Ljava/lang/String;

    const-string v0, "0"

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/interest/InterestAndConcernActivity;->n:Ljava/lang/String;

    const-string v0, "0"

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/interest/InterestAndConcernActivity;->m:Ljava/lang/String;

    const-string v0, "0"

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/interest/InterestAndConcernActivity;->r:Ljava/lang/String;

    const-string v0, "0"

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/interest/InterestAndConcernActivity;->t:Ljava/lang/String;

    const-string v0, "0"

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/interest/InterestAndConcernActivity;->q:Ljava/lang/String;

    .line 50
    new-instance v0, Lcom/huawei/ui/main/stories/me/activity/interest/InterestAndConcernActivity$b;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/me/activity/interest/InterestAndConcernActivity$b;-><init>(Lcom/huawei/ui/main/stories/me/activity/interest/InterestAndConcernActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/interest/InterestAndConcernActivity;->u:Landroid/os/Handler;

    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/main/stories/me/activity/interest/InterestAndConcernActivity;)Ljava/lang/String;
    .locals 1

    .line 39
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/interest/InterestAndConcernActivity;->p:Ljava/lang/String;

    return-object v0
.end method

.method private b()V
    .locals 3

    .line 63
    sget v0, Lcom/huawei/ui/main/R$id;->me_userInfo_titlebar:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/interest/InterestAndConcernActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emr;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/interest/InterestAndConcernActivity;->h:Lo/emr;

    .line 64
    sget v0, Lcom/huawei/ui/main/R$id;->user_info_fragment_set_interest_running_checkbox:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/interest/InterestAndConcernActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/CheckBox;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/interest/InterestAndConcernActivity;->b:Landroid/widget/CheckBox;

    .line 65
    sget v0, Lcom/huawei/ui/main/R$id;->user_info_fragment_set_interest_walking_checkbox:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/interest/InterestAndConcernActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/CheckBox;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/interest/InterestAndConcernActivity;->c:Landroid/widget/CheckBox;

    .line 66
    sget v0, Lcom/huawei/ui/main/R$id;->user_info_fragment_set_interest_ride_checkbox:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/interest/InterestAndConcernActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/CheckBox;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/interest/InterestAndConcernActivity;->d:Landroid/widget/CheckBox;

    .line 67
    sget v0, Lcom/huawei/ui/main/R$id;->user_info_fragment_set_interest_build_checkbox:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/interest/InterestAndConcernActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/CheckBox;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/interest/InterestAndConcernActivity;->e:Landroid/widget/CheckBox;

    .line 68
    sget v0, Lcom/huawei/ui/main/R$id;->user_info_fragment_set_concern_bloodpressure_checkbox:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/interest/InterestAndConcernActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/CheckBox;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/interest/InterestAndConcernActivity;->k:Landroid/widget/CheckBox;

    .line 69
    sget v0, Lcom/huawei/ui/main/R$id;->user_info_fragment_set_concern_blood_sugar_checkbox:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/interest/InterestAndConcernActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/CheckBox;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/interest/InterestAndConcernActivity;->g:Landroid/widget/CheckBox;

    .line 70
    sget v0, Lcom/huawei/ui/main/R$id;->user_info_fragment_set_concern_weight_checkbox:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/interest/InterestAndConcernActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/CheckBox;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/interest/InterestAndConcernActivity;->a:Landroid/widget/CheckBox;

    .line 71
    sget v0, Lcom/huawei/ui/main/R$id;->user_info_fragment_set_concern_sleep_checkbox:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/interest/InterestAndConcernActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/CheckBox;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/interest/InterestAndConcernActivity;->i:Landroid/widget/CheckBox;

    .line 72
    sget v0, Lcom/huawei/ui/main/R$id;->hw_health_interest_title:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/interest/InterestAndConcernActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/interest/InterestAndConcernActivity;->v:Landroid/widget/TextView;

    .line 73
    sget v0, Lcom/huawei/ui/main/R$id;->hw_health_concern_title:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/interest/InterestAndConcernActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/interest/InterestAndConcernActivity;->w:Landroid/widget/TextView;

    .line 74
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/interest/InterestAndConcernActivity;->v:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/interest/InterestAndConcernActivity;->f:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hwh_home_other_onboarding_title_activity:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 75
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/interest/InterestAndConcernActivity;->w:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/interest/InterestAndConcernActivity;->f:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hwh_home_other_onboarding_title_concern:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 76
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/interest/InterestAndConcernActivity;->b:Landroid/widget/CheckBox;

    invoke-virtual {v0, p0}, Landroid/widget/CheckBox;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 77
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/interest/InterestAndConcernActivity;->c:Landroid/widget/CheckBox;

    invoke-virtual {v0, p0}, Landroid/widget/CheckBox;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 78
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/interest/InterestAndConcernActivity;->d:Landroid/widget/CheckBox;

    invoke-virtual {v0, p0}, Landroid/widget/CheckBox;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 79
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/interest/InterestAndConcernActivity;->e:Landroid/widget/CheckBox;

    invoke-virtual {v0, p0}, Landroid/widget/CheckBox;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 80
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/interest/InterestAndConcernActivity;->k:Landroid/widget/CheckBox;

    invoke-virtual {v0, p0}, Landroid/widget/CheckBox;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 81
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/interest/InterestAndConcernActivity;->g:Landroid/widget/CheckBox;

    invoke-virtual {v0, p0}, Landroid/widget/CheckBox;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 82
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/interest/InterestAndConcernActivity;->a:Landroid/widget/CheckBox;

    invoke-virtual {v0, p0}, Landroid/widget/CheckBox;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 83
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/interest/InterestAndConcernActivity;->i:Landroid/widget/CheckBox;

    invoke-virtual {v0, p0}, Landroid/widget/CheckBox;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 84
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/interest/InterestAndConcernActivity;->f:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->t(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 85
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/interest/InterestAndConcernActivity;->h:Lo/emr;

    const/high16 v1, 0x41800000    # 16.0f

    invoke-virtual {v0, v1}, Lo/emr;->setTitleSize(F)V

    .line 87
    :cond_0
    return-void
.end method

.method private b(Landroid/widget/CompoundButton;Z)V
    .locals 1

    .line 191
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/interest/InterestAndConcernActivity;->a:Landroid/widget/CheckBox;

    if-ne p1, v0, :cond_1

    .line 192
    if-eqz p2, :cond_0

    .line 193
    const-string v0, "1"

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/interest/InterestAndConcernActivity;->m:Ljava/lang/String;

    goto :goto_0

    .line 195
    :cond_0
    const-string v0, "0"

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/interest/InterestAndConcernActivity;->m:Ljava/lang/String;

    .line 198
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/interest/InterestAndConcernActivity;->i:Landroid/widget/CheckBox;

    if-ne p1, v0, :cond_3

    .line 199
    if-eqz p2, :cond_2

    .line 200
    const-string v0, "1"

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/interest/InterestAndConcernActivity;->r:Ljava/lang/String;

    goto :goto_1

    .line 202
    :cond_2
    const-string v0, "0"

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/interest/InterestAndConcernActivity;->r:Ljava/lang/String;

    .line 205
    :cond_3
    :goto_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/interest/InterestAndConcernActivity;->k:Landroid/widget/CheckBox;

    if-ne p1, v0, :cond_5

    .line 206
    if-eqz p2, :cond_4

    .line 207
    const-string v0, "1"

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/interest/InterestAndConcernActivity;->t:Ljava/lang/String;

    goto :goto_2

    .line 209
    :cond_4
    const-string v0, "0"

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/interest/InterestAndConcernActivity;->t:Ljava/lang/String;

    .line 212
    :cond_5
    :goto_2
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/interest/InterestAndConcernActivity;->g:Landroid/widget/CheckBox;

    if-ne p1, v0, :cond_7

    .line 213
    if-eqz p2, :cond_6

    .line 214
    const-string v0, "1"

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/interest/InterestAndConcernActivity;->q:Ljava/lang/String;

    goto :goto_3

    .line 216
    :cond_6
    const-string v0, "0"

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/interest/InterestAndConcernActivity;->q:Ljava/lang/String;

    .line 219
    :cond_7
    :goto_3
    return-void
.end method

.method static synthetic b(Lcom/huawei/ui/main/stories/me/activity/interest/InterestAndConcernActivity;)V
    .locals 0

    .line 39
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/me/activity/interest/InterestAndConcernActivity;->c()V

    return-void
.end method

.method private b(C)Z
    .locals 1

    .line 127
    const/16 v0, 0x31

    if-ne p1, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method static synthetic c(Lcom/huawei/ui/main/stories/me/activity/interest/InterestAndConcernActivity;)Landroid/content/Context;
    .locals 1

    .line 39
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/interest/InterestAndConcernActivity;->f:Landroid/content/Context;

    return-object v0
.end method

.method private c()V
    .locals 4

    .line 131
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/interest/InterestAndConcernActivity;->f:Landroid/content/Context;

    invoke-static {v0}, Lo/dth;->b(Landroid/content/Context;)Lo/dth;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/interest/InterestAndConcernActivity;->f:Landroid/content/Context;

    const/16 v2, 0x44c

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    invoke-virtual {v0, v1, v2, v3}, Lo/dth;->c(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;)I

    .line 132
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/interest/InterestAndConcernActivity;->s:Ljava/util/concurrent/ExecutorService;

    if-eqz v0, :cond_0

    .line 133
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/interest/InterestAndConcernActivity;->s:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/huawei/ui/main/stories/me/activity/interest/InterestAndConcernActivity$2;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/me/activity/interest/InterestAndConcernActivity$2;-><init>(Lcom/huawei/ui/main/stories/me/activity/interest/InterestAndConcernActivity;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 156
    :cond_0
    return-void
.end method

.method private c(Lcom/huawei/hihealth/HiUserPreference;)V
    .locals 4

    .line 114
    if-eqz p1, :cond_0

    .line 115
    const-string v0, "SMART_InterestAndConcernActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Interest_hiUserPreference"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p1}, Lcom/huawei/hihealth/HiUserPreference;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 116
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/interest/InterestAndConcernActivity;->b:Landroid/widget/CheckBox;

    invoke-virtual {p1}, Lcom/huawei/hihealth/HiUserPreference;->getValue()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ljava/lang/String;->charAt(I)C

    move-result v1

    invoke-direct {p0, v1}, Lcom/huawei/ui/main/stories/me/activity/interest/InterestAndConcernActivity;->b(C)Z

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setChecked(Z)V

    .line 117
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/interest/InterestAndConcernActivity;->d:Landroid/widget/CheckBox;

    invoke-virtual {p1}, Lcom/huawei/hihealth/HiUserPreference;->getValue()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Ljava/lang/String;->charAt(I)C

    move-result v1

    invoke-direct {p0, v1}, Lcom/huawei/ui/main/stories/me/activity/interest/InterestAndConcernActivity;->b(C)Z

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setChecked(Z)V

    .line 118
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/interest/InterestAndConcernActivity;->c:Landroid/widget/CheckBox;

    invoke-virtual {p1}, Lcom/huawei/hihealth/HiUserPreference;->getValue()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x2

    invoke-virtual {v1, v2}, Ljava/lang/String;->charAt(I)C

    move-result v1

    invoke-direct {p0, v1}, Lcom/huawei/ui/main/stories/me/activity/interest/InterestAndConcernActivity;->b(C)Z

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setChecked(Z)V

    .line 119
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/interest/InterestAndConcernActivity;->e:Landroid/widget/CheckBox;

    invoke-virtual {p1}, Lcom/huawei/hihealth/HiUserPreference;->getValue()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x3

    invoke-virtual {v1, v2}, Ljava/lang/String;->charAt(I)C

    move-result v1

    invoke-direct {p0, v1}, Lcom/huawei/ui/main/stories/me/activity/interest/InterestAndConcernActivity;->b(C)Z

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setChecked(Z)V

    .line 120
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/interest/InterestAndConcernActivity;->a:Landroid/widget/CheckBox;

    invoke-virtual {p1}, Lcom/huawei/hihealth/HiUserPreference;->getValue()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x4

    invoke-virtual {v1, v2}, Ljava/lang/String;->charAt(I)C

    move-result v1

    invoke-direct {p0, v1}, Lcom/huawei/ui/main/stories/me/activity/interest/InterestAndConcernActivity;->b(C)Z

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setChecked(Z)V

    .line 121
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/interest/InterestAndConcernActivity;->i:Landroid/widget/CheckBox;

    invoke-virtual {p1}, Lcom/huawei/hihealth/HiUserPreference;->getValue()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x5

    invoke-virtual {v1, v2}, Ljava/lang/String;->charAt(I)C

    move-result v1

    invoke-direct {p0, v1}, Lcom/huawei/ui/main/stories/me/activity/interest/InterestAndConcernActivity;->b(C)Z

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setChecked(Z)V

    .line 122
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/interest/InterestAndConcernActivity;->k:Landroid/widget/CheckBox;

    invoke-virtual {p1}, Lcom/huawei/hihealth/HiUserPreference;->getValue()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x6

    invoke-virtual {v1, v2}, Ljava/lang/String;->charAt(I)C

    move-result v1

    invoke-direct {p0, v1}, Lcom/huawei/ui/main/stories/me/activity/interest/InterestAndConcernActivity;->b(C)Z

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setChecked(Z)V

    .line 123
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/interest/InterestAndConcernActivity;->g:Landroid/widget/CheckBox;

    invoke-virtual {p1}, Lcom/huawei/hihealth/HiUserPreference;->getValue()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x7

    invoke-virtual {v1, v2}, Ljava/lang/String;->charAt(I)C

    move-result v1

    invoke-direct {p0, v1}, Lcom/huawei/ui/main/stories/me/activity/interest/InterestAndConcernActivity;->b(C)Z

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setChecked(Z)V

    .line 125
    :cond_0
    return-void
.end method

.method static synthetic c(Lcom/huawei/ui/main/stories/me/activity/interest/InterestAndConcernActivity;Lcom/huawei/hihealth/HiUserPreference;)V
    .locals 0

    .line 39
    invoke-direct {p0, p1}, Lcom/huawei/ui/main/stories/me/activity/interest/InterestAndConcernActivity;->c(Lcom/huawei/hihealth/HiUserPreference;)V

    return-void
.end method

.method static synthetic d(Lcom/huawei/ui/main/stories/me/activity/interest/InterestAndConcernActivity;)Ljava/lang/String;
    .locals 1

    .line 39
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/interest/InterestAndConcernActivity;->l:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic e(Lcom/huawei/ui/main/stories/me/activity/interest/InterestAndConcernActivity;)Landroid/os/Handler;
    .locals 1

    .line 39
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/interest/InterestAndConcernActivity;->u:Landroid/os/Handler;

    return-object v0
.end method

.method private e()V
    .locals 2

    .line 90
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/interest/InterestAndConcernActivity;->s:Ljava/util/concurrent/ExecutorService;

    if-eqz v0, :cond_0

    .line 91
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/interest/InterestAndConcernActivity;->s:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/huawei/ui/main/stories/me/activity/interest/InterestAndConcernActivity$4;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/me/activity/interest/InterestAndConcernActivity$4;-><init>(Lcom/huawei/ui/main/stories/me/activity/interest/InterestAndConcernActivity;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 102
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/interest/InterestAndConcernActivity;->h:Lo/emr;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/emr;->setRightButtonClickable(Z)V

    .line 103
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/interest/InterestAndConcernActivity;->h:Lo/emr;

    new-instance v1, Lcom/huawei/ui/main/stories/me/activity/interest/InterestAndConcernActivity$1;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/me/activity/interest/InterestAndConcernActivity$1;-><init>(Lcom/huawei/ui/main/stories/me/activity/interest/InterestAndConcernActivity;)V

    invoke-virtual {v0, v1}, Lo/emr;->setRightButtonOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 111
    return-void
.end method

.method private e(Landroid/widget/CompoundButton;Z)V
    .locals 4

    .line 159
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/interest/InterestAndConcernActivity;->b:Landroid/widget/CheckBox;

    if-ne p1, v0, :cond_1

    .line 160
    if-eqz p2, :cond_0

    .line 161
    const-string v0, "1"

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/interest/InterestAndConcernActivity;->p:Ljava/lang/String;

    .line 162
    const-string v0, "SMART_InterestAndConcernActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Interest_onCheckedChanged_mRunClick"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 164
    :cond_0
    const-string v0, "0"

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/interest/InterestAndConcernActivity;->p:Ljava/lang/String;

    .line 167
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/interest/InterestAndConcernActivity;->d:Landroid/widget/CheckBox;

    if-ne p1, v0, :cond_3

    .line 168
    if-eqz p2, :cond_2

    .line 169
    const-string v0, "1"

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/interest/InterestAndConcernActivity;->l:Ljava/lang/String;

    goto :goto_1

    .line 171
    :cond_2
    const-string v0, "0"

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/interest/InterestAndConcernActivity;->l:Ljava/lang/String;

    .line 174
    :cond_3
    :goto_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/interest/InterestAndConcernActivity;->c:Landroid/widget/CheckBox;

    if-ne p1, v0, :cond_5

    .line 175
    if-eqz p2, :cond_4

    .line 176
    const-string v0, "1"

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/interest/InterestAndConcernActivity;->o:Ljava/lang/String;

    goto :goto_2

    .line 178
    :cond_4
    const-string v0, "0"

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/interest/InterestAndConcernActivity;->o:Ljava/lang/String;

    .line 181
    :cond_5
    :goto_2
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/interest/InterestAndConcernActivity;->e:Landroid/widget/CheckBox;

    if-ne p1, v0, :cond_7

    .line 182
    if-eqz p2, :cond_6

    .line 183
    const-string v0, "1"

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/interest/InterestAndConcernActivity;->n:Ljava/lang/String;

    goto :goto_3

    .line 185
    :cond_6
    const-string v0, "0"

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/interest/InterestAndConcernActivity;->n:Ljava/lang/String;

    .line 188
    :cond_7
    :goto_3
    return-void
.end method

.method static synthetic f(Lcom/huawei/ui/main/stories/me/activity/interest/InterestAndConcernActivity;)Ljava/lang/String;
    .locals 1

    .line 39
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/interest/InterestAndConcernActivity;->m:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic g(Lcom/huawei/ui/main/stories/me/activity/interest/InterestAndConcernActivity;)Ljava/lang/String;
    .locals 1

    .line 39
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/interest/InterestAndConcernActivity;->n:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic h(Lcom/huawei/ui/main/stories/me/activity/interest/InterestAndConcernActivity;)Ljava/lang/String;
    .locals 1

    .line 39
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/interest/InterestAndConcernActivity;->o:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic i(Lcom/huawei/ui/main/stories/me/activity/interest/InterestAndConcernActivity;)Ljava/lang/String;
    .locals 1

    .line 39
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/interest/InterestAndConcernActivity;->t:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic k(Lcom/huawei/ui/main/stories/me/activity/interest/InterestAndConcernActivity;)Ljava/lang/String;
    .locals 1

    .line 39
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/interest/InterestAndConcernActivity;->r:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic p(Lcom/huawei/ui/main/stories/me/activity/interest/InterestAndConcernActivity;)Ljava/lang/String;
    .locals 1

    .line 39
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/interest/InterestAndConcernActivity;->q:Ljava/lang/String;

    return-object v0
.end method


# virtual methods
.method public onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 4

    .line 222
    const-string v0, "SMART_InterestAndConcernActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Interest_onCheckedChanged_in"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 223
    invoke-direct {p0, p1, p2}, Lcom/huawei/ui/main/stories/me/activity/interest/InterestAndConcernActivity;->e(Landroid/widget/CompoundButton;Z)V

    .line 224
    invoke-direct {p0, p1, p2}, Lcom/huawei/ui/main/stories/me/activity/interest/InterestAndConcernActivity;->b(Landroid/widget/CompoundButton;Z)V

    .line 225
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 54
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 55
    iput-object p0, p0, Lcom/huawei/ui/main/stories/me/activity/interest/InterestAndConcernActivity;->f:Landroid/content/Context;

    .line 56
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/interest/InterestAndConcernActivity;->s:Ljava/util/concurrent/ExecutorService;

    .line 57
    sget v0, Lcom/huawei/ui/main/R$layout;->hw_health_interest_and_concern_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/interest/InterestAndConcernActivity;->setContentView(I)V

    .line 58
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/me/activity/interest/InterestAndConcernActivity;->b()V

    .line 59
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/me/activity/interest/InterestAndConcernActivity;->e()V

    .line 60
    return-void
.end method

.method public onDestroy()V
    .locals 1

    .line 229
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onDestroy()V

    .line 230
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/interest/InterestAndConcernActivity;->s:Ljava/util/concurrent/ExecutorService;

    if-eqz v0, :cond_0

    .line 231
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/interest/InterestAndConcernActivity;->s:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 233
    :cond_0
    return-void
.end method
