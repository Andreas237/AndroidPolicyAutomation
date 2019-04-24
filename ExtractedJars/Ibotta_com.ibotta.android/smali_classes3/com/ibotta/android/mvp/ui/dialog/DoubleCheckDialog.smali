.class public Lcom/ibotta/android/mvp/ui/dialog/DoubleCheckDialog;
.super Landroid/support/design/widget/BottomSheetDialog;
.source "DoubleCheckDialog.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/mvp/ui/dialog/DoubleCheckDialog$DoubleCheckDialogListener;
    }
.end annotation


# instance fields
.field protected bCancel:Landroid/widget/Button;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f09007f
    .end annotation
.end field

.field protected bContinue:Landroid/widget/Button;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090084
    .end annotation
.end field

.field private doubleCheckDialogListener:Lcom/ibotta/android/mvp/ui/dialog/DoubleCheckDialog$DoubleCheckDialogListener;

.field protected tvCheckFullReceipt:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f09050a
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 34
    invoke-direct {p0, p1}, Landroid/support/design/widget/BottomSheetDialog;-><init>(Landroid/content/Context;)V

    .line 35
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/dialog/DoubleCheckDialog;->initLayout()V

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

    .line 39
    invoke-direct {p0, p1, p2}, Landroid/support/design/widget/BottomSheetDialog;-><init>(Landroid/content/Context;I)V

    .line 40
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/dialog/DoubleCheckDialog;->initLayout()V

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

    .line 45
    invoke-direct {p0, p1, p2, p3}, Landroid/support/design/widget/BottomSheetDialog;-><init>(Landroid/content/Context;ZLandroid/content/DialogInterface$OnCancelListener;)V

    .line 46
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/dialog/DoubleCheckDialog;->initLayout()V

    return-void
.end method

.method private initLayout()V
    .locals 1

    const v0, 0x7f0c0150

    .line 50
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/dialog/DoubleCheckDialog;->setContentView(I)V

    .line 51
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/app/Dialog;)Lbutterknife/Unbinder;

    return-void
.end method


# virtual methods
.method protected onCancelClicked()V
    .locals 0
    .annotation runtime Lbutterknife/OnClick;
        value = {
            0x7f09007f
        }
    .end annotation

    .line 65
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/dialog/DoubleCheckDialog;->dismiss()V

    return-void
.end method

.method protected onCloseClicked()V
    .locals 0
    .annotation runtime Lbutterknife/OnClick;
        value = {
            0x7f09029e
        }
    .end annotation

    .line 60
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/dialog/DoubleCheckDialog;->dismiss()V

    return-void
.end method

.method protected onContinue()V
    .locals 1
    .annotation runtime Lbutterknife/OnClick;
        value = {
            0x7f090084
        }
    .end annotation

    .line 70
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/dialog/DoubleCheckDialog;->doubleCheckDialogListener:Lcom/ibotta/android/mvp/ui/dialog/DoubleCheckDialog$DoubleCheckDialogListener;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/dialog/DoubleCheckDialog$DoubleCheckDialogListener;->onDoubleCheckContinue()V

    return-void
.end method

.method public setDoubleCheckDialogListener(Lcom/ibotta/android/mvp/ui/dialog/DoubleCheckDialog$DoubleCheckDialogListener;)V
    .locals 0

    .line 55
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/dialog/DoubleCheckDialog;->doubleCheckDialogListener:Lcom/ibotta/android/mvp/ui/dialog/DoubleCheckDialog$DoubleCheckDialogListener;

    return-void
.end method
