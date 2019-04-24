.class public final enum Lo/bgh$c;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/bgh;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lo/bgh$c;>;"
    }
.end annotation


# static fields
.field public static final enum a:Lo/bgh$c;

.field public static final enum b:Lo/bgh$c;

.field private static final synthetic d:[Lo/bgh$c;

.field public static final enum e:Lo/bgh$c;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 489
    new-instance v0, Lo/bgh$c;

    const-string v1, "CHAT_LIST"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lo/bgh$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/bgh$c;->b:Lo/bgh$c;

    new-instance v0, Lo/bgh$c;

    const-string v1, "CHAT_EDIT"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lo/bgh$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/bgh$c;->e:Lo/bgh$c;

    new-instance v0, Lo/bgh$c;

    const-string v1, "CHAT_MESSAGE"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lo/bgh$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/bgh$c;->a:Lo/bgh$c;

    .line 487
    const/4 v0, 0x3

    new-array v0, v0, [Lo/bgh$c;

    sget-object v1, Lo/bgh$c;->b:Lo/bgh$c;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lo/bgh$c;->e:Lo/bgh$c;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lo/bgh$c;->a:Lo/bgh$c;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sput-object v0, Lo/bgh$c;->d:[Lo/bgh$c;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 487
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lo/bgh$c;
    .locals 1

    .line 487
    const-class v0, Lo/bgh$c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lo/bgh$c;

    return-object v0
.end method

.method public static values()[Lo/bgh$c;
    .locals 1

    .line 487
    sget-object v0, Lo/bgh$c;->d:[Lo/bgh$c;

    invoke-virtual {v0}, [Lo/bgh$c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lo/bgh$c;

    return-object v0
.end method
