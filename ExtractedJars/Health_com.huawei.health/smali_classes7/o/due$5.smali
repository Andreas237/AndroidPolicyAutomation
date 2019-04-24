.class Lo/due$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/due;->a(Ljava/lang/String;Ljava/lang/String;Lo/dub;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lo/due;

.field final synthetic c:Lo/dub;

.field final synthetic d:Ljava/lang/String;


# direct methods
.method constructor <init>(Lo/due;Lo/dub;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 287
    iput-object p1, p0, Lo/due$5;->b:Lo/due;

    iput-object p2, p0, Lo/due$5;->c:Lo/dub;

    iput-object p3, p0, Lo/due$5;->d:Ljava/lang/String;

    iput-object p4, p0, Lo/due$5;->a:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    .line 290
    invoke-static {}, Lo/due;->c()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dbf;->o(Landroid/content/Context;)I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_0

    .line 291
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    .line 292
    iget-object v0, p0, Lo/due$5;->c:Lo/dub;

    iget-object v1, p0, Lo/due$5;->d:Ljava/lang/String;

    iget-object v2, p0, Lo/due$5;->a:Ljava/lang/String;

    new-instance v3, Lo/due$5$2;

    invoke-direct {v3, p0, v4, v5}, Lo/due$5$2;-><init>(Lo/due$5;J)V

    invoke-virtual {v0, v1, v2, v3}, Lo/dub;->a(Ljava/lang/String;Ljava/lang/String;Lo/dua;)V

    .line 304
    :cond_0
    return-void
.end method
