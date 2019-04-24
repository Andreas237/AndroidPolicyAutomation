.class public Lcom/ibotta/android/mvp/ui/dialog/BottomButtonsDialog$BottomButtonDialogOptions;
.super Ljava/lang/Object;
.source "BottomButtonsDialog.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/mvp/ui/dialog/BottomButtonsDialog;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "BottomButtonDialogOptions"
.end annotation


# instance fields
.field private buttonText:Ljava/lang/String;

.field private id:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getButtonText()Ljava/lang/String;
    .locals 1

    .line 47
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/dialog/BottomButtonsDialog$BottomButtonDialogOptions;->buttonText:Ljava/lang/String;

    return-object v0
.end method

.method public getId()I
    .locals 1

    .line 39
    iget v0, p0, Lcom/ibotta/android/mvp/ui/dialog/BottomButtonsDialog$BottomButtonDialogOptions;->id:I

    return v0
.end method

.method public setButtonText(Ljava/lang/String;)V
    .locals 0

    .line 51
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/dialog/BottomButtonsDialog$BottomButtonDialogOptions;->buttonText:Ljava/lang/String;

    return-void
.end method

.method public setId(I)V
    .locals 0

    .line 43
    iput p1, p0, Lcom/ibotta/android/mvp/ui/dialog/BottomButtonsDialog$BottomButtonDialogOptions;->id:I

    return-void
.end method
