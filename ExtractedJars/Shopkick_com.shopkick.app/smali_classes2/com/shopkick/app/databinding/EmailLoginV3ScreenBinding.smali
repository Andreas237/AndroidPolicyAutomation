.class public abstract Lcom/shopkick/app/databinding/EmailLoginV3ScreenBinding;
.super Landroid/databinding/ViewDataBinding;
.source "EmailLoginV3ScreenBinding.java"


# instance fields
.field public final email:Lcom/shopkick/app/widget/AuthV3EditText;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field public final errorBox:Lcom/shopkick/app/widget/AuthV3ErrorBox;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field public final forgotPassword:Lcom/shopkick/app/widget/SKButton;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field public final login:Lcom/shopkick/app/widget/SKButton;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field protected mEmailViewModel:Lcom/shopkick/app/viewmodel/EmailLoginViewModel;
    .annotation runtime Landroid/databinding/Bindable;
    .end annotation
.end field

.field public final password:Lcom/shopkick/app/widget/AuthV3EditText;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field public final wrapper:Landroid/widget/RelativeLayout;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method protected constructor <init>(Landroid/databinding/DataBindingComponent;Landroid/view/View;ILcom/shopkick/app/widget/AuthV3EditText;Lcom/shopkick/app/widget/AuthV3ErrorBox;Lcom/shopkick/app/widget/SKButton;Lcom/shopkick/app/widget/SKButton;Lcom/shopkick/app/widget/AuthV3EditText;Landroid/widget/RelativeLayout;)V
    .locals 0

    .line 43
    invoke-direct {p0, p1, p2, p3}, Landroid/databinding/ViewDataBinding;-><init>(Landroid/databinding/DataBindingComponent;Landroid/view/View;I)V

    .line 44
    iput-object p4, p0, Lcom/shopkick/app/databinding/EmailLoginV3ScreenBinding;->email:Lcom/shopkick/app/widget/AuthV3EditText;

    .line 45
    iput-object p5, p0, Lcom/shopkick/app/databinding/EmailLoginV3ScreenBinding;->errorBox:Lcom/shopkick/app/widget/AuthV3ErrorBox;

    .line 46
    iput-object p6, p0, Lcom/shopkick/app/databinding/EmailLoginV3ScreenBinding;->forgotPassword:Lcom/shopkick/app/widget/SKButton;

    .line 47
    iput-object p7, p0, Lcom/shopkick/app/databinding/EmailLoginV3ScreenBinding;->login:Lcom/shopkick/app/widget/SKButton;

    .line 48
    iput-object p8, p0, Lcom/shopkick/app/databinding/EmailLoginV3ScreenBinding;->password:Lcom/shopkick/app/widget/AuthV3EditText;

    .line 49
    iput-object p9, p0, Lcom/shopkick/app/databinding/EmailLoginV3ScreenBinding;->wrapper:Landroid/widget/RelativeLayout;

    return-void
.end method

.method public static bind(Landroid/view/View;)Lcom/shopkick/app/databinding/EmailLoginV3ScreenBinding;
    .locals 1
    .param p0    # Landroid/view/View;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 83
    invoke-static {}, Landroid/databinding/DataBindingUtil;->getDefaultComponent()Landroid/databinding/DataBindingComponent;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/shopkick/app/databinding/EmailLoginV3ScreenBinding;->bind(Landroid/view/View;Landroid/databinding/DataBindingComponent;)Lcom/shopkick/app/databinding/EmailLoginV3ScreenBinding;

    move-result-object p0

    return-object p0
.end method

.method public static bind(Landroid/view/View;Landroid/databinding/DataBindingComponent;)Lcom/shopkick/app/databinding/EmailLoginV3ScreenBinding;
    .locals 1
    .param p0    # Landroid/view/View;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # Landroid/databinding/DataBindingComponent;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    const v0, 0x7f0c00aa

    .line 88
    invoke-static {p1, p0, v0}, Lcom/shopkick/app/databinding/EmailLoginV3ScreenBinding;->bind(Landroid/databinding/DataBindingComponent;Landroid/view/View;I)Landroid/databinding/ViewDataBinding;

    move-result-object p0

    check-cast p0, Lcom/shopkick/app/databinding/EmailLoginV3ScreenBinding;

    return-object p0
