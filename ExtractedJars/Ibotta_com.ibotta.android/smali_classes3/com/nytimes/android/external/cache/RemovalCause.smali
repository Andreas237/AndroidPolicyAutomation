.class public abstract enum Lcom/nytimes/android/external/cache/RemovalCause;
.super Ljava/lang/Enum;
.source "RemovalCause.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/nytimes/android/external/cache/RemovalCause;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/nytimes/android/external/cache/RemovalCause;

.field public static final enum COLLECTED:Lcom/nytimes/android/external/cache/RemovalCause;

.field public static final enum EXPIRED:Lcom/nytimes/android/external/cache/RemovalCause;

.field public static final enum EXPLICIT:Lcom/nytimes/android/external/cache/RemovalCause;

.field public static final enum REPLACED:Lcom/nytimes/android/external/cache/RemovalCause;

.field public static final enum SIZE:Lcom/nytimes/android/external/cache/RemovalCause;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 27
    new-instance v0, Lcom/nytimes/android/external/cache/RemovalCause$1;

    const-string v1, "EXPLICIT"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/nytimes/android/external/cache/RemovalCause$1;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/nytimes/android/external/cache/RemovalCause;->EXPLICIT:Lcom/nytimes/android/external/cache/RemovalCause;

    .line 34
    new-instance v0, Lcom/nytimes/android/external/cache/RemovalCause$2;

    const-string v1, "REPLACED"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/nytimes/android/external/cache/RemovalCause$2;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/nytimes/android/external/cache/RemovalCause;->REPLACED:Lcom/nytimes/android/external/cache/RemovalCause;

    .line 42
    new-instance v0, Lcom/nytimes/android/external/cache/RemovalCause$3;

    const-string v1, "COLLECTED"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Lcom/nytimes/android/external/cache/RemovalCause$3;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/nytimes/android/external/cache/RemovalCause;->COLLECTED:Lcom/nytimes/android/external/cache/RemovalCause;

    .line 49
    new-instance v0, Lcom/nytimes/android/external/cache/RemovalCause$4;

    const-string v1, "EXPIRED"

    const/4 v5, 0x3

    invoke-direct {v0, v1, v5}, Lcom/nytimes/android/external/cache/RemovalCause$4;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/nytimes/android/external/cache/RemovalCause;->EXPIRED:Lcom/nytimes/android/external/cache/RemovalCause;

    .line 57
    new-instance v0, Lcom/nytimes/android/external/cache/RemovalCause$5;

    const-string v1, "SIZE"

    const/4 v6, 0x4

    invoke-direct {v0, v1, v6}, Lcom/nytimes/android/external/cache/RemovalCause$5;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/nytimes/android/external/cache/RemovalCause;->SIZE:Lcom/nytimes/android/external/cache/RemovalCause;

    const/4 v0, 0x5

    .line 25
    new-array v0, v0, [Lcom/nytimes/android/external/cache/RemovalCause;

    sget-object v1, Lcom/nytimes/android/external/cache/RemovalCause;->EXPLICIT:Lcom/nytimes/android/external/cache/RemovalCause;

    aput-object v1, v0, v2

    sget-object v1, Lcom/nytimes/android/external/cache/RemovalCause;->REPLACED:Lcom/nytimes/android/external/cache/RemovalCause;

    aput-object v1, v0, v3

    sget-object v1, Lcom/nytimes/android/external/cache/RemovalCause;->COLLECTED:Lcom/nytimes/android/external/cache/RemovalCause;

    aput-object v1, v0, v4

    sget-object v1, Lcom/nytimes/android/external/cache/RemovalCause;->EXPIRED:Lcom/nytimes/android/external/cache/RemovalCause;

    aput-object v1, v0, v5

    sget-object v1, Lcom/nytimes/android/external/cache/RemovalCause;->SIZE:Lcom/nytimes/android/external/cache/RemovalCause;

    aput-object v1, v0, v6

    sput-object v0, Lcom/nytimes/android/external/cache/RemovalCause;->$VALUES:[Lcom/nytimes/android/external/cache/RemovalCause;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 25
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/String;ILcom/nytimes/android/external/cache/RemovalCause$1;)V
    .locals 0

    .line 25
    invoke-direct {p0, p1, p2}, Lcom/nytimes/android/external/cache/RemovalCause;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/nytimes/android/external/cache/RemovalCause;
    .locals 1

    .line 25
    const-class v0, Lcom/nytimes/android/external/cache/RemovalCause;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/nytimes/android/external/cache/RemovalCause;

    return-object p0
.end method

.method public static values()[Lcom/nytimes/android/external/cache/RemovalCause;
    .locals 1

    .line 25
    sget-object v0, Lcom/nytimes/android/external/cache/RemovalCause;->$VALUES:[Lcom/nytimes/android/external/cache/RemovalCause;

    invoke-virtual {v0}, [Lcom/nytimes/android/external/cache/RemovalCause;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/nytimes/android/external/cache/RemovalCause;

    return-object v0
.end method
