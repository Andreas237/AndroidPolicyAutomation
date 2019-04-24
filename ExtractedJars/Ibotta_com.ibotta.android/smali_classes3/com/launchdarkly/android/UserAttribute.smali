.class abstract enum Lcom/launchdarkly/android/UserAttribute;
.super Ljava/lang/Enum;
.source "UserAttribute.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/launchdarkly/android/UserAttribute;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/launchdarkly/android/UserAttribute;

.field public static final enum anonymous:Lcom/launchdarkly/android/UserAttribute;

.field public static final enum avatar:Lcom/launchdarkly/android/UserAttribute;

.field public static final enum country:Lcom/launchdarkly/android/UserAttribute;

.field public static final enum email:Lcom/launchdarkly/android/UserAttribute;

.field public static final enum firstName:Lcom/launchdarkly/android/UserAttribute;

.field public static final enum ip:Lcom/launchdarkly/android/UserAttribute;

.field public static final enum key:Lcom/launchdarkly/android/UserAttribute;

.field public static final enum lastName:Lcom/launchdarkly/android/UserAttribute;

.field public static final enum name:Lcom/launchdarkly/android/UserAttribute;

.field public static final enum secondary:Lcom/launchdarkly/android/UserAttribute;


# direct methods
.method static constructor <clinit>()V
    .locals 12

    .line 7
    new-instance v0, Lcom/launchdarkly/android/UserAttribute$1;

    const-string v1, "key"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/launchdarkly/android/UserAttribute$1;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/launchdarkly/android/UserAttribute;->key:Lcom/launchdarkly/android/UserAttribute;

    .line 12
    new-instance v0, Lcom/launchdarkly/android/UserAttribute$2;

    const-string v1, "secondary"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/launchdarkly/android/UserAttribute$2;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/launchdarkly/android/UserAttribute;->secondary:Lcom/launchdarkly/android/UserAttribute;

    .line 17
    new-instance v0, Lcom/launchdarkly/android/UserAttribute$3;

    const-string v1, "ip"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Lcom/launchdarkly/android/UserAttribute$3;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/launchdarkly/android/UserAttribute;->ip:Lcom/launchdarkly/android/UserAttribute;

    .line 22
    new-instance v0, Lcom/launchdarkly/android/UserAttribute$4;

    const-string v1, "email"

    const/4 v5, 0x3

    invoke-direct {v0, v1, v5}, Lcom/launchdarkly/android/UserAttribute$4;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/launchdarkly/android/UserAttribute;->email:Lcom/launchdarkly/android/UserAttribute;

    .line 27
    new-instance v0, Lcom/launchdarkly/android/UserAttribute$5;

    const-string v1, "avatar"

    const/4 v6, 0x4

    invoke-direct {v0, v1, v6}, Lcom/launchdarkly/android/UserAttribute$5;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/launchdarkly/android/UserAttribute;->avatar:Lcom/launchdarkly/android/UserAttribute;

    .line 32
    new-instance v0, Lcom/launchdarkly/android/UserAttribute$6;

    const-string v1, "firstName"

    const/4 v7, 0x5

    invoke-direct {v0, v1, v7}, Lcom/launchdarkly/android/UserAttribute$6;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/launchdarkly/android/UserAttribute;->firstName:Lcom/launchdarkly/android/UserAttribute;

    .line 37
    new-instance v0, Lcom/launchdarkly/android/UserAttribute$7;

    const-string v1, "lastName"

    const/4 v8, 0x6

    invoke-direct {v0, v1, v8}, Lcom/launchdarkly/android/UserAttribute$7;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/launchdarkly/android/UserAttribute;->lastName:Lcom/launchdarkly/android/UserAttribute;

    .line 42
    new-instance v0, Lcom/launchdarkly/android/UserAttribute$8;

    const-string v1, "name"

    const/4 v9, 0x7

    invoke-direct {v0, v1, v9}, Lcom/launchdarkly/android/UserAttribute$8;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/launchdarkly/android/UserAttribute;->name:Lcom/launchdarkly/android/UserAttribute;

    .line 47
    new-instance v0, Lcom/launchdarkly/android/UserAttribute$9;

    const-string v1, "country"

    const/16 v10, 0x8

    invoke-direct {v0, v1, v10}, Lcom/launchdarkly/android/UserAttribute$9;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/launchdarkly/android/UserAttribute;->country:Lcom/launchdarkly/android/UserAttribute;

    .line 52
    new-instance v0, Lcom/launchdarkly/android/UserAttribute$10;

    const-string v1, "anonymous"

    const/16 v11, 0x9

    invoke-direct {v0, v1, v11}, Lcom/launchdarkly/android/UserAttribute$10;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/launchdarkly/android/UserAttribute;->anonymous:Lcom/launchdarkly/android/UserAttribute;

    const/16 v0, 0xa

    .line 6
    new-array v0, v0, [Lcom/launchdarkly/android/UserAttribute;

    sget-object v1, Lcom/launchdarkly/android/UserAttribute;->key:Lcom/launchdarkly/android/UserAttribute;

    aput-object v1, v0, v2

    sget-object v1, Lcom/launchdarkly/android/UserAttribute;->secondary:Lcom/launchdarkly/android/UserAttribute;

    aput-object v1, v0, v3

    sget-object v1, Lcom/launchdarkly/android/UserAttribute;->ip:Lcom/launchdarkly/android/UserAttribute;

    aput-object v1, v0, v4

    sget-object v1, Lcom/launchdarkly/android/UserAttribute;->email:Lcom/launchdarkly/android/UserAttribute;

    aput-object v1, v0, v5

    sget-object v1, Lcom/launchdarkly/android/UserAttribute;->avatar:Lcom/launchdarkly/android/UserAttribute;

    aput-object v1, v0, v6

    sget-object v1, Lcom/launchdarkly/android/UserAttribute;->firstName:Lcom/launchdarkly/android/UserAttribute;

    aput-object v1, v0, v7

    sget-object v1, Lcom/launchdarkly/android/UserAttribute;->lastName:Lcom/launchdarkly/android/UserAttribute;

    aput-object v1, v0, v8

    sget-object v1, Lcom/launchdarkly/android/UserAttribute;->name:Lcom/launchdarkly/android/UserAttribute;

    aput-object v1, v0, v9

    sget-object v1, Lcom/launchdarkly/android/UserAttribute;->country:Lcom/launchdarkly/android/UserAttribute;

    aput-object v1, v0, v10

    sget-object v1, Lcom/launchdarkly/android/UserAttribute;->anonymous:Lcom/launchdarkly/android/UserAttribute;

    aput-object v1, v0, v11

    sput-object v0, Lcom/launchdarkly/android/UserAttribute;->$VALUES:[Lcom/launchdarkly/android/UserAttribute;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 6
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/String;ILcom/launchdarkly/android/UserAttribute$1;)V
    .locals 0

    .line 6
    invoke-direct {p0, p1, p2}, Lcom/launchdarkly/android/UserAttribute;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/launchdarkly/android/UserAttribute;
    .locals 1

    .line 6
    const-class v0, Lcom/launchdarkly/android/UserAttribute;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/launchdarkly/android/UserAttribute;

    return-object p0
.end method

.method public static values()[Lcom/launchdarkly/android/UserAttribute;
    .locals 1

    .line 6
    sget-object v0, Lcom/launchdarkly/android/UserAttribute;->$VALUES:[Lcom/launchdarkly/android/UserAttribute;

    invoke-virtual {v0}, [Lcom/launchdarkly/android/UserAttribute;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/launchdarkly/android/UserAttribute;

    return-object v0
.end method


# virtual methods
.method abstract get(Lcom/launchdarkly/android/LDUser;)Lcom/google/gson/JsonElement;
.end method
