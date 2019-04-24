.class public final enum Lo/ehe$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/ehe;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lo/ehe$b;>;"
    }
.end annotation


# static fields
.field public static final enum a:Lo/ehe$b;

.field public static final enum b:Lo/ehe$b;

.field public static final enum c:Lo/ehe$b;

.field public static final enum d:Lo/ehe$b;

.field private static final synthetic e:[Lo/ehe$b;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 130
    new-instance v0, Lo/ehe$b;

    const-string v1, "MODE_FIRST_AXIS"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lo/ehe$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/ehe$b;->c:Lo/ehe$b;

    new-instance v0, Lo/ehe$b;

    const-string v1, "MODE_SECOND_AXIS"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lo/ehe$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/ehe$b;->d:Lo/ehe$b;

    new-instance v0, Lo/ehe$b;

    const-string v1, "MODE_THIRD_PARTY_AXIS"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lo/ehe$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/ehe$b;->a:Lo/ehe$b;

    new-instance v0, Lo/ehe$b;

    const-string v1, "MODE_NONE"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lo/ehe$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/ehe$b;->b:Lo/ehe$b;

    .line 129
    const/4 v0, 0x4

    new-array v0, v0, [Lo/ehe$b;

    sget-object v1, Lo/ehe$b;->c:Lo/ehe$b;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lo/ehe$b;->d:Lo/ehe$b;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lo/ehe$b;->a:Lo/ehe$b;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lo/ehe$b;->b:Lo/ehe$b;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sput-object v0, Lo/ehe$b;->e:[Lo/ehe$b;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 129
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lo/ehe$b;
    .locals 1

    .line 129
    const-class v0, Lo/ehe$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lo/ehe$b;

    return-object v0
.end method

.method public static values()[Lo/ehe$b;
    .locals 1

    .line 129
    sget-object v0, Lo/ehe$b;->e:[Lo/ehe$b;

    invoke-virtual {v0}, [Lo/ehe$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lo/ehe$b;

    return-object v0
.end method
