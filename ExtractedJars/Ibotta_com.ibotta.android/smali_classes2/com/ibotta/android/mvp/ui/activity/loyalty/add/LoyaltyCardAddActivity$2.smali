.class Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddActivity$2;
.super Ljava/lang/Object;
.source "LoyaltyCardAddActivity.java"

# interfaces
.implements Landroid/widget/TextView$OnEditorActionListener;


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

    .line 300
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddActivity$2;->this$0:Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onEditorAction(Landroid/widget/TextView;ILandroid/view/KeyEvent;)Z
    .locals 0

    .line 303
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddActivity$2;->this$0:Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddActivity;

    iget-object p1, p1, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddActivity;->bAddCard:Landroid/widget/Button;

    invoke-virtual {p1}, Landroid/widget/Button;->isEnabled()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x6

    if-ne p2, p1, :cond_0

    .line 304
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddActivity$2;->this$0:Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddActivity;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddActivity;->onAddCardClicked()V

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
