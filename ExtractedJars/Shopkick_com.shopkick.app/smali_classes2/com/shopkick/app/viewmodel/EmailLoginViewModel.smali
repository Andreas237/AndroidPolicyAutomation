.class public Lcom/shopkick/app/viewmodel/EmailLoginViewModel;
.super Landroid/databinding/BaseObservable;
.source "EmailLoginViewModel.java"


# instance fields
.field private emailLoginModel:Lcom/shopkick/app/model/EmailLoginModel;

.field private final errorText:Landroid/databinding/ObservableInt;

.field public showError:Z
    .annotation runtime Landroid/databinding/Bindable;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 37
    invoke-direct {p0}, Landroid/databinding/BaseObservable;-><init>()V

    const/4 v0, 0x0

    .line 22
    iput-boolean v0, p0, Lcom/shopkick/app/viewmodel/EmailLoginViewModel;->showError:Z

    .line 27
    new-instance v0, Landroid/databinding/ObservableInt;

    const v1, 0x7f110292

    invoke-direct {v0, v1}, Landroid/databinding/ObservableInt;-><init>(I)V

    iput-object v0, p0, Lcom/shopkick/app/viewmodel/EmailLoginViewModel;->errorText:Landroid/databinding/ObservableInt;

    .line 38
    new-instance v0, Lcom/shopkick/app/model/EmailLoginModel;

    const-string v1, ""

    const-string v2, ""

    invoke-direct {v0, v1, v2}, Lcom/shopkick/app/model/EmailLoginModel;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/shopkick/app/viewmodel/EmailLoginViewModel;->emailLoginModel:Lcom/shopkick/app/model/EmailLoginModel;

    return-void
.end method

.method public static emailValidator(Lcom/shopkick/app/widget/AuthV3EditText;Ljava/lang/String;)V
    .locals 0
    .annotation build Landroid/databinding/BindingAdapter;
        value = {
            "emailValidator"
        }
    .end annotation

    .line 43
    new-instance p1, Lcom/shopkick/app/viewmodel/EmailLoginViewModel$1;

    invoke-direct {p1, p0}, Lcom/shopkick/app/viewmodel/EmailLoginViewModel$1;-><init>(Lcom/shopkick/app/widget/AuthV3EditText;)V

    invoke-virtual {p0, p1}, Lcom/shopkick/app/widget/AuthV3EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    return-void
.end method

.method public static passwordValidator(Lcom/shopkick/app/widget/AuthV3EditText;Ljava/lang/String;)V
    .locals 0
    .annotation build Landroid/databinding/BindingAdapter;
        value = {
            "passwordValidator"
        }
    .end annotation

    .line 67
    new-instance p1, Lcom/shopkick/app/viewmodel/EmailLoginViewModel$2;

    invoke-direct {p1, p0}, Lcom/shopkick/app/viewmodel/EmailLoginViewModel$2;-><init>(Lcom/shopkick/app/widget/AuthV3EditText;)V

    invoke-virtual {p0, p1}, Lcom/shopkick/app/widget/AuthV3EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    return-void
.end method


# virtual methods
.method public getEmailLoginModel()Lcom/shopkick/app/model/EmailLoginModel;
    .locals 1

    .line 30
    iget-object v0, p0, Lcom/shopkick/app/viewmodel/EmailLoginViewModel;->emailLoginModel:Lcom/shopkick/app/model/EmailLoginModel;

    return-object v0
.end method

.method public getErrorText()Landroid/databinding/ObservableInt;
    .locals 1

    .line 95
    iget-object v0, p0, Lcom/shopkick/app/viewmodel/EmailLoginViewModel;->errorText:Landroid/databinding/ObservableInt;

    return-object v0
.end method

.method public isShowError()Z
    .locals 1

    .line 91
    iget-boolean v0, p0, Lcom/shopkick/app/viewmodel/EmailLoginViewModel;->showError:Z

    return v0
.end method

.method public setEmailLoginModel(Lcom/shopkick/app/model/EmailLoginModel;)V
    .locals 0

    .line 34
    iput-object p1, p0, Lcom/shopkick/app/viewmodel/EmailLoginViewModel;->emailLoginModel:Lcom/shopkick/app/model/EmailLoginModel;

    return-void
.end method

.method public setShowError(Z)V
    .locals 0

    .line 99
    iput-boolean p1, p0, Lcom/shopkick/app/viewmodel/EmailLoginViewModel;->showError:Z

    return-void
.end method
