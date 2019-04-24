.class Lcom/huawei/wallet/ui/cardholder/CardHolderFragment$DisplayRunnbale;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "DisplayRunnbale"
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;


# direct methods
.method private constructor <init>(Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;)V
    .locals 0

    .line 411
    iput-object p1, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment$DisplayRunnbale;->d:Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;Lcom/huawei/wallet/ui/cardholder/CardHolderFragment$1;)V
    .locals 0

    .line 411
    invoke-direct {p0, p1}, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment$DisplayRunnbale;-><init>(Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;)V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 415
    iget-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment$DisplayRunnbale;->d:Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;

    invoke-static {v0}, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->e(Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;)V

    .line 416
    iget-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment$DisplayRunnbale;->d:Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;

    invoke-static {v0}, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->b(Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;)Lcom/huawei/wallet/ui/carddisplay/CardHolderLayout;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/wallet/ui/carddisplay/CardHolderLayout;->getChildCount()I

    move-result v0

    if-lez v0, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .line 417
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, " card holder fragment add view succss= "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->a(Ljava/lang/String;Z)V

    .line 419
    if-nez v2, :cond_1

    .line 420
    iget-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment$DisplayRunnbale;->d:Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;

    invoke-static {v0}, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->e(Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;)V

    .line 422
    :cond_1
    return-void
.end method
