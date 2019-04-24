.class final enum Lcom/launchdarkly/android/LDCountryCode$Assignment;
.super Ljava/lang/Enum;
.source "LDCountryCode.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/launchdarkly/android/LDCountryCode;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4018
    name = "Assignment"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/launchdarkly/android/LDCountryCode$Assignment;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/launchdarkly/android/LDCountryCode$Assignment;

.field public static final enum EXCEPTIONALLY_RESERVED:Lcom/launchdarkly/android/LDCountryCode$Assignment;

.field public static final enum INDETERMINATELY_RESERVED:Lcom/launchdarkly/android/LDCountryCode$Assignment;

.field public static final enum NOT_USED:Lcom/launchdarkly/android/LDCountryCode$Assignment;

.field public static final enum OFFICIALLY_ASSIGNED:Lcom/launchdarkly/android/LDCountryCode$Assignment;

.field public static final enum TRANSITIONALLY_RESERVED:Lcom/launchdarkly/android/LDCountryCode$Assignment;

.field public static final enum USER_ASSIGNED:Lcom/launchdarkly/android/LDCountryCode$Assignment;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 2065
    new-instance v0, Lcom/launchdarkly/android/LDCountryCode$Assignment;

    const-string v1, "OFFICIALLY_ASSIGNED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/launchdarkly/android/LDCountryCode$Assignment;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/launchdarkly/android/LDCountryCode$Assignment;->OFFICIALLY_ASSIGNED:Lcom/launchdarkly/android/LDCountryCode$Assignment;

    .line 2073
    new-instance v0, Lcom/launchdarkly/android/LDCountryCode$Assignment;

    const-string v1, "USER_ASSIGNED"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/launchdarkly/android/LDCountryCode$Assignment;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/launchdarkly/android/LDCountryCode$Assignment;->USER_ASSIGNED:Lcom/launchdarkly/android/LDCountryCode$Assignment;

    .line 2081
    new-instance v0, Lcom/launchdarkly/android/LDCountryCode$Assignment;

    const-string v1, "EXCEPTIONALLY_RESERVED"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Lcom/launchdarkly/android/LDCountryCode$Assignment;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/launchdarkly/android/LDCountryCode$Assignment;->EXCEPTIONALLY_RESERVED:Lcom/launchdarkly/android/LDCountryCode$Assignment;

    .line 2089
    new-instance v0, Lcom/launchdarkly/android/LDCountryCode$Assignment;

    const-string v1, "TRANSITIONALLY_RESERVED"

    const/4 v5, 0x3

    invoke-direct {v0, v1, v5}, Lcom/launchdarkly/android/LDCountryCode$Assignment;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/launchdarkly/android/LDCountryCode$Assignment;->TRANSITIONALLY_RESERVED:Lcom/launchdarkly/android/LDCountryCode$Assignment;

    .line 2097
    new-instance v0, Lcom/launchdarkly/android/LDCountryCode$Assignment;

    const-string v1, "INDETERMINATELY_RESERVED"

    const/4 v6, 0x4

    invoke-direct {v0, v1, v6}, Lcom/launchdarkly/android/LDCountryCode$Assignment;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/launchdarkly/android/LDCountryCode$Assignment;->INDETERMINATELY_RESERVED:Lcom/launchdarkly/android/LDCountryCode$Assignment;

    .line 2106
    new-instance v0, Lcom/launchdarkly/android/LDCountryCode$Assignment;

    const-string v1, "NOT_USED"

    const/4 v7, 0x5

    invoke-direct {v0, v1, v7}, Lcom/launchdarkly/android/LDCountryCode$Assignment;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/launchdarkly/android/LDCountryCode$Assignment;->NOT_USED:Lcom/launchdarkly/android/LDCountryCode$Assignment;

    const/4 v0, 0x6

    .line 2058
    new-array v0, v0, [Lcom/launchdarkly/android/LDCountryCode$Assignment;

    sget-object v1, Lcom/launchdarkly/android/LDCountryCode$Assignment;->OFFICIALLY_ASSIGNED:Lcom/launchdarkly/android/LDCountryCode$Assignment;

    aput-object v1, v0, v2

    sget-object v1, Lcom/launchdarkly/android/LDCountryCode$Assignment;->USER_ASSIGNED:Lcom/launchdarkly/android/LDCountryCode$Assignment;

    aput-object v1, v0, v3

    sget-object v1, Lcom/launchdarkly/android/LDCountryCode$Assignment;->EXCEPTIONALLY_RESERVED:Lcom/launchdarkly/android/LDCountryCode$Assignment;

    aput-object v1, v0, v4

    sget-object v1, Lcom/launchdarkly/android/LDCountryCode$Assignment;->TRANSITIONALLY_RESERVED:Lcom/launchdarkly/android/LDCountryCode$Assignment;

    aput-object v1, v0, v5

    sget-object v1, Lcom/launchdarkly/android/LDCountryCode$Assignment;->INDETERMINATELY_RESERVED:Lcom/launchdarkly/android/LDCountryCode$Assignment;

    aput-object v1, v0, v6

    sget-object v1, Lcom/launchdarkly/android/LDCountryCode$Assignment;->NOT_USED:Lcom/launchdarkly/android/LDCountryCode$Assignment;

    aput-object v1, v0, v7

    sput-object v0, Lcom/launchdarkly/android/LDCountryCode$Assignment;->$VALUES:[Lcom/launchdarkly/android/LDCountryCode$Assignment;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 2058
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/launchdarkly/android/LDCountryCode$Assignment;
    .locals 1

    .line 2058
    const-class v0, Lcom/launchdarkly/android/LDCountryCode$Assignment;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/launchdarkly/android/LDCountryCode$Assignment;

    return-object p0
.end method

.method public static values()[Lcom/launchdarkly/android/LDCountryCode$Assignment;
    .locals 1

    .line 2058
    sget-object v0, Lcom/launchdarkly/android/LDCountryCode$Assignment;->$VALUES:[Lcom/launchdarkly/android/LDCountryCode$Assignment;

    invoke-virtual {v0}, [Lcom/launchdarkly/android/LDCountryCode$Assignment;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/launchdarkly/android/LDCountryCode$Assignment;

    return-object v0
.end method
