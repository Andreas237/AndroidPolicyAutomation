.class public Lcom/huawei/pluginsocialshare/activity/EditShareActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"

# interfaces
.implements Lo/ebp;


# static fields
.field private static final J:[Ljava/lang/String;

.field private static final N:[Ljava/lang/String;


# instance fields
.field private A:Ljava/lang/String;

.field private B:I

.field private C:I

.field private D:I

.field private E:I

.field private F:I

.field private G:I

.field private H:Landroid/graphics/Rect;

.field private I:I

.field private K:Landroid/graphics/Rect;

.field private L:Landroid/widget/LinearLayout;

.field private M:Landroid/view/View;

.field private O:Lo/ems;

.field private R:Lo/ems$d;

.field private a:Lo/ebj;

.field private b:Lo/ebj;

.field private c:Lo/ebj;

.field private d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Landroid/graphics/Bitmap;>;"
        }
    .end annotation
.end field

.field private e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field private f:Landroid/widget/RelativeLayout;

.field private g:Landroid/widget/ImageView;

.field private h:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Landroid/graphics/Bitmap;>;"
        }
    .end annotation
.end field

.field private i:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Landroid/graphics/Bitmap;>;"
        }
    .end annotation
.end field

.field private j:I

.field private k:Lo/ebr;

.field private l:Landroid/widget/ImageView;

.field private m:Landroid/widget/TextView;

.field private n:Landroid/widget/TextView;

.field private o:Landroid/widget/TextView;

.field private p:Landroid/widget/ImageView;

.field private q:Landroid/content/Context;

.field private r:Lcom/huawei/up/model/UserInfomation;

.field private s:Landroid/widget/FrameLayout;

.field private t:Lo/ebv;

.field private u:Landroid/widget/ScrollView;

.field private v:Lo/emr;

.field private w:Lo/egw;

.field private x:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/dam;>;"
        }
    .end annotation
.end field

.field private y:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lo/dam;>;"
        }
    .end annotation
.end field

