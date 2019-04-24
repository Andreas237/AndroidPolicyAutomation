.class final enum Lo/fsf$e;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/fsf;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4018
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lo/fsf$e;>;"
    }
.end annotation


# static fields
.field private static final synthetic c:[Lo/fsf$e;

.field public static final enum e:Lo/fsf$e;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 522
    new-instance v0, Lo/fsf$e;

    const-string v1, "TLS_PRF_SHA256"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lo/fsf$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/fsf$e;->e:Lo/fsf$e;

    .line 521
    const/4 v0, 0x1

    new-array v0, v0, [Lo/fsf$e;

    sget-object v1, Lo/fsf$e;->e:Lo/fsf$e;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sput-object v0, Lo/fsf$e;->c:[Lo/fsf$e;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 521
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lo/fsf$e;
    .locals 1

    .line 521
    const-class v0, Lo/fsf$e;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lo/fsf$e;

    return-object v0
.end method

.method public static values()[Lo/fsf$e;
    .locals 1

    .line 521
    sget-object v0, Lo/fsf$e;->c:[Lo/fsf$e;

    invoke-virtual {v0}, [Lo/fsf$e;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lo/fsf$e;

    return-object v0
.end method
