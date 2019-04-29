.class public Lcom/rt/mobile/english/ui/PagerFragment$DetailFragmentStatePagerAdapter;
.super Landroid/support/v4/app/FragmentStatePagerAdapter;
.source "PagerFragment.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/rt/mobile/english/ui/PagerFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "DetailFragmentStatePagerAdapter"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/rt/mobile/english/ui/PagerFragment;


# direct methods
.method public constructor <init>(Lcom/rt/mobile/english/ui/PagerFragment;Landroid/support/v4/app/FragmentManager;)V
    .locals 0

    .line 222
    iput-object p1, p0, Lcom/rt/mobile/english/ui/PagerFragment$DetailFragmentStatePagerAdapter;->this$0:Lcom/rt/mobile/english/ui/PagerFragment;

    .line 223
    invoke-direct {p0, p2}, Landroid/support/v4/app/FragmentStatePagerAdapter;-><init>(Landroid/support/v4/app/FragmentManager;)V

    return-void
.end method


# virtual methods
.method public getCount()I
    .locals 1

    .line 228
    iget-object v0, p0, Lcom/rt/mobile/english/ui/PagerFragment$DetailFragmentStatePagerAdapter;->this$0:Lcom/rt/mobile/english/ui/PagerFragment;

    invoke-static {v0}, Lcom/rt/mobile/english/ui/PagerFragment;->access$000(Lcom/rt/mobile/english/ui/PagerFragment;)Lcom/rt/mobile/english/ui/PagerFragment$Adapter;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    .line 231
    :cond_0
    iget-object v0, p0, Lcom/rt/mobile/english/ui/PagerFragment$DetailFragmentStatePagerAdapter;->this$0:Lcom/rt/mobile/english/ui/PagerFragment;

    invoke-static {v0}, Lcom/rt/mobile/english/ui/PagerFragment;->access$000(Lcom/rt/mobile/english/ui/PagerFragment;)Lcom/rt/mobile/english/ui/PagerFragment$Adapter;

    move-result-object v0

    invoke-interface {v0}, Lcom/rt/mobile/english/ui/PagerFragment$Adapter;->getPageCount()I

    move-result v0

    return v0
.end method

.method public getItem(I)Landroid/support/v4/app/Fragment;
    .locals 2

    .line 236
    iget-object v0, p0, Lcom/rt/mobile/english/ui/PagerFragment$DetailFragmentStatePagerAdapter;->this$0:Lcom/rt/mobile/english/ui/PagerFragment;

    invoke-static {v0}, Lcom/rt/mobile/english/ui/PagerFragment;->access$000(Lcom/rt/mobile/english/ui/PagerFragment;)Lcom/rt/mobile/english/ui/PagerFragment$Adapter;

    move-result-object v0

    if-nez v0, :cond_0

    .line 237
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Adapter not set"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 239
    :cond_0
    invoke-static {}, Lcom/rt/mobile/english/Utils;->getInstance()Lcom/rt/mobile/english/Utils;

    move-result-object v0

    invoke-virtual {v0}, Lcom/rt/mobile/english/Utils;->isRtlDirectionSupports()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/rt/mobile/english/ui/PagerFragment$DetailFragmentStatePagerAdapter;->this$0:Lcom/rt/mobile/english/ui/PagerFragment;

    invoke-static {v0}, Lcom/rt/mobile/english/ui/PagerFragment;->access$000(Lcom/rt/mobile/english/ui/PagerFragment;)Lcom/rt/mobile/english/ui/PagerFragment$Adapter;

    move-result-object v0

    invoke-interface {v0}, Lcom/rt/mobile/english/ui/PagerFragment$Adapter;->getPageCount()I

    move-result v0

    if-eqz v0, :cond_1

    .line 240
    iget-object v0, p0, Lcom/rt/mobile/english/ui/PagerFragment$DetailFragmentStatePagerAdapter;->this$0:Lcom/rt/mobile/english/ui/PagerFragment;

    invoke-static {v0}, Lcom/rt/mobile/english/ui/PagerFragment;->access$000(Lcom/rt/mobile/english/ui/PagerFragment;)Lcom/rt/mobile/english/ui/PagerFragment$Adapter;

    move-result-object v0

    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/PagerFragment$DetailFragmentStatePagerAdapter;->getCount()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    sub-int/2addr v1, p1

    invoke-interface {v0, v1}, Lcom/rt/mobile/english/ui/PagerFragment$Adapter;->getFragment(I)Landroid/support/v4/app/Fragment;

    move-result-object p1

    return-object p1

    .line 242
    :cond_1
    iget-object v0, p0, Lcom/rt/mobile/english/ui/PagerFragment$DetailFragmentStatePagerAdapter;->this$0:Lcom/rt/mobile/english/ui/PagerFragment;

    invoke-static {v0}, Lcom/rt/mobile/english/ui/PagerFragment;->access$000(Lcom/rt/mobile/english/ui/PagerFragment;)Lcom/rt/mobile/english/ui/PagerFragment$Adapter;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/rt/mobile/english/ui/PagerFragment$Adapter;->getFragment(I)Landroid/support/v4/app/Fragment;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic getPageTitle(I)Ljava/lang/CharSequence;
    .locals 0

    .line 220
    invoke-virtual {p0, p1}, Lcom/rt/mobile/english/ui/PagerFragment$DetailFragmentStatePagerAdapter;->getPageTitle(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public getPageTitle(I)Ljava/lang/String;
    .locals 2

    .line 248
    iget-object v0, p0, Lcom/rt/mobile/english/ui/PagerFragment$DetailFragmentStatePagerAdapter;->this$0:Lcom/rt/mobile/english/ui/PagerFragment;

    invoke-static {v0}, Lcom/rt/mobile/english/ui/PagerFragment;->access$100(Lcom/rt/mobile/english/ui/PagerFragment;)Lcom/rt/mobile/english/ui/PagerFragment$TabsAdapter;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 249
    invoke-static {}, Lcom/rt/mobile/english/Utils;->getInstance()Lcom/rt/mobile/english/Utils;

    move-result-object v0

    invoke-virtual {v0}, Lcom/rt/mobile/english/Utils;->isRtlDirectionSupports()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 250
    iget-object v0, p0, Lcom/rt/mobile/english/ui/PagerFragment$DetailFragmentStatePagerAdapter;->this$0:Lcom/rt/mobile/english/ui/PagerFragment;

    invoke-static {v0}, Lcom/rt/mobile/english/ui/PagerFragment;->access$100(Lcom/rt/mobile/english/ui/PagerFragment;)Lcom/rt/mobile/english/ui/PagerFragment$TabsAdapter;

    move-result-object v0

    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/PagerFragment$DetailFragmentStatePagerAdapter;->getCount()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    sub-int/2addr v1, p1

    invoke-interface {v0, v1}, Lcom/rt/mobile/english/ui/PagerFragment$TabsAdapter;->getTabTitle(I)Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 252
    :cond_0
    iget-object v0, p0, Lcom/rt/mobile/english/ui/PagerFragment$DetailFragmentStatePagerAdapter;->this$0:Lcom/rt/mobile/english/ui/PagerFragment;

    invoke-static {v0}, Lcom/rt/mobile/english/ui/PagerFragment;->access$100(Lcom/rt/mobile/english/ui/PagerFragment;)Lcom/rt/mobile/english/ui/PagerFragment$TabsAdapter;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/rt/mobile/english/ui/PagerFragment$TabsAdapter;->getTabTitle(I)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method
