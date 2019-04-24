.class public final Lo/ok;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/op;


# instance fields
.field private b:[Lo/op;

.field private c:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Lo/og;*>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private c(Lo/oj;)Lo/or;
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/oo;
        }
    .end annotation

    .line 168
    iget-object v0, p0, Lo/ok;->b:[Lo/op;

    if-eqz v0, :cond_0

    .line 169
    iget-object v1, p0, Lo/ok;->b:[Lo/op;

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_0

    aget-object v4, v1, v3

    .line 171
    :try_start_0
    iget-object v0, p0, Lo/ok;->c:Ljava/util/Map;

    invoke-interface {v4, p1, v0}, Lo/op;->e(Lo/oj;Ljava/util/Map;)Lo/or;
    :try_end_0
    .catch Lo/os; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 172
    :catch_0
    move-exception v5

    .line 169
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 177
    :cond_0
    invoke-static {}, Lo/oo;->a()Lo/oo;

    move-result-object v0

    throw v0
.end method


# virtual methods
.method public c()V
    .locals 5

    .line 160
    iget-object v0, p0, Lo/ok;->b:[Lo/op;

    if-eqz v0, :cond_0

    .line 161
    iget-object v1, p0, Lo/ok;->b:[Lo/op;

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_0

    aget-object v4, v1, v3

    .line 162
    invoke-interface {v4}, Lo/op;->c()V

    .line 161
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 165
    :cond_0
    return-void
.end method

.method public d(Ljava/util/Map;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<Lo/og;*>;)V"
        }
    .end annotation

    .line 96
    iput-object p1, p0, Lo/ok;->c:Ljava/util/Map;

    .line 98
    if-eqz p1, :cond_0

    sget-object v0, Lo/og;->b:Lo/og;

    invoke-interface {p1, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 100
    :goto_0
    if-nez p1, :cond_1

    const/4 v2, 0x0

    goto :goto_1

    :cond_1
    sget-object v0, Lo/og;->d:Lo/og;

    .line 101
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/util/Collection;

    .line 102
    :goto_1
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 103
    if-eqz v2, :cond_a

    .line 104
    sget-object v0, Lo/od;->m:Lo/od;

    .line 105
    invoke-interface {v2, v0}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    sget-object v0, Lo/od;->q:Lo/od;

    .line 106
    invoke-interface {v2, v0}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    sget-object v0, Lo/od;->k:Lo/od;

    .line 107
    invoke-interface {v2, v0}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    sget-object v0, Lo/od;->g:Lo/od;

    .line 108
    invoke-interface {v2, v0}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    sget-object v0, Lo/od;->c:Lo/od;

    .line 109
    invoke-interface {v2, v0}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    sget-object v0, Lo/od;->d:Lo/od;

    .line 110
    invoke-interface {v2, v0}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    sget-object v0, Lo/od;->e:Lo/od;

    .line 111
    invoke-interface {v2, v0}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    sget-object v0, Lo/od;->b:Lo/od;

    .line 112
    invoke-interface {v2, v0}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    sget-object v0, Lo/od;->f:Lo/od;

    .line 113
    invoke-interface {v2, v0}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    sget-object v0, Lo/od;->o:Lo/od;

    .line 114
    invoke-interface {v2, v0}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    sget-object v0, Lo/od;->l:Lo/od;

    .line 115
    invoke-interface {v2, v0}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    :cond_2
    const/4 v4, 0x1

    goto :goto_2

    :cond_3
    const/4 v4, 0x0

    .line 117
    :goto_2
    if-eqz v4, :cond_4

    if-nez v1, :cond_4

    .line 118
    new-instance v0, Lo/ry;

    invoke-direct {v0, p1}, Lo/ry;-><init>(Ljava/util/Map;)V

    invoke-interface {v3, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 120
    :cond_4
    sget-object v0, Lo/od;->p:Lo/od;

    invoke-interface {v2, v0}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 121
    new-instance v0, Lo/ua;

    invoke-direct {v0}, Lo/ua;-><init>()V

    invoke-interface {v3, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 123
    :cond_5
    sget-object v0, Lo/od;->h:Lo/od;

    invoke-interface {v2, v0}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 124
    new-instance v0, Lo/rc;

    invoke-direct {v0}, Lo/rc;-><init>()V

    invoke-interface {v3, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 126
    :cond_6
    sget-object v0, Lo/od;->a:Lo/od;

    invoke-interface {v2, v0}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 127
    new-instance v0, Lo/ow;

    invoke-direct {v0}, Lo/ow;-><init>()V

    invoke-interface {v3, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 129
    :cond_7
    sget-object v0, Lo/od;->n:Lo/od;

    invoke-interface {v2, v0}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 130
    new-instance v0, Lo/tk;

    invoke-direct {v0}, Lo/tk;-><init>()V

    invoke-interface {v3, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 132
    :cond_8
    sget-object v0, Lo/od;->i:Lo/od;

    invoke-interface {v2, v0}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 133
    new-instance v0, Lo/rm;

    invoke-direct {v0}, Lo/rm;-><init>()V

    invoke-interface {v3, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 136
    :cond_9
    if-eqz v4, :cond_a

    if-eqz v1, :cond_a

    .line 137
    new-instance v0, Lo/ry;

    invoke-direct {v0, p1}, Lo/ry;-><init>(Ljava/util/Map;)V

    invoke-interface {v3, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 140
    :cond_a
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_c

    .line 141
    if-nez v1, :cond_b

    .line 142
    new-instance v0, Lo/ry;

    invoke-direct {v0, p1}, Lo/ry;-><init>(Ljava/util/Map;)V

    invoke-interface {v3, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 145
    :cond_b
    new-instance v0, Lo/ua;

    invoke-direct {v0}, Lo/ua;-><init>()V

    invoke-interface {v3, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 146
    new-instance v0, Lo/rc;

    invoke-direct {v0}, Lo/rc;-><init>()V

    invoke-interface {v3, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 147
    new-instance v0, Lo/ow;

    invoke-direct {v0}, Lo/ow;-><init>()V

    invoke-interface {v3, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 148
    new-instance v0, Lo/tk;

    invoke-direct {v0}, Lo/tk;-><init>()V

    invoke-interface {v3, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 149
    new-instance v0, Lo/rm;

    invoke-direct {v0}, Lo/rm;-><init>()V

    invoke-interface {v3, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 151
    if-eqz v1, :cond_c

    .line 152
    new-instance v0, Lo/ry;

    invoke-direct {v0, p1}, Lo/ry;-><init>(Ljava/util/Map;)V

    invoke-interface {v3, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 155
    :cond_c
    invoke-interface {v3}, Ljava/util/Collection;->size()I

    move-result v0

    new-array v0, v0, [Lo/op;

    invoke-interface {v3, v0}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lo/op;

    iput-object v0, p0, Lo/ok;->b:[Lo/op;

    .line 156
    return-void
.end method

.method public e(Lo/oj;)Lo/or;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/oo;
        }
    .end annotation

    .line 82
    iget-object v0, p0, Lo/ok;->b:[Lo/op;

    if-nez v0, :cond_0

    .line 83
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/ok;->d(Ljava/util/Map;)V

    .line 85
    :cond_0
    invoke-direct {p0, p1}, Lo/ok;->c(Lo/oj;)Lo/or;

    move-result-object v0

    return-object v0
.end method

.method public e(Lo/oj;Ljava/util/Map;)Lo/or;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/oj;Ljava/util/Map<Lo/og;*>;)Lo/or;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/oo;
        }
    .end annotation

    .line 68
    invoke-virtual {p0, p2}, Lo/ok;->d(Ljava/util/Map;)V

    .line 69
    invoke-direct {p0, p1}, Lo/ok;->c(Lo/oj;)Lo/or;

    move-result-object v0

    return-object v0
.end method
