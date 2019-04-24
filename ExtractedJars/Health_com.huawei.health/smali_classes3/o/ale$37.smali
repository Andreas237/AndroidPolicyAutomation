.class Lo/ale$37;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/ale;->H()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lo/ale;


# direct methods
.method constructor <init>(Lo/ale;)V
    .locals 0

    .line 2942
    iput-object p1, p0, Lo/ale$37;->e:Lo/ale;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 8

    .line 2945
    iget-object v0, p0, Lo/ale$37;->e:Lo/ale;

    invoke-static {v0}, Lo/ale;->e(Lo/ale;)Landroid/content/Context;

    move-result-object v7

    .line 2946
    const/4 v0, 0x0

    if-ne v0, v7, :cond_0

    .line 2947
    return-void

    .line 2950
    :cond_0
    invoke-static {v7}, Lo/dth;->b(Landroid/content/Context;)Lo/dth;

    move-result-object v0

    invoke-virtual {v0}, Lo/dth;->c()V

    .line 2951
    invoke-static {v7}, Lo/dth;->b(Landroid/content/Context;)Lo/dth;

    move-result-object v0

    invoke-virtual {v0}, Lo/dth;->f()V

    .line 2955
    invoke-static {v7}, Lo/dth;->b(Landroid/content/Context;)Lo/dth;

    move-result-object v0

    invoke-virtual {v0}, Lo/dth;->h()V

    .line 2957
    invoke-static {v7}, Lo/dxb;->a(Landroid/content/Context;)Lo/dxb;

    move-result-object v0

    .line 2958
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    const/4 v3, -0x4

    const/4 v4, 0x1

    invoke-static {v3, v1, v2, v4}, Lo/dzk;->c(IJI)J

    move-result-wide v1

    .line 2959
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    .line 2957
    const/16 v5, 0xb

    const/4 v6, 0x0

    invoke-virtual/range {v0 .. v6}, Lo/dxb;->b(JJILo/duh;)V

    .line 2960
    return-void
.end method
