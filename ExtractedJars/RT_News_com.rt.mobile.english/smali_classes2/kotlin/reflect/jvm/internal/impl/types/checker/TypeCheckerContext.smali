.class public Lkotlin/reflect/jvm/internal/impl/types/checker/TypeCheckerContext;
.super Ljava/lang/Object;
.source "TypeCheckerContext.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkotlin/reflect/jvm/internal/impl/types/checker/TypeCheckerContext$SupertypesPolicy;,
        Lkotlin/reflect/jvm/internal/impl/types/checker/TypeCheckerContext$SeveralSupertypesWithSameConstructorPolicy;,
        Lkotlin/reflect/jvm/internal/impl/types/checker/TypeCheckerContext$LowerCapturedTypePolicy;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nTypeCheckerContext.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypeCheckerContext.kt\norg/jetbrains/kotlin/types/checker/TypeCheckerContext\n*L\n1#1,139:1\n*E\n"
.end annotation


# instance fields
.field private final allowedTypeVariable:Z

.field private argumentsDepth:I

.field private final errorTypeEqualsToAnything:Z

.field private supertypesDeque:Ljava/util/ArrayDeque;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayDeque<",
            "Lkotlin/reflect/jvm/internal/impl/types/SimpleType;",
            ">;"
        }
    .end annotation
.end field

.field private supertypesLocked:Z

.field private supertypesSet:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lkotlin/reflect/jvm/internal/impl/types/SimpleType;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(ZZ)V
    .locals 0

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lkotlin/reflect/jvm/internal/impl/types/checker/TypeCheckerContext;->errorTypeEqualsToAnything:Z

    iput-boolean p2, p0, Lkotlin/reflect/jvm/internal/impl/types/checker/TypeCheckerContext;->allowedTypeVariable:Z

    return-void
.end method

