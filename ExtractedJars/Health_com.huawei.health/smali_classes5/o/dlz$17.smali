.class Lo/dlz$17;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/egg;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dlz;->d(Lo/egg;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/egg;

.field final synthetic b:Lo/dlz;


# direct methods
.method constructor <init>(Lo/dlz;Lo/egg;)V
    .locals 0

    .line 423
    iput-object p1, p0, Lo/dlz$17;->b:Lo/dlz;

    iput-object p2, p0, Lo/dlz$17;->a:Lo/egg;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(ILjava/lang/Object;)V
    .locals 3

    .line 426
    if-nez p1, :cond_0

    .line 427
    iget-object v0, p0, Lo/dlz$17;->b:Lo/dlz;

    invoke-static {v0}, Lo/dlz;->d(Lo/dlz;)Lo/dly;

    move-result-object v0

    const-string v1, "ai-weight-008"

    iget-object v2, p0, Lo/dlz$17;->a:Lo/egg;

    invoke-virtual {v0, v1, v2}, Lo/dly;->a(Ljava/lang/String;Lo/egg;)V

    goto :goto_0

    .line 429
    :cond_0
    iget-object v0, p0, Lo/dlz$17;->a:Lo/egg;

    const v1, 0x186a1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lo/egg;->c(ILjava/lang/Object;)V

    .line 431
    :goto_0
    return-void
.end method
