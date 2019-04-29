.class public abstract Lcom/google/android/gms/wearable/internal/zzen;
.super Lcom/google/android/gms/internal/wearable/zzb;

# interfaces
.implements Lcom/google/android/gms/wearable/internal/zzem;


# direct methods
.method public constructor <init>()V
    .locals 1

    const-string v0, "com.google.android.gms.wearable.internal.IWearableListener"

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/wearable/zzb;-><init>(Ljava/lang/String;)V

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
    sget-object p1, Lcom/google/android/gms/wearable/internal/zzi;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lcom/google/android/gms/internal/wearable/zzc;->zza(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/wearable/internal/zzi;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/wearable/internal/zzen;->zza(Lcom/google/android/gms/wearable/internal/zzi;)V

    goto :goto_0

    :pswitch_1
    sget-object p1, Lcom/google/android/gms/wearable/internal/zzah;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lcom/google/android/gms/internal/wearable/zzc;->zza(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/wearable/internal/zzah;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/wearable/internal/zzen;->zza(Lcom/google/android/gms/wearable/internal/zzah;)V

    goto :goto_0

    :pswitch_2
    sget-object p1, Lcom/google/android/gms/wearable/internal/zzaw;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lcom/google/android/gms/internal/wearable/zzc;->zza(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/wearable/internal/zzaw;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/wearable/internal/zzen;->zza(Lcom/google/android/gms/wearable/internal/zzaw;)V

    goto :goto_0

    :pswitch_3
    sget-object p1, Lcom/google/android/gms/wearable/internal/zzl;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lcom/google/android/gms/internal/wearable/zzc;->zza(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/wearable/internal/zzl;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/wearable/internal/zzen;->zza(Lcom/google/android/gms/wearable/internal/zzl;)V

    goto :goto_0

    :pswitch_4
    sget-object p1, Lcom/google/android/gms/wearable/internal/zzfo;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-virtual {p2, p1}, Landroid/os/Parcel;->createTypedArrayList(Landroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/wearable/internal/zzen;->onConnectedNodes(Ljava/util/List;)V

    goto :goto_0

    :pswitch_5
    sget-object p1, Lcom/google/android/gms/wearable/internal/zzfo;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lcom/google/android/gms/internal/wearable/zzc;->zza(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/wearable/internal/zzfo;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/wearable/internal/zzen;->zzb(Lcom/google/android/gms/wearable/internal/zzfo;)V

    goto :goto_0

    :pswitch_6
    sget-object p1, Lcom/google/android/gms/wearable/internal/zzfo;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lcom/google/android/gms/internal/wearable/zzc;->zza(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/wearable/internal/zzfo;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/wearable/internal/zzen;->zza(Lcom/google/android/gms/wearable/internal/zzfo;)V

    goto :goto_0

    :pswitch_7
    sget-object p1, Lcom/google/android/gms/wearable/internal/zzfe;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lcom/google/android/gms/internal/wearable/zzc;->zza(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/wearable/internal/zzfe;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/wearable/internal/zzen;->zza(Lcom/google/android/gms/wearable/internal/zzfe;)V

    goto :goto_0

    :pswitch_8
    sget-object p1, Lcom/google/android/gms/common/data/DataHolder;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lcom/google/android/gms/internal/wearable/zzc;->zza(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/common/data/DataHolder;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/wearable/internal/zzen;->zza(Lcom/google/android/gms/common/data/DataHolder;)V

    :goto_0
    const/4 p1, 0x1

    return p1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
