.class Lo/exz$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/exz;->c(JJILo/ekr;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic c:Lo/exz;

.field final synthetic d:Lo/ekr;


# direct methods
.method constructor <init>(Lo/exz;ILo/ekr;)V
    .locals 0

    .line 112
    iput-object p1, p0, Lo/exz$1;->c:Lo/exz;

    iput p2, p0, Lo/exz$1;->a:I

    iput-object p3, p0, Lo/exz$1;->d:Lo/ekr;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 3

    .line 115
    iget-object v0, p0, Lo/exz$1;->c:Lo/exz;

    iget v1, p0, Lo/exz$1;->a:I

    invoke-static {v0, p2, v1}, Lo/exz;->e(Lo/exz;Ljava/lang/Object;I)Ljava/util/Map;

    move-result-object v2

    .line 116
    iget-object v0, p0, Lo/exz$1;->d:Lo/ekr;

    const/4 v1, 0x0

    invoke-interface {v0, v1, v2}, Lo/ekr;->b(ILjava/lang/Object;)V

    .line 117
    return-void
.end method
