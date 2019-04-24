.class Lcom/shopkick/app/widget/BuyAndCollectLoyaltyProgramDialogController$LoyaltyProgramListener;
.super Ljava/lang/Object;
.source "BuyAndCollectLoyaltyProgramDialogController.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/widget/BuyAndCollectLoyaltyProgramDialogController;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "LoyaltyProgramListener"
.end annotation


# instance fields
.field private buttonType:I

.field private callbackRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/widget/IBuyAndCollectLoyaltyProgramDialogCallback;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/shopkick/app/widget/IBuyAndCollectLoyaltyProgramDialogCallback;I)V
    .locals 1

    .line 152
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 153
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/shopkick/app/widget/BuyAndCollectLoyaltyProgramDialogController$LoyaltyProgramListener;->callbackRef:Ljava/lang/ref/WeakReference;

    .line 154
    iput p2, p0, Lcom/shopkick/app/widget/BuyAndCollectLoyaltyProgramDialogController$LoyaltyProgramListener;->buttonType:I

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 159
    iget-object p1, p0, Lcom/shopkick/app/widget/BuyAndCollectLoyaltyProgramDialogController$LoyaltyProgramListener;->callbackRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/widget/IBuyAndCollectLoyaltyProgramDialogCallback;

    if-eqz p1, :cond_0

    .line 161
    iget v0, p0, Lcom/shopkick/app/widget/BuyAndCollectLoyaltyProgramDialogController$LoyaltyProgramListener;->buttonType:I

    invoke-interface {p1, v0}, Lcom/shopkick/app/widget/IBuyAndCollectLoyaltyProgramDialogCallback;->buttonTapped(I)V

    :cond_0
    return-void
.end method
