.class public Lo/bez;
.super Landroid/widget/LinearLayout;
.source "SourceFile"


# instance fields
.field protected a:Lo/bew;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 31
    invoke-direct {p0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 32
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 26
    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 27
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 21
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 22
    return-void
.end method


# virtual methods
.method protected onMeasure(II)V
    .locals 2

    .line 37
    invoke-super {p0, p1, p2}, Landroid/widget/LinearLayout;->onMeasure(II)V

    .line 38
    iget-object v0, p0, Lo/bez;->a:Lo/bew;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 40
    iget-object v0, p0, Lo/bez;->a:Lo/bew;

    invoke-virtual {p0}, Lo/bez;->getMeasuredHeight()I

    move-result v1

    invoke-interface {v0, v1}, Lo/bew;->b(I)V

    .line 42
    :cond_0
    return-void
.end method

.method protected setHeightChangeListener(Lo/bew;)V
    .locals 0

    .line 46
    iput-object p1, p0, Lo/bez;->a:Lo/bew;

    .line 47
    return-void
.end method
