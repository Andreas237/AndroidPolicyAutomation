.class final Lkotlin/reflect/jvm/internal/impl/builtins/jvm/FallbackBuiltIns;
.super Lkotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns;
.source "JvmBuiltInsSettings.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkotlin/reflect/jvm/internal/impl/builtins/jvm/FallbackBuiltIns$Companion;
    }
.end annotation


# static fields
.field public static final Companion:Lkotlin/reflect/jvm/internal/impl/builtins/jvm/FallbackBuiltIns$Companion;

.field private static final initializer:Lkotlin/reflect/jvm/internal/impl/builtins/BuiltInsInitializer;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/reflect/jvm/internal/impl/builtins/BuiltInsInitializer<",
            "Lkotlin/reflect/jvm/internal/impl/builtins/jvm/FallbackBuiltIns;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lkotlin/reflect/jvm/internal/impl/builtins/jvm/FallbackBuiltIns$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lkotlin/reflect/jvm/internal/impl/builtins/jvm/FallbackBuiltIns$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lkotlin/reflect/jvm/internal/impl/builtins/jvm/FallbackBuiltIns;->Companion:Lkotlin/reflect/jvm/internal/impl/builtins/jvm/FallbackBuiltIns$Companion;

    .line 503
    new-instance v0, Lkotlin/reflect/jvm/internal/impl/builtins/BuiltInsInitializer;

    sget-object v1, Lkotlin/reflect/jvm/internal/impl/builtins/jvm/FallbackBuiltIns$Companion$initializer$1;->INSTANCE:Lkotlin/reflect/jvm/internal/impl/builtins/jvm/FallbackBuiltIns$Companion$initializer$1;

    check-cast v1, Lkotlin/jvm/functions/Function0;

    invoke-direct {v0, v1}, Lkotlin/reflect/jvm/internal/impl/builtins/BuiltInsInitializer;-><init>(Lkotlin/jvm/functions/Function0;)V

    sput-object v0, Lkotlin/reflect/jvm/internal/impl/builtins/jvm/FallbackBuiltIns;->initializer:Lkotlin/reflect/jvm/internal/impl/builtins/BuiltInsInitializer;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .line 497
    new-instance v0, Lkotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager;

    invoke-direct {v0}, Lkotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager;-><init>()V

    check-cast v0, Lkotlin/reflect/jvm/internal/impl/storage/StorageManager;

    invoke-direct {p0, v0}, Lkotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns;-><init>(Lkotlin/reflect/jvm/internal/impl/storage/StorageManager;)V

    .line 499
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/builtins/jvm/FallbackBuiltIns;->createBuiltInsModule()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 497
    invoke-direct {p0}, Lkotlin/reflect/jvm/internal/impl/builtins/jvm/FallbackBuiltIns;-><init>()V

    return-void
.end method

.method public static final synthetic access$getInitializer$cp()Lkotlin/reflect/jvm/internal/impl/builtins/BuiltInsInitializer;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 497
    sget-object v0, Lkotlin/reflect/jvm/internal/impl/builtins/jvm/FallbackBuiltIns;->initializer:Lkotlin/reflect/jvm/internal/impl/builtins/BuiltInsInitializer;

    return-object v0
.end method


# virtual methods
.method protected getPlatformDependentDeclarationFilter()Lkotlin/reflect/jvm/internal/impl/descriptors/deserialization/PlatformDependentDeclarationFilter$All;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 512
    sget-object v0, Lkotlin/reflect/jvm/internal/impl/descriptors/deserialization/PlatformDependentDeclarationFilter$All;->INSTANCE:Lkotlin/reflect/jvm/internal/impl/descriptors/deserialization/PlatformDependentDeclarationFilter$All;

    return-object v0
.end method

.method public bridge synthetic getPlatformDependentDeclarationFilter()Lkotlin/reflect/jvm/internal/impl/descriptors/deserialization/PlatformDependentDeclarationFilter;
    .locals 1

    .line 497
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/builtins/jvm/FallbackBuiltIns;->getPlatformDependentDeclarationFilter()Lkotlin/reflect/jvm/internal/impl/descriptors/deserialization/PlatformDependentDeclarationFilter$All;

    move-result-object v0

    check-cast v0, Lkotlin/reflect/jvm/internal/impl/descriptors/deserialization/PlatformDependentDeclarationFilter;

    return-object v0
.end method
