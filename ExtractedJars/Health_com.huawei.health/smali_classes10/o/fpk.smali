.class public Lo/fpk;
.super Lo/fpb;
.source "SourceFile"


# static fields
.field private static final b:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 23
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "CONNECTION_ID"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sput-object v0, Lo/fpk;->b:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 26
    const-string v0, "tcp context"

    sget-object v1, Lo/fpk;->b:[Ljava/lang/String;

    invoke-direct {p0, v0, v1}, Lo/fpb;-><init>(Ljava/lang/String;[Ljava/lang/String;)V

    .line 27
    return-void
.end method
