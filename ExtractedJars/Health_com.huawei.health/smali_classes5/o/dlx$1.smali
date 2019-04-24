.class Lo/dlx$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/egg;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dlx;->c(Lo/egg;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/dlx;

.field final synthetic e:Lo/egg;


# direct methods
.method constructor <init>(Lo/dlx;Lo/egg;)V
    .locals 0

    .line 248
    iput-object p1, p0, Lo/dlx$1;->b:Lo/dlx;

    iput-object p2, p0, Lo/dlx$1;->e:Lo/egg;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(ILjava/lang/Object;)V
    .locals 3

    .line 251
    if-nez p1, :cond_0

    .line 252
    iget-object v0, p0, Lo/dlx$1;->e:Lo/egg;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lo/egg;->c(ILjava/lang/Object;)V

    goto :goto_0

    .line 254
    :cond_0
    iget-object v0, p0, Lo/dlx$1;->e:Lo/egg;

    const v1, 0x186a1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lo/egg;->c(ILjava/lang/Object;)V

    .line 256
    :goto_0
    return-void
.end method
