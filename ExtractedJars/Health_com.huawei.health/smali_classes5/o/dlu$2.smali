.class Lo/dlu$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/egg;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dlu;->e(Lo/egg;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/egg;

.field final synthetic e:Lo/dlu;


# direct methods
.method constructor <init>(Lo/dlu;Lo/egg;)V
    .locals 0

    .line 170
    iput-object p1, p0, Lo/dlu$2;->e:Lo/dlu;

    iput-object p2, p0, Lo/dlu$2;->a:Lo/egg;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(ILjava/lang/Object;)V
    .locals 3

    .line 173
    if-nez p1, :cond_0

    .line 174
    iget-object v0, p0, Lo/dlu$2;->a:Lo/egg;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lo/egg;->c(ILjava/lang/Object;)V

    goto :goto_0

    .line 176
    :cond_0
    iget-object v0, p0, Lo/dlu$2;->a:Lo/egg;

    const v1, 0x186a1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lo/egg;->c(ILjava/lang/Object;)V

    .line 178
    :goto_0
    return-void
.end method
