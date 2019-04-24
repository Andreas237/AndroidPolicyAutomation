.class Lo/cqe$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/cqe;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "d"
.end annotation


# static fields
.field public static final e:Lo/cqe;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 44
    new-instance v0, Lo/cqe;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/cqe;-><init>(Lo/cqe$2;)V

    sput-object v0, Lo/cqe$d;->e:Lo/cqe;

    .line 45
    return-void
.end method
