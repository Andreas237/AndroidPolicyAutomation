.class final Lorg/parceler/NonParcelRepository;
.super Ljava/lang/Object;
.source "NonParcelRepository.java"

# interfaces
.implements Lorg/parceler/Repository;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/parceler/NonParcelRepository$ParcelableParcelable;,
        Lorg/parceler/NonParcelRepository$ConverterParcelable;,
        Lorg/parceler/NonParcelRepository$StringParcelable;,
        Lorg/parceler/NonParcelRepository$CharacterParcelable;,
        Lorg/parceler/NonParcelRepository$CharArrayParcelable;,
        Lorg/parceler/NonParcelRepository$BooleanParcelable;,
        Lorg/parceler/NonParcelRepository$BooleanArrayParcelable;,
        Lorg/parceler/NonParcelRepository$ByteArrayParcelable;,
        Lorg/parceler/NonParcelRepository$IBinderParcelable;,
        Lorg/parceler/NonParcelRepository$ByteParcelable;,
        Lorg/parceler/NonParcelRepository$FloatParcelable;,
        Lorg/parceler/NonParcelRepository$DoubleParcelable;,
        Lorg/parceler/NonParcelRepository$LongParcelable;,
        Lorg/parceler/NonParcelRepository$IntegerParcelable;,
        Lorg/parceler/NonParcelRepository$SparseBooleanArrayParcelable;,
        Lorg/parceler/NonParcelRepository$SparseArrayParcelable;,
        Lorg/parceler/NonParcelRepository$CollectionParcelable;,
        Lorg/parceler/NonParcelRepository$LinkedHashSetParcelable;,
        Lorg/parceler/NonParcelRepository$TreeSetParcelable;,
        Lorg/parceler/NonParcelRepository$SetParcelable;,
        Lorg/parceler/NonParcelRepository$TreeMapParcelable;,
        Lorg/parceler/NonParcelRepository$LinkedHashMapParcelable;,
        Lorg/parceler/NonParcelRepository$MapParcelable;,
        Lorg/parceler/NonParcelRepository$LinkedListParcelable;,
        Lorg/parceler/NonParcelRepository$ListParcelable;,
        Lorg/parceler/NonParcelRepository$ParcelableParcelableFactory;,
        Lorg/parceler/NonParcelRepository$StringParcelableFactory;,
        Lorg/parceler/NonParcelRepository$ByteParcelableFactory;,
        Lorg/parceler/NonParcelRepository$FloatParcelableFactory;,
        Lorg/parceler/NonParcelRepository$DoubleParcelableFactory;,
        Lorg/parceler/NonParcelRepository$LongParcelableFactory;,
        Lorg/parceler/NonParcelRepository$IntegerParcelableFactory;,
        Lorg/parceler/NonParcelRepository$SparseArrayParcelableFactory;,
        Lorg/parceler/NonParcelRepository$CollectionParcelableFactory;,
        Lorg/parceler/NonParcelRepository$TreeMapParcelableFactory;,
        Lorg/parceler/NonParcelRepository$MapParcelableFactory;,
        Lorg/parceler/NonParcelRepository$TreeSetParcelableFactory;,
        Lorg/parceler/NonParcelRepository$SetParcelableFactory;,
        Lorg/parceler/NonParcelRepository$LinkedHashSetParcelableFactory;,
        Lorg/parceler/NonParcelRepository$LinkedHashMapParcelableFactory;,
        Lorg/parceler/NonParcelRepository$LinkedListParcelableFactory;,
        Lorg/parceler/NonParcelRepository$SparseBooleanArrayParcelableFactory;,
        Lorg/parceler/NonParcelRepository$BundleParcelableFactory;,
        Lorg/parceler/NonParcelRepository$IBinderParcelableFactory;,
        Lorg/parceler/NonParcelRepository$BooleanArrayParcelableFactory;,
        Lorg/parceler/NonParcelRepository$CharArrayParcelableFactory;,
        Lorg/parceler/NonParcelRepository$ByteArrayParcelableFactory;,
        Lorg/parceler/NonParcelRepository$BooleanParcelableFactory;,
        Lorg/parceler/NonParcelRepository$CharacterParcelableFactory;,
        Lorg/parceler/NonParcelRepository$ListParcelableFactory;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lorg/parceler/Repository<",
        "Lorg/parceler/Parcels$ParcelableFactory;",
        ">;"
    }
.end annotation


# static fields
.field private static final INSTANCE:Lorg/parceler/NonParcelRepository;


# instance fields
.field private final parcelableCollectionFactories:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Class;",
            "Lorg/parceler/Parcels$ParcelableFactory;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 30
    new-instance v0, Lorg/parceler/NonParcelRepository;

    invoke-direct {v0}, Lorg/parceler/NonParcelRepository;-><init>()V

    sput-object v0, Lorg/parceler/NonParcelRepository;->INSTANCE:Lorg/parceler/NonParcelRepository;

    return-void
