.class Lo/eqb$4;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/eqb;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lo/eqb;


# direct methods
.method constructor <init>(Lo/eqb;)V
    .locals 0

    .line 64
    iput-object p1, p0, Lo/eqb$4;->d:Lo/eqb;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 5

    .line 68
    const-string v0, "refresh_type"

    const/4 v1, -0x1

    invoke-virtual {p2, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v4

    .line 70
    if-nez v4, :cond_8

    .line 71
    const-string v0, "FunctionSetCardViewHolder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onReceive ALL_DATA Broadcast"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 72
    iget-object v0, p0, Lo/eqb$4;->d:Lo/eqb;

    iget-object v0, v0, Lo/eqb;->e:Lo/eqj;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 73
    iget-object v0, p0, Lo/eqb$4;->d:Lo/eqb;

    iget-object v0, v0, Lo/eqb;->e:Lo/eqj;

    invoke-virtual {v0}, Lo/eqj;->b()Lo/eqj;

    goto :goto_0

    .line 76
    :cond_0
    const-string v0, "FunctionSetCardViewHolder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "FunctionSetSleepCardReader is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 77
    new-instance v0, Lo/eqj;

    iget-object v1, p0, Lo/eqb$4;->d:Lo/eqb;

    invoke-static {v1}, Lo/eqb;->b(Lo/eqb;)Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lo/eqb$4;->d:Lo/eqb;

    iget-object v2, v2, Lo/eqb;->c:Lo/epy;

    iget-object v3, p0, Lo/eqb$4;->d:Lo/eqb;

    iget-object v3, v3, Lo/eqb;->d:Ljava/util/List;

    invoke-direct {v0, v1, v2, v3}, Lo/eqj;-><init>(Landroid/content/Context;Lo/epy;Ljava/util/List;)V

    invoke-virtual {v0}, Lo/eqj;->b()Lo/eqj;

    .line 79
    :goto_0
    iget-object v0, p0, Lo/eqb$4;->d:Lo/eqb;

    iget-object v0, v0, Lo/eqb;->a:Lo/eqk;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 80
    iget-object v0, p0, Lo/eqb$4;->d:Lo/eqb;

    iget-object v0, v0, Lo/eqb;->a:Lo/eqk;

    invoke-virtual {v0}, Lo/eqk;->b()Lo/eqk;

    goto :goto_1

    .line 83
    :cond_1
    const-string v0, "FunctionSetCardViewHolder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "FunctionSetWeightCardReader is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 84
    new-instance v0, Lo/eqk;

    iget-object v1, p0, Lo/eqb$4;->d:Lo/eqb;

    invoke-static {v1}, Lo/eqb;->c(Lo/eqb;)Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lo/eqb$4;->d:Lo/eqb;

    iget-object v2, v2, Lo/eqb;->c:Lo/epy;

    iget-object v3, p0, Lo/eqb$4;->d:Lo/eqb;

    iget-object v3, v3, Lo/eqb;->d:Ljava/util/List;

    invoke-direct {v0, v1, v2, v3}, Lo/eqk;-><init>(Landroid/content/Context;Lo/epy;Ljava/util/List;)V

    invoke-virtual {v0}, Lo/eqk;->b()Lo/eqk;

    .line 86
    :goto_1
    iget-object v0, p0, Lo/eqb$4;->d:Lo/eqb;

    iget-object v0, v0, Lo/eqb;->b:Lo/eqm;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 87
    iget-object v0, p0, Lo/eqb$4;->d:Lo/eqb;

    iget-object v0, v0, Lo/eqb;->b:Lo/eqm;

    invoke-virtual {v0}, Lo/eqm;->a()Lo/eqm;

    goto :goto_2

    .line 90
    :cond_2
    const-string v0, "FunctionSetCardViewHolder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "FunctionSetHeartRateReader is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 91
    new-instance v0, Lo/eqm;

    iget-object v1, p0, Lo/eqb$4;->d:Lo/eqb;

    invoke-static {v1}, Lo/eqb;->e(Lo/eqb;)Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lo/eqb$4;->d:Lo/eqb;

    iget-object v2, v2, Lo/eqb;->c:Lo/epy;

    iget-object v3, p0, Lo/eqb$4;->d:Lo/eqb;

    iget-object v3, v3, Lo/eqb;->d:Ljava/util/List;

    invoke-direct {v0, v1, v2, v3}, Lo/eqm;-><init>(Landroid/content/Context;Lo/epy;Ljava/util/List;)V

    invoke-virtual {v0}, Lo/eqm;->a()Lo/eqm;

    .line 94
    :goto_2
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-nez v0, :cond_5

    .line 96
    iget-object v0, p0, Lo/eqb$4;->d:Lo/eqb;

    iget-object v0, v0, Lo/eqb;->k:Lo/eqh;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 97
    iget-object v0, p0, Lo/eqb$4;->d:Lo/eqb;

    iget-object v0, v0, Lo/eqb;->k:Lo/eqh;

    invoke-virtual {v0}, Lo/eqh;->a()Lo/eqh;

    goto :goto_3

    .line 100
    :cond_3
    const-string v0, "FunctionSetCardViewHolder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "FunctionSetBloodPressureReader is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 101
    new-instance v0, Lo/eqh;

    iget-object v1, p0, Lo/eqb$4;->d:Lo/eqb;

    invoke-static {v1}, Lo/eqb;->d(Lo/eqb;)Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lo/eqb$4;->d:Lo/eqb;

    iget-object v2, v2, Lo/eqb;->c:Lo/epy;

    iget-object v3, p0, Lo/eqb$4;->d:Lo/eqb;

    iget-object v3, v3, Lo/eqb;->d:Ljava/util/List;

    invoke-direct {v0, v1, v2, v3}, Lo/eqh;-><init>(Landroid/content/Context;Lo/epy;Ljava/util/List;)V

    invoke-virtual {v0}, Lo/eqh;->a()Lo/eqh;

    .line 103
    :goto_3
    iget-object v0, p0, Lo/eqb$4;->d:Lo/eqb;

    iget-object v0, v0, Lo/eqb;->h:Lo/eqd;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    .line 104
    iget-object v0, p0, Lo/eqb$4;->d:Lo/eqb;

    iget-object v0, v0, Lo/eqb;->h:Lo/eqd;

    invoke-virtual {v0}, Lo/eqd;->b()Lo/eqd;

    goto :goto_4

    .line 107
    :cond_4
    const-string v0, "FunctionSetCardViewHolder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "FunctionSetBloodSugarCardReader is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 108
    new-instance v0, Lo/eqd;

    iget-object v1, p0, Lo/eqb$4;->d:Lo/eqb;

    invoke-static {v1}, Lo/eqb;->a(Lo/eqb;)Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lo/eqb$4;->d:Lo/eqb;

    iget-object v2, v2, Lo/eqb;->c:Lo/epy;

    iget-object v3, p0, Lo/eqb$4;->d:Lo/eqb;

    iget-object v3, v3, Lo/eqb;->d:Ljava/util/List;

    invoke-direct {v0, v1, v2, v3}, Lo/eqd;-><init>(Landroid/content/Context;Lo/epy;Ljava/util/List;)V

    invoke-virtual {v0}, Lo/eqd;->b()Lo/eqd;

    .line 111
    :cond_5
    :goto_4
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_6

    iget-object v0, p0, Lo/eqb$4;->d:Lo/eqb;

    invoke-static {v0}, Lo/eqb;->f(Lo/eqb;)Z

    move-result v0

    if-nez v0, :cond_8

    iget-object v0, p0, Lo/eqb$4;->d:Lo/eqb;

    invoke-static {v0}, Lo/eqb;->g(Lo/eqb;)Z

    move-result v0

    if-nez v0, :cond_8

    .line 112
    :cond_6
    iget-object v0, p0, Lo/eqb$4;->d:Lo/eqb;

    iget-object v0, v0, Lo/eqb;->i:Lo/eql;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_7

    .line 113
    iget-object v0, p0, Lo/eqb$4;->d:Lo/eqb;

    iget-object v0, v0, Lo/eqb;->i:Lo/eql;

    invoke-virtual {v0}, Lo/eql;->c()Lo/eql;

    goto :goto_5

    .line 116
    :cond_7
    const-string v0, "FunctionSetCardViewHolder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "FunctionSetStressCardReader is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 117
    new-instance v0, Lo/eql;

    iget-object v1, p0, Lo/eqb$4;->d:Lo/eqb;

    invoke-static {v1}, Lo/eqb;->h(Lo/eqb;)Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lo/eqb$4;->d:Lo/eqb;

    iget-object v2, v2, Lo/eqb;->c:Lo/epy;

    iget-object v3, p0, Lo/eqb$4;->d:Lo/eqb;

    iget-object v3, v3, Lo/eqb;->d:Ljava/util/List;

    invoke-direct {v0, v1, v2, v3}, Lo/eql;-><init>(Landroid/content/Context;Lo/epy;Ljava/util/List;)V

    invoke-virtual {v0}, Lo/eql;->c()Lo/eql;

    .line 119
    :goto_5
    iget-object v0, p0, Lo/eqb$4;->d:Lo/eqb;

    iget-object v0, v0, Lo/eqb;->c:Lo/epy;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_8

    .line 120
    iget-object v0, p0, Lo/eqb$4;->d:Lo/eqb;

    iget-object v0, v0, Lo/eqb;->c:Lo/epy;

    invoke-virtual {v0}, Lo/epy;->c()V

    .line 124
    :cond_8
    return-void
.end method
