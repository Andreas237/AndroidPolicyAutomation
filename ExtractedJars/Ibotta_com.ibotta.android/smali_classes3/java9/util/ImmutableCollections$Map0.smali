.class final Ljava9/util/ImmutableCollections$Map0;
.super Ljava9/util/ImmutableCollections$AbstractImmutableMap;
.source "ImmutableCollections.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ljava9/util/ImmutableCollections;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "Map0"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Ljava9/util/ImmutableCollections$AbstractImmutableMap<",
        "TK;TV;>;"
    }
.end annotation


# static fields
.field private static final INSTANCE:Ljava9/util/ImmutableCollections$Map0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava9/util/ImmutableCollections$Map0<",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 549
    new-instance v0, Ljava9/util/ImmutableCollections$Map0;

    invoke-direct {v0}, Ljava9/util/ImmutableCollections$Map0;-><init>()V

    sput-object v0, Ljava9/util/ImmutableCollections$Map0;->INSTANCE:Ljava9/util/ImmutableCollections$Map0;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 556
    invoke-direct {p0}, Ljava9/util/ImmutableCollections$AbstractImmutableMap;-><init>()V

    return-void
.end method

.method static final instance()Ljava9/util/ImmutableCollections$Map0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">()",
            "Ljava9/util/ImmutableCollections$Map0<",
            "TK;TV;>;"
        }
    .end annotation

    .line 553
    sget-object v0, Ljava9/util/ImmutableCollections$Map0;->INSTANCE:Ljava9/util/ImmutableCollections$Map0;

    return-object v0
.end method

.method private readObject(Ljava/io/ObjectInputStream;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Ljava/lang/ClassNotFoundException;
        }
    .end annotation

    .line 576
    new-instance p1, Ljava/io/InvalidObjectException;

    const-string v0, "not serial proxy"

    invoke-direct {p1, v0}, Ljava/io/InvalidObjectException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private writeReplace()Ljava/lang/Object;
    .locals 3

    .line 580
    new-instance v0, Ljava9/util/CollSer;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x3

    invoke-direct {v0, v2, v1}, Ljava9/util/CollSer;-><init>(I[Ljava/lang/Object;)V

    return-object v0
.end method


# virtual methods
.method public containsKey(Ljava/lang/Object;)Z
    .locals 0

    .line 565
    invoke-static {p1}, Ljava9/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 p1, 0x0

    return p1
.end method

.method public containsValue(Ljava/lang/Object;)Z
    .locals 0

    .line 571
    invoke-static {p1}, Ljava9/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 p1, 0x0

    return p1
.end method

.method public entrySet()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/util/Map$Entry<",
            "TK;TV;>;>;"
        }
    .end annotation

    .line 560
    invoke-static {}, Ljava9/util/ImmutableCollections$Set0;->instance()Ljava9/util/ImmutableCollections$Set0;

    move-result-object v0

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
