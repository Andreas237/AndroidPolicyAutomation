.class public Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;
.super Lcom/huawei/health/device/ui/BaseFragment;
.source "SourceFile"


# static fields
.field private static final AM16_PRODUCTID:Ljava/lang/String; = "6d5416d9-2167-41df-ab10-c492e152b44f"

.field public static final DEVICE_KIND:Ljava/lang/String; = "device_kind"

.field public static final DEVICE_TYPE:Ljava/lang/String; = "device_type"

.field private static final DOWNLOAD_DESCRIPTION_START:I = 0x6a

.field private static final DOWNLOAD_FAIL:I = 0x65

.field private static final DOWNLOAD_PREPARING_STOP:I = 0x68

.field private static final DOWNLOAD_PREPARING_TIME_OUT:I = 0x69

.field private static final DOWNLOAD_PROGRESS:I = 0x67

.field private static final DOWNLOAD_START:I = 0x66

.field private static final DOWNLOAD_SUCCEED:I = 0x64

.field private static final HONOR_DEVICE:Ljava/lang/String; = "honor"

.field private static final HUAWEI_DEVICE:Ljava/lang/String; = "huawei"

.field private static final HUAWEI_FIT:Ljava/lang/String; = "HUAWEI FIT"

.field private static final MAX_PROGRESS:J = 0x63L

.field private static final METIS_PRODUCTID:Ljava/lang/String; = "9323f6b7-b459-44f4-a698-988d1769832a"

.field public static final OVERSEA_USER_AGREED:Ljava/lang/String; = "oversea_user_agreed"

.field private static final PUBLISH_ALL:Ljava/lang/String; = "3"

.field private static final PUBLISH_CHINA:Ljava/lang/String; = "1"

.field private static final PUBLISH_OVERSEA:Ljava/lang/String; = "2"

.field private static final TAG:Ljava/lang/String; = "PluginDevice_DeviceCategoryFragment"

.field private static final TIME_OUT_FIVE_SECOND:J = 0x1388L

.field private static final TO_FAILED:I = 0x2

.field private static final TO_REFRESH:I = 0x1


# instance fields
.field private mBundle:Landroid/os/Bundle;

.field private mCustomProgressDialog:Lo/ego;

.field private mCustomProgressDialogBuilder:Lo/ego$a;

.field private mDeviceListView:Landroid/widget/ListView;

.field private mDeviceType:Ljava/lang/String;

.field private mDownloadIndexFileListener:Lo/eaz;

.field private mDownloadedByte:J

.field private mDownloadedDescriptionFileNumber:J

.field private mErrorRyt:Landroid/widget/RelativeLayout;

.field private mErrorText:Landroid/widget/TextView;

.field private mHandler:Landroid/os/Handler;

.field private mHasDownloadedDevices:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/ear;>;"
        }
    .end annotation
.end field

.field private mHonor:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lo/afj;>;"
        }
    .end annotation
.end field

.field private mHuawei:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lo/afj;>;"
        }
    .end annotation
.end field

.field private mLoadingDialog:Lo/egn;

.field private mMainView:Landroid/view/View;

.field private mNeedDownloadByte:J

.field private mNeedDownloadDevices:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/ear;>;"
        }
    .end annotation
.end field

.field private mOnItemClickListener:Landroid/widget/AdapterView$OnItemClickListener;

.field private mOther:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lo/afj;>;"
        }
    .end annotation
.end field

.field private mOverseaDownloadConfirm:Lo/egv;

.field private mProductListAdapter:Lo/agu;

.field private final mRemoveDeviceList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/ear;>;"
        }
    .end annotation
.end field

.field private mWeightListAdapter:Lo/agt;

