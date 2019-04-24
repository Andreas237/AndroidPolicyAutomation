.class public final enum Lo/xx$c;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/xx;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<Lo/xx$c;>;"
    }
.end annotation


# static fields
.field public static final enum a:Lo/xx$c;

.field public static final enum b:Lo/xx$c;

.field public static final enum c:Lo/xx$c;

.field public static final enum d:Lo/xx$c;

.field public static final enum e:Lo/xx$c;

.field private static final synthetic f:[Lo/xx$c;

.field public static final enum k:Lo/xx$c;


# instance fields
.field private g:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 101
    new-instance v0, Lo/xx$c;

    const-string v1, "POST_MOMENTS"

    const-string v2, "post/moments"

    const/4 v3, 0x0

    invoke-direct {v0, v1, v3, v2}, Lo/xx$c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lo/xx$c;->d:Lo/xx$c;

    new-instance v0, Lo/xx$c;

    const-string v1, "EVENT_LIKE"

    const-string v2, "event/like"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3, v2}, Lo/xx$c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lo/xx$c;->a:Lo/xx$c;

    .line 102
    new-instance v0, Lo/xx$c;

    const-string v1, "EVENT_COMMENT"

    const-string v2, "event/comment"

    const/4 v3, 0x2

    invoke-direct {v0, v1, v3, v2}, Lo/xx$c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lo/xx$c;->c:Lo/xx$c;

    new-instance v0, Lo/xx$c;

    const-string v1, "EVENT_JOIN"

    const-string v2, "event/join"

    const/4 v3, 0x3

    invoke-direct {v0, v1, v3, v2}, Lo/xx$c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lo/xx$c;->b:Lo/xx$c;

    .line 103
    new-instance v0, Lo/xx$c;

    const-string v1, "MOMENT_IMAGE"

    const-string v2, "moment/image"

    const/4 v3, 0x4

    invoke-direct {v0, v1, v3, v2}, Lo/xx$c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lo/xx$c;->e:Lo/xx$c;

    new-instance v0, Lo/xx$c;

    const-string v1, "EVENT_DISLIKE"

    const-string v2, "event/unlike"

    const/4 v3, 0x5

    invoke-direct {v0, v1, v3, v2}, Lo/xx$c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lo/xx$c;->k:Lo/xx$c;

    .line 100
    const/4 v0, 0x6

    new-array v0, v0, [Lo/xx$c;

    sget-object v1, Lo/xx$c;->d:Lo/xx$c;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lo/xx$c;->a:Lo/xx$c;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lo/xx$c;->c:Lo/xx$c;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lo/xx$c;->b:Lo/xx$c;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Lo/xx$c;->e:Lo/xx$c;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sget-object v1, Lo/xx$c;->k:Lo/xx$c;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    sput-object v0, Lo/xx$c;->f:[Lo/xx$c;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;)V"
        }
    .end annotation

    .line 107
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 108
    iput-object p3, p0, Lo/xx$c;->g:Ljava/lang/String;

    .line 109
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lo/xx$c;
    .locals 1

    .line 100
    const-class v0, Lo/xx$c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lo/xx$c;

    return-object v0
.end method

.method public static values()[Lo/xx$c;
    .locals 1

    .line 100
    sget-object v0, Lo/xx$c;->f:[Lo/xx$c;

    invoke-virtual {v0}, [Lo/xx$c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lo/xx$c;

    return-object v0
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    .line 113
    iget-object v0, p0, Lo/xx$c;->g:Ljava/lang/String;

    return-object v0
.end method
