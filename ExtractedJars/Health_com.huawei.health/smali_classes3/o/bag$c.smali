.class public final enum Lo/bag$c;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/bag;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lo/bag$c;>;"
    }
.end annotation


# static fields
.field public static final enum a:Lo/bag$c;

.field private static final synthetic b:[Lo/bag$c;

.field public static final enum d:Lo/bag$c;

.field public static final enum e:Lo/bag$c;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 15
    new-instance v0, Lo/bag$c;

    const-string v1, "init"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lo/bag$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/bag$c;->d:Lo/bag$c;

    new-instance v0, Lo/bag$c;

    const-string v1, "OffMsgReq"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lo/bag$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/bag$c;->a:Lo/bag$c;

    new-instance v0, Lo/bag$c;

    const-string v1, "SyncMsg"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lo/bag$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/bag$c;->e:Lo/bag$c;

    .line 13
    const/4 v0, 0x3

    new-array v0, v0, [Lo/bag$c;

    sget-object v1, Lo/bag$c;->d:Lo/bag$c;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lo/bag$c;->a:Lo/bag$c;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lo/bag$c;->e:Lo/bag$c;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sput-object v0, Lo/bag$c;->b:[Lo/bag$c;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 13
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lo/bag$c;
    .locals 1

    .line 13
    const-class v0, Lo/bag$c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lo/bag$c;

    return-object v0
.end method

.method public static values()[Lo/bag$c;
    .locals 1

    .line 13
    sget-object v0, Lo/bag$c;->b:[Lo/bag$c;

    invoke-virtual {v0}, [Lo/bag$c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lo/bag$c;

    return-object v0
.end method
