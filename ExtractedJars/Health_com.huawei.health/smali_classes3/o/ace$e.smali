.class public final enum Lo/ace$e;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/ace;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lo/ace$e;>;"
    }
.end annotation


# static fields
.field public static final enum a:Lo/ace$e;

.field public static final enum b:Lo/ace$e;

.field public static final enum c:Lo/ace$e;

.field private static final synthetic d:[Lo/ace$e;

.field public static final enum e:Lo/ace$e;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 17
    new-instance v0, Lo/ace$e;

    const-string v1, "STRICT"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lo/ace$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/ace$e;->e:Lo/ace$e;

    new-instance v0, Lo/ace$e;

    const-string v1, "INCLUSIVE"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lo/ace$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/ace$e;->a:Lo/ace$e;

    new-instance v0, Lo/ace$e;

    const-string v1, "FRONT"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lo/ace$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/ace$e;->b:Lo/ace$e;

    new-instance v0, Lo/ace$e;

    const-string v1, "REAR"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lo/ace$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/ace$e;->c:Lo/ace$e;

    const/4 v0, 0x4

    new-array v0, v0, [Lo/ace$e;

    sget-object v1, Lo/ace$e;->e:Lo/ace$e;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lo/ace$e;->a:Lo/ace$e;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lo/ace$e;->b:Lo/ace$e;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lo/ace$e;->c:Lo/ace$e;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sput-object v0, Lo/ace$e;->d:[Lo/ace$e;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 17
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lo/ace$e;
    .locals 1

    .line 17
    const-class v0, Lo/ace$e;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lo/ace$e;

    return-object v0
.end method

.method public static values()[Lo/ace$e;
    .locals 1

    .line 17
    sget-object v0, Lo/ace$e;->d:[Lo/ace$e;

    invoke-virtual {v0}, [Lo/ace$e;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lo/ace$e;

    return-object v0
.end method
