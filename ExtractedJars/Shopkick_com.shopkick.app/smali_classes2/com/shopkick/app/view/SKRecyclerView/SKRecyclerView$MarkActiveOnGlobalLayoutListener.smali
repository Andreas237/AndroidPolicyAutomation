.class Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView$MarkActiveOnGlobalLayoutListener;
.super Ljava/lang/Object;
.source "SKRecyclerView.java"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "MarkActiveOnGlobalLayoutListener"
.end annotation


# instance fields
.field private recyclerViewRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method protected constructor <init>(Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;)V
    .locals 1

    .line 306
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 307
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView$MarkActiveOnGlobalLayoutListener;->recyclerViewRef:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method public onGlobalLayout()V
    .locals 2

    .line 312
    iget-object v0, p0, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView$MarkActiveOnGlobalLayoutListener;->recyclerViewRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    if-eqz v0, :cond_0

    .line 313
    invoke-virtual {v0}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->getChildCount()I

    move-result v1

    if-lez v1, :cond_0

    .line 314
    invoke-static {v0}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->access$000(Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;)V

    :cond_0
    return-void
.end method
