.class final Lorg/parceler/Parcels$ParcelCodeRepository;
.super Ljava/lang/Object;
.source "Parcels.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/parceler/Parcels;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "ParcelCodeRepository"
.end annotation


# instance fields
.field private generatedMap:Ljava/util/concurrent/ConcurrentMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentMap<",
            "Ljava/lang/Class;",
            "Lorg/parceler/Parcels$ParcelableFactory;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 136
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 138
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lorg/parceler/Parcels$ParcelCodeRepository;->generatedMap:Ljava/util/concurrent/ConcurrentMap;

    return-void
.end method

.method synthetic constructor <init>(Lorg/parceler/Parcels$1;)V
    .locals 0

    .line 136
    invoke-direct {p0}, Lorg/parceler/Parcels$ParcelCodeRepository;-><init>()V

    return-void
.end method

.method private static buildParcelableImplName(Ljava/lang/Class;)Ljava/lang/String;
    .locals 1

    .line 166
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "$$"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "Parcelable"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public findClass(Ljava/lang/Class;)Lorg/parceler/Parcels$ParcelableFactory;
    .locals 2

    .line 172
    :try_start_0
    invoke-static {p1}, Lorg/parceler/Parcels$ParcelCodeRepository;->buildParcelableImplName(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    .line 173
    new-instance v1, Lorg/parceler/Parcels$ParcelableFactoryReflectionProxy;

    invoke-direct {v1, p1, v0}, Lorg/parceler/Parcels$ParcelableFactoryReflectionProxy;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v1

    :catch_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public get(Ljava/lang/Class;)Lorg/parceler/Parcels$ParcelableFactory;
    .locals 3

    .line 141
    iget-object v0, p0, Lorg/parceler/Parcels$ParcelCodeRepository;->generatedMap:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v0, p1}, Ljava/util/concurrent/ConcurrentMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/parceler/Parcels$ParcelableFactory;

    if-nez v0, :cond_3

    .line 143
    invoke-virtual {p0, p1}, Lorg/parceler/Parcels$ParcelCodeRepository;->findClass(Ljava/lang/Class;)Lorg/parceler/Parcels$ParcelableFactory;

    move-result-object v0

    .line 145
    const-class v1, Landroid/os/Parcelable;

    invoke-virtual {v1, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 146
    new-instance v0, Lorg/parceler/NonParcelRepository$ParcelableParcelableFactory;

    invoke-direct {v0}, Lorg/parceler/NonParcelRepository$ParcelableParcelableFactory;-><init>()V

    :cond_0
    if-eqz v0, :cond_2

    .line 156
    iget-object v1, p0, Lorg/parceler/Parcels$ParcelCodeRepository;->generatedMap:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v1, p1, v0}, Ljava/util/concurrent/ConcurrentMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lorg/parceler/Parcels$ParcelableFactory;

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    move-object v0, p1

    goto :goto_0

    .line 150
    :cond_2
    new-instance v0, Lorg/parceler/ParcelerRuntimeException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unable to find generated Parcelable class for "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 151
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ", verify that your class is configured properly and that the Parcelable class "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 153
    invoke-static {p1}, Lorg/parceler/Parcels$ParcelCodeRepository;->buildParcelableImplName(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " is generated by Parceler."

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lorg/parceler/ParcelerRuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    :goto_0
    return-object v0
.end method

.method public loadRepository(Lorg/parceler/Repository;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/parceler/Repository<",
            "Lorg/parceler/Parcels$ParcelableFactory;",
            ">;)V"
        }
    .end annotation

    .line 180
    iget-object v0, p0, Lorg/parceler/Parcels$ParcelCodeRepository;->generatedMap:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {p1}, Lorg/parceler/Repository;->get()Ljava/util/Map;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/concurrent/ConcurrentMap;->putAll(Ljava/util/Map;)V

    return-void
.end method
