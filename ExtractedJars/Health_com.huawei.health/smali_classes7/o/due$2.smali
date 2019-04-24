.class Lo/due$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/due;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dub;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Lo/due;

.field final synthetic d:Lo/dub;

.field final synthetic e:Ljava/lang/String;


# direct methods
.method constructor <init>(Lo/due;Ljava/lang/String;Ljava/lang/String;Lo/dub;Ljava/lang/String;)V
    .locals 0

    .line 247
    iput-object p1, p0, Lo/due$2;->c:Lo/due;

    iput-object p2, p0, Lo/due$2;->a:Ljava/lang/String;

    iput-object p3, p0, Lo/due$2;->b:Ljava/lang/String;

    iput-object p4, p0, Lo/due$2;->d:Lo/dub;

    iput-object p5, p0, Lo/due$2;->e:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    .line 250
    invoke-static {}, Lo/due;->c()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dbf;->o(Landroid/content/Context;)I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_2

    .line 251
    iget-object v0, p0, Lo/due$2;->c:Lo/due;

    invoke-static {v0}, Lo/due;->a(Lo/due;)Ljava/util/Map;

    move-result-object v0

    iget-object v1, p0, Lo/due$2;->a:Ljava/lang/String;

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    iget-object v0, p0, Lo/due$2;->c:Lo/due;

    invoke-static {v0}, Lo/due;->a(Lo/due;)Ljava/util/Map;

    move-result-object v0

    iget-object v1, p0, Lo/due$2;->a:Ljava/lang/String;

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 252
    iget-object v0, p0, Lo/due$2;->a:Ljava/lang/String;

    iget-object v1, p0, Lo/due$2;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 253
    iget-object v0, p0, Lo/due$2;->c:Lo/due;

    const-string v1, ""

    const/4 v2, 0x4

    invoke-static {v0, v2, v1}, Lo/due;->e(Lo/due;ILjava/lang/Object;)V

    .line 255
    :cond_0
    return-void

    .line 257
    :cond_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    .line 258
    iget-object v0, p0, Lo/due$2;->d:Lo/dub;

    iget-object v1, p0, Lo/due$2;->e:Ljava/lang/String;

    iget-object v2, p0, Lo/due$2;->a:Ljava/lang/String;

    new-instance v3, Lo/due$2$5;

    invoke-direct {v3, p0, v4, v5}, Lo/due$2$5;-><init>(Lo/due$2;J)V

    invoke-virtual {v0, v1, v2, v3}, Lo/dub;->a(Ljava/lang/String;Ljava/lang/String;Lo/dua;)V

    .line 272
    :cond_2
    return-void
.end method
