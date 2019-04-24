.class public Lo/flf;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/animation/Interpolator;


# instance fields
.field b:F

.field c:F

.field d:F

.field e:F


# direct methods
.method public constructor <init>(FFFF)V
    .locals 2

    .line 62
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 51
    const/4 v0, 0x0

    iput v0, p0, Lo/flf;->c:F

    const/4 v0, 0x0

    iput v0, p0, Lo/flf;->d:F

    .line 52
    const/4 v0, 0x0

    iput v0, p0, Lo/flf;->b:F

    const/4 v0, 0x0

    iput v0, p0, Lo/flf;->e:F

    .line 63
    iput p1, p0, Lo/flf;->c:F

    .line 64
    iput p2, p0, Lo/flf;->d:F

    .line 65
    iput p3, p0, Lo/flf;->b:F

    .line 66
    iput p4, p0, Lo/flf;->e:F

    .line 69
    const-string v0, "CubicBezierInterpolator"

    invoke-virtual {p0}, Lo/flf;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 71
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    .line 75
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v1

    invoke-direct {p0, v0, v1, p2}, Lo/flf;-><init>(Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;)V

    .line 76
    return-void
.end method

.method public constructor <init>(Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;)V
    .locals 4

    .line 85
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 51
    const/4 v0, 0x0

    iput v0, p0, Lo/flf;->c:F

    const/4 v0, 0x0

    iput v0, p0, Lo/flf;->d:F

    .line 52
    const/4 v0, 0x0

    iput v0, p0, Lo/flf;->b:F

    const/4 v0, 0x0

    iput v0, p0, Lo/flf;->e:F

    .line 87
    const/4 v3, 0x0

    .line 88
    if-eqz p2, :cond_0

    .line 89
    sget-object v0, Lhuawei/widget/hwcommon/R$styleable;->TranslateAnimation:[I

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {p2, p3, v0, v1, v2}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v3

    goto :goto_0

    .line 91
    :cond_0
    sget-object v0, Lhuawei/widget/hwcommon/R$styleable;->TranslateAnimation:[I

    invoke-virtual {p1, p3, v0}, Landroid/content/res/Resources;->obtainAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v3

    .line 94
    :goto_0
    sget v0, Lhuawei/widget/hwcommon/R$styleable;->TranslateAnimation_fromXDelta:I

    invoke-virtual {v3, v0}, Landroid/content/res/TypedArray;->peekValue(I)Landroid/util/TypedValue;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/flf;->e(Landroid/util/TypedValue;)F

    move-result v0

    iput v0, p0, Lo/flf;->c:F

    .line 96
    sget v0, Lhuawei/widget/hwcommon/R$styleable;->TranslateAnimation_fromYDelta:I

    invoke-virtual {v3, v0}, Landroid/content/res/TypedArray;->peekValue(I)Landroid/util/TypedValue;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/flf;->e(Landroid/util/TypedValue;)F

    move-result v0

    iput v0, p0, Lo/flf;->d:F

    .line 98
    sget v0, Lhuawei/widget/hwcommon/R$styleable;->TranslateAnimation_toXDelta:I

    invoke-virtual {v3, v0}, Landroid/content/res/TypedArray;->peekValue(I)Landroid/util/TypedValue;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/flf;->e(Landroid/util/TypedValue;)F

    move-result v0

    iput v0, p0, Lo/flf;->b:F

    .line 100
    sget v0, Lhuawei/widget/hwcommon/R$styleable;->TranslateAnimation_toYDelta:I

    invoke-virtual {v3, v0}, Landroid/content/res/TypedArray;->peekValue(I)Landroid/util/TypedValue;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/flf;->e(Landroid/util/TypedValue;)F

    move-result v0

    iput v0, p0, Lo/flf;->e:F

    .line 103
    const-string v0, "CubicBezierInterpolator"

    invoke-virtual {p0}, Lo/flf;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 106
    invoke-virtual {v3}, Landroid/content/res/TypedArray;->recycle()V

    .line 107
    return-void
.end method

.method private b(F)F
    .locals 3

    .line 147
    const/high16 v0, 0x3f800000    # 1.0f

    sub-float/2addr v0, p1

    const/high16 v1, 0x40400000    # 3.0f

    mul-float/2addr v0, v1

    const/high16 v1, 0x3f800000    # 1.0f

    sub-float/2addr v1, p1

    mul-float/2addr v0, v1

    mul-float/2addr v0, p1

    iget v1, p0, Lo/flf;->c:F

    mul-float/2addr v0, v1

    const/high16 v1, 0x3f800000    # 1.0f

    sub-float/2addr v1, p1

    const/high16 v2, 0x40400000    # 3.0f

    mul-float/2addr v1, v2

    mul-float/2addr v1, p1

    mul-float/2addr v1, p1

    iget v2, p0, Lo/flf;->b:F

    mul-float/2addr v1, v2

    add-float/2addr v0, v1

    mul-float v1, p1, p1

    mul-float/2addr v1, p1

    add-float/2addr v0, v1

    return v0
.end method

.method private e(Landroid/util/TypedValue;)F
    .locals 3

    .line 110
    const/high16 v2, 0x3f800000    # 1.0f

    .line 111
    if-nez p1, :cond_0

    .line 112
    const/high16 v2, 0x3f800000    # 1.0f

    goto :goto_0

    .line 114
    :cond_0
    iget v0, p1, Landroid/util/TypedValue;->type:I

    const/4 v1, 0x6

    if-ne v0, v1, :cond_1

    .line 115
    iget v0, p1, Landroid/util/TypedValue;->data:I

    invoke-static {v0}, Landroid/util/TypedValue;->complexToFloat(I)F

    move-result v2

    .line 116
    return v2

    .line 117
    :cond_1
    iget v0, p1, Landroid/util/TypedValue;->type:I

    const/4 v1, 0x4

    if-ne v0, v1, :cond_2

    .line 118
    invoke-virtual {p1}, Landroid/util/TypedValue;->getFloat()F

    move-result v2

    .line 119
    return v2

    .line 120
    :cond_2
    iget v0, p1, Landroid/util/TypedValue;->type:I

    const/16 v1, 0x10

    if-lt v0, v1, :cond_3

    iget v0, p1, Landroid/util/TypedValue;->type:I

    const/16 v1, 0x1f

    if-gt v0, v1, :cond_3

    .line 122
    iget v0, p1, Landroid/util/TypedValue;->data:I

    int-to-float v2, v0

    .line 123
    return v2

    .line 126
    :cond_3
    :goto_0
    return v2
.end method


# virtual methods
.method a(F)J
    .locals 10

    .line 168
    const-wide/16 v3, 0x0

    .line 169
    const-wide/16 v5, 0xfa0

    .line 174
    :goto_0
    cmp-long v0, v3, v5

    if-gtz v0, :cond_2

    .line 175
    add-long v0, v3, v5

    const/4 v2, 0x1

    ushr-long v7, v0, v2

    .line 176
    long-to-float v0, v7

    const v1, 0x3983126f    # 2.5E-4f

    mul-float/2addr v0, v1

    invoke-direct {p0, v0}, Lo/flf;->b(F)F

    move-result v9

    .line 178
    cmpg-float v0, v9, p1

    if-gez v0, :cond_0

    .line 179
    const-wide/16 v0, 0x1

    add-long v3, v7, v0

    goto :goto_0

    .line 180
    :cond_0
    cmpl-float v0, v9, p1

    if-lez v0, :cond_1

    .line 181
    const-wide/16 v0, 0x1

    sub-long v5, v7, v0

    goto :goto_0

    .line 183
    :cond_1
    return-wide v7

    .line 187
    :cond_2
    return-wide v3
.end method

.method protected c(F)F
    .locals 3

    .line 158
    const/high16 v0, 0x3f800000    # 1.0f

    sub-float/2addr v0, p1

    const/high16 v1, 0x40400000    # 3.0f

    mul-float/2addr v0, v1

    const/high16 v1, 0x3f800000    # 1.0f

    sub-float/2addr v1, p1

    mul-float/2addr v0, v1

    mul-float/2addr v0, p1

    iget v1, p0, Lo/flf;->d:F

    mul-float/2addr v0, v1

    const/high16 v1, 0x3f800000    # 1.0f

    sub-float/2addr v1, p1

    const/high16 v2, 0x40400000    # 3.0f

    mul-float/2addr v1, v2

    mul-float/2addr v1, p1

    mul-float/2addr v1, p1

    iget v2, p0, Lo/flf;->e:F

    mul-float/2addr v1, v2

    add-float/2addr v0, v1

    mul-float v1, p1, p1

    mul-float/2addr v1, p1

    add-float/2addr v0, v1

    return v0
.end method

.method public getInterpolation(F)F
    .locals 2

    .line 137
    invoke-virtual {p0, p1}, Lo/flf;->a(F)J

    move-result-wide v0

    long-to-float v0, v0

    const v1, 0x3983126f    # 2.5E-4f

    mul-float/2addr v0, v1

    invoke-virtual {p0, v0}, Lo/flf;->c(F)F

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 191
    new-instance v2, Ljava/lang/StringBuffer;

    const-string v0, "CubicBezierInterpolator"

    invoke-direct {v2, v0}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V

    .line 192
    const-string v0, "  mControlPoint1x = "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget v1, p0, Lo/flf;->c:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(F)Ljava/lang/StringBuffer;

    .line 193
    const-string v0, ", mControlPoint1y = "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget v1, p0, Lo/flf;->d:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(F)Ljava/lang/StringBuffer;

    .line 194
    const-string v0, ", mControlPoint2x = "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget v1, p0, Lo/flf;->b:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(F)Ljava/lang/StringBuffer;

    .line 195
    const-string v0, ", mControlPoint2y = "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget v1, p0, Lo/flf;->e:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(F)Ljava/lang/StringBuffer;

    .line 196
    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
