.class Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->processRRData([I[I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;

.field final synthetic val$rrDataArr:[I

.field final synthetic val$rrLength:I

.field final synthetic val$timeStampArr:[I


# direct methods
.method constructor <init>(Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;I[I[I)V
    .locals 0

    .line 197
    iput-object p1, p0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider$1;->this$0:Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;

    iput p2, p0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider$1;->val$rrLength:I

    iput-object p3, p0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider$1;->val$rrDataArr:[I

    iput-object p4, p0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider$1;->val$timeStampArr:[I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 200
    const/4 v4, 0x0

    :goto_0
    iget v0, p0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider$1;->val$rrLength:I

    if-ge v4, v0, :cond_0

    .line 201
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->access$000()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "processRRData(), rrData["

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "]: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider$1;->val$rrDataArr:[I

    aget v3, v3, v4

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", timeStamp["

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "]: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider$1;->val$timeStampArr:[I

    aget v3, v3, v4

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 200
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 203
    :cond_0
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider$1;->this$0:Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->access$100(Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;)I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_1

    .line 206
    :sswitch_0
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->access$000()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "processRRData(), enter STRESS_CLOSE"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 207
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider$1;->this$0:Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;

    iget v1, p0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider$1;->val$rrLength:I

    iget-object v2, p0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider$1;->val$rrDataArr:[I

    iget-object v3, p0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider$1;->val$timeStampArr:[I

    invoke-static {v0, v1, v2, v3}, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->access$200(Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;I[I[I)V

    .line 208
    goto :goto_1

    .line 211
    :sswitch_1
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->access$000()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "processRRData(), enter STRESS_CALIBRATION_CLOSE"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 212
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider$1;->this$0:Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;

    iget v1, p0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider$1;->val$rrLength:I

    iget-object v2, p0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider$1;->val$rrDataArr:[I

    iget-object v3, p0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider$1;->val$timeStampArr:[I

    invoke-static {v0, v1, v2, v3}, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->access$300(Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;I[I[I)V

    .line 213
    goto :goto_1

    .line 216
    :sswitch_2
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->access$000()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "processRRData(), enter RELAX_CLOSE"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 217
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider$1;->this$0:Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;

    iget v1, p0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider$1;->val$rrLength:I

    iget-object v2, p0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider$1;->val$rrDataArr:[I

    iget-object v3, p0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider$1;->val$timeStampArr:[I

    invoke-static {v0, v1, v2, v3}, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->access$400(Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;I[I[I)V

    .line 218
    goto :goto_1

    .line 221
    :sswitch_3
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->access$000()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "processRRData(), enter GAME_CLOSE"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 222
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider$1;->this$0:Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;

    iget v1, p0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider$1;->val$rrLength:I

    iget-object v2, p0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider$1;->val$rrDataArr:[I

    iget-object v3, p0, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider$1;->val$timeStampArr:[I

    invoke-static {v0, v1, v2, v3}, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->access$500(Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;I[I[I)V

    .line 223
    .line 227
    :goto_1
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x2 -> :sswitch_0
        0x5 -> :sswitch_1
        0xa -> :sswitch_2
        0xd -> :sswitch_3
    .end sparse-switch
.end method
