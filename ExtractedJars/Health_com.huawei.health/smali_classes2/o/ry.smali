.class public final Lo/ry;
.super Lo/rw;
.source "SourceFile"


# instance fields
.field private final e:[Lo/rw;


# direct methods
.method public constructor <init>(Ljava/util/Map;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<Lo/og;*>;)V"
        }
    .end annotation

    .line 41
    invoke-direct {p0}, Lo/rw;-><init>()V

    .line 43
    if-nez p1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    sget-object v0, Lo/og;->d:Lo/og;

    .line 44
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ljava/util/Collection;

    .line 45
    :goto_0
    if-eqz p1, :cond_1

    sget-object v0, Lo/og;->k:Lo/og;

    .line 46
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_1

    const/4 v2, 0x1

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    .line 47
    :goto_1
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 48
    if-eqz v1, :cond_a

    .line 49
    sget-object v0, Lo/od;->k:Lo/od;

    invoke-interface {v1, v0}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    sget-object v0, Lo/od;->m:Lo/od;

    .line 50
    invoke-interface {v1, v0}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    sget-object v0, Lo/od;->g:Lo/od;

    .line 51
    invoke-interface {v1, v0}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    sget-object v0, Lo/od;->q:Lo/od;

    .line 52
    invoke-interface {v1, v0}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 53
    :cond_2
    new-instance v0, Lo/sa;

    invoke-direct {v0, p1}, Lo/sa;-><init>(Ljava/util/Map;)V

    invoke-interface {v3, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 55
    :cond_3
    sget-object v0, Lo/od;->d:Lo/od;

    invoke-interface {v1, v0}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 56
    new-instance v0, Lo/rt;

    invoke-direct {v0, v2}, Lo/rt;-><init>(Z)V

    invoke-interface {v3, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 58
    :cond_4
    sget-object v0, Lo/od;->e:Lo/od;

    invoke-interface {v1, v0}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 59
    new-instance v0, Lo/rs;

    invoke-direct {v0}, Lo/rs;-><init>()V

    invoke-interface {v3, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 61
    :cond_5
    sget-object v0, Lo/od;->b:Lo/od;

    invoke-interface {v1, v0}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 62
    new-instance v0, Lo/ru;

    invoke-direct {v0}, Lo/ru;-><init>()V

    invoke-interface {v3, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 64
    :cond_6
    sget-object v0, Lo/od;->f:Lo/od;

    invoke-interface {v1, v0}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 65
    new-instance v0, Lo/rx;

    invoke-direct {v0}, Lo/rx;-><init>()V

    invoke-interface {v3, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 67
    :cond_7
    sget-object v0, Lo/od;->c:Lo/od;

    invoke-interface {v1, v0}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 68
    new-instance v0, Lo/rp;

    invoke-direct {v0}, Lo/rp;-><init>()V

    invoke-interface {v3, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 70
    :cond_8
    sget-object v0, Lo/od;->o:Lo/od;

    invoke-interface {v1, v0}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 71
    new-instance v0, Lo/sm;

    invoke-direct {v0}, Lo/sm;-><init>()V

    invoke-interface {v3, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 73
    :cond_9
    sget-object v0, Lo/od;->l:Lo/od;

    invoke-interface {v1, v0}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 74
    new-instance v0, Lo/st;

    invoke-direct {v0}, Lo/st;-><init>()V

    invoke-interface {v3, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 77
    :cond_a
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_b

    .line 78
    new-instance v0, Lo/sa;

    invoke-direct {v0, p1}, Lo/sa;-><init>(Ljava/util/Map;)V

    invoke-interface {v3, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 79
    new-instance v0, Lo/rt;

    invoke-direct {v0}, Lo/rt;-><init>()V

    invoke-interface {v3, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 80
    new-instance v0, Lo/rp;

    invoke-direct {v0}, Lo/rp;-><init>()V

    invoke-interface {v3, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 81
    new-instance v0, Lo/rs;

    invoke-direct {v0}, Lo/rs;-><init>()V

    invoke-interface {v3, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 82
    new-instance v0, Lo/ru;

    invoke-direct {v0}, Lo/ru;-><init>()V

    invoke-interface {v3, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 83
    new-instance v0, Lo/rx;

    invoke-direct {v0}, Lo/rx;-><init>()V

    invoke-interface {v3, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 84
    new-instance v0, Lo/sm;

    invoke-direct {v0}, Lo/sm;-><init>()V

    invoke-interface {v3, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 85
    new-instance v0, Lo/st;

    invoke-direct {v0}, Lo/st;-><init>()V

    invoke-interface {v3, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 87
    :cond_b
    invoke-interface {v3}, Ljava/util/Collection;->size()I

    move-result v0

    new-array v0, v0, [Lo/rw;

    invoke-interface {v3, v0}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lo/rw;

    iput-object v0, p0, Lo/ry;->e:[Lo/rw;

    .line 88
    return-void
.end method


# virtual methods
.method public a(ILo/qm;Ljava/util/Map;)Lo/or;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ILo/qm;Ljava/util/Map<Lo/og;*>;)Lo/or;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/oo;
        }
    .end annotation

    .line 94
    iget-object v1, p0, Lo/ry;->e:[Lo/rw;

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_0

    aget-object v4, v1, v3

    .line 96
    :try_start_0
    invoke-virtual {v4, p1, p2, p3}, Lo/rw;->a(ILo/qm;Ljava/util/Map;)Lo/or;
    :try_end_0
    .catch Lo/os; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 97
    :catch_0
    move-exception v5

    .line 94
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 102
    :cond_0
    invoke-static {}, Lo/oo;->a()Lo/oo;

    move-result-object v0

    throw v0
.end method

.method public c()V
    .locals 5

    .line 107
    iget-object v1, p0, Lo/ry;->e:[Lo/rw;

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_0

    aget-object v4, v1, v3

    .line 108
    invoke-interface {v4}, Lo/op;->c()V

    .line 107
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 110
    :cond_0
    return-void
.end method
