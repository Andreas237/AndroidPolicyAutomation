.class Lo/eaa$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/eaa;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lo/eaa;


# direct methods
.method constructor <init>(Lo/eaa;)V
    .locals 0

    .line 77
    iput-object p1, p0, Lo/eaa$3;->d:Lo/eaa;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 8

    .line 80
    iget-object v0, p0, Lo/eaa$3;->d:Lo/eaa;

    invoke-virtual {v0}, Lo/eaa;->getAdapter()Lo/eab;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/dzz;

    .line 81
    if-nez v4, :cond_0

    .line 82
    return-void

    .line 84
    :cond_0
    iget-object v0, p0, Lo/eaa$3;->d:Lo/eaa;

    invoke-static {v0}, Lo/eaa;->b(Lo/eaa;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/eah;->e(Landroid/content/Context;)Lo/eah;

    move-result-object v0

    invoke-virtual {v0}, Lo/eah;->a()Ljava/lang/String;

    move-result-object v5

    .line 85
    const-string v0, "UIDV_PluginMessageCenter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "changeUserRunnable lastHUID="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 86
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "getLoginInfo"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "getUserInfo"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    invoke-interface {v4, v0}, Lo/dzz;->c([Ljava/lang/String;)Ljava/util/Map;

    move-result-object v6

    .line 88
    const-string v0, "huid"

    invoke-interface {v6, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ljava/lang/String;

    .line 89
    const-string v0, "UIDV_PluginMessageCenter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "changeUserRunnable currentHUID="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 90
    iget-object v0, p0, Lo/eaa$3;->d:Lo/eaa;

    invoke-static {v0}, Lo/eaa;->b(Lo/eaa;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/eah;->e(Landroid/content/Context;)Lo/eah;

    move-result-object v0

    invoke-virtual {v0, v7}, Lo/eah;->h(Ljava/lang/String;)V

    .line 91
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 92
    const-string v0, "UIDV_PluginMessageCenter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "user change"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 93
    iget-object v0, p0, Lo/eaa$3;->d:Lo/eaa;

    invoke-static {v0}, Lo/eaa;->b(Lo/eaa;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/eah;->e(Landroid/content/Context;)Lo/eah;

    move-result-object v0

    invoke-virtual {v0}, Lo/eah;->b()Z

    .line 95
    :cond_1
    iget-object v0, p0, Lo/eaa$3;->d:Lo/eaa;

    invoke-static {v0}, Lo/eaa;->b(Lo/eaa;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/eah;->e(Landroid/content/Context;)Lo/eah;

    move-result-object v0

    const-string v1, "languageCode"

    invoke-interface {v6, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/eah;->i(Ljava/lang/String;)V

    .line 96
    return-void
.end method
