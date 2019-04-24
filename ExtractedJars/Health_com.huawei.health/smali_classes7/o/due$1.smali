.class Lo/due$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/due;->b(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/dub;

.field final synthetic b:Lo/due;

.field final synthetic c:Lo/dwr;

.field final synthetic e:Ljava/lang/String;


# direct methods
.method constructor <init>(Lo/due;Ljava/lang/String;Lo/dwr;Lo/dub;)V
    .locals 0

    .line 218
    iput-object p1, p0, Lo/due$1;->b:Lo/due;

    iput-object p2, p0, Lo/due$1;->e:Ljava/lang/String;

    iput-object p3, p0, Lo/due$1;->c:Lo/dwr;

    iput-object p4, p0, Lo/due$1;->a:Lo/dub;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 7

    .line 220
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 221
    const-string v0, "medalID"

    iget-object v1, p0, Lo/due$1;->e:Ljava/lang/String;

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 222
    iget-object v0, p0, Lo/due$1;->c:Lo/dwr;

    const/4 v1, 0x7

    invoke-virtual {v0, v1, v3}, Lo/dwr;->a(ILjava/util/Map;)Lo/dvf;

    move-result-object v4

    .line 223
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    instance-of v0, v4, Lo/dvt;

    if-eqz v0, :cond_0

    .line 224
    move-object v5, v4

    check-cast v5, Lo/dvt;

    .line 225
    invoke-virtual {v5}, Lo/dvt;->d()Ljava/lang/String;

    move-result-object v6

    .line 226
    iget-object v0, p0, Lo/due$1;->b:Lo/due;

    iget-object v1, p0, Lo/due$1;->e:Ljava/lang/String;

    iget-object v2, p0, Lo/due$1;->a:Lo/dub;

    invoke-static {v0, v1, v6, v2}, Lo/due;->e(Lo/due;Ljava/lang/String;Ljava/lang/String;Lo/dub;)V

    .line 227
    goto :goto_0

    .line 228
    :cond_0
    iget-object v0, p0, Lo/due$1;->b:Lo/due;

    invoke-static {v0}, Lo/due;->e(Lo/due;)V

    .line 230
    :goto_0
    return-void
.end method
