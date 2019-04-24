.class Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoRefresher$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoRefresher;->cardListRefreshFailed(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoRefresher;

.field final synthetic val$errorCode:I


# direct methods
.method constructor <init>(Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoRefresher;I)V
    .locals 0

    .line 170
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoRefresher$2;->this$0:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoRefresher;

    iput p2, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoRefresher$2;->val$errorCode:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 174
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoRefresher$2;->this$0:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoRefresher;

    iget v1, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoRefresher$2;->val$errorCode:I

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoRefresher;->access$100(Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoRefresher;I)V

    .line 175
    return-void
.end method
