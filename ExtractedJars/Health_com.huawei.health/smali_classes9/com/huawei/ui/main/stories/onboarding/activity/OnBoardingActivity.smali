.class public Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"

# interfaces
.implements Landroid/support/v4/view/ViewPager$OnPageChangeListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity$e;,
        Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity$d;,
        Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity$b;,
        Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity$a;,
        Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity$c;
    }
.end annotation


# instance fields
.field private A:Landroid/widget/RelativeLayout;

.field private B:Landroid/widget/LinearLayout;

.field private C:Landroid/widget/LinearLayout;

.field private D:Landroid/widget/LinearLayout;

.field private E:Landroid/widget/RelativeLayout;

.field private F:Landroid/widget/ImageView;

.field private G:Landroid/widget/ImageView;

.field private H:Landroid/widget/ImageView;

.field private I:Landroid/widget/ImageView;

.field private J:Landroid/widget/ImageView;

.field private K:Landroid/widget/ImageView;

.field private L:Landroid/widget/ImageView;

.field private M:Landroid/widget/ImageView;

.field private N:Landroid/widget/ImageView;

.field private O:Landroid/widget/ImageView;

.field private P:Landroid/widget/ImageView;

.field private Q:Lo/egw;

.field private R:Landroid/widget/ImageView;

.field private S:Landroid/widget/ImageView;

.field private T:Landroid/widget/TextView;

.field private U:Landroid/widget/TextView;

.field private V:Landroid/widget/TextView;

.field private W:Landroid/widget/TextView;

.field private X:Landroid/widget/TextView;

.field private Y:Landroid/widget/TextView;

.field private Z:Landroid/widget/ImageView;

.field private a:Lo/fhi;

.field private aa:Landroid/widget/TextView;

.field private ab:Landroid/widget/TextView;

.field private ac:Landroid/widget/ImageView;

.field private ad:I

.field private ae:I

.field private af:Lo/emr;

.field private ag:I

.field private ah:I

.field private final ai:I

.field private final aj:I

.field private final ak:I

.field private al:Landroid/os/Handler;

.field private final am:I

.field private an:Ljava/lang/String;

.field private ap:Ljava/lang/String;

.field private aq:Ljava/util/concurrent/ExecutorService;

.field private ar:Ljava/lang/String;

.field private final b:I

.field private c:Lcom/huawei/up/model/UserInfomation;

.field public d:Landroid/content/Context;

.field private e:Lo/fhe;

.field private f:Z

.field private g:Z

.field private h:Z

.field private i:Z

.field private j:Landroid/widget/LinearLayout;

.field private final k:I

.field private l:Z

.field private m:Z

.field private n:Z

.field private o:Z

.field private p:Z

.field private q:Ljava/lang/String;

.field private r:Ljava/lang/String;

.field private s:Z

.field private t:Lo/fhb;

.field private u:Z

.field private v:Landroid/widget/LinearLayout;

.field private w:Landroid/widget/LinearLayout;

.field private x:Landroid/widget/LinearLayout;

.field private y:Lo/fhj;

