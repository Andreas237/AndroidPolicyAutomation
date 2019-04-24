.class Lo/dlz$2$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/egg;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dlz$2;->onResponse(ILjava/lang/Object;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Ljava/util/List;

.field final synthetic d:Lo/dlz$2;


# direct methods
.method constructor <init>(Lo/dlz$2;Ljava/util/List;)V
    .locals 0

    .line 598
    iput-object p1, p0, Lo/dlz$2$3;->d:Lo/dlz$2;

    iput-object p2, p0, Lo/dlz$2$3;->b:Ljava/util/List;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(ILjava/lang/Object;)V
    .locals 3

    .line 601
    if-nez p1, :cond_0

    .line 602
    iget-object v0, p0, Lo/dlz$2$3;->d:Lo/dlz$2;

    iget-object v0, v0, Lo/dlz$2;->c:Lo/egg;

    iget-object v1, p0, Lo/dlz$2$3;->b:Ljava/util/List;

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    const/4 v2, 0x0

    invoke-interface {v0, v2, v1}, Lo/egg;->c(ILjava/lang/Object;)V

    goto :goto_0

    .line 604
    :cond_0
    iget-object v0, p0, Lo/dlz$2$3;->d:Lo/dlz$2;

    iget-object v0, v0, Lo/dlz$2;->c:Lo/egg;

    const v1, 0x186a1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lo/egg;->c(ILjava/lang/Object;)V

    .line 606
    :goto_0
    return-void
.end method
