.class public Lcom/huawei/wallet/logic/cardidentify/CardIdentifyInfo;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Ljava/lang/String;

.field private d:Landroid/graphics/Bitmap;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    return-void
.end method


# virtual methods
.method public b(Ljava/lang/String;)V
    .locals 0

    .line 39
    iput-object p1, p0, Lcom/huawei/wallet/logic/cardidentify/CardIdentifyInfo;->a:Ljava/lang/String;

    .line 40
    return-void
.end method

.method public c()Ljava/lang/String;
    .locals 1

    .line 34
    iget-object v0, p0, Lcom/huawei/wallet/logic/cardidentify/CardIdentifyInfo;->a:Ljava/lang/String;

    return-object v0
.end method

.method public d(Landroid/graphics/Bitmap;)V
    .locals 0

    .line 49
    iput-object p1, p0, Lcom/huawei/wallet/logic/cardidentify/CardIdentifyInfo;->d:Landroid/graphics/Bitmap;

    .line 50
    return-void
.end method

.method public e()Landroid/graphics/Bitmap;
    .locals 1

    .line 44
    iget-object v0, p0, Lcom/huawei/wallet/logic/cardidentify/CardIdentifyInfo;->d:Landroid/graphics/Bitmap;

    return-object v0
.end method
