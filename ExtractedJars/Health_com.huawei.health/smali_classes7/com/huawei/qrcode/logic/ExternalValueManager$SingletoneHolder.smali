.class Lcom/huawei/qrcode/logic/ExternalValueManager$SingletoneHolder;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/qrcode/logic/ExternalValueManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "SingletoneHolder"
.end annotation


# static fields
.field static final INSTANCE:Lcom/huawei/qrcode/logic/ExternalValueManager;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/huawei/qrcode/logic/ExternalValueManager;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/huawei/qrcode/logic/ExternalValueManager;-><init>(Lcom/huawei/qrcode/logic/ExternalValueManager$1;)V

    sput-object v0, Lcom/huawei/qrcode/logic/ExternalValueManager$SingletoneHolder;->INSTANCE:Lcom/huawei/qrcode/logic/ExternalValueManager;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method