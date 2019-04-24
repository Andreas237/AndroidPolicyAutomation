.class public Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;
.super Lcom/huawei/health/device/ui/BaseFragment;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment$ProIResourceFileListener;
    }
.end annotation


# static fields
.field private static final HUAWEI_FIT:Ljava/lang/String; = "HUAWEI FIT"

.field private static final METIS_PRODUCTID:Ljava/lang/String; = "9323f6b7-b459-44f4-a698-988d1769832a"

.field private static final MIN_TEXT_SIZE:I = 0x9

.field private static final NORMAL_TEXT_SIZE:I = 0xf

.field private static final PRO_TO_FAILED:I = 0x2

.field private static final PRO_TO_REFRESH:I = 0x1

.field private static final PRO_TO_REFRESH_DIALOG:I = 0x5

.field private static final PRO_TO_REFRESH_GROUP:I = 0x4

.field private static final PRO_UNZIP_SUCCESS:I = 0x3

.field public static final REQUEST_GPS_LOCATION:I = 0x1

.field private static final REQUEST_NOTIFICATION_MANAGER:I = 0x0

.field private static final am16permissions:[Ljava/lang/String;


# instance fields
.field private buyTextView:Landroid/widget/TextView;

.field private isFinishDeviceMainActivity:Z

.field private isFirstDownload:Z

.field private kind:Lo/acl$a;

.field private mCustomGpsViewDialog:Lo/egv;

.field private mImgPagerAdapter:Lo/ags;

.field private mLlbuyTextView:Landroid/widget/LinearLayout;

.field private mNavigation:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Landroid/widget/ImageView;>;"
        }
    .end annotation
.end field

.field private mOnPageChangeListener:Landroid/support/v4/view/ViewPager$OnPageChangeListener;

.field private mProHandler:Landroid/os/Handler;

.field private mProductId:Ljava/lang/String;

.field private mProductInfo:Lo/afj;

.field private mPrompt:Landroid/widget/TextView;

.field private mRingerModeDialog:Lo/egv;

.field private mUnbindDialog:Lo/egv;

.field private mloadingProgressBar:Lhuawei/widget/HwProgressBar;

.field private productIdList:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field private text_list:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field private timePeriod:I

.field private toDownloadList:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field private tvButton:Lo/egd;

.field viewPager:Landroid/support/v4/view/ViewPager;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 113
    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "android.permission.MODIFY_AUDIO_SETTINGS"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "android.permission.PROCESS_OUTGOING_CALLS"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, "android.permission.RECORD_AUDIO"

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sput-object v0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->am16permissions:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 92
    invoke-direct {p0}, Lcom/huawei/health/device/ui/BaseFragment;-><init>()V

    .line 108
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->isFirstDownload:Z

    .line 110
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->isFinishDeviceMainActivity:Z

    .line 128
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->toDownloadList:Ljava/util/ArrayList;

    .line 130
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->productIdList:Ljava/util/ArrayList;

    .line 136
    new-instance v0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment$1;

    invoke-direct {v0, p0}, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment$1;-><init>(Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;)V

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->mProHandler:Landroid/os/Handler;

    .line 663
    new-instance v0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment$5;

    invoke-direct {v0, p0}, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment$5;-><init>(Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;)V

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->mOnPageChangeListener:Landroid/support/v4/view/ViewPager$OnPageChangeListener;

    return-void
.end method

.method static synthetic access$000(Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;)Lo/afj;
    .locals 1

    .line 92
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->mProductInfo:Lo/afj;

    return-object v0
.end method

.method static synthetic access$002(Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;Lo/afj;)Lo/afj;
    .locals 0

    .line 92
    iput-object p1, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->mProductInfo:Lo/afj;

    return-object p1
.end method

.method static synthetic access$100(Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;ILjava/util/ArrayList;Ljava/lang/String;Lo/afj;Z)V
    .locals 0

    .line 92
    invoke-direct/range {p0 .. p5}, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->addImageAndText(ILjava/util/ArrayList;Ljava/lang/String;Lo/afj;Z)V

    return-void
.end method

.method static synthetic access$1000(Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;)V
    .locals 0

    .line 92
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->init()V

    return-void
.end method

.method static synthetic access$1100(Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;)V
    .locals 0

    .line 92
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->startDialog()V

    return-void
.end method

.method static synthetic access$1200(Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;Ljava/lang/String;)V
    .locals 0

    .line 92
    invoke-direct {p0, p1}, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->showDilog(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic access$1400(Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;)Landroid/app/Activity;
    .locals 1

    .line 92
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->mainActivity:Landroid/app/Activity;

    return-object v0
.end method

.method static synthetic access$1500(Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;)V
    .locals 0

    .line 92
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->showLoadingProgressBar()V

    return-void
.end method

.method static synthetic access$1600(Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;)Ljava/util/ArrayList;
    .locals 1

    .line 92
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->toDownloadList:Ljava/util/ArrayList;

    return-object v0
.end method

.method static synthetic access$1700(Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;)Landroid/app/Activity;
    .locals 1

    .line 92
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->mainActivity:Landroid/app/Activity;

    return-object v0
.end method

.method static synthetic access$1800(Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;)Landroid/app/Activity;
    .locals 1

    .line 92
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->mainActivity:Landroid/app/Activity;

    return-object v0
.end method

.method static synthetic access$1900(Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;)Ljava/util/ArrayList;
    .locals 1

    .line 92
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->mNavigation:Ljava/util/ArrayList;

    return-object v0
.end method

.method static synthetic access$200(Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;)Landroid/widget/TextView;
    .locals 1

    .line 92
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->mPrompt:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic access$2000(Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;)Landroid/app/Activity;
    .locals 1

    .line 92
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->mainActivity:Landroid/app/Activity;

    return-object v0
.end method

.method static synthetic access$2100(Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;)V
    .locals 0

    .line 92
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->bindDevice()V

    return-void
.end method

.method static synthetic access$2200(Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;)Landroid/app/Activity;
    .locals 1

    .line 92
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->mainActivity:Landroid/app/Activity;

    return-object v0
.end method

.method static synthetic access$2300(Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;Landroid/app/Activity;)V
    .locals 0

    .line 92
    invoke-direct {p0, p1}, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->checkHavePermission(Landroid/app/Activity;)V

    return-void
.end method

.method static synthetic access$2400(Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;Ljava/util/Map;)V
    .locals 0

    .line 92
    invoke-direct {p0, p1}, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->unBindDevice(Ljava/util/Map;)V

    return-void
.end method

.method static synthetic access$2500(Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;)Lo/egv;
    .locals 1

    .line 92
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->mUnbindDialog:Lo/egv;

    return-object v0
.end method

.method static synthetic access$2502(Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;Lo/egv;)Lo/egv;
    .locals 0

    .line 92
    iput-object p1, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->mUnbindDialog:Lo/egv;

    return-object p1
.end method

.method static synthetic access$2600(Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;)Ljava/util/ArrayList;
    .locals 1

    .line 92
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->productIdList:Ljava/util/ArrayList;

    return-object v0
.end method

.method static synthetic access$2700(Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;)Landroid/os/Handler;
    .locals 1

    .line 92
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->mProHandler:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic access$2802(Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;Z)Z
    .locals 0

    .line 92
    iput-boolean p1, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->isFirstDownload:Z

    return p1
.end method

.method static synthetic access$2900(Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;)I
    .locals 1

    .line 92
    iget v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->timePeriod:I

    return v0
.end method

.method static synthetic access$2902(Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;I)I
    .locals 0

    .line 92
    iput p1, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->timePeriod:I

    return p1
.end method

.method static synthetic access$300(Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;ILandroid/widget/TextView;)V
    .locals 0

    .line 92
    invoke-direct {p0, p1, p2}, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->setmPromptText(ILandroid/widget/TextView;)V

    return-void
.end method

.method static synthetic access$3000(Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;Landroid/content/Context;Ljava/lang/String;)I
    .locals 1

    .line 92
    invoke-direct {p0, p1, p2}, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->getTimePeriodByTimePeriodStr(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method static synthetic access$3100(Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;Ljava/lang/String;)V
    .locals 0

    .line 92
    invoke-direct {p0, p1}, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->gotoMeasure(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic access$3200(Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;)Lo/egv;
    .locals 1

    .line 92
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->mRingerModeDialog:Lo/egv;

    return-object v0
.end method

.method static synthetic access$400(Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;)V
    .locals 0

    .line 92
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->hideLoadingProgressBar()V

    return-void
.end method

.method static synthetic access$500(Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;)Lo/ags;
    .locals 1

    .line 92
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->mImgPagerAdapter:Lo/ags;

    return-object v0
.end method

.method static synthetic access$600(Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;)V
    .locals 0

    .line 92
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->setBuyBtnVisible()V

    return-void
.end method

.method static synthetic access$700(Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;)Lo/egd;
    .locals 1

    .line 92
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->tvButton:Lo/egd;

    return-object v0
.end method

.method static synthetic access$800(Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;)Ljava/lang/String;
    .locals 1

    .line 92
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->mProductId:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$900(Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;Ljava/lang/String;Lo/afj;)V
    .locals 0

    .line 92
    invoke-direct {p0, p1, p2}, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->setTitle(Ljava/lang/String;Lo/afj;)V

    return-void
.end method

.method private addImageAndText(ILjava/util/ArrayList;Ljava/lang/String;Lo/afj;Z)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ILjava/util/ArrayList<Ljava/lang/String;>;Ljava/lang/String;Lo/afj;Z)V"
        }
    .end annotation

    .line 517
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 519
    add-int/lit8 v2, p1, -0x1

    :goto_0
    if-ltz v2, :cond_1

    .line 520
    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/afe;->b(Landroid/content/Context;)Lo/afe;

    move-result-object v0

    invoke-virtual {p4}, Lo/afj;->d()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/afj$b;

    invoke-virtual {v1}, Lo/afj$b;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p3, v1}, Lo/afe;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 521
    if-eqz p5, :cond_0

    .line 522
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->text_list:Ljava/util/ArrayList;

    invoke-virtual {p4}, Lo/afj;->d()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/afj$b;

    invoke-virtual {v1}, Lo/afj$b;->e()Ljava/lang/String;

    move-result-object v1

    invoke-static {p3, v1}, Lo/afo;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 519
    :cond_0
    add-int/lit8 v2, v2, -0x1

    goto :goto_0

    :cond_1
    goto :goto_2

    .line 527
    :cond_2
    const/4 v2, 0x0

    :goto_1
    if-ge v2, p1, :cond_4

    .line 528
    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/afe;->b(Landroid/content/Context;)Lo/afe;

    move-result-object v0

    invoke-virtual {p4}, Lo/afj;->d()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/afj$b;

    invoke-virtual {v1}, Lo/afj$b;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p3, v1}, Lo/afe;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 529
    if-eqz p5, :cond_3

    .line 530
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->text_list:Ljava/util/ArrayList;

    invoke-virtual {p4}, Lo/afj;->d()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/afj$b;

    invoke-virtual {v1}, Lo/afj$b;->e()Ljava/lang/String;

    move-result-object v1

    invoke-static {p3, v1}, Lo/afo;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 527
    :cond_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 534
    :cond_4
    :goto_2
    return-void
