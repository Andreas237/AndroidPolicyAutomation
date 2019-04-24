.class public final enum Lo/fmb$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/fmb;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lo/fmb$b;>;"
    }
.end annotation


# static fields
.field public static final enum b:Lo/fmb$b;

.field private static final synthetic d:[Lo/fmb$b;

.field public static final enum e:Lo/fmb$b;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 107
    new-instance v0, Lo/fmb$b;

    const-string v1, "LOCAL"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lo/fmb$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/fmb$b;->e:Lo/fmb$b;

    .line 112
    new-instance v0, Lo/fmb$b;

    const-string v1, "REMOTE"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lo/fmb$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/fmb$b;->b:Lo/fmb$b;

    .line 102
    const/4 v0, 0x2

    new-array v0, v0, [Lo/fmb$b;

    sget-object v1, Lo/fmb$b;->e:Lo/fmb$b;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lo/fmb$b;->b:Lo/fmb$b;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sput-object v0, Lo/fmb$b;->d:[Lo/fmb$b;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 102
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lo/fmb$b;
    .locals 1

    .line 102
    const-class v0, Lo/fmb$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lo/fmb$b;

    return-object v0
.end method

.method public static values()[Lo/fmb$b;
    .locals 1

    .line 102
    sget-object v0, Lo/fmb$b;->d:[Lo/fmb$b;

    invoke-virtual {v0}, [Lo/fmb$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lo/fmb$b;

    return-object v0
.end method
