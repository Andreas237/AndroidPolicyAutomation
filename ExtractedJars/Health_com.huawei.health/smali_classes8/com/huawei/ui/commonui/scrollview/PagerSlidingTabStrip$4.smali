.class Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->b(ILjava/lang/String;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:I

.field final synthetic e:Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;


# direct methods
.method constructor <init>(Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;I)V
    .locals 0

    .line 578
    iput-object p1, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip$4;->e:Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;

    iput p2, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip$4;->d:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 581
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip$4;->e:Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;

    invoke-static {v0}, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;->a(Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip;)Landroid/support/v4/view/ViewPager;

    move-result-object v0

    iget v1, p0, Lcom/huawei/ui/commonui/scrollview/PagerSlidingTabStrip$4;->d:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/support/v4/view/ViewPager;->setCurrentItem(IZ)V

    .line 582
    return-void
.end method
