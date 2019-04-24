.class public final Lo/ehu;
.super Lo/nj;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/ehu$c;
    }
.end annotation


# instance fields
.field private a:Lo/ehu$c;

.field protected b:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lo/ld;>;"
        }
    .end annotation
.end field

.field protected d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/nj;>;"
        }
    .end annotation
.end field

.field protected e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/mh;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lo/ehv;Lo/la;Lo/oa;)V
    .locals 2

    .line 40
    invoke-direct {p0, p2, p3}, Lo/nj;-><init>(Lo/la;Lo/oa;)V

    .line 28
    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x5

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Lo/ehu;->d:Ljava/util/List;

    .line 32
    new-instance v0, Lo/ehu$1;

    invoke-direct {v0, p0}, Lo/ehu$1;-><init>(Lo/ehu;)V

    iput-object v0, p0, Lo/ehu;->a:Lo/ehu$c;

    .line 174
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/ehu;->e:Ljava/util/List;

    .line 41
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lo/ehu;->b:Ljava/lang/ref/WeakReference;

    .line 42
    invoke-virtual {p0}, Lo/ehu;->c()V

    .line 43
    return-void
.end method

.method private a()Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lo/nj;>;"
        }
    .end annotation

    .line 104
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 106
    iget-object v0, p0, Lo/ehu;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/nj;

    .line 107
    instance-of v0, v4, Lo/eiu;

    if-nez v0, :cond_0

    .line 108
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "only support huawei chart render,interface specified!!!"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 110
    :cond_0
    move-object v5, v4

    check-cast v5, Lo/eiu;

    .line 111
    invoke-interface {v5}, Lo/eiu;->d()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 113
    invoke-interface {v2, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 115
    :cond_1
    goto :goto_0

    .line 116
    :cond_2
    return-object v2
.end method

.method private a(Lo/ehu$c;Landroid/graphics/Canvas;)V
    .locals 6

    .line 127
    invoke-direct {p0}, Lo/ehu;->a()Ljava/util/List;

    move-result-object v2

    .line 129
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_0

    .line 130
    return-void

    .line 133
    :cond_0
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 135
    const/4 v0, 0x0

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/nj;

    invoke-interface {p1, v0, p2}, Lo/ehu$c;->a(Lo/nj;Landroid/graphics/Canvas;)V

    .line 136
    return-void

    .line 140
    :cond_1
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x2

    if-le v0, v1, :cond_2

    .line 141
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "combined chart not support More than 2 renders draw"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 144
    :cond_2
    const/4 v0, 0x0

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/nj;

    .line 145
    move-object v4, v3

    check-cast v4, Lo/eiu;

    .line 146
    const/4 v0, 0x1

    invoke-interface {v4, v0}, Lo/eiu;->c(Z)V

    .line 147
    invoke-interface {p1, v3, p2}, Lo/ehu$c;->a(Lo/nj;Landroid/graphics/Canvas;)V

    .line 148
    const/4 v0, 0x0

    invoke-interface {v4, v0}, Lo/eiu;->c(Z)V

    .line 150
    const/4 v5, 0x1

    :goto_0
    iget-object v0, p0, Lo/ehu;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v5, v0, :cond_3

    .line 151
    iget-object v0, p0, Lo/ehu;->d:Ljava/util/List;

    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/nj;

    invoke-interface {p1, v0, p2}, Lo/ehu$c;->a(Lo/nj;Landroid/graphics/Canvas;)V

    .line 150
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 153
    :cond_3
    return-void
.end method


# virtual methods
.method public a(Landroid/graphics/Canvas;)V
    .locals 1

    .line 157
    iget-object v0, p0, Lo/ehu;->a:Lo/ehu$c;

    invoke-direct {p0, v0, p1}, Lo/ehu;->a(Lo/ehu$c;Landroid/graphics/Canvas;)V

    .line 158
    return-void
.end method

.method public c()V
    .locals 11

    .line 51
    iget-object v0, p0, Lo/ehu;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 53
    iget-object v0, p0, Lo/ehu;->b:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/ehv;

    .line 54
    if-nez v4, :cond_0

    .line 55
    return-void

    .line 58
    :cond_0
    invoke-virtual {v4}, Lo/ehv;->getDrawOrder()[Lo/ehv$c;

    move-result-object v5

    .line 60
    move-object v6, v5

    array-length v7, v6

    const/4 v8, 0x0

    :goto_0
    if-ge v8, v7, :cond_2

    aget-object v9, v6, v8

    .line 62
    sget-object v0, Lo/ehu$5;->a:[I

    invoke-virtual {v9}, Lo/ehv$c;->ordinal()I

    move-result v1

    aget v0, v0, v1

    sparse-switch v0, :sswitch_data_0

    goto :goto_1

    .line 64
    :sswitch_0
    invoke-virtual {v4}, Lo/ehv;->getBarData()Lo/ehq;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 65
    iget-object v0, p0, Lo/ehu;->d:Ljava/util/List;

    new-instance v1, Lo/ehp;

    iget-object v2, p0, Lo/ehu;->i:Lo/la;

    iget-object v3, p0, Lo/ehu;->l:Lo/oa;

    invoke-direct {v1, v4, v2, v3}, Lo/ehp;-><init>(Lo/ejj;Lo/la;Lo/oa;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 72
    :sswitch_1
    invoke-virtual {v4}, Lo/ehv;->getLineData()Lo/ela;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 73
    new-instance v10, Lo/ekx;

    iget-object v0, p0, Lo/ehu;->i:Lo/la;

    iget-object v1, p0, Lo/ehu;->l:Lo/oa;

    .line 74
    invoke-virtual {v4}, Lo/ehv;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v10, v4, v0, v1, v2}, Lo/ekx;-><init>(Lo/ejh;Lo/la;Lo/oa;Landroid/content/Context;)V

    .line 75
    const/4 v0, 0x1

    invoke-virtual {v10, v0}, Lo/ekx;->b(I)V

    .line 76
    iget-object v0, p0, Lo/ehu;->d:Ljava/util/List;

    invoke-interface {v0, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 60
    .line 77
    :cond_1
    :goto_1
    add-int/lit8 v8, v8, 0x1

    goto/16 :goto_0

    .line 91
    :cond_2
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
        0x2 -> :sswitch_1
    .end sparse-switch
.end method

.method public d(Landroid/graphics/Canvas;)V
    .locals 3

    .line 170
    iget-object v0, p0, Lo/ehu;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lo/nj;

    .line 171
    invoke-virtual {v2, p1}, Lo/nj;->d(Landroid/graphics/Canvas;)V

    goto :goto_0

    .line 172
    :cond_0
    return-void
.end method

.method public d(Landroid/graphics/Canvas;[Lo/mh;)V
    .locals 2

    .line 179
    iget-object v0, p0, Lo/ehu;->b:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lo/ld;

    .line 180
    if-nez v1, :cond_0

    return-void

    .line 182
    :cond_0
    new-instance v0, Lo/ehu$4;

    invoke-direct {v0, p0, v1, p2}, Lo/ehu$4;-><init>(Lo/ehu;Lo/ld;[Lo/mh;)V

    invoke-direct {p0, v0, p1}, Lo/ehu;->a(Lo/ehu$c;Landroid/graphics/Canvas;)V

    .line 204
    return-void
.end method

.method public e()V
    .locals 3

    .line 96
    iget-object v0, p0, Lo/ehu;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lo/nj;

    .line 97
    invoke-virtual {v2}, Lo/nj;->e()V

    goto :goto_0

    .line 98
    :cond_0
    return-void
.end method

.method public e(Landroid/graphics/Canvas;)V
    .locals 3

    .line 163
    iget-object v0, p0, Lo/ehu;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lo/nj;

    .line 164
    invoke-virtual {v2, p1}, Lo/nj;->e(Landroid/graphics/Canvas;)V

    goto :goto_0

    .line 165
    :cond_0
    return-void
.end method
