.class Lcom/huawei/health/ad/HiAdSplashActivity$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Handler$Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/ad/HiAdSplashActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/health/ad/HiAdSplashActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/ad/HiAdSplashActivity;)V
    .locals 0

    .line 46
    iput-object p1, p0, Lcom/huawei/health/ad/HiAdSplashActivity$4;->c:Lcom/huawei/health/ad/HiAdSplashActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)Z
    .locals 1

    .line 49
    iget-object v0, p0, Lcom/huawei/health/ad/HiAdSplashActivity$4;->c:Lcom/huawei/health/ad/HiAdSplashActivity;

    invoke-virtual {v0}, Lcom/huawei/health/ad/HiAdSplashActivity;->hasWindowFocus()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 50
    iget-object v0, p0, Lcom/huawei/health/ad/HiAdSplashActivity$4;->c:Lcom/huawei/health/ad/HiAdSplashActivity;

    invoke-static {v0}, Lcom/huawei/health/ad/HiAdSplashActivity;->b(Lcom/huawei/health/ad/HiAdSplashActivity;)V

    .line 52
    :cond_0
    const/4 v0, 0x0

    return v0
.end method
