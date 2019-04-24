.class public Lcom/huawei/feedback/ui/FeedbackEditActivity;
.super Lcom/huawei/feedback/ui/BaseActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/feedback/ui/FeedbackEditActivity$i;,
        Lcom/huawei/feedback/ui/FeedbackEditActivity$j;,
        Lcom/huawei/feedback/ui/FeedbackEditActivity$k;,
        Lcom/huawei/feedback/ui/FeedbackEditActivity$d;,
        Lcom/huawei/feedback/ui/FeedbackEditActivity$g;,
        Lcom/huawei/feedback/ui/FeedbackEditActivity$h;,
        Lcom/huawei/feedback/ui/FeedbackEditActivity$f;,
        Lcom/huawei/feedback/ui/FeedbackEditActivity$l;,
        Lcom/huawei/feedback/ui/FeedbackEditActivity$b;,
        Lcom/huawei/feedback/ui/FeedbackEditActivity$a;,
        Lcom/huawei/feedback/ui/FeedbackEditActivity$c;,
        Lcom/huawei/feedback/ui/FeedbackEditActivity$e;
    }
.end annotation


# static fields
.field private static final G:I = 0x6

.field private static final H:I = 0x4

.field private static ak:Z = false

.field private static final az:I = 0x3e8

.field public static final b:Ljava/lang/String; = "close_activity"

.field public static final c:Ljava/lang/String; = "del_screenshot"

.field public static final e:Ljava/lang/String; = "1"

.field public static final f:Ljava/lang/String; = "0"

.field public static final g:I = 0x1

.field public static final h:I = 0x2

.field public static final i:I = 0x3

.field public static final j:I = 0x4

.field public static final l:I = 0x1000

.field public static final m:I = 0x1001

.field public static final n:I = 0x1002

.field private static final o:Ljava/lang/String; = "FeedbackEditActivity"

.field private static final p:Ljava/lang/String; = "original_draft"

.field private static final q:Ljava/lang/String; = "edit_draft"

.field private static final r:Ljava/lang/String; = "draft_id"

.field private static final s:Ljava/lang/String; = "package_info"

.field private static final t:Ljava/lang/String; = "upload_name"

.field private static final u:Ljava/lang/String; = "shared_log"

.field private static final v:Ljava/lang/String; = "logMetricInfo"

.field private static final w:I = 0x12c

.field private static final x:I = 0x32

.field private static final y:I = 0xbcd

.field private static final z:I = 0xbce


# instance fields
.field private A:Landroid/content/Context;

.field private B:Landroid/content/DialogInterface$OnKeyListener;

.field private C:Landroid/widget/GridView;

.field private D:Lcom/huawei/feedback/ui/an;

.field private E:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/feedback/logic/c;>;"
        }
    .end annotation
.end field

.field private F:Lcom/huawei/feedback/logic/c;

.field private I:Ljava/lang/String;

.field private J:Landroid/widget/RadioGroup;

.field private K:Landroid/app/AlertDialog;

.field private L:Landroid/app/AlertDialog;

.field private M:Landroid/widget/EditText;

.field private N:Landroid/widget/CheckBox;

.field private O:Ljava/lang/String;

.field private P:Landroid/view/View;

.field private Q:Landroid/view/View;

.field private R:Landroid/webkit/WebView;

.field private S:Landroid/widget/ProgressBar;

.field private T:Landroid/widget/ScrollView;

.field private U:Landroid/widget/RelativeLayout;

.field private V:Lcom/huawei/feedback/bean/d;

.field private W:I

.field private X:Lcom/huawei/feedback/bean/d;

.field private Y:Landroid/widget/EditText;

.field private Z:Landroid/widget/TextView;

.field private aA:Landroid/app/AlertDialog;

.field private aB:Landroid/app/AlertDialog;

.field private aC:Z

.field private aD:Ljava/lang/String;

.field private aE:Ljava/lang/String;

.field private aF:Ljava/lang/String;

.field private aG:Ljava/lang/String;

.field private aH:Ljava/lang/String;

.field private aI:I

.field private aJ:Z

.field private aK:Z

.field private aL:Landroid/app/ActionBar;

.field private aM:Lcom/huawei/feedback/ui/CustomActionBar;

.field private aN:Landroid/view/View$OnClickListener;

.field private aO:Landroid/view/View$OnClickListener;

.field private aP:Landroid/view/View$OnClickListener;

.field private aQ:Landroid/view/View$OnClickListener;

.field private aR:Landroid/view/View$OnClickListener;

.field private aS:Landroid/widget/AdapterView$OnItemClickListener;

.field private aT:Landroid/view/View$OnClickListener;

.field private aU:Landroid/webkit/WebViewClient;

.field private aV:Landroid/webkit/WebChromeClient;

.field private aa:Landroid/widget/ImageView;

.field private ab:Landroid/widget/Button;

.field private ac:Landroid/widget/Button;

.field private ad:Landroid/widget/ImageView;

.field private ae:Landroid/widget/TextView;

.field private af:Landroid/widget/TextView;

.field private ag:Landroid/widget/LinearLayout;

.field private ah:Z

.field private ai:Lcom/huawei/feedback/ui/FeedbackEditActivity$i;

.field private aj:Lcom/huawei/feedback/bean/c;

.field private al:Landroid/widget/LinearLayout;

.field private am:Landroid/widget/LinearLayout;

.field private an:Landroid/widget/LinearLayout;

.field private ao:Landroid/widget/TextView;

.field private ap:Landroid/widget/TextView;

.field private aq:Landroid/widget/TextView;

.field private ar:Landroid/widget/ImageView;

.field private as:Lcom/huawei/lcagent/client/LogCollectManager;

.field private at:Ljava/lang/String;

.field private au:Ljava/lang/String;

.field private av:Ljava/io/File;

.field private aw:Ljava/io/File;

.field private ax:Landroid/app/ProgressDialog;

.field private ay:Lcom/huawei/lcagent/client/LogMetricInfo;

.field public d:I

.field public k:Landroid/os/Handler;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 329
    const/4 v0, 0x0

    sput-boolean v0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->ak:Z

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 89
    invoke-direct {p0}, Lcom/huawei/feedback/ui/BaseActivity;-><init>()V

    .line 179
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->E:Ljava/util/List;

    .line 180
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->F:Lcom/huawei/feedback/logic/c;

    .line 184
    const-string v0, "0"

    iput-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->I:Ljava/lang/String;

    .line 241
    new-instance v0, Lcom/huawei/feedback/bean/d$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/huawei/feedback/bean/d$a;-><init>(I)V

    invoke-virtual {v0}, Lcom/huawei/feedback/bean/d$a;->a()Lcom/huawei/feedback/bean/d;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->V:Lcom/huawei/feedback/bean/d;

    .line 246
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->W:I

    .line 251
    new-instance v0, Lcom/huawei/feedback/bean/d$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/huawei/feedback/bean/d$a;-><init>(I)V

    invoke-virtual {v0}, Lcom/huawei/feedback/bean/d$a;->a()Lcom/huawei/feedback/bean/d;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->X:Lcom/huawei/feedback/bean/d;

    .line 303
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->ah:Z

    .line 308
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->ai:Lcom/huawei/feedback/ui/FeedbackEditActivity$i;

    .line 331
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->al:Landroid/widget/LinearLayout;

    .line 332
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->am:Landroid/widget/LinearLayout;

    .line 333
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->an:Landroid/widget/LinearLayout;

    .line 351
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->as:Lcom/huawei/lcagent/client/LogCollectManager;

    .line 356
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->at:Ljava/lang/String;

    .line 362
    const/4 v0, 0x1

    iput v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->d:I

    .line 371
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->ay:Lcom/huawei/lcagent/client/LogMetricInfo;

    .line 395
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->aC:Z

    .line 398
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->aD:Ljava/lang/String;

    .line 401
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->aE:Ljava/lang/String;

    .line 404
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->aF:Ljava/lang/String;

    .line 407
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->aG:Ljava/lang/String;

    .line 410
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->aH:Ljava/lang/String;

    .line 413
    const/4 v0, 0x1

    iput v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->aI:I

    .line 415
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->aJ:Z

    .line 418
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->aK:Z

    .line 445
    new-instance v0, Lcom/huawei/feedback/ui/n;

    invoke-direct {v0, p0}, Lcom/huawei/feedback/ui/n;-><init>(Lcom/huawei/feedback/ui/FeedbackEditActivity;)V

    iput-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->aN:Landroid/view/View$OnClickListener;

    .line 479
    new-instance v0, Lcom/huawei/feedback/ui/w;

    invoke-direct {v0, p0}, Lcom/huawei/feedback/ui/w;-><init>(Lcom/huawei/feedback/ui/FeedbackEditActivity;)V

    iput-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->aO:Landroid/view/View$OnClickListener;

    .line 504
    new-instance v0, Lcom/huawei/feedback/ui/x;

    invoke-direct {v0, p0}, Lcom/huawei/feedback/ui/x;-><init>(Lcom/huawei/feedback/ui/FeedbackEditActivity;)V

    iput-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->aP:Landroid/view/View$OnClickListener;

    .line 520
    new-instance v0, Lcom/huawei/feedback/ui/y;

    invoke-direct {v0, p0}, Lcom/huawei/feedback/ui/y;-><init>(Lcom/huawei/feedback/ui/FeedbackEditActivity;)V

    iput-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->aQ:Landroid/view/View$OnClickListener;

    .line 532
    new-instance v0, Lcom/huawei/feedback/ui/z;

    invoke-direct {v0, p0}, Lcom/huawei/feedback/ui/z;-><init>(Lcom/huawei/feedback/ui/FeedbackEditActivity;)V

    iput-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->aR:Landroid/view/View$OnClickListener;

    .line 564
    new-instance v0, Lcom/huawei/feedback/ui/aa;

    invoke-direct {v0, p0}, Lcom/huawei/feedback/ui/aa;-><init>(Lcom/huawei/feedback/ui/FeedbackEditActivity;)V

    iput-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->aS:Landroid/widget/AdapterView$OnItemClickListener;

    .line 593
    new-instance v0, Lcom/huawei/feedback/ui/ab;

    invoke-direct {v0, p0}, Lcom/huawei/feedback/ui/ab;-><init>(Lcom/huawei/feedback/ui/FeedbackEditActivity;)V

    iput-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->aT:Landroid/view/View$OnClickListener;

    .line 608
    new-instance v0, Lcom/huawei/feedback/ui/ac;

    invoke-direct {v0, p0}, Lcom/huawei/feedback/ui/ac;-><init>(Lcom/huawei/feedback/ui/FeedbackEditActivity;)V

    iput-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->k:Landroid/os/Handler;

    .line 2665
    new-instance v0, Lcom/huawei/feedback/ui/u;

    invoke-direct {v0, p0}, Lcom/huawei/feedback/ui/u;-><init>(Lcom/huawei/feedback/ui/FeedbackEditActivity;)V

    iput-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->aU:Landroid/webkit/WebViewClient;

    .line 2709
    new-instance v0, Lcom/huawei/feedback/ui/v;

    invoke-direct {v0, p0}, Lcom/huawei/feedback/ui/v;-><init>(Lcom/huawei/feedback/ui/FeedbackEditActivity;)V

    iput-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->aV:Landroid/webkit/WebChromeClient;

    return-void
.end method

.method static synthetic A(Lcom/huawei/feedback/ui/FeedbackEditActivity;)Ljava/lang/String;
    .locals 1

    .line 89
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->au:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic B(Lcom/huawei/feedback/ui/FeedbackEditActivity;)Landroid/app/AlertDialog;
    .locals 1

    .line 89
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->aA:Landroid/app/AlertDialog;

    return-object v0
.end method

.method static synthetic C(Lcom/huawei/feedback/ui/FeedbackEditActivity;)Landroid/app/ProgressDialog;
    .locals 1

    .line 89
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->ax:Landroid/app/ProgressDialog;

    return-object v0
.end method

