.class public final enum Lcom/ibotta/android/blacklist/BlacklistClassifierType;
.super Ljava/lang/Enum;
.source "BlacklistClassifierType.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/ibotta/android/blacklist/BlacklistClassifierType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/ibotta/android/blacklist/BlacklistClassifierType;

.field public static final enum APP_VERSION_EQUAL:Lcom/ibotta/android/blacklist/BlacklistClassifierType;

.field public static final enum APP_VERSION_GREATER_THAN:Lcom/ibotta/android/blacklist/BlacklistClassifierType;

.field public static final enum APP_VERSION_GREATER_THAN_OR_EQUAL:Lcom/ibotta/android/blacklist/BlacklistClassifierType;

.field public static final enum APP_VERSION_LESS_THAN:Lcom/ibotta/android/blacklist/BlacklistClassifierType;

.field public static final enum APP_VERSION_LESS_THAN_OR_EQUAL:Lcom/ibotta/android/blacklist/BlacklistClassifierType;

.field public static final enum APP_VERSION_NOT_EQUAL:Lcom/ibotta/android/blacklist/BlacklistClassifierType;

.field public static final enum DEVICE_MODEL_EQUAL:Lcom/ibotta/android/blacklist/BlacklistClassifierType;

.field public static final enum DEVICE_MODEL_NOT_EQUAL:Lcom/ibotta/android/blacklist/BlacklistClassifierType;

.field public static final enum DEVICE_MODEL_REGEX:Lcom/ibotta/android/blacklist/BlacklistClassifierType;

.field public static final enum INT_EQUAL:Lcom/ibotta/android/blacklist/BlacklistClassifierType;

.field public static final enum INT_GREATER_THAN:Lcom/ibotta/android/blacklist/BlacklistClassifierType;

.field public static final enum INT_GREATER_THAN_OR_EQUAL:Lcom/ibotta/android/blacklist/BlacklistClassifierType;

.field public static final enum INT_LESS_THAN:Lcom/ibotta/android/blacklist/BlacklistClassifierType;

.field public static final enum INT_LESS_THAN_OR_EQUAL:Lcom/ibotta/android/blacklist/BlacklistClassifierType;

.field public static final enum INT_NOT_EQUAL:Lcom/ibotta/android/blacklist/BlacklistClassifierType;

.field public static final enum NO_OP:Lcom/ibotta/android/blacklist/BlacklistClassifierType;

.field public static final enum OS_VERSION_EQUAL:Lcom/ibotta/android/blacklist/BlacklistClassifierType;

.field public static final enum OS_VERSION_GREATER_THAN:Lcom/ibotta/android/blacklist/BlacklistClassifierType;

.field public static final enum OS_VERSION_GREATER_THAN_OR_EQUAL:Lcom/ibotta/android/blacklist/BlacklistClassifierType;

.field public static final enum OS_VERSION_LESS_THAN:Lcom/ibotta/android/blacklist/BlacklistClassifierType;

.field public static final enum OS_VERSION_LESS_THAN_OR_EQUAL:Lcom/ibotta/android/blacklist/BlacklistClassifierType;

.field public static final enum OS_VERSION_NOT_EQUAL:Lcom/ibotta/android/blacklist/BlacklistClassifierType;

.field public static final enum STRING_EQUAL:Lcom/ibotta/android/blacklist/BlacklistClassifierType;

.field public static final enum STRING_NOT_EQUAL:Lcom/ibotta/android/blacklist/BlacklistClassifierType;

.field public static final enum STRING_REGEX:Lcom/ibotta/android/blacklist/BlacklistClassifierType;


