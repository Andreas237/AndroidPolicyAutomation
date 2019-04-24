.class public Lcom/huawei/feedback/ui/CustomEdittext/CustomEditText;
.super Landroid/widget/EditText;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/feedback/ui/CustomEdittext/CustomEditText$a;
    }
.end annotation


# static fields
.field private static final a:Ljava/lang/String; = "CustomEditText"


# instance fields
.field private b:Lcom/huawei/feedback/ui/CustomEdittext/CustomEditText$a;

.field private c:Landroid/os/Handler;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 27
    invoke-direct {p0, p1}, Landroid/widget/EditText;-><init>(Landroid/content/Context;)V

    .line 29
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 32
    invoke-direct {p0, p1, p2}, Landroid/widget/EditText;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 34
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 37
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/EditText;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 39
    return-void
.end method


# virtual methods
.method public a(Landroid/os/Handler;)V
    .locals 0

    .line 47
    iput-object p1, p0, Lcom/huawei/feedback/ui/CustomEdittext/CustomEditText;->c:Landroid/os/Handler;

    .line 48
    return-void
.end method

.method public a(Lcom/huawei/feedback/ui/CustomEdittext/CustomEditText$a;)V
    .locals 0

    .line 43
    iput-object p1, p0, Lcom/huawei/feedback/ui/CustomEdittext/CustomEditText;->b:Lcom/huawei/feedback/ui/CustomEdittext/CustomEditText$a;

    .line 44
    return-void
.end method

.method public a()Z
    .locals 2

    .line 75
    iget-object v0, p0, Lcom/huawei/feedback/ui/CustomEdittext/CustomEditText;->c:Landroid/os/Handler;

    if-nez v0, :cond_0

    .line 76
    const/4 v0, 0x0

    return v0

    .line 78
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/feedback/ui/CustomEdittext/CustomEditText;->getSelectionEnd()I

    move-result v0

    invoke-virtual {p0}, Lcom/huawei/feedback/ui/CustomEdittext/CustomEditText;->getSelectionStart()I

    move-result v1

    sub-int/2addr v0, v1

    if-lez v0, :cond_1

    .line 79
    const/4 v0, 0x0

    return v0

    .line 80
    :cond_1
    invoke-virtual {p0}, Lcom/huawei/feedback/ui/CustomEdittext/CustomEditText;->getSelectionStart()I

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lcom/huawei/feedback/ui/CustomEdittext/CustomEditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-interface {v0}, Landroid/text/Editable;->length()I

    move-result v0

    if-nez v0, :cond_3

    .line 81
    :cond_2
    const-string v0, "CustomEditText"

    const-string v1, "doEmptyDelete"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 82
    iget-object v0, p0, Lcom/huawei/feedback/ui/CustomEdittext/CustomEditText;->c:Landroid/os/Handler;

    const/16 v1, -0x6d

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 83
    const/4 v0, 0x1

    return v0

    .line 85
    :cond_3
    const/4 v0, 0x0

    return v0
.end method

.method public onCreateInputConnection(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;
    .locals 2

    .line 57
    invoke-super {p0, p1}, Landroid/widget/EditText;->onCreateInputConnection(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;

    .line 58
    new-instance v1, Lcom/huawei/feedback/ui/CustomEdittext/b;

    invoke-direct {v1, p0}, Lcom/huawei/feedback/ui/CustomEdittext/b;-><init>(Landroid/widget/TextView;)V

    .line 59
    iget-object v0, p0, Lcom/huawei/feedback/ui/CustomEdittext/CustomEditText;->b:Lcom/huawei/feedback/ui/CustomEdittext/CustomEditText$a;

    invoke-virtual {v1, v0}, Lcom/huawei/feedback/ui/CustomEdittext/b;->a(Lcom/huawei/feedback/ui/CustomEdittext/CustomEditText$a;)V

    .line 60
    invoke-virtual {p0}, Lcom/huawei/feedback/ui/CustomEdittext/CustomEditText;->getEditableText()Landroid/text/Editable;

    move-result-object v0

    invoke-static {v0}, Landroid/text/Selection;->getSelectionStart(Ljava/lang/CharSequence;)I

    move-result v0

    iput v0, p1, Landroid/view/inputmethod/EditorInfo;->initialSelStart:I

    .line 61
    invoke-virtual {p0}, Lcom/huawei/feedback/ui/CustomEdittext/CustomEditText;->getEditableText()Landroid/text/Editable;

    move-result-object v0

    invoke-static {v0}, Landroid/text/Selection;->getSelectionEnd(Ljava/lang/CharSequence;)I

    move-result v0

    iput v0, p1, Landroid/view/inputmethod/EditorInfo;->initialSelEnd:I

    .line 62
    invoke-virtual {p0}, Lcom/huawei/feedback/ui/CustomEdittext/CustomEditText;->getInputType()I

    move-result v0

    invoke-virtual {v1, v0}, Lcom/huawei/feedback/ui/CustomEdittext/b;->getCursorCapsMode(I)I

    move-result v0

    iput v0, p1, Landroid/view/inputmethod/EditorInfo;->initialCapsMode:I

    .line 64
    new-instance v0, Lcom/huawei/feedback/ui/CustomEdittext/a;

    invoke-direct {v0, p0}, Lcom/huawei/feedback/ui/CustomEdittext/a;-><init>(Lcom/huawei/feedback/ui/CustomEdittext/CustomEditText;)V

    invoke-virtual {v1, v0}, Lcom/huawei/feedback/ui/CustomEdittext/b;->a(Lcom/huawei/feedback/ui/CustomEdittext/b$a;)V

    .line 70
    return-object v1
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 0

    .line 103
    invoke-super {p0, p1}, Landroid/widget/EditText;->onDraw(Landroid/graphics/Canvas;)V

    .line 104
    return-void
.end method

.method public setText(Ljava/lang/CharSequence;Landroid/widget/TextView$BufferType;)V
    .locals 2

    .line 93
    :try_start_0
    invoke-super {p0, p1, p2}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;Landroid/widget/TextView$BufferType;)V
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    .line 98
    goto :goto_0

    .line 94
    :catch_0
    move-exception v1

    .line 95
    if-eqz p1, :cond_0

    .line 96
    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/feedback/ui/CustomEdittext/CustomEditText;->setText(Ljava/lang/CharSequence;)V

    .line 99
    :cond_0
    :goto_0
    return-void
.end method
