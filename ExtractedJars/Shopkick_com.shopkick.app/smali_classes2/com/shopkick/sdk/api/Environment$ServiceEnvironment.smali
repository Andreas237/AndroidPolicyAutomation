.class public final enum Lcom/shopkick/sdk/api/Environment$ServiceEnvironment;
.super Ljava/lang/Enum;
.source "Environment.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/sdk/api/Environment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "ServiceEnvironment"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/shopkick/sdk/api/Environment$ServiceEnvironment;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/shopkick/sdk/api/Environment$ServiceEnvironment;

.field public static final enum ALPHA:Lcom/shopkick/sdk/api/Environment$ServiceEnvironment;

.field public static final enum BETA:Lcom/shopkick/sdk/api/Environment$ServiceEnvironment;

.field public static final enum DEV:Lcom/shopkick/sdk/api/Environment$ServiceEnvironment;

.field public static final enum LOCALHOST:Lcom/shopkick/sdk/api/Environment$ServiceEnvironment;

.field public static final enum PROD:Lcom/shopkick/sdk/api/Environment$ServiceEnvironment;

.field public static final enum PRODUCTION:Lcom/shopkick/sdk/api/Environment$ServiceEnvironment;

.field public static final enum QA:Lcom/shopkick/sdk/api/Environment$ServiceEnvironment;

.field public static final enum STAGING:Lcom/shopkick/sdk/api/Environment$ServiceEnvironment;


