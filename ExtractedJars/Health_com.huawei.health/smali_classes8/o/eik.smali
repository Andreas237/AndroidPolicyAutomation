.class public abstract Lo/eik;
.super Lo/lt;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T::Lo/ejl<+Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;>;>Lo/lt<TT;>;"
    }
.end annotation


# instance fields
.field protected k:F

.field protected l:F

.field protected m:F

.field protected n:F

.field protected o:F

.field protected p:F


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 24
    invoke-direct {p0}, Lo/lt;-><init>()V

    .line 38
    const v0, -0x800001

    iput v0, p0, Lo/eik;->k:F

    .line 40
    const v0, 0x7f7fffff    # Float.MAX_VALUE

    iput v0, p0, Lo/eik;->p:F

    .line 42
    const v0, -0x800001

    iput v0, p0, Lo/eik;->m:F

    .line 44
    const v0, 0x7f7fffff    # Float.MAX_VALUE

    iput v0, p0, Lo/eik;->o:F

    .line 46
    const v0, -0x800001

    iput v0, p0, Lo/eik;->l:F

    .line 48
    const v0, 0x7f7fffff    # Float.MAX_VALUE

    iput v0, p0, Lo/eik;->n:F

    .line 25
    return-void
.end method

.method public constructor <init>(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<TT;>;)V"
        }
    .end annotation

    .line 32
    invoke-direct {p0, p1}, Lo/lt;-><init>(Ljava/util/List;)V

    .line 38
    const v0, -0x800001

    iput v0, p0, Lo/eik;->k:F

    .line 40
    const v0, 0x7f7fffff    # Float.MAX_VALUE

    iput v0, p0, Lo/eik;->p:F

    .line 42
    const v0, -0x800001

    iput v0, p0, Lo/eik;->m:F

    .line 44
    const v0, 0x7f7fffff    # Float.MAX_VALUE

    iput v0, p0, Lo/eik;->o:F

    .line 46
    const v0, -0x800001

    iput v0, p0, Lo/eik;->l:F

    .line 48
    const v0, 0x7f7fffff    # Float.MAX_VALUE

    iput v0, p0, Lo/eik;->n:F

    .line 33
    return-void
.end method

.method private c(Ljava/util/List;)Lo/ejl;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<TT;>;)TT;"
        }
    .end annotation

    .line 220
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/ejl;

    .line 221
    move-object v0, v3

    check-cast v0, Lo/ejo;

    invoke-interface {v0}, Lo/ejo;->e()Lo/eit$b;

    move-result-object v0

    sget-object v1, Lo/eit$b;->c:Lo/eit$b;

    if-ne v0, v1, :cond_0

    .line 222
    return-object v3

    .line 223
    :cond_0
    goto :goto_0

    .line 224
    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method


# virtual methods
.method public a(Lo/eit$b;)Lo/ejl;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/eit$b;)TT;"
        }
    .end annotation

    .line 244
    sget-object v0, Lo/eit$b;->e:Lo/eit$b;

    if-ne p1, v0, :cond_0

    .line 245
    iget-object v0, p0, Lo/eik;->i:Ljava/util/List;

    invoke-virtual {p0, v0}, Lo/eik;->d(Ljava/util/List;)Lo/ejl;

    move-result-object v0

    return-object v0

    .line 246
    :cond_0
    sget-object v0, Lo/eit$b;->b:Lo/eit$b;

    if-ne p1, v0, :cond_1

    .line 247
    iget-object v0, p0, Lo/eik;->i:Ljava/util/List;

    invoke-virtual {p0, v0}, Lo/eik;->e(Ljava/util/List;)Lo/ejl;

    move-result-object v0

    return-object v0

    .line 249
    :cond_1
    iget-object v0, p0, Lo/eik;->i:Ljava/util/List;

    invoke-direct {p0, v0}, Lo/eik;->c(Ljava/util/List;)Lo/ejl;

    move-result-object v0

    return-object v0
.end method

