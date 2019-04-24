.class Lo/fdj$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/fdj;->d(Landroid/content/Context;JJIILo/egg;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/egg;

.field final synthetic d:Lo/fdj;


# direct methods
.method constructor <init>(Lo/fdj;Lo/egg;)V
    .locals 0

    .line 466
    iput-object p1, p0, Lo/fdj$5;->d:Lo/fdj;

    iput-object p2, p0, Lo/fdj$5;->a:Lo/egg;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 2

    .line 469
    iget-object v0, p0, Lo/fdj$5;->d:Lo/fdj;

    iget-object v1, p0, Lo/fdj$5;->a:Lo/egg;

    invoke-static {v0, p2, v1}, Lo/fdj;->c(Lo/fdj;Ljava/lang/Object;Lo/egg;)V

    .line 470
    return-void
.end method
