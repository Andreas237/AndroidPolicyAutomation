.class Lcom/stripe/android/view/AddSourceActivity$1;
.super Ljava/lang/Object;
.source "AddSourceActivity.java"

# interfaces
.implements Landroid/widget/TextView$OnEditorActionListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/view/AddSourceActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/stripe/android/view/AddSourceActivity;


# direct methods
.method constructor <init>(Lcom/stripe/android/view/AddSourceActivity;)V
    .locals 0

    .line 50
    iput-object p1, p0, Lcom/stripe/android/view/AddSourceActivity$1;->this$0:Lcom/stripe/android/view/AddSourceActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onEditorAction(Landroid/widget/TextView;ILandroid/view/KeyEvent;)Z
    .locals 0

    const/4 p1, 0x0

    const/4 p3, 0x6

    if-ne p2, p3, :cond_1

    .line 54
    iget-object p2, p0, Lcom/stripe/android/view/AddSourceActivity$1;->this$0:Lcom/stripe/android/view/AddSourceActivity;

    iget-object p2, p2, Lcom/stripe/android/view/AddSourceActivity;->mCardMultilineWidget:Lcom/stripe/android/view/CardMultilineWidget;

    invoke-virtual {p2}, Lcom/stripe/android/view/CardMultilineWidget;->getCard()Lcom/stripe/android/model/Card;

    move-result-object p2

    if-eqz p2, :cond_0

    .line 55
    iget-object p2, p0, Lcom/stripe/android/view/AddSourceActivity$1;->this$0:Lcom/stripe/android/view/AddSourceActivity;

    const-string p3, "input_method"

    invoke-virtual {p2, p3}, Lcom/stripe/android/view/AddSourceActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/view/inputmethod/InputMethodManager;

    iget-object p3, p0, Lcom/stripe/android/view/AddSourceActivity$1;->this$0:Lcom/stripe/android/view/AddSourceActivity;

    iget-object p3, p3, Lcom/stripe/android/view/AddSourceActivity;->mViewStub:Landroid/view/ViewStub;

    .line 56
    invoke-virtual {p3}, Landroid/view/ViewStub;->getWindowToken()Landroid/os/IBinder;

    move-result-object p3

    invoke-virtual {p2, p3, p1}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    .line 58
    :cond_0
    iget-object p1, p0, Lcom/stripe/android/view/AddSourceActivity$1;->this$0:Lcom/stripe/android/view/AddSourceActivity;

    invoke-virtual {p1}, Lcom/stripe/android/view/AddSourceActivity;->onActionSave()V

    const/4 p1, 0x1

    return p1

    :cond_1
    return p1
.end method
