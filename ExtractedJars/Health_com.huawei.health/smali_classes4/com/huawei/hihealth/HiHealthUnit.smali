.class public Lcom/huawei/hihealth/HiHealthUnit;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final BLOOD_GLUCOSE:I = 0x6

.field public static final BLOOD_PRESSURE:I = 0x7

.field public static final BMR:I = 0x14

.field public static final CALORIES:I = 0x3

.field public static final CLIMB:I = 0x4

.field public static final COUNT:I = 0x10

.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/huawei/hihealth/HiHealthUnit;>;"
        }
    .end annotation
.end field

.field public static final DEFAULT:I = 0x0

.field public static final DISTANCE:I = 0x2

.field public static final DURATION_MIL:I = 0x5

.field public static final DURATION_MINUTE:I = 0xf

.field public static final DURATION_SECONDS:I = 0xd

.field public static final FLOOR_TO_ALTITUDE_RATIO:I = 0x1e

.field public static final HEAR_TRATE:I = 0x8

.field public static final HEIGHT_CM:I = 0xb

.field public static final HEIGHT_FT:I = 0xc

.field public static final OHM:I = 0x13

.field public static final PACE_MINUTE:I = 0xe

.field public static final PERSENT:I = 0x12

.field public static final SCORE:I = 0x11

.field public static final STEPS:I = 0x1

.field public static final WEIGHT_BL:I = 0xa

.field public static final WEIGHT_KG:I = 0x9


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 126
    new-instance v0, Lcom/huawei/hihealth/HiHealthUnit$1;

    invoke-direct {v0}, Lcom/huawei/hihealth/HiHealthUnit$1;-><init>()V

    sput-object v0, Lcom/huawei/hihealth/HiHealthUnit;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method protected constructor <init>(Landroid/os/Parcel;)V
    .locals 0

    .line 123
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 124
    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    .line 140
    const/4 v0, 0x0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    .line 145
    return-void
.end method
