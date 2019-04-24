.class public final enum Lo/flu$e;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/flu;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lo/flu$e;>;"
    }
.end annotation


# static fields
.field public static final enum a:Lo/flu$e;

.field public static final enum b:Lo/flu$e;

.field public static final enum c:Lo/flu$e;

.field private static final synthetic d:[Lo/flu$e;

.field public static final enum e:Lo/flu$e;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 101
    new-instance v0, Lo/flu$e;

    const-string v1, "INTEGER"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lo/flu$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/flu$e;->a:Lo/flu$e;

    new-instance v0, Lo/flu$e;

    const-string v1, "STRING"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lo/flu$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/flu$e;->c:Lo/flu$e;

    new-instance v0, Lo/flu$e;

    const-string v1, "OPAQUE"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lo/flu$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/flu$e;->b:Lo/flu$e;

    new-instance v0, Lo/flu$e;

    const-string v1, "UNKNOWN"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lo/flu$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/flu$e;->e:Lo/flu$e;

    .line 100
    const/4 v0, 0x4

    new-array v0, v0, [Lo/flu$e;

    sget-object v1, Lo/flu$e;->a:Lo/flu$e;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lo/flu$e;->c:Lo/flu$e;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lo/flu$e;->b:Lo/flu$e;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lo/flu$e;->e:Lo/flu$e;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sput-object v0, Lo/flu$e;->d:[Lo/flu$e;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 100
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lo/flu$e;
    .locals 1

    .line 100
    const-class v0, Lo/flu$e;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lo/flu$e;

    return-object v0
.end method

.method public static values()[Lo/flu$e;
    .locals 1

    .line 100
    sget-object v0, Lo/flu$e;->d:[Lo/flu$e;

    invoke-virtual {v0}, [Lo/flu$e;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lo/flu$e;

    return-object v0
.end method
