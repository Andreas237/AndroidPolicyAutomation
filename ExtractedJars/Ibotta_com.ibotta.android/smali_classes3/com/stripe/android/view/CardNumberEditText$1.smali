.class Lcom/stripe/android/view/CardNumberEditText$1;
.super Ljava/lang/Object;
.source "CardNumberEditText.java"

# interfaces
.implements Landroid/text/TextWatcher;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/view/CardNumberEditText;->listenForTextChanges()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field latestChangeStart:I

.field latestInsertionSize:I

.field final synthetic this$0:Lcom/stripe/android/view/CardNumberEditText;


# direct methods
.method constructor <init>(Lcom/stripe/android/view/CardNumberEditText;)V
    .locals 0

    .line 150
    iput-object p1, p0, Lcom/stripe/android/view/CardNumberEditText$1;->this$0:Lcom/stripe/android/view/CardNumberEditText;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public afterTextChanged(Landroid/text/Editable;)V
    .locals 3

    .line 210
    invoke-interface {p1}, Landroid/text/Editable;->length()I

    move-result v0

    iget-object v1, p0, Lcom/stripe/android/view/CardNumberEditText$1;->this$0:Lcom/stripe/android/view/CardNumberEditText;

    invoke-static {v1}, Lcom/stripe/android/view/CardNumberEditText;->access$200(Lcom/stripe/android/view/CardNumberEditText;)I

    move-result v1

    const/4 v2, 0x1

    if-ne v0, v1, :cond_0

    .line 211
    iget-object v0, p0, Lcom/stripe/android/view/CardNumberEditText$1;->this$0:Lcom/stripe/android/view/CardNumberEditText;

    invoke-static {v0}, Lcom/stripe/android/view/CardNumberEditText;->access$300(Lcom/stripe/android/view/CardNumberEditText;)Z

    move-result v0

    .line 212
    iget-object v1, p0, Lcom/stripe/android/view/CardNumberEditText$1;->this$0:Lcom/stripe/android/view/CardNumberEditText;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/stripe/android/CardUtils;->isValidCardNumber(Ljava/lang/String;)Z

    move-result p1

    invoke-static {v1, p1}, Lcom/stripe/android/view/CardNumberEditText;->access$302(Lcom/stripe/android/view/CardNumberEditText;Z)Z

    .line 213
    iget-object p1, p0, Lcom/stripe/android/view/CardNumberEditText$1;->this$0:Lcom/stripe/android/view/CardNumberEditText;

    invoke-static {p1}, Lcom/stripe/android/view/CardNumberEditText;->access$300(Lcom/stripe/android/view/CardNumberEditText;)Z

    move-result v1

    xor-int/2addr v1, v2

    invoke-virtual {p1, v1}, Lcom/stripe/android/view/CardNumberEditText;->setShouldShowError(Z)V

    if-nez v0, :cond_2

    .line 214
    iget-object p1, p0, Lcom/stripe/android/view/CardNumberEditText$1;->this$0:Lcom/stripe/android/view/CardNumberEditText;

    invoke-static {p1}, Lcom/stripe/android/view/CardNumberEditText;->access$300(Lcom/stripe/android/view/CardNumberEditText;)Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Lcom/stripe/android/view/CardNumberEditText$1;->this$0:Lcom/stripe/android/view/CardNumberEditText;

    invoke-static {p1}, Lcom/stripe/android/view/CardNumberEditText;->access$400(Lcom/stripe/android/view/CardNumberEditText;)Lcom/stripe/android/view/CardNumberEditText$CardNumberCompleteListener;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 215
    iget-object p1, p0, Lcom/stripe/android/view/CardNumberEditText$1;->this$0:Lcom/stripe/android/view/CardNumberEditText;

    invoke-static {p1}, Lcom/stripe/android/view/CardNumberEditText;->access$400(Lcom/stripe/android/view/CardNumberEditText;)Lcom/stripe/android/view/CardNumberEditText$CardNumberCompleteListener;

    move-result-object p1

    invoke-interface {p1}, Lcom/stripe/android/view/CardNumberEditText$CardNumberCompleteListener;->onCardNumberComplete()V

    goto :goto_1

    .line 218
    :cond_0
    iget-object p1, p0, Lcom/stripe/android/view/CardNumberEditText$1;->this$0:Lcom/stripe/android/view/CardNumberEditText;

    invoke-virtual {p1}, Lcom/stripe/android/view/CardNumberEditText;->getText()Landroid/text/Editable;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/stripe/android/view/CardNumberEditText$1;->this$0:Lcom/stripe/android/view/CardNumberEditText;

    .line 219
    invoke-virtual {v0}, Lcom/stripe/android/view/CardNumberEditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/stripe/android/CardUtils;->isValidCardNumber(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    .line 218
    :goto_0
    invoke-static {p1, v2}, Lcom/stripe/android/view/CardNumberEditText;->access$302(Lcom/stripe/android/view/CardNumberEditText;Z)Z

    .line 221
    iget-object p1, p0, Lcom/stripe/android/view/CardNumberEditText$1;->this$0:Lcom/stripe/android/view/CardNumberEditText;

    invoke-virtual {p1, v1}, Lcom/stripe/android/view/CardNumberEditText;->setShouldShowError(Z)V

    :cond_2
    :goto_1
    return-void
.end method

.method public beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    .line 156
    iget-object p1, p0, Lcom/stripe/android/view/CardNumberEditText$1;->this$0:Lcom/stripe/android/view/CardNumberEditText;

    invoke-static {p1}, Lcom/stripe/android/view/CardNumberEditText;->access$000(Lcom/stripe/android/view/CardNumberEditText;)Z

    move-result p1

    if-nez p1, :cond_0

    .line 157
    iput p2, p0, Lcom/stripe/android/view/CardNumberEditText$1;->latestChangeStart:I

    .line 158
    iput p4, p0, Lcom/stripe/android/view/CardNumberEditText$1;->latestInsertionSize:I

    :cond_0
    return-void
.end method

.method public onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 2

    .line 164
    iget-object p3, p0, Lcom/stripe/android/view/CardNumberEditText$1;->this$0:Lcom/stripe/android/view/CardNumberEditText;

    invoke-static {p3}, Lcom/stripe/android/view/CardNumberEditText;->access$000(Lcom/stripe/android/view/CardNumberEditText;)Z

    move-result p3

    if-eqz p3, :cond_0

    return-void

    :cond_0
    const/4 p3, 0x4

    if-ge p2, p3, :cond_1

    .line 169
    iget-object p3, p0, Lcom/stripe/android/view/CardNumberEditText$1;->this$0:Lcom/stripe/android/view/CardNumberEditText;

    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p4

    invoke-static {p3, p4}, Lcom/stripe/android/view/CardNumberEditText;->access$100(Lcom/stripe/android/view/CardNumberEditText;Ljava/lang/String;)V

    :cond_1
    const/16 p3, 0x10

    if-le p2, p3, :cond_2

    return-void

    .line 177
    :cond_2
    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/stripe/android/StripeTextUtils;->removeSpacesAndHyphens(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_3

    return-void

    .line 182
    :cond_3
    iget-object p2, p0, Lcom/stripe/android/view/CardNumberEditText$1;->this$0:Lcom/stripe/android/view/CardNumberEditText;

    iget-object p2, p2, Lcom/stripe/android/view/CardNumberEditText;->mCardBrand:Ljava/lang/String;

    invoke-static {p1, p2}, Lcom/stripe/android/view/ViewUtils;->separateCardNumberGroups(Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    .line 184
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const/4 p3, 0x0

    const/4 p4, 0x0

    .line 185
    :goto_0
    array-length v0, p1

    if-ge p4, v0, :cond_6

    .line 186
    aget-object v0, p1, p4

    if-nez v0, :cond_4

    goto :goto_1

    :cond_4
    if-eqz p4, :cond_5

    const/16 v0, 0x20

    .line 191
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 193
    :cond_5
    aget-object v0, p1, p4

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 p4, p4, 0x1

    goto :goto_0

    .line 196
    :cond_6
    :goto_1
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 197
    iget-object p2, p0, Lcom/stripe/android/view/CardNumberEditText$1;->this$0:Lcom/stripe/android/view/CardNumberEditText;

    .line 198
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p4

    iget v0, p0, Lcom/stripe/android/view/CardNumberEditText$1;->latestChangeStart:I

    iget v1, p0, Lcom/stripe/android/view/CardNumberEditText$1;->latestInsertionSize:I

    .line 197
    invoke-virtual {p2, p4, v0, v1}, Lcom/stripe/android/view/CardNumberEditText;->updateSelectionIndex(III)I

    move-result p2

    .line 202
    iget-object p4, p0, Lcom/stripe/android/view/CardNumberEditText$1;->this$0:Lcom/stripe/android/view/CardNumberEditText;

    const/4 v0, 0x1

    invoke-static {p4, v0}, Lcom/stripe/android/view/CardNumberEditText;->access$002(Lcom/stripe/android/view/CardNumberEditText;Z)Z

    .line 203
    iget-object p4, p0, Lcom/stripe/android/view/CardNumberEditText$1;->this$0:Lcom/stripe/android/view/CardNumberEditText;

    invoke-virtual {p4, p1}, Lcom/stripe/android/view/CardNumberEditText;->setText(Ljava/lang/CharSequence;)V

    .line 204
    iget-object p1, p0, Lcom/stripe/android/view/CardNumberEditText$1;->this$0:Lcom/stripe/android/view/CardNumberEditText;

    invoke-virtual {p1, p2}, Lcom/stripe/android/view/CardNumberEditText;->setSelection(I)V

    .line 205
    iget-object p1, p0, Lcom/stripe/android/view/CardNumberEditText$1;->this$0:Lcom/stripe/android/view/CardNumberEditText;

    invoke-static {p1, p3}, Lcom/stripe/android/view/CardNumberEditText;->access$002(Lcom/stripe/android/view/CardNumberEditText;Z)Z

    return-void
.end method
