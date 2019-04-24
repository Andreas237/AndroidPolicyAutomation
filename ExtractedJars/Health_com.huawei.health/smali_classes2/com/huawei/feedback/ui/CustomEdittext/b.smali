.class public Lcom/huawei/feedback/ui/CustomEdittext/b;
.super Landroid/view/inputmethod/BaseInputConnection;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/feedback/ui/CustomEdittext/b$a;
    }
.end annotation


# static fields
.field private static final b:Ljava/lang/String; = "SmileyInputConnection"


# instance fields
.field protected a:Lcom/huawei/feedback/ui/CustomEdittext/b$a;

.field private final c:Landroid/widget/TextView;

.field private d:Lcom/huawei/feedback/ui/CustomEdittext/CustomEditText$a;


# direct methods
.method public constructor <init>(Landroid/widget/TextView;)V
    .locals 1

    .line 37
    const/4 v0, 0x1

    invoke-direct {p0, p1, v0}, Landroid/view/inputmethod/BaseInputConnection;-><init>(Landroid/view/View;Z)V

    .line 26
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/feedback/ui/CustomEdittext/b;->a:Lcom/huawei/feedback/ui/CustomEdittext/b$a;

    .line 39
    iput-object p1, p0, Lcom/huawei/feedback/ui/CustomEdittext/b;->c:Landroid/widget/TextView;

    .line 40
    return-void
.end method

.method private a(Landroid/widget/TextView;Landroid/view/inputmethod/ExtractedTextRequest;)V
    .locals 7

    .line 162
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-string v1, "setExtracting"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Class;

    const-class v3, Landroid/view/inputmethod/ExtractedTextRequest;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v5

    .line 163
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p2, v0, v1

    invoke-virtual {v5, p1, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_4

    .line 184
    goto :goto_0

    .line 165
    :catch_0
    move-exception v6

    .line 167
    const-string v0, "SmileyInputConnection"

    const-string v1, "setExtracting NoSuchMethodException"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 184
    goto :goto_0

    .line 169
    :catch_1
    move-exception v6

    .line 171
    const-string v0, "SmileyInputConnection"

    const-string v1, "setExtracting IllegalAccessException"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 184
    goto :goto_0

    .line 173
    :catch_2
    move-exception v6

    .line 175
    const-string v0, "SmileyInputConnection"

    const-string v1, "setExtracting IllegalArgumentException"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 184
    goto :goto_0

    .line 177
    :catch_3
    move-exception v6

    .line 179
    const-string v0, "SmileyInputConnection"

    const-string v1, "setExtracting InvocationTargetException"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 184
    goto :goto_0

    .line 181
    :catch_4
    move-exception v6

    .line 183
    const-string v0, "SmileyInputConnection"

    const-string v1, "setExtracting SecurityException"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 185
    :goto_0
    return-void
.end method


# virtual methods
.method public a(Lcom/huawei/feedback/ui/CustomEdittext/CustomEditText$a;)V
    .locals 0

    .line 44
    iput-object p1, p0, Lcom/huawei/feedback/ui/CustomEdittext/b;->d:Lcom/huawei/feedback/ui/CustomEdittext/CustomEditText$a;

    .line 45
    return-void
.end method

.method public a(Lcom/huawei/feedback/ui/CustomEdittext/b$a;)V
    .locals 0

    .line 33
    iput-object p1, p0, Lcom/huawei/feedback/ui/CustomEdittext/b;->a:Lcom/huawei/feedback/ui/CustomEdittext/b$a;

    .line 34
    return-void
.end method

.method public beginBatchEdit()Z
    .locals 1

    .line 56
    iget-object v0, p0, Lcom/huawei/feedback/ui/CustomEdittext/b;->c:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->beginBatchEdit()V

    .line 57
    const/4 v0, 0x1

    return v0
.end method

.method public clearMetaKeyStates(I)Z
    .locals 5

    .line 66
    invoke-virtual {p0}, Lcom/huawei/feedback/ui/CustomEdittext/b;->getEditable()Landroid/text/Editable;

    move-result-object v2

    .line 67
    if-nez v2, :cond_0

    .line 68
    const/4 v0, 0x0

    return v0

    .line 69
    :cond_0
    iget-object v0, p0, Lcom/huawei/feedback/ui/CustomEdittext/b;->c:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getKeyListener()Landroid/text/method/KeyListener;

    move-result-object v3

    .line 70
    if-eqz v3, :cond_1

    .line 72
    :try_start_0
    iget-object v0, p0, Lcom/huawei/feedback/ui/CustomEdittext/b;->c:Landroid/widget/TextView;

    invoke-interface {v3, v0, v2, p1}, Landroid/text/method/KeyListener;->clearMetaKeyState(Landroid/view/View;Landroid/text/Editable;I)V
    :try_end_0
    .catch Ljava/lang/AbstractMethodError; {:try_start_0 .. :try_end_0} :catch_0

    .line 75
    goto :goto_0

    .line 73
    :catch_0
    move-exception v4

    .line 74
    const-string v0, "SmileyInputConnection"

    const-string v1, "kl AbstractMethodError"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 77
    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public commitCompletion(Landroid/view/inputmethod/CompletionInfo;)Z
    .locals 3

    .line 81
    const-string v0, "SmileyInputConnection"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "commitCompletion "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 82
    iget-object v0, p0, Lcom/huawei/feedback/ui/CustomEdittext/b;->c:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->beginBatchEdit()V

    .line 83
    iget-object v0, p0, Lcom/huawei/feedback/ui/CustomEdittext/b;->c:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->onCommitCompletion(Landroid/view/inputmethod/CompletionInfo;)V

    .line 84
    iget-object v0, p0, Lcom/huawei/feedback/ui/CustomEdittext/b;->c:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->endBatchEdit()V

    .line 85
    const/4 v0, 0x1

    return v0
.end method

.method public commitText(Ljava/lang/CharSequence;I)Z
    .locals 6

    .line 125
    iget-object v0, p0, Lcom/huawei/feedback/ui/CustomEdittext/b;->c:Landroid/widget/TextView;

    if-nez v0, :cond_0

    .line 126
    invoke-super {p0, p1, p2}, Landroid/view/inputmethod/BaseInputConnection;->commitText(Ljava/lang/CharSequence;I)Z

    move-result v0

    return v0

    .line 129
    :cond_0
    iget-object v0, p0, Lcom/huawei/feedback/ui/CustomEdittext/b;->c:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getError()Ljava/lang/CharSequence;

    move-result-object v3

    .line 137
    invoke-super {p0, p1, p2}, Landroid/view/inputmethod/BaseInputConnection;->commitText(Ljava/lang/CharSequence;I)Z

    move-result v4

    .line 138
    iget-object v0, p0, Lcom/huawei/feedback/ui/CustomEdittext/b;->c:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getError()Ljava/lang/CharSequence;

    move-result-object v5

    .line 139
    if-eqz v5, :cond_1

    invoke-interface {v5}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v3}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 140
    iget-object v0, p0, Lcom/huawei/feedback/ui/CustomEdittext/b;->c:Landroid/widget/TextView;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/widget/TextView;->setError(Ljava/lang/CharSequence;Landroid/graphics/drawable/Drawable;)V

    .line 143
    :cond_1
    return v4
