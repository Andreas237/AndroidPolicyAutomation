.class Lcom/huawei/ui/homewear21/home/WearHomeActivity$29$1$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/homewear21/home/WearHomeActivity$29$1;->onClick(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/util/Map;

.field final synthetic e:Lcom/huawei/ui/homewear21/home/WearHomeActivity$29$1;


# direct methods
.method constructor <init>(Lcom/huawei/ui/homewear21/home/WearHomeActivity$29$1;Ljava/util/Map;)V
    .locals 0

    .line 3196
    iput-object p1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$29$1$1;->e:Lcom/huawei/ui/homewear21/home/WearHomeActivity$29$1;

    iput-object p2, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$29$1$1;->a:Ljava/util/Map;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 3200
    const-string v0, "WearHomeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "GPS file ok click"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3201
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dqi;->b(Landroid/content/Context;)Lo/dqi;

    move-result-object v0

    const-string v1, "1"

    invoke-virtual {v0, v1}, Lo/dqi;->g(Ljava/lang/String;)V

    .line 3202
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$29$1$1;->a:Ljava/util/Map;

    const-string v1, "click"

    const-string v2, "1"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 3203
    return-void
.end method
