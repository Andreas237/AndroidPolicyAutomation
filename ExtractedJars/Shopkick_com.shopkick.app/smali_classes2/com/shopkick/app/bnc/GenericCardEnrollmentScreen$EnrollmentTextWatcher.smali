.class Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$EnrollmentTextWatcher;
.super Ljava/lang/Object;
.source "GenericCardEnrollmentScreen.java"

# interfaces
.implements Landroid/text/TextWatcher;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "EnrollmentTextWatcher"
.end annotation


# instance fields
.field private curView:Landroid/widget/EditText;

.field prevLen:I

.field final synthetic this$0:Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;Landroid/widget/EditText;)V
    .locals 0

    .line 637
    iput-object p1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$EnrollmentTextWatcher;->this$0:Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    .line 635
    iput p1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$EnrollmentTextWatcher;->prevLen:I

    .line 638
    iput-object p2, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$EnrollmentTextWatcher;->curView:Landroid/widget/EditText;

    return-void
.end method

.method public static synthetic lambda$afterTextChanged$39(Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$EnrollmentTextWatcher;)V
    .locals 2

    .line 711
    iget-object v0, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$EnrollmentTextWatcher;->curView:Landroid/widget/EditText;

    iget-object v1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$EnrollmentTextWatcher;->this$0:Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;

    iget-object v1, v1, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->keyListener:Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$EnrollmentKeyListener;

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setOnKeyListener(Landroid/view/View$OnKeyListener;)V

    return-void
.end method

.method public static synthetic lambda$afterTextChanged$40(Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$EnrollmentTextWatcher;)V
    .locals 2

    .line 720
    iget-object v0, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$EnrollmentTextWatcher;->curView:Landroid/widget/EditText;

    iget-object v1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$EnrollmentTextWatcher;->this$0:Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;

    iget-object v1, v1, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->keyListener:Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$EnrollmentKeyListener;

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setOnKeyListener(Landroid/view/View$OnKeyListener;)V

    return-void
.end method

.method public static synthetic lambda$afterTextChanged$41(Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$EnrollmentTextWatcher;)V
    .locals 2

    .line 738
    iget-object v0, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$EnrollmentTextWatcher;->curView:Landroid/widget/EditText;

    iget-object v1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$EnrollmentTextWatcher;->this$0:Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;

    iget-object v1, v1, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->keyListener:Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$EnrollmentKeyListener;

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setOnKeyListener(Landroid/view/View$OnKeyListener;)V

    return-void
.end method


