.class public final Lo/flr;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Ljava/lang/String;

.field private b:Z

.field private c:Ljava/lang/Integer;

.field private d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<[B>;"
        }
    .end annotation
.end field

.field private e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<[B>;"
        }
    .end annotation
.end field

.field private f:Ljava/lang/Integer;

.field private g:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field private h:Ljava/lang/Long;

.field private i:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field private k:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field private l:Ljava/lang/String;

.field private m:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field private n:Lo/fll;

.field private o:Ljava/lang/Integer;

.field private p:Ljava/lang/String;

.field private q:Lo/fll;

.field private r:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/flt;>;"
        }
    .end annotation
.end field

.field private s:Ljava/lang/Integer;

.field private t:Ljava/lang/Integer;

.field private u:Ljava/lang/Integer;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 87
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 88
    const/4 v0, 0x0

    iput-object v0, p0, Lo/flr;->e:Ljava/util/List;

    .line 89
    const/4 v0, 0x0

    iput-object v0, p0, Lo/flr;->a:Ljava/lang/String;

    .line 90
    const/4 v0, 0x0

    iput-object v0, p0, Lo/flr;->d:Ljava/util/List;

    .line 91
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/flr;->b:Z

    .line 92
    const/4 v0, 0x0

    iput-object v0, p0, Lo/flr;->c:Ljava/lang/Integer;

    .line 93
    const/4 v0, 0x0

    iput-object v0, p0, Lo/flr;->k:Ljava/util/List;

    .line 94
    const/4 v0, 0x0

    iput-object v0, p0, Lo/flr;->i:Ljava/util/List;

    .line 95
    const/4 v0, 0x0

    iput-object v0, p0, Lo/flr;->f:Ljava/lang/Integer;

    .line 96
    const/4 v0, 0x0

    iput-object v0, p0, Lo/flr;->h:Ljava/lang/Long;

    .line 97
    const/4 v0, 0x0

    iput-object v0, p0, Lo/flr;->g:Ljava/util/List;

    .line 98
    const/4 v0, 0x0

    iput-object v0, p0, Lo/flr;->o:Ljava/lang/Integer;

    .line 99
    const/4 v0, 0x0

    iput-object v0, p0, Lo/flr;->m:Ljava/util/List;

    .line 100
    const/4 v0, 0x0

    iput-object v0, p0, Lo/flr;->p:Ljava/lang/String;

    .line 101
    const/4 v0, 0x0

    iput-object v0, p0, Lo/flr;->l:Ljava/lang/String;

    .line 102
    const/4 v0, 0x0

    iput-object v0, p0, Lo/flr;->n:Lo/fll;

    .line 103
    const/4 v0, 0x0

    iput-object v0, p0, Lo/flr;->q:Lo/fll;

    .line 104
    const/4 v0, 0x0

    iput-object v0, p0, Lo/flr;->u:Ljava/lang/Integer;

    .line 105
    const/4 v0, 0x0

    iput-object v0, p0, Lo/flr;->t:Ljava/lang/Integer;

    .line 106
    const/4 v0, 0x0

    iput-object v0, p0, Lo/flr;->s:Ljava/lang/Integer;

    .line 108
    const/4 v0, 0x0

    iput-object v0, p0, Lo/flr;->r:Ljava/util/List;

    .line 109
    return-void
.end method

