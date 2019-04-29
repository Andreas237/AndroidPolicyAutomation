.class public final enum Lkotlin/reflect/jvm/internal/impl/renderer/DescriptorRendererModifier;
.super Ljava/lang/Enum;
.source "DescriptorRenderer.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkotlin/reflect/jvm/internal/impl/renderer/DescriptorRendererModifier$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lkotlin/reflect/jvm/internal/impl/renderer/DescriptorRendererModifier;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nDescriptorRenderer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DescriptorRenderer.kt\norg/jetbrains/kotlin/renderer/DescriptorRendererModifier\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,281:1\n3263#2:282\n3680#2,2:283\n*E\n*S KotlinDebug\n*F\n+ 1 DescriptorRenderer.kt\norg/jetbrains/kotlin/renderer/DescriptorRendererModifier\n*L\n275#1:282\n275#1,2:283\n*E\n"
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lkotlin/reflect/jvm/internal/impl/renderer/DescriptorRendererModifier;

.field public static final enum ACTUAL:Lkotlin/reflect/jvm/internal/impl/renderer/DescriptorRendererModifier;

.field public static final ALL:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lkotlin/reflect/jvm/internal/impl/renderer/DescriptorRendererModifier;",
            ">;"
        }
    .end annotation

    .annotation build Lkotlin/jvm/JvmField;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final enum ANNOTATIONS:Lkotlin/reflect/jvm/internal/impl/renderer/DescriptorRendererModifier;

.field public static final Companion:Lkotlin/reflect/jvm/internal/impl/renderer/DescriptorRendererModifier$Companion;

.field public static final enum DATA:Lkotlin/reflect/jvm/internal/impl/renderer/DescriptorRendererModifier;

.field public static final DEFAULTS:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lkotlin/reflect/jvm/internal/impl/renderer/DescriptorRendererModifier;",
            ">;"
        }
    .end annotation

    .annotation build Lkotlin/jvm/JvmField;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final enum EXPECT:Lkotlin/reflect/jvm/internal/impl/renderer/DescriptorRendererModifier;

.field public static final enum INLINE:Lkotlin/reflect/jvm/internal/impl/renderer/DescriptorRendererModifier;

.field public static final enum INNER:Lkotlin/reflect/jvm/internal/impl/renderer/DescriptorRendererModifier;

.field public static final enum MEMBER_KIND:Lkotlin/reflect/jvm/internal/impl/renderer/DescriptorRendererModifier;

.field public static final enum MODALITY:Lkotlin/reflect/jvm/internal/impl/renderer/DescriptorRendererModifier;

.field public static final enum OVERRIDE:Lkotlin/reflect/jvm/internal/impl/renderer/DescriptorRendererModifier;

.field public static final enum VISIBILITY:Lkotlin/reflect/jvm/internal/impl/renderer/DescriptorRendererModifier;


# instance fields
.field private final includeByDefault:Z


