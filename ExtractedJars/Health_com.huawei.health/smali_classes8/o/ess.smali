.class public Lo/ess;
.super Landroid/widget/LinearLayout;
.source "SourceFile"


# instance fields
.field private a:Landroid/widget/ListView;

.field private b:Landroid/content/Context;

.field private c:Lo/faq;

.field private d:Lo/exo;

.field private e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/eut;>;"
        }
    .end annotation
.end field

.field private g:Landroid/os/Handler;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 38
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lo/ess;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 39
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 42
    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 30
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ess;->d:Lo/exo;

    .line 35
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/ess;->e:Ljava/util/List;

    .line 73
    new-instance v0, Lo/ess$5;

    invoke-direct {v0, p0}, Lo/ess$5;-><init>(Lo/ess;)V

    iput-object v0, p0, Lo/ess;->g:Landroid/os/Handler;

    .line 43
    invoke-direct {p0, p1}, Lo/ess;->b(Landroid/content/Context;)V

    .line 44
    return-void
.end method

.method static synthetic a(Lo/ess;)Ljava/util/List;
    .locals 1

    .line 28
    iget-object v0, p0, Lo/ess;->e:Ljava/util/List;

    return-object v0
.end method

.method private b(Landroid/content/Context;)V
    .locals 4

    .line 54
    sget v0, Lcom/huawei/ui/homehealth/R$layout;->fitness_data_origin_view:I

    invoke-static {p1, v0, p0}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 56
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lo/ess;->b:Landroid/content/Context;

    .line 57
    iget-object v0, p0, Lo/ess;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/exo;->d(Landroid/content/Context;)Lo/exo;

    move-result-object v0

    iput-object v0, p0, Lo/ess;->d:Lo/exo;

    .line 59
    iget-object v0, p0, Lo/ess;->d:Lo/exo;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-static {v1, v2}, Lo/cnk;->d(J)J

    move-result-wide v1

    new-instance v3, Lo/ess$2;

    invoke-direct {v3, p0}, Lo/ess$2;-><init>(Lo/ess;)V

    invoke-virtual {v0, v1, v2, v3}, Lo/exo;->c(JLo/egg;)V

    .line 68
    sget v0, Lcom/huawei/ui/homehealth/R$id;->lv_fitness_data_origin_list:I

    invoke-static {p0, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ListView;

    iput-object v0, p0, Lo/ess;->a:Landroid/widget/ListView;

    .line 69
    new-instance v0, Lo/faq;

    iget-object v1, p0, Lo/ess;->b:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/faq;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/ess;->c:Lo/faq;

    .line 70
    iget-object v0, p0, Lo/ess;->a:Landroid/widget/ListView;

    iget-object v1, p0, Lo/ess;->c:Lo/faq;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 71
    return-void
.end method

.method static synthetic d(Lo/ess;)Landroid/os/Handler;
    .locals 1

    .line 28
    iget-object v0, p0, Lo/ess;->g:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic e(Lo/ess;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 28
    iput-object p1, p0, Lo/ess;->e:Ljava/util/List;

    return-object p1
.end method

.method static synthetic e(Lo/ess;)Lo/faq;
    .locals 1

    .line 28
    iget-object v0, p0, Lo/ess;->c:Lo/faq;

    return-object v0
.end method


# virtual methods
.method public setmListdata(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/eut;>;)V"
        }
    .end annotation

    .line 47
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 48
    iput-object p1, p0, Lo/ess;->e:Ljava/util/List;

    .line 49
    iget-object v0, p0, Lo/ess;->c:Lo/faq;

    invoke-virtual {v0, p1}, Lo/faq;->c(Ljava/util/List;)V

    .line 51
    :cond_0
    return-void
.end method
