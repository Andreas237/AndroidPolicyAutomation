.class Lo/cqg$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/cqg;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "d"
.end annotation


# static fields
.field public static final a:Lo/cqg;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 46
    new-instance v0, Lo/cqg;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/cqg;-><init>(Lo/cqg$1;)V

    sput-object v0, Lo/cqg$d;->a:Lo/cqg;

    .line 47
    return-void
.end method
