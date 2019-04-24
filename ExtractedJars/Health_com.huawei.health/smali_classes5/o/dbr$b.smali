.class public final enum Lo/dbr$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/dbr;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lo/dbr$b;>;"
    }
.end annotation


# static fields
.field public static final enum a:Lo/dbr$b;

.field private static final synthetic b:[Lo/dbr$b;

.field public static final enum c:Lo/dbr$b;

.field public static final enum d:Lo/dbr$b;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 66
    new-instance v0, Lo/dbr$b;

    const-string v1, "STORAGE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lo/dbr$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/dbr$b;->c:Lo/dbr$b;

    .line 67
    new-instance v0, Lo/dbr$b;

    const-string v1, "LOCATION"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lo/dbr$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/dbr$b;->d:Lo/dbr$b;

    .line 68
    new-instance v0, Lo/dbr$b;

    const-string v1, "STORAGE_LOCATION"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lo/dbr$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/dbr$b;->a:Lo/dbr$b;

    .line 65
    const/4 v0, 0x3

    new-array v0, v0, [Lo/dbr$b;

    sget-object v1, Lo/dbr$b;->c:Lo/dbr$b;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lo/dbr$b;->d:Lo/dbr$b;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lo/dbr$b;->a:Lo/dbr$b;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sput-object v0, Lo/dbr$b;->b:[Lo/dbr$b;

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

.method public static valueOf(Ljava/lang/String;)Lo/dbr$b;
    .locals 1

    .line 65
    const-class v0, Lo/dbr$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lo/dbr$b;

    return-object v0
.end method

.method public static values()[Lo/dbr$b;
    .locals 1

    .line 65
    sget-object v0, Lo/dbr$b;->b:[Lo/dbr$b;

    invoke-virtual {v0}, [Lo/dbr$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lo/dbr$b;

    return-object v0
.end method
