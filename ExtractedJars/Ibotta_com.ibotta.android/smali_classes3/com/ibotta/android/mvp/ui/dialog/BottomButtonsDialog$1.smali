.class Lcom/ibotta/android/mvp/ui/dialog/BottomButtonsDialog$1;
.super Ljava/lang/Object;
.source "BottomButtonsDialog.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/mvp/ui/dialog/BottomButtonsDialog;->createOptionView(Landroid/widget/Button;Lcom/ibotta/android/mvp/ui/dialog/BottomButtonsDialog$BottomButtonDialogOptions;)Landroid/widget/Button;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/mvp/ui/dialog/BottomButtonsDialog;

.field final synthetic val$option:Lcom/ibotta/android/mvp/ui/dialog/BottomButtonsDialog$BottomButtonDialogOptions;


# direct methods
.method constructor <init>(Lcom/ibotta/android/mvp/ui/dialog/BottomButtonsDialog;Lcom/ibotta/android/mvp/ui/dialog/BottomButtonsDialog$BottomButtonDialogOptions;)V
    .locals 0

    .line 94
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/dialog/BottomButtonsDialog$1;->this$0:Lcom/ibotta/android/mvp/ui/dialog/BottomButtonsDialog;

    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/dialog/BottomButtonsDialog$1;->val$option:Lcom/ibotta/android/mvp/ui/dialog/BottomButtonsDialog$BottomButtonDialogOptions;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 97
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/dialog/BottomButtonsDialog$1;->this$0:Lcom/ibotta/android/mvp/ui/dialog/BottomButtonsDialog;

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/dialog/BottomButtonsDialog$1;->val$option:Lcom/ibotta/android/mvp/ui/dialog/BottomButtonsDialog$BottomButtonDialogOptions;

    invoke-static {p1, v0}, Lcom/ibotta/android/mvp/ui/dialog/BottomButtonsDialog;->access$000(Lcom/ibotta/android/mvp/ui/dialog/BottomButtonsDialog;Lcom/ibotta/android/mvp/ui/dialog/BottomButtonsDialog$BottomButtonDialogOptions;)V

    return-void
.end method
