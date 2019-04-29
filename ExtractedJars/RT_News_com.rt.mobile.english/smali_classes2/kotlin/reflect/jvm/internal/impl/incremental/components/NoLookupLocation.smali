.class public final enum Lkotlin/reflect/jvm/internal/impl/incremental/components/NoLookupLocation;
.super Ljava/lang/Enum;
.source "LookupLocation.kt"

# interfaces
.implements Lkotlin/reflect/jvm/internal/impl/incremental/components/LookupLocation;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lkotlin/reflect/jvm/internal/impl/incremental/components/NoLookupLocation;",
        ">;",
        "Lkotlin/reflect/jvm/internal/impl/incremental/components/LookupLocation;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lkotlin/reflect/jvm/internal/impl/incremental/components/NoLookupLocation;

.field public static final enum FOR_ALREADY_TRACKED:Lkotlin/reflect/jvm/internal/impl/incremental/components/NoLookupLocation;

.field public static final enum FOR_DEFAULT_IMPORTS:Lkotlin/reflect/jvm/internal/impl/incremental/components/NoLookupLocation;

.field public static final enum FOR_NON_TRACKED_SCOPE:Lkotlin/reflect/jvm/internal/impl/incremental/components/NoLookupLocation;

.field public static final enum FOR_SCRIPT:Lkotlin/reflect/jvm/internal/impl/incremental/components/NoLookupLocation;

.field public static final enum FROM_BACKEND:Lkotlin/reflect/jvm/internal/impl/incremental/components/NoLookupLocation;

.field public static final enum FROM_BUILTINS:Lkotlin/reflect/jvm/internal/impl/incremental/components/NoLookupLocation;

.field public static final enum FROM_DESERIALIZATION:Lkotlin/reflect/jvm/internal/impl/incremental/components/NoLookupLocation;

.field public static final enum FROM_IDE:Lkotlin/reflect/jvm/internal/impl/incremental/components/NoLookupLocation;

.field public static final enum FROM_JAVA_LOADER:Lkotlin/reflect/jvm/internal/impl/incremental/components/NoLookupLocation;

.field public static final enum FROM_REFLECTION:Lkotlin/reflect/jvm/internal/impl/incremental/components/NoLookupLocation;

.field public static final enum FROM_SYNTHETIC_SCOPE:Lkotlin/reflect/jvm/internal/impl/incremental/components/NoLookupLocation;

.field public static final enum FROM_TEST:Lkotlin/reflect/jvm/internal/impl/incremental/components/NoLookupLocation;

.field public static final enum WHEN_CHECK_DECLARATION_CONFLICTS:Lkotlin/reflect/jvm/internal/impl/incremental/components/NoLookupLocation;

.field public static final enum WHEN_CHECK_OVERRIDES:Lkotlin/reflect/jvm/internal/impl/incremental/components/NoLookupLocation;

.field public static final enum WHEN_FIND_BY_FQNAME:Lkotlin/reflect/jvm/internal/impl/incremental/components/NoLookupLocation;

.field public static final enum WHEN_GET_ALL_DESCRIPTORS:Lkotlin/reflect/jvm/internal/impl/incremental/components/NoLookupLocation;

.field public static final enum WHEN_GET_COMPANION_OBJECT:Lkotlin/reflect/jvm/internal/impl/incremental/components/NoLookupLocation;

.field public static final enum WHEN_GET_DECLARATION_SCOPE:Lkotlin/reflect/jvm/internal/impl/incremental/components/NoLookupLocation;

.field public static final enum WHEN_GET_LOCAL_VARIABLE:Lkotlin/reflect/jvm/internal/impl/incremental/components/NoLookupLocation;

.field public static final enum WHEN_GET_SUPER_MEMBERS:Lkotlin/reflect/jvm/internal/impl/incremental/components/NoLookupLocation;

.field public static final enum WHEN_RESOLVE_DECLARATION:Lkotlin/reflect/jvm/internal/impl/incremental/components/NoLookupLocation;

