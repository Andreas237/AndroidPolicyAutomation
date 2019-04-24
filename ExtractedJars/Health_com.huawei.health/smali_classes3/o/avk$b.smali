.class public final enum Lo/avk$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/avk;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lo/avk$b;>;"
    }
.end annotation


# static fields
.field public static final enum a:Lo/avk$b;

.field public static final enum b:Lo/avk$b;

.field public static final enum c:Lo/avk$b;

.field public static final enum d:Lo/avk$b;

.field public static final enum e:Lo/avk$b;

.field private static final synthetic h:[Lo/avk$b;

.field public static final enum i:Lo/avk$b;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 34
    new-instance v0, Lo/avk$b;

    const-string v1, "FRIEND_LIST"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lo/avk$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/avk$b;->b:Lo/avk$b;

    .line 35
    new-instance v0, Lo/avk$b;

    const-string v1, "USER_NOTIFY"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lo/avk$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/avk$b;->a:Lo/avk$b;

    .line 36
    new-instance v0, Lo/avk$b;

    const-string v1, "GROUP_LIST"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lo/avk$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/avk$b;->e:Lo/avk$b;

    .line 37
    new-instance v0, Lo/avk$b;

    const-string v1, "GROUP_DETAIL"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lo/avk$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/avk$b;->d:Lo/avk$b;

    .line 38
    new-instance v0, Lo/avk$b;

    const-string v1, "NOTIFY_CENTER"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lo/avk$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/avk$b;->c:Lo/avk$b;

    .line 39
    new-instance v0, Lo/avk$b;

    const-string v1, "USER_DETAIL"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lo/avk$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/avk$b;->i:Lo/avk$b;

    .line 32
    const/4 v0, 0x6

    new-array v0, v0, [Lo/avk$b;

    sget-object v1, Lo/avk$b;->b:Lo/avk$b;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lo/avk$b;->a:Lo/avk$b;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lo/avk$b;->e:Lo/avk$b;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lo/avk$b;->d:Lo/avk$b;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Lo/avk$b;->c:Lo/avk$b;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sget-object v1, Lo/avk$b;->i:Lo/avk$b;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    sput-object v0, Lo/avk$b;->h:[Lo/avk$b;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 32
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lo/avk$b;
    .locals 1

    .line 32
    const-class v0, Lo/avk$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lo/avk$b;

    return-object v0
.end method

.method public static values()[Lo/avk$b;
    .locals 1

    .line 32
    sget-object v0, Lo/avk$b;->h:[Lo/avk$b;

    invoke-virtual {v0}, [Lo/avk$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lo/avk$b;

    return-object v0
.end method