.method public synthetic constructor <init>(ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x1

    .line 23
    :cond_0
    invoke-direct {p0, p1, p2}, Lkotlin/reflect/jvm/internal/impl/types/checker/TypeCheckerContext;-><init>(ZZ)V

    return-void
.end method

.method public static final synthetic access$clear(Lkotlin/reflect/jvm/internal/impl/types/checker/TypeCheckerContext;)V
    .locals 0

    .line 23
    invoke-direct {p0}, Lkotlin/reflect/jvm/internal/impl/types/checker/TypeCheckerContext;->clear()V

    return-void
.end method

.method public static final synthetic access$getArgumentsDepth$p(Lkotlin/reflect/jvm/internal/impl/types/checker/TypeCheckerContext;)I
    .locals 0

    .line 23
    iget p0, p0, Lkotlin/reflect/jvm/internal/impl/types/checker/TypeCheckerContext;->argumentsDepth:I

    return p0
.end method

.method public static final synthetic access$getSupertypesDeque$p(Lkotlin/reflect/jvm/internal/impl/types/checker/TypeCheckerContext;)Ljava/util/ArrayDeque;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 23
    iget-object p0, p0, Lkotlin/reflect/jvm/internal/impl/types/checker/TypeCheckerContext;->supertypesDeque:Ljava/util/ArrayDeque;

    return-object p0
.end method

.method public static final synthetic access$getSupertypesSet$p(Lkotlin/reflect/jvm/internal/impl/types/checker/TypeCheckerContext;)Ljava/util/Set;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 23
    iget-object p0, p0, Lkotlin/reflect/jvm/internal/impl/types/checker/TypeCheckerContext;->supertypesSet:Ljava/util/Set;

    return-object p0
.end method

.method public static final synthetic access$initialize(Lkotlin/reflect/jvm/internal/impl/types/checker/TypeCheckerContext;)V
    .locals 0

    .line 23
    invoke-direct {p0}, Lkotlin/reflect/jvm/internal/impl/types/checker/TypeCheckerContext;->initialize()V

    return-void
.end method

.method public static final synthetic access$setArgumentsDepth$p(Lkotlin/reflect/jvm/internal/impl/types/checker/TypeCheckerContext;I)V
    .locals 0

    .line 23
    iput p1, p0, Lkotlin/reflect/jvm/internal/impl/types/checker/TypeCheckerContext;->argumentsDepth:I

    return-void
.end method

.method private final clear()V
    .locals 1

    .line 63
    iget-object v0, p0, Lkotlin/reflect/jvm/internal/impl/types/checker/TypeCheckerContext;->supertypesDeque:Ljava/util/ArrayDeque;

    if-nez v0, :cond_0

    invoke-static {}, Lkotlin/jvm/internal/Intrinsics;->throwNpe()V

    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->clear()V

    .line 64
    iget-object v0, p0, Lkotlin/reflect/jvm/internal/impl/types/checker/TypeCheckerContext;->supertypesSet:Ljava/util/Set;

    if-nez v0, :cond_1

    invoke-static {}, Lkotlin/jvm/internal/Intrinsics;->throwNpe()V

    :cond_1
    invoke-interface {v0}, Ljava/util/Set;->clear()V

    const/4 v0, 0x0

    .line 65
    iput-boolean v0, p0, Lkotlin/reflect/jvm/internal/impl/types/checker/TypeCheckerContext;->supertypesLocked:Z

    return-void
.end method

.method private final initialize()V
    .locals 3

    .line 51
    iget-boolean v0, p0, Lkotlin/reflect/jvm/internal/impl/types/checker/TypeCheckerContext;->supertypesLocked:Z

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    sget-boolean v2, Lkotlin/_Assertions;->ENABLED:Z

    if-eqz v2, :cond_0

    if-nez v0, :cond_0

    const-string v0, "Assertion failed"

    new-instance v1, Ljava/lang/AssertionError;

    invoke-direct {v1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    check-cast v1, Ljava/lang/Throwable;

    throw v1

    .line 52
    :cond_0
    iput-boolean v1, p0, Lkotlin/reflect/jvm/internal/impl/types/checker/TypeCheckerContext;->supertypesLocked:Z

    .line 54
    iget-object v0, p0, Lkotlin/reflect/jvm/internal/impl/types/checker/TypeCheckerContext;->supertypesDeque:Ljava/util/ArrayDeque;

    if-nez v0, :cond_1

    .line 55
    new-instance v0, Ljava/util/ArrayDeque;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Ljava/util/ArrayDeque;-><init>(I)V

    iput-object v0, p0, Lkotlin/reflect/jvm/internal/impl/types/checker/TypeCheckerContext;->supertypesDeque:Ljava/util/ArrayDeque;

    .line 57
    :cond_1
    iget-object v0, p0, Lkotlin/reflect/jvm/internal/impl/types/checker/TypeCheckerContext;->supertypesSet:Ljava/util/Set;

    if-nez v0, :cond_2

    .line 58
    sget-object v0, Lkotlin/reflect/jvm/internal/impl/utils/SmartSet;->Companion:Lkotlin/reflect/jvm/internal/impl/utils/SmartSet$Companion;

    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/impl/utils/SmartSet$Companion;->create()Lkotlin/reflect/jvm/internal/impl/utils/SmartSet;

    move-result-object v0

    check-cast v0, Ljava/util/Set;

    iput-object v0, p0, Lkotlin/reflect/jvm/internal/impl/types/checker/TypeCheckerContext;->supertypesSet:Ljava/util/Set;

    :cond_2
    return-void
.end method


# virtual methods
.method public addSubtypeConstraint(Lkotlin/reflect/jvm/internal/impl/types/UnwrappedType;Lkotlin/reflect/jvm/internal/impl/types/UnwrappedType;)Ljava/lang/Boolean;
    .locals 1
    .param p1    # Lkotlin/reflect/jvm/internal/impl/types/UnwrappedType;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lkotlin/reflect/jvm/internal/impl/types/UnwrappedType;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    const-string v0, "subType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "superType"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method public areEqualTypeConstructors(Lkotlin/reflect/jvm/internal/impl/types/TypeConstructor;Lkotlin/reflect/jvm/internal/impl/types/TypeConstructor;)Z
    .locals 1
    .param p1    # Lkotlin/reflect/jvm/internal/impl/types/TypeConstructor;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lkotlin/reflect/jvm/internal/impl/types/TypeConstructor;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "a"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "b"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final getErrorTypeEqualsToAnything()Z
    .locals 1

    .line 23
    iget-boolean v0, p0, Lkotlin/reflect/jvm/internal/impl/types/checker/TypeCheckerContext;->errorTypeEqualsToAnything:Z

    return v0
.end method

.method public getLowerCapturedTypePolicy(Lkotlin/reflect/jvm/internal/impl/types/SimpleType;Lkotlin/reflect/jvm/internal/impl/types/checker/NewCapturedType;)Lkotlin/reflect/jvm/internal/impl/types/checker/TypeCheckerContext$LowerCapturedTypePolicy;
    .locals 1
    .param p1    # Lkotlin/reflect/jvm/internal/impl/types/SimpleType;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lkotlin/reflect/jvm/internal/impl/types/checker/NewCapturedType;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "subType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "superType"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    sget-object p1, Lkotlin/reflect/jvm/internal/impl/types/checker/TypeCheckerContext$LowerCapturedTypePolicy;->CHECK_SUBTYPE_AND_LOWER:Lkotlin/reflect/jvm/internal/impl/types/checker/TypeCheckerContext$LowerCapturedTypePolicy;

    return-object p1
.end method

.method public getSameConstructorPolicy()Lkotlin/reflect/jvm/internal/impl/types/checker/TypeCheckerContext$SeveralSupertypesWithSameConstructorPolicy;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 37
    sget-object v0, Lkotlin/reflect/jvm/internal/impl/types/checker/TypeCheckerContext$SeveralSupertypesWithSameConstructorPolicy;->INTERSECT_ARGUMENTS_AND_CHECK_AGAIN:Lkotlin/reflect/jvm/internal/impl/types/checker/TypeCheckerContext$SeveralSupertypesWithSameConstructorPolicy;

    return-object v0
.end method

.method public final isAllowedTypeVariable(Lkotlin/reflect/jvm/internal/impl/types/UnwrappedType;)Z
    .locals 1
    .param p1    # Lkotlin/reflect/jvm/internal/impl/types/UnwrappedType;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "receiver$0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 137
    iget-boolean v0, p0, Lkotlin/reflect/jvm/internal/impl/types/checker/TypeCheckerContext;->allowedTypeVariable:Z

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lkotlin/reflect/jvm/internal/impl/types/UnwrappedType;->getConstructor()Lkotlin/reflect/jvm/internal/impl/types/TypeConstructor;

    move-result-object p1

    instance-of p1, p1, Lkotlin/reflect/jvm/internal/impl/types/checker/NewTypeVariableConstructor;

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method
