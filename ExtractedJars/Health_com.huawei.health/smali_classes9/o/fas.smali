.class public Lo/fas;
.super Landroid/widget/LinearLayout;
.source "SourceFile"


# instance fields
.field private a:Landroid/content/Context;

.field private b:Lo/exo;

.field private c:Landroid/widget/ListView;

.field private d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/eut;>;"
        }
    .end annotation
.end field

.field private e:Lo/faq;

.field private g:Landroid/os/Handler;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 38
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lo/fas;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 39
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 42
    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 30
    const/4 v0, 0x0

    iput-object v0, p0, Lo/fas;->b:Lo/exo;

    .line 35
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/fas;->d:Ljava/util/List;

    .line 72
    new-instance v0, Lo/fas$2;

    invoke-direct {v0, p0}, Lo/fas$2;-><init>(Lo/fas;)V

    iput-object v0, p0, Lo/fas;->g:Landroid/os/Handler;

    .line 43
    invoke-direct {p0, p1}, Lo/fas;->d(Landroid/content/Context;)V

    .line 44
    return-void
.end method

.method static synthetic a(Lo/fas;)Landroid/os/Handler;
    .locals 1

    .line 28
    iget-object v0, p0, Lo/fas;->g:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic c(Lo/fas;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 28
    iput-object p1, p0, Lo/fas;->d:Ljava/util/List;

    return-object p1
.end method

.method static synthetic c(Lo/fas;)Lo/faq;
    .locals 1

    .line 28
    iget-object v0, p0, Lo/fas;->e:Lo/faq;

    return-object v0
.end method

.method private d(Landroid/content/Context;)V
    .locals 4

    .line 54
    sget v0, Lcom/huawei/ui/main/R$layout;->fitness_data_origin_view:I

    invoke-static {p1, v0, p0}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 56
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lo/fas;->a:Landroid/content/Context;

    .line 57
    iget-object v0, p0, Lo/fas;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/exo;->d(Landroid/content/Context;)Lo/exo;

    move-result-object v0

    iput-object v0, p0, Lo/fas;->b:Lo/exo;

    .line 58
    iget-object v0, p0, Lo/fas;->b:Lo/exo;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-static {v1, v2}, Lo/cnk;->d(J)J

    move-result-wide v1

    new-instance v3, Lo/fas$1;

    invoke-direct {v3, p0}, Lo/fas$1;-><init>(Lo/fas;)V

    invoke-virtual {v0, v1, v2, v3}, Lo/exo;->c(JLo/egg;)V

    .line 67
    sget v0, Lcom/huawei/ui/main/R$id;->lv_fitness_data_origin_list:I

    invoke-static {p0, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ListView;

    iput-object v0, p0, Lo/fas;->c:Landroid/widget/ListView;

    .line 68
    new-instance v0, Lo/faq;

    iget-object v1, p0, Lo/fas;->a:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/faq;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/fas;->e:Lo/faq;

    .line 69
    iget-object v0, p0, Lo/fas;->c:Landroid/widget/ListView;

    iget-object v1, p0, Lo/fas;->e:Lo/faq;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 70
    return-void
.end method

.method static synthetic e(Lo/fas;)Ljava/util/List;
    .locals 1

    .line 28
    iget-object v0, p0, Lo/fas;->d:Ljava/util/List;

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
    iput-object p1, p0, Lo/fas;->d:Ljava/util/List;

    .line 49
    iget-object v0, p0, Lo/fas;->e:Lo/faq;

    invoke-virtual {v0, p1}, Lo/faq;->c(Ljava/util/List;)V

    .line 51
    :cond_0
    return-void
.end method
