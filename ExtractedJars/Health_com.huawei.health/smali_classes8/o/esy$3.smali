.class Lo/esy$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/esy;->b()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/esy;


# direct methods
.method constructor <init>(Lo/esy;)V
    .locals 0

    .line 76
    iput-object p1, p0, Lo/esy$3;->a:Lo/esy;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 79
    const-string v0, "UIHLH_NotificationInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startMessageNotificationObserver doRefresh()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 80
    iget-object v0, p0, Lo/esy$3;->a:Lo/esy;

    invoke-static {v0}, Lo/esy;->a(Lo/esy;)Lo/eaa;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 81
    iget-object v0, p0, Lo/esy$3;->a:Lo/esy;

    invoke-static {v0}, Lo/esy;->a(Lo/esy;)Lo/eaa;

    move-result-object v0

    invoke-virtual {v0}, Lo/eaa;->k()V

    .line 83
    :cond_0
    return-void
.end method