# direct methods
.method static constructor <clinit>()V
    .locals 16

    .line 8
    new-instance v0, Lcom/ibotta/android/blacklist/BlacklistClassifierType;

    const-string v1, "STRING_EQUAL"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/ibotta/android/blacklist/BlacklistClassifierType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/blacklist/BlacklistClassifierType;->STRING_EQUAL:Lcom/ibotta/android/blacklist/BlacklistClassifierType;

    .line 9
    new-instance v0, Lcom/ibotta/android/blacklist/BlacklistClassifierType;

    const-string v1, "STRING_NOT_EQUAL"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/ibotta/android/blacklist/BlacklistClassifierType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/blacklist/BlacklistClassifierType;->STRING_NOT_EQUAL:Lcom/ibotta/android/blacklist/BlacklistClassifierType;

    .line 10
    new-instance v0, Lcom/ibotta/android/blacklist/BlacklistClassifierType;

    const-string v1, "STRING_REGEX"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Lcom/ibotta/android/blacklist/BlacklistClassifierType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/blacklist/BlacklistClassifierType;->STRING_REGEX:Lcom/ibotta/android/blacklist/BlacklistClassifierType;

    .line 11
    new-instance v0, Lcom/ibotta/android/blacklist/BlacklistClassifierType;

    const-string v1, "INT_EQUAL"

    const/4 v5, 0x3

    invoke-direct {v0, v1, v5}, Lcom/ibotta/android/blacklist/BlacklistClassifierType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/blacklist/BlacklistClassifierType;->INT_EQUAL:Lcom/ibotta/android/blacklist/BlacklistClassifierType;

    .line 12
    new-instance v0, Lcom/ibotta/android/blacklist/BlacklistClassifierType;

    const-string v1, "INT_NOT_EQUAL"

    const/4 v6, 0x4

    invoke-direct {v0, v1, v6}, Lcom/ibotta/android/blacklist/BlacklistClassifierType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/blacklist/BlacklistClassifierType;->INT_NOT_EQUAL:Lcom/ibotta/android/blacklist/BlacklistClassifierType;

    .line 13
    new-instance v0, Lcom/ibotta/android/blacklist/BlacklistClassifierType;

    const-string v1, "INT_LESS_THAN"

    const/4 v7, 0x5

    invoke-direct {v0, v1, v7}, Lcom/ibotta/android/blacklist/BlacklistClassifierType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/blacklist/BlacklistClassifierType;->INT_LESS_THAN:Lcom/ibotta/android/blacklist/BlacklistClassifierType;

    .line 14
    new-instance v0, Lcom/ibotta/android/blacklist/BlacklistClassifierType;

    const-string v1, "INT_LESS_THAN_OR_EQUAL"

    const/4 v8, 0x6

    invoke-direct {v0, v1, v8}, Lcom/ibotta/android/blacklist/BlacklistClassifierType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/blacklist/BlacklistClassifierType;->INT_LESS_THAN_OR_EQUAL:Lcom/ibotta/android/blacklist/BlacklistClassifierType;

    .line 15
    new-instance v0, Lcom/ibotta/android/blacklist/BlacklistClassifierType;

    const-string v1, "INT_GREATER_THAN"

    const/4 v9, 0x7

    invoke-direct {v0, v1, v9}, Lcom/ibotta/android/blacklist/BlacklistClassifierType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/blacklist/BlacklistClassifierType;->INT_GREATER_THAN:Lcom/ibotta/android/blacklist/BlacklistClassifierType;

    .line 16
    new-instance v0, Lcom/ibotta/android/blacklist/BlacklistClassifierType;

    const-string v1, "INT_GREATER_THAN_OR_EQUAL"

    const/16 v10, 0x8

    invoke-direct {v0, v1, v10}, Lcom/ibotta/android/blacklist/BlacklistClassifierType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/blacklist/BlacklistClassifierType;->INT_GREATER_THAN_OR_EQUAL:Lcom/ibotta/android/blacklist/BlacklistClassifierType;

    .line 17
    new-instance v0, Lcom/ibotta/android/blacklist/BlacklistClassifierType;

    const-string v1, "APP_VERSION_EQUAL"

    const/16 v11, 0x9

    invoke-direct {v0, v1, v11}, Lcom/ibotta/android/blacklist/BlacklistClassifierType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/blacklist/BlacklistClassifierType;->APP_VERSION_EQUAL:Lcom/ibotta/android/blacklist/BlacklistClassifierType;

    .line 18
    new-instance v0, Lcom/ibotta/android/blacklist/BlacklistClassifierType;

    const-string v1, "APP_VERSION_NOT_EQUAL"

    const/16 v12, 0xa

    invoke-direct {v0, v1, v12}, Lcom/ibotta/android/blacklist/BlacklistClassifierType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/blacklist/BlacklistClassifierType;->APP_VERSION_NOT_EQUAL:Lcom/ibotta/android/blacklist/BlacklistClassifierType;

    .line 19
    new-instance v0, Lcom/ibotta/android/blacklist/BlacklistClassifierType;

    const-string v1, "APP_VERSION_LESS_THAN"

    const/16 v13, 0xb

    invoke-direct {v0, v1, v13}, Lcom/ibotta/android/blacklist/BlacklistClassifierType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/blacklist/BlacklistClassifierType;->APP_VERSION_LESS_THAN:Lcom/ibotta/android/blacklist/BlacklistClassifierType;

    .line 20
    new-instance v0, Lcom/ibotta/android/blacklist/BlacklistClassifierType;

    const-string v1, "APP_VERSION_LESS_THAN_OR_EQUAL"

    const/16 v14, 0xc

    invoke-direct {v0, v1, v14}, Lcom/ibotta/android/blacklist/BlacklistClassifierType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/blacklist/BlacklistClassifierType;->APP_VERSION_LESS_THAN_OR_EQUAL:Lcom/ibotta/android/blacklist/BlacklistClassifierType;

    .line 21
    new-instance v0, Lcom/ibotta/android/blacklist/BlacklistClassifierType;

    const-string v1, "APP_VERSION_GREATER_THAN"

    const/16 v15, 0xd

    invoke-direct {v0, v1, v15}, Lcom/ibotta/android/blacklist/BlacklistClassifierType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/blacklist/BlacklistClassifierType;->APP_VERSION_GREATER_THAN:Lcom/ibotta/android/blacklist/BlacklistClassifierType;

    .line 22
    new-instance v0, Lcom/ibotta/android/blacklist/BlacklistClassifierType;

    const-string v1, "APP_VERSION_GREATER_THAN_OR_EQUAL"

    const/16 v15, 0xe

    invoke-direct {v0, v1, v15}, Lcom/ibotta/android/blacklist/BlacklistClassifierType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/blacklist/BlacklistClassifierType;->APP_VERSION_GREATER_THAN_OR_EQUAL:Lcom/ibotta/android/blacklist/BlacklistClassifierType;

    .line 23
    new-instance v0, Lcom/ibotta/android/blacklist/BlacklistClassifierType;

    const-string v1, "OS_VERSION_EQUAL"

    const/16 v15, 0xf

    invoke-direct {v0, v1, v15}, Lcom/ibotta/android/blacklist/BlacklistClassifierType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/blacklist/BlacklistClassifierType;->OS_VERSION_EQUAL:Lcom/ibotta/android/blacklist/BlacklistClassifierType;

    .line 24
    new-instance v0, Lcom/ibotta/android/blacklist/BlacklistClassifierType;

    const-string v1, "OS_VERSION_NOT_EQUAL"

    const/16 v15, 0x10

    invoke-direct {v0, v1, v15}, Lcom/ibotta/android/blacklist/BlacklistClassifierType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/blacklist/BlacklistClassifierType;->OS_VERSION_NOT_EQUAL:Lcom/ibotta/android/blacklist/BlacklistClassifierType;

    .line 25
    new-instance v0, Lcom/ibotta/android/blacklist/BlacklistClassifierType;

    const-string v1, "OS_VERSION_LESS_THAN"

    const/16 v15, 0x11

    invoke-direct {v0, v1, v15}, Lcom/ibotta/android/blacklist/BlacklistClassifierType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/blacklist/BlacklistClassifierType;->OS_VERSION_LESS_THAN:Lcom/ibotta/android/blacklist/BlacklistClassifierType;

    .line 26
    new-instance v0, Lcom/ibotta/android/blacklist/BlacklistClassifierType;

    const-string v1, "OS_VERSION_LESS_THAN_OR_EQUAL"

    const/16 v15, 0x12

    invoke-direct {v0, v1, v15}, Lcom/ibotta/android/blacklist/BlacklistClassifierType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/blacklist/BlacklistClassifierType;->OS_VERSION_LESS_THAN_OR_EQUAL:Lcom/ibotta/android/blacklist/BlacklistClassifierType;

    .line 27
    new-instance v0, Lcom/ibotta/android/blacklist/BlacklistClassifierType;

    const-string v1, "OS_VERSION_GREATER_THAN"

    const/16 v15, 0x13

    invoke-direct {v0, v1, v15}, Lcom/ibotta/android/blacklist/BlacklistClassifierType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/blacklist/BlacklistClassifierType;->OS_VERSION_GREATER_THAN:Lcom/ibotta/android/blacklist/BlacklistClassifierType;

    .line 28
    new-instance v0, Lcom/ibotta/android/blacklist/BlacklistClassifierType;

    const-string v1, "OS_VERSION_GREATER_THAN_OR_EQUAL"

    const/16 v15, 0x14

    invoke-direct {v0, v1, v15}, Lcom/ibotta/android/blacklist/BlacklistClassifierType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/blacklist/BlacklistClassifierType;->OS_VERSION_GREATER_THAN_OR_EQUAL:Lcom/ibotta/android/blacklist/BlacklistClassifierType;

    .line 29
    new-instance v0, Lcom/ibotta/android/blacklist/BlacklistClassifierType;

    const-string v1, "DEVICE_MODEL_EQUAL"

    const/16 v15, 0x15

    invoke-direct {v0, v1, v15}, Lcom/ibotta/android/blacklist/BlacklistClassifierType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/blacklist/BlacklistClassifierType;->DEVICE_MODEL_EQUAL:Lcom/ibotta/android/blacklist/BlacklistClassifierType;

    .line 30
    new-instance v0, Lcom/ibotta/android/blacklist/BlacklistClassifierType;

    const-string v1, "DEVICE_MODEL_NOT_EQUAL"

    const/16 v15, 0x16

    invoke-direct {v0, v1, v15}, Lcom/ibotta/android/blacklist/BlacklistClassifierType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/blacklist/BlacklistClassifierType;->DEVICE_MODEL_NOT_EQUAL:Lcom/ibotta/android/blacklist/BlacklistClassifierType;

    .line 31
    new-instance v0, Lcom/ibotta/android/blacklist/BlacklistClassifierType;

    const-string v1, "DEVICE_MODEL_REGEX"

    const/16 v15, 0x17

    invoke-direct {v0, v1, v15}, Lcom/ibotta/android/blacklist/BlacklistClassifierType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/blacklist/BlacklistClassifierType;->DEVICE_MODEL_REGEX:Lcom/ibotta/android/blacklist/BlacklistClassifierType;

    .line 32
    new-instance v0, Lcom/ibotta/android/blacklist/BlacklistClassifierType;

    const-string v1, "NO_OP"

    const/16 v15, 0x18

    invoke-direct {v0, v1, v15}, Lcom/ibotta/android/blacklist/BlacklistClassifierType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/blacklist/BlacklistClassifierType;->NO_OP:Lcom/ibotta/android/blacklist/BlacklistClassifierType;

    const/16 v0, 0x19

    .line 7
    new-array v0, v0, [Lcom/ibotta/android/blacklist/BlacklistClassifierType;

    sget-object v1, Lcom/ibotta/android/blacklist/BlacklistClassifierType;->STRING_EQUAL:Lcom/ibotta/android/blacklist/BlacklistClassifierType;

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/blacklist/BlacklistClassifierType;->STRING_NOT_EQUAL:Lcom/ibotta/android/blacklist/BlacklistClassifierType;

    aput-object v1, v0, v3

    sget-object v1, Lcom/ibotta/android/blacklist/BlacklistClassifierType;->STRING_REGEX:Lcom/ibotta/android/blacklist/BlacklistClassifierType;

    aput-object v1, v0, v4

    sget-object v1, Lcom/ibotta/android/blacklist/BlacklistClassifierType;->INT_EQUAL:Lcom/ibotta/android/blacklist/BlacklistClassifierType;

    aput-object v1, v0, v5

    sget-object v1, Lcom/ibotta/android/blacklist/BlacklistClassifierType;->INT_NOT_EQUAL:Lcom/ibotta/android/blacklist/BlacklistClassifierType;

    aput-object v1, v0, v6

    sget-object v1, Lcom/ibotta/android/blacklist/BlacklistClassifierType;->INT_LESS_THAN:Lcom/ibotta/android/blacklist/BlacklistClassifierType;

    aput-object v1, v0, v7

    sget-object v1, Lcom/ibotta/android/blacklist/BlacklistClassifierType;->INT_LESS_THAN_OR_EQUAL:Lcom/ibotta/android/blacklist/BlacklistClassifierType;

    aput-object v1, v0, v8

    sget-object v1, Lcom/ibotta/android/blacklist/BlacklistClassifierType;->INT_GREATER_THAN:Lcom/ibotta/android/blacklist/BlacklistClassifierType;

    aput-object v1, v0, v9

    sget-object v1, Lcom/ibotta/android/blacklist/BlacklistClassifierType;->INT_GREATER_THAN_OR_EQUAL:Lcom/ibotta/android/blacklist/BlacklistClassifierType;

    aput-object v1, v0, v10

    sget-object v1, Lcom/ibotta/android/blacklist/BlacklistClassifierType;->APP_VERSION_EQUAL:Lcom/ibotta/android/blacklist/BlacklistClassifierType;

    aput-object v1, v0, v11

    sget-object v1, Lcom/ibotta/android/blacklist/BlacklistClassifierType;->APP_VERSION_NOT_EQUAL:Lcom/ibotta/android/blacklist/BlacklistClassifierType;

    aput-object v1, v0, v12

    sget-object v1, Lcom/ibotta/android/blacklist/BlacklistClassifierType;->APP_VERSION_LESS_THAN:Lcom/ibotta/android/blacklist/BlacklistClassifierType;

    aput-object v1, v0, v13

    sget-object v1, Lcom/ibotta/android/blacklist/BlacklistClassifierType;->APP_VERSION_LESS_THAN_OR_EQUAL:Lcom/ibotta/android/blacklist/BlacklistClassifierType;

    aput-object v1, v0, v14

    sget-object v1, Lcom/ibotta/android/blacklist/BlacklistClassifierType;->APP_VERSION_GREATER_THAN:Lcom/ibotta/android/blacklist/BlacklistClassifierType;

    const/16 v2, 0xd

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/blacklist/BlacklistClassifierType;->APP_VERSION_GREATER_THAN_OR_EQUAL:Lcom/ibotta/android/blacklist/BlacklistClassifierType;

    const/16 v2, 0xe

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/blacklist/BlacklistClassifierType;->OS_VERSION_EQUAL:Lcom/ibotta/android/blacklist/BlacklistClassifierType;

    const/16 v2, 0xf

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/blacklist/BlacklistClassifierType;->OS_VERSION_NOT_EQUAL:Lcom/ibotta/android/blacklist/BlacklistClassifierType;

    const/16 v2, 0x10

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/blacklist/BlacklistClassifierType;->OS_VERSION_LESS_THAN:Lcom/ibotta/android/blacklist/BlacklistClassifierType;

    const/16 v2, 0x11

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/blacklist/BlacklistClassifierType;->OS_VERSION_LESS_THAN_OR_EQUAL:Lcom/ibotta/android/blacklist/BlacklistClassifierType;

    const/16 v2, 0x12

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/blacklist/BlacklistClassifierType;->OS_VERSION_GREATER_THAN:Lcom/ibotta/android/blacklist/BlacklistClassifierType;

    const/16 v2, 0x13

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/blacklist/BlacklistClassifierType;->OS_VERSION_GREATER_THAN_OR_EQUAL:Lcom/ibotta/android/blacklist/BlacklistClassifierType;

    const/16 v2, 0x14

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/blacklist/BlacklistClassifierType;->DEVICE_MODEL_EQUAL:Lcom/ibotta/android/blacklist/BlacklistClassifierType;

    const/16 v2, 0x15

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/blacklist/BlacklistClassifierType;->DEVICE_MODEL_NOT_EQUAL:Lcom/ibotta/android/blacklist/BlacklistClassifierType;

    const/16 v2, 0x16

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/blacklist/BlacklistClassifierType;->DEVICE_MODEL_REGEX:Lcom/ibotta/android/blacklist/BlacklistClassifierType;

    const/16 v2, 0x17

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/blacklist/BlacklistClassifierType;->NO_OP:Lcom/ibotta/android/blacklist/BlacklistClassifierType;

    const/16 v2, 0x18

    aput-object v1, v0, v2

    sput-object v0, Lcom/ibotta/android/blacklist/BlacklistClassifierType;->$VALUES:[Lcom/ibotta/android/blacklist/BlacklistClassifierType;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 7
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static fromString(Ljava/lang/String;)Lcom/ibotta/android/blacklist/BlacklistClassifierType;
    .locals 1

    .line 35
    sget-object v0, Lcom/ibotta/android/blacklist/BlacklistClassifierType;->NO_OP:Lcom/ibotta/android/blacklist/BlacklistClassifierType;

    .line 38
    :try_start_0
    invoke-static {p0}, Lcom/ibotta/android/blacklist/BlacklistClassifierType;->valueOf(Ljava/lang/String;)Lcom/ibotta/android/blacklist/BlacklistClassifierType;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ibotta/android/blacklist/BlacklistClassifierType;
    .locals 1

    .line 7
    const-class v0, Lcom/ibotta/android/blacklist/BlacklistClassifierType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/blacklist/BlacklistClassifierType;

    return-object p0
.end method

.method public static values()[Lcom/ibotta/android/blacklist/BlacklistClassifierType;
    .locals 1

    .line 7
    sget-object v0, Lcom/ibotta/android/blacklist/BlacklistClassifierType;->$VALUES:[Lcom/ibotta/android/blacklist/BlacklistClassifierType;

    invoke-virtual {v0}, [Lcom/ibotta/android/blacklist/BlacklistClassifierType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ibotta/android/blacklist/BlacklistClassifierType;

    return-object v0
.end method
