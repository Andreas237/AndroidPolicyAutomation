.class Lo/cfo$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/cfo;->c()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lo/cfo;


# direct methods
.method constructor <init>(Lo/cfo;)V
    .locals 0

    .line 260
    iput-object p1, p0, Lo/cfo$5;->e:Lo/cfo;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 263
    const-string v0, "Track_HealthSportingNotificationHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "deleteHealthNotification() "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 264
    iget-object v0, p0, Lo/cfo$5;->e:Lo/cfo;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/cfo;->a(Lo/cfo;Z)Z

    .line 266
    iget-object v0, p0, Lo/cfo$5;->e:Lo/cfo;

    invoke-static {v0}, Lo/cfo;->a(Lo/cfo;)Landroid/content/Context;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 268
    :try_start_0
    invoke-static {}, Lo/dbc;->d()Lo/dbc;

    move-result-object v0

    const/16 v1, 0x271c

    invoke-virtual {v0, v1}, Lo/dbc;->b(I)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 271
    goto :goto_0

    .line 269
    :catch_0
    move-exception v4

    .line 270
    const-string v0, "Track_HealthSportingNotificationHelper"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "deleteHealthNotification() Exception"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Ljava/lang/IllegalStateException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 273
    :cond_0
    :goto_0
    return-void
.end method
