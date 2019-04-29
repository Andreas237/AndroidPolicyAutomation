.class Lcom/rt/mobile/english/ui/DrawerFragment$1;
.super Landroid/support/v7/app/ActionBarDrawerToggle;
.source "DrawerFragment.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/rt/mobile/english/ui/DrawerFragment;->setUpToggle(Landroid/support/v7/widget/Toolbar;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/rt/mobile/english/ui/DrawerFragment;


# direct methods
.method constructor <init>(Lcom/rt/mobile/english/ui/DrawerFragment;Landroid/app/Activity;Landroid/support/v4/widget/DrawerLayout;Landroid/support/v7/widget/Toolbar;II)V
    .locals 6

    .line 205
    iput-object p1, p0, Lcom/rt/mobile/english/ui/DrawerFragment$1;->this$0:Lcom/rt/mobile/english/ui/DrawerFragment;

    move-object v0, p0

    move-object v1, p2

    move-object v2, p3

    move-object v3, p4

    move v4, p5

    move v5, p6

    invoke-direct/range {v0 .. v5}, Landroid/support/v7/app/ActionBarDrawerToggle;-><init>(Landroid/app/Activity;Landroid/support/v4/widget/DrawerLayout;Landroid/support/v7/widget/Toolbar;II)V

    return-void
.end method


# virtual methods
.method public onDrawerClosed(Landroid/view/View;)V
    .locals 0

    .line 208
    invoke-super {p0, p1}, Landroid/support/v7/app/ActionBarDrawerToggle;->onDrawerClosed(Landroid/view/View;)V

    .line 209
    iget-object p1, p0, Lcom/rt/mobile/english/ui/DrawerFragment$1;->this$0:Lcom/rt/mobile/english/ui/DrawerFragment;

    invoke-virtual {p1}, Lcom/rt/mobile/english/ui/DrawerFragment;->isAdded()Z

    move-result p1

    if-nez p1, :cond_0

    return-void

    .line 213
    :cond_0
    iget-object p1, p0, Lcom/rt/mobile/english/ui/DrawerFragment$1;->this$0:Lcom/rt/mobile/english/ui/DrawerFragment;

    invoke-virtual {p1}, Lcom/rt/mobile/english/ui/DrawerFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object p1

    invoke-virtual {p1}, Landroid/support/v4/app/FragmentActivity;->invalidateOptionsMenu()V

    .line 214
    iget-object p1, p0, Lcom/rt/mobile/english/ui/DrawerFragment$1;->this$0:Lcom/rt/mobile/english/ui/DrawerFragment;

    invoke-static {p1}, Lcom/rt/mobile/english/ui/DrawerFragment;->access$000(Lcom/rt/mobile/english/ui/DrawerFragment;)Lcom/rt/mobile/english/ui/DrawerFragment$NavigationDrawerCallbacks;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 215
    iget-object p1, p0, Lcom/rt/mobile/english/ui/DrawerFragment$1;->this$0:Lcom/rt/mobile/english/ui/DrawerFragment;

    invoke-static {p1}, Lcom/rt/mobile/english/ui/DrawerFragment;->access$000(Lcom/rt/mobile/english/ui/DrawerFragment;)Lcom/rt/mobile/english/ui/DrawerFragment$NavigationDrawerCallbacks;

    move-result-object p1

    invoke-interface {p1}, Lcom/rt/mobile/english/ui/DrawerFragment$NavigationDrawerCallbacks;->onNavigationDrawerClosed()V

    :cond_1
    return-void
.end method

.method public onDrawerOpened(Landroid/view/View;)V
    .locals 0

    .line 221
    invoke-super {p0, p1}, Landroid/support/v7/app/ActionBarDrawerToggle;->onDrawerOpened(Landroid/view/View;)V

    .line 222
    iget-object p1, p0, Lcom/rt/mobile/english/ui/DrawerFragment$1;->this$0:Lcom/rt/mobile/english/ui/DrawerFragment;

    invoke-virtual {p1}, Lcom/rt/mobile/english/ui/DrawerFragment;->isAdded()Z

    move-result p1

    if-nez p1, :cond_0

    return-void

    .line 225
    :cond_0
    iget-object p1, p0, Lcom/rt/mobile/english/ui/DrawerFragment$1;->this$0:Lcom/rt/mobile/english/ui/DrawerFragment;

    invoke-virtual {p1}, Lcom/rt/mobile/english/ui/DrawerFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object p1

    invoke-virtual {p1}, Landroid/support/v4/app/FragmentActivity;->invalidateOptionsMenu()V

    return-void
.end method
