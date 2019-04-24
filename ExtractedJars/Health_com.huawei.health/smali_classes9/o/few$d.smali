.class Lo/few$d;
.super Landroid/widget/ArrayAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/few;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "d"
.end annotation


# instance fields
.field private a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field final synthetic c:Lo/few;


# direct methods
.method constructor <init>(Lo/few;Landroid/content/Context;ILjava/util/List;)V
    .locals 0
    .param p2    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # I
        .annotation build Landroid/support/annotation/LayoutRes;
        .end annotation
    .end param
    .param p4    # Ljava/util/List;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;ILjava/util/List<Ljava/lang/String;>;)V"
        }
    .end annotation

    .line 667
    iput-object p1, p0, Lo/few$d;->c:Lo/few;

    .line 668
    invoke-direct {p0, p2, p3, p4}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;ILjava/util/List;)V

    .line 670
    iput-object p4, p0, Lo/few$d;->a:Ljava/util/List;

    .line 671
    return-void
.end method


# virtual methods
.method public getCount()I
    .locals 1

    .line 675
    invoke-super {p0}, Landroid/widget/ArrayAdapter;->getCount()I

    move-result v0

    return v0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 4
    .param p2    # Landroid/view/View;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p3    # Landroid/view/ViewGroup;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 681
    if-nez p2, :cond_0

    .line 682
    new-instance p2, Landroid/widget/TextView;

    iget-object v0, p0, Lo/few$d;->c:Lo/few;

    invoke-static {v0}, Lo/few;->k(Lo/few;)Landroid/content/Context;

    move-result-object v0

    invoke-direct {p2, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 683
    move-object v0, p2

    check-cast v0, Landroid/widget/TextView;

    iget-object v1, p0, Lo/few$d;->c:Lo/few;

    invoke-static {v1}, Lo/few;->p(Lo/few;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setHeight(I)V

    .line 684
    move-object v0, p2

    check-cast v0, Landroid/widget/TextView;

    iget-object v1, p0, Lo/few$d;->c:Lo/few;

    invoke-static {v1}, Lo/few;->o(Lo/few;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setWidth(I)V

    .line 687
    :cond_0
    move-object v0, p2

    check-cast v0, Landroid/widget/TextView;

    iget-object v1, p0, Lo/few$d;->a:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 688
    move-object v0, p2

    check-cast v0, Landroid/widget/TextView;

    const/4 v1, 0x1

    const/high16 v2, 0x41700000    # 15.0f

    invoke-virtual {v0, v1, v2}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 689
    move-object v0, p2

    check-cast v0, Landroid/widget/TextView;

    iget-object v1, p0, Lo/few$d;->c:Lo/few;

    invoke-static {v1}, Lo/few;->k(Lo/few;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$color;->hw_show_color_text_50_persent_black:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 690
    iget-object v0, p0, Lo/few$d;->c:Lo/few;

    const/16 v1, 0x10

    invoke-static {v0, v1}, Lo/few;->a(Lo/few;I)I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {p2, v0, v1, v2, v3}, Landroid/view/View;->setPadding(IIII)V

    .line 691
    move-object v0, p2

    check-cast v0, Landroid/widget/TextView;

    const/16 v1, 0x10

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setGravity(I)V

    .line 692
    rem-int/lit8 v0, p1, 0x2

    if-eqz v0, :cond_1

    .line 693
    const/high16 v0, 0x5000000

    invoke-virtual {p2, v0}, Landroid/view/View;->setBackgroundColor(I)V

    goto :goto_0

    .line 695
    :cond_1
    const/4 v0, 0x0

    invoke-virtual {p2, v0}, Landroid/view/View;->setBackgroundColor(I)V

    .line 697
    :goto_0
    return-object p2
.end method
