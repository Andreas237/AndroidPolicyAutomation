.class Lcom/huawei/wallet/logic/down/AppDownManager$SingletoneHolder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/wallet/logic/down/AppDownManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "SingletoneHolder"
.end annotation


# static fields
.field static final d:Lcom/huawei/wallet/logic/down/AppDownManager;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 133
    new-instance v0, Lcom/huawei/wallet/logic/down/AppDownManager;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/huawei/wallet/logic/down/AppDownManager;-><init>(Lcom/huawei/wallet/logic/down/AppDownManager$1;)V

    sput-object v0, Lcom/huawei/wallet/logic/down/AppDownManager$SingletoneHolder;->d:Lcom/huawei/wallet/logic/down/AppDownManager;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 131
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
