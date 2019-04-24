.class Lo/dqq$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/dqq;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "d"
.end annotation


# static fields
.field private static final b:Lo/dqq;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 21
    new-instance v0, Lo/dqq;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/dqq;-><init>(Lo/dqq$3;)V

    sput-object v0, Lo/dqq$d;->b:Lo/dqq;

    return-void
.end method

.method static synthetic d()Lo/dqq;
    .locals 1

    .line 20
    sget-object v0, Lo/dqq$d;->b:Lo/dqq;

    return-object v0
.end method
