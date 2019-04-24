.class public Lo/bye;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# instance fields
.field private c:Lo/byh;

.field private d:Lo/byg;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 17
    invoke-direct {p0, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 18
    invoke-direct {p0, p1}, Lo/bye;->b(Landroid/content/Context;)V

    .line 19
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 22
    invoke-direct {p0, p1, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 23
    invoke-direct {p0, p1}, Lo/bye;->b(Landroid/content/Context;)V

    .line 24
    return-void
.end method

.method private b(Landroid/content/Context;)V
    .locals 4

    .line 27
    new-instance v0, Lo/byh;

    invoke-direct {v0, p1}, Lo/byh;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/bye;->c:Lo/byh;

    .line 28
    new-instance v0, Lo/byg;

    invoke-direct {v0, p1}, Lo/byg;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/bye;->d:Lo/byg;

    .line 29
    iget-object v0, p0, Lo/bye;->c:Lo/byh;

    const/4 v1, -0x1

    const/4 v2, -0x1

    invoke-virtual {p0, v0, v1, v2}, Lo/bye;->addView(Landroid/view/View;II)V

    .line 30
    iget-object v0, p0, Lo/bye;->d:Lo/byg;

    const/4 v1, -0x2

    const/4 v2, -0x2

    invoke-virtual {p0, v0, v1, v2}, Lo/bye;->addView(Landroid/view/View;II)V

    .line 31
    iget-object v0, p0, Lo/bye;->d:Lo/byg;

    invoke-virtual {v0}, Lo/byg;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroid/widget/FrameLayout$LayoutParams;

    .line 32
    const/16 v0, 0x11

    iput v0, v3, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 33
    return-void
.end method


# virtual methods
.method public b()V
    .locals 2

    .line 44
    iget-object v0, p0, Lo/bye;->c:Lo/byh;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/byh;->d(Z)V

    .line 45
    return-void
.end method

.method public b(I)V
    .locals 1

    .line 36
    iget-object v0, p0, Lo/bye;->d:Lo/byg;

    invoke-virtual {v0, p1}, Lo/byg;->d(I)V

    .line 37
    return-void
.end method

.method public c()V
    .locals 1

    .line 48
    iget-object v0, p0, Lo/bye;->c:Lo/byh;

    invoke-virtual {v0}, Lo/byh;->a()V

    .line 49
    return-void
.end method

.method public d()V
    .locals 2

    .line 40
    iget-object v0, p0, Lo/bye;->c:Lo/byh;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/byh;->d(Z)V

    .line 41
    return-void
.end method
