.class public final enum Lo/alk$c;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/alk;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lo/alk$c;>;"
    }
.end annotation


# static fields
.field private static final synthetic a:[Lo/alk$c;

.field public static final enum b:Lo/alk$c;

.field public static final enum c:Lo/alk$c;

.field public static final enum d:Lo/alk$c;

.field public static final enum e:Lo/alk$c;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 21
    new-instance v0, Lo/alk$c;

    const-string v1, "NOT_SUPPORT"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lo/alk$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/alk$c;->e:Lo/alk$c;

    .line 22
    new-instance v0, Lo/alk$c;

    const-string v1, "NO_DEVICE"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lo/alk$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/alk$c;->b:Lo/alk$c;

    .line 23
    new-instance v0, Lo/alk$c;

    const-string v1, "USER_CANCELED"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lo/alk$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/alk$c;->c:Lo/alk$c;

    .line 24
    new-instance v0, Lo/alk$c;

    const-string v1, "DEVICE_ERROR"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lo/alk$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/alk$c;->d:Lo/alk$c;

    .line 20
    const/4 v0, 0x4

    new-array v0, v0, [Lo/alk$c;

    sget-object v1, Lo/alk$c;->e:Lo/alk$c;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lo/alk$c;->b:Lo/alk$c;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lo/alk$c;->c:Lo/alk$c;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lo/alk$c;->d:Lo/alk$c;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sput-object v0, Lo/alk$c;->a:[Lo/alk$c;

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

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lo/alk$c;
    .locals 1

    .line 20
    const-class v0, Lo/alk$c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lo/alk$c;

    return-object v0
.end method

.method public static values()[Lo/alk$c;
    .locals 1

    .line 20
    sget-object v0, Lo/alk$c;->a:[Lo/alk$c;

    invoke-virtual {v0}, [Lo/alk$c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lo/alk$c;

    return-object v0
.end method
