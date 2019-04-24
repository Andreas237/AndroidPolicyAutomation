.class public Lo/bkc;
.super Lo/bfq;
.source "SourceFile"


# instance fields
.field private e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/health/sns/model/assistant/AssistantSearchBean;>;"
        }
    .end annotation
.end field

.field private g:I

.field private k:Landroid/os/Handler;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 45
    invoke-direct {p0, p1}, Lo/bfq;-><init>(Landroid/content/Context;)V

    .line 29
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/bkc;->e:Ljava/util/List;

    .line 46
    return-void
.end method

.method private b()V
    .locals 1

    .line 120
    invoke-virtual {p0}, Lo/bkc;->a()Lo/bfq$c;

    move-result-object v0

    .line 121
    if-eqz v0, :cond_0

    .line 123
    invoke-interface {v0}, Lo/bfq$c;->b()V

    .line 125
    :cond_0
    return-void
.end method


# virtual methods
.method public a(Ljava/util/List;ILandroid/os/Handler;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/sns/model/assistant/AssistantSearchBean;>;ILandroid/os/Handler;)V"
        }
    .end annotation

    .line 86
    iput-object p1, p0, Lo/bkc;->e:Ljava/util/List;

    .line 87
    iput-object p3, p0, Lo/bkc;->k:Landroid/os/Handler;

    .line 88
    iput p2, p0, Lo/bkc;->g:I

    .line 89
    invoke-virtual {p0}, Lo/bkc;->d()V

    .line 90
    return-void
.end method

.method public b(Ljava/util/List;Landroid/os/Handler;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/sns/model/assistant/AssistantSearchBean;>;Landroid/os/Handler;)V"
        }
    .end annotation

    .line 100
    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-eqz v0, :cond_0

    .line 102
    iget-object v0, p0, Lo/bkc;->e:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 104
    :cond_0
    iput-object p2, p0, Lo/bkc;->k:Landroid/os/Handler;

    .line 105
    invoke-virtual {p0}, Lo/bkc;->d()V

    .line 106
    return-void
.end method

.method public c()V
    .locals 1

    .line 113
    iget-object v0, p0, Lo/bkc;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 114
    invoke-direct {p0}, Lo/bkc;->b()V

    .line 115
    return-void
.end method

.method public d()V
    .locals 8

    .line 51
    iget-object v0, p0, Lo/bkc;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 53
    iget-object v0, p0, Lo/bkc;->e:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/bkc;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 56
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 57
    new-instance v7, Lcom/huawei/health/sns/model/user/User;

    invoke-direct {v7}, Lcom/huawei/health/sns/model/user/User;-><init>()V

    .line 58
    iget-object v0, p0, Lo/bkc;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$plurals;->sns_search_assist_result:I

    iget v2, p0, Lo/bkc;->g:I

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    iget v4, p0, Lo/bkc;->g:I

    .line 59
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    .line 58
    invoke-virtual {v0, v1, v2, v3}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/huawei/health/sns/model/user/User;->setContactName(Ljava/lang/String;)V

    .line 60
    const/16 v0, 0x15

    invoke-virtual {v7, v0}, Lcom/huawei/health/sns/model/user/User;->setCardType(I)V

    .line 61
    invoke-interface {v6, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 62
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    const/16 v1, 0x15

    const/16 v2, 0x15

    invoke-virtual {p0, v1, v2, v0, v6}, Lo/bkc;->e(IIILjava/util/List;)Lo/bfq$e;

    .line 63
    iget-object v0, p0, Lo/bkc;->e:Ljava/util/List;

    .line 64
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    iget-object v1, p0, Lo/bkc;->e:Ljava/util/List;

    .line 63
    const/16 v2, 0x1f

    const/16 v3, 0x34

    invoke-virtual {p0, v2, v3, v0, v1}, Lo/bkc;->e(IIILjava/util/List;)Lo/bfq$e;

    .line 65
    invoke-direct {p0}, Lo/bkc;->b()V

    .line 66
    goto :goto_0

    .line 69
    :cond_0
    iget-object v0, p0, Lo/bkc;->k:Landroid/os/Handler;

    if-eqz v0, :cond_1

    .line 71
    iget-object v0, p0, Lo/bkc;->k:Landroid/os/Handler;

    const/16 v1, 0x302

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 73
    :cond_1
    invoke-direct {p0}, Lo/bkc;->b()V

    .line 75
    :goto_0
    return-void
.end method