# direct methods
.method static constructor <clinit>()V
    .locals 6

    const/16 v0, 0xa

    new-array v0, v0, [Lkotlin/reflect/jvm/internal/impl/renderer/DescriptorRendererModifier;

    new-instance v1, Lkotlin/reflect/jvm/internal/impl/renderer/DescriptorRendererModifier;

    const-string v2, "VISIBILITY"

    const/4 v3, 0x0

    const/4 v4, 0x1

    .line 261
    invoke-direct {v1, v2, v3, v4}, Lkotlin/reflect/jvm/internal/impl/renderer/DescriptorRendererModifier;-><init>(Ljava/lang/String;IZ)V

    sput-object v1, Lkotlin/reflect/jvm/internal/impl/renderer/DescriptorRendererModifier;->VISIBILITY:Lkotlin/reflect/jvm/internal/impl/renderer/DescriptorRendererModifier;

    aput-object v1, v0, v3

    new-instance v1, Lkotlin/reflect/jvm/internal/impl/renderer/DescriptorRendererModifier;

    const-string v2, "MODALITY"

    .line 262
    invoke-direct {v1, v2, v4, v4}, Lkotlin/reflect/jvm/internal/impl/renderer/DescriptorRendererModifier;-><init>(Ljava/lang/String;IZ)V

    sput-object v1, Lkotlin/reflect/jvm/internal/impl/renderer/DescriptorRendererModifier;->MODALITY:Lkotlin/reflect/jvm/internal/impl/renderer/DescriptorRendererModifier;

    aput-object v1, v0, v4

    new-instance v1, Lkotlin/reflect/jvm/internal/impl/renderer/DescriptorRendererModifier;

    const-string v2, "OVERRIDE"

    const/4 v5, 0x2

    .line 263
    invoke-direct {v1, v2, v5, v4}, Lkotlin/reflect/jvm/internal/impl/renderer/DescriptorRendererModifier;-><init>(Ljava/lang/String;IZ)V

    sput-object v1, Lkotlin/reflect/jvm/internal/impl/renderer/DescriptorRendererModifier;->OVERRIDE:Lkotlin/reflect/jvm/internal/impl/renderer/DescriptorRendererModifier;

    aput-object v1, v0, v5

    new-instance v1, Lkotlin/reflect/jvm/internal/impl/renderer/DescriptorRendererModifier;

    const-string v2, "ANNOTATIONS"

    const/4 v5, 0x3

    .line 264
    invoke-direct {v1, v2, v5, v3}, Lkotlin/reflect/jvm/internal/impl/renderer/DescriptorRendererModifier;-><init>(Ljava/lang/String;IZ)V

    sput-object v1, Lkotlin/reflect/jvm/internal/impl/renderer/DescriptorRendererModifier;->ANNOTATIONS:Lkotlin/reflect/jvm/internal/impl/renderer/DescriptorRendererModifier;

    aput-object v1, v0, v5

    new-instance v1, Lkotlin/reflect/jvm/internal/impl/renderer/DescriptorRendererModifier;

    const-string v2, "INNER"

    const/4 v5, 0x4

    .line 265
    invoke-direct {v1, v2, v5, v4}, Lkotlin/reflect/jvm/internal/impl/renderer/DescriptorRendererModifier;-><init>(Ljava/lang/String;IZ)V

    sput-object v1, Lkotlin/reflect/jvm/internal/impl/renderer/DescriptorRendererModifier;->INNER:Lkotlin/reflect/jvm/internal/impl/renderer/DescriptorRendererModifier;

    aput-object v1, v0, v5

    new-instance v1, Lkotlin/reflect/jvm/internal/impl/renderer/DescriptorRendererModifier;

    const-string v2, "MEMBER_KIND"

    const/4 v5, 0x5

    .line 266
    invoke-direct {v1, v2, v5, v4}, Lkotlin/reflect/jvm/internal/impl/renderer/DescriptorRendererModifier;-><init>(Ljava/lang/String;IZ)V

    sput-object v1, Lkotlin/reflect/jvm/internal/impl/renderer/DescriptorRendererModifier;->MEMBER_KIND:Lkotlin/reflect/jvm/internal/impl/renderer/DescriptorRendererModifier;

    aput-object v1, v0, v5

    new-instance v1, Lkotlin/reflect/jvm/internal/impl/renderer/DescriptorRendererModifier;

    const-string v2, "DATA"

    const/4 v5, 0x6

    .line 267
    invoke-direct {v1, v2, v5, v4}, Lkotlin/reflect/jvm/internal/impl/renderer/DescriptorRendererModifier;-><init>(Ljava/lang/String;IZ)V

    sput-object v1, Lkotlin/reflect/jvm/internal/impl/renderer/DescriptorRendererModifier;->DATA:Lkotlin/reflect/jvm/internal/impl/renderer/DescriptorRendererModifier;

    aput-object v1, v0, v5

    new-instance v1, Lkotlin/reflect/jvm/internal/impl/renderer/DescriptorRendererModifier;

    const-string v2, "INLINE"

    const/4 v5, 0x7

    .line 268
    invoke-direct {v1, v2, v5, v4}, Lkotlin/reflect/jvm/internal/impl/renderer/DescriptorRendererModifier;-><init>(Ljava/lang/String;IZ)V

    sput-object v1, Lkotlin/reflect/jvm/internal/impl/renderer/DescriptorRendererModifier;->INLINE:Lkotlin/reflect/jvm/internal/impl/renderer/DescriptorRendererModifier;

    aput-object v1, v0, v5

    new-instance v1, Lkotlin/reflect/jvm/internal/impl/renderer/DescriptorRendererModifier;

    const-string v2, "EXPECT"

    const/16 v5, 0x8

    .line 269
    invoke-direct {v1, v2, v5, v4}, Lkotlin/reflect/jvm/internal/impl/renderer/DescriptorRendererModifier;-><init>(Ljava/lang/String;IZ)V

    sput-object v1, Lkotlin/reflect/jvm/internal/impl/renderer/DescriptorRendererModifier;->EXPECT:Lkotlin/reflect/jvm/internal/impl/renderer/DescriptorRendererModifier;

    aput-object v1, v0, v5

    new-instance v1, Lkotlin/reflect/jvm/internal/impl/renderer/DescriptorRendererModifier;

    const-string v2, "ACTUAL"

    const/16 v5, 0x9

    .line 270
    invoke-direct {v1, v2, v5, v4}, Lkotlin/reflect/jvm/internal/impl/renderer/DescriptorRendererModifier;-><init>(Ljava/lang/String;IZ)V

    sput-object v1, Lkotlin/reflect/jvm/internal/impl/renderer/DescriptorRendererModifier;->ACTUAL:Lkotlin/reflect/jvm/internal/impl/renderer/DescriptorRendererModifier;

    aput-object v1, v0, v5

    sput-object v0, Lkotlin/reflect/jvm/internal/impl/renderer/DescriptorRendererModifier;->$VALUES:[Lkotlin/reflect/jvm/internal/impl/renderer/DescriptorRendererModifier;

    new-instance v0, Lkotlin/reflect/jvm/internal/impl/renderer/DescriptorRendererModifier$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lkotlin/reflect/jvm/internal/impl/renderer/DescriptorRendererModifier$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lkotlin/reflect/jvm/internal/impl/renderer/DescriptorRendererModifier;->Companion:Lkotlin/reflect/jvm/internal/impl/renderer/DescriptorRendererModifier$Companion;

    .line 275
    invoke-static {}, Lkotlin/reflect/jvm/internal/impl/renderer/DescriptorRendererModifier;->values()[Lkotlin/reflect/jvm/internal/impl/renderer/DescriptorRendererModifier;

    move-result-object v0

    .line 282
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    check-cast v1, Ljava/util/Collection;

    .line 283
    array-length v2, v0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, v0, v3

    .line 275
    iget-boolean v5, v4, Lkotlin/reflect/jvm/internal/impl/renderer/DescriptorRendererModifier;->includeByDefault:Z

    if-eqz v5, :cond_0

    invoke-interface {v1, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 284
    :cond_1
    check-cast v1, Ljava/util/List;

    check-cast v1, Ljava/lang/Iterable;

    .line 275
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->toSet(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, Lkotlin/reflect/jvm/internal/impl/renderer/DescriptorRendererModifier;->DEFAULTS:Ljava/util/Set;

    .line 278
    invoke-static {}, Lkotlin/reflect/jvm/internal/impl/renderer/DescriptorRendererModifier;->values()[Lkotlin/reflect/jvm/internal/impl/renderer/DescriptorRendererModifier;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/ArraysKt;->toSet([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, Lkotlin/reflect/jvm/internal/impl/renderer/DescriptorRendererModifier;->ALL:Ljava/util/Set;

    return-void
.end method

.method protected constructor <init>(Ljava/lang/String;IZ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)V"
        }
    .end annotation

    .line 260
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-boolean p3, p0, Lkotlin/reflect/jvm/internal/impl/renderer/DescriptorRendererModifier;->includeByDefault:Z

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lkotlin/reflect/jvm/internal/impl/renderer/DescriptorRendererModifier;
    .locals 1

    const-class v0, Lkotlin/reflect/jvm/internal/impl/renderer/DescriptorRendererModifier;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lkotlin/reflect/jvm/internal/impl/renderer/DescriptorRendererModifier;

    return-object p0
.end method

.method public static values()[Lkotlin/reflect/jvm/internal/impl/renderer/DescriptorRendererModifier;
    .locals 1

    sget-object v0, Lkotlin/reflect/jvm/internal/impl/renderer/DescriptorRendererModifier;->$VALUES:[Lkotlin/reflect/jvm/internal/impl/renderer/DescriptorRendererModifier;

    invoke-virtual {v0}, [Lkotlin/reflect/jvm/internal/impl/renderer/DescriptorRendererModifier;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lkotlin/reflect/jvm/internal/impl/renderer/DescriptorRendererModifier;

    return-object v0
.end method
