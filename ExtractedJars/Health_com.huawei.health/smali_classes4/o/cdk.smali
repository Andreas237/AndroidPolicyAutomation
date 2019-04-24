.class public Lo/cdk;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field a:Lo/cdj;

.field private b:I

.field private c:Lo/cde;

.field private d:Ljava/lang/StringBuilder;

.field private e:I

.field private f:Ljava/util/LinkedList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedList<Lo/cgn;>;"
        }
    .end annotation
.end field

.field private g:Lo/cdd;

.field private h:Lo/cdc;

.field private i:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lo/ccw;>;"
        }
    .end annotation
.end field

.field private k:Ljava/util/LinkedList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedList<Lo/cgn;>;"
        }
    .end annotation
.end field

.field private n:Ljava/util/LinkedList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedList<Lo/cgn;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lo/cde;Ljava/lang/StringBuilder;I)V
    .locals 1

    .line 64
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cdk;->d:Ljava/lang/StringBuilder;

    .line 40
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cdk;->c:Lo/cde;

    .line 45
    const/4 v0, 0x1

    iput v0, p0, Lo/cdk;->e:I

    .line 51
    const/4 v0, 0x1

    iput v0, p0, Lo/cdk;->b:I

    .line 53
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/cdk;->i:Ljava/util/ArrayList;

    .line 57
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lo/cdk;->f:Ljava/util/LinkedList;

    .line 58
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lo/cdk;->k:Ljava/util/LinkedList;

    .line 59
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lo/cdk;->n:Ljava/util/LinkedList;

    .line 62
    new-instance v0, Lo/cdj;

    invoke-direct {v0}, Lo/cdj;-><init>()V

    iput-object v0, p0, Lo/cdk;->a:Lo/cdj;

    .line 65
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    const/4 v0, 0x0

    if-ne v0, p2, :cond_1

    .line 66
    :cond_0
    return-void

    .line 69
    :cond_1
    iput-object p1, p0, Lo/cdk;->c:Lo/cde;

    .line 70
    iput-object p2, p0, Lo/cdk;->d:Ljava/lang/StringBuilder;

    .line 72
    invoke-virtual {p0, p3}, Lo/cdk;->c(I)V

    .line 74
    invoke-direct {p0}, Lo/cdk;->p()V

    .line 75
    return-void
.end method

