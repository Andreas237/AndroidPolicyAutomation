.class Lo/ctb$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/ctb;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "d"
.end annotation


# static fields
.field public static final c:Lo/ctb;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 42
    new-instance v0, Lo/ctb;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/ctb;-><init>(Lo/ctb$1;)V

    sput-object v0, Lo/ctb$d;->c:Lo/ctb;

    .line 43
    return-void
.end method
