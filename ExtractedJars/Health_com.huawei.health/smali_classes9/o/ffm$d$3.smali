.class Lo/ffm$d$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/text/TextWatcher;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/ffm$d;->b()Lo/ffm;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lo/ffm$d;


# direct methods
.method constructor <init>(Lo/ffm$d;)V
    .locals 0

    .line 97
    iput-object p1, p0, Lo/ffm$d$3;->e:Lo/ffm$d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public afterTextChanged(Landroid/text/Editable;)V
    .locals 6

    .line 111
    invoke-interface {p1}, Landroid/text/Editable;->length()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "."

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 112
    iget-object v0, p0, Lo/ffm$d$3;->e:Lo/ffm$d;

    invoke-static {v0}, Lo/ffm$d;->b(Lo/ffm$d;)Landroid/widget/EditText;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 113
    iget-object v0, p0, Lo/ffm$d$3;->e:Lo/ffm$d;

    invoke-static {v0}, Lo/ffm$d;->c(Lo/ffm$d;)Landroid/widget/Button;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setEnabled(Z)V

    goto :goto_0

    .line 115
    :cond_0
    iget-object v0, p0, Lo/ffm$d$3;->e:Lo/ffm$d;

    invoke-static {v0}, Lo/ffm$d;->c(Lo/ffm$d;)Landroid/widget/Button;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setEnabled(Z)V

    .line 117
    :goto_0
    invoke-interface {p1}, Landroid/text/Editable;->length()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_1

    iget-object v0, p0, Lo/ffm$d$3;->e:Lo/ffm$d;

    invoke-static {v0}, Lo/ffm$d;->b(Lo/ffm$d;)Landroid/widget/EditText;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "."

    invoke-virtual {v0, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    if-ltz v0, :cond_1

    .line 118
    iget-object v0, p0, Lo/ffm$d$3;->e:Lo/ffm$d;

    invoke-static {v0}, Lo/ffm$d;->b(Lo/ffm$d;)Landroid/widget/EditText;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "."

    iget-object v2, p0, Lo/ffm$d$3;->e:Lo/ffm$d;

    invoke-static {v2}, Lo/ffm$d;->b(Lo/ffm$d;)Landroid/widget/EditText;

    move-result-object v2

    invoke-virtual {v2}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "."

    invoke-virtual {v2, v3}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v2

    add-int/lit8 v2, v2, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->indexOf(Ljava/lang/String;I)I

    move-result v0

    if-lez v0, :cond_1

    .line 120
    iget-object v0, p0, Lo/ffm$d$3;->e:Lo/ffm$d;

    invoke-static {v0}, Lo/ffm$d;->b(Lo/ffm$d;)Landroid/widget/EditText;

    move-result-object v0

    iget-object v1, p0, Lo/ffm$d$3;->e:Lo/ffm$d;

    invoke-static {v1}, Lo/ffm$d;->b(Lo/ffm$d;)Landroid/widget/EditText;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lo/ffm$d$3;->e:Lo/ffm$d;

    invoke-static {v2}, Lo/ffm$d;->b(Lo/ffm$d;)Landroid/widget/EditText;

    move-result-object v2

    invoke-virtual {v2}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    const/4 v3, 0x0

    invoke-virtual {v1, v3, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 121
    iget-object v0, p0, Lo/ffm$d$3;->e:Lo/ffm$d;

    invoke-static {v0}, Lo/ffm$d;->b(Lo/ffm$d;)Landroid/widget/EditText;

    move-result-object v0

    iget-object v1, p0, Lo/ffm$d$3;->e:Lo/ffm$d;

    invoke-static {v1}, Lo/ffm$d;->b(Lo/ffm$d;)Landroid/widget/EditText;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setSelection(I)V

    .line 124
    :cond_1
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    .line 125
    const-string v0, "."

    invoke-virtual {v4, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v5

    .line 126
    if-gtz v5, :cond_2

    return-void

    .line 127
    :cond_2
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v0

    sub-int/2addr v0, v5

    add-int/lit8 v0, v0, -0x1

    const/4 v1, 0x2

    if-le v0, v1, :cond_3

    .line 128
    add-int/lit8 v0, v5, 0x3

    add-int/lit8 v1, v5, 0x4

    invoke-interface {p1, v0, v1}, Landroid/text/Editable;->delete(II)Landroid/text/Editable;

    .line 130
    :cond_3
    return-void
.end method

.method public beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    .line 101
    return-void
.end method

.method public onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    .line 106
    return-void
.end method
