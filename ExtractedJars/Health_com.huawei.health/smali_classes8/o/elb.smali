.class public Lo/elb;
.super Lo/ekv;
.source "SourceFile"

# interfaces
.implements Lo/ejo;
.implements Lcom/huawei/ui/commonui/linechart/common/HwEntrys$b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/elb$c;,
        Lo/elb$b;
    }
.end annotation


# instance fields
.field private A:I

.field private B:Z

.field private C:I

.field private D:Z

.field private E:Z

.field private F:Z

.field private G:Landroid/graphics/drawable/GradientDrawable;

.field private H:Landroid/graphics/drawable/GradientDrawable;

.field private I:I

.field private J:Z

.field private K:Lo/elb$b;

.field private L:F

.field private M:Lo/elb$c;

.field private N:Lo/elb$c;

.field private j:Lo/ejs;

.field private w:Lo/eit$b;

.field private x:Lo/eks;

.field private z:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Ljava/util/List<Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;>;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V"
        }
    .end annotation

    .line 57
    invoke-direct {p0, p2, p4}, Lo/ekv;-><init>(Ljava/util/List;Ljava/lang/String;)V

    .line 37
    new-instance v0, Lo/eks;

    invoke-direct {v0}, Lo/eks;-><init>()V

    iput-object v0, p0, Lo/elb;->x:Lo/eks;

    .line 42
    const/4 v0, 0x0

    iput v0, p0, Lo/elb;->z:I

    .line 44
    const v0, 0x7fffffff

    iput v0, p0, Lo/elb;->C:I

    .line 45
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/elb;->D:Z

    .line 46
    const/4 v0, 0x0

    iput v0, p0, Lo/elb;->A:I

    .line 48
    const/4 v0, 0x0

    iput-object v0, p0, Lo/elb;->j:Lo/ejs;

    .line 208
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/elb;->B:Z

    .line 214
    const/4 v0, 0x0

    iput-object v0, p0, Lo/elb;->G:Landroid/graphics/drawable/GradientDrawable;

    .line 215
    const/4 v0, 0x0

    iput-object v0, p0, Lo/elb;->H:Landroid/graphics/drawable/GradientDrawable;

    .line 228
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/elb;->E:Z

    .line 230
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/elb;->F:Z

    .line 270
    const/4 v0, 0x0

    iput v0, p0, Lo/elb;->I:I

    .line 299
    new-instance v0, Lo/elb$4;

    invoke-direct {v0, p0}, Lo/elb$4;-><init>(Lo/elb;)V

    iput-object v0, p0, Lo/elb;->K:Lo/elb$b;

    .line 347
    new-instance v0, Lo/elb$3;

    invoke-direct {v0, p0}, Lo/elb$3;-><init>(Lo/elb;)V

    iput-object v0, p0, Lo/elb;->M:Lo/elb$c;

    .line 365
    new-instance v0, Lo/elb$5;

    invoke-direct {v0, p0}, Lo/elb$5;-><init>(Lo/elb;)V

    iput-object v0, p0, Lo/elb;->N:Lo/elb$c;

    .line 462
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/elb;->J:Z

    .line 469
    const/high16 v0, 0x43960000    # 300.0f

    iput v0, p0, Lo/elb;->L:F

    .line 58
    invoke-direct {p0, p2, p3, p5}, Lo/elb;->d(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V

    .line 59
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Ljava/util/List<Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;>;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V"
        }
    .end annotation

    .line 51
    invoke-direct {p0, p2, p4}, Lo/ekv;-><init>(Ljava/util/List;Ljava/lang/String;)V

    .line 37
    new-instance v0, Lo/eks;

    invoke-direct {v0}, Lo/eks;-><init>()V

    iput-object v0, p0, Lo/elb;->x:Lo/eks;

    .line 42
    const/4 v0, 0x0

    iput v0, p0, Lo/elb;->z:I

    .line 44
    const v0, 0x7fffffff

    iput v0, p0, Lo/elb;->C:I

    .line 45
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/elb;->D:Z

    .line 46
    const/4 v0, 0x0

    iput v0, p0, Lo/elb;->A:I

    .line 48
    const/4 v0, 0x0

    iput-object v0, p0, Lo/elb;->j:Lo/ejs;

    .line 208
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/elb;->B:Z

    .line 214
    const/4 v0, 0x0

    iput-object v0, p0, Lo/elb;->G:Landroid/graphics/drawable/GradientDrawable;

    .line 215
    const/4 v0, 0x0

    iput-object v0, p0, Lo/elb;->H:Landroid/graphics/drawable/GradientDrawable;

    .line 228
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/elb;->E:Z

    .line 230
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/elb;->F:Z

    .line 270
    const/4 v0, 0x0

    iput v0, p0, Lo/elb;->I:I

    .line 299
    new-instance v0, Lo/elb$4;

    invoke-direct {v0, p0}, Lo/elb$4;-><init>(Lo/elb;)V

    iput-object v0, p0, Lo/elb;->K:Lo/elb$b;

    .line 347
    new-instance v0, Lo/elb$3;

    invoke-direct {v0, p0}, Lo/elb$3;-><init>(Lo/elb;)V

    iput-object v0, p0, Lo/elb;->M:Lo/elb$c;

    .line 365
    new-instance v0, Lo/elb$5;

    invoke-direct {v0, p0}, Lo/elb$5;-><init>(Lo/elb;)V

    iput-object v0, p0, Lo/elb;->N:Lo/elb$c;

    .line 462
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/elb;->J:Z

    .line 469
    const/high16 v0, 0x43960000    # 300.0f

    iput v0, p0, Lo/elb;->L:F

    .line 52
    iput p6, p0, Lo/elb;->z:I

    .line 53
    invoke-direct {p0, p2, p3, p5}, Lo/elb;->d(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V

    .line 54
    return-void
.end method

.method private d(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;>;Ljava/lang/String;Ljava/lang/String;)V"
        }
    .end annotation

    .line 75
    invoke-virtual {p0}, Lo/elb;->ab()Ljava/util/List;

    move-result-object v4

    .line 76
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;

    .line 77
    new-instance v0, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;

    invoke-virtual {v6}, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;->getX()F

    move-result v1

    invoke-virtual {v6}, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;->getY()F

    move-result v2

    invoke-virtual {v6}, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;->getData()Ljava/lang/Object;

    move-result-object v3

    invoke-direct {v0, v1, v2, v3}, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;-><init>(FFLjava/lang/Object;)V

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 78
    goto :goto_0

    .line 79
    :cond_0
    iget-object v0, p0, Lo/elb;->x:Lo/eks;

    iput-object p2, v0, Lo/eks;->e:Ljava/lang/String;

    .line 80
    iget-object v0, p0, Lo/elb;->x:Lo/eks;

    iput-object p3, v0, Lo/eks;->a:Ljava/lang/String;

    .line 82
    const v0, -0xffff01

    invoke-virtual {p0, v0}, Lo/elb;->c(I)V

    .line 83
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/elb;->i(Z)V

    .line 84
    const v0, -0xffff01

    invoke-virtual {p0, v0}, Lo/elb;->i(I)V

    .line 87
    const/high16 v0, 0x40000000    # 2.0f

    invoke-virtual {p0, v0}, Lo/elb;->c(F)V

    .line 89
    const/high16 v0, 0x40000000    # 2.0f

    invoke-virtual {p0, v0}, Lo/elb;->i(F)V

    .line 90
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/elb;->f(Z)V

    .line 91
    const/high16 v0, 0x41100000    # 9.0f

    invoke-virtual {p0, v0}, Lo/elb;->d(F)V

    .line 93
    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {p0, v0}, Lo/elb;->a(F)V

    .line 94
    new-instance v0, Landroid/graphics/DashPathEffect;

    const/4 v1, 0x2

    new-array v1, v1, [F

    fill-array-data v1, :array_0

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Landroid/graphics/DashPathEffect;-><init>([FF)V

    invoke-virtual {p0, v0}, Lo/elb;->b(Landroid/graphics/DashPathEffect;)V

    .line 95
    const/high16 v0, 0x41700000    # 15.0f

    invoke-virtual {p0, v0}, Lo/elb;->b(F)V

    .line 96
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/elb;->e(Z)V

    .line 97
    sget-object v0, Lo/eit$b;->e:Lo/eit$b;

    invoke-virtual {p0, v0}, Lo/elb;->c(Lo/eit$b;)V

    .line 98
    sget-object v0, Lo/ekv$a;->c:Lo/ekv$a;

    invoke-virtual {p0, v0}, Lo/elb;->e(Lo/ekv$a;)V

    .line 99
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/elb;->b(Z)V

    .line 100
    const v0, -0x777778

    invoke-virtual {p0, v0}, Lo/elb;->d(I)V

    .line 101
    const/16 v0, 0xff

    invoke-virtual {p0, v0}, Lo/elb;->g(I)V

    .line 102
    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {p0, v0}, Lo/elb;->f(F)V

    .line 104
    sget-object v0, Lo/lm$c;->a:Lo/lm$c;

    invoke-virtual {p0, v0}, Lo/elb;->c(Lo/lm$c;)V

    .line 105
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/elb;->c(Z)V

    .line 106
    return-void

    :array_0
    .array-data 4
        0x41200000    # 10.0f
        0x40a00000    # 5.0f
    .end array-data
.end method


# virtual methods
.method public D()Lo/lp$b;
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 263
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "HwHealthLineDataSet getAxisDependency Deprecated"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public J()I
    .locals 3

    .line 521
    invoke-virtual {p0}, Lo/elb;->af()Lo/eks;

    move-result-object v2

    .line 523
    iget-boolean v0, v2, Lo/eks;->b:Z

    if-eqz v0, :cond_0

    .line 524
    iget v1, v2, Lo/eks;->c:I

    goto :goto_0

    .line 526
    :cond_0
    iget v1, v2, Lo/eks;->h:I

    .line 529
    :goto_0
    return v1
.end method

.method protected M()V
    .locals 1

    .line 535
    iget-object v0, p0, Lo/elb;->j:Lo/ejs;

    if-eqz v0, :cond_0

    .line 536
    iget-object v0, p0, Lo/elb;->j:Lo/ejs;

    invoke-interface {v0}, Lo/ejs;->a()V

    .line 537
    iget-object v0, p0, Lo/elb;->j:Lo/ejs;

    invoke-interface {v0, p0}, Lo/ejs;->e(Lo/elb;)V

    .line 539
    :cond_0
    return-void
.end method

.method public N()I
    .locals 1

    .line 277
    iget v0, p0, Lo/elb;->I:I

    return v0
.end method

.method public a()I
    .locals 2

    .line 508
    invoke-virtual {p0}, Lo/elb;->af()Lo/eks;

    move-result-object v0

    .line 509
    iget v1, v0, Lo/eks;->c:I

    .line 510
    return v1
.end method

.method public a(IZ)V
    .locals 0

    .line 283
    iput-boolean p2, p0, Lo/elb;->D:Z

    .line 284
    iput p1, p0, Lo/elb;->A:I

    .line 285
    return-void
.end method

.method public ad()Landroid/graphics/drawable/GradientDrawable;
    .locals 1

    .line 218
    iget-object v0, p0, Lo/elb;->G:Landroid/graphics/drawable/GradientDrawable;

    return-object v0
.end method

.method public af()Lo/eks;
    .locals 1

    .line 70
    iget-object v0, p0, Lo/elb;->x:Lo/eks;

    return-object v0
.end method

.method public ag()Z
    .locals 1

    .line 211
    iget-boolean v0, p0, Lo/elb;->B:Z

    return v0
.end method

.method public ah()I
    .locals 1

    .line 66
    iget v0, p0, Lo/elb;->z:I

    return v0
.end method

.method public ai()Z
    .locals 2

    .line 323
    iget v0, p0, Lo/elb;->C:I

    const v1, 0x7fffffff

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public aj()Landroid/graphics/drawable/GradientDrawable;
    .locals 1

    .line 222
    iget-object v0, p0, Lo/elb;->H:Landroid/graphics/drawable/GradientDrawable;

    return-object v0
.end method

.method public ak()F
    .locals 1

    .line 319
    iget v0, p0, Lo/elb;->C:I

    int-to-float v0, v0

    return v0
.end method

.method public al()V
    .locals 1

    .line 233
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/elb;->E:Z

    .line 234
    return-void
.end method

.method public am()Z
    .locals 1

    .line 237
    iget-boolean v0, p0, Lo/elb;->E:Z

    return v0
.end method

.method public an()V
    .locals 1

    .line 340
    iget-boolean v0, p0, Lo/elb;->F:Z

    if-eqz v0, :cond_0

    .line 341
    invoke-virtual {p0}, Lo/elb;->M()V

    .line 342
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/elb;->F:Z

    .line 344
    :cond_0
    return-void
.end method

.method public aq()V
    .locals 1

    .line 502
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/elb;->J:Z

    .line 503
    const/high16 v0, 0x43960000    # 300.0f

    iput v0, p0, Lo/elb;->L:F

    .line 504
    return-void
.end method

.method public b()I
    .locals 1

    .line 292
    iget v0, p0, Lo/elb;->A:I

    return v0
.end method

.method public b(Lo/eie;)Lo/ejq;
    .locals 3

    .line 542
    invoke-virtual {p1}, Lo/eie;->W()Lo/eie$c;

    move-result-object v2

    .line 544
    if-nez v2, :cond_0

    .line 545
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "cacheDatasContainer not support"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 548
    :cond_0
    iget-object v0, p0, Lo/elb;->j:Lo/ejs;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lo/elb;->j:Lo/ejs;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-interface {v2, v0}, Lo/eie$c;->c(Ljava/lang/Class;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 549
    :cond_1
    invoke-interface {v2}, Lo/eie$c;->d()Lo/ejq;

    move-result-object v0

    check-cast v0, Lo/ejs;

    iput-object v0, p0, Lo/elb;->j:Lo/ejs;

    .line 550
    iget-object v0, p0, Lo/elb;->j:Lo/ejs;

    invoke-interface {v0, p0}, Lo/ejs;->e(Lo/elb;)V

    .line 552
    :cond_2
    iget-object v0, p0, Lo/elb;->j:Lo/ejs;

    return-object v0
.end method

.method public b(Lo/elb$c;)V
    .locals 0

    .line 406
    iput-object p1, p0, Lo/elb;->M:Lo/elb$c;

    .line 407
    return-void
.end method

.method public c()F
    .locals 1

    .line 495
    iget v0, p0, Lo/elb;->L:F

    return v0
.end method

.method public c(I)V
    .locals 1

    .line 242
    iget-object v0, p0, Lo/elb;->x:Lo/eks;

    iput p1, v0, Lo/eks;->c:I

    .line 243
    invoke-super {p0, p1}, Lo/ekv;->c(I)V

    .line 244
    return-void
.end method

.method public c(Lo/eit$b;)V
    .locals 0

    .line 258
    iput-object p1, p0, Lo/elb;->w:Lo/eit$b;

    .line 259
    return-void
.end method

.method public c(Lo/elb$b;)V
    .locals 0

    .line 307
    iput-object p1, p0, Lo/elb;->K:Lo/elb$b;

    .line 308
    return-void
.end method

.method public d(IIZ)V
    .locals 4

    .line 195
    iput-boolean p3, p0, Lo/elb;->B:Z

    .line 196
    if-eqz p3, :cond_0

    .line 197
    const/4 v0, 0x2

    new-array v2, v0, [I

    const/4 v0, 0x0

    aput p1, v2, v0

    const/4 v0, 0x1

    aput p1, v2, v0

    .line 198
    new-instance v0, Landroid/graphics/drawable/GradientDrawable;

    sget-object v1, Landroid/graphics/drawable/GradientDrawable$Orientation;->TOP_BOTTOM:Landroid/graphics/drawable/GradientDrawable$Orientation;

    invoke-direct {v0, v1, v2}, Landroid/graphics/drawable/GradientDrawable;-><init>(Landroid/graphics/drawable/GradientDrawable$Orientation;[I)V

    iput-object v0, p0, Lo/elb;->G:Landroid/graphics/drawable/GradientDrawable;

    .line 200
    const/4 v0, 0x2

    new-array v3, v0, [I

    const/4 v0, 0x0

    aput p1, v3, v0

    const/4 v0, 0x1

    aput p2, v3, v0

    .line 201
    new-instance v0, Landroid/graphics/drawable/GradientDrawable;

    sget-object v1, Landroid/graphics/drawable/GradientDrawable$Orientation;->TOP_BOTTOM:Landroid/graphics/drawable/GradientDrawable$Orientation;

    invoke-direct {v0, v1, v3}, Landroid/graphics/drawable/GradientDrawable;-><init>(Landroid/graphics/drawable/GradientDrawable$Orientation;[I)V

    iput-object v0, p0, Lo/elb;->H:Landroid/graphics/drawable/GradientDrawable;

    .line 202
    goto :goto_0

    .line 203
    :cond_0
    const/4 v0, 0x2

    new-array v2, v0, [I

    const/4 v0, 0x0

    aput p1, v2, v0

    const/4 v0, 0x1

    aput p2, v2, v0

    .line 204
    new-instance v0, Landroid/graphics/drawable/GradientDrawable;

    sget-object v1, Landroid/graphics/drawable/GradientDrawable$Orientation;->TOP_BOTTOM:Landroid/graphics/drawable/GradientDrawable$Orientation;

    invoke-direct {v0, v1, v2}, Landroid/graphics/drawable/GradientDrawable;-><init>(Landroid/graphics/drawable/GradientDrawable$Orientation;[I)V

    iput-object v0, p0, Lo/elb;->t:Landroid/graphics/drawable/Drawable;

    .line 206
    :goto_0
    return-void
.end method

.method public d(Lo/elb$c;)V
    .locals 0

    .line 413
    iput-object p1, p0, Lo/elb;->N:Lo/elb$c;

    .line 414
    return-void
.end method

.method public d()Z
    .locals 1

    .line 488
    iget-boolean v0, p0, Lo/elb;->J:Z

    return v0
.end method

.method public e()Lo/eit$b;
    .locals 1

    .line 267
    iget-object v0, p0, Lo/elb;->w:Lo/eit$b;

    return-object v0
.end method

.method public e(II)Z
    .locals 2

    .line 315
    iget-object v0, p0, Lo/elb;->K:Lo/elb$b;

    iget v1, p0, Lo/elb;->C:I

    invoke-interface {v0, p1, p2, v1}, Lo/elb$b;->e(III)Z

    move-result v0

    return v0
.end method

.method public g()Ljava/lang/String;
    .locals 2

    .line 515
    invoke-virtual {p0}, Lo/elb;->af()Lo/eks;

    move-result-object v1

    .line 516
    iget-object v0, v1, Lo/eks;->a:Ljava/lang/String;

    return-object v0
.end method

.method public h(Z)F
    .locals 1

    .line 389
    iget-object v0, p0, Lo/elb;->M:Lo/elb$c;

    invoke-interface {v0, p1}, Lo/elb$c;->e(Z)F

    move-result v0

    return v0
.end method

.method public h(F)V
    .locals 1

    .line 480
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/elb;->J:Z

    .line 481
    iput p1, p0, Lo/elb;->L:F

    .line 482
    return-void
.end method

.method public h(I)V
    .locals 2

    .line 247
    iget-object v0, p0, Lo/elb;->x:Lo/eks;

    const/4 v1, 0x0

    iput-boolean v1, v0, Lo/eks;->b:Z

    .line 248
    iget-object v0, p0, Lo/elb;->x:Lo/eks;

    iput p1, v0, Lo/eks;->h:I

    .line 249
    return-void
.end method

.method public k(I)V
    .locals 0

    .line 273
    iput p1, p0, Lo/elb;->I:I

    .line 274
    return-void
.end method

.method public k(Z)Z
    .locals 1

    .line 399
    iget-object v0, p0, Lo/elb;->M:Lo/elb$c;

    invoke-interface {v0, p1}, Lo/elb$c;->a(Z)Z

    move-result v0

    return v0
.end method

.method public l(I)V
    .locals 4

    .line 331
    const-string v0, "HwHealthLineDataSet"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "modifySamplingInterval:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 333
    iget v0, p0, Lo/elb;->C:I

    if-eq p1, v0, :cond_0

    .line 334
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/elb;->F:Z

    .line 336
    :cond_0
    iput p1, p0, Lo/elb;->C:I

    .line 337
    return-void
.end method
