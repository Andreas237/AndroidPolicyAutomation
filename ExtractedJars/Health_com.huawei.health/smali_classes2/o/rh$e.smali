.class final enum Lo/rh$e;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/rh;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4018
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lo/rh$e;>;"
    }
.end annotation


# static fields
.field public static final enum a:Lo/rh$e;

.field public static final enum b:Lo/rh$e;

.field public static final enum c:Lo/rh$e;

.field public static final enum d:Lo/rh$e;

.field public static final enum e:Lo/rh$e;

.field private static final synthetic g:[Lo/rh$e;

.field public static final enum i:Lo/rh$e;

.field public static final enum k:Lo/rh$e;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 40
    new-instance v0, Lo/rh$e;

    const-string v1, "PAD_ENCODE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lo/rh$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/rh$e;->e:Lo/rh$e;

    .line 41
    new-instance v0, Lo/rh$e;

    const-string v1, "ASCII_ENCODE"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lo/rh$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/rh$e;->c:Lo/rh$e;

    .line 42
    new-instance v0, Lo/rh$e;

    const-string v1, "C40_ENCODE"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lo/rh$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/rh$e;->d:Lo/rh$e;

    .line 43
    new-instance v0, Lo/rh$e;

    const-string v1, "TEXT_ENCODE"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lo/rh$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/rh$e;->b:Lo/rh$e;

    .line 44
    new-instance v0, Lo/rh$e;

    const-string v1, "ANSIX12_ENCODE"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lo/rh$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/rh$e;->a:Lo/rh$e;

    .line 45
    new-instance v0, Lo/rh$e;

    const-string v1, "EDIFACT_ENCODE"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lo/rh$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/rh$e;->k:Lo/rh$e;

    .line 46
    new-instance v0, Lo/rh$e;

    const-string v1, "BASE256_ENCODE"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lo/rh$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/rh$e;->i:Lo/rh$e;

    .line 39
    const/4 v0, 0x7

    new-array v0, v0, [Lo/rh$e;

    sget-object v1, Lo/rh$e;->e:Lo/rh$e;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lo/rh$e;->c:Lo/rh$e;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lo/rh$e;->d:Lo/rh$e;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lo/rh$e;->b:Lo/rh$e;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Lo/rh$e;->a:Lo/rh$e;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sget-object v1, Lo/rh$e;->k:Lo/rh$e;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    sget-object v1, Lo/rh$e;->i:Lo/rh$e;

    const/4 v2, 0x6

    aput-object v1, v0, v2

    sput-object v0, Lo/rh$e;->g:[Lo/rh$e;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 39
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lo/rh$e;
    .locals 1

    .line 39
    const-class v0, Lo/rh$e;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lo/rh$e;

    return-object v0
.end method

.method public static values()[Lo/rh$e;
    .locals 1

    .line 39
    sget-object v0, Lo/rh$e;->g:[Lo/rh$e;

    invoke-virtual {v0}, [Lo/rh$e;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lo/rh$e;

    return-object v0
.end method
