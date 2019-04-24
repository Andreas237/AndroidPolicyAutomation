.class Lo/dnu$b;
.super Lo/dop;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/dnu;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "b"
.end annotation


# instance fields
.field final synthetic d:Lo/dnu;


# direct methods
.method constructor <init>(Lo/dnu;Landroid/content/Context;)V
    .locals 1

    .line 39
    iput-object p1, p0, Lo/dnu$b;->d:Lo/dnu;

    .line 40
    const-string v0, "AccountDataMgrByNAllowLoginArea"

    invoke-direct {p0, p2, v0, p1}, Lo/dop;-><init>(Landroid/content/Context;Ljava/lang/String;Lo/dnx;)V

    .line 41
    return-void
.end method
