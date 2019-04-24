.class public final enum Lo/aei$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/aei;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lo/aei$a;>;"
    }
.end annotation


# static fields
.field public static final enum a:Lo/aei$a;

.field public static final enum c:Lo/aei$a;

.field public static final enum d:Lo/aei$a;

.field private static final synthetic e:[Lo/aei$a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 10
    new-instance v0, Lo/aei$a;

    const-string v1, "MeasureResultData"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lo/aei$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/aei$a;->c:Lo/aei$a;

    new-instance v0, Lo/aei$a;

    const-string v1, "DeviceInfoData"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lo/aei$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/aei$a;->d:Lo/aei$a;

    new-instance v0, Lo/aei$a;

    const-string v1, "BatterInfoData"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lo/aei$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/aei$a;->a:Lo/aei$a;

    .line 9
    const/4 v0, 0x3

    new-array v0, v0, [Lo/aei$a;

    sget-object v1, Lo/aei$a;->c:Lo/aei$a;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lo/aei$a;->d:Lo/aei$a;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lo/aei$a;->a:Lo/aei$a;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sput-object v0, Lo/aei$a;->e:[Lo/aei$a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 9
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lo/aei$a;
    .locals 1

    .line 9
    const-class v0, Lo/aei$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lo/aei$a;

    return-object v0
.end method

.method public static values()[Lo/aei$a;
    .locals 1

    .line 9
    sget-object v0, Lo/aei$a;->e:[Lo/aei$a;

    invoke-virtual {v0}, [Lo/aei$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lo/aei$a;

    return-object v0
.end method
