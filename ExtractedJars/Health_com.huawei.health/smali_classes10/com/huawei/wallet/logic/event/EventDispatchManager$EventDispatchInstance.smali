.class Lcom/huawei/wallet/logic/event/EventDispatchManager$EventDispatchInstance;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/wallet/logic/event/EventDispatchManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "EventDispatchInstance"
.end annotation


# static fields
.field static b:Lcom/huawei/wallet/logic/event/EventDispatchManager;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 33
    new-instance v0, Lcom/huawei/wallet/logic/event/EventDispatchManager;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/huawei/wallet/logic/event/EventDispatchManager;-><init>(Lcom/huawei/wallet/logic/event/EventDispatchManager$1;)V

    sput-object v0, Lcom/huawei/wallet/logic/event/EventDispatchManager$EventDispatchInstance;->b:Lcom/huawei/wallet/logic/event/EventDispatchManager;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
