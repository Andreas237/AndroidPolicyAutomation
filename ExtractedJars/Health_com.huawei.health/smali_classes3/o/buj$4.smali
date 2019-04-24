.class Lo/buj$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/support/v4/view/ViewPager$OnPageChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/buj;->d(Ljava/util/List;J)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/util/List;

.field final synthetic c:Lo/buj;


# direct methods
.method constructor <init>(Lo/buj;Ljava/util/List;)V
    .locals 0

    .line 160
    iput-object p1, p0, Lo/buj$4;->c:Lo/buj;

    iput-object p2, p0, Lo/buj$4;->a:Ljava/util/List;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onPageScrollStateChanged(I)V
    .locals 0

    .line 185
    return-void
.end method

.method public onPageScrolled(IFI)V
    .locals 0

    .line 164
    return-void
.end method

.method public onPageSelected(I)V
    .locals 3

    .line 168
    iget-object v0, p0, Lo/buj$4;->c:Lo/buj;

    invoke-static {v0}, Lo/buj;->e(Lo/buj;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 169
    iget-object v0, p0, Lo/buj$4;->c:Lo/buj;

    invoke-static {v0}, Lo/buj;->e(Lo/buj;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    rem-int/2addr p1, v0

    .line 170
    const/4 v2, 0x0

    :goto_0
    iget-object v0, p0, Lo/buj$4;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v2, v0, :cond_1

    .line 171
    if-ne v2, p1, :cond_0

    .line 172
    iget-object v0, p0, Lo/buj$4;->c:Lo/buj;

    invoke-static {v0}, Lo/buj;->b(Lo/buj;)Landroid/widget/LinearLayout;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$drawable;->btn_health_point_white_sel:I

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundResource(I)V

    goto :goto_1

    .line 174
    :cond_0
    iget-object v0, p0, Lo/buj$4;->c:Lo/buj;

    invoke-static {v0}, Lo/buj;->b(Lo/buj;)Landroid/widget/LinearLayout;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$mipmap;->btn_health_point_white_nor:I

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundResource(I)V

    .line 170
    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 180
    :cond_1
    return-void
.end method
