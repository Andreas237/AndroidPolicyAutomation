.class final Lo/fjb$8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/fjb;->b(Landroid/content/Context;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/fhq;

.field final synthetic b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# direct methods
.method constructor <init>(Lo/fhq;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 0

    .line 366
    iput-object p1, p0, Lo/fjb$8;->a:Lo/fhq;

    iput-object p2, p0, Lo/fjb$8;->b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 369
    iget-object v0, p0, Lo/fjb$8;->a:Lo/fhq;

    const/16 v1, 0x12d

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lo/fhq;->d(IZ)V

    .line 370
    iget-object v0, p0, Lo/fjb$8;->b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    if-eqz v0, :cond_0

    .line 371
    iget-object v0, p0, Lo/fjb$8;->b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 373
    :cond_0
    return-void
.end method
