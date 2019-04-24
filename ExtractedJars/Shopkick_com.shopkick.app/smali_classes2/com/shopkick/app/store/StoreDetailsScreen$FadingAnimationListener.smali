.class Lcom/shopkick/app/store/StoreDetailsScreen$FadingAnimationListener;
.super Ljava/lang/Object;
.source "StoreDetailsScreen.java"

# interfaces
.implements Landroid/view/animation/Animation$AnimationListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/store/StoreDetailsScreen;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "FadingAnimationListener"
.end annotation


# instance fields
.field private storeDetailsScreenRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/store/StoreDetailsScreen;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/shopkick/app/store/StoreDetailsScreen;)V
    .locals 1

    .line 1346
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1347
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/shopkick/app/store/StoreDetailsScreen$FadingAnimationListener;->storeDetailsScreenRef:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 0

    .line 1356
    iget-object p1, p0, Lcom/shopkick/app/store/StoreDetailsScreen$FadingAnimationListener;->storeDetailsScreenRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/store/StoreDetailsScreen;

    if-eqz p1, :cond_0

    .line 1358
    invoke-static {p1}, Lcom/shopkick/app/store/StoreDetailsScreen;->access$500(Lcom/shopkick/app/store/StoreDetailsScreen;)V

    :cond_0
    return-void
.end method

.method public onAnimationRepeat(Landroid/view/animation/Animation;)V
    .locals 0

    return-void
.end method

.method public onAnimationStart(Landroid/view/animation/Animation;)V
    .locals 0

    return-void
.end method
