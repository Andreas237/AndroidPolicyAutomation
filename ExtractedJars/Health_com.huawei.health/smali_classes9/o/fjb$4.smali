.class final Lo/fjb$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/fjb;->d(ILandroid/content/Context;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field final synthetic d:Lo/fhq;

.field final synthetic e:Landroid/content/Context;


# direct methods
.method constructor <init>(Lo/fhq;Lcom/huawei/hwbasemgr/IBaseResponseCallback;Landroid/content/Context;)V
    .locals 0

    .line 95
    iput-object p1, p0, Lo/fjb$4;->d:Lo/fhq;

    iput-object p2, p0, Lo/fjb$4;->a:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    iput-object p3, p0, Lo/fjb$4;->e:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 98
    iget-object v0, p0, Lo/fjb$4;->d:Lo/fhq;

    const/4 v1, 0x2

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lo/fhq;->d(IZ)V

    .line 99
    iget-object v0, p0, Lo/fjb$4;->d:Lo/fhq;

    const/16 v1, 0x12c

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lo/fhq;->d(IZ)V

    .line 100
    iget-object v0, p0, Lo/fjb$4;->a:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 101
    iget-object v0, p0, Lo/fjb$4;->e:Landroid/content/Context;

    sget-object v1, Lo/dae;->eq:Lo/dae;

    invoke-virtual {v1}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v1

    const-string v2, "1"

    invoke-static {v0, v1, v2}, Lo/fjb;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 102
    return-void
.end method
