.class Lo/ery$e$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/text/TextWatcher;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/ery$e;->e(II)Lo/ery;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/ery$e;


# direct methods
.method constructor <init>(Lo/ery$e;)V
    .locals 0

    .line 112
    iput-object p1, p0, Lo/ery$e$1;->c:Lo/ery$e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public afterTextChanged(Landroid/text/Editable;)V
    .locals 3

    .line 125
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    .line 126
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 127
    iget-object v0, p0, Lo/ery$e$1;->c:Lo/ery$e;

    invoke-static {v0}, Lo/ery$e;->c(Lo/ery$e;)Landroid/widget/Button;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setEnabled(Z)V

    goto :goto_0

    .line 129
    :cond_0
    iget-object v0, p0, Lo/ery$e$1;->c:Lo/ery$e;

    invoke-static {v0}, Lo/ery$e;->c(Lo/ery$e;)Landroid/widget/Button;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setEnabled(Z)V

    .line 131
    :goto_0
    iget-object v0, p0, Lo/ery$e$1;->c:Lo/ery$e;

    invoke-static {v0, p1}, Lo/ery$e;->d(Lo/ery$e;Landroid/text/Editable;)V

    .line 132
    iget-object v0, p0, Lo/ery$e$1;->c:Lo/ery$e;

    invoke-static {v0, p1}, Lo/ery$e;->a(Lo/ery$e;Landroid/text/Editable;)V

    .line 133
    return-void
.end method

.method public beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    .line 116
    return-void
.end method

.method public onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    .line 121
    return-void
.end method
