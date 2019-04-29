.class final enum Lkotlin/reflect/jvm/internal/impl/name/State;
.super Ljava/lang/Enum;
.source "FqNamesUtil.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lkotlin/reflect/jvm/internal/impl/name/State;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lkotlin/reflect/jvm/internal/impl/name/State;

.field public static final enum AFTER_DOT:Lkotlin/reflect/jvm/internal/impl/name/State;

.field public static final enum BEGINNING:Lkotlin/reflect/jvm/internal/impl/name/State;

.field public static final enum MIDDLE:Lkotlin/reflect/jvm/internal/impl/name/State;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const/4 v0, 0x3

    new-array v0, v0, [Lkotlin/reflect/jvm/internal/impl/name/State;

    new-instance v1, Lkotlin/reflect/jvm/internal/impl/name/State;

    const-string v2, "BEGINNING"

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3}, Lkotlin/reflect/jvm/internal/impl/name/State;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lkotlin/reflect/jvm/internal/impl/name/State;->BEGINNING:Lkotlin/reflect/jvm/internal/impl/name/State;

    aput-object v1, v0, v3

    new-instance v1, Lkotlin/reflect/jvm/internal/impl/name/State;

    const-string v2, "MIDDLE"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Lkotlin/reflect/jvm/internal/impl/name/State;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lkotlin/reflect/jvm/internal/impl/name/State;->MIDDLE:Lkotlin/reflect/jvm/internal/impl/name/State;

    aput-object v1, v0, v3

    new-instance v1, Lkotlin/reflect/jvm/internal/impl/name/State;

    const-string v2, "AFTER_DOT"

    const/4 v3, 0x2

    invoke-direct {v1, v2, v3}, Lkotlin/reflect/jvm/internal/impl/name/State;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lkotlin/reflect/jvm/internal/impl/name/State;->AFTER_DOT:Lkotlin/reflect/jvm/internal/impl/name/State;

    aput-object v1, v0, v3

    sput-object v0, Lkotlin/reflect/jvm/internal/impl/name/State;->$VALUES:[Lkotlin/reflect/jvm/internal/impl/name/State;

    return-void
.end method

.method protected constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 54
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lkotlin/reflect/jvm/internal/impl/name/State;
    .locals 1

    const-class v0, Lkotlin/reflect/jvm/internal/impl/name/State;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lkotlin/reflect/jvm/internal/impl/name/State;

    return-object p0
.end method

.method public static values()[Lkotlin/reflect/jvm/internal/impl/name/State;
    .locals 1

    sget-object v0, Lkotlin/reflect/jvm/internal/impl/name/State;->$VALUES:[Lkotlin/reflect/jvm/internal/impl/name/State;

    invoke-virtual {v0}, [Lkotlin/reflect/jvm/internal/impl/name/State;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lkotlin/reflect/jvm/internal/impl/name/State;

    return-object v0
.end method
