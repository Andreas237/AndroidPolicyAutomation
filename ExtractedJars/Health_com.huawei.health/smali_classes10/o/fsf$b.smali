.class public final enum Lo/fsf$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/fsf;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lo/fsf$b;>;"
    }
.end annotation


# static fields
.field public static final enum a:Lo/fsf$b;

.field public static final enum b:Lo/fsf$b;

.field private static final synthetic c:[Lo/fsf$b;

.field public static final enum d:Lo/fsf$b;

.field public static final enum e:Lo/fsf$b;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 530
    new-instance v0, Lo/fsf$b;

    const-string v1, "NULL"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lo/fsf$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/fsf$b;->b:Lo/fsf$b;

    new-instance v0, Lo/fsf$b;

    const-string v1, "STREAM"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lo/fsf$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/fsf$b;->a:Lo/fsf$b;

    new-instance v0, Lo/fsf$b;

    const-string v1, "BLOCK"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lo/fsf$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/fsf$b;->e:Lo/fsf$b;

    new-instance v0, Lo/fsf$b;

    const-string v1, "AEAD"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lo/fsf$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/fsf$b;->d:Lo/fsf$b;

    .line 529
    const/4 v0, 0x4

    new-array v0, v0, [Lo/fsf$b;

    sget-object v1, Lo/fsf$b;->b:Lo/fsf$b;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lo/fsf$b;->a:Lo/fsf$b;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lo/fsf$b;->e:Lo/fsf$b;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lo/fsf$b;->d:Lo/fsf$b;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sput-object v0, Lo/fsf$b;->c:[Lo/fsf$b;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 529
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lo/fsf$b;
    .locals 1

    .line 529
    const-class v0, Lo/fsf$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lo/fsf$b;

    return-object v0
.end method

.method public static values()[Lo/fsf$b;
    .locals 1

    .line 529
    sget-object v0, Lo/fsf$b;->c:[Lo/fsf$b;

    invoke-virtual {v0}, [Lo/fsf$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lo/fsf$b;

    return-object v0
.end method
