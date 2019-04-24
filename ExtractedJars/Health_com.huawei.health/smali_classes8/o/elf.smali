.class public Lo/elf;
.super Lo/np;
.source "SourceFile"


# instance fields
.field private f:Landroid/content/Context;

.field private k:Lo/eie;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lo/eie;Lo/oa;Lo/lm;)V
    .locals 1

    .line 33
    invoke-direct {p0, p3, p4}, Lo/np;-><init>(Lo/oa;Lo/lm;)V

    .line 29
    const/4 v0, 0x0

    iput-object v0, p0, Lo/elf;->f:Landroid/content/Context;

    .line 34
    iput-object p1, p0, Lo/elf;->f:Landroid/content/Context;

    .line 35
    iput-object p2, p0, Lo/elf;->k:Lo/eie;

    .line 36
    return-void
.end method


# virtual methods
.method public e(Landroid/graphics/Canvas;)V
    .locals 9

    .line 40
    iget-object v0, p0, Lo/elf;->e:Lo/lm;

    invoke-virtual {v0}, Lo/lm;->B()Z

    move-result v0

    if-nez v0, :cond_0

    .line 41
    return-void

    .line 43
    :cond_0
    iget-object v0, p0, Lo/elf;->f:Landroid/content/Context;

    invoke-static {v0}, Lo/ehw;->c(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 45
    iget-object v0, p0, Lo/elf;->e:Lo/lm;

    sget-object v1, Lo/lm$b;->e:Lo/lm$b;

    invoke-virtual {v0, v1}, Lo/lm;->b(Lo/lm$b;)V

    .line 46
    iget-object v0, p0, Lo/elf;->e:Lo/lm;

    sget-object v1, Lo/lm$a;->d:Lo/lm$a;

    invoke-virtual {v0, v1}, Lo/lm;->a(Lo/lm$a;)V

    goto :goto_0

    .line 49
    :cond_1
    iget-object v0, p0, Lo/elf;->e:Lo/lm;

    sget-object v1, Lo/lm$b;->b:Lo/lm$b;

    invoke-virtual {v0, v1}, Lo/lm;->b(Lo/lm$b;)V

    .line 50
    iget-object v0, p0, Lo/elf;->e:Lo/lm;

    sget-object v1, Lo/lm$a;->a:Lo/lm$a;

    invoke-virtual {v0, v1}, Lo/lm;->a(Lo/lm$a;)V

    .line 53
    :goto_0
    iget-object v0, p0, Lo/elf;->e:Lo/lm;

    invoke-virtual {v0}, Lo/lm;->d()[Lo/li;

    move-result-object v0

    array-length v0, v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_2

    .line 56
    return-void

    .line 59
    :cond_2
    iget-object v0, p0, Lo/elf;->e:Lo/lm;

    invoke-virtual {v0}, Lo/lm;->x()Landroid/graphics/Typeface;

    move-result-object v2

    .line 61
    if-eqz v2, :cond_3

    .line 62
    iget-object v0, p0, Lo/elf;->d:Landroid/graphics/Paint;

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 64
    :cond_3
    iget-object v0, p0, Lo/elf;->d:Landroid/graphics/Paint;

    iget-object v1, p0, Lo/elf;->e:Lo/lm;

    invoke-virtual {v1}, Lo/lm;->z()F

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 65
    iget-object v0, p0, Lo/elf;->d:Landroid/graphics/Paint;

    iget-object v1, p0, Lo/elf;->e:Lo/lm;

    invoke-virtual {v1}, Lo/lm;->A()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 69
    iget-object v0, p0, Lo/elf;->e:Lo/lm;

    invoke-virtual {v0}, Lo/lm;->d()[Lo/li;

    move-result-object v3

    .line 73
    iget-object v0, p0, Lo/elf;->k:Lo/eie;

    invoke-virtual {v0}, Lo/eie;->E()Lo/ehh;

    move-result-object v0

    invoke-virtual {v0}, Lo/ehh;->g()Landroid/graphics/Rect;

    move-result-object v0

    iget v0, v0, Landroid/graphics/Rect;->top:I

    int-to-float v4, v0

    .line 74
    iget-object v0, p0, Lo/elf;->d:Landroid/graphics/Paint;

    invoke-virtual {v0}, Landroid/graphics/Paint;->getFontMetrics()Landroid/graphics/Paint$FontMetrics;

    move-result-object v5

    .line 75
    iget v0, v5, Landroid/graphics/Paint$FontMetrics;->top:F

    neg-float v0, v0

    add-float/2addr v4, v0

    .line 77
    iget-object v0, p0, Lo/elf;->k:Lo/eie;

    invoke-virtual {v0}, Lo/eie;->E()Lo/ehh;

    move-result-object v0

    invoke-virtual {v0}, Lo/ehh;->g()Landroid/graphics/Rect;

    move-result-object v6

    .line 79
    iget-object v0, p0, Lo/elf;->e:Lo/lm;

    invoke-virtual {v0}, Lo/lm;->d()[Lo/li;

    move-result-object v0

    array-length v0, v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_5

    .line 81
    iget-object v0, p0, Lo/elf;->f:Landroid/content/Context;

    invoke-static {v0}, Lo/ehw;->c(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 82
    iget v0, v6, Landroid/graphics/Rect;->left:I

    int-to-float v7, v0

    .line 83
    iget-object v0, p0, Lo/elf;->d:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Align;->LEFT:Landroid/graphics/Paint$Align;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    .line 84
    const/4 v0, 0x0

    aget-object v0, v3, v0

    iget-object v0, v0, Lo/li;->c:Ljava/lang/String;

    invoke-virtual {p0, p1, v7, v4, v0}, Lo/elf;->b(Landroid/graphics/Canvas;FFLjava/lang/String;)V

    .line 85
    goto/16 :goto_1

    .line 86
    :cond_4
    iget v0, v6, Landroid/graphics/Rect;->right:I

    int-to-float v7, v0

    .line 87
    iget-object v0, p0, Lo/elf;->d:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Align;->RIGHT:Landroid/graphics/Paint$Align;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    .line 88
    const/4 v0, 0x0

    aget-object v0, v3, v0

    iget-object v0, v0, Lo/li;->c:Ljava/lang/String;

    invoke-virtual {p0, p1, v7, v4, v0}, Lo/elf;->b(Landroid/graphics/Canvas;FFLjava/lang/String;)V

    .line 89
    goto/16 :goto_1

    .line 90
    :cond_5
    iget-object v0, p0, Lo/elf;->e:Lo/lm;

    invoke-virtual {v0}, Lo/lm;->d()[Lo/li;

    move-result-object v0

    array-length v0, v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_7

    .line 92
    iget v0, v6, Landroid/graphics/Rect;->left:I

    int-to-float v7, v0

    .line 93
    iget v0, v6, Landroid/graphics/Rect;->right:I

    int-to-float v8, v0

    .line 95
    iget-object v0, p0, Lo/elf;->f:Landroid/content/Context;

    invoke-static {v0}, Lo/ehw;->c(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_6

    .line 96
    iget-object v0, p0, Lo/elf;->d:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Align;->LEFT:Landroid/graphics/Paint$Align;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    .line 97
    const/4 v0, 0x0

    aget-object v0, v3, v0

    iget-object v0, v0, Lo/li;->c:Ljava/lang/String;

    invoke-virtual {p0, p1, v7, v4, v0}, Lo/elf;->b(Landroid/graphics/Canvas;FFLjava/lang/String;)V

    .line 99
    iget-object v0, p0, Lo/elf;->d:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Align;->RIGHT:Landroid/graphics/Paint$Align;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    .line 100
    const/4 v0, 0x1

    aget-object v0, v3, v0

    iget-object v0, v0, Lo/li;->c:Ljava/lang/String;

    invoke-virtual {p0, p1, v8, v4, v0}, Lo/elf;->b(Landroid/graphics/Canvas;FFLjava/lang/String;)V

    goto :goto_1

    .line 102
    :cond_6
    iget-object v0, p0, Lo/elf;->d:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Align;->LEFT:Landroid/graphics/Paint$Align;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    .line 103
    const/4 v0, 0x1

    aget-object v0, v3, v0

    iget-object v0, v0, Lo/li;->c:Ljava/lang/String;

    invoke-virtual {p0, p1, v7, v4, v0}, Lo/elf;->b(Landroid/graphics/Canvas;FFLjava/lang/String;)V

    .line 105
    iget-object v0, p0, Lo/elf;->d:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Align;->RIGHT:Landroid/graphics/Paint$Align;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    .line 106
    const/4 v0, 0x0

    aget-object v0, v3, v0

    iget-object v0, v0, Lo/li;->c:Ljava/lang/String;

    invoke-virtual {p0, p1, v8, v4, v0}, Lo/elf;->b(Landroid/graphics/Canvas;FFLjava/lang/String;)V

    .line 110
    :cond_7
    :goto_1
    return-void
.end method
