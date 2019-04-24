.class Lo/fkr$d;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/fkr;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "d"
.end annotation


# static fields
.field private static e:Lo/fkr;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lo/fkr;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/fkr;-><init>(Lo/fkr$1;)V

    sput-object v0, Lo/fkr$d;->e:Lo/fkr;

    return-void
.end method

.method static synthetic d()Lo/fkr;
    .locals 1

    sget-object v0, Lo/fkr$d;->e:Lo/fkr;

    return-object v0
.end method