.field private z:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Landroid/view/View;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 61
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    .line 75
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->b:I

    const/4 v0, 0x1

    iput v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->k:I

    .line 76
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->g:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->h:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->i:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->f:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->p:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->l:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->m:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->n:Z

    .line 78
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->o:Z

    .line 79
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->u:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->s:Z

    .line 119
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->aj:I

    const/4 v0, 0x1

    iput v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->ak:I

    const/4 v0, 0x2

    iput v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->am:I

    const/4 v0, 0x3

    iput v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->ai:I

    .line 127
    new-instance v0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity$c;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity$c;-><init>(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->al:Landroid/os/Handler;

    .line 130
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->an:Ljava/lang/String;

    .line 131
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->ar:Ljava/lang/String;

    .line 132
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->ap:Ljava/lang/String;

    return-void
.end method

.method static synthetic A(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;)Landroid/widget/LinearLayout;
    .locals 1

    .line 61
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->B:Landroid/widget/LinearLayout;

    return-object v0
.end method

.method static synthetic B(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;)V
    .locals 0

    .line 61
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->l()V

    return-void
.end method

.method static synthetic C(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;)Landroid/widget/LinearLayout;
    .locals 1

    .line 61
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->C:Landroid/widget/LinearLayout;

    return-object v0
.end method

.method static synthetic D(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;)Z
    .locals 1

    .line 61
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->s:Z

    return v0
.end method

.method static synthetic E(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;)Landroid/widget/TextView;
    .locals 1

    .line 61
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->W:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic F(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;)Landroid/widget/ImageView;
    .locals 1

    .line 61
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->I:Landroid/widget/ImageView;

    return-object v0
.end method

.method static synthetic G(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;)Lcom/huawei/up/model/UserInfomation;
    .locals 1

    .line 61
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->c:Lcom/huawei/up/model/UserInfomation;

    return-object v0
.end method

.method static synthetic H(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;)Landroid/widget/ImageView;
    .locals 1

    .line 61
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->G:Landroid/widget/ImageView;

    return-object v0
.end method

.method static synthetic I(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;)Landroid/widget/ImageView;
    .locals 1

    .line 61
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->F:Landroid/widget/ImageView;

    return-object v0
.end method

.method static synthetic J(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;)Ljava/lang/String;
    .locals 1

    .line 61
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->q:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic K(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;)I
    .locals 1

    .line 61
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->i()I

    move-result v0

    return v0
.end method

.method static synthetic L(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;)Landroid/widget/TextView;
    .locals 1

    .line 61
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->T:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic M(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;)F
    .locals 1

    .line 61
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->k()F

    move-result v0

    return v0
.end method

.method static synthetic N(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;)Landroid/widget/TextView;
    .locals 1

    .line 61
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->aa:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic O(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;)Lo/egw;
    .locals 1

    .line 61
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->Q:Lo/egw;

    return-object v0
.end method

.method static synthetic P(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;)Z
    .locals 1

    .line 61
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->u:Z

    return v0
.end method

.method static synthetic Q(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;)I
    .locals 1

    .line 61
    iget v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->ae:I

    return v0
.end method

.method static synthetic R(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;)I
    .locals 1

    .line 61
    iget v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->ad:I

    return v0
.end method

.method static synthetic S(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;)I
    .locals 1

    .line 61
    iget v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->ah:I

    return v0
.end method

.method static synthetic T(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;)Landroid/widget/TextView;
    .locals 1

    .line 61
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->V:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic V(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;)Landroid/widget/ImageView;
    .locals 1

    .line 61
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->M:Landroid/widget/ImageView;

    return-object v0
.end method

.method static synthetic a(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;I)I
    .locals 0

    .line 61
    iput p1, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->ae:I

    return p1
.end method

.method static synthetic a(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;)Landroid/widget/ImageView;
    .locals 1

    .line 61
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->L:Landroid/widget/ImageView;

    return-object v0
.end method

.method private a()V
    .locals 1

    .line 246
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/dnm;->a(Landroid/content/Context;)Lo/dnm;

    move-result-object v0

    invoke-virtual {v0}, Lo/dnm;->i()Lcom/huawei/up/model/UserInfomation;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->c:Lcom/huawei/up/model/UserInfomation;

    .line 247
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->b()V

    .line 248
    return-void
.end method

.method private a(I)V
    .locals 10

    .line 949
    new-instance v5, Lo/egw$c;

    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->d:Landroid/content/Context;

    invoke-direct {v5, v0}, Lo/egw$c;-><init>(Landroid/content/Context;)V

    .line 951
    const-string v7, ""

    .line 952
    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    .line 953
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hw_health_show_healthdata_weight:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->getString(I)Ljava/lang/String;

    move-result-object v7

    goto :goto_0

    .line 955
    :cond_0
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hw_show_set_height:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->getString(I)Ljava/lang/String;

    move-result-object v7

    .line 957
    :goto_0
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$layout;->health_healthdata_userinfo_dialog_set_v9:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Landroid/widget/RelativeLayout;

    .line 958
    sget v0, Lcom/huawei/ui/main/R$id;->hw_health_dialog_tips:I

    invoke-virtual {v6, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->ab:Landroid/widget/TextView;

    .line 959
    sget v0, Lcom/huawei/ui/main/R$id;->userinfo_number_picker_v9:I

    invoke-virtual {v6, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lo/elk;

    .line 961
    const/4 v0, 0x1

    if-ne v0, p1, :cond_4

    .line 962
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->ab:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hwh_user_data_weight_tips:I

    invoke-virtual {p0, v1}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 963
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->m()Ljava/util/ArrayList;

    move-result-object v9

    .line 964
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    move-result v0

    new-array v0, v0, [Ljava/lang/String;

    invoke-virtual {v9, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    check-cast v0, [Ljava/lang/String;

    invoke-virtual {v8, v0}, Lo/elk;->setDisplayedValues([Ljava/lang/String;)V

    .line 965
    const/4 v0, 0x0

    invoke-virtual {v8, v0}, Lo/elk;->setMinValue(I)V

    .line 966
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {v8, v0}, Lo/elk;->setMaxValue(I)V

    .line 968
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 969
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->c:Lcom/huawei/up/model/UserInfomation;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->c:Lcom/huawei/up/model/UserInfomation;

    invoke-virtual {v0}, Lcom/huawei/up/model/UserInfomation;->getWeight()F

    move-result v0

    float-to-double v0, v0

    invoke-static {v0, v1}, Lo/cxh;->e(D)D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Math;->round(D)J

    move-result-wide v0

    long-to-int v0, v0

    const-wide/high16 v1, 0x4024000000000000L    # 10.0

    invoke-static {v1, v2}, Lo/cxh;->e(D)D

    move-result-wide v1

    double-to-int v1, v1

    if-lt v0, v1, :cond_1

    .line 970
    const-string v0, "SMART_OnBoardingActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "LB mUserInfomation.getHeight()="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->c:Lcom/huawei/up/model/UserInfomation;

    invoke-virtual {v2}, Lcom/huawei/up/model/UserInfomation;->getWeight()F

    move-result v2

    const/high16 v3, 0x41200000    # 10.0f

    sub-float/2addr v2, v3

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 971
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->c:Lcom/huawei/up/model/UserInfomation;

    invoke-virtual {v0}, Lcom/huawei/up/model/UserInfomation;->getWeight()F

    move-result v0

    float-to-double v0, v0

    invoke-static {v0, v1}, Lo/cxh;->e(D)D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Math;->round(D)J

    move-result-wide v0

    long-to-int v0, v0

    const-wide/high16 v1, 0x4024000000000000L    # 10.0

    invoke-static {v1, v2}, Lo/cxh;->e(D)D

    move-result-wide v1

    double-to-int v1, v1

    sub-int/2addr v0, v1

    invoke-virtual {v8, v0}, Lo/elk;->setValue(I)V

    goto/16 :goto_1

    .line 973
    :cond_1
    const-wide v0, 0x4051800000000000L    # 70.0

    invoke-static {v0, v1}, Lo/cxh;->e(D)D

    move-result-wide v0

    double-to-int v0, v0

    invoke-virtual {v8, v0}, Lo/elk;->setValue(I)V

    goto/16 :goto_1

    .line 976
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->c:Lcom/huawei/up/model/UserInfomation;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->c:Lcom/huawei/up/model/UserInfomation;

    invoke-virtual {v0}, Lcom/huawei/up/model/UserInfomation;->getWeight()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    const/16 v1, 0xa

    if-lt v0, v1, :cond_3

    .line 977
    const-string v0, "SMART_OnBoardingActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mUserInfomation.getHeight()="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->c:Lcom/huawei/up/model/UserInfomation;

    invoke-virtual {v2}, Lcom/huawei/up/model/UserInfomation;->getWeight()F

    move-result v2

    const/high16 v3, 0x41200000    # 10.0f

    sub-float/2addr v2, v3

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 978
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->c:Lcom/huawei/up/model/UserInfomation;

    invoke-virtual {v0}, Lcom/huawei/up/model/UserInfomation;->getWeight()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    add-int/lit8 v0, v0, -0xa

    invoke-virtual {v8, v0}, Lo/elk;->setValue(I)V

    goto/16 :goto_1

    .line 980
    :cond_3
    const/16 v0, 0x46

    invoke-virtual {v8, v0}, Lo/elk;->setValue(I)V

    goto/16 :goto_1

    .line 984
    :cond_4
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->ab:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hwh_user_data_height_tips:I

    invoke-virtual {p0, v1}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 985
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->s()Ljava/util/ArrayList;

    move-result-object v9

    .line 986
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    move-result v0

    new-array v0, v0, [Ljava/lang/String;

    invoke-virtual {v9, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    check-cast v0, [Ljava/lang/String;

    invoke-virtual {v8, v0}, Lo/elk;->setDisplayedValues([Ljava/lang/String;)V

    .line 987
    const/4 v0, 0x0

    invoke-virtual {v8, v0}, Lo/elk;->setMinValue(I)V

    .line 988
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {v8, v0}, Lo/elk;->setMaxValue(I)V

    .line 989
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->c:Lcom/huawei/up/model/UserInfomation;

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->c:Lcom/huawei/up/model/UserInfomation;

    invoke-virtual {v0}, Lcom/huawei/up/model/UserInfomation;->getHeight()I

    move-result v0

    const/16 v1, 0x32

    if-lt v0, v1, :cond_5

    .line 990
    const-string v0, "SMART_OnBoardingActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mUserInfomation.getHeight()="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->c:Lcom/huawei/up/model/UserInfomation;

    invoke-virtual {v2}, Lcom/huawei/up/model/UserInfomation;->getHeight()I

    move-result v2

    add-int/lit8 v2, v2, -0x32

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 991
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->c:Lcom/huawei/up/model/UserInfomation;

    invoke-virtual {v0}, Lcom/huawei/up/model/UserInfomation;->getHeight()I

    move-result v0

    add-int/lit8 v0, v0, -0x32

    invoke-virtual {v8, v0}, Lo/elk;->setValue(I)V

    goto :goto_1

    .line 993
    :cond_5
    const/16 v0, 0x6e

    invoke-virtual {v8, v0}, Lo/elk;->setValue(I)V

    .line 997
    :goto_1
    invoke-virtual {v5, v7}, Lo/egw$c;->a(Ljava/lang/String;)Lo/egw$c;

    move-result-object v0

    .line 998
    invoke-virtual {v0, v6}, Lo/egw$c;->e(Landroid/view/View;)Lo/egw$c;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_common_ui_dialog_confirm:I

    new-instance v2, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity$8;

    invoke-direct {v2, p0, p1, v8}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity$8;-><init>(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;ILo/elk;)V

    .line 999
    invoke-virtual {v0, v1, v2}, Lo/egw$c;->b(ILandroid/view/View$OnClickListener;)Lo/egw$c;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_cancel:I

    new-instance v2, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity$7;

    invoke-direct {v2, p0}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity$7;-><init>(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;)V

    .line 1017
    invoke-virtual {v0, v1, v2}, Lo/egw$c;->c(ILandroid/view/View$OnClickListener;)Lo/egw$c;

    .line 1024
    invoke-virtual {v5}, Lo/egw$c;->e()Lo/egw;

    move-result-object v4

    .line 1025
    invoke-virtual {v4}, Lo/egw;->show()V

    .line 1027
    return-void
.end method

.method private a(Lcom/huawei/hihealth/HiUserPreference;)V
    .locals 3

    .line 374
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiUserPreference;->getValue()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v0

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->a(C)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 375
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->g:Z

    .line 376
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->L:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->d:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$drawable;->hw_health_onboarding_run_on:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 378
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiUserPreference;->getValue()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v0

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->a(C)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 379
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->i:Z

    .line 380
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->K:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->d:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$drawable;->hw_health_onboarding_ride_on:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 382
    :cond_1
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiUserPreference;->getValue()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v0

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->a(C)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 383
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->h:Z

    .line 384
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->J:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->d:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$drawable;->hw_health_onboarding_walk_on:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 386
    :cond_2
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiUserPreference;->getValue()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v0

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->a(C)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 387
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->f:Z

    .line 388
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->N:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->d:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$drawable;->hw_health_onboarding_build_on:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 390
    :cond_3
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiUserPreference;->getValue()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v0

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->a(C)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 391
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->p:Z

    .line 392
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->R:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->d:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$drawable;->hw_health_onboarding_weight_on:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 394
    :cond_4
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiUserPreference;->getValue()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x5

    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v0

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->a(C)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 395
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->m:Z

    .line 396
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->S:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->d:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$drawable;->hw_health_onboarding_sleep_on:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 398
    :cond_5
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiUserPreference;->getValue()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x6

    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v0

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->a(C)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 399
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->l:Z

    .line 400
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->P:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->d:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$drawable;->hw_health_onboarding_bloodpressure_on:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 402
    :cond_6
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiUserPreference;->getValue()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x7

    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v0

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->a(C)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 403
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->n:Z

    .line 404
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->O:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->d:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$drawable;->hw_health_onboarding_bloodsugar_on:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 407
    :cond_7
    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;II)V
    .locals 0

    .line 61
    invoke-direct {p0, p1, p2}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->b(II)V

    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;Z)V
    .locals 0

    .line 61
    invoke-direct {p0, p1}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->d(Z)V

    return-void
.end method

.method private a(C)Z
    .locals 1

    .line 410
    const/16 v0, 0x31

    if-ne p1, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method static synthetic b(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;)Lo/fhe;
    .locals 1

    .line 61
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->e:Lo/fhe;

    return-object v0
.end method

.method private b()V
    .locals 7

    .line 272
    const-string v0, "SMART_OnBoardingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "refreshGenderBirth"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 273
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->c:Lcom/huawei/up/model/UserInfomation;

    if-nez v0, :cond_0

    .line 274
    const-string v0, "SMART_OnBoardingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "refreshGenderBirth mUserInfomation is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 275
    return-void

    .line 277
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->c:Lcom/huawei/up/model/UserInfomation;

    invoke-virtual {v0}, Lcom/huawei/up/model/UserInfomation;->getName()Ljava/lang/String;

    move-result-object v4

    .line 278
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->c:Lcom/huawei/up/model/UserInfomation;

    invoke-virtual {v0}, Lcom/huawei/up/model/UserInfomation;->getBirthday()Ljava/lang/String;

    move-result-object v5

    .line 279
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->c:Lcom/huawei/up/model/UserInfomation;

    invoke-virtual {v0}, Lcom/huawei/up/model/UserInfomation;->getGender()I

    move-result v6

    .line 281
    const-string v0, "SMART_OnBoardingActivity"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "refreshGenderBirth mHwUserInfo name "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    const-string v2, " birth "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aput-object v5, v1, v2

    const-string v2, " gender "

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 283
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->U:Landroid/widget/TextView;

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 285
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 286
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->s:Z

    .line 287
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->V:Landroid/widget/TextView;

    invoke-direct {p0, v5}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 288
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->M:Landroid/widget/ImageView;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$drawable;->hw_health_onboarding_birthday_on:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 289
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->b(Z)V

    goto :goto_0

    .line 291
    :cond_1
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->s:Z

    .line 292
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->M:Landroid/widget/ImageView;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$drawable;->hw_health_onboarding_birthday_off:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 293
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->b(Z)V

    .line 296
    :goto_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->u:Z

    .line 297
    const/4 v0, 0x0

    if-ne v0, v6, :cond_2

    .line 298
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->F:Landroid/widget/ImageView;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$drawable;->hw_health_onboarding_gender_on:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 299
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->W:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->r:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_1

    .line 300
    :cond_2
    const/4 v0, 0x1

    if-ne v0, v6, :cond_3

    .line 301
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->F:Landroid/widget/ImageView;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$drawable;->hw_health_onboarding_gender_girl_on:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 302
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->W:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->q:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_1

    .line 304
    :cond_3
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->u:Z

    .line 305
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->b(Z)V

    .line 306
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->W:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_show_set_gender:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 307
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->F:Landroid/widget/ImageView;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$drawable;->hw_health_onboarding_gender_off:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 311
    :goto_1
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->g()V

    .line 313
    const-string v0, "SMART_OnBoardingActivity"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "refresh_account_data"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    const/4 v2, 0x2

    aput-object v5, v1, v2

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 314
    return-void
.end method

.method private b(II)V
    .locals 6

    .line 435
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->c:Lcom/huawei/up/model/UserInfomation;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 436
    const-string v0, "SMART_OnBoardingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mHiUserInfo is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 437
    return-void

    .line 439
    :cond_0
    const/4 v0, 0x1

    if-ne p2, v0, :cond_1

    .line 440
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->c:Lcom/huawei/up/model/UserInfomation;

    int-to-float v1, p1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/up/model/UserInfomation;->setWeight(Ljava/lang/Float;)V

    .line 441
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->e:Lo/fhe;

    sget-object v1, Lo/dae;->dz:Lo/dae;

    invoke-virtual {v1}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v1

    const-string v2, "2"

    iget-object v3, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->c:Lcom/huawei/up/model/UserInfomation;

    invoke-virtual {v0, v1, v2, v3}, Lo/fhe;->a(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/up/model/UserInfomation;)V

    goto/16 :goto_2

    .line 442
    :cond_1
    if-nez p2, :cond_2

    .line 443
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->c:Lcom/huawei/up/model/UserInfomation;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/up/model/UserInfomation;->setHeight(Ljava/lang/Integer;)V

    .line 444
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->e:Lo/fhe;

    sget-object v1, Lo/dae;->dz:Lo/dae;

    invoke-virtual {v1}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v1

    const-string v2, "1"

    iget-object v3, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->c:Lcom/huawei/up/model/UserInfomation;

    invoke-virtual {v0, v1, v2, v3}, Lo/fhe;->a(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/up/model/UserInfomation;)V

    goto/16 :goto_2

    .line 445
    :cond_2
    const/4 v0, 0x2

    if-ne p2, v0, :cond_5

    .line 446
    const-string v0, "SMART_OnBoardingActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "gender=="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 447
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->c:Lcom/huawei/up/model/UserInfomation;

    if-nez p1, :cond_3

    const/4 v1, 0x1

    goto :goto_0

    :cond_3
    const/4 v1, 0x0

    :goto_0
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/up/model/UserInfomation;->setGender(Ljava/lang/Integer;)V

    .line 448
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->d:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "hw_health_gender_value"

    if-nez p1, :cond_4

    const/4 v3, 0x1

    goto :goto_1

    :cond_4
    const/4 v3, 0x0

    .line 449
    :goto_1
    invoke-static {v3}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lo/dcy;

    const/4 v5, 0x1

    invoke-direct {v4, v5}, Lo/dcy;-><init>(I)V

    .line 448
    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 450
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->e:Lo/fhe;

    sget-object v1, Lo/dae;->dz:Lo/dae;

    invoke-virtual {v1}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v1

    const-string v2, "3"

    iget-object v3, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->c:Lcom/huawei/up/model/UserInfomation;

    invoke-virtual {v0, v1, v2, v3}, Lo/fhe;->a(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/up/model/UserInfomation;)V

    goto :goto_2

    .line 451
    :cond_5
    const/4 v0, 0x3

    if-ne p2, v0, :cond_6

    .line 452
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->c:Lcom/huawei/up/model/UserInfomation;

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/up/model/UserInfomation;->setBirthday(Ljava/lang/String;)V

    .line 453
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->e:Lo/fhe;

    sget-object v1, Lo/dae;->dz:Lo/dae;

    invoke-virtual {v1}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v1

    const-string v2, "4"

    iget-object v3, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->c:Lcom/huawei/up/model/UserInfomation;

    invoke-virtual {v0, v1, v2, v3}, Lo/fhe;->a(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/up/model/UserInfomation;)V

    .line 456
    :cond_6
    :goto_2
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->c:Lcom/huawei/up/model/UserInfomation;

    const-string v1, ""

    invoke-virtual {v0, v1}, Lcom/huawei/up/model/UserInfomation;->setPortraitUrl(Ljava/lang/String;)V

    .line 457
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->c:Lcom/huawei/up/model/UserInfomation;

    const-string v1, ""

    invoke-virtual {v0, v1}, Lcom/huawei/up/model/UserInfomation;->setPicPath(Ljava/lang/String;)V

    .line 458
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->d:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dnm;->a(Landroid/content/Context;)Lo/dnm;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->d:Landroid/content/Context;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->c:Lcom/huawei/up/model/UserInfomation;

    new-instance v3, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity$2;

    invoke-direct {v3, p0}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity$2;-><init>(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;)V

    invoke-virtual {v0, v1, v2, v3}, Lo/dnm;->c(Landroid/content/Context;Lcom/huawei/up/model/UserInfomation;Lo/cyx;)V

    .line 464
    return-void
.end method

.method static synthetic b(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;I)V
    .locals 0

    .line 61
    invoke-direct {p0, p1}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->a(I)V

    return-void
.end method

.method private b(Ljava/lang/StringBuilder;ZI)V
    .locals 1

    .line 480
    if-eqz p2, :cond_0

    const/16 v0, 0x31

    goto :goto_0

    :cond_0
    const/16 v0, 0x30

    :goto_0
    invoke-virtual {p1, p3, v0}, Ljava/lang/StringBuilder;->setCharAt(IC)V

    .line 481
    return-void
.end method

.method private b(Z)V
    .locals 5

    .line 716
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->a:Lo/fhi;

    invoke-virtual {v0, p1}, Lo/fhi;->setScroll(Z)V

    .line 717
    if-eqz p1, :cond_0

    .line 718
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->o:Z

    .line 719
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->e:Lo/fhe;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->ac:Landroid/widget/ImageView;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->d:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/huawei/ui/main/R$mipmap;->hw_health_onboarding_next_img:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->d:Landroid/content/Context;

    .line 720
    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, Lcom/huawei/ui/main/R$mipmap;->hw_health_onboarding_back_img:I

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    .line 719
    invoke-virtual {v0, v1, v2, v3}, Lo/fhe;->e(Landroid/widget/ImageView;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    goto :goto_0

    .line 722
    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->o:Z

    .line 723
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->e:Lo/fhe;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->ac:Landroid/widget/ImageView;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->d:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/huawei/ui/main/R$mipmap;->hw_health_onboarding_next_img_transparent:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->d:Landroid/content/Context;

    .line 724
    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, Lcom/huawei/ui/main/R$mipmap;->hw_health_onboarding_back_img_transparent:I

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    .line 723
    invoke-virtual {v0, v1, v2, v3}, Lo/fhe;->e(Landroid/widget/ImageView;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 726
    :goto_0
    return-void
.end method

.method static synthetic b(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;Z)Z
    .locals 0

    .line 61
    iput-boolean p1, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->h:Z

    return p1
.end method

.method static synthetic c(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;)Landroid/os/Handler;
    .locals 1

    .line 61
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->al:Landroid/os/Handler;

    return-object v0
.end method

.method private c(Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    .line 414
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x6

    if-ge v1, v0, :cond_0

    .line 415
    const/4 v0, 0x0

    const/4 v1, 0x4

    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->ad:I

    .line 416
    const/4 v0, 0x4

    const/4 v1, 0x6

    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->ah:I

    .line 417
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x6

    invoke-virtual {p1, v1, v0}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->ae:I

    .line 418
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v4

    .line 419
    iget v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->ad:I

    iget v1, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->ah:I

    add-int/lit8 v1, v1, -0x1

    iget v2, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->ae:I

    invoke-virtual {v4, v0, v1, v2}, Ljava/util/Calendar;->set(III)V

    .line 420
    new-instance v5, Ljava/text/SimpleDateFormat;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    const-string v1, "yMd"

    invoke-static {v0, v1}, Landroid/text/format/DateFormat;->getBestDateTimePattern(Ljava/util/Locale;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v5, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 421
    invoke-virtual {v4}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 423
    :cond_0
    const-string v0, "SMART_OnBoardingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "birth lenth less"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 424
    const-string v0, "19920101"

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private c()V
    .locals 3

    .line 239
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->ag:I

    .line 240
    new-instance v0, Lo/fhj;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->z:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    iget v2, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->ag:I

    invoke-direct {v0, p0, v1, v2}, Lo/fhj;-><init>(Landroid/content/Context;II)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->y:Lo/fhj;

    .line 241
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->v:Landroid/widget/LinearLayout;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->y:Lo/fhj;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 242
    return-void
.end method

.method static synthetic c(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;Z)Z
    .locals 0

    .line 61
    iput-boolean p1, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->g:Z

    return p1
.end method

.method static synthetic d(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;I)I
    .locals 0

    .line 61
    iput p1, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->ad:I

    return p1
.end method

.method private d()V
    .locals 9

    .line 165
    invoke-static {p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v5

    .line 166
    sget v0, Lcom/huawei/ui/main/R$id;->hw_health_onboarding_info_titlebar:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emr;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->af:Lo/emr;

    .line 167
    sget v0, Lcom/huawei/ui/main/R$id;->hw_health_onboarding_pre:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->j:Landroid/widget/LinearLayout;

    .line 168
    sget v0, Lcom/huawei/ui/main/R$id;->hw_health_onboarding_next:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->D:Landroid/widget/LinearLayout;

    .line 169
    sget v0, Lcom/huawei/ui/main/R$id;->hw_health_onboarding_next_text:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->X:Landroid/widget/TextView;

    .line 170
    sget v0, Lcom/huawei/ui/main/R$id;->hw_health_onboarding_back_text:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->Y:Landroid/widget/TextView;

    .line 171
    sget v0, Lcom/huawei/ui/main/R$id;->hw_health_onboarding_next_img:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->ac:Landroid/widget/ImageView;

    .line 172
    sget v0, Lcom/huawei/ui/main/R$id;->hw_health_onboarding_back_img:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->Z:Landroid/widget/ImageView;

    .line 173
    sget v0, Lcom/huawei/ui/main/R$layout;->hw_health_onboarding_personal_info:I

    const/4 v1, 0x0

    invoke-virtual {v5, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v6

    .line 174
    sget v0, Lcom/huawei/ui/main/R$layout;->hw_health_onboarding_sports_interest:I

    const/4 v1, 0x0

    invoke-virtual {v5, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v7

    .line 175
    sget v0, Lcom/huawei/ui/main/R$layout;->hw_health_onboarding_health_concern:I

    const/4 v1, 0x0

    invoke-virtual {v5, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v8

    .line 176
    sget v0, Lcom/huawei/ui/main/R$id;->hw_health_onboarding_dot_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->v:Landroid/widget/LinearLayout;

    .line 177
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->e:Lo/fhe;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->Z:Landroid/widget/ImageView;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->d:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/huawei/ui/main/R$mipmap;->hw_health_onboarding_back_img:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->d:Landroid/content/Context;

    .line 178
    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, Lcom/huawei/ui/main/R$mipmap;->hw_health_onboarding_next_img:I

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    .line 177
    invoke-virtual {v0, v1, v2, v3}, Lo/fhe;->e(Landroid/widget/ImageView;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 181
    sget v0, Lcom/huawei/ui/main/R$id;->hw_health_onboarding_info_head:I

    invoke-virtual {v6, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->H:Landroid/widget/ImageView;

    .line 182
    sget v0, Lcom/huawei/ui/main/R$id;->hw_health_onboarding_info_user_name:I

    invoke-virtual {v6, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->U:Landroid/widget/TextView;

    .line 183
    sget v0, Lcom/huawei/ui/main/R$id;->hw_health_onboarding_info_gender:I

    invoke-virtual {v6, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->x:Landroid/widget/LinearLayout;

    .line 184
    sget v0, Lcom/huawei/ui/main/R$id;->hw_health_onboarding_info_birthday:I

    invoke-virtual {v6, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->w:Landroid/widget/LinearLayout;

    .line 185
    sget v0, Lcom/huawei/ui/main/R$id;->hw_health_onboarding_info_height:I

    invoke-virtual {v6, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->B:Landroid/widget/LinearLayout;

    .line 186
    sget v0, Lcom/huawei/ui/main/R$id;->hw_health_onboarding_info_weight:I

    invoke-virtual {v6, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->C:Landroid/widget/LinearLayout;

    .line 187
    sget v0, Lcom/huawei/ui/main/R$id;->hw_health_onboarding_info_gender_text:I

    invoke-virtual {v6, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->W:Landroid/widget/TextView;

    .line 188
    sget v0, Lcom/huawei/ui/main/R$id;->hw_health_onboarding_info_birthday_text:I

    invoke-virtual {v6, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->V:Landroid/widget/TextView;

    .line 189
    sget v0, Lcom/huawei/ui/main/R$id;->hw_health_onboarding_info_height_text:I

    invoke-virtual {v6, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->T:Landroid/widget/TextView;

    .line 190
    sget v0, Lcom/huawei/ui/main/R$id;->hw_health_onboarding_info_weight_text:I

    invoke-virtual {v6, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->aa:Landroid/widget/TextView;

    .line 191
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_set_default_gender_male:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->r:Ljava/lang/String;

    .line 192
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_set_default_gender_female:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->q:Ljava/lang/String;

    .line 193
    sget v0, Lcom/huawei/ui/main/R$id;->hw_health_onboarding_info_gender_img:I

    invoke-virtual {v6, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->F:Landroid/widget/ImageView;

    .line 194
    sget v0, Lcom/huawei/ui/main/R$id;->hw_health_onboarding_info_birthday_img:I

    invoke-virtual {v6, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->M:Landroid/widget/ImageView;

    .line 195
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->x:Landroid/widget/LinearLayout;

    new-instance v1, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity$d;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity$d;-><init>(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 196
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->w:Landroid/widget/LinearLayout;

    new-instance v1, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity$d;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity$d;-><init>(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 197
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->B:Landroid/widget/LinearLayout;

    new-instance v1, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity$d;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity$d;-><init>(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 198
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->C:Landroid/widget/LinearLayout;

    new-instance v1, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity$d;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity$d;-><init>(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 199
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->j:Landroid/widget/LinearLayout;

    new-instance v1, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity$d;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity$d;-><init>(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 200
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->D:Landroid/widget/LinearLayout;

    new-instance v1, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity$d;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity$d;-><init>(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 201
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->X:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->an:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 202
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->Y:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->ar:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 203
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->af:Lo/emr;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->ap:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/emr;->setTitleText(Ljava/lang/String;)V

    .line 206
    sget v0, Lcom/huawei/ui/main/R$id;->hw_health_onboarding_info_run_img:I

    invoke-virtual {v7, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->L:Landroid/widget/ImageView;

    .line 207
    sget v0, Lcom/huawei/ui/main/R$id;->hw_health_onboarding_info_ride_img:I

    invoke-virtual {v7, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->K:Landroid/widget/ImageView;

    .line 208
    sget v0, Lcom/huawei/ui/main/R$id;->hw_health_onboarding_info_walk_img:I

    invoke-virtual {v7, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->J:Landroid/widget/ImageView;

    .line 209
    sget v0, Lcom/huawei/ui/main/R$id;->hw_health_onboarding_info_bodybuilding_img:I

    invoke-virtual {v7, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->N:Landroid/widget/ImageView;

    .line 210
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->L:Landroid/widget/ImageView;

    new-instance v1, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity$a;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity$a;-><init>(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 211
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->K:Landroid/widget/ImageView;

    new-instance v1, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity$a;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity$a;-><init>(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 212
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->J:Landroid/widget/ImageView;

    new-instance v1, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity$a;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity$a;-><init>(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 213
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->N:Landroid/widget/ImageView;

    new-instance v1, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity$a;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity$a;-><init>(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 216
    sget v0, Lcom/huawei/ui/main/R$id;->hw_health_onboarding_concern_weight_img:I

    invoke-virtual {v8, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->R:Landroid/widget/ImageView;

    .line 217
    sget v0, Lcom/huawei/ui/main/R$id;->hw_health_onboarding_concern_sleep_img:I

    invoke-virtual {v8, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->S:Landroid/widget/ImageView;

    .line 218
    sget v0, Lcom/huawei/ui/main/R$id;->hw_health_onboarding_concern_bloodpressure_img:I

    invoke-virtual {v8, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->P:Landroid/widget/ImageView;

    .line 219
    sget v0, Lcom/huawei/ui/main/R$id;->hw_health_onboarding_concern_bloodsugar_img:I

    invoke-virtual {v8, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->O:Landroid/widget/ImageView;

    .line 220
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->R:Landroid/widget/ImageView;

    new-instance v1, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity$b;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity$b;-><init>(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 221
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->S:Landroid/widget/ImageView;

    new-instance v1, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity$b;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity$b;-><init>(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 222
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->P:Landroid/widget/ImageView;

    new-instance v1, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity$b;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity$b;-><init>(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 223
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->O:Landroid/widget/ImageView;

    new-instance v1, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity$b;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity$b;-><init>(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 225
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->z:Ljava/util/List;

    .line 227
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->z:Ljava/util/List;

    invoke-interface {v0, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 228
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->z:Ljava/util/List;

    invoke-interface {v0, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 229
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->z:Ljava/util/List;

    invoke-interface {v0, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 230
    new-instance v0, Lo/fhb;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->z:Ljava/util/List;

    invoke-direct {v0, v1}, Lo/fhb;-><init>(Ljava/util/List;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->t:Lo/fhb;

    .line 231
    sget v0, Lcom/huawei/ui/main/R$id;->hw_health_onboarding_viewpager:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/fhi;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->a:Lo/fhi;

    .line 232
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->a:Lo/fhi;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->t:Lo/fhb;

    invoke-virtual {v0, v1}, Lo/fhi;->setAdapter(Landroid/support/v4/view/PagerAdapter;)V

    .line 233
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->a:Lo/fhi;

    invoke-virtual {v0, p0}, Lo/fhi;->setOnPageChangeListener(Landroid/support/v4/view/ViewPager$OnPageChangeListener;)V

    .line 235
    return-void
.end method

.method private d(Z)V
    .locals 1

    .line 557
    if-eqz p1, :cond_0

    .line 558
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->b(Z)V

    .line 560
    :cond_0
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->f()Z

    move-result v0

    if-nez v0, :cond_1

    .line 561
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->b(Z)V

    .line 563
    :cond_1
    return-void
.end method

.method static synthetic d(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;)Z
    .locals 1

    .line 61
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->g:Z

    return v0
.end method

.method static synthetic d(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;Z)Z
    .locals 0

    .line 61
    iput-boolean p1, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->f:Z

    return p1
.end method

.method static synthetic e(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;I)I
    .locals 0

    .line 61
    iput p1, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->ah:I

    return p1
.end method

.method static synthetic e(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;)Landroid/widget/ImageView;
    .locals 1

    .line 61
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->K:Landroid/widget/ImageView;

    return-object v0
.end method

.method private e()V
    .locals 2

    .line 254
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->aq:Ljava/util/concurrent/ExecutorService;

    if-eqz v0, :cond_0

    .line 255
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->aq:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity$1;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity$1;-><init>(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 266
    :cond_0
    return-void
.end method

.method static synthetic e(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;Lcom/huawei/hihealth/HiUserPreference;)V
    .locals 0

    .line 61
    invoke-direct {p0, p1}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->a(Lcom/huawei/hihealth/HiUserPreference;)V

    return-void
.end method

.method private e(Landroid/view/View;)Z
    .locals 4

    .line 761
    const-string v0, "SMART_OnBoardingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initializeGenderDialogLayout()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 762
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 764
    const/4 v0, 0x0

    return v0

    .line 767
    :cond_0
    sget v0, Lcom/huawei/ui/main/R$id;->settings_gender_imgview1:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->I:Landroid/widget/ImageView;

    .line 768
    sget v0, Lcom/huawei/ui/main/R$id;->settings_gender_imgview2:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->G:Landroid/widget/ImageView;

    .line 769
    sget v0, Lcom/huawei/ui/main/R$id;->settings_gender_view_layout1:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->A:Landroid/widget/RelativeLayout;

    .line 770
    sget v0, Lcom/huawei/ui/main/R$id;->settings_gender_view_layout2:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->E:Landroid/widget/RelativeLayout;

    .line 771
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->A:Landroid/widget/RelativeLayout;

    new-instance v1, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity$e;

    const/4 v2, 0x1

    invoke-direct {v1, p0, p0, v2}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity$e;-><init>(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;Z)V

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 772
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->E:Landroid/widget/RelativeLayout;

    new-instance v1, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity$e;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p0, v2}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity$e;-><init>(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;Z)V

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 773
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->c:Lcom/huawei/up/model/UserInfomation;

    if-eqz v0, :cond_2

    .line 774
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->c:Lcom/huawei/up/model/UserInfomation;

    invoke-virtual {v0}, Lcom/huawei/up/model/UserInfomation;->getGender()I

    move-result v0

    if-nez v0, :cond_1

    .line 775
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->G:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$drawable;->btn_health_list_radio_nor:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 776
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->I:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$drawable;->btn_health_list_radio_sel:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_0

    .line 778
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->I:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$drawable;->btn_health_list_radio_nor:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 779
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->G:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$drawable;->btn_health_list_radio_sel:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_0

    .line 782
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->G:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$drawable;->btn_health_list_radio_nor:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 783
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->I:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$drawable;->btn_health_list_radio_sel:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 786
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method static synthetic e(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;Z)Z
    .locals 0

    .line 61
    iput-boolean p1, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->i:Z

    return p1
.end method

.method static synthetic f(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;)Landroid/widget/ImageView;
    .locals 1

    .line 61
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->J:Landroid/widget/ImageView;

    return-object v0
.end method

.method private f()Z
    .locals 1

    .line 664
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->g:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->h:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->i:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->f:Z

    if-eqz v0, :cond_1

    .line 665
    :cond_0
    const/4 v0, 0x1

    return v0

    .line 667
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method static synthetic f(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;Z)Z
    .locals 0

    .line 61
    iput-boolean p1, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->m:Z

    return p1
.end method

.method private g()V
    .locals 10

    .line 322
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->c:Lcom/huawei/up/model/UserInfomation;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 323
    const-string v0, "SMART_OnBoardingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mHiUserInfo not init"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 324
    return-void

    .line 326
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->c:Lcom/huawei/up/model/UserInfomation;

    invoke-virtual {v0}, Lcom/huawei/up/model/UserInfomation;->getPicPath()Ljava/lang/String;

    move-result-object v8

    .line 327
    const-string v0, "SMART_OnBoardingActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "refreshView"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v8, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 328
    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 330
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->d:Landroid/content/Context;

    invoke-static {v0, v8}, Lo/dbk;->d(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v9

    .line 331
    if-eqz v9, :cond_1

    .line 333
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->H:Landroid/widget/ImageView;

    invoke-virtual {v0, v9}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 337
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->T:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_show_set_height_value_with_unit_cm:I

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    .line 338
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->i()I

    move-result v4

    int-to-double v4, v4

    const/4 v6, 0x1

    const/4 v7, 0x0

    invoke-static {v4, v5, v6, v7}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    .line 337
    invoke-virtual {v1, v2, v3}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 339
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->aa:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_show_set_weightvalue_with_unit_kg:I

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    .line 340
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->k()F

    move-result v4

    float-to-double v4, v4

    const/4 v6, 0x1

    const/4 v7, 0x0

    invoke-static {v4, v5, v6, v7}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    .line 339
    invoke-virtual {v1, v2, v3}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 342
    return-void
.end method

.method static synthetic g(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;)Z
    .locals 1

    .line 61
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->i:Z

    return v0
.end method

.method static synthetic g(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;Z)Z
    .locals 0

    .line 61
    iput-boolean p1, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->p:Z

    return p1
.end method

.method static synthetic h(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;)Landroid/widget/ImageView;
    .locals 1

    .line 61
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->N:Landroid/widget/ImageView;

    return-object v0
.end method

.method private h()Ljava/lang/String;
    .locals 3

    .line 467
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v0, "00000000"

    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 468
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->g:Z

    const/4 v1, 0x0

    invoke-direct {p0, v2, v0, v1}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->b(Ljava/lang/StringBuilder;ZI)V

    .line 469
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->i:Z

    const/4 v1, 0x1

    invoke-direct {p0, v2, v0, v1}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->b(Ljava/lang/StringBuilder;ZI)V

    .line 470
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->h:Z

    const/4 v1, 0x2

    invoke-direct {p0, v2, v0, v1}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->b(Ljava/lang/StringBuilder;ZI)V

    .line 471
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->f:Z

    const/4 v1, 0x3

    invoke-direct {p0, v2, v0, v1}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->b(Ljava/lang/StringBuilder;ZI)V

    .line 472
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->p:Z

    const/4 v1, 0x4

    invoke-direct {p0, v2, v0, v1}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->b(Ljava/lang/StringBuilder;ZI)V

    .line 473
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->m:Z

    const/4 v1, 0x5

    invoke-direct {p0, v2, v0, v1}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->b(Ljava/lang/StringBuilder;ZI)V

    .line 474
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->l:Z

    const/4 v1, 0x6

    invoke-direct {p0, v2, v0, v1}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->b(Ljava/lang/StringBuilder;ZI)V

    .line 475
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->n:Z

    const/4 v1, 0x7

    invoke-direct {p0, v2, v0, v1}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->b(Ljava/lang/StringBuilder;ZI)V

    .line 476
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static synthetic h(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;Z)Z
    .locals 0

    .line 61
    iput-boolean p1, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->l:Z

    return p1
.end method

.method private i()I
    .locals 4

    .line 348
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->c:Lcom/huawei/up/model/UserInfomation;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 349
    const-string v0, "SMART_OnBoardingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mHiUserInfo is no set return default"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 350
    const/16 v0, 0xaa

    return v0

    .line 352
    :cond_0
    const-string v0, "SMART_OnBoardingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "no default h"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 353
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->c:Lcom/huawei/up/model/UserInfomation;

    invoke-virtual {v0}, Lcom/huawei/up/model/UserInfomation;->getHeight()I

    move-result v0

    return v0
.end method

.method static synthetic i(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;)Z
    .locals 1

    .line 61
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->f:Z

    return v0
.end method

.method static synthetic i(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;Z)Z
    .locals 0

    .line 61
    iput-boolean p1, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->n:Z

    return p1
.end method

.method static synthetic j(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;)Ljava/lang/String;
    .locals 1

    .line 61
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->r:Ljava/lang/String;

    return-object v0
.end method

.method private k()F
    .locals 4

    .line 360
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->c:Lcom/huawei/up/model/UserInfomation;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 361
    const-string v0, "SMART_OnBoardingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mHiUserInfo is not set return default"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 362
    const/high16 v0, 0x42700000    # 60.0f

    return v0

    .line 364
    :cond_0
    const-string v0, "SMART_OnBoardingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "no default w"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 365
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->c:Lcom/huawei/up/model/UserInfomation;

    invoke-virtual {v0}, Lcom/huawei/up/model/UserInfomation;->getWeight()F

    move-result v0

    return v0
.end method

.method static synthetic k(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;)Z
    .locals 1

    .line 61
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->h:Z

    return v0
.end method

.method static synthetic k(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;Z)Z
    .locals 0

    .line 61
    iput-boolean p1, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->u:Z

    return p1
.end method

.method private l()V
    .locals 8

    .line 882
    const-string v0, "layout_inflater"

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroid/view/LayoutInflater;

    .line 883
    sget v0, Lcom/huawei/ui/main/R$layout;->userinfo_date_select:I

    const/4 v1, 0x0

    invoke-virtual {v3, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v4

    .line 884
    sget v0, Lcom/huawei/ui/main/R$id;->hw_health_datepicker:I

    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/fgi;

    .line 886
    new-instance v7, Lo/egw$c;

    invoke-direct {v7, p0}, Lo/egw$c;-><init>(Landroid/content/Context;)V

    .line 887
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hw_health_show_string_date:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Lo/egw$c;->a(Ljava/lang/String;)Lo/egw$c;

    move-result-object v0

    .line 888
    invoke-virtual {v0, v4}, Lo/egw$c;->e(Landroid/view/View;)Lo/egw$c;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_common_ui_dialog_confirm:I

    new-instance v2, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity$4;

    invoke-direct {v2, p0, v5}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity$4;-><init>(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;Lo/fgi;)V

    .line 889
    invoke-virtual {v0, v1, v2}, Lo/egw$c;->b(ILandroid/view/View$OnClickListener;)Lo/egw$c;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_common_ui_dialog_cancel:I

    new-instance v2, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity$5;

    invoke-direct {v2, p0}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity$5;-><init>(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;)V

    .line 915
    invoke-virtual {v0, v1, v2}, Lo/egw$c;->c(ILandroid/view/View$OnClickListener;)Lo/egw$c;

    .line 921
    invoke-virtual {v7}, Lo/egw$c;->e()Lo/egw;

    move-result-object v6

    .line 922
    iget v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->ae:I

    invoke-virtual {v5, v0}, Lo/fgi;->setSelectedDay(I)V

    .line 923
    iget v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->ah:I

    invoke-virtual {v5, v0}, Lo/fgi;->setSelectedMonth(I)V

    .line 924
    iget v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->ad:I

    invoke-virtual {v5, v0}, Lo/fgi;->setSelectedYear(I)V

    .line 925
    invoke-virtual {v6}, Lo/egw;->show()V

    .line 927
    return-void
.end method

.method static synthetic l(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;)Z
    .locals 1

    .line 61
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->m:Z

    return v0
.end method

.method static synthetic m(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;)Landroid/widget/ImageView;
    .locals 1

    .line 61
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->P:Landroid/widget/ImageView;

    return-object v0
.end method

.method private m()Ljava/util/ArrayList;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/ArrayList<Ljava/lang/String;>;"
        }
    .end annotation

    .line 930
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 931
    const/16 v5, 0xa

    :goto_0
    const/16 v0, 0xfb

    if-ge v5, v0, :cond_0

    .line 932
    int-to-double v0, v5

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v6

    .line 933
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_set_weightvalue_with_unit_kg:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v6, v2, v3

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 931
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 935
    :cond_0
    return-object v4
.end method

.method static synthetic m(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;Z)V
    .locals 0

    .line 61
    invoke-direct {p0, p1}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->b(Z)V

    return-void
.end method

.method static synthetic n(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;)Landroid/widget/ImageView;
    .locals 1

    .line 61
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->S:Landroid/widget/ImageView;

    return-object v0
.end method

.method private n()V
    .locals 2

    .line 675
    iget v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->ag:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 676
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->a:Lo/fhi;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/fhi;->setCurrentItem(I)V

    goto :goto_0

    .line 677
    :cond_0
    iget v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->ag:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 678
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->a:Lo/fhi;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/fhi;->setCurrentItem(I)V

    .line 680
    :cond_1
    :goto_0
    return-void
.end method

.method private o()V
    .locals 7

    .line 735
    const-string v0, "SMART_OnBoardingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showGenderPickerDialog()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 736
    const-string v0, "layout_inflater"

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/view/LayoutInflater;

    .line 737
    sget v0, Lcom/huawei/ui/main/R$layout;->hw_show_settings_gender_view:I

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v5

    .line 739
    new-instance v6, Lo/egw$c;

    invoke-direct {v6, p0}, Lo/egw$c;-><init>(Landroid/content/Context;)V

    .line 740
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hw_show_set_gender:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lo/egw$c;->a(Ljava/lang/String;)Lo/egw$c;

    move-result-object v0

    .line 741
    invoke-virtual {v0, v5}, Lo/egw$c;->e(Landroid/view/View;)Lo/egw$c;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_cancel:I

    new-instance v2, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity$3;

    invoke-direct {v2, p0}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity$3;-><init>(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;)V

    .line 742
    invoke-virtual {v0, v1, v2}, Lo/egw$c;->c(ILandroid/view/View$OnClickListener;)Lo/egw$c;

    .line 749
    invoke-virtual {v6}, Lo/egw$c;->e()Lo/egw;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->Q:Lo/egw;

    .line 750
    invoke-direct {p0, v5}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->e(Landroid/view/View;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 752
    const-string v0, "SMART_OnBoardingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showGenderPickerDialog() dialog layout fail"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 753
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->Q:Lo/egw;

    .line 754
    return-void

    .line 756
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->Q:Lo/egw;

    invoke-virtual {v0}, Lo/egw;->show()V

    .line 757
    return-void
.end method

.method static synthetic o(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;)Z
    .locals 1

    .line 61
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->p:Z

    return v0
.end method

.method static synthetic o(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;Z)Z
    .locals 0

    .line 61
    iput-boolean p1, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->s:Z

    return p1
.end method

.method static synthetic p(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;)Landroid/widget/ImageView;
    .locals 1

    .line 61
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->R:Landroid/widget/ImageView;

    return-object v0
.end method

.method private p()V
    .locals 5

    .line 686
    iget v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->ag:I

    if-nez v0, :cond_1

    .line 687
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->o:Z

    if-eqz v0, :cond_0

    .line 688
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->a:Lo/fhi;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/fhi;->setCurrentItem(I)V

    goto/16 :goto_0

    .line 690
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->d:Landroid/content/Context;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hwh_home_other_onboarding_info_tips:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    goto/16 :goto_0

    .line 692
    :cond_1
    iget v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->ag:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_3

    .line 693
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->o:Z

    if-eqz v0, :cond_2

    .line 694
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->a:Lo/fhi;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lo/fhi;->setCurrentItem(I)V

    goto :goto_0

    .line 696
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->d:Landroid/content/Context;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hwh_home_other_onboarding_activity_tips:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    goto :goto_0

    .line 698
    :cond_3
    iget v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->ag:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_5

    .line 700
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->e:Lo/fhe;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->aq:Ljava/util/concurrent/ExecutorService;

    invoke-direct {p0}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->h()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo/fhe;->c(Ljava/util/concurrent/ExecutorService;Ljava/lang/String;)V

    .line 701
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/dbf;->f(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 702
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->e:Lo/fhe;

    invoke-virtual {v0, p0}, Lo/fhe;->b(Landroid/app/Activity;)V

    goto :goto_0

    .line 704
    :cond_4
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->e:Lo/fhe;

    sget-object v1, Lo/dae;->bH:Lo/dae;

    invoke-virtual {v1}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Lo/fhe;->a(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/up/model/UserInfomation;)V

    .line 705
    new-instance v4, Lo/dcy;

    invoke-direct {v4}, Lo/dcy;-><init>()V

    .line 706
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->d:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "onboarding_skip"

    .line 707
    const/4 v3, 0x1

    invoke-static {v3}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v3

    .line 706
    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 708
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->finish()V

    .line 711
    :cond_5
    :goto_0
    return-void
.end method

.method static synthetic q(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;)V
    .locals 0

    .line 61
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->n()V

    return-void
.end method

.method static synthetic r(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;)Landroid/widget/LinearLayout;
    .locals 1

    .line 61
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->j:Landroid/widget/LinearLayout;

    return-object v0
.end method

.method private s()Ljava/util/ArrayList;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/ArrayList<Ljava/lang/String;>;"
        }
    .end annotation

    .line 939
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 940
    const/16 v5, 0x32

    :goto_0
    const/16 v0, 0xfb

    if-ge v5, v0, :cond_0

    .line 941
    int-to-double v0, v5

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v6

    .line 942
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_set_height_value_with_unit_cm:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v6, v2, v3

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 940
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 944
    :cond_0
    return-object v4
.end method

.method static synthetic s(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;)Z
    .locals 1

    .line 61
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->l:Z

    return v0
.end method

.method static synthetic t(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;)Z
    .locals 1

    .line 61
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->n:Z

    return v0
.end method

.method static synthetic u(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;)Landroid/widget/ImageView;
    .locals 1

    .line 61
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->O:Landroid/widget/ImageView;

    return-object v0
.end method

.method static synthetic v(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;)V
    .locals 0

    .line 61
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->o()V

    return-void
.end method

.method static synthetic w(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;)V
    .locals 0

    .line 61
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->p()V

    return-void
.end method

.method static synthetic x(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;)Landroid/widget/LinearLayout;
    .locals 1

    .line 61
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->x:Landroid/widget/LinearLayout;

    return-object v0
.end method

.method static synthetic y(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;)Landroid/widget/LinearLayout;
    .locals 1

    .line 61
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->w:Landroid/widget/LinearLayout;

    return-object v0
.end method

.method static synthetic z(Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;)Landroid/widget/LinearLayout;
    .locals 1

    .line 61
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->D:Landroid/widget/LinearLayout;

    return-object v0
.end method


# virtual methods
.method public onBackPressed()V
    .locals 0

    .line 1034
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 2

    .line 137
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 138
    iput-object p0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->d:Landroid/content/Context;

    .line 139
    new-instance v0, Lo/fhe;

    invoke-direct {v0, p0}, Lo/fhe;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->e:Lo/fhe;

    .line 140
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->aq:Ljava/util/concurrent/ExecutorService;

    .line 141
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_startup_next:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->an:Ljava/lang/String;

    .line 142
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_startup_last:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->ar:Ljava/lang/String;

    .line 143
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hw_show_main_me_page_user_info:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->ap:Ljava/lang/String;

    .line 144
    new-instance v0, Lcom/huawei/up/model/UserInfomation;

    invoke-direct {v0}, Lcom/huawei/up/model/UserInfomation;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->c:Lcom/huawei/up/model/UserInfomation;

    .line 145
    sget v0, Lcom/huawei/ui/main/R$layout;->hw_health_onboarding_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->setContentView(I)V

    .line 147
    const/16 v0, 0x7c8

    iput v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->ad:I

    .line 148
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->d()V

    .line 149
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->c()V

    .line 151
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->e()V

    .line 152
    return-void
.end method

.method public onDestroy()V
    .locals 1

    .line 1037
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onDestroy()V

    .line 1038
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->aq:Ljava/util/concurrent/ExecutorService;

    if-eqz v0, :cond_0

    .line 1039
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->aq:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 1041
    :cond_0
    return-void
.end method

.method public onPageScrollStateChanged(I)V
    .locals 0

    .line 553
    return-void
.end method

.method public onPageScrolled(IFI)V
    .locals 0

    .line 510
    return-void
.end method

.method public onPageSelected(I)V
    .locals 4

    .line 516
    if-ltz p1, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->z:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-gt p1, v0, :cond_0

    iget v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->ag:I

    if-ne v0, p1, :cond_1

    .line 518
    :cond_0
    return-void

    .line 520
    :cond_1
    iget v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->ag:I

    const/4 v1, 0x0

    if-ne v1, v0, :cond_2

    const/4 v0, 0x1

    if-ne v0, p1, :cond_2

    .line 521
    const-string v0, "SMART_OnBoardingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "save data"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 522
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->i()I

    move-result v0

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->b(II)V

    .line 523
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->k()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->b(II)V

    .line 525
    :cond_2
    iget v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->ag:I

    const/4 v1, 0x1

    if-ne v1, v0, :cond_3

    const/4 v0, 0x0

    if-ne v0, p1, :cond_3

    .line 526
    const-string v0, "SMART_OnBoardingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "init data"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 527
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->a()V

    .line 529
    :cond_3
    iput p1, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->ag:I

    .line 530
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->b(Z)V

    .line 531
    const/4 v0, 0x0

    if-ne v0, p1, :cond_4

    .line 532
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->j:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 533
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->X:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->an:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 534
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->af:Lo/emr;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->ap:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/emr;->setTitleText(Ljava/lang/String;)V

    goto :goto_0

    .line 535
    :cond_4
    const/4 v0, 0x1

    if-ne v0, p1, :cond_5

    .line 536
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->j:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 537
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->X:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->an:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 538
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->af:Lo/emr;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hwh_home_other_onboarding_title_activity:I

    invoke-virtual {p0, v1}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setTitleText(Ljava/lang/String;)V

    .line 539
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->f()Z

    move-result v0

    if-nez v0, :cond_6

    .line 540
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->b(Z)V

    goto :goto_0

    .line 543
    :cond_5
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->j:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 544
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->X:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_social_clearup_storage_button_finish:I

    invoke-virtual {p0, v1}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 545
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->af:Lo/emr;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hwh_home_other_onboarding_title_concern:I

    invoke-virtual {p0, v1}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setTitleText(Ljava/lang/String;)V

    .line 547
    :cond_6
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->y:Lo/fhj;

    iget v1, p0, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->ag:I

    invoke-virtual {v0, v1}, Lo/fhj;->setmSelected(I)V

    .line 548
    return-void
.end method

.method public onResume()V
    .locals 0

    .line 156
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onResume()V

    .line 157
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/onboarding/activity/OnBoardingActivity;->a()V

    .line 158
    return-void
.end method
