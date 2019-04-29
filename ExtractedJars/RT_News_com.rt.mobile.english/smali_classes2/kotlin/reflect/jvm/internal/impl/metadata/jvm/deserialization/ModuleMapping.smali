.class public final Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/ModuleMapping;
.super Ljava/lang/Object;
.source "ModuleMapping.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/ModuleMapping$Companion;
    }
.end annotation


# static fields
.field public static final CORRUPTED:Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/ModuleMapping;
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final Companion:Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/ModuleMapping$Companion;

.field public static final EMPTY:Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/ModuleMapping;
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field private final debugName:Ljava/lang/String;

.field private final moduleData:Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/BinaryModuleData;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final packageFqName2Parts:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/PackageParts;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/ModuleMapping$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/ModuleMapping$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/ModuleMapping;->Companion:Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/ModuleMapping$Companion;

    .line 29
    new-instance v0, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/ModuleMapping;

    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object v1

    new-instance v2, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/BinaryModuleData;

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v3

    invoke-direct {v2, v3}, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/BinaryModuleData;-><init>(Ljava/util/List;)V

    const-string v3, "EMPTY"

    invoke-direct {v0, v1, v2, v3}, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/ModuleMapping;-><init>(Ljava/util/Map;Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/BinaryModuleData;Ljava/lang/String;)V

    sput-object v0, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/ModuleMapping;->EMPTY:Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/ModuleMapping;

    .line 32
    new-instance v0, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/ModuleMapping;

    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object v1

    new-instance v2, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/BinaryModuleData;

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v3

    invoke-direct {v2, v3}, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/BinaryModuleData;-><init>(Ljava/util/List;)V

    const-string v3, "CORRUPTED"

    invoke-direct {v0, v1, v2, v3}, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/ModuleMapping;-><init>(Ljava/util/Map;Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/BinaryModuleData;Ljava/lang/String;)V

    sput-object v0, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/ModuleMapping;->CORRUPTED:Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/ModuleMapping;

    return-void
.end method

.method private constructor <init>(Ljava/util/Map;Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/BinaryModuleData;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/PackageParts;",
            ">;",
            "Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/BinaryModuleData;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/ModuleMapping;->packageFqName2Parts:Ljava/util/Map;

    iput-object p2, p0, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/ModuleMapping;->moduleData:Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/BinaryModuleData;

    iput-object p3, p0, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/ModuleMapping;->debugName:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/Map;Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/BinaryModuleData;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0
    .param p1    # Ljava/util/Map;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/BinaryModuleData;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 14
    invoke-direct {p0, p1, p2, p3}, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/ModuleMapping;-><init>(Ljava/util/Map;Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/BinaryModuleData;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final getPackageFqName2Parts()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/PackageParts;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 15
    iget-object v0, p0, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/ModuleMapping;->packageFqName2Parts:Ljava/util/Map;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 23
    iget-object v0, p0, Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/ModuleMapping;->debugName:Ljava/lang/String;

    return-object v0
.end method
