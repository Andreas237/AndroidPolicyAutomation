.class public Lo/byo;
.super Landroid/widget/LinearLayout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/byo$c;
    }
.end annotation


# instance fields
.field private a:Lo/byo$c;

.field private b:Lo/bzc;

.field private c:Lo/byo$c;

.field private d:Lo/bzc;

.field private e:Lo/bzc;

.field private f:I

.field private g:Ljava/util/Calendar;

.field private h:I

.field private i:Ljava/util/Calendar;

.field private k:Ljava/util/Calendar;

.field private m:Ljava/util/Calendar;

.field private p:Landroid/graphics/Paint;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 40
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lo/byo;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 41
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 44
    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 45
    invoke-direct {p0}, Lo/byo;->b()V

    .line 46
    invoke-direct {p0, p1}, Lo/byo;->b(Landroid/content/Context;)V

    .line 47
    invoke-direct {p0}, Lo/byo;->e()V

    .line 48
    return-void
.end method

.method static synthetic a(Lo/byo;)Ljava/util/Calendar;
    .locals 1

    .line 19
    iget-object v0, p0, Lo/byo;->k:Ljava/util/Calendar;

    return-object v0
.end method

.method private a(Ljava/util/Calendar;Lo/bzc;)V
    .locals 3

    .line 215
    iget-object v0, p0, Lo/byo;->k:Ljava/util/Calendar;

    invoke-direct {p0, p1}, Lo/byo;->d(Ljava/util/Calendar;)J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 217
    iget-object v0, p0, Lo/byo;->a:Lo/byo$c;

    iget-object v1, p0, Lo/byo;->k:Ljava/util/Calendar;

    invoke-direct {p0, v0, v1}, Lo/byo;->e(Lo/byo$c;Ljava/util/Calendar;)V

    .line 218
    iget-object v0, p0, Lo/byo;->e:Lo/bzc;

    if-eq v0, p2, :cond_0

    .line 219
    iget-object v0, p0, Lo/byo;->c:Lo/byo$c;

    iget-object v1, p0, Lo/byo;->a:Lo/byo$c;

    iget v1, v1, Lo/byo$c;->d:I

    iput v1, v0, Lo/byo$c;->d:I

    .line 220
    iget-object v0, p0, Lo/byo;->e:Lo/bzc;

    iget-object v1, p0, Lo/byo;->a:Lo/byo$c;

    iget v1, v1, Lo/byo$c;->d:I

    invoke-virtual {v0, v1}, Lo/bzc;->setSeletion(I)V

    .line 222
    :cond_0
    iget-object v0, p0, Lo/byo;->d:Lo/bzc;

    if-eq v0, p2, :cond_1

    .line 223
    iget-object v0, p0, Lo/byo;->c:Lo/byo$c;

    iget-object v1, p0, Lo/byo;->a:Lo/byo$c;

    iget v1, v1, Lo/byo$c;->e:I

    iput v1, v0, Lo/byo$c;->e:I

    .line 224
    iget-object v0, p0, Lo/byo;->d:Lo/bzc;

    iget-object v1, p0, Lo/byo;->a:Lo/byo$c;

    iget v1, v1, Lo/byo$c;->e:I

    invoke-virtual {v0, v1}, Lo/bzc;->setSeletion(I)V

    .line 226
    :cond_1
    iget-object v0, p0, Lo/byo;->b:Lo/bzc;

    if-eq v0, p2, :cond_2

    .line 227
    iget-object v0, p0, Lo/byo;->c:Lo/byo$c;

    iget-object v1, p0, Lo/byo;->a:Lo/byo$c;

    iget v1, v1, Lo/byo$c;->a:I

    iput v1, v0, Lo/byo$c;->a:I

    .line 228
    iget-object v0, p0, Lo/byo;->b:Lo/bzc;

    iget-object v1, p0, Lo/byo;->a:Lo/byo$c;

    iget v1, v1, Lo/byo$c;->a:I

    invoke-virtual {v0, v1}, Lo/bzc;->setSeletion(I)V

    .line 230
    :cond_2
    return-void
.end method

