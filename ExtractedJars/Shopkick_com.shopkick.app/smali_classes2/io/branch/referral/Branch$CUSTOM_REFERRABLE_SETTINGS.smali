.class final enum Lio/branch/referral/Branch$CUSTOM_REFERRABLE_SETTINGS;
.super Ljava/lang/Enum;
.source "Branch.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/branch/referral/Branch;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401a
    name = "CUSTOM_REFERRABLE_SETTINGS"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lio/branch/referral/Branch$CUSTOM_REFERRABLE_SETTINGS;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lio/branch/referral/Branch$CUSTOM_REFERRABLE_SETTINGS;

.field public static final enum NON_REFERRABLE:Lio/branch/referral/Branch$CUSTOM_REFERRABLE_SETTINGS;

.field public static final enum REFERRABLE:Lio/branch/referral/Branch$CUSTOM_REFERRABLE_SETTINGS;

.field public static final enum USE_DEFAULT:Lio/branch/referral/Branch$CUSTOM_REFERRABLE_SETTINGS;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 356
    new-instance v0, Lio/branch/referral/Branch$CUSTOM_REFERRABLE_SETTINGS;

    const-string v1, "USE_DEFAULT"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lio/branch/referral/Branch$CUSTOM_REFERRABLE_SETTINGS;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/branch/referral/Branch$CUSTOM_REFERRABLE_SETTINGS;->USE_DEFAULT:Lio/branch/referral/Branch$CUSTOM_REFERRABLE_SETTINGS;

    new-instance v0, Lio/branch/referral/Branch$CUSTOM_REFERRABLE_SETTINGS;

    const-string v1, "REFERRABLE"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lio/branch/referral/Branch$CUSTOM_REFERRABLE_SETTINGS;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/branch/referral/Branch$CUSTOM_REFERRABLE_SETTINGS;->REFERRABLE:Lio/branch/referral/Branch$CUSTOM_REFERRABLE_SETTINGS;

    new-instance v0, Lio/branch/referral/Branch$CUSTOM_REFERRABLE_SETTINGS;

    const-string v1, "NON_REFERRABLE"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Lio/branch/referral/Branch$CUSTOM_REFERRABLE_SETTINGS;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/branch/referral/Branch$CUSTOM_REFERRABLE_SETTINGS;->NON_REFERRABLE:Lio/branch/referral/Branch$CUSTOM_REFERRABLE_SETTINGS;

    const/4 v0, 0x3

    .line 355
    new-array v0, v0, [Lio/branch/referral/Branch$CUSTOM_REFERRABLE_SETTINGS;

    sget-object v1, Lio/branch/referral/Branch$CUSTOM_REFERRABLE_SETTINGS;->USE_DEFAULT:Lio/branch/referral/Branch$CUSTOM_REFERRABLE_SETTINGS;

    aput-object v1, v0, v2

    sget-object v1, Lio/branch/referral/Branch$CUSTOM_REFERRABLE_SETTINGS;->REFERRABLE:Lio/branch/referral/Branch$CUSTOM_REFERRABLE_SETTINGS;

    aput-object v1, v0, v3

    sget-object v1, Lio/branch/referral/Branch$CUSTOM_REFERRABLE_SETTINGS;->NON_REFERRABLE:Lio/branch/referral/Branch$CUSTOM_REFERRABLE_SETTINGS;

    aput-object v1, v0, v4

    sput-object v0, Lio/branch/referral/Branch$CUSTOM_REFERRABLE_SETTINGS;->$VALUES:[Lio/branch/referral/Branch$CUSTOM_REFERRABLE_SETTINGS;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 355
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lio/branch/referral/Branch$CUSTOM_REFERRABLE_SETTINGS;
    .locals 1

    .line 355
    const-class v0, Lio/branch/referral/Branch$CUSTOM_REFERRABLE_SETTINGS;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lio/branch/referral/Branch$CUSTOM_REFERRABLE_SETTINGS;

    return-object p0
.end method

.method public static values()[Lio/branch/referral/Branch$CUSTOM_REFERRABLE_SETTINGS;
    .locals 1

    .line 355
    sget-object v0, Lio/branch/referral/Branch$CUSTOM_REFERRABLE_SETTINGS;->$VALUES:[Lio/branch/referral/Branch$CUSTOM_REFERRABLE_SETTINGS;

    invoke-virtual {v0}, [Lio/branch/referral/Branch$CUSTOM_REFERRABLE_SETTINGS;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lio/branch/referral/Branch$CUSTOM_REFERRABLE_SETTINGS;

    return-object v0
.end method
