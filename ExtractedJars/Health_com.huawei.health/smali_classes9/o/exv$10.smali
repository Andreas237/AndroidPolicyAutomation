.class Lo/exv$10;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/egg;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/exv;->c(Ljava/util/List;Lo/egg;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/exv;

.field final synthetic e:Lo/egg;


# direct methods
.method constructor <init>(Lo/exv;Lo/egg;)V
    .locals 0

    .line 1182
    iput-object p1, p0, Lo/exv$10;->c:Lo/exv;

    iput-object p2, p0, Lo/exv$10;->e:Lo/egg;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(ILjava/lang/Object;)V
    .locals 1

    .line 1185
    iget-object v0, p0, Lo/exv$10;->e:Lo/egg;

    if-eqz v0, :cond_0

    .line 1186
    iget-object v0, p0, Lo/exv$10;->e:Lo/egg;

    invoke-interface {v0, p1, p2}, Lo/egg;->c(ILjava/lang/Object;)V

    .line 1188
    :cond_0
    return-void
.end method
