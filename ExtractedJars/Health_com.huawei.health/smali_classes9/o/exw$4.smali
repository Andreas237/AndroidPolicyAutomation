.class Lo/exw$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/eyv;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/exw;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/exw;


# direct methods
.method constructor <init>(Lo/exw;)V
    .locals 0

    .line 203
    iput-object p1, p0, Lo/exw$4;->b:Lo/exw;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lo/eih;Lo/eic;)F
    .locals 2

    .line 207
    iget-object v0, p0, Lo/exw$4;->b:Lo/exw;

    invoke-static {v0}, Lo/exw;->d(Lo/exw;)Ljava/util/Map;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/exw$4;->b:Lo/exw;

    invoke-static {v0}, Lo/exw;->d(Lo/exw;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_1

    .line 210
    :cond_0
    const/4 v0, 0x0

    return v0

    .line 213
    :cond_1
    iget-object v0, p0, Lo/exw$4;->b:Lo/exw;

    invoke-static {v0}, Lo/exw;->d(Lo/exw;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lo/eii;

    .line 214
    new-instance v0, Lo/exw$4$5;

    invoke-direct {v0, p0}, Lo/exw$4$5;-><init>(Lo/exw$4;)V

    invoke-virtual {v1, p1, v0}, Lo/eii;->c(Lo/eih;Lo/ejv;)F

    move-result v0

    return v0
.end method
