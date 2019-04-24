.class Lcom/huawei/health/MainActivity$i$1$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/MainActivity$i$1;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/health/MainActivity$i$1;


# direct methods
.method constructor <init>(Lcom/huawei/health/MainActivity$i$1;)V
    .locals 0

    .line 3085
    iput-object p1, p0, Lcom/huawei/health/MainActivity$i$1$5;->b:Lcom/huawei/health/MainActivity$i$1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 3089
    iget-object v0, p0, Lcom/huawei/health/MainActivity$i$1$5;->b:Lcom/huawei/health/MainActivity$i$1;

    iget-object v0, v0, Lcom/huawei/health/MainActivity$i$1;->b:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/hwdevicedfxmanager/UploadLogUtil;->uploadReleaseEventLog(Landroid/content/Context;)V

    .line 3093
    return-void
.end method
