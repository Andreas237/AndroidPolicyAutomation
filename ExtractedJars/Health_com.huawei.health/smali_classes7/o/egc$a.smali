.class public final enum Lo/egc$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/egc;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lo/egc$a;>;"
    }
.end annotation


# static fields
.field private static final synthetic b:[Lo/egc$a;

.field public static final enum c:Lo/egc$a;

.field public static final enum d:Lo/egc$a;

.field public static final enum e:Lo/egc$a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 24
    new-instance v0, Lo/egc$a;

    const-string v1, "COPPER"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lo/egc$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/egc$a;->c:Lo/egc$a;

    .line 25
    new-instance v0, Lo/egc$a;

    const-string v1, "SILVER"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lo/egc$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/egc$a;->d:Lo/egc$a;

    .line 26
    new-instance v0, Lo/egc$a;

    const-string v1, "GOLD"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lo/egc$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/egc$a;->e:Lo/egc$a;

    .line 23
    const/4 v0, 0x3

    new-array v0, v0, [Lo/egc$a;

    sget-object v1, Lo/egc$a;->c:Lo/egc$a;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lo/egc$a;->d:Lo/egc$a;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lo/egc$a;->e:Lo/egc$a;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sput-object v0, Lo/egc$a;->b:[Lo/egc$a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 23
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lo/egc$a;
    .locals 1

    .line 23
    const-class v0, Lo/egc$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lo/egc$a;

    return-object v0
.end method

.method public static values()[Lo/egc$a;
    .locals 1

    .line 23
    sget-object v0, Lo/egc$a;->b:[Lo/egc$a;

    invoke-virtual {v0}, [Lo/egc$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lo/egc$a;

    return-object v0
.end method
