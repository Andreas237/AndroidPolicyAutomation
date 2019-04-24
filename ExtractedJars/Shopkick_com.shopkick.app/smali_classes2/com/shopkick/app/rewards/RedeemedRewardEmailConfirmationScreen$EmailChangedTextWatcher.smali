.class Lcom/shopkick/app/rewards/RedeemedRewardEmailConfirmationScreen$EmailChangedTextWatcher;
.super Ljava/lang/Object;
.source "RedeemedRewardEmailConfirmationScreen.java"

# interfaces
.implements Landroid/text/TextWatcher;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/rewards/RedeemedRewardEmailConfirmationScreen;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "EmailChangedTextWatcher"
.end annotation


# instance fields
.field private confirmationScreenRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/rewards/RedeemedRewardEmailConfirmationScreen;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/shopkick/app/rewards/RedeemedRewardEmailConfirmationScreen;)V
    .locals 1

    .line 213
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 214
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardEmailConfirmationScreen$EmailChangedTextWatcher;->confirmationScreenRef:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method public afterTextChanged(Landroid/text/Editable;)V
    .locals 0

    return-void
.end method

.method public beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    return-void
.end method

.method public onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    .line 223
    iget-object p2, p0, Lcom/shopkick/app/rewards/RedeemedRewardEmailConfirmationScreen$EmailChangedTextWatcher;->confirmationScreenRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {p2}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/shopkick/app/rewards/RedeemedRewardEmailConfirmationScreen;

    if-nez p2, :cond_0

    return-void

    .line 227
    :cond_0
    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 228
    invoke-static {p2}, Lcom/shopkick/app/rewards/RedeemedRewardEmailConfirmationScreen;->access$200(Lcom/shopkick/app/rewards/RedeemedRewardEmailConfirmationScreen;)V

    goto :goto_0

    .line 230
    :cond_1
    invoke-static {p2}, Lcom/shopkick/app/rewards/RedeemedRewardEmailConfirmationScreen;->access$300(Lcom/shopkick/app/rewards/RedeemedRewardEmailConfirmationScreen;)V

    :goto_0
    return-void
.end method
