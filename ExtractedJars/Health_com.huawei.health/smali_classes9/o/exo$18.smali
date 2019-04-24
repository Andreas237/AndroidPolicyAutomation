.class Lo/exo$18;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/exo;->d(Ljava/lang/String;Ljava/util/List;Lo/egg;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/egg;

.field final synthetic c:Lo/exo;


# direct methods
.method constructor <init>(Lo/exo;Lo/egg;)V
    .locals 0

    .line 1955
    iput-object p1, p0, Lo/exo$18;->c:Lo/exo;

    iput-object p2, p0, Lo/exo$18;->b:Lo/egg;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 1

    .line 1958
    iget-object v0, p0, Lo/exo$18;->b:Lo/egg;

    if-eqz v0, :cond_0

    .line 1959
    iget-object v0, p0, Lo/exo$18;->b:Lo/egg;

    invoke-interface {v0, p1, p2}, Lo/egg;->c(ILjava/lang/Object;)V

    .line 1961
    :cond_0
    return-void
.end method
