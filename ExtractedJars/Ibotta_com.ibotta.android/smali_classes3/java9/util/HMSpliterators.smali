.class final Ljava9/util/HMSpliterators;
.super Ljava/lang/Object;
.source "HMSpliterators.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ljava9/util/HMSpliterators$HashMapSpliterator;,
        Ljava9/util/HMSpliterators$EntrySpliterator;,
        Ljava9/util/HMSpliterators$ValueSpliterator;,
        Ljava9/util/HMSpliterators$KeySpliterator;
    }
.end annotation


# static fields
.field private static final ENTRYSET_$0_OFF:J

.field private static final HASHSET_MAP_OFF:J

.field private static final KEYSET_$0_OFF:J

.field private static final U:Lsun/misc/Unsafe;

.field private static final VALUES_$0_OFF:J


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 408
    sget-object v0, Ljava9/util/UnsafeAccess;->unsafe:Lsun/misc/Unsafe;

    sput-object v0, Ljava9/util/HMSpliterators;->U:Lsun/misc/Unsafe;

    :try_start_0
    const-string v0, "java.util.HashMap$Values"

    .line 415
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    const-string v1, "java.util.HashMap$KeySet"

    .line 416
    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    const-string v2, "java.util.HashMap$EntrySet"

    .line 417
    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    .line 418
    sget-object v3, Ljava9/util/HMSpliterators;->U:Lsun/misc/Unsafe;

    const-string v4, "this$0"

    .line 419
    invoke-virtual {v0, v4}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    .line 418
    invoke-virtual {v3, v0}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    move-result-wide v3

    sput-wide v3, Ljava9/util/HMSpliterators;->VALUES_$0_OFF:J

    .line 420
    sget-object v0, Ljava9/util/HMSpliterators;->U:Lsun/misc/Unsafe;

    const-string v3, "this$0"

    .line 421
    invoke-virtual {v1, v3}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v1

    .line 420
    invoke-virtual {v0, v1}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    move-result-wide v0

    sput-wide v0, Ljava9/util/HMSpliterators;->KEYSET_$0_OFF:J

    .line 422
    sget-object v0, Ljava9/util/HMSpliterators;->U:Lsun/misc/Unsafe;

    const-string v1, "this$0"

    .line 423
    invoke-virtual {v2, v1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v1

    .line 422
    invoke-virtual {v0, v1}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    move-result-wide v0

    sput-wide v0, Ljava9/util/HMSpliterators;->ENTRYSET_$0_OFF:J

    .line 424
    sget-object v0, Ljava9/util/HMSpliterators;->U:Lsun/misc/Unsafe;

    const-class v1, Ljava/util/HashSet;

    const-string v2, "map"

    .line 425
    invoke-virtual {v1, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v1

    .line 424
    invoke-virtual {v0, v1}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    move-result-wide v0

    sput-wide v0, Ljava9/util/HMSpliterators;->HASHSET_MAP_OFF:J
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    .line 427
    new-instance v1, Ljava/lang/Error;

    invoke-direct {v1, v0}, Ljava/lang/Error;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method static getEntrySetSpliterator(Ljava/util/Set;)Ljava9/util/Spliterator;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Set<",
            "Ljava/util/Map$Entry<",
            "TK;TV;>;>;)",
            "Ljava9/util/Spliterator<",
            "Ljava/util/Map$Entry<",
            "TK;TV;>;>;"
        }
    .end annotation

    .line 50
    new-instance v6, Ljava9/util/HMSpliterators$EntrySpliterator;

    invoke-static {p0}, Ljava9/util/HMSpliterators;->getHashMapFromEntrySet(Ljava/util/Set;)Ljava/util/HashMap;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, -0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Ljava9/util/HMSpliterators$EntrySpliterator;-><init>(Ljava/util/HashMap;IIII)V

    return-object v6
.end method

.method private static getHashMapFromEntrySet(Ljava/util/Set;)Ljava/util/HashMap;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Set<",
            "Ljava/util/Map$Entry<",
            "TK;TV;>;>;)",
            "Ljava/util/HashMap<",
            "TK;TV;>;"
        }
    .end annotation

    .line 395
    sget-object v0, Ljava9/util/HMSpliterators;->U:Lsun/misc/Unsafe;

    sget-wide v1, Ljava9/util/HMSpliterators;->ENTRYSET_$0_OFF:J

    invoke-virtual {v0, p0, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/HashMap;

    return-object p0
.end method

.method private static getHashMapFromHashSet(Ljava/util/HashSet;)Ljava/util/HashMap;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/HashSet<",
            "TK;>;)",
            "Ljava/util/HashMap<",
            "TK;TV;>;"
        }
    .end annotation

    .line 404
    sget-object v0, Ljava9/util/HMSpliterators;->U:Lsun/misc/Unsafe;

    sget-wide v1, Ljava9/util/HMSpliterators;->HASHSET_MAP_OFF:J

    invoke-virtual {v0, p0, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/HashMap;

    return-object p0
.end method

.method private static getHashMapFromKeySet(Ljava/util/Set;)Ljava/util/HashMap;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Set<",
            "TK;>;)",
            "Ljava/util/HashMap<",
            "TK;TV;>;"
        }
    .end annotation

    .line 390
    sget-object v0, Ljava9/util/HMSpliterators;->U:Lsun/misc/Unsafe;

    sget-wide v1, Ljava9/util/HMSpliterators;->KEYSET_$0_OFF:J

    invoke-virtual {v0, p0, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/HashMap;

    return-object p0
.end method

.method private static getHashMapFromValues(Ljava/util/Collection;)Ljava/util/HashMap;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Collection<",
            "TV;>;)",
            "Ljava/util/HashMap<",
            "TK;TV;>;"
        }
    .end annotation

    .line 400
    sget-object v0, Ljava9/util/HMSpliterators;->U:Lsun/misc/Unsafe;

    sget-wide v1, Ljava9/util/HMSpliterators;->VALUES_$0_OFF:J

    invoke-virtual {v0, p0, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/HashMap;

    return-object p0
.end method

.method static getHashSetSpliterator(Ljava/util/HashSet;)Ljava9/util/Spliterator;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/HashSet<",
            "TE;>;)",
            "Ljava9/util/Spliterator<",
            "TE;>;"
        }
    .end annotation

    .line 60
    new-instance v6, Ljava9/util/HMSpliterators$KeySpliterator;

    invoke-static {p0}, Ljava9/util/HMSpliterators;->getHashMapFromHashSet(Ljava/util/HashSet;)Ljava/util/HashMap;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, -0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Ljava9/util/HMSpliterators$KeySpliterator;-><init>(Ljava/util/HashMap;IIII)V

    return-object v6
