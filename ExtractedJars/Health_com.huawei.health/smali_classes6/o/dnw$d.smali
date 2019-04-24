.class Lo/dnw$d;
.super Lo/dop;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/dnw;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "d"
.end annotation


# instance fields
.field final synthetic c:Lo/dnw;


# direct methods
.method constructor <init>(Lo/dnw;Landroid/content/Context;)V
    .locals 1

    .line 49
    iput-object p1, p0, Lo/dnw$d;->c:Lo/dnw;

    .line 50
    const-string v0, "AccountDataExtMgr"

    invoke-direct {p0, p2, v0, p1}, Lo/dop;-><init>(Landroid/content/Context;Ljava/lang/String;Lo/dnx;)V

    .line 51
    return-void
.end method
