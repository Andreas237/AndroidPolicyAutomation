.class Lo/emr$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/emr;->setDoubleClickEnable(Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lo/emr;


# direct methods
.method constructor <init>(Lo/emr;)V
    .locals 0

    .line 120
    iput-object p1, p0, Lo/emr$1;->e:Lo/emr;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 123
    iget-object v0, p0, Lo/emr$1;->e:Lo/emr;

    iget-object v1, p0, Lo/emr$1;->e:Lo/emr;

    invoke-static {v1}, Lo/emr;->b(Lo/emr;)J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lo/emr;->a(Lo/emr;J)J

    .line 124
    iget-object v0, p0, Lo/emr$1;->e:Lo/emr;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lo/emr;->c(Lo/emr;J)J

    .line 126
    iget-object v0, p0, Lo/emr$1;->e:Lo/emr;

    invoke-static {v0}, Lo/emr;->b(Lo/emr;)J

    move-result-wide v0

    iget-object v2, p0, Lo/emr$1;->e:Lo/emr;

    invoke-static {v2}, Lo/emr;->e(Lo/emr;)J

    move-result-wide v2

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x3e8

    cmp-long v0, v0, v2

    if-gez v0, :cond_0

    .line 127
    iget-object v0, p0, Lo/emr$1;->e:Lo/emr;

    invoke-static {v0}, Lo/emr;->d(Lo/emr;)Lo/emr$a;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 128
    iget-object v0, p0, Lo/emr$1;->e:Lo/emr;

    invoke-static {v0}, Lo/emr;->d(Lo/emr;)Lo/emr$a;

    move-result-object v0

    invoke-interface {v0}, Lo/emr$a;->c()V

    .line 131
    :cond_0
    return-void
.end method
