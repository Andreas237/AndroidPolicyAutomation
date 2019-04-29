.class public final enum Lorg/webrtc/Logging$TraceLevel;
.super Ljava/lang/Enum;
.source "Logging.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/webrtc/Logging;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "TraceLevel"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lorg/webrtc/Logging$TraceLevel;",
        ">;"
    }
.end annotation

.annotation runtime Ljava/lang/Deprecated;
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lorg/webrtc/Logging$TraceLevel;

.field public static final enum TRACE_ALL:Lorg/webrtc/Logging$TraceLevel;

.field public static final enum TRACE_APICALL:Lorg/webrtc/Logging$TraceLevel;

.field public static final enum TRACE_CRITICAL:Lorg/webrtc/Logging$TraceLevel;

.field public static final enum TRACE_DEBUG:Lorg/webrtc/Logging$TraceLevel;

.field public static final enum TRACE_DEFAULT:Lorg/webrtc/Logging$TraceLevel;

.field public static final enum TRACE_ERROR:Lorg/webrtc/Logging$TraceLevel;

.field public static final enum TRACE_INFO:Lorg/webrtc/Logging$TraceLevel;

.field public static final enum TRACE_MEMORY:Lorg/webrtc/Logging$TraceLevel;

.field public static final enum TRACE_MODULECALL:Lorg/webrtc/Logging$TraceLevel;

.field public static final enum TRACE_NONE:Lorg/webrtc/Logging$TraceLevel;

.field public static final enum TRACE_STATEINFO:Lorg/webrtc/Logging$TraceLevel;

.field public static final enum TRACE_STREAM:Lorg/webrtc/Logging$TraceLevel;

.field public static final enum TRACE_TERSEINFO:Lorg/webrtc/Logging$TraceLevel;

.field public static final enum TRACE_TIMER:Lorg/webrtc/Logging$TraceLevel;

.field public static final enum TRACE_WARNING:Lorg/webrtc/Logging$TraceLevel;


# instance fields
.field public final level:I


