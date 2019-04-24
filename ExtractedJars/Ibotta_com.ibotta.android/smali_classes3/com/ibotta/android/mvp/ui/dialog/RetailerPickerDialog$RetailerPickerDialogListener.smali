.class public interface abstract Lcom/ibotta/android/mvp/ui/dialog/RetailerPickerDialog$RetailerPickerDialogListener;
.super Ljava/lang/Object;
.source "RetailerPickerDialog.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/mvp/ui/dialog/RetailerPickerDialog;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "RetailerPickerDialogListener"
.end annotation


# virtual methods
.method public abstract notifyRetailerClicked(Lcom/ibotta/api/model/RetailerModel;)V
.end method

.method public abstract notifyRetailerPickerDialogDismissClicked()V
.end method

.method public abstract notifyRetailerPickerDialogDismissed()V
.end method
