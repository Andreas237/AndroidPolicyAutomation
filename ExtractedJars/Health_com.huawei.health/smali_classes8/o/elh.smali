.class public Lo/elh;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/elh$b;,
        Lo/elh$e;,
        Lo/elh$a;,
        Lo/elh$h;,
        Lo/elh$d;,
        Lo/elh$i;,
        Lo/elh$f;,
        Lo/elh$c;
    }
.end annotation


# instance fields
.field protected a:Lo/eie;

.field protected b:Lo/elh$c;

.field protected d:Lo/oa;


# direct methods
.method public constructor <init>(Lo/eie;Lo/oa;)V
    .locals 1

    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    const/4 v0, 0x0

    iput-object v0, p0, Lo/elh;->b:Lo/elh$c;

    .line 41
    iput-object p1, p0, Lo/elh;->a:Lo/eie;

    .line 42
    iput-object p2, p0, Lo/elh;->d:Lo/oa;

    .line 43
    const-string v0, "render_foreground"

    invoke-direct {p0, v0}, Lo/elh;->a(Ljava/lang/String;)V

    .line 44
    return-void
.end method

.method private a(Ljava/lang/String;)V
    .locals 4

    .line 59
    iget-object v0, p0, Lo/elh;->b:Lo/elh$c;

    if-eqz v0, :cond_0

    .line 60
    iget-object v0, p0, Lo/elh;->b:Lo/elh$c;

    invoke-interface {v0}, Lo/elh$c;->e()V

    .line 63
    :cond_0
    const-string v0, "render_foreground"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 64
    new-instance v0, Lo/elh$a;

    invoke-direct {v0}, Lo/elh$a;-><init>()V

    iput-object v0, p0, Lo/elh;->b:Lo/elh$c;

    goto :goto_0

    .line 66
    :cond_1
    const-string v0, "render_background"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 67
    new-instance v0, Lo/elh$e;

    invoke-direct {v0}, Lo/elh$e;-><init>()V

    iput-object v0, p0, Lo/elh;->b:Lo/elh$c;

    goto :goto_0

    .line 69
    :cond_2
    const-string v0, "render_focus_area"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 70
    new-instance v0, Lo/elh$b;

    iget-object v1, p0, Lo/elh;->a:Lo/eie;

    iget-object v2, p0, Lo/elh;->d:Lo/oa;

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lo/elh$b;-><init>(Lo/eie;Lo/oa;Lo/elh$5;)V

    iput-object v0, p0, Lo/elh;->b:Lo/elh$c;

    .line 74
    :cond_3
    :goto_0
    return-void
.end method

