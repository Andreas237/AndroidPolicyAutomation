.class Lcom/shopkick/app/store/StoreDetailsScreen$ToolTipClickHandler;
.super Ljava/lang/Object;
.source "StoreDetailsScreen.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/store/StoreDetailsScreen;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "ToolTipClickHandler"
.end annotation


# instance fields
.field private element:Ljava/lang/Integer;

.field private storeScreenRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/store/StoreDetailsScreen;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/shopkick/app/store/StoreDetailsScreen;Ljava/lang/Integer;)V
    .locals 1

    .line 1550
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1551
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/shopkick/app/store/StoreDetailsScreen$ToolTipClickHandler;->storeScreenRef:Ljava/lang/ref/WeakReference;

    .line 1552
    iput-object p2, p0, Lcom/shopkick/app/store/StoreDetailsScreen$ToolTipClickHandler;->element:Ljava/lang/Integer;

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 1557
    iget-object p1, p0, Lcom/shopkick/app/store/StoreDetailsScreen$ToolTipClickHandler;->storeScreenRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/store/StoreDetailsScreen;

    if-eqz p1, :cond_0

    .line 1559
    iget-object v0, p0, Lcom/shopkick/app/store/StoreDetailsScreen$ToolTipClickHandler;->element:Ljava/lang/Integer;

    invoke-static {p1, v0}, Lcom/shopkick/app/store/StoreDetailsScreen;->access$1100(Lcom/shopkick/app/store/StoreDetailsScreen;Ljava/lang/Integer;)V

    :cond_0
    return-void
.end method