.method private b(Lo/cgn;Z)I
    .locals 8

    .line 129
    iget v0, p0, Lo/cdk;->e:I

    const/4 v1, 0x1

    if-ne v1, v0, :cond_4

    .line 130
    iget-object v0, p0, Lo/cdk;->g:Lo/cdd;

    if-nez v0, :cond_0

    .line 131
    const/4 v0, -0x1

    return v0

    .line 133
    :cond_0
    iget-object v0, p0, Lo/cdk;->g:Lo/cdd;

    invoke-virtual {v0, p1}, Lo/cdd;->a(Lo/cgn;)I

    move-result v4

    .line 134
    const/4 v0, 0x1

    if-ne v0, v4, :cond_3

    .line 135
    const/4 v0, 0x2

    iput v0, p0, Lo/cdk;->e:I

    .line 137
    iget-object v0, p0, Lo/cdk;->g:Lo/cdd;

    invoke-virtual {v0}, Lo/cdd;->e()Ljava/util/LinkedList;

    move-result-object v5

    .line 138
    if-nez v5, :cond_1

    .line 139
    const/4 v0, -0x1

    return v0

    .line 142
    :cond_1
    invoke-virtual {v5}, Ljava/util/LinkedList;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lo/cgn;

    .line 143
    const/4 v0, 0x0

    invoke-direct {p0, v7, v0}, Lo/cdk;->b(Lo/cgn;Z)I

    .line 144
    goto :goto_0

    .line 145
    :cond_2
    invoke-virtual {v5}, Ljava/util/LinkedList;->clear()V

    .line 147
    :cond_3
    goto/16 :goto_3

    .line 148
    :cond_4
    const/4 v4, 0x0

    .line 151
    if-eqz p2, :cond_7

    .line 152
    const/4 v5, 0x2

    .line 153
    iget-object v0, p0, Lo/cdk;->i:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lo/ccw;

    .line 154
    invoke-virtual {v7, p1}, Lo/ccw;->a(Lo/cgn;)I

    move-result v5

    .line 155
    const/4 v0, 0x1

    if-ne v5, v0, :cond_5

    .line 156
    const/4 v4, 0x1

    .line 158
    iget-object v0, p0, Lo/cdk;->a:Lo/cdj;

    invoke-virtual {p1}, Lo/cgn;->c()J

    move-result-wide v1

    invoke-virtual {v0, v5, v7, v1, v2}, Lo/cdj;->b(ILo/ccw;J)V

    .line 159
    goto :goto_2

    .line 161
    :cond_5
    goto :goto_1

    .line 162
    :cond_6
    :goto_2
    const/4 v0, 0x1

    if-eq v5, v0, :cond_7

    .line 163
    iget-object v0, p0, Lo/cdk;->a:Lo/cdj;

    invoke-virtual {p1}, Lo/cgn;->c()J

    move-result-wide v1

    const/4 v3, 0x0

    invoke-virtual {v0, v5, v3, v1, v2}, Lo/cdj;->b(ILo/ccw;J)V

    .line 167
    :cond_7
    if-nez v4, :cond_9

    .line 168
    iget-object v0, p0, Lo/cdk;->f:Ljava/util/LinkedList;

    invoke-virtual {v0, p1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    .line 170
    iget-object v0, p0, Lo/cdk;->h:Lo/cdc;

    if-nez v0, :cond_8

    .line 171
    const/4 v0, -0x1

    return v0

    .line 173
    :cond_8
    iget-object v0, p0, Lo/cdk;->h:Lo/cdc;

    invoke-virtual {v0, p1}, Lo/cdc;->a(Lo/cgn;)I

    .line 175
    iget-object v0, p0, Lo/cdk;->f:Ljava/util/LinkedList;

    invoke-static {v0}, Lo/cdm;->b(Ljava/util/LinkedList;)V

    .line 179
    :cond_9
    :goto_3
    const/4 v0, 0x0

    return v0
.end method

.method private p()V
    .locals 6

    .line 78
    iget-object v0, p0, Lo/cdk;->c:Lo/cde;

    invoke-virtual {v0}, Lo/cde;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 79
    new-instance v1, Lo/cdg;

    invoke-direct {v1, p0}, Lo/cdg;-><init>(Lo/cdk;)V

    .line 80
    invoke-virtual {p0, v1}, Lo/cdk;->c(Lo/cdd;)V

    .line 81
    goto :goto_0

    .line 82
    :cond_0
    new-instance v1, Lo/cdf;

    invoke-direct {v1, p0}, Lo/cdf;-><init>(Lo/cdk;)V

    .line 83
    invoke-virtual {p0, v1}, Lo/cdk;->c(Lo/cdd;)V

    .line 86
    :goto_0
    new-instance v1, Lo/ccv;

    invoke-direct {v1, p0}, Lo/ccv;-><init>(Lo/cdk;)V

    .line 87
    invoke-virtual {p0, v1}, Lo/cdk;->d(Lo/ccw;)V

    .line 88
    new-instance v2, Lo/cda;

    invoke-direct {v2, p0}, Lo/cda;-><init>(Lo/cdk;)V

    .line 89
    invoke-virtual {p0, v2}, Lo/cdk;->d(Lo/ccw;)V

    .line 90
    new-instance v3, Lo/cdb;

    invoke-direct {v3, p0}, Lo/cdb;-><init>(Lo/cdk;)V

    .line 91
    invoke-virtual {p0, v3}, Lo/cdk;->d(Lo/ccw;)V

    .line 92
    new-instance v4, Lo/ccz;

    invoke-direct {v4, p0}, Lo/ccz;-><init>(Lo/cdk;)V

    .line 93
    invoke-virtual {p0, v4}, Lo/cdk;->d(Lo/ccw;)V

    .line 95
    iget-object v0, p0, Lo/cdk;->c:Lo/cde;

    invoke-virtual {v0}, Lo/cde;->f()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 96
    new-instance v5, Lo/cdh;

    invoke-direct {v5, p0}, Lo/cdh;-><init>(Lo/cdk;)V

    .line 97
    invoke-virtual {p0, v5}, Lo/cdk;->b(Lo/cdc;)V

    .line 98
    goto :goto_1

    .line 99
    :cond_1
    new-instance v5, Lo/ccy;

    invoke-direct {v5, p0}, Lo/ccy;-><init>(Lo/cdk;)V

    .line 100
    invoke-virtual {p0, v5}, Lo/cdk;->b(Lo/cdc;)V

    .line 102
    :goto_1
    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .line 125
    iget-object v0, p0, Lo/cdk;->n:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->clear()V

    .line 126
    return-void
.end method

.method public a(Lo/cdi;)V
    .locals 1

    .line 249
    iget-object v0, p0, Lo/cdk;->a:Lo/cdj;

    if-eqz v0, :cond_0

    .line 250
    iget-object v0, p0, Lo/cdk;->a:Lo/cdj;

    invoke-virtual {v0, p1}, Lo/cdj;->c(Lo/cdi;)V

    .line 252
    :cond_0
    return-void
.end method

.method public b()Ljava/util/LinkedList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/LinkedList<Lo/cgn;>;"
        }
    .end annotation

    .line 196
    iget-object v0, p0, Lo/cdk;->k:Ljava/util/LinkedList;

    return-object v0
