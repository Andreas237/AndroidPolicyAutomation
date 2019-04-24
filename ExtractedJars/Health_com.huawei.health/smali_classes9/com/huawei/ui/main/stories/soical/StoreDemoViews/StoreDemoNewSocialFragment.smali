.class public Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;
.super Landroid/support/v4/app/Fragment;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Lo/ely;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment$a;,
        Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment$e;,
        Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment$d;
    }
.end annotation


# static fields
.field private static final W:Ljava/lang/Object;

.field private static ab:I


# instance fields
.field private A:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Landroid/widget/ImageView;>;"
        }
    .end annotation
.end field

.field private B:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;>;"
        }
    .end annotation
.end field

.field private C:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;>;"
        }
    .end annotation
.end field

.field private D:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Landroid/view/View;>;"
        }
    .end annotation
.end field

.field private E:Lo/fic;

.field private F:Landroid/os/Handler;

.field private G:Ljava/lang/String;

.field private H:Landroid/os/HandlerThread;

.field private I:Landroid/widget/RelativeLayout;

.field private J:Landroid/widget/RelativeLayout;

.field private K:Lo/fii;

.field private L:Lo/fia;

.field private M:Z

.field private N:Landroid/widget/ImageView;

.field private O:Landroid/widget/LinearLayout;

.field private P:Lo/fid;

.field private Q:Lo/dth;

.field private R:Lo/elz;

.field private S:Ljava/lang/String;

.field private T:Lo/egd;

.field private U:Landroid/widget/TextView;

.field private V:Landroid/widget/LinearLayout;

.field private X:Landroid/widget/ImageView;

.field private Y:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/fil;>;"
        }
    .end annotation
.end field

.field private Z:Landroid/graphics/drawable/AnimationDrawable;

.field public a:Ljava/lang/String;

.field private aa:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/fil;>;"
        }
    .end annotation
.end field

.field private ac:Landroid/widget/ImageView;

.field private ad:Lo/fih;

.field private final ae:Landroid/content/BroadcastReceiver;

.field private af:Ljava/lang/Runnable;

.field private ag:Landroid/os/Handler;

.field private ah:Ljava/lang/Runnable;

.field b:Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment$d;

.field private c:Landroid/view/View;

.field d:Lorg/json/JSONArray;

.field public e:J

.field private f:Landroid/widget/LinearLayout;

.field private g:Landroid/widget/LinearLayout;

.field private h:Landroid/widget/LinearLayout;

.field private i:Landroid/widget/LinearLayout;

.field private j:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;>;"
        }
    .end annotation
.end field

.field private k:Landroid/widget/LinearLayout;

.field private l:Landroid/widget/RelativeLayout;

.field private m:Landroid/support/v7/widget/RecyclerView;

.field private n:Landroid/widget/LinearLayout;

.field private o:Landroid/content/Context;

.field private p:Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment$a;

.field private q:Landroid/widget/ImageView;

.field private r:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Landroid/widget/ImageView;>;"
        }
    .end annotation
.end field

.field private s:Landroid/widget/ImageView;

.field private t:Landroid/widget/ImageView;

.field private u:Landroid/support/v4/view/ViewPager;

.field private v:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;>;"
        }
    .end annotation
.end field

.field private w:I

.field private x:J

.field private y:I

