.class Lo/cwe$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/czi;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/cwe;->d(Ljava/lang/String;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/cwe;


# direct methods
.method constructor <init>(Lo/cwe;)V
    .locals 0

    .line 2153
    iput-object p1, p0, Lo/cwe$1;->a:Lo/cwe;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(ILjava/lang/String;)V
    .locals 4

    .line 2156
    iget-object v0, p0, Lo/cwe$1;->a:Lo/cwe;

    iget-object v0, v0, Lo/cwe;->c:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    if-eqz v0, :cond_0

    .line 2157
    iget-object v0, p0, Lo/cwe$1;->a:Lo/cwe;

    iget-object v0, v0, Lo/cwe;->c:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-interface {v0, p1, p2}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 2158
    const-string v0, "Opera_PluginOperationAdapterImpl"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "First sign resCode "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " result "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2159
    iget-object v0, p0, Lo/cwe$1;->a:Lo/cwe;

    const/4 v1, 0x0

    iput-object v1, v0, Lo/cwe;->c:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    goto :goto_0

    .line 2161
    :cond_0
    const-string v0, "Opera_PluginOperationAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "First sign  mAgrQuerycallback is null "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2163
    :goto_0
    return-void
.end method