.field protected productInfos:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lo/afj;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 65
    invoke-direct {p0}, Lcom/huawei/health/device/ui/BaseFragment;-><init>()V

    .line 106
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->mNeedDownloadDevices:Ljava/util/List;

    .line 107
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->mHasDownloadedDevices:Ljava/util/List;

    .line 108
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->mHuawei:Ljava/util/ArrayList;

    .line 109
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->mHonor:Ljava/util/ArrayList;

    .line 110
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->mOther:Ljava/util/ArrayList;

    .line 111
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->productInfos:Ljava/util/ArrayList;

    .line 112
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->mRemoveDeviceList:Ljava/util/List;

    .line 264
    new-instance v0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment$5;

    invoke-direct {v0, p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment$5;-><init>(Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;)V

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->mOnItemClickListener:Landroid/widget/AdapterView$OnItemClickListener;

    .line 387
    new-instance v0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment$6;

    invoke-direct {v0, p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment$6;-><init>(Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;)V

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->mDownloadIndexFileListener:Lo/eaz;

    .line 747
    new-instance v0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment$11;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment$11;-><init>(Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->mHandler:Landroid/os/Handler;

    return-void
.end method

.method static synthetic access$000(Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;)Lo/egv;
    .locals 1

    .line 65
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->mOverseaDownloadConfirm:Lo/egv;

    return-object v0
.end method

.method static synthetic access$002(Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;Lo/egv;)Lo/egv;
    .locals 0

    .line 65
    iput-object p1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->mOverseaDownloadConfirm:Lo/egv;

    return-object p1
.end method

.method static synthetic access$100(Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;)Landroid/app/Activity;
    .locals 1

    .line 65
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->mainActivity:Landroid/app/Activity;

    return-object v0
.end method

.method static synthetic access$1000(Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;)V
    .locals 0

    .line 65
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->sendStopLoadMessage()V

    return-void
.end method

.method static synthetic access$1100(Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;)Ljava/lang/String;
    .locals 1

    .line 65
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->mDeviceType:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$1200(Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;Ljava/lang/String;)V
    .locals 0

    .line 65
    invoke-direct {p0, p1}, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->getAllDeviceInfoFromIndexFile(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic access$1300(Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;)Landroid/os/Handler;
    .locals 1

    .line 65
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->mHandler:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic access$1400(Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;)V
    .locals 0

    .line 65
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->showLocalDeviceResource()V

    return-void
.end method

.method static synthetic access$1500(Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;)V
    .locals 0

    .line 65
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->handleCancel()V

    return-void
.end method

.method static synthetic access$1600(Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;)Ljava/util/List;
    .locals 1

    .line 65
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->mRemoveDeviceList:Ljava/util/List;

    return-object v0
.end method

.method static synthetic access$1700(Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;)V
    .locals 0

    .line 65
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->sendDownloadDescriptionFileMsg()V

    return-void
.end method

.method static synthetic access$1800(Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;Lo/eba;Lo/eay;)V
    .locals 0

    .line 65
    invoke-direct {p0, p1, p2}, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->handleAfterDownLoad(Lo/eba;Lo/eay;)V

    return-void
.end method

.method static synthetic access$1900(Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;Lo/afj;)V
    .locals 0

    .line 65
    invoke-direct {p0, p1}, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->handlerToRefresh(Lo/afj;)V

    return-void
.end method

.method static synthetic access$200(Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;)Landroid/app/Activity;
    .locals 1

    .line 65
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->mainActivity:Landroid/app/Activity;

    return-object v0
.end method

.method static synthetic access$2000(Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;)Ljava/util/List;
    .locals 1

    .line 65
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->mHasDownloadedDevices:Ljava/util/List;

    return-object v0
.end method

.method static synthetic access$2100(Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;)J
    .locals 2

    .line 65
    iget-wide v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->mDownloadedByte:J

    return-wide v0
.end method

.method static synthetic access$2102(Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;J)J
    .locals 0

    .line 65
    iput-wide p1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->mDownloadedByte:J

    return-wide p1
.end method

.method static synthetic access$2200(Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;)Ljava/util/List;
    .locals 1

    .line 65
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->mNeedDownloadDevices:Ljava/util/List;

    return-object v0
.end method

.method static synthetic access$2300(Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;I)V
    .locals 0

    .line 65
    invoke-direct {p0, p1}, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->downloadOneZipFile(I)V

    return-void
.end method

.method static synthetic access$2400(Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;)Landroid/app/Activity;
    .locals 1

    .line 65
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->mainActivity:Landroid/app/Activity;

    return-object v0
.end method

.method static synthetic access$2500(Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;Lo/afj;)V
    .locals 0

    .line 65
    invoke-direct {p0, p1}, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->refreshDeviceList(Lo/afj;)V

    return-void
.end method

.method static synthetic access$2600(Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;)V
    .locals 0

    .line 65
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->startDownLoadProgress()V

    return-void
.end method

.method static synthetic access$2700(Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;)V
    .locals 0

    .line 65
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->showErrorLayout()V

    return-void
.end method

.method static synthetic access$2800(Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;Ljava/util/List;)V
    .locals 0

    .line 65
    invoke-direct {p0, p1}, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->downLoadDescriptionJsonFile(Ljava/util/List;)V

    return-void
.end method

.method static synthetic access$2900(Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;I)V
    .locals 0

    .line 65
    invoke-direct {p0, p1}, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->showDownloadProgress(I)V

    return-void
.end method

.method static synthetic access$300(Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;)V
    .locals 0

    .line 65
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->downloadIndexFile()V

    return-void
.end method

.method static synthetic access$3000(Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;)V
    .locals 0

    .line 65
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->closeProgress()V

    return-void
.end method

.method static synthetic access$3100(Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;)V
    .locals 0

    .line 65
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->stopLoading()V

    return-void
.end method

.method static synthetic access$3200(Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;)Landroid/app/Activity;
    .locals 1

    .line 65
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->mainActivity:Landroid/app/Activity;

    return-object v0
.end method

.method static synthetic access$3300(Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;)V
    .locals 0

    .line 65
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->switchDeviceScanningFragment()V

    return-void
.end method

.method static synthetic access$400(Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;)Landroid/app/Activity;
    .locals 1

    .line 65
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->mainActivity:Landroid/app/Activity;

    return-object v0
.end method

.method static synthetic access$500(Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;)V
    .locals 0

    .line 65
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->retryDownloadDeviceIndexFile()V

    return-void
.end method

.method static synthetic access$600(Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;)Lo/agt;
    .locals 1

    .line 65
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->mWeightListAdapter:Lo/agt;

    return-object v0
.end method

.method static synthetic access$700(Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;Lcom/huawei/health/device/ui/BaseFragment;)V
    .locals 0

    .line 65
    invoke-virtual {p0, p1}, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->switchFragment(Lcom/huawei/health/device/ui/BaseFragment;)V

    return-void
.end method

.method static synthetic access$800(Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;)Lo/agu;
    .locals 1

    .line 65
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->mProductListAdapter:Lo/agu;

    return-object v0
.end method

.method static synthetic access$900(Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;ILo/agu;)V
    .locals 0

    .line 65
    invoke-direct {p0, p1, p2}, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->handleClickEvent(ILo/agu;)V

    return-void
.end method

.method private bindView()V
    .locals 4

    .line 199
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->mainActivity:Landroid/app/Activity;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 200
    const-string v0, "PluginDevice_DeviceCategoryFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "bindView null == mainActivity"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 201
    return-void

    .line 204
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->mBundle:Landroid/os/Bundle;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 205
    const-string v0, "PluginDevice_DeviceCategoryFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "bindView null == mBundle"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 206
    return-void

    .line 208
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->mBundle:Landroid/os/Bundle;

    const-string v1, "device_kind"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->setTitle(Ljava/lang/String;)V

    .line 209
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->mMainView:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->device_list_view:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ListView;

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->mDeviceListView:Landroid/widget/ListView;

    .line 210
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->mBundle:Landroid/os/Bundle;

    const-string v1, "device_type"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->mDeviceType:Ljava/lang/String;

    .line 211
    const-string v0, "PluginDevice_DeviceCategoryFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "bindView mDeviceType = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->mDeviceType:Ljava/lang/String;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 212
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->mMainView:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->addDevice_error_layout:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->mErrorRyt:Landroid/widget/RelativeLayout;

    .line 213
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->mErrorRyt:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 214
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->mErrorRyt:Landroid/widget/RelativeLayout;

    new-instance v1, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment$3;

    invoke-direct {v1, p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment$3;-><init>(Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;)V

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 225
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->mMainView:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->adddevice_error_text:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->mErrorText:Landroid/widget/TextView;

    .line 226
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->mDeviceType:Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->initMoreButtonView(Ljava/lang/String;)V

    .line 227
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->initListView()V

    .line 229
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->showLocalDeviceResource()V

    .line 230
    return-void
.end method

.method private buildDeviceListFromIndexFile(Ljava/lang/String;)V
    .locals 7

    .line 454
    invoke-static {}, Lo/eaw;->d()Lo/eaw;

    move-result-object v0

    invoke-virtual {v0}, Lo/eaw;->b()Ljava/util/List;

    move-result-object v4

    .line 455
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 456
    const-string v0, "PluginDevice_DeviceCategoryFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "buildDeviceListFromIndexFile null == deviceList"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 457
    return-void

    .line 459
    :cond_0
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/ear;

    .line 460
    invoke-virtual {v6}, Lo/ear;->b()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    invoke-virtual {v6}, Lo/ear;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 462
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 464
    invoke-virtual {v6}, Lo/ear;->e()Ljava/lang/String;

    move-result-object v0

    const-string v1, "2"

    invoke-static {v0, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 465
    invoke-virtual {v6}, Lo/ear;->e()Ljava/lang/String;

    move-result-object v0

    const-string v1, "3"

    invoke-static {v0, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 466
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->mNeedDownloadDevices:Ljava/util/List;

    invoke-interface {v0, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 470
    :cond_2
    invoke-virtual {v6}, Lo/ear;->e()Ljava/lang/String;

    move-result-object v0

    const-string v1, "1"

    invoke-static {v0, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 471
    invoke-virtual {v6}, Lo/ear;->e()Ljava/lang/String;

    move-result-object v0

    const-string v1, "3"

    invoke-static {v0, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 472
    :cond_3
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->mNeedDownloadDevices:Ljava/util/List;

    invoke-interface {v0, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 476
    :cond_4
    :goto_1
    goto :goto_0

    .line 477
    :cond_5
    return-void
.end method

.method private buildNeedUpdateDownLoadDeviceList(Ljava/util/List;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/ear;>;)V"
        }
    .end annotation

    .line 579
    const-string v0, "PluginDevice_DeviceCategoryFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "buildNeedUpdateDownLoadDeviceList enter "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 580
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->mRemoveDeviceList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 581
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 582
    const-string v0, "PluginDevice_DeviceCategoryFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "buildNeedUpdateDownLoadDeviceList uuidList.isEmpty()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 583
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->sendDownloadDescriptionFileMsg()V

    .line 584
    return-void

    .line 587
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/ear;

    invoke-virtual {v0}, Lo/ear;->d()Ljava/lang/String;

    move-result-object v4

    .line 588
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/ear;

    .line 590
    invoke-static {}, Lo/eaw;->d()Lo/eaw;

    move-result-object v0

    invoke-virtual {v6}, Lo/ear;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/eaw;->c(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 592
    invoke-static {}, Lo/eaw;->d()Lo/eaw;

    move-result-object v0

    invoke-virtual {v6}, Lo/ear;->d()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment$8;

    invoke-direct {v2, p0, v6, v4}, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment$8;-><init>(Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;Lo/ear;Ljava/lang/String;)V

    invoke-virtual {v0, v1, v2}, Lo/eaw;->c(Ljava/lang/String;Lo/eaz;)V

    goto :goto_1

    .line 606
    :cond_1
    invoke-virtual {v6}, Lo/ear;->d()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 607
    const-string v0, "PluginDevice_DeviceCategoryFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "buildNeedUpdateDownLoadDeviceList finish checking"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 608
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->sendDownloadDescriptionFileMsg()V

    .line 611
    :cond_2
    :goto_1
    goto :goto_0

    .line 612
    :cond_3
    return-void
.end method

.method private checkLocalDeviceResourceExists(Ljava/lang/String;Z)V
    .locals 8

    .line 308
    invoke-static {}, Lo/eaw;->d()Lo/eaw;

    move-result-object v0

    invoke-virtual {v0}, Lo/eaw;->b()Ljava/util/List;

    move-result-object v4

    .line 309
    if-eqz v4, :cond_0

    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 310
    :cond_0
    if-eqz p2, :cond_7

    .line 311
    const-string v0, "PluginDevice_DeviceCategoryFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkLocalDeviceResourceExists indexInfosCache.size = 0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 312
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->startLoading()V

    goto/16 :goto_2

    .line 315
    :cond_1
    const-string v0, "PluginDevice_DeviceCategoryFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkLocalDeviceResourceExists indexInfosCache.size > 0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 316
    const/4 v5, 0x0

    .line 317
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lo/ear;

    .line 318
    invoke-virtual {v7}, Lo/ear;->b()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_5

    invoke-virtual {v7}, Lo/ear;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 319
    const-string v0, "PluginDevice_DeviceCategoryFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "checkLocalDeviceResourceExists has band plugin info from cache, uuid :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v7}, Lo/ear;->d()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 321
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 323
    invoke-virtual {v7}, Lo/ear;->e()Ljava/lang/String;

    move-result-object v0

    const-string v1, "2"

    invoke-static {v0, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 324
    invoke-virtual {v7}, Lo/ear;->e()Ljava/lang/String;

    move-result-object v0

    const-string v1, "3"

    invoke-static {v0, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 325
    :cond_2
    invoke-virtual {v7}, Lo/ear;->d()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->checkLocalDeviceResourceExists(Ljava/lang/String;)Z

    move-result v5

    goto :goto_1

    .line 329
    :cond_3
    invoke-virtual {v7}, Lo/ear;->e()Ljava/lang/String;

    move-result-object v0

    const-string v1, "1"

    invoke-static {v0, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 330
    invoke-virtual {v7}, Lo/ear;->e()Ljava/lang/String;

    move-result-object v0

    const-string v1, "3"

    invoke-static {v0, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 331
    :cond_4
    invoke-virtual {v7}, Lo/ear;->d()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->checkLocalDeviceResourceExists(Ljava/lang/String;)Z

    move-result v5

    .line 335
    :cond_5
    :goto_1
    goto/16 :goto_0

    .line 336
    :cond_6
    if-nez v5, :cond_7

    if-eqz p2, :cond_7

    .line 338
    const-string v0, "PluginDevice_DeviceCategoryFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkLocalDeviceResourceExists have not done file "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 339
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->startLoading()V

    .line 342
    :cond_7
    :goto_2
    return-void
.end method

.method private checkLocalDeviceResourceExists(Ljava/lang/String;)Z
    .locals 4

    .line 346
    invoke-static {}, Lo/eaw;->d()Lo/eaw;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/eaw;->c(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 347
    invoke-static {}, Lo/afq;->e()Lo/afq;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/afq;->e(Ljava/lang/String;)Lo/afj;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->handlerToRefresh(Lo/afj;)V

    .line 348
    const/4 v0, 0x1

    return v0

    .line 350
    :cond_0
    const-string v0, "PluginDevice_DeviceCategoryFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkLocalDeviceResourceExists device not available"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 351
    const/4 v0, 0x0

    return v0
.end method

.method private closeProgress()V
    .locals 4

    .line 740
    const-string v0, "PluginDevice_DeviceCategoryFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter closeProgress"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 741
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->mCustomProgressDialog:Lo/ego;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->mCustomProgressDialog:Lo/ego;

    invoke-virtual {v0}, Lo/ego;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->mainActivity:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 742
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->mCustomProgressDialog:Lo/ego;

    invoke-virtual {v0}, Lo/ego;->cancel()V

    .line 743
    const-string v0, "PluginDevice_DeviceCategoryFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter closeProgress cancel"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 745
    :cond_0
    return-void
.end method

.method private downLoadDescriptionJsonFile(Ljava/util/List;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/ear;>;)V"
        }
    .end annotation

    .line 626
    const-string v0, "PluginDevice_DeviceCategoryFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "downLoadDescriptionJsonFile enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 627
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->stopLoading()V

    .line 629
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v4

    .line 630
    const/16 v0, 0x66

    iput v0, v4, Landroid/os/Message;->what:I

    .line 631
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->mHandler:Landroid/os/Handler;

    invoke-virtual {v0, v4}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 633
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->mNeedDownloadByte:J

    .line 634
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->mDownloadedDescriptionFileNumber:J

    .line 636
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/ear;

    .line 637
    invoke-static {}, Lo/eaw;->d()Lo/eaw;

    move-result-object v0

    invoke-virtual {v6}, Lo/ear;->d()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment$9;

    invoke-direct {v2, p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment$9;-><init>(Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;)V

    invoke-virtual {v0, v1, v2}, Lo/eaw;->b(Ljava/lang/String;Lo/eaz;)V

    .line 647
    goto :goto_0

    .line 648
    :cond_0
    return-void
.end method

.method private downloadIndexFile()V
    .locals 2

    .line 296
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->mDeviceType:Ljava/lang/String;

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1}, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->checkLocalDeviceResourceExists(Ljava/lang/String;Z)V

    .line 297
    invoke-static {}, Lo/eaw;->d()Lo/eaw;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->mDownloadIndexFileListener:Lo/eaz;

    invoke-virtual {v0, v1}, Lo/eaw;->a(Lo/eaz;)V

    .line 298
    return-void
.end method

.method private downloadOneZipFile(I)V
    .locals 5

    .line 686
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->mNeedDownloadDevices:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lt p1, v0, :cond_0

    .line 687
    return-void

    .line 690
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->mNeedDownloadDevices:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/ear;

    .line 691
    const-string v0, "PluginDevice_DeviceCategoryFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter downloadOneZipFile uuid = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Lo/ear;->d()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 692
    invoke-static {}, Lo/eaw;->d()Lo/eaw;

    move-result-object v0

    invoke-virtual {v4}, Lo/ear;->d()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment$10;

    invoke-direct {v2, p0, v4, p1}, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment$10;-><init>(Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;Lo/ear;I)V

    invoke-virtual {v0, v1, v2}, Lo/eaw;->e(Ljava/lang/String;Lo/eaz;)V

    .line 725
    return-void
.end method

.method private downloadZipFile()V
    .locals 4

    .line 675
    const-string v0, "PluginDevice_DeviceCategoryFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "enter downloadZipFile size\uff1a"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->mNeedDownloadDevices:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 676
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->mHasDownloadedDevices:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 677
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->mNeedDownloadDevices:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 678
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->downloadOneZipFile(I)V

    .line 680
    :cond_0
    return-void
.end method

.method private getAllDeviceInfoFromIndexFile(Ljava/lang/String;)V
    .locals 5

    .line 421
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->mNeedDownloadDevices:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 422
    invoke-static {}, Lo/eaw;->d()Lo/eaw;

    move-result-object v0

    invoke-virtual {v0}, Lo/eaw;->b()Ljava/util/List;

    move-result-object v4

    .line 423
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 424
    :cond_0
    const-string v0, "PluginDevice_DeviceCategoryFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getAllDeviceInfoFromIndexFile no index info"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 426
    :cond_1
    invoke-direct {p0, p1}, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->buildDeviceListFromIndexFile(Ljava/lang/String;)V

    .line 427
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->mNeedDownloadDevices:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 428
    const-string v0, "PluginDevice_DeviceCategoryFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getAllDeviceInfoFromIndexFile no current device type devices"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 431
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 432
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->mPresetDeviceInOverseaMap:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-direct {p0, v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->showPreSetDevice(Ljava/util/List;)V

    goto :goto_0

    .line 434
    :cond_2
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->mPresetDeviceInChinaMap:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-direct {p0, v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->showPreSetDevice(Ljava/util/List;)V

    goto :goto_0

    .line 438
    :cond_3
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->mNeedDownloadDevices:Ljava/util/List;

    invoke-direct {p0, v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->getUuidList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->showPreSetDevice(Ljava/util/List;)V

    .line 439
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->mNeedDownloadDevices:Ljava/util/List;

    invoke-direct {p0, v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->buildNeedUpdateDownLoadDeviceList(Ljava/util/List;)V

    .line 442
    :goto_0
    return-void
.end method

.method private getUuidList(Ljava/util/List;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/ear;>;)Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation

    .line 445
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 446
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/ear;

    .line 447
    invoke-virtual {v3}, Lo/ear;->d()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 448
    goto :goto_0

    .line 450
    :cond_0
    return-object v1
.end method

.method private handleAfterDownLoad(Lo/eba;Lo/eay;)V
    .locals 5

    .line 651
    const-string v0, "PluginDevice_DeviceCategoryFragment"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleAfterDownLoad total size is"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p1}, Lo/eba;->d()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, "pull size is "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-virtual {p1}, Lo/eba;->b()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, " and uuid is "

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-virtual {p2}, Lo/eay;->g()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 653
    iget v0, p1, Lo/eba;->c:I

    const/4 v1, 0x1

    if-ne v1, v0, :cond_0

    .line 654
    iget-wide v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->mNeedDownloadByte:J

    invoke-virtual {p1}, Lo/eba;->d()I

    move-result v2

    int-to-long v2, v2

    add-long/2addr v0, v2

    iput-wide v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->mNeedDownloadByte:J

    .line 655
    iget-wide v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->mDownloadedDescriptionFileNumber:J

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    iput-wide v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->mDownloadedDescriptionFileNumber:J

    .line 656
    const-string v0, "PluginDevice_DeviceCategoryFragment"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleAfterDownLoad has downloaded "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-wide v2, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->mDownloadedDescriptionFileNumber:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " description file"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 657
    iget-wide v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->mDownloadedDescriptionFileNumber:J

    iget-object v2, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->mNeedDownloadDevices:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    int-to-long v2, v2

    cmp-long v0, v0, v2

    if-nez v0, :cond_1

    .line 658
    const-string v0, "PluginDevice_DeviceCategoryFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleAfterDownLoad completed and download byte = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-wide v2, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->mNeedDownloadByte:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 660
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->downloadZipFile()V

    goto :goto_0

    .line 664
    :cond_0
    const-string v0, "PluginDevice_DeviceCategoryFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleAfterDownLoad fail"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 665
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v4

    .line 666
    const/16 v0, 0x65

    iput v0, v4, Landroid/os/Message;->what:I

    .line 667
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->mHandler:Landroid/os/Handler;

    invoke-virtual {v0, v4}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 669
    :cond_1
    :goto_0
    return-void
.end method

.method private handleCancel()V
    .locals 6

    .line 521
    const-string v0, "PluginDevice_DeviceCategoryFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter handleCancel"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 523
    invoke-static {}, Lo/ebb;->b()Lo/ebb;

    move-result-object v0

    invoke-virtual {v0}, Lo/ebb;->a()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/eay;

    .line 524
    invoke-static {}, Lo/eaw;->d()Lo/eaw;

    move-result-object v0

    invoke-virtual {v0, v5}, Lo/eaw;->d(Lo/eay;)V

    .line 525
    goto :goto_0

    .line 528
    :cond_0
    return-void
.end method

.method private handleClickEvent(ILo/agu;)V
    .locals 10

    .line 272
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 273
    const-string v0, "click"

    const-string v1, "1"

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 274
    sget-object v0, Lo/dae;->fC:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v5

    .line 275
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v5, v4, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 276
    invoke-virtual {p2}, Lo/agu;->getCount()I

    move-result v0

    if-lt p1, v0, :cond_0

    .line 277
    const-string v0, "PluginDevice_DeviceCategoryFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleClickEvent outofbounds exception "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 278
    return-void

    .line 281
    :cond_0
    invoke-virtual {p2, p1}, Lo/agu;->getItem(I)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/afa;

    .line 282
    invoke-virtual {v6}, Lo/afa;->a()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_2

    .line 283
    invoke-virtual {v6}, Lo/afa;->e()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lo/afj;

    .line 284
    new-instance v8, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;

    invoke-direct {v8}, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;-><init>()V

    .line 285
    invoke-static {v7}, Lo/ake;->d(Lo/afj;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 286
    new-instance v8, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;

    invoke-direct {v8}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;-><init>()V

    .line 288
    :cond_1
    new-instance v9, Landroid/os/Bundle;

    invoke-direct {v9}, Landroid/os/Bundle;-><init>()V

    .line 289
    const-string v0, "productId"

    invoke-virtual {v7}, Lo/afj;->h()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v9, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 290
    invoke-virtual {v8, v9}, Lcom/huawei/health/device/ui/BaseFragment;->setArguments(Landroid/os/Bundle;)V

    .line 291
    invoke-virtual {p0, v8}, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->switchFragment(Lcom/huawei/health/device/ui/BaseFragment;)V

    .line 293
    :cond_2
    return-void
.end method

.method private handlerToRefresh(Lo/afj;)V
    .locals 2

    .line 572
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v1

    .line 573
    const/4 v0, 0x1

    iput v0, v1, Landroid/os/Message;->what:I

    .line 574
    iput-object p1, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 575
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->mHandler:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 576
    return-void
.end method

.method private initListView()V
    .locals 3

    .line 233
    sget-object v0, Lo/acl$a;->c:Lo/acl$a;

    invoke-virtual {v0}, Lo/acl$a;->name()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->mDeviceType:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 234
    new-instance v0, Lo/agt;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->mainActivity:Landroid/app/Activity;

    iget-object v2, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->productInfos:Ljava/util/ArrayList;

    invoke-direct {v0, v1, v2}, Lo/agt;-><init>(Landroid/content/Context;Ljava/util/ArrayList;)V

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->mWeightListAdapter:Lo/agt;

    .line 235
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->mDeviceListView:Landroid/widget/ListView;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->mWeightListAdapter:Lo/agt;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 236
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->mDeviceListView:Landroid/widget/ListView;

    new-instance v1, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment$4;

    invoke-direct {v1, p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment$4;-><init>(Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;)V

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    goto :goto_0

    .line 258
    :cond_0
    new-instance v0, Lo/agu;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->mainActivity:Landroid/app/Activity;

    iget-object v2, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->productInfos:Ljava/util/ArrayList;

    invoke-direct {v0, v1, v2}, Lo/agu;-><init>(Landroid/content/Context;Ljava/util/ArrayList;)V

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->mProductListAdapter:Lo/agu;

    .line 259
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->mDeviceListView:Landroid/widget/ListView;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->mProductListAdapter:Lo/agu;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 260
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->mDeviceListView:Landroid/widget/ListView;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->mOnItemClickListener:Landroid/widget/AdapterView$OnItemClickListener;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 262
    :goto_0
    return-void
.end method

.method private initMoreButtonView(Ljava/lang/String;)V
    .locals 4

    .line 976
    const-string v0, "PluginDevice_DeviceCategoryFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " initMoreButtonView"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 979
    sget-object v0, Lo/acl$a;->g:Lo/acl$a;

    invoke-virtual {v0}, Lo/acl$a;->name()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 980
    new-instance v0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment$12;

    invoke-direct {v0, p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment$12;-><init>(Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;)V

    const/4 v1, 0x1

    invoke-direct {p0, v1, v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->showMoreButton(ZLandroid/view/View$OnClickListener;)V

    goto :goto_0

    .line 1017
    :cond_0
    new-instance v0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment$13;

    invoke-direct {v0, p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment$13;-><init>(Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;)V

    const/4 v1, 0x0

    invoke-direct {p0, v1, v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->showMoreButton(ZLandroid/view/View$OnClickListener;)V

    .line 1024
    :goto_0
    return-void
.end method

.method private productInfosSort(Ljava/util/ArrayList;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lo/afj;>;)V"
        }
    .end annotation

    .line 924
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->mHuawei:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 925
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->mHonor:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 926
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->mOther:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 927
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lo/afj;

    .line 928
    invoke-virtual {v2}, Lo/afj;->n()Lo/afj$a;

    move-result-object v3

    .line 929
    const/4 v0, 0x0

    if-eq v0, v3, :cond_2

    .line 930
    iget-object v4, v3, Lo/afj$a;->a:Ljava/lang/String;

    .line 931
    const/4 v0, 0x0

    if-eq v0, v4, :cond_1

    .line 932
    const-string v0, "huawei"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 933
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->mHuawei:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 934
    :cond_0
    const-string v0, "honor"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 935
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->mHonor:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 938
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->mOther:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 941
    :cond_2
    :goto_1
    goto :goto_0

    .line 942
    :cond_3
    return-void
.end method

.method private query(Ljava/util/ArrayList;Lo/afj;)I
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lo/afj;>;Lo/afj;)I"
        }
    .end annotation

    .line 951
    invoke-virtual {p2}, Lo/afj;->h()Ljava/lang/String;

    move-result-object v1

    .line 952
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/afj;

    .line 953
    invoke-virtual {v3}, Lo/afj;->h()Ljava/lang/String;

    move-result-object v4

    .line 954
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    .line 955
    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 956
    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    move-result v0

    return v0

    .line 959
    :cond_0
    goto :goto_0

    .line 960
    :cond_1
    const/4 v0, -0x1

    return v0
.end method

.method private refreshDeviceList(Lo/afj;)V
    .locals 7

    .line 796
    const-string v0, "9323f6b7-b459-44f4-a698-988d1769832a"

    invoke-virtual {p1}, Lo/afj;->h()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    const-string v0, "6d5416d9-2167-41df-ab10-c492e152b44f"

    .line 797
    invoke-virtual {p1}, Lo/afj;->h()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 798
    invoke-virtual {p1}, Lo/afj;->h()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/ahd;->k(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_3

    .line 800
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->mDeviceType:Ljava/lang/String;

    sget-object v1, Lo/acl$a;->c:Lo/acl$a;

    invoke-virtual {v1}, Lo/acl$a;->name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 801
    invoke-virtual {p1}, Lo/afj;->n()Lo/afj$a;

    move-result-object v0

    iget-object v4, v0, Lo/afj$a;->a:Ljava/lang/String;

    .line 802
    const-string v0, "PluginDevice_DeviceCategoryFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleMessage company"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 803
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->productInfos:Ljava/util/ArrayList;

    invoke-direct {p0, v0, p1, v4}, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->sort(Ljava/util/ArrayList;Lo/afj;Ljava/lang/String;)V

    .line 805
    :try_start_0
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->mWeightListAdapter:Lo/agt;

    invoke-virtual {v0}, Lo/agt;->notifyDataSetChanged()V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 810
    goto :goto_1

    .line 806
    :catch_0
    move-exception v5

    .line 807
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    if-ne v0, v1, :cond_1

    const/4 v6, 0x1

    goto :goto_0

    :cond_1
    const/4 v6, 0x0

    .line 808
    :goto_0
    const-string v0, "PluginDevice_DeviceCategoryFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " handleMessage TO_REFRESH HDK_WEIGHT isMain"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 809
    const-string v0, "PluginDevice_DeviceCategoryFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " handleMessage TO_REFRESH HDK_WEIGHT e"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v5}, Ljava/lang/IllegalStateException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 811
    :goto_1
    goto :goto_3

    .line 812
    :cond_2
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->mProductListAdapter:Lo/agu;

    invoke-virtual {v0, p1}, Lo/agu;->b(Lo/afj;)V

    .line 814
    :try_start_1
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->mProductListAdapter:Lo/agu;

    invoke-virtual {v0}, Lo/agu;->notifyDataSetChanged()V
    :try_end_1
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_1

    .line 819
    goto :goto_3

    .line 815
    :catch_1
    move-exception v4

    .line 816
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    if-ne v0, v1, :cond_3

    const/4 v5, 0x1

    goto :goto_2

    :cond_3
    const/4 v5, 0x0

    .line 817
    :goto_2
    const-string v0, "PluginDevice_DeviceCategoryFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " handleMessage TO_REFRESH isMain"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 818
    const-string v0, "PluginDevice_DeviceCategoryFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " handleMessage TO_REFRESH e"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Ljava/lang/IllegalStateException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 822
    :cond_4
    :goto_3
    return-void
.end method

.method private retryDownloadDeviceIndexFile()V
    .locals 2

    .line 728
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->mErrorRyt:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 729
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 730
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->showDownloadDialogForOverSeaVersion()V

    goto :goto_0

    .line 732
    :cond_0
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->downloadIndexFile()V

    .line 734
    :goto_0
    return-void
.end method

.method private sendDownloadDescriptionFileMsg()V
    .locals 2

    .line 615
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v1

    .line 616
    const/16 v0, 0x6a

    iput v0, v1, Landroid/os/Message;->what:I

    .line 617
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->mRemoveDeviceList:Ljava/util/List;

    iput-object v0, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 618
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->mHandler:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 619
    return-void
.end method

.method private sendStopLoadMessage()V
    .locals 2

    .line 409
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v1

    .line 410
    const/16 v0, 0x68

    iput v0, v1, Landroid/os/Message;->what:I

    .line 411
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->mHandler:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 412
    return-void
.end method

.method private showDownloadDialogForOverSeaVersion()V
    .locals 6

    .line 137
    const-string v0, "PluginDevice_DeviceCategoryFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showDownloadDialogForOverSeaVersion enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 138
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0x2718

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "oversea_user_agreed"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 140
    const-string v0, "PluginDevice_DeviceCategoryFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "showDownloadDialogForOverSeaVersion onclick userAgreed :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 141
    const-string v0, "true"

    invoke-static {v4, v0}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 142
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->downloadIndexFile()V

    goto :goto_0

    .line 144
    :cond_0
    const-string v0, "PluginDevice_DeviceCategoryFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showDownloadDialogForOverSeaVersion user disagree download resoure"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 145
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->mOverseaDownloadConfirm:Lo/egv;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->mOverseaDownloadConfirm:Lo/egv;

    invoke-virtual {v0}, Lo/egv;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 146
    return-void

    .line 148
    :cond_1
    new-instance v5, Lo/egv$b;

    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->mainActivity:Landroid/app/Activity;

    invoke-direct {v5, v0}, Lo/egv$b;-><init>(Landroid/content/Context;)V

    .line 149
    sget v0, Lcom/huawei/plugindevice/R$string;->IDS_service_area_notice_title:I

    invoke-virtual {v5, v0}, Lo/egv$b;->b(I)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_device_download_resoure_tip_content_message:I

    .line 150
    invoke-virtual {v0, v1}, Lo/egv$b;->e(I)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_hwh_open_service_pop_up_notification_agree:I

    new-instance v2, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment$2;

    invoke-direct {v2, p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment$2;-><init>(Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;)V

    .line 151
    invoke-virtual {v0, v1, v2}, Lo/egv$b;->e(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_settings_button_cancal:I

    new-instance v2, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment$1;

    invoke-direct {v2, p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment$1;-><init>(Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;)V

    .line 168
    invoke-virtual {v0, v1, v2}, Lo/egv$b;->b(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    .line 186
    invoke-virtual {v5}, Lo/egv$b;->b()Lo/egv;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->mOverseaDownloadConfirm:Lo/egv;

    .line 187
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->mOverseaDownloadConfirm:Lo/egv;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egv;->setCancelable(Z)V

    .line 188
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->mOverseaDownloadConfirm:Lo/egv;

    invoke-virtual {v0}, Lo/egv;->show()V

    .line 190
    :goto_0
    return-void
.end method

.method private showDownloadProgress(I)V
    .locals 9

    .line 535
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->mCustomProgressDialog:Lo/ego;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->mCustomProgressDialog:Lo/ego;

    invoke-virtual {v0}, Lo/ego;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-wide v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->mNeedDownloadByte:J

    const-wide/16 v2, 0x0

    cmp-long v0, v2, v0

    if-eqz v0, :cond_1

    .line 536
    const-string v0, "PluginDevice_DeviceCategoryFragment"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showDownloadProgress downloaded"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-wide v2, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->mDownloadedByte:J

    int-to-long v4, p1

    add-long/2addr v2, v4

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, "total"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget-wide v2, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->mNeedDownloadByte:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 537
    int-to-long v0, p1

    iget-wide v2, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->mDownloadedByte:J

    add-long/2addr v0, v2

    const-wide/16 v2, 0x64

    mul-long/2addr v0, v2

    iget-wide v2, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->mNeedDownloadByte:J

    div-long v6, v0, v2

    .line 538
    const-wide/16 v0, 0x63

    cmp-long v0, v6, v0

    if-lez v0, :cond_0

    .line 539
    const-wide/16 v6, 0x63

    .line 541
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->mCustomProgressDialogBuilder:Lo/ego$a;

    long-to-int v1, v6

    invoke-virtual {v0, v1}, Lo/ego$a;->a(I)Lo/ego$a;

    .line 542
    long-to-double v0, v6

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v8

    .line 543
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->mCustomProgressDialogBuilder:Lo/ego$a;

    invoke-virtual {v0, v8}, Lo/ego$a;->e(Ljava/lang/String;)Lo/ego$a;

    .line 544
    const-string v0, "PluginDevice_DeviceCategoryFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showDownloadProgress percentNum"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v8, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 546
    :cond_1
    return-void
.end method

.method private showErrorLayout()V
    .locals 3

    .line 415
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->mErrorText:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->mainActivity:Landroid/app/Activity;

    sget v2, Lcom/huawei/plugindevice/R$string;->IDS_device_plugin_download_error:I

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 416
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->mErrorRyt:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 417
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->closeProgress()V

    .line 418
    return-void
.end method

.method private showLocalDeviceResource()V
    .locals 2

    .line 549
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->mDeviceType:Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->buildDeviceListFromIndexFile(Ljava/lang/String;)V

    .line 550
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->mNeedDownloadDevices:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 552
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 553
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->mPresetDeviceInOverseaMap:Ljava/util/HashMap;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->mDeviceType:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-direct {p0, v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->showPreSetDevice(Ljava/util/List;)V

    goto :goto_0

    .line 555
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->mPresetDeviceInChinaMap:Ljava/util/HashMap;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->mDeviceType:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-direct {p0, v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->showPreSetDevice(Ljava/util/List;)V

    goto :goto_0

    .line 559
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->mNeedDownloadDevices:Ljava/util/List;

    invoke-direct {p0, v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->getUuidList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->showPreSetDevice(Ljava/util/List;)V

    .line 561
    :goto_0
    return-void
.end method

.method private showMoreButton(ZLandroid/view/View$OnClickListener;)V
    .locals 4

    .line 1026
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->mMainView:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->device_list_ll:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/widget/LinearLayout;

    .line 1027
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->mMainView:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->hw_device_bottom_btn_text:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroid/widget/TextView;

    .line 1028
    if-eqz p1, :cond_0

    .line 1029
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 1030
    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 1031
    invoke-virtual {v2, p2}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    .line 1033
    :cond_0
    const/16 v0, 0x8

    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 1034
    const/16 v0, 0x8

    invoke-virtual {v2, v0}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 1036
    :goto_0
    return-void
.end method

.method private showPreSetDevice(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/String;>;)V"
        }
    .end annotation

    .line 564
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    .line 565
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/lang/String;

    .line 566
    invoke-static {}, Lo/afq;->e()Lo/afq;

    move-result-object v0

    invoke-virtual {v0, v2}, Lo/afq;->e(Ljava/lang/String;)Lo/afj;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->handlerToRefresh(Lo/afj;)V

    .line 567
    goto :goto_0

    .line 569
    :cond_0
    return-void
.end method

.method private sort(Ljava/util/ArrayList;Lo/afj;Ljava/lang/String;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lo/afj;>;Lo/afj;Ljava/lang/String;)V"
        }
    .end annotation

    .line 831
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 833
    new-instance v2, Lo/afj;

    const/4 v0, 0x1

    invoke-direct {v2, v0}, Lo/afj;-><init>(I)V

    .line 834
    const-string v0, "huawei"

    invoke-virtual {v0, p3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 835
    sget v0, Lcom/huawei/plugindevice/R$string;->IDS_device_huawei_band:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lo/afj;->c(Ljava/lang/String;)V

    .line 836
    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Lo/afj;->a(Z)V

    .line 838
    const/4 v0, 0x0

    invoke-virtual {p2, v0}, Lo/afj;->b(Z)V

    goto :goto_0

    .line 839
    :cond_0
    const-string v0, "honor"

    invoke-virtual {v0, p3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 840
    sget v0, Lcom/huawei/plugindevice/R$string;->IDS_device_honor_band:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lo/afj;->c(Ljava/lang/String;)V

    .line 841
    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Lo/afj;->a(Z)V

    .line 843
    const/4 v0, 0x0

    invoke-virtual {p2, v0}, Lo/afj;->b(Z)V

    goto :goto_0

    .line 845
    :cond_1
    sget v0, Lcom/huawei/plugindevice/R$string;->IDS_user_profile_more:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lo/afj;->c(Ljava/lang/String;)V

    .line 846
    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Lo/afj;->a(Z)V

    .line 848
    :goto_0
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 849
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 850
    goto/16 :goto_2

    .line 852
    :cond_2
    invoke-direct {p0, p1}, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->productInfosSort(Ljava/util/ArrayList;)V

    .line 854
    invoke-direct {p0, p1, p2}, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->query(Ljava/util/ArrayList;Lo/afj;)I

    move-result v2

    .line 855
    const-string v0, "huawei"

    invoke-virtual {v0, p3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 857
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->mHuawei:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-gtz v0, :cond_3

    .line 858
    new-instance v3, Lo/afj;

    const/4 v0, 0x1

    invoke-direct {v3, v0}, Lo/afj;-><init>(I)V

    .line 859
    sget v0, Lcom/huawei/plugindevice/R$string;->IDS_device_huawei_band:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lo/afj;->c(Ljava/lang/String;)V

    .line 860
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Lo/afj;->a(Z)V

    .line 861
    const/4 v0, 0x0

    invoke-virtual {p1, v0, v3}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 863
    const/4 v0, 0x0

    invoke-virtual {p2, v0}, Lo/afj;->b(Z)V

    .line 865
    :cond_3
    const/4 v0, -0x1

    if-ne v0, v2, :cond_4

    .line 867
    const/4 v0, 0x1

    invoke-virtual {p1, v0, p2}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    goto/16 :goto_2

    .line 870
    :cond_4
    invoke-virtual {p1, v2, p2}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_2

    .line 872
    :cond_5
    const-string v0, "honor"

    invoke-virtual {v0, p3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 874
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->mHonor:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-gtz v0, :cond_7

    .line 875
    new-instance v3, Lo/afj;

    const/4 v0, 0x1

    invoke-direct {v3, v0}, Lo/afj;-><init>(I)V

    .line 876
    sget v0, Lcom/huawei/plugindevice/R$string;->IDS_device_honor_band:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lo/afj;->c(Ljava/lang/String;)V

    .line 877
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Lo/afj;->a(Z)V

    .line 878
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->mHuawei:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-gtz v0, :cond_6

    .line 880
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->mHuawei:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    invoke-virtual {p1, v0, v3}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    goto :goto_1

    .line 883
    :cond_6
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->mHuawei:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {p1, v0, v3}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 886
    :goto_1
    const/4 v0, 0x0

    invoke-virtual {p2, v0}, Lo/afj;->b(Z)V

    .line 888
    :cond_7
    const/4 v0, -0x1

    if-ne v0, v2, :cond_9

    .line 889
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->mHuawei:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-gtz v0, :cond_8

    .line 891
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->mHuawei:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {p1, v0, p2}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    goto :goto_2

    .line 894
    :cond_8
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->mHuawei:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, 0x2

    invoke-virtual {p1, v0, p2}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    goto :goto_2

    .line 898
    :cond_9
    invoke-virtual {p1, v2, p2}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    .line 902
    :cond_a
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->mOther:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-gtz v0, :cond_b

    .line 903
    new-instance v3, Lo/afj;

    const/4 v0, 0x1

    invoke-direct {v3, v0}, Lo/afj;-><init>(I)V

    .line 904
    sget v0, Lcom/huawei/plugindevice/R$string;->IDS_user_profile_more:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lo/afj;->c(Ljava/lang/String;)V

    .line 905
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Lo/afj;->a(Z)V

    .line 906
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    invoke-virtual {p1, v0, v3}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 908
    :cond_b
    const/4 v0, -0x1

    if-ne v0, v2, :cond_c

    .line 910
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    invoke-virtual {p1, v0, p2}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    goto :goto_2

    .line 913
    :cond_c
    invoke-virtual {p1, v2, p2}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 917
    :goto_2
    return-void
.end method

.method private startDownLoadProgress()V
    .locals 5

    .line 483
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->mCustomProgressDialog:Lo/ego;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->mCustomProgressDialog:Lo/ego;

    invoke-virtual {v0}, Lo/ego;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 484
    const-string v0, "PluginDevice_DeviceCategoryFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startDownLoadProgress exists"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 485
    return-void

    .line 487
    :cond_0
    new-instance v0, Lo/ego;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->mainActivity:Landroid/app/Activity;

    invoke-direct {v0, v1}, Lo/ego;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->mCustomProgressDialog:Lo/ego;

    .line 488
    new-instance v0, Lo/ego$a;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->mainActivity:Landroid/app/Activity;

    invoke-direct {v0, v1}, Lo/ego$a;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->mCustomProgressDialogBuilder:Lo/ego$a;

    .line 489
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->mCustomProgressDialogBuilder:Lo/ego$a;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->mainActivity:Landroid/app/Activity;

    sget v2, Lcom/huawei/plugindevice/R$string;->IDS_app_update_updating:I

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/ego$a;->d(Ljava/lang/String;)Lo/ego$a;

    move-result-object v0

    new-instance v1, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment$7;

    invoke-direct {v1, p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment$7;-><init>(Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;)V

    .line 490
    invoke-virtual {v0, v1}, Lo/ego$a;->e(Landroid/view/View$OnClickListener;)Lo/ego$a;

    .line 497
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->mCustomProgressDialogBuilder:Lo/ego$a;

    invoke-virtual {v0}, Lo/ego$a;->d()Lo/ego;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->mCustomProgressDialog:Lo/ego;

    .line 498
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->mCustomProgressDialog:Lo/ego;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/ego;->setCanceledOnTouchOutside(Z)V

    .line 499
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->mainActivity:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_1

    .line 500
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->mCustomProgressDialog:Lo/ego;

    invoke-virtual {v0}, Lo/ego;->show()V

    .line 501
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->mCustomProgressDialogBuilder:Lo/ego$a;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/ego$a;->a(I)Lo/ego$a;

    .line 502
    const-wide/16 v0, 0x0

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v4

    .line 503
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->mCustomProgressDialogBuilder:Lo/ego$a;

    invoke-virtual {v0, v4}, Lo/ego$a;->e(Ljava/lang/String;)Lo/ego$a;

    .line 505
    :cond_1
    const-string v0, "PluginDevice_DeviceCategoryFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mCustomProgressDialog.show()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 506
    return-void
.end method

.method private startLoading()V
    .locals 4

    .line 360
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->mCustomProgressDialog:Lo/ego;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->mCustomProgressDialog:Lo/ego;

    invoke-virtual {v0}, Lo/ego;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 361
    const-string v0, "PluginDevice_DeviceCategoryFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startLoading progress dialog exists"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 362
    return-void

    .line 364
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->mLoadingDialog:Lo/egn;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 365
    new-instance v0, Lo/egn;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->mainActivity:Landroid/app/Activity;

    sget v2, Lcom/huawei/plugindevice/R$style;->app_update_dialogActivity:I

    invoke-direct {v0, v1, v2}, Lo/egn;-><init>(Landroid/content/Context;I)V

    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->mainActivity:Landroid/app/Activity;

    invoke-static {v0}, Lo/egn;->a(Landroid/content/Context;)Lo/egn;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->mLoadingDialog:Lo/egn;

    .line 367
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->mLoadingDialog:Lo/egn;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->mainActivity:Landroid/app/Activity;

    sget v2, Lcom/huawei/plugindevice/R$string;->IDS_device_plugin_download_loading:I

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egn;->e(Ljava/lang/String;)V

    .line 368
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->mLoadingDialog:Lo/egn;

    invoke-virtual {v0}, Lo/egn;->a()V

    .line 370
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->mHandler:Landroid/os/Handler;

    const/16 v1, 0x69

    const-wide/16 v2, 0x1388

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 371
    return-void
.end method

.method private stopLoading()V
    .locals 4

    .line 376
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->mainActivity:Landroid/app/Activity;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 377
    const-string v0, "PluginDevice_DeviceCategoryFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "stopLoading null == mainActivity"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 378
    return-void

    .line 380
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->mLoadingDialog:Lo/egn;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->mLoadingDialog:Lo/egn;

    invoke-virtual {v0}, Lo/egn;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->mainActivity:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_1

    .line 381
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->mLoadingDialog:Lo/egn;

    invoke-virtual {v0}, Lo/egn;->dismiss()V

    .line 382
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->mLoadingDialog:Lo/egn;

    .line 384
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->mHandler:Landroid/os/Handler;

    const/16 v1, 0x69

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 385
    return-void
.end method

.method private switchDeviceScanningFragment()V
    .locals 4

    .line 964
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_device_search_title:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->setTitle(Ljava/lang/String;)V

    .line 965
    new-instance v2, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment;

    invoke-direct {v2}, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment;-><init>()V

    .line 966
    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 967
    const-string v0, "productId"

    const-string v1, "aa:bb:cc:dd"

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 968
    const-string v0, "scan_kind"

    sget-object v1, Lo/acl$a;->g:Lo/acl$a;

    invoke-virtual {v1}, Lo/acl$a;->name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 969
    const-string v0, "title"

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_device_search_title:I

    invoke-virtual {p0, v1}, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 970
    invoke-virtual {v2, v3}, Lcom/huawei/health/device/ui/BaseFragment;->setArguments(Landroid/os/Bundle;)V

    .line 971
    invoke-virtual {p0, v2}, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->switchFragment(Lcom/huawei/health/device/ui/BaseFragment;)V

    .line 972
    return-void
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 116
    invoke-super {p0, p1}, Lcom/huawei/health/device/ui/BaseFragment;->onCreate(Landroid/os/Bundle;)V

    .line 117
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->mBundle:Landroid/os/Bundle;

    .line 118
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 3

    .line 122
    invoke-super {p0, p1, p2, p3}, Lcom/huawei/health/device/ui/BaseFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/view/ViewGroup;

    .line 123
    sget v0, Lcom/huawei/plugindevice/R$layout;->device_category_fragment:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->mMainView:Landroid/view/View;

    .line 124
    const/4 v0, 0x0

    if-eq v0, v2, :cond_0

    .line 125
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->mMainView:Landroid/view/View;

    invoke-virtual {v2, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 127
    :cond_0
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->bindView()V

    .line 128
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 129
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->showDownloadDialogForOverSeaVersion()V

    goto :goto_0

    .line 131
    :cond_1
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->downloadIndexFile()V

    .line 133
    :goto_0
    return-object v2
.end method

.method public onDestroy()V
    .locals 4

    .line 510
    invoke-super {p0}, Lcom/huawei/health/device/ui/BaseFragment;->onDestroy()V

    .line 511
    const-string v0, "PluginDevice_DeviceCategoryFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onDestroy() enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 512
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->stopLoading()V

    .line 513
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->mCustomProgressDialog:Lo/ego;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 514
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->mCustomProgressDialog:Lo/ego;

    invoke-virtual {v0}, Lo/ego;->cancel()V

    .line 515
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->mCustomProgressDialog:Lo/ego;

    invoke-virtual {v0}, Lo/ego;->dismiss()V

    .line 516
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->mCustomProgressDialog:Lo/ego;

    .line 518
    :cond_0
    return-void
.end method

.method public onResume()V
    .locals 0

    .line 195
    invoke-super {p0}, Lcom/huawei/health/device/ui/BaseFragment;->onResume()V

    .line 196
    return-void
.end method
