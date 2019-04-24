.class public Lcom/huawei/ui/main/stories/soical/NewSocialFragment;
.super Landroid/support/v4/app/Fragment;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Lo/ely;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/ui/main/stories/soical/NewSocialFragment$b;,
        Lcom/huawei/ui/main/stories/soical/NewSocialFragment$c;,
        Lcom/huawei/ui/main/stories/soical/NewSocialFragment$e;
    }
.end annotation


# static fields
.field private static final V:Ljava/lang/Object;

.field private static ab:I


# instance fields
.field private A:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;>;"
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

.field private D:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Landroid/widget/ImageView;>;"
        }
    .end annotation
.end field

.field private E:Landroid/os/HandlerThread;

.field private F:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Landroid/view/View;>;"
        }
    .end annotation
.end field

.field private G:Landroid/os/Handler;

.field private H:Ljava/lang/String;

.field private I:Lo/fic;

.field private J:Landroid/widget/ImageView;

.field private K:Landroid/widget/RelativeLayout;

.field private L:Landroid/widget/RelativeLayout;

.field private M:Z

.field private N:Lo/fia;

.field private O:Landroid/widget/LinearLayout;

.field private P:Lo/elz;

.field private Q:Ljava/lang/String;

.field private R:Lo/fin;

.field private S:Lo/fin;

.field private T:Lo/dth;

.field private U:Lo/fid;

.field private W:Lo/egd;

.field private X:Landroid/widget/TextView;

.field private Y:Landroid/widget/LinearLayout;

.field private Z:Landroid/widget/ImageView;

.field private a:Landroid/view/View;

.field private aa:Landroid/graphics/drawable/AnimationDrawable;

.field private ac:Landroid/widget/ImageView;

.field private ad:Ljava/lang/Runnable;

.field private ae:Lo/fij;

.field private af:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/fil;>;"
        }
    .end annotation
.end field

.field private ag:Z

.field private ah:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/fil;>;"
        }
    .end annotation
.end field

.field private aj:Landroid/os/Handler;

.field private final ak:Landroid/content/BroadcastReceiver;

.field private al:Ljava/lang/Runnable;

.field private am:Lcom/huawei/pluginmessagecenter/service/MessageObserver;

.field b:Lorg/json/JSONArray;

.field c:Lcom/huawei/ui/main/stories/soical/NewSocialFragment$e;

.field public d:J

.field public e:Ljava/lang/String;

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

.field private m:Landroid/content/Context;

.field private n:Landroid/widget/LinearLayout;

.field private o:Landroid/support/v7/widget/RecyclerView;

.field private p:Lcom/huawei/ui/main/stories/soical/NewSocialFragment$b;

.field private q:Landroid/widget/ImageView;

.field private r:Landroid/widget/ImageView;

.field private s:Landroid/widget/ImageView;

.field private t:Landroid/support/v4/view/ViewPager;

.field private u:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Landroid/widget/ImageView;>;"
        }
    .end annotation
.end field

.field private v:J

.field private w:Landroid/view/View;

.field private x:I

.field private y:Lo/eaa;

