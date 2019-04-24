.class Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesAdapter$1;
.super Ljava/lang/Object;
.source "MyFavoritesAdapter.java"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesAdapter;->onBindViewHolder(Lcom/ibotta/android/mvp/ui/activity/favorites/holder/FavoriteViewHolder;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesAdapter;

.field final synthetic val$fvhHolder:Lcom/ibotta/android/mvp/ui/activity/favorites/holder/FavoriteViewHolder;


# direct methods
.method constructor <init>(Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesAdapter;Lcom/ibotta/android/mvp/ui/activity/favorites/holder/FavoriteViewHolder;)V
    .locals 0

    .line 58
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesAdapter$1;->this$0:Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesAdapter;

    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesAdapter$1;->val$fvhHolder:Lcom/ibotta/android/mvp/ui/activity/favorites/holder/FavoriteViewHolder;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 0

    .line 61
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result p1

    if-nez p1, :cond_0

    .line 62
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesAdapter$1;->this$0:Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesAdapter;

    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesAdapter;->access$000(Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesAdapter;)Lcom/ibotta/android/mvp/ui/view/list/move/OnDragListener;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 63
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesAdapter$1;->this$0:Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesAdapter;

    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesAdapter;->access$000(Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesAdapter;)Lcom/ibotta/android/mvp/ui/view/list/move/OnDragListener;

    move-result-object p1

    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/favorites/MyFavoritesAdapter$1;->val$fvhHolder:Lcom/ibotta/android/mvp/ui/activity/favorites/holder/FavoriteViewHolder;

    invoke-interface {p1, p2}, Lcom/ibotta/android/mvp/ui/view/list/move/OnDragListener;->onStartDrag(Landroid/support/v7/widget/RecyclerView$ViewHolder;)V

    :cond_0
    const/4 p1, 0x1

    return p1
.end method
