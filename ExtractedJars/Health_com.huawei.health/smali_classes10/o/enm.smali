.class public Lo/enm;
.super Landroid/view/View;
.source "SourceFile"


# static fields
.field private static F:I

.field private static I:I


# instance fields
.field private A:I

.field private B:I

.field private C:I

.field private D:I

.field private E:I

.field private G:I

.field private H:Z

.field private J:Landroid/view/GestureDetector$SimpleOnGestureListener;

.field private K:Landroid/os/Handler;

.field private M:F

.field a:F

.field b:Z

.field public c:F

.field d:F

.field private e:I

.field private f:I

.field private g:Lo/enn;

.field private final h:F

.field private i:I

.field private j:I

.field private k:I

.field private l:I

.field private m:I

.field private n:Landroid/text/StaticLayout;

.field private o:Landroid/text/TextPaint;

.field private p:Landroid/text/TextPaint;

.field private q:Z

.field private r:I

.field private s:Landroid/text/StaticLayout;

.field private t:Landroid/view/GestureDetector;

.field private u:Landroid/text/StaticLayout;

.field private v:I

.field private w:I

.field private x:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/eng;>;"
        }
    .end annotation
.end field

.field private y:Landroid/widget/Scroller;

.field private z:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/enh;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 156
    const/4 v0, 0x1

    sput v0, Lo/enm;->I:I

    .line 157
    const/4 v0, 0x2

    sput v0, Lo/enm;->F:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 193
    invoke-direct {p0, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 66
    const/16 v0, 0x37

    iput v0, p0, Lo/enm;->e:I

    .line 71
    const/high16 v0, 0x40a00000    # 5.0f

    iput v0, p0, Lo/enm;->c:F

    .line 76
    iget v0, p0, Lo/enm;->c:F

    iput v0, p0, Lo/enm;->h:F

    .line 86
    const/4 v0, 0x1

    iput v0, p0, Lo/enm;->f:I

    .line 94
    const/4 v0, 0x0

    iput-object v0, p0, Lo/enm;->g:Lo/enn;

    .line 95
    const/4 v0, 0x0

    iput v0, p0, Lo/enm;->k:I

    .line 98
    const/4 v0, 0x0

    iput v0, p0, Lo/enm;->i:I

    .line 101
    const/4 v0, 0x5

    iput v0, p0, Lo/enm;->l:I

    .line 104
    const/4 v0, 0x0

    iput v0, p0, Lo/enm;->m:I

    .line 125
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/enm;->b:Z

    .line 127
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lo/enm;->z:Ljava/util/List;

    .line 128
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lo/enm;->x:Ljava/util/List;

    .line 133
    const-string v0, "#FFFB6522"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lo/enm;->v:I

    .line 136
    const-string v0, "#ff000000"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lo/enm;->D:I

    .line 139
    const-string v0, "#FFFB6522"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lo/enm;->C:I

    .line 142
    const-string v0, "#FF1A1A1A"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lo/enm;->j:I

    .line 144
    const-string v0, "#4C1A1A1A"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lo/enm;->A:I

    .line 147
    const/high16 v0, 0x41a00000    # 20.0f

    iput v0, p0, Lo/enm;->d:F

    .line 149
    const/high16 v0, 0x41880000    # 17.0f

    iput v0, p0, Lo/enm;->a:F

    .line 152
    sget v0, Lcom/huawei/ui/commonui/R$dimen;->wheelview_text_size_item:I

    iput v0, p0, Lo/enm;->B:I

    .line 154
    sget v0, Lcom/huawei/ui/commonui/R$dimen;->health_switch_button_height:I

    iput v0, p0, Lo/enm;->G:I

    .line 163
    const/4 v0, 0x0

    iput v0, p0, Lo/enm;->E:I

    .line 164
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/enm;->H:Z

    .line 166
    const/high16 v0, 0x41900000    # 18.0f

    iput v0, p0, Lo/enm;->M:F

    .line 849
    new-instance v0, Lo/enm$5;

    invoke-direct {v0, p0}, Lo/enm$5;-><init>(Lo/enm;)V

    iput-object v0, p0, Lo/enm;->J:Landroid/view/GestureDetector$SimpleOnGestureListener;

    .line 885
    new-instance v0, Lo/enm$1;

    invoke-direct {v0, p0}, Lo/enm$1;-><init>(Lo/enm;)V

    iput-object v0, p0, Lo/enm;->K:Landroid/os/Handler;

    .line 194
    iget v0, p0, Lo/enm;->M:F

    invoke-static {p1, v0}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v0

    iput v0, p0, Lo/enm;->e:I

    .line 196
    invoke-direct {p0, p1}, Lo/enm;->a(Landroid/content/Context;)V

    .line 197
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 183
    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 66
    const/16 v0, 0x37

    iput v0, p0, Lo/enm;->e:I

    .line 71
    const/high16 v0, 0x40a00000    # 5.0f

    iput v0, p0, Lo/enm;->c:F

    .line 76
    iget v0, p0, Lo/enm;->c:F

    iput v0, p0, Lo/enm;->h:F

    .line 86
    const/4 v0, 0x1

    iput v0, p0, Lo/enm;->f:I

    .line 94
    const/4 v0, 0x0

    iput-object v0, p0, Lo/enm;->g:Lo/enn;

    .line 95
    const/4 v0, 0x0

    iput v0, p0, Lo/enm;->k:I

    .line 98
    const/4 v0, 0x0

    iput v0, p0, Lo/enm;->i:I

    .line 101
    const/4 v0, 0x5

    iput v0, p0, Lo/enm;->l:I

    .line 104
    const/4 v0, 0x0

    iput v0, p0, Lo/enm;->m:I

    .line 125
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/enm;->b:Z

    .line 127
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lo/enm;->z:Ljava/util/List;

    .line 128
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lo/enm;->x:Ljava/util/List;

    .line 133
    const-string v0, "#FFFB6522"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lo/enm;->v:I

    .line 136
    const-string v0, "#ff000000"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lo/enm;->D:I

    .line 139
    const-string v0, "#FFFB6522"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lo/enm;->C:I

    .line 142
    const-string v0, "#FF1A1A1A"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lo/enm;->j:I

    .line 144
    const-string v0, "#4C1A1A1A"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lo/enm;->A:I

    .line 147
    const/high16 v0, 0x41a00000    # 20.0f

    iput v0, p0, Lo/enm;->d:F

    .line 149
    const/high16 v0, 0x41880000    # 17.0f

    iput v0, p0, Lo/enm;->a:F

    .line 152
    sget v0, Lcom/huawei/ui/commonui/R$dimen;->wheelview_text_size_item:I

    iput v0, p0, Lo/enm;->B:I

    .line 154
    sget v0, Lcom/huawei/ui/commonui/R$dimen;->health_switch_button_height:I

    iput v0, p0, Lo/enm;->G:I

    .line 163
    const/4 v0, 0x0

    iput v0, p0, Lo/enm;->E:I

    .line 164
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/enm;->H:Z

    .line 166
    const/high16 v0, 0x41900000    # 18.0f

    iput v0, p0, Lo/enm;->M:F

    .line 849
    new-instance v0, Lo/enm$5;

    invoke-direct {v0, p0}, Lo/enm$5;-><init>(Lo/enm;)V

    iput-object v0, p0, Lo/enm;->J:Landroid/view/GestureDetector$SimpleOnGestureListener;

    .line 885
    new-instance v0, Lo/enm$1;

    invoke-direct {v0, p0}, Lo/enm$1;-><init>(Lo/enm;)V

    iput-object v0, p0, Lo/enm;->K:Landroid/os/Handler;

    .line 184
    iget v0, p0, Lo/enm;->M:F

    invoke-static {p1, v0}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v0

    iput v0, p0, Lo/enm;->e:I

    .line 186
    invoke-direct {p0, p1}, Lo/enm;->a(Landroid/content/Context;)V

    .line 187
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    .line 173
    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 66
    const/16 v0, 0x37

    iput v0, p0, Lo/enm;->e:I

    .line 71
    const/high16 v0, 0x40a00000    # 5.0f

    iput v0, p0, Lo/enm;->c:F

    .line 76
    iget v0, p0, Lo/enm;->c:F

    iput v0, p0, Lo/enm;->h:F

    .line 86
    const/4 v0, 0x1

    iput v0, p0, Lo/enm;->f:I

    .line 94
    const/4 v0, 0x0

    iput-object v0, p0, Lo/enm;->g:Lo/enn;

    .line 95
    const/4 v0, 0x0

    iput v0, p0, Lo/enm;->k:I

    .line 98
    const/4 v0, 0x0

    iput v0, p0, Lo/enm;->i:I

    .line 101
    const/4 v0, 0x5

    iput v0, p0, Lo/enm;->l:I

    .line 104
    const/4 v0, 0x0

    iput v0, p0, Lo/enm;->m:I

    .line 125
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/enm;->b:Z

    .line 127
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lo/enm;->z:Ljava/util/List;

    .line 128
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lo/enm;->x:Ljava/util/List;

    .line 133
    const-string v0, "#FFFB6522"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lo/enm;->v:I

    .line 136
    const-string v0, "#ff000000"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lo/enm;->D:I

    .line 139
    const-string v0, "#FFFB6522"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lo/enm;->C:I

    .line 142
    const-string v0, "#FF1A1A1A"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lo/enm;->j:I

    .line 144
    const-string v0, "#4C1A1A1A"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lo/enm;->A:I

    .line 147
    const/high16 v0, 0x41a00000    # 20.0f

    iput v0, p0, Lo/enm;->d:F

    .line 149
    const/high16 v0, 0x41880000    # 17.0f

    iput v0, p0, Lo/enm;->a:F

    .line 152
    sget v0, Lcom/huawei/ui/commonui/R$dimen;->wheelview_text_size_item:I

    iput v0, p0, Lo/enm;->B:I

    .line 154
    sget v0, Lcom/huawei/ui/commonui/R$dimen;->health_switch_button_height:I

    iput v0, p0, Lo/enm;->G:I

    .line 163
    const/4 v0, 0x0

    iput v0, p0, Lo/enm;->E:I

    .line 164
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/enm;->H:Z

    .line 166
    const/high16 v0, 0x41900000    # 18.0f

    iput v0, p0, Lo/enm;->M:F

    .line 849
    new-instance v0, Lo/enm$5;

    invoke-direct {v0, p0}, Lo/enm$5;-><init>(Lo/enm;)V

    iput-object v0, p0, Lo/enm;->J:Landroid/view/GestureDetector$SimpleOnGestureListener;

    .line 885
    new-instance v0, Lo/enm$1;

    invoke-direct {v0, p0}, Lo/enm$1;-><init>(Lo/enm;)V

    iput-object v0, p0, Lo/enm;->K:Landroid/os/Handler;

    .line 174
    iget v0, p0, Lo/enm;->M:F

    invoke-static {p1, v0}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v0

    iput v0, p0, Lo/enm;->e:I

    .line 176
    invoke-direct {p0, p1}, Lo/enm;->a(Landroid/content/Context;)V

    .line 177
    return-void
.end method

.method static synthetic a(Lo/enm;I)I
    .locals 0

    .line 44
    iput p1, p0, Lo/enm;->w:I

    return p1
.end method

.method private a(I)Ljava/lang/String;
    .locals 2

    .line 437
    iget-object v0, p0, Lo/enm;->g:Lo/enn;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/enm;->g:Lo/enn;

    invoke-interface {v0}, Lo/enn;->d()I

    move-result v0

    if-nez v0, :cond_1

    .line 438
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 440
    :cond_1
    iget-object v0, p0, Lo/enm;->g:Lo/enn;

    invoke-interface {v0}, Lo/enn;->d()I

    move-result v1

    .line 441
    if-ltz p1, :cond_2

    if-lt p1, v1, :cond_3

    :cond_2
    iget-boolean v0, p0, Lo/enm;->b:Z

    if-nez v0, :cond_3

    .line 442
    const/4 v0, 0x0

    return-object v0

    .line 444
    :cond_3
    :goto_0
    if-gez p1, :cond_4

    .line 445
    add-int/2addr p1, v1

    goto :goto_0

    .line 449
    :cond_4
    rem-int/2addr p1, v1

    .line 450
    iget-object v0, p0, Lo/enm;->g:Lo/enn;

    invoke-interface {v0, p1}, Lo/enn;->b(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private a(Landroid/content/Context;)V
    .locals 2

    .line 205
    new-instance v0, Landroid/view/GestureDetector;

    iget-object v1, p0, Lo/enm;->J:Landroid/view/GestureDetector$SimpleOnGestureListener;

    invoke-direct {v0, p1, v1}, Landroid/view/GestureDetector;-><init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;)V

    iput-object v0, p0, Lo/enm;->t:Landroid/view/GestureDetector;

    .line 206
    iget-object v0, p0, Lo/enm;->t:Landroid/view/GestureDetector;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/GestureDetector;->setIsLongpressEnabled(Z)V

    .line 208
    new-instance v0, Landroid/widget/Scroller;

    invoke-direct {v0, p1}, Landroid/widget/Scroller;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/enm;->y:Landroid/widget/Scroller;

    .line 210
    invoke-virtual {p0}, Lo/enm;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    iget v1, p0, Lo/enm;->G:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Lo/enm;->d:F

    .line 211
    invoke-virtual {p0}, Lo/enm;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    iget v1, p0, Lo/enm;->B:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Lo/enm;->a:F

    .line 212
    return-void
.end method

.method private a(Landroid/graphics/Canvas;)V
    .locals 6

    .line 771
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 772
    iget-object v0, p0, Lo/enm;->n:Landroid/text/StaticLayout;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 773
    iget-object v0, p0, Lo/enm;->n:Landroid/text/StaticLayout;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/text/StaticLayout;->getLineTop(I)I

    move-result v5

    .line 774
    const-string v0, "WheelView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "1 : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 775
    const-string v0, "WheelView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "dx : 0itemsLayout.getLineTop(1)\uff1a"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    neg-int v3, v5

    iget v4, p0, Lo/enm;->r:I

    add-int/2addr v3, v4

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 776
    neg-int v0, v5

    iget v1, p0, Lo/enm;->r:I

    add-int/2addr v0, v1

    int-to-float v0, v0

    const/4 v1, 0x0

    invoke-virtual {p1, v1, v0}, Landroid/graphics/Canvas;->translate(FF)V

    .line 777
    iget-object v0, p0, Lo/enm;->p:Landroid/text/TextPaint;

    iget v1, p0, Lo/enm;->A:I

    invoke-virtual {v0, v1}, Landroid/text/TextPaint;->setColor(I)V

    .line 778
    iget-object v0, p0, Lo/enm;->p:Landroid/text/TextPaint;

    invoke-virtual {p0}, Lo/enm;->getDrawableState()[I

    move-result-object v1

    iput-object v1, v0, Landroid/text/TextPaint;->drawableState:[I

    .line 779
    iget-object v0, p0, Lo/enm;->n:Landroid/text/StaticLayout;

    invoke-virtual {v0, p1}, Landroid/text/StaticLayout;->draw(Landroid/graphics/Canvas;)V

    .line 781
    :cond_0
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 783
    iget-object v0, p0, Lo/enm;->u:Landroid/text/StaticLayout;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 784
    iget-object v0, p0, Lo/enm;->u:Landroid/text/StaticLayout;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/text/StaticLayout;->getLineTop(I)I

    move-result v5

    .line 785
    neg-int v0, v5

    iget v1, p0, Lo/enm;->r:I

    add-int/2addr v0, v1

    int-to-float v0, v0

    const/4 v1, 0x0

    invoke-virtual {p1, v1, v0}, Landroid/graphics/Canvas;->translate(FF)V

    .line 786
    iget-object v0, p0, Lo/enm;->p:Landroid/text/TextPaint;

    iget v1, p0, Lo/enm;->j:I

    invoke-virtual {v0, v1}, Landroid/text/TextPaint;->setColor(I)V

    .line 787
    iget-object v0, p0, Lo/enm;->p:Landroid/text/TextPaint;

    invoke-virtual {p0}, Lo/enm;->getDrawableState()[I

    move-result-object v1

    iput-object v1, v0, Landroid/text/TextPaint;->drawableState:[I

    .line 788
    iget-object v0, p0, Lo/enm;->u:Landroid/text/StaticLayout;

    invoke-virtual {v0, p1}, Landroid/text/StaticLayout;->draw(Landroid/graphics/Canvas;)V

    .line 790
    :cond_1
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 791
    return-void
.end method

.method static synthetic a(Lo/enm;)V
    .locals 0

    .line 44
    invoke-direct {p0}, Lo/enm;->k()V

    return-void
.end method

.method private b(II)I
    .locals 5

    .line 564
    invoke-direct {p0}, Lo/enm;->b()V

    .line 566
    const/4 v2, 0x0

    .line 568
    invoke-direct {p0}, Lo/enm;->getMaxTextLength()I

    move-result v3

    .line 569
    if-lez v3, :cond_1

    .line 570
    const-string v0, "0"

    iget-object v1, p0, Lo/enm;->p:Landroid/text/TextPaint;

    invoke-static {v0, v1}, Landroid/text/Layout;->getDesiredWidth(Ljava/lang/CharSequence;Landroid/text/TextPaint;)F

    move-result v0

    float-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-float v4, v0

    .line 572
    iget-boolean v0, p0, Lo/enm;->H:Z

    if-eqz v0, :cond_0

    .line 573
    const/high16 v0, 0x40000000    # 2.0f

    mul-float/2addr v4, v0

    .line 575
    :cond_0
    int-to-float v0, v3

    mul-float/2addr v0, v4

    float-to-int v0, v0

    iput v0, p0, Lo/enm;->i:I

    .line 576
    goto :goto_0

    .line 577
    :cond_1
    const/4 v0, 0x0

    iput v0, p0, Lo/enm;->i:I

    .line 579
    :goto_0
    iget v0, p0, Lo/enm;->i:I

    add-int/lit8 v0, v0, 0x14

    iput v0, p0, Lo/enm;->i:I

    .line 581
    const/4 v4, 0x0

    .line 582
    const/high16 v0, 0x40000000    # 2.0f

    if-ne p2, v0, :cond_2

    .line 583
    move v2, p1

    .line 584
    const/4 v4, 0x1

    goto :goto_1

    .line 586
    :cond_2
    iget v2, p0, Lo/enm;->i:I

    .line 589
    invoke-virtual {p0}, Lo/enm;->getSuggestedMinimumWidth()I

    move-result v0

    invoke-static {v2, v0}, Ljava/lang/Math;->max(II)I

    move-result v2

    .line 591
    const/high16 v0, -0x80000000

    if-ne p2, v0, :cond_3

    if-ge p1, v2, :cond_3

    .line 592
    move v2, p1

    .line 593
    const/4 v4, 0x1

    .line 597
    :cond_3
    :goto_1
    if-eqz v4, :cond_4

    .line 599
    iput v2, p0, Lo/enm;->i:I

    .line 602
    :cond_4
    iget v0, p0, Lo/enm;->i:I

    if-lez v0, :cond_5

    .line 603
    iget v0, p0, Lo/enm;->i:I

    invoke-direct {p0, v0}, Lo/enm;->e(I)V

    .line 605
    :cond_5
    return v2
.end method

.method private b(Z)Ljava/lang/String;
    .locals 8

    .line 460
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 461
    iget v0, p0, Lo/enm;->l:I

    div-int/lit8 v0, v0, 0x2

    add-int/lit8 v5, v0, 0x1

    .line 463
    iget v0, p0, Lo/enm;->k:I

    sub-int v6, v0, v5

    :goto_0
    iget v0, p0, Lo/enm;->k:I

    add-int/2addr v0, v5

    if-gt v6, v0, :cond_3

    .line 464
    if-nez p1, :cond_0

    iget v0, p0, Lo/enm;->k:I

    if-eq v6, v0, :cond_1

    .line 465
    :cond_0
    invoke-direct {p0, v6}, Lo/enm;->a(I)Ljava/lang/String;

    move-result-object v7

    .line 466
    if-eqz v7, :cond_1

    iget v0, p0, Lo/enm;->k:I

    add-int/lit8 v0, v0, 0x1

    if-eq v6, v0, :cond_1

    iget v0, p0, Lo/enm;->k:I

    add-int/lit8 v0, v0, -0x1

    if-eq v6, v0, :cond_1

    .line 467
    const-string v0, "WheelView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getTextItem(i) : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "  text : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 468
    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 471
    :cond_1
    iget v0, p0, Lo/enm;->k:I

    add-int/2addr v0, v5

    if-ge v6, v0, :cond_2

    .line 472
    const-string v0, "WheelView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "i : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "  text : \n"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 473
    const-string v0, "\n"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 463
    :cond_2
    add-int/lit8 v6, v6, 0x1

    goto/16 :goto_0

    .line 476
    :cond_3
    const-string v0, "WheelView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "itemsText.toString()"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 478
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private b()V
    .locals 6

    .line 387
    iget-object v0, p0, Lo/enm;->p:Landroid/text/TextPaint;

    if-nez v0, :cond_0

    .line 388
    const-string v0, "regular"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    move-result-object v5

    .line 389
    new-instance v0, Landroid/text/TextPaint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/text/TextPaint;-><init>(I)V

    iput-object v0, p0, Lo/enm;->p:Landroid/text/TextPaint;

    .line 390
    iget-object v0, p0, Lo/enm;->p:Landroid/text/TextPaint;

    invoke-virtual {p0}, Lo/enm;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    iget v1, v1, Landroid/util/DisplayMetrics;->density:F

    iput v1, v0, Landroid/text/TextPaint;->density:F

    .line 391
    iget-object v0, p0, Lo/enm;->p:Landroid/text/TextPaint;

    iget v1, p0, Lo/enm;->a:F

    invoke-virtual {v0, v1}, Landroid/text/TextPaint;->setTextSize(F)V

    .line 392
    iget-object v0, p0, Lo/enm;->p:Landroid/text/TextPaint;

    invoke-virtual {v0, v5}, Landroid/text/TextPaint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 395
    :cond_0
    iget-object v0, p0, Lo/enm;->o:Landroid/text/TextPaint;

    if-nez v0, :cond_2

    .line 397
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dbf;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 398
    const-string v0, "HwChinese-medium"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    move-result-object v5

    goto :goto_0

    .line 400
    :cond_1
    const-string v0, "regular"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    move-result-object v5

    .line 402
    :goto_0
    new-instance v0, Landroid/text/TextPaint;

    const/4 v1, 0x5

    invoke-direct {v0, v1}, Landroid/text/TextPaint;-><init>(I)V

    iput-object v0, p0, Lo/enm;->o:Landroid/text/TextPaint;

    .line 403
    iget-object v0, p0, Lo/enm;->o:Landroid/text/TextPaint;

    invoke-virtual {p0}, Lo/enm;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    iget v1, v1, Landroid/util/DisplayMetrics;->density:F

    iput v1, v0, Landroid/text/TextPaint;->density:F

    .line 404
    iget-object v0, p0, Lo/enm;->o:Landroid/text/TextPaint;

    iget v1, p0, Lo/enm;->d:F

    invoke-virtual {v0, v1}, Landroid/text/TextPaint;->setTextSize(F)V

    .line 405
    iget-object v0, p0, Lo/enm;->o:Landroid/text/TextPaint;

    const v1, 0x3dcccccd    # 0.1f

    const/4 v2, 0x0

    const v3, 0x3dcccccd    # 0.1f

    const v4, -0x3f3f40

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/text/TextPaint;->setShadowLayer(FFFI)V

    .line 406
    iget-object v0, p0, Lo/enm;->o:Landroid/text/TextPaint;

    invoke-virtual {v0, v5}, Landroid/text/TextPaint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 408
    :cond_2
    return-void
.end method

.method private b(Landroid/graphics/Canvas;I)V
    .locals 8

    .line 718
    invoke-virtual {p0}, Lo/enm;->getHeight()I

    move-result v0

    div-int/lit8 v6, v0, 0x2

    .line 720
    new-instance v7, Landroid/graphics/Paint;

    invoke-direct {v7}, Landroid/graphics/Paint;-><init>()V

    .line 722
    invoke-virtual {p0}, Lo/enm;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/commonui/R$color;->common_black_20alpha:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {v7, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 723
    iget v0, p0, Lo/enm;->f:I

    int-to-float v0, v0

    invoke-virtual {v7, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 724
    sget v0, Lo/enm;->I:I

    if-ne v0, p2, :cond_0

    .line 725
    move-object v0, p1

    invoke-virtual {p0}, Lo/enm;->getHeight()I

    move-result v1

    div-int/lit8 v1, v1, 0x8

    sub-int v1, v6, v1

    int-to-float v2, v1

    invoke-virtual {p0}, Lo/enm;->getWidth()I

    move-result v1

    int-to-float v3, v1

    invoke-virtual {p0}, Lo/enm;->getHeight()I

    move-result v1

    div-int/lit8 v1, v1, 0x8

    sub-int v1, v6, v1

    int-to-float v4, v1

    move-object v5, v7

    const/4 v1, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    goto :goto_0

    .line 727
    :cond_0
    move-object v0, p1

    invoke-virtual {p0}, Lo/enm;->getHeight()I

    move-result v1

    div-int/lit8 v1, v1, 0x8

    add-int/2addr v1, v6

    iget v2, p0, Lo/enm;->f:I

    sub-int/2addr v1, v2

    int-to-float v2, v1

    invoke-virtual {p0}, Lo/enm;->getWidth()I

    move-result v1

    int-to-float v3, v1

    invoke-virtual {p0}, Lo/enm;->getHeight()I

    move-result v1

    div-int/lit8 v1, v1, 0x8

    add-int/2addr v1, v6

    iget v4, p0, Lo/enm;->f:I

    sub-int/2addr v1, v4

    int-to-float v4, v1

    move-object v5, v7

    const/4 v1, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 729
    :goto_0
    return-void
.end method

.method static synthetic b(Lo/enm;)Z
    .locals 1

    .line 44
    iget-boolean v0, p0, Lo/enm;->q:Z

    return v0
.end method

.method static synthetic c(Lo/enm;)Landroid/widget/Scroller;
    .locals 1

    .line 44
    iget-object v0, p0, Lo/enm;->y:Landroid/widget/Scroller;

    return-object v0
.end method

.method private c()V
    .locals 1

    .line 373
    const/4 v0, 0x0

    iput-object v0, p0, Lo/enm;->n:Landroid/text/StaticLayout;

    .line 374
    const/4 v0, 0x0

    iput-object v0, p0, Lo/enm;->s:Landroid/text/StaticLayout;

    .line 375
    const/4 v0, 0x0

    iput-object v0, p0, Lo/enm;->u:Landroid/text/StaticLayout;

    .line 376
    const/4 v0, 0x0

    iput v0, p0, Lo/enm;->r:I

    .line 377
    return-void
.end method

.method private c(I)V
    .locals 5

    .line 812
    iget v0, p0, Lo/enm;->r:I

    add-int/2addr v0, p1

    iput v0, p0, Lo/enm;->r:I

    .line 813
    iget v0, p0, Lo/enm;->r:I

    invoke-direct {p0}, Lo/enm;->getItemHeight()I

    move-result v1

    div-int v2, v0, v1

    .line 814
    iget v0, p0, Lo/enm;->k:I

    sub-int v3, v0, v2

    .line 815
    iget-boolean v0, p0, Lo/enm;->b:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lo/enm;->g:Lo/enn;

    invoke-interface {v0}, Lo/enn;->d()I

    move-result v0

    if-lez v0, :cond_1

    .line 817
    :goto_0
    if-gez v3, :cond_0

    .line 818
    iget-object v0, p0, Lo/enm;->g:Lo/enn;

    invoke-interface {v0}, Lo/enn;->d()I

    move-result v0

    add-int/2addr v3, v0

    goto :goto_0

    .line 820
    :cond_0
    iget-object v0, p0, Lo/enm;->g:Lo/enn;

    invoke-interface {v0}, Lo/enn;->d()I

    move-result v0

    rem-int/2addr v3, v0

    goto :goto_1

    .line 821
    :cond_1
    iget-boolean v0, p0, Lo/enm;->q:Z

    if-eqz v0, :cond_3

    .line 823
    if-gez v3, :cond_2

    .line 824
    iget v2, p0, Lo/enm;->k:I

    .line 825
    const/4 v3, 0x0

    goto :goto_1

    .line 826
    :cond_2
    iget-object v0, p0, Lo/enm;->g:Lo/enn;

    invoke-interface {v0}, Lo/enn;->d()I

    move-result v0

    if-lt v3, v0, :cond_4

    .line 827
    iget v0, p0, Lo/enm;->k:I

    iget-object v1, p0, Lo/enm;->g:Lo/enn;

    invoke-interface {v1}, Lo/enn;->d()I

    move-result v1

    sub-int/2addr v0, v1

    add-int/lit8 v2, v0, 0x1

    .line 828
    iget-object v0, p0, Lo/enm;->g:Lo/enn;

    invoke-interface {v0}, Lo/enn;->d()I

    move-result v0

    add-int/lit8 v3, v0, -0x1

    goto :goto_1

    .line 832
    :cond_3
    const/4 v0, 0x0

    invoke-static {v3, v0}, Ljava/lang/Math;->max(II)I

    move-result v3

    .line 833
    iget-object v0, p0, Lo/enm;->g:Lo/enn;

    invoke-interface {v0}, Lo/enn;->d()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-static {v3, v0}, Ljava/lang/Math;->min(II)I

    move-result v3

    .line 836
    :cond_4
    :goto_1
    iget v4, p0, Lo/enm;->r:I

    .line 837
    iget v0, p0, Lo/enm;->k:I

    if-eq v3, v0, :cond_5

    .line 838
    const/4 v0, 0x0

    invoke-virtual {p0, v3, v0}, Lo/enm;->setCurrentItem(IZ)V

    goto :goto_2

    .line 840
    :cond_5
    invoke-virtual {p0}, Lo/enm;->invalidate()V

    .line 843
    :goto_2
    invoke-direct {p0}, Lo/enm;->getItemHeight()I

    move-result v0

    mul-int/2addr v0, v2

    sub-int v0, v4, v0

    iput v0, p0, Lo/enm;->r:I

    .line 844
    iget v0, p0, Lo/enm;->r:I

    invoke-virtual {p0}, Lo/enm;->getHeight()I

    move-result v1

    if-le v0, v1, :cond_6

    .line 845
    iget v0, p0, Lo/enm;->r:I

    invoke-virtual {p0}, Lo/enm;->getHeight()I

    move-result v1

    rem-int/2addr v0, v1

    invoke-virtual {p0}, Lo/enm;->getHeight()I

    move-result v1

    add-int/2addr v0, v1

    iput v0, p0, Lo/enm;->r:I

    .line 847
    :cond_6
    return-void
.end method

.method private c(Landroid/graphics/Canvas;)V
    .locals 6

    .line 748
    iget-object v0, p0, Lo/enm;->o:Landroid/text/TextPaint;

    iget v1, p0, Lo/enm;->v:I

    invoke-virtual {v0, v1}, Landroid/text/TextPaint;->setColor(I)V

    .line 749
    iget-object v0, p0, Lo/enm;->o:Landroid/text/TextPaint;

    invoke-virtual {p0}, Lo/enm;->getDrawableState()[I

    move-result-object v1

    iput-object v1, v0, Landroid/text/TextPaint;->drawableState:[I

    .line 751
    new-instance v3, Landroid/graphics/Rect;

    invoke-direct {v3}, Landroid/graphics/Rect;-><init>()V

    .line 752
    iget-object v0, p0, Lo/enm;->n:Landroid/text/StaticLayout;

    iget v1, p0, Lo/enm;->l:I

    div-int/lit8 v1, v1, 0x2

    invoke-virtual {v0, v1, v3}, Landroid/text/StaticLayout;->getLineBounds(ILandroid/graphics/Rect;)I

    .line 754
    iget v0, p0, Lo/enm;->d:F

    iget v1, p0, Lo/enm;->a:F

    sub-float/2addr v0, v1

    float-to-int v0, v0

    div-int/lit8 v4, v0, 0x2

    .line 756
    iget-object v0, p0, Lo/enm;->s:Landroid/text/StaticLayout;

    if-eqz v0, :cond_0

    .line 757
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 758
    iget v0, v3, Landroid/graphics/Rect;->top:I

    sub-int/2addr v0, v4

    iget v1, p0, Lo/enm;->r:I

    add-int v5, v0, v1

    .line 759
    int-to-float v0, v5

    const/4 v1, 0x0

    invoke-virtual {p1, v1, v0}, Landroid/graphics/Canvas;->translate(FF)V

    .line 760
    iget-object v0, p0, Lo/enm;->s:Landroid/text/StaticLayout;

    invoke-virtual {v0, p1}, Landroid/text/StaticLayout;->draw(Landroid/graphics/Canvas;)V

    .line 761
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 763
    :cond_0
    return-void
.end method

.method private d(Landroid/text/Layout;)I
    .locals 4

    .line 417
    if-nez p1, :cond_0

    .line 418
    const/4 v0, 0x0

    return v0

    .line 421
    :cond_0
    invoke-direct {p0}, Lo/enm;->getItemHeight()I

    move-result v0

    iget v1, p0, Lo/enm;->l:I

    mul-int/2addr v0, v1

    int-to-float v0, v0

    iget v1, p0, Lo/enm;->h:F

    const/high16 v2, 0x40000000    # 2.0f

    mul-float/2addr v1, v2

    sub-float/2addr v0, v1

    iget v1, p0, Lo/enm;->e:I

    int-to-float v1, v1

    sub-float/2addr v0, v1

    float-to-int v3, v0

    .line 425
    invoke-virtual {p0}, Lo/enm;->getSuggestedMinimumHeight()I

    move-result v0

    invoke-static {v3, v0}, Ljava/lang/Math;->max(II)I

    move-result v3

    .line 427
    return v3
.end method

.method static synthetic d(Lo/enm;)V
    .locals 0

    .line 44
    invoke-direct {p0}, Lo/enm;->g()V

    return-void
.end method

.method static synthetic d(Lo/enm;I)V
    .locals 0

    .line 44
    invoke-direct {p0, p1}, Lo/enm;->c(I)V

    return-void
.end method

.method static synthetic e(Lo/enm;)I
    .locals 1

    .line 44
    iget v0, p0, Lo/enm;->k:I

    return v0
.end method

.method private e(Z)Ljava/lang/String;
    .locals 8

    .line 489
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 490
    iget v0, p0, Lo/enm;->l:I

    div-int/lit8 v0, v0, 0x2

    add-int/lit8 v5, v0, 0x1

    .line 492
    iget v0, p0, Lo/enm;->k:I

    sub-int v6, v0, v5

    :goto_0
    iget v0, p0, Lo/enm;->k:I

    add-int/2addr v0, v5

    if-gt v6, v0, :cond_4

    .line 493
    if-nez p1, :cond_0

    iget v0, p0, Lo/enm;->k:I

    if-eq v6, v0, :cond_2

    .line 494
    :cond_0
    invoke-direct {p0, v6}, Lo/enm;->a(I)Ljava/lang/String;

    move-result-object v7

    .line 495
    if-eqz v7, :cond_2

    iget v0, p0, Lo/enm;->k:I

    add-int/lit8 v0, v0, 0x1

    if-eq v6, v0, :cond_1

    iget v0, p0, Lo/enm;->k:I

    add-int/lit8 v0, v0, -0x1

    if-ne v6, v0, :cond_2

    .line 496
    :cond_1
    const-string v0, "WheelView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "buildInnerText getTextItem(i) : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "  text : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 497
    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 500
    :cond_2
    iget v0, p0, Lo/enm;->k:I

    add-int/2addr v0, v5

    if-ge v6, v0, :cond_3

    .line 501
    const-string v0, "WheelView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "buildInnerText i : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "  text : \n"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 502
    const-string v0, "\n"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 492
    :cond_3
    add-int/lit8 v6, v6, 0x1

    goto/16 :goto_0

    .line 505
    :cond_4
    const-string v0, "WheelView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "buildInnerText.toString()"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 507
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private e(I)V
    .locals 11

    .line 614
    iget-object v0, p0, Lo/enm;->n:Landroid/text/StaticLayout;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/enm;->n:Landroid/text/StaticLayout;

    invoke-virtual {v0}, Landroid/text/StaticLayout;->getWidth()I

    move-result v0

    if-le v0, p1, :cond_1

    .line 615
    :cond_0
    new-instance v0, Landroid/text/StaticLayout;

    iget-boolean v1, p0, Lo/enm;->q:Z

    invoke-direct {p0, v1}, Lo/enm;->b(Z)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lo/enm;->p:Landroid/text/TextPaint;

    sget-object v4, Landroid/text/Layout$Alignment;->ALIGN_CENTER:Landroid/text/Layout$Alignment;

    iget v3, p0, Lo/enm;->e:I

    int-to-float v6, v3

    move v3, p1

    const/high16 v5, 0x3f800000    # 1.0f

    const/4 v7, 0x0

    invoke-direct/range {v0 .. v7}, Landroid/text/StaticLayout;-><init>(Ljava/lang/CharSequence;Landroid/text/TextPaint;ILandroid/text/Layout$Alignment;FFZ)V

    iput-object v0, p0, Lo/enm;->n:Landroid/text/StaticLayout;

    .line 619
    iget-object v0, p0, Lo/enm;->p:Landroid/text/TextPaint;

    invoke-virtual {v0}, Landroid/text/TextPaint;->getFontMetrics()Landroid/graphics/Paint$FontMetrics;

    move-result-object v8

    .line 620
    iget v9, v8, Landroid/graphics/Paint$FontMetrics;->top:F

    .line 621
    const-string v0, "WheelView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "ori top : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 622
    const/4 v0, 0x0

    iput v0, v8, Landroid/graphics/Paint$FontMetrics;->top:F

    .line 623
    iget-object v0, p0, Lo/enm;->p:Landroid/text/TextPaint;

    invoke-virtual {v0, v8}, Landroid/text/TextPaint;->getFontMetrics(Landroid/graphics/Paint$FontMetrics;)F

    .line 624
    iget-object v0, p0, Lo/enm;->p:Landroid/text/TextPaint;

    invoke-virtual {v0}, Landroid/text/TextPaint;->getFontMetrics()Landroid/graphics/Paint$FontMetrics;

    move-result-object v8

    .line 625
    iget v10, v8, Landroid/graphics/Paint$FontMetrics;->top:F

    .line 626
    const-string v0, "WheelView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "afterTop : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 627
    goto :goto_0

    .line 628
    :cond_1
    iget-object v0, p0, Lo/enm;->n:Landroid/text/StaticLayout;

    invoke-virtual {v0, p1}, Landroid/text/StaticLayout;->increaseWidthTo(I)V

    .line 631
    :goto_0
    iget-object v0, p0, Lo/enm;->u:Landroid/text/StaticLayout;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lo/enm;->u:Landroid/text/StaticLayout;

    invoke-virtual {v0}, Landroid/text/StaticLayout;->getWidth()I

    move-result v0

    if-le v0, p1, :cond_3

    .line 632
    :cond_2
    new-instance v0, Landroid/text/StaticLayout;

    iget-boolean v1, p0, Lo/enm;->q:Z

    invoke-direct {p0, v1}, Lo/enm;->e(Z)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lo/enm;->p:Landroid/text/TextPaint;

    sget-object v4, Landroid/text/Layout$Alignment;->ALIGN_CENTER:Landroid/text/Layout$Alignment;

    iget v3, p0, Lo/enm;->e:I

    int-to-float v6, v3

    move v3, p1

    const/high16 v5, 0x3f800000    # 1.0f

    const/4 v7, 0x0

    invoke-direct/range {v0 .. v7}, Landroid/text/StaticLayout;-><init>(Ljava/lang/CharSequence;Landroid/text/TextPaint;ILandroid/text/Layout$Alignment;FFZ)V

    iput-object v0, p0, Lo/enm;->u:Landroid/text/StaticLayout;

    goto :goto_1

    .line 637
    :cond_3
    iget-object v0, p0, Lo/enm;->u:Landroid/text/StaticLayout;

    invoke-virtual {v0, p1}, Landroid/text/StaticLayout;->increaseWidthTo(I)V

    .line 640
    :goto_1
    iget-boolean v0, p0, Lo/enm;->q:Z

    if-nez v0, :cond_7

    iget-object v0, p0, Lo/enm;->s:Landroid/text/StaticLayout;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lo/enm;->s:Landroid/text/StaticLayout;

    .line 641
    invoke-virtual {v0}, Landroid/text/StaticLayout;->getWidth()I

    move-result v0

    if-le v0, p1, :cond_7

    .line 642
    :cond_4
    invoke-virtual {p0}, Lo/enm;->getAdapter()Lo/enn;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-virtual {p0}, Lo/enm;->getAdapter()Lo/enn;

    move-result-object v0

    iget v1, p0, Lo/enm;->k:I

    invoke-interface {v0, v1}, Lo/enn;->b(I)Ljava/lang/String;

    move-result-object v8

    goto :goto_2

    :cond_5
    const/4 v8, 0x0

    .line 644
    :goto_2
    const-string v0, "WheelView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "text : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 645
    new-instance v0, Landroid/text/StaticLayout;

    if-eqz v8, :cond_6

    move-object v1, v8

    goto :goto_3

    :cond_6
    const-string v1, ""

    :goto_3
    iget-object v2, p0, Lo/enm;->o:Landroid/text/TextPaint;

    sget-object v4, Landroid/text/Layout$Alignment;->ALIGN_CENTER:Landroid/text/Layout$Alignment;

    iget v3, p0, Lo/enm;->e:I

    int-to-float v6, v3

    move v3, p1

    const/high16 v5, 0x3f800000    # 1.0f

    const/4 v7, 0x0

    invoke-direct/range {v0 .. v7}, Landroid/text/StaticLayout;-><init>(Ljava/lang/CharSequence;Landroid/text/TextPaint;ILandroid/text/Layout$Alignment;FFZ)V

    iput-object v0, p0, Lo/enm;->s:Landroid/text/StaticLayout;

    .line 649
    goto :goto_4

    :cond_7
    iget-boolean v0, p0, Lo/enm;->q:Z

    if-eqz v0, :cond_8

    .line 650
    const/4 v0, 0x0

    iput-object v0, p0, Lo/enm;->s:Landroid/text/StaticLayout;

    goto :goto_4

    .line 652
    :cond_8
    iget-object v0, p0, Lo/enm;->s:Landroid/text/StaticLayout;

    invoke-virtual {v0, p1}, Landroid/text/StaticLayout;->increaseWidthTo(I)V

    .line 654
    :goto_4
    return-void
.end method

.method static synthetic e(Lo/enm;I)V
    .locals 0

    .line 44
    invoke-direct {p0, p1}, Lo/enm;->setNextMessage(I)V

    return-void
.end method

.method static synthetic f(Lo/enm;)I
    .locals 1

    .line 44
    iget v0, p0, Lo/enm;->w:I

    return v0
.end method

.method private f()V
    .locals 9

    .line 917
    iget-object v0, p0, Lo/enm;->g:Lo/enn;

    if-nez v0, :cond_0

    .line 918
    return-void

    .line 921
    :cond_0
    const/4 v0, 0x0

    iput v0, p0, Lo/enm;->w:I

    .line 922
    iget v6, p0, Lo/enm;->r:I

    .line 923
    invoke-direct {p0}, Lo/enm;->getItemHeight()I

    move-result v7

    .line 924
    if-lez v6, :cond_2

    iget v0, p0, Lo/enm;->k:I

    iget-object v1, p0, Lo/enm;->g:Lo/enn;

    .line 925
    invoke-interface {v1}, Lo/enn;->d()I

    move-result v1

    if-ge v0, v1, :cond_1

    const/4 v8, 0x1

    goto :goto_0

    :cond_1
    const/4 v8, 0x0

    goto :goto_0

    :cond_2
    iget v0, p0, Lo/enm;->k:I

    if-lez v0, :cond_3

    const/4 v8, 0x1

    goto :goto_0

    :cond_3
    const/4 v8, 0x0

    .line 926
    :goto_0
    iget-boolean v0, p0, Lo/enm;->b:Z

    if-nez v0, :cond_4

    if-eqz v8, :cond_6

    :cond_4
    int-to-float v0, v6

    .line 927
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    int-to-float v1, v7

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    cmpl-float v0, v0, v1

    if-lez v0, :cond_6

    .line 928
    if-gez v6, :cond_5

    .line 929
    add-int/lit8 v0, v7, 0x1

    add-int/2addr v6, v0

    goto :goto_1

    .line 931
    :cond_5
    add-int/lit8 v0, v7, 0x1

    sub-int/2addr v6, v0

    .line 933
    :cond_6
    :goto_1
    invoke-static {v6}, Ljava/lang/Math;->abs(I)I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_7

    .line 934
    iget-object v0, p0, Lo/enm;->y:Landroid/widget/Scroller;

    move v4, v6

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/16 v5, 0x190

    invoke-virtual/range {v0 .. v5}, Landroid/widget/Scroller;->startScroll(IIIII)V

    .line 935
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lo/enm;->setNextMessage(I)V

    goto :goto_2

    .line 937
    :cond_7
    invoke-virtual {p0}, Lo/enm;->e()V

    .line 939
    :goto_2
    return-void
.end method

.method static synthetic g(Lo/enm;)I
    .locals 1

    .line 44
    iget v0, p0, Lo/enm;->r:I

    return v0
.end method

.method private g()V
    .locals 2

    .line 942
    iget-object v0, p0, Lo/enm;->K:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 943
    iget-object v0, p0, Lo/enm;->K:Landroid/os/Handler;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 944
    return-void
.end method

.method private getItemHeight()I
    .locals 3

    .line 546
    iget v0, p0, Lo/enm;->m:I

    if-eqz v0, :cond_0

    .line 547
    iget v0, p0, Lo/enm;->m:I

    return v0

    .line 548
    :cond_0
    iget-object v0, p0, Lo/enm;->n:Landroid/text/StaticLayout;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lo/enm;->n:Landroid/text/StaticLayout;

    invoke-virtual {v0}, Landroid/text/StaticLayout;->getLineCount()I

    move-result v0

    const/4 v1, 0x2

    if-le v0, v1, :cond_1

    .line 549
    iget-object v0, p0, Lo/enm;->n:Landroid/text/StaticLayout;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/text/StaticLayout;->getLineTop(I)I

    move-result v0

    iget-object v1, p0, Lo/enm;->n:Landroid/text/StaticLayout;

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Landroid/text/StaticLayout;->getLineTop(I)I

    move-result v1

    sub-int/2addr v0, v1

    iput v0, p0, Lo/enm;->m:I

    .line 550
    iget v0, p0, Lo/enm;->m:I

    return v0

    .line 553
    :cond_1
    invoke-virtual {p0}, Lo/enm;->getHeight()I

    move-result v0

    iget v1, p0, Lo/enm;->l:I

    div-int/2addr v0, v1

    return v0
.end method

.method private getMaxTextLength()I
    .locals 8

    .line 516
    invoke-virtual {p0}, Lo/enm;->getAdapter()Lo/enn;

    move-result-object v2

    .line 517
    if-nez v2, :cond_0

    .line 518
    const/4 v0, 0x0

    return v0

    .line 521
    :cond_0
    invoke-interface {v2}, Lo/enn;->a()I

    move-result v3

    .line 522
    if-lez v3, :cond_1

    .line 523
    return v3

    .line 526
    :cond_1
    const/4 v4, 0x0

    .line 527
    iget v0, p0, Lo/enm;->l:I

    div-int/lit8 v5, v0, 0x2

    .line 528
    iget v0, p0, Lo/enm;->k:I

    sub-int/2addr v0, v5

    const/4 v1, 0x0

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v6

    :goto_0
    iget v0, p0, Lo/enm;->k:I

    iget v1, p0, Lo/enm;->l:I

    add-int/2addr v0, v1

    .line 529
    invoke-interface {v2}, Lo/enn;->d()I

    move-result v1

    .line 528
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    if-ge v6, v0, :cond_4

    .line 530
    invoke-interface {v2, v6}, Lo/enn;->b(I)Ljava/lang/String;

    move-result-object v7

    .line 531
    if-eqz v7, :cond_3

    if-eqz v4, :cond_2

    .line 532
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v0

    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v1

    if-ge v0, v1, :cond_3

    .line 533
    :cond_2
    move-object v4, v7

    .line 529
    :cond_3
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 537
    :cond_4
    if-eqz v4, :cond_5

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v0

    goto :goto_1

    :cond_5
    const/4 v0, 0x0

    :goto_1
    return v0
.end method

.method private getScreenWidth()I
    .locals 4

    .line 679
    invoke-virtual {p0}, Lo/enm;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/ene;->t(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 680
    invoke-virtual {p0}, Lo/enm;->getContext()Landroid/content/Context;

    move-result-object v0

    const/high16 v1, 0x433f0000    # 191.0f

    invoke-static {v0, v1}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v0

    return v0

    .line 683
    :cond_0
    new-instance v2, Landroid/util/DisplayMetrics;

    invoke-direct {v2}, Landroid/util/DisplayMetrics;-><init>()V

    .line 684
    invoke-virtual {p0}, Lo/enm;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "window"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroid/view/WindowManager;

    .line 685
    invoke-interface {v3}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V

    .line 686
    iget v0, v2, Landroid/util/DisplayMetrics;->widthPixels:I

    return v0
.end method

.method static synthetic h(Lo/enm;)I
    .locals 1

    .line 44
    invoke-direct {p0}, Lo/enm;->getItemHeight()I

    move-result v0

    return v0
.end method

.method static synthetic i(Lo/enm;)Lo/enn;
    .locals 1

    .line 44
    iget-object v0, p0, Lo/enm;->g:Lo/enn;

    return-object v0
.end method

.method static synthetic k(Lo/enm;)Landroid/os/Handler;
    .locals 1

    .line 44
    iget-object v0, p0, Lo/enm;->K:Landroid/os/Handler;

    return-object v0
.end method

.method private k()V
    .locals 1

    .line 950
    iget-boolean v0, p0, Lo/enm;->q:Z

    if-nez v0, :cond_0

    .line 951
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/enm;->q:Z

    .line 952
    invoke-virtual {p0}, Lo/enm;->a()V

    .line 954
    :cond_0
    return-void
.end method

.method static synthetic n(Lo/enm;)V
    .locals 0

    .line 44
    invoke-direct {p0}, Lo/enm;->f()V

    return-void
.end method

.method private setNextMessage(I)V
    .locals 1

    .line 909
    invoke-direct {p0}, Lo/enm;->g()V

    .line 910
    iget-object v0, p0, Lo/enm;->K:Landroid/os/Handler;

    invoke-virtual {v0, p1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 911
    return-void
.end method


# virtual methods
.method protected a()V
    .locals 3

    .line 290
    iget-object v0, p0, Lo/enm;->x:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lo/eng;

    .line 291
    invoke-interface {v2, p0}, Lo/eng;->b(Lo/enm;)V

    .line 292
    goto :goto_0

    .line 293
    :cond_0
    return-void
.end method

.method public c(II)V
    .locals 7

    .line 975
    iget-object v0, p0, Lo/enm;->y:Landroid/widget/Scroller;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/Scroller;->forceFinished(Z)V

    .line 977
    iget v0, p0, Lo/enm;->r:I

    iput v0, p0, Lo/enm;->w:I

    .line 978
    invoke-direct {p0}, Lo/enm;->getItemHeight()I

    move-result v0

    mul-int v6, p1, v0

    .line 980
    iget-object v0, p0, Lo/enm;->y:Landroid/widget/Scroller;

    iget v2, p0, Lo/enm;->w:I

    iget v1, p0, Lo/enm;->w:I

    sub-int v4, v6, v1

    move v5, p2

    const/4 v1, 0x0

    const/4 v3, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/widget/Scroller;->startScroll(IIIII)V

    .line 981
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lo/enm;->setNextMessage(I)V

    .line 983
    invoke-direct {p0}, Lo/enm;->k()V

    .line 984
    return-void
.end method

.method protected d()V
    .locals 3

    .line 299
    iget-object v0, p0, Lo/enm;->x:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lo/eng;

    .line 300
    invoke-interface {v2, p0}, Lo/eng;->e(Lo/enm;)V

    .line 301
    goto :goto_0

    .line 302
    :cond_0
    return-void
.end method

.method protected d(II)V
    .locals 3

    .line 281
    iget-object v0, p0, Lo/enm;->z:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lo/enh;

    .line 282
    invoke-interface {v2, p0, p1, p2}, Lo/enh;->d(Lo/enm;II)V

    .line 283
    goto :goto_0

    .line 284
    :cond_0
    return-void
.end method

.method e()V
    .locals 1

    .line 960
    iget-boolean v0, p0, Lo/enm;->q:Z

    if-eqz v0, :cond_0

    .line 961
    invoke-virtual {p0}, Lo/enm;->d()V

    .line 962
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/enm;->q:Z

    .line 964
    :cond_0
    invoke-direct {p0}, Lo/enm;->c()V

    .line 965
    invoke-virtual {p0}, Lo/enm;->invalidate()V

    .line 966
    return-void
.end method

.method public getAdapter()Lo/enn;
    .locals 1

    .line 220
    iget-object v0, p0, Lo/enm;->g:Lo/enn;

    return-object v0
.end method

.method public getCurrentItem()I
    .locals 1

    .line 310
    iget v0, p0, Lo/enm;->k:I

    return v0
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 2

    .line 692
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 694
    iget-object v0, p0, Lo/enm;->n:Landroid/text/StaticLayout;

    if-nez v0, :cond_1

    .line 695
    iget v0, p0, Lo/enm;->i:I

    if-nez v0, :cond_0

    .line 696
    invoke-virtual {p0}, Lo/enm;->getWidth()I

    move-result v0

    const/high16 v1, 0x40000000    # 2.0f

    invoke-direct {p0, v0, v1}, Lo/enm;->b(II)I

    goto :goto_0

    .line 698
    :cond_0
    iget v0, p0, Lo/enm;->i:I

    invoke-direct {p0, v0}, Lo/enm;->e(I)V

    .line 702
    :cond_1
    :goto_0
    sget v0, Lo/enm;->I:I

    invoke-direct {p0, p1, v0}, Lo/enm;->b(Landroid/graphics/Canvas;I)V

    .line 704
    sget v0, Lo/enm;->F:I

    invoke-direct {p0, p1, v0}, Lo/enm;->b(Landroid/graphics/Canvas;I)V

    .line 705
    iget v0, p0, Lo/enm;->i:I

    if-lez v0, :cond_2

    .line 706
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 708
    iget v0, p0, Lo/enm;->h:F

    neg-float v0, v0

    const/4 v1, 0x0

    invoke-virtual {p1, v1, v0}, Landroid/graphics/Canvas;->translate(FF)V

    .line 709
    invoke-direct {p0, p1}, Lo/enm;->a(Landroid/graphics/Canvas;)V

    .line 710
    iget v0, p0, Lo/enm;->h:F

    neg-float v0, v0

    const/4 v1, 0x0

    invoke-virtual {p1, v1, v0}, Landroid/graphics/Canvas;->translate(FF)V

    .line 711
    invoke-direct {p0, p1}, Lo/enm;->c(Landroid/graphics/Canvas;)V

    .line 712
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 713
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 715
    :cond_2
    return-void
.end method

.method protected onMeasure(II)V
    .locals 5

    .line 658
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v1

    .line 659
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v2

    .line 660
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v3

    .line 662
    iget v0, p0, Lo/enm;->E:I

    invoke-direct {p0, v0, v1}, Lo/enm;->b(II)I

    .line 665
    const/high16 v0, 0x40000000    # 2.0f

    if-ne v2, v0, :cond_0

    .line 666
    move v4, v3

    goto :goto_0

    .line 668
    :cond_0
    iget-object v0, p0, Lo/enm;->n:Landroid/text/StaticLayout;

    invoke-direct {p0, v0}, Lo/enm;->d(Landroid/text/Layout;)I

    move-result v4

    .line 670
    const/high16 v0, -0x80000000

    if-ne v2, v0, :cond_1

    .line 671
    invoke-static {v4, v3}, Ljava/lang/Math;->min(II)I

    move-result v4

    .line 675
    :cond_1
    :goto_0
    iget v0, p0, Lo/enm;->E:I

    invoke-virtual {p0, v0, v4}, Lo/enm;->setMeasuredDimension(II)V

    .line 676
    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 3

    .line 795
    invoke-virtual {p0}, Lo/enm;->getAdapter()Lo/enn;

    move-result-object v2

    .line 796
    if-nez v2, :cond_0

    .line 797
    const/4 v0, 0x1

    return v0

    .line 799
    :cond_0
    iget-object v0, p0, Lo/enm;->t:Landroid/view/GestureDetector;

    invoke-virtual {v0, p1}, Landroid/view/GestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 800
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 801
    invoke-direct {p0}, Lo/enm;->f()V

    .line 803
    :cond_1
    const/4 v0, 0x1

    return v0
.end method

.method public setAdapter(Lo/enn;)V
    .locals 0

    .line 229
    iput-object p1, p0, Lo/enm;->g:Lo/enn;

    .line 230
    invoke-direct {p0}, Lo/enm;->c()V

    .line 231
    invoke-virtual {p0}, Lo/enm;->invalidate()V

    .line 232
    return-void
.end method

.method public setColor(Z)V
    .locals 1

    .line 732
    if-eqz p1, :cond_0

    .line 733
    iget v0, p0, Lo/enm;->C:I

    iput v0, p0, Lo/enm;->v:I

    .line 734
    invoke-virtual {p0}, Lo/enm;->invalidate()V

    goto :goto_0

    .line 736
    :cond_0
    iget v0, p0, Lo/enm;->D:I

    iput v0, p0, Lo/enm;->v:I

    .line 737
    invoke-virtual {p0}, Lo/enm;->invalidate()V

    .line 739
    :goto_0
    return-void
.end method

.method public setCurrentItem(I)V
    .locals 1

    .line 354
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lo/enm;->setCurrentItem(IZ)V

    .line 355
    return-void
.end method

.method public setCurrentItem(IZ)V
    .locals 3

    .line 320
    iget-object v0, p0, Lo/enm;->g:Lo/enn;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/enm;->g:Lo/enn;

    invoke-interface {v0}, Lo/enn;->d()I

    move-result v0

    if-nez v0, :cond_1

    .line 321
    :cond_0
    return-void

    .line 323
    :cond_1
    if-ltz p1, :cond_2

    iget-object v0, p0, Lo/enm;->g:Lo/enn;

    invoke-interface {v0}, Lo/enn;->d()I

    move-result v0

    if-lt p1, v0, :cond_5

    .line 324
    :cond_2
    iget-boolean v0, p0, Lo/enm;->b:Z

    if-eqz v0, :cond_4

    .line 325
    :goto_0
    if-gez p1, :cond_3

    goto :goto_0

    .line 327
    :cond_3
    iget-object v0, p0, Lo/enm;->g:Lo/enn;

    invoke-interface {v0}, Lo/enn;->d()I

    move-result v0

    rem-int/2addr p1, v0

    goto :goto_1

    .line 329
    :cond_4
    return-void

    .line 332
    :cond_5
    :goto_1
    iget v0, p0, Lo/enm;->k:I

    if-eq p1, v0, :cond_7

    .line 333
    if-eqz p2, :cond_6

    .line 334
    iget v0, p0, Lo/enm;->k:I

    sub-int v0, p1, v0

    const/16 v1, 0x190

    invoke-virtual {p0, v0, v1}, Lo/enm;->c(II)V

    goto :goto_2

    .line 336
    :cond_6
    invoke-direct {p0}, Lo/enm;->c()V

    .line 338
    iget v2, p0, Lo/enm;->k:I

    .line 339
    iput p1, p0, Lo/enm;->k:I

    .line 341
    iget v0, p0, Lo/enm;->k:I

    invoke-virtual {p0, v2, v0}, Lo/enm;->d(II)V

    .line 343
    invoke-virtual {p0}, Lo/enm;->invalidate()V

    .line 346
    :cond_7
    :goto_2
    return-void
.end method

.method public setCyclic(Z)V
    .locals 0

    .line 363
    iput-boolean p1, p0, Lo/enm;->b:Z

    .line 365
    invoke-virtual {p0}, Lo/enm;->invalidate()V

    .line 366
    invoke-direct {p0}, Lo/enm;->c()V

    .line 367
    return-void
.end method

.method public setInterpolator(Landroid/view/animation/Interpolator;)V
    .locals 2

    .line 261
    iget-object v0, p0, Lo/enm;->y:Landroid/widget/Scroller;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/Scroller;->forceFinished(Z)V

    .line 262
    new-instance v0, Landroid/widget/Scroller;

    invoke-virtual {p0}, Lo/enm;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Landroid/widget/Scroller;-><init>(Landroid/content/Context;Landroid/view/animation/Interpolator;)V

    iput-object v0, p0, Lo/enm;->y:Landroid/widget/Scroller;

    .line 263
    return-void
.end method

.method public setWidth(IZ)V
    .locals 4

    .line 241
    iput-boolean p2, p0, Lo/enm;->H:Z

    .line 242
    const/4 v3, 0x0

    .line 243
    invoke-virtual {p0}, Lo/enm;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/ene;->t(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 244
    invoke-direct {p0}, Lo/enm;->getScreenWidth()I

    move-result v3

    goto :goto_0

    .line 246
    :cond_0
    invoke-direct {p0}, Lo/enm;->getScreenWidth()I

    move-result v0

    invoke-virtual {p0}, Lo/enm;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/commonui/R$dimen;->hw_show_public_size_60:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    sub-int v3, v0, v1

    .line 248
    :goto_0
    const/4 v0, 0x2

    if-ne v0, p1, :cond_1

    .line 249
    div-int/lit8 v0, v3, 0x3

    iput v0, p0, Lo/enm;->E:I

    goto :goto_1

    .line 251
    :cond_1
    div-int/lit8 v0, v3, 0x2

    iput v0, p0, Lo/enm;->E:I

    .line 253
    :goto_1
    return-void
.end method
