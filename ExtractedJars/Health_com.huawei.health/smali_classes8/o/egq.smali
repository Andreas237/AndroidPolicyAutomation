.class public Lo/egq;
.super Landroid/app/Dialog;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/egq$e;
    }
.end annotation


# instance fields
.field private b:I


# direct methods
.method private constructor <init>(Landroid/content/Context;I)V
    .locals 1

    .line 30
    invoke-direct {p0, p1, p2}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    .line 28
    const/4 v0, 0x0

    iput v0, p0, Lo/egq;->b:I

    .line 31
    return-void
.end method

.method synthetic constructor <init>(Landroid/content/Context;ILo/egq$1;)V
    .locals 0

    .line 25
    invoke-direct {p0, p1, p2}, Lo/egq;-><init>(Landroid/content/Context;I)V

    return-void
.end method

.method private a(Landroid/content/Context;Landroid/view/MotionEvent;)Z
    .locals 5

    .line 51
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    float-to-int v1, v0

    .line 52
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    float-to-int v2, v0

    .line 53
    invoke-static {p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/ViewConfiguration;->getScaledWindowTouchSlop()I

    move-result v3

    .line 54
    invoke-virtual {p0}, Lo/egq;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v4

    .line 55
    neg-int v0, v3

    if-lt v1, v0, :cond_0

    neg-int v0, v3

    if-lt v2, v0, :cond_0

    invoke-virtual {v4}, Landroid/view/View;->getWidth()I

    move-result v0

    add-int/2addr v0, v3

    if-gt v1, v0, :cond_0

    .line 56
    invoke-virtual {v4}, Landroid/view/View;->getHeight()I

    move-result v0

    add-int/2addr v0, v3

    if-le v2, v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    .line 55
    :goto_0
    return v0
.end method


# virtual methods
.method public dispatchTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 4

    .line 35
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 36
    const-string v0, "Login_CustomAdViewDialog"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mClickTime "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget v2, p0, Lo/egq;->b:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 37
    invoke-virtual {p0}, Lo/egq;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p0, v0, p1}, Lo/egq;->a(Landroid/content/Context;Landroid/view/MotionEvent;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 38
    iget v0, p0, Lo/egq;->b:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/egq;->b:I

    .line 40
    :cond_0
    iget v0, p0, Lo/egq;->b:I

    const/4 v1, 0x2

    if-ne v1, v0, :cond_1

    .line 41
    const-string v0, "Login_CustomAdViewDialog"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "dialog dismiss"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 42
    invoke-virtual {p0}, Lo/egq;->dismiss()V

    .line 45
    :cond_1
    invoke-super {p0, p1}, Landroid/app/Dialog;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    return v0
.end method

.method public e(Landroid/content/Context;)Z
    .locals 5

    .line 64
    sget v0, Lcom/huawei/ui/commonui/R$id;->ad_image:I

    invoke-virtual {p0, v0}, Lo/egq;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/widget/ImageView;

    .line 65
    if-nez v4, :cond_0

    .line 66
    const-string v0, "Login_CustomAdViewDialog"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isWidthHeightZero(), adimage = null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 67
    const/4 v0, 0x1

    return v0

    .line 69
    :cond_0
    const-string v0, "Login_CustomAdViewDialog"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isWidthHeightZero(),width = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Landroid/widget/ImageView;->getWidth()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 70
    const-string v0, "Login_CustomAdViewDialog"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isWidthHeightZero(),Height = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Landroid/widget/ImageView;->getHeight()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 71
    invoke-virtual {v4}, Landroid/widget/ImageView;->getWidth()I

    move-result v0

    const/4 v1, 0x0

    if-ge v1, v0, :cond_1

    invoke-virtual {v4}, Landroid/widget/ImageView;->getHeight()I

    move-result v0

    const/4 v1, 0x0

    if-lt v1, v0, :cond_2

    .line 72
    :cond_1
    const/4 v0, 0x1

    return v0

    .line 74
    :cond_2
    const/4 v0, 0x0

    return v0
.end method
