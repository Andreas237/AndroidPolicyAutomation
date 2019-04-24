.class Lo/fhp$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/fhp;->e(Lo/egg;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/fhp;

.field final synthetic d:Lo/egg;


# direct methods
.method constructor <init>(Lo/fhp;Lo/egg;)V
    .locals 0

    .line 53
    iput-object p1, p0, Lo/fhp$2;->a:Lo/fhp;

    iput-object p2, p0, Lo/fhp$2;->d:Lo/egg;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 2

    .line 56
    iget-object v0, p0, Lo/fhp$2;->d:Lo/egg;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 57
    iget-object v0, p0, Lo/fhp$2;->d:Lo/egg;

    invoke-interface {v0, p1, p2}, Lo/egg;->c(ILjava/lang/Object;)V

    .line 59
    :cond_0
    return-void
.end method
