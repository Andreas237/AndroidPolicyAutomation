.class public final enum Lo/cfe$e;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/cfe;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lo/cfe$e;>;"
    }
.end annotation


# static fields
.field public static final enum a:Lo/cfe$e;

.field public static final enum b:Lo/cfe$e;

.field public static final enum c:Lo/cfe$e;

.field public static final enum d:Lo/cfe$e;

.field private static final synthetic e:[Lo/cfe$e;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 110
    new-instance v0, Lo/cfe$e;

    const-string v1, "MODE_FIRST_AXIS"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lo/cfe$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/cfe$e;->c:Lo/cfe$e;

    new-instance v0, Lo/cfe$e;

    const-string v1, "MODE_SECOND_AXIS"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lo/cfe$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/cfe$e;->d:Lo/cfe$e;

    new-instance v0, Lo/cfe$e;

    const-string v1, "MODE_THIRD_PARTY_AXIS"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lo/cfe$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/cfe$e;->a:Lo/cfe$e;

    new-instance v0, Lo/cfe$e;

    const-string v1, "MODE_NONE"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lo/cfe$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/cfe$e;->b:Lo/cfe$e;

    .line 109
    const/4 v0, 0x4

    new-array v0, v0, [Lo/cfe$e;

    sget-object v1, Lo/cfe$e;->c:Lo/cfe$e;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lo/cfe$e;->d:Lo/cfe$e;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lo/cfe$e;->a:Lo/cfe$e;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lo/cfe$e;->b:Lo/cfe$e;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sput-object v0, Lo/cfe$e;->e:[Lo/cfe$e;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 109
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lo/cfe$e;
    .locals 1

    .line 109
    const-class v0, Lo/cfe$e;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lo/cfe$e;

    return-object v0
.end method

.method public static values()[Lo/cfe$e;
    .locals 1

    .line 109
    sget-object v0, Lo/cfe$e;->e:[Lo/cfe$e;

    invoke-virtual {v0}, [Lo/cfe$e;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lo/cfe$e;

    return-object v0
.end method
