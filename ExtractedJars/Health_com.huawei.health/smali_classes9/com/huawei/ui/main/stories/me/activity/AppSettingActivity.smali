.class public Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$e;,
        Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$d;,
        Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$b;,
        Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$c;
    }
.end annotation


# static fields
.field private static aA:Ljava/lang/String;

.field private static final aK:Ljava/lang/Object;


# instance fields
.field private A:Lo/emu;

.field private B:Lo/emu;

.field private C:Lo/emu;

.field private D:Lo/emu;

.field private E:Landroid/widget/TextView;

.field private F:Z

.field private G:Z

.field private H:Landroid/widget/TextView;

.field private I:I

.field private J:Landroid/widget/TextView;

.field private K:Landroid/widget/ImageView;

.field private L:Landroid/widget/ImageView;

.field private M:Landroid/widget/TextView;

.field private N:Landroid/widget/TextView;

.field private O:Landroid/widget/ImageView;

.field private P:Landroid/widget/ImageView;

.field private Q:Landroid/widget/ImageView;

.field private R:Landroid/widget/ImageView;

.field private S:Landroid/widget/ImageView;

.field private T:Z

.field private U:Ljava/text/SimpleDateFormat;

.field private V:Landroid/widget/ImageView;

.field private W:Landroid/widget/ImageView;

.field private X:Landroid/widget/ImageView;

.field private Y:Z

.field private Z:Landroid/content/Context;

.field private a:Landroid/widget/RelativeLayout;

.field private aB:J

.field private aC:Landroid/widget/ImageView;

.field private aD:Landroid/widget/RelativeLayout;

.field private aE:Landroid/content/ContentValues;

.field private aF:Z

.field private aG:Lo/fcb;

.field private aH:Ljava/lang/Runnable;

.field private aI:Landroid/widget/ImageView;

.field private aJ:Landroid/os/Handler;

.field private aL:Z

.field private aa:Lo/cmj;

.field private ab:Lo/cfz;

.field private ac:Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$b;

.field private ad:Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$d;

.field private ae:Landroid/widget/RelativeLayout;

.field private af:Landroid/widget/RelativeLayout;

.field private ag:Landroid/widget/RelativeLayout;

.field private ah:Z

.field private ai:Z

.field private aj:I

.field private ak:Z

.field private al:Landroid/widget/TextView;

.field private am:Lo/cbz;

.field private an:Z

.field private ao:Z

.field private ap:Z

.field private aq:Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$c;

.field private ar:Z

.field private as:I

.field private at:I

.field private au:Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$c;

.field private av:I

.field private aw:Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$c;

.field private ax:Landroid/widget/Button;

.field private ay:Lo/fit;

.field private az:Lo/ffx;

.field private b:Landroid/widget/RelativeLayout;

.field private c:Landroid/widget/ImageButton;

.field private d:Lcom/huawei/hihealth/HiUserInfo;

.field private e:Lcom/huawei/up/model/UserInfomation;

.field private f:Landroid/widget/RelativeLayout;

.field private g:Landroid/widget/RelativeLayout;

.field private h:Landroid/widget/RelativeLayout;

.field private i:Landroid/widget/RelativeLayout;

.field private j:Lo/emu;

.field private k:Landroid/widget/RelativeLayout;

.field private l:Landroid/widget/RelativeLayout;

.field private m:Landroid/widget/RelativeLayout;

.field private n:Landroid/widget/RelativeLayout;

.field private o:Landroid/widget/RelativeLayout;

.field private p:Landroid/widget/RelativeLayout;

.field private q:Landroid/widget/RelativeLayout;

.field private r:Landroid/widget/RelativeLayout;

.field private s:Landroid/widget/RelativeLayout;

.field private t:Landroid/widget/RelativeLayout;

.field private u:Landroid/widget/LinearLayout;

.field private v:Lo/emu;

.field private w:Landroid/widget/LinearLayout;

.field private x:Landroid/widget/RelativeLayout;

.field private y:Lo/cfy;

