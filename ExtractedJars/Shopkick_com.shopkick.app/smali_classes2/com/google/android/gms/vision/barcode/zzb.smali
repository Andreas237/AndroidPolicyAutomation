.class public final Lcom/google/android/gms/vision/barcode/zzb;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lcom/google/android/gms/vision/barcode/Barcode;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 19

    move-object/from16 v0, p1

    .line 7
    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader;->validateObjectHeader(Landroid/os/Parcel;)I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    move v5, v2

    move v8, v5

    move-object v6, v3

    move-object v7, v6

    move-object v9, v7

    move-object v10, v9

    move-object v11, v10

    move-object v12, v11

    move-object v13, v12

    move-object v14, v13

    move-object v15, v14

    move-object/from16 v16, v15

    move-object/from16 v17, v16

    move-object/from16 v18, v17

    .line 22
    :goto_0
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->dataPosition()I

    move-result v2

    if-ge v2, v1, :cond_0

    .line 23
    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader;->readHeader(Landroid/os/Parcel;)I

    move-result v2

    .line 24
    invoke-static {v2}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader;->getFieldId(I)I

    move-result v3

    packed-switch v3, :pswitch_data_0

    .line 67
    invoke-static {v0, v2}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader;->skipUnknownField(Landroid/os/Parcel;I)V

    goto :goto_0

    .line 64
    :pswitch_0
    sget-object v3, Lcom/google/android/gms/vision/barcode/Barcode$DriverLicense;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 65
    invoke-static {v0, v2, v3}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader;->createParcelable(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v2

    move-object/from16 v18, v2

    check-cast v18, Lcom/google/android/gms/vision/barcode/Barcode$DriverLicense;

    goto :goto_0

    .line 61
    :pswitch_1
    sget-object v3, Lcom/google/android/gms/vision/barcode/Barcode$ContactInfo;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 62
    invoke-static {v0, v2, v3}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader;->createParcelable(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v2

    move-object/from16 v17, v2

    check-cast v17, Lcom/google/android/gms/vision/barcode/Barcode$ContactInfo;

    goto :goto_0

    .line 58
    :pswitch_2
    sget-object v3, Lcom/google/android/gms/vision/barcode/Barcode$CalendarEvent;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 59
    invoke-static {v0, v2, v3}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader;->createParcelable(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v2

    move-object/from16 v16, v2

    check-cast v16, Lcom/google/android/gms/vision/barcode/Barcode$CalendarEvent;

    goto :goto_0

    .line 55
    :pswitch_3
    sget-object v3, Lcom/google/android/gms/vision/barcode/Barcode$GeoPoint;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 56
    invoke-static {v0, v2, v3}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader;->createParcelable(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v2

    move-object v15, v2

    check-cast v15, Lcom/google/android/gms/vision/barcode/Barcode$GeoPoint;

    goto :goto_0

    .line 52
    :pswitch_4
    sget-object v3, Lcom/google/android/gms/vision/barcode/Barcode$UrlBookmark;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 53
    invoke-static {v0, v2, v3}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader;->createParcelable(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v2

    move-object v14, v2

    check-cast v14, Lcom/google/android/gms/vision/barcode/Barcode$UrlBookmark;

    goto :goto_0

    .line 49
    :pswitch_5
    sget-object v3, Lcom/google/android/gms/vision/barcode/Barcode$WiFi;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 50
    invoke-static {v0, v2, v3}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader;->createParcelable(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v2

    move-object v13, v2

    check-cast v13, Lcom/google/android/gms/vision/barcode/Barcode$WiFi;

    goto :goto_0

    .line 46
    :pswitch_6
    sget-object v3, Lcom/google/android/gms/vision/barcode/Barcode$Sms;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 47
    invoke-static {v0, v2, v3}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader;->createParcelable(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v2

    move-object v12, v2

    check-cast v12, Lcom/google/android/gms/vision/barcode/Barcode$Sms;

    goto :goto_0

    .line 43
    :pswitch_7
    sget-object v3, Lcom/google/android/gms/vision/barcode/Barcode$Phone;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 44
    invoke-static {v0, v2, v3}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader;->createParcelable(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v2

    move-object v11, v2

    check-cast v11, Lcom/google/android/gms/vision/barcode/Barcode$Phone;

    goto :goto_0

    .line 40
    :pswitch_8
    sget-object v3, Lcom/google/android/gms/vision/barcode/Barcode$Email;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 41
    invoke-static {v0, v2, v3}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader;->createParcelable(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v2

    move-object v10, v2

    check-cast v10, Lcom/google/android/gms/vision/barcode/Barcode$Email;

    goto :goto_0

    .line 37
    :pswitch_9
    sget-object v3, Landroid/graphics/Point;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 38
    invoke-static {v0, v2, v3}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader;->createTypedArray(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)[Ljava/lang/Object;

    move-result-object v2

    move-object v9, v2

    check-cast v9, [Landroid/graphics/Point;

    goto :goto_0

    .line 35
    :pswitch_a
    invoke-static {v0, v2}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader;->readInt(Landroid/os/Parcel;I)I

    move-result v8

    goto/16 :goto_0

    .line 32
    :pswitch_b
    invoke-static {v0, v2}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader;->createString(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v7

    goto/16 :goto_0

    .line 29
    :pswitch_c
    invoke-static {v0, v2}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader;->createString(Landroid/os/Parcel;I)Ljava/lang/String;

    move-result-object v6

    goto/16 :goto_0

    .line 26
    :pswitch_d
    invoke-static {v0, v2}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader;->readInt(Landroid/os/Parcel;I)I

    move-result v5

    goto/16 :goto_0

    .line 69
    :cond_0
    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader;->ensureAtEnd(Landroid/os/Parcel;I)V

    .line 70
    new-instance v0, Lcom/google/android/gms/vision/barcode/Barcode;

    move-object v4, v0

    invoke-direct/range {v4 .. v18}, Lcom/google/android/gms/vision/barcode/Barcode;-><init>(ILjava/lang/String;Ljava/lang/String;I[Landroid/graphics/Point;Lcom/google/android/gms/vision/barcode/Barcode$Email;Lcom/google/android/gms/vision/barcode/Barcode$Phone;Lcom/google/android/gms/vision/barcode/Barcode$Sms;Lcom/google/android/gms/vision/barcode/Barcode$WiFi;Lcom/google/android/gms/vision/barcode/Barcode$UrlBookmark;Lcom/google/android/gms/vision/barcode/Barcode$GeoPoint;Lcom/google/android/gms/vision/barcode/Barcode$CalendarEvent;Lcom/google/android/gms/vision/barcode/Barcode$ContactInfo;Lcom/google/android/gms/vision/barcode/Barcode$DriverLicense;)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
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

.method public final synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    .line 4
    new-array p1, p1, [Lcom/google/android/gms/vision/barcode/Barcode;

    return-object p1
.end method
