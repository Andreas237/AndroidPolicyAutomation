.class Lo/csk$4;
.super Ljava/util/TimerTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/csk;->G()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/csk;


# direct methods
.method constructor <init>(Lo/csk;)V
    .locals 0

    .line 1020
    iput-object p1, p0, Lo/csk$4;->b:Lo/csk;

    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 1023
    const-string v0, "HiH_HiSyncControl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startTimer start autoSync"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1024
    iget-object v0, p0, Lo/csk$4;->b:Lo/csk;

    invoke-static {}, Lo/csk;->u()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x4e20

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v2, v3}, Lo/csk;->c(Ljava/lang/String;II)V

    .line 1025
    iget-object v0, p0, Lo/csk$4;->b:Lo/csk;

    invoke-static {v0}, Lo/csk;->c(Lo/csk;)V

    .line 1026
    return-void
.end method
