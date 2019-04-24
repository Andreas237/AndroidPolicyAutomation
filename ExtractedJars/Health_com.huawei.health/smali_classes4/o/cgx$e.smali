.class public final enum Lo/cgx$e;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/cgx;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lo/cgx$e;>;"
    }
.end annotation


# static fields
.field public static final enum a:Lo/cgx$e;

.field public static final enum b:Lo/cgx$e;

.field public static final enum c:Lo/cgx$e;

.field public static final enum d:Lo/cgx$e;

.field public static final enum e:Lo/cgx$e;

.field public static final enum f:Lo/cgx$e;

.field public static final enum g:Lo/cgx$e;

.field private static final synthetic h:[Lo/cgx$e;

.field public static final enum i:Lo/cgx$e;

.field public static final enum k:Lo/cgx$e;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 44
    new-instance v0, Lo/cgx$e;

    const-string v1, "HEART_RATE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lo/cgx$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/cgx$e;->a:Lo/cgx$e;

    new-instance v0, Lo/cgx$e;

    const-string v1, "STEP_RATE"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lo/cgx$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/cgx$e;->d:Lo/cgx$e;

    new-instance v0, Lo/cgx$e;

    const-string v1, "ALTITUDE"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lo/cgx$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/cgx$e;->c:Lo/cgx$e;

    new-instance v0, Lo/cgx$e;

    const-string v1, "SPEED_RATE"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lo/cgx$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/cgx$e;->b:Lo/cgx$e;

    new-instance v0, Lo/cgx$e;

    const-string v1, "SWOLF"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lo/cgx$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/cgx$e;->e:Lo/cgx$e;

    new-instance v0, Lo/cgx$e;

    const-string v1, "REALTIME_PACE"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lo/cgx$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/cgx$e;->f:Lo/cgx$e;

    new-instance v0, Lo/cgx$e;

    const-string v1, "PULL_FREQ"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lo/cgx$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/cgx$e;->k:Lo/cgx$e;

    new-instance v0, Lo/cgx$e;

    const-string v1, "GROUND_CONTACT_TIME"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Lo/cgx$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/cgx$e;->g:Lo/cgx$e;

    new-instance v0, Lo/cgx$e;

    const-string v1, "GROUND_IMPACT_ACCELERATION"

    const/16 v2, 0x8

    invoke-direct {v0, v1, v2}, Lo/cgx$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/cgx$e;->i:Lo/cgx$e;

    .line 43
    const/16 v0, 0x9

    new-array v0, v0, [Lo/cgx$e;

    sget-object v1, Lo/cgx$e;->a:Lo/cgx$e;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lo/cgx$e;->d:Lo/cgx$e;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lo/cgx$e;->c:Lo/cgx$e;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lo/cgx$e;->b:Lo/cgx$e;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Lo/cgx$e;->e:Lo/cgx$e;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sget-object v1, Lo/cgx$e;->f:Lo/cgx$e;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    sget-object v1, Lo/cgx$e;->k:Lo/cgx$e;

    const/4 v2, 0x6

    aput-object v1, v0, v2

    sget-object v1, Lo/cgx$e;->g:Lo/cgx$e;

    const/4 v2, 0x7

    aput-object v1, v0, v2

    sget-object v1, Lo/cgx$e;->i:Lo/cgx$e;

    const/16 v2, 0x8

    aput-object v1, v0, v2

    sput-object v0, Lo/cgx$e;->h:[Lo/cgx$e;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 43
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lo/cgx$e;
    .locals 1

    .line 43
    const-class v0, Lo/cgx$e;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lo/cgx$e;

    return-object v0
.end method

.method public static values()[Lo/cgx$e;
    .locals 1

    .line 43
    sget-object v0, Lo/cgx$e;->h:[Lo/cgx$e;

    invoke-virtual {v0}, [Lo/cgx$e;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lo/cgx$e;

    return-object v0
.end method