.end method

.method static getKeySetSpliterator(Ljava/util/Set;)Ljava9/util/Spliterator;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Set<",
            "TK;>;)",
            "Ljava9/util/Spliterator<",
            "TK;>;"
        }
    .end annotation

    .line 44
    new-instance v6, Ljava9/util/HMSpliterators$KeySpliterator;

    invoke-static {p0}, Ljava9/util/HMSpliterators;->getHashMapFromKeySet(Ljava/util/Set;)Ljava/util/HashMap;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, -0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Ljava9/util/HMSpliterators$KeySpliterator;-><init>(Ljava/util/HashMap;IIII)V

    return-object v6
.end method

.method static getValuesSpliterator(Ljava/util/Collection;)Ljava9/util/Spliterator;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Collection<",
            "TV;>;)",
            "Ljava9/util/Spliterator<",
            "TV;>;"
        }
    .end annotation

    .line 55
    new-instance v6, Ljava9/util/HMSpliterators$ValueSpliterator;

    invoke-static {p0}, Ljava9/util/HMSpliterators;->getHashMapFromValues(Ljava/util/Collection;)Ljava/util/HashMap;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, -0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Ljava9/util/HMSpliterators$ValueSpliterator;-><init>(Ljava/util/HashMap;IIII)V

    return-object v6
.end method
