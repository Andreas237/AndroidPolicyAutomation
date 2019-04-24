.class public final enum Lo/aiz$c;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/aiz;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lo/aiz$c;>;"
    }
.end annotation


# static fields
.field public static final enum a:Lo/aiz$c;

.field public static final enum c:Lo/aiz$c;

.field private static final synthetic d:[Lo/aiz$c;

.field public static final enum e:Lo/aiz$c;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 36
    new-instance v0, Lo/aiz$c;

    const-string v1, "JSON_TYPE_OBJECT"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lo/aiz$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/aiz$c;->c:Lo/aiz$c;

    .line 40
    new-instance v0, Lo/aiz$c;

    const-string v1, "JSON_TYPE_ARRAY"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lo/aiz$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/aiz$c;->a:Lo/aiz$c;

    .line 44
    new-instance v0, Lo/aiz$c;

    const-string v1, "JSON_TYPE_ERROR"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lo/aiz$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo/aiz$c;->e:Lo/aiz$c;

    .line 32
    const/4 v0, 0x3

    new-array v0, v0, [Lo/aiz$c;

    sget-object v1, Lo/aiz$c;->c:Lo/aiz$c;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lo/aiz$c;->a:Lo/aiz$c;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lo/aiz$c;->e:Lo/aiz$c;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sput-object v0, Lo/aiz$c;->d:[Lo/aiz$c;

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

.method public static valueOf(Ljava/lang/String;)Lo/aiz$c;
    .locals 1

    .line 32
    const-class v0, Lo/aiz$c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lo/aiz$c;

    return-object v0
.end method

.method public static values()[Lo/aiz$c;
    .locals 1

    .line 32
    sget-object v0, Lo/aiz$c;->d:[Lo/aiz$c;

    invoke-virtual {v0}, [Lo/aiz$c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lo/aiz$c;

    return-object v0
.end method
