.class public Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"


# instance fields
.field private a:Lo/dwr;

.field private b:Landroid/content/Context;

.field private c:Lo/dxw;

.field private d:Lo/emr;

.field private e:Lo/dyt;

.field private f:Lo/elp;

.field private g:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<Ljava/lang/Integer;Ljava/lang/Integer;>;"
        }
    .end annotation
.end field

.field private h:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lo/dzd;>;"
        }
    .end annotation
.end field

.field private i:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<Ljava/lang/Integer;Ljava/lang/Integer;>;"
        }
    .end annotation
.end field

.field private k:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<Ljava/lang/Integer;Ljava/lang/Integer;>;"
        }
    .end annotation
.end field

.field private p:Landroid/os/Handler;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 64
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    .line 89
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity;->i:Ljava/util/HashMap;

    .line 90
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity;->g:Ljava/util/HashMap;

    .line 91
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity;->k:Ljava/util/HashMap;

    .line 92
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity;->h:Ljava/util/ArrayList;

    .line 94
    new-instance v0, Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity$5;

    invoke-direct {v0, p0}, Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity$5;-><init>(Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity;)V

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity;->p:Landroid/os/Handler;

    return-void
.end method

.method static synthetic a(Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity;)Landroid/content/Context;
    .locals 1

    .line 64
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity;->b:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic a(Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity;Ljava/util/ArrayList;)Ljava/util/ArrayList;
    .locals 0

    .line 64
    iput-object p1, p0, Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity;->h:Ljava/util/ArrayList;

    return-object p1
.end method

.method static synthetic a(Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity;Lo/elp;)Lo/elp;
    .locals 0

    .line 64
    iput-object p1, p0, Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity;->f:Lo/elp;

    return-object p1
.end method

.method static synthetic b(Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity;)Lo/dxw;
    .locals 1

    .line 64
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity;->c:Lo/dxw;

    return-object v0
.end method

.method private b()V
    .locals 5

    .line 273
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 274
    const-string v0, "click"

    const-string v1, "1"

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 275
    sget-object v0, Lo/dae;->af:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v4

    .line 276
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity;->b:Landroid/content/Context;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v4, v3, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 277
    return-void
.end method

.method static synthetic c(Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity;)Ljava/util/ArrayList;
    .locals 1

    .line 64
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity;->h:Ljava/util/ArrayList;

    return-object v0
.end method

.method private c()V
    .locals 6

    .line 141
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity;->i:Ljava/util/HashMap;

    invoke-static {v0}, Lo/dzt;->a(Ljava/util/Map;)V

    .line 142
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity;->g:Ljava/util/HashMap;

    invoke-static {v0}, Lo/dzt;->e(Ljava/util/Map;)V

    .line 143
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity;->k:Ljava/util/HashMap;

    invoke-static {v0}, Lo/dzt;->c(Ljava/util/Map;)V

    .line 145
    sget v0, Lcom/huawei/pluginachievement/R$id;->achieve_level_listview:I

    invoke-static {p0, v0}, Lo/dxi;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/dyt;

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity;->e:Lo/dyt;

    .line 146
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity;->e:Lo/dyt;

    invoke-virtual {v0}, Lo/dyt;->setTopNotChange()V

    .line 147
    new-instance v0, Lo/dxw;

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity;->b:Landroid/content/Context;

    iget-object v2, p0, Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity;->h:Ljava/util/ArrayList;

    iget-object v3, p0, Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity;->i:Ljava/util/HashMap;

    iget-object v4, p0, Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity;->g:Ljava/util/HashMap;

    iget-object v5, p0, Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity;->k:Ljava/util/HashMap;

    invoke-direct/range {v0 .. v5}, Lo/dxw;-><init>(Landroid/content/Context;Ljava/util/ArrayList;Ljava/util/HashMap;Ljava/util/HashMap;Ljava/util/HashMap;)V

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity;->c:Lo/dxw;

    .line 148
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity;->e:Lo/dyt;

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity;->c:Lo/dxw;

    invoke-virtual {v0, v1}, Lo/dyt;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 151
    sget v0, Lcom/huawei/pluginachievement/R$id;->level_titlebar:I

    invoke-virtual {p0, v0}, Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emr;

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity;->d:Lo/emr;

    .line 152
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity;->d:Lo/emr;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/emr;->setRightButtonVisibility(I)V

    .line 153
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity;->d:Lo/emr;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lo/emr;->setRightTextButtonVisibility(I)V

    .line 154
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity;->d:Lo/emr;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/pluginachievement/R$drawable;->ic_more_normal_white:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setRightButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 155
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity;->d:Lo/emr;

    new-instance v1, Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity$3;

    invoke-direct {v1, p0}, Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity$3;-><init>(Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity;)V

    invoke-virtual {v0, v1}, Lo/emr;->setRightButtonOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 179
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity;->d:Lo/emr;

    new-instance v1, Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity$4;

    invoke-direct {v1, p0}, Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity$4;-><init>(Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity;)V

    invoke-virtual {v0, v1}, Lo/emr;->setLeftButtonOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 185
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity;->d:Lo/emr;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/emr;->setLeftButtonVisibility(I)V

    .line 187
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 188
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity;->d:Lo/emr;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/pluginachievement/R$drawable;->ic_back_white_reverse:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setLeftButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_0

    .line 190
    :cond_0
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity;->d:Lo/emr;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/pluginachievement/R$drawable;->ic_back_white:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setLeftButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 192
    :goto_0
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity;->d:Lo/emr;

    invoke-virtual {p0}, Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/pluginachievement/R$color;->white:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Lo/emr;->setTitleTextColor(I)V

    .line 193
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity;->d:Lo/emr;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_grade_grade:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setTitleText(Ljava/lang/String;)V

    .line 194
    return-void