.method static synthetic b(Lo/byo;)Lo/bzc;
    .locals 1

    .line 19
    iget-object v0, p0, Lo/byo;->b:Lo/bzc;

    return-object v0
.end method

.method private b()V
    .locals 3

    .line 51
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    iput-object v0, p0, Lo/byo;->k:Ljava/util/Calendar;

    .line 52
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    iput-object v0, p0, Lo/byo;->i:Ljava/util/Calendar;

    .line 53
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    iput-object v0, p0, Lo/byo;->g:Ljava/util/Calendar;

    .line 54
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    iput-object v0, p0, Lo/byo;->m:Ljava/util/Calendar;

    .line 56
    iget-object v0, p0, Lo/byo;->g:Ljava/util/Calendar;

    const/4 v1, 0x5

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/util/Calendar;->set(II)V

    .line 57
    iget-object v0, p0, Lo/byo;->g:Ljava/util/Calendar;

    iget-object v1, p0, Lo/byo;->i:Ljava/util/Calendar;

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Ljava/util/Calendar;->get(I)I

    move-result v1

    add-int/lit8 v1, v1, 0x64

    const/4 v2, 0x1

    invoke-virtual {v0, v2, v1}, Ljava/util/Calendar;->set(II)V

    .line 58
    iget-object v0, p0, Lo/byo;->g:Ljava/util/Calendar;

    const/4 v1, 0x2

    const/16 v2, 0xb

    invoke-virtual {v0, v1, v2}, Ljava/util/Calendar;->set(II)V

    .line 59
    iget-object v0, p0, Lo/byo;->g:Ljava/util/Calendar;

    const/4 v1, 0x5

    const/16 v2, 0x1f

    invoke-virtual {v0, v1, v2}, Ljava/util/Calendar;->set(II)V

    .line 61
    new-instance v0, Lo/byo$c;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/byo$c;-><init>(Lo/byo$5;)V

    iput-object v0, p0, Lo/byo;->c:Lo/byo$c;

    .line 62
    new-instance v0, Lo/byo$c;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/byo$c;-><init>(Lo/byo$5;)V

    iput-object v0, p0, Lo/byo;->a:Lo/byo$c;

    .line 63
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lo/byo;->p:Landroid/graphics/Paint;

    .line 64
    iget-object v0, p0, Lo/byo;->p:Landroid/graphics/Paint;

    invoke-virtual {p0}, Lo/byo;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/health/suggestion/R$dimen;->sug_divider_height:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 65
    iget-object v0, p0, Lo/byo;->p:Landroid/graphics/Paint;

    invoke-virtual {p0}, Lo/byo;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/health/suggestion/R$color;->divider_color:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 66
    return-void
.end method

.method private b(Landroid/content/Context;)V
    .locals 1

    .line 69
    sget v0, Lcom/huawei/health/suggestion/R$layout;->sug_inflate_date_view:I

    invoke-static {p1, v0, p0}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 70
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_wheel_year:I

    invoke-virtual {p0, v0}, Lo/byo;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/bzc;

    iput-object v0, p0, Lo/byo;->e:Lo/bzc;

    .line 71
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_wheel_month:I

    invoke-virtual {p0, v0}, Lo/byo;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/bzc;

    iput-object v0, p0, Lo/byo;->d:Lo/bzc;

    .line 72
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_wheel_day:I

    invoke-virtual {p0, v0}, Lo/byo;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/bzc;

    iput-object v0, p0, Lo/byo;->b:Lo/bzc;

    .line 74
    iget-object v0, p0, Lo/byo;->i:Ljava/util/Calendar;

    invoke-virtual {p0, v0}, Lo/byo;->setStartDate(Ljava/util/Calendar;)V

    .line 75
    iget-object v0, p0, Lo/byo;->g:Ljava/util/Calendar;

    invoke-virtual {p0, v0}, Lo/byo;->setEndDate(Ljava/util/Calendar;)V

    .line 76
    iget-object v0, p0, Lo/byo;->i:Ljava/util/Calendar;

    invoke-virtual {p0, v0}, Lo/byo;->setDate(Ljava/util/Calendar;)V

    .line 77
    return-void
