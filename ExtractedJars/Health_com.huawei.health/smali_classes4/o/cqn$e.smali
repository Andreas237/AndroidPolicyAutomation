.class Lo/cqn$e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/cqn;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "e"
.end annotation


# static fields
.field public static final d:Lo/cqn;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 48
    new-instance v0, Lo/cqn;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/cqn;-><init>(Lo/cqn$1;)V

    sput-object v0, Lo/cqn$e;->d:Lo/cqn;

    .line 49
    return-void
.end method