.method public b(Lo/eit$b;)F
    .locals 2

    .line 65
    sget-object v0, Lo/eit$b;->e:Lo/eit$b;

    if-ne p1, v0, :cond_2

    .line 66
    iget v0, p0, Lo/eik;->p:F

    const v1, 0x7f7fffff    # Float.MAX_VALUE

    cmpl-float v0, v0, v1

    if-eqz v0, :cond_0

    .line 67
    iget v0, p0, Lo/eik;->p:F

    return v0

    .line 69
    :cond_0
    iget v0, p0, Lo/eik;->o:F

    const v1, 0x7f7fffff    # Float.MAX_VALUE

    cmpl-float v0, v0, v1

    if-eqz v0, :cond_1

    .line 70
    iget v0, p0, Lo/eik;->o:F

    return v0

    .line 72
    :cond_1
    iget v0, p0, Lo/eik;->n:F

    return v0

    .line 73
    :cond_2
    sget-object v0, Lo/eit$b;->b:Lo/eit$b;

    if-ne p1, v0, :cond_5

    .line 74
    iget v0, p0, Lo/eik;->o:F

    const v1, 0x7f7fffff    # Float.MAX_VALUE

    cmpl-float v0, v0, v1

    if-eqz v0, :cond_3

    .line 75
    iget v0, p0, Lo/eik;->o:F

    return v0

    .line 77
    :cond_3
    iget v0, p0, Lo/eik;->p:F

    const v1, 0x7f7fffff    # Float.MAX_VALUE

    cmpl-float v0, v0, v1

    if-eqz v0, :cond_4

    .line 78
    iget v0, p0, Lo/eik;->p:F

    return v0

    .line 80
    :cond_4
    iget v0, p0, Lo/eik;->n:F

    return v0

    .line 82
    :cond_5
    iget v0, p0, Lo/eik;->n:F

    const v1, 0x7f7fffff    # Float.MAX_VALUE

    cmpl-float v0, v0, v1

    if-eqz v0, :cond_6

    .line 83
    iget v0, p0, Lo/eik;->n:F

    return v0

    .line 85
    :cond_6
    iget v0, p0, Lo/eik;->p:F

    const v1, 0x7f7fffff    # Float.MAX_VALUE

    cmpl-float v0, v0, v1

    if-eqz v0, :cond_7

    .line 86
    iget v0, p0, Lo/eik;->p:F

    return v0

    .line 88
    :cond_7
    iget v0, p0, Lo/eik;->o:F

    return v0
.end method

.method public abstract c(FLo/eie;)Lcom/github/mikephil/charting/data/Entry;
.end method

.method public d(Lo/eit$b;)F
    .locals 2

    .line 94
    sget-object v0, Lo/eit$b;->e:Lo/eit$b;

    if-ne p1, v0, :cond_2

    .line 95
    iget v0, p0, Lo/eik;->k:F

    const v1, -0x800001

    cmpl-float v0, v0, v1

    if-eqz v0, :cond_0

    .line 96
    iget v0, p0, Lo/eik;->k:F

    return v0

    .line 98
    :cond_0
    iget v0, p0, Lo/eik;->m:F

    const v1, -0x800001

    cmpl-float v0, v0, v1

    if-eqz v0, :cond_1

    .line 99
    iget v0, p0, Lo/eik;->m:F

    return v0

    .line 101
    :cond_1
    iget v0, p0, Lo/eik;->l:F

    return v0

    .line 102
    :cond_2
    sget-object v0, Lo/eit$b;->b:Lo/eit$b;

    if-ne p1, v0, :cond_5

    .line 103
    iget v0, p0, Lo/eik;->m:F

    const v1, -0x800001

    cmpl-float v0, v0, v1

    if-eqz v0, :cond_3

    .line 104
    iget v0, p0, Lo/eik;->m:F

    return v0

    .line 106
    :cond_3
    iget v0, p0, Lo/eik;->k:F

    const v1, -0x800001

    cmpl-float v0, v0, v1

    if-eqz v0, :cond_4

    .line 107
    iget v0, p0, Lo/eik;->k:F

    return v0

    .line 109
    :cond_4
    iget v0, p0, Lo/eik;->l:F

    return v0

    .line 111
    :cond_5
    iget v0, p0, Lo/eik;->l:F

    const v1, -0x800001

    cmpl-float v0, v0, v1

    if-eqz v0, :cond_6

    .line 112
    iget v0, p0, Lo/eik;->l:F

    return v0

    .line 114
    :cond_6
    iget v0, p0, Lo/eik;->k:F

    const v1, -0x800001

    cmpl-float v0, v0, v1

    if-eqz v0, :cond_7

    .line 115
    iget v0, p0, Lo/eik;->k:F

    return v0

    .line 117
    :cond_7
    iget v0, p0, Lo/eik;->m:F

    return v0
