.class Lo/bws$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Landroid/widget/TextView$OnEditorActionListener;
.implements Landroid/text/TextWatcher;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/bws;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# instance fields
.field private d:Lo/bws$b;

.field private e:Lo/bws;


# direct methods
.method public constructor <init>(Lo/bws;)V
    .locals 0

    .line 95
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 96
    iput-object p1, p0, Lo/bws$a;->e:Lo/bws;

    .line 97
    return-void
.end method


# virtual methods
.method public afterTextChanged(Landroid/text/Editable;)V
    .locals 4

    .line 123
    const-string v0, "FitSearchFragmentBar"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "afterTextChanged"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 124
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lo/bws$a;->e(Ljava/lang/String;)Z

    .line 125
    return-void
.end method

.method public beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 4

    .line 113
    const-string v0, "FitSearchFragmentBar"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "beforeTextChanged"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 114
    return-void
.end method

.method public d(Lo/bws$b;)V
    .locals 0

    .line 100
    iput-object p1, p0, Lo/bws$a;->d:Lo/bws$b;

    .line 101
    return-void
.end method

.method public d(Ljava/lang/String;)Z
    .locals 3

    .line 141
    iget-object v0, p0, Lo/bws$a;->e:Lo/bws;

    invoke-virtual {v0}, Lo/bws;->getActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "input_method"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/view/inputmethod/InputMethodManager;

    .line 142
    if-eqz v2, :cond_0

    .line 143
    iget-object v0, p0, Lo/bws$a;->e:Lo/bws;

    invoke-virtual {v0}, Lo/bws;->getActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    .line 145
    :cond_0
    iget-object v0, p0, Lo/bws$a;->d:Lo/bws$b;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 146
    iget-object v0, p0, Lo/bws$a;->d:Lo/bws$b;

    invoke-interface {v0, p1}, Lo/bws$b;->a(Ljava/lang/String;)Z

    move-result v0

    return v0

    .line 148
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public e(Ljava/lang/String;)Z
    .locals 2

    .line 153
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 154
    iget-object v0, p0, Lo/bws$a;->e:Lo/bws;

    invoke-static {v0}, Lo/bws;->a(Lo/bws;)Landroid/widget/ImageView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_0

    .line 156
    :cond_0
    iget-object v0, p0, Lo/bws$a;->e:Lo/bws;

    invoke-static {v0}, Lo/bws;->a(Lo/bws;)Landroid/widget/ImageView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 159
    :goto_0
    iget-object v0, p0, Lo/bws$a;->d:Lo/bws$b;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 160
    iget-object v0, p0, Lo/bws$a;->d:Lo/bws$b;

    invoke-interface {v0, p1}, Lo/bws$b;->b(Ljava/lang/String;)Z

    move-result v0

    return v0

    .line 162
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 129
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v2

    .line 130
    sget v0, Lcom/huawei/health/suggestion/R$id;->back_imageView:I

    if-ne v2, v0, :cond_0

    .line 131
    iget-object v0, p0, Lo/bws$a;->e:Lo/bws;

    invoke-virtual {v0}, Lo/bws;->getActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    goto :goto_0

    .line 132
    :cond_0
    sget v0, Lcom/huawei/health/suggestion/R$id;->search_cancel_imageView:I

    if-ne v2, v0, :cond_1

    .line 133
    iget-object v0, p0, Lo/bws$a;->e:Lo/bws;

    invoke-static {v0}, Lo/bws;->c(Lo/bws;)Landroid/widget/EditText;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 134
    :cond_1
    sget v0, Lcom/huawei/health/suggestion/R$id;->search_ok_imageView:I

    if-ne v2, v0, :cond_2

    .line 135
    iget-object v0, p0, Lo/bws$a;->e:Lo/bws;

    invoke-static {v0}, Lo/bws;->c(Lo/bws;)Landroid/widget/EditText;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    .line 136
    invoke-virtual {p0, v3}, Lo/bws$a;->d(Ljava/lang/String;)Z

    .line 138
    :cond_2
    :goto_0
    return-void
.end method

.method public onEditorAction(Landroid/widget/TextView;ILandroid/view/KeyEvent;)Z
    .locals 1

    .line 105
    const/4 v0, 0x3

    if-ne p2, v0, :cond_0

    .line 106
    invoke-virtual {p1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lo/bws$a;->d(Ljava/lang/String;)Z

    .line 108
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 4

    .line 118
    const-string v0, "FitSearchFragmentBar"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onTextChanged"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 119
    return-void
.end method
