.class final Lcom/huawei/operation/utils/OperationUtils$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/ebo;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/operation/utils/OperationUtils;->share(Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap;Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic val$responseCallback:Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# direct methods
.method constructor <init>(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 0

    .line 140
    iput-object p1, p0, Lcom/huawei/operation/utils/OperationUtils$1;->val$responseCallback:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getIBaseResponseCallback()Lcom/huawei/hwbasemgr/IBaseResponseCallback;
    .locals 1

    .line 143
    iget-object v0, p0, Lcom/huawei/operation/utils/OperationUtils$1;->val$responseCallback:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    return-object v0
.end method

.method public socialShare(Landroid/content/Context;Lo/dav;)V
    .locals 8

    .line 148
    invoke-static {p1}, Lo/vu;->a(Landroid/content/Context;)Lo/vu;

    move-result-object v7

    .line 149
    invoke-virtual {v7, p1}, Lo/vu;->init(Landroid/content/Context;)V

    .line 150
    move-object v0, v7

    move-object v1, p1

    invoke-virtual {p2}, Lo/dav;->g()Ljava/lang/String;

    move-result-object v2

    .line 151
    invoke-virtual {p2}, Lo/dav;->f()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p2}, Lo/dav;->l()Landroid/graphics/Bitmap;

    move-result-object v4

    .line 152
    invoke-virtual {p2}, Lo/dav;->i()Ljava/lang/String;

    move-result-object v5

    iget-object v6, p0, Lcom/huawei/operation/utils/OperationUtils$1;->val$responseCallback:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 150
    invoke-virtual/range {v0 .. v6}, Lo/vu;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap;Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 153
    return-void
.end method
