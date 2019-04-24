.class public final enum Lcom/microblink/internal/Logger$LogLevel;
.super Ljava/lang/Enum;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/microblink/internal/Logger;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "LogLevel"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/microblink/internal/Logger$LogLevel;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/microblink/internal/Logger$LogLevel;

.field public static final enum LOG_DEBUG:Lcom/microblink/internal/Logger$LogLevel;

.field public static final enum LOG_INFORMATION:Lcom/microblink/internal/Logger$LogLevel;

.field public static final enum LOG_VERBOSE:Lcom/microblink/internal/Logger$LogLevel;

.field public static final enum LOG_WARNINGS_AND_ERRORS:Lcom/microblink/internal/Logger$LogLevel;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lcom/microblink/internal/Logger$LogLevel;

    const-string v1, "LOG_WARNINGS_AND_ERRORS"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/microblink/internal/Logger$LogLevel;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/microblink/internal/Logger$LogLevel;->LOG_WARNINGS_AND_ERRORS:Lcom/microblink/internal/Logger$LogLevel;

    new-instance v0, Lcom/microblink/internal/Logger$LogLevel;

    const-string v1, "LOG_INFORMATION"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/microblink/internal/Logger$LogLevel;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/microblink/internal/Logger$LogLevel;->LOG_INFORMATION:Lcom/microblink/internal/Logger$LogLevel;

    new-instance v0, Lcom/microblink/internal/Logger$LogLevel;

    const-string v1, "LOG_DEBUG"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Lcom/microblink/internal/Logger$LogLevel;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/microblink/internal/Logger$LogLevel;->LOG_DEBUG:Lcom/microblink/internal/Logger$LogLevel;

    new-instance v0, Lcom/microblink/internal/Logger$LogLevel;

    const-string v1, "LOG_VERBOSE"

    const/4 v5, 0x3

    invoke-direct {v0, v1, v5}, Lcom/microblink/internal/Logger$LogLevel;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/microblink/internal/Logger$LogLevel;->LOG_VERBOSE:Lcom/microblink/internal/Logger$LogLevel;

    const/4 v0, 0x4

    new-array v0, v0, [Lcom/microblink/internal/Logger$LogLevel;

    sget-object v1, Lcom/microblink/internal/Logger$LogLevel;->LOG_WARNINGS_AND_ERRORS:Lcom/microblink/internal/Logger$LogLevel;

    aput-object v1, v0, v2

    sget-object v1, Lcom/microblink/internal/Logger$LogLevel;->LOG_INFORMATION:Lcom/microblink/internal/Logger$LogLevel;

    aput-object v1, v0, v3

    sget-object v1, Lcom/microblink/internal/Logger$LogLevel;->LOG_DEBUG:Lcom/microblink/internal/Logger$LogLevel;

    aput-object v1, v0, v4

    sget-object v1, Lcom/microblink/internal/Logger$LogLevel;->LOG_VERBOSE:Lcom/microblink/internal/Logger$LogLevel;

    aput-object v1, v0, v5

    sput-object v0, Lcom/microblink/internal/Logger$LogLevel;->$VALUES:[Lcom/microblink/internal/Logger$LogLevel;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/microblink/internal/Logger$LogLevel;
    .locals 1

    const-class v0, Lcom/microblink/internal/Logger$LogLevel;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/microblink/internal/Logger$LogLevel;

    return-object p0
.end method

.method public static values()[Lcom/microblink/internal/Logger$LogLevel;
    .locals 1

    sget-object v0, Lcom/microblink/internal/Logger$LogLevel;->$VALUES:[Lcom/microblink/internal/Logger$LogLevel;

    invoke-virtual {v0}, [Lcom/microblink/internal/Logger$LogLevel;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/microblink/internal/Logger$LogLevel;

    return-object v0
.end method