# direct methods
.method static constructor <clinit>()V
    .locals 10

    .line 28
    new-instance v0, Lcom/shopkick/sdk/api/Environment$ServiceEnvironment;

    const-string v1, "PROD"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/shopkick/sdk/api/Environment$ServiceEnvironment;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/sdk/api/Environment$ServiceEnvironment;->PROD:Lcom/shopkick/sdk/api/Environment$ServiceEnvironment;

    .line 30
    new-instance v0, Lcom/shopkick/sdk/api/Environment$ServiceEnvironment;

    const-string v1, "PRODUCTION"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/shopkick/sdk/api/Environment$ServiceEnvironment;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/sdk/api/Environment$ServiceEnvironment;->PRODUCTION:Lcom/shopkick/sdk/api/Environment$ServiceEnvironment;

    .line 33
    new-instance v0, Lcom/shopkick/sdk/api/Environment$ServiceEnvironment;

    const-string v1, "BETA"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Lcom/shopkick/sdk/api/Environment$ServiceEnvironment;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/sdk/api/Environment$ServiceEnvironment;->BETA:Lcom/shopkick/sdk/api/Environment$ServiceEnvironment;

    .line 35
    new-instance v0, Lcom/shopkick/sdk/api/Environment$ServiceEnvironment;

    const-string v1, "QA"

    const/4 v5, 0x3

    invoke-direct {v0, v1, v5}, Lcom/shopkick/sdk/api/Environment$ServiceEnvironment;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/sdk/api/Environment$ServiceEnvironment;->QA:Lcom/shopkick/sdk/api/Environment$ServiceEnvironment;

    .line 37
    new-instance v0, Lcom/shopkick/sdk/api/Environment$ServiceEnvironment;

    const-string v1, "STAGING"

    const/4 v6, 0x4

    invoke-direct {v0, v1, v6}, Lcom/shopkick/sdk/api/Environment$ServiceEnvironment;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/sdk/api/Environment$ServiceEnvironment;->STAGING:Lcom/shopkick/sdk/api/Environment$ServiceEnvironment;

    .line 40
    new-instance v0, Lcom/shopkick/sdk/api/Environment$ServiceEnvironment;

    const-string v1, "ALPHA"

    const/4 v7, 0x5

    invoke-direct {v0, v1, v7}, Lcom/shopkick/sdk/api/Environment$ServiceEnvironment;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/sdk/api/Environment$ServiceEnvironment;->ALPHA:Lcom/shopkick/sdk/api/Environment$ServiceEnvironment;

    .line 46
    new-instance v0, Lcom/shopkick/sdk/api/Environment$ServiceEnvironment;

    const-string v1, "DEV"

    const/4 v8, 0x6

    invoke-direct {v0, v1, v8}, Lcom/shopkick/sdk/api/Environment$ServiceEnvironment;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/sdk/api/Environment$ServiceEnvironment;->DEV:Lcom/shopkick/sdk/api/Environment$ServiceEnvironment;

    .line 48
    new-instance v0, Lcom/shopkick/sdk/api/Environment$ServiceEnvironment;

    const-string v1, "LOCALHOST"

    const/4 v9, 0x7

    invoke-direct {v0, v1, v9}, Lcom/shopkick/sdk/api/Environment$ServiceEnvironment;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/sdk/api/Environment$ServiceEnvironment;->LOCALHOST:Lcom/shopkick/sdk/api/Environment$ServiceEnvironment;

    const/16 v0, 0x8

    .line 25
    new-array v0, v0, [Lcom/shopkick/sdk/api/Environment$ServiceEnvironment;

    sget-object v1, Lcom/shopkick/sdk/api/Environment$ServiceEnvironment;->PROD:Lcom/shopkick/sdk/api/Environment$ServiceEnvironment;

    aput-object v1, v0, v2

    sget-object v1, Lcom/shopkick/sdk/api/Environment$ServiceEnvironment;->PRODUCTION:Lcom/shopkick/sdk/api/Environment$ServiceEnvironment;

    aput-object v1, v0, v3

    sget-object v1, Lcom/shopkick/sdk/api/Environment$ServiceEnvironment;->BETA:Lcom/shopkick/sdk/api/Environment$ServiceEnvironment;

    aput-object v1, v0, v4

    sget-object v1, Lcom/shopkick/sdk/api/Environment$ServiceEnvironment;->QA:Lcom/shopkick/sdk/api/Environment$ServiceEnvironment;

    aput-object v1, v0, v5

    sget-object v1, Lcom/shopkick/sdk/api/Environment$ServiceEnvironment;->STAGING:Lcom/shopkick/sdk/api/Environment$ServiceEnvironment;

    aput-object v1, v0, v6

    sget-object v1, Lcom/shopkick/sdk/api/Environment$ServiceEnvironment;->ALPHA:Lcom/shopkick/sdk/api/Environment$ServiceEnvironment;

    aput-object v1, v0, v7

    sget-object v1, Lcom/shopkick/sdk/api/Environment$ServiceEnvironment;->DEV:Lcom/shopkick/sdk/api/Environment$ServiceEnvironment;

    aput-object v1, v0, v8

    sget-object v1, Lcom/shopkick/sdk/api/Environment$ServiceEnvironment;->LOCALHOST:Lcom/shopkick/sdk/api/Environment$ServiceEnvironment;

    aput-object v1, v0, v9

    sput-object v0, Lcom/shopkick/sdk/api/Environment$ServiceEnvironment;->$VALUES:[Lcom/shopkick/sdk/api/Environment$ServiceEnvironment;

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

.method public static valueOf(Ljava/lang/String;)Lcom/shopkick/sdk/api/Environment$ServiceEnvironment;
    .locals 1

    .line 25
    const-class v0, Lcom/shopkick/sdk/api/Environment$ServiceEnvironment;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/shopkick/sdk/api/Environment$ServiceEnvironment;

    return-object p0
.end method

.method public static values()[Lcom/shopkick/sdk/api/Environment$ServiceEnvironment;
    .locals 1

    .line 25
    sget-object v0, Lcom/shopkick/sdk/api/Environment$ServiceEnvironment;->$VALUES:[Lcom/shopkick/sdk/api/Environment$ServiceEnvironment;

    invoke-virtual {v0}, [Lcom/shopkick/sdk/api/Environment$ServiceEnvironment;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/shopkick/sdk/api/Environment$ServiceEnvironment;

    return-object v0
.end method