.end method

.method protected d(Ljava/util/List;)Lo/ejl;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<TT;>;)TT;"
        }
    .end annotation

    .line 228
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/ejl;

    .line 229
    move-object v0, v3

    check-cast v0, Lo/ejo;

    invoke-interface {v0}, Lo/ejo;->e()Lo/eit$b;

    move-result-object v0

    sget-object v1, Lo/eit$b;->e:Lo/eit$b;

    if-ne v0, v1, :cond_0

    .line 230
    return-object v3

    .line 231
    :cond_0
    goto :goto_0

    .line 232
    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public d()V
    .locals 7

    .line 123
    iget-object v0, p0, Lo/eik;->i:Ljava/util/List;

    if-nez v0, :cond_0

    .line 124
    return-void

    .line 126
    :cond_0
    const v0, -0x800001

    iput v0, p0, Lo/eik;->e:F

    .line 127
    const v0, 0x7f7fffff    # Float.MAX_VALUE

    iput v0, p0, Lo/eik;->a:F

    .line 128
    const v0, -0x800001

    iput v0, p0, Lo/eik;->d:F

    .line 129
    const v0, 0x7f7fffff    # Float.MAX_VALUE

    iput v0, p0, Lo/eik;->c:F

    .line 131
    iget-object v0, p0, Lo/eik;->i:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/ejl;

    .line 132
    invoke-virtual {p0, v3}, Lo/eik;->e(Lo/ejl;)V

    .line 133
    goto :goto_0

    .line 135
    :cond_1
    const v0, -0x800001

    iput v0, p0, Lo/eik;->k:F

    .line 136
    const v0, 0x7f7fffff    # Float.MAX_VALUE

    iput v0, p0, Lo/eik;->p:F

    .line 137
    const v0, -0x800001

    iput v0, p0, Lo/eik;->m:F

    .line 138
    const v0, 0x7f7fffff    # Float.MAX_VALUE

    iput v0, p0, Lo/eik;->o:F

    .line 140
    iget-object v0, p0, Lo/eik;->i:Ljava/util/List;

    invoke-virtual {p0, v0}, Lo/eik;->d(Ljava/util/List;)Lo/ejl;

    move-result-object v2

    .line 142
    if-eqz v2, :cond_4

    .line 144
    invoke-interface {v2}, Lo/ejl;->E()F

    move-result v0

    iput v0, p0, Lo/eik;->k:F

    .line 145
    invoke-interface {v2}, Lo/ejl;->F()F

    move-result v0

    iput v0, p0, Lo/eik;->p:F

    .line 147
    iget-object v0, p0, Lo/eik;->i:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/ejl;

    .line 148
    move-object v0, v4

    check-cast v0, Lo/ejo;

    invoke-interface {v0}, Lo/ejo;->e()Lo/eit$b;

    move-result-object v0

    sget-object v1, Lo/eit$b;->e:Lo/eit$b;

    if-ne v0, v1, :cond_3

    .line 149
    invoke-interface {v4}, Lo/ejl;->F()F

    move-result v0

    iget v1, p0, Lo/eik;->p:F

    cmpg-float v0, v0, v1

    if-gez v0, :cond_2

    .line 150
    invoke-interface {v4}, Lo/ejl;->F()F

    move-result v0

    iput v0, p0, Lo/eik;->p:F

    .line 152
    :cond_2
    invoke-interface {v4}, Lo/ejl;->E()F

    move-result v0

    iget v1, p0, Lo/eik;->k:F

    cmpl-float v0, v0, v1

    if-lez v0, :cond_3

    .line 153
    invoke-interface {v4}, Lo/ejl;->E()F

    move-result v0

    iput v0, p0, Lo/eik;->k:F

    .line 155
    :cond_3
    goto :goto_1

    .line 158
    :cond_4
    iget-object v0, p0, Lo/eik;->i:Ljava/util/List;

    invoke-virtual {p0, v0}, Lo/eik;->e(Ljava/util/List;)Lo/ejl;

    move-result-object v3

    .line 160
    if-eqz v3, :cond_7

    .line 162
    invoke-interface {v3}, Lo/ejl;->E()F

    move-result v0

    iput v0, p0, Lo/eik;->m:F

    .line 163
    invoke-interface {v3}, Lo/ejl;->F()F

    move-result v0

    iput v0, p0, Lo/eik;->o:F

    .line 165
    iget-object v0, p0, Lo/eik;->i:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/ejl;

    .line 166
    move-object v0, v5

    check-cast v0, Lo/ejo;

    invoke-interface {v0}, Lo/ejo;->e()Lo/eit$b;

    move-result-object v0

    sget-object v1, Lo/eit$b;->b:Lo/eit$b;

    if-ne v0, v1, :cond_6

    .line 167
    invoke-interface {v5}, Lo/ejl;->F()F

    move-result v0

    iget v1, p0, Lo/eik;->o:F

    cmpg-float v0, v0, v1

    if-gez v0, :cond_5

    .line 168
    invoke-interface {v5}, Lo/ejl;->F()F

    move-result v0

    iput v0, p0, Lo/eik;->o:F

    .line 170
    :cond_5
    invoke-interface {v5}, Lo/ejl;->E()F

    move-result v0

    iget v1, p0, Lo/eik;->m:F

    cmpl-float v0, v0, v1

    if-lez v0, :cond_6

    .line 171
    invoke-interface {v5}, Lo/ejl;->E()F

    move-result v0

    iput v0, p0, Lo/eik;->m:F

    .line 173
    :cond_6
    goto :goto_2

    .line 176
    :cond_7
    iget-object v0, p0, Lo/eik;->i:Ljava/util/List;

    invoke-direct {p0, v0}, Lo/eik;->c(Ljava/util/List;)Lo/ejl;

    move-result-object v4

    .line 178
    if-eqz v4, :cond_a

    .line 180
    invoke-interface {v4}, Lo/ejl;->E()F

    move-result v0

    iput v0, p0, Lo/eik;->l:F

    .line 181
    invoke-interface {v4}, Lo/ejl;->F()F

    move-result v0

    iput v0, p0, Lo/eik;->n:F

    .line 183
    iget-object v0, p0, Lo/eik;->i:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_3
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/ejl;

    .line 184
    move-object v0, v6

    check-cast v0, Lo/ejo;

    invoke-interface {v0}, Lo/ejo;->e()Lo/eit$b;

    move-result-object v0

    sget-object v1, Lo/eit$b;->c:Lo/eit$b;

    if-ne v0, v1, :cond_9

    .line 185
    invoke-interface {v6}, Lo/ejl;->F()F

    move-result v0

    iget v1, p0, Lo/eik;->n:F

    cmpg-float v0, v0, v1

    if-gez v0, :cond_8

    .line 186
    invoke-interface {v6}, Lo/ejl;->F()F

    move-result v0

    iput v0, p0, Lo/eik;->n:F

    .line 188
    :cond_8
    invoke-interface {v6}, Lo/ejl;->E()F

    move-result v0

    iget v1, p0, Lo/eik;->l:F

    cmpl-float v0, v0, v1

    if-lez v0, :cond_9

    .line 189
    invoke-interface {v6}, Lo/ejl;->E()F

    move-result v0

    iput v0, p0, Lo/eik;->l:F

    .line 191
    :cond_9
    goto :goto_3

    .line 193
    :cond_a
    return-void
