.class public Lcom/huawei/qrcode/logic/ExternalValueManager;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/qrcode/logic/ExternalValueManager$SingletoneHolder;
    }
.end annotation


# instance fields
.field private externalValue:Ljava/lang/String;


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/huawei/qrcode/logic/ExternalValueManager$1;)V
    .locals 0

    invoke-direct {p0}, Lcom/huawei/qrcode/logic/ExternalValueManager;-><init>()V

    return-void
.end method

.method public static getInstance()Lcom/huawei/qrcode/logic/ExternalValueManager;
    .locals 1

    sget-object v0, Lcom/huawei/qrcode/logic/ExternalValueManager$SingletoneHolder;->INSTANCE:Lcom/huawei/qrcode/logic/ExternalValueManager;

    return-object v0
.end method


# virtual methods
.method public getExternalValue()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/qrcode/logic/ExternalValueManager;->externalValue:Ljava/lang/String;

    return-object v0
.end method

.method public setExternalValue(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/qrcode/logic/ExternalValueManager;->externalValue:Ljava/lang/String;

    return-void
.end method
