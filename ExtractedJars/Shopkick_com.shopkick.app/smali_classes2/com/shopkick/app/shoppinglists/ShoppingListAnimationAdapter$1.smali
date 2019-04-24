.class Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter$1;
.super Ljava/lang/Object;
.source "ShoppingListAnimationAdapter.java"

# interfaces
.implements Landroid/support/v7/widget/RecyclerView$OnItemTouchListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;-><init>(Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/screens/AppScreen;Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter$IDataFeedRecyclerViewAdapterCallback;Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;Ljava/util/Collection;Ljava/util/ArrayList;Lcom/shopkick/app/shoppinglists/ShoppingListEntryConverter;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;


# direct methods
.method constructor <init>(Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;)V
    .locals 0

    .line 59
    iput-object p1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter$1;->this$0:Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onInterceptTouchEvent(Landroid/support/v7/widget/RecyclerView;Landroid/view/MotionEvent;)Z
    .locals 0

    .line 63
    iget-object p1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter$1;->this$0:Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;

    invoke-static {p1}, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->access$000(Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;)Landroid/support/v7/widget/DefaultItemAnimator;

    move-result-object p1

    invoke-virtual {p1}, Landroid/support/v7/widget/DefaultItemAnimator;->isRunning()Z

    move-result p1

    return p1
.end method

.method public onRequestDisallowInterceptTouchEvent(Z)V
    .locals 0

    return-void
.end method

.method public onTouchEvent(Landroid/support/v7/widget/RecyclerView;Landroid/view/MotionEvent;)V
    .locals 0

    return-void
.end method
