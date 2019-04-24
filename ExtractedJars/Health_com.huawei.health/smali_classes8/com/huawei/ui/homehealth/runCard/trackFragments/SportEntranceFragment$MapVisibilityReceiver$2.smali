.class Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$MapVisibilityReceiver$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$MapVisibilityReceiver;->onReceive(Landroid/content/Context;Landroid/content/Intent;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$MapVisibilityReceiver;


# direct methods
.method constructor <init>(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$MapVisibilityReceiver;)V
    .locals 0

    .line 1205
    iput-object p1, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$MapVisibilityReceiver$2;->d:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$MapVisibilityReceiver;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 1208
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 1209
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$MapVisibilityReceiver$2;->d:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$MapVisibilityReceiver;

    iget-object v0, v0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$MapVisibilityReceiver;->b:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->f(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;)I

    move-result v0

    if-nez v0, :cond_2

    .line 1210
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$MapVisibilityReceiver$2;->d:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$MapVisibilityReceiver;

    iget-object v0, v0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$MapVisibilityReceiver;->b:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->t(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1211
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$MapVisibilityReceiver$2;->d:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$MapVisibilityReceiver;

    iget-object v0, v0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$MapVisibilityReceiver;->b:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->k(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;)Lo/esg;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lo/esg;->d(II)V

    .line 1213
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$MapVisibilityReceiver$2;->d:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$MapVisibilityReceiver;

    iget-object v0, v0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$MapVisibilityReceiver;->b:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->b(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;)Landroid/widget/TextView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 1214
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$MapVisibilityReceiver$2;->d:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$MapVisibilityReceiver;

    iget-object v0, v0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$MapVisibilityReceiver;->b:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;

    const/16 v1, 0x102

    invoke-static {v0, v1}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->b(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;I)I

    .line 1215
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$MapVisibilityReceiver$2;->d:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$MapVisibilityReceiver;

    iget-object v0, v0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$MapVisibilityReceiver;->b:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->c(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;I)I

    .line 1216
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$MapVisibilityReceiver$2;->d:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$MapVisibilityReceiver;

    iget-object v0, v0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$MapVisibilityReceiver;->b:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->e(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;Z)Z

    .line 1218
    const-string v0, "sportType"

    const/16 v1, 0x102

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 1220
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$MapVisibilityReceiver$2;->d:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$MapVisibilityReceiver;

    iget-object v0, v0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$MapVisibilityReceiver;->b:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->k(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;)Lo/esg;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lo/esg;->d(II)V

    .line 1223
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$MapVisibilityReceiver$2;->d:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$MapVisibilityReceiver;

    iget-object v0, v0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$MapVisibilityReceiver;->b:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->b(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;)Landroid/widget/TextView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 1224
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$MapVisibilityReceiver$2;->d:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$MapVisibilityReceiver;

    iget-object v0, v0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$MapVisibilityReceiver;->b:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;

    const/16 v1, 0x108

    invoke-static {v0, v1}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->b(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;I)I

    .line 1225
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$MapVisibilityReceiver$2;->d:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$MapVisibilityReceiver;

    iget-object v0, v0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$MapVisibilityReceiver;->b:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->c(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;I)I

    .line 1226
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$MapVisibilityReceiver$2;->d:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$MapVisibilityReceiver;

    iget-object v0, v0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$MapVisibilityReceiver;->b:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->e(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;Z)Z

    .line 1227
    const-string v0, "sportType"

    const/16 v1, 0x108

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1230
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$MapVisibilityReceiver$2;->d:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$MapVisibilityReceiver;

    iget-object v0, v0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$MapVisibilityReceiver;->b:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->q(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 1231
    const-string v0, "click"

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1232
    sget-object v0, Lo/dae;->hp:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v4

    .line 1233
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$MapVisibilityReceiver$2;->d:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$MapVisibilityReceiver;

    iget-object v1, v1, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$MapVisibilityReceiver;->b:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;

    invoke-static {v1}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->d(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;)Landroid/content/Context;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v4, v3, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 1235
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$MapVisibilityReceiver$2;->d:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$MapVisibilityReceiver;

    iget-object v0, v0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$MapVisibilityReceiver;->b:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->d(Z)V

    .line 1236
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$MapVisibilityReceiver$2;->d:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$MapVisibilityReceiver;

    iget-object v0, v0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$MapVisibilityReceiver;->b:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;

    const-string v1, "MapVisibilityReceiver"

    invoke-static {v0, v1}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->b(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;Ljava/lang/String;)V

    .line 1237
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$MapVisibilityReceiver$2;->d:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$MapVisibilityReceiver;

    iget-object v0, v0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$MapVisibilityReceiver;->b:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->d(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;)Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$MapVisibilityReceiver$2;->d:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$MapVisibilityReceiver;

    iget-object v1, v1, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment$MapVisibilityReceiver;->b:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;

    invoke-static {v1}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;->i(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportEntranceFragment;)I

    move-result v1

    invoke-static {v0, v1}, Lo/ets;->d(Landroid/content/Context;I)V

    .line 1239
    :cond_2
    return-void
.end method
