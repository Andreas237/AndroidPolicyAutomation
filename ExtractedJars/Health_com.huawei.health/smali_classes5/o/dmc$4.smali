.class final Lo/dmc$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dmc;->d(Landroid/content/Context;Ljava/lang/String;Ljava/util/HashMap;Ljava/util/HashMap;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field final synthetic b:Ljava/util/HashMap;

.field final synthetic d:Ljava/lang/String;

.field final synthetic e:Ljava/util/HashMap;


# direct methods
.method constructor <init>(Ljava/lang/String;Ljava/util/HashMap;Ljava/util/HashMap;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 0

    .line 75
    iput-object p1, p0, Lo/dmc$4;->d:Ljava/lang/String;

    iput-object p2, p0, Lo/dmc$4;->e:Ljava/util/HashMap;

    iput-object p3, p0, Lo/dmc$4;->b:Ljava/util/HashMap;

    iput-object p4, p0, Lo/dmc$4;->a:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 78
    iget-object v0, p0, Lo/dmc$4;->d:Ljava/lang/String;

    iget-object v1, p0, Lo/dmc$4;->e:Ljava/util/HashMap;

    iget-object v2, p0, Lo/dmc$4;->b:Ljava/util/HashMap;

    iget-object v3, p0, Lo/dmc$4;->a:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-static {v0, v1, v2, v3}, Lo/dmc;->a(Ljava/lang/String;Ljava/util/HashMap;Ljava/util/HashMap;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 79
    return-void
.end method
