.class public Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesActivity_ViewBinding;
.super Ljava/lang/Object;
.source "MyFavoritesActivity_ViewBinding.java"

# interfaces
.implements Lbutterknife/Unbinder;


# instance fields
.field private target:Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesActivity;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesActivity;)V
    .locals 1
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 20
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesActivity_ViewBinding;-><init>(Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesActivity;Landroid/view/View;)V

    return-void
.end method

.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesActivity;Landroid/view/View;)V
    .locals 3
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesActivity_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesActivity;

    const-string v0, "field \'mflvFavorites\'"

    .line 27
    const-class v1, Lcom/ibotta/android/mvp/ui/view/favorites/MyFavoritesListView;

    const v2, 0x7f09035d

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/view/favorites/MyFavoritesListView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesActivity;->mflvFavorites:Lcom/ibotta/android/mvp/ui/view/favorites/MyFavoritesListView;

    const-string v0, "field \'efvEmpty\'"

    .line 28
    const-class v1, Lcom/ibotta/android/mvp/ui/view/favorites/EmptyFavoritesSSCardView;

    const v2, 0x7f0901ab

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/ibotta/android/mvp/ui/view/favorites/EmptyFavoritesSSCardView;

    iput-object p2, p1, Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesActivity;->efvEmpty:Lcom/ibotta/android/mvp/ui/view/favorites/EmptyFavoritesSSCardView;

    return-void
.end method


# virtual methods
.method public unbind()V
    .locals 2
    .annotation build Landroid/support/annotation/CallSuper;
    .end annotation

    .line 34
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesActivity_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesActivity;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 36
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesActivity_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesActivity;

    .line 38
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesActivity;->mflvFavorites:Lcom/ibotta/android/mvp/ui/view/favorites/MyFavoritesListView;

    .line 39
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesActivity;->efvEmpty:Lcom/ibotta/android/mvp/ui/view/favorites/EmptyFavoritesSSCardView;

    return-void

    .line 35
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Bindings already cleared."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
