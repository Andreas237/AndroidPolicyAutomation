.class public final enum Lo/fmi$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/fmi;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lo/fmi$a;>;"
    }
.end annotation


# static fields
.field public static final enum a:Lo/fmi$a;

.field public static final enum b:Lo/fmi$a;

.field private static final synthetic c:[Lo/fmi$a;

.field public static final enum e:Lo/fmi$a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 41
    new-instance v0, Lo/fmi$a;

    const-string v1, "NULL"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lo/fmi$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/fmi$a;->a:Lo/fmi$a;

    new-instance v0, Lo/fmi$a;

    const-string v1, "GROUPED"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lo/fmi$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/fmi$a;->e:Lo/fmi$a;

    new-instance v0, Lo/fmi$a;

    const-string v1, "MAPBASED"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lo/fmi$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/fmi$a;->b:Lo/fmi$a;

    .line 40
    const/4 v0, 0x3

    new-array v0, v0, [Lo/fmi$a;

    sget-object v1, Lo/fmi$a;->a:Lo/fmi$a;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lo/fmi$a;->e:Lo/fmi$a;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lo/fmi$a;->b:Lo/fmi$a;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sput-object v0, Lo/fmi$a;->c:[Lo/fmi$a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 40
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lo/fmi$a;
    .locals 1

    .line 40
    const-class v0, Lo/fmi$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lo/fmi$a;

    return-object v0
.end method

.method public static values()[Lo/fmi$a;
    .locals 1

    .line 40
    sget-object v0, Lo/fmi$a;->c:[Lo/fmi$a;

    invoke-virtual {v0}, [Lo/fmi$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lo/fmi$a;

    return-object v0
.end method
