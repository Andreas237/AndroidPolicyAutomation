.class public abstract Lcom/unionpay/tsmservice/OnSafetyKeyboardCallback$Stub;
.super Landroid/os/Binder;
.source "SourceFile"

# interfaces
.implements Lcom/unionpay/tsmservice/OnSafetyKeyboardCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/unionpay/tsmservice/OnSafetyKeyboardCallback;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "Stub"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/unionpay/tsmservice/OnSafetyKeyboardCallback$Stub$Proxy;
    }
.end annotation


# static fields
.field private static final DESCRIPTOR:Ljava/lang/String; = "com.unionpay.tsmservice.OnSafetyKeyboardCallback"

.field static final TRANSACTION_onEditorChanged:I = 0x3

.field static final TRANSACTION_onHide:I = 0x2

.field static final TRANSACTION_onShow:I = 0x1


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 14
    invoke-direct {p0}, Landroid/os/Binder;-><init>()V

    .line 15
    const-string v0, "com.unionpay.tsmservice.OnSafetyKeyboardCallback"

    invoke-virtual {p0, p0, v0}, Lcom/unionpay/tsmservice/OnSafetyKeyboardCallback$Stub;->attachInterface(Landroid/os/IInterface;Ljava/lang/String;)V

    .line 16
    return-void
.end method

.method public static asInterface(Landroid/os/IBinder;)Lcom/unionpay/tsmservice/OnSafetyKeyboardCallback;
    .locals 2

    .line 23
    if-nez p0, :cond_0

    .line 24
    const/4 v0, 0x0

    return-object v0

    .line 26
    :cond_0
    const-string v0, "com.unionpay.tsmservice.OnSafetyKeyboardCallback"

    invoke-interface {p0, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v1

    .line 27
    if-eqz v1, :cond_1

    instance-of v0, v1, Lcom/unionpay/tsmservice/OnSafetyKeyboardCallback;

    if-eqz v0, :cond_1

    .line 28
    move-object v0, v1

    check-cast v0, Lcom/unionpay/tsmservice/OnSafetyKeyboardCallback;

    return-object v0

    .line 30
    :cond_1
    new-instance v0, Lcom/unionpay/tsmservice/OnSafetyKeyboardCallback$Stub$Proxy;

    invoke-direct {v0, p0}, Lcom/unionpay/tsmservice/OnSafetyKeyboardCallback$Stub$Proxy;-><init>(Landroid/os/IBinder;)V

    return-object v0
.end method


# virtual methods
.method public asBinder()Landroid/os/IBinder;
    .locals 0

    .line 34
    return-object p0
.end method

.method public onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 38
    sparse-switch p1, :sswitch_data_0

    goto :goto_0

    .line 42
    :sswitch_0
    const-string v0, "com.unionpay.tsmservice.OnSafetyKeyboardCallback"

    invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 43
    const/4 v0, 0x1

    return v0

    .line 47
    :sswitch_1
    const-string v0, "com.unionpay.tsmservice.OnSafetyKeyboardCallback"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 48
    invoke-virtual {p0}, Lcom/unionpay/tsmservice/OnSafetyKeyboardCallback$Stub;->onShow()V

    .line 49
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 50
    const/4 v0, 0x1

    return v0

    .line 54
    :sswitch_2
    const-string v0, "com.unionpay.tsmservice.OnSafetyKeyboardCallback"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 55
    invoke-virtual {p0}, Lcom/unionpay/tsmservice/OnSafetyKeyboardCallback$Stub;->onHide()V

    .line 56
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 57
    const/4 v0, 0x1

    return v0

    .line 61
    :sswitch_3
    const-string v0, "com.unionpay.tsmservice.OnSafetyKeyboardCallback"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 63
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v1

    .line 64
    invoke-virtual {p0, v1}, Lcom/unionpay/tsmservice/OnSafetyKeyboardCallback$Stub;->onEditorChanged(I)V

    .line 65
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 66
    const/4 v0, 0x1

    return v0

    .line 69
    :goto_0
    invoke-super {p0, p1, p2, p3, p4}, Landroid/os/Binder;->onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    move-result v0

    return v0

    nop

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_1
        0x2 -> :sswitch_2
        0x3 -> :sswitch_3
        0x5f4e5446 -> :sswitch_0
    .end sparse-switch
.end method
