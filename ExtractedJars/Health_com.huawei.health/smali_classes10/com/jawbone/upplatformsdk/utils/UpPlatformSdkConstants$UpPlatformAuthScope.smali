.class public final enum Lcom/jawbone/upplatformsdk/utils/UpPlatformSdkConstants$UpPlatformAuthScope;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jawbone/upplatformsdk/utils/UpPlatformSdkConstants;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "UpPlatformAuthScope"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lcom/jawbone/upplatformsdk/utils/UpPlatformSdkConstants$UpPlatformAuthScope;>;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/jawbone/upplatformsdk/utils/UpPlatformSdkConstants$UpPlatformAuthScope;

.field public static final enum ALL:Lcom/jawbone/upplatformsdk/utils/UpPlatformSdkConstants$UpPlatformAuthScope;

.field public static final enum BASIC_READ:Lcom/jawbone/upplatformsdk/utils/UpPlatformSdkConstants$UpPlatformAuthScope;

.field public static final enum EXTENDED_READ:Lcom/jawbone/upplatformsdk/utils/UpPlatformSdkConstants$UpPlatformAuthScope;

.field public static final enum GENERIC_EVENT_READ:Lcom/jawbone/upplatformsdk/utils/UpPlatformSdkConstants$UpPlatformAuthScope;

.field public static final enum GENERIC_EVENT_WRITE:Lcom/jawbone/upplatformsdk/utils/UpPlatformSdkConstants$UpPlatformAuthScope;

.field public static final enum MEAL_READ:Lcom/jawbone/upplatformsdk/utils/UpPlatformSdkConstants$UpPlatformAuthScope;

.field public static final enum MOVE_READ:Lcom/jawbone/upplatformsdk/utils/UpPlatformSdkConstants$UpPlatformAuthScope;

.field public static final enum MOVE_WRITE:Lcom/jawbone/upplatformsdk/utils/UpPlatformSdkConstants$UpPlatformAuthScope;

.field public static final enum SLEEP_READ:Lcom/jawbone/upplatformsdk/utils/UpPlatformSdkConstants$UpPlatformAuthScope;

.field public static final enum SLEEP_WRITE:Lcom/jawbone/upplatformsdk/utils/UpPlatformSdkConstants$UpPlatformAuthScope;

.field public static final enum TIMESERIES_READ:Lcom/jawbone/upplatformsdk/utils/UpPlatformSdkConstants$UpPlatformAuthScope;

.field public static final enum TIMESERIES_WRITE:Lcom/jawbone/upplatformsdk/utils/UpPlatformSdkConstants$UpPlatformAuthScope;

.field public static final enum WEIGHT_READ:Lcom/jawbone/upplatformsdk/utils/UpPlatformSdkConstants$UpPlatformAuthScope;

