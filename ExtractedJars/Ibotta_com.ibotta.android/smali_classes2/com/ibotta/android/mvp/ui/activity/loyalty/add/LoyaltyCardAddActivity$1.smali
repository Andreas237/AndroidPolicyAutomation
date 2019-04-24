.class Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddActivity$1;
.super Ljava/lang/Object;
.source "LoyaltyCardAddActivity.java"

# interfaces
.implements Landroid/text/TextWatcher;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddActivity;->initInputField(Ljava/lang/String;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddActivity;


# direct methods
.method constructor <init>(Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddActivity;)V
    .locals 0

    .line 287
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddActivity$1;->this$0:Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public afterTextChanged(Landroid/text/Editable;)V
    .locals 1

    .line 296
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddActivity$1;->this$0:Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddActivity;

    invoke-static {v0}, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddActivity;->access$000(Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddActivity;)Lcom/ibotta/android/mvp/base/MvpPresenter;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddPresenter;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddPresenter;->onCardNumberChanged(Ljava/lang/String;)V

    return-void
.end method

.method public beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    return-void
.end method

.method public onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    return-void
.end method
