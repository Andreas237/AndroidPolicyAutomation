.class Lcom/rt/mobile/english/ui/ArticleSectionFragment$2;
.super Ljava/lang/Object;
.source "ArticleSectionFragment.java"

# interfaces
.implements Landroid/support/v4/view/ViewPager$OnPageChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/rt/mobile/english/ui/ArticleSectionFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/rt/mobile/english/ui/ArticleSectionFragment;


# direct methods
.method constructor <init>(Lcom/rt/mobile/english/ui/ArticleSectionFragment;)V
    .locals 0

    .line 147
    iput-object p1, p0, Lcom/rt/mobile/english/ui/ArticleSectionFragment$2;->this$0:Lcom/rt/mobile/english/ui/ArticleSectionFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onPageScrollStateChanged(I)V
    .locals 0

    return-void
.end method

.method public onPageScrolled(IFI)V
    .locals 0

    return-void
.end method

.method public onPageSelected(I)V
    .locals 1

    .line 155
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ArticleSectionFragment$2;->this$0:Lcom/rt/mobile/english/ui/ArticleSectionFragment;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/rt/mobile/english/ui/ArticleSectionFragment;->access$002(Lcom/rt/mobile/english/ui/ArticleSectionFragment;Ljava/lang/Integer;)Ljava/lang/Integer;

    .line 156
    iget-object p1, p0, Lcom/rt/mobile/english/ui/ArticleSectionFragment$2;->this$0:Lcom/rt/mobile/english/ui/ArticleSectionFragment;

    invoke-static {p1}, Lcom/rt/mobile/english/ui/ArticleSectionFragment;->access$100(Lcom/rt/mobile/english/ui/ArticleSectionFragment;)V

    return-void
.end method
