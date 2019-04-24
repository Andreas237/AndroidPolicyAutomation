.class Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/nfc/carrera/logic/cardinfo/callback/RefreshLocalIconCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;->refreshLocalCardPic()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;

.field final synthetic val$productId:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;Ljava/lang/String;)V
    .locals 0

    .line 877
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader$4;->this$0:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;

    iput-object p2, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader$4;->val$productId:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public refreshPicResult(I)V
    .locals 2

    .line 881
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "refresh local card icon in ta, result: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " productId : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader$4;->val$productId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 883
    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    .line 885
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader$4;->this$0:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardListsLoader;->sendEmptyMessage(I)Z

    .line 887
    :cond_0
    return-void
.end method
