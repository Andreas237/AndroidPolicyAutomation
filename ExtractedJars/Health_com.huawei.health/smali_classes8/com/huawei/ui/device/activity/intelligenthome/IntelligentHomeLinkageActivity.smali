.class public Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$a;
    }
.end annotation


# static fields
.field private static ae:Ljava/lang/String;

.field private static af:Ljava/lang/String;


# instance fields
.field private A:Landroid/widget/TextView;

.field private B:[I

.field private C:[Ljava/lang/String;

.field private D:[I

.field private E:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Landroid/widget/ImageView;>;"
        }
    .end annotation
.end field

.field private F:Lo/egv;

.field private G:Lo/egv;

.field private H:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Landroid/widget/ImageView;>;"
        }
    .end annotation
.end field

.field private I:Lo/egv;

.field private J:Lo/egy;

.field private K:Ljava/lang/String;

.field private L:Ljava/lang/String;

.field private M:Lo/egn;

.field private N:Lo/egy;

.field private O:Lo/enx;

.field private P:Landroid/os/Handler;

.field private Q:Lo/enz;

.field private R:Ljava/lang/String;

.field private S:Lo/dqi;

.field private T:Ljava/lang/String;

.field private U:Z

.field private V:Lo/der;

.field private W:I

.field private X:Z

.field private Y:I

.field private Z:I

.field private a:Landroid/support/v4/view/ViewPager;

.field private aa:Ljava/lang/String;

.field private final ab:I

.field private ac:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

.field private ad:I

.field private ag:I

.field private ah:I

.field private ai:Lcom/huawei/datatype/SmartAlarmInfo;

.field private aj:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/datatype/SmartAlarmInfo;>;"
        }
    .end annotation
.end field

.field private ak:Ljava/lang/String;

.field private al:Landroid/widget/CompoundButton$OnCheckedChangeListener;

.field private am:Ljava/lang/String;

.field private aq:Landroid/support/v4/view/ViewPager$OnPageChangeListener;

.field private b:Landroid/content/Context;

.field private c:Landroid/widget/RelativeLayout;

.field private final d:I

.field e:Z

.field private f:Landroid/widget/RelativeLayout;

.field private g:Landroid/widget/RelativeLayout;

.field private h:Landroid/widget/RelativeLayout;

.field private i:Landroid/widget/RelativeLayout;

.field private j:Lo/emu;

.field private k:Landroid/widget/RelativeLayout;

.field private l:Landroid/widget/LinearLayout;

.field private m:Landroid/widget/ScrollView;

.field private n:Landroid/widget/LinearLayout;

.field private o:Landroid/widget/LinearLayout;

.field private p:Lo/emr;

.field private q:Landroid/widget/TextView;

.field private r:Landroid/widget/TextView;

.field private s:Landroid/widget/TextView;

.field private t:Landroid/widget/TextView;

.field private u:Landroid/widget/TextView;

.field private v:Landroid/widget/TextView;

.field private w:Landroid/widget/TextView;

.field private x:Landroid/widget/TextView;

.field private y:Landroid/widget/TextView;

