.class Lcom/shopkick/app/tileViewHolderConfigurators/ReloadTileViewHolderConfigurator$ReloadClick;
.super Ljava/lang/Object;
.source "ReloadTileViewHolderConfigurator.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/tileViewHolderConfigurators/ReloadTileViewHolderConfigurator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "ReloadClick"
.end annotation


# instance fields
.field private callbackRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/tileViewHolderConfigurators/ReloadTileViewHolderConfigurator$IReloadButtonClickCallback;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/ref/WeakReference;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/tileViewHolderConfigurators/ReloadTileViewHolderConfigurator$IReloadButtonClickCallback;",
            ">;)V"
        }
    .end annotation

    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 43
    iput-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ReloadTileViewHolderConfigurator$ReloadClick;->callbackRef:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 0

    .line 48
    iget-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ReloadTileViewHolderConfigurator$ReloadClick;->callbackRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/tileViewHolderConfigurators/ReloadTileViewHolderConfigurator$IReloadButtonClickCallback;

    if-eqz p1, :cond_0

    .line 50
    invoke-interface {p1}, Lcom/shopkick/app/tileViewHolderConfigurators/ReloadTileViewHolderConfigurator$IReloadButtonClickCallback;->onReloadClicked()V

    :cond_0
    return-void
.end method
