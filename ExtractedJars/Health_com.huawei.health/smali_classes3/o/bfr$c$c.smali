.class public final enum Lo/bfr$c$c;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/bfr$c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lo/bfr$c$c;>;"
    }
.end annotation


# static fields
.field public static final enum a:Lo/bfr$c$c;

.field public static final enum b:Lo/bfr$c$c;

.field private static final synthetic d:[Lo/bfr$c$c;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 130
    new-instance v0, Lo/bfr$c$c;

    const-string v1, "ADD"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lo/bfr$c$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/bfr$c$c;->b:Lo/bfr$c$c;

    new-instance v0, Lo/bfr$c$c;

    const-string v1, "EVIDENCE"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lo/bfr$c$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/bfr$c$c;->a:Lo/bfr$c$c;

    .line 128
    const/4 v0, 0x2

    new-array v0, v0, [Lo/bfr$c$c;

    sget-object v1, Lo/bfr$c$c;->b:Lo/bfr$c$c;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lo/bfr$c$c;->a:Lo/bfr$c$c;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sput-object v0, Lo/bfr$c$c;->d:[Lo/bfr$c$c;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 128
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lo/bfr$c$c;
    .locals 1

    .line 128
    const-class v0, Lo/bfr$c$c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lo/bfr$c$c;

    return-object v0
.end method

.method public static values()[Lo/bfr$c$c;
    .locals 1

    .line 128
    sget-object v0, Lo/bfr$c$c;->d:[Lo/bfr$c$c;

    invoke-virtual {v0}, [Lo/bfr$c$c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lo/bfr$c$c;

    return-object v0
.end method
