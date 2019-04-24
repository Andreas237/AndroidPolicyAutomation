.class public Lcom/huawei/health/sns/ui/group/HealthEventShareActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"


# instance fields
.field private a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Landroid/support/v4/app/Fragment;>;"
        }
    .end annotation
.end field

.field private b:Landroid/widget/RelativeLayout;

.field private c:Landroid/support/v4/view/ViewPager;

.field d:Lo/dav;

.field private e:Lo/egd;

.field private f:Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;

.field private g:Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;

.field private h:Landroid/app/Activity;

.field private i:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lcom/huawei/health/sns/model/group/GroupMember;>;"
        }
    .end annotation
.end field

.field private k:Lcom/huawei/health/sns/model/group/Group;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 60
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    .line 70
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventShareActivity;->c:Landroid/support/v4/view/ViewPager;

    .line 74
    new-instance v0, Lo/dav;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lo/dav;-><init>(I)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventShareActivity;->d:Lo/dav;

    .line 78
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventShareActivity;->i:Ljava/util/ArrayList;

    return-void
.end method

.method private a(Landroid/content/Context;F)I
    .locals 3

    .line 176
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v2, v0, Landroid/util/DisplayMetrics;->density:F

    .line 177
    mul-float v0, p2, v2

    const/high16 v1, 0x3f000000    # 0.5f

    add-float/2addr v0, v1

    float-to-int v0, v0

    return v0
.end method

.method static synthetic a(Lcom/huawei/health/sns/ui/group/HealthEventShareActivity;)Landroid/support/v4/view/ViewPager;
    .locals 1

    .line 60
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventShareActivity;->c:Landroid/support/v4/view/ViewPager;

    return-object v0
.end method

.method private a()V
    .locals 5

    .line 136
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/HealthEventShareActivity;->getIntent()Landroid/content/Intent;

    move-result-object v4

    .line 138
    if-eqz v4, :cond_4

    .line 139
    const-string v0, "group"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/sns/model/group/Group;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventShareActivity;->k:Lcom/huawei/health/sns/model/group/Group;

    .line 140
    const-string v0, "activityRank"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 141
    const-string v0, "activityRank"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventShareActivity;->g:Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;

    .line 143
    :cond_0
    const-string v0, "EXTRA_GROUP_ACTIVITY_DETAIL"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 144
    const-string v0, "EXTRA_GROUP_ACTIVITY_DETAIL"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventShareActivity;->f:Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;

    .line 147
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventShareActivity;->k:Lcom/huawei/health/sns/model/group/Group;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventShareActivity;->g:Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventShareActivity;->f:Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;

    if-nez v0, :cond_3

    .line 148
    :cond_2
    const-string v0, "HealthEventShareActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "group or groupUserRank or groupActivity is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 149
    return-void

    .line 151
    :cond_3
    const-string v0, "HealthEventShareActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initData() group = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/health/sns/ui/group/HealthEventShareActivity;->k:Lcom/huawei/health/sns/model/group/Group;

    invoke-virtual {v2}, Lcom/huawei/health/sns/model/group/Group;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 152
    const-string v0, "HealthEventShareActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initData() groupUserRank = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/health/sns/ui/group/HealthEventShareActivity;->g:Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;

    invoke-virtual {v2}, Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 153
    const-string v0, "HealthEventShareActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initData() groupActivity = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/health/sns/ui/group/HealthEventShareActivity;->f:Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;

    invoke-virtual {v2}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 154
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthEventShareActivity;->b()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventShareActivity;->a:Ljava/util/List;

    .line 155
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventShareActivity;->c:Landroid/support/v4/view/ViewPager;

    new-instance v1, Lcom/huawei/health/sns/ui/group/HealthEventShareActivity$3;

    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/HealthEventShareActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v2

    invoke-direct {v1, p0, v2}, Lcom/huawei/health/sns/ui/group/HealthEventShareActivity$3;-><init>(Lcom/huawei/health/sns/ui/group/HealthEventShareActivity;Landroid/support/v4/app/FragmentManager;)V

    invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->setAdapter(Landroid/support/v4/view/PagerAdapter;)V

    .line 167
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventShareActivity;->c:Landroid/support/v4/view/ViewPager;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->setCurrentItem(I)V

    goto :goto_0

    .line 170
    :cond_4
    const-string v0, "HealthEventShareActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "intent is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 171
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/HealthEventShareActivity;->finish()V

    .line 172
    return-void

    .line 174
    :goto_0
    return-void
.end method

