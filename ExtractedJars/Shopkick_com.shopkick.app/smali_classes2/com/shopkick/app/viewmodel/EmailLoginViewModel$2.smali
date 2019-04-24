.class final Lcom/shopkick/app/viewmodel/EmailLoginViewModel$2;
.super Ljava/lang/Object;
.source "EmailLoginViewModel.java"

# interfaces
.implements Landroid/text/TextWatcher;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/viewmodel/EmailLoginViewModel;->passwordValidator(Lcom/shopkick/app/widget/AuthV3EditText;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic val$editText:Lcom/shopkick/app/widget/AuthV3EditText;


# direct methods
.method constructor <init>(Lcom/shopkick/app/widget/AuthV3EditText;)V
    .locals 0

    .line 67
    iput-object p1, p0, Lcom/shopkick/app/viewmodel/EmailLoginViewModel$2;->val$editText:Lcom/shopkick/app/widget/AuthV3EditText;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public afterTextChanged(Landroid/text/Editable;)V
    .locals 0

    .line 80
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 81
    iget-object p1, p0, Lcom/shopkick/app/viewmodel/EmailLoginViewModel$2;->val$editText:Lcom/shopkick/app/widget/AuthV3EditText;

    invoke-virtual {p1}, Lcom/shopkick/app/widget/AuthV3EditText;->markError()V

    goto :goto_0

    .line 83
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/viewmodel/EmailLoginViewModel$2;->val$editText:Lcom/shopkick/app/widget/AuthV3EditText;

    invoke-virtual {p1}, Lcom/shopkick/app/widget/AuthV3EditText;->markNoError()V

    :goto_0
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
