.class Lo/yp;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method constructor <init>()V
    .locals 0

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static a(Landroid/content/Context;)Landroid/util/DisplayMetrics;
    .locals 3

    .line 28
    new-instance v1, Landroid/util/DisplayMetrics;

    invoke-direct {v1}, Landroid/util/DisplayMetrics;-><init>()V

    .line 29
    const-string v0, "window"

    .line 30
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/view/WindowManager;

    .line 31
    invoke-interface {v2}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V

    .line 32
    return-object v1
.end method

.method public static b(Landroid/content/Context;)I
    .locals 2

    .line 16
    invoke-static {p0}, Lo/yp;->a(Landroid/content/Context;)Landroid/util/DisplayMetrics;

    move-result-object v1

    .line 17
    iget v0, v1, Landroid/util/DisplayMetrics;->widthPixels:I

    return v0
.end method

.method public static c(Landroid/content/Context;)I
    .locals 2

    .line 43
    invoke-static {p0}, Lo/yp;->a(Landroid/content/Context;)Landroid/util/DisplayMetrics;

    move-result-object v1

    .line 44
    iget v0, v1, Landroid/util/DisplayMetrics;->heightPixels:I

    return v0
.end method