.end method

.method public deleteSurroundingText(II)Z
    .locals 3

    .line 201
    const-string v0, "SmileyInputConnection"

    const-string v1, "deleteSurroundingText"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 202
    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    if-nez p2, :cond_1

    .line 203
    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/huawei/feedback/ui/CustomEdittext/b;->getTextBeforeCursor(II)Ljava/lang/CharSequence;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 204
    const/4 v0, 0x0

    return v0

    .line 206
    :cond_0
    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/huawei/feedback/ui/CustomEdittext/b;->getTextBeforeCursor(II)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v2

    .line 207
    if-nez v2, :cond_1

    .line 208
    iget-object v0, p0, Lcom/huawei/feedback/ui/CustomEdittext/b;->a:Lcom/huawei/feedback/ui/CustomEdittext/b$a;

    invoke-interface {v0}, Lcom/huawei/feedback/ui/CustomEdittext/b$a;->a()Z

    .line 211
    :cond_1
    invoke-super {p0, p1, p2}, Landroid/view/inputmethod/BaseInputConnection;->deleteSurroundingText(II)Z

    move-result v0

    return v0
.end method

.method public endBatchEdit()Z
    .locals 1

    .line 61
    iget-object v0, p0, Lcom/huawei/feedback/ui/CustomEdittext/b;->c:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->endBatchEdit()V

    .line 62
    const/4 v0, 0x1

    return v0
.end method

.method public finishComposingText()Z
    .locals 1

    .line 149
    iget-object v0, p0, Lcom/huawei/feedback/ui/CustomEdittext/b;->d:Lcom/huawei/feedback/ui/CustomEdittext/CustomEditText$a;

    if-eqz v0, :cond_0

    .line 150
    iget-object v0, p0, Lcom/huawei/feedback/ui/CustomEdittext/b;->d:Lcom/huawei/feedback/ui/CustomEdittext/CustomEditText$a;

    invoke-interface {v0}, Lcom/huawei/feedback/ui/CustomEdittext/CustomEditText$a;->a()V

    .line 153
    :cond_0
    invoke-super {p0}, Landroid/view/inputmethod/BaseInputConnection;->finishComposingText()Z

    move-result v0

    return v0
