.class Lo/cwe$6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hms/api/HuaweiApiClient$OnConnectionFailedListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/cwe;->b()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/cwe;


# direct methods
.method constructor <init>(Lo/cwe;)V
    .locals 0

    .line 2185
    iput-object p1, p0, Lo/cwe$6;->c:Lo/cwe;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onConnectionFailed(Lcom/huawei/hms/api/ConnectionResult;)V
    .locals 4

    .line 2190
    const-string v0, "Opera_PluginOperationAdapterImpl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MainActivty_signAgrHttp connectionFailed "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p1}, Lcom/huawei/hms/api/ConnectionResult;->getErrorCode()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2191
    return-void
.end method