.end method

.method private constructor <init>()V
    .locals 4

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lorg/parceler/NonParcelRepository;->parcelableCollectionFactories:Ljava/util/Map;

    .line 35
    iget-object v0, p0, Lorg/parceler/NonParcelRepository;->parcelableCollectionFactories:Ljava/util/Map;

    const-class v1, Ljava/util/Collection;

    new-instance v2, Lorg/parceler/NonParcelRepository$CollectionParcelableFactory;

    const/4 v3, 0x0

    invoke-direct {v2, v3}, Lorg/parceler/NonParcelRepository$CollectionParcelableFactory;-><init>(Lorg/parceler/NonParcelRepository$1;)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    iget-object v0, p0, Lorg/parceler/NonParcelRepository;->parcelableCollectionFactories:Ljava/util/Map;

    const-class v1, Ljava/util/List;

    new-instance v2, Lorg/parceler/NonParcelRepository$ListParcelableFactory;

    invoke-direct {v2, v3}, Lorg/parceler/NonParcelRepository$ListParcelableFactory;-><init>(Lorg/parceler/NonParcelRepository$1;)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    iget-object v0, p0, Lorg/parceler/NonParcelRepository;->parcelableCollectionFactories:Ljava/util/Map;

    const-class v1, Ljava/util/ArrayList;

    new-instance v2, Lorg/parceler/NonParcelRepository$ListParcelableFactory;

    invoke-direct {v2, v3}, Lorg/parceler/NonParcelRepository$ListParcelableFactory;-><init>(Lorg/parceler/NonParcelRepository$1;)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    iget-object v0, p0, Lorg/parceler/NonParcelRepository;->parcelableCollectionFactories:Ljava/util/Map;

    const-class v1, Ljava/util/Set;

    new-instance v2, Lorg/parceler/NonParcelRepository$SetParcelableFactory;

    invoke-direct {v2, v3}, Lorg/parceler/NonParcelRepository$SetParcelableFactory;-><init>(Lorg/parceler/NonParcelRepository$1;)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    iget-object v0, p0, Lorg/parceler/NonParcelRepository;->parcelableCollectionFactories:Ljava/util/Map;

    const-class v1, Ljava/util/HashSet;

    new-instance v2, Lorg/parceler/NonParcelRepository$SetParcelableFactory;

    invoke-direct {v2, v3}, Lorg/parceler/NonParcelRepository$SetParcelableFactory;-><init>(Lorg/parceler/NonParcelRepository$1;)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    iget-object v0, p0, Lorg/parceler/NonParcelRepository;->parcelableCollectionFactories:Ljava/util/Map;

    const-class v1, Ljava/util/TreeSet;

    new-instance v2, Lorg/parceler/NonParcelRepository$TreeSetParcelableFactory;

    invoke-direct {v2, v3}, Lorg/parceler/NonParcelRepository$TreeSetParcelableFactory;-><init>(Lorg/parceler/NonParcelRepository$1;)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    iget-object v0, p0, Lorg/parceler/NonParcelRepository;->parcelableCollectionFactories:Ljava/util/Map;

    const-class v1, Landroid/util/SparseArray;

    new-instance v2, Lorg/parceler/NonParcelRepository$SparseArrayParcelableFactory;

    invoke-direct {v2, v3}, Lorg/parceler/NonParcelRepository$SparseArrayParcelableFactory;-><init>(Lorg/parceler/NonParcelRepository$1;)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    iget-object v0, p0, Lorg/parceler/NonParcelRepository;->parcelableCollectionFactories:Ljava/util/Map;

    const-class v1, Ljava/util/Map;

    new-instance v2, Lorg/parceler/NonParcelRepository$MapParcelableFactory;

    invoke-direct {v2, v3}, Lorg/parceler/NonParcelRepository$MapParcelableFactory;-><init>(Lorg/parceler/NonParcelRepository$1;)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    iget-object v0, p0, Lorg/parceler/NonParcelRepository;->parcelableCollectionFactories:Ljava/util/Map;

    const-class v1, Ljava/util/HashMap;

    new-instance v2, Lorg/parceler/NonParcelRepository$MapParcelableFactory;

    invoke-direct {v2, v3}, Lorg/parceler/NonParcelRepository$MapParcelableFactory;-><init>(Lorg/parceler/NonParcelRepository$1;)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    iget-object v0, p0, Lorg/parceler/NonParcelRepository;->parcelableCollectionFactories:Ljava/util/Map;

    const-class v1, Ljava/util/TreeMap;

    new-instance v2, Lorg/parceler/NonParcelRepository$TreeMapParcelableFactory;

    invoke-direct {v2, v3}, Lorg/parceler/NonParcelRepository$TreeMapParcelableFactory;-><init>(Lorg/parceler/NonParcelRepository$1;)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    iget-object v0, p0, Lorg/parceler/NonParcelRepository;->parcelableCollectionFactories:Ljava/util/Map;

    const-class v1, Ljava/lang/Integer;

    new-instance v2, Lorg/parceler/NonParcelRepository$IntegerParcelableFactory;

    invoke-direct {v2, v3}, Lorg/parceler/NonParcelRepository$IntegerParcelableFactory;-><init>(Lorg/parceler/NonParcelRepository$1;)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    iget-object v0, p0, Lorg/parceler/NonParcelRepository;->parcelableCollectionFactories:Ljava/util/Map;

    const-class v1, Ljava/lang/Long;

    new-instance v2, Lorg/parceler/NonParcelRepository$LongParcelableFactory;

    invoke-direct {v2, v3}, Lorg/parceler/NonParcelRepository$LongParcelableFactory;-><init>(Lorg/parceler/NonParcelRepository$1;)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    iget-object v0, p0, Lorg/parceler/NonParcelRepository;->parcelableCollectionFactories:Ljava/util/Map;

    const-class v1, Ljava/lang/Double;

    new-instance v2, Lorg/parceler/NonParcelRepository$DoubleParcelableFactory;

    invoke-direct {v2, v3}, Lorg/parceler/NonParcelRepository$DoubleParcelableFactory;-><init>(Lorg/parceler/NonParcelRepository$1;)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    iget-object v0, p0, Lorg/parceler/NonParcelRepository;->parcelableCollectionFactories:Ljava/util/Map;

    const-class v1, Ljava/lang/Float;

    new-instance v2, Lorg/parceler/NonParcelRepository$FloatParcelableFactory;

    invoke-direct {v2, v3}, Lorg/parceler/NonParcelRepository$FloatParcelableFactory;-><init>(Lorg/parceler/NonParcelRepository$1;)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    iget-object v0, p0, Lorg/parceler/NonParcelRepository;->parcelableCollectionFactories:Ljava/util/Map;

    const-class v1, Ljava/lang/Byte;

    new-instance v2, Lorg/parceler/NonParcelRepository$ByteParcelableFactory;

    invoke-direct {v2, v3}, Lorg/parceler/NonParcelRepository$ByteParcelableFactory;-><init>(Lorg/parceler/NonParcelRepository$1;)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    iget-object v0, p0, Lorg/parceler/NonParcelRepository;->parcelableCollectionFactories:Ljava/util/Map;

    const-class v1, Ljava/lang/String;

    new-instance v2, Lorg/parceler/NonParcelRepository$StringParcelableFactory;

    invoke-direct {v2, v3}, Lorg/parceler/NonParcelRepository$StringParcelableFactory;-><init>(Lorg/parceler/NonParcelRepository$1;)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    iget-object v0, p0, Lorg/parceler/NonParcelRepository;->parcelableCollectionFactories:Ljava/util/Map;

    const-class v1, Ljava/lang/Character;

    new-instance v2, Lorg/parceler/NonParcelRepository$CharacterParcelableFactory;

    invoke-direct {v2, v3}, Lorg/parceler/NonParcelRepository$CharacterParcelableFactory;-><init>(Lorg/parceler/NonParcelRepository$1;)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    iget-object v0, p0, Lorg/parceler/NonParcelRepository;->parcelableCollectionFactories:Ljava/util/Map;

    const-class v1, Ljava/lang/Boolean;

    new-instance v2, Lorg/parceler/NonParcelRepository$BooleanParcelableFactory;

    invoke-direct {v2, v3}, Lorg/parceler/NonParcelRepository$BooleanParcelableFactory;-><init>(Lorg/parceler/NonParcelRepository$1;)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    iget-object v0, p0, Lorg/parceler/NonParcelRepository;->parcelableCollectionFactories:Ljava/util/Map;

    const-class v1, [B

    new-instance v2, Lorg/parceler/NonParcelRepository$ByteArrayParcelableFactory;

    invoke-direct {v2, v3}, Lorg/parceler/NonParcelRepository$ByteArrayParcelableFactory;-><init>(Lorg/parceler/NonParcelRepository$1;)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    iget-object v0, p0, Lorg/parceler/NonParcelRepository;->parcelableCollectionFactories:Ljava/util/Map;

    const-class v1, [C

    new-instance v2, Lorg/parceler/NonParcelRepository$CharArrayParcelableFactory;

    invoke-direct {v2, v3}, Lorg/parceler/NonParcelRepository$CharArrayParcelableFactory;-><init>(Lorg/parceler/NonParcelRepository$1;)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    iget-object v0, p0, Lorg/parceler/NonParcelRepository;->parcelableCollectionFactories:Ljava/util/Map;

    const-class v1, [Z

    new-instance v2, Lorg/parceler/NonParcelRepository$BooleanArrayParcelableFactory;

    invoke-direct {v2, v3}, Lorg/parceler/NonParcelRepository$BooleanArrayParcelableFactory;-><init>(Lorg/parceler/NonParcelRepository$1;)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    iget-object v0, p0, Lorg/parceler/NonParcelRepository;->parcelableCollectionFactories:Ljava/util/Map;

    const-class v1, Landroid/os/IBinder;

    new-instance v2, Lorg/parceler/NonParcelRepository$IBinderParcelableFactory;

    invoke-direct {v2, v3}, Lorg/parceler/NonParcelRepository$IBinderParcelableFactory;-><init>(Lorg/parceler/NonParcelRepository$1;)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    iget-object v0, p0, Lorg/parceler/NonParcelRepository;->parcelableCollectionFactories:Ljava/util/Map;

    const-class v1, Landroid/os/Bundle;

    new-instance v2, Lorg/parceler/NonParcelRepository$BundleParcelableFactory;

    invoke-direct {v2, v3}, Lorg/parceler/NonParcelRepository$BundleParcelableFactory;-><init>(Lorg/parceler/NonParcelRepository$1;)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    iget-object v0, p0, Lorg/parceler/NonParcelRepository;->parcelableCollectionFactories:Ljava/util/Map;

    const-class v1, Landroid/util/SparseBooleanArray;

    new-instance v2, Lorg/parceler/NonParcelRepository$SparseBooleanArrayParcelableFactory;

    invoke-direct {v2, v3}, Lorg/parceler/NonParcelRepository$SparseBooleanArrayParcelableFactory;-><init>(Lorg/parceler/NonParcelRepository$1;)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    iget-object v0, p0, Lorg/parceler/NonParcelRepository;->parcelableCollectionFactories:Ljava/util/Map;

    const-class v1, Ljava/util/LinkedList;

    new-instance v2, Lorg/parceler/NonParcelRepository$LinkedListParcelableFactory;

    invoke-direct {v2, v3}, Lorg/parceler/NonParcelRepository$LinkedListParcelableFactory;-><init>(Lorg/parceler/NonParcelRepository$1;)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    iget-object v0, p0, Lorg/parceler/NonParcelRepository;->parcelableCollectionFactories:Ljava/util/Map;

    const-class v1, Ljava/util/LinkedHashMap;

    new-instance v2, Lorg/parceler/NonParcelRepository$LinkedHashMapParcelableFactory;

    invoke-direct {v2, v3}, Lorg/parceler/NonParcelRepository$LinkedHashMapParcelableFactory;-><init>(Lorg/parceler/NonParcelRepository$1;)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    iget-object v0, p0, Lorg/parceler/NonParcelRepository;->parcelableCollectionFactories:Ljava/util/Map;

    const-class v1, Ljava/util/SortedMap;

    new-instance v2, Lorg/parceler/NonParcelRepository$TreeMapParcelableFactory;

    invoke-direct {v2, v3}, Lorg/parceler/NonParcelRepository$TreeMapParcelableFactory;-><init>(Lorg/parceler/NonParcelRepository$1;)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    iget-object v0, p0, Lorg/parceler/NonParcelRepository;->parcelableCollectionFactories:Ljava/util/Map;

    const-class v1, Ljava/util/SortedSet;

    new-instance v2, Lorg/parceler/NonParcelRepository$TreeSetParcelableFactory;

    invoke-direct {v2, v3}, Lorg/parceler/NonParcelRepository$TreeSetParcelableFactory;-><init>(Lorg/parceler/NonParcelRepository$1;)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    iget-object v0, p0, Lorg/parceler/NonParcelRepository;->parcelableCollectionFactories:Ljava/util/Map;

    const-class v1, Ljava/util/LinkedHashSet;

    new-instance v2, Lorg/parceler/NonParcelRepository$LinkedHashSetParcelableFactory;

    invoke-direct {v2, v3}, Lorg/parceler/NonParcelRepository$LinkedHashSetParcelableFactory;-><init>(Lorg/parceler/NonParcelRepository$1;)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static getInstance()Lorg/parceler/NonParcelRepository;
    .locals 1

    .line 68
    sget-object v0, Lorg/parceler/NonParcelRepository;->INSTANCE:Lorg/parceler/NonParcelRepository;

    return-object v0
.end method


# virtual methods
.method public get()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/Class;",
            "Lorg/parceler/Parcels$ParcelableFactory;",
            ">;"
        }
    .end annotation

    .line 73
    iget-object v0, p0, Lorg/parceler/NonParcelRepository;->parcelableCollectionFactories:Ljava/util/Map;

    return-object v0
.end method
