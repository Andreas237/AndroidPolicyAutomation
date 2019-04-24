.class Lcom/huawei/hms/api/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/hms/support/api/ResolveResult;

.field final synthetic b:Lcom/huawei/hms/api/HuaweiApiClientImpl$a;


# direct methods
.method constructor <init>(Lcom/huawei/hms/api/HuaweiApiClientImpl$a;Lcom/huawei/hms/support/api/ResolveResult;)V
    .locals 0

    .line 975
    iput-object p1, p0, Lcom/huawei/hms/api/h;->b:Lcom/huawei/hms/api/HuaweiApiClientImpl$a;

    iput-object p2, p0, Lcom/huawei/hms/api/h;->a:Lcom/huawei/hms/support/api/ResolveResult;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 980
    iget-object v0, p0, Lcom/huawei/hms/api/h;->b:Lcom/huawei/hms/api/HuaweiApiClientImpl$a;

    iget-object v0, v0, Lcom/huawei/hms/api/HuaweiApiClientImpl$a;->a:Lcom/huawei/hms/api/HuaweiApiClientImpl;

    iget-object v1, p0, Lcom/huawei/hms/api/h;->a:Lcom/huawei/hms/support/api/ResolveResult;

    invoke-static {v0, v1}, Lcom/huawei/hms/api/HuaweiApiClientImpl;->b(Lcom/huawei/hms/api/HuaweiApiClientImpl;Lcom/huawei/hms/support/api/ResolveResult;)V

    .line 981
    return-void
.end method