# direct methods
.method static constructor <clinit>()V
    .locals 17

    .line 68
    new-instance v0, Lorg/webrtc/Logging$TraceLevel;

    const-string v1, "TRACE_NONE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lorg/webrtc/Logging$TraceLevel;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lorg/webrtc/Logging$TraceLevel;->TRACE_NONE:Lorg/webrtc/Logging$TraceLevel;

    .line 69
    new-instance v0, Lorg/webrtc/Logging$TraceLevel;

    const-string v1, "TRACE_STATEINFO"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3, v3}, Lorg/webrtc/Logging$TraceLevel;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lorg/webrtc/Logging$TraceLevel;->TRACE_STATEINFO:Lorg/webrtc/Logging$TraceLevel;

    .line 70
    new-instance v0, Lorg/webrtc/Logging$TraceLevel;

    const-string v1, "TRACE_WARNING"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4, v4}, Lorg/webrtc/Logging$TraceLevel;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lorg/webrtc/Logging$TraceLevel;->TRACE_WARNING:Lorg/webrtc/Logging$TraceLevel;

    .line 71
    new-instance v0, Lorg/webrtc/Logging$TraceLevel;

    const-string v1, "TRACE_ERROR"

    const/4 v5, 0x3

    const/4 v6, 0x4

    invoke-direct {v0, v1, v5, v6}, Lorg/webrtc/Logging$TraceLevel;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lorg/webrtc/Logging$TraceLevel;->TRACE_ERROR:Lorg/webrtc/Logging$TraceLevel;

    .line 72
    new-instance v0, Lorg/webrtc/Logging$TraceLevel;

    const-string v1, "TRACE_CRITICAL"

    const/16 v7, 0x8

    invoke-direct {v0, v1, v6, v7}, Lorg/webrtc/Logging$TraceLevel;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lorg/webrtc/Logging$TraceLevel;->TRACE_CRITICAL:Lorg/webrtc/Logging$TraceLevel;

    .line 73
    new-instance v0, Lorg/webrtc/Logging$TraceLevel;

    const-string v1, "TRACE_APICALL"

    const/4 v8, 0x5

    const/16 v9, 0x10

    invoke-direct {v0, v1, v8, v9}, Lorg/webrtc/Logging$TraceLevel;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lorg/webrtc/Logging$TraceLevel;->TRACE_APICALL:Lorg/webrtc/Logging$TraceLevel;

    .line 74
    new-instance v0, Lorg/webrtc/Logging$TraceLevel;

    const-string v1, "TRACE_DEFAULT"

    const/4 v9, 0x6

    const/16 v10, 0xff

    invoke-direct {v0, v1, v9, v10}, Lorg/webrtc/Logging$TraceLevel;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lorg/webrtc/Logging$TraceLevel;->TRACE_DEFAULT:Lorg/webrtc/Logging$TraceLevel;

    .line 75
    new-instance v0, Lorg/webrtc/Logging$TraceLevel;

    const-string v1, "TRACE_MODULECALL"

    const/4 v10, 0x7

    const/16 v11, 0x20

    invoke-direct {v0, v1, v10, v11}, Lorg/webrtc/Logging$TraceLevel;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lorg/webrtc/Logging$TraceLevel;->TRACE_MODULECALL:Lorg/webrtc/Logging$TraceLevel;

    .line 76
    new-instance v0, Lorg/webrtc/Logging$TraceLevel;

    const-string v1, "TRACE_MEMORY"

    const/16 v11, 0x100

    invoke-direct {v0, v1, v7, v11}, Lorg/webrtc/Logging$TraceLevel;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lorg/webrtc/Logging$TraceLevel;->TRACE_MEMORY:Lorg/webrtc/Logging$TraceLevel;

    .line 77
    new-instance v0, Lorg/webrtc/Logging$TraceLevel;

    const-string v1, "TRACE_TIMER"

    const/16 v11, 0x9

    const/16 v12, 0x200

    invoke-direct {v0, v1, v11, v12}, Lorg/webrtc/Logging$TraceLevel;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lorg/webrtc/Logging$TraceLevel;->TRACE_TIMER:Lorg/webrtc/Logging$TraceLevel;

    .line 78
    new-instance v0, Lorg/webrtc/Logging$TraceLevel;

    const-string v1, "TRACE_STREAM"

    const/16 v12, 0xa

    const/16 v13, 0x400

    invoke-direct {v0, v1, v12, v13}, Lorg/webrtc/Logging$TraceLevel;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lorg/webrtc/Logging$TraceLevel;->TRACE_STREAM:Lorg/webrtc/Logging$TraceLevel;

    .line 79
    new-instance v0, Lorg/webrtc/Logging$TraceLevel;

    const-string v1, "TRACE_DEBUG"

    const/16 v13, 0xb

    const/16 v14, 0x800

    invoke-direct {v0, v1, v13, v14}, Lorg/webrtc/Logging$TraceLevel;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lorg/webrtc/Logging$TraceLevel;->TRACE_DEBUG:Lorg/webrtc/Logging$TraceLevel;

    .line 80
    new-instance v0, Lorg/webrtc/Logging$TraceLevel;

    const-string v1, "TRACE_INFO"

    const/16 v14, 0xc

    const/16 v15, 0x1000

    invoke-direct {v0, v1, v14, v15}, Lorg/webrtc/Logging$TraceLevel;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lorg/webrtc/Logging$TraceLevel;->TRACE_INFO:Lorg/webrtc/Logging$TraceLevel;

    .line 81
    new-instance v0, Lorg/webrtc/Logging$TraceLevel;

    const-string v1, "TRACE_TERSEINFO"

    const/16 v15, 0xd

    const/16 v14, 0x2000

    invoke-direct {v0, v1, v15, v14}, Lorg/webrtc/Logging$TraceLevel;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lorg/webrtc/Logging$TraceLevel;->TRACE_TERSEINFO:Lorg/webrtc/Logging$TraceLevel;

    .line 82
    new-instance v0, Lorg/webrtc/Logging$TraceLevel;

    const-string v1, "TRACE_ALL"

    const/16 v14, 0xe

    const v15, 0xffff

    invoke-direct {v0, v1, v14, v15}, Lorg/webrtc/Logging$TraceLevel;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lorg/webrtc/Logging$TraceLevel;->TRACE_ALL:Lorg/webrtc/Logging$TraceLevel;

    const/16 v0, 0xf

    .line 66
    new-array v0, v0, [Lorg/webrtc/Logging$TraceLevel;

    sget-object v1, Lorg/webrtc/Logging$TraceLevel;->TRACE_NONE:Lorg/webrtc/Logging$TraceLevel;

    aput-object v1, v0, v2

    sget-object v1, Lorg/webrtc/Logging$TraceLevel;->TRACE_STATEINFO:Lorg/webrtc/Logging$TraceLevel;

    aput-object v1, v0, v3

    sget-object v1, Lorg/webrtc/Logging$TraceLevel;->TRACE_WARNING:Lorg/webrtc/Logging$TraceLevel;

    aput-object v1, v0, v4

    sget-object v1, Lorg/webrtc/Logging$TraceLevel;->TRACE_ERROR:Lorg/webrtc/Logging$TraceLevel;

    aput-object v1, v0, v5

    sget-object v1, Lorg/webrtc/Logging$TraceLevel;->TRACE_CRITICAL:Lorg/webrtc/Logging$TraceLevel;

    aput-object v1, v0, v6

    sget-object v1, Lorg/webrtc/Logging$TraceLevel;->TRACE_APICALL:Lorg/webrtc/Logging$TraceLevel;

    aput-object v1, v0, v8

    sget-object v1, Lorg/webrtc/Logging$TraceLevel;->TRACE_DEFAULT:Lorg/webrtc/Logging$TraceLevel;

    aput-object v1, v0, v9

    sget-object v1, Lorg/webrtc/Logging$TraceLevel;->TRACE_MODULECALL:Lorg/webrtc/Logging$TraceLevel;

    aput-object v1, v0, v10

    sget-object v1, Lorg/webrtc/Logging$TraceLevel;->TRACE_MEMORY:Lorg/webrtc/Logging$TraceLevel;

    aput-object v1, v0, v7

    sget-object v1, Lorg/webrtc/Logging$TraceLevel;->TRACE_TIMER:Lorg/webrtc/Logging$TraceLevel;

    aput-object v1, v0, v11

    sget-object v1, Lorg/webrtc/Logging$TraceLevel;->TRACE_STREAM:Lorg/webrtc/Logging$TraceLevel;

    aput-object v1, v0, v12

    sget-object v1, Lorg/webrtc/Logging$TraceLevel;->TRACE_DEBUG:Lorg/webrtc/Logging$TraceLevel;

    aput-object v1, v0, v13

    sget-object v1, Lorg/webrtc/Logging$TraceLevel;->TRACE_INFO:Lorg/webrtc/Logging$TraceLevel;

    const/16 v2, 0xc

    aput-object v1, v0, v2

    sget-object v1, Lorg/webrtc/Logging$TraceLevel;->TRACE_TERSEINFO:Lorg/webrtc/Logging$TraceLevel;

    const/16 v2, 0xd

    aput-object v1, v0, v2

    sget-object v1, Lorg/webrtc/Logging$TraceLevel;->TRACE_ALL:Lorg/webrtc/Logging$TraceLevel;

    aput-object v1, v0, v14

    sput-object v0, Lorg/webrtc/Logging$TraceLevel;->$VALUES:[Lorg/webrtc/Logging$TraceLevel;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    .line 85
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 86
    iput p3, p0, Lorg/webrtc/Logging$TraceLevel;->level:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lorg/webrtc/Logging$TraceLevel;
    .locals 1

    .line 66
    const-class v0, Lorg/webrtc/Logging$TraceLevel;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lorg/webrtc/Logging$TraceLevel;

    return-object p0
.end method

.method public static values()[Lorg/webrtc/Logging$TraceLevel;
    .locals 1

    .line 66
    sget-object v0, Lorg/webrtc/Logging$TraceLevel;->$VALUES:[Lorg/webrtc/Logging$TraceLevel;

    invoke-virtual {v0}, [Lorg/webrtc/Logging$TraceLevel;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lorg/webrtc/Logging$TraceLevel;

    return-object v0
.end method
