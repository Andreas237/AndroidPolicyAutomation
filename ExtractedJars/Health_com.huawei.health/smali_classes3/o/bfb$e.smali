.class public final enum Lo/bfb$e;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/bfb;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lo/bfb$e;>;"
    }
.end annotation


# static fields
.field public static final enum a:Lo/bfb$e;

.field public static final enum b:Lo/bfb$e;

.field public static final enum c:Lo/bfb$e;

.field private static final synthetic d:[Lo/bfb$e;

.field public static final enum e:Lo/bfb$e;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 80
    new-instance v0, Lo/bfb$e;

    const-string v1, "ALL_GONE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lo/bfb$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/bfb$e;->e:Lo/bfb$e;

    .line 81
    new-instance v0, Lo/bfb$e;

    const-string v1, "INPUT_ONLY"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lo/bfb$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/bfb$e;->a:Lo/bfb$e;

    .line 82
    new-instance v0, Lo/bfb$e;

    const-string v1, "INPUT_WITH_CHANGE"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lo/bfb$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/bfb$e;->c:Lo/bfb$e;

    .line 83
    new-instance v0, Lo/bfb$e;

    const-string v1, "MENU_WITH_CHANGE"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lo/bfb$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/bfb$e;->b:Lo/bfb$e;

    .line 78
    const/4 v0, 0x4

    new-array v0, v0, [Lo/bfb$e;

    sget-object v1, Lo/bfb$e;->e:Lo/bfb$e;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lo/bfb$e;->a:Lo/bfb$e;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lo/bfb$e;->c:Lo/bfb$e;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lo/bfb$e;->b:Lo/bfb$e;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sput-object v0, Lo/bfb$e;->d:[Lo/bfb$e;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 78
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lo/bfb$e;
    .locals 1

    .line 78
    const-class v0, Lo/bfb$e;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lo/bfb$e;

    return-object v0
.end method

.method public static values()[Lo/bfb$e;
    .locals 1

    .line 78
    sget-object v0, Lo/bfb$e;->d:[Lo/bfb$e;

    invoke-virtual {v0}, [Lo/bfb$e;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lo/bfb$e;

    return-object v0
.end method
