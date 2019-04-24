.class public Lo/elk;
.super Lhuawei/widget/HwNumberPicker;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 20
    invoke-direct {p0, p1}, Lhuawei/widget/HwNumberPicker;-><init>(Landroid/content/Context;)V

    .line 21
    invoke-virtual {p0}, Lo/elk;->initialize()V

    .line 22
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 25
    invoke-direct {p0, p1, p2}, Lhuawei/widget/HwNumberPicker;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 26
    invoke-virtual {p0}, Lo/elk;->initialize()V

    .line 27
    return-void
.end method


# virtual methods
.method public final initialize()V
    .locals 7

    .line 31
    invoke-super {p0}, Lhuawei/widget/HwNumberPicker;->initialize()V

    .line 34
    const-class v4, Lhuawei/widget/HwNumberPicker;

    .line 36
    const-string v0, "mSelectorTextColor"

    :try_start_0
    invoke-virtual {v4, v0}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v5

    .line 37
    const/4 v0, 0x1

    invoke-virtual {v5, v0}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    .line 38
    invoke-virtual {p0}, Lo/elk;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 39
    invoke-virtual {p0}, Lo/elk;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/commonui/R$color;->common_colorAccent:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v6

    .line 40
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v5, p0, v0}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 41
    const-string v0, "HealthNumberPicker"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initialize() change color to orange "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 42
    goto :goto_0

    .line 44
    :cond_0
    const-string v0, "HealthNumberPicker"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initialize() getResources()=null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2

    .line 52
    :goto_0
    goto :goto_1

    .line 46
    :catch_0
    move-exception v5

    .line 47
    const-string v0, "HealthNumberPicker"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initialize() NoSuchFieldException"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 52
    goto :goto_1

    .line 48
    :catch_1
    move-exception v5

    .line 49
    const-string v0, "HealthNumberPicker"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initialize() IllegalAccessException"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 52
    goto :goto_1

    .line 50
    :catch_2
    move-exception v5

    .line 51
    const-string v0, "HealthNumberPicker"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initialize() Exception"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 53
    :goto_1
    return-void
.end method

.method public onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 2

    .line 56
    invoke-super {p0, p1}, Lhuawei/widget/HwNumberPicker;->onInterceptTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v1

    .line 57
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/elk;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 58
    return v1
.end method
