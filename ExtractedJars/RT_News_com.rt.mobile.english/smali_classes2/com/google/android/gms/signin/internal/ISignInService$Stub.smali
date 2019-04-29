.class public abstract Lcom/google/android/gms/signin/internal/ISignInService$Stub;
.super Lcom/google/android/gms/internal/stable/zzb;

# interfaces
.implements Lcom/google/android/gms/signin/internal/ISignInService;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/signin/internal/ISignInService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "Stub"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/signin/internal/ISignInService$Stub$Proxy;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 1

    const-string v0, "com.google.android.gms.signin.internal.ISignInService"

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/stable/zzb;-><init>(Ljava/lang/String;)V

    return-void
.end method

.method public static asInterface(Landroid/os/IBinder;)Lcom/google/android/gms/signin/internal/ISignInService;
    .locals 2

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    const-string v0, "com.google.android.gms.signin.internal.ISignInService"

    invoke-interface {p0, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v0

    instance-of v1, v0, Lcom/google/android/gms/signin/internal/ISignInService;

    if-eqz v1, :cond_1

    check-cast v0, Lcom/google/android/gms/signin/internal/ISignInService;

    return-object v0

    :cond_1
    new-instance v0, Lcom/google/android/gms/signin/internal/ISignInService$Stub$Proxy;

    invoke-direct {v0, p0}, Lcom/google/android/gms/signin/internal/ISignInService$Stub$Proxy;-><init>(Landroid/os/IBinder;)V

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

    :pswitch_0
    const/4 p1, 0x0

    return p1

    :pswitch_1
    invoke-static {p2}, Lcom/google/android/gms/internal/stable/zzc;->zza(Landroid/os/Parcel;)Z

    move-result p1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/signin/internal/ISignInService$Stub;->setGamesHasBeenGreeted(Z)V

    goto/16 :goto_0

    :pswitch_2
    sget-object p1, Lcom/google/android/gms/signin/internal/SignInRequest;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lcom/google/android/gms/internal/stable/zzc;->zza(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/signin/internal/SignInRequest;

    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object p2

    invoke-static {p2}, Lcom/google/android/gms/signin/internal/ISignInCallbacks$Stub;->asInterface(Landroid/os/IBinder;)Lcom/google/android/gms/signin/internal/ISignInCallbacks;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/signin/internal/ISignInService$Stub;->signIn(Lcom/google/android/gms/signin/internal/SignInRequest;Lcom/google/android/gms/signin/internal/ISignInCallbacks;)V

    goto/16 :goto_0

    :pswitch_3
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/signin/internal/ISignInCallbacks$Stub;->asInterface(Landroid/os/IBinder;)Lcom/google/android/gms/signin/internal/ISignInCallbacks;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/signin/internal/ISignInService$Stub;->getCurrentAccount(Lcom/google/android/gms/signin/internal/ISignInCallbacks;)V

    goto/16 :goto_0

    :pswitch_4
    sget-object p1, Lcom/google/android/gms/signin/internal/RecordConsentRequest;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lcom/google/android/gms/internal/stable/zzc;->zza(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/signin/internal/RecordConsentRequest;

    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object p2

    invoke-static {p2}, Lcom/google/android/gms/signin/internal/ISignInCallbacks$Stub;->asInterface(Landroid/os/IBinder;)Lcom/google/android/gms/signin/internal/ISignInCallbacks;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/signin/internal/ISignInService$Stub;->recordConsent(Lcom/google/android/gms/signin/internal/RecordConsentRequest;Lcom/google/android/gms/signin/internal/ISignInCallbacks;)V

    goto :goto_0

    :pswitch_5
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/common/internal/IAccountAccessor$Stub;->asInterface(Landroid/os/IBinder;)Lcom/google/android/gms/common/internal/IAccountAccessor;

    move-result-object p1

    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result p4

    invoke-static {p2}, Lcom/google/android/gms/internal/stable/zzc;->zza(Landroid/os/Parcel;)Z

    move-result p2

    invoke-virtual {p0, p1, p4, p2}, Lcom/google/android/gms/signin/internal/ISignInService$Stub;->saveDefaultAccountToSharedPref(Lcom/google/android/gms/common/internal/IAccountAccessor;IZ)V

    goto :goto_0

    :pswitch_6
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result p1

    sget-object p4, Landroid/accounts/Account;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p4}, Lcom/google/android/gms/internal/stable/zzc;->zza(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p4

    check-cast p4, Landroid/accounts/Account;

    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object p2

    invoke-static {p2}, Lcom/google/android/gms/signin/internal/ISignInCallbacks$Stub;->asInterface(Landroid/os/IBinder;)Lcom/google/android/gms/signin/internal/ISignInCallbacks;

    move-result-object p2

    invoke-virtual {p0, p1, p4, p2}, Lcom/google/android/gms/signin/internal/ISignInService$Stub;->saveAccountToSessionStore(ILandroid/accounts/Account;Lcom/google/android/gms/signin/internal/ISignInCallbacks;)V

    goto :goto_0

    :pswitch_7
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/signin/internal/ISignInService$Stub;->clearAccountFromSessionStore(I)V

    goto :goto_0

    :pswitch_8
    sget-object p1, Lcom/google/android/gms/common/internal/ResolveAccountRequest;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lcom/google/android/gms/internal/stable/zzc;->zza(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/common/internal/ResolveAccountRequest;

    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object p2

    invoke-static {p2}, Lcom/google/android/gms/common/internal/IResolveAccountCallbacks$Stub;->asInterface(Landroid/os/IBinder;)Lcom/google/android/gms/common/internal/IResolveAccountCallbacks;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/signin/internal/ISignInService$Stub;->resolveAccount(Lcom/google/android/gms/common/internal/ResolveAccountRequest;Lcom/google/android/gms/common/internal/IResolveAccountCallbacks;)V

    goto :goto_0

    :pswitch_9
    invoke-static {p2}, Lcom/google/android/gms/internal/stable/zzc;->zza(Landroid/os/Parcel;)Z

    move-result p1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/signin/internal/ISignInService$Stub;->onUploadServerAuthCode(Z)V

    goto :goto_0

    :pswitch_a
    sget-object p1, Lcom/google/android/gms/signin/internal/CheckServerAuthResult;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lcom/google/android/gms/internal/stable/zzc;->zza(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/signin/internal/CheckServerAuthResult;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/signin/internal/ISignInService$Stub;->onCheckServerAuthorization(Lcom/google/android/gms/signin/internal/CheckServerAuthResult;)V

    goto :goto_0

    :pswitch_b
    sget-object p1, Lcom/google/android/gms/common/internal/AuthAccountRequest;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lcom/google/android/gms/internal/stable/zzc;->zza(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/common/internal/AuthAccountRequest;

    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object p2

    invoke-static {p2}, Lcom/google/android/gms/signin/internal/ISignInCallbacks$Stub;->asInterface(Landroid/os/IBinder;)Lcom/google/android/gms/signin/internal/ISignInCallbacks;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/signin/internal/ISignInService$Stub;->authAccount(Lcom/google/android/gms/common/internal/AuthAccountRequest;Lcom/google/android/gms/signin/internal/ISignInCallbacks;)V

    :goto_0
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    const/4 p1, 0x1

    return p1

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method
