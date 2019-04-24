.class final Lcom/huawei/hwid/api/common/p$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/hwid/api/common/p;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Landroid/content/Context;

.field final synthetic d:Ljava/lang/String;


# direct methods
.method constructor <init>(Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;Ljava/lang/String;)V
    .locals 0

    .line 127
    iput-object p1, p0, Lcom/huawei/hwid/api/common/p$1;->a:Ljava/lang/String;

    iput-object p2, p0, Lcom/huawei/hwid/api/common/p$1;->b:Ljava/lang/String;

    iput-object p3, p0, Lcom/huawei/hwid/api/common/p$1;->c:Landroid/content/Context;

    iput-object p4, p0, Lcom/huawei/hwid/api/common/p$1;->d:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 131
    new-instance v4, Lcom/huawei/hwid/core/b/a/a/c;

    iget-object v0, p0, Lcom/huawei/hwid/api/common/p$1;->a:Ljava/lang/String;

    const-string v1, "com.huawei.hwid"

    iget-object v2, p0, Lcom/huawei/hwid/api/common/p$1;->b:Ljava/lang/String;

    invoke-direct {v4, v0, v1, v2}, Lcom/huawei/hwid/core/b/a/a/c;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 136
    iget-object v0, p0, Lcom/huawei/hwid/api/common/p$1;->c:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/hwid/api/common/p$1;->d:Ljava/lang/String;

    new-instance v2, Lcom/huawei/hwid/api/common/p$1$1;

    iget-object v3, p0, Lcom/huawei/hwid/api/common/p$1;->c:Landroid/content/Context;

    invoke-direct {v2, p0, v3}, Lcom/huawei/hwid/api/common/p$1$1;-><init>(Lcom/huawei/hwid/api/common/p$1;Landroid/content/Context;)V

    invoke-virtual {v4, v0, v4, v1, v2}, Lcom/huawei/hwid/core/b/a/a/c;->a(Landroid/content/Context;Lcom/huawei/hwid/core/b/a/a;Ljava/lang/String;Lcom/huawei/hwid/core/helper/handler/a;)V

    .line 148
    return-void
.end method
