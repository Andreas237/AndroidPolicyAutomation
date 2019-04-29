.class Lcom/rt/mobile/english/ui/ArticleSectionFragment$1;
.super Ljava/lang/Object;
.source "ArticleSectionFragment.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


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

    .line 132
    iput-object p1, p0, Lcom/rt/mobile/english/ui/ArticleSectionFragment$1;->this$0:Lcom/rt/mobile/english/ui/ArticleSectionFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 0

    .line 135
    iget-object p1, p0, Lcom/rt/mobile/english/ui/ArticleSectionFragment$1;->this$0:Lcom/rt/mobile/english/ui/ArticleSectionFragment;

    invoke-virtual {p1}, Lcom/rt/mobile/english/ui/ArticleSectionFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object p1

    check-cast p1, Lcom/rt/mobile/english/ui/MainActivity;

    invoke-virtual {p1}, Lcom/rt/mobile/english/ui/MainActivity;->getDrawerFragment()Lcom/rt/mobile/english/ui/DrawerFragment;

    move-result-object p1

    .line 137
    invoke-virtual {p1}, Lcom/rt/mobile/english/ui/DrawerFragment;->setLive()V

    return-void
.end method
