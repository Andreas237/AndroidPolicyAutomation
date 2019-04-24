.class final Lorg/parceler/NonParcelRepository$CharacterParcelable$1;
.super Lorg/parceler/converter/NullableParcelConverter;
.source "NonParcelRepository.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/parceler/NonParcelRepository$CharacterParcelable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lorg/parceler/converter/NullableParcelConverter<",
        "Ljava/lang/Character;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 1130
    invoke-direct {p0}, Lorg/parceler/converter/NullableParcelConverter;-><init>()V

    return-void
.end method


# virtual methods
.method public nullSafeFromParcel(Landroid/os/Parcel;)Ljava/lang/Character;
    .locals 1

    .line 1134
    invoke-virtual {p1}, Landroid/os/Parcel;->createCharArray()[C

    move-result-object p1

    const/4 v0, 0x0

    aget-char p1, p1, v0

    invoke-static {p1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic nullSafeFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 0

    .line 1130
    invoke-virtual {p0, p1}, Lorg/parceler/NonParcelRepository$CharacterParcelable$1;->nullSafeFromParcel(Landroid/os/Parcel;)Ljava/lang/Character;

    move-result-object p1

    return-object p1
.end method

.method public nullSafeToParcel(Ljava/lang/Character;Landroid/os/Parcel;)V
    .locals 2

    const/4 v0, 0x1

    .line 1139
    new-array v0, v0, [C

    invoke-virtual {p1}, Ljava/lang/Character;->charValue()C

    move-result p1

    const/4 v1, 0x0

    aput-char p1, v0, v1

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->writeCharArray([C)V

    return-void
.end method

.method public bridge synthetic nullSafeToParcel(Ljava/lang/Object;Landroid/os/Parcel;)V
    .locals 0

    .line 1130
    check-cast p1, Ljava/lang/Character;

    invoke-virtual {p0, p1, p2}, Lorg/parceler/NonParcelRepository$CharacterParcelable$1;->nullSafeToParcel(Ljava/lang/Character;Landroid/os/Parcel;)V

    return-void
.end method
