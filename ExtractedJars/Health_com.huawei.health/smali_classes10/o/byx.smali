.class public Lo/byx;
.super Landroid/widget/LinearLayout;
.source "SourceFile"


# instance fields
.field private e:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 22
    invoke-direct {p0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 23
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 26
    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 27
    return-void
.end method


# virtual methods
.method protected onLayout(ZIIII)V
    .locals 7

    .line 31
    invoke-virtual {p0}, Lo/byx;->getChildCount()I

    move-result v4

    .line 32
    const-string v0, "RtlLinearLayout"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "childCount:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 33
    iget-boolean v0, p0, Lo/byx;->e:Z

    if-nez v0, :cond_2

    invoke-virtual {p0}, Lo/byx;->getLayoutDirection()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    .line 34
    new-instance v5, Ljava/util/ArrayList;

    const/4 v0, 0x3

    invoke-direct {v5, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 35
    const/4 v6, 0x0

    :goto_0
    if-ge v6, v4, :cond_0

    .line 36
    invoke-virtual {p0, v6}, Lo/byx;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 35
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 38
    :cond_0
    invoke-virtual {p0}, Lo/byx;->removeAllViews()V

    .line 39
    add-int/lit8 v6, v4, -0x1

    :goto_1
    if-ltz v6, :cond_1

    .line 40
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    invoke-virtual {p0, v0}, Lo/byx;->addView(Landroid/view/View;)V

    .line 39
    add-int/lit8 v6, v6, -0x1

    goto :goto_1

    .line 43
    :cond_1
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/byx;->e:Z

    .line 45
    :cond_2
    invoke-super/range {p0 .. p5}, Landroid/widget/LinearLayout;->onLayout(ZIIII)V

    .line 46
    return-void
.end method
