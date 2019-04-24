.class public abstract Lcom/google/android/gms/internal/auth/zzbj;
.super Lcom/google/android/gms/internal/auth/zze;

# interfaces
.implements Lcom/google/android/gms/internal/auth/zzbi;


# direct methods
.method public constructor <init>()V
    .locals 1

    const-string v0, "com.google.android.gms.auth.api.internal.IAuthCallbacks"

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/auth/zze;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method protected final dispatchTransaction(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
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

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/auth/zzbj;->zzf(Ljava/lang/String;)V

    goto :goto_0

    :pswitch_1
    sget-object p1, Lcom/google/android/gms/auth/api/proxy/ProxyResponse;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lcom/google/android/gms/internal/auth/zzf;->zzd(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/auth/api/proxy/ProxyResponse;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/auth/zzbj;->zzd(Lcom/google/android/gms/auth/api/proxy/ProxyResponse;)V

    :goto_0
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    const/4 p1, 0x1

    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