.end method

.method private bindDevice()V
    .locals 6

    .line 965
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->mProductInfo:Lo/afj;

    invoke-virtual {v0}, Lo/afj;->i()Lo/acf;

    move-result-object v0

    invoke-virtual {v0}, Lo/acf;->e()I

    move-result v3

    .line 966
    const/4 v0, 0x1

    if-ne v3, v0, :cond_0

    .line 968
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->isGPSLocationEnable()Z

    move-result v0

    if-nez v0, :cond_0

    .line 969
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->showOpenGpsLocationDialog()V

    .line 970
    return-void

    .line 975
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->mProductInfo:Lo/afj;

    invoke-virtual {v0}, Lo/afj;->o()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 976
    new-instance v4, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment;

    invoke-direct {v4}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment;-><init>()V

    .line 977
    new-instance v5, Landroid/os/Bundle;

    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    .line 978
    const-string v0, "productId"

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->mProductId:Ljava/lang/String;

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 979
    const-string v0, "title"

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->mProductId:Ljava/lang/String;

    iget-object v2, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->mProductInfo:Lo/afj;

    invoke-direct {p0, v1, v2}, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->getTitle(Ljava/lang/String;Lo/afj;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 980
    invoke-virtual {v4, v5}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment;->setArguments(Landroid/os/Bundle;)V

    .line 981
    invoke-virtual {p0, v4}, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->switchFragment(Lcom/huawei/health/device/ui/BaseFragment;)V

    .line 982
    goto/16 :goto_0

    .line 983
    :cond_1
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->mProductId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/afd;->g(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 984
    new-instance v4, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningUniversalFragment;

    invoke-direct {v4}, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningUniversalFragment;-><init>()V

    .line 985
    new-instance v5, Landroid/os/Bundle;

    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    .line 986
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->mProductId:Ljava/lang/String;

    invoke-static {v0}, Lo/ahd;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 987
    invoke-static {}, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->hasAudioRecordPermission()Z

    move-result v0

    if-nez v0, :cond_2

    .line 988
    return-void

    .line 990
    :cond_2
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->isRingerModeNormal()Z

    move-result v0

    if-nez v0, :cond_3

    .line 991
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->showRingerModeDialog()V

    .line 992
    return-void

    .line 994
    :cond_3
    new-instance v4, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;

    invoke-direct {v4}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;-><init>()V

    .line 995
    const-string v0, "position"

    const/4 v1, 0x0

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 997
    :cond_4
    const-string v0, "productId"

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->mProductId:Ljava/lang/String;

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 998
    const-string v0, "title"

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->mProductId:Ljava/lang/String;

    iget-object v2, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->mProductInfo:Lo/afj;

    invoke-direct {p0, v1, v2}, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->getTitle(Ljava/lang/String;Lo/afj;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 999
    invoke-virtual {v4, v5}, Lcom/huawei/health/device/ui/BaseFragment;->setArguments(Landroid/os/Bundle;)V

    .line 1000
    invoke-virtual {p0, v4}, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->switchFragment(Lcom/huawei/health/device/ui/BaseFragment;)V

    .line 1001
    goto :goto_0

    .line 1002
    :cond_5
    new-instance v4, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment;

    invoke-direct {v4}, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment;-><init>()V

    .line 1003
    new-instance v5, Landroid/os/Bundle;

    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    .line 1004
    const-string v0, "productId"

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->mProductId:Ljava/lang/String;

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 1005
    const-string v0, "title"

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->mProductId:Ljava/lang/String;

    iget-object v2, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->mProductInfo:Lo/afj;

    invoke-direct {p0, v1, v2}, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->getTitle(Ljava/lang/String;Lo/afj;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 1006
    const-string v0, "scanMode"

    invoke-virtual {v5, v0, v3}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 1007
    invoke-virtual {v4, v5}, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment;->setArguments(Landroid/os/Bundle;)V

    .line 1008
    invoke-virtual {p0, v4}, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->switchFragment(Lcom/huawei/health/device/ui/BaseFragment;)V

    .line 1011
    :goto_0
    return-void
.end method

.method private checkHavePermission(Landroid/app/Activity;)V
    .locals 7

    .line 1177
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkHavePermission"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1186
    sget-object v0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->am16permissions:[Ljava/lang/String;

    invoke-static {p1, v0}, Lo/dbe;->c(Landroid/content/Context;[Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_6

    .line 1187
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_6

    .line 1188
    const-string v0, "android.permission.MODIFY_AUDIO_SETTINGS"

    invoke-static {p1, v0}, Lo/dbf;->l(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "android.permission.MODIFY_AUDIO_SETTINGS"

    .line 1189
    invoke-virtual {p1, v0}, Landroid/app/Activity;->shouldShowRequestPermissionRationale(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v4, 0x1

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    .line 1191
    :goto_0
    const-string v0, "android.permission.PROCESS_OUTGOING_CALLS"

    invoke-static {p1, v0}, Lo/dbf;->l(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "android.permission.PROCESS_OUTGOING_CALLS"

    .line 1192
    invoke-virtual {p1, v0}, Landroid/app/Activity;->shouldShowRequestPermissionRationale(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    :cond_2
    const/4 v5, 0x1

    goto :goto_1

    :cond_3
    const/4 v5, 0x0

    .line 1194
    :goto_1
    const-string v0, "android.permission.RECORD_AUDIO"

    invoke-static {p1, v0}, Lo/dbf;->l(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_4

    const-string v0, "android.permission.RECORD_AUDIO"

    .line 1195
    invoke-virtual {p1, v0}, Landroid/app/Activity;->shouldShowRequestPermissionRationale(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    :cond_4
    const/4 v6, 0x1

    goto :goto_2

    :cond_5
    const/4 v6, 0x0

    .line 1198
    :goto_2
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "checkHavePermission  "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "  "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "   "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1200
    if-nez v4, :cond_6

    if-nez v5, :cond_6

    if-nez v6, :cond_6

    .line 1201
    sget v0, Lcom/huawei/plugindevice/R$string;->IDS_hwh_home_healthshop_permission_str:I

    invoke-virtual {p1, v0}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lo/ene;->c(Landroid/content/Context;Ljava/lang/String;)V

    .line 1202
    return-void

    .line 1206
    :cond_6
    sget-object v0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->am16permissions:[Ljava/lang/String;

    invoke-direct {p0, p1, v0}, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->checkHavePermission(Landroid/app/Activity;[Ljava/lang/String;)V

    .line 1208
    return-void
.end method

.method private checkHavePermission(Landroid/app/Activity;[Ljava/lang/String;)V
    .locals 8

    .line 1212
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkHavePermission"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1213
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-ge v0, v1, :cond_0

    .line 1214
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->bindDevice()V

    .line 1215
    return-void

    .line 1217
    :cond_0
    invoke-static {p1, p2}, Lo/dbe;->c(Landroid/content/Context;[Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_5

    .line 1218
    new-instance v0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment$18;

    invoke-direct {v0, p0}, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment$18;-><init>(Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;)V

    invoke-static {p1, p2, v0}, Lo/dbe;->a(Landroid/app/Activity;[Ljava/lang/String;Lo/dbs;)V

    .line 1230
    move-object v4, p2

    array-length v5, v4

    const/4 v6, 0x0

    :goto_0
    if-ge v6, v5, :cond_4

    aget-object v7, v4, v6

    .line 1231
    const-string v0, "android.permission.RECORD_AUDIO"

    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1232
    const-string v0, "android.permission.RECORD_AUDIO"

    invoke-static {p1, v0}, Lo/dbf;->m(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_1

    .line 1233
    :cond_1
    const-string v0, "android.permission.MODIFY_AUDIO_SETTINGS"

    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1234
    const-string v0, "android.permission.MODIFY_AUDIO_SETTINGS"

    invoke-static {p1, v0}, Lo/dbf;->m(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_1

    .line 1235
    :cond_2
    const-string v0, "android.permission.PROCESS_OUTGOING_CALLS"

    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 1236
    const-string v0, "android.permission.PROCESS_OUTGOING_CALLS"

    invoke-static {p1, v0}, Lo/dbf;->m(Landroid/content/Context;Ljava/lang/String;)V

    .line 1230
    :cond_3
    :goto_1
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_4
    goto :goto_2

    .line 1240
    :cond_5
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->bindDevice()V

    .line 1242
    :goto_2
    return-void
.end method

.method private downloadSource(Ljava/lang/String;)V
    .locals 4

    .line 349
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->isNetWorkActive()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    if-eq v0, p1, :cond_1

    .line 350
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " fileId ===  "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 351
    invoke-static {}, Lo/ahd;->h()Z

    move-result v0

    if-nez v0, :cond_0

    .line 352
    invoke-static {}, Lo/afq;->e()Lo/afq;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->toDownloadList:Ljava/util/ArrayList;

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lo/afq;->c(Ljava/util/ArrayList;Z)V

    goto :goto_0

    .line 354
    :cond_0
    invoke-static {}, Lo/afq;->e()Lo/afq;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->toDownloadList:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Lo/afq;->b(Ljava/util/ArrayList;)V

    goto :goto_0

    .line 357
    :cond_1
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " fileId ===  "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 359
    :goto_0
    return-void
.end method

.method private getTimePeriodByTimePeriodStr(Landroid/content/Context;Ljava/lang/String;)I
    .locals 3

    .line 1145
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    .line 1146
    const/16 v2, 0x7df

    .line 1147
    const-string v0, "IDS_hw_show_healthdata_bloodsugar_before_breakfast"

    invoke-static {v0}, Lo/afo;->c(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v1, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1148
    const/16 v2, 0x7d8

    goto/16 :goto_0

    .line 1149
    :cond_0
    const-string v0, "IDS_hw_show_healthdata_bloodsugar_after_breakfast"

    invoke-static {v0}, Lo/afo;->c(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v1, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1150
    const/16 v2, 0x7d9

    goto/16 :goto_0

    .line 1151
    :cond_1
    const-string v0, "IDS_hw_show_healthdata_bloodsugar_before_lunch"

    invoke-static {v0}, Lo/afo;->c(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v1, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1152
    const/16 v2, 0x7da

    goto :goto_0

    .line 1153
    :cond_2
    const-string v0, "IDS_hw_show_healthdata_bloodsugar_after_lunch"

    invoke-static {v0}, Lo/afo;->c(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v1, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 1154
    const/16 v2, 0x7db

    goto :goto_0

    .line 1155
    :cond_3
    const-string v0, "IDS_hw_show_healthdata_bloodsugar_before_dinner"

    invoke-static {v0}, Lo/afo;->c(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v1, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 1156
    const/16 v2, 0x7dc

    goto :goto_0

    .line 1157
    :cond_4
    const-string v0, "IDS_hw_show_healthdata_bloodsugar_after_dinner"

    invoke-static {v0}, Lo/afo;->c(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v1, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 1158
    const/16 v2, 0x7dd

    goto :goto_0

    .line 1159
    :cond_5
    const-string v0, "IDS_hw_show_healthdata_bloodsugar_early_morning"

    invoke-static {v0}, Lo/afo;->c(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v1, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 1160
    const/16 v2, 0x7df

    goto :goto_0

    .line 1161
    :cond_6
    const-string v0, "IDS_hw_show_healthdata_bloodsugar_before_sleep"

    invoke-static {v0}, Lo/afo;->c(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v1, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 1162
    const/16 v2, 0x7de

    .line 1164
    :cond_7
    :goto_0
    return v2
.end method

.method private getTitle(Ljava/lang/String;Lo/afj;)Ljava/lang/String;
    .locals 2

    .line 408
    invoke-virtual {p2}, Lo/afj;->n()Lo/afj$a;

    move-result-object v0

    invoke-virtual {v0}, Lo/afj$a;->e()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lo/afo;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 409
    const-string v0, "9323f6b7-b459-44f4-a698-988d1769832a"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 410
    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->l(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 411
    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->q(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 412
    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->e(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 413
    const-string v1, "HUAWEI FIT"

    .line 416
    :cond_0
    return-object v1
.end method

.method private gotoMeasure(Ljava/lang/String;)V
    .locals 10

    .line 1097
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/health/device/ui/DeviceMainActivity;

    .line 1098
    invoke-static {p1}, Lo/agd;->d(Ljava/lang/String;)Lcom/huawei/health/device/ui/BaseFragment;

    move-result-object v5

    .line 1099
    if-eqz v5, :cond_0

    .line 1100
    new-instance v6, Landroid/os/Bundle;

    invoke-direct {v6}, Landroid/os/Bundle;-><init>()V

    .line 1101
    const-string v0, "view"

    const-string v1, "measure"

    invoke-virtual {v6, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 1102
    const-string v0, "productId"

    invoke-virtual {v6, v0, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 1103
    invoke-virtual {v5, v6}, Lcom/huawei/health/device/ui/BaseFragment;->setArguments(Landroid/os/Bundle;)V

    .line 1104
    invoke-virtual {p0, v5}, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->switchFragment(Lcom/huawei/health/device/ui/BaseFragment;)V

    .line 1105
    const-class v0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;

    invoke-virtual {v4, v0}, Lcom/huawei/health/device/ui/DeviceMainActivity;->e(Ljava/lang/Class;)V

    .line 1106
    goto/16 :goto_0

    .line 1107
    :cond_0
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/afd;->b(Ljava/lang/String;)Lo/acl;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/acp;

    .line 1108
    const-string v0, "01"

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->mProductInfo:Lo/afj;

    iget-object v1, v1, Lo/afj;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    .line 1109
    if-eqz v6, :cond_3

    .line 1110
    invoke-virtual {v6}, Lo/acp;->i()Z

    move-result v0

    if-eqz v0, :cond_1

    if-eqz v7, :cond_1

    .line 1111
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "the productId "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " is not res, and this is auto"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1112
    new-instance v8, Lcom/huawei/health/device/ui/measure/fragment/DeviceSilentGuideFragment;

    invoke-direct {v8}, Lcom/huawei/health/device/ui/measure/fragment/DeviceSilentGuideFragment;-><init>()V

    .line 1113
    new-instance v9, Landroid/os/Bundle;

    invoke-direct {v9}, Landroid/os/Bundle;-><init>()V

    .line 1114
    const-string v0, "view"

    const-string v1, "bond"

    invoke-virtual {v9, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 1115
    const-string v0, "productId"

    invoke-virtual {v9, v0, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 1116
    invoke-virtual {v8, v9}, Lcom/huawei/health/device/ui/measure/fragment/DeviceSilentGuideFragment;->setArguments(Landroid/os/Bundle;)V

    .line 1117
    invoke-virtual {p0, v8}, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->switchFragment(Lcom/huawei/health/device/ui/BaseFragment;)V

    .line 1118
    const-class v0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;

    invoke-virtual {v4, v0}, Lcom/huawei/health/device/ui/DeviceMainActivity;->e(Ljava/lang/Class;)V

    .line 1119
    goto/16 :goto_0

    .line 1120
    :cond_1
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " the productId "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " is not res, and this is not auto  kind.name is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->kind:Lo/acl$a;

    invoke-virtual {v3}, Lo/acl$a;->name()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1121
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->kind:Lo/acl$a;

    invoke-virtual {v0}, Lo/acl$a;->name()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/agd;->d(Ljava/lang/String;)Lcom/huawei/health/device/ui/BaseFragment;

    move-result-object v8

    .line 1122
    if-eqz v8, :cond_2

    .line 1123
    new-instance v9, Landroid/os/Bundle;

    invoke-direct {v9}, Landroid/os/Bundle;-><init>()V

    .line 1124
    const-string v0, "view"

    const-string v1, "measure"

    invoke-virtual {v9, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 1125
    const-string v0, "kind"

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->kind:Lo/acl$a;

    invoke-virtual {v1}, Lo/acl$a;->name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v9, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 1126
    const-string v0, "productId"

    invoke-virtual {v9, v0, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 1127
    invoke-virtual {v8, v9}, Lcom/huawei/health/device/ui/BaseFragment;->setArguments(Landroid/os/Bundle;)V

    .line 1128
    invoke-virtual {p0, v8}, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->switchFragment(Lcom/huawei/health/device/ui/BaseFragment;)V

    .line 1129
    const-class v0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;

    invoke-virtual {v4, v0}, Lcom/huawei/health/device/ui/DeviceMainActivity;->e(Ljava/lang/Class;)V

    .line 1131
    :cond_2
    goto :goto_0

    .line 1133
    :cond_3
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "the device is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1136
    :goto_0
    return-void
.end method

.method public static hasAudioRecordPermission()Z
    .locals 10

    .line 1274
    const/4 v6, 0x1

    .line 1275
    new-instance v0, Landroid/media/AudioRecord;

    const/4 v1, 0x1

    const v2, 0xac44

    const/16 v3, 0x10

    const/4 v4, 0x1

    const v5, 0xac44

    invoke-direct/range {v0 .. v5}, Landroid/media/AudioRecord;-><init>(IIIII)V

    move-object v7, v0

    .line 1280
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    :try_start_0
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "new AudioRecrod state: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v7}, Landroid/media/AudioRecord;->getRecordingState()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1281
    invoke-virtual {v7}, Landroid/media/AudioRecord;->getRecordingState()I
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    .line 1282
    const/4 v6, 0x0

    .line 1283
    const/4 v8, 0x0

    .line 1295
    invoke-virtual {v7}, Landroid/media/AudioRecord;->release()V

    .line 1283
    return v8

    .line 1285
    :cond_0
    :try_start_1
    invoke-virtual {v7}, Landroid/media/AudioRecord;->startRecording()V

    .line 1286
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "startRecording state: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v7}, Landroid/media/AudioRecord;->getRecordingState()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1287
    invoke-virtual {v7}, Landroid/media/AudioRecord;->getRecordingState()I

    move-result v0

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    .line 1288
    const/4 v6, 0x0

    .line 1291
    :cond_1
    invoke-virtual {v7}, Landroid/media/AudioRecord;->stop()V
    :try_end_1
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1295
    invoke-virtual {v7}, Landroid/media/AudioRecord;->release()V

    .line 1296
    goto :goto_0

    .line 1292
    :catch_0
    move-exception v8

    .line 1293
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    :try_start_2
    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v8}, Ljava/lang/IllegalStateException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 1295
    invoke-virtual {v7}, Landroid/media/AudioRecord;->release()V

    .line 1296
    goto :goto_0

    .line 1295
    :catchall_0
    move-exception v9

    invoke-virtual {v7}, Landroid/media/AudioRecord;->release()V

    .line 1296
    throw v9

    .line 1297
    :goto_0
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "hasAudioRecordPermission: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1298
    return v6
.end method

.method private hideLoadingProgressBar()V
    .locals 2

    .line 536
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->mloadingProgressBar:Lhuawei/widget/HwProgressBar;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lhuawei/widget/HwProgressBar;->setVisibility(I)V

    .line 537
    return-void
.end method

.method private init()V
    .locals 10

    .line 286
    invoke-static {}, Lo/afq;->e()Lo/afq;

    move-result-object v0

    invoke-virtual {v0}, Lo/afq;->c()Lo/aey;

    move-result-object v0

    sget-object v1, Lo/acl$a;->g:Lo/acl$a;

    invoke-virtual {v0, v1}, Lo/aey;->c(Lo/acl$a;)Lo/afk;

    .line 287
    invoke-static {}, Lo/afq;->e()Lo/afq;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->mProductId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/afq;->e(Ljava/lang/String;)Lo/afj;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->mProductInfo:Lo/afj;

    .line 288
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->mProductInfo:Lo/afj;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 289
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "init():"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "mProductInfo = null"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 290
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 291
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "init():"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "this.getActivity() = "

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 292
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->finish()V

    .line 294
    :cond_0
    return-void

    .line 296
    :cond_1
    invoke-static {}, Lo/acq;->a()Lo/acq;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->mProductInfo:Lo/afj;

    invoke-virtual {v1}, Lo/afj;->g()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lo/afq;->e()Lo/afq;

    move-result-object v3

    iget-object v4, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->mProductId:Ljava/lang/String;

    invoke-virtual {v3, v4}, Lo/afq;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    sget-object v3, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->mProductInfo:Lo/afj;

    invoke-virtual {v3}, Lo/afj;->m()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo/acq;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 297
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->mProductInfo:Lo/afj;

    invoke-virtual {v0}, Lo/afj;->k()Lo/acl$a;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->kind:Lo/acl$a;

    .line 298
    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/afe;->b(Landroid/content/Context;)Lo/afe;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->mProductId:Ljava/lang/String;

    iget-object v2, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->mProductInfo:Lo/afj;

    invoke-virtual {v2}, Lo/afj;->d()Ljava/util/ArrayList;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo/afj$b;

    invoke-virtual {v2}, Lo/afj$b;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo/afe;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 299
    new-instance v6, Ljava/io/File;

    invoke-direct {v6, v5}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 301
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "ProductIntroductionFragment productid is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->mProductId:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 302
    invoke-static {}, Lo/afq;->e()Lo/afq;

    move-result-object v0

    invoke-virtual {v0}, Lo/afq;->c()Lo/aey;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->mProductId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/aey;->a(Ljava/lang/String;)Lo/afl;

    move-result-object v7

    .line 303
    const/4 v0, 0x0

    if-eq v0, v7, :cond_2

    invoke-virtual {v7}, Lo/afl;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->mProductInfo:Lo/afj;

    invoke-virtual {v1}, Lo/afj;->p()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    :cond_2
    const/4 v8, 0x1

    goto :goto_0

    :cond_3
    const/4 v8, 0x0

    .line 304
    :goto_0
    invoke-virtual {v6}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_4

    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->isNetWorkActive()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 305
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->showLoadingProgressBar()V

    .line 306
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->viewPager:Landroid/support/v4/view/ViewPager;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->setVisibility(I)V

    goto :goto_1

    .line 308
    :cond_4
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->hideLoadingProgressBar()V

    .line 309
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->viewPager:Landroid/support/v4/view/ViewPager;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->setVisibility(I)V

    .line 312
    :goto_1
    invoke-virtual {v6}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_5

    if-eqz v8, :cond_8

    .line 313
    :cond_5
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->isFirstDownload:Z

    .line 315
    invoke-static {}, Lo/afq;->e()Lo/afq;

    move-result-object v0

    invoke-virtual {v0}, Lo/afq;->c()Lo/aey;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->mProductId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/aey;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 317
    if-eqz v9, :cond_6

    .line 318
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->toDownloadList:Ljava/util/ArrayList;

    invoke-virtual {v0, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 321
    :cond_6
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->mProductId:Ljava/lang/String;

    invoke-static {v0}, Lo/ahd;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 323
    invoke-direct {p0, v6, v9}, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->initHonourDevice(Ljava/io/File;Ljava/lang/String;)V

    goto :goto_2

    .line 326
    :cond_7
    invoke-static {}, Lo/afq;->e()Lo/afq;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->toDownloadList:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Lo/afq;->b(Ljava/util/ArrayList;)V

    .line 329
    :goto_2
    goto :goto_3

    .line 331
    :cond_8
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->tvButton:Lo/egd;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/egd;->setEnabled(Z)V

    .line 333
    :goto_3
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->initView()V

    .line 334
    return-void
.end method

.method private initHonourDevice(Ljava/io/File;Ljava/lang/String;)V
    .locals 2

    .line 337
    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 339
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->tvButton:Lo/egd;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/egd;->setEnabled(Z)V

    .line 340
    invoke-static {}, Lo/afq;->e()Lo/afq;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->toDownloadList:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Lo/afq;->b(Ljava/util/ArrayList;)V

    goto :goto_0

    .line 343
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->tvButton:Lo/egd;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egd;->setEnabled(Z)V

    .line 344
    invoke-direct {p0, p2}, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->downloadSource(Ljava/lang/String;)V

    .line 346
    :goto_0
    return-void
.end method

.method private initNavigation()V
    .locals 9

    .line 629
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ProductIntroductionFragment initNavigation() "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 630
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->child:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->device_navigation_spot:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/widget/LinearLayout;

    .line 632
    const/4 v5, 0x0

    .line 633
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->mProductInfo:Lo/afj;

    invoke-virtual {v0}, Lo/afj;->d()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v6

    .line 634
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->mNavigation:Ljava/util/ArrayList;

    .line 635
    :goto_0
    if-ge v5, v6, :cond_3

    .line 636
    new-instance v7, Landroid/widget/ImageView;

    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->mainActivity:Landroid/app/Activity;

    invoke-direct {v7, v0}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 637
    new-instance v8, Landroid/widget/LinearLayout$LayoutParams;

    const/16 v0, 0x10

    const/16 v1, 0x10

    invoke-direct {v8, v0, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 638
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->mainActivity:Landroid/app/Activity;

    invoke-static {v0}, Lo/ahf;->b(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 639
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->mainActivity:Landroid/app/Activity;

    const/high16 v1, 0x40c00000    # 6.0f

    invoke-static {v0, v1}, Lo/ahf;->b(Landroid/content/Context;F)I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v8, v1, v2, v0, v3}, Landroid/widget/LinearLayout$LayoutParams;->setMargins(IIII)V

    .line 640
    add-int/lit8 v0, v6, -0x1

    if-ne v0, v5, :cond_0

    .line 641
    sget v0, Lcom/huawei/plugindevice/R$drawable;->btn_health_point_orange_sel:I

    invoke-virtual {v7, v0}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 642
    invoke-virtual {v7, v8}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_1

    .line 644
    :cond_0
    invoke-virtual {v7, v8}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 645
    sget v0, Lcom/huawei/plugindevice/R$drawable;->btn_health_point_gray_nor:I

    invoke-virtual {v7, v0}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    goto :goto_1

    .line 648
    :cond_1
    const/4 v0, 0x0

    if-ne v0, v5, :cond_2

    .line 649
    sget v0, Lcom/huawei/plugindevice/R$drawable;->btn_health_point_orange_sel:I

    invoke-virtual {v7, v0}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 650
    invoke-virtual {v7, v8}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_1

    .line 652
    :cond_2
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->mainActivity:Landroid/app/Activity;

    const/high16 v1, 0x40c00000    # 6.0f

    invoke-static {v0, v1}, Lo/ahf;->b(Landroid/content/Context;F)I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v8, v0, v1, v2, v3}, Landroid/widget/LinearLayout$LayoutParams;->setMargins(IIII)V

    .line 653
    invoke-virtual {v7, v8}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 654
    sget v0, Lcom/huawei/plugindevice/R$drawable;->btn_health_point_gray_nor:I

    invoke-virtual {v7, v0}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 658
    :goto_1
    invoke-virtual {v4, v7}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 659
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->mNavigation:Ljava/util/ArrayList;

    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 635
    add-int/lit8 v5, v5, 0x1

    goto/16 :goto_0

    .line 661
    :cond_3
    return-void
.end method

.method private initNetWorkTipView()V
    .locals 4

    .line 1026
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->child:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->nfc_tip_title_layout:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/widget/LinearLayout;

    .line 1027
    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 1029
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->child:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->nfc_tip_goto_setting_layout:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroid/widget/LinearLayout;

    .line 1030
    invoke-virtual {v3, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1031
    return-void
.end method

.method private initView()V
    .locals 7

    .line 426
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->mProductInfo:Lo/afj;

    invoke-virtual {v0}, Lo/afj;->d()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 427
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ProductIntroductionFragment initView() deviceInfo size is zero"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 428
    return-void

    .line 434
    :cond_0
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->isNetWorkActive()Z

    move-result v0

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->isFirstDownload:Z

    if-eqz v0, :cond_1

    .line 435
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->initNetWorkTipView()V

    .line 439
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->child:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->tv_device_device_introduction_prompt:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->mPrompt:Landroid/widget/TextView;

    .line 440
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->mPrompt:Landroid/widget/TextView;

    invoke-static {}, Landroid/text/method/ScrollingMovementMethod;->getInstance()Landroid/text/method/MovementMethod;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setMovementMethod(Landroid/text/method/MovementMethod;)V

    .line 442
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->initNavigation()V

    .line 444
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->mProductId:Ljava/lang/String;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->mProductInfo:Lo/afj;

    invoke-direct {p0, v0, v1}, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->setTitle(Ljava/lang/String;Lo/afj;)V

    .line 447
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->text_list:Ljava/util/ArrayList;

    .line 448
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 450
    move-object v0, p0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->mProductInfo:Lo/afj;

    invoke-virtual {v1}, Lo/afj;->d()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    move-object v2, v6

    iget-object v3, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->mProductId:Ljava/lang/String;

    iget-object v4, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->mProductInfo:Lo/afj;

    const/4 v5, 0x1

    invoke-direct/range {v0 .. v5}, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->addImageAndText(ILjava/util/ArrayList;Ljava/lang/String;Lo/afj;Z)V

    .line 452
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->mPrompt:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-direct {p0, v1, v0}, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->setmPromptText(ILandroid/widget/TextView;)V

    .line 453
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ProductIntroductionFragment ----2----"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 454
    new-instance v0, Lo/ags;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->mainActivity:Landroid/app/Activity;

    invoke-direct {v0, v6, v1}, Lo/ags;-><init>(Ljava/util/ArrayList;Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->mImgPagerAdapter:Lo/ags;

    .line 456
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->viewPager:Landroid/support/v4/view/ViewPager;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->mImgPagerAdapter:Lo/ags;

    invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->setAdapter(Landroid/support/v4/view/PagerAdapter;)V

    .line 457
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->viewPager:Landroid/support/v4/view/ViewPager;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->mOnPageChangeListener:Landroid/support/v4/view/ViewPager$OnPageChangeListener;

    invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->setOnPageChangeListener(Landroid/support/v4/view/ViewPager$OnPageChangeListener;)V

    .line 459
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 460
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->viewPager:Landroid/support/v4/view/ViewPager;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->mProductInfo:Lo/afj;

    invoke-virtual {v1}, Lo/afj;->d()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->setCurrentItem(I)V

    .line 463
    :cond_2
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->child:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->hw_show_buy_device_ll:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->mLlbuyTextView:Landroid/widget/LinearLayout;

    .line 464
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->child:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->hw_show_buy_device:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->buyTextView:Landroid/widget/TextView;

    .line 465
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->buyTextView:Landroid/widget/TextView;

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_device_buy_bind_device_string:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 467
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->setBuyBtnVisible()V

    .line 468
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->isNoneBondedDevice()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 469
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->setBindButtonText(Z)V

    .line 470
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->kind:Lo/acl$a;

    sget-object v1, Lo/acl$a;->g:Lo/acl$a;

    if-eq v0, v1, :cond_4

    .line 471
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->mLlbuyTextView:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 472
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->buyTextView:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 473
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->buyTextView:Landroid/widget/TextView;

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_device_measureactivity_guide_start_measure:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    goto :goto_0

    .line 476
    :cond_3
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->setBindButtonText(Z)V

    .line 478
    :cond_4
    :goto_0
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->buyTextView:Landroid/widget/TextView;

    invoke-direct {p0, v0}, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->stringTruncation(Landroid/widget/TextView;)V

    .line 479
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->mLlbuyTextView:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 482
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->mProductId:Ljava/lang/String;

    const-string v1, "c647e381-165c-44d2-8e7b-6339c7904fde"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    .line 483
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->tvButton:Lo/egd;

    invoke-virtual {v0, p0}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 486
    :cond_5
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->tvButton:Lo/egd;

    invoke-virtual {v0, p0}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 487
    return-void
.end method

.method private isBluetooth()Z
    .locals 2

    .line 543
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->mProductInfo:Lo/afj;

    invoke-virtual {v0}, Lo/afj;->i()Lo/acf;

    move-result-object v0

    invoke-virtual {v0}, Lo/acf;->e()I

    move-result v1

    .line 544
    const/4 v0, 0x2

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    if-ne v0, v1, :cond_1

    .line 545
    :cond_0
    const/4 v0, 0x1

    return v0

    .line 547
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method private isGPSLocationEnable()Z
    .locals 7

    .line 804
    const/4 v4, 0x1

    .line 805
    const/4 v5, 0x1

    .line 806
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_0

    .line 807
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->mainActivity:Landroid/app/Activity;

    const-string v1, "location"

    invoke-virtual {v0, v1}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Landroid/location/LocationManager;

    .line 809
    const-string v0, "gps"

    invoke-virtual {v6, v0}, Landroid/location/LocationManager;->isProviderEnabled(Ljava/lang/String;)Z

    move-result v4

    .line 810
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isGPSLocationEnable\uff1a"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 811
    const-string v0, "network"

    invoke-virtual {v6, v0}, Landroid/location/LocationManager;->isProviderEnabled(Ljava/lang/String;)Z

    move-result v5

    .line 812
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isNetWorkLocationEnable\uff1a"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 815
    :cond_0
    if-nez v4, :cond_1

    if-eqz v5, :cond_2

    :cond_1
    const/4 v0, 0x1

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private isNetWorkActive()Z
    .locals 4

    .line 1014
    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v0

    const-string v1, "connectivity"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/net/ConnectivityManager;

    .line 1015
    invoke-virtual {v2}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object v3

    .line 1016
    if-eqz v3, :cond_0

    invoke-virtual {v3}, Landroid/net/NetworkInfo;->isConnected()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private isNoneBondedDevice()Z
    .locals 2

    .line 1169
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->mProductId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/afd;->g(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1170
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->mProductId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/afd;->d(Ljava/lang/String;)Lcom/huawei/hihealth/device/open/HealthDevice;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0

    .line 1172
    :cond_1
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->mProductId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/afd;->b(Ljava/lang/String;)Lo/acl;

    move-result-object v0

    if-eqz v0, :cond_2

    const/4 v0, 0x1

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    :goto_1
    return v0
.end method

.method private jumpToNetWorkSetting()V
    .locals 2

    .line 1021
    new-instance v1, Landroid/content/Intent;

    const-string v0, "android.settings.SETTINGS"

    invoke-direct {v1, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 1022
    invoke-virtual {p0, v1}, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->startActivity(Landroid/content/Intent;)V

    .line 1023
    return-void
.end method

.method private onClickBuyButton(Ljava/util/Map;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;)V"
        }
    .end annotation

    .line 1034
    sget-object v0, Lo/dae;->fD:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v4

    .line 1035
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v4, p1, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 1037
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->mProductInfo:Lo/afj;

    const-string v1, "miaomall_url"

    invoke-virtual {v0, v1}, Lo/afj;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 1039
    if-nez v5, :cond_0

    .line 1040
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ProductIntroductionFragment haven\'t get miaomall url"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1041
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->mProductInfo:Lo/afj;

    const-string v1, "buy_url"

    invoke-virtual {v0, v1}, Lo/afj;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 1044
    :cond_0
    invoke-virtual {v5}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 1045
    new-instance v6, Landroid/content/Intent;

    invoke-direct {v6}, Landroid/content/Intent;-><init>()V

    .line 1046
    const-string v0, "com.huawei.health"

    invoke-virtual {v6, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 1047
    const-string v0, "com.huawei.health"

    const-string v1, "com.huawei.operation.activity.WebViewActivity"

    invoke-virtual {v6, v0, v1}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 1048
    const-string v0, "url"

    invoke-virtual {v6, v0, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 1049
    const-string v0, "EXTRA_BI_ID"

    const-string v1, ""

    invoke-virtual {v6, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 1050
    const-string v0, "EXTRA_BI_NAME"

    const-string v1, ""

    invoke-virtual {v6, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 1051
    const-string v0, "EXTRA_BI_SOURCE"

    const-string v1, "Device"

    invoke-virtual {v6, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 1052
    invoke-virtual {p0, v6}, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->startActivity(Landroid/content/Intent;)V

    .line 1053
    goto :goto_0

    .line 1054
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->mainActivity:Landroid/app/Activity;

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_device_datasourceactivity_no_vmall:I

    invoke-static {v0, v1}, Lo/agh;->e(Landroid/content/Context;I)V

    .line 1056
    :goto_0
    return-void
.end method

.method private onClickMeasureButton()V
    .locals 2

    .line 1059
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->kind:Lo/acl$a;

    sget-object v1, Lo/acl$a;->c:Lo/acl$a;

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->kind:Lo/acl$a;

    sget-object v1, Lo/acl$a;->a:Lo/acl$a;

    if-ne v0, v1, :cond_1

    .line 1060
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->mProductId:Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->gotoMeasure(Ljava/lang/String;)V

    goto :goto_0

    .line 1062
    :cond_1
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->showChooseTimerDialog()V

    .line 1064
    :goto_0
    return-void
.end method

.method private setBindButtonText(Z)V
    .locals 3

    .line 551
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->isBluetooth()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 552
    if-eqz p1, :cond_0

    .line 553
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->tvButton:Lo/egd;

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_hw_health_wear_connect_device_unpair_button:I

    invoke-virtual {v0, v1}, Lo/egd;->setText(I)V

    goto :goto_0

    .line 555
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->tvButton:Lo/egd;

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_device_start_paring_title:I

    invoke-virtual {v0, v1}, Lo/egd;->setText(I)V

    goto :goto_0

    .line 558
    :cond_1
    if-eqz p1, :cond_2

    .line 559
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->tvButton:Lo/egd;

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_device_selection_unbind_device:I

    invoke-virtual {v0, v1}, Lo/egd;->setText(I)V

    goto :goto_0

    .line 561
    :cond_2
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->tvButton:Lo/egd;

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_device_selection_bind_device:I

    invoke-virtual {v0, v1}, Lo/egd;->setText(I)V

    .line 565
    :goto_0
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v2

    .line 566
    const/4 v0, 0x0

    if-eq v0, v2, :cond_3

    .line 567
    if-eqz p1, :cond_3

    const-string v0, "isBindSuccess"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 568
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->isFinishDeviceMainActivity:Z

    .line 571
    :cond_3
    return-void
.end method

.method private setBuyBtnVisible()V
    .locals 3

    .line 574
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->mProductInfo:Lo/afj;

    const-string v1, "buy_url"

    invoke-virtual {v0, v1}, Lo/afj;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 575
    if-eqz v2, :cond_0

    invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 577
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->mLlbuyTextView:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 578
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->buyTextView:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0

    .line 580
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->mLlbuyTextView:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 581
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->buyTextView:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 583
    :goto_0
    return-void
.end method

.method private setTitle(Ljava/lang/String;Lo/afj;)V
    .locals 1

    .line 421
    invoke-direct {p0, p1, p2}, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->getTitle(Ljava/lang/String;Lo/afj;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->setTitle(Ljava/lang/String;)V

    .line 422
    return-void
.end method

.method private setmPromptText(ILandroid/widget/TextView;)V
    .locals 12

    .line 586
    const/4 v0, 0x0

    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setScrollY(I)V

    .line 587
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_device_introductionactivity_picooc_s1pro_introductions_1:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v5

    .line 588
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_device_introductionactivity_suunto_introduction_3_1:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v6

    .line 589
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_device_introductionactivity_metis_introduction_1_1:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v7

    .line 590
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_device_huawei_body_fat_scale_description_2:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v8

    .line 591
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_DEVICE_ERGONOMIC_SH_2260_334:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v9

    .line 593
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->mProductId:Ljava/lang/String;

    invoke-static {v0}, Lo/ahd;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 594
    const v0, 0x800003

    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setGravity(I)V

    goto :goto_0

    .line 596
    :cond_0
    const/16 v0, 0x11

    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setGravity(I)V

    .line 598
    :goto_0
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 599
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->mProductInfo:Lo/afj;

    invoke-virtual {v0}, Lo/afj;->d()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/afj$b;

    invoke-virtual {v0}, Lo/afj$b;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v10

    .line 600
    const-string v0, "IDS_device_introductionactivity_picooc_s1pro_introduction_1"

    invoke-virtual {v10, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 601
    const/4 v0, 0x0

    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setScrollY(I)V

    .line 602
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const-wide/high16 v1, 0x4026000000000000L    # 11.0

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-static {v5, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v11

    .line 603
    invoke-virtual {p2, v11}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 604
    return-void

    .line 605
    :cond_1
    const-string v0, "IDS_device_introductionactivity_suunto_introduction_3"

    invoke-virtual {v10, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 606
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const-wide/high16 v1, 0x403e000000000000L    # 30.0

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-static {v6, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v11

    .line 607
    invoke-virtual {p2, v11}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 608
    return-void

    .line 609
    :cond_2
    const-string v0, "IDS_device_introductionactivity_metis_introduction_1"

    invoke-virtual {v10, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 610
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const-wide/high16 v1, 0x4038000000000000L    # 24.0

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-static {v7, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v11

    .line 611
    invoke-virtual {p2, v11}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 612
    return-void

    .line 613
    :cond_3
    const-string v0, "IDS_device_huawei_body_fat_scale_description_2"

    invoke-virtual {v10, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 614
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const-wide/high16 v1, 0x4022000000000000L    # 9.0

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-static {v8, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v11

    .line 615
    invoke-virtual {p2, v11}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 616
    return-void

    .line 617
    :cond_4
    const-string v0, "IDS_DEVICE_ERGONOMIC_SH_2260_334"

    invoke-virtual {v0, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 618
    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/Object;

    const-wide/high16 v1, 0x3ff0000000000000L    # 1.0

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-wide/high16 v1, 0x4000000000000000L    # 2.0

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    .line 619
    const-wide/high16 v1, 0x4014000000000000L    # 5.0

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    .line 618
    invoke-static {v9, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v11

    .line 620
    invoke-virtual {p2, v11}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 621
    return-void

    .line 624
    :cond_5
    const/4 v0, 0x0

    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setScrollY(I)V

    .line 625
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->text_list:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 626
    return-void
.end method

.method private showBluetoothUnBindDialog(Ljava/util/Map;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;)V"
        }
    .end annotation

    .line 889
    new-instance v0, Lo/egv$b;

    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/egv$b;-><init>(Landroid/content/Context;)V

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_hw_health_wear_connect_device_unpair_button:I

    .line 890
    invoke-virtual {v0, v1}, Lo/egv$b;->b(I)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_unbind_device_wear_home:I

    .line 891
    invoke-virtual {v0, v1}, Lo/egv$b;->e(I)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_hw_health_wear_connect_device_unpair_button:I

    new-instance v2, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment$15;

    invoke-direct {v2, p0, p1}, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment$15;-><init>(Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;Ljava/util/Map;)V

    .line 892
    invoke-virtual {v0, v1, v2}, Lo/egv$b;->e(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_settings_button_cancal:I

    new-instance v2, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment$14;

    invoke-direct {v2, p0}, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment$14;-><init>(Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;)V

    .line 905
    invoke-virtual {v0, v1, v2}, Lo/egv$b;->b(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    move-result-object v3

    .line 916
    invoke-virtual {v3}, Lo/egv$b;->b()Lo/egv;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->mUnbindDialog:Lo/egv;

    .line 917
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->mUnbindDialog:Lo/egv;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egv;->setCancelable(Z)V

    .line 918
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->mUnbindDialog:Lo/egv;

    invoke-virtual {v0}, Lo/egv;->show()V

    .line 919
    return-void
.end method

.method private showChooseTimerDialog()V
    .locals 5

    .line 1069
    const/16 v0, 0x7dc

    iput v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->timePeriod:I

    .line 1070
    new-instance v0, Lo/egz$d;

    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/egz$d;-><init>(Landroid/content/Context;)V

    .line 1071
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-virtual {v1}, Landroid/support/v4/app/FragmentActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const-string v2, "IDS_hw_show_healthdata_bloodsugar_timeperiod_array"

    .line 1072
    invoke-static {v2}, Lo/afo;->b(Ljava/lang/String;)I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    move-result-object v1

    .line 1071
    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egz$d;->d(Ljava/util/List;)Lo/egz$d;

    move-result-object v0

    const-string v1, "IDS_hw_show_healthdata_bloodsugar_timeperiod"

    .line 1073
    invoke-static {v1}, Lo/afo;->c(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Lo/egz$d;->d(I)Lo/egz$d;

    move-result-object v0

    new-instance v1, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment$17;

    invoke-direct {v1, p0}, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment$17;-><init>(Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;)V

    .line 1074
    invoke-virtual {v0, v1}, Lo/egz$d;->b(Lo/egz$c;)Lo/egz$d;

    move-result-object v0

    new-instance v1, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment$16;

    invoke-direct {v1, p0}, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment$16;-><init>(Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;)V

    .line 1086
    invoke-virtual {v0, v1}, Lo/egz$d;->e(Lo/egz$c;)Lo/egz$d;

    move-result-object v3

    .line 1092
    invoke-virtual {v3}, Lo/egz$d;->e()Lo/egz;

    move-result-object v4

    .line 1093
    invoke-virtual {v4}, Lo/egz;->show()V

    .line 1094
    return-void
.end method

.method private showDilog(Ljava/lang/String;)V
    .locals 12

    .line 363
    new-instance v4, Ljava/math/BigDecimal;

    invoke-static {p1}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v0

    const-wide/high16 v2, 0x4090000000000000L    # 1024.0

    div-double/2addr v0, v2

    const-wide/high16 v2, 0x4090000000000000L    # 1024.0

    div-double/2addr v0, v2

    invoke-direct {v4, v0, v1}, Ljava/math/BigDecimal;-><init>(D)V

    .line 364
    const/4 v0, 0x2

    const/4 v1, 0x4

    invoke-virtual {v4, v0, v1}, Ljava/math/BigDecimal;->setScale(II)Ljava/math/BigDecimal;

    move-result-object v0

    invoke-virtual {v0}, Ljava/math/BigDecimal;->doubleValue()D

    move-result-wide v5

    .line 366
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->hideLoadingProgressBar()V

    .line 367
    const-string v7, ""

    .line 368
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-nez v0, :cond_0

    .line 369
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->mainActivity:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_device_am16_download_tip:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v7

    goto :goto_0

    .line 371
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->mainActivity:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_device_am16_download_overseas_tip:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v7

    .line 373
    :goto_0
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->mainActivity:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_DEVICE_HONOUR_WIRED_830_41:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v8

    .line 374
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object v8, v0, v1

    const/4 v1, 0x1

    const/4 v2, 0x2

    invoke-static {v5, v6, v1, v2}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    invoke-static {v7, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    .line 375
    new-instance v0, Lo/egv$b;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->mainActivity:Landroid/app/Activity;

    invoke-direct {v0, v1}, Lo/egv$b;-><init>(Landroid/content/Context;)V

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_service_area_notice_title:I

    .line 376
    invoke-virtual {v0, v1}, Lo/egv$b;->b(I)Lo/egv$b;

    move-result-object v0

    .line 377
    invoke-virtual {v0, v9}, Lo/egv$b;->b(Ljava/lang/String;)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_settings_jawbone_download:I

    new-instance v2, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment$3;

    invoke-direct {v2, p0}, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment$3;-><init>(Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;)V

    .line 378
    invoke-virtual {v0, v1, v2}, Lo/egv$b;->e(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_settings_button_cancal:I

    new-instance v2, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment$2;

    invoke-direct {v2, p0}, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment$2;-><init>(Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;)V

    .line 394
    invoke-virtual {v0, v1, v2}, Lo/egv$b;->b(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    move-result-object v10

    .line 400
    invoke-virtual {v10}, Lo/egv$b;->b()Lo/egv;

    move-result-object v11

    .line 401
    const/4 v0, 0x0

    invoke-virtual {v11, v0}, Lo/egv;->setCancelable(Z)V

    .line 402
    invoke-virtual {v11}, Lo/egv;->isShowing()Z

    move-result v0

    if-nez v0, :cond_1

    .line 403
    invoke-virtual {v11}, Lo/egv;->show()V

    .line 405
    :cond_1
    return-void
.end method

.method private showLoadingProgressBar()V
    .locals 2

    .line 540
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->mloadingProgressBar:Lhuawei/widget/HwProgressBar;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lhuawei/widget/HwProgressBar;->setVisibility(I)V

    .line 541
    return-void
.end method

.method private showOpenGpsLocationDialog()V
    .locals 3

    .line 773
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->mCustomGpsViewDialog:Lo/egv;

    if-nez v0, :cond_0

    .line 774
    new-instance v0, Lo/egv$b;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->mainActivity:Landroid/app/Activity;

    invoke-direct {v0, v1}, Lo/egv$b;-><init>(Landroid/content/Context;)V

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_service_area_notice_title:I

    .line 775
    invoke-virtual {v0, v1}, Lo/egv$b;->b(I)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_btsdk_turn_on_location_new:I

    .line 776
    invoke-virtual {v0, v1}, Lo/egv$b;->e(I)Lo/egv$b;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->mainActivity:Landroid/app/Activity;

    sget v2, Lcom/huawei/plugindevice/R$string;->IDS_settings_button_cancal:I

    .line 777
    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment$9;

    invoke-direct {v2, p0}, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment$9;-><init>(Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;)V

    invoke-virtual {v0, v1, v2}, Lo/egv$b;->e(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egv$b;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->mainActivity:Landroid/app/Activity;

    sget v2, Lcom/huawei/plugindevice/R$string;->IDS_user_permission_ok:I

    .line 783
    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment$8;

    invoke-direct {v2, p0}, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment$8;-><init>(Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;)V

    invoke-virtual {v0, v1, v2}, Lo/egv$b;->b(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egv$b;

    move-result-object v0

    .line 790
    invoke-virtual {v0}, Lo/egv$b;->b()Lo/egv;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->mCustomGpsViewDialog:Lo/egv;

    .line 792
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->mCustomGpsViewDialog:Lo/egv;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egv;->setCancelable(Z)V

    .line 794
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->mCustomGpsViewDialog:Lo/egv;

    invoke-virtual {v0}, Lo/egv;->isShowing()Z

    move-result v0

    if-nez v0, :cond_1

    .line 795
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->mCustomGpsViewDialog:Lo/egv;

    invoke-virtual {v0}, Lo/egv;->show()V

    .line 797
    :cond_1
    return-void
.end method

.method private showOtherUnBindDialog(Ljava/util/Map;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;)V"
        }
    .end annotation

    .line 869
    new-instance v3, Lo/egy$b;

    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-direct {v3, v0}, Lo/egy$b;-><init>(Landroid/content/Context;)V

    .line 870
    sget v0, Lcom/huawei/plugindevice/R$string;->IDS_device_selection_cancel_unbind_device:I

    invoke-virtual {v3, v0}, Lo/egy$b;->b(I)Lo/egy$b;

    .line 871
    sget v0, Lcom/huawei/plugindevice/R$string;->IDS_device_ui_dialog_yes:I

    new-instance v1, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment$12;

    invoke-direct {v1, p0, p1}, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment$12;-><init>(Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;Ljava/util/Map;)V

    invoke-virtual {v3, v0, v1}, Lo/egy$b;->d(ILandroid/view/View$OnClickListener;)Lo/egy$b;

    .line 877
    sget v0, Lcom/huawei/plugindevice/R$string;->IDS_device_ui_dialog_no:I

    new-instance v1, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment$13;

    invoke-direct {v1, p0}, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment$13;-><init>(Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;)V

    invoke-virtual {v3, v0, v1}, Lo/egy$b;->e(ILandroid/view/View$OnClickListener;)Lo/egy$b;

    .line 883
    invoke-virtual {v3}, Lo/egy$b;->a()Lo/egy;

    move-result-object v2

    .line 884
    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Lo/egy;->setCancelable(Z)V

    .line 885
    invoke-virtual {v2}, Lo/egy;->show()V

    .line 886
    return-void
.end method

.method private showPermissionDialogTip()V
    .locals 6

    .line 822
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->mainActivity:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_plugin_device_am16_permission_tips:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    .line 823
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->mainActivity:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_DEVICE_HONOUR_WIRED_830_41:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 824
    new-instance v0, Lo/egy$b;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->mainActivity:Landroid/app/Activity;

    invoke-direct {v0, v1}, Lo/egy$b;-><init>(Landroid/content/Context;)V

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v4, v1, v2

    .line 825
    invoke-static {v3, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egy$b;->a(Ljava/lang/String;)Lo/egy$b;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->mainActivity:Landroid/app/Activity;

    sget v2, Lcom/huawei/plugindevice/R$string;->IDS_settings_button_cancal:I

    .line 826
    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment$11;

    invoke-direct {v2, p0}, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment$11;-><init>(Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;)V

    invoke-virtual {v0, v1, v2}, Lo/egy$b;->a(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egy$b;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->mainActivity:Landroid/app/Activity;

    sget v2, Lcom/huawei/plugindevice/R$string;->IDS_user_permission_ok:I

    .line 831
    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment$10;

    invoke-direct {v2, p0}, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment$10;-><init>(Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;)V

    invoke-virtual {v0, v1, v2}, Lo/egy$b;->c(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egy$b;

    move-result-object v0

    .line 838
    invoke-virtual {v0}, Lo/egy$b;->a()Lo/egy;

    move-result-object v5

    .line 839
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Lo/egy;->setCancelable(Z)V

    .line 840
    invoke-virtual {v5}, Lo/egy;->show()V

    .line 841
    return-void
.end method

.method private startDialog()V
    .locals 7

    .line 209
    invoke-static {}, Lo/afq;->e()Lo/afq;

    move-result-object v0

    invoke-virtual {v0}, Lo/afq;->c()Lo/aey;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->mProductId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/aey;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 210
    if-eqz v4, :cond_0

    .line 211
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->toDownloadList:Ljava/util/ArrayList;

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 214
    :cond_0
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " startDialog  fileId = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 216
    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/afe;->b(Landroid/content/Context;)Lo/afe;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->mProductId:Ljava/lang/String;

    iget-object v2, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->mProductInfo:Lo/afj;

    invoke-virtual {v2}, Lo/afj;->d()Ljava/util/ArrayList;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo/afj$b;

    invoke-virtual {v2}, Lo/afj$b;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo/afe;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 217
    new-instance v6, Ljava/io/File;

    invoke-direct {v6, v5}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 218
    invoke-virtual {v6}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_2

    .line 219
    invoke-static {}, Lo/ahd;->h()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 220
    invoke-static {}, Lo/afq;->e()Lo/afq;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->toDownloadList:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Lo/afq;->b(Ljava/util/ArrayList;)V

    goto :goto_0

    .line 222
    :cond_1
    invoke-static {}, Lo/afq;->e()Lo/afq;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->toDownloadList:Ljava/util/ArrayList;

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lo/afq;->c(Ljava/util/ArrayList;Z)V

    goto :goto_0

    .line 225
    :cond_2
    invoke-static {}, Lo/afq;->e()Lo/afq;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->toDownloadList:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Lo/afq;->b(Ljava/util/ArrayList;)V

    .line 227
    :goto_0
    return-void
.end method

.method private stringTruncation(Landroid/widget/TextView;)V
    .locals 4

    .line 490
    const/4 v2, 0x1

    new-array v2, v2, [I

    fill-array-data v2, :array_0

    .line 491
    const/4 v3, 0x0

    :goto_0
    const/4 v0, 0x6

    if-ge v3, v0, :cond_0

    .line 492
    invoke-virtual {p1}, Landroid/widget/TextView;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    new-instance v1, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment$4;

    invoke-direct {v1, p0, p1, v2}, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment$4;-><init>(Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;Landroid/widget/TextView;[I)V

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 491
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 512
    :cond_0
    return-void

    :array_0
    .array-data 4
        0xf
    .end array-data
.end method

.method private unBindDevice(Ljava/util/Map;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;)V"
        }
    .end annotation

    .line 845
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->unBindDeviceUniversal()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 847
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->mProductId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/afd;->h(Ljava/lang/String;)V

    .line 849
    sget-object v0, Lo/dae;->fM:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v3

    .line 850
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v3, p1, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 852
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->setBindButtonText(Z)V

    .line 853
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->buyTextView:Landroid/widget/TextView;

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_device_buy_bind_device_string:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 854
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->setBuyBtnVisible()V

    .line 856
    :cond_0
    return-void
.end method

.method private unBindDeviceUniversal()Z
    .locals 2

    .line 860
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->mProductId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/afd;->g(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 861
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->mProductId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/afd;->k(Ljava/lang/String;)Z

    move-result v0

    return v0

    .line 863
    :cond_0
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->mProductId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/afd;->i(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method


# virtual methods
.method public isRingerModeNormal()Z
    .locals 4

    .line 1306
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->mainActivity:Landroid/app/Activity;

    const-string v1, "audio"

    invoke-virtual {v0, v1}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/media/AudioManager;

    .line 1307
    invoke-virtual {v2}, Landroid/media/AudioManager;->getRingerMode()I

    move-result v3

    .line 1308
    const/4 v0, 0x2

    if-ne v3, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 5

    .line 1312
    invoke-super {p0, p1, p2, p3}, Lcom/huawei/health/device/ui/BaseFragment;->onActivityResult(IILandroid/content/Intent;)V

    .line 1313
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->mainActivity:Landroid/app/Activity;

    const-string v1, "notification"

    invoke-virtual {v0, v1}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/app/NotificationManager;

    .line 1314
    if-nez p1, :cond_0

    .line 1315
    invoke-virtual {v4}, Landroid/app/NotificationManager;->isNotificationPolicyAccessGranted()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1316
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "return from system settings...requestCode=="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1317
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->mainActivity:Landroid/app/Activity;

    sget-object v1, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->am16permissions:[Ljava/lang/String;

    invoke-direct {p0, v0, v1}, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->checkHavePermission(Landroid/app/Activity;[Ljava/lang/String;)V

    .line 1319
    :cond_0
    return-void
.end method

.method public onBackPressed()Z
    .locals 1

    .line 275
    invoke-static {}, Lo/afq;->e()Lo/afq;

    move-result-object v0

    invoke-virtual {v0}, Lo/afq;->d()V

    .line 276
    iget-boolean v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->isFinishDeviceMainActivity:Z

    if-eqz v0, :cond_0

    .line 277
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->popupFragment(Ljava/lang/Class;)V

    .line 278
    const/4 v0, 0x0

    return v0

    .line 280
    :cond_0
    invoke-super {p0}, Lcom/huawei/health/device/ui/BaseFragment;->onBackPressed()Z

    move-result v0

    return v0
.end method

.method public onClick(Landroid/view/View;)V
    .locals 9

    .line 701
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 702
    const-string v0, "click"

    const-string v1, "1"

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 703
    const-string v0, "device_name"

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->mProductInfo:Lo/afj;

    invoke-virtual {v1}, Lo/afj;->n()Lo/afj$a;

    move-result-object v1

    invoke-virtual {v1}, Lo/afj$a;->e()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 706
    sget v0, Lcom/huawei/plugindevice/R$id;->nfc_tip_goto_setting_layout:I

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v1

    if-ne v0, v1, :cond_0

    .line 707
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->isNetWorkActive()Z

    move-result v0

    if-nez v0, :cond_b

    .line 708
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->jumpToNetWorkSetting()V

    goto/16 :goto_0

    .line 710
    :cond_0
    sget v0, Lcom/huawei/plugindevice/R$id;->hw_show_buy_device_ll:I

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v1

    if-ne v0, v1, :cond_3

    .line 711
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->isNoneBondedDevice()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->kind:Lo/acl$a;

    sget-object v1, Lo/acl$a;->g:Lo/acl$a;

    if-ne v0, v1, :cond_2

    .line 712
    :cond_1
    invoke-direct {p0, v4}, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->onClickBuyButton(Ljava/util/Map;)V

    goto/16 :goto_0

    .line 714
    :cond_2
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->onClickMeasureButton()V

    goto/16 :goto_0

    .line 716
    :cond_3
    sget v0, Lcom/huawei/plugindevice/R$id;->bt_device_measure_guide_next:I

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v1

    if-ne v0, v1, :cond_b

    .line 718
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->isNoneBondedDevice()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 720
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->isBluetooth()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 721
    invoke-direct {p0, v4}, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->showBluetoothUnBindDialog(Ljava/util/Map;)V

    goto/16 :goto_0

    .line 723
    :cond_4
    invoke-direct {p0, v4}, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->showOtherUnBindDialog(Ljava/util/Map;)V

    goto/16 :goto_0

    .line 726
    :cond_5
    sget-object v0, Lo/dae;->fF:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v5

    .line 727
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v5, v4, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 729
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->mProductInfo:Lo/afj;

    invoke-virtual {v0}, Lo/afj;->i()Lo/acf;

    move-result-object v0

    invoke-virtual {v0}, Lo/acf;->e()I

    move-result v6

    .line 730
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "ProductIntroductionFragment onClick scanMode is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 733
    const/4 v0, 0x1

    if-eq v6, v0, :cond_6

    const/4 v0, 0x2

    if-ne v6, v0, :cond_7

    .line 734
    :cond_6
    invoke-static {}, Landroid/bluetooth/BluetoothAdapter;->getDefaultAdapter()Landroid/bluetooth/BluetoothAdapter;

    move-result-object v0

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothAdapter;->getState()I

    move-result v0

    const/16 v1, 0xc

    if-ne v1, v0, :cond_a

    .line 735
    :cond_7
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->mProductId:Ljava/lang/String;

    invoke-static {v0}, Lo/ahd;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 736
    invoke-static {}, Lo/ahd;->k()Z

    move-result v0

    if-nez v0, :cond_8

    .line 737
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->showPermissionDialogTip()V

    goto :goto_0

    .line 739
    :cond_8
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->mainActivity:Landroid/app/Activity;

    invoke-direct {p0, v0}, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->checkHavePermission(Landroid/app/Activity;)V

    goto :goto_0

    .line 742
    :cond_9
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->bindDevice()V

    goto :goto_0

    .line 746
    :cond_a
    new-instance v8, Lo/egy$b;

    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-direct {v8, v0}, Lo/egy$b;-><init>(Landroid/content/Context;)V

    .line 748
    sget v0, Lcom/huawei/plugindevice/R$string;->IDS_device_bluetooth_open_request:I

    invoke-virtual {v8, v0}, Lo/egy$b;->b(I)Lo/egy$b;

    .line 749
    sget v0, Lcom/huawei/plugindevice/R$string;->IDS_device_ui_dialog_yes:I

    new-instance v1, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment$6;

    invoke-direct {v1, p0}, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment$6;-><init>(Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;)V

    invoke-virtual {v8, v0, v1}, Lo/egy$b;->d(ILandroid/view/View$OnClickListener;)Lo/egy$b;

    .line 755
    sget v0, Lcom/huawei/plugindevice/R$string;->IDS_device_ui_dialog_no:I

    new-instance v1, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment$7;

    invoke-direct {v1, p0}, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment$7;-><init>(Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;)V

    invoke-virtual {v8, v0, v1}, Lo/egy$b;->e(ILandroid/view/View$OnClickListener;)Lo/egy$b;

    .line 762
    invoke-virtual {v8}, Lo/egy$b;->a()Lo/egy;

    move-result-object v7

    .line 763
    const/4 v0, 0x0

    invoke-virtual {v7, v0}, Lo/egy;->setCancelable(Z)V

    .line 764
    invoke-virtual {v7}, Lo/egy;->show()V

    .line 769
    :cond_b
    :goto_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 3

    .line 232
    invoke-super {p0, p1}, Lcom/huawei/health/device/ui/BaseFragment;->onCreate(Landroid/os/Bundle;)V

    .line 234
    invoke-static {}, Lo/afq;->e()Lo/afq;

    move-result-object v0

    new-instance v1, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment$ProIResourceFileListener;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment$ProIResourceFileListener;-><init>(Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment$1;)V

    invoke-virtual {v0, v1}, Lo/afq;->a(Lo/aff;)V

    .line 235
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 4

    .line 239
    invoke-super {p0, p1, p2, p3}, Lcom/huawei/health/device/ui/BaseFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroid/view/ViewGroup;

    .line 240
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "productId"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->mProductId:Ljava/lang/String;

    .line 241
    sget v0, Lcom/huawei/plugindevice/R$layout;->product_introduction_layout:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->child:Landroid/view/View;

    .line 242
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->child:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->vp_device_device_img:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v4/view/ViewPager;

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->viewPager:Landroid/support/v4/view/ViewPager;

    .line 243
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->child:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->bt_device_measure_guide_next:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->tvButton:Lo/egd;

    .line 244
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->productIdList:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->mProductId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 245
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->child:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->loading_pb:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lhuawei/widget/HwProgressBar;

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->mloadingProgressBar:Lhuawei/widget/HwProgressBar;

    .line 246
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->mloadingProgressBar:Lhuawei/widget/HwProgressBar;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lhuawei/widget/HwProgressBar;->setLayerType(ILandroid/graphics/Paint;)V

    .line 247
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->mProductId:Ljava/lang/String;

    invoke-static {v0}, Lo/ahd;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 248
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->showLoadingProgressBar()V

    .line 249
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->viewPager:Landroid/support/v4/view/ViewPager;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->setVisibility(I)V

    .line 251
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->tvButton:Lo/egd;

    invoke-direct {p0, v0}, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->stringTruncation(Landroid/widget/TextView;)V

    .line 252
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->init()V

    .line 253
    const/4 v0, 0x0

    if-eq v0, v3, :cond_1

    .line 254
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->child:Landroid/view/View;

    invoke-virtual {v3, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 256
    :cond_1
    return-object v3
.end method

.method public onDestroy()V
    .locals 4

    .line 261
    invoke-super {p0}, Lcom/huawei/health/device/ui/BaseFragment;->onDestroy()V

    .line 262
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ProductIntroductionFragment onDestroy"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 263
    return-void
.end method

.method public onDestroyView()V
    .locals 4

    .line 267
    invoke-super {p0}, Lcom/huawei/health/device/ui/BaseFragment;->onDestroyView()V

    .line 268
    invoke-static {}, Lo/afq;->e()Lo/afq;

    move-result-object v0

    invoke-virtual {v0}, Lo/afq;->d()V

    .line 269
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ProductIntroductionFragment onDestroyView"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 270
    return-void
.end method

.method public onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    .locals 4

    .line 1245
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onRequestPermissionsResult(),permissions:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    array-length v3, p2

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1246
    invoke-static {}, Lo/dbn;->c()Lo/dbn;

    move-result-object v0

    invoke-virtual {v0, p2, p3}, Lo/dbn;->c([Ljava/lang/String;[I)V

    .line 1247
    sget-object v0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->am16permissions:[Ljava/lang/String;

    const/4 v1, 0x2

    aget-object v0, v0, v1

    const/4 v1, 0x0

    aget-object v1, p2, v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    aget v0, p3, v0

    if-nez v0, :cond_0

    .line 1248
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->bindDevice()V

    .line 1250
    :cond_0
    return-void
.end method

.method public showRingerModeDialog()V
    .locals 4

    .line 1255
    new-instance v0, Lo/egv$b;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->mainActivity:Landroid/app/Activity;

    invoke-direct {v0, v1}, Lo/egv$b;-><init>(Landroid/content/Context;)V

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->mainActivity:Landroid/app/Activity;

    .line 1256
    invoke-virtual {v1}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/plugindevice/R$string;->IDS_service_area_notice_title:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egv$b;->e(Ljava/lang/String;)Lo/egv$b;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->mainActivity:Landroid/app/Activity;

    .line 1257
    invoke-virtual {v1}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/plugindevice/R$string;->IDS_device_bind_abnormal_mode_prompt:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egv$b;->b(Ljava/lang/String;)Lo/egv$b;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->mainActivity:Landroid/app/Activity;

    .line 1258
    invoke-virtual {v1}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/plugindevice/R$string;->IDS_common_notification_know_tips:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment$19;

    invoke-direct {v2, p0}, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment$19;-><init>(Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;)V

    invoke-virtual {v0, v1, v2}, Lo/egv$b;->b(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egv$b;

    move-result-object v3

    .line 1268
    invoke-virtual {v3}, Lo/egv$b;->b()Lo/egv;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->mRingerModeDialog:Lo/egv;

    .line 1269
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->mRingerModeDialog:Lo/egv;

    invoke-virtual {v0}, Lo/egv;->show()V

    .line 1270
    return-void
.end method
