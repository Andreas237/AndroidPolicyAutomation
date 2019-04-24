.class public Lo/elz;
.super Lo/emd;
.source "SourceFile"


# instance fields
.field private d:Lo/ely;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 18
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lo/elz;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 19
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 27
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lo/elz;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 28
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    .line 23
    invoke-direct {p0, p1, p2, p3}, Lo/emd;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 15
    const/4 v0, 0x0

    iput-object v0, p0, Lo/elz;->d:Lo/ely;

    .line 24
    return-void
.end method


# virtual methods
.method protected onScrollChanged(IIII)V
    .locals 6

    .line 39
    invoke-super {p0, p1, p2, p3, p4}, Lo/emd;->onScrollChanged(IIII)V

    .line 40
    sub-int v0, p2, p4

    if-gez v0, :cond_0

    invoke-virtual {p0}, Lo/elz;->getScrollY()I

    move-result v0

    if-gtz v0, :cond_0

    .line 41
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/elz;->setScrollY(I)V

    .line 43
    :cond_0
    iget-object v0, p0, Lo/elz;->d:Lo/ely;

    if-eqz v0, :cond_1

    .line 44
    iget-object v0, p0, Lo/elz;->d:Lo/ely;

    move-object v1, p0

    move v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    invoke-interface/range {v0 .. v5}, Lo/ely;->e(Lo/elz;IIII)V

    .line 46
    :cond_1
    return-void
.end method

.method public setScrollViewListener(Lo/ely;)V
    .locals 0

    .line 31
    iput-object p1, p0, Lo/elz;->d:Lo/ely;

    .line 32
    return-void
.end method
