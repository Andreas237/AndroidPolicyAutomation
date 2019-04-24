.class Lcom/huawei/health/MainActivity$c$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hms/support/api/client/ResultCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/MainActivity$c;->a(Lcom/huawei/hms/api/HuaweiApiClient;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lcom/huawei/hms/support/api/client/ResultCallback<Lcom/huawei/hms/support/api/push/TokenResult;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/health/MainActivity$c;


# direct methods
.method constructor <init>(Lcom/huawei/health/MainActivity$c;)V
    .locals 0

    .line 837
    iput-object p1, p0, Lcom/huawei/health/MainActivity$c$3;->a:Lcom/huawei/health/MainActivity$c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(Lcom/huawei/hms/support/api/push/TokenResult;)V
    .locals 0

    .line 841
    return-void
.end method

.method public synthetic onResult(Ljava/lang/Object;)V
    .locals 1

    .line 837
    move-object v0, p1

    check-cast v0, Lcom/huawei/hms/support/api/push/TokenResult;

    invoke-virtual {p0, v0}, Lcom/huawei/health/MainActivity$c$3;->c(Lcom/huawei/hms/support/api/push/TokenResult;)V

    return-void
.end method