.field private z:Lo/dau;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 114
    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "android.permission.CAMERA"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "android.permission.READ_EXTERNAL_STORAGE"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, "android.permission.WRITE_EXTERNAL_STORAGE"

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sput-object v0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->N:[Ljava/lang/String;

    .line 119
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "android.permission.READ_EXTERNAL_STORAGE"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "android.permission.WRITE_EXTERNAL_STORAGE"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sput-object v0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->J:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 5

    .line 75
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    .line 79
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->e:Ljava/util/List;

    .line 80
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->d:Ljava/util/List;

    .line 81
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->h:Ljava/util/List;

    .line 82
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->i:Ljava/util/List;

    .line 99
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->x:Ljava/util/List;

    .line 100
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->D:I

    .line 101
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->C:I

    .line 102
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->j:I

    .line 103
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->B:I

    .line 105
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->I:I

    .line 106
    const/4 v0, 0x1

    iput v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->E:I

    .line 107
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->G:I

    .line 108
    const/4 v0, 0x1

    iput v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->F:I

    .line 109
    new-instance v0, Landroid/graphics/Rect;

    const/4 v1, 0x0

    const/16 v2, 0x2d0

    const/16 v3, 0x438

    const/16 v4, 0x438

    invoke-direct {v0, v1, v2, v3, v4}, Landroid/graphics/Rect;-><init>(IIII)V

    iput-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->H:Landroid/graphics/Rect;

    .line 110
    new-instance v0, Landroid/graphics/Rect;

    const/16 v1, 0x30

    const/16 v2, 0x30

    const/16 v3, 0x408

    const/16 v4, 0xa8

    invoke-direct {v0, v1, v2, v3, v4}, Landroid/graphics/Rect;-><init>(IIII)V

    iput-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->K:Landroid/graphics/Rect;

    .line 124
    new-instance v0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity$3;

    invoke-direct {v0, p0}, Lcom/huawei/pluginsocialshare/activity/EditShareActivity$3;-><init>(Lcom/huawei/pluginsocialshare/activity/EditShareActivity;)V

    iput-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->R:Lo/ems$d;

    return-void
.end method

.method static synthetic a(Lcom/huawei/pluginsocialshare/activity/EditShareActivity;)Landroid/graphics/Bitmap;
    .locals 1

    .line 75
    invoke-direct {p0}, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->f()Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0
.end method

.method private a()V
    .locals 6

    .line 149
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->z:Lo/dau;

    invoke-virtual {v0}, Lo/dau;->b()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->e:Ljava/util/List;

    .line 150
    const/4 v4, 0x0

    :goto_0
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v4, v0, :cond_0

    .line 151
    const-string v0, "EditShareActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "path=="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->e:Ljava/util/List;

    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 152
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->d:Ljava/util/List;

    iget-object v1, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->q:Landroid/content/Context;

    iget-object v2, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->e:Ljava/util/List;

    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-static {v1, v2}, Lo/ecc;->d(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 150
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 154
    :cond_0
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->d:Ljava/util/List;

    iget-object v1, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->q:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/pluginsocialshare/R$mipmap;->hw_health_edit_share_photo_pic:I

    invoke-static {v1, v2}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    move-result-object v1

    const/4 v2, 0x0

    invoke-interface {v0, v2, v1}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 155
    const-string v0, "EditShareActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "backGroundList size = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->e:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 157
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->z:Lo/dau;

    invoke-virtual {v0}, Lo/dau;->d()Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->y:Ljava/util/ArrayList;

    .line 158
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->y:Ljava/util/ArrayList;

    if-eqz v0, :cond_1

    .line 159
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->y:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/dam;

    .line 160
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->h:Ljava/util/List;

    invoke-virtual {v5}, Lo/dam;->e()Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 161
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->x:Ljava/util/List;

    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 162
    const-string v0, "EditShareActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "dataMarkList size = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->h:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 163
    const-string v0, "EditShareActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "dataMarkViewList size = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->x:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 164
    goto :goto_1

    .line 166
    :cond_1
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->z:Lo/dau;

    invoke-virtual {v0}, Lo/dau;->a()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->A:Ljava/lang/String;

    .line 167
    return-void
.end method

.method private a(Landroid/app/FragmentTransaction;)V
    .locals 1

    .line 450
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->c:Lo/ebj;

    if-eqz v0, :cond_0

    .line 451
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->c:Lo/ebj;

    invoke-virtual {p1, v0}, Landroid/app/FragmentTransaction;->hide(Landroid/app/Fragment;)Landroid/app/FragmentTransaction;

    .line 453
    :cond_0
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->b:Lo/ebj;

    if-eqz v0, :cond_1

    .line 454
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->b:Lo/ebj;

    invoke-virtual {p1, v0}, Landroid/app/FragmentTransaction;->hide(Landroid/app/Fragment;)Landroid/app/FragmentTransaction;

    .line 456
    :cond_1
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->a:Lo/ebj;

    if-eqz v0, :cond_2

    .line 457
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->a:Lo/ebj;

    invoke-virtual {p1, v0}, Landroid/app/FragmentTransaction;->hide(Landroid/app/Fragment;)Landroid/app/FragmentTransaction;

    .line 459
    :cond_2
    return-void
.end method

.method private a(Landroid/content/Context;[Ljava/lang/String;)V
    .locals 6

    .line 588
    const-string v0, "EditShareActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkCameraPermission"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 589
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-ge v0, v1, :cond_0

    .line 590
    invoke-direct {p0}, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->k()V

    .line 591
    return-void

    .line 593
    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_7

    .line 594
    invoke-static {p1, p2}, Lo/dbe;->c(Landroid/content/Context;[Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_6

    .line 595
    const-string v0, "EditShareActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkCameraPermission isnotHasPermissions"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 596
    const-string v0, "android.permission.WRITE_EXTERNAL_STORAGE"

    invoke-static {p1, v0}, Lo/dbf;->l(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    move-object v0, p1

    check-cast v0, Landroid/app/Activity;

    const-string v1, "android.permission.WRITE_EXTERNAL_STORAGE"

    .line 597
    invoke-virtual {v0, v1}, Landroid/app/Activity;->shouldShowRequestPermissionRationale(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_1
    const/4 v4, 0x1

    goto :goto_0

    :cond_2
    const/4 v4, 0x0

    .line 598
    :goto_0
    const-string v0, "android.permission.CAMERA"

    invoke-static {p1, v0}, Lo/dbf;->l(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_3

    move-object v0, p1

    check-cast v0, Landroid/app/Activity;

    const-string v1, "android.permission.CAMERA"

    .line 599
    invoke-virtual {v0, v1}, Landroid/app/Activity;->shouldShowRequestPermissionRationale(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    :cond_3
    const/4 v5, 0x1

    goto :goto_1

    :cond_4
    const/4 v5, 0x0

    .line 600
    :goto_1
    const-string v0, "EditShareActivity"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "storagePermission="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, "cameraPermission="

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 601
    if-nez v4, :cond_5

    if-nez v5, :cond_5

    .line 602
    sget v0, Lcom/huawei/pluginsocialshare/R$string;->IDS_hwh_home_healthshop_permission_str:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lo/ene;->c(Landroid/content/Context;Ljava/lang/String;)V

    .line 603
    return-void

    .line 605
    :cond_5
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "android.permission.CAMERA"

    invoke-static {v0, v1}, Lo/dbf;->m(Landroid/content/Context;Ljava/lang/String;)V

    .line 607
    const/4 v0, 0x2

    invoke-virtual {p0, p2, v0}, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->requestPermissions([Ljava/lang/String;I)V

    .line 608
    goto :goto_2

    .line 609
    :cond_6
    const-string v0, "EditShareActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkCameraPermission takePhoto"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 610
    invoke-direct {p0}, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->k()V

    .line 613
    :cond_7
    :goto_2
    return-void
.end method

.method static synthetic b(Lcom/huawei/pluginsocialshare/activity/EditShareActivity;)Landroid/content/Context;
    .locals 1

    .line 75
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->q:Landroid/content/Context;

    return-object v0
.end method

.method private b(I)V
    .locals 4

    .line 421
    if-nez p1, :cond_0

    .line 422
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->O:Lo/ems;

    sget v1, Lcom/huawei/pluginsocialshare/R$mipmap;->hw_health_edit_share_pic_sel:I

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Lo/ems;->setIcon(II)V

    .line 423
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->O:Lo/ems;

    sget v1, Lcom/huawei/pluginsocialshare/R$mipmap;->hw_health_edit_share_data_mark_nor:I

    const/4 v2, 0x1

    invoke-virtual {v0, v2, v1}, Lo/ems;->setIconAlpha(II)V

    .line 424
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->O:Lo/ems;

    sget v1, Lcom/huawei/pluginsocialshare/R$mipmap;->hw_health_edit_share_warter_mark_nor:I

    const/4 v2, 0x2

    invoke-virtual {v0, v2, v1}, Lo/ems;->setIconAlpha(II)V

    .line 426
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->O:Lo/ems;

    iget-object v1, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->q:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/pluginsocialshare/R$string;->IDS_hwh_edit_share_fragemt_text_pic:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-virtual {v0, v2, v1, v3}, Lo/ems;->setIconTitleColor(ILjava/lang/CharSequence;Z)V

    .line 427
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->O:Lo/ems;

    iget-object v1, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->q:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/pluginsocialshare/R$string;->IDS_hwh_edit_share_fragemt_text_data_mark:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v1, v3}, Lo/ems;->setIconTitleColor(ILjava/lang/CharSequence;Z)V

    .line 428
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->O:Lo/ems;

    iget-object v1, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->q:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/pluginsocialshare/R$string;->IDS_hwh_edit_share_fragemt_text_pic_mark:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v1, v3}, Lo/ems;->setIconTitleColor(ILjava/lang/CharSequence;Z)V

    goto/16 :goto_0

    .line 429
    :cond_0
    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    .line 430
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->O:Lo/ems;

    sget v1, Lcom/huawei/pluginsocialshare/R$mipmap;->hw_health_edit_share_pic_nor:I

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Lo/ems;->setIconAlpha(II)V

    .line 431
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->O:Lo/ems;

    sget v1, Lcom/huawei/pluginsocialshare/R$mipmap;->hw_health_edit_share_data_mark_sel:I

    const/4 v2, 0x1

    invoke-virtual {v0, v2, v1}, Lo/ems;->setIcon(II)V

    .line 432
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->O:Lo/ems;

    sget v1, Lcom/huawei/pluginsocialshare/R$mipmap;->hw_health_edit_share_warter_mark_nor:I

    const/4 v2, 0x2

    invoke-virtual {v0, v2, v1}, Lo/ems;->setIconAlpha(II)V

    .line 434
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->O:Lo/ems;

    iget-object v1, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->q:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/pluginsocialshare/R$string;->IDS_hwh_edit_share_fragemt_text_pic:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v1, v3}, Lo/ems;->setIconTitleColor(ILjava/lang/CharSequence;Z)V

    .line 435
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->O:Lo/ems;

    iget-object v1, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->q:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/pluginsocialshare/R$string;->IDS_hwh_edit_share_fragemt_text_data_mark:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    const/4 v3, 0x1

    invoke-virtual {v0, v2, v1, v3}, Lo/ems;->setIconTitleColor(ILjava/lang/CharSequence;Z)V

    .line 436
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->O:Lo/ems;

    iget-object v1, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->q:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/pluginsocialshare/R$string;->IDS_hwh_edit_share_fragemt_text_pic_mark:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v1, v3}, Lo/ems;->setIconTitleColor(ILjava/lang/CharSequence;Z)V

    goto :goto_0

    .line 437
    :cond_1
    const/4 v0, 0x2

    if-ne p1, v0, :cond_2

    .line 438
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->O:Lo/ems;

    sget v1, Lcom/huawei/pluginsocialshare/R$mipmap;->hw_health_edit_share_pic_nor:I

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Lo/ems;->setIconAlpha(II)V

    .line 439
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->O:Lo/ems;

    sget v1, Lcom/huawei/pluginsocialshare/R$mipmap;->hw_health_edit_share_data_mark_nor:I

    const/4 v2, 0x1

    invoke-virtual {v0, v2, v1}, Lo/ems;->setIconAlpha(II)V

    .line 440
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->O:Lo/ems;

    sget v1, Lcom/huawei/pluginsocialshare/R$mipmap;->hw_health_edit_share_warter_mark_sel:I

    const/4 v2, 0x2

    invoke-virtual {v0, v2, v1}, Lo/ems;->setIcon(II)V

    .line 442
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->O:Lo/ems;

    iget-object v1, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->q:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/pluginsocialshare/R$string;->IDS_hwh_edit_share_fragemt_text_pic:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v1, v3}, Lo/ems;->setIconTitleColor(ILjava/lang/CharSequence;Z)V

    .line 443
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->O:Lo/ems;

    iget-object v1, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->q:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/pluginsocialshare/R$string;->IDS_hwh_edit_share_fragemt_text_data_mark:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v1, v3}, Lo/ems;->setIconTitleColor(ILjava/lang/CharSequence;Z)V

    .line 444
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->O:Lo/ems;

    iget-object v1, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->q:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/pluginsocialshare/R$string;->IDS_hwh_edit_share_fragemt_text_pic_mark:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x2

    const/4 v3, 0x1

    invoke-virtual {v0, v2, v1, v3}, Lo/ems;->setIconTitleColor(ILjava/lang/CharSequence;Z)V

    .line 447
    :cond_2
    :goto_0
    return-void
.end method

.method static synthetic b()[Ljava/lang/String;
    .locals 1

    .line 75
    sget-object v0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->J:[Ljava/lang/String;

    return-object v0
.end method

.method public static c(Landroid/content/Context;)I
    .locals 10

    .line 777
    const/4 v4, 0x0

    .line 778
    const/4 v5, 0x0

    .line 779
    const/4 v6, 0x0

    .line 780
    const/4 v7, 0x0

    .line 781
    const/4 v8, 0x0

    .line 784
    const-string v0, "com.android.internal.R$dimen"

    :try_start_0
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v4

    .line 785
    invoke-virtual {v4}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v5

    .line 786
    const-string v0, "status_bar_height"

    invoke-virtual {v4, v0}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v6

    .line 787
    invoke-virtual {v6, v5}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v7

    .line 788
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, v7}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    move-result v0

    move v8, v0

    .line 789
    return v8

    .line 791
    :catch_0
    move-exception v9

    .line 793
    const-string v0, "EditShareActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getStatusBarHeight RuntimeException"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v9, v1, v2

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 798
    goto :goto_0

    .line 795
    :catch_1
    move-exception v9

    .line 797
    const-string v0, "EditShareActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getStatusBarHeight Exception"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v9, v1, v2

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 799
    :goto_0
    return v8
.end method

.method static synthetic c(Lcom/huawei/pluginsocialshare/activity/EditShareActivity;)Lo/dau;
    .locals 1

    .line 75
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->z:Lo/dau;

    return-object v0
.end method

.method private c()V
    .locals 5

    .line 258
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->i:Ljava/util/List;

    iget-object v1, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->q:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/pluginsocialshare/R$mipmap;->hw_health_edit_share_small_watermark1:I

    invoke-static {v1, v2}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 260
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->i:Ljava/util/List;

    iget-object v1, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->q:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/pluginsocialshare/R$mipmap;->hw_health_edit_share_small_watermark3:I

    invoke-static {v1, v2}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 261
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->i:Ljava/util/List;

    iget-object v1, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->q:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/pluginsocialshare/R$mipmap;->hw_health_edit_share_small_watermark4:I

    invoke-static {v1, v2}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 262
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->i:Ljava/util/List;

    iget-object v1, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->q:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/pluginsocialshare/R$mipmap;->hw_health_edit_share_small_watermark5:I

    invoke-static {v1, v2}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 264
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->i:Ljava/util/List;

    iget-object v1, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->q:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/pluginsocialshare/R$mipmap;->hw_health_edit_share_small_watermark9:I

    invoke-static {v1, v2}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 265
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->i:Ljava/util/List;

    iget-object v1, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->q:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/pluginsocialshare/R$mipmap;->hw_health_edit_share_small_watermark10:I

    invoke-static {v1, v2}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 266
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->i:Ljava/util/List;

    iget-object v1, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->q:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/pluginsocialshare/R$mipmap;->hw_health_edit_share_small_watermark11:I

    invoke-static {v1, v2}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 267
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->i:Ljava/util/List;

    iget-object v1, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->q:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/pluginsocialshare/R$mipmap;->hw_health_edit_share_small_watermark12:I

    invoke-static {v1, v2}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 268
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_0

    .line 269
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->d:Ljava/util/List;

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Bitmap;

    iget-object v1, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->H:Landroid/graphics/Rect;

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lo/ecc;->c(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Lhuawei/android/hwcolorpicker/HwColorPicker$ClientType;)I

    move-result v0

    iput v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->C:I

    .line 270
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->d:Ljava/util/List;

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Bitmap;

    iget-object v1, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->H:Landroid/graphics/Rect;

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lo/ecc;->a(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Lhuawei/android/hwcolorpicker/HwColorPicker$ClientType;)I

    move-result v0

    iput v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->j:I

    .line 271
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->d:Ljava/util/List;

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Bitmap;

    iget-object v1, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->K:Landroid/graphics/Rect;

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lo/ecc;->c(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Lhuawei/android/hwcolorpicker/HwColorPicker$ClientType;)I

    move-result v0

    iput v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->B:I

    .line 272
    iget v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->B:I

    invoke-direct {p0, v0}, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->c(I)V

    .line 273
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->k:Lo/ebr;

    iget-object v1, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->d:Ljava/util/List;

    const/4 v2, 0x1

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/graphics/Bitmap;

    invoke-static {v1}, Lo/ecc;->e(Landroid/graphics/Bitmap;)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/ebr;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 275
    :cond_0
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->x:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_2

    .line 276
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->s:Landroid/widget/FrameLayout;

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->removeAllViews()V

    .line 277
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->s:Landroid/widget/FrameLayout;

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->removeAllViewsInLayout()V

    .line 278
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->x:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/dam;

    iget v1, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->C:I

    iget v2, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->j:I

    invoke-virtual {v0, v1, v2}, Lo/dam;->d(II)V

    .line 279
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->x:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/dam;

    invoke-virtual {v0}, Lo/dam;->c()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v3

    .line 280
    instance-of v0, v3, Landroid/view/ViewGroup;

    if-eqz v0, :cond_1

    .line 281
    move-object v4, v3

    check-cast v4, Landroid/view/ViewGroup;

    .line 282
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->x:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/dam;

    invoke-virtual {v0}, Lo/dam;->c()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v4, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 284
    :cond_1
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->s:Landroid/widget/FrameLayout;

    iget-object v1, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->x:Ljava/util/List;

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/dam;

    invoke-virtual {v1}, Lo/dam;->c()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    .line 287
    :cond_2
    invoke-static {}, Lo/ebk;->a()Lcom/huawei/up/model/UserInfomation;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->r:Lcom/huawei/up/model/UserInfomation;

    .line 288
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->r:Lcom/huawei/up/model/UserInfomation;

    if-nez v0, :cond_3

    .line 289
    return-void

    .line 291
    :cond_3
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->r:Lcom/huawei/up/model/UserInfomation;

    invoke-virtual {v0}, Lcom/huawei/up/model/UserInfomation;->getPicPath()Ljava/lang/String;

    move-result-object v3

    .line 292
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->o:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->r:Lcom/huawei/up/model/UserInfomation;

    invoke-virtual {v1}, Lcom/huawei/up/model/UserInfomation;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 293
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->A:Ljava/lang/String;

    if-eqz v0, :cond_4

    const-string v0, ""

    iget-object v1, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->A:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 294
    :cond_4
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->m:Landroid/widget/TextView;

    new-instance v1, Ljava/util/Date;

    invoke-direct {v1}, Ljava/util/Date;-><init>()V

    const/16 v2, 0x14

    invoke-static {v1, v2}, Lo/cxh;->d(Ljava/util/Date;I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 296
    :cond_5
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->m:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->A:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 298
    :goto_0
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_6

    .line 299
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->q:Landroid/content/Context;

    invoke-static {v0, v3}, Lo/dbk;->d(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v4

    .line 300
    if-eqz v4, :cond_6

    .line 301
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->p:Landroid/widget/ImageView;

    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 304
    :cond_6
    invoke-direct {p0}, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->h()V

    .line 306
    return-void
.end method

.method private c(I)V
    .locals 1

    .line 629
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->o:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 630
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->m:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 631
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->n:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 632
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->l:Landroid/widget/ImageView;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setColorFilter(I)V

    .line 633
    return-void
.end method

.method private c(Landroid/content/Context;[Ljava/lang/String;)V
    .locals 5

    .line 559
    const-string v0, "EditShareActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkGalleryPermission"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 560
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-ge v0, v1, :cond_0

    .line 561
    invoke-direct {p0}, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->i()V

    .line 562
    return-void

    .line 564
    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_5

    .line 565
    invoke-static {p1, p2}, Lo/dbe;->c(Landroid/content/Context;[Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 566
    const-string v0, "EditShareActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkGalleryPermission isnotHasPermissions"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 567
    const-string v0, "android.permission.WRITE_EXTERNAL_STORAGE"

    invoke-static {p1, v0}, Lo/dbf;->l(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    move-object v0, p1

    check-cast v0, Landroid/app/Activity;

    const-string v1, "android.permission.WRITE_EXTERNAL_STORAGE"

    .line 568
    invoke-virtual {v0, v1}, Landroid/app/Activity;->shouldShowRequestPermissionRationale(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_1
    const/4 v4, 0x1

    goto :goto_0

    :cond_2
    const/4 v4, 0x0

    .line 569
    :goto_0
    if-nez v4, :cond_3

    .line 570
    const/4 v0, 0x0

    invoke-static {p1, v0}, Lo/ene;->b(Landroid/content/Context;Z)V

    .line 571
    return-void

    .line 574
    :cond_3
    const/4 v0, 0x1

    invoke-virtual {p0, p2, v0}, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->requestPermissions([Ljava/lang/String;I)V

    .line 575
    goto :goto_1

    .line 576
    :cond_4
    const-string v0, "EditShareActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkGalleryPermission choosePic"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 577
    invoke-direct {p0}, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->i()V

    .line 580
    :cond_5
    :goto_1
    return-void
.end method

.method private c(Landroid/view/View;)V
    .locals 3

    .line 512
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->s:Landroid/widget/FrameLayout;

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->removeAllViews()V

    .line 513
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->s:Landroid/widget/FrameLayout;

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->removeAllViewsInLayout()V

    .line 514
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    .line 515
    instance-of v0, v1, Landroid/view/ViewGroup;

    if-eqz v0, :cond_0

    .line 516
    move-object v2, v1

    check-cast v2, Landroid/view/ViewGroup;

    .line 517
    invoke-virtual {v2, p1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 519
    :cond_0
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->s:Landroid/widget/FrameLayout;

    invoke-virtual {v0, p1}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    .line 520
    return-void
.end method

.method private d(I)I
    .locals 2

    .line 368
    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 371
    :pswitch_0
    sget v1, Lcom/huawei/pluginsocialshare/R$drawable;->track_share_short_ic_hshouhuan:I

    .line 372
    goto :goto_1

    .line 374
    :pswitch_1
    sget v1, Lcom/huawei/pluginsocialshare/R$drawable;->track_share_short_ic_ertongwatch:I

    .line 375
    goto :goto_1

    .line 377
    :pswitch_2
    sget v1, Lcom/huawei/pluginsocialshare/R$drawable;->track_share_short_ic_erji:I

    .line 378
    goto :goto_1

    .line 380
    :goto_0
    const/4 v1, -0x1

    .line 383
    :goto_1
    return v1

    nop

    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_0
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method static synthetic d(Lcom/huawei/pluginsocialshare/activity/EditShareActivity;)Lo/ebr;
    .locals 1

    .line 75
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->k:Lo/ebr;

    return-object v0
.end method

.method private d()V
    .locals 9

    .line 170
    sget v0, Lcom/huawei/pluginsocialshare/R$id;->hw_health_share_log:I

    invoke-virtual {p0, v0}, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->f:Landroid/widget/RelativeLayout;

    .line 171
    sget v0, Lcom/huawei/pluginsocialshare/R$id;->hw_health_edit_share_head_portrait:I

    invoke-virtual {p0, v0}, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->p:Landroid/widget/ImageView;

    .line 172
    sget v0, Lcom/huawei/pluginsocialshare/R$id;->hw_health_edit_share_nick_name:I

    invoke-virtual {p0, v0}, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->o:Landroid/widget/TextView;

    .line 173
    sget v0, Lcom/huawei/pluginsocialshare/R$id;->hw_health_edit_share_date:I

    invoke-virtual {p0, v0}, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->m:Landroid/widget/TextView;

    .line 174
    sget v0, Lcom/huawei/pluginsocialshare/R$id;->hw_health_edit_share_titlebar:I

    invoke-virtual {p0, v0}, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emr;

    iput-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->v:Lo/emr;

    .line 175
    sget v0, Lcom/huawei/pluginsocialshare/R$id;->hw_health_edit_share_text:I

    invoke-virtual {p0, v0}, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->n:Landroid/widget/TextView;

    .line 176
    sget v0, Lcom/huawei/pluginsocialshare/R$id;->hw_health_edit_share_from:I

    invoke-virtual {p0, v0}, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->l:Landroid/widget/ImageView;

    .line 178
    sget v0, Lcom/huawei/pluginsocialshare/R$id;->statusbar_panel:I

    invoke-virtual {p0, v0}, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->M:Landroid/view/View;

    .line 179
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->q:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->c(Landroid/content/Context;)I

    move-result v5

    .line 180
    new-instance v6, Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v0, -0x1

    invoke-direct {v6, v0, v5}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 181
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->M:Landroid/view/View;

    invoke-virtual {v0, v6}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 182
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->M:Landroid/view/View;

    invoke-virtual {p0}, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/pluginsocialshare/R$color;->emui_color_gray_1:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 185
    sget v0, Lcom/huawei/pluginsocialshare/R$id;->hw_health_edit_share_show:I

    invoke-virtual {p0, v0}, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/ebr;

    iput-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->k:Lo/ebr;

    .line 186
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->q:Landroid/content/Context;

    invoke-static {v0}, Lo/ene;->t(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 187
    new-instance v7, Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v0, -0x1

    const/4 v1, -0x1

    invoke-direct {v7, v0, v1}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 188
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->q:Landroid/content/Context;

    const/high16 v1, 0x433a0000    # 186.0f

    invoke-static {v0, v1}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v0

    iget-object v1, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->q:Landroid/content/Context;

    const/high16 v2, 0x41e00000    # 28.0f

    invoke-static {v1, v2}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v1

    iget-object v2, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->q:Landroid/content/Context;

    const/high16 v3, 0x433a0000    # 186.0f

    invoke-static {v2, v3}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v2

    iget-object v3, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->q:Landroid/content/Context;

    const/high16 v4, 0x43260000    # 166.0f

    invoke-static {v3, v4}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v3

    invoke-virtual {v7, v0, v1, v2, v3}, Landroid/widget/RelativeLayout$LayoutParams;->setMargins(IIII)V

    .line 189
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->k:Lo/ebr;

    invoke-virtual {v0, v7}, Lo/ebr;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 190
    goto :goto_0

    .line 191
    :cond_0
    new-instance v7, Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v0, -0x1

    const/4 v1, -0x2

    invoke-direct {v7, v0, v1}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 192
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->k:Lo/ebr;

    invoke-virtual {v0, v7}, Lo/ebr;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 195
    :goto_0
    sget v0, Lcom/huawei/pluginsocialshare/R$id;->hw_health_edit_share_activity_show:I

    invoke-virtual {p0, v0}, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    iput-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->s:Landroid/widget/FrameLayout;

    .line 196
    sget v0, Lcom/huawei/pluginsocialshare/R$id;->hw_health_edit_share_scrollview:I

    invoke-virtual {p0, v0}, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ScrollView;

    iput-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->u:Landroid/widget/ScrollView;

    .line 197
    sget v0, Lcom/huawei/pluginsocialshare/R$id;->water_mack_imgview:I

    invoke-virtual {p0, v0}, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->g:Landroid/widget/ImageView;

    .line 198
    invoke-virtual {p0}, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v7, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 199
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->g:Landroid/widget/ImageView;

    new-instance v1, Lo/ebu;

    iget-object v2, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->u:Landroid/widget/ScrollView;

    invoke-direct {v1, v2, v7, v7}, Lo/ebu;-><init>(Landroid/widget/ScrollView;II)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 200
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->v:Lo/emr;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/emr;->setLeftButtonVisibility(I)V

    .line 201
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->v:Lo/emr;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/emr;->setRightButtonVisibility(I)V

    .line 202
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->v:Lo/emr;

    sget v1, Lcom/huawei/pluginsocialshare/R$drawable;->ic_health_navbar_close_black:I

    invoke-static {p0, v1}, Landroid/support/v4/content/ContextCompat;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setLeftButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 203
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->v:Lo/emr;

    sget v1, Lcom/huawei/pluginsocialshare/R$drawable;->ic_health_nav_share_black:I

    invoke-static {p0, v1}, Landroid/support/v4/content/ContextCompat;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setRightButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 204
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->v:Lo/emr;

    new-instance v1, Lcom/huawei/pluginsocialshare/activity/EditShareActivity$5;

    invoke-direct {v1, p0}, Lcom/huawei/pluginsocialshare/activity/EditShareActivity$5;-><init>(Lcom/huawei/pluginsocialshare/activity/EditShareActivity;)V

    invoke-virtual {v0, v1}, Lo/emr;->setLeftButtonOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 210
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->v:Lo/emr;

    new-instance v1, Lcom/huawei/pluginsocialshare/activity/EditShareActivity$4;

    invoke-direct {v1, p0}, Lcom/huawei/pluginsocialshare/activity/EditShareActivity$4;-><init>(Lcom/huawei/pluginsocialshare/activity/EditShareActivity;)V

    invoke-virtual {v0, v1}, Lo/emr;->setRightButtonOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 241
    sget v0, Lcom/huawei/pluginsocialshare/R$id;->hw_health_edit_share_from_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->L:Landroid/widget/LinearLayout;

    .line 242
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->L:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 244
    sget v0, Lcom/huawei/pluginsocialshare/R$id;->edit_share_list_toolbar:I

    invoke-virtual {p0, v0}, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/ems;

    iput-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->O:Lo/ems;

    .line 245
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->q:Landroid/content/Context;

    sget v1, Lcom/huawei/pluginsocialshare/R$layout;->hw_toolbar_tab_bottomview:I

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v8

    .line 246
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->O:Lo/ems;

    invoke-virtual {v0, v8}, Lo/ems;->d(Landroid/view/View;)V

    .line 247
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->O:Lo/ems;

    iget-object v1, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->R:Lo/ems$d;

    invoke-virtual {v0, v1}, Lo/ems;->setOnSingleTapListener(Lo/ems$d;)V

    .line 248
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->e(I)V

    .line 249
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->O:Lo/ems;

    iget-object v1, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->q:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/pluginsocialshare/R$string;->IDS_hwh_edit_share_fragemt_text_pic:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Lo/ems;->setIconTitle(ILjava/lang/CharSequence;)V

    .line 250
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->O:Lo/ems;

    iget-object v1, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->q:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/pluginsocialshare/R$string;->IDS_hwh_edit_share_fragemt_text_data_mark:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v0, v2, v1}, Lo/ems;->setIconTitle(ILjava/lang/CharSequence;)V

    .line 251
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->O:Lo/ems;

    iget-object v1, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->q:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/pluginsocialshare/R$string;->IDS_hwh_edit_share_fragemt_text_pic_mark:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x2

    invoke-virtual {v0, v2, v1}, Lo/ems;->setIconTitle(ILjava/lang/CharSequence;)V

    .line 253
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->O:Lo/ems;

    invoke-virtual {v0, p0}, Lo/ems;->a(Landroid/app/Activity;)V

    .line 254
    return-void
.end method

.method static synthetic d(Lcom/huawei/pluginsocialshare/activity/EditShareActivity;Landroid/content/Context;[Ljava/lang/String;)V
    .locals 0

    .line 75
    invoke-direct {p0, p1, p2}, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->a(Landroid/content/Context;[Ljava/lang/String;)V

    return-void
.end method

.method private e(I)V
    .locals 6

    .line 391
    invoke-virtual {p0}, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->getFragmentManager()Landroid/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/FragmentManager;->beginTransaction()Landroid/app/FragmentTransaction;

    move-result-object v5

    .line 392
    invoke-direct {p0, v5}, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->a(Landroid/app/FragmentTransaction;)V

    .line 393
    invoke-direct {p0, p1}, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->b(I)V

    .line 394
    if-nez p1, :cond_1

    .line 395
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->c:Lo/ebj;

    if-nez v0, :cond_0

    .line 396
    const-string v0, "EditShareActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "backGroundList size2 = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->e:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 397
    new-instance v0, Lo/ebj;

    iget-object v1, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->d:Ljava/util/List;

    iget-object v2, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->q:Landroid/content/Context;

    iget-object v3, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->x:Ljava/util/List;

    const/4 v4, 0x0

    invoke-direct {v0, v1, v4, v2, v3}, Lo/ebj;-><init>(Ljava/util/List;ILandroid/content/Context;Ljava/util/List;)V

    iput-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->c:Lo/ebj;

    .line 398
    sget v0, Lcom/huawei/pluginsocialshare/R$id;->fragment_container:I

    iget-object v1, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->c:Lo/ebj;

    invoke-virtual {v5, v0, v1}, Landroid/app/FragmentTransaction;->add(ILandroid/app/Fragment;)Landroid/app/FragmentTransaction;

    goto/16 :goto_0

    .line 400
    :cond_0
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->c:Lo/ebj;

    invoke-virtual {v5, v0}, Landroid/app/FragmentTransaction;->show(Landroid/app/Fragment;)Landroid/app/FragmentTransaction;

    goto :goto_0

    .line 402
    :cond_1
    const/4 v0, 0x1

    if-ne p1, v0, :cond_3

    .line 403
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->b:Lo/ebj;

    if-nez v0, :cond_2

    .line 404
    new-instance v0, Lo/ebj;

    iget-object v1, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->h:Ljava/util/List;

    iget-object v2, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->q:Landroid/content/Context;

    iget-object v3, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->x:Ljava/util/List;

    const/4 v4, 0x1

    invoke-direct {v0, v1, v4, v2, v3}, Lo/ebj;-><init>(Ljava/util/List;ILandroid/content/Context;Ljava/util/List;)V

    iput-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->b:Lo/ebj;

    .line 405
    sget v0, Lcom/huawei/pluginsocialshare/R$id;->fragment_container:I

    iget-object v1, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->b:Lo/ebj;

    invoke-virtual {v5, v0, v1}, Landroid/app/FragmentTransaction;->add(ILandroid/app/Fragment;)Landroid/app/FragmentTransaction;

    goto :goto_0

    .line 407
    :cond_2
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->b:Lo/ebj;

    invoke-virtual {v5, v0}, Landroid/app/FragmentTransaction;->show(Landroid/app/Fragment;)Landroid/app/FragmentTransaction;

    goto :goto_0

    .line 409
    :cond_3
    const/4 v0, 0x2

    if-ne p1, v0, :cond_5

    .line 410
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->a:Lo/ebj;

    if-nez v0, :cond_4

    .line 411
    new-instance v0, Lo/ebj;

    iget-object v1, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->i:Ljava/util/List;

    iget-object v2, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->q:Landroid/content/Context;

    const/4 v3, 0x2

    const/4 v4, 0x0

    invoke-direct {v0, v1, v3, v2, v4}, Lo/ebj;-><init>(Ljava/util/List;ILandroid/content/Context;Ljava/util/List;)V

    iput-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->a:Lo/ebj;

    .line 412
    sget v0, Lcom/huawei/pluginsocialshare/R$id;->fragment_container:I

    iget-object v1, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->a:Lo/ebj;

    invoke-virtual {v5, v0, v1}, Landroid/app/FragmentTransaction;->add(ILandroid/app/Fragment;)Landroid/app/FragmentTransaction;

    goto :goto_0

    .line 414
    :cond_4
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->a:Lo/ebj;

    invoke-virtual {v5, v0}, Landroid/app/FragmentTransaction;->show(Landroid/app/Fragment;)Landroid/app/FragmentTransaction;

    .line 417
    :cond_5
    :goto_0
    invoke-virtual {v5}, Landroid/app/FragmentTransaction;->commit()I

    .line 418
    return-void
.end method

.method static synthetic e(Lcom/huawei/pluginsocialshare/activity/EditShareActivity;)V
    .locals 0

    .line 75
    invoke-direct {p0}, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->n()V

    return-void
.end method

.method static synthetic e(Lcom/huawei/pluginsocialshare/activity/EditShareActivity;I)V
    .locals 0

    .line 75
    invoke-direct {p0, p1}, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->e(I)V

    return-void
.end method

.method static synthetic e(Lcom/huawei/pluginsocialshare/activity/EditShareActivity;Landroid/content/Context;[Ljava/lang/String;)V
    .locals 0

    .line 75
    invoke-direct {p0, p1, p2}, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->c(Landroid/content/Context;[Ljava/lang/String;)V

    return-void
.end method

.method static synthetic e()[Ljava/lang/String;
    .locals 1

    .line 75
    sget-object v0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->N:[Ljava/lang/String;

    return-object v0
.end method

.method private f()Landroid/graphics/Bitmap;
    .locals 6

    .line 636
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->f:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 637
    const-string v0, "EditShareActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getWaterMarkBitmap mWaterMarkLayout"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 639
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->f:Landroid/widget/RelativeLayout;

    invoke-virtual {v0}, Landroid/widget/RelativeLayout;->getMeasuredWidth()I

    move-result v0

    iget-object v1, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->f:Landroid/widget/RelativeLayout;

    .line 640
    invoke-virtual {v1}, Landroid/widget/RelativeLayout;->getMeasuredHeight()I

    move-result v1

    sget-object v2, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 639
    invoke-static {v0, v1, v2}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v4

    .line 641
    new-instance v5, Landroid/graphics/Canvas;

    invoke-direct {v5, v4}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 642
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->f:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v5}, Landroid/widget/RelativeLayout;->draw(Landroid/graphics/Canvas;)V

    .line 643
    const/16 v0, 0x1f

    invoke-virtual {v5, v0}, Landroid/graphics/Canvas;->save(I)I

    .line 644
    invoke-virtual {v5}, Landroid/graphics/Canvas;->restore()V

    .line 646
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->f:Landroid/widget/RelativeLayout;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 647
    return-object v4
.end method

.method private g()V
    .locals 6

    .line 525
    new-instance v0, Lo/ebv;

    invoke-direct {v0}, Lo/ebv;-><init>()V

    iput-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->t:Lo/ebv;

    .line 526
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->q:Landroid/content/Context;

    const-string v1, "layout_inflater"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/view/LayoutInflater;

    .line 527
    sget v0, Lcom/huawei/pluginsocialshare/R$layout;->hw_health_edit_share_camera_dialog:I

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v3

    .line 528
    sget v0, Lcom/huawei/pluginsocialshare/R$id;->hw_health_edit_share_caerma:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/widget/TextView;

    .line 529
    sget v0, Lcom/huawei/pluginsocialshare/R$id;->hw_health_edit_share_gallery:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/widget/TextView;

    .line 530
    new-instance v0, Lo/egw$c;

    iget-object v1, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->q:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/egw$c;-><init>(Landroid/content/Context;)V

    .line 531
    invoke-virtual {v0, v3}, Lo/egw$c;->e(Landroid/view/View;)Lo/egw$c;

    move-result-object v0

    invoke-virtual {v0}, Lo/egw$c;->e()Lo/egw;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->w:Lo/egw;

    .line 532
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->w:Lo/egw;

    invoke-virtual {v0}, Lo/egw;->show()V

    .line 533
    new-instance v0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity$2;

    invoke-direct {v0, p0}, Lcom/huawei/pluginsocialshare/activity/EditShareActivity$2;-><init>(Lcom/huawei/pluginsocialshare/activity/EditShareActivity;)V

    invoke-virtual {v4, v0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 542
    new-instance v0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity$1;

    invoke-direct {v0, p0}, Lcom/huawei/pluginsocialshare/activity/EditShareActivity$1;-><init>(Lcom/huawei/pluginsocialshare/activity/EditShareActivity;)V

    invoke-virtual {v5, v0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 551
    return-void
.end method

.method private h()V
    .locals 8

    .line 312
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->z:Lo/dau;

    if-eqz v0, :cond_2

    .line 313
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->z:Lo/dau;

    invoke-virtual {v0}, Lo/dau;->e()I

    move-result v4

    .line 314
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->q:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->q:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v4, v0, v1}, Lo/eca;->a(ILandroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 315
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 316
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->L:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 318
    :cond_0
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->n:Landroid/widget/TextView;

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 319
    const-string v0, "EditShareActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "phoneSource = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 321
    packed-switch v4, :pswitch_data_0

    goto/16 :goto_0

    .line 323
    :pswitch_0
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->l:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->q:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/pluginsocialshare/R$drawable;->track_share_short_ic_huaweiwatch_1:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 324
    goto/16 :goto_1

    .line 326
    :pswitch_1
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->l:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->q:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/pluginsocialshare/R$drawable;->track_share_short_ic_erji:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 327
    goto/16 :goto_1

    .line 329
    :pswitch_2
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->l:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->q:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/pluginsocialshare/R$drawable;->track_share_short_ic_hshouhuan:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 330
    goto/16 :goto_1

    .line 332
    :pswitch_3
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->l:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->q:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/pluginsocialshare/R$drawable;->track_share_short_ic_hshouhuan:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 333
    goto :goto_1

    .line 335
    :pswitch_4
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->l:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->q:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/pluginsocialshare/R$drawable;->track_share_short_ic_ertongwatch:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 336
    goto :goto_1

    .line 338
    :pswitch_5
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->l:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->q:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/pluginsocialshare/R$drawable;->track_share_short_ic_hshouhuan:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 339
    goto :goto_1

    .line 342
    :goto_0
    :pswitch_6
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->z:Lo/dau;

    invoke-virtual {v0}, Lo/dau;->c()I

    move-result v6

    .line 343
    const/4 v0, -0x1

    if-eq v0, v6, :cond_1

    .line 344
    invoke-direct {p0, v6}, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->d(I)I

    move-result v7

    .line 345
    const/4 v0, -0x1

    if-eq v0, v7, :cond_1

    .line 346
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->l:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->q:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v7}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 347
    goto :goto_1

    .line 352
    :cond_1
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->l:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 353
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->n:Landroid/widget/TextView;

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 354
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->L:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 358
    :cond_2
    :goto_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x29
        :pswitch_4
        :pswitch_2
        :pswitch_1
        :pswitch_3
        :pswitch_6
        :pswitch_0
        :pswitch_5
    .end packed-switch
.end method

.method private i()V
    .locals 2

    .line 620
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->t:Lo/ebv;

    iget-object v1, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->q:Landroid/content/Context;

    check-cast v1, Landroid/app/Activity;

    invoke-virtual {v0, v1}, Lo/ebv;->d(Landroid/app/Activity;)V

    .line 621
    return-void
.end method

.method static synthetic k(Lcom/huawei/pluginsocialshare/activity/EditShareActivity;)Lo/egw;
    .locals 1

    .line 75
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->w:Lo/egw;

    return-object v0
.end method

.method private k()V
    .locals 2

    .line 616
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->t:Lo/ebv;

    iget-object v1, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->q:Landroid/content/Context;

    check-cast v1, Landroid/app/Activity;

    invoke-virtual {v0, v1}, Lo/ebv;->e(Landroid/app/Activity;)V

    .line 617
    return-void
.end method

.method private n()V
    .locals 5

    .line 729
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 730
    const-string v0, "backGround"

    iget v1, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->E:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 731
    const-string v0, "dataMark"

    iget v1, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->I:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 732
    const-string v0, "picMark"

    iget v1, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->G:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 733
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->q:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    sget-object v2, Lo/dae;->gP:Lo/dae;

    invoke-virtual {v2}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v4, v3}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 735
    return-void
.end method

.method private p()V
    .locals 7

    .line 741
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->s:Landroid/widget/FrameLayout;

    if-nez v0, :cond_0

    .line 742
    const-string v0, "EditShareActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "EditShareActivity_removeView 1"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 743
    return-void

    .line 745
    :cond_0
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->x:Ljava/util/List;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->x:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_2

    .line 746
    :cond_1
    const-string v0, "EditShareActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "EditShareActivity_removeView 2"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 747
    return-void

    .line 749
    :cond_2
    const-string v0, "EditShareActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "EditShareActivity_removeView 3"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 750
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->s:Landroid/widget/FrameLayout;

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->removeAllViews()V

    .line 751
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->s:Landroid/widget/FrameLayout;

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->removeAllViewsInLayout()V

    .line 752
    iget v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->I:I

    if-ltz v0, :cond_3

    iget v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->I:I

    iget-object v1, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->x:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_3

    .line 753
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->x:Ljava/util/List;

    iget v1, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->I:I

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/dam;

    invoke-virtual {v0}, Lo/dam;->c()Landroid/view/View;

    move-result-object v4

    .line 754
    const/4 v0, 0x0

    if-eq v0, v4, :cond_3

    .line 755
    invoke-virtual {v4}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v5

    .line 756
    instance-of v0, v5, Landroid/view/ViewGroup;

    if-eqz v0, :cond_3

    .line 757
    move-object v6, v5

    check-cast v6, Landroid/view/ViewGroup;

    .line 758
    invoke-virtual {v6, v4}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 762
    :cond_3
    return-void
.end method


# virtual methods
.method public a(Landroid/graphics/drawable/Drawable;Landroid/view/View;II)V
    .locals 3

    .line 473
    packed-switch p3, :pswitch_data_0

    goto/16 :goto_0

    .line 475
    :pswitch_0
    iput p4, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->E:I

    .line 476
    if-nez p4, :cond_0

    .line 477
    invoke-direct {p0}, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->g()V

    goto/16 :goto_0

    .line 479
    :cond_0
    iput p4, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->F:I

    .line 480
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->k:Lo/ebr;

    invoke-virtual {v0, p1}, Lo/ebr;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 481
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->d:Ljava/util/List;

    invoke-interface {v0, p4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Bitmap;

    iget-object v1, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->K:Landroid/graphics/Rect;

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lo/ecc;->c(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Lhuawei/android/hwcolorpicker/HwColorPicker$ClientType;)I

    move-result v0

    iput v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->B:I

    .line 482
    iget v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->B:I

    invoke-direct {p0, v0}, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->c(I)V

    .line 483
    if-eqz p2, :cond_2

    .line 484
    invoke-direct {p0, p2}, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->c(Landroid/view/View;)V

    goto :goto_0

    .line 489
    :pswitch_1
    if-eqz p2, :cond_2

    .line 490
    iput p4, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->I:I

    .line 491
    invoke-direct {p0, p2}, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->c(Landroid/view/View;)V

    goto :goto_0

    .line 495
    :pswitch_2
    iget v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->D:I

    if-ne v0, p4, :cond_1

    .line 496
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->G:I

    .line 497
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->g:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 498
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->D:I

    goto :goto_0

    .line 500
    :cond_1
    iput p4, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->G:I

    .line 501
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->g:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 502
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->g:Landroid/widget/ImageView;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 503
    iput p4, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->D:I

    .line 505
    .line 509
    :cond_2
    :goto_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 8

    .line 673
    invoke-super {p0, p1, p2, p3}, Lcom/huawei/ui/commonui/base/BaseActivity;->onActivityResult(IILandroid/content/Intent;)V

    .line 674
    if-nez p3, :cond_0

    const/4 v0, 0x4

    if-eq p1, v0, :cond_0

    .line 675
    const-string v0, "EditShareActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "data==null "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 676
    return-void

    .line 678
    :cond_0
    const/4 v0, -0x1

    if-ne p2, v0, :cond_6

    .line 679
    packed-switch p1, :pswitch_data_0

    goto/16 :goto_1

    .line 681
    :pswitch_0
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->t:Lo/ebv;

    invoke-virtual {v0, p0, p3}, Lo/ebv;->e(Landroid/app/Activity;Landroid/content/Intent;)V

    .line 682
    goto/16 :goto_1

    .line 684
    :pswitch_1
    const-string v0, "bitmap"

    invoke-virtual {p3, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/net/Uri;

    .line 686
    :try_start_0
    invoke-virtual {p0}, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    invoke-static {v0, v4}, Landroid/provider/MediaStore$Images$Media;->getBitmap(Landroid/content/ContentResolver;Landroid/net/Uri;)Landroid/graphics/Bitmap;

    move-result-object v5

    .line 687
    const-string v0, "EditShareActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onActivityResult: uri = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 688
    const/4 v0, 0x0

    if-eq v0, v5, :cond_5

    .line 689
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->c:Lo/ebj;

    if-eqz v0, :cond_1

    .line 690
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->c:Lo/ebj;

    iget v1, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->F:I

    invoke-virtual {v0, v1}, Lo/ebj;->b(I)V

    .line 692
    :cond_1
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->k:Lo/ebr;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 693
    new-instance v6, Landroid/graphics/drawable/BitmapDrawable;

    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->q:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-direct {v6, v0, v5}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    .line 694
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->k:Lo/ebr;

    invoke-virtual {v0, v6}, Lo/ebr;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 696
    :cond_2
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->H:Landroid/graphics/Rect;

    const/4 v1, 0x0

    invoke-static {v5, v0, v1}, Lo/ecc;->c(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Lhuawei/android/hwcolorpicker/HwColorPicker$ClientType;)I

    move-result v0

    iput v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->C:I

    .line 697
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->H:Landroid/graphics/Rect;

    const/4 v1, 0x0

    invoke-static {v5, v0, v1}, Lo/ecc;->a(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Lhuawei/android/hwcolorpicker/HwColorPicker$ClientType;)I

    move-result v0

    iput v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->j:I

    .line 699
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->x:Ljava/util/List;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->x:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_4

    iget v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->I:I

    iget-object v1, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->x:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_4

    .line 700
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->x:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v6

    .line 701
    const-string v0, "EditShareActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "dataMarkViewSize "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 702
    const/4 v7, 0x0

    :goto_0
    if-ge v7, v6, :cond_3

    .line 703
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->x:Ljava/util/List;

    invoke-interface {v0, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/dam;

    iget v1, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->C:I

    iget v2, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->j:I

    invoke-virtual {v0, v1, v2}, Lo/dam;->d(II)V

    .line 702
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 705
    :cond_3
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->x:Ljava/util/List;

    iget v1, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->I:I

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/dam;

    invoke-virtual {v0}, Lo/dam;->c()Landroid/view/View;

    move-result-object v7

    .line 706
    const/4 v0, 0x0

    if-eq v0, v7, :cond_4

    .line 707
    invoke-direct {p0, v7}, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->c(Landroid/view/View;)V

    .line 710
    :cond_4
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->K:Landroid/graphics/Rect;

    const/4 v1, 0x0

    invoke-static {v5, v0, v1}, Lo/ecc;->c(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Lhuawei/android/hwcolorpicker/HwColorPicker$ClientType;)I

    move-result v0

    iput v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->B:I

    .line 711
    const-string v0, "EditShareActivity"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Crop_color widgetColor "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget v2, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->C:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " doMainColor "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget v2, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->j:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, " textColor "

    const/4 v3, 0x4

    aput-object v2, v1, v3

    iget v2, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->B:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 712
    iget v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->B:I

    invoke-direct {p0, v0}, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->c(I)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 716
    :cond_5
    goto :goto_1

    .line 714
    :catch_0
    move-exception v5

    .line 715
    const-string v0, "EditShareActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "IOException: e = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 717
    goto :goto_1

    .line 719
    :pswitch_2
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->t:Lo/ebv;

    iget-object v1, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->q:Landroid/content/Context;

    check-cast v1, Landroid/app/Activity;

    invoke-virtual {v0, v1}, Lo/ebv;->a(Landroid/app/Activity;)V

    .line 720
    .line 726
    :cond_6
    :goto_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 4

    .line 133
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 134
    sget v0, Lcom/huawei/pluginsocialshare/R$layout;->hw_health_edit_share_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->setContentView(I)V

    .line 135
    iput-object p0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->q:Landroid/content/Context;

    .line 136
    invoke-static {}, Lo/ebk;->d()Lo/ebk;

    invoke-static {}, Lo/ebk;->e()Lo/dau;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->z:Lo/dau;

    .line 137
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->z:Lo/dau;

    if-nez v0, :cond_0

    .line 138
    const-string v0, "EditShareActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "EditShareActivity_data mShareEditContent is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 139
    invoke-virtual {p0}, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->finish()V

    .line 140
    return-void

    .line 142
    :cond_0
    invoke-direct {p0}, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->a()V

    .line 143
    invoke-direct {p0}, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->d()V

    .line 144
    invoke-direct {p0}, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->c()V

    .line 145
    return-void
.end method

.method public onDestroy()V
    .locals 0

    .line 766
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onDestroy()V

    .line 767
    invoke-direct {p0}, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->p()V

    .line 768
    invoke-static {}, Lo/ebj;->c()V

    .line 770
    return-void
.end method

.method public onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    .locals 4

    .line 652
    const-string v0, "EditShareActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "requestCode=="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 653
    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    .line 654
    array-length v0, p2

    if-lez v0, :cond_0

    const/4 v0, 0x0

    aget v0, p3, v0

    if-nez v0, :cond_0

    .line 655
    const-string v0, "EditShareActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "choosePic"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "Write Permission success"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 656
    invoke-direct {p0}, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->i()V

    goto :goto_0

    .line 658
    :cond_0
    const-string v0, "EditShareActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "choosePic"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "Write Permission Failed"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 661
    :cond_1
    :goto_0
    const/4 v0, 0x2

    if-ne p1, v0, :cond_3

    .line 662
    array-length v0, p2

    if-lez v0, :cond_2

    const/4 v0, 0x0

    aget v0, p3, v0

    if-nez v0, :cond_2

    .line 663
    const-string v0, "EditShareActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "takePhoto"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "Write Permission success"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 664
    invoke-direct {p0}, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->k()V

    goto :goto_1

    .line 666
    :cond_2
    const-string v0, "EditShareActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "takePhoto"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "Write Permission Failed"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 669
    :cond_3
    :goto_1
    return-void
.end method
