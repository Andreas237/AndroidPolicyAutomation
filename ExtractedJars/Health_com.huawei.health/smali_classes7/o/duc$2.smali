.class Lo/duc$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/duc;->f()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/util/Map;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Ljava/lang/String;

.field final synthetic d:Ljava/lang/String;

.field final synthetic e:Ljava/lang/String;

.field final synthetic i:Ljava/lang/String;

.field final synthetic k:Lo/duc;


# direct methods
.method constructor <init>(Lo/duc;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 347
    iput-object p1, p0, Lo/duc$2;->k:Lo/duc;

    iput-object p2, p0, Lo/duc$2;->a:Ljava/util/Map;

    iput-object p3, p0, Lo/duc$2;->c:Ljava/lang/String;

    iput-object p4, p0, Lo/duc$2;->b:Ljava/lang/String;

    iput-object p5, p0, Lo/duc$2;->e:Ljava/lang/String;

    iput-object p6, p0, Lo/duc$2;->d:Ljava/lang/String;

    iput-object p7, p0, Lo/duc$2;->i:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 7

    .line 350
    iget-object v0, p0, Lo/duc$2;->k:Lo/duc;

    iget-object v1, p0, Lo/duc$2;->a:Ljava/util/Map;

    iget-object v2, p0, Lo/duc$2;->c:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lo/duc;->c(Lo/duc;Ljava/util/Map;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 351
    return-void

    .line 353
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    .line 354
    invoke-static {}, Lo/duc;->c()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dub;->c(Landroid/content/Context;)Lo/dub;

    move-result-object v0

    iget-object v1, p0, Lo/duc$2;->b:Ljava/lang/String;

    iget-object v2, p0, Lo/duc$2;->e:Ljava/lang/String;

    invoke-static {v2}, Lo/dzs;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lo/duc$2;->e:Ljava/lang/String;

    iget-object v4, p0, Lo/duc$2;->c:Ljava/lang/String;

    invoke-static {v3, v4}, Lo/dzs;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lo/duc$2$4;

    invoke-direct {v4, p0, v5, v6}, Lo/duc$2$4;-><init>(Lo/duc$2;J)V

    invoke-virtual {v0, v1, v2, v3, v4}, Lo/dub;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dua;)V

    .line 368
    return-void
.end method
