.class public Lcom/tencent/open/c/a;
.super Landroid/widget/RelativeLayout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/open/c/a$a;
    }
.end annotation


# static fields
.field private static final a:Ljava/lang/String;


# instance fields
.field private b:Landroid/graphics/Rect;

.field private c:Z

.field private d:Lcom/tencent/open/c/a$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 16
    const-class v0, Lcom/tencent/open/c/a;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/tencent/open/c/a;->a:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 36
    invoke-direct {p0, p1}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    .line 18
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/tencent/open/c/a;->b:Landroid/graphics/Rect;

    .line 20
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/tencent/open/c/a;->c:Z

    .line 33
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/tencent/open/c/a;->d:Lcom/tencent/open/c/a$a;

    .line 38
    iget-object v0, p0, Lcom/tencent/open/c/a;->b:Landroid/graphics/Rect;

    if-nez v0, :cond_0

    .line 39
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lcom/tencent/open/c/a;->b:Landroid/graphics/Rect;

    .line 41
    :cond_0
    return-void
.end method


# virtual methods
.method public a(Lcom/tencent/open/c/a$a;)V
    .locals 0

    .line 52
    iput-object p1, p0, Lcom/tencent/open/c/a;->d:Lcom/tencent/open/c/a$a;

    .line 53
    return-void
.end method

.method protected onMeasure(II)V
    .locals 8

    .line 59
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v3

    .line 61
    invoke-virtual {p0}, Lcom/tencent/open/c/a;->getContext()Landroid/content/Context;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/app/Activity;

    .line 63
    invoke-virtual {v4}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    iget-object v1, p0, Lcom/tencent/open/c/a;->b:Landroid/graphics/Rect;

    invoke-virtual {v0, v1}, Landroid/view/View;->getWindowVisibleDisplayFrame(Landroid/graphics/Rect;)V

    .line 65
    iget-object v0, p0, Lcom/tencent/open/c/a;->b:Landroid/graphics/Rect;

    iget v5, v0, Landroid/graphics/Rect;->top:I

    .line 67
    invoke-virtual {v4}, Landroid/app/Activity;->getWindowManager()Landroid/view/WindowManager;

    move-result-object v0

    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Display;->getHeight()I

    move-result v6

    .line 69
    sub-int v0, v6, v5

    sub-int v7, v0, v3

    .line 73
    iget-object v0, p0, Lcom/tencent/open/c/a;->d:Lcom/tencent/open/c/a$a;

    if-eqz v0, :cond_1

    if-eqz v3, :cond_1

    .line 75
    const/16 v0, 0x64

    if-le v7, v0, :cond_0

    .line 77
    iget-object v0, p0, Lcom/tencent/open/c/a;->d:Lcom/tencent/open/c/a$a;

    iget-object v1, p0, Lcom/tencent/open/c/a;->b:Landroid/graphics/Rect;

    invoke-virtual {v1}, Landroid/graphics/Rect;->height()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Math;->abs(I)I

    move-result v1

    invoke-virtual {p0}, Lcom/tencent/open/c/a;->getPaddingBottom()I

    move-result v2

    sub-int/2addr v1, v2

    invoke-virtual {p0}, Lcom/tencent/open/c/a;->getPaddingTop()I

    move-result v2

    sub-int/2addr v1, v2

    invoke-interface {v0, v1}, Lcom/tencent/open/c/a$a;->onKeyboardShown(I)V

    goto :goto_0

    .line 83
    :cond_0
    iget-object v0, p0, Lcom/tencent/open/c/a;->d:Lcom/tencent/open/c/a$a;

    invoke-interface {v0}, Lcom/tencent/open/c/a$a;->onKeyboardHidden()V

    .line 98
    :cond_1
    :goto_0
    invoke-super {p0, p1, p2}, Landroid/widget/RelativeLayout;->onMeasure(II)V

    .line 99
    return-void
.end method
