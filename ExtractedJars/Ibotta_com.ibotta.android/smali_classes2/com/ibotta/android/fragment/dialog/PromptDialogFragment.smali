.class public Lcom/ibotta/android/fragment/dialog/PromptDialogFragment;
.super Lcom/ibotta/android/fragment/dialog/IbottaDialogFragment;
.source "PromptDialogFragment.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/fragment/dialog/PromptDialogFragment$PromptDialogListener;
    }
.end annotation


# static fields
.field private static final KEY_ACTIONS:Ljava/lang/String; = "actions"

.field private static final KEY_INPUT_TYPE:Ljava/lang/String; = "input_type"

.field private static final KEY_MESSAGE:Ljava/lang/String; = "message"

.field private static final KEY_TITLE:Ljava/lang/String; = "title"


# instance fields
.field protected actions:[I
    .annotation build Landroid/support/annotation/StringRes;
    .end annotation
.end field

.field protected dismissing:Z

.field protected inputType:I

.field protected message:Ljava/lang/String;

.field protected title:Ljava/lang/String;

.field titleBarReducer:Lcom/ibotta/android/title/TitleBarReducer;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 34
    invoke-direct {p0}, Lcom/ibotta/android/fragment/dialog/IbottaDialogFragment;-><init>()V

    .line 35
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/App;->getMainComponent()Lcom/ibotta/android/di/MainComponent;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/ibotta/android/di/MainComponent;->inject(Lcom/ibotta/android/fragment/dialog/PromptDialogFragment;)V

    return-void
.end method

.method public static varargs buildArgs(Ljava/lang/String;Ljava/lang/String;[I)Landroid/os/Bundle;
    .locals 2
    .param p2    # [I
        .annotation build Landroid/support/annotation/StringRes;
        .end annotation
    .end param

    .line 62
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "title"

    .line 63
    invoke-virtual {v0, v1, p0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p0, "message"

    .line 64
    invoke-virtual {v0, p0, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p0, "actions"

    .line 65
    invoke-virtual {v0, p0, p2}, Landroid/os/Bundle;->putIntArray(Ljava/lang/String;[I)V

    return-object v0
.end method

.method public static varargs buildInputArgs(Ljava/lang/String;Ljava/lang/String;I[I)Landroid/os/Bundle;
    .locals 2
    .param p3    # [I
        .annotation build Landroid/support/annotation/StringRes;
        .end annotation
    .end param

    .line 70
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "title"

    .line 71
    invoke-virtual {v0, v1, p0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p0, "message"

    .line 72
    invoke-virtual {v0, p0, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p0, "input_type"

    .line 73
    invoke-virtual {v0, p0, p2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string p0, "actions"

    .line 74
    invoke-virtual {v0, p0, p3}, Landroid/os/Bundle;->putIntArray(Ljava/lang/String;[I)V

    return-object v0
.end method

.method public static synthetic lambda$onCreateView$0(Lcom/ibotta/android/fragment/dialog/PromptDialogFragment;ILcom/ibotta/android/view/PromptView;Landroid/view/View;)V
    .locals 0

    .line 106
    invoke-virtual {p2}, Lcom/ibotta/android/view/PromptView;->getInput()Landroid/widget/EditText;

    move-result-object p2

    invoke-virtual {p2}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/fragment/dialog/PromptDialogFragment;->onChoice(ILjava/lang/String;)V

    return-void
.end method

.method public static varargs newInputInstance(Ljava/lang/String;Ljava/lang/String;I[I)Lcom/ibotta/android/fragment/dialog/PromptDialogFragment;
    .locals 1
    .param p3    # [I
        .annotation build Landroid/support/annotation/StringRes;
        .end annotation
    .end param

    .line 56
    new-instance v0, Lcom/ibotta/android/fragment/dialog/PromptDialogFragment;

    invoke-direct {v0}, Lcom/ibotta/android/fragment/dialog/PromptDialogFragment;-><init>()V

    .line 57
    invoke-static {p0, p1, p2, p3}, Lcom/ibotta/android/fragment/dialog/PromptDialogFragment;->buildInputArgs(Ljava/lang/String;Ljava/lang/String;I[I)Landroid/os/Bundle;

    move-result-object p0

    invoke-virtual {v0, p0}, Lcom/ibotta/android/fragment/dialog/PromptDialogFragment;->setArguments(Landroid/os/Bundle;)V

    return-object v0
.end method

.method public static varargs newInstance(Ljava/lang/String;Ljava/lang/String;[I)Lcom/ibotta/android/fragment/dialog/PromptDialogFragment;
    .locals 1
    .param p2    # [I
        .annotation build Landroid/support/annotation/StringRes;
        .end annotation
    .end param

    .line 46
    new-instance v0, Lcom/ibotta/android/fragment/dialog/PromptDialogFragment;

    invoke-direct {v0}, Lcom/ibotta/android/fragment/dialog/PromptDialogFragment;-><init>()V

    .line 47
    invoke-static {p0, p1, p2}, Lcom/ibotta/android/fragment/dialog/PromptDialogFragment;->buildArgs(Ljava/lang/String;Ljava/lang/String;[I)Landroid/os/Bundle;

    move-result-object p0

    invoke-virtual {v0, p0}, Lcom/ibotta/android/fragment/dialog/PromptDialogFragment;->setArguments(Landroid/os/Bundle;)V

    return-object v0
.end method


# virtual methods
.method public isDismissing()Z
    .locals 1

    .line 155
    iget-boolean v0, p0, Lcom/ibotta/android/fragment/dialog/PromptDialogFragment;->dismissing:Z

    return v0
.end method

.method protected loadState(Landroid/os/Bundle;)Z
    .locals 2

    const/4 v0, -0x1

    if-eqz p1, :cond_0

    const-string v1, "title"

    .line 115
    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/ibotta/android/fragment/dialog/PromptDialogFragment;->title:Ljava/lang/String;

    const-string v1, "message"

    .line 116
    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/ibotta/android/fragment/dialog/PromptDialogFragment;->message:Ljava/lang/String;

    const-string v1, "input_type"

    .line 117
    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/ibotta/android/fragment/dialog/PromptDialogFragment;->inputType:I

    const-string v0, "actions"

    .line 118
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getIntArray(Ljava/lang/String;)[I

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/fragment/dialog/PromptDialogFragment;->actions:[I

    goto :goto_0

    .line 119
    :cond_0
    invoke-virtual {p0}, Lcom/ibotta/android/fragment/dialog/PromptDialogFragment;->getArguments()Landroid/os/Bundle;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 120
    invoke-virtual {p0}, Lcom/ibotta/android/fragment/dialog/PromptDialogFragment;->getArguments()Landroid/os/Bundle;

    move-result-object p1

    const-string v1, "title"

    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/fragment/dialog/PromptDialogFragment;->title:Ljava/lang/String;

    .line 121
    invoke-virtual {p0}, Lcom/ibotta/android/fragment/dialog/PromptDialogFragment;->getArguments()Landroid/os/Bundle;

    move-result-object p1

    const-string v1, "message"

    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/fragment/dialog/PromptDialogFragment;->message:Ljava/lang/String;

    .line 122
    invoke-virtual {p0}, Lcom/ibotta/android/fragment/dialog/PromptDialogFragment;->getArguments()Landroid/os/Bundle;

    move-result-object p1

    const-string v1, "input_type"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result p1

    iput p1, p0, Lcom/ibotta/android/fragment/dialog/PromptDialogFragment;->inputType:I

    .line 123
    invoke-virtual {p0}, Lcom/ibotta/android/fragment/dialog/PromptDialogFragment;->getArguments()Landroid/os/Bundle;

    move-result-object p1

    const-string v0, "actions"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getIntArray(Ljava/lang/String;)[I

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/fragment/dialog/PromptDialogFragment;->actions:[I

    .line 126
    :cond_1
    :goto_0
    iget-object p1, p0, Lcom/ibotta/android/fragment/dialog/PromptDialogFragment;->message:Ljava/lang/String;

    if-eqz p1, :cond_2

    iget-object p1, p0, Lcom/ibotta/android/fragment/dialog/PromptDialogFragment;->actions:[I

    if-eqz p1, :cond_2

    const/4 p1, 0x1

    goto :goto_1

    :cond_2
    const/4 p1, 0x0

    :goto_1
    return p1
.end method

.method protected onChoice(ILjava/lang/String;)V
    .locals 2

    .line 139
    iget-object v0, p0, Lcom/ibotta/android/fragment/dialog/PromptDialogFragment;->listener:Lcom/ibotta/android/fragment/dialog/IbottaDialogFragment$IbottaDialogFragmentListener;

    instance-of v0, v0, Lcom/ibotta/android/fragment/dialog/PromptDialogFragment$PromptDialogListener;

    if-eqz v0, :cond_0

    .line 140
    iget-object v0, p0, Lcom/ibotta/android/fragment/dialog/PromptDialogFragment;->listener:Lcom/ibotta/android/fragment/dialog/IbottaDialogFragment$IbottaDialogFragmentListener;

    check-cast v0, Lcom/ibotta/android/fragment/dialog/PromptDialogFragment$PromptDialogListener;

    invoke-virtual {p0}, Lcom/ibotta/android/fragment/dialog/PromptDialogFragment;->getTag()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, p1, p2}, Lcom/ibotta/android/fragment/dialog/PromptDialogFragment$PromptDialogListener;->onChoice(Ljava/lang/String;ILjava/lang/String;)V

    .line 142
    :cond_0
    iget-boolean p1, p0, Lcom/ibotta/android/fragment/dialog/PromptDialogFragment;->dismissing:Z

    if-nez p1, :cond_1

    .line 143
    invoke-virtual {p0}, Lcom/ibotta/android/fragment/dialog/PromptDialogFragment;->dismissAllowingStateLoss()V

    :cond_1
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 80
    invoke-super {p0, p1}, Lcom/ibotta/android/fragment/dialog/IbottaDialogFragment;->onCreate(Landroid/os/Bundle;)V

    const/4 p1, 0x2

    const v0, 0x1030009

    .line 81
    invoke-virtual {p0, p1, v0}, Lcom/ibotta/android/fragment/dialog/PromptDialogFragment;->setStyle(II)V

    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 5

    const/4 v0, 0x0

    const v1, 0x7f0c00f2

    .line 86
    invoke-virtual {p1, v1, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 88
    invoke-virtual {p0, p3}, Lcom/ibotta/android/fragment/dialog/PromptDialogFragment;->loadState(Landroid/os/Bundle;)Z

    move-result p2

    if-nez p2, :cond_0

    .line 90
    invoke-virtual {p0}, Lcom/ibotta/android/fragment/dialog/PromptDialogFragment;->dismissAllowingStateLoss()V

    return-object p1

    :cond_0
    const p2, 0x7f0903bf

    .line 94
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Lcom/ibotta/android/view/PromptView;

    .line 95
    invoke-virtual {p2}, Lcom/ibotta/android/view/PromptView;->getTitle()Lcom/ibotta/android/views/base/title/TitleBarView;

    move-result-object p3

    iget-object v1, p0, Lcom/ibotta/android/fragment/dialog/PromptDialogFragment;->titleBarReducer:Lcom/ibotta/android/title/TitleBarReducer;

    iget-object v2, p0, Lcom/ibotta/android/fragment/dialog/PromptDialogFragment;->title:Ljava/lang/String;

    invoke-static {v2}, Lcom/ibotta/android/views/generic/ResValueKt;->createResValue(Ljava/lang/String;)Lcom/ibotta/android/views/generic/ResValue;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/ibotta/android/title/TitleBarReducer;->create(Lcom/ibotta/android/views/generic/ResValue;)Lcom/ibotta/android/views/base/title/TitleBarViewState;

    move-result-object v1

    invoke-virtual {p3, v1}, Lcom/ibotta/android/views/base/title/TitleBarView;->updateViewState(Lcom/ibotta/android/views/base/title/TitleBarViewState;)V

    .line 96
    invoke-virtual {p2}, Lcom/ibotta/android/view/PromptView;->getMessage()Landroid/widget/TextView;

    move-result-object p3

    iget-object v1, p0, Lcom/ibotta/android/fragment/dialog/PromptDialogFragment;->message:Ljava/lang/String;

    invoke-virtual {p3, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 98
    iget p3, p0, Lcom/ibotta/android/fragment/dialog/PromptDialogFragment;->inputType:I

    const/4 v1, -0x1

    if-eq p3, v1, :cond_1

    .line 99
    invoke-virtual {p2}, Lcom/ibotta/android/view/PromptView;->getInput()Landroid/widget/EditText;

    move-result-object p3

    iget v1, p0, Lcom/ibotta/android/fragment/dialog/PromptDialogFragment;->inputType:I

    invoke-virtual {p3, v1}, Landroid/widget/EditText;->setInputType(I)V

    .line 100
    invoke-virtual {p2}, Lcom/ibotta/android/view/PromptView;->getInput()Landroid/widget/EditText;

    move-result-object p3

    invoke-virtual {p3, v0}, Landroid/widget/EditText;->setVisibility(I)V

    goto :goto_0

    .line 102
    :cond_1
    invoke-virtual {p2}, Lcom/ibotta/android/view/PromptView;->getInput()Landroid/widget/EditText;

    move-result-object p3

    const/16 v1, 0x8

    invoke-virtual {p3, v1}, Landroid/widget/EditText;->setVisibility(I)V

    .line 105
    :goto_0
    iget-object p3, p0, Lcom/ibotta/android/fragment/dialog/PromptDialogFragment;->actions:[I

    array-length v1, p3

    const/4 v2, 0x0

    :goto_1
    if-ge v2, v1, :cond_2

    aget v3, p3, v2

    .line 106
    new-instance v4, Lcom/ibotta/android/fragment/dialog/-$$Lambda$PromptDialogFragment$xcHr9BRD1Mm02HkJRkO14DPsLyQ;

    invoke-direct {v4, p0, v3, p2}, Lcom/ibotta/android/fragment/dialog/-$$Lambda$PromptDialogFragment$xcHr9BRD1Mm02HkJRkO14DPsLyQ;-><init>(Lcom/ibotta/android/fragment/dialog/PromptDialogFragment;ILcom/ibotta/android/view/PromptView;)V

    invoke-virtual {p2, v3, v4}, Lcom/ibotta/android/view/PromptView;->addButton(ILandroid/view/View$OnClickListener;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 109
    :cond_2
    invoke-virtual {p0}, Lcom/ibotta/android/fragment/dialog/PromptDialogFragment;->getDialog()Landroid/app/Dialog;

    move-result-object p2

    invoke-virtual {p2}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object p2

    new-instance p3, Landroid/graphics/drawable/ColorDrawable;

    invoke-direct {p3, v0}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {p2, p3}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    return-object p1
.end method

.method public onDismiss(Landroid/content/DialogInterface;)V
    .locals 1

    .line 149
    invoke-super {p0, p1}, Lcom/ibotta/android/fragment/dialog/IbottaDialogFragment;->onDismiss(Landroid/content/DialogInterface;)V

    const/4 p1, 0x1

    .line 150
    iput-boolean p1, p0, Lcom/ibotta/android/fragment/dialog/PromptDialogFragment;->dismissing:Z

    const/4 p1, 0x0

    const/4 v0, 0x0

    .line 151
    invoke-virtual {p0, p1, v0}, Lcom/ibotta/android/fragment/dialog/PromptDialogFragment;->onChoice(ILjava/lang/String;)V

    return-void
.end method

.method public onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2

    .line 131
    invoke-super {p0, p1}, Lcom/ibotta/android/fragment/dialog/IbottaDialogFragment;->onSaveInstanceState(Landroid/os/Bundle;)V

    const-string v0, "title"

    .line 132
    iget-object v1, p0, Lcom/ibotta/android/fragment/dialog/PromptDialogFragment;->title:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "message"

    .line 133
    iget-object v1, p0, Lcom/ibotta/android/fragment/dialog/PromptDialogFragment;->message:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "input_type"

    .line 134
    iget v1, p0, Lcom/ibotta/android/fragment/dialog/PromptDialogFragment;->inputType:I

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v0, "actions"

    .line 135
    iget-object v1, p0, Lcom/ibotta/android/fragment/dialog/PromptDialogFragment;->actions:[I

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putIntArray(Ljava/lang/String;[I)V

    return-void
.end method
