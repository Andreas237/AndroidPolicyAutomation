.class public Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Lo/dui;
.implements Lo/dyk;


# static fields
.field private static o:I

.field private static p:I


# instance fields
.field private B:Landroid/os/Handler;

.field private a:Lo/egv;

.field private b:Landroid/widget/TextView;

.field private c:J

.field private d:Lo/dwr;

.field private e:Lo/egy;

.field private f:Landroid/widget/ImageView;

.field private g:Ljava/util/concurrent/ExecutorService;

.field private h:Z

.field private i:Z

.field private k:Landroid/graphics/drawable/AnimationDrawable;

.field private l:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lo/dyw;>;"
        }
    .end annotation
.end field

.field private m:J

.field private n:Landroid/widget/TextView;

.field private q:Landroid/widget/RelativeLayout;

.field private r:Landroid/support/v7/widget/LinearLayoutManager;

.field private s:Lo/dyi;

.field private t:Landroid/support/v7/widget/RecyclerView;

.field private u:Landroid/widget/ImageView;

.field private v:Lo/emr;

.field private w:Z

.field private x:J

.field private y:Landroid/content/Context;

.field private z:Lo/egd;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 114
    const/16 v0, 0x7d0

    sput v0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->p:I

    .line 115
    const/16 v0, 0x7d0

    sput v0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->o:I

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 88
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    .line 101
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->a:Lo/egv;

    .line 102
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->e:Lo/egy;

    .line 103
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->i:Z

    .line 104
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->h:Z

    .line 116
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->m:J

    .line 118
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->l:Ljava/util/ArrayList;

    .line 131
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->w:Z

    .line 137
    new-instance v0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity$5;

    invoke-direct {v0, p0}, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity$5;-><init>(Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;)V

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->B:Landroid/os/Handler;

    return-void
.end method

.method private a(I)I
    .locals 4

    .line 536
    add-int/lit16 v0, p1, 0x1f4

    div-int/lit16 v3, v0, 0x3e8

    .line 537
    const-string v0, "PLGACHIEVE_AchieveKaKaActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "kk afford "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    div-int/lit8 v2, v3, 0x32

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 538
    mul-int/lit16 v0, v3, 0x3e8

    return v0
.end method

.method static synthetic a(Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;)Landroid/widget/TextView;
    .locals 1

    .line 88
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->b:Landroid/widget/TextView;

    return-object v0
.end method

