.class public final enum Lo/ekm$c;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/ekm;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lo/ekm$c;>;"
    }
.end annotation


# static fields
.field public static final enum a:Lo/ekm$c;

.field public static final enum b:Lo/ekm$c;

.field public static final enum c:Lo/ekm$c;

.field public static final enum d:Lo/ekm$c;

.field public static final enum e:Lo/ekm$c;

.field public static final enum f:Lo/ekm$c;

.field public static final enum g:Lo/ekm$c;

.field private static final synthetic h:[Lo/ekm$c;

.field public static final enum i:Lo/ekm$c;

.field public static final enum k:Lo/ekm$c;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 205
    new-instance v0, Lo/ekm$c;

    const-string v1, "HEART_RATE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lo/ekm$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/ekm$c;->a:Lo/ekm$c;

    new-instance v0, Lo/ekm$c;

    const-string v1, "STEP_FRE"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lo/ekm$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/ekm$c;->b:Lo/ekm$c;

    new-instance v0, Lo/ekm$c;

    const-string v1, "ALTITUDE"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lo/ekm$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/ekm$c;->d:Lo/ekm$c;

    new-instance v0, Lo/ekm$c;

    const-string v1, "SPEED_RATE"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lo/ekm$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/ekm$c;->c:Lo/ekm$c;

    new-instance v0, Lo/ekm$c;

    const-string v1, "REALTIME_PACE"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lo/ekm$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/ekm$c;->e:Lo/ekm$c;

    new-instance v0, Lo/ekm$c;

    const-string v1, "PULL_FREQ"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lo/ekm$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/ekm$c;->k:Lo/ekm$c;

    new-instance v0, Lo/ekm$c;

    const-string v1, "SWOLF"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lo/ekm$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/ekm$c;->i:Lo/ekm$c;

    new-instance v0, Lo/ekm$c;

    const-string v1, "GROUND_CONTACT_TIME"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Lo/ekm$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/ekm$c;->f:Lo/ekm$c;

    new-instance v0, Lo/ekm$c;

    const-string v1, "GROUND_IMPACT_ACCELERATION"

    const/16 v2, 0x8

    invoke-direct {v0, v1, v2}, Lo/ekm$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/ekm$c;->g:Lo/ekm$c;

    .line 203
    const/16 v0, 0x9

    new-array v0, v0, [Lo/ekm$c;

    sget-object v1, Lo/ekm$c;->a:Lo/ekm$c;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lo/ekm$c;->b:Lo/ekm$c;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lo/ekm$c;->d:Lo/ekm$c;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lo/ekm$c;->c:Lo/ekm$c;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Lo/ekm$c;->e:Lo/ekm$c;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sget-object v1, Lo/ekm$c;->k:Lo/ekm$c;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    sget-object v1, Lo/ekm$c;->i:Lo/ekm$c;

    const/4 v2, 0x6

    aput-object v1, v0, v2

    sget-object v1, Lo/ekm$c;->f:Lo/ekm$c;

    const/4 v2, 0x7

    aput-object v1, v0, v2

    sget-object v1, Lo/ekm$c;->g:Lo/ekm$c;

    const/16 v2, 0x8

    aput-object v1, v0, v2

    sput-object v0, Lo/ekm$c;->h:[Lo/ekm$c;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 203
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lo/ekm$c;
    .locals 1

    .line 203
    const-class v0, Lo/ekm$c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lo/ekm$c;

    return-object v0
.end method

.method public static values()[Lo/ekm$c;
    .locals 1

    .line 203
    sget-object v0, Lo/ekm$c;->h:[Lo/ekm$c;

    invoke-virtual {v0}, [Lo/ekm$c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lo/ekm$c;

    return-object v0
.end method