.end method

.method protected synthetic d(Lo/mz;)V
    .locals 1

    .line 21
    move-object v0, p1

    check-cast v0, Lo/ejl;

    invoke-virtual {p0, v0}, Lo/eik;->e(Lo/ejl;)V

    return-void
.end method

.method protected e(Ljava/util/List;)Lo/ejl;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<TT;>;)TT;"
        }
    .end annotation

    .line 236
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/ejl;

    .line 237
    move-object v0, v3

    check-cast v0, Lo/ejo;

    invoke-interface {v0}, Lo/ejo;->e()Lo/eit$b;

    move-result-object v0

    sget-object v1, Lo/eit$b;->b:Lo/eit$b;

    if-ne v0, v1, :cond_0

    .line 238
    return-object v3

    .line 239
    :cond_0
    goto :goto_0

    .line 240
    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method protected e(Lo/ejl;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .line 292
    iget v0, p0, Lo/eik;->e:F

    invoke-interface {p1}, Lo/ejl;->E()F

    move-result v1

    cmpg-float v0, v0, v1

    if-gez v0, :cond_0

    .line 293
    invoke-interface {p1}, Lo/ejl;->E()F

    move-result v0

    iput v0, p0, Lo/eik;->e:F

    .line 294
    :cond_0
    iget v0, p0, Lo/eik;->a:F

    invoke-interface {p1}, Lo/ejl;->F()F

    move-result v1

    cmpl-float v0, v0, v1

    if-lez v0, :cond_1

    .line 295
    invoke-interface {p1}, Lo/ejl;->F()F

    move-result v0

    iput v0, p0, Lo/eik;->a:F

    .line 297
    :cond_1
    iget v0, p0, Lo/eik;->d:F

    invoke-interface {p1}, Lo/ejl;->H()F

    move-result v1

    cmpg-float v0, v0, v1

    if-gez v0, :cond_2

    .line 298
    invoke-interface {p1}, Lo/ejl;->H()F

    move-result v0

    iput v0, p0, Lo/eik;->d:F

    .line 299
    :cond_2
    iget v0, p0, Lo/eik;->c:F

    invoke-interface {p1}, Lo/ejl;->I()F

    move-result v1

    cmpl-float v0, v0, v1

    if-lez v0, :cond_3

    .line 300
    invoke-interface {p1}, Lo/ejl;->I()F

    move-result v0

    iput v0, p0, Lo/eik;->c:F

    .line 302
    :cond_3
    move-object v0, p1

    check-cast v0, Lo/ejo;

    invoke-interface {v0}, Lo/ejo;->e()Lo/eit$b;

    move-result-object v0

    sget-object v1, Lo/eit$b;->e:Lo/eit$b;

    if-ne v0, v1, :cond_5

    .line 304
    iget v0, p0, Lo/eik;->k:F

    invoke-interface {p1}, Lo/ejl;->E()F

    move-result v1

    cmpg-float v0, v0, v1

    if-gez v0, :cond_4

    .line 305
    invoke-interface {p1}, Lo/ejl;->E()F

    move-result v0

    iput v0, p0, Lo/eik;->k:F

    .line 306
    :cond_4
    iget v0, p0, Lo/eik;->p:F

    invoke-interface {p1}, Lo/ejl;->F()F

    move-result v1

    cmpl-float v0, v0, v1

    if-lez v0, :cond_9

    .line 307
    invoke-interface {p1}, Lo/ejl;->F()F

    move-result v0

    iput v0, p0, Lo/eik;->p:F

    goto :goto_0

    .line 308
    :cond_5
    move-object v0, p1

    check-cast v0, Lo/ejo;

    invoke-interface {v0}, Lo/ejo;->e()Lo/eit$b;

    move-result-object v0

    sget-object v1, Lo/eit$b;->b:Lo/eit$b;

    if-ne v0, v1, :cond_7

    .line 309
    iget v0, p0, Lo/eik;->m:F

    invoke-interface {p1}, Lo/ejl;->E()F

    move-result v1

    cmpg-float v0, v0, v1

    if-gez v0, :cond_6

    .line 310
    invoke-interface {p1}, Lo/ejl;->E()F

    move-result v0

    iput v0, p0, Lo/eik;->m:F

    .line 311
    :cond_6
    iget v0, p0, Lo/eik;->o:F

    invoke-interface {p1}, Lo/ejl;->F()F

    move-result v1

    cmpl-float v0, v0, v1

    if-lez v0, :cond_9

    .line 312
    invoke-interface {p1}, Lo/ejl;->F()F

    move-result v0

    iput v0, p0, Lo/eik;->o:F

    goto :goto_0

    .line 314
    :cond_7
    iget v0, p0, Lo/eik;->l:F

    invoke-interface {p1}, Lo/ejl;->E()F

    move-result v1

    cmpg-float v0, v0, v1

    if-gez v0, :cond_8

    .line 315
    invoke-interface {p1}, Lo/ejl;->E()F

    move-result v0

    iput v0, p0, Lo/eik;->l:F

    .line 316
    :cond_8
    iget v0, p0, Lo/eik;->n:F

    invoke-interface {p1}, Lo/ejl;->F()F

    move-result v1

    cmpl-float v0, v0, v1

    if-lez v0, :cond_9

    .line 317
    invoke-interface {p1}, Lo/ejl;->F()F

    move-result v0

    iput v0, p0, Lo/eik;->n:F

    .line 319
    :cond_9
    :goto_0
    return-void
.end method

.method public f()F
    .locals 5

    .line 345
    iget-object v0, p0, Lo/eik;->i:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/eik;->i:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 346
    :cond_0
    iget v0, p0, Lo/eik;->d:F

    return v0

    .line 348
    :cond_1
    iget v1, p0, Lo/eik;->d:F

    .line 349
    iget-object v0, p0, Lo/eik;->i:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/ejl;

    .line 350
    instance-of v0, v3, Lo/ejo;

    if-nez v0, :cond_2

    .line 351
    goto :goto_0

    .line 353
    :cond_2
    move-object v4, v3

    check-cast v4, Lo/ejo;

    .line 355
    invoke-interface {v4}, Lo/ejo;->d()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 356
    invoke-interface {v4}, Lo/ejo;->c()F

    move-result v0

    cmpl-float v0, v0, v1

    if-lez v0, :cond_3

    .line 357
    invoke-interface {v4}, Lo/ejo;->c()F

    move-result v1

    .line 360
    :cond_3
    goto :goto_0

    .line 361
    :cond_4
    return v1
.end method

.method public q()F
    .locals 1

    .line 208
    sget-object v0, Lo/eit$b;->b:Lo/eit$b;

    invoke-virtual {p0, v0}, Lo/eik;->b(Lo/eit$b;)F

    move-result v0

    return v0
.end method

.method public r()F
    .locals 1

    .line 196
    sget-object v0, Lo/eit$b;->e:Lo/eit$b;

    invoke-virtual {p0, v0}, Lo/eik;->d(Lo/eit$b;)F

    move-result v0

    return v0
.end method

.method public s()F
    .locals 1

    .line 212
    sget-object v0, Lo/eit$b;->c:Lo/eit$b;

    invoke-virtual {p0, v0}, Lo/eik;->d(Lo/eit$b;)F

    move-result v0

    return v0
.end method

.method public t()F
    .locals 1

    .line 200
    sget-object v0, Lo/eit$b;->e:Lo/eit$b;

    invoke-virtual {p0, v0}, Lo/eik;->b(Lo/eit$b;)F

    move-result v0

    return v0
.end method

.method public u()F
    .locals 1

    .line 204
    sget-object v0, Lo/eit$b;->b:Lo/eit$b;

    invoke-virtual {p0, v0}, Lo/eik;->d(Lo/eit$b;)F

    move-result v0

    return v0
.end method

.method public x()F
    .locals 1

    .line 216
    sget-object v0, Lo/eit$b;->c:Lo/eit$b;

    invoke-virtual {p0, v0}, Lo/eik;->b(Lo/eit$b;)F

    move-result v0

    return v0
.end method