.field public static final enum WHEN_RESOLVING_DEFAULT_TYPE_ARGUMENTS:Lkotlin/reflect/jvm/internal/impl/incremental/components/NoLookupLocation;

.field public static final enum WHEN_TYPING:Lkotlin/reflect/jvm/internal/impl/incremental/components/NoLookupLocation;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const/16 v0, 0x17

    new-array v0, v0, [Lkotlin/reflect/jvm/internal/impl/incremental/components/NoLookupLocation;

    new-instance v1, Lkotlin/reflect/jvm/internal/impl/incremental/components/NoLookupLocation;

    const-string v2, "FROM_IDE"

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3}, Lkotlin/reflect/jvm/internal/impl/incremental/components/NoLookupLocation;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lkotlin/reflect/jvm/internal/impl/incremental/components/NoLookupLocation;->FROM_IDE:Lkotlin/reflect/jvm/internal/impl/incremental/components/NoLookupLocation;

    aput-object v1, v0, v3

    new-instance v1, Lkotlin/reflect/jvm/internal/impl/incremental/components/NoLookupLocation;

    const-string v2, "FROM_BACKEND"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Lkotlin/reflect/jvm/internal/impl/incremental/components/NoLookupLocation;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lkotlin/reflect/jvm/internal/impl/incremental/components/NoLookupLocation;->FROM_BACKEND:Lkotlin/reflect/jvm/internal/impl/incremental/components/NoLookupLocation;

    aput-object v1, v0, v3

    new-instance v1, Lkotlin/reflect/jvm/internal/impl/incremental/components/NoLookupLocation;

    const-string v2, "FROM_TEST"

    const/4 v3, 0x2

    invoke-direct {v1, v2, v3}, Lkotlin/reflect/jvm/internal/impl/incremental/components/NoLookupLocation;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lkotlin/reflect/jvm/internal/impl/incremental/components/NoLookupLocation;->FROM_TEST:Lkotlin/reflect/jvm/internal/impl/incremental/components/NoLookupLocation;

    aput-object v1, v0, v3

    new-instance v1, Lkotlin/reflect/jvm/internal/impl/incremental/components/NoLookupLocation;

    const-string v2, "FROM_BUILTINS"

    const/4 v3, 0x3

    invoke-direct {v1, v2, v3}, Lkotlin/reflect/jvm/internal/impl/incremental/components/NoLookupLocation;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lkotlin/reflect/jvm/internal/impl/incremental/components/NoLookupLocation;->FROM_BUILTINS:Lkotlin/reflect/jvm/internal/impl/incremental/components/NoLookupLocation;

    aput-object v1, v0, v3

    new-instance v1, Lkotlin/reflect/jvm/internal/impl/incremental/components/NoLookupLocation;

    const-string v2, "WHEN_CHECK_DECLARATION_CONFLICTS"

    const/4 v3, 0x4

    invoke-direct {v1, v2, v3}, Lkotlin/reflect/jvm/internal/impl/incremental/components/NoLookupLocation;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lkotlin/reflect/jvm/internal/impl/incremental/components/NoLookupLocation;->WHEN_CHECK_DECLARATION_CONFLICTS:Lkotlin/reflect/jvm/internal/impl/incremental/components/NoLookupLocation;

    aput-object v1, v0, v3

    new-instance v1, Lkotlin/reflect/jvm/internal/impl/incremental/components/NoLookupLocation;

    const-string v2, "WHEN_CHECK_OVERRIDES"

    const/4 v3, 0x5

    invoke-direct {v1, v2, v3}, Lkotlin/reflect/jvm/internal/impl/incremental/components/NoLookupLocation;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lkotlin/reflect/jvm/internal/impl/incremental/components/NoLookupLocation;->WHEN_CHECK_OVERRIDES:Lkotlin/reflect/jvm/internal/impl/incremental/components/NoLookupLocation;

    aput-object v1, v0, v3

    new-instance v1, Lkotlin/reflect/jvm/internal/impl/incremental/components/NoLookupLocation;

    const-string v2, "FOR_SCRIPT"

    const/4 v3, 0x6

    invoke-direct {v1, v2, v3}, Lkotlin/reflect/jvm/internal/impl/incremental/components/NoLookupLocation;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lkotlin/reflect/jvm/internal/impl/incremental/components/NoLookupLocation;->FOR_SCRIPT:Lkotlin/reflect/jvm/internal/impl/incremental/components/NoLookupLocation;

    aput-object v1, v0, v3

    new-instance v1, Lkotlin/reflect/jvm/internal/impl/incremental/components/NoLookupLocation;

    const-string v2, "FROM_REFLECTION"

    const/4 v3, 0x7

    invoke-direct {v1, v2, v3}, Lkotlin/reflect/jvm/internal/impl/incremental/components/NoLookupLocation;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lkotlin/reflect/jvm/internal/impl/incremental/components/NoLookupLocation;->FROM_REFLECTION:Lkotlin/reflect/jvm/internal/impl/incremental/components/NoLookupLocation;

    aput-object v1, v0, v3

    new-instance v1, Lkotlin/reflect/jvm/internal/impl/incremental/components/NoLookupLocation;

    const-string v2, "WHEN_RESOLVE_DECLARATION"

    const/16 v3, 0x8

    invoke-direct {v1, v2, v3}, Lkotlin/reflect/jvm/internal/impl/incremental/components/NoLookupLocation;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lkotlin/reflect/jvm/internal/impl/incremental/components/NoLookupLocation;->WHEN_RESOLVE_DECLARATION:Lkotlin/reflect/jvm/internal/impl/incremental/components/NoLookupLocation;

    aput-object v1, v0, v3

    new-instance v1, Lkotlin/reflect/jvm/internal/impl/incremental/components/NoLookupLocation;

    const-string v2, "WHEN_GET_DECLARATION_SCOPE"

    const/16 v3, 0x9

    invoke-direct {v1, v2, v3}, Lkotlin/reflect/jvm/internal/impl/incremental/components/NoLookupLocation;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lkotlin/reflect/jvm/internal/impl/incremental/components/NoLookupLocation;->WHEN_GET_DECLARATION_SCOPE:Lkotlin/reflect/jvm/internal/impl/incremental/components/NoLookupLocation;

    aput-object v1, v0, v3

    new-instance v1, Lkotlin/reflect/jvm/internal/impl/incremental/components/NoLookupLocation;

    const-string v2, "WHEN_RESOLVING_DEFAULT_TYPE_ARGUMENTS"

    const/16 v3, 0xa

    invoke-direct {v1, v2, v3}, Lkotlin/reflect/jvm/internal/impl/incremental/components/NoLookupLocation;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lkotlin/reflect/jvm/internal/impl/incremental/components/NoLookupLocation;->WHEN_RESOLVING_DEFAULT_TYPE_ARGUMENTS:Lkotlin/reflect/jvm/internal/impl/incremental/components/NoLookupLocation;

    aput-object v1, v0, v3

    new-instance v1, Lkotlin/reflect/jvm/internal/impl/incremental/components/NoLookupLocation;

    const-string v2, "FOR_ALREADY_TRACKED"

    const/16 v3, 0xb

    invoke-direct {v1, v2, v3}, Lkotlin/reflect/jvm/internal/impl/incremental/components/NoLookupLocation;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lkotlin/reflect/jvm/internal/impl/incremental/components/NoLookupLocation;->FOR_ALREADY_TRACKED:Lkotlin/reflect/jvm/internal/impl/incremental/components/NoLookupLocation;

    aput-object v1, v0, v3

    new-instance v1, Lkotlin/reflect/jvm/internal/impl/incremental/components/NoLookupLocation;

    const-string v2, "WHEN_GET_ALL_DESCRIPTORS"

    const/16 v3, 0xc

    invoke-direct {v1, v2, v3}, Lkotlin/reflect/jvm/internal/impl/incremental/components/NoLookupLocation;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lkotlin/reflect/jvm/internal/impl/incremental/components/NoLookupLocation;->WHEN_GET_ALL_DESCRIPTORS:Lkotlin/reflect/jvm/internal/impl/incremental/components/NoLookupLocation;

    aput-object v1, v0, v3

    new-instance v1, Lkotlin/reflect/jvm/internal/impl/incremental/components/NoLookupLocation;

    const-string v2, "WHEN_TYPING"

    const/16 v3, 0xd

    invoke-direct {v1, v2, v3}, Lkotlin/reflect/jvm/internal/impl/incremental/components/NoLookupLocation;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lkotlin/reflect/jvm/internal/impl/incremental/components/NoLookupLocation;->WHEN_TYPING:Lkotlin/reflect/jvm/internal/impl/incremental/components/NoLookupLocation;

    aput-object v1, v0, v3

    new-instance v1, Lkotlin/reflect/jvm/internal/impl/incremental/components/NoLookupLocation;

    const-string v2, "WHEN_GET_SUPER_MEMBERS"

    const/16 v3, 0xe

    invoke-direct {v1, v2, v3}, Lkotlin/reflect/jvm/internal/impl/incremental/components/NoLookupLocation;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lkotlin/reflect/jvm/internal/impl/incremental/components/NoLookupLocation;->WHEN_GET_SUPER_MEMBERS:Lkotlin/reflect/jvm/internal/impl/incremental/components/NoLookupLocation;

    aput-object v1, v0, v3

    new-instance v1, Lkotlin/reflect/jvm/internal/impl/incremental/components/NoLookupLocation;

    const-string v2, "FOR_NON_TRACKED_SCOPE"

    const/16 v3, 0xf

    invoke-direct {v1, v2, v3}, Lkotlin/reflect/jvm/internal/impl/incremental/components/NoLookupLocation;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lkotlin/reflect/jvm/internal/impl/incremental/components/NoLookupLocation;->FOR_NON_TRACKED_SCOPE:Lkotlin/reflect/jvm/internal/impl/incremental/components/NoLookupLocation;

    const/16 v2, 0xf

    aput-object v1, v0, v2

    new-instance v1, Lkotlin/reflect/jvm/internal/impl/incremental/components/NoLookupLocation;

    const-string v2, "FROM_SYNTHETIC_SCOPE"

    const/16 v3, 0x10

    invoke-direct {v1, v2, v3}, Lkotlin/reflect/jvm/internal/impl/incremental/components/NoLookupLocation;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lkotlin/reflect/jvm/internal/impl/incremental/components/NoLookupLocation;->FROM_SYNTHETIC_SCOPE:Lkotlin/reflect/jvm/internal/impl/incremental/components/NoLookupLocation;

    const/16 v2, 0x10

    aput-object v1, v0, v2

    new-instance v1, Lkotlin/reflect/jvm/internal/impl/incremental/components/NoLookupLocation;

    const-string v2, "FROM_DESERIALIZATION"

    const/16 v3, 0x11

    invoke-direct {v1, v2, v3}, Lkotlin/reflect/jvm/internal/impl/incremental/components/NoLookupLocation;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lkotlin/reflect/jvm/internal/impl/incremental/components/NoLookupLocation;->FROM_DESERIALIZATION:Lkotlin/reflect/jvm/internal/impl/incremental/components/NoLookupLocation;

    const/16 v2, 0x11

    aput-object v1, v0, v2

    new-instance v1, Lkotlin/reflect/jvm/internal/impl/incremental/components/NoLookupLocation;

    const-string v2, "FROM_JAVA_LOADER"

    const/16 v3, 0x12

    invoke-direct {v1, v2, v3}, Lkotlin/reflect/jvm/internal/impl/incremental/components/NoLookupLocation;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lkotlin/reflect/jvm/internal/impl/incremental/components/NoLookupLocation;->FROM_JAVA_LOADER:Lkotlin/reflect/jvm/internal/impl/incremental/components/NoLookupLocation;

    const/16 v2, 0x12

    aput-object v1, v0, v2

    new-instance v1, Lkotlin/reflect/jvm/internal/impl/incremental/components/NoLookupLocation;

    const-string v2, "WHEN_GET_LOCAL_VARIABLE"

    const/16 v3, 0x13

    invoke-direct {v1, v2, v3}, Lkotlin/reflect/jvm/internal/impl/incremental/components/NoLookupLocation;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lkotlin/reflect/jvm/internal/impl/incremental/components/NoLookupLocation;->WHEN_GET_LOCAL_VARIABLE:Lkotlin/reflect/jvm/internal/impl/incremental/components/NoLookupLocation;

    const/16 v2, 0x13

    aput-object v1, v0, v2

    new-instance v1, Lkotlin/reflect/jvm/internal/impl/incremental/components/NoLookupLocation;

    const-string v2, "WHEN_FIND_BY_FQNAME"

    const/16 v3, 0x14

    invoke-direct {v1, v2, v3}, Lkotlin/reflect/jvm/internal/impl/incremental/components/NoLookupLocation;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lkotlin/reflect/jvm/internal/impl/incremental/components/NoLookupLocation;->WHEN_FIND_BY_FQNAME:Lkotlin/reflect/jvm/internal/impl/incremental/components/NoLookupLocation;

    const/16 v2, 0x14

    aput-object v1, v0, v2

    new-instance v1, Lkotlin/reflect/jvm/internal/impl/incremental/components/NoLookupLocation;

    const-string v2, "WHEN_GET_COMPANION_OBJECT"

    const/16 v3, 0x15

    invoke-direct {v1, v2, v3}, Lkotlin/reflect/jvm/internal/impl/incremental/components/NoLookupLocation;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lkotlin/reflect/jvm/internal/impl/incremental/components/NoLookupLocation;->WHEN_GET_COMPANION_OBJECT:Lkotlin/reflect/jvm/internal/impl/incremental/components/NoLookupLocation;

    const/16 v2, 0x15

    aput-object v1, v0, v2

    new-instance v1, Lkotlin/reflect/jvm/internal/impl/incremental/components/NoLookupLocation;

    const-string v2, "FOR_DEFAULT_IMPORTS"

    const/16 v3, 0x16

    invoke-direct {v1, v2, v3}, Lkotlin/reflect/jvm/internal/impl/incremental/components/NoLookupLocation;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lkotlin/reflect/jvm/internal/impl/incremental/components/NoLookupLocation;->FOR_DEFAULT_IMPORTS:Lkotlin/reflect/jvm/internal/impl/incremental/components/NoLookupLocation;

    const/16 v2, 0x16

    aput-object v1, v0, v2

    sput-object v0, Lkotlin/reflect/jvm/internal/impl/incremental/components/NoLookupLocation;->$VALUES:[Lkotlin/reflect/jvm/internal/impl/incremental/components/NoLookupLocation;

    return-void
.end method

.method protected constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 38
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lkotlin/reflect/jvm/internal/impl/incremental/components/NoLookupLocation;
    .locals 1

    const-class v0, Lkotlin/reflect/jvm/internal/impl/incremental/components/NoLookupLocation;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lkotlin/reflect/jvm/internal/impl/incremental/components/NoLookupLocation;

    return-object p0
.end method

.method public static values()[Lkotlin/reflect/jvm/internal/impl/incremental/components/NoLookupLocation;
    .locals 1

    sget-object v0, Lkotlin/reflect/jvm/internal/impl/incremental/components/NoLookupLocation;->$VALUES:[Lkotlin/reflect/jvm/internal/impl/incremental/components/NoLookupLocation;

    invoke-virtual {v0}, [Lkotlin/reflect/jvm/internal/impl/incremental/components/NoLookupLocation;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lkotlin/reflect/jvm/internal/impl/incremental/components/NoLookupLocation;

    return-object v0
.end method


# virtual methods
.method public getLocation()Lkotlin/reflect/jvm/internal/impl/incremental/components/LocationInfo;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    const/4 v0, 0x0

    return-object v0
.end method
