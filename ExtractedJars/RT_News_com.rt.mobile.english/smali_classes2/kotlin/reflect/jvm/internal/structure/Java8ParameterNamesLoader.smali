.class final Lkotlin/reflect/jvm/internal/structure/Java8ParameterNamesLoader;
.super Ljava/lang/Object;
.source "ReflectJavaMember.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkotlin/reflect/jvm/internal/structure/Java8ParameterNamesLoader$Cache;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nReflectJavaMember.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReflectJavaMember.kt\nkotlin/reflect/jvm/internal/structure/Java8ParameterNamesLoader\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,107:1\n8686#2:108\n9003#2,3:109\n*E\n*S KotlinDebug\n*F\n+ 1 ReflectJavaMember.kt\nkotlin/reflect/jvm/internal/structure/Java8ParameterNamesLoader\n*L\n102#1:108\n102#1,3:109\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0008\u00c2\u0002\u0018\u00002\u00020\u0001:\u0001\u000fB\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\u000c\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\u0006\u0010\n\u001a\u00020\u000bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006\"\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\u0010"
    }
    d2 = {
        "Lkotlin/reflect/jvm/internal/structure/Java8ParameterNamesLoader;",
        "",
        "()V",
        "cache",
        "Lkotlin/reflect/jvm/internal/structure/Java8ParameterNamesLoader$Cache;",
        "getCache",
        "()Lkotlin/reflect/jvm/internal/structure/Java8ParameterNamesLoader$Cache;",
        "setCache",
        "(Lkotlin/reflect/jvm/internal/structure/Java8ParameterNamesLoader$Cache;)V",
        "buildCache",
        "member",
        "Ljava/lang/reflect/Member;",
        "loadParameterNames",
        "",
        "",
        "Cache",
        "descriptors.runtime"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# static fields
.field public static final INSTANCE:Lkotlin/reflect/jvm/internal/structure/Java8ParameterNamesLoader;

.field private static cache:Lkotlin/reflect/jvm/internal/structure/Java8ParameterNamesLoader$Cache;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 71
    new-instance v0, Lkotlin/reflect/jvm/internal/structure/Java8ParameterNamesLoader;

    invoke-direct {v0}, Lkotlin/reflect/jvm/internal/structure/Java8ParameterNamesLoader;-><init>()V

    sput-object v0, Lkotlin/reflect/jvm/internal/structure/Java8ParameterNamesLoader;->INSTANCE:Lkotlin/reflect/jvm/internal/structure/Java8ParameterNamesLoader;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 71
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final buildCache(Ljava/lang/reflect/Member;)Lkotlin/reflect/jvm/internal/structure/Java8ParameterNamesLoader$Cache;
    .locals 4
    .param p1    # Ljava/lang/reflect/Member;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "member"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 78
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    :try_start_0
    const-string v0, "getParameters"

    const/4 v1, 0x0

    .line 81
    new-array v2, v1, [Ljava/lang/Class;

    invoke-virtual {p1, v0, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    .line 87
    invoke-static {p1}, Lkotlin/reflect/jvm/internal/structure/ReflectClassUtilKt;->getSafeClassLoader(Ljava/lang/Class;)Ljava/lang/ClassLoader;

    move-result-object p1

    const-string v2, "java.lang.reflect.Parameter"

    invoke-virtual {p1, v2}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p1

    .line 89
    new-instance v2, Lkotlin/reflect/jvm/internal/structure/Java8ParameterNamesLoader$Cache;

    const-string v3, "getName"

    new-array v1, v1, [Ljava/lang/Class;

    invoke-virtual {p1, v3, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object p1

    invoke-direct {v2, v0, p1}, Lkotlin/reflect/jvm/internal/structure/Java8ParameterNamesLoader$Cache;-><init>(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V

    return-object v2

    .line 84
    :catch_0
    new-instance p1, Lkotlin/reflect/jvm/internal/structure/Java8ParameterNamesLoader$Cache;

    const/4 v0, 0x0

    invoke-direct {p1, v0, v0}, Lkotlin/reflect/jvm/internal/structure/Java8ParameterNamesLoader$Cache;-><init>(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V

    return-object p1
.end method

.method public final loadParameterNames(Ljava/lang/reflect/Member;)Ljava/util/List;
    .locals 7
    .param p1    # Ljava/lang/reflect/Member;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/reflect/Member;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    const-string v0, "member"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 93
    sget-object v0, Lkotlin/reflect/jvm/internal/structure/Java8ParameterNamesLoader;->cache:Lkotlin/reflect/jvm/internal/structure/Java8ParameterNamesLoader$Cache;

    if-nez v0, :cond_0

    .line 95
    invoke-virtual {p0, p1}, Lkotlin/reflect/jvm/internal/structure/Java8ParameterNamesLoader;->buildCache(Ljava/lang/reflect/Member;)Lkotlin/reflect/jvm/internal/structure/Java8ParameterNamesLoader$Cache;

    move-result-object v0

    .line 96
    sput-object v0, Lkotlin/reflect/jvm/internal/structure/Java8ParameterNamesLoader;->cache:Lkotlin/reflect/jvm/internal/structure/Java8ParameterNamesLoader$Cache;

    .line 99
    :cond_0
    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/structure/Java8ParameterNamesLoader$Cache;->getGetParameters()Ljava/lang/reflect/Method;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_5

    .line 100
    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/structure/Java8ParameterNamesLoader$Cache;->getGetName()Ljava/lang/reflect/Method;

    move-result-object v0

    if-eqz v0, :cond_4

    const/4 v2, 0x0

    .line 102
    new-array v3, v2, [Ljava/lang/Object;

    invoke-virtual {v1, p1, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_1

    new-instance p1, Lkotlin/TypeCastException;

    const-string v0, "null cannot be cast to non-null type kotlin.Array<*>"

    invoke-direct {p1, v0}, Lkotlin/TypeCastException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    check-cast p1, [Ljava/lang/Object;

    .line 108
    new-instance v1, Ljava/util/ArrayList;

    array-length v3, p1

    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v1, Ljava/util/Collection;

    .line 109
    array-length v3, p1

    move v4, v2

    :goto_0
    if-ge v4, v3, :cond_3

    aget-object v5, p1, v4

    .line 103
    new-array v6, v2, [Ljava/lang/Object;

    invoke-virtual {v0, v5, v6}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    if-nez v5, :cond_2

    new-instance p1, Lkotlin/TypeCastException;

    const-string v0, "null cannot be cast to non-null type kotlin.String"

    invoke-direct {p1, v0}, Lkotlin/TypeCastException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    check-cast v5, Ljava/lang/String;

    invoke-interface {v1, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 111
    :cond_3
    check-cast v1, Ljava/util/List;

    return-object v1

    :cond_4
    return-object v2

    :cond_5
    return-object v2
.end method
