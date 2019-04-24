.class final enum Lo/adp$e;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/adp;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4018
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lo/adp$e;>;"
    }
.end annotation


# static fields
.field private static final synthetic a:[Lo/adp$e;

.field public static final enum d:Lo/adp$e;

.field public static final enum e:Lo/adp$e;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 66
    new-instance v0, Lo/adp$e;

    const-string v1, "OTA_SCALE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lo/adp$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/adp$e;->e:Lo/adp$e;

    .line 67
    new-instance v0, Lo/adp$e;

    const-string v1, "OTA_BLE"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lo/adp$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/adp$e;->d:Lo/adp$e;

    .line 65
    const/4 v0, 0x2

    new-array v0, v0, [Lo/adp$e;

    sget-object v1, Lo/adp$e;->e:Lo/adp$e;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lo/adp$e;->d:Lo/adp$e;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sput-object v0, Lo/adp$e;->a:[Lo/adp$e;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 65
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lo/adp$e;
    .locals 1

    .line 65
    const-class v0, Lo/adp$e;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lo/adp$e;

    return-object v0
.end method

.method public static values()[Lo/adp$e;
    .locals 1

    .line 65
    sget-object v0, Lo/adp$e;->a:[Lo/adp$e;

    invoke-virtual {v0}, [Lo/adp$e;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lo/adp$e;

    return-object v0
.end method
