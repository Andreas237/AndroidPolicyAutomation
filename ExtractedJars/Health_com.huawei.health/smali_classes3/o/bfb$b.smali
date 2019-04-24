.class public final enum Lo/bfb$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/bfb;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lo/bfb$b;>;"
    }
.end annotation


# static fields
.field public static final enum a:Lo/bfb$b;

.field private static final synthetic c:[Lo/bfb$b;

.field public static final enum d:Lo/bfb$b;

.field public static final enum e:Lo/bfb$b;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 91
    new-instance v0, Lo/bfb$b;

    const-string v1, "MORE_TYPE_GALLERY"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lo/bfb$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/bfb$b;->d:Lo/bfb$b;

    .line 92
    new-instance v0, Lo/bfb$b;

    const-string v1, "MORE_TYPE_CAPTURE"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lo/bfb$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/bfb$b;->e:Lo/bfb$b;

    .line 93
    new-instance v0, Lo/bfb$b;

    const-string v1, "MORE_TYPE_CARD"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lo/bfb$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/bfb$b;->a:Lo/bfb$b;

    .line 89
    const/4 v0, 0x3

    new-array v0, v0, [Lo/bfb$b;

    sget-object v1, Lo/bfb$b;->d:Lo/bfb$b;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lo/bfb$b;->e:Lo/bfb$b;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lo/bfb$b;->a:Lo/bfb$b;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sput-object v0, Lo/bfb$b;->c:[Lo/bfb$b;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 89
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lo/bfb$b;
    .locals 1

    .line 89
    const-class v0, Lo/bfb$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lo/bfb$b;

    return-object v0
.end method

.method public static values()[Lo/bfb$b;
    .locals 1

    .line 89
    sget-object v0, Lo/bfb$b;->c:[Lo/bfb$b;

    invoke-virtual {v0}, [Lo/bfb$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lo/bfb$b;

    return-object v0
.end method