.method static synthetic D(Lcom/huawei/feedback/ui/FeedbackEditActivity;)Lcom/huawei/feedback/ui/FeedbackEditActivity$i;
    .locals 1

    .line 89
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->ai:Lcom/huawei/feedback/ui/FeedbackEditActivity$i;

    return-object v0
.end method

.method static synthetic E(Lcom/huawei/feedback/ui/FeedbackEditActivity;)Landroid/app/AlertDialog;
    .locals 1

    .line 89
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->aB:Landroid/app/AlertDialog;

    return-object v0
.end method

.method static synthetic F(Lcom/huawei/feedback/ui/FeedbackEditActivity;)Landroid/widget/EditText;
    .locals 1

    .line 89
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->M:Landroid/widget/EditText;

    return-object v0
.end method

.method static synthetic G(Lcom/huawei/feedback/ui/FeedbackEditActivity;)Ljava/lang/String;
    .locals 1

    .line 89
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->I:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic H(Lcom/huawei/feedback/ui/FeedbackEditActivity;)Lcom/huawei/feedback/bean/d;
    .locals 1

    .line 89
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->V:Lcom/huawei/feedback/bean/d;

    return-object v0
.end method

.method static synthetic I(Lcom/huawei/feedback/ui/FeedbackEditActivity;)Ljava/lang/String;
    .locals 1

    .line 89
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->aD:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic J(Lcom/huawei/feedback/ui/FeedbackEditActivity;)Ljava/lang/String;
    .locals 1

    .line 89
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->aF:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic K(Lcom/huawei/feedback/ui/FeedbackEditActivity;)Ljava/lang/String;
    .locals 1

    .line 89
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->aG:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic L(Lcom/huawei/feedback/ui/FeedbackEditActivity;)Ljava/lang/String;
    .locals 1

    .line 89
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->aE:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic M(Lcom/huawei/feedback/ui/FeedbackEditActivity;)Z
    .locals 1

    .line 89
    iget-boolean v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->aK:Z

    return v0
.end method

.method static synthetic N(Lcom/huawei/feedback/ui/FeedbackEditActivity;)Landroid/app/ActionBar;
    .locals 1

    .line 89
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->aL:Landroid/app/ActionBar;

    return-object v0
.end method

.method static synthetic O(Lcom/huawei/feedback/ui/FeedbackEditActivity;)Landroid/widget/ProgressBar;
    .locals 1

    .line 89
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->S:Landroid/widget/ProgressBar;

    return-object v0
.end method

.method static synthetic a(Lcom/huawei/feedback/ui/FeedbackEditActivity;Landroid/app/ProgressDialog;)Landroid/app/ProgressDialog;
    .locals 0

    .line 89
    iput-object p1, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->ax:Landroid/app/ProgressDialog;

    return-object p1
.end method

.method static synthetic a(Lcom/huawei/feedback/ui/FeedbackEditActivity;Landroid/content/Context;)Landroid/content/Context;
    .locals 0

    .line 89
    iput-object p1, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->A:Landroid/content/Context;

    return-object p1
.end method

.method static synthetic a(Lcom/huawei/feedback/ui/FeedbackEditActivity;)Lcom/huawei/feedback/bean/c;
    .locals 1

    .line 89
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->aj:Lcom/huawei/feedback/bean/c;

    return-object v0
.end method

.method static synthetic a(Lcom/huawei/feedback/ui/FeedbackEditActivity;Lcom/huawei/feedback/ui/FeedbackEditActivity$i;)Lcom/huawei/feedback/ui/FeedbackEditActivity$i;
    .locals 0

    .line 89
    iput-object p1, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->ai:Lcom/huawei/feedback/ui/FeedbackEditActivity$i;

    return-object p1
.end method

.method static synthetic a(Lcom/huawei/feedback/ui/FeedbackEditActivity;Ljava/io/File;)Ljava/io/File;
    .locals 0

    .line 89
    iput-object p1, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->aw:Ljava/io/File;

    return-object p1
.end method

