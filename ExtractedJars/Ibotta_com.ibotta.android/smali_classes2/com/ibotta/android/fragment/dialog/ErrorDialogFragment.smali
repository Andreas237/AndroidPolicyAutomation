.class public Lcom/ibotta/android/fragment/dialog/ErrorDialogFragment;
.super Lcom/ibotta/android/fragment/dialog/IbottaDialogFragment;
.source "ErrorDialogFragment.java"


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation


# static fields
.field public static final KEY_MESSAGE:Ljava/lang/String; = "message"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 13
    invoke-direct {p0}, Lcom/ibotta/android/fragment/dialog/IbottaDialogFragment;-><init>()V

    return-void
.end method

.method public static synthetic lambda$onCreateView$0(Lcom/ibotta/android/fragment/dialog/ErrorDialogFragment;Landroid/view/View;)V
    .locals 0

    .line 40
    invoke-virtual {p0}, Lcom/ibotta/android/fragment/dialog/ErrorDialogFragment;->dismiss()V

    return-void
.end method

.method public static newInstance(Ljava/lang/String;)Lcom/ibotta/android/fragment/dialog/ErrorDialogFragment;
    .locals 3

    .line 19
    new-instance v0, Lcom/ibotta/android/fragment/dialog/ErrorDialogFragment;

    invoke-direct {v0}, Lcom/ibotta/android/fragment/dialog/ErrorDialogFragment;-><init>()V

    .line 21
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    const-string v2, "message"

    .line 22
    invoke-virtual {v1, v2, p0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 23
    invoke-virtual {v0, v1}, Lcom/ibotta/android/fragment/dialog/ErrorDialogFragment;->setArguments(Landroid/os/Bundle;)V

    return-object v0
.end method


# virtual methods
.method public onCancel(Landroid/content/DialogInterface;)V
    .locals 0

    .line 49
    invoke-virtual {p0}, Lcom/ibotta/android/fragment/dialog/ErrorDialogFragment;->dismiss()V

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 0

    .line 30
    invoke-super {p0, p1}, Lcom/ibotta/android/fragment/dialog/IbottaDialogFragment;->onCreate(Landroid/os/Bundle;)V

    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 2

    const/4 p3, 0x0

    const v0, 0x7f0c00ec

    .line 35
    invoke-virtual {p1, v0, p2, p3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 36
    invoke-virtual {p0}, Lcom/ibotta/android/fragment/dialog/ErrorDialogFragment;->getArguments()Landroid/os/Bundle;

    move-result-object p2

    const-string v0, "message"

    invoke-virtual {p2, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    const v0, 0x7f0901d9

    .line 38
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/view/ErrorView;

    .line 39
    invoke-virtual {v0}, Lcom/ibotta/android/view/ErrorView;->getError()Landroid/widget/TextView;

    move-result-object v1

    invoke-virtual {v1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 40
    new-instance p2, Lcom/ibotta/android/fragment/dialog/-$$Lambda$ErrorDialogFragment$BF2urLqCNoxkKKe3i-zimnsDhsw;

    invoke-direct {p2, p0}, Lcom/ibotta/android/fragment/dialog/-$$Lambda$ErrorDialogFragment$BF2urLqCNoxkKKe3i-zimnsDhsw;-><init>(Lcom/ibotta/android/fragment/dialog/ErrorDialogFragment;)V

    instance-of v1, v0, Landroid/view/View;

    if-nez v1, :cond_0

    invoke-virtual {v0, p2}, Lcom/ibotta/android/view/ErrorView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    check-cast v0, Landroid/view/View;

    invoke-static {v0, p2}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 43
    :goto_0
    invoke-virtual {p0}, Lcom/ibotta/android/fragment/dialog/ErrorDialogFragment;->getDialog()Landroid/app/Dialog;

    move-result-object p2

    invoke-virtual {p2}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object p2

    new-instance v0, Landroid/graphics/drawable/ColorDrawable;

    invoke-direct {v0, p3}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {p2, v0}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    return-object p1
.end method
