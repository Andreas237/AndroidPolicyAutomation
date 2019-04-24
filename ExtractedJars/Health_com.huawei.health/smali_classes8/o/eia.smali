.class public Lo/eia;
.super Lo/eik;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/eik<Lo/eii<Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;>;>;"
    }
.end annotation


# instance fields
.field private t:Lo/ehq;

.field private u:Lo/ela;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 60
    invoke-direct {p0}, Lo/eik;-><init>()V

    .line 61
    return-void
.end method


# virtual methods
.method public a()V
    .locals 5

    .line 196
    invoke-virtual {p0}, Lo/eia;->n()Ljava/util/List;

    move-result-object v1

    .line 198
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/eik;

    .line 199
    invoke-virtual {v3}, Lo/eik;->h()Ljava/util/List;

    move-result-object v4

    .line 200
    iget-object v0, p0, Lo/eia;->i:Ljava/util/List;

    invoke-interface {v0, v4}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 201
    goto :goto_0

    .line 202
    :cond_0
    return-void
.end method

.method public b()V
    .locals 1

    .line 267
    iget-object v0, p0, Lo/eia;->u:Lo/ela;

    if-eqz v0, :cond_0

    .line 268
    iget-object v0, p0, Lo/eia;->u:Lo/ela;

    invoke-virtual {v0}, Lo/ela;->b()V

    .line 269
    :cond_0
    iget-object v0, p0, Lo/eia;->t:Lo/ehq;

    if-eqz v0, :cond_1

    .line 270
    iget-object v0, p0, Lo/eia;->t:Lo/ehq;

    invoke-virtual {v0}, Lo/ehq;->b()V

    .line 278
    :cond_1
    invoke-virtual {p0}, Lo/eia;->d()V

    .line 279
    return-void
.end method

