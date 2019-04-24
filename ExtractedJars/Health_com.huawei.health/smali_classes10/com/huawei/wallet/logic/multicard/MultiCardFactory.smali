.class public Lcom/huawei/wallet/logic/multicard/MultiCardFactory;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Lcom/huawei/wallet/logic/multicard/MultiCard$SupportMode;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 18
    sget-object v0, Lcom/huawei/wallet/logic/multicard/MultiCard$SupportMode;->b:Lcom/huawei/wallet/logic/multicard/MultiCard$SupportMode;

    sput-object v0, Lcom/huawei/wallet/logic/multicard/MultiCardFactory;->a:Lcom/huawei/wallet/logic/multicard/MultiCard$SupportMode;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
