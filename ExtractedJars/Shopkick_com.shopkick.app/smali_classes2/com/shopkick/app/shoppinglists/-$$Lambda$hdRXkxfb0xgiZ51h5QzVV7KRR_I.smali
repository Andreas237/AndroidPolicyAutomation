.class public final synthetic Lcom/shopkick/app/shoppinglists/-$$Lambda$hdRXkxfb0xgiZ51h5QzVV7KRR_I;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Landroid/support/v7/widget/RecyclerView$ItemAnimator$ItemAnimatorFinishedListener;


# instance fields
.field private final synthetic f$0:Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;


# direct methods
.method public synthetic constructor <init>(Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/shoppinglists/-$$Lambda$hdRXkxfb0xgiZ51h5QzVV7KRR_I;->f$0:Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;

    return-void
.end method


# virtual methods
.method public final onAnimationsFinished()V
    .locals 1

    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/-$$Lambda$hdRXkxfb0xgiZ51h5QzVV7KRR_I;->f$0:Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;

    invoke-virtual {v0}, Lcom/shopkick/app/shoppinglists/ShoppingListAnimationAdapter;->refresh()V

    return-void
.end method
