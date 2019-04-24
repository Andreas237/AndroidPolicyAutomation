.class Lo/fbc$b;
.super Lo/elg;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/fbc;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation


# instance fields
.field private a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/github/mikephil/charting/data/Entry;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(II)V
    .locals 1

    .line 202
    invoke-direct {p0}, Lo/elg;-><init>()V

    .line 200
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/fbc$b;->a:Ljava/util/List;

    .line 205
    return-void
.end method


# virtual methods
.method public e(Lcom/github/mikephil/charting/data/Entry;)V
    .locals 1

    .line 208
    iget-object v0, p0, Lo/fbc$b;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 209
    return-void
.end method

.method public f()F
    .locals 2

    .line 235
    invoke-virtual {p0}, Lo/fbc$b;->g()Lcom/github/mikephil/charting/data/Entry;

    move-result-object v1

    .line 236
    if-nez v1, :cond_0

    .line 237
    const v0, -0x800001

    return v0

    .line 239
    :cond_0
    invoke-virtual {v1}, Lcom/github/mikephil/charting/data/Entry;->getY()F

    move-result v0

    return v0
.end method

.method public g()Lcom/github/mikephil/charting/data/Entry;
    .locals 5

    .line 244
    iget-object v0, p0, Lo/fbc$b;->a:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/fbc$b;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 245
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 248
    :cond_1
    const/4 v1, 0x0

    .line 249
    const v2, -0x800001

    .line 251
    iget-object v0, p0, Lo/fbc$b;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/github/mikephil/charting/data/Entry;

    .line 252
    invoke-virtual {v4}, Lcom/github/mikephil/charting/data/Entry;->getY()F

    move-result v0

    cmpl-float v0, v0, v2

    if-lez v0, :cond_2

    .line 253
    invoke-virtual {v4}, Lcom/github/mikephil/charting/data/Entry;->getY()F

    move-result v2

    .line 254
    move-object v1, v4

    .line 256
    :cond_2
    goto :goto_0

    .line 257
    :cond_3
    return-object v1
.end method

.method public h()V
    .locals 3

    .line 212
    iget-object v0, p0, Lo/fbc$b;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_0

    .line 213
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "no data,genSamplingPoint failed"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 216
    :cond_0
    iget-object v0, p0, Lo/fbc$b;->a:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/github/mikephil/charting/data/Entry;

    .line 217
    invoke-virtual {v2}, Lcom/github/mikephil/charting/data/Entry;->getX()F

    move-result v0

    invoke-virtual {v2}, Lcom/github/mikephil/charting/data/Entry;->getY()F

    move-result v1

    invoke-virtual {p0, v0, v1, v2}, Lo/fbc$b;->b(FFLcom/github/mikephil/charting/data/Entry;)V

    .line 218
    return-void
.end method

.method public i()Lcom/github/mikephil/charting/data/Entry;
    .locals 2

    .line 228
    iget-object v0, p0, Lo/fbc$b;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_0

    .line 229
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "no data,getFirstEntry failed"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 231
    :cond_0
    iget-object v0, p0, Lo/fbc$b;->a:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/github/mikephil/charting/data/Entry;

    return-object v0
.end method

.method public k()Lcom/github/mikephil/charting/data/Entry;
    .locals 3

    .line 221
    iget-object v0, p0, Lo/fbc$b;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_0

    .line 222
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "no data,getLastEntry failed"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 224
    :cond_0
    iget-object v0, p0, Lo/fbc$b;->a:Ljava/util/List;

    iget-object v1, p0, Lo/fbc$b;->a:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/github/mikephil/charting/data/Entry;

    return-object v0
.end method

.method public l()V
    .locals 3

    .line 295
    invoke-virtual {p0}, Lo/fbc$b;->o()Lcom/github/mikephil/charting/data/Entry;

    move-result-object v2

    .line 296
    if-nez v2, :cond_0

    .line 297
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "genSamplingPointAsMin null"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 299
    :cond_0
    invoke-virtual {v2}, Lcom/github/mikephil/charting/data/Entry;->getX()F

    move-result v0

    invoke-virtual {v2}, Lcom/github/mikephil/charting/data/Entry;->getY()F

    move-result v1

    invoke-virtual {p0, v0, v1, v2}, Lo/fbc$b;->b(FFLcom/github/mikephil/charting/data/Entry;)V

    .line 300
    return-void
.end method

.method public m()V
    .locals 3

    .line 287
    invoke-virtual {p0}, Lo/fbc$b;->g()Lcom/github/mikephil/charting/data/Entry;

    move-result-object v2

    .line 288
    if-nez v2, :cond_0

    .line 289
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "genSamplingPointAsMax null"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 291
    :cond_0
    invoke-virtual {v2}, Lcom/github/mikephil/charting/data/Entry;->getX()F

    move-result v0

    invoke-virtual {v2}, Lcom/github/mikephil/charting/data/Entry;->getY()F

    move-result v1

    invoke-virtual {p0, v0, v1, v2}, Lo/fbc$b;->b(FFLcom/github/mikephil/charting/data/Entry;)V

    .line 292
    return-void
.end method

.method public n()F
    .locals 2

    .line 261
    invoke-virtual {p0}, Lo/fbc$b;->o()Lcom/github/mikephil/charting/data/Entry;

    move-result-object v1

    .line 262
    if-nez v1, :cond_0

    .line 263
    const v0, 0x7f7fffff    # Float.MAX_VALUE

    return v0

    .line 265
    :cond_0
    invoke-virtual {v1}, Lcom/github/mikephil/charting/data/Entry;->getY()F

    move-result v0

    return v0
.end method

.method public o()Lcom/github/mikephil/charting/data/Entry;
    .locals 5

    .line 270
    iget-object v0, p0, Lo/fbc$b;->a:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/fbc$b;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 271
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 274
    :cond_1
    const/4 v1, 0x0

    .line 275
    const v2, 0x7f7fffff    # Float.MAX_VALUE

    .line 277
    iget-object v0, p0, Lo/fbc$b;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/github/mikephil/charting/data/Entry;

    .line 278
    invoke-virtual {v4}, Lcom/github/mikephil/charting/data/Entry;->getY()F

    move-result v0

    cmpg-float v0, v0, v2

    if-gez v0, :cond_2

    .line 279
    invoke-virtual {v4}, Lcom/github/mikephil/charting/data/Entry;->getY()F

    move-result v2

    .line 280
    move-object v1, v4

    .line 282
    :cond_2
    goto :goto_0

    .line 283
    :cond_3
    return-object v1
.end method
