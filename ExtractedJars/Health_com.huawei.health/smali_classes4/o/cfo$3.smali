.class Lo/cfo$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/cfo;->e(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/cfo;

.field final synthetic e:Landroid/os/Bundle;


# direct methods
.method constructor <init>(Lo/cfo;Landroid/os/Bundle;)V
    .locals 0

    .line 93
    iput-object p1, p0, Lo/cfo$3;->b:Lo/cfo;

    iput-object p2, p0, Lo/cfo$3;->e:Landroid/os/Bundle;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 8

    .line 96
    iget-object v0, p0, Lo/cfo$3;->e:Landroid/os/Bundle;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/cfo$3;->b:Lo/cfo;

    invoke-static {v0}, Lo/cfo;->c(Lo/cfo;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 97
    :cond_0
    const-string v0, "Track_HealthSportingNotificationHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updateSportViewFragment bundle null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 98
    return-void

    .line 102
    :cond_1
    iget-object v0, p0, Lo/cfo$3;->e:Landroid/os/Bundle;

    const-string v1, "duration"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 103
    iget-object v0, p0, Lo/cfo$3;->e:Landroid/os/Bundle;

    const-string v1, "distance"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 104
    iget-object v0, p0, Lo/cfo$3;->e:Landroid/os/Bundle;

    const-string v1, "speed"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 105
    iget-object v0, p0, Lo/cfo$3;->e:Landroid/os/Bundle;

    const-string v1, "pace"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 107
    iget-object v0, p0, Lo/cfo$3;->b:Lo/cfo;

    iget-object v1, p0, Lo/cfo$3;->e:Landroid/os/Bundle;

    const-string v2, "sportType"

    invoke-virtual {v1, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v1

    invoke-static {v0, v1}, Lo/cfo;->d(Lo/cfo;I)I

    .line 109
    iget-object v0, p0, Lo/cfo$3;->b:Lo/cfo;

    invoke-static {v0, v5, v4, v6, v7}, Lo/cfo;->e(Lo/cfo;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 111
    return-void
.end method
