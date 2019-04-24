.class public final Lo/sa;
.super Lo/rw;
.source "SourceFile"


# instance fields
.field private final c:[Lo/sf;


# direct methods
.method public constructor <init>(Ljava/util/Map;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<Lo/og;*>;)V"
        }
    .end annotation

    .line 42
    invoke-direct {p0}, Lo/rw;-><init>()V

    .line 44
    if-nez p1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    sget-object v0, Lo/og;->d:Lo/og;

    .line 45
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ljava/util/Collection;

    .line 46
    :goto_0
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 47
    if-eqz v1, :cond_4

    .line 48
    sget-object v0, Lo/od;->k:Lo/od;

    invoke-interface {v1, v0}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 49
    new-instance v0, Lo/rv;

    invoke-direct {v0}, Lo/rv;-><init>()V

    invoke-interface {v2, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 50
    :cond_1
    sget-object v0, Lo/od;->m:Lo/od;

    invoke-interface {v1, v0}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 51
    new-instance v0, Lo/sc;

    invoke-direct {v0}, Lo/sc;-><init>()V

    invoke-interface {v2, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 53
    :cond_2
    :goto_1
    sget-object v0, Lo/od;->g:Lo/od;

    invoke-interface {v1, v0}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 54
    new-instance v0, Lo/rr;

    invoke-direct {v0}, Lo/rr;-><init>()V

    invoke-interface {v2, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 56
    :cond_3
    sget-object v0, Lo/od;->q:Lo/od;

    invoke-interface {v1, v0}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 57
    new-instance v0, Lo/sk;

    invoke-direct {v0}, Lo/sk;-><init>()V

    invoke-interface {v2, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 60
    :cond_4
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 61
    new-instance v0, Lo/rv;

    invoke-direct {v0}, Lo/rv;-><init>()V

    invoke-interface {v2, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 63
    new-instance v0, Lo/rr;

    invoke-direct {v0}, Lo/rr;-><init>()V

    invoke-interface {v2, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 64
    new-instance v0, Lo/sk;

    invoke-direct {v0}, Lo/sk;-><init>()V

    invoke-interface {v2, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 66
    :cond_5
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    move-result v0

    new-array v0, v0, [Lo/sf;

    invoke-interface {v2, v0}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lo/sf;

    iput-object v0, p0, Lo/sa;->c:[Lo/sf;

    .line 67
    return-void
.end method


# virtual methods
.method public a(ILo/qm;Ljava/util/Map;)Lo/or;
    .locals 14
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

    .line 74
    invoke-static/range {p2 .. p2}, Lo/sf;->a(Lo/qm;)[I

    move-result-object v4

    .line 75
    iget-object v5, p0, Lo/sa;->c:[Lo/sf;

    array-length v6, v5

    const/4 v7, 0x0

    :goto_0
    if-ge v7, v6, :cond_5

    aget-object v8, v5, v7

    .line 78
    move-object/from16 v0, p2

    move-object/from16 v1, p3

    :try_start_0
    invoke-virtual {v8, p1, v0, v4, v1}, Lo/sf;->b(ILo/qm;[ILjava/util/Map;)Lo/or;
    :try_end_0
    .catch Lo/os; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v9

    .line 81
    goto :goto_1

    .line 79
    :catch_0
    move-exception v10

    .line 80
    goto/16 :goto_5

    .line 94
    .line 95
    :goto_1
    invoke-virtual {v9}, Lo/or;->d()Lo/od;

    move-result-object v0

    sget-object v1, Lo/od;->k:Lo/od;

    if-ne v0, v1, :cond_0

    .line 96
    invoke-virtual {v9}, Lo/or;->e()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v1, 0x30

    if-ne v0, v1, :cond_0

    const/4 v10, 0x1

    goto :goto_2

    :cond_0
    const/4 v10, 0x0

    .line 98
    :goto_2
    if-nez p3, :cond_1

    const/4 v11, 0x0

    goto :goto_3

    :cond_1
    sget-object v0, Lo/og;->d:Lo/og;

    .line 99
    move-object/from16 v1, p3

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Ljava/util/Collection;

    .line 100
    :goto_3
    if-eqz v11, :cond_2

    sget-object v0, Lo/od;->m:Lo/od;

    invoke-interface {v11, v0}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    :cond_2
    const/4 v12, 0x1

    goto :goto_4

    :cond_3
    const/4 v12, 0x0

    .line 102
    :goto_4
    if-eqz v10, :cond_4

    if-eqz v12, :cond_4

    .line 104
    new-instance v13, Lo/or;

    invoke-virtual {v9}, Lo/or;->e()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    .line 105
    invoke-virtual {v9}, Lo/or;->b()[B

    move-result-object v1

    .line 106
    invoke-virtual {v9}, Lo/or;->c()[Lo/ou;

    move-result-object v2

    sget-object v3, Lo/od;->m:Lo/od;

    invoke-direct {v13, v0, v1, v2, v3}, Lo/or;-><init>(Ljava/lang/String;[B[Lo/ou;Lo/od;)V

    .line 108
    invoke-virtual {v9}, Lo/or;->a()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {v13, v0}, Lo/or;->a(Ljava/util/Map;)V

    .line 109
    return-object v13

    .line 111
    :cond_4
    return-object v9

    .line 75
    :goto_5
    add-int/lit8 v7, v7, 0x1

    goto/16 :goto_0

    .line 114
    :cond_5
    invoke-static {}, Lo/oo;->a()Lo/oo;

    move-result-object v0

    throw v0
.end method

.method public c()V
    .locals 5

    .line 119
    iget-object v1, p0, Lo/sa;->c:[Lo/sf;

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_0

    aget-object v4, v1, v3

    .line 120
    invoke-interface {v4}, Lo/op;->c()V

    .line 119
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 122
    :cond_0
    return-void
.end method
