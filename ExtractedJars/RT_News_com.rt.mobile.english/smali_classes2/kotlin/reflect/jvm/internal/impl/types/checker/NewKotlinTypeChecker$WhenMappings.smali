.class public final synthetic Lkotlin/reflect/jvm/internal/impl/types/checker/NewKotlinTypeChecker$WhenMappings;
.super Ljava/lang/Object;


# static fields
.field public static final synthetic $EnumSwitchMapping$0:[I

.field public static final synthetic $EnumSwitchMapping$1:[I

.field public static final synthetic $EnumSwitchMapping$2:[I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 6

    invoke-static {}, Lkotlin/reflect/jvm/internal/impl/types/checker/TypeCheckerContext$LowerCapturedTypePolicy;->values()[Lkotlin/reflect/jvm/internal/impl/types/checker/TypeCheckerContext$LowerCapturedTypePolicy;

    move-result-object v0

    const/4 v1, 0x3

    const/4 v2, 0x2

    const/4 v3, 0x1

    const/4 v4, 0x4

    array-length v0, v0

    new-array v0, v0, [I

    sput-object v0, Lkotlin/reflect/jvm/internal/impl/types/checker/NewKotlinTypeChecker$WhenMappings;->$EnumSwitchMapping$0:[I

    sget-object v0, Lkotlin/reflect/jvm/internal/impl/types/checker/NewKotlinTypeChecker$WhenMappings;->$EnumSwitchMapping$0:[I

    sget-object v5, Lkotlin/reflect/jvm/internal/impl/types/checker/TypeCheckerContext$LowerCapturedTypePolicy;->CHECK_ONLY_LOWER:Lkotlin/reflect/jvm/internal/impl/types/checker/TypeCheckerContext$LowerCapturedTypePolicy;

    invoke-virtual {v5}, Lkotlin/reflect/jvm/internal/impl/types/checker/TypeCheckerContext$LowerCapturedTypePolicy;->ordinal()I

    move-result v5

    aput v3, v0, v5

    sget-object v0, Lkotlin/reflect/jvm/internal/impl/types/checker/NewKotlinTypeChecker$WhenMappings;->$EnumSwitchMapping$0:[I

    sget-object v5, Lkotlin/reflect/jvm/internal/impl/types/checker/TypeCheckerContext$LowerCapturedTypePolicy;->CHECK_SUBTYPE_AND_LOWER:Lkotlin/reflect/jvm/internal/impl/types/checker/TypeCheckerContext$LowerCapturedTypePolicy;

    invoke-virtual {v5}, Lkotlin/reflect/jvm/internal/impl/types/checker/TypeCheckerContext$LowerCapturedTypePolicy;->ordinal()I

    move-result v5

    aput v2, v0, v5

    sget-object v0, Lkotlin/reflect/jvm/internal/impl/types/checker/NewKotlinTypeChecker$WhenMappings;->$EnumSwitchMapping$0:[I

    sget-object v5, Lkotlin/reflect/jvm/internal/impl/types/checker/TypeCheckerContext$LowerCapturedTypePolicy;->SKIP_LOWER:Lkotlin/reflect/jvm/internal/impl/types/checker/TypeCheckerContext$LowerCapturedTypePolicy;

    invoke-virtual {v5}, Lkotlin/reflect/jvm/internal/impl/types/checker/TypeCheckerContext$LowerCapturedTypePolicy;->ordinal()I

    move-result v5

    aput v1, v0, v5

    invoke-static {}, Lkotlin/reflect/jvm/internal/impl/types/checker/TypeCheckerContext$SeveralSupertypesWithSameConstructorPolicy;->values()[Lkotlin/reflect/jvm/internal/impl/types/checker/TypeCheckerContext$SeveralSupertypesWithSameConstructorPolicy;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    sput-object v0, Lkotlin/reflect/jvm/internal/impl/types/checker/NewKotlinTypeChecker$WhenMappings;->$EnumSwitchMapping$1:[I

    sget-object v0, Lkotlin/reflect/jvm/internal/impl/types/checker/NewKotlinTypeChecker$WhenMappings;->$EnumSwitchMapping$1:[I

    sget-object v5, Lkotlin/reflect/jvm/internal/impl/types/checker/TypeCheckerContext$SeveralSupertypesWithSameConstructorPolicy;->FORCE_NOT_SUBTYPE:Lkotlin/reflect/jvm/internal/impl/types/checker/TypeCheckerContext$SeveralSupertypesWithSameConstructorPolicy;

    invoke-virtual {v5}, Lkotlin/reflect/jvm/internal/impl/types/checker/TypeCheckerContext$SeveralSupertypesWithSameConstructorPolicy;->ordinal()I

    move-result v5

    aput v3, v0, v5

    sget-object v0, Lkotlin/reflect/jvm/internal/impl/types/checker/NewKotlinTypeChecker$WhenMappings;->$EnumSwitchMapping$1:[I

    sget-object v5, Lkotlin/reflect/jvm/internal/impl/types/checker/TypeCheckerContext$SeveralSupertypesWithSameConstructorPolicy;->TAKE_FIRST_FOR_SUBTYPING:Lkotlin/reflect/jvm/internal/impl/types/checker/TypeCheckerContext$SeveralSupertypesWithSameConstructorPolicy;

    invoke-virtual {v5}, Lkotlin/reflect/jvm/internal/impl/types/checker/TypeCheckerContext$SeveralSupertypesWithSameConstructorPolicy;->ordinal()I

    move-result v5

    aput v2, v0, v5

    sget-object v0, Lkotlin/reflect/jvm/internal/impl/types/checker/NewKotlinTypeChecker$WhenMappings;->$EnumSwitchMapping$1:[I

    sget-object v5, Lkotlin/reflect/jvm/internal/impl/types/checker/TypeCheckerContext$SeveralSupertypesWithSameConstructorPolicy;->CHECK_ANY_OF_THEM:Lkotlin/reflect/jvm/internal/impl/types/checker/TypeCheckerContext$SeveralSupertypesWithSameConstructorPolicy;

    invoke-virtual {v5}, Lkotlin/reflect/jvm/internal/impl/types/checker/TypeCheckerContext$SeveralSupertypesWithSameConstructorPolicy;->ordinal()I

    move-result v5

    aput v1, v0, v5

    sget-object v0, Lkotlin/reflect/jvm/internal/impl/types/checker/NewKotlinTypeChecker$WhenMappings;->$EnumSwitchMapping$1:[I

    sget-object v5, Lkotlin/reflect/jvm/internal/impl/types/checker/TypeCheckerContext$SeveralSupertypesWithSameConstructorPolicy;->INTERSECT_ARGUMENTS_AND_CHECK_AGAIN:Lkotlin/reflect/jvm/internal/impl/types/checker/TypeCheckerContext$SeveralSupertypesWithSameConstructorPolicy;

    invoke-virtual {v5}, Lkotlin/reflect/jvm/internal/impl/types/checker/TypeCheckerContext$SeveralSupertypesWithSameConstructorPolicy;->ordinal()I

    move-result v5

    aput v4, v0, v5

    invoke-static {}, Lkotlin/reflect/jvm/internal/impl/types/Variance;->values()[Lkotlin/reflect/jvm/internal/impl/types/Variance;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    sput-object v0, Lkotlin/reflect/jvm/internal/impl/types/checker/NewKotlinTypeChecker$WhenMappings;->$EnumSwitchMapping$2:[I

    sget-object v0, Lkotlin/reflect/jvm/internal/impl/types/checker/NewKotlinTypeChecker$WhenMappings;->$EnumSwitchMapping$2:[I

    sget-object v4, Lkotlin/reflect/jvm/internal/impl/types/Variance;->INVARIANT:Lkotlin/reflect/jvm/internal/impl/types/Variance;

    invoke-virtual {v4}, Lkotlin/reflect/jvm/internal/impl/types/Variance;->ordinal()I

    move-result v4

    aput v3, v0, v4

    sget-object v0, Lkotlin/reflect/jvm/internal/impl/types/checker/NewKotlinTypeChecker$WhenMappings;->$EnumSwitchMapping$2:[I

    sget-object v3, Lkotlin/reflect/jvm/internal/impl/types/Variance;->OUT_VARIANCE:Lkotlin/reflect/jvm/internal/impl/types/Variance;

    invoke-virtual {v3}, Lkotlin/reflect/jvm/internal/impl/types/Variance;->ordinal()I

    move-result v3

    aput v2, v0, v3

    sget-object v0, Lkotlin/reflect/jvm/internal/impl/types/checker/NewKotlinTypeChecker$WhenMappings;->$EnumSwitchMapping$2:[I

    sget-object v2, Lkotlin/reflect/jvm/internal/impl/types/Variance;->IN_VARIANCE:Lkotlin/reflect/jvm/internal/impl/types/Variance;

    invoke-virtual {v2}, Lkotlin/reflect/jvm/internal/impl/types/Variance;->ordinal()I

    move-result v2

    aput v1, v0, v2

    return-void
.end method
