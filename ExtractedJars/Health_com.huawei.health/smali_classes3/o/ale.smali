.class public Lo/ale;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/ale$d;,
        Lo/ale$c;,
        Lo/ale$b;,
        Lo/ale$e;,
        Lo/ale$a;
    }
.end annotation


# static fields
.field private static g:Z


# instance fields
.field private A:I

.field private B:Ljava/lang/String;

.field private C:Ljava/lang/String;

.field private D:Z

.field private E:Z

.field private F:Lcom/huawei/hwid/core/datatype/UserInfo;

.field private G:Lo/ale$c;

.field private H:I

.field private I:Lo/etv;

.field private J:Lo/egv;

.field private K:J

.field private L:Lo/egv;

.field private M:I

.field private N:Ljava/util/concurrent/ExecutorService;

.field private O:Z

.field private P:I

.field private Q:Lo/ale$a;

.field private R:Lo/ali;

.field private S:Z

.field private T:Lo/bzy;

.field private U:Landroid/content/BroadcastReceiver;

.field private V:Lo/cwc;

.field private W:Lo/ale$d;

.field private X:Lo/ego$a;

.field private Y:Lo/ego;

.field a:[Ljava/lang/String;

.field private aa:I

.field private ac:Lo/egv;

.field b:[Ljava/lang/String;

.field c:[Ljava/lang/String;

.field d:[Ljava/lang/String;

.field e:[Ljava/lang/String;

.field private f:Lcom/huawei/login/ui/login/LoginInit;

.field private h:Z

.field private i:Ljava/lang/String;

.field private j:I

.field private k:Lo/alc;

.field private l:Landroid/app/Activity;

.field private m:Landroid/os/Handler;

.field private n:Ljava/lang/String;

.field private o:Landroid/content/Context;

.field private p:Ljava/lang/String;

.field private q:I

.field private r:Lcom/tencent/mm/opensdk/openapi/IWXAPI;

.field private s:I

.field private t:Landroid/view/Window;

.field private u:Ljava/util/concurrent/ExecutorService;

.field private v:Z

.field private w:Lcom/huawei/hwcloudmodel/model/userprofile/MergeUserAllDataReq;

.field private x:Lcom/huawei/hihealth/HiAccountInfo;

.field private y:Lcom/huawei/account/aidl/AccountAidlInfo;

.field private z:Lcom/huawei/hihealthservice/old/model/AccountInfo;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 178
    const/4 v0, 0x0

    sput-boolean v0, Lo/ale;->g:Z

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    .line 268
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 179
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ale;->f:Lcom/huawei/login/ui/login/LoginInit;

    .line 181
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ale;->k:Lo/alc;

    .line 182
    const-string v0, ""

    iput-object v0, p0, Lo/ale;->i:Ljava/lang/String;

    .line 183
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/ale;->h:Z

    .line 195
    const-string v0, ""

    iput-object v0, p0, Lo/ale;->n:Ljava/lang/String;

    .line 196
    const-string v0, ""

    iput-object v0, p0, Lo/ale;->p:Ljava/lang/String;

    .line 197
    const/4 v0, 0x0

    iput v0, p0, Lo/ale;->q:I

    .line 198
    const/4 v0, 0x0

    iput v0, p0, Lo/ale;->s:I

    .line 199
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ale;->r:Lcom/tencent/mm/opensdk/openapi/IWXAPI;

    .line 203
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ale;->t:Landroid/view/Window;

    .line 205
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ale;->z:Lcom/huawei/hihealthservice/old/model/AccountInfo;

    .line 206
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ale;->x:Lcom/huawei/hihealth/HiAccountInfo;

    .line 207
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ale;->y:Lcom/huawei/account/aidl/AccountAidlInfo;

    .line 208
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/ale;->v:Z

    .line 210
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/ale;->D:Z

    .line 213
    const/4 v0, 0x0

    iput v0, p0, Lo/ale;->j:I

    .line 214
    const/4 v0, 0x0

    iput v0, p0, Lo/ale;->A:I

    .line 218
    new-instance v0, Lo/ale$c;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lo/ale$c;-><init>(Lo/ale;Lo/ale$1;)V

    iput-object v0, p0, Lo/ale;->G:Lo/ale$c;

    .line 222
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/ale;->E:Z

    .line 223
    const/4 v0, 0x0

    iput v0, p0, Lo/ale;->H:I

    .line 226
    const/4 v0, 0x0

    iput v0, p0, Lo/ale;->M:I

    .line 229
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/ale;->K:J

    .line 232
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ale;->N:Ljava/util/concurrent/ExecutorService;

    .line 236
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/ale;->O:Z

    .line 1204
    new-instance v0, Lo/ale$a;

    invoke-direct {v0, p0}, Lo/ale$a;-><init>(Lo/ale;)V

    iput-object v0, p0, Lo/ale;->Q:Lo/ale$a;

    .line 1852
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/ale;->S:Z

    .line 1997
    const/4 v0, -0x1

    iput v0, p0, Lo/ale;->P:I

    .line 2495
    const/4 v0, 0x4

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "android.permission.ACCESS_COARSE_LOCATION"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "android.permission.ACCESS_FINE_LOCATION"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, "android.permission.ACCESS_NETWORK_STATE"

    const/4 v2, 0x2

    aput-object v1, v0, v2

    const-string v1, "android.permission.ACCESS_WIFI_STATE"

    const/4 v2, 0x3

    aput-object v1, v0, v2

    iput-object v0, p0, Lo/ale;->b:[Ljava/lang/String;

    .line 2502
    const/4 v0, 0x7

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "android.permission.ACCESS_COARSE_LOCATION"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "android.permission.ACCESS_FINE_LOCATION"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, "android.permission.ACCESS_NETWORK_STATE"

    const/4 v2, 0x2

    aput-object v1, v0, v2

    const-string v1, "android.permission.ACCESS_WIFI_STATE"

    const/4 v2, 0x3

    aput-object v1, v0, v2

    const-string v1, "android.permission.READ_PHONE_STATE"

    const/4 v2, 0x4

    aput-object v1, v0, v2

    const-string v1, "android.permission.READ_CALL_LOG"

    const/4 v2, 0x5

    aput-object v1, v0, v2

    const-string v1, "android.permission.WRITE_EXTERNAL_STORAGE"

    const/4 v2, 0x6

    aput-object v1, v0, v2

    iput-object v0, p0, Lo/ale;->d:[Ljava/lang/String;

    .line 2512
    const/4 v0, 0x5

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "android.permission.ACCESS_COARSE_LOCATION"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "android.permission.ACCESS_FINE_LOCATION"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, "android.permission.ACCESS_NETWORK_STATE"

    const/4 v2, 0x2

    aput-object v1, v0, v2

    const-string v1, "android.permission.ACCESS_WIFI_STATE"

    const/4 v2, 0x3

    aput-object v1, v0, v2

    const-string v1, "android.permission.READ_PHONE_STATE"

    const/4 v2, 0x4

    aput-object v1, v0, v2

    iput-object v0, p0, Lo/ale;->c:[Ljava/lang/String;

    .line 2520
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "android.permission.ACCESS_NETWORK_STATE"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "android.permission.ACCESS_WIFI_STATE"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    iput-object v0, p0, Lo/ale;->a:[Ljava/lang/String;

    .line 2525
    const/4 v0, 0x5

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "android.permission.ACCESS_NETWORK_STATE"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "android.permission.ACCESS_WIFI_STATE"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, "android.permission.READ_PHONE_STATE"

    const/4 v2, 0x2

    aput-object v1, v0, v2

    const-string v1, "android.permission.READ_CALL_LOG"

    const/4 v2, 0x3

    aput-object v1, v0, v2

    const-string v1, "android.permission.WRITE_EXTERNAL_STORAGE"

    const/4 v2, 0x4

    aput-object v1, v0, v2

    iput-object v0, p0, Lo/ale;->e:[Ljava/lang/String;

    .line 2615
    new-instance v0, Lo/ale$31;

    invoke-direct {v0, p0}, Lo/ale$31;-><init>(Lo/ale;)V

    iput-object v0, p0, Lo/ale;->U:Landroid/content/BroadcastReceiver;

    .line 3285
    const/4 v0, -0x1

    iput v0, p0, Lo/ale;->aa:I

    .line 269
    iput-object p1, p0, Lo/ale;->o:Landroid/content/Context;

    .line 270
    move-object v0, p1

    check-cast v0, Landroid/app/Activity;

    iput-object v0, p0, Lo/ale;->l:Landroid/app/Activity;

    .line 271
    iget-object v0, p0, Lo/ale;->r:Lcom/tencent/mm/opensdk/openapi/IWXAPI;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 272
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "wx36bda3d35fbcfd06"

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/tencent/mm/opensdk/openapi/WXAPIFactory;->createWXAPI(Landroid/content/Context;Ljava/lang/String;Z)Lcom/tencent/mm/opensdk/openapi/IWXAPI;

    move-result-object v0

    iput-object v0, p0, Lo/ale;->r:Lcom/tencent/mm/opensdk/openapi/IWXAPI;

    .line 273
    iget-object v0, p0, Lo/ale;->r:Lcom/tencent/mm/opensdk/openapi/IWXAPI;

    const-string v1, "wx36bda3d35fbcfd06"

    invoke-interface {v0, v1}, Lcom/tencent/mm/opensdk/openapi/IWXAPI;->registerApp(Ljava/lang/String;)Z

    .line 275
    :cond_0
    invoke-static {p1}, Lo/ali;->c(Landroid/content/Context;)Lo/ali;

    move-result-object v0

    iput-object v0, p0, Lo/ale;->R:Lo/ali;

    .line 276
    return-void
.end method

.method static synthetic A(Lo/ale;)V
    .locals 0

    .line 170
    invoke-direct {p0}, Lo/ale;->aq()V

    return-void
.end method

.method static synthetic B(Lo/ale;)V
    .locals 0

    .line 170
    invoke-direct {p0}, Lo/ale;->an()V

    return-void
.end method

.method static synthetic C(Lo/ale;)Lo/etv;
    .locals 1

    .line 170
    iget-object v0, p0, Lo/ale;->I:Lo/etv;

    return-object v0
.end method

.method static synthetic D(Lo/ale;)V
    .locals 0

    .line 170
    invoke-direct {p0}, Lo/ale;->aD()V

    return-void
.end method

.method static synthetic E(Lo/ale;)I
    .locals 1

    .line 170
    invoke-direct {p0}, Lo/ale;->aK()I

    move-result v0

    return v0
.end method

.method static synthetic F(Lo/ale;)J
    .locals 2

    .line 170
    iget-wide v0, p0, Lo/ale;->K:J

    return-wide v0
.end method

.method static synthetic G(Lo/ale;)Z
    .locals 1

    .line 170
    iget-boolean v0, p0, Lo/ale;->v:Z

    return v0
.end method

.method static synthetic H(Lo/ale;)I
    .locals 1

    .line 170
    iget v0, p0, Lo/ale;->j:I

    return v0
.end method

.method static synthetic I(Lo/ale;)Z
    .locals 1

    .line 170
    iget-boolean v0, p0, Lo/ale;->S:Z

    return v0
.end method

.method static synthetic J(Lo/ale;)V
    .locals 0

    .line 170
    invoke-direct {p0}, Lo/ale;->aE()V

    return-void
.end method

.method static synthetic K(Lo/ale;)V
    .locals 0

    .line 170
    invoke-direct {p0}, Lo/ale;->ac()V

    return-void
.end method

.method static synthetic L(Lo/ale;)I
    .locals 1

    .line 170
    iget v0, p0, Lo/ale;->M:I

    return v0
.end method

.method static synthetic M(Lo/ale;)Lo/egv;
    .locals 1

    .line 170
    iget-object v0, p0, Lo/ale;->ac:Lo/egv;

    return-object v0
.end method

.method static synthetic N(Lo/ale;)Landroid/app/Activity;
    .locals 1

    .line 170
    iget-object v0, p0, Lo/ale;->l:Landroid/app/Activity;

    return-object v0
.end method

.method private Q()V
    .locals 6

    .line 409
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/LoginInit;->getIsLogined()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 410
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/login/ui/login/LoginInit;->getCountryCode(Lo/dcx;)Ljava/lang/String;

    move-result-object v4

    goto :goto_0

    .line 412
    :cond_0
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget-object v0, v0, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    invoke-virtual {v0}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object v4

    .line 414
    :goto_0
    new-instance v5, Lo/dcy;

    invoke-direct {v5}, Lo/dcy;-><init>()V

    .line 415
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "agr_first_sign_country"

    invoke-static {v0, v1, v2, v4, v5}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 417
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "agr_first_sign_language"

    iget-object v3, p0, Lo/ale;->o:Landroid/content/Context;

    .line 418
    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v3

    iget-object v3, v3, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    invoke-virtual {v3}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v3

    .line 417
    invoke-static {v0, v1, v2, v3, v5}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 420
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "health_user_agree"

    .line 421
    const/4 v3, 0x1

    invoke-static {v3}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v3

    .line 420
    invoke-static {v0, v1, v2, v3, v5}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 422
    return-void
.end method

.method private T()V
    .locals 4

    .line 775
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "loginToGetAccount() enter."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 777
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    iget-object v1, p0, Lo/ale;->o:Landroid/content/Context;

    new-instance v2, Lo/ale$65;

    invoke-direct {v2, p0}, Lo/ale$65;-><init>(Lo/ale;)V

    invoke-virtual {v0, v1, v2}, Lcom/huawei/login/ui/login/LoginInit;->login(Landroid/content/Context;Lcom/huawei/login/ui/login/util/ILoginCallback;)V

    .line 795
    return-void
.end method

.method private U()V
    .locals 4

    .line 765
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter judgeIsKidAccount()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 766
    invoke-static {}, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;->getAccount()Lcom/huawei/cloudservice/CloudAccount;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 767
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HuaweiLoginManager.getAccount() is null!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 768
    invoke-direct {p0}, Lo/ale;->T()V

    .line 769
    return-void

    .line 771
    :cond_0
    invoke-direct {p0}, Lo/ale;->ab()V

    .line 772
    return-void
.end method

.method private V()V
    .locals 8

    .line 471
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    const/16 v1, 0x2715

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "health_guide_page"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 473
    const-string v0, "health_app_first_start"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 474
    const-string v0, "user_agree_alo ne_to_cloud_version"

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1}, Lo/ale;->a(Ljava/lang/String;Z)V

    .line 475
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 476
    const-string v0, "click"

    const-string v1, "1"

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 477
    sget-object v0, Lo/dae;->gl:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v6

    .line 478
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lo/ale;->o:Landroid/content/Context;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v6, v5, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 479
    new-instance v7, Lo/dcy;

    invoke-direct {v7}, Lo/dcy;-><init>()V

    .line 480
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0x2715

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "health_guide_page"

    const-string v3, "health_app_first_start"

    invoke-static {v0, v1, v2, v3, v7}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 482
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0x2715

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "is_over_rride"

    const-string v3, "0"

    .line 483
    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    .line 482
    invoke-static {v0, v1, v2, v3, v7}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 488
    iget-object v0, p0, Lo/ale;->m:Landroid/os/Handler;

    const/4 v1, 0x7

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 490
    goto :goto_0

    .line 491
    :cond_0
    invoke-virtual {p0}, Lo/ale;->g()V

    .line 493
    :goto_0
    return-void
.end method

.method private W()V
    .locals 6

    .line 513
    const v0, 0x55d5b6c

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v4

    .line 514
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0x2715

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "version_code_sp"

    new-instance v3, Lo/dcy;

    invoke-direct {v3}, Lo/dcy;-><init>()V

    invoke-static {v0, v1, v2, v4, v3}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 516
    new-instance v5, Landroid/content/Intent;

    invoke-direct {v5}, Landroid/content/Intent;-><init>()V

    .line 517
    iget-object v0, p0, Lo/ale;->l:Landroid/app/Activity;

    const-class v1, Lcom/huawei/health/splash/GuideActivity;

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 518
    iget-object v0, p0, Lo/ale;->l:Landroid/app/Activity;

    const/16 v1, 0x65

    invoke-virtual {v0, v5, v1}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 519
    return-void
.end method

.method private X()V
    .locals 7

    .line 615
    const-string v0, "TimeEat_MainInteractors"

    const-string v1, "Enter hiloginAndPluginInit"

    invoke-static {v0, v1}, Lo/dbf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 616
    invoke-static {}, Lo/czu;->i()Z

    move-result v4

    .line 617
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isAllowedLogin(): "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 618
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/LoginInit;->getSiteId()I

    move-result v5

    .line 619
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "siteId=: "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 620
    if-eqz v4, :cond_3

    const/4 v0, 0x7

    if-eq v0, v5, :cond_0

    const/4 v0, 0x5

    if-ne v0, v5, :cond_3

    .line 621
    :cond_0
    const-string v0, "0"

    iget-object v1, p0, Lo/ale;->o:Landroid/content/Context;

    invoke-static {v1}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/login/ui/login/LoginInit;->getAccountType()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 622
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ACCOUNT_TYPE_ADULT:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 623
    invoke-virtual {p0}, Lo/ale;->f()V

    goto :goto_1

    .line 625
    :cond_1
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "hw_health_show_grant_pwd"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 626
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "guardianHasAuth:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v6, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 627
    const-string v0, "1"

    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 628
    invoke-direct {p0}, Lo/ale;->U()V

    goto :goto_0

    .line 630
    :cond_2
    invoke-virtual {p0}, Lo/ale;->f()V

    .line 632
    :goto_0
    goto :goto_1

    .line 634
    :cond_3
    invoke-virtual {p0}, Lo/ale;->f()V

    .line 637
    :goto_1
    const-string v0, "TimeEat_MainInteractors"

    const-string v1, "Leave hiloginAndPluginInit"

    invoke-static {v0, v1}, Lo/dbf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 638
    return-void
.end method

.method private Y()V
    .locals 6

    .line 1213
    const-string v0, "TimeEat_MainInteractors"

    const-string v1, "Enter checkLogin"

    invoke-static {v0, v1}, Lo/dbf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 1214
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: checkLogin()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1215
    invoke-static {}, Lo/dbf;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1216
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "StoreDemo init login"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1217
    new-instance v4, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;

    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    new-instance v1, Lo/ale$13;

    invoke-direct {v1, p0}, Lo/ale$13;-><init>(Lo/ale;)V

    invoke-direct {v4, v0, v1}, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;-><init>(Landroid/content/Context;Lcom/huawei/login/ui/login/util/ILoginCallback;)V

    .line 1230
    const/4 v0, 0x1

    invoke-static {v0}, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;->updateAppTypeBySiteID(I)V

    .line 1231
    new-instance v5, Lcom/huawei/login/ui/login/util/LoginInfoData;

    invoke-direct {v5}, Lcom/huawei/login/ui/login/util/LoginInfoData;-><init>()V

    .line 1232
    const-string v0, "420086000103796452"

    invoke-virtual {v5, v0}, Lcom/huawei/login/ui/login/util/LoginInfoData;->configStrUserId(Ljava/lang/String;)V

    .line 1233
    const-string v0, "CN"

    invoke-virtual {v5, v0}, Lcom/huawei/login/ui/login/util/LoginInfoData;->configCountryCode(Ljava/lang/String;)V

    .line 1234
    const-string v0, "0042008600010379645296e4b2457898036aeba1e69875df8d01b9b5b9f456e197d0b67605cc8bd7d1db"

    invoke-virtual {v5, v0}, Lcom/huawei/login/ui/login/util/LoginInfoData;->configStrServiceToken(Ljava/lang/String;)V

    .line 1235
    const/4 v0, 0x1

    invoke-virtual {v5, v0}, Lcom/huawei/login/ui/login/util/LoginInfoData;->configSiteId(I)V

    .line 1236
    invoke-virtual {v4, v5}, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;->saveLoginInfo(Lcom/huawei/login/ui/login/util/LoginInfoData;)V

    .line 1237
    goto :goto_0

    .line 1238
    :cond_0
    invoke-direct {p0}, Lo/ale;->aH()V

    .line 1240
    :goto_0
    const-string v0, "TimeEat_MainInteractors"

    const-string v1, "Leave checkLogin"

    invoke-static {v0, v1}, Lo/dbf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 1241
    return-void
.end method

.method private Z()V
    .locals 8

    .line 1076
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: checkLastException enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1077
    invoke-static {}, Lo/dcs;->e()Lo/dcs;

    move-result-object v0

    iget-object v1, p0, Lo/ale;->o:Landroid/content/Context;

    invoke-static {v1}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/login/ui/login/LoginInit;->getUsetId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/dcs;->e(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v4

    .line 1079
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 1080
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: null == migrateTables"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1081
    return-void

    .line 1084
    :cond_0
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v5

    .line 1085
    const/4 v6, 0x0

    :goto_0
    if-ge v6, v5, :cond_7

    .line 1086
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: checkLastException enter migrateTables = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo/dcu;

    invoke-virtual {v2}, Lo/dcu;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1087
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/dcu;

    invoke-virtual {v0}, Lo/dcu;->f()Z

    move-result v0

    if-nez v0, :cond_3

    .line 1089
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/ale;->D:Z

    .line 1090
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/dcu;

    invoke-virtual {v0}, Lo/dcu;->a()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/ale;->C:Ljava/lang/String;

    .line 1091
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/dcu;

    invoke-virtual {v0}, Lo/dcu;->d()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/ale;->B:Ljava/lang/String;

    .line 1092
    iget-object v0, p0, Lo/ale;->u:Ljava/util/concurrent/ExecutorService;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    iget-object v0, p0, Lo/ale;->u:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->isShutdown()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1093
    :cond_1
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: checkLastException mExecutorService is null or shutdown! "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1094
    return-void

    .line 1096
    :cond_2
    iget-object v0, p0, Lo/ale;->u:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lo/ale$11;

    invoke-direct {v1, p0}, Lo/ale$11;-><init>(Lo/ale;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 1103
    return-void

    .line 1105
    :cond_3
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lo/dcu;

    .line 1106
    invoke-virtual {v7}, Lo/dcu;->g()Z

    move-result v0

    if-nez v0, :cond_6

    invoke-virtual {v7}, Lo/dcu;->c()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lo/ale;->o:Landroid/content/Context;

    invoke-static {v1}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/login/ui/login/LoginInit;->getUsetId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 1107
    iget-object v0, p0, Lo/ale;->u:Ljava/util/concurrent/ExecutorService;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    iget-object v0, p0, Lo/ale;->u:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->isShutdown()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 1108
    :cond_4
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: checkLastException mExecutorService is null or shutdown.. "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1109
    return-void

    .line 1111
    :cond_5
    iget-object v0, p0, Lo/ale;->u:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lo/ale$15;

    invoke-direct {v1, p0, v7}, Lo/ale$15;-><init>(Lo/ale;Lo/dcu;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 1085
    :cond_6
    add-int/lit8 v6, v6, 0x1

    goto/16 :goto_0

    .line 1120
    :cond_7
    return-void
.end method

.method static synthetic a(Lo/ale;Lo/etv;)Lo/etv;
    .locals 0

    .line 170
    iput-object p1, p0, Lo/ale;->I:Lo/etv;

    return-object p1
.end method

.method private a(Landroid/app/Activity;)V
    .locals 6

    .line 3401
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter gotoGooglePlayWeb"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3402
    const/4 v0, 0x2

    iput v0, p0, Lo/ale;->aa:I

    .line 3403
    const-string v4, "com.huawei.hwid"

    .line 3405
    :try_start_0
    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.VIEW"

    const-string v2, "https://play.google.com/store/apps/details?id=com.huawei.hwid"

    .line 3406
    invoke-static {v2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    invoke-direct {p0}, Lo/ale;->aC()I

    move-result v1

    .line 3405
    invoke-virtual {p1, v0, v1}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 3409
    goto :goto_0

    .line 3407
    :catch_0
    move-exception v5

    .line 3408
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "can not find web to hold update hms apk"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3410
    :goto_0
    return-void
.end method

.method private a(Ljava/lang/String;Z)V
    .locals 5

    .line 3530
    const-string v4, "0"

    .line 3531
    if-eqz p2, :cond_0

    .line 3532
    const-string v4, "1"

    .line 3534
    :cond_0
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    .line 3535
    const/16 v1, 0x271f

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lo/dcy;

    const/4 v3, 0x0

    invoke-direct {v2, v3}, Lo/dcy;-><init>(I)V

    .line 3534
    invoke-static {v0, v1, p1, v4, v2}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 3538
    return-void
.end method

.method static synthetic a(Lo/ale;)V
    .locals 0

    .line 170
    invoke-direct {p0}, Lo/ale;->Q()V

    return-void
.end method

.method static synthetic a(Lo/ale;I)V
    .locals 0

    .line 170
    invoke-direct {p0, p1}, Lo/ale;->o(I)V

    return-void
.end method

.method static synthetic a(Lo/ale;Ljava/lang/String;)V
    .locals 0

    .line 170
    invoke-direct {p0, p1}, Lo/ale;->d(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic a(Lo/ale;Ljava/lang/String;Z)V
    .locals 0

    .line 170
    invoke-direct {p0, p1, p2}, Lo/ale;->e(Ljava/lang/String;Z)V

    return-void
.end method

.method private a(Ljava/lang/String;)Z
    .locals 4

    .line 3541
    const/4 v2, 0x0

    .line 3542
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    .line 3543
    const/16 v1, 0x271f

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    .line 3542
    invoke-static {v0, v1, p1}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 3545
    const-string v0, "1"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3546
    const/4 v2, 0x1

    .line 3548
    :cond_0
    return v2
.end method

.method static synthetic a(Lo/ale;Landroid/content/Context;)Z
    .locals 1

    .line 170
    invoke-direct {p0, p1}, Lo/ale;->b(Landroid/content/Context;)Z

    move-result v0

    return v0
.end method

.method static synthetic a(Lo/ale;Z)Z
    .locals 0

    .line 170
    iput-boolean p1, p0, Lo/ale;->S:Z

    return p1
.end method

.method private aA()V
    .locals 5

    .line 2998
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "stopService()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2999
    new-instance v4, Landroid/content/Intent;

    const-string v0, "ACTION_ACTIVITY_PAUSE_CITY_AS"

    invoke-direct {v4, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 3000
    iget-object v0, p0, Lo/ale;->l:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, v4}, Lo/ccd;->b(Landroid/content/Context;Landroid/content/Intent;)V

    .line 3001
    return-void
.end method

.method private aB()V
    .locals 5

    .line 2647
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "registerAutoCheckBroadcast()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2648
    new-instance v4, Landroid/content/IntentFilter;

    invoke-direct {v4}, Landroid/content/IntentFilter;-><init>()V

    .line 2649
    const-string v0, "action_band_auto_check_new_version_result"

    invoke-virtual {v4, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 2653
    iget-object v0, p0, Lo/ale;->l:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lo/ale;->U:Landroid/content/BroadcastReceiver;

    sget-object v2, Lo/dac;->a:Ljava/lang/String;

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v4, v2, v3}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Ljava/lang/String;Landroid/os/Handler;)Landroid/content/Intent;

    .line 2654
    return-void
.end method

.method private aC()I
    .locals 2

    .line 3293
    iget v0, p0, Lo/ale;->aa:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 3294
    const/16 v0, 0x7d2

    return v0

    .line 3295
    :cond_0
    iget v0, p0, Lo/ale;->aa:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 3296
    const/16 v0, 0x7d3

    return v0

    .line 3299
    :cond_1
    const/16 v0, 0x7d1

    return v0
.end method

.method private aD()V
    .locals 4

    .line 3006
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "doSyncThirdPartService start."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3007
    invoke-direct {p0}, Lo/ale;->aF()V

    .line 3008
    invoke-direct {p0}, Lo/ale;->aG()V

    .line 3009
    return-void
.end method

.method private aE()V
    .locals 8

    .line 3376
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter gotoGooglePlayForUadate"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3377
    const/4 v0, 0x1

    iput v0, p0, Lo/ale;->aa:I

    .line 3379
    iget-object v4, p0, Lo/ale;->l:Landroid/app/Activity;

    .line 3380
    if-eqz v4, :cond_0

    invoke-virtual {v4}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 3381
    :cond_0
    return-void

    .line 3384
    :cond_1
    const-string v5, "com.huawei.hwid"

    .line 3386
    const-string v0, "market://details?id=com.huawei.hwid"

    :try_start_0
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v6

    .line 3387
    new-instance v7, Landroid/content/Intent;

    const-string v0, "android.intent.action.VIEW"

    invoke-direct {v7, v0, v6}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 3388
    const-string v0, "com.android.vending"

    invoke-virtual {v7, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 3389
    invoke-direct {p0}, Lo/ale;->aC()I

    move-result v0

    invoke-virtual {v4, v7, v0}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 3392
    goto :goto_0

    .line 3390
    :catch_0
    move-exception v6

    .line 3391
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "can not open google play"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3393
    :goto_0
    return-void
.end method

.method private aF()V
    .locals 7

    .line 3012
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    invoke-static {v0}, Lo/dbf;->f(Landroid/content/Context;)Z

    move-result v4

    .line 3013
    if-nez v4, :cond_0

    .line 3014
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "doSyncMyft network is not connected!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3015
    return-void

    .line 3017
    :cond_0
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    invoke-static {v0}, Lo/fjx;->a(Landroid/content/Context;)Lo/fjx;

    move-result-object v5

    .line 3018
    invoke-virtual {v5}, Lo/fjx;->e()Lo/fjw;

    move-result-object v0

    invoke-virtual {v0}, Lo/fjw;->e()Ljava/lang/Boolean;

    move-result-object v6

    .line 3019
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "doSyncMyft.isLogin = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3020
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 3021
    new-instance v0, Lo/fjv;

    iget-object v1, p0, Lo/ale;->o:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/fjv;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lo/fjv;->e()V

    .line 3022
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "doSyncMyft end"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3024
    :cond_1
    return-void
.end method

.method private aG()V
    .locals 6

    .line 3027
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    invoke-static {v0}, Lo/dbf;->f(Landroid/content/Context;)Z

    move-result v4

    .line 3028
    if-nez v4, :cond_0

    .line 3029
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "doSyncGoogleFit network is not connected!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3030
    return-void

    .line 3032
    :cond_0
    invoke-static {}, Lo/fjr;->a()Lo/fjr;

    move-result-object v0

    invoke-virtual {v0}, Lo/fjr;->c()Z

    move-result v5

    .line 3033
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "doSyncGoogleFit.isConnect = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3034
    if-eqz v5, :cond_1

    .line 3035
    new-instance v0, Lo/fjo;

    iget-object v1, p0, Lo/ale;->o:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/fjo;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lo/fjo;->c()V

    .line 3036
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "doSyncGoogleFit end"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3038
    :cond_1
    return-void
.end method

.method private aH()V
    .locals 9

    .line 3561
    invoke-static {}, Lo/czu;->i()Z

    move-result v4

    .line 3562
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isAllowLogin= "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3563
    if-nez v4, :cond_3

    .line 3565
    const-string v0, "user_agree_alo ne_to_cloud_version"

    invoke-direct {p0, v0}, Lo/ale;->a(Ljava/lang/String;)Z

    move-result v5

    .line 3566
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "ifAgreeToCloudVersion= "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3567
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    invoke-direct {p0}, Lo/ale;->aI()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dbf;->e(Landroid/content/Context;Ljava/lang/String;)I

    move-result v6

    .line 3568
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    const-string v1, "2"

    invoke-static {v0, v1}, Lo/dbf;->e(Landroid/content/Context;Ljava/lang/String;)I

    move-result v7

    .line 3569
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "loginCountryChangeVersionInSp = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", mLoginCountryChangeVersionConfig = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3571
    if-le v7, v6, :cond_0

    .line 3572
    const/4 v5, 0x0

    .line 3574
    :cond_0
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "ifAgreeToCloudVersion= "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3575
    if-nez v5, :cond_2

    .line 3578
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    invoke-static {v0}, Lo/abi;->c(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v8

    .line 3579
    const-string v0, "1"

    invoke-virtual {v0, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 3580
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ManagerConstants.KEY_UI_ID_ALLOW_LOGIN.equals(loginByMcc)"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3584
    iget-object v0, p0, Lo/ale;->m:Landroid/os/Handler;

    const/16 v1, 0x1776

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    goto :goto_0

    .line 3586
    :cond_1
    invoke-direct {p0}, Lo/ale;->ac()V

    .line 3588
    :goto_0
    goto :goto_1

    .line 3589
    :cond_2
    invoke-direct {p0}, Lo/ale;->ac()V

    .line 3591
    :goto_1
    goto :goto_2

    .line 3592
    :cond_3
    invoke-direct {p0}, Lo/ale;->ac()V

    .line 3594
    :goto_2
    return-void
.end method

.method private aI()Ljava/lang/String;
    .locals 4

    .line 3661
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    const/16 v1, 0x271f

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "hw_health_login_country_change_version"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 3663
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3664
    const-string v3, "1"

    .line 3666
    :cond_0
    return-object v3
.end method

.method private aJ()V
    .locals 4

    .line 3705
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "dismissHmsPushUpdateHmsApkAlert enter:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3706
    iget-object v0, p0, Lo/ale;->J:Lo/egv;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 3707
    iget-object v0, p0, Lo/ale;->J:Lo/egv;

    invoke-virtual {v0}, Lo/egv;->dismiss()V

    .line 3708
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ale;->J:Lo/egv;

    .line 3710
    :cond_0
    return-void
.end method

.method private aK()I
    .locals 5

    .line 3522
    const/4 v3, 0x0

    .line 3523
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    const/16 v1, 0x271f

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "key_ui_download_hms_try_count"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 3525
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    invoke-static {v0, v4}, Lo/dbf;->e(Landroid/content/Context;Ljava/lang/String;)I

    move-result v3

    .line 3526
    return v3
.end method

.method private aL()V
    .locals 1

    .line 3806
    iget-object v0, p0, Lo/ale;->N:Ljava/util/concurrent/ExecutorService;

    if-eqz v0, :cond_0

    .line 3807
    iget-object v0, p0, Lo/ale;->N:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdownNow()Ljava/util/List;

    .line 3808
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ale;->N:Ljava/util/concurrent/ExecutorService;

    .line 3810
    :cond_0
    return-void
.end method

.method private aQ()V
    .locals 6

    .line 3824
    invoke-static {}, Lo/dbf;->q()Z

    move-result v0

    if-nez v0, :cond_0

    .line 3825
    return-void

    .line 3828
    :cond_0
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dde;->d(Landroid/content/Context;)Lo/dde;

    move-result-object v0

    invoke-virtual {v0}, Lo/dde;->d()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v4

    .line 3829
    const/4 v0, 0x0

    if-eq v0, v4, :cond_2

    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v0

    invoke-static {v0}, Lo/dda;->i(I)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 3830
    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v5

    .line 3831
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "current device support download type:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3832
    iget-object v0, p0, Lo/ale;->u:Ljava/util/concurrent/ExecutorService;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    iget-object v0, p0, Lo/ale;->u:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->isShutdown()Z

    move-result v0

    if-nez v0, :cond_1

    .line 3833
    iget-object v0, p0, Lo/ale;->u:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lo/ale$55;

    invoke-direct {v1, p0, v5}, Lo/ale$55;-><init>(Lo/ale;I)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 3850
    :cond_1
    goto :goto_0

    .line 3851
    :cond_2
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "current device is null or not support download!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3853
    :goto_0
    return-void
.end method

.method private aa()V
    .locals 7

    .line 879
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    iget-object v1, p0, Lo/ale;->y:Lcom/huawei/account/aidl/AccountAidlInfo;

    invoke-virtual {v1}, Lcom/huawei/account/aidl/AccountAidlInfo;->getUserName()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lo/ale$3;

    invoke-direct {v2, p0}, Lo/ale$3;-><init>(Lo/ale;)V

    invoke-virtual {v0, v1, v2}, Lcom/huawei/login/ui/login/LoginInit;->setUserName(Ljava/lang/String;Lo/dcx;)V

    .line 886
    iget-object v0, p0, Lo/ale;->y:Lcom/huawei/account/aidl/AccountAidlInfo;

    invoke-virtual {v0}, Lcom/huawei/account/aidl/AccountAidlInfo;->getHeadPicByts()[B

    move-result-object v4

    .line 887
    const/4 v5, 0x0

    .line 888
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    .line 889
    array-length v0, v4

    const/4 v1, 0x0

    invoke-static {v4, v1, v0}, Landroid/graphics/BitmapFactory;->decodeByteArray([BII)Landroid/graphics/Bitmap;

    move-result-object v5

    .line 890
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: hiloginAndPluginInit = 3 headpicbytes != not null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 893
    :cond_0
    const/4 v0, 0x0

    if-eq v0, v5, :cond_1

    .line 894
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: hiloginAndPluginInit = 3 headImage != null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 895
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    iget-object v1, p0, Lo/ale;->o:Landroid/content/Context;

    invoke-static {v1}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/login/ui/login/LoginInit;->getUsetId()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, v5}, Lo/alg;->c(Landroid/content/Context;Ljava/lang/String;Landroid/graphics/Bitmap;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/ale;->i:Ljava/lang/String;

    .line 896
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "accountmigrate: hiloginAndPluginInit = 3 headImage != null newPath = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/ale;->i:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 898
    :cond_1
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: hiloginAndPluginInit = 3 headImage = null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 901
    :goto_0
    const-string v0, ""

    iget-object v1, p0, Lo/ale;->i:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 902
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    iget-object v1, p0, Lo/ale;->i:Ljava/lang/String;

    new-instance v2, Lo/ale$2;

    invoke-direct {v2, p0}, Lo/ale$2;-><init>(Lo/ale;)V

    invoke-virtual {v0, v1, v2}, Lcom/huawei/login/ui/login/LoginInit;->setUserPicPath(Ljava/lang/String;Lo/dcx;)V

    .line 910
    :cond_2
    new-instance v6, Landroid/content/Intent;

    invoke-direct {v6}, Landroid/content/Intent;-><init>()V

    .line 911
    const-string v0, "com.huawei.plugin.account.login"

    invoke-virtual {v6, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 912
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    invoke-static {v0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 913
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    invoke-static {v0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v0

    invoke-virtual {v0, v6}, Landroid/support/v4/content/LocalBroadcastManager;->sendBroadcast(Landroid/content/Intent;)Z

    .line 916
    :cond_3
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    .line 917
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "----send broadcast to social----"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 918
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    sget-object v1, Lo/dac;->a:Ljava/lang/String;

    invoke-virtual {v0, v6, v1}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;Ljava/lang/String;)V

    goto :goto_1

    .line 920
    :cond_4
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "----mContext is null----"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 922
    :goto_1
    return-void
.end method

.method private ab()V
    .locals 6

    .line 798
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getIfKidAccount() enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 799
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    invoke-direct {p0, v0}, Lo/ale;->b(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 800
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "judgeIsKidAccount: NetworkConnected error!!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 801
    iget-object v0, p0, Lo/ale;->m:Landroid/os/Handler;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 802
    return-void

    .line 804
    :cond_0
    new-instance v4, Ljava/util/concurrent/CountDownLatch;

    const/4 v0, 0x1

    invoke-direct {v4, v0}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    .line 805
    invoke-static {}, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;->getAccount()Lcom/huawei/cloudservice/CloudAccount;

    move-result-object v0

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    const-string v2, "1000"

    new-instance v3, Lo/ale$4;

    invoke-direct {v3, p0, v4}, Lo/ale$4;-><init>(Lo/ale;Ljava/util/concurrent/CountDownLatch;)V

    invoke-virtual {v0, v1, v2, v3}, Lcom/huawei/cloudservice/CloudAccount;->getUserInfo(Landroid/content/Context;Ljava/lang/String;Lcom/huawei/cloudservice/CloudRequestHandler;)V

    .line 857
    :try_start_0
    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0xa

    invoke-virtual {v4, v1, v2, v0}, Ljava/util/concurrent/CountDownLatch;->await(JLjava/util/concurrent/TimeUnit;)Z
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 861
    goto :goto_0

    .line 858
    :catch_0
    move-exception v5

    .line 859
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "judgeIsKidAccount InterruptedException e = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v5}, Ljava/lang/InterruptedException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 860
    iget-object v0, p0, Lo/ale;->m:Landroid/os/Handler;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 862
    :goto_0
    return-void
.end method

.method private ac()V
    .locals 1

    .line 1244
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/ale;->e(Z)V

    .line 1245
    return-void
.end method

.method private ad()V
    .locals 6

    .line 1470
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: sendMigrageDataToCloud enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1471
    new-instance v0, Lcom/huawei/hwcloudmodel/model/userprofile/MergeUserAllDataReq;

    invoke-direct {v0}, Lcom/huawei/hwcloudmodel/model/userprofile/MergeUserAllDataReq;-><init>()V

    iput-object v0, p0, Lo/ale;->w:Lcom/huawei/hwcloudmodel/model/userprofile/MergeUserAllDataReq;

    .line 1472
    new-instance v4, Lo/dcy;

    const/4 v0, 0x0

    invoke-direct {v4, v0}, Lo/dcy;-><init>(I)V

    .line 1473
    iget v0, p0, Lo/ale;->j:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 1474
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: sendMigrageDataToCloud accountType == 1   1.0account"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1475
    iget-object v0, p0, Lo/ale;->w:Lcom/huawei/hwcloudmodel/model/userprofile/MergeUserAllDataReq;

    iget-object v1, p0, Lo/ale;->z:Lcom/huawei/hihealthservice/old/model/AccountInfo;

    invoke-virtual {v1}, Lcom/huawei/hihealthservice/old/model/AccountInfo;->getUserID()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/hwcloudmodel/model/userprofile/MergeUserAllDataReq;->setOriginalHuid(Ljava/lang/String;)V

    .line 1476
    iget-object v0, p0, Lo/ale;->w:Lcom/huawei/hwcloudmodel/model/userprofile/MergeUserAllDataReq;

    iget-object v1, p0, Lo/ale;->z:Lcom/huawei/hihealthservice/old/model/AccountInfo;

    invoke-virtual {v1}, Lcom/huawei/hihealthservice/old/model/AccountInfo;->getServiceToken()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/hwcloudmodel/model/userprofile/MergeUserAllDataReq;->setOriginalST(Ljava/lang/String;)V

    .line 1477
    iget-object v0, p0, Lo/ale;->z:Lcom/huawei/hihealthservice/old/model/AccountInfo;

    invoke-virtual {v0}, Lcom/huawei/hihealthservice/old/model/AccountInfo;->getUserID()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v5

    .line 1478
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    const/16 v1, 0x271f

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "old_huid_need_to_migrate"

    invoke-static {v0, v1, v2, v5, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 1479
    goto :goto_0

    :cond_0
    iget v0, p0, Lo/ale;->j:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 1480
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: sendMigrageDataToCloud accountType == 2   2.0account"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1481
    iget-object v0, p0, Lo/ale;->w:Lcom/huawei/hwcloudmodel/model/userprofile/MergeUserAllDataReq;

    iget-object v1, p0, Lo/ale;->x:Lcom/huawei/hihealth/HiAccountInfo;

    invoke-virtual {v1}, Lcom/huawei/hihealth/HiAccountInfo;->getHuid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/hwcloudmodel/model/userprofile/MergeUserAllDataReq;->setOriginalHuid(Ljava/lang/String;)V

    .line 1482
    iget-object v0, p0, Lo/ale;->w:Lcom/huawei/hwcloudmodel/model/userprofile/MergeUserAllDataReq;

    iget-object v1, p0, Lo/ale;->x:Lcom/huawei/hihealth/HiAccountInfo;

    invoke-virtual {v1}, Lcom/huawei/hihealth/HiAccountInfo;->getServiceToken()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/hwcloudmodel/model/userprofile/MergeUserAllDataReq;->setOriginalST(Ljava/lang/String;)V

    goto :goto_0

    .line 1484
    :cond_1
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: sendMigrageDataToCloud all null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1487
    :goto_0
    iget-boolean v0, p0, Lo/ale;->D:Z

    if-eqz v0, :cond_2

    .line 1488
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: sendMigrageDataToCloud isSendMigrateCommandTimeOut"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1489
    iget-object v0, p0, Lo/ale;->C:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lo/ale;->B:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 1490
    iget-object v0, p0, Lo/ale;->w:Lcom/huawei/hwcloudmodel/model/userprofile/MergeUserAllDataReq;

    iget-object v1, p0, Lo/ale;->C:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/huawei/hwcloudmodel/model/userprofile/MergeUserAllDataReq;->setOriginalHuid(Ljava/lang/String;)V

    .line 1491
    iget-object v0, p0, Lo/ale;->w:Lcom/huawei/hwcloudmodel/model/userprofile/MergeUserAllDataReq;

    iget-object v1, p0, Lo/ale;->B:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/huawei/hwcloudmodel/model/userprofile/MergeUserAllDataReq;->setOriginalST(Ljava/lang/String;)V

    .line 1495
    :cond_2
    iget-object v0, p0, Lo/ale;->m:Landroid/os/Handler;

    const/16 v1, 0xfac

    const-wide/16 v2, 0xbb8

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 1496
    const/4 v0, 0x1

    iput v0, p0, Lo/ale;->A:I

    .line 1497
    invoke-static {}, Lo/czu;->b()Z

    move-result v0

    if-nez v0, :cond_3

    const-string v0, "com.huawei.health"

    iget-object v1, p0, Lo/ale;->w:Lcom/huawei/hwcloudmodel/model/userprofile/MergeUserAllDataReq;

    invoke-virtual {v1}, Lcom/huawei/hwcloudmodel/model/userprofile/MergeUserAllDataReq;->getOriginalHuid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 1498
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: sendMigrageDataToCloud mergeUserAllData enter mergeUserAllDataReq origalHuid is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/ale;->w:Lcom/huawei/hwcloudmodel/model/userprofile/MergeUserAllDataReq;

    invoke-virtual {v2}, Lcom/huawei/hwcloudmodel/model/userprofile/MergeUserAllDataReq;->getOriginalHuid()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1499
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    invoke-static {v0}, Lo/czg;->e(Landroid/content/Context;)Lo/czg;

    move-result-object v0

    iget-object v1, p0, Lo/ale;->w:Lcom/huawei/hwcloudmodel/model/userprofile/MergeUserAllDataReq;

    new-instance v2, Lo/ale$23;

    invoke-direct {v2, p0}, Lo/ale$23;-><init>(Lo/ale;)V

    invoke-virtual {v0, v1, v2}, Lo/czg;->a(Lcom/huawei/hwcloudmodel/model/userprofile/MergeUserAllDataReq;Lo/cyx;)V

    goto :goto_1

    .line 1544
    :cond_3
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: sendMigrageDataToCloud but is no cloud or default packgehuid"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1545
    invoke-static {}, Lo/dcs;->e()Lo/dcs;

    move-result-object v0

    iget-object v1, p0, Lo/ale;->w:Lcom/huawei/hwcloudmodel/model/userprofile/MergeUserAllDataReq;

    invoke-virtual {v1}, Lcom/huawei/hwcloudmodel/model/userprofile/MergeUserAllDataReq;->getOriginalHuid()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lo/ale;->o:Landroid/content/Context;

    invoke-static {v2}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v2

    invoke-virtual {v2}, Lcom/huawei/login/ui/login/LoginInit;->getUsetId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo/dcs;->c(Ljava/lang/String;Ljava/lang/String;)I

    .line 1546
    const/4 v0, 0x0

    iput v0, p0, Lo/ale;->A:I

    .line 1547
    invoke-direct {p0}, Lo/ale;->ah()V

    .line 1549
    :goto_1
    return-void
.end method

.method private ae()V
    .locals 4

    .line 1312
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/LoginInit;->getIsLogined()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/LoginInit;->getHealthLoginChannel()I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 1313
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: loginByAccountType backgroundAutoSync "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/ale;->o:Landroid/content/Context;

    invoke-static {v2}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v2

    invoke-virtual {v2}, Lcom/huawei/login/ui/login/LoginInit;->getIsLogined()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1314
    invoke-direct {p0}, Lo/ale;->ar()V

    .line 1316
    :cond_0
    invoke-direct {p0}, Lo/ale;->ax()V

    .line 1317
    invoke-static {}, Lo/czu;->i()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1318
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "goto downloadUserPrivacy."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1319
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    invoke-static {v0}, Lo/dnm;->a(Landroid/content/Context;)Lo/dnm;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/dnm;->b(Lcom/huawei/up/callback/CommonCallback;)V

    .line 1320
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    invoke-static {v0}, Lo/fjl;->d(Landroid/content/Context;)Lo/fjl;

    move-result-object v0

    invoke-virtual {v0}, Lo/fjl;->d()V

    .line 1322
    :cond_1
    return-void
.end method

.method private af()V
    .locals 4

    .line 1325
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: checkIsReceivedCloudPush() getUserMergeInfo call back"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1326
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    invoke-static {v0}, Lo/alg;->h(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    invoke-direct {p0, v0}, Lo/ale;->b(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {}, Lo/czu;->b()Z

    move-result v0

    if-nez v0, :cond_2

    .line 1327
    iget-object v0, p0, Lo/ale;->u:Ljava/util/concurrent/ExecutorService;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lo/ale;->u:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->isShutdown()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1328
    :cond_0
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: checkIsReceivedCloudPush() mExecutorService is shutdown"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1329
    return-void

    .line 1331
    :cond_1
    iget-object v0, p0, Lo/ale;->u:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lo/ale$17;

    invoke-direct {v1, p0}, Lo/ale$17;-><init>(Lo/ale;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    goto :goto_0

    .line 1360
    :cond_2
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate:checkIsReceivedCloudPush() else"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1362
    :goto_0
    return-void
.end method

.method private ag()V
    .locals 0

    .line 1385
    invoke-direct {p0}, Lo/ale;->ak()V

    .line 1386
    return-void
.end method

.method private ah()V
    .locals 4

    .line 1552
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: copyDataByType"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1553
    iget-object v0, p0, Lo/ale;->w:Lcom/huawei/hwcloudmodel/model/userprofile/MergeUserAllDataReq;

    invoke-virtual {v0}, Lcom/huawei/hwcloudmodel/model/userprofile/MergeUserAllDataReq;->getOriginalHuid()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lo/ale;->w:Lcom/huawei/hwcloudmodel/model/userprofile/MergeUserAllDataReq;

    invoke-virtual {v1}, Lcom/huawei/hwcloudmodel/model/userprofile/MergeUserAllDataReq;->getOriginalST()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lo/ale;->o:Landroid/content/Context;

    invoke-static {v2}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v2

    invoke-virtual {v2}, Lcom/huawei/login/ui/login/LoginInit;->getUsetId()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    invoke-static {v0, v1, v2, v3}, Lo/alg;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 1554
    iget v0, p0, Lo/ale;->j:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 1555
    const/4 v0, 0x3

    invoke-direct {p0, v0}, Lo/ale;->k(I)V

    goto :goto_0

    .line 1556
    :cond_0
    iget-boolean v0, p0, Lo/ale;->D:Z

    if-eqz v0, :cond_1

    .line 1557
    const/4 v0, 0x4

    invoke-direct {p0, v0}, Lo/ale;->k(I)V

    goto :goto_0

    .line 1558
    :cond_1
    iget v0, p0, Lo/ale;->j:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_2

    .line 1559
    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lo/ale;->k(I)V

    .line 1561
    :cond_2
    :goto_0
    return-void
.end method

.method private ai()V
    .locals 7

    .line 1791
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: branchToLogin()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1792
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    invoke-static {v0}, Lo/alg;->a(Landroid/content/Context;)Lcom/huawei/account/aidl/AccountAidlInfo;

    move-result-object v0

    iput-object v0, p0, Lo/ale;->y:Lcom/huawei/account/aidl/AccountAidlInfo;

    .line 1793
    iget-object v0, p0, Lo/ale;->y:Lcom/huawei/account/aidl/AccountAidlInfo;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    .line 1794
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: branchToLogin() accountAidlInfoWear = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/ale;->y:Lcom/huawei/account/aidl/AccountAidlInfo;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, "invalidST = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/ale;->p:Ljava/lang/String;

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1795
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: branchToLogin null != accountAidlInfoWear huid is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/ale;->y:Lcom/huawei/account/aidl/AccountAidlInfo;

    invoke-virtual {v2}, Lcom/huawei/account/aidl/AccountAidlInfo;->getHuid()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1796
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0x4e28

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "migrate_timeout_s_key"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 1798
    iget-object v0, p0, Lo/ale;->p:Ljava/lang/String;

    iget-object v1, p0, Lo/ale;->y:Lcom/huawei/account/aidl/AccountAidlInfo;

    invoke-virtual {v1}, Lcom/huawei/account/aidl/AccountAidlInfo;->getServeToken()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lo/ale;->y:Lcom/huawei/account/aidl/AccountAidlInfo;

    invoke-virtual {v0}, Lcom/huawei/account/aidl/AccountAidlInfo;->getServeToken()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1799
    :cond_0
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: branchToLogin null != accountAidlInfoWear and invalid st"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1800
    invoke-direct {p0}, Lo/ale;->al()V

    goto/16 :goto_0

    .line 1802
    :cond_1
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: branchToLogin null != accountAidlInfoWear valid st"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1803
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0x4e28

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "migrate_timeout_s_key"

    const-string v3, ""

    new-instance v4, Lo/dcy;

    const/4 v5, 0x1

    invoke-direct {v4, v5}, Lo/dcy;-><init>(I)V

    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 1805
    iget v0, p0, Lo/ale;->s:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_3

    .line 1806
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: branchToLogin null != accountAidlInfoWear oldhuidhistory == 1"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1807
    iget-object v0, p0, Lo/ale;->n:Ljava/lang/String;

    iget-object v1, p0, Lo/ale;->y:Lcom/huawei/account/aidl/AccountAidlInfo;

    invoke-virtual {v1}, Lcom/huawei/account/aidl/AccountAidlInfo;->getHuid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1808
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: branchToLogin null != accountAidlInfoWear oldHuid.equals(accountAidlInfoWear.getHuid())"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1809
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/LoginInit;->getLoginByWear()I

    move-result v0

    invoke-direct {p0, v0}, Lo/ale;->f(I)V

    goto :goto_0

    .line 1811
    :cond_2
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: branchToLogin null != accountAidlInfoWear oldHuid  not equals(accountAidlInfoWear.getHuid())"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1812
    iget-object v0, p0, Lo/ale;->m:Landroid/os/Handler;

    const/16 v1, 0xfaa

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 1813
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/LoginInit;->getLoginByWear()I

    move-result v0

    invoke-direct {p0, v0}, Lo/ale;->f(I)V

    goto :goto_0

    .line 1816
    :cond_3
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: branchToLogin null != accountAidlInfoWear oldhuidhistory != 1"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1817
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/LoginInit;->getLoginByWear()I

    move-result v0

    invoke-direct {p0, v0}, Lo/ale;->f(I)V

    .line 1820
    :goto_0
    goto :goto_1

    .line 1821
    :cond_4
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: AccountInteractors.isWearLogined() = false"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1822
    invoke-direct {p0}, Lo/ale;->al()V

    .line 1825
    :goto_1
    return-void
.end method

.method private aj()V
    .locals 5

    .line 1784
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: clearAccountForWear()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1785
    new-instance v4, Lo/dcy;

    const/4 v0, 0x1

    invoke-direct {v4, v0}, Lo/dcy;-><init>(I)V

    .line 1786
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    const/16 v1, 0x271f

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "wear_is_support"

    const-string v3, "0"

    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 1787
    return-void
.end method

.method private ak()V
    .locals 5

    .line 2087
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: branchKidWatchIsNotExist()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2088
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    invoke-static {v0}, Lo/alg;->a(Landroid/content/Context;)Lcom/huawei/account/aidl/AccountAidlInfo;

    move-result-object v0

    iput-object v0, p0, Lo/ale;->y:Lcom/huawei/account/aidl/AccountAidlInfo;

    .line 2089
    iget-object v0, p0, Lo/ale;->y:Lcom/huawei/account/aidl/AccountAidlInfo;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 2090
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: branchKidWatchIsNotExist() null != accountAidlInfoWear"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2091
    invoke-direct {p0}, Lo/ale;->ao()V

    goto :goto_0

    .line 2093
    :cond_0
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: branchKidWatchIsNotExist() null == accountAidlInfoWear"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2094
    new-instance v4, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;

    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    invoke-direct {v4, v0}, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;-><init>(Landroid/content/Context;)V

    .line 2095
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;->hasLoginAccount(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 2096
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: branchKidWatchIsNotExist() loginManager.isLoginedForHealth(mContext) = false"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2097
    invoke-direct {p0}, Lo/ale;->aq()V

    goto :goto_0

    .line 2099
    :cond_1
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: branchKidWatchIsNotExist() loginManager.isLoginedForHealth(mContext) = true"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2100
    invoke-direct {p0}, Lo/ale;->ap()V

    .line 2103
    :goto_0
    return-void
.end method

.method private al()V
    .locals 5

    .line 1829
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: branchCheckIsLoginForHealth() enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1830
    new-instance v4, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;

    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    invoke-direct {v4, v0}, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;-><init>(Landroid/content/Context;)V

    .line 1831
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;->hasLoginAccount(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1832
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: branchCheckIsLoginForHealth.isLoginedForHealth(mContext) = true"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1833
    iget-boolean v0, p0, Lo/ale;->v:Z

    if-nez v0, :cond_0

    .line 1834
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: branchCheckIsLoginForHealth.isLoginedForHealth(mContext) not loginnote exit"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1835
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lo/ale;->b(Z)V

    goto :goto_0

    .line 1837
    :cond_0
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: branchCheckIsLoginForHealth.isLoginedForHealth(mContext) loginnote exit"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1838
    invoke-direct {p0}, Lo/ale;->am()V

    goto :goto_0

    .line 1841
    :cond_1
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: branchCheckIsLoginForHealth.isLoginedForHealth(mContext) = false"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1842
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;->checkIsInstallHuaweiAccount(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1843
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: branchCheckIsLoginForHealth checkIsInstallHuaweiAccount = true"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1844
    invoke-direct {p0}, Lo/ale;->am()V

    goto :goto_0

    .line 1846
    :cond_2
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: branchCheckIsLoginForHealth checkIsInstallHuaweiAccount = false"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1847
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lo/ale;->o(I)V

    .line 1850
    :goto_0
    return-void
.end method

.method private am()V
    .locals 4

    .line 1859
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: branchToMobileHwid()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1860
    invoke-direct {p0}, Lo/ale;->aj()V

    .line 1861
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/ale;->S:Z

    .line 1862
    iget-object v0, p0, Lo/ale;->f:Lcom/huawei/login/ui/login/LoginInit;

    iget-object v1, p0, Lo/ale;->o:Landroid/content/Context;

    new-instance v2, Lo/ale$22;

    invoke-direct {v2, p0}, Lo/ale$22;-><init>(Lo/ale;)V

    invoke-virtual {v0, v1, v2}, Lcom/huawei/login/ui/login/LoginInit;->login(Landroid/content/Context;Lcom/huawei/login/ui/login/util/ILoginCallback;)V

    .line 1905
    return-void
.end method

.method private an()V
    .locals 4

    .line 2231
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter processLoginSuc():"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2232
    iget-object v0, p0, Lo/ale;->u:Ljava/util/concurrent/ExecutorService;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lo/ale;->u:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->isShutdown()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2233
    :cond_0
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "processLoginSuc mExecutorService is null or shutdown"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2234
    return-void

    .line 2236
    :cond_1
    iget-object v0, p0, Lo/ale;->u:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lo/ale$30;

    invoke-direct {v1, p0}, Lo/ale$30;-><init>(Lo/ale;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 2255
    return-void
.end method

.method private ao()V
    .locals 5

    .line 2334
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: isSameHuidToHealthAndWearSteps3()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2335
    iget-object v0, p0, Lo/ale;->z:Lcom/huawei/hihealthservice/old/model/AccountInfo;

    iget-object v1, p0, Lo/ale;->x:Lcom/huawei/hihealth/HiAccountInfo;

    iget-object v2, p0, Lo/ale;->y:Lcom/huawei/account/aidl/AccountAidlInfo;

    invoke-static {v0, v1, v2}, Lo/alg;->c(Lcom/huawei/hihealthservice/old/model/AccountInfo;Lcom/huawei/hihealth/HiAccountInfo;Lcom/huawei/account/aidl/AccountAidlInfo;)Z

    move-result v4

    .line 2336
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: isSameHuidToHealthAndWearSteps3() isSame = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2337
    if-eqz v4, :cond_0

    .line 2338
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/LoginInit;->getLoginByWear()I

    move-result v0

    invoke-direct {p0, v0}, Lo/ale;->f(I)V

    goto :goto_0

    .line 2340
    :cond_0
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lo/ale;->p(I)V

    .line 2342
    :goto_0
    return-void
.end method

.method private ap()V
    .locals 6

    .line 2106
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: jugeCloudAccountIsNull() enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2107
    invoke-static {}, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;->getAccount()Lcom/huawei/cloudservice/CloudAccount;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2108
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: jugeCloudAccountIsNull() not null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2109
    const/4 v4, 0x0

    .line 2110
    invoke-static {}, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;->getAccount()Lcom/huawei/cloudservice/CloudAccount;

    move-result-object v4

    .line 2111
    invoke-virtual {v4}, Lcom/huawei/cloudservice/CloudAccount;->getUserId()Ljava/lang/String;

    move-result-object v5

    .line 2112
    const/4 v0, 0x0

    invoke-direct {p0, v5, v0}, Lo/ale;->e(Ljava/lang/String;Z)V

    .line 2113
    goto :goto_0

    .line 2114
    :cond_0
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: jugeCloudAccountIsNull()  null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2115
    new-instance v4, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;

    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    invoke-direct {v4, v0}, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;-><init>(Landroid/content/Context;)V

    .line 2116
    new-instance v0, Lo/ale$e;

    invoke-direct {v0, p0}, Lo/ale$e;-><init>(Lo/ale;)V

    invoke-virtual {v4, v0}, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;->hmsHasLoginedLoginForHealth(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 2118
    :goto_0
    return-void
.end method

.method private aq()V
    .locals 5

    .line 2322
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: branchHwIdApkNotLogined()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2323
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    invoke-static {v0}, Lo/alg;->c(Landroid/content/Context;)Z

    move-result v4

    .line 2324
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: branchHwIdApkNotLogined() isInstallHwIdApk = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2325
    if-eqz v4, :cond_0

    .line 2326
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lo/ale;->h(I)V

    goto :goto_0

    .line 2328
    :cond_0
    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lo/ale;->o(I)V

    .line 2330
    :goto_0
    return-void
.end method

.method private ar()V
    .locals 7

    .line 2357
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "auto_synchronous_flag"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 2359
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "automaticswitch=="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2360
    const-string v0, ""

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2361
    new-instance v5, Lo/dcy;

    const/4 v0, 0x0

    invoke-direct {v5, v0}, Lo/dcy;-><init>(I)V

    .line 2362
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "auto_synchronous_flag"

    const-string v3, "1"

    invoke-static {v0, v1, v2, v3, v5}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 2364
    :cond_0
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "auto_synchronous_wlan_flag"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 2366
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "trafficSyncSwitch=="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v5, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2367
    const-string v0, ""

    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2368
    new-instance v6, Lo/dcy;

    const/4 v0, 0x0

    invoke-direct {v6, v0}, Lo/dcy;-><init>(I)V

    .line 2369
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "auto_synchronous_wlan_flag"

    const-string v3, "1"

    invoke-static {v0, v1, v2, v3, v6}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 2372
    :cond_1
    new-instance v6, Lcom/huawei/hihealth/HiSyncOption;

    invoke-direct {v6}, Lcom/huawei/hihealth/HiSyncOption;-><init>()V

    .line 2373
    const/4 v0, 0x2

    invoke-virtual {v6, v0}, Lcom/huawei/hihealth/HiSyncOption;->setSyncModel(I)V

    .line 2374
    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Lcom/huawei/hihealth/HiSyncOption;->setSyncAction(I)V

    .line 2375
    const/16 v0, 0x4e20

    invoke-virtual {v6, v0}, Lcom/huawei/hihealth/HiSyncOption;->setSyncDataType(I)V

    .line 2376
    const/4 v0, 0x2

    invoke-virtual {v6, v0}, Lcom/huawei/hihealth/HiSyncOption;->setSyncMethod(I)V

    .line 2377
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    invoke-static {v0}, Lo/clq;->e(Landroid/content/Context;)Lo/clq;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v6, v1}, Lo/clq;->c(Lcom/huawei/hihealth/HiSyncOption;Lo/clz;)V

    .line 2378
    return-void
.end method

.method private as()V
    .locals 4

    .line 2429
    const-string v0, "TimeEat_MainInteractors"

    const-string v1, "Enter initOperationAdapter"

    invoke-static {v0, v1}, Lo/dbf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 2430
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/operation/operation/PluginOperation;->getInstance(Landroid/content/Context;)Lcom/huawei/operation/operation/PluginOperation;

    move-result-object v2

    .line 2431
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    invoke-static {v0}, Lo/cwe;->a(Landroid/content/Context;)Lo/cwe;

    move-result-object v3

    .line 2432
    invoke-virtual {v2, v3}, Lcom/huawei/operation/operation/PluginOperation;->setAdapter(Lo/eab;)V

    .line 2433
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    invoke-virtual {v2, v0}, Lcom/huawei/operation/operation/PluginOperation;->init(Landroid/content/Context;)V

    .line 2434
    const-string v0, "TimeEat_MainInteractors"

    const-string v1, "Leave initOperationAdapter"

    invoke-static {v0, v1}, Lo/dbf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 2435
    return-void
.end method

.method private at()V
    .locals 2

    .line 2457
    const-string v0, "TimeEat_MainInteractors"

    const-string v1, "Enter initPluginSuggestinAdapter"

    invoke-static {v0, v1}, Lo/dbf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 2458
    invoke-static {}, Lo/brt;->c()Lo/brt;

    move-result-object v0

    iget-object v1, p0, Lo/ale;->o:Landroid/content/Context;

    invoke-static {v1}, Lo/cwi;->a(Landroid/content/Context;)Lo/cwi;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/brt;->setAdapter(Lo/eab;)V

    .line 2459
    invoke-static {}, Lo/brt;->c()Lo/brt;

    move-result-object v0

    iget-object v1, p0, Lo/ale;->o:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lo/brt;->init(Landroid/content/Context;)V

    .line 2460
    const-string v0, "TimeEat_MainInteractors"

    const-string v1, "Leave initPluginSuggestinAdapter"

    invoke-static {v0, v1}, Lo/dbf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 2461
    return-void
.end method

.method private au()V
    .locals 4

    .line 2439
    const-string v0, "TimeEat_MainInteractors"

    const-string v1, "Enter initPluginTrackApapter"

    invoke-static {v0, v1}, Lo/dbf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 2440
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    invoke-static {v0}, Lo/cwc;->c(Landroid/content/Context;)Lo/cwc;

    move-result-object v0

    iput-object v0, p0, Lo/ale;->V:Lo/cwc;

    .line 2441
    new-instance v0, Lo/bzy;

    invoke-direct {v0}, Lo/bzy;-><init>()V

    iput-object v0, p0, Lo/ale;->T:Lo/bzy;

    .line 2442
    new-instance v2, Lo/ced;

    invoke-direct {v2}, Lo/ced;-><init>()V

    .line 2443
    iget-object v0, p0, Lo/ale;->T:Lo/bzy;

    invoke-virtual {v2, v0}, Lo/ced;->d(Lo/eab;)V

    .line 2444
    invoke-static {}, Lo/cbl;->b()Lo/cbl;

    move-result-object v3

    .line 2445
    iget-object v0, p0, Lo/ale;->V:Lo/cwc;

    invoke-virtual {v3, v0}, Lo/cbl;->setAdapter(Lo/eab;)V

    .line 2446
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    invoke-virtual {v3, v0}, Lo/cbl;->init(Landroid/content/Context;)V

    .line 2447
    const-string v0, "TimeEat_MainInteractors"

    const-string v1, "Leave initPluginTrackApapter"

    invoke-static {v0, v1}, Lo/dbf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 2448
    return-void
.end method

.method private av()V
    .locals 2

    .line 2406
    const-string v0, "TimeEat_MainInteractors"

    const-string v1, "Enter initMessageCenterAdapter"

    invoke-static {v0, v1}, Lo/dbf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 2407
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    invoke-static {v0}, Lo/eaa;->c(Landroid/content/Context;)Lo/eaa;

    move-result-object v0

    new-instance v1, Lo/cwb;

    invoke-direct {v1}, Lo/cwb;-><init>()V

    invoke-virtual {v0, v1}, Lo/eaa;->setAdapter(Lo/eab;)V

    .line 2408
    const-string v0, "TimeEat_MainInteractors"

    const-string v1, "Leave initMessageCenterAdapter"

    invoke-static {v0, v1}, Lo/dbf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 2409
    return-void
.end method

.method private aw()V
    .locals 2

    .line 2471
    const-string v0, "TimeEat_MainInteractors"

    const-string v1, "Enter initOpenSDK"

    invoke-static {v0, v1}, Lo/dbf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 2472
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    invoke-static {v0}, Lo/fgb;->b(Landroid/content/Context;)Lo/fgb;

    move-result-object v0

    invoke-virtual {v0}, Lo/fgb;->a()V

    .line 2473
    const-string v0, "TimeEat_MainInteractors"

    const-string v1, "Leave initOpenSDK"

    invoke-static {v0, v1}, Lo/dbf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 2474
    return-void
.end method

.method private ax()V
    .locals 5

    .line 2834
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "registerSyncBroadcastReceiver enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2835
    iget-object v0, p0, Lo/ale;->W:Lo/ale$d;

    if-nez v0, :cond_0

    .line 2836
    new-instance v0, Lo/ale$d;

    invoke-direct {v0, p0}, Lo/ale$d;-><init>(Lo/ale;)V

    iput-object v0, p0, Lo/ale;->W:Lo/ale$d;

    .line 2838
    :cond_0
    new-instance v4, Landroid/content/IntentFilter;

    invoke-direct {v4}, Landroid/content/IntentFilter;-><init>()V

    .line 2839
    const-string v0, "com.huawei.hihealth.action_sync"

    invoke-virtual {v4, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 2840
    const-string v0, "com.huawei.hihealth.action_sqlite_upgrade_done"

    invoke-virtual {v4, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 2841
    const-string v0, "com.huawei.hihealth.action_sqlite_upgrade_working"

    invoke-virtual {v4, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 2842
    const-string v0, "com.huawei.hihealth.action_sqlite_upgrade_exception"

    invoke-virtual {v4, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 2843
    const-string v0, "com.huawei.plugin.account.logout"

    invoke-virtual {v4, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 2844
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    invoke-static {v0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v0

    iget-object v1, p0, Lo/ale;->W:Lo/ale$d;

    invoke-virtual {v0, v1, v4}, Landroid/support/v4/content/LocalBroadcastManager;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V

    .line 2846
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "registerSyncBroadcastReceiver end"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2847
    return-void
.end method

.method private ay()V
    .locals 5

    .line 2605
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "autoCheckAppNewVersionService()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2606
    invoke-static {}, Lo/czu;->b()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lo/ale;->I:Lo/etv;

    if-eqz v0, :cond_0

    .line 2607
    iget-object v0, p0, Lo/ale;->I:Lo/etv;

    invoke-virtual {v0}, Lo/etv;->a()V

    .line 2608
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    invoke-static {v0}, Lo/dpb;->b(Landroid/content/Context;)Lo/dpb;

    move-result-object v0

    invoke-virtual {v0}, Lo/dpb;->d()Z

    move-result v4

    .line 2609
    if-nez v4, :cond_0

    .line 2610
    iget-object v0, p0, Lo/ale;->I:Lo/etv;

    invoke-virtual {v0}, Lo/etv;->k()V

    .line 2613
    :cond_0
    return-void
.end method

.method private az()V
    .locals 6

    .line 2482
    const-string v0, "TimeEat_MainInteractors"

    const-string v1, "Enter initSmartAiRule"

    invoke-static {v0, v1}, Lo/dbf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 2483
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "IS_FIRST_RULE"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 2484
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isFirst = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2485
    const-string v0, "0"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 2486
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    invoke-static {v0}, Lo/fhw;->e(Landroid/content/Context;)V

    .line 2487
    new-instance v5, Lo/dcy;

    invoke-direct {v5}, Lo/dcy;-><init>()V

    .line 2488
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "IS_FIRST_RULE"

    const-string v3, "0"

    invoke-static {v0, v1, v2, v3, v5}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 2490
    :cond_0
    const-string v0, "TimeEat_MainInteractors"

    const-string v1, "Leave initSmartAiRule"

    invoke-static {v0, v1}, Lo/dbf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 2491
    return-void
.end method

.method static synthetic b(Lo/ale;J)J
    .locals 0

    .line 170
    iput-wide p1, p0, Lo/ale;->K:J

    return-wide p1
.end method

.method private b(Ljava/lang/String;Ljava/lang/String;)Landroid/text/SpannableString;
    .locals 5

    .line 3242
    new-instance v3, Landroid/text/SpannableString;

    invoke-static {p1}, Lo/ale;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v3, v0}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 3243
    invoke-virtual {v3}, Landroid/text/SpannableString;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v4

    .line 3244
    new-instance v0, Landroid/text/style/ForegroundColorSpan;

    iget-object v1, p0, Lo/ale;->o:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f1101b9

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-direct {v0, v1}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    .line 3245
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v1

    add-int/2addr v1, v4

    .line 3244
    const/16 v2, 0x21

    invoke-virtual {v3, v0, v4, v1, v2}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 3246
    return-object v3
.end method

.method static synthetic b(Lo/ale;Lcom/huawei/login/ui/login/LoginInit;)Lcom/huawei/login/ui/login/LoginInit;
    .locals 0

    .line 170
    iput-object p1, p0, Lo/ale;->f:Lcom/huawei/login/ui/login/LoginInit;

    return-object p1
.end method

.method static synthetic b(Lo/ale;Lo/egv;)Lo/egv;
    .locals 0

    .line 170
    iput-object p1, p0, Lo/ale;->ac:Lo/egv;

    return-object p1
.end method

.method private b(Landroid/text/SpannableString;)V
    .locals 7

    .line 3254
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    const v1, 0x7f0703e7

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v3

    .line 3255
    const v0, 0x7f121912

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/widget/TextView;

    .line 3256
    invoke-virtual {v4, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 3258
    new-instance v6, Lo/egw$c;

    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    invoke-direct {v6, v0}, Lo/egw$c;-><init>(Landroid/content/Context;)V

    .line 3259
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    const v1, 0x7f0200d0

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lo/egw$c;->a(Ljava/lang/String;)Lo/egw$c;

    move-result-object v0

    .line 3260
    invoke-virtual {v0, v3}, Lo/egw$c;->e(Landroid/view/View;)Lo/egw$c;

    move-result-object v0

    iget-object v1, p0, Lo/ale;->o:Landroid/content/Context;

    .line 3261
    const v2, 0x7f02029e

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lo/ale$43;

    invoke-direct {v2, p0}, Lo/ale$43;-><init>(Lo/ale;)V

    invoke-virtual {v0, v1, v2}, Lo/egw$c;->a(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egw$c;

    move-result-object v0

    iget-object v1, p0, Lo/ale;->o:Landroid/content/Context;

    .line 3273
    const v2, 0x7f020074

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lo/ale$44;

    invoke-direct {v2, p0}, Lo/ale$44;-><init>(Lo/ale;)V

    invoke-virtual {v0, v1, v2}, Lo/egw$c;->c(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egw$c;

    .line 3278
    invoke-virtual {v6}, Lo/egw$c;->e()Lo/egw;

    move-result-object v5

    .line 3279
    invoke-virtual {v5}, Lo/egw;->show()V

    .line 3280
    return-void
.end method

.method public static b(Ljava/lang/String;)V
    .locals 5

    .line 3445
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter originalProcess"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3446
    new-instance v4, Lo/fcb;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-direct {v4, v0}, Lo/fcb;-><init>(Landroid/content/Context;)V

    .line 3447
    invoke-virtual {v4, p0}, Lo/fcb;->e(Ljava/lang/String;)V

    .line 3448
    return-void
.end method

.method private b(Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 5

    .line 1644
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: copyAToBByHiDATA enter oldHuid is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    const-string v2, " newHuid is "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aput-object p2, v1, v2

    const-string v2, " isSync is "

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-static {p3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1645
    new-instance v4, Lcom/huawei/hihealth/HiDataUpdateOption;

    invoke-direct {v4}, Lcom/huawei/hihealth/HiDataUpdateOption;-><init>()V

    .line 1646
    const-string v0, "old_huid"

    invoke-virtual {v4, v0, p1}, Lcom/huawei/hihealth/HiDataUpdateOption;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 1647
    const-string v0, "new_huid"

    invoke-virtual {v4, v0, p2}, Lcom/huawei/hihealth/HiDataUpdateOption;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 1648
    const-string v0, "copy_sync_status"

    invoke-virtual {v4, v0, p3}, Lcom/huawei/hihealth/HiDataUpdateOption;->putBoolean(Ljava/lang/String;Z)V

    .line 1649
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    new-instance v1, Lo/ale$24;

    invoke-direct {v1, p0, p1, p2}, Lo/ale$24;-><init>(Lo/ale;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v4, v1}, Lo/clt;->e(Lcom/huawei/hihealth/HiDataUpdateOption;Lo/cma;)V

    .line 1657
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: copyAToBByHiDATA end"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1659
    return-void
.end method

.method static synthetic b(Lo/ale;)V
    .locals 0

    .line 170
    invoke-direct {p0}, Lo/ale;->V()V

    return-void
.end method

.method static synthetic b(Lo/ale;I)V
    .locals 0

    .line 170
    invoke-direct {p0, p1}, Lo/ale;->f(I)V

    return-void
.end method

.method static synthetic b(Lo/ale;Lo/dcy;I)V
    .locals 0

    .line 170
    invoke-direct {p0, p1, p2}, Lo/ale;->b(Lo/dcy;I)V

    return-void
.end method

.method private b(Lo/dcy;I)V
    .locals 4

    .line 2072
    const/4 v0, 0x1

    if-ne p2, v0, :cond_0

    .line 2073
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    .line 2074
    const/16 v1, 0x271f

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "key_ui_login_exit_hms_apk"

    const-string v3, "1"

    .line 2073
    invoke-static {v0, v1, v2, v3, p1}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    goto :goto_0

    .line 2077
    :cond_0
    const/4 v0, 0x2

    if-ne p2, v0, :cond_1

    .line 2078
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    .line 2079
    const/16 v1, 0x271f

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "key_ui_login_exit_hms_apk"

    const-string v3, "2"

    .line 2078
    invoke-static {v0, v1, v2, v3, p1}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 2083
    :cond_1
    :goto_0
    return-void
.end method

.method private b(Z)V
    .locals 4

    .line 2187
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "accountmigrate: hmsHasLoginedLogin(),hasLogined = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2188
    invoke-direct {p0}, Lo/ale;->aj()V

    .line 2189
    if-eqz p1, :cond_0

    .line 2191
    invoke-direct {p0}, Lo/ale;->an()V

    goto :goto_0

    .line 2193
    :cond_0
    iget-object v0, p0, Lo/ale;->f:Lcom/huawei/login/ui/login/LoginInit;

    iget-object v1, p0, Lo/ale;->o:Landroid/content/Context;

    new-instance v2, Lo/ale$b;

    invoke-direct {v2, p0}, Lo/ale$b;-><init>(Lo/ale;)V

    invoke-virtual {v0, v1, v2}, Lcom/huawei/login/ui/login/LoginInit;->hmsHasLoginedLogin(Landroid/content/Context;Lcom/huawei/login/ui/login/util/ILoginCallback;)V

    .line 2195
    :goto_0
    return-void
.end method

.method public static b()Z
    .locals 1

    .line 256
    sget-boolean v0, Lo/ale;->g:Z

    return v0
.end method

.method private b(Landroid/content/Context;)Z
    .locals 3

    .line 1182
    const-string v0, "connectivity"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Landroid/net/ConnectivityManager;

    .line 1183
    invoke-virtual {v1}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object v2

    .line 1184
    if-eqz v2, :cond_0

    invoke-virtual {v2}, Landroid/net/NetworkInfo;->isConnected()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method static synthetic b(Lo/ale;Z)Z
    .locals 0

    .line 170
    iput-boolean p1, p0, Lo/ale;->h:Z

    return p1
.end method

.method static synthetic c(Lo/ale;I)I
    .locals 0

    .line 170
    iput p1, p0, Lo/ale;->A:I

    return p1
.end method

.method static synthetic c(Lo/ale;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 170
    iput-object p1, p0, Lo/ale;->n:Ljava/lang/String;

    return-object p1
.end method

.method private c(Landroid/content/Context;Landroid/view/View;)V
    .locals 13

    .line 425
    const v0, 0x7f1218db

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroid/widget/TextView;

    .line 426
    invoke-static {}, Landroid/text/method/LinkMovementMethod;->getInstance()Landroid/text/method/MovementMethod;

    move-result-object v0

    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setMovementMethod(Landroid/text/method/MovementMethod;)V

    .line 427
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x106000d

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setHighlightColor(I)V

    .line 429
    const v0, 0x7f020003

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 430
    const v0, 0x7f02021c

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v5

    .line 431
    new-instance v6, Landroid/text/SpannableString;

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object v4, v0, v1

    const/4 v1, 0x1

    aput-object v5, v0, v1

    const v1, 0x7f020240

    invoke-virtual {p1, v1, v0}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v6, v0}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 432
    invoke-virtual {v6}, Landroid/text/SpannableString;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v7

    .line 433
    new-instance v8, Lo/fhs;

    const-string v0, "HealthUserAgreement"

    invoke-direct {v8, p1, v0}, Lo/fhs;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 434
    new-instance v0, Landroid/text/style/TypefaceSpan;

    const-string v1, "HwChinese-medium"

    invoke-direct {v0, v1}, Landroid/text/style/TypefaceSpan;-><init>(Ljava/lang/String;)V

    .line 436
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v1

    add-int/2addr v1, v7

    .line 434
    const/16 v2, 0x21

    invoke-virtual {v6, v0, v7, v1, v2}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 437
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v0

    add-int/2addr v0, v7

    const/16 v1, 0x11

    invoke-virtual {v6, v8, v7, v0, v1}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 439
    invoke-virtual {v6}, Landroid/text/SpannableString;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v7

    .line 440
    new-instance v9, Lo/fhs;

    const-string v0, "HealthPrivacy"

    invoke-direct {v9, p1, v0}, Lo/fhs;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 441
    new-instance v0, Landroid/text/style/TypefaceSpan;

    const-string v1, "HwChinese-medium"

    invoke-direct {v0, v1}, Landroid/text/style/TypefaceSpan;-><init>(Ljava/lang/String;)V

    .line 443
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v1

    add-int/2addr v1, v7

    .line 441
    const/16 v2, 0x21

    invoke-virtual {v6, v0, v7, v1, v2}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 444
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v0

    add-int/2addr v0, v7

    const/16 v1, 0x11

    invoke-virtual {v6, v9, v7, v0, v1}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 446
    new-instance v10, Landroid/text/SpannableString;

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object v4, v0, v1

    const v1, 0x7f02024e

    invoke-virtual {p1, v1, v0}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v10, v0}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 447
    invoke-virtual {v10}, Landroid/text/SpannableString;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v11

    .line 448
    new-instance v0, Lo/fhs;

    move-object v1, p1

    const-string v2, "HealthUserAgreement"

    invoke-direct {v0, v1, v2}, Lo/fhs;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    move-object v12, v0

    .line 449
    new-instance v0, Landroid/text/style/TypefaceSpan;

    const-string v1, "HwChinese-medium"

    invoke-direct {v0, v1}, Landroid/text/style/TypefaceSpan;-><init>(Ljava/lang/String;)V

    .line 451
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v1

    add-int/2addr v1, v11

    .line 449
    const/16 v2, 0x21

    invoke-virtual {v10, v0, v11, v1, v2}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 452
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v0

    add-int/2addr v0, v11

    const/16 v1, 0x11

    invoke-virtual {v10, v12, v11, v0, v1}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 454
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 455
    invoke-virtual {v3, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 457
    :cond_0
    invoke-virtual {v3, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 459
    :goto_0
    return-void
.end method

.method private c(Landroid/content/Context;[Ljava/lang/String;)V
    .locals 8

    .line 2571
    invoke-static {p1, p2}, Lo/dbe;->c(Landroid/content/Context;[Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 2572
    iget-object v0, p0, Lo/ale;->l:Landroid/app/Activity;

    new-instance v1, Lo/ale$35;

    invoke-direct {v1, p0}, Lo/ale$35;-><init>(Lo/ale;)V

    invoke-static {v0, p2, v1}, Lo/dbe;->a(Landroid/app/Activity;[Ljava/lang/String;Lo/dbs;)V

    .line 2583
    move-object v4, p2

    array-length v5, v4

    const/4 v6, 0x0

    :goto_0
    if-ge v6, v5, :cond_2

    aget-object v7, v4, v6

    .line 2584
    const-string v0, "android.permission.WRITE_EXTERNAL_STORAGE"

    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2585
    const-string v0, "android.permission.WRITE_EXTERNAL_STORAGE"

    invoke-static {p1, v0}, Lo/dbf;->m(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_1

    .line 2586
    :cond_0
    const-string v0, "android.permission.ACCESS_COARSE_LOCATION"

    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2587
    const-string v0, "android.permission.ACCESS_COARSE_LOCATION"

    invoke-static {p1, v0}, Lo/dbf;->m(Landroid/content/Context;Ljava/lang/String;)V

    .line 2583
    :cond_1
    :goto_1
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_2
    goto :goto_3

    .line 2591
    :cond_3
    invoke-static {p1}, Lo/dbf;->q(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 2592
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HavePermission MainInteractors_autoCheckAppNewVersionService_isForeground_stop"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2593
    invoke-direct {p0}, Lo/ale;->ay()V

    .line 2594
    invoke-direct {p0}, Lo/ale;->aQ()V

    goto :goto_2

    .line 2596
    :cond_4
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HavePermission MainInteractors_autoCheckAppNewVersionService_isForeground_fail"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2598
    :goto_2
    invoke-virtual {p0}, Lo/ale;->t()V

    .line 2599
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isHasPermissions"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2601
    :goto_3
    return-void
.end method

.method private c(Ljava/lang/String;)V
    .locals 5

    .line 3673
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    const/16 v1, 0x271f

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "hw_health_login_country_change_version"

    new-instance v3, Lo/dcy;

    const/4 v4, 0x0

    invoke-direct {v3, v4}, Lo/dcy;-><init>(I)V

    invoke-static {v0, v1, v2, p1, v3}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 3675
    return-void
.end method

.method static synthetic c(Lo/ale;)V
    .locals 0

    .line 170
    invoke-direct {p0}, Lo/ale;->Y()V

    return-void
.end method

.method static synthetic c(Lo/ale;Ljava/lang/String;Z)V
    .locals 0

    .line 170
    invoke-direct {p0, p1, p2}, Lo/ale;->a(Ljava/lang/String;Z)V

    return-void
.end method

.method private static c(Z)V
    .locals 0

    .line 761
    sput-boolean p0, Lo/ale;->g:Z

    .line 762
    return-void
.end method

.method static synthetic d(Lo/ale;Lcom/huawei/hwid/core/datatype/UserInfo;)Lcom/huawei/hwid/core/datatype/UserInfo;
    .locals 0

    .line 170
    iput-object p1, p0, Lo/ale;->F:Lcom/huawei/hwid/core/datatype/UserInfo;

    return-object p1
.end method

.method static synthetic d(Lo/ale;Ljava/util/concurrent/ExecutorService;)Ljava/util/concurrent/ExecutorService;
    .locals 0

    .line 170
    iput-object p1, p0, Lo/ale;->u:Ljava/util/concurrent/ExecutorService;

    return-object p1
.end method

.method static synthetic d(Lo/ale;)Lo/ali;
    .locals 1

    .line 170
    iget-object v0, p0, Lo/ale;->R:Lo/ali;

    return-object v0
.end method

.method private d(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 6

    .line 3349
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter showHmsDialog "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3351
    new-instance v5, Lo/egv$b;

    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    invoke-direct {v5, v0}, Lo/egv$b;-><init>(Landroid/content/Context;)V

    .line 3352
    invoke-virtual {v5, p2}, Lo/egv$b;->e(Ljava/lang/String;)Lo/egv$b;

    move-result-object v0

    .line 3353
    invoke-virtual {v0, p3}, Lo/egv$b;->b(Ljava/lang/String;)Lo/egv$b;

    move-result-object v0

    .line 3354
    const v1, 0x7f020201

    invoke-virtual {p1, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lo/ale$47;

    invoke-direct {v2, p0, p4}, Lo/ale$47;-><init>(Lo/ale;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    invoke-virtual {v0, v1, v2}, Lo/egv$b;->b(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egv$b;

    move-result-object v0

    .line 3360
    const v1, 0x7f020200

    invoke-virtual {p1, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lo/ale$42;

    invoke-direct {v2, p0, p4}, Lo/ale$42;-><init>(Lo/ale;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    invoke-virtual {v0, v1, v2}, Lo/egv$b;->e(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egv$b;

    .line 3366
    invoke-virtual {v5}, Lo/egv$b;->b()Lo/egv;

    move-result-object v4

    .line 3367
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Lo/egv;->setCancelable(Z)V

    .line 3368
    invoke-virtual {v4}, Lo/egv;->show()V

    .line 3369
    return-void
.end method

.method private d(Ljava/lang/String;)V
    .locals 8

    .line 1614
    const-string v0, "TimeEat_MainInteractors"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: copyByHuid = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1615
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1616
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: copyByHuid old is Empty"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1617
    return-void

    .line 1619
    :cond_0
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    invoke-static {v0}, Lo/dcn;->e(Landroid/content/Context;)Lo/dcn;

    move-result-object v0

    const-string v1, "is_database_update_success"

    invoke-virtual {v0, v1}, Lo/dcn;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 1620
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    invoke-static {v0}, Lo/dcn;->e(Landroid/content/Context;)Lo/dcn;

    move-result-object v0

    const-string v1, "is_database_update_success"

    const-string v2, "0"

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Lo/dcn;->e(Ljava/lang/String;Ljava/lang/String;Lo/dcx;)V

    .line 1621
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: copyData  isdatabaseupdatesuccessful == "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    const-string v2, "and getDatabasePath(DataBaseHelper.DATABASE_NAME).exists() is"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v2

    const-string v3, "health_cloud.db"

    invoke-virtual {v2, v3}, Landroid/content/Context;->getDatabasePath(Ljava/lang/String;)Ljava/io/File;

    move-result-object v2

    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1622
    const-string v0, "1"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const-string v1, "health_cloud.db"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getDatabasePath(Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1623
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: copyData  accountType == 1 and 1 is databaseupdatesuccessful"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1624
    return-void

    .line 1626
    :cond_1
    move-object v5, p1

    .line 1627
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/LoginInit;->getUsetId()Ljava/lang/String;

    move-result-object v6

    .line 1628
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "accountmigrate: copyData oldhuid = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "currhuid = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1631
    const-string v0, "0"

    :try_start_0
    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "com.huawei.health"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 1632
    :cond_2
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: copyData old = defualt"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1633
    const-string v0, "com.huawei.health"

    const/4 v1, 0x0

    invoke-direct {p0, v0, v6, v1}, Lo/ale;->b(Ljava/lang/String;Ljava/lang/String;Z)V

    goto :goto_0

    .line 1635
    :cond_3
    const/4 v0, 0x0

    invoke-direct {p0, v5, v6, v0}, Lo/ale;->b(Ljava/lang/String;Ljava/lang/String;Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 1639
    :goto_0
    goto :goto_1

    .line 1637
    :catch_0
    move-exception v7

    .line 1638
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: copyData copyHealthDatasFromAtoB down error and iscopysuccessful = Exception"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v7}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1640
    :goto_1
    const-string v0, "TimeEat_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Leave copyByHuid"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1641
    return-void
.end method

.method static synthetic d(Lo/ale;I)V
    .locals 0

    .line 170
    invoke-direct {p0, p1}, Lo/ale;->k(I)V

    return-void
.end method

.method private d(Z)V
    .locals 5

    .line 1752
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setNeedNoteRelogin:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1753
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0x3ef

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "need_relogin"

    .line 1754
    invoke-static {p1}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v3

    .line 1753
    const/4 v4, 0x0

    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 1755
    return-void
.end method

.method private d(Landroid/content/Context;)Z
    .locals 7

    .line 3303
    new-instance v4, Lo/cwx;

    invoke-direct {v4, p1}, Lo/cwx;-><init>(Landroid/content/Context;)V

    .line 3304
    const-string v0, "com.huawei.hwid"

    invoke-virtual {v4, v0}, Lo/cwx;->c(Ljava/lang/String;)I

    move-result v5

    .line 3305
    const v0, 0x138d334

    if-lt v5, v0, :cond_0

    const/4 v6, 0x1

    goto :goto_0

    :cond_0
    const/4 v6, 0x0

    .line 3306
    :goto_0
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isHMSUpdated:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3307
    return v6
.end method

.method static synthetic d(Lo/ale;Z)Z
    .locals 0

    .line 170
    iput-boolean p1, p0, Lo/ale;->v:Z

    return p1
.end method

.method static synthetic e(Lo/ale;)Landroid/content/Context;
    .locals 1

    .line 170
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic e(Lo/ale;Lcom/huawei/hihealth/HiAccountInfo;)Lcom/huawei/hihealth/HiAccountInfo;
    .locals 0

    .line 170
    iput-object p1, p0, Lo/ale;->x:Lcom/huawei/hihealth/HiAccountInfo;

    return-object p1
.end method

.method private static e(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 289
    invoke-virtual {p0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v2

    .line 290
    const/4 v3, 0x0

    :goto_0
    array-length v0, v2

    if-ge v3, v0, :cond_3

    .line 291
    aget-char v0, v2, v3

    const v1, 0xff0c

    if-eq v0, v1, :cond_2

    aget-char v0, v2, v3

    const/16 v1, 0x3002

    if-ne v0, v1, :cond_0

    .line 292
    goto :goto_1

    .line 294
    :cond_0
    aget-char v0, v2, v3

    const/16 v1, 0x3000

    if-ne v0, v1, :cond_1

    .line 295
    const/16 v0, 0x20

    aput-char v0, v2, v3

    .line 296
    goto :goto_1

    .line 297
    :cond_1
    aget-char v0, v2, v3

    const v1, 0xff00

    if-le v0, v1, :cond_2

    aget-char v0, v2, v3

    const v1, 0xff5f

    if-ge v0, v1, :cond_2

    .line 298
    aget-char v0, v2, v3

    const v1, 0xfee0

    sub-int/2addr v0, v1

    int-to-char v0, v0

    aput-char v0, v2, v3

    .line 290
    :cond_2
    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 300
    :cond_3
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v2}, Ljava/lang/String;-><init>([C)V

    return-object v0
.end method

.method private e(Ljava/lang/String;Ljava/lang/String;I)V
    .locals 7

    .line 1662
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: copyData handleCopyResult  and oldhuid is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    const-string v2, " currhuid is "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aput-object p2, v1, v2

    const-string v2, " iscopysuccessful = "

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1663
    if-eqz p3, :cond_0

    const/4 v0, 0x2

    if-ne p3, v0, :cond_2

    .line 1664
    :cond_0
    invoke-static {}, Lo/dcs;->e()Lo/dcs;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lo/dcs;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 1665
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    const/16 v1, 0x271f

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "is_auth_failed_migrate"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 1667
    const-string v0, "is_auth_failed_migrate_true"

    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1668
    iget-object v0, p0, Lo/ale;->m:Landroid/os/Handler;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 1669
    iget-object v0, p0, Lo/ale;->m:Landroid/os/Handler;

    const/16 v1, 0xfa9

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 1670
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    const/16 v1, 0x271f

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "is_auth_failed_migrate"

    const-string v3, "is_auth_failed_migrate_false"

    new-instance v4, Lo/dcy;

    const/4 v5, 0x0

    invoke-direct {v4, v5}, Lo/dcy;-><init>(I)V

    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 1676
    :cond_1
    goto/16 :goto_0

    :cond_2
    const/4 v0, 0x3

    if-ne p3, v0, :cond_4

    .line 1677
    invoke-static {}, Lo/dcs;->e()Lo/dcs;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lo/dcs;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 1678
    const-string v0, "0"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    const-string v0, "com.huawei.health"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 1679
    iget-object v0, p0, Lo/ale;->m:Landroid/os/Handler;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 1680
    iget-object v0, p0, Lo/ale;->m:Landroid/os/Handler;

    const/16 v1, 0xfad

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 1683
    :cond_3
    new-instance v6, Landroid/os/Bundle;

    invoke-direct {v6}, Landroid/os/Bundle;-><init>()V

    .line 1684
    const-string v0, "error_code"

    const-wide/16 v1, 0x3

    invoke-virtual {v6, v0, v1, v2}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    .line 1685
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "notice local migrate account data but return RESULT_NO_DETAIL_DATA message."

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const v2, 0x3611a8e1

    const/4 v3, 0x0

    invoke-static {v2, v0, v6, v3, v1}, Lo/dho;->e(ILjava/lang/String;Landroid/os/Bundle;Z[Ljava/lang/Object;)V

    .line 1686
    goto :goto_0

    .line 1687
    :cond_4
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: showDataMigrateDialog copyHealthDatasFromAtoB down and failed"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1688
    new-instance v6, Landroid/os/Bundle;

    invoke-direct {v6}, Landroid/os/Bundle;-><init>()V

    .line 1689
    const-string v0, "error_code"

    int-to-long v1, p3

    invoke-virtual {v6, v0, v1, v2}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    .line 1690
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "notice local migrate account data but return error message."

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const v2, 0x3611a8e1

    const/4 v3, 0x0

    invoke-static {v2, v0, v6, v3, v1}, Lo/dho;->e(ILjava/lang/String;Landroid/os/Bundle;Z[Ljava/lang/Object;)V

    .line 1692
    :goto_0
    return-void
.end method

.method private e(Ljava/lang/String;Z)V
    .locals 5

    .line 2151
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "accountmigrate: jugeIsSameHuid() enter, hasLogined = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2153
    iget-object v0, p0, Lo/ale;->z:Lcom/huawei/hihealthservice/old/model/AccountInfo;

    if-eqz v0, :cond_2

    .line 2154
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: jugeIsSameHuid()  response accountInfo != null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2155
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "accountInfo = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/ale;->z:Lcom/huawei/hihealthservice/old/model/AccountInfo;

    invoke-virtual {v3}, Lcom/huawei/hihealthservice/old/model/AccountInfo;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2156
    iget-object v0, p0, Lo/ale;->z:Lcom/huawei/hihealthservice/old/model/AccountInfo;

    invoke-virtual {v0}, Lcom/huawei/hihealthservice/old/model/AccountInfo;->getUserID()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v4

    .line 2157
    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 2158
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: jugeIsSameHuid()  response !strHuid.equals(oldHuid) and use 1.0 account login"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2159
    iget-object v0, p0, Lo/ale;->z:Lcom/huawei/hihealthservice/old/model/AccountInfo;

    invoke-virtual {v0}, Lcom/huawei/hihealthservice/old/model/AccountInfo;->getServiceToken()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2160
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: jugeIsSameHu1coid response !strHuid.equals(oldHuid) and use 1.0 account login but st empty"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2161
    invoke-direct {p0}, Lo/ale;->ai()V

    goto/16 :goto_0

    .line 2163
    :cond_0
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: jugeIsSameHuid response !strHuid.equals(oldHuid) judge is kidwatch exist"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2164
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lo/ale;->p(I)V

    goto/16 :goto_0

    .line 2167
    :cond_1
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: jugeIsSameHuid response strHuid.equals(oldHuid),login..."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2168
    invoke-direct {p0, p2}, Lo/ale;->b(Z)V

    goto :goto_0

    .line 2170
    :cond_2
    iget-object v0, p0, Lo/ale;->x:Lcom/huawei/hihealth/HiAccountInfo;

    if-eqz v0, :cond_4

    .line 2171
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: jugeIsSameHuid response hiAccountInfo != null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2172
    iget-object v0, p0, Lo/ale;->x:Lcom/huawei/hihealth/HiAccountInfo;

    invoke-virtual {v0}, Lcom/huawei/hihealth/HiAccountInfo;->getHuid()Ljava/lang/String;

    move-result-object v4

    .line 2173
    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 2174
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: jugeIsSameHuid response !strHuid.equals(oldHuid) judge is kidwatch exist"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2175
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lo/ale;->p(I)V

    goto :goto_0

    .line 2177
    :cond_3
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: jugeIsSameHuid response strHuid.equals(oldHuid),login..."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2178
    invoke-direct {p0, p2}, Lo/ale;->b(Z)V

    goto :goto_0

    .line 2181
    :cond_4
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: jugeIsSameHuid response accountInfo == null hiAccountInfo == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2182
    invoke-direct {p0, p2}, Lo/ale;->b(Z)V

    .line 2184
    :goto_0
    return-void
.end method

.method static synthetic e(Lo/ale;I)V
    .locals 0

    .line 170
    invoke-direct {p0, p1}, Lo/ale;->h(I)V

    return-void
.end method

.method static synthetic e(Lo/ale;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 0

    .line 170
    invoke-direct {p0, p1, p2, p3}, Lo/ale;->e(Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method

.method private e(Landroid/content/Context;)Z
    .locals 7

    .line 3341
    new-instance v4, Lo/cwx;

    invoke-direct {v4, p1}, Lo/cwx;-><init>(Landroid/content/Context;)V

    .line 3342
    const-string v0, "com.huawei.hwid"

    invoke-virtual {v4, v0}, Lo/cwx;->c(Ljava/lang/String;)I

    move-result v5

    .line 3343
    if-lez v5, :cond_0

    const/4 v6, 0x1

    goto :goto_0

    :cond_0
    const/4 v6, 0x0

    .line 3344
    :goto_0
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "versionCode:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3345
    return v6
.end method

.method static synthetic f(Lo/ale;I)I
    .locals 0

    .line 170
    iput p1, p0, Lo/ale;->j:I

    return p1
.end method

.method private f(I)V
    .locals 5

    .line 1699
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: loginByAccountType accounttype = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1700
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/LoginInit;->getLoginByVersinOne()I

    move-result v0

    if-ne p1, v0, :cond_0

    .line 1701
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    iget-object v1, p0, Lo/ale;->z:Lcom/huawei/hihealthservice/old/model/AccountInfo;

    invoke-virtual {v1}, Lcom/huawei/hihealthservice/old/model/AccountInfo;->getUserID()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/login/ui/login/LoginInit;->setUsetId(Ljava/lang/String;)V

    .line 1702
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    iget-object v1, p0, Lo/ale;->z:Lcom/huawei/hihealthservice/old/model/AccountInfo;

    invoke-virtual {v1}, Lcom/huawei/hihealthservice/old/model/AccountInfo;->getAccessToken()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/login/ui/login/LoginInit;->setAccessToken(Ljava/lang/String;)V

    .line 1703
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    iget-object v1, p0, Lo/ale;->z:Lcom/huawei/hihealthservice/old/model/AccountInfo;

    invoke-virtual {v1}, Lcom/huawei/hihealthservice/old/model/AccountInfo;->getServiceToken()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/login/ui/login/LoginInit;->setSeverToken(Ljava/lang/String;)V

    .line 1704
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/huawei/login/ui/login/LoginInit;->setIsLogined(Z)V

    .line 1705
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    iget-object v1, p0, Lo/ale;->z:Lcom/huawei/hihealthservice/old/model/AccountInfo;

    invoke-virtual {v1}, Lcom/huawei/hihealthservice/old/model/AccountInfo;->getSiteId()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/huawei/login/ui/login/LoginInit;->setSiteId(I)V

    .line 1706
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "accountmigrate: loginByAccountType accountInfo siteId = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/ale;->z:Lcom/huawei/hihealthservice/old/model/AccountInfo;

    invoke-virtual {v3}, Lcom/huawei/hihealthservice/old/model/AccountInfo;->getSiteId()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1707
    new-instance v4, Lo/dcy;

    const/4 v0, 0x0

    invoke-direct {v4, v0}, Lo/dcy;-><init>(I)V

    .line 1708
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "health_app_third_login"

    const-string v3, "1"

    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 1709
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lo/ale;->d(Z)V

    .line 1710
    goto/16 :goto_1

    :cond_0
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/LoginInit;->getLoginByVersionTwo()I

    move-result v0

    if-ne p1, v0, :cond_1

    .line 1711
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    iget-object v1, p0, Lo/ale;->x:Lcom/huawei/hihealth/HiAccountInfo;

    invoke-virtual {v1}, Lcom/huawei/hihealth/HiAccountInfo;->getHuid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/login/ui/login/LoginInit;->setUsetId(Ljava/lang/String;)V

    .line 1712
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    iget-object v1, p0, Lo/ale;->x:Lcom/huawei/hihealth/HiAccountInfo;

    invoke-virtual {v1}, Lcom/huawei/hihealth/HiAccountInfo;->getAccessToken()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/login/ui/login/LoginInit;->setAccessToken(Ljava/lang/String;)V

    .line 1713
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    iget-object v1, p0, Lo/ale;->x:Lcom/huawei/hihealth/HiAccountInfo;

    invoke-virtual {v1}, Lcom/huawei/hihealth/HiAccountInfo;->getServiceToken()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/login/ui/login/LoginInit;->setSeverToken(Ljava/lang/String;)V

    .line 1714
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/huawei/login/ui/login/LoginInit;->setIsLogined(Z)V

    .line 1715
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    iget-object v1, p0, Lo/ale;->x:Lcom/huawei/hihealth/HiAccountInfo;

    invoke-virtual {v1}, Lcom/huawei/hihealth/HiAccountInfo;->getSiteId()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/huawei/login/ui/login/LoginInit;->setSiteId(I)V

    .line 1716
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "accountmigrate: loginByAccountType hiAccountInfo siteId = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/ale;->x:Lcom/huawei/hihealth/HiAccountInfo;

    invoke-virtual {v3}, Lcom/huawei/hihealth/HiAccountInfo;->getSiteId()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1717
    new-instance v4, Lo/dcy;

    const/4 v0, 0x0

    invoke-direct {v4, v0}, Lo/dcy;-><init>(I)V

    .line 1718
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "health_app_third_login"

    const-string v3, "1"

    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 1719
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lo/ale;->d(Z)V

    .line 1720
    goto/16 :goto_1

    :cond_1
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/LoginInit;->getLoginByWear()I

    move-result v0

    if-ne p1, v0, :cond_3

    .line 1721
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "accountmigrate: loginByAccountType = 3 accountWear = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/ale;->y:Lcom/huawei/account/aidl/AccountAidlInfo;

    invoke-virtual {v3}, Lcom/huawei/account/aidl/AccountAidlInfo;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1722
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    iget-object v1, p0, Lo/ale;->y:Lcom/huawei/account/aidl/AccountAidlInfo;

    invoke-virtual {v1}, Lcom/huawei/account/aidl/AccountAidlInfo;->getHuid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/login/ui/login/LoginInit;->setUsetId(Ljava/lang/String;)V

    .line 1723
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    iget-object v1, p0, Lo/ale;->y:Lcom/huawei/account/aidl/AccountAidlInfo;

    invoke-virtual {v1}, Lcom/huawei/account/aidl/AccountAidlInfo;->getAccessToken()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/login/ui/login/LoginInit;->setAccessToken(Ljava/lang/String;)V

    .line 1724
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    iget-object v1, p0, Lo/ale;->y:Lcom/huawei/account/aidl/AccountAidlInfo;

    invoke-virtual {v1}, Lcom/huawei/account/aidl/AccountAidlInfo;->getServeToken()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/login/ui/login/LoginInit;->setSeverToken(Ljava/lang/String;)V

    .line 1725
    iget-object v0, p0, Lo/ale;->y:Lcom/huawei/account/aidl/AccountAidlInfo;

    invoke-virtual {v0}, Lcom/huawei/account/aidl/AccountAidlInfo;->getSitId()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 1727
    :try_start_0
    iget-object v0, p0, Lo/ale;->y:Lcom/huawei/account/aidl/AccountAidlInfo;

    invoke-virtual {v0}, Lcom/huawei/account/aidl/AccountAidlInfo;->getSitId()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v4

    .line 1728
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: loginByAccountType = 3 accountWear siteId 1111= "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1729
    invoke-direct {p0, v4}, Lo/ale;->g(I)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1732
    goto :goto_0

    .line 1730
    :catch_0
    move-exception v4

    .line 1731
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: loginByAccountType error and siteId NumberFormatException"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1732
    goto :goto_0

    .line 1734
    :cond_2
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: loginByAccountType error and getSitId == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1736
    :goto_0
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/huawei/login/ui/login/LoginInit;->setIsLogined(Z)V

    .line 1737
    new-instance v4, Lo/dcy;

    const/4 v0, 0x0

    invoke-direct {v4, v0}, Lo/dcy;-><init>(I)V

    .line 1738
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "health_app_third_login"

    const-string v3, "1"

    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 1739
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lo/ale;->d(Z)V

    .line 1740
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    const/16 v1, 0x271f

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "is_use_wear_login"

    const-string v3, "1"

    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 1741
    goto :goto_1

    :cond_3
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/LoginInit;->getLoginByHWid()I

    move-result v0

    if-ne p1, v0, :cond_4

    .line 1742
    new-instance v4, Lo/dcy;

    const/4 v0, 0x0

    invoke-direct {v4, v0}, Lo/dcy;-><init>(I)V

    .line 1743
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "health_app_third_login"

    const-string v3, "0"

    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 1744
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lo/ale;->d(Z)V

    .line 1746
    :cond_4
    :goto_1
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/huawei/login/ui/login/LoginInit;->setHealthLoginChannel(I)V

    .line 1747
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: loginByAccountType logined and init other and huid is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/ale;->o:Landroid/content/Context;

    invoke-static {v2}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v2

    invoke-virtual {v2}, Lcom/huawei/login/ui/login/LoginInit;->getUsetId()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1748
    invoke-direct {p0}, Lo/ale;->X()V

    .line 1749
    return-void
.end method

.method static synthetic f(Lo/ale;)V
    .locals 0

    .line 170
    invoke-direct {p0}, Lo/ale;->af()V

    return-void
.end method

.method static synthetic g(Lo/ale;I)I
    .locals 0

    .line 170
    iput p1, p0, Lo/ale;->s:I

    return p1
.end method

.method static synthetic g(Lo/ale;)Ljava/util/concurrent/ExecutorService;
    .locals 1

    .line 170
    iget-object v0, p0, Lo/ale;->u:Ljava/util/concurrent/ExecutorService;

    return-object v0
.end method

.method private g(I)V
    .locals 6

    .line 1759
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: setSiteIdByWear() enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1760
    new-instance v4, Ljava/util/concurrent/CountDownLatch;

    const/4 v0, 0x1

    invoke-direct {v4, v0}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    .line 1761
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    new-instance v1, Lo/ale$25;

    invoke-direct {v1, p0, v4}, Lo/ale$25;-><init>(Lo/ale;Ljava/util/concurrent/CountDownLatch;)V

    invoke-virtual {v0, p1, v1}, Lcom/huawei/login/ui/login/LoginInit;->setSiteId(ILo/dcx;)V

    .line 1774
    :try_start_0
    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x3

    invoke-virtual {v4, v1, v2, v0}, Ljava/util/concurrent/CountDownLatch;->await(JLjava/util/concurrent/TimeUnit;)Z
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1777
    goto :goto_0

    .line 1775
    :catch_0
    move-exception v5

    .line 1776
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: 2.0isLogin InterruptedException e = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v5}, Ljava/lang/InterruptedException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1778
    :goto_0
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: setSiteIdByWear() end"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1779
    return-void
.end method

.method static synthetic h(Lo/ale;)Lcom/huawei/account/aidl/AccountAidlInfo;
    .locals 1

    .line 170
    iget-object v0, p0, Lo/ale;->y:Lcom/huawei/account/aidl/AccountAidlInfo;

    return-object v0
.end method

.method public static h()V
    .locals 2

    .line 586
    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    .line 587
    const-string v0, "com.huawei.commonui.CLEAN_ACTIVITY"

    invoke-virtual {v1, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 588
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/support/v4/content/LocalBroadcastManager;->sendBroadcast(Landroid/content/Intent;)Z

    .line 589
    return-void
.end method

.method private h(I)V
    .locals 4

    .line 1916
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: branchMobileHwid(final int type) enter type = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1917
    if-nez p1, :cond_0

    .line 1918
    iget-object v0, p0, Lo/ale;->f:Lcom/huawei/login/ui/login/LoginInit;

    iget-object v1, p0, Lo/ale;->o:Landroid/content/Context;

    new-instance v2, Lo/ale$26;

    invoke-direct {v2, p0}, Lo/ale$26;-><init>(Lo/ale;)V

    invoke-virtual {v0, v1, v2}, Lcom/huawei/login/ui/login/LoginInit;->hmsHasLoginedLogin(Landroid/content/Context;Lcom/huawei/login/ui/login/util/ILoginCallback;)V

    goto :goto_0

    .line 1944
    :cond_0
    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    .line 1945
    iget-object v0, p0, Lo/ale;->f:Lcom/huawei/login/ui/login/LoginInit;

    iget-object v1, p0, Lo/ale;->o:Landroid/content/Context;

    new-instance v2, Lo/ale$28;

    invoke-direct {v2, p0}, Lo/ale$28;-><init>(Lo/ale;)V

    invoke-virtual {v0, v1, v2}, Lcom/huawei/login/ui/login/LoginInit;->login(Landroid/content/Context;Lcom/huawei/login/ui/login/util/ILoginCallback;)V

    .line 1993
    :cond_1
    :goto_0
    return-void
.end method

.method static synthetic h(Lo/ale;I)V
    .locals 0

    .line 170
    invoke-direct {p0, p1}, Lo/ale;->p(I)V

    return-void
.end method

.method private h(Z)Z
    .locals 10

    .line 3045
    const/4 v4, 0x1

    new-array v4, v4, [Z

    fill-array-data v4, :array_0

    .line 3046
    new-instance v5, Ljava/util/concurrent/CountDownLatch;

    const/4 v0, 0x1

    invoke-direct {v5, v0}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    .line 3048
    const-string v0, "TimeEat_MainInteractors"

    const-string v1, "Enter getIf1login, start to fetchAccountInfo"

    invoke-static {v0, v1}, Lo/dbf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 3049
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    new-instance v1, Lo/ale$36;

    invoke-direct {v1, p0, v5, v4}, Lo/ale$36;-><init>(Lo/ale;Ljava/util/concurrent/CountDownLatch;[Z)V

    invoke-interface {v0, v1}, Lo/clt;->c(Lo/clz;)V

    .line 3106
    if-eqz p1, :cond_0

    .line 3107
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;->hasLoginAccount(Landroid/content/Context;)Z

    .line 3111
    :cond_0
    :try_start_0
    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x3

    invoke-virtual {v5, v1, v2, v0}, Ljava/util/concurrent/CountDownLatch;->await(JLjava/util/concurrent/TimeUnit;)Z
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 3114
    goto :goto_0

    .line 3112
    :catch_0
    move-exception v6

    .line 3113
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: 2.0isLogin InterruptedException e = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Ljava/lang/InterruptedException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3116
    :goto_0
    const/4 v0, 0x0

    aget-boolean v0, v4, v0

    if-eqz v0, :cond_1

    .line 3117
    const/4 v0, 0x1

    return v0

    .line 3120
    :cond_1
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const-string v1, "health_cloud.db"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getDatabasePath(Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 3121
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: getIf1login obtainOldHuid database exists"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3122
    new-instance v6, Lcom/huawei/hihealthservice/old/db/dao/Account;

    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    invoke-direct {v6, v0}, Lcom/huawei/hihealthservice/old/db/dao/Account;-><init>(Landroid/content/Context;)V

    .line 3123
    invoke-virtual {v6}, Lcom/huawei/hihealthservice/old/db/dao/Account;->getAccountinfo()Lcom/huawei/hihealthservice/old/model/AccountInfo;

    move-result-object v0

    iput-object v0, p0, Lo/ale;->z:Lcom/huawei/hihealthservice/old/model/AccountInfo;

    .line 3124
    new-instance v7, Lcom/huawei/hihealthservice/old/db/dao/InfoUserCode;

    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    invoke-direct {v7, v0}, Lcom/huawei/hihealthservice/old/db/dao/InfoUserCode;-><init>(Landroid/content/Context;)V

    .line 3125
    const/4 v0, 0x1

    iput v0, p0, Lo/ale;->j:I

    .line 3126
    iget-object v0, p0, Lo/ale;->z:Lcom/huawei/hihealthservice/old/model/AccountInfo;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    iget-object v0, p0, Lo/ale;->z:Lcom/huawei/hihealthservice/old/model/AccountInfo;

    invoke-virtual {v0}, Lcom/huawei/hihealthservice/old/model/AccountInfo;->getUserID()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_4

    .line 3127
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: getIf1login obtainOldHuid database exists null != accountInfo && accountInfo.getUserID() > 0 accountInfo huid is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/ale;->z:Lcom/huawei/hihealthservice/old/model/AccountInfo;

    invoke-virtual {v2}, Lcom/huawei/hihealthservice/old/model/AccountInfo;->getUserID()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3128
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: getIf1login accountInfo huid = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/ale;->z:Lcom/huawei/hihealthservice/old/model/AccountInfo;

    invoke-virtual {v2}, Lcom/huawei/hihealthservice/old/model/AccountInfo;->getUserID()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " st = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/ale;->z:Lcom/huawei/hihealthservice/old/model/AccountInfo;

    invoke-virtual {v2}, Lcom/huawei/hihealthservice/old/model/AccountInfo;->getServiceToken()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, " sitid = "

    const/4 v3, 0x4

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/ale;->z:Lcom/huawei/hihealthservice/old/model/AccountInfo;

    invoke-virtual {v2}, Lcom/huawei/hihealthservice/old/model/AccountInfo;->getSiteId()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3129
    const-string v0, "com.huawei.health"

    iget-object v1, p0, Lo/ale;->z:Lcom/huawei/hihealthservice/old/model/AccountInfo;

    invoke-virtual {v1}, Lcom/huawei/hihealthservice/old/model/AccountInfo;->getUserID()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 3130
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: getIf1login obtainOldHuid database exists null != accountInfo 1111"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3131
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/ale;->h:Z

    .line 3133
    :cond_2
    invoke-virtual {v7}, Lcom/huawei/hihealthservice/old/db/dao/InfoUserCode;->getLoginedAllHuid()Ljava/util/List;

    move-result-object v8

    .line 3134
    if-eqz v8, :cond_3

    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_3

    .line 3135
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: getIf1login database exists, alluser.size() > 1"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3136
    const/4 v0, 0x1

    iput v0, p0, Lo/ale;->q:I

    goto :goto_1

    .line 3138
    :cond_3
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: getIf1login database exists, alluser.size() == 1, alluser == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3139
    const/4 v0, 0x1

    iput v0, p0, Lo/ale;->s:I

    .line 3140
    iget-object v0, p0, Lo/ale;->z:Lcom/huawei/hihealthservice/old/model/AccountInfo;

    invoke-virtual {v0}, Lcom/huawei/hihealthservice/old/model/AccountInfo;->getUserID()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/ale;->n:Ljava/lang/String;

    .line 3142
    :goto_1
    const/4 v0, 0x1

    return v0

    .line 3144
    :cond_4
    invoke-virtual {v7}, Lcom/huawei/hihealthservice/old/db/dao/InfoUserCode;->getLastHuid()J

    move-result-wide v8

    .line 3145
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: getIf1login obtainOldHuid database exists null == accountInfo or accountInfo.getUserID() <= 0 huid is : "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3146
    const-wide/16 v0, 0x0

    cmp-long v0, v8, v0

    if-lez v0, :cond_5

    .line 3147
    const/4 v0, 0x1

    iput v0, p0, Lo/ale;->s:I

    .line 3148
    invoke-static {v8, v9}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/ale;->n:Ljava/lang/String;

    .line 3149
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: getIf1login oldhuidhistory = 1;"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_2

    .line 3151
    :cond_5
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: getIf1login oldhuidhistory = 0;"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3153
    :goto_2
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ale;->z:Lcom/huawei/hihealthservice/old/model/AccountInfo;

    .line 3157
    :cond_6
    const-string v0, "TimeEat_MainInteractors"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Leave getIf1login with accountType = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lo/ale;->j:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dbf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 3158
    const/4 v0, 0x0

    return v0

    :array_0
    .array-data 1
        0x0t
    .end array-data
.end method

.method static synthetic i(Lo/ale;I)I
    .locals 0

    .line 170
    iput p1, p0, Lo/ale;->M:I

    return p1
.end method

.method static synthetic i(Lo/ale;)V
    .locals 0

    .line 170
    invoke-direct {p0}, Lo/ale;->aa()V

    return-void
.end method

.method private i(Z)V
    .locals 5

    .line 3506
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "startUserSelectForResult.needShowAgain = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3507
    if-eqz p1, :cond_0

    .line 3508
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    const-string v1, "1"

    invoke-static {v0, v1}, Lo/abi;->a(Landroid/content/Context;Ljava/lang/String;)V

    .line 3509
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lo/ale;->m(I)V

    .line 3511
    :cond_0
    new-instance v4, Landroid/content/Intent;

    iget-object v0, p0, Lo/ale;->l:Landroid/app/Activity;

    const-class v1, Lcom/huawei/health/ServiceAreaAlertActivity;

    invoke-direct {v4, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 3512
    iget-object v0, p0, Lo/ale;->l:Landroid/app/Activity;

    const/16 v1, 0x1774

    invoke-virtual {v0, v4, v1}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 3513
    return-void
.end method

.method static synthetic j(Lo/ale;)Landroid/view/Window;
    .locals 1

    .line 170
    iget-object v0, p0, Lo/ale;->t:Landroid/view/Window;

    return-object v0
.end method

.method private k(I)V
    .locals 6

    .line 1573
    const-string v0, "TimeEat_MainInteractors"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: Enter copyData and type = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1574
    const/4 v4, 0x0

    .line 1575
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    invoke-static {v0}, Lo/dcn;->e(Landroid/content/Context;)Lo/dcn;

    move-result-object v0

    const-string v1, "is_database_update_success"

    invoke-virtual {v0, v1}, Lo/dcn;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 1576
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "accountmigrate: copyData isdatabaseupdatesuccessful == "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1577
    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    .line 1578
    iget-object v0, p0, Lo/ale;->z:Lcom/huawei/hihealthservice/old/model/AccountInfo;

    if-nez v0, :cond_0

    .line 1579
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: copyData accountInfo == null and use sp huid"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1580
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    const/16 v1, 0x271f

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "old_huid_need_to_migrate"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    goto/16 :goto_0

    .line 1583
    :cond_0
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: copyData accountInfo != null and use 1.0 account huid"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1584
    iget-object v0, p0, Lo/ale;->z:Lcom/huawei/hihealthservice/old/model/AccountInfo;

    invoke-virtual {v0}, Lcom/huawei/hihealthservice/old/model/AccountInfo;->getUserID()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v4

    goto/16 :goto_0

    .line 1586
    :cond_1
    const/4 v0, 0x2

    if-ne p1, v0, :cond_2

    .line 1587
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: copyData type == 2"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1588
    iget-object v0, p0, Lo/ale;->x:Lcom/huawei/hihealth/HiAccountInfo;

    invoke-virtual {v0}, Lcom/huawei/hihealth/HiAccountInfo;->getHuid()Ljava/lang/String;

    move-result-object v4

    goto/16 :goto_0

    .line 1589
    :cond_2
    const/4 v0, 0x3

    if-ne p1, v0, :cond_4

    .line 1590
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: copyData type == 3, need judge database whether update done"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1591
    const-string v0, "1"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 1592
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: copyData type == 3, judge database update done"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1593
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    const/16 v1, 0x271f

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "old_huid_need_to_migrate"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    goto :goto_0

    .line 1596
    :cond_3
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: copyData type == 3, judge database update not complete, next enter do again!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1597
    return-void

    .line 1599
    :cond_4
    const/4 v0, 0x4

    if-ne p1, v0, :cond_6

    .line 1600
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: copyData type == 4, last cloud timeout and exception exit"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1601
    iget-object v0, p0, Lo/ale;->C:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 1602
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: copyData sendMigrateOrigalHuid is empty"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1603
    return-void

    .line 1605
    :cond_5
    iget-object v4, p0, Lo/ale;->C:Ljava/lang/String;

    .line 1607
    :cond_6
    :goto_0
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: copyData  isdatabaseupdatesuccessful == "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v5, v1, v2

    const-string v2, "and getDatabasePath(DataBaseHelper.DATABASE_NAME).exists() is"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v2

    const-string v3, "health_cloud.db"

    invoke-virtual {v2, v3}, Landroid/content/Context;->getDatabasePath(Ljava/lang/String;)Ljava/io/File;

    move-result-object v2

    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1608
    invoke-direct {p0, v4}, Lo/ale;->d(Ljava/lang/String;)V

    .line 1609
    const-string v0, "TimeEat_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Leave copyData"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1610
    return-void
.end method

.method static synthetic k(Lo/ale;)V
    .locals 0

    .line 170
    invoke-direct {p0}, Lo/ale;->Z()V

    return-void
.end method

.method static synthetic k(Lo/ale;I)V
    .locals 0

    .line 170
    invoke-direct {p0, p1}, Lo/ale;->m(I)V

    return-void
.end method

.method private l(I)V
    .locals 4

    .line 2021
    iget-object v0, p0, Lo/ale;->f:Lcom/huawei/login/ui/login/LoginInit;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 2022
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "branchGuidUserDownLoadHMS null == mLoginManager"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2023
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    iput-object v0, p0, Lo/ale;->f:Lcom/huawei/login/ui/login/LoginInit;

    .line 2026
    :cond_0
    iget-object v0, p0, Lo/ale;->f:Lcom/huawei/login/ui/login/LoginInit;

    iget-object v1, p0, Lo/ale;->o:Landroid/content/Context;

    new-instance v2, Lo/ale$29;

    invoke-direct {v2, p0, p1}, Lo/ale$29;-><init>(Lo/ale;I)V

    invoke-virtual {v0, v1, v2}, Lcom/huawei/login/ui/login/LoginInit;->initailLogin(Landroid/content/Context;Lcom/huawei/login/ui/login/util/ILoginCallback;)V

    .line 2068
    return-void
.end method

.method static synthetic l(Lo/ale;)V
    .locals 0

    .line 170
    invoke-direct {p0}, Lo/ale;->ad()V

    return-void
.end method

.method private m(I)V
    .locals 6

    .line 3516
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    const/16 v1, 0x271f

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "key_ui_download_hms_try_count"

    .line 3518
    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lo/dcy;

    const/4 v5, 0x0

    invoke-direct {v4, v5}, Lo/dcy;-><init>(I)V

    .line 3516
    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 3520
    return-void
.end method

.method static synthetic m(Lo/ale;)V
    .locals 0

    .line 170
    invoke-direct {p0}, Lo/ale;->ab()V

    return-void
.end method

.method static synthetic n(Lo/ale;)Landroid/os/Handler;
    .locals 1

    .line 170
    iget-object v0, p0, Lo/ale;->m:Landroid/os/Handler;

    return-object v0
.end method

.method private o(I)V
    .locals 4

    .line 2004
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "branchGuidUserDownLoadHMS() type = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2005
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    invoke-static {v0}, Lo/dbf;->w(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    invoke-static {v0}, Lo/alg;->c(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2006
    :cond_0
    invoke-direct {p0, p1}, Lo/ale;->l(I)V

    goto :goto_0

    .line 2008
    :cond_1
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isChinaROM else"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2009
    iput p1, p0, Lo/ale;->P:I

    .line 2010
    invoke-direct {p0}, Lo/ale;->aK()I

    move-result v0

    iput v0, p0, Lo/ale;->M:I

    .line 2011
    iget v0, p0, Lo/ale;->M:I

    const/4 v1, 0x5

    if-lt v0, v1, :cond_2

    .line 2012
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lo/ale;->i(Z)V

    goto :goto_0

    .line 2014
    :cond_2
    iget-object v0, p0, Lo/ale;->m:Landroid/os/Handler;

    const/16 v1, 0x139c

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 2017
    :goto_0
    return-void
.end method

.method static synthetic o(Lo/ale;)V
    .locals 0

    .line 170
    invoke-direct {p0}, Lo/ale;->al()V

    return-void
.end method

.method private p(I)V
    .locals 4

    .line 2346
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: branchNoKidLogin(int type) type = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2347
    if-nez p1, :cond_0

    .line 2348
    iget-object v0, p0, Lo/ale;->m:Landroid/os/Handler;

    const/16 v1, 0xfa7

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    goto :goto_0

    .line 2350
    :cond_0
    iget-object v0, p0, Lo/ale;->m:Landroid/os/Handler;

    const/16 v1, 0xfa8

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 2352
    :goto_0
    return-void
.end method

.method static synthetic p(Lo/ale;)V
    .locals 0

    .line 170
    invoke-direct {p0}, Lo/ale;->T()V

    return-void
.end method

.method static synthetic q(Lo/ale;)I
    .locals 1

    .line 170
    iget v0, p0, Lo/ale;->A:I

    return v0
.end method

.method static synthetic r(Lo/ale;)V
    .locals 0

    .line 170
    invoke-direct {p0}, Lo/ale;->ah()V

    return-void
.end method

.method static synthetic s(Lo/ale;)V
    .locals 0

    .line 170
    invoke-direct {p0}, Lo/ale;->X()V

    return-void
.end method

.method static synthetic t(Lo/ale;)Ljava/lang/String;
    .locals 1

    .line 170
    iget-object v0, p0, Lo/ale;->C:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic u(Lo/ale;)I
    .locals 1

    .line 170
    iget v0, p0, Lo/ale;->s:I

    return v0
.end method

.method static synthetic v(Lo/ale;)Lcom/huawei/hihealthservice/old/model/AccountInfo;
    .locals 1

    .line 170
    iget-object v0, p0, Lo/ale;->z:Lcom/huawei/hihealthservice/old/model/AccountInfo;

    return-object v0
.end method

.method static synthetic w(Lo/ale;)Lcom/huawei/hihealth/HiAccountInfo;
    .locals 1

    .line 170
    iget-object v0, p0, Lo/ale;->x:Lcom/huawei/hihealth/HiAccountInfo;

    return-object v0
.end method

.method static synthetic x(Lo/ale;)I
    .locals 1

    .line 170
    iget v0, p0, Lo/ale;->q:I

    return v0
.end method

.method static synthetic y(Lo/ale;)Lcom/huawei/login/ui/login/LoginInit;
    .locals 1

    .line 170
    iget-object v0, p0, Lo/ale;->f:Lcom/huawei/login/ui/login/LoginInit;

    return-object v0
.end method

.method static synthetic z(Lo/ale;)Ljava/lang/String;
    .locals 1

    .line 170
    iget-object v0, p0, Lo/ale;->n:Ljava/lang/String;

    return-object v0
.end method


# virtual methods
.method public A()Lo/ego;
    .locals 1

    .line 2712
    iget-object v0, p0, Lo/ale;->Y:Lo/ego;

    return-object v0
.end method

.method public B()V
    .locals 5

    .line 2689
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    if-nez v0, :cond_0

    .line 2690
    return-void

    .line 2692
    :cond_0
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "registerReceiver CloseAgreeDialogsReceiver"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2695
    new-instance v4, Landroid/content/IntentFilter;

    const-string v0, "android.intent.action.CLOSE_SYSTEM_DIALOGS"

    invoke-direct {v4, v0}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 2696
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lo/ale;->G:Lo/ale$c;

    invoke-virtual {v0, v1, v4}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 2697
    return-void
.end method

.method public C()V
    .locals 4

    .line 2722
    invoke-direct {p0}, Lo/ale;->ax()V

    .line 2723
    new-instance v3, Lcom/huawei/hihealth/HiSyncOption;

    invoke-direct {v3}, Lcom/huawei/hihealth/HiSyncOption;-><init>()V

    .line 2724
    const/4 v0, 0x2

    invoke-virtual {v3, v0}, Lcom/huawei/hihealth/HiSyncOption;->setSyncModel(I)V

    .line 2725
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Lcom/huawei/hihealth/HiSyncOption;->setSyncAction(I)V

    .line 2726
    const/16 v0, 0x4e20

    invoke-virtual {v3, v0}, Lcom/huawei/hihealth/HiSyncOption;->setSyncDataType(I)V

    .line 2727
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Lcom/huawei/hihealth/HiSyncOption;->setSyncScope(I)V

    .line 2728
    const/4 v0, 0x2

    invoke-virtual {v3, v0}, Lcom/huawei/hihealth/HiSyncOption;->setSyncMethod(I)V

    .line 2729
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    invoke-static {v0}, Lo/clq;->e(Landroid/content/Context;)Lo/clq;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v3, v1}, Lo/clq;->c(Lcom/huawei/hihealth/HiSyncOption;Lo/clz;)V

    .line 2731
    new-instance v0, Lo/ego;

    iget-object v1, p0, Lo/ale;->o:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/ego;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/ale;->Y:Lo/ego;

    .line 2732
    new-instance v0, Lo/ego$a;

    iget-object v1, p0, Lo/ale;->o:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/ego$a;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/ale;->X:Lo/ego$a;

    .line 2733
    iget-object v0, p0, Lo/ale;->X:Lo/ego$a;

    iget-object v1, p0, Lo/ale;->o:Landroid/content/Context;

    const v2, 0x7f020050

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/ego$a;->d(Ljava/lang/String;)Lo/ego$a;

    move-result-object v0

    new-instance v1, Lo/ale$32;

    invoke-direct {v1, p0}, Lo/ale$32;-><init>(Lo/ale;)V

    .line 2734
    invoke-virtual {v0, v1}, Lo/ego$a;->e(Landroid/view/View$OnClickListener;)Lo/ego$a;

    .line 2745
    iget-object v0, p0, Lo/ale;->X:Lo/ego$a;

    invoke-virtual {v0}, Lo/ego$a;->d()Lo/ego;

    move-result-object v0

    iput-object v0, p0, Lo/ale;->Y:Lo/ego;

    .line 2746
    iget-object v0, p0, Lo/ale;->Y:Lo/ego;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/ego;->setCanceledOnTouchOutside(Z)V

    .line 2747
    iget-object v0, p0, Lo/ale;->Y:Lo/ego;

    invoke-virtual {v0}, Lo/ego;->show()V

    .line 2748
    return-void
.end method

.method public D()V
    .locals 4

    .line 2700
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    if-nez v0, :cond_0

    .line 2701
    return-void

    .line 2703
    :cond_0
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "unregisterReceiver CloseAgreeDialogsReceiver"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2704
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lo/ale;->G:Lo/ale$c;

    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 2705
    return-void
.end method

.method public E()V
    .locals 4

    .line 2850
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "unregisterSyncBroadcastReceiver enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2851
    iget-object v0, p0, Lo/ale;->W:Lo/ale$d;

    if-eqz v0, :cond_0

    .line 2852
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "unregisterSyncBroadcastReceiver mReceiver != null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2853
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    invoke-static {v0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v0

    iget-object v1, p0, Lo/ale;->W:Lo/ale$d;

    invoke-virtual {v0, v1}, Landroid/support/v4/content/LocalBroadcastManager;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 2855
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ale;->W:Lo/ale$d;

    .line 2857
    :cond_0
    return-void
.end method

.method public F()V
    .locals 2

    .line 2928
    const-string v0, "TimeEat_MainInteractors"

    const-string v1, "Enter pullAchievement"

    invoke-static {v0, v1}, Lo/dbf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 2930
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    invoke-static {v0}, Lo/dth;->b(Landroid/content/Context;)Lo/dth;

    move-result-object v0

    new-instance v1, Lo/cvz;

    invoke-direct {v1}, Lo/cvz;-><init>()V

    invoke-virtual {v0, v1}, Lo/dth;->setAdapter(Lo/eab;)V

    .line 2931
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    invoke-static {v0}, Lo/dth;->b(Landroid/content/Context;)Lo/dth;

    move-result-object v0

    invoke-virtual {v0}, Lo/dth;->a()V

    .line 2932
    new-instance v0, Lo/alc;

    iget-object v1, p0, Lo/ale;->o:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/alc;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/ale;->k:Lo/alc;

    .line 2933
    iget-object v0, p0, Lo/ale;->k:Lo/alc;

    invoke-virtual {v0}, Lo/alc;->b()V

    .line 2934
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    invoke-static {v0}, Lo/dth;->b(Landroid/content/Context;)Lo/dth;

    move-result-object v0

    invoke-virtual {v0}, Lo/dth;->k()V

    .line 2935
    return-void
.end method

.method public G()V
    .locals 4

    .line 2977
    iget-object v0, p0, Lo/ale;->k:Lo/alc;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 2978
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter unRegisterAchievement\uff1a"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2979
    iget-object v0, p0, Lo/ale;->k:Lo/alc;

    invoke-virtual {v0}, Lo/alc;->c()V

    .line 2981
    :cond_0
    return-void
.end method

.method public H()V
    .locals 3

    .line 2939
    const-string v0, "TimeEat_MainInteractors"

    const-string v1, "Enter pullAchievement"

    invoke-static {v0, v1}, Lo/dbf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 2941
    iget-object v0, p0, Lo/ale;->u:Ljava/util/concurrent/ExecutorService;

    if-eqz v0, :cond_0

    .line 2942
    iget-object v0, p0, Lo/ale;->u:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lo/ale$37;

    invoke-direct {v1, p0}, Lo/ale$37;-><init>(Lo/ale;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 2964
    :cond_0
    new-instance v2, Landroid/content/Intent;

    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    const-class v1, Lcom/huawei/health/receiver/HealthAchieveNotificationService;

    invoke-direct {v2, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 2965
    iget-object v0, p0, Lo/ale;->l:Landroid/app/Activity;

    invoke-virtual {v0, v2}, Landroid/app/Activity;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 2967
    const-string v0, "TimeEat_MainInteractors"

    const-string v1, "Leave pullAchievement"

    invoke-static {v0, v1}, Lo/dbf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 2969
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-nez v0, :cond_1

    .line 2970
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/ui/main/stories/nps/npsstate/NpsUserShowController;->getInstance(Landroid/content/Context;)Lcom/huawei/ui/main/stories/nps/npsstate/NpsUserShowController;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/nps/npsstate/NpsUserShowController;->threadExecuteNpsModule()V

    .line 2973
    :cond_1
    return-void
.end method

.method public I()V
    .locals 6

    .line 2815
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "cancelProgressDialog"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2816
    iget-object v0, p0, Lo/ale;->Y:Lo/ego;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 2817
    iget-object v0, p0, Lo/ale;->Y:Lo/ego;

    invoke-virtual {v0}, Lo/ego;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2818
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "dismissProgressDialog"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2820
    :try_start_0
    iget-object v0, p0, Lo/ale;->Y:Lo/ego;

    invoke-virtual {v0}, Lo/ego;->dismiss()V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2824
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ale;->Y:Lo/ego;

    .line 2825
    goto :goto_0

    .line 2821
    :catch_0
    move-exception v4

    .line 2822
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x2

    :try_start_1
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "IllegalArgumentException"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Ljava/lang/IllegalArgumentException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 2824
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ale;->Y:Lo/ego;

    .line 2825
    goto :goto_0

    .line 2824
    :catchall_0
    move-exception v5

    const/4 v0, 0x0

    iput-object v0, p0, Lo/ale;->Y:Lo/ego;

    .line 2825
    throw v5

    .line 2827
    :cond_0
    :goto_0
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "cancelProgressDialog clear dialog"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2828
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ale;->Y:Lo/ego;

    .line 2830
    :cond_1
    return-void
.end method

.method public J()V
    .locals 8

    .line 3597
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showAccountLoginAlertDialog"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3598
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    const v1, 0x7f020200

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v4

    .line 3599
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    const v1, 0x7f02025c

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v5

    .line 3601
    new-instance v7, Lo/egv$b;

    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    invoke-direct {v7, v0}, Lo/egv$b;-><init>(Landroid/content/Context;)V

    .line 3602
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    const v1, 0x7f02025b

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Lo/egv$b;->e(Ljava/lang/String;)Lo/egv$b;

    move-result-object v0

    iget-object v1, p0, Lo/ale;->o:Landroid/content/Context;

    .line 3603
    const v2, 0x7f02025d

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egv$b;->b(Ljava/lang/String;)Lo/egv$b;

    move-result-object v0

    new-instance v1, Lo/ale$46;

    invoke-direct {v1, p0}, Lo/ale$46;-><init>(Lo/ale;)V

    .line 3604
    invoke-virtual {v0, v5, v1}, Lo/egv$b;->b(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egv$b;

    move-result-object v0

    new-instance v1, Lo/ale$48;

    invoke-direct {v1, p0}, Lo/ale$48;-><init>(Lo/ale;)V

    .line 3619
    invoke-virtual {v0, v4, v1}, Lo/egv$b;->e(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egv$b;

    .line 3642
    invoke-virtual {v7}, Lo/egv$b;->b()Lo/egv;

    move-result-object v6

    .line 3643
    const/4 v0, 0x0

    invoke-virtual {v6, v0}, Lo/egv;->setCancelable(Z)V

    .line 3644
    invoke-virtual {v6}, Lo/egv;->show()V

    .line 3645
    return-void
.end method

.method public K()V
    .locals 1

    .line 2984
    invoke-direct {p0}, Lo/ale;->aL()V

    .line 2985
    invoke-direct {p0}, Lo/ale;->aA()V

    .line 2986
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    invoke-static {v0}, Lo/dlf;->d(Landroid/content/Context;)Lo/dlf;

    move-result-object v0

    invoke-virtual {v0}, Lo/dlf;->e()V

    .line 2987
    invoke-static {}, Lo/cwe;->d()V

    .line 2988
    invoke-virtual {p0}, Lo/ale;->P()V

    .line 2989
    invoke-virtual {p0}, Lo/ale;->n()V

    .line 2991
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ale;->t:Landroid/view/Window;

    .line 2992
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ale;->G:Lo/ale$c;

    .line 2993
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ale;->U:Landroid/content/BroadcastReceiver;

    .line 2994
    return-void
.end method

.method public L()V
    .locals 16

    .line 3195
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MainActivit_showGenderDialog"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3196
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/ale;->F:Lcom/huawei/hwid/core/datatype/UserInfo;

    if-nez v0, :cond_0

    .line 3197
    return-void

    .line 3199
    :cond_0
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/ale;->o:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "hw_health_gender_value"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 3201
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/ale;->F:Lcom/huawei/hwid/core/datatype/UserInfo;

    invoke-virtual {v0}, Lcom/huawei/hwid/core/datatype/UserInfo;->getGender()Ljava/lang/String;

    move-result-object v6

    .line 3202
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MainActivit_showGenderDialog_showgender"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v5, v1, v2

    const-string v2, "+ newGenderValue = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aput-object v6, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3204
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/ale;->o:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "hw_health_huid_value"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 3206
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/ale;->o:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/LoginInit;->getUsetId()Ljava/lang/String;

    move-result-object v8

    .line 3208
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 3209
    :cond_1
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "genderValue is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3210
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/ale;->o:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "hw_health_gender_value"

    new-instance v3, Lo/dcy;

    const/4 v4, 0x1

    invoke-direct {v3, v4}, Lo/dcy;-><init>(I)V

    invoke-static {v0, v1, v2, v6, v3}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 3212
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/ale;->o:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "hw_health_huid_value"

    new-instance v3, Lo/dcy;

    const/4 v4, 0x1

    invoke-direct {v3, v4}, Lo/dcy;-><init>(I)V

    invoke-static {v0, v1, v2, v8, v3}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 3214
    return-void

    .line 3217
    :cond_2
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_4

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 3218
    move-object v9, v6

    const/4 v10, -0x1

    invoke-virtual {v9}, Ljava/lang/String;->hashCode()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    const-string v0, "2"

    invoke-virtual {v9, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    const/4 v10, 0x0

    goto :goto_0

    :pswitch_1
    const-string v0, "0"

    invoke-virtual {v9, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    const/4 v10, 0x1

    goto :goto_0

    :pswitch_2
    const-string v0, "1"

    invoke-virtual {v9, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    const/4 v10, 0x2

    :cond_3
    :goto_0
    packed-switch v10, :pswitch_data_1

    goto/16 :goto_1

    .line 3220
    :pswitch_3
    new-instance v11, Landroid/text/SpannableString;

    move-object/from16 v0, p0

    iget-object v0, v0, Lo/ale;->o:Landroid/content/Context;

    const v1, 0x7f0200fa

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/ale;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v11, v0}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 3221
    move-object/from16 v0, p0

    invoke-direct {v0, v11}, Lo/ale;->b(Landroid/text/SpannableString;)V

    .line 3222
    goto :goto_1

    .line 3224
    :pswitch_4
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/ale;->o:Landroid/content/Context;

    const v1, 0x7f020651

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v12

    .line 3225
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/ale;->o:Landroid/content/Context;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v12, v1, v2

    const v2, 0x7f020650

    invoke-virtual {v0, v2, v1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v13

    .line 3226
    move-object/from16 v0, p0

    invoke-direct {v0, v13, v12}, Lo/ale;->b(Ljava/lang/String;Ljava/lang/String;)Landroid/text/SpannableString;

    move-result-object v0

    move-object/from16 v1, p0

    invoke-direct {v1, v0}, Lo/ale;->b(Landroid/text/SpannableString;)V

    .line 3227
    goto :goto_1

    .line 3229
    :pswitch_5
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/ale;->o:Landroid/content/Context;

    const v1, 0x7f020652

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v14

    .line 3230
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/ale;->o:Landroid/content/Context;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v14, v1, v2

    const v2, 0x7f020650

    invoke-virtual {v0, v2, v1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v15

    .line 3231
    move-object/from16 v0, p0

    invoke-direct {v0, v15, v14}, Lo/ale;->b(Ljava/lang/String;Ljava/lang/String;)Landroid/text/SpannableString;

    move-result-object v0

    move-object/from16 v1, p0

    invoke-direct {v1, v0}, Lo/ale;->b(Landroid/text/SpannableString;)V

    .line 3232
    .line 3236
    :goto_1
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/ale;->o:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "hw_health_gender_value"

    new-instance v3, Lo/dcy;

    const/4 v4, 0x1

    invoke-direct {v3, v4}, Lo/dcy;-><init>(I)V

    invoke-static {v0, v1, v2, v6, v3}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 3239
    :cond_4
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x30
        :pswitch_1
        :pswitch_2
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_3
        :pswitch_4
        :pswitch_5
    .end packed-switch
.end method

.method public M()V
    .locals 4

    .line 3454
    iget-boolean v0, p0, Lo/ale;->E:Z

    if-eqz v0, :cond_1

    .line 3455
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "loginAfterUpdateHMS(),hwid_is_low_version :"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-boolean v2, p0, Lo/ale;->E:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ",timeCount = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget v2, p0, Lo/ale;->H:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3456
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/ale;->E:Z

    .line 3457
    iget v0, p0, Lo/ale;->H:I

    const/4 v1, 0x2

    if-ge v0, v1, :cond_0

    .line 3458
    invoke-virtual {p0}, Lo/ale;->r()V

    goto :goto_0

    .line 3460
    :cond_0
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "cancel update hms..."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3461
    const/4 v0, 0x0

    iput v0, p0, Lo/ale;->H:I

    .line 3462
    invoke-static {}, Lo/ale;->h()V

    .line 3465
    :cond_1
    :goto_0
    return-void
.end method

.method public N()V
    .locals 6

    .line 3311
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showAlertDialog"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3312
    const/4 v4, 0x0

    .line 3313
    const/4 v5, 0x0

    .line 3314
    iget-object v0, p0, Lo/ale;->l:Landroid/app/Activity;

    invoke-direct {p0, v0}, Lo/ale;->e(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3315
    iget-object v0, p0, Lo/ale;->l:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f020644

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 3316
    iget-object v0, p0, Lo/ale;->l:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f020646

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v5

    goto :goto_0

    .line 3318
    :cond_0
    iget-object v0, p0, Lo/ale;->l:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f02023a

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 3319
    iget-object v0, p0, Lo/ale;->l:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f020645

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v5

    .line 3322
    :goto_0
    iget-object v0, p0, Lo/ale;->l:Landroid/app/Activity;

    new-instance v1, Lo/ale$45;

    invoke-direct {v1, p0}, Lo/ale$45;-><init>(Lo/ale;)V

    invoke-direct {p0, v0, v4, v5, v1}, Lo/ale;->d(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 3338
    return-void
.end method

.method public O()V
    .locals 2

    .line 3813
    const-string v0, "TimeEat_MainInteractors"

    const-string v1, "Enter initStartComplete"

    invoke-static {v0, v1}, Lo/dbf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 3814
    invoke-static {}, Lo/dec;->e()V

    .line 3815
    const-string v0, "TimeEat_MainInteractors"

    const-string v1, "Leave initStartComplete"

    invoke-static {v0, v1}, Lo/dbf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 3816
    return-void
.end method

.method public P()V
    .locals 5

    .line 3651
    new-instance v4, Lo/dcy;

    const/4 v0, 0x0

    invoke-direct {v4, v0}, Lo/dcy;-><init>(I)V

    .line 3652
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    .line 3653
    const/16 v1, 0x271f

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "key_ui_login_exit_hms_apk"

    const-string v3, ""

    .line 3652
    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 3654
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "set KEY_UI_LOGIN_EXIT_HMS_APK null."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3655
    return-void
.end method

.method public R()V
    .locals 5

    .line 3681
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showCancelHmsPushUpdateHMSApkAlert enter:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3682
    invoke-direct {p0}, Lo/ale;->aJ()V

    .line 3683
    new-instance v4, Lo/egv$b;

    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    invoke-direct {v4, v0}, Lo/egv$b;-><init>(Landroid/content/Context;)V

    .line 3684
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    const v1, 0x7f0200d0

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lo/egv$b;->e(Ljava/lang/String;)Lo/egv$b;

    move-result-object v0

    iget-object v1, p0, Lo/ale;->o:Landroid/content/Context;

    .line 3685
    const v2, 0x7f0200e2

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egv$b;->b(Ljava/lang/String;)Lo/egv$b;

    move-result-object v0

    iget-object v1, p0, Lo/ale;->o:Landroid/content/Context;

    .line 3686
    const v2, 0x7f0200e3

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lo/ale$51;

    invoke-direct {v2, p0}, Lo/ale$51;-><init>(Lo/ale;)V

    invoke-virtual {v0, v1, v2}, Lo/egv$b;->b(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egv$b;

    move-result-object v0

    iget-object v1, p0, Lo/ale;->o:Landroid/content/Context;

    .line 3693
    const v2, 0x7f0202c1

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lo/ale$52;

    invoke-direct {v2, p0}, Lo/ale$52;-><init>(Lo/ale;)V

    invoke-virtual {v0, v1, v2}, Lo/egv$b;->e(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egv$b;

    .line 3699
    invoke-virtual {v4}, Lo/egv$b;->b()Lo/egv;

    move-result-object v0

    iput-object v0, p0, Lo/ale;->J:Lo/egv;

    .line 3700
    iget-object v0, p0, Lo/ale;->J:Lo/egv;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egv;->setCancelable(Z)V

    .line 3701
    iget-object v0, p0, Lo/ale;->J:Lo/egv;

    invoke-virtual {v0}, Lo/egv;->show()V

    .line 3702
    return-void
.end method

.method public S()V
    .locals 2

    .line 3720
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_1

    .line 3721
    iget-object v0, p0, Lo/ale;->N:Ljava/util/concurrent/ExecutorService;

    if-nez v0, :cond_0

    .line 3722
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lo/ale;->N:Ljava/util/concurrent/ExecutorService;

    .line 3724
    :cond_0
    iget-object v0, p0, Lo/ale;->N:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lo/ale$54;

    invoke-direct {v1, p0}, Lo/ale$54;-><init>(Lo/ale;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 3803
    :cond_1
    return-void
.end method

.method public a()V
    .locals 1

    .line 403
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/ale;->a(Z)V

    .line 404
    return-void
.end method

.method public a(I)V
    .locals 11

    .line 1392
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: showDataMigrateTipsDialog(final int type) type = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1393
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: showDataMigrateTipsDialog isPackgeNameHuid = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-boolean v2, p0, Lo/ale;->h:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1394
    iget-boolean v0, p0, Lo/ale;->h:Z

    if-eqz v0, :cond_2

    .line 1395
    iget-object v0, p0, Lo/ale;->u:Ljava/util/concurrent/ExecutorService;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lo/ale;->u:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->isShutdown()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1396
    :cond_0
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: showDataMigrateTipsDialog mExecutorService is null or shutdown"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1397
    return-void

    .line 1399
    :cond_1
    iget-object v0, p0, Lo/ale;->u:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lo/ale$20;

    invoke-direct {v1, p0, p1}, Lo/ale$20;-><init>(Lo/ale;I)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 1413
    return-void

    .line 1416
    :cond_2
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    const v1, 0x7f020075

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v4

    .line 1418
    new-instance v6, Lo/egv$b;

    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    invoke-direct {v6, v0}, Lo/egv$b;-><init>(Landroid/content/Context;)V

    .line 1419
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    const v1, 0x7f0200d0

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lo/egv$b;->e(Ljava/lang/String;)Lo/egv$b;

    .line 1420
    if-nez p1, :cond_3

    .line 1421
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    const v1, 0x7f0200dd

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v7

    .line 1422
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    const v1, 0x7f020262

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v8

    .line 1423
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/16 v2, 0x18

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const v2, 0x7f030018

    const/16 v3, 0x18

    invoke-virtual {v0, v2, v3, v1}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    .line 1424
    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/Object;

    iget-object v1, p0, Lo/ale;->o:Landroid/content/Context;

    const/high16 v2, 0x7f020000

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const/4 v1, 0x1

    aput-object v8, v0, v1

    const/4 v1, 0x2

    aput-object v9, v0, v1

    invoke-static {v7, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v10

    .line 1425
    invoke-virtual {v6, v10}, Lo/egv$b;->b(Ljava/lang/String;)Lo/egv$b;

    .line 1426
    goto :goto_0

    :cond_3
    const/4 v0, 0x1

    if-ne p1, v0, :cond_4

    .line 1427
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    const v1, 0x7f0200dc

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v7

    .line 1428
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    const/high16 v1, 0x7f020000

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v8

    .line 1429
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/16 v2, 0x18

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const v2, 0x7f030018

    const/16 v3, 0x18

    invoke-virtual {v0, v2, v3, v1}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    .line 1430
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object v8, v0, v1

    const/4 v1, 0x1

    aput-object v9, v0, v1

    invoke-static {v7, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v10

    .line 1431
    invoke-virtual {v6, v10}, Lo/egv$b;->b(Ljava/lang/String;)Lo/egv$b;

    .line 1433
    :cond_4
    :goto_0
    new-instance v0, Lo/ale$19;

    invoke-direct {v0, p0, p1}, Lo/ale$19;-><init>(Lo/ale;I)V

    invoke-virtual {v6, v4, v0}, Lo/egv$b;->b(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egv$b;

    move-result-object v0

    iget-object v1, p0, Lo/ale;->o:Landroid/content/Context;

    .line 1457
    const v2, 0x7f02007c

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lo/ale$18;

    invoke-direct {v2, p0}, Lo/ale$18;-><init>(Lo/ale;)V

    invoke-virtual {v0, v1, v2}, Lo/egv$b;->e(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egv$b;

    .line 1463
    invoke-virtual {v6}, Lo/egv$b;->b()Lo/egv;

    move-result-object v5

    .line 1464
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Lo/egv;->setCancelable(Z)V

    .line 1465
    invoke-virtual {v5}, Lo/egv;->show()V

    .line 1466
    return-void
.end method

.method public a(J)V
    .locals 3

    .line 3713
    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    .line 3714
    const-string v0, "duration"

    invoke-static {p1, p2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 3715
    const-string v0, "status"

    const-string v1, "0"

    invoke-virtual {v2, v0, v1}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 3716
    invoke-static {}, Lcom/huawei/operation/OpAnalyticsUtil;->getInstance()Lcom/huawei/operation/OpAnalyticsUtil;

    move-result-object v0

    sget-object v1, Lcom/huawei/operation/OperationKey;->HEALTH_APP_BOOTING_90010001:Lcom/huawei/operation/OperationKey;

    invoke-virtual {v1}, Lcom/huawei/operation/OperationKey;->value()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, v2}, Lcom/huawei/operation/OpAnalyticsUtil;->setEvent2nd(Ljava/lang/String;Ljava/util/LinkedHashMap;)I

    .line 3717
    return-void
.end method

.method public a(Landroid/content/Context;)V
    .locals 5

    .line 304
    new-instance v4, Lo/dcy;

    invoke-direct {v4}, Lo/dcy;-><init>()V

    .line 306
    const/4 v0, 0x0

    invoke-static {v0}, Lo/dgk;->b(Z)V

    .line 307
    invoke-static {p1}, Lo/dcn;->e(Landroid/content/Context;)Lo/dcn;

    move-result-object v0

    const-string v1, "key_user_experience_plan_check_box"

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Lo/dcn;->e(Ljava/lang/String;Ljava/lang/String;Lo/dcx;)V

    .line 309
    invoke-static {p1}, Lo/dcn;->e(Landroid/content/Context;)Lo/dcn;

    move-result-object v0

    const-string v1, "key_wether_to_auth"

    const/4 v2, 0x1

    invoke-static {v2}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Lo/dcn;->e(Ljava/lang/String;Ljava/lang/String;Lo/dcx;)V

    .line 310
    const/16 v0, 0x2710

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "key_wether_to_auth"

    .line 311
    const/4 v2, 0x1

    invoke-static {v2}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lo/dcy;

    invoke-direct {v3}, Lo/dcy;-><init>()V

    .line 310
    invoke-static {p1, v0, v1, v2, v3}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 313
    invoke-direct {p0}, Lo/ale;->Q()V

    .line 314
    const/16 v0, 0x2710

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "hw_health_show_update_ove_terms"

    const-string v2, "1"

    invoke-static {p1, v0, v1, v2, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 316
    invoke-virtual {p0}, Lo/ale;->e()V

    .line 317
    invoke-direct {p0}, Lo/ale;->V()V

    .line 318
    return-void
.end method

.method public a(Lcom/huawei/common/GuardianAccount;)V
    .locals 5

    .line 3468
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/ale;->l:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lo/ale;->l:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->isDestroyed()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 3469
    :cond_0
    return-void

    .line 3471
    :cond_1
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    const v1, 0x7f0702f6

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v3

    .line 3472
    new-instance v0, Lo/egw$c;

    iget-object v1, p0, Lo/ale;->o:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/egw$c;-><init>(Landroid/content/Context;)V

    iget-object v1, p0, Lo/ale;->o:Landroid/content/Context;

    .line 3473
    const v2, 0x7f0204f4

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egw$c;->a(Ljava/lang/String;)Lo/egw$c;

    move-result-object v0

    .line 3474
    invoke-virtual {v0, v3}, Lo/egw$c;->e(Landroid/view/View;)Lo/egw$c;

    move-result-object v0

    iget-object v1, p0, Lo/ale;->o:Landroid/content/Context;

    .line 3475
    const v2, 0x7f020005

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lo/ale$50;

    invoke-direct {v2, p0}, Lo/ale$50;-><init>(Lo/ale;)V

    invoke-virtual {v0, v1, v2}, Lo/egw$c;->c(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egw$c;

    move-result-object v0

    iget-object v1, p0, Lo/ale;->o:Landroid/content/Context;

    .line 3482
    const v2, 0x7f0207e3

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lo/ale$49;

    invoke-direct {v2, p0, p1}, Lo/ale$49;-><init>(Lo/ale;Lcom/huawei/common/GuardianAccount;)V

    invoke-virtual {v0, v1, v2}, Lo/egw$c;->a(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egw$c;

    move-result-object v0

    .line 3500
    invoke-virtual {v0}, Lo/egw$c;->e()Lo/egw;

    move-result-object v4

    .line 3501
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Lo/egw;->setCancelable(Z)V

    .line 3502
    invoke-virtual {v4}, Lo/egw;->show()V

    .line 3503
    return-void
.end method

.method public a(Z)V
    .locals 10

    .line 324
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    if-nez v0, :cond_0

    .line 325
    return-void

    .line 327
    :cond_0
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    const v1, 0x7f0703dd

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v4

    .line 328
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    invoke-static {v0, v4}, Lo/fjg;->d(Landroid/content/Context;Landroid/view/View;)V

    .line 329
    const v0, 0x7f1218dc

    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/widget/LinearLayout;

    .line 331
    const/16 v0, 0x8

    invoke-virtual {v5, v0}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 333
    const v0, 0x7f1218dd

    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Landroid/widget/CheckBox;

    .line 334
    invoke-static {}, Lo/dgk;->d()Z

    move-result v0

    invoke-virtual {v6, v0}, Landroid/widget/CheckBox;->setChecked(Z)V

    .line 335
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    invoke-static {v0}, Lo/dcn;->e(Landroid/content/Context;)Lo/dcn;

    move-result-object v0

    const-string v1, "key_user_experience_plan_check_box"

    const/4 v2, 0x1

    invoke-static {v2}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Lo/dcn;->e(Ljava/lang/String;Ljava/lang/String;Lo/dcx;)V

    .line 336
    new-instance v0, Lo/ale$1;

    invoke-direct {v0, p0}, Lo/ale$1;-><init>(Lo/ale;)V

    invoke-virtual {v6, v0}, Landroid/widget/CheckBox;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 342
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    invoke-direct {p0, v0, v4}, Lo/ale;->c(Landroid/content/Context;Landroid/view/View;)V

    .line 343
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    const v1, 0x7f020004

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v7

    .line 344
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    const v1, 0x7f020216

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v8

    .line 346
    new-instance v0, Lo/egw$c;

    iget-object v1, p0, Lo/ale;->o:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/egw$c;-><init>(Landroid/content/Context;)V

    .line 347
    invoke-virtual {v0, v8}, Lo/egw$c;->a(Ljava/lang/String;)Lo/egw$c;

    move-result-object v0

    .line 348
    const/16 v1, 0x18

    const/4 v2, 0x0

    invoke-virtual {v0, v4, v1, v2}, Lo/egw$c;->b(Landroid/view/View;II)Lo/egw$c;

    move-result-object v0

    iget-object v1, p0, Lo/ale;->o:Landroid/content/Context;

    .line 349
    const v2, 0x7f020005

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lo/ale$21;

    invoke-direct {v2, p0}, Lo/ale$21;-><init>(Lo/ale;)V

    invoke-virtual {v0, v1, v2}, Lo/egw$c;->c(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egw$c;

    move-result-object v0

    new-instance v1, Lo/ale$14;

    invoke-direct {v1, p0, p1}, Lo/ale$14;-><init>(Lo/ale;Z)V

    .line 361
    invoke-virtual {v0, v7, v1}, Lo/egw$c;->a(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egw$c;

    move-result-object v0

    .line 394
    invoke-virtual {v0}, Lo/egw$c;->e()Lo/egw;

    move-result-object v9

    .line 395
    invoke-virtual {v9}, Lo/egw;->getWindow()Landroid/view/Window;

    move-result-object v0

    iput-object v0, p0, Lo/ale;->t:Landroid/view/Window;

    .line 396
    const/4 v0, 0x0

    invoke-virtual {v9, v0}, Lo/egw;->setCancelable(Z)V

    .line 397
    iget-object v0, p0, Lo/ale;->l:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lo/ale;->l:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->isDestroyed()Z

    move-result v0

    if-nez v0, :cond_1

    .line 398
    invoke-virtual {v9}, Lo/egw;->show()V

    .line 400
    :cond_1
    return-void
.end method

.method public b(I)V
    .locals 5

    .line 986
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: showDataMigrateDialogHaveDownHMS enter type = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 988
    new-instance v4, Lo/egv$b;

    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    invoke-direct {v4, v0}, Lo/egv$b;-><init>(Landroid/content/Context;)V

    .line 989
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    const v1, 0x7f0200d0

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lo/egv$b;->e(Ljava/lang/String;)Lo/egv$b;

    move-result-object v0

    iget-object v1, p0, Lo/ale;->o:Landroid/content/Context;

    .line 990
    const v2, 0x7f0200e2

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egv$b;->b(Ljava/lang/String;)Lo/egv$b;

    move-result-object v0

    iget-object v1, p0, Lo/ale;->o:Landroid/content/Context;

    .line 991
    const v2, 0x7f0200e3

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lo/ale$9;

    invoke-direct {v2, p0, p1}, Lo/ale$9;-><init>(Lo/ale;I)V

    invoke-virtual {v0, v1, v2}, Lo/egv$b;->b(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egv$b;

    move-result-object v0

    iget-object v1, p0, Lo/ale;->o:Landroid/content/Context;

    .line 1011
    const v2, 0x7f0202c1

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lo/ale$10;

    invoke-direct {v2, p0}, Lo/ale$10;-><init>(Lo/ale;)V

    invoke-virtual {v0, v1, v2}, Lo/egv$b;->e(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egv$b;

    .line 1019
    invoke-virtual {v4}, Lo/egv$b;->b()Lo/egv;

    move-result-object v0

    iput-object v0, p0, Lo/ale;->L:Lo/egv;

    .line 1020
    iget-object v0, p0, Lo/ale;->L:Lo/egv;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egv;->setCancelable(Z)V

    .line 1021
    iget-object v0, p0, Lo/ale;->L:Lo/egv;

    invoke-virtual {v0}, Lo/egv;->show()V

    .line 1022
    return-void
.end method

.method public b(I[Ljava/lang/String;[I)V
    .locals 7

    .line 522
    if-eqz p2, :cond_6

    if-eqz p3, :cond_6

    .line 523
    invoke-static {}, Lo/dbn;->c()Lo/dbn;

    move-result-object v0

    invoke-virtual {v0, p2, p3}, Lo/dbn;->c([Ljava/lang/String;[I)V

    .line 524
    const/4 v0, 0x1

    if-ne p1, v0, :cond_5

    .line 525
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getpermission onRequestPermissionsResult back"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 526
    const/4 v4, 0x0

    :goto_0
    array-length v0, p2

    if-ge v4, v0, :cond_3

    .line 527
    aget-object v0, p2, v4

    const-string v1, "android.permission.READ_PHONE_STATE"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    aget v0, p3, v4

    if-eqz v0, :cond_2

    .line 528
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "telephone permision reject"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 529
    iget-object v0, p0, Lo/ale;->l:Landroid/app/Activity;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lo/ale;->l:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lo/ale;->l:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->isDestroyed()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 530
    :cond_0
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mainActivityContext finish"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 531
    goto/16 :goto_2

    .line 534
    :cond_1
    new-instance v6, Lo/egv$b;

    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    invoke-direct {v6, v0}, Lo/egv$b;-><init>(Landroid/content/Context;)V

    .line 535
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    const v1, 0x7f02064f

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lo/egv$b;->e(Ljava/lang/String;)Lo/egv$b;

    move-result-object v0

    iget-object v1, p0, Lo/ale;->o:Landroid/content/Context;

    .line 536
    const v2, 0x7f0200a3

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egv$b;->b(Ljava/lang/String;)Lo/egv$b;

    move-result-object v0

    iget-object v1, p0, Lo/ale;->o:Landroid/content/Context;

    .line 537
    const v2, 0x7f02029e

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lo/ale$41;

    invoke-direct {v2, p0}, Lo/ale$41;-><init>(Lo/ale;)V

    invoke-virtual {v0, v1, v2}, Lo/egv$b;->b(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egv$b;

    move-result-object v0

    iget-object v1, p0, Lo/ale;->o:Landroid/content/Context;

    .line 552
    const v2, 0x7f02007c

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lo/ale$34;

    invoke-direct {v2, p0}, Lo/ale$34;-><init>(Lo/ale;)V

    invoke-virtual {v0, v1, v2}, Lo/egv$b;->e(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egv$b;

    .line 558
    invoke-virtual {v6}, Lo/egv$b;->b()Lo/egv;

    move-result-object v5

    .line 559
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Lo/egv;->setCanceledOnTouchOutside(Z)V

    .line 560
    invoke-virtual {v5}, Lo/egv;->show()V

    .line 562
    goto :goto_1

    .line 563
    :cond_2
    invoke-virtual {p0}, Lo/ale;->t()V

    .line 564
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getpermission onRequestPermissionsResult back not eject commonTextAlertDialog"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 526
    :goto_1
    add-int/lit8 v4, v4, 0x1

    goto/16 :goto_0

    .line 567
    :cond_3
    :goto_2
    array-length v0, p3

    if-lez v0, :cond_4

    const/4 v0, 0x0

    aget v0, p3, v0

    if-nez v0, :cond_4

    .line 568
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getpermission onRequestPermissionsResult granted"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 569
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    invoke-static {v0}, Lo/dbf;->q(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 570
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HaveNoPermission MainInteractors_autoCheckAppNewVersionService_isForeground_stop22"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 571
    invoke-direct {p0}, Lo/ale;->ay()V

    .line 572
    invoke-direct {p0}, Lo/ale;->aQ()V

    goto :goto_3

    .line 575
    :cond_4
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getpermission onRequestPermissionsResult rejected"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_3

    .line 578
    :cond_5
    invoke-virtual {p0}, Lo/ale;->t()V

    .line 579
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getpermission onRequestPermissionsResult requestCode != 1"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 583
    :cond_6
    :goto_3
    return-void
.end method

.method public b(Landroid/content/Intent;)V
    .locals 10

    .line 2751
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initCommonDialog enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2752
    iget-object v0, p0, Lo/ale;->Y:Lo/ego;

    if-eqz v0, :cond_4

    .line 2753
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initCommonDialog mCustomProgressDialog !=null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2754
    const-string v0, "com.huawei.hihealth.action_sync_status"

    const/4 v1, 0x6

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v7

    .line 2756
    const/4 v0, 0x2

    if-ne v0, v7, :cond_0

    .line 2757
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initCommonDialog HiBroadcastAction.SyncStatusAction.DONE"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2758
    iget-object v0, p0, Lo/ale;->m:Landroid/os/Handler;

    const/16 v1, 0x1900

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 2759
    invoke-virtual {p0}, Lo/ale;->I()V

    .line 2760
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    iget-object v1, p0, Lo/ale;->o:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0200a8

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 2761
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    invoke-static {v0}, Lo/dth;->b(Landroid/content/Context;)Lo/dth;

    move-result-object v0

    invoke-virtual {v0}, Lo/dth;->i()V

    .line 2762
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    invoke-static {v0}, Lo/dxb;->a(Landroid/content/Context;)Lo/dxb;

    move-result-object v0

    .line 2763
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    const/4 v3, -0x4

    const/4 v4, 0x1

    invoke-static {v3, v1, v2, v4}, Lo/dzk;->c(IJI)J

    move-result-wide v1

    .line 2764
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    .line 2762
    const/16 v5, 0xb

    const/4 v6, 0x0

    invoke-virtual/range {v0 .. v6}, Lo/dxb;->b(JJILo/duh;)V

    goto/16 :goto_0

    .line 2766
    :cond_0
    const/4 v0, 0x3

    if-ne v0, v7, :cond_1

    .line 2767
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initCommonDialog HiBroadcastAction.SyncStatusAction.FAIL"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2768
    invoke-virtual {p0}, Lo/ale;->I()V

    .line 2770
    new-instance v9, Lo/egv$b;

    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    invoke-direct {v9, v0}, Lo/egv$b;-><init>(Landroid/content/Context;)V

    .line 2771
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f02007a

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Lo/egv$b;->e(Ljava/lang/String;)Lo/egv$b;

    move-result-object v0

    iget-object v1, p0, Lo/ale;->o:Landroid/content/Context;

    .line 2772
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0200bb

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egv$b;->b(Ljava/lang/String;)Lo/egv$b;

    move-result-object v0

    new-instance v1, Lo/ale$39;

    invoke-direct {v1, p0}, Lo/ale$39;-><init>(Lo/ale;)V

    .line 2773
    const v2, 0x7f020075

    invoke-virtual {v0, v2, v1}, Lo/egv$b;->e(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    move-result-object v0

    new-instance v1, Lo/ale$38;

    invoke-direct {v1, p0}, Lo/ale$38;-><init>(Lo/ale;)V

    .line 2779
    const v2, 0x7f020074

    invoke-virtual {v0, v2, v1}, Lo/egv$b;->b(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    .line 2784
    invoke-virtual {v9}, Lo/egv$b;->b()Lo/egv;

    move-result-object v8

    .line 2785
    invoke-virtual {v8}, Lo/egv;->show()V

    .line 2786
    goto :goto_0

    :cond_1
    const/4 v0, 0x1

    if-ne v0, v7, :cond_2

    .line 2787
    const-string v0, "com.huawei.hihealth.action_sync_process"

    const-wide/16 v1, 0x0

    invoke-virtual {p1, v0, v1, v2}, Landroid/content/Intent;->getDoubleExtra(Ljava/lang/String;D)D

    move-result-wide v8

    .line 2788
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initCommonDialog HiBroadcastAction.SyncStatusAction.ONGOING process = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v8, v9}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2789
    iget-object v0, p0, Lo/ale;->X:Lo/ego$a;

    double-to-int v1, v8

    invoke-virtual {v0, v1}, Lo/ego$a;->a(I)Lo/ego$a;

    .line 2790
    iget-object v0, p0, Lo/ale;->X:Lo/ego$a;

    double-to-int v1, v8

    invoke-virtual {v0, v1}, Lo/ego$a;->b(I)Lo/ego$a;

    .line 2791
    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    if-ne v0, v7, :cond_3

    .line 2792
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initCommonDialog HiBroadcastAction.SyncStatusAction.BEGIN"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2793
    iget-object v0, p0, Lo/ale;->X:Lo/ego$a;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/ego$a;->a(I)Lo/ego$a;

    .line 2794
    iget-object v0, p0, Lo/ale;->X:Lo/ego$a;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/ego$a;->b(I)Lo/ego$a;

    .line 2796
    :cond_3
    :goto_0
    goto/16 :goto_1

    .line 2797
    :cond_4
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initCommonDialog mCustomProgressDialog ==null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2798
    const-string v0, "com.huawei.hihealth.action_sync_status"

    const/4 v1, 0x6

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v7

    .line 2799
    const/4 v0, 0x2

    if-ne v0, v7, :cond_5

    .line 2800
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initCommonDialog HiBroadcastAction.SyncStatusAction.DONE background"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2801
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    invoke-static {v0}, Lo/dth;->b(Landroid/content/Context;)Lo/dth;

    move-result-object v0

    invoke-virtual {v0}, Lo/dth;->i()V

    .line 2802
    iget-object v0, p0, Lo/ale;->m:Landroid/os/Handler;

    const/16 v1, 0x1900

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    goto :goto_1

    .line 2803
    :cond_5
    const/4 v0, 0x3

    if-ne v0, v7, :cond_6

    .line 2804
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initCommonDialog HiBroadcastAction.SyncStatusAction.FAIL background"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1

    .line 2805
    :cond_6
    const/4 v0, 0x1

    if-ne v0, v7, :cond_7

    .line 2806
    const-string v0, "com.huawei.hihealth.action_sync_process"

    const-wide/16 v1, 0x0

    invoke-virtual {p1, v0, v1, v2}, Landroid/content/Intent;->getDoubleExtra(Ljava/lang/String;D)D

    move-result-wide v8

    .line 2807
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "initCommonDialog HiBroadcastAction.SyncStatusAction.ONGOING background process = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v8, v9}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2808
    goto :goto_1

    :cond_7
    const/4 v0, 0x0

    if-ne v0, v7, :cond_8

    .line 2809
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initCommonDialog HiBroadcastAction.SyncStatusAction.BEGIN background"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2812
    :cond_8
    :goto_1
    return-void
.end method

.method public b(Landroid/os/Handler;)V
    .locals 4

    .line 260
    iput-object p1, p0, Lo/ale;->m:Landroid/os/Handler;

    .line 261
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setMainHandler() mainHandler = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 262
    return-void
.end method

.method public c(I)V
    .locals 6

    .line 3857
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-nez v0, :cond_0

    .line 3858
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dde;->d(Landroid/content/Context;)Lo/dde;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/dde;->c(I)V

    goto/16 :goto_0

    .line 3861
    :cond_0
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0x2718

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "oversea_user_agreed"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 3863
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "wear device plugin download is user agreed :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3864
    const-string v0, "true"

    invoke-static {v4, v0}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 3866
    iget-object v0, p0, Lo/ale;->u:Ljava/util/concurrent/ExecutorService;

    if-eqz v0, :cond_3

    .line 3867
    iget-object v0, p0, Lo/ale;->u:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->isShutdown()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 3868
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lo/ale;->u:Ljava/util/concurrent/ExecutorService;

    .line 3870
    :cond_1
    iget-object v0, p0, Lo/ale;->u:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lo/ale$53;

    invoke-direct {v1, p0, p1}, Lo/ale$53;-><init>(Lo/ale;I)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    goto :goto_0

    .line 3879
    :cond_2
    iget-object v0, p0, Lo/ale;->m:Landroid/os/Handler;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 3880
    iget-object v0, p0, Lo/ale;->m:Landroid/os/Handler;

    const/16 v1, 0xfae

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v5

    .line 3881
    iput p1, v5, Landroid/os/Message;->arg1:I

    .line 3882
    iget-object v0, p0, Lo/ale;->m:Landroid/os/Handler;

    invoke-virtual {v0, v5}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 3886
    :cond_3
    :goto_0
    return-void
.end method

.method public c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 6

    .line 925
    const-string v0, "Login_MainInteractors"

    const/16 v1, 0x9

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showSingleButtonDialog enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, " title = "

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x2

    aput-object p1, v1, v2

    const-string v2, " content = "

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const/4 v2, 0x4

    aput-object p2, v1, v2

    const-string v2, " buttonText = "

    const/4 v3, 0x5

    aput-object v2, v1, v3

    const/4 v2, 0x6

    aput-object p3, v1, v2

    const-string v2, " type = "

    const/4 v3, 0x7

    aput-object v2, v1, v3

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/16 v3, 0x8

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 927
    new-instance v5, Lo/egv$b;

    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    invoke-direct {v5, v0}, Lo/egv$b;-><init>(Landroid/content/Context;)V

    .line 928
    invoke-virtual {v5, p1}, Lo/egv$b;->e(Ljava/lang/String;)Lo/egv$b;

    move-result-object v0

    .line 929
    invoke-virtual {v0, p2}, Lo/egv$b;->b(Ljava/lang/String;)Lo/egv$b;

    move-result-object v0

    new-instance v1, Lo/ale$5;

    invoke-direct {v1, p0, p4}, Lo/ale$5;-><init>(Lo/ale;I)V

    .line 930
    invoke-virtual {v0, p3, v1}, Lo/egv$b;->b(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egv$b;

    .line 940
    invoke-virtual {v5}, Lo/egv$b;->b()Lo/egv;

    move-result-object v4

    .line 941
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Lo/egv;->setCancelable(Z)V

    .line 942
    invoke-virtual {v4}, Lo/egv;->show()V

    .line 943
    return-void
.end method

.method public c()Z
    .locals 4

    .line 497
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "shouldShowGuide "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "SUPPORT_GUIDE "

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 498
    const/4 v0, 0x0

    return v0
.end method

.method public d(I)V
    .locals 4

    .line 1056
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: doagainToBranchCheckIsLoginForHealth(final int type) type = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1057
    iget-object v0, p0, Lo/ale;->u:Ljava/util/concurrent/ExecutorService;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lo/ale;->u:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->isShutdown()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1058
    :cond_0
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: doagainToBranchCheckIsLoginForHealth mExecutorService is null or shutdown"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1059
    return-void

    .line 1061
    :cond_1
    iget-object v0, p0, Lo/ale;->u:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lo/ale$7;

    invoke-direct {v1, p0, p1}, Lo/ale$7;-><init>(Lo/ale;I)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 1072
    return-void
.end method

.method public d(IILandroid/content/Intent;)V
    .locals 5

    .line 3413
    iget-object v4, p0, Lo/ale;->l:Landroid/app/Activity;

    .line 3414
    if-eqz v4, :cond_0

    invoke-virtual {v4}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 3415
    :cond_0
    return-void

    .line 3418
    :cond_1
    iget v0, p0, Lo/ale;->aa:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_3

    const/16 v0, 0x7d2

    if-ne p1, v0, :cond_3

    .line 3419
    invoke-direct {p0, v4}, Lo/ale;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 3420
    iget v0, p0, Lo/ale;->P:I

    invoke-direct {p0, v0}, Lo/ale;->o(I)V

    goto :goto_0

    .line 3422
    :cond_2
    invoke-direct {p0, v4}, Lo/ale;->a(Landroid/app/Activity;)V

    .line 3424
    :goto_0
    return-void

    .line 3427
    :cond_3
    iget v0, p0, Lo/ale;->aa:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_6

    const/16 v0, 0x7d3

    if-ne p1, v0, :cond_6

    .line 3428
    invoke-direct {p0, v4}, Lo/ale;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 3429
    iget v0, p0, Lo/ale;->P:I

    invoke-direct {p0, v0}, Lo/ale;->o(I)V

    goto :goto_1

    .line 3431
    :cond_4
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onActivityResult mTryCount:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/ale;->M:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3432
    invoke-direct {p0}, Lo/ale;->aK()I

    move-result v0

    iput v0, p0, Lo/ale;->M:I

    .line 3433
    iget v0, p0, Lo/ale;->M:I

    const/4 v1, 0x5

    if-lt v0, v1, :cond_5

    .line 3434
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lo/ale;->i(Z)V

    goto :goto_1

    .line 3437
    :cond_5
    invoke-virtual {p0}, Lo/ale;->N()V

    .line 3440
    :goto_1
    return-void

    .line 3442
    :cond_6
    return-void
.end method

.method public d(Lcom/huawei/cloudservice/CloudAccount;)V
    .locals 4

    .line 3165
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getUserInfo getUser"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3166
    if-eqz p1, :cond_0

    .line 3167
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const-string v1, "1000"

    new-instance v2, Lo/ale$40;

    invoke-direct {v2, p0}, Lo/ale$40;-><init>(Lo/ale;)V

    invoke-virtual {p1, v0, v1, v2}, Lcom/huawei/cloudservice/CloudAccount;->getUserInfo(Landroid/content/Context;Ljava/lang/String;Lcom/huawei/cloudservice/CloudRequestHandler;)V

    .line 3189
    :cond_0
    return-void
.end method

.method public d(Ljava/util/concurrent/ExecutorService;)V
    .locals 0

    .line 265
    iput-object p1, p0, Lo/ale;->u:Ljava/util/concurrent/ExecutorService;

    .line 266
    return-void
.end method

.method public d()Z
    .locals 1

    .line 239
    iget-boolean v0, p0, Lo/ale;->O:Z

    return v0
.end method

.method public e()V
    .locals 6

    .line 462
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "start_huawei_health_current_time"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 464
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 465
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "start_huawei_health_current_time"

    .line 466
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lo/dcy;

    invoke-direct {v4}, Lo/dcy;-><init>()V

    .line 465
    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 468
    :cond_0
    return-void
.end method

.method public e(I)V
    .locals 5

    .line 2258
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "handleLoginErrorCode enter:  errcode = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2259
    const/16 v0, 0xbba

    if-ne p1, v0, :cond_0

    .line 2260
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "finish MainAcitivity for cause:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "ERROR_OPER_CANCEL"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2261
    invoke-static {}, Lo/ale;->h()V

    goto/16 :goto_0

    .line 2262
    :cond_0
    const v0, 0x186a2

    if-ne p1, v0, :cond_1

    .line 2263
    iget-object v0, p0, Lo/ale;->m:Landroid/os/Handler;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_5

    .line 2264
    iget-object v0, p0, Lo/ale;->m:Landroid/os/Handler;

    const/16 v1, 0x139b

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v4

    .line 2265
    iget-object v0, p0, Lo/ale;->m:Landroid/os/Handler;

    invoke-virtual {v0, v4}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 2266
    goto :goto_0

    .line 2267
    :cond_1
    const/16 v0, 0x28

    if-ne v0, p1, :cond_2

    .line 2268
    iget-object v0, p0, Lo/ale;->m:Landroid/os/Handler;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_5

    .line 2269
    iget-object v0, p0, Lo/ale;->m:Landroid/os/Handler;

    const/16 v1, 0x139d

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v4

    .line 2270
    iget-object v0, p0, Lo/ale;->m:Landroid/os/Handler;

    invoke-virtual {v0, v4}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 2271
    goto :goto_0

    .line 2272
    :cond_2
    const/16 v0, 0x23

    if-ne v0, p1, :cond_3

    .line 2273
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/ale;->E:Z

    .line 2274
    iget v0, p0, Lo/ale;->H:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/ale;->H:I

    goto :goto_0

    .line 2275
    :cond_3
    const/16 v0, 0x1e

    if-ne v0, p1, :cond_4

    .line 2276
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ErrorStatus.ERROR_HWID_IS_LOW_VERSION"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 2278
    :cond_4
    iget-object v0, p0, Lo/ale;->m:Landroid/os/Handler;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_5

    .line 2279
    iget-object v0, p0, Lo/ale;->m:Landroid/os/Handler;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v4

    .line 2280
    iget-object v0, p0, Lo/ale;->m:Landroid/os/Handler;

    invoke-virtual {v0, v4}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 2283
    :cond_5
    :goto_0
    return-void
.end method

.method public e(Z)V
    .locals 9

    .line 1248
    const-string v0, "TimeEat_MainInteractors"

    const-string v1, "Enter todoCheckLogin"

    invoke-static {v0, v1}, Lo/dbf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 1250
    const-string v0, "user_agree_alo ne_to_cloud_version"

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1}, Lo/ale;->a(Ljava/lang/String;Z)V

    .line 1252
    const-string v0, "2"

    invoke-direct {p0, v0}, Lo/ale;->c(Ljava/lang/String;)V

    .line 1253
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    invoke-static {v0}, Lo/abi;->d(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    .line 1254
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "todoCheckLogin():ifNeedShowAreaAlert = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1255
    const-string v0, "1"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1256
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lo/ale;->i(Z)V

    .line 1257
    return-void

    .line 1261
    :cond_0
    invoke-static {}, Lo/cbj;->d()Lo/cbj;

    move-result-object v0

    iget-object v1, p0, Lo/ale;->o:Landroid/content/Context;

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lo/cbj;->e(Landroid/content/Context;Z)V

    .line 1263
    const/4 v0, 0x0

    iput v0, p0, Lo/ale;->s:I

    .line 1264
    const-string v0, ""

    iput-object v0, p0, Lo/ale;->n:Ljava/lang/String;

    .line 1265
    const-string v0, ""

    iput-object v0, p0, Lo/ale;->p:Ljava/lang/String;

    .line 1266
    const/4 v0, 0x0

    iput v0, p0, Lo/ale;->q:I

    .line 1267
    const/4 v0, 0x0

    iput v0, p0, Lo/ale;->j:I

    .line 1269
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ale;->z:Lcom/huawei/hihealthservice/old/model/AccountInfo;

    .line 1270
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ale;->x:Lcom/huawei/hihealth/HiAccountInfo;

    .line 1271
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ale;->y:Lcom/huawei/account/aidl/AccountAidlInfo;

    .line 1272
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/ale;->v:Z

    .line 1273
    const-string v0, ""

    iput-object v0, p0, Lo/ale;->i:Ljava/lang/String;

    .line 1274
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/ale;->h:Z

    .line 1275
    invoke-static {}, Lo/czu;->i()Z

    move-result v0

    if-nez v0, :cond_1

    if-eqz p1, :cond_6

    .line 1276
    :cond_1
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Utils.ifAllowLogin()\uff1atrue"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1277
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    invoke-static {v0}, Lo/dnm;->a(Landroid/content/Context;)Lo/dnm;

    move-result-object v5

    .line 1278
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    invoke-virtual {v5, v0}, Lo/dnm;->b(Landroid/content/Context;)V

    .line 1279
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    iput-object v0, p0, Lo/ale;->f:Lcom/huawei/login/ui/login/LoginInit;

    .line 1280
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/LoginInit;->getHealthLoginChannel()I

    move-result v6

    .line 1281
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "todoCheckLogin logintype = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1282
    const/4 v0, -0x1

    if-eq v6, v0, :cond_2

    const/4 v0, 0x1

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    invoke-direct {p0, v0}, Lo/ale;->h(Z)Z

    move-result v0

    if-nez v0, :cond_3

    .line 1283
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "todoCheckLogin mLoginManager.getIsLogined() = false  and  database not login"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1284
    invoke-direct {p0}, Lo/ale;->ai()V

    goto :goto_2

    .line 1286
    :cond_3
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "todoCheckLogin mLoginManager.getIsLogined() = false  and  database logined"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1288
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    invoke-static {v0}, Lo/dcn;->e(Landroid/content/Context;)Lo/dcn;

    move-result-object v0

    const-string v1, "server_token"

    invoke-virtual {v0, v1}, Lo/dcn;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 1289
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_4

    const/4 v8, 0x1

    goto :goto_1

    :cond_4
    const/4 v8, 0x0

    .line 1290
    :goto_1
    if-eqz v8, :cond_5

    const/4 v0, -0x1

    if-eq v6, v0, :cond_5

    invoke-static {}, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;->isHasLogin()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 1291
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/LoginInit;->getIsLogined()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 1292
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "already logined...goto HomeFragment..."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1293
    invoke-direct {p0}, Lo/ale;->X()V

    goto :goto_2

    .line 1295
    :cond_5
    invoke-direct {p0}, Lo/ale;->ag()V

    .line 1298
    :goto_2
    goto :goto_3

    .line 1299
    :cond_6
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    const/16 v1, 0x4e20

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "huawei_account_login_init"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 1300
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "loginFlag\uff1a"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v5, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1301
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 1302
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    invoke-static {v0}, Lo/dnm;->a(Landroid/content/Context;)Lo/dnm;

    move-result-object v6

    .line 1303
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    invoke-virtual {v6, v0}, Lo/dnm;->e(Landroid/content/Context;)V

    .line 1305
    :cond_7
    invoke-direct {p0}, Lo/ale;->X()V

    .line 1308
    :goto_3
    const-string v0, "TimeEat_MainInteractors"

    const-string v1, "Leave todoCheckLogin"

    invoke-static {v0, v1}, Lo/dbf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 1309
    return-void
.end method

.method public f()V
    .locals 10

    .line 641
    const-string v0, "TimeEat_MainInteractors"

    const-string v1, "Enter doInitPluginLoginHiHealth"

    invoke-static {v0, v1}, Lo/dbf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 642
    const/4 v0, 0x0

    iput v0, p0, Lo/ale;->H:I

    .line 643
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/ale;->E:Z

    .line 646
    invoke-static {}, Lo/cbj;->d()Lo/cbj;

    move-result-object v0

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Lo/cbj;->d(I)V

    .line 648
    iget-object v4, p0, Lo/ale;->l:Landroid/app/Activity;

    .line 649
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    invoke-virtual {v4}, Landroid/app/Activity;->isDestroyed()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {v4}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 650
    :cond_0
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "activity.isDestroyed() || activity.isFinishing()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 651
    return-void

    .line 654
    :cond_1
    invoke-virtual {p0}, Lo/ale;->c()Z

    move-result v5

    .line 655
    if-nez v5, :cond_2

    .line 657
    iget-object v0, p0, Lo/ale;->m:Landroid/os/Handler;

    const/16 v1, 0x9

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 660
    :cond_2
    invoke-static {}, Lo/czu;->i()Z

    move-result v6

    .line 661
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    const/16 v1, 0x4e20

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "huawei_account_login_init"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 662
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "loginFlag\uff1a"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v7, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 663
    if-nez v6, :cond_3

    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_5

    .line 664
    :cond_3
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: hiloginAndPluginInit isAllowedLogin"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 666
    new-instance v8, Lcom/huawei/hihealth/HiAccountInfo;

    invoke-direct {v8}, Lcom/huawei/hihealth/HiAccountInfo;-><init>()V

    .line 667
    iget-object v0, p0, Lo/ale;->f:Lcom/huawei/login/ui/login/LoginInit;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    .line 668
    iget-object v0, p0, Lo/ale;->f:Lcom/huawei/login/ui/login/LoginInit;

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/LoginInit;->getAccessToken()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Lcom/huawei/hihealth/HiAccountInfo;->setAccessToken(Ljava/lang/String;)V

    .line 669
    iget-object v0, p0, Lo/ale;->f:Lcom/huawei/login/ui/login/LoginInit;

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/LoginInit;->getUsetId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Lcom/huawei/hihealth/HiAccountInfo;->setHuid(Ljava/lang/String;)V

    .line 670
    iget-object v0, p0, Lo/ale;->f:Lcom/huawei/login/ui/login/LoginInit;

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/LoginInit;->getSeverToken()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Lcom/huawei/hihealth/HiAccountInfo;->setServiceToken(Ljava/lang/String;)V

    .line 671
    iget-object v0, p0, Lo/ale;->f:Lcom/huawei/login/ui/login/LoginInit;

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/LoginInit;->getSiteId()I

    move-result v0

    invoke-virtual {v8, v0}, Lcom/huawei/hihealth/HiAccountInfo;->setSiteId(I)V

    .line 674
    :cond_4
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    invoke-static {v0}, Lo/dnm;->a(Landroid/content/Context;)Lo/dnm;

    move-result-object v9

    .line 675
    invoke-virtual {v9}, Lo/dnm;->a()V

    .line 676
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    invoke-static {v0}, Lo/clq;->e(Landroid/content/Context;)Lo/clq;

    move-result-object v0

    new-instance v1, Lo/ale$59;

    invoke-direct {v1, p0, v9, v6, v7}, Lo/ale$59;-><init>(Lo/ale;Lo/dnm;ZLjava/lang/String;)V

    invoke-virtual {v0, v8, v1}, Lo/clq;->e(Lcom/huawei/hihealth/HiAccountInfo;Lo/clz;)V

    .line 707
    invoke-direct {p0}, Lo/ale;->ae()V

    .line 709
    :cond_5
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/operation/OpAnalyticsUtil;->init(Landroid/content/Context;)V

    .line 710
    invoke-static {}, Lo/czu;->b()Z

    move-result v0

    if-nez v0, :cond_6

    .line 711
    invoke-direct {p0}, Lo/ale;->az()V

    .line 713
    :cond_6
    invoke-direct {p0}, Lo/ale;->av()V

    .line 714
    invoke-direct {p0}, Lo/ale;->aw()V

    .line 717
    invoke-direct {p0}, Lo/ale;->as()V

    .line 718
    invoke-direct {p0}, Lo/ale;->au()V

    .line 719
    invoke-direct {p0}, Lo/ale;->at()V

    .line 720
    invoke-virtual {p0}, Lo/ale;->F()V

    .line 724
    const/4 v0, 0x1

    invoke-static {v0}, Lo/ale;->c(Z)V

    .line 726
    if-eqz v5, :cond_7

    .line 727
    invoke-direct {p0}, Lo/ale;->W()V

    goto :goto_0

    .line 729
    :cond_7
    invoke-virtual {p0}, Lo/ale;->l()V

    .line 732
    :goto_0
    const-string v0, "TimeEat_MainInteractors"

    const-string v1, "Leave doInitPluginLoginHiHealth"

    invoke-static {v0, v1}, Lo/dbf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 733
    return-void
.end method

.method public g()V
    .locals 2

    .line 592
    const-string v0, "TimeEat_MainInteractors"

    const-string v1, "Enter initFormation"

    invoke-static {v0, v1}, Lo/dbf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 593
    iget-object v0, p0, Lo/ale;->u:Ljava/util/concurrent/ExecutorService;

    if-eqz v0, :cond_1

    .line 594
    iget-object v0, p0, Lo/ale;->u:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->isShutdown()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 595
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lo/ale;->u:Ljava/util/concurrent/ExecutorService;

    .line 597
    :cond_0
    iget-object v0, p0, Lo/ale;->u:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lo/ale$58;

    invoke-direct {v1, p0}, Lo/ale$58;-><init>(Lo/ale;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 611
    :cond_1
    const-string v0, "TimeEat_MainInteractors"

    const-string v1, "Leave initFormation"

    invoke-static {v0, v1}, Lo/dbf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 612
    return-void
.end method

.method public i(I)V
    .locals 5

    .line 3891
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter showOverSeaDialog"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3892
    new-instance v4, Lo/egv$b;

    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    invoke-direct {v4, v0}, Lo/egv$b;-><init>(Landroid/content/Context;)V

    .line 3893
    const v0, 0x7f02023a

    invoke-virtual {v4, v0}, Lo/egv$b;->b(I)Lo/egv$b;

    move-result-object v0

    .line 3894
    const v1, 0x7f0209c2

    invoke-virtual {v0, v1}, Lo/egv$b;->e(I)Lo/egv$b;

    move-result-object v0

    new-instance v1, Lo/ale$56;

    invoke-direct {v1, p0, p1}, Lo/ale$56;-><init>(Lo/ale;I)V

    .line 3895
    const v2, 0x7f020670

    invoke-virtual {v0, v2, v1}, Lo/egv$b;->e(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    move-result-object v0

    new-instance v1, Lo/ale$57;

    invoke-direct {v1, p0}, Lo/ale$57;-><init>(Lo/ale;)V

    .line 3920
    const v2, 0x7f020200

    invoke-virtual {v0, v2, v1}, Lo/egv$b;->b(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    .line 3932
    invoke-virtual {v4}, Lo/egv$b;->b()Lo/egv;

    move-result-object v0

    iput-object v0, p0, Lo/ale;->ac:Lo/egv;

    .line 3933
    iget-object v0, p0, Lo/ale;->ac:Lo/egv;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egv;->setCancelable(Z)V

    .line 3934
    iget-object v0, p0, Lo/ale;->ac:Lo/egv;

    invoke-virtual {v0}, Lo/egv;->show()V

    .line 3935
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "end showOverSeaDialog"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3936
    return-void
.end method

.method public i()Z
    .locals 1

    .line 737
    invoke-static {}, Lo/cbj;->d()Lo/cbj;

    move-result-object v0

    invoke-virtual {v0}, Lo/cbj;->c()Z

    move-result v0

    return v0
.end method

.method public j()V
    .locals 5

    .line 2657
    iget-object v0, p0, Lo/ale;->U:Landroid/content/BroadcastReceiver;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 2661
    :try_start_0
    iget-object v0, p0, Lo/ale;->l:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lo/ale;->U:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 2664
    goto :goto_0

    .line 2662
    :catch_0
    move-exception v4

    .line 2663
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2666
    :cond_0
    :goto_0
    return-void
.end method

.method public k()V
    .locals 3

    .line 742
    invoke-static {}, Lo/cbj;->d()Lo/cbj;

    move-result-object v0

    iget-object v1, p0, Lo/ale;->o:Landroid/content/Context;

    iget-object v2, p0, Lo/ale;->m:Landroid/os/Handler;

    invoke-virtual {v0, v1, v2}, Lo/cbj;->a(Landroid/content/Context;Landroid/os/Handler;)V

    .line 743
    return-void
.end method

.method public l()V
    .locals 5

    .line 865
    const-string v0, "TimeEat_MainInteractors"

    const-string v1, "Enter sendMsgShowView"

    invoke-static {v0, v1}, Lo/dbf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 866
    iget-object v0, p0, Lo/ale;->m:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 867
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: hiloginAndPluginInit MSG_UPDATE_VIEW"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 868
    iget-object v0, p0, Lo/ale;->m:Landroid/os/Handler;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v4

    .line 869
    iget-object v0, p0, Lo/ale;->m:Landroid/os/Handler;

    invoke-virtual {v0, v4}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 870
    goto :goto_0

    .line 872
    :cond_0
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "sendMsgShowView() mainHandler = null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 874
    :goto_0
    const-string v0, "TimeEat_MainInteractors"

    const-string v1, "Leave sendMsgShowView"

    invoke-static {v0, v1}, Lo/dbf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 875
    return-void
.end method

.method public m()V
    .locals 4

    .line 746
    iget-object v0, p0, Lo/ale;->u:Ljava/util/concurrent/ExecutorService;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lo/ale;->u:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->isShutdown()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 747
    :cond_0
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initMigrateData mExecutorService is null or shutdown"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 748
    return-void

    .line 750
    :cond_1
    iget-object v0, p0, Lo/ale;->u:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lo/ale$60;

    invoke-direct {v1, p0}, Lo/ale$60;-><init>(Lo/ale;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 758
    return-void
.end method

.method public n()V
    .locals 2

    .line 974
    iget-object v0, p0, Lo/ale;->L:Lo/egv;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 975
    iget-object v0, p0, Lo/ale;->L:Lo/egv;

    invoke-virtual {v0}, Lo/egv;->dismiss()V

    .line 976
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ale;->L:Lo/egv;

    .line 978
    :cond_0
    return-void
.end method

.method public o()V
    .locals 7

    .line 1026
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "accountmigrate: showDataMigrateToastCloudTimeout() enter"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/ale;->A:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1027
    iget v0, p0, Lo/ale;->A:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 1028
    const/4 v0, 0x2

    iput v0, p0, Lo/ale;->A:I

    .line 1030
    iget-object v0, p0, Lo/ale;->w:Lcom/huawei/hwcloudmodel/model/userprofile/MergeUserAllDataReq;

    if-eqz v0, :cond_0

    .line 1031
    iget-object v0, p0, Lo/ale;->w:Lcom/huawei/hwcloudmodel/model/userprofile/MergeUserAllDataReq;

    invoke-virtual {v0}, Lcom/huawei/hwcloudmodel/model/userprofile/MergeUserAllDataReq;->getOriginalHuid()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lo/ale;->w:Lcom/huawei/hwcloudmodel/model/userprofile/MergeUserAllDataReq;

    invoke-virtual {v1}, Lcom/huawei/hwcloudmodel/model/userprofile/MergeUserAllDataReq;->getOriginalST()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lo/ale;->o:Landroid/content/Context;

    .line 1032
    invoke-static {v2}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v2

    invoke-virtual {v2}, Lcom/huawei/login/ui/login/LoginInit;->getUsetId()Ljava/lang/String;

    move-result-object v2

    .line 1031
    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/alg;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 1035
    :cond_0
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    const v1, 0x7f02046d

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v4

    .line 1037
    new-instance v6, Lo/egv$b;

    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    invoke-direct {v6, v0}, Lo/egv$b;-><init>(Landroid/content/Context;)V

    .line 1038
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    const v1, 0x7f0200d0

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lo/egv$b;->e(Ljava/lang/String;)Lo/egv$b;

    move-result-object v0

    iget-object v1, p0, Lo/ale;->o:Landroid/content/Context;

    .line 1039
    const v2, 0x7f0200df

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egv$b;->b(Ljava/lang/String;)Lo/egv$b;

    move-result-object v0

    new-instance v1, Lo/ale$8;

    invoke-direct {v1, p0}, Lo/ale$8;-><init>(Lo/ale;)V

    .line 1040
    invoke-virtual {v0, v4, v1}, Lo/egv$b;->b(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egv$b;

    .line 1049
    invoke-virtual {v6}, Lo/egv$b;->b()Lo/egv;

    move-result-object v5

    .line 1050
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Lo/egv;->setCancelable(Z)V

    .line 1051
    invoke-virtual {v5}, Lo/egv;->show()V

    .line 1053
    :cond_1
    return-void
.end method

.method public p()V
    .locals 8

    .line 949
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: showRootedDialog"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 950
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    const/16 v1, 0x271f

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "key_ui_login_is_rooted"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 951
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 952
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: showRootedDialog has showed"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 953
    return-void

    .line 955
    :cond_0
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    const v1, 0x7f02046d

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v5

    .line 957
    new-instance v7, Lo/egv$b;

    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    invoke-direct {v7, v0}, Lo/egv$b;-><init>(Landroid/content/Context;)V

    .line 958
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    const v1, 0x7f0200d0

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Lo/egv$b;->e(Ljava/lang/String;)Lo/egv$b;

    move-result-object v0

    iget-object v1, p0, Lo/ale;->o:Landroid/content/Context;

    .line 959
    const v2, 0x7f020640

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egv$b;->b(Ljava/lang/String;)Lo/egv$b;

    move-result-object v0

    new-instance v1, Lo/ale$6;

    invoke-direct {v1, p0}, Lo/ale$6;-><init>(Lo/ale;)V

    .line 960
    invoke-virtual {v0, v5, v1}, Lo/egv$b;->b(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egv$b;

    .line 968
    invoke-virtual {v7}, Lo/egv$b;->b()Lo/egv;

    move-result-object v6

    .line 969
    const/4 v0, 0x0

    invoke-virtual {v6, v0}, Lo/egv;->setCancelable(Z)V

    .line 970
    invoke-virtual {v6}, Lo/egv;->show()V

    .line 971
    return-void
.end method

.method public q()V
    .locals 4

    .line 1365
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate:  checkCloudAndLocalMigrated()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1366
    iget-object v0, p0, Lo/ale;->u:Ljava/util/concurrent/ExecutorService;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lo/ale;->u:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->isShutdown()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1367
    :cond_0
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate:  checkCloudAndLocalMigrated() is shutdown"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1368
    return-void

    .line 1370
    :cond_1
    iget-object v0, p0, Lo/ale;->u:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lo/ale$16;

    invoke-direct {v1, p0}, Lo/ale$16;-><init>(Lo/ale;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 1382
    return-void
.end method

.method public r()V
    .locals 2

    .line 1207
    iget-object v0, p0, Lo/ale;->u:Ljava/util/concurrent/ExecutorService;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lo/ale;->u:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->isShutdown()Z

    move-result v0

    if-nez v0, :cond_0

    .line 1208
    iget-object v0, p0, Lo/ale;->u:Ljava/util/concurrent/ExecutorService;

    iget-object v1, p0, Lo/ale;->Q:Lo/ale$a;

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 1210
    :cond_0
    return-void
.end method

.method public s()V
    .locals 6

    .line 2287
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showHwIdStopedDialog"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2289
    new-instance v5, Lo/egv$b;

    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    invoke-direct {v5, v0}, Lo/egv$b;-><init>(Landroid/content/Context;)V

    .line 2290
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    const v1, 0x7f0200d0

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lo/egv$b;->e(Ljava/lang/String;)Lo/egv$b;

    move-result-object v0

    iget-object v1, p0, Lo/ale;->o:Landroid/content/Context;

    .line 2291
    const v2, 0x7f0200e6

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egv$b;->b(Ljava/lang/String;)Lo/egv$b;

    move-result-object v0

    iget-object v1, p0, Lo/ale;->o:Landroid/content/Context;

    .line 2292
    const v2, 0x7f02029e

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lo/ale$33;

    invoke-direct {v2, p0}, Lo/ale$33;-><init>(Lo/ale;)V

    invoke-virtual {v0, v1, v2}, Lo/egv$b;->b(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egv$b;

    move-result-object v0

    iget-object v1, p0, Lo/ale;->o:Landroid/content/Context;

    .line 2309
    const v2, 0x7f02007c

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lo/ale$27;

    invoke-direct {v2, p0}, Lo/ale$27;-><init>(Lo/ale;)V

    invoke-virtual {v0, v1, v2}, Lo/egv$b;->e(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egv$b;

    .line 2316
    invoke-virtual {v5}, Lo/egv$b;->b()Lo/egv;

    move-result-object v4

    .line 2317
    invoke-virtual {v4}, Lo/egv;->show()V

    .line 2318
    return-void
.end method

.method public t()V
    .locals 10

    .line 1123
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lo/czu;->i()Z

    move-result v0

    if-nez v0, :cond_0

    .line 1124
    return-void

    .line 1126
    :cond_0
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: checkAccountSync enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1127
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    const-string v1, "main_id"

    const-string v2, "main_key"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 1128
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/LoginInit;->getUsetId()Ljava/lang/String;

    move-result-object v5

    .line 1129
    new-instance v6, Lo/dcy;

    invoke-direct {v6}, Lo/dcy;-><init>()V

    .line 1130
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/ale;->O:Z

    .line 1132
    :try_start_0
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    invoke-static {v0}, Lo/dec;->a(Landroid/content/Context;)Lo/dec;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1, v5}, Lo/dec;->c(ILjava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v7

    .line 1133
    const/4 v0, 0x0

    if-eq v0, v7, :cond_2

    .line 1134
    const-string v8, ""

    .line 1136
    :try_start_1
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    invoke-static {v0}, Lo/dec;->a(Landroid/content/Context;)Lo/dec;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1, v4}, Lo/dec;->a(ILjava/lang/String;)Ljava/lang/String;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    move-result-object v0

    move-object v8, v0

    .line 1140
    goto :goto_0

    .line 1137
    :catch_0
    move-exception v9

    .line 1139
    :try_start_2
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    const-string v1, "main_id"

    const-string v2, "main_key"

    invoke-static {v0, v1, v2, v7, v6}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 1141
    :goto_0
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    invoke-static {v0}, Lo/dec;->a(Landroid/content/Context;)Lo/dec;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1, v7}, Lo/dec;->a(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 1142
    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1143
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/ale;->O:Z

    goto :goto_1

    .line 1146
    :cond_1
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    const-string v1, "main_id"

    const-string v2, "main_key"

    invoke-static {v0, v1, v2, v7, v6}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    .line 1151
    :cond_2
    :goto_1
    goto :goto_2

    .line 1149
    :catch_1
    move-exception v7

    .line 1150
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Exception="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v7}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1152
    :goto_2
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    invoke-virtual {v0, v5}, Lo/cxf;->b(Ljava/lang/String;)V

    .line 1153
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "===Show User ID"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v5, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1154
    new-instance v7, Ljava/util/HashMap;

    invoke-direct {v7}, Ljava/util/HashMap;-><init>()V

    .line 1155
    const-string v0, "click"

    const-string v1, "1"

    invoke-interface {v7, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1156
    sget-object v0, Lo/dae;->gk:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v8

    .line 1157
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lo/ale;->o:Landroid/content/Context;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v8, v7, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 1158
    iget-boolean v0, p0, Lo/ale;->O:Z

    const/4 v1, 0x0

    if-ne v1, v0, :cond_3

    .line 1159
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: checkAccountSync isSameAccount = false"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1160
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    invoke-static {}, Lo/cmn;->c()Ljava/util/List;

    move-result-object v1

    new-instance v2, Lo/ale$12;

    invoke-direct {v2, p0}, Lo/ale$12;-><init>(Lo/ale;)V

    invoke-interface {v0, v1, v2}, Lo/clt;->b(Ljava/util/List;Lo/clz;)V

    .line 1178
    :cond_3
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: checkAccountSync end"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1179
    return-void
.end method

.method public u()V
    .locals 6

    .line 2382
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startDaemonService"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2383
    new-instance v4, Landroid/content/Intent;

    invoke-direct {v4}, Landroid/content/Intent;-><init>()V

    .line 2384
    const-string v0, "com.huawei.health"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 2385
    const-string v0, "THE_MAINUI_START_DAEMONSERVICE"

    const/4 v1, 0x1

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 2386
    const-string v0, "com.huawei.health"

    const-string v1, "com.huawei.health.manager.DaemonService"

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 2388
    iget-object v5, p0, Lo/ale;->l:Landroid/app/Activity;

    .line 2389
    const/4 v0, 0x0

    if-eq v0, v5, :cond_0

    .line 2390
    invoke-virtual {v5, v4}, Landroid/app/Activity;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 2392
    :cond_0
    return-void
.end method

.method public v()V
    .locals 3

    .line 2412
    const-string v0, "TimeEat_MainInteractors"

    const-string v1, "Enter initMessageCenter"

    invoke-static {v0, v1}, Lo/dbf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 2413
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    invoke-static {v0}, Lo/eaa;->c(Landroid/content/Context;)Lo/eaa;

    move-result-object v0

    iget-object v1, p0, Lo/ale;->o:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lo/eaa;->init(Landroid/content/Context;)V

    .line 2414
    invoke-static {}, Lo/czu;->b()Z

    move-result v0

    if-nez v0, :cond_0

    .line 2415
    const-string v2, "MessagePushToken"

    .line 2416
    new-instance v0, Lcom/huawei/health/receiver/MessagePushReceiver;

    invoke-direct {v0}, Lcom/huawei/health/receiver/MessagePushReceiver;-><init>()V

    invoke-static {v2, v0}, Lcom/huawei/hwcloudmodel/mgr/HuaweiHealthPushRevicer;->c(Ljava/lang/String;Lo/cyz;)V

    .line 2418
    :cond_0
    const-string v0, "TimeEat_MainInteractors"

    const-string v1, "Leave initMessageCenter"

    invoke-static {v0, v1}, Lo/dbf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 2419
    return-void
.end method

.method public w()V
    .locals 4

    .line 2535
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "in addPermissions()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2536
    invoke-direct {p0}, Lo/ale;->aB()V

    .line 2537
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    iget-object v1, p0, Lo/ale;->o:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/all;->d(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 2538
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "in addPermissions() is SystemApp"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2539
    invoke-static {}, Lo/all;->e()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2540
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "in addPermissions() supportNewPermissionCheck"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2541
    invoke-static {}, Lo/all;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2542
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "in addPermissions() is ChinaROM("

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2543
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    iget-object v1, p0, Lo/ale;->b:[Ljava/lang/String;

    invoke-direct {p0, v0, v1}, Lo/ale;->c(Landroid/content/Context;[Ljava/lang/String;)V

    goto/16 :goto_0

    .line 2545
    :cond_0
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "in addPermissions() is not ChinaROM("

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2546
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    iget-object v1, p0, Lo/ale;->a:[Ljava/lang/String;

    invoke-direct {p0, v0, v1}, Lo/ale;->c(Landroid/content/Context;[Ljava/lang/String;)V

    goto/16 :goto_0

    .line 2549
    :cond_1
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "in addPermissions() do not supportNewPermissionCheck"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2550
    invoke-static {}, Lo/all;->a()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 2551
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "in addPermissions() is ChinaROM("

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2552
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    iget-object v1, p0, Lo/ale;->d:[Ljava/lang/String;

    invoke-direct {p0, v0, v1}, Lo/ale;->c(Landroid/content/Context;[Ljava/lang/String;)V

    goto :goto_0

    .line 2554
    :cond_2
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "in addPermissions() is ChinaROM("

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2555
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    iget-object v1, p0, Lo/ale;->e:[Ljava/lang/String;

    invoke-direct {p0, v0, v1}, Lo/ale;->c(Landroid/content/Context;[Ljava/lang/String;)V

    goto :goto_0

    .line 2559
    :cond_3
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "in addPermissions() is not SystemApp"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2560
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    invoke-static {v0}, Lo/dbf;->v(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 2561
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    iget-object v1, p0, Lo/ale;->c:[Ljava/lang/String;

    invoke-direct {p0, v0, v1}, Lo/ale;->c(Landroid/content/Context;[Ljava/lang/String;)V

    goto :goto_0

    .line 2563
    :cond_4
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    iget-object v1, p0, Lo/ale;->d:[Ljava/lang/String;

    invoke-direct {p0, v0, v1}, Lo/ale;->c(Landroid/content/Context;[Ljava/lang/String;)V

    .line 2568
    :goto_0
    return-void
.end method

.method public x()V
    .locals 2

    .line 2464
    const-string v0, "TimeEat_MainInteractors"

    const-string v1, "Enter initPluginDeviceAdapter"

    invoke-static {v0, v1}, Lo/dbf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 2465
    invoke-static {}, Lo/aca;->e()Lo/aca;

    move-result-object v0

    invoke-static {}, Lo/cwd;->b()Lo/cwd;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/aca;->setAdapter(Lo/eab;)V

    .line 2466
    invoke-static {}, Lo/aca;->e()Lo/aca;

    move-result-object v0

    iget-object v1, p0, Lo/ale;->o:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lo/aca;->init(Landroid/content/Context;)V

    .line 2467
    const-string v0, "TimeEat_MainInteractors"

    const-string v1, "Leave initPluginDeviceAdapter"

    invoke-static {v0, v1}, Lo/dbf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 2468
    return-void
.end method

.method public y()V
    .locals 2

    .line 2422
    const-string v0, "TimeEat_MainInteractors"

    const-string v1, "Enter initHWSmartInteract"

    invoke-static {v0, v1}, Lo/dbf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 2423
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    invoke-static {v0}, Lo/dlf;->d(Landroid/content/Context;)Lo/dlf;

    move-result-object v0

    invoke-virtual {v0}, Lo/dlf;->c()V

    .line 2424
    const-string v0, "TimeEat_MainInteractors"

    const-string v1, "Leave initHWSmartInteract"

    invoke-static {v0, v1}, Lo/dbf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 2425
    return-void
.end method

.method public z()V
    .locals 4

    .line 2395
    const-string v0, "TimeEat_MainInteractors"

    const-string v1, "Enter initSoicalAdapter"

    invoke-static {v0, v1}, Lo/dbf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 2396
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    invoke-static {v0}, Lo/vu;->a(Landroid/content/Context;)Lo/vu;

    move-result-object v0

    iget-object v1, p0, Lo/ale;->o:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lo/vu;->b(Landroid/content/Context;)V

    .line 2397
    new-instance v2, Lo/cwg;

    invoke-direct {v2}, Lo/cwg;-><init>()V

    .line 2398
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    invoke-static {v0}, Lo/vu;->a(Landroid/content/Context;)Lo/vu;

    move-result-object v3

    .line 2399
    invoke-virtual {v3, v2}, Lo/vu;->setAdapter(Lo/eab;)V

    .line 2400
    iget-object v0, p0, Lo/ale;->o:Landroid/content/Context;

    invoke-virtual {v3, v0}, Lo/vu;->init(Landroid/content/Context;)V

    .line 2401
    const-string v0, "TimeEat_MainInteractors"

    const-string v1, "Leave initSoicalAdapter"

    invoke-static {v0, v1}, Lo/dbf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 2402
    return-void
.end method
