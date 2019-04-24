.class Lo/fdj$7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/fdj;->d(Landroid/content/Context;JJLo/egg;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/fdj;

.field final synthetic c:Lo/egg;


# direct methods
.method constructor <init>(Lo/fdj;Lo/egg;)V
    .locals 0

    .line 584
    iput-object p1, p0, Lo/fdj$7;->a:Lo/fdj;

    iput-object p2, p0, Lo/fdj$7;->c:Lo/egg;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 2

    .line 587
    iget-object v0, p0, Lo/fdj$7;->c:Lo/egg;

    const/4 v1, 0x0

    invoke-interface {v0, v1, p2}, Lo/egg;->c(ILjava/lang/Object;)V

    .line 588
    return-void
.end method