.end method

.method static synthetic c(Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity;ILjava/lang/Object;)V
    .locals 0

    .line 64
    invoke-direct {p0, p1, p2}, Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity;->e(ILjava/lang/Object;)V

    return-void
.end method

.method static synthetic c(Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity;Lo/dze;)V
    .locals 0

    .line 64
    invoke-direct {p0, p1}, Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity;->e(Lo/dze;)V

    return-void
.end method

.method static synthetic d(Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity;)Lo/emr;
    .locals 1

    .line 64
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity;->d:Lo/emr;

    return-object v0
.end method

.method static synthetic d(Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity;D)V
    .locals 0

    .line 64
    invoke-direct {p0, p1, p2}, Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity;->e(D)V

    return-void
.end method

.method private e()V
    .locals 2

    .line 200
    const-string v0, "PLGACHIEVE_AchieveLevelMainActivity"

    const-string v1, "getData"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 202
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dwr;->b(Landroid/content/Context;)Lo/dwr;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity;->a:Lo/dwr;

    .line 203
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    new-instance v1, Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity$2;

    invoke-direct {v1, p0}, Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity$2;-><init>(Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 226
    return-void
.end method

.method private e(D)V
    .locals 2

    .line 229
    invoke-static {p1, p2}, Lo/dyj;->c(D)Lo/dzc;

    move-result-object v1

    .line 230
    const/4 v0, 0x1

    invoke-direct {p0, v0, v1}, Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity;->e(ILjava/lang/Object;)V

    .line 231
    return-void
.end method

.method private e(ILjava/lang/Object;)V
    .locals 2

    .line 250
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v1

    .line 251
    iput p1, v1, Landroid/os/Message;->what:I

    .line 252
    iput-object p2, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 253
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity;->p:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 254
    return-void
.end method

.method static synthetic e(Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity;)V
    .locals 0

    .line 64
    invoke-direct {p0}, Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity;->b()V

    return-void
.end method

.method private e(Lo/dze;)V
    .locals 2

    .line 234
    invoke-static {p1}, Lo/dyj;->c(Lo/dze;)Lo/dzc;

    move-result-object v1

    .line 235
    const/4 v0, 0x1

    invoke-direct {p0, v0, v1}, Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity;->e(ILjava/lang/Object;)V

    .line 236
    return-void
.end method

.method static synthetic g(Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity;)Lo/elp;
    .locals 1

    .line 64
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity;->f:Lo/elp;

    return-object v0
.end method

.method static synthetic h(Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity;)Lo/dwr;
    .locals 1

    .line 64
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity;->a:Lo/dwr;

    return-object v0
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 2

    .line 124
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 125
    sget v0, Lcom/huawei/pluginachievement/R$layout;->achieve_level_new_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity;->setContentView(I)V

    .line 126
    const-string v0, "PLGACHIEVE_AchieveLevelMainActivity"

    const-string v1, "onCreate"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 127
    iput-object p0, p0, Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity;->b:Landroid/content/Context;

    .line 128
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/dwu;->e(Landroid/content/Context;)Lo/dwu;

    move-result-object v0

    invoke-virtual {v0}, Lo/dwu;->e()V

    .line 129
    invoke-direct {p0}, Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity;->c()V

    .line 130
    invoke-direct {p0}, Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity;->e()V

    .line 131
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/elx;->d(Landroid/content/Context;)V

    .line 132
    return-void
.end method

.method public onDestroy()V
    .locals 2

    .line 241
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onDestroy()V

    .line 242
    const-string v0, "PLGACHIEVE_AchieveLevelMainActivity"

    const-string v1, "onDestroy"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 243
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity;->a:Lo/dwr;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 244
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity;->a:Lo/dwr;

    .line 247
    :cond_0
    return-void
.end method