.field private z:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 231
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->V:Ljava/lang/Object;

    .line 239
    const/16 v0, 0x7d0

    sput v0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->ab:I

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 248
    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    .line 116
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->d:J

    .line 152
    const/16 v0, 0xfa0

    iput v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->z:I

    .line 154
    const-wide/16 v0, 0x3e8

    iput-wide v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->v:J

    .line 158
    const/4 v0, 0x1

    iput v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->x:I

    .line 165
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->y:Lo/eaa;

    .line 167
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->C:Ljava/util/List;

    .line 169
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->B:Ljava/util/List;

    .line 171
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->j:Ljava/util/List;

    .line 173
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->D:Ljava/util/List;

    .line 179
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->A:Ljava/util/List;

    .line 181
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->F:Ljava/util/ArrayList;

    .line 185
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->E:Landroid/os/HandlerThread;

    .line 186
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->G:Landroid/os/Handler;

    .line 189
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->b:Lorg/json/JSONArray;

    .line 190
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->e:Ljava/lang/String;

    .line 201
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->H:Ljava/lang/String;

    .line 205
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->M:Z

    .line 221
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->Q:Ljava/lang/String;

    .line 236
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->Y:Landroid/widget/LinearLayout;

    .line 242
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->af:Ljava/util/List;

    .line 243
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->ah:Ljava/util/List;

    .line 244
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->ae:Lo/fij;

    .line 245
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->ag:Z

    .line 915
    new-instance v0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$14;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$14;-><init>(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->ad:Ljava/lang/Runnable;

    .line 1273
    new-instance v0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$11;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$11;-><init>(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->aj:Landroid/os/Handler;

    .line 1390
    new-instance v0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$5;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$5;-><init>(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->al:Ljava/lang/Runnable;

    .line 1525
    new-instance v0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$6;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$6;-><init>(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->ak:Landroid/content/BroadcastReceiver;

    .line 1671
    new-instance v0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$8;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$8;-><init>(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->am:Lcom/huawei/pluginmessagecenter/service/MessageObserver;

    .line 248
    return-void
.end method

.method static synthetic A(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;)V
    .locals 0

    .line 103
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->u()V

    return-void
.end method

.method static synthetic B(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;)V
    .locals 0

    .line 103
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->p()V

    return-void
.end method

.method static synthetic C(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;)V
    .locals 0

    .line 103
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->g()V

    return-void
.end method

.method static synthetic D(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;)Landroid/widget/ImageView;
    .locals 1

    .line 103
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->Z:Landroid/widget/ImageView;

    return-object v0
.end method

.method static synthetic F(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;)V
    .locals 0

    .line 103
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->h()V

    return-void
.end method

.method static synthetic G(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;)Landroid/os/Handler;
    .locals 1

    .line 103
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->G:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic a(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 103
    iput-object p1, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->H:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic a(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;)Lo/eaa;
    .locals 1

    .line 103
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->y:Lo/eaa;

    return-object v0
.end method

.method private a()V
    .locals 8

    .line 332
    const-string v0, "UIDV_SocialFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter initView"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 334
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->a:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->social_activity_card:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->f:Landroid/widget/LinearLayout;

    .line 335
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->a:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->social_shop_card:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->k:Landroid/widget/LinearLayout;

    .line 336
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->a:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->social_information_card:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->h:Landroid/widget/LinearLayout;

    .line 337
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->a:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->social_service_card:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->g:Landroid/widget/LinearLayout;

    .line 341
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->a:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->social_activity_container:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->i:Landroid/widget/LinearLayout;

    .line 343
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->a:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->social_root_lyt:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->n:Landroid/widget/LinearLayout;

    .line 344
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->a:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->social_net_work_layout:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->l:Landroid/widget/RelativeLayout;

    .line 345
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->a:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->social_tips_no_net_work:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->X:Landroid/widget/TextView;

    .line 346
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->a:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->social_reload_layout:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->L:Landroid/widget/RelativeLayout;

    .line 347
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->a:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->social_btn_no_net_work:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->W:Lo/egd;

    .line 349
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->a:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->layout_loading:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->Y:Landroid/widget/LinearLayout;

    .line 350
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->Y:Landroid/widget/LinearLayout;

    sget v1, Lcom/huawei/ui/main/R$id;->info_loading:I

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->ac:Landroid/widget/ImageView;

    .line 351
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->ac:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    check-cast v0, Landroid/graphics/drawable/AnimationDrawable;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->aa:Landroid/graphics/drawable/AnimationDrawable;

    .line 353
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->a:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->social_activity_recycle_view:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/RecyclerView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->o:Landroid/support/v7/widget/RecyclerView;

    .line 355
    new-instance v0, Lo/fij;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->m:Landroid/content/Context;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->ah:Ljava/util/List;

    invoke-direct {v0, v1, v2}, Lo/fij;-><init>(Landroid/content/Context;Ljava/util/List;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->ae:Lo/fij;

    .line 357
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->m:Landroid/content/Context;

    invoke-static {v0}, Lo/ene;->t(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 358
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->o:Landroid/support/v7/widget/RecyclerView;

    new-instance v1, Landroid/support/v7/widget/GridLayoutManager;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->m:Landroid/content/Context;

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    invoke-direct {v1, v2, v3, v4, v5}, Landroid/support/v7/widget/GridLayoutManager;-><init>(Landroid/content/Context;IIZ)V

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    goto :goto_0

    .line 360
    :cond_0
    new-instance v6, Landroid/support/v7/widget/LinearLayoutManager;

    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->m:Landroid/content/Context;

    invoke-direct {v6, v0}, Landroid/support/v7/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    .line 361
    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Landroid/support/v7/widget/LinearLayoutManager;->setOrientation(I)V

    .line 362
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->o:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0, v6}, Landroid/support/v7/widget/RecyclerView;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    .line 365
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->o:Landroid/support/v7/widget/RecyclerView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->ae:Lo/fij;

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setAdapter(Landroid/support/v7/widget/RecyclerView$Adapter;)V

    .line 367
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->o:Landroid/support/v7/widget/RecyclerView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setNestedScrollingEnabled(Z)V

    .line 368
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->o:Landroid/support/v7/widget/RecyclerView;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setHasFixedSize(Z)V

    .line 370
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->a:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->social_activity_title:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->K:Landroid/widget/RelativeLayout;

    .line 372
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->f:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 373
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->k:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 374
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->g:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 375
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->h:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 378
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->l:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 379
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->L:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 380
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->W:Lo/egd;

    invoke-virtual {v0, p0}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 382
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->K:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 384
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->a:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->activity_more_arrow:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->J:Landroid/widget/ImageView;

    .line 385
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->a:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->activity_red_dot:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->Z:Landroid/widget/ImageView;

    .line 386
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->m:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 387
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->J:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$drawable;->common_ui_arrow_left:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    goto :goto_1

    .line 389
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->J:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$drawable;->ic_health_list_arrow_gray:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 392
    :goto_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->m:Landroid/content/Context;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/fic;->a(Landroid/content/Context;Z)V

    .line 393
    new-instance v0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$b;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$b;-><init>(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->p:Lcom/huawei/ui/main/stories/soical/NewSocialFragment$b;

    .line 394
    new-instance v6, Landroid/content/IntentFilter;

    invoke-direct {v6}, Landroid/content/IntentFilter;-><init>()V

    .line 395
    const-string v0, "main_social_red_dot_friend_show"

    invoke-virtual {v6, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 396
    const-string v0, "main_social_red_dot_friend_dismiss"

    invoke-virtual {v6, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 397
    const-string v0, "main_social_update_ranking"

    invoke-virtual {v6, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 398
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->m:Landroid/content/Context;

    invoke-static {v0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->p:Lcom/huawei/ui/main/stories/soical/NewSocialFragment$b;

    invoke-virtual {v0, v1, v6}, Landroid/support/v4/content/LocalBroadcastManager;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V

    .line 399
    new-instance v7, Landroid/content/IntentFilter;

    invoke-direct {v7}, Landroid/content/IntentFilter;-><init>()V

    .line 400
    const-string v0, "com.huawei.android.sns.action.FRIENDLIST_UPDATE"

    invoke-virtual {v7, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 401
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->m:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->ak:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1, v7}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 402
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->f()V

    .line 403
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->k()V

    .line 404
    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;)V
    .locals 0

    .line 103
    invoke-direct {p0, p1, p2}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->e(Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;)V

    return-void
.end method

.method private b(F)I
    .locals 3

    .line 567
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->m:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v2, v0, Landroid/util/DisplayMetrics;->density:F

    .line 568
    mul-float v0, p1, v2

    const/high16 v1, 0x3f000000    # 0.5f

    add-float/2addr v0, v1

    float-to-int v0, v0

    return v0
.end method

.method static synthetic b(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;)Ljava/util/List;
    .locals 1

    .line 103
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->C:Ljava/util/List;

    return-object v0
.end method

.method static synthetic b(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;IJJ)V
    .locals 0

    .line 103
    invoke-direct/range {p0 .. p5}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->e(IJJ)V

    return-void
.end method

.method static synthetic b(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;Landroid/widget/ImageView;Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;)V
    .locals 0

    .line 103
    invoke-direct {p0, p1, p2}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->d(Landroid/widget/ImageView;Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;)V

    return-void
.end method

.method static synthetic c(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;I)I
    .locals 0

    .line 103
    iput p1, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->x:I

    return p1
.end method

.method static synthetic c(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 103
    iput-object p1, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->Q:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic c(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;)Ljava/util/List;
    .locals 1

    .line 103
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->o()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method static synthetic c(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;Ljava/util/List;)V
    .locals 0

    .line 103
    invoke-direct {p0, p1}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->c(Ljava/util/List;)V

    return-void
.end method

.method private c(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;>;)V"
        }
    .end annotation

    .line 731
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->F:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 732
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->t:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v0}, Landroid/support/v4/view/ViewPager;->removeAllViews()V

    .line 733
    const-string v0, "UIDV_SocialFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "no Ad message in database"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 734
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->w:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 735
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->r:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 736
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->s:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 737
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->q:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 739
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->U:Lo/fid;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->aj:Landroid/os/Handler;

    invoke-virtual {v0, p1, v1}, Lo/fid;->b(Ljava/util/List;Landroid/os/Handler;)V

    .line 740
    return-void
.end method

.method static synthetic d(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 103
    iput-object p1, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->C:Ljava/util/List;

    return-object p1
.end method

.method static synthetic d(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;Lo/eaa;)Lo/eaa;
    .locals 0

    .line 103
    iput-object p1, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->y:Lo/eaa;

    return-object p1
.end method

.method private d(Landroid/widget/ImageView;Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;)V
    .locals 10

    .line 574
    const-string v0, "UIDV_SocialFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "addImageToShow"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 576
    invoke-direct {p0, p1, p2}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->e(Landroid/widget/ImageView;Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 577
    return-void

    .line 579
    :cond_0
    sget-object v4, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->V:Ljava/lang/Object;

    monitor-enter v4

    .line 580
    :try_start_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->U:Lo/fid;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->j:Ljava/util/List;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->D:Ljava/util/List;

    invoke-virtual {v0, v1, p2, v2, p1}, Lo/fid;->b(Ljava/util/List;Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;Ljava/util/List;Landroid/widget/ImageView;)V

    .line 583
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->j:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-gt v1, v0, :cond_1

    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->j:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x3

    if-lt v1, v0, :cond_1

    .line 584
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->w:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 585
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->A:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 586
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->A:Ljava/util/List;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->j:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 587
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->F:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 589
    const/4 v5, 0x0

    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->D:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v5, v0, :cond_1

    .line 590
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->F:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->D:Ljava/util/List;

    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    invoke-virtual {v1}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->e(Landroid/graphics/drawable/Drawable;)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 589
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 595
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->j:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_2

    .line 597
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->j:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;

    .line 599
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->F:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->D:Ljava/util/List;

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    invoke-virtual {v1}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->e(Landroid/graphics/drawable/Drawable;)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 600
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->A:Ljava/util/List;

    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 603
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->j:Ljava/util/List;

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;

    .line 605
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->F:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->D:Ljava/util/List;

    const/4 v2, 0x1

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    invoke-virtual {v1}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->e(Landroid/graphics/drawable/Drawable;)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 606
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->A:Ljava/util/List;

    invoke-interface {v0, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 610
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->j:Ljava/util/List;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->j:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;

    .line 612
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->F:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->D:Ljava/util/List;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->j:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    invoke-virtual {v1}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->e(Landroid/graphics/drawable/Drawable;)Landroid/view/View;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 613
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->A:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1, v7}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 616
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->j:Ljava/util/List;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->j:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x2

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;

    .line 618
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->F:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->D:Ljava/util/List;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->j:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    add-int/lit8 v2, v2, -0x2

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    invoke-virtual {v1}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->e(Landroid/graphics/drawable/Drawable;)Landroid/view/View;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 619
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->A:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1, v8}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 622
    :cond_2
    const-string v0, "UIDV_SocialFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mADImageShowList size = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->F:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 624
    new-instance v5, Landroid/os/Message;

    invoke-direct {v5}, Landroid/os/Message;-><init>()V

    .line 625
    const/16 v0, 0x1c

    iput v0, v5, Landroid/os/Message;->what:I

    .line 626
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->j:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, v5, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 627
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->aj:Landroid/os/Handler;

    invoke-virtual {v0, v5}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 628
    monitor-exit v4

    goto :goto_1

    :catchall_0
    move-exception v9

    monitor-exit v4

    throw v9

    .line 630
    :goto_1
    return-void
.end method

.method static synthetic d(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;)V
    .locals 0

    .line 103
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->w()V

    return-void
.end method

.method static synthetic d(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;I)V
    .locals 0

    .line 103
    invoke-direct {p0, p1}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->e(I)V

    return-void
.end method

.method static synthetic d(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;Z)Z
    .locals 0

    .line 103
    iput-boolean p1, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->M:Z

    return p1
.end method

.method static synthetic e(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;)Landroid/os/Handler;
    .locals 1

    .line 103
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->aj:Landroid/os/Handler;

    return-object v0
.end method

.method private e(Landroid/graphics/drawable/Drawable;)Landroid/view/View;
    .locals 5

    .line 668
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->m:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v2

    .line 669
    sget v0, Lcom/huawei/ui/main/R$layout;->layout_social_cardview:I

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v3

    .line 670
    sget v0, Lcom/huawei/ui/main/R$id;->card_image:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/widget/ImageView;

    .line 671
    invoke-virtual {v4, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 672
    return-object v3
.end method

.method static synthetic e()Ljava/lang/Object;
    .locals 1

    .line 103
    sget-object v0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->V:Ljava/lang/Object;

    return-object v0
.end method

.method private e(I)V
    .locals 2

    .line 639
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->u:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 640
    const/4 v0, 0x1

    if-ne v0, p1, :cond_0

    .line 641
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->r:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 642
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->s:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 643
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->q:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 645
    :cond_0
    const/4 v0, 0x2

    if-ne v0, p1, :cond_1

    .line 646
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->r:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 647
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->s:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 648
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->q:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 649
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->u:Ljava/util/List;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->r:Landroid/widget/ImageView;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 650
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->u:Ljava/util/List;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->s:Landroid/widget/ImageView;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 653
    :cond_1
    const/4 v0, 0x3

    if-ne v0, p1, :cond_2

    .line 654
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->r:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 655
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->s:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 656
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->q:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 657
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->u:Ljava/util/List;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->r:Landroid/widget/ImageView;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 658
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->u:Ljava/util/List;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->s:Landroid/widget/ImageView;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 659
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->u:Ljava/util/List;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->q:Landroid/widget/ImageView;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 661
    :cond_2
    return-void
.end method

.method private e(IJJ)V
    .locals 6

    .line 1084
    const-string v2, "0"

    .line 1085
    const/16 v0, 0xc8

    if-ne v0, p1, :cond_0

    .line 1086
    const-string v2, "0"

    goto :goto_0

    .line 1088
    :cond_0
    const-string v2, "1"

    .line 1090
    :goto_0
    sub-long v3, p4, p2

    .line 1091
    const-string v0, "0"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-wide/16 v0, 0x1388

    cmp-long v0, v3, v0

    if-ltz v0, :cond_2

    .line 1092
    :cond_1
    new-instance v5, Ljava/util/LinkedHashMap;

    invoke-direct {v5}, Ljava/util/LinkedHashMap;-><init>()V

    .line 1093
    const-string v0, "module"

    const-string v1, "3"

    invoke-virtual {v5, v0, v1}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1094
    const-string v0, "status"

    invoke-virtual {v5, v0, v2}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1095
    const-string v0, "delay"

    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1096
    const-string v0, "errorcode"

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1097
    invoke-static {}, Lcom/huawei/operation/OpAnalyticsUtil;->getInstance()Lcom/huawei/operation/OpAnalyticsUtil;

    move-result-object v0

    sget-object v1, Lcom/huawei/operation/OperationKey;->HEALTH_APP_REQUEST_MODULE_85030001:Lcom/huawei/operation/OperationKey;

    invoke-virtual {v1}, Lcom/huawei/operation/OperationKey;->value()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, v5}, Lcom/huawei/operation/OpAnalyticsUtil;->setEvent2nd(Ljava/lang/String;Ljava/util/LinkedHashMap;)I

    .line 1099
    :cond_2
    return-void
.end method

.method private e(Landroid/view/View;)V
    .locals 3

    .line 485
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->u:Ljava/util/List;

    .line 486
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->B:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 487
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->j:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 488
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->D:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 489
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->A:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 490
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->F:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 492
    sget v0, Lcom/huawei/ui/main/R$id;->v_dot0:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->r:Landroid/widget/ImageView;

    .line 493
    sget v0, Lcom/huawei/ui/main/R$id;->v_dot1:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->s:Landroid/widget/ImageView;

    .line 494
    sget v0, Lcom/huawei/ui/main/R$id;->v_dot2:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->q:Landroid/widget/ImageView;

    .line 496
    sget v0, Lcom/huawei/ui/main/R$id;->view_pager_common_top_banner:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v4/view/ViewPager;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->t:Landroid/support/v4/view/ViewPager;

    .line 498
    new-instance v0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$e;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->F:Ljava/util/ArrayList;

    invoke-direct {v0, p0, v1}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$e;-><init>(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;Ljava/util/ArrayList;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->c:Lcom/huawei/ui/main/stories/soical/NewSocialFragment$e;

    .line 499
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->t:Landroid/support/v4/view/ViewPager;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->c:Lcom/huawei/ui/main/stories/soical/NewSocialFragment$e;

    invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->setAdapter(Landroid/support/v4/view/PagerAdapter;)V

    .line 501
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->t:Landroid/support/v4/view/ViewPager;

    new-instance v1, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$c;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$c;-><init>(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;Lcom/huawei/ui/main/stories/soical/NewSocialFragment$3;)V

    invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->setOnPageChangeListener(Landroid/support/v4/view/ViewPager$OnPageChangeListener;)V

    .line 502
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->t:Landroid/support/v4/view/ViewPager;

    new-instance v1, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$9;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$9;-><init>(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;)V

    invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 515
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->i()V

    .line 517
    return-void
.end method

.method private e(Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;)V
    .locals 5

    .line 1214
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->O:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->removeAllViews()V

    .line 1216
    new-instance v0, Lo/fin;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->m:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/fin;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->R:Lo/fin;

    .line 1217
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->R:Lo/fin;

    invoke-virtual {v0, p1}, Lo/fin;->c(Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;)V

    .line 1219
    new-instance v0, Lo/fin;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->m:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/fin;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->S:Lo/fin;

    .line 1220
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->S:Lo/fin;

    invoke-virtual {v0, p2}, Lo/fin;->c(Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;)V

    .line 1223
    const-string v0, "UIDV_SocialFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mWonderfulEventRv:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->R:Lo/fin;

    invoke-virtual {v3}, Lo/fin;->b()Z

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", mUnmissableTopicRv:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->S:Lo/fin;

    invoke-virtual {v3}, Lo/fin;->b()Z

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1224
    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v0, -0x2

    const/4 v1, -0x2

    invoke-direct {v4, v0, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 1225
    const/4 v0, 0x1

    iput v0, v4, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    .line 1238
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->R:Lo/fin;

    invoke-virtual {v0}, Lo/fin;->b()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->S:Lo/fin;

    invoke-virtual {v0}, Lo/fin;->b()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 1239
    invoke-virtual {p1}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getWeight()I

    move-result v0

    invoke-virtual {p2}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getWeight()I

    move-result v1

    if-le v0, v1, :cond_0

    .line 1240
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->O:Landroid/widget/LinearLayout;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->R:Lo/fin;

    invoke-virtual {v0, v1, v4}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 1242
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->O:Landroid/widget/LinearLayout;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->S:Lo/fin;

    invoke-virtual {v0, v1, v4}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    goto/16 :goto_0

    .line 1244
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getWeight()I

    move-result v0

    invoke-virtual {p2}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getWeight()I

    move-result v1

    if-ge v0, v1, :cond_1

    .line 1245
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->O:Landroid/widget/LinearLayout;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->S:Lo/fin;

    invoke-virtual {v0, v1, v4}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 1247
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->O:Landroid/widget/LinearLayout;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->R:Lo/fin;

    invoke-virtual {v0, v1, v4}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    goto/16 :goto_0

    .line 1250
    :cond_1
    invoke-virtual {p1}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getCreateTime()J

    move-result-wide v0

    invoke-virtual {p2}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getCreateTime()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-gez v0, :cond_2

    .line 1251
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->O:Landroid/widget/LinearLayout;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->S:Lo/fin;

    invoke-virtual {v0, v1, v4}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 1253
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->O:Landroid/widget/LinearLayout;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->R:Lo/fin;

    invoke-virtual {v0, v1, v4}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_0

    .line 1256
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->O:Landroid/widget/LinearLayout;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->R:Lo/fin;

    invoke-virtual {v0, v1, v4}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 1258
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->O:Landroid/widget/LinearLayout;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->S:Lo/fin;

    invoke-virtual {v0, v1, v4}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_0

    .line 1262
    :cond_3
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->R:Lo/fin;

    invoke-virtual {v0}, Lo/fin;->b()Z

    move-result v0

    if-nez v0, :cond_4

    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->S:Lo/fin;

    invoke-virtual {v0}, Lo/fin;->b()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 1263
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->O:Landroid/widget/LinearLayout;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->S:Lo/fin;

    invoke-virtual {v0, v1, v4}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_0

    .line 1265
    :cond_4
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->R:Lo/fin;

    invoke-virtual {v0}, Lo/fin;->b()Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->S:Lo/fin;

    invoke-virtual {v0}, Lo/fin;->b()Z

    move-result v0

    if-nez v0, :cond_5

    .line 1266
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->O:Landroid/widget/LinearLayout;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->R:Lo/fin;

    invoke-virtual {v0, v1, v4}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 1270
    :cond_5
    :goto_0
    return-void
.end method

.method private e(Landroid/widget/ImageView;Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;)Z
    .locals 8

    .line 677
    const/4 v4, 0x1

    .line 678
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    const/4 v0, 0x0

    if-ne v0, p2, :cond_1

    .line 679
    :cond_0
    const-string v0, "UIDV_SocialFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "imageView||messageObject is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 680
    const/4 v4, 0x0

    .line 684
    :cond_1
    const/4 v5, 0x0

    .line 686
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 687
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->B:Ljava/util/List;

    invoke-interface {v6, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 688
    const/4 v7, 0x0

    :goto_0
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    if-ge v7, v0, :cond_3

    .line 689
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

    .line 690
    const/4 v5, 0x1

    .line 688
    :cond_2
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 693
    :cond_3
    if-nez v5, :cond_4

    .line 694
    const-string v0, "UIDV_SocialFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "this ad is not in display list"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 695
    const/4 v4, 0x0

    .line 697
    :cond_4
    return v4
.end method

.method private f()V
    .locals 4

    .line 433
    const-string v0, "UIDV_SocialFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "refresh view : setTipsPage()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 434
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->l:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 435
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->n:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 436
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->m:Landroid/content/Context;

    invoke-static {v0}, Lo/dbf;->f(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 437
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->X:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->m:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hwh_home_healthshop_unstable_net_work_pls_touch_to_retry:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 439
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->X:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->m:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hwh_home_healthshop_no_net_work_pls_click_again:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 441
    :goto_0
    return-void
.end method

.method static synthetic f(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;)V
    .locals 0

    .line 103
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->z()V

    return-void
.end method

.method private g()V
    .locals 4

    .line 448
    const-string v0, "UIDV_SocialFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "refresh view : setNormalPage()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 449
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->ag:Z

    .line 450
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->h()V

    .line 451
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->l:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 452
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->n:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 453
    return-void
.end method

.method static synthetic g(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;)V
    .locals 0

    .line 103
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->r()V

    return-void
.end method

.method private h()V
    .locals 4

    .line 421
    const-string v0, "UIDV_SocialFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "refresh view : stopLoadingImage()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 422
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->ag:Z

    if-nez v0, :cond_0

    .line 423
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->l:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 425
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->Y:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 426
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->aa:Landroid/graphics/drawable/AnimationDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->stop()V

    .line 427
    return-void
.end method

.method static synthetic h(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;)V
    .locals 0

    .line 103
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->s()V

    return-void
.end method

.method private i()V
    .locals 6

    .line 524
    :try_start_0
    const-class v0, Landroid/support/v4/view/ViewPager;

    const-string v1, "mScroller"

    invoke-virtual {v0, v1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v4

    .line 525
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    .line 526
    new-instance v5, Lo/fim;

    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->m:Landroid/content/Context;

    invoke-direct {v5, v0}, Lo/fim;-><init>(Landroid/content/Context;)V

    .line 527
    const/16 v0, 0x320

    invoke-virtual {v5, v0}, Lo/fim;->c(I)V

    .line 528
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->t:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v4, v0, v5}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 531
    goto :goto_0

    .line 529
    :catch_0
    move-exception v4

    .line 530
    const-string v0, "UIDV_SocialFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 532
    :goto_0
    return-void
.end method

.method static synthetic i(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;)V
    .locals 0

    .line 103
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->q()V

    return-void
.end method

.method static synthetic j(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;)Z
    .locals 1

    .line 103
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->M:Z

    return v0
.end method

.method static synthetic k(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;)Landroid/content/Context;
    .locals 1

    .line 103
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->m:Landroid/content/Context;

    return-object v0
.end method

.method private k()V
    .locals 4

    .line 410
    const-string v0, "UIDV_SocialFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "refresh view : loadingImage()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 411
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->l:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 412
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->n:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 413
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->Y:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 414
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->aa:Landroid/graphics/drawable/AnimationDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->start()V

    .line 415
    return-void
.end method

.method private l()I
    .locals 2

    .line 559
    new-instance v1, Landroid/util/DisplayMetrics;

    invoke-direct {v1}, Landroid/util/DisplayMetrics;-><init>()V

    .line 560
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->m:Landroid/content/Context;

    check-cast v0, Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getWindowManager()Landroid/view/WindowManager;

    move-result-object v0

    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V

    .line 561
    iget v0, v1, Landroid/util/DisplayMetrics;->widthPixels:I

    return v0
.end method

.method static synthetic l(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;)Ljava/util/ArrayList;
    .locals 1

    .line 103
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->F:Ljava/util/ArrayList;

    return-object v0
.end method

.method private m()V
    .locals 4

    .line 944
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->F:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->F:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x4

    if-le v0, v1, :cond_0

    .line 945
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->aj:Landroid/os/Handler;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->ad:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 946
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->aj:Landroid/os/Handler;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->ad:Ljava/lang/Runnable;

    iget v2, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->z:I

    int-to-long v2, v2

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 948
    :cond_0
    return-void
.end method

.method static synthetic m(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;)V
    .locals 0

    .line 103
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->t()V

    return-void
.end method

.method private n()V
    .locals 2

    .line 954
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->aj:Landroid/os/Handler;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->ad:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 955
    return-void
.end method

.method static synthetic n(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;)V
    .locals 0

    .line 103
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->n()V

    return-void
.end method

.method private o()Ljava/util/List;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;>;"
        }
    .end annotation

    .line 704
    const-string v0, "UIDV_SocialFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updateADViewPagerDate"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 706
    sget-object v4, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->V:Ljava/lang/Object;

    monitor-enter v4

    .line 707
    :try_start_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->C:Ljava/util/List;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->B:Ljava/util/List;

    invoke-static {v0, v1}, Lo/fif;->e(Ljava/util/List;Ljava/util/List;)V

    .line 710
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->U:Lo/fid;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->B:Ljava/util/List;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->j:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lo/fid;->a(Ljava/util/List;Ljava/util/List;)Z

    move-result v5

    .line 711
    if-eqz v5, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->B:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->j:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-eq v0, v1, :cond_1

    .line 712
    :cond_0
    const-string v0, "UIDV_SocialFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "have Ad message change"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 713
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->j:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 714
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->D:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 716
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->A:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 717
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 718
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->B:Ljava/util/List;

    invoke-interface {v6, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 719
    monitor-exit v4

    return-object v6

    .line 721
    :cond_1
    const-string v0, "UIDV_SocialFragment"

    const/4 v1, 0x1

    :try_start_1
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "no Ad message change"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 722
    monitor-exit v4

    const/4 v0, 0x0

    return-object v0

    .line 724
    :catchall_0
    move-exception v7

    monitor-exit v4

    throw v7
.end method

.method static synthetic o(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;)V
    .locals 0

    .line 103
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->m()V

    return-void
.end method

.method static synthetic p(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;)Ljava/util/List;
    .locals 1

    .line 103
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->A:Ljava/util/List;

    return-object v0
.end method

.method private p()V
    .locals 9

    .line 538
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->m:Landroid/content/Context;

    invoke-static {v0}, Lo/ene;->t(Landroid/content/Context;)Z

    move-result v5

    .line 539
    if-eqz v5, :cond_1

    .line 540
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->l()I

    move-result v6

    .line 541
    const/high16 v0, 0x43b40000    # 360.0f

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->b(F)I

    move-result v0

    sub-int v0, v6, v0

    div-int/lit8 v7, v0, 0x2

    .line 542
    move v8, v7

    .line 543
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->F:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_0

    .line 544
    const/high16 v0, 0x43b40000    # 360.0f

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->b(F)I

    move-result v0

    mul-int/lit8 v0, v0, 0x2

    sub-int v0, v6, v0

    div-int/lit8 v8, v0, 0x2

    .line 546
    :cond_0
    const-string v0, "UIDV_SocialFragment"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "is bigCD , resizeViewPager() Window width = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " banner padding = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, " pageMargin = "

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 547
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->t:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v0, v8}, Landroid/support/v4/view/ViewPager;->setPageMargin(I)V

    .line 548
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->t:Landroid/support/v4/view/ViewPager;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v0, v7, v1, v7, v2}, Landroid/support/v4/view/ViewPager;->setPadding(IIII)V

    .line 549
    goto :goto_0

    .line 550
    :cond_1
    const-string v0, "UIDV_SocialFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "not bigCD"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 551
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->t:Landroid/support/v4/view/ViewPager;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->setPageMargin(I)V

    .line 552
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->t:Landroid/support/v4/view/ViewPager;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/support/v4/view/ViewPager;->setPadding(IIII)V

    .line 554
    :goto_0
    return-void
.end method

.method static synthetic q(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;)I
    .locals 1

    .line 103
    iget v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->z:I

    return v0
.end method

.method private q()V
    .locals 4

    .line 1142
    const-string v0, "UIDV_SocialFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getMoreInfoUrlFromCloud()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1144
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->N:Lo/fia;

    new-instance v1, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$13;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$13;-><init>(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;)V

    invoke-virtual {v0, v1}, Lo/fia;->b(Lo/eaf;)V

    .line 1161
    return-void
.end method

.method static synthetic r(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;)Landroid/support/v4/view/ViewPager;
    .locals 1

    .line 103
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->t:Landroid/support/v4/view/ViewPager;

    return-object v0
.end method

.method private r()V
    .locals 4

    .line 1129
    const-string v0, "UIDV_SocialFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initInformation"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1132
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->m:Landroid/content/Context;

    const/16 v1, 0x271b

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "SOCIAL_MORE_INFO_URL"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->Q:Ljava/lang/String;

    .line 1135
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->q()V

    .line 1136
    return-void
.end method

.method static synthetic s(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;)Ljava/lang/Runnable;
    .locals 1

    .line 103
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->ad:Ljava/lang/Runnable;

    return-object v0
.end method

.method private s()V
    .locals 9

    .line 966
    const-string v0, "UIDV_SocialFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initOperationList"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 968
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->m:Landroid/content/Context;

    const/16 v1, 0x271b

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "OPERATION_SOCIAL_ACTIVITY_SAVE"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 969
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->m:Landroid/content/Context;

    const/16 v1, 0x271b

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "OPERATION_ACTIVITY_CURRENT_TIME"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->H:Ljava/lang/String;

    .line 970
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->m:Landroid/content/Context;

    const/16 v1, 0x271b

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, " OPERATION_ACTIVITY_MAX_ID"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->e:Ljava/lang/String;

    .line 972
    :try_start_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->af:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 973
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 974
    new-instance v5, Lorg/json/JSONArray;

    invoke-direct {v5, v4}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 975
    const/4 v6, 0x0

    :goto_0
    invoke-virtual {v5}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-ge v6, v0, :cond_0

    .line 976
    invoke-virtual {v5, v6}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v7

    .line 977
    invoke-static {v7}, Lo/fic;->c(Lorg/json/JSONObject;)Lo/fil;

    move-result-object v8

    .line 978
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->af:Ljava/util/List;

    invoke-interface {v0, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 975
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 982
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->aj:Landroid/os/Handler;

    const/16 v1, 0x18

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 985
    goto :goto_1

    .line 983
    :catch_0
    move-exception v5

    .line 984
    const-string v0, "UIDV_SocialFragment"

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

    .line 988
    :goto_1
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->t()V

    .line 989
    return-void
.end method

.method static synthetic t(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;)Ljava/util/List;
    .locals 1

    .line 103
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->u:Ljava/util/List;

    return-object v0
.end method

.method private t()V
    .locals 6

    .line 995
    const-string v0, "UIDV_SocialFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getActivityFromCloud()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 997
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    .line 998
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->I:Lo/fic;

    new-instance v1, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$12;

    invoke-direct {v1, p0, v4, v5}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$12;-><init>(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;J)V

    invoke-virtual {v0, v1}, Lo/fic;->c(Lcom/huawei/operation/https/HttpResCallBack;)V

    .line 1081
    return-void
.end method

.method static synthetic u(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;)I
    .locals 1

    .line 103
    iget v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->x:I

    return v0
.end method

.method private u()V
    .locals 4

    .line 1105
    const-string v0, "UIDV_SocialFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updateOperationActivity()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1107
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->af:Ljava/util/List;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 1109
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->ah:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 1110
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->ah:Ljava/util/List;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->af:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 1111
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->ah:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-gtz v0, :cond_0

    .line 1112
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->i:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto :goto_0

    .line 1114
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->i:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 1115
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->aj:Landroid/os/Handler;

    const/16 v1, 0x1e

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 1117
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->ae:Lo/fij;

    invoke-virtual {v0}, Lo/fij;->notifyDataSetChanged()V

    .line 1119
    :cond_1
    return-void
.end method

.method static synthetic v(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;)Ljava/lang/String;
    .locals 1

    .line 103
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->H:Ljava/lang/String;

    return-object v0
.end method

.method private v()V
    .locals 8

    .line 1184
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->y:Lo/eaa;

    invoke-virtual {v0}, Lo/eaa;->i()Ljava/util/List;

    move-result-object v2

    .line 1185
    const/4 v3, 0x0

    .line 1186
    if-eqz v2, :cond_0

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 1187
    const/4 v0, 0x0

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;

    .line 1188
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->aj:Landroid/os/Handler;

    const/16 v1, 0x1e

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 1192
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->y:Lo/eaa;

    invoke-virtual {v0}, Lo/eaa;->f()Ljava/util/List;

    move-result-object v4

    .line 1193
    const/4 v5, 0x0

    .line 1194
    if-eqz v4, :cond_1

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 1195
    const/4 v0, 0x0

    invoke-interface {v4, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;

    .line 1196
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->aj:Landroid/os/Handler;

    const/16 v1, 0x1e

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 1200
    :cond_1
    new-instance v6, Landroid/os/Message;

    invoke-direct {v6}, Landroid/os/Message;-><init>()V

    .line 1201
    const/16 v0, 0x1b

    iput v0, v6, Landroid/os/Message;->what:I

    .line 1202
    const/4 v0, 0x2

    new-array v7, v0, [Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;

    const/4 v0, 0x0

    aput-object v3, v7, v0

    const/4 v0, 0x1

    aput-object v5, v7, v0

    .line 1203
    iput-object v7, v6, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 1204
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->aj:Landroid/os/Handler;

    invoke-virtual {v0, v6}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 1206
    return-void
.end method

.method static synthetic w(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;)Ljava/util/List;
    .locals 1

    .line 103
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->af:Ljava/util/List;

    return-object v0
.end method

.method private w()V
    .locals 4

    .line 1713
    const-string v0, "UIDV_SocialFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Start register"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1714
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->y:Lo/eaa;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->am:Lcom/huawei/pluginmessagecenter/service/MessageObserver;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 1715
    const-string v0, "UIDV_SocialFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "registerADObserver"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1716
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->y:Lo/eaa;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->am:Lcom/huawei/pluginmessagecenter/service/MessageObserver;

    invoke-virtual {v0, v1}, Lo/eaa;->e(Lcom/huawei/pluginmessagecenter/service/MessageObserver;)V

    .line 1718
    :cond_0
    return-void
.end method

.method static synthetic x(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;)Lo/fic;
    .locals 1

    .line 103
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->I:Lo/fic;

    return-object v0
.end method

.method static synthetic y(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;)Ljava/lang/String;
    .locals 1

    .line 103
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->Q:Ljava/lang/String;

    return-object v0
.end method

.method private y()V
    .locals 4

    .line 1722
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->y:Lo/eaa;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->am:Lcom/huawei/pluginmessagecenter/service/MessageObserver;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 1723
    const-string v0, "UIDV_SocialFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "unregisterADObserver"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1724
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->y:Lo/eaa;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->am:Lcom/huawei/pluginmessagecenter/service/MessageObserver;

    invoke-virtual {v0, v1}, Lo/eaa;->d(Lcom/huawei/pluginmessagecenter/service/MessageObserver;)V

    .line 1726
    :cond_0
    return-void
.end method

.method private z()V
    .locals 2

    .line 1170
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->G:Landroid/os/Handler;

    new-instance v1, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$15;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$15;-><init>(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 1180
    return-void
.end method

.method static synthetic z(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;)V
    .locals 0

    .line 103
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->v()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 5

    .line 1553
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->e:Ljava/lang/String;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    const-string v0, ""

    iget-object v1, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->e:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "-1"

    iget-object v1, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->e:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1554
    new-instance v4, Lo/dcy;

    invoke-direct {v4}, Lo/dcy;-><init>()V

    .line 1555
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->m:Landroid/content/Context;

    const/16 v1, 0x271b

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, " OPERATION_ACTIVITY_MAX_ID"

    iget-object v3, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->e:Ljava/lang/String;

    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 1556
    const-string v0, "UIDV_SocialFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setSharedPreference\uff1a"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->e:Ljava/lang/String;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1559
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->m:Landroid/content/Context;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/fic;->a(Landroid/content/Context;Z)V

    .line 1560
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->M:Z

    .line 1563
    new-instance v4, Landroid/content/Intent;

    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->m:Landroid/content/Context;

    const-class v1, Lcom/huawei/operation/activity/WebViewActivity;

    invoke-direct {v4, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 1565
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

    .line 1566
    const-string v0, "EXTRA_BI_ID"

    const-string v1, ""

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 1567
    const-string v0, "EXTRA_BI_NAME"

    iget-object v1, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->m:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_main_home_bottom_text_activity:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 1568
    const-string v0, "EXTRA_BI_SOURCE"

    const-string v1, "ACT_MORE"

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 1569
    const-string v0, "EXTRA_BI_SHOWTIME"

    const-string v1, "SHOW_TIME_BI"

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 1570
    invoke-virtual {p0, v4}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->startActivity(Landroid/content/Intent;)V

    .line 1572
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->d:J

    .line 1573
    return-void
.end method

.method public b()V
    .locals 5

    .line 1732
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->P:Lo/elz;

    if-eqz v0, :cond_2

    .line 1733
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->i:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->i:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getVisibility()I

    move-result v0

    if-nez v0, :cond_1

    .line 1734
    const/4 v3, 0x0

    .line 1735
    iget-object v4, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->i:Landroid/widget/LinearLayout;

    .line 1736
    :goto_0
    if-eqz v4, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->P:Lo/elz;

    if-eq v4, v0, :cond_0

    .line 1737
    invoke-virtual {v4}, Landroid/view/View;->getTop()I

    move-result v0

    add-int/2addr v3, v0

    .line 1738
    invoke-virtual {v4}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/view/View;

    goto :goto_0

    .line 1740
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->P:Lo/elz;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, v3}, Lo/elz;->smoothScrollTo(II)V

    .line 1741
    goto :goto_1

    .line 1742
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->P:Lo/elz;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lo/elz;->smoothScrollTo(II)V

    .line 1745
    :cond_2
    :goto_1
    return-void
.end method

.method public c()V
    .locals 6

    .line 1644
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->m:Landroid/content/Context;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 1645
    const-string v0, "ai-information-001"

    const/16 v1, 0x7534

    invoke-static {v1, v0}, Lo/dmn;->a(ILjava/lang/String;)Z

    move-result v4

    .line 1646
    const-string v0, "UIDV_SocialFragment"

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

    .line 1647
    if-eqz v4, :cond_0

    .line 1648
    const-string v0, "ai-information-001"

    const-string v1, "information_more_url"

    const/16 v2, 0x7534

    invoke-static {v2, v0, v1}, Lo/dmn;->b(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->Q:Ljava/lang/String;

    .line 1651
    :cond_0
    new-instance v5, Landroid/content/Intent;

    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->m:Landroid/content/Context;

    const-class v1, Lcom/huawei/operation/activity/WebViewActivity;

    invoke-direct {v5, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 1652
    const-string v0, "url"

    iget-object v1, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->Q:Ljava/lang/String;

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 1653
    const-string v0, "type"

    const-string v1, "RecommendInfo"

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 1654
    const-string v0, "EXTRA_BI_ID"

    const-string v1, ""

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 1655
    const-string v0, "EXTRA_BI_NAME"

    iget-object v1, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->m:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_social_information:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 1656
    const-string v0, "EXTRA_BI_SOURCE"

    const-string v1, "INFO_MORE"

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 1657
    const-string v0, "EXTRA_BI_SHOWTIME"

    const-string v1, "SHOW_TIME_BI"

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 1658
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->m:Landroid/content/Context;

    invoke-virtual {v0, v5}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 1659
    goto :goto_0

    .line 1660
    :cond_1
    const-string v0, "UIDV_SocialFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "openHWInformation mContext is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1662
    :goto_0
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->d:J

    .line 1663
    return-void
.end method

.method public d()V
    .locals 4

    .line 460
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->k()V

    .line 461
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->aj:Landroid/os/Handler;

    sget v1, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->ab:I

    int-to-long v1, v1

    const/16 v3, 0x3001

    invoke-virtual {v0, v3, v1, v2}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 462
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->G:Landroid/os/Handler;

    new-instance v1, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$10;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$10;-><init>(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 472
    return-void
.end method

.method public d(Ljava/lang/String;)V
    .locals 3

    .line 1580
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->m:Landroid/content/Context;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/fic;->a(Landroid/content/Context;Z)V

    .line 1581
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->m:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/operation/operation/PluginOperation;->getInstance(Landroid/content/Context;)Lcom/huawei/operation/operation/PluginOperation;

    move-result-object v2

    .line 1583
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

    .line 1585
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->d:J

    .line 1586
    return-void
.end method

.method public d(Lorg/json/JSONArray;)Z
    .locals 8

    .line 1594
    const/4 v4, 0x0

    .line 1595
    const/4 v5, 0x0

    .line 1597
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 1598
    const-string v0, "UIDV_SocialFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "jsonArrayOperationActivity is empty!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1599
    const/4 v0, 0x0

    return v0

    .line 1602
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->I:Lo/fic;

    invoke-static {p1}, Lo/fic;->e(Lorg/json/JSONArray;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->e:Ljava/lang/String;

    .line 1603
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->m:Landroid/content/Context;

    const/16 v1, 0x271b

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, " OPERATION_ACTIVITY_MAX_ID"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 1605
    const/4 v0, 0x0

    if-eq v0, v6, :cond_1

    const-string v0, ""

    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1606
    :cond_1
    const/4 v0, 0x1

    return v0

    .line 1609
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->e:Ljava/lang/String;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    const-string v0, ""

    iget-object v1, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->e:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 1610
    :cond_3
    const/4 v0, 0x0

    return v0

    .line 1614
    :cond_4
    :try_start_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->e:Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    move v4, v0

    .line 1617
    goto :goto_0

    .line 1615
    :catch_0
    move-exception v7

    .line 1616
    const-string v0, "UIDV_SocialFragment"

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

    .line 1620
    :goto_0
    :try_start_1
    invoke-static {v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_1

    move-result v0

    move v5, v0

    .line 1623
    goto :goto_1

    .line 1621
    :catch_1
    move-exception v7

    .line 1622
    const-string v0, "UIDV_SocialFragment"

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

    .line 1625
    :goto_1
    if-le v4, v5, :cond_5

    .line 1627
    const-string v0, "UIDV_SocialFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "There is new activity!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1628
    const/4 v0, 0x1

    return v0

    .line 1630
    :cond_5
    const-string v0, "UIDV_SocialFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "There is no new activity!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1631
    const/4 v0, 0x0

    return v0
.end method

.method public e(Lo/elz;IIII)V
    .locals 6

    .line 1340
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->m:Landroid/content/Context;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->getUserVisibleHint()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1344
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

    .line 1345
    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Lo/elz;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    move-result v1

    if-ne v0, v1, :cond_0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->v:J

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x3e8

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    .line 1346
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 1347
    const-string v0, "scroll"

    const-string v1, "1"

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1348
    sget-object v0, Lo/dae;->cq:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v5

    .line 1349
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->m:Landroid/content/Context;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v5, v4, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 1350
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->m:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lo/cxf;->d(Landroid/content/Context;)V

    .line 1351
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->v:J

    .line 1354
    :cond_0
    return-void
.end method

.method public onActivityCreated(Landroid/os/Bundle;)V
    .locals 1

    .line 322
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onActivityCreated(Landroid/os/Bundle;)V

    .line 323
    const-string v0, "TimeEat_NewSocialFragmentEnter onActivityCreated"

    invoke-static {v0}, Lo/dbf;->d(Ljava/lang/String;)V

    .line 324
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->a()V

    .line 325
    const-string v0, "TimeEat_NewSocialFragmentLeave onActivityCreated"

    invoke-static {v0}, Lo/dbf;->d(Ljava/lang/String;)V

    .line 326
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 6

    .line 1402
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v4

    .line 1404
    sget v0, Lcom/huawei/ui/main/R$id;->social_activity_card:I

    if-ne v4, v0, :cond_0

    .line 1406
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->m:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/operation/operation/PluginOperation;->getInstance(Landroid/content/Context;)Lcom/huawei/operation/operation/PluginOperation;

    move-result-object v5

    .line 1407
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->m:Landroid/content/Context;

    invoke-static {v0}, Lo/cze;->c(Landroid/content/Context;)Lo/cze;

    move-result-object v0

    const-string v1, "activityUrl"

    new-instance v2, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$2;

    invoke-direct {v2, p0, v5}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$2;-><init>(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;Lcom/huawei/operation/operation/PluginOperation;)V

    invoke-virtual {v0, v1, v2}, Lo/cze;->d(Ljava/lang/String;Lo/cza;)V

    .line 1420
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->m:Landroid/content/Context;

    sget-object v1, Lo/dae;->cu:Lo/dae;

    invoke-virtual {v1}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/fif;->c(Landroid/content/Context;Ljava/lang/String;)V

    .line 1421
    goto/16 :goto_0

    :cond_0
    sget v0, Lcom/huawei/ui/main/R$id;->social_shop_card:I

    if-ne v4, v0, :cond_1

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->d:J

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x7d0

    cmp-long v0, v0, v2

    if-lez v0, :cond_1

    .line 1423
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 1424
    const-string v0, "click"

    const-string v1, "1"

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1425
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->m:Landroid/content/Context;

    sget-object v2, Lo/dae;->hi:Lo/dae;

    invoke-virtual {v2}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v5, v3}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 1426
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->m:Landroid/content/Context;

    invoke-static {v0}, Lo/cze;->c(Landroid/content/Context;)Lo/cze;

    move-result-object v0

    const-string v1, "healthRecommendUrl"

    new-instance v2, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$1;

    invoke-direct {v2, p0}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$1;-><init>(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;)V

    invoke-virtual {v0, v1, v2}, Lo/cze;->d(Ljava/lang/String;Lo/cza;)V

    .line 1446
    goto/16 :goto_0

    :cond_1
    sget v0, Lcom/huawei/ui/main/R$id;->social_information_card:I

    if-ne v4, v0, :cond_2

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->d:J

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x7d0

    cmp-long v0, v0, v2

    if-lez v0, :cond_2

    .line 1448
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 1449
    const-string v0, "click"

    const-string v1, "1"

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1450
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->m:Landroid/content/Context;

    sget-object v2, Lo/dae;->cx:Lo/dae;

    invoke-virtual {v2}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v5, v3}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 1451
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->c()V

    .line 1452
    goto/16 :goto_0

    :cond_2
    sget v0, Lcom/huawei/ui/main/R$id;->social_service_card:I

    if-ne v4, v0, :cond_3

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->d:J

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x7d0

    cmp-long v0, v0, v2

    if-lez v0, :cond_3

    .line 1454
    new-instance v5, Landroid/content/Intent;

    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->m:Landroid/content/Context;

    const-class v1, Lcom/huawei/ui/openservice/ui/OpenServiceActivity;

    invoke-direct {v5, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 1455
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->m:Landroid/content/Context;

    invoke-virtual {v0, v5}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 1456
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->m:Landroid/content/Context;

    sget-object v1, Lo/dae;->hf:Lo/dae;

    invoke-virtual {v1}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/fif;->c(Landroid/content/Context;Ljava/lang/String;)V

    .line 1458
    goto/16 :goto_0

    :cond_3
    sget v0, Lcom/huawei/ui/main/R$id;->social_activity_title:I

    if-ne v4, v0, :cond_4

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->d:J

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x7d0

    cmp-long v0, v0, v2

    if-lez v0, :cond_4

    .line 1460
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 1461
    const-string v0, "click"

    const-string v1, "1"

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1462
    const-string v0, "type"

    const-string v1, "1"

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1463
    const-string v0, "from"

    const-string v1, "3"

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1464
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    sget-object v2, Lo/dae;->Q:Lo/dae;

    invoke-virtual {v2}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v5, v3}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 1465
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->m:Landroid/content/Context;

    invoke-static {v0}, Lo/cze;->c(Landroid/content/Context;)Lo/cze;

    move-result-object v0

    const-string v1, "activityUrl"

    new-instance v2, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$4;

    invoke-direct {v2, p0}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$4;-><init>(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;)V

    invoke-virtual {v0, v1, v2}, Lo/cze;->d(Ljava/lang/String;Lo/cza;)V

    .line 1477
    goto :goto_0

    :cond_4
    sget v0, Lcom/huawei/ui/main/R$id;->social_btn_no_net_work:I

    if-ne v4, v0, :cond_5

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->d:J

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x7d0

    cmp-long v0, v0, v2

    if-lez v0, :cond_5

    .line 1478
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->m:Landroid/content/Context;

    invoke-static {v0}, Lo/dbf;->i(Landroid/content/Context;)V

    .line 1479
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->d:J

    goto :goto_0

    .line 1480
    :cond_5
    sget v0, Lcom/huawei/ui/main/R$id;->social_reload_layout:I

    if-ne v4, v0, :cond_6

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->d:J

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x7d0

    cmp-long v0, v0, v2

    if-lez v0, :cond_6

    .line 1481
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->d()V

    .line 1482
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->d:J

    .line 1484
    :cond_6
    :goto_0
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 2

    .line 257
    const-string v0, "TimeEat_NewSocialFragmentEnter onCreateView"

    invoke-static {v0}, Lo/dbf;->d(Ljava/lang/String;)V

    .line 258
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->m:Landroid/content/Context;

    .line 259
    new-instance v0, Lo/fid;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->m:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/fid;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->U:Lo/fid;

    .line 260
    sget v0, Lcom/huawei/ui/main/R$layout;->fragment_main_circle_new:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->a:Landroid/view/View;

    .line 261
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->m:Landroid/content/Context;

    invoke-static {v0}, Lo/fic;->e(Landroid/content/Context;)Lo/fic;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->I:Lo/fic;

    .line 262
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->m:Landroid/content/Context;

    invoke-static {v0}, Lo/fia;->d(Landroid/content/Context;)Lo/fia;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->N:Lo/fia;

    .line 263
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->m:Landroid/content/Context;

    invoke-static {v0}, Lo/dth;->b(Landroid/content/Context;)Lo/dth;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->T:Lo/dth;

    .line 264
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->a:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->fragment_social_ad:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->w:Landroid/view/View;

    .line 265
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->a:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->fragment_social_sroll:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/elz;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->P:Lo/elz;

    .line 266
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->P:Lo/elz;

    invoke-virtual {v0, p0}, Lo/elz;->setScrollViewListener(Lo/ely;)V

    .line 267
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->a:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->social_message_container:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->O:Landroid/widget/LinearLayout;

    .line 270
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->a:Landroid/view/View;

    invoke-direct {p0, v0}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->e(Landroid/view/View;)V

    .line 272
    new-instance v0, Landroid/os/HandlerThread;

    const-string v1, "UIDV_SocialFragment"

    invoke-direct {v0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->E:Landroid/os/HandlerThread;

    .line 273
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->E:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->start()V

    .line 274
    new-instance v0, Landroid/os/Handler;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->E:Landroid/os/HandlerThread;

    invoke-virtual {v1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->G:Landroid/os/Handler;

    .line 275
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->G:Landroid/os/Handler;

    new-instance v1, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$3;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$3;-><init>(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 301
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->G:Landroid/os/Handler;

    new-instance v1, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$7;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$7;-><init>(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 316
    const-string v0, "TimeEat_NewSocialFragmentLeave onCreateView"

    invoke-static {v0}, Lo/dbf;->d(Ljava/lang/String;)V

    .line 317
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->a:Landroid/view/View;

    return-object v0
.end method

.method public onDestroy()V
    .locals 2

    .line 1538
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->m:Landroid/content/Context;

    invoke-static {v0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->p:Lcom/huawei/ui/main/stories/soical/NewSocialFragment$b;

    invoke-virtual {v0, v1}, Landroid/support/v4/content/LocalBroadcastManager;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 1539
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->m:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->ak:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 1540
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->aj:Landroid/os/Handler;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->al:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 1541
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->aj:Landroid/os/Handler;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->ad:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 1542
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->y()V

    .line 1543
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->E:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->quit()Z

    .line 1544
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onDestroy()V

    .line 1545
    return-void
.end method

.method public onPause()V
    .locals 4

    .line 1358
    const-string v0, "UIDV_SocialFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter onPause begin"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1359
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onPause()V

    .line 1361
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->n()V

    .line 1363
    return-void
.end method

.method public onResume()V
    .locals 5

    .line 1367
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onResume()V

    .line 1368
    const-string v0, "TimeEat_NewSocialFragmentEnter onResume"

    invoke-static {v0}, Lo/dbf;->d(Ljava/lang/String;)V

    .line 1371
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->aj:Landroid/os/Handler;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->al:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 1372
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->aj:Landroid/os/Handler;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->al:Ljava/lang/Runnable;

    const-wide/16 v2, 0x2bc

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 1374
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->m:Landroid/content/Context;

    invoke-static {v0}, Lo/fic;->a(Landroid/content/Context;)Z

    move-result v4

    .line 1375
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->M:Z

    if-eqz v0, :cond_0

    if-eqz v4, :cond_0

    .line 1376
    const-string v0, "UIDV_SocialFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isHideRedDot = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-boolean v2, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->M:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1378
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->aj:Landroid/os/Handler;

    const/16 v1, 0x1a

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 1381
    :cond_0
    if-eqz v4, :cond_1

    .line 1382
    const-string v0, "UIDV_SocialFragment"

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

    .line 1384
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->t()V

    .line 1385
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->m:Landroid/content/Context;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/fic;->a(Landroid/content/Context;Z)V

    .line 1387
    :cond_1
    const-string v0, "TimeEat_NewSocialFragmentLeave onResume"

    invoke-static {v0}, Lo/dbf;->d(Ljava/lang/String;)V

    .line 1388
    return-void
.end method
