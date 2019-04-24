.class Lcom/stripe/android/view/StripeEditText$3;
.super Ljava/lang/Object;
.source "StripeEditText.java"

# interfaces
.implements Landroid/view/View$OnKeyListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/view/StripeEditText;->listenForDeleteEmpty()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/stripe/android/view/StripeEditText;


# direct methods
.method constructor <init>(Lcom/stripe/android/view/StripeEditText;)V
    .locals 0

    .line 232
    iput-object p1, p0, Lcom/stripe/android/view/StripeEditText$3;->this$0:Lcom/stripe/android/view/StripeEditText;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onKey(Landroid/view/View;ILandroid/view/KeyEvent;)Z
    .locals 0

    const/16 p1, 0x43

    if-ne p2, p1, :cond_0

    .line 236
    invoke-virtual {p3}, Landroid/view/KeyEvent;->getAction()I

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/stripe/android/view/StripeEditText$3;->this$0:Lcom/stripe/android/view/StripeEditText;

    .line 237
    invoke-static {p1}, Lcom/stripe/android/view/StripeEditText;->access$100(Lcom/stripe/android/view/StripeEditText;)Lcom/stripe/android/view/StripeEditText$DeleteEmptyListener;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/stripe/android/view/StripeEditText$3;->this$0:Lcom/stripe/android/view/StripeEditText;

    .line 238
    invoke-virtual {p1}, Lcom/stripe/android/view/StripeEditText;->length()I

    move-result p1

    if-nez p1, :cond_0

    .line 239
    iget-object p1, p0, Lcom/stripe/android/view/StripeEditText$3;->this$0:Lcom/stripe/android/view/StripeEditText;

    invoke-static {p1}, Lcom/stripe/android/view/StripeEditText;->access$100(Lcom/stripe/android/view/StripeEditText;)Lcom/stripe/android/view/StripeEditText$DeleteEmptyListener;

    move-result-object p1

    invoke-interface {p1}, Lcom/stripe/android/view/StripeEditText$DeleteEmptyListener;->onDeleteEmpty()V

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