.end method

.method public static inflate(Landroid/view/LayoutInflater;)Lcom/shopkick/app/databinding/EmailLoginV3ScreenBinding;
    .locals 1
    .param p0    # Landroid/view/LayoutInflater;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 73
    invoke-static {}, Landroid/databinding/DataBindingUtil;->getDefaultComponent()Landroid/databinding/DataBindingComponent;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/shopkick/app/databinding/EmailLoginV3ScreenBinding;->inflate(Landroid/view/LayoutInflater;Landroid/databinding/DataBindingComponent;)Lcom/shopkick/app/databinding/EmailLoginV3ScreenBinding;

    move-result-object p0

    return-object p0
.end method

.method public static inflate(Landroid/view/LayoutInflater;Landroid/databinding/DataBindingComponent;)Lcom/shopkick/app/databinding/EmailLoginV3ScreenBinding;
    .locals 3
    .param p0    # Landroid/view/LayoutInflater;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # Landroid/databinding/DataBindingComponent;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    const v0, 0x7f0c00aa

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 79
    invoke-static {p0, v0, v1, v2, p1}, Landroid/databinding/DataBindingUtil;->inflate(Landroid/view/LayoutInflater;ILandroid/view/ViewGroup;ZLandroid/databinding/DataBindingComponent;)Landroid/databinding/ViewDataBinding;

    move-result-object p0

    check-cast p0, Lcom/shopkick/app/databinding/EmailLoginV3ScreenBinding;

    return-object p0
.end method

.method public static inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/shopkick/app/databinding/EmailLoginV3ScreenBinding;
    .locals 1
    .param p0    # Landroid/view/LayoutInflater;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # Landroid/view/ViewGroup;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 62
    invoke-static {}, Landroid/databinding/DataBindingUtil;->getDefaultComponent()Landroid/databinding/DataBindingComponent;

    move-result-object v0

    invoke-static {p0, p1, p2, v0}, Lcom/shopkick/app/databinding/EmailLoginV3ScreenBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ZLandroid/databinding/DataBindingComponent;)Lcom/shopkick/app/databinding/EmailLoginV3ScreenBinding;

    move-result-object p0

    return-object p0
.end method

.method public static inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ZLandroid/databinding/DataBindingComponent;)Lcom/shopkick/app/databinding/EmailLoginV3ScreenBinding;
    .locals 1
    .param p0    # Landroid/view/LayoutInflater;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # Landroid/view/ViewGroup;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p3    # Landroid/databinding/DataBindingComponent;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    const v0, 0x7f0c00aa

    .line 68
    invoke-static {p0, v0, p1, p2, p3}, Landroid/databinding/DataBindingUtil;->inflate(Landroid/view/LayoutInflater;ILandroid/view/ViewGroup;ZLandroid/databinding/DataBindingComponent;)Landroid/databinding/ViewDataBinding;

    move-result-object p0

    check-cast p0, Lcom/shopkick/app/databinding/EmailLoginV3ScreenBinding;

    return-object p0
.end method


# virtual methods
.method public getEmailViewModel()Lcom/shopkick/app/viewmodel/EmailLoginViewModel;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 56
    iget-object v0, p0, Lcom/shopkick/app/databinding/EmailLoginV3ScreenBinding;->mEmailViewModel:Lcom/shopkick/app/viewmodel/EmailLoginViewModel;

    return-object v0
.end method

.method public abstract setEmailViewModel(Lcom/shopkick/app/viewmodel/EmailLoginViewModel;)V
    .param p1    # Lcom/shopkick/app/viewmodel/EmailLoginViewModel;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
.end method