.method public constructor <init>(Lo/flr;)V
    .locals 2

    .line 143
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 144
    if-nez p1, :cond_0

    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 145
    :cond_0
    iget-object v0, p1, Lo/flr;->e:Ljava/util/List;

    invoke-direct {p0, v0}, Lo/flr;->c(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lo/flr;->e:Ljava/util/List;

    .line 146
    iget-object v0, p1, Lo/flr;->a:Ljava/lang/String;

    iput-object v0, p0, Lo/flr;->a:Ljava/lang/String;

    .line 147
    iget-object v0, p1, Lo/flr;->d:Ljava/util/List;

    invoke-direct {p0, v0}, Lo/flr;->c(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lo/flr;->d:Ljava/util/List;

    .line 148
    iget-boolean v0, p1, Lo/flr;->b:Z

    iput-boolean v0, p0, Lo/flr;->b:Z

    .line 149
    iget-object v0, p1, Lo/flr;->c:Ljava/lang/Integer;

    iput-object v0, p0, Lo/flr;->c:Ljava/lang/Integer;

    .line 150
    iget-object v0, p1, Lo/flr;->k:Ljava/util/List;

    invoke-direct {p0, v0}, Lo/flr;->c(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lo/flr;->k:Ljava/util/List;

    .line 151
    iget-object v0, p1, Lo/flr;->i:Ljava/util/List;

    invoke-direct {p0, v0}, Lo/flr;->c(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lo/flr;->i:Ljava/util/List;

    .line 152
    iget-object v0, p1, Lo/flr;->f:Ljava/lang/Integer;

    iput-object v0, p0, Lo/flr;->f:Ljava/lang/Integer;

    .line 153
    iget-object v0, p1, Lo/flr;->h:Ljava/lang/Long;

    iput-object v0, p0, Lo/flr;->h:Ljava/lang/Long;

    .line 154
    iget-object v0, p1, Lo/flr;->g:Ljava/util/List;

    invoke-direct {p0, v0}, Lo/flr;->c(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lo/flr;->g:Ljava/util/List;

    .line 155
    iget-object v0, p1, Lo/flr;->o:Ljava/lang/Integer;

    iput-object v0, p0, Lo/flr;->o:Ljava/lang/Integer;

    .line 156
    iget-object v0, p1, Lo/flr;->m:Ljava/util/List;

    invoke-direct {p0, v0}, Lo/flr;->c(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lo/flr;->m:Ljava/util/List;

    .line 157
    iget-object v0, p1, Lo/flr;->p:Ljava/lang/String;

    iput-object v0, p0, Lo/flr;->p:Ljava/lang/String;

    .line 158
    iget-object v0, p1, Lo/flr;->l:Ljava/lang/String;

    iput-object v0, p0, Lo/flr;->l:Ljava/lang/String;

    .line 160
    iget-object v0, p1, Lo/flr;->n:Lo/fll;

    if-eqz v0, :cond_1

    .line 161
    new-instance v0, Lo/fll;

    iget-object v1, p1, Lo/flr;->n:Lo/fll;

    invoke-direct {v0, v1}, Lo/fll;-><init>(Lo/fll;)V

    iput-object v0, p0, Lo/flr;->n:Lo/fll;

    .line 162
    :cond_1
    iget-object v0, p1, Lo/flr;->q:Lo/fll;

    if-eqz v0, :cond_2

    .line 163
    new-instance v0, Lo/fll;

    iget-object v1, p1, Lo/flr;->q:Lo/fll;

    invoke-direct {v0, v1}, Lo/fll;-><init>(Lo/fll;)V

    iput-object v0, p0, Lo/flr;->q:Lo/fll;

    .line 165
    :cond_2
    iget-object v0, p1, Lo/flr;->s:Ljava/lang/Integer;

    iput-object v0, p0, Lo/flr;->s:Ljava/lang/Integer;

    .line 167
    iget-object v0, p1, Lo/flr;->r:Ljava/util/List;

    invoke-direct {p0, v0}, Lo/flr;->c(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lo/flr;->r:Ljava/util/List;

    .line 168
    return-void
.end method

.method private R()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lo/flt;>;"
        }
    .end annotation

    .line 1284
    move-object v1, p0

    monitor-enter v1

    .line 1285
    :try_start_0
    iget-object v0, p0, Lo/flr;->r:Ljava/util/List;

    if-nez v0, :cond_0

    .line 1286
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lo/flr;->r:Ljava/util/List;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1287
    :cond_0
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2

    .line 1288
    :goto_0
    iget-object v0, p0, Lo/flr;->r:Ljava/util/List;

    return-object v0
.end method

.method private c(Ljava/util/List;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:Ljava/lang/Object;>(Ljava/util/List<TT;>;)Ljava/util/List<TT;>;"
        }
    .end annotation

    .line 177
    if-nez p1, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 178
    :cond_0
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0, p1}, Ljava/util/LinkedList;-><init>(Ljava/util/Collection;)V

    return-object v0
.end method

.method public static k(I)Z
    .locals 1

    .line 1271
    if-ltz p0, :cond_0

    const v0, 0xffffff

    if-gt p0, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method


# virtual methods
.method public A()Z
    .locals 1

    .line 995
    iget-object v0, p0, Lo/flr;->l:Ljava/lang/String;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public B()Ljava/lang/String;
    .locals 1

    .line 987
    iget-object v0, p0, Lo/flr;->l:Ljava/lang/String;

    return-object v0
.end method

.method public C()Lo/flr;
    .locals 1

    .line 1080
    const/4 v0, 0x0

    iput-object v0, p0, Lo/flr;->n:Lo/fll;

    .line 1081
    return-object p0
.end method

.method public D()Z
    .locals 1

    .line 1036
    iget-object v0, p0, Lo/flr;->n:Lo/fll;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public E()Z
    .locals 1

    .line 1097
    iget-object v0, p0, Lo/flr;->q:Lo/fll;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public F()Lo/flr;
    .locals 1

    .line 1142
    const/4 v0, 0x0

    iput-object v0, p0, Lo/flr;->q:Lo/fll;

    .line 1143
    return-object p0
.end method

.method public G()Ljava/lang/Integer;
    .locals 1

    .line 1151
    iget-object v0, p0, Lo/flr;->u:Ljava/lang/Integer;

    return-object v0
.end method

.method public H()Z
    .locals 1

    .line 1159
    iget-object v0, p0, Lo/flr;->u:Ljava/lang/Integer;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public I()Lo/fll;
    .locals 1

    .line 1089
    iget-object v0, p0, Lo/flr;->q:Lo/fll;

    return-object v0
.end method

.method public J()Lo/flr;
    .locals 1

    .line 1260
    const/4 v0, 0x0

    iput-object v0, p0, Lo/flr;->s:Ljava/lang/Integer;

    .line 1261
    return-object p0
.end method

.method public K()Z
    .locals 1

    .line 1196
    iget-object v0, p0, Lo/flr;->t:Ljava/lang/Integer;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public L()Z
    .locals 1

    .line 1233
    iget-object v0, p0, Lo/flr;->s:Ljava/lang/Integer;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public M()Ljava/lang/Integer;
    .locals 1

    .line 1188
    iget-object v0, p0, Lo/flr;->t:Ljava/lang/Integer;

    return-object v0
.end method

.method public N()Ljava/lang/Integer;
    .locals 1

    .line 1225
    iget-object v0, p0, Lo/flr;->s:Ljava/lang/Integer;

    return-object v0
.end method

.method public S()Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lo/flt;>;"
        }
    .end annotation

    .line 1313
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 1315
    iget-object v0, p0, Lo/flr;->e:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/flr;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, [B

    .line 1316
    new-instance v0, Lo/flt;

    const/4 v1, 0x1

    invoke-direct {v0, v1, v6}, Lo/flt;-><init>(I[B)V

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 1317
    :cond_0
    invoke-virtual {p0}, Lo/flr;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1318
    new-instance v0, Lo/flt;

    invoke-virtual {p0}, Lo/flr;->a()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x3

    invoke-direct {v0, v2, v1}, Lo/flt;-><init>(ILjava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1319
    :cond_1
    iget-object v0, p0, Lo/flr;->d:Ljava/util/List;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lo/flr;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, [B

    .line 1320
    new-instance v0, Lo/flt;

    const/4 v1, 0x4

    invoke-direct {v0, v1, v6}, Lo/flt;-><init>(I[B)V

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 1321
    :cond_2
    invoke-virtual {p0}, Lo/flr;->k()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 1322
    new-instance v0, Lo/flt;

    const/4 v1, 0x5

    invoke-direct {v0, v1}, Lo/flt;-><init>(I)V

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1323
    :cond_3
    invoke-virtual {p0}, Lo/flr;->h()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 1324
    new-instance v0, Lo/flt;

    invoke-virtual {p0}, Lo/flr;->g()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const/4 v2, 0x7

    invoke-direct {v0, v2, v1}, Lo/flt;-><init>(II)V

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1325
    :cond_4
    iget-object v0, p0, Lo/flr;->k:Ljava/util/List;

    if-eqz v0, :cond_5

    iget-object v0, p0, Lo/flr;->k:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/lang/String;

    .line 1326
    new-instance v0, Lo/flt;

    const/16 v1, 0x8

    invoke-direct {v0, v1, v6}, Lo/flt;-><init>(ILjava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 1327
    :cond_5
    iget-object v0, p0, Lo/flr;->i:Ljava/util/List;

    if-eqz v0, :cond_6

    iget-object v0, p0, Lo/flr;->i:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_3
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/lang/String;

    .line 1328
    new-instance v0, Lo/flt;

    const/16 v1, 0xb

    invoke-direct {v0, v1, v6}, Lo/flt;-><init>(ILjava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    .line 1329
    :cond_6
    invoke-virtual {p0}, Lo/flr;->n()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 1330
    new-instance v0, Lo/flt;

    invoke-virtual {p0}, Lo/flr;->l()I

    move-result v1

    const/16 v2, 0xc

    invoke-direct {v0, v2, v1}, Lo/flt;-><init>(II)V

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1331
    :cond_7
    invoke-virtual {p0}, Lo/flr;->t()Z

    move-result v0

    if-eqz v0, :cond_8

    .line 1332
    new-instance v0, Lo/flt;

    invoke-virtual {p0}, Lo/flr;->o()Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    const/16 v3, 0xe

    invoke-direct {v0, v3, v1, v2}, Lo/flt;-><init>(IJ)V

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1333
    :cond_8
    iget-object v0, p0, Lo/flr;->g:Ljava/util/List;

    if-eqz v0, :cond_9

    iget-object v0, p0, Lo/flr;->g:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_4
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/lang/String;

    .line 1334
    new-instance v0, Lo/flt;

    const/16 v1, 0xf

    invoke-direct {v0, v1, v6}, Lo/flt;-><init>(ILjava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_4

    .line 1335
    :cond_9
    invoke-virtual {p0}, Lo/flr;->y()Z

    move-result v0

    if-eqz v0, :cond_a

    .line 1336
    new-instance v0, Lo/flt;

    invoke-virtual {p0}, Lo/flr;->w()I

    move-result v1

    const/16 v2, 0x11

    invoke-direct {v0, v2, v1}, Lo/flt;-><init>(II)V

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1337
    :cond_a
    iget-object v0, p0, Lo/flr;->m:Ljava/util/List;

    if-eqz v0, :cond_b

    iget-object v0, p0, Lo/flr;->m:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_5
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/lang/String;

    .line 1338
    new-instance v0, Lo/flt;

    const/16 v1, 0x14

    invoke-direct {v0, v1, v6}, Lo/flt;-><init>(ILjava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_5

    .line 1339
    :cond_b
    invoke-virtual {p0}, Lo/flr;->x()Z

    move-result v0

    if-eqz v0, :cond_c

    .line 1340
    new-instance v0, Lo/flt;

    invoke-virtual {p0}, Lo/flr;->z()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x23

    invoke-direct {v0, v2, v1}, Lo/flt;-><init>(ILjava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1341
    :cond_c
    invoke-virtual {p0}, Lo/flr;->A()Z

    move-result v0

    if-eqz v0, :cond_d

    .line 1342
    new-instance v0, Lo/flt;

    invoke-virtual {p0}, Lo/flr;->B()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x27

    invoke-direct {v0, v2, v1}, Lo/flt;-><init>(ILjava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1344
    :cond_d
    invoke-virtual {p0}, Lo/flr;->L()Z

    move-result v0

    if-eqz v0, :cond_e

    .line 1345
    new-instance v0, Lo/flt;

    invoke-virtual {p0}, Lo/flr;->N()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const/4 v2, 0x6

    invoke-direct {v0, v2, v1}, Lo/flt;-><init>(II)V

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1347
    :cond_e
    invoke-virtual {p0}, Lo/flr;->D()Z

    move-result v0

    if-eqz v0, :cond_f

    .line 1348
    new-instance v0, Lo/flt;

    invoke-virtual {p0}, Lo/flr;->j()Lo/fll;

    move-result-object v1

    invoke-virtual {v1}, Lo/fll;->e()[B

    move-result-object v1

    const/16 v2, 0x1b

    invoke-direct {v0, v2, v1}, Lo/flt;-><init>(I[B)V

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1349
    :cond_f
    invoke-virtual {p0}, Lo/flr;->E()Z

    move-result v0

    if-eqz v0, :cond_10

    .line 1350
    new-instance v0, Lo/flt;

    invoke-virtual {p0}, Lo/flr;->I()Lo/fll;

    move-result-object v1

    invoke-virtual {v1}, Lo/fll;->e()[B

    move-result-object v1

    const/16 v2, 0x17

    invoke-direct {v0, v2, v1}, Lo/flt;-><init>(I[B)V

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1351
    :cond_10
    invoke-virtual {p0}, Lo/flr;->H()Z

    move-result v0

    if-eqz v0, :cond_11

    .line 1352
    new-instance v0, Lo/flt;

    invoke-virtual {p0}, Lo/flr;->G()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const/16 v2, 0x3c

    invoke-direct {v0, v2, v1}, Lo/flt;-><init>(II)V

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1353
    :cond_11
    invoke-virtual {p0}, Lo/flr;->K()Z

    move-result v0

    if-eqz v0, :cond_12

    .line 1354
    new-instance v0, Lo/flt;

    invoke-virtual {p0}, Lo/flr;->M()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const/16 v2, 0x1c

    invoke-direct {v0, v2, v1}, Lo/flt;-><init>(II)V

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1356
    :cond_12
    iget-object v0, p0, Lo/flr;->r:Ljava/util/List;

    if-eqz v0, :cond_13

    .line 1357
    iget-object v0, p0, Lo/flr;->r:Ljava/util/List;

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 1359
    :cond_13
    invoke-static {v4}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 1360
    return-object v4
.end method

.method public a()Ljava/lang/String;
    .locals 1

    .line 268
    iget-object v0, p0, Lo/flr;->a:Ljava/lang/String;

    return-object v0
.end method

.method public a(I)Lo/flr;
    .locals 2

    .line 836
    if-ltz p1, :cond_0

    const v0, 0xffff

    if-le p1, v0, :cond_1

    .line 837
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Accept option must be between 0 and 65535 (2 bytes) inclusive"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 838
    :cond_1
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lo/flr;->o:Ljava/lang/Integer;

    .line 839
    return-object p0
.end method

.method public a(Ljava/lang/String;)Lo/flr;
    .locals 3

    .line 599
    if-nez p1, :cond_0

    .line 600
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "URI path option must not be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 601
    :cond_0
    sget-object v0, Lo/flj;->e:Ljava/nio/charset/Charset;

    invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    array-length v0, v0

    const/16 v1, 0xff

    if-le v0, v1, :cond_1

    .line 602
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Uri-Path option must be smaller or euqal to 255 bytes (UTF-8 encoded): "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 603
    :cond_1
    invoke-virtual {p0}, Lo/flr;->f()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 604
    return-object p0
.end method

.method public a([B)Lo/flr;
    .locals 1

    .line 1121
    new-instance v0, Lo/fll;

    invoke-direct {v0, p1}, Lo/fll;-><init>([B)V

    iput-object v0, p0, Lo/flr;->q:Lo/fll;

    .line 1122
    return-object p0
.end method

.method public b(I)Lo/flr;
    .locals 1

    .line 1169
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lo/flr;->u:Ljava/lang/Integer;

    .line 1170
    return-object p0
.end method

.method public b(IZI)Lo/flr;
    .locals 1

    .line 1048
    new-instance v0, Lo/fll;

    invoke-direct {v0, p1, p2, p3}, Lo/fll;-><init>(IZI)V

    iput-object v0, p0, Lo/flr;->n:Lo/fll;

    .line 1049
    return-object p0
.end method

.method public b(Ljava/lang/String;)Lo/flr;
    .locals 3

    .line 494
    if-nez p1, :cond_0

    .line 495
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Location-Path option must not be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 496
    :cond_0
    sget-object v0, Lo/flj;->e:Ljava/nio/charset/Charset;

    invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    array-length v0, v0

    const/16 v1, 0xff

    if-le v0, v1, :cond_1

    .line 497
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Location-Path option must be smaller or euqal to 255 bytes (UTF-8 encoded): "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 498
    :cond_1
    invoke-virtual {p0}, Lo/flr;->i()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 499
    return-object p0
.end method

.method public b(Z)Lo/flr;
    .locals 0

    .line 395
    iput-boolean p1, p0, Lo/flr;->b:Z

    .line 396
    return-object p0
.end method

.method public b([B)Lo/flr;
    .locals 1

    .line 1059
    new-instance v0, Lo/fll;

    invoke-direct {v0, p1}, Lo/fll;-><init>([B)V

    iput-object v0, p0, Lo/flr;->n:Lo/fll;

    .line 1060
    return-object p0
.end method

.method public b()Z
    .locals 1

    .line 276
    iget-object v0, p0, Lo/flr;->a:Ljava/lang/String;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public c()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<[B>;"
        }
    .end annotation

    .line 313
    move-object v1, p0

    monitor-enter v1

    .line 314
    :try_start_0
    iget-object v0, p0, Lo/flr;->d:Ljava/util/List;

    if-nez v0, :cond_0

    .line 315
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lo/flr;->d:Ljava/util/List;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 316
    :cond_0
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2

    .line 317
    :goto_0
    iget-object v0, p0, Lo/flr;->d:Ljava/util/List;

    return-object v0
.end method

.method public c(I)Lo/flr;
    .locals 1

    .line 1206
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lo/flr;->t:Ljava/lang/Integer;

    .line 1207
    return-object p0
.end method

.method public c(IZI)Lo/flr;
    .locals 1

    .line 1109
    new-instance v0, Lo/fll;

    invoke-direct {v0, p1, p2, p3}, Lo/fll;-><init>(IZI)V

    iput-object v0, p0, Lo/flr;->q:Lo/fll;

    .line 1110
    return-object p0
.end method

.method public c(Ljava/lang/String;)Lo/flr;
    .locals 6

    .line 576
    const-string v1, "/"

    .line 579
    const-string v0, "/"

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 580
    const-string v0, "/"

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    .line 583
    :cond_0
    invoke-virtual {p0}, Lo/flr;->p()Lo/flr;

    .line 585
    const-string v0, "/"

    invoke-virtual {p1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    array-length v3, v2

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_1

    aget-object v5, v2, v4

    .line 587
    invoke-virtual {p0, v5}, Lo/flr;->a(Ljava/lang/String;)Lo/flr;

    .line 585
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 589
    :cond_1
    return-object p0
.end method

.method public c([B)Lo/flr;
    .locals 2

    .line 350
    if-nez p1, :cond_0

    .line 351
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "ETag option must not be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 355
    :cond_0
    invoke-virtual {p0}, Lo/flr;->c()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 356
    return-object p0
.end method

.method public d()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<[B>;"
        }
    .end annotation

    .line 189
    move-object v1, p0

    monitor-enter v1

    .line 190
    :try_start_0
    iget-object v0, p0, Lo/flr;->e:Ljava/util/List;

    if-nez v0, :cond_0

    .line 191
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lo/flr;->e:Ljava/util/List;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 192
    :cond_0
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2

    .line 193
    :goto_0
    iget-object v0, p0, Lo/flr;->e:Ljava/util/List;

    return-object v0
.end method

.method public d(I)Lo/flr;
    .locals 3

    .line 422
    if-ltz p1, :cond_0

    const v0, 0xffff

    if-ge v0, p1, :cond_1

    .line 423
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "URI port option must be between 0 and 65535 (2 bytes) inclusive but was "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 424
    :cond_1
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lo/flr;->c:Ljava/lang/Integer;

    .line 425
    return-object p0
.end method

.method public d(Ljava/lang/String;)Lo/flr;
    .locals 2

    .line 286
    if-nez p1, :cond_0

    .line 287
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "URI-Host must not be null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 288
    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x1

    if-lt v0, v1, :cond_1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0xff

    if-ge v1, v0, :cond_2

    .line 289
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "URI-Host option\'s length must be between 1 and 255 inclusive"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 290
    :cond_2
    iput-object p1, p0, Lo/flr;->a:Ljava/lang/String;

    .line 291
    return-object p0
.end method

.method public d(Lo/fll;)Lo/flr;
    .locals 0

    .line 1070
    iput-object p1, p0, Lo/flr;->n:Lo/fll;

    .line 1071
    return-object p0
.end method

.method public d([B)Lo/flr;
    .locals 3

    .line 234
    if-nez p1, :cond_0

    .line 235
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "If-Match option must not be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 236
    :cond_0
    array-length v0, p1

    const/16 v1, 0x8

    if-le v0, v1, :cond_1

    .line 237
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "If-Match option must be smaller or equal to 8 bytes: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {p1}, Lo/fli;->b([B)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 238
    :cond_1
    invoke-virtual {p0}, Lo/flr;->d()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 239
    return-object p0
.end method

.method public e()I
    .locals 1

    .line 325
    invoke-virtual {p0}, Lo/flr;->c()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public e(I)Lo/flr;
    .locals 1

    .line 655
    const/4 v0, -0x1

    if-le p1, v0, :cond_0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lo/flr;->f:Ljava/lang/Integer;

    goto :goto_0

    .line 656
    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lo/flr;->f:Ljava/lang/Integer;

    .line 657
    :goto_0
    return-object p0
.end method

.method public e(J)Lo/flr;
    .locals 2

    .line 695
    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-ltz v0, :cond_0

    const-wide v0, 0xffffffffL

    cmp-long v0, v0, p1

    if-gez v0, :cond_1

    .line 696
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Max-Age option must be between 0 and 4294967295 (4 bytes) inclusive"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 697
    :cond_1
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p0, Lo/flr;->h:Ljava/lang/Long;

    .line 698
    return-object p0
.end method

.method public e(Ljava/lang/String;)Lo/flr;
    .locals 5

    .line 753
    :goto_0
    const-string v0, "?"

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    .line 755
    :cond_0
    invoke-virtual {p0}, Lo/flr;->q()Lo/flr;

    .line 757
    const-string v0, "&"

    invoke-virtual {p1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_1
    if-ge v3, v2, :cond_2

    aget-object v4, v1, v3

    .line 758
    invoke-virtual {v4}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 759
    invoke-virtual {p0, v4}, Lo/flr;->k(Ljava/lang/String;)Lo/flr;

    .line 757
    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 762
    :cond_2
    return-object p0
.end method

.method public e(Lo/fll;)Lo/flr;
    .locals 0

    .line 1132
    iput-object p1, p0, Lo/flr;->q:Lo/fll;

    .line 1133
    return-object p0
.end method

.method public e(Lo/flt;)Lo/flr;
    .locals 2

    .line 1369
    invoke-virtual {p1}, Lo/flt;->b()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_0

    .line 1370
    :pswitch_0
    invoke-virtual {p1}, Lo/flt;->e()[B

    move-result-object v0

    invoke-virtual {p0, v0}, Lo/flr;->d([B)Lo/flr;

    goto/16 :goto_1

    .line 1371
    :pswitch_1
    invoke-virtual {p1}, Lo/flt;->d()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lo/flr;->d(Ljava/lang/String;)Lo/flr;

    goto/16 :goto_1

    .line 1372
    :pswitch_2
    invoke-virtual {p1}, Lo/flt;->e()[B

    move-result-object v0

    invoke-virtual {p0, v0}, Lo/flr;->c([B)Lo/flr;

    goto/16 :goto_1

    .line 1373
    :pswitch_3
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lo/flr;->b(Z)Lo/flr;

    goto/16 :goto_1

    .line 1374
    :pswitch_4
    invoke-virtual {p1}, Lo/flt;->c()I

    move-result v0

    invoke-virtual {p0, v0}, Lo/flr;->d(I)Lo/flr;

    goto/16 :goto_1

    .line 1375
    :pswitch_5
    invoke-virtual {p1}, Lo/flt;->d()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lo/flr;->b(Ljava/lang/String;)Lo/flr;

    goto/16 :goto_1

    .line 1376
    :pswitch_6
    invoke-virtual {p1}, Lo/flt;->d()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lo/flr;->a(Ljava/lang/String;)Lo/flr;

    goto/16 :goto_1

    .line 1377
    :pswitch_7
    invoke-virtual {p1}, Lo/flt;->c()I

    move-result v0

    invoke-virtual {p0, v0}, Lo/flr;->e(I)Lo/flr;

    goto/16 :goto_1

    .line 1378
    :pswitch_8
    invoke-virtual {p1}, Lo/flt;->i()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lo/flr;->e(J)Lo/flr;

    goto/16 :goto_1

    .line 1379
    :pswitch_9
    invoke-virtual {p1}, Lo/flt;->d()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lo/flr;->k(Ljava/lang/String;)Lo/flr;

    goto :goto_1

    .line 1380
    :pswitch_a
    invoke-virtual {p1}, Lo/flt;->c()I

    move-result v0

    invoke-virtual {p0, v0}, Lo/flr;->a(I)Lo/flr;

    goto :goto_1

    .line 1381
    :pswitch_b
    invoke-virtual {p1}, Lo/flt;->d()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lo/flr;->h(Ljava/lang/String;)Lo/flr;

    goto :goto_1

    .line 1382
    :pswitch_c
    invoke-virtual {p1}, Lo/flt;->d()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lo/flr;->f(Ljava/lang/String;)Lo/flr;

    goto :goto_1

    .line 1383
    :pswitch_d
    invoke-virtual {p1}, Lo/flt;->d()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lo/flr;->i(Ljava/lang/String;)Lo/flr;

    goto :goto_1

    .line 1384
    :pswitch_e
    invoke-virtual {p1}, Lo/flt;->e()[B

    move-result-object v0

    invoke-virtual {p0, v0}, Lo/flr;->b([B)Lo/flr;

    goto :goto_1

    .line 1385
    :pswitch_f
    invoke-virtual {p1}, Lo/flt;->e()[B

    move-result-object v0

    invoke-virtual {p0, v0}, Lo/flr;->a([B)Lo/flr;

    goto :goto_1

    .line 1386
    :pswitch_10
    invoke-virtual {p1}, Lo/flt;->c()I

    move-result v0

    invoke-virtual {p0, v0}, Lo/flr;->b(I)Lo/flr;

    goto :goto_1

    .line 1387
    :pswitch_11
    invoke-virtual {p1}, Lo/flt;->c()I

    move-result v0

    invoke-virtual {p0, v0}, Lo/flr;->c(I)Lo/flr;

    goto :goto_1

    .line 1388
    :pswitch_12
    invoke-virtual {p1}, Lo/flt;->c()I

    move-result v0

    invoke-virtual {p0, v0}, Lo/flr;->i(I)Lo/flr;

    goto :goto_1

    .line 1389
    :goto_0
    :pswitch_13
    invoke-direct {p0}, Lo/flr;->R()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1391
    :goto_1
    return-object p0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_13
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_12
        :pswitch_4
        :pswitch_5
        :pswitch_13
        :pswitch_13
        :pswitch_6
        :pswitch_7
        :pswitch_13
        :pswitch_8
        :pswitch_9
        :pswitch_13
        :pswitch_a
        :pswitch_13
        :pswitch_13
        :pswitch_b
        :pswitch_13
        :pswitch_13
        :pswitch_f
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_e
        :pswitch_11
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_c
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_d
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_10
    .end packed-switch
.end method

.method public f()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation

    .line 541
    move-object v1, p0

    monitor-enter v1

    .line 542
    :try_start_0
    iget-object v0, p0, Lo/flr;->i:Ljava/util/List;

    if-nez v0, :cond_0

    .line 543
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lo/flr;->i:Ljava/util/List;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 544
    :cond_0
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2

    .line 545
    :goto_0
    iget-object v0, p0, Lo/flr;->i:Ljava/util/List;

    return-object v0
.end method

.method public f(Ljava/lang/String;)Lo/flr;
    .locals 3

    .line 964
    if-nez p1, :cond_0

    .line 965
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Proxy-Uri option must not be null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 966
    :cond_0
    sget-object v0, Lo/flj;->e:Ljava/nio/charset/Charset;

    invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    array-length v0, v0

    const/4 v1, 0x1

    if-lt v0, v1, :cond_1

    sget-object v0, Lo/flj;->e:Ljava/nio/charset/Charset;

    invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    array-length v0, v0

    const/16 v1, 0x40a

    if-ge v1, v0, :cond_2

    .line 967
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Proxy-Uri option must be between 1 and 1034 bytes inclusive (UTF-8 encoded): "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 968
    :cond_2
    iput-object p1, p0, Lo/flr;->p:Ljava/lang/String;

    .line 969
    return-object p0
.end method

.method public g()Ljava/lang/Integer;
    .locals 1

    .line 404
    iget-object v0, p0, Lo/flr;->c:Ljava/lang/Integer;

    return-object v0
.end method

.method public h(Ljava/lang/String;)Lo/flr;
    .locals 3

    .line 912
    if-nez p1, :cond_0

    .line 913
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Location-Query option must not be null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 914
    :cond_0
    sget-object v0, Lo/flj;->e:Ljava/nio/charset/Charset;

    invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    array-length v0, v0

    const/16 v1, 0xff

    if-le v0, v1, :cond_1

    .line 915
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Location-Query option must be smaller or euqal to 255 bytes (UTF-8 encoded): "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 916
    :cond_1
    invoke-virtual {p0}, Lo/flr;->v()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 917
    return-object p0
.end method

.method public h()Z
    .locals 1

    .line 412
    iget-object v0, p0, Lo/flr;->c:Ljava/lang/Integer;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public i()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation

    .line 444
    move-object v1, p0

    monitor-enter v1

    .line 445
    :try_start_0
    iget-object v0, p0, Lo/flr;->k:Ljava/util/List;

    if-nez v0, :cond_0

    .line 446
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lo/flr;->k:Ljava/util/List;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 447
    :cond_0
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2

    .line 448
    :goto_0
    iget-object v0, p0, Lo/flr;->k:Ljava/util/List;

    return-object v0
.end method

.method public i(I)Lo/flr;
    .locals 2

    .line 1246
    invoke-static {p1}, Lo/flr;->k(I)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1247
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Observe option must be between 0 and 16777215 (3 bytes) inclusive"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1249
    :cond_0
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lo/flr;->s:Ljava/lang/Integer;

    .line 1250
    return-object p0
.end method

.method public i(Ljava/lang/String;)Lo/flr;
    .locals 3

    .line 1005
    if-nez p1, :cond_0

    .line 1006
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Proxy-Scheme option must not be null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1007
    :cond_0
    sget-object v0, Lo/flj;->e:Ljava/nio/charset/Charset;

    invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    array-length v0, v0

    const/4 v1, 0x1

    if-lt v0, v1, :cond_1

    sget-object v0, Lo/flj;->e:Ljava/nio/charset/Charset;

    invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    array-length v0, v0

    const/16 v1, 0xff

    if-ge v1, v0, :cond_2

    .line 1008
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Proxy-Scheme option must be between 1 and 255 bytes inclusive (UTF-8 encoded): "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1009
    :cond_2
    iput-object p1, p0, Lo/flr;->l:Ljava/lang/String;

    .line 1010
    return-object p0
.end method

.method public j()Lo/fll;
    .locals 1

    .line 1028
    iget-object v0, p0, Lo/flr;->n:Lo/fll;

    return-object v0
.end method

.method public k(Ljava/lang/String;)Lo/flr;
    .locals 3

    .line 772
    if-nez p1, :cond_0

    .line 773
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Uri-Query option must not be null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 774
    :cond_0
    sget-object v0, Lo/flj;->e:Ljava/nio/charset/Charset;

    invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    array-length v0, v0

    const/16 v1, 0xff

    if-le v0, v1, :cond_1

    .line 775
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Uri-Query option must be smaller or euqal to 255 bytes (UTF-8 encoded): "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 776
    :cond_1
    invoke-virtual {p0}, Lo/flr;->s()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 777
    return-object p0
.end method

.method public k()Z
    .locals 1

    .line 385
    iget-boolean v0, p0, Lo/flr;->b:Z

    return v0
.end method

.method public l()I
    .locals 1

    .line 623
    invoke-virtual {p0}, Lo/flr;->n()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/flr;->f:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, -0x1

    :goto_0
    return v0
.end method

.method public m()Ljava/lang/String;
    .locals 5

    .line 554
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 555
    invoke-virtual {p0}, Lo/flr;->f()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/lang/String;

    .line 556
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 557
    :cond_0
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    if-nez v0, :cond_1

    const-string v0, ""

    return-object v0

    .line 558
    :cond_1
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    const/4 v1, 0x0

    invoke-virtual {v2, v1, v0}, Ljava/lang/StringBuilder;->substring(II)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public n()Z
    .locals 1

    .line 631
    iget-object v0, p0, Lo/flr;->f:Ljava/lang/Integer;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public o()Ljava/lang/Long;
    .locals 3

    .line 675
    iget-object v2, p0, Lo/flr;->h:Ljava/lang/Long;

    .line 676
    if-eqz v2, :cond_0

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    goto :goto_0

    :cond_0
    const-wide/16 v0, 0x3c

    :goto_0
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    return-object v0
.end method

.method public p()Lo/flr;
    .locals 1

    .line 613
    invoke-virtual {p0}, Lo/flr;->f()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 614
    return-object p0
.end method

.method public q()Lo/flr;
    .locals 1

    .line 797
    invoke-virtual {p0}, Lo/flr;->s()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 798
    return-object p0
.end method

.method public r()I
    .locals 1

    .line 729
    invoke-virtual {p0}, Lo/flr;->s()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public s()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation

    .line 717
    move-object v1, p0

    monitor-enter v1

    .line 718
    :try_start_0
    iget-object v0, p0, Lo/flr;->g:Ljava/util/List;

    if-nez v0, :cond_0

    .line 719
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lo/flr;->g:Ljava/util/List;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 720
    :cond_0
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2

    .line 721
    :goto_0
    iget-object v0, p0, Lo/flr;->g:Ljava/util/List;

    return-object v0
.end method

.method public t()Z
    .locals 1

    .line 685
    iget-object v0, p0, Lo/flr;->h:Ljava/lang/Long;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    .line 1396
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 1397
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 1398
    const/4 v4, -0x1

    .line 1399
    const/4 v5, 0x0

    .line 1401
    const/16 v0, 0x7b

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 1403
    invoke-virtual {p0}, Lo/flr;->S()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lo/flt;

    .line 1404
    invoke-virtual {v7}, Lo/flt;->b()I

    move-result v0

    if-eq v0, v4, :cond_2

    .line 1405
    const/4 v0, -0x1

    if-eq v4, v0, :cond_1

    .line 1406
    if-eqz v5, :cond_0

    const/16 v0, 0x5d

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 1407
    :cond_0
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1408
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 1409
    const-string v0, ", "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1412
    :cond_1
    const/4 v5, 0x0

    .line 1414
    const/16 v0, 0x22

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 1415
    invoke-virtual {v7}, Lo/flt;->b()I

    move-result v0

    invoke-static {v0}, Lo/flu;->e(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1416
    const/16 v0, 0x22

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 1417
    const/16 v0, 0x3a

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 1419
    :cond_2
    if-nez v5, :cond_3

    const/4 v0, 0x0

    const/16 v1, 0x5b

    invoke-virtual {v3, v0, v1}, Ljava/lang/StringBuilder;->insert(IC)Ljava/lang/StringBuilder;

    .line 1420
    :cond_3
    const/4 v5, 0x1

    .line 1421
    const-string v0, ","

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1423
    :goto_1
    invoke-virtual {v7}, Lo/flt;->f()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1425
    invoke-virtual {v7}, Lo/flt;->b()I

    move-result v4

    .line 1426
    goto/16 :goto_0

    .line 1427
    :cond_4
    if-eqz v5, :cond_5

    const/16 v0, 0x5d

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 1428
    :cond_5
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1429
    const/16 v0, 0x7d

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 1431
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public u()Ljava/lang/String;
    .locals 5

    .line 737
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 738
    invoke-virtual {p0}, Lo/flr;->s()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/lang/String;

    .line 739
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "&"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 740
    :cond_0
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    if-lez v0, :cond_1

    .line 741
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->length()I

    move-result v1

    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->delete(II)Ljava/lang/StringBuilder;

    .line 742
    :cond_1
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public v()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation

    .line 858
    move-object v1, p0

    monitor-enter v1

    .line 859
    :try_start_0
    iget-object v0, p0, Lo/flr;->m:Ljava/util/List;

    if-nez v0, :cond_0

    .line 860
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lo/flr;->m:Ljava/util/List;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 861
    :cond_0
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2

    .line 862
    :goto_0
    iget-object v0, p0, Lo/flr;->m:Ljava/util/List;

    return-object v0
.end method

.method public w()I
    .locals 1

    .line 807
    invoke-virtual {p0}, Lo/flr;->y()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/flr;->o:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, -0x1

    :goto_0
    return v0
.end method

.method public x()Z
    .locals 1

    .line 954
    iget-object v0, p0, Lo/flr;->p:Ljava/lang/String;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public y()Z
    .locals 1

    .line 815
    iget-object v0, p0, Lo/flr;->o:Ljava/lang/Integer;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public z()Ljava/lang/String;
    .locals 1

    .line 946
    iget-object v0, p0, Lo/flr;->p:Ljava/lang/String;

    return-object v0
.end method
