.class public final enum Lio/streamroot/dna/core/log/LogLevel;
.super Ljava/lang/Enum;
.source "LogLevel.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lio/streamroot/dna/core/log/LogLevel;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lio/streamroot/dna/core/log/LogLevel;

.field public static final enum DEBUG:Lio/streamroot/dna/core/log/LogLevel;

.field public static final enum ERROR:Lio/streamroot/dna/core/log/LogLevel;

.field public static final enum INFO:Lio/streamroot/dna/core/log/LogLevel;

.field public static final enum OFF:Lio/streamroot/dna/core/log/LogLevel;

.field public static final enum VERBOSE:Lio/streamroot/dna/core/log/LogLevel;

.field public static final enum WARN:Lio/streamroot/dna/core/log/LogLevel;


# instance fields
.field level:I


# direct methods
.method static constructor <clinit>()V
    .locals 10

    .line 6
    new-instance v0, Lio/streamroot/dna/core/log/LogLevel;

    const-string v1, "VERBOSE"

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-direct {v0, v1, v2, v3}, Lio/streamroot/dna/core/log/LogLevel;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lio/streamroot/dna/core/log/LogLevel;->VERBOSE:Lio/streamroot/dna/core/log/LogLevel;

    new-instance v0, Lio/streamroot/dna/core/log/LogLevel;

    const-string v1, "DEBUG"

    const/4 v4, 0x1

    const/4 v5, 0x3

    invoke-direct {v0, v1, v4, v5}, Lio/streamroot/dna/core/log/LogLevel;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lio/streamroot/dna/core/log/LogLevel;->DEBUG:Lio/streamroot/dna/core/log/LogLevel;

    new-instance v0, Lio/streamroot/dna/core/log/LogLevel;

    const-string v1, "INFO"

    const/4 v6, 0x4

    invoke-direct {v0, v1, v3, v6}, Lio/streamroot/dna/core/log/LogLevel;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lio/streamroot/dna/core/log/LogLevel;->INFO:Lio/streamroot/dna/core/log/LogLevel;

    new-instance v0, Lio/streamroot/dna/core/log/LogLevel;

    const-string v1, "WARN"

    const/4 v7, 0x5

    invoke-direct {v0, v1, v5, v7}, Lio/streamroot/dna/core/log/LogLevel;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lio/streamroot/dna/core/log/LogLevel;->WARN:Lio/streamroot/dna/core/log/LogLevel;

    new-instance v0, Lio/streamroot/dna/core/log/LogLevel;

    const-string v1, "ERROR"

    const/4 v8, 0x6

    invoke-direct {v0, v1, v6, v8}, Lio/streamroot/dna/core/log/LogLevel;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lio/streamroot/dna/core/log/LogLevel;->ERROR:Lio/streamroot/dna/core/log/LogLevel;

    new-instance v0, Lio/streamroot/dna/core/log/LogLevel;

    const-string v1, "OFF"

    const/16 v9, 0x63

    invoke-direct {v0, v1, v7, v9}, Lio/streamroot/dna/core/log/LogLevel;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lio/streamroot/dna/core/log/LogLevel;->OFF:Lio/streamroot/dna/core/log/LogLevel;

    .line 5
    new-array v0, v8, [Lio/streamroot/dna/core/log/LogLevel;

    sget-object v1, Lio/streamroot/dna/core/log/LogLevel;->VERBOSE:Lio/streamroot/dna/core/log/LogLevel;

    aput-object v1, v0, v2

    sget-object v1, Lio/streamroot/dna/core/log/LogLevel;->DEBUG:Lio/streamroot/dna/core/log/LogLevel;

    aput-object v1, v0, v4

    sget-object v1, Lio/streamroot/dna/core/log/LogLevel;->INFO:Lio/streamroot/dna/core/log/LogLevel;

    aput-object v1, v0, v3

    sget-object v1, Lio/streamroot/dna/core/log/LogLevel;->WARN:Lio/streamroot/dna/core/log/LogLevel;

    aput-object v1, v0, v5

    sget-object v1, Lio/streamroot/dna/core/log/LogLevel;->ERROR:Lio/streamroot/dna/core/log/LogLevel;

    aput-object v1, v0, v6

    sget-object v1, Lio/streamroot/dna/core/log/LogLevel;->OFF:Lio/streamroot/dna/core/log/LogLevel;

    aput-object v1, v0, v7

    sput-object v0, Lio/streamroot/dna/core/log/LogLevel;->$VALUES:[Lio/streamroot/dna/core/log/LogLevel;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    .line 10
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 11
    iput p3, p0, Lio/streamroot/dna/core/log/LogLevel;->level:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lio/streamroot/dna/core/log/LogLevel;
    .locals 1

    .line 5
    const-class v0, Lio/streamroot/dna/core/log/LogLevel;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lio/streamroot/dna/core/log/LogLevel;

    return-object p0
.end method

.method public static values()[Lio/streamroot/dna/core/log/LogLevel;
    .locals 1

    .line 5
    sget-object v0, Lio/streamroot/dna/core/log/LogLevel;->$VALUES:[Lio/streamroot/dna/core/log/LogLevel;

    invoke-virtual {v0}, [Lio/streamroot/dna/core/log/LogLevel;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lio/streamroot/dna/core/log/LogLevel;

    return-object v0
.end method
