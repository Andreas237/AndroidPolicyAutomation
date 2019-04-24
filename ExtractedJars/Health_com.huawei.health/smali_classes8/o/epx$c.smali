.class public final enum Lo/epx$c;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/epx;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lo/epx$c;>;"
    }
.end annotation


# static fields
.field public static final enum a:Lo/epx$c;

.field public static final enum b:Lo/epx$c;

.field public static final enum c:Lo/epx$c;

.field public static final enum e:Lo/epx$c;

.field private static final synthetic i:[Lo/epx$c;


# instance fields
.field private d:I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 23
    new-instance v0, Lo/epx$c;

    const-string v1, "EMPTY_VIEW"

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lo/epx$c;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lo/epx$c;->b:Lo/epx$c;

    .line 24
    new-instance v0, Lo/epx$c;

    const-string v1, "DATA_VIEW"

    const/4 v2, 0x1

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lo/epx$c;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lo/epx$c;->a:Lo/epx$c;

    .line 25
    new-instance v0, Lo/epx$c;

    const-string v1, "BLOOD_DATA_VIEW"

    const/4 v2, 0x2

    const/4 v3, 0x2

    invoke-direct {v0, v1, v2, v3}, Lo/epx$c;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lo/epx$c;->e:Lo/epx$c;

    .line 26
    new-instance v0, Lo/epx$c;

    const-string v1, "CARD_MANAGER_VIEW"

    const/4 v2, 0x3

    const/4 v3, 0x3

    invoke-direct {v0, v1, v2, v3}, Lo/epx$c;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lo/epx$c;->c:Lo/epx$c;

    .line 22
    const/4 v0, 0x4

    new-array v0, v0, [Lo/epx$c;

    sget-object v1, Lo/epx$c;->b:Lo/epx$c;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lo/epx$c;->a:Lo/epx$c;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lo/epx$c;->e:Lo/epx$c;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lo/epx$c;->c:Lo/epx$c;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sput-object v0, Lo/epx$c;->i:[Lo/epx$c;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    .line 30
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 31
    iput p3, p0, Lo/epx$c;->d:I

    .line 32
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lo/epx$c;
    .locals 1

    .line 22
    const-class v0, Lo/epx$c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lo/epx$c;

    return-object v0
.end method

.method public static values()[Lo/epx$c;
    .locals 1

    .line 22
    sget-object v0, Lo/epx$c;->i:[Lo/epx$c;

    invoke-virtual {v0}, [Lo/epx$c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lo/epx$c;

    return-object v0
.end method
