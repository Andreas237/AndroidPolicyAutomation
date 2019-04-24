.class Lcom/shopkick/app/rewards/RedeemedRewardConfirmationScreen$UserActionButtonClick;
.super Ljava/lang/Object;
.source "RedeemedRewardConfirmationScreen.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/rewards/RedeemedRewardConfirmationScreen;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "UserActionButtonClick"
.end annotation


# instance fields
.field private confirmationScreenRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/rewards/RedeemedRewardConfirmationScreen;",
            ">;"
        }
    .end annotation
.end field

.field private url:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/rewards/RedeemedRewardConfirmationScreen;Ljava/lang/String;)V
    .locals 1

    .line 77
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 78
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardConfirmationScreen$UserActionButtonClick;->confirmationScreenRef:Ljava/lang/ref/WeakReference;

    .line 79
    iput-object p2, p0, Lcom/shopkick/app/rewards/RedeemedRewardConfirmationScreen$UserActionButtonClick;->url:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 84
    iget-object p1, p0, Lcom/shopkick/app/rewards/RedeemedRewardConfirmationScreen$UserActionButtonClick;->confirmationScreenRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/rewards/RedeemedRewardConfirmationScreen;

    if-eqz p1, :cond_0

    .line 86
    iget-object v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardConfirmationScreen$UserActionButtonClick;->url:Ljava/lang/String;

    invoke-static {p1, v0}, Lcom/shopkick/app/rewards/RedeemedRewardConfirmationScreen;->access$000(Lcom/shopkick/app/rewards/RedeemedRewardConfirmationScreen;Ljava/lang/String;)V

    :cond_0
    return-void
.end method