.method private a()V
    .locals 2

    .line 346
    invoke-virtual {p0}, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dwr;->b(Landroid/content/Context;)Lo/dwr;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->d:Lo/dwr;

    .line 347
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->y:Landroid/content/Context;

    invoke-static {v0}, Lo/dwo;->c(Landroid/content/Context;)Lo/dwo;

    move-result-object v0

    invoke-virtual {v0}, Lo/dwo;->f()V

    .line 348
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->d:Lo/dwr;

    invoke-virtual {v0}, Lo/dwr;->k()V

    .line 349
    const-string v0, "PLGACHIEVE_AchieveKaKaActivity"

    const-string v1, "getData()"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 350
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->d:Lo/dwr;

    invoke-virtual {v0, p0}, Lo/dwr;->b(Lo/dui;)V

    .line 351
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->g:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity$9;

    invoke-direct {v1, p0}, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity$9;-><init>(Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 370
    return-void
.end method

.method static synthetic a(Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;ILjava/lang/Object;)V
    .locals 0

    .line 88
    invoke-direct {p0, p1, p2}, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->c(ILjava/lang/Object;)V

    return-void
.end method

.method static synthetic a(Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;Ljava/lang/String;)V
    .locals 0

    .line 88
    invoke-direct {p0, p1}, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->b(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic a(Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;Z)Z
    .locals 0

    .line 88
    iput-boolean p1, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->h:Z

    return p1
.end method

.method static synthetic b(Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;J)J
    .locals 0

    .line 88
    iput-wide p1, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->c:J

    return-wide p1
.end method

.method static synthetic b(Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;)Lo/dyi;
    .locals 1

    .line 88
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->s:Lo/dyi;

    return-object v0
.end method

.method private b()V
    .locals 4

    .line 216
    const-string v0, "HwChinese-medium"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    .line 217
    sget v0, Lcom/huawei/pluginachievement/R$id;->kk_curkaka:I

    invoke-static {p0, v0}, Lo/dxi;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->b:Landroid/widget/TextView;

    .line 218
    sget v0, Lcom/huawei/pluginachievement/R$id;->kk_menu_duihuan:I

    invoke-virtual {p0, v0}, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 219
    sget v0, Lcom/huawei/pluginachievement/R$id;->kk_menu_choujiang:I

    invoke-virtual {p0, v0}, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 222
    invoke-static {}, Lo/dbf;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 223
    sget v0, Lcom/huawei/pluginachievement/R$id;->kk_menu_choujiang:I

    invoke-virtual {p0, v0}, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 226
    :cond_0
    sget v0, Lcom/huawei/pluginachievement/R$id;->kaka_convert_anim:I

    invoke-virtual {p0, v0}, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->f:Landroid/widget/ImageView;

    .line 227
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->f:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    check-cast v0, Landroid/graphics/drawable/AnimationDrawable;

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->k:Landroid/graphics/drawable/AnimationDrawable;

    .line 228
    sget v0, Lcom/huawei/pluginachievement/R$id;->kaka_exchange_result:I

    invoke-virtual {p0, v0}, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->n:Landroid/widget/TextView;

    .line 230
    sget v0, Lcom/huawei/pluginachievement/R$id;->achieve_kk_task_reload_layout:I

    invoke-static {p0, v0}, Lo/dxi;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->q:Landroid/widget/RelativeLayout;

    .line 231
    sget v0, Lcom/huawei/pluginachievement/R$id;->achieve_kk_task_img_no_net_work:I

    invoke-static {p0, v0}, Lo/dxi;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->u:Landroid/widget/ImageView;

    .line 232
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->u:Landroid/widget/ImageView;

    invoke-virtual {v0, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 234
    sget v0, Lcom/huawei/pluginachievement/R$id;->achieve_task_kaka_rv:I

    invoke-static {p0, v0}, Lo/dxi;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/RecyclerView;

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->t:Landroid/support/v7/widget/RecyclerView;

    .line 235
    new-instance v0, Landroid/support/v7/widget/LinearLayoutManager;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-direct {v0, p0, v1, v2}, Landroid/support/v7/widget/LinearLayoutManager;-><init>(Landroid/content/Context;IZ)V

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->r:Landroid/support/v7/widget/LinearLayoutManager;

    .line 236
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->t:Landroid/support/v7/widget/RecyclerView;

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->r:Landroid/support/v7/widget/LinearLayoutManager;

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    .line 237
    new-instance v0, Lo/dyi;

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->l:Ljava/util/ArrayList;

    invoke-direct {v0, p0, v1}, Lo/dyi;-><init>(Landroid/content/Context;Ljava/util/ArrayList;)V

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->s:Lo/dyi;

    .line 238
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->s:Lo/dyi;

    invoke-virtual {v0, p0}, Lo/dyi;->c(Lo/dyk;)V

    .line 239
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->t:Landroid/support/v7/widget/RecyclerView;

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->s:Lo/dyi;

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setAdapter(Landroid/support/v7/widget/RecyclerView$Adapter;)V

    .line 241
    sget v0, Lcom/huawei/pluginachievement/R$id;->btn_no_net_work:I

    invoke-static {p0, v0}, Lo/dxi;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->z:Lo/egd;

    .line 242
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->z:Lo/egd;

    invoke-virtual {v0, p0}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 244
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 245
    sget v0, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_kk_get_consume:I

    invoke-virtual {p0, v0}, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "com.huawei.pluginachievement.ui.kakatask.AchieveKaKaDetailActivity"

    invoke-virtual {v3, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 246
    sget v0, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_kk_kaka_rule:I

    invoke-virtual {p0, v0}, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "com.huawei.pluginachievement.ui.kakatask.AchieveKaKaDetailActivity"

    invoke-virtual {v3, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 248
    sget v0, Lcom/huawei/pluginachievement/R$id;->kaka_titlebar:I

    invoke-virtual {p0, v0}, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emr;

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->v:Lo/emr;

    .line 249
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->v:Lo/emr;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/emr;->setRightButtonVisibility(I)V

    .line 250
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->v:Lo/emr;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lo/emr;->setRightTextButtonVisibility(I)V

    .line 251
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->v:Lo/emr;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/pluginachievement/R$drawable;->ic_more_normal_black:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setRightButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 252
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->v:Lo/emr;

    new-instance v1, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity$8;

    invoke-direct {v1, p0}, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity$8;-><init>(Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;)V

    invoke-virtual {v0, v1}, Lo/emr;->setRightButtonOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 269
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->v:Lo/emr;

    new-instance v1, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity$7;

    invoke-direct {v1, p0}, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity$7;-><init>(Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;)V

    invoke-virtual {v0, v1}, Lo/emr;->setLeftButtonOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 275
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->v:Lo/emr;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/emr;->setLeftButtonVisibility(I)V

    .line 276
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->v:Lo/emr;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/pluginachievement/R$drawable;->health_navbar_back_selector:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setLeftButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 277
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->v:Lo/emr;

    invoke-virtual {p0}, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/pluginachievement/R$color;->black:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Lo/emr;->setTitleTextColor(I)V

    .line 278
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->v:Lo/emr;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_kk_mykaka:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setTitleText(Ljava/lang/String;)V

    .line 279
    return-void
.end method

.method static synthetic b(Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;Ljava/lang/String;)V
    .locals 0

    .line 88
    invoke-direct {p0, p1}, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->d(Ljava/lang/String;)V

    return-void
.end method

.method private b(Ljava/lang/String;)V
    .locals 15

    .line 728
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "+"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, p1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 729
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->n:Landroid/widget/TextView;

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 730
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->n:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 732
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->n:Landroid/widget/TextView;

    const-string v1, "alpha"

    const/4 v2, 0x2

    new-array v2, v2, [F

    fill-array-data v2, :array_0

    invoke-static {v0, v1, v2}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v6

    .line 733
    const-wide/16 v0, 0x12c

    invoke-virtual {v6, v0, v1}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 734
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->n:Landroid/widget/TextView;

    const-string v1, "scaleX"

    const/4 v2, 0x2

    new-array v2, v2, [F

    fill-array-data v2, :array_1

    invoke-static {v0, v1, v2}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v7

    .line 735
    const-wide/16 v0, 0x12c

    invoke-virtual {v7, v0, v1}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 736
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->n:Landroid/widget/TextView;

    const-string v1, "scaleY"

    const/4 v2, 0x2

    new-array v2, v2, [F

    fill-array-data v2, :array_2

    invoke-static {v0, v1, v2}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v8

    .line 737
    const-wide/16 v0, 0x12c

    invoke-virtual {v8, v0, v1}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 738
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->n:Landroid/widget/TextView;

    const-string v1, "translationY"

    const/4 v2, 0x2

    new-array v2, v2, [F

    const/4 v3, 0x0

    const/4 v4, 0x0

    aput v3, v2, v4

    const/high16 v3, 0x42700000    # 60.0f

    invoke-static {p0, v3}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v3

    neg-int v3, v3

    int-to-float v3, v3

    const/4 v4, 0x1

    aput v3, v2, v4

    invoke-static {v0, v1, v2}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v9

    .line 739
    const-wide/16 v0, 0x3e8

    invoke-virtual {v9, v0, v1}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 740
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->n:Landroid/widget/TextView;

    const-string v1, "alpha"

    const/4 v2, 0x2

    new-array v2, v2, [F

    fill-array-data v2, :array_3

    invoke-static {v0, v1, v2}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v10

    .line 741
    const-wide/16 v0, 0x12c

    invoke-virtual {v10, v0, v1}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 742
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->n:Landroid/widget/TextView;

    const-string v1, "scaleX"

    const/4 v2, 0x2

    new-array v2, v2, [F

    fill-array-data v2, :array_4

    invoke-static {v0, v1, v2}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v11

    .line 743
    const-wide/16 v0, 0x12c

    invoke-virtual {v11, v0, v1}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 744
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->n:Landroid/widget/TextView;

    const-string v1, "scaleY"

    const/4 v2, 0x2

    new-array v2, v2, [F

    fill-array-data v2, :array_5

    invoke-static {v0, v1, v2}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v12

    .line 745
    const-wide/16 v0, 0x12c

    invoke-virtual {v12, v0, v1}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 746
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->n:Landroid/widget/TextView;

    const-string v1, "translationY"

    const/4 v2, 0x2

    new-array v2, v2, [F

    const/high16 v3, 0x42700000    # 60.0f

    invoke-static {p0, v3}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v3

    neg-int v3, v3

    int-to-float v3, v3

    const/4 v4, 0x0

    aput v3, v2, v4

    const/4 v3, 0x0

    const/4 v4, 0x1

    aput v3, v2, v4

    invoke-static {v0, v1, v2}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v13

    .line 747
    const-wide/16 v0, 0x1

    invoke-virtual {v13, v0, v1}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 749
    new-instance v14, Landroid/animation/AnimatorSet;

    invoke-direct {v14}, Landroid/animation/AnimatorSet;-><init>()V

    .line 750
    invoke-virtual {v14, v6}, Landroid/animation/AnimatorSet;->play(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    move-result-object v0

    invoke-virtual {v0, v7}, Landroid/animation/AnimatorSet$Builder;->with(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    move-result-object v0

    invoke-virtual {v0, v8}, Landroid/animation/AnimatorSet$Builder;->with(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    .line 751
    invoke-virtual {v14, v9}, Landroid/animation/AnimatorSet;->play(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    move-result-object v0

    invoke-virtual {v0, v6}, Landroid/animation/AnimatorSet$Builder;->after(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    .line 752
    invoke-virtual {v14, v10}, Landroid/animation/AnimatorSet;->play(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    move-result-object v0

    invoke-virtual {v0, v11}, Landroid/animation/AnimatorSet$Builder;->with(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    move-result-object v0

    invoke-virtual {v0, v12}, Landroid/animation/AnimatorSet$Builder;->with(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    move-result-object v0

    invoke-virtual {v0, v9}, Landroid/animation/AnimatorSet$Builder;->after(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    .line 753
    invoke-virtual {v14, v13}, Landroid/animation/AnimatorSet;->play(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    move-result-object v0

    invoke-virtual {v0, v10}, Landroid/animation/AnimatorSet$Builder;->after(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    .line 754
    new-instance v0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity$1;

    invoke-direct {v0, p0}, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity$1;-><init>(Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;)V

    invoke-virtual {v14, v0}, Landroid/animation/AnimatorSet;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 776
    invoke-virtual {v14}, Landroid/animation/AnimatorSet;->start()V

    .line 777
    return-void

    nop

    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data

    :array_1
    .array-data 4
        0x3f4ccccd    # 0.8f
        0x3f800000    # 1.0f
    .end array-data

    :array_2
    .array-data 4
        0x3f4ccccd    # 0.8f
        0x3f800000    # 1.0f
    .end array-data

    :array_3
    .array-data 4
        0x3f800000    # 1.0f
        0x0
    .end array-data

    :array_4
    .array-data 4
        0x3f800000    # 1.0f
        0x3f4ccccd    # 0.8f
    .end array-data

    :array_5
    .array-data 4
        0x3f800000    # 1.0f
        0x3f4ccccd    # 0.8f
    .end array-data
.end method

.method private b(Lo/dwk;)V
    .locals 5

    .line 670
    invoke-virtual {p1}, Lo/dwk;->b()Lo/dvp;

    move-result-object v3

    .line 671
    if-eqz v3, :cond_0

    .line 672
    invoke-virtual {v3}, Lo/dvp;->b()Ljava/lang/String;

    move-result-object v4

    .line 673
    const-string v0, "PLGACHIEVE_AchieveKaKaActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "retryToUpload="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 674
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->y:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dwo;->c(Landroid/content/Context;)Lo/dwo;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v4, v1}, Lo/dwo;->d(Ljava/lang/String;I)V

    .line 676
    :cond_0
    return-void
.end method

.method private c()V
    .locals 9

    .line 313
    const-string v0, "PLGACHIEVE_AchieveKaKaActivity"

    const-string v1, "freshKaKaTask"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 314
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 315
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->d:Lo/dwr;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 316
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->d:Lo/dwr;

    const/16 v1, 0xc

    invoke-virtual {v0, v1, v3}, Lo/dwr;->c(ILjava/util/Map;)Ljava/util/List;

    move-result-object v4

    .line 317
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 318
    const/4 v0, 0x0

    if-eq v0, v4, :cond_2

    .line 319
    const/4 v6, 0x0

    :goto_0
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-ge v6, v0, :cond_1

    .line 320
    invoke-interface {v4, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lo/dvf;

    .line 321
    instance-of v0, v7, Lo/dvq;

    if-eqz v0, :cond_0

    .line 322
    move-object v8, v7

    check-cast v8, Lo/dvq;

    .line 323
    invoke-interface {v5, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 319
    :cond_0
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 326
    :cond_1
    invoke-static {v5}, Lo/dyf;->d(Ljava/util/List;)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->l:Ljava/util/ArrayList;

    .line 327
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->l:Ljava/util/ArrayList;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 328
    const/4 v6, 0x0

    :goto_1
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->l:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v6, v0, :cond_2

    .line 329
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->l:Ljava/util/ArrayList;

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lo/dyw;

    .line 330
    const-string v0, "PLGACHIEVE_AchieveKaKaActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "getData() kakas="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v7}, Lo/dyw;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 328
    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    .line 334
    :cond_2
    goto :goto_2

    .line 335
    :cond_3
    const-string v0, "PLGACHIEVE_AchieveKaKaActivity"

    const-string v1, "mService is null"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 338
    :goto_2
    const/16 v0, 0x138d

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->c(ILjava/lang/Object;)V

    .line 340
    return-void
.end method

.method private c(I)V
    .locals 6

    .line 519
    const-string v0, "PLGACHIEVE_AchieveKaKaActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "kkConvert() mService="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->d:Lo/dwr;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 520
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->d:Lo/dwr;

    if-nez v0, :cond_0

    .line 522
    const-string v0, "PLGACHIEVE_AchieveKaKaActivity"

    const-string v1, "kkConvert() mService == null"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 523
    return-void

    .line 525
    :cond_0
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 526
    invoke-direct {p0, p1}, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->a(I)I

    move-result v4

    .line 527
    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v5

    .line 528
    const-string v0, "PLGACHIEVE_AchieveKaKaActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "the manipulated calorie value is "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 529
    const-string v0, "calorie"

    invoke-virtual {v3, v0, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 531
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->d:Lo/dwr;

    const/4 v1, 0x5

    invoke-virtual {v0, v1, v3}, Lo/dwr;->d(ILjava/util/Map;)V

    .line 533
    return-void
.end method

.method private c(ILjava/lang/Object;)V
    .locals 2

    .line 373
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v1

    .line 374
    iput p1, v1, Landroid/os/Message;->what:I

    .line 375
    iput-object p2, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 376
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->B:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 377
    return-void
.end method

.method static synthetic c(Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;)V
    .locals 0

    .line 88
    invoke-direct {p0}, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->h()V

    return-void
.end method

.method static synthetic c(Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;Ljava/lang/String;)V
    .locals 0

    .line 88
    invoke-direct {p0, p1}, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->c(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic c(Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;Lo/dwk;)V
    .locals 0

    .line 88
    invoke-direct {p0, p1}, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->b(Lo/dwk;)V

    return-void
.end method

.method private c(Ljava/lang/String;)V
    .locals 7

    .line 188
    invoke-static {p0}, Lo/dth;->b(Landroid/content/Context;)Lo/dth;

    move-result-object v0

    invoke-virtual {v0}, Lo/dth;->d()Lo/dti;

    move-result-object v4

    .line 189
    if-nez v4, :cond_0

    .line 190
    const-string v0, "PLGACHIEVE_AchieveKaKaActivity"

    const-string v1, "PluginForAchieveAdapter is null"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 191
    return-void

    .line 194
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/web/html/kakalottery.html"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 195
    const-string v0, "PLGACHIEVE_AchieveKaKaActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "To lottery url="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 196
    invoke-virtual {p0}, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-interface {v4, v0, v5}, Lo/dti;->d(Landroid/content/Context;Ljava/lang/String;)V

    .line 197
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->i:Z

    .line 199
    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    .line 200
    const-string v0, "type"

    const-string v1, "1"

    invoke-interface {v6, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 201
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    sget-object v2, Lo/dae;->S:Lo/dae;

    invoke-virtual {v2}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v6, v3}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 202
    return-void
.end method

.method static synthetic c(Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;Z)Z
    .locals 0

    .line 88
    iput-boolean p1, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->w:Z

    return p1
.end method

.method static synthetic d(Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;J)J
    .locals 0

    .line 88
    iput-wide p1, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->x:J

    return-wide p1
.end method

.method private d()V
    .locals 3

    .line 472
    invoke-virtual {p0}, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    .line 473
    invoke-static {v2}, Lo/dth;->b(Landroid/content/Context;)Lo/dth;

    move-result-object v0

    invoke-virtual {v0}, Lo/dth;->d()Lo/dti;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 474
    invoke-static {v2}, Lo/dth;->b(Landroid/content/Context;)Lo/dth;

    move-result-object v0

    invoke-virtual {v0}, Lo/dth;->d()Lo/dti;

    move-result-object v0

    new-instance v1, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity$12;

    invoke-direct {v1, p0}, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity$12;-><init>(Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;)V

    invoke-interface {v0, v1, v2}, Lo/dti;->b(Lo/duh;Landroid/content/Context;)V

    .line 492
    :cond_0
    invoke-direct {p0}, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->k()V

    .line 494
    return-void
.end method

.method static synthetic d(Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;)V
    .locals 0

    .line 88
    invoke-direct {p0}, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->c()V

    return-void
.end method

.method static synthetic d(Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;I)V
    .locals 0

    .line 88
    invoke-direct {p0, p1}, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->c(I)V

    return-void
.end method

.method private d(Ljava/lang/String;)V
    .locals 1

    .line 824
    invoke-static {p0}, Lo/ead;->a(Landroid/content/Context;)Lo/ead;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/ead;->c(Ljava/lang/String;)V

    .line 825
    return-void
.end method

.method static synthetic e(Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;)Ljava/util/ArrayList;
    .locals 1

    .line 88
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->l:Ljava/util/ArrayList;

    return-object v0
.end method

.method private e()V
    .locals 2

    .line 396
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->f:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 397
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->k:Landroid/graphics/drawable/AnimationDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->stop()V

    .line 398
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->k:Landroid/graphics/drawable/AnimationDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->start()V

    .line 399
    return-void
.end method

.method static synthetic f(Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;)J
    .locals 2

    .line 88
    iget-wide v0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->c:J

    return-wide v0
.end method

.method private f()V
    .locals 2

    .line 513
    sget v0, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_code_calorie_not_enough:I

    invoke-virtual {p0, v0}, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 514
    const/16 v0, 0x3e8

    invoke-direct {p0, v0, v1}, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->c(ILjava/lang/Object;)V

    .line 515
    return-void
.end method

.method static synthetic g(Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;)Lo/dwr;
    .locals 1

    .line 88
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->d:Lo/dwr;

    return-object v0
.end method

.method private g()V
    .locals 5

    .line 797
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 798
    const-string v0, "timestamp"

    iget-wide v1, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->c:J

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 799
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->d:Lo/dwr;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 800
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->d:Lo/dwr;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, v4}, Lo/dwr;->d(ILjava/util/Map;)V

    .line 802
    :cond_0
    const-string v0, "PLGACHIEVE_AchieveKaKaActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "doRfreshAchieve() mSyncTimestamp="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-wide v2, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->c:J

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 803
    return-void
.end method

.method private h()V
    .locals 2

    .line 780
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->d:Lo/dwr;

    if-nez v0, :cond_0

    .line 782
    const-string v0, "PLGACHIEVE_AchieveKaKaActivity"

    const-string v1, "doRfresh() mService == null"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 783
    return-void

    .line 785
    :cond_0
    invoke-direct {p0}, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->g()V

    .line 793
    return-void
.end method

.method static synthetic h(Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;)V
    .locals 0

    .line 88
    invoke-direct {p0}, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->n()V

    return-void
.end method

.method static synthetic i(Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;)Lo/emr;
    .locals 1

    .line 88
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->v:Lo/emr;

    return-object v0
.end method

.method private i()V
    .locals 3

    .line 806
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 807
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->d:Lo/dwr;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 808
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->d:Lo/dwr;

    const/16 v1, 0xb

    invoke-virtual {v0, v1, v2}, Lo/dwr;->d(ILjava/util/Map;)V

    .line 810
    :cond_0
    return-void
.end method

.method static synthetic k(Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;)Landroid/content/Context;
    .locals 1

    .line 88
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->y:Landroid/content/Context;

    return-object v0
.end method

.method private k()V
    .locals 5

    .line 498
    const-string v0, "PLGACHIEVE_AchieveKaKaActivity"

    const-string v1, "enter kakaMsgId"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 499
    invoke-static {p0}, Lo/dth;->b(Landroid/content/Context;)Lo/dth;

    move-result-object v0

    invoke-virtual {v0}, Lo/dth;->d()Lo/dti;

    move-result-object v3

    .line 500
    const/4 v0, 0x0

    if-eq v0, v3, :cond_0

    .line 501
    const-string v0, "_achieve_msg_id_kaka"

    invoke-static {p0, v0}, Lo/dtn;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 502
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 503
    const-string v0, "PLGACHIEVE_AchieveKaKaActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "deleteMessage kakaMsgId="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 504
    invoke-interface {v3, v4}, Lo/dti;->d(Ljava/lang/String;)V

    .line 505
    const-string v0, "_achieve_flag"

    const-string v1, "flag"

    invoke-static {p0, v0, v1}, Lo/dtn;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 506
    const-string v0, "_achieve_calorie"

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Lo/dtn;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 507
    const-string v0, "_achieve_msg_id_kaka"

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Lo/dtn;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 510
    :cond_0
    return-void
.end method

.method static synthetic l(Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;)Landroid/widget/TextView;
    .locals 1

    .line 88
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->n:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic m(Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;)V
    .locals 0

    .line 88
    invoke-direct {p0}, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->f()V

    return-void
.end method

.method private n()V
    .locals 4

    .line 831
    const-string v0, "PLGACHIEVE_AchieveKaKaActivity"

    const-string v1, "showNetworkErrorDialog()"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 832
    invoke-direct {p0}, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->o()V

    .line 833
    new-instance v3, Lo/egv$b;

    invoke-direct {v3, p0}, Lo/egv$b;-><init>(Landroid/content/Context;)V

    .line 834
    sget v0, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_network_error_msg_title:I

    invoke-virtual {v3, v0}, Lo/egv$b;->b(I)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_network_error_msg_content_2:I

    .line 835
    invoke-virtual {v0, v1}, Lo/egv$b;->e(I)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_network_error_msg_btn:I

    new-instance v2, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity$4;

    invoke-direct {v2, p0}, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity$4;-><init>(Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;)V

    .line 836
    invoke-virtual {v0, v1, v2}, Lo/egv$b;->e(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    .line 845
    invoke-virtual {v3}, Lo/egv$b;->b()Lo/egv;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->a:Lo/egv;

    .line 846
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->a:Lo/egv;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/egv;->setCancelable(Z)V

    .line 847
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->a:Lo/egv;

    invoke-virtual {v0}, Lo/egv;->show()V

    .line 848
    return-void
.end method

.method static synthetic n(Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;)V
    .locals 0

    .line 88
    invoke-direct {p0}, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->g()V

    return-void
.end method

.method private o()V
    .locals 2

    .line 813
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->a:Lo/egv;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->a:Lo/egv;

    invoke-virtual {v0}, Lo/egv;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 814
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->a:Lo/egv;

    invoke-virtual {v0}, Lo/egv;->dismiss()V

    .line 816
    :cond_0
    return-void
.end method

.method static synthetic o(Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;)V
    .locals 0

    .line 88
    invoke-direct {p0}, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->i()V

    return-void
.end method

.method static synthetic p(Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;)Lo/egv;
    .locals 1

    .line 88
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->a:Lo/egv;

    return-object v0
.end method


# virtual methods
.method public d(Ljava/lang/String;Ljava/lang/String;I)V
    .locals 10

    .line 852
    const-string v0, "PLGACHIEVE_AchieveKaKaActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onTaskClick code ="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " taskId ="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "position ="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 853
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 854
    const-string v0, "click"

    const-string v1, "1"

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 855
    const-string v0, "taskID"

    invoke-interface {v4, v0, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 856
    const-string v0, "clickType"

    invoke-interface {v4, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 857
    sget-object v0, Lo/dae;->ae:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v5

    .line 859
    const-string v0, "0"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 860
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->m:J

    sub-long/2addr v0, v2

    sget v2, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->o:I

    int-to-long v2, v2

    cmp-long v0, v0, v2

    if-lez v0, :cond_6

    .line 861
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->y:Landroid/content/Context;

    invoke-static {v0}, Lo/dwo;->c(Landroid/content/Context;)Lo/dwo;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->y:Landroid/content/Context;

    invoke-virtual {v0, p2, v1}, Lo/dwo;->b(Ljava/lang/String;Landroid/content/Context;)V

    .line 862
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->y:Landroid/content/Context;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v5, v4, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    goto/16 :goto_1

    .line 864
    :cond_0
    const-string v0, "1"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 865
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->m:J

    sub-long/2addr v0, v2

    sget v2, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->o:I

    int-to-long v2, v2

    cmp-long v0, v0, v2

    if-lez v0, :cond_6

    .line 866
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->m:J

    .line 867
    invoke-static {p0}, Lo/dtm;->e(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 868
    const-string v0, "PLGACHIEVE_AchieveKaKaActivity"

    const-string v1, "showNetworkErrorDialog kkConvert"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 869
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->B:Landroid/os/Handler;

    const/16 v1, 0x3e9

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 870
    return-void

    .line 872
    :cond_1
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->y:Landroid/content/Context;

    invoke-static {v0}, Lo/dwo;->c(Landroid/content/Context;)Lo/dwo;

    move-result-object v0

    const/4 v1, 0x2

    invoke-virtual {v0, p2, v1}, Lo/dwo;->d(Ljava/lang/String;I)V

    .line 873
    invoke-direct {p0}, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->e()V

    .line 874
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->y:Landroid/content/Context;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v5, v4, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    goto/16 :goto_1

    .line 876
    :cond_2
    const-string v0, "3"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 877
    if-ltz p3, :cond_3

    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->l:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-le p3, v0, :cond_4

    .line 878
    :cond_3
    const-string v0, "PLGACHIEVE_AchieveKaKaActivity"

    const-string v1, "IndexOutOfBoundsException"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 879
    return-void

    .line 881
    :cond_4
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->l:Ljava/util/ArrayList;

    invoke-virtual {v0, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/dyw;

    .line 882
    invoke-virtual {v6}, Lo/dyw;->d()Lo/dzb;

    move-result-object v7

    .line 885
    const-string v8, ""

    .line 886
    const v0, 0x33464

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7}, Lo/dzb;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 887
    sget v0, Lcom/huawei/pluginachievement/R$string;->IDS_contact_confirm_ios_btn:I

    invoke-virtual {p0, v0}, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->getString(I)Ljava/lang/String;

    move-result-object v8

    goto :goto_0

    .line 889
    :cond_5
    sget v0, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_kaka_see:I

    invoke-virtual {p0, v0}, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->getString(I)Ljava/lang/String;

    move-result-object v8

    .line 893
    :goto_0
    new-instance v9, Lo/egy$b;

    invoke-direct {v9, p0}, Lo/egy$b;-><init>(Landroid/content/Context;)V

    .line 894
    invoke-virtual {v7}, Lo/dzb;->d()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Lo/egy$b;->a(Ljava/lang/String;)Lo/egy$b;

    .line 895
    new-instance v0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity$2;

    invoke-direct {v0, p0, p2}, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity$2;-><init>(Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;Ljava/lang/String;)V

    invoke-virtual {v9, v8, v0}, Lo/egy$b;->c(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egy$b;

    .line 904
    invoke-virtual {v9}, Lo/egy$b;->a()Lo/egy;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->e:Lo/egy;

    .line 905
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->e:Lo/egy;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/egy;->setCancelable(Z)V

    .line 906
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->e:Lo/egy;

    invoke-virtual {v0}, Lo/egy;->show()V

    .line 908
    :cond_6
    :goto_1
    return-void
.end method

.method public e(ILo/dwk;)V
    .locals 13

    .line 543
    const-string v0, "PLGACHIEVE_AchieveKaKaActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onDataChanged error="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 544
    const/4 v0, -0x1

    if-ne p1, v0, :cond_1

    .line 546
    const-string v0, "PLGACHIEVE_AchieveKaKaActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "showNetworkErrorDialog error="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 547
    invoke-static {}, Lo/dbf;->b()Z

    move-result v0

    if-nez v0, :cond_0

    .line 548
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->B:Landroid/os/Handler;

    const/16 v1, 0x3e9

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 550
    :cond_0
    return-void

    .line 552
    :cond_1
    const/4 v0, 0x0

    if-ne v0, p2, :cond_2

    .line 553
    return-void

    .line 555
    :cond_2
    const-string v0, "PLGACHIEVE_AchieveKaKaActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onDataChanged resultCode="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p2}, Lo/dwk;->o()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 557
    const-string v0, "0"

    invoke-virtual {p2}, Lo/dwk;->o()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_d

    .line 558
    const/4 v6, 0x0

    .line 559
    const-string v0, "50002"

    invoke-virtual {p2}, Lo/dwk;->o()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 560
    sget v0, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_code_kaka_not_enough:I

    invoke-virtual {p0, v0}, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->getString(I)Ljava/lang/String;

    move-result-object v6

    goto/16 :goto_0

    .line 561
    :cond_3
    const-string v0, "50003"

    invoke-virtual {p2}, Lo/dwk;->o()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 562
    sget v0, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_code_not_sync:I

    invoke-virtual {p0, v0}, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->getString(I)Ljava/lang/String;

    move-result-object v6

    goto/16 :goto_0

    .line 563
    :cond_4
    const-string v0, "50010"

    invoke-virtual {p2}, Lo/dwk;->o()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 564
    sget v0, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_code_calorie_not_enough:I

    invoke-virtual {p0, v0}, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->getString(I)Ljava/lang/String;

    move-result-object v6

    goto/16 :goto_0

    .line 565
    :cond_5
    const-string v0, "50011"

    invoke-virtual {p2}, Lo/dwk;->o()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 566
    sget v0, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_code_exchange_upper_limit:I

    invoke-virtual {p0, v0}, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->getString(I)Ljava/lang/String;

    move-result-object v6

    goto :goto_0

    .line 567
    :cond_6
    const-string v0, "50012"

    invoke-virtual {p2}, Lo/dwk;->o()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 568
    sget v0, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_code_calorie_user_not_exsist:I

    invoke-virtual {p0, v0}, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->getString(I)Ljava/lang/String;

    move-result-object v6

    goto :goto_0

    .line 569
    :cond_7
    const-string v0, "10001"

    invoke-virtual {p2}, Lo/dwk;->o()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 570
    sget v0, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_code_unknown_error:I

    invoke-virtual {p0, v0}, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->getString(I)Ljava/lang/String;

    move-result-object v6

    goto :goto_0

    .line 571
    :cond_8
    const-string v0, "10005"

    invoke-virtual {p2}, Lo/dwk;->o()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 572
    sget v0, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_code_auth_fail:I

    invoke-virtual {p0, v0}, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->getString(I)Ljava/lang/String;

    move-result-object v6

    goto :goto_0

    .line 573
    :cond_9
    const-string v0, "10014"

    invoke-virtual {p2}, Lo/dwk;->o()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 574
    iget-boolean v0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->h:Z

    if-nez v0, :cond_a

    .line 575
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->g:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity$13;

    invoke-direct {v1, p0, p2}, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity$13;-><init>(Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;Lo/dwk;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 587
    :cond_a
    :goto_0
    const/4 v0, 0x0

    if-eq v0, v6, :cond_b

    .line 588
    const/16 v0, 0x3e8

    invoke-direct {p0, v0, v6}, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->c(ILjava/lang/Object;)V

    .line 591
    :cond_b
    invoke-virtual {p2}, Lo/dwk;->l()I

    move-result v0

    const/4 v1, 0x5

    if-ne v0, v1, :cond_c

    .line 593
    const/16 v0, 0x44d

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->c(ILjava/lang/Object;)V

    .line 595
    :cond_c
    return-void

    .line 597
    :cond_d
    invoke-virtual {p2}, Lo/dwk;->l()I

    move-result v0

    const/4 v1, 0x5

    if-ne v0, v1, :cond_11

    .line 599
    invoke-virtual {p2}, Lo/dwk;->n()Lo/dvn;

    move-result-object v6

    .line 600
    const/4 v0, 0x0

    if-eq v0, v6, :cond_10

    .line 601
    const-string v0, "PLGACHIEVE_AchieveKaKaActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "mCalorieExchange ="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v6}, Lo/dvn;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 602
    invoke-virtual {p0}, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/pluginachievement/R$plurals;->IDS_plugin_achievement_kk_convert_tip:I

    invoke-virtual {v6}, Lo/dvn;->b()I

    move-result v2

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    .line 603
    invoke-virtual {v6}, Lo/dvn;->b()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    .line 602
    invoke-virtual {v0, v1, v2, v3}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    .line 604
    const/4 v0, 0x5

    invoke-direct {p0, v0, v7}, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->c(ILjava/lang/Object;)V

    .line 605
    invoke-virtual {v6}, Lo/dvn;->b()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/16 v1, 0x450

    invoke-direct {p0, v1, v0}, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->c(ILjava/lang/Object;)V

    .line 606
    const-string v0, "_achieve_exchange_datastr"

    invoke-static {p0, v0}, Lo/dtn;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 607
    new-instance v0, Ljava/sql/Timestamp;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-direct {v0, v1, v2}, Ljava/sql/Timestamp;-><init>(J)V

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    const/16 v2, 0xa

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v9

    .line 608
    invoke-virtual {v9, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_f

    .line 609
    const-string v0, "_achieve_exchange_num"

    invoke-static {p0, v0}, Lo/dtn;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    .line 610
    const/4 v11, 0x0

    .line 611
    invoke-static {v10}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_e

    .line 612
    invoke-static {v10}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v11

    .line 614
    :cond_e
    invoke-virtual {v6}, Lo/dvn;->b()I

    move-result v0

    add-int v12, v11, v0

    .line 615
    const-string v0, "PLGACHIEVE_AchieveKaKaActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "exchange sum ="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 616
    const-string v0, "_achieve_exchange_num"

    invoke-static {v12}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {p0, v0, v1}, Lo/dtn;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 617
    goto :goto_1

    .line 618
    :cond_f
    const-string v0, "PLGACHIEVE_AchieveKaKaActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "new exchange ="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v6}, Lo/dvn;->b()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 619
    const-string v0, "_achieve_exchange_datastr"

    invoke-static {p0, v0, v9}, Lo/dtn;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 620
    const-string v0, "_achieve_exchange_num"

    invoke-virtual {v6}, Lo/dvn;->b()I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {p0, v0, v1}, Lo/dtn;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 623
    :cond_10
    :goto_1
    goto/16 :goto_3

    :cond_11
    invoke-virtual {p2}, Lo/dwk;->l()I

    move-result v0

    if-nez v0, :cond_14

    .line 625
    invoke-virtual {p2}, Lo/dwk;->d()Lo/dvh;

    move-result-object v6

    .line 626
    const-string v0, "PLGACHIEVE_AchieveKaKaActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onDataChanged achieveInfo="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    if-nez v6, :cond_12

    const-string v2, "null"

    goto :goto_2

    :cond_12
    move-object v2, v6

    :goto_2
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 627
    const/4 v0, 0x0

    if-eq v0, v6, :cond_13

    .line 628
    invoke-virtual {v6}, Lo/dvh;->b()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->c:J

    .line 629
    invoke-virtual {v6}, Lo/dvh;->c()I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-direct {p0, v1, v0}, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->c(ILjava/lang/Object;)V

    .line 631
    :cond_13
    goto/16 :goto_3

    :cond_14
    invoke-virtual {p2}, Lo/dwk;->l()I

    move-result v0

    const/16 v1, 0xc

    if-ne v0, v1, :cond_16

    .line 632
    invoke-virtual {p2}, Lo/dwk;->b()Lo/dvp;

    move-result-object v6

    .line 633
    if-eqz v6, :cond_15

    .line 634
    invoke-virtual {v6}, Lo/dvp;->a()I

    move-result v7

    .line 635
    const-string v0, "PLGACHIEVE_AchieveKaKaActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onDataChange UPDATE_TASK_STATUS RewardKaka="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 636
    if-lez v7, :cond_15

    .line 637
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/16 v1, 0x450

    invoke-direct {p0, v1, v0}, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->c(ILjava/lang/Object;)V

    .line 638
    invoke-virtual {v6}, Lo/dvp;->c()I

    move-result v8

    .line 639
    invoke-static {v8}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-direct {p0, v1, v0}, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->c(ILjava/lang/Object;)V

    .line 640
    move v9, v8

    .line 641
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->g:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity$3;

    invoke-direct {v1, p0, v6, v9}, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity$3;-><init>(Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;Lo/dvp;I)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 653
    :cond_15
    goto :goto_3

    :cond_16
    invoke-virtual {p2}, Lo/dwk;->l()I

    move-result v0

    const/16 v1, 0xb

    if-ne v0, v1, :cond_18

    .line 654
    invoke-virtual {p0}, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dwo;->c(Landroid/content/Context;)Lo/dwo;

    move-result-object v0

    invoke-virtual {v0}, Lo/dwo;->a()J

    move-result-wide v6

    .line 655
    const-string v0, "PLGACHIEVE_AchieveKaKaActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onDataChange GET_TASK_LIST freshTaskTempTime="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " mFreshTaskListTime="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-wide v2, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->x:J

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 656
    iget-wide v0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->x:J

    invoke-static {v0, v1, v6, v7}, Lo/dzo;->b(JJ)Z

    move-result v0

    if-nez v0, :cond_17

    iget-boolean v0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->w:Z

    if-eqz v0, :cond_18

    .line 657
    :cond_17
    const/16 v0, 0xb

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->c(ILjava/lang/Object;)V

    .line 658
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->w:Z

    .line 661
    :cond_18
    :goto_3
    return-void
.end method

.method public onBackPressed()V
    .locals 2

    .line 685
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->d:Lo/dwr;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 687
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->d:Lo/dwr;

    invoke-virtual {v0, p0}, Lo/dwr;->d(Lo/dui;)V

    .line 689
    :cond_0
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->y:Landroid/content/Context;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    invoke-virtual {p0}, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->isDestroyed()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 690
    :cond_1
    const-string v0, "PLGACHIEVE_AchieveKaKaActivity"

    const-string v1, "activity is finish"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 692
    :cond_2
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onBackPressed()V

    .line 694
    :goto_0
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 6

    .line 403
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 404
    const-string v0, "click"

    const-string v1, "1"

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 405
    sget v0, Lcom/huawei/pluginachievement/R$id;->kk_menu_duihuan:I

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v1

    if-ne v0, v1, :cond_2

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->m:J

    sub-long/2addr v0, v2

    sget v2, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->p:I

    int-to-long v2, v2

    cmp-long v0, v0, v2

    if-lez v0, :cond_2

    .line 406
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->m:J

    .line 409
    invoke-static {}, Lo/dbf;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 410
    sget v0, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_code_calorie_not_enough:I

    invoke-virtual {p0, v0}, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->getString(I)Ljava/lang/String;

    move-result-object v5

    .line 411
    const/16 v0, 0x3e8

    invoke-direct {p0, v0, v5}, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->c(ILjava/lang/Object;)V

    .line 412
    return-void

    .line 415
    :cond_0
    invoke-static {p0}, Lo/dtm;->e(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 416
    const-string v0, "PLGACHIEVE_AchieveKaKaActivity"

    const-string v1, "showNetworkErrorDialog kkConvert"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 417
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->B:Landroid/os/Handler;

    const/16 v1, 0x3e9

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 418
    return-void

    .line 421
    :cond_1
    invoke-direct {p0}, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->d()V

    .line 422
    invoke-direct {p0}, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->e()V

    .line 423
    const-string v0, "type"

    const-string v1, "0"

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 424
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    sget-object v2, Lo/dae;->S:Lo/dae;

    invoke-virtual {v2}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v4, v3}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    goto/16 :goto_0

    .line 425
    :cond_2
    sget v0, Lcom/huawei/pluginachievement/R$id;->kk_menu_choujiang:I

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v1

    if-ne v0, v1, :cond_4

    .line 426
    invoke-static {p0}, Lo/dtm;->e(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 427
    const-string v0, "PLGACHIEVE_AchieveKaKaActivity"

    const-string v1, "showNetworkErrorDialog kkConvert"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 428
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->B:Landroid/os/Handler;

    const/16 v1, 0x3e9

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 429
    return-void

    .line 432
    :cond_3
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->y:Landroid/content/Context;

    invoke-static {v0}, Lo/cze;->c(Landroid/content/Context;)Lo/cze;

    move-result-object v0

    const-string v1, "achievementUrl"

    new-instance v2, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity$6;

    invoke-direct {v2, p0}, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity$6;-><init>(Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;)V

    invoke-virtual {v0, v1, v2}, Lo/cze;->d(Ljava/lang/String;Lo/cza;)V

    goto :goto_0

    .line 444
    :cond_4
    sget v0, Lcom/huawei/pluginachievement/R$id;->achieve_kk_task_img_no_net_work:I

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v1

    if-ne v0, v1, :cond_7

    .line 445
    invoke-static {p0}, Lo/dtm;->e(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_5

    .line 446
    return-void

    .line 448
    :cond_5
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->q:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 449
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->t:Landroid/support/v7/widget/RecyclerView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setVisibility(I)V

    .line 450
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->g:Ljava/util/concurrent/ExecutorService;

    if-nez v0, :cond_6

    .line 451
    invoke-static {}, Ljava/util/concurrent/Executors;->newCachedThreadPool()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->g:Ljava/util/concurrent/ExecutorService;

    .line 453
    :cond_6
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->g:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity$15;

    invoke-direct {v1, p0}, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity$15;-><init>(Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    goto :goto_0

    .line 461
    :cond_7
    sget v0, Lcom/huawei/pluginachievement/R$id;->btn_no_net_work:I

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v1

    if-ne v0, v1, :cond_8

    .line 462
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->y:Landroid/content/Context;

    invoke-static {v0}, Lo/dbf;->i(Landroid/content/Context;)V

    .line 464
    :cond_8
    :goto_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 206
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 207
    sget v0, Lcom/huawei/pluginachievement/R$layout;->achieve_kaka:I

    invoke-virtual {p0, v0}, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->setContentView(I)V

    .line 208
    iput-object p0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->y:Landroid/content/Context;

    .line 209
    invoke-static {}, Ljava/util/concurrent/Executors;->newCachedThreadPool()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->g:Ljava/util/concurrent/ExecutorService;

    .line 211
    invoke-direct {p0}, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->b()V

    .line 212
    invoke-direct {p0}, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->a()V

    .line 213
    return-void
.end method

.method public onDestroy()V
    .locals 2

    .line 698
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onDestroy()V

    .line 699
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->g:Ljava/util/concurrent/ExecutorService;

    invoke-static {v0}, Lo/dzw;->c(Ljava/util/concurrent/ExecutorService;)V

    .line 705
    invoke-direct {p0}, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->o()V

    .line 706
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->d:Lo/dwr;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 707
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->d:Lo/dwr;

    invoke-virtual {v0, p0}, Lo/dwr;->d(Lo/dui;)V

    .line 709
    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->d:Lo/dwr;

    .line 710
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->B:Landroid/os/Handler;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 711
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->B:Landroid/os/Handler;

    const/16 v1, 0x3e8

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 712
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->B:Landroid/os/Handler;

    const/4 v1, 0x5

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 713
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->B:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 714
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->B:Landroid/os/Handler;

    const/16 v1, 0x3e9

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 715
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->B:Landroid/os/Handler;

    const/16 v1, 0x44d

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 717
    :cond_1
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->k:Landroid/graphics/drawable/AnimationDrawable;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 718
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->k:Landroid/graphics/drawable/AnimationDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->stop()V

    .line 719
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->k:Landroid/graphics/drawable/AnimationDrawable;

    .line 721
    :cond_2
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->f:Landroid/widget/ImageView;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 722
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->f:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 723
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->f:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 725
    :cond_3
    return-void
.end method

.method public onResume()V
    .locals 2

    .line 284
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onResume()V

    .line 285
    invoke-static {p0}, Lo/dtm;->e(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 286
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->q:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 287
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->t:Landroid/support/v7/widget/RecyclerView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setVisibility(I)V

    goto :goto_0

    .line 289
    :cond_0
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->g:Ljava/util/concurrent/ExecutorService;

    if-nez v0, :cond_1

    .line 290
    invoke-static {}, Ljava/util/concurrent/Executors;->newCachedThreadPool()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->g:Ljava/util/concurrent/ExecutorService;

    .line 292
    :cond_1
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->g:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity$10;

    invoke-direct {v1, p0}, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity$10;-><init>(Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 299
    iget-boolean v0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->i:Z

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->y:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dwo;->c(Landroid/content/Context;)Lo/dwo;

    move-result-object v0

    invoke-virtual {v0}, Lo/dwo;->c()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 300
    :cond_2
    invoke-direct {p0}, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->h()V

    .line 301
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->y:Landroid/content/Context;

    invoke-static {v0}, Lo/dwo;->c(Landroid/content/Context;)Lo/dwo;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/dwo;->b(Z)V

    .line 302
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->i:Z

    .line 306
    :cond_3
    :goto_0
    invoke-static {}, Lo/dbf;->b()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 307
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->q:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 308
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->t:Landroid/support/v7/widget/RecyclerView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setVisibility(I)V

    .line 310
    :cond_4
    return-void
.end method