.method private d(Lo/elb;)V
    .locals 10

    .line 124
    iget-object v0, p0, Lo/elh;->b:Lo/elh$c;

    new-instance v1, Lo/elh$i;

    .line 125
    invoke-virtual {p1}, Lo/elb;->V()Z

    move-result v2

    invoke-virtual {p1, v2}, Lo/elb;->h(Z)F

    move-result v2

    invoke-direct {v1, v2}, Lo/elh$i;-><init>(F)V

    .line 124
    invoke-interface {v0, v1}, Lo/elh$c;->a(Lo/elh$f;)V

    .line 128
    iget-object v0, p0, Lo/elh;->b:Lo/elh$c;

    move-object v3, v0

    check-cast v3, Lo/elh$h;

    .line 131
    iget-object v0, p0, Lo/elh;->a:Lo/eie;

    instance-of v0, v0, Lo/ehv;

    if-eqz v0, :cond_1

    iget v0, v3, Lo/elh$h;->h:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 134
    iget-object v0, p0, Lo/elh;->a:Lo/eie;

    invoke-virtual {v0}, Lo/eie;->getData()Lo/ma;

    move-result-object v0

    invoke-virtual {v0}, Lo/ma;->h()Ljava/util/List;

    move-result-object v5

    .line 135
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_1

    const/4 v0, 0x0

    invoke-interface {v5, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Lo/ehn;

    if-eqz v0, :cond_1

    .line 136
    iget-object v0, p0, Lo/elh;->a:Lo/eie;

    check-cast v0, Lo/ehv;

    invoke-virtual {v0}, Lo/ehv;->getBarData()Lo/ehq;

    move-result-object v6

    .line 137
    const/4 v7, 0x0

    .line 138
    if-eqz v6, :cond_0

    .line 139
    invoke-virtual {v6}, Lo/ehq;->a()F

    move-result v7

    .line 141
    :cond_0
    const/4 v0, 0x4

    new-array v8, v0, [F

    const/4 v0, 0x0

    const/4 v1, 0x0

    aput v0, v8, v1

    const/4 v0, 0x0

    const/4 v1, 0x1

    aput v0, v8, v1

    const/4 v0, 0x2

    aput v7, v8, v0

    const/4 v0, 0x0

    const/4 v1, 0x3

    aput v0, v8, v1

    .line 142
    iget-object v0, p0, Lo/elh;->a:Lo/eie;

    invoke-virtual {p1}, Lo/elb;->e()Lo/eit$b;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/eie;->b(Lo/eit$b;)Lo/eim;

    move-result-object v9

    .line 143
    invoke-virtual {v9, v8}, Lo/nv;->e([F)V

    .line 144
    const/4 v0, 0x2

    aget v0, v8, v0

    const/4 v1, 0x0

    aget v1, v8, v1

    sub-float/2addr v0, v1

    const/high16 v1, 0x40000000    # 2.0f

    div-float v4, v0, v1

    .line 145
    iget-object v0, p0, Lo/elh;->b:Lo/elh$c;

    new-instance v1, Lo/elh$d;

    invoke-direct {v1, v4}, Lo/elh$d;-><init>(F)V

    .line 146
    invoke-interface {v0, v1}, Lo/elh$c;->a(Lo/elh$f;)V

    .line 149
    :cond_1
    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .line 156
    iget-object v0, p0, Lo/elh;->b:Lo/elh$c;

    invoke-interface {v0}, Lo/elh$c;->c()V

    .line 157
    return-void
.end method

.method public a(Lo/elb;)V
    .locals 7

    .line 77
    iget-object v0, p0, Lo/elh;->b:Lo/elh$c;

    invoke-virtual {p1}, Lo/elb;->X()F

    move-result v1

    invoke-interface {v0, v1}, Lo/elh$c;->e(F)V

    .line 80
    invoke-direct {p0, p1}, Lo/elh;->d(Lo/elb;)V

    .line 82
    iget-object v0, p0, Lo/elh;->b:Lo/elh$c;

    instance-of v0, v0, Lo/elh$a;

    if-eqz v0, :cond_0

    .line 83
    iget-object v0, p0, Lo/elh;->b:Lo/elh$c;

    move-object v4, v0

    check-cast v4, Lo/elh$a;

    .line 84
    invoke-virtual {p1}, Lo/elb;->m()I

    move-result v0

    iput v0, v4, Lo/elh$a;->b:I

    .line 85
    invoke-virtual {p1}, Lo/elb;->ad()Landroid/graphics/drawable/GradientDrawable;

    move-result-object v5

    .line 86
    invoke-virtual {p1}, Lo/elb;->aj()Landroid/graphics/drawable/GradientDrawable;

    move-result-object v6

    .line 87
    iput-object v5, v4, Lo/elh$a;->d:Landroid/graphics/drawable/Drawable;

    .line 88
    iput-object v6, v4, Lo/elh$a;->a:Landroid/graphics/drawable/Drawable;

    .line 89
    invoke-virtual {p1}, Lo/elb;->V()Z

    move-result v0

    iput-boolean v0, v4, Lo/elh$a;->c:Z

    .line 91
    goto/16 :goto_0

    :cond_0
    iget-object v0, p0, Lo/elh;->b:Lo/elh$c;

    instance-of v0, v0, Lo/elh$e;

    if-eqz v0, :cond_1

    .line 92
    iget-object v0, p0, Lo/elh;->b:Lo/elh$c;

    move-object v4, v0

    check-cast v4, Lo/elh$e;

    .line 93
    const/16 v0, 0x33

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    iput v0, v4, Lo/elh$e;->c:I

    .line 94
    const/4 v0, 0x2

    new-array v5, v0, [I

    const/16 v0, 0x80

    const/16 v1, 0xcc

    const/16 v2, 0xcc

    const/16 v3, 0xcc

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    const/4 v1, 0x0

    aput v0, v5, v1

    .line 95
    const/4 v0, 0x0

    const/16 v1, 0xcc

    const/16 v2, 0xcc

    const/16 v3, 0xcc

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    const/4 v1, 0x1

    aput v0, v5, v1

    .line 96
    new-instance v6, Landroid/graphics/drawable/GradientDrawable;

    sget-object v0, Landroid/graphics/drawable/GradientDrawable$Orientation;->TOP_BOTTOM:Landroid/graphics/drawable/GradientDrawable$Orientation;

    invoke-direct {v6, v0, v5}, Landroid/graphics/drawable/GradientDrawable;-><init>(Landroid/graphics/drawable/GradientDrawable$Orientation;[I)V

    .line 97
    iput-object v6, v4, Lo/elh$e;->a:Landroid/graphics/drawable/Drawable;

    .line 99
    goto :goto_0

    :cond_1
    iget-object v0, p0, Lo/elh;->b:Lo/elh$c;

    instance-of v0, v0, Lo/elh$b;

    if-eqz v0, :cond_2

    .line 100
    iget-object v0, p0, Lo/elh;->b:Lo/elh$c;

    move-object v4, v0

    check-cast v4, Lo/elh$b;

    .line 103
    const/16 v0, 0x33

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    iput v0, v4, Lo/elh$b;->b:I

    .line 111
    invoke-virtual {p1}, Lo/elb;->m()I

    move-result v0

    iput v0, v4, Lo/elh$b;->a:I

    .line 113
    invoke-virtual {p1}, Lo/elb;->ad()Landroid/graphics/drawable/GradientDrawable;

    move-result-object v5

    .line 114
    invoke-virtual {p1}, Lo/elb;->aj()Landroid/graphics/drawable/GradientDrawable;

    move-result-object v6

    .line 115
    iput-object v5, v4, Lo/elh$b;->c:Landroid/graphics/drawable/Drawable;

    .line 116
    iput-object v6, v4, Lo/elh$b;->e:Landroid/graphics/drawable/Drawable;

    .line 120
    :cond_2
    :goto_0
    return-void
.end method

.method public b()Lo/elh$c;
    .locals 1

    .line 152
    iget-object v0, p0, Lo/elh;->b:Lo/elh$c;

    return-object v0
.end method

.method public c(Ljava/lang/String;)V
    .locals 0

    .line 55
    invoke-direct {p0, p1}, Lo/elh;->a(Ljava/lang/String;)V

    .line 56
    return-void
.end method

.method public d()Lo/oa;
    .locals 1

    .line 51
    iget-object v0, p0, Lo/elh;->d:Lo/oa;

    return-object v0
.end method

.method public e()Lo/eie;
    .locals 1

    .line 47
    iget-object v0, p0, Lo/elh;->a:Lo/eie;

    return-object v0
.end method