.field private z:Landroid/widget/TextView;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 147
    const-string v0, "7:00"

    sput-object v0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->ae:Ljava/lang/String;

    .line 148
    const-string v0, "10"

    sput-object v0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->af:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 84
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    .line 88
    const v0, 0x7140cc40

    iput v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->d:I

    .line 102
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->z:Landroid/widget/TextView;

    .line 106
    const/4 v0, 0x2

    new-array v0, v0, [I

    sget v1, Lcom/huawei/ui/device/R$mipmap;->pic_wanan_newpic:I

    const/4 v2, 0x0

    aput v1, v0, v2

    sget v1, Lcom/huawei/ui/device/R$mipmap;->pic_qingchen:I

    const/4 v2, 0x1

    aput v1, v0, v2

    iput-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->B:[I

    .line 107
    const/4 v0, 0x2

    new-array v0, v0, [I

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_device_to_intelligent_home_linkage_after_sleep:I

    const/4 v2, 0x0

    aput v1, v0, v2

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_device_to_intelligent_home_linkage_after_wake_up:I

    const/4 v2, 0x1

    aput v1, v0, v2

    iput-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->D:[I

    .line 108
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->C:[Ljava/lang/String;

    .line 111
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->E:Ljava/util/ArrayList;

    .line 123
    new-instance v0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$a;

    invoke-direct {v0, p0, p0}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$a;-><init>(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->P:Landroid/os/Handler;

    .line 136
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->X:Z

    .line 138
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->aa:Ljava/lang/String;

    .line 139
    const v0, 0x7fffffff

    iput v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->ab:I

    .line 150
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->e:Z

    .line 151
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->ak:Ljava/lang/String;

    .line 1123
    new-instance v0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$18;

    invoke-direct {v0, p0}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$18;-><init>(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->al:Landroid/widget/CompoundButton$OnCheckedChangeListener;

    .line 1345
    new-instance v0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$25;

    invoke-direct {v0, p0}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$25;-><init>(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->aq:Landroid/support/v4/view/ViewPager$OnPageChangeListener;

    return-void
.end method

.method static synthetic A(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;)V
    .locals 0

    .line 84
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->o()V

    return-void
.end method

.method static synthetic B(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;)Lo/egy;
    .locals 1

    .line 84
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->J:Lo/egy;

    return-object v0
.end method

.method static synthetic C(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;)Lo/egy;
    .locals 1

    .line 84
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->N:Lo/egy;

    return-object v0
.end method

.method static synthetic D(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;)Ljava/lang/String;
    .locals 1

    .line 84
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->ak:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic E(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;)V
    .locals 0

    .line 84
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->t()V

    return-void
.end method

.method static synthetic F(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;)Lo/egv;
    .locals 1

    .line 84
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->F:Lo/egv;

    return-object v0
.end method

.method static synthetic G(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;)Lo/egv;
    .locals 1

    .line 84
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->G:Lo/egv;

    return-object v0
.end method

.method static synthetic H(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;)V
    .locals 0

    .line 84
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->m()V

    return-void
.end method

.method static synthetic I(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;)Lo/egv;
    .locals 1

    .line 84
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->I:Lo/egv;

    return-object v0
.end method

.method static synthetic J(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;)V
    .locals 0

    .line 84
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->l()V

    return-void
.end method

.method static synthetic M(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;)Ljava/util/List;
    .locals 1

    .line 84
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->H:Ljava/util/List;

    return-object v0
.end method

.method static synthetic N(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;)Ljava/util/ArrayList;
    .locals 1

    .line 84
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->E:Ljava/util/ArrayList;

    return-object v0
.end method

.method static synthetic a(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;)I
    .locals 1

    .line 84
    iget v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->W:I

    return v0
.end method

.method static synthetic a(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;I)I
    .locals 0

    .line 84
    iput p1, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->W:I

    return p1
.end method

.method static synthetic a(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 84
    iput-object p1, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->aj:Ljava/util/List;

    return-object p1
.end method

.method static synthetic a(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;Lo/egv;)Lo/egv;
    .locals 0

    .line 84
    iput-object p1, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->F:Lo/egv;

    return-object p1
.end method

.method static synthetic a(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;Lo/egy;)Lo/egy;
    .locals 0

    .line 84
    iput-object p1, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->J:Lo/egy;

    return-object p1
.end method

.method private a()V
    .locals 2

    .line 347
    iget-boolean v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->X:Z

    if-eqz v0, :cond_1

    .line 348
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->k:Landroid/widget/RelativeLayout;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setClickable(Z)V

    .line 349
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->k:Landroid/widget/RelativeLayout;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setAlpha(F)V

    .line 350
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->i:Landroid/widget/RelativeLayout;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setClickable(Z)V

    .line 351
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->i:Landroid/widget/RelativeLayout;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setAlpha(F)V

    .line 352
    iget v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->W:I

    const/4 v1, 0x1

    if-ne v1, v0, :cond_0

    .line 353
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->f:Landroid/widget/RelativeLayout;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setClickable(Z)V

    .line 354
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->f:Landroid/widget/RelativeLayout;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setAlpha(F)V

    goto :goto_0

    .line 356
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->f:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setClickable(Z)V

    .line 357
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->f:Landroid/widget/RelativeLayout;

    const/high16 v1, 0x3f000000    # 0.5f

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setAlpha(F)V

    goto :goto_0

    .line 360
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->k:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setClickable(Z)V

    .line 361
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->k:Landroid/widget/RelativeLayout;

    const/high16 v1, 0x3f000000    # 0.5f

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setAlpha(F)V

    .line 362
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->i:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setClickable(Z)V

    .line 363
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->i:Landroid/widget/RelativeLayout;

    const/high16 v1, 0x3f000000    # 0.5f

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setAlpha(F)V

    .line 364
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->f:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setClickable(Z)V

    .line 365
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->f:Landroid/widget/RelativeLayout;

    const/high16 v1, 0x3f000000    # 0.5f

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setAlpha(F)V

    .line 368
    :goto_0
    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;Z)Z
    .locals 0

    .line 84
    iput-boolean p1, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->X:Z

    return p1
.end method

.method static synthetic b(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;I)I
    .locals 0

    .line 84
    iput p1, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->ag:I

    return p1
.end method

.method static synthetic b(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;Lcom/huawei/datatype/SmartAlarmInfo;)Lcom/huawei/datatype/SmartAlarmInfo;
    .locals 0

    .line 84
    iput-object p1, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->ai:Lcom/huawei/datatype/SmartAlarmInfo;

    return-object p1
.end method

.method static synthetic b(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 84
    iput-object p1, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->aa:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic b(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;)Lo/emu;
    .locals 1

    .line 84
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->j:Lo/emu;

    return-object v0
.end method

.method private b()V
    .locals 6

    .line 431
    iget-boolean v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->e:Z

    if-eqz v0, :cond_4

    .line 433
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->aj:Ljava/util/List;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->aj:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 434
    :cond_0
    new-instance v5, Lcom/huawei/datatype/SmartAlarmInfo;

    invoke-direct {v5}, Lcom/huawei/datatype/SmartAlarmInfo;-><init>()V

    .line 435
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->aj:Ljava/util/List;

    .line 436
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->aj:Ljava/util/List;

    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 438
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->aj:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 439
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->aj:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/datatype/SmartAlarmInfo;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->ai:Lcom/huawei/datatype/SmartAlarmInfo;

    .line 440
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->ai:Lcom/huawei/datatype/SmartAlarmInfo;

    invoke-virtual {v0}, Lcom/huawei/datatype/SmartAlarmInfo;->getSmartAlarmEnable()I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->Z:I

    .line 441
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->ai:Lcom/huawei/datatype/SmartAlarmInfo;

    invoke-virtual {v0}, Lcom/huawei/datatype/SmartAlarmInfo;->getSmartAlarmStartTime_hour()I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->Y:I

    .line 442
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->ai:Lcom/huawei/datatype/SmartAlarmInfo;

    invoke-virtual {v0}, Lcom/huawei/datatype/SmartAlarmInfo;->getSmartAlarmStartTime_mins()I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->ag:I

    .line 443
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->ai:Lcom/huawei/datatype/SmartAlarmInfo;

    invoke-virtual {v0}, Lcom/huawei/datatype/SmartAlarmInfo;->getSmartAlarmRepeat()I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->ah:I

    .line 444
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->ai:Lcom/huawei/datatype/SmartAlarmInfo;

    invoke-virtual {v0}, Lcom/huawei/datatype/SmartAlarmInfo;->getSmartAlarmAheadTime()I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->ad:I

    .line 446
    iget v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->ah:I

    const/4 v1, 0x0

    if-ne v1, v0, :cond_2

    iget v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->Z:I

    const/4 v1, 0x1

    if-ne v1, v0, :cond_2

    .line 447
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->ai:Lcom/huawei/datatype/SmartAlarmInfo;

    invoke-direct {p0, v0}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->e(Lcom/huawei/datatype/SmartAlarmInfo;)I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->Z:I

    .line 449
    :cond_2
    const-string v0, "IntelligentHomeLinkageActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "smartAlarmEnable ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->Z:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 450
    const-string v0, "IntelligentHomeLinkageActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "smartAlarmStartTime = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->Y:I

    mul-int/lit8 v3, v3, 0x64

    iget v4, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->ag:I

    add-int/2addr v3, v4

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 451
    const-string v0, "IntelligentHomeLinkageActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "smartAlarmRepeat ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->ah:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 452
    const-string v0, "IntelligentHomeLinkageActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "smartAlarmAheadTime ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->ad:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 453
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v5

    .line 454
    const/4 v0, 0x1

    iput v0, v5, Landroid/os/Message;->what:I

    .line 455
    iget v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->Z:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, v5, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 456
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->P:Landroid/os/Handler;

    invoke-virtual {v0, v5}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 457
    goto :goto_0

    .line 458
    :cond_3
    const-string v0, "IntelligentHomeLinkageActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "refreshSmartAlarmUI() deviceSmartAlarmList == null or size = 0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 460
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->Q:Lo/enz;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->ak:Ljava/lang/String;

    new-instance v2, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$2;

    invoke-direct {v2, p0}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$2;-><init>(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;)V

    invoke-virtual {v0, v1, v2}, Lo/enz;->b(Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    goto :goto_1

    .line 498
    :cond_4
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->S:Lo/dqi;

    new-instance v1, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$14;

    invoke-direct {v1, p0}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$14;-><init>(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;)V

    invoke-virtual {v0, v1}, Lo/dqi;->a(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 535
    :goto_1
    return-void
.end method

.method private b(I)V
    .locals 2

    .line 855
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->V:Lo/der;

    new-instance v1, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$8;

    invoke-direct {v1, p0, p1}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$8;-><init>(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;I)V

    invoke-virtual {v0, v1}, Lo/der;->b(Lo/dgg;)V

    .line 865
    return-void
.end method

.method private b(Ljava/lang/String;)V
    .locals 3

    .line 1265
    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    .line 1266
    const-string v0, "android.intent.action.VIEW"

    invoke-virtual {v1, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 1267
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    .line 1268
    invoke-virtual {v1, v2}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 1269
    const v0, 0x10008000

    invoke-virtual {v1, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 1270
    invoke-virtual {p0, v1}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->startActivity(Landroid/content/Intent;)V

    .line 1271
    return-void
.end method

.method static synthetic b(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;Z)Z
    .locals 0

    .line 84
    iput-boolean p1, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->U:Z

    return p1
.end method

.method private c(Landroid/content/Context;Ljava/lang/String;)I
    .locals 4

    .line 955
    const/4 v2, -0x1

    .line 957
    :try_start_0
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, p2, v1}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v3

    .line 958
    iget v2, v3, Landroid/content/pm/PackageInfo;->versionCode:I
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 961
    goto :goto_0

    .line 959
    :catch_0
    move-exception v3

    .line 960
    const/4 v2, -0x1

    .line 962
    :goto_0
    return v2
.end method

.method static synthetic c(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;I)I
    .locals 0

    .line 84
    iput p1, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->Z:I

    return p1
.end method

.method static synthetic c(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;Landroid/content/Context;Ljava/lang/String;)I
    .locals 1

    .line 84
    invoke-direct {p0, p1, p2}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->c(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method static synthetic c(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;Lcom/huawei/datatype/SmartAlarmInfo;)I
    .locals 1

    .line 84
    invoke-direct {p0, p1}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->e(Lcom/huawei/datatype/SmartAlarmInfo;)I

    move-result v0

    return v0
.end method

.method static synthetic c(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 84
    iput-object p1, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->am:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic c(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;Lo/egn;)Lo/egn;
    .locals 0

    .line 84
    iput-object p1, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->M:Lo/egn;

    return-object p1
.end method

.method static synthetic c(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;Lo/egv;)Lo/egv;
    .locals 0

    .line 84
    iput-object p1, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->I:Lo/egv;

    return-object p1
.end method

.method static synthetic c(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;Lo/egy;)Lo/egy;
    .locals 0

    .line 84
    iput-object p1, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->N:Lo/egy;

    return-object p1
.end method

.method private c()V
    .locals 6

    .line 374
    sget v0, Lcom/huawei/ui/device/R$string;->IDS_device_intelligent_home:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->K:Ljava/lang/String;

    .line 375
    sget v0, Lcom/huawei/ui/device/R$string;->IDS_device_intelligent_home_linkage:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    iget-object v2, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->K:Ljava/lang/String;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->R:Ljava/lang/String;

    .line 376
    sget v0, Lcom/huawei/ui/device/R$string;->IDS_device_to_intelligent_home_linkage_under:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    iget-object v2, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->K:Ljava/lang/String;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->T:Ljava/lang/String;

    .line 377
    sget v0, Lcom/huawei/ui/device/R$string;->IDS_device_to_intelligent_home_linkage_market_downloads:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    iget-object v2, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->K:Ljava/lang/String;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->L:Ljava/lang/String;

    .line 378
    sget v0, Lcom/huawei/ui/device/R$string;->IDS_device_to_intelligent_home_linkage_monitoring_after_sleep_new:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    iget-object v2, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->R:Ljava/lang/String;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    sget v2, Lcom/huawei/ui/device/R$string;->IDS_device_to_intelligent_home_linkage_go_sleeping:I

    invoke-virtual {p0, v2}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/16 v2, 0x14

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    .line 379
    sget v0, Lcom/huawei/ui/device/R$string;->IDS_device_to_intelligent_home_linkage_morning_after_wake_up_new:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    iget-object v2, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->R:Ljava/lang/String;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    sget v2, Lcom/huawei/ui/device/R$string;->IDS_settings_smart_alarm_clock:I

    invoke-virtual {p0, v2}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    .line 380
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    aput-object v4, v0, v1

    const/4 v1, 0x1

    aput-object v5, v0, v1

    iput-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->C:[Ljava/lang/String;

    .line 381
    return-void
.end method

.method private c(I)V
    .locals 4

    .line 802
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->b:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_getting_file:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->e(Ljava/lang/String;)V

    .line 803
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->P:Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v3

    .line 804
    const/4 v0, 0x6

    iput v0, v3, Landroid/os/Message;->what:I

    .line 805
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->P:Landroid/os/Handler;

    const-wide/16 v1, 0x7530

    invoke-virtual {v0, v3, v1, v2}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 806
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->ac:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    if-eqz v0, :cond_0

    .line 808
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->S:Lo/dqi;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "intelligent_home_linkage"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->ac:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    invoke-virtual {v2}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$9;

    invoke-direct {v2, p0, p1}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$9;-><init>(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;I)V

    invoke-virtual {v0, v1, v2}, Lo/dqi;->d(Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 848
    :cond_0
    return-void
.end method

.method static synthetic c(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;)Z
    .locals 1

    .line 84
    iget-boolean v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->X:Z

    return v0
.end method

.method static synthetic d(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;I)I
    .locals 0

    .line 84
    iput p1, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->Y:I

    return p1
.end method

.method static synthetic d(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;Lo/egv;)Lo/egv;
    .locals 0

    .line 84
    iput-object p1, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->G:Lo/egv;

    return-object p1
.end method

.method private d()V
    .locals 5

    .line 384
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->c()V

    .line 385
    sget v0, Lcom/huawei/ui/device/R$id;->sv_device_setting:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ScrollView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->m:Landroid/widget/ScrollView;

    .line 386
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->m:Landroid/widget/ScrollView;

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/widget/ScrollView;->setLayerType(ILandroid/graphics/Paint;)V

    .line 387
    sget v0, Lcom/huawei/ui/device/R$id;->rl_intelligent_home_linkage_unintall:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->c:Landroid/widget/RelativeLayout;

    .line 388
    sget v0, Lcom/huawei/ui/device/R$id;->switch_intelligent_home_title:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->v:Landroid/widget/TextView;

    .line 389
    sget v0, Lcom/huawei/ui/device/R$id;->switch_intelligent_home_describe:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->w:Landroid/widget/TextView;

    .line 390
    sget v0, Lcom/huawei/ui/device/R$id;->rl_intelligent_home_linkage_unintent:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->g:Landroid/widget/RelativeLayout;

    .line 391
    sget v0, Lcom/huawei/ui/device/R$id;->rl_switch_intelligent_home:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->h:Landroid/widget/RelativeLayout;

    .line 392
    sget v0, Lcom/huawei/ui/device/R$id;->tv_switch_intelligent_button:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->A:Landroid/widget/TextView;

    .line 393
    sget v0, Lcom/huawei/ui/device/R$id;->tv_wake_up:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->x:Landroid/widget/TextView;

    .line 394
    sget v0, Lcom/huawei/ui/device/R$id;->ll_unintent:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->l:Landroid/widget/LinearLayout;

    .line 395
    sget v0, Lcom/huawei/ui/device/R$id;->tv_market_downloads:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->y:Landroid/widget/TextView;

    .line 396
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->v:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->R:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 397
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->w:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->T:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 398
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->y:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->L:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 399
    sget v0, Lcom/huawei/ui/device/R$id;->tv_to_intelligent_home:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->t:Landroid/widget/TextView;

    .line 400
    sget v0, Lcom/huawei/ui/device/R$id;->ll_not_downloaded:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->n:Landroid/widget/LinearLayout;

    .line 401
    sget v0, Lcom/huawei/ui/device/R$id;->device_intelligent_home_linkage_img:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v4/view/ViewPager;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->a:Landroid/support/v4/view/ViewPager;

    .line 402
    sget v0, Lcom/huawei/ui/device/R$id;->device_intelligent_home_linkage_spot:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->o:Landroid/widget/LinearLayout;

    .line 403
    sget v0, Lcom/huawei/ui/device/R$id;->switch_intelligent_button:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emu;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->j:Lo/emu;

    .line 404
    sget v0, Lcom/huawei/ui/device/R$id;->device_intelligent_after_sleep:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->s:Landroid/widget/TextView;

    .line 405
    sget v0, Lcom/huawei/ui/device/R$id;->device_intelligent_monitoring_after_sleep:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->q:Landroid/widget/TextView;

    .line 406
    sget v0, Lcom/huawei/ui/device/R$id;->intelligent_home_title_bar:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emr;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->p:Lo/emr;

    .line 407
    sget v0, Lcom/huawei/ui/device/R$id;->tv_go_sleeping_minutes:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->r:Landroid/widget/TextView;

    .line 408
    sget v0, Lcom/huawei/ui/device/R$id;->tv_smart_alarm:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->u:Landroid/widget/TextView;

    .line 409
    sget v0, Lcom/huawei/ui/device/R$id;->rl_smart_alarm:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->i:Landroid/widget/RelativeLayout;

    .line 410
    sget v0, Lcom/huawei/ui/device/R$id;->rl_go_sleeping:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->k:Landroid/widget/RelativeLayout;

    .line 411
    sget v0, Lcom/huawei/ui/device/R$id;->rl_wake_up:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->f:Landroid/widget/RelativeLayout;

    .line 412
    sget v0, Lcom/huawei/ui/device/R$id;->smart_alarm_day:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->z:Landroid/widget/TextView;

    .line 414
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->r:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_device_to_intelligent_home_linkage_go_sleeping_minutes:I

    invoke-virtual {p0, v1}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/16 v3, 0x14

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 415
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->x:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_device_to_intelligent_home_linkage_reminder_enabled:I

    invoke-virtual {p0, v1}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    sget v3, Lcom/huawei/ui/device/R$string;->IDS_settings_smart_alarm_clock:I

    invoke-virtual {p0, v3}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->getString(I)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 416
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->p:Lo/emr;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->R:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/emr;->setTitleText(Ljava/lang/String;)V

    .line 417
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->g()V

    .line 418
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->b()V

    .line 419
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->i()V

    .line 420
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->q()V

    .line 421
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->s()V

    .line 422
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->u()V

    .line 423
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->e(I)V

    .line 425
    return-void
.end method

.method private d(ILjava/lang/String;Ljava/lang/String;)V
    .locals 7

    .line 873
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->P:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 874
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->P:Landroid/os/Handler;

    const/4 v1, 0x6

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 877
    :cond_0
    const-string v0, "IntelligentHomeLinkageActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "go to sleep intelligent home"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 878
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->b:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/LoginInit;->getUsetId()Ljava/lang/String;

    move-result-object v4

    .line 879
    const-string v0, "IntelligentHomeLinkageActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " goToSleepIntelligentHome huid "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 880
    const-string v5, "gotosleep"

    .line 881
    const/4 v0, 0x0

    if-ne v0, p1, :cond_1

    .line 882
    const-string v5, "gotosleep"

    goto :goto_0

    .line 884
    :cond_1
    const-string v5, "wakeup"

    .line 886
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->M:Lo/egn;

    if-eqz v0, :cond_2

    .line 887
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->M:Lo/egn;

    invoke-virtual {v0}, Lo/egn;->dismiss()V

    .line 888
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->M:Lo/egn;

    .line 890
    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "hilink://smarthome.huawei.com?type=iftttrule&action=hwsmartwear&para=userId&userId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "&para=devId&devId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "&para=prodId&prodId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "&para=condId&condId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 893
    const-string v0, "IntelligentHomeLinkageActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " goToSleepIntelligentHome sction "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 894
    invoke-direct {p0, v6}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->b(Ljava/lang/String;)V

    .line 895
    return-void
.end method

.method static synthetic d(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;)V
    .locals 0

    .line 84
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->e()V

    return-void
.end method

.method static synthetic d(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;ILjava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 84
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->d(ILjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method static synthetic d(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;Ljava/lang/String;)V
    .locals 0

    .line 84
    invoke-direct {p0, p1}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->e(Ljava/lang/String;)V

    return-void
.end method

.method private e(Lcom/huawei/datatype/SmartAlarmInfo;)I
    .locals 11

    .line 543
    invoke-virtual {p1}, Lcom/huawei/datatype/SmartAlarmInfo;->getSmartAlarmEnable()I

    move-result v4

    .line 546
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->b:Landroid/content/Context;

    const/16 v1, 0x2726

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "ONCE_SMART_ALARM_INFO"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 547
    const-string v0, "IntelligentHomeLinkageActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "==once== onceSmartAlarmIsOver json = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 548
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 549
    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    new-instance v1, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$21;

    invoke-direct {v1, p0}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$21;-><init>(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;)V

    invoke-virtual {v1}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$21;->getType()Ljava/lang/reflect/Type;

    move-result-object v1

    invoke-virtual {v0, v5, v1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/util/List;

    .line 550
    const/4 v0, 0x0

    if-eq v0, v6, :cond_1

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 551
    const/4 v7, 0x0

    :goto_0
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    if-ge v7, v0, :cond_1

    .line 552
    invoke-interface {v6, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/huawei/datatype/SmartAlarmInfo;

    .line 553
    invoke-virtual {v8}, Lcom/huawei/datatype/SmartAlarmInfo;->getSmartAlarmIndex()I

    move-result v0

    invoke-virtual {p1}, Lcom/huawei/datatype/SmartAlarmInfo;->getSmartAlarmIndex()I

    move-result v1

    if-ne v0, v1, :cond_0

    .line 556
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    div-long v9, v0, v2

    .line 557
    const-string v0, "IntelligentHomeLinkageActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "==once== CurTime = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v9, v10}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 558
    invoke-virtual {v8}, Lcom/huawei/datatype/SmartAlarmInfo;->getSmartAlarmTime()J

    move-result-wide v0

    cmp-long v0, v9, v0

    if-ltz v0, :cond_0

    .line 560
    const/4 v4, 0x0

    .line 551
    :cond_0
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 565
    :cond_1
    goto :goto_1

    .line 566
    :cond_2
    const-string v0, "IntelligentHomeLinkageActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "==once== onceSmartAlarmIsOver json is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 569
    :goto_1
    const-string v0, "IntelligentHomeLinkageActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "==once== onceSmartAlarmIsOver iRet = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 570
    return v4
.end method

.method static synthetic e(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;I)I
    .locals 0

    .line 84
    iput p1, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->ah:I

    return p1
.end method

.method private e()V
    .locals 4

    .line 322
    iget v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->Z:I

    const/4 v1, 0x1

    if-ne v1, v0, :cond_1

    .line 323
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->z:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 324
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->z:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->O:Lo/enx;

    iget v2, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->ah:I

    invoke-virtual {v1, v2}, Lo/enx;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 325
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->O:Lo/enx;

    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->b:Landroid/content/Context;

    iget v1, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->Y:I

    mul-int/lit8 v1, v1, 0x64

    iget v2, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->ag:I

    add-int/2addr v1, v2

    invoke-static {v0, v1}, Lo/enx;->a(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->ae:Ljava/lang/String;

    .line 326
    iget v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->ad:I

    int-to-double v0, v0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->af:Ljava/lang/String;

    .line 327
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->u:Landroid/widget/TextView;

    sget-object v1, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->ae:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 328
    iget-boolean v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->X:Z

    if-eqz v0, :cond_0

    .line 329
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->f:Landroid/widget/RelativeLayout;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setClickable(Z)V

    .line 330
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->f:Landroid/widget/RelativeLayout;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setAlpha(F)V

    goto :goto_0

    .line 332
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->f:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setClickable(Z)V

    .line 333
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->f:Landroid/widget/RelativeLayout;

    const/high16 v1, 0x3f000000    # 0.5f

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setAlpha(F)V

    goto :goto_0

    .line 336
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->u:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_status_disabled:I

    invoke-virtual {p0, v1}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 337
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->z:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 338
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->f:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setClickable(Z)V

    .line 339
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->f:Landroid/widget/RelativeLayout;

    const/high16 v1, 0x3f000000    # 0.5f

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setAlpha(F)V

    .line 341
    :goto_0
    return-void
.end method

.method static synthetic e(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;)V
    .locals 0

    .line 84
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->a()V

    return-void
.end method

.method private e(Ljava/lang/String;)V
    .locals 4

    .line 1101
    const-string v0, "IntelligentHomeLinkageActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showLoadingDialog()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1102
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1103
    return-void

    .line 1106
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->M:Lo/egn;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 1107
    new-instance v0, Lo/egn;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->b:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/device/R$style;->app_update_dialogActivity:I

    invoke-direct {v0, v1, v2}, Lo/egn;-><init>(Landroid/content/Context;I)V

    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/egn;->a(Landroid/content/Context;)Lo/egn;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->M:Lo/egn;

    .line 1108
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->M:Lo/egn;

    invoke-virtual {v0, p1}, Lo/egn;->e(Ljava/lang/String;)V

    .line 1109
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->M:Lo/egn;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egn;->setCancelable(Z)V

    .line 1110
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->M:Lo/egn;

    invoke-virtual {v0}, Lo/egn;->a()V

    .line 1111
    const-string v0, "IntelligentHomeLinkageActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mLoadingUserInformationDialog.show()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 1113
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->M:Lo/egn;

    invoke-virtual {v0, p1}, Lo/egn;->e(Ljava/lang/String;)V

    .line 1114
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->M:Lo/egn;

    invoke-virtual {v0}, Lo/egn;->a()V

    .line 1115
    const-string v0, "IntelligentHomeLinkageActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mLoadingUserInformationDialog.show()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1117
    :goto_0
    return-void
.end method

.method static synthetic f(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;)Lo/egn;
    .locals 1

    .line 84
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->M:Lo/egn;

    return-object v0
.end method

.method private f()V
    .locals 5

    .line 716
    iget-boolean v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->X:Z

    if-eqz v0, :cond_2

    iget v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->W:I

    const/4 v1, 0x1

    if-ne v1, v0, :cond_2

    .line 717
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->ac:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    if-eqz v0, :cond_1

    .line 718
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->b:Landroid/content/Context;

    const-string v1, "intell_wake_up"

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "once_intell_wake_up"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->ac:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    invoke-virtual {v3}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 719
    const-string v0, "IntelligentHomeLinkageActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "setLeftButtonOnClickListener result = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 720
    const-string v0, "go_wake_up"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 721
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->k()V

    goto :goto_0

    .line 723
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->finish()V

    .line 725
    :goto_0
    goto :goto_1

    .line 726
    :cond_1
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->finish()V

    goto :goto_1

    .line 729
    :cond_2
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->finish()V

    .line 731
    :goto_1
    return-void
.end method

.method static synthetic g(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;I)I
    .locals 0

    .line 84
    iput p1, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->ad:I

    return p1
.end method

.method static synthetic g(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;)Landroid/os/Handler;
    .locals 1

    .line 84
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->P:Landroid/os/Handler;

    return-object v0
.end method

.method private g()V
    .locals 3

    .line 575
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/dde;->d(Landroid/content/Context;)Lo/dde;

    move-result-object v0

    invoke-virtual {v0}, Lo/dde;->d()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->ac:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    .line 576
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->ac:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    if-eqz v0, :cond_0

    .line 578
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->S:Lo/dqi;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "intelligent_home_linkage"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->ac:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    invoke-virtual {v2}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$24;

    invoke-direct {v2, p0}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$24;-><init>(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;)V

    invoke-virtual {v0, v1, v2}, Lo/dqi;->d(Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 610
    :cond_0
    return-void
.end method

.method private h()V
    .locals 4

    .line 898
    new-instance v0, Lo/egy$b;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->b:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/egy$b;-><init>(Landroid/content/Context;)V

    iget-object v1, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->L:Ljava/lang/String;

    .line 899
    invoke-virtual {v0, v1}, Lo/egy$b;->a(Ljava/lang/String;)Lo/egy$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_settings_button_cancal:I

    new-instance v2, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$6;

    invoke-direct {v2, p0}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$6;-><init>(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;)V

    .line 900
    invoke-virtual {v0, v1, v2}, Lo/egy$b;->e(ILandroid/view/View$OnClickListener;)Lo/egy$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_settings_jawbone_download:I

    new-instance v2, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$7;

    invoke-direct {v2, p0}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$7;-><init>(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;)V

    .line 908
    invoke-virtual {v0, v1, v2}, Lo/egy$b;->d(ILandroid/view/View$OnClickListener;)Lo/egy$b;

    move-result-object v3

    .line 941
    invoke-virtual {v3}, Lo/egy$b;->a()Lo/egy;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->N:Lo/egy;

    .line 942
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->N:Lo/egy;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egy;->setCancelable(Z)V

    .line 943
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->N:Lo/egy;

    invoke-virtual {v0}, Lo/egy;->show()V

    .line 944
    return-void
.end method

.method static synthetic h(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;I)V
    .locals 0

    .line 84
    invoke-direct {p0, p1}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->b(I)V

    return-void
.end method

.method static synthetic h(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;)Z
    .locals 1

    .line 84
    iget-boolean v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->U:Z

    return v0
.end method

.method static synthetic i(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;)Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;
    .locals 1

    .line 84
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->ac:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    return-object v0
.end method

.method private i()V
    .locals 2

    .line 613
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->p:Lo/emr;

    new-instance v1, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$30;

    invoke-direct {v1, p0}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$30;-><init>(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;)V

    invoke-virtual {v0, v1}, Lo/emr;->setLeftButtonOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 620
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->p:Lo/emr;

    new-instance v1, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$28;

    invoke-direct {v1, p0}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$28;-><init>(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;)V

    invoke-virtual {v0, v1}, Lo/emr;->setRightButtonOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 632
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->l:Landroid/widget/LinearLayout;

    new-instance v1, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$27;

    invoke-direct {v1, p0}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$27;-><init>(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 639
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->A:Landroid/widget/TextView;

    new-instance v1, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$26;

    invoke-direct {v1, p0}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$26;-><init>(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 653
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->r()V

    .line 655
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->k:Landroid/widget/RelativeLayout;

    new-instance v1, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$29;

    invoke-direct {v1, p0}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$29;-><init>(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 677
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->i:Landroid/widget/RelativeLayout;

    new-instance v1, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$1;

    invoke-direct {v1, p0}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$1;-><init>(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 688
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->f:Landroid/widget/RelativeLayout;

    new-instance v1, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$5;

    invoke-direct {v1, p0}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$5;-><init>(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 713
    return-void
.end method

.method static synthetic j(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;)V
    .locals 0

    .line 84
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->h()V

    return-void
.end method

.method static synthetic k(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;)Landroid/widget/CompoundButton$OnCheckedChangeListener;
    .locals 1

    .line 84
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->al:Landroid/widget/CompoundButton$OnCheckedChangeListener;

    return-object v0
.end method

.method private k()V
    .locals 6

    .line 750
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->b:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_device_to_intelligent_home_linkage_alarm_wake_up:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    iget-object v2, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->b:Landroid/content/Context;

    sget v3, Lcom/huawei/ui/device/R$string;->IDS_device_to_intelligent_home_linkage_wake_up:I

    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->K:Ljava/lang/String;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    .line 751
    new-instance v0, Lo/egy$b;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->b:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/egy$b;-><init>(Landroid/content/Context;)V

    .line 752
    invoke-virtual {v0, v4}, Lo/egy$b;->a(Ljava/lang/String;)Lo/egy$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_settings_button_cancal:I

    new-instance v2, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$4;

    invoke-direct {v2, p0}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$4;-><init>(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;)V

    .line 753
    invoke-virtual {v0, v1, v2}, Lo/egy$b;->e(ILandroid/view/View$OnClickListener;)Lo/egy$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_fitness_core_sleep_sleep_record_notice_go_to_set:I

    new-instance v2, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$3;

    invoke-direct {v2, p0}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$3;-><init>(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;)V

    .line 762
    invoke-virtual {v0, v1, v2}, Lo/egy$b;->d(ILandroid/view/View$OnClickListener;)Lo/egy$b;

    move-result-object v5

    .line 790
    invoke-virtual {v5}, Lo/egy$b;->a()Lo/egy;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->J:Lo/egy;

    .line 791
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->J:Lo/egy;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egy;->setCancelable(Z)V

    .line 792
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->J:Lo/egy;

    invoke-virtual {v0}, Lo/egy;->show()V

    .line 794
    return-void
.end method

.method static synthetic k(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;I)V
    .locals 0

    .line 84
    invoke-direct {p0, p1}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->c(I)V

    return-void
.end method

.method static synthetic l(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;)Landroid/content/Context;
    .locals 1

    .line 84
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->b:Landroid/content/Context;

    return-object v0
.end method

.method private l()V
    .locals 2

    .line 1082
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->V:Lo/der;

    new-instance v1, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$20;

    invoke-direct {v1, p0}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$20;-><init>(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;)V

    invoke-virtual {v0, v1}, Lo/der;->c(Lo/dgg;)V

    .line 1093
    return-void
.end method

.method static synthetic m(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;)Lo/enz;
    .locals 1

    .line 84
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->Q:Lo/enz;

    return-object v0
.end method

.method private m()V
    .locals 2

    .line 1033
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->V:Lo/der;

    new-instance v1, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$12;

    invoke-direct {v1, p0}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$12;-><init>(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;)V

    invoke-virtual {v0, v1}, Lo/der;->b(Lo/dgg;)V

    .line 1044
    return-void
.end method

.method static synthetic n(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;)Ljava/lang/String;
    .locals 1

    .line 84
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->am:Ljava/lang/String;

    return-object v0
.end method

.method private n()V
    .locals 7

    .line 997
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->b:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_device_to_intelligent_home_linkage_open_after:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    iget-object v2, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->b:Landroid/content/Context;

    sget v3, Lcom/huawei/ui/device/R$string;->IDS_device_intelligent_home:I

    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    .line 998
    new-instance v0, Lo/egv$b;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->b:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/egv$b;-><init>(Landroid/content/Context;)V

    iget-object v1, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->b:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/device/R$string;->IDS_device_to_intelligent_home_linkage_open:I

    .line 999
    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->R:Ljava/lang/String;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egv$b;->e(Ljava/lang/String;)Lo/egv$b;

    move-result-object v0

    .line 1000
    invoke-virtual {v0, v5}, Lo/egv$b;->b(Ljava/lang/String;)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_common_enable_button:I

    new-instance v2, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$11;

    invoke-direct {v2, p0}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$11;-><init>(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;)V

    .line 1001
    invoke-virtual {v0, v1, v2}, Lo/egv$b;->e(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_settings_button_cancal:I

    new-instance v2, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$15;

    invoke-direct {v2, p0}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$15;-><init>(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;)V

    .line 1016
    invoke-virtual {v0, v1, v2}, Lo/egv$b;->b(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    move-result-object v6

    .line 1024
    invoke-virtual {v6}, Lo/egv$b;->b()Lo/egv;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->I:Lo/egv;

    .line 1025
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->I:Lo/egv;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egv;->setCancelable(Z)V

    .line 1026
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->I:Lo/egv;

    invoke-virtual {v0}, Lo/egv;->show()V

    .line 1027
    return-void
.end method

.method static synthetic o(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;)Lo/dqi;
    .locals 1

    .line 84
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->S:Lo/dqi;

    return-object v0
.end method

.method private o()V
    .locals 6

    .line 969
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->b:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_device_to_intelligent_home_linkage_update_retry:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    iget-object v2, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->K:Ljava/lang/String;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    .line 970
    new-instance v0, Lo/egv$b;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->b:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/egv$b;-><init>(Landroid/content/Context;)V

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_hwh_open_service_pop_up_notification_note:I

    .line 971
    invoke-virtual {v0, v1}, Lo/egv$b;->b(I)Lo/egv$b;

    move-result-object v0

    .line 972
    invoke-virtual {v0, v4}, Lo/egv$b;->b(Ljava/lang/String;)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_device_to_intelligent_home_linkage_go_to_download:I

    new-instance v2, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$13;

    invoke-direct {v2, p0}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$13;-><init>(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;)V

    .line 973
    invoke-virtual {v0, v1, v2}, Lo/egv$b;->e(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_settings_button_cancal:I

    new-instance v2, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$10;

    invoke-direct {v2, p0}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$10;-><init>(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;)V

    .line 983
    invoke-virtual {v0, v1, v2}, Lo/egv$b;->b(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    move-result-object v5

    .line 991
    invoke-virtual {v5}, Lo/egv$b;->b()Lo/egv;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->G:Lo/egv;

    .line 992
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->G:Lo/egv;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egv;->setCancelable(Z)V

    .line 993
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->G:Lo/egv;

    invoke-virtual {v0}, Lo/egv;->show()V

    .line 994
    return-void
.end method

.method static synthetic p(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;)Ljava/lang/String;
    .locals 1

    .line 84
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->aa:Ljava/lang/String;

    return-object v0
.end method

.method private p()V
    .locals 7

    .line 1047
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->b:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_device_to_intelligent_home_linkage_close_after:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    iget-object v2, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->b:Landroid/content/Context;

    sget v3, Lcom/huawei/ui/device/R$string;->IDS_device_intelligent_home:I

    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    .line 1048
    new-instance v0, Lo/egv$b;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->b:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/egv$b;-><init>(Landroid/content/Context;)V

    iget-object v1, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->b:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/device/R$string;->IDS_device_to_intelligent_home_linkage_close:I

    .line 1049
    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->R:Ljava/lang/String;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egv$b;->e(Ljava/lang/String;)Lo/egv$b;

    move-result-object v0

    .line 1050
    invoke-virtual {v0, v5}, Lo/egv$b;->b(Ljava/lang/String;)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_settings_close:I

    new-instance v2, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$16;

    invoke-direct {v2, p0}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$16;-><init>(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;)V

    .line 1051
    invoke-virtual {v0, v1, v2}, Lo/egv$b;->e(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_settings_button_cancal:I

    new-instance v2, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$19;

    invoke-direct {v2, p0}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$19;-><init>(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;)V

    .line 1064
    invoke-virtual {v0, v1, v2}, Lo/egv$b;->b(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    move-result-object v6

    .line 1072
    invoke-virtual {v6}, Lo/egv$b;->b()Lo/egv;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->F:Lo/egv;

    .line 1073
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->F:Lo/egv;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egv;->setCancelable(Z)V

    .line 1074
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->F:Lo/egv;

    invoke-virtual {v0}, Lo/egv;->show()V

    .line 1075
    return-void
.end method

.method static synthetic q(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;)Lcom/huawei/datatype/SmartAlarmInfo;
    .locals 1

    .line 84
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->ai:Lcom/huawei/datatype/SmartAlarmInfo;

    return-object v0
.end method

.method private q()V
    .locals 3

    .line 1209
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->H:Ljava/util/List;

    .line 1210
    const/4 v1, 0x0

    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->B:[I

    array-length v0, v0

    if-ge v1, v0, :cond_0

    .line 1211
    new-instance v2, Landroid/widget/ImageView;

    invoke-direct {v2, p0}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 1212
    sget-object v0, Landroid/widget/ImageView$ScaleType;->FIT_XY:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {v2, v0}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 1213
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->B:[I

    aget v0, v0, v1

    invoke-virtual {v2, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 1214
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->H:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1210
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 1216
    :cond_0
    return-void
.end method

.method static synthetic r(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;)I
    .locals 1

    .line 84
    iget v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->ah:I

    return v0
.end method

.method private r()V
    .locals 7

    .line 1219
    sget v0, Lcom/huawei/ui/device/R$string;->IDS_device_to_intelligent_home_linkage_details_and_purchase:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    iget-object v2, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->K:Ljava/lang/String;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->K:Ljava/lang/String;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    .line 1220
    const/4 v0, 0x1

    new-array v5, v0, [I

    .line 1221
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->K:Ljava/lang/String;

    invoke-virtual {v4, v0}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v0

    const/4 v1, 0x0

    aput v0, v5, v1

    .line 1222
    new-instance v6, Landroid/text/SpannableString;

    invoke-direct {v6, v4}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 1223
    new-instance v0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$17;

    invoke-direct {v0, p0}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$17;-><init>(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;)V

    const/4 v1, 0x0

    aget v1, v5, v1

    const/4 v2, 0x0

    aget v2, v5, v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->K:Ljava/lang/String;

    .line 1259
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    add-int/2addr v2, v3

    .line 1223
    const/16 v3, 0x21

    invoke-virtual {v6, v0, v1, v2, v3}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 1260
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->t:Landroid/widget/TextView;

    invoke-virtual {v0, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1261
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->t:Landroid/widget/TextView;

    invoke-static {}, Landroid/text/method/LinkMovementMethod;->getInstance()Landroid/text/method/MovementMethod;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setMovementMethod(Landroid/text/method/MovementMethod;)V

    .line 1262
    return-void
.end method

.method static synthetic s(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;)I
    .locals 1

    .line 84
    iget v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->Y:I

    return v0
.end method

.method private s()V
    .locals 2

    .line 1275
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->n:Landroid/widget/LinearLayout;

    new-instance v1, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$23;

    invoke-direct {v1, p0}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$23;-><init>(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1282
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->a:Landroid/support/v4/view/ViewPager;

    new-instance v1, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$22;

    invoke-direct {v1, p0}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity$22;-><init>(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;)V

    invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->setAdapter(Landroid/support/v4/view/PagerAdapter;)V

    .line 1307
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->a:Landroid/support/v4/view/ViewPager;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->aq:Landroid/support/v4/view/ViewPager$OnPageChangeListener;

    invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->setOnPageChangeListener(Landroid/support/v4/view/ViewPager$OnPageChangeListener;)V

    .line 1308
    return-void
.end method

.method static synthetic t(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;)Ljava/util/List;
    .locals 1

    .line 84
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->aj:Ljava/util/List;

    return-object v0
.end method

.method private t()V
    .locals 6

    .line 1315
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->b:Landroid/content/Context;

    const-string v1, "com.huawei.appmarket"

    invoke-static {v0, v1}, Lo/dbf;->i(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1316
    const-string v0, "IntelligentHomeLinkageActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "is not install appmarket enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1318
    :try_start_0
    new-instance v4, Landroid/content/Intent;

    invoke-direct {v4}, Landroid/content/Intent;-><init>()V

    .line 1319
    const-string v0, "android.intent.action.VIEW"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 1320
    const-string v0, "https://smarthome.hicloud.com/d/?v2"

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v5

    .line 1321
    invoke-virtual {v4, v5}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 1322
    invoke-virtual {p0, v4}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1325
    goto/16 :goto_0

    .line 1323
    :catch_0
    move-exception v4

    .line 1324
    const-string v0, "IntelligentHomeLinkageActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "------"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Landroid/content/ActivityNotFoundException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1325
    goto :goto_0

    .line 1328
    :cond_0
    const-string v0, "IntelligentHomeLinkageActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "is install appmarket enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1330
    :try_start_1
    new-instance v4, Landroid/content/Intent;

    const-string v0, "com.huawei.appmarket.intent.action.AppDetail"

    invoke-direct {v4, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 1331
    const-string v0, "com.huawei.appmarket"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 1332
    const v0, 0x10008000

    invoke-virtual {v4, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 1333
    const-string v0, "APP_PACKAGENAME"

    const-string v1, "com.huawei.smarthome"

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 1334
    invoke-virtual {p0, v4}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->startActivity(Landroid/content/Intent;)V
    :try_end_1
    .catch Landroid/content/ActivityNotFoundException; {:try_start_1 .. :try_end_1} :catch_1

    .line 1337
    goto :goto_0

    .line 1335
    :catch_1
    move-exception v4

    .line 1336
    const-string v0, "IntelligentHomeLinkageActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Exception localActivityNotFoundException = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Landroid/content/ActivityNotFoundException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1341
    :goto_0
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 1342
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    sget-object v2, Lo/dae;->ji:Lo/dae;

    invoke-virtual {v2}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v4, v3}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 1343
    return-void
.end method

.method static synthetic u(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;)I
    .locals 1

    .line 84
    iget v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->Z:I

    return v0
.end method

.method private u()V
    .locals 9

    .line 1385
    const-string v0, "IntelligentHomeLinkageActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " initNavigation() "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1386
    const/4 v4, 0x0

    .line 1387
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->H:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v5

    .line 1388
    :goto_0
    if-ge v4, v5, :cond_1

    .line 1389
    new-instance v6, Landroid/widget/ImageView;

    invoke-direct {v6, p0}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 1390
    new-instance v7, Landroid/widget/LinearLayout$LayoutParams;

    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->b:Landroid/content/Context;

    const/high16 v1, 0x40c00000    # 6.0f

    invoke-static {v0, v1}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v0

    iget-object v1, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->b:Landroid/content/Context;

    const/high16 v2, 0x40c00000    # 6.0f

    invoke-static {v1, v2}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v1

    invoke-direct {v7, v0, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 1391
    new-instance v8, Landroid/widget/LinearLayout$LayoutParams;

    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->b:Landroid/content/Context;

    const/high16 v1, 0x40800000    # 4.0f

    invoke-static {v0, v1}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v0

    iget-object v1, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->b:Landroid/content/Context;

    const/high16 v2, 0x40800000    # 4.0f

    invoke-static {v1, v2}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v1

    invoke-direct {v8, v0, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 1392
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 1393
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->b:Landroid/content/Context;

    const/high16 v1, 0x41500000    # 13.0f

    invoke-static {v0, v1}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v0

    iget-object v1, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->b:Landroid/content/Context;

    const/high16 v2, 0x41500000    # 13.0f

    invoke-static {v1, v2}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v7, v2, v0, v3, v1}, Landroid/widget/LinearLayout$LayoutParams;->setMargins(IIII)V

    .line 1394
    sget v0, Lcom/huawei/ui/device/R$drawable;->btn_health_point_orange_sel:I

    invoke-virtual {v6, v0}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 1395
    invoke-virtual {v6, v7}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_1

    .line 1397
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->b:Landroid/content/Context;

    const/high16 v1, 0x41000000    # 8.0f

    invoke-static {v0, v1}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v0

    iget-object v1, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->b:Landroid/content/Context;

    const/high16 v2, 0x41500000    # 13.0f

    invoke-static {v1, v2}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v1

    iget-object v2, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->b:Landroid/content/Context;

    const/high16 v3, 0x41500000    # 13.0f

    invoke-static {v2, v3}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v2

    const/4 v3, 0x0

    invoke-virtual {v8, v0, v1, v3, v2}, Landroid/widget/LinearLayout$LayoutParams;->setMargins(IIII)V

    .line 1398
    invoke-virtual {v6, v8}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1399
    sget v0, Lcom/huawei/ui/device/R$drawable;->btn_health_point_gray_nor:I

    invoke-virtual {v6, v0}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 1402
    :goto_1
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->o:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v6}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 1403
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->E:Ljava/util/ArrayList;

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1388
    add-int/lit8 v4, v4, 0x1

    goto/16 :goto_0

    .line 1405
    :cond_1
    return-void
.end method

.method static synthetic v(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;)I
    .locals 1

    .line 84
    iget v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->ad:I

    return v0
.end method

.method static synthetic w(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;)V
    .locals 0

    .line 84
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->f()V

    return-void
.end method

.method static synthetic x(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;)I
    .locals 1

    .line 84
    iget v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->ag:I

    return v0
.end method

.method static synthetic y(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;)V
    .locals 0

    .line 84
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->p()V

    return-void
.end method

.method static synthetic z(Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;)V
    .locals 0

    .line 84
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->n()V

    return-void
.end method


# virtual methods
.method public e(I)V
    .locals 2

    .line 1408
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->s:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->D:[I

    aget v1, v1, p1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 1409
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->q:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->C:[Ljava/lang/String;

    aget-object v1, v1, p1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1410
    return-void
.end method

.method public onBackPressed()V
    .locals 4

    .line 742
    const-string v0, "IntelligentHomeLinkageActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onBackPressed"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 743
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->f()V

    .line 744
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 5

    .line 299
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 300
    iput-object p0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->b:Landroid/content/Context;

    .line 301
    sget v0, Lcom/huawei/ui/device/R$layout;->activity_intelligent_home_linkage:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->setContentView(I)V

    .line 302
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/dqi;->b(Landroid/content/Context;)Lo/dqi;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->S:Lo/dqi;

    .line 303
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/enz;->b(Landroid/content/Context;)Lo/enz;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->Q:Lo/enz;

    .line 304
    const/4 v0, 0x0

    invoke-static {v0}, Lo/enx;->a(Landroid/content/Context;)Lo/enx;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->O:Lo/enx;

    .line 305
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->getIntent()Landroid/content/Intent;

    move-result-object v4

    .line 306
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    .line 307
    const-string v0, "device_id"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->ak:Ljava/lang/String;

    .line 309
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->ak:Ljava/lang/String;

    invoke-static {v0}, Lo/czw;->e(Ljava/lang/String;)Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 310
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->ak:Ljava/lang/String;

    invoke-static {v0}, Lo/czw;->e(Ljava/lang/String;)Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isChange_alarm()Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->e:Z

    .line 311
    const-string v0, "IntelligentHomeLinkageActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "bIsSupportChangeAlarm "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->e:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 313
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/der;->e(Landroid/content/Context;)Lo/der;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->V:Lo/der;

    .line 314
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->d()V

    .line 315
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->a()V

    .line 316
    return-void
.end method

.method public onDestroy()V
    .locals 2

    .line 1201
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onDestroy()V

    .line 1202
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->P:Landroid/os/Handler;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 1203
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->P:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 1205
    :cond_0
    return-void
.end method

.method public onResume()V
    .locals 2

    .line 1151
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onResume()V

    .line 1152
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->b()V

    .line 1153
    invoke-static {p0}, Lo/dbf;->f(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 1154
    const-string v0, "com.huawei.smarthome"

    invoke-static {p0, v0}, Lo/dbf;->i(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1155
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->c:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    goto :goto_0

    .line 1157
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->c:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 1159
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->g:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 1160
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->h:Landroid/widget/RelativeLayout;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setAlpha(F)V

    .line 1161
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->h:Landroid/widget/RelativeLayout;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setClickable(Z)V

    .line 1162
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->A:Landroid/widget/TextView;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setClickable(Z)V

    .line 1163
    iget-boolean v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->X:Z

    if-eqz v0, :cond_2

    .line 1164
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->k:Landroid/widget/RelativeLayout;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setClickable(Z)V

    .line 1165
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->k:Landroid/widget/RelativeLayout;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setAlpha(F)V

    .line 1166
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->i:Landroid/widget/RelativeLayout;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setClickable(Z)V

    .line 1167
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->i:Landroid/widget/RelativeLayout;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setAlpha(F)V

    .line 1168
    iget v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->W:I

    const/4 v1, 0x1

    if-ne v1, v0, :cond_1

    .line 1169
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->f:Landroid/widget/RelativeLayout;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setClickable(Z)V

    .line 1170
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->f:Landroid/widget/RelativeLayout;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setAlpha(F)V

    goto/16 :goto_1

    .line 1172
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->f:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setClickable(Z)V

    .line 1173
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->f:Landroid/widget/RelativeLayout;

    const/high16 v1, 0x3f000000    # 0.5f

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setAlpha(F)V

    goto/16 :goto_1

    .line 1176
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->k:Landroid/widget/RelativeLayout;

    const/high16 v1, 0x3f000000    # 0.5f

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setAlpha(F)V

    .line 1177
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->k:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setClickable(Z)V

    .line 1178
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->i:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setClickable(Z)V

    .line 1179
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->i:Landroid/widget/RelativeLayout;

    const/high16 v1, 0x3f000000    # 0.5f

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setAlpha(F)V

    .line 1180
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->f:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setClickable(Z)V

    .line 1181
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->f:Landroid/widget/RelativeLayout;

    const/high16 v1, 0x3f000000    # 0.5f

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setAlpha(F)V

    goto :goto_1

    .line 1185
    :cond_3
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->c:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 1186
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->g:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 1187
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->h:Landroid/widget/RelativeLayout;

    const/high16 v1, 0x3f000000    # 0.5f

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setAlpha(F)V

    .line 1188
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->k:Landroid/widget/RelativeLayout;

    const/high16 v1, 0x3f000000    # 0.5f

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setAlpha(F)V

    .line 1189
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->h:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setClickable(Z)V

    .line 1190
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->k:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setClickable(Z)V

    .line 1191
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->A:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setClickable(Z)V

    .line 1192
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->i:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setClickable(Z)V

    .line 1193
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->i:Landroid/widget/RelativeLayout;

    const/high16 v1, 0x3f000000    # 0.5f

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setAlpha(F)V

    .line 1194
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->f:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setClickable(Z)V

    .line 1195
    iget-object v0, p0, Lcom/huawei/ui/device/activity/intelligenthome/IntelligentHomeLinkageActivity;->f:Landroid/widget/RelativeLayout;

    const/high16 v1, 0x3f000000    # 0.5f

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setAlpha(F)V

    .line 1197
    :goto_1
    return-void
.end method