.method static synthetic b(Lcom/huawei/health/sns/ui/group/HealthEventShareActivity;)Landroid/app/Activity;
    .locals 1

    .line 60
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventShareActivity;->h:Landroid/app/Activity;

    return-object v0
.end method

.method private b()Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Landroid/support/v4/app/Fragment;>;"
        }
    .end annotation

    .line 126
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 127
    new-instance v4, Landroid/os/Bundle;

    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    .line 129
    new-instance v5, Lcom/huawei/health/sns/ui/group/HealthEventShareFragment;

    invoke-direct {v5}, Lcom/huawei/health/sns/ui/group/HealthEventShareFragment;-><init>()V

    .line 130
    invoke-virtual {v5, v4}, Lcom/huawei/health/sns/ui/group/HealthEventShareFragment;->setArguments(Landroid/os/Bundle;)V

    .line 131
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventShareActivity;->k:Lcom/huawei/health/sns/model/group/Group;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthEventShareActivity;->g:Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;

    iget-object v2, p0, Lcom/huawei/health/sns/ui/group/HealthEventShareActivity;->f:Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;

    invoke-virtual {v5, v0, v1, v2}, Lcom/huawei/health/sns/ui/group/HealthEventShareFragment;->a(Lcom/huawei/health/sns/model/group/Group;Lcom/huawei/health/sns/ui/group/healthbeans/GroupUserRank;Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;)V

    .line 132
    invoke-interface {v3, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 133
    return-object v3
.end method

.method static synthetic c(Lcom/huawei/health/sns/ui/group/HealthEventShareActivity;)Ljava/util/List;
    .locals 1

    .line 60
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventShareActivity;->a:Ljava/util/List;

    return-object v0
.end method


# virtual methods
.method protected d()V
    .locals 5

    .line 93
    sget v0, Lcom/huawei/android/sns/R$id;->health_event_share_content:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthEventShareActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventShareActivity;->b:Landroid/widget/RelativeLayout;

    .line 94
    sget v0, Lcom/huawei/android/sns/R$id;->health_event_share_viewpager:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthEventShareActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v4/view/ViewPager;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventShareActivity;->c:Landroid/support/v4/view/ViewPager;

    .line 96
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventShareActivity;->h:Landroid/app/Activity;

    invoke-static {v0}, Lo/ene;->t(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 97
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventShareActivity;->b:Landroid/widget/RelativeLayout;

    invoke-virtual {v0}, Landroid/widget/RelativeLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v4

    .line 98
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventShareActivity;->h:Landroid/app/Activity;

    const/high16 v1, 0x43b40000    # 360.0f

    invoke-direct {p0, v0, v1}, Lcom/huawei/health/sns/ui/group/HealthEventShareActivity;->a(Landroid/content/Context;F)I

    move-result v0

    iput v0, v4, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 99
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventShareActivity;->b:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v4}, Landroid/widget/RelativeLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 100
    const-string v0, "HealthEventShareActivity"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "SocialMessageHodler width = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget v2, v4, Landroid/view/ViewGroup$LayoutParams;->width:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ", height = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget v2, v4, Landroid/view/ViewGroup$LayoutParams;->height:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 102
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventShareActivity;->c:Landroid/support/v4/view/ViewPager;

    const v1, 0x3f4ccccd    # 0.8f

    invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->setScaleY(F)V

    .line 103
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventShareActivity;->c:Landroid/support/v4/view/ViewPager;

    const v1, 0x3f4ccccd    # 0.8f

    invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->setScaleX(F)V

    .line 104
    sget v0, Lcom/huawei/android/sns/R$id;->health_event_share_btn:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthEventShareActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventShareActivity;->e:Lo/egd;

    .line 105
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventShareActivity;->e:Lo/egd;

    new-instance v1, Lcom/huawei/health/sns/ui/group/HealthEventShareActivity$2;

    invoke-direct {v1, p0}, Lcom/huawei/health/sns/ui/group/HealthEventShareActivity$2;-><init>(Lcom/huawei/health/sns/ui/group/HealthEventShareActivity;)V

    invoke-virtual {v0, v1}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 123
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 86
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 87
    iput-object p0, p0, Lcom/huawei/health/sns/ui/group/HealthEventShareActivity;->h:Landroid/app/Activity;

    .line 88
    sget v0, Lcom/huawei/android/sns/R$layout;->activity_health_event_share:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthEventShareActivity;->setContentView(I)V

    .line 89
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/HealthEventShareActivity;->d()V

    .line 90
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthEventShareActivity;->a()V

    .line 91
    return-void
.end method
