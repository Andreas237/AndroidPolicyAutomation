.class public Lo/bgl;
.super Lo/bfq;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 29
    invoke-direct {p0, p1}, Lo/bfq;-><init>(Landroid/content/Context;)V

    .line 30
    return-void
.end method


# virtual methods
.method public e(Ljava/util/ArrayList;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lo/bfh;>;)V"
        }
    .end annotation

    .line 39
    if-nez p1, :cond_0

    .line 41
    return-void

    .line 43
    :cond_0
    iget-object v0, p0, Lo/bgl;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 44
    const/4 v2, 0x0

    .line 45
    const/4 v3, 0x0

    :goto_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v3, v0, :cond_1

    .line 47
    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/bfh;

    .line 48
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 49
    invoke-interface {v2, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 50
    invoke-virtual {v4}, Lo/bfh;->getCardType()I

    move-result v0

    const/4 v1, 0x1

    invoke-virtual {p0, v3, v0, v1, v2}, Lo/bgl;->e(IIILjava/util/List;)Lo/bfq$e;

    .line 45
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 53
    :cond_1
    invoke-virtual {p0}, Lo/bgl;->a()Lo/bfq$c;

    move-result-object v0

    invoke-interface {v0}, Lo/bfq$c;->b()V

    .line 54
    return-void
.end method
