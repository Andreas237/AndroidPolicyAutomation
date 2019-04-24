.class final enum Lio/branch/referral/ServerRequest$PROCESS_WAIT_LOCK;
.super Ljava/lang/Enum;
.source "ServerRequest.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/branch/referral/ServerRequest;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4018
    name = "PROCESS_WAIT_LOCK"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lio/branch/referral/ServerRequest$PROCESS_WAIT_LOCK;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lio/branch/referral/ServerRequest$PROCESS_WAIT_LOCK;

.field public static final enum FB_APP_LINK_WAIT_LOCK:Lio/branch/referral/ServerRequest$PROCESS_WAIT_LOCK;

.field public static final enum GAID_FETCH_WAIT_LOCK:Lio/branch/referral/ServerRequest$PROCESS_WAIT_LOCK;

.field public static final enum INSTALL_REFERRER_FETCH_WAIT_LOCK:Lio/branch/referral/ServerRequest$PROCESS_WAIT_LOCK;

.field public static final enum INTENT_PENDING_WAIT_LOCK:Lio/branch/referral/ServerRequest$PROCESS_WAIT_LOCK;

.field public static final enum STRONG_MATCH_PENDING_WAIT_LOCK:Lio/branch/referral/ServerRequest$PROCESS_WAIT_LOCK;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 41
    new-instance v0, Lio/branch/referral/ServerRequest$PROCESS_WAIT_LOCK;

    const-string v1, "FB_APP_LINK_WAIT_LOCK"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lio/branch/referral/ServerRequest$PROCESS_WAIT_LOCK;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/branch/referral/ServerRequest$PROCESS_WAIT_LOCK;->FB_APP_LINK_WAIT_LOCK:Lio/branch/referral/ServerRequest$PROCESS_WAIT_LOCK;

    new-instance v0, Lio/branch/referral/ServerRequest$PROCESS_WAIT_LOCK;

    const-string v1, "GAID_FETCH_WAIT_LOCK"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lio/branch/referral/ServerRequest$PROCESS_WAIT_LOCK;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/branch/referral/ServerRequest$PROCESS_WAIT_LOCK;->GAID_FETCH_WAIT_LOCK:Lio/branch/referral/ServerRequest$PROCESS_WAIT_LOCK;

    new-instance v0, Lio/branch/referral/ServerRequest$PROCESS_WAIT_LOCK;

    const-string v1, "INTENT_PENDING_WAIT_LOCK"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Lio/branch/referral/ServerRequest$PROCESS_WAIT_LOCK;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/branch/referral/ServerRequest$PROCESS_WAIT_LOCK;->INTENT_PENDING_WAIT_LOCK:Lio/branch/referral/ServerRequest$PROCESS_WAIT_LOCK;

    new-instance v0, Lio/branch/referral/ServerRequest$PROCESS_WAIT_LOCK;

    const-string v1, "STRONG_MATCH_PENDING_WAIT_LOCK"

    const/4 v5, 0x3

    invoke-direct {v0, v1, v5}, Lio/branch/referral/ServerRequest$PROCESS_WAIT_LOCK;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/branch/referral/ServerRequest$PROCESS_WAIT_LOCK;->STRONG_MATCH_PENDING_WAIT_LOCK:Lio/branch/referral/ServerRequest$PROCESS_WAIT_LOCK;

    .line 42
    new-instance v0, Lio/branch/referral/ServerRequest$PROCESS_WAIT_LOCK;

    const-string v1, "INSTALL_REFERRER_FETCH_WAIT_LOCK"

    const/4 v6, 0x4

    invoke-direct {v0, v1, v6}, Lio/branch/referral/ServerRequest$PROCESS_WAIT_LOCK;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/branch/referral/ServerRequest$PROCESS_WAIT_LOCK;->INSTALL_REFERRER_FETCH_WAIT_LOCK:Lio/branch/referral/ServerRequest$PROCESS_WAIT_LOCK;

    const/4 v0, 0x5

    .line 40
    new-array v0, v0, [Lio/branch/referral/ServerRequest$PROCESS_WAIT_LOCK;

    sget-object v1, Lio/branch/referral/ServerRequest$PROCESS_WAIT_LOCK;->FB_APP_LINK_WAIT_LOCK:Lio/branch/referral/ServerRequest$PROCESS_WAIT_LOCK;

    aput-object v1, v0, v2

    sget-object v1, Lio/branch/referral/ServerRequest$PROCESS_WAIT_LOCK;->GAID_FETCH_WAIT_LOCK:Lio/branch/referral/ServerRequest$PROCESS_WAIT_LOCK;

    aput-object v1, v0, v3

    sget-object v1, Lio/branch/referral/ServerRequest$PROCESS_WAIT_LOCK;->INTENT_PENDING_WAIT_LOCK:Lio/branch/referral/ServerRequest$PROCESS_WAIT_LOCK;

    aput-object v1, v0, v4

    sget-object v1, Lio/branch/referral/ServerRequest$PROCESS_WAIT_LOCK;->STRONG_MATCH_PENDING_WAIT_LOCK:Lio/branch/referral/ServerRequest$PROCESS_WAIT_LOCK;

    aput-object v1, v0, v5

    sget-object v1, Lio/branch/referral/ServerRequest$PROCESS_WAIT_LOCK;->INSTALL_REFERRER_FETCH_WAIT_LOCK:Lio/branch/referral/ServerRequest$PROCESS_WAIT_LOCK;

    aput-object v1, v0, v6

    sput-object v0, Lio/branch/referral/ServerRequest$PROCESS_WAIT_LOCK;->$VALUES:[Lio/branch/referral/ServerRequest$PROCESS_WAIT_LOCK;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 40
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lio/branch/referral/ServerRequest$PROCESS_WAIT_LOCK;
    .locals 1

    .line 40
    const-class v0, Lio/branch/referral/ServerRequest$PROCESS_WAIT_LOCK;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lio/branch/referral/ServerRequest$PROCESS_WAIT_LOCK;

    return-object p0
.end method

.method public static values()[Lio/branch/referral/ServerRequest$PROCESS_WAIT_LOCK;
    .locals 1

    .line 40
    sget-object v0, Lio/branch/referral/ServerRequest$PROCESS_WAIT_LOCK;->$VALUES:[Lio/branch/referral/ServerRequest$PROCESS_WAIT_LOCK;

    invoke-virtual {v0}, [Lio/branch/referral/ServerRequest$PROCESS_WAIT_LOCK;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lio/branch/referral/ServerRequest$PROCESS_WAIT_LOCK;

    return-object v0
.end method
