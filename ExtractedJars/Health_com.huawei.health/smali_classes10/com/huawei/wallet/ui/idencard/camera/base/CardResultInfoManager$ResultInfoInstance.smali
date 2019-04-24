.class Lcom/huawei/wallet/ui/idencard/camera/base/CardResultInfoManager$ResultInfoInstance;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/wallet/ui/idencard/camera/base/CardResultInfoManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "ResultInfoInstance"
.end annotation


# static fields
.field static a:Lcom/huawei/wallet/ui/idencard/camera/base/CardResultInfoManager;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 81
    new-instance v0, Lcom/huawei/wallet/ui/idencard/camera/base/CardResultInfoManager;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/huawei/wallet/ui/idencard/camera/base/CardResultInfoManager;-><init>(Lcom/huawei/wallet/ui/idencard/camera/base/CardResultInfoManager$1;)V

    sput-object v0, Lcom/huawei/wallet/ui/idencard/camera/base/CardResultInfoManager$ResultInfoInstance;->a:Lcom/huawei/wallet/ui/idencard/camera/base/CardResultInfoManager;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 79
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
