.class Lorg/apmem/tools/layouts/LayoutConfiguration;
.super Ljava/lang/Object;


# instance fields
.field private a:I

.field private b:Z

.field private c:F

.field private d:I

.field private e:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lorg/apmem/tools/layouts/LayoutConfiguration;->a:I

    iput-boolean v0, p0, Lorg/apmem/tools/layouts/LayoutConfiguration;->b:Z

    const/4 v1, 0x0

    iput v1, p0, Lorg/apmem/tools/layouts/LayoutConfiguration;->c:F

    const/16 v2, 0x33

    iput v2, p0, Lorg/apmem/tools/layouts/LayoutConfiguration;->d:I

    iput v0, p0, Lorg/apmem/tools/layouts/LayoutConfiguration;->e:I

    sget-object v2, Lorg/apmem/tools/layouts/b$a;->FlowLayout:[I

    invoke-virtual {p1, p2, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    :try_start_0
    sget p2, Lorg/apmem/tools/layouts/b$a;->FlowLayout_android_orientation:I

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result p2

    invoke-virtual {p0, p2}, Lorg/apmem/tools/layouts/LayoutConfiguration;->a(I)V

    sget p2, Lorg/apmem/tools/layouts/b$a;->FlowLayout_debugDraw:I

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    invoke-virtual {p0, p2}, Lorg/apmem/tools/layouts/LayoutConfiguration;->a(Z)V

    sget p2, Lorg/apmem/tools/layouts/b$a;->FlowLayout_weightDefault:I

    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result p2

    invoke-virtual {p0, p2}, Lorg/apmem/tools/layouts/LayoutConfiguration;->a(F)V

    sget p2, Lorg/apmem/tools/layouts/b$a;->FlowLayout_android_gravity:I

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result p2

    invoke-virtual {p0, p2}, Lorg/apmem/tools/layouts/LayoutConfiguration;->b(I)V

    sget p2, Lorg/apmem/tools/layouts/b$a;->FlowLayout_layoutDirection:I

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result p2

    invoke-virtual {p0, p2}, Lorg/apmem/tools/layouts/LayoutConfiguration;->c(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void

    :catchall_0
    move-exception p2

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    throw p2
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, Lorg/apmem/tools/layouts/LayoutConfiguration;->a:I

    return v0
.end method

.method public a(F)V
    .locals 1

    const/4 v0, 0x0

    invoke-static {v0, p1}, Ljava/lang/Math;->max(FF)F

    move-result p1

    iput p1, p0, Lorg/apmem/tools/layouts/LayoutConfiguration;->c:F

    return-void
.end method

.method public a(I)V
    .locals 1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    :goto_0
    iput p1, p0, Lorg/apmem/tools/layouts/LayoutConfiguration;->a:I

    return-void

    :cond_0
    const/4 p1, 0x0

    goto :goto_0

    return-void
.end method

.method public a(Z)V
    .locals 0

    iput-boolean p1, p0, Lorg/apmem/tools/layouts/LayoutConfiguration;->b:Z

    return-void
.end method

.method public b(I)V
    .locals 0

    iput p1, p0, Lorg/apmem/tools/layouts/LayoutConfiguration;->d:I

    return-void
.end method

.method public b()Z
    .locals 1

    iget-boolean v0, p0, Lorg/apmem/tools/layouts/LayoutConfiguration;->b:Z

    return v0
.end method

.method public c()F
    .locals 1

    iget v0, p0, Lorg/apmem/tools/layouts/LayoutConfiguration;->c:F

    return v0
.end method

.method public c(I)V
    .locals 1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    :goto_0
    iput p1, p0, Lorg/apmem/tools/layouts/LayoutConfiguration;->e:I

    return-void

    :cond_0
    const/4 p1, 0x0

    goto :goto_0

    return-void
.end method

.method public d()I
    .locals 1

    iget v0, p0, Lorg/apmem/tools/layouts/LayoutConfiguration;->d:I

    return v0
.end method

.method public e()I
    .locals 1

    iget v0, p0, Lorg/apmem/tools/layouts/LayoutConfiguration;->e:I

    return v0
.end method