.method public c(FLo/eie;)Lcom/github/mikephil/charting/data/Entry;
    .locals 8

    .line 319
    new-instance v3, Lcom/huawei/ui/commonui/linechart/common/HwEntrys;

    invoke-direct {v3}, Lcom/huawei/ui/commonui/linechart/common/HwEntrys;-><init>()V

    .line 320
    iget-object v0, p0, Lo/eia;->i:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_0
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/ejl;

    .line 323
    instance-of v0, v5, Lo/ekz;

    if-eqz v0, :cond_1

    .line 324
    invoke-interface {v5, p2}, Lo/ejl;->b(Lo/eie;)Lo/ejq;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lo/ejs;

    .line 325
    invoke-interface {v7, p1}, Lo/ejs;->a(F)Ljava/util/List;

    move-result-object v6

    .line 326
    goto :goto_1

    .line 327
    :cond_1
    invoke-interface {v5, p1}, Lo/ejl;->e(F)Ljava/util/List;

    move-result-object v6

    .line 330
    :goto_1
    if-eqz v6, :cond_2

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_4

    .line 331
    :cond_2
    instance-of v0, v5, Lo/ehn;

    if-eqz v0, :cond_3

    .line 333
    new-instance v0, Lcom/huawei/ui/commonui/linechart/common/HwEntrys$HwDataEntry;

    move-object v1, v5

    check-cast v1, Lo/ehn;

    const/4 v2, 0x0

    invoke-direct {v0, v2, v1}, Lcom/huawei/ui/commonui/linechart/common/HwEntrys$HwDataEntry;-><init>(Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;Lcom/huawei/ui/commonui/linechart/common/HwEntrys$b;)V

    invoke-virtual {v3, v0}, Lcom/huawei/ui/commonui/linechart/common/HwEntrys;->add(Lcom/huawei/ui/commonui/linechart/common/HwEntrys$HwDataEntry;)V

    goto :goto_0

    .line 334
    :cond_3
    instance-of v0, v5, Lo/elb;

    if-eqz v0, :cond_0

    .line 335
    new-instance v0, Lcom/huawei/ui/commonui/linechart/common/HwEntrys$HwDataEntry;

    move-object v1, v5

    check-cast v1, Lo/elb;

    const/4 v2, 0x0

    invoke-direct {v0, v2, v1}, Lcom/huawei/ui/commonui/linechart/common/HwEntrys$HwDataEntry;-><init>(Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;Lcom/huawei/ui/commonui/linechart/common/HwEntrys$b;)V

    invoke-virtual {v3, v0}, Lcom/huawei/ui/commonui/linechart/common/HwEntrys;->add(Lcom/huawei/ui/commonui/linechart/common/HwEntrys$HwDataEntry;)V

    goto/16 :goto_0

    .line 339
    :cond_4
    instance-of v0, v5, Lo/ehn;

    if-eqz v0, :cond_5

    .line 340
    new-instance v0, Lcom/huawei/ui/commonui/linechart/common/HwEntrys$HwDataEntry;

    const/4 v1, 0x0

    invoke-interface {v6, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;

    move-object v2, v5

    check-cast v2, Lo/ehn;

    invoke-direct {v0, v1, v2}, Lcom/huawei/ui/commonui/linechart/common/HwEntrys$HwDataEntry;-><init>(Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;Lcom/huawei/ui/commonui/linechart/common/HwEntrys$b;)V

    invoke-virtual {v3, v0}, Lcom/huawei/ui/commonui/linechart/common/HwEntrys;->add(Lcom/huawei/ui/commonui/linechart/common/HwEntrys$HwDataEntry;)V

    goto :goto_2

    .line 341
    :cond_5
    instance-of v0, v5, Lo/elb;

    if-eqz v0, :cond_6

    .line 342
    new-instance v0, Lcom/huawei/ui/commonui/linechart/common/HwEntrys$HwDataEntry;

    const/4 v1, 0x0

    invoke-interface {v6, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;

    move-object v2, v5

    check-cast v2, Lo/elb;

    invoke-direct {v0, v1, v2}, Lcom/huawei/ui/commonui/linechart/common/HwEntrys$HwDataEntry;-><init>(Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;Lcom/huawei/ui/commonui/linechart/common/HwEntrys$b;)V

    invoke-virtual {v3, v0}, Lcom/huawei/ui/commonui/linechart/common/HwEntrys;->add(Lcom/huawei/ui/commonui/linechart/common/HwEntrys$HwDataEntry;)V

    .line 344
    :cond_6
    :goto_2
    goto/16 :goto_0

    .line 345
    :cond_7
    return-object v3
.end method

.method public d(Lo/mh;)Lcom/github/mikephil/charting/data/Entry;
    .locals 8

    .line 290
    invoke-virtual {p1}, Lo/mh;->a()I

    move-result v0

    invoke-virtual {p0}, Lo/eia;->n()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-lt v0, v1, :cond_0

    .line 291
    const/4 v0, 0x0

    return-object v0

    .line 293
    :cond_0
    invoke-virtual {p1}, Lo/mh;->a()I

    move-result v0

    invoke-virtual {p0, v0}, Lo/eia;->d(I)Lo/lt;

    move-result-object v4

    .line 295
    invoke-virtual {p1}, Lo/mh;->g()I

    move-result v0

    invoke-virtual {v4}, Lo/ma;->e()I

    move-result v1

    if-lt v0, v1, :cond_1

    .line 296
    const/4 v0, 0x0

    return-object v0

    .line 301
    :cond_1
    invoke-virtual {p1}, Lo/mh;->g()I

    move-result v0

    invoke-virtual {v4, v0}, Lo/ma;->a(I)Lo/mz;

    move-result-object v0

    .line 302
    invoke-virtual {p1}, Lo/mh;->b()F

    move-result v1

    invoke-interface {v0, v1}, Lo/mz;->e(F)Ljava/util/List;

    move-result-object v5

    .line 304
    const/4 v0, 0x0

    if-eq v0, v5, :cond_2

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_3

    .line 305
    :cond_2
    const-string v0, "HwHealthCombinedData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getEntryForHighlight() entries is null!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 306
    const/4 v0, 0x0

    return-object v0

    .line 308
    :cond_3
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/github/mikephil/charting/data/Entry;

    .line 309
    invoke-virtual {v7}, Lcom/github/mikephil/charting/data/Entry;->getY()F

    move-result v0

    invoke-virtual {p1}, Lo/mh;->d()F

    move-result v1

    cmpl-float v0, v0, v1

    if-eqz v0, :cond_4

    .line 310
    invoke-virtual {p1}, Lo/mh;->d()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 311
    :cond_4
    return-object v7

    .line 309
    :cond_5
    goto :goto_0

    .line 313
    :cond_6
    const/4 v0, 0x0

    return-object v0
.end method

.method public d(I)Lo/lt;
    .locals 1

    .line 262
    invoke-virtual {p0}, Lo/eia;->n()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/lt;

    return-object v0
.end method

.method public d()V
    .locals 6

    .line 148
    iget-object v0, p0, Lo/eia;->i:Ljava/util/List;

    if-nez v0, :cond_0

    .line 149
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/eia;->i:Ljava/util/List;

    .line 151
    :cond_0
    iget-object v0, p0, Lo/eia;->i:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 153
    const v0, -0x800001

    iput v0, p0, Lo/eia;->e:F

    .line 154
    const v0, 0x7f7fffff    # Float.MAX_VALUE

    iput v0, p0, Lo/eia;->a:F

    .line 155
    const v0, -0x800001

    iput v0, p0, Lo/eia;->d:F

    .line 156
    const v0, 0x7f7fffff    # Float.MAX_VALUE

    iput v0, p0, Lo/eia;->c:F

    .line 158
    const v0, -0x800001

    iput v0, p0, Lo/eia;->k:F

    .line 159
    const v0, 0x7f7fffff    # Float.MAX_VALUE

    iput v0, p0, Lo/eia;->p:F

    .line 161
    const v0, -0x800001

    iput v0, p0, Lo/eia;->m:F

    .line 162
    const v0, 0x7f7fffff    # Float.MAX_VALUE

    iput v0, p0, Lo/eia;->o:F

    .line 164
    const v0, -0x800001

    iput v0, p0, Lo/eia;->l:F

    .line 165
    const v0, 0x7f7fffff    # Float.MAX_VALUE

    iput v0, p0, Lo/eia;->n:F

    .line 167
    invoke-virtual {p0}, Lo/eia;->n()Ljava/util/List;

    move-result-object v2

    .line 169
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/eik;

    .line 171
    invoke-virtual {v4}, Lo/eik;->d()V

    .line 173
    invoke-virtual {v4}, Lo/eik;->h()Ljava/util/List;

    move-result-object v5

    .line 174
    iget-object v0, p0, Lo/eia;->i:Ljava/util/List;

    invoke-interface {v0, v5}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 176
    invoke-virtual {v4}, Lo/eik;->r()F

    move-result v0

    iget v1, p0, Lo/eia;->k:F

    cmpl-float v0, v0, v1

    if-lez v0, :cond_1

    .line 177
    invoke-virtual {v4}, Lo/eik;->r()F

    move-result v0

    iput v0, p0, Lo/eia;->k:F

    .line 178
    :cond_1
    invoke-virtual {v4}, Lo/eik;->t()F

    move-result v0

    iget v1, p0, Lo/eia;->p:F

    cmpg-float v0, v0, v1

    if-gez v0, :cond_2

    .line 179
    invoke-virtual {v4}, Lo/eik;->t()F

    move-result v0

    iput v0, p0, Lo/eia;->p:F

    .line 182
    :cond_2
    invoke-virtual {v4}, Lo/eik;->u()F

    move-result v0

    iget v1, p0, Lo/eia;->m:F

    cmpl-float v0, v0, v1

    if-lez v0, :cond_3

    .line 183
    invoke-virtual {v4}, Lo/eik;->u()F

    move-result v0

    iput v0, p0, Lo/eia;->m:F

    .line 184
    :cond_3
    invoke-virtual {v4}, Lo/eik;->q()F

    move-result v0

    iget v1, p0, Lo/eia;->o:F

    cmpg-float v0, v0, v1

    if-gez v0, :cond_4

    .line 185
    invoke-virtual {v4}, Lo/eik;->q()F

    move-result v0

    iput v0, p0, Lo/eia;->o:F

    .line 187
    :cond_4
    invoke-virtual {v4}, Lo/eik;->s()F

    move-result v0

    iget v1, p0, Lo/eia;->l:F

    cmpl-float v0, v0, v1

    if-lez v0, :cond_5

    .line 188
    invoke-virtual {v4}, Lo/eik;->s()F

    move-result v0

    iput v0, p0, Lo/eia;->l:F

    .line 189
    :cond_5
    invoke-virtual {v4}, Lo/eik;->x()F

    move-result v0

    iget v1, p0, Lo/eia;->n:F

    cmpg-float v0, v0, v1

    if-gez v0, :cond_6

    .line 190
    invoke-virtual {v4}, Lo/eik;->x()F

    move-result v0

    iput v0, p0, Lo/eia;->n:F

    .line 192
    :cond_6
    goto/16 :goto_0

    .line 193
    :cond_7
    return-void
.end method

.method public d(Lo/ehn;)V
    .locals 1

    .line 227
    iget-object v0, p0, Lo/eia;->t:Lo/ehq;

    invoke-virtual {v0}, Lo/ehq;->h()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 228
    invoke-virtual {p0}, Lo/eia;->b()V

    .line 229
    return-void
.end method

.method public d(Lo/ehq;)V
    .locals 0

    .line 69
    iput-object p1, p0, Lo/eia;->t:Lo/ehq;

    .line 70
    invoke-virtual {p0}, Lo/eia;->b()V

    .line 71
    return-void
.end method

.method public d(Lo/ela;)V
    .locals 0

    .line 64
    iput-object p1, p0, Lo/eia;->u:Lo/ela;

    .line 65
    invoke-virtual {p0}, Lo/eia;->b()V

    .line 66
    return-void
.end method

.method public l()Lo/ehq;
    .locals 1

    .line 218
    iget-object v0, p0, Lo/eia;->t:Lo/ehq;

    return-object v0
.end method

.method public m()V
    .locals 1

    .line 213
    iget-object v0, p0, Lo/eia;->u:Lo/ela;

    invoke-virtual {v0}, Lo/ela;->h()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 214
    invoke-virtual {p0}, Lo/eia;->b()V

    .line 215
    return-void
.end method

.method public n()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lo/eik;>;"
        }
    .end annotation

    .line 246
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 247
    iget-object v0, p0, Lo/eia;->t:Lo/ehq;

    if-eqz v0, :cond_0

    .line 248
    iget-object v0, p0, Lo/eia;->t:Lo/ehq;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 249
    :cond_0
    iget-object v0, p0, Lo/eia;->u:Lo/ela;

    if-eqz v0, :cond_1

    .line 250
    iget-object v0, p0, Lo/eia;->u:Lo/ela;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 258
    :cond_1
    return-object v1
.end method

.method public p()Lo/ela;
    .locals 1

    .line 209
    iget-object v0, p0, Lo/eia;->u:Lo/ela;

    return-object v0
.end method
