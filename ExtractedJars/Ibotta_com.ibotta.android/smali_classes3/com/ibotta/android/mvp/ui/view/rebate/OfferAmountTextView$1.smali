.class Lcom/ibotta/android/mvp/ui/view/rebate/OfferAmountTextView$1;
.super Ljava/lang/Object;
.source "OfferAmountTextView.java"

# interfaces
.implements Landroid/view/View$OnLayoutChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/mvp/ui/view/rebate/OfferAmountTextView;->createFormattingLayoutListener(Ljava/lang/String;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/mvp/ui/view/rebate/OfferAmountTextView;

.field final synthetic val$newValueString:Ljava/lang/String;

.field final synthetic val$oldValueString:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/ibotta/android/mvp/ui/view/rebate/OfferAmountTextView;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 60
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/rebate/OfferAmountTextView$1;->this$0:Lcom/ibotta/android/mvp/ui/view/rebate/OfferAmountTextView;

    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/view/rebate/OfferAmountTextView$1;->val$oldValueString:Ljava/lang/String;

    iput-object p3, p0, Lcom/ibotta/android/mvp/ui/view/rebate/OfferAmountTextView$1;->val$newValueString:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onLayoutChange(Landroid/view/View;IIIIIIII)V
    .locals 0

    .line 63
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/rebate/OfferAmountTextView$1;->this$0:Lcom/ibotta/android/mvp/ui/view/rebate/OfferAmountTextView;

    invoke-virtual {p1, p0}, Lcom/ibotta/android/mvp/ui/view/rebate/OfferAmountTextView;->removeOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 65
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/rebate/OfferAmountTextView$1;->this$0:Lcom/ibotta/android/mvp/ui/view/rebate/OfferAmountTextView;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/view/rebate/OfferAmountTextView;->getLineCount()I

    move-result p1

    const/4 p2, 0x1

    const/4 p3, 0x0

    if-le p1, p2, :cond_0

    const-string p1, "%s\n%s"

    const/4 p4, 0x2

    .line 66
    new-array p4, p4, [Ljava/lang/Object;

    iget-object p5, p0, Lcom/ibotta/android/mvp/ui/view/rebate/OfferAmountTextView$1;->val$oldValueString:Ljava/lang/String;

    aput-object p5, p4, p3

    iget-object p5, p0, Lcom/ibotta/android/mvp/ui/view/rebate/OfferAmountTextView$1;->val$newValueString:Ljava/lang/String;

    aput-object p5, p4, p2

    invoke-static {p1, p4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    .line 67
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/view/rebate/OfferAmountTextView$1;->this$0:Lcom/ibotta/android/mvp/ui/view/rebate/OfferAmountTextView;

    sget-object p4, Landroid/widget/TextView$BufferType;->SPANNABLE:Landroid/widget/TextView$BufferType;

    invoke-virtual {p2, p1, p4}, Lcom/ibotta/android/mvp/ui/view/rebate/OfferAmountTextView;->setText(Ljava/lang/CharSequence;Landroid/widget/TextView$BufferType;)V

    .line 70
    :cond_0
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/rebate/OfferAmountTextView$1;->this$0:Lcom/ibotta/android/mvp/ui/view/rebate/OfferAmountTextView;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/view/rebate/OfferAmountTextView;->getText()Ljava/lang/CharSequence;

    move-result-object p1

    check-cast p1, Landroid/text/Spannable;

    .line 71
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/view/rebate/OfferAmountTextView$1;->this$0:Lcom/ibotta/android/mvp/ui/view/rebate/OfferAmountTextView;

    invoke-virtual {p2}, Lcom/ibotta/android/mvp/ui/view/rebate/OfferAmountTextView;->getContext()Landroid/content/Context;

    move-result-object p2

    const p4, 0x7f0600f2

    invoke-static {p2, p4}, Landroid/support/v4/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result p2

    .line 73
    new-instance p4, Landroid/text/style/ForegroundColorSpan;

    invoke-direct {p4, p2}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/view/rebate/OfferAmountTextView$1;->val$oldValueString:Ljava/lang/String;

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result p2

    const/16 p5, 0x21

    invoke-interface {p1, p4, p3, p2, p5}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 75
    new-instance p2, Landroid/text/style/StrikethroughSpan;

    invoke-direct {p2}, Landroid/text/style/StrikethroughSpan;-><init>()V

    iget-object p4, p0, Lcom/ibotta/android/mvp/ui/view/rebate/OfferAmountTextView$1;->val$oldValueString:Ljava/lang/String;

    invoke-virtual {p4}, Ljava/lang/String;->length()I

    move-result p4

    invoke-interface {p1, p2, p3, p4, p5}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    return-void
.end method
