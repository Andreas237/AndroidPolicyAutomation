.class Lo/flx$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/foj;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/flx;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "c"
.end annotation


# instance fields
.field final synthetic b:Lo/flx;


# direct methods
.method private constructor <init>(Lo/flx;)V
    .locals 0

    .line 634
    iput-object p1, p0, Lo/flx$c;->b:Lo/flx;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lo/flx;Lo/flx$1;)V
    .locals 0

    .line 634
    invoke-direct {p0, p1}, Lo/flx$c;-><init>(Lo/flx;)V

    return-void
.end method


# virtual methods
.method public a(Lo/fma;Lo/fly;)V
    .locals 3

    .line 641
    iget-object v0, p0, Lo/flx$c;->b:Lo/flx;

    invoke-static {v0}, Lo/flx;->e(Lo/flx;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lo/foj;

    .line 642
    invoke-interface {v2, p1, p2}, Lo/foj;->a(Lo/fma;Lo/fly;)V

    .line 643
    goto :goto_0

    .line 644
    :cond_0
    return-void
.end method
