.class public Lo/bgt;
.super Lo/bfq;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 30
    invoke-direct {p0, p1}, Lo/bfq;-><init>(Landroid/content/Context;)V

    .line 31
    return-void
.end method

.method private c()V
    .locals 1

    .line 58
    invoke-virtual {p0}, Lo/bgt;->a()Lo/bfq$c;

    move-result-object v0

    .line 59
    if-eqz v0, :cond_0

    .line 61
    invoke-interface {v0}, Lo/bfq$c;->b()V

    .line 63
    :cond_0
    return-void
.end method


# virtual methods
.method public e(Ljava/util/ArrayList;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lcom/huawei/health/sns/model/group/GroupMember;>;)V"
        }
    .end annotation

    .line 40
    if-nez p1, :cond_0

    .line 42
    return-void

    .line 44
    :cond_0
    iget-object v0, p0, Lo/bgt;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 45
    const/4 v2, 0x0

    .line 46
    const/4 v3, 0x0

    :goto_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v3, v0, :cond_1

    .line 48
    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/bfh;

    .line 49
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 50
    invoke-interface {v2, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 51
    invoke-virtual {v4}, Lo/bfh;->getCardType()I

    move-result v0

    const/4 v1, 0x1

    invoke-virtual {p0, v3, v0, v1, v2}, Lo/bgt;->e(IIILjava/util/List;)Lo/bfq$e;

    .line 46
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 53
    :cond_1
    invoke-direct {p0}, Lo/bgt;->c()V

    .line 54
    return-void
.end method

.method public e(Lo/bfh;)V
    .locals 4

    .line 72
    if-nez p1, :cond_0

    .line 74
    return-void

    .line 76
    :cond_0
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 78
    iget-object v0, p0, Lo/bgt;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    .line 79
    invoke-interface {v2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 80
    invoke-virtual {p1}, Lo/bfh;->getCardType()I

    move-result v0

    const/4 v1, 0x1

    invoke-virtual {p0, v3, v0, v1, v2}, Lo/bgt;->e(IIILjava/util/List;)Lo/bfq$e;

    .line 82
    invoke-direct {p0}, Lo/bgt;->c()V

    .line 83
    return-void
.end method
