.class Lcom/huawei/qrcode/logic/EventDispatchManager$EventDispatchInstance;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/qrcode/logic/EventDispatchManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "EventDispatchInstance"
.end annotation


# static fields
.field static instance:Lcom/huawei/qrcode/logic/EventDispatchManager;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/huawei/qrcode/logic/EventDispatchManager;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/huawei/qrcode/logic/EventDispatchManager;-><init>(Lcom/huawei/qrcode/logic/EventDispatchManager$1;)V

    sput-object v0, Lcom/huawei/qrcode/logic/EventDispatchManager$EventDispatchInstance;->instance:Lcom/huawei/qrcode/logic/EventDispatchManager;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
