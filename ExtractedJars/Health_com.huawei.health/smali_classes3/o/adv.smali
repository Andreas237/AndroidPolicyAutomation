.class public final enum Lo/adv;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lo/adv;>;"
    }
.end annotation


# static fields
.field public static final enum b:Lo/adv;

.field public static final enum c:Lo/adv;

.field private static final synthetic d:[Lo/adv;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 8
    new-instance v0, Lo/adv;

    const-string v1, "WEIGHT_UNIT_KG"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lo/adv;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/adv;->b:Lo/adv;

    .line 9
    new-instance v0, Lo/adv;

    const-string v1, "WEIGHT_UNIT_POWND"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lo/adv;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/adv;->c:Lo/adv;

    .line 7
    const/4 v0, 0x2

    new-array v0, v0, [Lo/adv;

    sget-object v1, Lo/adv;->b:Lo/adv;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lo/adv;->c:Lo/adv;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sput-object v0, Lo/adv;->d:[Lo/adv;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 7
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lo/adv;
    .locals 1

    .line 7
    const-class v0, Lo/adv;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lo/adv;

    return-object v0
.end method

.method public static values()[Lo/adv;
    .locals 1

    .line 7
    sget-object v0, Lo/adv;->d:[Lo/adv;

    invoke-virtual {v0}, [Lo/adv;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lo/adv;

    return-object v0
.end method
