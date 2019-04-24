.class Lo/bgj$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/support/v4/view/ViewPager$OnPageChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bgj;->b()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/bgj;


# direct methods
.method constructor <init>(Lo/bgj;)V
    .locals 0

    .line 279
    iput-object p1, p0, Lo/bgj$2;->c:Lo/bgj;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onPageScrollStateChanged(I)V
    .locals 0

    .line 314
    return-void
.end method

.method public onPageScrolled(IFI)V
    .locals 0

    .line 308
    return-void
.end method

.method public onPageSelected(I)V
    .locals 2

    .line 284
    iget-object v0, p0, Lo/bgj$2;->c:Lo/bgj;

    add-int/lit8 v1, p1, -0x1

    invoke-static {v0, v1}, Lo/bgj;->e(Lo/bgj;I)I

    .line 286
    iget-object v0, p0, Lo/bgj$2;->c:Lo/bgj;

    invoke-virtual {v0, p1}, Lo/bgj;->c(I)V

    .line 288
    iget-object v0, p0, Lo/bgj$2;->c:Lo/bgj;

    invoke-static {v0}, Lo/bgj;->b(Lo/bgj;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-eq p1, v0, :cond_0

    if-nez p1, :cond_2

    .line 290
    :cond_0
    if-nez p1, :cond_1

    .line 292
    iget-object v0, p0, Lo/bgj$2;->c:Lo/bgj;

    invoke-static {v0}, Lo/bgj;->c(Lo/bgj;)Landroid/support/v4/view/ViewPager;

    move-result-object v0

    add-int/lit8 v1, p1, 0x1

    invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->setCurrentItem(I)V

    .line 294
    iget-object v0, p0, Lo/bgj$2;->c:Lo/bgj;

    invoke-static {v0}, Lo/bgj;->b(Lo/bgj;)Ljava/util/ArrayList;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    sget v1, Lcom/huawei/android/sns/R$drawable;->sns_ic_slide_press:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    goto :goto_0

    .line 298
    :cond_1
    iget-object v0, p0, Lo/bgj$2;->c:Lo/bgj;

    invoke-static {v0}, Lo/bgj;->c(Lo/bgj;)Landroid/support/v4/view/ViewPager;

    move-result-object v0

    add-int/lit8 v1, p1, -0x1

    invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->setCurrentItem(I)V

    .line 299
    iget-object v0, p0, Lo/bgj$2;->c:Lo/bgj;

    invoke-static {v0}, Lo/bgj;->b(Lo/bgj;)Ljava/util/ArrayList;

    move-result-object v0

    add-int/lit8 v1, p1, -0x1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    sget v1, Lcom/huawei/android/sns/R$drawable;->sns_ic_slide_press:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 302
    :cond_2
    :goto_0
    return-void
.end method
