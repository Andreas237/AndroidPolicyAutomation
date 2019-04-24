.class Lcom/huawei/ui/homewear21/home/WearHomeActivity$29$1$2;
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
.field final synthetic a:Lcom/huawei/ui/homewear21/home/WearHomeActivity$29$1;

.field final synthetic b:Ljava/util/Map;


# direct methods
.method constructor <init>(Lcom/huawei/ui/homewear21/home/WearHomeActivity$29$1;Ljava/util/Map;)V
    .locals 0

    .line 3205
    iput-object p1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$29$1$2;->a:Lcom/huawei/ui/homewear21/home/WearHomeActivity$29$1;

    iput-object p2, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$29$1$2;->b:Ljava/util/Map;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 3208
    const-string v0, "WearHomeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "GPS file cancel click"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3209
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$29$1$2;->a:Lcom/huawei/ui/homewear21/home/WearHomeActivity$29$1;

    iget-object v0, v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$29$1;->a:Landroid/widget/CompoundButton;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 3210
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$29$1$2;->b:Ljava/util/Map;

    const-string v1, "click"

    const-string v2, "0"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 3211
    return-void
.end method
