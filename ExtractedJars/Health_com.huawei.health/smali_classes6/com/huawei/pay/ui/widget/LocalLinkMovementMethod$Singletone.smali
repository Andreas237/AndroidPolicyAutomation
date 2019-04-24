.class Lcom/huawei/pay/ui/widget/LocalLinkMovementMethod$Singletone;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/pay/ui/widget/LocalLinkMovementMethod;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "Singletone"
.end annotation


# static fields
.field public static final INSTANCE:Lcom/huawei/pay/ui/widget/LocalLinkMovementMethod;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 34
    new-instance v0, Lcom/huawei/pay/ui/widget/LocalLinkMovementMethod;

    invoke-direct {v0}, Lcom/huawei/pay/ui/widget/LocalLinkMovementMethod;-><init>()V

    sput-object v0, Lcom/huawei/pay/ui/widget/LocalLinkMovementMethod$Singletone;->INSTANCE:Lcom/huawei/pay/ui/widget/LocalLinkMovementMethod;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
