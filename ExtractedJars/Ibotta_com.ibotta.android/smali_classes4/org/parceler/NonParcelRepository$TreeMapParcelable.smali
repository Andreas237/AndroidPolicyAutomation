.class public final Lorg/parceler/NonParcelRepository$TreeMapParcelable;
.super Lorg/parceler/NonParcelRepository$ConverterParcelable;
.source "NonParcelRepository.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/parceler/NonParcelRepository;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "TreeMapParcelable"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/parceler/NonParcelRepository$TreeMapParcelable$TreeMapParcelableCreator;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lorg/parceler/NonParcelRepository$ConverterParcelable<",
        "Ljava/util/Map;",
        ">;"
    }
.end annotation


# static fields
.field private static final CONVERTER:Lorg/parceler/converter/TreeMapParcelConverter;

.field public static final CREATOR:Lorg/parceler/NonParcelRepository$TreeMapParcelable$TreeMapParcelableCreator;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 461
    new-instance v0, Lorg/parceler/NonParcelRepository$TreeMapParcelable$1;

    invoke-direct {v0}, Lorg/parceler/NonParcelRepository$TreeMapParcelable$1;-><init>()V

    sput-object v0, Lorg/parceler/NonParcelRepository$TreeMapParcelable;->CONVERTER:Lorg/parceler/converter/TreeMapParcelConverter;

    .line 493
    new-instance v0, Lorg/parceler/NonParcelRepository$TreeMapParcelable$TreeMapParcelableCreator;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lorg/parceler/NonParcelRepository$TreeMapParcelable$TreeMapParcelableCreator;-><init>(Lorg/parceler/NonParcelRepository$1;)V

    sput-object v0, Lorg/parceler/NonParcelRepository$TreeMapParcelable;->CREATOR:Lorg/parceler/NonParcelRepository$TreeMapParcelable$TreeMapParcelableCreator;

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 2

    .line 485
    sget-object v0, Lorg/parceler/NonParcelRepository$TreeMapParcelable;->CONVERTER:Lorg/parceler/converter/TreeMapParcelConverter;

    const/4 v1, 0x0

    invoke-direct {p0, p1, v0, v1}, Lorg/parceler/NonParcelRepository$ConverterParcelable;-><init>(Landroid/os/Parcel;Lorg/parceler/TypeRangeParcelConverter;Lorg/parceler/NonParcelRepository$1;)V

    return-void
.end method

.method public constructor <init>(Ljava/util/Map;)V
    .locals 2

    .line 489
    sget-object v0, Lorg/parceler/NonParcelRepository$TreeMapParcelable;->CONVERTER:Lorg/parceler/converter/TreeMapParcelConverter;

    const/4 v1, 0x0

    invoke-direct {p0, p1, v0, v1}, Lorg/parceler/NonParcelRepository$ConverterParcelable;-><init>(Ljava/lang/Object;Lorg/parceler/TypeRangeParcelConverter;Lorg/parceler/NonParcelRepository$1;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic describeContents()I
    .locals 1

    .line 459
    invoke-super {p0}, Lorg/parceler/NonParcelRepository$ConverterParcelable;->describeContents()I

    move-result v0

    return v0
.end method

.method public bridge synthetic writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    .line 459
    invoke-super {p0, p1, p2}, Lorg/parceler/NonParcelRepository$ConverterParcelable;->writeToParcel(Landroid/os/Parcel;I)V

    return-void
.end method
