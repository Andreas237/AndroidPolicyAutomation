.class public abstract Lcom/google/android/gms/signin/internal/IOfflineAccessCallbacks$Stub;
.super Lcom/google/android/gms/internal/stable/zzb;

# interfaces
.implements Lcom/google/android/gms/signin/internal/IOfflineAccessCallbacks;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/signin/internal/IOfflineAccessCallbacks;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "Stub"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/signin/internal/IOfflineAccessCallbacks$Stub$Proxy;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 1

    const-string v0, "com.google.android.gms.signin.internal.IOfflineAccessCallbacks"

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/stable/zzb;-><init>(Ljava/lang/String;)V

    return-void
.end method

.method public static asInterface(Landroid/os/IBinder;)Lcom/google/android/gms/signin/internal/IOfflineAccessCallbacks;
    .locals 2

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    const-string v0, "com.google.android.gms.signin.internal.IOfflineAccessCallbacks"

    invoke-interface {p0, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v0

    instance-of v1, v0, Lcom/google/android/gms/signin/internal/IOfflineAccessCallbacks;

    if-eqz v1, :cond_1

    check-cast v0, Lcom/google/android/gms/signin/internal/IOfflineAccessCallbacks;

    return-object v0

    :cond_1
    new-instance v0, Lcom/google/android/gms/signin/internal/IOfflineAccessCallbacks$Stub$Proxy;

    invoke-direct {v0, p0}, Lcom/google/android/gms/signin/internal/IOfflineAccessCallbacks$Stub$Proxy;-><init>(Landroid/os/IBinder;)V

    return-object v0
.end method


# virtual methods
.method protected dispatchTransaction(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    packed-switch p1, :pswitch_data_0

    const/4 p1, 0x0

    return p1

    :pswitch_0
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object p2

    invoke-static {p2}, Lcom/google/android/gms/signin/internal/ISignInService$Stub;->asInterface(Landroid/os/IBinder;)Lcom/google/android/gms/signin/internal/ISignInService;

    move-result-object p2

    invoke-virtual {p0, p1, p4, p2}, Lcom/google/android/gms/signin/internal/IOfflineAccessCallbacks$Stub;->uploadServerAuthCode(Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/signin/internal/ISignInService;)V

    goto :goto_0

    :pswitch_1
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p1

    sget-object p4, Lcom/google/android/gms/common/api/Scope;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-virtual {p2, p4}, Landroid/os/Parcel;->createTypedArrayList(Landroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    move-result-object p4

    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object p2

    invoke-static {p2}, Lcom/google/android/gms/signin/internal/ISignInService$Stub;->asInterface(Landroid/os/IBinder;)Lcom/google/android/gms/signin/internal/ISignInService;

    move-result-object p2

    invoke-virtual {p0, p1, p4, p2}, Lcom/google/android/gms/signin/internal/IOfflineAccessCallbacks$Stub;->checkServerAuthorization(Ljava/lang/String;Ljava/util/List;Lcom/google/android/gms/signin/internal/ISignInService;)V

    :goto_0
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    const/4 p1, 0x1

    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
