.class Lo/exw$2;
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

    .line 133
    iput-object p1, p0, Lo/exw$2;->b:Lo/exw;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lo/eih;Lo/eic;)F
    .locals 3

    .line 137
    iget-object v0, p0, Lo/exw$2;->b:Lo/exw;

    invoke-static {v0}, Lo/exw;->c(Lo/exw;)Ljava/util/Map;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/exw$2;->b:Lo/exw;

    invoke-static {v0}, Lo/exw;->c(Lo/exw;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_1

    .line 138
    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "calculateMax can\'t find dataSet"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 141
    :cond_1
    iget-object v0, p0, Lo/exw$2;->b:Lo/exw;

    invoke-static {v0}, Lo/exw;->c(Lo/exw;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lo/eii;

    .line 142
    new-instance v0, Lo/exw$2$1;

    invoke-direct {v0, p0}, Lo/exw$2$1;-><init>(Lo/exw$2;)V

    invoke-virtual {v2, p1, v0}, Lo/eii;->c(Lo/eih;Lo/ejv;)F

    move-result v0

    return v0
.end method
