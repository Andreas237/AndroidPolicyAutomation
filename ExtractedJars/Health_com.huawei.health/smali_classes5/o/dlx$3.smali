.class Lo/dlx$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/egg;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dlx;->e(Lo/egg;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/egg;

.field final synthetic c:Lo/dlx;


# direct methods
.method constructor <init>(Lo/dlx;Lo/egg;)V
    .locals 0

    .line 166
    iput-object p1, p0, Lo/dlx$3;->c:Lo/dlx;

    iput-object p2, p0, Lo/dlx$3;->b:Lo/egg;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(ILjava/lang/Object;)V
    .locals 3

    .line 169
    if-nez p1, :cond_0

    .line 170
    iget-object v0, p0, Lo/dlx$3;->b:Lo/egg;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lo/egg;->c(ILjava/lang/Object;)V

    goto :goto_0

    .line 172
    :cond_0
    iget-object v0, p0, Lo/dlx$3;->b:Lo/egg;

    const v1, 0x186a1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lo/egg;->c(ILjava/lang/Object;)V

    .line 174
    :goto_0
    return-void
.end method
