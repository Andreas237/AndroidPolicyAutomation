.class Lo/fdj$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/fdj;->a(Landroid/content/Context;JJIILo/egg;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/fdj;

.field final synthetic e:Lo/egg;


# direct methods
.method constructor <init>(Lo/fdj;Lo/egg;)V
    .locals 0

    .line 421
    iput-object p1, p0, Lo/fdj$4;->c:Lo/fdj;

    iput-object p2, p0, Lo/fdj$4;->e:Lo/egg;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 3

    .line 424
    move-object v2, p2

    check-cast v2, Ljava/util/List;

    .line 425
    iget-object v0, p0, Lo/fdj$4;->c:Lo/fdj;

    iget-object v1, p0, Lo/fdj$4;->e:Lo/egg;

    invoke-static {v0, v2, v1}, Lo/fdj;->c(Lo/fdj;Ljava/util/List;Lo/egg;)V

    .line 426
    return-void
.end method
