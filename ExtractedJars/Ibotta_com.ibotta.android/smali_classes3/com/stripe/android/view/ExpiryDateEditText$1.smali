.class Lcom/stripe/android/view/ExpiryDateEditText$1;
.super Ljava/lang/Object;
.source "ExpiryDateEditText.java"

# interfaces
.implements Landroid/text/TextWatcher;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/view/ExpiryDateEditText;->listenForTextChanges()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field ignoreChanges:Z

.field latestChangeStart:I

.field latestInsertionSize:I

.field parts:[Ljava/lang/String;

.field final synthetic this$0:Lcom/stripe/android/view/ExpiryDateEditText;


# direct methods
.method constructor <init>(Lcom/stripe/android/view/ExpiryDateEditText;)V
    .locals 0

    .line 86
    iput-object p1, p0, Lcom/stripe/android/view/ExpiryDateEditText$1;->this$0:Lcom/stripe/android/view/ExpiryDateEditText;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    .line 87
    iput-boolean p1, p0, Lcom/stripe/android/view/ExpiryDateEditText$1;->ignoreChanges:Z

    const/4 p1, 0x2

    .line 90
    new-array p1, p1, [Ljava/lang/String;

    iput-object p1, p0, Lcom/stripe/android/view/ExpiryDateEditText$1;->parts:[Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public afterTextChanged(Landroid/text/Editable;)V
    .locals 4

    .line 168
    iget-object p1, p0, Lcom/stripe/android/view/ExpiryDateEditText$1;->parts:[Ljava/lang/String;

    const/4 v0, 0x0

    aget-object p1, p1, v0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    const/4 v1, 0x1

    const/4 v2, 0x2

    if-ne p1, v2, :cond_0

    iget-object p1, p0, Lcom/stripe/android/view/ExpiryDateEditText$1;->parts:[Ljava/lang/String;

    aget-object p1, p1, v0

    invoke-static {p1}, Lcom/stripe/android/view/DateUtils;->isValidMonth(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 177
    :goto_0
    iget-object v3, p0, Lcom/stripe/android/view/ExpiryDateEditText$1;->parts:[Ljava/lang/String;

    aget-object v3, v3, v0

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    if-ne v3, v2, :cond_2

    iget-object v3, p0, Lcom/stripe/android/view/ExpiryDateEditText$1;->parts:[Ljava/lang/String;

    aget-object v3, v3, v1

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    if-ne v3, v2, :cond_2

    .line 178
    iget-object p1, p0, Lcom/stripe/android/view/ExpiryDateEditText$1;->this$0:Lcom/stripe/android/view/ExpiryDateEditText;

    invoke-static {p1}, Lcom/stripe/android/view/ExpiryDateEditText;->access$000(Lcom/stripe/android/view/ExpiryDateEditText;)Z

    move-result p1

    .line 179
    iget-object v0, p0, Lcom/stripe/android/view/ExpiryDateEditText$1;->this$0:Lcom/stripe/android/view/ExpiryDateEditText;

    iget-object v2, p0, Lcom/stripe/android/view/ExpiryDateEditText$1;->parts:[Ljava/lang/String;

    invoke-static {v0, v2}, Lcom/stripe/android/view/ExpiryDateEditText;->access$100(Lcom/stripe/android/view/ExpiryDateEditText;[Ljava/lang/String;)V

    .line 182
    iget-object v0, p0, Lcom/stripe/android/view/ExpiryDateEditText$1;->this$0:Lcom/stripe/android/view/ExpiryDateEditText;

    invoke-static {v0}, Lcom/stripe/android/view/ExpiryDateEditText;->access$000(Lcom/stripe/android/view/ExpiryDateEditText;)Z

    move-result v0

    xor-int/2addr v0, v1

    if-nez p1, :cond_1

    .line 183
    iget-object p1, p0, Lcom/stripe/android/view/ExpiryDateEditText$1;->this$0:Lcom/stripe/android/view/ExpiryDateEditText;

    invoke-static {p1}, Lcom/stripe/android/view/ExpiryDateEditText;->access$000(Lcom/stripe/android/view/ExpiryDateEditText;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/stripe/android/view/ExpiryDateEditText$1;->this$0:Lcom/stripe/android/view/ExpiryDateEditText;

    invoke-static {p1}, Lcom/stripe/android/view/ExpiryDateEditText;->access$200(Lcom/stripe/android/view/ExpiryDateEditText;)Lcom/stripe/android/view/ExpiryDateEditText$ExpiryDateEditListener;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 184
    iget-object p1, p0, Lcom/stripe/android/view/ExpiryDateEditText$1;->this$0:Lcom/stripe/android/view/ExpiryDateEditText;

    invoke-static {p1}, Lcom/stripe/android/view/ExpiryDateEditText;->access$200(Lcom/stripe/android/view/ExpiryDateEditText;)Lcom/stripe/android/view/ExpiryDateEditText$ExpiryDateEditListener;

    move-result-object p1

    invoke-interface {p1}, Lcom/stripe/android/view/ExpiryDateEditText$ExpiryDateEditListener;->onExpiryDateComplete()V

    :cond_1
    move p1, v0

    goto :goto_1

    .line 187
    :cond_2
    iget-object v1, p0, Lcom/stripe/android/view/ExpiryDateEditText$1;->this$0:Lcom/stripe/android/view/ExpiryDateEditText;

    invoke-static {v1, v0}, Lcom/stripe/android/view/ExpiryDateEditText;->access$002(Lcom/stripe/android/view/ExpiryDateEditText;Z)Z

    .line 190
    :goto_1
    iget-object v0, p0, Lcom/stripe/android/view/ExpiryDateEditText$1;->this$0:Lcom/stripe/android/view/ExpiryDateEditText;

    invoke-virtual {v0, p1}, Lcom/stripe/android/view/ExpiryDateEditText;->setShouldShowError(Z)V

    return-void
.end method

.method public beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    .line 94
    iget-boolean p1, p0, Lcom/stripe/android/view/ExpiryDateEditText$1;->ignoreChanges:Z

    if-eqz p1, :cond_0

    return-void

    .line 97
    :cond_0
    iput p2, p0, Lcom/stripe/android/view/ExpiryDateEditText$1;->latestChangeStart:I

    .line 98
    iput p4, p0, Lcom/stripe/android/view/ExpiryDateEditText$1;->latestInsertionSize:I

    return-void
.end method

.method public onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 3

    .line 103
    iget-boolean p2, p0, Lcom/stripe/android/view/ExpiryDateEditText$1;->ignoreChanges:Z

    if-eqz p2, :cond_0

    return-void

    .line 109
    :cond_0
    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "/"

    const-string p3, ""

    invoke-virtual {p1, p2, p3}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 111
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p2

    const/4 p3, 0x2

    const/4 p4, 0x0

    const/4 v0, 0x1

    if-ne p2, v0, :cond_1

    iget p2, p0, Lcom/stripe/android/view/ExpiryDateEditText$1;->latestChangeStart:I

    if-nez p2, :cond_1

    iget p2, p0, Lcom/stripe/android/view/ExpiryDateEditText$1;->latestInsertionSize:I

    if-ne p2, v0, :cond_1

    .line 114
    invoke-virtual {p1, p4}, Ljava/lang/String;->charAt(I)C

    move-result p2

    const/16 v1, 0x30

    if-eq p2, v1, :cond_2

    const/16 v1, 0x31

    if-eq p2, v1, :cond_2

    .line 120
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "0"

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 121
    iget p2, p0, Lcom/stripe/android/view/ExpiryDateEditText$1;->latestInsertionSize:I

    add-int/2addr p2, v0

    iput p2, p0, Lcom/stripe/android/view/ExpiryDateEditText$1;->latestInsertionSize:I

    goto :goto_0

    .line 123
    :cond_1
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p2

    if-ne p2, p3, :cond_2

    iget p2, p0, Lcom/stripe/android/view/ExpiryDateEditText$1;->latestChangeStart:I

    if-ne p2, p3, :cond_2

    iget p2, p0, Lcom/stripe/android/view/ExpiryDateEditText$1;->latestInsertionSize:I

    if-nez p2, :cond_2

    .line 130
    invoke-virtual {p1, p4, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    .line 134
    :cond_2
    :goto_0
    invoke-static {p1}, Lcom/stripe/android/view/DateUtils;->separateDateStringParts(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lcom/stripe/android/view/ExpiryDateEditText$1;->parts:[Ljava/lang/String;

    .line 136
    iget-object p2, p0, Lcom/stripe/android/view/ExpiryDateEditText$1;->parts:[Ljava/lang/String;

    aget-object p2, p2, p4

    invoke-static {p2}, Lcom/stripe/android/view/DateUtils;->isValidMonth(Ljava/lang/String;)Z

    move-result p2

    xor-int/2addr p2, v0

    .line 140
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 141
    iget-object v2, p0, Lcom/stripe/android/view/ExpiryDateEditText$1;->parts:[Ljava/lang/String;

    aget-object v2, v2, p4

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 143
    iget-object v2, p0, Lcom/stripe/android/view/ExpiryDateEditText$1;->parts:[Ljava/lang/String;

    aget-object v2, v2, p4

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    if-ne v2, p3, :cond_3

    iget v2, p0, Lcom/stripe/android/view/ExpiryDateEditText$1;->latestInsertionSize:I

    if-lez v2, :cond_3

    if-eqz p2, :cond_4

    .line 144
    :cond_3
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    if-le p1, p3, :cond_5

    :cond_4
    const-string p1, "/"

    .line 145
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 148
    :cond_5
    iget-object p1, p0, Lcom/stripe/android/view/ExpiryDateEditText$1;->parts:[Ljava/lang/String;

    aget-object p1, p1, v0

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 150
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 151
    iget-object p2, p0, Lcom/stripe/android/view/ExpiryDateEditText$1;->this$0:Lcom/stripe/android/view/ExpiryDateEditText;

    .line 152
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p3

    iget v1, p0, Lcom/stripe/android/view/ExpiryDateEditText$1;->latestChangeStart:I

    iget v2, p0, Lcom/stripe/android/view/ExpiryDateEditText$1;->latestInsertionSize:I

    .line 151
    invoke-virtual {p2, p3, v1, v2}, Lcom/stripe/android/view/ExpiryDateEditText;->updateSelectionIndex(III)I

    move-result p2

    .line 156
    iput-boolean v0, p0, Lcom/stripe/android/view/ExpiryDateEditText$1;->ignoreChanges:Z

    .line 157
    iget-object p3, p0, Lcom/stripe/android/view/ExpiryDateEditText$1;->this$0:Lcom/stripe/android/view/ExpiryDateEditText;

    invoke-virtual {p3, p1}, Lcom/stripe/android/view/ExpiryDateEditText;->setText(Ljava/lang/CharSequence;)V

    .line 158
    iget-object p1, p0, Lcom/stripe/android/view/ExpiryDateEditText$1;->this$0:Lcom/stripe/android/view/ExpiryDateEditText;

    invoke-virtual {p1, p2}, Lcom/stripe/android/view/ExpiryDateEditText;->setSelection(I)V

    .line 159
    iput-boolean p4, p0, Lcom/stripe/android/view/ExpiryDateEditText$1;->ignoreChanges:Z

    return-void
.end method
