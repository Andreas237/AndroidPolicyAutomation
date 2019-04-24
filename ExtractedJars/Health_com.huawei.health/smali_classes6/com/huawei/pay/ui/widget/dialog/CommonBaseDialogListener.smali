.class abstract Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogListener;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# direct methods
.method constructor <init>()V
    .locals 0

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    .line 63
    const/4 v0, 0x0

    return v0
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 0

    .line 25
    return-void
.end method

.method public onDestory()V
    .locals 0

    .line 35
    return-void
.end method

.method public onDialogDismiss()V
    .locals 0

    .line 54
    return-void
.end method

.method public abstract onDialogInit(Landroid/app/Dialog;Lcom/huawei/pay/ui/widget/dialog/CommonBaseDialogFragment;)V
.end method

.method public onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 0

    .line 30
    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    .line 74
    return-void
.end method
