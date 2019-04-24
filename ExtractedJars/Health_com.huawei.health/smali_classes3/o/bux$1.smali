.class Lo/bux$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bux;->d(Lo/bwa;Landroid/os/Message;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/bux;

.field final synthetic d:Lo/bwa;


# direct methods
.method constructor <init>(Lo/bux;Lo/bwa;)V
    .locals 0

    .line 71
    iput-object p1, p0, Lo/bux$1;->c:Lo/bux;

    iput-object p2, p0, Lo/bux$1;->d:Lo/bwa;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 74
    iget-object v0, p0, Lo/bux$1;->d:Lo/bwa;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lo/bwa;->a(IZ)V

    .line 75
    const-string v0, "CoachHandler"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "postDelayed"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 76
    return-void
.end method
