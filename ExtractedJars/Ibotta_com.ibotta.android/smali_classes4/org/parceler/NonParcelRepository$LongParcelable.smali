.class public final Lorg/parceler/NonParcelRepository$LongParcelable;
.super Lorg/parceler/NonParcelRepository$ConverterParcelable;
.source "NonParcelRepository.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/parceler/NonParcelRepository;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "LongParcelable"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/parceler/NonParcelRepository$LongParcelable$LongParcelableCreator;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lorg/parceler/NonParcelRepository$ConverterParcelable<",
        "Ljava/lang/Long;",
        ">;"
    }
.end annotation


# static fields
.field private static final CONVERTER:Lorg/parceler/converter/NullableParcelConverter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lorg/parceler/converter/NullableParcelConverter<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field public static final CREATOR:Lorg/parceler/NonParcelRepository$LongParcelable$LongParcelableCreator;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 792
    new-instance v0, Lorg/parceler/NonParcelRepository$LongParcelable$1;

    invoke-direct {v0}, Lorg/parceler/NonParcelRepository$LongParcelable$1;-><init>()V

    sput-object v0, Lorg/parceler/NonParcelRepository$LongParcelable;->CONVERTER:Lorg/parceler/converter/NullableParcelConverter;

    .line 814
    new-instance v0, Lorg/parceler/NonParcelRepository$LongParcelable$LongParcelableCreator;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lorg/parceler/NonParcelRepository$LongParcelable$LongParcelableCreator;-><init>(Lorg/parceler/NonParcelRepository$1;)V

    sput-object v0, Lorg/parceler/NonParcelRepository$LongParcelable;->CREATOR:Lorg/parceler/NonParcelRepository$LongParcelable$LongParcelableCreator;

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 2

    .line 806
    sget-object v0, Lorg/parceler/NonParcelRepository$LongParcelable;->CONVERTER:Lorg/parceler/converter/NullableParcelConverter;

    const/4 v1, 0x0

    invoke-direct {p0, p1, v0, v1}, Lorg/parceler/NonParcelRepository$ConverterParcelable;-><init>(Landroid/os/Parcel;Lorg/parceler/TypeRangeParcelConverter;Lorg/parceler/NonParcelRepository$1;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Long;)V
    .locals 2

    .line 810
    sget-object v0, Lorg/parceler/NonParcelRepository$LongParcelable;->CONVERTER:Lorg/parceler/converter/NullableParcelConverter;

    const/4 v1, 0x0

    invoke-direct {p0, p1, v0, v1}, Lorg/parceler/NonParcelRepository$ConverterParcelable;-><init>(Ljava/lang/Object;Lorg/parceler/TypeRangeParcelConverter;Lorg/parceler/NonParcelRepository$1;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic describeContents()I
    .locals 1

    .line 790
    invoke-super {p0}, Lorg/parceler/NonParcelRepository$ConverterParcelable;->describeContents()I

    move-result v0

    return v0
.end method

.method public bridge synthetic writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    .line 790
    invoke-super {p0, p1, p2}, Lorg/parceler/NonParcelRepository$ConverterParcelable;->writeToParcel(Landroid/os/Parcel;I)V

    return-void
.end method
