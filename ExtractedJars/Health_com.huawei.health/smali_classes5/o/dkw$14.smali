.class Lo/dkw$14;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/yg;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dkw;->e(Lo/dkh;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/dkw;


# direct methods
.method constructor <init>(Lo/dkw;)V
    .locals 0

    .line 1234
    iput-object p1, p0, Lo/dkw$14;->b:Lo/dkw;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 3

    .line 1237
    iget-object v0, p0, Lo/dkw$14;->b:Lo/dkw;

    invoke-static {v0}, Lo/dkw;->e(Lo/dkw;)Ljava/util/Map;

    move-result-object v0

    iget-object v1, p0, Lo/dkw$14;->b:Lo/dkw;

    invoke-static {v1}, Lo/dkw;->k(Lo/dkw;)Ljava/util/List;

    move-result-object v1

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/dkj;

    invoke-virtual {v1}, Lo/dkj;->c()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    move-object v2, p2

    check-cast v2, Ljava/util/Map;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1238
    iget-object v0, p0, Lo/dkw$14;->b:Lo/dkw;

    invoke-static {v0}, Lo/dkw;->k(Lo/dkw;)Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 1239
    iget-object v0, p0, Lo/dkw$14;->b:Lo/dkw;

    invoke-static {v0}, Lo/dkw;->b(Lo/dkw;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 1240
    iget-object v0, p0, Lo/dkw$14;->b:Lo/dkw;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/dkw;->d(Lo/dkw;I)I

    .line 1241
    iget-object v0, p0, Lo/dkw$14;->b:Lo/dkw;

    invoke-static {v0}, Lo/dkw;->g(Lo/dkw;)V

    .line 1242
    return-void
.end method
