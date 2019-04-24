.class Lo/cwg$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/duj;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/cwg;->d(Lo/xk;Landroid/content/Context;)Lo/xh;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/xk;

.field final synthetic c:Lo/cwg;


# direct methods
.method constructor <init>(Lo/cwg;Lo/xk;)V
    .locals 0

    .line 58
    iput-object p1, p0, Lo/cwg$3;->c:Lo/cwg;

    iput-object p2, p0, Lo/cwg$3;->a:Lo/xk;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lo/dwe;)V
    .locals 2

    .line 61
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    .line 62
    iget-object v0, p0, Lo/cwg$3;->a:Lo/xk;

    iget-object v1, p0, Lo/cwg$3;->c:Lo/cwg;

    invoke-static {v1, p1}, Lo/cwg;->b(Lo/cwg;Lo/dwe;)Lo/xh;

    move-result-object v1

    invoke-interface {v0, v1}, Lo/xk;->d(Lo/xh;)V

    .line 65
    :cond_0
    return-void
.end method
