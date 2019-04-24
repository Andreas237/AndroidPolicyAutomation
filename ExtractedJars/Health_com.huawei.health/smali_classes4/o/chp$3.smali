.class Lo/chp$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/chp;->a(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lo/chp;


# direct methods
.method constructor <init>(Lo/chp;)V
    .locals 0

    .line 49
    iput-object p1, p0, Lo/chp$3;->d:Lo/chp;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onGlobalLayout()V
    .locals 10

    .line 52
    iget-object v0, p0, Lo/chp$3;->d:Lo/chp;

    invoke-static {v0}, Lo/chp;->e(Lo/chp;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/TextView;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 54
    iget-object v0, p0, Lo/chp$3;->d:Lo/chp;

    invoke-static {v0}, Lo/chp;->e(Lo/chp;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/TextView;->getHeight()I

    move-result v0

    iget-object v1, p0, Lo/chp$3;->d:Lo/chp;

    invoke-static {v1}, Lo/chp;->e(Lo/chp;)Landroid/widget/TextView;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/TextView;->getBaseline()I

    move-result v1

    sub-int/2addr v0, v1

    iget-object v1, p0, Lo/chp$3;->d:Lo/chp;

    invoke-static {v1}, Lo/chp;->d(Lo/chp;)Landroid/widget/TextView;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/TextView;->getHeight()I

    move-result v1

    iget-object v2, p0, Lo/chp$3;->d:Lo/chp;

    invoke-static {v2}, Lo/chp;->d(Lo/chp;)Landroid/widget/TextView;

    move-result-object v2

    invoke-virtual {v2}, Landroid/widget/TextView;->getBaseline()I

    move-result v2

    sub-int/2addr v1, v2

    sub-int v4, v0, v1

    .line 56
    iget-object v0, p0, Lo/chp$3;->d:Lo/chp;

    invoke-static {v0}, Lo/chp;->c(Lo/chp;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v0

    iget-object v1, p0, Lo/chp$3;->d:Lo/chp;

    invoke-static {v1}, Lo/chp;->a(Lo/chp;)Landroid/content/Context;

    move-result-object v1

    const v2, 0x415ccccd    # 13.8f

    invoke-static {v1, v2}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v1

    add-int v5, v0, v1

    .line 58
    iget-object v0, p0, Lo/chp$3;->d:Lo/chp;

    invoke-static {v0}, Lo/chp;->b(Lo/chp;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v0

    iget-object v1, p0, Lo/chp$3;->d:Lo/chp;

    invoke-static {v1}, Lo/chp;->a(Lo/chp;)Landroid/content/Context;

    move-result-object v1

    const/high16 v2, 0x41e00000    # 28.0f

    invoke-static {v1, v2}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v1

    add-int/2addr v0, v1

    add-int v6, v0, v4

    .line 60
    if-le v5, v6, :cond_0

    move v7, v5

    goto :goto_0

    :cond_0
    move v7, v6

    .line 62
    :goto_0
    iget-object v0, p0, Lo/chp$3;->d:Lo/chp;

    invoke-static {v0}, Lo/chp;->c(Lo/chp;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Landroid/widget/RelativeLayout$LayoutParams;

    .line 63
    iget-object v0, p0, Lo/chp$3;->d:Lo/chp;

    invoke-static {v0}, Lo/chp;->c(Lo/chp;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v0

    sub-int v0, v7, v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v8, v1, v0, v2, v3}, Landroid/widget/RelativeLayout$LayoutParams;->setMargins(IIII)V

    .line 64
    iget-object v0, p0, Lo/chp$3;->d:Lo/chp;

    invoke-static {v0}, Lo/chp;->c(Lo/chp;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v8}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 66
    iget-object v0, p0, Lo/chp$3;->d:Lo/chp;

    invoke-static {v0}, Lo/chp;->b(Lo/chp;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Landroid/widget/RelativeLayout$LayoutParams;

    .line 67
    iget-object v0, p0, Lo/chp$3;->d:Lo/chp;

    invoke-static {v0}, Lo/chp;->b(Lo/chp;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v0

    sub-int v0, v7, v0

    sub-int/2addr v0, v4

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v9, v1, v0, v2, v4}, Landroid/widget/RelativeLayout$LayoutParams;->setMargins(IIII)V

    .line 68
    iget-object v0, p0, Lo/chp$3;->d:Lo/chp;

    invoke-static {v0}, Lo/chp;->b(Lo/chp;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v9}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 69
    return-void
.end method
