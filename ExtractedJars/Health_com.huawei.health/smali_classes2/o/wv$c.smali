.class public final enum Lo/wv$c;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/wv;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lo/wv$c;>;"
    }
.end annotation


# static fields
.field public static final enum a:Lo/wv$c;

.field public static final enum b:Lo/wv$c;

.field public static final enum c:Lo/wv$c;

.field public static final enum d:Lo/wv$c;

.field public static final enum e:Lo/wv$c;

.field public static final enum f:Lo/wv$c;

.field public static final enum h:Lo/wv$c;

.field private static final synthetic k:[Lo/wv$c;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 26
    new-instance v0, Lo/wv$c;

    const-string v1, "STATE_INIT"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lo/wv$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/wv$c;->b:Lo/wv$c;

    .line 27
    new-instance v0, Lo/wv$c;

    const-string v1, "STATE_WAITING_FOR_SYNC_TO_FINISH"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lo/wv$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/wv$c;->c:Lo/wv$c;

    .line 28
    new-instance v0, Lo/wv$c;

    const-string v1, "STATE_REFRESHED"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lo/wv$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/wv$c;->a:Lo/wv$c;

    .line 29
    new-instance v0, Lo/wv$c;

    const-string v1, "STATE_WAITING_FOR_REFRESH_TO_FINISH"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lo/wv$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/wv$c;->d:Lo/wv$c;

    .line 30
    new-instance v0, Lo/wv$c;

    const-string v1, "STATE_SYNCED"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lo/wv$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/wv$c;->e:Lo/wv$c;

    .line 31
    new-instance v0, Lo/wv$c;

    const-string v1, "STATE_COMPLETED"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lo/wv$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/wv$c;->f:Lo/wv$c;

    .line 32
    new-instance v0, Lo/wv$c;

    const-string v1, "STATE_INVALID"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lo/wv$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/wv$c;->h:Lo/wv$c;

    .line 25
    const/4 v0, 0x7

    new-array v0, v0, [Lo/wv$c;

    sget-object v1, Lo/wv$c;->b:Lo/wv$c;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lo/wv$c;->c:Lo/wv$c;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lo/wv$c;->a:Lo/wv$c;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lo/wv$c;->d:Lo/wv$c;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Lo/wv$c;->e:Lo/wv$c;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sget-object v1, Lo/wv$c;->f:Lo/wv$c;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    sget-object v1, Lo/wv$c;->h:Lo/wv$c;

    const/4 v2, 0x6

    aput-object v1, v0, v2

    sput-object v0, Lo/wv$c;->k:[Lo/wv$c;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 25
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lo/wv$c;
    .locals 1

    .line 25
    const-class v0, Lo/wv$c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lo/wv$c;

    return-object v0
.end method

.method public static values()[Lo/wv$c;
    .locals 1

    .line 25
    sget-object v0, Lo/wv$c;->k:[Lo/wv$c;

    invoke-virtual {v0}, [Lo/wv$c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lo/wv$c;

    return-object v0
.end method
