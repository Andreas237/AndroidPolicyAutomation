.class Lcom/huawei/ui/homewear21/home/WearHomeActivity$84$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/homewear21/home/WearHomeActivity$84;->onClick(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/ui/homewear21/home/WearHomeActivity$84;


# direct methods
.method constructor <init>(Lcom/huawei/ui/homewear21/home/WearHomeActivity$84;)V
    .locals 0

    .line 1169
    iput-object p1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$84$4;->b:Lcom/huawei/ui/homewear21/home/WearHomeActivity$84;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 11

    .line 1172
    const/4 v4, 0x0

    .line 1173
    const-string v5, ""

    .line 1174
    const/4 v0, 0x0

    if-ne v0, p1, :cond_2

    if-eqz p2, :cond_2

    .line 1175
    move-object v6, p2

    check-cast v6, Ljava/lang/String;

    .line 1176
    const-string v0, "&&"

    invoke-virtual {v6, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1177
    const-string v0, "&&"

    invoke-virtual {v6, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v7

    .line 1178
    const-string v0, "WearHomeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "INTELLIGENT_HOME_LINKAGE split = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    array-length v3, v7

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1179
    array-length v0, v7

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    .line 1180
    const/4 v4, 0x1

    .line 1181
    const/4 v0, 0x0

    aget-object v5, v7, v0

    .line 1182
    const/4 v0, 0x1

    aget-object v8, v7, v0

    .line 1183
    const/4 v0, 0x2

    aget-object v9, v7, v0

    .line 1184
    const/4 v0, 0x3

    aget-object v10, v7, v0

    .line 1185
    const-string v0, "WearHomeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "checkDevidIsPermanent devId "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " expiresIn "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " proId "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " enable "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1186
    goto :goto_0

    .line 1187
    :cond_0
    const/4 v4, 0x0

    .line 1189
    :goto_0
    goto :goto_1

    .line 1190
    :cond_1
    const/4 v4, 0x0

    .line 1193
    :cond_2
    :goto_1
    const-string v0, "WearHomeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getIntelligentHomeEnable "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1194
    move v6, v4

    .line 1195
    move-object v7, v5

    .line 1196
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$84$4;->b:Lcom/huawei/ui/homewear21/home/WearHomeActivity$84;

    iget-object v0, v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$84;->e:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    new-instance v1, Lcom/huawei/ui/homewear21/home/WearHomeActivity$84$4$4;

    invoke-direct {v1, p0, v6, v7}, Lcom/huawei/ui/homewear21/home/WearHomeActivity$84$4$4;-><init>(Lcom/huawei/ui/homewear21/home/WearHomeActivity$84$4;ZLjava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 1206
    return-void
.end method