.end method

.method public b(Lo/cdc;)V
    .locals 0

    .line 224
    iput-object p1, p0, Lo/cdk;->h:Lo/cdc;

    .line 225
    return-void
.end method

.method public c()Ljava/util/LinkedList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/LinkedList<Lo/cgn;>;"
        }
    .end annotation

    .line 200
    iget-object v0, p0, Lo/cdk;->f:Ljava/util/LinkedList;

    return-object v0
.end method

.method public final c(I)V
    .locals 1

    .line 232
    const/4 v0, 0x2

    if-gt p1, v0, :cond_0

    if-gez p1, :cond_1

    .line 233
    :cond_0
    const/4 v0, 0x1

    iput v0, p0, Lo/cdk;->b:I

    goto :goto_0

    .line 235
    :cond_1
    iput p1, p0, Lo/cdk;->b:I

    .line 237
    :goto_0
    return-void
.end method

.method public c(Lo/cdd;)V
    .locals 0

    .line 216
    iput-object p1, p0, Lo/cdk;->g:Lo/cdd;

    .line 217
    return-void
.end method

.method public d()Lo/cde;
    .locals 1

    .line 192
    iget-object v0, p0, Lo/cdk;->c:Lo/cde;

    return-object v0
.end method

.method public d(Lo/ccw;)V
    .locals 1

    .line 208
    iget-object v0, p0, Lo/cdk;->i:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 209
    return-void
.end method

.method public e(Lo/cgn;)I
    .locals 5

    .line 105
    iget-object v0, p0, Lo/cdk;->a:Lo/cdj;

    invoke-virtual {v0}, Lo/cdj;->b()V

    .line 106
    iget-object v0, p0, Lo/cdk;->k:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->size()I

    move-result v2

    .line 107
    const/4 v0, 0x1

    invoke-direct {p0, p1, v0}, Lo/cdk;->b(Lo/cgn;Z)I

    .line 110
    iget-object v0, p0, Lo/cdk;->k:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->size()I

    move-result v3

    .line 111
    move v4, v2

    :goto_0
    if-ge v4, v3, :cond_0

    .line 112
    iget-object v0, p0, Lo/cdk;->n:Ljava/util/LinkedList;

    iget-object v1, p0, Lo/cdk;->k:Ljava/util/LinkedList;

    invoke-virtual {v1, v4}, Ljava/util/LinkedList;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    .line 111
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 115
    :cond_0
    iget-object v0, p0, Lo/cdk;->k:Ljava/util/LinkedList;

    invoke-static {v0}, Lo/cdm;->b(Ljava/util/LinkedList;)V

    .line 117
    iget-object v0, p0, Lo/cdk;->n:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->size()I

    move-result v0

    return v0
.end method

.method public e()Ljava/util/LinkedList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/LinkedList<Lo/cgn;>;"
        }
    .end annotation

    .line 121
    iget-object v0, p0, Lo/cdk;->n:Ljava/util/LinkedList;

    return-object v0
.end method

.method public f()I
    .locals 1

    .line 228
    iget v0, p0, Lo/cdk;->b:I

    return v0
.end method

.method public g()V
    .locals 1

    .line 255
    iget-object v0, p0, Lo/cdk;->a:Lo/cdj;

    if-eqz v0, :cond_0

    .line 256
    iget-object v0, p0, Lo/cdk;->a:Lo/cdj;

    invoke-virtual {v0}, Lo/cdj;->e()V

    .line 258
    :cond_0
    return-void
.end method

.method public h()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/Map<Ljava/lang/String;Ljava/lang/Integer;>;"
        }
    .end annotation

    .line 245
    iget-object v0, p0, Lo/cdk;->a:Lo/cdj;

    invoke-virtual {v0}, Lo/cdj;->a()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public i()Z
    .locals 2

    .line 240
    iget v0, p0, Lo/cdk;->e:I

    const/4 v1, 0x1

    if-ne v1, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public k()Ljava/lang/StringBuilder;
    .locals 1

    .line 204
    iget-object v0, p0, Lo/cdk;->d:Ljava/lang/StringBuilder;

    return-object v0
.end method
