.class final Lorg/parceler/Parcels$ParcelableFactoryReflectionProxy;
.super Ljava/lang/Object;
.source "Parcels.java"

# interfaces
.implements Lorg/parceler/Parcels$ParcelableFactory;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/parceler/Parcels;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "ParcelableFactoryReflectionProxy"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lorg/parceler/Parcels$ParcelableFactory<",
        "TT;>;"
    }
.end annotation


# instance fields
.field private final constructor:Ljava/lang/reflect/Constructor;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/reflect/Constructor<",
            "+",
            "Landroid/os/Parcelable;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/Class;Ljava/lang/Class;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "TT;>;",
            "Ljava/lang/Class<",
            "+",
            "Landroid/os/Parcelable;",
            ">;)V"
        }
    .end annotation

    .line 114
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 116
    :try_start_0
    new-array v0, v0, [Ljava/lang/Class;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    invoke-virtual {p2, v0}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object p1

    iput-object p1, p0, Lorg/parceler/Parcels$ParcelableFactoryReflectionProxy;->constructor:Ljava/lang/reflect/Constructor;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 118
    new-instance p2, Lorg/parceler/ParcelerRuntimeException;

    const-string v0, "Unable to create ParcelFactory Type"

    invoke-direct {p2, v0, p1}, Lorg/parceler/ParcelerRuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    throw p2
.end method


# virtual methods
.method public buildParcelable(Ljava/lang/Object;)Landroid/os/Parcelable;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)",
            "Landroid/os/Parcelable;"
        }
    .end annotation

    .line 125
    :try_start_0
    iget-object v0, p0, Lorg/parceler/Parcels$ParcelableFactoryReflectionProxy;->constructor:Ljava/lang/reflect/Constructor;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-virtual {v0, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/os/Parcelable;
    :try_end_0
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    .line 131
    new-instance v0, Lorg/parceler/ParcelerRuntimeException;

    const-string v1, "Unable to create ParcelFactory Type"

    invoke-direct {v0, v1, p1}, Lorg/parceler/ParcelerRuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    throw v0

    :catch_1
    move-exception p1

    .line 129
    new-instance v0, Lorg/parceler/ParcelerRuntimeException;

    const-string v1, "Unable to create ParcelFactory Type"

    invoke-direct {v0, v1, p1}, Lorg/parceler/ParcelerRuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    throw v0

    :catch_2
    move-exception p1

    .line 127
    new-instance v0, Lorg/parceler/ParcelerRuntimeException;

    const-string v1, "Unable to create ParcelFactory Type"

    invoke-direct {v0, v1, p1}, Lorg/parceler/ParcelerRuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    throw v0
.end method
