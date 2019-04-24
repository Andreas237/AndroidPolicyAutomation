.class public Lo/bwg;
.super Landroid/view/View;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/bwg$a;
    }
.end annotation


# instance fields
.field private a:I

.field private b:Landroid/graphics/Paint;

.field private c:I

.field d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/health/suggestion/ui/fitness/module/Motion;>;"
        }
    .end annotation
.end field

.field private e:Landroid/graphics/Paint;

.field private f:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/bwg$a;>;"
        }
    .end annotation
.end field

.field private g:F

.field private h:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/Float;>;"
        }
    .end annotation
.end field

.field private i:I

.field private k:I

.field private l:I

.field private m:I

.field private n:I

.field private o:I

.field private p:Landroid/graphics/RectF;

.field private q:Lo/bwg$a;

.field private r:Landroid/graphics/RectF;

.field private s:Landroid/content/Context;

.field private u:Landroid/graphics/Paint;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 97
    invoke-direct {p0, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 32
    const/4 v0, 0x3

    iput v0, p0, Lo/bwg;->a:I

    .line 56
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/bwg;->h:Ljava/util/List;

    .line 60
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/bwg;->f:Ljava/util/List;

    .line 64
    const/4 v0, 0x0

    iput v0, p0, Lo/bwg;->i:I

    .line 74
    const-string v0, "#20ffffff"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lo/bwg;->m:I

    .line 78
    const-string v0, "#ffffff"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lo/bwg;->o:I

    .line 82
    const-string v0, "#80ffffff"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lo/bwg;->n:I

    .line 93
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/bwg;->d:Ljava/util/List;

    .line 98
    iput-object p1, p0, Lo/bwg;->s:Landroid/content/Context;

    .line 99
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 102
    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 32
    const/4 v0, 0x3

    iput v0, p0, Lo/bwg;->a:I

    .line 56
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/bwg;->h:Ljava/util/List;

    .line 60
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/bwg;->f:Ljava/util/List;

    .line 64
    const/4 v0, 0x0

    iput v0, p0, Lo/bwg;->i:I

    .line 74
    const-string v0, "#20ffffff"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lo/bwg;->m:I

    .line 78
    const-string v0, "#ffffff"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lo/bwg;->o:I

    .line 82
    const-string v0, "#80ffffff"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lo/bwg;->n:I

    .line 93
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/bwg;->d:Ljava/util/List;

    .line 103
    iput-object p1, p0, Lo/bwg;->s:Landroid/content/Context;

    .line 104
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    .line 107
    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 32
    const/4 v0, 0x3

    iput v0, p0, Lo/bwg;->a:I

    .line 56
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/bwg;->h:Ljava/util/List;

    .line 60
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/bwg;->f:Ljava/util/List;

    .line 64
    const/4 v0, 0x0

    iput v0, p0, Lo/bwg;->i:I

    .line 74
    const-string v0, "#20ffffff"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lo/bwg;->m:I

    .line 78
    const-string v0, "#ffffff"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lo/bwg;->o:I

    .line 82
    const-string v0, "#80ffffff"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lo/bwg;->n:I

    .line 93
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/bwg;->d:Ljava/util/List;

    .line 108
    iput-object p1, p0, Lo/bwg;->s:Landroid/content/Context;

    .line 109
    return-void
.end method

.method public static b(Landroid/content/Context;I)I
    .locals 3

    .line 353
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v2, v0, Landroid/util/DisplayMetrics;->density:F

    .line 354
    int-to-float v0, p1

    mul-float/2addr v0, v2

    const/high16 v1, 0x3f000000    # 0.5f

    add-float/2addr v0, v1

    float-to-int v0, v0

    return v0
.end method

.method static synthetic c(Lo/bwg;)I
    .locals 1

    .line 22
    iget v0, p0, Lo/bwg;->a:I

    return v0
.end method


# virtual methods
.method public a(I)F
    .locals 1

    .line 283
    if-ltz p1, :cond_0

    iget-object v0, p0, Lo/bwg;->h:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge p1, v0, :cond_0

    .line 284
    iget-object v0, p0, Lo/bwg;->h:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    return v0

    .line 286
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 6

    .line 175
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 176
    iget-object v0, p0, Lo/bwg;->f:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-gtz v0, :cond_0

    .line 177
    return-void

    .line 179
    :cond_0
    iget-object v0, p0, Lo/bwg;->u:Landroid/graphics/Paint;

    iget v1, p0, Lo/bwg;->m:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 180
    iget-object v0, p0, Lo/bwg;->p:Landroid/graphics/RectF;

    iget v1, p0, Lo/bwg;->a:I

    int-to-float v1, v1

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    iget v2, p0, Lo/bwg;->a:I

    int-to-float v2, v2

    const/high16 v3, 0x40000000    # 2.0f

    div-float/2addr v2, v3

    iget-object v3, p0, Lo/bwg;->u:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 183
    iget-object v0, p0, Lo/bwg;->b:Landroid/graphics/Paint;

    iget v1, p0, Lo/bwg;->o:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 184
    const/4 v4, 0x0

    :goto_0
    iget v0, p0, Lo/bwg;->c:I

    if-gt v4, v0, :cond_3

    .line 185
    iget-object v0, p0, Lo/bwg;->f:Ljava/util/List;

    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/bwg$a;

    iput-object v0, p0, Lo/bwg;->q:Lo/bwg$a;

    .line 187
    iget v0, p0, Lo/bwg;->c:I

    if-ne v4, v0, :cond_2

    .line 188
    iget-object v0, p0, Lo/bwg;->q:Lo/bwg$a;

    invoke-virtual {v0}, Lo/bwg$a;->b()F

    move-result v0

    iget-object v1, p0, Lo/bwg;->q:Lo/bwg$a;

    invoke-virtual {v1}, Lo/bwg$a;->d()F

    move-result v1

    iget v2, p0, Lo/bwg;->g:F

    mul-float/2addr v1, v2

    add-float v5, v0, v1

    .line 189
    iget-object v0, p0, Lo/bwg;->r:Landroid/graphics/RectF;

    iget-object v1, p0, Lo/bwg;->q:Lo/bwg$a;

    invoke-virtual {v1}, Lo/bwg$a;->b()F

    move-result v1

    iget-object v2, p0, Lo/bwg;->q:Lo/bwg$a;

    invoke-virtual {v2}, Lo/bwg$a;->d()F

    move-result v2

    add-float/2addr v1, v2

    cmpg-float v1, v5, v1

    if-gez v1, :cond_1

    move v1, v5

    goto :goto_1

    :cond_1
    iget-object v1, p0, Lo/bwg;->q:Lo/bwg$a;

    invoke-virtual {v1}, Lo/bwg$a;->b()F

    move-result v1

    iget-object v2, p0, Lo/bwg;->q:Lo/bwg$a;

    invoke-virtual {v2}, Lo/bwg$a;->d()F

    move-result v2

    add-float/2addr v1, v2

    :goto_1
    iput v1, v0, Landroid/graphics/RectF;->right:F

    .line 190
    goto :goto_2

    .line 191
    :cond_2
    iget-object v0, p0, Lo/bwg;->r:Landroid/graphics/RectF;

    iget-object v1, p0, Lo/bwg;->q:Lo/bwg$a;

    invoke-virtual {v1}, Lo/bwg$a;->b()F

    move-result v1

    iget-object v2, p0, Lo/bwg;->q:Lo/bwg$a;

    invoke-virtual {v2}, Lo/bwg$a;->d()F

    move-result v2

    add-float/2addr v1, v2

    iput v1, v0, Landroid/graphics/RectF;->right:F

    .line 184
    :goto_2
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 197
    :cond_3
    const/4 v4, 0x1

    :goto_3
    iget v0, p0, Lo/bwg;->i:I

    if-ge v4, v0, :cond_4

    .line 198
    iget-object v0, p0, Lo/bwg;->f:Ljava/util/List;

    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/bwg$a;

    invoke-virtual {v0}, Lo/bwg$a;->b()F

    move-result v0

    iget v1, p0, Lo/bwg;->a:I

    int-to-float v1, v1

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    iget v2, p0, Lo/bwg;->a:I

    int-to-float v2, v2

    const/high16 v3, 0x40000000    # 2.0f

    div-float/2addr v2, v3

    const/high16 v3, 0x3f000000    # 0.5f

    sub-float/2addr v2, v3

    iget-object v3, p0, Lo/bwg;->e:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 197
    add-int/lit8 v4, v4, 0x1

    goto :goto_3

    .line 201
    :cond_4
    iget-object v0, p0, Lo/bwg;->r:Landroid/graphics/RectF;

    iget v1, p0, Lo/bwg;->a:I

    int-to-float v1, v1

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    iget v2, p0, Lo/bwg;->a:I

    int-to-float v2, v2

    const/high16 v3, 0x40000000    # 2.0f

    div-float/2addr v2, v3

    iget-object v3, p0, Lo/bwg;->b:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 218
    return-void
.end method

.method protected onFinishInflate()V
    .locals 2

    .line 119
    invoke-super {p0}, Landroid/view/View;->onFinishInflate()V

    .line 120
    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lo/bwg;->b:Landroid/graphics/Paint;

    .line 121
    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lo/bwg;->e:Landroid/graphics/Paint;

    .line 122
    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lo/bwg;->u:Landroid/graphics/Paint;

    .line 123
    iget-object v0, p0, Lo/bwg;->b:Landroid/graphics/Paint;

    iget v1, p0, Lo/bwg;->m:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 124
    iget-object v0, p0, Lo/bwg;->e:Landroid/graphics/Paint;

    iget v1, p0, Lo/bwg;->n:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 125
    iget-object v0, p0, Lo/bwg;->u:Landroid/graphics/Paint;

    iget v1, p0, Lo/bwg;->m:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 126
    iget-object v0, p0, Lo/bwg;->s:Landroid/content/Context;

    iget v1, p0, Lo/bwg;->a:I

    invoke-static {v0, v1}, Lo/bwg;->b(Landroid/content/Context;I)I

    move-result v0

    iput v0, p0, Lo/bwg;->a:I

    .line 127
    return-void
.end method

.method protected onMeasure(II)V
    .locals 2

    .line 131
    invoke-super {p0, p1, p2}, Landroid/view/View;->onMeasure(II)V

    .line 132
    invoke-virtual {p0}, Lo/bwg;->getSuggestedMinimumWidth()I

    move-result v0

    invoke-static {v0, p1}, Lo/bwg;->getDefaultSize(II)I

    move-result v0

    iget v1, p0, Lo/bwg;->a:I

    invoke-virtual {p0, v0, v1}, Lo/bwg;->setMeasuredDimension(II)V

    .line 133
    return-void
.end method

.method protected onSizeChanged(IIII)V
    .locals 10

    .line 137
    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->onSizeChanged(IIII)V

    .line 139
    invoke-static {p2, p1}, Ljava/lang/Math;->max(II)I

    move-result v0

    iput v0, p0, Lo/bwg;->l:I

    .line 142
    iget-object v0, p0, Lo/bwg;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    iput v0, p0, Lo/bwg;->i:I

    .line 146
    iget v5, p0, Lo/bwg;->l:I

    .line 148
    const/4 v6, 0x0

    .line 150
    iget-object v0, p0, Lo/bwg;->f:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 154
    const/4 v7, 0x0

    :goto_0
    iget v0, p0, Lo/bwg;->i:I

    if-ge v7, v0, :cond_0

    .line 155
    iget-object v0, p0, Lo/bwg;->h:Ljava/util/List;

    invoke-interface {v0, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    const/high16 v1, 0x3f800000    # 1.0f

    mul-float/2addr v0, v1

    iget v1, p0, Lo/bwg;->k:I

    int-to-float v1, v1

    div-float/2addr v0, v1

    const/high16 v1, 0x3f800000    # 1.0f

    mul-float v8, v0, v1

    .line 156
    new-instance v9, Lo/bwg$a;

    int-to-float v0, v5

    mul-float/2addr v0, v8

    invoke-direct {v9, p0, v6, v0}, Lo/bwg$a;-><init>(Lo/bwg;FF)V

    .line 157
    iget-object v0, p0, Lo/bwg;->f:Ljava/util/List;

    invoke-interface {v0, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 159
    int-to-float v0, v5

    mul-float/2addr v0, v8

    add-float/2addr v6, v0

    .line 154
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 161
    :cond_0
    iget-object v0, p0, Lo/bwg;->e:Landroid/graphics/Paint;

    iget-object v1, p0, Lo/bwg;->s:Landroid/content/Context;

    const/4 v2, 0x1

    invoke-static {v1, v2}, Lo/bwg;->b(Landroid/content/Context;I)I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 166
    new-instance v0, Landroid/graphics/RectF;

    iget v1, p0, Lo/bwg;->l:I

    int-to-float v1, v1

    iget v2, p0, Lo/bwg;->a:I

    int-to-float v2, v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct {v0, v3, v4, v1, v2}, Landroid/graphics/RectF;-><init>(FFFF)V

    iput-object v0, p0, Lo/bwg;->p:Landroid/graphics/RectF;

    .line 170
    new-instance v0, Landroid/graphics/RectF;

    iget v1, p0, Lo/bwg;->a:I

    int-to-float v1, v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct {v0, v2, v3, v4, v1}, Landroid/graphics/RectF;-><init>(FFFF)V

    iput-object v0, p0, Lo/bwg;->r:Landroid/graphics/RectF;

    .line 171
    return-void
.end method

.method public setInterColor(I)V
    .locals 0

    .line 296
    iput p1, p0, Lo/bwg;->n:I

    .line 297
    return-void
.end method

.method public setInterColor(Ljava/lang/String;)V
    .locals 1

    .line 305
    invoke-static {p1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lo/bwg;->n:I

    .line 306
    return-void
.end method

.method public setMotions(Ljava/util/List;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/suggestion/ui/fitness/module/Motion;>;)V"
        }
    .end annotation

    .line 270
    iget-object v0, p0, Lo/bwg;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 271
    iget-object v0, p0, Lo/bwg;->d:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 272
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    iput v0, p0, Lo/bwg;->i:I

    .line 273
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;

    .line 274
    iget v0, p0, Lo/bwg;->k:I

    int-to-float v0, v0

    iget v1, v4, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->duration:F

    invoke-virtual {v4}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->acquireGroups()I

    move-result v2

    int-to-float v2, v2

    mul-float/2addr v1, v2

    add-float/2addr v0, v1

    float-to-int v0, v0

    iput v0, p0, Lo/bwg;->k:I

    .line 275
    iget-object v0, p0, Lo/bwg;->h:Ljava/util/List;

    iget v1, v4, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->duration:F

    invoke-virtual {v4}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->acquireGroups()I

    move-result v2

    int-to-float v2, v2

    mul-float/2addr v1, v2

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 276
    goto :goto_0

    .line 277
    :cond_0
    return-void
.end method

.method public setProgBgColor(I)V
    .locals 0

    .line 314
    iput p1, p0, Lo/bwg;->m:I

    .line 315
    return-void
.end method

.method public setProgBgColor(Ljava/lang/String;)V
    .locals 1

    .line 323
    invoke-static {p1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lo/bwg;->m:I

    .line 324
    return-void
.end method

.method public setProgColor(I)V
    .locals 0

    .line 332
    iput p1, p0, Lo/bwg;->o:I

    .line 333
    return-void
.end method

.method public setProgColor(Ljava/lang/String;)V
    .locals 1

    .line 341
    invoke-static {p1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lo/bwg;->o:I

    .line 342
    return-void
.end method

.method public setProgheight(I)V
    .locals 0

    .line 349
    iput p1, p0, Lo/bwg;->a:I

    .line 350
    return-void
.end method

.method public setProgress(IIF)V
    .locals 3

    .line 254
    if-ltz p1, :cond_0

    iget-object v0, p0, Lo/bwg;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lt p1, v0, :cond_1

    .line 255
    :cond_0
    return-void

    .line 257
    :cond_1
    iput p1, p0, Lo/bwg;->c:I

    .line 259
    int-to-float v0, p2

    iget-object v1, p0, Lo/bwg;->d:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;

    iget v1, v1, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->duration:F

    mul-float/2addr v0, v1

    add-float/2addr v0, p3

    const/high16 v1, 0x3f800000    # 1.0f

    mul-float/2addr v0, v1

    iget-object v1, p0, Lo/bwg;->h:Ljava/util/List;

    iget v2, p0, Lo/bwg;->c:I

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Float;

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    div-float/2addr v0, v1

    const/high16 v1, 0x3f800000    # 1.0f

    mul-float/2addr v0, v1

    iput v0, p0, Lo/bwg;->g:F

    .line 261
    invoke-virtual {p0}, Lo/bwg;->invalidate()V

    .line 262
    return-void
.end method
