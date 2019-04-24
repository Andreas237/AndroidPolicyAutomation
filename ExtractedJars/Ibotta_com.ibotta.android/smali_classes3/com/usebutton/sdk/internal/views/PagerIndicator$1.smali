.class Lcom/usebutton/sdk/internal/views/PagerIndicator$1;
.super Ljava/lang/Object;
.source "PagerIndicator.java"

# interfaces
.implements Landroid/support/v4/view/ViewPager$OnPageChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/usebutton/sdk/internal/views/PagerIndicator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/usebutton/sdk/internal/views/PagerIndicator;


# direct methods
.method constructor <init>(Lcom/usebutton/sdk/internal/views/PagerIndicator;)V
    .locals 0

    .line 45
    iput-object p1, p0, Lcom/usebutton/sdk/internal/views/PagerIndicator$1;->this$0:Lcom/usebutton/sdk/internal/views/PagerIndicator;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onPageScrollStateChanged(I)V
    .locals 1

    if-eqz p1, :cond_0

    goto :goto_0

    .line 67
    :cond_0
    iget-object p1, p0, Lcom/usebutton/sdk/internal/views/PagerIndicator$1;->this$0:Lcom/usebutton/sdk/internal/views/PagerIndicator;

    invoke-static {p1}, Lcom/usebutton/sdk/internal/views/PagerIndicator;->access$000(Lcom/usebutton/sdk/internal/views/PagerIndicator;)Landroid/support/v4/view/ViewPager;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/view/ViewPager;->getCurrentItem()I

    move-result v0

    invoke-static {p1, v0}, Lcom/usebutton/sdk/internal/views/PagerIndicator;->access$100(Lcom/usebutton/sdk/internal/views/PagerIndicator;I)V

    :goto_0
    return-void
.end method

.method public onPageScrolled(IFI)V
    .locals 4

    const-string p3, "PagerIndicator"

    .line 48
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Scrolled "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " offset: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p3, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 50
    iget-object p3, p0, Lcom/usebutton/sdk/internal/views/PagerIndicator$1;->this$0:Lcom/usebutton/sdk/internal/views/PagerIndicator;

    invoke-static {p3}, Lcom/usebutton/sdk/internal/views/PagerIndicator;->access$000(Lcom/usebutton/sdk/internal/views/PagerIndicator;)Landroid/support/v4/view/ViewPager;

    move-result-object p3

    invoke-virtual {p3}, Landroid/support/v4/view/ViewPager;->getCurrentItem()I

    move-result p3

    const-wide/high16 v0, 0x3fe0000000000000L    # 0.5

    if-ge p1, p3, :cond_0

    float-to-double v2, p2

    cmpg-double p3, v2, v0

    if-gez p3, :cond_0

    .line 51
    iget-object p2, p0, Lcom/usebutton/sdk/internal/views/PagerIndicator$1;->this$0:Lcom/usebutton/sdk/internal/views/PagerIndicator;

    invoke-static {p2, p1}, Lcom/usebutton/sdk/internal/views/PagerIndicator;->access$100(Lcom/usebutton/sdk/internal/views/PagerIndicator;I)V

    goto :goto_0

    :cond_0
    float-to-double p2, p2

    cmpl-double v2, p2, v0

    if-lez v2, :cond_1

    .line 55
    iget-object p2, p0, Lcom/usebutton/sdk/internal/views/PagerIndicator$1;->this$0:Lcom/usebutton/sdk/internal/views/PagerIndicator;

    add-int/lit8 p1, p1, 0x1

    invoke-static {p2, p1}, Lcom/usebutton/sdk/internal/views/PagerIndicator;->access$100(Lcom/usebutton/sdk/internal/views/PagerIndicator;I)V

    :cond_1
    :goto_0
    return-void
.end method

.method public onPageSelected(I)V
    .locals 0

    return-void
.end method
