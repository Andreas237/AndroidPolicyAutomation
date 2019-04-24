.class Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;)V
    .locals 0

    .line 195
    iput-object p1, p0, Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity$2;->c:Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 6

    .line 198
    move-object v0, p2

    check-cast v0, [B

    check-cast v0, [B

    invoke-static {v0}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v4

    .line 199
    const-string v0, "AW70_Aw70ModeSelectActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getSwitch berfore onResponse objData = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 200
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, -0x2

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v1

    invoke-virtual {v4, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v5

    .line 201
    const/4 v0, 0x0

    if-ne v0, v5, :cond_0

    .line 202
    iget-object v0, p0, Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity$2;->c:Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;

    const/4 v1, 0x4

    invoke-static {v0, v1}, Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;->e(Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;I)V

    .line 203
    iget-object v0, p0, Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity$2;->c:Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;->c(Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;I)I

    .line 204
    const-string v0, "AW70_Aw70ModeSelectActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getSwitch in onResume value = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 205
    :cond_0
    const/4 v0, 0x1

    if-ne v0, v5, :cond_1

    .line 206
    iget-object v0, p0, Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity$2;->c:Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;

    const/4 v1, 0x3

    invoke-static {v0, v1}, Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;->e(Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;I)V

    .line 207
    iget-object v0, p0, Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity$2;->c:Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;->c(Lcom/huawei/ui/homewear21/aw70/Aw70ModeSelectActivity;I)I

    .line 208
    const-string v0, "AW70_Aw70ModeSelectActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getSwitch in onResume value = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 210
    :cond_1
    :goto_0
    return-void
.end method
