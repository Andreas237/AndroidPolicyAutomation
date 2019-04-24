.class public final enum Lo/ewf$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/ewf;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lo/ewf$b;>;"
    }
.end annotation


# static fields
.field public static final enum a:Lo/ewf$b;

.field public static final enum b:Lo/ewf$b;

.field public static final enum c:Lo/ewf$b;

.field private static final synthetic e:[Lo/ewf$b;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 710
    new-instance v0, Lo/ewf$b;

    const-string v1, "SPORT"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lo/ewf$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/ewf$b;->b:Lo/ewf$b;

    new-instance v0, Lo/ewf$b;

    const-string v1, "REST"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lo/ewf$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/ewf$b;->a:Lo/ewf$b;

    new-instance v0, Lo/ewf$b;

    const-string v1, "WARNING"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lo/ewf$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/ewf$b;->c:Lo/ewf$b;

    .line 709
    const/4 v0, 0x3

    new-array v0, v0, [Lo/ewf$b;

    sget-object v1, Lo/ewf$b;->b:Lo/ewf$b;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lo/ewf$b;->a:Lo/ewf$b;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lo/ewf$b;->c:Lo/ewf$b;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sput-object v0, Lo/ewf$b;->e:[Lo/ewf$b;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 709
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lo/ewf$b;
    .locals 1

    .line 709
    const-class v0, Lo/ewf$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lo/ewf$b;

    return-object v0
.end method

.method public static values()[Lo/ewf$b;
    .locals 1

    .line 709
    sget-object v0, Lo/ewf$b;->e:[Lo/ewf$b;

    invoke-virtual {v0}, [Lo/ewf$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lo/ewf$b;

    return-object v0
.end method
