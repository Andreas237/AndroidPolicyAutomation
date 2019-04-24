.class Lo/ale$42;
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

.field final synthetic e:Lo/ale;


# direct methods
.method constructor <init>(Lo/ale;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 0

    .line 3360
    iput-object p1, p0, Lo/ale$42;->e:Lo/ale;

    iput-object p2, p0, Lo/ale$42;->b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 3362
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "cancel click"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3363
    iget-object v0, p0, Lo/ale$42;->b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const-string v1, ""

    const/4 v2, 0x2

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 3364
    return-void
.end method
