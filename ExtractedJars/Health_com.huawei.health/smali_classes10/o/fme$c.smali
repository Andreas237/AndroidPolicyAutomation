.class public final enum Lo/fme$c;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/fme;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lo/fme$c;>;"
    }
.end annotation


# static fields
.field public static final enum a:Lo/fme$c;

.field public static final enum c:Lo/fme$c;

.field public static final enum d:Lo/fme$c;

.field private static final synthetic e:[Lo/fme$c;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 43
    new-instance v0, Lo/fme$c;

    const-string v1, "STRICT"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lo/fme$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/fme$c;->a:Lo/fme$c;

    new-instance v0, Lo/fme$c;

    const-string v1, "RELAXED"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lo/fme$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/fme$c;->c:Lo/fme$c;

    new-instance v0, Lo/fme$c;

    const-string v1, "PRINCIPAL"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lo/fme$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/fme$c;->d:Lo/fme$c;

    .line 42
    const/4 v0, 0x3

    new-array v0, v0, [Lo/fme$c;

    sget-object v1, Lo/fme$c;->a:Lo/fme$c;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lo/fme$c;->c:Lo/fme$c;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lo/fme$c;->d:Lo/fme$c;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sput-object v0, Lo/fme$c;->e:[Lo/fme$c;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 42
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lo/fme$c;
    .locals 1

    .line 42
    const-class v0, Lo/fme$c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lo/fme$c;

    return-object v0
.end method

.method public static values()[Lo/fme$c;
    .locals 1

    .line 42
    sget-object v0, Lo/fme$c;->e:[Lo/fme$c;

    invoke-virtual {v0}, [Lo/fme$c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lo/fme$c;

    return-object v0
.end method
