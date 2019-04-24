.class final enum Lio/branch/referral/Branch$INTENT_STATE;
.super Ljava/lang/Enum;
.source "Branch.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/branch/referral/Branch;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401a
    name = "INTENT_STATE"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lio/branch/referral/Branch$INTENT_STATE;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lio/branch/referral/Branch$INTENT_STATE;

.field public static final enum PENDING:Lio/branch/referral/Branch$INTENT_STATE;

.field public static final enum READY:Lio/branch/referral/Branch$INTENT_STATE;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 338
    new-instance v0, Lio/branch/referral/Branch$INTENT_STATE;

    const-string v1, "PENDING"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lio/branch/referral/Branch$INTENT_STATE;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/branch/referral/Branch$INTENT_STATE;->PENDING:Lio/branch/referral/Branch$INTENT_STATE;

    .line 339
    new-instance v0, Lio/branch/referral/Branch$INTENT_STATE;

    const-string v1, "READY"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lio/branch/referral/Branch$INTENT_STATE;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/branch/referral/Branch$INTENT_STATE;->READY:Lio/branch/referral/Branch$INTENT_STATE;

    const/4 v0, 0x2

    .line 337
    new-array v0, v0, [Lio/branch/referral/Branch$INTENT_STATE;

    sget-object v1, Lio/branch/referral/Branch$INTENT_STATE;->PENDING:Lio/branch/referral/Branch$INTENT_STATE;

    aput-object v1, v0, v2

    sget-object v1, Lio/branch/referral/Branch$INTENT_STATE;->READY:Lio/branch/referral/Branch$INTENT_STATE;

    aput-object v1, v0, v3

    sput-object v0, Lio/branch/referral/Branch$INTENT_STATE;->$VALUES:[Lio/branch/referral/Branch$INTENT_STATE;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 337
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lio/branch/referral/Branch$INTENT_STATE;
    .locals 1

    .line 337
    const-class v0, Lio/branch/referral/Branch$INTENT_STATE;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lio/branch/referral/Branch$INTENT_STATE;

    return-object p0
.end method

.method public static values()[Lio/branch/referral/Branch$INTENT_STATE;
    .locals 1

    .line 337
    sget-object v0, Lio/branch/referral/Branch$INTENT_STATE;->$VALUES:[Lio/branch/referral/Branch$INTENT_STATE;

    invoke-virtual {v0}, [Lio/branch/referral/Branch$INTENT_STATE;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lio/branch/referral/Branch$INTENT_STATE;

    return-object v0
.end method
