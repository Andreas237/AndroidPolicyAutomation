.class Lcom/huawei/ui/homehealth/runCard/trackFragments/SportNounExplainFragment$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/ExpandableListView$OnGroupClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/homehealth/runCard/trackFragments/SportNounExplainFragment;->b()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportNounExplainFragment;


# direct methods
.method constructor <init>(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportNounExplainFragment;)V
    .locals 0

    .line 103
    iput-object p1, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportNounExplainFragment$2;->a:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportNounExplainFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onGroupClick(Landroid/widget/ExpandableListView;Landroid/view/View;IJ)Z
    .locals 5

    .line 107
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportNounExplainFragment$2;->a:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportNounExplainFragment;

    invoke-static {v0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportNounExplainFragment;->c(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportNounExplainFragment;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/esj;

    .line 108
    if-nez v4, :cond_0

    .line 109
    const-string v0, "SportNounExplainFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "groupData is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 110
    const/4 v0, 0x1

    return v0

    .line 113
    :cond_0
    const-string v0, "SportNounExplainFragment"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "groupPosition: "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " size: "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportNounExplainFragment$2;->a:Lcom/huawei/ui/homehealth/runCard/trackFragments/SportNounExplainFragment;

    invoke-static {v2}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportNounExplainFragment;->c(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportNounExplainFragment;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo/esj;

    invoke-virtual {v2}, Lo/esj;->d()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 115
    const/4 v0, 0x0

    return v0
.end method
