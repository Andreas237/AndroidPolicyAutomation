.class public abstract Lcom/huawei/pay/ui/widget/dialog/CommonDatePickerDialogListener;
.super Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogListener;
.source "SourceFile"

# interfaces
.implements Landroid/app/DatePickerDialog$OnDateSetListener;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 16
    invoke-direct {p0}, Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogListener;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic describeContents()I
    .locals 1

    .line 16
    invoke-super {p0}, Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogListener;->describeContents()I

    move-result v0

    return v0
.end method

.method public bridge synthetic onCreate(Landroid/os/Bundle;)V
    .locals 0

    .line 16
    invoke-super {p0, p1}, Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogListener;->onCreate(Landroid/os/Bundle;)V

    return-void
.end method

.method public abstract onDateSet(Landroid/widget/DatePicker;III)V
.end method

.method public bridge synthetic onDestory()V
    .locals 0

    .line 16
    invoke-super {p0}, Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogListener;->onDestory()V

    return-void
.end method

.method public bridge synthetic onDialogDismiss()V
    .locals 0

    .line 16
    invoke-super {p0}, Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogListener;->onDialogDismiss()V

    return-void
.end method

.method public bridge synthetic onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 0

    .line 16
    invoke-super {p0, p1}, Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogListener;->onSaveInstanceState(Landroid/os/Bundle;)V

    return-void
.end method

.method public bridge synthetic writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    .line 16
    invoke-super {p0, p1, p2}, Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogListener;->writeToParcel(Landroid/os/Parcel;I)V

    return-void
.end method
