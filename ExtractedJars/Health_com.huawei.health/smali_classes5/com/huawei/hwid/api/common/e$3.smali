.class Lcom/huawei/hwid/api/common/e$3;
.super Ljava/lang/Thread;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/hwid/api/common/e;->a(Landroid/content/Context;Lcom/huawei/hwid/core/datatype/UserInfo;Lcom/huawei/cloudservice/CloudRequestHandler;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/content/Context;

.field final synthetic b:Lcom/huawei/hwid/core/datatype/UserInfo;

.field final synthetic c:Lcom/huawei/cloudservice/CloudRequestHandler;

.field final synthetic d:Lcom/huawei/hwid/api/common/e;


# direct methods
.method constructor <init>(Lcom/huawei/hwid/api/common/e;Landroid/content/Context;Lcom/huawei/hwid/core/datatype/UserInfo;Lcom/huawei/cloudservice/CloudRequestHandler;)V
    .locals 0

    .line 1029
    iput-object p1, p0, Lcom/huawei/hwid/api/common/e$3;->d:Lcom/huawei/hwid/api/common/e;

    iput-object p2, p0, Lcom/huawei/hwid/api/common/e$3;->a:Landroid/content/Context;

    iput-object p3, p0, Lcom/huawei/hwid/api/common/e$3;->b:Lcom/huawei/hwid/core/datatype/UserInfo;

    iput-object p4, p0, Lcom/huawei/hwid/api/common/e$3;->c:Lcom/huawei/cloudservice/CloudRequestHandler;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 1031
    iget-object v0, p0, Lcom/huawei/hwid/api/common/e$3;->d:Lcom/huawei/hwid/api/common/e;

    iget-object v1, p0, Lcom/huawei/hwid/api/common/e$3;->a:Landroid/content/Context;

    iget-object v2, p0, Lcom/huawei/hwid/api/common/e$3;->b:Lcom/huawei/hwid/core/datatype/UserInfo;

    iget-object v3, p0, Lcom/huawei/hwid/api/common/e$3;->c:Lcom/huawei/cloudservice/CloudRequestHandler;

    invoke-static {v0, v1, v2, v3}, Lcom/huawei/hwid/api/common/e;->a(Lcom/huawei/hwid/api/common/e;Landroid/content/Context;Lcom/huawei/hwid/core/datatype/UserInfo;Lcom/huawei/cloudservice/CloudRequestHandler;)V

    .line 1032
    return-void
.end method
