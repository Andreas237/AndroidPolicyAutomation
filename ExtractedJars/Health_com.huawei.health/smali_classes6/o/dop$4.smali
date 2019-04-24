.class Lo/dop$4;
.super Lo/dot;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dop;-><init>(Landroid/content/Context;Ljava/lang/String;Lo/dnx;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/dop;


# direct methods
.method constructor <init>(Lo/dop;)V
    .locals 0

    .line 88
    iput-object p1, p0, Lo/dop$4;->b:Lo/dop;

    invoke-direct {p0}, Lo/dot;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Landroid/os/Message;)V
    .locals 3

    .line 90
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v2

    .line 91
    if-nez v2, :cond_0

    .line 92
    iget-object v0, p0, Lo/dop$4;->b:Lo/dop;

    invoke-static {v0}, Lo/dop;->b(Lo/dop;)Landroid/content/Context;

    move-result-object v0

    const-string v1, "com.huawei.bone.action.FITNESS_USERINFO_UPDATED"

    invoke-static {v0, v1}, Lo/dol;->c(Landroid/content/Context;Ljava/lang/String;)V

    .line 94
    :cond_0
    return-void
.end method