.end method

.method public getEditable()Landroid/text/Editable;
    .locals 2

    .line 48
    iget-object v1, p0, Lcom/huawei/feedback/ui/CustomEdittext/b;->c:Landroid/widget/TextView;

    .line 49
    if-eqz v1, :cond_0

    .line 50
    invoke-virtual {v1}, Landroid/widget/TextView;->getEditableText()Landroid/text/Editable;

    move-result-object v0

    return-object v0

    .line 52
    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public getExtractedText(Landroid/view/inputmethod/ExtractedTextRequest;I)Landroid/view/inputmethod/ExtractedText;
    .locals 2

    .line 103
    iget-object v0, p0, Lcom/huawei/feedback/ui/CustomEdittext/b;->c:Landroid/widget/TextView;

    if-eqz v0, :cond_1

    .line 104
    new-instance v1, Landroid/view/inputmethod/ExtractedText;

    invoke-direct {v1}, Landroid/view/inputmethod/ExtractedText;-><init>()V

    .line 105
    iget-object v0, p0, Lcom/huawei/feedback/ui/CustomEdittext/b;->c:Landroid/widget/TextView;

    invoke-virtual {v0, p1, v1}, Landroid/widget/TextView;->extractText(Landroid/view/inputmethod/ExtractedTextRequest;Landroid/view/inputmethod/ExtractedText;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 106
    and-int/lit8 v0, p2, 0x1

    if-eqz v0, :cond_0

    .line 108
    iget-object v0, p0, Lcom/huawei/feedback/ui/CustomEdittext/b;->c:Landroid/widget/TextView;

    invoke-direct {p0, v0, p1}, Lcom/huawei/feedback/ui/CustomEdittext/b;->a(Landroid/widget/TextView;Landroid/view/inputmethod/ExtractedTextRequest;)V

    .line 110
    :cond_0
    return-object v1

    .line 113
    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public performContextMenuAction(I)Z
    .locals 3

    .line 95
    const-string v0, "SmileyInputConnection"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "performContextMenuAction "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 96
    iget-object v0, p0, Lcom/huawei/feedback/ui/CustomEdittext/b;->c:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->beginBatchEdit()V

    .line 97
    iget-object v0, p0, Lcom/huawei/feedback/ui/CustomEdittext/b;->c:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->onTextContextMenuItem(I)Z

    .line 98
    iget-object v0, p0, Lcom/huawei/feedback/ui/CustomEdittext/b;->c:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->endBatchEdit()V

    .line 99
    const/4 v0, 0x1

    return v0
.end method

.method public performEditorAction(I)Z
    .locals 3

    .line 89
    const-string v0, "SmileyInputConnection"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "performEditorAction "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 90
    iget-object v0, p0, Lcom/huawei/feedback/ui/CustomEdittext/b;->c:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->onEditorAction(I)V

    .line 91
    const/4 v0, 0x1

    return v0
.end method

.method public performPrivateCommand(Ljava/lang/String;Landroid/os/Bundle;)Z
    .locals 1

    .line 118
    iget-object v0, p0, Lcom/huawei/feedback/ui/CustomEdittext/b;->c:Landroid/widget/TextView;

    invoke-virtual {v0, p1, p2}, Landroid/widget/TextView;->onPrivateIMECommand(Ljava/lang/String;Landroid/os/Bundle;)Z

    .line 119
    const/4 v0, 0x1

    return v0
.end method

.method public sendKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 2

    .line 189
    const-string v0, "SmileyInputConnection"

    const-string v1, "sendKeyEvent"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 190
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v0

    const/16 v1, 0x43

    if-ne v0, v1, :cond_0

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    move-result v0

    if-nez v0, :cond_0

    .line 191
    iget-object v0, p0, Lcom/huawei/feedback/ui/CustomEdittext/b;->a:Lcom/huawei/feedback/ui/CustomEdittext/b$a;

    invoke-interface {v0}, Lcom/huawei/feedback/ui/CustomEdittext/b$a;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 192
    const/4 v0, 0x1

    return v0

    .line 196
    :cond_0
    invoke-super {p0, p1}, Landroid/view/inputmethod/BaseInputConnection;->sendKeyEvent(Landroid/view/KeyEvent;)Z

    move-result v0

    return v0
.end method