.field public static final enum WEIGHT_WRITE:Lcom/jawbone/upplatformsdk/utils/UpPlatformSdkConstants$UpPlatformAuthScope;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 58
    new-instance v0, Lcom/jawbone/upplatformsdk/utils/UpPlatformSdkConstants$UpPlatformAuthScope;

    const-string v1, "BASIC_READ"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/jawbone/upplatformsdk/utils/UpPlatformSdkConstants$UpPlatformAuthScope;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/jawbone/upplatformsdk/utils/UpPlatformSdkConstants$UpPlatformAuthScope;->BASIC_READ:Lcom/jawbone/upplatformsdk/utils/UpPlatformSdkConstants$UpPlatformAuthScope;

    .line 59
    new-instance v0, Lcom/jawbone/upplatformsdk/utils/UpPlatformSdkConstants$UpPlatformAuthScope;

    const-string v1, "EXTENDED_READ"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/jawbone/upplatformsdk/utils/UpPlatformSdkConstants$UpPlatformAuthScope;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/jawbone/upplatformsdk/utils/UpPlatformSdkConstants$UpPlatformAuthScope;->EXTENDED_READ:Lcom/jawbone/upplatformsdk/utils/UpPlatformSdkConstants$UpPlatformAuthScope;

    .line 60
    new-instance v0, Lcom/jawbone/upplatformsdk/utils/UpPlatformSdkConstants$UpPlatformAuthScope;

    const-string v1, "MOVE_READ"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/jawbone/upplatformsdk/utils/UpPlatformSdkConstants$UpPlatformAuthScope;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/jawbone/upplatformsdk/utils/UpPlatformSdkConstants$UpPlatformAuthScope;->MOVE_READ:Lcom/jawbone/upplatformsdk/utils/UpPlatformSdkConstants$UpPlatformAuthScope;

    .line 61
    new-instance v0, Lcom/jawbone/upplatformsdk/utils/UpPlatformSdkConstants$UpPlatformAuthScope;

    const-string v1, "MOVE_WRITE"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lcom/jawbone/upplatformsdk/utils/UpPlatformSdkConstants$UpPlatformAuthScope;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/jawbone/upplatformsdk/utils/UpPlatformSdkConstants$UpPlatformAuthScope;->MOVE_WRITE:Lcom/jawbone/upplatformsdk/utils/UpPlatformSdkConstants$UpPlatformAuthScope;

    .line 62
    new-instance v0, Lcom/jawbone/upplatformsdk/utils/UpPlatformSdkConstants$UpPlatformAuthScope;

    const-string v1, "SLEEP_READ"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lcom/jawbone/upplatformsdk/utils/UpPlatformSdkConstants$UpPlatformAuthScope;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/jawbone/upplatformsdk/utils/UpPlatformSdkConstants$UpPlatformAuthScope;->SLEEP_READ:Lcom/jawbone/upplatformsdk/utils/UpPlatformSdkConstants$UpPlatformAuthScope;

    .line 63
    new-instance v0, Lcom/jawbone/upplatformsdk/utils/UpPlatformSdkConstants$UpPlatformAuthScope;

    const-string v1, "SLEEP_WRITE"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lcom/jawbone/upplatformsdk/utils/UpPlatformSdkConstants$UpPlatformAuthScope;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/jawbone/upplatformsdk/utils/UpPlatformSdkConstants$UpPlatformAuthScope;->SLEEP_WRITE:Lcom/jawbone/upplatformsdk/utils/UpPlatformSdkConstants$UpPlatformAuthScope;

    .line 64
    new-instance v0, Lcom/jawbone/upplatformsdk/utils/UpPlatformSdkConstants$UpPlatformAuthScope;

    const-string v1, "MEAL_READ"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lcom/jawbone/upplatformsdk/utils/UpPlatformSdkConstants$UpPlatformAuthScope;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/jawbone/upplatformsdk/utils/UpPlatformSdkConstants$UpPlatformAuthScope;->MEAL_READ:Lcom/jawbone/upplatformsdk/utils/UpPlatformSdkConstants$UpPlatformAuthScope;

    .line 65
    new-instance v0, Lcom/jawbone/upplatformsdk/utils/UpPlatformSdkConstants$UpPlatformAuthScope;

    const-string v1, "WEIGHT_READ"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Lcom/jawbone/upplatformsdk/utils/UpPlatformSdkConstants$UpPlatformAuthScope;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/jawbone/upplatformsdk/utils/UpPlatformSdkConstants$UpPlatformAuthScope;->WEIGHT_READ:Lcom/jawbone/upplatformsdk/utils/UpPlatformSdkConstants$UpPlatformAuthScope;

    .line 66
    new-instance v0, Lcom/jawbone/upplatformsdk/utils/UpPlatformSdkConstants$UpPlatformAuthScope;

    const-string v1, "WEIGHT_WRITE"

    const/16 v2, 0x8

    invoke-direct {v0, v1, v2}, Lcom/jawbone/upplatformsdk/utils/UpPlatformSdkConstants$UpPlatformAuthScope;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/jawbone/upplatformsdk/utils/UpPlatformSdkConstants$UpPlatformAuthScope;->WEIGHT_WRITE:Lcom/jawbone/upplatformsdk/utils/UpPlatformSdkConstants$UpPlatformAuthScope;

    .line 67
    new-instance v0, Lcom/jawbone/upplatformsdk/utils/UpPlatformSdkConstants$UpPlatformAuthScope;

    const-string v1, "GENERIC_EVENT_READ"

    const/16 v2, 0x9

    invoke-direct {v0, v1, v2}, Lcom/jawbone/upplatformsdk/utils/UpPlatformSdkConstants$UpPlatformAuthScope;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/jawbone/upplatformsdk/utils/UpPlatformSdkConstants$UpPlatformAuthScope;->GENERIC_EVENT_READ:Lcom/jawbone/upplatformsdk/utils/UpPlatformSdkConstants$UpPlatformAuthScope;

    .line 68
    new-instance v0, Lcom/jawbone/upplatformsdk/utils/UpPlatformSdkConstants$UpPlatformAuthScope;

    const-string v1, "GENERIC_EVENT_WRITE"

    const/16 v2, 0xa

    invoke-direct {v0, v1, v2}, Lcom/jawbone/upplatformsdk/utils/UpPlatformSdkConstants$UpPlatformAuthScope;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/jawbone/upplatformsdk/utils/UpPlatformSdkConstants$UpPlatformAuthScope;->GENERIC_EVENT_WRITE:Lcom/jawbone/upplatformsdk/utils/UpPlatformSdkConstants$UpPlatformAuthScope;

    .line 69
    new-instance v0, Lcom/jawbone/upplatformsdk/utils/UpPlatformSdkConstants$UpPlatformAuthScope;

    const-string v1, "TIMESERIES_READ"

    const/16 v2, 0xb

    invoke-direct {v0, v1, v2}, Lcom/jawbone/upplatformsdk/utils/UpPlatformSdkConstants$UpPlatformAuthScope;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/jawbone/upplatformsdk/utils/UpPlatformSdkConstants$UpPlatformAuthScope;->TIMESERIES_READ:Lcom/jawbone/upplatformsdk/utils/UpPlatformSdkConstants$UpPlatformAuthScope;

    .line 70
    new-instance v0, Lcom/jawbone/upplatformsdk/utils/UpPlatformSdkConstants$UpPlatformAuthScope;

    const-string v1, "TIMESERIES_WRITE"

    const/16 v2, 0xc

    invoke-direct {v0, v1, v2}, Lcom/jawbone/upplatformsdk/utils/UpPlatformSdkConstants$UpPlatformAuthScope;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/jawbone/upplatformsdk/utils/UpPlatformSdkConstants$UpPlatformAuthScope;->TIMESERIES_WRITE:Lcom/jawbone/upplatformsdk/utils/UpPlatformSdkConstants$UpPlatformAuthScope;

    .line 71
    new-instance v0, Lcom/jawbone/upplatformsdk/utils/UpPlatformSdkConstants$UpPlatformAuthScope;

    const-string v1, "ALL"

    const/16 v2, 0xd

    invoke-direct {v0, v1, v2}, Lcom/jawbone/upplatformsdk/utils/UpPlatformSdkConstants$UpPlatformAuthScope;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/jawbone/upplatformsdk/utils/UpPlatformSdkConstants$UpPlatformAuthScope;->ALL:Lcom/jawbone/upplatformsdk/utils/UpPlatformSdkConstants$UpPlatformAuthScope;

    .line 57
    const/16 v0, 0xe

    new-array v0, v0, [Lcom/jawbone/upplatformsdk/utils/UpPlatformSdkConstants$UpPlatformAuthScope;

    sget-object v1, Lcom/jawbone/upplatformsdk/utils/UpPlatformSdkConstants$UpPlatformAuthScope;->BASIC_READ:Lcom/jawbone/upplatformsdk/utils/UpPlatformSdkConstants$UpPlatformAuthScope;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lcom/jawbone/upplatformsdk/utils/UpPlatformSdkConstants$UpPlatformAuthScope;->EXTENDED_READ:Lcom/jawbone/upplatformsdk/utils/UpPlatformSdkConstants$UpPlatformAuthScope;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lcom/jawbone/upplatformsdk/utils/UpPlatformSdkConstants$UpPlatformAuthScope;->MOVE_READ:Lcom/jawbone/upplatformsdk/utils/UpPlatformSdkConstants$UpPlatformAuthScope;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lcom/jawbone/upplatformsdk/utils/UpPlatformSdkConstants$UpPlatformAuthScope;->MOVE_WRITE:Lcom/jawbone/upplatformsdk/utils/UpPlatformSdkConstants$UpPlatformAuthScope;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Lcom/jawbone/upplatformsdk/utils/UpPlatformSdkConstants$UpPlatformAuthScope;->SLEEP_READ:Lcom/jawbone/upplatformsdk/utils/UpPlatformSdkConstants$UpPlatformAuthScope;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sget-object v1, Lcom/jawbone/upplatformsdk/utils/UpPlatformSdkConstants$UpPlatformAuthScope;->SLEEP_WRITE:Lcom/jawbone/upplatformsdk/utils/UpPlatformSdkConstants$UpPlatformAuthScope;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    sget-object v1, Lcom/jawbone/upplatformsdk/utils/UpPlatformSdkConstants$UpPlatformAuthScope;->MEAL_READ:Lcom/jawbone/upplatformsdk/utils/UpPlatformSdkConstants$UpPlatformAuthScope;

    const/4 v2, 0x6

    aput-object v1, v0, v2

    sget-object v1, Lcom/jawbone/upplatformsdk/utils/UpPlatformSdkConstants$UpPlatformAuthScope;->WEIGHT_READ:Lcom/jawbone/upplatformsdk/utils/UpPlatformSdkConstants$UpPlatformAuthScope;

    const/4 v2, 0x7

    aput-object v1, v0, v2

    sget-object v1, Lcom/jawbone/upplatformsdk/utils/UpPlatformSdkConstants$UpPlatformAuthScope;->WEIGHT_WRITE:Lcom/jawbone/upplatformsdk/utils/UpPlatformSdkConstants$UpPlatformAuthScope;

    const/16 v2, 0x8

    aput-object v1, v0, v2

    sget-object v1, Lcom/jawbone/upplatformsdk/utils/UpPlatformSdkConstants$UpPlatformAuthScope;->GENERIC_EVENT_READ:Lcom/jawbone/upplatformsdk/utils/UpPlatformSdkConstants$UpPlatformAuthScope;

    const/16 v2, 0x9

    aput-object v1, v0, v2

    sget-object v1, Lcom/jawbone/upplatformsdk/utils/UpPlatformSdkConstants$UpPlatformAuthScope;->GENERIC_EVENT_WRITE:Lcom/jawbone/upplatformsdk/utils/UpPlatformSdkConstants$UpPlatformAuthScope;

    const/16 v2, 0xa

    aput-object v1, v0, v2

    sget-object v1, Lcom/jawbone/upplatformsdk/utils/UpPlatformSdkConstants$UpPlatformAuthScope;->TIMESERIES_READ:Lcom/jawbone/upplatformsdk/utils/UpPlatformSdkConstants$UpPlatformAuthScope;

    const/16 v2, 0xb

    aput-object v1, v0, v2

    sget-object v1, Lcom/jawbone/upplatformsdk/utils/UpPlatformSdkConstants$UpPlatformAuthScope;->TIMESERIES_WRITE:Lcom/jawbone/upplatformsdk/utils/UpPlatformSdkConstants$UpPlatformAuthScope;

    const/16 v2, 0xc

    aput-object v1, v0, v2

    sget-object v1, Lcom/jawbone/upplatformsdk/utils/UpPlatformSdkConstants$UpPlatformAuthScope;->ALL:Lcom/jawbone/upplatformsdk/utils/UpPlatformSdkConstants$UpPlatformAuthScope;

    const/16 v2, 0xd

    aput-object v1, v0, v2

    sput-object v0, Lcom/jawbone/upplatformsdk/utils/UpPlatformSdkConstants$UpPlatformAuthScope;->$VALUES:[Lcom/jawbone/upplatformsdk/utils/UpPlatformSdkConstants$UpPlatformAuthScope;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 57
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/jawbone/upplatformsdk/utils/UpPlatformSdkConstants$UpPlatformAuthScope;
    .locals 1

    .line 57
    const-class v0, Lcom/jawbone/upplatformsdk/utils/UpPlatformSdkConstants$UpPlatformAuthScope;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/jawbone/upplatformsdk/utils/UpPlatformSdkConstants$UpPlatformAuthScope;

    return-object v0
.end method

.method public static values()[Lcom/jawbone/upplatformsdk/utils/UpPlatformSdkConstants$UpPlatformAuthScope;
    .locals 1

    .line 57
    sget-object v0, Lcom/jawbone/upplatformsdk/utils/UpPlatformSdkConstants$UpPlatformAuthScope;->$VALUES:[Lcom/jawbone/upplatformsdk/utils/UpPlatformSdkConstants$UpPlatformAuthScope;

    invoke-virtual {v0}, [Lcom/jawbone/upplatformsdk/utils/UpPlatformSdkConstants$UpPlatformAuthScope;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/jawbone/upplatformsdk/utils/UpPlatformSdkConstants$UpPlatformAuthScope;

    return-object v0
.end method
