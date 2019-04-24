.class Lcom/huawei/health/ad/HiAdSplashActivity$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/openalliance/ad/inter/listeners/AdListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/ad/HiAdSplashActivity;->b()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/health/ad/HiAdSplashActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/ad/HiAdSplashActivity;)V
    .locals 0

    .line 175
    iput-object p1, p0, Lcom/huawei/health/ad/HiAdSplashActivity$3;->e:Lcom/huawei/health/ad/HiAdSplashActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAdDismissed()V
    .locals 4

    .line 191
    const-string v0, "Login_HiAdSplashActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onAdDismissed"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 192
    iget-object v0, p0, Lcom/huawei/health/ad/HiAdSplashActivity$3;->e:Lcom/huawei/health/ad/HiAdSplashActivity;

    invoke-static {v0}, Lcom/huawei/health/ad/HiAdSplashActivity;->b(Lcom/huawei/health/ad/HiAdSplashActivity;)V

    .line 193
    return-void
.end method

.method public onAdFailedToLoad(I)V
    .locals 4

    .line 179
    const-string v0, "Login_HiAdSplashActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onAdFailedToLoad: "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 180
    return-void
.end method

.method public onAdLoaded()V
    .locals 4

    .line 185
    const-string v0, "Login_HiAdSplashActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onAdLoaded"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 186
    return-void
.end method
