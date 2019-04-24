.class Lo/cqp$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/cqp;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation


# static fields
.field public static final d:Lo/cqp;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 40
    new-instance v0, Lo/cqp;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/cqp;-><init>(Lo/cqp$1;)V

    sput-object v0, Lo/cqp$b;->d:Lo/cqp;

    .line 41
    return-void
.end method
