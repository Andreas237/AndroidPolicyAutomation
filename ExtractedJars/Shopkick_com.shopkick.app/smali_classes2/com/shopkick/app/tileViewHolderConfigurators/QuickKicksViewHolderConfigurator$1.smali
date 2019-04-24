.class Lcom/shopkick/app/tileViewHolderConfigurators/QuickKicksViewHolderConfigurator$1;
.super Ljava/lang/Object;
.source "QuickKicksViewHolderConfigurator.java"

# interfaces
.implements Landroid/support/v7/widget/RecyclerView$OnItemTouchListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/tileViewHolderConfigurators/QuickKicksViewHolderConfigurator;->setupRecyclerView(Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/tileViewHolderConfigurators/QuickKicksViewHolderConfigurator;


# direct methods
.method constructor <init>(Lcom/shopkick/app/tileViewHolderConfigurators/QuickKicksViewHolderConfigurator;)V
    .locals 0

    .line 74
    iput-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/QuickKicksViewHolderConfigurator$1;->this$0:Lcom/shopkick/app/tileViewHolderConfigurators/QuickKicksViewHolderConfigurator;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onInterceptTouchEvent(Landroid/support/v7/widget/RecyclerView;Landroid/view/MotionEvent;)Z
    .locals 0

    .line 77
    invoke-virtual {p1}, Landroid/support/v7/widget/RecyclerView;->getItemAnimator()Landroid/support/v7/widget/RecyclerView$ItemAnimator;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 80
    invoke-virtual {p1}, Landroid/support/v7/widget/RecyclerView$ItemAnimator;->isRunning()Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

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
