.class final Lo/fjb$10;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/fjb;->a(Landroid/content/Context;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/content/Context;

.field final synthetic b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field final synthetic e:Lo/fhq;


# direct methods
.method constructor <init>(Landroid/content/Context;Lo/fhq;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 0

    .line 283
    iput-object p1, p0, Lo/fjb$10;->a:Landroid/content/Context;

    iput-object p2, p0, Lo/fjb$10;->e:Lo/fhq;

    iput-object p3, p0, Lo/fjb$10;->b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 5

    .line 286
    iget-object v0, p0, Lo/fjb$10;->a:Landroid/content/Context;

    const/16 v1, 0x2729

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "privacy_data_already_show_agree"

    const-string v3, "true"

    new-instance v4, Lo/dcy;

    invoke-direct {v4}, Lo/dcy;-><init>()V

    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 289
    iget-object v0, p0, Lo/fjb$10;->e:Lo/fhq;

    const/16 v1, 0x12d

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lo/fhq;->d(IZ)V

    .line 290
    iget-object v0, p0, Lo/fjb$10;->b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    if-eqz v0, :cond_0

    .line 291
    iget-object v0, p0, Lo/fjb$10;->b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 293
    :cond_0
    return-void
.end method
