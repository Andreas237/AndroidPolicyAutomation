.class Lo/ale$47;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/ale;->d(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field final synthetic d:Lo/ale;


# direct methods
.method constructor <init>(Lo/ale;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 0

    .line 3354
    iput-object p1, p0, Lo/ale$47;->d:Lo/ale;

    iput-object p2, p0, Lo/ale$47;->b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 3357
    iget-object v0, p0, Lo/ale$47;->b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const-string v1, ""

    const/4 v2, 0x1

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 3358
    return-void
.end method