.field private z:Landroid/widget/LinearLayout;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 222
    const/4 v0, 0x0

    sput-object v0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->aA:Ljava/lang/String;

    .line 800
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->aK:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 115
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    .line 161
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->G:Z

    .line 164
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->I:I

    .line 171
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->T:Z

    .line 173
    new-instance v0, Ljava/text/SimpleDateFormat;

    const-string v1, "yyyy-MM-dd HH:mm"

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->U:Ljava/text/SimpleDateFormat;

    .line 175
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->Y:Z

    .line 179
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->aa:Lo/cmj;

    .line 181
    new-instance v0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$b;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$b;-><init>(Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->ac:Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$b;

    .line 183
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->ah:Z

    .line 193
    const/16 v0, 0xa

    iput v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->aj:I

    .line 196
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->ak:Z

    .line 198
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->ai:Z

    .line 199
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->ar:Z

    .line 201
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->an:Z

    .line 202
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->ao:Z

    .line 203
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->ap:Z

    .line 210
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->av:I

    .line 213
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->as:I

    .line 225
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->aB:J

    .line 229
    new-instance v0, Landroid/content/ContentValues;

    invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->aE:Landroid/content/ContentValues;

    .line 235
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->aL:Z

    .line 580
    new-instance v0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$4;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$4;-><init>(Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->aH:Ljava/lang/Runnable;

    .line 753
    new-instance v0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$e;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$e;-><init>(Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->aJ:Landroid/os/Handler;

    return-void
.end method

.method private a()V
    .locals 2

    .line 258
    invoke-static {p0}, Lo/fgb;->b(Landroid/content/Context;)Lo/fgb;

    move-result-object v0

    invoke-virtual {v0}, Lo/fgb;->c()Lo/cmj;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->aa:Lo/cmj;

    .line 259
    new-instance v0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$c;

    const-string v1, "getNotificationSupport"

    invoke-direct {v0, p0, v1}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$c;-><init>(Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->aq:Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$c;

    .line 260
    new-instance v0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$c;

    const-string v1, "getGoalNotifiState"

    invoke-direct {v0, p0, v1}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$c;-><init>(Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->aw:Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$c;

    .line 261
    new-instance v0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$c;

    const-string v1, "getStepsNotifiState"

    invoke-direct {v0, p0, v1}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$c;-><init>(Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->au:Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$c;

    .line 262
    return-void
.end method

.method private a(I)V
    .locals 6

    .line 1622
    new-instance v4, Lo/dcy;

    invoke-direct {v4}, Lo/dcy;-><init>()V

    .line 1623
    const-string v0, "UIME_AppSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "saveMapType:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1624
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->Z:Landroid/content/Context;

    const/16 v1, 0x4e22

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "map_type_setting_key"

    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 1625
    iget v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->as:I

    const/4 v1, 0x1

    if-ne v1, v0, :cond_0

    .line 1626
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->az:Lo/ffx;

    sget-object v1, Lo/dae;->dZ:Lo/dae;

    invoke-virtual {v1}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v1

    const-string v2, "1"

    invoke-virtual {v0, v1, v2}, Lo/ffx;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 1628
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->az:Lo/ffx;

    sget-object v1, Lo/dae;->dZ:Lo/dae;

    invoke-virtual {v1}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v1

    const-string v2, "2"

    invoke-virtual {v0, v1, v2}, Lo/ffx;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 1630
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->aJ:Landroid/os/Handler;

    const/16 v1, 0x68

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 1631
    iget v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->at:I

    iget v1, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->as:I

    if-eq v0, v1, :cond_2

    .line 1632
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 1633
    const-string v0, "result"

    iget v1, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->as:I

    const/4 v2, 0x1

    if-ne v1, v2, :cond_1

    const/4 v1, 0x0

    goto :goto_1

    :cond_1
    const/4 v1, 0x1

    :goto_1
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1634
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->Z:Landroid/content/Context;

    sget-object v2, Lo/dae;->hJ:Lo/dae;

    invoke-virtual {v2}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v5, v3}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 1636
    :cond_2
    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;I)V
    .locals 0

    .line 115
    invoke-direct {p0, p1}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->b(I)V

    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;)Z
    .locals 1

    .line 115
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->ai:Z

    return v0
.end method

.method static synthetic a(Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;Z)Z
    .locals 0

    .line 115
    iput-boolean p1, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->ak:Z

    return p1
.end method

.method static synthetic b(Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;I)I
    .locals 0

    .line 115
    iput p1, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->as:I

    return p1
.end method

.method static synthetic b(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 115
    sput-object p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->aA:Ljava/lang/String;

    return-object p0
.end method

.method private b(I)V
    .locals 5

    .line 1599
    const/4 v0, 0x1

    if-ne v0, p1, :cond_0

    .line 1600
    const/4 v0, 0x1

    invoke-static {v0}, Lo/cxh;->d(Z)V

    goto :goto_0

    .line 1602
    :cond_0
    const/4 v0, 0x0

    invoke-static {v0}, Lo/cxh;->d(Z)V

    .line 1609
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->aJ:Landroid/os/Handler;

    const/16 v1, 0x66

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 1611
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->Z:Landroid/content/Context;

    const/4 v1, -0x1

    invoke-static {v0, v1}, Lo/fdx;->e(Landroid/content/Context;I)V

    .line 1614
    sget-object v0, Lo/dae;->eF:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v3

    .line 1615
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 1616
    const-string v0, "click"

    const-string v1, "1"

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1617
    const-string v0, "type"

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1618
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->Z:Landroid/content/Context;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v3, v4, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 1619
    return-void
.end method

.method private b(Z)V
    .locals 5

    .line 1454
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 1455
    const-string v0, "click"

    const-string v1, "1"

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1456
    if-eqz p1, :cond_0

    .line 1457
    const-string v0, "status"

    const-string v1, "1"

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 1459
    :cond_0
    const-string v0, "status"

    const-string v1, "0"

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1461
    :goto_0
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    sget-object v2, Lo/dae;->gh:Lo/dae;

    invoke-virtual {v2}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v4, v3}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 1462
    return-void
.end method

.method static synthetic b(Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;)Z
    .locals 1

    .line 115
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->ak:Z

    return v0
.end method

.method static synthetic b(Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;Z)Z
    .locals 0

    .line 115
    iput-boolean p1, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->an:Z

    return p1
.end method

.method private b(Lo/emu;)Z
    .locals 4

    .line 602
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->Z:Landroid/content/Context;

    const/16 v1, 0x4e22

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "voice_enable_type"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 603
    if-eqz v3, :cond_0

    const-string v0, "0"

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 604
    const/4 v0, 0x0

    return v0

    .line 606
    :cond_0
    const/4 v0, 0x1

    return v0
.end method

.method static synthetic c(Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;)Landroid/os/Handler;
    .locals 1

    .line 115
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->aJ:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic c(Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;I)V
    .locals 0

    .line 115
    invoke-direct {p0, p1}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->a(I)V

    return-void
.end method

.method static synthetic c(Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;Z)Z
    .locals 0

    .line 115
    iput-boolean p1, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->ai:Z

    return p1
.end method

.method static synthetic d(Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;I)I
    .locals 0

    .line 115
    iput p1, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->av:I

    return p1
.end method

.method static synthetic d()Ljava/lang/String;
    .locals 1

    .line 115
    sget-object v0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->aA:Ljava/lang/String;

    return-object v0
.end method

.method private d(Landroid/content/Context;)V
    .locals 6

    .line 1655
    const-string v0, "weartest"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "sendRefreshWearDataBroadcast"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1656
    new-instance v4, Landroid/content/Intent;

    const-string v0, "com.huawei.health.action.REFRESH_WEAR_DATA"

    invoke-direct {v4, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 1657
    invoke-static {p1}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v5

    .line 1658
    const/4 v0, 0x0

    if-eq v0, v5, :cond_0

    .line 1659
    invoke-virtual {v5, v4}, Landroid/support/v4/content/LocalBroadcastManager;->sendBroadcast(Landroid/content/Intent;)Z

    .line 1661
    :cond_0
    return-void
.end method

.method static synthetic d(Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;)Z
    .locals 1

    .line 115
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->Y:Z

    return v0
.end method

.method static synthetic d(Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;Z)Z
    .locals 0

    .line 115
    iput-boolean p1, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->ar:Z

    return p1
.end method

.method static synthetic e(Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;)Lo/cfz;
    .locals 1

    .line 115
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->ab:Lo/cfz;

    return-object v0
.end method

.method static synthetic e(Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;Z)Z
    .locals 0

    .line 115
    iput-boolean p1, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->ao:Z

    return p1
.end method

.method private f()V
    .locals 2

    .line 644
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->aa:Lo/cmj;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 645
    return-void

    .line 647
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->aq:Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$c;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 648
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->aa:Lo/cmj;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->aq:Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$c;

    invoke-virtual {v0, v1}, Lo/cmj;->d(Lo/cmo;)V

    .line 650
    :cond_1
    return-void
.end method

.method static synthetic f(Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;)V
    .locals 0

    .line 115
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->u()V

    return-void
.end method

.method private g()V
    .locals 3

    .line 557
    invoke-static {}, Lo/cbl;->b()Lo/cbl;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->Z:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lo/cbl;->b(Landroid/content/Context;)Lo/cbz;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->am:Lo/cbz;

    .line 559
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->am:Lo/cbz;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->am:Lo/cbz;

    invoke-virtual {v0}, Lo/cbz;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 560
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->aF:Z

    .line 561
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->u:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 562
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->ae:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 563
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->am:Lo/cbz;

    invoke-virtual {v0}, Lo/cbz;->c()Z

    move-result v2

    .line 565
    if-eqz v2, :cond_0

    .line 566
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->A:Lo/emu;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/emu;->setChecked(Z)V

    goto :goto_0

    .line 568
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->A:Lo/emu;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/emu;->setChecked(Z)V

    .line 571
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->A:Lo/emu;

    invoke-virtual {v0, p0}, Lo/emu;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 573
    return-void

    .line 575
    :cond_1
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->aF:Z

    .line 576
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->u:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 577
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->ae:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 578
    return-void
.end method

.method static synthetic g(Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;)Z
    .locals 1

    .line 115
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->ar:Z

    return v0
.end method

.method static synthetic g(Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;Z)Z
    .locals 0

    .line 115
    iput-boolean p1, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->ap:Z

    return p1
.end method

.method private h()V
    .locals 13

    .line 511
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->Z:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "last_sync_time"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 513
    if-eqz v4, :cond_3

    const-string v0, ""

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    const-string v0, "0"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 514
    const-string v0, "UIME_AppSettingActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "lasttime="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 515
    const/4 v5, 0x0

    .line 516
    const-wide/16 v6, 0x0

    .line 518
    const-string v0, ":"

    invoke-virtual {v4, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 520
    :try_start_0
    new-instance v8, Ljava/text/SimpleDateFormat;

    const-string v0, "yyyy.MM.dd HH:mm:ss"

    invoke-direct {v8, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 521
    invoke-virtual {v8, v4}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v5, v0

    .line 524
    goto :goto_0

    .line 522
    :catch_0
    move-exception v8

    .line 523
    const-string v0, "UIME_AppSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Exception: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v8}, Ljava/text/ParseException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 524
    goto :goto_0

    .line 527
    :cond_0
    :try_start_1
    invoke-static {v4}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v6

    .line 528
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0, v6, v7}, Ljava/util/Date;-><init>(J)V
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_1

    move-object v5, v0

    .line 531
    goto :goto_0

    .line 529
    :catch_1
    move-exception v8

    .line 530
    const-string v0, "UIME_AppSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Exception: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v8}, Ljava/lang/NumberFormatException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 534
    :goto_0
    const/4 v0, 0x0

    if-eq v0, v5, :cond_3

    .line 535
    const-string v0, "UIME_AppSettingActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "data="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v5, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 536
    new-instance v8, Ljava/text/SimpleDateFormat;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    const-string v1, "yyyyMMdd"

    invoke-static {v0, v1}, Landroid/text/format/DateFormat;->getBestDateTimePattern(Ljava/util/Locale;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v8, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 537
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->Z:Landroid/content/Context;

    invoke-static {v0}, Landroid/text/format/DateFormat;->getTimeFormat(Landroid/content/Context;)Ljava/text/DateFormat;

    move-result-object v9

    .line 538
    invoke-virtual {v8, v5}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v10

    .line 539
    invoke-virtual {v9, v5}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v11

    .line 542
    const-string v12, ""

    .line 543
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->Z:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->c(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->Z:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->B(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->Z:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->I(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->Z:Landroid/content/Context;

    .line 544
    invoke-static {v0}, Lo/cxa;->n(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->Z:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 545
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    goto :goto_1

    .line 547
    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    .line 549
    :goto_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->E:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 550
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->E:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/huawei/ui/main/R$string;->IDS_hw_last_sync_time:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 553
    :cond_3
    return-void
.end method

.method static synthetic h(Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;)Z
    .locals 1

    .line 115
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->ap:Z

    return v0
.end method

.method static synthetic h(Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;Z)Z
    .locals 0

    .line 115
    iput-boolean p1, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->F:Z

    return p1
.end method

.method private i()V
    .locals 4

    .line 731
    const-string v0, "UIME_AppSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "SETTING_UNIT_UPDATE_UI isImperialUnit : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {}, Lo/cxh;->a()Z

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 732
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 734
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->N:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_system_set_imperial:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    goto :goto_0

    .line 737
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->N:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_system_set_metric:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 739
    :goto_0
    return-void
.end method

.method static synthetic i(Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;)V
    .locals 0

    .line 115
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->m()V

    return-void
.end method

.method private k()V
    .locals 2

    .line 656
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->aa:Lo/cmj;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 657
    return-void

    .line 659
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->au:Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$c;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 660
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->aa:Lo/cmj;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->au:Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$c;

    invoke-virtual {v0, v1}, Lo/cmj;->a(Lo/cmo;)V

    .line 662
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->aw:Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$c;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 663
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->aa:Lo/cmj;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->aw:Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$c;

    invoke-virtual {v0, v1}, Lo/cmj;->c(Lo/cmo;)V

    .line 665
    :cond_2
    return-void
.end method

.method static synthetic k(Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;)Z
    .locals 1

    .line 115
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->ao:Z

    return v0
.end method

.method static synthetic l(Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;)I
    .locals 1

    .line 115
    iget v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->av:I

    return v0
.end method

.method private l()V
    .locals 5

    .line 1063
    const-string v0, "UIME_AppSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "loginOut enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1064
    new-instance v4, Lo/dcy;

    const/4 v0, 0x0

    invoke-direct {v4, v0}, Lo/dcy;-><init>(I)V

    .line 1065
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->Z:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "health_app_third_login"

    const-string v3, "0"

    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 1066
    const/4 v0, 0x0

    invoke-static {v0}, Lo/fgb;->d(Z)V

    .line 1067
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->Z:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/LoginInit;->logout()V

    .line 1068
    return-void
.end method

.method static synthetic m(Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;)Landroid/content/Context;
    .locals 1

    .line 115
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->Z:Landroid/content/Context;

    return-object v0
.end method

.method private m()V
    .locals 6

    .line 891
    const-string v0, "UIME_AppSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "processManualSync() enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 892
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->ah:Z

    if-nez v0, :cond_0

    .line 893
    new-instance v5, Landroid/content/IntentFilter;

    invoke-direct {v5}, Landroid/content/IntentFilter;-><init>()V

    .line 894
    const-string v0, "com.huawei.hihealth.action_sync"

    invoke-virtual {v5, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 895
    invoke-static {p0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->ad:Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$d;

    invoke-virtual {v0, v1, v5}, Landroid/support/v4/content/LocalBroadcastManager;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V

    .line 897
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->ah:Z

    .line 900
    :cond_0
    invoke-static {p0}, Lo/cfu;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 901
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->ab:Lo/cfz;

    invoke-virtual {v0}, Lo/cfz;->getmButton()Lo/egd;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egd;->setClickable(Z)V

    .line 902
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->az:Lo/ffx;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->aa:Lo/cmj;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->ab:Lo/cfz;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, Lcom/huawei/ui/main/R$string;->IDS_hw_show_me_sync_begin:I

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v1, v2, v3}, Lo/ffx;->b(Lo/cmj;Lo/cfz;Ljava/lang/String;)V

    goto :goto_0

    .line 903
    :cond_1
    invoke-static {p0}, Lo/cfu;->e(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 904
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->n()V

    goto :goto_0

    .line 906
    :cond_2
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hw_show_set_about_privacy_connectting_error:I

    const/4 v1, 0x1

    invoke-static {p0, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 909
    :goto_0
    return-void
.end method

.method static synthetic n(Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;)Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$b;
    .locals 1

    .line 115
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->ac:Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$b;

    return-object v0
.end method

.method private n()V
    .locals 6

    .line 912
    const-string v0, "UIME_AppSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showManualSyncDialog() enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 914
    new-instance v5, Lo/egv$b;

    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->Z:Landroid/content/Context;

    invoke-direct {v5, v0}, Lo/egv$b;-><init>(Landroid/content/Context;)V

    .line 915
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hw_health_show_common_dialog_title:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lo/egv$b;->e(Ljava/lang/String;)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_setting_synchronous_prompt:I

    .line 916
    invoke-virtual {p0, v1}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egv$b;->b(Ljava/lang/String;)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_common_ui_dialog_confirm:I

    new-instance v2, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$11;

    invoke-direct {v2, p0}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$11;-><init>(Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;)V

    .line 917
    invoke-virtual {v0, v1, v2}, Lo/egv$b;->e(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_cancel:I

    new-instance v2, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$14;

    invoke-direct {v2, p0}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$14;-><init>(Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;)V

    .line 925
    invoke-virtual {v0, v1, v2}, Lo/egv$b;->b(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    .line 931
    invoke-virtual {v5}, Lo/egv$b;->b()Lo/egv;

    move-result-object v4

    .line 932
    invoke-virtual {v4}, Lo/egv;->show()V

    .line 933
    return-void
.end method

.method static synthetic o(Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;)Lo/cmj;
    .locals 1

    .line 115
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->aa:Lo/cmj;

    return-object v0
.end method

.method private o()V
    .locals 5

    .line 742
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->s()I

    move-result v4

    .line 743
    const-string v0, "UIME_AppSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "SETTING_MAP_TYPE_UI map type : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 744
    const/4 v0, 0x1

    if-ne v4, v0, :cond_0

    .line 746
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->M:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_data_tarck_map_type_setting_gaode:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    goto :goto_0

    .line 749
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->M:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_data_tarck_map_type_setting_google:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 751
    :goto_0
    return-void
.end method

.method static synthetic p(Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;)Lo/ffx;
    .locals 1

    .line 115
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->az:Lo/ffx;

    return-object v0
.end method

.method private p()V
    .locals 15

    .line 990
    const-string v0, "UIME_AppSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showSettingUnitPickerDialog()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 991
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->Z:Landroid/content/Context;

    const-string v1, "layout_inflater"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Landroid/view/LayoutInflater;

    .line 992
    sget v0, Lcom/huawei/ui/main/R$layout;->hw_show_settings_unit_view:I

    const/4 v1, 0x0

    invoke-virtual {v6, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v7

    .line 994
    new-instance v9, Landroid/content/Intent;

    const-string v0, "com.huawei.ui.IMPERIAL.ACTION"

    invoke-direct {v9, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 995
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->Z:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 996
    new-instance v10, Lo/egw$c;

    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->Z:Landroid/content/Context;

    invoke-direct {v10, v0}, Lo/egw$c;-><init>(Landroid/content/Context;)V

    .line 997
    if-nez v7, :cond_0

    .line 998
    const-string v0, "UIME_AppSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showSettingUnitPickerDialog() dialog layout fail"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 999
    return-void

    .line 1001
    :cond_0
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_system_set_unit:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Lo/egw$c;->a(Ljava/lang/String;)Lo/egw$c;

    move-result-object v0

    .line 1002
    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v0, v7, v1, v2}, Lo/egw$c;->b(Landroid/view/View;II)Lo/egw$c;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_cancel:I

    new-instance v2, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$19;

    invoke-direct {v2, p0, v9}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$19;-><init>(Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;Landroid/content/Intent;)V

    .line 1003
    invoke-virtual {v0, v1, v2}, Lo/egw$c;->b(ILandroid/view/View$OnClickListener;)Lo/egw$c;

    .line 1014
    invoke-virtual {v10}, Lo/egw$c;->e()Lo/egw;

    move-result-object v8

    .line 1016
    sget v0, Lcom/huawei/ui/main/R$id;->settings_metric_unit_radioButton:I

    invoke-virtual {v7, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Landroid/widget/RadioButton;

    .line 1017
    sget v0, Lcom/huawei/ui/main/R$id;->settings_imperial_unit_radioButton:I

    invoke-virtual {v7, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Landroid/widget/RadioButton;

    .line 1018
    sget v0, Lcom/huawei/ui/main/R$id;->settings_metric_unit_layout:I

    invoke-virtual {v7, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Landroid/widget/RelativeLayout;

    .line 1019
    sget v0, Lcom/huawei/ui/main/R$id;->settings_imperial_unit_layout:I

    invoke-virtual {v7, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v14, v0

    check-cast v14, Landroid/widget/RelativeLayout;

    .line 1020
    const/4 v0, 0x0

    invoke-virtual {v11, v0}, Landroid/widget/RadioButton;->setClickable(Z)V

    .line 1021
    const/4 v0, 0x0

    invoke-virtual {v12, v0}, Landroid/widget/RadioButton;->setClickable(Z)V

    .line 1022
    new-instance v0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$16;

    move-object v1, p0

    move-object v2, v12

    move-object v3, v11

    move-object v4, v9

    move-object v5, v8

    invoke-direct/range {v0 .. v5}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$16;-><init>(Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;Landroid/widget/RadioButton;Landroid/widget/RadioButton;Landroid/content/Intent;Lo/egw;)V

    invoke-virtual {v13, v0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1033
    new-instance v0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$18;

    move-object v1, p0

    move-object v2, v12

    move-object v3, v11

    move-object v4, v9

    move-object v5, v8

    invoke-direct/range {v0 .. v5}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$18;-><init>(Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;Landroid/widget/RadioButton;Landroid/widget/RadioButton;Landroid/content/Intent;Lo/egw;)V

    invoke-virtual {v14, v0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1046
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1048
    const/4 v0, 0x1

    iput v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->av:I

    .line 1049
    const/4 v0, 0x1

    invoke-virtual {v12, v0}, Landroid/widget/RadioButton;->setChecked(Z)V

    .line 1050
    const/4 v0, 0x0

    invoke-virtual {v11, v0}, Landroid/widget/RadioButton;->setChecked(Z)V

    goto :goto_0

    .line 1053
    :cond_1
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->av:I

    .line 1054
    const/4 v0, 0x0

    invoke-virtual {v12, v0}, Landroid/widget/RadioButton;->setChecked(Z)V

    .line 1055
    const/4 v0, 0x1

    invoke-virtual {v11, v0}, Landroid/widget/RadioButton;->setChecked(Z)V

    .line 1058
    :goto_0
    invoke-virtual {v8}, Lo/egw;->show()V

    .line 1060
    return-void
.end method

.method static synthetic q(Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;)V
    .locals 0

    .line 115
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->o()V

    return-void
.end method

.method private q()Z
    .locals 5

    .line 1498
    invoke-static {}, Lo/dho;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1499
    const/4 v0, 0x0

    return v0

    .line 1502
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->Z:Landroid/content/Context;

    const-string v1, "developeroptions"

    const-string v2, "developerswitch"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 1503
    const-string v0, "UIME_AppSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "devleopKey = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1504
    if-eqz v4, :cond_1

    const-string v0, "1"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1505
    const/4 v0, 0x1

    return v0

    .line 1507
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method static synthetic r(Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;)Lo/emu;
    .locals 1

    .line 115
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->B:Lo/emu;

    return-object v0
.end method

.method private r()V
    .locals 6

    .line 1665
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->al:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v5

    .line 1666
    const-string v0, "1"

    const-wide/high16 v1, 0x3ff0000000000000L    # 1.0

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v5

    .line 1667
    const-string v0, "2"

    const-wide/high16 v1, 0x4000000000000000L    # 2.0

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v5

    .line 1668
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->al:Landroid/widget/TextView;

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1670
    return-void
.end method

.method private s()I
    .locals 5

    .line 1640
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->Z:Landroid/content/Context;

    const/16 v1, 0x4e22

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "map_type_setting_key"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 1641
    const-string v0, ""

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1642
    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v3

    goto :goto_1

    .line 1644
    :cond_0
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1645
    const/4 v3, 0x2

    goto :goto_0

    .line 1647
    :cond_1
    const/4 v3, 0x1

    .line 1649
    :goto_0
    invoke-direct {p0, v3}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->a(I)V

    .line 1651
    :goto_1
    return v3
.end method

.method static synthetic s(Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;)Z
    .locals 1

    .line 115
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->F:Z

    return v0
.end method

.method private t()V
    .locals 16

    .line 1511
    const-string v0, "UIME_AppSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showSettingMapTypeDialog()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1512
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->Z:Landroid/content/Context;

    if-eqz v0, :cond_2

    .line 1513
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->Z:Landroid/content/Context;

    const-string v1, "layout_inflater"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Landroid/view/LayoutInflater;

    .line 1514
    sget v0, Lcom/huawei/ui/main/R$layout;->hw_show_map_type_view:I

    const/4 v1, 0x0

    invoke-virtual {v6, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v7

    .line 1516
    new-instance v9, Lo/egw$c;

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->Z:Landroid/content/Context;

    invoke-direct {v9, v0}, Lo/egw$c;-><init>(Landroid/content/Context;)V

    .line 1517
    if-nez v7, :cond_0

    .line 1518
    const-string v0, "UIME_AppSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showSettingMapTypeDialog() dialog layout fail"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1519
    return-void

    .line 1521
    :cond_0
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hw_show_map_type_title:I

    move-object/from16 v1, p0

    invoke-virtual {v1, v0}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Lo/egw$c;->a(Ljava/lang/String;)Lo/egw$c;

    move-result-object v0

    .line 1522
    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v0, v7, v1, v2}, Lo/egw$c;->b(Landroid/view/View;II)Lo/egw$c;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_cancel:I

    new-instance v2, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$6;

    move-object/from16 v3, p0

    invoke-direct {v2, v3}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$6;-><init>(Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;)V

    .line 1523
    invoke-virtual {v0, v1, v2}, Lo/egw$c;->b(ILandroid/view/View$OnClickListener;)Lo/egw$c;

    .line 1531
    invoke-virtual {v9}, Lo/egw$c;->e()Lo/egw;

    move-result-object v8

    .line 1533
    new-instance v11, Lo/egy$b;

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->Z:Landroid/content/Context;

    invoke-direct {v11, v0}, Lo/egy$b;-><init>(Landroid/content/Context;)V

    .line 1534
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hwh_motiontrack_show_map_type_no_gms:I

    move-object/from16 v1, p0

    invoke-virtual {v1, v0}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v11, v0}, Lo/egy$b;->a(Ljava/lang/String;)Lo/egy$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_common_notification_know_tips:I

    new-instance v2, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$9;

    move-object/from16 v3, p0

    invoke-direct {v2, v3}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$9;-><init>(Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;)V

    .line 1535
    invoke-virtual {v0, v1, v2}, Lo/egy$b;->d(ILandroid/view/View$OnClickListener;)Lo/egy$b;

    .line 1540
    invoke-virtual {v11}, Lo/egy$b;->a()Lo/egy;

    move-result-object v10

    .line 1542
    sget v0, Lcom/huawei/ui/main/R$id;->settings_gaode_map_radioButton:I

    invoke-virtual {v7, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Landroid/widget/RadioButton;

    .line 1543
    sget v0, Lcom/huawei/ui/main/R$id;->settings_google_map_radioButton:I

    invoke-virtual {v7, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Landroid/widget/RadioButton;

    .line 1544
    sget v0, Lcom/huawei/ui/main/R$id;->settings_gaode_map_layout:I

    invoke-virtual {v7, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v14, v0

    check-cast v14, Landroid/widget/RelativeLayout;

    .line 1545
    sget v0, Lcom/huawei/ui/main/R$id;->settings_google_map_layout:I

    invoke-virtual {v7, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v15, v0

    check-cast v15, Landroid/widget/RelativeLayout;

    .line 1547
    const/4 v0, 0x0

    invoke-virtual {v12, v0}, Landroid/widget/RadioButton;->setClickable(Z)V

    .line 1548
    const/4 v0, 0x0

    invoke-virtual {v13, v0}, Landroid/widget/RadioButton;->setClickable(Z)V

    .line 1549
    new-instance v0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$7;

    move-object/from16 v1, p0

    invoke-direct {v0, v1, v12, v13, v8}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$7;-><init>(Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;Landroid/widget/RadioButton;Landroid/widget/RadioButton;Lo/egw;)V

    invoke-virtual {v14, v0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1559
    new-instance v0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$13;

    move-object/from16 v1, p0

    move-object v2, v12

    move-object v3, v13

    move-object v4, v8

    move-object v5, v10

    invoke-direct/range {v0 .. v5}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$13;-><init>(Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;Landroid/widget/RadioButton;Landroid/widget/RadioButton;Lo/egw;Lo/egy;)V

    invoke-virtual {v15, v0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1573
    invoke-direct/range {p0 .. p0}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->s()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 1575
    const/4 v0, 0x2

    move-object/from16 v1, p0

    iput v0, v1, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->as:I

    .line 1576
    const/4 v0, 0x0

    invoke-virtual {v12, v0}, Landroid/widget/RadioButton;->setChecked(Z)V

    .line 1577
    const/4 v0, 0x1

    invoke-virtual {v13, v0}, Landroid/widget/RadioButton;->setChecked(Z)V

    goto :goto_0

    .line 1580
    :cond_1
    const/4 v0, 0x1

    move-object/from16 v1, p0

    iput v0, v1, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->as:I

    .line 1581
    const/4 v0, 0x1

    invoke-virtual {v12, v0}, Landroid/widget/RadioButton;->setChecked(Z)V

    .line 1582
    const/4 v0, 0x0

    invoke-virtual {v13, v0}, Landroid/widget/RadioButton;->setChecked(Z)V

    .line 1584
    :goto_0
    move-object/from16 v0, p0

    iget v0, v0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->as:I

    move-object/from16 v1, p0

    iput v0, v1, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->at:I

    .line 1585
    invoke-virtual {v8}, Lo/egw;->show()V

    .line 1586
    goto :goto_1

    .line 1587
    :cond_2
    const-string v0, "UIME_AppSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showSettingMapTypeDialog() dialog layout fail"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1588
    return-void

    .line 1592
    :goto_1
    return-void
.end method

.method static synthetic t(Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;)V
    .locals 0

    .line 115
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->i()V

    return-void
.end method

.method static synthetic u(Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;)I
    .locals 1

    .line 115
    iget v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->as:I

    return v0
.end method

.method private u()V
    .locals 4

    .line 1298
    new-instance v2, Landroid/content/Intent;

    const-class v0, Lcom/huawei/ui/main/stories/me/activity/NotificationMessageSettingActivity;

    invoke-direct {v2, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 1299
    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 1300
    const-string v0, "isOpenRealTimeStep"

    iget-boolean v1, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->ai:Z

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 1301
    const-string v0, "isOpenCompleteGoal"

    iget-boolean v1, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->ar:Z

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 1302
    const-string v0, "isOpenNotification"

    iget-boolean v1, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->ak:Z

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 1303
    invoke-virtual {v2, v3}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 1304
    invoke-virtual {p0, v2}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->startActivity(Landroid/content/Intent;)V

    .line 1305
    return-void
.end method

.method static synthetic x(Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;)Z
    .locals 1

    .line 115
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->aF:Z

    return v0
.end method

.method static synthetic y(Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;)Lo/fit;
    .locals 1

    .line 115
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->ay:Lo/fit;

    return-object v0
.end method

.method static synthetic z(Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;)Landroid/widget/RelativeLayout;
    .locals 1

    .line 115
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->l:Landroid/widget/RelativeLayout;

    return-object v0
.end method


# virtual methods
.method public a(Landroid/content/Intent;)V
    .locals 15

    .line 802
    sget-object v5, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->aK:Ljava/lang/Object;

    monitor-enter v5

    .line 803
    const-string v0, "com.huawei.hihealth.action_sync_status"

    move-object/from16 v1, p1

    const/4 v2, 0x6

    :try_start_0
    invoke-virtual {v1, v0, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v6

    .line 805
    const/4 v0, 0x2

    if-ne v0, v6, :cond_1

    .line 806
    const-string v0, "UIME_AppSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Sync DONE"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 807
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->ad:Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$d;

    if-eqz v0, :cond_0

    .line 808
    const-string v0, "UIME_AppSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "unregisterReceiver mReceiver"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 809
    invoke-static {p0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->ad:Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$d;

    invoke-virtual {v0, v1}, Landroid/support/v4/content/LocalBroadcastManager;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 811
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->ah:Z

    .line 813
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->ab:Lo/cfz;

    const/16 v1, 0x64

    invoke-virtual {v0, v1}, Lo/cfz;->b(I)V

    .line 814
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->ab:Lo/cfz;

    invoke-virtual {v0}, Lo/cfz;->getmButton()Lo/egd;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/egd;->setClickable(Z)V

    .line 815
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->ab:Lo/cfz;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_show_synchronous:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/cfz;->b(Ljava/lang/String;)V

    .line 819
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->Z:Landroid/content/Context;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_show_synchronous_success:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 820
    new-instance v7, Ljava/util/Date;

    invoke-direct {v7}, Ljava/util/Date;-><init>()V

    .line 821
    new-instance v8, Ljava/text/SimpleDateFormat;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    const-string v1, "yyyyMMdd"

    invoke-static {v0, v1}, Landroid/text/format/DateFormat;->getBestDateTimePattern(Ljava/util/Locale;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v8, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 822
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->Z:Landroid/content/Context;

    invoke-static {v0}, Landroid/text/format/DateFormat;->getTimeFormat(Landroid/content/Context;)Ljava/text/DateFormat;

    move-result-object v9

    .line 823
    invoke-virtual {v8, v7}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v10

    .line 824
    invoke-virtual {v9, v7}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v11

    .line 825
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    .line 826
    const-string v0, "UIME_AppSettingActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "lastTime="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v12, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 827
    new-instance v13, Lo/dcy;

    invoke-direct {v13}, Lo/dcy;-><init>()V

    .line 828
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->Z:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "last_sync_time"

    .line 829
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v3

    .line 828
    invoke-static {v0, v1, v2, v3, v13}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 830
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->E:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 831
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->E:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/huawei/ui/main/R$string;->IDS_hw_last_sync_time:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 833
    goto/16 :goto_0

    :cond_1
    const/4 v0, 0x3

    if-ne v0, v6, :cond_3

    .line 834
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->ad:Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$d;

    if-eqz v0, :cond_2

    .line 835
    invoke-static {p0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->ad:Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$d;

    invoke-virtual {v0, v1}, Landroid/support/v4/content/LocalBroadcastManager;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 837
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->ah:Z

    .line 839
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->ab:Lo/cfz;

    invoke-virtual {v0}, Lo/cfz;->getmButton()Lo/egd;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/egd;->setClickable(Z)V

    .line 841
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->ab:Lo/cfz;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_show_synchronous:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/cfz;->b(Ljava/lang/String;)V

    .line 846
    new-instance v8, Lo/egv$b;

    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->Z:Landroid/content/Context;

    invoke-direct {v8, v0}, Lo/egv$b;-><init>(Landroid/content/Context;)V

    .line 847
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_health_show_common_dialog_title:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Lo/egv$b;->e(Ljava/lang/String;)Lo/egv$b;

    move-result-object v0

    .line 848
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_sync_fail_try:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egv$b;->b(Ljava/lang/String;)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_common_ui_dialog_confirm:I

    new-instance v2, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$12;

    invoke-direct {v2, p0}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$12;-><init>(Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;)V

    .line 849
    invoke-virtual {v0, v1, v2}, Lo/egv$b;->e(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_common_ui_dialog_cancel:I

    new-instance v2, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$15;

    invoke-direct {v2, p0}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$15;-><init>(Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;)V

    .line 855
    invoke-virtual {v0, v1, v2}, Lo/egv$b;->b(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    .line 861
    invoke-virtual {v8}, Lo/egv$b;->b()Lo/egv;

    move-result-object v7

    .line 862
    invoke-virtual {v7}, Lo/egv;->show()V

    .line 863
    goto :goto_0

    :cond_3
    const/4 v0, 0x1

    if-ne v0, v6, :cond_4

    .line 864
    const-string v0, "com.huawei.hihealth.action_sync_process"

    move-object/from16 v1, p1

    const-wide/16 v2, 0x0

    invoke-virtual {v1, v0, v2, v3}, Landroid/content/Intent;->getDoubleExtra(Ljava/lang/String;D)D

    move-result-wide v7

    .line 865
    const-string v0, "UIME_AppSettingActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "process==="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v7, v8}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 866
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->ab:Lo/cfz;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/cfz;->setVisibility(I)V

    .line 867
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->ab:Lo/cfz;

    double-to-int v1, v7

    invoke-virtual {v0, v1}, Lo/cfz;->b(I)V

    .line 868
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->ab:Lo/cfz;

    invoke-virtual {v0}, Lo/cfz;->getmButton()Lo/egd;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egd;->setClickable(Z)V

    .line 871
    goto :goto_0

    :cond_4
    const/4 v0, 0x0

    if-ne v0, v6, :cond_5

    .line 874
    const-string v0, "UIME_AppSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Sync BEGIN"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 875
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->ab:Lo/cfz;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/cfz;->b(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 877
    :cond_5
    :goto_0
    monitor-exit v5

    goto :goto_1

    :catchall_0
    move-exception v14

    monitor-exit v5

    throw v14

    .line 883
    :goto_1
    return-void
.end method

.method public b()V
    .locals 6

    .line 612
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->Z:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "auto_synchronous_flag"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 614
    const-string v0, "UIME_AppSettingActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "automaticswitch=="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 615
    if-eqz v4, :cond_0

    const-string v0, ""

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "1"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 617
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->v:Lo/emu;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/emu;->setChecked(Z)V

    .line 618
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->Z:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "auto_synchronous_wlan_flag"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 620
    const-string v0, ""

    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "1"

    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 621
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->C:Lo/emu;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/emu;->setChecked(Z)V

    goto :goto_0

    .line 623
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->C:Lo/emu;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/emu;->setChecked(Z)V

    .line 625
    :goto_0
    goto :goto_1

    .line 627
    :cond_3
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->v:Lo/emu;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/emu;->setChecked(Z)V

    .line 628
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->C:Lo/emu;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/emu;->setChecked(Z)V

    .line 629
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->k:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 630
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->w:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 633
    :goto_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->D:Lo/emu;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->D:Lo/emu;

    invoke-direct {p0, v1}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->b(Lo/emu;)Z

    move-result v1

    invoke-virtual {v0, v1}, Lo/emu;->setChecked(Z)V

    .line 638
    return-void
.end method

.method public c()V
    .locals 1

    .line 887
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->y:Lo/cfy;

    invoke-virtual {v0}, Lo/cfy;->a()V

    .line 888
    return-void
.end method

.method public e()V
    .locals 7

    .line 266
    const-string v0, "UIME_AppSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initView() "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 267
    sget v0, Lcom/huawei/ui/main/R$id;->about_wechat_rank_account:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->V:Landroid/widget/ImageView;

    .line 268
    sget v0, Lcom/huawei/ui/main/R$id;->about_change_other_account:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->K:Landroid/widget/ImageView;

    .line 269
    sget v0, Lcom/huawei/ui/main/R$id;->about_offline_map:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->L:Landroid/widget/ImageView;

    .line 270
    sget v0, Lcom/huawei/ui/main/R$id;->hw_map_type_right_arrow:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->R:Landroid/widget/ImageView;

    .line 272
    sget v0, Lcom/huawei/ui/main/R$id;->notification_message_right_arrow:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->Q:Landroid/widget/ImageView;

    .line 273
    sget v0, Lcom/huawei/ui/main/R$id;->heart_zone_setting_right_arrow:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->S:Landroid/widget/ImageView;

    .line 274
    sget v0, Lcom/huawei/ui/main/R$id;->hw_setting_unit_right_arrow:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->P:Landroid/widget/ImageView;

    .line 275
    sget v0, Lcom/huawei/ui/main/R$id;->user_profile_privacy_right_arrow:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->O:Landroid/widget/ImageView;

    .line 276
    sget v0, Lcom/huawei/ui/main/R$id;->user_profile_opensource_right_arrow:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->aC:Landroid/widget/ImageView;

    .line 277
    sget v0, Lcom/huawei/ui/main/R$id;->clear_cache_right_arrow:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->X:Landroid/widget/ImageView;

    .line 278
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->Z:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 279
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->K:Landroid/widget/ImageView;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$drawable;->common_ui_arrow_left:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 280
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->L:Landroid/widget/ImageView;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$drawable;->common_ui_arrow_left:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 281
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->R:Landroid/widget/ImageView;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$drawable;->common_ui_arrow_left:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 283
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->Q:Landroid/widget/ImageView;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$drawable;->common_ui_arrow_left:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 284
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->S:Landroid/widget/ImageView;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$drawable;->common_ui_arrow_left:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 285
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->P:Landroid/widget/ImageView;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$drawable;->common_ui_arrow_left:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 286
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->O:Landroid/widget/ImageView;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$drawable;->common_ui_arrow_left:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 287
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->V:Landroid/widget/ImageView;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$drawable;->common_ui_arrow_left:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 288
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->aC:Landroid/widget/ImageView;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$drawable;->common_ui_arrow_left:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 289
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->X:Landroid/widget/ImageView;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$drawable;->common_ui_arrow_left:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    goto/16 :goto_0

    .line 291
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->K:Landroid/widget/ImageView;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$drawable;->ic_health_list_arrow_gray:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 292
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->L:Landroid/widget/ImageView;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$drawable;->ic_health_list_arrow_gray:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 293
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->R:Landroid/widget/ImageView;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$drawable;->ic_health_list_arrow_gray:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 295
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->Q:Landroid/widget/ImageView;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$drawable;->ic_health_list_arrow_gray:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 296
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->S:Landroid/widget/ImageView;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$drawable;->ic_health_list_arrow_gray:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 297
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->P:Landroid/widget/ImageView;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$drawable;->ic_health_list_arrow_gray:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 298
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->O:Landroid/widget/ImageView;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$drawable;->ic_health_list_arrow_gray:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 299
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->V:Landroid/widget/ImageView;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$drawable;->ic_health_list_arrow_gray:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 300
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->aC:Landroid/widget/ImageView;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$drawable;->ic_health_list_arrow_gray:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 301
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->X:Landroid/widget/ImageView;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$drawable;->ic_health_list_arrow_gray:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 304
    :goto_0
    sget v0, Lcom/huawei/ui/main/R$id;->show_voice_switch:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emu;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->D:Lo/emu;

    .line 305
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->D:Lo/emu;

    invoke-virtual {v0, p0}, Lo/emu;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 306
    sget v0, Lcom/huawei/ui/main/R$id;->app_setting_synchronous_automatic:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emu;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->v:Lo/emu;

    .line 307
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->v:Lo/emu;

    invoke-virtual {v0, p0}, Lo/emu;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 308
    sget v0, Lcom/huawei/ui/main/R$id;->app_setting_scan_automatic:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emu;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->j:Lo/emu;

    .line 309
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->j:Lo/emu;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->aG:Lo/fcb;

    invoke-virtual {v1}, Lo/fcb;->b()Z

    move-result v1

    if-nez v1, :cond_1

    const/4 v1, 0x1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    invoke-virtual {v0, v1}, Lo/emu;->setChecked(Z)V

    .line 310
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->j:Lo/emu;

    invoke-virtual {v0, p0}, Lo/emu;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 311
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_app_setting_prompt_tv_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->w:Landroid/widget/LinearLayout;

    .line 313
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_refresh_wear_data_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->x:Landroid/widget/RelativeLayout;

    .line 314
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->x:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 315
    sget v0, Lcom/huawei/ui/main/R$id;->app_setting_traffic_synchronous:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emu;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->C:Lo/emu;

    .line 316
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->C:Lo/emu;

    invoke-virtual {v0, p0}, Lo/emu;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 317
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_auto_track_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->u:Landroid/widget/LinearLayout;

    .line 318
    sget v0, Lcom/huawei/ui/main/R$id;->hw_setting_auto_track_customswitch:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emu;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->A:Lo/emu;

    .line 319
    sget v0, Lcom/huawei/ui/main/R$id;->hw_auto_track_second_linearlayout:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->ae:Landroid/widget/RelativeLayout;

    .line 320
    sget v0, Lcom/huawei/ui/main/R$id;->hw_auto_track_second_text:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->al:Landroid/widget/TextView;

    .line 321
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->g()V

    .line 322
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->r()V

    .line 325
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_setting_gps_low_consumption_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->n:Landroid/widget/RelativeLayout;

    .line 326
    sget v0, Lcom/huawei/ui/main/R$id;->show_gps_low_consumption_switch:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emu;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->B:Lo/emu;

    .line 327
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->B:Lo/emu;

    invoke-virtual {v0, p0}, Lo/emu;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 329
    const-string v0, "flp_track_switch"

    const-string v1, "flp_track_flag"

    invoke-static {p0, v0, v1}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 331
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->az:Lo/ffx;

    invoke-virtual {v0, v4}, Lo/ffx;->e(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 332
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->B:Lo/emu;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/emu;->setChecked(Z)V

    .line 333
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->G:Z

    goto :goto_2

    .line 334
    :cond_2
    const-string v0, "1"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 335
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->B:Lo/emu;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/emu;->setChecked(Z)V

    .line 336
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->G:Z

    .line 338
    :cond_3
    :goto_2
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->B:Lo/emu;

    invoke-virtual {v0}, Lo/emu;->isChecked()Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->F:Z

    .line 340
    invoke-static {}, Lo/ccb;->e()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-static {}, Lo/cds;->d()Z

    move-result v0

    if-eqz v0, :cond_4

    const/4 v5, 0x1

    goto :goto_3

    :cond_4
    const/4 v5, 0x0

    .line 342
    :goto_3
    if-eqz v5, :cond_5

    .line 343
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->n:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 344
    const-string v0, "UIME_AppSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "support flp"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_4

    .line 346
    :cond_5
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->n:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 347
    const-string v0, "UIME_AppSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "don\'t support flp"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 349
    :goto_4
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->n:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 355
    sget v0, Lcom/huawei/ui/main/R$id;->hw_offline_map_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->h:Landroid/widget/RelativeLayout;

    .line 356
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_setting_voice_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->o:Landroid/widget/RelativeLayout;

    .line 357
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_about_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->b:Landroid/widget/RelativeLayout;

    .line 360
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->b:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 361
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->b:Landroid/widget/RelativeLayout;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setClickable(Z)V

    .line 362
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->b:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 363
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_detection_synchronous_manual:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->a:Landroid/widget/RelativeLayout;

    .line 366
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_auto_synchronous_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->g:Landroid/widget/RelativeLayout;

    .line 367
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_auto_scan_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->q:Landroid/widget/RelativeLayout;

    .line 368
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_auto_scan_layout_imageview:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->W:Landroid/widget/ImageView;

    .line 369
    const-string v0, "UIME_AppSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "===123===CommonUtil.isSupportWearProduct()"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {}, Lo/dbf;->q()Z

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 371
    invoke-static {}, Lo/dbf;->q()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-static {}, Lo/dbf;->d()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 372
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->q:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 373
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->W:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_5

    .line 375
    :cond_6
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->q:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 376
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->W:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 378
    :goto_5
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_traffic_synchronous_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->k:Landroid/widget/RelativeLayout;

    .line 379
    sget v0, Lcom/huawei/ui/main/R$id;->app_setting_activity_manual:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->H:Landroid/widget/TextView;

    .line 380
    sget v0, Lcom/huawei/ui/main/R$id;->syn_circle_progress:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/cfz;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->ab:Lo/cfz;

    .line 389
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->ab:Lo/cfz;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_show_synchronous:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/cfz;->b(Ljava/lang/String;)V

    .line 390
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->ab:Lo/cfz;

    invoke-virtual {v0}, Lo/cfz;->getmButton()Lo/egd;

    move-result-object v0

    invoke-virtual {v0, p0}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 391
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->h:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 392
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->b:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 394
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_developer_options_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->m:Landroid/widget/RelativeLayout;

    .line 395
    sget v0, Lcom/huawei/ui/main/R$id;->setting_clear_cache_image:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->aI:Landroid/widget/ImageView;

    .line 396
    sget v0, Lcom/huawei/ui/main/R$id;->app_setting_activity_layout_top:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->z:Landroid/widget/LinearLayout;

    .line 397
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->m:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 398
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->q()Z

    move-result v0

    if-eqz v0, :cond_7

    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->aL:Z

    if-nez v0, :cond_7

    .line 399
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->m:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 400
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->aI:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_6

    .line 402
    :cond_7
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->m:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 403
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->aI:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 405
    :goto_6
    sget v0, Lcom/huawei/ui/main/R$id;->user_profile_privacy_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->ag:Landroid/widget/RelativeLayout;

    .line 406
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->ag:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 409
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->o:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 411
    sget v0, Lcom/huawei/ui/main/R$id;->user_profile_opensource_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->aD:Landroid/widget/RelativeLayout;

    .line 412
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->aD:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 414
    sget v0, Lcom/huawei/ui/main/R$id;->app_setting_clear_cache:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->af:Landroid/widget/RelativeLayout;

    .line 415
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->af:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 416
    sget v0, Lcom/huawei/ui/main/R$id;->hw_wechat_rank_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->f:Landroid/widget/RelativeLayout;

    .line 417
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->f:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 419
    sget v0, Lcom/huawei/ui/main/R$id;->hw_change_other_account_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->p:Landroid/widget/RelativeLayout;

    .line 421
    invoke-static {}, Lo/dbf;->b()Z

    move-result v0

    if-eqz v0, :cond_8

    .line 422
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->ab:Lo/cfz;

    invoke-virtual {v0}, Lo/cfz;->getmButton()Lo/egd;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egd;->setClickable(Z)V

    .line 423
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->p:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    goto :goto_7

    .line 425
    :cond_8
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->ab:Lo/cfz;

    invoke-virtual {v0}, Lo/cfz;->getmButton()Lo/egd;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/egd;->setClickable(Z)V

    .line 426
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->p:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 428
    :goto_7
    sget-object v0, Lcom/huawei/hwcommonmodel/application/BaseApplication$e;->d:Lcom/huawei/hwcommonmodel/application/BaseApplication$e;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->d()Lcom/huawei/hwcommonmodel/application/BaseApplication$e;

    move-result-object v1

    if-eq v0, v1, :cond_9

    .line 429
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->p:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 431
    :cond_9
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->p:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 434
    sget v0, Lcom/huawei/ui/main/R$id;->notification_message_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->l:Landroid/widget/RelativeLayout;

    .line 435
    sget-object v0, Lcom/huawei/hwcommonmodel/application/BaseApplication$e;->d:Lcom/huawei/hwcommonmodel/application/BaseApplication$e;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->d()Lcom/huawei/hwcommonmodel/application/BaseApplication$e;

    move-result-object v1

    if-eq v0, v1, :cond_a

    .line 436
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->l:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 438
    :cond_a
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->l:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 440
    sget v0, Lcom/huawei/ui/main/R$id;->setting_select_zip_file:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->r:Landroid/widget/RelativeLayout;

    .line 448
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->r:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 450
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->r:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 453
    sget v0, Lcom/huawei/ui/main/R$id;->heart_zone_setting_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->t:Landroid/widget/RelativeLayout;

    .line 454
    sget-object v0, Lcom/huawei/hwcommonmodel/application/BaseApplication$e;->d:Lcom/huawei/hwcommonmodel/application/BaseApplication$e;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->d()Lcom/huawei/hwcommonmodel/application/BaseApplication$e;

    move-result-object v1

    if-eq v0, v1, :cond_b

    .line 455
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->t:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 457
    :cond_b
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->t:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 459
    sget v0, Lcom/huawei/ui/main/R$id;->last_sync_time_tv:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->E:Landroid/widget/TextView;

    .line 460
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->h()V

    .line 462
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_map_type_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->i:Landroid/widget/RelativeLayout;

    .line 463
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_map_type_text:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->M:Landroid/widget/TextView;

    .line 464
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_map_type_line:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->J:Landroid/widget/TextView;

    .line 465
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->i:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 467
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_setting_unit_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->s:Landroid/widget/RelativeLayout;

    .line 468
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->s:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 469
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_setting_unit_text:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->N:Landroid/widget/TextView;

    .line 471
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-nez v0, :cond_c

    .line 474
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->h:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 475
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->z:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 476
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->i:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 477
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->aJ:Landroid/os/Handler;

    const/16 v1, 0x68

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    goto :goto_8

    .line 478
    :cond_c
    invoke-static {}, Lo/czu;->i()Z

    move-result v0

    if-eqz v0, :cond_d

    .line 480
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->f:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 481
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->a:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 482
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->g:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 483
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->p:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 484
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->h:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 488
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->i:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 489
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->J:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_8

    .line 492
    :cond_d
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->i:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 493
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->J:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 494
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->z:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 495
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->p:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 496
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->h:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 501
    :goto_8
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->aJ:Landroid/os/Handler;

    const/16 v1, 0x66

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 502
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_settings_login:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->ax:Landroid/widget/Button;

    .line 503
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->ax:Landroid/widget/Button;

    invoke-virtual {v0, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 504
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->Z:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "health_app_third_login"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 505
    const-string v0, "1"

    invoke-virtual {v6, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_e

    .line 506
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->ax:Landroid/widget/Button;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setVisibility(I)V

    .line 508
    :cond_e
    return-void
.end method

.method public onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 7

    .line 1320
    invoke-virtual {p1}, Landroid/widget/CompoundButton;->getId()I

    move-result v0

    sget v1, Lcom/huawei/ui/main/R$id;->show_voice_switch:I

    if-ne v0, v1, :cond_1

    .line 1322
    const/16 v0, 0x4e22

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v4

    .line 1323
    const-string v5, "voice_enable_type"

    .line 1324
    new-instance v6, Lo/dcy;

    const/4 v0, 0x0

    invoke-direct {v6, v0}, Lo/dcy;-><init>(I)V

    .line 1325
    if-eqz p2, :cond_0

    .line 1326
    const-string v0, "1"

    invoke-static {p0, v4, v5, v0, v6}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    goto :goto_0

    .line 1328
    :cond_0
    const-string v0, "0"

    invoke-static {p0, v4, v5, v0, v6}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 1330
    :goto_0
    goto/16 :goto_5

    .line 1331
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->A:Lo/emu;

    if-ne p1, v0, :cond_2

    .line 1333
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->az:Lo/ffx;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->am:Lo/cbz;

    invoke-virtual {v0, p2, v1}, Lo/ffx;->b(ZLo/cbz;)V

    goto/16 :goto_5

    .line 1335
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->v:Lo/emu;

    if-ne p1, v0, :cond_4

    .line 1337
    new-instance v4, Lo/dcy;

    invoke-direct {v4}, Lo/dcy;-><init>()V

    .line 1338
    if-eqz p2, :cond_3

    .line 1339
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->Z:Landroid/content/Context;

    invoke-static {v0}, Lo/dcn;->e(Landroid/content/Context;)Lo/dcn;

    move-result-object v0

    const-string v1, "auto_synchronous_flag"

    const-string v2, "1"

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Lo/dcn;->e(Ljava/lang/String;Ljava/lang/String;Lo/dcx;)V

    .line 1340
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->az:Lo/ffx;

    sget-object v1, Lo/dae;->dX:Lo/dae;

    invoke-virtual {v1}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v1

    const-string v2, "1"

    invoke-virtual {v0, v1, v2}, Lo/ffx;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 1341
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->Z:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "auto_synchronous_flag"

    const-string v3, "1"

    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 1342
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->k:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 1343
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->w:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto :goto_1

    .line 1345
    :cond_3
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->az:Lo/ffx;

    sget-object v1, Lo/dae;->dX:Lo/dae;

    invoke-virtual {v1}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v1

    const-string v2, "2"

    invoke-virtual {v0, v1, v2}, Lo/ffx;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 1346
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->Z:Landroid/content/Context;

    invoke-static {v0}, Lo/dcn;->e(Landroid/content/Context;)Lo/dcn;

    move-result-object v0

    const-string v1, "auto_synchronous_flag"

    const-string v2, "0"

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Lo/dcn;->e(Ljava/lang/String;Ljava/lang/String;Lo/dcx;)V

    .line 1347
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->Z:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "auto_synchronous_flag"

    const-string v3, "0"

    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 1348
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->C:Lo/emu;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/emu;->setChecked(Z)V

    .line 1349
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->k:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 1350
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->w:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 1352
    :goto_1
    goto/16 :goto_5

    .line 1359
    :cond_4
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->C:Lo/emu;

    if-ne p1, v0, :cond_6

    .line 1360
    new-instance v4, Lo/dcy;

    invoke-direct {v4}, Lo/dcy;-><init>()V

    .line 1361
    if-eqz p2, :cond_5

    .line 1362
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->Z:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "auto_synchronous_wlan_flag"

    const-string v3, "1"

    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    goto :goto_2

    .line 1364
    :cond_5
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->Z:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "auto_synchronous_wlan_flag"

    const-string v3, "0"

    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 1366
    :goto_2
    goto/16 :goto_5

    .line 1367
    :cond_6
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->B:Lo/emu;

    if-ne p1, v0, :cond_9

    .line 1368
    const-string v0, "UIME_AppSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mGPSLowConsumptionSwitchStatus = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->F:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1369
    new-instance v4, Lo/dcy;

    invoke-direct {v4}, Lo/dcy;-><init>()V

    .line 1370
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->G:Z

    if-eqz v0, :cond_8

    .line 1371
    if-eqz p2, :cond_7

    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->F:Z

    if-nez v0, :cond_7

    .line 1372
    const-string v0, "UIME_AppSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mGPSLowConsumptionSwitch isChecked = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1373
    new-instance v0, Lo/egy$b;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->Z:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/egy$b;-><init>(Landroid/content/Context;)V

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_setting_is_allow_gps_low_consumption:I

    .line 1374
    invoke-virtual {v0, v1}, Lo/egy$b;->b(I)Lo/egy$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_cancel:I

    new-instance v2, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$3;

    invoke-direct {v2, p0}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$3;-><init>(Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;)V

    .line 1375
    invoke-virtual {v0, v1, v2}, Lo/egy$b;->e(ILandroid/view/View$OnClickListener;)Lo/egy$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_common_ui_dialog_confirm:I

    new-instance v2, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$2;

    invoke-direct {v2, p0}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$2;-><init>(Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;)V

    .line 1381
    invoke-virtual {v0, v1, v2}, Lo/egy$b;->d(ILandroid/view/View$OnClickListener;)Lo/egy$b;

    move-result-object v0

    .line 1388
    invoke-virtual {v0}, Lo/egy$b;->a()Lo/egy;

    move-result-object v5

    .line 1389
    new-instance v0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$1;

    invoke-direct {v0, p0, v4}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$1;-><init>(Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;Lo/dcy;)V

    invoke-virtual {v5, v0}, Lo/egy;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    .line 1404
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Lo/egy;->setCancelable(Z)V

    .line 1405
    invoke-virtual {v5}, Lo/egy;->show()V

    .line 1407
    goto :goto_3

    :cond_7
    if-nez p2, :cond_8

    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->F:Z

    const/4 v1, 0x1

    if-ne v0, v1, :cond_8

    .line 1408
    new-instance v0, Lo/egy$b;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->Z:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/egy$b;-><init>(Landroid/content/Context;)V

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_setting_is_disagree_gps_low_consumption:I

    .line 1409
    invoke-virtual {v0, v1}, Lo/egy$b;->b(I)Lo/egy$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_cancel:I

    new-instance v2, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$8;

    invoke-direct {v2, p0}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$8;-><init>(Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;)V

    .line 1410
    invoke-virtual {v0, v1, v2}, Lo/egy$b;->e(ILandroid/view/View$OnClickListener;)Lo/egy$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_common_ui_dialog_confirm:I

    new-instance v2, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$5;

    invoke-direct {v2, p0}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$5;-><init>(Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;)V

    .line 1416
    invoke-virtual {v0, v1, v2}, Lo/egy$b;->d(ILandroid/view/View$OnClickListener;)Lo/egy$b;

    move-result-object v0

    .line 1423
    invoke-virtual {v0}, Lo/egy$b;->a()Lo/egy;

    move-result-object v5

    .line 1424
    new-instance v0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$10;

    invoke-direct {v0, p0, v4}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$10;-><init>(Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;Lo/dcy;)V

    invoke-virtual {v5, v0}, Lo/egy;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    .line 1441
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Lo/egy;->setCancelable(Z)V

    .line 1442
    invoke-virtual {v5}, Lo/egy;->show()V

    .line 1443
    const-string v0, "UIME_AppSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mGPSLowConsumptionSwitch isChecked = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1446
    :cond_8
    :goto_3
    goto :goto_5

    :cond_9
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->j:Lo/emu;

    if-ne p1, v0, :cond_b

    .line 1448
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->aG:Lo/fcb;

    if-nez p2, :cond_a

    const/4 v1, 0x1

    goto :goto_4

    :cond_a
    const/4 v1, 0x0

    :goto_4
    invoke-virtual {v0, v1}, Lo/fcb;->e(Z)V

    .line 1449
    invoke-direct {p0, p2}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->b(Z)V

    .line 1451
    :cond_b
    :goto_5
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 10

    .line 1072
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 1073
    const-string v0, "click"

    const-string v1, "1"

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1074
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->c:Landroid/widget/ImageButton;

    if-ne p1, v0, :cond_0

    .line 1075
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->finish()V

    goto/16 :goto_6

    .line 1076
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->C:Lo/emu;

    if-ne p1, v0, :cond_1

    goto/16 :goto_6

    .line 1078
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->ax:Landroid/widget/Button;

    if-ne p1, v0, :cond_2

    .line 1079
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->l()V

    goto/16 :goto_6

    .line 1081
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->v:Lo/emu;

    if-ne p1, v0, :cond_3

    goto/16 :goto_6

    .line 1083
    :cond_3
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/huawei/ui/main/R$id;->hw_offline_map_layout:I

    if-ne v0, v1, :cond_e

    .line 1084
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->s()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_4

    .line 1086
    new-instance v6, Lo/egv$b;

    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->Z:Landroid/content/Context;

    invoke-direct {v6, v0}, Lo/egv$b;-><init>(Landroid/content/Context;)V

    .line 1087
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_offline_map:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lo/egv$b;->e(Ljava/lang/String;)Lo/egv$b;

    move-result-object v0

    .line 1088
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_offline_map_google_content:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egv$b;->b(Ljava/lang/String;)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_common_ui_dialog_confirm:I

    new-instance v2, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$17;

    invoke-direct {v2, p0}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$17;-><init>(Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;)V

    .line 1089
    invoke-virtual {v0, v1, v2}, Lo/egv$b;->e(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    .line 1095
    invoke-virtual {v6}, Lo/egv$b;->b()Lo/egv;

    move-result-object v5

    .line 1096
    invoke-virtual {v5}, Lo/egv;->show()V

    .line 1097
    goto/16 :goto_6

    .line 1098
    :cond_4
    sget-object v0, Lo/dae;->dG:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v5

    .line 1099
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->Z:Landroid/content/Context;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v5, v4, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 1100
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lo/dbf;->n(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v6

    .line 1101
    if-eqz v6, :cond_8

    .line 1102
    const/4 v0, 0x1

    new-array v7, v0, [Ljava/lang/String;

    const-string v0, "android.permission.ACCESS_COARSE_LOCATION"

    const/4 v1, 0x0

    aput-object v0, v7, v1

    .line 1104
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->Z:Landroid/content/Context;

    invoke-static {v0, v7}, Lo/dbe;->c(Landroid/content/Context;[Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_7

    .line 1105
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_7

    .line 1106
    const-string v0, "android.permission.ACCESS_COARSE_LOCATION"

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->shouldShowRequestPermissionRationale(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_5

    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->Z:Landroid/content/Context;

    const-string v1, "android.permission.ACCESS_COARSE_LOCATION"

    invoke-static {v0, v1}, Lo/dbf;->l(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6

    :cond_5
    const/4 v8, 0x1

    goto :goto_0

    :cond_6
    const/4 v8, 0x0

    .line 1107
    :goto_0
    if-nez v8, :cond_7

    .line 1108
    const/4 v0, 0x0

    invoke-static {p0, v0}, Lo/ene;->b(Landroid/content/Context;Z)V

    .line 1109
    return-void

    .line 1113
    :cond_7
    goto :goto_3

    .line 1115
    :cond_8
    const/4 v0, 0x2

    new-array v7, v0, [Ljava/lang/String;

    const-string v0, "android.permission.WRITE_EXTERNAL_STORAGE"

    const/4 v1, 0x0

    aput-object v0, v7, v1

    const-string v0, "android.permission.ACCESS_COARSE_LOCATION"

    const/4 v1, 0x1

    aput-object v0, v7, v1

    .line 1118
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->Z:Landroid/content/Context;

    invoke-static {v0, v7}, Lo/dbe;->c(Landroid/content/Context;[Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_d

    .line 1119
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_d

    .line 1120
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->Z:Landroid/content/Context;

    const-string v1, "android.permission.WRITE_EXTERNAL_STORAGE"

    invoke-static {v0, v1}, Lo/dbf;->l(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_9

    const-string v0, "android.permission.WRITE_EXTERNAL_STORAGE"

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->shouldShowRequestPermissionRationale(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_a

    :cond_9
    const/4 v8, 0x1

    goto :goto_1

    :cond_a
    const/4 v8, 0x0

    .line 1121
    :goto_1
    const-string v0, "android.permission.ACCESS_COARSE_LOCATION"

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->shouldShowRequestPermissionRationale(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_b

    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->Z:Landroid/content/Context;

    const-string v1, "android.permission.ACCESS_COARSE_LOCATION"

    invoke-static {v0, v1}, Lo/dbf;->l(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_c

    :cond_b
    const/4 v9, 0x1

    goto :goto_2

    :cond_c
    const/4 v9, 0x0

    .line 1123
    :goto_2
    if-nez v8, :cond_d

    if-nez v9, :cond_d

    .line 1125
    const/4 v0, 0x0

    invoke-static {p0, v0}, Lo/ene;->b(Landroid/content/Context;Z)V

    .line 1126
    return-void

    .line 1131
    :cond_d
    :goto_3
    new-instance v7, Landroid/content/Intent;

    const-class v0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/OfflineMapTabActivity;

    invoke-direct {v7, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 1132
    invoke-virtual {p0, v7}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->startActivity(Landroid/content/Intent;)V

    .line 1133
    goto/16 :goto_6

    .line 1134
    :cond_e
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->ab:Lo/cfz;

    invoke-virtual {v0}, Lo/cfz;->getmButton()Lo/egd;

    move-result-object v0

    if-ne p1, v0, :cond_f

    .line 1135
    sget-object v0, Lo/dae;->dI:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v5

    .line 1136
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->Z:Landroid/content/Context;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v5, v4, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 1137
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->m()V

    .line 1138
    goto/16 :goto_6

    :cond_f
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->b:Landroid/widget/RelativeLayout;

    if-ne p1, v0, :cond_10

    .line 1139
    new-instance v5, Landroid/content/Intent;

    const-class v0, Lcom/huawei/ui/main/stories/me/activity/HealthAboutActivity;

    invoke-direct {v5, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 1140
    invoke-virtual {p0, v5}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->startActivity(Landroid/content/Intent;)V

    .line 1141
    goto/16 :goto_6

    :cond_10
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->m:Landroid/widget/RelativeLayout;

    if-ne p1, v0, :cond_11

    .line 1142
    new-instance v5, Landroid/content/Intent;

    const-class v0, Lcom/huawei/ui/main/stories/me/activity/DeveloperActivity;

    invoke-direct {v5, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 1143
    invoke-virtual {p0, v5}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->startActivity(Landroid/content/Intent;)V

    .line 1144
    goto/16 :goto_6

    .line 1161
    :cond_11
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->ag:Landroid/widget/RelativeLayout;

    if-ne p1, v0, :cond_12

    .line 1162
    new-instance v5, Landroid/content/Intent;

    const-class v0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;

    invoke-direct {v5, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 1163
    invoke-virtual {p0, v5}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->startActivity(Landroid/content/Intent;)V

    .line 1164
    goto/16 :goto_6

    :cond_12
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->af:Landroid/widget/RelativeLayout;

    if-ne p1, v0, :cond_18

    .line 1165
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->Z:Landroid/content/Context;

    invoke-static {v0}, Lo/dbf;->v(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_17

    .line 1166
    const/4 v0, 0x1

    new-array v5, v0, [Ljava/lang/String;

    const-string v0, "android.permission.WRITE_EXTERNAL_STORAGE"

    const/4 v1, 0x0

    aput-object v0, v5, v1

    .line 1169
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->Z:Landroid/content/Context;

    invoke-static {v0, v5}, Lo/dbe;->c(Landroid/content/Context;[Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_15

    .line 1170
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_15

    .line 1171
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->Z:Landroid/content/Context;

    const-string v1, "android.permission.WRITE_EXTERNAL_STORAGE"

    invoke-static {v0, v1}, Lo/dbf;->l(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_13

    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->Z:Landroid/content/Context;

    check-cast v0, Landroid/app/Activity;

    const-string v1, "android.permission.WRITE_EXTERNAL_STORAGE"

    .line 1172
    invoke-virtual {v0, v1}, Landroid/app/Activity;->shouldShowRequestPermissionRationale(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_14

    :cond_13
    const/4 v6, 0x1

    goto :goto_4

    :cond_14
    const/4 v6, 0x0

    .line 1173
    :goto_4
    if-nez v6, :cond_15

    .line 1174
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->Z:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->Z:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_feedback_permission_guide_torage:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/ene;->c(Landroid/content/Context;Ljava/lang/String;)V

    .line 1175
    return-void

    .line 1179
    :cond_15
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->Z:Landroid/content/Context;

    const-string v1, "android.permission.WRITE_EXTERNAL_STORAGE"

    invoke-static {v0, v1}, Landroid/support/v4/content/ContextCompat;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    if-eqz v0, :cond_16

    .line 1181
    const-string v0, "UIME_AppSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "have not permission"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1183
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->Z:Landroid/content/Context;

    const-string v1, "android.permission.WRITE_EXTERNAL_STORAGE"

    invoke-static {v0, v1}, Lo/dbf;->m(Landroid/content/Context;Ljava/lang/String;)V

    .line 1184
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "android.permission.WRITE_EXTERNAL_STORAGE"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    iget v1, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->aj:I

    invoke-static {p0, v0, v1}, Landroid/support/v4/app/ActivityCompat;->requestPermissions(Landroid/app/Activity;[Ljava/lang/String;I)V

    goto :goto_5

    .line 1187
    :cond_16
    const-string v0, "UIME_AppSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "have permission"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1188
    new-instance v6, Landroid/content/Intent;

    const-class v0, Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity;

    invoke-direct {v6, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 1189
    invoke-virtual {p0, v6}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->startActivity(Landroid/content/Intent;)V

    .line 1191
    :goto_5
    goto/16 :goto_6

    .line 1192
    :cond_17
    new-instance v5, Landroid/content/Intent;

    const-class v0, Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity;

    invoke-direct {v5, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 1193
    invoke-virtual {p0, v5}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->startActivity(Landroid/content/Intent;)V

    .line 1194
    goto/16 :goto_6

    .line 1195
    :cond_18
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->p:Landroid/widget/RelativeLayout;

    if-ne p1, v0, :cond_19

    .line 1196
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->az:Lo/ffx;

    sget-object v1, Lo/dae;->dW:Lo/dae;

    invoke-virtual {v1}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lo/ffx;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 1197
    new-instance v5, Landroid/content/Intent;

    const-class v0, Lcom/huawei/ui/main/stories/account/activity/ThirdPartyLoginActivity;

    invoke-direct {v5, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 1198
    invoke-virtual {p0, v5}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->startActivity(Landroid/content/Intent;)V

    .line 1199
    goto/16 :goto_6

    :cond_19
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->l:Landroid/widget/RelativeLayout;

    if-ne p1, v0, :cond_1a

    .line 1200
    sget-object v0, Lo/dae;->dH:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v5

    .line 1201
    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    .line 1202
    const-string v0, "click"

    const-string v1, "1"

    invoke-interface {v6, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1203
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->Z:Landroid/content/Context;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v5, v6, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 1205
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->ap:Z

    .line 1206
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->ao:Z

    .line 1207
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->k()V

    .line 1208
    goto/16 :goto_6

    :cond_1a
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->s:Landroid/widget/RelativeLayout;

    if-ne p1, v0, :cond_1b

    .line 1209
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->p()V

    goto/16 :goto_6

    .line 1210
    :cond_1b
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->i:Landroid/widget/RelativeLayout;

    if-ne p1, v0, :cond_1c

    .line 1211
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->az:Lo/ffx;

    sget-object v1, Lo/dae;->dV:Lo/dae;

    invoke-virtual {v1}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lo/ffx;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 1212
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->t()V

    goto/16 :goto_6

    .line 1213
    :cond_1c
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->t:Landroid/widget/RelativeLayout;

    if-ne p1, v0, :cond_1d

    .line 1214
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->az:Lo/ffx;

    sget-object v1, Lo/dae;->dS:Lo/dae;

    invoke-virtual {v1}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lo/ffx;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 1215
    new-instance v5, Landroid/content/Intent;

    const-class v0, Lcom/huawei/ui/main/stories/settings/activity/heartrate/HeartRateZoneSettingActivity;

    invoke-direct {v5, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 1216
    invoke-virtual {p0, v5}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->startActivity(Landroid/content/Intent;)V

    .line 1217
    goto/16 :goto_6

    :cond_1d
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->x:Landroid/widget/RelativeLayout;

    if-ne p1, v0, :cond_1e

    .line 1218
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->Z:Landroid/content/Context;

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->d(Landroid/content/Context;)V

    goto/16 :goto_6

    .line 1219
    :cond_1e
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->f:Landroid/widget/RelativeLayout;

    if-ne p1, v0, :cond_20

    .line 1220
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    .line 1221
    iget-wide v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->aB:J

    sub-long v0, v5, v0

    const-wide/16 v2, 0x3e8

    cmp-long v0, v0, v2

    if-lez v0, :cond_1f

    .line 1222
    sget-object v0, Lo/dae;->ei:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v7

    .line 1223
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->Z:Landroid/content/Context;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v7, v4, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 1224
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->ay:Lo/fit;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->Z:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lo/fit;->c(Landroid/content/Context;)V

    .line 1225
    iput-wide v5, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->aB:J

    .line 1227
    :cond_1f
    goto :goto_6

    :cond_20
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->r:Landroid/widget/RelativeLayout;

    if-ne p1, v0, :cond_21

    .line 1228
    new-instance v5, Landroid/content/Intent;

    const-class v0, Lcom/huawei/ui/main/stories/me/activity/DeviceTestActivity;

    invoke-direct {v5, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 1229
    invoke-virtual {p0, v5}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->startActivity(Landroid/content/Intent;)V

    .line 1230
    goto :goto_6

    :cond_21
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->aD:Landroid/widget/RelativeLayout;

    if-ne p1, v0, :cond_22

    .line 1231
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->az:Lo/ffx;

    sget-object v1, Lo/dae;->eC:Lo/dae;

    invoke-virtual {v1}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lo/ffx;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 1232
    new-instance v5, Landroid/content/Intent;

    const-class v0, Lcom/huawei/ui/main/stories/me/activity/OpensourceNoticeActivity;

    invoke-direct {v5, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 1233
    invoke-virtual {p0, v5}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->startActivity(Landroid/content/Intent;)V

    .line 1243
    :cond_22
    :goto_6
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 2

    .line 239
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 240
    sget v0, Lcom/huawei/ui/main/R$layout;->hw_show_settings_app:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->setContentView(I)V

    .line 241
    new-instance v0, Lcom/huawei/hihealth/HiUserInfo;

    invoke-direct {v0}, Lcom/huawei/hihealth/HiUserInfo;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->d:Lcom/huawei/hihealth/HiUserInfo;

    .line 242
    new-instance v0, Lcom/huawei/up/model/UserInfomation;

    invoke-direct {v0}, Lcom/huawei/up/model/UserInfomation;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->e:Lcom/huawei/up/model/UserInfomation;

    .line 243
    new-instance v0, Lo/cfy;

    invoke-direct {v0, p0}, Lo/cfy;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->y:Lo/cfy;

    .line 244
    new-instance v0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$d;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$d;-><init>(Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->ad:Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$d;

    .line 245
    iput-object p0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->Z:Landroid/content/Context;

    .line 246
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->Z:Landroid/content/Context;

    invoke-static {v0}, Lo/fit;->b(Landroid/content/Context;)Lo/fit;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->ay:Lo/fit;

    .line 247
    new-instance v0, Lo/ffx;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->Z:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/ffx;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->az:Lo/ffx;

    .line 248
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->ay:Lo/fit;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->aJ:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Lo/fit;->a(Landroid/os/Handler;)V

    .line 249
    new-instance v0, Lo/fcb;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->Z:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/fcb;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->aG:Lo/fcb;

    .line 250
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->aL:Z

    .line 252
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->a()V

    .line 253
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->e()V

    .line 254
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->b()V

    .line 255
    return-void
.end method

.method public onDestroy()V
    .locals 4

    .line 774
    const-string v0, "UIME_AppSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter onDestroy()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 775
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->ad:Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$d;

    if-eqz v0, :cond_0

    .line 776
    const-string v0, "UIME_AppSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "unregisterReceiver mReceiver"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 777
    invoke-static {p0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->ad:Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$d;

    invoke-virtual {v0, v1}, Landroid/support/v4/content/LocalBroadcastManager;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 779
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->ah:Z

    .line 781
    :cond_0
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onDestroy()V

    .line 783
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->am:Lo/cbz;

    if-eqz v0, :cond_1

    .line 784
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->am:Lo/cbz;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->Z:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lo/cbz;->c(Landroid/content/Context;)V

    .line 785
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->am:Lo/cbz;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->Z:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lo/cbz;->e(Landroid/content/Context;)V

    .line 788
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->aq:Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$c;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 789
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->aq:Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$c;

    .line 791
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->aw:Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$c;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 792
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->aw:Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$c;

    .line 794
    :cond_3
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->au:Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$c;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    .line 795
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->au:Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$c;

    .line 798
    :cond_4
    return-void
.end method

.method public onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    .locals 5

    .line 1246
    iget v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->aj:I

    if-ne p1, v0, :cond_2

    .line 1247
    array-length v0, p3

    if-nez v0, :cond_0

    .line 1248
    const-string v0, "UIME_AppSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "grantResults length 0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1249
    return-void

    .line 1251
    :cond_0
    const-string v0, "UIME_AppSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getpermission onRequestPermissionsResult back"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1252
    const/4 v0, 0x0

    aget v0, p3, v0

    if-nez v0, :cond_1

    .line 1254
    const-string v0, "UIME_AppSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getpermission succeed"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1255
    new-instance v4, Landroid/content/Intent;

    const-class v0, Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity;

    invoke-direct {v4, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 1256
    invoke-virtual {p0, v4}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->startActivity(Landroid/content/Intent;)V

    .line 1257
    goto :goto_0

    .line 1260
    :cond_1
    const-string v0, "UIME_AppSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getpermission onRequestPermissionsResult rejected"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1263
    :cond_2
    :goto_0
    return-void
.end method

.method public onResume()V
    .locals 4

    .line 1466
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onResume()V

    .line 1467
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->ah:Z

    if-nez v0, :cond_0

    invoke-static {}, Lo/czu;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1468
    new-instance v3, Landroid/content/IntentFilter;

    invoke-direct {v3}, Landroid/content/IntentFilter;-><init>()V

    .line 1469
    const-string v0, "com.huawei.hihealth.action_sync"

    invoke-virtual {v3, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 1470
    invoke-static {p0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->ad:Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$d;

    invoke-virtual {v0, v1, v3}, Landroid/support/v4/content/LocalBroadcastManager;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V

    .line 1472
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->ah:Z

    .line 1474
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->Z:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "auto_synchronous_flag"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 1476
    const-string v0, "0"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1478
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->v:Lo/emu;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/emu;->setChecked(Z)V

    goto :goto_0

    .line 1480
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->v:Lo/emu;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/emu;->setChecked(Z)V

    .line 1484
    :goto_0
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->aB:J

    .line 1487
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->q()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->aL:Z

    if-nez v0, :cond_2

    .line 1488
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->m:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 1489
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->aI:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_1

    .line 1491
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->m:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 1492
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->aI:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 1494
    :goto_1
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->f()V

    .line 1495
    return-void
.end method