.end method

.method static synthetic c(I)Ljava/lang/String;
    .locals 1

    .line 19
    invoke-static {p0}, Lo/byo;->e(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static synthetic c(Lo/byo;)Lo/byo$c;
    .locals 1

    .line 19
    iget-object v0, p0, Lo/byo;->c:Lo/byo$c;

    return-object v0
.end method

.method private c()V
    .locals 6

    .line 118
    new-instance v2, Lo/byo$c;

    const/4 v0, 0x0

    invoke-direct {v2, v0}, Lo/byo$c;-><init>(Lo/byo$5;)V

    .line 119
    iget-object v0, p0, Lo/byo;->g:Ljava/util/Calendar;

    invoke-direct {p0, v2, v0}, Lo/byo;->e(Lo/byo$c;Ljava/util/Calendar;)V

    .line 121
    iget v0, v2, Lo/byo$c;->d:I

    add-int/lit8 v3, v0, 0x1

    .line 122
    iget-object v0, p0, Lo/byo;->e:Lo/bzc;

    new-instance v1, Lo/byo$4;

    invoke-direct {v1, p0, v3}, Lo/byo$4;-><init>(Lo/byo;I)V

    invoke-virtual {v0, v1}, Lo/bzc;->setWheelViewAdapter(Lo/bzc$b;)V

    .line 134
    iget v0, v2, Lo/byo$c;->e:I

    add-int/lit8 v4, v0, 0x1

    .line 135
    iget-object v0, p0, Lo/byo;->d:Lo/bzc;

    new-instance v1, Lo/byo$2;

    invoke-direct {v1, p0, v4}, Lo/byo$2;-><init>(Lo/byo;I)V

    invoke-virtual {v0, v1}, Lo/bzc;->setWheelViewAdapter(Lo/bzc$b;)V

    .line 147
    iget v0, v2, Lo/byo$c;->a:I

    add-int/lit8 v5, v0, 0x1

    .line 148
    iget-object v0, p0, Lo/byo;->b:Lo/bzc;

    new-instance v1, Lo/byo$10;

    invoke-direct {v1, p0, v5}, Lo/byo$10;-><init>(Lo/byo;I)V

    invoke-virtual {v0, v1}, Lo/bzc;->setWheelViewAdapter(Lo/bzc$b;)V

    .line 161
    return-void
.end method

.method private d(Ljava/util/Calendar;)J
    .locals 4

    .line 233
    invoke-virtual {p1}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v2

    .line 234
    iget-object v0, p0, Lo/byo;->g:Ljava/util/Calendar;

    invoke-virtual {v0}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v0

    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v2

    .line 235
    iget-object v0, p0, Lo/byo;->i:Ljava/util/Calendar;

    invoke-virtual {v0}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v0

    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v2

    .line 236
    return-wide v2
.end method

.method static synthetic d(Lo/byo;)Lo/bzc;
    .locals 1

    .line 19
    iget-object v0, p0, Lo/byo;->d:Lo/bzc;

    return-object v0
.end method

.method private static e(I)Ljava/lang/String;
    .locals 2

    .line 268
    int-to-double v0, p0

    invoke-static {v0, v1}, Lo/buk;->b(D)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static synthetic e(Lo/byo;)Lo/bzc;
    .locals 1

    .line 19
    iget-object v0, p0, Lo/byo;->e:Lo/bzc;

    return-object v0
.end method

.method private e()V
    .locals 2

    .line 80
    iget-object v0, p0, Lo/byo;->e:Lo/bzc;

    new-instance v1, Lo/byo$5;

    invoke-direct {v1, p0}, Lo/byo$5;-><init>(Lo/byo;)V

    invoke-virtual {v0, v1}, Lo/bzc;->setOnWheelViewListener(Lo/bzc$c;)V

    .line 92
    iget-object v0, p0, Lo/byo;->d:Lo/bzc;

    new-instance v1, Lo/byo$1;

    invoke-direct {v1, p0}, Lo/byo$1;-><init>(Lo/byo;)V

    invoke-virtual {v0, v1}, Lo/bzc;->setOnWheelViewListener(Lo/bzc$c;)V

    .line 104
    iget-object v0, p0, Lo/byo;->b:Lo/bzc;

    new-instance v1, Lo/byo$3;

    invoke-direct {v1, p0}, Lo/byo$3;-><init>(Lo/byo;)V

    invoke-virtual {v0, v1}, Lo/bzc;->setOnWheelViewListener(Lo/bzc$c;)V

    .line 115
    return-void
.end method

.method private e(Lo/byo$c;Ljava/util/Calendar;)V
    .locals 5

    .line 240
    iget-object v0, p0, Lo/byo;->i:Ljava/util/Calendar;

    invoke-virtual {p2, v0}, Ljava/util/Calendar;->before(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 241
    const/4 v0, 0x0

    iput v0, p1, Lo/byo$c;->d:I

    .line 242
    const/4 v0, 0x0

    iput v0, p1, Lo/byo$c;->e:I

    .line 243
    const/4 v0, 0x0

    iput v0, p1, Lo/byo$c;->a:I

    .line 244
    return-void

    .line 247
    :cond_0
    const/4 v0, 0x1

    invoke-virtual {p2, v0}, Ljava/util/Calendar;->get(I)I

    move-result v3

    .line 248
    const/4 v0, 0x2

    invoke-virtual {p2, v0}, Ljava/util/Calendar;->get(I)I

    move-result v4

    .line 250
    iget v0, p0, Lo/byo;->f:I

    sub-int v0, v3, v0

    iput v0, p1, Lo/byo$c;->d:I

    .line 251
    iget v0, p1, Lo/byo$c;->d:I

    mul-int/lit8 v0, v0, 0xc

    add-int/2addr v0, v4

    iget v1, p0, Lo/byo;->h:I

    sub-int/2addr v0, v1

    iput v0, p1, Lo/byo$c;->e:I

    .line 252
    invoke-virtual {p2}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/bxz;->d(J)I

    move-result v0

    iget-object v1, p0, Lo/byo;->i:Ljava/util/Calendar;

    invoke-virtual {v1}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v1

    invoke-static {v1, v2}, Lo/bxz;->d(J)I

    move-result v1

    sub-int/2addr v0, v1

    iput v0, p1, Lo/byo$c;->a:I

    .line 253
    return-void
.end method

.method static synthetic e(Lo/byo;Ljava/util/Calendar;Lo/bzc;)V
    .locals 0

    .line 19
    invoke-direct {p0, p1, p2}, Lo/byo;->a(Ljava/util/Calendar;Lo/bzc;)V

    return-void
.end method

.method static synthetic f(Lo/byo;)I
    .locals 1

    .line 19
    iget v0, p0, Lo/byo;->f:I

    return v0
.end method

.method static synthetic g(Lo/byo;)I
    .locals 1

    .line 19
    iget v0, p0, Lo/byo;->h:I

    return v0
.end method

.method static synthetic h(Lo/byo;)Ljava/util/Calendar;
    .locals 1

    .line 19
    iget-object v0, p0, Lo/byo;->m:Ljava/util/Calendar;

    return-object v0
.end method

.method static synthetic k(Lo/byo;)Ljava/util/Calendar;
    .locals 1

    .line 19
    iget-object v0, p0, Lo/byo;->i:Ljava/util/Calendar;

    return-object v0
.end method


# virtual methods
.method protected dispatchDraw(Landroid/graphics/Canvas;)V
    .locals 7

    .line 165
    invoke-super {p0, p1}, Landroid/widget/LinearLayout;->dispatchDraw(Landroid/graphics/Canvas;)V

    .line 167
    iget-object v0, p0, Lo/byo;->e:Lo/bzc;

    invoke-virtual {v0}, Lo/bzc;->getWvHeight()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    iget-object v1, p0, Lo/byo;->e:Lo/bzc;

    invoke-virtual {v1}, Lo/bzc;->getSelectItemHeight()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    add-int v6, v0, v1

    .line 168
    move-object v0, p1

    int-to-float v2, v6

    invoke-virtual {p0}, Lo/byo;->getWidth()I

    move-result v1

    int-to-float v3, v1

    int-to-float v4, v6

    iget-object v5, p0, Lo/byo;->p:Landroid/graphics/Paint;

    const/4 v1, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 170
    iget-object v0, p0, Lo/byo;->e:Lo/bzc;

    invoke-virtual {v0}, Lo/bzc;->getWvHeight()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    iget-object v1, p0, Lo/byo;->e:Lo/bzc;

    invoke-virtual {v1}, Lo/bzc;->getSelectItemHeight()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    sub-int v6, v0, v1

    .line 171
    move-object v0, p1

    int-to-float v2, v6

    invoke-virtual {p0}, Lo/byo;->getWidth()I

    move-result v1

    int-to-float v3, v1

    int-to-float v4, v6

    iget-object v5, p0, Lo/byo;->p:Landroid/graphics/Paint;

    const/4 v1, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 172
    return-void
.end method

.method public getDate()Ljava/util/Calendar;
    .locals 1

    .line 187
    iget-object v0, p0, Lo/byo;->k:Ljava/util/Calendar;

    invoke-virtual {v0}, Ljava/util/Calendar;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Calendar;

    return-object v0
.end method

.method public getDay()I
    .locals 2

    .line 183
    iget-object v0, p0, Lo/byo;->k:Ljava/util/Calendar;

    const/4 v1, 0x5

    invoke-virtual {v0, v1}, Ljava/util/Calendar;->get(I)I

    move-result v0

    return v0
.end method

.method public getMonth()I
    .locals 2

    .line 179
    iget-object v0, p0, Lo/byo;->k:Ljava/util/Calendar;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Ljava/util/Calendar;->get(I)I

    move-result v0

    return v0
.end method

.method public getYear()I
    .locals 2

    .line 175
    iget-object v0, p0, Lo/byo;->k:Ljava/util/Calendar;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/Calendar;->get(I)I

    move-result v0

    return v0
.end method

.method public setDate(Ljava/util/Calendar;)V
    .locals 1

    .line 211
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lo/byo;->a(Ljava/util/Calendar;Lo/bzc;)V

    .line 212
    return-void
.end method

.method public setEndDate(Ljava/util/Calendar;)V
    .locals 2

    .line 202
    iput-object p1, p0, Lo/byo;->g:Ljava/util/Calendar;

    .line 203
    invoke-direct {p0}, Lo/byo;->c()V

    .line 205
    iget-object v0, p0, Lo/byo;->k:Ljava/util/Calendar;

    iget-object v1, p0, Lo/byo;->g:Ljava/util/Calendar;

    invoke-virtual {v0, v1}, Ljava/util/Calendar;->after(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 206
    iget-object v0, p0, Lo/byo;->g:Ljava/util/Calendar;

    invoke-virtual {p0, v0}, Lo/byo;->setDate(Ljava/util/Calendar;)V

    .line 208
    :cond_0
    return-void
.end method

.method public setStartDate(Ljava/util/Calendar;)V
    .locals 2

    .line 191
    iput-object p1, p0, Lo/byo;->i:Ljava/util/Calendar;

    .line 192
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Ljava/util/Calendar;->get(I)I

    move-result v0

    iput v0, p0, Lo/byo;->f:I

    .line 193
    const/4 v0, 0x2

    invoke-virtual {p1, v0}, Ljava/util/Calendar;->get(I)I

    move-result v0

    iput v0, p0, Lo/byo;->h:I

    .line 194
    invoke-direct {p0}, Lo/byo;->c()V

    .line 196
    iget-object v0, p0, Lo/byo;->k:Ljava/util/Calendar;

    iget-object v1, p0, Lo/byo;->i:Ljava/util/Calendar;

    invoke-virtual {v0, v1}, Ljava/util/Calendar;->before(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 197
    iget-object v0, p0, Lo/byo;->i:Ljava/util/Calendar;

    invoke-virtual {p0, v0}, Lo/byo;->setDate(Ljava/util/Calendar;)V

    .line 199
    :cond_0
    return-void
.end method
