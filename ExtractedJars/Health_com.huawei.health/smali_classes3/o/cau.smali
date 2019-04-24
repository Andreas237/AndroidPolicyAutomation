.class public final enum Lo/cau;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lo/cau;>;"
    }
.end annotation


# static fields
.field private static final synthetic b:[Lo/cau;

.field public static final enum c:Lo/cau;

.field public static final enum d:Lo/cau;

.field public static final enum e:Lo/cau;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 5
    new-instance v0, Lo/cau;

    const-string v1, "NOTIFICATION"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lo/cau;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/cau;->d:Lo/cau;

    new-instance v0, Lo/cau;

    const-string v1, "SMARTCOVER"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lo/cau;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/cau;->c:Lo/cau;

    new-instance v0, Lo/cau;

    const-string v1, "WIDGET"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lo/cau;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/cau;->e:Lo/cau;

    .line 3
    const/4 v0, 0x3

    new-array v0, v0, [Lo/cau;

    sget-object v1, Lo/cau;->d:Lo/cau;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lo/cau;->c:Lo/cau;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lo/cau;->e:Lo/cau;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sput-object v0, Lo/cau;->b:[Lo/cau;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 3
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lo/cau;
    .locals 1

    .line 3
    const-class v0, Lo/cau;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lo/cau;

    return-object v0
.end method

.method public static values()[Lo/cau;
    .locals 1

    .line 3
    sget-object v0, Lo/cau;->b:[Lo/cau;

    invoke-virtual {v0}, [Lo/cau;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lo/cau;

    return-object v0
.end method
