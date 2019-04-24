.class Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$EnrollmentKeyListener;
.super Ljava/lang/Object;
.source "GenericCardEnrollmentScreen.java"

# interfaces
.implements Landroid/view/View$OnKeyListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "EnrollmentKeyListener"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;


# direct methods
.method private constructor <init>(Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;)V
    .locals 0

    .line 591
    iput-object p1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$EnrollmentKeyListener;->this$0:Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$1;)V
    .locals 0

    .line 591
    invoke-direct {p0, p1}, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$EnrollmentKeyListener;-><init>(Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;)V

    return-void
.end method


# virtual methods
.method public onKey(Landroid/view/View;ILandroid/view/KeyEvent;)Z
    .locals 1

    const/4 p3, 0x0

    const/16 v0, 0x43

    if-ne p2, v0, :cond_3

    .line 596
    move-object p2, p1

    check-cast p2, Landroid/widget/EditText;

    invoke-virtual {p2}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_0

    .line 597
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result p2

    if-nez p2, :cond_3

    .line 598
    :cond_0
    iget-object p2, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$EnrollmentKeyListener;->this$0:Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;

    iget-object p2, p2, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->billingZip:Landroid/widget/EditText;

    if-ne p1, p2, :cond_1

    .line 599
    iget-object p1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$EnrollmentKeyListener;->this$0:Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;

    iget-object p1, p1, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->expYear:Landroid/widget/EditText;

    invoke-virtual {p1}, Landroid/widget/EditText;->requestFocus()Z

    .line 600
    iget-object p1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$EnrollmentKeyListener;->this$0:Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;

    iget-object p1, p1, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->expYear:Landroid/widget/EditText;

    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p1

    .line 601
    invoke-interface {p1}, Landroid/text/Editable;->length()I

    move-result p2

    if-lez p2, :cond_3

    add-int/lit8 p2, p2, -0x1

    .line 603
    invoke-interface {p1, p3, p2}, Landroid/text/Editable;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object p1

    .line 604
    iget-object v0, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$EnrollmentKeyListener;->this$0:Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;

    iget-object v0, v0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->expYear:Landroid/widget/EditText;

    invoke-virtual {v0, p1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 605
    iget-object p1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$EnrollmentKeyListener;->this$0:Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;

    iget-object p1, p1, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->expYear:Landroid/widget/EditText;

    invoke-virtual {p1, p2}, Landroid/widget/EditText;->setSelection(I)V

    goto :goto_0

    .line 607
    :cond_1
    iget-object p2, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$EnrollmentKeyListener;->this$0:Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;

    iget-object p2, p2, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->expYear:Landroid/widget/EditText;

    if-ne p1, p2, :cond_2

    .line 608
    iget-object p1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$EnrollmentKeyListener;->this$0:Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;

    iget-object p1, p1, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->expMonth:Landroid/widget/EditText;

    invoke-virtual {p1}, Landroid/widget/EditText;->requestFocus()Z

    .line 609
    iget-object p1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$EnrollmentKeyListener;->this$0:Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;

    iget-object p1, p1, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->expMonth:Landroid/widget/EditText;

    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p1

    .line 610
    invoke-interface {p1}, Landroid/text/Editable;->length()I

    move-result p2

    if-lez p2, :cond_3

    add-int/lit8 p2, p2, -0x1

    .line 612
    invoke-interface {p1, p3, p2}, Landroid/text/Editable;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object p1

    .line 613
    iget-object v0, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$EnrollmentKeyListener;->this$0:Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;

    iget-object v0, v0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->expMonth:Landroid/widget/EditText;

    invoke-virtual {v0, p1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 614
    iget-object p1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$EnrollmentKeyListener;->this$0:Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;

    iget-object p1, p1, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->expMonth:Landroid/widget/EditText;

    invoke-virtual {p1, p2}, Landroid/widget/EditText;->setSelection(I)V

    goto :goto_0

    .line 616
    :cond_2
    iget-object p2, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$EnrollmentKeyListener;->this$0:Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;

    iget-object p2, p2, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->expMonth:Landroid/widget/EditText;

    if-ne p1, p2, :cond_3

    .line 617
    iget-object p1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$EnrollmentKeyListener;->this$0:Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;

    iget-object p1, p1, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->cardNum:Landroid/widget/EditText;

    invoke-virtual {p1}, Landroid/widget/EditText;->requestFocus()Z

    .line 618
    iget-object p1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$EnrollmentKeyListener;->this$0:Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;

    iget-object p1, p1, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->cardNum:Landroid/widget/EditText;

    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p1

    .line 619
    invoke-interface {p1}, Landroid/text/Editable;->length()I

    move-result p2

    if-lez p2, :cond_3

    add-int/lit8 p2, p2, -0x1

    .line 621
    invoke-interface {p1, p3, p2}, Landroid/text/Editable;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object p1

    .line 622
    iget-object v0, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$EnrollmentKeyListener;->this$0:Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;

    iget-object v0, v0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->cardNum:Landroid/widget/EditText;

    invoke-virtual {v0, p1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 623
    iget-object p1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$EnrollmentKeyListener;->this$0:Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;

    iget-object p1, p1, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->cardNum:Landroid/widget/EditText;

    invoke-virtual {p1, p2}, Landroid/widget/EditText;->setSelection(I)V

    :cond_3
    :goto_0
    return p3
.end method
