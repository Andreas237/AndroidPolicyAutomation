.class Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoRefresher$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoRefresher;->cardListRefreshed(Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoRefresher;

.field final synthetic val$lists:Ljava/util/List;


# direct methods
.method constructor <init>(Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoRefresher;Ljava/util/List;)V
    .locals 0

    .line 153
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoRefresher$1;->this$0:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoRefresher;

    iput-object p2, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoRefresher$1;->val$lists:Ljava/util/List;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 157
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoRefresher$1;->this$0:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoRefresher;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoRefresher$1;->val$lists:Ljava/util/List;

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoRefresher;->access$000(Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoRefresher;Ljava/util/List;)V

    .line 158
    return-void
.end method