# virtual methods
.method public afterTextChanged(Landroid/text/Editable;)V
    .locals 10

    .line 646
    invoke-interface {p1}, Landroid/text/Editable;->length()I

    move-result v0

    .line 647
    iget-object v1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$EnrollmentTextWatcher;->this$0:Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;

    iget-boolean v1, v1, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->errorVisible:Z

    const/16 v2, 0x8

    const/4 v3, 0x0

    if-eqz v1, :cond_1

    .line 648
    iget-object v1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$EnrollmentTextWatcher;->this$0:Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;

    iget-object v1, v1, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->cardErrorText:Landroid/widget/TextView;

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 649
    iget-object v1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$EnrollmentTextWatcher;->this$0:Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;

    const v4, 0x7f0600ca

    invoke-static {v1, v4}, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->access$900(Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;I)I

    move-result v1

    .line 650
    iget-object v4, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$EnrollmentTextWatcher;->this$0:Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;

    iget-object v4, v4, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->cardNum:Landroid/widget/EditText;

    invoke-virtual {v4, v1}, Landroid/widget/EditText;->setTextColor(I)V

    .line 651
    iget-object v4, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$EnrollmentTextWatcher;->this$0:Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;

    iget-object v4, v4, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->expMonth:Landroid/widget/EditText;

    invoke-virtual {v4, v1}, Landroid/widget/EditText;->setTextColor(I)V

    .line 652
    iget-object v4, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$EnrollmentTextWatcher;->this$0:Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;

    iget-object v4, v4, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->expYear:Landroid/widget/EditText;

    invoke-virtual {v4, v1}, Landroid/widget/EditText;->setTextColor(I)V

    .line 653
    iget-object v4, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$EnrollmentTextWatcher;->this$0:Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;

    iget-object v4, v4, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->billingZip:Landroid/widget/EditText;

    invoke-virtual {v4, v1}, Landroid/widget/EditText;->setTextColor(I)V

    .line 654
    iget-object v1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$EnrollmentTextWatcher;->this$0:Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;

    iget-boolean v1, v1, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->needToShiftDateRight:Z

    if-eqz v1, :cond_0

    .line 655
    iget-object v1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$EnrollmentTextWatcher;->this$0:Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;

    iget-object v1, v1, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->linkDescView:Landroid/widget/ScrollView;

    invoke-virtual {v1, v3}, Landroid/widget/ScrollView;->setVisibility(I)V

    goto :goto_0

    .line 657
    :cond_0
    iget-object v1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$EnrollmentTextWatcher;->this$0:Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;

    iget-object v1, v1, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->cardDescWithLock:Landroid/widget/RelativeLayout;

    invoke-virtual {v1, v3}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 659
    :goto_0
    iget-object v1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$EnrollmentTextWatcher;->this$0:Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;

    iput-boolean v3, v1, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->errorVisible:Z

    :cond_1
    if-lez v0, :cond_2

    .line 662
    iget-object v1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$EnrollmentTextWatcher;->curView:Landroid/widget/EditText;

    const/4 v4, 0x0

    invoke-virtual {v1, v4}, Landroid/widget/EditText;->setOnKeyListener(Landroid/view/View$OnKeyListener;)V

    .line 664
    :cond_2
    iget-object v1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$EnrollmentTextWatcher;->this$0:Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;

    iget-object v1, v1, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->linkButton:Landroid/widget/Button;

    invoke-virtual {v1, v3}, Landroid/widget/Button;->setEnabled(Z)V

    .line 665
    iget-object v1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$EnrollmentTextWatcher;->this$0:Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;

    iget-object v1, v1, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->linkButton:Landroid/widget/Button;

    iget-object v4, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$EnrollmentTextWatcher;->this$0:Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;

    iget-object v4, v4, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->grayDrawable:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v1, v4}, Landroid/widget/Button;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 666
    iget-object v1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$EnrollmentTextWatcher;->this$0:Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;

    iget-object v1, v1, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->linkButton:Landroid/widget/Button;

    iget-object v4, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$EnrollmentTextWatcher;->this$0:Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;

    const v5, 0x7f06015d

    invoke-static {v4, v5}, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->access$1000(Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;I)I

    move-result v4

    invoke-virtual {v1, v4}, Landroid/widget/Button;->setTextColor(I)V

    .line 667
    iget-object v1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$EnrollmentTextWatcher;->curView:Landroid/widget/EditText;

    iget-object v4, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$EnrollmentTextWatcher;->this$0:Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;

    iget-object v4, v4, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->cardNum:Landroid/widget/EditText;

    const v5, 0x7f060121

    const/4 v6, 0x1

    if-ne v1, v4, :cond_8

    const/16 v1, 0xe

    const/16 v4, 0x9

    const/4 v7, 0x4

    if-eq v0, v7, :cond_3

    if-eq v0, v4, :cond_3

    if-ne v0, v1, :cond_4

    .line 668
    :cond_3
    iget v8, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$EnrollmentTextWatcher;->prevLen:I

    if-lt v0, v8, :cond_4

    .line 670
    iget-object v1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$EnrollmentTextWatcher;->curView:Landroid/widget/EditText;

    const-string v4, " "

    invoke-virtual {v1, v4}, Landroid/widget/EditText;->append(Ljava/lang/CharSequence;)V

    .line 671
    iput v0, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$EnrollmentTextWatcher;->prevLen:I

    add-int/lit8 v0, v0, 0x1

    goto/16 :goto_1

    :cond_4
    const/16 v8, 0x13

    if-lt v0, v8, :cond_6

    .line 675
    iget-object v1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$EnrollmentTextWatcher;->this$0:Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    const-string v7, " "

    const-string v8, ""

    invoke-virtual {v4, v7, v8}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v1, v4}, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->access$1100(Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_5

    .line 677
    iget-object v1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$EnrollmentTextWatcher;->this$0:Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;

    invoke-static {v1}, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->access$1200(Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;)V

    .line 678
    iget-object v1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$EnrollmentTextWatcher;->this$0:Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;

    invoke-static {v1}, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->access$1300(Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;)Z

    goto :goto_1

    .line 680
    :cond_5
    iget-object v1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$EnrollmentTextWatcher;->this$0:Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;

    iget-object v1, v1, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->cardDescWithLock:Landroid/widget/RelativeLayout;

    invoke-virtual {v1, v2}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 681
    iget-object v1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$EnrollmentTextWatcher;->this$0:Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;

    iget-object v1, v1, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->linkDescView:Landroid/widget/ScrollView;

    invoke-virtual {v1, v2}, Landroid/widget/ScrollView;->setVisibility(I)V

    .line 682
    iget-object v1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$EnrollmentTextWatcher;->this$0:Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;

    iget-object v1, v1, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->cardErrorText:Landroid/widget/TextView;

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setVisibility(I)V

    .line 683
    iget-object v1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$EnrollmentTextWatcher;->this$0:Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;

    invoke-static {v1, v5}, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->access$1400(Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;I)I

    move-result v1

    .line 684
    iget-object v4, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$EnrollmentTextWatcher;->this$0:Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;

    iget-object v4, v4, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->cardNum:Landroid/widget/EditText;

    invoke-virtual {v4, v1}, Landroid/widget/EditText;->setTextColor(I)V

    .line 685
    iget-object v4, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$EnrollmentTextWatcher;->this$0:Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;

    iget-object v4, v4, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->expMonth:Landroid/widget/EditText;

    invoke-virtual {v4, v1}, Landroid/widget/EditText;->setTextColor(I)V

    .line 686
    iget-object v4, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$EnrollmentTextWatcher;->this$0:Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;

    iget-object v4, v4, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->expYear:Landroid/widget/EditText;

    invoke-virtual {v4, v1}, Landroid/widget/EditText;->setTextColor(I)V

    .line 687
    iget-object v4, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$EnrollmentTextWatcher;->this$0:Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;

    iget-object v4, v4, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->billingZip:Landroid/widget/EditText;

    invoke-virtual {v4, v1}, Landroid/widget/EditText;->setTextColor(I)V

    .line 688
    iget-object v1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$EnrollmentTextWatcher;->this$0:Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;

    iput-boolean v6, v1, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->errorVisible:Z

    goto :goto_1

    :cond_6
    if-eq v0, v1, :cond_7

    if-eq v0, v4, :cond_7

    if-ne v0, v7, :cond_8

    .line 690
    :cond_7
    iget v1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$EnrollmentTextWatcher;->prevLen:I

    if-gt v0, v1, :cond_8

    add-int/lit8 v1, v0, -0x1

    .line 692
    invoke-interface {p1, v1, v0}, Landroid/text/Editable;->delete(II)Landroid/text/Editable;

    .line 693
    iget v4, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$EnrollmentTextWatcher;->prevLen:I

    sub-int/2addr v4, v6

    iput v4, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$EnrollmentTextWatcher;->prevLen:I

    .line 694
    iget-object v4, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$EnrollmentTextWatcher;->curView:Landroid/widget/EditText;

    invoke-virtual {v4, p1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 695
    iget-object v4, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$EnrollmentTextWatcher;->curView:Landroid/widget/EditText;

    invoke-virtual {v4, v1}, Landroid/widget/EditText;->setSelection(I)V

    .line 698
    :cond_8
    :goto_1
    iget-object v1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$EnrollmentTextWatcher;->curView:Landroid/widget/EditText;

    iget-object v4, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$EnrollmentTextWatcher;->this$0:Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;

    iget-object v4, v4, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->expMonth:Landroid/widget/EditText;

    const/4 v7, 0x2

    const-wide/16 v8, 0x64

    if-ne v1, v4, :cond_b

    if-ne v0, v6, :cond_9

    .line 699
    invoke-interface {p1, v3}, Landroid/text/Editable;->charAt(I)C

    move-result v1

    const/16 v4, 0x31

    if-eq v1, v4, :cond_9

    invoke-interface {p1, v3}, Landroid/text/Editable;->charAt(I)C

    move-result v1

    const/16 v4, 0x30

    if-eq v1, v4, :cond_9

    .line 700
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "0"

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 701
    iget-object v1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$EnrollmentTextWatcher;->curView:Landroid/widget/EditText;

    invoke-virtual {v1, p0}, Landroid/widget/EditText;->removeTextChangedListener(Landroid/text/TextWatcher;)V

    .line 702
    iget-object v1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$EnrollmentTextWatcher;->curView:Landroid/widget/EditText;

    invoke-virtual {v1, p1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 703
    iget-object p1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$EnrollmentTextWatcher;->this$0:Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;

    iget-object p1, p1, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->expYear:Landroid/widget/EditText;

    invoke-virtual {p1}, Landroid/widget/EditText;->requestFocus()Z

    .line 704
    iget-object p1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$EnrollmentTextWatcher;->this$0:Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;

    iget-object p1, p1, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->expYear:Landroid/widget/EditText;

    iget-object v1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$EnrollmentTextWatcher;->this$0:Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;

    iget-object v1, v1, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->keyListener:Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$EnrollmentKeyListener;

    invoke-virtual {p1, v1}, Landroid/widget/EditText;->setOnKeyListener(Landroid/view/View$OnKeyListener;)V

    .line 705
    iget-object p1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$EnrollmentTextWatcher;->curView:Landroid/widget/EditText;

    invoke-virtual {p1, p0}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 706
    iget-object p1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$EnrollmentTextWatcher;->this$0:Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;

    invoke-static {p1}, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->access$1300(Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;)Z

    goto :goto_2

    :cond_9
    if-ne v0, v7, :cond_a

    .line 708
    iget-object p1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$EnrollmentTextWatcher;->this$0:Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;

    iget-object p1, p1, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->expYear:Landroid/widget/EditText;

    invoke-virtual {p1}, Landroid/widget/EditText;->requestFocus()Z

    .line 709
    iget-object p1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$EnrollmentTextWatcher;->this$0:Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;

    invoke-static {p1}, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->access$1300(Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;)Z

    goto :goto_2

    :cond_a
    if-nez v0, :cond_b

    .line 710
    iget p1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$EnrollmentTextWatcher;->prevLen:I

    if-lez p1, :cond_b

    .line 711
    iget-object p1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$EnrollmentTextWatcher;->this$0:Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;

    iget-object p1, p1, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->handler:Landroid/os/Handler;

    new-instance v1, Lcom/shopkick/app/bnc/-$$Lambda$GenericCardEnrollmentScreen$EnrollmentTextWatcher$xHKVZ1ZorGjN12J3V_KJwelane4;

    invoke-direct {v1, p0}, Lcom/shopkick/app/bnc/-$$Lambda$GenericCardEnrollmentScreen$EnrollmentTextWatcher$xHKVZ1ZorGjN12J3V_KJwelane4;-><init>(Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$EnrollmentTextWatcher;)V

    invoke-virtual {p1, v1, v8, v9}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 714
    :cond_b
    :goto_2
    iget-object p1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$EnrollmentTextWatcher;->curView:Landroid/widget/EditText;

    iget-object v1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$EnrollmentTextWatcher;->this$0:Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;

    iget-object v1, v1, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->expYear:Landroid/widget/EditText;

    if-ne p1, v1, :cond_d

    if-ne v0, v7, :cond_c

    .line 716
    iget-object p1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$EnrollmentTextWatcher;->this$0:Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;

    iget-object p1, p1, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->billingZip:Landroid/widget/EditText;

    invoke-virtual {p1}, Landroid/widget/EditText;->requestFocus()Z

    .line 717
    iget-object p1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$EnrollmentTextWatcher;->this$0:Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;

    iget-object p1, p1, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->billingZip:Landroid/widget/EditText;

    iget-object v1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$EnrollmentTextWatcher;->this$0:Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;

    iget-object v1, v1, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->keyListener:Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$EnrollmentKeyListener;

    invoke-virtual {p1, v1}, Landroid/widget/EditText;->setOnKeyListener(Landroid/view/View$OnKeyListener;)V

    .line 718
    iget-object p1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$EnrollmentTextWatcher;->this$0:Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;

    invoke-static {p1}, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->access$1300(Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;)Z

    goto :goto_3

    :cond_c
    if-nez v0, :cond_d

    .line 719
    iget p1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$EnrollmentTextWatcher;->prevLen:I

    if-lez p1, :cond_d

    .line 720
    iget-object p1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$EnrollmentTextWatcher;->this$0:Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;

    iget-object p1, p1, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->handler:Landroid/os/Handler;

    new-instance v1, Lcom/shopkick/app/bnc/-$$Lambda$GenericCardEnrollmentScreen$EnrollmentTextWatcher$-6XT31XbHTI8DoKh4Rh-gxusiAc;

    invoke-direct {v1, p0}, Lcom/shopkick/app/bnc/-$$Lambda$GenericCardEnrollmentScreen$EnrollmentTextWatcher$-6XT31XbHTI8DoKh4Rh-gxusiAc;-><init>(Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$EnrollmentTextWatcher;)V

    invoke-virtual {p1, v1, v8, v9}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 723
    :cond_d
    :goto_3
    iget-object p1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$EnrollmentTextWatcher;->curView:Landroid/widget/EditText;

    iget-object v1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$EnrollmentTextWatcher;->this$0:Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;

    iget-object v1, v1, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->billingZip:Landroid/widget/EditText;

    if-ne p1, v1, :cond_f

    const/4 p1, 0x5

    if-ne v0, p1, :cond_e

    .line 725
    iget-object p1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$EnrollmentTextWatcher;->this$0:Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;

    invoke-static {p1}, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->access$1300(Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;)Z

    move-result p1

    if-nez p1, :cond_f

    .line 727
    iget-object p1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$EnrollmentTextWatcher;->this$0:Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;

    iget-object p1, p1, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->cardErrorText:Landroid/widget/TextView;

    invoke-virtual {p1, v3}, Landroid/widget/TextView;->setVisibility(I)V

    .line 728
    iget-object p1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$EnrollmentTextWatcher;->this$0:Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;

    iget-object p1, p1, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->cardDescWithLock:Landroid/widget/RelativeLayout;

    invoke-virtual {p1, v2}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 729
    iget-object p1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$EnrollmentTextWatcher;->this$0:Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;

    iget-object p1, p1, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->linkDescView:Landroid/widget/ScrollView;

    invoke-virtual {p1, v2}, Landroid/widget/ScrollView;->setVisibility(I)V

    .line 730
    iget-object p1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$EnrollmentTextWatcher;->this$0:Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;

    invoke-static {p1, v5}, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->access$1500(Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;I)I

    move-result p1

    .line 731
    iget-object v1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$EnrollmentTextWatcher;->this$0:Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;

    iget-object v1, v1, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->cardNum:Landroid/widget/EditText;

    invoke-virtual {v1, p1}, Landroid/widget/EditText;->setTextColor(I)V

    .line 732
    iget-object v1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$EnrollmentTextWatcher;->this$0:Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;

    iget-object v1, v1, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->expMonth:Landroid/widget/EditText;

    invoke-virtual {v1, p1}, Landroid/widget/EditText;->setTextColor(I)V

    .line 733
    iget-object v1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$EnrollmentTextWatcher;->this$0:Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;

    iget-object v1, v1, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->expYear:Landroid/widget/EditText;

    invoke-virtual {v1, p1}, Landroid/widget/EditText;->setTextColor(I)V

    .line 734
    iget-object v1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$EnrollmentTextWatcher;->this$0:Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;

    iget-object v1, v1, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->billingZip:Landroid/widget/EditText;

    invoke-virtual {v1, p1}, Landroid/widget/EditText;->setTextColor(I)V

    .line 735
    iget-object p1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$EnrollmentTextWatcher;->this$0:Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;

    iput-boolean v6, p1, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->errorVisible:Z

    goto :goto_4

    :cond_e
    if-nez v0, :cond_f

    .line 737
    iget p1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$EnrollmentTextWatcher;->prevLen:I

    if-lez p1, :cond_f

    .line 738
    iget-object p1, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$EnrollmentTextWatcher;->this$0:Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;

    iget-object p1, p1, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen;->handler:Landroid/os/Handler;

    new-instance v1, Lcom/shopkick/app/bnc/-$$Lambda$GenericCardEnrollmentScreen$EnrollmentTextWatcher$KFf1MPHw6tkGQQ520nC-BOLsnNM;

    invoke-direct {v1, p0}, Lcom/shopkick/app/bnc/-$$Lambda$GenericCardEnrollmentScreen$EnrollmentTextWatcher$KFf1MPHw6tkGQQ520nC-BOLsnNM;-><init>(Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$EnrollmentTextWatcher;)V

    invoke-virtual {p1, v1, v8, v9}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 741
    :cond_f
    :goto_4
    iput v0, p0, Lcom/shopkick/app/bnc/GenericCardEnrollmentScreen$EnrollmentTextWatcher;->prevLen:I

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
