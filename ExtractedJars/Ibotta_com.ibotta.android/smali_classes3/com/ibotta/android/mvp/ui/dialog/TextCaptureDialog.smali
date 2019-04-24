.class public Lcom/ibotta/android/mvp/ui/dialog/TextCaptureDialog;
.super Landroid/app/Dialog;
.source "TextCaptureDialog.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/mvp/ui/dialog/TextCaptureDialog$TextCaptureListener;
    }
.end annotation


# instance fields
.field protected etInput:Landroid/widget/EditText;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0901cb
    .end annotation
.end field

.field private textCaptureListener:Lcom/ibotta/android/mvp/ui/dialog/TextCaptureDialog$TextCaptureListener;

.field protected tvCancel:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090502
    .end annotation
.end field

.field protected tvInstructions:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090534
    .end annotation
.end field

.field protected tvSend:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090573
    .end annotation
.end field

.field protected tvShoppingTripId:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090575
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 42
    invoke-direct {p0, p1}, Landroid/app/Dialog;-><init>(Landroid/content/Context;)V

    .line 43
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/dialog/TextCaptureDialog;->initLayout()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;I)V
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # I
        .annotation build Landroid/support/annotation/StyleRes;
        .end annotation
    .end param

    .line 47
    invoke-direct {p0, p1, p2}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    .line 48
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/dialog/TextCaptureDialog;->initLayout()V

    return-void
.end method

.method protected constructor <init>(Landroid/content/Context;ZLandroid/content/DialogInterface$OnCancelListener;)V
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Landroid/content/DialogInterface$OnCancelListener;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 53
    invoke-direct {p0, p1, p2, p3}, Landroid/app/Dialog;-><init>(Landroid/content/Context;ZLandroid/content/DialogInterface$OnCancelListener;)V

    .line 54
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/dialog/TextCaptureDialog;->initLayout()V

    return-void
.end method

.method private initLayout()V
    .locals 3

    const/4 v0, 0x1

    .line 58
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/dialog/TextCaptureDialog;->requestWindowFeature(I)Z

    const v0, 0x7f0c01dc

    .line 59
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/dialog/TextCaptureDialog;->setContentView(I)V

    .line 60
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/app/Dialog;)Lbutterknife/Unbinder;

    .line 62
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/dialog/TextCaptureDialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 63
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/dialog/TextCaptureDialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/4 v1, -0x1

    const/4 v2, -0x2

    invoke-virtual {v0, v1, v2}, Landroid/view/Window;->setLayout(II)V

    .line 66
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/dialog/TextCaptureDialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/view/Window;->setSoftInputMode(I)V

    :cond_0
    return-void
.end method


# virtual methods
.method protected onCancel()V
    .locals 0
    .annotation runtime Lbutterknife/OnClick;
        value = {
            0x7f090502
        }
    .end annotation

    .line 114
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/dialog/TextCaptureDialog;->dismiss()V

    return-void
.end method

.method protected onSend()V
    .locals 3
    .annotation runtime Lbutterknife/OnClick;
        value = {
            0x7f090573
        }
    .end annotation

    .line 99
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 101
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/dialog/TextCaptureDialog;->tvShoppingTripId:Landroid/widget/TextView;

    invoke-virtual {v1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v1

    .line 102
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 104
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ": "

    .line 105
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    :cond_0
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/dialog/TextCaptureDialog;->etInput:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    .line 109
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/dialog/TextCaptureDialog;->textCaptureListener:Lcom/ibotta/android/mvp/ui/dialog/TextCaptureDialog$TextCaptureListener;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v0}, Lcom/ibotta/android/mvp/ui/dialog/TextCaptureDialog$TextCaptureListener;->onSend(Ljava/lang/String;)V

    return-void
.end method

.method public setCancelText(Ljava/lang/String;)V
    .locals 1

    .line 79
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/dialog/TextCaptureDialog;->tvCancel:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public setInstructionsTitle(Ljava/lang/String;)V
    .locals 1

    .line 71
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/dialog/TextCaptureDialog;->tvInstructions:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public setSendText(Ljava/lang/String;)V
    .locals 1

    .line 75
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/dialog/TextCaptureDialog;->tvSend:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public setShoppingTripId(Ljava/lang/String;)V
    .locals 4

    .line 83
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 84
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/dialog/TextCaptureDialog;->tvShoppingTripId:Landroid/widget/TextView;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0

    .line 86
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/dialog/TextCaptureDialog;->tvShoppingTripId:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 87
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/dialog/TextCaptureDialog;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v2, 0x7f1105d6

    const/4 v3, 0x1

    .line 88
    new-array v3, v3, [Ljava/lang/Object;

    aput-object p1, v3, v1

    invoke-virtual {v0, v2, v3}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    .line 89
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/dialog/TextCaptureDialog;->tvShoppingTripId:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :goto_0
    return-void
.end method

.method public setTextCaptureListener(Lcom/ibotta/android/mvp/ui/dialog/TextCaptureDialog$TextCaptureListener;)V
    .locals 0

    .line 94
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/dialog/TextCaptureDialog;->textCaptureListener:Lcom/ibotta/android/mvp/ui/dialog/TextCaptureDialog$TextCaptureListener;

    return-void
.end method