.field private z:Landroid/view/View;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 230
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->W:Ljava/lang/Object;

    .line 238
    const/16 v0, 0x7d0

    sput v0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->ab:I

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 246
    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    .line 119
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->e:J

    .line 151
    const/16 v0, 0xfa0

    iput v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->w:I

    .line 153
    const-wide/16 v0, 0x3e8

    iput-wide v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->x:J

    .line 157
    const/4 v0, 0x1

    iput v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->y:I

    .line 166
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->v:Ljava/util/List;

    .line 168
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->C:Ljava/util/List;

    .line 170
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->j:Ljava/util/List;

    .line 172
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->A:Ljava/util/List;

    .line 178
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->B:Ljava/util/List;

    .line 180
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->D:Ljava/util/ArrayList;

    .line 184
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->H:Landroid/os/HandlerThread;

    .line 185
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->F:Landroid/os/Handler;

    .line 188
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->d:Lorg/json/JSONArray;

    .line 189
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->a:Ljava/lang/String;

    .line 200
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->G:Ljava/lang/String;

    .line 204
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->M:Z

    .line 220
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->S:Ljava/lang/String;

    .line 235
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->V:Landroid/widget/LinearLayout;

    .line 241
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->aa:Ljava/util/List;

    .line 242
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->Y:Ljava/util/List;

    .line 243
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->ad:Lo/fih;

    .line 854
    new-instance v0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment$6;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment$6;-><init>(Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->af:Ljava/lang/Runnable;

    .line 1232
    new-instance v0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment$10;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment$10;-><init>(Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->ag:Landroid/os/Handler;

    .line 1347
    new-instance v0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment$14;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment$14;-><init>(Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->ah:Ljava/lang/Runnable;

    .line 1482
    new-instance v0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment$2;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment$2;-><init>(Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->ae:Landroid/content/BroadcastReceiver;

    .line 246
    return-void
.end method

.method private a(F)I
    .locals 3

    .line 543
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->o:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v2, v0, Landroid/util/DisplayMetrics;->density:F

    .line 544
    mul-float v0, p1, v2

    const/high16 v1, 0x3f000000    # 0.5f

    add-float/2addr v0, v1

    float-to-int v0, v0

    return v0
.end method

.method static synthetic a(Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;I)I
    .locals 0

    .line 107
    iput p1, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->y:I

    return p1
.end method

.method static synthetic a(Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;)V
    .locals 0

    .line 107
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->k()V

    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;Landroid/widget/ImageView;Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;)V
    .locals 0

    .line 107
    invoke-direct {p0, p1, p2}, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->c(Landroid/widget/ImageView;Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;)V

    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;Ljava/util/List;)V
    .locals 0

    .line 107
    invoke-direct {p0, p1}, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->c(Ljava/util/List;)V

    return-void
.end method

.method private a(Landroid/widget/ImageView;Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;)Z
    .locals 8

    .line 624
    const/4 v4, 0x1

    .line 625
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    const/4 v0, 0x0

    if-ne v0, p2, :cond_1

    .line 626
    :cond_0
    const-string v0, "UIDV_StoreDemoNewSocialFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "imageView||messageObject is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 627
    const/4 v4, 0x0

    .line 631
    :cond_1
    const/4 v5, 0x0

    .line 633
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 634
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->C:Ljava/util/List;

    invoke-interface {v6, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 635
    const/4 v7, 0x0

    :goto_0
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    if-ge v7, v0, :cond_3

    .line 636
    invoke-interface {v6, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    if-eqz p2, :cond_2

    invoke-virtual {p2}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getMsgId()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v6, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;

    invoke-virtual {v1}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getMsgId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 637
    const/4 v5, 0x1

    .line 635
    :cond_2
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 640
    :cond_3
    if-nez v5, :cond_4

    .line 641
    const-string v0, "UIDV_StoreDemoNewSocialFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "this ad is not in display list"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 642
    const/4 v4, 0x0

    .line 644
    :cond_4
    return v4
.end method

.method static synthetic b(Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;)Landroid/content/Context;
    .locals 1

    .line 107
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->o:Landroid/content/Context;

    return-object v0
.end method

.method private b(Landroid/graphics/drawable/Drawable;)Landroid/view/View;
    .locals 5

    .line 615
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->o:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v2

    .line 616
    sget v0, Lcom/huawei/ui/main/R$layout;->layout_social_cardview:I

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v3

    .line 617
    sget v0, Lcom/huawei/ui/main/R$id;->card_image:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/widget/ImageView;

    .line 618
    invoke-virtual {v4, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 619
    return-object v3
.end method

.method private b()V
    .locals 6

    .line 505
    :try_start_0
    const-class v0, Landroid/support/v4/view/ViewPager;

    const-string v1, "mScroller"

    invoke-virtual {v0, v1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v4

    .line 506
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    .line 507
    new-instance v5, Lo/fim;

    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->o:Landroid/content/Context;

    invoke-direct {v5, v0}, Lo/fim;-><init>(Landroid/content/Context;)V

    .line 508
    const/16 v0, 0x320

    invoke-virtual {v5, v0}, Lo/fim;->c(I)V

    .line 509
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->u:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v4, v0, v5}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 512
    goto :goto_0

    .line 510
    :catch_0
    move-exception v4

    .line 511
    const-string v0, "UIDV_StoreDemoNewSocialFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 513
    :goto_0
    return-void
.end method

.method static synthetic b(Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;Z)Z
    .locals 0

    .line 107
    iput-boolean p1, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->M:Z

    return p1
.end method

.method private c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 11

    .line 933
    const-string v4, ""

    .line 934
    const/4 v5, 0x0

    .line 936
    :try_start_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ".txt"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lo/dmq;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v0

    move-object v5, v0

    .line 937
    invoke-virtual {v5}, Ljava/io/InputStream;->available()I

    move-result v6

    .line 938
    new-array v7, v6, [B

    .line 939
    invoke-virtual {v5, v7}, Ljava/io/InputStream;->read([B)I

    move-result v8

    .line 940
    if-lez v8, :cond_0

    .line 941
    new-instance v0, Ljava/lang/String;

    const-string v1, "UTF-8"

    invoke-direct {v0, v7, v1}, Ljava/lang/String;-><init>([BLjava/lang/String;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v4, v0

    .line 946
    :cond_0
    if-eqz v5, :cond_2

    .line 948
    :try_start_1
    invoke-virtual {v5}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 951
    goto/16 :goto_1

    .line 949
    :catch_0
    move-exception v6

    .line 950
    const-string v0, "UIDV_StoreDemoNewSocialFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getBetaFile e is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 951
    goto :goto_1

    .line 943
    :catch_1
    move-exception v6

    .line 944
    const-string v0, "UIDV_StoreDemoNewSocialFragment"

    const/4 v1, 0x2

    :try_start_2
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getBetaFile e is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 946
    if-eqz v5, :cond_2

    .line 948
    :try_start_3
    invoke-virtual {v5}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    .line 951
    goto :goto_1

    .line 949
    :catch_2
    move-exception v6

    .line 950
    const-string v0, "UIDV_StoreDemoNewSocialFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getBetaFile e is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 951
    goto :goto_1

    .line 946
    :catchall_0
    move-exception v9

    if-eqz v5, :cond_1

    .line 948
    :try_start_4
    invoke-virtual {v5}, Ljava/io/InputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3

    .line 951
    goto :goto_0

    .line 949
    :catch_3
    move-exception v10

    .line 950
    const-string v0, "UIDV_StoreDemoNewSocialFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getBetaFile e is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v10}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 953
    :cond_1
    :goto_0
    throw v9

    .line 954
    :cond_2
    :goto_1
    return-object v4
.end method

.method private c()V
    .locals 9

    .line 310
    const-string v0, "UIDV_StoreDemoNewSocialFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter initView"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 312
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->c:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->social_activity_card:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->h:Landroid/widget/LinearLayout;

    .line 313
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->c:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->social_shop_card:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->g:Landroid/widget/LinearLayout;

    .line 314
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->c:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->social_information_card:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->i:Landroid/widget/LinearLayout;

    .line 315
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->c:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->social_service_card:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->k:Landroid/widget/LinearLayout;

    .line 317
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->h:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 318
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->g:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 319
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->i:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 320
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->k:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 323
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->c:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->social_activity_container:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->f:Landroid/widget/LinearLayout;

    .line 325
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->c:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->social_root_lyt:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->n:Landroid/widget/LinearLayout;

    .line 326
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->c:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->social_net_work_layout:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->l:Landroid/widget/RelativeLayout;

    .line 327
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->c:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->social_tips_no_net_work:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->U:Landroid/widget/TextView;

    .line 328
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->c:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->social_reload_layout:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->J:Landroid/widget/RelativeLayout;

    .line 329
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->c:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->social_btn_no_net_work:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->T:Lo/egd;

    .line 331
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->c:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->layout_loading:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->V:Landroid/widget/LinearLayout;

    .line 332
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->V:Landroid/widget/LinearLayout;

    sget v1, Lcom/huawei/ui/main/R$id;->info_loading:I

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->ac:Landroid/widget/ImageView;

    .line 333
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->ac:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    check-cast v0, Landroid/graphics/drawable/AnimationDrawable;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->Z:Landroid/graphics/drawable/AnimationDrawable;

    .line 335
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->c:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->social_activity_recycle_view:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/RecyclerView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->m:Landroid/support/v7/widget/RecyclerView;

    .line 337
    new-instance v0, Lo/fih;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->o:Landroid/content/Context;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->Y:Ljava/util/List;

    invoke-direct {v0, v1, v2}, Lo/fih;-><init>(Landroid/content/Context;Ljava/util/List;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->ad:Lo/fih;

    .line 339
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->o:Landroid/content/Context;

    invoke-static {v0}, Lo/ene;->t(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 340
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->m:Landroid/support/v7/widget/RecyclerView;

    new-instance v1, Landroid/support/v7/widget/GridLayoutManager;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->o:Landroid/content/Context;

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    invoke-direct {v1, v2, v3, v4, v5}, Landroid/support/v7/widget/GridLayoutManager;-><init>(Landroid/content/Context;IIZ)V

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    goto :goto_0

    .line 342
    :cond_0
    new-instance v6, Landroid/support/v7/widget/LinearLayoutManager;

    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->o:Landroid/content/Context;

    invoke-direct {v6, v0}, Landroid/support/v7/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    .line 343
    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Landroid/support/v7/widget/LinearLayoutManager;->setOrientation(I)V

    .line 344
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->m:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0, v6}, Landroid/support/v7/widget/RecyclerView;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    .line 347
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->m:Landroid/support/v7/widget/RecyclerView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->ad:Lo/fih;

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setAdapter(Landroid/support/v7/widget/RecyclerView$Adapter;)V

    .line 349
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->m:Landroid/support/v7/widget/RecyclerView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setNestedScrollingEnabled(Z)V

    .line 350
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->m:Landroid/support/v7/widget/RecyclerView;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setHasFixedSize(Z)V

    .line 352
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->c:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->social_activity_title:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->I:Landroid/widget/RelativeLayout;

    .line 355
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->h:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 356
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->g:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 357
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->k:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 358
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->i:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 361
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->l:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 362
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->J:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 363
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->T:Lo/egd;

    invoke-virtual {v0, p0}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 365
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->I:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 367
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->c:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->social_activity_more_layout:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Landroid/widget/LinearLayout;

    .line 368
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->c:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->activity_more_arrow:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->N:Landroid/widget/ImageView;

    .line 370
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->N:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 371
    const/16 v0, 0x8

    invoke-virtual {v6, v0}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 373
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->c:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->activity_red_dot:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->X:Landroid/widget/ImageView;

    .line 374
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->o:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 375
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->N:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$drawable;->common_ui_arrow_left:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    goto :goto_1

    .line 377
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->N:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$drawable;->ic_health_list_arrow_gray:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 380
    :goto_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->o:Landroid/content/Context;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/fic;->a(Landroid/content/Context;Z)V

    .line 381
    new-instance v0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment$a;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment$a;-><init>(Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->p:Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment$a;

    .line 382
    new-instance v7, Landroid/content/IntentFilter;

    invoke-direct {v7}, Landroid/content/IntentFilter;-><init>()V

    .line 383
    const-string v0, "main_social_red_dot_friend_show"

    invoke-virtual {v7, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 384
    const-string v0, "main_social_red_dot_friend_dismiss"

    invoke-virtual {v7, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 385
    const-string v0, "main_social_update_ranking"

    invoke-virtual {v7, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 386
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->o:Landroid/content/Context;

    invoke-static {v0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->p:Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment$a;

    invoke-virtual {v0, v1, v7}, Landroid/support/v4/content/LocalBroadcastManager;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V

    .line 387
    new-instance v8, Landroid/content/IntentFilter;

    invoke-direct {v8}, Landroid/content/IntentFilter;-><init>()V

    .line 388
    const-string v0, "com.huawei.android.sns.action.FRIENDLIST_UPDATE"

    invoke-virtual {v8, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 389
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->o:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->ae:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1, v8}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 392
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->e()V

    .line 393
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->c(Ljava/util/List;)V

    .line 394
    return-void
.end method

.method private c(Landroid/widget/ImageView;Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;)V
    .locals 6

    .line 550
    const-string v0, "UIDV_StoreDemoNewSocialFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "addImageToShow"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 552
    invoke-direct {p0, p1, p2}, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->a(Landroid/widget/ImageView;Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 553
    return-void

    .line 555
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->P:Lo/fid;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->j:Ljava/util/List;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->A:Ljava/util/List;

    invoke-virtual {v0, v1, p2, v2, p1}, Lo/fid;->b(Ljava/util/List;Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;Ljava/util/List;Landroid/widget/ImageView;)V

    .line 558
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->j:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-gt v1, v0, :cond_1

    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->j:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x3

    if-lt v1, v0, :cond_1

    .line 559
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->z:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 560
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->B:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 561
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->B:Ljava/util/List;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->j:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 562
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->D:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 564
    const/4 v4, 0x0

    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->A:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v4, v0, :cond_1

    .line 565
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->D:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->A:Ljava/util/List;

    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    invoke-virtual {v1}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->b(Landroid/graphics/drawable/Drawable;)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 564
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 569
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->j:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_2

    .line 571
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->j:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;

    .line 573
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->D:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->A:Ljava/util/List;

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    invoke-virtual {v1}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->b(Landroid/graphics/drawable/Drawable;)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 574
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->B:Ljava/util/List;

    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 577
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->j:Ljava/util/List;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->j:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;

    .line 579
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->D:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->A:Ljava/util/List;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->j:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    invoke-virtual {v1}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->b(Landroid/graphics/drawable/Drawable;)Landroid/view/View;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 580
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->B:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1, v5}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 582
    :cond_2
    const-string v0, "UIDV_StoreDemoNewSocialFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mADImageShowList size = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->D:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 585
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->r:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 586
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->j:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_3

    .line 587
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->t:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 588
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->q:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 589
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->s:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 591
    :cond_3
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->j:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x2

    if-ne v1, v0, :cond_4

    .line 592
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->t:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 593
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->q:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 594
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->s:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 595
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->r:Ljava/util/List;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->t:Landroid/widget/ImageView;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 596
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->r:Ljava/util/List;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->q:Landroid/widget/ImageView;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 599
    :cond_4
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->j:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x3

    if-ne v1, v0, :cond_5

    .line 600
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->t:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 601
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->q:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 602
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->s:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 603
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->r:Ljava/util/List;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->t:Landroid/widget/ImageView;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 604
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->r:Ljava/util/List;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->q:Landroid/widget/ImageView;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 605
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->r:Ljava/util/List;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->s:Landroid/widget/ImageView;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 607
    :cond_5
    return-void
.end method

.method static synthetic c(Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;)V
    .locals 0

    .line 107
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->o()V

    return-void
.end method

.method private c(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;>;)V"
        }
    .end annotation

    .line 678
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->D:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 679
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->u:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v0}, Landroid/support/v4/view/ViewPager;->removeAllViews()V

    .line 680
    const-string v0, "UIDV_StoreDemoNewSocialFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "no Ad message in database"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 681
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->z:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 682
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->t:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 683
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->q:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 684
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->s:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 687
    return-void
.end method

.method private d(Landroid/view/View;)V
    .locals 3

    .line 466
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->r:Ljava/util/List;

    .line 467
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->C:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 468
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->j:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 469
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->A:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 470
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->B:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 471
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->D:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 473
    sget v0, Lcom/huawei/ui/main/R$id;->v_dot0:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->t:Landroid/widget/ImageView;

    .line 474
    sget v0, Lcom/huawei/ui/main/R$id;->v_dot1:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->q:Landroid/widget/ImageView;

    .line 475
    sget v0, Lcom/huawei/ui/main/R$id;->v_dot2:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->s:Landroid/widget/ImageView;

    .line 477
    sget v0, Lcom/huawei/ui/main/R$id;->view_pager_common_top_banner:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v4/view/ViewPager;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->u:Landroid/support/v4/view/ViewPager;

    .line 479
    new-instance v0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment$d;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->D:Ljava/util/ArrayList;

    invoke-direct {v0, p0, v1}, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment$d;-><init>(Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;Ljava/util/ArrayList;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->b:Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment$d;

    .line 480
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->u:Landroid/support/v4/view/ViewPager;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->b:Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment$d;

    invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->setAdapter(Landroid/support/v4/view/PagerAdapter;)V

    .line 482
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->u:Landroid/support/v4/view/ViewPager;

    new-instance v1, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment$e;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment$e;-><init>(Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment$4;)V

    invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->setOnPageChangeListener(Landroid/support/v4/view/ViewPager$OnPageChangeListener;)V

    .line 483
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->u:Landroid/support/v4/view/ViewPager;

    new-instance v1, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment$8;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment$8;-><init>(Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;)V

    invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 496
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->b()V

    .line 497
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->i()V

    .line 498
    return-void
.end method

.method private d(Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;)V
    .locals 3

    .line 1215
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->O:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->removeAllViews()V

    .line 1220
    new-instance v0, Lo/fii;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->o:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/fii;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->K:Lo/fii;

    .line 1221
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->K:Lo/fii;

    invoke-virtual {v0, p2}, Lo/fii;->b(Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;)V

    .line 1225
    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v0, -0x2

    const/4 v1, -0x2

    invoke-direct {v2, v0, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 1226
    const/4 v0, 0x1

    iput v0, v2, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    .line 1227
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->O:Landroid/widget/LinearLayout;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->K:Lo/fii;

    invoke-virtual {v0, v1, v2}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 1229
    return-void
.end method

.method static synthetic d(Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;)V
    .locals 0

    .line 107
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->m()V

    return-void
.end method

.method static synthetic e(Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 107
    iput-object p1, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->S:Ljava/lang/String;

    return-object p1
.end method

.method private e()V
    .locals 2

    .line 434
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->l:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 435
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->n:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 436
    return-void
.end method

.method static synthetic e(Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;)V
    .locals 0

    .line 107
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->p()V

    return-void
.end method

.method static synthetic e(Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;)V
    .locals 0

    .line 107
    invoke-direct {p0, p1, p2}, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->d(Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;)V

    return-void
.end method

.method static synthetic f(Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;)Landroid/support/v4/view/ViewPager;
    .locals 1

    .line 107
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->u:Landroid/support/v4/view/ViewPager;

    return-object v0
.end method

.method private f()V
    .locals 2

    .line 893
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->ag:Landroid/os/Handler;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->af:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 894
    return-void
.end method

.method private g()I
    .locals 2

    .line 535
    new-instance v1, Landroid/util/DisplayMetrics;

    invoke-direct {v1}, Landroid/util/DisplayMetrics;-><init>()V

    .line 536
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->o:Landroid/content/Context;

    check-cast v0, Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getWindowManager()Landroid/view/WindowManager;

    move-result-object v0

    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V

    .line 537
    iget v0, v1, Landroid/util/DisplayMetrics;->widthPixels:I

    return v0
.end method

.method static synthetic g(Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;)Ljava/util/List;
    .locals 1

    .line 107
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->B:Ljava/util/List;

    return-object v0
.end method

.method static synthetic h(Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;)Ljava/util/ArrayList;
    .locals 1

    .line 107
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->D:Ljava/util/ArrayList;

    return-object v0
.end method

.method private h()V
    .locals 4

    .line 883
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->D:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->D:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x2

    if-le v0, v1, :cond_0

    .line 884
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->ag:Landroid/os/Handler;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->af:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 885
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->ag:Landroid/os/Handler;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->af:Ljava/lang/Runnable;

    iget v2, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->w:I

    int-to-long v2, v2

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 887
    :cond_0
    return-void
.end method

.method private i()V
    .locals 8

    .line 520
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->o:Landroid/content/Context;

    invoke-static {v0}, Lo/ene;->t(Landroid/content/Context;)Z

    move-result v4

    .line 521
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->g()I

    move-result v5

    .line 522
    const/high16 v0, 0x43b40000    # 360.0f

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->a(F)I

    move-result v0

    sub-int v0, v5, v0

    div-int/lit8 v6, v0, 0x2

    .line 523
    move v7, v6

    .line 524
    if-eqz v4, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->D:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_0

    .line 525
    const/high16 v0, 0x43b40000    # 360.0f

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->a(F)I

    move-result v0

    mul-int/lit8 v0, v0, 0x2

    sub-int v0, v5, v0

    div-int/lit8 v7, v0, 0x2

    .line 527
    :cond_0
    const-string v0, "UIDV_StoreDemoNewSocialFragment"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "resizeViewPager() Window width = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, "banner padding = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, "pageMargin = "

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 528
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->u:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v0, v7}, Landroid/support/v4/view/ViewPager;->setPageMargin(I)V

    .line 529
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->u:Landroid/support/v4/view/ViewPager;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v0, v6, v1, v6, v2}, Landroid/support/v4/view/ViewPager;->setPadding(IIII)V

    .line 530
    return-void
.end method

.method static synthetic i(Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;)V
    .locals 0

    .line 107
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->f()V

    return-void
.end method

.method private k()V
    .locals 9

    .line 905
    const-string v0, "UIDV_StoreDemoNewSocialFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initOperationList"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 907
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->o:Landroid/content/Context;

    const/16 v1, 0x271b

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "OPERATION_SOCIAL_ACTIVITY_SAVE"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 908
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->o:Landroid/content/Context;

    const/16 v1, 0x271b

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "OPERATION_ACTIVITY_CURRENT_TIME"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->G:Ljava/lang/String;

    .line 909
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->o:Landroid/content/Context;

    const/16 v1, 0x271b

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, " OPERATION_ACTIVITY_MAX_ID"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->a:Ljava/lang/String;

    .line 911
    :try_start_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->aa:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 912
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 913
    new-instance v5, Lorg/json/JSONArray;

    invoke-direct {v5, v4}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 914
    const/4 v6, 0x0

    :goto_0
    invoke-virtual {v5}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-ge v6, v0, :cond_0

    .line 915
    invoke-virtual {v5, v6}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v7

    .line 916
    invoke-static {v7}, Lo/fic;->c(Lorg/json/JSONObject;)Lo/fil;

    move-result-object v8

    .line 917
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->aa:Ljava/util/List;

    invoke-interface {v0, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 914
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 921
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->ag:Landroid/os/Handler;

    const/16 v1, 0x18

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 924
    goto :goto_1

    .line 922
    :catch_0
    move-exception v5

    .line 923
    const-string v0, "UIDV_StoreDemoNewSocialFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Json data error! JSONException:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 927
    :goto_1
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->p()V

    .line 928
    return-void
.end method

.method static synthetic k(Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;)V
    .locals 0

    .line 107
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->h()V

    return-void
.end method

.method static synthetic l(Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;)Ljava/util/List;
    .locals 1

    .line 107
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->r:Ljava/util/List;

    return-object v0
.end method

.method private l()V
    .locals 4

    .line 1079
    const-string v0, "UIDV_StoreDemoNewSocialFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updateOperationActivity()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1081
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->aa:Ljava/util/List;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 1083
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->Y:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 1084
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->Y:Ljava/util/List;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->aa:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 1085
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->Y:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-gtz v0, :cond_0

    .line 1086
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->f:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto :goto_0

    .line 1088
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->f:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 1089
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->ag:Landroid/os/Handler;

    const/16 v1, 0x1e

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 1091
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->ad:Lo/fih;

    invoke-virtual {v0}, Lo/fih;->notifyDataSetChanged()V

    .line 1093
    :cond_1
    return-void
.end method

.method static synthetic m(Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;)I
    .locals 1

    .line 107
    iget v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->w:I

    return v0
.end method

.method private m()V
    .locals 2

    .line 1144
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->F:Landroid/os/Handler;

    new-instance v1, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment$9;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment$9;-><init>(Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 1152
    return-void
.end method

.method static synthetic n(Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;)I
    .locals 1

    .line 107
    iget v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->y:I

    return v0
.end method

.method private n()V
    .locals 17

    .line 1156
    const/4 v2, 0x0

    .line 1159
    const-string v3, "{\"groupMsgId\":1257, \"title\":\"\u5927\u5bb6\u90fd\u60f3\u51cf\u8102\uff0c\u4e3a\u4ec0\u4e48\u4ed6\u4eec\u5403\u5f97\u591a\u8fd8\u7626\u4e86\uff1f\", \"imgUrl\":\"file:///android_asset/operation/MessageH5/image/banner_eat_thin.jpg\", \"jumpType\":0, \"jumpUrl\":\"file:///android_asset/operation/MessageH5/html/recommendBohee.html\", \"beginTime\":1542643201000, \"endTime\":1543569831000, \"weight\":33, \"description\":\"\u5927\u5bb6\u90fd\u60f3\u51cf\u8102\uff0c\u4e3a\u4ec0\u4e48\u4ed6\u4eec\u5403\u5f97\u591a\u8fd8\u7626\u4e86\uff1f\"}"

    .line 1160
    const-class v0, Lcom/huawei/pluginmessagecenter/provider/data/MessageExt;

    invoke-static {v3, v0}, Lo/cnj;->c(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/pluginmessagecenter/provider/data/MessageExt;

    .line 1162
    const-string v5, "{\"groupMsgId\":1258, \"title\":\"5\u5206\u949f\uff0c4\u4e2a\u53c2\u6570\uff0c\u534e\u4e3a\u667a\u80fd\u7a7f\u6234\u5e26\u4f60\u544a\u522b\u8fd0\u52a8\u6587\u76f2\uff01\", \"imgUrl\":\"file:///android_asset/operation/MessageH5/image/huawei_wear.png\", \"jumpType\":0, \"jumpUrl\":\"file:///android_asset/operation/MessageH5/html/recommendIndex1.html\", \"beginTime\":1542643201000, \"endTime\":1543569831000, \"weight\":34, \"description\":\"5\u5206\u949f\uff0c4\u4e2a\u53c2\u6570\uff0c\u534e\u4e3a\u667a\u80fd\u7a7f\u6234\u5e26\u4f60\u544a\u522b\u8fd0\u52a8\u6587\u76f2\uff01\"}"

    .line 1163
    const-class v0, Lcom/huawei/pluginmessagecenter/provider/data/MessageExt;

    invoke-static {v5, v0}, Lo/cnj;->c(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/pluginmessagecenter/provider/data/MessageExt;

    .line 1165
    const-string v7, "{\"groupMsgId\":1259, \"title\":\"50\u7c73\u9632\u6c34\uff01\u667a\u80fd\u624b\u73af\u7684\u529f\u80fd\u53ef\u4ee5\u591a\u5f3a\u5927\uff1f\uff01\", \"imgUrl\":\"file:///android_asset/operation/MessageH5/image/intelligent_hand\'s_ring.jpg\", \"jumpType\":0, \"jumpUrl\":\"file:///android_asset/operation/MessageH5/html/honorBracelet.html\", \"beginTime\":1542643201000, \"endTime\":1543569831000, \"weight\":35, \"description\":\"50\u7c73\u9632\u6c34\uff01\u667a\u80fd\u624b\u73af\u7684\u529f\u80fd\u53ef\u4ee5\u591a\u5f3a\u5927\uff1f\uff01\"}"

    .line 1166
    const-class v0, Lcom/huawei/pluginmessagecenter/provider/data/MessageExt;

    invoke-static {v7, v0}, Lo/cnj;->c(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/huawei/pluginmessagecenter/provider/data/MessageExt;

    .line 1168
    const-string v9, "{\"groupMsgId\":1260, \"title\":\"\u4f60\u4e0d\u5f97\u4e0d\u77e5\u9053\u7684\u9a6c\u62c9\u677e\u5165\u95e8\u79d8\u7c4d\uff01\", \"imgUrl\":\"file:///android_asset/operation/MessageH5/image/marathon.jpg\", \"jumpType\":0, \"jumpUrl\":\"file:///android_asset/operation/MessageH5/html/recommendIndex2.html\", \"beginTime\":1542643201000, \"endTime\":1543569831000, \"weight\":34, \"description\":\"\u4f60\u4e0d\u5f97\u4e0d\u77e5\u9053\u7684\u9a6c\u62c9\u677e\u5165\u95e8\u79d8\u7c4d\uff01\"}"

    .line 1169
    const-class v0, Lcom/huawei/pluginmessagecenter/provider/data/MessageExt;

    invoke-static {v9, v0}, Lo/cnj;->c(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lcom/huawei/pluginmessagecenter/provider/data/MessageExt;

    .line 1171
    const-string v11, "{\"groupMsgId\":1261, \"title\":\"\u6700\u7f8e\u590f\u591c\u4e4b\u68a6 \u534e\u4e3a\u8fd0\u52a8\u624b\u73af\u52a9\u4f60\u4e00\u591c\u597d\u7720\", \"imgUrl\":\"file:///android_asset/operation/MessageH5/image/sleep.jpg\", \"jumpType\":0, \"jumpUrl\":\"file:///android_asset/operation/MessageH5/html/huaweiBracelet.html\", \"beginTime\":1542643201000, \"endTime\":1543569831000, \"weight\":34, \"description\":\"\u6700\u7f8e\u590f\u591c\u4e4b\u68a6 \u534e\u4e3a\u8fd0\u52a8\u624b\u73af\u52a9\u4f60\u4e00\u591c\u597d\u7720\"}"

    .line 1172
    const-class v0, Lcom/huawei/pluginmessagecenter/provider/data/MessageExt;

    invoke-static {v11, v0}, Lo/cnj;->c(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Lcom/huawei/pluginmessagecenter/provider/data/MessageExt;

    .line 1174
    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 1175
    invoke-interface {v13, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1176
    invoke-interface {v13, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1177
    invoke-interface {v13, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1178
    invoke-interface {v13, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1179
    invoke-interface {v13, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1181
    new-instance v0, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;

    invoke-direct {v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;-><init>()V

    move-object v14, v0

    .line 1182
    const-string v0, "G1257"

    invoke-virtual {v14, v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setMsgId(Ljava/lang/String;)V

    .line 1183
    const-string v0, "5"

    invoke-virtual {v14, v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setModule(Ljava/lang/String;)V

    .line 1184
    const/4 v0, 0x1

    invoke-virtual {v14, v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setMsgType(I)V

    .line 1185
    const/4 v0, 0x0

    invoke-virtual {v14, v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setFlag(I)V

    .line 1186
    const/4 v0, 0x1

    invoke-virtual {v14, v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setWeight(I)V

    .line 1187
    const-string v0, "\u70ed\u95e8\u6587\u7ae0"

    invoke-virtual {v14, v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setMsgTitle(Ljava/lang/String;)V

    .line 1188
    const-wide v0, 0x1672cb333e8L

    invoke-virtual {v14, v0, v1}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setCreateTime(J)V

    .line 1189
    const-wide v0, 0x16763ee7458L

    invoke-virtual {v14, v0, v1}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setExpireTime(J)V

    .line 1190
    const-wide v0, 0x1673509fbe5L

    invoke-virtual {v14, v0, v1}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setReceiveTime(J)V

    .line 1191
    const/4 v0, 0x1

    invoke-virtual {v14, v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setPosition(I)V

    .line 1192
    const/16 v0, 0x1c

    invoke-virtual {v14, v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setMsgPosition(I)V

    .line 1193
    const/4 v0, 0x0

    invoke-virtual {v14, v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setReadFlag(I)V

    .line 1194
    const/4 v0, 0x0

    invoke-virtual {v14, v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setNotified(I)V

    .line 1195
    const/4 v0, 0x0

    invoke-virtual {v14, v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setInfoRecommend(I)V

    .line 1196
    const/4 v0, 0x0

    invoke-virtual {v14, v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setMsgUserLable(Ljava/lang/String;)V

    .line 1197
    const/4 v0, 0x4

    invoke-virtual {v14, v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setLayout(I)V

    .line 1198
    invoke-virtual {v14, v13}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setMessageExtList(Ljava/util/List;)V

    .line 1201
    new-instance v0, Landroid/os/Message;

    invoke-direct {v0}, Landroid/os/Message;-><init>()V

    move-object v15, v0

    .line 1202
    const/16 v0, 0x1b

    iput v0, v15, Landroid/os/Message;->what:I

    .line 1203
    const/4 v0, 0x2

    new-array v0, v0, [Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;

    move-object/from16 v16, v0

    const/4 v0, 0x0

    aput-object v2, v16, v0

    const/4 v0, 0x1

    aput-object v14, v16, v0

    .line 1204
    move-object/from16 v0, v16

    iput-object v0, v15, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 1205
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->ag:Landroid/os/Handler;

    invoke-virtual {v0, v15}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 1207
    return-void
.end method

.method static synthetic o(Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;)Landroid/os/Handler;
    .locals 1

    .line 107
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->ag:Landroid/os/Handler;

    return-object v0
.end method

.method private o()V
    .locals 4

    .line 1116
    const-string v0, "UIDV_StoreDemoNewSocialFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getMoreInfoUrlFromCloud()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1118
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->L:Lo/fia;

    new-instance v1, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment$7;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment$7;-><init>(Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;)V

    invoke-virtual {v0, v1}, Lo/fia;->b(Lo/eaf;)V

    .line 1135
    return-void
.end method

.method static synthetic p(Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;)Ljava/lang/Runnable;
    .locals 1

    .line 107
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->af:Ljava/lang/Runnable;

    return-object v0
.end method

.method private p()V
    .locals 14

    .line 960
    const-string v0, "UIDV_StoreDemoNewSocialFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getActivityFromCloud()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 967
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->ag:Landroid/os/Handler;

    const/16 v1, 0x3001

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 973
    const-string v0, "operation"

    const-string v1, "activity"

    :try_start_0
    invoke-direct {p0, v0, v1}, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 974
    new-instance v5, Lorg/json/JSONObject;

    invoke-direct {v5, v4}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 975
    const-string v0, "resultCode"

    invoke-virtual {v5, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 976
    const-string v0, "UIDV_StoreDemoNewSocialFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "resultCode1 = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v5, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 977
    if-eqz v6, :cond_9

    .line 978
    const-string v0, "UIDV_StoreDemoNewSocialFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HttpPost result:resultCode = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v6, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 980
    const-string v0, "0"

    invoke-virtual {v6, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 982
    const-string v0, "currentTime"

    invoke-virtual {v5, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->G:Ljava/lang/String;

    .line 983
    new-instance v7, Lo/dcy;

    invoke-direct {v7}, Lo/dcy;-><init>()V

    .line 984
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->o:Landroid/content/Context;

    const/16 v1, 0x271b

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "OPERATION_ACTIVITY_CURRENT_TIME"

    iget-object v3, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->G:Ljava/lang/String;

    invoke-static {v0, v1, v2, v3, v7}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 987
    const-string v0, "activities"

    invoke-virtual {v5, v0}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->d:Lorg/json/JSONArray;

    .line 988
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->d:Lorg/json/JSONArray;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->d:Lorg/json/JSONArray;

    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    move-result v0

    const/4 v1, 0x1

    if-le v1, v0, :cond_1

    .line 989
    :cond_0
    const-string v0, "UIDV_StoreDemoNewSocialFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "no activity"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_1

    .line 990
    return-void

    .line 994
    :cond_1
    :try_start_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->aa:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 995
    const-string v0, "UIDV_StoreDemoNewSocialFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "jsonArrayOperationActivity "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->d:Lorg/json/JSONArray;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 996
    new-instance v8, Lorg/json/JSONArray;

    invoke-direct {v8}, Lorg/json/JSONArray;-><init>()V

    .line 997
    const/4 v9, 0x0

    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->d:Lorg/json/JSONArray;

    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-ge v9, v0, :cond_5

    .line 998
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->d:Lorg/json/JSONArray;

    invoke-virtual {v0, v9}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v10

    .line 999
    const-string v0, "UIDV_StoreDemoNewSocialFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "jsonObjectActivity "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v10, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1000
    invoke-static {v10}, Lo/fic;->c(Lorg/json/JSONObject;)Lo/fil;

    move-result-object v11

    .line 1001
    if-eqz v11, :cond_3

    .line 1002
    const-string v0, "UIDV_StoreDemoNewSocialFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "operationObject "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v11}, Lo/fil;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1004
    invoke-virtual {v11}, Lo/fil;->l()I

    move-result v0

    if-lez v0, :cond_4

    .line 1006
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->E:Lo/fic;

    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->G:Ljava/lang/String;

    invoke-virtual {v11}, Lo/fil;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v11}, Lo/fil;->a()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lo/fic;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    const/4 v1, -0x1

    if-ne v1, v0, :cond_2

    .line 1007
    goto :goto_1

    .line 1009
    :cond_2
    invoke-virtual {v8, v10}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 1010
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->aa:Ljava/util/List;

    invoke-interface {v0, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 1013
    :cond_3
    const-string v0, "UIDV_StoreDemoNewSocialFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "operationObject is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 997
    :cond_4
    :goto_1
    add-int/lit8 v9, v9, 0x1

    goto/16 :goto_0

    .line 1017
    :cond_5
    if-eqz v8, :cond_6

    .line 1018
    const-string v0, "UIDV_StoreDemoNewSocialFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveOperationActivitys = + \n"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v8, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1019
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->o:Landroid/content/Context;

    const/16 v1, 0x271b

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "OPERATION_SOCIAL_ACTIVITY_SAVE"

    invoke-virtual {v8}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v1, v2, v3, v7}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 1023
    :cond_6
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->ag:Landroid/os/Handler;

    const/16 v1, 0x18

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 1025
    const/4 v9, 0x1

    .line 1027
    const/4 v10, 0x0

    :goto_2
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->d:Lorg/json/JSONArray;

    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-ge v10, v0, :cond_8

    .line 1028
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->d:Lorg/json/JSONArray;

    invoke-virtual {v0, v10}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object v11

    .line 1029
    const/4 v12, 0x0

    .line 1031
    const-string v0, "activityPosition"

    :try_start_2
    invoke-virtual {v11, v0}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_0

    move-result v12

    .line 1034
    goto :goto_3

    .line 1032
    :catch_0
    move-exception v13

    .line 1033
    goto :goto_4

    .line 1035
    :goto_3
    const/4 v0, 0x2

    if-ne v12, v0, :cond_7

    .line 1036
    :try_start_3
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->o:Landroid/content/Context;

    const/16 v1, 0x271b

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "OPERATION_ACTIVITY_STEP"

    invoke-virtual {v11}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v1, v2, v3, v7}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 1037
    const/4 v9, 0x0

    .line 1038
    goto :goto_5

    .line 1027
    :cond_7
    :goto_4
    add-int/lit8 v10, v10, 0x1

    goto :goto_2

    .line 1041
    :cond_8
    :goto_5
    if-eqz v9, :cond_9

    .line 1042
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->o:Landroid/content/Context;

    const/16 v1, 0x271b

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "OPERATION_ACTIVITY_STEP"

    const-string v3, ""

    invoke-static {v0, v1, v2, v3, v7}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I
    :try_end_3
    .catch Lorg/json/JSONException; {:try_start_3 .. :try_end_3} :catch_1

    .line 1048
    :cond_9
    goto :goto_6

    .line 1046
    :catch_1
    move-exception v4

    .line 1047
    const-string v0, "UIDV_StoreDemoNewSocialFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Json data error! JSONException:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1055
    :goto_6
    return-void
.end method

.method static synthetic q(Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;)V
    .locals 0

    .line 107
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->i()V

    return-void
.end method

.method static synthetic r(Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;)Landroid/widget/ImageView;
    .locals 1

    .line 107
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->X:Landroid/widget/ImageView;

    return-object v0
.end method

.method static synthetic s(Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;)V
    .locals 0

    .line 107
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->n()V

    return-void
.end method

.method static synthetic t(Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;)Z
    .locals 1

    .line 107
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->M:Z

    return v0
.end method

.method static synthetic u(Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;)Ljava/lang/String;
    .locals 1

    .line 107
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->S:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic x(Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;)V
    .locals 0

    .line 107
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->e()V

    return-void
.end method

.method static synthetic z(Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;)V
    .locals 0

    .line 107
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->l()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 4

    .line 444
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->ag:Landroid/os/Handler;

    sget v1, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->ab:I

    int-to-long v1, v1

    const/16 v3, 0x3001

    invoke-virtual {v0, v3, v1, v2}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 445
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->F:Landroid/os/Handler;

    new-instance v1, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment$5;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment$5;-><init>(Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 453
    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 5

    .line 1510
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->a:Ljava/lang/String;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    const-string v0, ""

    iget-object v1, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "-1"

    iget-object v1, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1511
    new-instance v4, Lo/dcy;

    invoke-direct {v4}, Lo/dcy;-><init>()V

    .line 1512
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->o:Landroid/content/Context;

    const/16 v1, 0x271b

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, " OPERATION_ACTIVITY_MAX_ID"

    iget-object v3, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->a:Ljava/lang/String;

    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 1513
    const-string v0, "UIDV_StoreDemoNewSocialFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setSharedPreference\uff1a"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->a:Ljava/lang/String;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1516
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->o:Landroid/content/Context;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/fic;->a(Landroid/content/Context;Z)V

    .line 1517
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->M:Z

    .line 1520
    new-instance v4, Landroid/content/Intent;

    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->o:Landroid/content/Context;

    const-class v1, Lcom/huawei/operation/activity/WebViewActivity;

    invoke-direct {v4, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 1522
    const-string v0, "url"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "/web/html/activity.html"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 1523
    const-string v0, "EXTRA_BI_ID"

    const-string v1, ""

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 1524
    const-string v0, "EXTRA_BI_NAME"

    iget-object v1, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->o:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_main_home_bottom_text_activity:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 1525
    const-string v0, "EXTRA_BI_SOURCE"

    const-string v1, "ACT_MORE"

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 1526
    const-string v0, "EXTRA_BI_SHOWTIME"

    const-string v1, "SHOW_TIME_BI"

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 1527
    invoke-virtual {p0, v4}, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->startActivity(Landroid/content/Intent;)V

    .line 1529
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->e:J

    .line 1530
    return-void
.end method

.method public b(Lorg/json/JSONArray;)Z
    .locals 8

    .line 1551
    const/4 v4, 0x0

    .line 1552
    const/4 v5, 0x0

    .line 1554
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 1555
    const-string v0, "UIDV_StoreDemoNewSocialFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "jsonArrayOperationActivity is empty!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1556
    const/4 v0, 0x0

    return v0

    .line 1559
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->E:Lo/fic;

    invoke-static {p1}, Lo/fic;->e(Lorg/json/JSONArray;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->a:Ljava/lang/String;

    .line 1560
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->o:Landroid/content/Context;

    const/16 v1, 0x271b

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, " OPERATION_ACTIVITY_MAX_ID"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 1562
    const/4 v0, 0x0

    if-eq v0, v6, :cond_1

    const-string v0, ""

    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1563
    :cond_1
    const/4 v0, 0x1

    return v0

    .line 1566
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->a:Ljava/lang/String;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    const-string v0, ""

    iget-object v1, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 1567
    :cond_3
    const/4 v0, 0x0

    return v0

    .line 1571
    :cond_4
    :try_start_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->a:Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    move v4, v0

    .line 1574
    goto :goto_0

    .line 1572
    :catch_0
    move-exception v7

    .line 1573
    const-string v0, "UIDV_StoreDemoNewSocialFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "NumberFormatException e = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v7}, Ljava/lang/NumberFormatException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1577
    :goto_0
    :try_start_1
    invoke-static {v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_1

    move-result v0

    move v5, v0

    .line 1580
    goto :goto_1

    .line 1578
    :catch_1
    move-exception v7

    .line 1579
    const-string v0, "UIDV_StoreDemoNewSocialFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "NumberFormatException e = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v7}, Ljava/lang/NumberFormatException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1582
    :goto_1
    if-le v4, v5, :cond_5

    .line 1584
    const-string v0, "UIDV_StoreDemoNewSocialFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "There is new activity!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1585
    const/4 v0, 0x1

    return v0

    .line 1587
    :cond_5
    const-string v0, "UIDV_StoreDemoNewSocialFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "There is no new activity!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1588
    const/4 v0, 0x0

    return v0
.end method

.method public d()V
    .locals 6

    .line 1601
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->o:Landroid/content/Context;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 1602
    const-string v0, "ai-information-001"

    const/16 v1, 0x7534

    invoke-static {v1, v0}, Lo/dmn;->a(ILjava/lang/String;)Z

    move-result v4

    .line 1603
    const-string v0, "UIDV_StoreDemoNewSocialFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "openHWInformation = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1604
    if-eqz v4, :cond_0

    .line 1605
    const-string v0, "ai-information-001"

    const-string v1, "information_more_url"

    const/16 v2, 0x7534

    invoke-static {v2, v0, v1}, Lo/dmn;->b(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->S:Ljava/lang/String;

    .line 1608
    :cond_0
    new-instance v5, Landroid/content/Intent;

    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->o:Landroid/content/Context;

    const-class v1, Lcom/huawei/operation/activity/WebViewActivity;

    invoke-direct {v5, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 1609
    const-string v0, "url"

    iget-object v1, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->S:Ljava/lang/String;

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 1610
    const-string v0, "type"

    const-string v1, "RecommendInfo"

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 1611
    const-string v0, "EXTRA_BI_ID"

    const-string v1, ""

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 1612
    const-string v0, "EXTRA_BI_NAME"

    iget-object v1, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->o:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_social_information:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 1613
    const-string v0, "EXTRA_BI_SOURCE"

    const-string v1, "INFO_MORE"

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 1614
    const-string v0, "EXTRA_BI_SHOWTIME"

    const-string v1, "SHOW_TIME_BI"

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 1615
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->o:Landroid/content/Context;

    invoke-virtual {v0, v5}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 1616
    goto :goto_0

    .line 1617
    :cond_1
    const-string v0, "UIDV_StoreDemoNewSocialFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "openHWInformation mContext is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1619
    :goto_0
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->e:J

    .line 1620
    return-void
.end method

.method public d(Ljava/lang/String;)V
    .locals 3

    .line 1537
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->o:Landroid/content/Context;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/fic;->a(Landroid/content/Context;Z)V

    .line 1538
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->o:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/operation/operation/PluginOperation;->getInstance(Landroid/content/Context;)Lcom/huawei/operation/operation/PluginOperation;

    move-result-object v2

    .line 1540
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/web/html/activity.html"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/operation/operation/PluginOperation;->startOperationWebPage(Ljava/lang/String;)V

    .line 1542
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->e:J

    .line 1543
    return-void
.end method

.method public e(Lo/elz;IIII)V
    .locals 6

    .line 1297
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->o:Landroid/content/Context;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->getUserVisibleHint()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1301
    invoke-virtual {p1}, Lo/elz;->getScrollY()I

    move-result v0

    invoke-virtual {p1}, Lo/elz;->getHeight()I

    move-result v1

    add-int/2addr v0, v1

    invoke-virtual {p1}, Lo/elz;->getPaddingTop()I

    move-result v1

    sub-int/2addr v0, v1

    invoke-virtual {p1}, Lo/elz;->getPaddingBottom()I

    move-result v1

    sub-int/2addr v0, v1

    .line 1302
    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Lo/elz;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    move-result v1

    if-ne v0, v1, :cond_0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->x:J

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x3e8

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    .line 1303
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 1304
    const-string v0, "scroll"

    const-string v1, "1"

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1305
    sget-object v0, Lo/dae;->cq:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v5

    .line 1306
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->o:Landroid/content/Context;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v5, v4, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 1307
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->o:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lo/cxf;->d(Landroid/content/Context;)V

    .line 1308
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->x:J

    .line 1311
    :cond_0
    return-void
.end method

.method public onActivityCreated(Landroid/os/Bundle;)V
    .locals 1

    .line 300
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onActivityCreated(Landroid/os/Bundle;)V

    .line 301
    const-string v0, "TimeEat_StoreDemoNewSocialFragmentEnter onActivityCreated"

    invoke-static {v0}, Lo/dbf;->d(Ljava/lang/String;)V

    .line 302
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->c()V

    .line 303
    const-string v0, "TimeEat_StoreDemoNewSocialFragmentLeave onActivityCreated"

    invoke-static {v0}, Lo/dbf;->d(Ljava/lang/String;)V

    .line 304
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 6

    .line 1359
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v4

    .line 1361
    sget v0, Lcom/huawei/ui/main/R$id;->social_activity_card:I

    if-ne v4, v0, :cond_0

    .line 1363
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->o:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/operation/operation/PluginOperation;->getInstance(Landroid/content/Context;)Lcom/huawei/operation/operation/PluginOperation;

    move-result-object v5

    .line 1364
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->o:Landroid/content/Context;

    invoke-static {v0}, Lo/cze;->c(Landroid/content/Context;)Lo/cze;

    move-result-object v0

    const-string v1, "activityUrl"

    new-instance v2, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment$11;

    invoke-direct {v2, p0, v5}, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment$11;-><init>(Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;Lcom/huawei/operation/operation/PluginOperation;)V

    invoke-virtual {v0, v1, v2}, Lo/cze;->d(Ljava/lang/String;Lo/cza;)V

    .line 1377
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->o:Landroid/content/Context;

    sget-object v1, Lo/dae;->cu:Lo/dae;

    invoke-virtual {v1}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/fif;->c(Landroid/content/Context;Ljava/lang/String;)V

    .line 1378
    goto/16 :goto_0

    :cond_0
    sget v0, Lcom/huawei/ui/main/R$id;->social_shop_card:I

    if-ne v4, v0, :cond_1

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->e:J

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x7d0

    cmp-long v0, v0, v2

    if-lez v0, :cond_1

    .line 1380
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 1381
    const-string v0, "click"

    const-string v1, "1"

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1382
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->o:Landroid/content/Context;

    sget-object v2, Lo/dae;->hi:Lo/dae;

    invoke-virtual {v2}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v5, v3}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 1383
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->o:Landroid/content/Context;

    invoke-static {v0}, Lo/cze;->c(Landroid/content/Context;)Lo/cze;

    move-result-object v0

    const-string v1, "healthRecommendUrl"

    new-instance v2, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment$1;

    invoke-direct {v2, p0}, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment$1;-><init>(Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;)V

    invoke-virtual {v0, v1, v2}, Lo/cze;->d(Ljava/lang/String;Lo/cza;)V

    .line 1403
    goto/16 :goto_0

    :cond_1
    sget v0, Lcom/huawei/ui/main/R$id;->social_information_card:I

    if-ne v4, v0, :cond_2

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->e:J

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x7d0

    cmp-long v0, v0, v2

    if-lez v0, :cond_2

    .line 1405
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 1406
    const-string v0, "click"

    const-string v1, "1"

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1407
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->o:Landroid/content/Context;

    sget-object v2, Lo/dae;->cx:Lo/dae;

    invoke-virtual {v2}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v5, v3}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 1408
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->d()V

    .line 1409
    goto/16 :goto_0

    :cond_2
    sget v0, Lcom/huawei/ui/main/R$id;->social_service_card:I

    if-ne v4, v0, :cond_3

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->e:J

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x7d0

    cmp-long v0, v0, v2

    if-lez v0, :cond_3

    .line 1411
    new-instance v5, Landroid/content/Intent;

    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->o:Landroid/content/Context;

    const-class v1, Lcom/huawei/ui/openservice/ui/OpenServiceActivity;

    invoke-direct {v5, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 1412
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->o:Landroid/content/Context;

    invoke-virtual {v0, v5}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 1413
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->o:Landroid/content/Context;

    sget-object v1, Lo/dae;->hf:Lo/dae;

    invoke-virtual {v1}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/fif;->c(Landroid/content/Context;Ljava/lang/String;)V

    .line 1415
    goto/16 :goto_0

    :cond_3
    sget v0, Lcom/huawei/ui/main/R$id;->social_activity_title:I

    if-ne v4, v0, :cond_4

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->e:J

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x7d0

    cmp-long v0, v0, v2

    if-lez v0, :cond_4

    .line 1417
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 1418
    const-string v0, "click"

    const-string v1, "1"

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1419
    const-string v0, "type"

    const-string v1, "1"

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1420
    const-string v0, "from"

    const-string v1, "3"

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1421
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    sget-object v2, Lo/dae;->Q:Lo/dae;

    invoke-virtual {v2}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v5, v3}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 1422
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->o:Landroid/content/Context;

    invoke-static {v0}, Lo/cze;->c(Landroid/content/Context;)Lo/cze;

    move-result-object v0

    const-string v1, "activityUrl"

    new-instance v2, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment$3;

    invoke-direct {v2, p0}, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment$3;-><init>(Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;)V

    invoke-virtual {v0, v1, v2}, Lo/cze;->d(Ljava/lang/String;Lo/cza;)V

    .line 1434
    goto :goto_0

    :cond_4
    sget v0, Lcom/huawei/ui/main/R$id;->social_btn_no_net_work:I

    if-ne v4, v0, :cond_5

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->e:J

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x7d0

    cmp-long v0, v0, v2

    if-lez v0, :cond_5

    .line 1435
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->o:Landroid/content/Context;

    invoke-static {v0}, Lo/dbf;->i(Landroid/content/Context;)V

    .line 1436
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->e:J

    goto :goto_0

    .line 1437
    :cond_5
    sget v0, Lcom/huawei/ui/main/R$id;->social_reload_layout:I

    if-ne v4, v0, :cond_6

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->e:J

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x7d0

    cmp-long v0, v0, v2

    if-lez v0, :cond_6

    .line 1438
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->a()V

    .line 1439
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->e:J

    .line 1441
    :cond_6
    :goto_0
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 3

    .line 255
    const-string v0, "TimeEat_StoreDemoNewSocialFragmentEnter onCreateView"

    invoke-static {v0}, Lo/dbf;->d(Ljava/lang/String;)V

    .line 256
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->o:Landroid/content/Context;

    .line 257
    new-instance v0, Lo/fid;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->o:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/fid;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->P:Lo/fid;

    .line 258
    sget v0, Lcom/huawei/ui/main/R$layout;->fragment_main_circle_new:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->c:Landroid/view/View;

    .line 259
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->o:Landroid/content/Context;

    invoke-static {v0}, Lo/fic;->e(Landroid/content/Context;)Lo/fic;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->E:Lo/fic;

    .line 260
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->o:Landroid/content/Context;

    invoke-static {v0}, Lo/fia;->d(Landroid/content/Context;)Lo/fia;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->L:Lo/fia;

    .line 261
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->o:Landroid/content/Context;

    invoke-static {v0}, Lo/dth;->b(Landroid/content/Context;)Lo/dth;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->Q:Lo/dth;

    .line 262
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->c:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->fragment_social_ad:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->z:Landroid/view/View;

    .line 263
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->c:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->fragment_social_sroll:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/elz;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->R:Lo/elz;

    .line 264
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->R:Lo/elz;

    invoke-virtual {v0, p0}, Lo/elz;->setScrollViewListener(Lo/ely;)V

    .line 265
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->c:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->social_message_container:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->O:Landroid/widget/LinearLayout;

    .line 268
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->c:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->fragment_item:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/widget/LinearLayout;

    .line 269
    const/16 v0, 0x8

    invoke-virtual {v2, v0}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 272
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->c:Landroid/view/View;

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->d(Landroid/view/View;)V

    .line 274
    new-instance v0, Landroid/os/HandlerThread;

    const-string v1, "UIDV_StoreDemoNewSocialFragment"

    invoke-direct {v0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->H:Landroid/os/HandlerThread;

    .line 275
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->H:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->start()V

    .line 276
    new-instance v0, Landroid/os/Handler;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->H:Landroid/os/HandlerThread;

    invoke-virtual {v1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->F:Landroid/os/Handler;

    .line 279
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->F:Landroid/os/Handler;

    new-instance v1, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment$4;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment$4;-><init>(Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 294
    const-string v0, "TimeEat_StoreDemoNewSocialFragmentLeave onCreateView"

    invoke-static {v0}, Lo/dbf;->d(Ljava/lang/String;)V

    .line 295
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->c:Landroid/view/View;

    return-object v0
.end method

.method public onDestroy()V
    .locals 2

    .line 1495
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->o:Landroid/content/Context;

    invoke-static {v0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->p:Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment$a;

    invoke-virtual {v0, v1}, Landroid/support/v4/content/LocalBroadcastManager;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 1496
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->o:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->ae:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 1497
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->ag:Landroid/os/Handler;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->ah:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 1498
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->ag:Landroid/os/Handler;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->af:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 1500
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->H:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->quit()Z

    .line 1501
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onDestroy()V

    .line 1502
    return-void
.end method

.method public onPause()V
    .locals 4

    .line 1315
    const-string v0, "UIDV_StoreDemoNewSocialFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter onPause begin"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1316
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onPause()V

    .line 1318
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->f()V

    .line 1320
    return-void
.end method

.method public onResume()V
    .locals 5

    .line 1324
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onResume()V

    .line 1325
    const-string v0, "TimeEat_StoreDemoNewSocialFragmentEnter onResume"

    invoke-static {v0}, Lo/dbf;->d(Ljava/lang/String;)V

    .line 1328
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->ag:Landroid/os/Handler;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->ah:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 1329
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->ag:Landroid/os/Handler;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->ah:Ljava/lang/Runnable;

    const-wide/16 v2, 0x2bc

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 1331
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->o:Landroid/content/Context;

    invoke-static {v0}, Lo/fic;->a(Landroid/content/Context;)Z

    move-result v4

    .line 1332
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->M:Z

    if-eqz v0, :cond_0

    if-eqz v4, :cond_0

    .line 1333
    const-string v0, "UIDV_StoreDemoNewSocialFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isHideRedDot = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-boolean v2, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->M:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1335
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->ag:Landroid/os/Handler;

    const/16 v1, 0x1a

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 1338
    :cond_0
    if-eqz v4, :cond_1

    .line 1339
    const-string v0, "UIDV_StoreDemoNewSocialFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isNeedUpdateActivity = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1341
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->p()V

    .line 1342
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->o:Landroid/content/Context;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/fic;->a(Landroid/content/Context;Z)V

    .line 1344
    :cond_1
    const-string v0, "TimeEat_StoreDemoNewSocialFragmentLeave onResume"

    invoke-static {v0}, Lo/dbf;->d(Ljava/lang/String;)V

    .line 1345
    return-void
.end method
