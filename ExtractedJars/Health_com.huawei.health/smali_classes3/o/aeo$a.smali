.class public final enum Lo/aeo$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/aeo;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lo/aeo$a;>;"
    }
.end annotation


# static fields
.field public static final enum a:Lo/aeo$a;

.field public static final enum b:Lo/aeo$a;

.field public static final enum c:Lo/aeo$a;

.field public static final enum d:Lo/aeo$a;

.field public static final enum e:Lo/aeo$a;

.field private static final synthetic f:[Lo/aeo$a;

.field public static final enum h:Lo/aeo$a;

.field public static final enum k:Lo/aeo$a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 12
    new-instance v0, Lo/aeo$a;

    const-string v1, "SET_AGE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lo/aeo$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/aeo$a;->d:Lo/aeo$a;

    .line 13
    new-instance v0, Lo/aeo$a;

    const-string v1, "SET_GENDER"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lo/aeo$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/aeo$a;->a:Lo/aeo$a;

    .line 14
    new-instance v0, Lo/aeo$a;

    const-string v1, "SET_HEIGHT"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lo/aeo$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/aeo$a;->e:Lo/aeo$a;

    .line 15
    new-instance v0, Lo/aeo$a;

    const-string v1, "SET_TIME"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lo/aeo$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/aeo$a;->c:Lo/aeo$a;

    .line 16
    new-instance v0, Lo/aeo$a;

    const-string v1, "ENABLE_WEIGHT_SCALE"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lo/aeo$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/aeo$a;->b:Lo/aeo$a;

    .line 17
    new-instance v0, Lo/aeo$a;

    const-string v1, "ENABLE_BODY_MEASUREMENT"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lo/aeo$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/aeo$a;->h:Lo/aeo$a;

    .line 18
    new-instance v0, Lo/aeo$a;

    const-string v1, "ENABLE_GLUCOSE_MEASUREMENT"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lo/aeo$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/aeo$a;->k:Lo/aeo$a;

    .line 11
    const/4 v0, 0x7

    new-array v0, v0, [Lo/aeo$a;

    sget-object v1, Lo/aeo$a;->d:Lo/aeo$a;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lo/aeo$a;->a:Lo/aeo$a;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lo/aeo$a;->e:Lo/aeo$a;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lo/aeo$a;->c:Lo/aeo$a;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Lo/aeo$a;->b:Lo/aeo$a;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sget-object v1, Lo/aeo$a;->h:Lo/aeo$a;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    sget-object v1, Lo/aeo$a;->k:Lo/aeo$a;

    const/4 v2, 0x6

    aput-object v1, v0, v2

    sput-object v0, Lo/aeo$a;->f:[Lo/aeo$a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 20
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 21
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lo/aeo$a;
    .locals 1

    .line 11
    const-class v0, Lo/aeo$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lo/aeo$a;

    return-object v0
.end method

.method public static values()[Lo/aeo$a;
    .locals 1

    .line 11
    sget-object v0, Lo/aeo$a;->f:[Lo/aeo$a;

    invoke-virtual {v0}, [Lo/aeo$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lo/aeo$a;

    return-object v0
.end method
