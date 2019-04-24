.class Lcom/huawei/health/sns/ui/chat/ChatCommonActivity$10;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;)V
    .locals 0

    .line 2215
    iput-object p1, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity$10;->e:Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 5
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/widget/AdapterView<*>;Landroid/view/View;IJ)V"
        }
    .end annotation

    .line 2221
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity$10;->e:Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;

    iget-object v0, v0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->z:Lo/bfb;

    invoke-virtual {v0}, Lo/bfb;->k()V

    .line 2223
    sget-object v0, Lo/bfb$b;->e:Lo/bfb$b;

    invoke-virtual {v0}, Lo/bfb$b;->ordinal()I

    move-result v0

    if-ne p3, v0, :cond_1

    .line 2225
    invoke-static {}, Lo/brg;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2227
    const/4 v0, 0x4

    new-array v3, v0, [Ljava/lang/String;

    const-string v0, "android.permission.READ_EXTERNAL_STORAGE"

    const/4 v1, 0x0

    aput-object v0, v3, v1

    const-string v0, "android.permission.WRITE_EXTERNAL_STORAGE"

    const/4 v1, 0x1

    aput-object v0, v3, v1

    const-string v0, "android.permission.CAMERA"

    const/4 v1, 0x2

    aput-object v0, v3, v1

    const-string v0, "android.permission.FLASHLIGHT"

    const/4 v1, 0x3

    aput-object v0, v3, v1

    .line 2229
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity$10;->e:Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;

    invoke-static {v0, v3}, Lo/biq;->a(Landroid/content/Context;[Ljava/lang/String;)Ljava/util/List;

    move-result-object v4

    .line 2231
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 2233
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity$10;->e:Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v1

    new-array v1, v1, [Ljava/lang/String;

    invoke-interface {v4, v1}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Ljava/lang/String;

    const/4 v2, 0x2

    invoke-virtual {v0, v1, v2}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->requestPermissions([Ljava/lang/String;I)V

    .line 2235
    return-void

    .line 2238
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity$10;->e:Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->N()V

    goto :goto_0

    .line 2241
    :cond_1
    sget-object v0, Lo/bfb$b;->d:Lo/bfb$b;

    invoke-virtual {v0}, Lo/bfb$b;->ordinal()I

    move-result v0

    if-ne p3, v0, :cond_3

    .line 2243
    invoke-static {}, Lo/brg;->c()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 2245
    const/4 v0, 0x2

    new-array v3, v0, [Ljava/lang/String;

    const-string v0, "android.permission.READ_EXTERNAL_STORAGE"

    const/4 v1, 0x0

    aput-object v0, v3, v1

    const-string v0, "android.permission.WRITE_EXTERNAL_STORAGE"

    const/4 v1, 0x1

    aput-object v0, v3, v1

    .line 2247
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity$10;->e:Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;

    invoke-static {v0, v3}, Lo/biq;->a(Landroid/content/Context;[Ljava/lang/String;)Ljava/util/List;

    move-result-object v4

    .line 2249
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_2

    .line 2251
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity$10;->e:Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v1

    new-array v1, v1, [Ljava/lang/String;

    invoke-interface {v4, v1}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Ljava/lang/String;

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->requestPermissions([Ljava/lang/String;I)V

    .line 2253
    return-void

    .line 2257
    :cond_2
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity$10;->e:Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->K()V

    goto :goto_0

    .line 2259
    :cond_3
    sget-object v0, Lo/bfb$b;->a:Lo/bfb$b;

    invoke-virtual {v0}, Lo/bfb$b;->ordinal()I

    move-result v0

    if-ne p3, v0, :cond_4

    .line 2261
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity$10;->e:Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->M()V

    .line 2263
    :cond_4
    :goto_0
    return-void
.end method