.method static synthetic a(Lcom/huawei/feedback/ui/FeedbackEditActivity;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 89
    iput-object p1, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->I:Ljava/lang/String;

    return-object p1
.end method

.method private a(I)V
    .locals 4

    .line 880
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->av:Ljava/io/File;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->av:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 881
    const/4 v2, 0x0

    :goto_0
    const/4 v0, 0x2

    if-ge v2, v0, :cond_1

    .line 882
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->av:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    move-result v3

    .line 883
    if-eqz v3, :cond_0

    .line 885
    const-string v0, "FeedbackEditActivity"

    const-string v1, "package file delete sccess!"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 886
    goto :goto_1

    .line 889
    :cond_0
    const-string v0, "FeedbackEditActivity"

    const-string v1, "package file not exist or error! file delete fail!"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 881
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 894
    :cond_1
    :goto_1
    return-void
.end method

.method public static a(Landroid/app/Activity;Landroid/content/Context;ILjava/lang/String;Z)V
    .locals 5

    .line 2312
    sput-boolean p4, Lcom/huawei/feedback/ui/FeedbackEditActivity;->ak:Z

    .line 2313
    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    .line 2314
    const-class v0, Lcom/huawei/feedback/ui/FeedbackEditActivity;

    invoke-virtual {v1, p1, v0}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 2318
    new-instance v0, Lcom/huawei/feedback/bean/d$a;

    invoke-direct {v0, p2}, Lcom/huawei/feedback/bean/d$a;-><init>(I)V

    invoke-virtual {v0}, Lcom/huawei/feedback/bean/d$a;->a()Lcom/huawei/feedback/bean/d;

    move-result-object v2

    .line 2320
    new-instance v0, Lcom/huawei/feedback/bean/d$a;

    invoke-direct {v0, p2}, Lcom/huawei/feedback/bean/d$a;-><init>(I)V

    invoke-virtual {v0}, Lcom/huawei/feedback/bean/d$a;->a()Lcom/huawei/feedback/bean/d;

    move-result-object v3

    .line 2321
    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 2322
    invoke-virtual {v3, p3}, Lcom/huawei/feedback/bean/d;->d(Ljava/lang/String;)V

    .line 2325
    :cond_0
    sget-boolean v0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->ak:Z

    if-eqz v0, :cond_1

    .line 2326
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Lcom/huawei/feedback/bean/d;->a(Z)V

    .line 2331
    :cond_1
    new-instance v4, Landroid/os/Bundle;

    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    .line 2332
    const-string v0, "original_draft"

    invoke-virtual {v4, v0, v2}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    .line 2333
    const-string v0, "edit_draft"

    invoke-virtual {v4, v0, v3}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    .line 2334
    invoke-virtual {v1, v4}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 2337
    invoke-virtual {p0, v1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 2338
    return-void
.end method

.method private a(Landroid/content/Intent;)V
    .locals 5

    .line 2146
    invoke-virtual {p1}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/huawei/feedback/e;->a(Landroid/content/ContextWrapper;Landroid/net/Uri;)Ljava/lang/String;

    move-result-object v2

    .line 2147
    invoke-virtual {p1}, Landroid/content/Intent;->getType()Ljava/lang/String;

    move-result-object v3

    .line 2149
    const/4 v0, 0x0

    if-ne v0, v2, :cond_0

    .line 2150
    const-string v0, "FeedbackEditActivity"

    const-string v1, "null == imagePath,will getRealImagePath"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 2151
    invoke-virtual {p1}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v4

    .line 2153
    invoke-static {v4, p0}, Lcom/huawei/feedback/e;->a(Landroid/net/Uri;Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    .line 2161
    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x16

    if-le v0, v1, :cond_1

    invoke-static {p0}, Lcom/huawei/feedback/e;->a(Landroid/app/Activity;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "android.permission.WRITE_EXTERNAL_STORAGE"

    invoke-virtual {p0, v0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->checkSelfPermission(Ljava/lang/String;)I

    move-result v0

    if-nez v0, :cond_2

    .line 2163
    :cond_1
    invoke-direct {p0, v2, v3}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 2166
    :cond_2
    return-void
.end method

.method static synthetic a(Lcom/huawei/feedback/ui/FeedbackEditActivity;I)V
    .locals 0

    .line 89
    invoke-direct {p0, p1}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->a(I)V

    return-void
.end method

.method static synthetic a(Lcom/huawei/feedback/ui/FeedbackEditActivity;Ljava/lang/Object;)V
    .locals 0

    .line 89
    invoke-direct {p0, p1}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->a(Ljava/lang/Object;)V

    return-void
.end method

.method private a(Ljava/lang/Object;)V
    .locals 4

    .line 757
    const/4 v0, 0x0

    if-eq v0, p1, :cond_3

    instance-of v0, p1, Lcom/huawei/feedback/bean/c;

    if-eqz v0, :cond_3

    .line 758
    move-object v3, p1

    check-cast v3, Lcom/huawei/feedback/bean/c;

    .line 759
    iput-object v3, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->aj:Lcom/huawei/feedback/bean/c;

    .line 760
    invoke-virtual {v3}, Lcom/huawei/feedback/bean/c;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {v3}, Lcom/huawei/feedback/bean/c;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 761
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->al:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 762
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->ao:Landroid/widget/TextView;

    invoke-virtual {v3}, Lcom/huawei/feedback/bean/c;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 763
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->ao:Landroid/widget/TextView;

    invoke-static {p0}, Lcom/huawei/feedback/e;->c(Landroid/content/Context;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 765
    :cond_0
    invoke-virtual {v3}, Lcom/huawei/feedback/bean/c;->c()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {v3}, Lcom/huawei/feedback/bean/c;->d()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->Q:Landroid/view/View;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->R:Landroid/webkit/WebView;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 766
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->am:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 767
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->ap:Landroid/widget/TextView;

    invoke-virtual {v3}, Lcom/huawei/feedback/bean/c;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 768
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->ap:Landroid/widget/TextView;

    invoke-static {p0}, Lcom/huawei/feedback/e;->c(Landroid/content/Context;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 770
    :cond_1
    invoke-virtual {v3}, Lcom/huawei/feedback/bean/c;->e()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    invoke-virtual {v3}, Lcom/huawei/feedback/bean/c;->f()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 771
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->an:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 772
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->aq:Landroid/widget/TextView;

    invoke-virtual {v3}, Lcom/huawei/feedback/bean/c;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 773
    iget-boolean v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->aJ:Z

    if-eqz v0, :cond_2

    .line 774
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->an:Landroid/widget/LinearLayout;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setEnabled(Z)V

    .line 775
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->aq:Landroid/widget/TextView;

    invoke-static {p0}, Lcom/huawei/feedback/e;->c(Landroid/content/Context;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 776
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->ar:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->A:Landroid/content/Context;

    const-string v2, "feedback_img_service_level11_normal"

    invoke-static {v1, v2}, Lcom/huawei/feedback/f;->f(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_0

    .line 778
    :cond_2
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->an:Landroid/widget/LinearLayout;

    iget-object v1, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->A:Landroid/content/Context;

    const-string v2, "feedback_btn_small_disable"

    invoke-static {v1, v2}, Lcom/huawei/feedback/f;->f(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setBackgroundResource(I)V

    .line 779
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->an:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setEnabled(Z)V

    .line 780
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->aq:Landroid/widget/TextView;

    invoke-static {p0}, Lcom/huawei/feedback/e;->t(Landroid/content/Context;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 781
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->ar:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->A:Landroid/content/Context;

    const-string v2, "feedback_img_service_level11_disable"

    invoke-static {v1, v2}, Lcom/huawei/feedback/f;->f(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 785
    :cond_3
    :goto_0
    return-void
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    .line 1651
    new-instance v2, Lcom/huawei/feedback/logic/c;

    invoke-direct {v2}, Lcom/huawei/feedback/logic/c;-><init>()V

    .line 1652
    invoke-virtual {v2, p1}, Lcom/huawei/feedback/logic/c;->a(Ljava/lang/String;)V

    .line 1653
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1654
    const-string v0, "image/jpeg"

    invoke-virtual {v2, v0}, Lcom/huawei/feedback/logic/c;->b(Ljava/lang/String;)V

    goto :goto_0

    .line 1656
    :cond_0
    invoke-virtual {v2, p2}, Lcom/huawei/feedback/logic/c;->b(Ljava/lang/String;)V

    .line 1658
    :goto_0
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->E:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v3, v0, -0x1

    .line 1659
    if-ltz v3, :cond_1

    .line 1661
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->E:Ljava/util/List;

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_1

    .line 1662
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->E:Ljava/util/List;

    invoke-interface {v0, v3}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 1665
    :cond_1
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->E:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1667
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->E:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x4

    if-ge v0, v1, :cond_2

    .line 1668
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->E:Ljava/util/List;

    iget-object v1, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->F:Lcom/huawei/feedback/logic/c;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1670
    :cond_2
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->X:Lcom/huawei/feedback/bean/d;

    iget-object v1, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->E:Ljava/util/List;

    invoke-virtual {v0, v1}, Lcom/huawei/feedback/bean/d;->a(Ljava/util/List;)V

    .line 1671
    invoke-direct {p0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->u()V

    .line 1672
    return-void
.end method

.method private a(Ljava/util/List;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/feedback/logic/c;>;)V"
        }
    .end annotation

    .line 2621
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    .line 2622
    if-lez v2, :cond_2

    .line 2623
    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_2

    .line 2624
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/feedback/logic/c;

    .line 2625
    const/4 v0, 0x0

    if-eq v0, v4, :cond_1

    .line 2627
    invoke-virtual {v4}, Lcom/huawei/feedback/logic/c;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 2628
    invoke-virtual {v4}, Lcom/huawei/feedback/logic/c;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4}, Lcom/huawei/feedback/logic/c;->b()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->b(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    .line 2630
    :cond_0
    invoke-direct {p0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->k()V

    .line 2623
    :cond_1
    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 2636
    :cond_2
    return-void
.end method

.method private a(ZLandroid/os/Bundle;)V
    .locals 3

    .line 1552
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->X:Lcom/huawei/feedback/bean/d;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 1553
    const-string v0, "FeedbackEditActivity"

    const-string v1, "feedbackInfo null"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 1554
    return-void

    .line 1558
    :cond_0
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->M:Landroid/widget/EditText;

    iget-object v1, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->X:Lcom/huawei/feedback/bean/d;

    invoke-virtual {v1}, Lcom/huawei/feedback/bean/d;->h()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 1559
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->X:Lcom/huawei/feedback/bean/d;

    invoke-virtual {v0}, Lcom/huawei/feedback/bean/d;->p()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->I:Ljava/lang/String;

    .line 1560
    const-string v0, "currentFrequency"

    iget-object v1, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->I:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 1561
    if-nez p1, :cond_1

    const/4 v0, 0x0

    if-eq v0, p2, :cond_1

    .line 1562
    const-string v0, "edit_draft"

    invoke-virtual {p2, v0}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/feedback/bean/d;

    .line 1563
    const/4 v0, 0x0

    if-eq v0, v2, :cond_1

    .line 1564
    invoke-virtual {v2}, Lcom/huawei/feedback/bean/d;->b()Ljava/util/List;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->a(Ljava/util/List;)V

    .line 1572
    :cond_1
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->X:Lcom/huawei/feedback/bean/d;

    invoke-virtual {v0}, Lcom/huawei/feedback/bean/d;->k()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1573
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->N:Landroid/widget/CheckBox;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setChecked(Z)V

    .line 1574
    invoke-static {p0}, Lcom/huawei/feedback/e;->a(Landroid/app/Activity;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 1575
    const-string v0, "android.permission.WRITE_EXTERNAL_STORAGE"

    const/16 v1, 0x1002

    invoke-static {p0, v0, v1}, Lcom/huawei/feedback/e;->a(Landroid/app/Activity;Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 1577
    return-void

    .line 1581
    :cond_2
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->N:Landroid/widget/CheckBox;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setChecked(Z)V

    .line 1585
    :cond_3
    iget v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->W:I

    if-nez v0, :cond_5

    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->X:Lcom/huawei/feedback/bean/d;

    invoke-virtual {v0}, Lcom/huawei/feedback/bean/d;->m()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 1586
    invoke-static {p0}, Lcom/huawei/feedback/e;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    .line 1587
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_5

    .line 1588
    invoke-static {v2}, Landroid/telephony/PhoneNumberUtils;->isGlobalPhoneNumber(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_4

    invoke-direct {p0, v2}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->b(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 1589
    :cond_4
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->X:Lcom/huawei/feedback/bean/d;

    invoke-virtual {v0, v2}, Lcom/huawei/feedback/bean/d;->g(Ljava/lang/String;)V

    .line 1594
    :cond_5
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->Y:Landroid/widget/EditText;

    iget-object v1, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->X:Lcom/huawei/feedback/bean/d;

    invoke-virtual {v1}, Lcom/huawei/feedback/bean/d;->m()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 1597
    invoke-direct {p0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->q()V

    .line 1598
    return-void
.end method

.method static synthetic a(Lcom/huawei/feedback/ui/FeedbackEditActivity;Z)Z
    .locals 0

    .line 89
    iput-boolean p1, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->ah:Z

    return p1
.end method

.method private a(Ljava/lang/String;)Z
    .locals 3

    .line 1947
    const-string v0, "^\\d{11}$"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v1

    .line 1949
    invoke-virtual {v1, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v2

    .line 1950
    invoke-virtual {v2}, Ljava/util/regex/Matcher;->matches()Z

    move-result v0

    return v0
.end method

.method private a([I)Z
    .locals 2

    .line 2599
    array-length v0, p1

    const/4 v1, 0x1

    if-lt v0, v1, :cond_0

    const/4 v0, 0x0

    aget v0, p1, v0

    if-nez v0, :cond_0

    .line 2600
    const/4 v0, 0x1

    return v0

    .line 2602
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method static synthetic b(Lcom/huawei/feedback/ui/FeedbackEditActivity;)Landroid/content/Context;
    .locals 1

    .line 89
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->A:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic b(Lcom/huawei/feedback/ui/FeedbackEditActivity;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 89
    iput-object p1, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->au:Ljava/lang/String;

    return-object p1
.end method

.method private b(I)V
    .locals 2

    .line 1493
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->ag:Landroid/widget/LinearLayout;

    if-nez v0, :cond_0

    .line 1494
    return-void

    .line 1496
    :cond_0
    const/16 v0, 0x12c

    if-ne v0, p1, :cond_1

    .line 1497
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->ag:Landroid/widget/LinearLayout;

    const-string v1, "feedback_bg_red"

    invoke-static {p0, v1}, Lcom/huawei/feedback/f;->f(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    invoke-static {p0, v1}, Landroid/support/v4/content/ContextCompat;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 1498
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->Z:Landroid/widget/TextView;

    const-string v1, "#FA2A2D"

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    goto :goto_0

    .line 1500
    :cond_1
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->ag:Landroid/widget/LinearLayout;

    const-string v1, "feedback_bg_gray"

    invoke-static {p0, v1}, Lcom/huawei/feedback/f;->f(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    invoke-static {p0, v1}, Landroid/support/v4/content/ContextCompat;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 1501
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->Z:Landroid/widget/TextView;

    const-string v1, "#B3B3B3"

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 1503
    :goto_0
    return-void
.end method

.method static synthetic b(Lcom/huawei/feedback/ui/FeedbackEditActivity;I)V
    .locals 0

    .line 89
    invoke-direct {p0, p1}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->b(I)V

    return-void
.end method

.method static synthetic b(Lcom/huawei/feedback/ui/FeedbackEditActivity;Z)V
    .locals 0

    .line 89
    invoke-direct {p0, p1}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->d(Z)V

    return-void
.end method

.method private b(Ljava/lang/String;Ljava/lang/String;)V
    .locals 6

    .line 2201
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2203
    return-void

    .line 2207
    :cond_0
    invoke-static {p0}, Lcom/huawei/feedback/e;->a(Landroid/app/Activity;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 2208
    const-string v0, "android.permission.WRITE_EXTERNAL_STORAGE"

    const/16 v1, 0x1001

    invoke-static {p0, v0, v1}, Lcom/huawei/feedback/e;->a(Landroid/app/Activity;Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2210
    return-void

    .line 2217
    :cond_1
    invoke-static {p1}, Lcom/huawei/feedback/e;->e(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 2218
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->A:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->A:Landroid/content/Context;

    iget-object v2, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->A:Landroid/content/Context;

    const-string v3, "feedback_file_format_not_support"

    .line 2219
    invoke-static {v2, v3}, Lcom/huawei/feedback/f;->b(Landroid/content/Context;Ljava/lang/String;)I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 2218
    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    .line 2220
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 2222
    return-void

    .line 2225
    :cond_2
    new-instance v4, Ljava/io/File;

    invoke-direct {v4, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 2227
    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_3

    .line 2228
    return-void

    .line 2232
    :cond_3
    invoke-static {p1}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v5

    .line 2233
    const/4 v0, 0x0

    if-ne v0, v5, :cond_4

    .line 2234
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->A:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->A:Landroid/content/Context;

    iget-object v2, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->A:Landroid/content/Context;

    const-string v3, "feedback_file_format_not_support"

    .line 2235
    invoke-static {v2, v3}, Lcom/huawei/feedback/f;->b(Landroid/content/Context;Ljava/lang/String;)I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 2234
    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    .line 2236
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 2238
    return-void

    .line 2240
    :cond_4
    invoke-virtual {v5}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_5

    .line 2241
    invoke-virtual {v5}, Landroid/graphics/Bitmap;->recycle()V

    .line 2246
    :cond_5
    invoke-direct {p0, p1, p2}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 2247
    return-void
.end method

.method private static b(Z)V
    .locals 0

    .line 340
    sput-boolean p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->ak:Z

    .line 341
    return-void
.end method

.method static synthetic b()Z
    .locals 1

    .line 89
    sget-boolean v0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->ak:Z

    return v0
.end method

.method private b(Ljava/lang/String;)Z
    .locals 1

    .line 1954
    const-string v0, "^[a-zA-Z0-9]+([\\_|\\-|\\.]?[a-zA-Z0-9])*\\@[a-zA-Z0-9]+([\\_|\\-|\\.]?[a-zA-Z0-9])*\\.[a-zA-Z]{2,3}$"

    invoke-virtual {p1, v0}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method static synthetic c(Lcom/huawei/feedback/ui/FeedbackEditActivity;)Landroid/view/View;
    .locals 1

    .line 89
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->Q:Landroid/view/View;

    return-object v0
.end method

.method static synthetic c(Lcom/huawei/feedback/ui/FeedbackEditActivity;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 89
    iput-object p1, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->O:Ljava/lang/String;

    return-object p1
.end method

.method private c()V
    .locals 2

    .line 795
    invoke-virtual {p0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 796
    const-string v0, "FeedbackEditActivity"

    const-string v1, "FeedbackEditActivity.this.isFinishing().LACKOF_SPACE"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 797
    return-void

    .line 799
    :cond_0
    invoke-direct {p0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->e()V

    .line 800
    invoke-direct {p0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->o()V

    .line 801
    return-void
.end method

.method private c(Z)V
    .locals 0

    .line 345
    invoke-static {p1}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->b(Z)V

    .line 346
    return-void
.end method

.method static synthetic c(Lcom/huawei/feedback/ui/FeedbackEditActivity;Z)Z
    .locals 0

    .line 89
    iput-boolean p1, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->aC:Z

    return p1
.end method

.method static synthetic d(Lcom/huawei/feedback/ui/FeedbackEditActivity;)Landroid/webkit/WebView;
    .locals 1

    .line 89
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->R:Landroid/webkit/WebView;

    return-object v0
.end method

.method private d()V
    .locals 3

    .line 803
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->E:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v2, v0, -0x1

    .line 804
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->E:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x4

    if-ge v0, v1, :cond_0

    if-ltz v2, :cond_0

    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->E:Ljava/util/List;

    .line 805
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_1

    :cond_0
    const/4 v0, -0x1

    if-ne v2, v0, :cond_2

    .line 806
    :cond_1
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->E:Ljava/util/List;

    iget-object v1, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->F:Lcom/huawei/feedback/logic/c;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 809
    :cond_2
    invoke-direct {p0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->u()V

    .line 810
    return-void
.end method

.method private d(Z)V
    .locals 1

    .line 1626
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->ab:Landroid/widget/Button;

    invoke-virtual {v0, p1}, Landroid/widget/Button;->setEnabled(Z)V

    .line 1629
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->ac:Landroid/widget/Button;

    invoke-virtual {v0, p1}, Landroid/widget/Button;->setEnabled(Z)V

    .line 1631
    return-void
.end method

.method static synthetic d(Lcom/huawei/feedback/ui/FeedbackEditActivity;Ljava/lang/String;)Z
    .locals 1

    .line 89
    invoke-direct {p0, p1}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->a(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method static synthetic d(Lcom/huawei/feedback/ui/FeedbackEditActivity;Z)Z
    .locals 0

    .line 89
    iput-boolean p1, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->aK:Z

    return p1
.end method

.method static synthetic e(Lcom/huawei/feedback/ui/FeedbackEditActivity;)Landroid/view/View;
    .locals 1

    .line 89
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->P:Landroid/view/View;

    return-object v0
.end method

.method private e()V
    .locals 1

    .line 815
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->ax:Landroid/app/ProgressDialog;

    if-eqz v0, :cond_0

    .line 816
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->ax:Landroid/app/ProgressDialog;

    invoke-virtual {v0}, Landroid/app/ProgressDialog;->cancel()V

    .line 818
    :cond_0
    return-void
.end method

.method private f()V
    .locals 9

    .line 824
    invoke-virtual {p0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 825
    const-string v0, "FeedbackEditActivity"

    const-string v1, "FeedbackEditActivity.this.isFinishing().THIRD_APP_LOG_FAILED"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 826
    return-void

    .line 829
    :cond_0
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->aw:Ljava/io/File;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->aw:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 830
    const/4 v7, 0x0

    :goto_0
    const/4 v0, 0x2

    if-ge v7, v0, :cond_2

    .line 831
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->aw:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    move-result v8

    .line 832
    if-eqz v8, :cond_1

    .line 833
    const-string v0, "FeedbackEditActivity"

    const-string v1, "THIRD_APP_LOG_FAILED package file delete sccess!"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 834
    goto :goto_1

    .line 836
    :cond_1
    const-string v0, "FeedbackEditActivity"

    const-string v1, "THIRD_APP_LOG_FAILED package file delete fail and try again"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 830
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 842
    :cond_2
    :goto_1
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->ax:Landroid/app/ProgressDialog;

    if-eqz v0, :cond_3

    .line 843
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->ax:Landroid/app/ProgressDialog;

    invoke-virtual {v0}, Landroid/app/ProgressDialog;->cancel()V

    .line 846
    :cond_3
    invoke-static {}, Lcom/huawei/phoneserviceuni/common/e/b/a;->a()Lcom/huawei/phoneserviceuni/common/e/b/a;

    move-result-object v0

    new-instance v1, Lcom/huawei/feedback/logic/i;

    iget-object v2, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->X:Lcom/huawei/feedback/bean/d;

    iget v3, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->W:I

    iget-object v4, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->A:Landroid/content/Context;

    const-string v5, "0"

    iget-object v6, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->X:Lcom/huawei/feedback/bean/d;

    .line 847
    invoke-virtual {v6}, Lcom/huawei/feedback/bean/d;->p()Ljava/lang/String;

    move-result-object v6

    invoke-direct/range {v1 .. v6}, Lcom/huawei/feedback/logic/i;-><init>(Lcom/huawei/feedback/bean/d;ILandroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/b/a;->a(Ljava/lang/Runnable;)V

    .line 849
    invoke-virtual {p0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->finish()V

    .line 850
    return-void
.end method

.method static synthetic f(Lcom/huawei/feedback/ui/FeedbackEditActivity;)V
    .locals 0

    .line 89
    invoke-direct {p0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->v()V

    return-void
.end method

.method static synthetic g(Lcom/huawei/feedback/ui/FeedbackEditActivity;)Landroid/widget/CheckBox;
    .locals 1

    .line 89
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->N:Landroid/widget/CheckBox;

    return-object v0
.end method

.method private g()V
    .locals 4

    .line 853
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->ay:Lcom/huawei/lcagent/client/LogMetricInfo;

    if-eqz v0, :cond_2

    .line 854
    new-instance v3, Ljava/io/File;

    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->ay:Lcom/huawei/lcagent/client/LogMetricInfo;

    iget-object v0, v0, Lcom/huawei/lcagent/client/LogMetricInfo;->path:Ljava/lang/String;

    invoke-direct {v3, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 855
    const-string v0, "FeedbackEditActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "logMetricInfoFile:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v3}, Ljava/io/File;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 856
    invoke-virtual {v3}, Ljava/io/File;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 857
    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {v3}, Ljava/io/File;->delete()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 859
    const-string v0, "FeedbackEditActivity"

    const-string v1, "logMetricInfoFile file delete success!"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 861
    :cond_0
    const-string v0, "FeedbackEditActivity"

    const-string v1, "logMetricInfoFile file not exist or error! file delete fail!"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 867
    :cond_1
    const-string v0, "FeedbackEditActivity"

    const-string v1, "logMetricInfoFile file path is empty or null!"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 870
    :cond_2
    :goto_0
    return-void
.end method

.method static synthetic h(Lcom/huawei/feedback/ui/FeedbackEditActivity;)Lcom/huawei/feedback/bean/d;
    .locals 1

    .line 89
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->X:Lcom/huawei/feedback/bean/d;

    return-object v0
.end method

.method private h()V
    .locals 2

    .line 1055
    const-string v0, "custom_actionbar"

    invoke-static {p0, v0}, Lcom/huawei/feedback/f;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/huawei/feedback/ui/CustomActionBar;

    iput-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->aM:Lcom/huawei/feedback/ui/CustomActionBar;

    .line 1056
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->aM:Lcom/huawei/feedback/ui/CustomActionBar;

    const-string v1, "feedback_other_app"

    invoke-static {p0, v1}, Lcom/huawei/feedback/f;->b(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/huawei/feedback/ui/CustomActionBar;->a(I)V

    .line 1057
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->aM:Lcom/huawei/feedback/ui/CustomActionBar;

    new-instance v1, Lcom/huawei/feedback/ui/ad;

    invoke-direct {v1, p0}, Lcom/huawei/feedback/ui/ad;-><init>(Lcom/huawei/feedback/ui/FeedbackEditActivity;)V

    invoke-virtual {v0, v1}, Lcom/huawei/feedback/ui/CustomActionBar;->a(Lcom/huawei/feedback/ui/CustomActionBar$a;)V

    .line 1065
    return-void
.end method

.method private i()V
    .locals 4

    .line 1269
    sget-boolean v0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->ak:Z

    if-nez v0, :cond_0

    .line 1270
    invoke-static {p0}, Lcom/huawei/feedback/e;->l(Landroid/content/Context;)Z

    move-result v0

    invoke-direct {p0, v0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->c(Z)V

    .line 1275
    :cond_0
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->A:Landroid/content/Context;

    const-string v1, "feedback_edit_50"

    invoke-static {v0, v1}, Lcom/huawei/feedback/f;->c(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->setContentView(I)V

    .line 1280
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->A:Landroid/content/Context;

    const-string v1, "scrollView"

    invoke-static {v0, v1}, Lcom/huawei/feedback/f;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ScrollView;

    iput-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->T:Landroid/widget/ScrollView;

    .line 1281
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->A:Landroid/content/Context;

    const-string v1, "layout_et"

    invoke-static {v0, v1}, Lcom/huawei/feedback/f;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->ag:Landroid/widget/LinearLayout;

    .line 1282
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->A:Landroid/content/Context;

    const-string v1, "feedback_edit_layout"

    invoke-static {v0, v1}, Lcom/huawei/feedback/f;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->P:Landroid/view/View;

    .line 1283
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->P:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 1284
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->A:Landroid/content/Context;

    const-string v1, "feedback_web_layout"

    invoke-static {v0, v1}, Lcom/huawei/feedback/f;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->Q:Landroid/view/View;

    .line 1285
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->Q:Landroid/view/View;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 1286
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->Q:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 1288
    :cond_1
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->A:Landroid/content/Context;

    const-string v1, "feedback_webview"

    invoke-static {v0, v1}, Lcom/huawei/feedback/f;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/webkit/WebView;

    iput-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->R:Landroid/webkit/WebView;

    .line 1289
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->R:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setGeolocationEnabled(Z)V

    .line 1290
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->R:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setAllowFileAccess(Z)V

    .line 1291
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->A:Landroid/content/Context;

    const-string v1, "feedback_progressbar"

    invoke-static {v0, v1}, Lcom/huawei/feedback/f;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    iput-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->S:Landroid/widget/ProgressBar;

    .line 1293
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->A:Landroid/content/Context;

    const-string v1, "enter_qq_lay"

    invoke-static {v0, v1}, Lcom/huawei/feedback/f;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->al:Landroid/widget/LinearLayout;

    .line 1294
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->al:Landroid/widget/LinearLayout;

    iget-object v1, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->aN:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1296
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->A:Landroid/content/Context;

    const-string v1, "police_service_lay"

    invoke-static {v0, v1}, Lcom/huawei/feedback/f;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->am:Landroid/widget/LinearLayout;

    .line 1297
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->am:Landroid/widget/LinearLayout;

    iget-object v1, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->aO:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1298
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->A:Landroid/content/Context;

    const-string v1, "hotline_service_lay"

    invoke-static {v0, v1}, Lcom/huawei/feedback/f;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->an:Landroid/widget/LinearLayout;

    .line 1299
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->an:Landroid/widget/LinearLayout;

    iget-object v1, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->aP:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1301
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->A:Landroid/content/Context;

    const-string v1, "qq_service_text"

    invoke-static {v0, v1}, Lcom/huawei/feedback/f;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->ao:Landroid/widget/TextView;

    .line 1302
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->A:Landroid/content/Context;

    const-string v1, "police_service_text"

    invoke-static {v0, v1}, Lcom/huawei/feedback/f;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->ap:Landroid/widget/TextView;

    .line 1303
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->A:Landroid/content/Context;

    const-string v1, "hotline_text"

    invoke-static {v0, v1}, Lcom/huawei/feedback/f;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->aq:Landroid/widget/TextView;

    .line 1304
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->A:Landroid/content/Context;

    const-string v1, "hotline_img"

    invoke-static {v0, v1}, Lcom/huawei/feedback/f;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->ar:Landroid/widget/ImageView;

    .line 1306
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->A:Landroid/content/Context;

    const-string v1, "radioGroup"

    invoke-static {v0, v1}, Lcom/huawei/feedback/f;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RadioGroup;

    iput-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->J:Landroid/widget/RadioGroup;

    .line 1316
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->J:Landroid/widget/RadioGroup;

    new-instance v1, Lcom/huawei/feedback/ui/o;

    invoke-direct {v1, p0}, Lcom/huawei/feedback/ui/o;-><init>(Lcom/huawei/feedback/ui/FeedbackEditActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/RadioGroup;->setOnCheckedChangeListener(Landroid/widget/RadioGroup$OnCheckedChangeListener;)V

    .line 1331
    invoke-direct {p0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->p()V

    .line 1333
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->A:Landroid/content/Context;

    const-string v1, "feedback_edit_activity_content_edittext"

    .line 1334
    invoke-static {v0, v1}, Lcom/huawei/feedback/f;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    .line 1333
    invoke-virtual {p0, v0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    iput-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->M:Landroid/widget/EditText;

    .line 1335
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->A:Landroid/content/Context;

    const-string v1, "feedback_edit_activity_contact_edittext"

    invoke-static {v0, v1}, Lcom/huawei/feedback/f;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    iput-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->Y:Landroid/widget/EditText;

    .line 1336
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->A:Landroid/content/Context;

    const-string v1, "feedback_edit_count"

    invoke-static {v0, v1}, Lcom/huawei/feedback/f;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->Z:Landroid/widget/TextView;

    .line 1337
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->A:Landroid/content/Context;

    const-string v1, "name_cancel"

    invoke-static {v0, v1}, Lcom/huawei/feedback/f;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->aa:Landroid/widget/ImageView;

    .line 1339
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->Y:Landroid/widget/EditText;

    new-instance v1, Lcom/huawei/feedback/ui/p;

    invoke-direct {v1, p0}, Lcom/huawei/feedback/ui/p;-><init>(Lcom/huawei/feedback/ui/FeedbackEditActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 1357
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->M:Landroid/widget/EditText;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 1368
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->M:Landroid/widget/EditText;

    const/4 v1, 0x1

    new-array v1, v1, [Landroid/text/InputFilter;

    new-instance v2, Lcom/huawei/phoneserviceuni/common/widget/EditTextInputFilter;

    const/16 v3, 0x12c

    invoke-direct {v2, v3}, Lcom/huawei/phoneserviceuni/common/widget/EditTextInputFilter;-><init>(I)V

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setFilters([Landroid/text/InputFilter;)V

    .line 1371
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->M:Landroid/widget/EditText;

    new-instance v1, Lcom/huawei/feedback/ui/FeedbackEditActivity$a;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/huawei/feedback/ui/FeedbackEditActivity$a;-><init>(Lcom/huawei/feedback/ui/FeedbackEditActivity;Lcom/huawei/feedback/ui/n;)V

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 1376
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->A:Landroid/content/Context;

    const-string v1, "feedback_edit_activity_image"

    invoke-static {v0, v1}, Lcom/huawei/feedback/f;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->ad:Landroid/widget/ImageView;

    .line 1380
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->A:Landroid/content/Context;

    const-string v1, "feedback_record_textview"

    invoke-static {v0, v1}, Lcom/huawei/feedback/f;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->ae:Landroid/widget/TextView;

    .line 1384
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->ae:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->aQ:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1387
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->A:Landroid/content/Context;

    const-string v1, "feedback_add_image_grid"

    invoke-static {v0, v1}, Lcom/huawei/feedback/f;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/GridView;

    iput-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->C:Landroid/widget/GridView;

    .line 1389
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->E:Ljava/util/List;

    iget-object v1, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->F:Lcom/huawei/feedback/logic/c;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1390
    new-instance v0, Lcom/huawei/feedback/ui/an;

    iget-object v1, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->E:Ljava/util/List;

    iget-object v2, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->A:Landroid/content/Context;

    iget-object v3, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->k:Landroid/os/Handler;

    invoke-direct {v0, v1, v2, v3}, Lcom/huawei/feedback/ui/an;-><init>(Ljava/util/List;Landroid/content/Context;Landroid/os/Handler;)V

    iput-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->D:Lcom/huawei/feedback/ui/an;

    .line 1391
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->C:Landroid/widget/GridView;

    iget-object v1, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->D:Lcom/huawei/feedback/ui/an;

    invoke-virtual {v0, v1}, Landroid/widget/GridView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 1392
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->C:Landroid/widget/GridView;

    iget-object v1, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->aS:Landroid/widget/AdapterView$OnItemClickListener;

    invoke-virtual {v0, v1}, Landroid/widget/GridView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 1394
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->A:Landroid/content/Context;

    const-string v1, "feedback_edit_activity_log_checkbox"

    invoke-static {v0, v1}, Lcom/huawei/feedback/f;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/CheckBox;

    iput-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->N:Landroid/widget/CheckBox;

    .line 1395
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->N:Landroid/widget/CheckBox;

    new-instance v1, Lcom/huawei/feedback/ui/FeedbackEditActivity$k;

    invoke-direct {v1, p0}, Lcom/huawei/feedback/ui/FeedbackEditActivity$k;-><init>(Lcom/huawei/feedback/ui/FeedbackEditActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1396
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->A:Landroid/content/Context;

    const-string v1, "systemlog_layout"

    invoke-static {v0, v1}, Lcom/huawei/feedback/f;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->U:Landroid/widget/RelativeLayout;

    .line 1397
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->U:Landroid/widget/RelativeLayout;

    new-instance v1, Lcom/huawei/feedback/ui/FeedbackEditActivity$l;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/huawei/feedback/ui/FeedbackEditActivity$l;-><init>(Lcom/huawei/feedback/ui/FeedbackEditActivity;Lcom/huawei/feedback/ui/n;)V

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 1398
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->U:Landroid/widget/RelativeLayout;

    iget-object v1, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->aR:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1400
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->Y:Landroid/widget/EditText;

    const/4 v1, 0x1

    new-array v1, v1, [Landroid/text/InputFilter;

    new-instance v2, Lcom/huawei/phoneserviceuni/common/widget/EditTextInputFilter;

    const/16 v3, 0x32

    invoke-direct {v2, v3}, Lcom/huawei/phoneserviceuni/common/widget/EditTextInputFilter;-><init>(I)V

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setFilters([Landroid/text/InputFilter;)V

    .line 1402
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->aa:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->aT:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1406
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->A:Landroid/content/Context;

    const-string v1, "feedback_edit_activity_send_btn"

    invoke-static {v0, v1}, Lcom/huawei/feedback/f;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->ab:Landroid/widget/Button;

    .line 1407
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->A:Landroid/content/Context;

    const-string v1, "feedback_send_btn"

    invoke-static {v0, v1}, Lcom/huawei/feedback/f;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->ac:Landroid/widget/Button;

    .line 1408
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->ab:Landroid/widget/Button;

    new-instance v1, Lcom/huawei/feedback/ui/FeedbackEditActivity$j;

    invoke-direct {v1, p0}, Lcom/huawei/feedback/ui/FeedbackEditActivity$j;-><init>(Lcom/huawei/feedback/ui/FeedbackEditActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1409
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->ac:Landroid/widget/Button;

    new-instance v1, Lcom/huawei/feedback/ui/FeedbackEditActivity$j;

    invoke-direct {v1, p0}, Lcom/huawei/feedback/ui/FeedbackEditActivity$j;-><init>(Lcom/huawei/feedback/ui/FeedbackEditActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1410
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->d(Z)V

    .line 1412
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->Y:Landroid/widget/EditText;

    new-instance v1, Lcom/huawei/feedback/ui/FeedbackEditActivity$b;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/huawei/feedback/ui/FeedbackEditActivity$b;-><init>(Lcom/huawei/feedback/ui/FeedbackEditActivity;Lcom/huawei/feedback/ui/n;)V

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 1420
    return-void
.end method

.method static synthetic i(Lcom/huawei/feedback/ui/FeedbackEditActivity;)Z
    .locals 1

    .line 89
    iget-boolean v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->ah:Z

    return v0
.end method

.method static synthetic j(Lcom/huawei/feedback/ui/FeedbackEditActivity;)Ljava/util/List;
    .locals 1

    .line 89
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->E:Ljava/util/List;

    return-object v0
.end method

.method private j()V
    .locals 2

    .line 1602
    invoke-virtual {p0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->getActionBar()Landroid/app/ActionBar;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->aL:Landroid/app/ActionBar;

    .line 1603
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->aL:Landroid/app/ActionBar;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 1604
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->aL:Landroid/app/ActionBar;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/app/ActionBar;->setDisplayShowCustomEnabled(Z)V

    .line 1605
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->aL:Landroid/app/ActionBar;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/app/ActionBar;->setDisplayHomeAsUpEnabled(Z)V

    .line 1607
    :cond_0
    return-void
.end method

.method static synthetic k(Lcom/huawei/feedback/ui/FeedbackEditActivity;)Landroid/widget/EditText;
    .locals 1

    .line 89
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->Y:Landroid/widget/EditText;

    return-object v0
.end method

.method private k()V
    .locals 1

    .line 1636
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->X:Lcom/huawei/feedback/bean/d;

    invoke-virtual {v0}, Lcom/huawei/feedback/bean/d;->b()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 1645
    return-void
.end method

.method static synthetic l(Lcom/huawei/feedback/ui/FeedbackEditActivity;)Ljava/io/File;
    .locals 1

    .line 89
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->aw:Ljava/io/File;

    return-object v0
.end method

.method private l()V
    .locals 9

    .line 1675
    const/4 v0, 0x1

    invoke-static {v0}, Lcom/huawei/feedback/e;->a(I)V

    .line 1681
    invoke-static {p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->A:Landroid/content/Context;

    const-string v2, "feedback_dialog_textview"

    .line 1682
    invoke-static {v1, v2}, Lcom/huawei/feedback/f;->c(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v4

    .line 1692
    new-instance v5, Landroid/app/AlertDialog$Builder;

    invoke-direct {v5, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 1693
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->A:Landroid/content/Context;

    const-string v1, "textView"

    invoke-static {v0, v1}, Lcom/huawei/feedback/f;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Landroid/widget/TextView;

    .line 1697
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->aw:Ljava/io/File;

    if-nez v0, :cond_0

    .line 1698
    return-void

    .line 1703
    :cond_0
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->aw:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->length()J

    move-result-wide v0

    long-to-double v0, v0

    const-wide/high16 v2, 0x4090000000000000L    # 1024.0

    div-double v7, v0, v2

    .line 1706
    const-wide/high16 v0, 0x4090000000000000L    # 1024.0

    cmpg-double v0, v7, v0

    if-gez v0, :cond_1

    .line 1707
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->A:Landroid/content/Context;

    const-string v1, "feedback_advanced_logupload_tips_new_two"

    .line 1708
    invoke-static {v0, v1}, Lcom/huawei/feedback/f;->b(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    .line 1709
    invoke-static {v7, v8}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v2

    double-to-int v2, v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    .line 1708
    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 1707
    invoke-virtual {v6, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 1711
    :cond_1
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->A:Landroid/content/Context;

    const-string v1, "feedback_advanced_logupload_tips_new"

    .line 1712
    invoke-static {v0, v1}, Lcom/huawei/feedback/f;->b(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-wide/high16 v2, 0x4090000000000000L    # 1024.0

    div-double v2, v7, v2

    .line 1713
    invoke-static {v2, v3}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v2

    double-to-int v2, v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    .line 1712
    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 1711
    invoke-virtual {v6, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1716
    :goto_0
    const-string v0, "FeedbackEditActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "fileResultLength = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v7, v8}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 1718
    invoke-virtual {v5, v4}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    .line 1720
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->A:Landroid/content/Context;

    const-string v1, "feedback_ok"

    invoke-static {v0, v1}, Lcom/huawei/feedback/f;->b(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lcom/huawei/feedback/ui/FeedbackEditActivity$h;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/huawei/feedback/ui/FeedbackEditActivity$h;-><init>(Lcom/huawei/feedback/ui/FeedbackEditActivity;Lcom/huawei/feedback/ui/n;)V

    invoke-virtual {v5, v0, v1}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->A:Landroid/content/Context;

    const-string v2, "feedback_cancel"

    .line 1721
    invoke-static {v1, v2}, Lcom/huawei/feedback/f;->b(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    invoke-virtual {p0, v1}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/huawei/feedback/ui/FeedbackEditActivity$g;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v3}, Lcom/huawei/feedback/ui/FeedbackEditActivity$g;-><init>(Lcom/huawei/feedback/ui/FeedbackEditActivity;Lcom/huawei/feedback/ui/n;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 1724
    invoke-virtual {v5}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->K:Landroid/app/AlertDialog;

    .line 1725
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->K:Landroid/app/AlertDialog;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog;->setCanceledOnTouchOutside(Z)V

    .line 1726
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->K:Landroid/app/AlertDialog;

    iget-object v1, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->B:Landroid/content/DialogInterface$OnKeyListener;

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog;->setOnKeyListener(Landroid/content/DialogInterface$OnKeyListener;)V

    .line 1727
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->K:Landroid/app/AlertDialog;

    invoke-virtual {v0}, Landroid/app/AlertDialog;->show()V

    .line 1728
    return-void
.end method

.method private m()V
    .locals 6

    .line 1732
    new-instance v3, Landroid/app/AlertDialog$Builder;

    invoke-direct {v3, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 1733
    invoke-static {p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const-string v1, "feedback_dialog_textview"

    .line 1734
    invoke-static {p0, v1}, Lcom/huawei/feedback/f;->c(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v4

    .line 1735
    const-string v0, "textView"

    invoke-static {p0, v0}, Lcom/huawei/feedback/f;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/widget/TextView;

    .line 1736
    const-string v0, "feedback_oversea_tip"

    invoke-static {p0, v0}, Lcom/huawei/feedback/f;->b(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v5, v0}, Landroid/widget/TextView;->setText(I)V

    .line 1739
    invoke-virtual {v3, v4}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    .line 1741
    const-string v0, "feedback_advanced_success_confirm"

    invoke-static {p0, v0}, Lcom/huawei/feedback/f;->b(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lcom/huawei/feedback/ui/FeedbackEditActivity$f;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/huawei/feedback/ui/FeedbackEditActivity$f;-><init>(Lcom/huawei/feedback/ui/FeedbackEditActivity;Lcom/huawei/feedback/ui/n;)V

    invoke-virtual {v3, v0, v1}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 1743
    invoke-virtual {v3}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->L:Landroid/app/AlertDialog;

    .line 1744
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->L:Landroid/app/AlertDialog;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog;->setCanceledOnTouchOutside(Z)V

    .line 1745
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->L:Landroid/app/AlertDialog;

    iget-object v1, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->B:Landroid/content/DialogInterface$OnKeyListener;

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog;->setOnKeyListener(Landroid/content/DialogInterface$OnKeyListener;)V

    .line 1746
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->L:Landroid/app/AlertDialog;

    invoke-virtual {v0}, Landroid/app/AlertDialog;->show()V

    .line 1747
    return-void
.end method

.method static synthetic m(Lcom/huawei/feedback/ui/FeedbackEditActivity;)V
    .locals 0

    .line 89
    invoke-direct {p0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->g()V

    return-void
.end method

.method private n()V
    .locals 5

    .line 1811
    invoke-static {}, Lcom/huawei/phoneserviceuni/common/e/a;->m()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1812
    invoke-static {p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->A:Landroid/content/Context;

    const-string v2, "feedback_dialog_zipfailed_new"

    .line 1813
    invoke-static {v1, v2}, Lcom/huawei/feedback/f;->c(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v3

    goto :goto_0

    .line 1815
    :cond_0
    invoke-static {p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->A:Landroid/content/Context;

    const-string v2, "feedback_dialog_zipfailed"

    .line 1816
    invoke-static {v1, v2}, Lcom/huawei/feedback/f;->c(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v3

    .line 1820
    :goto_0
    new-instance v4, Landroid/app/AlertDialog$Builder;

    invoke-direct {v4, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 1821
    invoke-virtual {v4, v3}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    .line 1822
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->A:Landroid/content/Context;

    const-string v1, "feedback_advanced_fail_confirm_one"

    invoke-static {v0, v1}, Lcom/huawei/feedback/f;->b(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lcom/huawei/feedback/ui/s;

    invoke-direct {v1, p0}, Lcom/huawei/feedback/ui/s;-><init>(Lcom/huawei/feedback/ui/FeedbackEditActivity;)V

    invoke-virtual {v4, v0, v1}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->A:Landroid/content/Context;

    const-string v2, "feedback_cancel"

    .line 1836
    invoke-static {v1, v2}, Lcom/huawei/feedback/f;->b(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    invoke-virtual {p0, v1}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/huawei/feedback/ui/r;

    invoke-direct {v2, p0}, Lcom/huawei/feedback/ui/r;-><init>(Lcom/huawei/feedback/ui/FeedbackEditActivity;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 1851
    invoke-virtual {v4}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->aA:Landroid/app/AlertDialog;

    .line 1852
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->aA:Landroid/app/AlertDialog;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog;->setCanceledOnTouchOutside(Z)V

    .line 1853
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->aA:Landroid/app/AlertDialog;

    iget-object v1, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->B:Landroid/content/DialogInterface$OnKeyListener;

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog;->setOnKeyListener(Landroid/content/DialogInterface$OnKeyListener;)V

    .line 1854
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->aA:Landroid/app/AlertDialog;

    invoke-virtual {v0}, Landroid/app/AlertDialog;->show()V

    .line 1855
    return-void
.end method

.method static synthetic n(Lcom/huawei/feedback/ui/FeedbackEditActivity;)V
    .locals 0

    .line 89
    invoke-direct {p0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->e()V

    return-void
.end method

.method private o()V
    .locals 5

    .line 1862
    invoke-static {}, Lcom/huawei/phoneserviceuni/common/e/a;->m()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1863
    invoke-static {p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->A:Landroid/content/Context;

    const-string v2, "feedback_dialog_lackof_space_new"

    .line 1864
    invoke-static {v1, v2}, Lcom/huawei/feedback/f;->c(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v3

    goto :goto_0

    .line 1866
    :cond_0
    invoke-static {p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->A:Landroid/content/Context;

    const-string v2, "feedback_dialog_lackof_space"

    .line 1867
    invoke-static {v1, v2}, Lcom/huawei/feedback/f;->c(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v3

    .line 1870
    :goto_0
    new-instance v4, Landroid/app/AlertDialog$Builder;

    invoke-direct {v4, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 1871
    invoke-virtual {v4, v3}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    .line 1872
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->A:Landroid/content/Context;

    const-string v1, "feedback_advanced_success_confirm"

    invoke-static {v0, v1}, Lcom/huawei/feedback/f;->b(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lcom/huawei/feedback/ui/t;

    invoke-direct {v1, p0}, Lcom/huawei/feedback/ui/t;-><init>(Lcom/huawei/feedback/ui/FeedbackEditActivity;)V

    invoke-virtual {v4, v0, v1}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 1887
    invoke-virtual {v4}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->aB:Landroid/app/AlertDialog;

    .line 1888
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->aB:Landroid/app/AlertDialog;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog;->setCanceledOnTouchOutside(Z)V

    .line 1889
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->aB:Landroid/app/AlertDialog;

    iget-object v1, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->B:Landroid/content/DialogInterface$OnKeyListener;

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog;->setOnKeyListener(Landroid/content/DialogInterface$OnKeyListener;)V

    .line 1890
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->aB:Landroid/app/AlertDialog;

    invoke-virtual {v0}, Landroid/app/AlertDialog;->show()V

    .line 1891
    return-void
.end method

.method static synthetic o(Lcom/huawei/feedback/ui/FeedbackEditActivity;)V
    .locals 0

    .line 89
    invoke-direct {p0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->l()V

    return-void
.end method

.method private p()V
    .locals 2

    .line 1897
    new-instance v0, Lcom/huawei/feedback/ui/FeedbackEditActivity$d;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/huawei/feedback/ui/FeedbackEditActivity$d;-><init>(Lcom/huawei/feedback/ui/n;)V

    iput-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->B:Landroid/content/DialogInterface$OnKeyListener;

    .line 1898
    return-void
.end method

.method static synthetic p(Lcom/huawei/feedback/ui/FeedbackEditActivity;)V
    .locals 0

    .line 89
    invoke-direct {p0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->n()V

    return-void
.end method

.method private q()V
    .locals 3

    .line 2124
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->M:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    .line 2126
    const/4 v2, 0x0

    .line 2127
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    .line 2130
    if-lez v2, :cond_0

    const/16 v0, 0x12c

    if-gt v2, v0, :cond_0

    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->Y:Landroid/widget/EditText;

    .line 2132
    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 2137
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->d(Z)V

    goto :goto_0

    .line 2140
    :cond_0
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->d(Z)V

    .line 2142
    :goto_0
    return-void
.end method

.method static synthetic q(Lcom/huawei/feedback/ui/FeedbackEditActivity;)V
    .locals 0

    .line 89
    invoke-direct {p0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->c()V

    return-void
.end method

.method private r()V
    .locals 3

    .line 2294
    const-string v0, "FeedbackEditActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "---!CommonConstants.isFromOutside()-->>"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {}, Lcom/huawei/feedback/d;->a()Z

    move-result v2

    if-nez v2, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 2295
    invoke-virtual {p0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->finish()V

    .line 2298
    return-void
.end method

.method static synthetic r(Lcom/huawei/feedback/ui/FeedbackEditActivity;)V
    .locals 0

    .line 89
    invoke-direct {p0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->f()V

    return-void
.end method

.method private s()V
    .locals 2

    .line 2407
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->A:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->ab:Landroid/widget/Button;

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/a;->a(Landroid/content/Context;Landroid/widget/Button;)V

    .line 2408
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->A:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->ac:Landroid/widget/Button;

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/a;->a(Landroid/content/Context;Landroid/widget/Button;)V

    .line 2425
    return-void
.end method

.method static synthetic s(Lcom/huawei/feedback/ui/FeedbackEditActivity;)V
    .locals 0

    .line 89
    invoke-direct {p0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->d()V

    return-void
.end method

.method static synthetic t(Lcom/huawei/feedback/ui/FeedbackEditActivity;)Landroid/widget/ScrollView;
    .locals 1

    .line 89
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->T:Landroid/widget/ScrollView;

    return-object v0
.end method

.method private t()V
    .locals 4

    .line 2606
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/huawei/feedback/logic/e;

    iget-object v2, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->k:Landroid/os/Handler;

    iget v3, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->aI:I

    invoke-direct {v1, v2, p0, v3}, Lcom/huawei/feedback/logic/e;-><init>(Landroid/os/Handler;Landroid/content/Context;I)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 2607
    return-void
.end method

.method static synthetic u(Lcom/huawei/feedback/ui/FeedbackEditActivity;)Landroid/widget/TextView;
    .locals 1

    .line 89
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->Z:Landroid/widget/TextView;

    return-object v0
.end method

.method private u()V
    .locals 2

    .line 2615
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->D:Lcom/huawei/feedback/ui/an;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 2616
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->D:Lcom/huawei/feedback/ui/an;

    invoke-virtual {v0}, Lcom/huawei/feedback/ui/an;->notifyDataSetChanged()V

    .line 2618
    :cond_0
    return-void
.end method

.method private v()V
    .locals 3

    .line 2640
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->R:Landroid/webkit/WebView;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 2641
    return-void

    .line 2643
    :cond_0
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->R:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v2

    .line 2648
    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Landroid/webkit/WebSettings;->setUseWideViewPort(Z)V

    .line 2649
    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Landroid/webkit/WebSettings;->setLoadWithOverviewMode(Z)V

    .line 2650
    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Landroid/webkit/WebSettings;->setSavePassword(Z)V

    .line 2651
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->aj:Lcom/huawei/feedback/bean/c;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->aj:Lcom/huawei/feedback/bean/c;

    invoke-virtual {v0}, Lcom/huawei/feedback/bean/c;->d()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->aj:Lcom/huawei/feedback/bean/c;

    invoke-virtual {v0}, Lcom/huawei/feedback/bean/c;->d()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/huawei/feedback/e;->c(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2653
    const-string v0, "FeedbackEditActivity"

    const-string v1, "initWebView setJavaScriptEnabled true"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 2654
    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    .line 2655
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->R:Landroid/webkit/WebView;

    invoke-static {v0}, Lcom/huawei/feedback/e;->a(Landroid/webkit/WebView;)V

    .line 2658
    :cond_1
    const/4 v0, -0x1

    invoke-virtual {v2, v0}, Landroid/webkit/WebSettings;->setCacheMode(I)V

    .line 2660
    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Landroid/webkit/WebSettings;->setAllowFileAccess(Z)V

    .line 2661
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->R:Landroid/webkit/WebView;

    iget-object v1, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->aU:Landroid/webkit/WebViewClient;

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    .line 2662
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->R:Landroid/webkit/WebView;

    iget-object v1, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->aV:Landroid/webkit/WebChromeClient;

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setWebChromeClient(Landroid/webkit/WebChromeClient;)V

    .line 2663
    return-void
.end method

.method static synthetic v(Lcom/huawei/feedback/ui/FeedbackEditActivity;)V
    .locals 0

    .line 89
    invoke-direct {p0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->q()V

    return-void
.end method

.method static synthetic w(Lcom/huawei/feedback/ui/FeedbackEditActivity;)Landroid/widget/ImageView;
    .locals 1

    .line 89
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->aa:Landroid/widget/ImageView;

    return-object v0
.end method

.method static synthetic x(Lcom/huawei/feedback/ui/FeedbackEditActivity;)I
    .locals 1

    .line 89
    iget v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->W:I

    return v0
.end method

.method static synthetic y(Lcom/huawei/feedback/ui/FeedbackEditActivity;)Lcom/huawei/lcagent/client/LogCollectManager;
    .locals 1

    .line 89
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->as:Lcom/huawei/lcagent/client/LogCollectManager;

    return-object v0
.end method

.method static synthetic z(Lcom/huawei/feedback/ui/FeedbackEditActivity;)Ljava/lang/String;
    .locals 1

    .line 89
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->O:Ljava/lang/String;

    return-object v0
.end method


# virtual methods
.method protected onActivityResult(IILandroid/content/Intent;)V
    .locals 2

    .line 2169
    sparse-switch p1, :sswitch_data_0

    goto :goto_0

    .line 2173
    :sswitch_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->ah:Z

    .line 2175
    const/4 v0, -0x1

    if-ne v0, p2, :cond_1

    .line 2177
    const/4 v0, 0x0

    if-eq v0, p3, :cond_1

    .line 2178
    invoke-direct {p0, p3}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->a(Landroid/content/Intent;)V

    goto :goto_0

    .line 2185
    :sswitch_1
    const/4 v0, -0x1

    if-ne v0, p2, :cond_1

    .line 2186
    const-string v0, "close_activity"

    const/4 v1, 0x0

    invoke-virtual {p3, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2187
    invoke-virtual {p0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->finish()V

    goto :goto_0

    .line 2188
    :cond_0
    const-string v0, "del_screenshot"

    const/4 v1, 0x0

    invoke-virtual {p3, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2189
    invoke-direct {p0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->k()V

    .line 2197
    :cond_1
    :goto_0
    return-void

    :sswitch_data_0
    .sparse-switch
        0xbcd -> :sswitch_0
        0xbce -> :sswitch_1
    .end sparse-switch
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 2

    .line 2391
    invoke-direct {p0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->s()V

    .line 2392
    invoke-super {p0, p1}, Lcom/huawei/feedback/ui/BaseActivity;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 2393
    iget v0, p1, Landroid/content/res/Configuration;->orientation:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 2394
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->ab:Landroid/widget/Button;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setVisibility(I)V

    .line 2395
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->ac:Landroid/widget/Button;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setVisibility(I)V

    goto :goto_0

    .line 2397
    :cond_0
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->ab:Landroid/widget/Button;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setVisibility(I)V

    .line 2398
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->ac:Landroid/widget/Button;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setVisibility(I)V

    .line 2402
    :goto_0
    return-void
.end method

.method public onContextItemSelected(Landroid/view/MenuItem;)Z
    .locals 1

    .line 2536
    invoke-direct {p0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->q()V

    .line 2538
    const/4 v0, 0x1

    return v0
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 5

    .line 902
    invoke-super {p0, p1}, Lcom/huawei/feedback/ui/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 903
    invoke-static {}, Lcom/huawei/feedback/FeedbackApi;->getApplicationcontext()Landroid/content/Context;

    move-result-object v0

    if-nez v0, :cond_0

    .line 904
    invoke-virtual {p0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/feedback/FeedbackApi;->setApplicationcontext(Landroid/content/Context;)V

    .line 907
    :cond_0
    const/4 v0, 0x0

    invoke-static {v0}, Lcom/huawei/feedback/d;->a(Z)V

    .line 909
    iput-object p0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->A:Landroid/content/Context;

    .line 911
    invoke-direct {p0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->j()V

    .line 917
    :try_start_0
    invoke-virtual {p0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_8

    .line 918
    invoke-virtual {p0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "appId"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    .line 919
    invoke-virtual {p0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "appId"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->aI:I

    .line 920
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->X:Lcom/huawei/feedback/bean/d;

    iget v1, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->aI:I

    invoke-virtual {v0, v1}, Lcom/huawei/feedback/bean/d;->d(I)V

    .line 921
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->V:Lcom/huawei/feedback/bean/d;

    iget v1, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->aI:I

    invoke-virtual {v0, v1}, Lcom/huawei/feedback/bean/d;->d(I)V

    .line 922
    const/4 v0, 0x1

    invoke-static {v0}, Lcom/huawei/feedback/d;->a(Z)V

    .line 925
    :cond_1
    invoke-virtual {p0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "questionType"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 926
    invoke-virtual {p0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "questionType"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 927
    invoke-virtual {p0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "questionType"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->at:Ljava/lang/String;

    .line 928
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->X:Lcom/huawei/feedback/bean/d;

    iget-object v1, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->at:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/huawei/feedback/bean/d;->h(Ljava/lang/String;)V

    .line 929
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->V:Lcom/huawei/feedback/bean/d;

    iget-object v1, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->at:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/huawei/feedback/bean/d;->h(Ljava/lang/String;)V

    .line 930
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->X:Lcom/huawei/feedback/bean/d;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/feedback/bean/d;->b(I)V

    .line 931
    const/4 v0, 0x1

    invoke-static {v0}, Lcom/huawei/feedback/d;->a(Z)V

    .line 934
    :cond_2
    invoke-virtual {p0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "logfilePath"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 935
    invoke-virtual {p0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "logfilePath"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->aD:Ljava/lang/String;

    .line 938
    :cond_3
    invoke-virtual {p0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "aesSecret"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    .line 939
    invoke-virtual {p0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "aesSecret"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->aE:Ljava/lang/String;

    .line 942
    :cond_4
    invoke-virtual {p0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "packageName"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_5

    .line 943
    invoke-virtual {p0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "packageName"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->aF:Ljava/lang/String;

    .line 946
    :cond_5
    invoke-virtual {p0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "packageVersion"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_6

    .line 947
    invoke-virtual {p0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "packageVersion"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->aG:Ljava/lang/String;

    .line 950
    :cond_6
    invoke-virtual {p0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "screenshotPath"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_7

    .line 952
    invoke-virtual {p0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "screenshotPath"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->aH:Ljava/lang/String;

    .line 954
    :cond_7
    invoke-virtual {p0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "displayHotline"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->aJ:Z
    :try_end_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 963
    :cond_8
    goto :goto_0

    .line 956
    :catch_0
    move-exception v4

    .line 957
    const/4 v0, 0x0

    invoke-static {v0}, Lcom/huawei/feedback/d;->a(Z)V

    .line 958
    const-string v0, "FeedbackEditActivity"

    const-string v1, "FeedbackEditActivity oncreate NotFoundException"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 963
    goto :goto_0

    .line 959
    :catch_1
    move-exception v4

    .line 961
    const/4 v0, 0x0

    invoke-static {v0}, Lcom/huawei/feedback/d;->a(Z)V

    .line 962
    const-string v0, "FeedbackEditActivity"

    const-string v1, "onCreate :: hostile attack exception"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 965
    :goto_0
    const-string v0, "FeedbackEditActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Edit feedback appid = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->aI:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 970
    :try_start_1
    new-instance v0, Lcom/huawei/lcagent/client/LogCollectManager;

    invoke-virtual {p0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/huawei/lcagent/client/LogCollectManager;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->as:Lcom/huawei/lcagent/client/LogCollectManager;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2

    .line 973
    goto :goto_1

    .line 971
    :catch_2
    move-exception v4

    .line 972
    const-string v0, "FeedbackEditActivity"

    const-string v1, "The init of the object logCollectManager is exception!"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 977
    :goto_1
    invoke-static {}, Lcom/huawei/feedback/d;->a()Z

    move-result v0

    if-eqz v0, :cond_9

    .line 978
    invoke-static {p0}, Lcom/huawei/feedback/e;->l(Landroid/content/Context;)Z

    move-result v0

    invoke-direct {p0, v0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->c(Z)V

    .line 980
    sget-boolean v0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->ak:Z

    if-eqz v0, :cond_9

    .line 981
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->X:Lcom/huawei/feedback/bean/d;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/huawei/feedback/bean/d;->a(Z)V

    .line 991
    :cond_9
    invoke-direct {p0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->i()V

    .line 992
    invoke-direct {p0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->s()V

    .line 999
    const/4 v0, 0x0

    if-ne v0, p1, :cond_a

    const/4 v0, 0x1

    goto :goto_2

    :cond_a
    const/4 v0, 0x0

    :goto_2
    invoke-direct {p0, v0, p1}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->a(ZLandroid/os/Bundle;)V

    .line 1002
    invoke-static {}, Lcom/huawei/feedback/e;->e()Z

    move-result v0

    if-nez v0, :cond_b

    invoke-static {p0}, Lcom/huawei/feedback/e;->n(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_b

    .line 1003
    invoke-direct {p0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->m()V

    .line 1004
    return-void

    .line 1006
    :cond_b
    invoke-virtual {p0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->getLastNonConfigurationInstance()Ljava/lang/Object;

    move-result-object v4

    .line 1007
    instance-of v0, v4, Lcom/huawei/feedback/ui/FeedbackEditActivity$i;

    if-eqz v0, :cond_c

    .line 1008
    move-object v0, v4

    check-cast v0, Lcom/huawei/feedback/ui/FeedbackEditActivity$i;

    iput-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->ai:Lcom/huawei/feedback/ui/FeedbackEditActivity$i;

    goto :goto_3

    .line 1009
    :cond_c
    instance-of v0, v4, Landroid/app/AlertDialog;

    if-eqz v0, :cond_e

    .line 1014
    invoke-static {}, Lcom/huawei/feedback/e;->d()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_e

    .line 1015
    move-object v0, v4

    check-cast v0, Landroid/app/AlertDialog;

    iput-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->K:Landroid/app/AlertDialog;

    .line 1019
    invoke-static {}, Lcom/huawei/feedback/a/b/b;->a()Lcom/huawei/feedback/a/b/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/feedback/a/b/b;->g()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_d

    .line 1020
    new-instance v0, Ljava/io/File;

    invoke-static {}, Lcom/huawei/feedback/a/b/b;->a()Lcom/huawei/feedback/a/b/b;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/feedback/a/b/b;->g()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->aw:Ljava/io/File;

    .line 1025
    :cond_d
    const-string v0, "FeedbackEditActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "waitUploadZipfile:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->aw:Ljava/io/File;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 1029
    :cond_e
    :goto_3
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->ai:Lcom/huawei/feedback/ui/FeedbackEditActivity$i;

    if-eqz v0, :cond_f

    .line 1030
    const-string v0, "FeedbackEditActivity"

    const-string v1, "packageThread != null"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 1032
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->ai:Lcom/huawei/feedback/ui/FeedbackEditActivity$i;

    iget-object v1, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->A:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lcom/huawei/feedback/ui/FeedbackEditActivity$i;->a(Landroid/content/Context;)V

    .line 1033
    new-instance v0, Landroid/app/ProgressDialog;

    iget-object v1, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->A:Landroid/content/Context;

    invoke-direct {v0, v1}, Landroid/app/ProgressDialog;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->ax:Landroid/app/ProgressDialog;

    .line 1034
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->ax:Landroid/app/ProgressDialog;

    iget-object v1, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->A:Landroid/content/Context;

    iget-object v2, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->A:Landroid/content/Context;

    const-string v3, "feedback_waiting"

    invoke-static {v2, v3}, Lcom/huawei/feedback/f;->b(Landroid/content/Context;Ljava/lang/String;)I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/ProgressDialog;->setMessage(Ljava/lang/CharSequence;)V

    .line 1035
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->ax:Landroid/app/ProgressDialog;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/app/ProgressDialog;->setCancelable(Z)V

    .line 1036
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->ax:Landroid/app/ProgressDialog;

    invoke-virtual {v0}, Landroid/app/ProgressDialog;->show()V

    .line 1039
    :cond_f
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->K:Landroid/app/AlertDialog;

    if-eqz v0, :cond_10

    .line 1040
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->K:Landroid/app/AlertDialog;

    invoke-virtual {v0}, Landroid/app/AlertDialog;->cancel()V

    .line 1041
    invoke-direct {p0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->l()V

    .line 1043
    :cond_10
    invoke-direct {p0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->t()V

    .line 1045
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->aH:Ljava/lang/String;

    const-string v1, ""

    invoke-direct {p0, v0, v1}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 1046
    invoke-direct {p0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->h()V

    .line 1047
    const-string v0, "feedback_edit_rootview"

    invoke-static {p0, v0}, Lcom/huawei/feedback/f;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    iget-object v1, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->aM:Lcom/huawei/feedback/ui/CustomActionBar;

    invoke-virtual {p0, v0, v1}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->a(ILcom/huawei/feedback/ui/CustomActionBar;)V

    .line 1048
    return-void
.end method

.method protected onDestroy()V
    .locals 1

    .line 2252
    invoke-super {p0}, Lcom/huawei/feedback/ui/BaseActivity;->onDestroy()V

    .line 2254
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->A:Landroid/content/Context;

    .line 2256
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->aC:Z

    .line 2265
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->ax:Landroid/app/ProgressDialog;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->ax:Landroid/app/ProgressDialog;

    invoke-virtual {v0}, Landroid/app/ProgressDialog;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2266
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->ax:Landroid/app/ProgressDialog;

    invoke-virtual {v0}, Landroid/app/ProgressDialog;->cancel()V

    .line 2267
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->ax:Landroid/app/ProgressDialog;

    .line 2275
    :cond_0
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->K:Landroid/app/AlertDialog;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->K:Landroid/app/AlertDialog;

    invoke-virtual {v0}, Landroid/app/AlertDialog;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2276
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->K:Landroid/app/AlertDialog;

    invoke-virtual {v0}, Landroid/app/AlertDialog;->cancel()V

    .line 2277
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->K:Landroid/app/AlertDialog;

    .line 2288
    :cond_1
    return-void
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 3

    .line 1154
    const-string v0, "FeedbackEditActivity"

    const-string v1, "---onKeyDown-->>"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 1155
    const/4 v0, 0x4

    if-ne p1, v0, :cond_4

    .line 1156
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->Q:Landroid/view/View;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->Q:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-nez v0, :cond_2

    .line 1157
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->R:Landroid/webkit/WebView;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->R:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->canGoBack()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1158
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->R:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->goBack()V

    goto :goto_0

    .line 1160
    :cond_0
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->Q:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 1161
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->P:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 1162
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->aL:Landroid/app/ActionBar;

    if-eqz v0, :cond_1

    .line 1163
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->aL:Landroid/app/ActionBar;

    iget-object v1, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->A:Landroid/content/Context;

    const-string v2, "feedback_other_app"

    invoke-static {v1, v2}, Lcom/huawei/feedback/f;->b(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/app/ActionBar;->setTitle(I)V

    .line 1166
    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0

    .line 1168
    :cond_2
    invoke-virtual {p2}, Landroid/view/KeyEvent;->getRepeatCount()I

    move-result v0

    if-nez v0, :cond_4

    iget-boolean v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->aC:Z

    if-nez v0, :cond_4

    .line 1170
    invoke-direct {p0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->r()V

    .line 1172
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->aD:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 1173
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->aD:Ljava/lang/String;

    invoke-static {v0}, Lcom/huawei/feedback/e;->f(Ljava/lang/String;)V

    .line 1175
    :cond_3
    const/4 v0, 0x1

    return v0

    .line 1178
    :cond_4
    invoke-super {p0, p1, p2}, Lcom/huawei/feedback/ui/BaseActivity;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result v0

    return v0
.end method

.method public onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 3

    .line 1125
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    const v1, 0x102002c

    if-ne v1, v0, :cond_3

    .line 1126
    const-string v0, "FeedbackEditActivity"

    const-string v1, "---onOptionsItemSelected-->>"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 1127
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->Q:Landroid/view/View;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->Q:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-nez v0, :cond_1

    .line 1128
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->R:Landroid/webkit/WebView;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->R:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->canGoBack()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1129
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->R:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->goBack()V

    goto :goto_0

    .line 1131
    :cond_0
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->Q:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 1132
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->P:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 1133
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->aL:Landroid/app/ActionBar;

    if-eqz v0, :cond_2

    .line 1134
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->aL:Landroid/app/ActionBar;

    iget-object v1, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->A:Landroid/content/Context;

    const-string v2, "feedback_other_app"

    invoke-static {v1, v2}, Lcom/huawei/feedback/f;->b(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/app/ActionBar;->setTitle(I)V

    goto :goto_0

    .line 1139
    :cond_1
    invoke-direct {p0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->r()V

    .line 1141
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->aD:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 1142
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->aD:Ljava/lang/String;

    invoke-static {v0}, Lcom/huawei/feedback/e;->f(Ljava/lang/String;)V

    .line 1145
    :cond_2
    :goto_0
    const/4 v0, 0x1

    return v0

    .line 1149
    :cond_3
    invoke-super {p0, p1}, Lcom/huawei/feedback/ui/BaseActivity;->onOptionsItemSelected(Landroid/view/MenuItem;)Z

    move-result v0

    return v0
.end method

.method protected onPause()V
    .locals 1

    .line 2345
    invoke-super {p0}, Lcom/huawei/feedback/ui/BaseActivity;->onPause()V

    .line 2348
    const-string v0, "onPause"

    invoke-static {p0, v0}, Lcom/huawei/feedback/f;->j(Landroid/content/Context;Ljava/lang/String;)V

    .line 2349
    const-string v0, "onReport"

    invoke-static {p0, v0}, Lcom/huawei/feedback/f;->j(Landroid/content/Context;Ljava/lang/String;)V

    .line 2352
    return-void
.end method

.method public onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    .locals 2

    .line 2554
    packed-switch p1, :pswitch_data_0

    goto/16 :goto_0

    .line 2556
    :pswitch_0
    invoke-direct {p0, p3}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->a([I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2557
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->ah:Z

    .line 2558
    const/16 v0, 0xbcd

    invoke-static {p0, v0}, Lcom/huawei/feedback/e;->a(Landroid/app/Activity;I)V

    goto :goto_0

    .line 2560
    :cond_0
    const-string v0, "FeedbackEditActivity"

    const-string v1, "WRITE_EXTERNAL_STORAGE Permission denied!"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 2564
    goto :goto_0

    .line 2567
    :pswitch_1
    invoke-direct {p0, p3}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->a([I)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2571
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->X:Lcom/huawei/feedback/bean/d;

    invoke-virtual {v0}, Lcom/huawei/feedback/bean/d;->b()Ljava/util/List;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->a(Ljava/util/List;)V

    goto :goto_0

    .line 2573
    :cond_1
    const-string v0, "FeedbackEditActivity"

    const-string v1, "PERMISSION_REQUEST_SHOW_IMAGE Permission denied!"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 2576
    invoke-direct {p0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->r()V

    .line 2578
    goto :goto_0

    .line 2581
    :pswitch_2
    invoke-direct {p0, p3}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->a([I)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 2582
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->X:Lcom/huawei/feedback/bean/d;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/huawei/feedback/bean/d;->a(Z)V

    goto :goto_0

    .line 2584
    :cond_2
    const-string v0, "FeedbackEditActivity"

    const-string v1, "PERMISSION_REQUEST_SAVE_LOGCAT Permission denied!"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 2587
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->N:Landroid/widget/CheckBox;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setChecked(Z)V

    .line 2588
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->X:Lcom/huawei/feedback/bean/d;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/feedback/bean/d;->a(Z)V

    .line 2590
    .line 2595
    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0x1000
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method protected onResume()V
    .locals 4

    .line 2357
    invoke-super {p0}, Lcom/huawei/feedback/ui/BaseActivity;->onResume()V

    .line 2360
    const-string v0, "onResume"

    invoke-static {p0, v0}, Lcom/huawei/feedback/f;->j(Landroid/content/Context;Ljava/lang/String;)V

    .line 2366
    :try_start_0
    invoke-virtual {p0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    invoke-virtual {p0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "appId"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    .line 2367
    const/4 v0, 0x1

    invoke-static {v0}, Lcom/huawei/feedback/d;->a(Z)V

    goto :goto_0

    .line 2369
    :cond_0
    const/4 v0, 0x0

    invoke-static {v0}, Lcom/huawei/feedback/d;->a(Z)V

    .line 2371
    :goto_0
    invoke-virtual {p0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    invoke-virtual {p0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "questionType"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 2372
    invoke-virtual {p0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "questionType"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 2373
    const/4 v0, 0x1

    invoke-static {v0}, Lcom/huawei/feedback/d;->a(Z)V

    goto :goto_1

    .line 2375
    :cond_1
    const/4 v0, 0x0

    invoke-static {v0}, Lcom/huawei/feedback/d;->a(Z)V
    :try_end_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 2380
    :goto_1
    goto :goto_2

    .line 2377
    :catch_0
    move-exception v3

    .line 2378
    const/4 v0, 0x0

    invoke-static {v0}, Lcom/huawei/feedback/d;->a(Z)V

    .line 2379
    const-string v0, "FeedbackEditActivity"

    const-string v1, "FeedbackEditActivity onResume NotFoundException"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 2386
    :goto_2
    return-void
.end method

.method public onRetainNonConfigurationInstance()Ljava/lang/Object;
    .locals 2

    .line 2513
    const-string v0, "FeedbackEditActivity"

    const-string v1, "onRetainNonConfigurationInstance"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 2514
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->ai:Lcom/huawei/feedback/ui/FeedbackEditActivity$i;

    if-eqz v0, :cond_1

    .line 2515
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->ai:Lcom/huawei/feedback/ui/FeedbackEditActivity$i;

    invoke-virtual {v0}, Lcom/huawei/feedback/ui/FeedbackEditActivity$i;->isAlive()Z

    move-result v0

    if-nez v0, :cond_0

    .line 2516
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->ax:Landroid/app/ProgressDialog;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->ax:Landroid/app/ProgressDialog;

    invoke-virtual {v0}, Landroid/app/ProgressDialog;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2517
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->ax:Landroid/app/ProgressDialog;

    invoke-virtual {v0}, Landroid/app/ProgressDialog;->cancel()V

    goto :goto_0

    .line 2520
    :cond_0
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->ai:Lcom/huawei/feedback/ui/FeedbackEditActivity$i;

    return-object v0

    .line 2525
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->K:Landroid/app/AlertDialog;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->K:Landroid/app/AlertDialog;

    invoke-virtual {v0}, Landroid/app/AlertDialog;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 2526
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->K:Landroid/app/AlertDialog;

    return-object v0

    .line 2529
    :cond_2
    const/4 v0, 0x0

    return-object v0
.end method

.method public onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2

    .line 1110
    const-string v0, "FeedbackEditActivity"

    const-string v1, "onSaveInstanceState"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 1111
    const-string v0, "original_draft"

    iget-object v1, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->V:Lcom/huawei/feedback/bean/d;

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    .line 1112
    const-string v0, "edit_draft"

    iget-object v1, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->X:Lcom/huawei/feedback/bean/d;

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    .line 1113
    const-string v0, "draft_id"

    iget v1, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->W:I

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 1115
    const-string v0, "package_info"

    iget-object v1, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->aw:Ljava/io/File;

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    .line 1116
    const-string v0, "logMetricInfo"

    iget-object v1, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->ay:Lcom/huawei/lcagent/client/LogMetricInfo;

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 1117
    const-string v0, "upload_name"

    iget-object v1, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->au:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 1118
    const-string v0, "shared_log"

    iget-object v1, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity;->O:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 1120
    invoke-super {p0, p1}, Lcom/huawei/feedback/ui/BaseActivity;->onSaveInstanceState(Landroid/os/Bundle;)V

    .line 1121
    return-void
.end method
